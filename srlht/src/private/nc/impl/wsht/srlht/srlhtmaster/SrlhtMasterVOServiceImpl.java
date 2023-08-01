package nc.impl.wsht.srlht.srlhtmaster;

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

import nc.vo.srlht.srlht.SrlhtSjfkxx;
import nc.vo.srlht.srlht.SrlhtMasterVO;
import nc.vo.srlht.srlht.SrlhtYsxx;
import nc.vo.srlht.srlht.SrlhtJhskxx;
import nc.vo.srlht.srlht.SrlhtSjskxx;
import nc.vo.srlht.srlht.SrlhtJhfkxx;
import nc.vo.srlht.srlht.Htwbxx;
import nc.vo.srlht.srlht.SrlhtXdfxx;
import nc.vo.srlht.srlht.SrlhtXmxx;
import nc.vo.srlht.srlht.AggSrlhtMasterVO;
import nc.itf.wsht.srlht.srlhtmaster.ISrlhtMasterVOService;


import nc.vo.pub.pf.BillStatusEnum;
import nc.bs.framework.common.InvocationInfoProxy;
import nccloud.framework.core.exception.ExceptionUtils;

public class  SrlhtMasterVOServiceImpl extends ServiceSupport implements ISrlhtMasterVOService {


	@Override
	public AggSrlhtMasterVO[] listAggSrlhtMasterVOByPk(String...pks) throws BusinessException{
		return listAggSrlhtMasterVOByPk(false,pks);
	}

	@Override
	public AggSrlhtMasterVO[] listAggSrlhtMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException{
		return dao.listByPksWithOrder(AggSrlhtMasterVO.class,pks,blazyLoad);
	}

	@Override
	public AggSrlhtMasterVO findAggSrlhtMasterVOByPk(String pk) throws BusinessException{
		return dao.findByPk(AggSrlhtMasterVO.class, pk, false);
	}

	@Override
	public  AggSrlhtMasterVO[] listAggSrlhtMasterVOByCondition(String condition) throws BusinessException{
		return listAggSrlhtMasterVOByCondition(condition,new String[]{"pk_srlhtmaster"});
	}
	@Override
	public  AggSrlhtMasterVO[] listAggSrlhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException{
		return dao.listByCondition(AggSrlhtMasterVO.class, condition, false,false,orderPath);
	}
	@Override
	public SrlhtMasterVO[] listSrlhtMasterVOByPk(String... pks) throws BusinessException{
		return dao.listByPk(SrlhtMasterVO.class, pks, true);
	}

	@Override
	public  SrlhtMasterVO findSrlhtMasterVOByPk(String pk) throws BusinessException{
		return dao.findByPk(SrlhtMasterVO.class, pk, true);
	}

	@Override
	public  SrlhtMasterVO[] listSrlhtMasterVOByCondition(String condition) throws BusinessException{
		return listSrlhtMasterVOByCondition(condition,new String[]{"pk_srlhtmaster"});
	}
	@Override
	public  SrlhtMasterVO[] listSrlhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException{
		return dao.listByCondition(SrlhtMasterVO.class, condition, false,false,orderPath);
	}

	@Override
	public String[] listSrlhtMasterVOPkByCond(String condition) throws BusinessException{
		return listSrlhtMasterVOPkByCond(condition,new String[]{"pk_srlhtmaster"});
	}
	@Override
	public String[] listSrlhtMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException{
		if(StringUtils.isEmpty(condition)) {
			condition = " 1 = 1 ";
		}
		StringBuilder sql = new StringBuilder();
		sql.append(" select pk_srlhtmaster from ").append(SrlhtMasterVO.getDefaultTableName());
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
	public void initDefaultData(SrlhtMasterVO vo){
		if(vo.getAttributeValue("pk_group") == null){
			vo.setAttributeValue("pk_group",InvocationInfoProxy.getInstance().getGroupId());
		}
		if(vo.getAttributeValue("billmaker") == null){
			vo.setAttributeValue("billmaker",InvocationInfoProxy.getInstance().getUserId());
		}
		if(vo.getAttributeValue("maketime") == null){
			vo.setAttributeValue("maketime",new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));
		}
		if(vo.getAttributeValue("billtype") == null){
			vo.setAttributeValue("billtype","SRLHT");
		}
		if(vo.getAttributeValue("approvestatus") == null){
			vo.setAttributeValue("approvestatus",BillStatusEnum.FREE.toIntValue());
		}
	}
	@Override
	public AggSrlhtMasterVO preAddAggSrlhtMasterVO(AggSrlhtMasterVO vo,Map<String,Object> userJson) throws BusinessException{

		getMainVO(vo).setStatus(VOStatus.NEW);
		initDefaultData((SrlhtMasterVO)getMainVO(vo));

		//�������Ҫ�ж��Ƿ������������
		Map<String,String> data = userJson!=null && userJson.get("data") != null?(Map<String,String>)userJson.get("data"):null;
		if(data!=null && data.size()>0){
			String parentKey = data.get("parentKey");
			String parentPk = data.get("parentPk");
			getMainVO(vo).setAttributeValue(parentKey,parentPk);
		}

		//�����������vo�ı���
		BillCodeContext billCodeContext = getBillCodeContext("srlhtsrlht");
		if(billCodeContext == null){
			throw new BusinessException("��ǰ������򲻴��ڣ��뵽�����������-ȫ�֡��ڵ����Ƿ����"+"srlhtsrlht");
		}
		if(billCodeContext.isPrecode()){
			String pk_group = InvocationInfoProxy.getInstance().getGroupId();
			String code = getBillcodeManage().getPreBillCode_RequiresNew("srlhtsrlht", pk_group, pk_group);
			getMainVO(vo).setAttributeValue("code",code);
		}

		return vo;
	}
	@Override
	public AggSrlhtMasterVO preAddAggSrlhtMasterVO(Map<String,Object> userJson) throws BusinessException{
		AggSrlhtMasterVO result = null;

		SrlhtMasterVO mainvo = new SrlhtMasterVO();
		//����Ĭ��ֵ
		initDefaultData(mainvo);
		AggSrlhtMasterVO aggvo = new AggSrlhtMasterVO();
		aggvo.setParent(mainvo);
		result = aggvo;
		return preAddAggSrlhtMasterVO(result,userJson);
	}

	@Override
	public AggSrlhtMasterVO preEditAggSrlhtMasterVO(String pk) throws BusinessException{
		return dao.findByPk(AggSrlhtMasterVO.class, pk, false);
	}

	@Override
	public AggSrlhtMasterVO copyAggSrlhtMasterVO(String pk) throws BusinessException{

		AggSrlhtMasterVO vo = dao.findByPk(AggSrlhtMasterVO.class, pk, false);

		getMainVO(vo).setPrimaryKey(null);
		getMainVO(vo).setStatus(VOStatus.NEW);

		getMainVO(vo).setAttributeValue("srcbilltype",null);
		getMainVO(vo).setAttributeValue("srcbillid",null);

		getMainVO(vo).setAttributeValue("code",null);
		getMainVO(vo).setAttributeValue("",null);
		//�����������vo�ı���
		BillCodeContext billCodeContext = getBillCodeContext("srlhtsrlht");
		if(billCodeContext == null){
			throw new BusinessException("��ǰ������򲻴��ڣ��뵽�����������-ȫ�֡��ڵ����Ƿ����"+"srlhtsrlht");
		}
		if(billCodeContext.isPrecode()){
			String pk_group = InvocationInfoProxy.getInstance().getGroupId();
			String code = getBillcodeManage().getPreBillCode_RequiresNew("srlhtsrlht", pk_group, pk_group);
			getMainVO(vo).setAttributeValue("code",code);
		}
		getMainVO(vo).setAttributeValue("approvestatus", BillStatusEnum.FREE.toIntValue());
		getMainVO(vo).setAttributeValue("billmaker", InvocationInfoProxy.getInstance().getUserId());
		getMainVO(vo).setAttributeValue("approver", null);
		getMainVO(vo).setAttributeValue("approvenote", null);
		getMainVO(vo).setAttributeValue("approvedate", null);
		//���������ϢΪ��
		getMainVO(vo).setAttributeValue("creator",null);
		getMainVO(vo).setAttributeValue("creationtime",null);
		getMainVO(vo).setAttributeValue("modifier",null);
		getMainVO(vo).setAttributeValue("modifiedtime",null);
		getMainVO(vo).setAttributeValue("maketime", new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));

		SrlhtXdfxx[] srlhtXdfxxs = (SrlhtXdfxx[])vo.getChildren(SrlhtXdfxx.class);
		if(srlhtXdfxxs!=null && srlhtXdfxxs.length>0){
			Arrays.stream(srlhtXdfxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
				subvo.setAttributeValue("rowno", null);
				subvo.setAttributeValue("srcrowno", null);
			});
		}
		SrlhtXmxx[] srlhtXmxxs = (SrlhtXmxx[])vo.getChildren(SrlhtXmxx.class);
		if(srlhtXmxxs!=null && srlhtXmxxs.length>0){
			Arrays.stream(srlhtXmxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		SrlhtYsxx[] srlhtYsxxs = (SrlhtYsxx[])vo.getChildren(SrlhtYsxx.class);
		if(srlhtYsxxs!=null && srlhtYsxxs.length>0){
			Arrays.stream(srlhtYsxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		SrlhtJhskxx[] srlhtJhskxxs = (SrlhtJhskxx[])vo.getChildren(SrlhtJhskxx.class);
		if(srlhtJhskxxs!=null && srlhtJhskxxs.length>0){
			Arrays.stream(srlhtJhskxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		SrlhtSjskxx[] srlhtSjskxxs = (SrlhtSjskxx[])vo.getChildren(SrlhtSjskxx.class);
		if(srlhtSjskxxs!=null && srlhtSjskxxs.length>0){
			Arrays.stream(srlhtSjskxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		SrlhtJhfkxx[] srlhtJhfkxxs = (SrlhtJhfkxx[])vo.getChildren(SrlhtJhfkxx.class);
		if(srlhtJhfkxxs!=null && srlhtJhfkxxs.length>0){
			Arrays.stream(srlhtJhfkxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		SrlhtSjfkxx[] srlhtSjfkxxs = (SrlhtSjfkxx[])vo.getChildren(SrlhtSjfkxx.class);
		if(srlhtSjfkxxs!=null && srlhtSjfkxxs.length>0){
			Arrays.stream(srlhtSjfkxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		Htwbxx[] htwbxxs = (Htwbxx[])vo.getChildren(Htwbxx.class);
		if(htwbxxs!=null && htwbxxs.length>0){
			Arrays.stream(htwbxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		return vo;
	}
	@Override
	public AggSrlhtMasterVO[] saveAggSrlhtMasterVO(AggSrlhtMasterVO vo) throws BusinessException{
		String pk = getVOPrimaryKey(vo);
		setDefaultVal(vo);
		if(StringUtils.isEmpty(pk)){
			return dao.insert(vo); //����
		}else{
			return dao.update(vo); //����
		}
	}
	/**
	 * ����ǰ����������
	 * @param vos
	 */
	private void setBillCode(AggSrlhtMasterVO... vos) throws BusinessException {
		if(ArrayUtils.isNotEmpty(vos)) {
			for(AggSrlhtMasterVO vo : vos) {
				String pk = getVOPrimaryKey(vo);
				if(StringUtils.isEmpty(pk)){
					BillCodeContext billCodeContext = getBillCodeContext("srlhtsrlht");
					String pk_group = InvocationInfoProxy.getInstance().getGroupId();
					if(billCodeContext!=null && !billCodeContext.isPrecode()){
						if(getMainVO(vo).getAttributeValue("code") == null){
							String code = getBillcodeManage().getBillCode_RequiresNew("srlhtsrlht", pk_group, pk_group, getMainVO(vo));
							getMainVO(vo).setAttributeValue("code",code);
						}
					} else {
						String code = (String) getMainVO(vo).getAttributeValue("code");
						getBillcodeManage().commitPreBillCode("srlhtsrlht", pk_group, pk_group, code);
					}
				}
			}
		}
	}
	/**
	 * ����ǰ���������Ϣ
	 * @param vos
	 */
	private void setAuditInfo(AggSrlhtMasterVO... vos) throws BusinessException {
		if(ArrayUtils.isNotEmpty(vos)) {
			UFDateTime now = new UFDateTime();
			for(AggSrlhtMasterVO vo : vos) {
				String pk = getVOPrimaryKey(vo);
				if(StringUtils.isEmpty(pk)){
					//���ô����˴���ʱ��
					getMainVO(vo).setAttributeValue("creator",InvocationInfoProxy.getInstance().getUserId());
					getMainVO(vo).setAttributeValue("creationtime",now);
					getMainVO(vo).setAttributeValue("maketime",now);
					getMainVO(vo).setAttributeValue("billmaker", InvocationInfoProxy.getInstance().getUserId()); // �Ƶ���
					getMainVO(vo).setAttributeValue("modifier",null);
					getMainVO(vo).setAttributeValue("modifiedtime",null);
				}else{
					//�����޸����޸�ʱ��
					getMainVO(vo).setAttributeValue("modifier",InvocationInfoProxy.getInstance().getUserId());
					getMainVO(vo).setAttributeValue("modifiedtime",now);
					getMainVO(vo).setAttributeValue("lastmaketime",now);
				}
			}
		}
	}
	/**
	 * ����ǰ����һЩĬ��ֵ
	 * @param vos
	 */
	private void setDefaultVal(AggSrlhtMasterVO... vos) throws BusinessException {
		setBillCode(vos);
		setAuditInfo(vos);
		//����Ĭ��ֵ����
	}

	// �������б༭����������
	@Override
	public AggSrlhtMasterVO[] saveAggSrlhtMasterVO(AggSrlhtMasterVO[] vos) throws BusinessException {
		if (ArrayUtils.isEmpty(vos)) {
			return new AggSrlhtMasterVO[0];
		}
		setDefaultVal(vos); // ����Ĭ��ֵ
		List<String> pks = Arrays.stream(vos).filter(v -> getMainVO(v).getStatus() == VOStatus.DELETED)
				.map(v -> getMainVO(v).getPrimaryKey()).collect(Collectors.toList()); // ɾ����������
		if (pks == null || pks.size() == 0) {
			return dao.save(vos, true);
		}
		AggSrlhtMasterVO[] deleteVOs = dao.listByPk(AggSrlhtMasterVO.class, pks.toArray(new String[0]));
		for (int i = 0; i < deleteVOs.length; i++) {
			SuperVO mainVO = getMainVO(deleteVOs[i]);
			// ɾ������ʱУ�鵥��״̬
			Integer approveStatus = (Integer) mainVO.getAttributeValue("approvestatus");
			if (approveStatus != null && !approveStatus.equals(-1)) {
				throw new BusinessException("��" + (i + 1) + "�ŵ��ݴ���ʧ�ܣ�����״̬����ȷ������ɾ����");
			}
			// ɾ������ʱ���˵��ݺ�
			String code = (String)mainVO.getAttributeValue("code");
			if (StringUtils.isNotEmpty(code)) {
				String pk_group = InvocationInfoProxy.getInstance().getGroupId();
				getBillcodeManage().returnBillCodeOnDelete("srlhtsrlht", pk_group, pk_group, code, deleteVOs[i]);
			}
		}
		return dao.save(vos,true);
	}

	@Override
	public AggSrlhtMasterVO[] deleteAggSrlhtMasterVOs(Map<String,String> tsMap) throws BusinessException{
		AggSrlhtMasterVO[] vos = dao.listByPk(AggSrlhtMasterVO.class,tsMap.keySet().toArray(new String[0]));
		validate(vos,tsMap);
		String pk_group = InvocationInfoProxy.getInstance().getGroupId();
		Arrays.stream(vos).forEach(vo->{
			String code = (String)getMainVO(vo).getAttributeValue("code");
			try {
				getBillcodeManage().returnBillCodeOnDelete("srlhtsrlht",pk_group,pk_group,code,vo);
			} catch (BusinessException e) {
				ExceptionUtils.wrapException(e.getMessage(),e);
			}
		});
		dao.delete(vos,true);
		return vos;
	}
	
	//У��  ����tsУ��  ���ύУ��
	private void validate(AggSrlhtMasterVO[] vos,Map<String,String> tsMap) throws BusinessException{

		Boolean isPass = true;
		String error = "";    //������Ϣ
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
			Integer approvestatus = (Integer) mainvo.getAttributeValue("approvestatus");
			if(approvestatus == null || approvestatus != BillStatusEnum.FREE.toIntValue()){
				error += "��"+(i+1)+"�ŵ��ݴ���ʧ�ܣ�����״̬����ȷ������ɾ����\n";
			}
		}
		if(!isPass) {
			throw new BusinessException("�������������ѱ������޸Ļ�ɾ������ˢ�º����ԣ�");
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
		String cond = " pk_srlhtmaster = '" + parentId + "' ";
		SuperVO[] vos  = (SuperVO[]) dao.listByCondition(childClazz, cond, false);
		if (vos == null || vos.length == 0) {
			return new String[0];
		}
		return Stream.of(vos).map(vo -> vo.getPrimaryKey()).toArray(String[]::new);
	}


	public SuperVO[] queryChildVOByPks(Class childClazz, String[] pks) throws BusinessException{
		return (SuperVO[]) dao.listByPk(childClazz, pks, false);
	}

	/**
	 * �ύǰУ��:
	 * ��鵥��״̬
	 * @throws BusinessException
	 * */
	private void validateCommitAggSrlhtMasterVO(AggSrlhtMasterVO... vos) throws BusinessException {
		if(ArrayUtils.isEmpty(vos)) {
			return ;
		}
		List<AggSrlhtMasterVO> list = Arrays.stream(vos)
			.filter(item ->item.getParentVO()!=null)
			.filter(item->{
				Integer status =  (Integer) item.getParentVO().getAttributeValue("approvestatus");
				return status==null||status!=BillStatusEnum.FREE.toIntValue()&&status!=BillStatusEnum.NOPASS.toIntValue();
			}).map(item->item)
			.collect(Collectors.toList());
		if(list == null||list.size() == 0) {
			return;
		}
		String errors = "";
		for(AggSrlhtMasterVO vo  : list) {
			errors+="���ݺţ�["+vo.getParentVO().getAttributeValue("code")+"]�ύʧ�ܣ�ʧ��ԭ�򣺵���״̬����ȷ�����顣\n";
		}
		throw new BusinessException(errors);
	}
	/**
	 * �ջ�ǰУ��:
	 * ��鵥��״̬
	 * @throws BusinessException
	 * */
	private void validateUnCommitAggSrlhtMasterVO(AggSrlhtMasterVO... vos) throws BusinessException {
		if(ArrayUtils.isEmpty(vos)) {
			return ;
		}
		List<AggSrlhtMasterVO> list = Arrays.stream(vos)
			.filter(item ->item.getParentVO()!=null)
			.filter(item->{
				Integer status =  (Integer)item.getParentVO().getAttributeValue("approvestatus");
				return status==null||status==BillStatusEnum.FREE.toIntValue();
			}).map(item->item)
			.collect(Collectors.toList());
		if(list == null||list.size() == 0) {
			return;
		}
		String errors = "";
		for(AggSrlhtMasterVO vo  : list) {
			errors+="���ݺţ�["+vo.getParentVO().getAttributeValue("code")+"]�ջ�ʧ�ܣ�ʧ��ԭ�򣺵���״̬����ȷ�����顣\n";
		}
		throw new BusinessException(errors);
	}
	@Override
	public Object commitAggSrlhtMasterVO(String actionName,Map<String,String> tsMap,Object assign) throws BusinessException{
		AggSrlhtMasterVO[] vos = dao.listByPk(AggSrlhtMasterVO.class,getAllPks(tsMap),false);
		validateTs(tsMap,vos);
		//�ύǰУ�鼰ҵ���߼�
		validateCommitAggSrlhtMasterVO(vos);
		Map<String,Object> res = this.execFlows(actionName,"SRLHT",assign,vos);
		//�ύ��ҵ���߼�
		return res;
	}

	@Override
	public Object batchCommitAggSrlhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException{
		AggSrlhtMasterVO[] vos = dao.listByPk(AggSrlhtMasterVO.class,getAllPks(tsMap),false);
		validateTs(tsMap,vos);
		//�����ύǰУ�鼰ҵ���߼�
		validateCommitAggSrlhtMasterVO(vos);
		Map<String,Object> res = this.execFlows(actionName,"SRLHT",vos);
		//�����ύ��ҵ���߼�
		return res;
	}

	@Override
	public Object uncommitAggSrlhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException{
		AggSrlhtMasterVO[] vos = dao.listByPk(AggSrlhtMasterVO.class,getAllPks(tsMap),false);
		validateTs(tsMap,vos);
		//�ջ�ǰУ�鼰ҵ���߼�
		validateUnCommitAggSrlhtMasterVO(vos);
		Map<String,Object> res = this.execFlows(actionName,"SRLHT",vos);
		//�ջغ�ҵ���߼�
		return res;
	}

	@Override
	public Object batchUncommitAggSrlhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException{
		AggSrlhtMasterVO[] vos = dao.listByPk(AggSrlhtMasterVO.class,getAllPks(tsMap),false);
		validateTs(tsMap,vos);
		//�����ջ�ǰУ�鼰ҵ���߼�
		validateUnCommitAggSrlhtMasterVO(vos);
		Map<String,Object> res = this.execFlows(actionName,"SRLHT",vos);
		//�����ջغ�ҵ���߼�
		return res;
	}

	@Override
	public AggSrlhtMasterVO[] callbackSAVEBASE(AggSrlhtMasterVO...vos) throws BusinessException{
		if(ArrayUtils.isEmpty(vos)) {
			return null;
		}
		return this.saveAggSrlhtMasterVO(vos);

	}


	@Override
	public AggSrlhtMasterVO[] callbackSAVE(AggSrlhtMasterVO...vos) throws BusinessException{
		if(ArrayUtils.isEmpty(vos)) {
			return null;
		}
		//ͬ������״̬������״̬(ֻ���ύʱ����Ҫ�ֶ���������״̬�����������������״̬���Ѹ���)
		Arrays.stream(vos).forEach(v->{
				v.getParent().setAttributeValue("approvestatus",BillStatusEnum.COMMIT.toIntValue());
		});
		return this.saveAggSrlhtMasterVO(vos);

	}


	@Override
	public AggSrlhtMasterVO[] callbackUNSAVE(AggSrlhtMasterVO...vos) throws BusinessException{
		if(ArrayUtils.isEmpty(vos)) {
			return null;
		}
		return this.saveAggSrlhtMasterVO(vos);

	}


	@Override
	public AggSrlhtMasterVO[] callbackAPPROVE(AggSrlhtMasterVO...vos) throws BusinessException{
		if(ArrayUtils.isEmpty(vos)) {
			return null;
		}
		return this.saveAggSrlhtMasterVO(vos);

	}


	@Override
	public AggSrlhtMasterVO[] callbackUNAPPROVE(AggSrlhtMasterVO...vos) throws BusinessException{
		if(ArrayUtils.isEmpty(vos)) {
			return null;
		}
		return this.saveAggSrlhtMasterVO(vos);

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
