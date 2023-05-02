package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.util.ViewOnClickCListenerShape0S0201000_I1;
import java.util.ArrayList;

/* renamed from: X.39F  reason: invalid class name */
public class AnonymousClass39F {
    public ImageView A00;
    public ImageView A01;
    public final ViewGroup A02;
    public final ImageView A03;
    public final ImageView A04;
    public final TextView A05;
    public final /* synthetic */ AnonymousClass2Uj A06;

    public AnonymousClass39F(View view, AnonymousClass2Uj r5, int i2) {
        this.A06 = r5;
        this.A05 = C13680ns.A0M(view, R.id.date);
        this.A04 = C13680ns.A0K(view, R.id.album_thumb_status);
        ImageView A0K = C13680ns.A0K(view, R.id.thumb);
        this.A03 = A0K;
        C13680ns.A0t(view.getContext(), A0K, R.string.str0095);
        this.A02 = C13700nu.A07(view, R.id.album_thumbnail_date_wrapper);
        A0K.setOnClickListener(new ViewOnClickCListenerShape0S0201000_I1(this, i2, r5, 1));
        C30011bb.A0K(A0K, r5);
    }

    public final void A00(ImageView imageView, int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        C13680ns.A0t(imageView.getContext(), imageView, i2);
        C45902Bo.A08(imageView, this.A06.A0K, 0, i3);
    }

    public void A01(C16730tY r5, ArrayList arrayList) {
        ImageView imageView = this.A03;
        C28381Vw r3 = r5.A11;
        C13680ns.A1W(imageView, C47612Jr.A04(r3.toString()), arrayList);
        TextView textView = this.A05;
        if (textView.getVisibility() == 0) {
            C13680ns.A1W(textView, C47612Jr.A03(r5), arrayList);
        }
        ImageView imageView2 = this.A04;
        if (imageView2 != null) {
            StringBuilder sb = new StringBuilder("status-transition-");
            sb.append(r3);
            C13680ns.A1W(imageView2, sb.toString(), arrayList);
        }
    }
}
