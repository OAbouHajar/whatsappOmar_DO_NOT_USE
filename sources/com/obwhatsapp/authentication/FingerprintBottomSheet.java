package com.obwhatsapp.authentication;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass024;
import X.AnonymousClass1UP;
import X.AnonymousClass2J2;
import X.AnonymousClass2JP;
import X.C13680ns;
import X.C13690nt;
import X.C16440t3;
import X.C63713Lf;
import X.C70783hi;
import X.C91534g4;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.IDxSCallbackShape46S0100000_2_I1;
import com.obwhatsapp.R;
import java.security.Signature;

public class FingerprintBottomSheet extends Hilt_FingerprintBottomSheet implements AnonymousClass2J2 {
    public long A00 = 0;
    public CountDownTimer A01;
    public TextView A02;
    public TextView A03;
    public AnonymousClass024 A04;
    public C70783hi A05;
    public FingerprintView A06;
    public C16440t3 A07;
    public AnonymousClass013 A08;
    public boolean A09 = false;

    public static FingerprintBottomSheet A01(int i2, int i3, int i4, int i5) {
        FingerprintBottomSheet fingerprintBottomSheet = new FingerprintBottomSheet();
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("title", i2);
        A0D.putInt("negative_button_text", i3);
        A0D.putInt("positive_button_text", i4);
        if (i5 != 0) {
            A0D.putInt("header_layout_id", i5);
        }
        A0D.putInt("fingerprint_view_style_id", R.style.style017e);
        A0D.putBoolean("full_screen", false);
        fingerprintBottomSheet.A0T(A0D);
        return fingerprintBottomSheet;
    }

    public static /* synthetic */ void A02(DialogInterface dialogInterface, Bundle bundle, FingerprintBottomSheet fingerprintBottomSheet) {
        View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
        AnonymousClass00B.A04(findViewById);
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(findViewById);
        if (bundle.getBoolean("full_screen")) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = Resources.getSystem().getDisplayMetrics().heightPixels - AnonymousClass1UP.A02(fingerprintBottomSheet.A0u(), AnonymousClass01V.A02(fingerprintBottomSheet.A0u()));
            findViewById.setLayoutParams(layoutParams);
        }
        A002.A0M(3);
        A002.A0E = new IDxSCallbackShape46S0100000_2_I1(fingerprintBottomSheet, 1);
    }

    public static /* synthetic */ void A03(FingerprintBottomSheet fingerprintBottomSheet) {
        fingerprintBottomSheet.A1D();
        C70783hi r0 = fingerprintBottomSheet.A05;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void A0k() {
        super.A0k();
        this.A05 = null;
    }

    public void A0w() {
        super.A0w();
        A1L();
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Bundle A042 = A04();
        int i2 = A042.getInt("custom_layout_id");
        if (i2 == 0) {
            i2 = R.layout.layout028a;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup, false);
        int i3 = A042.getInt("header_layout_id");
        if (i3 != 0) {
            ViewGroup A0K = C13690nt.A0K(inflate, R.id.header_container);
            layoutInflater.inflate(i3, A0K);
            A0K.setVisibility(0);
        }
        ViewGroup A0K2 = C13690nt.A0K(inflate, R.id.fingerprint_view_wrapper);
        if (A0K2 != null) {
            FingerprintView fingerprintView = new FingerprintView(inflate.getContext(), (AttributeSet) null, 0, A042.getInt("fingerprint_view_style_id"));
            this.A06 = fingerprintView;
            A0K2.addView(fingerprintView);
        } else {
            this.A06 = (FingerprintView) inflate.findViewById(R.id.fingerprint_view);
        }
        C13680ns.A1F(C13680ns.A0M(inflate, R.id.fingerprint_bottomsheet_title), this, A042.getInt("title", R.string.str08f5));
        if (A042.getInt("positive_button_text") != 0) {
            String A0J = A0J(A042.getInt("positive_button_text"));
            TextView A0M = C13680ns.A0M(inflate, R.id.fingerprint_bottomsheet_positive_button);
            this.A03 = A0M;
            A0M.setText(A0J);
            C13680ns.A1A(this.A03, this, 20);
        }
        if (A042.getInt("negative_button_text") != 0) {
            String A0J2 = A0J(A042.getInt("negative_button_text"));
            TextView A0M2 = C13680ns.A0M(inflate, R.id.fingerprint_bottomsheet_negative_button);
            this.A02 = A0M2;
            AnonymousClass2JP.A02(A0M2);
            this.A02.setText(A0J2);
            C13680ns.A1A(this.A02, this, 21);
        }
        this.A06.A00 = this.A05;
        Window window = this.A03.getWindow();
        AnonymousClass00B.A06(window);
        if (Build.VERSION.SDK_INT >= 21) {
            window.getDecorView().setSystemUiVisibility(1280);
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        window.setAttributes(attributes);
        this.A03.setOnShowListener(new C91534g4(A042, this));
        return inflate;
    }

    public void A13() {
        super.A13();
        FingerprintView fingerprintView = this.A06;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
            this.A06 = null;
        }
    }

    public void A14() {
        super.A14();
        if (this.A00 <= this.A07.A00() && !this.A09) {
            FingerprintView fingerprintView = this.A06;
            if (fingerprintView != null) {
                fingerprintView.A02(fingerprintView.A06);
            }
            A1K();
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        A1E(0, R.style.style02f0);
    }

    public void A1C() {
        A1L();
        super.A1C();
    }

    public void A1K() {
        AnonymousClass024 r1 = new AnonymousClass024();
        this.A04 = r1;
        C70783hi r0 = this.A05;
        if (r0 != null) {
            r0.A03(r1, this);
        }
    }

    public final void A1L() {
        AnonymousClass024 r0 = this.A04;
        if (r0 != null) {
            r0.A01();
            this.A04 = null;
        }
    }

    public void A1M(long j2) {
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
        long j3 = j2;
        if (j2 > this.A07.A00()) {
            this.A00 = j2;
            A1L();
            this.A01 = new C63713Lf(this, j2 - this.A07.A00(), j3).start();
        }
    }

    public void AMu(int i2, CharSequence charSequence) {
        C70783hi r0 = this.A05;
        if (r0 != null) {
            r0.A02(i2);
        }
        if (this.A06 != null) {
            if (i2 == 7) {
                Object[] A1b = C13680ns.A1b();
                AnonymousClass000.A1M(A1b, 30, 0);
                charSequence = A0K(R.string.str00f4, A1b);
            }
            this.A06.A03(charSequence);
        }
        A1L();
    }

    public void AMv() {
        FingerprintView fingerprintView = this.A06;
        if (fingerprintView != null) {
            fingerprintView.A04(fingerprintView.getContext().getString(R.string.str08f9));
        }
    }

    public void AMx(int i2, CharSequence charSequence) {
        FingerprintView fingerprintView = this.A06;
        if (fingerprintView != null) {
            fingerprintView.A04(charSequence.toString());
        }
    }

    public void AMy(byte[] bArr) {
        C70783hi r0 = this.A05;
        if (r0 != null) {
            r0.A04(bArr);
        }
        FingerprintView fingerprintView = this.A06;
        if (fingerprintView != null) {
            fingerprintView.A01();
        }
    }

    public void AMz(Signature signature) {
        FingerprintView fingerprintView = this.A06;
        if (fingerprintView != null) {
            fingerprintView.A01();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        A1L();
        super.onCancel(dialogInterface);
    }
}
