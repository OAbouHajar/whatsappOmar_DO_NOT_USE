package com.obwhatsapp.status.playback.fragment;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass1PA;
import X.AnonymousClass2B0;
import X.AnonymousClass4FE;
import X.AnonymousClass5S9;
import X.C001000l;
import X.C1035351t;
import X.C14870pt;
import X.C41821wi;
import X.C43211zc;
import X.C447725m;
import X.C62233Cm;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.obwhatsapp.R;
import com.obwhatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape2S0100000_I0_2;
import java.util.ArrayList;
import java.util.List;

public abstract class StatusPlaybackBaseFragment extends Hilt_StatusPlaybackBaseFragment {
    public C14870pt A00;
    public AnonymousClass01V A01;
    public AnonymousClass013 A02;
    public AnonymousClass2B0 A03;
    public AnonymousClass5S9 A04 = new C1035351t(this);
    public AnonymousClass1PA A05;
    public Runnable A06 = new RunnableRunnableShape15S0100000_I0_14(this, 1);
    public boolean A07;

    public void A0n(Bundle bundle) {
        StatusPlaybackFragment A36;
        this.A0V = true;
        A1H(this.A01);
        C43211zc r3 = (C43211zc) A0C();
        if (r3 != null) {
            UserJid userJid = ((StatusPlaybackContactFragment) this).A0S;
            AnonymousClass00B.A06(userJid);
            String rawString = userJid.getRawString();
            StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) r3;
            AnonymousClass4FE r1 = (AnonymousClass4FE) statusPlaybackActivity.A0D.A00.get(statusPlaybackActivity.A07.getCurrentItem());
            if (r1.A00.A0B.getRawString().equals(rawString) && (A36 = statusPlaybackActivity.A36(r1)) != null) {
                A36.A1B();
                A36.A1D(1);
            }
        }
    }

    public void A0w() {
        super.A0w();
        AnonymousClass1PA r0 = this.A05;
        AnonymousClass5S9 r1 = this.A04;
        List list = r0.A04;
        if (list != null) {
            list.remove(r1);
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout0572, viewGroup, false);
        this.A03 = new AnonymousClass2B0(inflate);
        return inflate;
    }

    public void A14() {
        super.A14();
        AnonymousClass1PA r2 = this.A05;
        AnonymousClass5S9 r1 = this.A04;
        List list = r2.A04;
        if (list == null) {
            list = new ArrayList();
            r2.A04 = list;
        }
        list.add(r1);
    }

    public void A18(Bundle bundle, View view) {
        C001000l A0D = A0D();
        AnonymousClass2B0 r5 = this.A03;
        AnonymousClass00B.A07(r5, "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()");
        ViewOnClickCListenerShape2S0100000_I0_2 viewOnClickCListenerShape2S0100000_I0_2 = new ViewOnClickCListenerShape2S0100000_I0_2(this, 47);
        ImageView imageView = r5.A0A;
        imageView.setImageDrawable(new C447725m(AnonymousClass00T.A04(A0D, R.drawable.ic_cam_back), this.A02));
        imageView.setOnClickListener(viewOnClickCListenerShape2S0100000_I0_2);
        View view2 = r5.A03;
        view2.setOnClickListener(new C62233Cm(A0D, view2, this.A02, this));
    }

    public void A1E(Rect rect) {
        super.A1E(rect);
        A1H(rect);
        Rect rect2 = this.A01;
        for (C41821wi A072 : ((StatusPlaybackContactFragment) this).A0p.A04().values()) {
            A072.A07(rect2);
        }
    }

    public final AnonymousClass2B0 A1G() {
        AnonymousClass2B0 r1 = this.A03;
        AnonymousClass00B.A07(r1, "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()");
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0177, code lost:
        if (r0 != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1H(android.graphics.Rect r8) {
        /*
            r7 = this;
            X.2B0 r3 = r7.A03
            if (r3 == 0) goto L_0x00e1
            java.lang.String r0 = "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()"
            X.AnonymousClass00B.A07(r3, r0)
            X.00l r0 = r7.A0C()
            if (r0 == 0) goto L_0x001a
            X.01V r2 = r7.A01
            android.view.Window r1 = r0.getWindow()
            android.widget.FrameLayout r0 = r3.A09
            X.C41971wz.A00(r0, r1, r2)
        L_0x001a:
            android.view.View r5 = r3.A06
            int r4 = r8.left
            int r2 = r5.getPaddingTop()
            int r1 = r8.right
            int r0 = r5.getPaddingBottom()
            r5.setPadding(r4, r2, r1, r0)
            android.view.View r2 = r3.A01
            int r1 = r8.top
            r0 = 0
            r2.setPadding(r0, r1, r0, r0)
            r2 = 5
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0116
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "SM-G960"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0111
            java.lang.String r0 = "SM-G955"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0111
            java.lang.String r0 = "SM-G950"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x016e
            r1 = 1084437299(0x40a33333, float:5.1)
        L_0x005c:
            android.content.res.Resources r0 = r7.A03()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r6 = android.util.TypedValue.applyDimension(r2, r1, r0)
            android.content.res.Resources r0 = r7.A03()
            r4 = 2131167098(0x7f07077a, float:1.794846E38)
            int r0 = r0.getDimensionPixelSize(r4)
            float r5 = (float) r0
            r2 = 0
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0093
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0102
            com.obwhatsapp.status.playback.widget.StatusPlaybackProgressView r0 = r3.A0E
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L_0x0102
            android.view.DisplayCutout r0 = r0.getDisplayCutout()
            if (r0 == 0) goto L_0x0102
            int r0 = r0.getSafeInsetTop()
            if (r0 <= 0) goto L_0x0102
        L_0x0093:
            android.content.res.Resources r0 = r7.A03()
            int r5 = r0.getDimensionPixelSize(r4)
            double r0 = (double) r2
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            int r5 = r5 + r0
            com.obwhatsapp.status.playback.widget.StatusPlaybackProgressView r4 = r3.A0E
            int r2 = r8.left
            int r2 = r2 + r5
            int r1 = r4.getPaddingTop()
            int r0 = r8.right
            int r5 = r5 + r0
            int r0 = r4.getPaddingBottom()
            r4.setPadding(r2, r1, r5, r0)
            android.view.ViewStub r4 = r3.A08
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            android.content.res.Resources r0 = r7.A03()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 1
            if (r1 != r0) goto L_0x00e2
            android.graphics.Rect r0 = r7.A01
            int r2 = r0.bottom
            android.content.res.Resources r1 = r7.A03()
            if (r2 <= 0) goto L_0x00f7
            r0 = 2131165271(0x7f070057, float:1.7944754E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            int r2 = r2 + r0
        L_0x00dc:
            r3.bottomMargin = r2
            r4.setLayoutParams(r3)
        L_0x00e1:
            return
        L_0x00e2:
            android.content.res.Resources r0 = r7.A03()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 2
            if (r1 != r0) goto L_0x00ff
            android.content.res.Resources r1 = r7.A03()
            r0 = 2131165270(0x7f070056, float:1.7944752E38)
            goto L_0x00fa
        L_0x00f7:
            r0 = 2131165269(0x7f070055, float:1.794475E38)
        L_0x00fa:
            int r2 = r1.getDimensionPixelOffset(r0)
            goto L_0x00dc
        L_0x00ff:
            int r2 = r3.bottomMargin
            goto L_0x00dc
        L_0x0102:
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r5
            float r0 = r0 * r6
            float r5 = r5 * r5
            float r0 = r0 - r5
            double r0 = (double) r0
            double r1 = java.lang.Math.sqrt(r0)
            float r0 = (float) r1
            float r2 = r6 - r0
            goto L_0x0093
        L_0x0111:
            r1 = 1084856730(0x40a9999a, float:5.3)
            goto L_0x005c
        L_0x0116:
            java.lang.String r0 = "Google"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0137
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Pixel 2 XL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x012d
            r1 = 1082759578(0x4089999a, float:4.3)
            goto L_0x005c
        L_0x012d:
            java.lang.String r0 = "Pixel 3"
            boolean r0 = r1.equals(r0)
            r1 = 1082340147(0x40833333, float:4.1)
            goto L_0x0177
        L_0x0137:
            java.lang.String r0 = "LGE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0179
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "H87"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = "G600"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = "LS993"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = "AS993"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = "VS998"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x0179
        L_0x0169:
            r1 = 1084919644(0x40aa8f5c, float:5.33)
            goto L_0x005c
        L_0x016e:
            java.lang.String r0 = "SM-G965"
            boolean r0 = r1.startsWith(r0)
            r1 = 1085695590(0x40b66666, float:5.7)
        L_0x0177:
            if (r0 != 0) goto L_0x005c
        L_0x0179:
            r1 = 0
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.status.playback.fragment.StatusPlaybackBaseFragment.A1H(android.graphics.Rect):void");
    }

    public void A1I(boolean z2) {
        StringBuilder sb = new StringBuilder("playbackFragment/onDragChanged dragging=");
        sb.append(z2);
        sb.append("; ");
        sb.append(this);
        Log.i(sb.toString());
    }
}
