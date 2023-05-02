package X;

import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.60B  reason: invalid class name */
public class AnonymousClass60B implements C109285Rl {
    public final C14870pt A00;
    public final C17130ua A01;
    public final C16440t3 A02;
    public final AnonymousClass1GP A03;
    public final AnonymousClass175 A04;
    public final AnonymousClass17O A05;
    public final C18300wT A06;
    public final C18290wS A07;
    public final AnonymousClass5vX A08;

    public AnonymousClass60B(C14870pt r1, C17130ua r2, C16440t3 r3, AnonymousClass1GP r4, AnonymousClass175 r5, AnonymousClass17O r6, C18300wT r7, C18290wS r8, AnonymousClass5vX r9) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A06 = r7;
        this.A04 = r5;
        this.A08 = r9;
        this.A03 = r4;
        this.A05 = r6;
    }

    public void A4n(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30671cl A0F = C110115dX.A0F(it);
            int A042 = A0F.A04();
            if (!(A042 == 1 || A042 == 4)) {
                if (A042 == 5) {
                    AnonymousClass17O r1 = this.A05;
                    r1.A08(r1.A01("add_business"));
                } else if (!(A042 == 6 || A042 == 7)) {
                    Log.w(AnonymousClass000.A0g("PAY: Not supported method type for Brazil: ", A0F));
                }
            }
            AnonymousClass175 r12 = this.A04;
            r12.A08(r12.A01("add_card"));
        }
        this.A00.Acq(new RunnableRunnableShape11S0100000_I0_10((Object) this.A03, 12));
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30671cl A5L(X.C30671cl r7) {
        /*
            r6 = this;
            int r1 = r7.A04()
            r0 = 1
            if (r1 == r0) goto L_0x00f4
            r0 = 4
            if (r1 == r0) goto L_0x00f4
            r0 = 5
            if (r1 == r0) goto L_0x001d
            r0 = 6
            if (r1 == r0) goto L_0x00f4
            r0 = 7
            if (r1 == r0) goto L_0x00f4
            java.lang.String r0 = "PAY: method type not expected: "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)
        L_0x0019:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x001c:
            return r7
        L_0x001d:
            X.1tF r2 = r7.A08
            X.5hT r2 = (X.C111825hT) r2
            if (r2 == 0) goto L_0x00f0
            X.0wS r0 = r6.A07
            X.160 r1 = X.C110115dX.A0H(r0)
            java.lang.String r0 = r7.A0A
            X.1cl r4 = r1.A08(r0)
            if (r4 == 0) goto L_0x001c
            X.1tF r0 = r4.A08
            if (r0 == 0) goto L_0x001c
            r1 = r4
            X.1lw r1 = (X.C35441lw) r1
            X.2Ta r0 = new X.2Ta
            r0.<init>(r1)
            java.lang.String r3 = r0.A00()
            X.0wT r0 = r6.A06
            android.content.SharedPreferences$Editor r1 = X.C110105dW.A06(r0)
            java.lang.String r0 = "payment_merchant_previous_display_state"
            X.C13680ns.A0y(r1, r0, r3)
            X.1tF r3 = r4.A08
            X.1tI r3 = (X.C39931tI) r3
            java.lang.String r0 = r2.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = r3.A08
            r2.A08 = r0
        L_0x005c:
            java.lang.String r0 = r2.A0B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = r3.A0B
            r2.A0B = r0
        L_0x0068:
            java.lang.String r0 = r2.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = r3.A02
            r2.A02 = r0
        L_0x0074:
            java.lang.String r0 = r2.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0080
            java.lang.String r0 = r3.A05
            r2.A05 = r0
        L_0x0080:
            java.lang.String r0 = r2.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = r3.A06
            r2.A06 = r0
        L_0x008c:
            java.lang.String r0 = r2.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = r3.A0A
            r2.A0A = r0
        L_0x0098:
            boolean r0 = r3.A0D
            r2.A0D = r0
            boolean r0 = r3.A0E
            r2.A0E = r0
            java.lang.String r5 = r2.A06
            java.lang.String r4 = "ACTIVE"
            boolean r0 = r4.equals(r5)
            if (r0 == 0) goto L_0x00ce
            java.lang.String r1 = r3.A06
            java.lang.String r0 = "INITED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = "MERCHANT_LINKED"
        L_0x00b6:
            r2.A03 = r0
        L_0x00b8:
            java.lang.String r0 = r2.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r3.A07
            r2.A07 = r0
            return r7
        L_0x00c5:
            boolean r0 = r4.equals(r1)
            if (r0 != 0) goto L_0x00ce
            java.lang.String r0 = "MERCHANT_VERIFIED"
            goto L_0x00b6
        L_0x00ce:
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r3.A0C()
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "MERCHANT_VERIFICATION_FAILURE"
            goto L_0x00b6
        L_0x00dd:
            java.lang.String r1 = "EXTERNALLY_DISABLED"
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = r3.A06
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = "MERCHANT_DISABLED"
            goto L_0x00b6
        L_0x00f0:
            java.lang.String r0 = "PAY:BrazilPaymentStorageObserver/beforeMethodAdded: methodData is null"
            goto L_0x0019
        L_0x00f4:
            X.1tF r2 = r7.A08
            X.5hS r2 = (X.C111815hS) r2
            if (r2 == 0) goto L_0x001c
            java.lang.String r1 = r2.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x010e
            byte[] r0 = r7.A0D
            if (r0 == 0) goto L_0x010e
            X.0ua r0 = r6.A01
            byte[] r0 = X.C119405xi.A0A(r0, r1)
            r7.A0D = r0
        L_0x010e:
            X.0wS r0 = r6.A07
            X.160 r1 = X.C110115dX.A0H(r0)
            java.lang.String r0 = r7.A0A
            X.1cl r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x001c
            X.1tF r3 = r0.A08
            if (r3 == 0) goto L_0x001c
            X.5hS r3 = (X.C111815hS) r3
            X.0t3 r4 = r6.A02
            boolean r0 = r2.A0a
            if (r0 != 0) goto L_0x0130
            boolean r0 = r3.A0Q
            r2.A0Q = r0
            int r0 = r3.A02
            r2.A02 = r0
        L_0x0130:
            java.lang.String r0 = r2.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x013c
            java.lang.String r0 = r3.A06
            r2.A06 = r0
        L_0x013c:
            java.lang.String r0 = r2.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0148
            java.lang.String r0 = r3.A03
            r2.A03 = r0
        L_0x0148:
            java.lang.String r0 = r2.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0196
            java.lang.String r1 = r2.A0C
            java.lang.String r0 = r3.A0C
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0196
            r0 = 0
            r2.A0E = r0
        L_0x015d:
            r2.A0D = r0
        L_0x015f:
            java.lang.String r0 = r2.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x017b
            java.lang.String r1 = r2.A0J
            java.lang.String r0 = r3.A0J
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x017b
            long r0 = r4.A00()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A09 = r0
        L_0x017b:
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x0187
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x0187
            java.lang.String r0 = "PAYMENT_METHOD_VERIFIED"
            r2.A05 = r0
        L_0x0187:
            java.lang.String r0 = r2.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x001c
            X.5vX r1 = r6.A08
            r0 = 0
            r1.A01(r0, r7)
            return r7
        L_0x0196:
            java.lang.String r0 = r3.A0C
            r2.A0C = r0
            java.lang.String r0 = r2.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01a6
            java.lang.String r0 = r3.A0E
            r2.A0E = r0
        L_0x01a6:
            java.lang.String r0 = r2.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x015f
            java.lang.String r0 = r3.A0D
            goto L_0x015d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass60B.A5L(X.1cl):X.1cl");
    }
}
