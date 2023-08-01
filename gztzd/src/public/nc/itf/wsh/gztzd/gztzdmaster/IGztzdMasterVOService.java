
package nc.itf.wsh.gztzd.gztzdmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.gztzd.gztzd.AggGztzdMasterVO;
import nc.vo.gztzd.gztzd.GztzdMasterVO;

public interface  IGztzdMasterVOService{

	/**
	 * 工装调整主实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggGztzdMasterVO[] listAggGztzdMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 工装调整主实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggGztzdMasterVO[] listAggGztzdMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 工装调整主实体的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggGztzdMasterVO findAggGztzdMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 工装调整主实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggGztzdMasterVO[] listAggGztzdMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 工装调整主实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggGztzdMasterVO[] listAggGztzdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 工装调整主实体的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public GztzdMasterVO[] listGztzdMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 工装调整主实体的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  GztzdMasterVO findGztzdMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 工装调整主实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  GztzdMasterVO[] listGztzdMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 工装调整主实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  GztzdMasterVO[] listGztzdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 工装调整主实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listGztzdMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 工装调整主实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listGztzdMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(GztzdMasterVO vo);
	
	
	/**
	 * 预新增操作工装调整主实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggGztzdMasterVO preAddAggGztzdMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggGztzdMasterVO preAddAggGztzdMasterVO(AggGztzdMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作工装调整主实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggGztzdMasterVO preEditAggGztzdMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作工装调整主实体数据
	 * 
	 */
	public AggGztzdMasterVO copyAggGztzdMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作工装调整主实体数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggGztzdMasterVO[] saveAggGztzdMasterVO(AggGztzdMasterVO vo) throws BusinessException;

	public AggGztzdMasterVO[] saveAggGztzdMasterVO(AggGztzdMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作工装调整主实体数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggGztzdMasterVO[] deleteAggGztzdMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据工装调整主实体
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