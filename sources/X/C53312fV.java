package X;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.2fV  reason: invalid class name and case insensitive filesystem */
public class C53312fV {
    public final int A00;
    public final long A01;

    public C53312fV(int i2, long j2) {
        this.A00 = i2;
        this.A01 = j2;
    }

    public C53312fV(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.A00 = jSONObject.getInt("update_count");
        this.A01 = jSONObject.getLong("id");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C53312fV)) {
            return false;
        }
        C53312fV r7 = (C53312fV) obj;
        return r7.A01 == this.A01 && r7.A00 == this.A00;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A01), Integer.valueOf(this.A00)});
    }
}
