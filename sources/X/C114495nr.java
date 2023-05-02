package X;

import com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5nr  reason: invalid class name and case insensitive filesystem */
public class C114495nr extends C16690tT {
    public final C117965tq A00;
    public final C118875vO A01;
    public final ArrayList A02;
    public final /* synthetic */ PaymentTransactionHistoryActivity A03;

    public C114495nr(C117965tq r2, PaymentTransactionHistoryActivity paymentTransactionHistoryActivity, C118875vO r4, ArrayList arrayList) {
        this.A03 = paymentTransactionHistoryActivity;
        this.A02 = arrayList != null ? C13680ns.A0n(arrayList) : null;
        this.A00 = r2;
        this.A01 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        if (X.C40661uU.A03(r3.A05, r3.A0J.A0J(r7), r2, true) != false) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r10) {
        /*
            r9 = this;
            com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity r3 = r9.A03
            X.0rv r0 = r3.A08
            if (r0 != 0) goto L_0x0112
            boolean r0 = r3.A0S
            r7 = 0
            r6 = 1
            if (r0 != 0) goto L_0x00c8
            X.0s5 r1 = r3.A06
            X.0s8 r0 = X.C15910s6.A0r
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x00c8
            X.1tL r1 = r3.A0W
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x002c
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x002c
            X.1tM r0 = r1.A00
            if (r0 != 0) goto L_0x002c
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x002c
            X.1lg r0 = r1.A01
            if (r0 == 0) goto L_0x00c8
        L_0x002c:
            r1.A05 = r7
            r1.A04 = r6
            X.0wS r0 = r3.A0C
            r0.A06()
            X.16r r0 = r0.A08
            java.util.List r5 = r0.A0W(r1)
        L_0x003b:
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            java.util.ArrayList r2 = r9.A02
            if (r2 == 0) goto L_0x00a9
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x00a9
            java.util.Iterator r8 = r5.iterator()
        L_0x004d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r7 = r8.next()
            X.1Vt r7 = (X.AnonymousClass1Vt) r7
            X.0t6 r0 = r3.A06
            X.0tZ r0 = r0.A0H(r7)
            if (r0 == 0) goto L_0x00a7
            java.lang.String r1 = r0.A0I()
        L_0x0065:
            X.013 r0 = r3.A05
            r6 = 1
            boolean r0 = X.C40661uU.A03(r0, r1, r2, r6)
            if (r0 != 0) goto L_0x008a
            X.15p r0 = r3.A0J
            java.lang.String r1 = r0.A0M(r7)
            X.013 r0 = r3.A05
            boolean r0 = X.C40661uU.A03(r0, r1, r2, r6)
            if (r0 != 0) goto L_0x008a
            X.15p r0 = r3.A0J
            java.lang.String r1 = r0.A0J(r7)
            X.013 r0 = r3.A05
            boolean r0 = X.C40661uU.A03(r0, r1, r2, r6)
            if (r0 == 0) goto L_0x008d
        L_0x008a:
            r4.add(r7)
        L_0x008d:
            X.0tU r0 = r9.A02
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x004d
            r4.clear()
            r4.addAll(r5)
        L_0x009b:
            X.5vO r0 = r9.A01
            java.util.List r1 = r0.A02(r4)
            X.01Q r0 = new X.01Q
            r0.<init>(r4, r1)
            return r0
        L_0x00a7:
            r1 = 0
            goto L_0x0065
        L_0x00a9:
            r4.addAll(r5)
            r1 = 1
            com.facebook.redex.IDxComparatorShape21S0000000_3_I1 r0 = new com.facebook.redex.IDxComparatorShape21S0000000_3_I1
            r0.<init>(r1)
            java.util.Collections.sort(r4, r0)
            boolean r0 = r3.A0T
            if (r0 != 0) goto L_0x009b
            boolean r0 = r3.A0O
            if (r0 != 0) goto L_0x009b
            X.0sq r1 = r3.A05
            X.65n r0 = new X.65n
            r0.<init>(r9, r5)
            r1.Acl(r0)
            goto L_0x009b
        L_0x00c8:
            boolean r0 = r3.A0R
            r4 = -1
            if (r0 == 0) goto L_0x00fa
            java.lang.Integer[] r5 = new java.lang.Integer[r6]
            r0 = 40
            X.AnonymousClass000.A1M(r5, r0, r7)
            boolean r2 = r3.A0Q
            r0 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            if (r2 == 0) goto L_0x00f2
            r0 = 20
            X.AnonymousClass000.A1M(r1, r0, r7)
            r0 = 401(0x191, float:5.62E-43)
        L_0x00e2:
            X.AnonymousClass000.A1M(r1, r0, r6)
            X.0wS r0 = r3.A0C
            r0.A06()
            X.16r r0 = r0.A08
            java.util.List r5 = r0.A0c(r1, r5, r4)
            goto L_0x003b
        L_0x00f2:
            r0 = 417(0x1a1, float:5.84E-43)
            X.AnonymousClass000.A1M(r1, r0, r7)
            r0 = 418(0x1a2, float:5.86E-43)
            goto L_0x00e2
        L_0x00fa:
            boolean r2 = r3.A0S
            X.0wS r0 = r3.A0C
            r0.A06()
            X.16r r1 = r0.A08
            if (r2 == 0) goto L_0x010b
            java.util.List r5 = r1.A0S(r4)
            goto L_0x003b
        L_0x010b:
            r0 = 0
            java.util.List r5 = r1.A0V(r0, r4)
            goto L_0x003b
        L_0x0112:
            X.0wS r0 = r3.A0C
            r0.A06()
            X.16r r2 = r0.A08
            X.0rv r1 = r3.A08
            r0 = -1
            java.util.List r5 = r2.A0V(r1, r0)
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114495nr.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass01Q r6 = (AnonymousClass01Q) obj;
        C117965tq r4 = this.A00;
        PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = this.A03;
        String str = paymentTransactionHistoryActivity.A0L;
        if (str == null) {
            str = "";
        }
        C39961tL r2 = paymentTransactionHistoryActivity.A0W;
        Object obj2 = r6.A00;
        AnonymousClass00B.A06(obj2);
        Object obj3 = r6.A01;
        AnonymousClass00B.A06(obj3);
        r4.A00(r2, str, (List) obj2, (List) obj3);
    }
}
