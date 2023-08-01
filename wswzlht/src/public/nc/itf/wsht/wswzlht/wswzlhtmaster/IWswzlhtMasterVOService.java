
package nc.itf.wsht.wswzlht.wswzlhtmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.wsht.wswzlht.AggWswzlhtMasterVO;
import nc.vo.wsht.wswzlht.WswzlhtMasterVO;
import nc.pub.billcode.vo.BillCodeContext;

public interface  IWswzlhtMasterVOService{

	/**
	 * ������֧���ͬ������Ϣ��AGGVO��ѯ����
	 * ��������������ѯAgg����
	 * @param pk����
	 * @return �������
	 */
	public AggWswzlhtMasterVO[] listAggWswzlhtMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * ������֧���ͬ������Ϣ��AGGVO��ѯ����
	 * ��������������ѯAgg����
	 * @param pk����
	 * @return �������
	 */
	public AggWswzlhtMasterVO[] listAggWswzlhtMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * ������֧���ͬ������Ϣ��AGGVO��ѯ����
	 * ��������������ѯAgg����
	 * @param pk ����
	 * @return �������
	 */
	public  AggWswzlhtMasterVO findAggWswzlhtMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * ������֧���ͬ������Ϣ��AGGVO��ѯ����
	 * ���������ַ�����ѯAgg����
	 * @param condition ����
	 * @return �������
	 */
	public  AggWswzlhtMasterVO[] listAggWswzlhtMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * ������֧���ͬ������Ϣ��AGGVO��ѯ����
	 * ���������ַ�����ѯAgg����
	 * @param condition ����
	 * @param orderPath ���򼯺�
	 * @return �������
	 */
	public  AggWswzlhtMasterVO[] listAggWswzlhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * ������֧���ͬ������Ϣ������VO��ѯ����
	 * ��������������ѯAgg����
	 * @param pk����
	 * @return �������
	 */
	public WswzlhtMasterVO[] listWswzlhtMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * ������֧���ͬ������Ϣ������VO��ѯ����
	 * ��������������ѯAgg����
	 * @param pk ����
	 * @return �������
	 */
	public  WswzlhtMasterVO findWswzlhtMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * ������֧���ͬ������Ϣ������VO��ѯ����
	 * ���������ַ�����ѯAgg����
	 * @param condition ����
	 * @return �������
	 */
	public  WswzlhtMasterVO[] listWswzlhtMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * ������֧���ͬ������Ϣ������VO��ѯ����
	 * ���������ַ�����ѯAgg����
	 * @param condition ����
	 * @return �������
	 */
	public  WswzlhtMasterVO[] listWswzlhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * ������֧���ͬ������Ϣ������pk��ѯ����
	 * ���������ַ�����ѯpk��������
	 * @param condition ��ѯ����+
	 * @return �������
	 */
	public String[] listWswzlhtMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * ������֧���ͬ������Ϣ������pk��ѯ����
	 * ���������ַ�����ѯpk��������
	 * @param condition ��ѯ����+
	 * @return �������
	 */
	public String[] listWswzlhtMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * ����ʵ��vo����Ĭ��ֵ
	 * @param vo
	 */
	public void initDefaultData(WswzlhtMasterVO vo);
	
	
	/**
	 * Ԥ��������������֧���ͬ������Ϣ����
	 * @param userJson  ����ʱ��Ҫ����չ��������
	 */
	public AggWswzlhtMasterVO preAddAggWswzlhtMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggWswzlhtMasterVO preAddAggWswzlhtMasterVO(AggWswzlhtMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * Ԥ�༭����������֧���ͬ������Ϣ����
	 * @param userJson  ����ʱ��Ҫ����չ��������
	 */
	public AggWswzlhtMasterVO preEditAggWswzlhtMasterVO(String pk) throws BusinessException;
	
	 /**
	 * ���Ʋ���������֧���ͬ������Ϣ����
	 * 
	 */
	public AggWswzlhtMasterVO copyAggWswzlhtMasterVO(String pk) throws BusinessException;
	/**
	 * �������������֧���ͬ������Ϣ����
	 * @param vos �������
	 * @return @
	 */
	public AggWswzlhtMasterVO[] saveAggWswzlhtMasterVO(AggWswzlhtMasterVO vo) throws BusinessException;

	public AggWswzlhtMasterVO[] saveAggWswzlhtMasterVO(AggWswzlhtMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * ɾ������������֧���ͬ������Ϣ����
	 * @param vos ɾ������
	 * @return @
	 */
	public AggWswzlhtMasterVO[] deleteAggWswzlhtMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * ��������������������֧���ͬ������Ϣ
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