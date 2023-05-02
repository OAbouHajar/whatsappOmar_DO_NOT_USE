package X;

import android.util.Base64;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.1sn  reason: invalid class name and case insensitive filesystem */
public class C39631sn {
    public int A00;
    public long A01 = -1;
    public String A02;
    public final String A03;

    public C39631sn(String str) {
        this.A03 = str;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes(AnonymousClass01S.A0A));
            this.A02 = Base64.encodeToString(instance.digest(), 2);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public C39631sn(String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39631sn)) {
            return false;
        }
        C39631sn r7 = (C39631sn) obj;
        return this.A01 == r7.A01 && this.A00 == r7.A00 && C34901l3.A00(this.A02, r7.A02) && C34901l3.A00(this.A03, r7.A03);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, Integer.valueOf(this.A00), this.A02, Long.valueOf(this.A01)});
    }
}
