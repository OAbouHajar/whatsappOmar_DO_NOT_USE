package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3B1  reason: invalid class name */
public class AnonymousClass3B1 {
    public static final AnonymousClass00F A00 = new AnonymousClass00F(1, 1);

    public static boolean A00(C14870pt r3, AnonymousClass01V r4, String str) {
        ClipboardManager A0B = r4.A0B();
        if (A0B != null) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            try {
                A0B.setPrimaryClip(ClipData.newPlainText(str, str));
                r3.A09(R.string.str0c1c, 0);
                return true;
            } catch (NullPointerException | SecurityException e2) {
                Log.e("invitelink/copy/npe", e2);
            }
        }
        r3.A09(R.string.str19d7, 0);
        return false;
    }

    public static boolean A01(C14710pd r2, List list) {
        return r2.A0E(C16620tM.A01, 815) && C16030sJ.A0S(list);
    }
}
