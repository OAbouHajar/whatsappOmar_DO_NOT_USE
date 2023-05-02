package X;

import java.util.Locale;

/* renamed from: X.2Ci  reason: invalid class name */
public class AnonymousClass2Ci {
    public final String A00;
    public final Locale A01;

    public AnonymousClass2Ci(String str, Locale locale) {
        this.A01 = new Locale(locale.getLanguage(), locale.getCountry());
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass2Ci r5 = (AnonymousClass2Ci) obj;
            if (this.A01.equals(r5.A01)) {
                String str = this.A00;
                String str2 = r5.A00;
                return str != null ? str.equals(str2) : str2 == null;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = this.A01.hashCode() * 31;
        String str = this.A00;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }
}
