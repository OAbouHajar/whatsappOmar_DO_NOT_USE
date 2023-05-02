package com.obwhatsapp.payments.ui;

import X.AnonymousClass00T;
import X.AnonymousClass04o;
import X.C001500q;
import X.C006602z;
import X.C110105dW;
import X.C110725ej;
import X.C111505gM;
import X.C13680ns;
import X.C16600tK;
import X.C18090w8;
import X.C18280wR;
import X.C18290wS;
import X.C18300wT;
import X.C18310wU;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.facebook.redex.IDxFactoryShape56S0200000_3_I1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.IDxSCallbackShape47S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaTextView;

public class ViralityLinkVerifierActivity extends C111505gM {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public WaButton A04;
    public WaButton A05;
    public WaTextView A06;
    public WaTextView A07;
    public C16600tK A08;
    public C18300wT A09;
    public C18310wU A0A;
    public C18090w8 A0B;
    public C18290wS A0C;
    public C110725ej A0D;
    public C18280wR A0E;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0D = (C110725ej) new C006602z((AnonymousClass04o) new IDxFactoryShape56S0200000_3_I1(getIntent().getData(), 0, this), (C001500q) this).A01(C110725ej.class);
        setContentView((int) R.layout.layout05e3);
        C110105dW.A0r(AnonymousClass00T.A05(this, R.id.virality_activity_root_view), this, 106);
        this.A01 = AnonymousClass00T.A05(this, R.id.actionable_container);
        this.A03 = AnonymousClass00T.A05(this, R.id.virality_texts_container);
        this.A02 = AnonymousClass00T.A05(this, R.id.progress_container);
        this.A07 = C13680ns.A0S(this.A03, R.id.payment_enabled_or_not_title);
        this.A06 = C13680ns.A0S(this.A03, R.id.virality_description_text);
        WaButton waButton = (WaButton) AnonymousClass00T.A05(this, R.id.done_or_cancel_button);
        this.A04 = waButton;
        C110105dW.A0r(waButton, this, 105);
        WaButton waButton2 = (WaButton) AnonymousClass00T.A05(this, R.id.go_to_payments_button);
        this.A05 = waButton2;
        C110105dW.A0r(waButton2, this, 104);
        this.A02.setVisibility(0);
        this.A03.setVisibility(8);
        this.A01.setVisibility(8);
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(AnonymousClass00T.A05(this, R.id.virality_bottom_sheet));
        A002.A0L(0);
        A002.A0M(3);
        A002.A0E = new IDxSCallbackShape47S0100000_3_I1(this, 1);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            Window window = getWindow();
            getWindow().setNavigationBarColor(AnonymousClass00T.A00(this, R.color.color0092));
        }
        C110105dW.A0x(this, this.A0D.A01, 62);
    }

    public void onDestroy() {
        C16600tK r0;
        C110725ej r1 = this.A0D;
        if (!(r1 == null || (r0 = r1.A02) == null)) {
            r0.A03(r1);
        }
        super.onDestroy();
    }
}
