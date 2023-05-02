package com.obwhatsapp.contact.picker.statusprivacy;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass07M;
import X.AnonymousClass09N;
import X.AnonymousClass11G;
import X.AnonymousClass1BU;
import X.AnonymousClass1L1;
import X.AnonymousClass1ZW;
import X.C011105i;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C16620tM;
import X.C17980vx;
import X.C34331k5;
import X.C35541m6;
import X.C49222Rr;
import X.C57002pe;
import X.C86964Uv;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxRCallbackShape215S0100000_2_I1;
import com.obwhatsapp.R;

public class StatusPrivacyBottomSheetDialogFragment extends Hilt_StatusPrivacyBottomSheetDialogFragment {
    public C86964Uv A00;
    public C49222Rr A01;
    public C57002pe A02;
    public AnonymousClass013 A03;
    public C35541m6 A04;
    public AnonymousClass11G A05;
    public C14710pd A06;
    public AnonymousClass1BU A07;
    public C17980vx A08;
    public AnonymousClass1L1 A09;
    public AnonymousClass01D A0A;
    public final C011105i A0B = A07(new IDxRCallbackShape215S0100000_2_I1(this, 5), new AnonymousClass07M());
    public final C011105i A0C = A07(new IDxRCallbackShape215S0100000_2_I1(this, 4), new AnonymousClass07M());

    public static StatusPrivacyBottomSheetDialogFragment A01(boolean z2) {
        Bundle A0D = C13690nt.A0D();
        StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment = new StatusPrivacyBottomSheetDialogFragment();
        A0D.putBoolean("should_display_xo", z2);
        statusPrivacyBottomSheetDialogFragment.A0T(A0D);
        return statusPrivacyBottomSheetDialogFragment;
    }

    public void A0k() {
        super.A0k();
        this.A01 = null;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Bundle A042 = A04();
        AnonymousClass00B.A06(A042);
        C35541m6 A002 = this.A07.A00(A042);
        AnonymousClass00B.A06(A002);
        this.A04 = A002;
        A04().getBoolean("should_display_xo");
        C57002pe r4 = new C57002pe(A02());
        this.A02 = r4;
        AnonymousClass013 r5 = this.A03;
        C14710pd r0 = this.A06;
        C16620tM r2 = C16620tM.A01;
        boolean A0E = r0.A0E(r2, 2509);
        boolean A0E2 = this.A06.A0E(r2, 2509);
        int i2 = R.string.str1309;
        if (A0E2) {
            i2 = R.string.str14d4;
        }
        String A0J = A0J(i2);
        boolean A0E3 = this.A06.A0E(r2, 2509);
        int i3 = R.string.str1307;
        if (A0E3) {
            i3 = R.string.str14d3;
        }
        C86964Uv r3 = new C86964Uv(r4, r5, A0J, A0J(i3), A0E);
        this.A00 = r3;
        C35541m6 r02 = this.A04;
        int i4 = r02.A00;
        int size = r02.A01.size();
        int size2 = this.A04.A02.size();
        r3.A00(i4);
        r3.A01(size, size2);
        C57002pe r22 = r3.A00;
        r22.setBottomSheetTitle(r3.A02);
        r22.setFooterText(AnonymousClass1ZW.A01(r3.A03, new Object[0]));
        boolean z2 = !r3.A04;
        C13680ns.A1B(r22.A03, r22, this, 41);
        C13680ns.A1B(r22.A02, r22, this, 43);
        C13680ns.A1B(r22.A01, r22, this, 42);
        C34331k5.A04(r22.A08, r22, this, 30);
        C34331k5.A04(r22.A04, r22, this, 31);
        C34331k5.A04(r22.A06, r22, this, 32);
        if (z2) {
            C34331k5.A04(r22.A05, r22, this, 33);
        }
        return this.A02;
    }

    public void A16(Context context) {
        super.A16(context);
        if (context instanceof C49222Rr) {
            this.A01 = (C49222Rr) context;
            return;
        }
        throw AnonymousClass000.A0V(AnonymousClass000.A0h("StatusPrivacyBottomSheetDialogListener", AnonymousClass000.A0r("Activity must implement ")));
    }

    public void A1N(int i2) {
        C35541m6 r0 = this.A04;
        this.A04 = new C35541m6(r0.A01, r0.A02, i2, r0.A03);
    }

    public final void A1O(boolean z2) {
        Context A022 = A02();
        Intent A092 = C13680ns.A09();
        A092.setClassName(A022.getPackageName(), "com.obwhatsapp.status.audienceselector.StatusTemporalRecipientsActivity");
        A092.putExtra("is_black_list", z2);
        this.A07.A01(A092, this.A04);
        this.A0B.A00((AnonymousClass09N) null, A092);
    }
}
