package X;

import java.util.List;

/* renamed from: X.66N  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66N implements Runnable {
    public final /* synthetic */ AnonymousClass5kl A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ AnonymousClass66N(AnonymousClass5kl r1, Runnable runnable, boolean z2) {
        this.A00 = r1;
        this.A02 = z2;
        this.A01 = runnable;
    }

    public final void run() {
        AnonymousClass5kl r4 = this.A00;
        boolean z2 = this.A02;
        Runnable runnable = this.A01;
        List A0B = r4.A03.A0B();
        r4.A0D = A0B;
        r4.A02 = AnonymousClass160.A01(A0B);
        r4.A05.A0K(new AnonymousClass66O(r4, runnable, z2));
    }
}
