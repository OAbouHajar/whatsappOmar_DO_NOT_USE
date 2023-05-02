package X;

import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1fg  reason: invalid class name and case insensitive filesystem */
public class C32121fg {
    public int A00;
    public int A01;
    public String A02;
    public JSONObject A03;
    public final String A04;
    public final String A05;
    public final JSONArray A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C32121fg(String str) {
        this.A01 = -1;
        this.A05 = str;
        this.A04 = str;
        this.A06 = null;
        this.A08 = false;
        this.A09 = false;
        this.A0A = false;
        this.A07 = false;
    }

    public C32121fg(JSONObject jSONObject) {
        String str;
        try {
            this.A01 = jSONObject.getInt("code");
        } catch (JSONException unused) {
            this.A01 = 0;
        }
        try {
            this.A00 = jSONObject.getInt("api_error_code");
        } catch (JSONException unused2) {
            this.A00 = 0;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        this.A06 = optJSONArray;
        String A002 = C812147h.A00("message", jSONObject);
        this.A05 = A002;
        this.A08 = jSONObject.optBoolean("is_silent");
        this.A09 = jSONObject.optBoolean("is_transient");
        this.A04 = C812147h.A00(FacebookFacade.RequestParameter.DESCRIPTION, jSONObject);
        this.A0A = jSONObject.optBoolean("requires_reauth");
        this.A07 = jSONObject.optBoolean("allow_user_retry");
        try {
            if (jSONObject.has("type")) {
                str = jSONObject.optString("type");
            } else if (jSONObject.has("exception")) {
                str = C812147h.A00("class", jSONObject.getJSONObject("exception"));
                if (jSONObject.getJSONObject("exception").has("message")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("::");
                    sb.append(C812147h.A00("message", jSONObject.getJSONObject("exception")));
                    str = sb.toString();
                }
            } else {
                str = null;
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            str = null;
        }
        this.A02 = str;
        this.A03 = new JSONObject();
        String A003 = C812147h.A00("www_request_id", jSONObject);
        if (C812147h.A00("fbtrace_id", jSONObject) != null) {
            this.A03.put("fbtrace_id", C812147h.A00("fbtrace_id", jSONObject));
        }
        if (A003 != null) {
            this.A03.put("www_request_id", C812147h.A00("www_request_id", jSONObject));
        }
        if (optJSONArray != null) {
            JSONObject jSONObject2 = this.A03;
            StringBuilder sb2 = new StringBuilder();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                try {
                    sb2.append(optJSONArray.get(i2));
                    if (i2 < optJSONArray.length() - 1) {
                        sb2.append(",");
                    }
                } catch (JSONException e3) {
                    Log.e(e3.getMessage());
                }
            }
            jSONObject2.put("path", sb2.toString());
        }
        if (this.A02 == null) {
            this.A02 = A002;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GraphqlError{code=");
        sb.append(this.A01);
        sb.append(", message='");
        sb.append(this.A05);
        sb.append('\'');
        sb.append(", isSilent=");
        sb.append(this.A08);
        sb.append(", description='");
        sb.append(this.A04);
        sb.append('\'');
        sb.append(", isTransient=");
        sb.append(this.A09);
        sb.append(", requiresReAuth=");
        sb.append(this.A0A);
        sb.append(", allowUserRetry=");
        sb.append(this.A07);
        sb.append('}');
        return sb.toString();
    }
}
