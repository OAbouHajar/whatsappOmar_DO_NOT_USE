package com.obwhatsapp.yo.autoschedreply;

import android.widget.ArrayAdapter;

public final class c extends ArrayAdapter {

    /* renamed from: b  reason: collision with root package name */
    public static final int f683b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ListMessages f684a;

    public c(ListMessages listMessages) {
        super(listMessages, -1, listMessages.f670c);
        this.f684a = listMessages;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r18 = this;
            android.content.Context r2 = com.obwhatsapp.yo.yo.getCtx()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            java.lang.String r3 = "autoscheduler_item"
            java.lang.String r4 = "layout"
            int r3 = com.obwhatsapp.yo.yo.getID(r3, r4)
            r4 = 0
            android.view.View r11 = r2.inflate(r3, r4)
            com.obwhatsapp.yo.autoschedreply.a r2 = new com.obwhatsapp.yo.autoschedreply.a
            r3 = 0
            r0 = r18
            r1 = r19
            r2.<init>(r0, r1, r3)
            r11.setOnClickListener(r2)
            java.lang.String r2 = "autoscheduler_item_delete"
            java.lang.String r3 = "id"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            android.view.View r2 = r11.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            java.lang.String r3 = "conversations_text_gray"
            int r3 = com.obwhatsapp.yo.yo.getResColor(r3)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r2.setColorFilter(r3, r4)
            com.obwhatsapp.yo.autoschedreply.a r3 = new com.obwhatsapp.yo.autoschedreply.a
            r4 = 1
            r0 = r18
            r1 = r19
            r3.<init>(r0, r1, r4)
            r2.setOnClickListener(r3)
            java.lang.String r2 = "list_receipt"
            java.lang.String r3 = "id"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r3)
            android.view.View r2 = r11.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r3 = "list_start_date"
            java.lang.String r4 = "id"
            int r3 = com.obwhatsapp.yo.yo.getID(r3, r4)
            android.view.View r3 = r11.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r4 = "list_clock"
            java.lang.String r5 = "id"
            int r4 = com.obwhatsapp.yo.yo.getID(r4, r5)
            android.view.View r4 = r11.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r5 = "list_text_message"
            java.lang.String r6 = "id"
            int r5 = com.obwhatsapp.yo.yo.getID(r5, r6)
            android.view.View r5 = r11.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r6 = "img_avatar_icon"
            java.lang.String r7 = "id"
            int r6 = com.obwhatsapp.yo.yo.getID(r6, r7)
            android.view.View r6 = r11.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            java.lang.String r7 = "list_frequency_type"
            java.lang.String r8 = "id"
            int r7 = com.obwhatsapp.yo.yo.getID(r7, r8)
            android.view.View r7 = r11.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 8
            r7.setVisibility(r8)
            r0 = r18
            com.obwhatsapp.yo.autoschedreply.ListMessages r12 = r0.f684a
            java.util.ArrayList r8 = r12.f670c
            r0 = r19
            java.lang.Object r8 = r8.get(r0)
            com.obwhatsapp.yo.autoschedreply.object_alert r8 = (com.obwhatsapp.yo.autoschedreply.object_alert) r8
            java.lang.String r13 = r8.getE_e()
            r9 = 455668871(0x1b28f487, float:1.3975645E-22)
            java.lang.String r8 = "۟ۧۦۘۜۡۨۘۡۚۦۘۖ۫ۗۦ۬ۜۘۙۚ۫۬ۦ۬ۖۨۚۗۖۗ"
        L_0x00b8:
            int r10 = r8.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -1506445487: goto L_0x00c9;
                case -167628585: goto L_0x00de;
                case -107071302: goto L_0x00cc;
                case 924615653: goto L_0x00c1;
                default: goto L_0x00c0;
            }
        L_0x00c0:
            goto L_0x00b8
        L_0x00c1:
            if (r13 == 0) goto L_0x00c6
            java.lang.String r8 = "ۨۨۗۜۙۙۧۨۨۚۛۘۘ۬ۚۧۖ۫ۤۢ۟"
            goto L_0x00b8
        L_0x00c6:
            java.lang.String r8 = "ۨۤۡۘۨۤۢ۬ۤۘۘۖ۬۬ۢ۫ۤ"
            goto L_0x00b8
        L_0x00c9:
            java.lang.String r8 = "ۛۛۤ۬ۡۥۦ۫ۨۘۚۨۜۖۜۧۘۦ۟ۘۘ"
            goto L_0x00b8
        L_0x00cc:
            r8 = 1
        L_0x00cd:
            r10 = 1939568330(0x739b76ca, float:2.4634257E31)
            java.lang.String r9 = "۬ۢۦۜۨۛۤۥۚۦۘۦۙۧۗۚ۫ۨۤۛ۬۠ۥۘ"
        L_0x00d2:
            int r14 = r9.hashCode()
            r14 = r14 ^ r10
            switch(r14) {
                case -2051875975: goto L_0x00db;
                case 72550444: goto L_0x00e3;
                case 497603365: goto L_0x00ee;
                case 1273570018: goto L_0x0103;
                default: goto L_0x00da;
            }
        L_0x00da:
            goto L_0x00d2
        L_0x00db:
            java.lang.String r9 = "ۛۗۤۙۜۖۘۥۗۡۜۚۛۗۢۙۜۢۡۘۤۜۛۚۘۥۘۧۡۧۘ"
            goto L_0x00d2
        L_0x00de:
            r8 = 0
            goto L_0x00cd
        L_0x00e0:
            java.lang.String r9 = "ۗۧۙ۠ۥۡۛۜۡۘۛۥۨۘۧۡۧ"
            goto L_0x00d2
        L_0x00e3:
            int r9 = r13.length()
            r14 = 38
            if (r9 <= r14) goto L_0x00e0
            java.lang.String r9 = "ۖۧۙۚ۠ۙۧۘۖۘۨۘۨۡ۠ۜۘۨ۠۠"
            goto L_0x00d2
        L_0x00ee:
            r9 = 1
        L_0x00ef:
            r14 = -358386919(0xffffffffeaa37319, float:-9.879922E25)
            java.lang.String r10 = "ۚۢۚ۠ۨ۬ۘۚ۠۫۟ۨۘۤۘۧۙۘۜ"
        L_0x00f4:
            int r15 = r10.hashCode()
            r15 = r15 ^ r14
            switch(r15) {
                case -83633977: goto L_0x0119;
                case -21528990: goto L_0x0108;
                case 1662387907: goto L_0x00fd;
                case 1701365998: goto L_0x010b;
                default: goto L_0x00fc;
            }
        L_0x00fc:
            goto L_0x00f4
        L_0x00fd:
            r10 = 1
            if (r8 != r10) goto L_0x0105
            java.lang.String r10 = "ۘ۠ۚ۬ۨۨۜۧۨۚۜۘۘۖ۬"
            goto L_0x00f4
        L_0x0103:
            r9 = 0
            goto L_0x00ef
        L_0x0105:
            java.lang.String r10 = "ۘۤۛۨ۫ۤ۠ۢۥۢ۟ۦ۠۫ۡ"
            goto L_0x00f4
        L_0x0108:
            java.lang.String r10 = "ۨۜۜۨۙۘۘۥ۫ۚۗ۟ۨۘۦۢ۫ۛۘۨۘ۫ۚۡۜۢۦ"
            goto L_0x00f4
        L_0x010b:
            r10 = 1592893189(0x5ef19f05, float:8.7053201E18)
            java.lang.String r8 = "۟ۘۜۘۘ۟ۜ۟ۗۥۘۡۧۗۡۘۚ۠ۧۜۘۚۙۜۘ"
        L_0x0110:
            int r14 = r8.hashCode()
            r14 = r14 ^ r10
            switch(r14) {
                case -2091899569: goto L_0x019a;
                case -1945596952: goto L_0x019e;
                case -591004802: goto L_0x0193;
                case -344945418: goto L_0x0119;
                default: goto L_0x0118;
            }
        L_0x0118:
            goto L_0x0110
        L_0x0119:
            r9 = 643219361(0x2656bfa1, float:7.450587E-16)
            java.lang.String r8 = "ۘ۬ۛ۬ۤۖۨۡۧۥۤۡۘۘۦۘۥۦۨۘۚۚ۠ۘۨ"
        L_0x011e:
            int r10 = r8.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -2030964989: goto L_0x0264;
                case -359361257: goto L_0x0127;
                case 937956467: goto L_0x0270;
                case 1581719725: goto L_0x0274;
                default: goto L_0x0126;
            }
        L_0x0126:
            goto L_0x011e
        L_0x0127:
            java.lang.String r8 = "send_to_contact"
            r9 = 1
            java.lang.String[] r9 = new java.lang.String[r9]
            r10 = 0
            r14 = 0
            java.lang.String r15 = "@"
            int r15 = r13.lastIndexOf(r15)
            java.lang.String r14 = r13.substring(r14, r15)
            java.lang.String r14 = com.obwhatsapp.yo.dep.getContactName(r14)
            java.lang.String r14 = r14.toString()
            r9[r10] = r14
            java.lang.String r8 = com.obwhatsapp.yo.yo.getString(r8, r9)
        L_0x0146:
            r2.setText(r8)
        L_0x0149:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x02b9 }
            java.lang.String r2 = ","
            java.lang.String[] r2 = r13.split(r2)     // Catch:{ Exception -> 0x02b9 }
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ Exception -> 0x02b9 }
            r8.<init>(r2)     // Catch:{ Exception -> 0x02b9 }
            r9 = 1545639903(0x5c2097df, float:1.80811921E17)
            java.lang.String r2 = "۟ۗۛۙ۠ۖۥۧۧۡۘۘۦۖ۬ۘ۟ۛۙۖ۫"
        L_0x015d:
            int r10 = r2.hashCode()     // Catch:{ Exception -> 0x02b9 }
            r10 = r10 ^ r9
            switch(r10) {
                case -1022730020: goto L_0x02ac;
                case -1000099669: goto L_0x02a8;
                case 239165616: goto L_0x0166;
                case 2135510289: goto L_0x029d;
                default: goto L_0x0165;
            }     // Catch:{ Exception -> 0x02b9 }
        L_0x0165:
            goto L_0x015d
        L_0x0166:
            r2 = 0
            java.lang.Object r2 = r8.get(r2)     // Catch:{ Exception -> 0x02b9 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x02b9 }
            com.obwhatsapp.yo.dep.loadCImage(r2, r6)     // Catch:{ Exception -> 0x02b9 }
        L_0x0170:
            java.util.ArrayList r2 = r12.f670c
            r0 = r19
            java.lang.Object r2 = r2.get(r0)
            com.obwhatsapp.yo.autoschedreply.object_alert r2 = (com.obwhatsapp.yo.autoschedreply.object_alert) r2
            java.lang.String r8 = r2.getD_d()
            r6 = -737575336(0xffffffffd4097e58, float:-2.36212086E12)
            java.lang.String r2 = "ۡۖۡۘۥۖ۟ۚۚۦۨۛۨۘۖۘۧۘ"
        L_0x0183:
            int r9 = r2.hashCode()
            r9 = r9 ^ r6
            switch(r9) {
                case -513709996: goto L_0x018c;
                case 726229936: goto L_0x02da;
                case 1518359790: goto L_0x0376;
                case 1786681154: goto L_0x02c0;
                default: goto L_0x018b;
            }
        L_0x018b:
            goto L_0x0183
        L_0x018c:
            java.lang.String r2 = "ۤۘۢ۫ۤۖۘۡۛۥۘۘۖۤۙۡۥۚۦۨۜ۟ۘۘۜۢۨۘ"
            goto L_0x0183
        L_0x018f:
            java.lang.String r8 = "۟ۖۜۘۧۛۡۘۗۢۡۨۜۘۘۥ۫ۥ"
            goto L_0x0110
        L_0x0193:
            r8 = 1
            if (r9 != r8) goto L_0x018f
            java.lang.String r8 = "ۛۜۧۖۨ۫ۢۦۘۘۚۢۖۘۘۙۧۤۘۨۥ۫ۦۘۘ۟ۜۘ"
            goto L_0x0110
        L_0x019a:
            java.lang.String r8 = "ۛۚۢۖۡۛۡ۫ۨۚۘ۬ۗۦۡۢ"
            goto L_0x0110
        L_0x019e:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            java.lang.String r8 = ","
            java.lang.String[] r8 = r13.split(r8)
            java.util.List r8 = java.util.Arrays.asList(r8)
            r15.<init>(r8)
            r8 = 0
            r10 = r8
        L_0x01b4:
            r9 = -1075860103(0xffffffffbfdfad79, float:-1.7474815)
            java.lang.String r8 = "ۤۘۗۙۡۤ۬ۧۥۖۨۘۘ۬ۘ۟ۥۦۘۙۙۦ۟ۙ۟ۛۖۨۘ"
        L_0x01b9:
            int r16 = r8.hashCode()
            r16 = r16 ^ r9
            switch(r16) {
                case -754693153: goto L_0x01c3;
                case -199093976: goto L_0x01c9;
                case -52683822: goto L_0x0149;
                case 263199501: goto L_0x01d2;
                default: goto L_0x01c2;
            }
        L_0x01c2:
            goto L_0x01b9
        L_0x01c3:
            java.lang.String r8 = "ۨۜۡۘۜۚۖۨۜ۟ۖۙۡۘۤۥۨۥۡۜ۫ۨۢ"
            goto L_0x01b9
        L_0x01c6:
            java.lang.String r8 = "۠ۨۥ۫ۛۦۘ۬ۦ۫ۘۙ۟ۜۡۜ"
            goto L_0x01b9
        L_0x01c9:
            int r8 = r15.size()
            if (r10 >= r8) goto L_0x01c6
            java.lang.String r8 = "ۤ۟ۜۘۤ۬ۨۘ۫ۚۥۘۗۡۡۘ۠ۛۗۥۘ۟ۨۢۢ"
            goto L_0x01b9
        L_0x01d2:
            java.lang.Object r8 = r15.get(r10)
            java.lang.String r8 = (java.lang.String) r8
            r16 = 0
            java.lang.Object r9 = r15.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r17 = "@"
            r0 = r17
            int r9 = r9.lastIndexOf(r0)
            r0 = r16
            java.lang.String r8 = r8.substring(r0, r9)
            java.lang.String r9 = com.obwhatsapp.yo.dep.getContactName(r8)
            r16 = -440799049(0xffffffffe5b9f0b7, float:-1.0975978E23)
            java.lang.String r8 = "ۘۦۡۚۤۚ۬ۜۦۡۛۗۚ۬۟ۖۖۡ۠ۛۖۘ"
        L_0x01f7:
            int r17 = r8.hashCode()
            r17 = r17 ^ r16
            switch(r17) {
                case -2043730142: goto L_0x023b;
                case -1368029251: goto L_0x0251;
                case -1256377649: goto L_0x024e;
                case 494324564: goto L_0x0201;
                default: goto L_0x0200;
            }
        L_0x0200:
            goto L_0x01f7
        L_0x0201:
            r8 = r9
        L_0x0202:
            r14.append(r8)
            java.lang.String r8 = ","
            r14.append(r8)
            java.lang.String r8 = r14.toString()
            java.lang.String r9 = ","
            int r9 = r8.lastIndexOf(r9)     // Catch:{ Exception -> 0x0479 }
            r16 = 0
            r0 = r16
            java.lang.String r8 = r8.substring(r0, r9)     // Catch:{ Exception -> 0x0473 }
        L_0x021c:
            java.lang.String r9 = "send_to_contact"
            r16 = 1
            r0 = r16
            java.lang.String[] r0 = new java.lang.String[r0]
            r16 = r0
            r17 = 0
            r16[r17] = r8
            r0 = r16
            java.lang.String r8 = com.obwhatsapp.yo.yo.getString(r9, r0)
            r2.setText(r8)
            int r8 = r10 + 1
            r10 = r8
            goto L_0x01b4
        L_0x0238:
            java.lang.String r8 = "ۜۖۛۖۨۛۘۜ۟ۖ۠ۙۜۚۢ۬۠ۖۥ۬۫۠ۧۖۛ۠"
            goto L_0x01f7
        L_0x023b:
            java.lang.Object r8 = r15.get(r10)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r17 = "@s.whatsapp.net"
            r0 = r17
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L_0x0238
            java.lang.String r8 = "۟ۨۢ۫۠۟۠ۡۦۘۜۚۖۘۧۘ۟ۗۘ۫ۛۧۗۗۜ۬۠ۚۖۘ"
            goto L_0x01f7
        L_0x024e:
            java.lang.String r8 = "۫ۗۢۜۚ۟ۘۦۡۨۖۦۡۥۗ"
            goto L_0x01f7
        L_0x0251:
            java.lang.Object r8 = r15.get(r10)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = com.obwhatsapp.yo.yo.stripJID(r8)
            java.lang.String r8 = com.obwhatsapp.yo.dep.getContactName(r8)
            goto L_0x0202
        L_0x0260:
            java.lang.String r8 = "ۦۗۤ۟ۘۢۗ۬ۗۜۙۜ۟ۢۙ۠ۚۖۢۜ۫ۛۢۘۘ۫ۘۘۘ"
            goto L_0x011e
        L_0x0264:
            java.lang.String r8 = "@s.whatsapp.net"
            boolean r8 = r13.contains(r8)
            if (r8 == 0) goto L_0x0260
            java.lang.String r8 = "ۘۘۦۘۜۦۖۘۥ۬ۤۤ۠ۘۘۘ۟ۥۚۦ۬ۖ۟ۘ"
            goto L_0x011e
        L_0x0270:
            java.lang.String r8 = "۬۬ۜۨۗۗۧ۫ۛۚۦۨۧۘۘۥۦۘۘ۫ۚۨۘ"
            goto L_0x011e
        L_0x0274:
            java.lang.String r8 = com.obwhatsapp.yo.yo.stripJID(r13)
            java.lang.String r8 = com.obwhatsapp.yo.dep.getContactName(r8)
            r9 = 0
            java.lang.String r10 = ","
            int r10 = r8.lastIndexOf(r10)     // Catch:{ Exception -> 0x0476 }
            java.lang.String r8 = r8.substring(r9, r10)     // Catch:{ Exception -> 0x0476 }
        L_0x0287:
            java.lang.String r9 = "send_to_contact"
            r10 = 1
            java.lang.String[] r10 = new java.lang.String[r10]
            r14 = 0
            java.lang.String r8 = r8.toString()
            r10[r14] = r8
            java.lang.String r8 = com.obwhatsapp.yo.yo.getString(r9, r10)
            goto L_0x0146
        L_0x0299:
            java.lang.String r2 = "ۜ۟ۦۜۥۤۚۖۘۢ۠۠۟ۥۗۤۚ۬"
            goto L_0x015d
        L_0x029d:
            int r2 = r8.size()     // Catch:{ Exception -> 0x02b9 }
            r10 = 1
            if (r2 != r10) goto L_0x0299
            java.lang.String r2 = "۠ۛۗۙۖ۫ۨۦۧۘۖ۠ۖۙۛۡ"
            goto L_0x015d
        L_0x02a8:
            java.lang.String r2 = "ۢۜۥۡۙ۬ۘۢۥۘۙ۟ۘۘۙۦۦۛۗ۫ۥ۬ۘ"
            goto L_0x015d
        L_0x02ac:
            java.lang.String r2 = "avatar_group"
            java.lang.String r8 = "drawable"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r8)     // Catch:{ Exception -> 0x02b9 }
            r6.setImageResource(r2)     // Catch:{ Exception -> 0x02b9 }
            goto L_0x0170
        L_0x02b9:
            r2 = move-exception
            goto L_0x0170
        L_0x02bc:
            java.lang.String r2 = "۫ۘۖۜۦ۬ۥۜۘۗۖۜۘ۠۠ۨۘ۠ۘۦۘۤۢۘۧۤۜۘ"
            goto L_0x0183
        L_0x02c0:
            java.util.ArrayList r2 = r12.f670c
            r0 = r19
            java.lang.Object r2 = r2.get(r0)
            com.obwhatsapp.yo.autoschedreply.object_alert r2 = (com.obwhatsapp.yo.autoschedreply.object_alert) r2
            java.lang.String r2 = r2.getB_b()
            java.lang.String r9 = "u"
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x02bc
            java.lang.String r2 = "ۙۢۗۥۡۥۘ۫ۦۖۘۚۧ۟ۨۙۗۛۦۧۘۙ۫ۨۘ"
            goto L_0x0183
        L_0x02da:
            java.util.ArrayList r2 = r12.f670c
            r0 = r19
            java.lang.Object r2 = r2.get(r0)
            com.obwhatsapp.yo.autoschedreply.object_alert r2 = (com.obwhatsapp.yo.autoschedreply.object_alert) r2
            java.lang.String r2 = r2.getC_c()
        L_0x02e8:
            r9 = 623634424(0x252be7f8, float:1.491048E-16)
            java.lang.String r6 = "ۘ۬۫ۧۨۙۤۦۙۦ۬ۦۘۡۥۨۙۦۚ"
        L_0x02ed:
            int r10 = r6.hashCode()
            r10 = r10 ^ r9
            switch(r10) {
                case -601715841: goto L_0x038a;
                case -506373265: goto L_0x037e;
                case 1325483507: goto L_0x038e;
                case 1463833928: goto L_0x02f6;
                default: goto L_0x02f5;
            }
        L_0x02f5:
            goto L_0x02ed
        L_0x02f6:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r8 = " - "
            r6.append(r8)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r3.setText(r2)
        L_0x030d:
            java.lang.String r2 = "Time : "
            java.lang.StringBuilder r3 = a.a.g(r2)
            java.util.ArrayList r2 = r12.f670c
            r0 = r19
            java.lang.Object r2 = r2.get(r0)
            com.obwhatsapp.yo.autoschedreply.object_alert r2 = (com.obwhatsapp.yo.autoschedreply.object_alert) r2
            java.lang.String r2 = r2.getA_a()
            r3.append(r2)
            r4.setText(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "Message : "
            r3.append(r2)
            java.util.ArrayList r2 = r12.f670c
            r0 = r19
            java.lang.Object r2 = r2.get(r0)
            com.obwhatsapp.yo.autoschedreply.object_alert r2 = (com.obwhatsapp.yo.autoschedreply.object_alert) r2
            java.lang.String r2 = r2.getF_f()
            r3.append(r2)
            r5.setText(r3)
            android.content.res.Resources r2 = r12.getResources()
            java.lang.String r3 = "repetition_alert"
            java.lang.String r4 = "array"
            int r3 = com.obwhatsapp.yo.yo.getID(r3, r4)
            java.lang.String[] r4 = r2.getStringArray(r3)
            java.util.ArrayList r2 = r12.f670c
            r0 = r19
            java.lang.Object r2 = r2.get(r0)
            com.obwhatsapp.yo.autoschedreply.object_alert r2 = (com.obwhatsapp.yo.autoschedreply.object_alert) r2
            java.lang.String r5 = r2.getB_b()
            r5.getClass()
            r5.hashCode()
            r3 = -1
            int r2 = r5.hashCode()
            switch(r2) {
                case 97: goto L_0x0430;
                case 100: goto L_0x040b;
                case 109: goto L_0x03e6;
                case 115: goto L_0x03c3;
                case 117: goto L_0x03a0;
                default: goto L_0x0371;
            }
        L_0x0371:
            r2 = r3
        L_0x0372:
            switch(r2) {
                case 0: goto L_0x046f;
                case 1: goto L_0x046b;
                case 2: goto L_0x0467;
                case 3: goto L_0x0463;
                case 4: goto L_0x0455;
                default: goto L_0x0375;
            }
        L_0x0375:
            return r11
        L_0x0376:
            java.lang.String r2 = ","
            goto L_0x02e8
        L_0x037a:
            java.lang.String r6 = "ۧۗ۬ۧۧۚۗۖۜۘۢۖۢ۬۠ۥۘۖ۠ۡۨۘۤۖ۠ۤۜ۫"
            goto L_0x02ed
        L_0x037e:
            java.lang.String r6 = ","
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x037a
            java.lang.String r6 = "ۢۥۜۘ۠ۨۡۘۢ۟۟۠ۜۨۘۨ۬ۛ"
            goto L_0x02ed
        L_0x038a:
            java.lang.String r6 = "ۙ۟ۖۘ۠ۤ۟ۛۧۧۚۦۨ۬ۥۘ"
            goto L_0x02ed
        L_0x038e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Date : "
            r2.append(r6)
            r2.append(r8)
            r3.setText(r2)
            goto L_0x030d
        L_0x03a0:
            r6 = 642570145(0x264cd7a1, float:7.106895E-16)
            java.lang.String r2 = "۬ۧۘۘۡۦۖۢۖۦۖ۬ۛۢ۫ۙۖۦۘۨۘۖۙۚۡۘ"
        L_0x03a5:
            int r8 = r2.hashCode()
            r8 = r8 ^ r6
            switch(r8) {
                case -2050764616: goto L_0x03ae;
                case -1707374726: goto L_0x03be;
                case -792548292: goto L_0x03b3;
                case -224059142: goto L_0x03c1;
                default: goto L_0x03ad;
            }
        L_0x03ad:
            goto L_0x03a5
        L_0x03ae:
            r2 = 4
            goto L_0x0372
        L_0x03b0:
            java.lang.String r2 = "ۤ۫ۦۘۜۤۚۥۚۢ۫ۗۛۖۚۡ۟ۜۘ"
            goto L_0x03a5
        L_0x03b3:
            java.lang.String r2 = "u"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x03b0
            java.lang.String r2 = "۠ۗۨۡۧۥۙۘۖۤۖۘۗۡۢ"
            goto L_0x03a5
        L_0x03be:
            java.lang.String r2 = "ۖۖۤۗ۫ۦۡ۫ۘۘۡۘۘۡۖۘۤۛۘۘۨۚۛۙۜ"
            goto L_0x03a5
        L_0x03c1:
            r2 = r3
            goto L_0x0372
        L_0x03c3:
            r6 = -1221767681(0xffffffffb72d4dff, float:-1.0329763E-5)
            java.lang.String r2 = "ۛۘ۫۠ۖۧۥ۫ۦۘۧۖۜۦۨۧۘۧۦۨ"
        L_0x03c8:
            int r8 = r2.hashCode()
            r8 = r8 ^ r6
            switch(r8) {
                case -1477367071: goto L_0x03e4;
                case 1098533439: goto L_0x03e1;
                case 1481588119: goto L_0x03d1;
                case 1903652411: goto L_0x03d6;
                default: goto L_0x03d0;
            }
        L_0x03d0:
            goto L_0x03c8
        L_0x03d1:
            r2 = 3
            goto L_0x0372
        L_0x03d3:
            java.lang.String r2 = "۠۬ۤ۫ۢۢۛۦۜۜۦۜۘۚۜۘۘۘ۟۠۟ۤۧۖۤۗۤۢ۠"
            goto L_0x03c8
        L_0x03d6:
            java.lang.String r2 = "s"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x03d3
            java.lang.String r2 = "ۙۦۥۘ۠ۛۦۘۗۨۤ۠ۗۧۧۥۘۘۖۜۥۘۦۦۥۧۙۙۤۦۥ"
            goto L_0x03c8
        L_0x03e1:
            java.lang.String r2 = "۟ۖۘ۬ۖۘۢۛۢۢ۬ۙ۟ۖ۫۟۟۟"
            goto L_0x03c8
        L_0x03e4:
            r2 = r3
            goto L_0x0372
        L_0x03e6:
            r6 = -765878796(0xffffffffd2599df4, float:-2.33664479E11)
            java.lang.String r2 = "ۨۥۘۜۖۚۢۗۥۘۜۡۗۗ۠ۨ"
        L_0x03eb:
            int r8 = r2.hashCode()
            r8 = r8 ^ r6
            switch(r8) {
                case -1017846526: goto L_0x0408;
                case 271634318: goto L_0x03fa;
                case 1668904814: goto L_0x03f4;
                case 1787889122: goto L_0x0405;
                default: goto L_0x03f3;
            }
        L_0x03f3:
            goto L_0x03eb
        L_0x03f4:
            r2 = r3
            goto L_0x0372
        L_0x03f7:
            java.lang.String r2 = "ۢۧۦۘۚ۬ۨۥۤۦۚ۬ۘۘ۬ۦۚۨۘ"
            goto L_0x03eb
        L_0x03fa:
            java.lang.String r2 = "m"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x03f7
            java.lang.String r2 = "۟ۤۥۘۚۦۜ۠۠ۥۘۚۛۧ۬ۨۧۘۥ۟ۡۦ۫ۜۛۘ۟ۚ۠ۦ"
            goto L_0x03eb
        L_0x0405:
            java.lang.String r2 = "ۤ۠۫۟ۙۜۘۖۤ۟ۛۛۛۦ۬ۦۘ۠ۢۢۙۚ"
            goto L_0x03eb
        L_0x0408:
            r2 = 2
            goto L_0x0372
        L_0x040b:
            r6 = -546050702(0xffffffffdf73ed72, float:-1.757683E19)
            java.lang.String r2 = "ۘۨۙۨۖۤۚۚۗۡۗ۬ۚ۫ۜۘ۬۟۬ۥ۠ۘۘۦۙ۠ۦۥۖۘ"
        L_0x0410:
            int r8 = r2.hashCode()
            r8 = r8 ^ r6
            switch(r8) {
                case -2031313143: goto L_0x0427;
                case -1813662804: goto L_0x042d;
                case -303883423: goto L_0x0419;
                case 1375867849: goto L_0x042a;
                default: goto L_0x0418;
            }
        L_0x0418:
            goto L_0x0410
        L_0x0419:
            java.lang.String r2 = "d"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0424
            java.lang.String r2 = "ۜ۫ۧ۫ۡۢۗۛ۠ۢۚ۫ۜ۟ۘۜ۬ۜۖ۟ۨۘ"
            goto L_0x0410
        L_0x0424:
            java.lang.String r2 = "ۢۛۨ۠ۛۥ۬ۥۡۘۢۗۛۗۧۘۘۨ۫۠ۥۘ۠ۨۦۙ۠ۦۤ"
            goto L_0x0410
        L_0x0427:
            java.lang.String r2 = "ۥۙۗۢۗۧ۬ۚۨ۟ۙۨۙۢۧ"
            goto L_0x0410
        L_0x042a:
            r2 = r3
            goto L_0x0372
        L_0x042d:
            r2 = 1
            goto L_0x0372
        L_0x0430:
            r6 = -912977161(0xffffffffc99512f7, float:-1221214.9)
            java.lang.String r2 = "۠ۧۥۘۗۦۥۘ۠ۡۨۗ۬ۙۜۜۖۘ"
        L_0x0435:
            int r8 = r2.hashCode()
            r8 = r8 ^ r6
            switch(r8) {
                case -1502663269: goto L_0x0452;
                case -1140327796: goto L_0x0444;
                case -857313719: goto L_0x043e;
                case -63855592: goto L_0x044f;
                default: goto L_0x043d;
            }
        L_0x043d:
            goto L_0x0435
        L_0x043e:
            java.lang.String r2 = "۫ۛۖۘۜۗۢۗ۠ۖۘۢۘۦۙ۟ۡۘۛۖۗ"
            goto L_0x0435
        L_0x0441:
            java.lang.String r2 = "ۡۘۨۘۤۙۛ۬ۗۡۘۜۙۗ۟ۦۡۘۤۢۜۘۜۨۨ۫ۖۡ۟۠"
            goto L_0x0435
        L_0x0444:
            java.lang.String r2 = "a"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0441
            java.lang.String r2 = "ۚۤۘۘۙ۬۫۬ۖۧۛۘۘۨۚ"
            goto L_0x0435
        L_0x044f:
            r2 = r3
            goto L_0x0372
        L_0x0452:
            r2 = 0
            goto L_0x0372
        L_0x0455:
            r2 = 0
            r2 = r4[r2]
        L_0x0458:
            r3 = 0
            r4 = 1
            java.lang.String r2 = r2.substring(r3, r4)
            r7.setText(r2)
            goto L_0x0375
        L_0x0463:
            r2 = 2
            r2 = r4[r2]
            goto L_0x0458
        L_0x0467:
            r2 = 3
            r2 = r4[r2]
            goto L_0x0458
        L_0x046b:
            r2 = 1
            r2 = r4[r2]
            goto L_0x0458
        L_0x046f:
            r2 = 4
            r2 = r4[r2]
            goto L_0x0458
        L_0x0473:
            r9 = move-exception
            goto L_0x021c
        L_0x0476:
            r9 = move-exception
            goto L_0x0287
        L_0x0479:
            r9 = move-exception
            goto L_0x021c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.autoschedreply.c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
