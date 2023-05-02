package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.1vV  reason: invalid class name and case insensitive filesystem */
public class C41261vV {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final UserJid A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public C41261vV(C41271vW r3) {
        this.A04 = r3.A05;
        this.A06 = r3.A07;
        this.A05 = r3.A06;
        this.A01 = r3.A03;
        this.A03 = r3.A04;
        this.A07 = r3.A02;
        this.A00 = r3.A00;
        this.A02 = r3.A01;
    }

    public String A00() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uj", this.A04.getRawString());
        jSONObject.put("s", this.A06);
        String str = this.A05;
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("a", str);
        }
        jSONObject.put("ct", this.A01);
        jSONObject.put("lit", this.A03);
        jSONObject.put("hcslm", this.A07);
        int i2 = this.A00;
        if (i2 != -1) {
            jSONObject.put("brc", i2);
        }
        long j2 = this.A02;
        if (j2 != -1) {
            jSONObject.put("fmts", j2);
        }
        return jSONObject.toString();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C41261vV r7 = (C41261vV) obj;
            if (!(this.A04.getRawString().equals(r7.A04.getRawString()) && TextUtils.equals(this.A06, r7.A06) && TextUtils.equals(this.A05, r7.A05) && this.A01 == r7.A01 && this.A03 == r7.A03 && this.A00 == r7.A00 && this.A07 == r7.A07 && this.A02 == r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A06, this.A05, Long.valueOf(this.A01), Integer.valueOf(this.A00), Boolean.valueOf(this.A07), Long.valueOf(this.A03), Long.valueOf(this.A02)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EntryPointConversionData{userJid=");
        sb.append(this.A04);
        sb.append(", source='");
        sb.append(this.A06);
        sb.append('\'');
        sb.append(", app='");
        sb.append(this.A05);
        sb.append('\'');
        sb.append(", creationTimeMillis=");
        sb.append(this.A01);
        sb.append(", bizCount=");
        sb.append(this.A00);
        sb.append(", hasUserSentLastMessage=");
        sb.append(this.A07);
        sb.append(", lastInteractionTimeMillis=");
        sb.append(this.A03);
        sb.append(", firstMessageTsSeconds=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
