package nc.impl.wsh.zkdwx.zkdwxmaster;

import java.util.Map;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.UUID;
import java.lang.String;
import java.util.stream.Stream;
import nc.vo.pub.lang.UFDateTime;
import nc.uap.utils.InSQLCreator;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.beanutils.PropertyUtils;


import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.VOStatus;
import nc.codeplatform.framework.service.ServiceSupport;


import nc.vo.zkdwx.zkdwx.ZkdwxMasterVO;
import nc.vo.zkdwx.zkdwx.ZkdwxSlave0VO;
import nc.vo.zkdwx.zkdwx.AggZkdwxMasterVO;
import nc.itf.wsh.zkdwx.zkdwxmaster.IZkdwxMasterVOService;


import nc.bs.framework.common.InvocationInfoProxy;
import nccloud.framework.core.exception.ExceptionUtils;

public class  ZkdwxMasterVOServiceImpl extends ServiceSupport implements IZkdwxMasterVOService {


	@Override
	public AggZkdwxMasterVO[] listAggZkdwxMasterVOByPk(String...pks) throws BusinessException{
		return listAggZkdwxMasterVOByPk(false,pks);
	}

	@Override
	public AggZkdwxMasterVO[] listAggZkdwxMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException{
		return dao.listByPksWithOrder(AggZkdwxMasterVO.class,pks,blazyLoad);
	}

	@Override
	public AggZkdwxMasterVO findAggZkdwxMasterVOByPk(String pk) throws BusinessException{
		return dao.findByPk(AggZkdwxMasterVO.class, pk, false);
	}

	@Override
	public  AggZkdwxMasterVO[] listAggZkdwxMasterVOByCondition(String condition) throws BusinessException{
		return listAggZkdwxMasterVOByCondition(condition,new String[]{"pk_zkdwxmaster"});
	}
	@Override
	public  AggZkdwxMasterVO[] listAggZkdwxMasterVOByCondition(String condition,String[] orderPath) throws BusinessException{
		return dao.listByCondition(AggZkdwxMasterVO.class, condition, false,false,orderPath);
	}
	@Override
	public ZkdwxMasterVO[] listZkdwxMasterVOByPk(String... pks) throws BusinessException{
		return dao.listByPk(ZkdwxMasterVO.class, pks, true);
	}

	@Override
	public  ZkdwxMasterVO findZkdwxMasterVOByPk(String pk) throws BusinessException{
		return dao.findByPk(ZkdwxMasterVO.class, pk, true);
	}

	@Override
	public  ZkdwxMasterVO[] listZkdwxMasterVOByCondition(String condition) throws BusinessException{
		return listZkdwxMasterVOByCondition(condition,new String[]{"pk_zkdwxmaster"});
	}
	@Override
	public  ZkdwxMasterVO[] listZkdwxMasterVOByCondition(String condition,String[] orderPath) throws BusinessException{
		return dao.listByCondition(ZkdwxMasterVO.class, condition, false,false,orderPath);
	}

	@Override
	public String[] listZkdwxMasterVOPkByCond(String condition) throws BusinessException{
		return listZkdwxMasterVOPkByCond(condition,new String[]{"pk_zkdwxmaster"});
	}
	@Override
	public String[] listZkdwxMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException{
		if(StringUtils.isEmpty(condition)) {
			condition = " 1 = 1 ";
		}
		StringBuilder sql = new StringBuilder();
		sql.append(" select pk_zkdwxmaster from ").append(ZkdwxMasterVO.getDefaultTableName());
		sql.append(" where ").append(condition);
		if (ArrayUtils.isNotEmpty(orderPath)) {
			sql.append(" order by ").append(StringUtils.join(orderPath, ", "));
		}
		return (String[]) dao.getBaseDAO().executeQuery(sql.toString(), (rs) -> {
			List<String> pks = new ArrayList<>();
			while (rs.next()) {
				pks.add(rs.getString(1));
			}
			return pks.toArray(new String[0]);
		});
	}
	@Override
	public void initDefaultData(ZkdwxMasterVO vo){
		if(vo.getAttributeValue("pk_group") == null){
			vo.setAttributeValue("pk_group",InvocationInfoProxy.getInstance().getGroupId());
		}
		if(vo.getAttributeValue("maketime") == null){
			vo.setAttributeValue("maketime",new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));
		}
	}
	@Override
	public AggZkdwxMasterVO preAddAggZkdwxMasterVO(AggZkdwxMasterVO vo,Map<String,Object> userJson) throws BusinessException{

		getMainVO(vo).setStatus(VOStatus.NEW);
		initDefaultData((ZkdwxMasterVO)getMainVO(vo));

		//下面这段要判断是否是树表界面插件
		Map<String,String> data = userJson!=null && userJson.get("data") != null?(Map<String,String>)userJson.get("data"):null;
		if(data!=null && data.size()>0){
			String parentKey = data.get("parentKey");
			String parentPk = data.get("parentPk");
			getMainVO(vo).setAttributeValue(parentKey,parentPk);
		}


		return vo;
	}
	@Override
	public AggZkdwxMasterVO preAddAggZkdwxMasterVO(Map<String,Object> userJson) throws BusinessException{
		AggZkdwxMasterVO result = null;

		ZkdwxMasterVO mainvo = new ZkdwxMasterVO();
		//设置默认值
		initDefaultData(mainvo);
		AggZkdwxMasterVO aggvo = new AggZkdwxMasterVO();
		aggvo.setParent(mainvo);
		result = aggvo;
		return preAddAggZkdwxMasterVO(result,userJson);
	}

	@Override
	public AggZkdwxMasterVO preEditAggZkdwxMasterVO(String pk) throws BusinessException{
		return dao.findByPk(AggZkdwxMasterVO.class, pk, false);
	}

	@Override
	public AggZkdwxMasterVO copyAggZkdwxMasterVO(String pk) throws BusinessException{

		AggZkdwxMasterVO vo = dao.findByPk(AggZkdwxMasterVO.class, pk, false);

		getMainVO(vo).setPrimaryKey(null);
		getMainVO(vo).setStatus(VOStatus.NEW);

		getMainVO(vo).setAttributeValue("srcbilltype",null);
		getMainVO(vo).setAttributeValue("srcbillid",null);

		getMainVO(vo).setAttributeValue("code",null);
		getMainVO(vo).setAttributeValue("",null);
		getMainVO(vo).setAttributeValue("",null);
		getMainVO(vo).setAttributeValue("maketime", new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));

		ZkdwxSlave0VO[] zkdwxSlave0VOs = (ZkdwxSlave0VO[])vo.getChildren(ZkdwxSlave0VO.class);
		if(zkdwxSlave0VOs!=null && zkdwxSlave0VOs.length>0){
			Arrays.stream(zkdwxSlave0VOs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
				subvo.setAttributeValue("rowno", null);
				subvo.setAttributeValue("srcrowno", null);
			});
		}
		return vo;
	}
	@Override
	public AggZkdwxMasterVO[] saveAggZkdwxMasterVO(AggZkdwxMasterVO vo) throws BusinessException{
		String pk = getVOPrimaryKey(vo);
		setDefaultVal(vo);
		if(StringUtils.isEmpty(pk)){
			return dao.insert(vo); //插入
		}else{
			return dao.update(vo); //更新
		}
	}
	/**
	 * 保存前设置审计信息
	 * @param vos
	 */
	private void setAuditInfo(AggZkdwxMasterVO... vos) throws BusinessException {
		if(ArrayUtils.isNotEmpty(vos)) {
			UFDateTime now = new UFDateTime();
			for(AggZkdwxMasterVO vo : vos) {
				String pk = getVOPrimaryKey(vo);
				if(StringUtils.isEmpty(pk)){
					//设置创建人创建时间
					getMainVO(vo).setAttributeValue("creator",InvocationInfoProxy.getInstance().getUserId());
					getMainVO(vo).setAttributeValue("creationtime",now);
					getMainVO(vo).setAttributeValue("maketime",now);
					getMainVO(vo).setAttributeValue("modifier",null);
					getMainVO(vo).setAttributeValue("modifiedtime",null);
				}else{
					//设置修改人修改时间
					getMainVO(vo).setAttributeValue("modifier",InvocationInfoProxy.getInstance().getUserId());
					getMainVO(vo).setAttributeValue("modifiedtime",now);
					getMainVO(vo).setAttributeValue("lastmaketime",now);
				}
			}
		}
	}
	/**
	 * 保存前处理一些默认值
	 * @param vos
	 */
	private void setDefaultVal(AggZkdwxMasterVO... vos) throws BusinessException {
		setAuditInfo(vos);
		//其他默认值处理
	}

	// 给单表（行编辑表）单独适配
	@Override
	public AggZkdwxMasterVO[] saveAggZkdwxMasterVO(AggZkdwxMasterVO[] vos) throws BusinessException {
		if (ArrayUtils.isEmpty(vos)) {
			return new AggZkdwxMasterVO[0];
		}
		setDefaultVal(vos); // 设置默认值
		return dao.save(vos,true);
	}

	@Override
	public AggZkdwxMasterVO[] deleteAggZkdwxMasterVOs(Map<String,String> tsMap) throws BusinessException{
		AggZkdwxMasterVO[] vos = dao.listByPk(AggZkdwxMasterVO.class,tsMap.keySet().toArray(new String[0]));
		validate(vos,tsMap);
		dao.delete(vos,true);
		return vos;
	}
	
	//校验  包括ts校验  已提交校验
	private void validate(AggZkdwxMasterVO[] vos,Map<String,String> tsMap) throws BusinessException{

		Boolean isPass = true;
		String error = "";    //错误信息
		if(ArrayUtils.isEmpty(vos)){
			isPass = false;
		}
		
		for(int i = 0 ; i < vos.length ; i++){
			SuperVO mainvo = vos[i].getParentVO();
			UFDateTime ts = (UFDateTime)mainvo.getAttributeValue("ts");
			if(!StringUtils.equals(tsMap.get(mainvo.getPrimaryKey()),ts.toString())){
				isPass = false;
				break;
			}
		}
		if(!isPass) {
			throw new BusinessException("您操作的数据已被他人修改或删除，请刷新后重试！");
		}
		if(!"".equals(error)){
			throw new BusinessException(error);
		}
	}
	
	@Override
	public <T> T[] loadTreeData(Class<T> clazz,Map<String,Object> userJson) throws BusinessException{
		String condition = "dr = 0 ";
		return dao.listByCondition(clazz, condition, false);
	}

	@Override
	public String[] queryChildPksByParentId(Class childClazz, String parentId) throws BusinessException{
		String cond = " pk_zkdwxmaster = '" + parentId + "' ";
		SuperVO[] vos  = (SuperVO[]) dao.listByCondition(childClazz, cond, false);
		if (vos == null || vos.length == 0) {
			return new String[0];
		}
		return Stream.of(vos).map(vo -> vo.getPrimaryKey()).toArray(String[]::new);
	}


	public SuperVO[] queryChildVOByPks(Class childClazz, String[] pks) throws BusinessException{
		return (SuperVO[]) dao.listByPk(childClazz, pks, false);
	}

}
