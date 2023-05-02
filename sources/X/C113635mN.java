package X;

import android.content.Context;
import android.view.View;
import android.widget.ListView;
import com.obwhatsapp.R;

/* renamed from: X.5mN  reason: invalid class name and case insensitive filesystem */
public class C113635mN extends C111045fF {
    public View A00;
    public ListView A01;
    public boolean A02 = false;
    public final Context A03;
    public final AnonymousClass01V A04;
    public final C1222969a A05;

    public C113635mN(View view, AnonymousClass01V r3, C1222969a r4) {
        super(view);
        this.A04 = r3;
        this.A05 = r4;
        this.A03 = view.getContext();
        this.A00 = C004601z.A0E(view, R.id.view_more_row);
        this.A01 = (ListView) C004601z.A0E(view, R.id.timeline_list_view);
    }
}
