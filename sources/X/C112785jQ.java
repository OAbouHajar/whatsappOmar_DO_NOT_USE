package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.IDxCListenerShape196S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilFbPayHubActivity;
import java.util.List;

/* renamed from: X.5jQ  reason: invalid class name and case insensitive filesystem */
public abstract class C112785jQ extends C111355g3 implements View.OnClickListener, AnonymousClass69B, AnonymousClass69A, C1220668d, AnonymousClass682 {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ListView A06;
    public SwitchCompat A07;
    public AnonymousClass107 A08;
    public AnonymousClass175 A09;
    public AnonymousClass109 A0A;
    public C18340wX A0B;
    public AnonymousClass17O A0C;
    public AnonymousClass108 A0D;
    public C18300wT A0E;
    public AnonymousClass17Y A0F;
    public C18310wU A0G;
    public C18290wS A0H;
    public C118365uZ A0I;
    public AnonymousClass1MA A0J;
    public C119285wq A0K;
    public C110335du A0L;
    public C118515uo A0M;
    public C119165we A0N;
    public AnonymousClass60S A0O;

    public String ADh(C30671cl r3) {
        BrazilFbPayHubActivity brazilFbPayHubActivity = (BrazilFbPayHubActivity) this;
        return C119405xi.A04(brazilFbPayHubActivity.getApplicationContext(), r3, brazilFbPayHubActivity.A04);
    }

    public void AhT(List list) {
        C110335du r0 = this.A0L;
        r0.A02 = list;
        r0.notifyDataSetChanged();
        C115265pT.A00(this.A06);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.add_new_account || view.getId() == R.id.p2p_onboarding_nudge_button) {
            AMA(AnonymousClass000.A1P(this.A0L.getCount()));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int A012 = C110105dW.A01(this, R.layout.layout0282);
        C005402i x2 = x();
        if (x2 != null) {
            C110105dW.A0o(this, x2, R.string.str0fb3, A012);
        }
        this.A03 = findViewById(R.id.payment_methods_container);
        this.A04 = findViewById(R.id.p2p_onboarding_nudge_container);
        findViewById(R.id.p2p_onboarding_nudge_button).setOnClickListener(this);
        BrazilFbPayHubActivity brazilFbPayHubActivity = (BrazilFbPayHubActivity) this;
        this.A0L = new C110335du(brazilFbPayHubActivity, brazilFbPayHubActivity.A01, brazilFbPayHubActivity.A0H, brazilFbPayHubActivity);
        ListView listView = (ListView) findViewById(R.id.methods_list);
        this.A06 = listView;
        listView.setAdapter(this.A0L);
        C16320sq r9 = this.A05;
        C18290wS r8 = this.A0H;
        C39961tL r21 = new C39961tL();
        C18300wT r7 = this.A0E;
        AnonymousClass175 r13 = this.A09;
        C18310wU r6 = this.A0G;
        AnonymousClass1MA r3 = this.A0J;
        AnonymousClass17O r14 = this.A0C;
        C18300wT r16 = r7;
        AnonymousClass17Y r17 = this.A0F;
        C18310wU r18 = r6;
        C18290wS r19 = r8;
        AnonymousClass1MA r20 = r3;
        AnonymousClass60S r10 = new AnonymousClass60S(this, this.A08, r13, r14, this.A0D, r16, r17, r18, r19, r20, r21, this, this, new AnonymousClass62F(), r9, (String) null, false);
        this.A0O = r10;
        r10.A01(false, false);
        this.A06.setOnItemClickListener(new IDxCListenerShape196S0100000_3_I1(this, 0));
        View findViewById = findViewById(R.id.add_new_account);
        this.A01 = findViewById;
        findViewById.setOnClickListener(this);
        AnonymousClass2SR.A08(C110115dX.A04(this, R.id.change_pin_icon), A012);
        AnonymousClass2SR.A08(C110115dX.A04(this, R.id.add_new_account_icon), A012);
        AnonymousClass2SR.A08(C110115dX.A04(this, R.id.fingerprint_setting_icon), A012);
        AnonymousClass2SR.A08(C110115dX.A04(this, R.id.delete_payments_account_icon), A012);
        AnonymousClass2SR.A08(C110115dX.A04(this, R.id.request_payment_account_info_icon), A012);
        this.A05 = findViewById(R.id.pin_container);
        this.A02 = findViewById(R.id.fingerprint_container);
        this.A07 = (SwitchCompat) findViewById(R.id.toggle_fingerprint);
        C16320sq r102 = brazilFbPayHubActivity.A05;
        C18290wS r92 = brazilFbPayHubActivity.A0H;
        AnonymousClass5wV r82 = brazilFbPayHubActivity.A07;
        AnonymousClass60U r62 = brazilFbPayHubActivity.A01;
        C118915vc r5 = brazilFbPayHubActivity.A08;
        C118515uo r12 = new C118515uo(brazilFbPayHubActivity, r62, brazilFbPayHubActivity.A03, r92, brazilFbPayHubActivity.A06, r82, r5, r102);
        this.A0M = r12;
        AnonymousClass5xG r63 = r12.A05;
        boolean A062 = r63.A00.A06();
        boolean z2 = false;
        C112785jQ r32 = (C112785jQ) r12.A08;
        if (A062) {
            r32.A02.setVisibility(0);
            if (r63.A01() == 1) {
                z2 = true;
            }
            r32.A07.setChecked(z2);
            r12.A00 = true;
        } else {
            r32.A02.setVisibility(8);
        }
        C110105dW.A0r(findViewById(R.id.change_pin), this, 17);
        C110105dW.A0r(this.A02, this, 18);
        this.A00 = findViewById(R.id.account_actions_container);
        this.A0N = brazilFbPayHubActivity.A0C;
        C110115dX.A0s(findViewById(R.id.delete_payments_account_action), this, 4);
        C110115dX.A0s(findViewById(R.id.request_dyi_report_action), this, 5);
    }

    public Dialog onCreateDialog(int i2) {
        return ((BrazilFbPayHubActivity) this).A0C.A01((Bundle) null, this, i2);
    }

    public Dialog onCreateDialog(int i2, Bundle bundle) {
        return ((BrazilFbPayHubActivity) this).A0C.A01(bundle, this, i2);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass60S r2 = this.A0O;
        C114615o3 r1 = r2.A02;
        if (r1 != null) {
            r1.A06(true);
        }
        r2.A02 = null;
        C41411vk r12 = r2.A00;
        if (r12 != null) {
            r2.A09.A03(r12);
        }
    }

    public void onResume() {
        super.onResume();
        this.A0O.A00(true);
        C118515uo r4 = this.A0M;
        boolean A032 = r4.A07.A03();
        boolean z2 = false;
        C112785jQ r2 = (C112785jQ) r4.A08;
        if (A032) {
            r2.A05.setVisibility(0);
            AnonymousClass5xG r1 = r4.A05;
            if (r1.A00.A06()) {
                r4.A00 = false;
                if (r1.A01() == 1) {
                    z2 = true;
                }
                r2.A07.setChecked(z2);
                r4.A00 = true;
                return;
            }
            return;
        }
        r2.A05.setVisibility(8);
    }
}
