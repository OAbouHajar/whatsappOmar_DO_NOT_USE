package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.2yW  reason: invalid class name and case insensitive filesystem */
public class C59582yW extends C65013Sn {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final C50262Yq A03;
    public final AnonymousClass013 A04;
    public final UserJid A05;

    public C59582yW(View view, AnonymousClass2W7 r4, C50262Yq r5, OrderDetailFragment orderDetailFragment, AnonymousClass013 r7, UserJid userJid) {
        super(view);
        this.A04 = r7;
        this.A03 = r5;
        this.A02 = C13680ns.A0L(view, R.id.cart_item_title);
        this.A01 = C13680ns.A0L(view, R.id.cart_item_subtitle);
        this.A00 = C13680ns.A0J(view, R.id.cart_item_thumbnail);
        C004601z.A0E(view, R.id.cart_item_quantity_container).setVisibility(8);
        C34331k5.A05(view, this, r4, orderDetailFragment, 3);
        this.A05 = userJid;
    }

    public void A07(AnonymousClass2W8 r9) {
        Context context;
        int i2;
        Object[] objArr;
        C39651sq r1;
        C35671mJ r6 = ((C71353kE) r9).A00;
        this.A02.setText(r6.A05);
        BigDecimal bigDecimal = r6.A03;
        if (bigDecimal == null || (r1 = r6.A02) == null) {
            context = this.A0H.getContext();
            i2 = R.string.str0ed7;
            objArr = new Object[1];
            AnonymousClass000.A1M(objArr, r6.A00, 0);
        } else {
            String A032 = r1.A03(this.A04, bigDecimal, true);
            context = this.A0H.getContext();
            i2 = R.string.str0ed5;
            objArr = C13690nt.A1Z();
            objArr[0] = A032;
            AnonymousClass000.A1M(objArr, r6.A00, 1);
        }
        this.A01.setText(context.getString(i2, objArr));
        ImageView imageView = this.A00;
        C93564jP r4 = r6.A01;
        C50262Yq r3 = this.A03;
        UserJid userJid = this.A05;
        AnonymousClass4H5 r12 = null;
        if (userJid != null) {
            r12 = new AnonymousClass4H5(new AnonymousClass4D4(897465374), userJid);
        }
        C808245s.A00(imageView, r12, r3, r4);
    }
}
