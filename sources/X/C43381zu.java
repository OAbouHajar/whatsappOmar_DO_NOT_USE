package X;

import java.io.File;

/* renamed from: X.1zu  reason: invalid class name and case insensitive filesystem */
public abstract class C43381zu {
    public C43301zm A00;
    public final AnonymousClass211 A01;
    public final AnonymousClass1XQ A02;
    public final AnonymousClass216 A03;
    public final AnonymousClass215 A04;
    public final AnonymousClass214 A05;
    public final File A06;

    public C43381zu(AnonymousClass211 r1, AnonymousClass1XQ r2, AnonymousClass216 r3, AnonymousClass215 r4, AnonymousClass214 r5, File file) {
        this.A02 = r2;
        this.A01 = r1;
        this.A05 = r5;
        this.A04 = r4;
        this.A06 = file;
        this.A03 = r3;
    }

    public void A00(int i2) {
        this.A03.A00.A01.A04(Integer.valueOf(i2));
    }

    public synchronized void A01(C43301zm r2) {
        this.A00 = r2;
    }
}
