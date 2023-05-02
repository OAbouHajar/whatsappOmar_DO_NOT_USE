package com.obwhatsapp.dialogs;

import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.AnonymousClass3KR;
import X.C33871jK;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class ProgressDialogFragment extends Hilt_ProgressDialogFragment {
    public DialogInterface.OnKeyListener A00;
    public boolean A01 = false;

    public static ProgressDialogFragment A01(int i2, int i3) {
        ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("title_id", i2);
        bundle.putInt("message_id", i3);
        progressDialogFragment.A0T(bundle);
        return progressDialogFragment;
    }

    public static ProgressDialogFragment A02(String str, String str2) {
        ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putString("message", str2);
        progressDialogFragment.A0T(bundle);
        return progressDialogFragment;
    }

    public void A0q() {
        super.A0q();
        if (this.A01) {
            A1C();
            this.A01 = false;
        }
    }

    public void A0s(Bundle bundle) {
        CharSequence charSequence;
        super.A0s(bundle);
        AnonymousClass3KR r0 = (AnonymousClass3KR) this.A03;
        if (r0 != null && (charSequence = r0.A00) != null) {
            bundle.putString("previous_message_text", charSequence.toString());
        }
    }

    public Dialog A1B(Bundle bundle) {
        if (bundle != null) {
            this.A01 = !C33871jK.A02;
        }
        A04();
        int i2 = A04().getInt("title_id");
        int i3 = this.A05.getInt("message_id");
        String str = null;
        if (bundle != null) {
            str = bundle.getString("previous_message_text");
        }
        AnonymousClass3KR r2 = new AnonymousClass3KR(A0C());
        String string = this.A05.getString("title");
        if (!(string == null && (i2 == 0 || (string = A0J(i2)) == null))) {
            r2.setTitle(string);
        }
        if (!(str == null && (str = this.A05.getString("message")) == null && (i3 == 0 || (str = A0J(i3)) == null))) {
            r2.setMessage(str);
        }
        r2.setIndeterminate(true);
        A1H(false);
        DialogInterface.OnKeyListener onKeyListener = this.A00;
        if (onKeyListener != null) {
            r2.setOnKeyListener(onKeyListener);
        }
        return r2;
    }

    public void A1G(AnonymousClass02C r2, String str) {
        AnonymousClass050 r0 = new AnonymousClass050(r2);
        r0.A0C(this, str);
        r0.A02();
    }

    public void A1N() {
        if (this.A03 >= 7) {
            A1C();
        } else {
            this.A01 = true;
        }
    }
}
