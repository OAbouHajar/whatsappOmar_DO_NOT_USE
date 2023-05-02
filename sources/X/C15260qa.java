package X;

import org.json.JSONObject;

/* renamed from: X.0qa  reason: invalid class name and case insensitive filesystem */
public final class C15260qa extends C15270qb implements C15280qc {
    public final long A00;
    public final long A01;
    public final long A02;
    public final boolean A03;
    public final boolean A04;

    public C15260qa(long j2, long j3, long j4, boolean z2, boolean z3) {
        this.A00 = j2;
        this.A01 = j3;
        this.A02 = j4;
        this.A03 = z2;
        this.A04 = z3;
    }

    public static C15260qa A00(JSONObject jSONObject) {
        C15420qr r9 = new C15420qr();
        long optLong = jSONObject.optLong("max_size", 0);
        long optLong2 = jSONObject.optLong("max_size_low_space_bytes", 0);
        long optLong3 = jSONObject.optLong("max_size_very_low_space_bytes", 0);
        if (optLong <= 0 && optLong2 <= 0 && optLong3 <= 0) {
            return null;
        }
        r9.A00 = optLong;
        r9.A01 = optLong2;
        r9.A02 = optLong3;
        r9.A03 = jSONObject.optBoolean("delete_only_on_init", false);
        r9.A04 = jSONObject.optBoolean("is_itemized", false);
        return r9.A00();
    }

    public JSONObject Agp() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("max_size", this.A00);
        jSONObject.put("max_size_low_space_bytes", this.A01);
        jSONObject.put("max_size_very_low_space_bytes", this.A02);
        jSONObject.put("delete_only_on_init", this.A03);
        jSONObject.put("is_itemized", this.A04);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15260qa.class == obj.getClass()) {
            C15260qa r8 = (C15260qa) obj;
            return this.A00 == r8.A00 && this.A01 == r8.A01 && this.A02 == r8.A02 && this.A03 == r8.A03 && this.A04 == r8.A04;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.A00;
        long j3 = this.A01;
        long j4 = this.A02;
        return (((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
