package X;

import android.util.Log;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3fp  reason: invalid class name and case insensitive filesystem */
public class C69923fp extends AnonymousClass4SR {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public C69923fp(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj) {
        String str;
        Pair A012 = C89524cN.A01((C31201dg) obj, new C99314tp(this.A01));
        List list = (List) A012.first;
        int A0D = AnonymousClass000.A0D(A012.second);
        int A002 = C89524cN.A00(new C99314tp(this.A00), list);
        if (A0D == -1) {
            str = "removeChildren: The starting id doesn't exist. No children have been removed.";
        } else if (A002 == -1) {
            str = "removeChildren: The ending id doesn't exist. No children have been removed.";
        } else if (A0D > A002) {
            str = "removeChildren: The starting index is larger than the ending index. No children have been removed.";
        } else {
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                it.next();
                if (i2 > A0D && i2 < A002) {
                    it.remove();
                }
                i2++;
            }
            return;
        }
        Log.w("ComponentTree", str);
    }
}
