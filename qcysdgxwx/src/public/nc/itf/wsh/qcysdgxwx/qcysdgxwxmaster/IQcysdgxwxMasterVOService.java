
package nc.itf.wsh.qcysdgxwx.qcysdgxwxmaster;

import java.util.Map;

import nc.vo.pub.BusinessException;

import nc.vo.qcysdgxwx.qcysdgxwx.AggQcysdgxwxMasterVO;
import nc.vo.qcysdgxwx.qcysdgxwx.QcysdgxwxMasterVO;

public interface  IQcysdgxwxMasterVOService{

	/**
	 * 器材验收单（工序外协）的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggQcysdgxwxMasterVO[] listAggQcysdgxwxMasterVOByPk(String... pks) throws BusinessException;
	
	/**
	 * 器材验收单（工序外协）的AGGVO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public AggQcysdgxwxMasterVO[] listAggQcysdgxwxMasterVOByPk(boolean blazyLoad,String... pks) throws BusinessException;
	
	/**
	 * 器材验收单（工序外协）的AGGVO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  AggQcysdgxwxMasterVO findAggQcysdgxwxMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 器材验收单（工序外协）的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  AggQcysdgxwxMasterVO[] listAggQcysdgxwxMasterVOByCondition(String condition) throws BusinessException;
	
	/**
	 * 器材验收单（工序外协）的AGGVO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 条件
	 * @param orderPath 排序集合
	 * @return 结果数组
	 */
	public  AggQcysdgxwxMasterVO[] listAggQcysdgxwxMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;
	
	/**
	 * 器材验收单（工序外协）的主表VO查询操作
	 * 根据主键条件查询Agg数组
	 * @param pk主键
	 * @return 结果数组
	 */
	public QcysdgxwxMasterVO[] listQcysdgxwxMasterVOByPk(String...pks) throws BusinessException;
	
	/**
	 * 器材验收单（工序外协）的主表VO查询操作
	 * 根据主键条件查询Agg对象
	 * @param pk 主键
	 * @return 结果对象
	 */
	public  QcysdgxwxMasterVO findQcysdgxwxMasterVOByPk(String pk) throws BusinessException;
	
	/**
	 * 器材验收单（工序外协）的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  QcysdgxwxMasterVO[] listQcysdgxwxMasterVOByCondition(String condition) throws BusinessException;
	/**
	 * 器材验收单（工序外协）的主表VO查询操作
	 * 根据条件字符串查询Agg数组
	 * @param condition 主键
	 * @return 结果数组
	 */
	public  QcysdgxwxMasterVO[] listQcysdgxwxMasterVOByCondition(String condition,String[] orderPath) throws BusinessException;

	/**
	 * 器材验收单（工序外协）的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listQcysdgxwxMasterVOPkByCond(String condition) throws BusinessException;
	
	/**
	 * 器材验收单（工序外协）的主表pk查询操作
	 * 根据条件字符串查询pk数组数组
	 * @param condition 查询方案+
	 * @return 结果数组
	 */
	public String[] listQcysdgxwxMasterVOPkByCond(String condition,String[] orderPath) throws BusinessException;
	/**
	 * 给主实体vo设置默认值
	 * @param vo
	 */
	public void initDefaultData(QcysdgxwxMasterVO vo);
	
	
	/**
	 * 预新增操作器材验收单（工序外协）数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggQcysdgxwxMasterVO preAddAggQcysdgxwxMasterVO(Map<String,Object> userJson) throws BusinessException;
	
	public AggQcysdgxwxMasterVO preAddAggQcysdgxwxMasterVO(AggQcysdgxwxMasterVO vo,Map<String,Object> userJson) throws BusinessException;
	 /**
	 * 预编辑操作器材验收单（工序外协）数据
	 * @param userJson  新增时需要的扩展参数对象
	 */
	public AggQcysdgxwxMasterVO preEditAggQcysdgxwxMasterVO(String pk) throws BusinessException;
	
	 /**
	 * 复制操作器材验收单（工序外协）数据
	 * 
	 */
	public AggQcysdgxwxMasterVO copyAggQcysdgxwxMasterVO(String pk) throws BusinessException;
	/**
	 * 保存操作器材验收单（工序外协）数据
	 * @param vos 保存对象
	 * @return @
	 */
	public AggQcysdgxwxMasterVO[] saveAggQcysdgxwxMasterVO(AggQcysdgxwxMasterVO vo) throws BusinessException;

	public AggQcysdgxwxMasterVO[] saveAggQcysdgxwxMasterVO(AggQcysdgxwxMasterVO[] vos) throws BusinessException;
	
	
	/**
	 * 删除操作器材验收单（工序外协）数据
	 * @param vos 删除对象
	 * @return @
	 */
	public AggQcysdgxwxMasterVO[] deleteAggQcysdgxwxMasterVOs(Map<String,String> tsMap) throws BusinessException;
	
	/**
	 * 加载树类型数据器材验收单（工序外协）
	 * @param vos 对象
	 * @return @
	 */
	public <T> T[] loadTreeData(Class<T> clazz,Map<String,Object> userJson) throws BusinessException;


}