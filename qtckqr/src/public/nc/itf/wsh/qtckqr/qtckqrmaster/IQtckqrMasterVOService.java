
package nc.itf.wsh.qtckqr.qtckqrmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.qtckqr.qtckqr.AggQtckqrMasterVO;
import nc.vo.qtckqr.qtckqr.QtckqrMasterVO;

public interface  IQtckqrMasterVOService{

	/**
	 * 其他出库确认主实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggQtckqrMasterVO[] listAggQtckqrMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 其他出库确认主实体的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggQtckqrMasterVO[] listAggQtckqrMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 其他出库确认主实体的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggQtckqrMasterVO findAggQtckqrMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 其他出库确认主实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggQtckqrMasterVO[] listAggQtckqrMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 其他出库确认主实体的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggQtckqrMasterVO[] listAggQtckqrMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 其他出库确认主实体的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public QtckqrMasterVO[] listQtckqrMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 其他出库确认主实体的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  QtckqrMasterVO findQtckqrMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 其他出库确认主实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  QtckqrMasterVO[] listQtckqrMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 其他出库确认主实体的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  QtckqrMasterVO[] listQtckqrMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 其他出库确认主实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listQtckqrMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 其他出库确认主实体的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listQtckqrMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(QtckqrMasterVO vo);
	
	
	/**
	 * 预新增操作其他出库确认主实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggQtckqrMasterVO preAddAggQtckqrMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggQtckqrMasterVO preAddAggQtckqrMasterVO(AggQtckqrMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作其他出库确认主实体数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggQtckqrMasterVO preEditAggQtckqrMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作其他出库确认主实体数据
	 * 
	 */
	public AggQtckqrMasterVO copyAggQtckqrMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作其他出库确认主实体数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggQtckqrMasterVO[] saveAggQtckqrMasterVO(AggQtckqrMasterVO vo) throws BusinessException;

	public AggQtckqrMasterVO[] saveAggQtckqrMasterVO(AggQtckqrMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作其他出库确认主实体数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggQtckqrMasterVO[] deleteAggQtckqrMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据其他出库确认主实体
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