package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.3pa  reason: invalid class name and case insensitive filesystem */
public class C74003pa extends C65063Ss {
    public final View A00;
    public final TextView A01;

    public C74003pa(View view) {
        super(view);
        this.A00 = C004601z.A0E(view, R.id.icebreaker_question_root);
        this.A01 = C13680ns.A0L(view, R.id.icebreaker_question);
        ImageView A0J = C13680ns.A0J(view, R.id.icebreaker_questions_send_icon);
        A0J.setClickable(false);
        AnonymousClass2SR.A08(A0J, AnonymousClass00T.A00(view.getContext(), R.color.color0659));
    }
}
