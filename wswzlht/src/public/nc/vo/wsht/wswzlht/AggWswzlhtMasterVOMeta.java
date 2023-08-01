package nc.vo.wsht.wswzlht;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggWswzlhtMasterVOMeta  extends AbstractBillMeta{
	
	public AggWswzlhtMasterVOMeta(){
		this.init();
	}

    private void init() {
        this.setParent(nc.vo.wsht.wswzlht.WswzlhtMasterVO.class);
            this.addChildren(nc.vo.wsht.wswzlht.wswzlhtXdfxx.class);
            this.addChildren(nc.vo.wsht.wswzlht.wswzlhtXmxx.class);
            this.addChildren(nc.vo.wsht.wswzlht.wswzlhtYsxx.class);
            this.addChildren(nc.vo.wsht.wswzlht.wswzlhtJhskxx.class);
            this.addChildren(nc.vo.wsht.wswzlht.wswzlhtSjskxx.class);
            this.addChildren(nc.vo.wsht.wswzlht.wswzlhtJhfkxx.class);
            this.addChildren(nc.vo.wsht.wswzlht.wswzlhtSjfkxx.class);
            this.addChildren(nc.vo.wsht.wswzlht.wswzlhtHtwbxx.class);
    }

}
