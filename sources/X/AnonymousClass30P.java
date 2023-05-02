package X;

import android.content.Context;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.30P  reason: invalid class name */
public class AnonymousClass30P extends C30011bb {
    public boolean A00;
    public final TextView A01;

    public AnonymousClass30P(Context context, AnonymousClass1YG r4, C38771rO r5) {
        super(context, r4, r5);
        A0g();
        setClickable(false);
        TextView A0M = C13680ns.A0M(this, R.id.info);
        this.A01 = A0M;
        C30011bb.A0E(context, A0M, this);
        C30011bb.A0K(A0M, this);
        setLongClickable(true);
        setWillNotDraw(false);
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

    public void A0t() {
        A1M();
        A1J(false);
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A1M();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (((X.C37831po) r1.get(0)).A0C() == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1M() {
        /*
            r10 = this;
            X.0tZ r7 = r10.A0O
            X.1rO r7 = (X.C38771rO) r7
            X.0pd r2 = r10.A0M
            r1 = 2536(0x9e8, float:3.554E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r3 = 1
            r9 = 0
            if (r0 == 0) goto L_0x0027
            java.util.List r1 = r7.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0027
            java.lang.Object r0 = r1.get(r9)
            X.1po r0 = (X.C37831po) r0
            boolean r0 = r0.A0C()
            r2 = 1
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            int r1 = r7.A15()
            if (r1 == 0) goto L_0x009e
            if (r1 == r3) goto L_0x0095
            r0 = 2
            if (r1 == r0) goto L_0x008c
            r8 = 2131892681(0x7f1219c9, float:1.9420117E38)
            if (r2 == 0) goto L_0x003b
            r8 = 2131887907(0x7f120723, float:1.9410434E38)
        L_0x003b:
            X.0t3 r2 = r10.A0r
            long r0 = r7.A0I
            long r1 = r2.A02(r0)
            android.widget.TextView r4 = r10.A01
            X.013 r6 = r10.A0K
            android.content.Context r5 = r10.getContext()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            X.013 r0 = r10.A0K
            java.lang.String r0 = X.C47672Jx.A00(r0, r1)
            java.lang.String r0 = X.C13680ns.A0d(r5, r0, r3, r9, r8)
            java.lang.String r0 = X.C47672Jx.A01(r6, r0, r1)
            r4.setText(r0)
            r0 = 46
            X.C13680ns.A1B(r4, r10, r7, r0)
            X.013 r3 = r10.A0K
            android.content.Context r2 = r10.getContext()
            boolean r0 = r7.A16()
            r1 = 2131231754(0x7f08040a, float:1.8079598E38)
            if (r0 == 0) goto L_0x0075
            r1 = 2131232186(0x7f0805ba, float:1.8080474E38)
        L_0x0075:
            r0 = 2131101016(0x7f060558, float:1.781443E38)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass2SR.A02(r2, r1, r0)
            boolean r0 = r3.A0T()
            r1 = 0
            if (r0 == 0) goto L_0x00a7
            X.25m r0 = new X.25m
            r0.<init>(r2, r3)
            r4.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r0, r1)
            return
        L_0x008c:
            r8 = 2131892821(0x7f121a55, float:1.9420401E38)
            if (r2 == 0) goto L_0x003b
            r8 = 2131887909(0x7f120725, float:1.9410438E38)
            goto L_0x003b
        L_0x0095:
            r8 = 2131892678(0x7f1219c6, float:1.9420111E38)
            if (r2 == 0) goto L_0x003b
            r8 = 2131887906(0x7f120722, float:1.9410432E38)
            goto L_0x003b
        L_0x009e:
            r8 = 2131892819(0x7f121a53, float:1.9420397E38)
            if (r2 == 0) goto L_0x003b
            r8 = 2131887908(0x7f120724, float:1.9410436E38)
            goto L_0x003b
        L_0x00a7:
            r4.setCompoundDrawablesWithIntrinsicBounds(r2, r1, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30P.A1M():void");
    }

    public int getCenteredLayoutId() {
        return R.layout.layout018a;
    }

    public C38771rO getFMessage() {
        return (C38771rO) this.A0O;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout018a;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout018a;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C38771rO);
        this.A0O = r2;
    }
}
