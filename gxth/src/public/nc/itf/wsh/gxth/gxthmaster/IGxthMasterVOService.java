
package nc.itf.wsh.gxth.gxthmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.gxth.gxth.AggGxthMasterVO;
import nc.vo.gxth.gxth.GxthMasterVO;

public interface  IGxthMasterVOService{

	/**
	 * 工序退回主实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggGxthMasterVO[] listAggGxthMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 工序退回主实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggGxthMasterVO[] listAggGxthMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 工序退回主实体的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggGxthMasterVO findAggGxthMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 工序退回主实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggGxthMasterVO[] listAggGxthMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 工序退回主实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggGxthMasterVO[] listAggGxthMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 工序退回主实体的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public GxthMasterVO[] listGxthMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 工序退回主实体的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  GxthMasterVO findGxthMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 工序退回主实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  GxthMasterVO[] listGxthMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 工序退回主实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  GxthMasterVO[] listGxthMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 工序退回主实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listGxthMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 工序退回主实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listGxthMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(GxthMasterVO vo);
	
	
	/**
	 * 预新增操作工序退回主实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggGxthMasterVO preAddAggGxthMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggGxthMasterVO preAddAggGxthMasterVO(AggGxthMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作工序退回主实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggGxthMasterVO preEditAggGxthMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作工序退回主实体数据
	 * 
	 */
	public AggGxthMasterVO copyAggGxthMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作工序退回主实体数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggGxthMasterVO[] saveAggGxthMasterVO(AggGxthMasterVO vo) throws BusinessException;

	public AggGxthMasterVO[] saveAggGxthMasterVO(AggGxthMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作工序退回主实体数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggGxthMasterVO[] deleteAggGxthMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据工序退回主实体
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