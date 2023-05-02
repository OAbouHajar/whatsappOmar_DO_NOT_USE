package X;

import java.util.Arrays;

/* renamed from: X.2I2  reason: invalid class name */
public class AnonymousClass2I2 implements AnonymousClass2I3 {
    public final AnonymousClass2I5 A00;
    public final String A01;

    public AnonymousClass2I2(Object obj, String str) {
        this.A01 = str;
        this.A00 = new AnonymousClass2I5(obj);
    }

    public boolean AIk(C24721Ha r3) {
        try {
            return new AnonymousClass2I5(r3.A00(this.A01)).equals(this.A00);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2I2)) {
            return false;
        }
        AnonymousClass2I2 r4 = (AnonymousClass2I2) obj;
        if (!this.A01.equals(r4.A01) || !this.A00.equals(r4.A00)) {
            return false;
        }
        Class<String> cls = String.class;
        return cls.equals(cls);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, 4, this.A00, null, String.class});
    }
}
