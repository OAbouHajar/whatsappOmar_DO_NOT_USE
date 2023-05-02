package X;

/* renamed from: X.1qH  reason: invalid class name and case insensitive filesystem */
public class C38121qH implements C38131qI {
    public int A00;
    public final long A01;
    public final C29561ap A02;

    public C38121qH(C29561ap r1, long j2) {
        this.A01 = j2;
        this.A02 = r1;
    }

    public C38121qH(String str, long j2) {
        this.A02 = new C29561ap(str, str, "", (String) null, (String) null, "fallback", 0, false);
        this.A01 = j2;
    }

    public long AA2() {
        return this.A01;
    }

    public C29561ap ABS() {
        if (this.A00 < 4) {
            return this.A02;
        }
        return null;
    }

    public void AQd(boolean z2, int i2) {
        this.A00++;
    }
}
