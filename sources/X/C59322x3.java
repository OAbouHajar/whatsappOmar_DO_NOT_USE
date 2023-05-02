package X;

import java.util.Collection;

/* renamed from: X.2x3  reason: invalid class name and case insensitive filesystem */
public class C59322x3 extends C30711cp {
    public final long A00;
    public final AnonymousClass024 A01;
    public final C16300so A02;
    public final String A03;
    public final Collection A04;

    public C59322x3(C16300so r3, C16320sq r4, String str, Collection collection, long j2) {
        this.A02 = r3;
        this.A03 = str;
        this.A04 = collection;
        this.A00 = j2;
        this.A01 = C41711wS.A00(r4, 10000);
    }

    public void cancel() {
        super.cancel();
        this.A01.A01();
    }
}
