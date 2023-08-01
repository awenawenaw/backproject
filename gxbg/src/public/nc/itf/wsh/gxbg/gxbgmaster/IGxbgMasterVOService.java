
package nc.itf.wsh.gxbg.gxbgmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;

import nc.vo.gxbg.gxbg.AggGxbgMasterVO;
import nc.vo.gxbg.gxbg.GxbgMasterVO;

public interface  IGxbgMasterVOService{

	/**
	 * 工序报工主实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggGxbgMasterVO[] listAggGxbgMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 工序报工主实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggGxbgMasterVO[] listAggGxbgMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 工序报工主实体的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggGxbgMasterVO findAggGxbgMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 工序报工主实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggGxbgMasterVO[] listAggGxbgMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 工序报工主实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggGxbgMasterVO[] listAggGxbgMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 工序报工主实体的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public GxbgMasterVO[] listGxbgMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 工序报工主实体的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  GxbgMasterVO findGxbgMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 工序报工主实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  GxbgMasterVO[] listGxbgMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 工序报工主实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  GxbgMasterVO[] listGxbgMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 工序报工主实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listGxbgMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 工序报工主实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listGxbgMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(GxbgMasterVO vo);
	
	
	/**
	 * 预新增操作工序报工主实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggGxbgMasterVO preAddAggGxbgMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggGxbgMasterVO preAddAggGxbgMasterVO(AggGxbgMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作工序报工主实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggGxbgMasterVO preEditAggGxbgMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作工序报工主实体数据
	 * 
	 */
	public AggGxbgMasterVO copyAggGxbgMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作工序报工主实体数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggGxbgMasterVO[] saveAggGxbgMasterVO(AggGxbgMasterVO vo) throws BusinessException;

	public AggGxbgMasterVO[] saveAggGxbgMasterVO(AggGxbgMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作工序报工主实体数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggGxbgMasterVO[] deleteAggGxbgMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据工序报工主实体
	 * @param vos 对象
	 * @return @
	 */
	public <T> T[] loadTreeData(Class<T> clazz,Map<String,Object> userJson) throws BusinessException;


}