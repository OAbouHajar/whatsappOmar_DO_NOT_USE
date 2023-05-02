package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxLListenerShape145S0100000_2_I1;
import com.obwhatsapp.R;

/* renamed from: X.4Om  reason: invalid class name */
public class AnonymousClass4Om {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public RecyclerView A05;
    public C57482rF A06;
    public final ViewTreeObserver.OnGlobalLayoutListener A07 = new IDxLListenerShape145S0100000_2_I1(this, 10);
    public final GridLayoutManager A08;
    public final AnonymousClass07D A09;

    public AnonymousClass4Om(Context context, ViewGroup viewGroup, RecyclerView recyclerView, C57482rF r7) {
        int i2;
        AnonymousClass3RD r2 = new AnonymousClass3RD(this);
        this.A09 = r2;
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.dimen07b3);
        if (viewGroup != null) {
            i2 = viewGroup.getWidth();
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            C19980zJ.A00(context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i2 = displayMetrics.widthPixels;
        }
        this.A04 = i2;
        int i3 = i2 / this.A01;
        this.A00 = i3;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i3 <= 0 ? 1 : i3);
        this.A08 = gridLayoutManager;
        this.A05 = recyclerView;
        this.A06 = r7;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.A0m(r2);
        recyclerView.setItemAnimator((C005502j) null);
    }
}
