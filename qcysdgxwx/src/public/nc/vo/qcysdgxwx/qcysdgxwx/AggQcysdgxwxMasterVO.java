package nc.vo.qcysdgxwx.qcysdgxwx;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;
import nc.vo.qcysdgxwx.qcysdgxwx.QcysdgxwxMasterVO;

/**
 * 
 * 单子表/单表头/单表体聚合VO
 *
 * 创建日期:
 * @author 
 * @version NCPrj ??
 */
@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.qcysdgxwx.qcysdgxwx.QcysdgxwxMasterVO")
public class  AggQcysdgxwxMasterVO  extends AbstractBill {
	
	private static final long serialVersionUID = 1309613813878961316L;

      @Override
	  public IBillMeta getMetaData() {
	  	IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggQcysdgxwxMasterVOMeta.class);
	  	return billMeta;
	  }
	    
	  @Override
	  public QcysdgxwxMasterVO getParentVO(){
	  	return (QcysdgxwxMasterVO)this.getParent();
	  }

      @Override
        public String getPrimaryKey() {
            return super.getPrimaryKey();
      }

}
