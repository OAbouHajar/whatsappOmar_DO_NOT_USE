package X;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2Dn  reason: invalid class name and case insensitive filesystem */
public class C46312Dn {
    public final AnonymousClass2Dx A00;
    public final AnonymousClass2Dy A01;
    public final AnonymousClass2Dy A02;

    public C46312Dn(AnonymousClass2Dx r1, AnonymousClass2Dy r2, AnonymousClass2Dy r3) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = r3;
    }

    public static C46312Dn A00(JSONObject jSONObject) {
        long[] jArr;
        AnonymousClass2Dy r4 = null;
        AnonymousClass2Dy r3 = jSONObject.has("start") ? new AnonymousClass2Dy(jSONObject.getLong("start")) : null;
        if (jSONObject.has("repeat")) {
            JSONArray jSONArray = jSONObject.getJSONArray("repeat");
            jArr = new long[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
        } else {
            jArr = null;
        }
        Long valueOf = jSONObject.has("static") ? Long.valueOf(jSONObject.getLong("static")) : null;
        AnonymousClass2Dx r2 = (jArr == null || valueOf == null) ? null : new AnonymousClass2Dx(jArr, valueOf.longValue());
        if (jSONObject.has("end")) {
            r4 = new AnonymousClass2Dy(jSONObject.getLong("end"));
        }
        return new C46312Dn(r2, r3, r4);
    }

    public JSONObject A01() {
        JSONObject jSONObject = new JSONObject();
        AnonymousClass2Dy r0 = this.A02;
        if (r0 != null) {
            jSONObject.put("start", r0.A00);
        }
        AnonymousClass2Dx r7 = this.A00;
        if (r7 != null) {
            long[] jArr = r7.A01;
            if (jArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (long valueOf : jArr) {
                    jSONArray.put(Long.valueOf(valueOf));
                }
                jSONObject.put("repeat", jSONArray);
            }
            jSONObject.put("static", r7.A00);
        }
        AnonymousClass2Dy r02 = this.A01;
        if (r02 != null) {
            jSONObject.put("end", r02.A00);
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C46312Dn r5 = (C46312Dn) obj;
            if (!C34901l3.A00(this.A02, r5.A02) || !C34901l3.A00(this.A00, r5.A00) || !C34901l3.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00, this.A01});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserNoticeContentTiming{start=");
        sb.append(this.A02);
        sb.append(", duration=");
        sb.append(this.A00);
        sb.append(", end=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }
}
