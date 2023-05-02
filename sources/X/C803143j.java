package X;

/* renamed from: X.43j  reason: invalid class name and case insensitive filesystem */
public class C803143j extends Exception {
    public final int downloadStatus;

    public C803143j(int i2) {
        this.downloadStatus = i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("DownloadResultException{downloadStatus=");
        A0r.append(C31701et.A00(this.downloadStatus));
        return AnonymousClass000.A0k(A0r);
    }
}
