package X;

import java.lang.ref.Reference;
import java.util.Map;

/* renamed from: X.20n  reason: invalid class name */
public final /* synthetic */ class AnonymousClass20n implements AnonymousClass03O {
    public final boolean test(Object obj) {
        return ((Reference) ((Map.Entry) obj).getValue()).get() == null;
    }
}
