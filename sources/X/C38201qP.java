package X;

/* renamed from: X.1qP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38201qP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C19040xf A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C38201qP(C19040xf r1, String str, String str2, String str3, int i2) {
        this.A01 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = i2;
    }

    public final void run() {
        C19040xf r2 = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        String str3 = this.A04;
        int i2 = this.A00;
        r2.A0D();
        synchronized (r2.A0I) {
            if (r2.A07() != null) {
                r2.A05(str, str2, str3, i2, false).A00(new AnonymousClass3G2(r2));
            }
        }
    }
}
