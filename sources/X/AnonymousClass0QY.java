package X;

import java.io.File;

/* renamed from: X.0QY  reason: invalid class name */
public final class AnonymousClass0QY {
    public long A00;
    public C05220Pt A01;
    public boolean A02;
    public final String A03;
    public final long[] A04;
    public final /* synthetic */ C09100eu A05;

    public AnonymousClass0QY(C09100eu r2, String str) {
        this.A05 = r2;
        this.A03 = str;
        this.A04 = new long[r2.A06];
    }

    public File A00() {
        File file = this.A05.A07;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A03);
        A0o.append(".");
        return new File(file, AnonymousClass000.A0l(A0o, 0));
    }

    public File A01() {
        File file = this.A05.A07;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A03);
        A0o.append(".");
        A0o.append(0);
        return new File(file, AnonymousClass000.A0h(".tmp", A0o));
    }
}
