package com.obwhatsapp.yo.autoschedreply;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.obwhatsapp.contact.picker.ContactPicker;
import com.obwhatsapp.yo.yo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class AddMessage extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public static final int f616a = 1;

    /* renamed from: b  reason: collision with root package name */
    public SQLiteAdapter f617b;

    /* renamed from: c  reason: collision with root package name */
    public EditText f618c;

    /* renamed from: d  reason: collision with root package name */
    public EditText f619d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f620e;

    /* renamed from: f  reason: collision with root package name */
    public EditText f621f;

    /* renamed from: g  reason: collision with root package name */
    public int f622g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f623h;

    /* renamed from: i  reason: collision with root package name */
    public String f624i;
    public boolean isEdited;

    /* renamed from: j  reason: collision with root package name */
    public final l f625j = new l(this, 2);

    /* renamed from: k  reason: collision with root package name */
    public final d f626k = new d(this);

    public static boolean isValidDateAndTime(String str, String str2) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ENGLISH);
            long time = simpleDateFormat.parse(str + " " + str2).getTime();
            String str3 = "ۖ۫ۜۜۦۜۘ۬ۦۘۨۧۨۘۜۙ۫";
            while (true) {
                switch (str3.hashCode() ^ 1695461290) {
                    case -1370416943:
                        str3 = "ۡ۬ۥۘۦۜۖۤ۟ۖۦۘۢۗ۫ۘۘ";
                        break;
                    case -1082011612:
                        if (time <= currentTimeMillis) {
                            str3 = "ۙۛۨۥۜۛۜۜۥۙۗۙۨۗ۬ۢۘۙ";
                            break;
                        } else {
                            str3 = "ۡۨۦۨۤۨۢ۫ۡۘۛ۬ۜۘۜ۠ۥۘۨۙۥۘ۠۬ۧۘۖۧۘۧ۟ۨ";
                            break;
                        }
                    case -1036806847:
                        return true;
                    case 1068652432:
                        return false;
                }
            }
        } catch (Exception e2) {
            return false;
        }
    }

    public void attachBaseContext(Context context) {
        String str = "ۚۦۦۘۜۜۡۘۢۜ۠ۧۥۧۧۖ۬ۗۚ۠۫ۙ۫ۛۗۥۘ";
        Resources resources = null;
        Context context2 = null;
        Configuration configuration = null;
        while (true) {
            switch ((str.hashCode() ^ 298) ^ -644729187) {
                case -1849226054:
                    resources.updateConfiguration(configuration, resources.getDisplayMetrics());
                    str = "۬ۤۤ۟ۢۨۘۥۢ۠ۡۚۡۘۤۧۛ۫ۧ۟ۡۙ";
                    break;
                case -850778080:
                    super.attachBaseContext(context2);
                    str = "۟ۢۛۤۚۥۥۧ۬ۜ۫۬ۗۢۥۙ۬ۨۘ۫ۛۛۢ۬۠";
                    break;
                case 63099021:
                    str = "۠ۖۤ۟ۤۥۡۤۨۤ۫۬ۘۦۜ";
                    context2 = context.createConfigurationContext(configuration);
                    break;
                case 668918307:
                    str = "ۜۜ۟۬ۖۘۘۤۜۥۨۜۜۘۙۚۙۨ۟ۚ";
                    break;
                case 1009360104:
                    str = "ۢ۬ۥ۠ۧۚ۬ۡۙ۟ۨۥۢ۟ۖۚۘۘۤۥۖۡۖۡۘۗۘۜۘ";
                    break;
                case 1427957547:
                    resources = context2.getResources();
                    str = "۠۫ۨۨۛۦۘۦ۫۟۟۟ۥۘۘۜۥۘۡۧۡۦۥۦۡۦ۠";
                    break;
                case 1517494394:
                    str = "ۦۜۨۘۡۚ۟ۧۚ۫ۜۡۜۨ۠ۤۚۧۗ۫ۨۦۘۖۡ۬۫ۗۛ";
                    configuration = yo.getCtx().getResources().getConfiguration();
                    break;
                case 1837036841:
                    return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r0 = "ۙ۫ۙۢۛۧۛۡ۬ۗۘۥۘۥ۬ۥ۟ۧۡۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            r2 = 0
            java.lang.String r0 = "ۘۤۗۧۖۦۘ۫ۢۨۘۖۡۜۤۜ۠ۙۤ۫ۙۡۢۤۧۦ۫ۙۗ"
            r1 = r2
            r3 = r2
            r4 = r2
        L_0x0006:
            int r2 = r0.hashCode()
            r5 = 56
            r6 = -1744400051(0xffffffff9806914d, float:-1.7392452E-24)
            r2 = r2 ^ r5
            r2 = r2 ^ r6
            switch(r2) {
                case -1723438405: goto L_0x0086;
                case -1559837403: goto L_0x00ae;
                case -1305715709: goto L_0x0109;
                case -1287187553: goto L_0x0015;
                case -1260986302: goto L_0x0027;
                case -539107411: goto L_0x001e;
                case -517024801: goto L_0x0126;
                case -270324729: goto L_0x00c6;
                case 413288257: goto L_0x00be;
                case 598800708: goto L_0x0048;
                case 608785807: goto L_0x0122;
                case 1147567878: goto L_0x0064;
                case 1339247324: goto L_0x0100;
                case 1625348026: goto L_0x0018;
                case 1652975896: goto L_0x001b;
                case 1681795110: goto L_0x0021;
                case 1794970050: goto L_0x0091;
                case 1883082943: goto L_0x00b4;
                case 1901149930: goto L_0x00eb;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r0 = "ۚ۫ۨۘۗ۫ۡۤۥۨۜۙ۟ۙۛۦۘ۠ۘۚۨۚۦۘۡۨۡ"
            goto L_0x0006
        L_0x0018:
            java.lang.String r0 = "ۜۡۥۘ۬ۛۥۗۙۡۘۦۖۥۘۛ۫ۗ"
            goto L_0x0006
        L_0x001b:
            java.lang.String r0 = "۟ۦۢۘۤۖۘۥۨۥۘۧۢۤۖۗۘۚۧ۟ۛۙۤۦ۫ۦۘ"
            goto L_0x0006
        L_0x001e:
            java.lang.String r0 = "ۗۜ۟ۥۥۖۡۢۚۗ۫ۧۘۘۘۘۗ۠ۖۘۜۢۡۙۗۖۛ۬ۢ"
            goto L_0x0006
        L_0x0021:
            super.onActivityResult(r9, r10, r11)
            java.lang.String r0 = "ۨ۠ۧ۟ۢۨۘۗۨۥۘۥۧۜۙۥۤ۫ۨۜۘۡۘ۫"
            goto L_0x0006
        L_0x0027:
            r2 = -949824588(0xffffffffc762d3b4, float:-58067.703)
            java.lang.String r0 = "ۗ۟ۖۘ۫ۧ۬ۖۢۤ۫ۤۜ۫ۡۘ۬ۗۦۧ۫ۥۘۥۜ۟"
        L_0x002c:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1845890911: goto L_0x0042;
                case 474922355: goto L_0x003b;
                case 1514822732: goto L_0x0035;
                case 1810957332: goto L_0x0045;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x002c
        L_0x0035:
            java.lang.String r0 = "ۙ۫ۙۢۛۧۛۡ۬ۗۘۥۘۥ۬ۥ۟ۧۡۘ"
            goto L_0x0006
        L_0x0038:
            java.lang.String r0 = "ۨۚۙۢۧۖ۟۠ۡۜۧۘۘ۟ۢۗ۬ۘۘۖۡۥۘ۠ۨۗ"
            goto L_0x002c
        L_0x003b:
            r0 = 324(0x144, float:4.54E-43)
            if (r9 != r0) goto L_0x0038
            java.lang.String r0 = "ۨۨۘۤ۟ۧۤۜۘ۠ۥۚۦۛۡۘ"
            goto L_0x002c
        L_0x0042:
            java.lang.String r0 = "ۜۗۘۖۗ۫ۜ۬ۡۜ۠ۨۨۧۛۨۘۛۙۗۢ۠۫"
            goto L_0x002c
        L_0x0045:
            java.lang.String r0 = "ۜۛۦۘۦ۟ۦۘۨۦ۠ۗ۟ۧۛۙۖۘ۟۠۫"
            goto L_0x0006
        L_0x0048:
            r2 = 1615168804(0x60458524, float:5.6931287E19)
            java.lang.String r0 = "ۘۢۘۘۙۥۥۘۤۘۦۘ۬ۖۖ۟۟ۛۤۤۖ"
        L_0x004d:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1600319614: goto L_0x0035;
                case -1036798056: goto L_0x0061;
                case -531437477: goto L_0x0056;
                case 105277500: goto L_0x005c;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x004d
        L_0x0056:
            java.lang.String r0 = "ۦۧۘۘۖۗۢ۫ۢۘۢۥ۫۫ۡۙ"
            goto L_0x004d
        L_0x0059:
            java.lang.String r0 = "۫ۥۥۜۘ۫ۢۧۘۘۧ۬ۛۙۚۘۘۙ۟ۚ"
            goto L_0x004d
        L_0x005c:
            if (r11 == 0) goto L_0x0059
            java.lang.String r0 = "ۗۜۧۨۖ۠ۡۘۡۘۘ۠ۘۗۜۖ"
            goto L_0x004d
        L_0x0061:
            java.lang.String r0 = "۫ۤۛ۟۬ۚۤۡ۟ۥ۟ۗ۫ۡۥۘۦۤ۫ۢۧۨۘ"
            goto L_0x0006
        L_0x0064:
            r2 = 1047623950(0x3e71790e, float:0.23581335)
            java.lang.String r0 = "ۥ۫ۢۨۥۨۘ۬ۡ۫۟ۙۡۢۡۙۜۚۛۜ۫۟ۢۛۤۜۨۦۘ"
        L_0x0069:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case 506722110: goto L_0x0035;
                case 839234904: goto L_0x0078;
                case 1621564007: goto L_0x0072;
                case 2031226080: goto L_0x0083;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0069
        L_0x0072:
            java.lang.String r0 = "ۥۦۥۘۦۡۖۤ۫۬ۨۥۙ۫ۦۨۘۛۗ۠ۨۗۜۤ۟ۧۘۚۦۘ"
            goto L_0x0006
        L_0x0075:
            java.lang.String r0 = "ۨ۟ۤۤۤۖۘۜۘۧۤۡۛۖۦۘ۫ۜۚۛ۠ۡ۠ۦۡۘ۬ۦ۠"
            goto L_0x0069
        L_0x0078:
            java.lang.String r0 = "jids"
            boolean r0 = r11.hasExtra(r0)
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "۟ۚۡۢ۫ۧۙۤۨۘۥۦۥۘۙۦۘۢۧۤۖۥۖۘ۟۟ۚ"
            goto L_0x0069
        L_0x0083:
            java.lang.String r0 = "۟۫ۘۧۦۜۦ۠ۗۨۚۦۘۙۙۜۥۧۨۘۚ۠ۙۛۙۜ"
            goto L_0x0069
        L_0x0086:
            java.lang.String r0 = "jids"
            java.util.ArrayList r2 = r11.getStringArrayListExtra(r0)
            java.lang.String r0 = "ۛۖۙۛۗۖۘۤۙۧۢۙۢ۠ۙۥ"
            r4 = r2
            goto L_0x0006
        L_0x0091:
            r2 = 1218593616(0x48a24350, float:332314.5)
            java.lang.String r0 = "ۚۥۛۦ۫ۙۤۦۡۧۤۙۦۚ۟ۛۛۥۘۙۢۘۘ"
        L_0x0096:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -84167338: goto L_0x00a6;
                case 972950862: goto L_0x0035;
                case 1447941384: goto L_0x00ab;
                case 1961843513: goto L_0x009f;
                default: goto L_0x009e;
            }
        L_0x009e:
            goto L_0x0096
        L_0x009f:
            java.lang.String r0 = "ۙ۬ۙ۫ۘۦۘۥۡۨۘۜۜۡۘ۟ۘۡۘۧۦۧ"
            goto L_0x0006
        L_0x00a3:
            java.lang.String r0 = "ۦۛۥۘۛۤۗ۬ۤۡۚۨ۟ۤۡۥۘ"
            goto L_0x0096
        L_0x00a6:
            if (r4 == 0) goto L_0x00a3
            java.lang.String r0 = "ۡۚ۟ۚۧۜۘۥۘۗۘ۟ۘۧۗۦۘۖ"
            goto L_0x0096
        L_0x00ab:
            java.lang.String r0 = "ۗۥۜۢۧ۬ۚۘۡۡۧۡۚ۠ۛۧۡۧۘۢۢۜۧۜۖۘۜۥۖ"
            goto L_0x0096
        L_0x00ae:
            r8.f623h = r4
            java.lang.String r0 = "ۗ۬ۖ۟ۖۢۖۢۨۨۧۢۡۤ۬ۜۤۙۛ۬ۨۦۥۘۘۗۘۨ"
            goto L_0x0006
        L_0x00b4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "۫ۖۦۗۧۖۘۧۚۨۘۢۡۛۨۨۡۤۡ۟ۙ۠"
            r3 = r2
            goto L_0x0006
        L_0x00be:
            java.util.Iterator r1 = r4.iterator()
            java.lang.String r0 = "۫ۨۖۘۚۤۘ۬ۘۢ۠ۜ۠ۦۜ۫ۢۢۡۥۢۘ"
            goto L_0x0006
        L_0x00c6:
            r2 = 1405387595(0x53c4834b, float:1.68803264E12)
            java.lang.String r0 = "۠ۢۖۘ۟ۢۛۢۨۘۖۘۧۡۚۖۙۗۗ"
        L_0x00cb:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -2036222529: goto L_0x00e4;
                case -1407624728: goto L_0x00db;
                case 216464864: goto L_0x00e7;
                case 382684738: goto L_0x00d4;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            goto L_0x00cb
        L_0x00d4:
            java.lang.String r0 = "ۙۗۧۤ۫ۚۗۜۖۘۛۡ۬ۙۙۘ۠ۧ۠"
            goto L_0x0006
        L_0x00d8:
            java.lang.String r0 = "ۧۘۡۘۖۘۛ۫ۢۡۘۗۡۘۘۧۨ۫ۨ۫۬ۥ۠ۖۘ۬ۖۘ"
            goto L_0x00cb
        L_0x00db:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = "ۥ۬ۡۗ۠ۨۙۜۦۢۤۜۘۘۡۤۚ۠ۙ"
            goto L_0x00cb
        L_0x00e4:
            java.lang.String r0 = "ۥۧۙۛ۟ۗۖۤۤ۬۠ۤۦۛ"
            goto L_0x00cb
        L_0x00e7:
            java.lang.String r0 = "ۢۗۜۘۤ۫ۢۢۥۦۙۚۘ۠ۙۖ"
            goto L_0x0006
        L_0x00eb:
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.obwhatsapp.yo.yo.stripJID(r0)
            java.lang.String r0 = com.obwhatsapp.yo.dep.getContactName(r0)
            r3.append(r0)
            java.lang.String r0 = "ۙۡۗ۟ۖۡ۠ۦۙۢۢۖۨۢۡ"
            goto L_0x0006
        L_0x0100:
            java.lang.String r0 = ","
            r3.append(r0)
            java.lang.String r0 = "ۘ۫ۨۢۧۡۘۖۜۜۘۜۦۨۘۧ۟ۚ۫۟ۛۧۙۗۘۢۤۡ"
            goto L_0x0006
        L_0x0109:
            android.widget.TextView r0 = r8.f620e
            java.lang.String r2 = "send_to_contact"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = 0
            java.lang.String r7 = r3.toString()
            r5[r6] = r7
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString(r2, r5)
            r0.setText(r2)
            java.lang.String r0 = "ۙ۫ۙۢۛۧۛۡ۬ۗۘۥۘۥ۬ۥ۟ۧۡۘ"
            goto L_0x0006
        L_0x0122:
            java.lang.String r0 = "۫ۨۖۘۚۤۘ۬ۘۢ۠ۜ۠ۦۜ۫ۢۢۡۥۢۘ"
            goto L_0x0006
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.autoschedreply.AddMessage.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0472, code lost:
        r3 = "ۗ۠ۗۖ۠ۨۘۘ۠ۙۜ۠۬ۙ۬ۖۦۘ۠";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d4, code lost:
        r3 = "۬۫ۛۨۤۗۚ۬۫ۙ۟ۧۤۛۡۘۧۨۜۗۨۧۘۡۦۚ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r16 = 0
            r15 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            r8 = 0
            r6 = 0
            r7 = 0
            r5 = 0
            r9 = 0
            r4 = 0
            java.lang.String r2 = "ۗ۠ۜۘۦۙۖ۠ۢۦۤۦۤ۫۬ۙۢۦۡۘ۫۬"
            r3 = r2
        L_0x0011:
            int r2 = r3.hashCode()
            r17 = 229(0xe5, float:3.21E-43)
            r18 = -1080472330(0xffffffffbf994cf6, float:-1.1976612)
            r2 = r2 ^ r17
            r2 = r2 ^ r18
            switch(r2) {
                case -2056122219: goto L_0x0286;
                case -2027429685: goto L_0x0274;
                case -1993069932: goto L_0x0240;
                case -1876553401: goto L_0x0124;
                case -1847075364: goto L_0x013d;
                case -1816493150: goto L_0x047c;
                case -1780141426: goto L_0x002a;
                case -1637159293: goto L_0x01fd;
                case -1531978344: goto L_0x0097;
                case -1494979777: goto L_0x008f;
                case -1396830811: goto L_0x010b;
                case -1290209179: goto L_0x030a;
                case -1269434986: goto L_0x03a3;
                case -1186503368: goto L_0x0481;
                case -1067375636: goto L_0x034f;
                case -1004003801: goto L_0x037c;
                case -903084674: goto L_0x0156;
                case -894073492: goto L_0x0468;
                case -869219682: goto L_0x00f9;
                case -850207788: goto L_0x0420;
                case -845430303: goto L_0x03b9;
                case -491179222: goto L_0x03d3;
                case -407160690: goto L_0x0214;
                case -394851527: goto L_0x0382;
                case -387172583: goto L_0x03c6;
                case -320804409: goto L_0x0237;
                case -131209475: goto L_0x03ad;
                case -124579650: goto L_0x0291;
                case -76445354: goto L_0x0445;
                case -16091771: goto L_0x02f5;
                case 15075615: goto L_0x03c0;
                case 34563147: goto L_0x0022;
                case 338809393: goto L_0x045e;
                case 427855755: goto L_0x01e6;
                case 437927678: goto L_0x00ef;
                case 449455600: goto L_0x0031;
                case 470779283: goto L_0x00a6;
                case 531178805: goto L_0x0401;
                case 547127924: goto L_0x0304;
                case 564481601: goto L_0x019f;
                case 567197992: goto L_0x0192;
                case 643165183: goto L_0x00c5;
                case 765987772: goto L_0x039b;
                case 933482344: goto L_0x0057;
                case 1050138521: goto L_0x016f;
                case 1074532726: goto L_0x0073;
                case 1155263535: goto L_0x032d;
                case 1183928637: goto L_0x02d7;
                case 1209165450: goto L_0x0250;
                case 1278244151: goto L_0x0062;
                case 1439709172: goto L_0x0481;
                case 1572798606: goto L_0x0082;
                case 1616999240: goto L_0x01c3;
                case 1678983391: goto L_0x0262;
                case 1736746641: goto L_0x0042;
                case 1738104525: goto L_0x03dc;
                case 1907043328: goto L_0x02fe;
                case 1951112825: goto L_0x01ac;
                case 1961290798: goto L_0x0026;
                case 1974707197: goto L_0x02b0;
                case 2001822192: goto L_0x0395;
                case 2103616475: goto L_0x02e1;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0011
        L_0x0022:
            java.lang.String r2 = "ۖۙۡۘۙۖۧۘۢۧۚ۠ۦۘۥۨۥۘ۫ۛۘۘۢۢۦۘ"
            r3 = r2
            goto L_0x0011
        L_0x0026:
            java.lang.String r2 = "۠۬ۚۘۤۧۜ۟۠ۙۛ۬ۙۥۡۤۗۗۜ۠ۨۘ"
            r3 = r2
            goto L_0x0011
        L_0x002a:
            super.onCreate(r20)
            java.lang.String r2 = "ۚ۫ۘۘۡۧۥۘۤۜۨۤۚۧۚۨ۫ۖۢۡ"
            r3 = r2
            goto L_0x0011
        L_0x0031:
            java.lang.String r2 = "autoscheduler_add"
            java.lang.String r3 = "layout"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r19
            r0.setContentView(r2)
            java.lang.String r2 = "ۛۜ۫ۖۥۙ۬ۧۥۜۗۨۥۖۘ۬۠ۨۘۗۘ۫۬ۙ۫ۢۜۘ"
            r3 = r2
            goto L_0x0011
        L_0x0042:
            java.lang.String r2 = "acjtoolbar"
            java.lang.String r3 = "id"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r19
            android.view.View r2 = r0.findViewById(r2)
            androidx.appcompat.widget.Toolbar r2 = (androidx.appcompat.widget.Toolbar) r2
            java.lang.String r3 = "ۥۗۖۘۚۡ۠ۙۧۡۜۢۥۘۥۨۥ"
            r16 = r2
            goto L_0x0011
        L_0x0057:
            r0 = r16
            r1 = r19
            com.obwhatsapp.youbasha.ui.YoSettings.BaseSettingsActivity.configToolbar(r0, r1)
            java.lang.String r2 = "ۡۗۛۚۙۦۘ۫ۙۘۗۜۧۨۖۦۗۤۙ۫ۛۦۘ"
            r3 = r2
            goto L_0x0011
        L_0x0062:
            com.obwhatsapp.yo.autoschedreply.e r2 = new com.obwhatsapp.yo.autoschedreply.e
            r3 = 0
            r0 = r19
            r2.<init>(r0, r3)
            r0 = r16
            r0.setNavigationOnClickListener(r2)
            java.lang.String r2 = "۟ۘۥۘۨۨۗۗۧۚۙ۫ۥۗۙ۬ۗۛ۟ۗۘ۫"
            r3 = r2
            goto L_0x0011
        L_0x0073:
            java.lang.String r2 = "msg_scheduler_title"
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((java.lang.String) r2)
            r0 = r16
            r0.setTitle((java.lang.CharSequence) r2)
            java.lang.String r2 = "۟۠۬ۛۗۗ۬ۤۖۜۨۜۘۥۙۥۘ"
            r3 = r2
            goto L_0x0011
        L_0x0082:
            int r2 = com.obwhatsapp.yo.ColorStore.getPrimaryTextColor()
            r0 = r16
            r0.setTitleTextColor((int) r2)
            java.lang.String r2 = "ۚۙۦ۟ۧۙۢۥۨ۠ۦۜۜۦ۫ۛۘۧۘ۠ۜۜ"
            r3 = r2
            goto L_0x0011
        L_0x008f:
            r16.requestFocus()
            java.lang.String r2 = "ۥۡۦ۫ۥۦۘۢۨ۬ۦۙۥۘۙۤ۬"
            r3 = r2
            goto L_0x0011
        L_0x0097:
            android.content.Intent r2 = r19.getIntent()
            java.lang.String r3 = "edit"
            java.lang.String r15 = r2.getStringExtra(r3)
            java.lang.String r2 = "ۖ۟۟ۤ۫ۘۘ۠۬۟ۧۨۧۘۥۧۥۡۚ۟۬ۙ۫ۙۦ"
            r3 = r2
            goto L_0x0011
        L_0x00a6:
            r3 = -798892383(0xffffffffd061dea1, float:-1.51578552E10)
            java.lang.String r2 = "ۢۖۜۘۘۘ۬ۤۛۘ۠ۢۜۘۜ۟ۘۤۢۨ"
        L_0x00ab:
            int r17 = r2.hashCode()
            r17 = r17 ^ r3
            switch(r17) {
                case -1555308829: goto L_0x00d4;
                case -1517279360: goto L_0x00b5;
                case 1141401529: goto L_0x00bd;
                case 1209868255: goto L_0x00c2;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            goto L_0x00ab
        L_0x00b5:
            java.lang.String r2 = "۠ۤۡۘۜۘۗۦۥۧۢۡۦۚۥۛۖ۟ۦۘ"
            r3 = r2
            goto L_0x0011
        L_0x00ba:
            java.lang.String r2 = "ۥۘۦۘۚۗۢۧۦۦۘ۬۠۠ۗۧۡۙۛۘۜۗۖ۫ۦۘ"
            goto L_0x00ab
        L_0x00bd:
            if (r15 == 0) goto L_0x00ba
            java.lang.String r2 = "۠ۤ۠ۛۦۥۢۢ۬ۢۙۚ۫ۤۜۘۢۥ۫ۙۙ"
            goto L_0x00ab
        L_0x00c2:
            java.lang.String r2 = "ۚۛۥۚ۠ۥۡ۫ۖۤۗۧۧۚۧۘۨ"
            goto L_0x00ab
        L_0x00c5:
            r3 = -1928285537(0xffffffff8d10b29f, float:-4.4588433E-31)
            java.lang.String r2 = "۠ۘۧۧ۠۫ۙۦۘۡۢۦۘۢ۠ۤۚۤۡ۟ۖۜۘۗ۫ۨۘ"
        L_0x00ca:
            int r17 = r2.hashCode()
            r17 = r17 ^ r3
            switch(r17) {
                case -322367329: goto L_0x00ea;
                case 530947868: goto L_0x00dc;
                case 958318909: goto L_0x00d4;
                case 1184076253: goto L_0x00e7;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            goto L_0x00ca
        L_0x00d4:
            java.lang.String r2 = "۬۫ۛۨۤۗۚ۬۫ۙ۟ۧۤۛۡۘۧۨۜۗۨۧۘۡۦۚ"
            r3 = r2
            goto L_0x0011
        L_0x00d9:
            java.lang.String r2 = "ۛ۠ۢۜۚۛۙۡۖۘۦۧۖۘۧۤۖۘ۠ۤۦۘ"
            goto L_0x00ca
        L_0x00dc:
            java.lang.String r2 = "yes"
            boolean r2 = r15.equals(r2)
            if (r2 == 0) goto L_0x00d9
            java.lang.String r2 = "ۗۦۧۘۡۙۦۧۡۤۦۗۡۘۧ۠۠ۦۖ۬ۘۘۛ"
            goto L_0x00ca
        L_0x00e7:
            java.lang.String r2 = "ۛۛۚۗۘۥۘۧۗۘۙۢۖۡۙ۫"
            goto L_0x00ca
        L_0x00ea:
            java.lang.String r2 = "ۙ۬ۜۘ۠ۖۢ۠ۥۛۢۘۡ۟ۗۗ"
            r3 = r2
            goto L_0x0011
        L_0x00ef:
            r2 = 1
            r0 = r19
            r0.isEdited = r2
            java.lang.String r2 = "۬۫ۛۨۤۗۚ۬۫ۙ۟ۧۤۛۡۘۧۨۜۗۨۧۘۡۦۚ"
            r3 = r2
            goto L_0x0011
        L_0x00f9:
            com.obwhatsapp.yo.autoschedreply.SQLiteAdapter r2 = new com.obwhatsapp.yo.autoschedreply.SQLiteAdapter
            android.content.Context r3 = r19.getApplicationContext()
            r2.<init>(r3)
            r0 = r19
            r0.f617b = r2
            java.lang.String r2 = "ۗۥۘۤۛ۟۫ۙۨۘ۟۬ۡۘ۫ۗۖۘۙۖۡ"
            r3 = r2
            goto L_0x0011
        L_0x010b:
            java.lang.String r2 = "startDate"
            java.lang.String r3 = "id"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r19
            android.view.View r2 = r0.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r0 = r19
            r0.f618c = r2
            java.lang.String r2 = "ۧۙۗ۬ۛۡۘۛۤۤ۟ۧۛ۫ۜ"
            r3 = r2
            goto L_0x0011
        L_0x0124:
            java.lang.String r2 = "btnTime"
            java.lang.String r3 = "id"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r19
            android.view.View r2 = r0.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r0 = r19
            r0.f619d = r2
            java.lang.String r2 = "ۦۡۙ۟ۤۛۨۢۨ۫ۛۧ۟ۨ۟ۥۛۘۘۦۖۦۘۗۦ۫"
            r3 = r2
            goto L_0x0011
        L_0x013d:
            java.lang.String r2 = "edtName"
            java.lang.String r3 = "id"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r19
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0 = r19
            r0.f620e = r2
            java.lang.String r2 = "۟۫ۢۜۨۡ۫ۤۨ۠ۜۘۘۤۥۥۘۜۘۡۘۨۤۜ"
            r3 = r2
            goto L_0x0011
        L_0x0156:
            java.lang.String r2 = "edtText"
            java.lang.String r3 = "id"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r19
            android.view.View r2 = r0.findViewById(r2)
            android.widget.EditText r2 = (android.widget.EditText) r2
            r0 = r19
            r0.f621f = r2
            java.lang.String r2 = "ۨۖۨۘ۠ۙۘۘۙۙۦۗۤۛۦۥۚۘۢۨۘۡۗۖ"
            r3 = r2
            goto L_0x0011
        L_0x016f:
            java.lang.String r2 = "add_autoscheduler"
            java.lang.String r3 = "id"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            r0 = r19
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.obwhatsapp.yo.autoschedreply.e r3 = new com.obwhatsapp.yo.autoschedreply.e
            r17 = 1
            r0 = r19
            r1 = r17
            r3.<init>(r0, r1)
            r2.setOnClickListener(r3)
            java.lang.String r2 = "ۨۜ۟ۚۡۛۤۚ۬۬ۨۘۘ۬ۨۢۖۚۚۚۤۨۘۧ۠۫ۗۨ۫"
            r3 = r2
            goto L_0x0011
        L_0x0192:
            r0 = r19
            android.widget.EditText r2 = r0.f618c
            r3 = 0
            r2.setInputType(r3)
            java.lang.String r2 = "ۢ۫۫ۘۧۚۛۖۘۘۧۥۘۢۗ۬ۜ۟ۖ۫ۨۧۧۦۜ۠ۛۦۘ"
            r3 = r2
            goto L_0x0011
        L_0x019f:
            r0 = r19
            android.widget.TextView r2 = r0.f620e
            r3 = 0
            r2.setInputType(r3)
            java.lang.String r2 = "ۡۡۧ۟ۥۙۥۥۥۚۨۤۛۜۧۘ۫۟ۧۗۥۜ"
            r3 = r2
            goto L_0x0011
        L_0x01ac:
            r0 = r19
            android.widget.EditText r2 = r0.f618c
            com.obwhatsapp.yo.autoschedreply.f r3 = new com.obwhatsapp.yo.autoschedreply.f
            r17 = 0
            r0 = r19
            r1 = r17
            r3.<init>(r0, r1)
            r2.setOnFocusChangeListener(r3)
            java.lang.String r2 = "ۛ۟ۨۖۤۧۡ۠ۗۙۡۤۗۥۗۦۨۨۡۙۤۗۜ"
            r3 = r2
            goto L_0x0011
        L_0x01c3:
            r3 = 384346786(0x16e8aaa2, float:3.7589306E-25)
            java.lang.String r2 = "ۙۙۖۘۖ۠ۨۘ۟ۤۥۦۨۘۛۤۘ"
        L_0x01c8:
            int r17 = r2.hashCode()
            r17 = r17 ^ r3
            switch(r17) {
                case -67941921: goto L_0x01d8;
                case 516238814: goto L_0x01e1;
                case 735273193: goto L_0x01d2;
                case 1805411701: goto L_0x0459;
                default: goto L_0x01d1;
            }
        L_0x01d1:
            goto L_0x01c8
        L_0x01d2:
            java.lang.String r2 = "۟ۨۨۘۤۜۥۚۧ۟ۜ۠ۦۢ۟ۦۘۨۢۥۘۙۖۙ"
            goto L_0x01c8
        L_0x01d5:
            java.lang.String r2 = "ۗۨۢۧۗۘۜۚۘۘۛ۫۟۠ۙۖۘۛۡۜۘ"
            goto L_0x01c8
        L_0x01d8:
            r0 = r19
            boolean r2 = r0.isEdited
            if (r2 != 0) goto L_0x01d5
            java.lang.String r2 = "۬ۢۙ۠ۤۙۧۙۙۥۙ۬ۤۜۙۛۙۨۗ"
            goto L_0x01c8
        L_0x01e1:
            java.lang.String r2 = "ۙۜۡۘۙۖۘۜۡۤۨۗۤۜۤۗ"
            r3 = r2
            goto L_0x0011
        L_0x01e6:
            r0 = r19
            android.widget.TextView r2 = r0.f620e
            com.obwhatsapp.yo.autoschedreply.f r3 = new com.obwhatsapp.yo.autoschedreply.f
            r17 = 1
            r0 = r19
            r1 = r17
            r3.<init>(r0, r1)
            r2.setOnFocusChangeListener(r3)
            java.lang.String r2 = "۬ۚۖۘۦۘ۫ۘۡۨۦۖۗۨۦۖۦۦۗ"
            r3 = r2
            goto L_0x0011
        L_0x01fd:
            r0 = r19
            android.widget.EditText r2 = r0.f619d
            com.obwhatsapp.yo.autoschedreply.f r3 = new com.obwhatsapp.yo.autoschedreply.f
            r17 = 2
            r0 = r19
            r1 = r17
            r3.<init>(r0, r1)
            r2.setOnFocusChangeListener(r3)
            java.lang.String r2 = "۫ۡ۟ۜۢۖۘۢ۬ۘۘۚۤ۬ۘۚۦ"
            r3 = r2
            goto L_0x0011
        L_0x0214:
            r3 = 1060283090(0x3f32a2d2, float:0.69779694)
            java.lang.String r2 = "ۡۧۜۘ۬ۤۜ۬ۢ۬ۜۜۖۘۥۚۙۥۖۧۤۘ۠ۧ۫ۡۘ۟ۦۘۘ"
        L_0x0219:
            int r17 = r2.hashCode()
            r17 = r17 ^ r3
            switch(r17) {
                case -1445260844: goto L_0x0232;
                case -324198367: goto L_0x047c;
                case -105686508: goto L_0x0223;
                case 1867053087: goto L_0x022f;
                default: goto L_0x0222;
            }
        L_0x0222:
            goto L_0x0219
        L_0x0223:
            r0 = r19
            boolean r2 = r0.isEdited
            if (r2 == 0) goto L_0x022c
            java.lang.String r2 = "ۜۤۨۦۦۗۘ۠ۦۤۗۧ۬ۙۖۢۚ۟ۥۨۛ"
            goto L_0x0219
        L_0x022c:
            java.lang.String r2 = "ۡ۬ۧۦۡۥۘۘۙۦۧۛۦۘ۟ۚۘۘۦۡ۟۟ۖۖۘ۟ۡۨۘ"
            goto L_0x0219
        L_0x022f:
            java.lang.String r2 = "ۦۢۧۘۜۘ۠ۚۘۘۧ۠ۛۥۥۘۘۚۜۜۘۤۘۢۧۨۘ"
            goto L_0x0219
        L_0x0232:
            java.lang.String r2 = "ۗۜۗۘۚۨۘ۫۟ۡۘۤۚۡۘۛۨۖۤ۫ۘۘ"
            r3 = r2
            goto L_0x0011
        L_0x0237:
            android.content.Intent r14 = r19.getIntent()
            java.lang.String r2 = "ۥ۫ۖۘ۬ۚۘۥۘ۟ۙ۬ۜۘۛۘۧۘ"
            r3 = r2
            goto L_0x0011
        L_0x0240:
            java.lang.String r2 = "_id"
            r3 = 0
            int r2 = r14.getIntExtra(r2, r3)
            r0 = r19
            r0.f622g = r2
            java.lang.String r2 = "ۚۙۜ۠ۚۖۤ۟۬۬ۖۨ۫۬ۦۘۗۚۛ"
            r3 = r2
            goto L_0x0011
        L_0x0250:
            r0 = r19
            android.widget.EditText r2 = r0.f618c
            java.lang.String r3 = "startDate"
            java.lang.String r3 = r14.getStringExtra(r3)
            r2.setText(r3)
            java.lang.String r2 = "ۤ۬ۤ۫ۥۦۘۥ۬ۥۨۡۚۖۛۜ"
            r3 = r2
            goto L_0x0011
        L_0x0262:
            r0 = r19
            android.widget.EditText r2 = r0.f619d
            java.lang.String r3 = "btnTime"
            java.lang.String r3 = r14.getStringExtra(r3)
            r2.setText(r3)
            java.lang.String r2 = "۬۠۠ۘۜۥۙۦۨۘۚۤۘۘۡ۫ۚۘۧۘۥۨۘۡۗ۟۟ۛۥۘ"
            r3 = r2
            goto L_0x0011
        L_0x0274:
            r0 = r19
            android.widget.EditText r2 = r0.f621f
            java.lang.String r3 = "text_message"
            java.lang.String r3 = r14.getStringExtra(r3)
            r2.setText(r3)
            java.lang.String r2 = "۫ۥۚۙۗۖ۬ۡۨۘۚۘۦۘۛ۫ۦۧۗۧ۠ۜ۟۬ۜۨ۠ۙۢ"
            r3 = r2
            goto L_0x0011
        L_0x0286:
            java.lang.String r2 = "edtName"
            java.lang.String r13 = r14.getStringExtra(r2)
            java.lang.String r2 = "ۛۘۢۥ۫ۙۗ۟۠ۨۘۘۨ۠ۦۘۖۛۘۘۗۘۛ"
            r3 = r2
            goto L_0x0011
        L_0x0291:
            r3 = -1749500320(0xffffffff97b8be60, float:-1.1938779E-24)
            java.lang.String r2 = "۫۬ۖۙۖۙۙ۟ۘۥۧۥۢۜۖۤ۫"
        L_0x0296:
            int r17 = r2.hashCode()
            r17 = r17 ^ r3
            switch(r17) {
                case -1422442770: goto L_0x02a0;
                case -166911408: goto L_0x0472;
                case 788362059: goto L_0x02a6;
                case 1147832582: goto L_0x02ab;
                default: goto L_0x029f;
            }
        L_0x029f:
            goto L_0x0296
        L_0x02a0:
            java.lang.String r2 = "۠ۚۨۘ۟ۡۨۘۘۛۛۤۜۘۘۗ۠ۗ۠۫ۡۥۤۦۘۥۥۥۘۚ۠"
            goto L_0x0296
        L_0x02a3:
            java.lang.String r2 = "ۘۨۥۘۥۦۦۘۨۤۧۡ۠ۡۢۥۦۢ۫ۤۚۛۨۘۗ۟ۦۘ"
            goto L_0x0296
        L_0x02a6:
            if (r13 == 0) goto L_0x02a3
            java.lang.String r2 = "۟ۛۗۗۦۢۛۦۦۡۤۖۘۧ۬ۛ"
            goto L_0x0296
        L_0x02ab:
            java.lang.String r2 = "ۛ۟ۚۥ۫۟ۤ۫ۨۛۙ۟۫ۢۢ۟ۨۡۘۢۖ۬ۤۢۥ۟ۖ"
            r3 = r2
            goto L_0x0011
        L_0x02b0:
            r3 = -2132420301(0xffffffff80e5d933, float:-2.1108245E-38)
            java.lang.String r2 = "ۤۧ۠ۤۢ۟ۙۘۢۨۧ۠ۥۡۙۗۚ۟ۘۚۜۘ"
        L_0x02b5:
            int r17 = r2.hashCode()
            r17 = r17 ^ r3
            switch(r17) {
                case -1468287371: goto L_0x02bf;
                case -947322164: goto L_0x02c5;
                case 842181019: goto L_0x02d2;
                case 968345387: goto L_0x0472;
                default: goto L_0x02be;
            }
        L_0x02be:
            goto L_0x02b5
        L_0x02bf:
            java.lang.String r2 = "۫ۦۡۦۜۙۘۗۖۨۦۤۥۡ"
            goto L_0x02b5
        L_0x02c2:
            java.lang.String r2 = "ۤ۟ۗۢۚۤ۬ۙۧۤۦۘۘۥۚۡۘ"
            goto L_0x02b5
        L_0x02c5:
            int r2 = r13.length()
            r17 = 38
            r0 = r17
            if (r2 <= r0) goto L_0x02c2
            java.lang.String r2 = "ۡۛۗۛۤۖۘۗۥۥۚۦۧۘ۟ۥۘۘۙۖۜۡۦۘ۬۬۬"
            goto L_0x02b5
        L_0x02d2:
            java.lang.String r2 = "ۘ۬ۜۤۜۧۘ۟ۦۡۘۨۦۘۗۖۖۥۘۘۘۜۨ۬ۚۗۖۛ۠۫"
            r3 = r2
            goto L_0x0011
        L_0x02d7:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "ۚۦۚۙۙۥۘۥۨۘۡۨۖۘ۟ۜۛ۠ۤۢ۫ۥۧۘ"
            r3 = r2
            goto L_0x0011
        L_0x02e1:
            java.util.ArrayList r11 = new java.util.ArrayList
            java.lang.String r2 = ","
            java.lang.String[] r2 = r13.split(r2)
            java.util.List r2 = java.util.Arrays.asList(r2)
            r11.<init>(r2)
            java.lang.String r2 = "۫ۧۥۙۗۙۢۧۖۨ۬ۛۢ۠۬"
            r3 = r2
            goto L_0x0011
        L_0x02f5:
            r0 = r19
            r0.f623h = r11
            java.lang.String r2 = "۠ۥ۟ۨۙۙۘۜ۫۟ۛ۬ۜۜۜۘ"
            r3 = r2
            goto L_0x0011
        L_0x02fe:
            r10 = 0
            java.lang.String r2 = "ۜ۬ۦۘۗۙۨ۫ۘۘۘۚ۬ۖۧۢۛۚۖۤۢ"
            r3 = r2
            goto L_0x0011
        L_0x0304:
            java.lang.String r2 = "ۦۘۖۦۚۙۢۥۢۢۡۛۜ۬ۤ"
            r3 = r2
            r9 = r10
            goto L_0x0011
        L_0x030a:
            r3 = 1615811691(0x604f546b, float:5.9758734E19)
            java.lang.String r2 = "۟ۨۨۘۢۦ۬ۘۢۜۘۛۦۡۘۢ۫ۤ۠ۤۘ۫ۘۙ۠ۡۛ"
        L_0x030f:
            int r17 = r2.hashCode()
            r17 = r17 ^ r3
            switch(r17) {
                case 237994012: goto L_0x0328;
                case 1023425124: goto L_0x0325;
                case 1204907285: goto L_0x0319;
                case 1383458369: goto L_0x046d;
                default: goto L_0x0318;
            }
        L_0x0318:
            goto L_0x030f
        L_0x0319:
            int r2 = r11.size()
            if (r9 >= r2) goto L_0x0322
            java.lang.String r2 = "۟ۛۛ۬ۥۨ۠ۢۤۜۖۘۡۦۨۘۡۖۥ"
            goto L_0x030f
        L_0x0322:
            java.lang.String r2 = "ۗۙۥۘ۫ۨۜۢۚۨۘۦۛ۫ۛۛۡۢۜۜۜۢۦۘ۬۬۠ۙ۫۟"
            goto L_0x030f
        L_0x0325:
            java.lang.String r2 = "ۥۧۛۢ۠ۡۘۜۥۡۘۡۘ۬ۧۤۥۘ"
            goto L_0x030f
        L_0x0328:
            java.lang.String r2 = "ۛۜ۫ۙۡۗۙۗۨۘۖۗۨۘۡۘۗۘۚۚ"
            r3 = r2
            goto L_0x0011
        L_0x032d:
            java.lang.Object r2 = r11.get(r9)
            java.lang.String r2 = (java.lang.String) r2
            r8 = 0
            java.lang.Object r3 = r11.get(r9)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r17 = "@"
            r0 = r17
            int r3 = r3.lastIndexOf(r0)
            java.lang.String r2 = r2.substring(r8, r3)
            java.lang.String r8 = com.obwhatsapp.yo.dep.getContactName(r2)
            java.lang.String r2 = "۫ۚۡۘ۟ۛۙۖۧ۠ۡۨۖۦۗۗۡۢۨۘۨۤۛ"
            r3 = r2
            goto L_0x0011
        L_0x034f:
            r3 = 733093367(0x2bb21df7, float:1.2655978E-12)
            java.lang.String r2 = "ۤۡۘۛۚۤۗۥۦ۬ۙ۟ۗۡۘۘ۟ۡۦ"
        L_0x0354:
            int r17 = r2.hashCode()
            r17 = r17 ^ r3
            switch(r17) {
                case -1237535818: goto L_0x035e;
                case -981245730: goto L_0x0379;
                case 1007550026: goto L_0x0463;
                case 1666604353: goto L_0x0366;
                default: goto L_0x035d;
            }
        L_0x035d:
            goto L_0x0354
        L_0x035e:
            java.lang.String r2 = "ۘۢۨۘۜ۬ۥۤ۬۠۠ۥۖۘۛۢۦۨ۬ۛۗۙۥۘۨۢۜۦۜۛ"
            r3 = r2
            goto L_0x0011
        L_0x0363:
            java.lang.String r2 = "ۡ۫ۖ۟ۤۦۘۛۘۨۘۥۜۢ۟ۘۦۘۡۦۦۘ"
            goto L_0x0354
        L_0x0366:
            java.lang.Object r2 = r11.get(r9)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r17 = "@s.whatsapp.net"
            r0 = r17
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L_0x0363
            java.lang.String r2 = "ۙۨۧۘۙ۬ۡ۟۫ۥۘ۫ۧۘۗۘ۠ۛۚۘ"
            goto L_0x0354
        L_0x0379:
            java.lang.String r2 = "ۚۜۛ۬ۜۥۘۥۢۜ۟۫ۨۘ۟۠ۜۘۛۚۦۘۜۢۨۘ۠۠ۤ"
            goto L_0x0354
        L_0x037c:
            java.lang.String r2 = "۠۟ۖۢۨ۠ۚۤۚۖۚۦۘۜۗۦۦ۟ۡۗ۠۠ۙۡ"
            r3 = r2
            r7 = r8
            goto L_0x0011
        L_0x0382:
            java.lang.Object r2 = r11.get(r9)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.obwhatsapp.yo.yo.stripJID(r2)
            java.lang.String r6 = com.obwhatsapp.yo.dep.getContactName(r2)
            java.lang.String r2 = "ۗۗۜۘۙۢ۟ۢۖۡۜۖۘۜۜۧۧۨۨۘۖۢۦۙۙ۠ۡۚۡۘ"
            r3 = r2
            goto L_0x0011
        L_0x0395:
            java.lang.String r2 = "۠ۖۨۘۥ۠۫۬ۘۘ۠ۚۖۡۥۧۘ"
            r3 = r2
            r7 = r6
            goto L_0x0011
        L_0x039b:
            r12.append(r7)
            java.lang.String r2 = "ۖۚۜۢۘۦ۫ۗۗۜۙۥۜۡۙۥۨ۫۫۫ۡۘۧ۟ۜۦۢۥ"
            r3 = r2
            goto L_0x0011
        L_0x03a3:
            java.lang.String r2 = ","
            r12.append(r2)
            java.lang.String r2 = "۠۬ۧۘ۫ۧۤۤۙۨۜۡۘۛۘۜۘ۠ۢۤۦۥۘۖۡۚۖۙۥ"
            r3 = r2
            goto L_0x0011
        L_0x03ad:
            r0 = r19
            android.widget.TextView r2 = r0.f620e
            r2.setText(r12)
            java.lang.String r2 = "ۤۚۖۘ۬۟ۛۜۤۦۥ۫ۥۨ۟ۗۥۘۦۘۚ۫ۗ"
            r3 = r2
            goto L_0x0011
        L_0x03b9:
            int r5 = r9 + 1
            java.lang.String r2 = "ۖۘۘ۬ۚۘۤۦۘۘۥۢ۠ۘۖ۫ۦ۟ۨۘۘ۬ۖۘ۟۟ۡۛۥۘ"
            r3 = r2
            goto L_0x0011
        L_0x03c0:
            java.lang.String r2 = "ۚۖۜۜۦۨۘ۬ۥۥۘۙۘۧۘۡۤۧ۬ۥۦۡۖۦۘۛۢ۬ۡۘۘ"
            r3 = r2
            r9 = r5
            goto L_0x0011
        L_0x03c6:
            java.lang.String r2 = ","
            java.lang.String r3 = ""
            java.lang.String r4 = r13.replace(r2, r3)
            java.lang.String r2 = "ۛۚۘۨۗۜۘۘۢۛۙۦۖۘۜۡۚ"
            r3 = r2
            goto L_0x0011
        L_0x03d3:
            r0 = r19
            r0.f624i = r4
            java.lang.String r2 = "ۡۘ۬۟ۨۥۗۤ۟۬۟ۖۚۜۘ"
            r3 = r2
            goto L_0x0011
        L_0x03dc:
            r3 = -664935496(0xffffffffd85de3b8, float:-9.7588046E14)
            java.lang.String r2 = "۠۬۬ۨۦۨۖۧۧۜۛۡۘۚۧۥۘ۬ۨۙۧۗ۟ۚ۟ۘۛ۫ۥ"
        L_0x03e1:
            int r17 = r2.hashCode()
            r17 = r17 ^ r3
            switch(r17) {
                case -100588918: goto L_0x0477;
                case 1529311150: goto L_0x03f3;
                case 1592319419: goto L_0x03fe;
                case 1876099535: goto L_0x03eb;
                default: goto L_0x03ea;
            }
        L_0x03ea:
            goto L_0x03e1
        L_0x03eb:
            java.lang.String r2 = "ۧۥۖۡ۫ۦۘ۠ۦۘ۟ۡۡۥۗۜۘۙۙۛۜ۬ۗۧ۟ۡۘۥۡ۬"
            r3 = r2
            goto L_0x0011
        L_0x03f0:
            java.lang.String r2 = "ۗ۫ۜۘۧۡۥۘۛۜ۠ۙۨۛۢ۠ۨۙ۫"
            goto L_0x03e1
        L_0x03f3:
            java.lang.String r2 = "@s.whatsapp.net"
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L_0x03f0
            java.lang.String r2 = "۬ۦۖۘۖۛ۫ۦۖۦۚۜۛۘۛ۠ۨ۠۟۫ۤۤۥۚۦۘۗ۟ۘۘ"
            goto L_0x03e1
        L_0x03fe:
            java.lang.String r2 = "ۗۗۜۘۜ۠ۛۦۡۖۘۨۜ۠۠ۢۥۘۢۡۘۗۤۡ۫ۧۡۘ"
            goto L_0x03e1
        L_0x0401:
            r0 = r19
            android.widget.TextView r2 = r0.f620e
            r3 = 0
            java.lang.String r17 = "@"
            r0 = r17
            int r17 = r4.lastIndexOf(r0)
            r0 = r17
            java.lang.String r3 = r4.substring(r3, r0)
            java.lang.String r3 = com.obwhatsapp.yo.dep.getContactName(r3)
            r2.setText(r3)
            java.lang.String r2 = "ۗۜۨۘ۟ۛۡۘۙ۟۫ۦ۟ۦۚۥۖۛۙ۟ۘۦۥ"
            r3 = r2
            goto L_0x0011
        L_0x0420:
            r3 = -18518694(0xfffffffffee56d5a, float:-1.524805E38)
            java.lang.String r2 = "ۗ۬۫ۚۜۙۡ۫ۛۚۧ۟ۡۜۥۘ"
        L_0x0425:
            int r17 = r2.hashCode()
            r17 = r17 ^ r3
            switch(r17) {
                case -1483984669: goto L_0x0440;
                case 50178316: goto L_0x047c;
                case 902375434: goto L_0x042f;
                case 1096296433: goto L_0x043d;
                default: goto L_0x042e;
            }
        L_0x042e:
            goto L_0x0425
        L_0x042f:
            java.lang.String r2 = "@g.us"
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L_0x043a
            java.lang.String r2 = "ۛۤۧۢ۠۟ۖۤۘۘۖۜ۫۟۬۬"
            goto L_0x0425
        L_0x043a:
            java.lang.String r2 = "۠ۥۖ۬ۨۡۙۜۙۛۖ۬۟۠ۥۙ۟ۤ۬ۥۘ"
            goto L_0x0425
        L_0x043d:
            java.lang.String r2 = "ۚۨۦۘۢ۠۬ۗۙۤۥ۬ۨۘۤۛۨۘۡۖۤۘ۟ۚ۫ۜۦۘ"
            goto L_0x0425
        L_0x0440:
            java.lang.String r2 = "ۗ۬۠ۚ۬ۘۘۗۚۨۘۚۥۤۢۘۤ"
            r3 = r2
            goto L_0x0011
        L_0x0445:
            r0 = r19
            android.widget.TextView r2 = r0.f620e
            java.lang.String r3 = com.obwhatsapp.yo.yo.stripJID(r4)
            java.lang.String r3 = com.obwhatsapp.yo.dep.getContactName(r3)
            r2.setText(r3)
            java.lang.String r2 = "ۡ۫۠ۧۗۡۙۖۨۨۢ۟ۦۢ۠ۙۥۨۘ"
            r3 = r2
            goto L_0x0011
        L_0x0459:
            java.lang.String r2 = "۬ۚۖۘۦۘ۫ۘۡۨۦۖۗۨۦۖۦۦۗ"
            r3 = r2
            goto L_0x0011
        L_0x045e:
            java.lang.String r2 = "ۦۘۖۦۚۙۢۥۢۢۡۛۜ۬ۤ"
            r3 = r2
            goto L_0x0011
        L_0x0463:
            java.lang.String r2 = "ۛۧۤۦۤۡۘۙۢۜۙۢۢۜۖۧ۠ۜ۬ۧ۟ۘ"
            r3 = r2
            goto L_0x0011
        L_0x0468:
            java.lang.String r2 = "۠ۖۨۘۥ۠۫۬ۘۘ۠ۚۖۡۥۧۘ"
            r3 = r2
            goto L_0x0011
        L_0x046d:
            java.lang.String r2 = "۬ۙۜۘۧ۠ۥۜۖۡۘ۠ۦۗ۠۠ۧۧۦۡۘۢۗۜ"
            r3 = r2
            goto L_0x0011
        L_0x0472:
            java.lang.String r2 = "ۗ۠ۗۖ۠ۨۘۘ۠ۙۜ۠۬ۙ۬ۖۦۘ۠"
            r3 = r2
            goto L_0x0011
        L_0x0477:
            java.lang.String r2 = "ۤ۟ۖۢۧۡۥۦۧۥۤۦۛۤۧۡۥۤۢۜۢ۟۫ۛۡۧۘ"
            r3 = r2
            goto L_0x0011
        L_0x047c:
            java.lang.String r2 = "ۡ۫۠ۧۗۡۙۖۨۨۢ۟ۦۢ۠ۙۥۨۘ"
            r3 = r2
            goto L_0x0011
        L_0x0481:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.autoschedreply.AddMessage.onCreate(android.os.Bundle):void");
    }

    public void t(View view) {
        String str = "ۧ۟ۖۢ۠ۦۤۘۜۘۦۘۡۘۤۜۥۘۧ۬۟ۡۙۘۙۜ۫ۦۦۦ";
        Bundle bundle = null;
        Calendar calendar = null;
        TimePickerFragment timePickerFragment = null;
        while (true) {
            switch ((str.hashCode() ^ 653) ^ 287396713) {
                case -1844637130:
                    str = "ۢۥ۟ۙ۟۟ۤۛۨۘۚ۬ۧۨ۠ۥۤۥۘۡۘ۫۫ۜۛۤ۫ۧ";
                    break;
                case -1562574098:
                    this.f619d.setError((CharSequence) null);
                    str = "۬ۖۧۘ۫ۘ۟ۥۙۚۜۤ۠ۙۘۖۙۘۜۘۨ۠ۤۡۨۘ";
                    break;
                case -1429601784:
                    timePickerFragment.setArguments(bundle);
                    str = "ۨۜۘۘۦۛۗ۠ۡ۟ۖۡۘ۟ۘۦۘۛۛۦۘۤۨۨ";
                    break;
                case -1054367208:
                    return;
                case -1048033241:
                    calendar = Calendar.getInstance();
                    str = "ۧۢ۠ۤۡۧۘ۠ۨۧۙ۟۠ۘۥۜ۫۬ۚ";
                    break;
                case -804515442:
                    bundle.putInt("hour", calendar.get(11));
                    str = "ۥۤ۠ۜ۫ۙ۠۬ۘۜۨۦ۬ۖۧۘ";
                    break;
                case -802855604:
                    timePickerFragment.show(getFragmentManager(), "Time Picker");
                    str = "۬۠ۜۘ۟ۚۥۤۚۘۘۥۥۡۘ۠ۥۨ";
                    break;
                case -749523946:
                    bundle.putInt("minute", calendar.get(12));
                    str = "۫۠ۨۘ۫۫ۜۘ۬ۙۜۘۖ۬۬ۧۙ۠ۡۦۘۘۛۧ۟";
                    break;
                case -659799701:
                    str = "۟۫ۚۤۥۡۘۤۚۘۙۙۦۨ۠ۘۘۙ۬ۧۦ۠۬ۜۦۘۘ";
                    break;
                case -412630806:
                    timePickerFragment = new TimePickerFragment();
                    str = "ۨ۫ۨ۟۟۟ۜۙۧۖۙۧۡۢۚۨۦ";
                    break;
                case -277233700:
                    bundle = new Bundle();
                    str = "ۡۖۥۗۢۜۘۨ۬ۦۘۖ۠ۡۧۛۨ";
                    break;
                case -63874642:
                    timePickerFragment.setCallBack(this.f625j);
                    str = "ۖۛۥۤۨۖۘۙ۟ۢۙ۟ۚۗ۫ۚ";
                    break;
            }
        }
    }

    public void u(View view) {
        String str = "ۦ۟ۦۘۤ۫ۤۤۘۙۢ۟ۛ۟ۧۥۘ";
        Bundle bundle = null;
        Calendar calendar = null;
        DatePickerFragment datePickerFragment = null;
        while (true) {
            switch ((str.hashCode() ^ 939) ^ -283991783) {
                case -1649258563:
                    datePickerFragment = new DatePickerFragment();
                    str = "ۗ۠ۡۘۤ۠ۘۤۜۧۧ۬۠ۢۦۘۢ۫ۘ۬۠۟۫ۥ۬";
                    break;
                case -1443245724:
                    str = "ۡ۟ۘۘۤۦۖۘۡۦۖۘۨۜۘۖۘۧۘۙۦ۟";
                    break;
                case -1380518176:
                    bundle = new Bundle();
                    str = "۠ۨۥ۟ۛۦۘۧ۠ۚۘۢۘ۠ۡۘۘۜۙۥۘۥۜۦۘۛۥ۫ۘۥ۟";
                    break;
                case -1286823656:
                    bundle.putInt("day", calendar.get(5));
                    str = "۟ۜۧۘ۠ۗۦۘۦۜ۫ۧۖۘۘۗۜۙۙۢۥۘ";
                    break;
                case -743035820:
                    str = "ۙۤۘۘۚ۫ۧۛۦ۟ۨۢۥۘۧۜۡ";
                    break;
                case -534901420:
                    return;
                case -504530415:
                    bundle.putInt("year", calendar.get(1));
                    str = "ۦۢۥۦۨۘۖۡۥ۠ۛۘۖۤۥۘۦ۠۟۟ۚۘۘۢۧ۟";
                    break;
                case 421459958:
                    this.f618c.setError((CharSequence) null);
                    str = "ۢۜ۟ۗۨۗ۫۫ۨۘۜۜۢ۬ۡۥۘۜۚۤۘۘۥۦۛۚۙۗۚ";
                    break;
                case 456223096:
                    calendar = Calendar.getInstance();
                    str = "ۧۧۜۘ۟ۛۖۘۤۢۛ۟ۙۧۧ۬ۧۙۦۛۨۥۥ";
                    break;
                case 608294805:
                    datePickerFragment.show(getFragmentManager(), "Date Picker");
                    str = "ۨۗ۬ۖ۬۠ۜ۠۠ۙ۬ۜۦ۬ۦ";
                    break;
                case 829954329:
                    bundle.putInt("month", calendar.get(2));
                    str = "۬ۥۢۖۧۖۘۥۜ۠ۙۘ۠ۗ۫ۢۢۚۜ";
                    break;
                case 1030648977:
                    datePickerFragment.setArguments(bundle);
                    str = "ۜ۠ۦۛ۫ۘ۫۠ۗۜۢۜ۟۟ۖۧۗ۟ۘ۬۫۟۠۠";
                    break;
                case 2006053321:
                    datePickerFragment.setCallBack(this.f626k);
                    str = "ۗۨۦۨ۬۠ۛۘ۬ۨۥۜۤ۬ۦ";
                    break;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v24, types: [android.widget.TextView] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w(android.view.View r20) {
        /*
            r19 = this;
            r18 = 0
            r15 = 0
            r17 = 0
            r13 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            r14 = 0
            r16 = 0
            r3 = 0
            r1 = 0
            java.lang.String r2 = "ۖ۟ۚۤۡۨۘۢ۠۟ۨۤ۠ۤۙۦۘ۫ۜۢ"
            r8 = r3
            r9 = r4
            r10 = r5
            r11 = r6
            r12 = r7
        L_0x0016:
            int r3 = r2.hashCode()
            r4 = 326(0x146, float:4.57E-43)
            r5 = -952755304(0xffffffffc7361b98, float:-46619.594)
            r3 = r3 ^ r4
            r3 = r3 ^ r5
            switch(r3) {
                case -2132400349: goto L_0x007e;
                case -1932002667: goto L_0x012d;
                case -1837855401: goto L_0x0025;
                case -1789466734: goto L_0x027c;
                case -1729939699: goto L_0x00f0;
                case -1338141202: goto L_0x0072;
                case -1181972975: goto L_0x0264;
                case -1165620775: goto L_0x0280;
                case -1137961267: goto L_0x0181;
                case -1120371587: goto L_0x0124;
                case -1062803731: goto L_0x017a;
                case -1054817757: goto L_0x0264;
                case -1036495377: goto L_0x023c;
                case -1015261933: goto L_0x0202;
                case -858227938: goto L_0x00b8;
                case -849109945: goto L_0x0171;
                case -846741044: goto L_0x0138;
                case -784779119: goto L_0x025d;
                case -614288785: goto L_0x002b;
                case -599105299: goto L_0x0278;
                case -592211416: goto L_0x00f5;
                case -545096282: goto L_0x006e;
                case -470393284: goto L_0x00b3;
                case -470190885: goto L_0x003c;
                case -201750599: goto L_0x0264;
                case -152707028: goto L_0x0041;
                case -25024645: goto L_0x01c5;
                case 552320675: goto L_0x01a0;
                case 598098091: goto L_0x0264;
                case 780131711: goto L_0x0069;
                case 863341814: goto L_0x0060;
                case 906274369: goto L_0x0247;
                case 956617538: goto L_0x00e7;
                case 1054925430: goto L_0x0197;
                case 1069626951: goto L_0x00aa;
                case 1080672225: goto L_0x0186;
                case 1252435862: goto L_0x0132;
                case 1434408205: goto L_0x01a8;
                case 1454382272: goto L_0x0028;
                case 1831445111: goto L_0x00be;
                case 2030958879: goto L_0x00fb;
                case 2080903927: goto L_0x018c;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0016
        L_0x0025:
            java.lang.String r2 = "ۚۙۖۥۥۡ۟ۢۨۡۚۘۢۤۨۘۜۨ۠"
            goto L_0x0016
        L_0x0028:
            java.lang.String r2 = "ۦ۫۟۫ۥ۬ۙ۟ۨ۬ۡۘۗۚۚۦۡ۫ۜۚۡ"
            goto L_0x0016
        L_0x002b:
            r0 = r19
            android.widget.TextView r2 = r0.f620e
            java.lang.CharSequence r2 = r2.getText()
            int r3 = r2.length()
            java.lang.String r2 = "۬ۙۡۘۖۙۗۡۜۤۘۗۘۘۚۢ۠ۤۧۢۚ۬ۖ"
            r18 = r3
            goto L_0x0016
        L_0x003c:
            java.lang.String r15 = "msg_scheduler_error"
            java.lang.String r2 = "ۘۦۜۘۖۦۥۘۛۤۨ۬ۦۖۘۤۙۦۘۦۛۜ"
            goto L_0x0016
        L_0x0041:
            r3 = 683748992(0x28c12e80, float:2.144747E-14)
            java.lang.String r2 = "ۖۨۘۖۘ۬۬ۡ۬ۙۥۢۤۦۨۙۖ۠ۖۘۡۥ۬"
        L_0x0046:
            int r4 = r2.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -640774566: goto L_0x004f;
                case -362406801: goto L_0x005d;
                case 459139134: goto L_0x005a;
                case 1809401830: goto L_0x0055;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0046
        L_0x004f:
            java.lang.String r2 = "ۜ۟ۡ۫ۡۡۘۡ۬ۥ۬ۢۜ۫ۛۤ"
            goto L_0x0016
        L_0x0052:
            java.lang.String r2 = "ۛۢۜۚۗۘ۫ۨۜۙ۬ۜۘۧ۫ۨۘۖۧ۟ۘۘ۬"
            goto L_0x0046
        L_0x0055:
            if (r18 != 0) goto L_0x0052
            java.lang.String r2 = "۠ۡۨۘۙ۬ۚۛۚۗ۠ۚۨۧ۟ۥۦۡۖۘ"
            goto L_0x0046
        L_0x005a:
            java.lang.String r2 = "ۖۢۡۗ۟ۥۤۥ۬ۖۘۡۙۖۥۘۨۡۙۡۨۜۘۛۖ۬ۢۦۧۘ"
            goto L_0x0046
        L_0x005d:
            java.lang.String r2 = "ۖۛ۟ۧۢۗ۠۬ۖ۟ۤۖۘۗۢۨۘۙ۠ۡۘ"
            goto L_0x0016
        L_0x0060:
            r0 = r19
            android.widget.TextView r0 = r0.f620e
            r17 = r0
            java.lang.String r2 = "ۙۛۗۢۥۖۦۨ۫ۨۙۧۨ۠ۤ"
            goto L_0x0016
        L_0x0069:
            java.lang.String r2 = "ۧۗۜۦ۫ۤ۬ۗۚۜۢۨۘۡ۫ۗۚۥۡۤۜ۫"
            r16 = r17
            goto L_0x0016
        L_0x006e:
            java.lang.String r2 = "ۡۨۤۚۘۘۜ۫ۜۘۛۢۢۜۡۨ"
            r14 = r15
            goto L_0x0016
        L_0x0072:
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((java.lang.String) r14)
            r0 = r16
            r0.setError(r2)
            java.lang.String r2 = "۫ۧۡۘۨۘۘ۫۫ۤۤۥۨۘۢۗۨۜ۫ۨۘۦۥۖۘۜۙۜ"
            goto L_0x0016
        L_0x007e:
            r3 = -425472914(0xffffffffe6a3cc6e, float:-3.867584E23)
            java.lang.String r2 = "ۗۨۖ۟۠ۡۘ۬۫ۡۘ۠ۤۦۘۤۨۜۛۛ۫"
        L_0x0083:
            int r4 = r2.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -2110046401: goto L_0x00a3;
                case -1601830907: goto L_0x008c;
                case 7309266: goto L_0x0092;
                case 1347068862: goto L_0x00a6;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x0083
        L_0x008c:
            java.lang.String r2 = "۟ۗۥۘۥۨۨۗۗۢۨۗۚۥۢۛ۫ۜۘۦۗۦ"
            goto L_0x0016
        L_0x008f:
            java.lang.String r2 = "ۤۢۙ۫۠ۗ۟ۦۧۘۢ۬ۨ۬ۦۤ"
            goto L_0x0083
        L_0x0092:
            r0 = r19
            android.widget.EditText r2 = r0.f621f
            android.text.Editable r2 = r2.getText()
            int r2 = r2.length()
            if (r2 != 0) goto L_0x008f
            java.lang.String r2 = "ۢۨۙۧۤۥۘ۠ۤۜۨ۫۟ۜۥۜۚ۟ۙ۬۫ۢۦۡۥ۠۬۬"
            goto L_0x0083
        L_0x00a3:
            java.lang.String r2 = "ۦۙۖۘۧۘۡۡ۬ۡۢۦۨۘۧۨۙۙ"
            goto L_0x0083
        L_0x00a6:
            java.lang.String r2 = "ۘۜۚۚۘۙۡۧۘۨۨۖ۬ۘ۬۠ۛۜ۠ۙۜ"
            goto L_0x0016
        L_0x00aa:
            r0 = r19
            android.widget.EditText r3 = r0.f621f
            java.lang.String r2 = "ۦۚۗۡ۬۫ۦۨۢۦۙۦۤ۫۟۠ۘۨۖۧۚۖۘۘۖ۠ۡ"
            r13 = r3
            goto L_0x0016
        L_0x00b3:
            java.lang.String r2 = "ۦۦۛۚۛۚۚۙ۟ۗ۬ۢۤۧۚۢۜۤۤۖۨۘ"
            r14 = r15
            goto L_0x0016
        L_0x00b8:
            java.lang.String r2 = "۠ۚۙۢۘۖۘ۟ۤۡۖ۠ۨۥۨۜۤ۬۠ۤۚ۠ۖ۠ۡۘۗۡۘۘ"
            r16 = r13
            goto L_0x0016
        L_0x00be:
            r3 = -2060001370(0xffffffff8536dfa6, float:-8.5986766E-36)
            java.lang.String r2 = "ۦۖۦۘۥ۠ۜۦ۫ۥۧۘۙۥۦۦۘ"
        L_0x00c3:
            int r4 = r2.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -2132882660: goto L_0x00d2;
                case -2007536157: goto L_0x0268;
                case -1149371016: goto L_0x00cc;
                case 509372824: goto L_0x00e3;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            goto L_0x00c3
        L_0x00cc:
            java.lang.String r2 = "ۜۢۖۖۙۦۖۙۥۘۤۛۘۥۦۗ"
            goto L_0x00c3
        L_0x00cf:
            java.lang.String r2 = "۫ۚۙۨۥۨۘۙۨۜۘۧۢۥ۫ۥ۠ۧ۠ۜ"
            goto L_0x00c3
        L_0x00d2:
            r0 = r19
            android.widget.EditText r2 = r0.f618c
            android.text.Editable r2 = r2.getText()
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00cf
            java.lang.String r2 = "ۜۧۘۥۚۨۘۢۘۖۘۚ۠ۜۘۖۨۥۘۚۢۗ"
            goto L_0x00c3
        L_0x00e3:
            java.lang.String r2 = "۫ۨۢۦ۠۠ۦ۟ۛۖ۫ۡۛۗۖۘ۠ۥۡۘۤ۬ۨۢۖ۫"
            goto L_0x0016
        L_0x00e7:
            r0 = r19
            android.widget.EditText r3 = r0.f618c
            java.lang.String r2 = "ۦۥۥۙۤۡۤۙۘۡۤۤۛۨۙۡۙۨۘۚۧۘۘ"
            r12 = r3
            goto L_0x0016
        L_0x00f0:
            java.lang.String r2 = "ۡ۬۟۬ۖۦۤ۠ۤ۟ۥۡۢ۬ۛ"
            r14 = r15
            goto L_0x0016
        L_0x00f5:
            java.lang.String r2 = "ۛ۬ۡۘۗۛۥۘ۟ۛۥۘ۟ۛۘۘۡۧۜ۟ۤۨۘۨ۫ۖۘۥۥۘۡۜۖۘ"
            r16 = r12
            goto L_0x0016
        L_0x00fb:
            r3 = -1826485477(0xffffffff93220b1b, float:-2.045275E-27)
            java.lang.String r2 = "ۧۛۙ۠ۖۛۛۜۜ۟ۖۖۘۤۛۡۡ۟ۡۡۛۦۘۖۖۖ۟۟۠"
        L_0x0100:
            int r4 = r2.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1034077027: goto L_0x0121;
                case -642446637: goto L_0x0109;
                case -356472962: goto L_0x026c;
                case 1642495288: goto L_0x0110;
                default: goto L_0x0108;
            }
        L_0x0108:
            goto L_0x0100
        L_0x0109:
            java.lang.String r2 = "ۘۨ۠ۡۤۥۧۤ۠ۡۧۗۚۗۘۚ۟ۛۜۘۚۨۖۘۦۢ"
            goto L_0x0016
        L_0x010d:
            java.lang.String r2 = "ۥۡ۬ۗۨۙۨۚۘۤۦۤ۬ۚ۠۟ۢۗۤۜۡۘ"
            goto L_0x0100
        L_0x0110:
            r0 = r19
            android.widget.EditText r2 = r0.f619d
            android.text.Editable r2 = r2.getText()
            int r2 = r2.length()
            if (r2 != 0) goto L_0x010d
            java.lang.String r2 = "ۦ۫۫ۥ۫۬ۢ۬ۨۘۛۚۚ۬ۡۘۘۨۖ۫ۥۦ۫ۡ۟ۦ۫"
            goto L_0x0100
        L_0x0121:
            java.lang.String r2 = "ۨۤۡۚ۫ۦۘۚۙۗ۟ۚۚۦۗۖ۬ۜۛۦۙ"
            goto L_0x0100
        L_0x0124:
            r0 = r19
            android.widget.EditText r3 = r0.f619d
            java.lang.String r2 = "ۗۥۜ۠ۛ۟ۜۖۦۙۗ۫ۙۚ۠۫ۜۜۘۥۚۦۘۢۚ۟"
            r11 = r3
            goto L_0x0016
        L_0x012d:
            java.lang.String r2 = "۫ۧۡۧ۠ۦۘۥۘ۬ۙۜۨۧۜۦۘۤۙ۠"
            r14 = r15
            goto L_0x0016
        L_0x0132:
            java.lang.String r2 = "۟ۚۘۖۥۨۘۢۤۨۘۢۤۘ۫ۧۙ"
            r16 = r11
            goto L_0x0016
        L_0x0138:
            r3 = -453147241(0xffffffffe4fd8597, float:-3.741322E22)
            java.lang.String r2 = "۬ۧۦۧۡۘۘۡ۠ۘۘۥ۟ۢۢۡ۠"
        L_0x013d:
            int r4 = r2.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -2090422294: goto L_0x0146;
                case 166373873: goto L_0x016d;
                case 365948219: goto L_0x016a;
                case 1033362144: goto L_0x0270;
                default: goto L_0x0145;
            }
        L_0x0145:
            goto L_0x013d
        L_0x0146:
            r0 = r19
            android.widget.EditText r2 = r0.f618c
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            r0 = r19
            android.widget.EditText r4 = r0.f619d
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            boolean r2 = isValidDateAndTime(r2, r4)
            if (r2 != 0) goto L_0x0167
            java.lang.String r2 = "ۢۨۦۘۦۛ۬ۨ۬ۚۡۚ۬ۖۗۡ۟ۧۗۦۧۘ"
            goto L_0x013d
        L_0x0167:
            java.lang.String r2 = "ۨۥۘۤۨۨۘ۟ۦۡۘ۬ۦۜۘۨۧۗ۬ۛۥۘ"
            goto L_0x013d
        L_0x016a:
            java.lang.String r2 = "ۧۜۛۥۗۜۘۖۦۧۤۚ۟ۢۧۧۖۙۡۘۨۗ۫"
            goto L_0x013d
        L_0x016d:
            java.lang.String r2 = "۠ۙۡۘۙۛ۬۟ۨۘۗۧۛۧ۬ۛ۠ۙ"
            goto L_0x0016
        L_0x0171:
            r0 = r19
            android.widget.EditText r3 = r0.f619d
            java.lang.String r2 = "ۘۨۘ۟ۤۦۘ۠۠ۗۥۧ۠۟ۜۖۛۘۦۘۚۙ۬۠ۜۚ"
            r10 = r3
            goto L_0x0016
        L_0x017a:
            java.lang.String r3 = "clock_wrong_title"
            java.lang.String r2 = "ۘۜ۫ۧۜۤۘۨۖۘ۟ۚۙۢۧۜۦۙۡ۠ۚۜۢۨ۠"
            r9 = r3
            goto L_0x0016
        L_0x0181:
            java.lang.String r2 = "ۤۢ۟ۙۤۡۘۨ۬ۘۘ۫ۘۥۘۨۜۜۘۦۘۚۙۧ"
            r14 = r9
            goto L_0x0016
        L_0x0186:
            java.lang.String r2 = "ۨۜۧۖۚۦ۬ۜۛۧۤۡۘ۟۟ۡۘ"
            r16 = r10
            goto L_0x0016
        L_0x018c:
            r0 = r19
            com.obwhatsapp.yo.autoschedreply.SQLiteAdapter r2 = r0.f617b
            r2.open()
            java.lang.String r2 = "۫ۡۙۘ۫ۚۨ۬ۢۢۘۘۢ۠ۧۘۚۡ۬۫ۤ۫ۨ۬"
            goto L_0x0016
        L_0x0197:
            r0 = r19
            java.util.ArrayList r3 = r0.f623h
            java.lang.String r2 = "ۜۤۙۚۘۚ۫ۢ۟ۢۗۡۘ۠۟ۛۧۨۚۨۡۜ"
            r8 = r3
            goto L_0x0016
        L_0x01a0:
            r0 = r19
            com.obwhatsapp.yo.autoschedreply.SQLiteAdapter r1 = r0.f617b
            java.lang.String r2 = "ۡۤۖۙۗۨۘۡۤۗۨۦۜ۬ۙ۫"
            goto L_0x0016
        L_0x01a8:
            r3 = 1361302344(0x5123d348, float:4.3976524E10)
            java.lang.String r2 = "ۖۗۡۘ۟ۚ۬۫ۦۢۨۗ۫۫ۤۨۤۘۙۙۖۥ۬ۖۧ"
        L_0x01ad:
            int r4 = r2.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1298795335: goto L_0x0274;
                case -974923184: goto L_0x01c1;
                case 101136210: goto L_0x01be;
                case 1097737489: goto L_0x01b6;
                default: goto L_0x01b5;
            }
        L_0x01b5:
            goto L_0x01ad
        L_0x01b6:
            if (r8 != 0) goto L_0x01bb
            java.lang.String r2 = "۠ۛ۫ۗۦۢۨۥ۬۬ۛۢۦۢۜۘ۟ۙۨۚۨۡۗ۫ۖۘ"
            goto L_0x01ad
        L_0x01bb:
            java.lang.String r2 = "ۘ۬ۦۘۤ۫ۚۙۘۚۧۥۘۘۨ۠ۢۤۨۘ۠ۡۨۙۢۡۘ"
            goto L_0x01ad
        L_0x01be:
            java.lang.String r2 = "۫ۛۦۜۙۜۛۤۥ۟ۦۖۙ۬ۥۘۗۗۜۧۚۡۘۢ۫ۥۘۧۧۘ"
            goto L_0x01ad
        L_0x01c1:
            java.lang.String r2 = "ۖ۬ۥۘۖۦۡۨۦۡۘ۠ۜ۠ۡۖۜۘ۟ۘ۠ۚ۟ۙ"
            goto L_0x0016
        L_0x01c5:
            r0 = r19
            java.lang.String r2 = r0.f624i
            r0 = r19
            android.widget.EditText r3 = r0.f621f
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r0 = r19
            android.widget.EditText r4 = r0.f618c
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            r0 = r19
            android.widget.EditText r5 = r0.f618c
            android.text.Editable r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            r0 = r19
            android.widget.EditText r6 = r0.f619d
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "u"
            r1.cc((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7)
            java.lang.String r2 = "ۚۧ۟ۘۤۨۖۜۥۘۗۡۘ۟ۡۘۘۢ۬ۜۘ"
            goto L_0x0016
        L_0x0202:
            r0 = r19
            android.widget.EditText r2 = r0.f621f
            android.text.Editable r2 = r2.getText()
            java.lang.String r3 = r2.toString()
            r0 = r19
            android.widget.EditText r2 = r0.f618c
            android.text.Editable r2 = r2.getText()
            java.lang.String r4 = r2.toString()
            r0 = r19
            android.widget.EditText r2 = r0.f618c
            android.text.Editable r2 = r2.getText()
            java.lang.String r5 = r2.toString()
            r0 = r19
            android.widget.EditText r2 = r0.f619d
            android.text.Editable r2 = r2.getText()
            java.lang.String r6 = r2.toString()
            java.lang.String r7 = "u"
            r2 = r8
            r1.cc((java.util.ArrayList) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7)
            java.lang.String r2 = "ۨۛۦۘۥۖۧۧۨۤۦۦۖۗ۫ۜۘۘۗۖۘ۠۬۫۟ۦۘۘ"
            goto L_0x0016
        L_0x023c:
            r0 = r19
            com.obwhatsapp.yo.autoschedreply.SQLiteAdapter r2 = r0.f617b
            r2.close()
            java.lang.String r2 = "ۨۙۧۢ۟ۧۘ۠ۥۛ۠ۛۧۤۘ۬ۗۥۙۘۢۨۡۖ۬ۥ"
            goto L_0x0016
        L_0x0247:
            android.content.Context r2 = r19.getApplicationContext()
            java.lang.String r3 = "msg_scheduler_msgsetdone"
            java.lang.String r3 = com.obwhatsapp.yo.yo.getString((java.lang.String) r3)
            r4 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r4)
            r2.show()
            java.lang.String r2 = "ۧۡۢۙۗۖۚ۟ۖۡ۬ۧۢۥۧۘ"
            goto L_0x0016
        L_0x025d:
            r19.finish()
            java.lang.String r2 = "ۖۤۢۘ۠ۡۨۚۘۨۙۥۘۖۡۗ"
            goto L_0x0016
        L_0x0264:
            java.lang.String r2 = "ۡۨۤۚۘۘۜ۫ۜۘۛۢۢۜۡۨ"
            goto L_0x0016
        L_0x0268:
            java.lang.String r2 = "۠ۧۡۤۘۦۡ۠ۘ۬ۜۡۘۢۡۚۥۛۢۛۧۜۘ"
            goto L_0x0016
        L_0x026c:
            java.lang.String r2 = "ۨۘۡۘۗ۫ۡ۫ۡۨۘۥۤۖۨۖ۫"
            goto L_0x0016
        L_0x0270:
            java.lang.String r2 = "ۨۘۢ۟ۙۜۡ۠ۤۗۖۢۡۤۚ"
            goto L_0x0016
        L_0x0274:
            java.lang.String r2 = "ۚ۬ۧۙۧۢۗۨ۠۫ۚۚۙۙۚۙۖۧۘ"
            goto L_0x0016
        L_0x0278:
            java.lang.String r2 = "ۨۛۦۘۥۖۧۧۨۤۦۦۖۗ۫ۜۘۘۗۖۘ۠۬۫۟ۦۘۘ"
            goto L_0x0016
        L_0x027c:
            java.lang.String r2 = "ۖۤۢۘ۠ۡۨۚۘۨۙۥۘۖۡۗ"
            goto L_0x0016
        L_0x0280:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.autoschedreply.AddMessage.w(android.view.View):void");
    }

    public void ws(View view) {
        String str = "ۥ۫۫ۤۚۨۘ۠ۜۗ۬۫ۛ۬ۧۦۘ۬ۛۛۢۤۛۘۛ۟";
        ArrayList arrayList = null;
        EditText editText = null;
        EditText editText2 = null;
        EditText editText3 = null;
        EditText editText4 = null;
        TextView textView = null;
        while (true) {
            switch ((str.hashCode() ^ 386) ^ -1536686111) {
                case -2145262653:
                    str = "ۛ۠ۦۛۖۦۤۚۨۘۗۢۡۜۤۚ";
                    editText2 = this.f618c;
                    break;
                case -2100706395:
                    return;
                case -1962479605:
                    String str2 = "ۘ۟ۨ۠ۖۥۘۛۡۥۚ۠ۘۡۦۖۘۨۘۨ";
                    while (true) {
                        switch (str2.hashCode() ^ 357238462) {
                            case -1610411073:
                                str = "ۛۚۡ۫۬۠ۦ۬ۚۘ۠۠ۗۘ۠۟ۘۚۡۤ۫";
                                continue;
                            case -1385859421:
                                str = "ۜۦۗۘۚۨۘ۠۬ۖۡۡۛۤۜۘۚۥۡ";
                                continue;
                            case 2042463338:
                                if (this.f620e.getText().length() != 0) {
                                    str2 = "۟ۗۙۤۛۚۛۡۘۘۛۖۘۚۡ۬ۘۡۘۥۥ۠";
                                    break;
                                } else {
                                    str2 = "۬ۙۘۘۜۡۡۨۛۜۘۥۗۙۗۦۚۖۘ۠ۧۗۤۜۙ";
                                    break;
                                }
                            case 2112426635:
                                str2 = "۫۠ۛۡۤۘۘۙۙۜۘۚۙۘۘۥۢۥۘ۟ۗ۫ۗۛ۠";
                                break;
                        }
                    }
                    break;
                case -1799039628:
                    String str3 = "۫ۢ۫ۚۥ۠ۧ۠ۥۤۨۙۚۛۦۥۘۧ۟ۗۛۛۙ";
                    while (true) {
                        switch (str3.hashCode() ^ -1796369150) {
                            case -1370289321:
                                str = "ۧۛۦۘۡۛ۫ۨۨۘۢ۬ۘۘۢۘۙۚۨۧۘۦۘ";
                                continue;
                            case -1287717238:
                                if (arrayList != null) {
                                    str3 = "ۤ۬ۜۢۗۙ۟ۦۘۘ۬۠ۦ۟ۢ۠۟ۥۗۧۙۥۛ۫ۢۘۧۦۘ";
                                    break;
                                } else {
                                    str3 = "ۖ۬ۖۘۨۦۧۘۛۜۥۘۚۙۧۡ۫۫ۘۡۧۘۡۗۜۘ";
                                    break;
                                }
                            case -1171165822:
                                str3 = "۬ۤ۫ۤ۟ۨۘۚۜۚ۫ۥۥۘ۫ۛ۬";
                                break;
                            case 2058742765:
                                str = "ۤۜۖۧۡۨۧ۬ۥۘۙۧ۠ۗ۬ۡۘۡۨۥ";
                                continue;
                        }
                    }
                    break;
                case -1686363450:
                    String str4 = "ۗۡ۬ۢ۬ۗۥ۠ۦۘۦۜۥ۫ۚۥۤۜۦۘ۟ۗ۟ۢۥۚۥ۟۟";
                    while (true) {
                        switch (str4.hashCode() ^ 1935835424) {
                            case -897515224:
                                str = "ۘۜۖۖۛۛۛۘ۫ۜۢ۟۫ۘۡۦۡ۬ۚۙۨ۬ۢ۟ۙۗۜ";
                                continue;
                            case -896137675:
                                str = "۠ۡۘۘۖۘۤۡۜ۬ۧۜۙۥۜۖۜۦ";
                                continue;
                            case -362580675:
                                str4 = "۬ۜ۬ۡ۟ۦۘۚۘۘۘۨۨۦۥۨۘۘۥۚۧۙۖۖ۫ۗۖۦۥۘ";
                                break;
                            case -11465012:
                                if (this.f621f.getText().length() != 0) {
                                    str4 = "ۜۤۗ۬ۖۘۛۚ۟۟ۖۢۛۢۡۘ";
                                    break;
                                } else {
                                    str4 = "ۥۙ۠ۛۧۚۧۘۖ۠ۦۘۘۧ۠ۧۚ۬ۨ۠۟ۙ۟ۚۡ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1661977909:
                    str = "۟ۘۡۘ۫ۗۚۘۡۨۥۘۥ۠ۤۤۖۨۤۧ۬۬ۖۥۜۘۘۚۚ";
                    editText4 = editText;
                    break;
                case -1486399887:
                    String str5 = "ۡۢۤۨۙۨ۬۟ۥۘۢۦۙۢۦۥۘ۬ۢ۬ۤ۫ۖۘۧ۫ۧۥۙۡ";
                    while (true) {
                        switch (str5.hashCode() ^ 291503479) {
                            case -1224824654:
                                str5 = "ۡ۫۠ۘۛۥۘۗۙۜۢۦۥۘۙۧۙۢۡۚۦۤۘۘۢۤۨۘۚۛۨۘ";
                                break;
                            case -1166662431:
                                str = "ۙۖۢۥۢۚۥۛۤۙۨۗ۟ۗۡۘۜ۫ۜۢ۬۟ۡۘ";
                                continue;
                            case 235551712:
                                if (this.f618c.getText().length() != 0) {
                                    str5 = "ۤۤۥۘۖۚۨ۫ۤۡ۬ۚۥۘۚ۫ۡۢۦۡۡۥ۫";
                                    break;
                                } else {
                                    str5 = "۬ۨۢ۬۫ۨۡۙ۟ۦۦۢ۟ۥۘۥۢۖ";
                                    break;
                                }
                            case 371526933:
                                str = "ۥۦۙۗۙۖۤۡۥۥۙۨۘۡۜۦ۟۟ۗۗۧ۬ۨۥۘۘۜۥۧۘ";
                                continue;
                        }
                    }
                    break;
                case -1447628168:
                    editText4.setError(yo.getString("msg_scheduler_error"));
                    str = "۠ۤ۬ۙ۫ۚۡ۫ۜۦۜۤۘ۫۬ۨ۬۬ۧ۠ۦ";
                    break;
                case -987380989:
                    this.f617b.open();
                    str = "ۤ۟ۚۧۖۖۘۛ۬ۡۖۤۚۜۥۤ۠ۘ۬ۖ۠ۤۤۘۨۘ";
                    break;
                case -735037195:
                    str = "ۨۘۚۥۙ۟ۚۤۥۨۦۦۘ۟ۗۧۨ۫ۥۘۙۡۢ۫ۨۚ";
                    break;
                case -715422252:
                    String str6 = "ۘۤۥۘۢ۫ۜۜۚۡۘۤۢۢۖۙۢ۠ۡۧۤۢۢ";
                    while (true) {
                        switch (str6.hashCode() ^ -2055636225) {
                            case -2120661289:
                                str6 = "۟ۢۘۘۥۡۘۦۖۥۘۙۖۤۗۡۥۘۦ۬ۜۘ۠ۚۥۘۗۖۘ";
                                break;
                            case -615787402:
                                str = "۠ۚۗۛۘۙۗۙۖۛۧۥۘ۟۫";
                                continue;
                            case 117942845:
                                str = "ۜۥۦۘۨۛۨۦ۬ۚۛۖ۟ۚۚۦۘ۠ۧۜۘۜۡۡۘۨۥۙ";
                                continue;
                            case 1083142845:
                                if (this.f619d.getText().length() != 0) {
                                    str6 = "ۛۢ۠۬ۤۢۘۦۘۘۧ۟ۨۢۦۥۦۧۖۘۛۗۘ";
                                    break;
                                } else {
                                    str6 = "ۤۘۖۘ۬ۘۘۘۖ۟ۦۘ۠ۗ۟ۢۧۜۘۗۛۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -682762954:
                    str = "ۚۙۡ۟ۖۘۘۧ۬ۜۡۤۢۘۙۧۥۜۢ";
                    editText3 = this.f621f;
                    break;
                case -605794378:
                case 371614841:
                case 1104001450:
                    str = "۟ۘۤۨ۬۠۟۬ۜۘۧۢۦۙۙۦۜۦۢ۬ۖۡۥۧۦۥۡۧ";
                    break;
                case -598711170:
                    this.f617b.gg(this.f624i, this.f621f.getText().toString(), this.f618c.getText().toString(), this.f618c.getText().toString(), this.f619d.getText().toString(), "u", this.f622g);
                    str = "ۗ۟۫۫۠ۨۜۜۢۛۘۨۘۛۡۦ۟۠ۙۛ۫ۥۘ";
                    break;
                case 379154361:
                    str = "۟ۘۤۨ۬۠۟۬ۜۘۧۢۦۙۙۦۜۦۢ۬ۖۡۥۧۦۥۡۧ";
                    editText4 = textView;
                    break;
                case 431676386:
                    str = "۟۬۠ۗۧ۬۬ۙ۬ۖۤۙۨۜۤۙۦ";
                    editText = this.f619d;
                    break;
                case 605100969:
                    finish();
                    str = "ۤۡۜۖۘۥ۫۟۬ۘۢۖۘ۬ۢۨۘ";
                    break;
                case 614851424:
                    Toast.makeText(getApplicationContext(), yo.getString("msg_scheduler_msgsetdone"), 0).show();
                    str = "ۚ۟ۛۚۚۦۧۙۦۘۙۖۨۦۡۘۧۗۘۘۘۡۨۢ۫ۛۨ۠۫";
                    break;
                case 691494509:
                    this.f617b.close();
                    str = "ۖۨۘۘۦۧ۫ۖ۬ۖۤۥۘۘۖۨ۫ۘ۫ۨۤۢ";
                    break;
                case 881146565:
                    str = "ۢۦۨۘۛۦۜۗۜۤۥۡۡ۬ۤۜۘۥۖۛۛۛۥ۠ۚۨۘۥۧۡۘ";
                    editText4 = editText3;
                    break;
                case 1006858073:
                    str = "۟ۦۤۙۖ۟ۛۥۜۗ۫ۨۙ۠ۘۘ";
                    break;
                case 1090246237:
                    str = "۟۫ۘۖ۬۟ۤۡ۠۬ۧ۟ۦۢۛۜۨۛۧ۫ۚ";
                    break;
                case 1218643425:
                    str = "ۤۡۜۖۘۥ۫۟۬ۘۢۖۘ۬ۢۨۘ";
                    break;
                case 1366543467:
                    this.f617b.gg(arrayList, this.f621f.getText().toString(), this.f618c.getText().toString(), this.f618c.getText().toString(), this.f619d.getText().toString(), "u", this.f622g);
                    str = "۟ۦۤۙۖ۟ۛۥۜۗ۫ۨۙ۠ۘۘ";
                    break;
                case 1676970799:
                    str = "ۤۡۖۘۚۧ۬ۤ۠ۦۘۤۢۗۨۧۧۤۨ۬۠ۥ۫۫ۨۘۦۤۘ";
                    editText4 = editText2;
                    break;
                case 1913070181:
                    textView = this.f620e;
                    str = "ۖۜۨۘ۠۫ۖۘۗ۫ۧۛۧۡۘۙۗ۫";
                    break;
                case 2111870042:
                    str = "۬ۖۜ۟۟ۨۡ۠ۗ۟ۡۦۚۦۢۡۧۘۗۨۦۘ۬ۥۘۥ۫ۛ";
                    arrayList = this.f623h;
                    break;
            }
        }
    }

    public void x(View view) {
        String str = "ۢۘۘۘۡ۫۫ۗۘۢۜ۠ۘۘۤۡۦۤۡۦ۬ۤ۫ۧ۟ۛۛۙۛ";
        Intent intent = null;
        while (true) {
            switch ((str.hashCode() ^ 525) ^ -1487776367) {
                case -1344444472:
                    intent.putExtra("sch", 0);
                    str = "۠ۥۥۘ۟۫ۨۘۢۜۢۥۢۡۘۚۨۥ۫ۤۥ";
                    break;
                case -1044490822:
                    intent.putExtra("android.intent.extra.TEXT", "OBWA, enjoy");
                    str = "ۧۦۥۜۢۡۘۜۨۛ۠۟ۛۛۘۨۘ۫ۡۚۚ۠۬ۙۢۜۘ";
                    break;
                case -1020594450:
                    intent.setClassName(yo.getCtx().getPackageName(), ContactPicker.class.getName());
                    str = "ۧۖۖۘۗ۠۬ۨۛۘۘۥۡۤ۟ۤۗۤۡۦۨ۠ۥۙۧ۟۠ۛ";
                    break;
                case -622196603:
                    intent.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
                    str = "ۚۙۨۘۛۦ۠ۙۖۛ۫ۢۨۖۛۗۤۧۤۚۜۜۘ";
                    break;
                case -520376078:
                    str = "ۤ۟ۗۙۘۜ۟ۜ۠۟ۚۚۤۧۤۨۦۘۨۘۖۘۡۗۥۘ";
                    break;
                case -372183475:
                    this.f620e.setError((CharSequence) null);
                    str = "ۖۧۜۤۘ۬ۘۥۨۘۛۢ۟ۥۜۙ";
                    break;
                case 459907375:
                    str = "۬ۖۢۘۤۡۘۢۛ۠۠ۥۙۖۥۧۘ۟ۡۘ";
                    break;
                case 894686721:
                    startActivityForResult(intent, 324);
                    str = "ۗۚۤ۟ۦۖۘۘۧ۟ۥۦۗ۫۬ۗ۬ۜۧ۬ۗۡۘۡۖۥۘ";
                    break;
                case 1150570728:
                    intent = new Intent();
                    str = "۫ۤۨۘۨۧ۟ۙۨ۟ۛۡۦ۫۟ۡۘ";
                    break;
                case 1432205240:
                    intent.setType("text/plain");
                    str = "۟ۚ۠ۚۜۜۘۦۖۨۙۥۨ۫۫ۤۢ۫ۚ";
                    break;
                case 1804103079:
                    return;
            }
        }
    }
}
