package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxDListenerShape159S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.38W  reason: invalid class name */
public class AnonymousClass38W {
    public final C25651Kp A00;

    public AnonymousClass38W(C25651Kp r1) {
        this.A00 = r1;
    }

    public void A00(Context context, AnonymousClass5ST r13) {
        View inflate = View.inflate(context, R.layout.layout022c, (ViewGroup) null);
        TextView A0L = C13680ns.A0L(inflate, R.id.permission_message);
        ImageView A0J = C13680ns.A0J(inflate, R.id.permission_image);
        TextEmojiLabel A0Q = C13680ns.A0Q(inflate, R.id.learn_more_view);
        this.A00.A00(context, A0Q, context.getString(R.string.str01bb), "security-and-privacy", "how-to-select-a-location-when-looking-for-businesses-nearby");
        A0L.setText(R.string.str11d7);
        A0J.setImageResource(R.drawable.permission_location);
        View A0E = C004601z.A0E(inflate, R.id.submit);
        View A0E2 = C004601z.A0E(inflate, R.id.cancel);
        C32241fu A002 = C32241fu.A00(context);
        A002.setView(inflate);
        A002.A07(true);
        C005702l create = A002.create();
        create.setOnDismissListener(new IDxDListenerShape159S0100000_2_I1(r13, 1));
        if (create.getWindow() != null) {
            create.getWindow().setBackgroundDrawable(new ColorDrawable(AnonymousClass00T.A00(context, R.color.color0792)));
        }
        C13680ns.A1B(A0E, r13, create, 16);
        C13680ns.A1B(A0E2, create, r13, 15);
        create.setCanceledOnTouchOutside(false);
        create.show();
    }
}
