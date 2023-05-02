package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.4nX  reason: invalid class name and case insensitive filesystem */
public class C95944nX implements AnonymousClass5SJ {
    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List list = ((AnonymousClass3U0) obj2).A0B;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                recyclerView.A0o((AnonymousClass071) list.get(i2));
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        List list = ((AnonymousClass3U0) obj).A0B;
        List list2 = ((AnonymousClass3U0) obj2).A0B;
        if (list == list2) {
            return false;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return true;
        }
        return !list.equals(list2);
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List list = ((AnonymousClass3U0) obj2).A0B;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                recyclerView.A0p((AnonymousClass071) list.get(i2));
            }
        }
    }
}
