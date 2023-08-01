
package nc.itf.pmbd.htgjzb.htgjzbmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.htgjzb.htgjzb.AggHtgjzbMasterVO;
import nc.vo.htgjzb.htgjzb.HtgjzbMasterVO;

public interface IHtgjzbMasterVOService {

    /**
     * 合同基本信息的AGGVO查询操作
     * 根据主键条件查询Agg数组
     *
     * @param pk主键
     * @return 结果数组
     */
    public AggHtgjzbMasterVO[] listAggHtgjzbMasterVOByPk(String... pks) throws BusinessException;

    /**
     * 合同基本信息的AGGVO查询操作
     * 根据主键条件查询Agg数组
     *
     * @param pk主键
     * @return 结果数组
     */
    public AggHtgjzbMasterVO[] listAggHtgjzbMasterVOByPk(boolean blazyLoad, String... pks) throws BusinessException;

    /**
     * 合同基本信息的AGGVO查询操作
     * 根据主键条件查询Agg对象
     *
     * @param pk 主键
     * @return 结果对象
     */
    public AggHtgjzbMasterVO findAggHtgjzbMasterVOByPk(String pk) throws BusinessException;

    /**
     * 合同基本信息的AGGVO查询操作
     * 根据条件字符串查询Agg数组
     *
     * @param condition 主键
     * @return 结果数组
     */
    public AggHtgjzbMasterVO[] listAggHtgjzbMasterVOByCondition(String condition) throws BusinessException;

    /**
     * 合同基本信息的AGGVO查询操作
     * 根据条件字符串查询Agg数组
     *
     * @param condition 条件
     * @param orderPath 排序集合
     * @return 结果数组
     */
    public AggHtgjzbMasterVO[] listAggHtgjzbMasterVOByCondition(String condition, String[] orderPath) throws BusinessException;

    /**
     * 合同基本信息的主表VO查询操作
     * 根据主键条件查询Agg数组
     *
     * @param pk主键
     * @return 结果数组
     */
    public HtgjzbMasterVO[] listHtgjzbMasterVOByPk(String... pks) throws BusinessException;

    /**
     * 合同基本信息的主表VO查询操作
     * 根据主键条件查询Agg对象
     *
     * @param pk 主键
     * @return 结果对象
     */
    public HtgjzbMasterVO findHtgjzbMasterVOByPk(String pk) throws BusinessException;

    /**
     * 合同基本信息的主表VO查询操作
     * 根据条件字符串查询Agg数组
     *
     * @param condition 主键
     * @return 结果数组
     */
    public HtgjzbMasterVO[] listHtgjzbMasterVOByCondition(String condition) throws BusinessException;

    /**
     * 合同基本信息的主表VO查询操作
     * 根据条件字符串查询Agg数组
     *
     * @param condition 主键
     * @return 结果数组
     */
    public HtgjzbMasterVO[] listHtgjzbMasterVOByCondition(String condition, String[] orderPath) throws BusinessException;

    /**
     * 合同基本信息的主表pk查询操作
     * 根据条件字符串查询pk数组数组
     *
     * @param condition 查询方案+
     * @return 结果数组
     */
    public String[] listHtgjzbMasterVOPkByCond(String condition) throws BusinessException;

    /**
     * 合同基本信息的主表pk查询操作
     * 根据条件字符串查询pk数组数组
     *
     * @param condition 查询方案+
     * @return 结果数组
     */
    public String[] listHtgjzbMasterVOPkByCond(String condition, String[] orderPath) throws BusinessException;

    /**
     * 给主实体vo设置默认值
     *
     * @param vo
     */
    public void initDefaultData(HtgjzbMasterVO vo);


    /**
     * 预新增操作合同基本信息数据
     *
     * @param userJson 新增时需要的扩展参数对象
     */
    public AggHtgjzbMasterVO preAddAggHtgjzbMasterVO(Map<String, Object> userJson) throws BusinessException;

    public AggHtgjzbMasterVO preAddAggHtgjzbMasterVO(AggHtgjzbMasterVO vo, Map<String, Object> userJson) throws BusinessException;

    /**
     * 预编辑操作合同基本信息数据
     *
     * @param userJson 新增时需要的扩展参数对象
     */
    public AggHtgjzbMasterVO preEditAggHtgjzbMasterVO(String pk) throws BusinessException;

    /**
     * 复制操作合同基本信息数据
     */
    public AggHtgjzbMasterVO copyAggHtgjzbMasterVO(String pk) throws BusinessException;

    /**
     * 保存操作合同基本信息数据
     *
     * @param vos 保存对象
     * @return @
     */
    public AggHtgjzbMasterVO[] saveAggHtgjzbMasterVO(AggHtgjzbMasterVO vo) throws BusinessException;

    public AggHtgjzbMasterVO[] saveAggHtgjzbMasterVO(AggHtgjzbMasterVO[] vos) throws BusinessException;


    /**
     * 删除操作合同基本信息数据
     *
     * @param vos 删除对象
     * @return @
     */
    public AggHtgjzbMasterVO[] deleteAggHtgjzbMasterVOs(Map<String, String> tsMap) throws BusinessException;

    /**
     * 加载树类型数据合同基本信息
     *
     * @param vos 对象
     * @return @
     */
    public <T> T[] loadTreeData(Class<T> clazz, Map<String, Object> userJson) throws BusinessException;

    /**
     * 根据主表主键查询子表pks
     *
     * @param childClazz 子表class
     * @param parentId   主表主键
     * @return 子表pks
     * @throws BusinessException
     */
    String[] queryChildPksByParentId(Class childClazz, String parentId) throws BusinessException;

    /**
     * 根据子表主键查询子表数据
     *
     * @param childClazz 子表class
     * @param pks        子表
     * @return 子表vos
     * @throws BusinessException
     */
    SuperVO[] queryChildVOByPks(Class childClazz, String[] pks) throws BusinessException;

    public AggHtgjzbMasterVO[] loadAggHtgjzbMasterVOs(Map<String, String> tsMap);
}