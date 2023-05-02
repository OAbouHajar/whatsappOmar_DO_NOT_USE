package X;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: X.0of  reason: invalid class name and case insensitive filesystem */
public final class C14130of {
    public int A00 = 0;
    public final C14110od A01;
    public final Map A02 = new AnonymousClass00N();

    public C14130of(C14110od r2) {
        this.A01 = r2;
    }

    public final String A00() {
        String string;
        C14110od r3 = this.A01;
        synchronized (r3) {
            string = r3.A01.getString("topic_operation_queue", "");
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String[] split = string.split(",");
        if (split.length <= 1 || TextUtils.isEmpty(split[1])) {
            return null;
        }
        return split[1];
    }
}
