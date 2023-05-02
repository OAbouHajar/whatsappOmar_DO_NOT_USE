package X;

import java.io.File;

/* renamed from: X.4aP  reason: invalid class name and case insensitive filesystem */
public class C88384aP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final File A05;
    public final String A06;
    public final String A07;

    public C88384aP(C88424aT r2, C88424aT r3, File file, int i2) {
        this.A04 = i2;
        this.A05 = file;
        this.A07 = r2.A0A;
        this.A01 = r2.A00;
        this.A03 = r2.A05;
        this.A06 = r3.A0A;
        this.A00 = r3.A00;
        this.A02 = r3.A05;
    }

    public C88384aP(File file, int i2) {
        this.A04 = i2;
        this.A05 = file;
        this.A07 = null;
        this.A06 = null;
        this.A00 = -1;
        this.A01 = -1;
        this.A03 = -1;
        this.A02 = -1;
    }
}
