package X;

import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.3BB  reason: invalid class name */
public class AnonymousClass3BB {
    public static final Map A0E = new AnonymousClass5C5();
    public final C15830rv A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final JSONObject A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public AnonymousClass3BB(C15830rv r1, UserJid userJid, String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = str;
        this.A06 = str2;
        this.A0A = z2;
        this.A0B = z3;
        this.A09 = z4;
        this.A0C = z5;
        this.A0D = z6;
        this.A07 = str3;
        this.A04 = str5;
        this.A02 = str4 != null ? str4 : str;
        this.A00 = r1;
        this.A01 = userJid;
        this.A08 = jSONObject;
        this.A05 = str6;
    }

    public Bundle A00() {
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putString("data", this.A03);
        A0D2.putString("source", this.A06);
        A0D2.putBoolean("has_ib", this.A0A);
        A0D2.putBoolean("has_wm", this.A0B);
        A0D2.putBoolean("ads_logging_requires_tos", this.A09);
        A0D2.putBoolean("show_ad_attribution", this.A0C);
        A0D2.putBoolean("show_keyboard", this.A0D);
        A0D2.putString("icebreaker", this.A04);
        A0D2.putString("ctwa_context", this.A02);
        A0D2.putString("source_url", this.A07);
        UserJid userJid = this.A01;
        String str = null;
        A0D2.putString("jid", userJid != null ? userJid.getRawString() : null);
        JSONObject jSONObject = this.A08;
        if (jSONObject != null) {
            str = jSONObject.toString();
        }
        A0D2.putString("biz_info", str);
        A0D2.putString("productId", this.A05);
        return A0D2;
    }
}
