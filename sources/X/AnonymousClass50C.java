package X;

/* renamed from: X.50C  reason: invalid class name */
public class AnonymousClass50C implements AnonymousClass5Q5 {
    public final AnonymousClass5Q5 A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final byte[] A06;

    public AnonymousClass50C(Long l2, String str, String str2, String str3, String str4, byte[] bArr) {
        this.A05 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A06 = bArr;
        this.A01 = l2;
        switch (str3.hashCode()) {
            case 100229:
                if (str3.equals("ecc")) {
                    this.A00 = new AnonymousClass3GH(bArr);
                    return;
                }
                break;
            case 113216:
                if (str3.equals("rsa")) {
                    this.A00 = new AnonymousClass50B(bArr);
                    return;
                }
                break;
            case 3387192:
                if (str3.equals("none")) {
                    this.A00 = new AnonymousClass509();
                    return;
                }
                break;
            case 110541305:
                if (str3.equals("token")) {
                    this.A00 = new AnonymousClass50A();
                    return;
                }
                break;
        }
        throw AnonymousClass3K4.A0T(AnonymousClass1Vo.A01("PaymentProviderKey", AnonymousClass000.A0h(str3, AnonymousClass000.A0r("PaymentProviderKey invalid key type: "))));
    }

    public byte[] A8P(byte[] bArr, byte[] bArr2) {
        return this.A00.A8P(bArr, bArr2);
    }
}
