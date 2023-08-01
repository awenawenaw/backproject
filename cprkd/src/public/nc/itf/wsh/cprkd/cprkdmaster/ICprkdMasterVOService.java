
package nc.itf.wsh.cprkd.cprkdmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;

import nc.vo.cprkd.cprkd.AggCprkdMasterVO;
import nc.vo.cprkd.cprkd.CprkdMasterVO;

public interface  ICprkdMasterVOService{

	/**
	 * 产品入库单的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggCprkdMasterVO[] listAggCprkdMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 产品入库单的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggCprkdMasterVO[] listAggCprkdMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 产品入库单的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggCprkdMasterVO findAggCprkdMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 产品入库单的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggCprkdMasterVO[] listAggCprkdMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 产品入库单的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggCprkdMasterVO[] listAggCprkdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 产品入库单的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public CprkdMasterVO[] listCprkdMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 产品入库单的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  CprkdMasterVO findCprkdMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 产品入库单的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  CprkdMasterVO[] listCprkdMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 产品入库单的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  CprkdMasterVO[] listCprkdMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 产品入库单的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listCprkdMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 产品入库单的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listCprkdMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(CprkdMasterVO vo);
	
	
	/**
	 * 预新增操作产品入库单数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggCprkdMasterVO preAddAggCprkdMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggCprkdMasterVO preAddAggCprkdMasterVO(AggCprkdMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作产品入库单数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggCprkdMasterVO preEditAggCprkdMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作产品入库单数据
	 * 
	 */
	public AggCprkdMasterVO copyAggCprkdMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作产品入库单数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggCprkdMasterVO[] saveAggCprkdMasterVO(AggCprkdMasterVO vo) throws BusinessException;

	public AggCprkdMasterVO[] saveAggCprkdMasterVO(AggCprkdMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作产品入库单数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggCprkdMasterVO[] deleteAggCprkdMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据产品入库单
	 * @param vos 对象
	 * @return @
	 */
	public <T> T[] loadTreeData(Class<T> clazz,Map<String,Object> userJson) throws BusinessException;


}