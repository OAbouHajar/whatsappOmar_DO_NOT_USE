package X;

import com.obwhatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;

/* renamed from: X.5nl  reason: invalid class name and case insensitive filesystem */
public class C114435nl extends C16690tT {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IndiaUpiBankAccountDetailsActivity A01;
    public final /* synthetic */ Runnable A02;

    public C114435nl(IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity, Runnable runnable, int i2) {
        this.A01 = indiaUpiBankAccountDetailsActivity;
        this.A00 = i2;
        this.A02 = runnable;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = this.A01;
        C18290wS r0 = indiaUpiBankAccountDetailsActivity.A0C;
        r0.A06();
        C221116r r5 = r0.A08;
        Integer[] numArr = new Integer[2];
        boolean A1W = C13690nt.A1W(numArr, 417);
        numArr[1] = 418;
        Integer[] numArr2 = new Integer[1];
        AnonymousClass000.A1M(numArr2, 40, A1W ? 1 : 0);
        if (r5.A0X(indiaUpiBankAccountDetailsActivity.A00.A0A, numArr, numArr2, 1).size() > 0) {
            A1W = true;
        }
        return Boolean.valueOf(A1W);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        if (AnonymousClass000.A1X(obj)) {
            AnonymousClass29T.A01(this.A01, this.A00);
        } else {
            this.A02.run();
        }
    }
}
