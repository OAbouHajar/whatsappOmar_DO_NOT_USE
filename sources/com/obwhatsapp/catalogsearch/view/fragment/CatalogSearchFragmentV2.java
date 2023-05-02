package com.obwhatsapp.catalogsearch.view.fragment;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass028;
import X.AnonymousClass1DV;
import X.AnonymousClass1PR;
import X.AnonymousClass267;
import X.AnonymousClass2XT;
import X.AnonymousClass2Xe;
import X.AnonymousClass2Y5;
import X.AnonymousClass2Y6;
import X.AnonymousClass2Y7;
import X.AnonymousClass46G;
import X.AnonymousClass5E7;
import X.AnonymousClass5E8;
import X.AnonymousClass5E9;
import X.C001000l;
import X.C109265Rj;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C15220qW;
import X.C16320sq;
import X.C17030uP;
import X.C18450wi;
import X.C28331Vq;
import X.C32291fz;
import X.C447325i;
import X.C55352jN;
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
import com.facebook.redex.IDxCListenerShape241S0100000_2_I1;
import com.facebook.redex.IDxTListenerShape171S0100000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape16S0100000_I1_1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.whatsapp.jid.UserJid;

public final class CatalogSearchFragmentV2 extends Hilt_CatalogSearchFragmentV2 implements C109265Rj, AnonymousClass2XT {
    public int A00;
    public MenuItem A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public TextView A08;
    public TextView A09;
    public Toolbar A0A;
    public AnonymousClass267 A0B;
    public WaButton A0C;
    public AnonymousClass1PR A0D;
    public AnonymousClass46G A0E;
    public C17030uP A0F;
    public AnonymousClass013 A0G;
    public UserJid A0H;
    public C16320sq A0I;
    public boolean A0J;
    public final C15220qW A0K = new AnonymousClass1DV(new AnonymousClass5E7(this));
    public final C15220qW A0L = new AnonymousClass1DV(new AnonymousClass5E8(this));
    public final C15220qW A0M = new AnonymousClass1DV(new AnonymousClass5E9(this));

    public static final /* synthetic */ C32291fz A01(CatalogSearchFragmentV2 catalogSearchFragmentV2, AnonymousClass2Y5 r5) {
        int i2;
        if (r5 instanceof AnonymousClass2Y7) {
            i2 = R.string.str03ea;
        } else if (r5 instanceof AnonymousClass2Y6) {
            i2 = R.string.str03e6;
        } else {
            throw new AnonymousClass2Xe();
        }
        String A0J2 = catalogSearchFragmentV2.A0J(i2);
        C18450wi.A0B(A0J2);
        if (catalogSearchFragmentV2.A0E != null) {
            String A0J3 = catalogSearchFragmentV2.A0J(R.string.str0e87);
            C18450wi.A0B(A0J3);
            C32291fz A012 = C32291fz.A01(catalogSearchFragmentV2.A06(), A0J2, 4000);
            A012.A09(A0J3, new ViewOnClickCListenerShape16S0100000_I1_1(A012, 49));
            return A012;
        }
        throw C18450wi.A03("config");
    }

    public static final void A02(Bundle bundle, CatalogSearchFragmentV2 catalogSearchFragmentV2) {
        C18450wi.A0H(bundle, 2);
        catalogSearchFragmentV2.A0J = bundle.getBoolean("all_category_has_navigated_to_category_tabs", false);
    }

    public void A0z(Menu menu, MenuInflater menuInflater) {
        C18450wi.A0H(menu, 0);
        C18450wi.A0H(menuInflater, 1);
        MenuItem findItem = menu.findItem(R.id.menuitem_search);
        this.A01 = findItem;
        if (findItem != null) {
            findItem.setVisible(true);
        }
    }

    public boolean A10(MenuItem menuItem) {
        String str;
        View findViewById;
        C18450wi.A0H(menuItem, 0);
        if (R.id.menuitem_search != menuItem.getItemId()) {
            return false;
        }
        View view = this.A02;
        if (view != null) {
            view.setVisibility(0);
        }
        AnonymousClass267 r0 = this.A0B;
        if (r0 == null) {
            str = "searchToolbarHelper";
        } else {
            r0.A02();
            CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) this.A0M.getValue();
            UserJid userJid = this.A0H;
            if (userJid != null) {
                catalogSearchViewModel.A07(userJid, this.A00);
                View view2 = this.A06;
                if (!(view2 == null || (findViewById = view2.findViewById(R.id.search_back)) == null)) {
                    C13680ns.A17(findViewById, this, 0);
                }
                View view3 = this.A06;
                if (view3 != null) {
                    AnonymousClass267.A00(view3);
                }
                AnonymousClass267 r02 = this.A0B;
                if (r02 != null) {
                    TextView textView = (TextView) C18450wi.A00(r02.A02, R.id.search_src_text);
                    textView.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(500)});
                    C13680ns.A0v(A02(), textView, R.color.color06bd);
                    textView.setHintTextColor(AnonymousClass00T.A00(A02(), R.color.color04c0));
                    textView.setTextSize(0, A02().getResources().getDimension(R.dimen.dimen0173));
                    C17030uP r1 = this.A0F;
                    if (r1 != null) {
                        UserJid userJid2 = this.A0H;
                        if (userJid2 != null) {
                            C28331Vq A002 = r1.A00(userJid2);
                            if (A002 != null) {
                                textView.setHint(C13690nt.A0c(this, A002.A08, new Object[1], 0, R.string.str14b1));
                            }
                            AnonymousClass267 r03 = this.A0B;
                            if (r03 != null) {
                                r03.A02.A08 = new IDxCListenerShape241S0100000_2_I1(this, 0);
                                return true;
                            }
                        }
                    } else {
                        str = "verifiedNameManager";
                    }
                }
                throw C18450wi.A03("searchToolbarHelper");
            }
            str = "bizJid";
        }
        throw C18450wi.A03(str);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout029f, viewGroup, false);
        this.A02 = inflate.findViewById(R.id.container_catalog_search);
        this.A03 = inflate.findViewById(R.id.search_call_to_action);
        this.A08 = C13680ns.A0M(inflate, R.id.search_call_to_action_text);
        this.A04 = inflate.findViewById(R.id.search_child_categories_fragment_holder);
        this.A05 = inflate.findViewById(R.id.search_child_products_fragment_holder);
        this.A07 = inflate.findViewById(R.id.search_results_error_view_holder);
        this.A09 = C13680ns.A0M(inflate, R.id.search_results_error_view_text);
        this.A0C = (WaButton) inflate.findViewById(R.id.search_results_error_view_retry_btn);
        return inflate;
    }

    public void A13() {
        super.A13();
        View view = this.A03;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        WaButton waButton = this.A0C;
        if (waButton != null) {
            waButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        this.A0A = null;
        this.A06 = null;
        this.A02 = null;
        this.A08 = null;
        this.A03 = null;
        this.A04 = null;
        this.A05 = null;
        this.A07 = null;
        this.A09 = null;
        this.A0C = null;
    }

    public void A15() {
        super.A15();
        if (this.A0J) {
            this.A0J = false;
            A1E(false);
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        A0a(true);
        Parcelable parcelable = A04().getParcelable("category_biz_id");
        C18450wi.A0F(parcelable);
        C18450wi.A0B(parcelable);
        this.A0H = (UserJid) parcelable;
        this.A00 = A04().getInt("search_entry_point");
    }

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        this.A0A = (Toolbar) A0D().findViewById(R.id.toolbar);
        View findViewById = A0D().findViewById(R.id.search_holder);
        this.A06 = findViewById;
        if (this.A0A == null || findViewById == null) {
            throw AnonymousClass000.A0V("Required @layout/toolbar_with_search not found in host activity");
        }
        C001000l A0D2 = A0D();
        AnonymousClass013 r9 = this.A0G;
        if (r9 != null) {
            this.A0B = new AnonymousClass267(A0D2, this.A06, new IDxTListenerShape171S0100000_2_I1(this, 2), this.A0A, r9);
            View view2 = this.A03;
            if (view2 != null) {
                C13680ns.A17(view2, this, 1);
                C55352jN.A00(view2);
            }
            C15220qW r4 = this.A0M;
            Object value = ((CatalogSearchViewModel) r4.getValue()).A07.getValue();
            C18450wi.A0B(value);
            C13690nt.A1J(A0H(), (AnonymousClass028) value, this, 20);
            C13680ns.A1N(A0H(), ((CatalogSearchViewModel) r4.getValue()).A00, this, 60);
            C13690nt.A1J(A0H(), ((CatalogSearchViewModel) r4.getValue()).A01, this, 19);
            WaButton waButton = this.A0C;
            if (waButton != null) {
                C13680ns.A17(waButton, this, 2);
                return;
            }
            return;
        }
        throw C18450wi.A03("whatsAppLocale");
    }

    public final void A1B() {
        CatalogSearchProductListFragment catalogSearchProductListFragment;
        AnonymousClass267 r0 = this.A0B;
        if (r0 != null) {
            r0.A02.getVisibility();
            AnonymousClass267 r02 = this.A0B;
            if (r02 != null) {
                r02.A02.clearFocus();
                AnonymousClass01A A0B2 = A0F().A0B("SEARCH_RESULT_LIST_FRAGMENT");
                if ((A0B2 instanceof CatalogSearchProductListFragment) && (catalogSearchProductListFragment = (CatalogSearchProductListFragment) A0B2) != null) {
                    catalogSearchProductListFragment.A1I();
                    return;
                }
                return;
            }
        }
        throw C18450wi.A03("searchToolbarHelper");
    }

    public final void A1C(String str) {
        A1B();
        C15220qW r3 = this.A0M;
        CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) r3.getValue();
        UserJid userJid = this.A0H;
        if (userJid != null) {
            catalogSearchViewModel.A08(userJid, str);
            CatalogSearchViewModel catalogSearchViewModel2 = (CatalogSearchViewModel) r3.getValue();
            UserJid userJid2 = this.A0H;
            if (userJid2 != null) {
                catalogSearchViewModel2.A03.A00(userJid2, C13680ns.A0Z(), (Integer) null, (Integer) null, (String) null);
                return;
            }
        }
        throw C18450wi.A03("bizJid");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1D(java.lang.String r5, X.AnonymousClass1DU r6, boolean r7) {
        /*
            r4 = this;
            X.02C r0 = r4.A0F()
            X.01A r3 = r0.A0B(r5)
            if (r3 != 0) goto L_0x000d
            if (r7 != 0) goto L_0x000d
            return
        L_0x000d:
            X.2YO r0 = X.AnonymousClass2YO.A00
            java.lang.String r0 = r0.name()
            boolean r0 = r5.equals(r0)
            r2 = 8
            r1 = 1
            if (r0 == 0) goto L_0x002a
            android.view.View r0 = r4.A04
            if (r0 == 0) goto L_0x003c
            if (r7 == r1) goto L_0x0038
            if (r7 == 0) goto L_0x0039
            X.2Xe r0 = new X.2Xe
            r0.<init>()
            throw r0
        L_0x002a:
            android.view.View r0 = r4.A05
            if (r0 == 0) goto L_0x003c
            if (r7 == r1) goto L_0x0038
            if (r7 == 0) goto L_0x0039
            X.2Xe r0 = new X.2Xe
            r0.<init>()
            throw r0
        L_0x0038:
            r2 = 0
        L_0x0039:
            r0.setVisibility(r2)
        L_0x003c:
            if (r3 != 0) goto L_0x0044
            java.lang.Object r3 = r6.AIT()
            X.01A r3 = (X.AnonymousClass01A) r3
        L_0x0044:
            X.02C r0 = r4.A0F()
            X.050 r2 = new X.050
            r2.<init>(r0)
            boolean r0 = r3.A0c()
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "SEARCH_CATEGORY_FRAGMENT"
            boolean r1 = r5.equals(r0)
            r0 = 2131365920(0x7f0a1020, float:1.8351719E38)
            if (r1 == 0) goto L_0x0061
            r0 = 2131365918(0x7f0a101e, float:1.8351715E38)
        L_0x0061:
            r2.A0D(r3, r5, r0)
        L_0x0064:
            if (r7 == 0) goto L_0x006d
            r2.A08(r3)
        L_0x0069:
            r2.A03()
            return
        L_0x006d:
            r2.A06(r3)
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragmentV2.A1D(java.lang.String, X.1DU, boolean):void");
    }

    public final void A1E(boolean z2) {
        String str;
        View view = this.A02;
        if (view != null && view.getVisibility() == 0) {
            C13700nu.A0P(this.A02);
            AnonymousClass267 r0 = this.A0B;
            if (r0 == null) {
                str = "searchToolbarHelper";
            } else {
                r0.A05(z2);
                CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) this.A0M.getValue();
                UserJid userJid = this.A0H;
                if (userJid == null) {
                    str = "bizJid";
                } else {
                    catalogSearchViewModel.A03.A00(userJid, 7, (Integer) null, (Integer) null, (String) null);
                    return;
                }
            }
            throw C18450wi.A03(str);
        }
    }

    public boolean AHL() {
        View view = this.A02;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        A1E(true);
        C001000l A0D2 = A0D();
        if (A0D2 instanceof C447325i) {
            ((C447325i) A0D2).AOD();
        }
        return true;
    }

    public void AOC(String str) {
    }

    public void AR1(int i2) {
    }
}
