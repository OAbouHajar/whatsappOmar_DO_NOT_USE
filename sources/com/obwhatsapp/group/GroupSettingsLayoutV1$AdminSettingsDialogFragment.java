package com.obwhatsapp.group;

import X.AnonymousClass00B;
import X.AnonymousClass11A;
import X.AnonymousClass122;
import X.AnonymousClass124;
import X.C004601z;
import X.C14870pt;
import X.C15900s5;
import X.C16000sG;
import X.C16010sH;
import X.C16050sL;
import X.C16070sO;
import X.C16440t3;
import X.C16460t6;
import X.C17240ul;
import X.C18260wP;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape22S0000000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.obwhatsapp.R;
import com.whatsapp.voipcalling.CallLinkInfo;

public abstract class GroupSettingsLayoutV1$AdminSettingsDialogFragment extends Hilt_GroupSettingsLayoutV1_AdminSettingsDialogFragment {
    public C14870pt A00;
    public C15900s5 A01;
    public C18260wP A02;
    public C16000sG A03;
    public C16440t3 A04;
    public AnonymousClass11A A05;
    public C16460t6 A06;
    public C16070sO A07;
    public C16010sH A08;
    public C17240ul A09;
    public C16050sL A0A;
    public AnonymousClass124 A0B;
    public AnonymousClass122 A0C;
    public boolean[] A0D = new boolean[1];

    public void A0s(Bundle bundle) {
        bundle.putBoolean(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, this.A0D[0]);
        super.A0s(bundle);
    }

    public Dialog A1B(Bundle bundle) {
        if (A1S()) {
            C16050sL A052 = C16050sL.A05(A04().getString("gjid"));
            AnonymousClass00B.A06(A052);
            this.A0A = A052;
            this.A08 = this.A03.A0A(A052);
        }
        if (bundle == null) {
            bundle = this.A05;
        }
        boolean z2 = bundle.getBoolean(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID);
        this.A0D[0] = z2;
        View inflate = A0C().getLayoutInflater().inflate(R.layout.layout0066, (ViewGroup) null, false);
        CompoundButton compoundButton = (CompoundButton) C004601z.A0E(inflate, R.id.first_radio_button);
        CompoundButton compoundButton2 = (CompoundButton) C004601z.A0E(inflate, R.id.second_radio_button);
        compoundButton.setText(A1N());
        compoundButton2.setText(A1O());
        compoundButton.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 18));
        compoundButton2.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 17));
        if (z2) {
            compoundButton2.setChecked(true);
        } else {
            compoundButton.setChecked(true);
        }
        C32241fu r3 = new C32241fu(A0C());
        r3.setTitle(A1Q());
        r3.A06(A1P());
        r3.A07(true);
        r3.setView(inflate);
        r3.setNegativeButton(R.string.str0394, new IDxCListenerShape22S0000000_2_I0(3));
        r3.setPositiveButton(R.string.str0e87, new IDxCListenerShape127S0100000_2_I0(this, 71));
        return r3.create();
    }

    public String A1N() {
        return A0J(R.string.str0afb);
    }

    public String A1O() {
        return A0J(R.string.str0b03);
    }

    public abstract String A1P();

    public abstract String A1Q();

    public abstract void A1R(boolean z2);

    public boolean A1S() {
        return true;
    }
}
