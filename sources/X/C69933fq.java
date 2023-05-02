package X;

import android.util.Log;
import android.util.Pair;
import java.util.List;

/* renamed from: X.3fq  reason: invalid class name and case insensitive filesystem */
public class C69933fq extends AnonymousClass4SR {
    public final /* synthetic */ String A00;
    public final /* synthetic */ List A01;

    public C69933fq(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj) {
        Pair A012 = C89524cN.A01((C31201dg) obj, new C99314tp(this.A00));
        int A0D = AnonymousClass000.A0D(A012.second);
        if (A0D < 0) {
            Log.w("ComponentTreeMutator", "replaceChildrenAfter: No existing child found with specified ID in parent. New children have not been added to parent.");
            return;
        }
        List list = (List) A012.first;
        int size = list.size();
        while (true) {
            size--;
            if (size > A0D) {
                list.remove(size);
            } else {
                list.addAll(A0D + 1, C89524cN.A02(this.A01));
                return;
            }
        }
    }
}
