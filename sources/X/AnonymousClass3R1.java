package X;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.WaTextView;
import java.util.List;

/* renamed from: X.3R1  reason: invalid class name */
public class AnonymousClass3R1 extends AnonymousClass01X {
    public List A00;
    public final AnonymousClass1PT A01;

    public AnonymousClass3R1(AnonymousClass1PT r1) {
        this.A01 = r1;
    }

    public int A0C() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r6, int i2) {
        AnonymousClass3T1 r62 = (AnonymousClass3T1) r6;
        Object obj = this.A00.get(i2);
        if (r62 instanceof C72783mh) {
            View view = r62.A0H;
            Context context = view.getContext();
            C13690nt.A0s(context, r62.A01, R.string.str01f2);
            r62.A07(AnonymousClass00T.A00(context, R.color.color06b1));
            WaImageButton waImageButton = r62.A00;
            C13700nu.A0L(context, waImageButton, R.drawable.chevron);
            AnonymousClass2SR.A08(waImageButton, AnonymousClass00T.A00(context, R.color.color06c5));
            C34331k5.A04(view, r62, obj, 22);
            C34331k5.A01(waImageButton, r62, 28);
            return;
        }
        C72793mi r63 = (C72793mi) r62;
        C72333lx r4 = (C72333lx) obj;
        WaTextView waTextView = r63.A01;
        C73563oM r2 = r4.A00;
        waTextView.setText(r2.A01);
        r63.A07(Color.parseColor(r2.A00));
        C25661Kq r1 = r63.A00;
        String str = r2.A01;
        WaImageButton waImageButton2 = r63.A00;
        r1.A00(waImageButton2, str);
        View view2 = r63.A0H;
        AnonymousClass2SR.A08(waImageButton2, AnonymousClass00T.A00(view2.getContext(), R.color.color090b));
        C34331k5.A04(view2, r63, r4, 21);
        C34331k5.A01(waImageButton2, r63, 27);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        View A0H = C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout04a4);
        if (i2 == 1) {
            return new C72793mi(A0H, (C25661Kq) this.A01.A00.A01.A70.get());
        }
        if (i2 == 2) {
            return new C72783mh(A0H);
        }
        throw AnonymousClass000.A0V(C13680ns.A0c(i2, "PopularCategoriesAdapter/onCreateViewHolder unhandled view type: "));
    }

    public int getItemViewType(int i2) {
        return ((AnonymousClass4HO) this.A00.get(i2)).A00;
    }
}
