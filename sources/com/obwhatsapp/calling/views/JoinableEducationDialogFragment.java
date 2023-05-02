package com.obwhatsapp.calling.views;

import X.AnonymousClass00B;
import X.AnonymousClass07V;
import X.C001000l;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.obwhatsapp.R;

public class JoinableEducationDialogFragment extends Hilt_JoinableEducationDialogFragment {
    public boolean A00;

    public static JoinableEducationDialogFragment A01() {
        Bundle A0D = C13690nt.A0D();
        A0D.putBoolean("bundle_param_voice_call", false);
        JoinableEducationDialogFragment joinableEducationDialogFragment = new JoinableEducationDialogFragment();
        joinableEducationDialogFragment.A0T(A0D);
        return joinableEducationDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        if (!(bundle == null && (bundle = this.A05) == null)) {
            this.A00 = bundle.getBoolean("bundle_param_voice_call", false);
        }
        C001000l A0C = A0C();
        AnonymousClass00B.A06(A0C);
        C32241fu A002 = C32241fu.A00(A0C);
        View inflate = LayoutInflater.from(A0C).inflate(R.layout.layout05f6, (ViewGroup) null, false);
        ImageView A0K = C13680ns.A0K(inflate, R.id.voip_call_joinable_education_dialog_icon);
        if (this.A00) {
            AnonymousClass07V A01 = AnonymousClass07V.A01((Resources.Theme) null, A03(), R.drawable.vec_ic_voip_joinable_calls_education_stars_voice);
            AnonymousClass00B.A06(A01);
            A0K.setImageDrawable(A01);
            C13700nu.A0R(A0K, this, R.string.str1ab9);
        }
        A002.setView(inflate);
        A002.setPositiveButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
        return A002.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }
}
