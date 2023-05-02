package com.obwhatsapp.youbasha.ui.views;

import X.AnonymousClass00T;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import com.google.gson.internal.i;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.a0;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import okhttp3.internal.http.StatusLine;

public class YoFABView extends FrameLayout {

    /* renamed from: e  reason: collision with root package name */
    public static final int f1401e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1402a;

    /* renamed from: b  reason: collision with root package name */
    public int f1403b;

    /* renamed from: c  reason: collision with root package name */
    public int f1404c;

    /* renamed from: d  reason: collision with root package name */
    public double f1405d;

    public YoFABView(Context context) {
        super(context);
        this.f1402a = context;
    }

    public YoFABView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1402a = context;
    }

    public YoFABView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1402a = context;
    }

    @RequiresApi(api = 21)
    public YoFABView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f1402a = context;
    }

    public static void a(FloatingActionButton floatingActionButton) {
        String str = "ۡۘۧۘۢ۬ۛ۬ۧۥۘۤۜۜۦۖۤۧۙۥۧۨ";
        while (true) {
            switch ((str.hashCode() ^ StatusLine.HTTP_PERM_REDIRECT) ^ -252522440) {
                case -1870107324:
                    return;
                case -524690340:
                    floatingActionButton.setMaxWidth(0);
                    str = "ۨۨۦۘۖۡۜۥۥۖۜۨۨۘۢۜۥۘۦۧۜ";
                    break;
                case 194783511:
                    floatingActionButton.setVisibility(8);
                    str = "ۤ۠۟ۗۤۖۢ۬ۨۙۛۥۘ۫ۖۤ۬ۜۦۘۥۧۘ";
                    break;
                case 917101616:
                    floatingActionButton.setMaxHeight(0);
                    str = "ۥۘ۟ۖۛۦۨۛۚۢ۟ۨۢۘۘ۫ۗۨۘۘۤۨۗۖۦ";
                    break;
                case 1587633729:
                    str = "ۜۤۜۘۖۜۘۡ۟۟ۖۘ۠ۗۨ";
                    break;
            }
        }
    }

    public static void b(FloatingActionsMenu floatingActionsMenu) {
        int i2 = 0;
        String str = "۬۟ۦۜۥ۬ۘۡ۬۠ۚ۬۫ۗ";
        FloatingActionButton floatingActionButton = null;
        FloatingActionButton floatingActionButton2 = null;
        FloatingActionButton floatingActionButton3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        FloatingActionButton floatingActionButton4 = null;
        while (true) {
            switch ((str.hashCode() ^ 802) ^ 1321753547) {
                case -1941135232:
                    a(floatingActionButton3);
                    str = "ۤ۠ۥۘ۟۟۫ۚ۟ۘۨ۠ۗ۫ۢ۬۟ۥ۠";
                    break;
                case -1893350208:
                    floatingActionButton3.setOnClickListener(new a0(7));
                    str = "ۜۛۖۘ۟ۜۡۘۤ۟۠ۡ۬ۧۡۧۖۘۧۤۧۛۛۛ۬ۤۘۗۗۦۘ";
                    break;
                case -1800952179:
                    floatingActionButton4.setOnClickListener(new a0(6));
                    str = "ۥ۫ۡۜ۟ۛۖۨۙۚ۠ۧۡۘۥۨۥۨۘۘ۟ۙ";
                    break;
                case -1290399655:
                    str = "ۡ۫ۘۘۘ۟۬۟ۙۜۦ۫ۨۘۡۗۜۘۙۖۢۡۦۦۘۙۖۚ";
                    break;
                case -1246214969:
                    str = "ۚۤۦۡ۫ۥۙۥۧۘۙ۟ۚ۬ۥۜۘ";
                    break;
                case -1173384220:
                    str = "ۤۗۚۛۢۧ۠ۥۛ۟۟ۥ۬ۜۚۨ۠ۢۢ۬ۦۘ۟ۥۘ";
                    str3 = str4;
                    break;
                case -903371386:
                    str = "ۥۢۦۙۖ۠ۚۛۡ۫ۦۧۛۡۦۘۙۡۥ۬ۚۡۦۛ۫";
                    floatingActionButton3 = (FloatingActionButton) floatingActionsMenu.findViewById(yo.getID("action_a", "id"));
                    break;
                case -779068828:
                    str = "ۜۛۖۘ۟ۜۡۘۤ۟۠ۡ۬ۧۡۧۖۘۧۤۧۛۛۛ۬ۤۘۗۗۦۘ";
                    break;
                case -759811315:
                    str = "ۙۙۢۛ۟ۥۚۘۘۦۥۡ۬ۖ۫";
                    floatingActionButton = (FloatingActionButton) floatingActionsMenu.findViewById(yo.getID("action_l", "id"));
                    break;
                case -729279925:
                    String str5 = "ۘۙۜۡۧۡۘۡۡۜۧۦۘۨۥۖۘ۠ۧۤۢۜۗ";
                    while (true) {
                        switch (str5.hashCode() ^ -505192981) {
                            case -1162286393:
                                str = "ۘ۠ۘۘۨۗۜۨۗۘۘۛۛۡۘ۫ۚۘۘ";
                                continue;
                            case 842369309:
                                str5 = "ۖۧۡۥ۫ۨۘۢۡۜۚۙۗۨۘۛۙۗۜۤۧۛۡۚۙۚ۠";
                                break;
                            case 1936826687:
                                if (!shp.getBoolean("hide_action_m")) {
                                    str5 = "ۢ۫ۘۤۥۦۤۙۘۘۧۧۘۗۘۥۘۜ۫۫ۛ۬";
                                    break;
                                } else {
                                    str5 = "۟ۗۤۢۗ۠۠ۙۦۘۨۤۢۢۥۨۖۨۘۡۚۘۘ";
                                    break;
                                }
                            case 2053156841:
                                str = "۬ۚۘۡۡۜۘ۠ۢۥۚ۬۠ۨ۠۫۠ۧۥۘۜۧۜۨۜ";
                                continue;
                        }
                    }
                    break;
                case -544172091:
                    str = "ۗۜۥۚۙۘۡۡۘۨۥۢۤۤۜۚۨۘۖۙۗۗ۫۬";
                    floatingActionButton4 = (FloatingActionButton) floatingActionsMenu.findViewById(yo.getID("action_b", "id"));
                    break;
                case -286822520:
                    floatingActionButton.setOnClickListener(new a0(9));
                    str = "ۧ۬ۤۛۥۜۖ۟۬۫ۤۖۚ۠ۜۦۢۖۘ";
                    break;
                case -269753389:
                    String str6 = "ۧۛۥۦ۠ۤۖۢۢ۬ۜۘ۬ۜۡۜ۬ۖ";
                    while (true) {
                        switch (str6.hashCode() ^ -1810373542) {
                            case -1829122342:
                                if (!shp.getBoolean("hide_action_l_v2", true)) {
                                    str6 = "ۙۥۤ۠ۥ۫ۢۛۜ۬ۙۨۢ۠۟ۚ۠ۡۘ";
                                    break;
                                } else {
                                    str6 = "ۚۦ۬ۜۥۡۘ۟ۤ۟ۘۨۖۙۥ۫ۤۙۥۗ۟ۥۜۗ";
                                    break;
                                }
                            case -985059807:
                                str6 = "ۥۙۦ۫ۥۦۘۗۛۡۜۢ۬۠۠ۙ";
                                break;
                            case 1601237474:
                                str = "ۦۙۨۤۡۗۦۥۦۥۧۨۘۙ۠ۙۚۚۜۘۘۥ۫ۢۢۨۘ۬ۢۡۘ";
                                continue;
                            case 2143814216:
                                str = "۟ۙۚ۬ۛۦۘۤۤۨۙ۬ۥۙۢۥۛۗ۬۟۠ۤ";
                                continue;
                        }
                    }
                    break;
                case -229393497:
                    str = "ۘۤۡۘۤۤۡۘۡ۠ۥۖۥۜۘۡۗ۟ۥ۫ۖۙۘۡۗۨ۟ۥ۬ۨ";
                    str2 = "laston";
                    break;
                case -32070302:
                    floatingActionButton4.setImageDrawable(AnonymousClass00T.A04(yo.getCtx(), i2));
                    str = "ۡ۫ۘۘۘ۟۬۟ۙۜۦ۫ۨۘۡۗۜۘۙۖۢۡۦۦۘۙۖۚ";
                    break;
                case 29582257:
                    String str7 = "ۧۗۜۘۙۢۙۚۘ۫۬ۢۧ۠۟ۢۗۚۖۘۘ۟۬ۧۛ۟";
                    while (true) {
                        switch (str7.hashCode() ^ -982687688) {
                            case -1571572358:
                                str = "ۨ۫ۥۦ۟۠۬ۚۘۘۙۦۦ۠ۧ";
                                continue;
                            case -156413565:
                                str = "ۛۥۚۨۧۖۘۢ۠ۖۘۢۜۡۘۜۖ۠";
                                continue;
                            case 765888889:
                                str7 = "ۜۛۜۘۖۢۤۤۧۥۘۚۤ۫۫ۨۥۘۗۡۦ۠ۗۤۙۚۛۤۛ";
                                break;
                            case 858045214:
                                if (!shp.getBoolean("hide_action_b")) {
                                    str7 = "ۗۙۜۘۙۥۤۘۚۥۗۗۡۘۨ۫ۥۢۙۤۧۥۢۦۘۦ";
                                    break;
                                } else {
                                    str7 = "ۖ۟ۢۖ۟۫ۧۢۙ۠ۥۘۘ۫ۢۦۧۤۥۘۚۧۘۘ۬۠۫ۖۨۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 96028954:
                    str = "ۧ۬ۤۛۥۜۖ۟۬۫ۤۖۚ۠ۜۦۢۖۘ";
                    break;
                case 194172964:
                    a(floatingActionButton4);
                    str = "ۦ۬ۙۤۤۡۜۜۚ۠ۨۛۨۜۧۘۥۖۡۨۜۨ";
                    break;
                case 302646061:
                    a(floatingActionButton);
                    str = "ۨ۠ۥۘۚۧۨۧۢ۟ۛۖ۠ۜۢۗۚۖۡۘ";
                    break;
                case 442875424:
                    a(floatingActionButton2);
                    str = "ۙۢۨۗۧ۫ۥۢۘۘۛۙۜۤۜ۟ۡۖۨ۫ۡۢۥۢۥ";
                    break;
                case 667949348:
                    str = "ۦۖۦۘ۫ۢۛۘۡ۫ۗۦ۬۬ۗۦۘۨ۠ۗۚۜ۫";
                    break;
                case 898509230:
                    return;
                case 1067944900:
                    str = "ۚۢۘۚۛۤۨۨ۠ۥۤۜۘ۠ۜۨۤۘۚ";
                    floatingActionButton2 = (FloatingActionButton) floatingActionsMenu.findViewById(yo.getID("action_m", "id"));
                    break;
                case 1375597156:
                    str = "ۖۦۘۛۖۖۚۜۧۧۦۤۨۚۨۘۘۥۨۘ۟ۥۥۘ";
                    i2 = yo.getID(str3, "drawable");
                    break;
                case 1689328506:
                    floatingActionButton2.setOnLongClickListener(new p());
                    str = "ۦۖۦۘ۫ۢۛۘۡ۫ۗۦ۬۬ۗۦۘۨ۠ۗۚۜ۫";
                    break;
                case 1937605651:
                    floatingActionButton2.setOnClickListener(new a0(8));
                    str = "ۦۥۥۘۜ۫۟۬۫ۚ۬ۙۡ۟ۖۥۘۙۗۡۥۤۢۨۖۨۘۗۘۥۘ";
                    break;
                case 2038604337:
                    str4 = "lastoff";
                    str = "ۜۨۤۚۗۙ۬ۡۧۘ۟۬ۘۜۤۖۘ۟ۡۜ۬ۨۥۦۤۨ۟ۦۤ";
                    break;
                case 2062157854:
                    str = "ۚۤۦۡ۫ۥۙۥۧۘۙ۟ۚ۬ۥۜۘ";
                    str3 = str2;
                    break;
                case 2091714370:
                    str = "۟ۦۙۧۘۨ۫۠۫ۜۦ۬ۜۡۘۧۥۢ۬ۖۘ";
                    break;
                case 2092487563:
                    String str8 = "ۗ۠ۨۘۜۢۖۘۡۛۘۘۥۧۥ۫ۙۦۘۢۤۡۘ۠۫ۖۘ";
                    while (true) {
                        switch (str8.hashCode() ^ 1905028962) {
                            case -1760865300:
                                if (!shp.getBoolean("hide_action_a")) {
                                    str8 = "ۗۙۦۘۚۘۜۘ۬۟ۗۚ۫ۜۧۚ۬ۜۛۥۘ";
                                    break;
                                } else {
                                    str8 = "ۗۨۙۦۨۡۖ۟۟ۙ۬ۢۘ۬ۖۛۤ۟ۖۘۘۚۡۖ";
                                    break;
                                }
                            case -1606028550:
                                str = "۠ۤۙۗۢۖۖۛۨۢۛ۟ۢ۠ۦۘ";
                                continue;
                            case -1444713217:
                                str8 = "ۡۧ۬ۥۧۨۡۚۢۡۜۢ۟ۡۘ";
                                break;
                            case 650048020:
                                str = "۟۟ۘۘۢۖۘۘۤۡۤۗۘۘۦۖۧۘ۬ۨۧۛ۠۬ۢۚۢ";
                                continue;
                        }
                    }
                    break;
                case 2140069479:
                    String str9 = "ۚ۠۠ۧۥۘ۫ۨ۟ۢ۟ۤۢۜ۠ۥ۫ۖۤۧۧۛۛۜۨ۠ۚ";
                    while (true) {
                        switch (str9.hashCode() ^ 1027759483) {
                            case -1174108029:
                                str9 = "ۥۖۘۘۢۚ۟ۛ۬ۨۘۤ۬ۜۘۚۘۖ";
                                break;
                            case -184040832:
                                if (!yo.yoHideSeen()) {
                                    str9 = "ۥ۬۟۟ۢۚۜۡ۠ۦ۬ۗ۫ۥۨۘۥ۬ۥۘ";
                                    break;
                                } else {
                                    str9 = "ۦۥۗۗۢ۫ۧۡۙۜۚۦۙۗۘۘۥۘۘۦۤ۬";
                                    break;
                                }
                            case 1888401730:
                                str = "ۜ۬ۗۛۡۦۥ۠ۦۥۘ۫۬ۜۗ۟۬";
                                continue;
                            case 2079883366:
                                str = "ۡۤۤۧۙۘ۠ۡۘۘۤۡۘۨ۬ۡۘۘۛۗۖۚۨۘ";
                                continue;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean hideStatusSplitterFAB() {
        /*
            java.lang.String r0 = "ۘۦۥۙ۟۫ۗۤۨۛۘۧۘۦۥۤ۟۟ۤۥ۫۟ۨۧ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 507(0x1fb, float:7.1E-43)
            r3 = -1120176315(0xffffffffbd3b7745, float:-0.04576804)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1529419552: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "hide_action_s"
            boolean r0 = com.obwhatsapp.yo.shp.getBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.YoFABView.hideStatusSplitterFAB():boolean");
    }

    public void hideFB(FloatingActionsMenu floatingActionsMenu) {
        String str = "ۡۦ۠۟ۜۧۗ۬ۜۢۥۨۢۥۖۖ";
        while (true) {
            try {
                switch (str.hashCode() ^ 2040257414) {
                    case -1567471359:
                        floatingActionsMenu.setVisibility(8);
                        break;
                    case -1142233406:
                        floatingActionsMenu.setVisibility(0);
                        break;
                    case -1079559313:
                        str = "ۗ۬۠ۨۚۖۖۙۤ۠۟ۡۥۛۜۨۗ۠ۢ۬ۖ";
                        continue;
                    case -733369706:
                        if (!shp.getBoolean("hide_fab")) {
                            str = "ۘۙۦۘۥ۠ۦۘۚۡ۠ۦۛۚۢ۟ۥۘۧۘۜ۬ۚۜۤۖۘۘۖۧۦ";
                            break;
                        } else {
                            str = "ۢۖۦ۠۬۫ۥۢۥۜۜۘۘۤ۫ۛۢۥۥ";
                            continue;
                        }
                    default:
                        continue;
                }
            } catch (Exception e2) {
                return;
            }
        }
        b(floatingActionsMenu);
    }

    public void onAttachedToWindow() {
        String str = "ۗۜۥۘۖۛۤۘۤ۠ۧ۬ۛۛ۟۬ۖۧۜ۫ۧ۠ۚۖ۬ۙۚ۠";
        while (true) {
            switch ((str.hashCode() ^ 164) ^ -627874884) {
                case -96462881:
                    str = "ۚۢۙۛ۟ۜۡۥۦۤ۠ۦۘۙۥۦۘۥۚۛۜۗۧۡۧ";
                    break;
                case 1406977813:
                    return;
                case 1685557227:
                    super.onAttachedToWindow();
                    str = "ۤۤۚ۟ۜۛۧۗۡۜۛۦۡۢ۠ۥۧۥۙۨ";
                    break;
            }
        }
    }

    public void onFinishInflate() {
        double d2 = 0.0d;
        String str = "ۜ۬ۖ۟۟ۢۚۥۚۡۛۤۚ۟ۜۘۦۦۜۘۡۡۨۘۘۙۦ";
        DisplayMetrics displayMetrics = null;
        Configuration configuration = null;
        ImageView imageView = null;
        FloatingActionsMenu floatingActionsMenu = null;
        while (true) {
            switch ((str.hashCode() ^ 375) ^ -874861830) {
                case -1764888229:
                    imageView.setVisibility(8);
                    str = "ۗۨ۫ۜۚ۠ۙۥ۟ۢ۠ۜۚۨۘۥۛۘۘۤۖ۫";
                    break;
                case -1753608948:
                    str = "ۥۤۗۧۜۡۘۗۛۘۘ۟ۗ۫ۤۙۦۘ۬ۧۛۙۙۙۚۢۢ";
                    break;
                case -1508679266:
                    imageView.setOnClickListener(new f(floatingActionsMenu, 1));
                    str = "ۡ۫ۦۘ۠ۚۘ۫ۢۥۘۖۦۚ۟ۨۤۧۘۜۘۡۛ۟ۡۘۚۗ۠ۘ";
                    break;
                case -1142306508:
                    this.f1405d = (d2 / 4.0d) + d2;
                    str = "ۘۜۖۘۜۦۚۘۡۜۘۨۨۚۙۤۖۨۜۧۘ";
                    break;
                case -1121064071:
                    d2 = ((((double) configuration.screenWidthDp) * ((double) displayMetrics.density)) * ((double) displayMetrics.heightPixels)) / ((double) displayMetrics.widthPixels);
                    str = "ۖۨ۬ۦۖۛۢۦ۟ۙۨۦۙۥۘۡۧۡۦۦۧۖ۬ۚ";
                    break;
                case -1021585375:
                    imageView.setBackgroundColor(shp.prefs.getInt("ModFabBgColor", ColorStore.getFabBgColor()));
                    str = "۫ۙۘۘۢۡۢۙۤ۠ۖ۟ۧ۬ۥۨۘۤۡۖۘۨۦۘۘۦۢۨۡۜۖۘ";
                    break;
                case -342899948:
                    str = "ۘۜۘ۟ۤۙۡۨۛ۬ۥۜۘۡۤۥۖۦۘۛۢۖۘ";
                    configuration = getResources().getConfiguration();
                    break;
                case 91327458:
                    super.onFinishInflate();
                    str = "۠ۡۚ۟ۦۡۘۜۘ۟۠ۢ۫ۤ۬ۙۖ۠ۙۨ۠ۥۘ";
                    break;
                case 240158722:
                    this.f1404c = Integer.parseInt(shp.getPrefString("ModFabBgPosY", "500"));
                    str = "۬ۛۧۡ۬ۛۥ۬۟ۖۘۚۨۚۘ۫ۖۦۘۖۧۦۜۜ۠ۦۥۨ";
                    break;
                case 578547211:
                    str = "ۖۤۥۙ۠ۧۨۥۘۡ۠ۛۢۥۤۨۜۧۦۨۦ";
                    floatingActionsMenu = (FloatingActionsMenu) getChildAt(0);
                    break;
                case 752248225:
                    addView(imageView, 0);
                    str = "۟ۜۛۢۗ۟۠ۛۙۗۤۡۘ۠ۡ۠ۛۡۨۛ۠۠ۜ۬۫";
                    break;
                case 804290773:
                    displayMetrics = getResources().getDisplayMetrics();
                    str = "ۦۤۦ۟۫۟ۙۧۖۜۜ۠ۦۥۦۘ۠۠ۦۥۤۥ";
                    break;
                case 1255842250:
                    floatingActionsMenu.setOnFloatingActionsMenuUpdateListener(new i(this, imageView, 4));
                    str = "ۤۗۢۛ۫ۛۧۥۤ۟ۗۛۥۨۨۘۡ۟۫ۧۥۧۘۗۡۛۗۖۥۘ";
                    break;
                case 1308653861:
                    hideFB(floatingActionsMenu);
                    str = "ۜۨۦ۬۠ۨۘۖۢۡ۬ۧۥ۫ۡۦۗ۫۫ۨۦۚ";
                    break;
                case 1324010046:
                    return;
                case 1337351215:
                    str = "ۘۨ۫ۖۤ۟۠ۚ۟۬ۗۖ۟ۜۘ";
                    imageView = new ImageView(this.f1402a);
                    break;
                case 2002196552:
                    this.f1403b = Integer.parseInt(shp.getPrefString("ModFabBgPosX", "500"));
                    str = "ۚۡۛۧۜ۫ۦۜۗۤۥۨۘۜ۠ۨ۠ۜ۟";
                    break;
                case 2023657330:
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    str = "ۖ۫ۧ۫ۛ۫۫ۜ۟ۖۥۘ۫ۚۨۘۗۚۘۘۨ۬ۜۛ۟ۙۖۘۛ";
                    break;
                case 2103970664:
                    imageView.setAlpha(0.9f);
                    str = "۬ۡ۟ۤۘۘ۫ۗۚۢۗۢ۠ۨۙۘۦۦۘۤۡۡۘ";
                    break;
            }
        }
    }
}
