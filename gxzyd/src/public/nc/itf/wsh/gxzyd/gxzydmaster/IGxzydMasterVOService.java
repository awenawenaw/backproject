
package nc.itf.wsh.gxzyd.gxzydmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;

import nc.vo.gxzyd.gxzyd.AggGxzydMasterVO;
import nc.vo.gxzyd.gxzyd.GxzydMasterVO;

public interface  IGxzydMasterVOService{

	/**
	 * 工序转移单的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggGxzydMasterVO[] listAggGxzydMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 工序转移单的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggGxzydMasterVO[] listAggGxzydMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 工序转移单的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggGxzydMasterVO findAggGxzydMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 工序转移单的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggGxzydMasterVO[] listAggGxzydMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 工序转移单的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggGxzydMasterVO[] listAggGxzydMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 工序转移单的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public GxzydMasterVO[] listGxzydMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 工序转移单的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  GxzydMasterVO findGxzydMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 工序转移单的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  GxzydMasterVO[] listGxzydMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 工序转移单的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  GxzydMasterVO[] listGxzydMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 工序转移单的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listGxzydMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 工序转移单的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listGxzydMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(GxzydMasterVO vo);
	
	
	/**
	 * 预新增操作工序转移单数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggGxzydMasterVO preAddAggGxzydMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggGxzydMasterVO preAddAggGxzydMasterVO(AggGxzydMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作工序转移单数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggGxzydMasterVO preEditAggGxzydMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作工序转移单数据
	 * 
	 */
	public AggGxzydMasterVO copyAggGxzydMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作工序转移单数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggGxzydMasterVO[] saveAggGxzydMasterVO(AggGxzydMasterVO vo) throws BusinessException;

	public AggGxzydMasterVO[] saveAggGxzydMasterVO(AggGxzydMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作工序转移单数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggGxzydMasterVO[] deleteAggGxzydMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据工序转移单
	 * @param vos 对象
	 * @return @
	 */
	public <T> T[] loadTreeData(Class<T> clazz,Map<String,Object> userJson) throws BusinessException;


}