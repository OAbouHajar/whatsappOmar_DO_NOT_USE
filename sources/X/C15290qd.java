package X;

import org.json.JSONObject;

/* renamed from: X.0qd  reason: invalid class name and case insensitive filesystem */
public final class C15290qd extends C15270qb implements C15280qc {
    public final long A00;
    public final boolean A01;

    public C15290qd(long j2, boolean z2) {
        this.A00 = j2;
        this.A01 = z2;
    }

    public JSONObject Agp() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stale_age_s", this.A00);
        jSONObject.put("is_itemized", this.A01);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15290qd.class == obj.getClass()) {
            C15290qd r8 = (C15290qd) obj;
            return this.A00 == r8.A00 && this.A01 == r8.A01;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.A00;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + (this.A01 ? 1 : 0);
    }
}
