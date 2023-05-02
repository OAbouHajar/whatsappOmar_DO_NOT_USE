package X;

/* renamed from: X.1qM  reason: invalid class name and case insensitive filesystem */
public class C38171qM implements C38131qI {
    public int A00 = 0;
    public boolean A01;
    public final long A02;
    public final C29561ap A03;
    public final C38161qL A04;

    public C38171qM(C38161qL r10, String str, long j2) {
        this.A03 = new C29561ap(str, str, "", (String) null, (String) null, "fallback", 0, false);
        this.A04 = r10;
        this.A02 = j2;
    }

    public long AA2() {
        return this.A01 ? this.A04.AA2() : this.A02;
    }

    public C29561ap ABS() {
        return !this.A01 ? this.A03 : this.A04.A02;
    }

    public void AQd(boolean z2, int i2) {
        if (this.A01) {
            this.A04.AQd(z2, i2);
        }
        if (!z2 || this.A00 > 1) {
            this.A01 = true;
        }
        this.A00++;
    }
}
