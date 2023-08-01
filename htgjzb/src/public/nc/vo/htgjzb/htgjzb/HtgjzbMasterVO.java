package nc.vo.htgjzb.htgjzb;

import nc.vo.pub.*;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class HtgjzbMasterVO extends SuperVO {

    //构造方法
    public HtgjzbMasterVO() {
        super();
    }


    private java.lang.String pk_htgjzbmaster;
    private java.lang.String pk_org;
    private java.lang.String pk_group;
    private java.lang.String code;
    private java.lang.String pk_org_v;
    private nc.vo.pub.lang.UFDateTime maketime;
    private nc.vo.pub.lang.UFDateTime lastmaketime;
    private java.lang.String creator;
    private nc.vo.pub.lang.UFDateTime creationtime;
    private java.lang.String modifier;
    private nc.vo.pub.lang.UFDateTime modifiedtime;
    private java.lang.String htcode;
    private java.lang.String htname;
    private java.lang.String unitcode;
    private java.lang.String unitname;
    private java.lang.String secondunitcode;
    private java.lang.String secondunitname;
    private java.lang.String signedname;
    private java.lang.String direction;
    private java.lang.String htsecondtype;
    private java.lang.String htsecondattr;
    private java.lang.String modelcode;
    private java.lang.String htrealtype;
    private java.lang.String htlevel;
    private java.lang.String htindustrialsector;
    private java.lang.String industrialsector;
    private java.lang.String militaryattr;
    private java.lang.String htproductcode;
    private java.lang.String htproductname;
    private java.lang.String frameagree;
    private java.lang.String frameagreecode;
    private java.lang.String isopencontract;
    private java.lang.String ischange;
    private java.lang.String originalhtcode;
    private java.lang.String htamount;
    private java.lang.String htcurrency;
    private java.lang.String rate;
    private java.lang.String htdescription;
    private java.lang.String pricebasis;
    private java.lang.String htconfidentlevel;
    private java.lang.String htstatus;
    private java.lang.String htsigningdate;
    private java.lang.String hteffectivedate;
    private java.lang.String htenddate;
    private java.lang.String htsubmitdate;
    private java.lang.String htapprdate;
    private java.lang.String htcompletdate;
    private java.lang.String datavalidation;
    private java.lang.String timejab;
    private java.lang.String vdef1;
    private java.lang.String vdef2;
    private java.lang.String vdef3;
    private java.lang.String vdef4;
    private java.lang.String vdef5;
    private java.lang.String vdef6;
    private java.lang.String vdef7;
    private java.lang.String vdef8;
    private java.lang.String vdef9;
    private java.lang.String vdef10;
    private java.lang.String vdef11;
    private java.lang.String vdef12;
    private java.lang.String vdef13;
    private java.lang.String vdef14;
    private java.lang.String vdef15;
    private java.lang.String vdef16;
    private java.lang.String vdef17;
    private java.lang.String vdef18;
    private java.lang.String vdef19;
    private java.lang.String vdef20;
    private java.lang.String vdef21;
    private java.lang.String vdef22;
    private java.lang.String vdef23;
    private java.lang.String vdef24;
    private java.lang.String vdef25;
    private java.lang.String vdef26;
    private java.lang.String vdef27;
    private java.lang.String vdef28;
    private java.lang.String vdef29;
    private java.lang.String vdef30;
    private java.lang.Integer dr;
    private nc.vo.pub.lang.UFDateTime ts;


    public static final String PK_HTGJZBMASTER = "pk_htgjzbmaster";
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
    public static final String VDEF1 = "vdef1";
    public static final String VDEF2 = "vdef2";
    public static final String VDEF3 = "vdef3";
    public static final String VDEF4 = "vdef4";
    public static final String VDEF5 = "vdef5";
    public static final String VDEF6 = "vdef6";
    public static final String VDEF7 = "vdef7";
    public static final String VDEF8 = "vdef8";
    public static final String VDEF9 = "vdef9";
    public static final String VDEF10 = "vdef10";
    public static final String VDEF11 = "vdef11";
    public static final String VDEF12 = "vdef12";
    public static final String VDEF13 = "vdef13";
    public static final String VDEF14 = "vdef14";
    public static final String VDEF15 = "vdef15";
    public static final String VDEF16 = "vdef16";
    public static final String VDEF17 = "vdef17";
    public static final String VDEF18 = "vdef18";
    public static final String VDEF19 = "vdef19";
    public static final String VDEF20 = "vdef20";
    public static final String VDEF21 = "vdef21";
    public static final String VDEF22 = "vdef22";
    public static final String VDEF23 = "vdef23";
    public static final String VDEF24 = "vdef24";
    public static final String VDEF25 = "vdef25";
    public static final String VDEF26 = "vdef26";
    public static final String VDEF27 = "vdef27";
    public static final String VDEF28 = "vdef28";
    public static final String VDEF29 = "vdef29";
    public static final String VDEF30 = "vdef30";
    public static final String DR = "dr";
    public static final String TS = "ts";

    public void setPk_htgjzbmaster(java.lang.String pk_htgjzbmaster) {
        this.pk_htgjzbmaster = pk_htgjzbmaster;
    }

    public java.lang.String getPk_htgjzbmaster() {
        return this.pk_htgjzbmaster;
    }

    public void setPk_org(java.lang.String pk_org) {
        this.pk_org = pk_org;
    }

    public java.lang.String getPk_org() {
        return this.pk_org;
    }

    public void setPk_group(java.lang.String pk_group) {
        this.pk_group = pk_group;
    }

    public java.lang.String getPk_group() {
        return this.pk_group;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public void setPk_org_v(java.lang.String pk_org_v) {
        this.pk_org_v = pk_org_v;
    }

    public java.lang.String getPk_org_v() {
        return this.pk_org_v;
    }

    public void setMaketime(nc.vo.pub.lang.UFDateTime maketime) {
        this.maketime = maketime;
    }

    public nc.vo.pub.lang.UFDateTime getMaketime() {
        return this.maketime;
    }

    public void setLastmaketime(nc.vo.pub.lang.UFDateTime lastmaketime) {
        this.lastmaketime = lastmaketime;
    }

    public nc.vo.pub.lang.UFDateTime getLastmaketime() {
        return this.lastmaketime;
    }

    public void setCreator(java.lang.String creator) {
        this.creator = creator;
    }

    public java.lang.String getCreator() {
        return this.creator;
    }

    public void setCreationtime(nc.vo.pub.lang.UFDateTime creationtime) {
        this.creationtime = creationtime;
    }

    public nc.vo.pub.lang.UFDateTime getCreationtime() {
        return this.creationtime;
    }

    public void setModifier(java.lang.String modifier) {
        this.modifier = modifier;
    }

    public java.lang.String getModifier() {
        return this.modifier;
    }

    public void setModifiedtime(nc.vo.pub.lang.UFDateTime modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public nc.vo.pub.lang.UFDateTime getModifiedtime() {
        return this.modifiedtime;
    }

    public void setHtcode(java.lang.String htcode) {
        this.htcode = htcode;
    }

    public java.lang.String getHtcode() {
        return this.htcode;
    }

    public void setHtname(java.lang.String htname) {
        this.htname = htname;
    }

    public java.lang.String getHtname() {
        return this.htname;
    }

    public void setUnitcode(java.lang.String unitcode) {
        this.unitcode = unitcode;
    }

    public java.lang.String getUnitcode() {
        return this.unitcode;
    }

    public void setUnitname(java.lang.String unitname) {
        this.unitname = unitname;
    }

    public java.lang.String getUnitname() {
        return this.unitname;
    }

    public void setSecondunitcode(java.lang.String secondunitcode) {
        this.secondunitcode = secondunitcode;
    }

    public java.lang.String getSecondunitcode() {
        return this.secondunitcode;
    }

    public void setSecondunitname(java.lang.String secondunitname) {
        this.secondunitname = secondunitname;
    }

    public java.lang.String getSecondunitname() {
        return this.secondunitname;
    }

    public void setSignedname(java.lang.String signedname) {
        this.signedname = signedname;
    }

    public java.lang.String getSignedname() {
        return this.signedname;
    }

    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }

    public java.lang.String getDirection() {
        return this.direction;
    }

    public void setHtsecondtype(java.lang.String htsecondtype) {
        this.htsecondtype = htsecondtype;
    }

    public java.lang.String getHtsecondtype() {
        return this.htsecondtype;
    }

    public void setHtsecondattr(java.lang.String htsecondattr) {
        this.htsecondattr = htsecondattr;
    }

    public java.lang.String getHtsecondattr() {
        return this.htsecondattr;
    }

    public void setModelcode(java.lang.String modelcode) {
        this.modelcode = modelcode;
    }

    public java.lang.String getModelcode() {
        return this.modelcode;
    }

    public void setHtrealtype(java.lang.String htrealtype) {
        this.htrealtype = htrealtype;
    }

    public java.lang.String getHtrealtype() {
        return this.htrealtype;
    }

    public void setHtlevel(java.lang.String htlevel) {
        this.htlevel = htlevel;
    }

    public java.lang.String getHtlevel() {
        return this.htlevel;
    }

    public void setHtindustrialsector(java.lang.String htindustrialsector) {
        this.htindustrialsector = htindustrialsector;
    }

    public java.lang.String getHtindustrialsector() {
        return this.htindustrialsector;
    }

    public void setIndustrialsector(java.lang.String industrialsector) {
        this.industrialsector = industrialsector;
    }

    public java.lang.String getIndustrialsector() {
        return this.industrialsector;
    }

    public void setMilitaryattr(java.lang.String militaryattr) {
        this.militaryattr = militaryattr;
    }

    public java.lang.String getMilitaryattr() {
        return this.militaryattr;
    }

    public void setHtproductcode(java.lang.String htproductcode) {
        this.htproductcode = htproductcode;
    }

    public java.lang.String getHtproductcode() {
        return this.htproductcode;
    }

    public void setHtproductname(java.lang.String htproductname) {
        this.htproductname = htproductname;
    }

    public java.lang.String getHtproductname() {
        return this.htproductname;
    }

    public void setFrameagree(java.lang.String frameagree) {
        this.frameagree = frameagree;
    }

    public java.lang.String getFrameagree() {
        return this.frameagree;
    }

    public void setFrameagreecode(java.lang.String frameagreecode) {
        this.frameagreecode = frameagreecode;
    }

    public java.lang.String getFrameagreecode() {
        return this.frameagreecode;
    }

    public void setIsopencontract(java.lang.String isopencontract) {
        this.isopencontract = isopencontract;
    }

    public java.lang.String getIsopencontract() {
        return this.isopencontract;
    }

    public void setIschange(java.lang.String ischange) {
        this.ischange = ischange;
    }

    public java.lang.String getIschange() {
        return this.ischange;
    }

    public void setOriginalhtcode(java.lang.String originalhtcode) {
        this.originalhtcode = originalhtcode;
    }

    public java.lang.String getOriginalhtcode() {
        return this.originalhtcode;
    }

    public void setHtamount(java.lang.String htamount) {
        this.htamount = htamount;
    }

    public java.lang.String getHtamount() {
        return this.htamount;
    }

    public void setHtcurrency(java.lang.String htcurrency) {
        this.htcurrency = htcurrency;
    }

    public java.lang.String getHtcurrency() {
        return this.htcurrency;
    }

    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }

    public java.lang.String getRate() {
        return this.rate;
    }

    public void setHtdescription(java.lang.String htdescription) {
        this.htdescription = htdescription;
    }

    public java.lang.String getHtdescription() {
        return this.htdescription;
    }

    public void setPricebasis(java.lang.String pricebasis) {
        this.pricebasis = pricebasis;
    }

    public java.lang.String getPricebasis() {
        return this.pricebasis;
    }

    public void setHtconfidentlevel(java.lang.String htconfidentlevel) {
        this.htconfidentlevel = htconfidentlevel;
    }

    public java.lang.String getHtconfidentlevel() {
        return this.htconfidentlevel;
    }

    public void setHtstatus(java.lang.String htstatus) {
        this.htstatus = htstatus;
    }

    public java.lang.String getHtstatus() {
        return this.htstatus;
    }

    public void setHtsigningdate(java.lang.String htsigningdate) {
        this.htsigningdate = htsigningdate;
    }

    public java.lang.String getHtsigningdate() {
        return this.htsigningdate;
    }

    public void setHteffectivedate(java.lang.String hteffectivedate) {
        this.hteffectivedate = hteffectivedate;
    }

    public java.lang.String getHteffectivedate() {
        return this.hteffectivedate;
    }

    public void setHtenddate(java.lang.String htenddate) {
        this.htenddate = htenddate;
    }

    public java.lang.String getHtenddate() {
        return this.htenddate;
    }

    public void setHtsubmitdate(java.lang.String htsubmitdate) {
        this.htsubmitdate = htsubmitdate;
    }

    public java.lang.String getHtsubmitdate() {
        return this.htsubmitdate;
    }

    public void setHtapprdate(java.lang.String htapprdate) {
        this.htapprdate = htapprdate;
    }

    public java.lang.String getHtapprdate() {
        return this.htapprdate;
    }

    public void setHtcompletdate(java.lang.String htcompletdate) {
        this.htcompletdate = htcompletdate;
    }

    public java.lang.String getHtcompletdate() {
        return this.htcompletdate;
    }

    public void setDatavalidation(java.lang.String datavalidation) {
        this.datavalidation = datavalidation;
    }

    public java.lang.String getDatavalidation() {
        return this.datavalidation;
    }

    public void setTimejab(java.lang.String timejab) {
        this.timejab = timejab;
    }

    public java.lang.String getTimejab() {
        return this.timejab;
    }

    public void setVdef1(java.lang.String vdef1) {
        this.vdef1 = vdef1;
    }

    public java.lang.String getVdef1() {
        return this.vdef1;
    }

    public void setVdef2(java.lang.String vdef2) {
        this.vdef2 = vdef2;
    }

    public java.lang.String getVdef2() {
        return this.vdef2;
    }

    public void setVdef3(java.lang.String vdef3) {
        this.vdef3 = vdef3;
    }

    public java.lang.String getVdef3() {
        return this.vdef3;
    }

    public void setVdef4(java.lang.String vdef4) {
        this.vdef4 = vdef4;
    }

    public java.lang.String getVdef4() {
        return this.vdef4;
    }

    public void setVdef5(java.lang.String vdef5) {
        this.vdef5 = vdef5;
    }

    public java.lang.String getVdef5() {
        return this.vdef5;
    }

    public void setVdef6(java.lang.String vdef6) {
        this.vdef6 = vdef6;
    }

    public java.lang.String getVdef6() {
        return this.vdef6;
    }

    public void setVdef7(java.lang.String vdef7) {
        this.vdef7 = vdef7;
    }

    public java.lang.String getVdef7() {
        return this.vdef7;
    }

    public void setVdef8(java.lang.String vdef8) {
        this.vdef8 = vdef8;
    }

    public java.lang.String getVdef8() {
        return this.vdef8;
    }

    public void setVdef9(java.lang.String vdef9) {
        this.vdef9 = vdef9;
    }

    public java.lang.String getVdef9() {
        return this.vdef9;
    }

    public void setVdef10(java.lang.String vdef10) {
        this.vdef10 = vdef10;
    }

    public java.lang.String getVdef10() {
        return this.vdef10;
    }

    public void setVdef11(java.lang.String vdef11) {
        this.vdef11 = vdef11;
    }

    public java.lang.String getVdef11() {
        return this.vdef11;
    }

    public void setVdef12(java.lang.String vdef12) {
        this.vdef12 = vdef12;
    }

    public java.lang.String getVdef12() {
        return this.vdef12;
    }

    public void setVdef13(java.lang.String vdef13) {
        this.vdef13 = vdef13;
    }

    public java.lang.String getVdef13() {
        return this.vdef13;
    }

    public void setVdef14(java.lang.String vdef14) {
        this.vdef14 = vdef14;
    }

    public java.lang.String getVdef14() {
        return this.vdef14;
    }

    public void setVdef15(java.lang.String vdef15) {
        this.vdef15 = vdef15;
    }

    public java.lang.String getVdef15() {
        return this.vdef15;
    }

    public void setVdef16(java.lang.String vdef16) {
        this.vdef16 = vdef16;
    }

    public java.lang.String getVdef16() {
        return this.vdef16;
    }

    public void setVdef17(java.lang.String vdef17) {
        this.vdef17 = vdef17;
    }

    public java.lang.String getVdef17() {
        return this.vdef17;
    }

    public void setVdef18(java.lang.String vdef18) {
        this.vdef18 = vdef18;
    }

    public java.lang.String getVdef18() {
        return this.vdef18;
    }

    public void setVdef19(java.lang.String vdef19) {
        this.vdef19 = vdef19;
    }

    public java.lang.String getVdef19() {
        return this.vdef19;
    }

    public void setVdef20(java.lang.String vdef20) {
        this.vdef20 = vdef20;
    }

    public java.lang.String getVdef20() {
        return this.vdef20;
    }

    public void setVdef21(java.lang.String vdef21) {
        this.vdef21 = vdef21;
    }

    public java.lang.String getVdef21() {
        return this.vdef21;
    }

    public void setVdef22(java.lang.String vdef22) {
        this.vdef22 = vdef22;
    }

    public java.lang.String getVdef22() {
        return this.vdef22;
    }

    public void setVdef23(java.lang.String vdef23) {
        this.vdef23 = vdef23;
    }

    public java.lang.String getVdef23() {
        return this.vdef23;
    }

    public void setVdef24(java.lang.String vdef24) {
        this.vdef24 = vdef24;
    }

    public java.lang.String getVdef24() {
        return this.vdef24;
    }

    public void setVdef25(java.lang.String vdef25) {
        this.vdef25 = vdef25;
    }

    public java.lang.String getVdef25() {
        return this.vdef25;
    }

    public void setVdef26(java.lang.String vdef26) {
        this.vdef26 = vdef26;
    }

    public java.lang.String getVdef26() {
        return this.vdef26;
    }

    public void setVdef27(java.lang.String vdef27) {
        this.vdef27 = vdef27;
    }

    public java.lang.String getVdef27() {
        return this.vdef27;
    }

    public void setVdef28(java.lang.String vdef28) {
        this.vdef28 = vdef28;
    }

    public java.lang.String getVdef28() {
        return this.vdef28;
    }

    public void setVdef29(java.lang.String vdef29) {
        this.vdef29 = vdef29;
    }

    public java.lang.String getVdef29() {
        return this.vdef29;
    }

    public void setVdef30(java.lang.String vdef30) {
        this.vdef30 = vdef30;
    }

    public java.lang.String getVdef30() {
        return this.vdef30;
    }

    public void setDr(java.lang.Integer dr) {
        this.dr = dr;
    }

    public java.lang.Integer getDr() {
        return this.dr;
    }

    public void setTs(nc.vo.pub.lang.UFDateTime ts) {
        this.ts = ts;
    }

    public nc.vo.pub.lang.UFDateTime getTs() {
        return this.ts;
    }


    public java.lang.String getParentPKFieldName() {
        return null;
    }

    @Override
    public java.lang.String getPKFieldName() {
        return "pk_htgjzbmaster";
    }

    /**
     * <p>返回表名称.
     * <p>
     * 创建日期:
     *
     * @return java.lang.String
     */
    @Override
    public java.lang.String getTableName() {
        return "pmbd_htgjzbmaster";
    }

    public static java.lang.String getDefaultTableName() {
        return "pmbd_htgjzbmaster";
    }

    @Override
    @nc.vo.annotation.MDEntityInfo(beanFullclassName = "nc.vo.htgjzb.htgjzb.HtgjzbMasterVO")
    public IVOMeta getMetaData() {
        return VOMetaFactory.getInstance().getVOMeta("htgjzb.htgjzbMaster");
    }

}
