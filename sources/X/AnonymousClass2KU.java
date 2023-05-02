package X;

import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.2KU  reason: invalid class name */
public final class AnonymousClass2KU extends C16690tT {
    public C16760tb A00;
    public WeakReference A01;
    public final long A02;
    public final C15830rv A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;

    public AnonymousClass2KU(C16760tb r2, C15830rv r3, Integer num, Runnable runnable, long j2, boolean z2, boolean z3) {
        this.A00 = r2;
        this.A01 = new WeakReference(runnable);
        this.A03 = r3;
        this.A06 = z2;
        this.A05 = z3;
        this.A02 = j2;
        this.A04 = num;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C16760tb r4 = this.A00;
        C15830rv r7 = this.A03;
        boolean z2 = this.A06;
        boolean z3 = this.A05;
        r4.A1H.A08(r7, (String) null, this.A04.intValue(), 4);
        r4.A0G.A00(r7, 4);
        C18930xU r3 = r4.A0I;
        Set A0G = r3.A0G(r7, !z2, z3);
        r4.A0e.A0S(r7, (Long) null, z2, z3);
        C42861yn.A00.put(r7, false);
        r3.A0V(A0G);
        C20260zl r5 = r4.A0z;
        C16320sq r8 = r4.A1Y;
        C42601y5.A01(r4.A0l, r5, r4.A10, r7, r8, 9, (Integer) null, 5);
        C14550pN.A0y(this.A02, 300);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Runnable runnable;
        WeakReference weakReference = this.A01;
        if (weakReference != null && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
    }
}
