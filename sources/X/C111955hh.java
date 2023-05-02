package X;

import org.json.JSONObject;

/* renamed from: X.5hh  reason: invalid class name and case insensitive filesystem */
public abstract class C111955hh extends AnonymousClass14O {
    public void A00(JSONObject jSONObject, long j2) {
        this.A00 = jSONObject.getJSONObject(A01(j2)).getString("payload");
    }

    public String A01(long j2) {
        if (4595048977247919L == j2) {
            return "whatsapp_pmtd_bloks_getprivatelayout";
        }
        throw new IllegalArgumentException();
    }
}
