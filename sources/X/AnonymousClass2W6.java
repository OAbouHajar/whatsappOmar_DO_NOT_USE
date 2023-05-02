package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: X.2W6  reason: invalid class name */
public class AnonymousClass2W6 extends AnonymousClass01X implements AnonymousClass2W7 {
    public Date A00 = new Date();
    public final AnonymousClass4CU A01;
    public final AnonymousClass2RR A02;
    public final CartFragment A03;
    public final CartFragment A04;
    public final C50262Yq A05;
    public final C14710pd A06;
    public final UserJid A07;
    public final List A08 = new ArrayList();

    public AnonymousClass2W6(AnonymousClass4CU r2, AnonymousClass2RR r3, CartFragment cartFragment, CartFragment cartFragment2, C50262Yq r6, C14710pd r7, UserJid userJid) {
        this.A06 = r7;
        this.A05 = r6;
        this.A03 = cartFragment;
        this.A02 = r3;
        this.A04 = cartFragment2;
        this.A01 = r2;
        this.A07 = userJid;
    }

    public int A0C() {
        return this.A08.size();
    }

    public int A0E() {
        int i2 = 0;
        for (AnonymousClass2W8 r1 : this.A08) {
            if (r1 instanceof C50092Xx) {
                i2 = (int) (((long) i2) + ((C50092Xx) r1).A00.A00);
            }
        }
        return i2;
    }

    public List A0F() {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass2W8 r1 : this.A08) {
            if (r1 instanceof C50092Xx) {
                arrayList.add(((C50092Xx) r1).A00);
            }
        }
        return arrayList;
    }

    public AnonymousClass2W8 ABo(int i2) {
        return (AnonymousClass2W8) this.A08.get(i2);
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r2, int i2) {
        ((C65013Sn) r2).A07((AnonymousClass2W8) this.A08.get(i2));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            return new C59572yV(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout038b, viewGroup, false), this.A03);
        } else if (i2 == 1) {
            AnonymousClass4CU r3 = this.A01;
            AnonymousClass2RR r6 = this.A02;
            C50262Yq r10 = this.A05;
            return new C59592yX(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout038d, viewGroup, false), r6, this, this.A03, this.A04, r10, (AnonymousClass013) r3.A00.A04.AR8.get(), this.A07);
        } else if (i2 == 2) {
            return new C71383kH(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout038a, viewGroup, false));
        } else {
            throw new IllegalStateException("CartItemsAdapter/onCreateViewHolder/unhandled view type");
        }
    }

    public int getItemViewType(int i2) {
        return ((AnonymousClass2W8) this.A08.get(i2)).A00;
    }
}
