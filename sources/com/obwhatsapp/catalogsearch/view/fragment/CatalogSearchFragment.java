package com.obwhatsapp.catalogsearch.view.fragment;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01X;
import X.AnonymousClass028;
import X.AnonymousClass1DV;
import X.AnonymousClass1J9;
import X.AnonymousClass1KS;
import X.AnonymousClass1KT;
import X.AnonymousClass1PR;
import X.AnonymousClass267;
import X.AnonymousClass2SO;
import X.AnonymousClass2XA;
import X.AnonymousClass2XT;
import X.AnonymousClass2XV;
import X.AnonymousClass2Xe;
import X.AnonymousClass2Y5;
import X.AnonymousClass2Y6;
import X.AnonymousClass2Y7;
import X.AnonymousClass38V;
import X.AnonymousClass41I;
import X.AnonymousClass46G;
import X.AnonymousClass4PR;
import X.AnonymousClass5E0;
import X.AnonymousClass5E1;
import X.AnonymousClass5E2;
import X.AnonymousClass5E3;
import X.AnonymousClass5E4;
import X.AnonymousClass5E5;
import X.C001000l;
import X.C004601z;
import X.C005502j;
import X.C106475Dz;
import X.C15220qW;
import X.C16320sq;
import X.C17030uP;
import X.C17170ue;
import X.C18450wi;
import X.C24511Gf;
import X.C28331Vq;
import X.C32161fk;
import X.C32291fz;
import X.C447325i;
import X.C49982Xa;
import X.C55352jN;
import X.C73333ni;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCListenerShape240S0100000_2_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape34S0100000_2_I0;
import com.facebook.redex.IDxTListenerShape170S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape8S0100000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.biz.cart.IDxCObserverShape59S0100000_2_I0;
import com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.obwhatsapp.components.Button;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CatalogSearchFragment extends Hilt_CatalogSearchFragment implements AnonymousClass2XT {
    public int A00;
    public MenuItem A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public TextView A09;
    public TextView A0A;
    public Toolbar A0B;
    public RecyclerView A0C;
    public AnonymousClass2SO A0D;
    public AnonymousClass38V A0E;
    public AnonymousClass267 A0F;
    public WaButton A0G;
    public AnonymousClass1KT A0H;
    public C24511Gf A0I;
    public AnonymousClass1PR A0J;
    public C17170ue A0K;
    public AnonymousClass46G A0L;
    public Button A0M;
    public C17030uP A0N;
    public AnonymousClass013 A0O;
    public UserJid A0P;
    public AnonymousClass1KS A0Q;
    public C16320sq A0R;
    public boolean A0S;
    public boolean A0T;
    public final AnonymousClass4PR A0U = new IDxCObserverShape59S0100000_2_I0(this, 4);
    public final C15220qW A0V = new AnonymousClass1DV(new C106475Dz(this));
    public final C15220qW A0W = new AnonymousClass1DV(new AnonymousClass5E0(this));
    public final C15220qW A0X = new AnonymousClass1DV(new AnonymousClass5E1(this));
    public final C15220qW A0Y = new AnonymousClass1DV(new AnonymousClass5E2(this));
    public final C15220qW A0Z = new AnonymousClass1DV(new AnonymousClass5E3(this));
    public final C15220qW A0a = new AnonymousClass1DV(new AnonymousClass5E4(this));
    public final C15220qW A0b = new AnonymousClass1DV(new AnonymousClass5E5(this));

    public static final /* synthetic */ C32291fz A01(CatalogSearchFragment catalogSearchFragment, AnonymousClass2Y5 r5) {
        int i2;
        if (r5 instanceof AnonymousClass2Y7) {
            i2 = R.string.str03ea;
        } else if (r5 instanceof AnonymousClass2Y6) {
            i2 = R.string.str03e6;
        } else {
            throw new AnonymousClass2Xe();
        }
        String A0J2 = catalogSearchFragment.A0J(i2);
        C18450wi.A0B(A0J2);
        if (catalogSearchFragment.A0L != null) {
            String A0J3 = catalogSearchFragment.A0J(R.string.str0e87);
            C18450wi.A0B(A0J3);
            C32291fz A012 = C32291fz.A01(catalogSearchFragment.A06(), A0J2, 4000);
            A012.A09(A0J3, new ViewOnClickCListenerShape8S0100000_I0_1(A012, 26));
            return A012;
        }
        C18450wi.A0O("config");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static final List A02(AnonymousClass2XV r3) {
        List list = r3.A00;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof C73333ni) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(AnonymousClass1J9.A0M(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C73333ni) it.next()).A00);
        }
        return arrayList2;
    }

    public static final void A03(Bundle bundle, CatalogSearchFragment catalogSearchFragment) {
        C18450wi.A0H(bundle, 2);
        catalogSearchFragment.A0S = bundle.getBoolean("all_category_has_navigated_to_category_tabs", false);
    }

    public void A0z(Menu menu, MenuInflater menuInflater) {
        C18450wi.A0H(menu, 0);
        C18450wi.A0H(menuInflater, 1);
        MenuItem findItem = menu.findItem(R.id.menuitem_search);
        C18450wi.A0B(findItem);
        this.A01 = findItem;
        findItem.setVisible(true);
    }

    public boolean A10(MenuItem menuItem) {
        C18450wi.A0H(menuItem, 0);
        if (R.id.menuitem_search != menuItem.getItemId()) {
            return false;
        }
        View view = this.A02;
        if (view == null) {
            C18450wi.A0O("containerSearch");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        view.setVisibility(0);
        AnonymousClass267 r0 = this.A0F;
        if (r0 == null) {
            C18450wi.A0O("searchToolbarHelper");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        r0.A02();
        CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) this.A0b.getValue();
        UserJid userJid = this.A0P;
        if (userJid == null) {
            C18450wi.A0O("bizJid");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        catalogSearchViewModel.A07(userJid, this.A00);
        View view2 = this.A05;
        if (view2 == null) {
            C18450wi.A0O("searchMenuHolderView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        view2.findViewById(R.id.search_back).setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 28));
        View view3 = this.A05;
        if (view3 == null) {
            C18450wi.A0O("searchMenuHolderView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        AnonymousClass267.A00(view3);
        AnonymousClass267 r02 = this.A0F;
        if (r02 == null) {
            C18450wi.A0O("searchToolbarHelper");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        View A0E2 = C004601z.A0E(r02.A02, R.id.search_src_text);
        C18450wi.A0B(A0E2);
        TextView textView = (TextView) A0E2;
        textView.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(500)});
        textView.setTextColor(AnonymousClass00T.A00(A02(), R.color.color06bd));
        textView.setHintTextColor(AnonymousClass00T.A00(A02(), R.color.color04c0));
        textView.setTextSize(0, A02().getResources().getDimension(R.dimen.dimen0173));
        C17030uP r1 = this.A0N;
        if (r1 != null) {
            UserJid userJid2 = this.A0P;
            if (userJid2 == null) {
                C18450wi.A0O("bizJid");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            C28331Vq A002 = r1.A00(userJid2);
            if (A002 != null) {
                textView.setHint(A0K(R.string.str14b1, A002.A08));
            }
            AnonymousClass267 r03 = this.A0F;
            if (r03 == null) {
                C18450wi.A0O("searchToolbarHelper");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            r03.A02.A08 = new IDxCListenerShape240S0100000_2_I0(this, 0);
            return true;
        }
        C18450wi.A0O("verifiedNameManager");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout029e, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.container_catalog_search);
        C18450wi.A0B(findViewById);
        this.A02 = findViewById;
        View findViewById2 = inflate.findViewById(R.id.search_call_to_action);
        C18450wi.A0B(findViewById2);
        this.A03 = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.search_call_to_action_text);
        C18450wi.A0B(findViewById3);
        this.A09 = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.list_search_result);
        C18450wi.A0B(findViewById4);
        this.A0C = (RecyclerView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.search_child_fragment_holder);
        C18450wi.A0B(findViewById5);
        this.A04 = findViewById5;
        View findViewById6 = inflate.findViewById(R.id.search_result_list_holder);
        C18450wi.A0B(findViewById6);
        this.A06 = findViewById6;
        View findViewById7 = inflate.findViewById(R.id.view_cart);
        C18450wi.A0B(findViewById7);
        this.A0M = (Button) findViewById7;
        View findViewById8 = inflate.findViewById(R.id.shadow_bottom_search_result_list);
        C18450wi.A0B(findViewById8);
        this.A07 = findViewById8;
        View findViewById9 = inflate.findViewById(R.id.search_results_error_view_holder);
        C18450wi.A0B(findViewById9);
        this.A08 = findViewById9;
        View findViewById10 = inflate.findViewById(R.id.search_results_error_view_text);
        C18450wi.A0B(findViewById10);
        this.A0A = (TextView) findViewById10;
        View findViewById11 = inflate.findViewById(R.id.search_results_error_view_retry_btn);
        C18450wi.A0B(findViewById11);
        this.A0G = (WaButton) findViewById11;
        return inflate;
    }

    public void A12() {
        AnonymousClass1KT r1 = this.A0H;
        if (r1 != null) {
            r1.A03(this.A0U);
            super.A12();
            return;
        }
        C18450wi.A0O("cartObservers");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void A14() {
        super.A14();
        ((C49982Xa) this.A0Y.getValue()).A04.A00();
    }

    public void A15() {
        super.A15();
        if (this.A0S) {
            this.A0S = false;
            A1G(false);
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        A0a(true);
        Parcelable parcelable = A04().getParcelable("category_biz_id");
        C18450wi.A0F(parcelable);
        C18450wi.A0B(parcelable);
        this.A0P = (UserJid) parcelable;
        this.A00 = A04().getInt("search_entry_point");
    }

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        View findViewById = A0D().findViewById(R.id.toolbar);
        C18450wi.A0B(findViewById);
        this.A0B = (Toolbar) findViewById;
        View findViewById2 = A0D().findViewById(R.id.search_holder);
        C18450wi.A0B(findViewById2);
        this.A05 = findViewById2;
        if (this.A0B == null) {
            C18450wi.A0O("toolbarView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        C001000l A0D2 = A0D();
        AnonymousClass013 r6 = this.A0O;
        if (r6 != null) {
            View view2 = this.A05;
            if (view2 == null) {
                C18450wi.A0O("searchMenuHolderView");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            Toolbar toolbar = this.A0B;
            if (toolbar == null) {
                C18450wi.A0O("toolbarView");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            this.A0F = new AnonymousClass267(A0D2, view2, new IDxTListenerShape170S0100000_2_I0(this, 3), toolbar, r6);
            View view3 = this.A03;
            if (view3 == null) {
                C18450wi.A0O("searchCallToActionView");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            view3.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 29));
            View view4 = this.A03;
            if (view4 == null) {
                C18450wi.A0O("searchCallToActionView");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            C55352jN.A00(view4);
            RecyclerView recyclerView = this.A0C;
            if (recyclerView == null) {
                C18450wi.A0O("searchResultList");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            recyclerView.setAdapter((AnonymousClass01X) this.A0V.getValue());
            RecyclerView recyclerView2 = this.A0C;
            if (recyclerView2 == null) {
                C18450wi.A0O("searchResultList");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            recyclerView2.A0o(new IDxSListenerShape34S0100000_2_I0(this, 6));
            RecyclerView recyclerView3 = this.A0C;
            if (recyclerView3 == null) {
                C18450wi.A0O("searchResultList");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            recyclerView3.setItemAnimator((C005502j) null);
            C15220qW r4 = this.A0b;
            Object value = ((CatalogSearchViewModel) r4.getValue()).A07.getValue();
            C18450wi.A0B(value);
            ((AnonymousClass028) value).A0A(A0H(), new IDxObserverShape113S0100000_1_I0(this, 30));
            ((CatalogSearchViewModel) r4.getValue()).A00.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 91));
            ((CatalogSearchViewModel) r4.getValue()).A01.A0A(A0H(), new IDxObserverShape113S0100000_1_I0(this, 29));
            C15220qW r42 = this.A0Y;
            ((C49982Xa) r42.getValue()).A01.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 92));
            Button button = this.A0M;
            if (button == null) {
                C18450wi.A0O("viewCartButton");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            button.setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 34));
            AnonymousClass1KT r1 = this.A0H;
            if (r1 != null) {
                r1.A02(this.A0U);
                ((C49982Xa) r42.getValue()).A00.A0A(A0H(), new IDxObserverShape113S0100000_1_I0(this, 28));
                C15220qW r43 = this.A0W;
                ((AnonymousClass2XA) r43.getValue()).A00.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 93));
                ((AnonymousClass2XA) r43.getValue()).A06();
                WaButton waButton = this.A0G;
                if (waButton == null) {
                    C18450wi.A0O("searchResultsErrorViewRetryButton");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                } else {
                    waButton.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_1(this, 27));
                }
            } else {
                C18450wi.A0O("cartObservers");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        } else {
            C18450wi.A0O("whatsAppLocale");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public final String A1B() {
        String str = (String) ((CatalogSearchViewModel) this.A0b.getValue()).A00.A01();
        return str == null ? "" : str;
    }

    public final void A1C() {
        AnonymousClass267 r0 = this.A0F;
        if (r0 == null) {
            C18450wi.A0O("searchToolbarHelper");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        r0.A02.getVisibility();
        AnonymousClass267 r02 = this.A0F;
        if (r02 == null) {
            C18450wi.A0O("searchToolbarHelper");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        r02.A02.clearFocus();
        C32161fk r1 = (C32161fk) this.A0V.getValue();
        r1.A00.clear();
        r1.A06.clear();
        r1.A01();
    }

    public final void A1D() {
        RecyclerView recyclerView = this.A0C;
        if (recyclerView == null) {
            C18450wi.A0O("searchResultList");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            if (linearLayoutManager.A06() - (linearLayoutManager.A05() + linearLayoutManager.A19()) <= 4 && !((C32161fk) this.A0V.getValue()).A0I() && !this.A0T) {
                CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) this.A0b.getValue();
                String A1B = A1B();
                UserJid userJid = this.A0P;
                if (userJid == null) {
                    C18450wi.A0O("bizJid");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                C18450wi.A0H(A1B, 0);
                catalogSearchViewModel.A05.A02(AnonymousClass41I.CONTINUE, userJid, A1B);
            }
        }
    }

    public final void A1E() {
        View view;
        int i2;
        if (!((C32161fk) this.A0V.getValue()).A06.isEmpty()) {
            RecyclerView recyclerView = this.A0C;
            if (recyclerView == null) {
                C18450wi.A0O("searchResultList");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else if (recyclerView.canScrollVertically(1)) {
                view = this.A07;
                if (view == null) {
                    C18450wi.A0O("searchResultListShadowBottom");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                i2 = 0;
                view.setVisibility(i2);
            }
        }
        view = this.A07;
        if (view == null) {
            C18450wi.A0O("searchResultListShadowBottom");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        i2 = 8;
        view.setVisibility(i2);
    }

    public final void A1F(String str) {
        this.A0T = false;
        A1C();
        C15220qW r3 = this.A0b;
        CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) r3.getValue();
        UserJid userJid = this.A0P;
        if (userJid == null) {
            C18450wi.A0O("bizJid");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        catalogSearchViewModel.A08(userJid, str);
        CatalogSearchViewModel catalogSearchViewModel2 = (CatalogSearchViewModel) r3.getValue();
        UserJid userJid2 = this.A0P;
        if (userJid2 == null) {
            C18450wi.A0O("bizJid");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            catalogSearchViewModel2.A03.A00(userJid2, 2, (Integer) null, (Integer) null, (String) null);
        }
    }

    public final void A1G(boolean z2) {
        View view = this.A02;
        if (view == null) {
            C18450wi.A0O("containerSearch");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (view.getVisibility() == 0) {
            View view2 = this.A02;
            if (view2 == null) {
                C18450wi.A0O("containerSearch");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            view2.setVisibility(8);
            AnonymousClass267 r0 = this.A0F;
            if (r0 == null) {
                C18450wi.A0O("searchToolbarHelper");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            r0.A05(z2);
            CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) this.A0b.getValue();
            UserJid userJid = this.A0P;
            if (userJid == null) {
                C18450wi.A0O("bizJid");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else {
                catalogSearchViewModel.A03.A00(userJid, 7, (Integer) null, (Integer) null, (String) null);
            }
        }
    }

    public final void A1H(boolean z2) {
        Button button;
        int i2;
        if (!z2 || ((C32161fk) this.A0V.getValue()).A06.isEmpty()) {
            button = this.A0M;
            if (button == null) {
                C18450wi.A0O("viewCartButton");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            i2 = 8;
        } else {
            button = this.A0M;
            if (button == null) {
                C18450wi.A0O("viewCartButton");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            i2 = 0;
        }
        button.setVisibility(i2);
    }

    public boolean AHL() {
        View view = this.A02;
        if (view == null) {
            C18450wi.A0O("containerSearch");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (view.getVisibility() != 0) {
            return false;
        } else {
            A1G(true);
            C001000l A0D2 = A0D();
            if (A0D2 instanceof C447325i) {
                ((C447325i) A0D2).AOD();
            }
            return true;
        }
    }
}
