package X;

/* renamed from: X.4ao  reason: invalid class name and case insensitive filesystem */
public class C88614ao {
    public final String A00;
    public final String A01;

    public C88614ao(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public C88614ao(C88614ao... r8) {
        String str = "";
        String str2 = str;
        for (C88614ao r2 : r8) {
            str = AnonymousClass000.A0h(r2.A01, AnonymousClass000.A0q(str));
            str2 = AnonymousClass000.A0h(r2.A00, AnonymousClass000.A0q(str2));
        }
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean A00(char c2, char c3) {
        int i2 = 0;
        while (true) {
            String str = this.A01;
            if (i2 >= str.length()) {
                return false;
            }
            if (str.charAt(i2) == c2 && this.A00.charAt(i2) == c3) {
                return true;
            }
            i2++;
        }
    }
}
