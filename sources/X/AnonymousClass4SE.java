package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;

/* renamed from: X.4SE  reason: invalid class name */
public class AnonymousClass4SE {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public RecyclerView A05;
    public WaButton A06;
    public final Context A07;
    public final ViewGroup A08;
    public final ImageView A09;

    public AnonymousClass4SE(Context context, ViewGroup viewGroup) {
        this.A08 = viewGroup;
        this.A07 = context;
        this.A09 = C13680ns.A0J(viewGroup, R.id.gif_tab);
    }

    public void A00(AnonymousClass3R7 r3) {
        View view = this.A02;
        if (view != null && view.getVisibility() == 0) {
            this.A04.setVisibility(8);
            this.A01.setVisibility(0);
            RecyclerView recyclerView = this.A05;
            if (recyclerView.A0N == null) {
                recyclerView.setAdapter(r3);
            }
        }
    }
}
