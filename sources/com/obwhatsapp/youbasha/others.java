package com.obwhatsapp.youbasha;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.r;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.task.utils;
import java.io.File;

public abstract class others {

    /* renamed from: a  reason: collision with root package name */
    public static Drawable f1053a;

    /* renamed from: b  reason: collision with root package name */
    public static PorterDuffColorFilter f1054b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f1055c = yo.getID(Deobfuscator$app$Custom.getString(-19665000955329L), Deobfuscator$app$Custom.getString(-19733720432065L));

    /* renamed from: d  reason: collision with root package name */
    public static final int f1056d = yo.getID(Deobfuscator$app$Custom.getString(-19746605333953L), Deobfuscator$app$Custom.getString(-19879749320129L));

    /* renamed from: e  reason: collision with root package name */
    public static final int f1057e = yo.getID(Deobfuscator$app$Custom.getString(-19892634222017L), Deobfuscator$app$Custom.getString(-19991418469825L));

    /* renamed from: f  reason: collision with root package name */
    public static final int f1058f = yo.getID(Deobfuscator$app$Custom.getString(-20004303371713L), Deobfuscator$app$Custom.getString(-20068727881153L));

    /* renamed from: g  reason: collision with root package name */
    public static final int f1059g = yo.getID(Deobfuscator$app$Custom.getString(-20081612783041L), Deobfuscator$app$Custom.getString(-20141742325185L));

    /* renamed from: h  reason: collision with root package name */
    public static final int f1060h = yo.getID(Deobfuscator$app$Custom.getString(-20154627227073L), Deobfuscator$app$Custom.getString(-20279181278657L));
    public static String homeBK_path;

    /* renamed from: i  reason: collision with root package name */
    public static final int f1061i = yo.getID(Deobfuscator$app$Custom.getString(-20292066180545L), Deobfuscator$app$Custom.getString(-20519699447233L));

    static {
        String str = "ۗۘ۟ۛ۬ۨ۟ۗۦۘۙۧ۬ۤ۟ۙۢۘ۠ۨۥۘۦۦ۬ۙۚ";
        while (true) {
            switch ((str.hashCode() ^ 77) ^ 1112856294) {
                case -2014771521:
                    str = "ۧۡۖۘۜ۫ۨۘۥ۠ۜ۠۬ۛۤۜ۠";
                    break;
                case -1985793117:
                    str = "۟۠ۗۡۘۡ۬ۤۡۘۤ۟ۢۤۢۨۘ۟ۙۜۘ";
                    break;
                case 16188596:
                    str = "ۥۛۙ۫ۖۡۡۗۘۘۨۥ۟۫ۤۘۚۡۡۘۘۨۥۘ۬ۢۡۥۖۘ";
                    break;
                case 648439011:
                    str = "ۦۛۦۘۗۜۖۗۡۘۖۡۜ۫ۦۙۥۦۦ";
                    break;
                case 1008949138:
                    str = "ۢ۫ۛ۟۠ۤۚ۟ۦۘۥۡۚۚۗۗۖ۫ۡ";
                    break;
                case 1497268671:
                    str = "ۢۙ۠۟ۤۤ۫ۡۡۘۖۘۜۘۢۧۜۘۧۗۚ";
                    break;
                case 1784758915:
                    return;
                case 2132757768:
                    str = "ۨۥ۬ۛۨۜۘۢۖۢۖۜ۬ۡۡ۫۫ۧ۫";
                    break;
            }
        }
    }

    public static void MainBKC(View view) {
        String str = "ۙۙۦۖ۬ۙۢۡۖۨۜۜۙۢۨ۟۟ۛۘۢۦۙۤۦۘ";
        while (true) {
            switch (str.hashCode() ^ -1603206962) {
                case -1324086191:
                    String str2 = "ۤۛۡ۬ۙۨۘ۬ۖۚۜۧۦۘۥ۟ۤۖ۬ۦۘۘ۟۫ۥۖۧۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -446206591) {
                            case -1107367685:
                                if (!shp.getBoolean(Deobfuscator$app$Custom.getString(-17852524756417L))) {
                                    str2 = "ۛۘۘۜۚ۬۫ۨۘ۬۟ۦۘۛ۫ۗ۬ۛ۫";
                                    break;
                                } else {
                                    str2 = "ۤۧ۫۠۠ۛۤ۠ۤۖۨۘ۠ۙۥۘ۠ۛۚۚۙۘۚۙۖۘۘۗۤ";
                                    break;
                                }
                            case -1008056381:
                                String string = Deobfuscator$app$Custom.getString(-17916949265857L);
                                String str3 = "ۗۖ۟ۙۗۢۤۡۥۚۢ۠ۨۚ";
                                while (true) {
                                    switch (str3.hashCode() ^ -1454450858) {
                                        case -376262287:
                                            view.setBackgroundColor(Color.parseColor(Deobfuscator$app$Custom.getString(-17985668742593L)));
                                            return;
                                        case 970530969:
                                            String str4 = "ۧۖۗۚۡۧۜ۫ۜۥ۟ۥ۫ۗ۟۟ۤۡۘۚۖ۫۠ۧۚ";
                                            while (true) {
                                                switch (str4.hashCode() ^ -32278091) {
                                                    case -258024424:
                                                        view.setBackground(shp.getGradientDrawable(string));
                                                        return;
                                                    case -255902296:
                                                        if (!shp.getIsGradiet(string)) {
                                                            str4 = "ۙۗۜۙ۫ۜۘ۬۫ۗ۟ۜۦۘۚ۫ۛۖۡۖ۬";
                                                            break;
                                                        } else {
                                                            str4 = "ۢۖۤۙۗ۠ۖۚۦۘۛۜ۠ۨۜۢۡۥۡ۬ۨۜۚ";
                                                            break;
                                                        }
                                                    case 968865125:
                                                        view.setBackgroundColor(getColor(string, ColorStore.getPrimarySurfaceColor()));
                                                        return;
                                                    case 1835605781:
                                                        str4 = "ۗۜۗ۬۟ۜۦۘۥۖۛۦۘۢۜۚ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 1297132071:
                                            str3 = "ۡۘ۠ۧۘۘۨۘۢۜ۬ۤۘ۬ۥۘ";
                                            break;
                                        case 1458002288:
                                            if (!yo.start_bl()) {
                                                str3 = "ۥ۫ۦ۬ۢۥۥۜۘۘۡۨۛۥۤۦۘۙۤۙ";
                                                break;
                                            } else {
                                                str3 = "ۗۖۦۘۡ۫ۚۨ۟ۗۧۚۜۘۜ۫ۦۘ";
                                                break;
                                            }
                                    }
                                }
                                break;
                            case -218124948:
                                str2 = "ۚۥۦۚۜۧۙۖ۫۠ۚۜۘۤۧ۟ۙ۟۫ۨۧ";
                                break;
                            case 172720035:
                                String str5 = "ۦۨۜ۬ۦۛۗ۠ۦۡۜۘۘۦۡۧ۟ۦۛۛۜۘۙ۬ۢ";
                                while (true) {
                                    switch (str5.hashCode() ^ -1289072116) {
                                        case -1782556685:
                                            return;
                                        case -466475777:
                                            String str6 = "ۚۛۥۦۡۘۥۜۛ۫ۙۜۘۙۧۦۦۖۧۘ";
                                            while (true) {
                                                try {
                                                    switch (str6.hashCode() ^ 1747982361) {
                                                        case -1202172417:
                                                            Drawable colorDrawable = new ColorDrawable(-1);
                                                            File file = new File(homeBK_path);
                                                            String str7 = "ۨ۟ۙۥ۟ۚۢۛۦۦۦۦۘۘۡۘۗۘۨۘۤ۬ۥۘۖ۬ۥ";
                                                            while (true) {
                                                                switch (str7.hashCode() ^ -1561993668) {
                                                                    case -1523702023:
                                                                        colorDrawable = utils.buffWallp(homeBK_path, colorDrawable);
                                                                        break;
                                                                    case -815209384:
                                                                        break;
                                                                    case 998892201:
                                                                        if (file.exists()) {
                                                                            str7 = "ۦۛ۟ۤۙۘۘۥۡۧۘۤۧۥۚۚۗ";
                                                                            break;
                                                                        } else {
                                                                            str7 = "ۚۡۛۤۛۜۘۥۘۚ۫۟ۧۜۚۡ۟ۚۘۥ۠ۜۘ";
                                                                            continue;
                                                                        }
                                                                    case 2123682749:
                                                                        str7 = "ۡ۠ۨۘ۬ۘۥۘ۟ۢۢۜۦ۫۫ۡۘۢۖۙۦۚۖۘۜۚ۬";
                                                                        continue;
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                            f1053a = colorDrawable;
                                                            break;
                                                        case -523351459:
                                                            if (f1053a == null) {
                                                                str6 = "۟ۢۥۘۚ۫۫ۢ۫ۘۘۗۘۢۙۥۘ۠ۛۨۦۜۘۙ۫ۙ";
                                                                break;
                                                            } else {
                                                                str6 = "۫ۦۦ۟ۜ۟ۦۛۛۧ۬ۦۘ۠ۖۡۘۤۧۦۢۜ۫ۤۢۙ۫ۚ۫";
                                                                continue;
                                                            }
                                                        case 488638683:
                                                            break;
                                                        case 599375939:
                                                            str6 = "ۨۚۜۙ۬ۡۛۛۦ۫ۨۖۤۜۚ۠ۛ۠ۨۛۘۙۖۛۥۖۖۘ";
                                                            continue;
                                                        default:
                                                            continue;
                                                    }
                                                } catch (Exception e2) {
                                                }
                                            }
                                            view.setBackground(f1053a);
                                            view.setTag(Deobfuscator$app$Custom.getString(-17899769396673L));
                                            return;
                                        case 871922045:
                                            if (view.getTag() != null) {
                                                str5 = "ۚۚۨۡۥۧ۠ۗۢۦ۟ۖۘ۫۠ۚۨۨۘۘۛۚۨۘۚ۬ۛۦ۬ۥ";
                                                break;
                                            } else {
                                                str5 = "ۡ۠ۚ۬ۡۥۨۨۨۘۦ۟۬ۛۚۖۘۗۜۦۘ";
                                                break;
                                            }
                                        case 1372566634:
                                            str5 = "۬ۤۥۘۤۧۘۘۢۥۨۘۘ۠ۜۘۜ۬ۥۘۖ۟ۦۘۖۛۜۙۥۥۘ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case -240613381:
                    str = "ۛ۬ۖۖ۟ۡۨۢ۟ۨ۠ۜۘۢۨۖ";
                    break;
                case -219678879:
                    if (view != null) {
                        str = "ۧۗۥۘۤۥ۬ۘ۫ۡ۫ۜ۬ۢۢۚۖۚۡۘۡۥۤۨۢۙ";
                        break;
                    } else {
                        str = "ۖۨۚ۬ۡۥۘۖۙۨۘۗۜۥۘۗ۫ۡۘۦۖ۫";
                        break;
                    }
                case 511151524:
                    return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C005402i ModContPick(X.C005402i r5) {
        /*
            r4 = -11
            r0 = -17564761947585(0xfffff006629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)     // Catch:{ Exception -> 0x0058 }
            r2 = 716124039(0x2aaf2f87, float:3.1119223E-13)
            java.lang.String r0 = "ۛۘۢۧۡۖۘ۠ۢۨۢۧۖۘۢۛۡۘۙۗۖۘۤۧۗۘ۬ۤۜۤ"
        L_0x0010:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0058 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1905623515: goto L_0x002d;
                case 1025089831: goto L_0x0019;
                case 1119727271: goto L_0x0024;
                case 1784816251: goto L_0x0030;
                default: goto L_0x0018;
            }     // Catch:{ Exception -> 0x0058 }
        L_0x0018:
            goto L_0x0010
        L_0x0019:
            android.graphics.drawable.GradientDrawable r0 = com.obwhatsapp.yo.shp.getGradientDrawable(r1)     // Catch:{ Exception -> 0x0058 }
            r5.A0D(r0)     // Catch:{ Exception -> 0x0058 }
        L_0x0020:
            return r5
        L_0x0021:
            java.lang.String r0 = "۟ۥۨۘۘۦۤ۫۟ۚۛۦۡ۟ۤۡۗۛۘۡۖۧۦۖۖۘ"
            goto L_0x0010
        L_0x0024:
            boolean r0 = com.obwhatsapp.yo.shp.getIsGradiet(r1)     // Catch:{ Exception -> 0x0058 }
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "ۢۡۧۨۙۦۘۦۙۗ۟ۢۖ۫۟ۘۘۜۙۧ۟ۜۡۘ۫ۡۨ"
            goto L_0x0010
        L_0x002d:
            java.lang.String r0 = "ۘۥۜۘ۠۟ۧۨۗ۫ۘ۬ۢۡۗۥۘۖۗۦۦۦ۫ۤ۫۬ۡۜ"
            goto L_0x0010
        L_0x0030:
            r0 = -11
            int r1 = getColor(r1, r0)     // Catch:{ Exception -> 0x0058 }
            r2 = -168935050(0xfffffffff5ee4176, float:-6.0404998E32)
            java.lang.String r0 = "ۜۚ۠ۨۘ۟ۛۛۖۘۤ۬ۘۧۖۤ"
        L_0x003b:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0058 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1391320427: goto L_0x0020;
                case -690128414: goto L_0x004a;
                case 329366406: goto L_0x004f;
                case 638362680: goto L_0x0044;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x003b
        L_0x0044:
            java.lang.String r0 = "ۚۘ۬ۚ۟۟ۘۥۘۥ۫ۦۘۤۥۨ"
            goto L_0x003b
        L_0x0047:
            java.lang.String r0 = "ۛۥۥۘۘۥۘۖۡۢۖۘۥۘۛۖۜ"
            goto L_0x003b
        L_0x004a:
            if (r1 == r4) goto L_0x0047
            java.lang.String r0 = "ۘۛۢۛۤۘۘۛۛۙۛ۫ۧۧ۬ۙۖۖۚۘۖۘ"
            goto L_0x003b
        L_0x004f:
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable     // Catch:{ Exception -> 0x0058 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0058 }
            r5.A0D(r0)     // Catch:{ Exception -> 0x0058 }
            goto L_0x0020
        L_0x0058:
            r0 = move-exception
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.others.ModContPick(X.02i):X.02i");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047 A[Catch:{ Exception -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[SYNTHETIC, Splitter:B:21:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b A[Catch:{ Exception -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084 A[Catch:{ Exception -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c A[Catch:{ Exception -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a5 A[SYNTHETIC, Splitter:B:42:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0048 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x006e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0085 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void actionbarbk(android.app.Activity r7) {
        /*
            r6 = -11
            int r3 = com.obwhatsapp.yo.yo.mainpagercolor()
            r0 = -19063705533889(0xffffeea9629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r2 = 968171026(0x39b51e12, float:3.4545414E-4)
            java.lang.String r0 = "ۧۦ۬ۡ۬ۨۘۖ۟ۜۗۨ۬ۦ۟ۖ"
        L_0x0014:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1428426369: goto L_0x0023;
                case -1062468939: goto L_0x001d;
                case -54323263: goto L_0x002a;
                case 627040492: goto L_0x00ae;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0014
        L_0x001d:
            java.lang.String r0 = "۫ۤ۟۠ۜۧۜۢ۬ۜۜ۬۠ۗۨۘۗ۬ۚ"
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = "ۦ۬ۥۘۦۢ۠۟۬ۜۨۖۥۨۤۖۘۦۜۛۖۧ۬ۢ۫۠ۙ۫۠"
            goto L_0x0014
        L_0x0023:
            boolean r0 = r7 instanceof com.obwhatsapp.Conversation
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = "ۨ۠ۤۖ۟ۜۧۘ۬۟ۢۛۜ۬ۧۘۘۢۗۘۘ۬ۘۦۘۖۨ۟"
            goto L_0x0014
        L_0x002a:
            r0 = -19132425010625(0xffffee99629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)     // Catch:{ Exception -> 0x0097 }
            r2 = r0
        L_0x0034:
            int r0 = f1055c     // Catch:{ Exception -> 0x0097 }
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ Exception -> 0x0097 }
            r4 = 1528368632(0x5b190df8, float:4.308103E16)
            java.lang.String r1 = "ۢۚۥۙۘ۠ۨۤۘۘۨ۬ۜۘۜ۫ۙۦۤۡۥۘۚ۫۫ۦ"
        L_0x003f:
            int r5 = r1.hashCode()     // Catch:{ Exception -> 0x0097 }
            r5 = r5 ^ r4
            switch(r5) {
                case -1965251100: goto L_0x0048;
                case -335455680: goto L_0x006e;
                case 196238416: goto L_0x006b;
                case 1213728624: goto L_0x0062;
                default: goto L_0x0047;
            }     // Catch:{ Exception -> 0x0097 }
        L_0x0047:
            goto L_0x003f
        L_0x0048:
            r1 = -11
            int r2 = getColor(r2, r1)     // Catch:{ Exception -> 0x0097 }
            r4 = 1245331364(0x4a3a3fa4, float:3051497.0)
            java.lang.String r1 = "ۗ۫ۚۖۛۖۧ۟ۥۘۡۢ۠ۦ۫ۢۛۜۢ"
        L_0x0053:
            int r5 = r1.hashCode()     // Catch:{ Exception -> 0x0097 }
            r5 = r5 ^ r4
            switch(r5) {
                case -1997778978: goto L_0x005c;
                case -1401425620: goto L_0x008e;
                case -952414711: goto L_0x0089;
                case 1669165308: goto L_0x0075;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x0053
        L_0x005c:
            java.lang.String r1 = "ۗ۫ۚۡۤۧ۬ۛۧ۬ۙۧ۫۫ۦۜۦۘ"
            goto L_0x0053
        L_0x005f:
            java.lang.String r1 = "ۗۨۧۘۥ۬ۨۘ۫ۙۗۚ۬ۗۨۦۨۥۘۙۧۘ۟ۚۢۘۜۥ"
            goto L_0x003f
        L_0x0062:
            boolean r1 = com.obwhatsapp.yo.shp.getIsGradiet(r2)     // Catch:{ Exception -> 0x0097 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = "ۡۘۡۘۛۖۥۘ۬ۖۘ۬ۨ۠۫ۨۖۘۙۙۥۖ۠ۦ"
            goto L_0x003f
        L_0x006b:
            java.lang.String r1 = "ۧۨ۬ۡۖۛۙۧۨۗۖۡۘ۬ۗۜ۬۠ۨ"
            goto L_0x003f
        L_0x006e:
            android.graphics.drawable.GradientDrawable r1 = com.obwhatsapp.yo.shp.getGradientDrawable(r2)     // Catch:{ Exception -> 0x0097 }
            r0.setBackground(r1)     // Catch:{ Exception -> 0x0097 }
        L_0x0075:
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x0097 }
            r2 = -682461972(0xffffffffd75274ec, float:-2.31399617E14)
            java.lang.String r1 = "ۢۘ۟۠ۥۙۧۧۥۘ۠ۜۜۘۖۦۜۘ۬ۨۗ"
        L_0x007c:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x0097 }
            r4 = r4 ^ r2
            switch(r4) {
                case -158895080: goto L_0x0085;
                case 1293191061: goto L_0x009c;
                case 1657245183: goto L_0x00a2;
                case 2143501600: goto L_0x00a5;
                default: goto L_0x0084;
            }     // Catch:{ Exception -> 0x0097 }
        L_0x0084:
            goto L_0x007c
        L_0x0085:
            return
        L_0x0086:
            java.lang.String r1 = "ۡ۫ۢ۠ۚۨۘۜۙۨۘ۬۬ۜۘۦۥۚۛۥۡۜۚۥۘۘۜۜ۟۟ۘ"
            goto L_0x0053
        L_0x0089:
            if (r2 == r6) goto L_0x0086
            java.lang.String r1 = "ۘ۠ۤۡۛۜۘۘۖ۫ۗۛۡ۟ۚۘۘۧۖۨۘۘۛۘۘۨۘۙ۬ۜ"
            goto L_0x0053
        L_0x008e:
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable     // Catch:{ Exception -> 0x0097 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0097 }
            r0.setBackground(r1)     // Catch:{ Exception -> 0x0097 }
            goto L_0x0075
        L_0x0097:
            r0 = move-exception
            goto L_0x0085
        L_0x0099:
            java.lang.String r1 = "ۘ۠۠ۜۛۗۧۨۚۗۦ۟ۛۡۜۘۡۢۦۤۚۚۦۘۡۘۖۡۘ"
            goto L_0x007c
        L_0x009c:
            r1 = -1
            if (r3 != r1) goto L_0x0099
            java.lang.String r1 = "ۡۙ۠ۙۥۧۛۖۘۡۨۜۘۧۘۚۛۙۧۤۜۘ"
            goto L_0x007c
        L_0x00a2:
            java.lang.String r1 = "۫ۚۦۨۚۚۘۜۧۥۛۖۙۘۦۥ۠"
            goto L_0x007c
        L_0x00a5:
            com.obwhatsapp.yo.d1 r1 = new com.obwhatsapp.yo.d1     // Catch:{ Exception -> 0x0097 }
            r1.<init>((android.app.Activity) r7, (android.view.ViewGroup) r0, (int) r3)     // Catch:{ Exception -> 0x0097 }
            r7.runOnUiThread(r1)     // Catch:{ Exception -> 0x0097 }
            goto L_0x0085
        L_0x00ae:
            r2 = r1
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.others.actionbarbk(android.app.Activity):void");
    }

    public static Drawable alphaDrawable(String str, int i2, PorterDuff.Mode mode, int i3) {
        Drawable drawable = null;
        String str2 = "ۧۘۥۘۙ۠ۖۙۥ۠ۦۘۧۢۡۨۘۧۛۗۘۗۗۖۖۥۘ";
        while (true) {
            switch ((str2.hashCode() ^ 234) ^ -570758313) {
                case -1515247964:
                    drawable.setAlpha(i3);
                    str2 = "ۛۗۨۘ۫ۢۘۜۙۤۦۛ۬ۙۘۛۘۚۦۘ۠ۡۡۘ";
                    break;
                case -72488641:
                    drawable = coloredDrawable(str, i2, mode);
                    str2 = "ۥۘۨۘۤۜۧۨۜۘۘۘۡ۬۫ۛۘۘ۟۟۬";
                    break;
                case 941217278:
                    str2 = "ۚۘۡۢۦۦۚۙۧۚۦ۬ۦۡۦۜۢ۬۠ۘۘۘۢۨۘ۠ۚۥ";
                    break;
                case 1133568736:
                    str2 = "۟ۜۜۦ۟ۨۘۢۤۦۢۛۦۡۜۚۡۖۛ۫ۧۖۘۛۧۥۘۦ۠ۡ";
                    break;
                case 1235963134:
                    return drawable;
                case 1564249263:
                    str2 = "ۦۤ۟ۡ۟۬ۥۥ۫ۤۨ۠ۖۗ۫ۡۗۤ";
                    break;
                case 1580709502:
                    str2 = "۟ۢۛۗ۬ۙۨۜۗۡۘۦۘۙۨ۬";
                    break;
            }
        }
    }

    public static Drawable coloredDrawable(String str, int i2, PorterDuff.Mode mode) {
        Drawable drawable = null;
        String str2 = "ۜ۠ۖۘ۠ۚۘۘۢۧ۠ۤۘۖۙۙ";
        while (true) {
            switch ((str2.hashCode() ^ 894) ^ 498981290) {
                case 437026663:
                    str2 = "ۙۦۙۚ۠ۗۙۖۘ۠ۘۥ۬ۦۚ۬ۨۘۘ۫۟ۘ۬ۗ";
                    break;
                case 582266654:
                    str2 = "ۜۥۤ۬ۛۥۢۦۡۜۗۥۥۢ۠ۚۦۨۙۚ";
                    break;
                case 839742771:
                    str2 = "ۛ۟ۧ۟۫۟ۜۘۨۜۙۚ۠ۘۧۜۖۖۙۜۤ";
                    break;
                case 1454106198:
                    drawable = yo.getDrawableByName(str);
                    str2 = "۠ۗۡۖۢۖۢ۬ۦۧۜ۟ۗۗۦۥ۠ۧ";
                    break;
                case 1557354551:
                    return drawable;
                case 2107448032:
                    drawable.setColorFilter(i2, mode);
                    str2 = "ۖۖۘۘۖ۬ۜۘۦ۬۠ۜۨۦۥۧۖۘۙ";
                    break;
            }
        }
    }

    public static int getColor(String str) {
        String str2 = "۬ۦۖۘۦۚۦۧۖ۟ۤ۫۟ۛۗۜۘۢۧ۟ۦۨۘۘۚۦۘ";
        while (true) {
            switch ((str2.hashCode() ^ 408) ^ 1679834344) {
                case -444707626:
                    str2 = "ۛۗۡۘۨۦۧۥۧ۟ۗۧۖۘۨ۬ۦۘۤۨۜ";
                    break;
                case 2003093209:
                    return shp.prefs.getInt(str, -16777216);
            }
        }
    }

    public static int getColor(String str, int i2) {
        String str2 = "۬ۜۜۘۙۤۡۨۥۗۜۦۡۘۙۤۡۘۖۚۘۘۗ۟ۨۘۛ۟ۤ";
        while (true) {
            switch ((str2.hashCode() ^ 505) ^ -922560008) {
                case -1682877244:
                    return shp.prefs.getInt(str, i2);
                case -1485821360:
                    str2 = "ۥۤۜۖۦۛۘۨۦۘۥۢۡۤۢۡ";
                    break;
                case 1077555534:
                    str2 = "ۧۙۥۧۦۛۙ۟ۡ۟ۚۚۜۢۘۘۘ";
                    break;
            }
        }
    }

    public static int getHomeCounterBKColor(int i2) {
        String str = "ۡۥۢۡۘۡۥۥۙۢۗۨۘۢۢۥۘۤ۫۟ۗۗۚۥۧۦۘۚ۠۬";
        while (true) {
            switch ((str.hashCode() ^ 34) ^ 1578297245) {
                case -538228908:
                    str = "ۖۖۥۘ۠ۖۗ۟ۧۖۘۤۛۜۧۗۢۚۥۧۤ";
                    break;
                case 1689802514:
                    return getColor(Deobfuscator$app$Custom.getString(-18406575537601L), i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getHomeMentionIconColor() {
        /*
            java.lang.String r0 = "۫ۡۥۢۙ۬۟ۚۨۥ۟ۨۙۦۘ۫ۘۧۘ۫۫۫"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 756(0x2f4, float:1.06E-42)
            r3 = 697719985(0x29965cb1, float:6.6774175E-14)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -89590356: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -18303496322497(0xffffef5a629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            int r1 = com.obwhatsapp.yo.ColorStore.getDefaultHomeRowsUnreadTextColor()
            int r0 = getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.others.getHomeMentionIconColor():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getHomeMentionIndBackground() {
        /*
            java.lang.String r0 = "۫ۘۦۘۢۙۧۡۢ۟ۙۦۖۘۡۥۨۘۗۦۨۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 14
            r3 = 1372168792(0x51c9a258, float:1.08251513E11)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1372653433: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -18183237238209(0xffffef76629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            int r1 = com.obwhatsapp.yo.ColorStore.getDefaultHomeRowsUnreadBkColor()
            int r0 = getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.others.getHomeMentionIndBackground():int");
    }

    public static int getID(String str, String str2) {
        String str3 = "ۨۡ۬۟ۢۜۧ۠ۦ۟ۧۥۙۦۢ۬۬ۡۧۦۛۚۜۘۗ۟";
        while (true) {
            switch ((str3.hashCode() ^ 166) ^ -2025029552) {
                case -174275831:
                    return yo.getID(str, str2);
                case -131093998:
                    str3 = "۠ۨۖۘۤۨۨۘ۠ۘۖۛ۫ۖۘۧۗۨ۠۬۬";
                    break;
                case -111954388:
                    str3 = "ۢ۬ۛۚۗۡۥۦۚۘ۫ۘۘۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getTabActiveColor() {
        /*
            java.lang.String r0 = "۬ۜ۟۠ۖۧۘۖۜۜ۫ۥ۠ۗۙ۟۠ۘۘۘ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 723(0x2d3, float:1.013E-42)
            r3 = -1996654167(0xffffffff88fd79a9, float:-1.5255486E-33)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1706548619: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -18866137038273(0xffffeed7629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            int r1 = com.obwhatsapp.yo.ColorStore.getDefaultTabActiveColor()
            int r0 = getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.others.getTabActiveColor():int");
    }

    public static int getTabBageBKColor(int i2) {
        String str = "ۚۨ۟ۜۡۖۘۘۡۥۘۤ۠ۢۚۖۤۜۜۘ۬ۚۢۜۘۙ۬ۛ";
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            switch ((str.hashCode() ^ 588) ^ 364229288) {
                case -1927828739:
                    String str2 = "۫ۚۛ۠ۛۘۘۜ۠۫ۨۖۨۘۙۧۛ۠ۡ۬ۢۨۗۛۢۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -2061231027) {
                            case -809547039:
                                if (i2 != ColorStore.getDefaultTabInActiveColor()) {
                                    str2 = "ۥۡۤۥ۠ۦ۫ۙ۟ۤ۬ۢۜۨۜۘۙۥ۫ۡۜۨ۫ۖۡ";
                                    break;
                                } else {
                                    str2 = "ۙۢۥۘۥ۫ۥۨۛۥۘۧۛۦۘۗ۟ۜۘۘۛۥۘۢۦۨ";
                                    break;
                                }
                            case 1036853224:
                                str = "۫ۤۢۘۜۥۘۡۧۥۗۜۜۦ۟۬ۖۥۚۗۧۛ";
                                continue;
                            case 1419105462:
                                str2 = "ۜۡۡ۠۟ۘۘ۬ۛۜۘ۬۫ۡۘۗۡ۬۫ۖۧۙۚ۬۟۬ۖۗۤۦ";
                                break;
                            case 2068870489:
                                str = "۫ۨۜۘۡۥۚۗۜۘۘۚۧۢۗۖۧۘۜۗۧ۠ۜۖ";
                                continue;
                        }
                    }
                    break;
                case -1899110245:
                    str = "ۨۜۘ۬ۜۜۜۦۜۖ۠ۘۢۙۡۘ۟ۖۢ";
                    i4 = i2;
                    break;
                case -1494063810:
                    str = "۟ۚۖۛۡۥۘ۟ۥ۫ۡۥۜۘۨ۬ۘۘۘۥۢۡۗۗۦۥۛ";
                    i5 = getColor(Deobfuscator$app$Custom.getString(-18608439000513L), yo.mainpagercolor());
                    break;
                case -1357878829:
                    return i5;
                case -980256546:
                    str = "ۘۧۛۗۡۛ۬ۡۘۦۜۨۡۛۖۙۥۦۘۧۘۗۖۗۛ";
                    break;
                case -855806593:
                    String str3 = "ۚۚۘۘۨۥ۫ۚۙۢ۟ۘۨۘۡۘۧۤۦۥ";
                    while (true) {
                        switch (str3.hashCode() ^ 1240767662) {
                            case -1834535585:
                                if (i2 != ColorStore.getDefaultTabActiveColor()) {
                                    str3 = "ۥۛۜۦۡۛۗۢۜۙۙۛۖۛۗۨۚۘۤۧۦۘۙۗ۟ۤۨ۟";
                                    break;
                                } else {
                                    str3 = "ۡۡۦ۫ۧۜۧۙۦۜۘۘۧۖ۟۫۬ۦ۬ۜۘۜۨ۫";
                                    break;
                                }
                            case -544683840:
                                str3 = "ۙ۫ۛۢۨۜۚۛۧۙۖۢۜۦۛ";
                                break;
                            case 1533211787:
                                str = "۟ۢ۟۠ۖ۫ۛ۟ۨۘۛۙ۟۠ۚۥ";
                                continue;
                            case 2127174921:
                                str = "ۤۨۥۘۖ۠ۚۥۙۙۥۤۙۙۥ۫۬ۨ۠ۡۗۗ۬ۡۨۘۨۡ۫";
                                continue;
                        }
                    }
                    break;
                case 1463857653:
                    return i4;
                case 1909405713:
                    str = "۫ۨۜۘۡۥۚۗۜۘۘۚۧۢۗۖۧۘۜۗۧ۠ۜۖ";
                    i4 = i3;
                    break;
                case 1919181407:
                    i3 = Integer.MIN_VALUE | (16777215 & i5);
                    str = "۬ۨۤۙۚۨۘۡۙۥۘۢۢ۫۫ۛ۬";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getTabInActiveColor() {
        /*
            java.lang.String r0 = "ۛ۟ۥۘۛۘۖۘۤۤۛۗۡۦۘۘۢۨۘۜۤۜ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 442(0x1ba, float:6.2E-43)
            r3 = 508066295(0x1e4879f7, float:1.06131336E-20)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 792370900: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -18793122594241(0xffffeee8629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            int r1 = com.obwhatsapp.yo.ColorStore.getDefaultTabInActiveColor()
            int r0 = getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.others.getTabInActiveColor():int");
    }

    public static void hContactName(TextView textView) {
        String str = "ۗۖۜۘ۫ۙۘۢۖۖۖ۟ۡۤۖۨۘۦ۟ۦۘۚۥۡۘ";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            switch ((str.hashCode() ^ 767) ^ -1335382518) {
                case -1985075731:
                    str = "ۖۡۤۡۦۗۧ۠ۜۘۥ۠ۨۤۥ۠ۦۘۘۛۦۖۘۢ۟ۜۘ";
                    i3 = i4;
                    break;
                case -1047907185:
                    i4 = getColor(Deobfuscator$app$Custom.getString(-19304223702465L), -11);
                    str = "ۛۨ۠۫ۧۡۗ۠۟ۧ۬ۜۘ۫ۘۗۛۚۜ۬۠ۜۖۡۢ";
                    break;
                case -998910729:
                    textView.setTextColor(i3);
                    str = "ۙۥۨۘۘ۠ۙۨۨۖۖۥۙۜۦۜۥۙ۠ۜ۠ۜۘ۫ۜۧۡۖۘۘ";
                    break;
                case -903547599:
                case 1815604573:
                    return;
                case -687461058:
                    yo.ChangeSize(textView, 0);
                    str = "ۥ۠ۛۙ۬ۦۘۘ۬ۘۘۢۢۛۦ۬ۗۛۡۧۘۦ۬ۦۚۘۖۘ";
                    break;
                case -309187871:
                    str = "ۚۗۦ۫ۢۘ۫ۘۥۘۘۧ۠ۡۜۛۨ۬ۖۘ";
                    break;
                case -169939143:
                    str = "ۦۚ۟۟ۧ۬ۜۛۙۜۙۚۨۗۜۘۤۙ۫ۢ۟ۖۨۛۡۘۢ۠ۨۘ";
                    break;
                case 694947322:
                    str = "ۦۚ۟۟ۧ۬ۜۛۙۜۙۚۨۗۜۘۤۙ۫ۢ۟ۖۨۛۡۘۢ۠ۨۘ";
                    i3 = i2;
                    break;
                case 705463256:
                    String str2 = "۠ۖۨۖۢۗۜۛۖۢۧۨۤۦۚۨۜۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -2138352063) {
                            case -750514377:
                                str = "ۗۖۜۖۘ۟ۧۚۖۘ۫ۤ۬۬۫ۥۘۜۙۦۘۤۗۖ";
                                continue;
                            case -488531293:
                                str2 = "ۜ۠ۦۤ۟ۘۧ۠ۨۡۨ۫ۥ۫ۡۘۧۛۖۘۥۚۥۘۦۡۜ";
                                break;
                            case 373708120:
                                if (textView != null) {
                                    str2 = "۬ۡۤۗ۠ۨۘۙ۫۟ۗۥ۫۟ۡۡۜ۫ۗۜ۬ۜ۠ۦۛ";
                                    break;
                                } else {
                                    str2 = "ۧ۬ۡۢۡۦۘۜۙۚۚۨۧۘ۬ۛۨۙۜۥۦۢۡۘۨۚ۟";
                                    break;
                                }
                            case 674922539:
                                str = "ۖۙ۟ۚۥۢ۠ۧۖۘ۠۫ۧۙۛۥ";
                                continue;
                        }
                    }
                    break;
                case 896363354:
                    i2 = getColor(Deobfuscator$app$Custom.getString(-19390123048385L), ColorStore.getDefaultListItemTitleColor());
                    str = "ۢ۬ۢۙۢ۫ۛۨۢ۟۬ۛ۠ۘ۠۟ۨۧۘۡ۬ۦۘۖۙۢۘۢۖۘ";
                    break;
                case 1104581714:
                    String str3 = "ۥۘۥۢۜۢۢۖۖۘۧۜۗ۠۠ۡۥۥۙ";
                    while (true) {
                        switch (str3.hashCode() ^ -567394256) {
                            case -1111070004:
                                str3 = "ۦۡۖۘۙۛۘۘۜۢۜۘۖۛۨ۠ۤۖۘ۬ۧ۫۫ۦۦۘ۫ۜۗۢۢۤ";
                                break;
                            case 300087008:
                                str = "۫۟ۖۘۤۦ۠ۛۛۖ۟۟ۙۚۦۡۘۨۜۥۘ۬۠ۜ۫ۖۧۘ";
                                continue;
                            case 1819582627:
                                str = "۟۬ۨۘۙ۫ۖۚۨۨۚۧۘۘ۬ۢۖۘ";
                                continue;
                            case 1916746078:
                                if (i4 == -11) {
                                    str3 = "ۢ۬۬ۢۙۡۘۨۚ۫ۗۡۧۢۙۗۖ۬ۖۦۘۛۘۦۘۗ۬ۚ";
                                    break;
                                } else {
                                    str3 = "ۧۦۢۛۘۦۘ۟ۜۤ۟۟ۗۧۡ";
                                    break;
                                }
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e A[SYNTHETIC, Splitter:B:19:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void hRowColors(android.view.View r5) {
        /*
            int r0 = f1056d     // Catch:{ Exception -> 0x00c4 }
            android.view.View r0 = r5.findViewById(r0)     // Catch:{ Exception -> 0x00c4 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x00c4 }
            hContactName(r0)     // Catch:{ Exception -> 0x00c4 }
            int r0 = f1057e     // Catch:{ Exception -> 0x00c4 }
            android.view.View r0 = r5.findViewById(r0)     // Catch:{ Exception -> 0x00c4 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x00c4 }
            r1 = 4
            com.obwhatsapp.yo.yo.ChangeSize(r0, r1)     // Catch:{ Exception -> 0x00c4 }
            int r0 = f1058f     // Catch:{ Exception -> 0x00c4 }
            android.view.View r0 = r5.findViewById(r0)     // Catch:{ Exception -> 0x00c4 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x00c4 }
            setHomeIc(r0)     // Catch:{ Exception -> 0x00c4 }
            int r0 = f1059g     // Catch:{ Exception -> 0x00c4 }
            android.view.View r0 = r5.findViewById(r0)     // Catch:{ Exception -> 0x00c4 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x00c4 }
            setHomeIc(r0)     // Catch:{ Exception -> 0x00c4 }
            int r0 = f1060h     // Catch:{ Exception -> 0x00c4 }
            android.view.View r0 = r5.findViewById(r0)     // Catch:{ Exception -> 0x00c4 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x00c4 }
            r2 = -19188259585473(0xffffee8c629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)     // Catch:{ Exception -> 0x00c4 }
            r2 = -19269863964097(0xffffee79629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)     // Catch:{ Exception -> 0x00c4 }
            int r2 = android.graphics.Color.parseColor(r2)     // Catch:{ Exception -> 0x00c4 }
            int r2 = getColor(r1, r2)     // Catch:{ Exception -> 0x00c4 }
            r3 = 1043707131(0x3e35b4fb, float:0.1774482)
            java.lang.String r1 = "۫ۤۚۥۜ۟ۚۘۘۢ۠۟ۗۢۜۖ۬ۦۘۥۤۡۛۦۦۘۜۧۖ"
        L_0x0054:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x00c4 }
            r4 = r4 ^ r3
            switch(r4) {
                case -2062538269: goto L_0x005d;
                case -852734388: goto L_0x0063;
                case 163785167: goto L_0x0068;
                case 1441765882: goto L_0x006d;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x0054
        L_0x005d:
            java.lang.String r1 = "۫ۡۧۥۛۦۘ۠ۖۨۘ۬ۡۖۘۚۧۦۘۜۤۚۙ۠ۗۘۙ"
            goto L_0x0054
        L_0x0060:
            java.lang.String r1 = "ۧۦۙ۬۟ۡۘۜۡۜۛۨ۬ۗۙۘۘ۟ۡۧۘ"
            goto L_0x0054
        L_0x0063:
            if (r0 == 0) goto L_0x0060
            java.lang.String r1 = "ۗۧۦۘ۫۟ۥۙۗۥۚ۬ۧ۬ۧ"
            goto L_0x0054
        L_0x0068:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP     // Catch:{ Exception -> 0x00c4 }
            r0.setColorFilter(r2, r1)     // Catch:{ Exception -> 0x00c4 }
        L_0x006d:
            int r0 = f1061i     // Catch:{ Exception -> 0x00c4 }
            android.view.View r0 = r5.findViewById(r0)     // Catch:{ Exception -> 0x00c4 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x00c4 }
            r2 = 1426146193(0x55014391, float:8.8829497E12)
            java.lang.String r1 = "۟۬ۡ۠ۤۡۖ۫۠ۧۜۡۥ۫ۤۙ۠ۗۥۗۖۧۦۜۘۧۤ۫"
        L_0x007a:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00c4 }
            r3 = r3 ^ r2
            switch(r3) {
                case 260220197: goto L_0x008e;
                case 510027194: goto L_0x0089;
                case 809962681: goto L_0x00c3;
                case 1704450908: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x007a
        L_0x0083:
            java.lang.String r1 = "ۢۥۥۨۛۨۘۤۥ۫۠ۚۛۛۖ۫"
            goto L_0x007a
        L_0x0086:
            java.lang.String r1 = "ۖۧ۠ۜۘۦ۫ۗۖۛۖۥۘۤۙۖ۠ۡۘۘۢۥ"
            goto L_0x007a
        L_0x0089:
            if (r0 == 0) goto L_0x0086
            java.lang.String r1 = "ۤۦۤۖ۬ۖۤۧۥۘۧ۟ۖۘۗۦۥۡۤۘ"
            goto L_0x007a
        L_0x008e:
            android.graphics.drawable.Drawable r1 = r0.getDrawable()     // Catch:{ Exception -> 0x00c4 }
            int r2 = getHomeMentionIconColor()     // Catch:{ Exception -> 0x00c4 }
            r1.setTint(r2)     // Catch:{ Exception -> 0x00c4 }
            r2 = 1585873255(0x5e868167, float:4.8460706E18)
            java.lang.String r1 = "ۜ۠۠۬ۚ۬۠۫۬ۦ۟ۧۙۖ۫ۘۨۦ"
        L_0x009e:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00c4 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1874307248: goto L_0x00a7;
                case -285260858: goto L_0x00b3;
                case 770153130: goto L_0x00b6;
                case 2026750300: goto L_0x00c3;
                default: goto L_0x00a6;
            }     // Catch:{ Exception -> 0x00c4 }
        L_0x00a6:
            goto L_0x009e
        L_0x00a7:
            android.graphics.drawable.Drawable r1 = r0.getBackground()     // Catch:{ Exception -> 0x00c4 }
            if (r1 == 0) goto L_0x00b0
            java.lang.String r1 = "ۨۦۘۘ۠ۢۘ۟ۨۘ۠ۢۜۘۦ۫ۘۘۡۨۢ"
            goto L_0x009e
        L_0x00b0:
            java.lang.String r1 = "ۦۤۙۦ۠ۜۡۢۘۘۜۜۥۤۖۦۘۚۘۚ"
            goto L_0x009e
        L_0x00b3:
            java.lang.String r1 = "ۚ۫ۥۙ۠ۦۨۦۚۚۡۗۙۡۖۘ۬۬ۘۘۗۚۙ"
            goto L_0x009e
        L_0x00b6:
            android.graphics.drawable.Drawable r0 = r0.getBackground()     // Catch:{ Exception -> 0x00c4 }
            int r1 = getHomeMentionIndBackground()     // Catch:{ Exception -> 0x00c4 }
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP     // Catch:{ Exception -> 0x00c4 }
            r0.setColorFilter(r1, r2)     // Catch:{ Exception -> 0x00c4 }
        L_0x00c3:
            return
        L_0x00c4:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.others.hRowColors(android.view.View):void");
    }

    public static void init() {
        StringBuilder sb = null;
        String str = "ۜۚۛۘ۫ۚۖۤۙۗۖ۠ۤۜۘۥۧۨۙۛۦۗۥ";
        while (true) {
            switch ((str.hashCode() ^ 181) ^ 1362565532) {
                case -1194907963:
                    sb = new StringBuilder();
                    str = "ۦۚۥۤۨۖۘ۠ۨۡۚۖۢۜۗۧۦۡۖ";
                    break;
                case -743331616:
                    return;
                case -385867974:
                    sb.append(yo.datafolder);
                    str = "ۥۜۜۥ۟ۥ۟ۚۜۘۤ۠ۡۘۚ۠ۖ";
                    break;
                case -230844807:
                    utils.checkWhatsAppFolder();
                    str = "۬ۢ۠ۖ۠ۖۘۖۜ۟ۗۙۢۨۜۨۘۚ۬ۥۜۥ۟ۡۤۥۘ۫ۧۥۘ";
                    break;
                case 366478673:
                    homeBK_path = sb.toString();
                    str = "ۛۘۜ۬ۢۛ۟ۜ۠ۖۡۜۚۜۦ";
                    break;
                case 383604297:
                    sb.append(Deobfuscator$app$Custom.getString(-17491747503553L));
                    str = "۬۬ۙۘۨۥۜۘۘۘۗۦۙۤۙۥۤۥۨۚۨۖۘ۬ۢۤۜۖۧ";
                    break;
            }
        }
    }

    public static void menuItemColor(MenuItem menuItem) {
        int mainpagercolor = yo.mainpagercolor();
        String str = "ۚۙ۟ۘۜۥۘۤۙۢۧۖۗۛۛۥۘ";
        while (true) {
            switch (str.hashCode() ^ -515933925) {
                case -1403011426:
                    if (mainpagercolor != -1) {
                        str = "ۦۧۙۚۘۛۤۤۥۘ۫ۧۢۧ۬۬ۦۗ۟";
                        break;
                    } else {
                        str = "ۖۤۨۘ۫ۢۜۘۚۦۜۖۘۚۨۛۖۖۢۚۧۡۨۘۚۗۘ";
                        break;
                    }
                case -99525706:
                    str = "ۖ۟ۥۛۡۡۦۡۗۥۧۥۘۨۡۜۥۜ";
                    break;
                case 853469011:
                    return;
                case 1351884302:
                    try {
                        Drawable icon = menuItem.getIcon();
                        String str2 = "ۙۜ۬ۤۜۗ۠ۙۗۥ۫۫۠۬ۛۡ۬ۨۘۨۛ۠";
                        while (true) {
                            switch (str2.hashCode() ^ 879526784) {
                                case -1918270305:
                                    str2 = "ۚ۟ۙۥۡۙۤۢۡۘ۟۫ۡۘۚۘۘ۟۠ۚۘۖۨۘۙۡۨ";
                                    break;
                                case -508086606:
                                    icon.setColorFilter(mainpagercolor, PorterDuff.Mode.SRC_ATOP);
                                    return;
                                case -423814528:
                                    if (icon == null) {
                                        str2 = "۠ۖۙۙۢۜۘۛۘۜۘۚۜۖۘ۟ۡۚۛۤ۟۠ۜۧ";
                                        break;
                                    } else {
                                        str2 = "ۡ۫ۥۘۖۛۤۛۤۘۦ۟ۥۤۡۗۦۗۧۚ";
                                        break;
                                    }
                                case -118185912:
                                    return;
                            }
                        }
                    } catch (Exception e2) {
                        return;
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int pagerIndicator() {
        /*
            java.lang.String r0 = "ۘۛۗۚ۠ۜ۬ۡ۬ۥۗۖۜ۫ۘۦ۟ۨ۟ۜۨۖۗۥۦۨ۟"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 740(0x2e4, float:1.037E-42)
            r3 = -976893276(0xffffffffc5c5caa4, float:-6329.33)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 298689135: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            r0 = -18956331351489(0xffffeec2629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            int r1 = com.obwhatsapp.yo.ColorStore.getDefaultTabActiveColor()
            int r0 = getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.others.pagerIndicator():int");
    }

    public static void pagerTabBk(View view) {
        String str = null;
        String str2 = "۟۫ۜ۬ۢ۬ۘۥۚ۟ۨ۟ۧۛۘۢ۫ۜۦۖۢ۠ۗ۫";
        while (true) {
            switch ((str2.hashCode() ^ 64) ^ -644412013) {
                case -2134453696:
                    view.setBackground(shp.getGradientDrawable(str));
                    str2 = "ۙۨۘ۟ۤۖۦۡۡ۠ۡ۬ۥ۫ۧۧۢۡۘ۟ۡۨۘ";
                    break;
                case 45953994:
                    String str3 = "ۤۨۚۗۛۙۢۛ۫ۖۢۧۥ۬ۘۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -1007104704) {
                            case -1805615537:
                                if (!shp.getIsGradiet(str)) {
                                    str3 = "ۘ۬ۨۘ۟ۘۡۡۙۦۘۥ۠۫ۥۥۧ۠ۦ۟۬۠ۜۙۨۨ۟ۘ۫";
                                    break;
                                } else {
                                    str3 = "ۜ۠ۢۦۥۖۖۛۗ۟۟ۙۨ۬ۧۘ۟۬ۛۗۛ";
                                    break;
                                }
                            case -99050833:
                                str2 = "۬ۥۘۘۨ۬ۘۘۡۢۚۨۚ۟ۥ۟۠ۚ۟ۗۖۡۘۦۗۦۘ";
                                continue;
                            case 253445933:
                                str2 = "ۧۢ۫۫ۨ۫ۜۜۤۗۖۘۛۤۨۘ۟ۘۙۧ۟ۨ";
                                continue;
                            case 1361806813:
                                str3 = "ۜۤۛۤۤۥۘۥۡۖۘۧۡۦۘ۠۬ۥۘ";
                                break;
                        }
                    }
                    break;
                case 801957867:
                    str2 = "ۤ۠ۨۘۨۖۛ۬ۥۚۤۧۢ۫ۛۘۢۛۘ";
                    break;
                case 1056025199:
                    view.setBackgroundColor(yo.circleColor());
                    str2 = "ۤ۠ۨۘۨۖۛ۬ۥۚۤۧۢ۫ۛۘۢۛۘ";
                    break;
                case 1151133765:
                    return;
                case 1609138675:
                    str2 = "ۧ۟ۨۘۤۤۤ۬۠۠ۚ۠ۙ۫۟ۦۘۘۨۘۘ";
                    break;
                case 1721478986:
                    str = Deobfuscator$app$Custom.getString(-19012165926337L);
                    str2 = "۟ۖۤۜۘۖۤۤۘ۟ۛۡۥۘۦۘۡۙۖۘ";
                    break;
            }
        }
    }

    public static void pagerTitles(TextView textView, int i2) {
        int tabInActiveColor;
        String str = "۫ۢۦۘۡۘۜۘۢۗۜۘۜۦۧ۠ۚۥۘ";
        while (true) {
            try {
                switch (str.hashCode() ^ 518668584) {
                    case -2068030648:
                        tabInActiveColor = getTabActiveColor();
                        break;
                    case -1826612449:
                        str = "ۦۗۛۧ۬ۢۗۤۢ۟ۚ۠ۧۢ۫ۦۘۘۢۗۦۘ";
                        continue;
                    case -330062749:
                        tabInActiveColor = getTabInActiveColor();
                        break;
                    case 808164437:
                        if (i2 == ColorStore.getDefaultTabActiveColor()) {
                            str = "ۚ۟ۨۛۡۜۛۜۦۗۦۤۘ۬ۤ۠ۗۗۧۨۘۙۚۜ";
                            break;
                        } else {
                            str = "ۙ۫ۥ۫ۙۘۘۢۨۙ۠ۡۖۘ۬ۗۨۘۡ۬ۦۨۚۘۘۢۤ۠ۖ۠";
                            continue;
                        }
                    default:
                        continue;
                }
            } catch (Exception e2) {
                return;
            }
        }
        textView.setTextColor(tabInActiveColor);
    }

    public static void paintHome(ViewGroup viewGroup, Activity activity) {
        String str = "۟۟ۘۜۨ۫۬ۥۜۘۜۗۤۧ۫ۡۨۚۦ";
        while (true) {
            try {
                switch (str.hashCode() ^ 1616867096) {
                    case -1255068434:
                        String str2 = "ۦۢۡۘۡۢ۬ۢۧ۬۬ۖ۠ۛۗۢ۫ۥۘ۫ۚۖۚۦۡ";
                        while (true) {
                            switch (str2.hashCode() ^ -1589211956) {
                                case -1539255213:
                                    new Handler(Looper.getMainLooper()).post(new paintHome(viewGroup, activity));
                                    return;
                                case -706097983:
                                    if (!(activity instanceof ContactInfoActivity)) {
                                        str2 = "ۚۢۜۨۧۤۗ۠ۦۘ۫ۜۦۧۥۡۘۨ۟ۚۢ۬ۨۘ";
                                        break;
                                    } else {
                                        str2 = "ۤۙۧ۫ۙۢۙۤ۫ۛۨۧ۫۠ۘۘ۫ۨۙۤ۠ۙ";
                                        break;
                                    }
                                case -200127166:
                                    return;
                                case 1746565086:
                                    str2 = "ۤ۬ۨۘ۠۬ۥۘۥۤۦۡۢۧ۠ۡۧۘ۟ۢۙ";
                                    break;
                            }
                        }
                        break;
                    case -155516644:
                        if (activity instanceof GroupChatInfoActivity) {
                            str = "ۙ۟۠ۜ۫ۘ۠ۨۚ۫ۗۛۧۛۘۗ۠۫";
                            break;
                        } else {
                            str = "ۦۙۚ۬ۦۖۘۥۦۛۦۧ۫ۡۜۦۘۥ۠۠۬ۗۥ۬ۢ۬";
                            break;
                        }
                    case 677202258:
                        return;
                    case 1741418841:
                        str = "ۡۤۘۦۗۡۘۛ۟ۘۘۤۙۡۘ۠ۡۨۘۧ۟ۨۘۡۧۢ";
                        break;
                }
            } catch (Exception e2) {
                return;
            }
        }
    }

    public static void rEntryText(TextView textView) {
        int i2 = 0;
        String str = "۠ۥۤۚۨۖۘۨۖۖۘۤۦۥۘۨ۬ۦۘ۠ۨۖۘۢۘۥۘۡۛۧ۠۫ۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 26) ^ -1013996767) {
                case -1989781471:
                    textView.setTextColor(i2);
                    str = "ۘۦۢ۠ۥۜۤۖۗ۠ۜۥۘۜۙۨ";
                    break;
                case -1703888278:
                    i2 = getColor(Deobfuscator$app$Custom.getString(-18720108150209L), ColorStore.getPrimaryTextColor());
                    str = "ۙۙۡ۫ۙۨۘۖۙۙۘۛۢ۟۫ۘ۟ۜۚۖۧۘ";
                    break;
                case -1555037207:
                case -1174925503:
                    return;
                case -1473155656:
                    String str2 = "۠ۛۦ۟ۥۥۡۤۧۙ۠ۨۘۧۥۧ";
                    while (true) {
                        switch (str2.hashCode() ^ 1045066439) {
                            case -746820720:
                                str2 = "۟ۢۛۛۦۜۜۘۘ۫۠ۖۜ۫ۢ";
                                break;
                            case -306575822:
                                str = "ۜۜۨۘۥۘۦۥۦۘۗ۫ۛۤۧۗۙۗۥۘ";
                                continue;
                            case -277592123:
                                if (textView.getId() != yo.getID(Deobfuscator$app$Custom.getString(-18672863509953L), Deobfuscator$app$Custom.getString(-18707223248321L))) {
                                    str2 = "ۗۥۤۤۧۘ۟ۨۘۘۦۤۜۘۖۗۖۘۦ۬ۤ۬ۢۢۙۡۥ";
                                    break;
                                } else {
                                    str2 = "۟۟ۦۚۛۧۜۧۡۘۙۖۚۧۗۗۦۙۥ۠ۛۘ";
                                    break;
                                }
                            case 429637997:
                                str = "ۦۗۖۧۧ۠۟ۦۘ۫۬ۚۦۘۘۙۗۨۘۜۖ۠ۘۢۨۘۤۦۢ";
                                continue;
                        }
                    }
                    break;
                case 772461365:
                    textView.setHintTextColor((16777215 & i2) | 1459617792);
                    str = "ۢۤۘۨ۟ۦۜۙۢ۬۟ۥۘ۠۟ۡۚۢۢۙ۫ۖۦۘۦ";
                    break;
                case 1331761836:
                    str = "۠ۛۨۘۖۗ۟۠ۢۜۘۧۖۨۘۤ۠ۦ۫ۚ۬";
                    break;
            }
        }
    }

    public static void setHomeCounterBKAndTColor(TextView textView) {
        int i2 = 0;
        String str = "۠ۜۧۘۥۜۥۤۜ۠ۘۢ۟۫ۜۛ";
        while (true) {
            switch ((str.hashCode() ^ 652) ^ -1588192352) {
                case -2075043148:
                    return;
                case -1577699826:
                    textView.setTextColor(i2);
                    str = "ۘۥۘۘۡ۬۟ۜۘ۠ۘۖۜۘۧ۠ۦۘ۟ۙۢ۫۫۬";
                    break;
                case -1418572912:
                    str = "۬ۦۘۘۤ۬ۢۛۢ۬ۤۜۧۘۗۢۖۘ";
                    break;
                case -411198249:
                    i2 = getColor(Deobfuscator$app$Custom.getString(-18466705079745L), -11);
                    str = "ۥۡۢۚ۟ۨ۟ۖۡۙ۟ۢ۟ۙۦ";
                    break;
                case 348567882:
                    textView.post(new r(textView, 2));
                    str = "ۦۚ۫ۧۥۢۜۛۚۘ۬ۖۢۖ۠";
                    break;
                case 939022257:
                    String str2 = "ۚ۬ۡۗۜۥۙۡۢۨۜۛ۫ۧۦۘۡۤۥۙۙۨ";
                    while (true) {
                        switch (str2.hashCode() ^ -1599813487) {
                            case 177969411:
                                if (i2 == -11) {
                                    str2 = "ۧۙۡۘۦۘۤ۠ۜۖۘۛ۫ۧۨۦۗ";
                                    break;
                                } else {
                                    str2 = "ۜۢ۠ۢۛۥۘۖۗۙۢۜۡ۫ۦۘۦۘۜۜۛۛۖۡۧ";
                                    break;
                                }
                            case 618813475:
                                str = "ۥۛۡۘ۬ۡ۟ۛۘۙۦۗ۬ۜۤۦ";
                                continue;
                            case 725219667:
                                str2 = "ۛ۠ۜۘۙۥۧۘۡۖۘۘ۬۠ۥۗ۠ۨۦۛۜۘ";
                                break;
                            case 1583874744:
                                str = "ۘۥۘۘۡ۬۟ۜۘ۠ۘۖۜۘۧ۠ۦۘ۟ۙۢ۫۫۬";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    public static void setHomeIc(ImageView imageView) {
        String str = "ۨۥۧ۫۟ۨۘۦۥۜۦۥۘۨۦۡۘ۟۠ۤ";
        while (true) {
            switch ((str.hashCode() ^ 761) ^ 1900374533) {
                case -1989398210:
                case 1867775788:
                    return;
                case -1192811062:
                    String str2 = "ۗۖۨۘۙۥۚ۠۠ۖۘۙ۠۠۬۬ۦۘۧۛۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -33401385) {
                            case -251754584:
                                str = "ۤۙ۠ۖۥ۫ۛۥۨۘۥۚۖۚۜ۠۠۫ۗۢ۠۠ۦۘۘ";
                                continue;
                            case 1294137771:
                                str2 = "۠ۜۘۘ۫ۗ۬ۗ۟ۢۘ۟ۦۦۥۨۚ۟ۤۖۨۨۘ";
                                break;
                            case 1731836354:
                                if (imageView != null) {
                                    str2 = "ۜ۠ۡۢۘۧۘۚۨۛۗۧ۬ۥۖۜۘۚ۟ۤ";
                                    break;
                                } else {
                                    str2 = "۠ۦۗ۬ۗ۫ۜۜۖۖۢۢۡۦۦۙۘۧ۬۟ۛۙۖ۫";
                                    break;
                                }
                            case 2126923542:
                                str = "۟ۙ۠ۜۢۡۘۨۖۖۘۤ۟۫ۘۗۥۢۧۘ۬ۥ۠ۛۦۦۨ۟ۥ";
                                continue;
                        }
                    }
                    break;
                case 503194004:
                    String str3 = "ۨۦۖۘ۠۟ۗۤ۠۫ۦ۫ۛۘۨۧۘۧۗ۫ۡۡۨ";
                    while (true) {
                        switch (str3.hashCode() ^ -62378267) {
                            case -1081032597:
                                str3 = "ۗۥۗۘ۟ۢۥۙۨۘ۫۠۬ۥۛۘۙۥۡ";
                                break;
                            case -79906072:
                                if (f1054b != null) {
                                    str3 = "ۚۤۖۤۘۧۤۗۙۡۦۧۘۘۛۘۘۤۥۧۘۘ۫ۜۘ";
                                    break;
                                } else {
                                    str3 = "ۘۧۦۘۗۛۖۜۨۜۙۦۖۘۖۡۢۘ۟ۦۙۦۡۤ۠ۨ";
                                    break;
                                }
                            case 460275793:
                                str = "ۘۦۧۜۡۘۘۡۨۢۥۙۘۘ۫۟ۖۘۛ۬ۦ۫ۦۦۘ";
                                continue;
                            case 693533052:
                                str = "ۤۦۨۘۡۘۛۢ۠ۦ۠۟ۥ۫ۜۘۤۥۦۘۘۡۢۥۦۧۘۜۛ۬";
                                continue;
                        }
                    }
                    break;
                case 617487608:
                    str = "ۚۥۥۘۧۚۘۘۜۚۚ۬ۛ۠۫ۢۦ۫ۖۦۢۛ۟۟ۥۜۥۨۧۘ";
                    break;
                case 1255435687:
                    f1054b = new PorterDuffColorFilter(yo.mainTextColor(), PorterDuff.Mode.SRC_IN);
                    str = "ۤۦۨۘۡۘۛۢ۠ۦ۠۟ۥ۫ۜۘۤۥۦۘۘۡۢۥۦۧۘۜۛ۬";
                    break;
                case 2105808880:
                    imageView.setColorFilter(f1054b);
                    str = "ۙۛ۫ۡۨۙ۫ۙۙۛۤۚ۠ۨۦۙۚ۟ۛۚۜۨۘ۠";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setHomeIc(android.widget.ImageView r5, android.graphics.drawable.Drawable r6) {
        /*
            r1 = 0
            java.lang.String r0 = "ۢۚۚۧۨۘۘۜۤۦ۟۠ۥۛۚۖۘۥ۠ۡۜۥۜۘ"
        L_0x0003:
            int r2 = r0.hashCode()
            r3 = 618(0x26a, float:8.66E-43)
            r4 = -1134090594(0xffffffffbc67269e, float:-0.014108328)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -1531445288: goto L_0x0015;
                case -1514977621: goto L_0x008f;
                case -1361790176: goto L_0x0086;
                case -1330353483: goto L_0x0012;
                case -504763058: goto L_0x0034;
                case -423038588: goto L_0x006e;
                case 188072820: goto L_0x009e;
                case 232928991: goto L_0x0050;
                case 668893269: goto L_0x007e;
                case 733114637: goto L_0x0018;
                case 760759873: goto L_0x00a2;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0003
        L_0x0012:
            java.lang.String r0 = "ۦۢۘۘۨۦۘۚۧۗ۬ۢۘۗ۬ۤۦۤۚ۟ۨ"
            goto L_0x0003
        L_0x0015:
            java.lang.String r0 = "ۜۤۦۦۧۘۗۗۚۦۙۚۨ۠ۜۛ۟ۡۘ"
            goto L_0x0003
        L_0x0018:
            r2 = -1500478463(0xffffffffa6908401, float:-1.0027787E-15)
            java.lang.String r0 = "ۢۢۤۛۜۘۚۦۡۘ۫ۙ۟ۡۤۙۗ۟ۢ۫ۖۛ۠۬ۖ"
        L_0x001d:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1831404488: goto L_0x002c;
                case -1196882736: goto L_0x0026;
                case 340992427: goto L_0x0031;
                case 1383055292: goto L_0x009e;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x001d
        L_0x0026:
            java.lang.String r0 = "ۥۜۖۘۡ۬ۛۖۖۥۗۛۨۘۢ۠ۜۘۢ۠ۘۘ"
            goto L_0x0003
        L_0x0029:
            java.lang.String r0 = "ۘۥۚۖۡۜۤ۟ۘۘۘ۫ۦۖۛۡۘۙ۟ۦۦ۫۬ۘ۬ۘۘۦ۟ۡ"
            goto L_0x001d
        L_0x002c:
            if (r5 == 0) goto L_0x0029
            java.lang.String r0 = "ۧۥۖۘۖۖۚ۠ۨۦۘۚۥۖۢ۫۟۫ۦۨۘ"
            goto L_0x001d
        L_0x0031:
            java.lang.String r0 = "ۜۢۗ۠۬۠ۙۛۖۘۢۥ۬ۧ۬ۡۘۜۤۜۧ۬ۗۜۨۖ۟ۦۜۘ"
            goto L_0x001d
        L_0x0034:
            r2 = 784104469(0x2ebc7c15, float:8.5712916E-11)
            java.lang.String r0 = "ۛۖۧۘۤۖۨۘ۟۟ۡۘۦۧۢ۫ۜۡۘۚۧۖ"
        L_0x0039:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -2126959440: goto L_0x0042;
                case -960883067: goto L_0x004a;
                case 686869513: goto L_0x004d;
                case 1505365508: goto L_0x0096;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0039
        L_0x0042:
            if (r6 != 0) goto L_0x0047
            java.lang.String r0 = "ۜۘۤۧۚۖۘۜ۠ۦۘ۫ۛ۫۬ۙۜۦۜۖۚۥ۟ۤۜۦۛۨۨۘ"
            goto L_0x0039
        L_0x0047:
            java.lang.String r0 = "۬ۦۤۥۘۙۚۤۥۧۙۧۡ۠ۦۘ۬ۙۡ۫۟ۨۘ"
            goto L_0x0039
        L_0x004a:
            java.lang.String r0 = "ۧۖۜۘۙ۫ۨۜۦۧۥۖۧۗۖۘۛ۬ۢ"
            goto L_0x0039
        L_0x004d:
            java.lang.String r0 = "۫ۤۦۙۗۡۘۡۧۢ۟۬ۦۘۗۦۨۘۧۚۨ۬ۥۥۤۙۜۘ"
            goto L_0x0003
        L_0x0050:
            r2 = -1407027619(0xffffffffac22765d, float:-2.308729E-12)
            java.lang.String r0 = "ۦۤۜۜۨۙۙۨۥ۫ۘۧۘۤ۬ۦ۠ۜۦۘۛۦ۫ۛۖۖۘۛ۠ۥۘ"
        L_0x0055:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -2137067315: goto L_0x009a;
                case -926542502: goto L_0x006b;
                case -248765869: goto L_0x0064;
                case 1768433299: goto L_0x005e;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x0055
        L_0x005e:
            java.lang.String r0 = "ۘۗۜۡ۫ۗۘۜۘۘ۬ۢۜۘ۠ۨۜۘۡۦۖ"
            goto L_0x0055
        L_0x0061:
            java.lang.String r0 = "ۖۙۡۦۚۙۨۦۨۘۙۨ۫ۙۥۥ۟۫ۜۧ۬ۘۘۜۖۘۦۛۘۘ"
            goto L_0x0055
        L_0x0064:
            android.graphics.PorterDuffColorFilter r0 = f1054b
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "۠ۦۜۘۦۙۛۦۛۖۘ۬ۚۙۤ۬ۡۘۜ۠ۖۘ۟ۨۜۙۦۖۘۥ۬ۤ"
            goto L_0x0055
        L_0x006b:
            java.lang.String r0 = "ۡۤۙۨۥۤ۬ۚۦۘ۫ۚۜۘۘ۬"
            goto L_0x0003
        L_0x006e:
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            int r2 = com.obwhatsapp.yo.yo.mainTextColor()
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.<init>(r2, r3)
            f1054b = r0
            java.lang.String r0 = "ۨ۬۬ۨۚۘۦۢۜ۟۟ۦۘ۫ۡۙۨۖ۫ۜۧۥۛۦۘ"
            goto L_0x0003
        L_0x007e:
            android.graphics.drawable.Drawable r1 = r6.mutate()
            java.lang.String r0 = "ۛۜۖۛۧۜۦۤۡ۫ۧ۟ۧۛ۬۟ۤ۫ۥۙۘ۬ۥۘۘ"
            goto L_0x0003
        L_0x0086:
            android.graphics.PorterDuffColorFilter r0 = f1054b
            r1.setColorFilter(r0)
            java.lang.String r0 = "ۡۛۖ۫ۙ۟ۘ۫ۘۛ۟۫ۡ۠ۨۥ۬ۘ"
            goto L_0x0003
        L_0x008f:
            r5.setImageDrawable(r1)
            java.lang.String r0 = "ۘۤۥۘۨ۟ۘۙۢۥۙۡ۬ۡۨۦ"
            goto L_0x0003
        L_0x0096:
            java.lang.String r0 = "ۥۦۛۘ۟ۦ۠۟ۨۘۙۨۡۘۦۘۘۛۚ"
            goto L_0x0003
        L_0x009a:
            java.lang.String r0 = "ۨ۬۬ۨۚۘۦۢۜ۟۟ۦۘ۫ۡۙۨۖ۫ۜۧۥۛۦۘ"
            goto L_0x0003
        L_0x009e:
            java.lang.String r0 = "ۘۤۥۘۨ۟ۘۙۢۥۙۡ۬ۡۨۦ"
            goto L_0x0003
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.others.setHomeIc(android.widget.ImageView, android.graphics.drawable.Drawable):void");
    }

    public static void setMainTVColor(TextView textView) {
        try {
            int mainTextColor = yo.mainTextColor();
            String str = "ۤۡ۬ۜۦۘۚۨۘۛۧ۫ۢ۫ۖۘۢۧۗۧۦۜۨۘۘۡۜۤ";
            while (true) {
                switch (str.hashCode() ^ 1015044966) {
                    case -2049800392:
                        textView.setTextColor(mainTextColor);
                        return;
                    case -466130252:
                        return;
                    case 343508077:
                        if (mainTextColor == Color.parseColor(Deobfuscator$app$Custom.getString(-17818165018049L))) {
                            str = "ۢۛۦۖ۟ۧۨ۫ۗۤ۠ۥۨۨۘۧۖۧۚۧۤۙۦۜۘۤۙۡ";
                            break;
                        } else {
                            str = "ۙۧۢۨۗۙ۟ۤ۫ۘۙۤۡۘۘۤۖۘۙۙۥۙۗۦۘ";
                            break;
                        }
                    case 601992731:
                        str = "ۥۜۢۢۚۜۜۨۡۘۗۛ۫ۙۘۖۘۥۚ۬ۛ۬ۥۘۙۗ۫";
                        break;
                }
            }
        } catch (Exception e2) {
        }
    }

    public static void setMainpagerTVColor(TextView textView) {
        try {
            textView.setTextColor(yo.mainpagercolor());
        } catch (Exception e2) {
        }
    }

    public static void setPagerIcon(ImageView imageView, Drawable drawable) {
        String str = "ۘۦۡۛۢۨ۫ۦۥۘۢۖۤۢ۠ۛ۬ۗۜۘۖۤ۫ۗۜۘ";
        while (true) {
            switch ((str.hashCode() ^ 90) ^ 771583061) {
                case -611457548:
                    return;
                case -59197702:
                    drawable.setColorFilter(getTabInActiveColor(), PorterDuff.Mode.SRC_ATOP);
                    str = "ۖۨۚۛۡۛۥۚۨ۬ۘ۫ۜۜۨۘۖۖۜۚۢۛۡ۫ۢ";
                    break;
                case 458070921:
                    str = "ۜ۠ۛۧ۠ۖۘ۟ۖ۠ۡۡ۫۬ۥۛۨۧۘۘۡۦۢۡۗۛ";
                    break;
                case 572811221:
                    imageView.setAlpha(0.75f);
                    str = "۫۫ۛۦۜۥۘۨ۟ۨۘ۫ۡۦ۫ۖ۠ۥۧۤۙۧۛ";
                    break;
                case 1350043674:
                    str = "ۗۖۘۘ۬ۖۧۘۘۤۧ۟ۡۤۛۛۗ۠ۥۖۘ۫ۘ۟ۡۘۡ";
                    break;
                case 1372807031:
                    imageView.setImageDrawable(drawable);
                    str = "ۧۙۘۛۨۧۘۧۜ۫ۦۤۜۙۡ۬ۘۚۦۘ۠ۢۨ";
                    break;
            }
        }
    }

    public static void setStatusNavBar(Activity activity) {
        try {
            int color = getColor(Deobfuscator$app$Custom.getString(-17633481424321L), -11);
            int color2 = getColor(Deobfuscator$app$Custom.getString(-17719380770241L), color);
            String str = "ۤۘۥۘ۟ۜۤ۫ۢ۬ۥۤۚ۠ۚۜ";
            while (true) {
                switch (str.hashCode() ^ 1381400274) {
                    case -1874583835:
                        str = "۬ۛ۟ۙۜۖۘۛۘۨۘ۬ۚۜۘۧۦۤ۫ۥۙۖ۟۫ۦۜۨ";
                        continue;
                    case -777317948:
                        String str2 = "ۡ۠۟ۛۡۦ۬ۧۚۤۘۥۨ۫ۖۘۥۘۦۡۙ۠۫ۥۘۤ۟ۘ";
                        while (true) {
                            switch (str2.hashCode() ^ 1932662980) {
                                case -842227345:
                                    if (color2 == -11) {
                                        str2 = "ۙۦۡۘۢۚ۫۠ۙۚۚ۫ۡۤ۬ۗۚ۟ۡۘ۫۠۠ۗ۬ۘۘ";
                                        break;
                                    } else {
                                        str2 = "ۜۙ۟۟ۥۘۗۦۨۤۡۖۛۗۘ";
                                        continue;
                                    }
                                case 303309902:
                                    return;
                                case 551969480:
                                    break;
                                case 1405445719:
                                    str2 = "ۘۧۦ۫ۛۙۚۦۡۦۛۖ۟ۢۘ۟ۗۙ";
                                    continue;
                            }
                        }
                        break;
                    case -188386164:
                        break;
                    case 56534862:
                        if (color != -11) {
                            str = "ۦ۟ۘۘۥ۟ۜۘۥ۫ۦۘ۬ۖۨۘ۟ۦۙ۠۟ۦ۫ۜۡۘ";
                            break;
                        } else {
                            str = "ۛۨۘ۬۟ۤ۠۟ۡۘۗۧۢۤ۠ۡۦۙۙ";
                            continue;
                        }
                    default:
                        continue;
                }
            }
            Window statusNavColors = utils.setStatusNavColors(activity, color, color2);
            String str3 = "ۙ۬ۤۤ۠ۙ۠ۛۦ۬۟ۘ۫ۜۚۚۖۧ۬ۢۡۦۗۘ";
            while (true) {
                switch (str3.hashCode() ^ -1432513909) {
                    case -1081359889:
                        if (color2 == color) {
                            str3 = "ۤ۬۬ۘۖۡۘ۫ۨ۬ۧ۬ۢۨۚ۟ۤ۟ۡۥۨ۫ۚۘۘ";
                            break;
                        } else {
                            str3 = "ۛۜۦۨ۬ۘۖۗۢ۬ۡۢۜۙۡۘ";
                            break;
                        }
                    case -529514311:
                        return;
                    case 102201028:
                        str3 = "ۚۗۢۘۜۤ۟ۤۖۘۖ۬ۜۤۖۛۡۜ۫ۖۧۨۦۛۛ";
                        break;
                    case 470910961:
                        utils.setNavBarColor(statusNavColors, color2);
                        return;
                }
            }
        } catch (Exception e2) {
        }
    }

    public static void setTabBadge(TextView textView) {
        String str = "۟ۗ۬ۚ۠۟ۦ۟ۥۘۚۚۡ۠ۦۘۨ۫ۦۘۢۚۜۛۜۥ";
        while (true) {
            switch ((str.hashCode() ^ 581) ^ 719145825) {
                case -1278032589:
                    str = "ۗۜ۬ۙۜۚۧۧ۠ۘ۟ۘۘۗ۫ۛۥۨ۬";
                    break;
                case -1111540995:
                    textView.setTextColor(getColor(Deobfuscator$app$Custom.getString(-18535424556481L), yo.circleColor()));
                    str = "ۥۧۤۗۜۛۗۗۖۗۗۙۜۙۜ۟۫ۙ";
                    break;
                case 1741322945:
                    return;
            }
        }
    }

    public static void setVoipIc(ImageView imageView) {
        String str = "ۧ۠ۜۢۢۧۧۚ۫ۛۡۡۥۨۜۘۗۦۘۢ۬۫";
        while (true) {
            switch ((str.hashCode() ^ 592) ^ -1455505732) {
                case -2105844487:
                case -743063257:
                    return;
                case -118601646:
                    imageView.setColorFilter(yo.mainpagercolor(), PorterDuff.Mode.SRC_ATOP);
                    str = "ۜ۬ۨ۟ۧ۬ۛۥۜ۟ۗۜۘۚ۠ۖۘ۠ۛۥۡۤ";
                    break;
                case 557909458:
                    str = "ۙ۟ۦۘۙۗۡۛۖۧ۫ۘ۟ۛۥ۬ۢۡۛ۠۠ۚ";
                    break;
                case 977155683:
                    String str2 = "ۧ۟ۗ۟۟ۥۙۙۡۘۚۗۥۘ۬ۙۗۙۡ۬";
                    while (true) {
                        switch (str2.hashCode() ^ 1300883481) {
                            case -1877583323:
                                str = "ۜۙۨۘۘۢۜۗۥۘۘۡۤ۫ۘۗ۠ۨۦ۫ۛۗۘۘۙۢۤ";
                                continue;
                            case 42210459:
                                str2 = "ۛۖ۠ۚۚۜۙۦۘۘ۠ۛ۠ۜۗۥۘ";
                                break;
                            case 255883198:
                                if (imageView != null) {
                                    str2 = "ۚ۠ۨۤ۟ۨۙۨۗۗ۫ۘۙۢۨۘ۬ۨ۫ۖۨۡۘ۟ۙۘۢۘۘۘ";
                                    break;
                                } else {
                                    str2 = "ۤۥۦۘۥۗۙ۠۠ۤۚۙۛۖۘۘۡۜۘۚۜۜۘۖ۫ۜ۟ۙۦۘ";
                                    break;
                                }
                            case 675516054:
                                str = "ۘۨۢ۫ۧۤۧۥ۬ۦۥ۟ۖ۠ۜۥۡۛ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d7, code lost:
        r1 = "ۢۗۖۘۢۛۡۘۡۜۡۜۤۘۘۡۡ۟ۦۢۡۘۜۖۜ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void set_Home_ArchivedRow_Colors(android.view.ViewGroup r8) {
        /*
            r3 = 0
            r4 = 0
            java.lang.String r0 = "ۛۜۢ۟ۙۥۘۥۡۡۦۗۗۥۗۥۘۢۛۘۛۨۢ"
            r1 = r0
            r2 = r3
            r5 = r3
        L_0x0007:
            int r0 = r1.hashCode()
            r3 = 175(0xaf, float:2.45E-43)
            r6 = 1502178091(0x59896b2b, float:4.834988E15)
            r0 = r0 ^ r3
            r0 = r0 ^ r6
            switch(r0) {
                case -1398010999: goto L_0x0043;
                case -1301934561: goto L_0x0060;
                case -1169826157: goto L_0x008b;
                case -811256945: goto L_0x00ac;
                case -490062552: goto L_0x00dc;
                case -237963541: goto L_0x0081;
                case -136575144: goto L_0x001a;
                case 657730943: goto L_0x00cf;
                case 882305934: goto L_0x0016;
                case 1641347748: goto L_0x003a;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "۟ۦۛۖۢۗ۫ۦۦۖۨۙ۫۫ۦۥۚۤ"
            r1 = r0
            goto L_0x0007
        L_0x001a:
            r0 = -18020028480961(0xffffef9c629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r6 = -18101632859585(0xffffef89629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r6)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r1 = "ۚۖ۫۫ۛۡۘ۠ۤۖۗۙۡۘۛ۠ۥ۫۟ۡ۬ۧۥۘۚۢۘ"
            r5 = r0
            goto L_0x0007
        L_0x003a:
            int r3 = com.obwhatsapp.yo.yo.mainTextColor()
            java.lang.String r0 = "۫۟ۖۗۥۧۘۦۜۘ۬ۖۧۦ۫ۦۘۗۙۢ"
            r1 = r0
            r4 = r3
            goto L_0x0007
        L_0x0043:
            r1 = -1229462702(0xffffffffb6b7e352, float:-5.4802886E-6)
            java.lang.String r0 = "ۢ۫ۘۘۨ۟۬ۢۘۛۦۨۛۜۤۥۘ"
        L_0x0048:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -2105355802: goto L_0x005d;
                case -1860556181: goto L_0x0051;
                case -949758903: goto L_0x0058;
                case 1372191557: goto L_0x00d7;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x0048
        L_0x0051:
            java.lang.String r0 = "ۧۖۡۜۗۡۖۨۛۡۡۦۚۙۙ۠ۖۚ"
            r1 = r0
            goto L_0x0007
        L_0x0055:
            java.lang.String r0 = "ۙۘۜۘ۟ۡۢۜۦۦۥۖۜۛۗۖۘۧ۬ۨۘۜۥۘۦۨۡ"
            goto L_0x0048
        L_0x0058:
            if (r5 == 0) goto L_0x0055
            java.lang.String r0 = "۠ۦۦۘۗۤۢۡۛۘۘۡۖۘ۠ۛۚۚۛۘۘ"
            goto L_0x0048
        L_0x005d:
            java.lang.String r0 = "۠ۡۥۡ۠ۨۦۥۗۦۦۚۢۚ۫۟ۧۡۜۜۘ۫۠ۖۘۚۚۡۘ"
            goto L_0x0048
        L_0x0060:
            r1 = -298831414(0xffffffffee3031ca, float:-1.3632388E28)
            java.lang.String r0 = "ۡۙۧۖۥۘۡ۠ۢۥۘ۟ۡۘۘۜۚۦۘۙۢۘۤ۬۟"
        L_0x0065:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -1914179149: goto L_0x00d7;
                case -97917040: goto L_0x007d;
                case 626855292: goto L_0x006e;
                case 1257478408: goto L_0x007a;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0065
        L_0x006e:
            int r0 = com.obwhatsapp.yo.ColorStore.getDefaultListItemSubTitleColor()
            if (r4 == r0) goto L_0x0077
            java.lang.String r0 = "۬ۘۤۛۧۤۥۘۚۘۚۖۘۨۘۧ۠ۖۨۖۦۡۡۛۨ۠ۡۦ"
            goto L_0x0065
        L_0x0077:
            java.lang.String r0 = "ۖۥ۟۬۠۬ۗۜۜۨۨۚ۟ۗۜۤۤ"
            goto L_0x0065
        L_0x007a:
            java.lang.String r0 = "ۦۢۥۘۚ۟۬۟ۚۙ۠۫۠ۛ۠۫ۖۜۚ۠ۗ۠۫۠ۛ"
            goto L_0x0065
        L_0x007d:
            java.lang.String r0 = "ۨۧۦۜۦۧۘ۟۠ۦۘ۬۠ۧۡۢۙۘۨ۠ۥ۫۫"
            r1 = r0
            goto L_0x0007
        L_0x0081:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r5.setColorFilter(r4, r0)
            java.lang.String r0 = "ۢۗۖۘۢۛۡۘۡۜۡۜۤۘۘۡۡ۟ۦۢۡۘۜۖۜ"
            r1 = r0
            goto L_0x0007
        L_0x008b:
            r0 = -18114517761473(0xffffef86629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            r2 = -18170352336321(0xffffef79629a823f, double:NaN)
            java.lang.String r1 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r2)
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "ۜ۟ۚۛ۫ۖۢ۠ۨۦۖۡۘۢ۫ۘۨۢۘۘ۬ۛۡۤ۠۫ۙۤۚ"
            r2 = r0
            goto L_0x0007
        L_0x00ac:
            r1 = -600150215(0xffffffffdc3a6f39, float:-2.09906545E17)
            java.lang.String r0 = "ۨۨۛۘۜۙۘۜۦۘۛ۠ۚۗۖۧۤۤۧۨۢ۠ۛۨ۠"
        L_0x00b1:
            int r3 = r0.hashCode()
            r3 = r3 ^ r1
            switch(r3) {
                case -980565002: goto L_0x00ca;
                case -111346638: goto L_0x00ba;
                case 1081061256: goto L_0x00c2;
                case 1795951502: goto L_0x00c7;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            goto L_0x00b1
        L_0x00ba:
            java.lang.String r0 = "ۙ۟ۖۥ۟ۙۢۛۗۥۦۥۢۜۖۘۡۙ۟ۢۙۨۤۚۡۘۗۜۙ"
            r1 = r0
            goto L_0x0007
        L_0x00bf:
            java.lang.String r0 = "ۖ۠ۡ۟۟ۤۜۘۛۤۗۥۤ۫ۖۥۗ۟۬ۙ"
            goto L_0x00b1
        L_0x00c2:
            if (r2 == 0) goto L_0x00bf
            java.lang.String r0 = "۠۟۠۟۫ۜۘۚۧۖۘۘۨۦۘۛۜ۠ۨۦۖۘۢۦۘۤۙۢۥ۬ۦۘ"
            goto L_0x00b1
        L_0x00c7:
            java.lang.String r0 = "۟ۨۤۙۗۛۥۘۥۘۦۡۦۘۛ۬ۛۡۡۤ"
            goto L_0x00b1
        L_0x00ca:
            java.lang.String r0 = "ۦۦ۬۠ۦۗۗۗۦۘۙۨۙۤ۬"
            r1 = r0
            goto L_0x0007
        L_0x00cf:
            r2.setTextColor(r4)
            java.lang.String r0 = "ۙ۟ۖۥ۟ۙۢۛۗۥۦۥۢۜۖۘۡۙ۟ۢۙۨۤۚۡۘۗۜۙ"
            r1 = r0
            goto L_0x0007
        L_0x00d7:
            java.lang.String r0 = "ۢۗۖۘۢۛۡۘۡۜۡۜۤۘۘۡۡ۟ۦۢۡۘۜۖۜ"
            r1 = r0
            goto L_0x0007
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.others.set_Home_ArchivedRow_Colors(android.view.ViewGroup):void");
    }

    public static void set_VoipCallBottomSheetBK(View view) {
        String str = "ۦۨۖۧۚۖۚۨۖۘۚۛۦۘۜۨۢۢۢۨۘ";
        while (true) {
            switch ((str.hashCode() ^ 778) ^ -1149214326) {
                case -1878932692:
                    String str2 = "ۨۜۡۘۛۦۗۙۙۡ۠ۛ۟۟ۡ۫ۤ۫ۦۚ۫ۚ۫۟۬";
                    while (true) {
                        switch (str2.hashCode() ^ 2086276304) {
                            case -2041945735:
                                if (!(view instanceof ViewGroup)) {
                                    str2 = "ۨۡۘۢۖۡۥۗۛۘۗۤ۫ۖۛ";
                                    break;
                                } else {
                                    str2 = "ۖۧۘ۠۟ۘۜۡۥ۬ۡۖۡۧۡۘۦۜ۫ۤۤۙ۬ۨۘ";
                                    break;
                                }
                            case 631748856:
                                str2 = "ۤۙ۠ۜۦ۫ۥ۠ۗۛۜۧ۬ۘۜۘۚۡۙ";
                                break;
                            case 885978646:
                                str = "ۙۗۙ۟۠ۥۘۗ۫ۥۘۖ۫ۧۜۚۚ";
                                continue;
                            case 1489686810:
                                str = "۠ۦۙۗۡۤ۬ۘۗۧۖۧۘۘ۠ۘ۠ۦۚۢۗۖۛۨۘۘ۠۠ۢ";
                                continue;
                        }
                    }
                    break;
                case -1838820000:
                    return;
                case -108991628:
                    str = "ۦۢۥۘۤ۠ۙۚۛ۠ۙۥۧۖ۫ۨۘۦ۠ۦۘۦۚ۫ۚۨۖ";
                    break;
                case 1676550684:
                    ((ViewGroup) view).getChildAt(0).setBackground(new ColorDrawable(yo.getUniversalColor()));
                    str = "ۙۗۙ۟۠ۥۘۗ۫ۥۘۖ۫ۧۜۚۚ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void statusViewSeparator(android.view.View r8, android.widget.TextView r9) {
        /*
            r2 = 0
            r7 = -11
            r4 = 0
            java.lang.String r0 = "ۙۢۡۘۦ۫ۧ۫ۘۤۙۗ۟۟ۘۘۦۡۡ۠ۦۡۘۥۘ"
            r1 = r2
            r3 = r2
        L_0x0008:
            int r2 = r0.hashCode()
            r5 = 554(0x22a, float:7.76E-43)
            r6 = 355898133(0x15369315, float:3.6870635E-26)
            r2 = r2 ^ r5
            r2 = r2 ^ r6
            switch(r2) {
                case -1295198997: goto L_0x00af;
                case -1039763016: goto L_0x0092;
                case -583639227: goto L_0x00be;
                case -486412836: goto L_0x0017;
                case -408300274: goto L_0x002a;
                case -71414703: goto L_0x00b6;
                case 100770862: goto L_0x004d;
                case 623621694: goto L_0x0081;
                case 773125835: goto L_0x001a;
                case 1549991484: goto L_0x0057;
                case 1566594117: goto L_0x001d;
                case 1603292192: goto L_0x007b;
                case 1647528606: goto L_0x005f;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0008
        L_0x0017:
            java.lang.String r0 = "ۤۤۢۥۦۖۘۨ۠ۖۘۙۨۜۘۧۛۖۘ۠۫ۨۧ۬ۜۘۘ۠ۚ"
            goto L_0x0008
        L_0x001a:
            java.lang.String r0 = "ۖۧۡۘۚۦۙۥۜ۫۠ۨ۠ۤۢۖۙۨۘ"
            goto L_0x0008
        L_0x001d:
            r4 = -19458842525121(0xffffee4d629a823f, double:NaN)
            java.lang.String r2 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r4)
            java.lang.String r0 = "۟ۜۤۚۨۘۘۘۙۦۘۦۛ۫ۛۜۛۛۧۛۤۘۘۚۚۨۘ"
            r4 = r2
            goto L_0x0008
        L_0x002a:
            r2 = -24361491(0xfffffffffe8c45ed, float:-9.32275E37)
            java.lang.String r0 = "۠ۢۡۦۢ۬ۘۧۨۘ۬ۦۘۜۥۨۘ"
        L_0x002f:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -1409994785: goto L_0x0047;
                case 291617019: goto L_0x0038;
                case 742455287: goto L_0x004a;
                case 1656521226: goto L_0x003e;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x002f
        L_0x0038:
            java.lang.String r0 = "ۘۡۡۦ۟ۜۙۖ۬ۖۨۘۥۚۙۥ"
            goto L_0x0008
        L_0x003b:
            java.lang.String r0 = "ۗۜ۫ۡۧۨۘۨ۟ۖۘۨۢۡۦۦۨ"
            goto L_0x002f
        L_0x003e:
            boolean r0 = com.obwhatsapp.yo.shp.getIsGradiet(r4)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "ۖۗۥۘۛۢۦۛۗۖۘۧۦۧۤۗۚۙۢۦۢۖۘۚۘۥۘ۠ۖۨ"
            goto L_0x002f
        L_0x0047:
            java.lang.String r0 = "۠۫ۡۗۥ۬ۘۡۘۘۥۦۥۘۘۤ۠ۧۤۦ"
            goto L_0x002f
        L_0x004a:
            java.lang.String r0 = "ۚ۫ۡۘۖۜۚۗ۫ۜ۫ۖۚ۟ۤۤ۟ۥۚۡۘۨۨۡۘۢۖۛ"
            goto L_0x0008
        L_0x004d:
            android.graphics.drawable.GradientDrawable r0 = com.obwhatsapp.yo.shp.getGradientDrawable(r4)
            r8.setBackground(r0)
            java.lang.String r0 = "ۗۙۙ۬ۗۥۘۖ۬ۜۘ۬ۛۧ۟۠ۘۘۛۚ۫ۖۥ۬۟ۥۗ"
            goto L_0x0008
        L_0x0057:
            int r2 = getColor(r4, r7)
            java.lang.String r0 = "ۥۜۛۙۙ۟۬ۚۦۘۡۢۡۘۥۛۘۜ۫ۗۥۗ۬"
            r3 = r2
            goto L_0x0008
        L_0x005f:
            r2 = -1476092133(0xffffffffa8049f1b, float:-7.3619725E-15)
            java.lang.String r0 = "۟ۜ۠۠۫ۨۘۦۡۙ۫ۥۨۜۖ۫ۦۢ۬۬ۡۗۙۙۗ"
        L_0x0064:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -524216601: goto L_0x0078;
                case 158176257: goto L_0x006d;
                case 586341913: goto L_0x0073;
                case 779012850: goto L_0x00b6;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x0064
        L_0x006d:
            java.lang.String r0 = "ۚۗۜۘۗۥ۫ۡۖۜۘ۟ۥۥۛۙۙ۫ۖۘ"
            goto L_0x0064
        L_0x0070:
            java.lang.String r0 = "۬ۨ۟ۖ۟ۢۗۨۙ۠۫ۖ۬ۦۜۘۛۧ۫ۨۜۗ۟۬ۢۛۨۘ"
            goto L_0x0064
        L_0x0073:
            if (r3 == r7) goto L_0x0070
            java.lang.String r0 = "ۖ۬ۖۥۗ۠ۗۚۛۗۧ۟ۥ۬ۦ"
            goto L_0x0064
        L_0x0078:
            java.lang.String r0 = "۬ۤۘۘ۫ۘۖ۫۟۫ۤ۫ۦ۠ۦۨۘ۫ۘۛ۠ۢۦۛ۫ۖۘۚ۬ۨ"
            goto L_0x0008
        L_0x007b:
            r8.setBackgroundColor(r3)
            java.lang.String r0 = "ۦ۟۬ۦ۫ۡۤۡۖۘ۟ۘ۫ۥۖۜ"
            goto L_0x0008
        L_0x0081:
            r0 = -19557626772929(0xffffee36629a823f, double:NaN)
            java.lang.String r0 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r0)
            int r1 = getColor(r0, r7)
            java.lang.String r0 = "ۢ۟ۦۘ۬ۨۧۘ۬ۤ۬ۡۚۜۘ۠ۘۢ۠ۗۨۧۚ"
            goto L_0x0008
        L_0x0092:
            r2 = -1891734629(0xffffffff8f3e6b9b, float:-9.388447E-30)
            java.lang.String r0 = "ۖۡۜۨ۫ۥۘۧۥۖۘۤۛۗ۫ۜۢۛۗۥ"
        L_0x0097:
            int r5 = r0.hashCode()
            r5 = r5 ^ r2
            switch(r5) {
                case -2122243011: goto L_0x00a0;
                case -1153520662: goto L_0x00a6;
                case -391394120: goto L_0x00ab;
                case 212435700: goto L_0x00ba;
                default: goto L_0x009f;
            }
        L_0x009f:
            goto L_0x0097
        L_0x00a0:
            java.lang.String r0 = "ۘۨ۬ۨۨۗۦ۠ۡۘ۬ۡۖۖ۠ۗ۠ۥۨ۫ۨۛۗۦۚۨ۬۟"
            goto L_0x0097
        L_0x00a3:
            java.lang.String r0 = "۠ۖۗۤۖۧۘۡۙ۠ۦۚۤۨۤۥۘۡۘ۠۬ۖۥۜ۫ۥۡ۠ۗ"
            goto L_0x0097
        L_0x00a6:
            if (r1 == r7) goto L_0x00a3
            java.lang.String r0 = "ۜۛۨۢۤۖۧۨۥۦۡۢۨۡ۫ۥۜۜۘۛۜۤۜۤۚ"
            goto L_0x0097
        L_0x00ab:
            java.lang.String r0 = "ۘۘ۫ۨ۠ۨۘۨۜۚۖۥ۠۫۟ۢ۠ۥ۠ۙ۟ۘۤۛۖۘ۫۟"
            goto L_0x0008
        L_0x00af:
            r9.setTextColor(r1)
            java.lang.String r0 = "ۖۤۜ۬ۜۜۦۘ۟۠۫ۨۘۡۧۢۧ۟ۨۘ"
            goto L_0x0008
        L_0x00b6:
            java.lang.String r0 = "ۦ۟۬ۦ۫ۡۤۡۖۘ۟ۘ۫ۥۖۜ"
            goto L_0x0008
        L_0x00ba:
            java.lang.String r0 = "ۖۤۜ۬ۜۜۦۘ۟۠۫ۨۘۡۧۢۧ۟ۨۘ"
            goto L_0x0008
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.others.statusViewSeparator(android.view.View, android.widget.TextView):void");
    }

    public static Drawable statuscamera(Drawable drawable) {
        String str = "۠۫ۥۘۨۗۖۘۚۚۨۘۨۗۖۖۚ";
        while (true) {
            switch ((str.hashCode() ^ 347) ^ -1935394916) {
                case -258982082:
                    drawable.setColorFilter(getTabInActiveColor(), PorterDuff.Mode.MULTIPLY);
                    str = "ۡۨۨۖۜ۠ۡۚۡۦ۟ۗۛۢۦۘۚۛۨۘ";
                    break;
                case 1281072446:
                    return drawable;
                case 1355380331:
                    str = "ۥۤۥۜۛ۫ۜۙۜۘۚۙۛۖۚۧۨۦۦۘۦۡۧۘۢۙۨۨ";
                    break;
            }
        }
    }
}
