package X;

import android.content.Context;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.Conversation;

/* renamed from: X.30S  reason: invalid class name */
public class AnonymousClass30S extends C30011bb {
    public AnonymousClass15Z A00;
    public boolean A01;
    public final TextView A02;

    public AnonymousClass30S(Context context, AnonymousClass1YG r4, AnonymousClass1WU r5) {
        super(context, r4, r5);
        A0g();
        setClickable(false);
        setLongClickable(false);
        TextView A0L = C13680ns.A0L(this, R.id.info);
        this.A02 = A0L;
        A0L.setBackgroundResource(R.drawable.date_balloon);
        Conversation.tvBalloons(A0L);
        A0L.setTextSize(getDividerFontSize());
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

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r5.A0L.A0I(r1) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1M() {
        /*
            r5 = this;
            X.0tZ r4 = r5.A0O
            X.1WU r4 = (X.AnonymousClass1WU) r4
            boolean r0 = r4.A12()
            r2 = 0
            if (r0 == 0) goto L_0x001a
            X.0rv r1 = r4.A0B()
            if (r1 == 0) goto L_0x001a
            X.0sK r0 = r5.A0L
            boolean r0 = r0.A0I(r1)
            r3 = 1
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            X.15Z r0 = r5.A00
            java.lang.String r0 = r0.A0C(r4, r2)
            android.widget.TextView r2 = r5.A02
            r2.setText(r0)
            r1 = 0
            com.facebook.redex.ViewOnClickCListenerShape3S0110000_I1 r0 = new com.facebook.redex.ViewOnClickCListenerShape3S0110000_I1
            r0.<init>(r5, r1, r3)
            r2.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30S.A1M():void");
    }

    public int getCenteredLayoutId() {
        return R.layout.layout018a;
    }

    public C40291ts getFMessage() {
        return (C40291ts) this.A0O;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout018a;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout018a;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C40291ts);
        this.A0O = r2;
    }
}
