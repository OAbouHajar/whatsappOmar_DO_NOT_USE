package X;

import android.util.Log;
import android.util.Pair;
import java.util.List;

/* renamed from: X.3fr  reason: invalid class name and case insensitive filesystem */
public class C69943fr extends AnonymousClass4SR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ List A02;

    public C69943fr(List list, int i2, String str) {
        this.A01 = str;
        this.A00 = i2;
        this.A02 = list;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj) {
        Pair A012 = C89524cN.A01((C31201dg) obj, new C99314tp(this.A01));
        int A0D = AnonymousClass000.A0D(A012.second);
        if (A0D < 0) {
            Log.w("ComponentTree", "insertChildrenRelativeToId: No existing child found with specified ID in parent. New children have not been added to parent.");
        } else {
            ((List) A012.first).addAll(A0D + this.A00, C89524cN.A02(this.A02));
        }
    }
}
