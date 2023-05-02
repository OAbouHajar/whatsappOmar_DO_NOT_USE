package X;

/* renamed from: X.5IN  reason: invalid class name */
public class AnonymousClass5IN extends C32061fa implements AnonymousClass5NM {
    public int A00;
    public C32071fb A01;

    public AnonymousClass5IN(C32071fb r2) {
        this.A00 = 0;
        this.A01 = r2;
    }

    public AnonymousClass5IN(C107525In r3) {
        int i2 = r3.A00;
        this.A00 = i2;
        this.A01 = i2 == 0 ? new AnonymousClass5IG(C32411gJ.A01(r3, false)) : C107595Iu.A01(r3);
    }

    public C32051fZ Agm() {
        return new C107625Ix(this.A01, this.A00, false);
    }

    public String toString() {
        String str = C32941ha.A00;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(str);
        int i2 = this.A00;
        AnonymousClass3K2.A1R(i2 == 0 ? "fullName" : "nameRelativeToCRLIssuer", str, this.A01.toString(), stringBuffer);
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
