package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageView;

/* renamed from: X.5mQ  reason: invalid class name and case insensitive filesystem */
public class C113665mQ extends C111045fF {
    public final Context A00;
    public final View A01;
    public final ImageView A02;
    public final ProgressBar A03;
    public final RelativeLayout A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextEmojiLabel A08;
    public final WaImageView A09;
    public final C23071Aj A0A;
    public final C17160ud A0B;
    public final C17200uh A0C;
    public final AnonymousClass01V A0D;
    public final C17110uY A0E;

    public C113665mQ(View view, C23071Aj r4, C17160ud r5, C17200uh r6, AnonymousClass01V r7, C17110uY r8) {
        super(view);
        this.A0C = r6;
        this.A0B = r5;
        this.A0E = r8;
        this.A0A = r4;
        this.A0D = r7;
        this.A00 = view.getContext();
        this.A06 = C13680ns.A0L(view, R.id.payment_send_action);
        this.A07 = C13680ns.A0L(view, R.id.payment_send_action_time);
        this.A05 = C13680ns.A0L(view, R.id.payment_people_info);
        this.A04 = (RelativeLayout) C004601z.A0E(view, R.id.payment_people_container);
        this.A02 = C13680ns.A0J(view, R.id.payment_people_icon);
        this.A03 = (ProgressBar) C004601z.A0E(view, R.id.payment_people_progress_bar);
        View A0E2 = C004601z.A0E(view, R.id.incentive_info_container);
        this.A01 = A0E2;
        this.A08 = C13680ns.A0Q(A0E2, R.id.incentive_info_text);
        this.A09 = C13690nt.A0R(view, R.id.open_indicator);
    }
}
