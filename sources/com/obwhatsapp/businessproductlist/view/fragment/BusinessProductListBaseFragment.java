package com.obwhatsapp.businessproductlist.view.fragment;

import X.AnonymousClass013;
import X.AnonymousClass1DV;
import X.AnonymousClass1KS;
import X.AnonymousClass1KT;
import X.AnonymousClass2SO;
import X.AnonymousClass2XA;
import X.AnonymousClass2XU;
import X.AnonymousClass38V;
import X.AnonymousClass3F4;
import X.AnonymousClass3PW;
import X.AnonymousClass41I;
import X.AnonymousClass41p;
import X.AnonymousClass4PR;
import X.AnonymousClass4VO;
import X.AnonymousClass5DS;
import X.AnonymousClass5DT;
import X.AnonymousClass5DU;
import X.C005502j;
import X.C100634vx;
import X.C109265Rj;
import X.C14710pd;
import X.C15220qW;
import X.C16320sq;
import X.C16620tM;
import X.C17170ue;
import X.C18450wi;
import X.C18640x1;
import X.C24511Gf;
import X.C28011Tz;
import X.C35701mM;
import X.C50262Yq;
import X.C64433Po;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape34S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.cart.IDxCObserverShape59S0100000_2_I0;
import com.obwhatsapp.biz.catalog.IDxPObserverShape60S0100000_2_I0;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment;
import com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.obwhatsapp.components.Button;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;

public abstract class BusinessProductListBaseFragment extends Hilt_BusinessProductListBaseFragment {
    public RecyclerView A00;
    public AnonymousClass2SO A01;
    public AnonymousClass38V A02;
    public AnonymousClass1KT A03;
    public C24511Gf A04;
    public C28011Tz A05;
    public C18640x1 A06;
    public C17170ue A07;
    public C50262Yq A08;
    public AnonymousClass2XU A09;
    public AnonymousClass41p A0A = AnonymousClass41p.PLM;
    public C109265Rj A0B;
    public Button A0C;
    public AnonymousClass013 A0D;
    public UserJid A0E;
    public AnonymousClass1KS A0F;
    public C16320sq A0G;
    public final AnonymousClass4PR A0H = new IDxCObserverShape59S0100000_2_I0(this, 3);
    public final AnonymousClass4VO A0I = new IDxPObserverShape60S0100000_2_I0(this, 1);
    public final C15220qW A0J = new AnonymousClass1DV(new AnonymousClass5DS(this));
    public final C15220qW A0K = new AnonymousClass1DV(new AnonymousClass5DT(this));
    public final C15220qW A0L = new AnonymousClass1DV(new AnonymousClass5DU(this));

    public void A0k() {
        super.A0k();
        this.A0B = null;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout0297, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.product_list);
        if (findViewById != null) {
            this.A00 = (RecyclerView) findViewById;
            View findViewById2 = inflate.findViewById(R.id.view_cart_button);
            if (findViewById2 != null) {
                this.A0C = (Button) findViewById2;
                return inflate;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.obwhatsapp.components.Button");
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
    }

    public void A12() {
        C50262Yq r0 = this.A08;
        if (r0 != null) {
            r0.A00();
            AnonymousClass1KT r1 = this.A03;
            if (r1 != null) {
                r1.A03(this.A0H);
                C28011Tz r12 = this.A05;
                if (r12 != null) {
                    r12.A03(this.A0I);
                    super.A12();
                    return;
                }
                C18450wi.A0O("productObservers");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            C18450wi.A0O("cartObservers");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        C18450wi.A0O("loadSession");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void A14() {
        super.A14();
        ((C64433Po) this.A0J.getValue()).A03.A00();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.01A] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A16(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 0
            X.C18450wi.A0H(r4, r0)
            super.A16(r4)
            boolean r0 = r4 instanceof X.C109265Rj
            r2 = 0
            if (r0 == 0) goto L_0x0037
            r0 = r4
            X.5Rj r0 = (X.C109265Rj) r0
        L_0x000f:
            r3.A0B = r0
            if (r0 != 0) goto L_0x0039
            X.01A r1 = r3.A0D
            boolean r0 = r1 instanceof X.C109265Rj
            if (r0 == 0) goto L_0x001c
            r2 = r1
            X.5Rj r2 = (X.C109265Rj) r2
        L_0x001c:
            r3.A0B = r2
            if (r2 != 0) goto L_0x0039
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = " must implement BusinessProductListBaseFragment.BusinessProductListHost"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            throw r0
        L_0x0037:
            r0 = r2
            goto L_0x000f
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment.A16(android.content.Context):void");
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        A0a(true);
        Bundle A042 = A04();
        Parcelable parcelable = A042.getParcelable("category_biz_id");
        C18450wi.A0F(parcelable);
        C18450wi.A0B(parcelable);
        UserJid userJid = (UserJid) parcelable;
        C18450wi.A0H(userJid, 0);
        this.A0E = userJid;
        this.A0A = AnonymousClass41p.values()[A042.getInt("business_product_list_entry_point")];
        AnonymousClass38V r3 = this.A02;
        if (r3 != null) {
            UserJid A1D = A1D();
            this.A09 = r3.A00(this, new C100634vx(this), new AnonymousClass3F4(this), A1D);
            C28011Tz r1 = this.A05;
            if (r1 != null) {
                r1.A02(this.A0I);
            } else {
                C18450wi.A0O("productObservers");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        } else {
            C18450wi.A0O("adapterFactory");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        RecyclerView recyclerView = this.A00;
        C18450wi.A0F(recyclerView);
        recyclerView.setAdapter(A1C());
        RecyclerView recyclerView2 = this.A00;
        C18450wi.A0F(recyclerView2);
        recyclerView2.A0o(new IDxSListenerShape34S0100000_2_I0(this, 3));
        RecyclerView recyclerView3 = this.A00;
        C18450wi.A0F(recyclerView3);
        recyclerView3.setItemAnimator((C005502j) null);
        C15220qW r4 = this.A0J;
        ((C64433Po) r4.getValue()).A01.A0A(A0H(), new IDxObserverShape113S0100000_1_I0(this, 23));
        Button button = this.A0C;
        C18450wi.A0F(button);
        button.setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 29));
        AnonymousClass1KT r1 = this.A03;
        if (r1 != null) {
            r1.A02(this.A0H);
            ((C64433Po) r4.getValue()).A00.A0A(A0H(), new IDxObserverShape113S0100000_1_I0(this, 24));
            C15220qW r42 = this.A0K;
            ((AnonymousClass2XA) r42.getValue()).A00.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 67));
            ((AnonymousClass2XA) r42.getValue()).A06();
            return;
        }
        C18450wi.A0O("cartObservers");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final C18640x1 A1B() {
        C18640x1 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C18450wi.A0O("catalogCacheManager");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final AnonymousClass2XU A1C() {
        AnonymousClass2XU r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18450wi.A0O("adapter");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final UserJid A1D() {
        UserJid userJid = this.A0E;
        if (userJid != null) {
            return userJid;
        }
        C18450wi.A0O("bizJid");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void A1E() {
        if (this instanceof CatalogSearchProductListFragment) {
            CatalogSearchProductListFragment catalogSearchProductListFragment = (CatalogSearchProductListFragment) this;
            if (!catalogSearchProductListFragment.A1C().A0I()) {
                C15220qW r0 = catalogSearchProductListFragment.A00;
                CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) r0.getValue();
                String str = (String) ((CatalogSearchViewModel) r0.getValue()).A00.A01();
                if (str == null) {
                    str = "";
                }
                catalogSearchViewModel.A05.A02(AnonymousClass41I.CONTINUE, catalogSearchProductListFragment.A1D(), str);
                return;
            }
            return;
        }
        CollectionProductListFragment collectionProductListFragment = (CollectionProductListFragment) this;
        AnonymousClass3PW r5 = (AnonymousClass3PW) collectionProductListFragment.A08.getValue();
        UserJid A1D = collectionProductListFragment.A1D();
        String A1I = collectionProductListFragment.A1I();
        boolean z2 = false;
        if (collectionProductListFragment.A00 != -1) {
            z2 = true;
        }
        r5.A01.A01(r5.A02.A00, A1D, A1I, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r1.canScrollVertically(1) == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1F() {
        /*
            r3 = this;
            android.view.View r1 = r3.A06()
            r0 = 2131366199(0x7f0a1137, float:1.8352285E38)
            android.view.View r2 = r1.findViewById(r0)
            X.C18450wi.A0B(r2)
            X.2XU r0 = r3.A1C()
            java.util.List r0 = r0.A06
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
            androidx.recyclerview.widget.RecyclerView r1 = r3.A00
            X.C18450wi.A0F(r1)
            r0 = 1
            boolean r1 = r1.canScrollVertically(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0029
        L_0x0027:
            r0 = 8
        L_0x0029:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment.A1F():void");
    }

    public void A1G(C35701mM r13, int i2) {
        if (this instanceof CatalogSearchProductListFragment) {
            CatalogSearchProductListFragment catalogSearchProductListFragment = (CatalogSearchProductListFragment) this;
            UserJid A1D = catalogSearchProductListFragment.A1D();
            String str = r13.A0D;
            C18450wi.A0A(str);
            ((CatalogSearchViewModel) catalogSearchProductListFragment.A00.getValue()).A03.A00(A1D, 3, (Integer) null, Integer.valueOf(i2), str);
            return;
        }
        CollectionProductListFragment collectionProductListFragment = (CollectionProductListFragment) this;
        C14710pd r2 = collectionProductListFragment.A04;
        if (r2 == null) {
            C18450wi.A0O("abProps");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (r2.A0E(C16620tM.A02, 1514) && collectionProductListFragment.A00 != -1) {
            UserJid A1D2 = collectionProductListFragment.A1D();
            String A1I = collectionProductListFragment.A1I();
            int i3 = collectionProductListFragment.A01;
            int i4 = collectionProductListFragment.A00;
            ((AnonymousClass3PW) collectionProductListFragment.A08.getValue()).A00.A00(A1D2, true, Integer.valueOf(i2), Integer.valueOf(i3), A1I, r13.A0D, i4, 3);
        }
    }

    public final void A1H(boolean z2) {
        Button button;
        int i2;
        if (!z2 || A1C().A06.isEmpty()) {
            button = this.A0C;
            C18450wi.A0F(button);
            i2 = 8;
        } else {
            button = this.A0C;
            C18450wi.A0F(button);
            i2 = 0;
        }
        button.setVisibility(i2);
    }
}
