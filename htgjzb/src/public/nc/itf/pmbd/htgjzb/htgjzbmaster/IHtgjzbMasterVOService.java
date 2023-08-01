
package nc.itf.pmbd.htgjzb.htgjzbmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.htgjzb.htgjzb.AggHtgjzbMasterVO;
import nc.vo.htgjzb.htgjzb.HtgjzbMasterVO;

public interface IHtgjzbMasterVOService {

    /**
     * ��ͬ������Ϣ��AGGVO��ѯ����
     * ��������������ѯAgg����
     *
     * @param pk����
     * @return �������
     */
    public AggHtgjzbMasterVO[] listAggHtgjzbMasterVOByPk(String... pks) throws BusinessException;

    /**
     * ��ͬ������Ϣ��AGGVO��ѯ����
     * ��������������ѯAgg����
     *
     * @param pk����
     * @return �������
     */
    public AggHtgjzbMasterVO[] listAggHtgjzbMasterVOByPk(boolean blazyLoad, String... pks) throws BusinessException;

    /**
     * ��ͬ������Ϣ��AGGVO��ѯ����
     * ��������������ѯAgg����
     *
     * @param pk ����
     * @return �������
     */
    public AggHtgjzbMasterVO findAggHtgjzbMasterVOByPk(String pk) throws BusinessException;

    /**
     * ��ͬ������Ϣ��AGGVO��ѯ����
     * ���������ַ�����ѯAgg����
     *
     * @param condition ����
     * @return �������
     */
    public AggHtgjzbMasterVO[] listAggHtgjzbMasterVOByCondition(String condition) throws BusinessException;

    /**
     * ��ͬ������Ϣ��AGGVO��ѯ����
     * ���������ַ�����ѯAgg����
     *
     * @param condition ����
     * @param orderPath ���򼯺�
     * @return �������
     */
    public AggHtgjzbMasterVO[] listAggHtgjzbMasterVOByCondition(String condition, String[] orderPath) throws BusinessException;

    /**
     * ��ͬ������Ϣ������VO��ѯ����
     * ��������������ѯAgg����
     *
     * @param pk����
     * @return �������
     */
    public HtgjzbMasterVO[] listHtgjzbMasterVOByPk(String... pks) throws BusinessException;

    /**
     * ��ͬ������Ϣ������VO��ѯ����
     * ��������������ѯAgg����
     *
     * @param pk ����
     * @return �������
     */
    public HtgjzbMasterVO findHtgjzbMasterVOByPk(String pk) throws BusinessException;

    /**
     * ��ͬ������Ϣ������VO��ѯ����
     * ���������ַ�����ѯAgg����
     *
     * @param condition ����
     * @return �������
     */
    public HtgjzbMasterVO[] listHtgjzbMasterVOByCondition(String condition) throws BusinessException;

    /**
     * ��ͬ������Ϣ������VO��ѯ����
     * ���������ַ�����ѯAgg����
     *
     * @param condition ����
     * @return �������
     */
    public HtgjzbMasterVO[] listHtgjzbMasterVOByCondition(String condition, String[] orderPath) throws BusinessException;

    /**
     * ��ͬ������Ϣ������pk��ѯ����
     * ���������ַ�����ѯpk��������
     *
     * @param condition ��ѯ����+
     * @return �������
     */
    public String[] listHtgjzbMasterVOPkByCond(String condition) throws BusinessException;

    /**
     * ��ͬ������Ϣ������pk��ѯ����
     * ���������ַ�����ѯpk��������
     *
     * @param condition ��ѯ����+
     * @return �������
     */
    public String[] listHtgjzbMasterVOPkByCond(String condition, String[] orderPath) throws BusinessException;

    /**
     * ����ʵ��vo����Ĭ��ֵ
     *
     * @param vo
     */
    public void initDefaultData(HtgjzbMasterVO vo);


    /**
     * Ԥ����������ͬ������Ϣ����
     *
     * @param userJson ����ʱ��Ҫ����չ��������
     */
    public AggHtgjzbMasterVO preAddAggHtgjzbMasterVO(Map<String, Object> userJson) throws BusinessException;

    public AggHtgjzbMasterVO preAddAggHtgjzbMasterVO(AggHtgjzbMasterVO vo, Map<String, Object> userJson) throws BusinessException;

    /**
     * Ԥ�༭������ͬ������Ϣ����
     *
     * @param userJson ����ʱ��Ҫ����չ��������
     */
    public AggHtgjzbMasterVO preEditAggHtgjzbMasterVO(String pk) throws BusinessException;

    /**
     * ���Ʋ�����ͬ������Ϣ����
     */
    public AggHtgjzbMasterVO copyAggHtgjzbMasterVO(String pk) throws BusinessException;

    /**
     * ���������ͬ������Ϣ����
     *
     * @param vos �������
     * @return @
     */
    public AggHtgjzbMasterVO[] saveAggHtgjzbMasterVO(AggHtgjzbMasterVO vo) throws BusinessException;

    public AggHtgjzbMasterVO[] saveAggHtgjzbMasterVO(AggHtgjzbMasterVO[] vos) throws BusinessException;


    /**
     * ɾ��������ͬ������Ϣ����
     *
     * @param vos ɾ������
     * @return @
     */
    public AggHtgjzbMasterVO[] deleteAggHtgjzbMasterVOs(Map<String, String> tsMap) throws BusinessException;

    /**
     * �������������ݺ�ͬ������Ϣ
     *
     * @param vos ����
     * @return @
     */
    public <T> T[] loadTreeData(Class<T> clazz, Map<String, Object> userJson) throws BusinessException;

    /**
     * ��������������ѯ�ӱ�pks
     *
     * @param childClazz �ӱ�class
     * @param parentId   ��������
     * @return �ӱ�pks
     * @throws BusinessException
     */
    String[] queryChildPksByParentId(Class childClazz, String parentId) throws BusinessException;

    /**
     * �����ӱ�������ѯ�ӱ�����
     *
     * @param childClazz �ӱ�class
     * @param pks        �ӱ�
     * @return �ӱ�vos
     * @throws BusinessException
     */
    SuperVO[] queryChildVOByPks(Class childClazz, String[] pks) throws BusinessException;

    public AggHtgjzbMasterVO[] loadAggHtgjzbMasterVOs(Map<String, String> tsMap);
}