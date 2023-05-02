package com.obwhatsapp.youbasha.ui.YoSettings;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.view.View;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.x;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.ui.activity.CallsPrivacy;
import m.k;

public class SecPrivacy extends BasePreferenceActivity {

    /* renamed from: u  reason: collision with root package name */
    public static final CharSequence[] f1199u = {yo.getString("yoHideRead"), yo.getString("yoHideReceipt"), yo.getString("yoHidePlay"), yo.getString("yoHideCompose")};

    /* renamed from: e  reason: collision with root package name */
    public Bundle f1200e;

    /* renamed from: f  reason: collision with root package name */
    public RadioGroup f1201f;

    /* renamed from: g  reason: collision with root package name */
    public RadioButton f1202g;

    /* renamed from: h  reason: collision with root package name */
    public Switch f1203h;

    /* renamed from: i  reason: collision with root package name */
    public Switch f1204i;

    /* renamed from: j  reason: collision with root package name */
    public Switch f1205j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1206k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1207l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1208m;

    /* renamed from: n  reason: collision with root package name */
    public int f1209n = -1;

    /* renamed from: o  reason: collision with root package name */
    public int f1210o = -1;

    /* renamed from: p  reason: collision with root package name */
    public Preference f1211p;

    /* renamed from: q  reason: collision with root package name */
    public Preference f1212q;

    /* renamed from: r  reason: collision with root package name */
    public Preference f1213r;

    /* renamed from: s  reason: collision with root package name */
    public Preference f1214s;

    /* renamed from: t  reason: collision with root package name */
    public Preference f1215t;

    static {
        String str = "۠۬ۨۡۜۨۘۛ۬ۦۖۥۘ۟ۥۙۛ۠۫ۜۧۗ";
        while (true) {
            switch ((str.hashCode() ^ 210) ^ 1159817617) {
                case -1280147813:
                    return;
                case -117212227:
                    str = "ۧۙۗۚۥۥۛۙۦ۬ۥ۠ۨۘۨۛۙۦۥۥ۠ۖۛۙ";
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void r(DialogInterface dialogInterface, int i2) {
        resetPriv();
        yo.rebootYo();
    }

    public static void resetPriv() {
        yo.getCtx().getSharedPreferences(shp.privprefsname, 0).edit().clear().commit();
        yo.rebootYo();
    }

    public final void c(String str, String[] strArr, CharSequence[] charSequenceArr) {
        AlertDialog create = new CustomAlertDialogBuilder(this).setTitle((CharSequence) str).setMultiChoiceItems(charSequenceArr, (boolean[]) null, (DialogInterface.OnMultiChoiceClickListener) new k(this, strArr)).setPositiveButton(17039370, (DialogInterface.OnClickListener) new x(18)).create();
        create.show();
        try {
            ListView listView = create.getListView();
            int i2 = 0;
            while (true) {
                String str2 = "ۧۘۡۘۜۦۡۘۤۤۥۘ۬۬۟ۖۧۗ۠ۨۚۜۧۜۚۨ۠ۧۙۜۘ";
                while (true) {
                    switch (str2.hashCode() ^ 1281923385) {
                        case -1712166795:
                            str2 = "ۢۗ۠۫ۡۡۘۗۛۦ۠۫ۘۡۨۖۘۥۖۢۖۚ۟ۧۨۘۘ";
                            break;
                        case -1679412772:
                            return;
                        case -1052574002:
                            listView.setItemChecked(i2, shp.getBooleanPriv(strArr[i2]));
                            i2++;
                        case 2039306119:
                            if (i2 >= strArr.length) {
                                str2 = "ۧۜۦۘۛۦ۟ۨۚۖۡۙۥۘۧۥۛ۫ۥۢۙۦۨۘۢۗ۫ۗۥ۟";
                                break;
                            } else {
                                str2 = "ۛ۟ۡ۟ۨ۫ۦۦۜۧ۬ۧۛۨۤۘۥۡ۫۟ۛۥ۠ۦ";
                                break;
                            }
                    }
                }
            }
        } catch (Exception e2) {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x047c, code lost:
        r2 = "۫۟ۖۘۢۛۖۘۘ۫ۛۜۜۧۘۨۜۡۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0484, code lost:
        r2 = "ۦۘ۟ۥ۟ۛ۫ۧۜۧۙ۬ۧۡۗۚۘۘۜۨۧۘۡۖۜۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04b4, code lost:
        r2 = "ۗ۬ۛۤۦۧۥۡۙۛۢۙۦۖۧۘ۬ۜۤۡۛۥ۫ۙۨۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00db, code lost:
        r2 = "۟۠ۘۘۖۖۥۘۢۙۘۘۚ۫ۜۘۜ۫ۚ۫ۢۜ۟ۦۥ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r26, int r27, android.content.Intent r28) {
        /*
            r25 = this;
            r21 = 0
            r20 = 0
            r19 = 0
            r17 = 0
            r18 = 0
            r16 = 0
            r14 = 0
            r15 = 0
            r13 = 0
            r11 = 0
            r12 = 0
            r10 = 0
            r9 = 0
            r7 = 0
            r5 = 0
            r8 = 0
            r4 = 0
            r3 = 0
            r6 = 0
            java.lang.String r2 = "ۨ۟ۦۘۙۗ۟ۛۜۚۧۤۨۨۗ۬"
        L_0x001b:
            int r22 = r2.hashCode()
            r23 = 866(0x362, float:1.214E-42)
            r24 = 1645734652(0x6217eafc, float:7.005977E20)
            r22 = r22 ^ r23
            r22 = r22 ^ r24
            switch(r22) {
                case -2045526948: goto L_0x03c6;
                case -2038604687: goto L_0x0339;
                case -1948738899: goto L_0x002c;
                case -1936961744: goto L_0x0277;
                case -1929641263: goto L_0x04bc;
                case -1846978587: goto L_0x0466;
                case -1845572833: goto L_0x04c0;
                case -1712927897: goto L_0x01dc;
                case -1628344024: goto L_0x04b8;
                case -1598623101: goto L_0x0250;
                case -1486306105: goto L_0x00c2;
                case -1452252846: goto L_0x0480;
                case -1359693667: goto L_0x01e1;
                case -1331295472: goto L_0x0080;
                case -1304336286: goto L_0x0450;
                case -1287961490: goto L_0x0422;
                case -1230411130: goto L_0x005f;
                case -1141578334: goto L_0x003e;
                case -1081768570: goto L_0x017a;
                case -1009032752: goto L_0x042f;
                case -999067561: goto L_0x012e;
                case -984369720: goto L_0x02a5;
                case -929892690: goto L_0x03cb;
                case -820094726: goto L_0x0150;
                case -810228183: goto L_0x0185;
                case -746231277: goto L_0x018a;
                case -744434571: goto L_0x04a8;
                case -741654599: goto L_0x038a;
                case -680715774: goto L_0x04bc;
                case -558927560: goto L_0x039d;
                case -558157737: goto L_0x02f9;
                case -459452145: goto L_0x03c0;
                case -396684483: goto L_0x0461;
                case -391256777: goto L_0x0299;
                case -380212538: goto L_0x037d;
                case -376693014: goto L_0x011c;
                case -369979777: goto L_0x049c;
                case -361088634: goto L_0x0395;
                case -304885491: goto L_0x0180;
                case -248514836: goto L_0x00cc;
                case -193659444: goto L_0x00ae;
                case -151848131: goto L_0x0128;
                case -91017227: goto L_0x0035;
                case -76267310: goto L_0x043a;
                case 33656067: goto L_0x0235;
                case 43352645: goto L_0x0174;
                case 45485516: goto L_0x0478;
                case 84748578: goto L_0x04bc;
                case 116044720: goto L_0x02ad;
                case 179840722: goto L_0x0122;
                case 276448294: goto L_0x04bc;
                case 384757214: goto L_0x0317;
                case 411765540: goto L_0x0488;
                case 428777140: goto L_0x045b;
                case 472600126: goto L_0x0204;
                case 511382936: goto L_0x0259;
                case 574733243: goto L_0x02ea;
                case 682030970: goto L_0x02cc;
                case 702461904: goto L_0x0038;
                case 715845425: goto L_0x01e6;
                case 734561726: goto L_0x03a2;
                case 801554560: goto L_0x01ac;
                case 894951454: goto L_0x0345;
                case 1013207584: goto L_0x0390;
                case 1021718164: goto L_0x0032;
                case 1149464825: goto L_0x00a2;
                case 1181873504: goto L_0x01d2;
                case 1406043308: goto L_0x0490;
                case 1417774131: goto L_0x01d7;
                case 1476370301: goto L_0x03e9;
                case 1527364791: goto L_0x040b;
                case 1867931149: goto L_0x0241;
                case 1875347012: goto L_0x00f2;
                case 1893267986: goto L_0x0116;
                case 1942363970: goto L_0x049c;
                case 1984561064: goto L_0x002f;
                case 2058434788: goto L_0x02e1;
                case 2117783443: goto L_0x0375;
                case 2124799024: goto L_0x0226;
                case 2133536709: goto L_0x0354;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x001b
        L_0x002c:
            java.lang.String r2 = "ۧۤۨ۬ۡۚۘۗۦۤۡۧۡ۟ۨۢۤۥ"
            goto L_0x001b
        L_0x002f:
            java.lang.String r2 = "ۨ۟ۖۜۜ۬ۦۘۤۡ۬۫۟ۦ۬"
            goto L_0x001b
        L_0x0032:
            java.lang.String r2 = "۠ۙۨ۠ۡۤۗۤۦۜ۟ۜۘۢۡۜۘ۠۫۟ۧۦۥۘۢۜۛۥۦۦ"
            goto L_0x001b
        L_0x0035:
            java.lang.String r2 = "۫ۖۜۘۥۢۤۜۖۡۡۡۥۘۨۨۨ"
            goto L_0x001b
        L_0x0038:
            super.onActivityResult(r26, r27, r28)
            java.lang.String r2 = "ۤۚۜۘ۠ۡۢ۠ۧۙۨۙۥۜۦۡۨۘۡ۟ۗ۟ۤۖۢۗۨۡۘ"
            goto L_0x001b
        L_0x003e:
            r22 = -1062014616(0xffffffffc0b2f168, float:-5.5919685)
            java.lang.String r2 = "۠۬ۖۛۦۛۤۙ۠۫ۢۥۨۛۖۘۤ۟ۤۙۖ۫ۖۦۜ"
        L_0x0043:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -1270712717: goto L_0x005c;
                case -1060961407: goto L_0x004d;
                case -846720169: goto L_0x04b0;
                case 2144710511: goto L_0x0059;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0043
        L_0x004d:
            r2 = 777(0x309, float:1.089E-42)
            r0 = r26
            if (r0 == r2) goto L_0x0056
            java.lang.String r2 = "۬ۢۜۚ۬ۡۛۗۛۧۚۙۥۤۤ۫۬ۢۗۗۥۘ۠ۜ۟ۛ۬ۜ"
            goto L_0x0043
        L_0x0056:
            java.lang.String r2 = "ۤۗۤۦۙۢۖ۫ۥۘ۫ۢ۟ۗ۟ۙۚۚۜۘ۠ۛۥۙۙ"
            goto L_0x0043
        L_0x0059:
            java.lang.String r2 = "ۡۧۙۙۢۦ۫۠ۤۨۡۨۜۚۥۘ"
            goto L_0x0043
        L_0x005c:
            java.lang.String r2 = "ۤۛۘۘۡۧ۟ۥۘۦۨۗۡۧۦۘ"
            goto L_0x001b
        L_0x005f:
            r22 = -1404302156(0xffffffffac4c0cb4, float:-2.8997195E-12)
            java.lang.String r2 = "ۛۙۦ۟ۤۖۢۗۨۦۗۥۡ۟۫ۛۡۨۘۗۗ۟ۡۥۦۘۛۖۘ"
        L_0x0064:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -1503077227: goto L_0x006e;
                case -998682555: goto L_0x007a;
                case -227687368: goto L_0x04a4;
                case 345582471: goto L_0x007d;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0064
        L_0x006e:
            r2 = 888(0x378, float:1.244E-42)
            r0 = r26
            if (r0 == r2) goto L_0x0077
            java.lang.String r2 = "ۖ۠ۡۛۛۧۜۘۚ۬ۖۘ۬ۜۡ۬ۛۥۗۖۜۢۢۜ۟۬"
            goto L_0x0064
        L_0x0077:
            java.lang.String r2 = "ۤ۫۫ۢ۫ۖ۠ۛۛ۬۫ۧۡۨۥۧۨۦۤۡۡۘ"
            goto L_0x0064
        L_0x007a:
            java.lang.String r2 = "۫ۜ۫ۗۨۦۧۖ۫۫ۖۡۖۚ۬"
            goto L_0x0064
        L_0x007d:
            java.lang.String r2 = "ۚۙۖۗۚۦۛۘۖۘۚۜۜۡ۟ۗۙۥۤۘۡۘۚۗ۠ۦۢ۬"
            goto L_0x001b
        L_0x0080:
            r22 = 706226274(0x2a182862, float:1.3514323E-13)
            java.lang.String r2 = "ۦ۫ۥۚ۬ۜۚۦۡۘۛۢۖۘۛۚۛۧۙۖ۠ۨۦۥ"
        L_0x0085:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -745308875: goto L_0x009e;
                case 671173479: goto L_0x008f;
                case 1167938998: goto L_0x009b;
                case 1714687250: goto L_0x0474;
                default: goto L_0x008e;
            }
        L_0x008e:
            goto L_0x0085
        L_0x008f:
            r2 = 999(0x3e7, float:1.4E-42)
            r0 = r26
            if (r0 == r2) goto L_0x0098
            java.lang.String r2 = "ۥۢۗۦۜۥۥۦۧۘۜۘ۟ۗۢۛ"
            goto L_0x0085
        L_0x0098:
            java.lang.String r2 = "۫ۦ۫ۧ۟ۘۙۤۛۥ۬ۗ۬ۡۨۘۢۛۖۘ"
            goto L_0x0085
        L_0x009b:
            java.lang.String r2 = "ۛۛۜۘ۟ۢۚۖ۫۬۫ۡۘ۟ۧۥ"
            goto L_0x0085
        L_0x009e:
            java.lang.String r2 = "ۢۚ۟۬ۘۧۙۤۢ۫ۗۦ۠ۦۦۘ"
            goto L_0x001b
        L_0x00a2:
            boolean r2 = com.obwhatsapp.youbasha.ui.lockV2.LockUtils.isWAStockFPEnabled()
            r0 = r25
            r0.f1207l = r2
            java.lang.String r2 = "ۜۡۦۘۙۦۤۥۘۜۘۤۙۗۡۗۛ"
            goto L_0x001b
        L_0x00ae:
            r0 = r25
            android.widget.RadioGroup r2 = r0.f1201f
            r0 = r25
            android.widget.RadioButton r0 = r0.f1202g
            r21 = r0
            r0 = r21
            int r21 = r2.indexOfChild(r0)
            java.lang.String r2 = "ۚۧۖۗۧۘۘ۫ۤۧۚ۠ۜۧۥۘ"
            goto L_0x001b
        L_0x00c2:
            r0 = r25
            int r0 = r0.f1209n
            r20 = r0
            java.lang.String r2 = "ۚ۫ۨۜۥۨ۟۫ۖۢۨ۠ۛۜۨۘۙۙۖۧۘۧۖۧ۬"
            goto L_0x001b
        L_0x00cc:
            r22 = 587599137(0x23060d21, float:7.266935E-18)
            java.lang.String r2 = "ۖ۟۫ۨۛۙۤ۬ۦ۫ۦۙۨۙۜ۠۠ۤۜۛۖۡۨۨ"
        L_0x00d1:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -444381722: goto L_0x00e2;
                case 967671187: goto L_0x00db;
                case 1165541867: goto L_0x00ee;
                case 1389128957: goto L_0x00eb;
                default: goto L_0x00da;
            }
        L_0x00da:
            goto L_0x00d1
        L_0x00db:
            java.lang.String r2 = "۟۠ۘۘۖۖۥۘۢۙۘۘۚ۫ۜۘۜ۫ۚ۫ۢۜ۟ۦۥ"
            goto L_0x001b
        L_0x00df:
            java.lang.String r2 = "ۢ۟ۜۘۛۨۧۘۛۘۖۜۦۛۖۧۦۤۧۢ۫ۗۗ"
            goto L_0x00d1
        L_0x00e2:
            r0 = r20
            r1 = r21
            if (r0 == r1) goto L_0x00df
            java.lang.String r2 = "ۗۜۙۚۡۚۖۘۗۜۨ۫ۜ۠ۤۥۘۨۙۥۦۘۘ"
            goto L_0x00d1
        L_0x00eb:
            java.lang.String r2 = "۬۟ۙۗۨ۟۫ۢ۫ۨۤۜ۫ۢۨۢۜۥۘ"
            goto L_0x00d1
        L_0x00ee:
            java.lang.String r2 = "ۧۤۥ۟ۦۨۘۡۗۤۗۘۖۜۥۘ۠۬ۦۘ۫۬ۦۘۦۗۚۜۛۨ"
            goto L_0x001b
        L_0x00f2:
            r22 = -1962235291(0xffffffff8b0aaa65, float:-2.6706024E-32)
            java.lang.String r2 = "۟ۨ۬ۙۙۚ۠ۥۜۦ۟ۛۦۥۖ۬ۚ۫ۢۡۥۘ"
        L_0x00f7:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -2056409793: goto L_0x0108;
                case -1910924908: goto L_0x0113;
                case -1425178231: goto L_0x00db;
                case -490959617: goto L_0x0101;
                default: goto L_0x0100;
            }
        L_0x0100:
            goto L_0x00f7
        L_0x0101:
            java.lang.String r2 = "ۢ۠ۗۦۚۖۘ۫۟ۖۘۖۙۛۧۧۤۗۜۜۘۥۗۘۘۙۜۜۘ۫ۜ۠"
            goto L_0x001b
        L_0x0105:
            java.lang.String r2 = "ۙۖۘۛۨۜۘۙ۟۫ۙۙۜۘۡۥۗۤۜۦۨ۠ۛۧۛۜۤۡۦ"
            goto L_0x00f7
        L_0x0108:
            r0 = r25
            int r2 = r0.f1210o
            r0 = r21
            if (r2 != r0) goto L_0x0105
            java.lang.String r2 = "ۜ۠ۙۜ۠ۡۘۤۛۧۚۙۡۘۤۤۥۡ۠ۤۧۢ"
            goto L_0x00f7
        L_0x0113:
            java.lang.String r2 = "ۜ۬ۢۗۢۖۡۢ۫ۧۢۛۡ۬"
            goto L_0x00f7
        L_0x0116:
            r19 = 1
            java.lang.String r2 = "ۨۨ۟ۚ۬ۗۘۘۜ۬۫ۤۛۡۧۘۧۨۥۘ۫ۡۖۡ۠ۗۘۘۦ"
            goto L_0x001b
        L_0x011c:
            java.lang.String r2 = "ۦ۬ۘ۬۠ۦۘۗۡۥ۬ۨۦ۫ۗۥۘۚۨۛ۫ۗۥ"
            r18 = r19
            goto L_0x001b
        L_0x0122:
            r17 = 0
            java.lang.String r2 = "ۥۜۗۚۛ۠ۜۨۦ۬ۧۘۘۚۡ۠"
            goto L_0x001b
        L_0x0128:
            java.lang.String r2 = "ۥۧۧۜۢۧ۬ۜۥۘۘ۟ۖ۬ۨۨۘۢۘۧۘ۠ۡۖۖ۠ۥ"
            r18 = r17
            goto L_0x001b
        L_0x012e:
            r22 = 806132408(0x300c9ab8, float:5.115157E-10)
            java.lang.String r2 = "ۖۨۛ۬۬۟۫ۜۜ۬ۚۥ۠ۧۢۛۡۘ۫ۘۙ"
        L_0x0133:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -26904725: goto L_0x0143;
                case 216739924: goto L_0x014c;
                case 1252811327: goto L_0x047c;
                case 2062591628: goto L_0x013d;
                default: goto L_0x013c;
            }
        L_0x013c:
            goto L_0x0133
        L_0x013d:
            java.lang.String r2 = "۠۬ۖۘۘۜۘۨۜۧۤۤۡ۟ۗۚۛ۬ۙۘۥۘۘۗۚۘۧۥۘۘ"
            goto L_0x0133
        L_0x0140:
            java.lang.String r2 = "ۖ۟ۧۚۖ۬ۢ۠ۙۤۜۘۛۨۜۨۤۚۥۗ۫ۗۖۖۘ۠۟ۚ"
            goto L_0x0133
        L_0x0143:
            r0 = r20
            r1 = r21
            if (r0 != r1) goto L_0x0140
            java.lang.String r2 = "۠ۦۨۤۦ۬ۤۥۘ۬ۗۛۖۥۘۜۜ۟ۤۨ۠ۖۥۘۘ"
            goto L_0x0133
        L_0x014c:
            java.lang.String r2 = "ۨۙ۟ۥۧ۬ۢۡۛ۬ۜۚۢ۬ۘ"
            goto L_0x001b
        L_0x0150:
            r22 = -1596449029(0xffffffffa0d81efb, float:-3.6612324E-19)
            java.lang.String r2 = "ۛۘ۬ۧۦۛۗۡۡۚۖۥۤ۫ۗۘ۫ۙۢۗۗۦۚ"
        L_0x0155:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -1922895716: goto L_0x047c;
                case -1839908550: goto L_0x0166;
                case -1178136026: goto L_0x015f;
                case 2091439920: goto L_0x0171;
                default: goto L_0x015e;
            }
        L_0x015e:
            goto L_0x0155
        L_0x015f:
            java.lang.String r2 = "ۨۚۤۡ۠ۤۛۘۡۘۖ۟ۢ۟۟ۜۘۥۖۡۘۛۜ۫ۦۙۢ"
            goto L_0x001b
        L_0x0163:
            java.lang.String r2 = "۫ۖۡۖۧ۟ۛۙۤۛۦۢۛۙ"
            goto L_0x0155
        L_0x0166:
            r0 = r25
            int r2 = r0.f1210o
            r0 = r21
            if (r2 == r0) goto L_0x0163
            java.lang.String r2 = "ۥ۟۫ۗۖ۫ۘۜۘ۫ۛۚۢۘۚۤ۫ۥ"
            goto L_0x0155
        L_0x0171:
            java.lang.String r2 = "ۙۜۜۘۡۧۤۚۜ۫ۧۧ۟ۚ۫ۛ۬ۤۦۡۙۥۘ۠ۧۨ"
            goto L_0x0155
        L_0x0174:
            r16 = 1
            java.lang.String r2 = "ۦۥۖۢۦۨۨۚۚۡۙۖۢۦۢۨۦۧۘ۫ۥۜ"
            goto L_0x001b
        L_0x017a:
            java.lang.String r2 = "۟۠ۤۙۖۢ۠ۥۨ۠ۘۗۨۖ"
            r15 = r16
            goto L_0x001b
        L_0x0180:
            r14 = 0
            java.lang.String r2 = "ۥۦۘ۠ۜ۫ۗۛۡۘۨۡ۫ۚۦۘۥ۟ۨۘ"
            goto L_0x001b
        L_0x0185:
            java.lang.String r2 = "ۨۛۨۚۦۦ۟ۢۨۘ۬ۤۘۘ۟ۧۧ۬ۛۡۛۛۜۘۤۡۧۘ"
            r15 = r14
            goto L_0x001b
        L_0x018a:
            r22 = 1519756871(0x5a95a647, float:2.10612977E16)
            java.lang.String r2 = "۫ۨۦۘۙۧۤۘۢۘۘ۟۠ۗۤۢۜ۫ۗۙ۫ۗۖ"
        L_0x018f:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -1666953551: goto L_0x01a0;
                case -1651130214: goto L_0x0484;
                case -1082947940: goto L_0x0199;
                case 858900432: goto L_0x01a9;
                default: goto L_0x0198;
            }
        L_0x0198:
            goto L_0x018f
        L_0x0199:
            java.lang.String r2 = "۫ۜۖۘۖ۬ۖ۠ۥۛۢۙۗۛۡۡۧۦۡ"
            goto L_0x001b
        L_0x019d:
            java.lang.String r2 = "ۖ۟ۤۖۜۡۘ۟ۧۡۘ۠ۙۤۢ۫"
            goto L_0x018f
        L_0x01a0:
            r0 = r20
            r1 = r21
            if (r0 != r1) goto L_0x019d
            java.lang.String r2 = "ۚۘۤۢۥۢۢۤۘۘۧۛ۠۫ۛۧۡۤۜۦ۬ۛۘۡۘۤۤۤ"
            goto L_0x018f
        L_0x01a9:
            java.lang.String r2 = "ۚ۠ۧۧ۬ۢ۟ۧۙۨۨۖۡ۬۫۫۟ۦۘۥ۬ۧ"
            goto L_0x018f
        L_0x01ac:
            r22 = -1068063971(0xffffffffc056a31d, float:-3.3537056)
            java.lang.String r2 = "ۖۥۥۘۢۘ۬ۤۦۖ۫ۗۢۜۥ۫۬ۤۨ"
        L_0x01b1:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case 425209969: goto L_0x01bb;
                case 1120276709: goto L_0x01ce;
                case 1874455442: goto L_0x0484;
                case 2123186393: goto L_0x01c1;
                default: goto L_0x01ba;
            }
        L_0x01ba:
            goto L_0x01b1
        L_0x01bb:
            java.lang.String r2 = "ۜۜۦ۠ۚۖۡۢۛۧ۬ۘۨۤ۠ۨۧۙ۬۟ۢ۫ۙ"
            goto L_0x01b1
        L_0x01be:
            java.lang.String r2 = "ۨۢۦۦۡۙۦۥ۬ۗۦۥۘۥۤۡ۫ۨۨۘۤۧ۬ۡۙ"
            goto L_0x01b1
        L_0x01c1:
            r0 = r25
            int r2 = r0.f1210o
            r23 = -1
            r0 = r23
            if (r2 != r0) goto L_0x01be
            java.lang.String r2 = "ۙ۬ۦۘ۫ۢۚۘۜ۫ۘۘۤۨ۫ۙۘ۬ۖۘۤۥ۫ۢۦۘ۬ۛۖۘ"
            goto L_0x01b1
        L_0x01ce:
            java.lang.String r2 = "ۢ۬۬ۖ۬ۡ۫ۘۧ۟ۜۜۘۘۗۧ"
            goto L_0x001b
        L_0x01d2:
            r13 = 1
            java.lang.String r2 = "ۜۛ۫ۡ۠ۡۘۘۖ۫ۦۗۥۚۚ۬۠ۨ۟ۡ"
            goto L_0x001b
        L_0x01d7:
            java.lang.String r2 = "ۦۧۦۘۥۤۘۢۘۨ۠ۧۢۢۚۡ"
            r12 = r13
            goto L_0x001b
        L_0x01dc:
            r11 = 0
            java.lang.String r2 = "ۛ۫ۥۖۥۧۘۘ۬ۤۦ۫ۨۘۖۡۥۙۧۘۘۘۚۥۘ۟ۗۨ"
            goto L_0x001b
        L_0x01e1:
            java.lang.String r2 = "۟ۦۢ۬ۗۡۘۤۖۥۘۨۤۥ۠ۦۦۧۙۗۖۚ۟"
            r12 = r11
            goto L_0x001b
        L_0x01e6:
            r22 = -707902927(0xffffffffd5ce4231, float:-2.83479607E13)
            java.lang.String r2 = "ۧۘۙۖۜۥۘۛۗ۠ۚۛۜۘۘۚۘۘ۫ۙۢۧۘ"
        L_0x01eb:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -1235781710: goto L_0x0200;
                case 722147919: goto L_0x01f5;
                case 1059159730: goto L_0x01fb;
                case 1553043236: goto L_0x0490;
                default: goto L_0x01f4;
            }
        L_0x01f4:
            goto L_0x01eb
        L_0x01f5:
            java.lang.String r2 = "ۦۢۖۢۧۦۘ۬ۦۡ۠ۨۡۘۛۛۘ"
            goto L_0x01eb
        L_0x01f8:
            java.lang.String r2 = "۬۫ۨۘ۬ۛۨ۟ۘۢ۠ۜۨۗۚ۟ۘ۟۫۬ۧۥ"
            goto L_0x01eb
        L_0x01fb:
            if (r12 == 0) goto L_0x01f8
            java.lang.String r2 = "۠۟ۡ۟ۤۚۦۨۙۤ۠ۢۗ۫۬۟ۤۦۖۙ۬"
            goto L_0x01eb
        L_0x0200:
            java.lang.String r2 = "ۚ۟ۢۗۢۖۘۚۙۜۘ۫ۦۤ۫ۡۜۙ۟ۨ"
            goto L_0x001b
        L_0x0204:
            r22 = -442065688(0xffffffffe5a69ce8, float:-9.835091E22)
            java.lang.String r2 = "ۚۖۨ۟ۤۘۢۦۜۡ۬ۖۘۗ۟۫۬ۜۜۜۢۛۜۥ۫ۧۢ۟"
        L_0x0209:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -2118723690: goto L_0x048c;
                case -662633439: goto L_0x0223;
                case 883579064: goto L_0x021a;
                case 1501572954: goto L_0x0213;
                default: goto L_0x0212;
            }
        L_0x0212:
            goto L_0x0209
        L_0x0213:
            java.lang.String r2 = "ۤۥۗ۟ۛۛۖ۟ۢ۠ۖۘۥ۬ۘۥۗ۟"
            goto L_0x001b
        L_0x0217:
            java.lang.String r2 = "ۛ۫۟ۜ۬ۘۘۦۗ۬ۧ۟ۖۘۘ۬ۨ"
            goto L_0x0209
        L_0x021a:
            r0 = r25
            boolean r2 = r0.f1207l
            if (r2 == 0) goto L_0x0217
            java.lang.String r2 = "ۘ۬ۜۘۖۤۤۧۡۜ۬ۜۜۡ۫۠ۜ۟ۦۦۢۦۘۘۤ۠"
            goto L_0x0209
        L_0x0223:
            java.lang.String r2 = "ۘۛۧۚۤۛۚۡۙ۫ۢۜۦۥۢۡۙۡۘ"
            goto L_0x0209
        L_0x0226:
            r0 = r25
            android.widget.RadioButton r2 = r0.f1202g
            r22 = 1
            r0 = r22
            r2.setChecked(r0)
            java.lang.String r2 = "ۘۙۨۘۜ۬ۨۡۧۥۘۡۥۘۘۘ۫ۘۘۤ۟ۤ"
            goto L_0x001b
        L_0x0235:
            r0 = r25
            int r2 = r0.f1210o
            r0 = r25
            r0.f1209n = r2
            java.lang.String r2 = "ۧۢۛۡۛۡۙۨۡۘۘۘۙۨ۫ۜۦۖۦۛۜۘ۬۬۟۫ۛۦۘ"
            goto L_0x001b
        L_0x0241:
            r0 = r25
            android.widget.Switch r2 = r0.f1203h
            r22 = 0
            r0 = r22
            r2.setChecked(r0)
            java.lang.String r2 = "۫ۙۡۜۚۛۜۥۥۘۤ۫۠ۧۘۜۘۘ۬ۗ۠ۜۤۤۘۥۘۧۤۦ"
            goto L_0x001b
        L_0x0250:
            r2 = 0
            r0 = r25
            r0.f1206k = r2
            java.lang.String r2 = "ۡۡۧۘ۟۠ۜۘۧ۠ۡ۟ۘۧۘۚۧۡۘۦۧۘۨۗۨ۬ۖۚۢۢۘۘ"
            goto L_0x001b
        L_0x0259:
            r22 = -696395872(0xffffffffd67dd7a0, float:-6.9775636E13)
            java.lang.String r2 = "ۡۗۘۘۧۙ۫۫ۢ۫ۛۜۦۘۢۖۘۘۛۙۘۛۥۘ۬ۦۘ"
        L_0x025e:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -2067894164: goto L_0x0273;
                case -1995996558: goto L_0x026e;
                case -429831834: goto L_0x0268;
                case 1518303156: goto L_0x049c;
                default: goto L_0x0267;
            }
        L_0x0267:
            goto L_0x025e
        L_0x0268:
            java.lang.String r2 = "۟ۥۘۘۧ۫ۧۧۤ۬ۦۥۢۦۢۦۖۜۨۢۥ"
            goto L_0x025e
        L_0x026b:
            java.lang.String r2 = "ۡۦۨۤۘۤۤۢۗۧۜۧۘ۠ۢۘۘۗۗۘۘ"
            goto L_0x025e
        L_0x026e:
            if (r18 == 0) goto L_0x026b
            java.lang.String r2 = "ۛۤۦۧۛۥ۫ۦۧۘۜۙۖ۟ۨۨ"
            goto L_0x025e
        L_0x0273:
            java.lang.String r2 = "ۧۥۡۘۧۜۜۖ۫ۗۘ۟ۨۘۨۡۗ۫ۨۢ"
            goto L_0x001b
        L_0x0277:
            r22 = 2019974817(0x78665ea1, float:1.8689806E34)
            java.lang.String r2 = "ۥۛۚۘۤۧۜۘ۠ۙۗۜۘۘۙۛۢۧۚ"
        L_0x027c:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -1054988889: goto L_0x0494;
                case -455573317: goto L_0x0295;
                case 240221227: goto L_0x0292;
                case 1936884899: goto L_0x0286;
                default: goto L_0x0285;
            }
        L_0x0285:
            goto L_0x027c
        L_0x0286:
            r0 = r25
            boolean r2 = r0.f1207l
            if (r2 == 0) goto L_0x028f
            java.lang.String r2 = "ۙۢۜ۟ۗۨۘۨ۫ۤۗۙۜۘۦۛۨۢۙۜۚۛۥۘ"
            goto L_0x027c
        L_0x028f:
            java.lang.String r2 = "ۢۙۧۖۘۖۘۘۨۥۘ۫ۧۤ۠ۜۘۘۡۥۘۡۖۤۡ۟"
            goto L_0x027c
        L_0x0292:
            java.lang.String r2 = "ۚۘ۠ۙۨ۫ۤۗۧۥ۟۬ۖۜۘ"
            goto L_0x027c
        L_0x0295:
            java.lang.String r2 = "۫ۘۘۘۤۨۤۜۧۡۡۨۡۘ۫ۤۙۜ۟ۚۡۚۡۚۡۦۘ"
            goto L_0x001b
        L_0x0299:
            r0 = r25
            int r2 = r0.f1210o
            r0 = r25
            r0.f1209n = r2
            java.lang.String r2 = "ۙۧۤۡۜۛۜۢۦۘۨۖۧۘۡۨۘۤۙۜۘ۬۫ۜ"
            goto L_0x001b
        L_0x02a5:
            r0 = r25
            int r10 = r0.f1209n
            java.lang.String r2 = "ۤۦ۠ۘۘۧۘۡۙۤ۫ۚۘۘۙۙۚ"
            goto L_0x001b
        L_0x02ad:
            r22 = 310726713(0x12855039, float:8.413256E-28)
            java.lang.String r2 = "ۨ۬ۖۚۧۜۘۛۖ۬ۗۚۤۜۖ۠ۧۛۥۤۧۙۖۖۥۘۚۤۛ"
        L_0x02b2:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -2055356963: goto L_0x02c5;
                case -1998287657: goto L_0x0498;
                case -1032055809: goto L_0x02c8;
                case 266767815: goto L_0x02bc;
                default: goto L_0x02bb;
            }
        L_0x02bb:
            goto L_0x02b2
        L_0x02bc:
            r2 = -1
            if (r10 == r2) goto L_0x02c2
            java.lang.String r2 = "۠ۦۡۘۨ۬ۡۜۚۦۘ۬ۧ۫۬۬ۤ"
            goto L_0x02b2
        L_0x02c2:
            java.lang.String r2 = "۬۠ۘۘ۠ۤۦۛۤۖۘ۟ۤ۟ۜۛۙۦۛۘۘ"
            goto L_0x02b2
        L_0x02c5:
            java.lang.String r2 = "ۧ۫ۗ۟ۨۘ۬ۙۥۡۦۨۦۨ۬ۨۨۙ۬۟ۚۜۡۨۘ"
            goto L_0x02b2
        L_0x02c8:
            java.lang.String r2 = "ۤۙۢۡۧۨۦ۠ۨ۫ۖۦۘۛۚۙ"
            goto L_0x001b
        L_0x02cc:
            r0 = r25
            android.widget.RadioGroup r2 = r0.f1201f
            android.view.View r2 = r2.getChildAt(r10)
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            r22 = 1
            r0 = r22
            r2.setChecked(r0)
            java.lang.String r2 = "ۡۙۦۜ۬۬ۥ۫ۗۤ۠ۙۦۚ۠۟ۧۛ"
            goto L_0x001b
        L_0x02e1:
            r2 = 0
            r0 = r25
            r0.f1206k = r2
            java.lang.String r2 = "ۡۗۛ۟۬ۡۘۛۘۘ۬۫ۙۡ۠ۦۧ۫ۜۧ۫ۢ"
            goto L_0x001b
        L_0x02ea:
            r0 = r25
            android.widget.Switch r2 = r0.f1203h
            r22 = 0
            r0 = r22
            r2.setChecked(r0)
            java.lang.String r2 = "۫۫ۥۙۙ۠ۥ۟ۘ۠ۨۚۘۤۨۘۙۡۜۛۢۡۥۡۖۙۡۚ"
            goto L_0x001b
        L_0x02f9:
            r22 = -920040008(0xffffffffc9294db8, float:-693467.5)
            java.lang.String r2 = "۠۬ۘۗۢۚ۟ۛۥۘ۟ۥۢۙۘۡۘۘۢۘۘ۟۟ۨۘۚۙۖۦ۟ۙ"
        L_0x02fe:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -18006917: goto L_0x0308;
                case 37769863: goto L_0x0310;
                case 782967622: goto L_0x0313;
                case 1265800845: goto L_0x04bc;
                default: goto L_0x0307;
            }
        L_0x0307:
            goto L_0x02fe
        L_0x0308:
            if (r15 == 0) goto L_0x030d
            java.lang.String r2 = "ۘۘۖۘۘ۟۬ۨۥ۫ۘۘۡۘ۬ۨۧۗۢۡۘۢ۬۟ۦۧۖۘ۬"
            goto L_0x02fe
        L_0x030d:
            java.lang.String r2 = "۬۠ۤۖۘۧ۟ۜۥۘۦۗ۟۫ۢ۟ۢۘ"
            goto L_0x02fe
        L_0x0310:
            java.lang.String r2 = "ۡۙۧ۫ۨۦ۬۟ۤۖۚۜۘۘۧۘۢۙۡۖ۫ۚۘۥۘ"
            goto L_0x02fe
        L_0x0313:
            java.lang.String r2 = "۬ۜ۬ۘۖۧۗۖۜۜۙۡ۫ۛۨۤۡۙۛۛۧۖۧ"
            goto L_0x001b
        L_0x0317:
            r22 = -1892033869(0xffffffff8f39dab3, float:-9.163324E-30)
            java.lang.String r2 = "ۨۖۥۘۧ۟ۡ۟ۛۢۘۧۨۥۚۨۘۖ۟ۢۨ۠ۦۛۙۢۢۢ"
        L_0x031c:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -1108572228: goto L_0x0326;
                case 557315471: goto L_0x0336;
                case 1649429558: goto L_0x04a0;
                case 2128070236: goto L_0x032d;
                default: goto L_0x0325;
            }
        L_0x0325:
            goto L_0x031c
        L_0x0326:
            java.lang.String r2 = "ۚۗۜۘۜ۟ۜۗۗۛۥۡۥۥۦۘۘ"
            goto L_0x001b
        L_0x032a:
            java.lang.String r2 = "ۛۢ۬۟۠ۨ۠ۥۦۜۧ۫ۡۖۗۚۖۦۘۡۗۚۡ۟ۨۘۘ۫ۛ"
            goto L_0x031c
        L_0x032d:
            r0 = r25
            boolean r2 = r0.f1207l
            if (r2 != 0) goto L_0x032a
            java.lang.String r2 = "ۘۢۢۥۧ۬ۛۦۖۘۛۛۖۘۗۘۜۗۥۚۨۢ۠ۥۜۧ"
            goto L_0x031c
        L_0x0336:
            java.lang.String r2 = "۬۫ۙۘۚۧۦۦۡۙۥ۟ۨۢۚۧۨۘۢۡۜۘ"
            goto L_0x031c
        L_0x0339:
            r0 = r25
            int r2 = r0.f1210o
            r0 = r25
            r0.f1209n = r2
            java.lang.String r2 = "ۜۙۙۧ۫ۢۨۡۙ۟۟ۡ۟۟ۛۘۤ۠"
            goto L_0x001b
        L_0x0345:
            r0 = r25
            android.widget.RadioButton r2 = r0.f1202g
            r22 = 1
            r0 = r22
            r2.setChecked(r0)
            java.lang.String r2 = "ۚۢۧۙۢۖۚ۠۬ۨۡۚ۟ۛۢۡ۟ۗ"
            goto L_0x001b
        L_0x0354:
            r22 = 1152584662(0x44b30bd6, float:1432.3699)
            java.lang.String r2 = "ۥ۠ۦ۠ۡۖۘۛۘۡۢۦ۬ۚۡۢۡۥ۟"
        L_0x0359:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -799044924: goto L_0x0369;
                case 174564805: goto L_0x0363;
                case 478090140: goto L_0x04ac;
                case 822369965: goto L_0x0371;
                default: goto L_0x0362;
            }
        L_0x0362:
            goto L_0x0359
        L_0x0363:
            java.lang.String r2 = "ۡۤ۫ۘۡۨۘ۬ۛۨۗۛۢۧۤۛۡۦۖۡۥۘ"
            goto L_0x0359
        L_0x0366:
            java.lang.String r2 = "۬ۖۡۗ۫۫ۙ۟۫ۚۦۜۛۡۨۡۗ۫ۡۢۢۛ۫ۗۢۨ"
            goto L_0x0359
        L_0x0369:
            r2 = -1
            r0 = r27
            if (r0 != r2) goto L_0x0366
            java.lang.String r2 = "ۛۚ۬۠ۤۘۘۢۚۘۨۨۜ۫ۘۛۤۦۨۘ"
            goto L_0x0359
        L_0x0371:
            java.lang.String r2 = "ۤۖۗۥۜۗۛ۫ۢۡۖۖۡۤۚ"
            goto L_0x001b
        L_0x0375:
            r2 = 1
            com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity.setMustRestart(r2)
            java.lang.String r2 = "ۧۤۥۙ۬ۧۜ۟۫ۧۙ۠ۘۜۘ۬ۤۘۘۜۘۧۘۦۡۘۘ۬ۘۦ"
            goto L_0x001b
        L_0x037d:
            java.lang.String r2 = "customlockwV2"
            r22 = 1
            r0 = r22
            com.obwhatsapp.yo.shp.setBooleanPriv(r2, r0)
            java.lang.String r2 = "ۘۘۢ۠۠۫ۚۙۥۘ۠ۙۦۛۡ۬ۨۛۢۛۖۧۗۖۡۘ"
            goto L_0x001b
        L_0x038a:
            java.lang.String r9 = "wallpaper_set_successful"
            java.lang.String r2 = "ۗۨۧۘۜۚۖۦۙۤۜۥۢۜۖۖ"
            goto L_0x001b
        L_0x0390:
            java.lang.String r2 = "ۖۛ۟ۜۧۜۘۛۙۤۥۖۗۖۢۦۘ۬ۖۤۙۖ"
            r8 = r9
            goto L_0x001b
        L_0x0395:
            java.lang.String r7 = com.obwhatsapp.yo.yo.getString((java.lang.String) r8)
            java.lang.String r2 = "ۢۡ۫ۖۤۜۘۤۥۢ۠ۥۛۗۘۦۛۗۜ"
            goto L_0x001b
        L_0x039d:
            java.lang.String r2 = "ۘۜۧۘ۠ۛ۬۫ۤۚۖ۬۬ۡۥ۫"
            r6 = r7
            goto L_0x001b
        L_0x03a2:
            r22 = -1146065031(0xffffffffbbb06f79, float:-0.0053843823)
            java.lang.String r2 = "ۗۚۗۨۖۗۨۢ۫ۜۥۜۘۙۖۧۙۙ"
        L_0x03a7:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -1423922992: goto L_0x03b1;
                case 892880964: goto L_0x04bc;
                case 1149304015: goto L_0x03b9;
                case 1632398825: goto L_0x03bc;
                default: goto L_0x03b0;
            }
        L_0x03b0:
            goto L_0x03a7
        L_0x03b1:
            if (r27 == 0) goto L_0x03b6
            java.lang.String r2 = "ۘۨۙۘۙ۠ۚۘۖۥۢۖۘۛ۠ۨۘ"
            goto L_0x03a7
        L_0x03b6:
            java.lang.String r2 = "۬ۖۨۘۦۧۨ۟ۗ۫۬ۧۗۘ۬ۦۘۗۨۨ۫۫ۖۘ"
            goto L_0x03a7
        L_0x03b9:
            java.lang.String r2 = "ۘۚۘۗۛ۫ۜۥۖۘ۠ۖۖۨۜۡۙ۬ۙۙۢۖۖۜۦ"
            goto L_0x03a7
        L_0x03bc:
            java.lang.String r2 = "ۢ۬ۙۖۖۜۘۧۚۧۤ۠۠۬ۧۙۢۦۘ"
            goto L_0x001b
        L_0x03c0:
            java.lang.String r5 = "payments_set_pin_incorrect_format_error"
            java.lang.String r2 = "۫ۘۙ۟ۧ۫ۢۖۙۙ۟ۜ۬ۤۖ۠ۖ۟ۘ۠ۗ۫ۙ۬"
            goto L_0x001b
        L_0x03c6:
            java.lang.String r2 = "ۧۤۗۗۗۖ۫ۢۥۜۙۦۚۡۥۘ۬ۖۘ۠۠ۡ۟ۜ۬"
            r8 = r5
            goto L_0x001b
        L_0x03cb:
            r22 = -1719102449(0xffffffff9988940f, float:-1.4121871E-23)
            java.lang.String r2 = "۫ۙۡۘ۫ۛ۫۠ۤۡۘۛۦۚۛ۠ۜۘۢ۟ۛ"
        L_0x03d0:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case 100665264: goto L_0x03e1;
                case 1493413239: goto L_0x03da;
                case 1558114176: goto L_0x04b4;
                case 1665011179: goto L_0x03e6;
                default: goto L_0x03d9;
            }
        L_0x03d9:
            goto L_0x03d0
        L_0x03da:
            java.lang.String r2 = "۬ۚۜۘۖۤۢۤۢۦۗۖۙۤ۟ۚ"
            goto L_0x001b
        L_0x03de:
            java.lang.String r2 = "۬۠ۡۖۦۨۦۢۖ۬ۡۧۘۧۡۥۘ۫ۡۡۘ"
            goto L_0x03d0
        L_0x03e1:
            if (r28 == 0) goto L_0x03de
            java.lang.String r2 = "ۖۙۘۘۦۨۙۚۜۡۢۚۧ۬۫ۧ"
            goto L_0x03d0
        L_0x03e6:
            java.lang.String r2 = "ۙۦۦۘۛۛ۠ۧۤ۫ۖ۟ۖۘۥۙۤ"
            goto L_0x03d0
        L_0x03e9:
            r22 = -1965812810(0xffffffff8ad413b6, float:-2.0422272E-32)
            java.lang.String r2 = "ۧۢ۠۫ۧۡۘۚۘۡۤۧۜۜۦۢۗۛۖۘۜۤۥۘ"
        L_0x03ee:
            int r23 = r2.hashCode()
            r23 = r23 ^ r22
            switch(r23) {
                case -1773526915: goto L_0x03fe;
                case -1338908128: goto L_0x03f8;
                case 1170590720: goto L_0x04b4;
                case 1720174823: goto L_0x0407;
                default: goto L_0x03f7;
            }
        L_0x03f7:
            goto L_0x03ee
        L_0x03f8:
            java.lang.String r2 = "ۖۥۘۘۗۘ۠ۢۜۘۧۢ۫ۤۙۨ"
            goto L_0x03ee
        L_0x03fb:
            java.lang.String r2 = "ۙۨۡۛۛۥۘ۠۠ۢۙۛۖۘ۫ۧۛ۬۠ۤۗ۟ۖۘۜۥۡۘ۬ۢۨ"
            goto L_0x03ee
        L_0x03fe:
            android.net.Uri r2 = r28.getData()
            if (r2 == 0) goto L_0x03fb
            java.lang.String r2 = "ۜۧۨۥۦۡۘ۫ۦۧۤ۬۟ۢۖۙۧۡۡۙۡ۠"
            goto L_0x03ee
        L_0x0407:
            java.lang.String r2 = "۟ۛۚ۫۬ۜۘ۟ۢۖۘۘۜ۟ۤۙۥۘۙۦۥ۫۟ۘۘ"
            goto L_0x001b
        L_0x040b:
            java.lang.String r2 = "photo_loading"
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((java.lang.String) r2)
            r22 = 0
            r0 = r25
            r1 = r22
            android.widget.Toast r2 = android.widget.Toast.makeText(r0, r2, r1)
            r2.show()
            java.lang.String r2 = "ۥۥ۠ۙ۟۬ۙۧۛ۫ۘۗۨۧۦۛۦۦۘ۫ۚۘۘ"
            goto L_0x001b
        L_0x0422:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.obwhatsapp.settings.chat.wallpaper.YoGalleryWallpaperPreview> r2 = com.obwhatsapp.settings.chat.wallpaper.YoGalleryWallpaperPreview.class
            r0 = r25
            r4.<init>(r0, r2)
            java.lang.String r2 = "ۘ۟ۤ۠۫ۜ۫۬۠۬ۧۥ۬ۗۘ"
            goto L_0x001b
        L_0x042f:
            android.net.Uri r2 = r28.getData()
            r4.setData(r2)
            java.lang.String r2 = "ۥۛۗۖۜ۬ۡ۟ۛۡ۟ۡۗ۫ۙۖ۬ۦ۫ۡ"
            goto L_0x001b
        L_0x043a:
            java.lang.String r2 = "output"
            java.io.File r22 = new java.io.File
            java.lang.String r23 = com.obwhatsapp.youbasha.ui.lockV2.LockBaseActivity.lockWallPath
            r22.<init>(r23)
            android.net.Uri r22 = android.net.Uri.fromFile(r22)
            r0 = r22
            r4.putExtra(r2, r0)
            java.lang.String r2 = "ۖۡۘۛۜۚ۠ۚۚ۬ۚ۠ۥۢۗ"
            goto L_0x001b
        L_0x0450:
            r2 = 888(0x378, float:1.244E-42)
            r0 = r25
            r0.startActivityForResult(r4, r2)
            java.lang.String r2 = "ۡۧ۫ۦ۬ۦۘ۟ۚۡۚ۬ۗ۬ۚۥ۬ۤ۫"
            goto L_0x001b
        L_0x045b:
            java.lang.String r3 = "You haven't picked an Image"
            java.lang.String r2 = "ۘۜۜۖۙۡۘۥۛۘۘۨۛۘۘۖۧۙۚ۟ۧۤۤۘ"
            goto L_0x001b
        L_0x0461:
            java.lang.String r2 = "ۦۨۡ۬۟ۜۘۧ۠۟ۧ۟ۢۢ۫"
            r6 = r3
            goto L_0x001b
        L_0x0466:
            r2 = 0
            r0 = r25
            android.widget.Toast r2 = android.widget.Toast.makeText(r0, r6, r2)
            r2.show()
            java.lang.String r2 = "ۚۙۘۘ۟ۜۡۙۘۛۦۛۘۙۢۦۥ۟ۚۢۖۥۘۦۥۙۥۙۙ"
            goto L_0x001b
        L_0x0474:
            java.lang.String r2 = "ۙ۫ۥۘ۬ۨۛ۫۫۬ۧ۬۟۠ۖۤۢ۬ۜ۠ۙۖۘ"
            goto L_0x001b
        L_0x0478:
            java.lang.String r2 = "ۥۧۧۜۢۧ۬ۜۥۘۘ۟ۖ۬ۨۨۘۢۘۧۘ۠ۡۖۖ۠ۥ"
            goto L_0x001b
        L_0x047c:
            java.lang.String r2 = "۫۟ۖۘۢۛۖۘۘ۫ۛۜۜۧۘۨۜۡۘ"
            goto L_0x001b
        L_0x0480:
            java.lang.String r2 = "ۨۛۨۚۦۦ۟ۢۨۘ۬ۤۘۘ۟ۧۧ۬ۛۡۛۛۜۘۤۡۧۘ"
            goto L_0x001b
        L_0x0484:
            java.lang.String r2 = "ۦۘ۟ۥ۟ۛ۫ۧۜۧۙ۬ۧۡۗۚۘۘۜۨۧۘۡۖۜۘ"
            goto L_0x001b
        L_0x0488:
            java.lang.String r2 = "۟ۦۢ۬ۗۡۘۤۖۥۘۨۤۥ۠ۦۦۧۙۗۖۚ۟"
            goto L_0x001b
        L_0x048c:
            java.lang.String r2 = "ۤۥ۠ۡۚۖۚ۠ۜۗ۠ۨ۬۟ۢۥۧۧ"
            goto L_0x001b
        L_0x0490:
            java.lang.String r2 = "ۡۡۧۘ۟۠ۜۘۧ۠ۡ۟ۘۧۘۚۧۡۘۦۧۘۨۗۨ۬ۖۚۢۢۘۘ"
            goto L_0x001b
        L_0x0494:
            java.lang.String r2 = "ۘۥۘۘۗۢۢۙۗ۠ۛۗ۬ۗۢۧۥۙۚ۟ۛۢۦۥۙ"
            goto L_0x001b
        L_0x0498:
            java.lang.String r2 = "ۚۥۡۘۢۥۨۦ۠ۛۧۨۡۡ۠ۥۦۢۢۢۚ"
            goto L_0x001b
        L_0x049c:
            java.lang.String r2 = "۫۫ۥۙۙ۠ۥ۟ۘ۠ۨۚۘۤۨۘۙۡۜۛۢۡۥۡۖۙۡۚ"
            goto L_0x001b
        L_0x04a0:
            java.lang.String r2 = "ۦ۠ۡۘۢۧۦۚ۠ۚ۠ۖۘۦۨ۠"
            goto L_0x001b
        L_0x04a4:
            java.lang.String r2 = "ۚۗ۫ۧۜ۫ۨۥۘۙۜۜۘ۠ۢۘۗۖۨۢ۫۠ۘۡ"
            goto L_0x001b
        L_0x04a8:
            java.lang.String r2 = "ۖۛ۟ۜۧۜۘۛۙۤۥۖۗۖۢۦۘ۬ۖۤۙۖ"
            goto L_0x001b
        L_0x04ac:
            java.lang.String r2 = "ۢۙۨۧۚ۫ۚ۟ۢۨۦۦۘ۠ۖۧۘۛۗۧۖۢۨۤۨۢ"
            goto L_0x001b
        L_0x04b0:
            java.lang.String r2 = "ۢۧ۟ۘۜۥۘ۟ۛۗۜۜۜ۟۫ۘۘۨۖۤۥۚۦۘۦۜۡۘۤۘۨۘ"
            goto L_0x001b
        L_0x04b4:
            java.lang.String r2 = "ۗ۬ۛۤۦۧۥۡۙۛۢۙۦۖۧۘ۬ۜۤۡۛۥ۫ۙۨۘ"
            goto L_0x001b
        L_0x04b8:
            java.lang.String r2 = "ۦۨۡ۬۟ۜۘۧ۠۟ۧ۟ۢۢ۫"
            goto L_0x001b
        L_0x04bc:
            java.lang.String r2 = "ۚۙۘۘ۟ۜۡۙۘۛۦۛۘۙۢۦۥ۟ۚۢۖۥۘۦۥۙۥۙۙ"
            goto L_0x001b
        L_0x04c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.SecPrivacy.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008f, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x018c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01ec A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0225 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0231 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x018b A[Catch:{ Exception -> 0x02d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b2 A[Catch:{ Exception -> 0x02d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01c5 A[Catch:{ Exception -> 0x02d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01dc A[Catch:{ Exception -> 0x02d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01dd A[Catch:{ Exception -> 0x02d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e5 A[Catch:{ Exception -> 0x02d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0221 A[Catch:{ Exception -> 0x02d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0222 A[Catch:{ Exception -> 0x02d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x022a A[Catch:{ Exception -> 0x02d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02cd A[SYNTHETIC, Splitter:B:93:0x02cd] */
    @android.annotation.SuppressLint({"MissingSuperCall"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r9 = 4
            r8 = 3
            r7 = 2
            r2 = 0
            r1 = 1
            super.onCreatePrivate(r11)
            java.lang.String r0 = "yo_settings_secprivacy"
            java.lang.String r3 = "layout"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            r10.setContentView(r0)
            java.lang.String r0 = "yo_privacy"
            java.lang.String r3 = "xml"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            r10.addPreferencesFromResource(r0)
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r0 = new com.obwhatsapp.youbasha.ui.lockV2.LockOptions
            r0.<init>()
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r0 = r0.setConversation(r2)
            r3 = 0
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r0 = r0.setJID(r3)
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r0 = r0.setChangePass(r1)
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r0 = r0.setDisableLock(r2)
            r3 = 0
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r0 = r0.setPassedIntent(r3)
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r0 = r0.setJustCloseAfterSuccess(r1)
            android.os.Bundle r0 = r0.getBundle()
            r10.f1200e = r0
            java.lang.String r0 = "checkbox"
            java.lang.String r3 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.Switch r0 = (android.widget.Switch) r0
            r10.f1203h = r0
            java.lang.String r0 = "checkbox_area"
            java.lang.String r3 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            r10.f1201f = r0
            android.view.View r0 = r0.getChildAt(r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r10.f1202g = r0
            r3 = 511221638(0x1e789f86, float:1.3161999E-20)
            java.lang.String r0 = "۫ۗۡۘ۠ۧۥۖۥۙۛۦۘۗۤ۫ۨۜۛ"
        L_0x0070:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1221902982: goto L_0x0088;
                case 738585569: goto L_0x007f;
                case 1034481462: goto L_0x0079;
                case 1733439760: goto L_0x013b;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x0070
        L_0x0079:
            java.lang.String r0 = "ۥۢۡۢۧۨۘۙۙۚۛ۫۠۟۠۟۫۫۫"
            goto L_0x0070
        L_0x007c:
            java.lang.String r0 = "ۜ۟ۖۗۘۦۘۛۧۡۘۚۙۡۙۖۗ۬ۗۘۧۘ۟ۦۚ"
            goto L_0x0070
        L_0x007f:
            boolean r0 = com.obwhatsapp.youbasha.task.utils.isFingerprintAvailable()
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "ۙۨۗۡۛۗ۬ۢ۠ۥۘ۫ۖ۬۠ۜۥۘۘ"
            goto L_0x0070
        L_0x0088:
            android.widget.RadioButton r0 = r10.f1202g
            r3 = 8
            r0.setVisibility(r3)
        L_0x008f:
            r0 = r2
        L_0x0090:
            r10.f1208m = r0
            java.lang.String r0 = "button1"
            java.lang.String r3 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.Switch r0 = (android.widget.Switch) r0
            r10.f1204i = r0
            java.lang.String r0 = "button2"
            java.lang.String r3 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.Switch r0 = (android.widget.Switch) r0
            r10.f1205j = r0
            java.lang.String r0 = "modPassword"
            java.lang.String r3 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            android.view.View r0 = r10.findViewById(r0)
            m.h r3 = new m.h
            r3.<init>(r10, r2)
            r0.setOnClickListener(r3)
            java.lang.String r0 = "patternView"
            java.lang.String r3 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            android.view.View r0 = r10.findViewById(r0)
            m.h r3 = new m.h
            r3.<init>(r10, r1)
            r0.setOnClickListener(r3)
            java.lang.String r0 = "recoveryQ"
            java.lang.String r3 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            android.view.View r0 = r10.findViewById(r0)
            m.h r3 = new m.h
            r3.<init>(r10, r7)
            r0.setOnClickListener(r3)
            java.lang.String r0 = "set_wallpaper_button"
            java.lang.String r3 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)
            android.view.View r0 = r10.findViewById(r0)
            m.h r3 = new m.h
            r3.<init>(r10, r8)
            r0.setOnClickListener(r3)
            android.widget.Switch r0 = r10.f1204i     // Catch:{ Exception -> 0x02d4 }
            java.lang.Object r3 = r0.getTag()     // Catch:{ Exception -> 0x02d4 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02d4 }
            boolean r3 = com.obwhatsapp.yo.shp.getBooleanPriv(r3)     // Catch:{ Exception -> 0x02d4 }
            r0.setChecked(r3)     // Catch:{ Exception -> 0x02d4 }
            android.widget.Switch r0 = r10.f1205j     // Catch:{ Exception -> 0x02d4 }
            java.lang.Object r3 = r0.getTag()     // Catch:{ Exception -> 0x02d4 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02d4 }
            boolean r3 = com.obwhatsapp.yo.shp.getBooleanPriv(r3)     // Catch:{ Exception -> 0x02d4 }
            r0.setChecked(r3)     // Catch:{ Exception -> 0x02d4 }
            boolean r3 = com.obwhatsapp.youbasha.ui.lockV2.LockUtils.isWAStockFPEnabled()     // Catch:{ Exception -> 0x02d4 }
            r10.f1207l = r3     // Catch:{ Exception -> 0x02d4 }
            r4 = -76996452(0xfffffffffb69209c, float:-1.2104666E36)
            java.lang.String r0 = "ۦۖۖۘۤۥۙۢۨۦۘۙ۠۬ۧۛ۫ۜۖۛۜ۫ۚ"
        L_0x012f:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x02d4 }
            r5 = r5 ^ r4
            switch(r5) {
                case -546610388: goto L_0x016f;
                case 113207889: goto L_0x0138;
                case 186598630: goto L_0x016a;
                case 1850233107: goto L_0x01a5;
                default: goto L_0x0137;
            }
        L_0x0137:
            goto L_0x012f
        L_0x0138:
            java.lang.String r0 = "ۦۥۛۙۛۘۘۖۢ۠۫ۨ۠ۨۚۡۘۙۥۢ۫ۜۦۘۤ۟ۥۤۘ۫"
            goto L_0x012f
        L_0x013b:
            r3 = 1756882853(0x68b7e7a5, float:6.947729E24)
            java.lang.String r0 = "ۥۤۦۢۤۡۖۘۤ۫ۢۡ۠ۧۘ"
        L_0x0140:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -2042600725: goto L_0x0158;
                case -1557246967: goto L_0x0155;
                case -1376556492: goto L_0x0149;
                case -323458757: goto L_0x0164;
                default: goto L_0x0148;
            }
        L_0x0148:
            goto L_0x0140
        L_0x0149:
            boolean r0 = com.obwhatsapp.youbasha.task.utils.hasFingerprintRegistered()
            if (r0 != 0) goto L_0x0152
            java.lang.String r0 = "۫ۤۢۤۛۜۢۥۥۜۗۤ۬۟۟۟ۙۛۥۧۨۨۘۨۢۤ"
            goto L_0x0140
        L_0x0152:
            java.lang.String r0 = "ۦۘۚۗۡۛۧۚۜۚۘۚ۬۬۬۟۟ۙۥۖۘ۫ۛۨۘ"
            goto L_0x0140
        L_0x0155:
            java.lang.String r0 = "۠ۡ۫ۚۘۙۙ۫ۡۚۥۦۘ۠ۤۛۦۙۡۦۧۧ۬ۖ۬"
            goto L_0x0140
        L_0x0158:
            android.widget.RadioButton r0 = r10.f1202g
            m.h r3 = new m.h
            r3.<init>(r10, r9)
            r0.setOnClickListener(r3)
            goto L_0x008f
        L_0x0164:
            r0 = r1
            goto L_0x0090
        L_0x0167:
            java.lang.String r0 = "ۚۧۖۘ۟۫۫ۨۥۧۧۥۘۙۖ۠ۗۜۗ"
            goto L_0x012f
        L_0x016a:
            if (r3 == 0) goto L_0x0167
            java.lang.String r0 = "ۤۙۨۧۨۤ۟ۡۖۥۤۤۢۨۗۦۤۛ"
            goto L_0x012f
        L_0x016f:
            java.lang.String r0 = "lockedfp"
            com.obwhatsapp.youbasha.ui.lockV2.LockUtils.changeAppLock(r0)     // Catch:{ Exception -> 0x02d4 }
            java.lang.String r0 = "Fingerprint"
            java.lang.String r3 = "lock_typeV2"
            java.lang.String r4 = "Fingerprint"
            com.obwhatsapp.yo.shp.setStringPriv(r3, r4)     // Catch:{ Exception -> 0x02d4 }
            r4 = r0
        L_0x017e:
            r3 = -307970709(0xffffffffeda4bd6b, float:-6.373067E27)
            java.lang.String r0 = "۠۟ۙۚ۬ۜۡۦۘۚ۠ۦۘۡۦۖۖۤۛۦۘ"
        L_0x0183:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x02d4 }
            r5 = r5 ^ r3
            switch(r5) {
                case -1509031838: goto L_0x01b2;
                case -1364578538: goto L_0x01c5;
                case 1856724183: goto L_0x018c;
                case 2042574943: goto L_0x01e0;
                default: goto L_0x018b;
            }     // Catch:{ Exception -> 0x02d4 }
        L_0x018b:
            goto L_0x0183
        L_0x018c:
            r3 = -1758780299(0xffffffff972b2475, float:-5.5299095E-25)
            java.lang.String r0 = "ۡۚۢۙۡۘۛۦۘ۟ۜۙۨۗۗۘ۟ۡ"
        L_0x0191:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x02d4 }
            r5 = r5 ^ r3
            switch(r5) {
                case -2095802423: goto L_0x01cb;
                case -1714405222: goto L_0x01e0;
                case -1206378627: goto L_0x019a;
                case 1764417292: goto L_0x01ce;
                default: goto L_0x0199;
            }     // Catch:{ Exception -> 0x02d4 }
        L_0x0199:
            goto L_0x0191
        L_0x019a:
            java.lang.String r0 = ""
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x02d4 }
            if (r0 != 0) goto L_0x01c8
            java.lang.String r0 = "ۨۧۜۘۤۖۘۘ۬ۚۜۛۨۜۘۖۛۚۨۜ۠ۡۤۜۛ۟ۘۘ"
            goto L_0x0191
        L_0x01a5:
            java.lang.String r0 = "lock_typeV2"
            java.lang.String r3 = ""
            java.lang.String r0 = com.obwhatsapp.yo.shp.getStringPriv(r0, r3)     // Catch:{ Exception -> 0x02d4 }
            r4 = r0
            goto L_0x017e
        L_0x01af:
            java.lang.String r0 = "ۙۜۜۘ۬ۘۘۡۖۜۙۥ۫ۜۡۦۘ۠۫۬ۡۖۦۘۥۢ۟ۛ۫ۚ"
            goto L_0x0183
        L_0x01b2:
            android.widget.Switch r0 = r10.f1203h     // Catch:{ Exception -> 0x02d4 }
            java.lang.Object r0 = r0.getTag()     // Catch:{ Exception -> 0x02d4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02d4 }
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0)     // Catch:{ Exception -> 0x02d4 }
            if (r0 == 0) goto L_0x01af
            java.lang.String r0 = "ۥۨ۬ۥ۟ۗۦۦۧۘۡۗۜۘ۟ۡۖ"
            goto L_0x0183
        L_0x01c5:
            java.lang.String r0 = "ۨۖۦۘۨۦ۬ۛ۟ۜۘۢۚۡۘۢۦۡۥۗۧۘ۫ۤ"
            goto L_0x0183
        L_0x01c8:
            java.lang.String r0 = "ۢۤۤۗۖۥۘ۠ۦ۠ۧۢۘۙۘۡۘۖۤۦۢ۬ۥۘ۬ۤۘۘۛۧۛ"
            goto L_0x0191
        L_0x01cb:
            java.lang.String r0 = "ۤۦ۟ۦ۟۠ۚۤۦۘ۠ۗۦۘۚۖۢۗۨۜ۠۬ۘۘۗ۠ۨۘ"
            goto L_0x0191
        L_0x01ce:
            r3 = r1
        L_0x01cf:
            r5 = -759818904(0xffffffffd2b61568, float:-3.91021593E11)
            java.lang.String r0 = "۟ۨۖ۠ۛۤۘۧۤۗۨۘۤۦۦۙۨۜۛۦۘ"
        L_0x01d4:
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x02d4 }
            r6 = r6 ^ r5
            switch(r6) {
                case -1984468209: goto L_0x01dd;
                case -1853017268: goto L_0x01ec;
                case -1321793442: goto L_0x01e5;
                case -35256386: goto L_0x0225;
                default: goto L_0x01dc;
            }     // Catch:{ Exception -> 0x02d4 }
        L_0x01dc:
            goto L_0x01d4
        L_0x01dd:
            java.lang.String r0 = "ۡۗۜۘۡۛ۬۬ۡۖ۟ۙۢ۬ۗۜۘۡۛۜۘ"
            goto L_0x01d4
        L_0x01e0:
            r3 = r2
            goto L_0x01cf
        L_0x01e2:
            java.lang.String r0 = "ۚۥۖۘۢۗ۟ۛۜۤ۫۬ۤۘۘۦۤ۠ۨۧۚ"
            goto L_0x01d4
        L_0x01e5:
            boolean r0 = r10.f1207l     // Catch:{ Exception -> 0x02d4 }
            if (r0 != 0) goto L_0x01e2
            java.lang.String r0 = "۫۫ۦۘۦۙ۫ۢۨ۟ۥۧۜۘ۬ۘۘ۟ۚۥۥۨۙۘۘۚۙۖۡۘ"
            goto L_0x01d4
        L_0x01ec:
            r5 = 2048720081(0x7a1cfcd1, float:2.037815E35)
            java.lang.String r0 = "۠ۙۚۛۥۘۘ۠ۙۥۗۥۘۘۨۤۛ"
        L_0x01f1:
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x02d4 }
            r6 = r6 ^ r5
            switch(r6) {
                case -1150224536: goto L_0x0205;
                case 37533404: goto L_0x01fa;
                case 1008547969: goto L_0x0200;
                case 1488839771: goto L_0x0225;
                default: goto L_0x01f9;
            }
        L_0x01f9:
            goto L_0x01f1
        L_0x01fa:
            java.lang.String r0 = "۠ۛۙ۫ۛۚ۫ۖۜۘ۟ۡۨۘ۬ۡۨۦۧۦۨ۠ۙ"
            goto L_0x01f1
        L_0x01fd:
            java.lang.String r0 = "۬۫ۖۦۗۜۡۡۤۗ۬ۥۘۘۢۡۘۦۧۨ۠ۡۗۥۦۜۘۢۥۧۘ"
            goto L_0x01f1
        L_0x0200:
            if (r3 == 0) goto L_0x01fd
            java.lang.String r0 = "ۗۙۘۘۚۦۚۤۗۙ۬ۤۙۦۚۨ"
            goto L_0x01f1
        L_0x0205:
            r0 = r2
        L_0x0206:
            r10.f1206k = r0     // Catch:{ Exception -> 0x02d4 }
            android.widget.Switch r3 = r10.f1203h     // Catch:{ Exception -> 0x02d4 }
            r3.setChecked(r0)     // Catch:{ Exception -> 0x02d4 }
            android.widget.RadioGroup r0 = r10.f1201f     // Catch:{ Exception -> 0x02d4 }
            boolean r3 = r10.f1206k     // Catch:{ Exception -> 0x02d4 }
            r0.setEnabled(r3)     // Catch:{ Exception -> 0x02d4 }
            r3 = -1921014175(0xffffffff8d7fa661, float:-7.8778213E-31)
            java.lang.String r0 = "۫ۖ۬۬ۛۡۘ۟ۤۦۘۗۘ۬ۧ۫ۗۖۘۘۘ۬۟ۥۘۢۥۗ"
        L_0x0219:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x02d4 }
            r5 = r5 ^ r3
            switch(r5) {
                case -773368161: goto L_0x0231;
                case 307796343: goto L_0x02cd;
                case 493735623: goto L_0x022a;
                case 2050495895: goto L_0x0222;
                default: goto L_0x0221;
            }     // Catch:{ Exception -> 0x02d4 }
        L_0x0221:
            goto L_0x0219
        L_0x0222:
            java.lang.String r0 = "ۜۜۘۖۢۛۥ۠ۖۘۢۘۡۙۡۜۧۘۗۙۛۥۘ"
            goto L_0x0219
        L_0x0225:
            r0 = r1
            goto L_0x0206
        L_0x0227:
            java.lang.String r0 = "ۡۘ۟۟ۘۡۜۚ۠ۧۥۛۨۗ۠"
            goto L_0x0219
        L_0x022a:
            boolean r0 = r10.f1206k     // Catch:{ Exception -> 0x02d4 }
            if (r0 == 0) goto L_0x0227
            java.lang.String r0 = "ۨ۬ۘۚۚۤۙ۫ۧۥۛۡۘۗۡۘۘۥ۬ۗۙۙۜۘۦۤۤ"
            goto L_0x0219
        L_0x0231:
            android.widget.RadioGroup r0 = r10.f1201f     // Catch:{ Exception -> 0x02d4 }
            android.view.View r3 = r0.findViewWithTag(r4)     // Catch:{ Exception -> 0x02d4 }
            int r0 = r0.indexOfChild(r3)     // Catch:{ Exception -> 0x02d4 }
            r10.f1209n = r0     // Catch:{ Exception -> 0x02d4 }
            android.widget.RadioGroup r3 = r10.f1201f     // Catch:{ Exception -> 0x02d4 }
            android.view.View r0 = r3.getChildAt(r0)     // Catch:{ Exception -> 0x02d4 }
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0     // Catch:{ Exception -> 0x02d4 }
            r3 = 1
            r0.setChecked(r3)     // Catch:{ Exception -> 0x02d4 }
        L_0x0249:
            android.widget.Switch r0 = r10.f1203h     // Catch:{ Exception -> 0x02d4 }
            com.obwhatsapp.yo.l r3 = new com.obwhatsapp.yo.l     // Catch:{ Exception -> 0x02d4 }
            r4 = 1
            r3.<init>(r10, r4)     // Catch:{ Exception -> 0x02d4 }
            r0.setOnCheckedChangeListener(r3)     // Catch:{ Exception -> 0x02d4 }
            android.widget.RadioGroup r0 = r10.f1201f     // Catch:{ Exception -> 0x02d4 }
            android.widget.RadioButton r3 = r10.f1202g     // Catch:{ Exception -> 0x02d4 }
            int r0 = r0.indexOfChild(r3)     // Catch:{ Exception -> 0x02d4 }
            android.widget.RadioGroup r3 = r10.f1201f     // Catch:{ Exception -> 0x02d4 }
            m.j r4 = new m.j     // Catch:{ Exception -> 0x02d4 }
            r4.<init>(r10, r0)     // Catch:{ Exception -> 0x02d4 }
            r3.setOnCheckedChangeListener(r4)     // Catch:{ Exception -> 0x02d4 }
        L_0x0266:
            java.lang.String r0 = "yoCallsPrivacy"
            android.preference.Preference r0 = r10.findPreference(r0)
            r10.f1211p = r0
            java.lang.String r0 = "yoCustomPrivList"
            android.preference.Preference r0 = r10.findPreference(r0)
            r10.f1212q = r0
            java.lang.String r0 = "cat_pc"
            android.preference.Preference r0 = r10.findPreference(r0)
            r10.f1213r = r0
            java.lang.String r0 = "cat_pg"
            android.preference.Preference r0 = r10.findPreference(r0)
            r10.f1214s = r0
            java.lang.String r0 = "cat_pb"
            android.preference.Preference r0 = r10.findPreference(r0)
            r10.f1215t = r0
            android.preference.Preference r0 = r10.f1211p     // Catch:{ Exception -> 0x02d6 }
            java.lang.String r3 = com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.getCallsControlLevelString()     // Catch:{ Exception -> 0x02d6 }
            r0.setSummary(r3)     // Catch:{ Exception -> 0x02d6 }
        L_0x0297:
            android.preference.Preference r0 = r10.f1211p
            m.i r3 = new m.i
            r3.<init>(r10, r2)
            r0.setOnPreferenceClickListener(r3)
            android.preference.Preference r0 = r10.f1212q
            m.i r2 = new m.i
            r2.<init>(r10, r1)
            r0.setOnPreferenceClickListener(r2)
            android.preference.Preference r0 = r10.f1214s
            m.i r1 = new m.i
            r1.<init>(r10, r7)
            r0.setOnPreferenceClickListener(r1)
            android.preference.Preference r0 = r10.f1215t
            m.i r1 = new m.i
            r1.<init>(r10, r8)
            r0.setOnPreferenceClickListener(r1)
            android.preference.Preference r0 = r10.f1213r
            m.i r1 = new m.i
            r1.<init>(r10, r9)
            r0.setOnPreferenceClickListener(r1)
            com.obwhatsapp.youbasha.ui.activity.CustomList.getCustomJIDs()
            return
        L_0x02cd:
            android.widget.RadioGroup r0 = r10.f1201f     // Catch:{ Exception -> 0x02d4 }
            r0.clearCheck()     // Catch:{ Exception -> 0x02d4 }
            goto L_0x0249
        L_0x02d4:
            r0 = move-exception
            goto L_0x0266
        L_0x02d6:
            r0 = move-exception
            goto L_0x0297
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.SecPrivacy.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r6v16 */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: type inference failed for: r6v19 */
    /* JADX WARNING: type inference failed for: r6v20 */
    /* JADX WARNING: type inference failed for: r6v21 */
    /* JADX WARNING: type inference failed for: r6v22 */
    /* JADX WARNING: type inference failed for: r6v23 */
    /* JADX WARNING: type inference failed for: r6v24 */
    /* JADX WARNING: type inference failed for: r6v25 */
    /* JADX WARNING: type inference failed for: r6v26 */
    /* JADX WARNING: type inference failed for: r6v27 */
    /* JADX WARNING: type inference failed for: r6v28 */
    /* JADX WARNING: type inference failed for: r6v29 */
    /* JADX WARNING: type inference failed for: r6v30 */
    /* JADX WARNING: type inference failed for: r6v31 */
    /* JADX WARNING: type inference failed for: r6v32 */
    /* JADX WARNING: type inference failed for: r6v33 */
    /* JADX WARNING: type inference failed for: r6v34 */
    /* JADX WARNING: type inference failed for: r6v35 */
    /* JADX WARNING: type inference failed for: r6v36 */
    /* JADX WARNING: type inference failed for: r6v37 */
    /* JADX WARNING: type inference failed for: r6v38 */
    /* JADX WARNING: type inference failed for: r6v39 */
    /* JADX WARNING: type inference failed for: r6v40 */
    /* JADX WARNING: type inference failed for: r6v41 */
    /* JADX WARNING: type inference failed for: r6v42 */
    /* JADX WARNING: type inference failed for: r6v43 */
    /* JADX WARNING: type inference failed for: r6v44 */
    /* JADX WARNING: type inference failed for: r6v45 */
    /* JADX WARNING: type inference failed for: r6v46 */
    /* JADX WARNING: type inference failed for: r6v47 */
    /* JADX WARNING: type inference failed for: r6v48 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: type inference failed for: r4v32 */
    /* JADX WARNING: type inference failed for: r4v33 */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r4v35 */
    /* JADX WARNING: type inference failed for: r4v36 */
    /* JADX WARNING: type inference failed for: r4v37 */
    /* JADX WARNING: type inference failed for: r4v38 */
    /* JADX WARNING: type inference failed for: r4v39 */
    /* JADX WARNING: type inference failed for: r4v40 */
    /* JADX WARNING: type inference failed for: r4v41 */
    /* JADX WARNING: type inference failed for: r4v42 */
    /* JADX WARNING: type inference failed for: r4v43 */
    /* JADX WARNING: type inference failed for: r4v44 */
    /* JADX WARNING: type inference failed for: r4v45 */
    /* JADX WARNING: type inference failed for: r4v46 */
    /* JADX WARNING: type inference failed for: r4v47 */
    /* JADX WARNING: type inference failed for: r4v48 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r13 = this;
            r8 = 0
            r3 = 0
            java.lang.String r0 = "ۚۥۦۢۥۘۘۨۤۤ۫ۘۘ۬ۛۘۥۖ۬ۤۥۖۘ"
            r1 = r0
            r2 = r3
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r8
            r9 = r8
            r10 = r8
            r11 = r3
        L_0x000d:
            int r0 = r1.hashCode()
            r8 = 517(0x205, float:7.24E-43)
            r12 = -297364888(0xffffffffee469268, float:-1.5363757E28)
            r0 = r0 ^ r8
            r0 = r0 ^ r12
            switch(r0) {
                case -2048355656: goto L_0x0067;
                case -1894730245: goto L_0x001c;
                case -1869461600: goto L_0x0202;
                case -1822433525: goto L_0x018d;
                case -1767120204: goto L_0x00e8;
                case -1684978140: goto L_0x021b;
                case -1649419150: goto L_0x00f3;
                case -1627009724: goto L_0x01cb;
                case -1556654633: goto L_0x0169;
                case -1503683879: goto L_0x0216;
                case -1482437342: goto L_0x0195;
                case -1316786543: goto L_0x01c1;
                case -1293324446: goto L_0x0060;
                case -1193779620: goto L_0x0079;
                case -1107101928: goto L_0x0027;
                case -938493930: goto L_0x00ed;
                case -867739111: goto L_0x0216;
                case -832323956: goto L_0x0202;
                case -537625801: goto L_0x01d7;
                case -384650502: goto L_0x00e8;
                case -341802234: goto L_0x01e9;
                case -206362137: goto L_0x00d9;
                case -36085691: goto L_0x0097;
                case 107432174: goto L_0x0020;
                case 145042105: goto L_0x0075;
                case 213154641: goto L_0x0055;
                case 393139538: goto L_0x0220;
                case 449182071: goto L_0x01ab;
                case 554738045: goto L_0x0202;
                case 573503335: goto L_0x0128;
                case 714774519: goto L_0x0216;
                case 886232629: goto L_0x003e;
                case 905071776: goto L_0x015d;
                case 994110036: goto L_0x00ba;
                case 994557749: goto L_0x00cc;
                case 1191217221: goto L_0x0163;
                case 1442856030: goto L_0x0122;
                case 1486918860: goto L_0x0157;
                case 1533823907: goto L_0x012e;
                case 1540438228: goto L_0x00e1;
                case 1585071337: goto L_0x0220;
                case 1619847332: goto L_0x01b5;
                case 1751131554: goto L_0x00f9;
                case 1850744974: goto L_0x019f;
                case 2143595994: goto L_0x00e8;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x000d
        L_0x001c:
            java.lang.String r0 = "ۖۛۡۚۘۢ۟ۗۦۘۨۦۡۘۡۜۥ"
            r1 = r0
            goto L_0x000d
        L_0x0020:
            super.onDestroy()
            java.lang.String r0 = "ۦۖۖۛۛۡ۬ۜۨۘ۠ۤۧۥۨۨۘۗۢۦۢ۟ۖۘۚۙۡۘ"
            r1 = r0
            goto L_0x000d
        L_0x0027:
            android.widget.Switch r0 = r13.f1204i
            java.lang.Object r0 = r0.getTag()
            java.lang.String r0 = r0.toString()
            android.widget.Switch r1 = r13.f1204i
            boolean r1 = r1.isChecked()
            com.obwhatsapp.yo.shp.setBooleanPriv(r0, r1)
            java.lang.String r0 = "۬ۙۢۜۨۖۘ۫۫ۜۘۡۛۨۘۡۢۥۘۚ۫ۦ"
            r1 = r0
            goto L_0x000d
        L_0x003e:
            android.widget.Switch r0 = r13.f1205j
            java.lang.Object r0 = r0.getTag()
            java.lang.String r0 = r0.toString()
            android.widget.Switch r1 = r13.f1205j
            boolean r1 = r1.isChecked()
            com.obwhatsapp.yo.shp.setBooleanPriv(r0, r1)
            java.lang.String r0 = "ۜ۬ۦۘۦۧ۠ۢ۟ۥۘ۠ۨۡۗۘ۠ۙۤۖۘۨۢۖۘۚۚ۫۫"
            r1 = r0
            goto L_0x000d
        L_0x0055:
            android.widget.Switch r0 = r13.f1203h
            boolean r8 = r0.isChecked()
            java.lang.String r0 = "ۨۜۥۨۜۖۘۖ۫۟ۘۡ۟ۗۖ۟ۘۧ۫"
            r1 = r0
            r11 = r8
            goto L_0x000d
        L_0x0060:
            android.widget.RadioGroup r8 = r13.f1201f
            java.lang.String r0 = "۟۬ۥۚۦ۫ۙۛۡۨۢ۟ۤۜۜۘۘۛ۫ۚۡ۫ۡ۫ۦۘۦۗ۟"
            r1 = r0
            r10 = r8
            goto L_0x000d
        L_0x0067:
            int r0 = r10.getCheckedRadioButtonId()
            android.view.View r0 = r10.findViewById(r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            java.lang.String r1 = "ۧ۟۟ۥ۬۫ۤۨۨۥۦۨۢۡ۬ۖۜۖۡ۟ۥۘ"
            r9 = r0
            goto L_0x000d
        L_0x0075:
            java.lang.String r0 = "ۦۤۦۡۦۜ۟ۗۙۖۦۢۨۨۜۗۛۗۧۗۙۡۖۘ"
            r1 = r0
            goto L_0x000d
        L_0x0079:
            r1 = 549084793(0x20ba5e79, float:3.1572142E-19)
            java.lang.String r0 = "ۥۜۚ۠ۜۙۜۛۗۧۜۘۙۧۖۖۛۥ۠۟ۧ"
        L_0x007e:
            int r8 = r0.hashCode()
            r8 = r8 ^ r1
            switch(r8) {
                case -2114742454: goto L_0x021b;
                case -1279788110: goto L_0x008d;
                case 616104389: goto L_0x0092;
                case 1177808558: goto L_0x0087;
                default: goto L_0x0086;
            }
        L_0x0086:
            goto L_0x007e
        L_0x0087:
            java.lang.String r0 = "ۜۗ۠۟۠ۧۚۡۤۤۚ۟ۘ۬ۥۤۢۧۛۥۡۘۥ۟ۜ"
            goto L_0x007e
        L_0x008a:
            java.lang.String r0 = "ۜۦۦۘۘ۬ۢ۫ۛۦۘۨۜ۬ۨۡۙۘۥۘۙ۫ۦۘ"
            goto L_0x007e
        L_0x008d:
            if (r9 == 0) goto L_0x008a
            java.lang.String r0 = "ۚۧ۫۠ۦۘۦۛۜۘۨۛۡۢۜۥۘ۟ۗۥ"
            goto L_0x007e
        L_0x0092:
            java.lang.String r0 = "۬ۖۦۘ۫ۘۘۚ۠ۤ۠۟ۗ۟۫ۚۙ۟ۘۨ۫ۘ"
            r1 = r0
            goto L_0x000d
        L_0x0097:
            r1 = -1960847687(0xffffffff8b1fd6b9, float:-3.0783825E-32)
            java.lang.String r0 = "۫ۖۥۚۧۚۦ۫ۨۘۨۜۧۘ۫ۜۧۜۡۧۙۥ۠ۚۡ۬"
        L_0x009c:
            int r8 = r0.hashCode()
            r8 = r8 ^ r1
            switch(r8) {
                case -1265511503: goto L_0x00a5;
                case -363137997: goto L_0x00ad;
                case 616440859: goto L_0x00b5;
                case 663551541: goto L_0x00b2;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            goto L_0x009c
        L_0x00a5:
            java.lang.String r0 = "ۗۥۜۘ۫ۦۧۘۜۤۙۖۘ۬۠ۦۥۘۛۛۡۘۘۧۢۢۚۥ"
            r1 = r0
            goto L_0x000d
        L_0x00aa:
            java.lang.String r0 = "ۧۘ۠ۛۧ۬ۨ۫ۘۙۤۥۘۜۢۨۘ۟۠ۡ"
            goto L_0x009c
        L_0x00ad:
            if (r11 != 0) goto L_0x00aa
            java.lang.String r0 = "ۙ۟ۡۤۘۦۘۥ۫ۢ۟ۥ۟۬ۙ۠ۗۢ۬"
            goto L_0x009c
        L_0x00b2:
            java.lang.String r0 = "ۡۜۚۥۦۧۘۙۗۧۜۧۚۙ۫ۙۙۨۘ۫ۤۨۘۘۘ"
            goto L_0x009c
        L_0x00b5:
            java.lang.String r0 = "ۡۤۘۘ۫ۦۗۘۢۚۥۖۛۦ۠ۖ"
            r1 = r0
            goto L_0x000d
        L_0x00ba:
            android.widget.Switch r0 = r13.f1203h
            java.lang.Object r0 = r0.getTag()
            java.lang.String r0 = r0.toString()
            com.obwhatsapp.yo.shp.setBooleanPriv(r0, r11)
            java.lang.String r0 = "۟ۧۡۘ۫ۨۜۨ۫ۨۘۧۤۜۘۨۡۙۢۦۜۥۧۛۢۥۘۘ"
            r1 = r0
            goto L_0x000d
        L_0x00cc:
            java.lang.Object r0 = r9.getTag()
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "۫ۖۜۘۘۡۦۘۗۖۘۘۗ۠ۤۗۦۤ۫ۖۘۘۘۡ۟ۛۢ۫ۙ۟ۤ"
            r1 = r0
            goto L_0x000d
        L_0x00d9:
            r7.getClass()
            java.lang.String r0 = "ۜۦۜۘۡۤ۫ۚ۟۫۬ۜ۫ۛۢ۠۬ۖۘۢۨۛۨۨۢ"
            r1 = r0
            goto L_0x000d
        L_0x00e1:
            int r0 = r7.hashCode()
            switch(r0) {
                case 79221: goto L_0x01fd;
                case 291934404: goto L_0x01f8;
                case 873562992: goto L_0x01f3;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            java.lang.String r0 = "ۜۢۖۥۢۢۡۖۥۙ۠ۤۥ۟ۥ۟ۙ۫۟ۜۡۘۙ۬ۖۧ۫ۨۘ"
            r1 = r0
            goto L_0x000d
        L_0x00ed:
            r6 = -1
            java.lang.String r0 = "ۨ۫ۦۦۖۨۙ۫ۡۨۡۨۘۛۦۡۘ۫۟ۦۘۨ۠ۜۘ"
            r1 = r0
            goto L_0x000d
        L_0x00f3:
            java.lang.String r0 = "ۢ۠ۤ۠ۨۥۜۥ۟۠ۡۛۤۖۧۤۘۛۙ۠۟ۛ۠"
            r1 = r0
            r5 = r6
            goto L_0x000d
        L_0x00f9:
            r1 = -1978416383(0xffffffff8a13c301, float:-7.114469E-33)
            java.lang.String r0 = "ۥۥۨۜۤۘۚۙۨۘۨ۟ۛ۟۟ۥۡۡۨۤۧۙۧۡۗ"
        L_0x00fe:
            int r8 = r0.hashCode()
            r8 = r8 ^ r1
            switch(r8) {
                case -1127785402: goto L_0x011a;
                case -979044848: goto L_0x0107;
                case 1144781206: goto L_0x010f;
                case 1580952028: goto L_0x011d;
                default: goto L_0x0106;
            }
        L_0x0106:
            goto L_0x00fe
        L_0x0107:
            java.lang.String r0 = "ۖۢۢۛۙۥ۟ۖۜۜ۫ۖ۠۠ۗ۫ۘۚۘ۫ۥۢۘۡۚۛۖ"
            r1 = r0
            goto L_0x000d
        L_0x010c:
            java.lang.String r0 = "۫ۜۜۘۗۡۡۘۧۚۤۡۢ۬ۦۖۜۘۡۥۜۘۚۗۢ"
            goto L_0x00fe
        L_0x010f:
            java.lang.String r0 = "Pattern"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x010c
            java.lang.String r0 = "Oۗۖۛۥ۟ۖۘ۠ۨۖۘۗۗۚ"
            goto L_0x00fe
        L_0x011a:
            java.lang.String r0 = "ۖۖۥ۠ۢۜۨۡ۟ۢ۫ۡۘۚۨ۟۬ۙۨۤۦ"
            goto L_0x00fe
        L_0x011d:
            java.lang.String r0 = "ۡۚۡۘۦۖۢۤۢ۫۠ۡۧۡۡۧۘ۫ۜ۫ۛۥۡۛ۫"
            r1 = r0
            goto L_0x000d
        L_0x0122:
            r4 = 2
            java.lang.String r0 = "ۗۡۧۨۡۨۦۡۦۢۢۧۜۘۦۘ۬ۥۖۘۢۖۨۘۘ۫ۘ"
            r1 = r0
            goto L_0x000d
        L_0x0128:
            java.lang.String r0 = "۫۫ۘۘۨۥۥۡ۬ۡۦ۟ۦۡ۫ۘۥۖۘۘۗۖۘۘۗۘۡ"
            r1 = r0
            r5 = r4
            goto L_0x000d
        L_0x012e:
            r1 = 1828592887(0x6cfe1cf7, float:2.4576315E27)
            java.lang.String r0 = "ۚ۫ۨۜۨۛ۬ۜۘۛۖۢۚۤۗ"
        L_0x0133:
            int r8 = r0.hashCode()
            r8 = r8 ^ r1
            switch(r8) {
                case -1755570626: goto L_0x014f;
                case 559842459: goto L_0x013c;
                case 1237130689: goto L_0x0144;
                case 1255324223: goto L_0x0152;
                default: goto L_0x013b;
            }
        L_0x013b:
            goto L_0x0133
        L_0x013c:
            java.lang.String r0 = "ۨۙۧۛۙۡۧ۠۠۠ۡۧ۬ۥۢۜۦۨ"
            r1 = r0
            goto L_0x000d
        L_0x0141:
            java.lang.String r0 = "ۥۙۜۜ۫ۛۛۛۘۘ۟ۖۡۛ۟۬ۛۡۦۘ۬ۢۜ۫ۛۧۦۧ"
            goto L_0x0133
        L_0x0144:
            java.lang.String r0 = "Fingerprint"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0141
            java.lang.String r0 = "ۛ۟۫ۡۧۘۘۤ۫ۡۖ۠ۢۛۜۢۤۡۜ"
            goto L_0x0133
        L_0x014f:
            java.lang.String r0 = "ۛۤۖۘۘۜۦۘۖۡۥۘۗۢ۟۫۫۠ۘۜۗ"
            goto L_0x0133
        L_0x0152:
            java.lang.String r0 = "ۤۥۧۤۧۜۘۦ۟ۡۙ۬ۘۦۨۦۘۙۖۘۥۘۚۚۛۡۖۜۥۘ"
            r1 = r0
            goto L_0x000d
        L_0x0157:
            r2 = 1
            java.lang.String r0 = "۫ۗ۬۠ۘۥ۠ۨۚۗ۟ۛۚۡۢ"
            r1 = r0
            goto L_0x000d
        L_0x015d:
            java.lang.String r0 = "ۥۙۥ۫ۛۗۜۧۜۘ۠۬ۜۘ۬ۚۘۘۚۙ۟"
            r1 = r0
            r5 = r2
            goto L_0x000d
        L_0x0163:
            java.lang.String r0 = "ۖ۟ۨۧۦۖ۬۠ۧ۟ۤۜ۬ۢ۬"
            r1 = r0
            r5 = r3
            goto L_0x000d
        L_0x0169:
            r1 = 987104209(0x3ad603d1, float:0.0016328042)
            java.lang.String r0 = "ۜۤۡۘۢ۬ۡ۟ۚۚۗۘۥۦۤۚۜۧۘۘ۟۠"
        L_0x016e:
            int r8 = r0.hashCode()
            r8 = r8 ^ r1
            switch(r8) {
                case -1684510511: goto L_0x0202;
                case -1219091718: goto L_0x0177;
                case -96878379: goto L_0x0185;
                case 1146011496: goto L_0x0188;
                default: goto L_0x0176;
            }
        L_0x0176:
            goto L_0x016e
        L_0x0177:
            java.lang.String r0 = "PIN"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0182
            java.lang.String r0 = "ۡۖۛۛۘۖۗ۠۠ۡۖ۬ۙۜ۬۬ۦ۫ۡۧۥۘۜۥۡۛۚۧ"
            goto L_0x016e
        L_0x0182:
            java.lang.String r0 = "ۦۛ۫۟ۗۨۘۢۛ۫ۦۥۧۧ۬ۖۘۦۙۜۘۢۡۡۘ"
            goto L_0x016e
        L_0x0185:
            java.lang.String r0 = "ۥۡۗۤۧۥۡۢۦۨۖ۠۫ۜ۫ۗ۠ۨ"
            goto L_0x016e
        L_0x0188:
            java.lang.String r0 = "ۛۖۧۘۖۗۦ۠ۨ۬ۛۛۥۘۜۜۘ۟ۥۜۡۦۘ"
            r1 = r0
            goto L_0x000d
        L_0x018d:
            switch(r5) {
                case 0: goto L_0x0211;
                case 1: goto L_0x020c;
                case 2: goto L_0x0207;
                default: goto L_0x0190;
            }
        L_0x0190:
            java.lang.String r0 = "ۨ۫ۛۛ۟۟ۥۧ۟ۜۦ۫ۜۗۛۨۘۘۛۢۙۙۧۡۘ۠ۤۦ"
            r1 = r0
            goto L_0x000d
        L_0x0195:
            java.lang.String r0 = "locked"
            com.obwhatsapp.youbasha.ui.lockV2.LockUtils.changeAppLock(r0)
            java.lang.String r0 = "ۧۦۧۘۥۙۦۡ۫ۧۖۥۤۛۜۖۘ۟۠ۡۦۦ"
            r1 = r0
            goto L_0x000d
        L_0x019f:
            java.lang.String r0 = "lock_typeV2"
            java.lang.String r1 = "Pattern"
            com.obwhatsapp.yo.shp.setStringPriv(r0, r1)
            java.lang.String r0 = "۬۟ۥ۫ۛۛۜۘۙۨ۟ۥۘۙ۟ۖۛۦۧۘۘۛۥۘ"
            r1 = r0
            goto L_0x000d
        L_0x01ab:
            java.lang.String r0 = "lockedfp"
            com.obwhatsapp.youbasha.ui.lockV2.LockUtils.changeAppLock(r0)
            java.lang.String r0 = "ۦۢ۟ۥ۬۫ۨ۬ۢۗۙۥۘۚۤۥۘۙۥۥۘۤۦۘۘۦۥ۫ۜۢ۫"
            r1 = r0
            goto L_0x000d
        L_0x01b5:
            java.lang.String r0 = "lock_typeV2"
            java.lang.String r1 = "Fingerprint"
            com.obwhatsapp.yo.shp.setStringPriv(r0, r1)
            java.lang.String r0 = "ۦۨۗۥۗ۬ۢۖۨۘۗۘۧۘۦۗۨۘۦۚۦۘۚۥ۟ۧۘۧۛ۫ۘۘ"
            r1 = r0
            goto L_0x000d
        L_0x01c1:
            java.lang.String r0 = "lockedpn"
            com.obwhatsapp.youbasha.ui.lockV2.LockUtils.changeAppLock(r0)
            java.lang.String r0 = "ۛۤۨۘۛۦۤۤۖۖۛۡۖۦۖۙۤۜۙ۬ۤۥ"
            r1 = r0
            goto L_0x000d
        L_0x01cb:
            java.lang.String r0 = "lock_typeV2"
            java.lang.String r1 = "PIN"
            com.obwhatsapp.yo.shp.setStringPriv(r0, r1)
            java.lang.String r0 = "ۗۢۚ۬ۛۤۢۤۤۧ۬ۦۘۢۢۚۜۢ۬ۦۚۙۘۧۙ"
            r1 = r0
            goto L_0x000d
        L_0x01d7:
            android.widget.Switch r0 = r13.f1203h
            java.lang.Object r0 = r0.getTag()
            java.lang.String r0 = r0.toString()
            com.obwhatsapp.yo.shp.setBooleanPriv(r0, r3)
            java.lang.String r0 = "ۚۖۨ۫ۘۗ۫ۢۛۙۖۡۘۚ۟ۘ۬۠ۘ"
            r1 = r0
            goto L_0x000d
        L_0x01e9:
            android.widget.RadioGroup r0 = r13.f1201f
            r0.clearCheck()
            java.lang.String r0 = "ۜۥۢ۠۬ۘۨ۫ۡۘۨۜ۫ۚۡۘۦۨۘۙۘۘۘۤۘۡ"
            r1 = r0
            goto L_0x000d
        L_0x01f3:
            java.lang.String r0 = "ۛۗۖۘۥ۟ۘۡۖ۠ۧۗۨۗۘۢ۫۠ۙۡۛ۬ۥۤۨۖ"
            r1 = r0
            goto L_0x000d
        L_0x01f8:
            java.lang.String r0 = "ۙۜۧۘ۟ۗۗۡۡۨۨۤۖ۫ۘۖۧۥۘ"
            r1 = r0
            goto L_0x000d
        L_0x01fd:
            java.lang.String r0 = "۬ۦۤ۟۫ۘۚۜۨۢ۠۫ۢ۬ۘۚۦۥۦۢ۫ۧۜۘ"
            r1 = r0
            goto L_0x000d
        L_0x0202:
            java.lang.String r0 = "ۦ۫ۨۚۡۧۘۧۙۥۘۢۚۛ۠۟۬ۧۢۧ۠ۤ"
            r1 = r0
            goto L_0x000d
        L_0x0207:
            java.lang.String r0 = "ۙۖۚۚۛۜۘ۫ۥۘۧۗۚۦ۠ۙ۬۬ۨۜۜ"
            r1 = r0
            goto L_0x000d
        L_0x020c:
            java.lang.String r0 = "۬۬ۜۘۧۗۡۘ۬ۧۗۢۨۥ۫ۛ۠ۡۗۢ۠ۡۡۘ"
            r1 = r0
            goto L_0x000d
        L_0x0211:
            java.lang.String r0 = "ۧۦ۬ۥ۠ۤۥ۟ۘۘۜ۟۠ۤۙ"
            r1 = r0
            goto L_0x000d
        L_0x0216:
            java.lang.String r0 = "ۗۢۚ۬ۛۤۢۤۤۧ۬ۦۘۢۢۚۜۢ۬ۦۚۙۘۧۙ"
            r1 = r0
            goto L_0x000d
        L_0x021b:
            java.lang.String r0 = "۫ۨ۟ۨۥۦۦ۬۫ۜۢۦۖۛۚۗۘۜۘ۫ۗ۠ۙۨۜۤۙۘ"
            r1 = r0
            goto L_0x000d
        L_0x0220:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.YoSettings.SecPrivacy.onDestroy():void");
    }

    public void onResume() {
        super.onResume();
        try {
            this.f1211p.setSummary(CallsPrivacy.getCallsControlLevelString());
        } catch (Exception e2) {
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        super.onSharedPreferenceChanged(sharedPreferences, str);
        String str2 = "ۢۗۥۢۚۨۜۙ۬ۦۨۤۜۘۥۘ";
        while (true) {
            switch (str2.hashCode() ^ 672191287) {
                case -940335115:
                    str2 = "۫ۚۘۤۚ۟ۥۨۖۘۜ۬ۨۘۡۛۛ۫ۥۜۘ";
                    continue;
                case -929564307:
                    break;
                case 146974165:
                    if (str.equals("yoBlueOnReply")) {
                        str2 = "ۗۘۡ۫ۤۛۥ۠ۘۘۤۖۘۘۜ۟ۛۗۧۛ";
                        break;
                    } else {
                        str2 = "ۦۘۡۗۧۦۚ۫ۖۘۤ۬ۡۘۙۜۖ";
                        continue;
                    }
                case 1130713413:
                    boolean z2 = sharedPreferences.getBoolean("yoBlueOnReply", false);
                    boolean z3 = sharedPreferences.getBoolean("yoHideReadC", false);
                    boolean z4 = sharedPreferences.getBoolean("yoHideReadG", false);
                    String str3 = "ۙۗۛۗ۫ۘۤۥۖۘۜۜۛۛۥۡۙۤۙۘۗ۠ۘ۫ۥ";
                    while (true) {
                        switch (str3.hashCode() ^ -1058422382) {
                            case -1988789550:
                                String str4 = "۬ۜۦۖۙۥۘۤ۠ۦ۟۟۟ۧ";
                                while (true) {
                                    switch (str4.hashCode() ^ 547341285) {
                                        case -1189906051:
                                            shp.setBooleanPriv("yoHideReadC", true);
                                            break;
                                        case -769575997:
                                            if (!z3) {
                                                str4 = "ۜۜۥۘۜۛۖۘۥۙۚ۠۬۟ۥۢۦۖۖۧۦۢۡۡ۫ۤ";
                                                break;
                                            } else {
                                                str4 = "ۦ۫ۦۜ۠۠۟ۧۥ۬ۗۨۥۘۘۘۨۦۨۙۤۡ۠ۙۜۘ";
                                                continue;
                                            }
                                        case -171415983:
                                            str4 = "ۗۤ۬ۢ۟ۨۡۤۜۘۖۗۖۖ۬ۨۘۜۤۛۙۖۘ";
                                            continue;
                                        case 124262090:
                                            break;
                                    }
                                }
                                break;
                            case -1303801013:
                                if (z2) {
                                    str3 = "ۖۙ۟ۜۗۜۚۧۚۧۦ۟ۡۘۥۘۥۢۨۘۥۢۜۘۢۨۚ۠ۤ۟";
                                    break;
                                } else {
                                    str3 = "ۦۜۡۘۡۘۥۘۢۡ۬ۚۖ۟۬ۡۨ۫ۖۗ۟ۡ۟ۗۙۘ";
                                    continue;
                                }
                            case 762107629:
                                break;
                            case 990435389:
                                str3 = "۟ۡۦۘ۫ۚۖۘ۠ۡۜ۠ۢۡۘ۬ۡۜۘ";
                                continue;
                        }
                    }
                    String str5 = "ۦۡۜ۫ۙۡ۠۬ۡۘۚۥۘ۠۟ۥۘۜۘۦۙۙۤ۬۫ۗ";
                    while (true) {
                        switch (str5.hashCode() ^ -1495231654) {
                            case -1380363482:
                                String str6 = "ۥۢۘۛۤۘ۫ۜ۟ۡۧۥۘۜ۠ۗۡۦۨ";
                                while (true) {
                                    switch (str6.hashCode() ^ 1862168332) {
                                        case -616154846:
                                            break;
                                        case -316496914:
                                            shp.setBooleanPriv("yoHideReadG", true);
                                            break;
                                        case -31155433:
                                            str6 = "۫ۜۛۘ۠۟۬ۙۦ۟ۢ۫ۚۗۛ";
                                            continue;
                                        case 608957967:
                                            if (!z4) {
                                                str6 = "ۘۨۤ۬ۗۦۘۘۙۨۦۚۙۗۜۦۛۗ۟۬ۘۘ";
                                                break;
                                            } else {
                                                str6 = "ۘ۠ۜۘۨۛۨۗۨۤ۫ۨۢۛۗۡۘۦۚۙۖۦۡۘ۫ۡۖۘ";
                                                continue;
                                            }
                                    }
                                }
                                break;
                            case -1214981981:
                                str5 = "۠۠ۘۘ۟ۥۥۨۛۜۤۧۡۘۖۨۘۥ۟ۘ";
                                continue;
                            case 421813410:
                                break;
                            case 2000562446:
                                if (z2) {
                                    str5 = "۟ۡۖۘ۠ۥۧۧۢۚۢۤ۟ۢۧۙ۫ۥۜۡۘۢ۠ۜۧۜ۫";
                                    break;
                                } else {
                                    str5 = "ۘۦۡۘ۫ۤ۟ۥ۫ۡۥۘۥۘۙ۟ۦۘۖۖۘۘ";
                                    continue;
                                }
                        }
                    }
                    break;
            }
        }
        BaseSettingsActivity.setMustRestart(true);
        try {
            this.f1211p.setSummary(CallsPrivacy.getCallsControlLevelString());
        } catch (Exception e2) {
        }
    }

    public void priv_reset(View view) {
        new AlertDialog.Builder(this).setTitle(yo.getString("msg_priv_confirm")).setMessage(yo.getString("reset_priv_confirma")).setPositiveButton(17039379, p_reset.INSTANCE).setNegativeButton(17039369, AG_Reset.INSTANCE).show();
    }
}
