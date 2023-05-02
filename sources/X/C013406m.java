package X;

import com.AssemMods.translator.Language;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.06m  reason: invalid class name and case insensitive filesystem */
public final class C013406m implements C012706f {
    public static final Locale A02 = C012606e.A03("en-Latn");
    public static final Locale A03 = new Locale(Language.ARABIC, "XB");
    public static final Locale A04 = new Locale(Language.ENGLISH, "XA");
    public static final Locale[] A05 = new Locale[0];
    public final String A00;
    public final Locale[] A01;

    public C013406m(Locale... localeArr) {
        String obj;
        int length = localeArr.length;
        if (length == 0) {
            this.A01 = A05;
            obj = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            do {
                Locale locale = localeArr[i2];
                if (locale != null) {
                    if (!hashSet.contains(locale)) {
                        Locale locale2 = (Locale) locale.clone();
                        arrayList.add(locale2);
                        sb.append(locale2.getLanguage());
                        String country = locale2.getCountry();
                        if (country != null && !country.isEmpty()) {
                            sb.append('-');
                            sb.append(locale2.getCountry());
                        }
                        if (i2 < length - 1) {
                            sb.append(',');
                        }
                        hashSet.add(locale2);
                    }
                    i2++;
                } else {
                    StringBuilder sb2 = new StringBuilder("list[");
                    sb2.append(i2);
                    sb2.append("] is null");
                    throw new NullPointerException(sb2.toString());
                }
            } while (i2 < length);
            this.A01 = (Locale[]) arrayList.toArray(new Locale[0]);
            obj = sb.toString();
        }
        this.A00 = obj;
    }

    public Locale A9b(int i2) {
        Locale[] localeArr = this.A01;
        if (0 < localeArr.length) {
            return localeArr[0];
        }
        return null;
    }

    public Object ADC() {
        return null;
    }

    public String Agt() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C013406m) {
                Locale[] localeArr = ((C013406m) obj).A01;
                Locale[] localeArr2 = this.A01;
                int length = localeArr2.length;
                if (length == localeArr.length) {
                    int i2 = 0;
                    while (i2 < length) {
                        if (localeArr2[i2].equals(localeArr[i2])) {
                            i2++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 1;
        for (Locale hashCode : this.A01) {
            i2 = (i2 * 31) + hashCode.hashCode();
        }
        return i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.A01;
            int length = localeArr.length;
            if (i2 < length) {
                sb.append(localeArr[i2]);
                if (i2 < length - 1) {
                    sb.append(',');
                }
                i2++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
