
package nc.itf.wsht.zclht.zclhtmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.zclht.zclht.AggZclhtMasterVO;
import nc.vo.zclht.zclht.ZclhtMasterVO;
import nc.pub.billcode.vo.BillCodeContext;

public interface  IZclhtMasterVOService{

	/**
	 * ֧�����ͬ������Ϣ��AGGVO��ѯ����
	 * ��������������ѯAgg����
	 * @param pk����
	 * @return �������
	 */
	public AggZclhtMasterVO[] listAggZclhtMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * ֧�����ͬ������Ϣ��AGGVO��ѯ����
	 * ��������������ѯAgg����
	 * @param pk����
	 * @return �������
	 */
	public AggZclhtMasterVO[] listAggZclhtMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * ֧�����ͬ������Ϣ��AGGVO��ѯ����
	 * ��������������ѯAgg����
	 * @param pk ����
	 * @return �������
	 */
	public  AggZclhtMasterVO findAggZclhtMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * ֧�����ͬ������Ϣ��AGGVO��ѯ����
	 * ���������ַ�����ѯAgg����
	 * @param condition ����
	 * @return �������
	 */
	public  AggZclhtMasterVO[] listAggZclhtMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * ֧�����ͬ������Ϣ��AGGVO��ѯ����
	 * ���������ַ�����ѯAgg����
	 * @param condition ����
	 * @param orderPath ���򼯺�
	 * @return �������
	 */
	public  AggZclhtMasterVO[] listAggZclhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * ֧�����ͬ������Ϣ������VO��ѯ����
	 * ��������������ѯAgg����
	 * @param pk����
	 * @return �������
	 */
	public ZclhtMasterVO[] listZclhtMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * ֧�����ͬ������Ϣ������VO��ѯ����
	 * ��������������ѯAgg����
	 * @param pk ����
	 * @return �������
	 */
	public  ZclhtMasterVO findZclhtMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * ֧�����ͬ������Ϣ������VO��ѯ����
	 * ���������ַ�����ѯAgg����
	 * @param condition ����
	 * @return �������
	 */
	public  ZclhtMasterVO[] listZclhtMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * ֧�����ͬ������Ϣ������VO��ѯ����
	 * ���������ַ�����ѯAgg����
	 * @param condition ����
	 * @return �������
	 */
	public  ZclhtMasterVO[] listZclhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * ֧�����ͬ������Ϣ������pk��ѯ����
	 * ���������ַ�����ѯpk��������
	 * @param condition ��ѯ����+
	 * @return �������
	 */
	public String[] listZclhtMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * ֧�����ͬ������Ϣ������pk��ѯ����
	 * ���������ַ�����ѯpk��������
	 * @param condition ��ѯ����+
	 * @return �������
	 */
	public String[] listZclhtMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * ����ʵ��vo����Ĭ��ֵ
	 * @param vo
	 */
	public void initDefaultData(ZclhtMasterVO vo);
	
	
	/**
	 * Ԥ��������֧�����ͬ������Ϣ����
	 * @param userJson  ����ʱ��Ҫ����չ��������
	 */
	public AggZclhtMasterVO preAddAggZclhtMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggZclhtMasterVO preAddAggZclhtMasterVO(AggZclhtMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * Ԥ�༭����֧�����ͬ������Ϣ����
	 * @param userJson  ����ʱ��Ҫ����չ��������
	 */
	public AggZclhtMasterVO preEditAggZclhtMasterVO(String pk) throws BusinessException;
	
	 /**
	 * ���Ʋ���֧�����ͬ������Ϣ����
	 * 
	 */
	public AggZclhtMasterVO copyAggZclhtMasterVO(String pk) throws BusinessException;
	/**
	 * �������֧�����ͬ������Ϣ����
	 * @param vos �������
	 * @return @
	 */
	public AggZclhtMasterVO[] saveAggZclhtMasterVO(AggZclhtMasterVO vo) throws BusinessException;

	public AggZclhtMasterVO[] saveAggZclhtMasterVO(AggZclhtMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * ɾ������֧�����ͬ������Ϣ����
	 * @param vos ɾ������
	 * @return @
	 */
	public AggZclhtMasterVO[] deleteAggZclhtMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * ��������������֧�����ͬ������Ϣ
	 * @param vos ����
	 * @return @
	 */
	public <T> T[] loadTreeData(Class<T> clazz,Map<String,Object> userJson) throws BusinessException;

	/**
	 * ��������������ѯ�ӱ�pks
	 * @param childClazz �ӱ�class
	 * @param parentId ��������
	 * @return �ӱ�pks
	 * @throws BusinessException
	 */
	String[] queryChildPksByParentId(Class childClazz, String parentId) throws BusinessException;

	/**
	 * �����ӱ�������ѯ�ӱ�����
	 * @param childClazz �ӱ�class
	 * @param pks �ӱ�
	 * @return �ӱ�vos
	 * @throws BusinessException
	 */
	SuperVO[] queryChildVOByPks(Class childClazz, String[] pks) throws BusinessException;
	/**
	 * �����ύ
	 * @param actionName �����ű�����
	 * @param tsMap  keyΪ����  valueΪts
	 * @param assign ָ����Ϣ��ֻ�е����ύ����ָ��
	 * @return Object
	 * @throws BusinessException
	 */
	public Object commitAggZclhtMasterVO(String actionName,Map<String,String> tsMap,Object assign) throws BusinessException;
	/**
	 * �����ύ
	 * @param actionName �����ű�����
	 * @param tsMap  keyΪ����  valueΪts
	 * @throws BusinessException
	 */
	public Object batchCommitAggZclhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException;
	/**
	 * �����ջ�
	 * @param actionName �����ű�����
	 * @param tsMap  keyΪ����  valueΪts
	 * @return
	 * @throws BusinessException
	 */
	public Object uncommitAggZclhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException;
	/**
	 * �����ջ�
	 * @param actionName �����ű�����
	 * @param tsMap  keyΪ����  valueΪts
	 * @throws BusinessException
	 */
	public Object batchUncommitAggZclhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException;
	/**
	 * SAVEBASE �ص�--�����ű�������
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggZclhtMasterVO[] callbackSAVEBASE(AggZclhtMasterVO...vos) throws BusinessException;
	
	/**
	 * SAVE �ص�--�����ű�������
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggZclhtMasterVO[] callbackSAVE(AggZclhtMasterVO...vos) throws BusinessException;
	
	/**
	 * UNSAVE �ص�--�����ű�������
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggZclhtMasterVO[] callbackUNSAVE(AggZclhtMasterVO...vos) throws BusinessException;
	
	/**
	 * APPROVE �ص�--�����ű�������
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggZclhtMasterVO[] callbackAPPROVE(AggZclhtMasterVO...vos) throws BusinessException;
	
	/**
	 * UNAPPROVE �ص�--�����ű�������
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggZclhtMasterVO[] callbackUNAPPROVE(AggZclhtMasterVO...vos) throws BusinessException;
	
	/**
	 * ��ȡĬ��(ȫ��)�������������
	 * 
	 * @param coderuleid �����������?
	 * @return �������������
	 * @throws BusinessException
	 */
	public BillCodeContext getBillCodeContext(String coderuleid) throws BusinessException;

	/**
	 * ��ȡ�������������
	 * 
	 * @param coderuleid
	 * @param pkgroup
	 * @param pkorg
	 * @return
	 * @throws BusinessException
	 */
	public BillCodeContext getBillCodeContext(String coderuleid, String pkgroup, String pkorg) throws BusinessException;

}