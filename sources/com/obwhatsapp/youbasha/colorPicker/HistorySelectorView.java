package com.obwhatsapp.youbasha.colorPicker;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import j.b;
import j.h;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.wawebrtc.MediaCodecVideoEncoder;

public class HistorySelectorView extends LinearLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final String f988d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f989e;

    /* renamed from: a  reason: collision with root package name */
    public int f990a;

    /* renamed from: b  reason: collision with root package name */
    public JSONArray f991b;

    /* renamed from: c  reason: collision with root package name */
    public h f992c;

    static {
        String str = "۬ۡ۠۟ۙۛۗۘ۬۠ۛ۟۠ۛۗۤۚۥۛۛۜ۠ۜۧ۫ۖۖۘ";
        StringBuilder sb = null;
        StringBuilder sb2 = null;
        while (true) {
            switch ((str.hashCode() ^ 22) ^ -1400996040) {
                case -1627301836:
                    return;
                case -1510815585:
                    sb2.append(".HISTORY");
                    str = "ۨۘۤ۬ۥ۟ۥۥۖۘۙۧۘۘ۠ۢۛ";
                    break;
                case -1371736677:
                    sb2.append(HistorySelectorView.class.getPackage());
                    str = "ۧۜۦۘ۟ۥۛۘۛۨۛ۬ۚ۬۫";
                    break;
                case -862790759:
                    f988d = sb2.toString();
                    str = "ۜۡۦۖۢ۟۟ۧ۫ۙۧۚۘۚۧۙۨۥۘۖ۫ۜۘۦۨۢ";
                    break;
                case -396098832:
                    sb.append(HistorySelectorView.class.getPackage());
                    str = "ۚۢۜۥۦ۫۬ۦۜۘۤۗ۟ۛۨۧۘ";
                    break;
                case 95878764:
                    f989e = sb.toString();
                    str = "۠ۜۡۜ۬ۜۘۨۨۘۖ۟ۖۘۨۚ۟ۧ۬ۚۢۚۥۦۙ۠";
                    break;
                case 1745017037:
                    sb = new StringBuilder();
                    str = "ۡۤ۠ۤۜۧۘۖۜ۟ۤۤۤۧۗۨۘ۫ۗۛ";
                    break;
                case 1830703696:
                    sb.append(".RECENT_COLORS");
                    str = "ۙ۠ۗۙۢۡۘۛۤ۬ۗۧۧۦ۬ۢۜۦۤ";
                    break;
                case 2082547152:
                    str = "ۥۤۨۚۧۙۤۖۛ۬ۛۜ۬۫ۧۢۗۢۖۧ۬۬۫ۦۥۢ";
                    sb2 = new StringBuilder();
                    break;
            }
        }
    }

    public HistorySelectorView(Context context) {
        super(context);
        b();
    }

    public HistorySelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public static void a(HistorySelectorView historySelectorView, int i2) {
        h hVar = null;
        int i3 = 0;
        String str = "ۤۡۦۘۨۢۖۘۦۙۖۘۗۜۤۙ";
        while (true) {
            switch ((str.hashCode() ^ 78) ^ 1516383939) {
                case -1387384066:
                    str = "۟ۙ۬ۙۗ۫ۡۤۘۗۜۙۤۜۢۦۛۡۗۧۦۛ۠ۢ";
                    break;
                case -1092873299:
                    ((b) hVar).colorChanged(i3);
                    str = "۠ۢۖ۫۠ۖۥ۟ۘۘۦۜۧۗۘۖۘۜۧ۠۬۫ۜ";
                    break;
                case -553366136:
                    i3 = historySelectorView.getColor();
                    str = "ۨۗ۠ۦۢۙۘۚ۫ۛ۫۫ۜۖۧۖۧ";
                    break;
                case -259276626:
                    historySelectorView.setColor(i2);
                    str = "ۛۨۛ۬ۙۡۘۖۢۖ۟ۚ۟۫۟ۦۧۚ۬";
                    break;
                case -204001800:
                    return;
                case -178870498:
                    hVar = historySelectorView.f992c;
                    str = "۟ۙ۟ۜۧۨۨ۠ۖۘۨۜۡۘ۬ۙۦۙۥ۠۟ۜۥۘ";
                    break;
                case -120028539:
                    String str2 = "ۖۧۖۜۜۗۦۢ۟ۡۤۙۜۘۡۘۥ۟۟ۙۚۖۘۡۢۡۨ۬ۘۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1359558559) {
                            case -577323205:
                                str = "۠ۢۖ۫۠ۖۥ۟ۘۘۦۜۧۗۘۖۘۜۧ۠۬۫ۜ";
                                continue;
                            case -472586163:
                                str2 = "ۥۖۡۘۡۦۘۚۤۘۘ۬ۙۦۘۜۤ";
                                break;
                            case 74253443:
                                str = "ۛ۫ۦۘۛۨۖۘۧۧۦۢۦۛ۬ۦ۟ۤ۫ۡۘۙۡۖۡۖۧ۟۬ۗ";
                                continue;
                            case 1843400683:
                                if (hVar == null) {
                                    str2 = "ۘۦۘ۟ۖ۬ۥۧۥ۠۟ۚۥۚۥۗۜۖ";
                                    break;
                                } else {
                                    str2 = "ۧۙۡۘۘۛ۟ۥۢۜ۬ۚۧۖۤۡۗۙۜۘ۬ۤ۬۫۠ۗ";
                                    break;
                                }
                        }
                    }
                    break;
                case 53027959:
                    str = "۬ۘۙۛۚۨۛۛۗۖ۠ۛۦۨۗۖۚۖ";
                    break;
            }
        }
    }

    private int getColor() {
        String str = "ۖۜۖ۟۬۬ۜ۫ۚۧۛ۫ۛۘۘۛ۟۠";
        while (true) {
            switch ((str.hashCode() ^ 569) ^ -704013524) {
                case 610995657:
                    str = "ۚۥۚۧۜۘۛۦۦۧۤۨۘۥۤۨۖۛۛۨ۠۟۟ۖۨۘ";
                    break;
                case 1952082264:
                    return this.f990a;
            }
        }
    }

    private void setColor(int i2) {
        String str = "ۧۙۦۘۜۡۦۘۛۡۧۛ۠ۛ۠ۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 564) ^ -2013231244) {
                case -1149983897:
                    return;
                case -1090965821:
                    str = "ۗۢۦۘۧۘۖۘۛۥۦۘ۫ۙۖۘ۠ۜۧۘۘۡ";
                    break;
                case -93066446:
                    str = "۬ۜۙ۬ۤۘۘۢۤۢۙۡۨۘۨۨۧ";
                    break;
                case 1438966608:
                    this.f990a = i2;
                    str = "ۡۘۘۘۡۤۚۖۖۧۘ۫ۤۚۖۥۘۙۘ۟";
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r8 = this;
            r7 = 8
            r6 = 0
            android.content.Context r0 = r8.getContext()
            java.lang.String r1 = "layout_inflater"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            java.lang.String r1 = "color_historyview"
            java.lang.String r2 = "layout"
            int r1 = com.obwhatsapp.youbasha.others.getID(r1, r2)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r8.addView(r0, r1)
            r8.readColors()
            android.content.Context r0 = r8.getContext()
            java.lang.String r1 = "layout_inflater"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            java.lang.String r1 = "colorlist"
            java.lang.String r2 = "id"
            int r1 = com.obwhatsapp.youbasha.others.getID(r1, r2)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            org.json.JSONArray r3 = r8.f991b
            r4 = -399099723(0xffffffffe83638b5, float:-3.442067E24)
            java.lang.String r2 = "۠۟ۙۡۧ۟ۥۤۙۘۨۘۡۢۡۘۨۙۥۡۡۤۗۤۖۘ"
        L_0x004a:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -1058894467: goto L_0x00d3;
                case -368271311: goto L_0x0059;
                case -209746600: goto L_0x005e;
                case 267499671: goto L_0x0053;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x004a
        L_0x0053:
            java.lang.String r2 = "ۦۥۜۘ۫ۘۖۘۙۗۙۥۘۢۡۖۤۗۙ۬ۧ۫ۨۘ"
            goto L_0x004a
        L_0x0056:
            java.lang.String r2 = "ۢۢ۟ۛۤۥۘ۫۫۫۬۫ۗۡۢۚۖۥۘۗۜۧۤۢۘۘ"
            goto L_0x004a
        L_0x0059:
            if (r3 == 0) goto L_0x0056
            java.lang.String r2 = "ۡۦ۬ۨ۬ۖۦۦۧۧۘ۟ۚۘۘۤ۫ۚ۠ۙۦ"
            goto L_0x004a
        L_0x005e:
            r4 = -1590806238(0xffffffffa12e3922, float:-5.902911E-19)
            java.lang.String r2 = "ۢ۟ۡۘۤۛ۟ۦۙۡۘ۟ۛۡۤۘۨۤۡ۫"
        L_0x0063:
            int r5 = r2.hashCode()
            r5 = r5 ^ r4
            switch(r5) {
                case -165164361: goto L_0x00d3;
                case 763869031: goto L_0x007b;
                case 1532118595: goto L_0x006c;
                case 1532606370: goto L_0x0078;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x0063
        L_0x006c:
            int r2 = r3.length()
            if (r2 > 0) goto L_0x0075
            java.lang.String r2 = "۬ۚۧ۬ۜۧۘۛۤۗ۠ۙۨۘ۫ۗۖۘ۫۠ۜۘ۠۠ۧۢۖ۟"
            goto L_0x0063
        L_0x0075:
            java.lang.String r2 = "۬ۢۢۧ۬۟ۧۡۦۗۤۢۦۥۘۤۧۧۚۚۧ"
            goto L_0x0063
        L_0x0078:
            java.lang.String r2 = "۠۟ۨ۟ۥۨۘۡۙ۟۟ۚۘۖۦۦۙۥۧ۠ۗۘۘۦ"
            goto L_0x0063
        L_0x007b:
            org.json.JSONArray r2 = r8.f991b     // Catch:{ Exception -> 0x00f5 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x00f5 }
            int r2 = r2 + -1
            r4 = r2
        L_0x0084:
            r3 = -342647490(0xffffffffeb939d3e, float:-3.569093E26)
            java.lang.String r2 = "ۗۨۨۙۜ۫ۙۖۛۚۜۘۙۡۤۛۨۦۘۙۨۡ"
        L_0x0089:
            int r5 = r2.hashCode()
            r5 = r5 ^ r3
            switch(r5) {
                case -1012595473: goto L_0x009a;
                case -227079234: goto L_0x0092;
                case 1172487020: goto L_0x009d;
                case 1423958380: goto L_0x00f4;
                default: goto L_0x0091;
            }
        L_0x0091:
            goto L_0x0089
        L_0x0092:
            if (r4 < 0) goto L_0x0097
            java.lang.String r2 = "ۜ۬ۙ۟ۗۗۡ۬ۢۜۨۜۘۖۗ۟ۚ۬ۘ"
            goto L_0x0089
        L_0x0097:
            java.lang.String r2 = "ۢ۫ۘۘۨۨۧۡۡۜۛۙۘۨۧۘ۬ۨ۫"
            goto L_0x0089
        L_0x009a:
            java.lang.String r2 = "ۥۙ۠ۖۗۘۥۢ۠ۖۦۙ۠۟۫ۗۧۛۜۢۨ"
            goto L_0x0089
        L_0x009d:
            org.json.JSONArray r2 = r8.f991b     // Catch:{ Exception -> 0x00f5 }
            int r5 = r2.getInt(r4)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r2 = "color_historyview_item"
            java.lang.String r3 = "layout"
            int r2 = com.obwhatsapp.youbasha.others.getID(r2, r3)     // Catch:{ Exception -> 0x00f5 }
            r3 = 0
            android.view.View r2 = r0.inflate(r2, r1, r3)     // Catch:{ Exception -> 0x00f5 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r3 = "colorbox"
            java.lang.String r6 = "id"
            int r3 = com.obwhatsapp.youbasha.others.getID(r3, r6)     // Catch:{ Exception -> 0x00f5 }
            android.view.View r3 = r2.findViewById(r3)     // Catch:{ Exception -> 0x00f5 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ Exception -> 0x00f5 }
            r3.setBackgroundColor(r5)     // Catch:{ Exception -> 0x00f5 }
            r1.addView(r2)     // Catch:{ Exception -> 0x00f5 }
            com.obwhatsapp.yo.autoschedreply.a r2 = new com.obwhatsapp.yo.autoschedreply.a     // Catch:{ Exception -> 0x00f5 }
            r6 = 2
            r2.<init>(r8, r5, r6)     // Catch:{ Exception -> 0x00f5 }
            r3.setOnClickListener(r2)     // Catch:{ Exception -> 0x00f5 }
            int r2 = r4 + -1
            r4 = r2
            goto L_0x0084
        L_0x00d3:
            java.lang.String r0 = "nocolors"
            java.lang.String r2 = "id"
            int r0 = com.obwhatsapp.youbasha.others.getID(r0, r2)
            android.view.View r0 = r8.findViewById(r0)
            r0.setVisibility(r6)
            r1.setVisibility(r7)
            java.lang.String r0 = "colorlistscroll"
            java.lang.String r1 = "id"
            int r0 = com.obwhatsapp.youbasha.others.getID(r0, r1)
            android.view.View r0 = r8.findViewById(r0)
            r0.setVisibility(r7)
        L_0x00f4:
            return
        L_0x00f5:
            r0 = move-exception
            goto L_0x00f4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.colorPicker.HistorySelectorView.b():void");
    }

    public JSONArray moveValueToFront(JSONArray jSONArray, int i2, int i3) {
        String str = "ۨ۠۠ۘۙۤۚ۠ۘۢۥۗۦ۬ۚۙۙۤۙۨۢۙۨۥۘ";
        Iterator it = null;
        JSONArray jSONArray2 = null;
        int i4 = 0;
        int i5 = 0;
        LinkedList linkedList = null;
        while (true) {
            switch ((str.hashCode() ^ 445) ^ 493031052) {
                case -2007900221:
                    str = "ۘ۠ۘۙۢۛۜۦۖۡ۟ۧۦۖۧ";
                    i5 = i4;
                    break;
                case -1606952147:
                    return jSONArray2;
                case -1320446167:
                    jSONArray2.put(((Integer) it.next()).intValue());
                    str = "ۨۜۡۘ۬ۤ۠ۨ۟ۦۨۢ۠ۙۦۙۗۦۗۙ۟ۛۛۨۚ";
                    break;
                case -1282768695:
                    str = "ۜۙۖۦۨۖۘ۫ۢ۟ۤۘۖۗ۬ۢ۫۟ۙۖۢۤۘۜۛۜۛۡ";
                    break;
                case -1229282327:
                    str = "ۚ۫ۡۘۡۖ۟ۚۛ۫ۤۘۦۘۥۗۖۤ۟ۖۘۗۖۚۘ۫ۧ";
                    break;
                case -1177944668:
                    str = "۠ۧۘۘۘۗۢۚۘۙ۫۬ۜۧۙۗ";
                    break;
                case -1001908199:
                    str = "ۡۥۜۘ۫۫ۧۙۦۥۘۧ۟ۦۗۛۜۘ۬ۤ۟ۢۤۡۘ";
                    break;
                case -833961027:
                    linkedList.add(Integer.valueOf(i3));
                    str = "۫ۥۦۘۚۘۗۤۧۛ۟ۖۘۚۧۥۖۨۛ";
                    break;
                case -656946824:
                    str = "ۧ۬ۡۘۘۢۡۘۢۚۚۛۨۧۘ۬ۥۜ۟ۦۧۘ";
                    break;
                case -453809373:
                    it = linkedList.iterator();
                    str = "ۡۥۜۘ۫۫ۧۙۦۥۘۧ۟ۦۗۛۜۘ۬ۤ۟ۢۤۡۘ";
                    break;
                case 271282976:
                    linkedList.add(Integer.valueOf(jSONArray.getInt(i5)));
                    str = "ۛۦۢۦۡۘ۬ۙۦ۬ۨۗۢۘۜۦ۟ۜ";
                    break;
                case 376894597:
                    str = "ۜۡۥ۟ۤۨ۫ۗۧۗ۫۫ۤۢۙۧ۫ۨۘۘۡ۫";
                    linkedList = new LinkedList();
                    break;
                case 809998132:
                    str = "ۡۦۦۘۢۤۤۛۛۖۘۡۘۘۢۦۤ۠ۥۦۘۜ۫";
                    i4 = i5 + 1;
                    break;
                case 815719741:
                    String str2 = "ۤ۬ۘۘۚۘۛۧۗ۬ۡ۠ۡ۟۠ۨۘۖ۬ۨۨۡۥۘۛۜۘۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 797121193) {
                            case -1973698246:
                                if (i5 >= jSONArray.length()) {
                                    str2 = "ۨۢ۬ۘۗۙۦۗ۠ۛۥۢۜۘ";
                                    break;
                                } else {
                                    str2 = "ۧۢ۠۫ۛۗۚۨۚ۬ۙۡۘۖۡۢ";
                                    break;
                                }
                            case 262106560:
                                str2 = "ۨ۟۬ۖۙۥۖ۟ۘۘۗۢۖ۫ۦۥ";
                                break;
                            case 1035254140:
                                str = "ۡۛۗۨۡۦۗ۟ۛۚۧ۠ۛ۫ۤۖۛۡ۠ۢ۫";
                                continue;
                            case 1393511972:
                                str = "ۜۛۖۧۘۜۡۧۤۗۥۚ۫ۡۚۨۜ۟ۗۢ۠";
                                continue;
                        }
                    }
                    break;
                case 999093945:
                    str = "ۘۙۘۘۜۘۦۜۨۙۧۗۥۛۙۥۘۡۡۥۘ";
                    break;
                case 1124588998:
                    str = "ۙۖۘۙ۠ۖۙۚۦۤۚۡ۠ۦۦۘ۬ۤۡۘۘۡۡۦۡ";
                    jSONArray2 = new JSONArray();
                    break;
                case 1400896099:
                    str = "ۙ۬ۤ۬ۦۤۙۜۨۙۤ۫ۚۨۦ۫ۙۤۖۤۙۜۢ۬ۚ۟";
                    break;
                case 1566139683:
                    str = "ۚ۫ۡۘۡۖ۟ۚۛ۫ۤۘۦۘۥۗۖۤ۟ۖۘۗۖۚۘ۫ۧ";
                    i5 = 0;
                    break;
                case 1689295734:
                    linkedList.remove(i2);
                    str = "۟ۧۥۛۙۘۘۛۦ۬ۚۢۗۜۨۧۛ۠";
                    break;
                case 1905516040:
                    String str3 = "ۡۢۦۘۛۖۖۧۘۧۘۧۧۨۚۦۛۗۦۖۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -2058856022) {
                            case -1710806946:
                                str = "ۖۨۥۘۜۡۜۨۡۨۘ۬۬ۙۜۨۦۘ";
                                continue;
                            case -1261864088:
                                if (!it.hasNext()) {
                                    str3 = "ۤ۠ۤۗۨ۫ۦۢ۬ۗۨۢۨ۫ۦ۟ۡۨۚۥۢۤۥۦۥۤۗ";
                                    break;
                                } else {
                                    str3 = "۠ۢۖۢۙۦۘۥۥۦ۠۠ۦۥ۠ۚۜۗۙ۬ۜ";
                                    break;
                                }
                            case 1107680597:
                                str = "ۢۥۖۧۨۘۘۤۗۜۘۥۨۜۧۡۨ";
                                continue;
                            case 1336737638:
                                str3 = "ۥۛۖۧۦۖ۫ۜۖۧۚۜۤۘۗۢۚ۟ۚۧ۫";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    public void readColors() {
        try {
            this.f991b = new JSONArray(getContext().getSharedPreferences(f989e, 0).getString(f988d, ""));
        } catch (Exception e2) {
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void selectColor(int r7) {
        /*
            r6 = this;
            r1 = 0
            android.content.Context r0 = r6.getContext()     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r2 = f989e     // Catch:{ Exception -> 0x00b5 }
            r3 = 0
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r2, r3)     // Catch:{ Exception -> 0x00b5 }
            r2 = 1657307970(0x62c88342, float:1.8494035E21)
            java.lang.String r0 = "ۚۖۚۢۡۥۘۚۥۦۘۙۥ۫ۛ۫ۙ۫۬ۨۗۤۙۛۦ۫ۥۘۘ"
        L_0x0011:
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x00b5 }
            r4 = r4 ^ r2
            switch(r4) {
                case -1823162014: goto L_0x0046;
                case -1105952829: goto L_0x003f;
                case 80787634: goto L_0x001a;
                case 689449144: goto L_0x0021;
                default: goto L_0x0019;
            }     // Catch:{ Exception -> 0x00b5 }
        L_0x0019:
            goto L_0x0011
        L_0x001a:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ Exception -> 0x00b5 }
            r0.<init>()     // Catch:{ Exception -> 0x00b5 }
            r6.f991b = r0     // Catch:{ Exception -> 0x00b5 }
        L_0x0021:
            r0 = r1
            r2 = r1
        L_0x0023:
            r4 = -575874288(0xffffffffddacdb10, float:-1.55694585E18)
            java.lang.String r1 = "ۛۥۙۤ۫ۘۘۜۜۛۦ۬ۘۜ۠ۚۚۚۘۘۦۘ۠ۜۥۙۚ۫ۥ"
        L_0x0028:
            int r5 = r1.hashCode()     // Catch:{ Exception -> 0x00b5 }
            r5 = r5 ^ r4
            switch(r5) {
                case -695937177: goto L_0x004f;
                case -645532571: goto L_0x004c;
                case -640181255: goto L_0x0031;
                case 586451867: goto L_0x007b;
                default: goto L_0x0030;
            }     // Catch:{ Exception -> 0x00b5 }
        L_0x0030:
            goto L_0x0028
        L_0x0031:
            org.json.JSONArray r1 = r6.f991b     // Catch:{ Exception -> 0x00b5 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x00b5 }
            if (r2 >= r1) goto L_0x0049
            java.lang.String r1 = "ۚۦۤۜ۫ۦ۠ۚۗۢۡ۬ۛۢ۠ۙۦ۠ۦۜۘ۫ۥۛۤۦ۟"
            goto L_0x0028
        L_0x003c:
            java.lang.String r0 = "ۤۛۚۡۨ۠ۨۤ۟ۜۧ۟ۖۡۡۡۘ۫۬ۚۖۘۨۜۙۢۘ۠"
            goto L_0x0011
        L_0x003f:
            org.json.JSONArray r0 = r6.f991b     // Catch:{ Exception -> 0x00b5 }
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "۬ۨۨۨ۫ۨۘ۫ۡۖۘ۠ۛۧۗۧۥ"
            goto L_0x0011
        L_0x0046:
            java.lang.String r0 = "ۥۚۡۘ۟ۛۙ۫ۨۢ۠ۖۧۤۖۘۘۢ۟ۜۘۚۚۘ"
            goto L_0x0011
        L_0x0049:
            java.lang.String r1 = "ۚ۫ۘۥۡۥۘۜۛۛۧ۟ۜ۟ۚ۠ۨ۬ۤۙ۠ۡۘ۫ۛۖۥۡ"
            goto L_0x0028
        L_0x004c:
            java.lang.String r1 = "ۧۥ۫ۤۗۡۡ۫ۗ۟ۙۡۘ۫ۛۖۧۜۛۘۗۨۡۜۤۢۦۘ"
            goto L_0x0028
        L_0x004f:
            r4 = -1280654135(0xffffffffb3aac4c9, float:-7.952037E-8)
            java.lang.String r1 = "ۤ۟ۜۚۛۤۙۖۖۧۗۦۘۗۧۤۙ۠ۧۨۥۚ۬ۚۘۥۗ۫"
        L_0x0054:
            int r5 = r1.hashCode()     // Catch:{ Exception -> 0x00b5 }
            r5 = r5 ^ r4
            switch(r5) {
                case -423138680: goto L_0x0066;
                case 1109340665: goto L_0x0078;
                case 1726035886: goto L_0x006d;
                case 1811344149: goto L_0x005d;
                default: goto L_0x005c;
            }     // Catch:{ Exception -> 0x00b5 }
        L_0x005c:
            goto L_0x0054
        L_0x005d:
            org.json.JSONArray r0 = r6.f991b     // Catch:{ Exception -> 0x00b5 }
            org.json.JSONArray r0 = r6.moveValueToFront(r0, r2, r7)     // Catch:{ Exception -> 0x00b5 }
            r6.f991b = r0     // Catch:{ Exception -> 0x00b5 }
            r0 = 1
        L_0x0066:
            int r1 = r2 + 1
            r2 = r1
            goto L_0x0023
        L_0x006a:
            java.lang.String r1 = "ۧ۬ۜۧۚۨۙۦۙۨۢۢۙۥۧۘۛۨۛ۬ۘۤ"
            goto L_0x0054
        L_0x006d:
            org.json.JSONArray r1 = r6.f991b     // Catch:{ Exception -> 0x00b5 }
            int r1 = r1.getInt(r2)     // Catch:{ Exception -> 0x00b5 }
            if (r1 != r7) goto L_0x006a
            java.lang.String r1 = "ۛۗۛ۠ۢۢۗۢۜ۠ۚۜۘۛۥۖ۫ۖۡ"
            goto L_0x0054
        L_0x0078:
            java.lang.String r1 = "ۨۙۨۘۚۗۖۘۥۡۜۘۢ۟ۜۘ۠۟ۢ۟ۧۙۦۘۤۜۥ"
            goto L_0x0054
        L_0x007b:
            r2 = -17248108(0xfffffffffef8d094, float:-1.6536577E38)
            java.lang.String r1 = "ۥۙۨۘۗ۟ۨ۠۟ۦۘۧۛۦۛۜۦۥۙۡۜۥۚۥۜۘۘ۬۠ۘ"
        L_0x0080:
            int r4 = r1.hashCode()
            r4 = r4 ^ r2
            switch(r4) {
                case -327262147: goto L_0x00a7;
                case 55394280: goto L_0x00ac;
                case 883485222: goto L_0x0089;
                case 1789543218: goto L_0x00af;
                default: goto L_0x0088;
            }
        L_0x0088:
            goto L_0x0080
        L_0x0089:
            r1 = -1554414117(0xffffffffa35985db, float:-1.17919386E-17)
            java.lang.String r0 = "۫۬ۡۘۗۗۜۘ۫ۨۦۥۚۧۧۗۜۘۧۗۥۖۦۡۘ"
        L_0x008e:
            int r2 = r0.hashCode()     // Catch:{ Exception -> 0x00b5 }
            r2 = r2 ^ r1
            switch(r2) {
                case -1589424693: goto L_0x00bd;
                case -103333112: goto L_0x0097;
                case 1549753918: goto L_0x00ba;
                case 2022700132: goto L_0x00f9;
                default: goto L_0x0096;
            }     // Catch:{ Exception -> 0x00b5 }
        L_0x0096:
            goto L_0x008e
        L_0x0097:
            org.json.JSONArray r0 = r6.f991b     // Catch:{ Exception -> 0x00b5 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x00b5 }
            r2 = 10
            if (r0 <= r2) goto L_0x00b7
            java.lang.String r0 = "ۢۚۗۤۡۚۙۖۡۘۢۧۙۘ۬ۦ۫۫ۥۘۜۧۘ۟ۥۡۦۚۘۘ"
            goto L_0x008e
        L_0x00a4:
            java.lang.String r1 = "ۥۥۖۛۤۖۘۗۙۜۧۚۦۖۡ۬ۜۘۖۥ"
            goto L_0x0080
        L_0x00a7:
            if (r0 != 0) goto L_0x00a4
            java.lang.String r1 = "۟ۘۨۘۗۧۙۘۜۡۘۡۘۖۛۙ۟ۜۢ۟ۛۡۛۚۛۖ"
            goto L_0x0080
        L_0x00ac:
            java.lang.String r1 = "۫ۚۘۘۢ۟ۗۛۙۛۧۛۦۤۖۗ۫ۨۘۦۘۦۘۘۦۧۘۜۘۧۘ"
            goto L_0x0080
        L_0x00af:
            org.json.JSONArray r0 = r6.f991b     // Catch:{ Exception -> 0x00b5 }
            r0.put(r7)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x0089
        L_0x00b5:
            r0 = move-exception
        L_0x00b6:
            return
        L_0x00b7:
            java.lang.String r0 = "ۢۙۡۘۧ۬ۛۦۤۜۘ۬ۙۜۙ۫"
            goto L_0x008e
        L_0x00ba:
            java.lang.String r0 = "ۙۧۥۘۛۖۨۗۦ۠۫ۢۖۘۗۧۚ۠۟ۥۘۧۤ۫"
            goto L_0x008e
        L_0x00bd:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x00b5 }
            r2.<init>()     // Catch:{ Exception -> 0x00b5 }
            org.json.JSONArray r0 = r6.f991b     // Catch:{ Exception -> 0x00b5 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x00b5 }
            int r0 = r0 + -10
            r1 = r0
        L_0x00cb:
            r4 = 713642289(0x2a895131, float:2.4392427E-13)
            java.lang.String r0 = "ۥۗۖ۟ۚ۫ۖۧۤۗۨ۫ۥۜۧۘۘۤۤۜ۬ۚۥۡۤۦۚۘۘ"
        L_0x00d0:
            int r5 = r0.hashCode()     // Catch:{ Exception -> 0x00b5 }
            r5 = r5 ^ r4
            switch(r5) {
                case -862111610: goto L_0x00ea;
                case -188508482: goto L_0x00df;
                case 104948622: goto L_0x00d9;
                case 729344514: goto L_0x00f7;
                default: goto L_0x00d8;
            }     // Catch:{ Exception -> 0x00b5 }
        L_0x00d8:
            goto L_0x00d0
        L_0x00d9:
            java.lang.String r0 = "ۤ۫ۡۡ۟ۘۘۥۜۧۡۡۨۛۤۗ۫۠ۧۜۢۜ۫ۛۤۙۛ۫"
            goto L_0x00d0
        L_0x00dc:
            java.lang.String r0 = "۠ۖۧۘۚۧۘۦۚۛۧۛۚۦۦۖ"
            goto L_0x00d0
        L_0x00df:
            org.json.JSONArray r0 = r6.f991b     // Catch:{ Exception -> 0x00b5 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x00b5 }
            if (r1 >= r0) goto L_0x00dc
            java.lang.String r0 = "ۚۜۡۖۡۗۢۜۧ۟ۥۘۘۥۗ۟۬۟ۤۦۥۖۦۚۢۤۢ"
            goto L_0x00d0
        L_0x00ea:
            org.json.JSONArray r0 = r6.f991b     // Catch:{ Exception -> 0x00b5 }
            int r0 = r0.getInt(r1)     // Catch:{ Exception -> 0x00b5 }
            r2.put(r0)     // Catch:{ Exception -> 0x00b5 }
            int r0 = r1 + 1
            r1 = r0
            goto L_0x00cb
        L_0x00f7:
            r6.f991b = r2     // Catch:{ Exception -> 0x00b5 }
        L_0x00f9:
            android.content.SharedPreferences$Editor r0 = r3.edit()     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r1 = f988d     // Catch:{ Exception -> 0x00b5 }
            org.json.JSONArray r2 = r6.f991b     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00b5 }
            r0.putString(r1, r2)     // Catch:{ Exception -> 0x00b5 }
            r0.commit()     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00b6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.colorPicker.HistorySelectorView.selectColor(int):void");
    }

    public void setOnColorChangedListener(h hVar) {
        String str = "ۜۘ۠ۢۧۦۘۥۜۘ۠۬ۜ۠۟ۘۖ۫۠ۥ۠ۦۘۖۛۦۙۖۡۘ";
        while (true) {
            switch ((str.hashCode() ^ MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT) ^ 1298581055) {
                case -2024021375:
                    str = "۟ۢۡۘ۫۟ۥ۠ۨۡۘۚۥۖۘۨۧ";
                    break;
                case -1231241995:
                    return;
                case -818536605:
                    str = "۫۟ۖۡۜۘۗۧ۬ۖۧۛۖۡۦۥ۬ۧۦۧ۫ۛۜۙ۠ۛۡۘ";
                    break;
                case 265814893:
                    this.f992c = hVar;
                    str = "ۥۥ۫ۜۨۡۤۡۚۜۦۜۖۡۨۘ۫۠ۜۨۗ۫۬ۢ۟ۘۥۡ";
                    break;
            }
        }
    }
}
