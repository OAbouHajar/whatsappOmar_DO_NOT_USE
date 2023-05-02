package X;

import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.cart.view.fragment.CartFragment;
import com.obwhatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.2rK  reason: invalid class name and case insensitive filesystem */
public class C57532rK extends AnonymousClass01X implements AnonymousClass2W7 {
    public final C82314Ci A00;
    public final C50262Yq A01;
    public final OrderDetailFragment A02;
    public final UserJid A03;
    public final List A04 = AnonymousClass000.A0u();

    public C57532rK(C82314Ci r2, C50262Yq r3, OrderDetailFragment orderDetailFragment, UserJid userJid) {
        this.A01 = r3;
        this.A02 = orderDetailFragment;
        this.A00 = r2;
        this.A03 = userJid;
    }

    public int A0C() {
        return this.A04.size();
    }

    public AnonymousClass2W8 ABo(int i2) {
        return (AnonymousClass2W8) this.A04.get(i2);
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r2, int i2) {
        ((C65013Sn) r2).A07((AnonymousClass2W8) this.A04.get(i2));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            return new C59572yV(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout038b), (CartFragment) null);
        }
        if (i2 == 1) {
            C82314Ci r2 = this.A00;
            C50262Yq r6 = this.A01;
            OrderDetailFragment orderDetailFragment = this.A02;
            UserJid userJid = this.A03;
            return new C59582yW(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout038c), this, r6, orderDetailFragment, C16150sX.A0Z(r2.A00.A04), userJid);
        } else if (i2 == 2) {
            return new C71373kG(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout0392));
        } else {
            throw AnonymousClass000.A0V("CartItemsAdapter/onCreateViewHolder/unhandled view type");
        }
    }

    public int getItemViewType(int i2) {
        return ((AnonymousClass2W8) this.A04.get(i2)).A00;
    }
}
