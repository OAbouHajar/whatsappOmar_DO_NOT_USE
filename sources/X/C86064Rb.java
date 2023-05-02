package X;

/* renamed from: X.4Rb  reason: invalid class name and case insensitive filesystem */
public class C86064Rb {
    public long A00;
    public final long A01;
    public final long A02;
    public final String A03;

    public C86064Rb(String str, long j2, long j3, long j4) {
        this.A03 = str;
        this.A02 = j2;
        this.A01 = j3;
        this.A00 = j4;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ExpressPathDownloadData: {EncHash: ");
        A0r.append(this.A03);
        A0r.append("SavedTime: ");
        A0r.append(this.A02);
        A0r.append("SavedBytes: ");
        A0r.append(this.A01);
        A0r.append("LateUpdateTime: ");
        return C13680ns.A0j(A0r, this.A00);
    }
}
