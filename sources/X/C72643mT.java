package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;

/* renamed from: X.3mT  reason: invalid class name and case insensitive filesystem */
public class C72643mT extends C72823ml {
    public final RecyclerView A00;
    public final AnonymousClass3R8 A01;

    public C72643mT(View view, AnonymousClass3R8 r5) {
        super(view);
        RecyclerView recyclerView = (RecyclerView) C004601z.A0E(view, R.id.search_filter_recycler_view);
        this.A00 = recyclerView;
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        this.A01 = r5;
    }
}
