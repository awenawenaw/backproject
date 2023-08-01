package nc.vo.htgjzb.htgjzb;

import nc.vo.pub.*;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class Xdfxx extends SuperVO {

    //构造方法
    public Xdfxx() {
        super();
    }


    private java.lang.String pk_htgjzbslave0;
    private java.lang.String rowno;
    private java.lang.String srcrowno;
    private java.lang.String code;
    private java.lang.String htcode;
    private java.lang.String unitcode;
    private java.lang.String counterpartcode;
    private java.lang.String counterpartname;
    private java.lang.String counterpartmain;
    private java.lang.String wemain;
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
    private java.lang.String counterparttype;
    private java.lang.String counterpartunit;
    private java.lang.String counterpartcountry;
    private java.lang.String counterpartaddr;
    private java.lang.String taxnumber;
    private java.lang.String otherbankname;
    private java.lang.String otherbankaccount;
    private java.lang.String webankname;
    private java.lang.String webankaccount;
    private java.lang.String datavalid;
    private java.lang.String def1;
    private java.lang.String def2;
    private java.lang.String def3;
    private java.lang.String def4;
    private java.lang.String def5;
    private java.lang.Integer dr;
    private nc.vo.pub.lang.UFDateTime ts;
    private java.lang.String pk_htgjzbmaster;


    public static final String PK_HTGJZBSLAVE0 = "pk_htgjzbslave0";
    public static final String ROWNO = "rowno";
    public static final String SRCROWNO = "srcrowno";
    public static final String CODE = "code";
    public static final String HTCODE = "htcode";
    public static final String UNITCODE = "unitcode";
    public static final String COUNTERPARTCODE = "counterpartcode";
    public static final String COUNTERPARTNAME = "counterpartname";
    public static final String COUNTERPARTMAIN = "counterpartmain";
    public static final String WEMAIN = "wemain";
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
    public static final String COUNTERPARTTYPE = "counterparttype";
    public static final String COUNTERPARTUNIT = "counterpartunit";
    public static final String COUNTERPARTCOUNTRY = "counterpartcountry";
    public static final String COUNTERPARTADDR = "counterpartaddr";
    public static final String TAXNUMBER = "taxnumber";
    public static final String OTHERBANKNAME = "otherbankname";
    public static final String OTHERBANKACCOUNT = "otherbankaccount";
    public static final String WEBANKNAME = "webankname";
    public static final String WEBANKACCOUNT = "webankaccount";
    public static final String DATAVALID = "datavalid";
    public static final String DEF1 = "def1";
    public static final String DEF2 = "def2";
    public static final String DEF3 = "def3";
    public static final String DEF4 = "def4";
    public static final String DEF5 = "def5";
    public static final String DR = "dr";
    public static final String TS = "ts";
    public static final String PK_HTGJZBMASTER = "pk_htgjzbmaster";

    public void setPk_htgjzbslave0(java.lang.String pk_htgjzbslave0) {
        this.pk_htgjzbslave0 = pk_htgjzbslave0;
    }

    public java.lang.String getPk_htgjzbslave0() {
        return this.pk_htgjzbslave0;
    }

    public void setRowno(java.lang.String rowno) {
        this.rowno = rowno;
    }

    public java.lang.String getRowno() {
        return this.rowno;
    }

    public void setSrcrowno(java.lang.String srcrowno) {
        this.srcrowno = srcrowno;
    }

    public java.lang.String getSrcrowno() {
        return this.srcrowno;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public void setHtcode(java.lang.String htcode) {
        this.htcode = htcode;
    }

    public java.lang.String getHtcode() {
        return this.htcode;
    }

    public void setUnitcode(java.lang.String unitcode) {
        this.unitcode = unitcode;
    }

    public java.lang.String getUnitcode() {
        return this.unitcode;
    }

    public void setCounterpartcode(java.lang.String counterpartcode) {
        this.counterpartcode = counterpartcode;
    }

    public java.lang.String getCounterpartcode() {
        return this.counterpartcode;
    }

    public void setCounterpartname(java.lang.String counterpartname) {
        this.counterpartname = counterpartname;
    }

    public java.lang.String getCounterpartname() {
        return this.counterpartname;
    }

    public void setCounterpartmain(java.lang.String counterpartmain) {
        this.counterpartmain = counterpartmain;
    }

    public java.lang.String getCounterpartmain() {
        return this.counterpartmain;
    }

    public void setWemain(java.lang.String wemain) {
        this.wemain = wemain;
    }

    public java.lang.String getWemain() {
        return this.wemain;
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

    public void setCounterparttype(java.lang.String counterparttype) {
        this.counterparttype = counterparttype;
    }

    public java.lang.String getCounterparttype() {
        return this.counterparttype;
    }

    public void setCounterpartunit(java.lang.String counterpartunit) {
        this.counterpartunit = counterpartunit;
    }

    public java.lang.String getCounterpartunit() {
        return this.counterpartunit;
    }

    public void setCounterpartcountry(java.lang.String counterpartcountry) {
        this.counterpartcountry = counterpartcountry;
    }

    public java.lang.String getCounterpartcountry() {
        return this.counterpartcountry;
    }

    public void setCounterpartaddr(java.lang.String counterpartaddr) {
        this.counterpartaddr = counterpartaddr;
    }

    public java.lang.String getCounterpartaddr() {
        return this.counterpartaddr;
    }

    public void setTaxnumber(java.lang.String taxnumber) {
        this.taxnumber = taxnumber;
    }

    public java.lang.String getTaxnumber() {
        return this.taxnumber;
    }

    public void setOtherbankname(java.lang.String otherbankname) {
        this.otherbankname = otherbankname;
    }

    public java.lang.String getOtherbankname() {
        return this.otherbankname;
    }

    public void setOtherbankaccount(java.lang.String otherbankaccount) {
        this.otherbankaccount = otherbankaccount;
    }

    public java.lang.String getOtherbankaccount() {
        return this.otherbankaccount;
    }

    public void setWebankname(java.lang.String webankname) {
        this.webankname = webankname;
    }

    public java.lang.String getWebankname() {
        return this.webankname;
    }

    public void setWebankaccount(java.lang.String webankaccount) {
        this.webankaccount = webankaccount;
    }

    public java.lang.String getWebankaccount() {
        return this.webankaccount;
    }

    public void setDatavalid(java.lang.String datavalid) {
        this.datavalid = datavalid;
    }

    public java.lang.String getDatavalid() {
        return this.datavalid;
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
        return "pk_htgjzbslave0";
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
        return "pmbd_xdfxx";
    }

    public static java.lang.String getDefaultTableName() {
        return "pmbd_xdfxx";
    }

    @Override
    @nc.vo.annotation.MDEntityInfo(beanFullclassName = "nc.vo.htgjzb.htgjzb.Xdfxx")
    public IVOMeta getMetaData() {
        return VOMetaFactory.getInstance().getVOMeta("htgjzb.xdfxx");
    }

}
