package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Dw  reason: invalid class name and case insensitive filesystem */
public class C46352Dw {
    public int A00;
    public final int A01;
    public final int A02;
    public final long A03;

    public C46352Dw(int i2, int i3, int i4, long j2) {
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = j2;
        this.A02 = i4;
    }

    public static C46352Dw A00(JSONObject jSONObject) {
        try {
            return new C46352Dw(jSONObject.getInt("id"), jSONObject.getInt("stage"), jSONObject.getInt("version"), jSONObject.getLong("t"));
        } catch (JSONException e2) {
            Log.e("UserNoticeMetadata/fromJSON exception: ", e2);
            return null;
        }
    }

    public static JSONObject A01(C46352Dw r4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", r4.A01);
            jSONObject.put("stage", r4.A00);
            jSONObject.put("t", r4.A03);
            jSONObject.put("version", r4.A02);
            return jSONObject;
        } catch (JSONException e2) {
            Log.e("UserNoticeMetadata/toJSON exception: ", e2);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46352Dw)) {
            return false;
        }
        C46352Dw r7 = (C46352Dw) obj;
        return this.A01 == r7.A01 && this.A00 == r7.A00 && this.A03 == r7.A03 && this.A02 == r7.A02;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00), Long.valueOf(this.A03), Integer.valueOf(this.A02)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserNoticeMetadata{noticeId=");
        sb.append(this.A01);
        sb.append(", stage=");
        sb.append(this.A00);
        sb.append(", timestamp=");
        sb.append(this.A03);
        sb.append(", version=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
