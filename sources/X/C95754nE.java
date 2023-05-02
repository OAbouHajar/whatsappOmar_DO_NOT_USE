package X;

import java.util.HashSet;

/* renamed from: X.4nE  reason: invalid class name and case insensitive filesystem */
public class C95754nE implements AnonymousClass5NZ {
    public boolean A8j(HashSet hashSet, String[] strArr) {
        for (String contains : strArr) {
            if (!hashSet.contains(contains)) {
                return false;
            }
        }
        return true;
    }
}
