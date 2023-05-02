package X;

import java.util.List;

/* renamed from: X.64w  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1212764w implements Runnable {
    public final /* synthetic */ C110655eb A00;

    public /* synthetic */ C1212764w(C110655eb r1) {
        this.A00 = r1;
    }

    public final void run() {
        C35441lw r6;
        C110655eb r8 = this.A00;
        AnonymousClass160 r1 = r8.A0I;
        if (r1.A09().size() > 0 && (r6 = (C35441lw) r1.A09().get(0)) != null) {
            List A0D = r1.A0D();
            Integer[] numArr = new Integer[1];
            AnonymousClass000.A1M(numArr, 300, 0);
            r8.A09.A0K(new C1216866l(r6, r8, A0D, r8.A0G.A0c(new Integer[0], numArr, 3)));
        }
    }
}
