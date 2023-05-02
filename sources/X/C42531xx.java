package X;

import com.whatsapp.util.Log;

/* renamed from: X.1xx  reason: invalid class name and case insensitive filesystem */
public class C42531xx extends C42541xy {
    public final /* synthetic */ C42511xv A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42531xx(C42511xv r2) {
        super((Runnable) null);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        boolean z2;
        boolean z3;
        AnonymousClass160 r5 = this.A00.A01;
        boolean A0H = r5.A0H() & true;
        C16800tf A02 = r5.A00.A02();
        try {
            int A01 = A02.A02.A01("contacts", (String) null, (String[]) null);
            if (A01 >= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("PAY: PaymentStore removeAllContacts deleted num rows: ");
                sb.append(A01);
                Log.i(sb.toString());
                z2 = true;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("PAY: PaymentStore removeAllContacts could not delete all rows: ");
                sb2.append(A01);
                Log.w(sb2.toString());
                z2 = false;
            }
            A02.close();
            boolean z4 = A0H & z2;
            A02 = r5.A00.A02();
            int A012 = A02.A02.A01("tmp_transactions", (String) null, (String[]) null);
            if (A012 >= 0) {
                z3 = true;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("PAY: PaymentStore removeAllPaymentTransactionTmpInfo could not delete all rows: ");
                sb3.append(A012);
                Log.w(sb3.toString());
                z3 = false;
            }
            A02.close();
            return Boolean.valueOf(z4 & z3);
        } catch (Throwable unused) {
        }
        throw th;
    }
}
