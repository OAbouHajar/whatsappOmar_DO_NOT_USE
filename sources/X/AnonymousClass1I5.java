package X;

import org.json.JSONObject;

/* renamed from: X.1I5  reason: invalid class name */
public abstract class AnonymousClass1I5 extends AnonymousClass14O {
    public AnonymousClass2JV A01(JSONObject jSONObject) {
        String str;
        String string;
        if (jSONObject != null) {
            String string2 = jSONObject.getString("status");
            String A00 = AnonymousClass2JS.A00(string2);
            if (!A00.equals("UNKNOWN_IN_CLIENT")) {
                String str2 = null;
                if (jSONObject.isNull("reason") || (string = jSONObject.getString("reason")) == null) {
                    str = null;
                } else {
                    str = "OOPS";
                    if (!str.equals(string)) {
                        str = "OTHER";
                    }
                }
                if (!jSONObject.isNull("reason_url")) {
                    str2 = jSONObject.getString("reason_url");
                }
                return new AnonymousClass2JV(A00, str, str2);
            }
            StringBuilder sb = new StringBuilder("State is invalid in ban appeal status: ");
            sb.append(string2);
            sb.append(", ");
            sb.append(this instanceof AnonymousClass1I7 ? "whatsapp_support_process_ban_appeal_request" : "whatsapp_support_ban_appeal_status");
            throw new Exception(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Value of ");
        sb2.append(this instanceof AnonymousClass1I7 ? "whatsapp_support_process_ban_appeal_request" : "whatsapp_support_ban_appeal_status");
        sb2.append(" is null while submitting ban appeal");
        throw new Exception(sb2.toString());
    }
}
