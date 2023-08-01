package nc.impl.wsht.zclht.zclhtmaster;

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

import nc.vo.zclht.zclht.ZclhtJhfkxx;
import nc.vo.zclht.zclht.ZclhtSjfkxx;
import nc.vo.zclht.zclht.Zclhtxdfxx;
import nc.vo.zclht.zclht.ZclhtYsxx;
import nc.vo.zclht.zclht.ZclhtSjskxx;
import nc.vo.zclht.zclht.ZclhtXmxx;
import nc.vo.zclht.zclht.ZclhtMasterVO;
import nc.vo.zclht.zclht.ZclhtJhskxx;
import nc.vo.zclht.zclht.ZclhtHtwbxx;
import nc.vo.zclht.zclht.AggZclhtMasterVO;
import nc.itf.wsht.zclht.zclhtmaster.IZclhtMasterVOService;


import nc.vo.pub.pf.BillStatusEnum;
import nc.bs.framework.common.InvocationInfoProxy;
import nccloud.framework.core.exception.ExceptionUtils;

public class  ZclhtMasterVOServiceImpl extends ServiceSupport implements IZclhtMasterVOService {


	@Override
	public AggZclhtMasterVO[] listAggZclhtMasterVOByPk(String...pks) throws BusinessException{
		return listAggZclhtMasterVOByPk(false,pks);
	}

	@Override
	public AggZclhtMasterVO[] listAggZclhtMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException{
		return dao.listByPksWithOrder(AggZclhtMasterVO.class,pks,blazyLoad);
	}

	@Override
	public AggZclhtMasterVO findAggZclhtMasterVOByPk(String pk) throws BusinessException{
		return dao.findByPk(AggZclhtMasterVO.class, pk, false);
	}

	@Override
	public  AggZclhtMasterVO[] listAggZclhtMasterVOByCondition(String condition) throws BusinessException{
		return listAggZclhtMasterVOByCondition(condition,new String[]{"pk_zclhtmaster"});
	}
	@Override
	public  AggZclhtMasterVO[] listAggZclhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException{
		return dao.listByCondition(AggZclhtMasterVO.class, condition, false,false,orderPath);
	}
	@Override
	public ZclhtMasterVO[] listZclhtMasterVOByPk(String... pks) throws BusinessException{
		return dao.listByPk(ZclhtMasterVO.class, pks, true);
	}

	@Override
	public  ZclhtMasterVO findZclhtMasterVOByPk(String pk) throws BusinessException{
		return dao.findByPk(ZclhtMasterVO.class, pk, true);
	}

	@Override
	public  ZclhtMasterVO[] listZclhtMasterVOByCondition(String condition) throws BusinessException{
		return listZclhtMasterVOByCondition(condition,new String[]{"pk_zclhtmaster"});
	}
	@Override
	public  ZclhtMasterVO[] listZclhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException{
		return dao.listByCondition(ZclhtMasterVO.class, condition, false,false,orderPath);
	}

	@Override
	public String[] listZclhtMasterVOPkByCond(String condition) throws BusinessException{
		return listZclhtMasterVOPkByCond(condition,new String[]{"pk_zclhtmaster"});
	}
	@Override
	public String[] listZclhtMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException{
		if(StringUtils.isEmpty(condition)) {
			condition = " 1 = 1 ";
		}
		StringBuilder sql = new StringBuilder();
		sql.append(" select pk_zclhtmaster from ").append(ZclhtMasterVO.getDefaultTableName());
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
	public void initDefaultData(ZclhtMasterVO vo){
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
			vo.setAttributeValue("billtype","ZCLHT");
		}
		if(vo.getAttributeValue("approvestatus") == null){
			vo.setAttributeValue("approvestatus",BillStatusEnum.FREE.toIntValue());
		}
	}
	@Override
	public AggZclhtMasterVO preAddAggZclhtMasterVO(AggZclhtMasterVO vo,Map<String,Object> userJson) throws BusinessException{

		getMainVO(vo).setStatus(VOStatus.NEW);
		initDefaultData((ZclhtMasterVO)getMainVO(vo));

		//�������Ҫ�ж��Ƿ������������
		Map<String,String> data = userJson!=null && userJson.get("data") != null?(Map<String,String>)userJson.get("data"):null;
		if(data!=null && data.size()>0){
			String parentKey = data.get("parentKey");
			String parentPk = data.get("parentPk");
			getMainVO(vo).setAttributeValue(parentKey,parentPk);
		}

		//�����������vo�ı���
		BillCodeContext billCodeContext = getBillCodeContext("zclhtzclht");
		if(billCodeContext == null){
			throw new BusinessException("��ǰ������򲻴��ڣ��뵽�����������-ȫ�֡��ڵ����Ƿ����"+"zclhtzclht");
		}
		if(billCodeContext.isPrecode()){
			String pk_group = InvocationInfoProxy.getInstance().getGroupId();
			String code = getBillcodeManage().getPreBillCode_RequiresNew("zclhtzclht", pk_group, pk_group);
			getMainVO(vo).setAttributeValue("code",code);
		}

		return vo;
	}
	@Override
	public AggZclhtMasterVO preAddAggZclhtMasterVO(Map<String,Object> userJson) throws BusinessException{
		AggZclhtMasterVO result = null;

		ZclhtMasterVO mainvo = new ZclhtMasterVO();
		//����Ĭ��ֵ
		initDefaultData(mainvo);
		AggZclhtMasterVO aggvo = new AggZclhtMasterVO();
		aggvo.setParent(mainvo);
		result = aggvo;
		return preAddAggZclhtMasterVO(result,userJson);
	}

	@Override
	public AggZclhtMasterVO preEditAggZclhtMasterVO(String pk) throws BusinessException{
		return dao.findByPk(AggZclhtMasterVO.class, pk, false);
	}

	@Override
	public AggZclhtMasterVO copyAggZclhtMasterVO(String pk) throws BusinessException{

		AggZclhtMasterVO vo = dao.findByPk(AggZclhtMasterVO.class, pk, false);

		getMainVO(vo).setPrimaryKey(null);
		getMainVO(vo).setStatus(VOStatus.NEW);

		getMainVO(vo).setAttributeValue("srcbilltype",null);
		getMainVO(vo).setAttributeValue("srcbillid",null);

		getMainVO(vo).setAttributeValue("code",null);
		getMainVO(vo).setAttributeValue("",null);
		//�����������vo�ı���
		BillCodeContext billCodeContext = getBillCodeContext("zclhtzclht");
		if(billCodeContext == null){
			throw new BusinessException("��ǰ������򲻴��ڣ��뵽�����������-ȫ�֡��ڵ����Ƿ����"+"zclhtzclht");
		}
		if(billCodeContext.isPrecode()){
			String pk_group = InvocationInfoProxy.getInstance().getGroupId();
			String code = getBillcodeManage().getPreBillCode_RequiresNew("zclhtzclht", pk_group, pk_group);
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

		Zclhtxdfxx[] zclhtxdfxxs = (Zclhtxdfxx[])vo.getChildren(Zclhtxdfxx.class);
		if(zclhtxdfxxs!=null && zclhtxdfxxs.length>0){
			Arrays.stream(zclhtxdfxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
				subvo.setAttributeValue("rowno", null);
				subvo.setAttributeValue("srcrowno", null);
			});
		}
		ZclhtXmxx[] zclhtXmxxs = (ZclhtXmxx[])vo.getChildren(ZclhtXmxx.class);
		if(zclhtXmxxs!=null && zclhtXmxxs.length>0){
			Arrays.stream(zclhtXmxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		ZclhtYsxx[] zclhtYsxxs = (ZclhtYsxx[])vo.getChildren(ZclhtYsxx.class);
		if(zclhtYsxxs!=null && zclhtYsxxs.length>0){
			Arrays.stream(zclhtYsxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		ZclhtJhskxx[] zclhtJhskxxs = (ZclhtJhskxx[])vo.getChildren(ZclhtJhskxx.class);
		if(zclhtJhskxxs!=null && zclhtJhskxxs.length>0){
			Arrays.stream(zclhtJhskxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		ZclhtSjskxx[] zclhtSjskxxs = (ZclhtSjskxx[])vo.getChildren(ZclhtSjskxx.class);
		if(zclhtSjskxxs!=null && zclhtSjskxxs.length>0){
			Arrays.stream(zclhtSjskxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		ZclhtJhfkxx[] zclhtJhfkxxs = (ZclhtJhfkxx[])vo.getChildren(ZclhtJhfkxx.class);
		if(zclhtJhfkxxs!=null && zclhtJhfkxxs.length>0){
			Arrays.stream(zclhtJhfkxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		ZclhtSjfkxx[] zclhtSjfkxxs = (ZclhtSjfkxx[])vo.getChildren(ZclhtSjfkxx.class);
		if(zclhtSjfkxxs!=null && zclhtSjfkxxs.length>0){
			Arrays.stream(zclhtSjfkxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		ZclhtHtwbxx[] zclhtHtwbxxs = (ZclhtHtwbxx[])vo.getChildren(ZclhtHtwbxx.class);
		if(zclhtHtwbxxs!=null && zclhtHtwbxxs.length>0){
			Arrays.stream(zclhtHtwbxxs).forEach(subvo->{
				subvo.setPrimaryKey(null);
				subvo.setStatus(VOStatus.NEW);
				subvo.setAttributeValue("srcbilltype",null);
				subvo.setAttributeValue("srcbillid",null);
			});
		}
		return vo;
	}
	@Override
	public AggZclhtMasterVO[] saveAggZclhtMasterVO(AggZclhtMasterVO vo) throws BusinessException{
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
	private void setBillCode(AggZclhtMasterVO... vos) throws BusinessException {
		if(ArrayUtils.isNotEmpty(vos)) {
			for(AggZclhtMasterVO vo : vos) {
				String pk = getVOPrimaryKey(vo);
				if(StringUtils.isEmpty(pk)){
					BillCodeContext billCodeContext = getBillCodeContext("zclhtzclht");
					String pk_group = InvocationInfoProxy.getInstance().getGroupId();
					if(billCodeContext!=null && !billCodeContext.isPrecode()){
						if(getMainVO(vo).getAttributeValue("code") == null){
							String code = getBillcodeManage().getBillCode_RequiresNew("zclhtzclht", pk_group, pk_group, getMainVO(vo));
							getMainVO(vo).setAttributeValue("code",code);
						}
					} else {
						String code = (String) getMainVO(vo).getAttributeValue("code");
						getBillcodeManage().commitPreBillCode("zclhtzclht", pk_group, pk_group, code);
					}
				}
			}
		}
	}
	/**
	 * ����ǰ���������Ϣ
	 * @param vos
	 */
	private void setAuditInfo(AggZclhtMasterVO... vos) throws BusinessException {
		if(ArrayUtils.isNotEmpty(vos)) {
			UFDateTime now = new UFDateTime();
			for(AggZclhtMasterVO vo : vos) {
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
	private void setDefaultVal(AggZclhtMasterVO... vos) throws BusinessException {
		setBillCode(vos);
		setAuditInfo(vos);
		//����Ĭ��ֵ����
	}

	// �������б༭����������
	@Override
	public AggZclhtMasterVO[] saveAggZclhtMasterVO(AggZclhtMasterVO[] vos) throws BusinessException {
		if (ArrayUtils.isEmpty(vos)) {
			return new AggZclhtMasterVO[0];
		}
		setDefaultVal(vos); // ����Ĭ��ֵ
		List<String> pks = Arrays.stream(vos).filter(v -> getMainVO(v).getStatus() == VOStatus.DELETED)
				.map(v -> getMainVO(v).getPrimaryKey()).collect(Collectors.toList()); // ɾ����������
		if (pks == null || pks.size() == 0) {
			return dao.save(vos, true);
		}
		AggZclhtMasterVO[] deleteVOs = dao.listByPk(AggZclhtMasterVO.class, pks.toArray(new String[0]));
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
				getBillcodeManage().returnBillCodeOnDelete("zclhtzclht", pk_group, pk_group, code, deleteVOs[i]);
			}
		}
		return dao.save(vos,true);
	}

	@Override
	public AggZclhtMasterVO[] deleteAggZclhtMasterVOs(Map<String,String> tsMap) throws BusinessException{
		AggZclhtMasterVO[] vos = dao.listByPk(AggZclhtMasterVO.class,tsMap.keySet().toArray(new String[0]));
		validate(vos,tsMap);
		String pk_group = InvocationInfoProxy.getInstance().getGroupId();
		Arrays.stream(vos).forEach(vo->{
			String code = (String)getMainVO(vo).getAttributeValue("code");
			try {
				getBillcodeManage().returnBillCodeOnDelete("zclhtzclht",pk_group,pk_group,code,vo);
			} catch (BusinessException e) {
				ExceptionUtils.wrapException(e.getMessage(),e);
			}
		});
		dao.delete(vos,true);
		return vos;
	}
	
	//У��  ����tsУ��  ���ύУ��
	private void validate(AggZclhtMasterVO[] vos,Map<String,String> tsMap) throws BusinessException{

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
		String cond = " pk_zclhtmaster = '" + parentId + "' ";
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
	private void validateCommitAggZclhtMasterVO(AggZclhtMasterVO... vos) throws BusinessException {
		if(ArrayUtils.isEmpty(vos)) {
			return ;
		}
		List<AggZclhtMasterVO> list = Arrays.stream(vos)
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
		for(AggZclhtMasterVO vo  : list) {
			errors+="���ݺţ�["+vo.getParentVO().getAttributeValue("code")+"]�ύʧ�ܣ�ʧ��ԭ�򣺵���״̬����ȷ�����顣\n";
		}
		throw new BusinessException(errors);
	}
	/**
	 * �ջ�ǰУ��:
	 * ��鵥��״̬
	 * @throws BusinessException
	 * */
	private void validateUnCommitAggZclhtMasterVO(AggZclhtMasterVO... vos) throws BusinessException {
		if(ArrayUtils.isEmpty(vos)) {
			return ;
		}
		List<AggZclhtMasterVO> list = Arrays.stream(vos)
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
		for(AggZclhtMasterVO vo  : list) {
			errors+="���ݺţ�["+vo.getParentVO().getAttributeValue("code")+"]�ջ�ʧ�ܣ�ʧ��ԭ�򣺵���״̬����ȷ�����顣\n";
		}
		throw new BusinessException(errors);
	}
	@Override
	public Object commitAggZclhtMasterVO(String actionName,Map<String,String> tsMap,Object assign) throws BusinessException{
		AggZclhtMasterVO[] vos = dao.listByPk(AggZclhtMasterVO.class,getAllPks(tsMap),false);
		validateTs(tsMap,vos);
		//�ύǰУ�鼰ҵ���߼�
		validateCommitAggZclhtMasterVO(vos);
		Map<String,Object> res = this.execFlows(actionName,"ZCLHT",assign,vos);
		//�ύ��ҵ���߼�
		return res;
	}

	@Override
	public Object batchCommitAggZclhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException{
		AggZclhtMasterVO[] vos = dao.listByPk(AggZclhtMasterVO.class,getAllPks(tsMap),false);
		validateTs(tsMap,vos);
		//�����ύǰУ�鼰ҵ���߼�
		validateCommitAggZclhtMasterVO(vos);
		Map<String,Object> res = this.execFlows(actionName,"ZCLHT",vos);
		//�����ύ��ҵ���߼�
		return res;
	}

	@Override
	public Object uncommitAggZclhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException{
		AggZclhtMasterVO[] vos = dao.listByPk(AggZclhtMasterVO.class,getAllPks(tsMap),false);
		validateTs(tsMap,vos);
		//�ջ�ǰУ�鼰ҵ���߼�
		validateUnCommitAggZclhtMasterVO(vos);
		Map<String,Object> res = this.execFlows(actionName,"ZCLHT",vos);
		//�ջغ�ҵ���߼�
		return res;
	}

	@Override
	public Object batchUncommitAggZclhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException{
		AggZclhtMasterVO[] vos = dao.listByPk(AggZclhtMasterVO.class,getAllPks(tsMap),false);
		validateTs(tsMap,vos);
		//�����ջ�ǰУ�鼰ҵ���߼�
		validateUnCommitAggZclhtMasterVO(vos);
		Map<String,Object> res = this.execFlows(actionName,"ZCLHT",vos);
		//�����ջغ�ҵ���߼�
		return res;
	}

	@Override
	public AggZclhtMasterVO[] callbackSAVEBASE(AggZclhtMasterVO...vos) throws BusinessException{
		if(ArrayUtils.isEmpty(vos)) {
			return null;
		}
		return this.saveAggZclhtMasterVO(vos);

	}


	@Override
	public AggZclhtMasterVO[] callbackSAVE(AggZclhtMasterVO...vos) throws BusinessException{
		if(ArrayUtils.isEmpty(vos)) {
			return null;
		}
		//ͬ������״̬������״̬(ֻ���ύʱ����Ҫ�ֶ���������״̬�����������������״̬���Ѹ���)
		Arrays.stream(vos).forEach(v->{
				v.getParent().setAttributeValue("approvestatus",BillStatusEnum.COMMIT.toIntValue());
		});
		return this.saveAggZclhtMasterVO(vos);

	}


	@Override
	public AggZclhtMasterVO[] callbackUNSAVE(AggZclhtMasterVO...vos) throws BusinessException{
		if(ArrayUtils.isEmpty(vos)) {
			return null;
		}
		return this.saveAggZclhtMasterVO(vos);

	}


	@Override
	public AggZclhtMasterVO[] callbackAPPROVE(AggZclhtMasterVO...vos) throws BusinessException{
		if(ArrayUtils.isEmpty(vos)) {
			return null;
		}
		return this.saveAggZclhtMasterVO(vos);

	}


	@Override
	public AggZclhtMasterVO[] callbackUNAPPROVE(AggZclhtMasterVO...vos) throws BusinessException{
		if(ArrayUtils.isEmpty(vos)) {
			return null;
		}
		return this.saveAggZclhtMasterVO(vos);

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
