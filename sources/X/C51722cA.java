package X;

import android.view.ViewGroup;
import com.obwhatsapp.CameraHomeFragment;
import com.obwhatsapp.HomeActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2cA  reason: invalid class name and case insensitive filesystem */
public class C51722cA extends C015907p {
    public boolean A00;
    public final /* synthetic */ HomeActivity A01;

    public C51722cA(HomeActivity homeActivity) {
        this.A01 = homeActivity;
    }

    public final void A00() {
        HomeActivity homeActivity = this.A01;
        C29251aI r1 = homeActivity.A0i;
        if (r1.A0A != null) {
            r1.A09();
        } else {
            CameraHomeFragment cameraHomeFragment = homeActivity.A0N;
            if (cameraHomeFragment != null) {
                cameraHomeFragment.A0o(true);
            }
            homeActivity.A0i.A0O((ViewGroup) null, homeActivity, (AnonymousClass29Q) null, (C16050sL) null, (String) null, (ArrayList) null, (List) null, (List) null, 0, false, homeActivity.A06.A05(C15910s6.A0u) || (homeActivity.A1N.A09() && homeActivity.A0C.A0E(C16620tM.A02, 611)), false, homeActivity.A0C.A0E(C16620tM.A01, 815));
        }
        boolean A002 = homeActivity.A0h.A00(homeActivity, homeActivity, homeActivity.A21, 30);
        C29251aI r0 = homeActivity.A0i;
        if (A002) {
            r0.A0A();
        } else {
            r0.A04();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ff, code lost:
        if (r5 != false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AUO(int r11, float r12, int r13) {
        /*
            r10 = this;
            com.obwhatsapp.HomeActivity r4 = r10.A01
            r1 = 100
            X.013 r0 = r4.A01
            int r7 = com.obwhatsapp.HomeActivity.A02(r0, r1)
            r3 = 0
            r6 = 0
            r8 = 1
            if (r11 == r7) goto L_0x0017
            int r0 = r7 + -1
            if (r11 != r0) goto L_0x0103
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0103
        L_0x0017:
            r5 = 1
        L_0x0018:
            boolean r0 = r10.A00
            if (r0 == r5) goto L_0x00ff
            r10.A00 = r5
            if (r5 == 0) goto L_0x00f6
            r10.A00()
        L_0x0023:
            r9 = r12
            if (r11 != r7) goto L_0x0029
            r9 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 - r12
        L_0x0029:
            int r2 = r4.A01
            int r1 = -r2
            android.view.View r0 = r4.A09
            int r0 = r0.getHeight()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 * r9
            float r0 = r0 * r9
            int r0 = (int) r0
            int r2 = r2 + r0
            android.view.View r0 = r4.A09
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.view.View r0 = r4.A09
            float r1 = (float) r2
            r0.setTranslationY(r1)
            com.obwhatsapp.WaTextView r0 = r4.A0X
            r0.setTranslationY(r1)
            X.0pk r0 = r4.A39()
            if (r0 == 0) goto L_0x006d
            X.0pl r9 = r4.A0R
            if (r11 != r7) goto L_0x00f3
            com.obwhatsapp.HomeActivity$TabsPager r0 = r4.A0P
            int r0 = r0.getWidth()
            int r0 = r0 - r13
        L_0x005d:
            float r1 = (float) r0
            android.widget.ImageView r0 = r9.A02
            r0.setTranslationX(r1)
            android.widget.ImageView r0 = r9.A03
            r0.setTranslationX(r1)
            android.widget.TextView r0 = r9.A05
            r0.setTranslationX(r1)
        L_0x006d:
            int r0 = r4.A01
            if (r2 != r0) goto L_0x0072
            r8 = 0
        L_0x0072:
            r4.A1r = r8
        L_0x0074:
            if (r11 != r7) goto L_0x0097
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0097
            android.view.View r0 = r4.A09
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x0096
            android.view.View r0 = r4.A09
            r0.setVisibility(r1)
            X.1aI r0 = r4.A0i
            X.2V7 r0 = r0.A0G
            if (r0 == 0) goto L_0x0106
            com.obwhatsapp.camera.CameraBottomSheetBehavior r0 = r0.A0B
            int r1 = r0.A0B
            r0 = 3
            if (r1 != r0) goto L_0x0106
        L_0x0096:
            return
        L_0x0097:
            android.view.View r0 = r4.A09
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r4.A3b()
            if (r0 != 0) goto L_0x00c5
            android.view.View r0 = r4.A09
            r0.setVisibility(r6)
            android.view.View r0 = r4.A0D
            r1 = 1024(0x400, float:1.435E-42)
            r0.setSystemUiVisibility(r1)
            android.view.Window r0 = r4.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.flags
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00c5
            android.view.Window r0 = r4.getWindow()
            r0.clearFlags(r1)
        L_0x00c5:
            if (r5 != 0) goto L_0x0096
            boolean r0 = r4.A1r
            if (r0 == 0) goto L_0x0096
            android.view.View r1 = r4.A09
            int r0 = r4.A01
            float r0 = (float) r0
            r1.setTranslationY(r0)
            com.obwhatsapp.WaTextView r1 = r4.A0X
            int r0 = r4.A01
            float r0 = (float) r0
            r1.setTranslationY(r0)
            X.0pk r0 = r4.A39()
            if (r0 == 0) goto L_0x0096
            X.0pl r1 = r4.A0R
            android.widget.ImageView r0 = r1.A02
            r0.setTranslationX(r3)
            android.widget.ImageView r0 = r1.A03
            r0.setTranslationX(r3)
            android.widget.TextView r0 = r1.A05
            r0.setTranslationX(r3)
            return
        L_0x00f3:
            int r0 = -r13
            goto L_0x005d
        L_0x00f6:
            X.1aI r2 = r4.A0i
            r0 = 200(0xc8, double:9.9E-322)
            r2.A0J(r0)
            goto L_0x0074
        L_0x00ff:
            if (r5 == 0) goto L_0x0074
            goto L_0x0023
        L_0x0103:
            r5 = 0
            goto L_0x0018
        L_0x0106:
            android.view.View r1 = r4.A0D
            r0 = 4
            r1.setSystemUiVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51722cA.AUO(int, float, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AUP(int r10) {
        /*
            r9 = this;
            com.obwhatsapp.HomeActivity r5 = r9.A01
            com.obwhatsapp.yo.HomeUI.pagerIndex(r10, r5)
            X.05J r0 = r5.A0H
            if (r0 == 0) goto L_0x000c
            r0.A05()
        L_0x000c:
            r4 = 1
            r5.A3U(r4)
            int r1 = r5.A36(r10)
            r5.A03 = r1
            X.0uk r0 = r5.A0l
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x002f
            r0 = 600(0x258, float:8.41E-43)
            r3 = 3
            if (r1 != r0) goto L_0x0024
            r3 = 0
        L_0x0024:
            X.0sq r2 = r5.A05
            r1 = 2
            com.facebook.redex.RunnableRunnableShape0S0101000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0101000_I0
            r0.<init>((java.lang.Object) r9, (int) r3, (int) r1)
            r2.Acl(r0)
        L_0x002f:
            r5.A3J()
            int r1 = r5.A03
            X.0y6 r0 = r5.A1H
            r0.A06(r1)
            int r6 = r5.A03
            r0 = 400(0x190, float:5.6E-43)
            r3 = 300(0x12c, float:4.2E-43)
            r1 = 500(0x1f4, double:2.47E-321)
            if (r6 != r0) goto L_0x00ba
            X.0pt r0 = r5.A05
            java.lang.Runnable r3 = r5.A26
        L_0x0047:
            r0.A0J(r3)
            X.0pt r0 = r5.A05
            r0.A0L(r3, r1)
        L_0x004f:
            r7 = 0
            r5.invalidateOptionsMenu()
            r5.A3F()
            int r1 = r5.A03
            r0 = 100
            if (r1 == r0) goto L_0x009f
            com.obwhatsapp.collections.observablelistview.ObservableListView r3 = r5.A3B()
            if (r3 == 0) goto L_0x012c
            int r0 = r3.getChildCount()
            if (r0 <= 0) goto L_0x012c
            com.obwhatsapp.PagerSlidingTabStrip r0 = r5.A0S
            int r8 = r0.getHeight()
            int r0 = r3.getFirstVisiblePosition()
            if (r0 <= 0) goto L_0x00b0
            r6 = r8
        L_0x0075:
            int r0 = r3.getChildCount()
            int r0 = r0 - r4
            android.view.View r2 = r3.getChildAt(r0)
            int r1 = r2.getBottom()
            int r0 = r3.getBottom()
            if (r1 <= r0) goto L_0x00ae
            int r1 = r2.getBottom()
            int r0 = r3.getBottom()
            int r1 = r1 - r0
        L_0x0091:
            int r6 = r6 + r1
            if (r6 < r8) goto L_0x012c
            int r0 = r5.A01
            if (r0 != 0) goto L_0x00a0
            int r0 = r3.A04
            if (r0 <= 0) goto L_0x009f
            r3.setSelection(r7)
        L_0x009f:
            return
        L_0x00a0:
            int r1 = r3.A04
            androidx.appcompat.widget.Toolbar r0 = r5.A0J
            int r0 = r0.getHeight()
            if (r1 >= r0) goto L_0x009f
            r3.setSelection(r4)
            return
        L_0x00ae:
            r1 = 0
            goto L_0x0091
        L_0x00b0:
            android.view.View r0 = r3.getChildAt(r7)
            int r0 = r0.getTop()
            int r6 = -r0
            goto L_0x0075
        L_0x00ba:
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 != r0) goto L_0x00c3
            X.0pt r0 = r5.A05
            java.lang.Runnable r3 = r5.A25
            goto L_0x0047
        L_0x00c3:
            if (r6 != r3) goto L_0x00cb
            X.0pt r0 = r5.A05
            java.lang.Runnable r3 = r5.A27
            goto L_0x0047
        L_0x00cb:
            r0 = 600(0x258, float:8.41E-43)
            if (r6 != r0) goto L_0x00d5
            X.0pt r0 = r5.A05
            java.lang.Runnable r3 = r5.A24
            goto L_0x0047
        L_0x00d5:
            r3 = 700(0x2bc, float:9.81E-43)
            if (r6 != r3) goto L_0x004f
            X.0rz r0 = r5.A09
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r2 = "new_business_tools_tab_seen"
            r0 = 0
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 != 0) goto L_0x004f
            X.0rz r0 = r5.A09
            android.content.SharedPreferences$Editor r0 = r0.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r4)
            r0.apply()
            X.0po r1 = r5.A0Q
            X.013 r0 = r5.A01
            int r0 = com.obwhatsapp.HomeActivity.A02(r0, r3)
            X.0pq r3 = r1.A0H(r0)
            X.0rz r0 = r5.A09
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            r0 = 0
            boolean r0 = r1.getBoolean(r2, r0)
            r2 = 2131232575(0x7f08073f, float:1.8081263E38)
            if (r0 == 0) goto L_0x011c
            r2 = 2131232574(0x7f08073e, float:1.8081261E38)
        L_0x011c:
            android.content.res.Resources r1 = r5.getResources()
            r0 = 0
            X.07V r1 = X.AnonymousClass07V.A01(r0, r1, r2)
            android.widget.ImageView r0 = r3.A03
            r0.setImageDrawable(r1)
            goto L_0x004f
        L_0x012c:
            r5.A3H()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51722cA.AUP(int):void");
    }
}
