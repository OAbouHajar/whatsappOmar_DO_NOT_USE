package X;

import android.content.Context;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4nW  reason: invalid class name and case insensitive filesystem */
public class C95934nW implements AnonymousClass5SJ {
    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        Parcelable parcelable;
        RecyclerView recyclerView = (RecyclerView) obj;
        AnonymousClass3U0 r5 = (AnonymousClass3U0) obj2;
        recyclerView.setAdapter(r5.A0G);
        recyclerView.setItemAnimator((C005502j) null);
        AnonymousClass4Bp r0 = r5.A09;
        if (r0 == null || (parcelable = r0.A00) == null) {
            int i2 = r5.A04;
            if (i2 >= 0) {
                recyclerView.A0Z(i2);
                return;
            }
            return;
        }
        recyclerView.getLayoutManager().A0p(parcelable);
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        return C13680ns.A1a(((AnonymousClass3U0) obj).A0G, ((AnonymousClass3U0) obj2).A0G);
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        AnonymousClass4Bp r1 = ((AnonymousClass3U0) obj2).A09;
        if (r1 != null) {
            r1.A00 = recyclerView.getLayoutManager().A0f();
        }
        recyclerView.setAdapter((AnonymousClass01X) null);
    }
}
