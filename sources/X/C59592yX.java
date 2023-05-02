package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxRListenerShape40S0300000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.cart.view.fragment.CartFragment;
import com.obwhatsapp.biz.catalog.view.widgets.QuantitySelector;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/* renamed from: X.2yX  reason: invalid class name and case insensitive filesystem */
public class C59592yX extends C65013Sn {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final AnonymousClass2RR A05;
    public final CartFragment A06;
    public final C50262Yq A07;
    public final QuantitySelector A08;
    public final AnonymousClass013 A09;
    public final UserJid A0A;

    public C59592yX(View view, AnonymousClass2RR r5, AnonymousClass2W7 r6, CartFragment cartFragment, CartFragment cartFragment2, C50262Yq r9, AnonymousClass013 r10, UserJid userJid) {
        super(view);
        this.A09 = r10;
        this.A05 = r5;
        this.A07 = r9;
        this.A06 = cartFragment2;
        this.A04 = C13680ns.A0L(view, R.id.cart_item_title);
        this.A02 = C13680ns.A0L(view, R.id.cart_item_price);
        this.A03 = C13680ns.A0L(view, R.id.cart_item_original_price);
        this.A01 = (LinearLayout) C004601z.A0E(view, R.id.cart_item_price_container);
        QuantitySelector quantitySelector = (QuantitySelector) C004601z.A0E(view, R.id.cart_item_quantity_selector);
        this.A08 = quantitySelector;
        quantitySelector.A04 = new IDxRListenerShape40S0300000_2_I1(r6, this, cartFragment2, 0);
        quantitySelector.A05 = new AnonymousClass3F3(r6, this, cartFragment2);
        this.A00 = C13680ns.A0J(view, R.id.cart_item_thumbnail);
        C34331k5.A05(view, this, cartFragment, r6, 1);
        this.A0A = userJid;
    }

    public void A07(AnonymousClass2W8 r13) {
        AnonymousClass01Q r1;
        C50092Xx r132 = (C50092Xx) r13;
        C50102Xy r7 = r132.A00;
        TextView textView = this.A04;
        C35701mM r2 = r7.A01;
        textView.setText(r2.A04);
        QuantitySelector quantitySelector = this.A08;
        quantitySelector.A04(r7.A00, r2.A08);
        quantitySelector.setVisibility(0);
        long j2 = r7.A00;
        BigDecimal bigDecimal = r2.A05;
        C39651sq r9 = r2.A03;
        C93694jc r12 = r2.A02;
        AnonymousClass013 r8 = this.A09;
        Date date = r132.A01;
        this.A0H.getContext();
        String str = null;
        if (bigDecimal == null || r9 == null) {
            r1 = new AnonymousClass01Q((Object) null, (Object) null);
        } else {
            String A032 = r9.A03(r8, bigDecimal.multiply(BigDecimal.valueOf(j2)), true);
            if (r12 != null && r12.A00(date)) {
                str = r9.A03(r8, r12.A01.multiply(BigDecimal.valueOf(j2)), true);
            }
            r1 = new AnonymousClass01Q(A032, str);
        }
        Object obj = r1.A00;
        if (obj == null) {
            this.A02.setText("$000.00");
            this.A01.setVisibility(4);
        } else {
            this.A01.setVisibility(0);
            Object obj2 = r1.A01;
            TextView textView2 = this.A02;
            if (obj2 == null) {
                textView2.setText((CharSequence) obj);
                this.A03.setVisibility(8);
            } else {
                textView2.setText((CharSequence) obj2);
                TextView textView3 = this.A03;
                textView3.setText((CharSequence) obj);
                textView3.setVisibility(0);
                textView3.setPaintFlags(textView3.getPaintFlags() | 16);
            }
        }
        ImageView imageView = this.A00;
        if (!A08(imageView, r2)) {
            AnonymousClass2RR r0 = this.A05;
            C35701mM A052 = r0.A0F.A05((UserJid) null, r2.A0D);
            if (A052 == null || !A08(imageView, A052)) {
                C808345t.A00(imageView);
            }
        }
    }

    public final boolean A08(ImageView imageView, C35701mM r7) {
        List<C35691mL> list = r7.A06;
        if (!list.isEmpty() && !r7.A02()) {
            for (C35691mL r2 : list) {
                if (r2 != null && !TextUtils.isEmpty(r2.A01)) {
                    C93564jP r4 = new C93564jP(r2.A04, r2.A01);
                    C50262Yq r3 = this.A07;
                    UserJid userJid = this.A0A;
                    AnonymousClass4H5 r1 = null;
                    if (userJid != null) {
                        r1 = new AnonymousClass4H5(new AnonymousClass4D4(897453112), userJid);
                    }
                    C808245s.A00(imageView, r1, r3, r4);
                    return true;
                }
            }
        }
        return false;
    }
}
