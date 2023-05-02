package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3Sj  reason: invalid class name and case insensitive filesystem */
public class C64973Sj extends C005602k {
    public final View A00;
    public final C16040sK A01;
    public final WaImageView A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final C16000sG A06;
    public final AnonymousClass2Ao A07;
    public final C16440t3 A08;
    public final AnonymousClass013 A09;

    public C64973Sj(View view, C16040sK r3, C16000sG r4, AnonymousClass2Ao r5, C16440t3 r6, AnonymousClass013 r7) {
        super(view);
        this.A08 = r6;
        this.A01 = r3;
        this.A06 = r4;
        this.A09 = r7;
        this.A07 = r5;
        this.A00 = C004601z.A0E(view, R.id.poll_results_user_main_layout);
        this.A02 = C13690nt.A0R(view, R.id.poll_results_user_picture);
        this.A05 = C13680ns.A0S(view, R.id.poll_results_user_name);
        this.A03 = C13680ns.A0S(view, R.id.poll_results_push_name);
        this.A04 = C13680ns.A0S(view, R.id.poll_results_timestamp);
    }
}
