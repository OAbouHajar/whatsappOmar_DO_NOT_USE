package X;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2NJ  reason: invalid class name */
public class AnonymousClass2NJ {
    public static final Set A00 = new HashSet(Arrays.asList(new String[]{"audio", "image", "video", "kyc-id", "sticker", "document", "ptt", "gif", "md-app-state", "md-msg-hist", "ppic"}));

    public static Set A00(C28371Vv r6, Set set) {
        if (r6 == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        C28371Vv[] r4 = r6.A03;
        if (r4 != null) {
            for (C28371Vv r1 : r4) {
                if (set == null || set.contains(r1.A00)) {
                    hashSet.add(r1.A00);
                }
            }
        }
        return hashSet;
    }
}
