package X;

/* renamed from: X.0Uc  reason: invalid class name and case insensitive filesystem */
public class C06070Uc {
    public float A00;
    public int A01;
    public int A02;
    public AnonymousClass0KA A03;
    public String A04;
    public String A05;
    public boolean A06;

    public C06070Uc(AnonymousClass0KA r1, Object obj, String str) {
        this.A04 = str;
        this.A03 = r1;
        A00(obj);
    }

    public C06070Uc(C06070Uc r2, Object obj) {
        this.A04 = r2.A04;
        this.A03 = r2.A03;
        A00(obj);
    }

    public void A00(Object obj) {
        switch (this.A03.ordinal()) {
            case 0:
                this.A02 = AnonymousClass000.A0D(obj);
                return;
            case 1:
            case 6:
                this.A00 = AnonymousClass000.A04(obj);
                return;
            case 2:
            case 3:
                this.A01 = AnonymousClass000.A0D(obj);
                return;
            case 4:
                this.A05 = (String) obj;
                return;
            case 5:
                this.A06 = AnonymousClass000.A1X(obj);
                return;
            default:
                return;
        }
    }
}
