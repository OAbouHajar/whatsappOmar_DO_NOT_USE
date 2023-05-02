package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.5GM  reason: invalid class name */
public final class AnonymousClass5GM extends C107205Gv implements AnonymousClass1UG, AnonymousClass1UH {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A04 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass5GM.class, Object.class, "_reusableCancellableContinuation");
    public Object A00 = C81984Ao.A01;
    public final Object A01;
    public final AnonymousClass1UG A02;
    public final C11340ia A03;
    public volatile /* synthetic */ Object _reusableCancellableContinuation;

    public AnonymousClass5GM(AnonymousClass1UG r4, C11340ia r5) {
        super(-1);
        this.A03 = r5;
        this.A02 = r4;
        Object fold = r4.AAx().fold(C13680ns.A0X(), C89804cx.A00);
        C18450wi.A0F(fold);
        this.A01 = fold;
        this._reusableCancellableContinuation = null;
    }

    public AnonymousClass1UH AAO() {
        AnonymousClass1UG r1 = this.A02;
        if (r1 instanceof AnonymousClass1UH) {
            return (AnonymousClass1UH) r1;
        }
        return null;
    }

    public AnonymousClass1UM AAx() {
        return this.A02.AAx();
    }

    public void Acd(Object obj) {
        AnonymousClass1UM AAx;
        Object A002;
        AnonymousClass1UG r8 = this.A02;
        AnonymousClass1UM AAx2 = r8.AAx();
        Object obj2 = obj;
        Throwable A003 = C41201vP.A00(obj);
        if (A003 != null) {
            obj2 = new C90034dO(A003, false);
        }
        C11340ia r1 = this.A03;
        if (r1.A03(AAx2)) {
            this.A00 = obj2;
            this.A00 = 0;
            r1.A05(this, AAx2);
            return;
        }
        AnonymousClass5GR A004 = C89704cl.A00();
        long j2 = A004.A00;
        if (j2 >= 4294967296L) {
            this.A00 = obj2;
            this.A00 = 0;
            A004.A09(this);
            return;
        }
        A004.A00 = j2 + 4294967296L;
        try {
            AAx = r8.AAx();
            A002 = C89804cx.A00(this.A01, AAx);
            r8.Acd(obj);
            C89804cx.A01(A002, AAx);
            do {
            } while (A004.A0B());
        } catch (Throwable th) {
            try {
                A01(th, (Throwable) null);
            } catch (Throwable th2) {
                A004.A07();
                throw th2;
            }
        }
        A004.A07();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("DispatchedContinuation[");
        A0r.append(this.A03);
        A0r.append(", ");
        A0r.append(AnonymousClass486.A00(this.A02));
        return AnonymousClass3K2.A0m(A0r);
    }
}
