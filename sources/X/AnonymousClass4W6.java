package X;

/* renamed from: X.4W6  reason: invalid class name */
public class AnonymousClass4W6 {
    public final String A00;
    public final String A01;
    public final String A02;

    public AnonymousClass4W6(String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4W6 r5 = (AnonymousClass4W6) obj;
            if (!this.A02.equals(r5.A02) || !C34901l3.A00(this.A01, r5.A01) || !C34901l3.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A02;
        objArr[1] = this.A01;
        return AnonymousClass000.A0F(this.A00, objArr, 2);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Bullet{text='");
        char A002 = AnonymousClass3K3.A00(this.A02, A0r);
        A0r.append(", iconLightUrl='");
        A0r.append(this.A01);
        A0r.append(A002);
        A0r.append(", iconDarkUrl='");
        A0r.append(this.A00);
        A0r.append(A002);
        return AnonymousClass000.A0k(A0r);
    }
}
