package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.30U  reason: invalid class name */
public class AnonymousClass30U extends C30011bb {
    public AnonymousClass15Z A00;
    public boolean A01;
    public final TextView A02;

    public AnonymousClass30U(Context context, AnonymousClass1YG r3, C38971ri r4) {
        super(context, r3, r4);
        A0g();
        setClickable(false);
        setLongClickable(false);
        TextView A0M = C13680ns.A0M(this, R.id.info);
        this.A02 = A0M;
        C30011bb.A0E(context, A0M, this);
        A1M();
    }

    public void A0g() {
        if (!this.A01) {
            this.A01 = true;
            C52652eD A07 = C30011bb.A07(this);
            C16150sX A06 = C30011bb.A06(A07, this);
            C49132Rg A05 = C30011bb.A05(A06, A07, this, C30011bb.A0C(A06, this));
            C30011bb.A0S(A06, this, C30011bb.A0B(A05, A06, this));
            C30011bb.A0Q(A06, this);
            C30011bb.A0O(A05, A06, C30011bb.A08(A06, this), this);
            C30011bb.A0M(A05, A06, A07, this, A06.A4p);
            C30011bb.A0R(A06, this);
            this.A00 = (AnonymousClass15Z) A06.AOg.get();
        }
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A1M();
        }
    }

    public final void A1M() {
        C15830rv r2;
        C38971ri r4 = (C38971ri) this.A0O;
        AnonymousClass15Z r3 = this.A00;
        C28381Vw r1 = r4.A11;
        if (r1.A02) {
            C16040sK r0 = this.A0L;
            r0.A0B();
            r2 = r0.A05;
        } else {
            r2 = r1.A00;
        }
        String A06 = r3.A06(r2, r4.A00, true);
        Drawable A03 = C30011bb.A03(this);
        TextView textView = this.A02;
        textView.setText(C56522nn.A00(textView.getPaint(), A03, A06));
        C13680ns.A17(textView, this, 19);
    }

    public int getCenteredLayoutId() {
        return R.layout.layout018a;
    }

    public C38971ri getFMessage() {
        return (C38971ri) this.A0O;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout018a;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout018a;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C38971ri);
        this.A0O = r2;
    }
}
