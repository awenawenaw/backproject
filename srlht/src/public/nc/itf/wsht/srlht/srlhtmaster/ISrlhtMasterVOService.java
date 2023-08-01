
package nc.itf.wsht.srlht.srlhtmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.srlht.srlht.AggSrlhtMasterVO;
import nc.vo.srlht.srlht.SrlhtMasterVO;
import nc.pub.billcode.vo.BillCodeContext;

public interface  ISrlhtMasterVOService{

	/**
	 * �������ͬ������Ϣ��AGGVO��ѯ����
	 * ��������������ѯAgg����
	 * @param pk����
	 * @return �������
	 */
	public AggSrlhtMasterVO[] listAggSrlhtMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * �������ͬ������Ϣ��AGGVO��ѯ����
	 * ��������������ѯAgg����
	 * @param pk����
	 * @return �������
	 */
	public AggSrlhtMasterVO[] listAggSrlhtMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * �������ͬ������Ϣ��AGGVO��ѯ����
	 * ��������������ѯAgg����
	 * @param pk ����
	 * @return �������
	 */
	public  AggSrlhtMasterVO findAggSrlhtMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * �������ͬ������Ϣ��AGGVO��ѯ����
	 * ���������ַ�����ѯAgg����
	 * @param condition ����
	 * @return �������
	 */
	public  AggSrlhtMasterVO[] listAggSrlhtMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * �������ͬ������Ϣ��AGGVO��ѯ����
	 * ���������ַ�����ѯAgg����
	 * @param condition ����
	 * @param orderPath ���򼯺�
	 * @return �������
	 */
	public  AggSrlhtMasterVO[] listAggSrlhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * �������ͬ������Ϣ������VO��ѯ����
	 * ��������������ѯAgg����
	 * @param pk����
	 * @return �������
	 */
	public SrlhtMasterVO[] listSrlhtMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * �������ͬ������Ϣ������VO��ѯ����
	 * ��������������ѯAgg����
	 * @param pk ����
	 * @return �������
	 */
	public  SrlhtMasterVO findSrlhtMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * �������ͬ������Ϣ������VO��ѯ����
	 * ���������ַ�����ѯAgg����
	 * @param condition ����
	 * @return �������
	 */
	public  SrlhtMasterVO[] listSrlhtMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * �������ͬ������Ϣ������VO��ѯ����
	 * ���������ַ�����ѯAgg����
	 * @param condition ����
	 * @return �������
	 */
	public  SrlhtMasterVO[] listSrlhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * �������ͬ������Ϣ������pk��ѯ����
	 * ���������ַ�����ѯpk��������
	 * @param condition ��ѯ����+
	 * @return �������
	 */
	public String[] listSrlhtMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * �������ͬ������Ϣ������pk��ѯ����
	 * ���������ַ�����ѯpk��������
	 * @param condition ��ѯ����+
	 * @return �������
	 */
	public String[] listSrlhtMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * ����ʵ��vo����Ĭ��ֵ
	 * @param vo
	 */
	public void initDefaultData(SrlhtMasterVO vo);
	
	
	/**
	 * Ԥ���������������ͬ������Ϣ����
	 * @param userJson  ����ʱ��Ҫ����չ��������
	 */
	public AggSrlhtMasterVO preAddAggSrlhtMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggSrlhtMasterVO preAddAggSrlhtMasterVO(AggSrlhtMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * Ԥ�༭�����������ͬ������Ϣ����
	 * @param userJson  ����ʱ��Ҫ����չ��������
	 */
	public AggSrlhtMasterVO preEditAggSrlhtMasterVO(String pk) throws BusinessException;
	
	 /**
	 * ���Ʋ����������ͬ������Ϣ����
	 * 
	 */
	public AggSrlhtMasterVO copyAggSrlhtMasterVO(String pk) throws BusinessException;
	/**
	 * ��������������ͬ������Ϣ����
	 * @param vos �������
	 * @return @
	 */
	public AggSrlhtMasterVO[] saveAggSrlhtMasterVO(AggSrlhtMasterVO vo) throws BusinessException;

	public AggSrlhtMasterVO[] saveAggSrlhtMasterVO(AggSrlhtMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * ɾ�������������ͬ������Ϣ����
	 * @param vos ɾ������
	 * @return @
	 */
	public AggSrlhtMasterVO[] deleteAggSrlhtMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * ���������������������ͬ������Ϣ
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
	public Object commitAggSrlhtMasterVO(String actionName,Map<String,String> tsMap,Object assign) throws BusinessException;
	/**
	 * �����ύ
	 * @param actionName �����ű�����
	 * @param tsMap  keyΪ����  valueΪts
	 * @throws BusinessException
	 */
	public Object batchCommitAggSrlhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException;
	/**
	 * �����ջ�
	 * @param actionName �����ű�����
	 * @param tsMap  keyΪ����  valueΪts
	 * @return
	 * @throws BusinessException
	 */
	public Object uncommitAggSrlhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException;
	/**
	 * �����ջ�
	 * @param actionName �����ű�����
	 * @param tsMap  keyΪ����  valueΪts
	 * @throws BusinessException
	 */
	public Object batchUncommitAggSrlhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException;
	/**
	 * SAVEBASE �ص�--�����ű�������
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggSrlhtMasterVO[] callbackSAVEBASE(AggSrlhtMasterVO...vos) throws BusinessException;
	
	/**
	 * SAVE �ص�--�����ű�������
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggSrlhtMasterVO[] callbackSAVE(AggSrlhtMasterVO...vos) throws BusinessException;
	
	/**
	 * UNSAVE �ص�--�����ű�������
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggSrlhtMasterVO[] callbackUNSAVE(AggSrlhtMasterVO...vos) throws BusinessException;
	
	/**
	 * APPROVE �ص�--�����ű�������
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggSrlhtMasterVO[] callbackAPPROVE(AggSrlhtMasterVO...vos) throws BusinessException;
	
	/**
	 * UNAPPROVE �ص�--�����ű�������
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggSrlhtMasterVO[] callbackUNAPPROVE(AggSrlhtMasterVO...vos) throws BusinessException;
	
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