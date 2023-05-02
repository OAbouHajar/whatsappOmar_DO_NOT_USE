package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5iM  reason: invalid class name and case insensitive filesystem */
public class C112355iM extends C116635rh {
    public final Context A00;
    public final C16300so A01;
    public final C14870pt A02;
    public final C17190ug A03;
    public final AnonymousClass60V A04;
    public final C18340wX A05;
    public final C112265iD A06;
    public final C18280wR A07;
    public final AnonymousClass1HB A08;

    public C112355iM(Context context, C16300so r2, C14870pt r3, C17190ug r4, AnonymousClass60V r5, C18340wX r6, AnonymousClass4XO r7, C18310wU r8, C112265iD r9, C18280wR r10, AnonymousClass1HB r11) {
        super(r7, r8);
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A07 = r10;
        this.A08 = r11;
        this.A06 = r9;
        this.A05 = r6;
        this.A04 = r5;
    }

    public static final void A00(C30671cl r2, HashMap hashMap, List list) {
        String A002;
        if (!(hashMap == null || (A002 = C119365wy.A00("MPIN", hashMap)) == null)) {
            C110105dW.A1R("mpin", A002, list);
        }
        if (r2 != null) {
            C110105dW.A1R("credential-id", r2.A0A, list);
            C111805hR r0 = (C111805hR) r2.A08;
            if (r0 != null) {
                C35301lh r1 = r0.A06;
                if (!C39841t9.A04(r1)) {
                    C110105dW.A1R("upi-bank-info", (String) C110105dW.A0d(r1), list);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass5xB r9, X.C111855hW r10, java.lang.String r11, java.util.List r12, boolean r13) {
        /*
            X.5xC r2 = r10.A0B
            if (r2 == 0) goto L_0x00c5
            long r0 = r2.A02
            r7 = 1000(0x3e8, double:4.94E-321)
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0019
            long r0 = r0 / r7
            java.lang.String r4 = "start-ts"
            X.1lL r3 = new X.1lL
            r3.<init>((java.lang.String) r4, (long) r0)
            r12.add(r3)
        L_0x0019:
            long r0 = r2.A01
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x002a
            long r0 = r0 / r7
            java.lang.String r4 = "end-ts"
            X.1lL r3 = new X.1lL
            r3.<init>((java.lang.String) r4, (long) r0)
            r12.add(r3)
        L_0x002a:
            java.lang.String r1 = r2.A0F
            if (r1 == 0) goto L_0x0033
            java.lang.String r0 = "amount-rule"
            X.C110105dW.A1R(r0, r1, r12)
        L_0x0033:
            java.lang.String r1 = r2.A0E
            if (r1 == 0) goto L_0x003c
            java.lang.String r0 = "frequency-rule"
            X.C110105dW.A1R(r0, r1, r12)
        L_0x003c:
            X.1lh r1 = r2.A07
            boolean r0 = X.C39841t9.A04(r1)
            if (r0 != 0) goto L_0x004f
            java.lang.Object r1 = X.C110105dW.A0d(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "mandate-name"
            X.C110105dW.A1R(r0, r1, r12)
        L_0x004f:
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x00d0
            java.lang.String r1 = "1"
        L_0x0055:
            java.lang.String r0 = "is-revocable"
            X.C110105dW.A1R(r0, r1, r12)
            java.lang.String r3 = "seq-no"
            if (r11 == 0) goto L_0x00c6
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r3, (java.lang.String) r11)
        L_0x0063:
            r12.add(r1)
        L_0x0066:
            if (r9 == 0) goto L_0x0081
            boolean r0 = r9.A01()
            if (r0 == 0) goto L_0x0081
            X.1lh r1 = r9.A02
            boolean r0 = X.C39841t9.A03(r1)
            if (r0 != 0) goto L_0x0081
            java.lang.Object r1 = X.C110105dW.A0d(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "mandate-update-info"
            X.C110105dW.A1R(r0, r1, r12)
        L_0x0081:
            if (r13 == 0) goto L_0x00c5
            java.lang.String r0 = r2.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0092
            java.lang.String r1 = r2.A0J
            java.lang.String r0 = "recurrence-rule"
            X.C110105dW.A1R(r0, r1, r12)
        L_0x0092:
            java.lang.String r0 = r2.A0I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a1
            java.lang.String r1 = r2.A0I
            java.lang.String r0 = "recurrence-day"
            X.C110105dW.A1R(r0, r1, r12)
        L_0x00a1:
            X.1lh r0 = r2.A0A
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r0.A00
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00bc
            X.1lh r0 = r2.A0A
            java.lang.Object r1 = X.C110105dW.A0d(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "purpose-code"
            X.C110105dW.A1R(r0, r1, r12)
        L_0x00bc:
            java.lang.String r1 = r10.A0H
            if (r1 == 0) goto L_0x00c5
            java.lang.String r0 = "mcc"
            X.C110105dW.A1R(r0, r1, r12)
        L_0x00c5:
            return
        L_0x00c6:
            java.lang.String r0 = r10.A0N
            if (r0 == 0) goto L_0x0066
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r3, (java.lang.String) r0)
            goto L_0x0063
        L_0x00d0:
            java.lang.String r1 = "0"
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112355iM.A01(X.5xB, X.5hW, java.lang.String, java.util.List, boolean):void");
    }

    public final void A02(AnonymousClass1Vt r5, List list) {
        C110105dW.A1R("id", r5.A0K, list);
        C110105dW.A1R("device-id", this.A07.A01(), list);
        C111855hW A0K = C110115dX.A0K(r5);
        AnonymousClass5xC r2 = A0K.A0B;
        AnonymousClass00B.A06(r2);
        C110105dW.A1R("sender-vpa", A0K.A0L, list);
        if (!TextUtils.isEmpty(A0K.A0M)) {
            C110105dW.A1R("sender-vpa-id", A0K.A0M, list);
        }
        C110105dW.A1R("receiver-vpa", A0K.A0J, list);
        if (!TextUtils.isEmpty(A0K.A0K)) {
            C110105dW.A1R("receiver-vpa-id", A0K.A0K, list);
        }
        if (!C39841t9.A03(r2.A08)) {
            C110105dW.A1R("mandate-no", (String) C110105dW.A0d(r2.A08), list);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C28371Vv[] A03(X.AnonymousClass1Vt r10) {
        /*
            r9 = this;
            java.util.ArrayList r1 = X.AnonymousClass000.A0u()
            X.1W2 r0 = r10.A0A
            if (r0 == 0) goto L_0x0070
            X.1lv r2 = r0.A01
            if (r2 == 0) goto L_0x0070
            X.0wU r3 = r9.A01
            int r0 = r2.A00()
            long r7 = (long) r0
            int r6 = r2.A00
            X.1Vz r4 = r2.A01
            java.lang.String r5 = "amount"
            X.1Vv r0 = r3.A05(r4, r5, r6, r7)
        L_0x001d:
            r1.add(r0)
        L_0x0020:
            X.1W2 r0 = r10.A0A
            X.5hW r0 = (X.C111855hW) r0
            X.5xC r2 = r0.A0B
            X.AnonymousClass00B.A06(r2)
            X.1lv r0 = r2.A05
            if (r0 == 0) goto L_0x0050
            X.0wU r3 = r9.A01
            int r0 = r0.A00()
            long r7 = (long) r0
            X.1lv r0 = r2.A05
            int r6 = r0.A00
            X.1Vz r4 = r0.A01
            java.lang.String r5 = "original-amount"
            X.1Vv r0 = r3.A05(r4, r5, r6, r7)
        L_0x0040:
            r1.add(r0)
        L_0x0043:
            int r0 = r1.size()
            X.1Vv[] r0 = new X.C28371Vv[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            X.1Vv[] r0 = (X.C28371Vv[]) r0
            return r0
        L_0x0050:
            X.1lh r2 = r2.A09
            boolean r0 = X.C39841t9.A04(r2)
            if (r0 != 0) goto L_0x0043
            java.lang.Object r2 = r2.A00
            java.lang.String r2 = (java.lang.String) r2
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r2)
            X.1Vz r4 = X.C35481m0.A05
            X.1Vy r3 = X.C110115dX.A0C(r4, r0)
            X.0wU r2 = r9.A01
            java.lang.String r0 = "original-amount"
            X.1Vv r0 = r2.A04(r4, r3, r0)
            goto L_0x0040
        L_0x0070:
            X.1Vy r4 = r10.A08
            if (r4 == 0) goto L_0x0020
            X.0wU r3 = r9.A01
            X.1Vz r2 = X.C35481m0.A05
            java.lang.String r0 = "amount"
            X.1Vv r0 = r3.A04(r2, r4, r0)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112355iM.A03(X.1Vt):X.1Vv[]");
    }
}
