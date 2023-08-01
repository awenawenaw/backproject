
package nc.itf.wsh.dbrkd.dbrkdmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.dbrkd.dbrkd.AggDbrkdMasterVO;
import nc.vo.dbrkd.dbrkd.DbrkdMasterVO;

public interface  IDbrkdMasterVOService{

	/**
	 * 调拨入库单的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggDbrkdMasterVO[] listAggDbrkdMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 调拨入库单的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggDbrkdMasterVO[] listAggDbrkdMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 调拨入库单的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggDbrkdMasterVO findAggDbrkdMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 调拨入库单的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggDbrkdMasterVO[] listAggDbrkdMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 调拨入库单的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggDbrkdMasterVO[] listAggDbrkdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 调拨入库单的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public DbrkdMasterVO[] listDbrkdMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 调拨入库单的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  DbrkdMasterVO findDbrkdMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 调拨入库单的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  DbrkdMasterVO[] listDbrkdMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 调拨入库单的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  DbrkdMasterVO[] listDbrkdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 调拨入库单的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listDbrkdMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 调拨入库单的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listDbrkdMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(DbrkdMasterVO vo);
	
	
	/**
	 * 预新增操作调拨入库单数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggDbrkdMasterVO preAddAggDbrkdMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggDbrkdMasterVO preAddAggDbrkdMasterVO(AggDbrkdMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作调拨入库单数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggDbrkdMasterVO preEditAggDbrkdMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作调拨入库单数据
	 * 
	 */
	public AggDbrkdMasterVO copyAggDbrkdMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作调拨入库单数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggDbrkdMasterVO[] saveAggDbrkdMasterVO(AggDbrkdMasterVO vo) throws BusinessException;

	public AggDbrkdMasterVO[] saveAggDbrkdMasterVO(AggDbrkdMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作调拨入库单数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggDbrkdMasterVO[] deleteAggDbrkdMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据调拨入库单
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