package com.obwhatsapp.ephemeral;

import X.AnonymousClass000;
import X.AnonymousClass02C;
import X.C001000l;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C15860rz;
import X.C16740tZ;
import X.C17220uj;
import X.C17800vf;
import X.C19980zJ;
import X.C32241fu;
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
import com.obwhatsapp.R;

public class ViewOnceNUXDialog extends Hilt_ViewOnceNUXDialog {
    public View A00;
    public ScrollView A01;
    public C19980zJ A02;
    public C15860rz A03;
    public C17800vf A04;
    public C17220uj A05;

    public static void A01(AnonymousClass02C r3, C16740tZ r4, boolean z2) {
        Bundle A0D = C13690nt.A0D();
        if (r4 != null) {
            A0D.putInt("MESSAGE_TYPE", r4.A10);
        }
        A0D.putBoolean("FORCE_SHOW", z2);
        ViewOnceNUXDialog viewOnceNUXDialog = new ViewOnceNUXDialog();
        viewOnceNUXDialog.A0T(A0D);
        viewOnceNUXDialog.A1G(r3, "view_once_nux");
    }

    public void A14() {
        super.A14();
        if (!A04().getBoolean("FORCE_SHOW", false)) {
            if (this.A04.A00((Object) null, AnonymousClass000.A1R(A04().getInt("MESSAGE_TYPE", -1), -1) ? "ephemeral_view_once" : "ephemeral_view_once_receiver")) {
                A1D();
            }
        }
        Dialog dialog = this.A03;
        if (dialog != null) {
            A1O(dialog);
            C49732Vm.A00(this.A00, this.A01);
        }
    }

    public Dialog A1B(Bundle bundle) {
        int i2;
        C001000l A0D = A0D();
        View A0H = C13680ns.A0H(A0D.getLayoutInflater(), (ViewGroup) null, R.layout.layout05d4);
        View A0E = C004601z.A0E(A0H, R.id.view_once_nux_finished);
        View A0E2 = C004601z.A0E(A0H, R.id.view_once_nux_go_to_faq);
        TextView A0L = C13680ns.A0L(A0H, R.id.view_once_nux_title);
        TextView A0L2 = C13680ns.A0L(A0H, R.id.view_once_nux_content);
        if (A04().getInt("MESSAGE_TYPE", -1) == -1) {
            C13680ns.A1F(A0L, this, R.string.str19f7);
            i2 = R.string.str19f6;
        } else if (A04().getInt("MESSAGE_TYPE", -1) == 42) {
            C13680ns.A1F(A0L, this, R.string.str19f3);
            i2 = R.string.str19f2;
        } else {
            C13680ns.A1F(A0L, this, R.string.str19f5);
            i2 = R.string.str19f4;
        }
        C13680ns.A1F(A0L2, this, i2);
        this.A00 = C004601z.A0E(A0H, R.id.view_once_nux_buttons_container);
        this.A01 = (ScrollView) C004601z.A0E(A0H, R.id.view_once_nux_scroller);
        C13680ns.A16(A0E, this, 8);
        C13680ns.A16(A0E2, this, 9);
        C32241fu A002 = C32241fu.A00(A0D);
        A002.setView(A0H);
        return A002.create();
    }

    public final void A1N() {
        this.A04.A00.A00(A04().getInt("MESSAGE_TYPE", -1) == -1 ? "ephemeral_view_once" : "ephemeral_view_once_receiver", (Object) null);
        A1D();
    }

    public final void A1O(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = Math.min(A03().getDimensionPixelSize(R.dimen.dimen081f), A03().getDisplayMetrics().widthPixels);
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.A03;
        if (dialog != null) {
            A1O(dialog);
            C49732Vm.A00(this.A00, this.A01);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.A04.A00.A00(A04().getInt("MESSAGE_TYPE", -1) == -1 ? "ephemeral_view_once" : "ephemeral_view_once_receiver", (Object) null);
        super.onDismiss(dialogInterface);
    }
}
