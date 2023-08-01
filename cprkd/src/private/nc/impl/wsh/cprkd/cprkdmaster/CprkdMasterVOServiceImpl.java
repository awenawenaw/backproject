package nc.impl.wsh.cprkd.cprkdmaster;

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


import nc.vo.cprkd.cprkd.CprkdMasterVO;
import nc.vo.cprkd.cprkd.AggCprkdMasterVO;
import nc.itf.wsh.cprkd.cprkdmaster.ICprkdMasterVOService;


import nc.bs.framework.common.InvocationInfoProxy;
import nccloud.framework.core.exception.ExceptionUtils;

public class  CprkdMasterVOServiceImpl extends ServiceSupport implements ICprkdMasterVOService {


	@Override
	public AggCprkdMasterVO[] listAggCprkdMasterVOByPk(String...pks) throws BusinessException{
		return listAggCprkdMasterVOByPk(false,pks);
	}

	@Override
	public AggCprkdMasterVO[] listAggCprkdMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException{
		return dao.listByPksWithOrder(AggCprkdMasterVO.class,pks,blazyLoad);
	}

	@Override
	public AggCprkdMasterVO findAggCprkdMasterVOByPk(String pk) throws BusinessException{
		return dao.findByPk(AggCprkdMasterVO.class, pk, false);
	}

	@Override
	public  AggCprkdMasterVO[] listAggCprkdMasterVOByCondition(String condition) throws BusinessException{
		return listAggCprkdMasterVOByCondition(condition,new String[]{"pk_cprkdmaster"});
	}
	@Override
	public  AggCprkdMasterVO[] listAggCprkdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException{
		return dao.listByCondition(AggCprkdMasterVO.class, condition, false,false,orderPath);
	}
	@Override
	public CprkdMasterVO[] listCprkdMasterVOByPk(String... pks) throws BusinessException{
		return dao.listByPk(CprkdMasterVO.class, pks, true);
	}

	@Override
	public  CprkdMasterVO findCprkdMasterVOByPk(String pk) throws BusinessException{
		return dao.findByPk(CprkdMasterVO.class, pk, true);
	}

	@Override
	public  CprkdMasterVO[] listCprkdMasterVOByCondition(String condition) throws BusinessException{
		return listCprkdMasterVOByCondition(condition,new String[]{"pk_cprkdmaster"});
	}
	@Override
	public  CprkdMasterVO[] listCprkdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException{
		return dao.listByCondition(CprkdMasterVO.class, condition, false,false,orderPath);
	}

	@Override
	public String[] listCprkdMasterVOPkByCond(String condition) throws BusinessException{
		return listCprkdMasterVOPkByCond(condition,new String[]{"pk_cprkdmaster"});
	}
	@Override
	public String[] listCprkdMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException{
		if(StringUtils.isEmpty(condition)) {
			condition = " 1 = 1 ";
		}
		StringBuilder sql = new StringBuilder();
		sql.append(" select pk_cprkdmaster from ").append(CprkdMasterVO.getDefaultTableName());
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
	public void initDefaultData(CprkdMasterVO vo){
		if(vo.getAttributeValue("pk_group") == null){
			vo.setAttributeValue("pk_group",InvocationInfoProxy.getInstance().getGroupId());
		}
		if(vo.getAttributeValue("maketime") == null){
			vo.setAttributeValue("maketime",new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));
		}
	}
	@Override
	public AggCprkdMasterVO preAddAggCprkdMasterVO(AggCprkdMasterVO vo,Map<String,Object> userJson) throws BusinessException{

		getMainVO(vo).setStatus(VOStatus.NEW);
		initDefaultData((CprkdMasterVO)getMainVO(vo));

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
	public AggCprkdMasterVO preAddAggCprkdMasterVO(Map<String,Object> userJson) throws BusinessException{
		AggCprkdMasterVO result = null;

		CprkdMasterVO mainvo = new CprkdMasterVO();
		//设置默认值
		initDefaultData(mainvo);
		AggCprkdMasterVO aggvo = new AggCprkdMasterVO();
		aggvo.setParent(mainvo);
		result = aggvo;
		return preAddAggCprkdMasterVO(result,userJson);
	}

	@Override
	public AggCprkdMasterVO preEditAggCprkdMasterVO(String pk) throws BusinessException{
		return dao.findByPk(AggCprkdMasterVO.class, pk, false);
	}

	@Override
	public AggCprkdMasterVO copyAggCprkdMasterVO(String pk) throws BusinessException{

		AggCprkdMasterVO vo = dao.findByPk(AggCprkdMasterVO.class, pk, false);

		getMainVO(vo).setPrimaryKey(null);
		getMainVO(vo).setStatus(VOStatus.NEW);

		getMainVO(vo).setAttributeValue("srcbilltype",null);
		getMainVO(vo).setAttributeValue("srcbillid",null);

		getMainVO(vo).setAttributeValue("code",null);
		getMainVO(vo).setAttributeValue("",null);
		getMainVO(vo).setAttributeValue("name",null);
		getMainVO(vo).setAttributeValue("maketime", new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));

		return vo;
	}
	@Override
	public AggCprkdMasterVO[] saveAggCprkdMasterVO(AggCprkdMasterVO vo) throws BusinessException{
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
	private void setAuditInfo(AggCprkdMasterVO... vos) throws BusinessException {
		if(ArrayUtils.isNotEmpty(vos)) {
			UFDateTime now = new UFDateTime();
			for(AggCprkdMasterVO vo : vos) {
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
	private void setDefaultVal(AggCprkdMasterVO... vos) throws BusinessException {
		setAuditInfo(vos);
		//其他默认值处理
	}

	// 给单表（行编辑表）单独适配
	@Override
	public AggCprkdMasterVO[] saveAggCprkdMasterVO(AggCprkdMasterVO[] vos) throws BusinessException {
		if (ArrayUtils.isEmpty(vos)) {
			return new AggCprkdMasterVO[0];
		}
		setDefaultVal(vos); // 设置默认值
		return dao.save(vos,true);
	}

	@Override
	public AggCprkdMasterVO[] deleteAggCprkdMasterVOs(Map<String,String> tsMap) throws BusinessException{
		AggCprkdMasterVO[] vos = dao.listByPk(AggCprkdMasterVO.class,tsMap.keySet().toArray(new String[0]));
		validate(vos,tsMap);
		dao.delete(vos,true);
		return vos;
	}
	
	//校验  包括ts校验  已提交校验
	private void validate(AggCprkdMasterVO[] vos,Map<String,String> tsMap) throws BusinessException{

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
