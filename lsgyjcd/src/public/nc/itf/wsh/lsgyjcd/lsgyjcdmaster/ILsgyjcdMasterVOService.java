
package nc.itf.wsh.lsgyjcd.lsgyjcdmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.lsgyjcd.lsgyjcd.AggLsgyjcdMasterVO;
import nc.vo.lsgyjcd.lsgyjcd.LsgyjcdMasterVO;

public interface  ILsgyjcdMasterVOService{

	/**
	 * 临时工艺进程单的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggLsgyjcdMasterVO[] listAggLsgyjcdMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 临时工艺进程单的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggLsgyjcdMasterVO[] listAggLsgyjcdMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 临时工艺进程单的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggLsgyjcdMasterVO findAggLsgyjcdMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 临时工艺进程单的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggLsgyjcdMasterVO[] listAggLsgyjcdMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 临时工艺进程单的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggLsgyjcdMasterVO[] listAggLsgyjcdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 临时工艺进程单的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public LsgyjcdMasterVO[] listLsgyjcdMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 临时工艺进程单的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  LsgyjcdMasterVO findLsgyjcdMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 临时工艺进程单的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  LsgyjcdMasterVO[] listLsgyjcdMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 临时工艺进程单的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  LsgyjcdMasterVO[] listLsgyjcdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 临时工艺进程单的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listLsgyjcdMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 临时工艺进程单的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listLsgyjcdMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(LsgyjcdMasterVO vo);
	
	
	/**
	 * 预新增操作临时工艺进程单数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggLsgyjcdMasterVO preAddAggLsgyjcdMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggLsgyjcdMasterVO preAddAggLsgyjcdMasterVO(AggLsgyjcdMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作临时工艺进程单数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggLsgyjcdMasterVO preEditAggLsgyjcdMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作临时工艺进程单数据
	 * 
	 */
	public AggLsgyjcdMasterVO copyAggLsgyjcdMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作临时工艺进程单数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggLsgyjcdMasterVO[] saveAggLsgyjcdMasterVO(AggLsgyjcdMasterVO vo) throws BusinessException;

	public AggLsgyjcdMasterVO[] saveAggLsgyjcdMasterVO(AggLsgyjcdMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作临时工艺进程单数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggLsgyjcdMasterVO[] deleteAggLsgyjcdMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据临时工艺进程单
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