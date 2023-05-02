package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;

/* renamed from: X.5mP  reason: invalid class name and case insensitive filesystem */
public class C113655mP extends C111045fF {
    public final Context A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextEmojiLabel A05;
    public final WaTextView A06;
    public final AnonymousClass01V A07;

    public C113655mP(View view, AnonymousClass01V r3) {
        super(view);
        this.A07 = r3;
        this.A00 = view.getContext();
        this.A06 = C13680ns.A0S(view, R.id.status_icon);
        this.A03 = C13680ns.A0L(view, R.id.transaction_status);
        this.A04 = C13680ns.A0L(view, R.id.transaction_time);
        this.A05 = C13680ns.A0Q(view, R.id.status_error_text);
        this.A02 = C13680ns.A0L(view, R.id.status_tertiary_text);
        this.A01 = C13680ns.A0L(view, R.id.status_action_button);
    }
}
