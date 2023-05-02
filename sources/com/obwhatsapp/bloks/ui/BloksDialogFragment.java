package com.obwhatsapp.bloks.ui;

import X.AnonymousClass00B;
import X.AnonymousClass22A;
import X.AnonymousClass2ZU;
import X.C000900k;
import X.C110115dX;
import X.C110285do;
import X.C115925qX;
import X.C120005zy;
import X.C120015zz;
import X.C1219667t;
import X.C1221968q;
import X.C13680ns;
import X.C13690nt;
import X.C14870pt;
import X.C16040sK;
import X.C23061Ai;
import X.C49852We;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.facebook.rendercore.RootHostView;
import com.obwhatsapp.R;
import java.util.HashMap;
import java.util.Map;

public class BloksDialogFragment extends Hilt_BloksDialogFragment implements C1221968q {
    public View A00;
    public FrameLayout A01;
    public AnonymousClass2ZU A02;
    public C14870pt A03;
    public C16040sK A04;
    public AnonymousClass22A A05;
    public C120005zy A06;
    public C115925qX A07;
    public C1219667t A08;
    public C110285do A09;
    public C23061Ai A0A;
    public Boolean A0B;
    public Map A0C;

    public static BloksDialogFragment A01(String str, HashMap hashMap) {
        BloksDialogFragment bloksDialogFragment = new BloksDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("screen_name", str);
        A0D.putSerializable("screen_params", hashMap);
        A0D.putBoolean("hot_reload", false);
        bloksDialogFragment.A0T(A0D);
        return bloksDialogFragment;
    }

    public void A0w() {
        super.A0w();
        View currentFocus = A0D().getCurrentFocus();
        if (currentFocus != null) {
            this.A0A.A01(currentFocus);
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0294);
    }

    public void A13() {
        super.A13();
        C110285do r1 = this.A09;
        C49852We r0 = r1.A04;
        if (r0 != null) {
            r0.A04();
            r1.A04 = null;
        }
        this.A01 = null;
        this.A08 = null;
        this.A00 = null;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        AnonymousClass2ZU r3 = this.A02;
        this.A05 = C110115dX.A0A((C000900k) A0D(), A0G(), r3, this.A0C);
        C110285do r2 = this.A09;
        C000900k r4 = (C000900k) A0C();
        A0u();
        Bundle A042 = A04();
        String string = A04().getString("screen_name");
        AnonymousClass00B.A06(string);
        r2.A01(A042, r4, this, this.A05, this.A06, this, string, (HashMap) A04().getSerializable("screen_params"));
    }

    public void A18(Bundle bundle, View view) {
        C120015zz r0 = new C120015zz(view);
        this.A08 = r0;
        this.A09.A03 = (RootHostView) r0.A00.findViewById(R.id.bloks_container);
        this.A00 = view.findViewById(R.id.bloks_dialogfragment_progressbar);
        this.A01 = (FrameLayout) view.findViewById(R.id.bloks_dialogfragment);
        this.A09.A00();
    }

    public Dialog A1B(Bundle bundle) {
        Dialog A1B = super.A1B(bundle);
        A1B.setCanceledOnTouchOutside(false);
        Window window = A1B.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        return A1B;
    }
}
