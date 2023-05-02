package com.obwhatsapp.yo;

import X.C16740tZ;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import c.c;
import com.OM7753.GOLD;
import com.google.gson.Gson;
import com.joom.paranoid.Deobfuscator$app$Custom;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class SS extends p0 {

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList f556c;

    /* renamed from: d  reason: collision with root package name */
    public static WeakReference f557d;

    /* renamed from: e  reason: collision with root package name */
    public static SharedPreferences f558e;

    /* renamed from: f  reason: collision with root package name */
    public static SharedPreferences f559f;

    /* renamed from: g  reason: collision with root package name */
    public static Gson f560g;

    /* renamed from: h  reason: collision with root package name */
    public static Type f561h;

    /* renamed from: i  reason: collision with root package name */
    public static final String f562i;

    static {
        StringBuilder sb = null;
        String str = "ۤۖۧۧۛۜۤۙۤۨۨۘ۠ۙۗۨۚۧۧۗۥۘۗۙ۠ۛۢۥ";
        while (true) {
            switch ((str.hashCode() ^ 196) ^ 990422822) {
                case -1582327821:
                    sb.append(Deobfuscator$app$Custom.getString(-13115175828929L));
                    str = "ۧۗ۬ۛۚۚۗۤۦۘۖۚۦۦۛ۫۬ۨۦۘۗۥ۬ۤۥۜۘ";
                    break;
                case -764746535:
                    f562i = sb.toString();
                    str = "ۢ۫۟ۨ۟ۖۜ۫ۡۘۦۛۗ۫ۧۥۘۗۦۘۘۘۤۤ۠۠۟";
                    break;
                case -708165493:
                    sb.append(yo.mpack);
                    str = "ۚۚۜۘ۬۫ۨۘۨۤۖ۟ۖۡۘۡۚۚۦ۠ۘۜ۫۫۠ۥۘ";
                    break;
                case 1583030516:
                    sb = new StringBuilder();
                    str = "ۦ۠۬ۡ۬ۖۘۘ۬ۗۛۘ۬ۥ۠۫ۘۙۥۥۜۥۘ";
                    break;
                case 2021837306:
                    return;
            }
        }
    }

    public static void checkSSDeleted(Object obj) {
        try {
            f((C16740tZ) obj);
            ((TextView) f557d.get()).post(new d(obj, 2));
        } catch (Exception e2) {
        }
    }

    public static void collectStories(List list, StatusPlaybackContactFragment statusPlaybackContactFragment) {
        String str = null;
        String str2 = "ۘۨۨ۫ۡۥ۠ۡۘۨۡۦۤۖۨۥۗۢ";
        while (true) {
            switch ((str2.hashCode() ^ 10) ^ 1986002691) {
                case -1601279682:
                    str2 = "۬۠ۗۖۛ۟ۢۛۖ۠ۢۘۛۤ۫ۧۥۖۘۚۚۙۢۛۡۘ";
                    break;
                case -584815513:
                    p0.f842a.put(str, list);
                    str2 = "ۡۛۥۦۙۧۛۤۖۘۤ۟ۘۘۨۖۦۖۖۘۘ۟ۢ۫";
                    break;
                case -35808178:
                    str2 = "ۢۡۛۛۡۘۙۖۖۘۘۛۘۘۛۡۗۧۡۛۡۘۨ۠ۛۧۖۚۨۘ";
                    break;
                case 759653366:
                    return;
                case 770037534:
                    str = dep.getJID_t(statusPlaybackContactFragment.A0S);
                    str2 = "ۤۡۛ۟ۙۨۘۦۛۢۛۡۨۦۚۘۘۧۤۛۜۗۖ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList e(java.lang.String r4) {
        /*
            android.content.SharedPreferences r0 = f558e     // Catch:{ Exception -> 0x0048 }
            r1 = 0
            java.lang.String r1 = r0.getString(r4, r1)     // Catch:{ Exception -> 0x0048 }
            r2 = 618744591(0x24e14b0f, float:9.770535E-17)
            java.lang.String r0 = "ۜۤۥۘۨۙۡۧۡۤۙۥۖۡۗۥۘ"
        L_0x000c:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0048 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1117387348: goto L_0x0036;
                case -2732031: goto L_0x0015;
                case 920816492: goto L_0x0049;
                case 1750189969: goto L_0x0031;
                default: goto L_0x0014;
            }     // Catch:{ Exception -> 0x0048 }
        L_0x0014:
            goto L_0x000c
        L_0x0015:
            r2 = -1077953292(0xffffffffbfbfbcf4, float:-1.4979539)
            java.lang.String r0 = "۠ۛۢ۫ۜۤۧۥ۠ۦ۬ۢ۫ۛۘۥۜۢۖۙۘ۟ۙۗۨۖ"
        L_0x001a:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0048 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1854388295: goto L_0x0045;
                case -1734912917: goto L_0x003c;
                case -413208040: goto L_0x0023;
                case 1052627167: goto L_0x0049;
                default: goto L_0x0022;
            }     // Catch:{ Exception -> 0x0048 }
        L_0x0022:
            goto L_0x001a
        L_0x0023:
            com.google.gson.Gson r0 = f560g     // Catch:{ Exception -> 0x0048 }
            java.lang.reflect.Type r2 = f561h     // Catch:{ Exception -> 0x0048 }
            java.lang.Object r0 = r0.fromJson((java.lang.String) r1, (java.lang.reflect.Type) r2)     // Catch:{ Exception -> 0x0048 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x0048 }
        L_0x002d:
            return r0
        L_0x002e:
            java.lang.String r0 = "ۗۛۜۘۨۥۖۛ۬ۢ۠۬۬ۧۖۥۡۨۘ"
            goto L_0x000c
        L_0x0031:
            if (r1 == 0) goto L_0x002e
            java.lang.String r0 = "ۦ۟ۥ۫ۗۗۡ۠ۧۢۥۘۧۗۢ۟ۧۡۛۛۖ"
            goto L_0x000c
        L_0x0036:
            java.lang.String r0 = "ۗۙۘۡۨ۫ۧۦۢۧ۠ۨۢۡۢۛۗۥۘۢۖۚ"
            goto L_0x000c
        L_0x0039:
            java.lang.String r0 = "ۡ۬ۦۜ۫ۥ۬۠ۚۗۚۜۡۧۢۛۚۤۥۗ۬ۚۧۥ۬ۘ۬"
            goto L_0x001a
        L_0x003c:
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0048 }
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "ۗۙۜۚۡۧۘۥۤۨ۠ۨۘۚۖۡۧ۠ۦۘۦۧۖۘۧۧۧ"
            goto L_0x001a
        L_0x0045:
            java.lang.String r0 = "ۘۦۡ۟ۢۙۧۤ۬۫ۡۗۧۚۨۖۤ۠ۢۤۦۜ۬ۜۘۘۦۘۘ"
            goto L_0x001a
        L_0x0048:
            r0 = move-exception
        L_0x0049:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.SS.e(java.lang.String):java.util.ArrayList");
    }

    public static void f(C16740tZ r5) {
        ArrayList arrayList;
        String jID_t = dep.getJID_t(r5.A0B());
        String str = p0.currJID;
        String str2 = "۬۟ۡۘۜۡۧۘ۟ۢۖۘۙۧۢ۠ۦۚ۟ۧۘۘۧۛ۫۟ۧۤ";
        while (true) {
            switch (str2.hashCode() ^ 1221717129) {
                case -1322399792:
                    String str3 = "ۧۤۖ۫ۘۜۘۖۙۦۘ۫ۛۖۘۡ۫ۥۧۛ۫ۗۚۡۗۦۜ۬۬ۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -1622544973) {
                            case -1757914911:
                                return;
                            case -659419247:
                                break;
                            case 264988308:
                                str3 = "ۧۧ۠ۨۜۜۗۨۤ۠ۖۗۛۧۤ";
                                continue;
                            case 1359728311:
                                if (!str.equals(jID_t)) {
                                    str3 = "ۨۗۜۦۘۘۘۛۖۨۘۛۥ۠ۙۨۘۘۤۛۦۨۥۨۘۗۛ۬";
                                    break;
                                } else {
                                    str3 = "ۥۥۜۡۚۤۦۘۡۘۤۛ۬ۥۗۥۘۙۧۜۘۥ۫";
                                    continue;
                                }
                        }
                    }
                    break;
                case -219434485:
                    break;
                case 1987343926:
                    str2 = "ۦۘۧۡۥۡۘۙۘۜ۫ۖۜۙۦۘ۬ۧۘ۬۫۟ۨۚۙۤۨۚ";
                    continue;
                case 2091188187:
                    if (str == null) {
                        str2 = "ۧۥۧۘۙۖۚۙۜۘۘۤۢۧۖ۟ۨۘۥۥۧۥۘ۠ۙۤ";
                        break;
                    } else {
                        str2 = "ۦۛۜۘۙۤ۠ۢۚۘۘۢ۫ۢۤۧ۠۠ۘۧۚۡۥ۫ۢۥ";
                        continue;
                    }
            }
        }
        p0.currJID = jID_t;
        String stripJID = yo.stripJID(jID_t);
        ArrayList arrayList2 = new ArrayList();
        String str4 = "ۛۢۥۘۧۗۧۜۨۖۥۜۖۛۜۘۘۖۚۛ۫ۛ";
        while (true) {
            try {
                switch (str4.hashCode() ^ -1568746608) {
                    case -1562029212:
                        if (f558e == null) {
                            str4 = "ۡۛۙۤ۫ۨۘ۬ۢۨۘۙۛۜۘۧۤ۬ۚۥۥ۠ۚۙۖۢ۠";
                            break;
                        } else {
                            str4 = "ۜ۟ۖۘۥۘۗ۫ۡۘۨۦۦۘۗۡۘ";
                            continue;
                        }
                    case -1459128533:
                        break;
                    case 1791794026:
                        str4 = "۫ۗۜۘۧ۫ۜۘۤ۠ۥۜۛۖۘۤۨۛۛۚۗ۟ۚ۟۬ۢ۟ۖ۫";
                        continue;
                    case 2109247661:
                        initSS_Del();
                        break;
                    default:
                        continue;
                }
            } catch (Exception e2) {
            }
        }
        arrayList2.addAll(e(stripJID));
        try {
            String string = f559f.getString(stripJID, (String) null);
            String str5 = "ۡۘۦۘۜۚۘ۬ۗۚۙۚۥۜ۬۟۠ۦۘۖۧۦۘۨ۠ۡۘۢ۫ۡ";
            while (true) {
                switch (str5.hashCode() ^ -1959141035) {
                    case -430510039:
                        str5 = "۫ۤ۠۬ۗۢۚۜۨۘ۫۠ۡۘۤۤۜ۫ۦۧۖۖۘ";
                        continue;
                    case -28890195:
                        break;
                    case 133113960:
                        if (string != null) {
                            str5 = "ۛۙۙ۫ۥۚۙۢۙۨۧۢ۫ۚۜۥۥۚۥۛۡۥۛ";
                            break;
                        } else {
                            str5 = "ۧۜۢۨۦۨۘۚۚ۫ۧۛۜۘۖۧ۬ۢۛۥ۬ۢۤۧۢۘۘ";
                            continue;
                        }
                    case 499369039:
                        String str6 = "ۘۖۜۘ۬ۡۘۜۘۗۖ۬ۙۛۘۧۥۖۦۚۡۘ۬۟۬ۖۖۛ";
                        while (true) {
                            switch (str6.hashCode() ^ 666408765) {
                                case -1537135909:
                                    break;
                                case -1484804790:
                                    if (!string.isEmpty()) {
                                        str6 = "ۘۧۦۘۙۖۘۜۖۢ۟ۧ۟ۜۢۖۘ";
                                        break;
                                    } else {
                                        str6 = "ۛۖۚ۫۠ۤ۠ۘ۠۠ۜۧۘۤۦۖۘۙۜۥۘۤ۟۠";
                                        continue;
                                    }
                                case -689636992:
                                    arrayList = (ArrayList) f560g.fromJson(string, f561h);
                                    break;
                                case 1753668588:
                                    str6 = "ۖۦۨۤۨ۬ۛ۫ۜۧ۫ۖۘۥۚ۫ۢۥۜ۠۟ۖۘ۟ۧ۫";
                                    continue;
                                default:
                                    continue;
                            }
                        }
                        break;
                }
            }
        } catch (Exception e3) {
        }
        arrayList2.addAll(arrayList);
        f556c = arrayList2;
        arrayList = new ArrayList();
        arrayList2.addAll(arrayList);
        f556c = arrayList2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0138, code lost:
        r0 = "۠ۚۖۢ۬ۦۚۨۧۦۢۧ۬ۚۜۘۘۤۥۧۘۛۧۘۘ۫۠ۗ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void initSS_Del() {
        /*
            r14 = 6
            r2 = 0
            r5 = 0
            java.lang.String r0 = "ۖۧۘۜۙۥ۟ۜ۟۠ۚۥۘۙۥۢۗۥ۟ۚۢۦۡ۬ۨۘ"
            r1 = r2
            r3 = r2
            r4 = r5
            r6 = r5
            r7 = r5
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r5
        L_0x000e:
            int r2 = r0.hashCode()
            r12 = 59
            r13 = 115602673(0x6e3f4f1, float:8.574782E-35)
            r2 = r2 ^ r12
            r2 = r2 ^ r13
            switch(r2) {
                case -1955775777: goto L_0x0076;
                case -1881419686: goto L_0x001d;
                case -1624321374: goto L_0x013c;
                case -1319958028: goto L_0x00c8;
                case -1247705507: goto L_0x00f6;
                case -938408546: goto L_0x0081;
                case -745800601: goto L_0x00a8;
                case -700711524: goto L_0x00af;
                case -675953897: goto L_0x004c;
                case -581625668: goto L_0x0098;
                case -308805362: goto L_0x00a1;
                case -231819895: goto L_0x0059;
                case -185083258: goto L_0x0134;
                case -134525371: goto L_0x0029;
                case -44896117: goto L_0x0040;
                case -36286628: goto L_0x0046;
                case 212905508: goto L_0x0122;
                case 842498678: goto L_0x003a;
                case 974306290: goto L_0x00bd;
                case 1160259332: goto L_0x0085;
                case 1391614841: goto L_0x0031;
                case 1398348907: goto L_0x008f;
                case 1452855953: goto L_0x008b;
                case 1586921185: goto L_0x00d7;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x000e
        L_0x001d:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            int r2 = r0.get(r14)
            java.lang.String r0 = "ۖ۠۠ۢ۠ۖ۠ۡۛ۫ۗ۫ۥۛۨۥۚۢ۠۠ۥۘۦۥۡۘۛۜۛ"
            r11 = r2
            goto L_0x000e
        L_0x0029:
            android.content.Context r2 = com.obwhatsapp.yo.yo.getCtx()
            java.lang.String r0 = "ۨۖۛۗۨ۬ۦۜۘۖۤۚ۟ۧ۟ۦۦۜۘۘ۠ۖ"
            r10 = r2
            goto L_0x000e
        L_0x0031:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "ۨۛۨۘۡۦۚۨۘ۠۠ۨۘۛ۟ۦۗۘۨۨ۟ۘۜ۬ۖ"
            r9 = r2
            goto L_0x000e
        L_0x003a:
            java.lang.String r2 = f562i
            java.lang.String r0 = "۬ۥۤۢ۠ۧ۠ۜۡۜ۫ۜۥۚۚ۠ۦۦ"
            r8 = r2
            goto L_0x000e
        L_0x0040:
            r9.append(r8)
            java.lang.String r0 = "ۨ۫ۡۘۡۦۢ۟ۖۜۘ۬ۥ۫ۚۢ۬۟ۥۤ"
            goto L_0x000e
        L_0x0046:
            r9.append(r11)
            java.lang.String r0 = "ۖۡۤ۫ۤۖۙۧۥۥۘۧۘۘۥۦۘۨۢۜۘۖۤۚۙۖ"
            goto L_0x000e
        L_0x004c:
            java.lang.String r0 = r9.toString()
            android.content.SharedPreferences r0 = r10.getSharedPreferences(r0, r5)
            f558e = r0
            java.lang.String r0 = "ۘ۟ۜ۫ۙ۠ۥۥۗۤۡۨۘۛۡ۫ۗۜۤۦۨ"
            goto L_0x000e
        L_0x0059:
            r2 = 1828332433(0x6cfa2391, float:2.4191953E27)
            java.lang.String r0 = "ۢۗۘۘۖۤۜۥۛۖ۫ۥۜ۬ۤۧۙۚۨۧۖۘ"
        L_0x005e:
            int r12 = r0.hashCode()
            r12 = r12 ^ r2
            switch(r12) {
                case -1933457381: goto L_0x0073;
                case -1385098521: goto L_0x0067;
                case 412690571: goto L_0x0130;
                case 1449634308: goto L_0x0070;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x005e
        L_0x0067:
            r0 = 1
            if (r11 != r0) goto L_0x006d
            java.lang.String r0 = "ۧۨ۬ۗ۠۬ۧ۬ۥۘۜۗۙۛۦۢۛۖۧۘ"
            goto L_0x005e
        L_0x006d:
            java.lang.String r0 = "ۗۘۡۘۙۜۚ۬ۙۘۘۨۦ۫ۗۖۙۚ۟ۜۘ"
            goto L_0x005e
        L_0x0070:
            java.lang.String r0 = "ۚۡ۠ۦۗۦ۟ۡۖۘۛۜ۠ۧۜۖۘ۟ۦۘ۫ۢۜ"
            goto L_0x005e
        L_0x0073:
            java.lang.String r0 = "ۤ۬ۢۚۘۖۢۜۧۛۥۗۨۧۜ۠ۛۨۡۦۛۤۘۜۘۛۦۘ"
            goto L_0x000e
        L_0x0076:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            int r7 = r0.getActualMaximum(r14)
            java.lang.String r0 = "ۤۘۧۘ۫ۢۨ۫ۚۜۘ۬ۥۧۘۥۨۘ"
            goto L_0x000e
        L_0x0081:
            java.lang.String r0 = "ۙۦۖۘۤۥۢ۟ۗۡۘۚۦۥۚ۫ۥۘۗۡۙ۠ۛۙۢۢۗ"
            r6 = r7
            goto L_0x000e
        L_0x0085:
            int r2 = r11 + -1
            java.lang.String r0 = "ۛۙۘ۬۠ۡۘۢ۟۟ۗۜۗۗۨۙۧۧۨۧۨۨۧۙ۟"
            r4 = r2
            goto L_0x000e
        L_0x008b:
            java.lang.String r0 = "ۜۧۘۗۙۜۘۧۢۢۦۖ۠ۘ۫۟ۡ۬ۤ"
            r6 = r4
            goto L_0x000e
        L_0x008f:
            android.content.Context r2 = com.obwhatsapp.yo.yo.getCtx()
            java.lang.String r0 = "۠ۢۜ۬ۚۘۡۨۧۘ۬ۗۢ۠ۦ۫"
            r3 = r2
            goto L_0x000e
        L_0x0098:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ۙۧ۫۠۬ۨۘۥۛۨۘۜۖۨ۫ۡۤۘۗۡ۫ۙۡۤۘۨ"
            goto L_0x000e
        L_0x00a1:
            r1.append(r8)
            java.lang.String r0 = "ۖۧۜۘۙۙ۬ۤۥۘۨۘۦۘۚۖۘۘ۫ۛۧۖۨ۫ۥۢۢ"
            goto L_0x000e
        L_0x00a8:
            r1.append(r6)
            java.lang.String r0 = "ۧۖۧۘۥۜۨۘۧۘۙۤ۠ۗۢۢۥۘۛۥۧۗۖۘۥ۠۫ۜۖۗ"
            goto L_0x000e
        L_0x00af:
            java.lang.String r0 = r1.toString()
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r0, r5)
            f559f = r0
            java.lang.String r0 = "ۦ۬ۜۘ۟ۘۧۘۘۚۥۜۖۗۥۡۢۜۥۡ"
            goto L_0x000e
        L_0x00bd:
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            f560g = r0
            java.lang.String r0 = "ۗۖۥۘ۠ۜ۟ۚۥ۫ۜۖۤۡۘۚۨۡۗۚۡۘۢۛۢۗۧ"
            goto L_0x000e
        L_0x00c8:
            com.obwhatsapp.yo.SS$1 r0 = new com.obwhatsapp.yo.SS$1
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            f561h = r0
            java.lang.String r0 = "ۥۤۖۨ۬ۥۦۚۨ۬۟۟ۤۛۖۘ۠ۚۨۜۘۚ"
            goto L_0x000e
        L_0x00d7:
            r2 = 752295328(0x2cd71da0, float:6.1139566E-12)
            java.lang.String r0 = "ۜۜۧۘۦۙۧۘ۬ۧۤۚۥۘۢۡۧۘۦۘۦۛۤۡۜۨۦ۠۫"
        L_0x00dc:
            int r12 = r0.hashCode()
            r12 = r12 ^ r2
            switch(r12) {
                case 212091806: goto L_0x0138;
                case 566432414: goto L_0x00e5;
                case 985966585: goto L_0x00f3;
                case 1954844120: goto L_0x00ec;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            goto L_0x00dc
        L_0x00e5:
            java.lang.String r0 = "ۧۨ۟ۨۛۛ۠۫ۥ۠ۦۨ۟ۥۥۘۢۚۛۗۡۢۗۘۘ"
            goto L_0x000e
        L_0x00e9:
            java.lang.String r0 = "ۖ۠۠ۗ۠ۢۘۚۨۘۗۛۦۘ۠ۗۘۘۢۧۥ"
            goto L_0x00dc
        L_0x00ec:
            int r0 = r11 % 30
            if (r0 != 0) goto L_0x00e9
            java.lang.String r0 = "ۦۜۥۙۗۦۚۧۙۚۘۦ۟ۜ۫"
            goto L_0x00dc
        L_0x00f3:
            java.lang.String r0 = "ۗۙۥۘۗۗ۬ۖۜۨۘ۫ۛۗۢ۫ۖ۬ۖۨ۬ۧ۬ۙۡ۬"
            goto L_0x00dc
        L_0x00f6:
            r2 = -897316158(0xffffffffca840ac2, float:-4326753.0)
            java.lang.String r0 = "ۘۥۙۛۢۖۦۛ۠ۖۦۜۧۨۖۘۜ۟ۖۖۢۤۙۦۤۜۖۙ"
        L_0x00fb:
            int r12 = r0.hashCode()
            r12 = r12 ^ r2
            switch(r12) {
                case -263160408: goto L_0x011f;
                case -7351058: goto L_0x0104;
                case 1860831830: goto L_0x010b;
                case 1999431846: goto L_0x0138;
                default: goto L_0x0103;
            }
        L_0x0103:
            goto L_0x00fb
        L_0x0104:
            java.lang.String r0 = "ۦۥۦۡۜۙ۠ۧۥۚۥۘۢۗۜۚۙۗۥۗۗ"
            goto L_0x000e
        L_0x0108:
            java.lang.String r0 = "ۥ۫ۢۧۛ۠ۡۢ۟ۗۖۢۡ۟ۤۥۘ"
            goto L_0x00fb
        L_0x010b:
            android.content.SharedPreferences r0 = f558e
            r12 = -12836002954689(0xfffff453629a823f, double:NaN)
            java.lang.String r12 = com.joom.paranoid.Deobfuscator$app$Custom.getString(r12)
            boolean r0 = r0.getBoolean(r12, r5)
            if (r0 != 0) goto L_0x0108
            java.lang.String r0 = "ۚۥۡۘۥۨۤۧۜۧۘ۟ۛ۬ۨۥۛۗ۠ۦ"
            goto L_0x00fb
        L_0x011f:
            java.lang.String r0 = "ۗۦۥۢۛۘۘ۬ۗۘ۠ۗ۫ۛۜۖۢۜۥۘ"
            goto L_0x00fb
        L_0x0122:
            java.util.concurrent.Executor r0 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            com.obwhatsapp.yo.g0 r2 = new com.obwhatsapp.yo.g0
            r2.<init>(r11, r6)
            r0.execute(r2)
            java.lang.String r0 = "۠ۚۖۢ۬ۦۚۨۧۦۢۧ۬ۚۜۘۘۤۥۧۘۛۧۘۘ۫۠ۗ"
            goto L_0x000e
        L_0x0130:
            java.lang.String r0 = "ۡۖۘۘۧۘۙ۠ۦۨۙۦۡۚ۠ۙ"
            goto L_0x000e
        L_0x0134:
            java.lang.String r0 = "ۜۧۘۗۙۜۘۧۢۢۦۖ۠ۘ۫۟ۡ۬ۤ"
            goto L_0x000e
        L_0x0138:
            java.lang.String r0 = "۠ۚۖۢ۬ۦۚۨۧۦۢۧ۬ۚۜۘۘۤۥۧۘۛۧۘۘ۫۠ۗ"
            goto L_0x000e
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.SS.initSS_Del():void");
    }

    public static void setCP(int i2) {
        String str = "ۛۘۜۡۥ۠ۙۚۤ۟۠ۛۡۦۘۦ۠ۗ";
        while (true) {
            switch ((str.hashCode() ^ 658) ^ 869672966) {
                case -2136203918:
                    String str2 = "۟ۧۧۘۧۙۡۢۘۘۗۛۚ۠ۨۗ۟۟ۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 913972579) {
                            case -1878467856:
                                if (p0.currPlaying == i2) {
                                    str2 = "۠ۧۡۘۥ۠۠۠ۨۙۡ۠۫ۦۚ۫۬ۜۡ۫ۡۗۜۢۦۘ";
                                    break;
                                } else {
                                    str2 = "ۤۜۜۘۙۙ۠ۤۜۧۥۜۙۡۡ۫";
                                    break;
                                }
                            case -1340100610:
                                str = "ۡۗۜۘۘۥۜۘۢۜۗ۬۫ۨۘۛ۫ۧ";
                                continue;
                            case -1301938804:
                                str = "ۘۡ۠۟ۙۡ۟۬ۜۘۗۤۗۤ۠ۢۛۖۜۘۖۡۤ";
                                continue;
                            case -1242801745:
                                str2 = "۟ۦۥۛۛ۠ۤۛۛۢۢۧۥۥۥۤۚۙۜۘۡۦ۟ۘۨۚ";
                                break;
                        }
                    }
                    break;
                case -2088613255:
                    p0.currPlaying = i2;
                    str = "ۡۗۜۘۘۥۜۘۢۜۗ۬۫ۨۘۛ۫ۧ";
                    break;
                case -383074582:
                    str = "ۧۚۧۗ۫ۥۤۛۘ۫ۚۤۦۘۙۡ۬ۧ";
                    break;
                case 1360819218:
                    return;
            }
        }
    }

    public static void setPlaybackContactFragment(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        String str = "ۨ۟ۘ۫ۢۤۤۨۛۘۥۦۨۥۚۨۢۗ۬ۚۘۘۥ۟ۙۤۖۥ";
        while (true) {
            switch ((str.hashCode() ^ 729) ^ -1425815624) {
                case -1999518967:
                    return;
                case -251948175:
                    str = "۬ۡۥۙۡۘۨۚ۠ۤ۟ۜۘۖۦۚۙۜۡۘۦۗۡۘۚ۬ۛۖ۬ۦۘ";
                    break;
                case 1917580587:
                    p0.mStatusPlaybackContactFragment = statusPlaybackContactFragment;
                    str = "۠۠ۗۙ۫ۘ۠ۧۦۘۚ۬ۡۘ۟ۨۚۨۘۥۘۦۡۦۘۚۦ۠ۛ۟";
                    break;
            }
        }
    }

    public static void setSSDateTV(TextView textView) {
        String str = "۠۬۟ۙۘۤۛۘۖۘۧۡۛۚ۟ۜۘۛۙۙ۬ۜۘۤۚۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 494) ^ 800133273) {
                case -1988032220:
                    f557d = new WeakReference(textView);
                    str = "ۥۖۙۢۤۢۡۧۖۘۛۤ۠۫ۚ۫ۢ۟ۘۘ۠۫ۘۘ۫ۗۛ";
                    break;
                case 233388469:
                    return;
                case 1600632433:
                    str = "ۦ۟ۚۧۘۚۧۡۡۘۚ۟ۨ۫۟ۢۨۥۦۘ";
                    break;
            }
        }
    }

    public static void setVw(View view) {
        String str = "ۛۖۦۛۤۦ۟ۜۥۖ۬ۛۚۧۗۜۧ۠ۖ۟ۨۘ۬ۥۛ";
        while (true) {
            switch (str.hashCode() ^ 685118396) {
                case -1665504485:
                    return;
                case -1137340178:
                    str = "ۛۗ۟ۜ۟ۧۛۙۖ۠ۨ۬ۦۘۨ۠ۚۧۖۢۙ۬۬ۤ۠ۥۡۘ";
                    break;
                case 651034027:
                    try {
                        ImageView imageView = (ImageView) view.findViewById(yo.getID("div2", "id"));
                        if (!shp.getBooleanPriv("yoHideDlBtn", true)) {
                            imageView.setVisibility(4);
                        } else {
                            GOLD.ACI(imageView);
                            imageView.bringToFront();
                            imageView.setOnClickListener(new c(view, 3));
                        }
                        ImageView imageView2 = (ImageView) view.findViewById(yo.getID("div", "id"));
                        GOLD.ACI(imageView2);
                        String str2 = "ۨۤۦۛۙۢۖۛ۫۬۬۬ۨۚ۠۬ۗۖۘ";
                        while (true) {
                            switch (str2.hashCode() ^ 525389829) {
                                case -1740684947:
                                    imageView2.setVisibility(4);
                                    return;
                                case -1709244002:
                                    if (!shp.getBooleanPriv("yoHideStatViewV2", true)) {
                                        str2 = "۠ۜۙۛ۟ۖۢۖۡۙۜۖۚۥۛۧۘۧۘۙ۠ۢۨ۠ۛۥۖۘ";
                                        break;
                                    } else {
                                        str2 = "ۡۗۛۚۖۜۗۦ۬ۙ۬۬ۜۘۗۜ۬ۢۦۤۨۜۙۜۘ";
                                        break;
                                    }
                                case -1626279120:
                                    str2 = "ۘۖۥۛۡۡۘۘۙۘۛۡۖۨ۬";
                                    break;
                                case -1500044860:
                                    imageView2.setVisibility(0);
                                    imageView2.bringToFront();
                                    imageView2.setOnClickListener(new a0(4));
                                    return;
                            }
                        }
                    } catch (Exception e2) {
                        return;
                    }
                    break;
                case 1737334803:
                    if (view == null) {
                        str = "ۧۘ۬ۧ۬ۨۦۤۖۘۤۖۨۘۜ۟ۜۢۗۜۙ۟ۥ";
                        break;
                    } else {
                        str = "ۛۖۧۖۢۥ۬ۙۢۥۖ۬۬ۢۖۖ۠ۨۘۧۚۢۡۢ۫ۦۚۨ";
                        break;
                    }
            }
        }
    }
}
