package com.obwhatsapp.yo;

import android.view.View;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final int f885a;

    /* renamed from: b  reason: collision with root package name */
    public final View f886b;

    public /* synthetic */ u(View view, int i2) {
        this.f885a = i2;
        this.f886b = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        r4.setBackgroundColor(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            r8 = -11
            int r1 = r9.f885a
            android.view.View r2 = r9.f886b
            switch(r1) {
                case 0: goto L_0x000f;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r1 = com.obwhatsapp.yo.Conversation.f521j
            r2.setBackgroundColor(r1)
        L_0x000e:
            return
        L_0x000f:
            int r1 = com.obwhatsapp.yo.Conversation.f512a
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ Exception -> 0x0084 }
            r1 = r0
            r3 = 0
            android.view.View r1 = r1.getChildAt(r3)     // Catch:{ Exception -> 0x0084 }
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch:{ Exception -> 0x0084 }
            r3 = 1
            android.view.View r4 = r1.getChildAt(r3)     // Catch:{ Exception -> 0x0084 }
            r5 = 697738644(0x2996a594, float:6.6900614E-14)
            java.lang.String r3 = "ۛۤۧۦ۠ۢ۠ۤ۟ۖۜ۠ۛۘ۬ۘ۠ۜۘۖۜ۬"
        L_0x0026:
            int r6 = r3.hashCode()     // Catch:{ Exception -> 0x0084 }
            r6 = r6 ^ r5
            switch(r6) {
                case -1135584984: goto L_0x002f;
                case -1120126236: goto L_0x0086;
                case 295431317: goto L_0x003d;
                case 828195759: goto L_0x0040;
                default: goto L_0x002e;
            }     // Catch:{ Exception -> 0x0084 }
        L_0x002e:
            goto L_0x0026
        L_0x002f:
            java.lang.String r3 = "quoted_bg_picker"
            boolean r3 = com.obwhatsapp.yo.shp.getIsGradiet(r3)     // Catch:{ Exception -> 0x0084 }
            if (r3 == 0) goto L_0x003a
            java.lang.String r3 = "ۖۦ۠ۦۙۥۘۘۡۥۘۨ۟ۥۤ۫۬۫ۥۤ"
            goto L_0x0026
        L_0x003a:
            java.lang.String r3 = "ۥۡۗۘ۬ۡۦۡۦۙ۟ۨۛۤۙۘۘ۟ۦ۟ۡ"
            goto L_0x0026
        L_0x003d:
            java.lang.String r3 = "ۧۡۤۘۖۖۥ۠ۢ۬۫ۖۘۜ۬ۥ"
            goto L_0x0026
        L_0x0040:
            java.lang.String r3 = "quoted_bg_picker"
            android.graphics.drawable.GradientDrawable r3 = com.obwhatsapp.yo.shp.getGradientDrawable(r3)     // Catch:{ Exception -> 0x0084 }
            r1.setBackground(r3)     // Catch:{ Exception -> 0x0084 }
        L_0x0049:
            r1 = 0
            r4.setBackgroundColor(r1)     // Catch:{ Exception -> 0x0084 }
        L_0x004d:
            java.lang.String r1 = "quoted_name_picker"
            int r3 = com.obwhatsapp.yo.ColorStore.getPrimaryTextColor()     // Catch:{ Exception -> 0x0084 }
            int r3 = com.obwhatsapp.youbasha.others.getColor(r1, r3)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r1 = "title"
            java.lang.String r4 = "id"
            int r1 = com.obwhatsapp.yo.yo.getID(r1, r4)     // Catch:{ Exception -> 0x0084 }
            android.view.View r1 = r2.findViewById(r1)     // Catch:{ Exception -> 0x0084 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x0084 }
            r1.setTextColor(r3)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r1 = "quoted_text_picker"
            int r3 = com.obwhatsapp.yo.ColorStore.getDefaultListItemSubTitleColor()     // Catch:{ Exception -> 0x0084 }
            int r3 = com.obwhatsapp.youbasha.others.getColor(r1, r3)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r1 = "url"
            java.lang.String r4 = "id"
            int r1 = com.obwhatsapp.yo.yo.getID(r1, r4)     // Catch:{ Exception -> 0x0084 }
            android.view.View r1 = r2.findViewById(r1)     // Catch:{ Exception -> 0x0084 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x0084 }
            r1.setTextColor(r3)     // Catch:{ Exception -> 0x0084 }
            goto L_0x000e
        L_0x0084:
            r1 = move-exception
            goto L_0x000e
        L_0x0086:
            java.lang.String r3 = "quoted_bg_picker"
            r5 = -11
            int r5 = com.obwhatsapp.youbasha.others.getColor(r3, r5)     // Catch:{ Exception -> 0x0084 }
            r6 = -1893348530(0xffffffff8f25cb4e, float:-8.174283E-30)
            java.lang.String r3 = "ۜۡۡۘ۠ۙۤۗۦۘۘۗۖۦۘۜۡۖۘ"
        L_0x0093:
            int r7 = r3.hashCode()     // Catch:{ Exception -> 0x0084 }
            r7 = r7 ^ r6
            switch(r7) {
                case -2116066184: goto L_0x00a2;
                case 805656787: goto L_0x00a7;
                case 1079640249: goto L_0x004d;
                case 1335311830: goto L_0x009c;
                default: goto L_0x009b;
            }
        L_0x009b:
            goto L_0x0093
        L_0x009c:
            java.lang.String r3 = "۬ۙۨۦۛ۠ۦ۬ۖۘۤۡۗۜۨۖ۫ۖۡۥۛۜۘۚۗۦۘۨۗۛ"
            goto L_0x0093
        L_0x009f:
            java.lang.String r3 = "ۜۧ۟ۦۤۢۡ۠ۡۘۗ۫ۗۘۖۜۘ"
            goto L_0x0093
        L_0x00a2:
            if (r5 == r8) goto L_0x009f
            java.lang.String r3 = "ۨۘۙۗۙۧۤۜۦۜۡ۬۬ۧۚۦۘۘۘۛۨۧۤۧۙ"
            goto L_0x0093
        L_0x00a7:
            r1.setBackgroundColor(r5)     // Catch:{ Exception -> 0x0084 }
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.yo.u.run():void");
    }
}
