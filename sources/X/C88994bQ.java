package X;

/* renamed from: X.4bQ  reason: invalid class name and case insensitive filesystem */
public class C88994bQ {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public static String A00(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        while (true) {
            int length = str.length();
            if (i2 >= length) {
                return stringBuffer.toString();
            }
            char charAt = str.charAt(i2);
            if (charAt != '\\' || i2 >= length - 3) {
                stringBuffer.append(charAt);
            } else if (str.charAt(i2 + 1) == 'r' && str.charAt(i2 + 2) == '\\') {
                int i3 = i2 + 3;
                if (str.charAt(i3) == 'n') {
                    stringBuffer.append(10);
                    i2 = i3;
                }
            }
            i2++;
        }
    }

    public String A01() {
        StringBuilder A0o = AnonymousClass000.A0o();
        String str = this.A03;
        if (str != null) {
            A0o.append(str);
        }
        A0o.append(";");
        String str2 = this.A00;
        if (str2 != null) {
            A0o.append(str2);
        }
        A0o.append(";");
        String str3 = this.A02;
        if (str3 != null) {
            A0o.append(str3);
        }
        A0o.append(";");
        String str4 = this.A04;
        if (str4 != null) {
            A0o.append(str4);
        }
        A0o.append(";");
        String str5 = this.A01;
        if (str5 != null) {
            A0o.append(str5);
        }
        return A0o.toString();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        String str = this.A03;
        A0o.append(str == null ? null : A00(str));
        A0o.append(" ");
        A0o.append(this.A00);
        A0o.append(" ");
        A0o.append(this.A02);
        A0o.append(" ");
        A0o.append(this.A04);
        A0o.append(" ");
        return AnonymousClass000.A0h(this.A01, A0o);
    }
}
