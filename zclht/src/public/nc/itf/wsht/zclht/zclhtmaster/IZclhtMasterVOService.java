
package nc.itf.wsht.zclht.zclhtmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.zclht.zclht.AggZclhtMasterVO;
import nc.vo.zclht.zclht.ZclhtMasterVO;
import nc.pub.billcode.vo.BillCodeContext;

public interface  IZclhtMasterVOService{

	/**
	 * 支出类合同基本信息的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggZclhtMasterVO[] listAggZclhtMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 支出类合同基本信息的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggZclhtMasterVO[] listAggZclhtMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 支出类合同基本信息的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggZclhtMasterVO findAggZclhtMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 支出类合同基本信息的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggZclhtMasterVO[] listAggZclhtMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 支出类合同基本信息的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggZclhtMasterVO[] listAggZclhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 支出类合同基本信息的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public ZclhtMasterVO[] listZclhtMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 支出类合同基本信息的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  ZclhtMasterVO findZclhtMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 支出类合同基本信息的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  ZclhtMasterVO[] listZclhtMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 支出类合同基本信息的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  ZclhtMasterVO[] listZclhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 支出类合同基本信息的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listZclhtMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 支出类合同基本信息的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listZclhtMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(ZclhtMasterVO vo);
	
	
	/**
	 * 预新增操作支出类合同基本信息数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggZclhtMasterVO preAddAggZclhtMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggZclhtMasterVO preAddAggZclhtMasterVO(AggZclhtMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作支出类合同基本信息数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggZclhtMasterVO preEditAggZclhtMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作支出类合同基本信息数据
	 * 
	 */
	public AggZclhtMasterVO copyAggZclhtMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作支出类合同基本信息数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggZclhtMasterVO[] saveAggZclhtMasterVO(AggZclhtMasterVO vo) throws BusinessException;

	public AggZclhtMasterVO[] saveAggZclhtMasterVO(AggZclhtMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作支出类合同基本信息数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggZclhtMasterVO[] deleteAggZclhtMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据支出类合同基本信息
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
	 * 单个提交
	 * @param actionName 动作脚本编码
	 * @param tsMap  key为主键  value为ts
	 * @param assign 指派信息，只有单个提交允许指派
	 * @return Object
	 * @throws BusinessException
	 */
	public Object commitAggZclhtMasterVO(String actionName,Map<String,String> tsMap,Object assign) throws BusinessException;
	/**
	 * 批量提交
	 * @param actionName 动作脚本编码
	 * @param tsMap  key为主键  value为ts
	 * @throws BusinessException
	 */
	public Object batchCommitAggZclhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException;
	/**
	 * 单个收回
	 * @param actionName 动作脚本编码
	 * @param tsMap  key为主键  value为ts
	 * @return
	 * @throws BusinessException
	 */
	public Object uncommitAggZclhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException;
	/**
	 * 批量收回
	 * @param actionName 动作脚本编码
	 * @param tsMap  key为主键  value为ts
	 * @throws BusinessException
	 */
	public Object batchUncommitAggZclhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException;
	/**
	 * SAVEBASE 回调--动作脚本处调用
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggZclhtMasterVO[] callbackSAVEBASE(AggZclhtMasterVO...vos) throws BusinessException;
	
	/**
	 * SAVE 回调--动作脚本处调用
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggZclhtMasterVO[] callbackSAVE(AggZclhtMasterVO...vos) throws BusinessException;
	
	/**
	 * UNSAVE 回调--动作脚本处调用
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggZclhtMasterVO[] callbackUNSAVE(AggZclhtMasterVO...vos) throws BusinessException;
	
	/**
	 * APPROVE 回调--动作脚本处调用
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggZclhtMasterVO[] callbackAPPROVE(AggZclhtMasterVO...vos) throws BusinessException;
	
	/**
	 * UNAPPROVE 回调--动作脚本处调用
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggZclhtMasterVO[] callbackUNAPPROVE(AggZclhtMasterVO...vos) throws BusinessException;
	
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