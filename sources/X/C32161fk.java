package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.businessproductlist.view.adapter.BusinessProductListAdapter;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1fk  reason: invalid class name and case insensitive filesystem */
public abstract class C32161fk extends C32171fl implements C32181fm, C32191fn {
    public Boolean A00;
    public final C19980zJ A01;
    public final C16040sK A02;
    public final AnonymousClass1KA A03;
    public final C50262Yq A04;
    public final UserJid A05;
    public final List A06 = new ArrayList();

    public C32161fk(C19980zJ r2, C16040sK r3, AnonymousClass1KA r4, C50262Yq r5, UserJid userJid) {
        this.A05 = userJid;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }

    public long A0E(String str) {
        for (C50102Xy r1 : this.A06) {
            if (r1.A01.A0D.equals(str)) {
                return r1.A00;
            }
        }
        return 0;
    }

    public C65123Sy A0F(ViewGroup viewGroup, int i2) {
        if (i2 == 9) {
            return new C71633kk(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout04d6, viewGroup, false));
        }
        throw new IllegalStateException("product-list-base-adapter/onCreateViewHolder/unknown view type");
    }

    public void A0G() {
        boolean z2 = this instanceof BusinessProductListAdapter;
        boolean A0I = A0I();
        if (z2) {
            if (A0I) {
                List list = this.A00;
                ArrayList arrayList = new ArrayList();
                for (Object next : list) {
                    if (next instanceof C71503kX) {
                        arrayList.add(next);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    int indexOf = list.indexOf(next2);
                    list.remove(next2);
                    A04(indexOf);
                }
            }
        } else if (A0I) {
            List list2 = this.A00;
            int size = list2.size() - 2;
            int i2 = (size - 3) + 1;
            if (i2 < 0) {
                Log.w("CollectionProductListBaseAdapter/hideLoadingView/hideLoadingView invalied end pos");
                i2 = 0;
            }
            while (size >= i2) {
                Object obj = list2.get(size);
                if (obj instanceof C71503kX) {
                    list2.remove(obj);
                    A04(size);
                }
                size--;
            }
        }
    }

    public void A0H() {
        if (!(this instanceof BusinessProductListAdapter)) {
            List list = this.A00;
            if (list.size() != 0 && !A0I()) {
                int i2 = 0;
                do {
                    int size = list.size() - 1;
                    list.add(size, new C71503kX());
                    A03(size);
                    i2++;
                } while (i2 < 3);
            }
        } else if (!A0I()) {
            int i3 = 0;
            do {
                i3++;
                List list2 = this.A00;
                int max = Math.max(0, list2.size() - 1);
                list2.add(max, new C71503kX());
                A03(max);
            } while (i3 < 3);
        }
    }

    public boolean A0I() {
        if (this instanceof BusinessProductListAdapter) {
            List list = this.A00;
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (next instanceof C71503kX) {
                    arrayList.add(next);
                }
            }
            return !arrayList.isEmpty();
        }
        List list2 = this.A00;
        if (list2.size() < 2) {
            return false;
        }
        return list2.get(list2.size() - 2) instanceof C71503kX;
    }

    public boolean AAU() {
        Boolean bool = this.A00;
        return bool != null && bool.booleanValue();
    }

    public int ACa(int i2) {
        while (i2 >= 0) {
            if (AIu(i2)) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public C35701mM AFE(int i2) {
        return ((C50072Xv) this.A00.get(i2)).A01;
    }

    public boolean AIu(int i2) {
        List list = this.A00;
        return i2 < list.size() && i2 >= 0 && ((C50082Xw) list.get(i2)).A00 == 14;
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r3, int i2) {
        C65123Sy r32 = (C65123Sy) r3;
        if (getItemViewType(i2) == 2) {
            ((C59672yj) r32).A00 = ((C71523kZ) this.A00.get(i2)).A00;
        }
        r32.A08((C50082Xw) this.A00.get(i2));
    }

    public boolean AfG() {
        return true;
    }
}
