package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass23B;
import X.AnonymousClass26B;
import X.AnonymousClass2Z2;
import X.AnonymousClass30B;
import X.AnonymousClass4R9;
import X.C000900k;
import X.C13680ns;
import X.C13700nu;
import X.C16620tM;
import X.C31241dn;
import X.C35611mD;
import X.C57272qc;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

public class IDxPCallbackShape79S0200000_1_I1 implements AnonymousClass23B {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxPCallbackShape79S0200000_1_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void ANn(C35611mD r12) {
        int i2;
        MenuItem add;
        if (this.A02 != 0) {
            AnonymousClass30B r5 = (AnonymousClass30B) this.A00;
            Menu menu = (Menu) this.A01;
            if (r12 == null) {
                return;
            }
            if (!r12.A0N || !r5.A0E.A0E(C16620tM.A02, 957)) {
                if (r5.A03.A00(r12)) {
                    i2 = R.string.str1a18;
                    add = menu.add(0, 30, 1, R.string.str1a18);
                    add.setActionView(R.layout.layout05dd);
                    View actionView = add.getActionView();
                    actionView.setTag(R.id.tag_shop_url, r12.A0D);
                    C13680ns.A0t(r5.A01, actionView, R.string.str1a18);
                } else if (r12.A0L) {
                    i2 = R.string.str19d1;
                    add = menu.add(0, 29, 0, R.string.str19d1);
                    C000900k r2 = r5.A01;
                    ImageView imageView = (ImageView) View.inflate(r2, R.layout.layout05d3, (ViewGroup) null);
                    C13700nu.A0L(r2, imageView, R.drawable.ic_action_view_catalog);
                    C13680ns.A0t(r2, imageView, R.string.str19d1);
                    add.setActionView(imageView);
                } else {
                    return;
                }
                r5.A07(add, i2, true);
                add.setShowAsAction(2);
                return;
            }
            return;
        }
        C57272qc r22 = (C57272qc) this.A00;
        AnonymousClass4R9 r4 = (AnonymousClass4R9) this.A01;
        if (r12 != null) {
            ArrayList A0u = AnonymousClass000.A0u();
            for (C31241dn r0 : r12.A0G) {
                A0u.add(r0.A00);
            }
            AnonymousClass2Z2 r52 = r22.A0H;
            Jid jid = r22.A04;
            AnonymousClass26B r8 = r22.A0O.A00.A01;
            String str = r22.A0K.A0K;
            r52.A02(r22.A0P() ? r22.A05() : null, new AnonymousClass4R9(r4.A00, A0u, r4.A02), r8, jid, str);
        }
    }
}
