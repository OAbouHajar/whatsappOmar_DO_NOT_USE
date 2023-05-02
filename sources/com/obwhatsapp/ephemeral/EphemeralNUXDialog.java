package com.obwhatsapp.ephemeral;

import X.AnonymousClass02C;
import X.C001000l;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C15860rz;
import X.C17220uj;
import X.C17800vf;
import X.C19980zJ;
import X.C32241fu;
import X.C48402Na;
import X.C49732Vm;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ScrollView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.redex.IDxKListenerShape224S0100000_2_I1;
import com.obwhatsapp.R;

public class EphemeralNUXDialog extends Hilt_EphemeralNUXDialog {
    public View A00;
    public ScrollView A01;
    public C19980zJ A02;
    public C15860rz A03;
    public C17800vf A04;
    public C17220uj A05;

    public static void A01(AnonymousClass02C r3, C17800vf r4, boolean z2) {
        if (A02(r3, r4)) {
            EphemeralNUXDialog ephemeralNUXDialog = new EphemeralNUXDialog();
            Bundle A0D = C13690nt.A0D();
            A0D.putBoolean("from_settings", z2);
            ephemeralNUXDialog.A0T(A0D);
            ephemeralNUXDialog.A1G(r3, "ephemeral_nux");
        }
    }

    public static boolean A02(AnonymousClass02C r2, C17800vf r3) {
        return !r2.A0o() && !r3.A00((Object) null, "ephemeral") && r2.A0B("ephemeral_nux") == null;
    }

    public void A14() {
        super.A14();
        if (this.A04.A00((Object) null, "ephemeral")) {
            A1D();
        }
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.setOnKeyListener(new IDxKListenerShape224S0100000_2_I1(this, 2));
            dialog.setCanceledOnTouchOutside(false);
            A1N(dialog);
            C49732Vm.A00(this.A00, this.A01);
        }
    }

    public Dialog A1B(Bundle bundle) {
        boolean z2 = A04().getBoolean("from_settings");
        View A0H = C13680ns.A0H(A0D().getLayoutInflater(), (ViewGroup) null, R.layout.layout0268);
        TextView A0L = C13680ns.A0L(A0H, R.id.ephemeral_nux_title);
        TextView A0L2 = C13680ns.A0L(A0H, R.id.ephemeral_nux_content);
        TextView A0L3 = C13680ns.A0L(A0H, R.id.ephemeral_nux_finished);
        View A0E = C004601z.A0E(A0H, R.id.ephemeral_nux_go_to_faq);
        this.A00 = C004601z.A0E(A0H, R.id.ephemeral_nux_buttons_container);
        this.A01 = (ScrollView) C004601z.A0E(A0H, R.id.ephemeral_nux_scroller);
        int i2 = R.string.str080e;
        int i3 = R.string.str080d;
        int i4 = R.string.str0e87;
        if (z2) {
            i2 = R.string.str080a;
            i3 = R.string.str0809;
            i4 = R.string.str0807;
        }
        C13680ns.A16(A0L3, this, 6);
        C13680ns.A16(A0E, this, 5);
        A0L.setText(i2);
        A0L2.setText(i3);
        A0L3.setText(i4);
        View A0E2 = C004601z.A0E(A0H, R.id.nux_icon);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C004601z.A0E(A0H, R.id.ephemeral_lottie_animation);
        lottieAnimationView.setAnimation("ephemeral_settings_lottie_animation.lottie");
        lottieAnimationView.setVisibility(0);
        A0E2.setVisibility(8);
        C32241fu A002 = C32241fu.A00(A02());
        A002.setView(A0H);
        return A002.create();
    }

    public final void A1N(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = Math.min(A03().getDimensionPixelSize(R.dimen.dimen037f), A03().getDisplayMetrics().widthPixels);
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.A03;
        if (dialog != null) {
            A1N(dialog);
            C49732Vm.A00(this.A00, this.A01);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C001000l A0C = A0C();
        if (A0C instanceof C48402Na) {
            ((C48402Na) A0C).AU6();
        }
    }
}
