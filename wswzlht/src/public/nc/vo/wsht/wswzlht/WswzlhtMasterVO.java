package nc.vo.wsht.wswzlht;

import nc.vo.pub.*;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class WswzlhtMasterVO extends SuperVO {

	//构造方法
	public WswzlhtMasterVO() {
		super();
	}


    private java.lang.String pk_wswzlhtmaster  ;
    private java.lang.String pk_org  ;
    private java.lang.String pk_group  ;
    private java.lang.String code  ;
    private java.lang.String pk_org_v  ;
    private nc.vo.pub.lang.UFDateTime maketime  ;
    private nc.vo.pub.lang.UFDateTime lastmaketime  ;
    private java.lang.String creator  ;
    private nc.vo.pub.lang.UFDateTime creationtime  ;
    private java.lang.String modifier  ;
    private nc.vo.pub.lang.UFDateTime modifiedtime  ;
    private java.lang.String htcode  ;
    private java.lang.String htname  ;
    private java.lang.String unitcode  ;
    private java.lang.String unitname  ;
    private java.lang.String secondunitcode  ;
    private java.lang.String secondunitname  ;
    private java.lang.String signedname  ;
    private java.lang.String direction  ;
    private java.lang.String htsecondtype  ;
    private java.lang.String htsecondattr  ;
    private java.lang.String modelcode  ;
    private java.lang.String htrealtype  ;
    private java.lang.String htlevel  ;
    private java.lang.String htindustrialsector  ;
    private java.lang.String industrialsector  ;
    private java.lang.String militaryattr  ;
    private java.lang.String htproductcode  ;
    private java.lang.String htproductname  ;
    private java.lang.String frameagree  ;
    private java.lang.String frameagreecode  ;
    private java.lang.String isopencontract  ;
    private java.lang.String ischange  ;
    private java.lang.String originalhtcode  ;
    private java.lang.String htamount  ;
    private java.lang.String htcurrency  ;
    private java.lang.String rate  ;
    private java.lang.String htdescription  ;
    private java.lang.String pricebasis  ;
    private java.lang.String htconfidentlevel  ;
    private java.lang.String htstatus  ;
    private java.lang.String htsigningdate  ;
    private java.lang.String hteffectivedate  ;
    private java.lang.String htenddate  ;
    private java.lang.String htsubmitdate  ;
    private java.lang.String htapprdate  ;
    private java.lang.String htcompletdate  ;
    private java.lang.String datavalidation  ;
    private java.lang.String timejab  ;
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


	public static final String PK_WSWZLHTMASTER = "pk_wswzlhtmaster";
	public static final String PK_ORG = "pk_org";
	public static final String PK_GROUP = "pk_group";
	public static final String CODE = "code";
	public static final String PK_ORG_V = "pk_org_v";
	public static final String MAKETIME = "maketime";
	public static final String LASTMAKETIME = "lastmaketime";
	public static final String CREATOR = "creator";
	public static final String CREATIONTIME = "creationtime";
	public static final String MODIFIER = "modifier";
	public static final String MODIFIEDTIME = "modifiedtime";
	public static final String HTCODE = "htcode";
	public static final String HTNAME = "htname";
	public static final String UNITCODE = "unitcode";
	public static final String UNITNAME = "unitname";
	public static final String SECONDUNITCODE = "secondunitcode";
	public static final String SECONDUNITNAME = "secondunitname";
	public static final String SIGNEDNAME = "signedname";
	public static final String DIRECTION = "direction";
	public static final String HTSECONDTYPE = "htsecondtype";
	public static final String HTSECONDATTR = "htsecondattr";
	public static final String MODELCODE = "modelcode";
	public static final String HTREALTYPE = "htrealtype";
	public static final String HTLEVEL = "htlevel";
	public static final String HTINDUSTRIALSECTOR = "htindustrialsector";
	public static final String INDUSTRIALSECTOR = "industrialsector";
	public static final String MILITARYATTR = "militaryattr";
	public static final String HTPRODUCTCODE = "htproductcode";
	public static final String HTPRODUCTNAME = "htproductname";
	public static final String FRAMEAGREE = "frameagree";
	public static final String FRAMEAGREECODE = "frameagreecode";
	public static final String ISOPENCONTRACT = "isopencontract";
	public static final String ISCHANGE = "ischange";
	public static final String ORIGINALHTCODE = "originalhtcode";
	public static final String HTAMOUNT = "htamount";
	public static final String HTCURRENCY = "htcurrency";
	public static final String RATE = "rate";
	public static final String HTDESCRIPTION = "htdescription";
	public static final String PRICEBASIS = "pricebasis";
	public static final String HTCONFIDENTLEVEL = "htconfidentlevel";
	public static final String HTSTATUS = "htstatus";
	public static final String HTSIGNINGDATE = "htsigningdate";
	public static final String HTEFFECTIVEDATE = "hteffectivedate";
	public static final String HTENDDATE = "htenddate";
	public static final String HTSUBMITDATE = "htsubmitdate";
	public static final String HTAPPRDATE = "htapprdate";
	public static final String HTCOMPLETDATE = "htcompletdate";
	public static final String DATAVALIDATION = "datavalidation";
	public static final String TIMEJAB = "timejab";
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

	public void setPk_wswzlhtmaster(java.lang.String pk_wswzlhtmaster){
		this.pk_wswzlhtmaster = pk_wswzlhtmaster;
	}

	public java.lang.String getPk_wswzlhtmaster(){
		return this.pk_wswzlhtmaster;
	} 
	
	public void setPk_org(java.lang.String pk_org){
		this.pk_org = pk_org;
	}

	public java.lang.String getPk_org(){
		return this.pk_org;
	} 
	
	public void setPk_group(java.lang.String pk_group){
		this.pk_group = pk_group;
	}

	public java.lang.String getPk_group(){
		return this.pk_group;
	} 
	
	public void setCode(java.lang.String code){
		this.code = code;
	}

	public java.lang.String getCode(){
		return this.code;
	} 
	
	public void setPk_org_v(java.lang.String pk_org_v){
		this.pk_org_v = pk_org_v;
	}

	public java.lang.String getPk_org_v(){
		return this.pk_org_v;
	} 
	
	public void setMaketime(nc.vo.pub.lang.UFDateTime maketime){
		this.maketime = maketime;
	}

	public nc.vo.pub.lang.UFDateTime getMaketime(){
		return this.maketime;
	} 
	
	public void setLastmaketime(nc.vo.pub.lang.UFDateTime lastmaketime){
		this.lastmaketime = lastmaketime;
	}

	public nc.vo.pub.lang.UFDateTime getLastmaketime(){
		return this.lastmaketime;
	} 
	
	public void setCreator(java.lang.String creator){
		this.creator = creator;
	}

	public java.lang.String getCreator(){
		return this.creator;
	} 
	
	public void setCreationtime(nc.vo.pub.lang.UFDateTime creationtime){
		this.creationtime = creationtime;
	}

	public nc.vo.pub.lang.UFDateTime getCreationtime(){
		return this.creationtime;
	} 
	
	public void setModifier(java.lang.String modifier){
		this.modifier = modifier;
	}

	public java.lang.String getModifier(){
		return this.modifier;
	} 
	
	public void setModifiedtime(nc.vo.pub.lang.UFDateTime modifiedtime){
		this.modifiedtime = modifiedtime;
	}

	public nc.vo.pub.lang.UFDateTime getModifiedtime(){
		return this.modifiedtime;
	} 
	
	public void setHtcode(java.lang.String htcode){
		this.htcode = htcode;
	}

	public java.lang.String getHtcode(){
		return this.htcode;
	} 
	
	public void setHtname(java.lang.String htname){
		this.htname = htname;
	}

	public java.lang.String getHtname(){
		return this.htname;
	} 
	
	public void setUnitcode(java.lang.String unitcode){
		this.unitcode = unitcode;
	}

	public java.lang.String getUnitcode(){
		return this.unitcode;
	} 
	
	public void setUnitname(java.lang.String unitname){
		this.unitname = unitname;
	}

	public java.lang.String getUnitname(){
		return this.unitname;
	} 
	
	public void setSecondunitcode(java.lang.String secondunitcode){
		this.secondunitcode = secondunitcode;
	}

	public java.lang.String getSecondunitcode(){
		return this.secondunitcode;
	} 
	
	public void setSecondunitname(java.lang.String secondunitname){
		this.secondunitname = secondunitname;
	}

	public java.lang.String getSecondunitname(){
		return this.secondunitname;
	} 
	
	public void setSignedname(java.lang.String signedname){
		this.signedname = signedname;
	}

	public java.lang.String getSignedname(){
		return this.signedname;
	} 
	
	public void setDirection(java.lang.String direction){
		this.direction = direction;
	}

	public java.lang.String getDirection(){
		return this.direction;
	} 
	
	public void setHtsecondtype(java.lang.String htsecondtype){
		this.htsecondtype = htsecondtype;
	}

	public java.lang.String getHtsecondtype(){
		return this.htsecondtype;
	} 
	
	public void setHtsecondattr(java.lang.String htsecondattr){
		this.htsecondattr = htsecondattr;
	}

	public java.lang.String getHtsecondattr(){
		return this.htsecondattr;
	} 
	
	public void setModelcode(java.lang.String modelcode){
		this.modelcode = modelcode;
	}

	public java.lang.String getModelcode(){
		return this.modelcode;
	} 
	
	public void setHtrealtype(java.lang.String htrealtype){
		this.htrealtype = htrealtype;
	}

	public java.lang.String getHtrealtype(){
		return this.htrealtype;
	} 
	
	public void setHtlevel(java.lang.String htlevel){
		this.htlevel = htlevel;
	}

	public java.lang.String getHtlevel(){
		return this.htlevel;
	} 
	
	public void setHtindustrialsector(java.lang.String htindustrialsector){
		this.htindustrialsector = htindustrialsector;
	}

	public java.lang.String getHtindustrialsector(){
		return this.htindustrialsector;
	} 
	
	public void setIndustrialsector(java.lang.String industrialsector){
		this.industrialsector = industrialsector;
	}

	public java.lang.String getIndustrialsector(){
		return this.industrialsector;
	} 
	
	public void setMilitaryattr(java.lang.String militaryattr){
		this.militaryattr = militaryattr;
	}

	public java.lang.String getMilitaryattr(){
		return this.militaryattr;
	} 
	
	public void setHtproductcode(java.lang.String htproductcode){
		this.htproductcode = htproductcode;
	}

	public java.lang.String getHtproductcode(){
		return this.htproductcode;
	} 
	
	public void setHtproductname(java.lang.String htproductname){
		this.htproductname = htproductname;
	}

	public java.lang.String getHtproductname(){
		return this.htproductname;
	} 
	
	public void setFrameagree(java.lang.String frameagree){
		this.frameagree = frameagree;
	}

	public java.lang.String getFrameagree(){
		return this.frameagree;
	} 
	
	public void setFrameagreecode(java.lang.String frameagreecode){
		this.frameagreecode = frameagreecode;
	}

	public java.lang.String getFrameagreecode(){
		return this.frameagreecode;
	} 
	
	public void setIsopencontract(java.lang.String isopencontract){
		this.isopencontract = isopencontract;
	}

	public java.lang.String getIsopencontract(){
		return this.isopencontract;
	} 
	
	public void setIschange(java.lang.String ischange){
		this.ischange = ischange;
	}

	public java.lang.String getIschange(){
		return this.ischange;
	} 
	
	public void setOriginalhtcode(java.lang.String originalhtcode){
		this.originalhtcode = originalhtcode;
	}

	public java.lang.String getOriginalhtcode(){
		return this.originalhtcode;
	} 
	
	public void setHtamount(java.lang.String htamount){
		this.htamount = htamount;
	}

	public java.lang.String getHtamount(){
		return this.htamount;
	} 
	
	public void setHtcurrency(java.lang.String htcurrency){
		this.htcurrency = htcurrency;
	}

	public java.lang.String getHtcurrency(){
		return this.htcurrency;
	} 
	
	public void setRate(java.lang.String rate){
		this.rate = rate;
	}

	public java.lang.String getRate(){
		return this.rate;
	} 
	
	public void setHtdescription(java.lang.String htdescription){
		this.htdescription = htdescription;
	}

	public java.lang.String getHtdescription(){
		return this.htdescription;
	} 
	
	public void setPricebasis(java.lang.String pricebasis){
		this.pricebasis = pricebasis;
	}

	public java.lang.String getPricebasis(){
		return this.pricebasis;
	} 
	
	public void setHtconfidentlevel(java.lang.String htconfidentlevel){
		this.htconfidentlevel = htconfidentlevel;
	}

	public java.lang.String getHtconfidentlevel(){
		return this.htconfidentlevel;
	} 
	
	public void setHtstatus(java.lang.String htstatus){
		this.htstatus = htstatus;
	}

	public java.lang.String getHtstatus(){
		return this.htstatus;
	} 
	
	public void setHtsigningdate(java.lang.String htsigningdate){
		this.htsigningdate = htsigningdate;
	}

	public java.lang.String getHtsigningdate(){
		return this.htsigningdate;
	} 
	
	public void setHteffectivedate(java.lang.String hteffectivedate){
		this.hteffectivedate = hteffectivedate;
	}

	public java.lang.String getHteffectivedate(){
		return this.hteffectivedate;
	} 
	
	public void setHtenddate(java.lang.String htenddate){
		this.htenddate = htenddate;
	}

	public java.lang.String getHtenddate(){
		return this.htenddate;
	} 
	
	public void setHtsubmitdate(java.lang.String htsubmitdate){
		this.htsubmitdate = htsubmitdate;
	}

	public java.lang.String getHtsubmitdate(){
		return this.htsubmitdate;
	} 
	
	public void setHtapprdate(java.lang.String htapprdate){
		this.htapprdate = htapprdate;
	}

	public java.lang.String getHtapprdate(){
		return this.htapprdate;
	} 
	
	public void setHtcompletdate(java.lang.String htcompletdate){
		this.htcompletdate = htcompletdate;
	}

	public java.lang.String getHtcompletdate(){
		return this.htcompletdate;
	} 
	
	public void setDatavalidation(java.lang.String datavalidation){
		this.datavalidation = datavalidation;
	}

	public java.lang.String getDatavalidation(){
		return this.datavalidation;
	} 
	
	public void setTimejab(java.lang.String timejab){
		this.timejab = timejab;
	}

	public java.lang.String getTimejab(){
		return this.timejab;
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
	
	
	
	public java.lang.String getParentPKFieldName() {
	    return null;
	}   
    
	@Override
	public java.lang.String getPKFieldName() {
	  return "pk_wswzlhtmaster";
	}
    
	/**
	 * <p>返回表名称.
	 * <p>
	 * 创建日期:
	 * @return java.lang.String
	 */
	@Override
	public java.lang.String getTableName() {
		return "wsht_wswzlhtmaster";
	}
	
	public static java.lang.String getDefaultTableName() {
		return "wsht_wswzlhtmaster";
	}    
    
	@Override
	@nc.vo.annotation.MDEntityInfo(beanFullclassName =  "nc.vo.wsht.wswzlht.WswzlhtMasterVO" )
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("wsht.wswzlhtMaster");
  	}
  	
}
