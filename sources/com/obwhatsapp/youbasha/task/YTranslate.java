package com.obwhatsapp.youbasha.task;

import android.app.Activity;
import android.content.DialogInterface;
import android.widget.Toast;
import c.d;
import com.AssemMods.translator.Language;
import com.obwhatsapp.yo.CustomAlertDialogBuilder;
import com.obwhatsapp.yo.d0;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.app;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import l.b;
import l.c;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class YTranslate {

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference f1100a;

    /* renamed from: b  reason: collision with root package name */
    public static CharSequence f1101b;

    /* renamed from: c  reason: collision with root package name */
    public static String f1102c;

    /* renamed from: d  reason: collision with root package name */
    public static OkHttpClient f1103d;

    /* renamed from: e  reason: collision with root package name */
    public static String f1104e;

    /* renamed from: f  reason: collision with root package name */
    public static String f1105f;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        r0 = "ۡۨۨۘۗۛۢۘۥۧ۟ۢۖۘۖۢۦۘۢ۠ۜۦۢۥۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a() {
        /*
            r2 = 0
            java.lang.String r0 = "ۦۤ۟ۡۙۗۚۤۥۘۘۦۘۘۛۡۢۛۖۗۛ۬ۡۘ۠۠ۜ"
            r1 = r2
            r3 = r2
        L_0x0005:
            int r4 = r0.hashCode()
            r5 = 848(0x350, float:1.188E-42)
            r6 = 551189552(0x20da7c30, float:3.7012817E-19)
            r4 = r4 ^ r5
            r4 = r4 ^ r6
            switch(r4) {
                case -1718450312: goto L_0x009c;
                case -1558908217: goto L_0x008c;
                case -792635514: goto L_0x0066;
                case -431615698: goto L_0x003d;
                case 633662785: goto L_0x00af;
                case 837066507: goto L_0x0014;
                case 884143600: goto L_0x0060;
                case 925767383: goto L_0x00ae;
                case 1044078980: goto L_0x00b3;
                case 1339155495: goto L_0x005b;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            r4 = 438614397(0x1a24b97d, float:3.406424E-23)
            java.lang.String r0 = "ۚۢۦۡۙۤۗۢ۠ۘۦ۠۟ۧۦۘۡۥۗۘۤۚۤۚۖۘ"
        L_0x0019:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -987887278: goto L_0x0037;
                case 656148526: goto L_0x0022;
                case 689687161: goto L_0x003a;
                case 965530405: goto L_0x0028;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0019
        L_0x0022:
            java.lang.String r0 = "ۡۨۨۘۗۛۢۘۥۧ۟ۢۖۘۖۢۦۘۢ۠ۜۦۢۥۘ"
            goto L_0x0005
        L_0x0025:
            java.lang.String r0 = "ۤ۠۫ۜۜۛ۬ۙۚۜۘ۠ۖ۬ۦۘۗۥۨۘۗۖۨۖ۠ۖۘۘۨۡۘ"
            goto L_0x0019
        L_0x0028:
            java.lang.CharSequence r0 = f1101b
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "۬ۘۘۘ۟ۢۖۦۤۖۘۙۤۚۨۨۥۘۥۗۥۘۧۤۤۧۥۜۘ۫ۦۥۘ"
            goto L_0x0019
        L_0x0037:
            java.lang.String r0 = "ۙ۟۬۟ۙۥۘۘۙۗۖۛۚۜ۫ۙ۟ۥۚۘ۠"
            goto L_0x0019
        L_0x003a:
            java.lang.String r0 = "ۗۙ۫ۘ۬۫۟ۙۢۗ۠ۛۙ۬ۙ"
            goto L_0x0005
        L_0x003d:
            r4 = -450176854(0xffffffffe52ad8aa, float:-5.042494E22)
            java.lang.String r0 = "ۡۘۧۘ۫ۦۥۡۤۗۦۧۨۡۙۚۥ۠ۖۘۜۛۦ۟۫ۨۘ"
        L_0x0042:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1569716173: goto L_0x0051;
                case -721938552: goto L_0x0022;
                case -176577099: goto L_0x004b;
                case 329461529: goto L_0x0058;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x0042
        L_0x004b:
            java.lang.String r0 = "ۘ۟ۤۜ۫ۖۙۤۛۨۡۜۢۚۘۚ۫ۙۤۚۨۚۥۘۧ۫ۗ"
            goto L_0x0042
        L_0x004e:
            java.lang.String r0 = "ۖ۠ۧ۠۫۠ۛۢ۠ۢۨۘۚ۫"
            goto L_0x0042
        L_0x0051:
            java.lang.CharSequence r0 = f1101b
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "ۡۡ۟ۖۛۨۤ۫ۤ۬ۙۘ۫ۡۜۡۦۘ"
            goto L_0x0042
        L_0x0058:
            java.lang.String r0 = "ۧۗۖۘ۫ۥۜۘۘۨۛۖۢ۠ۨۘۡۥۘۘۢۡ۫"
            goto L_0x0005
        L_0x005b:
            java.lang.String r3 = f1104e
            java.lang.String r0 = "۫ۙۘۘۡۦۧۧۢ۠ۖ۫ۚ۬۬ۖۘ۫ۗۛۤۚۘۙ"
            goto L_0x0005
        L_0x0060:
            r3.getClass()
            java.lang.String r0 = "۟ۨۜۤۖۖۘۤۨۜۘۧۜۥۦۘۙۢۙۚۘۨۧۘ"
            goto L_0x0005
        L_0x0066:
            r4 = 640674665(0x262feb69, float:6.103436E-16)
            java.lang.String r0 = "ۧۙۦۗۢۧ۟ۤۛۥۗۧۖۡۗۦ۫ۚۡۗ۟ۤ۟ۜۘۖ۫"
        L_0x006b:
            int r5 = r0.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1533756949: goto L_0x0085;
                case -26609236: goto L_0x007a;
                case -4334857: goto L_0x0088;
                case 402325580: goto L_0x0074;
                default: goto L_0x0073;
            }
        L_0x0073:
            goto L_0x006b
        L_0x0074:
            java.lang.String r0 = "ۤۜۡۙ۬ۤۤۡۥۚ۫۫۟ۧۤۚۨ۫ۜۦ۬"
            goto L_0x0005
        L_0x0077:
            java.lang.String r0 = "ۛۜۙ۠ۥۘۙ۬ۦۘ۟ۨ۠ۢۦۘۤۤۢ"
            goto L_0x006b
        L_0x007a:
            java.lang.String r0 = "in-y"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = "۠۬ۥۖۥ۠۠ۜۧۦ۫۠ۦ۫ۥۘۜۡۧ"
            goto L_0x006b
        L_0x0085:
            java.lang.String r0 = "ۢۡ۫ۚۚۗۨ۠ۘۘۚۨۖۘۢۙۨ"
            goto L_0x006b
        L_0x0088:
            java.lang.String r0 = "ۜۡۨۨۥۨۘۗۧۢۚ۬ۡۘۘ۟ۛ۫ۜ۠۠۫ۨۘ"
            goto L_0x0005
        L_0x008c:
            java.lang.CharSequence r0 = f1101b
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = f1102c
            okhttp3.Request r1 = getTranslation_Y_request(r0, r1)
            java.lang.String r0 = "ۚ۫ۙۜۡۗۦۦۥۘۙۨۛ۠ۚۖۜۗۖۜۛ۠۬ۜۧۛۚۛ"
            goto L_0x0005
        L_0x009c:
            okhttp3.OkHttpClient r0 = f1103d
            okhttp3.Call r0 = r0.newCall(r1)
            e.j r4 = new e.j
            r4.<init>()
            r0.enqueue(r4)
            java.lang.String r0 = "ۗۢۨۘ۠ۦۢۚ۫۟۬ۙ۟ۙۗۧ"
            goto L_0x0005
        L_0x00ae:
            throw r2
        L_0x00af:
            java.lang.String r0 = "ۗۢۨۘ۠ۦۢۚ۫۟۬ۙ۟ۙۗۧ"
            goto L_0x0005
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.YTranslate.a():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        r2 = "ۦ۫ۡ۫ۖۙۥۤۛۜ۠ۤۖۜ۟ۢۘۧۜ۫۫";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b() {
        /*
            r16 = 0
            r15 = 0
            r13 = 0
            r11 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r9 = 0
            r7 = 0
            r8 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r6 = 0
            java.lang.String r1 = "ۥۨۜۘۥۘ۟ۤۖۚ۬ۢۗ۬ۘ۬ۜۧۧۘۙ"
            r2 = r1
        L_0x0012:
            int r1 = r2.hashCode()
            r17 = 205(0xcd, float:2.87E-43)
            r18 = 1323581405(0x4ee43fdd, float:1.9146953E9)
            r1 = r1 ^ r17
            r1 = r1 ^ r18
            switch(r1) {
                case -2080949645: goto L_0x0023;
                case -1902113385: goto L_0x018f;
                case -1802032035: goto L_0x00c6;
                case -1768460255: goto L_0x00e9;
                case -1577968697: goto L_0x015d;
                case -1497911650: goto L_0x00f0;
                case -1148215454: goto L_0x0188;
                case -1089976377: goto L_0x00de;
                case -910085431: goto L_0x0037;
                case -770490775: goto L_0x00a8;
                case -650978488: goto L_0x0113;
                case -575632287: goto L_0x01be;
                case -570605552: goto L_0x0208;
                case -290533415: goto L_0x012f;
                case -194780429: goto L_0x020d;
                case 20099642: goto L_0x0119;
                case 295341604: goto L_0x005f;
                case 351314962: goto L_0x00d2;
                case 468355482: goto L_0x021c;
                case 477997720: goto L_0x00b4;
                case 519371794: goto L_0x00cc;
                case 646691969: goto L_0x0106;
                case 739763358: goto L_0x0201;
                case 831958017: goto L_0x01e3;
                case 949841014: goto L_0x01a6;
                case 957995943: goto L_0x01b8;
                case 986780450: goto L_0x0152;
                case 1139519468: goto L_0x0129;
                case 1173038107: goto L_0x00bf;
                case 1304852083: goto L_0x01c4;
                case 1317747411: goto L_0x00fc;
                case 1728444767: goto L_0x002c;
                case 1803137590: goto L_0x0083;
                case 2129721691: goto L_0x00f6;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0012
        L_0x0023:
            android.content.Intent r16 = new android.content.Intent
            r16.<init>()
            java.lang.String r1 = "ۛۥۘۘۥ۫ۗ۟ۡۥۘ۬ۘۦۘۤ۠ۘۘ۬ۥۢ۬۠ۤۗۤۙ"
            r2 = r1
            goto L_0x0012
        L_0x002c:
            java.lang.String r1 = "text/plain"
            r0 = r16
            r0.setType(r1)
            java.lang.String r1 = "۫۠ۙۗۘۨۖۚ۠ۛ۠ۥۘ۬ۦۨۘۨۢۜۦۚۜ۫ۙۨ"
            r2 = r1
            goto L_0x0012
        L_0x0037:
            r2 = 404674745(0x181ed8b9, float:2.0530438E-24)
            java.lang.String r1 = "ۡ۫ۚۧ۠ۡۘۖ۬ۡۘ۟ۦۨۨۘۘۛۢۖۨۜۢۙۖ۬۬ۖۡۘ"
        L_0x003c:
            int r17 = r1.hashCode()
            r17 = r17 ^ r2
            switch(r17) {
                case -508171959: goto L_0x006e;
                case -404669364: goto L_0x005b;
                case 137921188: goto L_0x004c;
                case 1675336317: goto L_0x0046;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x003c
        L_0x0046:
            java.lang.String r1 = "ۖۨۖۜ۫ۤۨۥۘۜۙ۠۫ۖۙ"
            goto L_0x003c
        L_0x0049:
            java.lang.String r1 = "۫۬ۥۛۡۚۜۚۢ۫ۚۦ۠۫ۘۥۥۤۤۧۥۘ"
            goto L_0x003c
        L_0x004c:
            java.lang.CharSequence r1 = f1101b
            java.lang.String r1 = r1.toString()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = "ۖۢۧ۫ۜۚۡۢ۫ۖۛ۫ۢۦۨ۬ۦۘ"
            goto L_0x003c
        L_0x005b:
            java.lang.String r1 = "ۖ۫ۜۡ۫۬ۖۡۧۨ۫ۙۧ۬ۡۘ۠ۡۦ"
            r2 = r1
            goto L_0x0012
        L_0x005f:
            r2 = 1342798079(0x500978ff, float:9.2256328E9)
            java.lang.String r1 = "ۖۛۗ۫ۧۜۨۘۜۢۨۦۘۥۢۖۡۙۥۚ۫۫"
        L_0x0064:
            int r17 = r1.hashCode()
            r17 = r17 ^ r2
            switch(r17) {
                case -1508780305: goto L_0x0075;
                case -906969043: goto L_0x007c;
                case 230288177: goto L_0x006e;
                case 2132951907: goto L_0x007f;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0064
        L_0x006e:
            java.lang.String r1 = "ۦ۫ۡ۫ۖۙۥۤۛۜ۠ۤۖۜ۟ۢۘۧۜ۫۫"
            r2 = r1
            goto L_0x0012
        L_0x0072:
            java.lang.String r1 = "ۘۤۨۤۢۥۖۚۙۛۘۚۡ۟ۤۘۘۢۦۥ"
            goto L_0x0064
        L_0x0075:
            java.lang.CharSequence r1 = f1101b
            if (r1 == 0) goto L_0x0072
            java.lang.String r1 = "ۨۧۚ۫ۤۥۘۜۛۨۘۢۥۥۘۡۜۛۛۥۥۘ۫۟ۥۥۛۥ۠ۧۜۘ"
            goto L_0x0064
        L_0x007c:
            java.lang.String r1 = "ۨۤۜۘۨۨۗۛۡۧۘ۬ۨۘۜۧۦۘ۟۟ۖۚ۠ۦۥۜ۠"
            goto L_0x0064
        L_0x007f:
            java.lang.String r1 = "ۙۡۤۢۢ۫ۘۢۦ۬ۛۖۛۛۖۘۙۛۦۘ۬۟ۦۡۗ۟"
            r2 = r1
            goto L_0x0012
        L_0x0083:
            r2 = -110827108(0xfffffffff964e99c, float:-7.4286365E34)
            java.lang.String r1 = "ۖۡۤۙۧۖۚۙۙۦۛ۫۟ۥۘ"
        L_0x0088:
            int r17 = r1.hashCode()
            r17 = r17 ^ r2
            switch(r17) {
                case -1705135301: goto L_0x009a;
                case -1629888909: goto L_0x00a5;
                case 472443050: goto L_0x0092;
                case 2058438653: goto L_0x0203;
                default: goto L_0x0091;
            }
        L_0x0091:
            goto L_0x0088
        L_0x0092:
            java.lang.String r1 = "ۢ۠ۧۗۡۜۘ۫ۘۤۘۧۛۧۜ"
            r2 = r1
            goto L_0x0012
        L_0x0097:
            java.lang.String r1 = "ۜ۫ۛ۬ۨۦۖ۫ۜۦۖۛۚۧۙۦۧ۟۫ۨۙۤۡۦ"
            goto L_0x0088
        L_0x009a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r17 = 23
            r0 = r17
            if (r1 < r0) goto L_0x0097
            java.lang.String r1 = "ۦۘۥۙ۬ۦۘ۠ۘۧۘ۟ۜۨۙ۠ۡۘۢ۫ۡۧۧ۟"
            goto L_0x0088
        L_0x00a5:
            java.lang.String r1 = "ۗۜۡۘۚۡۖۛ۟۟ۜۛۦۜ۠ۦۘ۠ۢۦۘ۫ۗۡۜۦ"
            goto L_0x0088
        L_0x00a8:
            java.lang.String r1 = "android.intent.action.PROCESS_TEXT"
            r0 = r16
            r0.setAction(r1)
            java.lang.String r1 = "ۨۛۡۖ۟۟ۡۛۘ۟ۧ۬ۜۥۘ۠۟ۖۘۨۘۘۙۛۥۥۙۡۘ"
            r2 = r1
            goto L_0x0012
        L_0x00b4:
            java.lang.CharSequence r1 = f1101b
            java.lang.String r15 = r1.toString()
            java.lang.String r1 = "ۘۗۥۘۧ۬ۗۘۙ۠۟ۙۗۜۨۚۢۧۢۡۡۘ"
            r2 = r1
            goto L_0x0012
        L_0x00bf:
            java.lang.String r13 = "android.intent.extra.PROCESS_TEXT"
            java.lang.String r1 = "ۥ۬ۢۥۙ۫ۙۢۦۘۖۖۛ۫ۤۖۛۥۡۤۛۢ"
            r2 = r1
            goto L_0x0012
        L_0x00c6:
            java.lang.String r1 = "ۙۛۜۘ۬۬ۘۦۜۜۛۡ۠ۥۛ۠ۨۤۤۚۘۧۘۥۜۨۘ"
            r2 = r1
            r14 = r15
            goto L_0x0012
        L_0x00cc:
            java.lang.String r1 = "ۛ۬ۛۥۘۗۗۤۖۘ۠ۨۛۡۛۜۘ"
            r2 = r1
            r12 = r13
            goto L_0x0012
        L_0x00d2:
            java.lang.String r1 = "android.intent.action.SEND"
            r0 = r16
            r0.setAction(r1)
            java.lang.String r1 = "ۗۥۖۜۜۡۘۡۙۢۛ۟ۚۡۨۧۛ۟ۜۘ۬ۦۘۤ۫ۢۧۜۨۘ"
            r2 = r1
            goto L_0x0012
        L_0x00de:
            java.lang.CharSequence r1 = f1101b
            java.lang.String r11 = r1.toString()
            java.lang.String r1 = "ۚۙ۫ۜۙۛ۬ۘۨۙۨۡۘۛۚۡۘۤۤۡۢۥۥۘ"
            r2 = r1
            goto L_0x0012
        L_0x00e9:
            java.lang.String r10 = "android.intent.extra.TEXT"
            java.lang.String r1 = "۬۬ۖۡۦۖۜ۫ۦۡۛۨۘۨ۠۬"
            r2 = r1
            goto L_0x0012
        L_0x00f0:
            java.lang.String r1 = "ۢۨۘۛۘۥۘۚۤۡۘۧۖۚۖۦۜۙۛۦۢۚۛۤۨ۠ۨۧۥۘ"
            r2 = r1
            r12 = r10
            goto L_0x0012
        L_0x00f6:
            java.lang.String r1 = "ۜۛۘۤۡۘۘۦۜۜۘۢ۫ۡۖۡۢۘۜۢۥۢۦۘۘۧۘ"
            r2 = r1
            r14 = r11
            goto L_0x0012
        L_0x00fc:
            r0 = r16
            r0.putExtra(r12, r14)
            java.lang.String r1 = "ۖۥۖۛۖۘۨۥۢۤۢۘۘۦۨۦۘۦۥ۫ۚۤۥۧۡۛ"
            r2 = r1
            goto L_0x0012
        L_0x0106:
            android.content.Context r1 = com.obwhatsapp.yo.yo.getCtx()
            android.content.pm.PackageManager r9 = r1.getPackageManager()
            java.lang.String r1 = "۠۫ۜۚۦۦۖ۫۠۬۫ۚۖۗۨ۬ۖ"
            r2 = r1
            goto L_0x0012
        L_0x0113:
            r7 = 0
            java.lang.String r1 = "ۧۚۦۥۘۜۦ۠ۤۜۨۘ۬ۙۤۢۜۧۘ"
            r2 = r1
            goto L_0x0012
        L_0x0119:
            r1 = 0
            r0 = r16
            java.util.List r1 = r9.queryIntentActivities(r0, r1)
            java.util.Iterator r8 = r1.iterator()
            java.lang.String r1 = "۫ۢۦۘۙۛۡۡ۟ۘۜۧ۟۫۫۬"
            r2 = r1
            goto L_0x0012
        L_0x0129:
            java.lang.String r1 = "ۗۚۜۜ۠ۨۚۘۨۘۗۗۜۘۡۧۘۢۘ۠ۧۧۜۘ"
            r2 = r1
            r6 = r7
            goto L_0x0012
        L_0x012f:
            r2 = 343719506(0x147cbe52, float:1.2760283E-26)
            java.lang.String r1 = "۟ۚۨۗۨ۠ۚۦۤ۠۬ۦۥۧۚۧۨۛ"
        L_0x0134:
            int r17 = r1.hashCode()
            r17 = r17 ^ r2
            switch(r17) {
                case -2059198814: goto L_0x0212;
                case -1303121646: goto L_0x013e;
                case -1133315291: goto L_0x014d;
                case 302270132: goto L_0x0144;
                default: goto L_0x013d;
            }
        L_0x013d:
            goto L_0x0134
        L_0x013e:
            java.lang.String r1 = "۟ۙۥ۟ۦ۫ۦ۟ۗ۠۠ۥۙۡۛ۟ۡۖۘ"
            goto L_0x0134
        L_0x0141:
            java.lang.String r1 = "۟۟ۘۛ۠ۖۘۥۦ۟۠ۙۗۗۡۚۢ۬۫"
            goto L_0x0134
        L_0x0144:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0141
            java.lang.String r1 = "ۛۥۧۜۢ۠ۚۢۖۚۘ۬ۥ۬ۢۤۗۗ۟۠۠ۙ"
            goto L_0x0134
        L_0x014d:
            java.lang.String r1 = "ۘۗۖۨۘۡۘۧۙ۫ۗۘۥۤۛۘۘۗۗۚۥ۬ۦۘۜۛ"
            r2 = r1
            goto L_0x0012
        L_0x0152:
            java.lang.Object r1 = r8.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            java.lang.String r2 = "ۘ۠ۘۘۛۡۧۘۚۨۧۤۦۧۘ۫ۙۜۘ"
            r5 = r1
            goto L_0x0012
        L_0x015d:
            r2 = 648732490(0x26aadf4a, float:1.1856642E-15)
            java.lang.String r1 = "ۡۘۙ۟۟ۥۘۤ۠ۘ۟ۛۗۧ۠ۦۨۖ۠"
        L_0x0162:
            int r17 = r1.hashCode()
            r17 = r17 ^ r2
            switch(r17) {
                case -1879820397: goto L_0x0174;
                case -1834308262: goto L_0x016c;
                case 770942153: goto L_0x0185;
                case 787213842: goto L_0x020d;
                default: goto L_0x016b;
            }
        L_0x016b:
            goto L_0x0162
        L_0x016c:
            java.lang.String r1 = "ۥۥۛۤ۫ۦۖۙۜۘۙۦۤۥۦۦۨ۟ۜۘۦ۫ۥۘ۟ۡۢۦۨۘ"
            r2 = r1
            goto L_0x0012
        L_0x0171:
            java.lang.String r1 = "ۧ۬ۤۦۚۡۘۘۤ۬ۚۜۡۙ۠ۨۘۢ۫ۡۦ۠ۛۚ۠ۧ"
            goto L_0x0162
        L_0x0174:
            android.content.pm.ActivityInfo r1 = r5.activityInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r17 = "com.google.android.apps.translate"
            r0 = r17
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L_0x0171
            java.lang.String r1 = "ۖۗۨۘ۟ۜۚۥۜ۬ۤۖۡۘ۫ۤۘۘۧۦۙۙۥۦۘۢۖۤ"
            goto L_0x0162
        L_0x0185:
            java.lang.String r1 = "ۗۙۡۢ۫ۚۜۢۗۖۤ۬ۦۢۚۛۥۙۦۜۖ"
            goto L_0x0162
        L_0x0188:
            android.content.pm.ActivityInfo r4 = r5.activityInfo
            java.lang.String r1 = "ۗۡۧۘۘۜۙۨۨ۫ۥ۟۟ۨۧۦۘۨ۠۟۠ۜۚۜ۟ۤۚۜ"
            r2 = r1
            goto L_0x0012
        L_0x018f:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = r4.packageName
            java.lang.String r0 = r4.name
            r17 = r0
            r0 = r17
            r1.<init>(r2, r0)
            r0 = r16
            r0.setComponent(r1)
            java.lang.String r1 = "ۜۢۥۘۛۥۥۛۨ۫ۢ۬ۗ۟ۡۥۘ"
            r2 = r1
            goto L_0x0012
        L_0x01a6:
            java.lang.ref.WeakReference r1 = f1100a
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = r16
            r1.startActivity(r0)
            java.lang.String r1 = "ۡۨۡۘ۫ۖۛ۟ۧۖۘۦۡۚۥۥۚۙۖۨۘ۟۫ۤۢۖۥۘۖۨۤ"
            r2 = r1
            goto L_0x0012
        L_0x01b8:
            r3 = 1
            java.lang.String r1 = "ۡۡ۫۫ۦۜۙۤۤۜۚۥۘۛۤ۫ۢۦۜۗۚۤ۟ۚۘۥۧۙ"
            r2 = r1
            goto L_0x0012
        L_0x01be:
            java.lang.String r1 = "ۤۤۚۢ۫۟ۤ۬ۥۘۙۡۘۤۚۖۤۤۜۘ"
            r2 = r1
            r6 = r3
            goto L_0x0012
        L_0x01c4:
            r2 = -2118216645(0xffffffff81be943b, float:-7.000768E-38)
            java.lang.String r1 = "ۙۖۘۘۡۜۦۛۡ۬ۧۖۢ۟ۜۘ"
        L_0x01c9:
            int r17 = r1.hashCode()
            r17 = r17 ^ r2
            switch(r17) {
                case 811694160: goto L_0x0217;
                case 976797327: goto L_0x01d3;
                case 1140769563: goto L_0x01db;
                case 1885707313: goto L_0x01e0;
                default: goto L_0x01d2;
            }
        L_0x01d2:
            goto L_0x01c9
        L_0x01d3:
            java.lang.String r1 = "ۦۖۚۡۘۚۧ۟ۖۘۗۘۗۦ۬ۚ"
            r2 = r1
            goto L_0x0012
        L_0x01d8:
            java.lang.String r1 = "ۘۧۡۘۦۡۙۛۙۤۧۘۗۨۛ"
            goto L_0x01c9
        L_0x01db:
            if (r6 != 0) goto L_0x01d8
            java.lang.String r1 = "ۡۡۡۤ۟ۗۤۡۧ۟ۘۢۢۘۖۘۛۥۦ"
            goto L_0x01c9
        L_0x01e0:
            java.lang.String r1 = "۟ۢۨۘۨ۠ۙۘۗۘۧ۟ۘۙ۫ۧۡ۠ۗۚۘۗۗۦۤ"
            goto L_0x01c9
        L_0x01e3:
            java.lang.ref.WeakReference r1 = f1100a
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r2 = "google_trans_not"
            java.lang.String r2 = com.obwhatsapp.yo.yo.getString((java.lang.String) r2)
            r17 = 1
            r0 = r17
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r0)
            r1.show()
            java.lang.String r1 = "۫ۙۦۥۡۛۙۙۘۙۖۘۗۤۡ"
            r2 = r1
            goto L_0x0012
        L_0x0201:
            r1 = 0
            throw r1
        L_0x0203:
            java.lang.String r1 = "ۚۗ۬ۛۥۨۘۖۤۜۘۖۘۤۚۘۘۘۜۖۡۘۡۘۨۗۛۦۘ۠ۨۧۘ"
            r2 = r1
            goto L_0x0012
        L_0x0208:
            java.lang.String r1 = "ۜۛۘۤۡۘۘۦۜۜۘۢ۫ۡۖۡۢۘۜۢۥۢۦۘۘۧۘ"
            r2 = r1
            goto L_0x0012
        L_0x020d:
            java.lang.String r1 = "ۗۚۜۜ۠ۨۚۘۨۘۗۗۜۘۡۧۘۢۘ۠ۧۧۜۘ"
            r2 = r1
            goto L_0x0012
        L_0x0212:
            java.lang.String r1 = "۠ۘۥۢۦ۬ۜۤ۟ۡۤۡۘۡ۟۟۟ۥۢۘۜۦۘۜۖۖۘ"
            r2 = r1
            goto L_0x0012
        L_0x0217:
            java.lang.String r1 = "۫ۙۦۥۡۛۙۙۘۙۖۘۗۤۡ"
            r2 = r1
            goto L_0x0012
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.task.YTranslate.b():void");
    }

    public static OkHttpClient getTranslation_Y_client() {
        String str = "ۘۨ۠۫۟ۖۢ۫ۘۢۢۢۚۙۤۘۙۗۨۖۜۘۦۚۗ";
        TimeUnit timeUnit = null;
        OkHttpClient.Builder builder = null;
        c cVar = null;
        while (true) {
            switch ((str.hashCode() ^ 260) ^ 1721492682) {
                case -1884886912:
                    timeUnit = TimeUnit.SECONDS;
                    str = "۠ۜۜۘۨۥۚ۟ۖۦۧ۫۬ۤۘۚۡۦ";
                    break;
                case -1833701373:
                    return builder.connectTimeout(7, timeUnit).readTimeout(7, timeUnit).build();
                case -786796243:
                    str = "۟ۚۜۘ۟ۖۗۨۜۛ۬ۢۥۘۜۛۚ۬ۦۢۧۦۧۖۛۙ";
                    cVar = new c();
                    break;
                case 1808872782:
                    str = "ۗۗۦۘ۬۟ۧ۟ۥۖۦ۠ۢۨۛۗۘۜ";
                    builder = new OkHttpClient.Builder().addInterceptor(cVar);
                    break;
            }
        }
    }

    public static Request getTranslation_Y_request(String str, String str2) {
        String str3 = "ۗۢۤۖۚۗۢۜۦۘ۟ۦۖۜۦۘۤۗ";
        FormBody formBody = null;
        String str4 = null;
        StringBuilder sb = null;
        String str5 = null;
        while (true) {
            switch ((str3.hashCode() ^ 513) ^ -2107100700) {
                case -1633567491:
                    str3 = "۠ۘۘۨ۫ۜۘۚۤۦۘ۬۟ۦۨۘ";
                    break;
                case -1344589025:
                    str3 = "ۚۨۖۢۡ۬۫ۚۚۡۘۦۘۛۤۜ";
                    sb = new StringBuilder("https://translate.yandex.net/api/v1/tr.json/translate?ucid=");
                    break;
                case -201562542:
                    sb.append("&srv=android&format=text");
                    str3 = "۫ۙۡۘۜۤۙۤۦۦۘۜۤۗۗۜۘۚۢ۟ۧۘ۬ۥۦۜۘۧۘۦۘ";
                    break;
                case 811332397:
                    str3 = "ۜ۬ۛ۟ۖۘ۬ۤۡۤ۟ۚ۫ۛۖۘ۠ۛۗۜ۬";
                    str4 = sb.toString();
                    break;
                case 1048657311:
                    str3 = "۟ۤ۠ۤۨۛ۬۟ۡۘۨۚۡۘۨۧۜۥ۬ۨۘ۟";
                    str5 = UUID.randomUUID().toString().replace("-", "");
                    break;
                case 1171161773:
                    str3 = "۠ۥۡۧۤ۫ۤ۠۫۬ۙ۟ۥۗۡ";
                    break;
                case 1311213249:
                    sb.append(str5);
                    str3 = "ۛ۫ۥۘۙۙ۫ۖۖۘۜ۫ۡۚۢۦۘۜۘۗۖۖ۫ۧ۠ۦۘ";
                    break;
                case 1668823403:
                    formBody = new FormBody.Builder().add("text", str).add("lang", str2).build();
                    str3 = "ۦۚۛۧ۫ۘۘ۫ۦ۠ۚۤۡۘۗ۬ۚۦۦۥۘۥۡۜ";
                    break;
                case 2113127270:
                    return new Request.Builder().url(str4).post(formBody).build();
            }
        }
    }

    public static void init() {
        String str = null;
        String str2 = "ۛۜۚۢۘۦۘۥ۫ۢ۫ۗۤ۟ۚۖۗۚ۫ۤۗۦ";
        while (true) {
            switch ((str2.hashCode() ^ 818) ^ 1463889516) {
                case -1896285650:
                    return;
                case -1794015789:
                    f1104e = str;
                    str2 = "ۡۨۤ۬۬ۦۘۗ۫ۛ۟ۛۗۦ۠۬ۦۨۚۦۙۘۘ۟";
                    break;
                case -1713741839:
                    str = shp.getStringPriv("inconvo_trans_option", "in-y");
                    str2 = "ۧ۠ۖۘۡۗۖ۫۬۟۠ۡۨۖۨۙۥۨۧۘ";
                    break;
                case -331944028:
                    f1103d = getTranslation_Y_client();
                    str2 = "ۥۙ۬۟ۡۡۦۡ۬ۧ۠ۤۜ۫";
                    break;
                case 306614941:
                    str.getClass();
                    str2 = "ۤۦۖۛ۬ۨۘۤۙۥۛۛۢۦۡۥ";
                    break;
                case 713013149:
                    String str3 = "ۡۢۖۙۛۘۨ۬ۢۤ۫ۗۗۛ۫۟ۘۢ۫۬ۖۘ۬۟ۡ";
                    while (true) {
                        switch (str3.hashCode() ^ -1522208373) {
                            case -253547363:
                                if (str.equals("in-y")) {
                                    str3 = "ۤ۬ۖۘۗۖۖۘۦۦۧۛۜۘۢۜۘۨۤۛۢۥۙ";
                                    break;
                                } else {
                                    str3 = "ۚۛۡۘۤۥۘۘ۬ۘۤ۬ۜۡۘۘۤۜۘۧ۟ۗ";
                                    break;
                                }
                            case -152487878:
                                str3 = "ۧۖۙۛۜۜۘۛۨۦۘۧۤۤۥۛۜۢ۫ۖۘۦۘۜۦۖۡۜ۟";
                                break;
                            case 743327345:
                                str2 = "۟ۛۨۘۛۥۖۘۥۜۖۘۛۤۙۗۖۙۖۜۨۘۨۛ";
                                continue;
                            case 1864952177:
                                str2 = "ۡۡۖ۟ۛۙۙۗۜۙۖۚۢۥۦۘ۫۬۠ۧۙۤۦۗ۬۫ۘۘۘ";
                                continue;
                        }
                    }
                    break;
                case 747588759:
                    f1105f = shp.getStringPriv("trans_def_to", "all");
                    str2 = "۫ۡ۠ۥۧۗۗۡۘۘۜ۬ۖۗۘ۫ۧۛۘ۬ۚۨ";
                    break;
                case 1175352922:
                    str2 = "ۥۙ۬۟ۡۡۦۡ۬ۧ۠ۤۜ۫";
                    break;
            }
        }
    }

    public static void translte(CharSequence charSequence, Activity activity) {
        Runnable d0Var;
        String str = "ۦ۬ۗۚۙۛۚۗۜۘ۠ۤۛۡۙۧۜۙۦۜ۠۫";
        while (true) {
            switch (str.hashCode() ^ -2115289358) {
                case -1078853623:
                    return;
                case -216727896:
                    if (charSequence == null) {
                        str = "ۤ۬ۤۤۡۘۖۘۖ۠ۗ۟ۧۦۜۘۚۥۧۘۡۙۧۛ۬ۘۗۚ۠";
                        break;
                    } else {
                        str = "ۗۙۡ۬ۧۙۧ۫ۨۘۘۗ۠ۛۙۡۗۘۧۘ";
                        break;
                    }
                case -153900299:
                    str = "۬ۦۥۥۤ۠ۖ۟ۧۘۥۛۙ۠ۛۜۙۛۗۦۨ";
                    break;
                case 194069275:
                    String str2 = "ۦ۟ۨۛ۫ۥ۬ۦ۫ۤۖۘۛۗۗ";
                    while (true) {
                        switch (str2.hashCode() ^ -1810597590) {
                            case -2043750230:
                                if (charSequence.length() >= 1) {
                                    str2 = "ۖۤۙۥۦۥۘ۠ۦۜ۠ۛۦۘۥ۫ۖ۫ۥۡۘۘ۟۠ۖۤۚۖۛۨۘ";
                                    break;
                                } else {
                                    str2 = "ۖ۟ۦۘۤۚ۟۠ۥۦ۟ۜ۫ۗۜۜ۬۟ۥۚ۠ۗ۫ۙ";
                                    break;
                                }
                            case -1190606525:
                                str2 = "ۙ۠۬ۚ۟ۘۢۜۘ۬ۥ۠ۙۖۤۗ۬ۥۘۥۚۦۙ۠۬ۤۗۡۘ";
                                break;
                            case 201933071:
                                f1100a = new WeakReference(activity);
                                f1101b = charSequence;
                                String str3 = "ۙ۬ۘۨۤۡۘۛۡۜۖۘ۟ۘ۟ۥۥۡۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 2093056621) {
                                        case -1567185530:
                                            String str4 = "ۡۧۨۘ۫ۢۤۡ۫ۡۡۜۢۨ۠ۥۢۖۧۘۚۨۥ۬ۙ";
                                            while (true) {
                                                switch (str4.hashCode() ^ -1493741451) {
                                                    case -2093421172:
                                                        if (!f1105f.equals("all")) {
                                                            str4 = "ۘ۫ۡۘۨۦۧۘۗ۬ۡۘ۟ۗۖۘۗۧۥۘ";
                                                            break;
                                                        } else {
                                                            str4 = "۬ۢۦۘ۫ۜۘۙۢۡۦۘۜ۟ۥۘ";
                                                            continue;
                                                        }
                                                    case -664400437:
                                                        f1102c = f1105f;
                                                        d0Var = new d0(6);
                                                        break;
                                                    case -392720553:
                                                        str4 = "۫ۢۖ۬ۦۡۢۛۤۤ۫ۗ۫ۤۘۘۤۖۖۘۙۧۡۛۘۢۢۗ۟";
                                                        continue;
                                                    case 1605707444:
                                                        String[] stringArray = yo.getCtx().getResources().getStringArray(yo.getID("translation_to_preference", "array"));
                                                        stringArray[0] = yo.getString("Make_your_selection");
                                                        String[] stringArray2 = yo.getCtx().getResources().getStringArray(yo.getID("translation_to_preferenceVals", "array"));
                                                        stringArray2[0] = Language.ENGLISH;
                                                        CustomAlertDialogBuilder customAlertDialogBuilder = new CustomAlertDialogBuilder(activity);
                                                        customAlertDialogBuilder.setItems((CharSequence[]) stringArray, (DialogInterface.OnClickListener) new d(stringArray2, 9));
                                                        d0Var = new b(customAlertDialogBuilder, 0);
                                                        break;
                                                }
                                            }
                                            activity.runOnUiThread(d0Var);
                                            return;
                                        case -742084976:
                                            if (!f1104e.equals("gapp")) {
                                                str3 = "ۧ۫ۧۚۗۜۘ۠ۦۘۥ۠۟ۚۨۖۘۘۗۡۙۖۘۥۛۘ";
                                                break;
                                            } else {
                                                str3 = "ۜۗۤۚۧۖۘ۟ۖۦۜۛۤۢ۠ۥ۫ۦۖۦۙۡۖۡۦۘ";
                                                break;
                                            }
                                        case 84081924:
                                            str3 = "۫ۧۙۢۜۘ۫ۜۙۗۛۗ۟ۢ۠ۚۘۙۖۘۖ۫ۖۘ";
                                            break;
                                        case 1521638702:
                                            Activity activity2 = (Activity) f1100a.get();
                                            String str5 = "ۢۛۦۘۧۥۦۖۛۡ۬ۤ۬ۨ۬۫ۥۜۘۜۨۛ";
                                            while (true) {
                                                try {
                                                    switch (str5.hashCode() ^ -2042260328) {
                                                        case -799312456:
                                                            if (!app.checkInternetNow()) {
                                                                str5 = "۫ۚ۟ۧۦ۫ۚۚ۠ۦۡۧۧۖۨۘۗۨۢۛۗۜۘ";
                                                                break;
                                                            } else {
                                                                str5 = "ۥۖۢۢ۬ۘ۫ۘۗۧۛۤۜ۫ۨ۬۬ۢۨۗۧۦۛ۫";
                                                                break;
                                                            }
                                                        case -670367875:
                                                            Toast.makeText(activity2, yo.getString("processing"), 0).show();
                                                            b();
                                                            return;
                                                        case -651590470:
                                                            Toast.makeText(activity2, yo.getString("network_required"), 0).show();
                                                            return;
                                                        case 11645426:
                                                            str5 = "ۦۜۜۛ۟ۥۥۛۛۙۚۨۦ۬ۨ";
                                                            break;
                                                    }
                                                } catch (Exception e2) {
                                                    Toast.makeText(activity2, yo.getString("Translating_Failed"), 0).show();
                                                    return;
                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 831555196:
                                return;
                        }
                    }
                    break;
            }
        }
    }
}
