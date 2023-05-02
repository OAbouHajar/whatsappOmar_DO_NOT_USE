package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.4nZ  reason: invalid class name and case insensitive filesystem */
public class C95964nZ implements AnonymousClass5SJ {
    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List<AnonymousClass07D> list = ((AnonymousClass3U0) obj2).A0A;
        if (list != null) {
            for (AnonymousClass07D A0m : list) {
                recyclerView.A0m(A0m);
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        return !AnonymousClass09S.A00(((AnonymousClass3U0) obj).A0A, ((AnonymousClass3U0) obj2).A0A);
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List<AnonymousClass07D> list = ((AnonymousClass3U0) obj2).A0A;
        if (list != null) {
            for (AnonymousClass07D A0n : list) {
                recyclerView.A0n(A0n);
            }
        }
    }
}
