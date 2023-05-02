package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxLListenerShape60S0200000_2_I1;
import com.obwhatsapp.R;

/* renamed from: X.3mX  reason: invalid class name and case insensitive filesystem */
public class C72683mX extends C72823ml {
    public final AnonymousClass02W A00;
    public final RecyclerView A01;
    public final C17180uf A02;
    public final AnonymousClass3R1 A03;

    public C72683mX(View view, C17180uf r6, AnonymousClass3R1 r7, AnonymousClass013 r8) {
        super(view);
        this.A02 = r6;
        C004601z.A0E(view, R.id.nearby_title).setVisibility(r6.A08() ? 8 : 0);
        this.A01 = (RecyclerView) C004601z.A0E(view, R.id.popular_categories_recycler_view);
        boolean A04 = r6.A04();
        view.getContext();
        AnonymousClass02W linearLayoutManager = A04 ? new LinearLayoutManager(0) : new GridLayoutManager(AnonymousClass3K3.A0F(view.getResources(), view));
        this.A00 = linearLayoutManager;
        RecyclerView recyclerView = this.A01;
        recyclerView.setLayoutManager(linearLayoutManager);
        if (!this.A02.A04()) {
            recyclerView.A0m(new AnonymousClass3RG(r8, view.getResources().getDimensionPixelSize(R.dimen.dimen0656)));
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape60S0200000_2_I1(this, 1, view));
        } else if (view instanceof LinearLayout) {
            ((LinearLayout) view).setGravity(3);
        }
        this.A03 = r7;
    }
}
