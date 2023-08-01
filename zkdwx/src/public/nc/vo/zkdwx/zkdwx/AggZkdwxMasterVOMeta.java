package nc.vo.zkdwx.zkdwx;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggZkdwxMasterVOMeta  extends AbstractBillMeta{
	
	public AggZkdwxMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.zkdwx.zkdwx.ZkdwxMasterVO.class);
            this.addChildren(nc.vo.zkdwx.zkdwx.ZkdwxSlave0VO.class);
    }

}
