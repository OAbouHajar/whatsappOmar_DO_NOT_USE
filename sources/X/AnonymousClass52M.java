package X;

import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.52M  reason: invalid class name */
public class AnonymousClass52M implements AnonymousClass5Si {
    public ImageView A00;
    public final C16980tz A01;
    public final C18840xL A02;
    public final C16320sq A03;

    public AnonymousClass52M(C16980tz r1, C18840xL r2, C16320sq r3) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }

    public /* bridge */ /* synthetic */ void A5O(Object obj) {
        AnonymousClass4J0 r3 = (AnonymousClass4J0) obj;
        if (r3 != null && r3.A01 != null) {
            this.A00.setImageResource(R.drawable.payment_invite_bubble_icon);
        }
    }

    public int AD5() {
        return R.layout.layout016b;
    }

    public void AZf(View view) {
        this.A00 = C13680ns.A0J(view, R.id.payment_invite_bubble_icon);
    }
}
