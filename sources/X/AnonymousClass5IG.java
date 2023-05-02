package X;

/* renamed from: X.5IG  reason: invalid class name */
public class AnonymousClass5IG extends C32061fa {
    public final AnonymousClass5IP[] A00;

    public AnonymousClass5IG(C32411gJ r4) {
        this.A00 = new AnonymousClass5IP[r4.A0A()];
        for (int i2 = 0; i2 != r4.A0A(); i2++) {
            this.A00[i2] = AnonymousClass5IP.A00(r4.A0C(i2));
        }
    }

    public AnonymousClass5IG(AnonymousClass5IP r3) {
        this.A00 = new AnonymousClass5IP[]{r3};
    }

    public static AnonymousClass5IG A00(Object obj) {
        if (obj instanceof AnonymousClass5IG) {
            return (AnonymousClass5IG) obj;
        }
        if (obj != null) {
            return new AnonymousClass5IG(C32411gJ.A00(obj));
        }
        return null;
    }

    public AnonymousClass5IP[] A03() {
        AnonymousClass5IP[] r3 = this.A00;
        int length = r3.length;
        AnonymousClass5IP[] r1 = new AnonymousClass5IP[length];
        System.arraycopy(r3, 0, r1, 0, length);
        return r1;
    }

    public C32051fZ Agm() {
        return new C32401gI((C32071fb[]) this.A00);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = C32941ha.A00;
        stringBuffer.append("GeneralNames:");
        stringBuffer.append(str);
        int i2 = 0;
        while (true) {
            AnonymousClass5IP[] r1 = this.A00;
            if (i2 == r1.length) {
                return stringBuffer.toString();
            }
            stringBuffer.append("    ");
            stringBuffer.append(r1[i2]);
            stringBuffer.append(str);
            i2++;
        }
    }
}
