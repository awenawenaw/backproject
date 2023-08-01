
package nc.itf.wsh.xsckd.xsckdmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.wsh.xsckd.AggXsckdMasterVO;
import nc.vo.wsh.xsckd.XsckdMasterVO;

public interface  IXsckdMasterVOService{

	/**
	 * 出库单实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggXsckdMasterVO[] listAggXsckdMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 出库单实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggXsckdMasterVO[] listAggXsckdMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 出库单实体的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggXsckdMasterVO findAggXsckdMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 出库单实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggXsckdMasterVO[] listAggXsckdMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 出库单实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggXsckdMasterVO[] listAggXsckdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 出库单实体的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public XsckdMasterVO[] listXsckdMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 出库单实体的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  XsckdMasterVO findXsckdMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 出库单实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  XsckdMasterVO[] listXsckdMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 出库单实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  XsckdMasterVO[] listXsckdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 出库单实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listXsckdMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 出库单实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listXsckdMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(XsckdMasterVO vo);
	
	
	/**
	 * 预新增操作出库单实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggXsckdMasterVO preAddAggXsckdMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggXsckdMasterVO preAddAggXsckdMasterVO(AggXsckdMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作出库单实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggXsckdMasterVO preEditAggXsckdMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作出库单实体数据
	 * 
	 */
	public AggXsckdMasterVO copyAggXsckdMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作出库单实体数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggXsckdMasterVO[] saveAggXsckdMasterVO(AggXsckdMasterVO vo) throws BusinessException;

	public AggXsckdMasterVO[] saveAggXsckdMasterVO(AggXsckdMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作出库单实体数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggXsckdMasterVO[] deleteAggXsckdMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据出库单实体
	 * @param vos 对象
	 * @return @
	 */
	public <T> T[] loadTreeData(Class<T> clazz,Map<String,Object> userJson) throws BusinessException;

	/**
	 * 根据主表主键查询子表pks
	 * @param childClazz 子表class
	 * @param parentId 主表主键
	 * @return 子表pks
	 * @throws BusinessException
	 */
	String[] queryChildPksByParentId(Class childClazz, String parentId) throws BusinessException;

	/**
	 * 根据子表主键查询子表数据
	 * @param childClazz 子表class
	 * @param pks 子表
	 * @return 子表vos
	 * @throws BusinessException
	 */
	SuperVO[] queryChildVOByPks(Class childClazz, String[] pks) throws BusinessException;

}