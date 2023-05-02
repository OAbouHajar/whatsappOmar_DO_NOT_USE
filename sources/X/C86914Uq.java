package X;

/* renamed from: X.4Uq  reason: invalid class name and case insensitive filesystem */
public class C86914Uq {
    public char A00;
    public int A01;
    public String A02;
    public StringBuffer A03 = new StringBuffer();

    public C86914Uq(String str, char c2) {
        this.A02 = str;
        this.A01 = -1;
        this.A00 = c2;
    }

    public String A00() {
        int i2 = this.A01;
        String str = this.A02;
        int length = str.length();
        if (i2 == length) {
            return null;
        }
        int i3 = i2 + 1;
        StringBuffer stringBuffer = this.A03;
        stringBuffer.setLength(0);
        boolean z2 = false;
        boolean z3 = false;
        while (i3 != length) {
            char charAt = str.charAt(i3);
            if (charAt == '\"') {
                if (!z2) {
                    z3 = !z3;
                }
            } else if (!z2 && !z3) {
                if (charAt != '\\') {
                    if (charAt == this.A00) {
                        break;
                    }
                    stringBuffer.append(charAt);
                } else {
                    stringBuffer.append(charAt);
                    z2 = true;
                }
                i3++;
            }
            stringBuffer.append(charAt);
            z2 = false;
            i3++;
        }
        this.A01 = i3;
        return stringBuffer.toString();
    }
}
