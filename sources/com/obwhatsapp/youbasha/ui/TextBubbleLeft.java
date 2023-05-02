package com.obwhatsapp.youbasha.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.Conversation;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

public class TextBubbleLeft extends LinearLayout {

    /* renamed from: g  reason: collision with root package name */
    public static final int f1122g = yo.getID("quoted_title", "id");

    /* renamed from: h  reason: collision with root package name */
    public static final int f1123h = yo.getID("quoted_text", "id");

    /* renamed from: i  reason: collision with root package name */
    public static final int f1124i = yo.getID("quoted_color", "id");

    /* renamed from: a  reason: collision with root package name */
    public View f1125a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1126b = yo.getID("balloon_incoming_normal", "drawable");

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f1127c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f1128d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f1129e;

    /* renamed from: f  reason: collision with root package name */
    public ViewGroup f1130f;

    static {
        String str = "ۥۗۡۘۘۢۛۥ۬ۘۧۦ۬۠۫ۜۛۧۥۙ۠۬";
        while (true) {
            switch ((str.hashCode() ^ 708) ^ 583008437) {
                case -1784154769:
                    return;
                case -1687256312:
                    str = "ۥۡۚۧۡۢ۬۫ۥ۠ۜۧۚۤ۠ۢۖ۟";
                    break;
                case -1326901207:
                    str = "۠ۨۢۜۛۨۢۜۨۥۗۚۚۚۧ۫ۨۙ";
                    break;
                case -73371019:
                    str = "ۘۨۜۥۦۖۘۜۖۡۘۙۗۜۘۜۙ۟ۚۡۧ";
                    break;
            }
        }
    }

    public TextBubbleLeft(Context context) {
        super(context);
        a();
    }

    public TextBubbleLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f A[Catch:{ Exception -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050 A[Catch:{ Exception -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090 A[Catch:{ Exception -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009e A[SYNTHETIC, Splitter:B:39:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be A[Catch:{ Exception -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bf A[Catch:{ Exception -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ca A[SYNTHETIC, Splitter:B:49:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x002f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x003a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00a9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x008c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e A[Catch:{ Exception -> 0x008b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setQView(android.view.View r5) {
        /*
            r4 = -11
            r1 = -2140271172(0xffffffff806e0dbc, float:-1.0106832E-38)
            java.lang.String r0 = "۫۠ۙۚۤۙۦۜۛ۫ۧۘۧۢۘۘۘۚۖۘۘۘ۫"
        L_0x0007:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x008b }
            r2 = r2 ^ r1
            switch(r2) {
                case -624418426: goto L_0x0066;
                case 739633206: goto L_0x0058;
                case 1298856046: goto L_0x0010;
                case 1463917322: goto L_0x0063;
                default: goto L_0x000f;
            }     // Catch:{ Exception -> 0x008b }
        L_0x000f:
            goto L_0x0007
        L_0x0010:
            java.lang.String r0 = "quoted_bg_picker"
            android.graphics.drawable.GradientDrawable r0 = com.obwhatsapp.yo.shp.getGradientDrawable(r0)     // Catch:{ Exception -> 0x008b }
            r5.setBackground(r0)     // Catch:{ Exception -> 0x008b }
        L_0x0019:
            java.lang.String r0 = "quoted_name_picker"
            r1 = -11
            int r1 = com.obwhatsapp.youbasha.others.getColor(r0, r1)     // Catch:{ Exception -> 0x008b }
            r2 = -514847199(0xffffffffe1500e21, float:-2.398713E20)
            java.lang.String r0 = "۟۟ۙۦۖۤۘۧۦۖ۠ۡۚۖۛۥۖۘۘۗۤۡۘ۬۫ۖۘ"
        L_0x0026:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x008b }
            r3 = r3 ^ r2
            switch(r3) {
                case -1988659429: goto L_0x0090;
                case -1157421115: goto L_0x003a;
                case -476326719: goto L_0x002f;
                case 1875675533: goto L_0x0095;
                default: goto L_0x002e;
            }     // Catch:{ Exception -> 0x008b }
        L_0x002e:
            goto L_0x0026
        L_0x002f:
            int r0 = f1122g     // Catch:{ Exception -> 0x008b }
            android.view.View r0 = r5.findViewById(r0)     // Catch:{ Exception -> 0x008b }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x008b }
            r0.setTextColor(r1)     // Catch:{ Exception -> 0x008b }
        L_0x003a:
            java.lang.String r0 = "quoted_text_picker"
            r1 = -11
            int r1 = com.obwhatsapp.youbasha.others.getColor(r0, r1)     // Catch:{ Exception -> 0x008b }
            r2 = -326873640(0xffffffffec844dd8, float:-1.2795665E27)
            java.lang.String r0 = "۬ۖۜۡۧۘۖ۬ۜۘۙۦۢۥۧۢۜ۬ۢۚ۬ۗ"
        L_0x0047:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x008b }
            r3 = r3 ^ r2
            switch(r3) {
                case 132415624: goto L_0x0050;
                case 1017793263: goto L_0x009e;
                case 1236555597: goto L_0x00a9;
                case 1441430385: goto L_0x009b;
                default: goto L_0x004f;
            }     // Catch:{ Exception -> 0x008b }
        L_0x004f:
            goto L_0x0047
        L_0x0050:
            if (r1 == r4) goto L_0x0098
            java.lang.String r0 = "ۚۥۦۘ۫۬ۧۢۡ۫۫ۛۨۘۤ۫ۨۘۢۦۤۖۚۡۘۖۘ۬"
            goto L_0x0047
        L_0x0055:
            java.lang.String r0 = "ۤۜ۬ۡۖۧۘۛۢۘۧۚۢۜۤۡۛۘۦۚۚۦۘ"
            goto L_0x0007
        L_0x0058:
            java.lang.String r0 = "quoted_bg_picker"
            boolean r0 = com.obwhatsapp.yo.shp.getIsGradiet(r0)     // Catch:{ Exception -> 0x008b }
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "ۛۜۨۘۨ۫ۜۡۥۘ۠ۤ۬ۜۖ"
            goto L_0x0007
        L_0x0063:
            java.lang.String r0 = "ۛۜۜۘ۫ۥۡۙۘۗ۫ۨ۠ۗۨۘ"
            goto L_0x0007
        L_0x0066:
            java.lang.String r0 = "quoted_bg_picker"
            r1 = -11
            int r1 = com.obwhatsapp.youbasha.others.getColor(r0, r1)     // Catch:{ Exception -> 0x008b }
            r2 = 49608795(0x2f4f85b, float:3.5995127E-37)
            java.lang.String r0 = "ۙۜ۠۫ۧۥۘۢ۠ۦۙۛۛ۫ۥ۠۬ۧۡۘۢۘ۠ۘۡۚۙۧۖۘ"
        L_0x0073:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x008b }
            r3 = r3 ^ r2
            switch(r3) {
                case -1778285115: goto L_0x0087;
                case -781083876: goto L_0x0019;
                case 106510857: goto L_0x007c;
                case 1527095125: goto L_0x0084;
                default: goto L_0x007b;
            }     // Catch:{ Exception -> 0x008b }
        L_0x007b:
            goto L_0x0073
        L_0x007c:
            if (r1 == r4) goto L_0x0081
            java.lang.String r0 = "ۤۚۤ۫ۥۘۤۡۗ۠ۖۜۘ۫ۥۥۘۙۦۜۘ۫ۙۖۜۤ۬"
            goto L_0x0073
        L_0x0081:
            java.lang.String r0 = "۟۠ۘۘۜۜۙ۬ۨۜۗۚۖۡۚ۬ۛۥۦۘ۠۠۫"
            goto L_0x0073
        L_0x0084:
            java.lang.String r0 = "ۜۚۦۘ۟ۙۨۚ۫ۙۙۥ۟ۗۥۛۚۧ۫ۖ۟ۡ"
            goto L_0x0073
        L_0x0087:
            r5.setBackgroundColor(r1)     // Catch:{ Exception -> 0x008b }
            goto L_0x0019
        L_0x008b:
            r0 = move-exception
        L_0x008c:
            return
        L_0x008d:
            java.lang.String r0 = "ۦۙۖۘۚ۠ۖۘۚۥ۟ۙۥۧۘ۠ۡۙ"
            goto L_0x0026
        L_0x0090:
            if (r1 == r4) goto L_0x008d
            java.lang.String r0 = "ۡۦۨۛۚۢ۠ۛ۬ۛ۫ۦۘۤۚۙۢۤۛۤۧۘۘ"
            goto L_0x0026
        L_0x0095:
            java.lang.String r0 = "ۛۖۥۘۦۤۜۖۨۛۨۜۛۦۙ۬ۗۧۦۘۥۦۚۘۢۖ"
            goto L_0x0026
        L_0x0098:
            java.lang.String r0 = "۟ۨۤ۟ۤۡۘۜۤۡۨۦۖۛۨۘ"
            goto L_0x0047
        L_0x009b:
            java.lang.String r0 = "ۘۙۥۘۨۥۘۙ۫ۛۜۜۗۛۗۡۧ"
            goto L_0x0047
        L_0x009e:
            int r0 = f1123h     // Catch:{ Exception -> 0x008b }
            android.view.View r0 = r5.findViewById(r0)     // Catch:{ Exception -> 0x008b }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x008b }
            r0.setTextColor(r1)     // Catch:{ Exception -> 0x008b }
        L_0x00a9:
            java.lang.String r0 = "quoted_divider_picker"
            r1 = -11
            int r1 = com.obwhatsapp.youbasha.others.getColor(r0, r1)     // Catch:{ Exception -> 0x008b }
            r2 = 112154453(0x6af5755, float:6.5956007E-35)
            java.lang.String r0 = "ۢۗۛۗۨ۫ۤۢۢۛۡۘۢۤۛۛۚۙ"
        L_0x00b6:
            int r3 = r0.hashCode()     // Catch:{ Exception -> 0x008b }
            r3 = r3 ^ r2
            switch(r3) {
                case -2064175775: goto L_0x008c;
                case -1929638308: goto L_0x00c7;
                case -1760984891: goto L_0x00ca;
                case -16865450: goto L_0x00bf;
                default: goto L_0x00be;
            }     // Catch:{ Exception -> 0x008b }
        L_0x00be:
            goto L_0x00b6
        L_0x00bf:
            if (r1 == r4) goto L_0x00c4
            java.lang.String r0 = "ۜۙۨۘ۠ۜۜۘۤۗۥۜ۬ۚۛۦۧۘۗ۠۟ۛۧ"
            goto L_0x00b6
        L_0x00c4:
            java.lang.String r0 = "ۚۙۛ۠ۡۘ۫ۤۨۖ۬ۥۘ۬۠ۥۘۦۥۗۚۨۖۡۥ۬"
            goto L_0x00b6
        L_0x00c7:
            java.lang.String r0 = "ۜۛۡۧۖ۫ۨ۬ۜ۟۬ۖۨۙۜۘ۟ۢۖۦۧۧۙۥۘۛۤۚ"
            goto L_0x00b6
        L_0x00ca:
            int r0 = f1124i     // Catch:{ Exception -> 0x008b }
            android.view.View r0 = r5.findViewById(r0)     // Catch:{ Exception -> 0x008b }
            com.obwhatsapp.yo.q r2 = new com.obwhatsapp.yo.q     // Catch:{ Exception -> 0x008b }
            r3 = 1
            r2.<init>(r0, r1, r3)     // Catch:{ Exception -> 0x008b }
            r0.post(r2)     // Catch:{ Exception -> 0x008b }
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.TextBubbleLeft.setQView(android.view.View):void");
    }

    public final void a() {
        View view = null;
        String str = "ۛۘۜۘۨۜۧۡۤ۬ۙۧۤۙ۠ۗ";
        while (true) {
            switch ((str.hashCode() ^ 438) ^ -298497405) {
                case -1483429734:
                    return;
                case -1453766661:
                    this.f1125a = view;
                    str = "ۥ۬ۢۜۙۤۙۚۜ۠ۛۜۘ۠ۖۥۘ۠ۘۥۘۨۥۥ۟ۜۛۢۗۦۘ";
                    break;
                case -795413145:
                    view = LayoutInflater.from(getContext()).inflate(yo.getID("yo_bubbletickpreview_left", "layout"), this);
                    str = "ۚ۠ۜۘۙۦۘ۫۠ۖۘ۫ۦۧۘۦ۫ۧ۬ۤۘۧۘۛۥۨۨۛۤ";
                    break;
                case 191572419:
                    this.f1128d = (TextView) this.f1125a.findViewById(yo.getID("message_text", "id"));
                    str = "ۦۨۨۘۤۘۙۡۨۖۛۖۛۘۡۙۗۨۘۘۜۤۖۘ۬۟ۖ";
                    break;
                case 268337950:
                    updateBubbleStyle();
                    str = "ۢ۫۬ۤۦۙ۬۠ۥۢۢۜ۬۠ۦۘ۫ۚۘۨۗۢ";
                    break;
                case 563311898:
                    TextView textView = (TextView) this.f1125a.findViewById(yo.getID("date", "id"));
                    str = "ۜۧۢۤۘۜۘۦ۫ۖۗۨ۫ۖۖۨۘۜۥۢۚۥۡۘۥۗۗۘۤ";
                    break;
                case 919885282:
                    this.f1127c = (ViewGroup) view.findViewById(yo.getID("main_layout", "id"));
                    str = "ۤۡۚۗۤۥۨۘۥ۠۫ۗۗۢۦۘ";
                    break;
                case 1074564265:
                    this.f1129e = (TextView) this.f1125a.findViewById(yo.getID("date", "id"));
                    str = "ۙۘۗۧ۠ۦ۟ۖۖۨۨۧۘۥۡۨۘۚۧۙۛۢۥۘ";
                    break;
                case 1186878794:
                    this.f1130f = (ViewGroup) this.f1125a.findViewById(yo.getID("quoted_message_frame", "id"));
                    str = "ۚۗۜۘۦۛۡ۫ۛ۟ۖۛۥۖۦۡۘ";
                    break;
                case 1798628860:
                    str = "ۗ۠۠۠ۖۢۦۢۤۨۨ۫ۜۖۘۛۛۗۚ۫ۨۘ";
                    break;
            }
        }
    }

    public void hideQuotedView(boolean z2) {
        ViewGroup viewGroup = null;
        String str = "ۛۚۧۙ۠ۢ۫ۨۦۧۖۡۘۨۗۦۘ";
        int i2 = 0;
        int i3 = 0;
        while (true) {
            switch ((str.hashCode() ^ 75) ^ 204242023) {
                case -2147044048:
                    i3 = 8;
                    str = "ۤۥ۠ۛۘۥۨۚۡۜۘۧۘۛۜۥ۠ۨۘۘ۬ۗۜۘ";
                    break;
                case -1983803936:
                    str = "۠۟ۡۖ۟ۨۘۨۗۡۘ۟۫ۥۤ۬ۡۧۗۦ";
                    break;
                case -1786694836:
                    str = "۬ۙۥۜۚۘۘۧۤۡۧۨ۠۬ۖۘ۫ۙۨۘۖۧ";
                    i2 = i3;
                    break;
                case -1448563239:
                    viewGroup.setVisibility(i2);
                    str = "ۜۥۨۘۦۜۨۘۤ۬ۤ۫۬ۥۧۧۜۘ۟ۤۢۜۘۚ";
                    break;
                case -1378648464:
                    str = "۠۟ۡۖ۟ۨۘۨۗۡۘ۟۫ۥۤ۬ۡۧۗۦ";
                    i2 = 0;
                    break;
                case -1007232463:
                    str = "۬ۖ۫ۦۧۗۨ۠ۜۘۢۘۜۖ۟ۡۥۦۡ";
                    break;
                case -879841384:
                    String str2 = "ۖۙ۠ۗۘۚۙۦ۫ۚ۫ۜۜۨۘۛ۠ۦۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -1751425881) {
                            case -1629117832:
                                str2 = "ۡ۫ۥۧۢۖۖۘ۫ۜۨۘۗۤۖ۟ۖۜۘۥۦۨ";
                                break;
                            case -791295779:
                                if (!z2) {
                                    str2 = "۬ۙۚۘۗ۟ۙۦ۬ۡۥۙۜ۟ۗۧۧۦ۬۠ۤ";
                                    break;
                                } else {
                                    str2 = "ۦ۫ۡ۫ۘ۬ۢۜۢۢۗۧۦ۠ۖ۫ۡۤ";
                                    break;
                                }
                            case -790862487:
                                str = "ۨۖۡۘۤۗۙۛ۠ۘۦ۟ۡۘۦۘۛ۟ۗۨۘ۬ۘ۠ۘۛۤ";
                                continue;
                            case 1200483986:
                                str = "ۧ۬۟ۦۢۖۛ۫ۖۘۖۛۨۜۘۘۦۚۧۤۘۥ";
                                continue;
                        }
                    }
                    break;
                case 56629496:
                    viewGroup = this.f1130f;
                    str = "۟ۘۜۢۗۦۜۛۖۘ۠ۙۡۨۢۘۘ۬ۨۜ۫ۧۙۘۜۘۘ";
                    break;
                case 613351753:
                    str = "ۗ۠۠ۨۛ۟ۢۗ۟ۡۢ۟ۧۧۡۘۖۘۦۘ";
                    break;
                case 1454673928:
                    return;
                case 1495426021:
                    str = "ۚۤۤۨۨۧۗۦۦۢ۠ۥۙۖۖۘ";
                    break;
            }
        }
    }

    public void setDate(String str) {
        String str2 = "ۢۙۡۜۥۢۥۧۖۘ۠ۘۥۤۖۥۖۥۖۨۨ";
        while (true) {
            switch ((str2.hashCode() ^ 811) ^ -1134584888) {
                case -501970261:
                    str2 = "ۗۖۤۛۤۗۚ۫ۨۨ۟ۦۨۘۧۘۨۦۖۡۡۥۧۗۚۤۗ۟";
                    break;
                case 189313862:
                    return;
                case 617715282:
                    this.f1129e.setText(str);
                    str2 = "ۥ۫ۥۘ۟ۨۥۧۗۨۘ۬ۚۖۖۦۢۤۤۤ۫ۤۡۘۦۦۢۥۛۖ";
                    break;
                case 824218029:
                    str2 = "۫ۦ۠۟ۤۜۢۢۗۛۦ۠ۗۥۘ۟ۙۜ";
                    break;
            }
        }
    }

    public void setMessageText(String str) {
        String str2 = "ۨۙۘۘۢۨۥۤۧۖۘ۬ۧۦۘۜۦۙۥۡۡۘ";
        while (true) {
            switch ((str2.hashCode() ^ 159) ^ -1548788781) {
                case -1643614880:
                    return;
                case -1090828274:
                    str2 = "ۡ۫ۖۘۡ۬ۗۗۗۤۖۦۦۘۢۦۘۢۗۚۙۥۥۘۤ۟ۦۖۖۚ";
                    break;
                case 1432080009:
                    str2 = "ۙۚ۟ۡ۬ۚۛ۫ۖۘۨۧۘۘۖۧۖۘۜ۬ۖۜ۬";
                    break;
                case 1494523661:
                    this.f1128d.setText(str);
                    str2 = "ۥۦۡۨۖۤۥۢۨۤۤۙۢۛۘۗۧۗ";
                    break;
            }
        }
    }

    public void showDelIcon() {
        String str = "۠ۛۖۘ۟۟۫ۧۜۡۘۜۗۖۡۢۦۢۛۘۧ۠ۤۢۖۗ";
        while (true) {
            switch ((str.hashCode() ^ 344) ^ 775830048) {
                case -1857247563:
                    return;
                case -1655486773:
                    str = "ۢۦۧ۟ۚ۬ۘ۫ۢ۟۬ۥۛۘۖۘۨۦۖۧۡ۠";
                    break;
                case 327057148:
                    yo.setDelIcon(this.f1129e, false);
                    str = "ۜۜۘ۟ۡۘۨۙۦۘۖۦۥۙۖۧۢۗۘ";
                    break;
            }
        }
    }

    public void updateBubbleStyle() {
        Drawable drawable = null;
        int i2 = 0;
        String str = "۬ۢۛ۬ۘۢۢ۬ۡۖۧ۟۠ۨۘۘۜۚۘۥۦۢۨۥۨ۬ۤۢ";
        while (true) {
            switch ((str.hashCode() ^ 957) ^ -1146748077) {
                case -1913220595:
                    this.f1125a.invalidate();
                    str = "ۨۥۜۨ۟ۗۘ۠۫ۗ۠ۚۦۦ۫ۙۘۦۘ۟۠ۨۘ";
                    break;
                case -1812413864:
                    str = "ۧۥۜۘۧۥۡ۫ۖۧۘۛۧۢۜۜۘۢۘۗۢۧۨۢ";
                    break;
                case -1324801904:
                    return;
                case -792249085:
                    this.f1128d.setTextSize(2, (float) shp.getPrefInt("text_size_pick", 16));
                    str = "۠ۦۥۘۖۖۥۘۤ۠ۡۘۛۜ۠ۨۤۚ";
                    break;
                case -570986177:
                    this.f1128d.setTextColor(others.getColor("ModChatBubbleTextLeft", ColorStore.getDefaultChatBubbleTextColor()));
                    str = "ۨۗۦ۫ۖۘ۫ۤۘۧۤۙۢۢ۠";
                    break;
                case -176848922:
                    this.f1127c.setBackground(drawable);
                    str = "ۨۢۜۘۢۧ۫۬ۖۥۘۤۙۦۗۡ۟";
                    break;
                case -28827070:
                    Conversation.paintDelIcon(this.f1129e);
                    str = "ۛ۟ۤ۟ۘۖ۟۬ۖۧۘۘۜۙ۟۠۫ۘۘ";
                    break;
                case 240262309:
                    String str2 = "ۚۙ۟ۖۧۢۘ۫ۖۘ۫ۚۖۘۚۨۚۢۦۘۘ۟ۜۘۘ۫ۡۖۘ۬ۦۚ";
                    while (true) {
                        switch (str2.hashCode() ^ -445996320) {
                            case -1705243855:
                                str = "۟ۢۙۘۥۜۖۡۡۨۘ۬ۘۨۗ";
                                continue;
                            case 116940018:
                                if (i2 == -11) {
                                    str2 = "ۖۛۜۨۦۘۘۤۜۨۘۙ۠ۦ۟ۤۙۧ۫ۧ";
                                    break;
                                } else {
                                    str2 = "ۜ۠ۡۘۚۙ۠ۢ۠۬۬۠ۙۢۤۦۘ۫ۘۥ";
                                    break;
                                }
                            case 217855267:
                                str = "ۥۤۢۤۚۜۜۗۥ۟ۛ۟۬ۥ۟ۥ۬۠ۙۦۘۘ۠ۘۥۘۛۜ۟";
                                continue;
                            case 1329340551:
                                str2 = "۬ۦ۠ۗۧۚۚۤۦۘۦۜۤۚۡۘ";
                                break;
                        }
                    }
                    break;
                case 285050487:
                    drawable = yo.BubbleStyle(getContext(), 3, this.f1126b);
                    str = "۫ۚۤۗۧۜۘۛ۬ۥۦ۬ۛۘ۫ۘۘ";
                    break;
                case 1077059065:
                    drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
                    str = "۟ۢۙۘۥۜۖۡۡۨۘ۬ۘۨۗ";
                    break;
                case 1285589851:
                    i2 = others.getColor("ModChatLeftBubble", -11);
                    str = "ۘۖۜۢۙۜۘ۫ۛۢۥۨۦۘۧۜۢۢ";
                    break;
                case 1351784060:
                    setQView(this.f1130f);
                    str = "ۦ۫ۨۘۜ۬۫ۨۧۨۥ۟۫۬ۨۖ۠ۦۤۤۗۨۘۜۢۜۘۢ۠ۘ";
                    break;
                case 1661080432:
                    this.f1129e.setTextColor(others.getColor("date_left_color", ColorStore.getDefaultChatBubbleDateColor()));
                    str = "ۛۘۜۘۛۥ۫ۜۡۘۦۢ۫ۧۦۜۧۨ۫ۥۢۚ";
                    break;
            }
        }
    }
}
