package nc.impl.wsh.gxbg.gxbgmaster;

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


import nc.vo.gxbg.gxbg.GxbgMasterVO;
import nc.vo.gxbg.gxbg.AggGxbgMasterVO;
import nc.itf.wsh.gxbg.gxbgmaster.IGxbgMasterVOService;


import nc.bs.framework.common.InvocationInfoProxy;
import nccloud.framework.core.exception.ExceptionUtils;

public class  GxbgMasterVOServiceImpl extends ServiceSupport implements IGxbgMasterVOService {


	@Override
	public AggGxbgMasterVO[] listAggGxbgMasterVOByPk(String...pks) throws BusinessException{
		return listAggGxbgMasterVOByPk(false,pks);
	}

	@Override
	public AggGxbgMasterVO[] listAggGxbgMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException{
		return dao.listByPksWithOrder(AggGxbgMasterVO.class,pks,blazyLoad);
	}

	@Override
	public AggGxbgMasterVO findAggGxbgMasterVOByPk(String pk) throws BusinessException{
		return dao.findByPk(AggGxbgMasterVO.class, pk, false);
	}

	@Override
	public  AggGxbgMasterVO[] listAggGxbgMasterVOByCondition(String condition) throws BusinessException{
		return listAggGxbgMasterVOByCondition(condition,new String[]{"pk_gxbgmaster"});
	}
	@Override
	public  AggGxbgMasterVO[] listAggGxbgMasterVOByCondition(String condition,String[] orderPath) throws BusinessException{
		return dao.listByCondition(AggGxbgMasterVO.class, condition, false,false,orderPath);
	}
	@Override
	public GxbgMasterVO[] listGxbgMasterVOByPk(String... pks) throws BusinessException{
		return dao.listByPk(GxbgMasterVO.class, pks, true);
	}

	@Override
	public  GxbgMasterVO findGxbgMasterVOByPk(String pk) throws BusinessException{
		return dao.findByPk(GxbgMasterVO.class, pk, true);
	}

	@Override
	public  GxbgMasterVO[] listGxbgMasterVOByCondition(String condition) throws BusinessException{
		return listGxbgMasterVOByCondition(condition,new String[]{"pk_gxbgmaster"});
	}
	@Override
	public  GxbgMasterVO[] listGxbgMasterVOByCondition(String condition,String[] orderPath) throws BusinessException{
		return dao.listByCondition(GxbgMasterVO.class, condition, false,false,orderPath);
	}

	@Override
	public String[] listGxbgMasterVOPkByCond(String condition) throws BusinessException{
		return listGxbgMasterVOPkByCond(condition,new String[]{"pk_gxbgmaster"});
	}
	@Override
	public String[] listGxbgMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException{
		if(StringUtils.isEmpty(condition)) {
			condition = " 1 = 1 ";
		}
		StringBuilder sql = new StringBuilder();
		sql.append(" select pk_gxbgmaster from ").append(GxbgMasterVO.getDefaultTableName());
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
	public void initDefaultData(GxbgMasterVO vo){
		if(vo.getAttributeValue("pk_group") == null){
			vo.setAttributeValue("pk_group",InvocationInfoProxy.getInstance().getGroupId());
		}
		if(vo.getAttributeValue("maketime") == null){
			vo.setAttributeValue("maketime",new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));
		}
	}
	@Override
	public AggGxbgMasterVO preAddAggGxbgMasterVO(AggGxbgMasterVO vo,Map<String,Object> userJson) throws BusinessException{

		getMainVO(vo).setStatus(VOStatus.NEW);
		initDefaultData((GxbgMasterVO)getMainVO(vo));

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
	public AggGxbgMasterVO preAddAggGxbgMasterVO(Map<String,Object> userJson) throws BusinessException{
		AggGxbgMasterVO result = null;

		GxbgMasterVO mainvo = new GxbgMasterVO();
		//设置默认值
		initDefaultData(mainvo);
		AggGxbgMasterVO aggvo = new AggGxbgMasterVO();
		aggvo.setParent(mainvo);
		result = aggvo;
		return preAddAggGxbgMasterVO(result,userJson);
	}

	@Override
	public AggGxbgMasterVO preEditAggGxbgMasterVO(String pk) throws BusinessException{
		return dao.findByPk(AggGxbgMasterVO.class, pk, false);
	}

	@Override
	public AggGxbgMasterVO copyAggGxbgMasterVO(String pk) throws BusinessException{

		AggGxbgMasterVO vo = dao.findByPk(AggGxbgMasterVO.class, pk, false);

		getMainVO(vo).setPrimaryKey(null);
		getMainVO(vo).setStatus(VOStatus.NEW);

		getMainVO(vo).setAttributeValue("srcbilltype",null);
		getMainVO(vo).setAttributeValue("srcbillid",null);

		getMainVO(vo).setAttributeValue("code",null);
		getMainVO(vo).setAttributeValue("",null);
		getMainVO(vo).setAttributeValue("",null);
		getMainVO(vo).setAttributeValue("maketime", new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));

		return vo;
	}
	@Override
	public AggGxbgMasterVO[] saveAggGxbgMasterVO(AggGxbgMasterVO vo) throws BusinessException{
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
	private void setAuditInfo(AggGxbgMasterVO... vos) throws BusinessException {
		if(ArrayUtils.isNotEmpty(vos)) {
			UFDateTime now = new UFDateTime();
			for(AggGxbgMasterVO vo : vos) {
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
	private void setDefaultVal(AggGxbgMasterVO... vos) throws BusinessException {
		setAuditInfo(vos);
		//其他默认值处理
	}

	// 给单表（行编辑表）单独适配
	@Override
	public AggGxbgMasterVO[] saveAggGxbgMasterVO(AggGxbgMasterVO[] vos) throws BusinessException {
		if (ArrayUtils.isEmpty(vos)) {
			return new AggGxbgMasterVO[0];
		}
		setDefaultVal(vos); // 设置默认值
		return dao.save(vos,true);
	}

	@Override
	public AggGxbgMasterVO[] deleteAggGxbgMasterVOs(Map<String,String> tsMap) throws BusinessException{
		AggGxbgMasterVO[] vos = dao.listByPk(AggGxbgMasterVO.class,tsMap.keySet().toArray(new String[0]));
		validate(vos,tsMap);
		dao.delete(vos,true);
		return vos;
	}
	
	//校验  包括ts校验  已提交校验
	private void validate(AggGxbgMasterVO[] vos,Map<String,String> tsMap) throws BusinessException{

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


}
