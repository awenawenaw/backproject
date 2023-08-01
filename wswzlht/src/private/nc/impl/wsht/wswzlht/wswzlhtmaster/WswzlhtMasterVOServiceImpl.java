package nc.impl.wsht.wswzlht.wswzlhtmaster;

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

import nc.pub.billcode.vo.BillCodeContext;

import nc.vo.wsht.wswzlht.wswzlhtJhskxx;
import nc.vo.wsht.wswzlht.wswzlhtSjfkxx;
import nc.vo.wsht.wswzlht.wswzlhtHtwbxx;
import nc.vo.wsht.wswzlht.wswzlhtJhfkxx;
import nc.vo.wsht.wswzlht.wswzlhtYsxx;
import nc.vo.wsht.wswzlht.wswzlhtSjskxx;
import nc.vo.wsht.wswzlht.wswzlhtXdfxx;
import nc.vo.wsht.wswzlht.wswzlhtXmxx;
import nc.vo.wsht.wswzlht.WswzlhtMasterVO;
import nc.vo.wsht.wswzlht.AggWswzlhtMasterVO;
import nc.itf.wsht.wswzlht.wswzlhtmaster.IWswzlhtMasterVOService;


import nc.bs.framework.common.InvocationInfoProxy;
import nccloud.framework.core.exception.ExceptionUtils;

public class  WswzlhtMasterVOServiceImpl extends ServiceSupport implements IWswzlhtMasterVOService {


	@Override
	public AggWswzlhtMasterVO[] listAggWswzlhtMasterVOByPk(String...pks) throws BusinessException{
		return listAggWswzlhtMasterVOByPk(false,pks);
	}

	@Override
	public AggWswzlhtMasterVO[] listAggWswzlhtMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException{
		return dao.listByPksWithOrder(AggWswzlhtMasterVO.class,pks,blazyLoad);
	}

	@Override
	public AggWswzlhtMasterVO findAggWswzlhtMasterVOByPk(String pk) throws BusinessException{
		return dao.findByPk(AggWswzlhtMasterVO.class, pk, false);
	}

	@Override
	public  AggWswzlhtMasterVO[] listAggWswzlhtMasterVOByCondition(String condition) throws BusinessException{
		return listAggWswzlhtMasterVOByCondition(condition,new String[]{"pk_wswzlhtmaster"});
	}
	@Override
	public  AggWswzlhtMasterVO[] listAggWswzlhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException{
		return dao.listByCondition(AggWswzlhtMasterVO.class, condition, false,false,orderPath);
	}
	@Override
	public WswzlhtMasterVO[] listWswzlhtMasterVOByPk(String... pks) throws BusinessException{
		return dao.listByPk(WswzlhtMasterVO.class, pks, true);
	}

	@Override
	public  WswzlhtMasterVO findWswzlhtMasterVOByPk(String pk) throws BusinessException{
		return dao.findByPk(WswzlhtMasterVO.class, pk, true);
	}

	@Override
	public  WswzlhtMasterVO[] listWswzlhtMasterVOByCondition(String condition) throws BusinessException{
		return listWswzlhtMasterVOByCondition(condition,new String[]{"pk_wswzlhtmaster"});
	}
	@Override
	public  WswzlhtMasterVO[] listWswzlhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException{
		return dao.listByCondition(WswzlhtMasterVO.class, condition, false,false,orderPath);
	}

	@Override
	public String[] listWswzlhtMasterVOPkByCond(String condition) throws BusinessException{
		return listWswzlhtMasterVOPkByCond(condition,new String[]{"pk_wswzlhtmaster"});
	}
	@Override
	public String[] listWswzlhtMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException{
		if(StringUtils.isEmpty(condition)) {
			condition = " 1 = 1 ";
		}
		StringBuilder sql = new StringBuilder();
		sql.append(" select pk_wswzlhtmaster from ").append(WswzlhtMasterVO.getDefaultTableName());
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
	public void initDefaultData(WswzlhtMasterVO vo){
		if(vo.getAttributeValue("pk_group") == null){
			vo.setAttributeValue("pk_group",InvocationInfoProxy.getInstance().getGroupId());
		}
		if(vo.getAttributeValue("maketime") == null){
			vo.setAttributeValue("maketime",new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));
		}
	}
	@Override
	public AggWswzlhtMasterVO preAddAggWswzlhtMasterVO(AggWswzlhtMasterVO vo,Map<String,Object> userJson) throws BusinessException{

		getMainVO(vo).setStatus(VOStatus.NEW);
		initDefaultData((WswzlhtMasterVO)getMainVO(vo));

		//下面这段要判断是否是树表界面插件
		Map<String,String> data = userJson!=null && userJson.get("data") != null?(Map<String,String>)userJson.get("data"):null;
		if(data!=null && data.size()>0){
			String parentKey = data.get("parentKey");
			String parentPk = data.get("parentPk");
			getMainVO(vo).setAttributeValue(parentKey,parentPk);
		}

		//编码规则生成vo的编码
		BillCodeContext billCodeContext = getBillCodeContext("wshtwswzlht");
		if(billCodeContext == null){
			throw new BusinessException("当前编码规则不存在，请到【编码规则定义-全局】节点检查是否存在"+"wshtwswzlht");
		}
		if(billCodeContext.isPrecode()){
			String pk_group = InvocationInfoProxy.getInstance().getGroupId();
			String code = getBillcodeManage().getPreBillCode_RequiresNew("wshtwswzlht", pk_group, pk_group);
			getMainVO(vo).setAttributeValue("code",code);
		}

		return vo;
	}
	@Override
	public AggWswzlhtMasterVO preAddAggWswzlhtMasterVO(Map<String,Object> userJson) throws BusinessException{
		AggWswzlhtMasterVO result = null;

		WswzlhtMasterVO mainvo = new WswzlhtMasterVO();
		//设置默认值
		initDefaultData(mainvo);
		AggWswzlhtMasterVO aggvo = new AggWswzlhtMasterVO();
		aggvo.setParent(mainvo);
		result = aggvo;
		return preAddAggWswzlhtMasterVO(result,userJson);
	}

	@Override
	public AggWswzlhtMasterVO preEditAggWswzlhtMasterVO(String pk) throws BusinessException{
		return dao.findByPk(AggWswzlhtMasterVO.class, pk, false);
	}

	@Override
	public AggWswzlhtMasterVO copyAggWswzlhtMasterVO(String pk) throws BusinessException{

		AggWswzlhtMasterVO vo = dao.findByPk(AggWswzlhtMasterVO.class, pk, false);

		getMainVO(vo).setPrimaryKey(null);
		getMainVO(vo).setStatus(VOStatus.NEW);

		getMainVO(vo).setAttributeValue("srcbilltype",null);
		getMainVO(vo).setAttributeValue("srcbillid",null);

		getMainVO(vo).setAttributeValue("code",null);
		getMainVO(vo).setAttributeValue("",null);
		getMainVO(vo).setAttributeValue("",null);
		//编码规则生成vo的编码
		BillCodeContext billCodeContext = getBillCodeContext("wshtwswzlht");
		if(billCodeContext == null){
			throw new BusinessException("当前编码规则不存在，请到【编码规则定义-全局】节点检查是否存在"+"wshtwswzlht");
		}
		if(billCodeContext.isPrecode()){
			String pk_group = InvocationInfoProxy.getInstance().getGroupId();
			String code = getBillcodeManage().getPreBillCode_RequiresNew("wshtwswzlht", pk_group, pk_group);
			getMainVO(vo).setAttributeValue("code",code);
		}
		getMainVO(vo).setAttributeValue("maketime", new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));

		wswzlhtXdfxx[] wswzlhtXdfxxs = (wswzlhtXdfxx[])vo.getChildren(wswzlhtXdfxx.class);
		if(wswzlhtXdfxxs!=null && wswzlhtXdfxxs.length>0){
			Arrays.stream(wswzlhtXdfxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
				subvo.setAttributeValue("rowno", null);
				subvo.setAttributeValue("srcrowno", null);
			});
		}
		wswzlhtXmxx[] wswzlhtXmxxs = (wswzlhtXmxx[])vo.getChildren(wswzlhtXmxx.class);
		if(wswzlhtXmxxs!=null && wswzlhtXmxxs.length>0){
			Arrays.stream(wswzlhtXmxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		wswzlhtYsxx[] wswzlhtYsxxs = (wswzlhtYsxx[])vo.getChildren(wswzlhtYsxx.class);
		if(wswzlhtYsxxs!=null && wswzlhtYsxxs.length>0){
			Arrays.stream(wswzlhtYsxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		wswzlhtJhskxx[] wswzlhtJhskxxs = (wswzlhtJhskxx[])vo.getChildren(wswzlhtJhskxx.class);
		if(wswzlhtJhskxxs!=null && wswzlhtJhskxxs.length>0){
			Arrays.stream(wswzlhtJhskxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		wswzlhtSjskxx[] wswzlhtSjskxxs = (wswzlhtSjskxx[])vo.getChildren(wswzlhtSjskxx.class);
		if(wswzlhtSjskxxs!=null && wswzlhtSjskxxs.length>0){
			Arrays.stream(wswzlhtSjskxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		wswzlhtJhfkxx[] wswzlhtJhfkxxs = (wswzlhtJhfkxx[])vo.getChildren(wswzlhtJhfkxx.class);
		if(wswzlhtJhfkxxs!=null && wswzlhtJhfkxxs.length>0){
			Arrays.stream(wswzlhtJhfkxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		wswzlhtSjfkxx[] wswzlhtSjfkxxs = (wswzlhtSjfkxx[])vo.getChildren(wswzlhtSjfkxx.class);
		if(wswzlhtSjfkxxs!=null && wswzlhtSjfkxxs.length>0){
			Arrays.stream(wswzlhtSjfkxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		wswzlhtHtwbxx[] wswzlhtHtwbxxs = (wswzlhtHtwbxx[])vo.getChildren(wswzlhtHtwbxx.class);
		if(wswzlhtHtwbxxs!=null && wswzlhtHtwbxxs.length>0){
			Arrays.stream(wswzlhtHtwbxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		return vo;
	}
	@Override
	public AggWswzlhtMasterVO[] saveAggWswzlhtMasterVO(AggWswzlhtMasterVO vo) throws BusinessException{
		String pk = getVOPrimaryKey(vo);
		setDefaultVal(vo);
		if(StringUtils.isEmpty(pk)){
			return dao.insert(vo); //插入
		}else{
			return dao.update(vo); //更新
		}
	}
	/**
	 * 保存前处理编码规则
	 * @param vos
	 */
	private void setBillCode(AggWswzlhtMasterVO... vos) throws BusinessException {
		if(ArrayUtils.isNotEmpty(vos)) {
			for(AggWswzlhtMasterVO vo : vos) {
				String pk = getVOPrimaryKey(vo);
				if(StringUtils.isEmpty(pk)){
					BillCodeContext billCodeContext = getBillCodeContext("wshtwswzlht");
					String pk_group = InvocationInfoProxy.getInstance().getGroupId();
					if(billCodeContext!=null && !billCodeContext.isPrecode()){
						if(getMainVO(vo).getAttributeValue("code") == null){
							String code = getBillcodeManage().getBillCode_RequiresNew("wshtwswzlht", pk_group, pk_group, getMainVO(vo));
							getMainVO(vo).setAttributeValue("code",code);
						}
					} else {
						String code = (String) getMainVO(vo).getAttributeValue("code");
						getBillcodeManage().commitPreBillCode("wshtwswzlht", pk_group, pk_group, code);
					}
				}
			}
		}
	}
	/**
	 * 保存前设置审计信息
	 * @param vos
	 */
	private void setAuditInfo(AggWswzlhtMasterVO... vos) throws BusinessException {
		if(ArrayUtils.isNotEmpty(vos)) {
			UFDateTime now = new UFDateTime();
			for(AggWswzlhtMasterVO vo : vos) {
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
	private void setDefaultVal(AggWswzlhtMasterVO... vos) throws BusinessException {
		setBillCode(vos);
		setAuditInfo(vos);
		//其他默认值处理
	}

	// 给单表（行编辑表）单独适配
	@Override
	public AggWswzlhtMasterVO[] saveAggWswzlhtMasterVO(AggWswzlhtMasterVO[] vos) throws BusinessException {
		if (ArrayUtils.isEmpty(vos)) {
			return new AggWswzlhtMasterVO[0];
		}
		setDefaultVal(vos); // 设置默认值
		List<String> pks = Arrays.stream(vos).filter(v -> getMainVO(v).getStatus() == VOStatus.DELETED)
				.map(v -> getMainVO(v).getPrimaryKey()).collect(Collectors.toList()); // 删除单据主键
		if (pks == null || pks.size() == 0) {
			return dao.save(vos, true);
		}
		AggWswzlhtMasterVO[] deleteVOs = dao.listByPk(AggWswzlhtMasterVO.class, pks.toArray(new String[0]));
		for (int i = 0; i < deleteVOs.length; i++) {
			SuperVO mainVO = getMainVO(deleteVOs[i]);
			// 删除单据时回退单据号
			String code = (String)mainVO.getAttributeValue("code");
			if (StringUtils.isNotEmpty(code)) {
				String pk_group = InvocationInfoProxy.getInstance().getGroupId();
				getBillcodeManage().returnBillCodeOnDelete("wshtwswzlht", pk_group, pk_group, code, deleteVOs[i]);
			}
		}
		return dao.save(vos,true);
	}

	@Override
	public AggWswzlhtMasterVO[] deleteAggWswzlhtMasterVOs(Map<String,String> tsMap) throws BusinessException{
		AggWswzlhtMasterVO[] vos = dao.listByPk(AggWswzlhtMasterVO.class,tsMap.keySet().toArray(new String[0]));
		validate(vos,tsMap);
		String pk_group = InvocationInfoProxy.getInstance().getGroupId();
		Arrays.stream(vos).forEach(vo->{
			String code = (String)getMainVO(vo).getAttributeValue("code");
			try {
				getBillcodeManage().returnBillCodeOnDelete("wshtwswzlht",pk_group,pk_group,code,vo);
			} catch (BusinessException e) {
				ExceptionUtils.wrapException(e.getMessage(),e);
			}
		});
		dao.delete(vos,true);
		return vos;
	}
	
	//校验  包括ts校验  已提交校验
	private void validate(AggWswzlhtMasterVO[] vos,Map<String,String> tsMap) throws BusinessException{

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
		String cond = " pk_wswzlhtmaster = '" + parentId + "' ";
		SuperVO[] vos  = (SuperVO[]) dao.listByCondition(childClazz, cond, false);
		if (vos == null || vos.length == 0) {
			return new String[0];
		}
		return Stream.of(vos).map(vo -> vo.getPrimaryKey()).toArray(String[]::new);
	}


	public SuperVO[] queryChildVOByPks(Class childClazz, String[] pks) throws BusinessException{
		return (SuperVO[]) dao.listByPk(childClazz, pks, false);
	}


	@Override
	public BillCodeContext getBillCodeContext(String coderuleid) throws BusinessException{
		return super.getBillCodeContext(coderuleid);
	}

	@Override
	public BillCodeContext getBillCodeContext(String coderuleid, String pkgroup, String pkorg) throws BusinessException{
		return super.getBillCodeContext(coderuleid,pkgroup,pkorg);
	}
}
