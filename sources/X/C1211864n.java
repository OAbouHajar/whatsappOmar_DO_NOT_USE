package X;

import java.util.List;

/* renamed from: X.64n  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1211864n implements Runnable {
    public final /* synthetic */ C110745el A00;

    public /* synthetic */ C1211864n(C110745el r1) {
        this.A00 = r1;
    }

    public final void run() {
        C110745el r5 = this.A00;
        C221116r r8 = r5.A05;
        Integer[] numArr = new Integer[2];
        int A1W = C13690nt.A1W(numArr, 20);
        numArr[1] = 401;
        Integer[] numArr2 = new Integer[1];
        numArr2[A1W] = 40;
        List A0c = r8.A0c(numArr, numArr2, 3);
        Integer[] numArr3 = new Integer[2];
        AnonymousClass000.A1M(numArr3, 417, A1W);
        AnonymousClass000.A1M(numArr3, 418, 1);
        Integer[] numArr4 = new Integer[1];
        numArr4[A1W] = 40;
        r5.A04.A0K(new AnonymousClass66U(r5, A0c, r8.A0c(numArr3, numArr4, 3)));
    }
}
