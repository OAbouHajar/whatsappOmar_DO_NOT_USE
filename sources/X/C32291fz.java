package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.obwhatsapp.R;

/* renamed from: X.1fz  reason: invalid class name and case insensitive filesystem */
public final class C32291fz extends C15540rI {
    public static final int[] A02 = {R.attr.attr04a3};
    public boolean A00;
    public final AccessibilityManager A01;

    public C32291fz(View view, ViewGroup viewGroup, C53792gI r5) {
        super(view, viewGroup, r5);
        this.A01 = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static C32291fz A00(View view, int i2, int i3) {
        return A01(view, view.getResources().getText(i2), i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        r5 = (android.view.ViewGroup) r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C32291fz A01(android.view.View r5, java.lang.CharSequence r6, int r7) {
        /*
            r1 = 0
        L_0x0001:
            boolean r0 = r5 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r0 != 0) goto L_0x0065
            boolean r0 = r5 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x0062
            int r1 = r5.getId()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 == r0) goto L_0x0065
            r1 = r5
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x0015:
            android.view.ViewParent r5 = r5.getParent()
            boolean r0 = r5 instanceof android.view.View
            if (r0 == 0) goto L_0x0021
            android.view.View r5 = (android.view.View) r5
            if (r5 != 0) goto L_0x0001
        L_0x0021:
            r5 = r1
        L_0x0022:
            if (r5 == 0) goto L_0x0068
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r0)
            android.content.Context r1 = r5.getContext()
            int[] r0 = A02
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r0)
            r3 = 0
            r2 = -1
            int r1 = r0.getResourceId(r3, r2)
            r0.recycle()
            r0 = 2131558938(0x7f0d021a, float:1.8743206E38)
            if (r1 == r2) goto L_0x0047
            r0 = 2131559407(0x7f0d03ef, float:1.8744157E38)
        L_0x0047:
            android.view.View r0 = r4.inflate(r0, r5, r3)
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0
            X.1fz r1 = new X.1fz
            r1.<init>(r0, r5, r0)
            X.1k6 r0 = r1.A05
            android.view.View r0 = r0.getChildAt(r3)
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0
            android.widget.TextView r0 = r0.A03
            r0.setText(r6)
            r1.A00 = r7
            return r1
        L_0x0062:
            if (r5 == 0) goto L_0x0021
            goto L_0x0015
        L_0x0065:
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x0022
        L_0x0068:
            java.lang.String r1 = "No suitable parent found from the given view. Please provide a valid view."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32291fz.A01(android.view.View, java.lang.CharSequence, int):X.1fz");
    }

    public void A07(int i2) {
        Button button = ((SnackbarContentLayout) this.A05.getChildAt(0)).A02;
    }

    public void A08(View.OnClickListener onClickListener, int i2) {
        A09(this.A02.getText(i2), onClickListener);
    }

    public void A09(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button button = ((SnackbarContentLayout) this.A05.getChildAt(0)).A02;
        if (!TextUtils.isEmpty(charSequence)) {
            this.A00 = true;
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 0, onClickListener));
            return;
        }
        button.setVisibility(8);
        button.setOnClickListener((View.OnClickListener) null);
        this.A00 = false;
    }
}
