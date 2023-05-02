package X;

import java.io.File;

/* renamed from: X.4Ra  reason: invalid class name and case insensitive filesystem */
public final class C86054Ra {
    public final long A00;
    public final long A01;
    public final File A02;
    public final byte[] A03;

    public C86054Ra(File file, byte[] bArr, long j2, long j3) {
        this.A02 = file;
        this.A00 = j2;
        this.A01 = j3;
        this.A03 = bArr;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("DownloadResult{fileSize=");
        A0r.append(this.A00);
        A0r.append(", roundTripTime=");
        A0r.append(this.A01);
        return AnonymousClass000.A0k(A0r);
    }
}
