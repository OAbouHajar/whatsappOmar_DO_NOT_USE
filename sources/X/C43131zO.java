package X;

import java.io.Closeable;

/* renamed from: X.1zO  reason: invalid class name and case insensitive filesystem */
public final class C43131zO implements Closeable {
    public final C43141zP A00;
    public final C43141zP A01;
    public final C43141zP A02;
    public final /* synthetic */ AnonymousClass1QX A03;

    public C43131zO(C43141zP r1, C43141zP r2, C43141zP r3, AnonymousClass1QX r4) {
        this.A03 = r4;
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public AnonymousClass4MR A00() {
        AnonymousClass1QX r4 = this.A03;
        String A002 = this.A02.A00();
        String A003 = this.A00.A00();
        C43141zP r0 = this.A01;
        return new AnonymousClass4MR(r4, A002, A003, r0 == null ? null : r0.A00());
    }

    public void close() {
        C30311c8.A04(this.A00);
        C30311c8.A04(this.A02);
        C30311c8.A04(this.A01);
    }
}
