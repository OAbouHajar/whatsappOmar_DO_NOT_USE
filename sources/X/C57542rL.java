package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2rL  reason: invalid class name and case insensitive filesystem */
public class C57542rL extends AnonymousClass01X implements C32191fn {
    public C95374mX A00;
    public Boolean A01;
    public final C16040sK A02;
    public final C17170ue A03;
    public final C50262Yq A04;
    public final AnonymousClass5RY A05;
    public final AnonymousClass013 A06;
    public final UserJid A07;
    public final List A08 = AnonymousClass000.A0u();
    public final List A09 = AnonymousClass000.A0u();

    public C57542rL(C16040sK r2, C17170ue r3, C50262Yq r4, AnonymousClass5RY r5, AnonymousClass013 r6, UserJid userJid) {
        this.A07 = userJid;
        this.A02 = r2;
        this.A06 = r6;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r5;
    }

    public void A07(C005602k r2) {
        if (r2 instanceof C71633kk) {
            ((C65123Sy) r2).A07();
        }
    }

    public void A09(RecyclerView recyclerView) {
        this.A00 = new C95374mX(recyclerView, this);
    }

    public int A0C() {
        return this.A09.size();
    }

    public boolean A0E() {
        List list = this.A09;
        return list.size() > 0 && (list.get(0) instanceof C100384vY);
    }

    public boolean AAU() {
        Boolean bool = this.A01;
        return bool != null && bool.booleanValue();
    }

    public C35701mM AFE(int i2) {
        return ((C100414vb) this.A09.get(i2)).A00;
    }

    public void ANf(C005602k r7, int i2) {
        long j2;
        int itemViewType = getItemViewType(i2);
        if (itemViewType == 1) {
            String str = ((C100404va) this.A09.get(i2)).A00;
            WaTextView waTextView = ((C71583kf) r7).A00;
            waTextView.setText(str);
            waTextView.setContentDescription(C13680ns.A0d(waTextView.getContext(), str, new Object[1], 0, R.string.str130d));
        } else if (itemViewType == 0) {
            C35701mM AFE = AFE(i2);
            C59652yh r72 = (C59652yh) r7;
            String str2 = AFE.A0D;
            Iterator it = this.A08.iterator();
            while (true) {
                if (!it.hasNext()) {
                    j2 = 0;
                    break;
                }
                C50102Xy r1 = (C50102Xy) it.next();
                if (r1.A01.A0D.equals(str2)) {
                    j2 = r1.A00;
                    break;
                }
            }
            r72.A08(new C50072Xv(AFE, j2));
        } else if (itemViewType == 2) {
            new C71503kX();
            ((C71633kk) r7).A09();
        } else if (itemViewType != 3) {
            throw AnonymousClass000.A0V(C13680ns.A0c(itemViewType, "Unsupported view type - "));
        }
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        if (i2 == 1) {
            return new C71583kf(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout04d8));
        }
        if (i2 == 0) {
            Context context = viewGroup.getContext();
            UserJid userJid = this.A07;
            C16040sK r2 = this.A02;
            AnonymousClass013 r10 = this.A06;
            C50262Yq r5 = this.A04;
            C17170ue r3 = this.A03;
            AnonymousClass5RY r9 = this.A05;
            AnonymousClass4D4 r4 = new AnonymousClass4D4(897460699);
            View A0H = C13680ns.A0H(LayoutInflater.from(context), viewGroup, R.layout.layout00c1);
            AnonymousClass2JP.A02(A0H);
            return new C59652yh(A0H, r2, r3, r4, r5, this, (C32201fo) null, (C108585Oo) null, r9, r10, userJid);
        } else if (i2 == 2) {
            return new C71633kk(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout04d6));
        } else {
            if (i2 == 3) {
                return new C71563kd(C13680ns.A0H(LayoutInflater.from(viewGroup.getContext()), viewGroup, R.layout.layout00c0));
            }
            throw AnonymousClass000.A0V(C13680ns.A0c(i2, "Unsupported view type - "));
        }
    }

    public int getItemViewType(int i2) {
        return ((C108505Og) this.A09.get(i2)).getType();
    }
}
