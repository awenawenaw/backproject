
package nc.itf.wsht.wswzlht.wswzlhtmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.wsht.wswzlht.AggWswzlhtMasterVO;
import nc.vo.wsht.wswzlht.WswzlhtMasterVO;
import nc.pub.billcode.vo.BillCodeContext;

public interface  IWswzlhtMasterVOService{

	/**
	 * 无收无支类合同基本信息的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggWswzlhtMasterVO[] listAggWswzlhtMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 无收无支类合同基本信息的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggWswzlhtMasterVO[] listAggWswzlhtMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 无收无支类合同基本信息的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggWswzlhtMasterVO findAggWswzlhtMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 无收无支类合同基本信息的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggWswzlhtMasterVO[] listAggWswzlhtMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 无收无支类合同基本信息的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggWswzlhtMasterVO[] listAggWswzlhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 无收无支类合同基本信息的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public WswzlhtMasterVO[] listWswzlhtMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 无收无支类合同基本信息的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  WswzlhtMasterVO findWswzlhtMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 无收无支类合同基本信息的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  WswzlhtMasterVO[] listWswzlhtMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 无收无支类合同基本信息的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  WswzlhtMasterVO[] listWswzlhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 无收无支类合同基本信息的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listWswzlhtMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 无收无支类合同基本信息的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listWswzlhtMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(WswzlhtMasterVO vo);
	
	
	/**
	 * 预新增操作无收无支类合同基本信息数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggWswzlhtMasterVO preAddAggWswzlhtMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggWswzlhtMasterVO preAddAggWswzlhtMasterVO(AggWswzlhtMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作无收无支类合同基本信息数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggWswzlhtMasterVO preEditAggWswzlhtMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作无收无支类合同基本信息数据
	 * 
	 */
	public AggWswzlhtMasterVO copyAggWswzlhtMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作无收无支类合同基本信息数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggWswzlhtMasterVO[] saveAggWswzlhtMasterVO(AggWswzlhtMasterVO vo) throws BusinessException;

	public AggWswzlhtMasterVO[] saveAggWswzlhtMasterVO(AggWswzlhtMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作无收无支类合同基本信息数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggWswzlhtMasterVO[] deleteAggWswzlhtMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据无收无支类合同基本信息
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
	/**
	 * 获取默认(全局)编码规则上下文
	 * 
	 * @param coderuleid 编码规则主键?
	 * @return 编码规则上下文
	 * @throws BusinessException
	 */
	public BillCodeContext getBillCodeContext(String coderuleid) throws BusinessException;

	/**
	 * 获取编码规则上下文
	 * 
	 * @param coderuleid
	 * @param pkgroup
	 * @param pkorg
	 * @return
	 * @throws BusinessException
	 */
	public BillCodeContext getBillCodeContext(String coderuleid, String pkgroup, String pkorg) throws BusinessException;

}