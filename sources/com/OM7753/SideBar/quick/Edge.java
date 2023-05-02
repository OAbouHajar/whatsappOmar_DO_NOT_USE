package com.OM7753.SideBar.quick;

import X.AnonymousClass050;
import X.C13680ns;
import X.C42821yj;
import android.widget.ListView;
import android.widget.TextView;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import java.util.ArrayList;

public class Edge {
    public static String EDGE = "DELTA_QUICKS";
    public static int mConuter;

    /* renamed from: mConuter  reason: collision with other field name */
    public static TextView f5mConuter;
    Conversation mActivity;
    String mJabberId;
    ListView mList;

    public Edge(C42821yj r1) {
        this.mActivity = (Conversation) r1.A22;
    }

    public static int quickPosition() {
        return shp.getPrefString("key_quick_position", "top").equals("top") ? 0 : 1;
    }

    public static int sumNumbers(ArrayList<Integer> arrayList) {
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            i2 += arrayList.get(i3).intValue();
        }
        return i2;
    }

    public void initFragment() {
        this.mActivity.AQF = new QuickFragment();
        AnonymousClass050 A0O = C13680ns.A0O(this.mActivity);
        A0O.A0F(this.mActivity.AQF, (String) null, yo.getID("mContent", "id"), 1);
        A0O.A00(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b1, code lost:
        if (com.obwhatsapp.youbasha.task.utils.isRTL() == false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b3, code lost:
        r9.setRotation(-90.0f);
        r7.setImageResource(com.OM7753.GOLD.intDrawable("delta_drop_right"));
        r7.setRotation(180.0f);
        r0.setTranslationX((float) (-com.OM7753.GOLD.dpToPx(70.0f)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x008e, code lost:
        if (com.obwhatsapp.youbasha.task.utils.isRTL() == false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r12 = this;
            r0 = 1
            boolean[] r3 = new boolean[r0]     // Catch:{ Exception -> 0x00ef }
            r0 = 0
            r3[r0] = r0     // Catch:{ Exception -> 0x00ef }
            com.obwhatsapp.Conversation r0 = r12.mActivity     // Catch:{ Exception -> 0x00ef }
            java.lang.String r1 = "mQuickHolder"
            java.lang.String r7 = "id"
            int r1 = com.obwhatsapp.yo.yo.getID(r1, r7)     // Catch:{ Exception -> 0x00ef }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x00ef }
            com.obwhatsapp.Conversation r1 = r12.mActivity     // Catch:{ Exception -> 0x00ef }
            java.lang.String r2 = "mCounter"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r7)     // Catch:{ Exception -> 0x00ef }
            android.view.View r1 = r1.findViewById(r2)     // Catch:{ Exception -> 0x00ef }
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x00ef }
            f5mConuter = r7     // Catch:{ Exception -> 0x00ef }
            com.obwhatsapp.Conversation r1 = r12.mActivity     // Catch:{ Exception -> 0x00ef }
            java.lang.String r2 = "mOpen"
            java.lang.String r7 = "id"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r7)     // Catch:{ Exception -> 0x00ef }
            android.view.View r1 = r1.findViewById(r2)     // Catch:{ Exception -> 0x00ef }
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x00ef }
            com.obwhatsapp.Conversation r1 = r12.mActivity     // Catch:{ Exception -> 0x00ef }
            java.lang.String r2 = "mContent"
            java.lang.String r8 = "id"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r8)     // Catch:{ Exception -> 0x00ef }
            android.view.View r8 = r1.findViewById(r2)     // Catch:{ Exception -> 0x00ef }
            com.OM7753.GOLD.APG(r8)     // Catch:{ Exception -> 0x00ef }
            com.obwhatsapp.Conversation r1 = r12.mActivity     // Catch:{ Exception -> 0x00ef }
            java.lang.String r2 = "mIcon"
            java.lang.String r9 = "id"
            int r2 = com.obwhatsapp.yo.yo.getID(r2, r9)     // Catch:{ Exception -> 0x00ef }
            android.view.View r1 = r1.findViewById(r2)     // Catch:{ Exception -> 0x00ef }
            r9 = r1
            android.widget.ImageView r9 = (android.widget.ImageView) r9     // Catch:{ Exception -> 0x00ef }
            android.content.Context r2 = r9.getContext()     // Catch:{ Exception -> 0x00ef }
            int r1 = com.obwhatsapp.youbasha.store.ColorStore.getFabColorNormalAssem(r2)     // Catch:{ Exception -> 0x00ef }
            boolean r2 = com.obwhatsapp.youbasha.store.ColorStore.INM()     // Catch:{ Exception -> 0x00ef }
            if (r2 != 0) goto L_0x006c
            java.lang.String r2 = "ModFabNormalColor"
            int r1 = com.obwhatsapp.youbasha.others.getColor(r2, r1)     // Catch:{ Exception -> 0x00ef }
        L_0x006c:
            r7.setColorFilter(r1)     // Catch:{ Exception -> 0x00ef }
            int r1 = com.obwhatsapp.youbasha.store.ColorStore.getFABIconsColor()     // Catch:{ Exception -> 0x00ef }
            r9.setColorFilter(r1)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r1 = "key_quick_position"
            java.lang.String r2 = "top"
            java.lang.String r10 = com.obwhatsapp.yo.shp.getPrefString(r1, r2)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r1 = "right"
            boolean r1 = r10.equals(r1)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r2 = "delta_drop_right"
            r4 = 1116471296(0x428c0000, float:70.0)
            if (r1 == 0) goto L_0x00a5
            boolean r1 = com.obwhatsapp.youbasha.task.utils.isRTL()     // Catch:{ Exception -> 0x00ef }
            if (r1 != 0) goto L_0x00b3
        L_0x0090:
            r1 = 1119092736(0x42b40000, float:90.0)
            r9.setRotation(r1)     // Catch:{ Exception -> 0x00ef }
            int r1 = com.OM7753.GOLD.dpToPx(r4)     // Catch:{ Exception -> 0x00ef }
            float r1 = (float) r1     // Catch:{ Exception -> 0x00ef }
            r0.setTranslationX(r1)     // Catch:{ Exception -> 0x00ef }
            int r1 = com.OM7753.GOLD.intDrawable(r2)     // Catch:{ Exception -> 0x00ef }
            r7.setImageResource(r1)     // Catch:{ Exception -> 0x00ef }
            goto L_0x00e2
        L_0x00a5:
            java.lang.String r1 = "left"
            boolean r1 = r10.equals(r1)     // Catch:{ Exception -> 0x00ef }
            if (r1 == 0) goto L_0x00ce
            boolean r1 = com.obwhatsapp.youbasha.task.utils.isRTL()     // Catch:{ Exception -> 0x00ef }
            if (r1 != 0) goto L_0x0090
        L_0x00b3:
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r9.setRotation(r1)     // Catch:{ Exception -> 0x00ef }
            int r1 = com.OM7753.GOLD.intDrawable(r2)     // Catch:{ Exception -> 0x00ef }
            r7.setImageResource(r1)     // Catch:{ Exception -> 0x00ef }
            r1 = 1127481344(0x43340000, float:180.0)
            r7.setRotation(r1)     // Catch:{ Exception -> 0x00ef }
            int r1 = com.OM7753.GOLD.dpToPx(r4)     // Catch:{ Exception -> 0x00ef }
            int r1 = -r1
            float r1 = (float) r1     // Catch:{ Exception -> 0x00ef }
            r0.setTranslationX(r1)     // Catch:{ Exception -> 0x00ef }
            goto L_0x00e2
        L_0x00ce:
            r1 = 1120403456(0x42c80000, float:100.0)
            int r1 = com.OM7753.GOLD.dpToPx(r1)     // Catch:{ Exception -> 0x00ef }
            int r1 = -r1
            float r1 = (float) r1     // Catch:{ Exception -> 0x00ef }
            r0.setTranslationY(r1)     // Catch:{ Exception -> 0x00ef }
            java.lang.String r1 = "delta_drop_bg"
            int r1 = com.OM7753.GOLD.intDrawable(r1)     // Catch:{ Exception -> 0x00ef }
            r7.setImageResource(r1)     // Catch:{ Exception -> 0x00ef }
        L_0x00e2:
            com.OM7753.SideBar.quick.Edge$1 r11 = new com.OM7753.SideBar.quick.Edge$1     // Catch:{ Exception -> 0x00ef }
            r1 = r11
            r2 = r12
            r4 = r10
            r5 = r9
            r6 = r0
            r1.<init>(r3, r4, r5, r6)     // Catch:{ Exception -> 0x00ef }
            r7.setOnClickListener(r11)     // Catch:{ Exception -> 0x00ef }
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.OM7753.SideBar.quick.Edge.initView():void");
    }
}
