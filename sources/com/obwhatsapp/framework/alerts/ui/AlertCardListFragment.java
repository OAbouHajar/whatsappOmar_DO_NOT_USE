package com.obwhatsapp.framework.alerts.ui;

import X.AnonymousClass000;
import X.AnonymousClass04o;
import X.AnonymousClass1JB;
import X.AnonymousClass1PK;
import X.AnonymousClass2KI;
import X.AnonymousClass3K4;
import X.AnonymousClass3Pi;
import X.C001500q;
import X.C006602z;
import X.C109305Rn;
import X.C18080w7;
import X.C18450wi;
import X.C64593Qx;
import X.C82244Cb;
import X.C95184mE;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObserverShape116S0100000_2_I1;
import com.obwhatsapp.R;
import java.util.Iterator;

public final class AlertCardListFragment extends Hilt_AlertCardListFragment implements C109305Rn {
    public RecyclerView A00;
    public C82244Cb A01;
    public C18080w7 A02;
    public AnonymousClass1PK A03;
    public C64593Qx A04;
    public AnonymousClass3Pi A05;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.layout006c, viewGroup, false);
    }

    public void A14() {
        super.A14();
        AnonymousClass3Pi r0 = this.A05;
        if (r0 != null) {
            r0.A00.A09(r0.A01.A02());
            AnonymousClass3Pi r02 = this.A05;
            if (r02 != null) {
                r02.A00.A0A(this, new IDxObserverShape116S0100000_2_I1(this, 90));
                return;
            }
        }
        throw C18450wi.A03("alertListViewModel");
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A05 = (AnonymousClass3Pi) new C006602z((AnonymousClass04o) new C95184mE(this), (C001500q) A0D()).A01(AnonymousClass3Pi.class);
    }

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        this.A00 = (RecyclerView) AnonymousClass3K4.A0L(view, R.id.alert_card_list);
        C64593Qx r1 = new C64593Qx(this, AnonymousClass000.A0u());
        this.A04 = r1;
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            throw C18450wi.A03("alertsList");
        }
        recyclerView.setAdapter(r1);
    }

    public void AOX(AnonymousClass2KI r3) {
        AnonymousClass1PK r0 = this.A03;
        if (r0 != null) {
            Iterator it = r0.A00.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0W("onClick");
            }
            return;
        }
        throw C18450wi.A03("alertActionObserverManager");
    }

    public void APu(AnonymousClass2KI r4) {
        String str;
        AnonymousClass3Pi r1 = this.A05;
        if (r1 == null) {
            str = "alertListViewModel";
        } else {
            String str2 = r4.A06;
            C18080w7 r2 = r1.A01;
            r2.A05(AnonymousClass1JB.A0V(str2));
            r1.A00.A09(r2.A02());
            AnonymousClass1PK r0 = this.A03;
            if (r0 != null) {
                Iterator it = r0.A00.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass000.A0W("onDismiss");
                }
                return;
            }
            str = "alertActionObserverManager";
        }
        throw C18450wi.A03(str);
    }
}
