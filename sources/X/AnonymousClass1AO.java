package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1AO  reason: invalid class name */
public class AnonymousClass1AO {
    public final C16300so A00;

    public AnonymousClass1AO(C16300so r1) {
        this.A00 = r1;
    }

    public String A00(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse.getQueryParameter("oe") == null || parse.getQueryParameter("oh") == null) {
                StringBuilder sb = new StringBuilder("DirectPathUtils/direct_path missing signature or expiry ");
                sb.append(str);
                Log.e(sb.toString());
                this.A00.AcB("DirectPathUtils/verifyDirectPath", (String) null, false);
                return null;
            }
        }
        return str;
    }
}
