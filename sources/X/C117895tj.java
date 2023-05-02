package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5tj  reason: invalid class name and case insensitive filesystem */
public abstract class C117895tj {
    public Map A00 = AnonymousClass000.A0x();

    public void A00(C228919r r5, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            if (!TextUtils.isEmpty(A0m)) {
                this.A00.put(A0m.toUpperCase(Locale.US), r5);
            }
        }
    }
}
