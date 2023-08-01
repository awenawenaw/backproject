package nc.vo.wxrk.wxrk;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggWxrkMasterVOMeta  extends AbstractBillMeta{
	
	public AggWxrkMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.wxrk.wxrk.WxrkMasterVO.class);
            this.addChildren(nc.vo.wxrk.wxrk.WxrkSlave0VO.class);
    }

}
