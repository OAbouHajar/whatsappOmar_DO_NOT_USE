package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Po  reason: invalid class name and case insensitive filesystem */
public class C05170Po {
    public final /* synthetic */ AnonymousClass05g A00;
    public final /* synthetic */ AnonymousClass05h A01;
    public final /* synthetic */ AnonymousClass025 A02;
    public final /* synthetic */ AnonymousClass01A A03;
    public final /* synthetic */ AtomicReference A04;

    public C05170Po(AnonymousClass05g r1, AnonymousClass05h r2, AnonymousClass025 r3, AnonymousClass01A r4, AtomicReference atomicReference) {
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = atomicReference;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass01A r5 = this.A03;
        StringBuilder A0r = AnonymousClass000.A0r("fragment_");
        A0r.append(r5.A0T);
        A0r.append("_rq#");
        String A0l = AnonymousClass000.A0l(A0r, r5.A0l.getAndIncrement());
        this.A04.set(((AnonymousClass05R) this.A02.apply((Object) null)).A01(this.A00, this.A01, r5, A0l));
    }
}
