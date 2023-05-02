package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1b4  reason: invalid class name and case insensitive filesystem */
public class C29711b4 {
    public final String A00;
    public final Map A01;

    public C29711b4() {
        if (!TextUtils.isEmpty("wa_stash__gif_preview_cache")) {
            this.A00 = "wa_stash__gif_preview_cache";
            this.A01 = new HashMap();
            return;
        }
        throw new IllegalArgumentException("feature should always be set");
    }
}
