package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.redex.IDxDCompatShape23S0100000_2_I1;
import com.facebook.redex.IDxTListenerShape168S0100000_2_I1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.R;

/* renamed from: X.2pj  reason: invalid class name and case insensitive filesystem */
public class C57012pj extends C005802m {
    public C54882iQ A00;
    public BottomSheetBehavior A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C57012pj(android.content.Context r5, int r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x0017
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            r1 = 2130968680(0x7f040068, float:1.754602E38)
            r0 = 1
            boolean r0 = r2.resolveAttribute(r1, r3, r0)
            if (r0 == 0) goto L_0x002b
            int r6 = r3.resourceId
        L_0x0017:
            r4.<init>(r5, r6)
            r0 = 1
            r4.A02 = r0
            r4.A03 = r0
            r1 = 0
            com.google.android.material.bottomsheet.IDxSCallbackShape46S0100000_2_I1 r0 = new com.google.android.material.bottomsheet.IDxSCallbackShape46S0100000_2_I1
            r0.<init>(r4, r1)
            r4.A00 = r0
            r4.A01()
            return
        L_0x002b:
            r6 = 2131952454(0x7f130346, float:1.9541351E38)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57012pj.<init>(android.content.Context, int):void");
    }

    public final View A03(View view, ViewGroup.LayoutParams layoutParams, int i2) {
        View inflate = View.inflate(getContext(), R.layout.layout0218, (ViewGroup) null);
        ViewGroup A0K = C13690nt.A0K(inflate, R.id.coordinator);
        if (i2 != 0 && view == null) {
            view = C13680ns.A0H(getLayoutInflater(), A0K, i2);
        }
        ViewGroup A0K2 = C13690nt.A0K(A0K, R.id.design_bottom_sheet);
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(A0K2);
        this.A01 = A002;
        A002.A0E = this.A00;
        A002.A0J = this.A02;
        if (layoutParams == null) {
            A0K2.addView(view);
        } else {
            A0K2.addView(view, layoutParams);
        }
        C13680ns.A1A(A0K.findViewById(R.id.touch_outside), this, 1);
        C004601z.A0j(A0K2, new IDxDCompatShape23S0100000_2_I1(this, 0));
        A0K2.setOnTouchListener(new IDxTListenerShape168S0100000_2_I1(this, 0));
        return inflate;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0B == 5) {
            bottomSheetBehavior.A0M(4);
        }
    }

    public void setCancelable(boolean z2) {
        super.setCancelable(z2);
        if (this.A02 != z2) {
            this.A02 = z2;
            BottomSheetBehavior bottomSheetBehavior = this.A01;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0J = z2;
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z2) {
        super.setCanceledOnTouchOutside(z2);
        if (z2 && !this.A02) {
            this.A02 = true;
        }
        this.A03 = z2;
        this.A04 = true;
    }

    public void setContentView(int i2) {
        super.setContentView(A03((View) null, (ViewGroup.LayoutParams) null, i2));
    }

    public void setContentView(View view) {
        super.setContentView(A03(view, (ViewGroup.LayoutParams) null, 0));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(A03(view, layoutParams, 0));
    }
}
