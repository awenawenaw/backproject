 create table WSH_XSCKDMASTER (def30 varchar2(101) null /*自定义项30*/,
def29 varchar2(101) null /*自定义项29*/,
def28 varchar2(101) null /*自定义项28*/,
def27 varchar2(101) null /*自定义项27*/,
def26 varchar2(101) null /*自定义项26*/,
def25 varchar2(101) null /*自定义项25*/,
def24 varchar2(101) null /*自定义项24*/,
def23 varchar2(101) null /*自定义项23*/,
def22 varchar2(101) null /*自定义项22*/,
def21 varchar2(101) null /*自定义项21*/,
def20 varchar2(101) null /*自定义项20*/,
def19 varchar2(101) null /*自定义项19*/,
def18 varchar2(101) null /*自定义项18*/,
def17 varchar2(101) null /*自定义项17*/,
def16 varchar2(101) null /*自定义项16*/,
def15 varchar2(101) null /*自定义项15*/,
def14 varchar2(101) null /*自定义项14*/,
def13 varchar2(101) null /*自定义项13*/,
def12 varchar2(101) null /*自定义项12*/,
def11 varchar2(101) null /*自定义项11*/,
def10 varchar2(101) null /*自定义项10*/,
def9 varchar2(101) null /*自定义项9*/,
def8 varchar2(101) null /*自定义项8*/,
def7 varchar2(101) null /*自定义项7*/,
def6 varchar2(101) null /*自定义项6*/,
def5 varchar2(101) null /*自定义项5*/,
def4 varchar2(101) null /*自定义项4*/,
def3 varchar2(101) null /*自定义项3*/,
def2 varchar2(101) null /*自定义项2*/,
def1 varchar2(101) null /*自定义项1*/,
bz varchar2(50) null /*备注*/,
khmc varchar2(50) null /*客户名称*/,
cksj varchar2(50) null /*出库时间*/,
ckr varchar2(20) null /*出库人*/,
xsdd varchar2(50) null /*销售订单*/,
pks_xsdd varchar2(20) null /*销售订单*/,
ckdh varchar2(50) null /*出库单号*/,
pks_chdh varchar2(20) null /*出库单号*/,
fhd varchar2(50) null /*发货单*/,
pks_fhd varchar2(20) null /*发货单*/,
modifiedtime char(19) null /*最后修改时间1*/,
modifier varchar2(20) null /*最后修改人*/,
creationtime char(19) null /*创建时间*/,
creator varchar2(20) null /*创建人*/,
lastmaketime char(19) null /*最后修改时间*/,
maketime char(19) null /*制单时间*/,
pk_org_v varchar2(20) null /*组织多版本*/,
code varchar2(50) null /*出库编码*/,
pk_group varchar2(20) null /*组织_集团*/,
pk_org varchar2(20) null /*组织*/,
pk_xsckdmaster char(20) not null /*主键*/,
ts char(19) default to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') null /*null*/,
dr integer null /*null*/,
 constraint WSH_XSCKDMASTER_PK  primary key (pk_xsckdmaster)
)

/

 create table WSH_XSCKDSLAVE0 (def46 varchar2(101) null /*自定义项46*/,
def45 varchar2(101) null /*自定义项45*/,
def44 varchar2(101) null /*自定义项44*/,
def43 varchar2(101) null /*自定义项43*/,
def42 varchar2(101) null /*自定义项42*/,
def41 varchar2(101) null /*自定义项41*/,
def40 varchar2(101) null /*自定义项40*/,
def39 varchar2(101) null /*自定义项39*/,
def38 varchar2(101) null /*自定义项38*/,
def37 varchar2(101) null /*自定义项37*/,
def36 varchar2(101) null /*自定义项36*/,
def35 varchar2(101) null /*自定义项35*/,
def34 varchar2(101) null /*自定义项34*/,
def33 varchar2(101) null /*自定义项33*/,
def32 varchar2(101) null /*自定义项32*/,
def31 varchar2(101) null /*自定义项31*/,
def30 varchar2(101) null /*自定义项30*/,
def29 varchar2(101) null /*自定义项29*/,
def28 varchar2(101) null /*自定义项28*/,
def27 varchar2(101) null /*自定义项27*/,
def26 varchar2(101) null /*自定义项26*/,
def25 varchar2(101) null /*自定义项25*/,
def24 varchar2(101) null /*自定义项24*/,
def23 varchar2(101) null /*自定义项23*/,
def22 varchar2(101) null /*自定义项22*/,
def21 varchar2(101) null /*自定义项21*/,
def20 varchar2(101) null /*自定义项20*/,
def19 varchar2(101) null /*自定义项19*/,
def18 varchar2(101) null /*自定义项18*/,
def17 varchar2(101) null /*自定义项17*/,
def16 varchar2(101) null /*自定义项16*/,
pch varchar2(50) null /*批次号*/,
pks_pch varchar2(20) null /*批次号*/,
sfsl integer null /*实发数量*/,
fhdsl integer null /*发货单数量*/,
hw varchar2(20) null /*货位*/,
ccdd varchar2(50) null /*存储地点*/,
pks_ccdd varchar2(20) null /*存储地点*/,
gg varchar2(50) null /*规格*/,
pm varchar2(20) null /*品名*/,
lh varchar2(20) null /*料号*/,
pks_wl varchar2(20) null /*物料*/,
srcrowno varchar2(50) null /*来源行号*/,
rowno varchar2(50) null /*行号*/,
pk_xsckdslave0 char(20) not null /*主键*/,
pk_xsckdmaster char(20) not null /*上层单据主键*/,
ts char(19) default to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') null /*null*/,
dr integer null /*null*/,
 constraint WSH_XSCKDSLAVE0_PK  primary key (pk_xsckdslave0)
)

/

