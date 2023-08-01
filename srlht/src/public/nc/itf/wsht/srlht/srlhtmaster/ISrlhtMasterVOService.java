
package nc.itf.wsht.srlht.srlhtmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

import nc.vo.srlht.srlht.AggSrlhtMasterVO;
import nc.vo.srlht.srlht.SrlhtMasterVO;
import nc.pub.billcode.vo.BillCodeContext;

public interface  ISrlhtMasterVOService{

	/**
	 * 收入类合同基本信息的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggSrlhtMasterVO[] listAggSrlhtMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 收入类合同基本信息的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggSrlhtMasterVO[] listAggSrlhtMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 收入类合同基本信息的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggSrlhtMasterVO findAggSrlhtMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 收入类合同基本信息的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggSrlhtMasterVO[] listAggSrlhtMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 收入类合同基本信息的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggSrlhtMasterVO[] listAggSrlhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 收入类合同基本信息的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public SrlhtMasterVO[] listSrlhtMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 收入类合同基本信息的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  SrlhtMasterVO findSrlhtMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 收入类合同基本信息的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  SrlhtMasterVO[] listSrlhtMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 收入类合同基本信息的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  SrlhtMasterVO[] listSrlhtMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 收入类合同基本信息的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listSrlhtMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 收入类合同基本信息的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listSrlhtMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(SrlhtMasterVO vo);
	
	
	/**
	 * 预新增操作收入类合同基本信息数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggSrlhtMasterVO preAddAggSrlhtMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggSrlhtMasterVO preAddAggSrlhtMasterVO(AggSrlhtMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作收入类合同基本信息数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggSrlhtMasterVO preEditAggSrlhtMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作收入类合同基本信息数据
	 * 
	 */
	public AggSrlhtMasterVO copyAggSrlhtMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作收入类合同基本信息数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggSrlhtMasterVO[] saveAggSrlhtMasterVO(AggSrlhtMasterVO vo) throws BusinessException;

	public AggSrlhtMasterVO[] saveAggSrlhtMasterVO(AggSrlhtMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作收入类合同基本信息数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggSrlhtMasterVO[] deleteAggSrlhtMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据收入类合同基本信息
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
	public Object commitAggSrlhtMasterVO(String actionName,Map<String,String> tsMap,Object assign) throws BusinessException;
	/**
	 * 批量提交
	 * @param actionName 动作脚本编码
	 * @param tsMap  key为主键  value为ts
	 * @throws BusinessException
	 */
	public Object batchCommitAggSrlhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException;
	/**
	 * 单个收回
	 * @param actionName 动作脚本编码
	 * @param tsMap  key为主键  value为ts
	 * @return
	 * @throws BusinessException
	 */
	public Object uncommitAggSrlhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException;
	/**
	 * 批量收回
	 * @param actionName 动作脚本编码
	 * @param tsMap  key为主键  value为ts
	 * @throws BusinessException
	 */
	public Object batchUncommitAggSrlhtMasterVO(String actionName,Map<String,String> tsMap) throws BusinessException;
	/**
	 * SAVEBASE 回调--动作脚本处调用
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggSrlhtMasterVO[] callbackSAVEBASE(AggSrlhtMasterVO...vos) throws BusinessException;
	
	/**
	 * SAVE 回调--动作脚本处调用
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggSrlhtMasterVO[] callbackSAVE(AggSrlhtMasterVO...vos) throws BusinessException;
	
	/**
	 * UNSAVE 回调--动作脚本处调用
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggSrlhtMasterVO[] callbackUNSAVE(AggSrlhtMasterVO...vos) throws BusinessException;
	
	/**
	 * APPROVE 回调--动作脚本处调用
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggSrlhtMasterVO[] callbackAPPROVE(AggSrlhtMasterVO...vos) throws BusinessException;
	
	/**
	 * UNAPPROVE 回调--动作脚本处调用
	 * @param vos
	 * @throws BusinessException
	 * @return
	 */
	public AggSrlhtMasterVO[] callbackUNAPPROVE(AggSrlhtMasterVO...vos) throws BusinessException;
	
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