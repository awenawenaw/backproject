package nc.vo.wxrk.wxrk;

import nc.vo.pub.*;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class WxrkSlave0VO extends SuperVO {

	//构造方法
	public WxrkSlave0VO() {
		super();
	}


    private java.lang.String pk_wxrkslave0  ;
    private java.lang.String rowno  ;
    private java.lang.String srcrowno  ;
    private java.lang.String materialname  ;
    private java.lang.String materialtype  ;
    private java.lang.String materialspec  ;
    private java.lang.String thorjstj  ;
    private java.lang.String measdoc  ;
    private nc.vo.pub.lang.UFDouble cgsl  ;
    private nc.vo.pub.lang.UFDouble shsl  ;
    private nc.vo.pub.lang.UFDouble shdj  ;
    private nc.vo.pub.lang.UFDouble rksl  ;
    private java.lang.String stordoc  ;
    private java.lang.String rack  ;
    private nc.vo.pub.lang.UFBoolean sfhg  ;
    private java.lang.String qcysdcode  ;
    private java.lang.String qcysdrowno  ;
    private java.lang.String def1  ;
    private java.lang.String def2  ;
    private java.lang.String def3  ;
    private java.lang.String def4  ;
    private java.lang.String def5  ;
    private java.lang.String def6  ;
    private java.lang.String def7  ;
    private java.lang.String def8  ;
    private java.lang.String def9  ;
    private java.lang.String def10  ;
    private java.lang.String def11  ;
    private java.lang.String def12  ;
    private java.lang.String def13  ;
    private java.lang.String def14  ;
    private java.lang.String def15  ;
    private java.lang.String def16  ;
    private java.lang.String def17  ;
    private java.lang.String def18  ;
    private java.lang.String def19  ;
    private java.lang.String def20  ;
    private java.lang.String def21  ;
    private java.lang.String def22  ;
    private java.lang.String def23  ;
    private java.lang.String def24  ;
    private java.lang.String def25  ;
    private java.lang.String def26  ;
    private java.lang.String def27  ;
    private java.lang.String def28  ;
    private java.lang.String def29  ;
    private java.lang.String def30  ;
    private java.lang.Integer dr  ;
    private nc.vo.pub.lang.UFDateTime ts  ;
    private java.lang.String pk_wxrkmaster  ;


	public static final String PK_WXRKSLAVE0 = "pk_wxrkslave0";
	public static final String ROWNO = "rowno";
	public static final String SRCROWNO = "srcrowno";
	public static final String MATERIALNAME = "materialname";
	public static final String MATERIALTYPE = "materialtype";
	public static final String MATERIALSPEC = "materialspec";
	public static final String THORJSTJ = "thorjstj";
	public static final String MEASDOC = "measdoc";
	public static final String CGSL = "cgsl";
	public static final String SHSL = "shsl";
	public static final String SHDJ = "shdj";
	public static final String RKSL = "rksl";
	public static final String STORDOC = "stordoc";
	public static final String RACK = "rack";
	public static final String SFHG = "sfhg";
	public static final String QCYSDCODE = "qcysdcode";
	public static final String QCYSDROWNO = "qcysdrowno";
	public static final String DEF1 = "def1";
	public static final String DEF2 = "def2";
	public static final String DEF3 = "def3";
	public static final String DEF4 = "def4";
	public static final String DEF5 = "def5";
	public static final String DEF6 = "def6";
	public static final String DEF7 = "def7";
	public static final String DEF8 = "def8";
	public static final String DEF9 = "def9";
	public static final String DEF10 = "def10";
	public static final String DEF11 = "def11";
	public static final String DEF12 = "def12";
	public static final String DEF13 = "def13";
	public static final String DEF14 = "def14";
	public static final String DEF15 = "def15";
	public static final String DEF16 = "def16";
	public static final String DEF17 = "def17";
	public static final String DEF18 = "def18";
	public static final String DEF19 = "def19";
	public static final String DEF20 = "def20";
	public static final String DEF21 = "def21";
	public static final String DEF22 = "def22";
	public static final String DEF23 = "def23";
	public static final String DEF24 = "def24";
	public static final String DEF25 = "def25";
	public static final String DEF26 = "def26";
	public static final String DEF27 = "def27";
	public static final String DEF28 = "def28";
	public static final String DEF29 = "def29";
	public static final String DEF30 = "def30";
	public static final String DR = "dr";
	public static final String TS = "ts";
	public static final String PK_WXRKMASTER = "pk_wxrkmaster";

	public void setPk_wxrkslave0(java.lang.String pk_wxrkslave0){
		this.pk_wxrkslave0 = pk_wxrkslave0;
	}

	public java.lang.String getPk_wxrkslave0(){
		return this.pk_wxrkslave0;
	} 
	
	public void setRowno(java.lang.String rowno){
		this.rowno = rowno;
	}

	public java.lang.String getRowno(){
		return this.rowno;
	} 
	
	public void setSrcrowno(java.lang.String srcrowno){
		this.srcrowno = srcrowno;
	}

	public java.lang.String getSrcrowno(){
		return this.srcrowno;
	} 
	
	public void setMaterialname(java.lang.String materialname){
		this.materialname = materialname;
	}

	public java.lang.String getMaterialname(){
		return this.materialname;
	} 
	
	public void setMaterialtype(java.lang.String materialtype){
		this.materialtype = materialtype;
	}

	public java.lang.String getMaterialtype(){
		return this.materialtype;
	} 
	
	public void setMaterialspec(java.lang.String materialspec){
		this.materialspec = materialspec;
	}

	public java.lang.String getMaterialspec(){
		return this.materialspec;
	} 
	
	public void setThorjstj(java.lang.String thorjstj){
		this.thorjstj = thorjstj;
	}

	public java.lang.String getThorjstj(){
		return this.thorjstj;
	} 
	
	public void setMeasdoc(java.lang.String measdoc){
		this.measdoc = measdoc;
	}

	public java.lang.String getMeasdoc(){
		return this.measdoc;
	} 
	
	public void setCgsl(nc.vo.pub.lang.UFDouble cgsl){
		this.cgsl = cgsl;
	}

	public nc.vo.pub.lang.UFDouble getCgsl(){
		return this.cgsl;
	} 
	
	public void setShsl(nc.vo.pub.lang.UFDouble shsl){
		this.shsl = shsl;
	}

	public nc.vo.pub.lang.UFDouble getShsl(){
		return this.shsl;
	} 
	
	public void setShdj(nc.vo.pub.lang.UFDouble shdj){
		this.shdj = shdj;
	}

	public nc.vo.pub.lang.UFDouble getShdj(){
		return this.shdj;
	} 
	
	public void setRksl(nc.vo.pub.lang.UFDouble rksl){
		this.rksl = rksl;
	}

	public nc.vo.pub.lang.UFDouble getRksl(){
		return this.rksl;
	} 
	
	public void setStordoc(java.lang.String stordoc){
		this.stordoc = stordoc;
	}

	public java.lang.String getStordoc(){
		return this.stordoc;
	} 
	
	public void setRack(java.lang.String rack){
		this.rack = rack;
	}

	public java.lang.String getRack(){
		return this.rack;
	} 
	
	public void setSfhg(nc.vo.pub.lang.UFBoolean sfhg){
		this.sfhg = sfhg;
	}

	public nc.vo.pub.lang.UFBoolean getSfhg(){
		return this.sfhg;
	} 
	
	public void setQcysdcode(java.lang.String qcysdcode){
		this.qcysdcode = qcysdcode;
	}

	public java.lang.String getQcysdcode(){
		return this.qcysdcode;
	} 
	
	public void setQcysdrowno(java.lang.String qcysdrowno){
		this.qcysdrowno = qcysdrowno;
	}

	public java.lang.String getQcysdrowno(){
		return this.qcysdrowno;
	} 
	
	public void setDef1(java.lang.String def1){
		this.def1 = def1;
	}

	public java.lang.String getDef1(){
		return this.def1;
	} 
	
	public void setDef2(java.lang.String def2){
		this.def2 = def2;
	}

	public java.lang.String getDef2(){
		return this.def2;
	} 
	
	public void setDef3(java.lang.String def3){
		this.def3 = def3;
	}

	public java.lang.String getDef3(){
		return this.def3;
	} 
	
	public void setDef4(java.lang.String def4){
		this.def4 = def4;
	}

	public java.lang.String getDef4(){
		return this.def4;
	} 
	
	public void setDef5(java.lang.String def5){
		this.def5 = def5;
	}

	public java.lang.String getDef5(){
		return this.def5;
	} 
	
	public void setDef6(java.lang.String def6){
		this.def6 = def6;
	}

	public java.lang.String getDef6(){
		return this.def6;
	} 
	
	public void setDef7(java.lang.String def7){
		this.def7 = def7;
	}

	public java.lang.String getDef7(){
		return this.def7;
	} 
	
	public void setDef8(java.lang.String def8){
		this.def8 = def8;
	}

	public java.lang.String getDef8(){
		return this.def8;
	} 
	
	public void setDef9(java.lang.String def9){
		this.def9 = def9;
	}

	public java.lang.String getDef9(){
		return this.def9;
	} 
	
	public void setDef10(java.lang.String def10){
		this.def10 = def10;
	}

	public java.lang.String getDef10(){
		return this.def10;
	} 
	
	public void setDef11(java.lang.String def11){
		this.def11 = def11;
	}

	public java.lang.String getDef11(){
		return this.def11;
	} 
	
	public void setDef12(java.lang.String def12){
		this.def12 = def12;
	}

	public java.lang.String getDef12(){
		return this.def12;
	} 
	
	public void setDef13(java.lang.String def13){
		this.def13 = def13;
	}

	public java.lang.String getDef13(){
		return this.def13;
	} 
	
	public void setDef14(java.lang.String def14){
		this.def14 = def14;
	}

	public java.lang.String getDef14(){
		return this.def14;
	} 
	
	public void setDef15(java.lang.String def15){
		this.def15 = def15;
	}

	public java.lang.String getDef15(){
		return this.def15;
	} 
	
	public void setDef16(java.lang.String def16){
		this.def16 = def16;
	}

	public java.lang.String getDef16(){
		return this.def16;
	} 
	
	public void setDef17(java.lang.String def17){
		this.def17 = def17;
	}

	public java.lang.String getDef17(){
		return this.def17;
	} 
	
	public void setDef18(java.lang.String def18){
		this.def18 = def18;
	}

	public java.lang.String getDef18(){
		return this.def18;
	} 
	
	public void setDef19(java.lang.String def19){
		this.def19 = def19;
	}

	public java.lang.String getDef19(){
		return this.def19;
	} 
	
	public void setDef20(java.lang.String def20){
		this.def20 = def20;
	}

	public java.lang.String getDef20(){
		return this.def20;
	} 
	
	public void setDef21(java.lang.String def21){
		this.def21 = def21;
	}

	public java.lang.String getDef21(){
		return this.def21;
	} 
	
	public void setDef22(java.lang.String def22){
		this.def22 = def22;
	}

	public java.lang.String getDef22(){
		return this.def22;
	} 
	
	public void setDef23(java.lang.String def23){
		this.def23 = def23;
	}

	public java.lang.String getDef23(){
		return this.def23;
	} 
	
	public void setDef24(java.lang.String def24){
		this.def24 = def24;
	}

	public java.lang.String getDef24(){
		return this.def24;
	} 
	
	public void setDef25(java.lang.String def25){
		this.def25 = def25;
	}

	public java.lang.String getDef25(){
		return this.def25;
	} 
	
	public void setDef26(java.lang.String def26){
		this.def26 = def26;
	}

	public java.lang.String getDef26(){
		return this.def26;
	} 
	
	public void setDef27(java.lang.String def27){
		this.def27 = def27;
	}

	public java.lang.String getDef27(){
		return this.def27;
	} 
	
	public void setDef28(java.lang.String def28){
		this.def28 = def28;
	}

	public java.lang.String getDef28(){
		return this.def28;
	} 
	
	public void setDef29(java.lang.String def29){
		this.def29 = def29;
	}

	public java.lang.String getDef29(){
		return this.def29;
	} 
	
	public void setDef30(java.lang.String def30){
		this.def30 = def30;
	}

	public java.lang.String getDef30(){
		return this.def30;
	} 
	
	public void setDr(java.lang.Integer dr){
		this.dr = dr;
	}

	public java.lang.Integer getDr(){
		return this.dr;
	} 
	
	public void setTs(nc.vo.pub.lang.UFDateTime ts){
		this.ts = ts;
	}

	public nc.vo.pub.lang.UFDateTime getTs(){
		return this.ts;
	} 
	
	
	public void setPk_wxrkmaster(java.lang.String pk_wxrkmaster){
		this.pk_wxrkmaster = pk_wxrkmaster;
	}

	public java.lang.String getPk_wxrkmaster(){
		return this.pk_wxrkmaster;
	} 
	
	
	public java.lang.String getParentPKFieldName() {
	    return null;
	}   
    
	@Override
	public java.lang.String getPKFieldName() {
	  return "pk_wxrkslave0";
	}
    
	/**
	 * <p>返回表名称.
	 * <p>
	 * 创建日期:
	 * @return java.lang.String
	 */
	@Override
	public java.lang.String getTableName() {
		return "wsh_wxrkslave0";
	}
	
	public static java.lang.String getDefaultTableName() {
		return "wsh_wxrkslave0";
	}    
    
	@Override
	@nc.vo.annotation.MDEntityInfo(beanFullclassName =  "nc.vo.wxrk.wxrk.WxrkSlave0VO" )
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("wxrk.wxrkSlave0");
  	}
  	
}
