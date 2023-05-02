package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0;
import com.obwhatsapp.R;

/* renamed from: X.52m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1037252m implements AnonymousClass2NR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C42821yj A01;

    public /* synthetic */ C1037252m(C42821yj r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public final void ASD(View view) {
        C42821yj r4 = this.A01;
        int i2 = this.A00;
        ImageView imageView = (ImageView) AnonymousClass00T.A05((Activity) r4.A22, R.id.payment_button);
        C218315p r2 = r4.A3P;
        Context context = imageView.getContext();
        int A0A = r2.A0A(r4.A3J.A01());
        imageView.setImageDrawable(A0A != 0 ? AnonymousClass00T.A04(context, A0A) : null);
        imageView.setOnClickListener(new ViewOnClickCListenerShape1S0101000_I0(r4, i2, 5));
        r4.A0A = AnonymousClass00T.A05((Activity) r4.A22, R.id.payment_button_nux);
    }
}
