package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2Gh  reason: invalid class name and case insensitive filesystem */
public class C46802Gh extends AnonymousClass1V3 {
    public final C16570tH A00;
    public final AnonymousClass115 A01;
    public final AnonymousClass1GL A02;
    public final AnonymousClass112 A03;
    public final AnonymousClass1GM A04;
    public final C205110k A05;
    public final AnonymousClass111 A06;
    public final C15940sA A07;

    public C46802Gh(C16570tH r1, AnonymousClass115 r2, AnonymousClass1GL r3, AnonymousClass112 r4, AnonymousClass1GM r5, C205110k r6, AnonymousClass111 r7, C15940sA r8) {
        this.A01 = r2;
        this.A03 = r4;
        this.A07 = r8;
        this.A00 = r1;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final void A01(C46812Gi r5) {
        if (r5 != null) {
            try {
                AnonymousClass115 r3 = this.A01;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", r5.A00);
                jSONObject.putOpt("payload", r5.A01);
                r3.A00(jSONObject.toString(), true);
            } catch (JSONException unused) {
                Log.e("StellaEventHandler/failed to create event");
            }
        }
    }
}
