
package nc.itf.wsh.dbckd.dbckdmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.dbckd.dbckd.AggDbckdMasterVO;
import nc.vo.dbckd.dbckd.DbckdMasterVO;

public interface  IDbckdMasterVOService{

	/**
	 * 主实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggDbckdMasterVO[] listAggDbckdMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 主实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggDbckdMasterVO[] listAggDbckdMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 主实体的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggDbckdMasterVO findAggDbckdMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 主实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggDbckdMasterVO[] listAggDbckdMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 主实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggDbckdMasterVO[] listAggDbckdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 主实体的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public DbckdMasterVO[] listDbckdMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 主实体的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  DbckdMasterVO findDbckdMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 主实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  DbckdMasterVO[] listDbckdMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 主实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  DbckdMasterVO[] listDbckdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 主实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listDbckdMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 主实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listDbckdMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(DbckdMasterVO vo);
	
	
	/**
	 * 预新增操作主实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggDbckdMasterVO preAddAggDbckdMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggDbckdMasterVO preAddAggDbckdMasterVO(AggDbckdMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作主实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggDbckdMasterVO preEditAggDbckdMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作主实体数据
	 * 
	 */
	public AggDbckdMasterVO copyAggDbckdMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作主实体数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggDbckdMasterVO[] saveAggDbckdMasterVO(AggDbckdMasterVO vo) throws BusinessException;

	public AggDbckdMasterVO[] saveAggDbckdMasterVO(AggDbckdMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作主实体数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggDbckdMasterVO[] deleteAggDbckdMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据主实体
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