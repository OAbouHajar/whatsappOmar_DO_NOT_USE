package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.30T  reason: invalid class name */
public class AnonymousClass30T extends C30011bb {
    public boolean A00;
    public final TextView A01;
    public final AnonymousClass02C A02;

    public AnonymousClass30T(Context context, AnonymousClass02C r4, AnonymousClass1YG r5, AnonymousClass1WU r6) {
        super(context, r5, r6);
        A0g();
        this.A02 = r4;
        setClickable(false);
        setLongClickable(false);
        TextView A0L = C13680ns.A0L(getRootView(), R.id.info);
        this.A01 = A0L;
        C30011bb.A0E(context, A0L, this);
        A1M();
    }

    public void A0g() {
        if (!this.A00) {
            this.A00 = true;
            C52652eD A07 = C30011bb.A07(this);
            C16150sX A06 = C30011bb.A06(A07, this);
            C49132Rg A05 = C30011bb.A05(A06, A07, this, C30011bb.A0C(A06, this));
            C30011bb.A0S(A06, this, C30011bb.A0B(A05, A06, this));
            C30011bb.A0Q(A06, this);
            C30011bb.A0O(A05, A06, C30011bb.A08(A06, this), this);
            C30011bb.A0M(A05, A06, A07, this, A06.A4p);
            C30011bb.A0R(A06, this);
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
        String string = getContext().getString(R.string.str0c08);
        Drawable A03 = C30011bb.A03(this);
        TextView textView = this.A01;
        textView.setText(C56522nn.A00(textView.getPaint(), A03, string));
        C13680ns.A17(textView, this, 18);
    }

    public int getCenteredLayoutId() {
        return R.layout.layout018a;
    }

    public C40401u3 getFMessage() {
        return (C40401u3) this.A0O;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout018a;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout018a;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C40401u3);
        this.A0O = r2;
    }
}
