package nc.vo.htgjzb.htgjzb;

import nc.vo.pub.*;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class Htwbxx extends SuperVO {

    //构造方法
    public Htwbxx() {
        super();
    }


    private java.lang.String pk_htgjzbslave7;
    private java.lang.String htcode;
    private java.lang.String htbodygeneramethod;
    private java.lang.String httextfile;
    private java.lang.String htsignedfile;
    private java.lang.String attachtype;
    private java.lang.String attachflie;
    private java.lang.String htsignbasis;
    private java.lang.String signfilecode;
    private java.lang.String signfile;
    private java.lang.String htplantext;
    private java.lang.String htplandate;
    private java.lang.String htplancompletstatus;
    private java.lang.String externalhtcode;
    private java.lang.String isbelongs;
    private java.lang.String def1;
    private java.lang.String def2;
    private java.lang.String def3;
    private java.lang.String def4;
    private java.lang.String def5;
    private java.lang.String def6;
    private java.lang.String def7;
    private java.lang.String def8;
    private java.lang.String def9;
    private java.lang.String def10;
    private java.lang.String def11;
    private java.lang.String def12;
    private java.lang.String def13;
    private java.lang.String def14;
    private java.lang.String def15;
    private java.lang.String def16;
    private java.lang.String def17;
    private java.lang.String def18;
    private java.lang.String def19;
    private java.lang.String def20;
    private java.lang.Integer dr;
    private nc.vo.pub.lang.UFDateTime ts;
    private java.lang.String pk_htgjzbmaster;


    public static final String PK_HTGJZBSLAVE7 = "pk_htgjzbslave7";
    public static final String HTCODE = "htcode";
    public static final String HTBODYGENERAMETHOD = "htbodygeneramethod";
    public static final String HTTEXTFILE = "httextfile";
    public static final String HTSIGNEDFILE = "htsignedfile";
    public static final String ATTACHTYPE = "attachtype";
    public static final String ATTACHFLIE = "attachflie";
    public static final String HTSIGNBASIS = "htsignbasis";
    public static final String SIGNFILECODE = "signfilecode";
    public static final String SIGNFILE = "signfile";
    public static final String HTPLANTEXT = "htplantext";
    public static final String HTPLANDATE = "htplandate";
    public static final String HTPLANCOMPLETSTATUS = "htplancompletstatus";
    public static final String EXTERNALHTCODE = "externalhtcode";
    public static final String ISBELONGS = "isbelongs";
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
    public static final String DR = "dr";
    public static final String TS = "ts";
    public static final String PK_HTGJZBMASTER = "pk_htgjzbmaster";

    public void setPk_htgjzbslave7(java.lang.String pk_htgjzbslave7) {
        this.pk_htgjzbslave7 = pk_htgjzbslave7;
    }

    public java.lang.String getPk_htgjzbslave7() {
        return this.pk_htgjzbslave7;
    }

    public void setHtcode(java.lang.String htcode) {
        this.htcode = htcode;
    }

    public java.lang.String getHtcode() {
        return this.htcode;
    }

    public void setHtbodygeneramethod(java.lang.String htbodygeneramethod) {
        this.htbodygeneramethod = htbodygeneramethod;
    }

    public java.lang.String getHtbodygeneramethod() {
        return this.htbodygeneramethod;
    }

    public void setHttextfile(java.lang.String httextfile) {
        this.httextfile = httextfile;
    }

    public java.lang.String getHttextfile() {
        return this.httextfile;
    }

    public void setHtsignedfile(java.lang.String htsignedfile) {
        this.htsignedfile = htsignedfile;
    }

    public java.lang.String getHtsignedfile() {
        return this.htsignedfile;
    }

    public void setAttachtype(java.lang.String attachtype) {
        this.attachtype = attachtype;
    }

    public java.lang.String getAttachtype() {
        return this.attachtype;
    }

    public void setAttachflie(java.lang.String attachflie) {
        this.attachflie = attachflie;
    }

    public java.lang.String getAttachflie() {
        return this.attachflie;
    }

    public void setHtsignbasis(java.lang.String htsignbasis) {
        this.htsignbasis = htsignbasis;
    }

    public java.lang.String getHtsignbasis() {
        return this.htsignbasis;
    }

    public void setSignfilecode(java.lang.String signfilecode) {
        this.signfilecode = signfilecode;
    }

    public java.lang.String getSignfilecode() {
        return this.signfilecode;
    }

    public void setSignfile(java.lang.String signfile) {
        this.signfile = signfile;
    }

    public java.lang.String getSignfile() {
        return this.signfile;
    }

    public void setHtplantext(java.lang.String htplantext) {
        this.htplantext = htplantext;
    }

    public java.lang.String getHtplantext() {
        return this.htplantext;
    }

    public void setHtplandate(java.lang.String htplandate) {
        this.htplandate = htplandate;
    }

    public java.lang.String getHtplandate() {
        return this.htplandate;
    }

    public void setHtplancompletstatus(java.lang.String htplancompletstatus) {
        this.htplancompletstatus = htplancompletstatus;
    }

    public java.lang.String getHtplancompletstatus() {
        return this.htplancompletstatus;
    }

    public void setExternalhtcode(java.lang.String externalhtcode) {
        this.externalhtcode = externalhtcode;
    }

    public java.lang.String getExternalhtcode() {
        return this.externalhtcode;
    }

    public void setIsbelongs(java.lang.String isbelongs) {
        this.isbelongs = isbelongs;
    }

    public java.lang.String getIsbelongs() {
        return this.isbelongs;
    }

    public void setDef1(java.lang.String def1) {
        this.def1 = def1;
    }

    public java.lang.String getDef1() {
        return this.def1;
    }

    public void setDef2(java.lang.String def2) {
        this.def2 = def2;
    }

    public java.lang.String getDef2() {
        return this.def2;
    }

    public void setDef3(java.lang.String def3) {
        this.def3 = def3;
    }

    public java.lang.String getDef3() {
        return this.def3;
    }

    public void setDef4(java.lang.String def4) {
        this.def4 = def4;
    }

    public java.lang.String getDef4() {
        return this.def4;
    }

    public void setDef5(java.lang.String def5) {
        this.def5 = def5;
    }

    public java.lang.String getDef5() {
        return this.def5;
    }

    public void setDef6(java.lang.String def6) {
        this.def6 = def6;
    }

    public java.lang.String getDef6() {
        return this.def6;
    }

    public void setDef7(java.lang.String def7) {
        this.def7 = def7;
    }

    public java.lang.String getDef7() {
        return this.def7;
    }

    public void setDef8(java.lang.String def8) {
        this.def8 = def8;
    }

    public java.lang.String getDef8() {
        return this.def8;
    }

    public void setDef9(java.lang.String def9) {
        this.def9 = def9;
    }

    public java.lang.String getDef9() {
        return this.def9;
    }

    public void setDef10(java.lang.String def10) {
        this.def10 = def10;
    }

    public java.lang.String getDef10() {
        return this.def10;
    }

    public void setDef11(java.lang.String def11) {
        this.def11 = def11;
    }

    public java.lang.String getDef11() {
        return this.def11;
    }

    public void setDef12(java.lang.String def12) {
        this.def12 = def12;
    }

    public java.lang.String getDef12() {
        return this.def12;
    }

    public void setDef13(java.lang.String def13) {
        this.def13 = def13;
    }

    public java.lang.String getDef13() {
        return this.def13;
    }

    public void setDef14(java.lang.String def14) {
        this.def14 = def14;
    }

    public java.lang.String getDef14() {
        return this.def14;
    }

    public void setDef15(java.lang.String def15) {
        this.def15 = def15;
    }

    public java.lang.String getDef15() {
        return this.def15;
    }

    public void setDef16(java.lang.String def16) {
        this.def16 = def16;
    }

    public java.lang.String getDef16() {
        return this.def16;
    }

    public void setDef17(java.lang.String def17) {
        this.def17 = def17;
    }

    public java.lang.String getDef17() {
        return this.def17;
    }

    public void setDef18(java.lang.String def18) {
        this.def18 = def18;
    }

    public java.lang.String getDef18() {
        return this.def18;
    }

    public void setDef19(java.lang.String def19) {
        this.def19 = def19;
    }

    public java.lang.String getDef19() {
        return this.def19;
    }

    public void setDef20(java.lang.String def20) {
        this.def20 = def20;
    }

    public java.lang.String getDef20() {
        return this.def20;
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


    public void setPk_htgjzbmaster(java.lang.String pk_htgjzbmaster) {
        this.pk_htgjzbmaster = pk_htgjzbmaster;
    }

    public java.lang.String getPk_htgjzbmaster() {
        return this.pk_htgjzbmaster;
    }


    public java.lang.String getParentPKFieldName() {
        return null;
    }

    @Override
    public java.lang.String getPKFieldName() {
        return "pk_htgjzbslave7";
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
        return "pmbd_htwbxx";
    }

    public static java.lang.String getDefaultTableName() {
        return "pmbd_htwbxx";
    }

    @Override
    @nc.vo.annotation.MDEntityInfo(beanFullclassName = "nc.vo.htgjzb.htgjzb.Htwbxx")
    public IVOMeta getMetaData() {
        return VOMetaFactory.getInstance().getVOMeta("htgjzb.htwbxx");
    }

}
