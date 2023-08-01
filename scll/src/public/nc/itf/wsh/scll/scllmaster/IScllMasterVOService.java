
package nc.itf.wsh.scll.scllmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.scll.scll.AggScllMasterVO;
import nc.vo.scll.scll.ScllMasterVO;

public interface  IScllMasterVOService{

	/**
	 * 生产领料主实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggScllMasterVO[] listAggScllMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 生产领料主实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggScllMasterVO[] listAggScllMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 生产领料主实体的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggScllMasterVO findAggScllMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 生产领料主实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggScllMasterVO[] listAggScllMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 生产领料主实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggScllMasterVO[] listAggScllMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 生产领料主实体的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public ScllMasterVO[] listScllMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 生产领料主实体的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  ScllMasterVO findScllMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 生产领料主实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  ScllMasterVO[] listScllMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 生产领料主实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  ScllMasterVO[] listScllMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 生产领料主实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listScllMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 生产领料主实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listScllMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(ScllMasterVO vo);
	
	
	/**
	 * 预新增操作生产领料主实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggScllMasterVO preAddAggScllMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggScllMasterVO preAddAggScllMasterVO(AggScllMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作生产领料主实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggScllMasterVO preEditAggScllMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作生产领料主实体数据
	 * 
	 */
	public AggScllMasterVO copyAggScllMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作生产领料主实体数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggScllMasterVO[] saveAggScllMasterVO(AggScllMasterVO vo) throws BusinessException;

	public AggScllMasterVO[] saveAggScllMasterVO(AggScllMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作生产领料主实体数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggScllMasterVO[] deleteAggScllMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据生产领料主实体
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