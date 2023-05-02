package X;

import java.util.Locale;

/* renamed from: X.2Ck  reason: invalid class name and case insensitive filesystem */
public final class C46112Ck {
    public final String A00;
    public final Locale[] A01;

    public C46112Ck(String str, Locale[] localeArr) {
        this.A01 = localeArr;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HsmMessagePackEvent{locales=");
        sb.append(AnonymousClass1WH.A08(this.A01));
        sb.append(", namespace='");
        sb.append(this.A00);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
