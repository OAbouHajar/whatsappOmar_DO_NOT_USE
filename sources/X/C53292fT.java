package X;

import org.json.JSONObject;

/* renamed from: X.2fT  reason: invalid class name and case insensitive filesystem */
public class C53292fT {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final boolean A04;

    public C53292fT(C28371Vv r3, long j2, long j3) {
        this.A03 = j2;
        this.A01 = r3.A0B(r3.A0M("redeemed_count"), "redeemed_count");
        this.A00 = r3.A0B(r3.A0M("reserved_count"), "reserved_count");
        this.A04 = "1".equalsIgnoreCase(r3.A0M("is_eligible"));
        this.A02 = j3;
    }

    public C53292fT(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.A03 = jSONObject.getLong("offer_id");
        this.A04 = jSONObject.getBoolean("is_eligible");
        this.A00 = jSONObject.getInt("pending_count");
        this.A01 = jSONObject.getInt("redeemed_count");
        this.A02 = jSONObject.getLong("last_sync_time_ms");
    }
}
