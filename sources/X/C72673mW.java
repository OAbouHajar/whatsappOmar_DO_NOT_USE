package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxLListenerShape145S0100000_2_I1;
import com.obwhatsapp.R;

/* renamed from: X.3mW  reason: invalid class name and case insensitive filesystem */
public class C72673mW extends C72823ml {
    public final AnonymousClass02W A00;
    public final RecyclerView A01;
    public final C17180uf A02;
    public final C64553Qt A03;

    public C72673mW(View view, C17180uf r6) {
        super(view);
        AnonymousClass02W gridLayoutManager;
        this.A02 = r6;
        RecyclerView recyclerView = (RecyclerView) C004601z.A0E(view, R.id.popular_categories_recycler_view);
        this.A01 = recyclerView;
        if (r6.A08()) {
            C004601z.A0E(view, R.id.title_item).setVisibility(8);
            if (recyclerView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(recyclerView);
                A0O.setMargins(0, 0, 0, 0);
                recyclerView.setLayoutParams(A0O);
            }
        }
        boolean A04 = r6.A04();
        view.getContext();
        if (A04) {
            gridLayoutManager = new LinearLayoutManager(0);
        } else {
            View view2 = this.A0H;
            gridLayoutManager = new GridLayoutManager(AnonymousClass3K3.A0F(view2.getResources(), view2));
        }
        this.A00 = gridLayoutManager;
        Resources resources = view.getResources();
        RecyclerView recyclerView2 = this.A01;
        recyclerView2.A0m(new AnonymousClass3RI(resources, this));
        recyclerView2.setLayoutManager(this.A00);
        if (!r6.A04()) {
            recyclerView2.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape145S0100000_2_I1(this, 1));
        }
        this.A03 = new C64553Qt();
    }
}
