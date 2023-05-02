package X;

/* renamed from: X.0dj  reason: invalid class name and case insensitive filesystem */
public class C08490dj implements C12660kl {
    public final AnonymousClass0K4 A00;
    public final String A01;
    public final boolean A02;

    public C08490dj(AnonymousClass0K4 r1, String str, boolean z2) {
        this.A01 = str;
        this.A00 = r1;
        this.A02 = z2;
    }

    public C13150lY Agn(AnonymousClass0Ak r2, C08360dV r3) {
        if (r2.A0A) {
            return new C08250dK(this);
        }
        C05770Sy.A00("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("MergePaths{mode=");
        A0r.append(this.A00);
        return AnonymousClass000.A0k(A0r);
    }
}
