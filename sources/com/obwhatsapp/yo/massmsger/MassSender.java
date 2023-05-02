package com.obwhatsapp.yo.massmsger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.contact.picker.ContactPicker;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.autoschedreply.f;
import com.obwhatsapp.yo.dep;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity;
import h.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MassSender extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public static final int f807a = 1;

    /* renamed from: b  reason: collision with root package name */
    public TextView f808b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f809c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f810d;

    /* renamed from: e  reason: collision with root package name */
    public EditText f811e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f812f;

    /* renamed from: g  reason: collision with root package name */
    public Button f813g;

    /* renamed from: h  reason: collision with root package name */
    public String f814h;

    /* renamed from: i  reason: collision with root package name */
    public String f815i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f816j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public boolean f817k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f818l;

    public final void a() {
        String str = "ۖ۟ۘۘۚۦۘۘۖۢۖۘ۫ۚۖۤۙۨۚ۬ۛۥۛۙۖۤۤۛۙۛ";
        String str2 = null;
        StringBuilder sb = null;
        Iterator it = null;
        StringBuilder sb2 = null;
        TextView textView = null;
        while (true) {
            switch ((str.hashCode() ^ 329) ^ -1393905002) {
                case -2111533905:
                    str = "ۚۥ۫۟ۤۖۘۚۨۖۘ۫۬ۧۦۥۘ۫ۜۘۖۥۨۘۖۥۜۙۢ۠";
                    it = this.f816j.iterator();
                    break;
                case -1497782350:
                    this.f808b.setText(this.f815i);
                    str = "۫۠ۢ۫ۡۦۤۙۖۡۜ۠ۘۤۙۦ۟ۜۘ";
                    break;
                case -1410137287:
                    String str3 = "ۘ۬ۦۙۗۨۘۖۨۢۘۦۢۢ۠ۥۘۚۚۜۖۙۜۧۦۨ";
                    while (true) {
                        switch (str3.hashCode() ^ -2031514861) {
                            case -1944331248:
                                str3 = "۠۬ۜۙۤۜ۠۟۠ۨۛۖۥۢۘۜۚۜۛۙۖ۠ۜۡۘۥۨۥۘ";
                                break;
                            case 1037962600:
                                str = "ۙۧ۟ۙۦۗ۠ۚ۫ۗۚ۠ۧۢۜۘ";
                                continue;
                            case 1259204996:
                                if (!it.hasNext()) {
                                    str3 = "ۥۥۖۘۤۦ۬ۚۤ۟۬۟ۗۢۡۘ۠۫ۥۤۢۦ";
                                    break;
                                } else {
                                    str3 = "ۥۛۚۛۥۘۜۜۢ۠ۛ۟۠ۨۗ";
                                    break;
                                }
                            case 1534940003:
                                str = "ۡۙۜ۫ۖۗۨۨۢۖۘ۫۬ۛۡۤۛۢۛ۬ۨۘ";
                                continue;
                        }
                    }
                    break;
                case -1347656280:
                    sb.append(this.f816j.size());
                    str = "ۘۧۖۗۗۖۧ۠ۡۖۙۦۘۧۦۖۘۗۢۗۡۡ۬ۗۜۚۙ۫ۜۘ";
                    break;
                case -1242476109:
                    sb.append(": ");
                    str = "ۗۨ۬ۘ۬ۦ۬ۢۖۨ۠۫۬ۛۥۦۡۙۙۤۘۨۜۦۘۦۖۨ";
                    break;
                case -1112916137:
                    str = "۟ۤۖۘۖۨۚ۠۫ۖۘ۬ۨۥۘۘۥۡۢۢۨۦ۠ۜۙۦ۫";
                    sb = new StringBuilder();
                    break;
                case -1021743530:
                    textView.setText(sb2.toString());
                    str = "۠ۚۧۜۢۘۘۡۘۨۗۗۦۛ۫ۜۗۨۘۙۧۡۘ";
                    break;
                case -1015058759:
                    this.f810d.setText(str2);
                    str = "ۚ۠۠ۤ۬ۛ۫۠ۜۘۛۖۢ۟ۢ۟ۘۢۘ";
                    break;
                case -918136213:
                    str2 = sb.toString();
                    str = "ۙۘۢۦ۬ۦۘۡۧۖ۬ۛۛ۟ۖۦ۟ۙ۠ۚۢۜ";
                    break;
                case -883424061:
                    sb2.append(dep.getContactName(yo.stripJID((String) it.next())));
                    str = "ۜۘۛۛۦۨۢۨۤۨۦۗ۟۬ۜۘۨ۠ۚۦۖۦ";
                    break;
                case -5859985:
                    str = "ۘۗ۠ۘۗۦ۫ۥۡۘۙۢۜ۫ۨۚۚۤ۬ۡۖۦۘۧۙۚۗۢۖۘ";
                    break;
                case 93845136:
                    return;
                case 503637257:
                    sb2.append(", ");
                    str = "ۗۙۖ۫ۜۘ۟ۦۚۚۖ۫۟ۜۧ";
                    break;
                case 601794002:
                    sb.append(yo.getString("contacts"));
                    str = "۫ۤۦۘۢۤۢۨۨۛۙ۫ۢۨۗۥۘ";
                    break;
                case 1123417412:
                    str = "ۖۦۧۘۧ۠۬ۘ۬ۛۤۢۘۘۙ";
                    textView = this.f809c;
                    break;
                case 1355723460:
                    str = "ۚۥ۫۟ۤۖۘۚۨۖۘ۫۬ۧۦۥۘ۫ۜۘۖۥۨۘۖۥۜۙۢ۠";
                    break;
                case 1444204409:
                    str = "ۢۙ۟ۖۧ۫۬ۛ۠ۘ۬ۦۘۢۧۚ";
                    sb2 = new StringBuilder();
                    break;
            }
        }
    }

    public void attachBaseContext(Context context) {
        String str = "ۗ۟ۡۧۨۢۗۛۤ۠ۧۢ۫ۖۚۥۦۦۘۗ۫ۥۘ";
        Resources resources = null;
        Context context2 = null;
        Configuration configuration = null;
        while (true) {
            switch ((str.hashCode() ^ 33) ^ -2132434945) {
                case -1893371464:
                    str = "ۧۖۦ۬۟ۢ۟ۧۖۨۥۚۡۗ۟ۡ۬ۥۘ۫۠۬ۛۘۛۜۦۚ";
                    break;
                case -1642148580:
                    str = "۟ۡ۠۬ۨۤۛۢۖۘۥۦۙ۬ۨۘۜۧۥۢۢۛۨۧۘۘۘۧۥ";
                    configuration = yo.getCtx().getResources().getConfiguration();
                    break;
                case -381839068:
                    return;
                case -331900510:
                    super.attachBaseContext(context2);
                    str = "ۜ۠ۗ۬۬ۖۘ۟ۖۙۥۙ۠ۡۨۡۡۗ۫";
                    break;
                case 695438102:
                    resources = context2.getResources();
                    str = "ۧۤۜۘۤۚ۠ۧۡۙۚۢۡۘ۫ۧۦۘ";
                    break;
                case 696851141:
                    resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                    str = "۬ۡۘۘۛ۬ۦۡ۫ۗۚۥۖۘۙ۟۫ۘ۫ۚ";
                    break;
                case 772105239:
                    str = "ۘۥۦۖ۟ۢۜۢۨۘۢۦۨۧۙۧۢۡۘۘۦۡ۠ۖۚۥ";
                    break;
                case 1418061249:
                    str = "ۦۢۡۘۖۥۧۘۖۨۛۤ۬ۡۘۤۖۧۢ۫ۜۤۘۦۗۗۨ۫ۦ۬";
                    context2 = context.createConfigurationContext(configuration);
                    break;
            }
        }
    }

    public final void b() {
        String str = "ۧۖ۟۬ۘۨۛ۬ۡ۟۬ۢۖۘۜۤۘۦ۫ۖ۬۬ۧۥ";
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        while (true) {
            switch ((str.hashCode() ^ 471) ^ -1720004258) {
                case -1695545514:
                    this.f812f.setEnabled(!this.f817k);
                    str = "ۘۙ۬۬ۡ۬۫ۥۦ۟ۤۦۖ۫ۤ";
                    break;
                case -893890524:
                    f2 = 0.7f;
                    str = "۟ۧۦۨۡۜۦۘۢۛۧۥۤۖۦۘۡۨۤۨۘۨۥۙۤ";
                    break;
                case -605663286:
                    str = "ۨۢۜۥۥۥ۬ۥۢۨۛۜۘ۫ۧۢۖۛۦۘۨۨ۠ۢۥۡۘ";
                    f3 = f2;
                    break;
                case -353539070:
                    f4 = 1.0f;
                    str = "ۙۨ۬۫ۛۘۘ۠ۘ۬ۦۚۙۦۗۧ";
                    break;
                case -59660434:
                    return;
                case 234131587:
                    this.f809c.setAlpha(f3);
                    str = "ۚۜۦۘۢۙ۬ۚ۫ۘ۟ۜ۬ۙۖۘۘۜۦۗ";
                    break;
                case 242947861:
                    this.f809c.setEnabled(this.f817k);
                    str = "ۛۜۜ۫ۢۡۘ۬۬ۢۗۦۖۘۘۨۖۡۢۘۘۙۙۙۥۢۡۘ";
                    break;
                case 604696219:
                    str = "ۛۖۨۘۚۨ۟۫ۦۧۥ۠ۡ۠۬ۥۜۘۛۤۘۛ۠۫";
                    break;
                case 1087977179:
                    this.f808b.setAlpha(f3);
                    str = "ۦ۟ۢۛۙۡۘۥۖۚۗۚۢۢۙ۟ۗۛۦۘ";
                    break;
                case 1149874329:
                    String str2 = "۬ۙۖۘۦۛۜۘۡۜۨۘ۬۬ۙۚۜۘۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1024506485) {
                            case -1734385761:
                                str = "ۘۥ۟ۦۤۥۙۦۘۚۖۛۜۥۜۘۤ۫ۘۘۤۚۖ";
                                continue;
                            case -1017216589:
                                str2 = "ۢۙۜۘۥۗۥۦۘ۫۟ۗۧ۠ۘۗۖۗ";
                                break;
                            case -700913691:
                                if (!this.f817k) {
                                    str2 = "۠۠ۦۘ۠ۨۧۙۙۖۛۘۥۤۥۘۚۗ۫۫ۦۧۥۨۦۛۙۡ";
                                    break;
                                } else {
                                    str2 = "ۥۢۜۚۗۥۡۧ۠۟ۚۜۘۛۛۤۧۨ۠۟ۨۖ۫ۗۡۚۨ۟";
                                    break;
                                }
                            case 649367075:
                                str = "ۗۘۜۘۛ۠ۚۘۢۙۘۖۥۘۗۙۘۘ۟۬ۜۘۧۜۘۗۚۜۘۥۤۛ";
                                continue;
                        }
                    }
                    break;
                case 1206303461:
                    this.f811e.setEnabled(!this.f817k);
                    str = "ۙۘۥۖۡۜۨۙۢۖۧۦۤۢۥۥۦۘ";
                    break;
                case 1335025040:
                    str = "ۨۢۜۥۥۥ۬ۥۢۨۛۜۘ۫ۧۢۖۛۦۘۨۨ۠ۢۥۡۘ";
                    break;
                case 1386192689:
                    str = "ۦۘۘۜ۠ۦۛۛۡۘۢۥۥ۠ۙۡۖۚۗۖۚۗ";
                    f3 = f4;
                    break;
                case 1845523362:
                    this.f808b.setEnabled(this.f817k);
                    str = "ۥۧۥۘۥۨ۟ۤۤۧۧۘۤ۫ۧۖۡۥۧۘ";
                    break;
                case 1944793095:
                    this.f813g.setEnabled(!this.f817k);
                    str = "ۡۡۦ۟ۡۛ۬ۢۖۘۘۨۘۛۢ۟ۨ۠ۜۦۘۨۛۗۧۥۡۥ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0210, code lost:
        r0 = "۠ۙۖۗۢۙۚ۫۫ۚۘۧۘ۠ۖۤۘۡۜ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0150, code lost:
        r0 = "ۢ۠ۘۤۥۙۥۢۦۘ۟ۥ۠ۘ۬ۘۘ۟ۛۡۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r13, int r14, android.content.Intent r15) {
        /*
            r12 = this;
            r2 = 0
            java.lang.String r0 = "ۡ۫ۜۥۖۢۚۨۗۤۤۥ۬۠۟ۘۘۚ۫۠"
            r1 = r2
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
        L_0x000a:
            int r2 = r0.hashCode()
            r9 = 759(0x2f7, float:1.064E-42)
            r10 = 161274380(0x99cda0c, float:3.7760684E-33)
            r2 = r2 ^ r9
            r2 = r2 ^ r10
            switch(r2) {
                case -2030771326: goto L_0x001c;
                case -1793074536: goto L_0x0142;
                case -1752743747: goto L_0x01a9;
                case -1705654436: goto L_0x00ed;
                case -1616537380: goto L_0x018c;
                case -1531737027: goto L_0x01e4;
                case -1488005702: goto L_0x01d9;
                case -1454878648: goto L_0x0087;
                case -1398163388: goto L_0x0025;
                case -1377894611: goto L_0x0182;
                case -841740305: goto L_0x0065;
                case -736236148: goto L_0x01cf;
                case -728035959: goto L_0x0049;
                case -642444316: goto L_0x0019;
                case -398373297: goto L_0x021c;
                case -373400848: goto L_0x0022;
                case -39533108: goto L_0x01f4;
                case 59919700: goto L_0x01ae;
                case 80793471: goto L_0x00af;
                case 357004077: goto L_0x00b5;
                case 455525141: goto L_0x010b;
                case 518248659: goto L_0x01e9;
                case 659017668: goto L_0x002b;
                case 799781947: goto L_0x0092;
                case 1204603903: goto L_0x0165;
                case 1239985594: goto L_0x00c8;
                case 1388046024: goto L_0x0205;
                case 1647510784: goto L_0x00bf;
                case 1670581449: goto L_0x001f;
                case 1753835690: goto L_0x020c;
                case 2061039750: goto L_0x0124;
                case 2098404252: goto L_0x0102;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x000a
        L_0x0019:
            java.lang.String r0 = "ۘۥۡ۬ۤۥۥۢ۟ۚۢۦ۬ۛۡۘۡ۫ۖۘۚ۬ۨۖۘۛۤۦۥ"
            goto L_0x000a
        L_0x001c:
            java.lang.String r0 = "ۡ۠ۦۘۗۗۜۨ۫ۦۘۢۛۡۘ۠ۜۜۤۘۦۘۨۦۦ"
            goto L_0x000a
        L_0x001f:
            java.lang.String r0 = "ۘۡۦۧۧۥۘۧۦۧۘۜۥۘۘۗۚۨۘۢۨۚۥۤۢ"
            goto L_0x000a
        L_0x0022:
            java.lang.String r0 = "۟۠ۘۘۢۦۘۡ۫۠ۥۙ۬۬ۜۤ۫ۖ۟ۡۛۤۗۥ۫ۡۘ"
            goto L_0x000a
        L_0x0025:
            super.onActivityResult(r13, r14, r15)
            java.lang.String r0 = "ۗۦ۠ۛۧۦۚ۟ۦۘۗ۫ۨۘ۫۟ۘۘۢۥۖۘۥۨ۟"
            goto L_0x000a
        L_0x002b:
            r2 = -505218863(0xffffffffe1e2f8d1, float:-5.2336166E20)
            java.lang.String r0 = "۠ۙ۟۫ۘ۫ۡۦۧ۫ۖۧۙۛۘۘۦۙۨۡ۟ۡۥۨۧ"
        L_0x0030:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -2018953245: goto L_0x0210;
                case -1275964921: goto L_0x0043;
                case -1004688398: goto L_0x0046;
                case -668623117: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x0030
        L_0x0039:
            r0 = 324(0x144, float:4.54E-43)
            if (r13 != r0) goto L_0x0040
            java.lang.String r0 = "ۥۗۤ۬ۛۦۡۘۤۤۘۘۘ۠ۢۙۗۜۘۚۘ"
            goto L_0x0030
        L_0x0040:
            java.lang.String r0 = "ۤۦۧۘ۟۟ۜۡۖ۠۬ۨۜ۟ۡۦۘ"
            goto L_0x0030
        L_0x0043:
            java.lang.String r0 = "۬ۘۛۗ۫ۧۘۛۖۘۦۧۗ۫ۥ۟۟ۜۧۘۧۥۜۙ۟ۡ"
            goto L_0x0030
        L_0x0046:
            java.lang.String r0 = "ۤۡ۠ۡ۬ۜۘ۫ۢۤۗۛۡۘۖۡۛ"
            goto L_0x000a
        L_0x0049:
            r2 = -371800434(0xffffffffe9d6c68e, float:-3.2455972E25)
            java.lang.String r0 = "ۨ۬ۦۚۢۡۨۤۘ۠ۛۛ۠ۨۘۘۛۡ۫ۛۢۚۛ۠۠ۥۨۘ"
        L_0x004e:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -1009242459: goto L_0x005d;
                case -874071271: goto L_0x0210;
                case -852819395: goto L_0x0057;
                case 556829751: goto L_0x0062;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x004e
        L_0x0057:
            java.lang.String r0 = "ۜۡۤۖۦۙۚۛۖۙۥۗۘ۬ۦۘۡۡ۟"
            goto L_0x004e
        L_0x005a:
            java.lang.String r0 = "ۖۛۜ۠ۦۡ۬ۚۚۧۦۛ۫۬ۨۘ۟ۤ۠۫۬"
            goto L_0x004e
        L_0x005d:
            if (r15 == 0) goto L_0x005a
            java.lang.String r0 = "ۤۦۦۗۜۨۜۚۚ۫ۡۧۥۢ۠ۢ۬ۥۖۥۢ۠۬"
            goto L_0x004e
        L_0x0062:
            java.lang.String r0 = "ۧۙۡۨۖۢ۬ۚ۬۟ۜ۠ۜۜۚۧۖۚۖۜۥۘ"
            goto L_0x000a
        L_0x0065:
            r2 = -523371798(0xffffffffe0cdfaea, float:-1.1873946E20)
            java.lang.String r0 = "ۧۤۛۡۧۤۚۖۜۘۨۛۙ۟ۦۥۘۗۛۘۘ"
        L_0x006a:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -884527487: goto L_0x0210;
                case -622184260: goto L_0x0084;
                case 297040688: goto L_0x0073;
                case 1547746278: goto L_0x0079;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x006a
        L_0x0073:
            java.lang.String r0 = "ۨۗۘ۠ۡۚ۬ۨۨۘۤۥۦۘۨۡۖۘۡ۫ۖۘ"
            goto L_0x006a
        L_0x0076:
            java.lang.String r0 = "ۤۘۦ۫ۡۡ۟ۜۜۘۡۧۘۥۗۚۧۗ۠ۘۨۗۚۖۛۦ۠ۥ"
            goto L_0x006a
        L_0x0079:
            java.lang.String r0 = "jids"
            boolean r0 = r15.hasExtra(r0)
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "ۤ۫ۘۘۛۜۛۜ۠ۡۧۘۘ۟ۨۥۚۛۚۥۤ۠۠ۙۘۢۨۘ"
            goto L_0x006a
        L_0x0084:
            java.lang.String r0 = "ۦۡۥۘۜۥۡۨۤۖۦۗۦ۫ۘۡۘۗۡ"
            goto L_0x000a
        L_0x0087:
            java.lang.String r0 = "jids"
            java.util.ArrayList r2 = r15.getStringArrayListExtra(r0)
            java.lang.String r0 = "۫ۖۜۤ۫ۖۡۥۦۘۚۡۗۘۚ۬ۖۤۤۢۢۨ"
            r8 = r2
            goto L_0x000a
        L_0x0092:
            r2 = -1283844470(0xffffffffb37a168a, float:-5.822816E-8)
            java.lang.String r0 = "ۧۨۚۡۖۥۚۖۘۨۥۖۘ۠ۖۧ۠ۘۥ"
        L_0x0097:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -342543830: goto L_0x00a6;
                case 1051306253: goto L_0x00a0;
                case 1709303555: goto L_0x00ab;
                case 1744890979: goto L_0x0210;
                default: goto L_0x009f;
            }
        L_0x009f:
            goto L_0x0097
        L_0x00a0:
            java.lang.String r0 = "ۡ۫ۛ۠ۧۥۘۥ۫ۨۧۨۧۘۦۨۖۗۚۗ"
            goto L_0x0097
        L_0x00a3:
            java.lang.String r0 = "ۨۘۥۘۗۘۜۙۛ۠ۡۦۦۘۖۚ۟ۖۢۨۘ۬۫ۤۡۧۥۘۗۥۡۘ"
            goto L_0x0097
        L_0x00a6:
            if (r8 == 0) goto L_0x00a3
            java.lang.String r0 = "ۗۨۖۘۘۛ۠ۢۚۢ۟۟ۨۘۙۖ۟۠ۘ۫ۡۧ"
            goto L_0x0097
        L_0x00ab:
            java.lang.String r0 = "ۖۢۨۘ۠ۧۡۡۜۨ۟ۦۜۜۚ"
            goto L_0x000a
        L_0x00af:
            r12.f816j = r8
            java.lang.String r0 = "ۡ۠ۘۘۧ۠ۘۖۘۨۘۤۖۤ۟ۜ۬ۖۚۙۗۧ"
            goto L_0x000a
        L_0x00b5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "۬ۚۜۡ۠ۡۜۘ۬ۨۜۚۧۙ۠ۡۘ"
            r7 = r2
            goto L_0x000a
        L_0x00bf:
            java.util.Iterator r2 = r8.iterator()
            java.lang.String r0 = "ۧۦۙ۬ۨۖۘۢۚۗۨۧۡۨۦ۠۫۠ۨۘۡۖۘۘ"
            r6 = r2
            goto L_0x000a
        L_0x00c8:
            r2 = 1576707709(0x5dfaa67d, float:2.2576576E18)
            java.lang.String r0 = "۫۫ۥۨۤۜۘ۠ۜۘۡۚۖۘۜۡۖۘ۟ۜ۫"
        L_0x00cd:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -1457156605: goto L_0x00e6;
                case -850730481: goto L_0x00d6;
                case 1191615312: goto L_0x00dd;
                case 1496001960: goto L_0x00e9;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            goto L_0x00cd
        L_0x00d6:
            java.lang.String r0 = "ۖۥۥۘۖ۬۠ۖۥۨۘۨۚ۠۬ۡۧۢۡۛۦۡۖۘ۬ۢۦۡۗۦ"
            goto L_0x000a
        L_0x00da:
            java.lang.String r0 = "ۡۗ۫ۚۙ۫ۜۤۦۖۗۜۙ۬ۛۨۢۨۘۗ۬ۥۨۛۗ"
            goto L_0x00cd
        L_0x00dd:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = "ۨۘۚۤۛۦۨۙۗۚ۬ۗۚ۫ۘۘۦۤۨۤۘۧ"
            goto L_0x00cd
        L_0x00e6:
            java.lang.String r0 = "۬ۗۘۘۧۦۥۘۘۗۥۘۤۦۜۨۛۡۘ"
            goto L_0x00cd
        L_0x00e9:
            java.lang.String r0 = "ۙ۬۬ۘۦۖ۟ۦۡۙۛۡۘ۟۠ۦۤۚۢ۬۠ۦۖۘ۬ۦۗۛ"
            goto L_0x000a
        L_0x00ed:
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.obwhatsapp.yo.yo.stripJID(r0)
            java.lang.String r0 = com.obwhatsapp.yo.dep.getContactName(r0)
            r7.append(r0)
            java.lang.String r0 = "ۜۥۤۛۘۗۨۖۘۙۢۛۛۜۥۘۢ۫ۢۛۜۗ۠ۙۘ"
            goto L_0x000a
        L_0x0102:
            java.lang.String r0 = ","
            r7.append(r0)
            java.lang.String r0 = "ۚۨۧۤۤۥۘۚۘۜۘۙۤۤۥ۟ۜۚۖۜ"
            goto L_0x000a
        L_0x010b:
            android.widget.TextView r0 = r12.f809c
            java.lang.String r2 = "send_to_contact"
            r9 = 1
            java.lang.String[] r9 = new java.lang.String[r9]
            r10 = 0
            java.lang.String r11 = r7.toString()
            r9[r10] = r11
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString(r2, r9)
            r0.setText(r2)
            java.lang.String r0 = "۠ۙۖۗۢۙۚ۫۫ۚۘۧۘ۠ۖۤۘۡۜ"
            goto L_0x000a
        L_0x0124:
            r2 = -75078552(0xfffffffffb866468, float:-1.3956085E36)
            java.lang.String r0 = "ۗۢۡۖۢ۟۟ۘۙۨۤ۟۟"
        L_0x0129:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -1221291849: goto L_0x0139;
                case -1069092276: goto L_0x013f;
                case -672145301: goto L_0x0150;
                case 1478636177: goto L_0x0132;
                default: goto L_0x0131;
            }
        L_0x0131:
            goto L_0x0129
        L_0x0132:
            java.lang.String r0 = "ۧۜۧۘ۠ۖۚ۠ۖۨۙۨۗۘۚۖۜۥۙۘ۠ۛ"
            goto L_0x000a
        L_0x0136:
            java.lang.String r0 = "ۦ۟ۜۘۡۘ۬ۥۡۤۙۛۢۧۤۢۨۛۨۦ۫ۤۛۧ"
            goto L_0x0129
        L_0x0139:
            r0 = -1
            if (r14 != r0) goto L_0x0136
            java.lang.String r0 = "۬ۚۢۥۘ۟۬ۜۗۛۖۘ۬ۘۘ۟ۗۚ"
            goto L_0x0129
        L_0x013f:
            java.lang.String r0 = "ۛ۬ۥۗۥۦۘۦۡۜۘۜۢۖۘۘۗۨۘۛ۟ۧۢ۟ۗ"
            goto L_0x0129
        L_0x0142:
            r2 = 1962645133(0x74fb968d, float:1.594629E32)
            java.lang.String r0 = "ۛ۟ۦۘۙ۫ۥۜۖۥۘ۟ۘۧ۬ۥ۬"
        L_0x0147:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -597916210: goto L_0x0150;
                case -257361388: goto L_0x0161;
                case 1729089279: goto L_0x015e;
                case 1774965954: goto L_0x0157;
                default: goto L_0x014f;
            }
        L_0x014f:
            goto L_0x0147
        L_0x0150:
            java.lang.String r0 = "ۢ۠ۘۤۥۙۥۢۦۘ۟ۥ۠ۘ۬ۘۘ۟ۛۡۘ"
            goto L_0x000a
        L_0x0154:
            java.lang.String r0 = "ۙۡۨۘۡۜۥۥۦۘۛۜۡۘۧۚۙۖ۠ۨۘ"
            goto L_0x0147
        L_0x0157:
            r0 = 819(0x333, float:1.148E-42)
            if (r13 != r0) goto L_0x0154
            java.lang.String r0 = "ۡ۫ۘ۟۫۠ۖۤ۟ۧ۬ۖۘۖۙۜ۬۠ۨۦۙۢۤۦۖ"
            goto L_0x0147
        L_0x015e:
            java.lang.String r0 = "ۨۚۙۡۡ۟۬ۚۨۘۧۘۛۢۥ۫ۨۤۛۤۖۘۡ۟ۖۘۛۙ"
            goto L_0x0147
        L_0x0161:
            java.lang.String r0 = "ۥۛۨۛۙۜۘ۫ۦۢۖۢ۠ۜ۠ۨۗۜۜۜۙۘۢۙ۬۫۬۫"
            goto L_0x000a
        L_0x0165:
            r2 = -654368453(0xffffffffd8ff213b, float:-2.24414551E15)
            java.lang.String r0 = "۟ۨۨۘ۫ۖۦۤۢۜۘ۠۫ۥۘۡ۬ۢ"
        L_0x016a:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -1710995423: goto L_0x0150;
                case -1321590146: goto L_0x017e;
                case -79021458: goto L_0x0173;
                case 517816710: goto L_0x0179;
                default: goto L_0x0172;
            }
        L_0x0172:
            goto L_0x016a
        L_0x0173:
            java.lang.String r0 = "ۥۦۘۘ۠ۢۜۘۖۨۛۜۧ۟ۙۘ۫ۗ۟ۚۡ۫۟"
            goto L_0x016a
        L_0x0176:
            java.lang.String r0 = "ۛ۠۬ۜ۟ۚۨ۠ۗۦۖۙۘۤۥۨۙۜۘۤۢۘۢۛۦۦۙ۬"
            goto L_0x016a
        L_0x0179:
            if (r15 == 0) goto L_0x0176
            java.lang.String r0 = "ۜ۟ۡۘۧۥۡۚ۟ۡۘۙ۠ۦۧۛۧۖۜۧ۬ۥۢۢۖ"
            goto L_0x016a
        L_0x017e:
            java.lang.String r0 = "ۖۙۚۙ۠ۛۨۘۨۘ۟ۘۨۧۘۜۧۚۢ"
            goto L_0x000a
        L_0x0182:
            java.lang.String r0 = "android.intent.extra.STREAM"
            java.util.ArrayList r5 = r15.getParcelableArrayListExtra(r0)
            java.lang.String r0 = "ۦۧۨۘۙۥ۠ۤۦۛۧۡۥ۬ۧ۫ۗۧۡۖۖۙۙ۬ۥۜۧۡ"
            goto L_0x000a
        L_0x018c:
            r2 = -561930630(0xffffffffde819e7a, float:-4.6700184E18)
            java.lang.String r0 = "ۦۡ۫ۙۡۨ۟ۤۛۗ۠ۘۘۗۗۚ"
        L_0x0191:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -1954935679: goto L_0x01a5;
                case -1465346319: goto L_0x01a0;
                case -1312657481: goto L_0x019a;
                case 1456617247: goto L_0x0214;
                default: goto L_0x0199;
            }
        L_0x0199:
            goto L_0x0191
        L_0x019a:
            java.lang.String r0 = "ۨ۟ۡۦۡۡۘۡۤۘۘۦ۠ۖۡۦ۟ۘۖۖ"
            goto L_0x0191
        L_0x019d:
            java.lang.String r0 = "ۗ۠ۡۘۜۚ۫ۨۨۦ۫۫ۥۘۘۡ۟ۙ۫ۢۙۘۘۘ"
            goto L_0x0191
        L_0x01a0:
            if (r5 == 0) goto L_0x019d
            java.lang.String r0 = "ۛۜۜۘۖۡ۟۟ۡۨۖۨۛۢۛ۠"
            goto L_0x0191
        L_0x01a5:
            java.lang.String r0 = "ۡۘۢ۫ۛۡۘ۬ۛ۠ۘۨۗۦۘ۬ۙۗۤۤۙۧ۠ۘۜ"
            goto L_0x000a
        L_0x01a9:
            java.lang.String r0 = "ۖۤۦۛ۟ۖۘۥۨۨۘۧۡ۠ۤۢۗ۫ۙۡ"
            r4 = r5
            goto L_0x000a
        L_0x01ae:
            r2 = 1972774425(0x75962619, float:3.806725E32)
            java.lang.String r0 = "ۛۚۦۘۘۖۘۘۦۧۛۘۡۛۛۚۢۦۥۘ۫ۙ۠ۜ۬ۜۘۥۥۜۘ"
        L_0x01b3:
            int r9 = r0.hashCode()
            r9 = r9 ^ r2
            switch(r9) {
                case -1567601587: goto L_0x01cc;
                case -633135548: goto L_0x01c3;
                case 440792593: goto L_0x0218;
                case 497981678: goto L_0x01bc;
                default: goto L_0x01bb;
            }
        L_0x01bb:
            goto L_0x01b3
        L_0x01bc:
            java.lang.String r0 = "ۖۚۚۡۛۦۢۛۥۘۗۗۦۘ۬ۗۙۨ۫ۖۧ۫ۨۘ۟ۚ۟"
            goto L_0x000a
        L_0x01c0:
            java.lang.String r0 = "ۗ۟ۨۙۜۘۘ۫ۡۘۧۥۡۢۥۧۘ۫ۛ"
            goto L_0x01b3
        L_0x01c3:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x01c0
            java.lang.String r0 = "ۢ۬ۙۢ۬۬ۡۢ۬ۜۦۚ۬ۢۥۘ۫ۜۥۤۢۨۨۗۨۘۨۖۘ"
            goto L_0x01b3
        L_0x01cc:
            java.lang.String r0 = "ۘۢۤۘ۫ۗۤ۫ۛۜۘۚۡۡۥۢۚۢۘ۠ۖۛۡۧۘۢۚۥۘ"
            goto L_0x01b3
        L_0x01cf:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r0 = "۫ۗ۠ۗ۟۫ۙۥۨۗ۫ۚ۫ۢۤ۬ۨۧۘ"
            r3 = r2
            goto L_0x000a
        L_0x01d9:
            android.net.Uri r0 = r15.getData()
            r3.add(r0)
            java.lang.String r0 = "۟ۥۡۘۗۘۨۦۥۢۖ۬ۘۘۗۨۜۘۦۘۧۚۧۚۡۥ۟ۚۦۥۘ"
            goto L_0x000a
        L_0x01e4:
            java.lang.String r0 = "۬ۘ۠ۦۤۘۘ۠ۤ۫ۡۙۗ۬ۥ۟ۛۘ۟۫ۦۤۧۜۚ۠ۦ"
            r4 = r3
            goto L_0x000a
        L_0x01e9:
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.obwhatsapp.mediacomposer.MediaComposerActivity> r0 = com.obwhatsapp.mediacomposer.MediaComposerActivity.class
            r1.<init>(r12, r0)
            java.lang.String r0 = "ۧۘۡۘۥ۟ۧۖۖۤۘ۫ۖ۬ۦ۬ۧۖۨ۠۬ۘۘ"
            goto L_0x000a
        L_0x01f4:
            java.lang.String r0 = "android.intent.extra.STREAM"
            android.content.Intent r0 = r1.putParcelableArrayListExtra(r0, r4)
            java.lang.String r2 = "jids"
            java.util.ArrayList r9 = r12.f816j
            r0.putStringArrayListExtra(r2, r9)
            java.lang.String r0 = "ۙۙۥۘۢۧۖۧۢۘۘۢۥۖۧۦۘۢۚۜۘ"
            goto L_0x000a
        L_0x0205:
            r12.startActivity(r1)
            java.lang.String r0 = "ۢ۠ۘۤۥۙۥۢۦۘ۟ۥ۠ۘ۬ۘۘ۟ۛۡۘ"
            goto L_0x000a
        L_0x020c:
            java.lang.String r0 = "ۧۦۙ۬ۨۖۘۢۚۗۨۧۡۨۦ۠۫۠ۨۘۡۖۘۘ"
            goto L_0x000a
        L_0x0210:
            java.lang.String r0 = "۠ۙۖۗۢۙۚ۫۫ۚۘۧۘ۠ۖۤۘۡۜ"
            goto L_0x000a
        L_0x0214:
            java.lang.String r0 = "ۖۚۚۡۛۦۢۛۥۘۗۗۦۘ۬ۗۙۨ۫ۖۧ۫ۨۘ۟ۚ۟"
            goto L_0x000a
        L_0x0218:
            java.lang.String r0 = "۬ۘ۠ۦۤۘۘ۠ۤ۫ۡۙۗ۬ۥ۟ۛۘ۟۫ۦۤۧۜۚ۠ۦ"
            goto L_0x000a
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.massmsger.MassSender.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        String str = "ۥۗۘۘۜۙۘۖۜۘ۬ۤۢۥۡۡۘ";
        String[] strArr = null;
        StringBuilder sb = null;
        TextView textView = null;
        boolean z2 = false;
        Intent intent = null;
        TextView textView2 = null;
        Toolbar toolbar = null;
        while (true) {
            switch ((str.hashCode() ^ 679) ^ -659343213) {
                case -2081277847:
                    setContentView(yo.getID("massmsgr_add", "layout"));
                    str = "ۥۗۨۙ۟ۨ۫ۥۨۘۙ۟ۜۜ۟ۨۢۢۘۘۖۖۦۘ";
                    break;
                case -1703799205:
                    str = "ۗۛ۟ۨۤۨۜۗۤۗ۟ۗۧۦۗۛۖۨۘ";
                    break;
                case -1576948191:
                    this.f815i = intent.getStringExtra("display_name");
                    str = "ۗۗۦۗۘۢ۫۟ۥۘۜۜۘۘۥۥۧۘۛۘۘۚۡ۠ۦۜۘۡۨۖۘ";
                    break;
                case -1554358434:
                    this.f811e = (EditText) findViewById(yo.getID("edtText", "id"));
                    str = "ۢۙۢۢۤ۫ۦ۫ۨۖۘۗۤ۠ۦۘ۠ۛۖۙ۬ۥۗۚۨۘۘۙ۬";
                    break;
                case -1543571437:
                    toolbar.setTitleTextColor(ColorStore.getPrimaryTextColor());
                    str = "۠۟ۨۘۥۜۥۘۙۡۡۖۨ۬ۦ۬ۜۘۡ۠ۙۤۛۧۦ۠ۥ۟ۜ";
                    break;
                case -1451621370:
                    textView.setText(sb.toString());
                    str = "ۡ۠ۗۗۙۡۘۨۨۘۘۗۨۥۘ۟ۦ۫";
                    break;
                case -1393656501:
                    sb.append(": 0");
                    str = "ۤۡۧۘۨۢ۬ۚۚۢۡۚۙۢۚۚۛۘۤۜۡ۬ۦۘ";
                    break;
                case -1279884012:
                    this.f809c = textView2;
                    str = "۟ۢۜۘ۫۫ۖۤۖ۫ۥۙۜۘۡۨۜۥ۬ۚ";
                    break;
                case -1213051992:
                    toolbar.setTitle((CharSequence) yo.getString("group_settings_announcement_title"));
                    str = "ۜ۫ۖۘ۟ۛۖ۟ۗۙۚ۟ۡۧۜۖۗۘۧ۫ۢۘۘ۬۠ۥۘ";
                    break;
                case -749870950:
                    sb.append(yo.getString("contacts"));
                    str = "ۢۧ۠ۘۙۜ۟ۙۡۘ۟۬ۥۚۙۥ";
                    break;
                case -733983827:
                    this.f813g.setOnClickListener(new a(this, 1));
                    str = "ۥۙۘۘ۫ۥۧۘۖۢۙۧ۫ۦۨۦ";
                    break;
                case -713889054:
                    this.f816j.clear();
                    str = "ۤۤۜۘۡۜۧ۬۫ۥۘ۬ۨ۠ۥ۠ۢ۠ۤۢۧۢۗ۬ۛۖۘۙۡۛ";
                    break;
                case -671632133:
                    BaseSettingsActivity.configToolbar(toolbar, this);
                    str = "ۢۘۧۖۨۚۡۗۥۘۘ۠ۨۛ۬ۦ۟ۦۥ۟ۜ۫";
                    break;
                case -659802908:
                    textView2.setInputType(0);
                    str = "ۗۢۜۘۧۜۚۙۗ۬ۥۗۤۛۛۧ۟۟ۡۘ۠۫ۧ۫ۗۖ";
                    break;
                case -592684037:
                    str = "ۛۘۢ۬ۥ۫ۧۦۤۚۧۖۚۤۛۦ۬ۡۦ۫۟ۤۖۦۘ۬۠ۡۘ";
                    sb = new StringBuilder();
                    break;
                case -288771733:
                    this.f817k = true;
                    str = "ۡۙۚۥۦۢۖۦۦۙ۬ۗۥ۬۫ۢۦۘۧۨۦۘ";
                    break;
                case -286504829:
                    str = "۟ۦۖۘۚۢۧ۟ۖۡۘ۠ۧۗۚۘۢ۟ۖ";
                    toolbar = (Toolbar) findViewById(yo.getID("acjtoolbar", "id"));
                    break;
                case -263314126:
                    this.f808b = (TextView) findViewById(yo.getID("group_name", "id"));
                    str = "ۢۗ۬۫۟ۨۗۡ۫۫ۡۛۘ۟ۧ۠ۨۜۦۡۨۘ";
                    break;
                case -211904796:
                    str = "۟ۡۡۘۨۖۥۜۡۖۘ۠ۖۛۡۘۦ";
                    textView = this.f810d;
                    break;
                case 55220683:
                    Collections.addAll(this.f816j, strArr);
                    str = "ۢۜۢ۬ۦۢۚۛۖۘ۠ۖۛۙۤ۟ۜۜ۬";
                    break;
                case 70582613:
                    this.f818l = z2;
                    str = "ۦۖۚۖۤ۟ۧۛۘۘ۬ۘۚ۠ۙۦۜۥۘۨ۫ۜ";
                    break;
                case 78552894:
                    ((TextView) findViewById(yo.getID("save_button", "id"))).setOnClickListener(new a(this, 4));
                    str = "ۧۢۜۘۗ۠۫ۧ۫۠ۤۦۧ۟ۙۜۘ";
                    break;
                case 185177041:
                    toolbar.setNavigationOnClickListener(new a(this, 2));
                    str = "ۚۖۨ۬۬ۡۘۢۦۧۤۨۡۡۦۧۘ۫ۧ۫";
                    break;
                case 215285312:
                    this.f814h = intent.getStringExtra("full_name");
                    str = "ۜۨۛۧۢۧۗۛ۬ۡۚۦۘ۫ۨۖۘ";
                    break;
                case 733970000:
                    str = "ۤۧ۠ۧۙۡۘۢۙۙۦۜۜۘۢ۟ۛۙۗۡۜ۠ۙ";
                    intent = getIntent();
                    break;
                case 763845838:
                    strArr = intent.getStringArrayExtra("participants_jids");
                    str = "ۦۘۧۤۦۥۤۡۨۥۥۨۗۜۦ";
                    break;
                case 968376132:
                    this.f812f.setOnClickListener(new a(this, 0));
                    str = "۠ۡۖۚۗۥ۠ۢۙۗۜۙۗ۠ۖۨۡ۠۬ۛۥ۟ۜۧۗ";
                    break;
                case 982090937:
                    super.onCreate(bundle);
                    str = "ۚۨ۫۠۠ۡۤۘۡۘۛ۬۟ۚۦۧۘۛۤۥۜۢۡۘ";
                    break;
                case 1077159017:
                    this.f813g = (Button) findViewById(yo.getID("pickfiletype_gallery_holder", "id"));
                    str = "ۨۛۢۡۢۨۘۛ۫ۤۘۥ۬۠ۥۢۜۚۥۘ۬ۘۡۘ";
                    break;
                case 1198332990:
                    str = "۫ۛ۬ۧۥ۟ۥۡۙۡۚۨۘۖ۠ۖۧ۬۫۟ۦۢ";
                    textView2 = (TextView) findViewById(yo.getID("edtName", "id"));
                    break;
                case 1238141428:
                    this.f810d = (TextView) findViewById(yo.getID("participant_count", "id"));
                    str = "ۗ۠ۤ۠ۥۘۧۧۡۘۙۙۡ۟ۥۦۘ";
                    break;
                case 1238769075:
                    str = "ۛۙۛ۬ۡۡۥ۫ۜۘۢۦۨۦۦ۠";
                    break;
                case 1254244520:
                    ((TextView) findViewById(yo.getID("menuitem_edit", "id"))).setOnClickListener(new a(this, 3));
                    str = "ۛۨۜۗۨۘۘۨ۟ۡۘۜۚۦۘ۫ۢۙۢۧۦۘۜ۬ۗۡۨۘۚۥۚ";
                    break;
                case 1372747160:
                    b();
                    str = "ۤۜۜۤۢۛۤ۠ۜۜۙۜ۠۟ۢۧۧۘ۫ۚ۬";
                    break;
                case 1419309808:
                    String str2 = "۫ۥ۬ۗ۬ۛ۬ۢۨۘۨۥ۬۟ۙۗ";
                    while (true) {
                        switch (str2.hashCode() ^ -903748517) {
                            case -1303277999:
                                str = "ۤۨۙ۬ۥۖۢ۟ۥۘۤۛ۟ۛۦۤۥ۬ۨۧۡۗۢۜۘۤۤۘ";
                                continue;
                            case 303742579:
                                if (!z2) {
                                    str2 = "ۘۖۤۖۤۜۘۖ۫ۡۘۜۦ۠ۨ۟ۦۢۥۖۘ";
                                    break;
                                } else {
                                    str2 = "ۥۖۥ۫۟ۦۘۡۖ۟ۥۢۧۙۡۘۘ";
                                    break;
                                }
                            case 1441823745:
                                str = "ۥۥ۫۟ۨۘۖۘۛۥ۟ۤۖۙۜۘ";
                                continue;
                            case 1714419513:
                                str2 = "ۢۙۥ۠۫ۤ۫ۧۨۨ۫ۨۢ۬ۥۤ۠ۡۘ";
                                break;
                        }
                    }
                    break;
                case 1521875202:
                    toolbar.requestFocus();
                    str = "ۜۙۨۛ۠۠ۡ۬ۡۘۧۙۥۘۙۖۢۨۢۨ۫ۛ۬";
                    break;
                case 1543627031:
                    this.f812f = (ImageView) findViewById(yo.getID("send_btn", "id"));
                    str = "ۖۥ۟ۤ۠ۥۜۜۥۘۧ۟ۚ۟ۦ";
                    break;
                case 1547153638:
                    return;
                case 1560759062:
                    str = "ۡۧۦۘۗۡۧۜۢۗۛۡۡۧۦۥۦۤۧۙۨ";
                    z2 = getIntent().hasExtra("newEntry");
                    break;
                case 1710806174:
                    this.f809c.setOnFocusChangeListener(new f(this, 3));
                    str = "ۛ۠ۧۡۨۜ۬ۙۜۘۡۘۖۢۥ۫۠۟ۧۡۦۡۡۥۡ";
                    break;
                case 1779068334:
                    a();
                    str = "ۗۛ۟ۨۤۨۜۗۤۗ۟ۗۧۦۗۛۖۨۘ";
                    break;
                case 2072433984:
                    str = "ۚۡۚۧۨۜۧۡۢ۫ۜۢۥۘۢۚۖۡ";
                    break;
            }
        }
    }

    public void sel(View view) {
        String str = "ۨۨۖ۬۬۠ۚ۟۬ۜ۫ۘۘۙ۫۫ۙۤۙۚۖۘ۟ۚۨۘ";
        Bundle bundle = null;
        Intent intent = null;
        while (true) {
            switch ((str.hashCode() ^ 874) ^ 352939834) {
                case -1779836324:
                    bundle = new Bundle();
                    str = "۫ۡۖۜۜۡۘۜۙۦۘ۬۠ۤۛ۟ۦۘۙ۟ۦۡۗۤۥۤۗۖۢۖ";
                    break;
                case -1715503188:
                    intent.putExtra("android.intent.extra.TEXT", "OBWA, enjoy");
                    str = "ۦۤۨۧ۟ۨ۟ۘۜۘۙ۫ۡۘۥۗ۫۬ۡ۠ۢۢۚۛۤۡۙۜۡ";
                    break;
                case -1682407996:
                    intent = new Intent();
                    str = "ۧۜۧ۫ۚ۬۬۟ۖۘۖۙۥۘۤۨۜۧۧۘۙۤۜۦۨۜۚ۠۟";
                    break;
                case -1308324247:
                    str = "ۥۗۤ۟ۘۧۤۘۜۢۘۘ۬ۡۦ۟ۗۚۢۙۢ";
                    break;
                case -1224732160:
                    startActivityForResult(intent, 324);
                    str = "ۤۜۡۘ۬ۤۨ۬ۚۖۖۜ۠ۚ۟ۢۥۤ۬۠ۛ۬ۘۡۘ";
                    break;
                case -1100274220:
                    this.f809c.setError((CharSequence) null);
                    str = "ۛ۫۟۬۟ۢۨۙ۫۫ۥۗۘۥۡ۟ۢۨ";
                    break;
                case -1008894890:
                    str = "۫ۦۡۘۨۨۗۘۘۛۢۤۖ۟ۧ۠۬ۤ۫";
                    break;
                case -1003960197:
                    intent.putExtra("sch", 0);
                    str = "ۜۨۢۚۤۥۘۙۗۥۜۧۖۡۤۖۘۜۘۧۥۛۜۤ۟ۜۡ۬ۡ";
                    break;
                case -405531622:
                    intent.setType("text/plain");
                    str = "ۥ۟ۦۨۖۜۘۤ۫ۦۘۢ۫ۤ۟ۡۦۥۧۥ";
                    break;
                case -220366158:
                    intent.putExtras(bundle);
                    str = "ۜۜ۟۠ۗ۠ۖ۫ۚۚ۫ۨۘۢۢ۬";
                    break;
                case 26640161:
                    intent.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
                    str = "ۖۥۡۘۦۘۥۛۦۘۗۘۨۘ۫ۤۦۖ۫ۜۘۧۦۨۘ";
                    break;
                case 579499600:
                    bundle.putStringArrayList("selected_jids", this.f816j);
                    str = "ۜۢۘۘ۟ۢۥۧۖۡۥۜۜۘۦۤۥۙ۬ۙۚۤۨۘ";
                    break;
                case 747883665:
                    return;
                case 1992201034:
                    intent.setClassName(yo.getCtx().getPackageName(), ContactPicker.class.getName());
                    str = "ۘۦۖۘۚۛۛۜۗۖۘۨ۫ۘۘۨۥۘ۟ۨۢۢۧ۟ۛ۟ۧ";
                    break;
            }
        }
    }
}
