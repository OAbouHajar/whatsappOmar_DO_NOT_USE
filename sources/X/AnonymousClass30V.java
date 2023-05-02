package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape3S0110000_I1;
import com.obwhatsapp.R;

/* renamed from: X.30V  reason: invalid class name */
public class AnonymousClass30V extends C30011bb {
    public AnonymousClass15Z A00;
    public AnonymousClass11R A01;
    public boolean A02;
    public final TextView A03;

    public AnonymousClass30V(Context context, AnonymousClass1YG r3, C40281tr r4) {
        super(context, r3, r4);
        A0g();
        setClickable(false);
        setLongClickable(false);
        TextView A0L = C13680ns.A0L(this, R.id.info);
        this.A03 = A0L;
        C30011bb.A0E(context, A0L, this);
        A1M();
    }

    public void A0g() {
        if (!this.A02) {
            this.A02 = true;
            C52652eD A07 = C30011bb.A07(this);
            C16150sX A06 = C30011bb.A06(A07, this);
            C49132Rg A05 = C30011bb.A05(A06, A07, this, C30011bb.A0C(A06, this));
            C30011bb.A0S(A06, this, C30011bb.A0B(A05, A06, this));
            C30011bb.A0Q(A06, this);
            C30011bb.A0O(A05, A06, C30011bb.A08(A06, this), this);
            C30011bb.A0M(A05, A06, A07, this, A06.A4p);
            C30011bb.A0R(A06, this);
            this.A00 = (AnonymousClass15Z) A06.AOg.get();
            this.A01 = (AnonymousClass11R) A06.A4a.get();
        }
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A1M();
        }
    }

    public void A1M() {
        C15830rv r2;
        C40281tr r3 = (C40281tr) this.A0O;
        C16040sK r22 = this.A0L;
        if (r3.A00 == 2) {
            r2 = r3.A11.A00;
        } else {
            r22.A0B();
            r2 = r22.A05;
        }
        AnonymousClass00B.A06(r2);
        boolean A012 = AnonymousClass2BX.A01(this.A0L, this.A01);
        String A05 = this.A00.A05(r2, r3.A00, A012);
        Drawable A032 = C30011bb.A03(this);
        TextView textView = this.A03;
        textView.setText(C56522nn.A00(textView.getPaint(), A032, A05));
        textView.setOnClickListener(new ViewOnClickCListenerShape3S0110000_I1(this, 1, A012));
    }

    public int getCenteredLayoutId() {
        return R.layout.layout018a;
    }

    public C40281tr getFMessage() {
        return (C40281tr) this.A0O;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout018a;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout018a;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C40281tr);
        this.A0O = r2;
    }
}
