package X;

/* renamed from: X.2Th  reason: invalid class name and case insensitive filesystem */
public class C49472Th implements C49482Ti {
    public String A00 = "";
    public String A01 = "";
    public final long A02;
    public final C39181s3 A03;
    public final boolean A04;

    public C49472Th(C39181s3 r2, String str, String str2, long j2, boolean z2) {
        this.A03 = r2;
        this.A01 = str;
        this.A00 = str2;
        this.A02 = j2;
        this.A04 = z2;
    }

    public boolean A8a(C49482Ti r7) {
        if (r7 instanceof C49472Th) {
            C49472Th r72 = (C49472Th) r7;
            return AnonymousClass1ZW.A0F(this.A01, r72.A01) && AnonymousClass1ZW.A0F(this.A00, r72.A00) && this.A02 == r72.A02;
        }
    }

    public long AFd() {
        return this.A03.A13;
    }

    public int AH0() {
        return 2;
    }
}
