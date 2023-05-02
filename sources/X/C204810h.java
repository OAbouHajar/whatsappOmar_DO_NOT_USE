package X;

import com.whatsapp.voipcalling.Voip;
import org.json.JSONObject;

/* renamed from: X.10h  reason: invalid class name and case insensitive filesystem */
public class C204810h extends AnonymousClass10W {
    public final C204710g A00;
    public final C18380wb A01;
    public final AnonymousClass10U A02;

    public C204810h(C204710g r1, C18380wb r2, AnonymousClass10U r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public String A00(C15880s3 r3, JSONObject jSONObject) {
        if (!this.A02.A02(r3, jSONObject.getJSONObject("payload").getString("call_id")).equals(Voip.getCurrentCallId())) {
            return AnonymousClass10W.A00(17, "There is no call with that call id");
        }
        this.A01.A00(this.A00);
        return AnonymousClass10W.A01((Object) null);
    }
}
