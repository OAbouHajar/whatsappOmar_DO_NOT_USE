package X;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: X.0ay  reason: invalid class name and case insensitive filesystem */
public final class C07320ay implements C012706f {
    public final LocaleList A00;

    public C07320ay(Object obj) {
        this.A00 = (LocaleList) obj;
    }

    public Locale A9b(int i2) {
        return this.A00.get(0);
    }

    public Object ADC() {
        return this.A00;
    }

    public String Agt() {
        return this.A00.toLanguageTags();
    }

    public boolean equals(Object obj) {
        return this.A00.equals(((C012706f) obj).ADC());
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }
}
