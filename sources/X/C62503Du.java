package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.facebook.redex.IDxSLookupShape27S0100000_2_I1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Du  reason: invalid class name and case insensitive filesystem */
public class C62503Du implements AnonymousClass5SJ {
    public /* bridge */ /* synthetic */ void A5M(Context context, Object obj, Object obj2, Object obj3) {
        GridLayoutManager gridLayoutManager;
        RecyclerView recyclerView = (RecyclerView) obj;
        AnonymousClass3U0 r9 = (AnonymousClass3U0) obj2;
        AnonymousClass41R r2 = r9.A08;
        AnonymousClass4CJ r1 = r9.A0H;
        C18450wi.A0H(r2, 0);
        C18450wi.A0H(context, 1);
        switch (r2.ordinal()) {
            case 0:
                gridLayoutManager = new LinearLayoutManager(C806845b.A00(r1.A00));
                break;
            case 1:
                C31201dg r12 = r1.A00;
                C85144Nh A00 = AnonymousClass3AG.A00.A00(context, r12);
                int i2 = A00.A02;
                GridLayoutManager gridLayoutManager2 = new GridLayoutManager(i2, A00.A01);
                List<C31201dg> A0L = r12.A0L();
                C18450wi.A0B(A0L);
                ArrayList A0N = AnonymousClass1J9.A0N(A0L);
                for (C31201dg r13 : A0L) {
                    C18450wi.A09(r13);
                    C13690nt.A1O(A0N, AnonymousClass4Xl.A01(r13) ? i2 : AnonymousClass4Xl.A00(r13));
                }
                gridLayoutManager2.A01 = new IDxSLookupShape27S0100000_2_I1(A0N, 0);
                gridLayoutManager = gridLayoutManager2;
                break;
            case 2:
                C85144Nh A002 = AnonymousClass3AG.A00.A00(context, r1.A00);
                gridLayoutManager = new StaggeredGridLayoutManager(A002.A02, A002.A01);
                break;
            default:
                throw new AnonymousClass2Xe();
        }
        if (gridLayoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) gridLayoutManager).A1Z(r9.A0E);
        }
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    public /* bridge */ /* synthetic */ boolean AfR(Object obj, Object obj2, Object obj3, Object obj4) {
        AnonymousClass3U0 r4 = (AnonymousClass3U0) obj;
        AnonymousClass3U0 r5 = (AnonymousClass3U0) obj2;
        return (r4.A08 == r5.A08 && r4.A02 == r5.A02 && r4.A0E == r5.A0E) ? false : true;
    }

    public /* bridge */ /* synthetic */ void Ah6(Context context, Object obj, Object obj2, Object obj3) {
        ((RecyclerView) obj).setLayoutManager((AnonymousClass02W) null);
    }
}
