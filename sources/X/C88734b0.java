package X;

/* renamed from: X.4b0  reason: invalid class name and case insensitive filesystem */
public final class C88734b0 {
    public static final C88734b0 A04 = new C88734b0(-1, -1, -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C88734b0(int i2, int i3, int i4) {
        this.A03 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A00 = AnonymousClass3C1.A0E(i4) ? AnonymousClass3C1.A02(i4, i3) : -1;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AudioFormat[sampleRate=");
        A0r.append(this.A03);
        A0r.append(", channelCount=");
        A0r.append(this.A01);
        A0r.append(", encoding=");
        A0r.append(this.A02);
        return AnonymousClass3K2.A0m(A0r);
    }
}
