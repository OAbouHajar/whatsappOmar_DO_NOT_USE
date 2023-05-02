package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.5o5  reason: invalid class name and case insensitive filesystem */
public class C114625o5 extends C16690tT {
    public final C28381Vw A00;
    public final String A01;
    public final boolean A02;
    public final /* synthetic */ C110755em A03;

    public C114625o5(C110755em r1, C28381Vw r2, String str, boolean z2) {
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = str;
        this.A02 = z2;
    }

    public void A05() {
        if (this.A02) {
            this.A03.A0S(false);
        }
        this.A03.A06 = null;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return A0B();
    }

    public void A09() {
        if (this.A02) {
            this.A03.A0S(true);
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass1W2 r0;
        C117415sx r02;
        AnonymousClass1Vt r2;
        C117415sx r13 = (C117415sx) obj;
        C110755em r3 = this.A03;
        AnonymousClass1Vo r4 = r3.A0f;
        StringBuilder A0r = AnonymousClass000.A0r("onTransactionDetailData loaded: ");
        A0r.append(AnonymousClass000.A1V(r13));
        C110105dW.A1L(r4, A0r);
        if (r13.A01 == null) {
            r4.A06("onTransactionDetailData transactionInfo is null");
            r3.A09.A0B(C117725tS.A00(18));
        } else {
            if (this.A02) {
                r3.A0S(false);
            }
            if ("native".equals(r3.A0B)) {
                r3.A0j.Acl(new AnonymousClass667(this, r13));
                if (r13.A02 != null) {
                    r3.A09.A0B(C117725tS.A00(3));
                }
            }
            if (r3 instanceof C114175nF) {
                C114175nF r42 = (C114175nF) r3;
                r42.A07 = r13;
                AnonymousClass1Vt r22 = r13.A01;
                if (r22.A03 == 1000 || (!r22.A0E() && r42.A07.A01.A0H() && !TextUtils.isEmpty(r42.A07.A01.A0K))) {
                    r42.A0V();
                } else {
                    r42.A0B();
                    int i2 = r22.A03;
                    if ((i2 == 20 || i2 == 40) && (r0 = r22.A0A) != null) {
                        Boolean bool = Boolean.TRUE;
                        if (!(bool.equals(r0.A03) || (r02 = r42.A07) == null || (r2 = r02.A01) == null)) {
                            AnonymousClass1Vt r5 = new AnonymousClass1Vt(r2.A0G, r2.A03, r2.A04, r2.A01, r2.A05);
                            AnonymousClass1W2 r03 = r2.A0A;
                            r5.A0A = r03;
                            if (r03 != null) {
                                r03.A03 = bool;
                                r42.A0j.Acl(new C1215866b(r5, r2, r42));
                            }
                        }
                    }
                    AnonymousClass027 r23 = r42.A02;
                    List list = (List) r23.A01();
                    if (list != null) {
                        list.clear();
                    }
                    C117415sx r04 = r42.A07;
                    if (!(r04 == null || r04.A01 == null)) {
                        r42.A0I(list);
                        r23.A0B(list);
                    }
                }
            } else {
                r3.A07 = r13;
                if (r3.A0b.A05()) {
                    C17150uc r24 = r3.A0J;
                    C16040sK r05 = r3.A0I;
                    r05.A0B();
                    r24.A03(new C119815zf(r3), r05.A05);
                } else {
                    r3.A0D();
                }
            }
            r3.A0C();
        }
        r3.A06 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r3 == null) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C117415sx A0B() {
        /*
            r8 = this;
            X.5em r2 = r8.A03
            X.16r r3 = r2.A0T
            X.1Vw r0 = r8.A00
            r6 = 0
            if (r0 != 0) goto L_0x0067
            r1 = r6
        L_0x000a:
            java.lang.String r0 = r8.A01
            X.1Vt r4 = r3.A0M(r1, r0)
            if (r4 == 0) goto L_0x007e
            int r1 = r4.A03
            r0 = 9
            if (r1 != r0) goto L_0x0037
            X.1W2 r0 = r4.A0A
            if (r0 == 0) goto L_0x0037
            X.1lz r0 = r0.A00
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0037
            X.1W2 r0 = r4.A0A
            X.1lz r0 = r0.A00
            java.lang.String r0 = r0.A03
            X.AnonymousClass00B.A06(r0)
            X.1Vt r0 = r3.A0L(r0)
            r2.A04 = r0
        L_0x0037:
            r7 = 1
            java.lang.String r0 = r4.A0H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0065
            X.160 r1 = r2.A0V
            java.lang.String r0 = r4.A0H
            X.1cl r3 = r1.A08(r0)
            if (r3 != 0) goto L_0x006a
        L_0x004a:
            java.util.ArrayList r0 = r4.A0N
            if (r0 == 0) goto L_0x006a
            java.util.Iterator r1 = r0.iterator()
        L_0x0052:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r1.next()
            X.1ls r0 = (X.C35401ls) r0
            X.1cl r0 = r0.A01
            if (r0 == 0) goto L_0x0052
            r7 = 0
            r3 = r0
            goto L_0x0052
        L_0x0065:
            r3 = r6
            goto L_0x004a
        L_0x0067:
            java.lang.String r1 = r0.A01
            goto L_0x000a
        L_0x006a:
            X.1W2 r0 = r4.A0A
            if (r0 == 0) goto L_0x0080
            X.1lu r0 = r0.A02
            if (r0 == 0) goto L_0x0080
            X.0vO r1 = r2.A0S
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.A02
            X.0ti r6 = r1.A00(r0)
            goto L_0x0080
        L_0x007e:
            r3 = r6
            r7 = 1
        L_0x0080:
            X.0t6 r0 = r2.A0R
            X.0tZ r5 = r0.A0H(r4)
            X.5sx r2 = new X.5sx
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114625o5.A0B():X.5sx");
    }
}
