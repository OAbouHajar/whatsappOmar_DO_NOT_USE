package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.5mO  reason: invalid class name and case insensitive filesystem */
public class C113645mO extends C111045fF {
    public final Context A00;
    public final View A01;
    public final Button A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextEmojiLabel A06;
    public final AnonymousClass01V A07;

    public C113645mO(View view, AnonymousClass01V r3) {
        super(view);
        this.A07 = r3;
        this.A00 = view.getContext();
        this.A02 = (Button) C004601z.A0E(view, R.id.complaint_button);
        this.A01 = C004601z.A0E(view, R.id.transaction_complaint_status);
        this.A03 = C13680ns.A0J(view, R.id.transaction_complaint_status_icon);
        this.A05 = C13680ns.A0L(view, R.id.transaction_complaint_status_title);
        this.A04 = C13680ns.A0L(view, R.id.transaction_complaint_status_subtitle);
        this.A06 = C13680ns.A0Q(view, R.id.transaction_complaint_status_time);
    }
}
