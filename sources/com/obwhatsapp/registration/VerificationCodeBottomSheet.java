package com.obwhatsapp.registration;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.C004601z;
import X.C15860rz;
import X.C16490t9;
import X.C19380yL;
import X.C74533qh;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;

public class VerificationCodeBottomSheet extends Hilt_VerificationCodeBottomSheet {
    public C19380yL A00;
    public C15860rz A01;
    public AnonymousClass013 A02;
    public C16490t9 A03;

    public static VerificationCodeBottomSheet A01(String str) {
        VerificationCodeBottomSheet verificationCodeBottomSheet = new VerificationCodeBottomSheet();
        Bundle bundle = new Bundle();
        bundle.putString("code", str);
        verificationCodeBottomSheet.A0T(bundle);
        return verificationCodeBottomSheet;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        char charAt;
        View inflate = layoutInflater.inflate(R.layout.layout05c5, viewGroup);
        C004601z.A0E(inflate, R.id.close_button).setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 47));
        ViewGroup viewGroup2 = (ViewGroup) C004601z.A0E(inflate, R.id.code_container);
        String string = A04().getString("code", "");
        AnonymousClass00B.A0C("Invalid code", !string.isEmpty());
        int length = string.length();
        for (int i2 = 0; i2 <= length; i2++) {
            int i3 = length;
            Context A0u = A0u();
            WaTextView waTextView = new WaTextView(A0u);
            waTextView.setTextAppearance(A0u, R.style.style038a);
            if (!(!this.A02.A0T())) {
                i3 = 0;
            }
            if (Build.VERSION.SDK_INT < 17 || i2 != i3) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, waTextView.getContext().getResources().getDimensionPixelSize(R.dimen.dimen0652), 0);
                waTextView.setLayoutParams(layoutParams);
            }
            int i4 = length >> 1;
            if (i2 == i4) {
                charAt = '-';
            } else {
                int i5 = i2 - 1;
                if (i2 < i4) {
                    i5 = i2;
                }
                if (Build.VERSION.SDK_INT < 17 && this.A02.A0T()) {
                    i5 = length - i2;
                    if (i2 < i4) {
                        i5--;
                    }
                }
                charAt = string.charAt(i5);
            }
            waTextView.setText(String.valueOf(charAt));
            viewGroup2.addView(waTextView);
        }
        C15860rz r3 = this.A01;
        C19380yL r2 = this.A00;
        r3.A0K().remove("device_switching_code").apply();
        r3.A0K().remove("device_switching_code_expiry").apply();
        r2.A03(53, (String) null);
        C74533qh r1 = new C74533qh();
        r1.A00 = this.A01.A0N();
        this.A03.A06(r1);
        return inflate;
    }
}
