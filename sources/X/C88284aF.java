package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4aF  reason: invalid class name and case insensitive filesystem */
public class C88284aF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public C88284aF(String str, String str2, int i2, int i3, int i4, int i5) {
        this.A05 = str;
        this.A01 = i2;
        this.A03 = i4;
        this.A04 = str2;
        this.A00 = i3;
        this.A02 = i5;
    }

    public static C88284aF A00(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C88284aF(jSONObject.optString("media_codec_encoder", (String) null), jSONObject.optString("media_codec_decoder", (String) null), jSONObject.optInt("color_format_encoder", -1), jSONObject.optInt("color_format_decoder", -1), jSONObject.optInt("forced_frame_conv_id_encoder", -1), jSONObject.optInt("forced_frame_conv_id_decoder", -1));
        } catch (JSONException unused) {
            return null;
        }
    }
}
