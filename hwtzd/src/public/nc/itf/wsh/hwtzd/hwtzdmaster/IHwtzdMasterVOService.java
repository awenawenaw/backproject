
package nc.itf.wsh.hwtzd.hwtzdmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.hwtzd.hwtzd.AggHwtzdMasterVO;
import nc.vo.hwtzd.hwtzd.HwtzdMasterVO;

public interface  IHwtzdMasterVOService{

	/**
	 * 货位调整主实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggHwtzdMasterVO[] listAggHwtzdMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 货位调整主实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggHwtzdMasterVO[] listAggHwtzdMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 货位调整主实体的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggHwtzdMasterVO findAggHwtzdMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 货位调整主实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggHwtzdMasterVO[] listAggHwtzdMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 货位调整主实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggHwtzdMasterVO[] listAggHwtzdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 货位调整主实体的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public HwtzdMasterVO[] listHwtzdMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 货位调整主实体的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  HwtzdMasterVO findHwtzdMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 货位调整主实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  HwtzdMasterVO[] listHwtzdMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 货位调整主实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  HwtzdMasterVO[] listHwtzdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 货位调整主实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listHwtzdMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 货位调整主实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listHwtzdMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(HwtzdMasterVO vo);
	
	
	/**
	 * 预新增操作货位调整主实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggHwtzdMasterVO preAddAggHwtzdMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggHwtzdMasterVO preAddAggHwtzdMasterVO(AggHwtzdMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作货位调整主实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggHwtzdMasterVO preEditAggHwtzdMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作货位调整主实体数据
	 * 
	 */
	public AggHwtzdMasterVO copyAggHwtzdMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作货位调整主实体数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggHwtzdMasterVO[] saveAggHwtzdMasterVO(AggHwtzdMasterVO vo) throws BusinessException;

	public AggHwtzdMasterVO[] saveAggHwtzdMasterVO(AggHwtzdMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作货位调整主实体数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggHwtzdMasterVO[] deleteAggHwtzdMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据货位调整主实体
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