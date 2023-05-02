package X;

import android.util.Log;
import android.util.Pair;
import java.util.List;

/* renamed from: X.3fn  reason: invalid class name and case insensitive filesystem */
public class C69903fn extends AnonymousClass4SR {
    public final /* synthetic */ String A00;

    public C69903fn(String str) {
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj) {
        Pair A01 = C89524cN.A01((C31201dg) obj, new C99314tp(this.A00));
        int A0D = AnonymousClass000.A0D(A01.second);
        if (A0D < 0) {
            Log.w("ComponentTreeMutator", "removeChildById: No existing child found with specified ID in parent. No child has been removed from the parent.");
        } else {
            ((List) A01.first).remove(A0D);
        }
    }
}
