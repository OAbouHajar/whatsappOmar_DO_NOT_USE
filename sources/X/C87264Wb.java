package X;

/* renamed from: X.4Wb  reason: invalid class name and case insensitive filesystem */
public class C87264Wb {
    public int A00;
    public int A01;
    public C798841s A02;
    public String A03;
    public String A04;
    public String A05;

    public boolean equals(Object obj) {
        if (!(obj instanceof C87264Wb)) {
            return false;
        }
        C87264Wb r4 = (C87264Wb) obj;
        return this.A02 == r4.A02 && r4.A01 == this.A01 && r4.A00 == this.A00;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A02;
        AnonymousClass000.A1L(objArr, this.A01);
        AnonymousClass3K2.A1W(objArr, this.A00);
        return AnonymousClass000.A0F(C13680ns.A0X(), objArr, 3);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ResumeCheck.Result type=");
        A0r.append(this.A02);
        A0r.append(", resume=");
        A0r.append(this.A01);
        A0r.append(", error=");
        A0r.append(this.A00);
        A0r.append(", message=");
        A0r.append(this.A04);
        A0r.append(", backoff=");
        A0r.append(0);
        return AnonymousClass000.A0h("]", A0r);
    }
}
