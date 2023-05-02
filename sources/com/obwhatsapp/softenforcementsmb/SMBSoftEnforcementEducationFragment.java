package com.obwhatsapp.softenforcementsmb;

import X.AnonymousClass000;
import X.AnonymousClass02C;
import X.AnonymousClass13U;
import X.AnonymousClass5CA;
import X.C004601z;
import X.C13680ns;
import X.C15450qv;
import X.C16440t3;
import X.C23071Aj;
import X.C75663sW;
import X.C94394kq;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.obwhatsapp.R;
import com.obwhatsapp.RoundedBottomSheetDialogFragment;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SMBSoftEnforcementEducationFragment extends RoundedBottomSheetDialogFragment {
    public static final Map A08 = new AnonymousClass5CA();
    public Context A00;
    public View A01;
    public ScrollView A02;
    public Integer A03 = C13680ns.A0a();
    public final AnonymousClass02C A04;
    public final C23071Aj A05;
    public final C16440t3 A06;
    public final AnonymousClass13U A07;

    public SMBSoftEnforcementEducationFragment(Context context, AnonymousClass02C r3, C23071Aj r4, C16440t3 r5, AnonymousClass13U r6) {
        this.A00 = context;
        this.A05 = r4;
        this.A04 = r3;
        this.A07 = r6;
        this.A06 = r5;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0564);
        A0H.findViewById(R.id.smb_soft_enforcement_education_intro);
        this.A02 = (ScrollView) C004601z.A0E(A0H, R.id.smb_soft_enforcement_warning_scroller);
        this.A01 = C004601z.A0E(A0H, R.id.smb_soft_enforcement_accept_button_container);
        throw AnonymousClass000.A0W("type");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ScrollView scrollView = this.A02;
        View view = this.A01;
        if (C15450qv.A03()) {
            scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new C94394kq(view, scrollView, this));
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - 0);
        new C75663sW();
        throw AnonymousClass000.A0W("source");
    }
}
