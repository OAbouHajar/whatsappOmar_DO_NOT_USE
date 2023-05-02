package X;

import android.util.JsonReader;
import android.util.JsonToken;

/* renamed from: X.4tk  reason: invalid class name and case insensitive filesystem */
public class C99264tk implements C109625Sx {
    public Boolean A00;
    public String A01;
    public final JsonToken A02;

    public C99264tk(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        this.A02 = peek;
        int i2 = AnonymousClass49A.A00[peek.ordinal()];
        if (i2 == 1) {
            this.A00 = Boolean.valueOf(jsonReader.nextBoolean());
        } else if (i2 == 2) {
            jsonReader.nextNull();
        } else if (i2 == 3 || i2 == 4) {
            this.A01 = jsonReader.nextString();
        } else {
            throw AnonymousClass000.A0V("can't read value");
        }
    }

    public boolean A5e() {
        Boolean bool = this.A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AnonymousClass3K3.A0e(AnonymousClass000.A0f(this.A02, AnonymousClass000.A0r("type mis matching")));
    }

    public boolean AJJ() {
        return AnonymousClass000.A1Y(this.A02, JsonToken.NULL);
    }

    public long AKa() {
        String str = this.A01;
        if (str != null) {
            return Long.valueOf(str).longValue();
        }
        throw AnonymousClass3K3.A0e(AnonymousClass000.A0f(this.A02, AnonymousClass000.A0r("type mis matching")));
    }

    public Number ALr() {
        String str = this.A01;
        if (str != null) {
            try {
                return Long.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(str);
            }
        } else {
            throw AnonymousClass3K3.A0e(AnonymousClass000.A0f(this.A02, AnonymousClass000.A0r("type mis matching")));
        }
    }

    public String AgS() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        throw AnonymousClass3K3.A0e(AnonymousClass000.A0f(this.A02, AnonymousClass000.A0r("type mis matching")));
    }
}
