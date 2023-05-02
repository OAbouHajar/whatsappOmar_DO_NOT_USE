package com.facebook.redex;

import X.AnonymousClass071;
import X.AnonymousClass1KA;
import X.AnonymousClass2GH;
import X.C004601z;
import X.C13690nt;
import X.C14710pd;
import X.C16620tM;
import X.C23061Ai;
import X.C32131fh;
import X.C57242qY;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;
import com.obwhatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment;
import com.whatsapp.jid.UserJid;

public class IDxSListenerShape33S0100000_1_I0 extends AnonymousClass071 {
    public Object A00;
    public final int A01;

    public IDxSListenerShape33S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(RecyclerView recyclerView, int i2, int i3) {
        AnonymousClass2GH A02;
        View view;
        if (this.A01 != 0) {
            BusinessApiHomeFragment businessApiHomeFragment = (BusinessApiHomeFragment) this.A00;
            if (businessApiHomeFragment.A04.A0E(C16620tM.A02, 2806)) {
                BusinessApiSearchActivity A1B = businessApiHomeFragment.A1B();
                if (businessApiHomeFragment.A00.canScrollVertically(-1)) {
                    A1B.A37();
                    C004601z.A0X(A1B.findViewById(R.id.search_toolbar_container), A1B.getResources().getDimension(R.dimen.dimen005d));
                } else {
                    Menu menu = A1B.A00;
                    if (!(menu == null || menu.findItem(1) == null)) {
                        A1B.A00.removeItem(1);
                    }
                    A1B.A05 = false;
                    C004601z.A0X(A1B.findViewById(R.id.search_toolbar_container), 0.0f);
                }
            }
            if (i3 != 0 && recyclerView.A0B == 1 && C23061Ai.A00(businessApiHomeFragment.A0A) && (view = businessApiHomeFragment.A0A) != null) {
                businessApiHomeFragment.A06.A01(view);
            }
        } else if (recyclerView.A0B != 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager.A06() - (linearLayoutManager.A05() + linearLayoutManager.A19()) <= 4) {
                C32131fh r0 = (C32131fh) this.A00;
                C57242qY r5 = r0.A0G;
                UserJid userJid = r0.A0K;
                boolean A0I = r5.A0B.A0I(userJid);
                C14710pd r2 = r5.A0L;
                int i4 = 582;
                if (A0I) {
                    i4 = 451;
                }
                if (!r2.A0E(C16620tM.A02, i4) || ((A02 = r5.A0C.A02(userJid)) != null && !A02.A01)) {
                    AnonymousClass1KA r3 = r5.A0G;
                    int i5 = r5.A04;
                    int i6 = 1;
                    if (r3.A07.A0I(userJid)) {
                        i6 = 4;
                    }
                    r3.A06(userJid, i5, i6 * 6, false);
                } else {
                    AnonymousClass1KA r32 = r5.A0G;
                    r32.A05(userJid, r5.A04, C13690nt.A00(r32.A07.A0I(userJid) ? 1 : 0) << 2, false);
                }
                recyclerView.post(new RunnableRunnableShape12S0200000_I1(this, 46, recyclerView));
            }
        }
    }
}
