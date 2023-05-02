package X;

import android.view.View;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3Si  reason: invalid class name and case insensitive filesystem */
public class C64963Si extends C005602k {
    public final View A00;
    public final LinearLayout A01;
    public final LinearLayout A02;
    public final WaImageView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final AnonymousClass01V A06;
    public final AnonymousClass013 A07;
    public final C17250um A08;
    public final C17020u3 A09;

    public C64963Si(View view, AnonymousClass01V r4, AnonymousClass013 r5, C17250um r6, C17020u3 r7) {
        super(view);
        this.A08 = r6;
        this.A07 = r5;
        this.A06 = r4;
        this.A09 = r7;
        LinearLayout linearLayout = (LinearLayout) C004601z.A0E(view, R.id.poll_results_option_main_layout);
        this.A02 = linearLayout;
        this.A05 = C13680ns.A0S(view, R.id.poll_results_option);
        this.A04 = C13680ns.A0S(view, R.id.poll_results_option_count);
        this.A03 = C13690nt.A0R(view, R.id.poll_results_option_count_star);
        this.A01 = (LinearLayout) C004601z.A0E(view, R.id.poll_results_option_count_layout);
        this.A00 = C004601z.A0E(view, R.id.poll_results_divider);
        AnonymousClass2JP.A05(linearLayout, true);
    }
}
