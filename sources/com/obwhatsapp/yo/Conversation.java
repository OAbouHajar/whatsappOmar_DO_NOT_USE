package com.obwhatsapp.yo;

import X.AnonymousClass00T;
import X.C005402i;
import X.C16010sH;
import X.C16740tZ;
import X.C30011bb;
import X.C57012pj;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import c.b;
import com.OM7753.GOLD;
import com.mod.bomfab.R$styleable;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.edd;
import com.obwhatsapp.exx;
import com.obwhatsapp.eyy;
import com.obwhatsapp.ezz;
import com.obwhatsapp.gnn;
import com.obwhatsapp.igg;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.task.utils;
import com.obwhatsapp.youbasha.ui.activity.SwipeBackController;
import com.obwhatsapp.youbasha.ui.activity.mediaPrivacy;
import com.obwhatsapp.youbasha.ui.lockV2.LockOptions;
import com.obwhatsapp.youbasha.ui.lockV2.LockUtils;
import java.io.File;
import java.util.HashSet;

public abstract class Conversation {
    public static final int A = yo.getID("seeeme", "id");
    public static final int B = yo.getID("conversation_row_text_rightp", "layout");
    public static final int C = yo.getID("conversation_row_text_leftp", "layout");
    public static final boolean D = utils.isArabic();
    public static final int E = utils.dimenInDP(6);
    public static final int F = utils.dimenInDP(10);
    public static LinearLayout.LayoutParams G = null;
    public static LinearLayout.LayoutParams H = null;
    public static LinearLayout.LayoutParams I = null;
    public static LinearLayout.LayoutParams J = null;
    public static LinearLayout.LayoutParams K = null;
    public static final int L = yo.getID("conversation_row_root", "id");
    public static final int M = yo.getID("mic_overlay", "id");
    public static final int N = utils.dimenInDP(40);

    /* renamed from: a  reason: collision with root package name */
    public static int f512a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static String f513b;

    /* renamed from: c  reason: collision with root package name */
    public static String f514c;

    /* renamed from: d  reason: collision with root package name */
    public static com.obwhatsapp.Conversation f515d;

    /* renamed from: e  reason: collision with root package name */
    public static HashSet f516e;

    /* renamed from: f  reason: collision with root package name */
    public static SwipeBackController f517f;

    /* renamed from: g  reason: collision with root package name */
    public static Drawable f518g;

    /* renamed from: h  reason: collision with root package name */
    public static int f519h = ColorStore.f511r;

    /* renamed from: i  reason: collision with root package name */
    public static int f520i = ColorStore.getDefaultChatBubbleDateColor();

    /* renamed from: j  reason: collision with root package name */
    public static int f521j = ColorStore.f511r;

    /* renamed from: k  reason: collision with root package name */
    public static final int f522k = others.getColor("ModChatLeftBubble", -11);

    /* renamed from: l  reason: collision with root package name */
    public static final int f523l = others.getColor("ModChatRightBubble", -11);

    /* renamed from: m  reason: collision with root package name */
    public static final int f524m = yo.getID("quoted_title", "id");

    /* renamed from: n  reason: collision with root package name */
    public static final int f525n = yo.getID("quoted_text", "id");

    /* renamed from: o  reason: collision with root package name */
    public static final int f526o = yo.getID("quoted_color", "id");

    /* renamed from: p  reason: collision with root package name */
    public static final int f527p = yo.getID("emoji_group_layout", "id");

    /* renamed from: q  reason: collision with root package name */
    public static final int f528q = yo.getID("div2", "id");

    /* renamed from: r  reason: collision with root package name */
    public static final int f529r = yo.getID("footer_toolbar", "id");

    /* renamed from: s  reason: collision with root package name */
    public static boolean f530s;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f531t;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f532u;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f533v;

    /* renamed from: w  reason: collision with root package name */
    public static int f534w;

    /* renamed from: x  reason: collision with root package name */
    public static int f535x;

    /* renamed from: y  reason: collision with root package name */
    public static final int f536y = yo.getID("picture_frame", "id");

    /* renamed from: z  reason: collision with root package name */
    public static final int f537z = yo.getID(FacebookFacade.RequestParameter.PICTURE, "id");

    static {
        String str = "۠ۨ۬ۘۤۦۘۜ۟ۢۘ۬ۢۧۧۖۘۨۗۜۡۛۦۖۚۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 728) ^ -777934018) {
                case -2144774955:
                    str = "۫ۖۡۚۗۥۘۢۨۗۨۛۘۖۘۖۘ۟ۗۨ";
                    break;
                case -2069374678:
                    str = "ۙۡۜۘۙۤۢۙۥۜۘۧۨۘ۟ۦۨۘ";
                    break;
                case -2037377812:
                    str = "ۨۛ۫ۤۢۤۢۖۢۧۨۘۘۖۗۙۡۧ۬ۦۛ";
                    break;
                case -2016572749:
                    str = "۟ۤۨۡۚۜۨۜۧۘۨۘۖۤۜۘۘ۟ۡۘ۟۫۬ۙۥۨۨۤۦ";
                    break;
                case -1738832047:
                    ColorStore.f511r = yo.getResColor("quotedMessageColorDefault");
                    str = "ۥۧۛۘۤۘۘۢۨۛۤۗ۟ۜۤۥۘۛ۠ۧۖۦ";
                    break;
                case -1651094039:
                    str = "ۛۗۨۘ۟ۢۥۙ۠ۨۨۖۧۘ۫۟۬۬۟ۢ";
                    break;
                case -1458903960:
                    str = "۫ۗۘ۠ۢۡۘ۬ۧ۠ۧۢ۬ۚۚۖۘۨۢۢ";
                    break;
                case -1232228917:
                    String str2 = "۠۫ۙۗۗ۟ۤۡۡۘۗۙۥۢ۬ۡۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -136067696) {
                            case -326004258:
                                str = "ۙۥۙۙۨ۬۫ۨۘۥ۬ۧۤۘ۠ۗ۟ۡ۠ۢۤۙۢۘۗۙۨ";
                                continue;
                            case 274360541:
                                str = "ۥۧۛۘۤۘۘۢۨۛۤۗ۟ۜۤۥۘۛ۠ۧۖۦ";
                                continue;
                            case 1434081935:
                                if (ColorStore.f511r != -11) {
                                    str2 = "ۨۖ۠ۘۜۧۘۢ۠ۖ۬ۢ۫ۙۢ";
                                    break;
                                } else {
                                    str2 = "ۡۢۢۡۡۖۘۦۤۗۢۛۚۙۤۙ";
                                    break;
                                }
                            case 1871391091:
                                str2 = "ۜ۫ۜۚ۟ۚۨ۬ۖۘۨۖۨۗۨ۫";
                                break;
                        }
                    }
                    break;
                case -923552582:
                    str = "ۚۛۨۘۢ۟ۧۚۨۢۜۘ۬ۡۖ۬۬۟ۡۘۙۦۘۙ۫ۗ";
                    break;
                case -590348002:
                    str = "ۛۛۖۜۧۘۘ۠ۦ۫ۘۚۦۘۙۜۖۥ۬ۢ";
                    break;
                case -440096674:
                    str = "۟ۜۖ۫۟ۡ۬ۢۦۢۘۘۦ۟ۙۢۘۡۘ";
                    break;
                case -383615577:
                    str = "ۖۗ۟ۤۦۡۛۜۘۢ۠ۨۘۙۘۥۘۖ۠ۡ۬ۢۚ۟ۗۥ";
                    break;
                case -263562208:
                    String str3 = "ۦۚۛۢۡ۠۟ۙۘۗۨ۫ۨۢۦۘۙۥ۫";
                    while (true) {
                        switch (str3.hashCode() ^ 919748322) {
                            case -1165884577:
                                if (ColorStore.f511r != -11) {
                                    str3 = "ۗۤۖۘۘ۠ۘۘۢۙۗۡ۫ۘۘ۬ۨۘۢۙۛۗۗۥۦۧۨۘۚ۟۠";
                                    break;
                                } else {
                                    str3 = "ۨۡۦۨۛۜ۠ۦۖۚۜۘۘۚ۫۠ۧۙۖۘۦۛ۟ۙۡۙۥۡۚ";
                                    break;
                                }
                            case 909786850:
                                str = "ۗۦۤۛۜ۟ۤۙ۠ۤۤۜۘۢۡ۫ۨۜۖ";
                                continue;
                            case 1806082682:
                                str = "۫ۥۛۥۨ۫ۗۥۜۚۚۜۡۖۤ";
                                continue;
                            case 1988659816:
                                str3 = "۟ۙۦۘۚۖۨۤ۫ۥۨۥۧ۠ۚۘۘ۠ۜۜۦۙۛۜۖ۠";
                                break;
                        }
                    }
                    break;
                case -51462147:
                    str = "ۢۥۘۘ۠ۡۢۡۡۛۦۘۖۢۗۘۘ";
                    break;
                case -48478549:
                    str = "ۥۤۛۗ۬۫ۙۘۗۚ۫ۛۨۥۖۡۘۤۘۚۚ";
                    break;
                case 1848375:
                    str = "ۧۢۘۘۡۙۛ۠ۛۧ۟ۗۡۘۙۙۡۛۤۢۧۥۜۘۙۜۜۘۗۙۗ";
                    break;
                case 295334007:
                    str = "ۦ۫ۜۘۦۙۨۘ۠ۤۖ۬ۡۖۚۗۚۖۜۘۗۗۘ";
                    break;
                case 486018594:
                    str = "ۘۗۥۘۦۤۢۗۖۖۘ۟ۙۜۜۧۛۥۤۜۘۘۦۘ";
                    break;
                case 952510662:
                    str = "ۚۜ۬ۛۜ۬ۡۚۖۘۥۢ۫ۜۚۡۘ۬ۛۜۘ۫ۜۚ";
                    break;
                case 1009215164:
                    str = "ۥۚ۟۫ۢۙۚۜۧۡۛۤۧۖۡۘۦ۟ۦۦۨۘۘ";
                    break;
                case 1090813233:
                    str = "۬۟ۖۘ۬ۗۧۜ۠ۢۡۚ۟ۨ۟ۙۜۜۜۘ۬ۜۦۘۚ۫ۥۜۘۦۘ";
                    break;
                case 1226353942:
                    str = "ۨۢۘۙ۟۫ۖۦ۠ۡ۠۬ۙۘۘۤۛۛ";
                    break;
                case 1259811745:
                    str = "۫ۥۧۘۧ۫ۨ۫ۖۜۢۙۘۥۢ۠ۡۤۜۘ۫ۡۜۢ۬ۨۘۗۜۦ";
                    break;
                case 1482209864:
                    str = "ۢۖۖۘۖۧۚۡۦۥۥ۠ۥۘۚۗۡۘۡۛۥۘۗۙۥۜۙۖۧ۟ۢ";
                    break;
                case 1507584375:
                    return;
                case 1603896572:
                    ColorStore.f511r = yo.getResColor("quotedMessageColorDefault");
                    str = "ۗۦۤۛۜ۟ۤۙ۠ۤۤۜۘۢۡ۫ۨۜۖ";
                    break;
                case 1640515604:
                    str = "۬ۘ۠ۦۙۜۙۥۜۘۚۥۡۘ۫ۚۡ۬ۦۗ";
                    break;
                case 1720871192:
                    str = "ۗۛۨۤۧۡۘۥۥۦ۠ۢ۫۟ۜۦۜۙۦ۬ۙۙ۫ۖۜۘۗۨۥ";
                    break;
                case 1736459155:
                    str = "ۥۜۧۘۨۙۙۨۧۢ۟ۘۢۤۘۘۥ۬ۨۨۡۘۘۖۡ۟ۖۨۘ";
                    break;
                case 1749066500:
                    str = "ۡۤۡۙۥۘۘۥۙۥۘۢۗۡۖ۬ۦ۬ۨۧۘۙۗ۬۠ۗۘ";
                    break;
                case 1848339570:
                    str = "۠ۛۤۛ۟ۜۘ۟ۥۡۢۤۛۧۜۖۘ";
                    break;
                case 1884216492:
                    str = "ۙۙۡۘۨ۬ۢ۬۠ۜۚۤۘۘۨۖۙۛۘۛۦ۠ۥ";
                    break;
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static void AddDoubleTapToLike(C30011bb r5) {
        String str = "ۨۨۜۘۥۨۢ۠ۜۨۜۜۙ۠ۖۦ۠ۛۥۤۖۧۖ۬ۢ";
        while (true) {
            switch ((str.hashCode() ^ 287) ^ -1588264959) {
                case -1626506459:
                    return;
                case -605067002:
                    String str2 = "۟ۡۖۘۡ۟ۨۘۤ۠ۦۚۛۗ۫ۘ۟۬ۧ۬۫ۤۧ";
                    while (true) {
                        switch (str2.hashCode() ^ 1118876133) {
                            case -605795778:
                                str = "ۧۖۜۘۚۥۘۘۤۦۛ۬ۘ۠۟ۚۥۘ";
                                continue;
                            case -35135980:
                                if (!shp.getBoolean("disableDTTL")) {
                                    str2 = "ۙۜۥۘۨ۠۬ۡۥۙ۟ۨۘۘۧۘۘۜۥ۟ۦ۟ۜ";
                                    break;
                                } else {
                                    str2 = "ۨ۠ۚۨۜۢۡ۬ۘۘۙۢۜۘۥۥ۬ۘۧ۟ۡۦۡۘۦۨۧۘ";
                                    break;
                                }
                            case 147843434:
                                str2 = "ۛۛۤۜۖۘۙۖۢۨۙۡۘۦۡۤۘۙۘۤۨ۠";
                                break;
                            case 1609942897:
                                str = "ۨۗۧۛۖۧۘۧۨۨۧۖۥۘ۠ۙۙۨۡۢۜۛۨۖۜۚۗۧ";
                                continue;
                        }
                    }
                    break;
                case -70615561:
                    r5.setOnTouchListener(new v(new GestureDetector(r5.getContext(), new y(r5, 0))));
                    str = "ۜۡۛۢۤ۟ۨۖ۬۟ۜۦۥۥۙۘ۬";
                    break;
                case 1359367392:
                    String str3 = "ۛۜۥۖ۬ۧۜۜۘۘ۠ۥۨۘۧۢۨۘۢۥۦ۟ۧۥۘۚۙۜۘ۠۫۠";
                    while (true) {
                        switch (str3.hashCode() ^ -1855664514) {
                            case -1092947785:
                                if (r5 == null) {
                                    str3 = "۟ۚۜۘۜۡ۠ۤۨۘ۟ۥ۫ۧۜۘ";
                                    break;
                                } else {
                                    str3 = "ۚۡۥۘۘۜۖۤۦۙۤۧ۟ۢۜۖ۠ۗۧۦۥ";
                                    break;
                                }
                            case 110705027:
                                str = "ۢۖۡۘۘۗۢۙۦۘۗ۟ۨ۫ۦۖۘ۫ۙ";
                                continue;
                            case 1007013262:
                                str3 = "ۚۤۖۘۜۡۥۡۗ۫ۡۖۨۘۥۖۨۦۚ۬ۜۘۤۦ۠ۘ";
                                break;
                            case 1895795056:
                        }
                    }
                    break;
                case 624824801:
                    str = "ۜۡۛۢۤ۟ۨۖ۬۟ۜۦۥۥۙۘ۬";
                    break;
                case 1647807999:
                    str = "ۗ۠ۧۥۘۥ۟ۘۚ۬ۨۥۚۖۦۘۗۙۡۚ۟ۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void BGClip(android.widget.FrameLayout r8) {
        /*
            r2 = 0
            r4 = 0
            java.lang.String r0 = "۬ۥۦۘ۬ۤۡۘۧۧۢۧۧۜۘۘۡۛۡ۟ۗ"
            r1 = r2
            r3 = r2
        L_0x0006:
            int r5 = r0.hashCode()
            r6 = 70
            r7 = 1588048001(0x5ea7b081, float:6.0416498E18)
            r5 = r5 ^ r6
            r5 = r5 ^ r7
            switch(r5) {
                case -2101266327: goto L_0x00ac;
                case -1305324607: goto L_0x011b;
                case -1291756809: goto L_0x0089;
                case -1255710047: goto L_0x001f;
                case -1250793141: goto L_0x0112;
                case -1005685854: goto L_0x0066;
                case -896096858: goto L_0x002d;
                case -759334324: goto L_0x0018;
                case -698731496: goto L_0x012e;
                case -529129497: goto L_0x0132;
                case -396382596: goto L_0x00f2;
                case -190951749: goto L_0x0044;
                case 923897798: goto L_0x012a;
                case 974727323: goto L_0x00cf;
                case 995332537: goto L_0x0116;
                case 1097309068: goto L_0x00ff;
                case 1535677745: goto L_0x010d;
                case 1912185772: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r0 = "ۡۚ۬ۙۖۤ۬ۗۦۘ۠ۢۜۘۘۤۦ"
            goto L_0x0006
        L_0x0018:
            java.lang.String r4 = whichEntry()
            java.lang.String r0 = "ۤۚۡ۠ۧۘۘ۫ۢۥۦۘۡۡۗۙ۫ۨۧ۬ۙۖۦۦۛۗۚۡۘ"
            goto L_0x0006
        L_0x001f:
            r5 = -1380934627(0xffffffffadb09c1d, float:-2.0078212E-11)
            java.lang.String r0 = "ۥ۟۟۟ۙۦۘۘۨۘۘۛۤ۫ۜۖۡۦ۟۫۟۠۫۟ۛ۫ۧۨۡۘ"
        L_0x0024:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1777696154: goto L_0x003e;
                case -466743158: goto L_0x002d;
                case 108190821: goto L_0x0041;
                case 757417300: goto L_0x0033;
                default: goto L_0x002c;
            }
        L_0x002c:
            goto L_0x0024
        L_0x002d:
            java.lang.String r0 = "ۦۤۙۨۙۙ۬ۢۢ۟ۘ۠ۚۜۡۚۥۢۘۚۖۚۘۥۧ۟ۗ"
            goto L_0x0006
        L_0x0030:
            java.lang.String r0 = "۟ۧۨۘۚۚۡۘۙۤ۫۠ۤۚۤۥۗۙۧۖ"
            goto L_0x0024
        L_0x0033:
            java.lang.String r0 = "yowa_mood_conversation"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "ۘۘۤۛۜۨۘۤۘۧۘۡۧۘۦ۫ۡۘ۠ۗۧۧۘۨ"
            goto L_0x0024
        L_0x003e:
            java.lang.String r0 = "۠۫ۥۘ۫ۜۧ۬ۗۖۚۗۘۜ۬ۥۘ۟ۨ۬"
            goto L_0x0024
        L_0x0041:
            java.lang.String r0 = "۫۟ۥۛۚ۟ۥ۫ۙۗ۠ۦۘۘۖۚۜۗۗۥۡۘ۠۬ۥ"
            goto L_0x0006
        L_0x0044:
            r5 = -169111161(0xfffffffff5eb9187, float:-5.97237E32)
            java.lang.String r0 = "ۚ۠ۚ۫ۦ۟ۨۤۨۙ۫ۧۥۜۦۘۘۖۜۘۜۗۚ۠ۚۦۘۖۜ۠"
        L_0x0049:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case 176058156: goto L_0x0058;
                case 649887689: goto L_0x002d;
                case 949773440: goto L_0x0063;
                case 1982414742: goto L_0x0052;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0049
        L_0x0052:
            java.lang.String r0 = "ۡۥۥۘ۠۠ۥۙ۬۠ۗۘۚۡۚۘ"
            goto L_0x0006
        L_0x0055:
            java.lang.String r0 = "۫۬ۥۙۥۘۘۖۡۨۥ۬ۙۢۚۚ۫"
            goto L_0x0049
        L_0x0058:
            java.lang.String r0 = "theme_conversation_stock"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = "ۢۨۨۘۧۜۡۘ۠ۡۜۘ۬ۗۢۡۢۘ۠۬ۤۖۧۧۥۡ۠"
            goto L_0x0049
        L_0x0063:
            java.lang.String r0 = "ۙۦ۟ۜۖۖۖۤۚۧۥۜۘۢ۫ۥۘۛۗۥ"
            goto L_0x0049
        L_0x0066:
            r5 = 1151356356(0x44a04dc4, float:1282.4302)
            java.lang.String r0 = "ۗۙۛۘۥۜۚۗۥۘۤۚۤۨ۫ۗۗ۫ۦۘ"
        L_0x006b:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1619460954: goto L_0x002d;
                case 27322198: goto L_0x0074;
                case 816843046: goto L_0x0085;
                case 2066567589: goto L_0x0082;
                default: goto L_0x0073;
            }
        L_0x0073:
            goto L_0x006b
        L_0x0074:
            java.lang.String r0 = "theme_conversation_old_stock"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x007f
            java.lang.String r0 = "ۙۥۦۘ۟ۤۛۜ۠ۚ۠۫۟۟ۗۘۡۥۥۘ"
            goto L_0x006b
        L_0x007f:
            java.lang.String r0 = "ۧۘۡۘۜۖۧۦۙۨۤ۠ۦۘۧۚۦ۫۬ۘ"
            goto L_0x006b
        L_0x0082:
            java.lang.String r0 = "ۛ۟ۡۙۖۥۥۖۜۘۨ۠۟ۗۜۖ"
            goto L_0x006b
        L_0x0085:
            java.lang.String r0 = "ۦۨۘۘۙۦۨۘۥۘۧۥۤ۬ۤۡۥ"
            goto L_0x0006
        L_0x0089:
            r5 = -302267747(0xffffffffedfbc29d, float:-9.7395013E27)
            java.lang.String r0 = "ۡۚۨۘۛ۟ۨۧۖ۬۠ۗۜۥۜۧۧۘۡۙۛۙۘۨۦۡۧۦ"
        L_0x008e:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -979119282: goto L_0x00a5;
                case 172646051: goto L_0x0097;
                case 1784420233: goto L_0x00a8;
                case 2005188366: goto L_0x002d;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x008e
        L_0x0097:
            java.lang.String r0 = "Rounded_conversation"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "ۙۥۚۢۦۥۗۧۡۘۗۨۖۖ۬ۥۘۦۜۜۜ۠ۤۦۖۢۗۖۨۘ"
            goto L_0x008e
        L_0x00a2:
            java.lang.String r0 = "ۤۨ۠ۚۖۖۘۡۙۖۘۤۨۖۘۗ۠ۡۘۢۨۥۧۢۥۘ"
            goto L_0x008e
        L_0x00a5:
            java.lang.String r0 = "۠ۨۖۜۤ۟ۙۥۥۧۜۘۤۘۜۡۖۙ۬ۧۗۖۡ۬"
            goto L_0x008e
        L_0x00a8:
            java.lang.String r0 = "ۙۘۘۘۡۨۦۡۧۡۘۢۥۜۘۚۤ۫۬۟ۨۥۛۦۖ۠ۘ"
            goto L_0x0006
        L_0x00ac:
            r5 = 1330920438(0x4f543bf6, float:3.56069939E9)
            java.lang.String r0 = "۫۫ۤۜۦۧۙ۫ۖۘۤۜۨۘ۫ۤۥۘۨۗ۟ۥۥۘ۟ۦۤۙۢ"
        L_0x00b1:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -1952064189: goto L_0x00ba;
                case 961559383: goto L_0x0122;
                case 1589583339: goto L_0x00c1;
                case 1766330443: goto L_0x00cc;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            goto L_0x00b1
        L_0x00ba:
            java.lang.String r0 = "ۧۗۘۘ۟ۦ۬۫ۢۖۘۢۘۤۧۧۜۘۗۙۦۘ۠۫ۦ۟ۦۨۡ۬ۘۘ"
            goto L_0x0006
        L_0x00be:
            java.lang.String r0 = "ۚۖۥۜۜ۬ۛۜ۠ۤۢۨۘۙ۬۫ۛۢ۫۠ۥۘۦۗۘۨۢۥ"
            goto L_0x00b1
        L_0x00c1:
            java.lang.String r0 = "allo_conversation"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00be
            java.lang.String r0 = "ۗ۫ۜۧۗۖۘۧۙۗۤۤۚۡ۫ۥۢۦۚۗۦ۟ۡۘ"
            goto L_0x00b1
        L_0x00cc:
            java.lang.String r0 = "ۡ۟ۘۙۨۜۛۦۡۘۥ۫ۡۘۥۢۦ۠ۘۤ"
            goto L_0x00b1
        L_0x00cf:
            r5 = -675647523(0xffffffffd7ba6fdd, float:-4.09979224E14)
            java.lang.String r0 = "ۦۢۘۘۡۤۧۥۖۘۘۖۘۚۥۤۤ۟ۢۛۚۘۧۦۥۡ"
        L_0x00d4:
            int r6 = r0.hashCode()
            r6 = r6 ^ r5
            switch(r6) {
                case -2108846252: goto L_0x0126;
                case -1603342826: goto L_0x00dd;
                case 679452086: goto L_0x00ee;
                case 1843616737: goto L_0x00eb;
                default: goto L_0x00dc;
            }
        L_0x00dc:
            goto L_0x00d4
        L_0x00dd:
            java.lang.String r0 = "BGColor"
            boolean r0 = com.obwhatsapp.yo.shp.getIsGradiet(r0)
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = "ۨۛۦۥۗ۬ۜۛۥ۟ۢ۫ۢۘۛ"
            goto L_0x00d4
        L_0x00e8:
            java.lang.String r0 = "ۛۧۜۘۥ۠ۥۦۦۜۖۖۥۘۨ۫ۘۘۨۖۧ"
            goto L_0x00d4
        L_0x00eb:
            java.lang.String r0 = "۫ۤۧۛۦۦۛۥۥۘۛۡۡۛۜۨۧۖۙ۟۬۬"
            goto L_0x00d4
        L_0x00ee:
            java.lang.String r0 = "ۡۥۛۙ۬ۛ۠۠ۥۘۦۗۨ۟ۥ۠ۙ۟ۡۘۘۙ۠"
            goto L_0x0006
        L_0x00f2:
            java.lang.String r0 = "BGColor"
            android.graphics.drawable.GradientDrawable r0 = com.obwhatsapp.yo.shp.getGradientDrawable(r0)
            r8.setBackground(r0)
            java.lang.String r0 = "ۖۚۡۘۘ۫ۧ۟ۤۦۘۚۗۥۧۗۡۘ"
            goto L_0x0006
        L_0x00ff:
            java.lang.String r0 = "BGColor"
            int r3 = com.obwhatsapp.yo.ColorStore.getDefaultConversationEntryBackground()
            int r3 = com.obwhatsapp.youbasha.others.getColor(r0, r3)
            java.lang.String r0 = "ۙۙۙۨۢ۫ۢۥۜۘۙۘ۟ۜۨۖۥۘۧۥۤۨ"
            goto L_0x0006
        L_0x010d:
            java.lang.String r0 = "ۨۧۡۘۚ۬۫ۙۦۤ۟ۗۜۡۘۘۘۛۢۨۛۘۘ"
            r1 = r3
            goto L_0x0006
        L_0x0112:
            java.lang.String r0 = "ۤۙ۬ۡۗۗۗۘۦۘۙۨۥۜۨۗۡۖۛۘۢۜ"
            goto L_0x0006
        L_0x0116:
            java.lang.String r0 = "ۚ۟ۜۘۦۘۥۧ۠ۖ۫ۚۘۘۖۜۦ"
            r1 = r2
            goto L_0x0006
        L_0x011b:
            r8.setBackgroundColor(r1)
            java.lang.String r0 = "ۙۡۡۘۖۙۦۢۨۨۜۤۗۥۥۘۨۦۘۖ۟ۜ"
            goto L_0x0006
        L_0x0122:
            java.lang.String r0 = "ۚۗۙۖ۬ۥۘۘۡۥۤۙۛ۠ۡ۫ۘۡ۠"
            goto L_0x0006
        L_0x0126:
            java.lang.String r0 = "ۙۡۧۚۖ۫ۥ۠ۖۚ۫ۖۨۦۘۘۖۢۥۢۥۘۜۚۛۗۗۖۘ"
            goto L_0x0006
        L_0x012a:
            java.lang.String r0 = "ۚ۟ۜۘۦۘۥۧ۠ۖ۫ۚۘۘۖۜۦ"
            goto L_0x0006
        L_0x012e:
            java.lang.String r0 = "ۙۡۡۘۖۙۦۢۨۨۜۤۗۥۥۘۨۦۘۖ۟ۜ"
            goto L_0x0006
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.BGClip(android.widget.FrameLayout):void");
    }

    public static void ModChatColor(C005402i r13) {
        String str = "ۖۛ۬ۨۗ۬۬ۧۖ۠ۘۜۘۤۜۖۤۥۦ۠۠ۥ۫ۢ۬";
        q qVar = null;
        com.obwhatsapp.Conversation conversation = null;
        int i2 = 0;
        com.obwhatsapp.Conversation conversation2 = null;
        q qVar2 = null;
        p pVar = null;
        com.obwhatsapp.Conversation conversation3 = null;
        while (true) {
            switch ((str.hashCode() ^ 767) ^ 450884427) {
                case -2009366189:
                    str = "ۦۦۤۥۖ۫ۜۤ۠ۛۤۦۘۥۚۧۗ۫ۘۘۚۘۨۘ";
                    conversation2 = conversation;
                    break;
                case -1683669618:
                    str = "ۦۘۚۤۡۦۘۥۡۖ۠ۨ۫ۤۖۘ";
                    qVar2 = pVar;
                    break;
                case -1614623214:
                    str = "۟ۖۢۤۘۧۤۡۙۧۜۚۘۜۡۘ";
                    conversation2 = conversation3;
                    break;
                case -1218092316:
                    str = "ۜۦۜۚۦۛ۬ۚۖۨۙۦۘ۟ۡۘۢۛۖۘ۫ۥۚۧ۬ۜ";
                    break;
                case -1051936413:
                    str = "ۜۤ۬ۗۢۤۤۜۡۧۙۦۧۛ۫ۢۧۛۥۙۤۧۛۛ";
                    qVar2 = qVar;
                    break;
                case -273835218:
                case 1445517268:
                    return;
                case 205733781:
                    String str2 = "ۧۦۛۚ۟ۤۜۙۛۥۚۢۗۚۢۥۚۤ۬ۥۢ";
                    while (true) {
                        switch (str2.hashCode() ^ 1127221623) {
                            case -1203611728:
                                if (i2 == -11) {
                                    str2 = "ۗۧ۠ۡۨۚۙۛ۟ۙۧۚۧۜۢ۫ۖۖ";
                                    break;
                                } else {
                                    str2 = "ۜۖۘۥۚۖۦۙۘۙۤۗ۬ۢۥۘۖۡ";
                                    break;
                                }
                            case -646037943:
                                str2 = "ۤۢۖۘۥۦۦۖ۟ۥۢ۫۟ۘۙۜۘۦ۬ۥۘ";
                                break;
                            case 1332283650:
                                str = "۬ۢۥۘۘۜۗۧۢۚ۬ۡۘۙ۟ۛۧۛۙۘۚۚ۠ۢۨ۠ۙۡۘ";
                                continue;
                            case 1517906471:
                        }
                    }
                    break;
                case 868786356:
                    str = "ۙۙۡۗۦۡۘ۫ۚۤۢ۬۬۠ۜۘۦۖۚۘۨۚۜۙۥ";
                    break;
                case 885182791:
                    str = "۬ۡۨۙۨۦۘۥۢۚۖ۫ۡۥۡ۬ۥ۬ۦۜ۠ۗ";
                    i2 = others.getColor("ModChatColor", -11);
                    break;
                case 1132873646:
                    String str3 = "ۡۛۛۡۖۢۡۜۢۜۦۧۨۢۡۢۘۥۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -656596712) {
                            case -1561004434:
                                str = "ۜۗۚۖۦۘ۬ۡۘۜۦۨۘۜۚۙۦۦۛۗۥۧۘۨۜ۬";
                                continue;
                            case -861328426:
                                if (f515d != null) {
                                    str3 = "ۙۥۨۘۦۘ۟ۜۢ۟ۗۙۛ۫ۜۘ";
                                    break;
                                } else {
                                    str3 = "ۗۗۘۘ۠ۤۥۘۚۘۘۛۚۦۚ۠ۨۘ۬ۘ۬ۜ۫ۦۘۥ۬ۖ۫ۨۘ";
                                    break;
                                }
                            case 383732705:
                                str = "ۢۤۙۚ۠ۘۘۥۙۛۙۢۖۘۛۜۙۛۛۙۧۗۨۛۡۦۘ";
                                continue;
                            case 526294251:
                                str3 = "ۥۘۥۡ۠۟ۦۚۢ۬ۙۢ۫ۤۦۥۘۤ";
                                break;
                        }
                    }
                    break;
                case 1445028509:
                    pVar = new p(r13, "ModChatColor", 0);
                    str = "ۤۡۨۘۨۢۤۥۦۗۛ۫ۜ۟ۡۘۧ۟۠ۦۦۡۘۛۥۨۜۚۚ";
                    break;
                case 1506826659:
                    qVar = new q(r13, i2, 0);
                    str = "ۥ۫ۖۘۛۘۡۜۖۡۘ۠ۡۥۘ۠ۦ";
                    break;
                case 1912970353:
                    String str4 = "۬ۥۜۘۛۛۚۙ۠۬ۥ۬ۨۤۦۧۘ۟۠ۦۘۗ۬ۜ";
                    while (true) {
                        switch (str4.hashCode() ^ -448377408) {
                            case -403630904:
                                str4 = "۠۬ۤ۟۫ۜۘۚۙ۟ۢ۟ۤ۬ۛۥۘۚۦۤ۠۟۟";
                                break;
                            case -143412096:
                                if (!shp.getIsGradiet("ModChatColor")) {
                                    str4 = "ۦ۟ۙۨۙۖۥۛۡ۫ۥۛۧ۟ۡ۫۟ۛۚ۟ۖۘۜ۫ۡۘ";
                                    break;
                                } else {
                                    str4 = "ۥۧ۬ۘۖۗۢ۬ۨۥۢۡۘۛۙۖ۫۬ۦۘ";
                                    break;
                                }
                            case 620643558:
                                str = "ۜۖۧ۫۫ۛۜۥۛۨۥۖ۫ۡۥۥۨ۫ۖۜۧ";
                                continue;
                            case 1250493425:
                                str = "۠۫ۜ۠ۢۖۙۜۗۛۘۡ۫ۤۥۘۘۨ۬ۤۥۖ۫ۨۘ";
                                continue;
                        }
                    }
                    break;
                case 1979659528:
                    str = "ۚۤۚۜۧۚۖۧۡۘۛۧۦ۟۫ۘۘۙۗ۟ۚ۬ۡۘۡ۫۬";
                    conversation = f515d;
                    break;
                case 2008640258:
                    str = "۟ۖۢۤۘۧۤۡۙۧۜۚۘۜۡۘ";
                    break;
                case 2032387672:
                    conversation2.runOnUiThread(qVar2);
                    str = "ۨۗۜۘ۬۟ۙ۫۠ۦۘۡۙ۬۫ۨۢۦۡۦۘ";
                    break;
                case 2051927863:
                    conversation3 = f515d;
                    str = "۬۬ۖۧۖۗۤۦۢۤۖ۫۬ۨۖۘ";
                    break;
            }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(mediaPrivacy mediaprivacy, CompoundButton compoundButton, boolean z2) {
        if (z2 == GOLD.wantsSpecific()) {
            return;
        }
        if (z2) {
            mediaprivacy.action();
        } else {
            mediaprivacy.clear();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r0 = "ۥۦۤۜۖۥۜۤۡ۠۟ۘۙۘ۫ۙ۟ۢ۬۠ۤۥ۟۬۟ۛۢ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            r4 = 0
            r9 = -11
            r2 = 0
            java.lang.String r0 = "ۖ۟۠ۖۦۤۖ۬ۧۘۥ۠ۢ۬ۥ۫ۛ"
            r1 = r2
            r3 = r4
            r5 = r2
            r6 = r2
            r7 = r4
        L_0x000b:
            int r2 = r0.hashCode()
            r4 = 355(0x163, float:4.97E-43)
            r8 = 1245644520(0x4a3f06e8, float:3129786.0)
            r2 = r2 ^ r4
            r2 = r2 ^ r8
            switch(r2) {
                case -1789593416: goto L_0x001d;
                case -1567531917: goto L_0x003f;
                case -1380556479: goto L_0x0045;
                case -1289461702: goto L_0x00a2;
                case -705539631: goto L_0x0020;
                case 61442468: goto L_0x009d;
                case 62900291: goto L_0x006b;
                case 265586541: goto L_0x00a9;
                case 318863782: goto L_0x0075;
                case 567910152: goto L_0x00b1;
                case 724781703: goto L_0x001a;
                case 862716765: goto L_0x0092;
                case 1105116575: goto L_0x0061;
                case 1166461863: goto L_0x006f;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x000b
        L_0x001a:
            java.lang.String r0 = "۟۟ۖۘۥۦۨۜۥۖۢۖ۫ۙۦۖۘۡۨۘۘ۬ۚۘۘ۬۬"
            goto L_0x000b
        L_0x001d:
            java.lang.String r0 = "ۘۨۥۘۦۥۖۨ۠ۤۙۡ۫۟۫ۨۘۥۚۖ"
            goto L_0x000b
        L_0x0020:
            r2 = -1407886980(0xffffffffac15597c, float:-2.1223847E-12)
            java.lang.String r0 = "ۤۖ۟ۘۤ۟ۖۖۜۘ۬ۙۤۢۧۘۦۜۦۘ"
        L_0x0025:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1986603796: goto L_0x002e;
                case -409134986: goto L_0x0039;
                case 1077805466: goto L_0x0034;
                case 1370373049: goto L_0x003c;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0025
        L_0x002e:
            java.lang.String r0 = "ۥۦۤۜۖۥۜۤۡ۠۟ۘۙۘ۫ۙ۟ۢ۬۠ۤۥ۟۬۟ۛۢ"
            goto L_0x000b
        L_0x0031:
            java.lang.String r0 = "۠۫ۜۜۚ۟۫ۧۤۛۥۧۙۛ۠ۥ۠ۨ۫ۧ"
            goto L_0x0025
        L_0x0034:
            if (r10 == 0) goto L_0x0031
            java.lang.String r0 = "ۗۨۚۚۦۚۚۦ۟ۙ۬ۜۦۢۡ"
            goto L_0x0025
        L_0x0039:
            java.lang.String r0 = "ۨۦۤۖۙۖۘۤۤۚۡۘ۠ۙۛ۠ۦۖۧۤ۫ۥۚۤۚ"
            goto L_0x0025
        L_0x003c:
            java.lang.String r0 = "ۥۥۤۜۨۜ۟۬ۢۥۧۦۘ۬ۨۡۡ۠۫ۛۥۤۢ۬ۦۘۛۜ۫"
            goto L_0x000b
        L_0x003f:
            int r4 = f523l
            java.lang.String r0 = "ۜ۠۟۫ۜۦۘ۬ۗۦۘ۠۫۫ۗۧۧۛۛ۫ۙۜۥۗۜۘ"
            r7 = r4
            goto L_0x000b
        L_0x0045:
            r2 = 434559734(0x19e6daf6, float:2.386988E-23)
            java.lang.String r0 = "۠۠ۘۤۡۡۘۢۙۤۥ۫۠ۡۢۜۖۡۥۘۘۖۨ"
        L_0x004a:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1528729979: goto L_0x002e;
                case -350159940: goto L_0x0053;
                case 827901246: goto L_0x005e;
                case 1242900281: goto L_0x005b;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x004a
        L_0x0053:
            if (r7 == r9) goto L_0x0058
            java.lang.String r0 = "ۡۙۧۗۗ۫۟۫ۧ۬۬ۚۨۘۚۛۖۙۘۛ۠ۡۜۘ"
            goto L_0x004a
        L_0x0058:
            java.lang.String r0 = "ۛۜۦۦۛۤۘۡۥ۫۠ۜۡۧ۠ۛۥۢ"
            goto L_0x004a
        L_0x005b:
            java.lang.String r0 = "ۖۢۡۘۚۡۥۤ۟ۥۘ۟ۦۧۙۖۖۘۢۨۤ"
            goto L_0x004a
        L_0x005e:
            java.lang.String r0 = "ۧۙۘۘۢۦۧۘ۟ۥۦۥۘۤ۠ۜۘۘ"
            goto L_0x000b
        L_0x0061:
            android.graphics.PorterDuffColorFilter r6 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            r6.<init>(r7, r0)
            java.lang.String r0 = "ۦۙۖۘ۠ۢۖۘۖۖۗۥۜۜۤۡۤ۠۬ۜۘ"
            goto L_0x000b
        L_0x006b:
            java.lang.String r0 = "ۗۦۦۗۨۗۡ۟ۧۘۜ۫ۗۤۡۙۥۥۘ"
            r5 = r6
            goto L_0x000b
        L_0x006f:
            int r2 = f522k
            java.lang.String r0 = "۬۫ۨۘۡۧۥۘۡۢۤ۟ۛۤۡۤۜۘۧۗۧۛۗۧ۫۟ۖۘۤۛ"
            r3 = r2
            goto L_0x000b
        L_0x0075:
            r2 = 304289864(0x12231848, float:5.146366E-28)
            java.lang.String r0 = "۟ۨۖۘۗ۬ۘۨ۠ۥۘۥ۟ۘۘۜ۟"
        L_0x007a:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -2044346904: goto L_0x0083;
                case -701575916: goto L_0x008e;
                case 839072586: goto L_0x008b;
                case 1312183012: goto L_0x00ad;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x007a
        L_0x0083:
            if (r3 == r9) goto L_0x0088
            java.lang.String r0 = "ۢۢۖۘ۬ۜۘۘۖۧ۫ۗۤۗۗ۠ۥ۫۬ۘ۟"
            goto L_0x007a
        L_0x0088:
            java.lang.String r0 = "ۙۤ۟ۦ۠ۥۘۥۘۘۦۗۗۘ۟ۧۗۜۡۙۖۘۧۚۜۘ"
            goto L_0x007a
        L_0x008b:
            java.lang.String r0 = "۟۟ۧۨۚۖۘۤۨۨۘۡ۫ۧۖۥۡۢۧۨ۬ۗۦۘ"
            goto L_0x007a
        L_0x008e:
            java.lang.String r0 = "۫۬ۤۘۜۥۚ۫ۛۖ۬۠ۢۘۨۘ۟۬ۨ۫ۚۜ"
            goto L_0x000b
        L_0x0092:
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            r1.<init>(r3, r0)
            java.lang.String r0 = "ۚ۠ۖ۬ۗۨۢ۬ۥۘۘۢۗ۬ۨۧۘۤۤ۟"
            goto L_0x000b
        L_0x009d:
            java.lang.String r0 = "۟ۜۖۖۧۡۘۧ۫ۨۘ۬ۜۘ۠ۢۥۘ۠۠ۥۙۚۥۘۡۦۧ"
            r5 = r1
            goto L_0x000b
        L_0x00a2:
            r11.setColorFilter(r5)
            java.lang.String r0 = "ۚ۬ۗۗۙۙۜۨۦۘۗ۟ۡۤۛۧۛ۫۟ۨۘۚ۬ۨۡ"
            goto L_0x000b
        L_0x00a9:
            java.lang.String r0 = "۟ۜۖۖۧۡۘۧ۫ۨۘ۬ۜۘ۠ۢۥۘ۠۠ۥۙۚۥۘۡۦۧ"
            goto L_0x000b
        L_0x00ad:
            java.lang.String r0 = "ۚ۬ۗۗۙۙۜۨۦۘۗ۟ۡۤۛۧۛ۫۟ۨۘۚ۬ۨۡ"
            goto L_0x000b
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.a(boolean, android.graphics.drawable.Drawable):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r0 = "ۨۤۥۨۥۦۘ۠۠ۖۛۚۙۘۗ۬ۖۥۛ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void after_onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            java.lang.String r0 = "ۡ۟ۖۘۢۘۥۛۘ۬ۦ۠ۨۘۥۘ۬"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 954(0x3ba, float:1.337E-42)
            r3 = -2104444174(0xffffffff8290baf2, float:-2.12662E-37)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -2038190546: goto L_0x0014;
                case -1558032707: goto L_0x0064;
                case -1526745145: goto L_0x0011;
                case -1305857780: goto L_0x001a;
                case -121969207: goto L_0x0040;
                case 1089604947: goto L_0x006c;
                case 1554504426: goto L_0x003b;
                case 1974111539: goto L_0x0017;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "۠ۤۗۤۧۖۘۥۖ۠ۚۧۨۖۧۖ۫ۡ۠۬ۥۧۘۖۢۥ"
            goto L_0x0002
        L_0x0014:
            java.lang.String r0 = "ۤ۫ۦۘۥ۬ۛۙۧۡۘۤۦۧۘۙ۠ۜۦ۟ۖۘۨ۫۫ۘۗۙۛۖۧۘ"
            goto L_0x0002
        L_0x0017:
            java.lang.String r0 = "ۗۜۤ۟۠ۦۥۘۙ۫۬ۗۖۦۛۖۤۧ"
            goto L_0x0002
        L_0x001a:
            r1 = 1931439445(0x731f6d55, float:1.2631114E31)
            java.lang.String r0 = "ۧۗۜۥۨۖ۠ۚ۫ۡۥۚۨۦۖۘ۫ۗۛۖۗۖ۟ۛ"
        L_0x001f:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1395612337: goto L_0x0028;
                case -1019256357: goto L_0x002e;
                case 48105098: goto L_0x0035;
                case 276569674: goto L_0x0038;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x001f
        L_0x0028:
            java.lang.String r0 = "ۨۤۥۨۥۦۘ۠۠ۖۛۚۙۘۗ۬ۖۥۛ"
            goto L_0x0002
        L_0x002b:
            java.lang.String r0 = "۬۟ۗ۟ۤۖۘۤ۫ۡۘۡۨۥۘ۠ۘۨۘۜۖۢۤۡۘۘ"
            goto L_0x001f
        L_0x002e:
            r0 = 717(0x2cd, float:1.005E-42)
            if (r4 != r0) goto L_0x002b
            java.lang.String r0 = "ۛۦۗۘۖۡۥۨۤۢۦۥۘۛ۟۠ۤ۬ۢ"
            goto L_0x001f
        L_0x0035:
            java.lang.String r0 = "ۜ۠ۦۡۤۨۘ۫ۖۙۚۖۥۘۗۚۨۥۚ۟ۚ۟ۚۧ"
            goto L_0x001f
        L_0x0038:
            java.lang.String r0 = "ۗۜۜۜۦۨۡۡۙۧۦۥ۟ۨ۟"
            goto L_0x0002
        L_0x003b:
            f512a = r5
            java.lang.String r0 = "ۤۖۥ۠ۤۗۥ۟ۧۨ۟ۦۘۡۖ۬"
            goto L_0x0002
        L_0x0040:
            r1 = 2031097369(0x79101619, float:4.6758684E34)
            java.lang.String r0 = "ۙۧۘۦ۟ۨۘۘۛۘۖۢۨۘ۬ۜۢۚۚۦۘ۠۠ۜۘۢۗۙۛۙۘ"
        L_0x0045:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1866220677: goto L_0x004e;
                case -670898000: goto L_0x0061;
                case -540817432: goto L_0x0028;
                case 233443777: goto L_0x0054;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x0045
        L_0x004e:
            java.lang.String r0 = "۫ۘۧۖۤۘۘۡ۬ۙ۬ۛۙۜۦۛۧۖۘۥۧۡۘ"
            goto L_0x0002
        L_0x0051:
            java.lang.String r0 = "ۢۡۛ۫ۙۤۘ۬ۥۜۨۘ۫ۨۧۡۙۦ۟ۖۡ"
            goto L_0x0045
        L_0x0054:
            java.lang.String r0 = com.obwhatsapp.yo.yo.getCurr_sJid()
            int r0 = r0.hashCode()
            if (r5 == r0) goto L_0x0051
            java.lang.String r0 = "۬۬ۙۦۤۨۜۙۦۘۧ۟ۜ۫ۧۗۧۦ۟"
            goto L_0x0045
        L_0x0061:
            java.lang.String r0 = "ۨۘۖ۟ۥۥ۬ۛۚۢۗۙ۬ۡۙ۠ۛۦۘۛ۟ۥ"
            goto L_0x0045
        L_0x0064:
            com.obwhatsapp.Conversation r0 = f515d
            r0.finish()
            java.lang.String r0 = "ۨۤۥۨۥۦۘ۠۠ۖۛۚۙۘۗ۬ۖۥۛ"
            goto L_0x0002
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.after_onActivityResult(int, int, android.content.Intent):void");
    }

    public static void after_onCreateOptionsMenu(Menu menu) {
        try {
            f515d.runOnUiThread(new d(menu, 1));
        } catch (Exception e2) {
        }
    }

    public static void after_onDestroy(com.obwhatsapp.Conversation conversation) {
        String str = "ۨۢۖۘۙۜۨۘۢۗۛ۬ۖۙۨۥۜ";
        while (true) {
            switch ((str.hashCode() ^ 560) ^ 691527395) {
                case -1717228716:
                    str = "ۧۜۖۘۦۜۡۗ۬ۖۛۛۦ۟۫ۥۗۦ۬ۜۘۨۛۙ۫ۖۘ";
                    break;
                case -1622680717:
                    f518g = null;
                    str = "۬ۢۧۤۢۧۗۦۘۢۦۛۢۙۡۜۦۛۥۗۖۘۘ";
                    break;
                case 61249333:
                    return;
                case 1259626707:
                    f512a = -1;
                    str = "۠ۙ۫ۨۡۧۘۘ۠ۚۙۧۥۘۥۢۤۚۗۜۘۛۚۜۙۖۦۘۢۛۜ";
                    break;
                case 1271425412:
                    f514c = null;
                    str = "ۨۙۨۘۗۗ۬ۜ۫ۨۘ۫ۖۘۛۢۤۥۗۗۤۜۖۦۦۥۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0358, code lost:
        r1 = "ۡۛ۬ۤۤۡ۬ۜۨۘۥ۠ۡۘۙ۬ۨۘۛۗۨۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void after_onResume(com.obwhatsapp.Conversation r28) {
        /*
            r24 = 0
            r23 = 0
            r21 = 0
            r22 = 0
            r16 = 0
            r20 = 0
            r18 = 0
            r19 = 0
            r17 = 0
            r14 = 0
            r15 = 0
            r13 = 0
            r12 = 0
            r10 = 0
            r11 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r2 = 0
            java.lang.String r1 = "ۡۖۨۘۤۡۖۛۨۘۘۚۨ۠۬۠ۖۘۚ۠ۗ"
        L_0x0022:
            int r25 = r1.hashCode()
            r26 = 695(0x2b7, float:9.74E-43)
            r27 = 1732581126(0x67451706, float:9.307309E23)
            r25 = r25 ^ r26
            r25 = r25 ^ r27
            switch(r25) {
                case -2133764171: goto L_0x0120;
                case -2123255795: goto L_0x0278;
                case -1935980293: goto L_0x037c;
                case -1898355708: goto L_0x0064;
                case -1885233288: goto L_0x01a9;
                case -1835992629: goto L_0x0374;
                case -1790332293: goto L_0x0033;
                case -1780069564: goto L_0x027e;
                case -1776807726: goto L_0x035c;
                case -1607133349: goto L_0x0272;
                case -1403288141: goto L_0x00c8;
                case -1320044254: goto L_0x0053;
                case -1300703489: goto L_0x0134;
                case -1292051343: goto L_0x0158;
                case -1218362358: goto L_0x015e;
                case -1175305372: goto L_0x02d5;
                case -1158819170: goto L_0x02b7;
                case -1130200810: goto L_0x0364;
                case -1125961266: goto L_0x019e;
                case -1106484622: goto L_0x026a;
                case -1022365807: goto L_0x0284;
                case -1014361936: goto L_0x00d8;
                case -981286021: goto L_0x00b6;
                case -980807765: goto L_0x01ae;
                case -889881877: goto L_0x02db;
                case -876986801: goto L_0x00ce;
                case -871093460: goto L_0x0202;
                case -800416357: goto L_0x013a;
                case -791836215: goto L_0x02b1;
                case -729808105: goto L_0x01e8;
                case -728757549: goto L_0x0305;
                case -713280865: goto L_0x011a;
                case -614788215: goto L_0x02a8;
                case -451406037: goto L_0x005e;
                case -406600129: goto L_0x0338;
                case -385970464: goto L_0x0073;
                case -280915684: goto L_0x01c0;
                case -267181764: goto L_0x017e;
                case -155041678: goto L_0x02f0;
                case -148123866: goto L_0x0236;
                case -61531657: goto L_0x033e;
                case -42027466: goto L_0x0264;
                case -32837033: goto L_0x030b;
                case -26388752: goto L_0x01b4;
                case 73583971: goto L_0x010a;
                case 146108869: goto L_0x0098;
                case 273469434: goto L_0x02f0;
                case 311468059: goto L_0x00fc;
                case 622474548: goto L_0x0216;
                case 759385942: goto L_0x00bc;
                case 801367538: goto L_0x0354;
                case 832594563: goto L_0x0256;
                case 878165242: goto L_0x0036;
                case 931138568: goto L_0x034c;
                case 939453415: goto L_0x01fc;
                case 940865815: goto L_0x0082;
                case 979484646: goto L_0x031a;
                case 1011950782: goto L_0x02a2;
                case 1030940362: goto L_0x00c2;
                case 1041930213: goto L_0x0126;
                case 1075607852: goto L_0x01f7;
                case 1088524679: goto L_0x0058;
                case 1334965235: goto L_0x01ed;
                case 1581985634: goto L_0x00de;
                case 1632076048: goto L_0x0091;
                case 1697678113: goto L_0x01a4;
                case 1785602126: goto L_0x01e0;
                case 1856418361: goto L_0x0314;
                case 1879446818: goto L_0x0110;
                case 1938052394: goto L_0x02e1;
                case 1939838567: goto L_0x037c;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x0022
        L_0x0033:
            java.lang.String r1 = "ۤ۟ۦۘۢۢۡۡ۟۬۟ۦ۬ۘۨۦ"
            goto L_0x0022
        L_0x0036:
            r25 = -1975133827(0xffffffff8a45d97d, float:-9.52611E-33)
            java.lang.String r1 = "ۨۥۧۗۘ۫ۚۛۜۦۗ۫۠ۡۨۚۨۙۘۥۦ"
        L_0x003b:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -581116939: goto L_0x0344;
                case 240988843: goto L_0x004b;
                case 1048228175: goto L_0x0050;
                case 1618248299: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x003b
        L_0x0045:
            java.lang.String r1 = "ۢۡۖۙۜۜۛۨۛۢۤۥۘۗۢۢ"
            goto L_0x0022
        L_0x0048:
            java.lang.String r1 = "ۥ۬ۘۦۦۡۛ۟ۤۦۡۗ۫۟ۙۙۨ"
            goto L_0x003b
        L_0x004b:
            if (r28 != 0) goto L_0x0048
            java.lang.String r1 = "ۤ۫ۖۦۨۢۛۙ۠ۢۨۦۘۢۥۘۢۙۖۨ۬ۚۛۧۗ۫ۢۥۘ"
            goto L_0x003b
        L_0x0050:
            java.lang.String r1 = "ۘۖ۠ۨۙۨۘ۠ۡ۠ۨۨۧۘۖ۬ۥۘ"
            goto L_0x003b
        L_0x0053:
            f515d = r28
            java.lang.String r1 = "۟۠ۙ۬ۢۧۙۦ۫ۢۖۧۘۘۧۜۘ۬ۥۨۘۙ۫ۗۨۗۘۘ"
            goto L_0x0022
        L_0x0058:
            e()
            java.lang.String r1 = "۠ۗۚۢۨۖۘۨۖۡۘ۠۟ۖۘۥ۫ۘۘۚۚۘۘۙۜ"
            goto L_0x0022
        L_0x005e:
            g()
            java.lang.String r1 = "ۤۨ۬۟۠۟ۘۦۧۢۢۨۘۛۙ۟ۜۛ۬ۚۦ۟ۛۧۨۛۨ"
            goto L_0x0022
        L_0x0064:
            java.lang.String r1 = "quoted_name_picker"
            int r25 = f519h
            r0 = r25
            int r1 = com.obwhatsapp.youbasha.others.getColor(r1, r0)
            f519h = r1
            java.lang.String r1 = "ۨۚۦۘۥۧۦ۟ۛ۟ۗۥۘۢ۟ۛۙۥۦۖۨۦ"
            goto L_0x0022
        L_0x0073:
            java.lang.String r1 = "quoted_text_picker"
            int r25 = f520i
            r0 = r25
            int r1 = com.obwhatsapp.youbasha.others.getColor(r1, r0)
            f520i = r1
            java.lang.String r1 = "ۚۥۧۘۡ۠۫۠ۧۡۡ۟ۖۧ۫ۖۡ۟ۨ"
            goto L_0x0022
        L_0x0082:
            java.lang.String r1 = "quoted_divider_picker"
            int r25 = f521j
            r0 = r25
            int r1 = com.obwhatsapp.youbasha.others.getColor(r1, r0)
            f521j = r1
            java.lang.String r1 = "ۧۘۚۤ۟۫۬۫ۘۥۛۥۘۧۨۧۢۖۙۡۜ۠۠۠ۢۖۢۤ"
            goto L_0x0022
        L_0x0091:
            boolean r24 = com.obwhatsapp.yo.yo.getGroupBoolean()
            java.lang.String r1 = "ۚ۬ۚۧۜ۠ۛۖۢۢۖۥ۬ۦ۬ۙۘۘ"
            goto L_0x0022
        L_0x0098:
            r25 = 484461137(0x1ce04a51, float:1.4842287E-21)
            java.lang.String r1 = "۫ۡۚ۠ۢ۬۠ۛۡۘۧۡ۟ۚۛ۬ۚۙۖۘ"
        L_0x009d:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -2060957175: goto L_0x00b3;
                case -1294204497: goto L_0x0348;
                case 165169090: goto L_0x00a7;
                case 1395180046: goto L_0x00ae;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            goto L_0x009d
        L_0x00a7:
            java.lang.String r1 = "ۢۛۨۤۛۨۙ۟ۥۘ۠۟۫ۧ۫ۙۖ۬ۦۖۘۘ"
            goto L_0x0022
        L_0x00ab:
            java.lang.String r1 = "ۘۙۤۜۗۜۘۨ۬ۖۘۥۧ۠۠ۢۜۘۛۡۧۘ۟ۧۦۗۙ۫"
            goto L_0x009d
        L_0x00ae:
            if (r24 == 0) goto L_0x00ab
            java.lang.String r1 = "ۖۨۜۤۚۜۥۡۥۘۨۘۜۘۙۘۖۘ"
            goto L_0x009d
        L_0x00b3:
            java.lang.String r1 = "ۧ۫ۧۘۛۖۦۖۥۘۖۚۚۦ۫ۗ۫ۤۗۙۢۤۢۙۖ"
            goto L_0x009d
        L_0x00b6:
            java.lang.String r23 = "group_mypicV2"
            java.lang.String r1 = "۟ۧۡۜۘۥۢۖ۟ۨۦۡۥۨۜۘۥ۠۫۬ۧۧۙ۫ۜ"
            goto L_0x0022
        L_0x00bc:
            java.lang.String r1 = "ۥۙۗۡۛۦۘۘۨ۟ۜۥۡۧۤۖۧۛۜۤۨ۫ۥۜۡۧۥۧۘ"
            r22 = r23
            goto L_0x0022
        L_0x00c2:
            java.lang.String r21 = "chat_mypicV2"
            java.lang.String r1 = "ۨۢۘۘ۫ۗ۬ۥ۟ۜۘ۫۠ۧ۟۬ۡۧ۫ۘۘ"
            goto L_0x0022
        L_0x00c8:
            java.lang.String r1 = "ۜۙۨۘۦۢ۫ۗ۠۫۬ۗۨۖۚۜۘ۫ۤ۠۟ۜۥ"
            r22 = r21
            goto L_0x0022
        L_0x00ce:
            boolean r1 = com.obwhatsapp.yo.shp.getBoolean(r22)
            f531t = r1
            java.lang.String r1 = "ۚۚۙۨ۟ۡۘۖۦۢۨ۠ۥۤ۟ۙۗۡۗۛۦۦۢۙ"
            goto L_0x0022
        L_0x00d8:
            r16 = 1
            java.lang.String r1 = "۫ۘۢ۬ۘۘۗۡۚۦۘۥۧ۠۠ۖۘۛ۠۟۬ۥۥۘ۫ۚۙ"
            goto L_0x0022
        L_0x00de:
            r25 = -1182957367(0xffffffffb97d80c9, float:-2.4175936E-4)
            java.lang.String r1 = "ۜۥۘۖۤۖۥۡۧۘۘۘۡۘ۬ۘۖۘۨۤۨ۫ۢۚۤۙۖ"
        L_0x00e3:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1746230286: goto L_0x00ed;
                case -764197354: goto L_0x00f3;
                case -125448534: goto L_0x00f8;
                case 565861432: goto L_0x0350;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            goto L_0x00e3
        L_0x00ed:
            java.lang.String r1 = "ۨ۠ۦۘۛۗۤۚۖۧ۫ۜۨۙۜۨۘۥۙۨۘۧۦۤۦۡۢ"
            goto L_0x00e3
        L_0x00f0:
            java.lang.String r1 = "ۚۚۥۙۘۥۘ۬ۥۘ۫۟۫ۡ۬ۙۢۗ۫ۡۗۥ۟ۥۦۘۨۖۥۘ"
            goto L_0x00e3
        L_0x00f3:
            if (r24 == 0) goto L_0x00f0
            java.lang.String r1 = "ۚۢۦۘۙۛۛۜۙۙۖۥ۠ۚ۫۠"
            goto L_0x00e3
        L_0x00f8:
            java.lang.String r1 = "ۜۧ۬۠ۘۨۗۤ۬ۧ۠ۗ۫ۗۨۘ"
            goto L_0x0022
        L_0x00fc:
            java.lang.String r1 = "group_participants_picV2"
            r20 = 1
            r0 = r20
            boolean r20 = com.obwhatsapp.yo.shp.getBoolean(r1, r0)
            java.lang.String r1 = "ۡۙۥۛۖۥۘۨۛۗۡ۟۬۟۟ۗ"
            goto L_0x0022
        L_0x010a:
            java.lang.String r1 = "ۖۨۚۗۡۚ۬۠ۗۗۤ۫ۘۙۜۘۨۗۢۚۧ۬ۛ۬ۢۜۚ"
            r19 = r20
            goto L_0x0022
        L_0x0110:
            java.lang.String r1 = "chat_contactpicV2"
            boolean r18 = com.obwhatsapp.yo.shp.getBoolean(r1)
            java.lang.String r1 = "ۢ۠ۧۧۖۘۧۡۚۙۥۗۤ۟ۤۡۢۧۨۦۚۢۧۧ"
            goto L_0x0022
        L_0x011a:
            java.lang.String r1 = "ۦۢۜۧۤۜۘۖۢۘۢۡ۠ۢۖۜۧۡۘ"
            r19 = r18
            goto L_0x0022
        L_0x0120:
            f530s = r19
            java.lang.String r1 = "ۦۤۢۙۜۖۜۘۨۘۖۤۥۦۜۖۘ"
            goto L_0x0022
        L_0x0126:
            java.lang.String r1 = "pic_inside"
            r17 = 0
            r0 = r17
            boolean r17 = com.obwhatsapp.yo.shp.getBoolean(r1, r0)
            java.lang.String r1 = "۟۬ۗۥ۬ۥۡۥۡۘۖۢۖۘۧۗۘ۬ۤۥۘۨۖۛ۬۟ۘ"
            goto L_0x0022
        L_0x0134:
            f532u = r17
            java.lang.String r1 = "ۜۨۜۘۗۤۛۙۢۗۖۖ۟ۛۖۘۘۗ۬ۙۡۙ"
            goto L_0x0022
        L_0x013a:
            r25 = 1483602464(0x586dfa20, float:1.04663414E15)
            java.lang.String r1 = "ۤۡۜۘۛۢۜۢۨۥۘۢ۟ۘۖۛۦۘ۠۬ۘۘۖۙۥۢ۫"
        L_0x013f:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -597082011: goto L_0x0149;
                case 3881794: goto L_0x014f;
                case 1638174135: goto L_0x0154;
                case 2110291248: goto L_0x0358;
                default: goto L_0x0148;
            }
        L_0x0148:
            goto L_0x013f
        L_0x0149:
            java.lang.String r1 = "ۙۧۜۘۜ۫ۜۧۥۖۙ۫ۘۚ۟۫۫ۖ۟ۗۜۥۘ"
            goto L_0x013f
        L_0x014c:
            java.lang.String r1 = "ۗۡۤۗ۫ۙۚۜ۬ۗۨۖۘۥ۬۫ۥۥۡۘ۟ۚۥۘۙۧۡۦۚۘۘ"
            goto L_0x013f
        L_0x014f:
            if (r17 != 0) goto L_0x014c
            java.lang.String r1 = "ۢۤ۫ۨۘۘۖ۫۫ۤۨۧۘۥۗۖۘۥۢۢ"
            goto L_0x013f
        L_0x0154:
            java.lang.String r1 = "۫ۘۧۘۤۨۖۘ۬۫ۧۧۨۦۦۙۘ۠ۘۜۗۤۥۘ"
            goto L_0x0022
        L_0x0158:
            java.lang.String r1 = "ۤۨۘۦ۟ۨۖۡۨۨۨۙۤۘۧۘۗ۟۟"
            r15 = r16
            goto L_0x0022
        L_0x015e:
            r25 = 1974691524(0x75b366c4, float:4.5483666E32)
            java.lang.String r1 = "۫ۘۦۜۚۡۘۗۥۨ۬۠ۡ۫ۛۧۖۚ"
        L_0x0163:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -845858242: goto L_0x0173;
                case -741282630: goto L_0x017a;
                case 425084488: goto L_0x016d;
                case 805431473: goto L_0x035c;
                default: goto L_0x016c;
            }
        L_0x016c:
            goto L_0x0163
        L_0x016d:
            java.lang.String r1 = "ۘۥۖ۟ۤ۠ۖۜ۫ۢۥ۠ۨۜ"
            goto L_0x0163
        L_0x0170:
            java.lang.String r1 = "ۦۖۡۖۛۥۘۥ۠ۖۘۗۗۤۢۨ۫۠ۨۚ۠۫۫ۥۜۦۘۚۡۚ"
            goto L_0x0163
        L_0x0173:
            boolean r1 = f530s
            if (r1 != 0) goto L_0x0170
            java.lang.String r1 = "ۤ۠ۛۖۜۡۘ۬ۥۦۡ۫ۖ۬ۘۨۙ۫۫ۘۢۙۤۙ"
            goto L_0x0163
        L_0x017a:
            java.lang.String r1 = "ۙۚ۬ۗ۫ۦۘۜۦۘ۬ۚۜۘ۫ۚۙۖۘۘۥ۠ۛ"
            goto L_0x0022
        L_0x017e:
            r25 = 1714994859(0x6638beab, float:2.1810816E23)
            java.lang.String r1 = "ۧۖۜۤۦۡۛۥۥۡ۠ۘۘ۟ۗ۠ۢۢۘۘ"
        L_0x0183:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1752214802: goto L_0x019a;
                case -1354872000: goto L_0x0197;
                case -1097188565: goto L_0x018d;
                case 570120972: goto L_0x0358;
                default: goto L_0x018c;
            }
        L_0x018c:
            goto L_0x0183
        L_0x018d:
            boolean r1 = f531t
            if (r1 == 0) goto L_0x0194
            java.lang.String r1 = "ۜۡ۬۠ۦۤۨ۠ۨۘۜۚۥۘۛۗۦۦۦۧۘ"
            goto L_0x0183
        L_0x0194:
            java.lang.String r1 = "ۗۛۘۘۢۛ۠۠ۢۢ۠ۙۚۥۤۘۢۗۦۘۘ۠۫"
            goto L_0x0183
        L_0x0197:
            java.lang.String r1 = "۬ۛ۟ۜ۟ۡۘۨۖۧۘۚۛۗۛۧۜ۠۬ۙۖۦ۠ۚۧۦۘ"
            goto L_0x0183
        L_0x019a:
            java.lang.String r1 = "ۘۥۡۘ۬ۦۡۙۘۦۤۙۦۚۙۨۘۚۛ۬۠۬۬۫ۢۢۨۗۨ"
            goto L_0x0022
        L_0x019e:
            java.lang.String r1 = "ۥ۟ۥۧۨۨۘ۠۬ۗۗۢۗ۟ۗۚۡ۠ۧ"
            r15 = r16
            goto L_0x0022
        L_0x01a4:
            r14 = 0
            java.lang.String r1 = "ۧۦۤۤۜۛۧ۫ۜۤۚۤۢۜۗ"
            goto L_0x0022
        L_0x01a9:
            java.lang.String r1 = "ۥۜۧۡۖ۫۫ۜۥۧۛ۫ۤۤۨۘۙۜۘۘۘۨۖۘۦۤۢۤۚۦ"
            r15 = r14
            goto L_0x0022
        L_0x01ae:
            f533v = r15
            java.lang.String r1 = "۠ۖۘۥۤۘ۠۟ۥۘۘۛۥ۬ۨۘ۟ۛۖۘ"
            goto L_0x0022
        L_0x01b4:
            java.lang.String r1 = "pic_chat_size_pickerV2"
            r13 = 36
            int r13 = com.obwhatsapp.yo.shp.getPrefInt(r1, r13)
            java.lang.String r1 = "ۜۨۥۦۗۘ۠۫ۡۜۛۖۘ۠ۢۦۘۢ۠ۖۦ۫ۨ۬ۙۡۘۗۖۖۘ"
            goto L_0x0022
        L_0x01c0:
            r25 = 526675362(0x1f646da2, float:4.8371564E-20)
            java.lang.String r1 = "ۛۦۦ۟۬ۜۘ۬ۧۜۥۜۘۡ۟ۡۡۨۖ"
        L_0x01c5:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case 9177533: goto L_0x0360;
                case 102924055: goto L_0x01cf;
                case 711804825: goto L_0x01dd;
                case 1665118674: goto L_0x01d6;
                default: goto L_0x01ce;
            }
        L_0x01ce:
            goto L_0x01c5
        L_0x01cf:
            java.lang.String r1 = "ۤۖۘۨۚ۫ۚۖۨۢۘۤۗۜۥۖ۫ۦۘ۟ۥۨۨۥۦۘ"
            goto L_0x0022
        L_0x01d3:
            java.lang.String r1 = "ۦۖۗ۬ۛۥۘۙ۟ۘOۛۤ۠ۚ۫ۨ۟ۨۖۘۜۜۘۧۗۖ"
            goto L_0x01c5
        L_0x01d6:
            boolean r1 = f532u
            if (r1 == 0) goto L_0x01d3
            java.lang.String r1 = "ۛۡۜۘۗۜۛۙۨۚۡۡۖۘۙۦۡ"
            goto L_0x01c5
        L_0x01dd:
            java.lang.String r1 = "ۦۙۨۘۖۙۘۢۨۦ۠ۦ۟ۖۘۥۘۗۧۗۜۢۚۡۘ۫ۜ"
            goto L_0x01c5
        L_0x01e0:
            int r12 = com.obwhatsapp.youbasha.task.utils.dimenInDP(r13)
            java.lang.String r1 = "ۖۛۡۜۚۦۙ۟ۜۨۦۤۡۡۘۙۤۡۘۧۙ۫ۡ۬"
            goto L_0x0022
        L_0x01e8:
            java.lang.String r1 = "ۜ۟ۦۧ۠ۘۘۙۗۘۜۥۡۛۚۧۘ۬۬ۛۚۢۦۨۢ"
            r11 = r12
            goto L_0x0022
        L_0x01ed:
            r1 = 36
            int r10 = com.obwhatsapp.youbasha.task.utils.dimenInDP(r1)
            java.lang.String r1 = "ۢۥۚۛۙۧۖۘۖۘ۬ۘ۬ۡۗۚۦۚۖۘۧ۟ۡۘ۠۬ۨ"
            goto L_0x0022
        L_0x01f7:
            java.lang.String r1 = "ۗۚۜۘۥۢۘۦ۠ۢۤۦۜۘۨۥۚۡۚۧ۫ۖۗۙ۬ۦۘ"
            r11 = r10
            goto L_0x0022
        L_0x01fc:
            f534w = r11
            java.lang.String r1 = "ۥ۠ۤۦ۫ۜ۬ۘ۟ۙۙۛۡۦۗۡۜۘ۠ۛۗۛۨۦ۠۠ۛ"
            goto L_0x0022
        L_0x0202:
            java.lang.String r1 = "pic_startlocation"
            java.lang.String r25 = "1"
            r0 = r25
            java.lang.String r1 = com.obwhatsapp.yo.shp.getPrefString(r1, r0)
            int r1 = java.lang.Integer.parseInt(r1)
            f535x = r1
            java.lang.String r1 = "۫۬ۦۦۚۖ۟ۙ۟ۡۛۤۗۛ۫"
            goto L_0x0022
        L_0x0216:
            r25 = 1949769182(0x74371dde, float:5.803199E31)
            java.lang.String r1 = "ۛۨۡۗۢۦ۫ۜ۬ۦۥۜۘۨۢۘۗۚ۫ۧۚۡ۠"
        L_0x021b:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1924410701: goto L_0x0225;
                case 841681365: goto L_0x022b;
                case 1771225763: goto L_0x0232;
                case 2055872289: goto L_0x0368;
                default: goto L_0x0224;
            }
        L_0x0224:
            goto L_0x021b
        L_0x0225:
            java.lang.String r1 = "ۙۦۡۘۘۜۛ۟ۨۖۘۧۥۨۘۢۖۥۘۚ۬ۧۡۚۘ"
            goto L_0x021b
        L_0x0228:
            java.lang.String r1 = "ۜۜۗۗۙۛ۬ۜۖ۟ۧۗ۟۫ۦۘۤ۬ۡۥۛۖ۫ۨۖۘۦ۠ۨ"
            goto L_0x021b
        L_0x022b:
            boolean r1 = f533v
            if (r1 != 0) goto L_0x0228
            java.lang.String r1 = "ۗۢۜ۠۠ۖۘۢ۠۫ۙۡۜۘۚۖۥۘ"
            goto L_0x021b
        L_0x0232:
            java.lang.String r1 = "ۙۡۤۧۦۧۘ۫۬ۚۤۨۜۘۛۥۨۧۘۢۧۜۘ"
            goto L_0x0022
        L_0x0236:
            r25 = -168041348(0xfffffffff5fbe47c, float:-6.386234E32)
            java.lang.String r1 = "ۗۙۖ۬ۖۚ۫ۜۧۘ۠ۛۛ۬ۜۤۙۡۘۨۘ۟ۧۦۖۘ۬ۨ"
        L_0x023b:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1874400808: goto L_0x0245;
                case -105094491: goto L_0x0252;
                case 1789150226: goto L_0x036c;
                case 1935468754: goto L_0x024b;
                default: goto L_0x0244;
            }
        L_0x0244:
            goto L_0x023b
        L_0x0245:
            java.lang.String r1 = "ۘۚۡۘ۟ۦۗۜۥۨ۠ۦۧۘۧۥۖۤۡۥۜۚۤ۫ۡۢ۠ۤ"
            goto L_0x023b
        L_0x0248:
            java.lang.String r1 = "ۚۦۘۘۙۖۥۘ۬ۢۗۚۡ۬ۥۜۡۘ"
            goto L_0x023b
        L_0x024b:
            android.widget.LinearLayout$LayoutParams r1 = K
            if (r1 != 0) goto L_0x0248
            java.lang.String r1 = "۬ۖۤۗ۫ۢۙۨۧۘ۫ۛۗۘۘۧۘ"
            goto L_0x023b
        L_0x0252:
            java.lang.String r1 = "ۧ۫ۥۘ۟۬ۢۘۛۨۘۜۗۦۦ۬ۦۘ"
            goto L_0x0022
        L_0x0256:
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r25 = -2
            r0 = r25
            r9.<init>(r1, r0)
            java.lang.String r1 = "ۜۗۨۘۖۜۘۚ۟ۥۘۢۧ۫ۘۥۛ"
            goto L_0x0022
        L_0x0264:
            K = r9
            java.lang.String r1 = "ۨۧۜۘ۫ۨ۫ۥ۠۫۟ۧ۬۬ۖۘۤۤۥۘۙۙۥۘۗۥ۬۠ۢۖ"
            goto L_0x0022
        L_0x026a:
            r1 = 1065353216(0x3f800000, float:1.0)
            r9.weight = r1
            java.lang.String r1 = "ۨۢۥۘ۟ۚۘۢۥ۫ۖۤ۫۟ۚۡۢۙۘۘۦۧۚۤۥ۬"
            goto L_0x0022
        L_0x0272:
            android.widget.LinearLayout$LayoutParams r8 = I
            java.lang.String r1 = "ۚۦ۟ۡۡ۠ۡ۠ۧۚ۠۫ۚۨۧۘۤۚۨ۠ۛ۠ۜ۟ۛ"
            goto L_0x0022
        L_0x0278:
            int r7 = E
            java.lang.String r1 = "ۗۜۤۨۢۧ۠ۧۙ۠ۚۦۛۛۜۢۚۧۢ۫ۗۗۢۡۘ"
            goto L_0x0022
        L_0x027e:
            boolean r6 = D
            java.lang.String r1 = "ۢۦ۬ۘۗۖۘۤۜۚۢۤۖۖۛۙ۬ۘۥ"
            goto L_0x0022
        L_0x0284:
            r25 = 971233857(0x39e3da41, float:4.3459426E-4)
            java.lang.String r1 = "۬ۤۨۡۨۧۘۧۛۙۥ۟ۙ۫ۙۢ۠۫۠"
        L_0x0289:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -290661888: goto L_0x0374;
                case -172957406: goto L_0x0299;
                case 617625729: goto L_0x0293;
                case 1439650418: goto L_0x029e;
                default: goto L_0x0292;
            }
        L_0x0292:
            goto L_0x0289
        L_0x0293:
            java.lang.String r1 = "ۖۦۘۘۡۙۘۘۨۨۤۛۙۧ۟۠ۡ"
            goto L_0x0289
        L_0x0296:
            java.lang.String r1 = "ۜۘۖۘۘۗۢ۫ۢۜۤۜ۟۟ۙۨۘۛۨۦۘۛ۬ۘۘ"
            goto L_0x0289
        L_0x0299:
            if (r8 != 0) goto L_0x0296
            java.lang.String r1 = "ۤۗ۫۬ۧۖۜۙۘۘ۫ۥۗ۬ۦۘۙۤۘ۬۠ۧۨ۠ۡۥۜۙ"
            goto L_0x0289
        L_0x029e:
            java.lang.String r1 = "۠ۦۥۚۛۛۤ۫ۥۚۤۖۘۚۖۚ"
            goto L_0x0022
        L_0x02a2:
            int r5 = f534w
            java.lang.String r1 = "ۖۥۨۛۢ۬ۤۨۡۘ۟ۦۦۘۖۢۛۡۢۖۘۛ۬ۨۘۧۨ۬"
            goto L_0x0022
        L_0x02a8:
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r5, r5)
            java.lang.String r1 = "۟ۤ۠ۖۨۜۖۖۤۥۥۖۘۖ۠ۨۦۧۧ۠ۜۤ۬ۛ"
            goto L_0x0022
        L_0x02b1:
            I = r4
            java.lang.String r1 = "۟ۢۧ۟ۘۧ۟ۜۗ۠ۗۢۢۨۤۛۗۡۘۥۛۚۗۖۘۧۤۗ"
            goto L_0x0022
        L_0x02b7:
            r25 = -1504787150(0xffffffffa64ec532, float:-7.1737857E-16)
            java.lang.String r1 = "ۖۗۦۖۤۗ۬ۢۖۖۛۢ۟۠۠ۚۡۘ"
        L_0x02bc:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -1218217740: goto L_0x02d1;
                case -703080447: goto L_0x02c6;
                case 856219743: goto L_0x02ce;
                case 1801210931: goto L_0x0370;
                default: goto L_0x02c5;
            }
        L_0x02c5:
            goto L_0x02bc
        L_0x02c6:
            if (r6 == 0) goto L_0x02cb
            java.lang.String r1 = "ۤۚۗۘۜۦۘۛۖۦۨۘۢۧۢۦ"
            goto L_0x02bc
        L_0x02cb:
            java.lang.String r1 = "ۙۨۥۙۢۘۙۡۘ۬ۦ۟ۗۚۛۦۙۢۚ۠ۨۘۡۙۜۘۧ۟ۨ"
            goto L_0x02bc
        L_0x02ce:
            java.lang.String r1 = "ۥۡۖۗ۬ۡۨۢۦۖۘ۟ۢۥۘۘ۬۬"
            goto L_0x02bc
        L_0x02d1:
            java.lang.String r1 = "ۧۧۜ۟۬ۛۗ۫ۤۢۧۨۤ۬ۢ"
            goto L_0x0022
        L_0x02d5:
            r4.leftMargin = r7
            java.lang.String r1 = "ۦۦۧ۫ۡۤ۬۬ۥۜۖۨۘۢۚۛۖۨۖ۟ۖۛۚۚۛۚ"
            goto L_0x0022
        L_0x02db:
            r4.rightMargin = r7
            java.lang.String r1 = "ۢۦۘۘۤۨۘۖۢ۟ۢۧۛۛ۬ۡۘ"
            goto L_0x0022
        L_0x02e1:
            r25 = -696703562(0xffffffffd67925b6, float:-6.8485091E13)
            java.lang.String r1 = "ۢۖۖۛۚۧۙۘۛ۠ۢۤۘۡۚۜ۬ۖۘۖۨۙۖ۠۠ۡۥ"
        L_0x02e6:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case -759207300: goto L_0x02f7;
                case -704485029: goto L_0x0301;
                case -422686433: goto L_0x02fe;
                case -406785740: goto L_0x02f0;
                default: goto L_0x02ef;
            }
        L_0x02ef:
            goto L_0x02e6
        L_0x02f0:
            java.lang.String r1 = "ۚ۠۬۠ۧۙۜۨۖۘ۟ۢ۠ۢۚۖ۟۬ۨ۫ۦۜۛۧۥۘ۬ۤۢ"
            goto L_0x0022
        L_0x02f4:
            java.lang.String r1 = "۟ۦۨۘۧۥۙۖۗۘ۠ۛۜۘۧۗۖۘۢۦ۟ۢۜۜۘۢۥۢۜۦۖ"
            goto L_0x02e6
        L_0x02f7:
            android.widget.LinearLayout$LayoutParams r1 = J
            if (r1 != 0) goto L_0x02f4
            java.lang.String r1 = "ۨۜۡۚۖۦ۟ۦۙۚۥۛۧ۬ۙۡۖۧۘۛ۟ۖۦۦ۠۬ۘۨۘ"
            goto L_0x02e6
        L_0x02fe:
            java.lang.String r1 = "۟ۨ۫ۛۗۜۨ۟ۘۘۥۧ۠۠ۨۢۢ۟ۛ"
            goto L_0x02e6
        L_0x0301:
            java.lang.String r1 = "ۙ۠ۨۘۡۛۜۘ۟۠ۡۘۨۤۖۤ۬ۙۛۧ۟ۜۨۦۘۘۖۦۘۚۗۤ"
            goto L_0x0022
        L_0x0305:
            int r3 = f534w
            java.lang.String r1 = "ۤۛۙۧۦۙۙ۬ۨۘۘۤۜ۟ۖۦۘۤۘۘۗۧۙۥۡۥ"
            goto L_0x0022
        L_0x030b:
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r3, r3)
            java.lang.String r1 = "۫ۜۘۘۦۥۜۘۛ۫ۥۘۨۜۧۘ۟ۢۖۖ۟ۘۘ"
            goto L_0x0022
        L_0x0314:
            J = r2
            java.lang.String r1 = "ۥۤۤۙ۬ۡۘ۫ۢۧ۫ۜۥۘۖۖۘۘۦۢۥۨۨۦۘۥۚ۫ۡۘ"
            goto L_0x0022
        L_0x031a:
            r25 = 1346051837(0x503b1efd, float:1.2557481E10)
            java.lang.String r1 = "ۦۡۨۘۘۜۡ۫۬ۦۤۥۥۜۛۦۡۚۘۘ۟ۨ۬۠۬۟ۗۜۦ"
        L_0x031f:
            int r26 = r1.hashCode()
            r26 = r26 ^ r25
            switch(r26) {
                case 176201072: goto L_0x0378;
                case 1120833407: goto L_0x032f;
                case 1398178962: goto L_0x0329;
                case 1906013268: goto L_0x0334;
                default: goto L_0x0328;
            }
        L_0x0328:
            goto L_0x031f
        L_0x0329:
            java.lang.String r1 = "ۖۨۥۘۛۖ۫ۛۡۥۖ۟ۘ۠ۘۛۗۘ"
            goto L_0x031f
        L_0x032c:
            java.lang.String r1 = "ۥۛۘۦۤۙ۟۠ۖۘۛۤۛۗۗۨۜۙۘۨ۬ۘۘ"
            goto L_0x031f
        L_0x032f:
            if (r6 == 0) goto L_0x032c
            java.lang.String r1 = "ۡ۠ۙ۬۬ۛ۟۫ۡۘۛ۠ۙ۟ۦۧۡ۟ۚۥۡۜۘۗۗۛۤۙۛ"
            goto L_0x031f
        L_0x0334:
            java.lang.String r1 = "ۙۘۧۘ۠ۚۢۜ۬ۥۖۨۡۘۧ۬ۜۘۛۜۦۖۨ۫ۗۘۦۘ"
            goto L_0x0022
        L_0x0338:
            r2.rightMargin = r7
            java.lang.String r1 = "ۡۗۦۤۦۡۘۦۧۥۥۖۘ۠ۛۗۙ۟ۡ"
            goto L_0x0022
        L_0x033e:
            r2.leftMargin = r7
            java.lang.String r1 = "ۚ۠۬۠ۧۙۜۨۖۘ۟ۢ۠ۢۚۖ۟۬ۨ۫ۦۜۛۧۥۘ۬ۤۢ"
            goto L_0x0022
        L_0x0344:
            java.lang.String r1 = "۬ۦۚۢۘۤ۫ۦۡۦۤ۫ۚۗۢۨۖۡۤ۟ۢۨۨۗ"
            goto L_0x0022
        L_0x0348:
            java.lang.String r1 = "ۥۡۧۘ۠۟ۥۘۜۡۥۘۦۧۛۛ۬ۜۛ۫ۨۤۡۨ"
            goto L_0x0022
        L_0x034c:
            java.lang.String r1 = "ۜۙۨۘۦۢ۫ۗ۠۫۬ۗۨۖۚۜۘ۫ۤ۠۟ۜۥ"
            goto L_0x0022
        L_0x0350:
            java.lang.String r1 = "۟۬ۙۜۦۦۘۙۨ۫ۛۦۦۘۘۛۧۢۚۗ۬ۛۜۖۨ"
            goto L_0x0022
        L_0x0354:
            java.lang.String r1 = "ۦۢۜۧۤۜۘۖۢۘۢۡ۠ۢۖۜۧۡۘ"
            goto L_0x0022
        L_0x0358:
            java.lang.String r1 = "ۡۛ۬ۤۤۡ۬ۜۨۘۥ۠ۡۘۙ۬ۨۘۛۗۨۘ"
            goto L_0x0022
        L_0x035c:
            java.lang.String r1 = "ۥۜۧۡۖ۫۫ۜۥۧۛ۫ۤۤۨۘۙۜۘۘۘۨۖۘۦۤۢۤۚۦ"
            goto L_0x0022
        L_0x0360:
            java.lang.String r1 = "۫ۨۤ۟ۢۥۙۜ۠ۛۘۗۨۡۛۘۥۧۥ۟ۥۛ۠ۦۛۗ"
            goto L_0x0022
        L_0x0364:
            java.lang.String r1 = "ۗۚۜۘۥۢۘۦ۠ۢۤۦۜۘۨۥۚۡۚۧ۫ۖۗۙ۬ۦۘ"
            goto L_0x0022
        L_0x0368:
            java.lang.String r1 = "۠ۦۦۘۗ۫ۚۘ۬۠ۖۜۤۢۥۜۦۙۛ۟ۜۢۢۡۦۗ۫ۜ"
            goto L_0x0022
        L_0x036c:
            java.lang.String r1 = "ۨۢۥۘ۟ۚۘۢۥ۫ۖۤ۫۟ۚۡۢۙۘۘۦۧۚۤۥ۬"
            goto L_0x0022
        L_0x0370:
            java.lang.String r1 = "ۜ۬ۖۚ۟ۙ۠۬۟ۡۖ۫ۡۛ۬ۜۥۤ"
            goto L_0x0022
        L_0x0374:
            java.lang.String r1 = "ۢۦۘۘۤۨۘۖۢ۟ۢۧۛۛ۬ۡۘ"
            goto L_0x0022
        L_0x0378:
            java.lang.String r1 = "ۨۖۨۚۗۡۜ۠ۡۧۗۗۧۤۗ"
            goto L_0x0022
        L_0x037c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.after_onResume(com.obwhatsapp.Conversation):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void after_onStart(com.obwhatsapp.Conversation r6) {
        /*
            r5 = 1
            r4 = 0
            r1 = -24533855(0xfffffffffe89a4a1, float:-9.147952E37)
            java.lang.String r0 = "ۡۛۦۘۖۥۙۨۜۤۛۥۘۘ۟۠ۗ"
        L_0x0007:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -624896093: goto L_0x001b;
                case 398198995: goto L_0x027b;
                case 1241875387: goto L_0x0010;
                case 1871316860: goto L_0x0018;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0007
        L_0x0010:
            if (r6 != 0) goto L_0x0015
            java.lang.String r0 = "ۡۥۧ۠۟ۦۘۚۨۖۥۦۘۘۤۨۘ۟ۛۦۘۦۗۛ"
            goto L_0x0007
        L_0x0015:
            java.lang.String r0 = "۬ۜۤۙۘۘۘۖۨ۫ۢۘۚۙۘۘۛۗۚۥ"
            goto L_0x0007
        L_0x0018:
            java.lang.String r0 = "ۦ۟ۗۦۘۖ۟ۢۗۨۤ۬۫ۛۙ۟ۜۖ"
            goto L_0x0007
        L_0x001b:
            f515d = r6
            e()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            f516e = r0
            g()
            java.lang.String r1 = com.obwhatsapp.yo.yo.getCurr_sJid()
            r2 = 1850861182(0x6e51e67e, float:1.6240254E28)
            java.lang.String r0 = "ۗۚۢۢ۫ۗ۬ۙۢۦۦ۠ۤۘۥۚۢۖۘۨۛۙۨۛۜ"
        L_0x0033:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1961138375: goto L_0x0048;
                case -566589350: goto L_0x003c;
                case 1621094426: goto L_0x004b;
                case 1789946151: goto L_0x0059;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x0033
        L_0x003c:
            boolean r0 = com.obwhatsapp.youbasha.ui.lockV2.LockUtils.isJIDLocked(r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "ۡ۟ۧ۠۫ۢۥۖۥۘۚ۫ۢۦ۫ۡۛ۠۫ۥۚۦۗ۫۫ۢۥۙ"
            goto L_0x0033
        L_0x0045:
            java.lang.String r0 = "ۘۗ۬ۥۤۚۧۘۜ۬ۛۦۘۡۨۨۚۖۖۨۤۛۡۢۨۘ"
            goto L_0x0033
        L_0x0048:
            java.lang.String r0 = "۬ۗۢۡۗۧۤۖۦۥۤ۫ۚۖۤ۬ۥۜۖۖۦۘ۟ۢۦ"
            goto L_0x0033
        L_0x004b:
            r2 = -354264104(0xffffffffeae25bd8, float:-1.3682548E26)
            java.lang.String r0 = "ۖ۫ۘ۬ۛۡۘ۠ۚ۫ۧۡ۫ۧ۟ۘۘ۠۫ۜۦ۬ۥ۬ۢۜ"
        L_0x0050:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -979928995: goto L_0x0059;
                case 682114304: goto L_0x00a7;
                case 1048683951: goto L_0x0095;
                case 1247716810: goto L_0x00a4;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x0050
        L_0x0059:
            java.lang.String r0 = "ModChatEntry"
            int r1 = com.obwhatsapp.yo.ColorStore.getDefaultConversationEntryBackground()     // Catch:{ Exception -> 0x0114 }
            int r1 = com.obwhatsapp.youbasha.others.getColor(r0, r1)     // Catch:{ Exception -> 0x0114 }
            android.graphics.drawable.Drawable r2 = f518g     // Catch:{ Exception -> 0x0114 }
            r3 = -61616819(0xfffffffffc53cd4d, float:-4.3989545E36)
            java.lang.String r0 = "۟ۘۥۥۧۥۖ۬ۤۧۨۘۜۥ۠۬ۧۨ"
        L_0x006a:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x0114 }
            r4 = r4 ^ r3
            switch(r4) {
                case -1235767205: goto L_0x0103;
                case -525205336: goto L_0x0073;
                case 1688100994: goto L_0x0109;
                case 2123468719: goto L_0x010d;
                default: goto L_0x0072;
            }     // Catch:{ Exception -> 0x0114 }
        L_0x0072:
            goto L_0x006a
        L_0x0073:
            java.lang.String r0 = "input_layout_background"
            android.view.View r0 = d(r0)     // Catch:{ Exception -> 0x0114 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x0114 }
            android.graphics.drawable.Drawable r2 = r0.getDrawable()     // Catch:{ Exception -> 0x0114 }
            r3 = 1165716122(0x457b6a9a, float:4022.6626)
            java.lang.String r0 = "۬۫۫ۚ۟ۗۖۥ۠ۙ۫۠ۖۜۙۧۥۥ"
        L_0x0084:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x0114 }
            r4 = r4 ^ r3
            switch(r4) {
                case -684475680: goto L_0x0115;
                case 749044109: goto L_0x008d;
                case 1312662513: goto L_0x020f;
                case 1509459938: goto L_0x020b;
                default: goto L_0x008c;
            }     // Catch:{ Exception -> 0x0114 }
        L_0x008c:
            goto L_0x0084
        L_0x008d:
            if (r2 == 0) goto L_0x0207
            java.lang.String r0 = "۟۟ۛۛۙۡۡۛۚۢ۟۬۠ۜۜۤۖۖۘ۠ۘۚۛۤۦۘۚۦۤ"
            goto L_0x0084
        L_0x0092:
            java.lang.String r0 = "ۜۙۘۘۢۤۦۘۢۗ۬۫ۖ۟ۧ۬ۦۖۡۘۖ۫ۜۤۤۘۘۜۘۜۘ"
            goto L_0x0050
        L_0x0095:
            int r0 = f512a
            java.lang.String r3 = com.obwhatsapp.yo.yo.getCurr_sJid()
            int r3 = r3.hashCode()
            if (r0 == r3) goto L_0x0092
            java.lang.String r0 = "ۜۡ۫ۚ۠ۡۦۦۡۘۚ۫ۥۘۢ۫ۖۘۢ۬ۖۘۗۢۘۘ"
            goto L_0x0050
        L_0x00a4:
            java.lang.String r0 = "ۗۤۧۨۨۜۜۘۢۚۘۖۛۘ۫ۢۨۦۛۚۥۘ"
            goto L_0x0050
        L_0x00a7:
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r2 = new com.obwhatsapp.youbasha.ui.lockV2.LockOptions
            r2.<init>()
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r0 = r2.setJID(r1)
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r0 = r0.setConversation(r5)
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r0 = r0.setJustCloseAfterSuccess(r5)
            r3 = 0
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r0 = r0.setPassedIntent(r3)
            com.obwhatsapp.youbasha.ui.lockV2.LockOptions r0 = r0.setChangePass(r4)
            r0.setDisableLock(r4)
            java.lang.Class r1 = com.obwhatsapp.youbasha.ui.lockV2.LockUtils.getLockTypeByJID(r1)
            r3 = 2070106193(0x7b635051, float:1.1802804E36)
            java.lang.String r0 = "۟ۧۥۖ۠۟۠ۖۤ۠۬ۨۗۘۡ۠ۗ۠"
        L_0x00cd:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case 72640426: goto L_0x0059;
                case 795786014: goto L_0x00dc;
                case 1429520858: goto L_0x00e1;
                case 2094240404: goto L_0x00d6;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            goto L_0x00cd
        L_0x00d6:
            java.lang.String r0 = "ۧۢۤ۬ۛۗۢۖۘۘۙ۫ۚۚۖۘۛ۬ۦۘۨۙۦ"
            goto L_0x00cd
        L_0x00d9:
            java.lang.String r0 = "ۘۘۗ۬ۗۨۘۨ۬ۜۙۘۗ۠ۘۙۗۘۖۘۢۙۦۘ"
            goto L_0x00cd
        L_0x00dc:
            if (r1 == 0) goto L_0x00d9
            java.lang.String r0 = "ۚۢۥۘۢۡۚۖۗۨۧۜۤۗۤۚ"
            goto L_0x00cd
        L_0x00e1:
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r3 = com.obwhatsapp.yo.yo.getCtx()
            r0.<init>(r3, r1)
            java.lang.String r1 = "lockoptions"
            android.os.Bundle r2 = r2.getBundle()
            r0.putExtra(r1, r2)
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0.setFlags(r1)
            r1 = 717(0x2cd, float:1.005E-42)
            r6.startActivityForResult(r0, r1)
            goto L_0x0059
        L_0x00ff:
            java.lang.String r0 = "ۤ۠ۨۘۙۥۧ۬ۢۗۘۨۘۘۦۚۛ"
            goto L_0x006a
        L_0x0103:
            if (r2 == 0) goto L_0x00ff
            java.lang.String r0 = "ۗۤۛۡۘۛۖۗۙۙۗۧۤۧۖۨۥۘ"
            goto L_0x006a
        L_0x0109:
            java.lang.String r0 = "ۙ۫ۚۦۦۦۥ۬ۜۦۤۦۘ۠ۗ۠"
            goto L_0x006a
        L_0x010d:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ Exception -> 0x0114 }
            r2.setColorFilter(r1, r0)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0073
        L_0x0114:
            r0 = move-exception
        L_0x0115:
            com.obwhatsapp.Conversation r0 = f515d     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = "footer"
            java.lang.String r2 = "id"
            int r1 = com.obwhatsapp.yo.yo.getID(r1, r2)     // Catch:{ Exception -> 0x0114 }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x0114 }
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0     // Catch:{ Exception -> 0x0114 }
            BGClip(r0)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r0 = "ModChaSendColor"
            java.lang.String r1 = "send"
            java.lang.String r2 = "ModChaSendColor"
            i(r1, r2)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = "emoji_picker_btn"
            java.lang.String r2 = "ModChatBtnColor"
            i(r1, r2)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = "emoji_picker_btn"
            java.lang.String r2 = "ModChatEmojiColor"
            i(r1, r2)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = "div2"
            java.lang.String r2 = "ModChatBtnColor"
            i(r1, r2)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = "camera_btn"
            java.lang.String r2 = "ModChatBtnColor"
            i(r1, r2)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = "yowa_hangouts_conversation_gallery"
            java.lang.String r2 = "ModChatBtnColor"
            i(r1, r2)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = "yowa_hangouts_conversation_camera"
            java.lang.String r2 = "ModChatBtnColor"
            i(r1, r2)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = "yowa_hangouts_conversation_location"
            java.lang.String r2 = "ModChatBtnColor"
            i(r1, r2)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = "yowa_hangouts_conversation_audio"
            java.lang.String r2 = "ModChatBtnColor"
            i(r1, r2)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = "yowa_hangouts_conversation_contact"
            java.lang.String r2 = "ModChatBtnColor"
            i(r1, r2)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = "input_attach_button"
            java.lang.String r2 = "ModChatBtnColor"
            i(r1, r2)     // Catch:{ Exception -> 0x0114 }
            r2 = -54123598(0xfffffffffcc623b2, float:-8.23039E36)
            java.lang.String r1 = "ۘۦۨۘۘۖۦ۫ۤۙ۟۠ۚ۠۬ۜ۟ۚۘۘۧۧ۠ۗۥۖۘ۟ۥۙ"
        L_0x017c:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x0114 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1312776551: goto L_0x021a;
                case 48966300: goto L_0x0232;
                case 895368123: goto L_0x022e;
                case 1810530813: goto L_0x0185;
                default: goto L_0x0184;
            }
        L_0x0184:
            goto L_0x017c
        L_0x0185:
            java.lang.String r1 = "voice_note_btn"
            i(r1, r0)
            java.lang.String r0 = "back"
            android.view.View r0 = d(r0)     // Catch:{ Exception -> 0x02ab }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x02ab }
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)     // Catch:{ Exception -> 0x02ab }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x02ab }
            android.graphics.drawable.Drawable r0 = r0.getDrawable()     // Catch:{ Exception -> 0x02ab }
            int r1 = com.obwhatsapp.yo.yo.mainpagercolor()     // Catch:{ Exception -> 0x02ab }
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN     // Catch:{ Exception -> 0x02ab }
            r0.setColorFilter(r1, r2)     // Catch:{ Exception -> 0x02ab }
        L_0x01a6:
            java.lang.String r0 = "date_divider_header"
            android.view.View r0 = d(r0)     // Catch:{ Exception -> 0x02ab }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x02ab }
            tvBalloons(r0)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r0 = "conversation_contact"
            android.view.View r0 = d(r0)     // Catch:{ Exception -> 0x02ab }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x02ab }
            android.content.SharedPreferences r1 = com.obwhatsapp.yo.shp.prefs     // Catch:{ Exception -> 0x02ab }
            java.lang.String r2 = "HomeBarText"
            r3 = -1
            int r2 = r1.getInt(r2, r3)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r1 = "conversation_contact_name"
            int r1 = com.obwhatsapp.yo.freqids.getId(r1)     // Catch:{ Exception -> 0x02ab }
            android.view.View r1 = r0.findViewById(r1)     // Catch:{ Exception -> 0x02ab }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x02ab }
            r1.setTextColor(r2)     // Catch:{ Exception -> 0x02ab }
            com.obwhatsapp.yo.r r3 = new com.obwhatsapp.yo.r     // Catch:{ Exception -> 0x02ab }
            r4 = 0
            r3.<init>(r1, r4)     // Catch:{ Exception -> 0x02ab }
            r1.post(r3)     // Catch:{ Exception -> 0x02ab }
            java.lang.String r1 = "conversation_contact_status"
            java.lang.String r3 = "id"
            int r1 = com.obwhatsapp.yo.yo.getID(r1, r3)     // Catch:{ Exception -> 0x02ab }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x02ab }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x02ab }
            r3 = 829761177(0x31752699, float:3.5674133E-9)
            java.lang.String r1 = "ۤۛۘۘۖۙۚۖۧۦۚۥۗۜۘۧۘۡۤۤۚۗۦۘۤۧۥۡ۫ۤ"
        L_0x01ed:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x02ab }
            r4 = r4 ^ r3
            switch(r4) {
                case -1614792583: goto L_0x023e;
                case -153166641: goto L_0x01f6;
                case 485961373: goto L_0x0239;
                case 1620710088: goto L_0x0241;
                default: goto L_0x01f5;
            }
        L_0x01f5:
            goto L_0x01ed
        L_0x01f6:
            r1 = 1385672706(0x5297b002, float:3.25746491E11)
            java.lang.String r0 = "۫ۖ۫ۘۦ۠۟ۘۦۘۘۡ۠ۦ۠ۤ۟۠"
        L_0x01fb:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -1519390644: goto L_0x0204;
                case -166008727: goto L_0x0251;
                case 497986323: goto L_0x0248;
                case 851177568: goto L_0x0267;
                default: goto L_0x0203;
            }
        L_0x0203:
            goto L_0x01fb
        L_0x0204:
            java.lang.String r0 = "۫ۙۦ۬ۚۢۥۥۡۘۧۚۚۜۨ۫"
            goto L_0x01fb
        L_0x0207:
            java.lang.String r0 = "ۨۙۙۨۧ۠۟ۚۜۘ۟ۥۘ۬ۛ۬ۗۤۢ"
            goto L_0x0084
        L_0x020b:
            java.lang.String r0 = "ۙۚۘۘۜ۬۬۫ۛۗۜۜۜۛۦۦۘۢۤ۟ۛ۫ۦۘۥ۬ۤ"
            goto L_0x0084
        L_0x020f:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ Exception -> 0x0114 }
            r2.setColorFilter(r1, r0)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0115
        L_0x0216:
            java.lang.String r1 = "ۗۥۨۦۗۛ۟۫ۗۧۧۡ۫۬۫ۤ۫ۨۥ۠ۡۘ"
            goto L_0x017c
        L_0x021a:
            java.lang.String r1 = "ConvoEntry"
            java.lang.String r3 = "7"
            java.lang.String r1 = com.obwhatsapp.yo.shp.getPrefString(r1, r3)     // Catch:{ Exception -> 0x0114 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0114 }
            r3 = 9
            if (r1 != r3) goto L_0x0216
            java.lang.String r1 = "ۘۢۚۥۙۖۜۤۨۘۖۘۤۡ۬۬۫ۚۚۗۗۘۥۡۛۦۙۥ"
            goto L_0x017c
        L_0x022e:
            java.lang.String r1 = "ۜۛۛ۬ۗۤۢۚۗۛ۠ۡۤ۠ۤ"
            goto L_0x017c
        L_0x0232:
            java.lang.String r0 = "ModChatBtnColor"
            goto L_0x0185
        L_0x0236:
            java.lang.String r1 = "۬ۢۤۥۘۦۘۗۗۡۘۛۥۧۤۥۗۚۜۧۘ"
            goto L_0x01ed
        L_0x0239:
            if (r0 == 0) goto L_0x0236
            java.lang.String r1 = "ۨۜ۠ۤۢۢۗ۠ۡۘۜ۬ۙۡۨۡۜۨۘۛۡۢۡۖۦۘ"
            goto L_0x01ed
        L_0x023e:
            java.lang.String r1 = "ۧۡ۠۠ۖۡۚۨۥۘۡۘۤۘ"
            goto L_0x01ed
        L_0x0241:
            r0.setTextColor(r2)
            goto L_0x01f6
        L_0x0245:
            java.lang.String r0 = "ۡۖۜۖۖۘۘۜۛۧۤۙۦۘ۠ۧ۟ۙۚۦ۫۬ۘۘۜۨۖۧۙۜۘ"
            goto L_0x01fb
        L_0x0248:
            boolean r0 = com.obwhatsapp.yo.yo.PicProf()
            if (r0 == 0) goto L_0x0245
            java.lang.String r0 = "ۥۥۚۜ۬ۢۤۜۘۤۘۘۖۖۨ۟ۢۨۡ۟ۥ"
            goto L_0x01fb
        L_0x0251:
            java.lang.String r0 = "icon_layout_anchor"
            android.view.View r0 = d(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r2 = 301678104(0x11fb3e18, float:3.9639086E-28)
            java.lang.String r1 = "ۛۢۡۘۥۤۜۘۖۦ۬ۗۡۘۛۧۘ"
        L_0x025e:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -270198346: goto L_0x0284;
                case 94008558: goto L_0x0287;
                case 848592066: goto L_0x0267;
                case 2040492345: goto L_0x027f;
                default: goto L_0x0266;
            }
        L_0x0266:
            goto L_0x025e
        L_0x0267:
            com.obwhatsapp.yo.yo.imgRes()
            com.obwhatsapp.youbasha.task.YTranslate.init()
            r1 = -1307215608(0xffffffffb2157908, float:-8.700461E-9)
            java.lang.String r0 = "ۡۘۘۘۛۜۧۖ۟ۧۛۨۘۡ۠ۖۘ"
        L_0x0272:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -939053355: goto L_0x0290;
                case -260635493: goto L_0x0299;
                case -7149559: goto L_0x029c;
                case 7109735: goto L_0x027b;
                default: goto L_0x027a;
            }
        L_0x027a:
            goto L_0x0272
        L_0x027b:
            return
        L_0x027c:
            java.lang.String r1 = "۟۬ۖۘ۬ۥۙۧۢۥۗۘۘۥۗۨۘۗۗۦۨۜۨۘۢۙۘۘۡ۟ۙ"
            goto L_0x025e
        L_0x027f:
            if (r0 == 0) goto L_0x027c
            java.lang.String r1 = "ۡۦۢ۫ۢۨۘۛۢۛۧ۠۫ۛۦ۬۬ۘۙ"
            goto L_0x025e
        L_0x0284:
            java.lang.String r1 = "ۤ۠ۜۘۡ۟ۦۘ۠ۜ۫ۤۢۡۙۢۤۛ۫ۚ۬ۧۧۚۡۜۦۨ"
            goto L_0x025e
        L_0x0287:
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x0267
        L_0x028d:
            java.lang.String r0 = "۫۫ۢۥۧ۠ۙۡۛۥۥ۬۟۟ۤ"
            goto L_0x0272
        L_0x0290:
            boolean r0 = isSwipeBackEnabled()
            if (r0 == 0) goto L_0x028d
            java.lang.String r0 = "ۚۗ۟۬۬ۜۘۦۘۦ۠ۚ۟ۧۜ۟ۡۗۘۦۛۜۘۤۢۚۨۜ۫"
            goto L_0x0272
        L_0x0299:
            java.lang.String r0 = "ۥۢۧۜۖ۟ۙۧ۠ۢۜۥۘۢۖۤۜۛۚۢۖۗۙ۫ۜ۟ۗۥۘ"
            goto L_0x0272
        L_0x029c:
            com.obwhatsapp.youbasha.ui.activity.SwipeBackController r0 = new com.obwhatsapp.youbasha.ui.activity.SwipeBackController
            com.obwhatsapp.Conversation r1 = f515d
            r0.<init>(r1)
            f517f = r0
            com.obwhatsapp.Conversation r0 = f515d
            com.obwhatsapp.youbasha.task.utils.modifyActivityForSwipeBack(r0)
            goto L_0x027b
        L_0x02ab:
            r0 = move-exception
            goto L_0x01a6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.after_onStart(com.obwhatsapp.Conversation):void");
    }

    public static void b(ImageView imageView, String str) {
        View.OnClickListener gnn;
        String str2 = "ۛۛۛ۫ۢ۟ۗۡۨۤۡۖۘۤۘۢۜۜۧ";
        while (true) {
            try {
                switch (str2.hashCode() ^ -261311830) {
                    case 539690457:
                        gnn = new gnn(f515d.getPickT());
                        break;
                    case 1292412153:
                        str2 = "ۡۢۤۦۛۡۛۤۛۨۢۤۦۡۘ۫ۡۘۥۢۖۘ۬ۚۦ";
                        continue;
                    case 1656717945:
                        String str3 = "ۘۦ۫ۤۤۨۨۡۢ۬ۚۤ۫ۡۚۗ۠ۜۚ۬ۛ";
                        while (true) {
                            switch (str3.hashCode() ^ -634575240) {
                                case -1387702950:
                                    if (str.contains("camera")) {
                                        str3 = "ۙۤۧۤۜۥۘۨۡۨۖۡۢۥۛۨۘ۫ۨۥۦ۟ۜۘۘ۠۬";
                                        break;
                                    } else {
                                        str3 = "ۘۛۦۘۖۖۙ۫ۡ۫ۧۘۢۧۦۙ";
                                        continue;
                                    }
                                case 200387170:
                                    String str4 = "۟ۙۨۘ۟۠ۡۚۨ۠۠ۛۨۘ۬ۗۛ";
                                    while (true) {
                                        switch (str4.hashCode() ^ 332221497) {
                                            case -992114576:
                                                if (str.contains("location")) {
                                                    str4 = "ۛۚۚۙۧۘ۫ۥۧۤ۠ۦۨۖۨۘ۬ۡۘۘ۬۫ۢ۫۟ۨۘۡۦۖۘ";
                                                    break;
                                                } else {
                                                    str4 = "۬۟ۘۚۥۨۘۤۗ۟ۗۜۡۘ۟ۘۦ۟ۚۡۢۦۘۘۨۥۘۨ۬ۨ";
                                                    continue;
                                                }
                                            case -551522186:
                                                str4 = "ۥۖۡۘۨۚۘۚۦۦ۬۫ۖۢۥۤۖ۫ۨ";
                                                continue;
                                            case -466269737:
                                                String str5 = "ۤۥۖۘ۫ۦۧۘ۟ۥۗۤۥۡۘۨۤ۠ۖۜۧ";
                                                while (true) {
                                                    switch (str5.hashCode() ^ 1931616554) {
                                                        case -1030212579:
                                                            if (str.contains("audio")) {
                                                                str5 = "ۡۥۖۘ۠ۤۡۡۚۥۤۤۤ۟ۗۘۡۡۦ";
                                                                break;
                                                            } else {
                                                                str5 = "ۛ۠ۧۤۜۨۘۙۗۡۘۡ۬ۙۘۦ۬";
                                                                continue;
                                                            }
                                                        case -87352123:
                                                            gnn = new exx(f515d.getPickT());
                                                            break;
                                                        case 274122207:
                                                            str5 = "ۚۖۗۧۡۡ۫ۘۥۘۚۦۥۘۦۢۖ";
                                                            continue;
                                                        case 1125676517:
                                                            String str6 = "ۖۧۗۤۜ۬ۜۛۨۦۙۦۘۖۢۥۘ";
                                                            while (true) {
                                                                switch (str6.hashCode() ^ 132986329) {
                                                                    case -1832445034:
                                                                        str6 = "ۗۨ۠ۤۜۜۘۡ۫۬ۜۜۧۦۘۙۘۘۘ۬ۜۡۡۛ۬";
                                                                        continue;
                                                                    case -1515838109:
                                                                        gnn = new ezz(f515d.getPickT());
                                                                        break;
                                                                    case -1500683354:
                                                                        if (str.contains("contact")) {
                                                                            str6 = "۟ۤۦۡۢۨ۬ۙ۫ۢۧۦۨۙۡۘ۟ۜ۠۫ۚۡۨ۟۟ۡ۬ۢ";
                                                                            break;
                                                                        } else {
                                                                            str6 = "۫۠۫ۙۗۖ۫ۛۧۘ۬ۤۥۡۥ۬ۘۜۘ";
                                                                            continue;
                                                                        }
                                                                    case -1075199825:
                                                                        String str7 = "ۖۨۧۘۢۗۘۦۙۗۤۜۖۘۤ۫ۦۖۚۡۘۧۗۙ";
                                                                        while (true) {
                                                                            switch (str7.hashCode() ^ -1076385121) {
                                                                                case -1437733454:
                                                                                    if (str.contains("document")) {
                                                                                        str7 = "۠ۜ۟ۖۡ۠۟ۙۡۤ۫ۙ۬ۖ۠ۖۢۥ";
                                                                                        break;
                                                                                    } else {
                                                                                        str7 = "ۤ۠ۡۘۨۖۨۘۥۛ۬ۘۨۘۥۗۜۘ۟ۗۥۘۨۨ۠ۧ۫ۢ";
                                                                                        continue;
                                                                                    }
                                                                                case -1081495965:
                                                                                    gnn = new edd(f515d.getPickT());
                                                                                    break;
                                                                                case 993180837:
                                                                                    return;
                                                                                case 1241692479:
                                                                                    str7 = "ۥۡ۬ۤ۠ۡۥۡۖۘ۠ۡۡۘۘۨۗۢۚ۫ۛۧ۟";
                                                                                    continue;
                                                                                default:
                                                                                    continue;
                                                                            }
                                                                        }
                                                                    default:
                                                                        continue;
                                                                }
                                                            }
                                                        default:
                                                            continue;
                                                    }
                                                }
                                            case 1777697236:
                                                gnn = new eyy(f515d.getPickT());
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                case 792685476:
                                    str3 = "ۡ۫۠۫ۤۨۘ۬ۛۗۡۗۥۘۙۨۡۤۢۚۙۡۛ";
                                    continue;
                                case 1580100271:
                                    gnn = new igg(f515d);
                                    break;
                                default:
                                    continue;
                            }
                        }
                    case 1903852771:
                        if (str.contains("gallery")) {
                            str2 = "۬ۚۦۘۙ۬۫ۧۖۘۡۖۧۨۛ۬ۤۖۖۘۧ۠ۦۘۚۙۘۥۤۦۘ";
                            break;
                        } else {
                            str2 = "۠۫ۙۧۗۢۥۧ۟ۨۚۥۖۗۥۘۜۡ";
                            continue;
                        }
                    default:
                        continue;
                }
            } catch (Exception e2) {
                return;
            }
        }
        imageView.setOnClickListener(gnn);
    }

    public static void c(Activity activity, String str) {
        boolean z2 = false;
        String str2 = "ۜۜ۟۫ۤۗۧۤۤۨۘ۬ۚۜۨۥۤ۬ۧۤ";
        Intent intent = null;
        LockOptions lockOptions = null;
        while (true) {
            switch ((str2.hashCode() ^ 413) ^ 1308500027) {
                case -2033762131:
                    str2 = "ۧۥۘۘۥۧۥۘۚ۫ۛۚۙ۫۠ۖۜۘ";
                    break;
                case -1815795254:
                    return;
                case -1428688994:
                    str2 = "ۤۤۥۦ۫ۛۡ۟۬ۨۜۗ۠ۨ۠ۚۥۧۘۘ۟۠ۚۘۖۘ";
                    break;
                case -578386048:
                    activity.startActivity(intent);
                    str2 = "ۦ۫ۡۘۘۥۦۧۜۗۦ۫ۖۛۥۨ۟ۘ۟ۙۦ۬ۨۘۤ";
                    break;
                case -466952658:
                    intent = new Intent(activity, LockUtils.getLockTypeByJID(str));
                    str2 = "ۘ۫ۢ۫ۨۧۙ۬ۘۘۤۗۦۘۛۗۖۘۧۙۢۘۥ۬";
                    break;
                case -77866513:
                    str2 = "ۚۖۥۚۛۜۘۙ۟ۜۗ۫۠ۘ۫۬ۨ۬ۛۡۗۜۘ";
                    break;
                case 28277670:
                    intent.putExtra("lockoptions", lockOptions.getBundle());
                    str2 = "۠ۢۖۡ۟ۦۘۧۘۦۦ۬ۥۘۧۖۛۜۜۧۛ۟ۨۘ";
                    break;
                case 350939743:
                    intent.setFlags(536870912);
                    str2 = "ۚۡۨۘۛ۬ۦۨ۠ۘۢۧۡۧۛۙۦۡۘۘ";
                    break;
                case 532458817:
                    z2 = LockUtils.isJIDLocked(str);
                    str2 = "ۢۗ۠۟ۛ۬ۤ۠ۖۘۙ۬۫ۨۘۨۥۡۘ";
                    break;
                case 926363327:
                    lockOptions = new LockOptions().setConversation(true).setJID(str).setDisableLock(z2).setChangePass(!z2).setPassedIntent((Intent) null).setJustCloseAfterSuccess(true);
                    str2 = "ۚۜۥۡ۠ۥۢۨۜۘۖۥۜۨۖ";
                    break;
                case 1203215280:
                    String str3 = "۫ۦۥۘۤۗ۟ۥۜۨۘۥ۟۟۟ۤۘۘۦۜۖ۟ۢۥ";
                    while (true) {
                        switch (str3.hashCode() ^ -1581224232) {
                            case -1955314787:
                                str2 = "ۚۙۜۙۛ۠ۧۜۡۦۥۗ۫ۗۚۧۥۖۘۢۤۦ۫۠ۢ";
                                continue;
                            case 272888487:
                                str3 = "۬ۖۢ۬۫ۥۧۛ۫ۧۜۥۢۜۨۘ۠ۖۥۗ";
                                break;
                            case 444630783:
                                if (!z2) {
                                    str3 = "ۚۨۘۧۡۤۛۢ۠ۚۧۨۘ۬ۘۨۘۦۧ۠۫ۧۢۢۘۢ۬۫ۥۘ";
                                    break;
                                } else {
                                    str3 = "ۧۧۨۖۤۡۦۥۢۦ۟ۛۡۨۛۢۛ۬ۥۧۜۘ۬ۤ۠ۛۖۛ";
                                    break;
                                }
                            case 592960929:
                                str2 = "ۙۡۨۛ۬۠ۚۡۖۘۧۥ۟ۛۚۤۜۧۛۗ۫";
                                continue;
                        }
                    }
                    break;
                case 1221650572:
                    LockUtils.showAvailableLockTypes(activity, lockOptions);
                    str2 = "ۚۖۥۚۛۜۘۙ۟ۜۗ۫۠ۘ۫۬ۨ۬ۛۡۗۜۘ";
                    break;
            }
        }
    }

    public static Drawable checkEntryBK(com.obwhatsapp.Conversation conversation, int i2, Drawable drawable) {
        String str = "۫ۨۜۘۘۥۘۗۧۢ۫ۧۘۖ۫ۚۜۘۛ";
        while (true) {
            try {
                switch (str.hashCode() ^ 379334249) {
                    case -1209636766:
                        String str2 = "ۚۗۧۛۥۦۘ۬۫ۜۗ۬ۗ۬۬ۨ۠ۖۤۙۦۘ";
                        while (true) {
                            switch (str2.hashCode() ^ 1946822223) {
                                case -831287432:
                                    str2 = "ۚۥ۠ۘۘۧۘۙۚۘۖ۟۫ۥ۫ۖۙۨۖۡۤ";
                                    continue;
                                case -251851947:
                                    if (f518g == null) {
                                        str2 = "ۚ۫ۘۢۧ۠ۨۨۡۘۨۜۖ۟ۖ۫۠ۤۙۘۤۦۘ۟ۘۦۖۡۙ";
                                        break;
                                    } else {
                                        str2 = "۬ۨۥۘۘ۟ۢۡۦۘۙۜۛۨۦۜ";
                                        continue;
                                    }
                                case 1263913860:
                                    Drawable background = conversation.findViewById(yo.getID("input_layout", "id")).getBackground();
                                    String str3 = "ۙ۫ۗۜ۟ۥۘۖۤ۫ۨ۫ۘۘ۬ۤۧۤ۬ۥۥۜ۟ۗۦ۫";
                                    while (true) {
                                        switch (str3.hashCode() ^ -1047847799) {
                                            case -2024310637:
                                                f518g = background;
                                                background.setColorFilter(others.getColor("ModChatEntry", ColorStore.getDefaultConversationEntryBackground()), PorterDuff.Mode.MULTIPLY);
                                                break;
                                            case -715961010:
                                                if (background != null) {
                                                    str3 = "۠۬ۖۡۥۜۗۗۧ۫ۘ۬۠ۚۤۘۖۡۦۥ";
                                                    break;
                                                } else {
                                                    str3 = "ۙۜۥۘۨۘۘۚۢ۬۠ۡۗۦ۠ۡۘۨۘۨۘۥۤۦۘۜۡۥ";
                                                    continue;
                                                }
                                            case 1293694775:
                                                str3 = "ۡۜۨۘۧۜۘۘۨۦ۟ۖ۠ۜۘ۟۬ۥۤۚۜۦۘۥۘ";
                                                continue;
                                            case 1993085811:
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                case 1299558274:
                                    break;
                                default:
                                    continue;
                            }
                        }
                        Drawable drawable2 = f518g;
                        String str4 = "ۛۗۦ۫ۤ۟ۙۛۖۦۤۜۘۤۦ۟ۢۖۦۘ۫۫ۚۦۤۨۘ";
                        while (true) {
                            switch (str4.hashCode() ^ -1682934169) {
                                case -112923382:
                                    str4 = "ۡۥۘۘ۠ۗۦۘۨۦۡۚۧۗۧۜۗۧۖۘ۫ۤ۟";
                                    continue;
                                case 229659052:
                                    return drawable2;
                                case 327425023:
                                    break;
                                case 1268945392:
                                    if (drawable2 == null) {
                                        str4 = "ۚۤۧ۟۫ۘۚۖۦۨۡۧۘۧۘۜۘۖۨۗۨۥۜۘۡۛۨۘۛۥۘ";
                                        break;
                                    } else {
                                        str4 = "۟ۢۖ۬۫ۖۦۨ۬ۛۢۡۘ۠ۦۗ";
                                        continue;
                                    }
                                default:
                                    continue;
                            }
                        }
                    case -1125438110:
                        str = "ۗۗۜ۟ۛۘۗۤۢۧۖۨۘۖۘۙۙۡۖ";
                        continue;
                    case 417730117:
                        break;
                    case 1726464255:
                        if (i2 == yo.getID("ib_new_round", "drawable")) {
                            str = "۟ۥۨۘۥۙۥۚۗ۬۬ۨۘۘۡۗۡۛۦۘۘۢۨۗ";
                            break;
                        } else {
                            str = "۠ۥۧۦۘ۬۟ۧۢۘ۫ۘۗۖ۠ۗۢۜۘۧ۫ۘ۫ۦۖۘ";
                            continue;
                        }
                    default:
                        continue;
                }
            } catch (Exception e2) {
            }
        }
        drawable.setColorFilter(others.getColor("ModChatEntry", others.getColor("BGColor", ColorStore.getDefaultConversationEntryBackground())), PorterDuff.Mode.MULTIPLY);
        return drawable;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkMultipleMediaSelected(java.util.Map r8) {
        /*
            r2 = 1
            r1 = 0
            r3 = 1510368150(0x5a066396, float:9.4567857E15)
            java.lang.String r0 = "ۥۙۛۗ۬ۨۚۤۜۘۢۦۖۘۘ۫۠"
        L_0x0007:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -2110056572: goto L_0x0018;
                case 52557934: goto L_0x001b;
                case 888055266: goto L_0x001d;
                case 1060595939: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0007
        L_0x0010:
            if (r8 != 0) goto L_0x0015
            java.lang.String r0 = "۬ۙۥۜۡۡۘ۬ۧ۫ۘۛۧۚۢۚۗ۟"
            goto L_0x0007
        L_0x0015:
            java.lang.String r0 = "ۨ۫۠۬ۗۡۤۤۜۥ۠۟ۦۙۨ"
            goto L_0x0007
        L_0x0018:
            java.lang.String r0 = "ۡۛۧ۟ۚۗۙ۫ۛ۬ۘۖۘۢ۠ۦۘ"
            goto L_0x0007
        L_0x001b:
            r0 = r1
        L_0x001c:
            return r0
        L_0x001d:
            java.util.Collection r3 = r8.values()     // Catch:{ Exception -> 0x00a9 }
            r4 = -1483191765(0xffffffffa7984a2b, float:-4.226889E-15)
            java.lang.String r0 = "ۧ۠ۤۨۗۘۧۛۥۧ۫ۨۤۖۦۚۙۧ۬۟ۧۦ۫۠ۧۧۡۘ"
        L_0x0026:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00a9 }
            r5 = r5 ^ r4
            switch(r5) {
                case -1881046360: goto L_0x003e;
                case -665964569: goto L_0x00f5;
                case 1313920042: goto L_0x002f;
                case 2109345256: goto L_0x0035;
                default: goto L_0x002e;
            }     // Catch:{ Exception -> 0x00a9 }
        L_0x002e:
            goto L_0x0026
        L_0x002f:
            java.lang.String r0 = "ۥۙ۬ۥ۫۬۫ۗ۟ۨۧ۬ۡۨۧۙۘۘۢۤ"
            goto L_0x0026
        L_0x0032:
            java.lang.String r0 = "۟ۤۡۧۜۙۖۡۚ۟ۧۘ۫ۙ۟ۖۚ"
            goto L_0x0026
        L_0x0035:
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x00a9 }
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "۠ۢ۠ۡ۠ۦۘۖۥ۫۟ۢ۬ۖۡۢ۫ۜۘۗۡۗ"
            goto L_0x0026
        L_0x003e:
            r4 = 1813995885(0x6c1f616d, float:7.7071714E26)
            java.lang.String r0 = "ۗۧۢۧۧۖۗۡۧۗۡۜۘۛۖۥ۠ۘۙۖۦۜۘۜۜۙ"
        L_0x0043:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00a9 }
            r5 = r5 ^ r4
            switch(r5) {
                case -1680701321: goto L_0x005b;
                case -179298274: goto L_0x0058;
                case 681071770: goto L_0x004c;
                case 906598320: goto L_0x00f5;
                default: goto L_0x004b;
            }     // Catch:{ Exception -> 0x00a9 }
        L_0x004b:
            goto L_0x0043
        L_0x004c:
            int r0 = r3.size()     // Catch:{ Exception -> 0x00a9 }
            if (r0 != r2) goto L_0x0055
            java.lang.String r0 = "۟ۗۨۘۧ۟۟ۗۦۦۥۘۥۘۛ۫ۥۘۦ۠ۦۧۦۛۘۦۖۜۘۦ"
            goto L_0x0043
        L_0x0055:
            java.lang.String r0 = "۠ۘۨۦۙ۫ۚۖ۟ۡۢ۟ۙۥۨ۠ۚۨۘۗ۫ۖۤ۫ۜۥۚۥ"
            goto L_0x0043
        L_0x0058:
            java.lang.String r0 = "ۚۡۥۥ۠ۘۘۘۗۘۘۥۘۥۘ۫ۙۘۗۚ۬"
            goto L_0x0043
        L_0x005b:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a9 }
            r4.<init>()     // Catch:{ Exception -> 0x00a9 }
            java.util.Iterator r5 = r3.iterator()     // Catch:{ Exception -> 0x00a9 }
        L_0x0064:
            r3 = 432025495(0x19c02f97, float:1.9871556E-23)
            java.lang.String r0 = "ۛۜۜۘۢ۟ۛۦۦۢۥ۬۬ۖۗۨۘ"
        L_0x0069:
            int r6 = r0.hashCode()     // Catch:{ Exception -> 0x00a9 }
            r6 = r6 ^ r3
            switch(r6) {
                case -1871410334: goto L_0x0078;
                case -1282103864: goto L_0x0072;
                case 156693917: goto L_0x00c3;
                case 1933656395: goto L_0x0081;
                default: goto L_0x0071;
            }     // Catch:{ Exception -> 0x00a9 }
        L_0x0071:
            goto L_0x0069
        L_0x0072:
            java.lang.String r0 = "۬۠ۜۘ۬ۜ۫ۦ۬ۡۤۦۘۘ۠ۡۥۘۜۛۡۘۘۡۡ"
            goto L_0x0069
        L_0x0075:
            java.lang.String r0 = "ۡ۫ۡ۬ۙۨۘۜ۫ۜۡ۟ۤ۟ۤ۬ۖۜ۠ۡۥ۠۬ۛۡۘ۟ۧۘۘ"
            goto L_0x0069
        L_0x0078:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x00a9 }
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "ۙۥۥۢۚۡۘ۫ۦۜ۬۫۠۬ۡۨۡۖۘۚۚۜۘۧۥۡۘۤۜ۠"
            goto L_0x0069
        L_0x0081:
            java.lang.Object r0 = r5.next()     // Catch:{ Exception -> 0x00a9 }
            r6 = 2125993940(0x7eb817d4, float:1.2235084E38)
            java.lang.String r3 = "۠ۖۖۘۦۥۤۡۨۛۜۛۥ۬ۨۘ"
        L_0x008a:
            int r7 = r3.hashCode()     // Catch:{ Exception -> 0x00a9 }
            r7 = r7 ^ r6
            switch(r7) {
                case -1886968357: goto L_0x00c0;
                case -1085101961: goto L_0x0093;
                case 333772954: goto L_0x0064;
                case 550831849: goto L_0x00b9;
                default: goto L_0x0092;
            }     // Catch:{ Exception -> 0x00a9 }
        L_0x0092:
            goto L_0x008a
        L_0x0093:
            X.0tY r0 = (X.C16730tY) r0     // Catch:{ Exception -> 0x00a9 }
            java.lang.Object r0 = r0.A0H()     // Catch:{ Exception -> 0x00a9 }
            com.whatsapp.MediaData r0 = (com.whatsapp.MediaData) r0     // Catch:{ Exception -> 0x00a9 }
            java.io.File r0 = r0.file     // Catch:{ Exception -> 0x00a9 }
            android.content.Context r3 = com.obwhatsapp.yo.yo.getCtx()     // Catch:{ Exception -> 0x00a9 }
            android.net.Uri r0 = X.AnonymousClass1XI.A01(r3, r0)     // Catch:{ Exception -> 0x00a9 }
            r4.add(r0)     // Catch:{ Exception -> 0x00a9 }
            goto L_0x0064
        L_0x00a9:
            r0 = move-exception
            java.lang.String r0 = "error_bad_media"
            android.content.Context r2 = com.obwhatsapp.yo.yo.getCtx()
            a.a.i(r0, r2, r1)
            r0 = r1
            goto L_0x001c
        L_0x00b6:
            java.lang.String r3 = "ۤۦۗۨۦ۠۫ۚ۬ۚۛۡۘۚۤ۠"
            goto L_0x008a
        L_0x00b9:
            boolean r3 = r0 instanceof X.C16730tY     // Catch:{ Exception -> 0x00a9 }
            if (r3 == 0) goto L_0x00b6
            java.lang.String r3 = "ۘۢۨۘۗۤ۠ۖ۬ۥۘۡۙۤۗ۫ۘۨۦۥۘۤ۠ۖ"
            goto L_0x008a
        L_0x00c0:
            java.lang.String r3 = "۠ۤۙۙۧۖۘۦۜۡۘۦۛ۟ۜۗۡ۫ۖۙۤۘۜۘۗۛۗ"
            goto L_0x008a
        L_0x00c3:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = "android.intent.action.SEND_MULTIPLE"
            r0.<init>(r3)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = "*/*"
            r0.setType(r3)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = "android.intent.extra.ALLOW_MULTIPLE"
            r5 = 1
            r0.putExtra(r3, r5)     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r3 = "android.intent.extra.STREAM"
            r0.putExtra(r3, r4)     // Catch:{ Exception -> 0x00a9 }
            r3 = 1
            r0.addFlags(r3)     // Catch:{ Exception -> 0x00a9 }
            r3 = 128(0x80, float:1.794E-43)
            r0.addFlags(r3)     // Catch:{ Exception -> 0x00a9 }
            com.obwhatsapp.Conversation r3 = f515d     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r4 = "share_to_other_apps"
            java.lang.String r4 = com.obwhatsapp.yo.yo.getString((java.lang.String) r4)     // Catch:{ Exception -> 0x00a9 }
            android.content.Intent r0 = android.content.Intent.createChooser(r0, r4)     // Catch:{ Exception -> 0x00a9 }
            r3.startActivity(r0)     // Catch:{ Exception -> 0x00a9 }
            r0 = r2
            goto L_0x001c
        L_0x00f5:
            r0 = r1
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.checkMultipleMediaSelected(java.util.Map):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void convoBackground(android.graphics.drawable.Drawable r5) {
        /*
            java.lang.String r0 = "conversation_layout"
            android.view.View r1 = d(r0)     // Catch:{ Exception -> 0x0072 }
            r2 = 202523132(0xc1241fc, float:1.1267287E-31)
            java.lang.String r0 = "ۥۧۤ۟ۤۘۘۗۤۘۢ۠ۦۗۙ۬ۢۤ۠ۤۗۧۛۜ"
        L_0x000b:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0072 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1891500543: goto L_0x0028;
                case -1648311032: goto L_0x002d;
                case -583208825: goto L_0x0047;
                case 598152529: goto L_0x0014;
                default: goto L_0x0013;
            }     // Catch:{ Exception -> 0x0072 }
        L_0x0013:
            goto L_0x000b
        L_0x0014:
            r2 = -1910555013(0xffffffff8e1f3e7b, float:-1.9628346E-30)
            java.lang.String r0 = "ۙۜۘۘۛۢۥۘۛۧۥ۟ۚۥۘۦۖۨۘۥۚۧۛ۬۫ۘۘ"
        L_0x0019:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0072 }
            r3 = r3 ^ r2
            switch(r3) {
                case -46705973: goto L_0x0022;
                case 800649737: goto L_0x0033;
                case 1810374971: goto L_0x003e;
                case 2091489560: goto L_0x0060;
                default: goto L_0x0021;
            }     // Catch:{ Exception -> 0x0072 }
        L_0x0021:
            goto L_0x0019
        L_0x0022:
            java.lang.String r0 = "ۙۖۜۙۛۚۥۚۙۤۗ۟ۥۧ۠ۖۘۧۘۚ۬ۢ"
            goto L_0x0019
        L_0x0025:
            java.lang.String r0 = "۟۠۠ۦ۠ۚۙۨۨۚۘۨۘۜۨ۫ۦۢۢ"
            goto L_0x000b
        L_0x0028:
            if (r1 != 0) goto L_0x0025
            java.lang.String r0 = "ۡۢۥۤۢۢۧۥۛۘۘۖۘۛۤۘ۬ۜۙۗۥ۬ۙۢۨۘ۬ۢۘۘ"
            goto L_0x000b
        L_0x002d:
            java.lang.String r0 = "ۗۡ۬ۧ۠ۦۘۦۜۧۘۖ۫ۨ۫ۡۘۢۗۙ۫ۥۖ"
            goto L_0x000b
        L_0x0030:
            java.lang.String r0 = "۬ۖ۠ۗۙۖۖۜۢۖۥ۬۫۠ۧۤۚ۬"
            goto L_0x0019
        L_0x0033:
            java.lang.String r0 = "ConvoBack"
            boolean r0 = com.obwhatsapp.yo.shp.getIsGradiet(r0)     // Catch:{ Exception -> 0x0072 }
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = "ۢۜۢۦۚۦ۟ۢ۠۫ۚ۠۬ۖۘ"
            goto L_0x0019
        L_0x003e:
            java.lang.String r0 = "ConvoBack"
            android.graphics.drawable.GradientDrawable r0 = com.obwhatsapp.yo.shp.getGradientDrawable(r0)     // Catch:{ Exception -> 0x0072 }
            r1.setBackground(r0)     // Catch:{ Exception -> 0x0072 }
        L_0x0047:
            java.lang.String r0 = "conversation_background"
            android.view.View r0 = d(r0)     // Catch:{ Exception -> 0x010a }
            com.obwhatsapp.settings.chat.wallpaper.WallPaperView r0 = (com.obwhatsapp.settings.chat.wallpaper.WallPaperView) r0     // Catch:{ Exception -> 0x010a }
            r2 = 58177874(0x377b952, float:7.2799513E-37)
            java.lang.String r1 = "ۧ۫ۨ۬ۜۖۗۡۧۧۙۡۜۘۗۢ۟ۡ۟ۗۢۧۤۨۘ"
        L_0x0054:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x010a }
            r3 = r3 ^ r2
            switch(r3) {
                case 121494945: goto L_0x00d1;
                case 767418056: goto L_0x0077;
                case 1581545612: goto L_0x007c;
                case 2059974369: goto L_0x005d;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x0054
        L_0x005d:
            java.lang.String r1 = "ۤ۫ۤۡۛۙۘ۫ۤۥۡۜۛۚۗ۟ۚۘۘۧۖۧۘ۬ۖۡۛۧۦۘ"
            goto L_0x0054
        L_0x0060:
            java.lang.String r0 = "ConvoBack"
            r2 = -3355444(0xffffffffffcccccc, float:NaN)
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r2)     // Catch:{ Exception -> 0x0072 }
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable     // Catch:{ Exception -> 0x0072 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0072 }
            r1.setBackground(r2)     // Catch:{ Exception -> 0x0072 }
            goto L_0x0047
        L_0x0072:
            r0 = move-exception
            goto L_0x0047
        L_0x0074:
            java.lang.String r1 = "ۛۧۖ۟ۥۜۘۚ۠۫ۛۗۥۡۢۙۛۨۜۘۖ۫ۤ"
            goto L_0x0054
        L_0x0077:
            if (r0 != 0) goto L_0x0074
            java.lang.String r1 = "ۡۦۖۘۤۦۙ۠ۙۗۢۡۧۥۚۚۨۚ۬۬ۜۦ۬ۘ"
            goto L_0x0054
        L_0x007c:
            r2 = 1534126915(0x5b70eb43, float:6.7812667E16)
            java.lang.String r1 = "ۤۡۥ۫ۛۥۘ۠ۢۛۡۗۦۘ۫ۘۨۤۗۥۘ"
        L_0x0081:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x010a }
            r3 = r3 ^ r2
            switch(r3) {
                case -1043701476: goto L_0x0098;
                case -950241584: goto L_0x009b;
                case 1460570253: goto L_0x0106;
                case 1719644904: goto L_0x008a;
                default: goto L_0x0089;
            }     // Catch:{ Exception -> 0x010a }
        L_0x0089:
            goto L_0x0081
        L_0x008a:
            java.lang.String r1 = "custom_wall"
            boolean r1 = com.obwhatsapp.yo.shp.getBoolean(r1)     // Catch:{ Exception -> 0x010a }
            if (r1 == 0) goto L_0x0095
            java.lang.String r1 = "ۤۗۨ۠ۖۜۛ۫ۦ۫ۢۧۥۨۧۘ"
            goto L_0x0081
        L_0x0095:
            java.lang.String r1 = "ۘۛۦۘۧۜۘۙۜ۠ۙۦۙۧۗۛ"
            goto L_0x0081
        L_0x0098:
            java.lang.String r1 = "ۜۦۦۘۤۧۖ۬ۖۡۘۙ۫ۨۘ۬ۥ"
            goto L_0x0081
        L_0x009b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010a }
            r1.<init>()     // Catch:{ Exception -> 0x010a }
            java.lang.String r2 = com.obwhatsapp.yo.yo.datafolder     // Catch:{ Exception -> 0x010a }
            r1.append(r2)     // Catch:{ Exception -> 0x010a }
            java.lang.String r2 = "files/wallpaper.jpg"
            r1.append(r2)     // Catch:{ Exception -> 0x010a }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x010a }
            r2 = 0
            android.graphics.drawable.Drawable r2 = com.obwhatsapp.youbasha.task.utils.buffWallp(r1, r2)     // Catch:{ Exception -> 0x010a }
            r3 = -1949981344(0xffffffff8bc5a560, float:-7.613047E-32)
            java.lang.String r1 = "ۖۚۚۤۧۜۤۦ۠۟ۛۤۗۚۥۘ"
        L_0x00b8:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x010a }
            r4 = r4 ^ r3
            switch(r4) {
                case -1791704954: goto L_0x00e0;
                case -1608858119: goto L_0x00e3;
                case 1365739290: goto L_0x00c1;
                case 2077642467: goto L_0x00d5;
                default: goto L_0x00c0;
            }     // Catch:{ Exception -> 0x010a }
        L_0x00c0:
            goto L_0x00b8
        L_0x00c1:
            java.lang.String r1 = h()     // Catch:{ Exception -> 0x010a }
            android.graphics.drawable.Drawable r1 = com.obwhatsapp.youbasha.task.utils.buffWallp(r1, r2)     // Catch:{ Exception -> 0x010a }
            r0.setDrawable(r1)     // Catch:{ Exception -> 0x010a }
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ Exception -> 0x010a }
            r0.setScaleType(r1)     // Catch:{ Exception -> 0x010a }
        L_0x00d1:
            return
        L_0x00d2:
            java.lang.String r1 = "۟ۧۖۘۦۧۙۗ۬ۨۛۜۤۜ۠ۦۤ۫ۤ"
            goto L_0x00b8
        L_0x00d5:
            java.lang.String r1 = "custom_wall_profilepic"
            boolean r1 = com.obwhatsapp.yo.shp.getBoolean(r1)     // Catch:{ Exception -> 0x010a }
            if (r1 == 0) goto L_0x00d2
            java.lang.String r1 = "ۢۥۜ۟۬ۘۘ۟ۘۥۚۧۤۙ۠ۨۘۖ۬ۜۖۛۥۘۙۗۚ"
            goto L_0x00b8
        L_0x00e0:
            java.lang.String r1 = "ۤۘ۬ۤۡ۬۠ۙۢ۫۟ۦۥۦۘۚۥۦۧ۫ۢ"
            goto L_0x00b8
        L_0x00e3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010a }
            r1.<init>()     // Catch:{ Exception -> 0x010a }
            java.lang.String r3 = com.obwhatsapp.yo.yo.datafolder     // Catch:{ Exception -> 0x010a }
            r1.append(r3)     // Catch:{ Exception -> 0x010a }
            java.lang.String r3 = "files/"
            r1.append(r3)     // Catch:{ Exception -> 0x010a }
            java.lang.String r3 = com.obwhatsapp.yo.yo.getCurr_sJid()     // Catch:{ Exception -> 0x010a }
            r1.append(r3)     // Catch:{ Exception -> 0x010a }
            java.lang.String r3 = "_wallpaper.jpg"
            r1.append(r3)     // Catch:{ Exception -> 0x010a }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x010a }
            android.graphics.drawable.Drawable r5 = com.obwhatsapp.youbasha.task.utils.buffWallp(r1, r2)     // Catch:{ Exception -> 0x010a }
        L_0x0106:
            r0.setDrawable(r5)     // Catch:{ Exception -> 0x010a }
            goto L_0x00d1
        L_0x010a:
            r0 = move-exception
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.convoBackground(android.graphics.drawable.Drawable):void");
    }

    public static void copySelection(CharSequence charSequence, Activity activity) {
        C57012pj r18 = null;
        NestedScrollView nestedScrollView = null;
        LinearLayout linearLayout = null;
        LinearLayout.LayoutParams layoutParams = null;
        int i2 = 0;
        int i3 = 0;
        Drawable drawable = null;
        Button button = null;
        LinearLayout.LayoutParams layoutParams2 = null;
        int i4 = 0;
        TextView textView = null;
        LinearLayout.LayoutParams layoutParams3 = null;
        ImageView imageView = null;
        LinearLayout.LayoutParams layoutParams4 = null;
        int i5 = 0;
        String str = "ۜ۬۫۠ۤۖۘۛۨۚۧۢۘۘۘۦۢۡۚۘۡۤۦ";
        while (true) {
            switch ((str.hashCode() ^ 808) ^ -917318450) {
                case -2044869869:
                    linearLayout.setMinimumHeight(i2);
                    str = "ۗ۫۫ۙ۠ۦۚۗ۫ۦۘ۟ۙۡۚ";
                    break;
                case -1944803894:
                    textView.setLayoutParams(layoutParams3);
                    str = "ۗۚۥۖۧ۟ۡۡۖۛۛ۠ۙۘۛ۬ۜۘۘۥۚۗۗۚۥ";
                    break;
                case -1646337058:
                    button.setText(17039360);
                    str = "ۙۛۨ۠۬۫ۚۚۥۘۢ۟ۥۚۗۘۨۛۤۨۙۜۥۛۥۘ";
                    break;
                case -1641024574:
                    layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    str = "ۢۛۗۧ۟ۢۗۛۚ۟ۗ۫ۚۨۘ";
                    break;
                case -1579373029:
                    textView.setText(charSequence);
                    str = "ۢۗۥۘۗ۬ۗ۟ۚۙۨ۟ۘۘۢۢۧۚۙۡ";
                    break;
                case -1530880744:
                    linearLayout = new LinearLayout(activity);
                    str = "ۧۦۡۘۢۧۘۜ۟ۖۘۨۚۥ۬ۢۥۘۖ۬ۜۘ";
                    break;
                case -1417543558:
                    imageView.setLayoutParams(layoutParams4);
                    str = "ۙۗۡۘۖۙۤۚ۠۟ۘۦۡ۠ۚ۬ۘۖ۫ۜۧۡۢۘۛۧۤ";
                    break;
                case -1310161395:
                    i2 = yo.getCtx().getResources().getDisplayMetrics().heightPixels / 4;
                    str = "ۛۦۡۡۚۘ۫ۢۗ۟۫ۤۡۨۨۚۢۖۘۧ۫ۙۡۚ۬ۘۖ";
                    break;
                case -1269826014:
                    drawable = AnonymousClass00T.A04(activity, yo.getID("rc_dialog_bg", "drawable"));
                    str = "ۛۧۨۛۙۨۛۤۗۙ۠۫۟ۙۘ۠ۘۘۘۦۢۚ۟ۙ۬۫۠";
                    break;
                case -1199392105:
                    button.setLayoutParams(layoutParams2);
                    str = "ۤۦۗۘۚۜۘ۠۬ۦۚ۟ۤۙۨۨۘۥۛۢۛۥۥۘۦۧ۬";
                    break;
                case -976219560:
                    r18.show();
                    str = "ۜۧۢۖ۠ۦۘۧ۟۬ۖۤۖۜۘۚ";
                    break;
                case -911779463:
                    layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    str = "ۚۙۥۡ۠ۨۘۛۗ۬ۢ۬ۘۤ۟ۘۙۤ۬۠ۦ۟۟ۨۧۘ۬ۦۥ";
                    break;
                case -759030929:
                    linearLayout.addView(textView);
                    str = "ۗۘ۫ۦۤۨۘ۫۠ۗۗۥ۬ۙۗۧۙۗۦۗۗۜۧۖ";
                    break;
                case -705447312:
                    textView.setTextIsSelectable(true);
                    str = "ۧۢۗۗۙ۟۫ۖۘۨۘۘۙۖۖۧۥ۟ۚ۫ۨ";
                    break;
                case -631112143:
                    layoutParams2.setMargins(0, i4, 0, i4);
                    str = "ۥ۬ۗۦ۫ۛ۬ۥۢۘۘۖۢۛۘۘ۫ۗۥۡۧۧ";
                    break;
                case -599222880:
                    layoutParams.height = i2;
                    str = "ۙ۫ۨۥۨۥۘۡۛۧۘۥ۫ۢۦۜۘۥۤ۫ۙۗ۟ۗۗۥۢۙ۟";
                    break;
                case -504214408:
                    layoutParams4 = new LinearLayout.LayoutParams(utils.dimenInDP(70), utils.dimenInDP(8));
                    str = "ۦۙ۠۬ۦۤ۟ۚۛۢۙۨۘۖ۠ۢ";
                    break;
                case -423962675:
                    linearLayout.setLayoutParams(layoutParams);
                    str = "۠ۨۨۘۗ۠ۖ۫ۦۨۘۡ۫ۦۗۜۜۘۥۖۧۘۨۡۥۘۖۧۜۤۦ";
                    break;
                case -337477153:
                    button.setGravity(17);
                    str = "ۤۜ۬ۗۛۚۗۜۛ۟ۗۜۢۜۗۦۜۜ۬ۤۘ۠ۗۙ";
                    break;
                case -308794847:
                    layoutParams = new LinearLayout.LayoutParams(-1, -1);
                    str = "ۥ۟ۜۨۦ۫ۧۥۘۜ۫ۤۙۨ۠";
                    break;
                case -222717002:
                    linearLayout.setBackground(drawable);
                    str = "۫ۧ۫ۦۨۢۙۘۦۘ۟ۗۡ۟ۚ۟ۦۥ۟ۖۢۙۡ۬ۖۘ";
                    break;
                case -88837699:
                    utils.updateDrawableColor(drawable, ColorStore.getPrimarySurfaceColor());
                    str = "ۚۤ۟۟ۖۖۤۤۖۜۚۚ۠ۙۦۘۖۦۜۘۨۜۨۨۙۦۘ";
                    break;
                case 29879985:
                    return;
                case 95535748:
                    nestedScrollView.addView(linearLayout);
                    str = "ۤۚۜۘ۠ۗۖۘۚۤۖۘۗ۫ۦۘۜۗۨۦۚۨۘۛ۫ۙۧۜۦ";
                    break;
                case 108199987:
                    i5 = utils.dimenInDP(5);
                    str = "ۖۢۚۘۚ۟ۨۤۚۡۘ۟۫ۨۦ۫ۧۨۘۦۤۨۘۚ۠۬";
                    break;
                case 195009978:
                    r18.setContentView((View) nestedScrollView);
                    str = "۫ۨۦۘۜۘۖۛۛۗۗۖۜۥۦۙۛ۟ۤۖۢۡۦۘۨۘ";
                    break;
                case 226309721:
                    nestedScrollView.setFillViewport(true);
                    str = "۠ۗۥۘۚۢۨۘۙۦۨۘۛ۟ۦۗۢ۟ۨ۠ۘۘۤۧۜۘۘۙۛۘۜۗ";
                    break;
                case 255324391:
                    nestedScrollView.setFitsSystemWindows(true);
                    str = "ۡۙۖۜۙۨۘۘۖۖۜۜۛۧۙۤۤۤۘۡۚۖۦۨۥۘ";
                    break;
                case 257571946:
                    linearLayout.setOrientation(1);
                    str = "ۡۤۜۚۤ۟ۡ۟ۚۗۤۘۘۚۛۨۘۡۙۢۤۥ۫۠ۘ۟ۡۨۗ";
                    break;
                case 301938923:
                    linearLayout.addView(imageView);
                    str = "ۛۗۛۧۛۚۘۥ۫۠۟ۖۘۡۛۛ";
                    break;
                case 346769028:
                    i3 = utils.dimenInDP(20);
                    str = "ۤۨۚ۟ۡۙۢۗ۟ۤۛ۠ۢۤۖۙۛۡۘۛۤۡۘ";
                    break;
                case 393514522:
                    textView = new TextView(activity);
                    str = "ۘۢۨۡ۟ۧۚ۟ۨ۠ۡۘۡۥۢ";
                    break;
                case 401636338:
                    layoutParams2.gravity = 80;
                    str = "ۤ۬ۜۘ۫۬ۛۜ۫ۖۙۚۜ۠۬ۜۤۙ۬ۗ۫ۨۘۧ۠۟";
                    break;
                case 473172442:
                    layoutParams4.setMargins(0, i5, 0, i5);
                    str = "ۛۨۘ۠۫ۨۛ۠۟ۥۢۘۚۢۥۘ۫ۧۜۢۥۙۜ۟ۡ۬ۖۧۘ";
                    break;
                case 491393557:
                    imageView = new ImageView(activity);
                    str = "ۨۜ۠ۗۛۜ۟۟ۡۗۨۨ۬ۜۙ۠ۚ۟";
                    break;
                case 546838749:
                    button.setBackground(others.alphaDrawable("selector_bg", ColorStore.getPrimaryTextColor(), PorterDuff.Mode.SRC_ATOP, 25));
                    str = "ۨۛۡۘۦۗۡۘۘۘ۟ۜۛۘۘۗ۠ۥۤۗۛ";
                    break;
                case 551444744:
                    layoutParams4.gravity = 17;
                    str = "ۢ۠ۨۘۤۛۡۘ۟ۦۥۧۚ۫ۖۤۜۗۘۜۘ";
                    break;
                case 698612862:
                    linearLayout.addView(button);
                    str = "ۜۗۘۘۙۥۛ۫ۜ۫ۦۖۡۘۦۙۙۜۡ۠";
                    break;
                case 756247167:
                    textView.setTextColor(ColorStore.getPrimaryTextColor());
                    str = "۟ۖ۟ۜ۫ۘۙۦۡۘۦۜۥۘۤۧۗۧۜۘ";
                    break;
                case 772214020:
                    button.setOnClickListener(new t(r18, 0));
                    str = "ۛۙۖۘۤۛۤۡۖۖۢ۟ۥۘۦ۟ۜۘ۟۟ۚ۫ۗۖۚۖۡۘ";
                    break;
                case 776417575:
                    nestedScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                    str = "ۖۢۡۘۜۧۘۚۛۨۗۦۘۥۚۚۛۦۧۗۡ۠ۗ۠ۛ";
                    break;
                case 852324777:
                    layoutParams3.weight = 1.0f;
                    str = "ۤۡۗۚۥۚ۫ۚۜۧۖۧۘ۫۬ۥ";
                    break;
                case 1008820531:
                    imageView.setBackground(others.alphaDrawable("rc_dotline_dialog", ColorStore.getPrimaryTextColor(), PorterDuff.Mode.SRC_ATOP, 25));
                    str = "ۘۖۙۡۢۜ۬ۚۖۧۜ۬۟ۨ۬۠ۡ۠ۧۨۨ";
                    break;
                case 1064782014:
                    r18 = new C57012pj(activity, yo.getID("BottomDialog", "style"));
                    str = "۠ۘۖۙ۬ۙۡ۫ۘۖۢ۟ۤ۫ۥۘۗ۟۫ۧ۠ۡۚ۟ۖۗۖۘ";
                    break;
                case 1172184395:
                    linearLayout.setPadding(i3, i3, i3, 0);
                    str = "ۡۜ۬ۢۥۦۘ۠۬ۚۡۗۢۗۧۧ۬ۡۜۘ";
                    break;
                case 1621560786:
                    nestedScrollView = new NestedScrollView(activity, (AttributeSet) null);
                    str = "۟ۡۨ۟ۢۥ۟ۤۧ۠ۨۤۥۦۥۘ۬ۘۦۗۢۦۘۢۖۢ";
                    break;
                case 1670482513:
                    button = new Button(activity);
                    str = "ۖ۫۟ۨۗۤۤۤ۫ۜۘ۫ۧۘۗۘۦۨۘۨۧۘ";
                    break;
                case 1812538023:
                    i4 = utils.dimenInDP(10);
                    str = "ۡ۫ۤۡۛۢۗۦۢۖ۟ۘۡۚۚ";
                    break;
                case 1999685527:
                    str = "ۚ۫ۤۧۖ۬ۥۚۚ۫ۡۜۘۚ۟ۡۥۜ۬ۥ۟ۤۘۜۨۘ";
                    break;
                case 2027720080:
                    textView.setTextSize((float) shp.getPrefInt("text_size_pick", 16));
                    str = "۠۫ۛۦۥۨۚۛۦۥ۬ۦۖۜۥۦ۬ۘۘۗ۫ۚۛ۬ۨۨ۬۠";
                    break;
                case 2060941854:
                    str = "ۛۤۧۨۖۖۚ۟۠ۜۗۧۙۡۛ";
                    break;
            }
        }
    }

    public static View d(String str) {
        com.obwhatsapp.Conversation conversation = null;
        String str2 = "۟ۗۡ۬ۗۤۤۘ۟ۖۙۦۢۧۖۘۤ۟ۜۘ۠ۚ";
        while (true) {
            switch ((str2.hashCode() ^ 663) ^ -811366418) {
                case -1714619239:
                    str2 = "۫ۦۘ۫۬ۘ۬ۖۖ۠ۜ۟۫ۧۖۗۛۘۛۢۧ۟۫ۜۘۛۨۨ";
                    break;
                case -1532542523:
                    throw new NullPointerException("convo is null");
                case -1216054141:
                    return conversation.findViewById(yo.getID(str, "id"));
                case 1122935591:
                    conversation = f515d;
                    str2 = "ۛۦۡۘۢۗۦۘ۠ۡ۫ۨ۬ۦۛۥ۟ۢۤ۬ۢۘۦۡۘ۟۫۟ۛ";
                    break;
                case 1176017664:
                    String str3 = "۟۬ۘۘۦۨۛۨ۟ۧ۟ۢۘۦۤ۬ۢۦۜۙۛۙ";
                    while (true) {
                        switch (str3.hashCode() ^ 346008436) {
                            case -2072632213:
                                str2 = "ۗۥۥۛۚۡۘۖۡۥۗۡۜۗۛۥ";
                                continue;
                            case -1672440499:
                                str2 = "ۚۚۚۡۥۘۥ۫ۗۚ۫ۚۡۜۧ";
                                continue;
                            case -340976088:
                                if (conversation == null) {
                                    str3 = "ۛۖۙ۟ۨۢۡۜۥۘۚ۟ۖۘۛۙ۬۟۠ۥ۟۠ۘۖۦ۟ۜ۫۬";
                                    break;
                                } else {
                                    str3 = "ۗ۫۬ۗۥۨۘۡۨ۠ۨ۬۟۬۟۫ۗۜۜ";
                                    break;
                                }
                            case -232459965:
                                str3 = "ۘۙۖۘۚۡۦ۟ۨۥۡۖۛۢۤۡ";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    public static void doc_paintDetails(C30011bb r3, TextView textView) {
        String str = "ۛۙۘ۫۬۫۟ۖۘۢۤۢۘ۟ۚۡۢۛۦۙۜ۬ۘۖۧۤۜ";
        while (true) {
            switch (str.hashCode() ^ -1409057046) {
                case -851619876:
                    str = "۬ۛۡۘۜۥ۫ۨۛۜۜۚۙۗۡۖۘۘۢۖۙۚۥ۬ۖۜ";
                    break;
                case -232440958:
                    if (textView != null) {
                        str = "۠ۤۛۨ۬ۗۧۡۡۘۙۢۘۛۥۨۘۡۢۘ";
                        break;
                    } else {
                        str = "ۙۦۧۘۧۧۚ۟ۨۡۡۧۦۗۡۧۥۢ";
                        break;
                    }
                case 671609258:
                    return;
                case 1180436529:
                    try {
                        textView.setTextColor(f(r3.getFMessage()));
                        return;
                    } catch (Exception e2) {
                        return;
                    }
            }
        }
    }

    public static void doc_paintTitle(C30011bb r3, TextView textView) {
        int i2;
        String str = "ۢۨۖۘۧۢۡۜۖۢۨ۠ۨۘۡۘۛۧۥ";
        while (true) {
            switch (str.hashCode() ^ -791486136) {
                case -2111821928:
                    if (textView != null) {
                        str = "۟ۜۖۘ۠ۡۖۘۜۖۘ۠ۨۧۛۘۨۗ۬ۦۘۥ۠۠ۛۗۙ";
                        break;
                    } else {
                        str = "ۚۛۥۘۚۨۥۘ۠ۙۖۘ۟ۡۦ۟۟ۥۘۗۛۘ۠ۜۖۘۛ۫ۨۘۚۦۘۘ";
                        break;
                    }
                case -1599497089:
                    str = "ۘۛۥۤۙۦۧۙۘۤۤ۟ۗ۬ۘۢۥۡۘۨۥۚۖۧ۟";
                    break;
                case -588599922:
                    return;
                case 1447672847:
                    String str2 = "ۤۙ۠ۨ۬ۡۘۗۨۡۥۨۖۘۤۥۥۘ";
                    while (true) {
                        try {
                            switch (str2.hashCode() ^ -358348875) {
                                case -1905949857:
                                    i2 = dep.f97c;
                                    break;
                                case -1120690565:
                                    i2 = dep.f98d;
                                    break;
                                case -400103402:
                                    if (r3.getFMessage().A11.A02) {
                                        str2 = "۟ۘۗۨ۠ۦۘ۬۬ۜۘۛۜۡۘۨۗۢۡۛۜۖۖۦ۟ۨۖۘ۠۬ۦ";
                                        break;
                                    } else {
                                        str2 = "ۖۙۖۨ۟۫ۜۤ۬ۧۜ۟ۢۦۚۗۢۦۤ۟ۧ۫ۙ";
                                        continue;
                                    }
                                case 576378625:
                                    str2 = "ۚۢۚۡۦۥۘ۬۬ۙۤۥۖۙۡۘ";
                                    continue;
                                default:
                                    continue;
                            }
                        } catch (Exception e2) {
                            return;
                        }
                    }
                    textView.setTextColor(i2);
                    return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r0 = "ۚ۠ۜۜۦۗ۟ۚ۫ۙۘۘۨۖۡۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void durationVNColor(android.widget.TextView r6) {
        /*
            r5 = -11
            r1 = 0
            java.lang.String r0 = "ۖۧۨ۬ۦۤۜۥۢۜ۬ۡۡۡۧۡۘۨۤۦۢۨۖ"
        L_0x0005:
            int r2 = r0.hashCode()
            r3 = 231(0xe7, float:3.24E-43)
            r4 = -1958258423(0xffffffff8b475909, float:-3.8392989E-32)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -1392444191: goto L_0x0017;
                case -822019657: goto L_0x0014;
                case -526771701: goto L_0x0061;
                case -331397288: goto L_0x005b;
                case 132296941: goto L_0x0020;
                case 727653312: goto L_0x003f;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            java.lang.String r0 = "۟ۚۥۘۧ۟ۡۘ۬ۡۥۘۢ۠ۥۘ۬ۤۗۦ۬ۨۘ۟ۙۚ۬ۨ۬"
            goto L_0x0005
        L_0x0017:
            java.lang.String r0 = "seekbar_color_chat_picker"
            int r1 = com.obwhatsapp.youbasha.others.getColor(r0, r5)
            java.lang.String r0 = "ۡۗ۬ۤ۬ۨۨۖ۟ۦۘۨۜۙ۠ۥۖۡۘ۟"
            goto L_0x0005
        L_0x0020:
            r2 = -354129656(0xffffffffeae46908, float:-1.3806554E26)
            java.lang.String r0 = "ۨۨۚۤۡۖۖۡۧۘ۬ۗۜۡۧۡۘۛۘۗۗ۬ۘۙۜۘۘۧۜۥ"
        L_0x0025:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1245255795: goto L_0x003c;
                case -549526390: goto L_0x0039;
                case -441492025: goto L_0x002e;
                case 776941977: goto L_0x0034;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0025
        L_0x002e:
            java.lang.String r0 = "ۚ۠ۜۜۦۗ۟ۚ۫ۙۘۘۨۖۡۘ"
            goto L_0x0005
        L_0x0031:
            java.lang.String r0 = "ۤ۫ۜۘۙۡۦۙۚۗۜۥ۬ۤ۟ۡۥۖۘۘ"
            goto L_0x0025
        L_0x0034:
            if (r6 == 0) goto L_0x0031
            java.lang.String r0 = "ۚ۠ۤۛۙۘۚۘۨۜۚۡۘ۟ۜ۫ۨۛ۠"
            goto L_0x0025
        L_0x0039:
            java.lang.String r0 = "ۖۥۢۤۢۨۘۗۥۚۤۖۧ۫ۗ۫ۛۢۡ"
            goto L_0x0025
        L_0x003c:
            java.lang.String r0 = "ۖۘۘۗۦۨۘۦۨۥۘ۫ۛۜ۠ۗۤ۬۟ۙۡۛ۟ۘۥۡۘ"
            goto L_0x0005
        L_0x003f:
            r2 = -1537835676(0xffffffffa4567d64, float:-4.6510063E-17)
            java.lang.String r0 = "ۢۜۨۙۜۦۢۗ۬ۗ۫ۥۛۤۜ۠ۛ۠ۙۖۧۘ۫۟ۨ"
        L_0x0044:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1283182641: goto L_0x0058;
                case -656388593: goto L_0x002e;
                case -507048991: goto L_0x0053;
                case -5159293: goto L_0x004d;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0044
        L_0x004d:
            java.lang.String r0 = "۠۫ۙۢۘۥۥۖۡ۟ۡۖۤ۬ۘ"
            goto L_0x0044
        L_0x0050:
            java.lang.String r0 = "ۛ۠ۘۚۖۨۙۘۥۘ۫ۗۡۘۢۥۢ۬۫ۧۗ۫ۘۘ"
            goto L_0x0044
        L_0x0053:
            if (r1 == r5) goto L_0x0050
            java.lang.String r0 = "ۖۚۗۗۗۡۛۚۜۘۚۨۗۜۢۘۘۥۘ۠"
            goto L_0x0044
        L_0x0058:
            java.lang.String r0 = "ۜ۠ۘۘۧۜۡ۬ۧۚۥۜ۟ۦ۫ۨۘۗ۬۠ۗۤۛ۟"
            goto L_0x0005
        L_0x005b:
            r6.setTextColor(r1)
            java.lang.String r0 = "ۚ۠ۜۜۦۗ۟ۚ۫ۙۘۘۨۖۡۘ"
            goto L_0x0005
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.durationVNColor(android.widget.TextView):void");
    }

    public static void e() {
        boolean z2;
        String str = null;
        String jID_t = dep.getJID_t(f515d.getJIDVC());
        f514c = jID_t;
        String str2 = "ۡۦۧۧۚۡۨ۟ۜۘ۟ۗۡۥۥۚۙۛۦ۠۠ۖۘ۬۫۠ۢ۫ۖۘ";
        while (true) {
            switch (str2.hashCode() ^ 800978272) {
                case -563470110:
                    yo.setCurr_sJid(jID_t);
                    yo.setGroupBoolean(yo.isGroupJid(jID_t));
                    return;
                case -354805105:
                    com.obwhatsapp.Conversation conversation = f515d;
                    String str3 = "۠ۥۢۢۛۧۚۚۗ۟ۛ۟ۚۚۨۖۗۖۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -1196428409) {
                            case -2050675570:
                                try {
                                    Intent intent = conversation.getIntent();
                                    String str4 = "ۚۥۡۘۢۜۜۨۙ۠ۧۨۢۢۡۥۘ";
                                    while (true) {
                                        switch (str4.hashCode() ^ 316391849) {
                                            case -1233168653:
                                                z2 = false;
                                                break;
                                            case -759461885:
                                                str = intent.getStringExtra("jid");
                                                z2 = yo.isGroupJid(str);
                                                break;
                                            case 97535816:
                                                str4 = "ۛۛۤۧۤۦۘۙۧۚ۬ۤۢۗۧۨۡۤ";
                                                continue;
                                            case 1222037613:
                                                if (intent != null) {
                                                    str4 = "۬ۤۙۤۚۜ۟ۜۘۗۡۙۡۛۙۙۗۗۛۡۚ";
                                                    break;
                                                } else {
                                                    str4 = "ۥۚۙۙۥۥۘ۟ۡۗ۠۟ۨ۫ۥۖۘۖۨۖ۬ۥۗۖ۬ۡۘ";
                                                    continue;
                                                }
                                        }
                                    }
                                    yo.setGroupBoolean(z2);
                                    break;
                                } catch (Exception e2) {
                                    break;
                                }
                                break;
                            case -1046650478:
                                break;
                            case 1059678665:
                                if (conversation == null) {
                                    str3 = "ۦ۬۬ۖۜۡۖۛۡۡۡۜۜۡۚۖۛۦۛۚۚ";
                                    break;
                                } else {
                                    str3 = "۬۟ۥۘۡۨۛۛۖ۬ۗۨۜۘۚۗۤۚۚۦ۟ۡۗۦۨ۠ۥۜۘ";
                                    continue;
                                }
                            case 1770544733:
                                str3 = "ۡۛۡۘۛۗۧۨۛۦۘۖۗۜۙۗۨ۟ۜ۠";
                                continue;
                        }
                    }
                    yo.setCurr_sJid(str);
                    return;
                case -265178258:
                    str2 = "ۡۨۧۘۥۧۤۖ۬۠ۖۗۜۚۨ۫";
                    break;
                case -148483658:
                    if (!jID_t.contains("@")) {
                        str2 = "۫ۧ۫ۨۚۘ۫ۤۗۢۙۗ۠ۨۢ۠ۦۛۤۨۡۘ";
                        break;
                    } else {
                        str2 = "ۢۖۨۡ۬ۘۘۛۚۡۙۖۧۘۙۤۘۙ۬ۥ۠ۥۖۘۗۜۘۛۗۜۘ";
                        break;
                    }
            }
        }
    }

    public static int eswitch() {
        String str;
        int parseInt = Integer.parseInt(shp.getPrefString("ConvoEntry", "7"));
        String str2 = "ۡۜۙۨ۠ۥۘۚ۬۠ۘۢۨۖۡۚۛۧ۫ۥۜۘ";
        while (true) {
            switch (str2.hashCode() ^ -1934841139) {
                case -1883089162:
                    str2 = "ۦۚۖۘۧۥۙۨۜۗۖ۫ۘۘۨۘۖۛۢۨ۬۬ۢۗۨۦۤۗۥۘ";
                    break;
                case -1523885750:
                    String str3 = "ۙۘۛ۫ۡۜۡۜۜۦ۬ۘ۟ۙۧۡۗ";
                    while (true) {
                        switch (str3.hashCode() ^ -1707905151) {
                            case 473909347:
                                str3 = "۟ۢۨۘ۠ۥۧۤۤ۬ۧۦۖۦۜ";
                                continue;
                            case 923835121:
                                String str4 = "ۦۤۚۛۘۧ۠ۢ۠ۗ۟ۨۘ۟ۙۧۜۙ۟ۖ۠ۦۘۗۖۖۢ۫ۜۘ";
                                while (true) {
                                    switch (str4.hashCode() ^ -802894949) {
                                        case -697883724:
                                            String str5 = "۠ۦۖۘۥ۫ۘۘۤ۟ۗۧۘ۬ۜ۫ۦۢ۫ۧۢۛ۟";
                                            while (true) {
                                                switch (str5.hashCode() ^ -756898605) {
                                                    case -1793200863:
                                                        if (parseInt == 7) {
                                                            str5 = "ۧ۬ۘۙۤۘۘ۬۫ۗۘۧۛۗۢۘۢ۬ۙ۫ۗۢۢۢۖۘۦ۠";
                                                            break;
                                                        } else {
                                                            str5 = "ۢۡۖۘۧۚۨۖۘۘۗۤۘۘۛۘۥۘۖۚ۟";
                                                            break;
                                                        }
                                                    case -185516081:
                                                        str5 = "ۚۜۜۤ۠ۢۡۢۜۘۡۥۡۢۤۦۘۤۘۦۘ";
                                                        break;
                                                    case 341332525:
                                                        break;
                                                    case 669765853:
                                                        String str6 = "ۗۜۘۖۘۜۤۖۘۘۗۡۖۘۨۘۡ";
                                                        while (true) {
                                                            switch (str6.hashCode() ^ 86574800) {
                                                                case -1927168484:
                                                                    if (parseInt == 20) {
                                                                        str6 = "ۦۦۢ۟ۨۜۘۖۦ۬ۜۚۥۢۚۥۘ۫ۡۧۘ۟ۡ۟ۡ۬ۜۘۤۘۘۘ";
                                                                        break;
                                                                    } else {
                                                                        str6 = "ۡۛۥۘۧۛۖۚۥۘ۫ۨۖۗۚۗۜۛۘ۠ۚۨۘ";
                                                                        break;
                                                                    }
                                                                case -1716621644:
                                                                    String str7 = "ۧ۟ۚۛۗۡۘۘۛ۬ۤ۬ۘۦۡۜۗۙۖ۠۬ۙۨۦۥۘ";
                                                                    while (true) {
                                                                        switch (str7.hashCode() ^ 1145881686) {
                                                                            case -743126119:
                                                                                if (parseInt == 22) {
                                                                                    str7 = "ۛۤۜۗ۬ۤۘۨۚۢۥۘ۬ۗ۫";
                                                                                    break;
                                                                                } else {
                                                                                    str7 = "۫۬ۚۜۖۛۚۚۥۘ۠ۧۜۗۡۜۘۚۚۤۗۥۡ۠۠ۘۘۢۗۨۘ";
                                                                                    break;
                                                                                }
                                                                            case -485439441:
                                                                                str = "kittyemoji";
                                                                                break;
                                                                            case 1677042918:
                                                                                String str8 = "ۛۢۖۡۨۨ۟ۨۦۦۙۘۘۥۖۡۘۦ۫ۤ";
                                                                                while (true) {
                                                                                    switch (str8.hashCode() ^ 425718583) {
                                                                                        case -2112186827:
                                                                                            String str9 = "ۥۧۘ۠ۡۗ۫۠ۢۧ۠ۧۘ۟ۗۧۢۥۘۛۚۡۘۢۙۡۘ";
                                                                                            while (true) {
                                                                                                switch (str9.hashCode() ^ 1799245836) {
                                                                                                    case -1870114835:
                                                                                                        if (parseInt == 25) {
                                                                                                            str9 = "۟ۛ۫ۤۖۖۚ۬ۡۘۜۛۜۛۨۗۘۨۚ";
                                                                                                            break;
                                                                                                        } else {
                                                                                                            str9 = "ۗۨۘۘۦۘۤ۟ۚ۬ۛۘۘۦ۟ۡ۫ۖۥۘۦۚۦ۬ۛ۬ۜ۫ۖ";
                                                                                                            break;
                                                                                                        }
                                                                                                    case -1697632365:
                                                                                                        str = "lineemoji";
                                                                                                        break;
                                                                                                    case -278493267:
                                                                                                        str9 = "ۢۚۗۜۤۡۘۙۤۖۘۢۦۖۘۥۛ۫";
                                                                                                        break;
                                                                                                    case 1283808008:
                                                                                                        switch (parseInt) {
                                                                                                            case 11:
                                                                                                                str = "allo_emoji";
                                                                                                                break;
                                                                                                            case 12:
                                                                                                                str = "naza_input_emoji";
                                                                                                                break;
                                                                                                            case 13:
                                                                                                                break;
                                                                                                            default:
                                                                                                                switch (parseInt) {
                                                                                                                    case R$styleable.FloatingActionMenu_menu_shadowRadius:
                                                                                                                        str = "ios14_emoji";
                                                                                                                        break;
                                                                                                                    case R$styleable.FloatingActionMenu_menu_shadowXOffset:
                                                                                                                        str = "fbmess_emo";
                                                                                                                        break;
                                                                                                                    case 30:
                                                                                                                        str = "mess_emoji";
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        String str10 = "ۘۧۥۖۜۘ۬ۖۢۧۢ۠ۤۡۜۘۘ۟ۖ";
                                                                                                                        while (true) {
                                                                                                                            try {
                                                                                                                                switch (str10.hashCode() ^ -457167060) {
                                                                                                                                    case -2077076479:
                                                                                                                                        if (!whichEntry().equalsIgnoreCase("theme_conversation_stock")) {
                                                                                                                                            str10 = "ۤۚ۠ۚ۫ۤۙۜۛ۫ۧۖۘۚ۫ۜۨۜۢۙۢۧۢ۫ۡ";
                                                                                                                                            break;
                                                                                                                                        } else {
                                                                                                                                            str10 = "۫ۜۧۘ۟ۨۦۜۖۧۘ۟۟۟ۜۖۘ";
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    case -1457879258:
                                                                                                                                        return yo.getID("yowa_hangouts_conversation_emoji", "drawable");
                                                                                                                                    case 624350505:
                                                                                                                                        str10 = "ۥۗۜۜۧۜۤۢۗۦۜۡ۠۟ۚۚۡۤ";
                                                                                                                                        break;
                                                                                                                                    case 1524757719:
                                                                                                                                        return yo.getID("ib_emoji", "drawable");
                                                                                                                                }
                                                                                                                            } catch (NoSuchMethodError e2) {
                                                                                                                                return yo.getID("ib_emoji", "drawable");
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break;
                                                                                                                }
                                                                                                        }
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case -1999549557:
                                                                                            str = "ios_emoji";
                                                                                            break;
                                                                                        case 100322062:
                                                                                            if (parseInt == 24) {
                                                                                                str8 = "ۢۤ۫ۚۚ۬ۤۚۥۨۤۦۥۗۥۘۛۧ۫";
                                                                                                break;
                                                                                            } else {
                                                                                                str8 = "۠۠ۢ۠ۙۖۘ۫ۧۡۖۘۥۘ۠ۗۦۘۚۜۥۘۗۛ";
                                                                                                break;
                                                                                            }
                                                                                        case 625765896:
                                                                                            str8 = "ۛ۬ۚۢۧۚۜۛۤۛۤۚۢۘۙۦۘۗۖۚ۠";
                                                                                            break;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 1983618466:
                                                                                str7 = "ۖۥۜ۬ۘۛۖۛۨۘۜ۬ۦۘ۠ۙۘۘ۟ۧۙۨۨۧۘ";
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                                case 1058118464:
                                                                    str6 = "ۡۤۡۘ۬۫ۘۙۥۘۨۢ۠۬۬ۙ۠ۜ۠";
                                                                    break;
                                                                case 2037701060:
                                                                    str = "xtreme_emoji";
                                                                    break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            return yo.getID("ib_emoji", "drawable");
                                        case -469838411:
                                            str = "yowa_mood_conversation_entry_input_emoji";
                                            break;
                                        case -208155432:
                                            if (parseInt != 5) {
                                                str4 = "ۙۚۙۢۥۜ۟۫ۖۢۘۡۘۤۢ۫ۘۖۦۧۘۥۥۙۡۘ";
                                                break;
                                            } else {
                                                str4 = "۟ۧ۠۠۠ۤۡۛۗۧۥۗۜۚۡۘۧۜۖۤۥۖ۠ۦۧۘۨۙۧ";
                                                continue;
                                            }
                                        case -139291531:
                                            str4 = "ۥۚ۟۬ۖۨۘ۫ۤۜۘ۠۬ۤۥۘ۟ۨۨۖۘ";
                                            continue;
                                    }
                                }
                                break;
                            case 1188310217:
                                if (parseInt != 4) {
                                    str3 = "ۦۗۜۘۧۙۜۘۛۧۘ۠ۛۢۘ۬۫ۨ۠ۖۨ۬ۗۜۜۘ";
                                    break;
                                } else {
                                    str3 = "ۧۜۢۛۜۗۧۘۘ۠۠ۘۘۨ۫ۡۖۥۤ۟ۜۗ";
                                    continue;
                                }
                            case 1855949252:
                                str = "yowa_aran_conversation_emoji";
                                break;
                        }
                    }
                    return yo.getID(str, "drawable");
                case 652620629:
                    if (parseInt == 3) {
                        str2 = "ۡۤۡۘ۠ۛۢۛۜۧۖۘۢۨۨ";
                        break;
                    } else {
                        str2 = "ۦۦۚ۫۟ۢۛۘۥۚۥۘۗۥ۠ۙ۟ۜۘۘۜۚ";
                        break;
                    }
                case 1537121226:
                    return yo.getID("yowa_hangouts_conversation_emoji", "drawable");
            }
        }
    }

    public static int f(C16740tZ r7) {
        String str = "ۜ۠ۤ۟ۚۜۘۜۦۘۚ۠ۥۘ۫۫ۖۘۗ۬ۤ";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            switch ((str.hashCode() ^ 566) ^ 887500058) {
                case -323683663:
                    str = "ۢۘۥۘۡۨۡۘۛۚۨۘۤ۬ۡۙ۠ۙ۬ۡۘ";
                    break;
                case 198861814:
                    str2 = "date_left_color";
                    str = "۠ۡۨۥۥ۬ۗ۬ۨۚۨۢۗۤۖۥۥۖۤۡۛۤۙۥۤۨ۬";
                    break;
                case 400616975:
                    str = "ۦۗۥۘۗۢۘۘۖۚ۠ۛۙۜۘۙۗۤۡۙۨۘۚۧۥۘ";
                    str3 = str2;
                    break;
                case 683632705:
                    str4 = "date_right_color";
                    str = "ۥۢۡۘۨ۫ۚ۬ۖۜۘ۟ۘۘۢۜ۬ۦۚ۟ۛۜۜۘ";
                    break;
                case 1264872460:
                    str = "ۦۗۥۘۗۢۘۘۖۚ۠ۛۙۜۘۙۗۤۡۙۨۘۚۧۥۘ";
                    break;
                case 1397897024:
                    str = "ۜۥۙۙۢ۟۫ۢۜۛۘۙ۬ۖۧ";
                    str3 = str4;
                    break;
                case 1568912920:
                    String str5 = "ۢۚۘۥۜۥۘۨۡۘۨ۫ۥۥ۠۠";
                    while (true) {
                        switch (str5.hashCode() ^ 1744060708) {
                            case -2013800517:
                                str = "ۡۚۡۜۡۙۦۙۦۘۚۡ۟۫ۖۚۖ۠ۥۘۦۧ۠";
                                continue;
                            case -1661263107:
                                str = "۠ۚۦۜۙۛۧۧۧۦۘۙۜۤۢۡۥۡۘۗۛۦۘۚ۫ۤۖۧۘ";
                                continue;
                            case 833322300:
                                if (!r7.A11.A02) {
                                    str5 = "ۡۛۥۥۧۖۘۘ۟۟ۨۦۗۙۙۢۙۧۚۤۢۛۖۜۨ";
                                    break;
                                } else {
                                    str5 = "ۧۜۜۙ۠ۨ۬ۖۘۢۡۖۥۚۡۘۘ۠ۚ";
                                    break;
                                }
                            case 1485353287:
                                str5 = "ۡۢۧۢ۠ۥۘۛۤ۬ۤۦ۫ۧ۠ۘۦۗۤۡۖۘۡۡۜۘۤۗۚ";
                                break;
                        }
                    }
                    break;
                case 1806686923:
                    return others.getColor(str3, ColorStore.getDefaultChatBubbleDateColor());
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r0 = "۟۠ۖۜۖۜۦ۫ۚۙۢۗۜۚۨ۠ۜ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g() {
        /*
            r2 = 0
            java.lang.String r0 = "۟۟ۗۢۤ۟ۧ۟۫ۧۥۢۡۦۗ۫ۤۜۘۚ۫۬"
            r1 = r2
            r3 = r2
        L_0x0005:
            int r2 = r0.hashCode()
            r4 = 583(0x247, float:8.17E-43)
            r5 = -1194230010(0xffffffffb8d17f06, float:-9.9895566E-5)
            r2 = r2 ^ r4
            r2 = r2 ^ r5
            switch(r2) {
                case -1476990235: goto L_0x003f;
                case -755995702: goto L_0x0014;
                case -297997806: goto L_0x0060;
                case -7725549: goto L_0x0020;
                case -5684863: goto L_0x0066;
                case 1396180415: goto L_0x0044;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            java.lang.String r0 = com.obwhatsapp.yo.yo.getCurr_sJid()
            java.lang.String[] r2 = com.obwhatsapp.yo.dep.f(r0)
            java.lang.String r0 = "ۡۧۨۛۤۗ۬ۧ۟ۦۗۢۖۦۜۘۗ۠۠"
            r3 = r2
            goto L_0x0005
        L_0x0020:
            r2 = 963882695(0x3973aec7, float:2.3239396E-4)
            java.lang.String r0 = "ۦۨۙۦۢۘ۫ۨۗۛۛۤۨ۟ۛۧۗ۠"
        L_0x0025:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case 138769180: goto L_0x0034;
                case 542932915: goto L_0x0039;
                case 787528422: goto L_0x002e;
                case 1839389378: goto L_0x003c;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0025
        L_0x002e:
            java.lang.String r0 = "۟۠ۖۜۖۜۦ۫ۚۙۢۗۜۚۨ۠ۜ"
            goto L_0x0005
        L_0x0031:
            java.lang.String r0 = "ۡ۫ۤ۠ۢۦۘۗ۟ۘۙۚۨۘۛ۠ۘۖۗ"
            goto L_0x0025
        L_0x0034:
            if (r3 == 0) goto L_0x0031
            java.lang.String r0 = "ۛۨ۬ۚۨۨۘ۟۟ۢۜ۟ۤ۫۫ۡۘ۟ۜۥۘۨۙ"
            goto L_0x0025
        L_0x0039:
            java.lang.String r0 = "ۙۧ۠ۘۧۛۢۡۘۘۡۙۗۥۧۡۘۡۦۛۡۧۢ"
            goto L_0x0025
        L_0x003c:
            java.lang.String r0 = "ۨۜۢۗۤۥۘۦۦۘۗ۠ۘۘۦۛ۬"
            goto L_0x0005
        L_0x003f:
            java.util.HashSet r1 = f516e
            java.lang.String r0 = "ۖۧۘۘۘۧۘۦۧ۬ۘۡۘ۠ۗ۠ۧ۠ۤ"
            goto L_0x0005
        L_0x0044:
            r2 = -1119830692(0xffffffffbd40bd5c, float:-0.047055587)
            java.lang.String r0 = "ۢۥۢۜۥۧۨۧۚ۠ۘۦۡۨ۬ۚۘۡۘۘۤۥۘۤۘۘۜۘۢ"
        L_0x0049:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -2095899083: goto L_0x0058;
                case -2059778245: goto L_0x005d;
                case -1394610668: goto L_0x002e;
                case 1822553539: goto L_0x0052;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x0049
        L_0x0052:
            java.lang.String r0 = "۟ۘۨۧۡۦۗۗۜۗۘۡۘۛۦۧۘ"
            goto L_0x0005
        L_0x0055:
            java.lang.String r0 = "ۤۦۖۡ۫ۥۡۨۙ۫ۡۖۥۨۘۗ۠ۘۗۖۦۖۤۡ۫۠ۘ"
            goto L_0x0049
        L_0x0058:
            if (r1 == 0) goto L_0x0055
            java.lang.String r0 = "ۙ۫ۜۨۚۦۘۛۦۥۘۤ۬ۡۘۗۛۡۢۧۡ۫ۛۡۘۨۚۨۘۢۤۜ"
            goto L_0x0049
        L_0x005d:
            java.lang.String r0 = "۬ۛۦۘۗۙۡۚ۫ۗ۫ۛۥۖۛۨ۬ۙۚۜۦۡۘ۠ۛۖۘۛۥۘۘ"
            goto L_0x0049
        L_0x0060:
            java.util.Collections.addAll(r1, r3)
            java.lang.String r0 = "۟۠ۖۜۖۜۦ۫ۚۙۢۗۜۚۨ۠ۜ"
            goto L_0x0005
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.g():void");
    }

    public static int getBubbleMargin(ViewGroup viewGroup, int i2) {
        String str = "ۡۦۥ۠۫۬ۚۤ۫۠ۨۡۜۘۧۘۤۨۧۗۚ۟";
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            switch ((str.hashCode() ^ 898) ^ -806561851) {
                case -2138485089:
                    i5 = N;
                    str = "ۛۤۛۧۢۥۗۙۡۦۦۨۚۘۧۗ۬ۥۙۦۘ";
                    break;
                case -2031542270:
                    return i4;
                case -1732942320:
                    String str2 = "ۙۗۜۘۚۖۘۘ۟۬ۧۚۛۜۘۘۤۡۙۦۘۗۖۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -457847248) {
                            case -2000338831:
                                str2 = "۬ۜۥۘ۟ۛۖۡۘۖۘۛۡۗ۫ۖۦۘۤۦۡۤۢۡۘۛۖۨۘۛۧۢ";
                                break;
                            case -1145985864:
                                str = "ۙۛۦۡۛۥۥ۫ۚۜۨۜۘۢۜۡۘۧۜ۟";
                                continue;
                            case 1007622181:
                                str = "ۘۧۜۚ۫۠ۜۦۡۤۡۘ۠ۦۨۗۜۡ";
                                continue;
                            case 1239723414:
                                if (f533v) {
                                    str2 = "۫ۨۥۘۨۢۥۘۖ۠ۜۗ۬۬ۘۨۚ";
                                    break;
                                } else {
                                    str2 = "ۥۜۡۘۡۨ۠۬ۖۦۘۡۨۨ۫۬ۡۨۢۡ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1634443752:
                    str = "ۧ۬ۜۙۖ۫ۗ۠ۚۚۥۥۗ۠ۜۜۙۧۤۗۤۜۛۛۘ";
                    break;
                case -1529641917:
                    String str3 = "ۗۚۦۨۖۥ۬ۚۡۘۛۤ۫ۢ۫ۘۘ۫ۤ۠۟ۚ";
                    while (true) {
                        switch (str3.hashCode() ^ -26510055) {
                            case -2007590931:
                                str3 = "ۙۚ۫۠ۤۚۖ۟ۨۘۨ۟۠ۛ۫ۜۗۧۧۦ۬ۛۤۢ۫";
                                break;
                            case -1413649634:
                                str = "۫ۨ۫ۨۜۜۖۥۦۘ۫۫ۢ۠ۧۤۗ۫ۘۘ۬۠ۦۘ۫ۢ۟۬۬ۘۘ";
                                continue;
                            case 654413097:
                                str = "ۤ۟ۥۢۦۤۙۖۖۨۙۧۧۤۖۤۘ۠ۜۢۥۖ۠ۥۘۖۦۨۘ";
                                continue;
                            case 1933893353:
                                if (viewGroup.findViewWithTag("yo") == null) {
                                    str3 = "ۦ۠۟ۢۧ۠ۧ۬ۙ۠ۢۚۛۚۜۘۥۘۘۗۢ۫";
                                    break;
                                } else {
                                    str3 = "ۥ۠ۘۘۗۚ۬ۙۙۘ۟ۨۤۡ۬ۧۛۘۚ۬ۧۦۜۘ۬۟۫ۗ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1376326164:
                    String str4 = "۟ۢۦۥ۬ۜۢۦۦۘۚۨۨۘۚۛۧۜۨۨۛۚۥۘۜۙ۬ۥۛ۬";
                    while (true) {
                        switch (str4.hashCode() ^ -754366497) {
                            case -1310844566:
                                if (i2 >= 0) {
                                    str4 = "ۨ۠۬۫۠ۨۘۙۘۘۘۗۢۨ۬ۚۦ";
                                    break;
                                } else {
                                    str4 = "۫۠۬ۧۙۗۚۨۦۘۨ۫۠۬۟ۦۘ";
                                    break;
                                }
                            case -429846293:
                                str4 = "ۗۖۛۧۦۧ۟ۜ۟ۤۨ۟ۢۘ۟ۡۖ۟ۦۤۖ۠۫";
                                break;
                            case 504014668:
                                str = "ۥ۠ۨۘ۟ۙۨۘۤۖۙۚۙۥۘۦ۬ۘۡۦۘ";
                                continue;
                            case 826394786:
                                str = "ۧۥۦۧ۟ۡۚ۟ۖۡۜۖۚۙۦ۠ۧۧۢۡۘۦۧ";
                                continue;
                        }
                    }
                    break;
                case -978534575:
                    i3 = -i5;
                    str = "ۖۧ۠ۙۗۨۘۢۡۨۘۦۙۙۜۜۢ۟ۥۡۘۨۦۘ";
                    break;
                case -872372494:
                    str = "ۥ۠ۨۘ۟ۙۨۘۤۖۙۚۙۥۘۦ۬ۘۡۦۘ";
                    i4 = i3;
                    break;
                case 459681572:
                    str = "ۙۗ۟ۤۥۥ۬ۗۧۜۙۢۧۦ";
                    i4 = i5;
                    break;
                case 819547879:
                case 846218769:
                    return i2;
                case 1485646769:
                    str = "۠ۗ۠۠ۗۜۜۚ۟ۙۜ۬ۧۦۘۖۙۜۙۚۦۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        r0 = "۠ۨۤ۬ۖ۠ۚۦ۬ۢ۟ۚۤۚۖ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getBubbleWidth(android.view.ViewGroup r6, int r7) {
        /*
            r2 = 0
            java.lang.String r0 = "ۤۚۤۨۛۜۘۧۥۖۘۜۙۜۘۡۨ۠ۜۡ۠"
            r1 = r2
            r3 = r2
        L_0x0005:
            int r2 = r0.hashCode()
            r4 = 118(0x76, float:1.65E-43)
            r5 = 123000057(0x754d4f9, float:1.6011694E-34)
            r2 = r2 ^ r4
            r2 = r2 ^ r5
            switch(r2) {
                case -1575203396: goto L_0x0045;
                case -1259910236: goto L_0x001a;
                case -789522694: goto L_0x0017;
                case -484668905: goto L_0x003b;
                case 18620572: goto L_0x0061;
                case 142745511: goto L_0x008e;
                case 1292851935: goto L_0x006a;
                case 1932494262: goto L_0x008a;
                case 1956818295: goto L_0x0014;
                case 2127036998: goto L_0x008e;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            java.lang.String r0 = "ۢۖۢۚۛۦۘ۬ۧ۠ۚۦ۟ۢۘۘۙۡ۬ۖۗۧ"
            goto L_0x0005
        L_0x0017:
            java.lang.String r0 = "ۤۤۦۘ۫۫۫ۘۨۥۛۖ۬ۜۥۘۡۧۙۗۗۤ"
            goto L_0x0005
        L_0x001a:
            r2 = 329187117(0x139eff2d, float:4.013643E-27)
            java.lang.String r0 = "ۗۡۨۛۙۢ۟ۖ۟ۡۛ۟۫ۦۜۥۧۗۡۨ۠ۤۡۥۘۤۨۧ"
        L_0x001f:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1250515174: goto L_0x0028;
                case 139659036: goto L_0x002e;
                case 505482418: goto L_0x0035;
                case 1147499247: goto L_0x0038;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x001f
        L_0x0028:
            java.lang.String r0 = "ۛۤۦۘۙۨۗۛۡۨۘۚ۬ۘۢ۟ۘ"
            goto L_0x0005
        L_0x002b:
            java.lang.String r0 = "ۛ۠ۜۘۧۛۦۛۢۨۘۦۥۡۘۡۧۛ"
            goto L_0x001f
        L_0x002e:
            boolean r0 = f533v
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "ۦ۫ۗۦۢۢۜۡۚۨۡۦۤۖۨۘۗ۟ۘۘۦ۬ۛ"
            goto L_0x001f
        L_0x0035:
            java.lang.String r0 = "۬۟۟۟ۥۗۛ۟۠۠۫ۦۘۜ۟۠ۦۢۧ"
            goto L_0x001f
        L_0x0038:
            java.lang.String r0 = "ۘ۟۟ۡۛ۫ۙۘۧۘۡ۟ۦۘۚ۟۫ۙۘۘۛۜ۬ۥۗۡۘ"
            goto L_0x0005
        L_0x003b:
            java.lang.String r0 = "yo"
            android.view.View r2 = r6.findViewWithTag(r0)
            java.lang.String r0 = "ۡۚۧ۫۟ۙۛۖۖۥۧۦۦۗۖۘۧ۠۟"
            r3 = r2
            goto L_0x0005
        L_0x0045:
            r2 = 2076583808(0x7bc62780, float:2.0577519E36)
            java.lang.String r0 = "۬۠ۨۢۜۘۤۖۧۘۢۤۘۘ۟ۘۜۘ"
        L_0x004a:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case 441715844: goto L_0x0059;
                case 809585184: goto L_0x0078;
                case 1068575273: goto L_0x005e;
                case 1081769567: goto L_0x0053;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x004a
        L_0x0053:
            java.lang.String r0 = "ۧۘۘۘۖۘۥۘۡۘۖۘۜۥۖۗۛۛ"
            goto L_0x004a
        L_0x0056:
            java.lang.String r0 = "۠ۛۛ۠ۨ۫ۡۛ۟ۖ۟ۜ۠ۡ۟ۖۘ۫۟ۖۥۘ۠ۨۨۗ۟ۢ"
            goto L_0x004a
        L_0x0059:
            if (r3 == 0) goto L_0x0056
            java.lang.String r0 = "ۥۛۨۢۥ۠ۨۚۛۖۚۨۘۗ۫ۥ"
            goto L_0x004a
        L_0x005e:
            java.lang.String r0 = "ۥۥۢۘ۫ۦۚ۠ۘۘۨۛۙ۫۫ۘۘ۬ۦۚۨۜۛ۫۬ۖۘۥۚۡ"
            goto L_0x0005
        L_0x0061:
            java.lang.String r0 = "ro"
            android.view.View r1 = r3.findViewWithTag(r0)
            java.lang.String r0 = "ۚۖۥۘۨۗۗۗ۬ۖۘۧۚۘۘۥۙۧ"
            goto L_0x0005
        L_0x006a:
            r2 = -649400952(0xffffffffd94aed88, float:-3.5699446E15)
            java.lang.String r0 = "ۜۖۡۙ۟ۨۘۦۘۘۘۡ۠ۥۤ۠ۖ۬ۤۥۘ"
        L_0x006f:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -2105267546: goto L_0x007e;
                case -1910151975: goto L_0x0083;
                case -1601753923: goto L_0x0078;
                case 1526260996: goto L_0x0086;
                default: goto L_0x0077;
            }
        L_0x0077:
            goto L_0x006f
        L_0x0078:
            java.lang.String r0 = "۠ۨۤ۬ۖ۠ۚۦ۬ۢ۟ۚۤۚۖ"
            goto L_0x0005
        L_0x007b:
            java.lang.String r0 = "ۧۧۜۦۖۗ۟ۤۙۦۧ۫ۜۙۙۙ۠ۥۘ"
            goto L_0x006f
        L_0x007e:
            if (r1 == 0) goto L_0x007b
            java.lang.String r0 = "۟ۤۗۘۜۗ۫۫ۛۚۦۦۘۚۡۤ۬ۧۦۘۜۢۢۛ"
            goto L_0x006f
        L_0x0083:
            java.lang.String r0 = "ۡ۬ۜۜۨۖۦۨۦۘۤۥۖۘۜۗۥۘۤۦ۬"
            goto L_0x006f
        L_0x0086:
            java.lang.String r0 = "ۥۛۖ۫ۙۤۧ۬ۛۜ۬ۡۘۦۗۢۨۗ"
            goto L_0x0005
        L_0x008a:
            int r7 = r1.getMeasuredWidth()
        L_0x008e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.getBubbleWidth(android.view.ViewGroup, int):int");
    }

    public static String getCustomDTTLreaction() {
        StringBuilder sb = null;
        String str = "ۡ۬ۢۨ۠ۨۘۢۤۨۘۙۤۗۗ۟ۥۥۨۙۨۛ۠ۜ۟ۧ";
        while (true) {
            switch ((str.hashCode() ^ 643) ^ 674930899) {
                case -1233284837:
                    sb = new StringBuilder();
                    str = "ۖۘۖۥۗ۠ۧۚۨۡۢۤۜۢ۟۫";
                    break;
                case 509724189:
                    return shp.getStringPriv(sb.toString(), "👍");
                case 845683242:
                    sb.append(yo.getCurr_sJid());
                    str = "ۙ۠ۨۘ۫ۛۛۗ۟ۜۜۜۖۘۨۚ۫ۥ۟ۨ۟ۘۜ";
                    break;
                case 1970525948:
                    sb.append("_customDTTL");
                    str = "ۙۡۛۤۜۖۜۖ۟۟ۡۚۚۚۚۤۦ۫";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashSet<java.lang.String> getDeletedMsgList() {
        /*
            java.lang.String r0 = "ۦۜۧۜ۬۟ۤۗ۠ۦۧۜۘۥۛۘۘ۬ۦ۟ۜۘۤ۬۬ۗ۬ۡۤ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 519(0x207, float:7.27E-43)
            r3 = -1690670733(0xffffffff9b3a6973, float:-1.5419632E-22)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -91975831: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.util.HashSet r0 = f516e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.getDeletedMsgList():java.util.HashSet");
    }

    public static int getHyperlinksColor(int i2, int i3) {
        int i4 = 0;
        String str = "۟۬۠ۧ۫ۘ۫ۤۗۢۨۚۧۡۛۚۗۧۜۧۨۘۧۤۧ";
        while (true) {
            switch ((str.hashCode() ^ 595) ^ 1365772939) {
                case -1878841135:
                    String str2 = "ۘ۫ۜۘۧۜۗۘۤۦۜۚۨۛ۟ۜۘ۟۠۠ۙۗۖۗۘۗ";
                    while (true) {
                        switch (str2.hashCode() ^ -1098125044) {
                            case -1903686487:
                                str2 = "ۛۗۜۗۨۢۧۥۢۜۜۘۦۧ۫";
                                break;
                            case -1633333221:
                                str = "۟ۙۜۘۜ۠ۗۘۦۜۘ۠ۙۡۘۨۢ۠ۥۨۡۗۙ۟";
                                continue;
                            case -1186198583:
                                str = "۠ۢۦۘ۫۠ۘۛ۠ۨۘۤۢۘۚ۠ۚۨ۠";
                                continue;
                            case 1698715574:
                                if (i4 == -11) {
                                    str2 = "ۗۙۜۘۘۖۛ۫ۢۘ۬۠ۦۛۢ";
                                    break;
                                } else {
                                    str2 = "ۖۖۢۧۖۛ۠ۨۧۘۗ۟ۚۚۙۢ۟ۨۢۦۦ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1288497523:
                    String str3 = yo.mpack;
                    str = "ۨۢۢۢۥ۬ۤ۫۬ۖ۫۬۫ۙۧ";
                    break;
                case -1287770016:
                    str = "۬ۛ۟ۚۛ۟ۚۙۨۘۙۥۧۘۙۖۡۤۡۜۢۘ۠";
                    break;
                case -283628066:
                    String str4 = "۫ۛۖۘۖۧۡ۫ۨۙۢ۠ۡ۟۫ۘۘۛۡۧۘۡۨۙۜۖ۠";
                    while (true) {
                        switch (str4.hashCode() ^ -2106963954) {
                            case -1668472253:
                                str4 = "ۨۗۨۘۤۘ۠ۗ۠ۦۘۘۢۛۗۡۗۧ";
                                break;
                            case -1321681518:
                                if (i2 == freqids.getId("link_color")) {
                                    str4 = "۠ۙۦۘ۠ۜ۟ۙۗۗۤۚۘۘۥۦۗۘۛۘ";
                                    break;
                                } else {
                                    str4 = "ۖ۬۠۟ۛۨۘۖۥۛ۬ۤۡۗ۟ۢ۟۬ۥۘ۬ۤۘۖۖۦ";
                                    break;
                                }
                            case -213742163:
                                str = "ۚۘۡۘۡۥۖۘۢۗۦۘ۠ۥۨۘۦۢۚۥۧۘ۬ۘۘ";
                                continue;
                            case 32129720:
                                str = "ۛ۫ۜۘۙ۫ۙ۟ۛۥ۟ۗۘ۟ۛ۟ۜ۫ۖۘ";
                                continue;
                        }
                    }
                    break;
                case 312529221:
                case 543011222:
                    return i3;
                case 489385370:
                    i4 = others.getColor("ModChatBubbleHyperlinks", -11);
                    str = "۟ۨۧۘۗۧۡۘۗۚ۠ۘ۫ۧۚۡۦۘۘۢۖۜۚۨۘۛ۫ۨۘ";
                    break;
                case 1497285038:
                    return i4;
                case 2005831287:
                    str = "۟ۢۢۜۢۜۘۡۢ۫۠ۤۜۗۡ۠ۛۡ۬ۙۖ۠ۗۢۧ";
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.obwhatsapp.youbasha.ui.activity.SwipeBackController getswp() {
        /*
            java.lang.String r0 = "ۢۡۘۛۛۗ۬ۗۗۗۛۜۥۗۦۢۚۦۡ۠ۤ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 245(0xf5, float:3.43E-43)
            r3 = -842204643(0xffffffffcdccfa1d, float:-4.29867936E8)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -788139031: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            com.obwhatsapp.youbasha.ui.activity.SwipeBackController r0 = f517f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.getswp():com.obwhatsapp.youbasha.ui.activity.SwipeBackController");
    }

    public static void grpAdmin(C30011bb r8, boolean z2) {
        ImageView imageView = null;
        String str = "ۜ۟ۘۘۗ۫ۧۗ۟ۢۚۨۜ۠ۜۨۘۦۦۖۜۥۙۧۦۡۘۦۢ";
        int i2 = 0;
        int i3 = 0;
        while (true) {
            switch ((str.hashCode() ^ 363) ^ -1695143047) {
                case -1878566858:
                    imageView.setVisibility(i3);
                    str = "ۘ۬۫ۛۗۙۛۢ۠ۧ۠ۦۘۢۗۤۦۧۗۗۗۜۙۚۜۘ";
                    break;
                case -1251248495:
                    str = "ۧۢۘۢ۠ۙۦۡۛ۟ۥۚ۫ۘۖۘۦ۟۟ۜۛۙۦۥۥ";
                    break;
                case -1190175798:
                    str = "ۗۤۖۗۥۖۘۚۚۜۨۙ۠۬۬۬ۚۢ۬";
                    i3 = i2;
                    break;
                case -1020888571:
                    str = "۟ۨ۬ۜۛۦ۫ۗۨۘۢۥۡۘۙۨ";
                    imageView = (ImageView) r8.findViewById(yo.getID("div2", "id"));
                    break;
                case -989750394:
                case -627103119:
                case 1315905321:
                    return;
                case -757612622:
                    str = "ۗۤۖۗۥۖۘۚۚۜۨۙ۠۬۬۬ۚۢ۬";
                    break;
                case 211833945:
                    String str2 = "ۧۗۨۢ۬ۧۢۘۧۘۦ۠۫ۦۖۚۜۗ۫";
                    while (true) {
                        switch (str2.hashCode() ^ 441483958) {
                            case -1089803139:
                                if (!z2) {
                                    str2 = "ۥۦۜۡۗۤۘۥۙ۫ۦۜۘ۫ۚۙۘۧۗ۠ۤۚۛۘۤ";
                                    break;
                                } else {
                                    str2 = "ۤۨۘۘۤۜۘ۠ۚۤۢۚۜۘۧ۫ۧۢ۬ۛۘۧۨۘ";
                                    break;
                                }
                            case -1050313029:
                                str = "ۨۗۖۙۙۧۘ۬ۡۚ۠ۖۘۧۗۜۡ۫ۜۦۖۘ";
                                continue;
                            case -758085991:
                                str2 = "ۜۗۚۦۡ۬ۥۚۡۧ۠۟ۙۥۘۡ۬ۘ";
                                break;
                            case 1268721385:
                                str = "ۛۘۛۙۚۛۢۧۜۛۚۡۙۛۙ";
                                continue;
                        }
                    }
                    break;
                case 319852405:
                    String str3 = "ۖۖۜۜ۟ۦۘۜۗۥ۠ۤۦۙۥۧ";
                    while (true) {
                        switch (str3.hashCode() ^ 2143430414) {
                            case -1286242180:
                                if (shp.getBoolean("grpAdmin_enabled", true)) {
                                    str3 = "ۥۛۡۛۤ۫ۦۗۗۖ۟ۖۧۛ۟ۖۖۢۨ۫ۗۢۖۘۨۚۛ";
                                    break;
                                } else {
                                    str3 = "ۙۧۦۘۗۢۜۘۖۢۖۘۨۨۥ۠ۙۤۖۖۧۘۚۙۥ۠ۧۢۧۥ";
                                    break;
                                }
                            case -160697743:
                                str3 = "ۘۛۤۚ۬ۚ۠۫ۜۘۚۙۡۛۦۜۘ۠ۛۨۘۧۢۖۥۢۡ";
                                break;
                            case 390365066:
                                str = "ۛ۫ۛۦۤۖۘۗۚ۠ۖۜۘۘۗۤۢۘ۫ۡۘۡ۠ۖ۬ۜۡۘ";
                                continue;
                            case 1218090369:
                                str = "ۨۥۨۘۜۛۗۦۧۖۢ۟۠ۘ۠۟۬ۡۜۘۛ۫ۚ";
                                continue;
                        }
                    }
                    break;
                case 468159451:
                    String str4 = "ۡۖ۠ۢۦۖۘۤۢۙۨۜۙۚ۬ۨۘ";
                    while (true) {
                        switch (str4.hashCode() ^ -2147170571) {
                            case -1945290205:
                                str4 = "ۢۗۖ۠ۖ۠ۡۧۤۗ۟ۨۛۜ۫۠۬ۦۘ";
                                break;
                            case 910389544:
                                if (imageView == null) {
                                    str4 = "۟۟ۤۗۤۘ۬ۜۢۥۤۜۘۛۧۦۘۜۗۙ۬ۧۛۖۚ۬";
                                    break;
                                } else {
                                    str4 = "ۜ۫ۧۚۧۥۘ۫ۡۧۘۦۜۦۚۜۜۙۜۨۘۤۙۘ۠۟ۜ";
                                    break;
                                }
                            case 1605863255:
                                str = "ۘ۬۫ۛۗۙۛۢ۠ۧ۠ۦۘۢۗۤۦۧۗۗۗۜۙۚۜۘ";
                                continue;
                            case 1892681160:
                                str = "ۖۡۤۙۙۘۘۤۢۧۡۢۙ۟ۗۚ۫ۦۘۨۤۥۘۤۦ۟";
                                continue;
                        }
                    }
                    break;
                case 591733922:
                    str = "ۖۙۗۡۘۙۢ۠ۡۙۖ۬ۧۚ۟۠ۡۚۗۡۚ۠ۗ";
                    i3 = 0;
                    break;
                case 594657539:
                    String str5 = "ۖۗ۬۠۬ۧ۫۫ۗ۠ۖۘۥۜۜۘ۬ۛۖۘ";
                    while (true) {
                        switch (str5.hashCode() ^ 829484717) {
                            case -1181626990:
                                if (r8 != null) {
                                    str5 = "۟۬ۛ۫ۥۚ۠ۧۚۗۧۜۦۗ۟ۨ۬ۛۡۨۡۘ";
                                    break;
                                } else {
                                    str5 = "۟ۚۢۗۘۨۘۡۖۘ۫ۗۧ۫ۜۢۥۘۧۘۙۜۗۗۧۖۘ۬ۛۡۘ";
                                    break;
                                }
                            case -709358518:
                                str5 = "ۘۤۥۘ۟ۚۥ۠ۧۘۘۤۚ۠ۜۨ۟۬۠ۖۘۤۖۡ";
                                break;
                            case 460667519:
                                str = "۟۬۬۠ۧۛۨۤۦۤۥۙۛ۫ۥ۬ۘۧۦۤ";
                                continue;
                            case 1652561043:
                                str = "۠ۜۨۘۘۘۜۘ۠ۧۨ۠۟ۗۜ۠ۜۨ۟ۡۘۙ۠ۜۘۦ۟ۘۘ";
                                continue;
                        }
                    }
                    break;
                case 819064142:
                    str = "ۨ۟ۘۙۡ۟ۛۡۙ۫ۡ۬ۜ۟ۡۘۚۡۧۘۜۖۨ";
                    break;
                case 1115776511:
                    str = "ۛۨ۫۬۠ۡۘ۟ۘۨۗۢ۠ۗۖۜۘۤۚۗۡۥۚ۠۠ۜۘۚۗۨ";
                    break;
                case 2043541698:
                    i2 = 4;
                    str = "ۥ۠ۥۘۖ۠ۘۘۦۘۦۢ۟ۘ۬۠ۛۧۧۖۘ۫ۦۦۘۤۘۘۘ۟ۨ۬";
                    break;
            }
        }
    }

    public static void grparticpantName(TextView textView) {
        int i2 = 0;
        String str = "ۜۧۘۘۢۨۖۘۜ۠ۖ۠ۧۜۚۖ۟ۜۨۘ۬ۢۖۘۥۖۖۘ۫ۧ۫";
        while (true) {
            switch ((str.hashCode() ^ 544) ^ -506650295) {
                case -1861557412:
                    String str2 = "۟۟ۘۥۛۦۧۜۘ۫ۡۜۘۥۨۘ۠ۚۥۘۦۡۢ";
                    while (true) {
                        switch (str2.hashCode() ^ -2089350989) {
                            case -1367303951:
                                if (i2 == -11) {
                                    str2 = "۫ۦۖ۠ۢۘۗۗۘۡ۠ۘۘ۫ۙ۬ۜۛۦ۟ۧۘۘۖۡ۫";
                                    break;
                                } else {
                                    str2 = "ۜ۟ۛۘۢ۟ۥۧۙۨۗ۫ۨ۟ۤۛۥۘ";
                                    break;
                                }
                            case -247452307:
                                str = "ۦ۫ۜۥۨۙۜۘۘۦ۟ۢۙۡۙۤۥۘۜۨۤ۟۬ۜۘ۠ۤۨ";
                                continue;
                            case 259659088:
                                str2 = "ۧۚۜۘۤۙۡۘۙۢۗۛۚۜ۬۠";
                                break;
                            case 2070834048:
                                str = "ۙۛۧۗۚۨۧۨ۟۠۫ۨۘۘۡۘۦۦ۫ۥ۟ۥۘ۟۟ۘۘ";
                                continue;
                        }
                    }
                    break;
                case -1073411332:
                    textView.setTextColor(i2);
                    str = "ۙۛۧۗۚۨۧۨ۟۠۫ۨۘۘۡۘۦۦ۫ۥ۟ۥۘ۟۟ۘۘ";
                    break;
                case -850544358:
                    String str3 = "ۜۨ۬ۜۦ۬۟ۙ۠ۨۧۙ۟ۨۘۙۗ۫";
                    while (true) {
                        switch (str3.hashCode() ^ -1574042924) {
                            case -2128651423:
                                str = "۫ۜۥۜۜۙۥ۠ۥۘۢۚۗ۟ۗۤۛ۠ۧۜ۫۬";
                                continue;
                            case -1748531590:
                                str3 = "ۘۖۘۘۤۗۙۦۢ۠ۜۨۘ۟ۙۙۡ۠ۘۘۢۙۘۘۘ۠ۜۘۖۢۗ";
                                break;
                            case -659121600:
                                if (textView != null) {
                                    str3 = "ۙ۫ۚ۫۟ۘۢۡ۫ۥ۠ۖۦۛۘۘۥۘۘۘۜۘ۟ۘۨۘ۠ۘۥ";
                                    break;
                                } else {
                                    str3 = "ۨۦۖۘۘ۠ۘۘۥۛۖۘۨ۟ۜ۫ۛۜۘۧۤۙۦۗۘ۫ۛۚ";
                                    break;
                                }
                            case 1986878038:
                                str = "ۗ۬ۙۡ۠ۖۘۜۧۗۚۖۚۚ۫ۤ";
                                continue;
                        }
                    }
                    break;
                case -621508372:
                    str = "ۜ۟ۛۧ۠ۦۦۡۥۘۢۨۖۛ۠ۜۙۧۛ۬ۜۦ";
                    break;
                case 1034850770:
                    i2 = others.getColor("participant_name_color_picker", -11);
                    str = "ۖۤۘۘ۫ۛۜۛۥۜۜۧۙۥۜۤۦۨ";
                    break;
                case 1343849493:
                case 1401470507:
                    return;
            }
        }
    }

    public static String h() {
        String str = "۠ۛۦ۬ۥ۫ۢ۬ۥۜۗ۠۟ۧۡۘۤۗۡۘۨۧۗ";
        String str2 = null;
        StringBuilder sb = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        StringBuilder sb2 = null;
        String str9 = null;
        while (true) {
            switch ((str.hashCode() ^ 572) ^ -978680098) {
                case -1994853272:
                    str = "ۛۤۘ۟ۗۧۦۨۤۖ۬ۜۗ۟ۦۘ";
                    str6 = str7;
                    break;
                case -1941389507:
                    sb.append("Avatars");
                    str = "۠ۡۙۤۥۢۘ۠ۤۜۛۖۘۖۢ۬ۗۖۜۘۘ۠ۘۙۨۘۘۘۚ";
                    break;
                case -1885165764:
                    str = "ۗ۠ۡۘ۬ۤۗ۟۫ۢۥۧ۟ۖۜۨۘۢۜ";
                    break;
                case -1866149911:
                    String str10 = "ۙۛۡۘۧۡ۟۬۬ۡ۟۫ۘۛۘۧۘۜ۫ۡۘ۠ۦ۬ۖ۠ۧ۠ۡ";
                    while (true) {
                        switch (str10.hashCode() ^ -227372468) {
                            case -680557009:
                                if (new File(str2).exists()) {
                                    str10 = "ۦۧ۫ۤۨۨۘۨۙۜۘۘۘۜ۟ۧۦۘۛۖۤ";
                                    break;
                                } else {
                                    str10 = "ۧۛۗ۠۠ۖۦۛۡۜۜ۠ۢ۠ۜۘ";
                                    break;
                                }
                            case 576726270:
                                str = "ۤۦ۫ۧۡۜۢۛ۠ۧۤۢۗۗۥۘ";
                                continue;
                            case 1885899154:
                                str = "ۙۧۘۡۨۧ۠ۙۜۘۧ۠ۙ۫ۚۡۘۥۢ۫۠۬ۨۙۡ۫ۙ";
                                continue;
                            case 1952882509:
                                str10 = "ۘۧۡۙۦۨ۠ۨۨۚۖ۟ۗۘۧۥۜۚۨۧۤۡ۬ۚۥ";
                                break;
                        }
                    }
                    break;
                case -1765846697:
                    sb2.append(f515d.getCacheDir());
                    str = "ۖۦۖۦۨۧۘۤۤۧۗۥۥۘۗۜۧۘۢۥ۠ۥ۬ۦۘۦ۬۟۠ۡۜۘ";
                    break;
                case -1089878576:
                    sb2.append(".jpg");
                    str = "ۗ۠ۗ۬ۥۢۥۧۖۘۛۛۡۘۜۢۧۘۚۖۙۧۢۗۚۧ";
                    break;
                case -1082981607:
                    str = "ۗ۫ۨۘۛۖۧ۠ۦۦۘۡ۬ۤۜۖۢۧۗۢۘ۬ۜۘۢۨۦۘ۬ۦۚ";
                    sb2 = new StringBuilder();
                    break;
                case -761059238:
                    str = "ۛۛۖۘۗۧۨۡۗۚۥۗۘۘۧ۬ۜۘ";
                    str4 = str3;
                    break;
                case -576794570:
                    str = "ۦۗۖۦ۫ۦۙۖۖۨۖۛۢۥۖۘ۟ۗۤۗۚۚۥۘۦۘ";
                    str4 = str5;
                    break;
                case -483020985:
                    str = "۫ۛۨۚۧۖۙ۠ۛ۠ۥۛۛۚۢۗۤۚۧۡۡۦ";
                    str8 = File.separator;
                    break;
                case 17027591:
                    str = "ۛۛۖۘۗۧۨۡۗۚۥۗۘۘۧ۬ۜۘ";
                    break;
                case 65389600:
                    sb2.append(str9);
                    str = "ۤۢۗ۠ۦۨۘۜۖۖۘ۬ۨۥۨۜ";
                    break;
                case 162867514:
                    String str11 = "۬ۥۥۦۥ۟ۖۜۦۤۚ۫ۤۛۥۘ۟ۜۢۢ۠ۢۧۜ";
                    while (true) {
                        switch (str11.hashCode() ^ -605762433) {
                            case -1383323695:
                                str = "ۢۥۧ۠ۛۡۢۙۛۛۗۧۧ۟ۨۘ۠۟ۖۗۙۚ۟۠ۡ";
                                continue;
                            case -1305933713:
                                str = "ۥ۠ۡ۟ۛۦۘۡۤ۠۬ۙۨۤۦۢ۬ۜۗۖۛ۠۟ۖ";
                                continue;
                            case 1742757703:
                                str11 = "۫ۛۧۜ۬ۦ۟ۙ۠ۘۤۗ۠ۘۦۘ۫۬ۖۢۧۜ";
                                break;
                            case 1877948856:
                                if (!yo.getGroupBoolean()) {
                                    str11 = "ۢۧۢۨۘۗۤۨۚ۠۠ۜۘۙۥۢ";
                                    break;
                                } else {
                                    str11 = "ۛ۬ۦۘۜۙۨ۠ۖۨۥۧۖ۬ۛۧۨۖۜۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 236224447:
                    sb.append(str9);
                    str = "۟ۛۤۦ۟ۤۘۦۥۘۛ۟ۜۘ۫ۛۡۘ۠۟ۤۗ۠ۡۥۙۛ۠ۢ۟";
                    break;
                case 457979505:
                    sb.append(".j");
                    str = "۠ۢۥۗ۠ۨۡۘۡۡۡۨۘ۠ۡۘ۬ۙۘۥۨۙ۫ۜۡۘ۟ۡۗ";
                    break;
                case 472475789:
                    sb2.append(str8);
                    str = "ۨۜ۬۟ۙۤۧۢۡۛۦ۟۟ۢ۫۠ۚۤ";
                    break;
                case 475781227:
                    str2 = sb.toString();
                    str = "۠ۚۗۖۥۖ۟۫ۚۥۖۘۘۢۧۥ۟ۜۨۡۗۡ";
                    break;
                case 479124219:
                    str5 = "@g.us";
                    str = "ۙۡۜۚۖۙۨ۟ۙۙۥۧۘۙ۠ۖۘ۠۟ۡ۬۬ۡۘۨۦ۬";
                    break;
                case 606906786:
                    sb.append(yo.datafolder);
                    str = "ۤ۠ۦۜۜۡ۬۟ۚۢۤۤۘۨۢۚۜۘۥۢ۟";
                    break;
                case 613596541:
                    Toast.makeText(f515d, "Open contact Profile picture to load in High Quality (HQ)!", 0).show();
                    str = "۫ۖۙۗۜۢۜۥۘۖۗۚۥۘۥۤ۟ۡ۟۬ۤۛۡ۠";
                    break;
                case 657621123:
                    str = "ۡۚۖۦ۬ۡۖۛۡۘۤۙۧۗ۟";
                    sb = new StringBuilder();
                    break;
                case 766268894:
                    sb2.append(str8);
                    str = "ۙۤۖۤۛۨۧۚۛۨۖۗۦۤۖۥ۬ۙۖۦ۟";
                    break;
                case 906326774:
                    sb.append(str4);
                    str = "ۛۘۤۤۙۧۤۥۙۢۧۥۘۛ۠ۚۚۘۡ";
                    break;
                case 955396558:
                    sb.append("files");
                    str = "ۨۜۨۘۚۘۛۛۧۤۘۢ۫ۛۡ";
                    break;
                case 1148406139:
                    str7 = sb2.toString();
                    str = "ۢۜۗ۟ۙۦۘۥۘۜۢۨۘۜۦۙۜۚۘۨۜۧۘۖۘۤۤۡۨۘ";
                    break;
                case 1198380367:
                    String str12 = "ۖۗۥۧ۟ۥۚ۠ۜۘۘ۫۟ۧۥۡ۠ۤۧ۫ۨۧۘۤۨۢ";
                    while (true) {
                        switch (str12.hashCode() ^ -2122071806) {
                            case -2147281082:
                                str = "ۢۚ۬۟ۖۘۘۖۘ۠ۗۨۘۦۧۨۘۡۨۤۛ۫۠";
                                continue;
                            case -1865756211:
                                if (!new File(str7).exists()) {
                                    str12 = "ۙۚۘۜ۟ۨۡۦۤۗ۬ۜۤۢ۟ۨۙۦۘۗ۫ۦ";
                                    break;
                                } else {
                                    str12 = "۠ۡۨۘ۬ۜۚۨۢۦۜۖۜۘۦۤۦۥ۬ۡۖ۫ۢۘۧۨۥۤ۫";
                                    break;
                                }
                            case -1190987193:
                                str12 = "۫ۤۨۘۢۥۘۘ۠ۖۥۙۨۥۜۨۢۖ۠ۨ۬۫ۡۘۤۛۦۘ";
                                break;
                            case -72251048:
                                str = "ۤۥۧۘۘۗۡۨ۬ۨۘ۠ۘۙ۫۟۬ۥۡۘۤۡۨ";
                                continue;
                        }
                    }
                    break;
                case 1221705810:
                    str = "ۗ۠ۡۘ۬ۤۗ۟۫ۢۥۧ۟ۖۜۨۘۢۜ";
                    str6 = str2;
                    break;
                case 1307881800:
                    return "yonotfound";
                case 1310684148:
                    return str6;
                case 1577242026:
                    sb.append(str8);
                    str = "۫۬ۛۙ۫ۦ۠ۘۖۧۧۙۤۖۨ۠ۢۨۢۜ۠ۖۜۘۘۧۨۡۘ";
                    break;
                case 1634769420:
                    str = "ۦ۟ۘ۠ۛۤۡۦۜۗۜ۬ۗ۫ۙۙۦ۠ۛۛۨۘ";
                    str3 = "@s.whatsapp.net";
                    break;
                case 1661882808:
                    sb.append(str8);
                    str = "۬۟ۙ۫ۘۦۘۦۦ۟۟ۡۨۘۜۛۙ۠ۡۨۘۛۦۥۘ";
                    break;
                case 1669626652:
                    str = "ۘۡ۠ۚۜ۠ۗۥ۬ۖۥۘۘ۠ۨۡ۟۟ۜ۠ۗۙۤۦ";
                    str9 = yo.getCurr_sJid();
                    break;
                case 1977296812:
                    sb2.append(utils.dbsf("UHJvZmlsZSBQaWN0dXJlcw==", 1));
                    str = "ۚۨۖۘۦ۬ۧۥۘۡۜۗ۬۠ۡۛ۠ۘۨ۬۫ۘۘ۫ۚۧ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        r1 = r0.getBackground();
        r1.setColorFilter(com.obwhatsapp.youbasha.others.getColor("ModChaSendBKColor", 0), android.graphics.PorterDuff.Mode.SRC_ATOP);
        r0.setBackground(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void i(java.lang.String r5, java.lang.String r6) {
        /*
            com.obwhatsapp.Conversation r0 = f515d     // Catch:{ Exception -> 0x00ed }
            int r1 = com.obwhatsapp.yo.freqids.getId(r5)     // Catch:{ Exception -> 0x00ed }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x00ed }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x00ed }
            r2 = -865975939(0xffffffffcc62417d, float:-5.9311604E7)
            java.lang.String r1 = "۠ۚۥۘ۟ۦۡۛۥۘ۟ۤۛۡۗۤۚۥۘۨ۬۟ۙۤۙ"
        L_0x0011:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00ed }
            r3 = r3 ^ r2
            switch(r3) {
                case -2104736332: goto L_0x0026;
                case -1032573254: goto L_0x001e;
                case -954376432: goto L_0x001a;
                case 1382478674: goto L_0x0023;
                default: goto L_0x0019;
            }     // Catch:{ Exception -> 0x00ed }
        L_0x0019:
            goto L_0x0011
        L_0x001a:
            return
        L_0x001b:
            java.lang.String r1 = "ۖۧۥۘۙۡۧۘۦ۫ۙۛۥۘۗۛۜۘۨۥۨۘۨۢۜۘۧۡۨۘۡۖۢ"
            goto L_0x0011
        L_0x001e:
            if (r0 != 0) goto L_0x001b
            java.lang.String r1 = "ۖۨۡۘ۟۬ۘۖ۬ۤۡۖۦۜۦ"
            goto L_0x0011
        L_0x0023:
            java.lang.String r1 = "ۘ۬۫ۡ۟ۥۘۧ۟ۦ۟۠ۛۨۖ۫ۗ۫ۡۜۥ"
            goto L_0x0011
        L_0x0026:
            r2 = 154196249(0x930d919, float:2.1287308E-33)
            java.lang.String r1 = "۟ۙۥۘ۟ۛۛ۠ۘۥۧۥۤۛۦۥۥۨ۟ۤۙ"
        L_0x002b:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00ed }
            r3 = r3 ^ r2
            switch(r3) {
                case -1892288342: goto L_0x004c;
                case -1782905797: goto L_0x0034;
                case -1393410878: goto L_0x0045;
                case 1724237678: goto L_0x0042;
                default: goto L_0x0033;
            }     // Catch:{ Exception -> 0x00ed }
        L_0x0033:
            goto L_0x002b
        L_0x0034:
            java.lang.String r1 = "emoji_picker_btn"
            boolean r1 = r5.contains(r1)     // Catch:{ Exception -> 0x00ed }
            if (r1 == 0) goto L_0x003f
            java.lang.String r1 = "ۙۙ۬ۨۢۖۘۤۚۗۧۨۚۘۦۨۤۡۘۘ"
            goto L_0x002b
        L_0x003f:
            java.lang.String r1 = "ۢۖۧۘۥۗۢ۬ۖۖۘۦۗۡۛۘۥۖۨۦۘ"
            goto L_0x002b
        L_0x0042:
            java.lang.String r1 = "ۘۛ۟ۢۜۥۨۦۗۜ۬ۨۘۘۨۘۘۤۢۡۥ۠۠ۛ۠ۜ"
            goto L_0x002b
        L_0x0045:
            int r1 = eswitch()     // Catch:{ Exception -> 0x00ed }
            r0.setImageResource(r1)     // Catch:{ Exception -> 0x00ed }
        L_0x004c:
            b(r0, r5)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r1 = "send"
            boolean r2 = r5.equals(r1)     // Catch:{ Exception -> 0x00ed }
            r3 = 338206938(0x1428a0da, float:8.513555E-27)
            java.lang.String r1 = "۠ۗ۬۫ۡۘۢۡۥۥۤۥۘۙۥۙۦۗۘۘۖۥۦۘ۫ۢۤ"
        L_0x005a:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x00ed }
            r4 = r4 ^ r3
            switch(r4) {
                case -2127561367: goto L_0x008f;
                case -1618522333: goto L_0x008a;
                case -650532750: goto L_0x0092;
                case 1983427913: goto L_0x0063;
                default: goto L_0x0062;
            }     // Catch:{ Exception -> 0x00ed }
        L_0x0062:
            goto L_0x005a
        L_0x0063:
            android.graphics.drawable.Drawable r1 = r0.getBackground()     // Catch:{ Exception -> 0x00ed }
            java.lang.String r2 = "ModChaSendBKColor"
            r3 = 0
            int r2 = com.obwhatsapp.youbasha.others.getColor(r2, r3)     // Catch:{ Exception -> 0x00ed }
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_ATOP     // Catch:{ Exception -> 0x00ed }
            r1.setColorFilter(r2, r3)     // Catch:{ Exception -> 0x00ed }
            r0.setBackground(r1)     // Catch:{ Exception -> 0x00ed }
        L_0x0076:
            r2 = -186005387(0xfffffffff4e9c875, float:-1.481776E32)
            java.lang.String r1 = "۫ۙ۬ۦۧۖۘۜ۠ۛۤۙۛۦۜۗۧۥۘۢۤۖۘ"
        L_0x007b:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00ed }
            r3 = r3 ^ r2
            switch(r3) {
                case -1280057448: goto L_0x00b4;
                case -1031102113: goto L_0x00f0;
                case 220598247: goto L_0x00bf;
                case 310935100: goto L_0x0084;
                default: goto L_0x0083;
            }     // Catch:{ Exception -> 0x00ed }
        L_0x0083:
            goto L_0x007b
        L_0x0084:
            java.lang.String r1 = "۠۠ۨۨۢۤ۬ۘۦۙۗ۟۠ۘۥۘۗۙۡۨۨۦۘۚۢۗ"
            goto L_0x007b
        L_0x0087:
            java.lang.String r1 = "ۦ۟ۖۥۖۦۘۤۘۧۘ۫ۘۡۜۤۖۤۘ"
            goto L_0x005a
        L_0x008a:
            if (r2 != 0) goto L_0x0087
            java.lang.String r1 = "ۚۦ۬ۚ۬ۨ۬ۥۗ۬ۤ۠۫ۗ۬ۤۜ۫"
            goto L_0x005a
        L_0x008f:
            java.lang.String r1 = "۬ۜ۬ۤۘۡۢۦۤ۫ۗۡۘ۬ۚۤۨۗۙۥۨۧۡ۟ۤ"
            goto L_0x005a
        L_0x0092:
            r2 = 457753930(0x1b48c54a, float:1.660736E-22)
            java.lang.String r1 = "ۗۗۢ۟ۥۢۘ۬ۛۘ۬ۗ۠ۜۛ۟ۢۛۢۢۘۘۤۧۚ۟۟ۘۘ"
        L_0x0097:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00ed }
            r3 = r3 ^ r2
            switch(r3) {
                case -1906960854: goto L_0x0063;
                case -1659294622: goto L_0x00a0;
                case -1162282195: goto L_0x0076;
                case 142292610: goto L_0x00a6;
                default: goto L_0x009f;
            }     // Catch:{ Exception -> 0x00ed }
        L_0x009f:
            goto L_0x0097
        L_0x00a0:
            java.lang.String r1 = "۬ۢۖۘ۟۟۠ۙۗ۟ۨۦۥۘۜۖۗ۬ۙۘۢۗ۫ۙۛ"
            goto L_0x0097
        L_0x00a3:
            java.lang.String r1 = "ۛۥۥۥۛۨۘۥۢۗ۟ۤۖ۫ۘۥ۬ۡۜۘۧۜۚۢۥۧۘۨۧ"
            goto L_0x0097
        L_0x00a6:
            java.lang.String r1 = "voice_note_btn"
            boolean r1 = r5.equals(r1)     // Catch:{ Exception -> 0x00ed }
            if (r1 == 0) goto L_0x00a3
            java.lang.String r1 = "ۛۘۦۘۚۦۖۤۡۡۘۘۥۛۜۨۜۢ۟۟۟۫ۡۘۚۗۖۘۖۜۡ"
            goto L_0x0097
        L_0x00b1:
            java.lang.String r1 = "ۥۗۜۢۜۖۜۗۚۛۨ۠ۘۛۨۢۧۡۤۚۚۦۛ۬۟ۙ"
            goto L_0x007b
        L_0x00b4:
            java.lang.String r1 = "voice_note_btn"
            boolean r1 = r5.equals(r1)     // Catch:{ Exception -> 0x00ed }
            if (r1 != 0) goto L_0x00b1
            java.lang.String r1 = "ۢۤۘۘۤ۠ۤۧۦ۠ۗۢۥۘۙۘۤ۬ۛۤ"
            goto L_0x007b
        L_0x00bf:
            r2 = 686491726(0x28eb084e, float:2.6093843E-14)
            java.lang.String r1 = "ۨۘۖۘۦ۠ۧۛ۠ۜۧۖۘۤۖ۬۫ۚۤ۬۬ۡۥۧۘ"
        L_0x00c4:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00ed }
            r3 = r3 ^ r2
            switch(r3) {
                case -2027946729: goto L_0x00f0;
                case -1618989774: goto L_0x00de;
                case 400261779: goto L_0x00d3;
                case 2130218520: goto L_0x00cd;
                default: goto L_0x00cc;
            }     // Catch:{ Exception -> 0x00ed }
        L_0x00cc:
            goto L_0x00c4
        L_0x00cd:
            java.lang.String r1 = "ۖ۠ۜۛۚۦۘۢۢۤۗ۬ۥۘۧۙۡۚۛۜۜۧۙ"
            goto L_0x00c4
        L_0x00d0:
            java.lang.String r1 = "ۜۥۙۖۢۚۗۜۦۘۧ۟ۗۧۘۗ"
            goto L_0x00c4
        L_0x00d3:
            java.lang.String r1 = "send"
            boolean r1 = r5.equals(r1)     // Catch:{ Exception -> 0x00ed }
            if (r1 == 0) goto L_0x00d0
            java.lang.String r1 = "۬ۖۦۘۧۧۛۤۦۧۤۡۡۤۥۖۘ۠ۖۚۘۗ۬۬ۤۘ"
            goto L_0x00c4
        L_0x00de:
            int r1 = com.obwhatsapp.yo.ColorStore.getDefaultConversationEntryIconsColor()     // Catch:{ Exception -> 0x00ed }
        L_0x00e2:
            int r1 = com.obwhatsapp.youbasha.others.getColor(r6, r1)     // Catch:{ Exception -> 0x00ed }
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP     // Catch:{ Exception -> 0x00ed }
            r0.setColorFilter(r1, r2)     // Catch:{ Exception -> 0x00ed }
            goto L_0x001a
        L_0x00ed:
            r0 = move-exception
            goto L_0x001a
        L_0x00f0:
            int r1 = com.obwhatsapp.yo.ColorStore.getPrimaryTextColor()     // Catch:{ Exception -> 0x00ed }
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.i(java.lang.String, java.lang.String):void");
    }

    public static boolean isGroupDescPinned() {
        StringBuilder sb = null;
        String str = "ۜۘۜۘۘ۫ۨۘۧۖۘۥۘۧۘ۫ۖۦ۫ۦۥ";
        while (true) {
            switch ((str.hashCode() ^ 169) ^ 1994973274) {
                case -533621774:
                    sb = new StringBuilder();
                    str = "ۖۧۖۘ۟ۙۘۖ۬ۨۖۦۖ۟ۡ۬ۥ۬۠ۖۘ";
                    break;
                case 27753891:
                    sb.append(yo.getCurr_sJid());
                    str = "ۚۘۥۛۧۤۚۤ۬ۦۘ۫ۢ۠۬ۚۘۘۨ۫ۨ";
                    break;
                case 1631949090:
                    sb.append("_group_desc_pinned");
                    str = "ۥۘۖ۟۠ۖ۟ۢۨۘۙۦۚ۬ۚۚۙ۠ۧۨۧۘۙ۟ۜ";
                    break;
                case 2115830634:
                    return shp.getBooleanPriv(sb.toString(), false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isSwipeBackEnabled() {
        /*
            java.lang.String r0 = "ۙۨۜۘۗۨۙۜ۟ۗۚۛۦۘ۫ۥۨ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 531(0x213, float:7.44E-43)
            r3 = 1917181217(0x7245dd21, float:3.919096E30)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case -1776085450: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "disable_chatswipeV2"
            r1 = 1
            boolean r0 = com.obwhatsapp.yo.shp.getBooleanPriv(r0, r1)
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.isSwipeBackEnabled():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090 A[Catch:{ Exception -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6 A[Catch:{ Exception -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ad A[Catch:{ Exception -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0091 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00b0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void j(android.view.ViewGroup r4, java.lang.String r5, boolean r6) {
        /*
            int r0 = f536y     // Catch:{ Exception -> 0x0076 }
            android.view.View r1 = r4.findViewById(r0)     // Catch:{ Exception -> 0x0076 }
            r2 = 1660995434(0x6300c76a, float:2.3755525E21)
            java.lang.String r0 = "۠ۛۧۘۗۡۚۖۢۛۗۙۚۥۛ۫ۡۡ"
        L_0x000b:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0076 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1434738635: goto L_0x0022;
                case -836636486: goto L_0x002b;
                case 1413329829: goto L_0x0014;
                case 2106115138: goto L_0x0026;
                default: goto L_0x0013;
            }     // Catch:{ Exception -> 0x0076 }
        L_0x0013:
            goto L_0x000b
        L_0x0014:
            r2 = -1725177631(0xffffffff992be0e1, float:-8.885907E-24)
            java.lang.String r0 = "۟ۨۖ۫ۚۛۨ۠ۨۘۨۡۥۘۗۤۧۙۗۘ۠ۥ"
        L_0x0019:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0076 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1912420678: goto L_0x0022;
                case 78422823: goto L_0x003d;
                case 359261362: goto L_0x003a;
                case 1036142073: goto L_0x0031;
                default: goto L_0x0021;
            }     // Catch:{ Exception -> 0x0076 }
        L_0x0021:
            goto L_0x0019
        L_0x0022:
            return
        L_0x0023:
            java.lang.String r0 = "۬ۢۡۘۙۗۡۘۧۦۖۘۤ۫ۡۘۙۡۜۨۗۡ"
            goto L_0x000b
        L_0x0026:
            if (r1 == 0) goto L_0x0023
            java.lang.String r0 = "ۡۢ۠ۤۛۡۘۖۥ۟ۘۡ۬ۨۥۥۘ"
            goto L_0x000b
        L_0x002b:
            java.lang.String r0 = "ۚۦ۠ۦۖۧۢۚۨۘۡۘۙۘۖۙۡۚۡۘ۬ۡۘ"
            goto L_0x000b
        L_0x002e:
            java.lang.String r0 = "ۘۖ۬۠ۥۜ۟ۚ۟ۨۨۘۖ۬ۨۘۗۜۦۘۥۦۥۧۙۢ"
            goto L_0x0019
        L_0x0031:
            java.lang.Object r0 = r1.getTag()     // Catch:{ Exception -> 0x0076 }
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "ۡۧۨۘۙۡۨۚۚۡۖۡۘ۫ۛۚۙۚۖۘۜۚۤۙ۫ۦۘ"
            goto L_0x0019
        L_0x003a:
            java.lang.String r0 = "ۢۙۘۘۤۢۡۙۢۘۗۗۜۘۨ۫ۧۖ۬۟ۙ۟ۥ"
            goto L_0x0019
        L_0x003d:
            r2 = 887941765(0x34ecea85, float:4.412906E-7)
            java.lang.String r0 = "ۚۜۚۥۘۘۘ۠ۦۙ۬ۙۙۛۗۡ"
        L_0x0042:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0076 }
            r3 = r3 ^ r2
            switch(r3) {
                case -2042944252: goto L_0x004b;
                case -520343940: goto L_0x0055;
                case -341190641: goto L_0x0058;
                case 1061152723: goto L_0x0083;
                default: goto L_0x004a;
            }     // Catch:{ Exception -> 0x0076 }
        L_0x004a:
            goto L_0x0042
        L_0x004b:
            boolean r0 = f531t     // Catch:{ Exception -> 0x0076 }
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "ۜۚۥۘۚ۠ۦۜۡۨۧۘ۬ۧۥۛۜۤۗۖۖ"
            goto L_0x0042
        L_0x0052:
            java.lang.String r0 = "۠۬ۖۘۛۤۨۘۘۨۨۘۨۗۧۗۖۡۖۧۘ"
            goto L_0x0042
        L_0x0055:
            java.lang.String r0 = "ۛۢۘۘ۟ۘ۬ۦۤ۬ۧۦۢ۬ۥۘۡۜۡۘۗ۫ۘۜۡۧۘ"
            goto L_0x0042
        L_0x0058:
            r2 = 21426555(0x146f17b, float:3.654011E-38)
            java.lang.String r0 = "ۡۢۙۘۜۧۨۡۜۘۛۜۙۡۛۛۜۢۖۘ"
        L_0x005d:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0076 }
            r3 = r3 ^ r2
            switch(r3) {
                case -467349622: goto L_0x007b;
                case 666549668: goto L_0x0066;
                case 888750015: goto L_0x0080;
                case 1878875325: goto L_0x0083;
                default: goto L_0x0065;
            }     // Catch:{ Exception -> 0x0076 }
        L_0x0065:
            goto L_0x005d
        L_0x0066:
            int r0 = A     // Catch:{ Exception -> 0x0076 }
            android.view.View r0 = r1.findViewById(r0)     // Catch:{ Exception -> 0x0076 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x0076 }
        L_0x006e:
            com.obwhatsapp.yo.dep.loadCImage(r5, r0)     // Catch:{ Exception -> 0x0076 }
            r1 = 0
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x0076 }
            goto L_0x0022
        L_0x0076:
            r0 = move-exception
            goto L_0x0022
        L_0x0078:
            java.lang.String r0 = "ۛ۫ۡۘۚۥۗ۠ۡۙۡ۫۫۠ۤۨۥۗۦۛۚۨۘۗ۟ۛ"
            goto L_0x005d
        L_0x007b:
            if (r6 == 0) goto L_0x0078
            java.lang.String r0 = "ۡۧۦ۠ۦۚ۫ۥۜ۟ۗۙ۬ۦ۠ۦۧۦۘۛۧۖ"
            goto L_0x005d
        L_0x0080:
            java.lang.String r0 = "ۤۜ۬ۚۖۨۘۨۘ۟ۥ۫۫ۚ۫۟۫ۙ۫۟ۜ۫ۧۧۛۜۖ۫"
            goto L_0x005d
        L_0x0083:
            r2 = -1610859263(0xffffffff9ffc3d01, float:-1.06827074E-19)
            java.lang.String r0 = "ۦۤۚۚۨۜۥ۟ۤۜۡۦۘۨۚۖۘ۫ۜۨۚ۫ۦۘۛۥۘ۬ۘۨۘ"
        L_0x0088:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x0076 }
            r3 = r3 ^ r2
            switch(r3) {
                case -2090953676: goto L_0x00b0;
                case -69282000: goto L_0x00ad;
                case 1496437771: goto L_0x0091;
                case 1672546962: goto L_0x00a6;
                default: goto L_0x0090;
            }     // Catch:{ Exception -> 0x0076 }
        L_0x0090:
            goto L_0x0088
        L_0x0091:
            int r0 = f537z     // Catch:{ Exception -> 0x0076 }
            android.view.View r0 = r1.findViewById(r0)     // Catch:{ Exception -> 0x0076 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x0076 }
            com.obwhatsapp.yo.s r1 = new com.obwhatsapp.yo.s     // Catch:{ Exception -> 0x0076 }
            r2 = 0
            r1.<init>(r2, r5)     // Catch:{ Exception -> 0x0076 }
            r0.setOnClickListener(r1)     // Catch:{ Exception -> 0x0076 }
            goto L_0x006e
        L_0x00a3:
            java.lang.String r0 = "۠ۙ۬۠ۨۖۙۤۚ۫۫ۙۜۛۗ۟ۙۧ۬ۤۦۘۨ۫ۘۥۖۗ"
            goto L_0x0088
        L_0x00a6:
            boolean r0 = f530s     // Catch:{ Exception -> 0x0076 }
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = "ۜۢۛ۠ۨ۟۫ۧۘ۟ۨۦۜۘۖۘۨۘ"
            goto L_0x0088
        L_0x00ad:
            java.lang.String r0 = "ۧۨ۬۫ۚ۬۟۫ۖۘۜۥۡ۫ۢۙ"
            goto L_0x0088
        L_0x00b0:
            r0 = 8
            r1.setVisibility(r0)     // Catch:{ Exception -> 0x0076 }
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.j(android.view.ViewGroup, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c1 A[Catch:{ Exception -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c2 A[Catch:{ Exception -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f8 A[Catch:{ Exception -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0101 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0113 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void k(android.app.Activity r4, java.lang.String r5) {
        /*
            com.obwhatsapp.youbasha.ui.activity.specPrivacy r1 = new com.obwhatsapp.youbasha.ui.activity.specPrivacy     // Catch:{ Exception -> 0x00f3 }
            r1.<init>(r4, r5)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r0 = "sprivacy_switch"
            java.lang.String r2 = "id"
            int r0 = com.obwhatsapp.youbasha.others.getID(r0, r2)     // Catch:{ Exception -> 0x019f }
            android.view.View r0 = r4.findViewById(r0)     // Catch:{ Exception -> 0x019f }
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0     // Catch:{ Exception -> 0x019f }
            r1.setSW(r0)     // Catch:{ Exception -> 0x019f }
        L_0x0016:
            java.lang.String r0 = "privacyOnly"
            java.lang.String r2 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r2)     // Catch:{ Exception -> 0x00f3 }
            android.view.View r0 = r4.findViewById(r0)     // Catch:{ Exception -> 0x00f3 }
            r0.setOnClickListener(r1)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r0 = "sprivacy_switch"
            java.lang.String r2 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r2)     // Catch:{ Exception -> 0x00f3 }
            android.view.View r0 = r4.findViewById(r0)     // Catch:{ Exception -> 0x00f3 }
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0     // Catch:{ Exception -> 0x00f3 }
            boolean r2 = com.obwhatsapp.yo.yo.wantsSpecific()     // Catch:{ Exception -> 0x00f3 }
            r0.setChecked(r2)     // Catch:{ Exception -> 0x00f3 }
            com.obwhatsapp.yo.l r2 = new com.obwhatsapp.yo.l     // Catch:{ Exception -> 0x00f3 }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x00f3 }
            r0.setOnCheckedChangeListener(r2)     // Catch:{ Exception -> 0x00f3 }
            com.obwhatsapp.youbasha.ui.activity.mediaPrivacy r3 = new com.obwhatsapp.youbasha.ui.activity.mediaPrivacy     // Catch:{ Exception -> 0x00f3 }
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r2 = "MaskMedia"
            java.lang.String r1 = "id"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r1)     // Catch:{ Exception -> 0x00f3 }
            android.view.View r2 = r4.findViewById(r2)     // Catch:{ Exception -> 0x00f3 }
            r2.setOnClickListener(r3)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r0 = "smask_switch"
            java.lang.String r1 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)     // Catch:{ Exception -> 0x00f3 }
            android.view.View r0 = r4.findViewById(r0)     // Catch:{ Exception -> 0x00f3 }
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0     // Catch:{ Exception -> 0x00f3 }
            r3.setSW(r0)     // Catch:{ Exception -> 0x00f3 }
            boolean r2 = com.OM7753.GOLD.wantsSpecific()     // Catch:{ Exception -> 0x00f3 }
            r0.setChecked(r2)     // Catch:{ Exception -> 0x00f3 }
            com.obwhatsapp.yo.maskmedia1 r2 = new com.obwhatsapp.yo.maskmedia1     // Catch:{ Exception -> 0x00f3 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00f3 }
            r0.setOnCheckedChangeListener(r2)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r0 = "main_text"
            java.lang.String r1 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)     // Catch:{ Exception -> 0x00f3 }
            android.view.View r0 = r4.findViewById(r0)     // Catch:{ Exception -> 0x00f3 }
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0     // Catch:{ Exception -> 0x00f3 }
            r2 = 639840596(0x26233154, float:5.661884E-16)
            java.lang.String r1 = "ۤ۬ۦۘۙۖۢۘ۫ۘۘۙۤۥۛۜۡۘۤ۟۬"
        L_0x008a:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00f3 }
            r3 = r3 ^ r2
            switch(r3) {
                case -155686871: goto L_0x0093;
                case 550386848: goto L_0x009e;
                case 739533160: goto L_0x009b;
                case 898691036: goto L_0x00b4;
                default: goto L_0x0092;
            }     // Catch:{ Exception -> 0x00f3 }
        L_0x0092:
            goto L_0x008a
        L_0x0093:
            if (r0 == 0) goto L_0x0098
            java.lang.String r1 = "ۦۥۙۚۛۚ۠ۖۜۘ۬ۙ۠ۚۙۙۛۘۛۘۛ۟ۦۜۨۘ"
            goto L_0x008a
        L_0x0098:
            java.lang.String r1 = "ۧۘۡۘۛۧ۠ۗ۫ۖ۫ۨۢ۟ۗۜۧۚۧ۬ۦۡۘۘۢۘۛۡ۬"
            goto L_0x008a
        L_0x009b:
            java.lang.String r1 = "ۜ۬۠۬ۡۘ۬ۚۡۘۦۦۜۘۛۜۤ۠ۙۜ"
            goto L_0x008a
        L_0x009e:
            r2 = 36353309(0x22ab51d, float:1.2541604E-37)
            java.lang.String r1 = "ۤۨۥۘۜۙۜۘۡۖۗۥۤۦۘۚۙۘۗۗۡۚ۬ۖ۠ۘ"
        L_0x00a3:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00f3 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1067136754: goto L_0x00d4;
                case -1039524532: goto L_0x00c8;
                case 429661421: goto L_0x00d1;
                case 769231016: goto L_0x00ac;
                default: goto L_0x00ab;
            }     // Catch:{ Exception -> 0x00f3 }
        L_0x00ab:
            goto L_0x00a3
        L_0x00ac:
            r1 = 1
            r0.setChecked(r1)     // Catch:{ Exception -> 0x00f3 }
            r1 = 0
            r0.setEnabled(r1)     // Catch:{ Exception -> 0x00f3 }
        L_0x00b4:
            r1 = 879589432(0x346d7838, float:2.211608E-7)
            java.lang.String r0 = "۟۟ۥۦ۫ۘۘۨۘۘۘ۬ۗۧ۫۠ۡۢۡۤ۠۠ۚۨ۬"
        L_0x00b9:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x00f3 }
            r2 = r2 ^ r1
            switch(r2) {
                case -1979519614: goto L_0x00c2;
                case -1301126001: goto L_0x0101;
                case -1027518992: goto L_0x0113;
                case -627320197: goto L_0x00f8;
                default: goto L_0x00c1;
            }     // Catch:{ Exception -> 0x00f3 }
        L_0x00c1:
            goto L_0x00b9
        L_0x00c2:
            java.lang.String r0 = "۟ۙۡۘۖۤۢۨۨۗ۟ۡ۫۬ۜۜ"
            goto L_0x00b9
        L_0x00c5:
            java.lang.String r1 = "ۜۡۨۧ۠ۤۡۖۜۘۖۘۧۘ۫۠ۦۘۦ۫ۚۡ۟ۥۘ"
            goto L_0x00a3
        L_0x00c8:
            boolean r1 = com.obwhatsapp.yo.yo.NameProf()     // Catch:{ Exception -> 0x00f3 }
            if (r1 == 0) goto L_0x00c5
            java.lang.String r1 = "ۨۢۘۘۦۧۘۨۙۨۙۗۨۤۚۨۘۘۜۜۘۚۤۨۘ"
            goto L_0x00a3
        L_0x00d1:
            java.lang.String r1 = "ۘ۫ۨۘۡۗۙۛۥۖۘۘۜۗۡۧ۠ۥۤۜۘۨ۟ۤۗ۟ۜ"
            goto L_0x00a3
        L_0x00d4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r2 = "NameProf_"
            r1.<init>(r2)     // Catch:{ Exception -> 0x00f3 }
            r1.append(r5)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00f3 }
            boolean r2 = com.obwhatsapp.yo.shp.getBooleanPriv(r1)     // Catch:{ Exception -> 0x00f3 }
            r0.setChecked(r2)     // Catch:{ Exception -> 0x00f3 }
            com.obwhatsapp.yo.m r2 = new com.obwhatsapp.yo.m     // Catch:{ Exception -> 0x00f3 }
            r3 = 0
            r2.<init>(r3, r1)     // Catch:{ Exception -> 0x00f3 }
            r0.setOnCheckedChangeListener(r2)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00b4
        L_0x00f3:
            r0 = move-exception
        L_0x00f4:
            return
        L_0x00f5:
            java.lang.String r0 = "۟ۚۤۘۚۢ۬ۡۘۤۜۥۘۧۙۘۘۦ۬ۗ"
            goto L_0x00b9
        L_0x00f8:
            boolean r0 = com.obwhatsapp.yo.yo.isGroupJid(r5)     // Catch:{ Exception -> 0x00f3 }
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "ۜۛۨۘۤ۫ۦۘۦ۫ۘۘۧۗ۠ۤۙ۬۬ۗ۫ۖ۫ۛۘۘ"
            goto L_0x00b9
        L_0x0101:
            java.lang.String r0 = "div2"
            java.lang.String r1 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)     // Catch:{ Exception -> 0x00f3 }
            android.view.View r0 = r4.findViewById(r0)     // Catch:{ Exception -> 0x00f3 }
            r1 = 8
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00f4
        L_0x0113:
            java.lang.String r0 = "call_spam_block"
            java.lang.String r1 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)     // Catch:{ Exception -> 0x00f3 }
            android.view.View r0 = r4.findViewById(r0)     // Catch:{ Exception -> 0x00f3 }
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0     // Catch:{ Exception -> 0x00f3 }
            boolean r1 = com.obwhatsapp.youbasha.ui.activity.CallsPrivacy.isContactCustomBlocked(r5)     // Catch:{ Exception -> 0x00f3 }
            r0.setChecked(r1)     // Catch:{ Exception -> 0x00f3 }
            com.obwhatsapp.yo.m r1 = new com.obwhatsapp.yo.m     // Catch:{ Exception -> 0x00f3 }
            r2 = 1
            r1.<init>(r2, r5)     // Catch:{ Exception -> 0x00f3 }
            r0.setOnCheckedChangeListener(r1)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r0 = "modC"
            java.lang.String r1 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)     // Catch:{ Exception -> 0x00f3 }
            android.view.View r0 = r4.findViewById(r0)     // Catch:{ Exception -> 0x00f3 }
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0     // Catch:{ Exception -> 0x00f3 }
            r2 = 1737532181(0x6790a315, float:1.3660582E24)
            java.lang.String r1 = "ۦۛۦۘ۬ۢۚ۬ۦۜۘ۫ۧۙۢۡۡۘۘ۠ۛۨۘۦۙۦۘ"
        L_0x0144:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00f3 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1638980183: goto L_0x00f4;
                case -1606633091: goto L_0x0155;
                case -162813923: goto L_0x014d;
                case 369988573: goto L_0x0158;
                default: goto L_0x014c;
            }     // Catch:{ Exception -> 0x00f3 }
        L_0x014c:
            goto L_0x0144
        L_0x014d:
            if (r0 == 0) goto L_0x0152
            java.lang.String r1 = "ۥۧۗۚ۟ۨۘۖۚ۠ۘۥ۠ۦ۬ۗ۟ۦۗۚۘ۬ۚۘۛ۬ۛۦ"
            goto L_0x0144
        L_0x0152:
            java.lang.String r1 = "ۧۡۘ۬ۤۜۥۢۡۘۙۚۡۛۗۖۨۖۢ۟ۤ۠ۛ۫ۧ"
            goto L_0x0144
        L_0x0155:
            java.lang.String r1 = "ۜۥۛۙۤ۬ۙ۟ۜ۟ۦۢۛۧۤۨۘۜ"
            goto L_0x0144
        L_0x0158:
            r2 = -972972778(0xffffffffc6019d16, float:-8295.271)
            java.lang.String r1 = "ۘۡۨۥۧۨۘۢۜۤ۠ۦۨۘۗۜۤ۠ۢۦۘۙۡۖ۟ۡۥ"
        L_0x015d:
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00f3 }
            r3 = r3 ^ r2
            switch(r3) {
                case -1060315988: goto L_0x017f;
                case -959369096: goto L_0x0172;
                case -839327857: goto L_0x0166;
                case 1097944297: goto L_0x0175;
                default: goto L_0x0165;
            }     // Catch:{ Exception -> 0x00f3 }
        L_0x0165:
            goto L_0x015d
        L_0x0166:
            boolean r1 = com.obwhatsapp.yo.yo.chats_show_contact_online_toast_check()     // Catch:{ Exception -> 0x00f3 }
            if (r1 == 0) goto L_0x016f
            java.lang.String r1 = "ۨۢ۬ۗ۠ۦۛۘۦۡۖۡۛۡۢ"
            goto L_0x015d
        L_0x016f:
            java.lang.String r1 = "ۗۗۛۡۤۡۘۛ۟۬ۗۚۘ۟ۙۛ۠ۛ"
            goto L_0x015d
        L_0x0172:
            java.lang.String r1 = "ۡ۫ۗۙۗۛ۫۟۟ۗۗۛۧۖۘ۫ۛۤ۟ۗ۬۠ۧۜۥۘ"
            goto L_0x015d
        L_0x0175:
            r1 = 1
            r0.setChecked(r1)     // Catch:{ Exception -> 0x00f3 }
            r1 = 0
            r0.setEnabled(r1)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00f4
        L_0x017f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r2 = "chats_show_contact_online_toast_check_"
            r1.<init>(r2)     // Catch:{ Exception -> 0x00f3 }
            r1.append(r5)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00f3 }
            boolean r2 = com.obwhatsapp.yo.shp.getBooleanPriv(r1)     // Catch:{ Exception -> 0x00f3 }
            r0.setChecked(r2)     // Catch:{ Exception -> 0x00f3 }
            com.obwhatsapp.yo.m r2 = new com.obwhatsapp.yo.m     // Catch:{ Exception -> 0x00f3 }
            r3 = 2
            r2.<init>(r3, r1)     // Catch:{ Exception -> 0x00f3 }
            r0.setOnCheckedChangeListener(r2)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00f4
        L_0x019f:
            r0 = move-exception
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.k(android.app.Activity, java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void l(android.app.Activity r4, boolean r5) {
        /*
            r1 = -1634654800(0xffffffff9e9125b0, float:-1.536806E-20)
            java.lang.String r0 = "ۤۨ۫ۥ۫ۡۛۗۙ۟ۥۦۘۦۖۙۨۨ۬ۙ۠ۥۘ۬ۥۖۡ۠"
        L_0x0005:
            int r2 = r0.hashCode()
            r2 = r2 ^ r1
            switch(r2) {
                case -2093668612: goto L_0x000e;
                case 171182110: goto L_0x0019;
                case 675754810: goto L_0x004a;
                case 1729404142: goto L_0x0014;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0005
        L_0x000e:
            java.lang.String r0 = "ۡۥۚۗۡۡۘ۠ۥۢۗ۫ۦ۟ۨۥۘ۬ۛۚ۟ۡۦۘۡۚۚۨ۬"
            goto L_0x0005
        L_0x0011:
            java.lang.String r0 = "ۗۧ۠۬ۤ۠ۛۥۚۛۚۥۘۘۨ۠ۙ۫ۥۤۖ۫۬ۜۡۘۚۡۤ"
            goto L_0x0005
        L_0x0014:
            if (r5 == 0) goto L_0x0011
            java.lang.String r0 = "ۚ۬ۘۡۖۛ۫ۦ۠ۡ۠۫۬ۢۖۧۦۘۡۤۜ۟ۚۜ۬ۘ۠"
            goto L_0x0005
        L_0x0019:
            java.lang.String r0 = "abc_capital_on"
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString((java.lang.String) r0)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "ic_settings_account"
        L_0x0021:
            java.lang.String r2 = "drawable"
            int r2 = com.obwhatsapp.yo.yo.getID(r0, r2)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "modPasswordText"
            java.lang.String r3 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)     // Catch:{ Exception -> 0x0053 }
            android.view.View r0 = r4.findViewById(r0)     // Catch:{ Exception -> 0x0053 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x0053 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "modPasswordLogo"
            java.lang.String r1 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r1)     // Catch:{ Exception -> 0x0053 }
            android.view.View r0 = r4.findViewById(r0)     // Catch:{ Exception -> 0x0053 }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x0053 }
            r0.setImageResource(r2)     // Catch:{ Exception -> 0x0053 }
        L_0x0049:
            return
        L_0x004a:
            java.lang.String r0 = "abc_capital_off"
            java.lang.String r1 = com.obwhatsapp.yo.yo.getString((java.lang.String) r0)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r0 = "ic_settings_disable"
            goto L_0x0021
        L_0x0053:
            r0 = move-exception
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.l(android.app.Activity, boolean):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        r0 = "ۡۗۡۘۘۦ۫ۢۡۘۘ۫ۚۨۙۗۡۘۢۨۗۘ۟ۨۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int leftlayID(int r6) {
        /*
            r2 = 0
            java.lang.String r0 = "۬ۜۙۢۚ۟۟ۤۨۦۗ۬ۦۥۜۙۗۜۛۖۡۘۧۗ"
            r1 = r2
            r3 = r2
        L_0x0005:
            int r2 = r0.hashCode()
            r4 = 678(0x2a6, float:9.5E-43)
            r5 = 85357881(0x5167539, float:7.0744965E-36)
            r2 = r2 ^ r4
            r2 = r2 ^ r5
            switch(r2) {
                case -2016432685: goto L_0x0017;
                case -653050826: goto L_0x0067;
                case -620922546: goto L_0x005b;
                case 333898256: goto L_0x003d;
                case 770405851: goto L_0x001b;
                case 1381686301: goto L_0x0060;
                case 1632958214: goto L_0x0014;
                case 1742844651: goto L_0x0039;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            java.lang.String r0 = "ۗۚ۬ۗۗ۬ۘۧۘۘۚۡۧۘۛۧۖۘۥۗۨۘۦۜۜ"
            goto L_0x0005
        L_0x0017:
            java.lang.String r0 = "ۗۚۡۘۨۢ۬ۙۙۖۘۖۥۧۙ۟ۘۦۖ"
            r3 = r6
            goto L_0x0005
        L_0x001b:
            r2 = -542346507(0xffffffffdfac72f5, float:-2.4852527E19)
            java.lang.String r0 = "ۨۙ۫ۤۡۘۘۜۗۡۘۥۥۜ۫ۚۡۤۧۖ"
        L_0x0020:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -2019114431: goto L_0x002f;
                case 100116025: goto L_0x0029;
                case 701427776: goto L_0x0064;
                case 744831937: goto L_0x0036;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0020
        L_0x0029:
            java.lang.String r0 = "ۦۜۢۚ۠ۜۘۙ۠ۥۘۗۛ۫ۦۡۧۘۧ۟ۗ"
            goto L_0x0005
        L_0x002c:
            java.lang.String r0 = "۬ۢ۟ۨۙۧۢۜ۠ۖۙۡ۫ۛۚۢ۬ۤ"
            goto L_0x0020
        L_0x002f:
            boolean r0 = f532u
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "۬ۥۚۥ۠ۤۙ۠ۡۢۧۥۘ۬ۛۧۢۙ۟ۤۛ۫ۨۢ"
            goto L_0x0020
        L_0x0036:
            java.lang.String r0 = "ۛ۫ۘۧۚۡۛۢۗۖۛۤ۫ۦۜ"
            goto L_0x0020
        L_0x0039:
            java.lang.String r0 = "ۡۤۗۚۥۘۘ۠ۨۜۘۡۜۗ۠۟ۨۦۧۛ۠ۚۤ۠ۦۥۗۧ"
            r3 = r6
            goto L_0x0005
        L_0x003d:
            r2 = 1823963343(0x6cb778cf, float:1.7744314E27)
            java.lang.String r0 = "ۗ۟ۧۘۥۨۘ۬ۚۛۧ۠۟ۚ۠۠ۧ۬ۨۘۛۥ۠ۘۘۖۘ"
        L_0x0042:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1466322646: goto L_0x0064;
                case -1034318952: goto L_0x004b;
                case -994649948: goto L_0x0058;
                case 1189309233: goto L_0x0051;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x0042
        L_0x004b:
            java.lang.String r0 = "ۛۦۨۦۦۡۘۘۖۚۦۦۧۘۖۦۙۦ۫ۦ"
            goto L_0x0005
        L_0x004e:
            java.lang.String r0 = "ۖۘۜۘۘۚۗۡۥ۬۬ۘۜۘۜ۬۟ۘۡۗ۟ۘۢۗ۟ۢۨ۠ۦ"
            goto L_0x0042
        L_0x0051:
            boolean r0 = f530s
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "۟۟ۜۘۦۗۡۨۜۘۘۨۘۗۡۢۢ۬ۖ۠ۖۧۤ۟ۢۡۘۧ۟ۜ"
            goto L_0x0042
        L_0x0058:
            java.lang.String r0 = "ۜۨۡۘۜۤ۫ۤۢۙۜۙۦۘۘۨۥۘۤۗۨۘۛۦ۫ۡۡۧ"
            goto L_0x0042
        L_0x005b:
            int r1 = C
            java.lang.String r0 = "ۧۧۤ۟ۜۥ۠ۖ۠ۖۖۢۦۨ۠"
            goto L_0x0005
        L_0x0060:
            java.lang.String r0 = "ۡۗۡۘۘۦ۫ۢۡۘۘ۫ۚۨۙۗۡۘۢۨۗۘ۟ۨۘ"
            r3 = r1
            goto L_0x0005
        L_0x0064:
            java.lang.String r0 = "ۡۗۡۘۘۦ۫ۢۡۘۘ۫ۚۨۙۗۡۘۢۨۗۘ۟ۨۘ"
            goto L_0x0005
        L_0x0067:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.leftlayID(int):int");
    }

    public static void mentionPanelBK(ViewGroup viewGroup, int i2) {
        Drawable drawable = null;
        int i3 = 0;
        String str = "ۡۤ۬ۘۥۖۗۙۚۧۥۜۨۥ۠۠ۨۥۘۘ۫";
        while (true) {
            switch ((str.hashCode() ^ 717) ^ -429575) {
                case -1998883841:
                    str = "ۤۖۘۧۥۢۖۘ۫ۛۥۡۘۘ۠ۚ";
                    break;
                case -1904776904:
                    return;
                case -1753021092:
                    i3 = others.getColor("ModChatEntry", others.getColor("BGColor", ColorStore.getDefaultConversationEntryBackground()));
                    str = "۠۟ۦۘ۫۫ۢۛۦۥۦ۠ۖۘ۟ۢ۬ۛۙۙۦۥۖ";
                    break;
                case -1321188227:
                    viewGroup.setBackgroundResource(i2);
                    str = "۠ۥۛۖ۬ۜۘۧۗۖۗۗۡۘ۟ۙ۟۠ۚ۟ۦۨۨۘۧۛ۫ۚۦۨۘ";
                    break;
                case -1054022475:
                    drawable = AnonymousClass00T.A04(yo.getCtx(), i2);
                    str = "۬ۥۘۘۡۖۖۖۖۧ۫ۤۜۘ۬ۨۨۘۡ۫ۡۘۙۨۤۘۙۥۘ";
                    break;
                case -780354405:
                    str = "۠ۥۛۖ۬ۜۘۧۗۖۗۗۡۘ۟ۙ۟۠ۚ۟ۦۨۨۘۧۛ۫ۚۦۨۘ";
                    break;
                case 430557372:
                    viewGroup.setBackground(drawable);
                    str = "ۤۨۦۧ۬ۢ۬ۖۖۘۢۤۖۢۤۨۘۢۢۗۗ۬ۜۦۤۡۡۦۨ";
                    break;
                case 705388280:
                    drawable.setColorFilter(i3, PorterDuff.Mode.MULTIPLY);
                    str = "ۧۨۥ۬ۗۤۙۡ۟ۘۗۡۘۧۗ";
                    break;
                case 893251924:
                    String str2 = "ۦۗۘۘۚۥۨۘ۬۫ۢۨۚۗۢۤۧۢۧۘۜۢۨۚۧۢۨۚۥ";
                    while (true) {
                        switch (str2.hashCode() ^ 883645794) {
                            case -1598223226:
                                if (drawable == null) {
                                    str2 = "ۨۚۘۦۦۥۢۦۡۘۗۧۧۧۧۥۘ۫ۚۘۘ";
                                    break;
                                } else {
                                    str2 = "۟ۗۘ۬ۗۨ۟ۚۖۘۚۧۛۗۨۢۘۙ۬ۥ۬";
                                    break;
                                }
                            case 1149108861:
                                str = "ۚۖۜۘۦۧۡ۫۠ۦۥ۬ۖۘۖ۠ۥ";
                                continue;
                            case 1555334270:
                                str = "ۧۡۦۘۖۡۙۥۖۘۘۖۙ۫ۘۜۥ";
                                continue;
                            case 1558339159:
                                str2 = "ۗۢ۠ۥۧۜۘۦۧۥۘۧۢۤۢۢۜ۫ۦۧۦۢۜ۫ۗۖۘ";
                                break;
                        }
                    }
                    break;
                case 1868977842:
                    str = "ۖۡۤۧۗۜۢۦۨۧۨۡ۟ۨۙ";
                    break;
            }
        }
    }

    public static Intent multiChats(Intent intent) {
        String str = "ۜۜۚۥۥۨۥۗۧۘۡۨۘۡ۬۠ۛۚۖۗۛ";
        while (true) {
            switch ((str.hashCode() ^ 727) ^ -1237995713) {
                case -1009314607:
                    intent.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
                    str = "ۙۛۦۘۧۡۢ۬ۦۥۘ۬ۤۘۚۦۥۘۦ۫ۛ۠ۥۘۧۥۘۘ";
                    break;
                case -532541771:
                    return intent;
                case 327948376:
                    String str2 = "ۧ۬ۤۖۧۗ۟۠ۛۚۘۘ۠ۖۧۡۗ۠۟۬ۥۘۜۜۗ";
                    while (true) {
                        switch (str2.hashCode() ^ -1878613543) {
                            case -1257027346:
                                if (!shp.getBooleanPriv("multiChats")) {
                                    str2 = "ۖۤۦ۫۟ۙۛۜۖۘ۬ۚۜۘۘۦۙ";
                                    break;
                                } else {
                                    str2 = "ۡۖۧۦۦۙ۫ۧۖۘ۟ۡۛ۬۠ۧ۟ۡۘ۬ۡۛۙۨۘۤ۠ۡ";
                                    break;
                                }
                            case -996075314:
                                str = "۟۠ۙۖۜۚ۬ۤۡۛۨۜۙۗ۠ۡۧۦۘۢۖۦۘۘۗۖ";
                                continue;
                            case 85137522:
                                str2 = "۠ۥۘۘ۫ۦ۠ۡۧۨۘۜۨۖۘۥۙۧۥۚۛ";
                                break;
                            case 1410105992:
                                str = "ۘۧۤ۬ۙۜۧ۠ۚۥ۟ۡۧۢۖۘ";
                                continue;
                        }
                    }
                    break;
                case 1415555342:
                    str = "ۡۨۚۖۡۢ۟ۦۘۧۨۡۡۢ۟۫۠ۛۨۚۦۡۜۜۘ";
                    break;
                case 1841029521:
                    intent.addFlags(134217728);
                    str = "ۘۧۤ۬ۙۜۧ۠ۚۥ۟ۡۧۢۖۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence pNotifi(X.C16010sH r4, java.lang.CharSequence r5) {
        /*
            java.lang.String r1 = com.obwhatsapp.yo.dep.getJID_data(r4)     // Catch:{ Exception -> 0x005d }
            r2 = -57248535(0xfffffffffc9674e9, float:-6.249726E36)
            java.lang.String r0 = "ۘۤ۠ۥ۬۟ۗۜ۬۬ۡۜۡ۟ۦۘ"
        L_0x0009:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x005d }
            r3 = r3 ^ r2
            switch(r3) {
                case -1414360926: goto L_0x0021;
                case -789303516: goto L_0x0012;
                case 879649417: goto L_0x0050;
                case 1188604797: goto L_0x0018;
                default: goto L_0x0011;
            }     // Catch:{ Exception -> 0x005d }
        L_0x0011:
            goto L_0x0009
        L_0x0012:
            java.lang.String r0 = "ۘۡۧۘۥۛۛۨۛۥۘۛۥۧۗ۫ۥۥۡۜۥ۟۠"
            goto L_0x0009
        L_0x0015:
            java.lang.String r0 = "ۡۛۤ۫ۢۨۘۘۚۦۘۢۛۙۨ۬ۤۧۤۢ"
            goto L_0x0009
        L_0x0018:
            boolean r0 = com.obwhatsapp.youbasha.ui.lockV2.LockUtils.isJIDLocked(r1)     // Catch:{ Exception -> 0x005d }
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "ۢۥۙۚۥۧۥۜۧۘۛۘۢۚۖۜۘۗۗ۫ۖۥۖۘ"
            goto L_0x0009
        L_0x0021:
            r2 = -1094025463(0xffffffffbeca7f09, float:-0.39550045)
            java.lang.String r0 = "ۥۦۢۢۘۘۘۛۦۨۗۨۗۨۚۚ۫ۙۗۡۥۚ"
        L_0x0026:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x005d }
            r3 = r3 ^ r2
            switch(r3) {
                case -1981969562: goto L_0x0050;
                case 344445253: goto L_0x003e;
                case 393876984: goto L_0x003b;
                case 2034622492: goto L_0x002f;
                default: goto L_0x002e;
            }     // Catch:{ Exception -> 0x005d }
        L_0x002e:
            goto L_0x0026
        L_0x002f:
            boolean r0 = com.obwhatsapp.yo.yo.H3T((java.lang.String) r1)     // Catch:{ Exception -> 0x005d }
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "ۛ۠ۥۥۙۚۧ۫ۛۦۙۙۙۙۜۘ"
            goto L_0x0026
        L_0x0038:
            java.lang.String r0 = "ۖۦۨۜۙۢۡۧۛ۟۫ۡۘۛ۬ۙۗۥۗ"
            goto L_0x0026
        L_0x003b:
            java.lang.String r0 = "ۚ۬ۚۨۧۤۗۜۦ۟۠ۖۧۢ۬ۘۚۨۦۘۧۛۨ۫"
            goto L_0x0026
        L_0x003e:
            r0 = 0
        L_0x003f:
            r2 = 1560034724(0x5cfc3da4, float:5.6799575E17)
            java.lang.String r1 = "ۗ۠ۡ۬ۥۧۘۢۜۖۡ۟۫۫ۡۘۘ۠ۚۘۘ"
        L_0x0044:
            int r3 = r1.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -2126769637: goto L_0x004f;
                case 100877703: goto L_0x0055;
                case 962103828: goto L_0x005a;
                case 1759810981: goto L_0x004d;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x0044
        L_0x004d:
            java.lang.String r5 = ""
        L_0x004f:
            return r5
        L_0x0050:
            r0 = 1
            goto L_0x003f
        L_0x0052:
            java.lang.String r1 = "۫ۚۨۘۢ۠ۡۢۤۢۛۡ۠۫۬"
            goto L_0x0044
        L_0x0055:
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = "۫ۖۘۗۧ۬ۖۥۖۘۛۘ۬۟ۡۧۘۥۥۜۥۢۨۨۘۨۗ"
            goto L_0x0044
        L_0x005a:
            java.lang.String r1 = "ۤۛۨۘۤۦ۟۬۠ۨۦۤۦۘۧۧۥۘ"
            goto L_0x0044
        L_0x005d:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.pNotifi(X.0sH, java.lang.CharSequence):java.lang.CharSequence");
    }

    public static CharSequence pNotifi(C16740tZ r4, CharSequence charSequence) {
        boolean z2;
        try {
            String jID_t = dep.getJID_t(r4.A11.A00);
            String str = "ۤۡ۫ۦ۬ۚۢۘۙ۫ۘۨۘۚۛ۬ۙ۠ۜۗ۫ۖ";
            while (true) {
                switch (str.hashCode() ^ -65689798) {
                    case -1382604956:
                        if (!LockUtils.isJIDLocked(jID_t)) {
                            str = "ۗۢۨۗۘۗ۬ۖۙۜۖۘۚۗۧۤۛۦ۟۟ۢۥۘۧۚۦ";
                            break;
                        } else {
                            str = "ۚۙۖ۟ۜۥۘۜۨۦ۫۠ۤ۟ۛۤۖۡۘۡۖ۬";
                            continue;
                        }
                    case 7169228:
                        break;
                    case 821488800:
                        String str2 = "ۧ۫ۨۗۜۤۦۚۡۘۦ۬ۜۗ۠ۜۘۖۛۘ۟ۘۜۘۧۘۜۘۥ۫";
                        while (true) {
                            switch (str2.hashCode() ^ 540138680) {
                                case -914836875:
                                    break;
                                case -411651059:
                                    str2 = "ۜۜ۠ۚۦۛۚۖۘۖ۫۫ۖۤ۫ۜۡۦ";
                                    continue;
                                case 229559662:
                                    z2 = false;
                                    break;
                                case 293148222:
                                    if (yo.H3T(jID_t)) {
                                        str2 = "ۥۡۦ۟ۥۚۙۚ۬ۖۜۜۘ۫ۖۦ۫۫ۚۥۘ";
                                        break;
                                    } else {
                                        str2 = "ۥۜۨۦۥۘۡۖۘۘۡۦۡۘۚۚۗۤۦۜۘۤۧۡۘ";
                                        continue;
                                    }
                            }
                        }
                        break;
                    case 1791468369:
                        str = "ۨۙۘۘۙۡ۠ۛۨۖۘۢۙۦۗۖۨۘۚۙۜۘۘۙۨۘۡۥۖۘ";
                        continue;
                    default:
                        continue;
                }
            }
            z2 = true;
            String str3 = "ۧۧۖۘۚۤ۠۫ۙۛۧۘ۠ۜۚۨۤۖۜۨ";
            while (true) {
                switch (str3.hashCode() ^ 1989136683) {
                    case -1170085182:
                        return "";
                    case -498090774:
                        return charSequence;
                    case -358149362:
                        str3 = "ۜ۫۫ۛۥۢۨۖۖۛ۟ۖۨۖۚۥۛۡۘۡ۠ۛ";
                        break;
                    case 1684196633:
                        if (!z2) {
                            str3 = "۟ۚۘۡۙۖۡۚۥۘۧۖۘۘۚۥۨ";
                            break;
                        } else {
                            str3 = "ۘۨۖۘۤۨۧۥۜۡۘ۫ۚ۫۟ۦۡۘۘۦۜۘ";
                            break;
                        }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return charSequence;
        }
    }

    public static String pNotifi(C16740tZ r4, String str) {
        boolean z2;
        try {
            String jID_t = dep.getJID_t(r4.A11.A00);
            String str2 = "ۧۚۨۘۗۙۦۧۙۘۘۤۤۜۚۢۘ";
            while (true) {
                switch (str2.hashCode() ^ 1925292477) {
                    case -332307229:
                        str2 = "ۗ۫ۡۧۨۧۙۜۜۘ۫ۘۡۘۢۢۛۛۘۘۚۥۦۘۥۚۥ";
                        continue;
                    case -76629782:
                        String str3 = "ۢ۬ۛۛۙۤ۟ۖۘۖۜۖۘۤۧ";
                        while (true) {
                            switch (str3.hashCode() ^ -461398643) {
                                case 246051274:
                                    break;
                                case 695340501:
                                    str3 = "ۦ۠ۧۚۛۨۙۨۘۘۚ۠۠ۗ۠ۘۛۙۨۗ۟ۜ۟ۜ۬ۡ۬ۙ";
                                    continue;
                                case 836521192:
                                    z2 = false;
                                    break;
                                case 1806193914:
                                    if (yo.H3T(jID_t)) {
                                        str3 = "ۜۖۜۘۘ۠ۗۚۥۙۡۙۥۘۡۧۚۤۥۨ۠ۖۡ";
                                        break;
                                    } else {
                                        str3 = "۬ۗۥۜۦۦۗ۟ۡۘ۟ۦۙۜ۟ۙ";
                                        continue;
                                    }
                            }
                        }
                        break;
                    case 110611425:
                        break;
                    case 802586650:
                        if (LockUtils.isJIDLocked(jID_t)) {
                            str2 = "ۦۚ۟ۜۤۜۛۖۗۗ۠ۗ۠۬۬۬ۢۨۘۖ۟۠ۧۤۥۘ";
                            break;
                        } else {
                            str2 = "ۙۗۢۡۦۖۙ۬۠ۜۚۘۗۛۘۘ";
                            continue;
                        }
                    default:
                        continue;
                }
            }
            z2 = true;
            String str4 = "۫۟۟ۨۖۦۛۦ۟ۦ۟ۖ۟ۙۖۥۙۘ۫ۛ۠۠ۙۛ";
            while (true) {
                switch (str4.hashCode() ^ 2036562834) {
                    case -581438857:
                        return "";
                    case 450430511:
                        str4 = "ۘۜ۬ۜۚ۟ۤ۬ۨۦۦۘۤۖۧۘۚ۠۟";
                        break;
                    case 1900589504:
                        return str;
                    case 1922001890:
                        if (!z2) {
                            str4 = "ۦۤۨۘۙ۟ۖ۫ۖۜۨۛۡۘۦ۟ۖۘۙ۬۟ۡۖ۠ۨۧۜ۫ۦۗ";
                            break;
                        } else {
                            str4 = "۟۟ۘۘۧۘۘۘۛۡۥۡ۟ۙ۬ۚۖۘ";
                            break;
                        }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public static void pageDescColor(View view) {
        String str = "۫ۧۦۦۨ۟ۤۚۨۘ۟۬ۜۘ۫ۖۥ";
        while (true) {
            switch ((str.hashCode() ^ 655) ^ 726543099) {
                case 469384129:
                    String str2 = "ۚۧۘۘۢۚۥۙۚۗۥۘۨۘۘۥۜۨۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1366658110) {
                            case -1011432476:
                                if (view != null) {
                                    str2 = "ۗۚۘ۟ۡۢ۬۬ۥۘۗۡۨۡۢۜۘۜۤۙۦ";
                                    break;
                                } else {
                                    str2 = "ۗ۫ۛۧۙۛۦۜ۠ۦۢۖۚۦۤ";
                                    break;
                                }
                            case -117365727:
                                str = "ۤۚۜۘۢۛۢۙۘۦ۟ۚ۠ۛ۬ۨۘۖۙۥۧۜ۠";
                                continue;
                            case 1935099248:
                                str = "ۡۜۡۘۙ۠ۨۘۡۛ۬ۨۡۗۤۗۢۜۗۡۙۢۥۤۗۗ";
                                continue;
                            case 2043623332:
                                str2 = "ۗۛ۠ۗ۫ۙ۟ۗۡۘ۬ۨۨۖۙۚ";
                                break;
                        }
                    }
                    break;
                case 1400392845:
                case 1622068299:
                    return;
                case 1869231744:
                    view.post(new u(view, 0));
                    str = "ۛۢ۠ۢۡۜۘۚ۫ۗۛۧۜۢۥ۟ۡۛۖۘۥۖۤ";
                    break;
                case 1982003436:
                    str = "ۚۨۧۘۙۤۢۧۚۧۤۙۜۘۥۚۗ";
                    break;
            }
        }
    }

    public static void paintDelIcon(TextView textView) {
        Drawable drawable = null;
        String str = "ۘۗۖۨۢۙۥ۠ۧۛۗۘۧۥۧۘۦۡۖ";
        int i2 = 0;
        while (true) {
            switch ((str.hashCode() ^ 970) ^ -2092384611) {
                case -1465879868:
                    ColorStore.f510q = yo.getResColor("conversation_divider_text");
                    str = "۠۠ۤۨۖۨۡ۬ۚۘ۫ۘۘۚۘ۫۟ۢۡۘۘ۟ۚ";
                    break;
                case -769221190:
                    drawable.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                    str = "ۘۘۦۘۘۤۢۡۦ۠ۧۘۗ۬ۡۥۙۥۗ";
                    break;
                case -568527339:
                    String str2 = "۫ۤۗۧۢۨۘۡۚۚ۠ۧۥۢ۟ۢۧۘۖ۟۟ۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 111339002) {
                            case -1737602206:
                                str = "ۖۗۨۘۢۚۡۘۗۨ۬ۚۜۧۘۚۢۨۘۙۢۜ";
                                continue;
                            case -492316091:
                                str = "ۘۘۦۘۘۤۢۡۦ۠ۧۘۗ۬ۡۥۙۥۗ";
                                continue;
                            case -214481662:
                                if (drawable == null) {
                                    str2 = "ۚۗۛۗ۫ۛۘ۬ۖۘۦۙۦۘۧۢۦۘۤۜۦۘۥۦۖۘ۟۟ۜۘۛۚۘ";
                                    break;
                                } else {
                                    str2 = "ۗ۠ۖۡۜ۬ۨۥۖۘ۫ۤ۠ۧۛۡۛ۠۠۬۠ۡۘ";
                                    break;
                                }
                            case 501412807:
                                str2 = "ۧ۬ۧۙۜۚۙۧ۬ۘۥۡ۠ۗ۫۫ۢۦۘۤ۠۫ۚ۠ۛ";
                                break;
                        }
                    }
                    break;
                case -119247549:
                    str = "ۖ۬ۦۢۧۘۢ۠ۚۜۜۖۥۤۛۗۨۙ۟۬ۢۨ";
                    break;
                case 140921886:
                    drawable = textView.getCompoundDrawables()[0];
                    str = "ۦۥۘۘۨۘۖ۠۬ۖۨۘۙۥۡۘۘ";
                    break;
                case 494296555:
                    String str3 = "ۖۢ۠۟ۡۘ۫ۤ۫ۢۘۛۛۦۘۗۛۡۥۡۛ۠";
                    while (true) {
                        switch (str3.hashCode() ^ 155860607) {
                            case -1581788337:
                                str3 = "ۤ۟ۖۘۢۖ۬ۜ۟ۘۘۗۢۦۘۨۛ۫ۨۦۛ";
                                break;
                            case -1181347393:
                                str = "۟ۙۖۘۗۘۡ۟ۚۖۘۤۛۨۦۢۦۘۙۖ۠ۧۛ۬";
                                continue;
                            case -1121137639:
                                if (ColorStore.f510q != -11) {
                                    str3 = "ۙۡۜۘۡۛۤۛ۬ۗۘۗۨۘۤۚۖۘۗۘۢۨۢۥۗۘ";
                                    break;
                                } else {
                                    str3 = "ۛۦۥۘ۟ۥۖۘۜۙۨۗۢۙ۬ۙۦ";
                                    break;
                                }
                            case 1991081069:
                                str = "۠۠ۤۨۖۨۡ۬ۚۘ۫ۘۘۚۘ۫۟ۢۡۘۘ۟ۚ";
                                continue;
                        }
                    }
                    break;
                case 1386552701:
                    return;
                case 2001914799:
                    i2 = others.getColor("rvkdmsg_icon_color", ColorStore.f510q);
                    str = "ۧۡ۫ۛ۟ۥۧۘۚۛۜۢۛۜ";
                    break;
            }
        }
    }

    public static void paintForwarded(TextView textView, C16740tZ r8) {
        Drawable drawable = null;
        String str = "۬ۥ۠ۢ۠ۢ۬ۘۘ۫ۥۘۘۦۨۦۙۘ۫۟ۚۘۦۛۢۢۚ";
        int i2 = 0;
        while (true) {
            switch ((str.hashCode() ^ 941) ^ 1763161599) {
                case -1608234889:
                    textView.setTextColor(i2);
                    str = "ۜۥۧ۟ۨۧ۫ۤ۠۬ۖۜۘۚۜۙ۟ۜۖۢۢۘۘۧۦ۠";
                    break;
                case 79425036:
                    String str2 = "۬ۡۖ۟۬ۨۖ۠ۨۘۤۥۦۘۘۜۙ۠ۤ۟۠ۤ۬ۛۖۘۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -704034246) {
                            case -2054295640:
                                str = "۟۫ۨۘۛۢۢۗۥۦۘۧۙ۟ۧ۠ۛ۟";
                                continue;
                            case -1087674756:
                                str2 = "ۥۙۚۖۙۨۘۘۚ۫ۛۙۜۘۦ۬۫ۙۚ۬ۚۛۡۘۜ۬۠۠ۥۥ";
                                break;
                            case 1014039266:
                                str = "۟۟ۘۘۡ۟ۚۧۛۤۛۥۦۥۤۥۧۤۢۜۡۜۘۘۘ۟";
                                continue;
                            case 1518471852:
                                if (drawable == null) {
                                    str2 = "ۤ۫ۡۙۤۢ۟ۡۖۘۤۜۨۗ۠ۚۛۧ۠";
                                    break;
                                } else {
                                    str2 = "ۨ۫۟ۜ۫ۨۤۤۖۘۘۢ۠ۖۧۨۧۨۗۘ۟ۙ۟ۤۗۜۘۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1075043909:
                    drawable.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                    str = "۟۫ۨۘۛۢۢۗۥۦۘۧۙ۟ۧ۠ۛ۟";
                    break;
                case 1101374240:
                    drawable = textView.getCompoundDrawables()[0];
                    str = "۠ۚۗۢۨۘۨۨۘۧ۫ۖۦۥۨۘ";
                    break;
                case 1119153782:
                    str = "۫ۨۡۘۡۢۨۘۡۥۜۖ۟۫ۜۙ۟ۚۨۦ۫ۛۡۘ";
                    break;
                case 1453175403:
                    str = "ۤۙۚۖۙ۫۟ۥۙۦۚ";
                    break;
                case 2021444958:
                    i2 = f(r8);
                    str = "ۘۗۖ۟ۗۦ۫ۡۧۘ۬ۥۜۙۨۙۡۘۗ۠ۧۧ";
                    break;
                case 2110056217:
                    return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        r0 = "ۥۧۚ۫۫ۚۚۢۘۥۗۦۙۖۡۚۥۘۜۧۚ۟ۘۗۛ۫ۥ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void playBtnVNColor(android.widget.ImageView r6) {
        /*
            r5 = -11
            r1 = 0
            java.lang.String r0 = "ۤۗۡۚۨۤۚۗۛۦ۟ۗۧۙۖۙ۠ۗ"
        L_0x0005:
            int r2 = r0.hashCode()
            r3 = 231(0xe7, float:3.24E-43)
            r4 = 690138187(0x2922ac4b, float:3.6120666E-14)
            r2 = r2 ^ r3
            r2 = r2 ^ r4
            switch(r2) {
                case -1904864906: goto L_0x0017;
                case -677838365: goto L_0x003c;
                case -208113285: goto L_0x0063;
                case 1111782382: goto L_0x0020;
                case 2090209444: goto L_0x005b;
                case 2103997560: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            java.lang.String r0 = "۫ۥۥۘۘۚۨۘۢۙۤۨۗۡۥۧ۟۫۠ۨ"
            goto L_0x0005
        L_0x0017:
            java.lang.String r0 = "btn_voice_color_chat_picker"
            int r1 = com.obwhatsapp.youbasha.others.getColor(r0, r5)
            java.lang.String r0 = "ۢۗۜۘۤۙۛۘۖ۫ۨۗ۬۠ۙۨۖۗۡۘ"
            goto L_0x0005
        L_0x0020:
            r2 = -1943369497(0xffffffff8c2a88e7, float:-1.3137521E-31)
            java.lang.String r0 = "ۧۤۖۘۨۦۘۙۨۜۘۚ۫ۦۘۨ۠ۥۥ۟ۜۧۥۧۘۘ۠ۚ"
        L_0x0025:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1883440251: goto L_0x0039;
                case -1612667091: goto L_0x002e;
                case 315159586: goto L_0x0034;
                case 790075406: goto L_0x004a;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0025
        L_0x002e:
            java.lang.String r0 = "ۘۛۡۘ۠ۡ۟۫ۦۧۗۚۨۘۧۢۛۡۢ۫ۨۚۧۨۘۗ۬ۘۥ"
            goto L_0x0025
        L_0x0031:
            java.lang.String r0 = "ۦ۟ۙۨۚۜۘ۬ۘۦۘۜۜ۟ۦۢۧۢۦۦ۠ۛۖۘۘۡۨۡ۠۠"
            goto L_0x0025
        L_0x0034:
            if (r1 == r5) goto L_0x0031
            java.lang.String r0 = "ۗۡۘۖۛۦۜۧۘۘۘۛۡۗ۬ۖۘ۫۫۬ۡۖۡۡۤۤ"
            goto L_0x0025
        L_0x0039:
            java.lang.String r0 = "ۧ۫ۛ۟ۡۚۗ۬ۤۚۖۙۥۨۘ۟ۗۡۥ۬ۙ"
            goto L_0x0005
        L_0x003c:
            r2 = -598168229(0xffffffffdc58ad5b, float:-2.43956805E17)
            java.lang.String r0 = "ۙۧۧۜ۟ۖۡۖۖۘۨۘۦ۟ۚۜ۟ۚۡۨۘۖۘۛۤ"
        L_0x0041:
            int r3 = r0.hashCode()
            r3 = r3 ^ r2
            switch(r3) {
                case -1744397869: goto L_0x0055;
                case -727336770: goto L_0x0050;
                case 949136817: goto L_0x004a;
                case 1483577950: goto L_0x0058;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x0041
        L_0x004a:
            java.lang.String r0 = "ۥۧۚ۫۫ۚۚۢۘۥۗۦۙۖۡۚۥۘۜۧۚ۟ۘۗۛ۫ۥ"
            goto L_0x0005
        L_0x004d:
            java.lang.String r0 = "ۗۛ۟۬ۧۘۚ۠ۚۧۨۦۦۗۨۥ۫"
            goto L_0x0041
        L_0x0050:
            if (r6 == 0) goto L_0x004d
            java.lang.String r0 = "ۛ۫ۨۥ۟۫ۛۨۥۘۖۤۗۦۘۧ۫ۢۜۘۖۛۥ"
            goto L_0x0041
        L_0x0055:
            java.lang.String r0 = "ۘۦۢۡۗۥ۠ۨۥۥۘۗۦۗۦۘ"
            goto L_0x0041
        L_0x0058:
            java.lang.String r0 = "ۤ۬ۧۦ۟۟ۢ۠ۥۘۦۜۦۤ۠۫۫ۜۦۘۗۛۥۘۧۘ۟ۥ"
            goto L_0x0005
        L_0x005b:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r6.setColorFilter(r1, r0)
            java.lang.String r0 = "ۥۧۚ۫۫ۚۚۢۘۥۗۦۙۖۡۚۥۘۜۧۚ۟ۘۗۛ۫ۥ"
            goto L_0x0005
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.playBtnVNColor(android.widget.ImageView):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        r0 = "ۥ۬ۘۖۥۘۤۖۙۗۧ۫ۧۧۥۘ۠ۚۧ۟ۗۧۥۜۦۘۧ۫ۡ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int rightlayID(int r6) {
        /*
            r2 = 0
            java.lang.String r0 = "ۛ۠ۜۘۥۖۡ۫ۛۖ۫۠ۧ۬ۤۡۘ۫ۙ۫ۘۨۚ"
            r1 = r2
            r3 = r2
        L_0x0005:
            int r2 = r0.hashCode()
            r4 = 679(0x2a7, float:9.51E-43)
            r5 = -1976541929(0xffffffff8a305d17, float:-8.4916E-33)
            r2 = r2 ^ r4
            r2 = r2 ^ r5
            switch(r2) {
                case -1859314042: goto L_0x003d;
                case -1754248630: goto L_0x001b;
                case -1293962077: goto L_0x0067;
                case -1132168953: goto L_0x0014;
                case 5097535: goto L_0x0017;
                case 309881518: goto L_0x0039;
                case 1436792778: goto L_0x005b;
                case 1564290686: goto L_0x0060;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0005
        L_0x0014:
            java.lang.String r0 = "ۗۚۖۥۡۖۘۧ۬ۨۘۘۥۥ۬ۖۚۖ۠ۗ"
            goto L_0x0005
        L_0x0017:
            java.lang.String r0 = "۬ۛۥۛۡۜۥۘۗۤۜۖۦۦ۟ۡۥۧۘ"
            r3 = r6
            goto L_0x0005
        L_0x001b:
            r2 = 1006146803(0x3bf894f3, float:0.0075861155)
            java.lang.String r0 = "ۦۦۧۘۖۡۥۘۘۜۘۘۥۧۤۥۙۡۨۤۢ"
        L_0x0020:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -1711489231: goto L_0x0029;
                case -513197703: goto L_0x0064;
                case -407910309: goto L_0x002f;
                case 769650528: goto L_0x0036;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0020
        L_0x0029:
            java.lang.String r0 = "ۜۥۗۧۧۤۦ۟ۥ۬ۙۘۡۙ۫"
            goto L_0x0005
        L_0x002c:
            java.lang.String r0 = "۫ۨۙۜۢۜۘۢۨۦۤ۠ۖۧ۠ۛ"
            goto L_0x0020
        L_0x002f:
            boolean r0 = f532u
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "ۢۚۘ۟۠ۖۦۜ۬ۧۜۥۘۙۤۜۘ۠ۦۗۖۧۢۡۤ"
            goto L_0x0020
        L_0x0036:
            java.lang.String r0 = "۠ۡۜۘ۫ۗۖ۫۬ۡۘۨۦۦۘۜۙۨۘ"
            goto L_0x0020
        L_0x0039:
            java.lang.String r0 = "ۙ۬ۡۧۦ۫۠ۤۘۛۧ۟ۚۘۜۨۚۜ۠ۢ۟ۤۢۨ"
            r3 = r6
            goto L_0x0005
        L_0x003d:
            r2 = 569651824(0x21f43270, float:1.6547434E-18)
            java.lang.String r0 = "ۡۨ۫۟ۦۦۡۚۢۦۚۥۘۛ۟ۗ"
        L_0x0042:
            int r4 = r0.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case 773564820: goto L_0x0058;
                case 1038300750: goto L_0x004b;
                case 1738175923: goto L_0x0064;
                case 2129639637: goto L_0x0055;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x0042
        L_0x004b:
            boolean r0 = f531t
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "ۚۤ۠ۘ۟ۦۘ۫ۡۜۘ۬۬ۛۗۢ۫ۧۚۥۘۢ۬ۥۚ۠ۘۙۛ"
            goto L_0x0042
        L_0x0052:
            java.lang.String r0 = "ۨۧۗۖۙۡ۟۫ۦۘۜۘ۬ۗۢۚ"
            goto L_0x0042
        L_0x0055:
            java.lang.String r0 = "۠ۚۡۙۙۥۘۢۡ۟ۚۢۘۘۤ۠ۨۘۥ۬ۛۜۗۜۘ۟ۧ۟ۤۢ"
            goto L_0x0042
        L_0x0058:
            java.lang.String r0 = "ۘۡۜۛۢۡۘۧۚۨۘۤۖۧۘۥۗۧۚۖ"
            goto L_0x0005
        L_0x005b:
            int r1 = B
            java.lang.String r0 = "ۛۗ۬۬ۨۨۤۙ۬ۖۙۜۤۤۨۘۗۦ۫"
            goto L_0x0005
        L_0x0060:
            java.lang.String r0 = "ۥ۬ۘۖۥۘۤۖۙۗۧ۫ۧۧۥۘ۠ۚۧ۟ۗۧۥۜۦۘۧ۫ۡ"
            r3 = r1
            goto L_0x0005
        L_0x0064:
            java.lang.String r0 = "ۥ۬ۘۖۥۘۤۖۙۗۧ۫ۧۧۥۘ۠ۚۧ۟ۗۧۥۜۦۘۧ۫ۡ"
            goto L_0x0005
        L_0x0067:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.rightlayID(int):int");
    }

    public static int seekBarVNColor(int i2) {
        String str = "۫ۤۖۨۙۜۚۖۖۦۥ۟ۗۚ۬ۚۤۛ";
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            switch ((str.hashCode() ^ 195) ^ -914683326) {
                case -1658084073:
                    str = "ۚۨۡۘۥ۠ۨۘۥۥۛ۫۠ۥۚۖۙۗۗۨۦۖۘ۬ۚ";
                    i4 = i2;
                    break;
                case -272714352:
                    String str2 = "ۗۜ۠ۡ۟ۡۘۨ۫ۡۘۤ۠ۡۤۥۧۘۗۥۡۖۡۡ";
                    while (true) {
                        switch (str2.hashCode() ^ 1137702609) {
                            case -1933407627:
                                str = "۟ۙۧۥۦۨۘۜۤۚ۬ۨۨۚۢۖ";
                                continue;
                            case -1549081013:
                                str = "ۢۦۜۘۘ۟ۡۘۡ۟ۢۤۘۦ۠ۜۛۙۨۘۙ۬ۗ";
                                continue;
                            case -1482294167:
                                str2 = "ۘ۬ۦۘۖ۠ۘۘۖۦۘۖۤۥۤۙۙۗۘۨۘۥۖ۬ۘۗۘۘ";
                                break;
                            case 621205729:
                                if (i5 != -11) {
                                    str2 = "۬ۛۤۗۖۦۘ۬۠ۢ۬ۛۥۛۢۘۘۛ۟ۥۘۜۙ۫ۖۙۜۘ۬۬ۛ";
                                    break;
                                } else {
                                    str2 = "ۖۚۧۥۘ۬۫ۧۥۨ۫ۖ۬ۤ";
                                    break;
                                }
                        }
                    }
                    break;
                case -107985756:
                    i5 = others.getColor("seekbar_color_chat_picker", -11);
                    str = "ۥۥۘۤۦۧۢۘۚۡ۠۟ۧۡ۬ۙ۫۬";
                    break;
                case 53034248:
                    return i4;
                case 1057434557:
                    str = "ۤۜۖۦۗۨۜۘۘۢۛۢۨۨۘۚۥۢۜۨۖ";
                    break;
                case 1352567717:
                    str = "۫۬ۛۦۡۘۙ۬۫ۧۦۜۘۙۜۡۤ۬ۙۘۦ۠ۢۧ۟ۘۤۦۘ";
                    i4 = i3;
                    break;
                case 1431874671:
                    str = "ۚۦۤۧ۫ۧۙۡ۫۬ۥ۫ۤۥ۟";
                    i3 = i5;
                    break;
                case 2034487239:
                    str = "۫۬ۛۦۡۘۙ۬۫ۧۦۜۘۙۜۡۤ۬ۙۘۦ۠ۢۧ۟ۘۤۦۘ";
                    break;
            }
        }
    }

    public static void sendStkrShowConfirmation(View view, View.OnClickListener onClickListener) {
        String str = "ۥۥۥۘۡۗۡ۫ۡۦۨ۟ۛۡۛۛۢۦۘ۠ۦۚۨۛۤۢۡۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 258) ^ 1995372326) {
                case -1923071513:
                    str = "ۗۗۥۘۜۘۖۘۧۢۡۚۧۖ۟۠۫ۢ۟ۧ";
                    break;
                case -1589780368:
                    return;
                case -1091419574:
                    str = "ۢۖۙ۫۬ۢۡ۫ۨ۟ۧۥۙۧۥۘۙۥۗۨۧۙۥۘ";
                    break;
                case -408038992:
                    String str2 = "ۢ۟ۛۤۖ۬ۡ۫ۘۘۗ۟ۚۘۜ۟";
                    while (true) {
                        switch (str2.hashCode() ^ -304043530) {
                            case -1892966273:
                                str2 = "ۛۢۨۚۜ۬ۧۙۤۛۚۗۢۘ۫۠ۗۘۘ۠ۧ۬ۙۨۘ";
                                break;
                            case -1401157639:
                                if (!shp.getBoolean("stkr_wantsendconfirmation", true)) {
                                    str2 = "ۗۗ۠۟ۘۘۨۗۧ۫۠ۡۘۚۚۦۤۡۡۚۡۘ";
                                    break;
                                } else {
                                    str2 = "ۨۨ۠۬ۗ۬ۙ۬۠ۛ۫ۢۨ۫ۜۤۤۜ";
                                    break;
                                }
                            case -1122749864:
                                str = "ۖۗۥۖۘۨ۟۫۬ۘ۬ۦۘ۬ۦۗۛ۬ۨۘۦۨ۠ۖۡۗۦۛۖۘ";
                                continue;
                            case 502710711:
                                str = "۫ۜۨۘ۟ۧۢۦۖۥۘۘۙۖۘ۟ۥۗۧ۠ۦ۬ۥۜۤۡۖۦ";
                                continue;
                        }
                    }
                    break;
                case 924349178:
                    str = "۫۠ۧۙۙۜۚۢۗۧۧۘۘۚۦۥ";
                    break;
                case 1674665297:
                    view.setOnClickListener(new b(view, onClickListener, 3));
                    str = "۟ۦۛۤۨۡۧ۫ۤۖۡۢ۟ۛ۟";
                    break;
                case 1723066747:
                    view.setOnClickListener(onClickListener);
                    str = "ۗۗۥۘۜۘۖۘۧۢۡۚۧۖ۟۠۫ۢ۟ۧ";
                    break;
            }
        }
    }

    public static void setCInPicResize(ViewGroup viewGroup) {
        View view = null;
        String str = "ۧۦۚ۬ۤۙ۬ۙۖۘۧ۫۟ۗۖۙ۟ۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 954) ^ -950939659) {
                case -1798198094:
                    str = "ۧۛ۟ۡۢۡ۟ۤۨۘۜۛۙۧۘۘۘ۫ۨۘۜ۫۫۫ۙۗ";
                    break;
                case -1559073747:
                    view = viewGroup.findViewById(f536y);
                    str = "۫ۧۥۘۢۧۨۡ۟ۛۡۗۜۘۘ۠ۡۤۤۘۖۥۦۘ";
                    break;
                case -356430008:
                    view.getLayoutParams().height = f534w;
                    str = "ۘۡۡۘۡۖۧۘ۬ۧۗۛۧۤۚ۟ۖۘۢۧۧ۟ۚۛ۬ۨۧ";
                    break;
                case 130149320:
                    String str2 = "ۗۗۖۜۛۥۘۖ۫ۥۗ۫ۘۘۙۡۜۨۧۡۘۦ۠ۢ";
                    while (true) {
                        switch (str2.hashCode() ^ -1275896332) {
                            case -1609261426:
                                if (f532u) {
                                    str2 = "ۡۙۘۧۙۖۦۤۙ۬۬ۜۗ۠ۘۨ۟ۤۖۨۘۤۦۨۘ";
                                    break;
                                } else {
                                    str2 = "۫ۚۙۤۧۥۘۗۤۙۗ۬۠ۧ";
                                    break;
                                }
                            case 355482492:
                                str2 = "ۜۗ۫ۦۥۘۥۙۚۚۨۧۗۜۥ۫ۧۦۘ";
                                break;
                            case 1007501062:
                                str = "۠ۨۘ۟ۦۢۘۖۚۚۗۨۘۨۖۛۗ۫ۡۘ۫ۤۛۡۚۨۘۜۙ۟";
                                continue;
                            case 1495903713:
                                str = "ۧۤۡۘ۫ۨۚ۬ۛۘۢۘۜۘۙۥۘۘۨۧۢۙۖۤ";
                                continue;
                        }
                    }
                    break;
                case 748179422:
                case 1089124496:
                    return;
                case 1618664116:
                    String str3 = "۠۠ۧۧۨۧۡ۠۫۫ۡۧ۬ۙۡۘۡۨۜ۬ۙۚ۠ۛۨۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 696249393) {
                            case -1157674354:
                                str = "ۤۗ۫۬ۥۥۥ۬ۜۘۗۘ۟۫۟ۢ";
                                continue;
                            case -951674694:
                                if (view == null) {
                                    str3 = "ۚۛۡۦۚۙۢۗ۠۬ۙۡۘۙ۟۬۫ۜ۠";
                                    break;
                                } else {
                                    str3 = "ۥۖ۠ۗۛۤۧ۠ۦۧۧۥۚ۠ۡۡۨ";
                                    break;
                                }
                            case -318931134:
                                str = "ۛۚۤۛۜۨۢۢ۬ۚ۟۫ۙ۠ۥۘ۟ۖۛۧ۬ۦۘۚۡۘۨۨ۫";
                                continue;
                            case 467260552:
                                str3 = "ۨۜۥۛۛ۬ۘۦۘۧۗۘۖۘۚۙ۟ۨۘۖۖۦۘۢ۠ۤ";
                                break;
                        }
                    }
                    break;
                case 1644899243:
                    view.getLayoutParams().width = f534w;
                    str = "ۛۚۤۛۜۨۢۢ۬ۚ۟۫ۙ۠ۥۘ۟ۖۛۧ۬ۦۘۚۡۘۨۨ۫";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x00ec A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x01de A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0184 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setCPic(android.view.ViewGroup r6, X.C16740tZ r7, int r8) {
        /*
            r5 = 1
            X.1Vw r0 = r7.A11     // Catch:{ Exception -> 0x00eb }
            boolean r3 = r0.A02     // Catch:{ Exception -> 0x00eb }
            r1 = 390271672(0x174312b8, float:6.3031525E-25)
            java.lang.String r0 = "ۘۙ۫ۛۦۛۘۘ۟ۖۘۧۘۗۦۖۘۖۘۘ"
        L_0x000a:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x00eb }
            r2 = r2 ^ r1
            switch(r2) {
                case -1716699325: goto L_0x0032;
                case 162547534: goto L_0x001e;
                case 1262463499: goto L_0x001b;
                case 2090985889: goto L_0x0013;
                default: goto L_0x0012;
            }     // Catch:{ Exception -> 0x00eb }
        L_0x0012:
            goto L_0x000a
        L_0x0013:
            if (r3 == 0) goto L_0x0018
            java.lang.String r0 = "ۥۨۦۧۧۡۙ۫ۧۖۧۛۘۡۤۖ۬ۖۖۥۘ۫ۛۦۘ"
            goto L_0x000a
        L_0x0018:
            java.lang.String r0 = "ۧ۬ۦۧۧ۫ۡ۟ۘۗ۠ۡۘ۬ۚۙ"
            goto L_0x000a
        L_0x001b:
            java.lang.String r0 = "ۘ۫۫۠ۖ۫۫ۡۜۘۦ۠ۘۘ۫۬۠"
            goto L_0x000a
        L_0x001e:
            java.lang.String r0 = com.obwhatsapp.yo.dep.myNum     // Catch:{ Exception -> 0x00eb }
            r2 = r0
        L_0x0021:
            r1 = -1020909294(0xffffffffc3262912, float:-166.16043)
            java.lang.String r0 = "ۤ۬ۗۦۥۗۙۢۙۢۨۖۘۨ۬ۦۘۢۢۗۜۢ۟۫۟ۨ۠ۥۘۘ"
        L_0x0026:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x00eb }
            r4 = r4 ^ r1
            switch(r4) {
                case -824979359: goto L_0x002f;
                case -152474272: goto L_0x00f1;
                case 276040810: goto L_0x00f9;
                case 2071187814: goto L_0x0206;
                default: goto L_0x002e;
            }     // Catch:{ Exception -> 0x00eb }
        L_0x002e:
            goto L_0x0026
        L_0x002f:
            java.lang.String r0 = "۬ۡۨۛۤۛۜۛۥۘ۬ۨۙۢۦۚۨۗ۫ۦۡۥ"
            goto L_0x0026
        L_0x0032:
            boolean r1 = com.obwhatsapp.yo.yo.getGroupBoolean()     // Catch:{ Exception -> 0x00eb }
            r2 = 1927159426(0x72de1e82, float:8.799047E30)
            java.lang.String r0 = "ۡ۟ۦۘ۟ۜۧۘۢۖۖ۬ۨۧۙۘۤۦۗۢۨۛ"
        L_0x003b:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x00eb }
            r4 = r4 ^ r2
            switch(r4) {
                case -2134810891: goto L_0x0044;
                case 208743620: goto L_0x006d;
                case 640138783: goto L_0x00a7;
                case 642576497: goto L_0x0072;
                default: goto L_0x0043;
            }     // Catch:{ Exception -> 0x00eb }
        L_0x0043:
            goto L_0x003b
        L_0x0044:
            X.0rv r0 = r7.A0B()     // Catch:{ Exception -> 0x00eb }
            java.lang.String r0 = com.obwhatsapp.yo.dep.getJID_t(r0)     // Catch:{ Exception -> 0x00eb }
            r2 = -1868834734(0xffffffff909bd852, float:-6.1470014E-29)
            java.lang.String r1 = "ۜۢ۠ۘۢۡۘ۫ۙ۫۠ۗۙۗۘۘۡۧۡ"
        L_0x0051:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x00eb }
            r4 = r4 ^ r2
            switch(r4) {
                case -1204768893: goto L_0x007d;
                case -1111173019: goto L_0x005a;
                case -212231180: goto L_0x008f;
                case -87182186: goto L_0x0078;
                default: goto L_0x0059;
            }     // Catch:{ Exception -> 0x00eb }
        L_0x0059:
            goto L_0x0051
        L_0x005a:
            r2 = -471647487(0xffffffffe3e33b01, float:-8.383325E21)
            java.lang.String r1 = "ۥۛۨۜ۬ۜۘۛۚۡۗ۬ۘۘۦۥۨ"
        L_0x005f:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x00eb }
            r4 = r4 ^ r2
            switch(r4) {
                case -1863687121: goto L_0x0068;
                case -1832860362: goto L_0x008c;
                case -1542347215: goto L_0x0083;
                case 1192056319: goto L_0x008f;
                default: goto L_0x0067;
            }     // Catch:{ Exception -> 0x00eb }
        L_0x0067:
            goto L_0x005f
        L_0x0068:
            r2 = r0
            goto L_0x0021
        L_0x006a:
            java.lang.String r0 = "۟ۜۜۘ۫ۙۖۘۖ۬ۥۢۛ۫۟۫ۦۘ۬ۥۡۖۘۛۥۖۧۘ"
            goto L_0x003b
        L_0x006d:
            if (r1 == 0) goto L_0x006a
            java.lang.String r0 = "ۜۢۤۚۨۛۥۜۡۧۖۛ۠ۙۙۡۥ۠ۦۧۡ"
            goto L_0x003b
        L_0x0072:
            java.lang.String r0 = "ۢۗۨۘۧۡۖۥ۫ۚۦ۟ۗۗۤۥۘۘۖۖ"
            goto L_0x003b
        L_0x0075:
            java.lang.String r1 = "ۙۖۨۘۘ۫ۢۢۧۖۘۖۦۛۗۚۥۘۢۙۥۘۙۨۘۥ۬ۧۨ۠ۗ"
            goto L_0x0051
        L_0x0078:
            if (r0 == 0) goto L_0x0075
            java.lang.String r1 = "ۦۨۗۖۦۥۘۡۘۧۘ۟۟ۖۨۨۥ۟۬ۜ۠ۤ۬۟ۚۦۜ۬ۤ"
            goto L_0x0051
        L_0x007d:
            java.lang.String r1 = "ۖۚۧ۬۟ۜ۫ۜۛۖۙۗۨ۟ۛۖۧ۠ۛ۫ۜۥ۠۬ۡ۫ۡ"
            goto L_0x0051
        L_0x0080:
            java.lang.String r1 = "ۖۛۢۛۚۥۘ۠ۥۧۙ۠ۜۘ۟ۘ۫۫ۧۦ"
            goto L_0x005f
        L_0x0083:
            boolean r1 = r0.isEmpty()     // Catch:{ Exception -> 0x00eb }
            if (r1 == 0) goto L_0x0080
            java.lang.String r1 = "ۨ۬۫ۛۧۖۘۚ۠۫۟ۦۘۖۨۘۘۙ۟ۛۦۥۨۘۘۘۨ"
            goto L_0x005f
        L_0x008c:
            java.lang.String r1 = "ۛ۫ۜۘۢ۠ۡۚۧۚۖ۠ۢۙ۫ۥۘۦ۫ۜۘۘۡۜۤۛ۠"
            goto L_0x005f
        L_0x008f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00eb }
            r0.<init>()     // Catch:{ Exception -> 0x00eb }
        L_0x0094:
            java.lang.String r1 = com.obwhatsapp.yo.yo.getCurr_sJid()     // Catch:{ Exception -> 0x00eb }
            r0.append(r1)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r1 = "@s.whatsapp.net"
            r0.append(r1)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00eb }
            r2 = r0
            goto L_0x0021
        L_0x00a7:
            X.1Vw r0 = r7.A11     // Catch:{ Exception -> 0x00eb }
            X.0rv r0 = r0.A00     // Catch:{ Exception -> 0x00eb }
            java.lang.String r0 = com.obwhatsapp.yo.dep.getJID_t(r0)     // Catch:{ Exception -> 0x00eb }
            r2 = 912489117(0x36637a9d, float:3.3897006E-6)
            java.lang.String r1 = "ۜۦۦۛۦۜ۠ۖۨۘۘۡۥۘۘۙۨۚ۠ۢۧ۫۬"
        L_0x00b4:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x00eb }
            r4 = r4 ^ r2
            switch(r4) {
                case -1851099886: goto L_0x00e5;
                case -364100799: goto L_0x00c3;
                case 603952137: goto L_0x00c8;
                case 1606613902: goto L_0x00bd;
                default: goto L_0x00bc;
            }
        L_0x00bc:
            goto L_0x00b4
        L_0x00bd:
            java.lang.String r1 = "ۦۥ۠ۤۗۤۤ۠ۡۘۛۢ۫ۨ۟ۥۘۘۙۦۧۥۖۘ۟ۨۗ"
            goto L_0x00b4
        L_0x00c0:
            java.lang.String r1 = "ۨۡۗۨۘۗۜۜۘۡ۠ۧۖۛۜۘۙۥۜۘۥ۠۬"
            goto L_0x00b4
        L_0x00c3:
            if (r0 == 0) goto L_0x00c0
            java.lang.String r1 = "ۤۖۘۘۚۦۧۘۖۛۛ۬ۗ۫ۗۛۘۗۛۢۧۦ۠۠۬۫ۚ۠ۚ"
            goto L_0x00b4
        L_0x00c8:
            r2 = -390894526(0xffffffffe8b36c42, float:-6.778405E24)
            java.lang.String r1 = "ۥۘۥۤۦۧۨۨۗۘۦۢۤۜۘۘۢۘۛ۟ۥۚۖۥۛۡۖۖۘ"
        L_0x00cd:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x00eb }
            r4 = r4 ^ r2
            switch(r4) {
                case -1922895801: goto L_0x00d6;
                case 941750493: goto L_0x00e5;
                case 998011758: goto L_0x00dc;
                case 1107212126: goto L_0x0068;
                default: goto L_0x00d5;
            }     // Catch:{ Exception -> 0x00eb }
        L_0x00d5:
            goto L_0x00cd
        L_0x00d6:
            java.lang.String r1 = "ۛۦۜۘ۠ۦ۠ۡۜۜ۟ۜۜۜۘ۬"
            goto L_0x00cd
        L_0x00d9:
            java.lang.String r1 = "ۥۖۡۘۦۜۤۜۨۖ۟ۚۛۤ۠ۦۢ۫ۥۗۥۦۡۗۜۘ"
            goto L_0x00cd
        L_0x00dc:
            boolean r1 = r0.isEmpty()     // Catch:{ Exception -> 0x00eb }
            if (r1 == 0) goto L_0x00d9
            java.lang.String r1 = "۠ۖۚۙ۫ۥۘۨۚۚۗۢۙۡۤۦۨۤۦ۠۫ۦ"
            goto L_0x00cd
        L_0x00e5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00eb }
            r0.<init>()     // Catch:{ Exception -> 0x00eb }
            goto L_0x0094
        L_0x00eb:
            r0 = move-exception
        L_0x00ec:
            return
        L_0x00ed:
            java.lang.String r0 = "۠ۚۦۘۦۛۘ۬ۦۧۢۛ۟ۡ۠ۦۥۨۘ۠ۖ۫ۜۨۧۘ"
            goto L_0x0026
        L_0x00f1:
            boolean r0 = f533v     // Catch:{ Exception -> 0x00eb }
            if (r0 == 0) goto L_0x00ed
            java.lang.String r0 = "۟ۘۡۨۖۦۘۥ۟ۗ۠ۚۘۙۖۘۢۨۜۘۘ۠ۡۘ۠ۦ۬"
            goto L_0x0026
        L_0x00f9:
            int r0 = A     // Catch:{ Exception -> 0x00eb }
            android.view.View r0 = r6.findViewById(r0)     // Catch:{ Exception -> 0x00eb }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x00eb }
            r3 = 514508114(0x1eaac552, float:1.808106E-20)
            java.lang.String r1 = "ۨۙۢۡۘۦۙۚۦۜۘۙۗۦۘۚۖۢۗۚۦ"
        L_0x0106:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x00eb }
            r4 = r4 ^ r3
            switch(r4) {
                case -2056078942: goto L_0x0115;
                case -221659635: goto L_0x010f;
                case 864146717: goto L_0x00ec;
                case 1918661376: goto L_0x011a;
                default: goto L_0x010e;
            }
        L_0x010e:
            goto L_0x0106
        L_0x010f:
            java.lang.String r1 = "ۤۙۛۧۨ۫ۗۜۥۥ۟ۘۢۨۦ۬ۛۖۘ"
            goto L_0x0106
        L_0x0112:
            java.lang.String r1 = "۟ۡۥۘۦۖۡۖۖۨۨ۬ۘۘۗ۫ۨۗۥۤ"
            goto L_0x0106
        L_0x0115:
            if (r0 != 0) goto L_0x0112
            java.lang.String r1 = "ۨ۠۟ۖۧۦۘ۫۠ۜۘ۠۬ۜۦۙۧۚ۫ۘۥۚۛ۟ۧۥ"
            goto L_0x0106
        L_0x011a:
            r3 = -1285914813(0xffffffffb35a7f43, float:-5.0872824E-8)
            java.lang.String r1 = "۠ۛۥۘۗۗۧۘ۬ۚۛۥۦۘۤۙۗۢۥۢ۫۠۫ۛۢۧ"
        L_0x011f:
            int r4 = r1.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -826509259: goto L_0x0134;
                case -483716158: goto L_0x0178;
                case -359677125: goto L_0x0131;
                case 1812882547: goto L_0x0128;
                default: goto L_0x0127;
            }
        L_0x0127:
            goto L_0x011f
        L_0x0128:
            r1 = -1
            if (r8 == r1) goto L_0x012e
            java.lang.String r1 = "ۧۙۖۘۡۢ۟ۜۡۦ۟ۦۡۘۤۜۛۡۛۗ۬ۘۨۥ۫۫"
            goto L_0x011f
        L_0x012e:
            java.lang.String r1 = "۬ۜۜۘۦۗۧۥۚۚۜۧۡۘۤ۟ۙ"
            goto L_0x011f
        L_0x0131:
            java.lang.String r1 = "ۗۧۙ۠ۨۢۢۘۢۦ۟ۤ۬ۢۚ۠۫ۨۢۢ۟"
            goto L_0x011f
        L_0x0134:
            r3 = -1534428151(0xffffffffa48a7c09, float:-6.0058084E-17)
            java.lang.String r1 = "۟ۢۙۛ۫ۨۘ۟ۢ۬ۗ۠ۤۚ۟ۨۘۧۗۦ۟ۢۨۘۗ۟ۛ"
        L_0x0139:
            int r4 = r1.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1441129782: goto L_0x0142;
                case -255338706: goto L_0x0156;
                case 639058164: goto L_0x0168;
                case 1511188217: goto L_0x015b;
                default: goto L_0x0141;
            }
        L_0x0141:
            goto L_0x0139
        L_0x0142:
            r3 = 1027238797(0x3d3a6b8d, float:0.045512725)
            java.lang.String r1 = "ۡۦۧ۟ۚۗۜۗۛۤۜۡۘۡۙ۟ۦۨۘ"
        L_0x0147:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x00eb }
            r4 = r4 ^ r3
            switch(r4) {
                case -1744278732: goto L_0x0168;
                case 779325241: goto L_0x0178;
                case 1238141001: goto L_0x0161;
                case 2131390471: goto L_0x0150;
                default: goto L_0x014f;
            }     // Catch:{ Exception -> 0x00eb }
        L_0x014f:
            goto L_0x0147
        L_0x0150:
            java.lang.String r1 = "ۚ۟ۖۥۧۗ۠ۧۥۘۘۖۘۦ۟ۡۨ۫ۛۛۛ۬ۨۡ"
            goto L_0x0147
        L_0x0153:
            java.lang.String r1 = "ۦۨۗۛۚۗۚۧۡۦۥۛۢۦۖ۟۟ۖۜۘۤ۠ۤ"
            goto L_0x0139
        L_0x0156:
            if (r8 != r5) goto L_0x0153
            java.lang.String r1 = "ۧۘۤۦۦۜ۟ۛ۬ۨۙۢۨ۠ۜۜۧۛۘۛۡۘ"
            goto L_0x0139
        L_0x015b:
            java.lang.String r1 = "ۚۧ۬ۗۥۨۘۡۙ۟ۡ۫ۚۖۢۜۘۨۛۡۘ۫ۖۖۘ۬ۨۖۘ"
            goto L_0x0139
        L_0x015e:
            java.lang.String r1 = "۫۫ۥ۟ۜۘ۠ۡ۠ۡۨۧۧۥ۟ۤۚۚ۬ۢۤ"
            goto L_0x0147
        L_0x0161:
            int r1 = f535x     // Catch:{ Exception -> 0x00eb }
            if (r1 == r8) goto L_0x015e
            java.lang.String r1 = "ۚۤ۠ۦۜۥۘۖۧۨۘۦۡۛۖۛۧۗۦۘۢۘ۫ۗ۟ۡۡۥۙ"
            goto L_0x0147
        L_0x0168:
            int r3 = f535x     // Catch:{ Exception -> 0x00eb }
            r4 = 619222008(0x24e893f8, float:1.0086463E-16)
            java.lang.String r1 = "۬۟ۚ۬ۦ۟ۧۚۡۧۘۨ۫ۨۘۥۚ۬ۥۛۗ۫۠ۗ"
        L_0x016f:
            int r5 = r1.hashCode()     // Catch:{ Exception -> 0x00eb }
            r5 = r5 ^ r4
            switch(r5) {
                case -1952100660: goto L_0x0178;
                case 46532635: goto L_0x019a;
                case 854601724: goto L_0x0193;
                case 1275423976: goto L_0x019d;
                default: goto L_0x0177;
            }     // Catch:{ Exception -> 0x00eb }
        L_0x0177:
            goto L_0x016f
        L_0x0178:
            r1 = 0
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x00eb }
            com.obwhatsapp.yo.dep.loadCImage(r2, r0)     // Catch:{ Exception -> 0x00eb }
            r3 = -1484293645(0xffffffffa78779f3, float:-3.7602245E-15)
            java.lang.String r1 = "۫ۡۢۖ۬ۙۚۢۥۗ۬۟ۖۢۜۥۨۨۘۥۛۜۘ"
        L_0x0184:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x00eb }
            r4 = r4 ^ r3
            switch(r4) {
                case -1609129038: goto L_0x00ec;
                case 800652718: goto L_0x018d;
                case 1440863689: goto L_0x01de;
                case 1820449666: goto L_0x01d9;
                default: goto L_0x018c;
            }
        L_0x018c:
            goto L_0x0184
        L_0x018d:
            java.lang.String r1 = "ۚۢ۠ۤۢۦۘۗۖۜۘۘۖۡۘ۟ۘ۫"
            goto L_0x0184
        L_0x0190:
            java.lang.String r1 = "۬ۙۖۦۦۘ۬۠ۖۘۧۧ۟ۨۢۨ"
            goto L_0x016f
        L_0x0193:
            r1 = 99
            if (r3 == r1) goto L_0x0190
            java.lang.String r1 = "ۗۖۨۘۚۙ۬ۗۨ۠ۙۜۖۘۧۖ۠۫ۖۘۢۤۗ"
            goto L_0x016f
        L_0x019a:
            java.lang.String r1 = "ۡۦۜۗۧۡ۫ۥۡۥ۫ۦۦۧۥۘۖۨۡۘ"
            goto L_0x016f
        L_0x019d:
            r4 = -539620116(0xffffffffdfd60cec, float:-3.0847925E19)
            java.lang.String r1 = "ۥ۬ۦۘ۠ۢۥۜۛۜۘۡۨۘۘۨ۫ۧ"
        L_0x01a2:
            int r5 = r1.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -2092808559: goto L_0x01b7;
                case -1357991036: goto L_0x01c5;
                case -214738860: goto L_0x01ab;
                case 1230371739: goto L_0x01b4;
                default: goto L_0x01aa;
            }
        L_0x01aa:
            goto L_0x01a2
        L_0x01ab:
            r1 = 3
            if (r8 != r1) goto L_0x01b1
            java.lang.String r1 = "ۙۥۗۚ۠ۨۘۘۨۧۛۦۖۜۨۘ"
            goto L_0x01a2
        L_0x01b1:
            java.lang.String r1 = "ۦۥۧ۟ۥۖۢۤۙۦۖۧۚۦۜ"
            goto L_0x01a2
        L_0x01b4:
            java.lang.String r1 = "ۦۙۧ۟ۥۛۧۛۜۘۢۜۘۤۦ۫ۦۥۖۘ"
            goto L_0x01a2
        L_0x01b7:
            r4 = 741791712(0x2c36d7e0, float:2.598359E-12)
            java.lang.String r1 = "ۤۤۨۘۡۨ۟ۚۨۙ۬ۘۧۨ۠ۦۘ"
        L_0x01bc:
            int r5 = r1.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -2032423870: goto L_0x01ce;
                case -1467248463: goto L_0x01d3;
                case 1067490799: goto L_0x0178;
                case 1824779583: goto L_0x01c5;
                default: goto L_0x01c4;
            }
        L_0x01c4:
            goto L_0x01bc
        L_0x01c5:
            r1 = 4
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x00eb }
            goto L_0x00ec
        L_0x01cb:
            java.lang.String r1 = "ۨ۫۫ۖ۟ۛۥۢ۬ۚۙ۫ۗۖۛۜۚ۫۫ۥۘۛۢۦۘ"
            goto L_0x01bc
        L_0x01ce:
            if (r3 != r8) goto L_0x01cb
            java.lang.String r1 = "ۜۤۗ۫ۛۖۘۜۡۥ۬ۤ۠ۘۖۖۘۤۗ۫ۜۧۡۘ"
            goto L_0x01bc
        L_0x01d3:
            java.lang.String r1 = "ۥۢۥۤۢۥۘۥۚ۟ۨۙۦۛۦ"
            goto L_0x01bc
        L_0x01d6:
            java.lang.String r1 = "ۜۨۘۘۛۡۡ۫ۦۡۘ۫ۚۖۥ۫۫ۚۙۦۘۨۧ۠ۘۢۜ"
            goto L_0x0184
        L_0x01d9:
            if (r2 == 0) goto L_0x01d6
            java.lang.String r1 = "ۨۡۢ۟ۗ۬ۨۤۜ۟ۜ۬ۛۖۘ۟ۦۥۘ"
            goto L_0x0184
        L_0x01de:
            r3 = -1585039874(0xffffffffa18635fe, float:-9.094485E-19)
            java.lang.String r1 = "ۜۘۖۘۢۖۨۙۛ۠ۤ۠ۥۡۚ۠ۜۖۛۙۚ۬"
        L_0x01e3:
            int r4 = r1.hashCode()     // Catch:{ Exception -> 0x00eb }
            r4 = r4 ^ r3
            switch(r4) {
                case 1068670655: goto L_0x00ec;
                case 1368795246: goto L_0x01f2;
                case 1381897936: goto L_0x01fb;
                case 2016010102: goto L_0x01ec;
                default: goto L_0x01eb;
            }     // Catch:{ Exception -> 0x00eb }
        L_0x01eb:
            goto L_0x01e3
        L_0x01ec:
            java.lang.String r1 = "ۗۛ۫ۜۘۥۘۤۨۨ۫ۧۢۖۘۘۖۡۤۨۦۧ"
            goto L_0x01e3
        L_0x01ef:
            java.lang.String r1 = "ۙۥۧۘ۫ۜۛۦۗۨۛۤۜۘۥۚۥ"
            goto L_0x01e3
        L_0x01f2:
            boolean r1 = r2.isEmpty()     // Catch:{ Exception -> 0x00eb }
            if (r1 != 0) goto L_0x01ef
            java.lang.String r1 = "۟ۦۢۖ۟۬۟ۢۜ۟ۘۡۘۚۗۥۖ۠ۜۘۢۙ۬"
            goto L_0x01e3
        L_0x01fb:
            com.obwhatsapp.yo.s r1 = new com.obwhatsapp.yo.s     // Catch:{ Exception -> 0x00eb }
            r3 = 1
            r1.<init>(r3, r2)     // Catch:{ Exception -> 0x00eb }
            r0.setOnClickListener(r1)     // Catch:{ Exception -> 0x00eb }
            goto L_0x00ec
        L_0x0206:
            r1 = -735659313(0xffffffffd426bacf, float:-2.8643948E12)
            java.lang.String r0 = "ۛۨۢۧۘۧۘۙۖۦۘۗ۠ۢۢۤۖۘۗۖۧۘ"
        L_0x020b:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x00eb }
            r4 = r4 ^ r1
            switch(r4) {
                case -923779832: goto L_0x0214;
                case -795606297: goto L_0x0221;
                case 450260088: goto L_0x021e;
                case 502335031: goto L_0x00ec;
                default: goto L_0x0213;
            }     // Catch:{ Exception -> 0x00eb }
        L_0x0213:
            goto L_0x020b
        L_0x0214:
            boolean r0 = f532u     // Catch:{ Exception -> 0x00eb }
            if (r0 == 0) goto L_0x021b
            java.lang.String r0 = "ۡۦۜۘۦۢۤۧۘۘ۟ۜ۟۫ۧۜۘۗۢۜ"
            goto L_0x020b
        L_0x021b:
            java.lang.String r0 = "۠ۦۦۘۡۘۘۙ۟۠۫ۡۥۗۗۖ"
            goto L_0x020b
        L_0x021e:
            java.lang.String r0 = "۠ۨۘ۠ۤۘۘ۬۠ۦۘۙۡۡۘ۫ۜۧۥ۠ۨۘ"
            goto L_0x020b
        L_0x0221:
            j(r6, r2, r3)     // Catch:{ Exception -> 0x00eb }
            goto L_0x00ec
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.setCPic(android.view.ViewGroup, X.0tZ, int):void");
    }

    public static void setChatDateColor(TextView textView, C16740tZ r5) {
        String str = "ۙ۟۟ۢۙۨۨۘۖۘۧۤۖ۫ۜۨ";
        while (true) {
            switch ((str.hashCode() ^ 5) ^ -352252186) {
                case -952138266:
                    textView.setTextColor(f(r5));
                    str = "ۖۖۡۘۖۚۤۥۜ۟ۨۖۡۘ۫ۥۛ";
                    break;
                case -452389260:
                    str = "ۖۜۨ۠ۡۚۜۙۜۘۦۧۗۗۜۥۘۧۘۥ۫ۧۥۘ";
                    break;
                case 1017309438:
                    return;
                case 1361844427:
                    str = "۫ۦۦۘ۟۟ۨۗۧۡۘۡۘۛۥ۫ۖ۠ۡۚۧۖ۬ۛۥۗۧ۬ۗ";
                    break;
            }
        }
    }

    public static void setChatInfo(Activity activity) {
        boolean z2;
        String str = null;
        String str2 = "ۤ۬ۤۥۚۤ۠ۘۘۦ۫ۜۘۢۡۖۘ";
        while (true) {
            switch (str2.hashCode() ^ -539627631) {
                case -386222637:
                    break;
                case 30119477:
                    try {
                        Intent intent = activity.getIntent();
                        String str3 = "ۦ۠ۧ۠ۥۖۘ۟ۤۢۖۨۘۖ۠ۗ۠ۦۙ۬ۚۜۛۙۜۘۦۢۜۘ";
                        while (true) {
                            switch (str3.hashCode() ^ -1603817944) {
                                case -1567212450:
                                    str3 = "ۡۡۜۘ۠ۤۦۥۦۦۚۡۨۤۤۥۘۥۘ";
                                    continue;
                                case -1438198187:
                                    if (intent == null) {
                                        str3 = "۟ۚۥۘۧ۫ۦۘۜۚۜۧۚ۫ۤۡۥۘ";
                                        break;
                                    } else {
                                        str3 = "ۤۧۨۗۛۢۦۚ۟ۖ۬ۡۘۚ۫ۦ";
                                        continue;
                                    }
                                case 1718219520:
                                    str = intent.getStringExtra("jid");
                                    z2 = yo.isGroupJid(str);
                                    break;
                                case 2046730630:
                                    z2 = false;
                                    break;
                                default:
                                    continue;
                            }
                        }
                        yo.setGroupBoolean(z2);
                        break;
                    } catch (Exception e2) {
                        break;
                    }
                case 634733572:
                    str2 = "ۧۢۦۘۙ۫ۦۨۨۘۜۡۨۙۗۚۦ۠ۜ۠ۡۘۘۨۧۜۛۡ۬";
                    continue;
                case 2085789246:
                    if (activity != null) {
                        str2 = "ۧۘۜۤۤۧ۬۠ۢۢۜۘۙ۟۠ۢۘۨۘۘۛۘۘۜ۬۫";
                        break;
                    } else {
                        str2 = "ۦۙۦۘۗۗۡۘۜۛۜۦۜ۠ۙۢۧ";
                        continue;
                    }
            }
        }
        yo.setCurr_sJid(str);
        try {
            k(activity, yo.getCurr_sJid());
            activity.findViewById(yo.getID("modPassword", "id")).setOnClickListener(new b(activity, yo.stripJID(str), 2));
            l(activity, LockUtils.isJIDLocked(str));
        } catch (Exception e3) {
        }
    }

    public static void setCustomDTTLreaction(String str) {
        StringBuilder sb = null;
        String str2 = "ۜۙۦۦۡۦۥۢۥۥۤۦۨۨۖۘۘ۟۠ۖۤۜ";
        while (true) {
            switch ((str2.hashCode() ^ 260) ^ 184732148) {
                case -1517038862:
                    shp.setStringPriv(sb.toString(), str);
                    str2 = "۬ۢۡۘۛۛۥۘۢ۬ۘۚ۠ۨۘۘ۬۫ۨۙۘۘۚۢۦۘ";
                    break;
                case -922864882:
                    return;
                case -229713163:
                    sb.append("_customDTTL");
                    str2 = "ۘۦۧۘۗۘۨۘۦۦۨۧۡۦۘۛۦۥۘ";
                    break;
                case 328428901:
                    sb = new StringBuilder();
                    str2 = "۟ۢۡۘ۬ۦۘۗۨۡۘۢۚۚ۠ۡۧۤۦۡۦۨۖۨ۫۫۬ۦۡۘ";
                    break;
                case 493770728:
                    str2 = "ۦۗۤۜۙۨۦ۟ۥۛۘ۠ۤۖ۠ۥ۟ۘۘۥۢ۫";
                    break;
                case 717729188:
                    sb.append(yo.stripJID(f514c));
                    str2 = "ۦۧۜۘۡۡ۫ۧۦۜۘ۠ۧۛۡۢۚۙ۠ۦ۫۬ۘۘ۫ۧۜۘۛ۫۟";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setEmPopup(android.view.View r9) {
        /*
            r8 = 14
            r1 = 0
            r7 = -11
            int r0 = f527p     // Catch:{ NullPointerException -> 0x00a0 }
            android.view.View r0 = r9.findViewById(r0)     // Catch:{ NullPointerException -> 0x00a0 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ NullPointerException -> 0x00a0 }
            r2 = 0
            android.view.View r0 = r0.getChildAt(r2)     // Catch:{ NullPointerException -> 0x00a0 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ NullPointerException -> 0x00a0 }
            java.lang.String r2 = "emojipopup_header"
            boolean r3 = com.obwhatsapp.yo.shp.getIsGradiet(r2)     // Catch:{ NullPointerException -> 0x00a0 }
            int r4 = f529r     // Catch:{ NullPointerException -> 0x00a0 }
            r5 = 1873791346(0x6fafc972, float:1.0880682E29)
            java.lang.String r2 = "ۢۥۘۚ۬ۧ۬ۤۜۘ۟ۙ۠ۖ۬ۚ۬ۢۘۖۙۥ"
        L_0x0021:
            int r6 = r2.hashCode()     // Catch:{ NullPointerException -> 0x00a0 }
            r6 = r6 ^ r5
            switch(r6) {
                case -1577077664: goto L_0x006c;
                case -983669338: goto L_0x002a;
                case -657496511: goto L_0x0074;
                case -233499886: goto L_0x0071;
                default: goto L_0x0029;
            }     // Catch:{ NullPointerException -> 0x00a0 }
        L_0x0029:
            goto L_0x0021
        L_0x002a:
            java.lang.String r2 = "emojipopup_header"
            android.graphics.drawable.GradientDrawable r2 = com.obwhatsapp.yo.shp.getGradientDrawable(r2)     // Catch:{ NullPointerException -> 0x00a0 }
            r0.setBackground(r2)     // Catch:{ NullPointerException -> 0x00a0 }
            android.view.View r0 = r9.findViewById(r4)     // Catch:{ NullPointerException -> 0x00a0 }
            r0.setBackground(r2)     // Catch:{ NullPointerException -> 0x00a0 }
        L_0x003a:
            java.lang.String r0 = "emojipopup_body"
            boolean r2 = com.obwhatsapp.yo.shp.getIsGradiet(r0)     // Catch:{ NullPointerException -> 0x00e1 }
            int r3 = f528q     // Catch:{ NullPointerException -> 0x00e1 }
            r4 = 52300040(0x31e0908, float:4.6442394E-37)
            java.lang.String r0 = "ۙۦۖۘۙۤۘۜۜ۠ۗ۟ۦۡۗۚ"
        L_0x0047:
            int r5 = r0.hashCode()     // Catch:{ NullPointerException -> 0x00e1 }
            r5 = r5 ^ r4
            switch(r5) {
                case -1576499744: goto L_0x00a5;
                case 45884662: goto L_0x00ad;
                case 47227823: goto L_0x00aa;
                case 248351903: goto L_0x0050;
                default: goto L_0x004f;
            }     // Catch:{ NullPointerException -> 0x00e1 }
        L_0x004f:
            goto L_0x0047
        L_0x0050:
            java.lang.String r0 = "emojipopup_body"
            r2 = -11
            int r2 = com.obwhatsapp.youbasha.others.getColor(r0, r2)     // Catch:{ NullPointerException -> 0x00e1 }
            r4 = 366013618(0x15d0ecb2, float:8.438397E-26)
            java.lang.String r0 = "ۙ۬۬ۗۦۦ۬ۘ۬ۛ۠ۦ۠ۖۤۗ۟ۜۘ۟ۖۚۗۛۨۘ۫۬ۢ"
        L_0x005d:
            int r5 = r0.hashCode()     // Catch:{ NullPointerException -> 0x00e1 }
            r5 = r5 ^ r4
            switch(r5) {
                case -1610913977: goto L_0x0066;
                case -688585457: goto L_0x00d4;
                case 1186637326: goto L_0x00d9;
                case 1969247890: goto L_0x00ba;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x005d
        L_0x0066:
            java.lang.String r0 = "ۢۥۨۘۜۙۤۘۜۧۚۛ۟۫ۨۗۛۤۦۘۚ۠ۨ"
            goto L_0x005d
        L_0x0069:
            java.lang.String r2 = "۬ۨۡۨۚۜۘۨۧۖۘۙۨ۟ۥۢۧۛۦ۬ۥۛۡ۫ۢۢ"
            goto L_0x0021
        L_0x006c:
            if (r3 == 0) goto L_0x0069
            java.lang.String r2 = "ۙۨۨۛۘۗ۫ۡۦۢ۬ۖۦ۟۟ۡۘ"
            goto L_0x0021
        L_0x0071:
            java.lang.String r2 = "ۘۡۚۥۜۜۛۜۘۘۧ۬ۚ۠ۚ۫ۦۚۜ۠ۡۢۢ۬"
            goto L_0x0021
        L_0x0074:
            java.lang.String r2 = "emojipopup_header"
            r3 = -11
            int r3 = com.obwhatsapp.youbasha.others.getColor(r2, r3)     // Catch:{ NullPointerException -> 0x00a0 }
            r5 = -628051333(0xffffffffda90b27b, float:-2.0364319E16)
            java.lang.String r2 = "ۜ۠ۥۨۤۥۥ۫۟۫ۤۘۜ۠۬ۦ۠ۗ۬۫ۖۦۨۦۘۛۗۧ"
        L_0x0081:
            int r6 = r2.hashCode()     // Catch:{ NullPointerException -> 0x00a0 }
            r6 = r6 ^ r5
            switch(r6) {
                case -684994600: goto L_0x0090;
                case -541814185: goto L_0x003a;
                case -54485695: goto L_0x008a;
                case 1890825778: goto L_0x0095;
                default: goto L_0x0089;
            }
        L_0x0089:
            goto L_0x0081
        L_0x008a:
            java.lang.String r2 = "ۧۘۦ۬ۗۢۘ۠ۨ۟ۥۘۚۘۧۥۢۡۘۗۡۘۗ۟ۡۗ۠ۦ"
            goto L_0x0081
        L_0x008d:
            java.lang.String r2 = "ۧۧۘۧۤۨۘ۠۫ۘۘ۟۫۟ۘۦۙ۠ۨۨۛۛۤ"
            goto L_0x0081
        L_0x0090:
            if (r3 == r7) goto L_0x008d
            java.lang.String r2 = "ۦ۟ۢۤۧۡۤۙۖۘۚۘۗۦۛۗۦۘۦۘۢۦۘ۟ۦۨۛۘۡۘ"
            goto L_0x0081
        L_0x0095:
            r0.setBackgroundColor(r3)     // Catch:{ NullPointerException -> 0x00a0 }
            android.view.View r0 = r9.findViewById(r4)     // Catch:{ NullPointerException -> 0x00a0 }
            r0.setBackgroundColor(r3)     // Catch:{ NullPointerException -> 0x00a0 }
            goto L_0x003a
        L_0x00a0:
            r0 = move-exception
            goto L_0x003a
        L_0x00a2:
            java.lang.String r0 = "ۡۦۗۢۛۨۘۡ۫ۨۘۙۥۨۘۚ۟۠ۨۚۨۗۖۥۗۧۡ"
            goto L_0x0047
        L_0x00a5:
            if (r2 == 0) goto L_0x00a2
            java.lang.String r0 = "ۧۙۗ۬ۧۘۛۢۨۡ۟ۛ۟ۢۚۡۜۖ۟"
            goto L_0x0047
        L_0x00aa:
            java.lang.String r0 = "ۚۚۢۙۤ۫ۡۖۡۘۖۘۨۘۤۖۘۥۙۥۘۤۥۥۘۙ۟ۥۘ"
            goto L_0x0047
        L_0x00ad:
            android.view.View r0 = r9.findViewById(r3)     // Catch:{ NullPointerException -> 0x00e1 }
            java.lang.String r2 = "emojipopup_body"
            android.graphics.drawable.GradientDrawable r2 = com.obwhatsapp.yo.shp.getGradientDrawable(r2)     // Catch:{ NullPointerException -> 0x00e1 }
            r0.setBackground(r2)     // Catch:{ NullPointerException -> 0x00e1 }
        L_0x00ba:
            java.lang.String r0 = "emojipopup_icons"
            r2 = -11
            int r2 = com.obwhatsapp.youbasha.others.getColor(r0, r2)     // Catch:{ NullPointerException -> 0x016d }
            r3 = 1770695286(0x698aaa76, float:2.0954593E25)
            java.lang.String r0 = "ۗۢۘۚۡۨۘۨ۟ۧۢۨۨۘۢ۫ۗ"
        L_0x00c7:
            int r4 = r0.hashCode()     // Catch:{ NullPointerException -> 0x016d }
            r4 = r4 ^ r3
            switch(r4) {
                case -1567537893: goto L_0x00eb;
                case -1464139814: goto L_0x00e6;
                case 1100875592: goto L_0x0154;
                case 1619202348: goto L_0x00d0;
                default: goto L_0x00cf;
            }
        L_0x00cf:
            goto L_0x00c7
        L_0x00d0:
            return
        L_0x00d1:
            java.lang.String r0 = "ۛۜۛۚۤۚۥ۬ۢۡۙۘۚ۠ۢۤۖ۠ۗۡۨۘۗۘۨ"
            goto L_0x005d
        L_0x00d4:
            if (r2 == r7) goto L_0x00d1
            java.lang.String r0 = "ۡۖۢۖۙۥۢۛ۟۫۫ۖۘ۫۫ۖۘ"
            goto L_0x005d
        L_0x00d9:
            android.view.View r0 = r9.findViewById(r3)     // Catch:{ NullPointerException -> 0x00e1 }
            r0.setBackgroundColor(r2)     // Catch:{ NullPointerException -> 0x00e1 }
            goto L_0x00ba
        L_0x00e1:
            r0 = move-exception
            goto L_0x00ba
        L_0x00e3:
            java.lang.String r0 = "ۘۨۧۘ۬ۘۦۘ۠ۖۗۨۚۨۘۘۡۧ"
            goto L_0x00c7
        L_0x00e6:
            if (r2 == r7) goto L_0x00e3
            java.lang.String r0 = "ۨۧۜۛۖۘۘۦۦۖۡ۬ۡۥۦۗۨۖ۬ۜۧۘۢۢۡۥ۟ۛ"
            goto L_0x00c7
        L_0x00eb:
            java.lang.String r0 = "ۙۛۨۘۧۢ۠ۚۢۦۥ۬ۚۜۢۗۤۙ"
            goto L_0x00c7
        L_0x00ee:
            r0 = 14
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ NullPointerException -> 0x016d }
            r3 = 0
            java.lang.String r4 = "emoji_recent_btn"
            r0[r3] = r4     // Catch:{ NullPointerException -> 0x016d }
            r3 = 1
            java.lang.String r4 = "emoji_people_btn"
            r0[r3] = r4     // Catch:{ NullPointerException -> 0x016d }
            r3 = 2
            java.lang.String r4 = "emoji_nature_btn"
            r0[r3] = r4     // Catch:{ NullPointerException -> 0x016d }
            r3 = 3
            java.lang.String r4 = "emoji_food_btn"
            r0[r3] = r4     // Catch:{ NullPointerException -> 0x016d }
            r3 = 4
            java.lang.String r4 = "emoji_activity_btn"
            r0[r3] = r4     // Catch:{ NullPointerException -> 0x016d }
            r3 = 5
            java.lang.String r4 = "emoji_travel_btn"
            r0[r3] = r4     // Catch:{ NullPointerException -> 0x016d }
            r3 = 6
            java.lang.String r4 = "emoji_objects_btn"
            r0[r3] = r4     // Catch:{ NullPointerException -> 0x016d }
            r3 = 7
            java.lang.String r4 = "emoji_symbols_btn"
            r0[r3] = r4     // Catch:{ NullPointerException -> 0x016d }
            r3 = 8
            java.lang.String r4 = "emoji_flags_btn"
            r0[r3] = r4     // Catch:{ NullPointerException -> 0x016d }
            r3 = 9
            java.lang.String r4 = "delete_symbol_tb"
            r0[r3] = r4     // Catch:{ NullPointerException -> 0x016d }
            r3 = 10
            java.lang.String r4 = "gif_tab"
            r0[r3] = r4     // Catch:{ NullPointerException -> 0x016d }
            r3 = 11
            java.lang.String r4 = "emoji_tab"
            r0[r3] = r4     // Catch:{ NullPointerException -> 0x016d }
            r3 = 12
            java.lang.String r4 = "search_button"
            r0[r3] = r4     // Catch:{ NullPointerException -> 0x016d }
            r3 = 13
            java.lang.String r4 = "sticker_tab_icon"
            r0[r3] = r4     // Catch:{ NullPointerException -> 0x016d }
            r0 = r0[r1]     // Catch:{ NullPointerException -> 0x016d }
            java.lang.String r3 = "id"
            int r0 = com.obwhatsapp.yo.yo.getID(r0, r3)     // Catch:{ NullPointerException -> 0x016d }
            android.view.View r0 = r9.findViewById(r0)     // Catch:{ NullPointerException -> 0x016d }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ NullPointerException -> 0x016d }
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_ATOP     // Catch:{ NullPointerException -> 0x016d }
            r0.setColorFilter(r2, r3)     // Catch:{ NullPointerException -> 0x016d }
            int r0 = r1 + 1
            r1 = r0
        L_0x0154:
            r3 = 1770850101(0x698d0735, float:2.1311572E25)
            java.lang.String r0 = "ۘۚۗۘۚۘۘۗۡۧۘ۠ۨۥۘ۫ۜ۫ۥۜۦ"
        L_0x0159:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -551961093: goto L_0x00ee;
                case 1037083589: goto L_0x00d0;
                case 1046179061: goto L_0x016a;
                case 1207574743: goto L_0x0162;
                default: goto L_0x0161;
            }
        L_0x0161:
            goto L_0x0159
        L_0x0162:
            if (r1 >= r8) goto L_0x0167
            java.lang.String r0 = "ۘۖ۠۫ۢ۟۫ۜۡۖۡ۬ۚۧۨۤۧۨۘۥۜۦۘ"
            goto L_0x0159
        L_0x0167:
            java.lang.String r0 = "ۨۚۜ۟ۤۥۡۘ۫ۚۥۥۚۢۢۢ۠ۢ۟ۛ۫ۥۢۗۦۥ"
            goto L_0x0159
        L_0x016a:
            java.lang.String r0 = "ۖۗۚۨۘۛ۫ۖۖ۠ۖ۬۠ۜۧ"
            goto L_0x0159
        L_0x016d:
            r0 = move-exception
            goto L_0x00d0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.setEmPopup(android.view.View):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x053e, code lost:
        r3 = "ۙۛۥۜۧ۠ۨ۬۟ۥۢۖۘۤۘ۫۠ۧۜۘۜۚ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r3 = "۠ۖۥۙۤۨ۫ۘۚ۟ۘۘۜۡۜۜۤ۬۠۫ۡ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010c, code lost:
        r3 = "ۛۖ۫ۧۚ۫ۡۤ۠ۙۜ۟ۢۡۘۙ۠ۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0179, code lost:
        r3 = "ۢۙ۬ۛ۬ۡۛۛۖۘۢۧۨۚۚۡۘ۫۠ۚۡۙۜۘ۟ۦۛ۬۠۫";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.View setPicO(android.view.ViewGroup r29, X.C16740tZ r30) {
        /*
            r26 = 0
            r25 = 0
            r24 = 0
            r23 = 0
            r22 = 0
            r20 = 0
            r21 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
            r15 = 0
            r14 = 0
            r13 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r12 = 0
            r8 = 0
            r6 = 0
            r5 = 0
            r7 = 0
            r4 = 0
            java.lang.String r2 = "ۨۤۨۘۡۧۨۖ۫ۨۢۨۧ۠ۨۜۥ۠"
            r3 = r2
        L_0x0025:
            int r2 = r3.hashCode()
            r27 = 513(0x201, float:7.19E-43)
            r28 = 705859245(0x2a128ead, float:1.3016906E-13)
            r2 = r2 ^ r27
            r2 = r2 ^ r28
            switch(r2) {
                case -2116084947: goto L_0x0230;
                case -1988395923: goto L_0x003e;
                case -1941573947: goto L_0x0531;
                case -1799962387: goto L_0x02a1;
                case -1795370073: goto L_0x0407;
                case -1772407633: goto L_0x023e;
                case -1749178398: goto L_0x03e4;
                case -1738731472: goto L_0x0075;
                case -1704126691: goto L_0x02ea;
                case -1631980220: goto L_0x0465;
                case -1572644035: goto L_0x04b8;
                case -1504581321: goto L_0x03d3;
                case -1473752056: goto L_0x0543;
                case -1435771017: goto L_0x03bb;
                case -1378225915: goto L_0x0533;
                case -1339135338: goto L_0x0506;
                case -1302649148: goto L_0x0274;
                case -1302077002: goto L_0x0459;
                case -1299676623: goto L_0x031f;
                case -1245467176: goto L_0x032b;
                case -1244647011: goto L_0x02d0;
                case -1130369245: goto L_0x0245;
                case -1104241369: goto L_0x0036;
                case -984037449: goto L_0x0499;
                case -961405658: goto L_0x0375;
                case -859421146: goto L_0x016a;
                case -842030777: goto L_0x0566;
                case -821155126: goto L_0x0575;
                case -777096659: goto L_0x03cc;
                case -733923024: goto L_0x046b;
                case -690997677: goto L_0x0264;
                case -638412021: goto L_0x04fc;
                case -577832458: goto L_0x02e3;
                case -567166467: goto L_0x0412;
                case -529952730: goto L_0x00dc;
                case -523224686: goto L_0x02d7;
                case -494048392: goto L_0x04dd;
                case -376050742: goto L_0x0395;
                case -345750326: goto L_0x0314;
                case -169332206: goto L_0x034f;
                case -161336478: goto L_0x04c5;
                case -118582464: goto L_0x03eb;
                case -66892255: goto L_0x0097;
                case 122794336: goto L_0x056b;
                case 160965542: goto L_0x0336;
                case 175816642: goto L_0x0557;
                case 265490849: goto L_0x057f;
                case 294519765: goto L_0x0431;
                case 328069504: goto L_0x03fb;
                case 370397671: goto L_0x04ae;
                case 374813363: goto L_0x0342;
                case 536154654: goto L_0x044b;
                case 553519705: goto L_0x0386;
                case 584628852: goto L_0x03f1;
                case 605521143: goto L_0x043d;
                case 704611101: goto L_0x02c2;
                case 742649618: goto L_0x0533;
                case 784504527: goto L_0x04a4;
                case 834469238: goto L_0x003a;
                case 851483964: goto L_0x0229;
                case 934970090: goto L_0x0049;
                case 944161988: goto L_0x0282;
                case 954405104: goto L_0x0196;
                case 983804723: goto L_0x0144;
                case 1022529276: goto L_0x0237;
                case 1102003362: goto L_0x0349;
                case 1116222301: goto L_0x01fe;
                case 1163802582: goto L_0x0069;
                case 1177104073: goto L_0x0525;
                case 1223377988: goto L_0x00bd;
                case 1240218170: goto L_0x0471;
                case 1319241479: goto L_0x051a;
                case 1461038483: goto L_0x01db;
                case 1489504315: goto L_0x038d;
                case 1518937978: goto L_0x02f5;
                case 1568240643: goto L_0x00fd;
                case 1591612260: goto L_0x03b4;
                case 1671088535: goto L_0x027b;
                case 1771337118: goto L_0x01c9;
                case 1807591553: goto L_0x014b;
                case 1847370687: goto L_0x04d3;
                case 1885872656: goto L_0x0533;
                case 1892036637: goto L_0x04bf;
                case 1941806008: goto L_0x0510;
                case 1960661338: goto L_0x01bd;
                case 2071430853: goto L_0x0121;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x0025
        L_0x0036:
            java.lang.String r2 = "ۨۛۡۗۤۡۧۤ۬ۖۥۡۘۚ۬ۜۘۡۨۤ۫۫ۚ"
            r3 = r2
            goto L_0x0025
        L_0x003a:
            java.lang.String r2 = "ۤۗ۟ۙ۟ۤۧۘۖۘۦۚۡۘۧ۬ۖ"
            r3 = r2
            goto L_0x0025
        L_0x003e:
            r2 = 0
            r0 = r29
            android.view.View r26 = r0.getChildAt(r2)
            java.lang.String r2 = "ۧ۬ۚۦۦ۬۟۠۫ۜ۠ۖۛۖ۬۟ۘۦۘۧ۠ۨۘ"
            r3 = r2
            goto L_0x0025
        L_0x0049:
            r3 = 1351240014(0x508a494e, float:1.85604792E10)
            java.lang.String r2 = "۫ۥۨۘۗ۫ۘۘ۫ۜۘۘۨ۠۬ۡ۠ۙۧۖۚۛۗ۠"
        L_0x004e:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -376219808: goto L_0x005f;
                case -284652376: goto L_0x0534;
                case 466837756: goto L_0x0066;
                case 579195375: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x004e
        L_0x0058:
            java.lang.String r2 = "۠ۜۚۧۤۖۘۤۡۦۘۡۨۥ۬ۦۨۘ۬ۦۤ۫۠ۜۘ۟ۜۖۘ"
            r3 = r2
            goto L_0x0025
        L_0x005c:
            java.lang.String r2 = "ۖ۫ۦۘۦ۫ۧۨۚ۠ۧۧۤۗۦۦۘۗ۠ۖۘۖۦ۟ۧۘۡۘۧ۟ۘ"
            goto L_0x004e
        L_0x005f:
            boolean r2 = f533v
            if (r2 != 0) goto L_0x005c
            java.lang.String r2 = "ۤۗۡۜۡۘۢۢۥۢۨۜۘۙۗۦۘ"
            goto L_0x004e
        L_0x0066:
            java.lang.String r2 = "ۡ۟۟ۡۜ۫۫ۖۧۜۘۡۘۢ۬ۛۡ۠ۚۧۜ۠"
            goto L_0x004e
        L_0x0069:
            r0 = r30
            X.1Vw r2 = r0.A11
            boolean r0 = r2.A02
            r25 = r0
            java.lang.String r2 = "ۚۖۢۢۡۡ۟ۦۥۙ۠ۖ۟ۗۦۢ۫ۦۘ"
            r3 = r2
            goto L_0x0025
        L_0x0075:
            r3 = 810062029(0x304890cd, float:7.296535E-10)
            java.lang.String r2 = "ۥ۠ۘۘۢۥۨۘۡۢۚۙ۬ۘۘۖۜۡۘۗۚۘ۫ۗ۫ۘۜۡۘۧۖ۠"
        L_0x007a:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -1077222211: goto L_0x0093;
                case -538134628: goto L_0x008b;
                case 182582829: goto L_0x0090;
                case 194859357: goto L_0x0084;
                default: goto L_0x0083;
            }
        L_0x0083:
            goto L_0x007a
        L_0x0084:
            java.lang.String r2 = "ۤ۠۫ۦۥۗ۟ۗۥۘۢۛۘ۠ۗۡۘۦۥۢ۫ۥۥۘ۠ۚۘۖۛۜۘ"
            r3 = r2
            goto L_0x0025
        L_0x0088:
            java.lang.String r2 = "ۖۜۧۘۛۜۧ۫ۖۨۘ۬ۛۨۘۗ۟ۖۧۦۘۤۧۜ۠ۨۖۘۖ۟ۨ"
            goto L_0x007a
        L_0x008b:
            if (r25 == 0) goto L_0x0088
            java.lang.String r2 = "ۖۡۥۘۦۦۜۘۗۡۨۖۗۦۘ۬ۨۜۢ۟ۖۘۨ۫۫"
            goto L_0x007a
        L_0x0090:
            java.lang.String r2 = "ۨۤۙ۟۫ۛ۟ۦ۬۬ۙۢۨۤۢۨۨۜۘ۬ۗۜۨۧ۠"
            goto L_0x007a
        L_0x0093:
            java.lang.String r2 = "۬ۡۘۘۙۤۗ۟ۚۚۤۦۧۜۙۚۚۖۧۘ"
            r3 = r2
            goto L_0x0025
        L_0x0097:
            r3 = -809488582(0xffffffffcfc02f3a, float:-6.448641E9)
            java.lang.String r2 = "ۧۥۥۦۧۘۡۜۘۛۘۨۦۘۗ۠ۜۙۖۤ"
        L_0x009c:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -1042188642: goto L_0x00ae;
                case 731960795: goto L_0x00b8;
                case 765443027: goto L_0x00a6;
                case 1910303162: goto L_0x00b5;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            goto L_0x009c
        L_0x00a6:
            java.lang.String r2 = "۠ۖۥۙۤۨ۫ۘۚ۟ۘۘۜۡۜۜۤ۬۠۫ۡ"
            r3 = r2
            goto L_0x0025
        L_0x00ab:
            java.lang.String r2 = "۠ۘ۟ۦۦۜۛۢۖۘۛ۫ۛۡ۫۠"
            goto L_0x009c
        L_0x00ae:
            boolean r2 = f531t
            if (r2 == 0) goto L_0x00ab
            java.lang.String r2 = "ۤۛ۠ۧۜ۠ۢۥ۠ۚۗ۠ۗۢۥۜ۠ۘۘۗۙۨۙۜ۫ۙۘۗ"
            goto L_0x009c
        L_0x00b5:
            java.lang.String r2 = "ۤۘۡ۟ۢ۬۠ۥۦۧ۠۟ۤۗۨۧۘۜۘ"
            goto L_0x009c
        L_0x00b8:
            java.lang.String r2 = "ۤ۠۫ۦۥۗ۟ۗۥۘۢۛۘ۠ۗۡۘۦۥۢ۫ۥۥۘ۠ۚۘۖۛۜۘ"
            r3 = r2
            goto L_0x0025
        L_0x00bd:
            r3 = -477772983(0xffffffffe385c349, float:-4.9349775E21)
            java.lang.String r2 = "ۥۜ۠ۨ۠ۜۘۗۡ۟۟ۜۦۘۦۡۖۥ۬ۡۘۙۥۛۗۛۚۥۗۜ"
        L_0x00c2:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -1455052495: goto L_0x0539;
                case 967956129: goto L_0x00cc;
                case 1636196600: goto L_0x00d2;
                case 1884968396: goto L_0x00d7;
                default: goto L_0x00cb;
            }
        L_0x00cb:
            goto L_0x00c2
        L_0x00cc:
            java.lang.String r2 = "ۘۛ۟ۧۥ۟ۥۥۤۤۤۛ۟۠ۘۡ۬۫"
            goto L_0x00c2
        L_0x00cf:
            java.lang.String r2 = "ۢۢۥۘۗۗۦۗۜۨۜۢۢۛۚۥۙۧ۠ۥۦۘۦۧۘ"
            goto L_0x00c2
        L_0x00d2:
            if (r25 != 0) goto L_0x00cf
            java.lang.String r2 = "ۖۛۥۘۗ۫ۛ۠ۛۨ۠ۡۧ۟۟ۡۘۦۜۜ۟۬ۨ۬ۙ۟ۜۘۢ"
            goto L_0x00c2
        L_0x00d7:
            java.lang.String r2 = "ۧۛۛۛۨۡ۬ۜۡۘۡۜۥۘۛۡۜۘۡ۬۬۫ۥۡ"
            r3 = r2
            goto L_0x0025
        L_0x00dc:
            r3 = -189430904(0xfffffffff4b58388, float:-1.15048035E32)
            java.lang.String r2 = "ۤۡۨۘۤۤۛۙ۟ۚ۠۠ۧۛۥۨۘۥۘ۬۠ۖۘۜۨۤ"
        L_0x00e1:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -1139802183: goto L_0x00f8;
                case -157782456: goto L_0x00eb;
                case 348215804: goto L_0x00f1;
                case 1463693875: goto L_0x00a6;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            goto L_0x00e1
        L_0x00eb:
            java.lang.String r2 = "ۧۖۙ۫ۧۖۘۨ۠ۨۗۡۛۙ۟ۖۘ"
            goto L_0x00e1
        L_0x00ee:
            java.lang.String r2 = "۟۟ۦۘ۠ۗۥۗۥۨۘ۫۬ۡۚۥۦۤۖۤۤۛۦ۬ۧۨ"
            goto L_0x00e1
        L_0x00f1:
            boolean r2 = f530s
            if (r2 == 0) goto L_0x00ee
            java.lang.String r2 = "ۙ۫ۡۘ۫ۡ۬ۛ۠ۖ۠ۡۧۥ۟ۜ"
            goto L_0x00e1
        L_0x00f8:
            java.lang.String r2 = "۬ۤۦۘۦۙ۫ۤۡ۬ۢۤ۬ۦۧ۠ۙ۠ۜۘ۫ۘۤ۬۫ۦۘ"
            r3 = r2
            goto L_0x0025
        L_0x00fd:
            r3 = 716953989(0x2abbd985, float:3.3368807E-13)
            java.lang.String r2 = "ۘۜۘۘۗ۫ۢۨۗۜۘ۬ۛ۠ۜۤۡ۠۬"
        L_0x0102:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -70696450: goto L_0x0119;
                case 258442892: goto L_0x0114;
                case 491131471: goto L_0x010c;
                case 1420869209: goto L_0x011c;
                default: goto L_0x010b;
            }
        L_0x010b:
            goto L_0x0102
        L_0x010c:
            java.lang.String r2 = "ۛۖ۫ۧۚ۫ۡۤ۠ۙۜ۟ۢۡۘۙ۠ۘ"
            r3 = r2
            goto L_0x0025
        L_0x0111:
            java.lang.String r2 = "ۗۛۦۘ۠ۘۨۤۦۜۘۙۖۘۗۧۡۘ"
            goto L_0x0102
        L_0x0114:
            if (r25 == 0) goto L_0x0111
            java.lang.String r2 = "ۗۘۛۤۤۗۤۖۘ۬ۦ۠ۚۘ"
            goto L_0x0102
        L_0x0119:
            java.lang.String r2 = "۠ۧۦۙۧۙۢۙ۠۬ۦ۫ۧ۬۬ۜ۬ۨۨۥ۟۬ۚۧ"
            goto L_0x0102
        L_0x011c:
            java.lang.String r2 = "ۗ۫ۘۘۤۗۚۜۘۨۗ۠ۡۘ۟۟ۡۘۘۥۦۛۧ۫ۥۘ"
            r3 = r2
            goto L_0x0025
        L_0x0121:
            r3 = -385417772(0xffffffffe906fdd4, float:-1.0199671E25)
            java.lang.String r2 = "ۜۡۦ۫ۨۡۘ۠ۥۦۘ۠۫۬ۥۗۢۤۦۨۜۨ۟"
        L_0x0126:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -1209301903: goto L_0x010c;
                case -758557649: goto L_0x0130;
                case 1022851932: goto L_0x0136;
                case 1524564220: goto L_0x013f;
                default: goto L_0x012f;
            }
        L_0x012f:
            goto L_0x0126
        L_0x0130:
            java.lang.String r2 = "۟ۦۚۜۧۦۢۦۨ۟ۤۜۘ۫ۙ۟ۗۘۥۘ"
            goto L_0x0126
        L_0x0133:
            java.lang.String r2 = "ۥ۟ۛ۫ۘ۠ۖۢۘۙۘۨۡۖۦ۬۫۠ۗۘۘ۠ۧۛۦۧۢ"
            goto L_0x0126
        L_0x0136:
            r0 = r26
            boolean r2 = r0 instanceof android.widget.TextView
            if (r2 == 0) goto L_0x0133
            java.lang.String r2 = "ۤۘ۬ۡ۠ۛۤۡۡۚ۬ۘۤ۫ۘۘۤۖۧۗۨۧ۠ۜۧۘ"
            goto L_0x0126
        L_0x013f:
            java.lang.String r2 = "۠ۖۥۙۤۨ۫ۘۚ۟ۘۘۜۡۜۜۤ۬۠۫ۡ"
            r3 = r2
            goto L_0x0025
        L_0x0144:
            int r24 = F
            java.lang.String r2 = "ۗۜۛۖۡۗۧۖۡۢۤۨ۬ۖۡ"
            r3 = r2
            goto L_0x0025
        L_0x014b:
            r3 = 2085980541(0x7c55897d, float:4.4349913E36)
            java.lang.String r2 = "ۧۙۘۖۡۘۙۛۜۘۥۚۜۘ۟ۖۡۜۤ۫"
        L_0x0150:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -1141706382: goto L_0x0162;
                case 625517411: goto L_0x0167;
                case 791953168: goto L_0x0179;
                case 1613885433: goto L_0x015a;
                default: goto L_0x0159;
            }
        L_0x0159:
            goto L_0x0150
        L_0x015a:
            java.lang.String r2 = "ۙۚۜۘۖۥۥۡ۠ۨۘ۫ۛۗۜۖۧۘۖۘۖ"
            r3 = r2
            goto L_0x0025
        L_0x015f:
            java.lang.String r2 = "ۙۜ۟ۜۦۙۡ۫۟ۙۨۨۚۘۨۘ۠ۨۖۘۜۧۨ۫ۦۛ۫ۨۜ"
            goto L_0x0150
        L_0x0162:
            if (r25 != 0) goto L_0x015f
            java.lang.String r2 = "ۙۚۗۜۖۦۨۘۥ۫۬ۡۘ۬ۗۙۚۙ۟ۘۚۥۘ"
            goto L_0x0150
        L_0x0167:
            java.lang.String r2 = "۟ۗۖۜۖۨۧۘۡۘۨۘۖۘ۠ۜۢۡ۠ۙۢۥۦۘۧۛۥۦ۬ۘۘ"
            goto L_0x0150
        L_0x016a:
            r3 = 1090024091(0x40f8729b, float:7.76399)
            java.lang.String r2 = "۠ۙۥۥۤۡۜۘۘۙۚ۠ۖۢ۬۟ۥۡۘۤۤۖۘ۬ۖۨ۫ۢۘ"
        L_0x016f:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -841536937: goto L_0x018e;
                case 394569362: goto L_0x0181;
                case 1401386690: goto L_0x0179;
                case 1486074910: goto L_0x0191;
                default: goto L_0x0178;
            }
        L_0x0178:
            goto L_0x016f
        L_0x0179:
            java.lang.String r2 = "ۢۙ۬ۛ۬ۡۛۛۖۘۢۧۨۚۚۡۘ۫۠ۚۡۙۜۘ۟ۦۛ۬۠۫"
            r3 = r2
            goto L_0x0025
        L_0x017e:
            java.lang.String r2 = "ۚۡۖۚۙۦۘۡۗۖۘۜۙۚۛ۟ۦۘۘۥۙۤۜۨۘ"
            goto L_0x016f
        L_0x0181:
            int r2 = r26.getId()
            int r27 = L
            r0 = r27
            if (r2 != r0) goto L_0x017e
            java.lang.String r2 = "ۤۦۧۦۘۡۘۥ۟ۗۥۢ۫۬ۚۚۛۥۦۜۛۚ"
            goto L_0x016f
        L_0x018e:
            java.lang.String r2 = "ۤۡ۠ۘ۬ۙۥۛ۟ۨۖۤۗ۬ۘۘۡ۬۟ۜ۠ۥۘۗۨۜۘ۫ۚۖۘ"
            goto L_0x016f
        L_0x0191:
            java.lang.String r2 = "۠ۨۥۘۛ۟ۤۥۛۙۙۨۦۘۖ۟ۤ"
            r3 = r2
            goto L_0x0025
        L_0x0196:
            r3 = -963712502(0xffffffffc68eea0a, float:-18293.02)
            java.lang.String r2 = "ۘۖ۬ۤ۟ۘۜۧۘۨۥ۫ۘۜۤ۠۠ۛ۠ۨۦۘۥۥ۫ۗۨ"
        L_0x019b:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -1093020131: goto L_0x01ad;
                case -226247381: goto L_0x0179;
                case 698446288: goto L_0x01ba;
                case 1295122727: goto L_0x01a5;
                default: goto L_0x01a4;
            }
        L_0x01a4:
            goto L_0x019b
        L_0x01a5:
            java.lang.String r2 = "ۛۘۡۘۙۘۜۛۢ۟۬۠ۚۛۖ۫ۛۚ۠ۨ۠ۖ"
            r3 = r2
            goto L_0x0025
        L_0x01aa:
            java.lang.String r2 = "ۜۥۤۚ۬ۛۧۦۖۘۧ۠۟۠ۘۘۗۡۡۘۤۨۥۘ"
            goto L_0x019b
        L_0x01ad:
            int r2 = M
            r0 = r26
            android.view.View r2 = r0.findViewById(r2)
            if (r2 == 0) goto L_0x01aa
            java.lang.String r2 = "ۖۡ۟ۦۡۨۘۗۥۖۛۚۖۘۦۚۦۥۡۦۚۜ۬۫ۢۙ"
            goto L_0x019b
        L_0x01ba:
            java.lang.String r2 = "ۥۛۦۤۨۡۥۛۦۗۨۘۡ۟ۜۡ۠ۘ۬ۨۨ"
            goto L_0x019b
        L_0x01bd:
            android.view.ViewGroup$LayoutParams r2 = r26.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            java.lang.String r3 = "ۤۖۚۧۡۡۙ۠ۥۚۢۗۙ۬ۨۥۛۡۘ"
            r23 = r2
            goto L_0x0025
        L_0x01c9:
            r0 = r23
            int r2 = r0.width
            int r3 = f534w
            int r3 = r3 + r24
            int r2 = r2 - r3
            r0 = r23
            r0.width = r2
            java.lang.String r2 = "ۢۙ۬ۛ۬ۡۛۛۖۘۢۧۨۚۚۡۘ۫۠ۚۡۙۜۘ۟ۦۛ۬۠۫"
            r3 = r2
            goto L_0x0025
        L_0x01db:
            r3 = -1327561062(0xffffffffb0df069a, float:-1.6227262E-9)
            java.lang.String r2 = "۫۟ۖۘۘۜۘۙ۫ۖۘ۟ۙۚۡۦۘۘ۟ۨۘ"
        L_0x01e0:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -1250385498: goto L_0x01ea;
                case -89227660: goto L_0x053e;
                case 245527629: goto L_0x01f6;
                case 1177698718: goto L_0x01f9;
                default: goto L_0x01e9;
            }
        L_0x01e9:
            goto L_0x01e0
        L_0x01ea:
            java.lang.Object r2 = r26.getTag()
            if (r2 == 0) goto L_0x01f3
            java.lang.String r2 = "ۦۚۚۘ۠ۧۘ۠۫ۦۘۘ۠ۦۖۘۦ۠ۨۘۢۥۥۖ۬ۡ"
            goto L_0x01e0
        L_0x01f3:
            java.lang.String r2 = "ۨۛۜۧۤ۬ۗۜ۫۠ۥۧۨۖۡۘۙۜۥۙۘۨ"
            goto L_0x01e0
        L_0x01f6:
            java.lang.String r2 = "ۧۦۛۡۨۥ۫ۦۛۢۦۡۘۗۙۤۡ۠ۨۘۥۦۜۧۚۚۙۙۘۘ"
            goto L_0x01e0
        L_0x01f9:
            java.lang.String r2 = "ۡۗ۬ۢۖۦۖۙۢ۟ۢۘۚۖۡۚۧۚۜۧۙ۠ۢۧ"
            r3 = r2
            goto L_0x0025
        L_0x01fe:
            r3 = 1275322089(0x4c03dee9, float:3.4569124E7)
            java.lang.String r2 = "ۖۢۨۘ۫ۚۨ۠ۜۨۗۥۙ۬ۘۛۖ۠۟ۘۧۦۘۤۙۜ"
        L_0x0203:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -2076526383: goto L_0x020d;
                case -1780145247: goto L_0x0224;
                case -707737904: goto L_0x053e;
                case 85438989: goto L_0x0213;
                default: goto L_0x020c;
            }
        L_0x020c:
            goto L_0x0203
        L_0x020d:
            java.lang.String r2 = "۠ۖۜۘۙ۟ۜۚ۟ۜۘۖۗۜۦۦۤۡ۠ۥۘ۟ۘ۠ۢۛۨ"
            goto L_0x0203
        L_0x0210:
            java.lang.String r2 = "ۘۛۡۘۛۛۖۘ۫ۗ۠ۙۜۤ۟ۦۘۜۖۤۚۥۦ"
            goto L_0x0203
        L_0x0213:
            java.lang.Object r2 = r26.getTag()
            java.lang.String r27 = "ro"
            r0 = r27
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0210
            java.lang.String r2 = "ۢۗ۠ۨ۬ۡ۠۬۬ۢۛۘۧۙۛ۫ۚۧۦۗۨۜۘۚۢۚۗ"
            goto L_0x0203
        L_0x0224:
            java.lang.String r2 = "ۦ۟ۜۘۙ۟ۛ۟ۜۤۥۖۘۢ۠ۖۘۦۥۘ۠ۖۘۜۛۘۜۘۜ"
            r3 = r2
            goto L_0x0025
        L_0x0229:
            r22 = 1
            java.lang.String r2 = "ۨۥۨۘۛۥۥ۫ۤۤ۠۟ۖ۟ۗۡۘۛۙۜۘۥۙۘ"
            r3 = r2
            goto L_0x0025
        L_0x0230:
            java.lang.String r2 = "۫۬ۖۘۤۜۘۡۛۥۘ۬ۧۨ۬ۢ۫ۛۢۜۢ۟۬ۘۨۡۘۧۨۘ"
            r3 = r2
            r21 = r22
            goto L_0x0025
        L_0x0237:
            r20 = 0
            java.lang.String r2 = "ۥۛۧۦ۠ۜۘۡۢۘۘۘۜۧۘۗۢۖ۟۠ۡۘۖۛۜۦۖۤ"
            r3 = r2
            goto L_0x0025
        L_0x023e:
            java.lang.String r2 = "۬ۡۨ۫ۘۨۦۦ۫۟۠ۦۥۛۡۘ"
            r3 = r2
            r21 = r20
            goto L_0x0025
        L_0x0245:
            r3 = 1314678887(0x4e5c6867, float:9.2445741E8)
            java.lang.String r2 = "ۙۚۚۧ۠۠ۛۡۥۘۡۛۙ۠ۥۙ"
        L_0x024a:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -1742849700: goto L_0x0261;
                case -1417041194: goto L_0x0254;
                case -1403074217: goto L_0x0548;
                case -291221093: goto L_0x025c;
                default: goto L_0x0253;
            }
        L_0x0253:
            goto L_0x024a
        L_0x0254:
            java.lang.String r2 = "۠ۥۙۦۚ۬ۧۚ۠ۚۖۨۘۖۛۖ"
            r3 = r2
            goto L_0x0025
        L_0x0259:
            java.lang.String r2 = "ۗۢۧۢۖۚۘۜۚۦۡۤۡ۟۫"
            goto L_0x024a
        L_0x025c:
            if (r21 == 0) goto L_0x0259
            java.lang.String r2 = "ۧۨۦ۟۬ۥۥۗۘ۟ۤۥۘ۬ۧۜۚۘ۫۫ۦۨۢۤۦۧۢۤ"
            goto L_0x024a
        L_0x0261:
            java.lang.String r2 = "ۙۢۘۘۚ۟ۦۖۢۗ۠ۥۚۘ۫۬ۢۦۘ۬۠"
            goto L_0x024a
        L_0x0264:
            android.widget.LinearLayout r19 = new android.widget.LinearLayout
            android.content.Context r2 = com.obwhatsapp.yo.yo.getCtx()
            r0 = r19
            r0.<init>(r2)
            java.lang.String r2 = "ۙۧ۟ۨ۟۬ۜۚ۬ۤۡۘۘۛ۠۟ۛۥۜۡ۟ۙۡۧۘۗۡۨ"
            r3 = r2
            goto L_0x0025
        L_0x0274:
            int r18 = E
            java.lang.String r2 = "ۡۙۗۧۚۥۘۤۘ۠ۧ۟۬۠ۦۗ۠ۡۖۘۘۖ۬ۙۨۨۘۧ۟ۙ"
            r3 = r2
            goto L_0x0025
        L_0x027b:
            boolean r17 = D
            java.lang.String r2 = "ۧۛۦۖۘۘۙۖۥۘ۬ۖ۫ۗ۠ۦۚۖۜۘ"
            r3 = r2
            goto L_0x0025
        L_0x0282:
            r3 = 1911398444(0x71eda02c, float:2.3533307E30)
            java.lang.String r2 = "ۤۥۨۦۡۥۘۘ۟۫ۙۦ۬ۤ۫۠ۥۛ۟ۦۗ۫"
        L_0x0287:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -1936497768: goto L_0x0299;
                case -1013926762: goto L_0x029c;
                case -750765927: goto L_0x055c;
                case 1387922710: goto L_0x0291;
                default: goto L_0x0290;
            }
        L_0x0290:
            goto L_0x0287
        L_0x0291:
            if (r25 == 0) goto L_0x0296
            java.lang.String r2 = "ۨۙۧۛۦۥۘ۬ۨۜۘۛۢۦۙ۫ۡۘۤۦۥۘ۠ۧۜۘ"
            goto L_0x0287
        L_0x0296:
            java.lang.String r2 = "ۙۢ۟ۥ۫ۤۛۤۢ۟ۥۜۘۖۖۨ"
            goto L_0x0287
        L_0x0299:
            java.lang.String r2 = "ۡۘۨۧۦۜۜۧۦ۠ۥۛۨۢۦۧۖۛۦۧۘ۟۠۫"
            goto L_0x0287
        L_0x029c:
            java.lang.String r2 = "ۦۡ۬ۚۨۢ۬ۤۡۘۜ۟ۡۘ۫ۜ۫ۥۦۦۘ"
            r3 = r2
            goto L_0x0025
        L_0x02a1:
            r3 = -163887393(0xfffffffff63b46df, float:-9.496064E32)
            java.lang.String r2 = "ۗۛۧ۫۬ۥ۬ۗۤۘۖۤۖۢۦۘۖۜ۬۟ۚۦ"
        L_0x02a6:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -588837586: goto L_0x02b0;
                case 240950446: goto L_0x054d;
                case 323659714: goto L_0x02ba;
                case 1739605221: goto L_0x02bd;
                default: goto L_0x02af;
            }
        L_0x02af:
            goto L_0x02a6
        L_0x02b0:
            android.widget.LinearLayout$LayoutParams r2 = H
            if (r2 != 0) goto L_0x02b7
            java.lang.String r2 = "ۨ۠ۨۤۚۜۘۚۙۦۙۜ۟ۛۥ۟۠ۧۡۘۛۛ۫ۗۧۜ"
            goto L_0x02a6
        L_0x02b7:
            java.lang.String r2 = "ۢ۫ۘ۬۫ۦ۬ۨ۠ۛۙۜۘۖۜ۠ۛۨۜ۬ۦۜۘ"
            goto L_0x02a6
        L_0x02ba:
            java.lang.String r2 = "ۡۦۥۘ۟ۘ۟ۦۖۧۘۨ۟ۜۤۛۙۨۨۢۘۨۤۦۢ"
            goto L_0x02a6
        L_0x02bd:
            java.lang.String r2 = "ۘۦۥۘۙ۫ۖۜ۠ۦۘۡۧ۠ۗۧ"
            r3 = r2
            goto L_0x0025
        L_0x02c2:
            android.widget.LinearLayout$LayoutParams r16 = new android.widget.LinearLayout$LayoutParams
            r2 = -2
            r3 = -2
            r0 = r16
            r0.<init>(r2, r3)
            java.lang.String r2 = "ۡۢۡۛۨۘۧۡۙۘ۠۫ۖ۟ۦۘۗۥۧۙۦۥ۠۟ۚ۠۟"
            r3 = r2
            goto L_0x0025
        L_0x02d0:
            H = r16
            java.lang.String r2 = "ۙۦۡۘۤ۠ۨۘۦ۟ۜۘۥۡۡۧۚۨ۫۟ۨۘۜۚ۬ۨۢۚۙۗۧ"
            r3 = r2
            goto L_0x0025
        L_0x02d7:
            r2 = 8388613(0x800005, float:1.175495E-38)
            r0 = r16
            r0.gravity = r2
            java.lang.String r2 = "ۖۨۜۘ۠ۤۥۘۧ۬۬ۚ۟۬ۚۜ۟۟ۡۨ۫ۦۘۘۦۥۢ"
            r3 = r2
            goto L_0x0025
        L_0x02e3:
            android.widget.LinearLayout$LayoutParams r15 = H
            java.lang.String r2 = "۠ۚۘ۫ۡ۬ۤۢۡۘۦۚۤۨۡۤۦۢۦۘۛ۟ۛۛ۠ۧۨۢ۬"
            r3 = r2
            goto L_0x0025
        L_0x02ea:
            android.view.ViewGroup$LayoutParams r2 = r26.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            java.lang.String r3 = "ۘۗۚۚۤۖۙۤۥۘ۬۫ۨۢۜ۫ۛۘۖۘ"
            r14 = r2
            goto L_0x0025
        L_0x02f5:
            r3 = -1311814090(0xffffffffb1cf4e36, float:-6.0333845E-9)
            java.lang.String r2 = "ۦۦۡۘۘۥۨۘۡۘۧۤۨۘۘۗۡۙ۠ۘۥۘۖۗۘۤۙۦۘۢۥۖۘ"
        L_0x02fa:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -1485354217: goto L_0x0552;
                case -187992793: goto L_0x030f;
                case -85906940: goto L_0x0304;
                case 289182015: goto L_0x030a;
                default: goto L_0x0303;
            }
        L_0x0303:
            goto L_0x02fa
        L_0x0304:
            java.lang.String r2 = "ۥۧۜۖۚۘۘۧۥۜۘۤۦۙۙۛۙۢۨۤۡ۫ۘۦۥۘ"
            goto L_0x02fa
        L_0x0307:
            java.lang.String r2 = "ۧۜۤ۬ۧۤۡۜ۟۠ۖۦۘۥۢۥۘۦۚۤۨۙ۠"
            goto L_0x02fa
        L_0x030a:
            if (r17 == 0) goto L_0x0307
            java.lang.String r2 = "۠ۤۘۘ۠۟ۦۘۧۗۦۘ۟ۨ۫ۜۨۡۦۗ۟ۖۗۡ۬ۙۨۨۛۤ"
            goto L_0x02fa
        L_0x030f:
            java.lang.String r2 = "ۥ۠ۨۘۖ۠۠ۙۧ۟۫ۛۨ۠ۘۚۜ۟ۢۡۘ"
            r3 = r2
            goto L_0x0025
        L_0x0314:
            int r2 = r14.rightMargin
            int r2 = r2 - r18
            r15.rightMargin = r2
            java.lang.String r2 = "۟۟ۖۧۡۡۡۙۘ۠ۨ۬۠ۛۦۘ۟ۙۤ۫۟ۜۚۗ"
            r3 = r2
            goto L_0x0025
        L_0x031f:
            android.widget.LinearLayout$LayoutParams r2 = H
            r0 = r24
            int r3 = -r0
            r2.leftMargin = r3
            java.lang.String r2 = "ۦۗۜۘۡۛۚۛ۬ۡۘۦۙۖۢۘ۫۫ۢۨۛۥۜ"
            r3 = r2
            goto L_0x0025
        L_0x032b:
            int r2 = r14.leftMargin
            int r2 = r2 - r18
            r15.leftMargin = r2
            java.lang.String r2 = "ۧ۟۠ۥۤۛ۫ۜۚۥۘۢۤۨۥۧۨۖۘ"
            r3 = r2
            goto L_0x0025
        L_0x0336:
            android.widget.LinearLayout$LayoutParams r2 = H
            r0 = r24
            int r3 = -r0
            r2.rightMargin = r3
            java.lang.String r2 = "ۧۦۢۗ۠۠۟ۘۜۘۚۢ۬ۗۜ۟"
            r3 = r2
            goto L_0x0025
        L_0x0342:
            android.widget.LinearLayout$LayoutParams r13 = H
            java.lang.String r2 = "ۦۧۙۗۖۛۥۗۡۘۧۜ۫ۗۤۧۧ۠ۜۘۖۦۥ۟ۧۧۗ۠ۧ"
            r3 = r2
            goto L_0x0025
        L_0x0349:
            java.lang.String r2 = "ۜۘۤۡ۠ۖۨۙۘۘۢۡۥۘۧۙۘۘۙ۠ۙۤۜۡۘۦۥ۫ۤ۟ۖ"
            r3 = r2
            r12 = r13
            goto L_0x0025
        L_0x034f:
            r3 = -1937409618(0xffffffff8c8579ae, float:-2.0565128E-31)
            java.lang.String r2 = "ۧۧۙۨۨۜ۠ۧ۟ۨ۬ۨۘۥۦۜۘ۬ۡ۠ۙۚۥۘۡۢ"
        L_0x0354:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -1166156721: goto L_0x035e;
                case -1130090252: goto L_0x036d;
                case -373943369: goto L_0x0370;
                case -120900076: goto L_0x0366;
                default: goto L_0x035d;
            }
        L_0x035d:
            goto L_0x0354
        L_0x035e:
            java.lang.String r2 = "ۘۢۖۘۖ۬ۨۘ۫۟ۙۖۤۜۤۢۗ۠ۥۦۘ"
            r3 = r2
            goto L_0x0025
        L_0x0363:
            java.lang.String r2 = "ۘۛۖۘۥۜۤۨ۫ۡۘۢ۫ۖۘۦۙۤ۟ۤۤۨۡۥۖ۫ۖ۠ۦۗ"
            goto L_0x0354
        L_0x0366:
            android.widget.LinearLayout$LayoutParams r2 = G
            if (r2 != 0) goto L_0x0363
            java.lang.String r2 = "ۢۡ۬ۙۥۧۙۦۛۡۛ۬ۦۢۨ"
            goto L_0x0354
        L_0x036d:
            java.lang.String r2 = "ۚ۫۟ۥۖۘۜ۫ۖۙۜۡۘ۠ۧۨۘۨۖۦ"
            goto L_0x0354
        L_0x0370:
            java.lang.String r2 = "ۛۥۥۘۡ۬۠۫ۧ۠۬ۘۧۡۨۗۢۤۦۚۥۘۘۘ"
            r3 = r2
            goto L_0x0025
        L_0x0375:
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r27 = -2
            r0 = r27
            r2.<init>(r3, r0)
            G = r2
            java.lang.String r2 = "ۘۢۖۘۖ۬ۨۘ۫۟ۙۖۤۜۤۢۗ۠ۥۦۘ"
            r3 = r2
            goto L_0x0025
        L_0x0386:
            android.widget.LinearLayout$LayoutParams r11 = G
            java.lang.String r2 = "۬۫ۦۙۜۘۢۜۡۘ۠۟ۜۘ۠ۗۜۦۨۜۥۘۤ۬ۥۘ۬ۦ"
            r3 = r2
            goto L_0x0025
        L_0x038d:
            r0 = r24
            int r10 = -r0
            java.lang.String r2 = "ۜۚۦۡۨۥۘۧۨۘ۟ۘۡۘۤۚۘۘۜ۫ۦۡۥ۠ۧ۟۫ۚۚۙ"
            r3 = r2
            goto L_0x0025
        L_0x0395:
            r3 = -1277790096(0xffffffffb3d67870, float:-9.987059E-8)
            java.lang.String r2 = "ۛۙۤۦ۫ۜۘۡۧۨۘۚۘ۠ۗ۫ۧ"
        L_0x039a:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -1163645666: goto L_0x03a4;
                case -341134011: goto L_0x0561;
                case -102737115: goto L_0x03ac;
                case -31846179: goto L_0x03af;
                default: goto L_0x03a3;
            }
        L_0x03a3:
            goto L_0x039a
        L_0x03a4:
            if (r17 == 0) goto L_0x03a9
            java.lang.String r2 = "ۖ۠ۖۘۗۚ۠ۨۢ۫ۖۥۦۛۖۧ"
            goto L_0x039a
        L_0x03a9:
            java.lang.String r2 = "ۖۧۦۙ۠ۡۙۤۧۡۡۙۘ۫"
            goto L_0x039a
        L_0x03ac:
            java.lang.String r2 = "ۤۨۨۧۢۨۘۧۙۗۨۢۤۛۨۖۘ۟ۧۘ"
            goto L_0x039a
        L_0x03af:
            java.lang.String r2 = "ۡۖۦۘۖۙۜۘۗۦۨۘۢ۟ۦۘۙۖۡۘ"
            r3 = r2
            goto L_0x0025
        L_0x03b4:
            r11.rightMargin = r10
            java.lang.String r2 = "ۨۧ۬ۧۘۡۙۥ۬ۦ۠ۘۘۧۨۜۢۚۨۢۚ۟"
            r3 = r2
            goto L_0x0025
        L_0x03bb:
            android.view.ViewGroup$LayoutParams r2 = r26.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.leftMargin
            int r2 = r2 - r18
            r11.leftMargin = r2
            java.lang.String r2 = "ۚۜۛۡ۫ۢ۬۟ۘۘۥۢۖۘۜ۠ۨۘۛ۟ۡۥۡ۠ۦۦۗ"
            r3 = r2
            goto L_0x0025
        L_0x03cc:
            r11.leftMargin = r10
            java.lang.String r2 = "ۙۗۦۢ۠ۡۥۦۖۨۜ۫ۗۦۖۘ۬ۗ۫ۚ۬۠ۥۨۨۘۘۤ"
            r3 = r2
            goto L_0x0025
        L_0x03d3:
            android.view.ViewGroup$LayoutParams r2 = r26.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.rightMargin
            int r2 = r2 - r18
            r11.rightMargin = r2
            java.lang.String r2 = "۟۠ۗۚۜۜۛۢۗۨ۠ۚ۫ۙۜ۫ۦ۫ۧۡ۠"
            r3 = r2
            goto L_0x0025
        L_0x03e4:
            android.widget.LinearLayout$LayoutParams r9 = G
            java.lang.String r2 = "ۤۡ۬ۖۗۥۦ۬ۢۥۥۧۘۙۙۤ"
            r3 = r2
            goto L_0x0025
        L_0x03eb:
            java.lang.String r2 = "ۧۤۥ۠ۘۘۘۛۡۘۖۙۙ۫ۢۜۥۡ۠۟ۤ۠"
            r3 = r2
            r12 = r9
            goto L_0x0025
        L_0x03f1:
            r0 = r19
            r0.setLayoutParams(r12)
            java.lang.String r2 = "ۧ۫ۥۨۚ۬۟ۖ۟ۙ۫ۛ۟۬ۖۨۥ"
            r3 = r2
            goto L_0x0025
        L_0x03fb:
            java.lang.String r2 = "yo"
            r0 = r19
            r0.setTag(r2)
            java.lang.String r2 = "ۨۤۥ۬۬ۘۘۖۚۘۘۤۚۥۗ۠ۘۘ"
            r3 = r2
            goto L_0x0025
        L_0x0407:
            r2 = 0
            r0 = r19
            r0.setOrientation(r2)
            java.lang.String r2 = "ۥ۬ۦ۠ۥۘۘ۠ۗۘۘۤ۬ۦۘۙۘۖۘۚۥۨۜ۬ۖۘۚۖۜۘ"
            r3 = r2
            goto L_0x0025
        L_0x0412:
            r3 = 1873038421(0x6fa44c55, float:1.0169564E29)
            java.lang.String r2 = "۬ۘۥۘۚ۬ۧۧۚۦۢ۟ۖۘۦ۫ۜۘۤۨ۠۬ۘۨ"
        L_0x0417:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -1734759841: goto L_0x042c;
                case -1064144609: goto L_0x0570;
                case -559840479: goto L_0x0429;
                case 1767487752: goto L_0x0421;
                default: goto L_0x0420;
            }
        L_0x0420:
            goto L_0x0417
        L_0x0421:
            if (r25 == 0) goto L_0x0426
            java.lang.String r2 = "ۧۘۥۙۡۘۢۤ۫ۜۗۖ۫۟ۘ۠۫۟ۘۖۡۙۨ"
            goto L_0x0417
        L_0x0426:
            java.lang.String r2 = "ۦۗۤۙۜ۫ۢ۟ۜۘۢۜۨۜ۬ۖۘۨ۬ۖۖۤۘ"
            goto L_0x0417
        L_0x0429:
            java.lang.String r2 = "ۖۜ۠ۧۥۧۘۤۚ۬ۙۚۘۘۡۡ۟ۧۧۚۚۛۨۘۖۦ"
            goto L_0x0417
        L_0x042c:
            java.lang.String r2 = "ۤۨۛ۠ۥۚۘۢۦۘۧۡ۠ۜ۫ۥۨۦۧۘ"
            r3 = r2
            goto L_0x0025
        L_0x0431:
            android.widget.LinearLayout$LayoutParams r2 = K
            r0 = r26
            r0.setLayoutParams(r2)
            java.lang.String r2 = "ۜۗ۠ۗۘۚۥۗۛۗۖ۠ۚۛۖۘۗۧۡۦ۠۟ۖۙۡ"
            r3 = r2
            goto L_0x0025
        L_0x043d:
            android.view.ViewGroup$LayoutParams r2 = r26.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r3 = 0
            r2.rightMargin = r3
            java.lang.String r2 = "ۢۡ۬ۘۛۘۘ۟ۢۡۚۖۦۘ۬ۚ۠ۜۨ۬ۜ"
            r3 = r2
            goto L_0x0025
        L_0x044b:
            android.view.ViewGroup$LayoutParams r2 = r26.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r3 = 0
            r2.leftMargin = r3
            java.lang.String r2 = "۟۟ۤۚۦ۫ۛۥۦۘۦۤۖۘ۟ۖۡۘ۟ۘۘۘۛۦۤۤ۠ۚۘ۠ۥ"
            r3 = r2
            goto L_0x0025
        L_0x0459:
            java.lang.String r2 = "ro"
            r0 = r26
            r0.setTag(r2)
            java.lang.String r2 = "ۧۚ۟ۥ۠ۢ۬ۘۥۘۗۢۛۚ۬۫۬۬ۘۘۗ۫ۗۦۖۘ"
            r3 = r2
            goto L_0x0025
        L_0x0465:
            r8 = 0
            java.lang.String r2 = "۫ۖۘۦۘۧۘۙ۫۟ۡۦ۬ۢۙۧۦۜۘ"
            r3 = r2
            goto L_0x0025
        L_0x046b:
            java.lang.String r2 = "ۤۖۧۘۧۙۖۛۢۦۘ۟ۡۘۘ۫ۨۧۘ۠ۦۦ"
            r3 = r2
            r7 = r8
            goto L_0x0025
        L_0x0471:
            r3 = 625123027(0x25429ed3, float:1.688063E-16)
            java.lang.String r2 = "۠ۨ۬ۨۜۜۘ۫ۥۥۤۖۗ۟ۥۡۘۢ۬ۦۘۢ۬ۥۘۡۡۨۘ"
        L_0x0476:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -2097203360: goto L_0x0480;
                case 835699466: goto L_0x0491;
                case 961649255: goto L_0x0488;
                case 1815872265: goto L_0x0494;
                default: goto L_0x047f;
            }
        L_0x047f:
            goto L_0x0476
        L_0x0480:
            java.lang.String r2 = "ۨۗۨۖۡۙۛ۠ۗ۠ۦۧ۬۟ۥ"
            r3 = r2
            goto L_0x0025
        L_0x0485:
            java.lang.String r2 = "ۦۡ۫ۥۜۨۡۡۜ۟ۖۥۘۖۘۤ۠ۨۘۨۦۧۘۤۗۨ"
            goto L_0x0476
        L_0x0488:
            int r2 = r29.getChildCount()
            if (r7 >= r2) goto L_0x0485
            java.lang.String r2 = "ۜۚۤۜۤۨۜۥۗۢۦۙۗۥۨ۫ۨۥۘ۠۠ۢ"
            goto L_0x0476
        L_0x0491:
            java.lang.String r2 = "۠۠ۘۡۚۧۡۡ۫ۛۜۘۨۚۡۨۡۘۘۘۡۜۧۛۛ"
            goto L_0x0476
        L_0x0494:
            java.lang.String r2 = "۬ۤۜۘۙۜۦۘۦۚۘۘ۟۫ۨۘۡۦۙ"
            r3 = r2
            goto L_0x0025
        L_0x0499:
            r0 = r29
            android.view.View r6 = r0.getChildAt(r7)
            java.lang.String r2 = "ۜۗۤۤۨۢۨۜۥۢۦۢۘۘۨۘۥۜۨۜۙ۟"
            r3 = r2
            goto L_0x0025
        L_0x04a4:
            r0 = r29
            r0.removeViewAt(r7)
            java.lang.String r2 = "ۥۗۥۘ۟۬ۦۘۦۧ۫ۜۚۗ۬ۚ۬"
            r3 = r2
            goto L_0x0025
        L_0x04ae:
            r0 = r19
            r0.addView(r6)
            java.lang.String r2 = "ۘۖ۠ۥۜۨۜۥۘۘۡۚۘ۫۠ۥۘۨۚۘ۠ۢۧۡۤ"
            r3 = r2
            goto L_0x0025
        L_0x04b8:
            int r5 = r7 + 1
            java.lang.String r2 = "ۧۗ۟ۢۗ۫۫ۧۧ۫ۜۦۘۚۜ۬ۨ۠ۘۘ۬ۙۖۦۘۧۘ"
            r3 = r2
            goto L_0x0025
        L_0x04bf:
            java.lang.String r2 = "۬ۦۦ۟۫ۨۘۗۥۧۘۗۧۖۛۜۖۘۜ۟۫"
            r3 = r2
            r7 = r5
            goto L_0x0025
        L_0x04c5:
            android.widget.ImageView r4 = new android.widget.ImageView
            android.content.Context r2 = com.obwhatsapp.yo.yo.getCtx()
            r4.<init>(r2)
            java.lang.String r2 = "ۧۛۡۗۜۖۛۦۘۢ۟ۨۦۤۜۘۥ۫ۥۘۥ۠ۖۖۖۘۛۖ۠"
            r3 = r2
            goto L_0x0025
        L_0x04d3:
            int r2 = A
            r4.setId(r2)
            java.lang.String r2 = "ۙۤۦۘ۟۫۬ۨ۫ۥۘ۬ۗۘۖ۠ۧۙ۫ۨۙۖ۠ۤۦ۠۟ۛۘ"
            r3 = r2
            goto L_0x0025
        L_0x04dd:
            r3 = -613501461(0xffffffffdb6eb5eb, float:-6.7191065E16)
            java.lang.String r2 = "ۗۘۖۨۛۡۙۥۥۖۨۖۘۗۜۡۘ"
        L_0x04e2:
            int r27 = r2.hashCode()
            r27 = r27 ^ r3
            switch(r27) {
                case -2019984674: goto L_0x04f7;
                case -1700295069: goto L_0x057a;
                case -283384133: goto L_0x04f2;
                case -69229855: goto L_0x04ec;
                default: goto L_0x04eb;
            }
        L_0x04eb:
            goto L_0x04e2
        L_0x04ec:
            java.lang.String r2 = "ۗۡۛۗۛۡۘۡۢۜۘۢ۫ۡ۫ۛۦ۟۬ۖۘۗۦۨۘ"
            goto L_0x04e2
        L_0x04ef:
            java.lang.String r2 = "ۦ۠ۦۚ۠۟ۜ۫ۜۘۖ۟۬۫ۘۨۘ"
            goto L_0x04e2
        L_0x04f2:
            if (r25 == 0) goto L_0x04ef
            java.lang.String r2 = "ۧۘۚۘۖۙ۬ۖۘۛۢۢۡۨ۠ۗۙۖۘ۬ۚۨۚۜۨ"
            goto L_0x04e2
        L_0x04f7:
            java.lang.String r2 = "۬ۧ۟۫ۨ۠ۤ۬ۧۖۘۘۗۦۘۛۚۙ"
            r3 = r2
            goto L_0x0025
        L_0x04fc:
            android.widget.LinearLayout$LayoutParams r2 = J
            r4.setLayoutParams(r2)
            java.lang.String r2 = "ۡۚۙۤۜۨۦۦۥۢۜ۟ۖۘۢۦۗۢۛۗۗ"
            r3 = r2
            goto L_0x0025
        L_0x0506:
            r0 = r19
            r0.addView(r4)
            java.lang.String r2 = "ۘۖۘۘۖۜۢۧۖۡۘۖۙۚۘۚۢ"
            r3 = r2
            goto L_0x0025
        L_0x0510:
            android.widget.LinearLayout$LayoutParams r2 = I
            r4.setLayoutParams(r2)
            java.lang.String r2 = "ۗۙ۟ۛۨ۬ۡۥۘۢۢۤ۠ۥۘۖۨۨۛۡۢۚۗ۠ۨۧۨۘ"
            r3 = r2
            goto L_0x0025
        L_0x051a:
            r2 = 0
            r0 = r19
            r0.addView(r4, r2)
            java.lang.String r2 = "ۚۘۛۜۛۥۢۦۜۘ۠ۡۜۘ۫ۤۢۖۜۜۘ"
            r3 = r2
            goto L_0x0025
        L_0x0525:
            r0 = r29
            r1 = r19
            r0.addView(r1)
            java.lang.String r2 = "ۥ۬ۦۘۚۚۧ۬ۚۤۙۧ۟ۛۦۙ۬ۙۡۘۙۧۦۘ"
            r3 = r2
            goto L_0x0025
        L_0x0531:
            r26 = r19
        L_0x0533:
            return r26
        L_0x0534:
            java.lang.String r2 = "ۧ۟ۜۛ۫ۛ۟ۙۗۘۖۥۘۛۤۤۨۖۦ۠ۖۘۘ"
            r3 = r2
            goto L_0x0025
        L_0x0539:
            java.lang.String r2 = "۬ۤۦۘۦۙ۫ۤۡ۬ۢۤ۬ۦۧ۠ۙ۠ۜۘ۫ۘۤ۬۫ۦۘ"
            r3 = r2
            goto L_0x0025
        L_0x053e:
            java.lang.String r2 = "ۙۛۥۜۧ۠ۨ۬۟ۥۢۖۘۤۘ۫۠ۧۜۘۜۚ"
            r3 = r2
            goto L_0x0025
        L_0x0543:
            java.lang.String r2 = "۬ۡۨ۫ۘۨۦۦ۫۟۠ۦۥۛۡۘ"
            r3 = r2
            goto L_0x0025
        L_0x0548:
            java.lang.String r2 = "ۥ۬ۛۡ۟ۡۦ۟ۡۜۤۖۘۥۧۧۨۖۥۢ۬ۦۘۥۜۧ"
            r3 = r2
            goto L_0x0025
        L_0x054d:
            java.lang.String r2 = "ۖۨۜۘ۠ۤۥۘۧ۬۬ۚ۟۬ۚۜ۟۟ۡۨ۫ۦۘۘۦۥۢ"
            r3 = r2
            goto L_0x0025
        L_0x0552:
            java.lang.String r2 = "ۙۗۧۗۖۧ۟ۛۡۘ۠ۨۗ۟ۧۙ"
            r3 = r2
            goto L_0x0025
        L_0x0557:
            java.lang.String r2 = "ۧۦۢۗ۠۠۟ۘۜۘۚۢ۬ۗۜ۟"
            r3 = r2
            goto L_0x0025
        L_0x055c:
            java.lang.String r2 = "۫ۗۥۘۦۜۚۛ۠ۜۦۙۨۘ۠ۧۖۘ"
            r3 = r2
            goto L_0x0025
        L_0x0561:
            java.lang.String r2 = "ۘۗۛۢۙ۬ۖۧۘۘۤۛۖۤ۫ۖۘ۫ۖۖۢۖۢ"
            r3 = r2
            goto L_0x0025
        L_0x0566:
            java.lang.String r2 = "۟۠ۗۚۜۜۛۢۗۨ۠ۚ۫ۙۜ۫ۦ۫ۧۡ۠"
            r3 = r2
            goto L_0x0025
        L_0x056b:
            java.lang.String r2 = "ۧۤۥ۠ۘۘۘۛۡۘۖۙۙ۫ۢۜۥۡ۠۟ۤ۠"
            r3 = r2
            goto L_0x0025
        L_0x0570:
            java.lang.String r2 = "ۜۗ۠ۗۘۚۥۗۛۗۖ۠ۚۛۖۘۗۧۡۦ۠۟ۖۙۡ"
            r3 = r2
            goto L_0x0025
        L_0x0575:
            java.lang.String r2 = "ۤۖۧۘۧۙۖۛۢۦۘ۟ۡۘۘ۫ۨۧۘ۠ۦۦ"
            r3 = r2
            goto L_0x0025
        L_0x057a:
            java.lang.String r2 = "۟ۤۜۧۙۥۦۡۖۘۘ۟ۨۦۡۗۡۘۡۘۢۥۛۨۖۘ"
            r3 = r2
            goto L_0x0025
        L_0x057f:
            java.lang.String r2 = "ۚۘۛۜۛۥۢۦۜۘ۠ۡۜۘ۫ۤۢۖۜۜۘ"
            r3 = r2
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.setPicO(android.view.ViewGroup, X.0tZ):android.view.View");
    }

    public static void setQView(View view) {
        String str = "ۜۥ۫ۨۦۤۚۦۨۦۖۧۘۥۗۥۚ۫۠ۚۛۧۘۡۥ";
        while (true) {
            try {
                switch (str.hashCode() ^ -2026733907) {
                    case -615555642:
                        if (shp.getIsGradiet("quoted_bg_picker")) {
                            str = "ۖ۟ۘۘۥۙۦۘۛۗۡ۫ۚۘۜۜۖۘۦۡۜۘۜۥۤۤ۠ۡۜۛۛ";
                            break;
                        } else {
                            str = "ۡۤۥ۠۫ۤۘۥ۫ۖۖۙۙۦ۟ۢۧۦۤ۠۬";
                            continue;
                        }
                    case -318402046:
                        int color = others.getColor("quoted_bg_picker", -11);
                        String str2 = "ۢۗ۫ۛۜۘۘ۬ۖۥۜۖۤۨۗۢ۬ۡۧۘ۫۬ۡۛ۬ۧ";
                        while (true) {
                            switch (str2.hashCode() ^ -1257119562) {
                                case -1843746369:
                                    if (color != -11) {
                                        str2 = "۫۬ۤۤۥۜۘۥۘۡۦ۠ۙ۠ۥۘۖۡ۬ۥۤۖۚۗۙ";
                                        break;
                                    } else {
                                        str2 = "ۥ۟ۖۜۖۘۥۤ۠ۦۧۨۧۦ۠ۗۛ۬";
                                        continue;
                                    }
                                case -677630378:
                                    view.setBackgroundColor(color);
                                    String str3 = "ۨۨ۠ۢ۠ۦۘۘۤۧۢ۬ۤۘۨۡۙۛ۠ۥۗ۫ۦۙۨۧۡۤ";
                                    while (true) {
                                        switch (str3.hashCode() ^ -2007327805) {
                                            case -698669266:
                                                break;
                                            case -609358991:
                                                if (Build.VERSION.SDK_INT >= 23) {
                                                    str3 = "ۘ۟ۘۘۤۜۖۗۘۡۘۢۙۡۘ۫ۥۚ";
                                                    break;
                                                } else {
                                                    str3 = "ۙۧۥۘۙۥۦۘۙۡۙۖۜۖ۫ۗۜۘ۠ۗۚ۟ۙۖۨۖ";
                                                    continue;
                                                }
                                            case -201909664:
                                                str3 = "ۢۙۘۘۚۖۛ۬ۢۘ۫ۛۥۘۡۛۢ";
                                                continue;
                                            case -85550872:
                                                i.c(view);
                                                break;
                                            default:
                                                continue;
                                        }
                                    }
                                case 1217334041:
                                    break;
                                case 1352105074:
                                    str2 = "ۜۥۜۨۧۖۘۥۚ۫۬۟ۨۘ۟ۤۨۘۖۘۚۧۗۥۖ۬ۥۘ";
                                    continue;
                                default:
                                    continue;
                            }
                        }
                    case 1313955402:
                        view.setBackground(shp.getGradientDrawable("quoted_bg_picker"));
                        String str4 = "ۤۡۡۘۡۤۘۘ۫ۗ۬ۜۨۢۗۚۗۛ۬ۖۘ";
                        while (true) {
                            switch (str4.hashCode() ^ -356613162) {
                                case -291727040:
                                    str4 = "ۛۛ۫ۚۤۥۘ۬ۛۖۘۥۡۘۧۦۨۘۚۢۘۘۨۙۦۜ۫ۖۘۧۦۧۘ";
                                    continue;
                                case 55341740:
                                    if (Build.VERSION.SDK_INT >= 23) {
                                        str4 = "ۙۗۘۦۧۘۧۜۦۜ۠ۗۖۥ۬ۛ۟ۙۡۚۡۘۡۘ۫ۧۥۡ";
                                        break;
                                    } else {
                                        str4 = "ۨۚ۟ۗۙۙۡۦۖۘۘۛۜۘۚۗۜ";
                                        continue;
                                    }
                                case 604455018:
                                    i.c(view);
                                    break;
                                case 1013489081:
                                    break;
                                default:
                                    continue;
                            }
                        }
                    case 1773478987:
                        str = "ۦۛۢۘۚۥۘۥۥۢۚۘۖۧۥ۬ۤۘ۫ۖۚ۬";
                        continue;
                    default:
                        continue;
                }
            } catch (Exception e2) {
                return;
            }
        }
        ((TextView) view.findViewById(f524m)).setTextColor(f519h);
        ((TextView) view.findViewById(f525n)).setTextColor(f520i);
        View findViewById = view.findViewById(f526o);
        findViewById.post(new u(findViewById, 1));
    }

    public static void setStkrBalloon(C30011bb r4, ViewGroup viewGroup, Drawable drawable) {
        String str = "ۜۛۜۘۖۦۧۢۤۡۥ۬ۡۘۙ۬ۧ۠۟ۡۗۙۨۡۙ";
        while (true) {
            switch ((str.hashCode() ^ 602) ^ -546081604) {
                case -1784916678:
                    a(r4.getFMessage().A11.A02, drawable);
                    str = "ۡۙۢۧۗۚۘ۬ۙۦۙۥۘ۬ۜۤ۬ۙ۬۬ۡ۠ۥ۬۟ۗۛۙ";
                    break;
                case -1559634807:
                    String str2 = "ۜۦۥۚۚۡۘۚ۟ۥۚۛۘۡ۬ۨ";
                    while (true) {
                        switch (str2.hashCode() ^ 578081821) {
                            case -580421480:
                                str = "ۙۦ۬ۗۛۢۜ۠ۛ۫ۥۛۡۡۦۘۨۧۖۘ";
                                continue;
                            case -432347383:
                                if (drawable != null) {
                                    str2 = "ۚ۬ۜ۠ۦ۠۫ۛۙ۬ۥۖۥۤۥۘۥۡۥۘ";
                                    break;
                                } else {
                                    str2 = "ۡۗۨۘۤ۫۟ۖۨۢ۬ۚۘۘۧۡۖۛۖۜۘ";
                                    break;
                                }
                            case -284369702:
                                str2 = "ۗۢۘۦۚ۬ۡۙۦ۬۠ۜۢۜۧ";
                                break;
                            case 703057013:
                                str = "ۢ۟ۨۘۨۛۦۥۥۦۘۚۖۤۡۙۘ";
                                continue;
                        }
                    }
                    break;
                case -977256620:
                    viewGroup.setBackground(drawable);
                    str = "ۡۖۡۘۢۡۜۜۗۧۢۡۘۤۛۥۗۦۨۘۙۗۜ";
                    break;
                case -515848951:
                case 1638263766:
                    return;
                case -247169458:
                    str = "۠ۧۗۡۚۛۤ۠ۥۢۥ۫ۚۨۥۘ۠ۡ۟ۘۙۙۦ۬ۨۦ۬ۥۘ";
                    break;
                case 932918281:
                    str = "ۘ۟ۙۚۢۦ۟۫ۥۘۜۡ۫ۜۘۖۘۡۖۛۤۢۖۖۖۡۙۙۙ";
                    break;
                case 1204251973:
                    str = "ۖ۫۟ۦۧۚۦۙۤۙۥۘۘۡۢ۟ۗۡۗۦ۫ۢۙۡ";
                    break;
            }
        }
    }

    public static void showUserGrpMsgs(C16010sH r6) {
        String str = "ۘ۫۠ۙ۠ۦۘۢ۬ۛۤ۬۬ۗۡۛۢ۠ۘۗۡۡۘۤۘۥ";
        String str2 = null;
        String str3 = null;
        while (true) {
            switch ((str.hashCode() ^ 904) ^ 693811688) {
                case -1036696185:
                    return;
                case -566307452:
                    str = "۠ۜۙۙۖۤۡۜۛۨ۬ۜ۟ۢۤ۫ۖۘۡ۟ۢۙۜ۫";
                    str3 = f514c;
                    break;
                case -476398415:
                    f515d.startActivity(new Intent(f515d, ChatGenSingle.class).putExtra("messagestodisplay", "groupmsgs").putExtra("chat_jid", str3).putExtra("user_jid", str2).putExtra("thisConvoIntent", f515d.getIntent()));
                    str = "ۨۛۜۘۢۤۥۘۧۥۦۘۗۨۨۜ۬ۖۘۜۡۜۘۨۨۧۘ";
                    break;
                case 312991982:
                    str = "ۥۦۖۜۨۥۡۢ۟۫ۨۧۛۤ۟ۚۗۧ";
                    break;
                case 2110686674:
                    str2 = dep.getJID_data(r6);
                    str = "ۡۖۢۧۡۦۤۨۥۘۢۤ۫ۦۧۡۗۚ۬۫ۜۢۦۨۥۘ۬۠ۥۘ";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        r0 = "ۗ۬ۥۘۗۨۡۥ۟۬۫ۦۤۧۙۨۘ۠ۜۦۥۖۖ۟ۘۜۘۢۢۦۘ";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void tvBalloons(android.widget.TextView r7) {
        /*
            r6 = -11
            r2 = 0
            r1 = 0
            java.lang.String r0 = "ۗۧ۟ۗۘ۟۫ۙ۬ۦۥۨۘ۫ۡ۫"
        L_0x0006:
            int r3 = r0.hashCode()
            r4 = 654(0x28e, float:9.16E-43)
            r5 = 817710184(0x30bd4468, float:1.3771002E-9)
            r3 = r3 ^ r4
            r3 = r3 ^ r5
            switch(r3) {
                case -1969915956: goto L_0x006e;
                case -1843240989: goto L_0x009b;
                case -1618789261: goto L_0x00c1;
                case -1337414701: goto L_0x0075;
                case -1300007957: goto L_0x007e;
                case -1294622447: goto L_0x0015;
                case -36342547: goto L_0x0060;
                case 28175980: goto L_0x0055;
                case 398395333: goto L_0x00cc;
                case 718981239: goto L_0x00b8;
                case 916980446: goto L_0x0037;
                case 1760861344: goto L_0x0018;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0006
        L_0x0015:
            java.lang.String r0 = "ۜ۫۬ۜ۬ۨۛۘۥۛۨۖۘۛۛۖۖۡ۠ۡ"
            goto L_0x0006
        L_0x0018:
            r3 = -513440496(0xffffffffe1658510, float:-2.6461828E20)
            java.lang.String r0 = "ۢۛۦۤۥۨۨۖۥۘ۠ۜۦ۬ۢۥۘۦۦۘۘۧۧۘۘۘۤۤ"
        L_0x001d:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -2015159030: goto L_0x0026;
                case -1406490928: goto L_0x002c;
                case -791730106: goto L_0x0034;
                case 967152174: goto L_0x0031;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x001d
        L_0x0026:
            java.lang.String r0 = "ۗ۬ۥۘۗۨۡۥ۟۬۫ۦۤۧۙۨۘ۠ۜۦۥۖۖ۟ۘۜۘۢۢۦۘ"
            goto L_0x0006
        L_0x0029:
            java.lang.String r0 = "ۚۦۢ۠۬۫ۢۤۖۘۚ۫ۜۡۦۘ۟ۘۥۘۨۦۧۘۗ۠ۡ۫ۨ۟"
            goto L_0x001d
        L_0x002c:
            if (r7 == 0) goto L_0x0029
            java.lang.String r0 = "۟ۜ۬ۥۚۡۧۚۡۘۡۗ۫ۙۡۘۤۡۦ۠ۧۨۘ"
            goto L_0x001d
        L_0x0031:
            java.lang.String r0 = "ۤ۬ۘۘۘۜۤۢۚۚۜۢۙۢۗۨۤۙۥۘۢۦۦۙ۬ۜۨۥ"
            goto L_0x001d
        L_0x0034:
            java.lang.String r0 = "۟ۢ۫۬ۜۘۘۤۚۗۡۦۜۘ۟ۥۦ۟ۥۚۜۨۖ۬۬ۦ۫ۙۨۘ"
            goto L_0x0006
        L_0x0037:
            r3 = -1642237225(0xffffffff9e1d72d7, float:-8.335259E-21)
            java.lang.String r0 = "ۦۛۜۘۗۚۗۡۨۜ۠ۤۛۖۙۦۨۧۚ"
        L_0x003c:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -1336565170: goto L_0x0052;
                case -1324453320: goto L_0x00c8;
                case 1023484266: goto L_0x004b;
                case 1505407562: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x003c
        L_0x0045:
            java.lang.String r0 = "۫ۖ۬۟ۥۥۤۘۧۦۥۘ۬ۢۦۢ۟ۘۗۘۨۘ۠ۥۡۘ۠۬ۖۘ"
            goto L_0x0006
        L_0x0048:
            java.lang.String r0 = "۟ۥۤۙ۟ۛۥۘۖۘۨۧۜۙۥۢ۫ۜ۫ۘۙۤۦۜۘ۫ۖۨۘ"
            goto L_0x003c
        L_0x004b:
            int r0 = com.obwhatsapp.yo.ColorStore.f510q
            if (r0 != r6) goto L_0x0048
            java.lang.String r0 = "۟ۛ۟ۗۧۖۨۘۖۢۜۡۥۡۜۘۘۢۨۘۛۛۘۘۤۗۢ"
            goto L_0x003c
        L_0x0052:
            java.lang.String r0 = "۟ۡ۠ۤۤ۫ۗۢۢۢ۫۠ۛ۬۠ۧۜۖۨۡ۟ۢۥۦ۠ۡ"
            goto L_0x003c
        L_0x0055:
            java.lang.String r0 = "conversation_divider_text"
            int r0 = com.obwhatsapp.yo.yo.getResColor(r0)
            com.obwhatsapp.yo.ColorStore.f510q = r0
            java.lang.String r0 = "ۤۚ۫ۗۖۨۘۨ۠ۜۖۖۡۘۢۡ۬ۙۜۨ۠۫ۘۧۙۢ۫ۥۗ"
            goto L_0x0006
        L_0x0060:
            java.lang.String r0 = "date_divider_color_picker"
            int r3 = com.obwhatsapp.yo.ColorStore.f510q
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r3)
            r7.setTextColor(r0)
            java.lang.String r0 = "ۚ۟ۘۘۙۧۘ۟ۦۗۦ۟ۖۧۙۡۧۥۦۘۥۢۥ۫ۚۘۘ"
            goto L_0x0006
        L_0x006e:
            android.graphics.drawable.Drawable r2 = r7.getBackground()
            java.lang.String r0 = "ۘۨ۫ۥۦۘۘۧۚۨۦۧۨۡۖۖۢ۠ۜ۫ۢۗ"
            goto L_0x0006
        L_0x0075:
            java.lang.String r0 = "date_bubble_color_picker"
            int r1 = com.obwhatsapp.youbasha.others.getColor(r0, r6)
            java.lang.String r0 = "ۦۜۧۘۙۨۦۥۢۡۘۖۙ۫ۛ۫ۤۢۖۚۦ۟ۘۤۦۘ"
            goto L_0x0006
        L_0x007e:
            r3 = -1203018197(0xffffffffb84b662b, float:-4.8494123E-5)
            java.lang.String r0 = "۬ۢۖۘۛۖۡۘۢۢۥۘۧۚۨ۟۫ۖۘ"
        L_0x0083:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -957739356: goto L_0x0026;
                case -482395284: goto L_0x0094;
                case 449712621: goto L_0x008c;
                case 913782247: goto L_0x0097;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x0083
        L_0x008c:
            if (r1 == r6) goto L_0x0091
            java.lang.String r0 = "۟ۨۖۗۖۧۘۗۨۛۡۘۤۦۖۘۤۘۨۘۢۢ۟۟ۦۡ"
            goto L_0x0083
        L_0x0091:
            java.lang.String r0 = "ۜۥۜۦۙۖۘ۟ۖۘۛ۬۠۠ۘۨۘۧۙۘۗۗۜ۟ۨ۬"
            goto L_0x0083
        L_0x0094:
            java.lang.String r0 = "ۥۢۦۢۨۢۢۢۥۘۚۜ۟ۥۜۚ"
            goto L_0x0083
        L_0x0097:
            java.lang.String r0 = "ۜ۟ۘۘ۠۟ۥۖۜۡۘۙۙۡۙۗ۫۬ۖۛ"
            goto L_0x0006
        L_0x009b:
            r3 = 813927542(0x30838c76, float:9.571426E-10)
            java.lang.String r0 = "ۨۦۦۘۤۢۖۘۖۤۢۢۧۗ۟۟ۚ۠۬ۜۜۚۗ"
        L_0x00a0:
            int r4 = r0.hashCode()
            r4 = r4 ^ r3
            switch(r4) {
                case -2106721981: goto L_0x00a9;
                case -643071529: goto L_0x00b4;
                case 493625638: goto L_0x0026;
                case 1770892324: goto L_0x00b1;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            goto L_0x00a0
        L_0x00a9:
            if (r2 == 0) goto L_0x00ae
            java.lang.String r0 = "ۡۢۗۥۥۜۘ۬ۚۗ۟ۨۖۘۧۚ۠۬ۗۘۘۛۗ"
            goto L_0x00a0
        L_0x00ae:
            java.lang.String r0 = "ۡۜۘۘۙۧۜۚۢ۬ۧۤۦۤ۟ۜۥۖۜۘۙۘۥ"
            goto L_0x00a0
        L_0x00b1:
            java.lang.String r0 = "ۤۡ۬ۤۥۡۤۡۤۚ۟۟ۤ۟ۘۜۧۙ۫ۗۗۡۙۥۘ"
            goto L_0x00a0
        L_0x00b4:
            java.lang.String r0 = "ۥۦۜۘۧ۫۫ۢۥۘ۟ۨۥۘۖۤۦ"
            goto L_0x0006
        L_0x00b8:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.setColorFilter(r1, r0)
            java.lang.String r0 = "ۙۥۙۜۛ۠ۜۨۘۤ۠ۤۖۥۤ۬ۛ۫۫ۥۦ"
            goto L_0x0006
        L_0x00c1:
            r7.setBackground(r2)
            java.lang.String r0 = "ۗ۬ۥۘۗۨۡۥ۟۬۫ۦۤۧۙۨۘ۠ۜۦۥۖۖ۟ۘۜۘۢۢۦۘ"
            goto L_0x0006
        L_0x00c8:
            java.lang.String r0 = "ۤۚ۫ۗۖۨۘۨ۠ۜۖۖۡۘۢۡ۬ۙۜۨ۠۫ۘۧۙۢ۫ۥۗ"
            goto L_0x0006
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.tvBalloons(android.widget.TextView):void");
    }

    public static String wallpnm(String str) {
        String str2 = "ۢۗۥۘ۟ۧۖۘۗۜۖۘۖۙ۟۠ۘ۟ۦ۠ۡ";
        String str3 = null;
        StringBuilder sb = null;
        String str4 = null;
        while (true) {
            switch ((str2.hashCode() ^ 523) ^ -1199291228) {
                case -1620601654:
                    str2 = "ۙۤۜۘۧۦۦۡۢۖۦۧۚ۟ۨۘۜ۠ۨۘ";
                    str4 = str3;
                    break;
                case -1558560464:
                    return str4;
                case -894755245:
                    sb.append(yo.getCurr_sJid());
                    str2 = "ۢۙۘۙ۠ۘۙۦ۫ۡۦۖۥ۫ۡ";
                    break;
                case 765610455:
                    sb.append("_");
                    str2 = "ۦ۟ۛۘۥ۫ۤۚۘۘۛۘ۠۟ۦۛ";
                    break;
                case 999037932:
                    sb.append(str);
                    str2 = "ۦ۠ۗۖۙۖۘۤۘۦۘۦۧۜۘۡۨۥۥۦۨۘ۫ۧۡۘ۬ۗ";
                    break;
                case 1372699278:
                    str2 = "ۗۜۖۡ۬ۡۨۥۨۘۛ۫ۡۘ۬ۚۜۘ";
                    str4 = str;
                    break;
                case 1555102513:
                    str2 = "ۤ۟ۦۘۧۡۡۘۚۗۚۢۨ۬ۛۙ۫۠ۗۙ";
                    sb = new StringBuilder();
                    break;
                case 1895025031:
                    str3 = sb.toString();
                    str2 = "ۦۧۡۗۨۧۥۙۦۖۥۜۘۦۡۧ";
                    break;
                case 2003986572:
                    str2 = "۫ۦۚۘۨۙۜ۠ۙۙۨۥ۫ۖۘۗ۫ۦۘۚۜۙۢۨۖ";
                    break;
                case 2026712876:
                    String str5 = "ۤ۠ۥۘ۬ۗ۠ۚۡۖۥۖۖۛ۠ۥۘۥۚۜ۠ۢۖۘ";
                    while (true) {
                        switch (str5.hashCode() ^ 787031766) {
                            case -785107196:
                                str2 = "ۙۘ۫ۚ۬ۥۜ۬۟ۢۖۚۖ۬ۧۛۤۢۨۤۗ۬ۥۘۜۚۦ";
                                continue;
                            case -445798268:
                                str2 = "ۙۤۜۘۧۦۦۡۢۖۦۧۚ۟ۨۘۜ۠ۨۘ";
                                continue;
                            case -407650120:
                                str5 = "۫۟۫ۘۘۜۜۥۖۦۖۤۤ۫ۡۖۧۜۡۡۘۦۙۘ۟ۨۥ";
                                break;
                            case -357513695:
                                if (!shp.getBoolean("custom_wall")) {
                                    str5 = "ۢۦۛ۬ۨۨۛۘۖۘ۠ۘۨۘۥۥۜۘۨۜۖۘۙۨۢۦ۫ۜ";
                                    break;
                                } else {
                                    str5 = "۟ۡۡۘۖ۟ۦۘۦۥۖۢۙۘۘۡۚۡ";
                                    break;
                                }
                        }
                    }
                    break;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v25, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v26, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String whichEntry() {
        /*
            r26 = 0
            r25 = 0
            r23 = 0
            r22 = 0
            r21 = 0
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r16 = 0
            r15 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r2 = 0
            r24 = 0
            java.lang.String r1 = "ۖ۫ۥ۫۟ۦۘۤ۠۬ۦۘۨۘۜۨۦ۬ۙۢ"
        L_0x0026:
            int r27 = r1.hashCode()
            r28 = 726(0x2d6, float:1.017E-42)
            r29 = 304953740(0x122d398c, float:5.4660107E-28)
            r27 = r27 ^ r28
            r27 = r27 ^ r29
            switch(r27) {
                case -2044863262: goto L_0x01a7;
                case -1853615411: goto L_0x0037;
                case -1792133934: goto L_0x00d5;
                case -1748963028: goto L_0x00c3;
                case -1734429085: goto L_0x0048;
                case -1711791343: goto L_0x0147;
                case -1707959811: goto L_0x019b;
                case -1707102778: goto L_0x00b7;
                case -1663642578: goto L_0x0205;
                case -1633808566: goto L_0x017d;
                case -1633113256: goto L_0x0094;
                case -1545112649: goto L_0x0171;
                case -1455772492: goto L_0x00cf;
                case -1452716973: goto L_0x0205;
                case -1433229495: goto L_0x00bd;
                case -1427917236: goto L_0x0129;
                case -1377519730: goto L_0x0195;
                case -1350262270: goto L_0x0165;
                case -1189465542: goto L_0x0105;
                case -1184916873: goto L_0x0205;
                case -837555943: goto L_0x008f;
                case -807103603: goto L_0x0117;
                case -785093731: goto L_0x0153;
                case -754714114: goto L_0x0205;
                case -726158882: goto L_0x0205;
                case -623684146: goto L_0x009a;
                case -615071028: goto L_0x00db;
                case -475624883: goto L_0x0183;
                case -474579022: goto L_0x0205;
                case -426388019: goto L_0x0205;
                case -360001147: goto L_0x0159;
                case -288379899: goto L_0x0177;
                case -285548567: goto L_0x00e1;
                case -200710642: goto L_0x0205;
                case -187240683: goto L_0x013b;
                case -161566621: goto L_0x00c9;
                case -114934229: goto L_0x0205;
                case -108262026: goto L_0x0205;
                case -58027412: goto L_0x008a;
                case -55185644: goto L_0x00ed;
                case -20574674: goto L_0x0205;
                case 55260000: goto L_0x010b;
                case 123268806: goto L_0x0205;
                case 195531991: goto L_0x0205;
                case 207707457: goto L_0x0069;
                case 241916808: goto L_0x0189;
                case 245878711: goto L_0x0205;
                case 282879575: goto L_0x00ff;
                case 320763470: goto L_0x018f;
                case 351998124: goto L_0x0209;
                case 712972770: goto L_0x0205;
                case 741747302: goto L_0x0123;
                case 806103434: goto L_0x0205;
                case 927126740: goto L_0x0141;
                case 937827157: goto L_0x0205;
                case 1019958529: goto L_0x00a5;
                case 1025565311: goto L_0x0205;
                case 1179197878: goto L_0x014d;
                case 1261408161: goto L_0x0205;
                case 1327564085: goto L_0x00e7;
                case 1447245428: goto L_0x015f;
                case 1475141246: goto L_0x0205;
                case 1562697775: goto L_0x012f;
                case 1693131780: goto L_0x0205;
                case 1747650921: goto L_0x0205;
                case 1753307988: goto L_0x011d;
                case 1763188303: goto L_0x0111;
                case 1765209529: goto L_0x00b1;
                case 1805852047: goto L_0x01a1;
                case 1851196499: goto L_0x00f9;
                case 1854701095: goto L_0x00a0;
                case 1876014936: goto L_0x00f3;
                case 1925733253: goto L_0x00ab;
                case 2117204150: goto L_0x0135;
                case 2135501434: goto L_0x016b;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0026
        L_0x0037:
            java.lang.String r1 = "ConvoEntry"
            java.lang.String r26 = "777"
            r0 = r26
            java.lang.String r1 = com.obwhatsapp.yo.shp.getPrefString(r1, r0)
            int r26 = java.lang.Integer.parseInt(r1)
            java.lang.String r1 = "ۛۨۙ۟۫۬ۙۥۙۜۜۘۜۙۜۦۘ۟ۘ۫ۙ"
            goto L_0x0026
        L_0x0048:
            r27 = 882351273(0x34979ca9, float:2.8239927E-7)
            java.lang.String r1 = "۟ۡۖۘ۠۫ۢۘۦۥۡۤۨۥۖۜۗۖۘۘۛۢ"
        L_0x004d:
            int r28 = r1.hashCode()
            r28 = r28 ^ r27
            switch(r28) {
                case -2030721223: goto L_0x0057;
                case -1352794435: goto L_0x0066;
                case -681288434: goto L_0x0063;
                case 1835608219: goto L_0x0201;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x004d
        L_0x0057:
            r1 = 20
            r0 = r26
            if (r0 == r1) goto L_0x0060
            java.lang.String r1 = "ۚۧ۫۬ۙۢۨۧۡ۠ۢ۫ۦۘۗ"
            goto L_0x004d
        L_0x0060:
            java.lang.String r1 = "ۡ۟ۥ۠ۦ۬ۤۥۘۘۙۗۜۥۚۥ"
            goto L_0x004d
        L_0x0063:
            java.lang.String r1 = "۬۫ۘۘۥۘۜۛ۠ۥۤۧۜ۬ۢۥۘۢۢۦۘۗۨۙ۠ۚۨۘ"
            goto L_0x004d
        L_0x0066:
            java.lang.String r1 = "ۙ۠ۗ۬ۥۦ۟ۢۨۘۖۨ۬ۢۙۦۨۛۘۡۚۤۖۨۘ"
            goto L_0x0026
        L_0x0069:
            r27 = -1529502669(0xffffffffa4d5a433, float:-9.265219E-17)
            java.lang.String r1 = "ۨۖۦۘۥۦۥۘۗ۠ۥۘۙۨۢۛۚۡۚۨ۫ۥۢۘۙۡ"
        L_0x006e:
            int r28 = r1.hashCode()
            r28 = r28 ^ r27
            switch(r28) {
                case -1619251338: goto L_0x007e;
                case -354980468: goto L_0x0087;
                case 206789140: goto L_0x0078;
                case 1453327752: goto L_0x01fd;
                default: goto L_0x0077;
            }
        L_0x0077:
            goto L_0x006e
        L_0x0078:
            java.lang.String r1 = "ۜۦۥۧ۠ۘۘۨ۫۬ۢۧۥۨۖۘ"
            goto L_0x006e
        L_0x007b:
            java.lang.String r1 = "ۨ۫ۘۖۙۘۘۢ۫۟ۗۙۤ۬۬ۛۦۖ۟ۖ۫ۡۤ۫"
            goto L_0x006e
        L_0x007e:
            r1 = 22
            r0 = r26
            if (r0 == r1) goto L_0x007b
            java.lang.String r1 = "ۘ۠ۡۨۛۜۦۥۨۘ۬ۗ۟ۗۗۚۛۘۜۘ۟ۨۚۚۦۦ"
            goto L_0x006e
        L_0x0087:
            java.lang.String r1 = "ۘۙۥۘۘۘ۬ۜۜۥۤۗۨۘ۟ۨۡۘۚۢۧۙ۬ۘ"
            goto L_0x0026
        L_0x008a:
            java.lang.String r25 = "theme_conversation_stock"
            java.lang.String r1 = "ۦۤۜۘ۫ۗۙ۫ۚۖۘۘۧۧۡۗ۠ۡۤۤۚۥۙۢۦۘۦۘ"
            goto L_0x0026
        L_0x008f:
            java.lang.String r1 = "۫ۘۛۧۡۡۢۨۜ۬ۚۜۘۙۤۦۦۨۦۤۢۜۨۜۤ"
            r24 = r25
            goto L_0x0026
        L_0x0094:
            switch(r26) {
                case 0: goto L_0x01f9;
                case 1: goto L_0x01f5;
                case 2: goto L_0x01f1;
                case 3: goto L_0x01ed;
                case 4: goto L_0x01e9;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01e1;
                case 7: goto L_0x0205;
                case 8: goto L_0x01dd;
                case 9: goto L_0x01d9;
                case 10: goto L_0x01d5;
                case 11: goto L_0x01d1;
                case 12: goto L_0x01cd;
                case 13: goto L_0x01c9;
                default: goto L_0x0097;
            }
        L_0x0097:
            java.lang.String r1 = "ۖ۠ۥ۫۬ۜۦۚۨۥۢ۠ۢۧۡۡۘۨۘ"
            goto L_0x0026
        L_0x009a:
            switch(r26) {
                case 24: goto L_0x01c5;
                case 25: goto L_0x01c1;
                case 26: goto L_0x01bd;
                case 27: goto L_0x01b9;
                case 28: goto L_0x01b5;
                case 29: goto L_0x01b1;
                case 30: goto L_0x01ad;
                default: goto L_0x009d;
            }
        L_0x009d:
            java.lang.String r1 = "ۖ۟ۛۖۗ۫ۖۖۧۘۡۥۜۘۛۧۥۥۧۨۘۡۜ"
            goto L_0x0026
        L_0x00a0:
            java.lang.String r1 = "۬ۛۙ۬ۡۜۘۧۖۨۘۚۜۤۗ۟ۚۦۗ۟ۥ۟ۧۦۦۖۘۦ۟ۛ"
            r24 = r25
            goto L_0x0026
        L_0x00a5:
            java.lang.String r23 = "theme_rcmess_conversation"
            java.lang.String r1 = "ۥۙۛۖ۬ۛۗ۬۟ۘۗۗۢۚۙۘۢ"
            goto L_0x0026
        L_0x00ab:
            java.lang.String r1 = "ۡ۬ۖۜۤۖۗۘ۫۬ۧۗۘ۫ۘۨ۠ۦ"
            r24 = r23
            goto L_0x0026
        L_0x00b1:
            java.lang.String r22 = "fbmess_conversation"
            java.lang.String r1 = "ۤۨۨۘۦۦۥۘۖۡۦۘۥۢ۬۫ۦۢ"
            goto L_0x0026
        L_0x00b7:
            java.lang.String r1 = "ۛۧۨۘۚۛۙۖۧ۫ۚۛۨۘ۫ۖۦۘۥۥ۟"
            r24 = r22
            goto L_0x0026
        L_0x00bd:
            java.lang.String r21 = "theme_ios14_conversation"
            java.lang.String r1 = "ۥۙۗ۫ۥ۬ۦۛۗۚۛ۠ۜۛۥۘۢۗۧۦۤ۫۟ۜ"
            goto L_0x0026
        L_0x00c3:
            java.lang.String r1 = "۫ۚۚۧۢۛ۬ۖۙ۟ۨۧۘۦۘۜۜۜۥۘ"
            r24 = r21
            goto L_0x0026
        L_0x00c9:
            java.lang.String r20 = "rcig_conversation"
            java.lang.String r1 = "ۙۥ۠ۙ۫ۨۜ۫۟ۦۜ۠ۡۦۧۘۘۚۖۘۘ۫ۗ"
            goto L_0x0026
        L_0x00cf:
            java.lang.String r1 = "ۦۥۗۢۡۥ۫ۛۦۨۦۡۢۥۤۢۖۖۘۘۤۧۗۥۜ۟ۜۛ"
            r24 = r20
            goto L_0x0026
        L_0x00d5:
            java.lang.String r19 = "yowa_concept_conversation"
            java.lang.String r1 = "ۨۗۨۦۚۘ۫ۘۡۧۡۜ۠ۛۚۜۥۘ۫ۛۤۢۜۛ"
            goto L_0x0026
        L_0x00db:
            java.lang.String r1 = "ۥۧۦ۫ۜۦۨۘ۫۟ۧۥ۠"
            r24 = r19
            goto L_0x0026
        L_0x00e1:
            java.lang.String r18 = "theme_rcline_conversation"
            java.lang.String r1 = "۬ۛ۫۟ۡۗۜۢۚۘ۬ۛۨۥۘۘۢۢۙ۠ۦۥۛۥ۫ۡ"
            goto L_0x0026
        L_0x00e7:
            java.lang.String r1 = "ۜ۬ۖ۫ۛۜۘۧۥۤۤ۠ۨۨۢۦۘۦۤۖۘ"
            r24 = r18
            goto L_0x0026
        L_0x00ed:
            java.lang.String r17 = "theme_ios11_conversation"
            java.lang.String r1 = "ۛ۠۫ۥۛ۠ۙۤۨۥۦۘۘۥۨۡۘ۟۟ۥۘۜ۫ۘ"
            goto L_0x0026
        L_0x00f3:
            java.lang.String r1 = "ۨۦۗۛۧ۬ۡ۠ۙۢۗۗۢ۟ۤ۫ۜۜۘۨۧۖۘۖۛۤۖۚۘ"
            r24 = r17
            goto L_0x0026
        L_0x00f9:
            java.lang.String r16 = "theme_conversation_old_stock"
            java.lang.String r1 = "ۙۢۗۛۤ۠۬ۥۦ۠ۥۤۧ۟۠"
            goto L_0x0026
        L_0x00ff:
            java.lang.String r1 = "ۢۦۧۘۤۛ۫ۗۗ۟ۨۜۙ۠۬۠۫۬ۜۘۘ۠"
            r24 = r16
            goto L_0x0026
        L_0x0105:
            java.lang.String r15 = "rounded_conversation"
            java.lang.String r1 = "ۨۗۧۘۦ۬ۢۛۥۘ۬ۥۛ۫۠ۜۤۜۧۘۜ۬ۦۧ۫ۘۘ"
            goto L_0x0026
        L_0x010b:
            java.lang.String r1 = "ۢۚۥۚۚۜ۬۫ۖ۟ۖ۬۬ۥۥۜۜۢۙۥۘۗ۫ۡۘ"
            r24 = r15
            goto L_0x0026
        L_0x0111:
            java.lang.String r14 = "allo_conversation"
            java.lang.String r1 = "ۤۗۗۥۜۦۘۦ۬ۘۢۘۤ۠ۥۥۙۘۥۚۖۖۦۦۢ"
            goto L_0x0026
        L_0x0117:
            java.lang.String r1 = "ۘۖۘۜۧۜۘۛۦۨۘۦۤۧۗۦۢۤۘۢ"
            r24 = r14
            goto L_0x0026
        L_0x011d:
            java.lang.String r13 = "dribblev2_conversation"
            java.lang.String r1 = "ۦۜۦۘۨۦۘۘ۠ۡۜۤۢۧ۫ۗۛۖۙۚ"
            goto L_0x0026
        L_0x0123:
            java.lang.String r1 = "ۗۖۡۘ۠ۤۥۚۘۛۘ۬ۡۘۢۚ۬ۢ۬ۙۥۚ۬۫۠"
            r24 = r13
            goto L_0x0026
        L_0x0129:
            java.lang.String r12 = "dribble_conversation"
            java.lang.String r1 = "ۨۙۤۦۧ۫ۤ۟ۢۛۨ۫ۡۖۘۤۗۖۘۦۦۙۤ"
            goto L_0x0026
        L_0x012f:
            java.lang.String r1 = "ۜ۬ۦۘۧۖۦۘ۟ۥۙۦ۫ۖۛۨ۠ۤۘۢۤۥۢۡ"
            r24 = r12
            goto L_0x0026
        L_0x0135:
            java.lang.String r11 = "yowa_hangoutsv2_conversation"
            java.lang.String r1 = "۠ۦۜۘۗۛۜۘ۫۟ۢۙۖۥۘۗۨۖۘ"
            goto L_0x0026
        L_0x013b:
            java.lang.String r1 = "۠۠ۜۘ۫ۧۡۘۗ۬ۦۘۛۤۘۘۧۖۖۙ۬۠ۤۢۧ"
            r24 = r11
            goto L_0x0026
        L_0x0141:
            java.lang.String r10 = "yowa_wanh_conversation"
            java.lang.String r1 = "۟ۗۦۜۗۥۡۦ۫۠ۛۨۘۥۥۘۘۗۜۨۘۡۢۨۡۧ۫ۢۨۙ"
            goto L_0x0026
        L_0x0147:
            java.lang.String r1 = "ۦۡۨ۬ۢۡۘۘۥۥۗۗۨۘۗۡۦۛۦ۟۫ۧۖۘ"
            r24 = r10
            goto L_0x0026
        L_0x014d:
            java.lang.String r9 = "yowa_mood_conversation"
            java.lang.String r1 = "ۚ۟ۡۢۨ۫ۧۧۨۘۘۖۢۘۚۘۚۗۚۧ۬ۨۘ"
            goto L_0x0026
        L_0x0153:
            java.lang.String r1 = "ۛۜۧۨۡۖۘۜ۬ۧۥۢۦ۫ۦ۟"
            r24 = r9
            goto L_0x0026
        L_0x0159:
            java.lang.String r8 = "yowa_aran_conversation"
            java.lang.String r1 = "ۦۙۦ۫ۧۦ۫۟۠ۚۨۖۤۢ۟"
            goto L_0x0026
        L_0x015f:
            java.lang.String r1 = "ۧۢۗۖۚۖۗۦ۫۬ۜۛ۬ۨۜۘ۬ۥۜۜۡۘ"
            r24 = r8
            goto L_0x0026
        L_0x0165:
            java.lang.String r7 = "yowa_simple_conversation"
            java.lang.String r1 = "۠ۡۖۢۡۗۗ۟ۦۘۜ۬ۢۙۧۖۜۦ۫ۤۥۖ۠ۡۨ"
            goto L_0x0026
        L_0x016b:
            java.lang.String r1 = "ۙۘ۟ۨۖۙۜۥۨۘۖۧ۬۬ۧۨۤۗۖۘۡۧۙۤۜۘ"
            r24 = r7
            goto L_0x0026
        L_0x0171:
            java.lang.String r6 = "yowa_hangouts_conversation"
            java.lang.String r1 = "۫ۗۖۘۢۢۚۚۧۚ۫۬ۦۙۥۘ۫ۡ۟ۜۗۛ"
            goto L_0x0026
        L_0x0177:
            java.lang.String r1 = "ۗۛۛ۠۬ۤۖۥۗۖ۠ۜۘۜۤۤۧۡۨ۟ۨۨۘۘۙۥ"
            r24 = r6
            goto L_0x0026
        L_0x017d:
            java.lang.String r5 = "yowa_wamod_conversation"
            java.lang.String r1 = "ۚۢ۠ۖ۫ۢ۬ۚۘۘۡۖۙ۠ۖۘۚ۠ۥۘۥ۫ۡۘ"
            goto L_0x0026
        L_0x0183:
            java.lang.String r1 = "ۡۘۦۘ۬ۥۧۘۘۘۘ۟ۦ۫۬ۢۜۛۧۘ"
            r24 = r5
            goto L_0x0026
        L_0x0189:
            java.lang.String r4 = "conversation"
            java.lang.String r1 = "۟ۖۨۢۛۙۘ۠ۜۢ۬ۡ۠ۢۜۘۢ۬ۧۛۚۘۘۖ۟ۘ۠ۢۙ"
            goto L_0x0026
        L_0x018f:
            java.lang.String r1 = "ۜۧۤۥۦۜۥۡۜۦۖۢۛۢۨۙۤۚۗۧۜ۠ۤۖۚ۠ۛ"
            r24 = r4
            goto L_0x0026
        L_0x0195:
            java.lang.String r3 = "theme_telegramxios_conversation"
            java.lang.String r1 = "۬ۧۚۨۖۗۙۢۡۤۧۨۢۨۗۚ۟ۡۦۨۦ۠ۦۡۤۥۡ"
            goto L_0x0026
        L_0x019b:
            java.lang.String r1 = "ۘۛۗۥۙۗۧۧ۬ۛ۟۬ۙۤۥۖ۠ۡۘ"
            r24 = r3
            goto L_0x0026
        L_0x01a1:
            java.lang.String r2 = "theme_msggoogle_conversation"
            java.lang.String r1 = "ۥۥۧ۫ۚۡۘۚ۬ۡۘۨۥۡۤۥ۫۠ۥۡۘ"
            goto L_0x0026
        L_0x01a7:
            java.lang.String r1 = "۬ۙۛ۟ۖۥ۟ۢ۬ۤۥۢۢۗ۫ۧۖ۫ۖ۫۠ۚۧ۠ۜ"
            r24 = r2
            goto L_0x0026
        L_0x01ad:
            java.lang.String r1 = "ۘۖۤۡۜۜۧۡۨ۠ۗۦ۟ۦۘۧۛ۬ۥۚۤ۬۠ۛۢۥۙ"
            goto L_0x0026
        L_0x01b1:
            java.lang.String r1 = "۫ۦۜۢۖۜۘۤۤ۟ۧۨۧۢۢۖۘۙۛۦۘۥۡۘۢ۬ۗ۬ۤۚ"
            goto L_0x0026
        L_0x01b5:
            java.lang.String r1 = "۟ۢۦۘۘۜۦ۠ۧۘۘۜۢۤۚۤۚۦۥۘ"
            goto L_0x0026
        L_0x01b9:
            java.lang.String r1 = "ۢۖ۠ۘۖۢۖ۬ۙۡۗۦۘۙ۟ۦۙۗۘۚ۫ۗ"
            goto L_0x0026
        L_0x01bd:
            java.lang.String r1 = "ۧۦۨۦۧۥۙۤۙ۫ۖۘۡۜۥۘ"
            goto L_0x0026
        L_0x01c1:
            java.lang.String r1 = "ۛۧۨۘۡۢۤۗۤۗۛۚۡۚۨۤۘ۟ۚۨۘۜۘۛ"
            goto L_0x0026
        L_0x01c5:
            java.lang.String r1 = "ۗۙۛۖۢۛ۫ۗ۬ۥۜ۫ۙ۬ۗۤۥۡۘۡۦۡۧۥۥۘۧۚۜ"
            goto L_0x0026
        L_0x01c9:
            java.lang.String r1 = "ۦۙۙۜۡۖۛۥۖۘۤ۫ۘۖۖۜۘۤ۫ۜۘۘۙۡۘۤۜ"
            goto L_0x0026
        L_0x01cd:
            java.lang.String r1 = "ۛۨۜۘۗۧۥۘ۠ۦۚۜۘۚۤۗۦۚۖۙ"
            goto L_0x0026
        L_0x01d1:
            java.lang.String r1 = "ۦ۠ۚۙۗۘۘۤۛۦۥ۠ۗۢۖۗۖۚۨۘۙۤ۬"
            goto L_0x0026
        L_0x01d5:
            java.lang.String r1 = "ۚ۟ۧۢۚۜ۫ۘۘۘۨۦ۟۬ۛ۫ۙۦۡۘ"
            goto L_0x0026
        L_0x01d9:
            java.lang.String r1 = "۫۟ۢ۟ۗۚۚۜۖۘۡۡۜۗ۬ۧۜۘ۠"
            goto L_0x0026
        L_0x01dd:
            java.lang.String r1 = "ۚۦۜۚۦۘ۟ۘۘ۫ۗ۟۠ۥۡ"
            goto L_0x0026
        L_0x01e1:
            java.lang.String r1 = "ۜۜۛۨ۟ۜ۫۠ۨۘ۬ۢۦۢۘۜ۟ۘۨۘ"
            goto L_0x0026
        L_0x01e5:
            java.lang.String r1 = "ۛ۫ۘ۠ۖۦۘۘۚۘۨ۬ۜۘۢۤۨۘۥۜۘۨ۟۫ۧۙۘۢۜۡۘ"
            goto L_0x0026
        L_0x01e9:
            java.lang.String r1 = "ۨۜۚ۟ۦۤ۠ۜۨۘۧۗۜۙۥۜۘۘ۟ۗ"
            goto L_0x0026
        L_0x01ed:
            java.lang.String r1 = "ۢۡۛ۫ۙۥ۠ۚۘۘۡ۟ۧۙۜ۬ۘۛ"
            goto L_0x0026
        L_0x01f1:
            java.lang.String r1 = "ۖۜۙۡۦۡۢۛۖۤۚۡۡۗۚ"
            goto L_0x0026
        L_0x01f5:
            java.lang.String r1 = "ۥ۟ۥۘۗۨۦۘۗۨۥۗۛۦۘ۠ۚۜ۬ۡۨۘۘۗۨۘ۬ۚۚ"
            goto L_0x0026
        L_0x01f9:
            java.lang.String r1 = "ۚۥۧۘۨۜۡۤ۬ۖۖۧۚۗ۬ۛۗۡۖ"
            goto L_0x0026
        L_0x01fd:
            java.lang.String r1 = "ۥ۬ۡۘۘۖۙۢۛۚۘۗۢۥۧ۠ۤۛ۫ۡ۟ۡ۟ۜ۟"
            goto L_0x0026
        L_0x0201:
            java.lang.String r1 = "ۥۜۙۙۜ۬ۤ۬ۨۘۛۨۚۗۥۡۥۛۖۘۢۗۧ"
            goto L_0x0026
        L_0x0205:
            java.lang.String r1 = "۬ۙۛ۟ۖۥ۟ۢ۬ۤۥۢۢۗ۫ۧۖ۫ۖ۫۠ۚۧ۠ۜ"
            goto L_0x0026
        L_0x0209:
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.whichEntry():java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004b A[Catch:{ Exception -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c A[Catch:{ Exception -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0073 A[SYNTHETIC, Splitter:B:21:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084 A[Catch:{ Exception -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093 A[Catch:{ Exception -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c A[Catch:{ Exception -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0085 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void yowaEntryActions(android.view.View r8) {
        /*
            r1 = 0
            java.lang.String r0 = "footer2"
            android.view.View r0 = d(r0)     // Catch:{ Exception -> 0x009f }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x009f }
            int r3 = r0.getVisibility()     // Catch:{ Exception -> 0x009f }
            r4 = -1433613081(0xffffffffaa8ccce7, float:-2.5011175E-13)
            java.lang.String r2 = "۫۠ۡۘۚۤۧ۫ۢۡۘۥۗ۟ۥۖۧۙۨۙۚۢۨ۫ۦۘۛۦۢ"
        L_0x0012:
            int r5 = r2.hashCode()     // Catch:{ Exception -> 0x009f }
            r5 = r5 ^ r4
            switch(r5) {
                case -793129444: goto L_0x005c;
                case -663787944: goto L_0x0059;
                case 332250111: goto L_0x0054;
                case 1554183407: goto L_0x001b;
                default: goto L_0x001a;
            }     // Catch:{ Exception -> 0x009f }
        L_0x001a:
            goto L_0x0012
        L_0x001b:
            android.view.animation.TranslateAnimation r2 = new android.view.animation.TranslateAnimation     // Catch:{ Exception -> 0x009f }
            int r3 = r0.getWidth()     // Catch:{ Exception -> 0x009f }
            int r3 = -r3
            float r3 = (float) r3     // Catch:{ Exception -> 0x009f }
            r4 = 0
            r5 = 0
            r6 = 0
            r2.<init>(r3, r4, r5, r6)     // Catch:{ Exception -> 0x009f }
            r3 = r1
            r4 = r2
        L_0x002b:
            r6 = 500(0x1f4, double:2.47E-321)
            r4.setDuration(r6)     // Catch:{ Exception -> 0x009f }
            r2 = 1
            r4.setFillEnabled(r2)     // Catch:{ Exception -> 0x009f }
            r2 = 1
            r4.setFillAfter(r2)     // Catch:{ Exception -> 0x009f }
            r0.startAnimation(r4)     // Catch:{ Exception -> 0x009f }
            r0.setVisibility(r3)     // Catch:{ Exception -> 0x009f }
            r4 = -2017151953(0xffffffff87c4b42f, float:-2.9596705E-34)
            java.lang.String r2 = "ۦۨ۠ۥۦۤۚۤۡۚۦۘۗۜۘۖ۟۠"
        L_0x0043:
            int r5 = r2.hashCode()     // Catch:{ Exception -> 0x009f }
            r5 = r5 ^ r4
            switch(r5) {
                case -1041116820: goto L_0x0073;
                case 426917787: goto L_0x00a1;
                case 824681649: goto L_0x004c;
                case 1992921305: goto L_0x0070;
                default: goto L_0x004b;
            }     // Catch:{ Exception -> 0x009f }
        L_0x004b:
            goto L_0x0043
        L_0x004c:
            if (r3 != 0) goto L_0x006d
            java.lang.String r2 = "ۥۥ۬۟ۡ۠۫ۖۨۖ۠ۨۨ۬ۘۘۚۘۖۢ۟ۤۖۖۜ"
            goto L_0x0043
        L_0x0051:
            java.lang.String r2 = "ۖۦۜۘۘۢۥۨۧۛۘۚۖۘۙۗۡۧۘ۠ۦۨۡۙ۟"
            goto L_0x0012
        L_0x0054:
            if (r3 != 0) goto L_0x0051
            java.lang.String r2 = "۬ۛۛۖۦۘۘ۬ۖۤۦۡۤ۠ۥۚۡۥ۬ۤۘ۬۠ۙۨۙ۠ۛ"
            goto L_0x0012
        L_0x0059:
            java.lang.String r2 = "ۥ۬ۡۘ۬ۤۧۘ۬ۘ۟۫ۦۛ۟ۦ"
            goto L_0x0012
        L_0x005c:
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation     // Catch:{ Exception -> 0x009f }
            r2 = 0
            int r3 = r0.getWidth()     // Catch:{ Exception -> 0x009f }
            int r3 = -r3
            float r3 = (float) r3     // Catch:{ Exception -> 0x009f }
            r5 = 0
            r6 = 0
            r4.<init>(r2, r3, r5, r6)     // Catch:{ Exception -> 0x009f }
            r2 = 4
            r3 = r2
            goto L_0x002b
        L_0x006d:
            java.lang.String r2 = "۟ۢۦۘۢۧۢۤۨۖۘۡۜۢ۫ۥۨۧۘۚ"
            goto L_0x0043
        L_0x0070:
            java.lang.String r2 = "۬ۜۤۘ۬ۚۢۤۨۜ۫ۥۗۤۥۦۥۘ"
            goto L_0x0043
        L_0x0073:
            r0.bringToFront()     // Catch:{ Exception -> 0x009f }
            r2 = r1
        L_0x0077:
            r4 = -1284208139(0xffffffffb37489f5, float:-5.693615E-8)
            java.lang.String r1 = "ۚۦۡۘۨۖۡۜ۠ۜ۠۬ۛۚۨۦۚۘۚۥۗۧ"
        L_0x007c:
            int r5 = r1.hashCode()     // Catch:{ Exception -> 0x009f }
            r5 = r5 ^ r4
            switch(r5) {
                case -394994594: goto L_0x009c;
                case 75939546: goto L_0x00a0;
                case 226300665: goto L_0x0085;
                case 1397262591: goto L_0x0093;
                default: goto L_0x0084;
            }     // Catch:{ Exception -> 0x009f }
        L_0x0084:
            goto L_0x007c
        L_0x0085:
            android.view.View r1 = r0.getChildAt(r2)     // Catch:{ Exception -> 0x009f }
            r1.setVisibility(r3)     // Catch:{ Exception -> 0x009f }
            int r1 = r2 + 1
            r2 = r1
            goto L_0x0077
        L_0x0090:
            java.lang.String r1 = "ۢۛ۠۬۬ۡۘۙۚۘۘ۫ۤۧۗ۠۬۬ۨ۟"
            goto L_0x007c
        L_0x0093:
            int r1 = r0.getChildCount()     // Catch:{ Exception -> 0x009f }
            if (r2 >= r1) goto L_0x0090
            java.lang.String r1 = "۟ۗ۬ۡۡۘۜۨۡۘۘۘۤ۠ۡۘۙۘ۠ۨۦۦ۟۬ۡۘ۫ۧ۬"
            goto L_0x007c
        L_0x009c:
            java.lang.String r1 = "ۦۨۘۘۜۛۨۘ۟ۦۗۧ۠ۜ۫ۗۡۘ۠ۨۨۤ۠ۙۦۖ۠"
            goto L_0x007c
        L_0x009f:
            r0 = move-exception
        L_0x00a0:
            return
        L_0x00a1:
            r2 = r1
            goto L_0x0077
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.Conversation.yowaEntryActions(android.view.View):void");
    }
}
