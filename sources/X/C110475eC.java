package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.5eC  reason: invalid class name and case insensitive filesystem */
public final class C110475eC extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;
    public final C15220qW A02;
    public final C15220qW A03;
    public final C15220qW A04;
    public final C15220qW A05;
    public final C15220qW A06;
    public final C15220qW A07;
    public final C15220qW A08;
    public final C15220qW A09;

    public C110475eC(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A04 = C32521gW.A00(new C1218667d(this));
        this.A08 = C32521gW.A00(new C1219067h(this));
        this.A09 = C32521gW.A00(new C1219167i(this));
        this.A02 = C32521gW.A00(new C1218467b(this));
        this.A07 = C32521gW.A00(new C1218967g(this));
        this.A05 = C32521gW.A00(new C1218767e(this));
        this.A03 = C32521gW.A00(new C1218567c(this));
        this.A06 = C32521gW.A00(new C1218867f(this));
        LinearLayout.inflate(getContext(), R.layout.layout006d, this);
        setOrientation(1);
    }

    private final TextView getAlertActionText() {
        Object value = this.A02.getValue();
        C18450wi.A0B(value);
        return (TextView) value;
    }

    private final LinearLayout getAlertBannerComponent() {
        Object value = this.A03.getValue();
        C18450wi.A0B(value);
        return (LinearLayout) value;
    }

    private final TextView getAlertBody() {
        Object value = this.A04.getValue();
        C18450wi.A0B(value);
        return (TextView) value;
    }

    private final ImageView getAlertCloseIcon() {
        Object value = this.A05.getValue();
        C18450wi.A0B(value);
        return (ImageView) value;
    }

    private final LinearLayout getAlertCountLayout() {
        Object value = this.A06.getValue();
        C18450wi.A0B(value);
        return (LinearLayout) value;
    }

    private final ImageView getAlertIcon() {
        Object value = this.A07.getValue();
        C18450wi.A0B(value);
        return (ImageView) value;
    }

    private final TextView getAlertTitle() {
        Object value = this.A08.getValue();
        C18450wi.A0B(value);
        return (TextView) value;
    }

    private final TextView getAlertsCount() {
        Object value = this.A09.getValue();
        C18450wi.A0B(value);
        return (TextView) value;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass5vR r7) {
        /*
            r6 = this;
            r5 = 0
            android.widget.TextView r1 = r6.getAlertTitle()
            X.2KI r4 = r7.A02
            java.lang.String r0 = r4.A08
            r1.setText(r0)
            android.widget.TextView r1 = r6.getAlertBody()
            java.lang.String r0 = r4.A05
            r1.setText(r0)
            android.widget.TextView r1 = r6.getAlertActionText()
            java.lang.String r0 = r4.A04
            r1.setText(r0)
            int r1 = r4.A01
            r3 = 1
            if (r1 == r3) goto L_0x00b7
            r0 = 2
            if (r1 == r0) goto L_0x0087
            r0 = 3
            if (r1 != r0) goto L_0x005f
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131231573(0x7f080355, float:1.807923E38)
            X.C13700nu.A0L(r1, r2, r0)
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099701(0x7f060035, float:1.7811763E38)
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            X.C018808t.A00(r0, r2)
            android.widget.LinearLayout r2 = r6.getAlertBannerComponent()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099694(0x7f06002e, float:1.7811748E38)
        L_0x0058:
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            r2.setBackgroundColor(r0)
        L_0x005f:
            android.widget.ImageView r0 = r6.getAlertCloseIcon()
            r1 = 8
            r0.setVisibility(r1)
            int r2 = r7.A00
            android.widget.LinearLayout r0 = r6.getAlertCountLayout()
            if (r2 <= r3) goto L_0x00e8
            r0.setVisibility(r5)
            android.widget.TextView r1 = r6.getAlertsCount()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r1.setText(r0)
            android.view.View r1 = r6.getRootView()
            r0 = 4
            X.C110105dW.A0r(r1, r6, r0)
            return
        L_0x0087:
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131231451(0x7f0802db, float:1.8078983E38)
            X.C13700nu.A0L(r1, r2, r0)
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099700(0x7f060034, float:1.781176E38)
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            X.C018808t.A00(r0, r2)
            android.widget.LinearLayout r2 = r6.getAlertBannerComponent()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099696(0x7f060030, float:1.7811752E38)
            goto L_0x0058
        L_0x00b7:
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131231452(0x7f0802dc, float:1.8078985E38)
            X.C13700nu.A0L(r1, r2, r0)
            android.widget.ImageView r2 = r6.getAlertIcon()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099699(0x7f060033, float:1.7811759E38)
            int r0 = X.AnonymousClass00T.A00(r1, r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            X.C018808t.A00(r0, r2)
            android.widget.LinearLayout r2 = r6.getAlertBannerComponent()
            android.content.Context r1 = r6.getContext()
            r0 = 2131099695(0x7f06002f, float:1.781175E38)
            goto L_0x0058
        L_0x00e8:
            r0.setVisibility(r1)
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0102
            android.widget.ImageView r0 = r6.getAlertCloseIcon()
            r0.setVisibility(r5)
            android.widget.ImageView r1 = r6.getAlertCloseIcon()
            com.facebook.redex.IDxCListenerShape27S0300000_3_I1 r0 = new com.facebook.redex.IDxCListenerShape27S0300000_3_I1
            r0.<init>(r7, r7, r6, r5)
            r1.setOnClickListener(r0)
        L_0x0102:
            android.view.View r1 = r6.getRootView()
            com.facebook.redex.IDxCListenerShape33S0200000_3_I1 r0 = new com.facebook.redex.IDxCListenerShape33S0200000_3_I1
            r0.<init>(r7, r5, r7)
            r1.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110475eC.A00(X.5vR):void");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
