package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.redex.IDxCListenerShape9S1100000_3_I1;
import com.obwhatsapp.CopyableTextView;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import java.util.LinkedList;
import java.util.Locale;

/* renamed from: X.5jq  reason: invalid class name and case insensitive filesystem */
public abstract class C112865jq extends C112975ky {
    public FrameLayout A00;
    public C16460t6 A01;
    public C1204661t A02;
    public C18340wX A03;
    public AnonymousClass108 A04;
    public C18300wT A05;
    public C18310wU A06;
    public AnonymousClass5xE A07;
    public C18320wV A08;
    public C118335uW A09;
    public C110455e9 A0A;
    public C110355dy A0B;
    public C18280wR A0C;
    public final AnonymousClass1Vo A0D = C110105dW.A0Q("PaymentCardDetailsActivity", "payment-settings");

    /* renamed from: $r8$lambda$rJ2o3D1V-bcWlEow1OVbGiYlgCs  reason: not valid java name */
    public static /* synthetic */ void m15$r8$lambda$rJ2o3D1VbcWlEow1OVbGiYlgCs(View view) {
    }

    public static /* synthetic */ void lambda$verifyCardPhoenixFlowOnClickListener$0(View view) {
    }

    public void A38(C30671cl r4, boolean z2) {
        super.A38(r4, z2);
        C35391lr r2 = (C35391lr) r4;
        AnonymousClass00B.A06(r2);
        this.A02.setText(C119405xi.A02(this, r2));
        C39901tF r0 = r2.A08;
        if (r0 != null) {
            boolean A092 = r0.A09();
            CopyableTextView copyableTextView = this.A03;
            if (!A092) {
                copyableTextView.setText(R.string.str0f80);
                this.A03.A03 = null;
                A3A();
            } else {
                copyableTextView.setVisibility(8);
            }
        }
        C39901tF r02 = r4.A08;
        AnonymousClass00B.A06(r02);
        if (r02.A09()) {
            C110455e9 r03 = this.A0A;
            if (r03 != null) {
                r03.setVisibility(8);
                C110355dy r1 = this.A0B;
                if (r1 != null) {
                    r1.setBottomDividerSpaceVisibility(0);
                }
            }
            this.A03.setVisibility(8);
        }
    }

    public void A3A() {
        A3B(1);
        if (this.A0A != null) {
            boolean A0C2 = this.A0C.A0C(1927);
            this.A0A.setAlertButtonClickListener(new IDxCListenerShape9S1100000_3_I1(A0C2 ? 1 : 0, this.A08.A0A, this));
        }
    }

    public final void A3B(int i2) {
        this.A0A = new C110455e9(this);
        this.A00.removeAllViews();
        this.A00.addView(this.A0A);
        C110355dy r0 = this.A0B;
        if (r0 != null) {
            r0.setBottomDividerSpaceVisibility(8);
            this.A0A.setTopDividerVisibility(8);
        }
        this.A0A.setAlertType(i2);
    }

    public void A3C(AnonymousClass1TV r5, String str, String str2) {
        C18310wU r3 = this.A06;
        LinkedList linkedList = new LinkedList();
        C110105dW.A1P("action", "edit-default-credential", linkedList);
        C110105dW.A1P("credential-id", str, linkedList);
        C110105dW.A1P("version", "2", linkedList);
        if (!TextUtils.isEmpty(str2)) {
            C110105dW.A1P("payment-type", str2.toUpperCase(Locale.US), linkedList);
        }
        r3.A0B(r5, C110105dW.A0V(linkedList));
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1) {
            this.A0D.A06("onActivityResult 1");
            this.A0G.Acl(new AnonymousClass64Z(this));
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    public void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0B(R.string.str0f46);
            boolean z2 = this instanceof BrazilPaymentCardDetailsActivity;
            C005402i x3 = x();
            if (z2) {
                if (x3 != null) {
                    x3.A0N(true);
                    int currentContentInsetRight = this.A0F.getCurrentContentInsetRight();
                    this.A0F.A0B(A35(R.style.style040d), currentContentInsetRight);
                }
                i2 = A35(R.style.style03cc);
            } else {
                if (x3 != null) {
                    x3.A0N(true);
                    int currentContentInsetRight2 = this.A0F.getCurrentContentInsetRight();
                    this.A0F.A0B(A35(R.style.style040d), currentContentInsetRight2);
                }
                i2 = 0;
            }
            this.A0F.A0B(this.A0F.getCurrentContentInsetLeft(), i2);
        }
        this.A00 = (FrameLayout) findViewById(R.id.method_details_alert_container);
    }
}
