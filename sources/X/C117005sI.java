package X;

import org.json.JSONObject;

/* renamed from: X.5sI  reason: invalid class name and case insensitive filesystem */
public class C117005sI {
    public final int A00;
    public final int A01;
    public final String A02;

    public C117005sI(JSONObject jSONObject) {
        this.A01 = jSONObject.getInt("offset");
        this.A00 = jSONObject.getInt("length");
        this.A02 = jSONObject.getString("url");
    }
}
