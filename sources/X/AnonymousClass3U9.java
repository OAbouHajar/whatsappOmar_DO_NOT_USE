package X;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.3U9  reason: invalid class name */
public final class AnonymousClass3U9 extends C15270qb implements C15280qc {
    public static final AnonymousClass3U9 A00 = new AnonymousClass3U9();

    public String A00() {
        return "user_scope";
    }

    public JSONObject Agp() {
        JSONObject A0J = C13700nu.A0J();
        A0J.put("is_user_scoped", false);
        A0J.put("keep_data_between_sessions", false);
        A0J.put("userid_in_path", false);
        A0J.put("keep_data_on_account_removal", false);
        return A0J;
    }

    public boolean equals(Object obj) {
        return obj instanceof AnonymousClass3U9;
    }

    public int hashCode() {
        return Arrays.hashCode(new boolean[]{false, false, false, false});
    }
}
