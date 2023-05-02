package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4Qy  reason: invalid class name and case insensitive filesystem */
public abstract class C86034Qy {
    public final String A00;
    public final String A01;

    public C86034Qy(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public void A00(Map map, AnonymousClass1UJ r10) {
        String str;
        if (this instanceof C77603w3) {
            str = this.A00;
            if (map == null) {
                map = AnonymousClass1Z8.A00;
            }
        } else if (this instanceof C77633w6) {
            throw new AnonymousClass1UT(C18450wi.A06("An operation is not implemented: ", "Not yet implemented"));
        } else if (this instanceof C77623w5) {
            C77623w5 r3 = (C77623w5) this;
            if (map == null) {
                map = AnonymousClass1Z8.A00;
            }
            r10.AIV(r3.A00, C89584cU.A02(r3.A00, (Map) C89584cU.A01(map, r3.A01), (Map) C89584cU.A01(map, r3.A02)));
            return;
        } else {
            C77613w4 r1 = (C77613w4) this;
            JSONObject jSONObject = map != null ? new JSONObject(map) : C13700nu.A0J();
            List list = r1.A01;
            String str2 = r1.A00;
            try {
                ArrayList A0u = AnonymousClass000.A0u();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject2 = new JSONObject(AnonymousClass000.A0m(it));
                    if (jSONObject2.has("next")) {
                        String string = jSONObject2.getString("next");
                        C109735Tj A002 = AnonymousClass47B.A00(jSONObject2);
                        if (A002 != null) {
                            C18450wi.A0B(string);
                            A0u.add(new AnonymousClass4IN(A002, string));
                        }
                    }
                }
                AnonymousClass00B.A0B("expected at least 1 choice", AnonymousClass000.A1P(A0u.isEmpty() ? 1 : 0));
                AnonymousClass4IO r4 = new AnonymousClass4IO(str2, A0u);
                String obj = jSONObject.toString();
                C18450wi.A0B(obj);
                AnonymousClass4QM r32 = new AnonymousClass4QM(obj);
                Iterator it2 = r4.A01.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        str = r4.A00;
                        break;
                    }
                    AnonymousClass4IN r12 = (AnonymousClass4IN) it2.next();
                    if (r12.A00.A8i(r32)) {
                        str = r12.A01;
                        break;
                    }
                }
            } catch (JSONException unused) {
                str = null;
            }
        }
        r10.AIV(str, map);
    }
}
