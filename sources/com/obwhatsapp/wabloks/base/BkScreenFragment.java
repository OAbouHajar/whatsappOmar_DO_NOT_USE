package com.obwhatsapp.wabloks.base;

import X.AnonymousClass000;
import X.AnonymousClass1MQ;
import X.AnonymousClass22A;
import X.AnonymousClass2KR;
import X.AnonymousClass2ZU;
import X.AnonymousClass5wM;
import X.C000900k;
import X.C004601z;
import X.C110115dX;
import X.C13680ns;
import X.C20180zd;
import X.C31131dW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import java.io.IOException;
import java.util.Map;

public class BkScreenFragment extends Hilt_BkScreenFragment implements AnonymousClass2KR {
    public View A00;
    public FrameLayout A01;
    public AnonymousClass2ZU A02;
    public AnonymousClass1MQ A03;
    public C20180zd A04;
    public AnonymousClass5wM A05;
    public Map A06;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0294);
    }

    public void A13() {
        super.A13();
        GenericBkLayoutViewModel genericBkLayoutViewModel = (GenericBkLayoutViewModel) this.A05;
        if (genericBkLayoutViewModel.A01) {
            genericBkLayoutViewModel.A01.A04(A0H());
            this.A00 = null;
            return;
        }
        throw AnonymousClass000.A0V("BkLayoutViewModel must be initialized");
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        try {
            C31131dW.A00(A0D().getApplicationContext());
        } catch (IOException unused) {
        }
    }

    public void A18(Bundle bundle, View view) {
        this.A00 = C004601z.A0E(view, R.id.bloks_dialogfragment_progressbar);
        FrameLayout frameLayout = (FrameLayout) C004601z.A0E(view, R.id.bloks_dialogfragment);
        this.A01 = frameLayout;
        C13680ns.A13(frameLayout);
        View view2 = this.A00;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        GenericBkLayoutViewModel genericBkLayoutViewModel = (GenericBkLayoutViewModel) this.A05;
        if (genericBkLayoutViewModel.A01) {
            C110115dX.A0w(A0H(), genericBkLayoutViewModel.A01, this, 66);
            super.A18(bundle, view);
            return;
        }
        throw AnonymousClass000.A0V("BkLayoutViewModel must be initialized");
    }

    public int A19() {
        return R.id.bloks_container;
    }

    public Class A1A() {
        return GenericBkLayoutViewModel.class;
    }

    public void A1B() {
        C13680ns.A13(this.A00);
        FrameLayout frameLayout = this.A01;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        Bundle bundle = this.A05;
        if (bundle != null) {
            this.A05.A01((Map) null, bundle.getString("qpl_params"), "openScreen");
        }
    }

    public AnonymousClass1MQ AA9() {
        return this.A03;
    }

    public AnonymousClass22A AH1() {
        AnonymousClass2ZU r3 = this.A02;
        return C110115dX.A0A((C000900k) A0C(), A0G(), r3, this.A06);
    }
}
