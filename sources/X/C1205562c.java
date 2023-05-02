package X;

import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.62c  reason: invalid class name and case insensitive filesystem */
public class C1205562c implements AnonymousClass5Si {
    public View.OnClickListener A00;
    public ImageView A01;

    public void A00(Integer num) {
        ImageView imageView;
        int i2;
        if (!(this instanceof C114255nS)) {
            if (num == null || 2 != num.intValue()) {
                imageView = this.A01;
                i2 = R.drawable.ic_action_arrow_next;
            } else {
                imageView = this.A01;
                i2 = R.drawable.input_send;
            }
            imageView.setImageResource(i2);
        }
    }

    public /* bridge */ /* synthetic */ void A5O(Object obj) {
        if (!(this instanceof C114255nS)) {
            A00((Integer) obj);
        }
    }

    public int AD5() {
        return this instanceof C114255nS ? ((C114255nS) this) instanceof C114245nR ? R.layout.layout044c : R.layout.layout045e : R.layout.layout055a;
    }

    public void AZf(View view) {
        if (this instanceof C114255nS) {
            C114255nS r2 = (C114255nS) this;
            r2.A00 = view;
            C110105dW.A0r(view, r2, 137);
            r2.A00.setEnabled(false);
            r2.A00.setClickable(false);
            return;
        }
        ImageView A0J = C13680ns.A0J(view, R.id.send_payment_send);
        this.A01 = A0J;
        C110105dW.A0r(A0J, this, 136);
    }
}
