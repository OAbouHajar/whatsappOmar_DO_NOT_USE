package com.obwhatsapp.picker.search;

import X.AnonymousClass00B;
import X.AnonymousClass012;
import X.AnonymousClass01X;
import X.AnonymousClass04o;
import X.AnonymousClass18G;
import X.AnonymousClass1BQ;
import X.AnonymousClass3AQ;
import X.AnonymousClass3H7;
import X.AnonymousClass3PP;
import X.AnonymousClass3QB;
import X.AnonymousClass3q8;
import X.AnonymousClass4Om;
import X.AnonymousClass5QT;
import X.C001500q;
import X.C006602z;
import X.C13680ns;
import X.C13690nt;
import X.C16490t9;
import X.C212613k;
import X.C34151jm;
import X.C34331k5;
import X.C47812Kr;
import X.C57482rF;
import X.C57622rT;
import X.C94374ko;
import X.C95194mF;
import X.C95454mf;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.IDxObjectShape302S0100000_2_I1;
import com.facebook.redex.IDxSListenerShape35S0100000_2_I1;
import com.google.android.material.tabs.TabLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.text.IDxWAdapterShape23S0200000_2_I1;
import java.util.List;

public class StickerSearchDialogFragment extends Hilt_StickerSearchDialogFragment implements AnonymousClass5QT {
    public View A00;
    public ViewTreeObserver.OnGlobalLayoutListener A01;
    public RecyclerView A02;
    public ViewPager A03;
    public TabLayout A04;
    public WaEditText A05;
    public AnonymousClass1BQ A06;
    public C16490t9 A07;
    public C94374ko A08;
    public AnonymousClass3QB A09;
    public C212613k A0A;
    public C57482rF A0B;
    public AnonymousClass18G A0C;
    public Runnable A0D;
    public String A0E = "";
    public final AnonymousClass3AQ A0F = new AnonymousClass3AQ();

    public void A0q() {
        super.A0q();
        this.A05.A04(false);
    }

    public void A0s(Bundle bundle) {
        super.A0s(bundle);
        if (!TextUtils.isEmpty(this.A0E)) {
            bundle.putString("search_term", this.A0E);
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.A11(bundle, layoutInflater, viewGroup);
        Context A022 = A02();
        if (bundle != null) {
            this.A0E = bundle.getString("search_term");
        }
        if (this.A0E == null) {
            this.A0E = "";
        }
        View inflate = layoutInflater.inflate(R.layout.layout0586, viewGroup, false);
        this.A00 = inflate.findViewById(R.id.no_results);
        View findViewById = inflate.findViewById(R.id.get_more_stickers_button);
        if (this.A00 != null) {
            C13680ns.A15(findViewById, this, 3);
        }
        this.A02 = (RecyclerView) inflate.findViewById(R.id.search_result);
        View findViewById2 = inflate.findViewById(R.id.search_bar_container);
        this.A05 = (WaEditText) inflate.findViewById(R.id.search_bar);
        AnonymousClass4Om r7 = new AnonymousClass4Om(A022, viewGroup, this.A02, this.A0B);
        this.A01 = r7.A07;
        this.A02.getViewTreeObserver().addOnGlobalLayoutListener(this.A01);
        this.A02.A0o(new IDxSListenerShape35S0100000_2_I1(this, 5));
        C57622rT r72 = new C57622rT(A03(), r7.A08, this.A04);
        this.A02.A0o(r72);
        RecyclerView recyclerView = this.A02;
        this.A08 = new C94374ko(recyclerView, r72);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this.A08);
        AnonymousClass3QB r0 = (AnonymousClass3QB) new C006602z((AnonymousClass04o) new C95194mF(this.A06), (C001500q) this).A01(AnonymousClass3QB.class);
        this.A09 = r0;
        C13680ns.A1N(A0H(), r0.A00, this, 110);
        C13680ns.A1N(A0H(), this.A09.A01, this, 109);
        if (this.A0B == null) {
            AnonymousClass3H7 r02 = this.A00;
            AnonymousClass00B.A06(r02);
            List list = r02.A05;
            if (list == null) {
                r02.A08.A01();
            } else {
                this.A09.A00.A0B(list);
            }
            C57482rF r73 = new C57482rF(A0u(), this.A00.A00(), this, 1, C13690nt.A0k(this.A09.A01));
            this.A0B = r73;
            this.A02.setAdapter(r73);
        }
        View findViewById3 = inflate.findViewById(R.id.clear_search_btn);
        C34331k5.A03(findViewById3, this, 35);
        this.A05.addTextChangedListener(new IDxWAdapterShape23S0200000_2_I1(findViewById3, 1, this));
        C34331k5.A03(inflate.findViewById(R.id.back), this, 36);
        TabLayout tabLayout = (TabLayout) inflate.findViewById(R.id.sticker_category_tabs);
        this.A04 = tabLayout;
        C13680ns.A1K(this, tabLayout);
        C13680ns.A0u(A0u(), this.A04, R.color.color01ed);
        C13680ns.A0u(A0u(), findViewById2, R.color.color01ed);
        A1O(R.string.str16c5, 0);
        A1O(R.string.str16cb, 1);
        A1O(R.string.str16c9, 2);
        A1O(R.string.str16ca, 3);
        A1O(R.string.str16cc, 4);
        A1O(R.string.str16c6, 5);
        A1O(R.string.str16c7, 6);
        this.A04.setTabMode(0);
        this.A03 = (ViewPager) inflate.findViewById(R.id.sticker_category_viewpager);
        this.A03.setAdapter(new AnonymousClass3PP(A0F()));
        this.A03.setOffscreenPageLimit(7);
        this.A03.A0G(new C95454mf(this.A04));
        this.A04.A0D(new IDxObjectShape302S0100000_2_I1(this, 0));
        this.A05.setText("");
        this.A05.requestFocus();
        this.A05.A04(false);
        this.A07.A06(new AnonymousClass3q8());
        this.A0C.A01();
        return inflate;
    }

    public void A13() {
        this.A02.getViewTreeObserver().removeGlobalOnLayoutListener(this.A01);
        this.A02.getViewTreeObserver().removeGlobalOnLayoutListener(this.A08);
        List list = this.A02.A0b;
        if (list != null) {
            list.clear();
        }
        Runnable runnable = this.A0D;
        if (runnable != null) {
            this.A05.removeCallbacks(runnable);
            this.A0D = null;
        }
        super.A13();
    }

    public final void A1N() {
        View view;
        List A0k = C13690nt.A0k(this.A09.A01);
        List A0k2 = C13690nt.A0k(this.A09.A00);
        boolean isEmpty = TextUtils.isEmpty(this.A0E);
        int i2 = 0;
        TabLayout tabLayout = this.A04;
        if (isEmpty) {
            tabLayout.setVisibility(0);
            if (this.A03.getVisibility() != 0) {
                this.A03.setVisibility(0);
                A1P(true);
            }
            view = this.A00;
            if (A0k2 != null && !A0k2.isEmpty()) {
                i2 = 8;
            }
        } else {
            tabLayout.setVisibility(8);
            if (this.A03.getVisibility() != 8) {
                A1P(false);
                this.A03.setVisibility(8);
            }
            if (A0k == null || A0k.isEmpty()) {
                view = this.A00;
            } else {
                this.A00.setVisibility(8);
                return;
            }
        }
        view.setVisibility(i2);
    }

    public final void A1O(int i2, int i3) {
        this.A04.A0E(C47812Kr.A00(this, this.A04, i2, i3));
    }

    public final void A1P(boolean z2) {
        StickerSearchTabFragment stickerSearchTabFragment;
        C57482rF r0;
        AnonymousClass012 adapter = this.A03.getAdapter();
        if ((adapter instanceof AnonymousClass3PP) && (stickerSearchTabFragment = ((AnonymousClass3PP) adapter).A00) != null && (r0 = stickerSearchTabFragment.A03) != null) {
            r0.A04 = z2;
            stickerSearchTabFragment.A01.setAdapter((AnonymousClass01X) null);
            stickerSearchTabFragment.A01.setAdapter(stickerSearchTabFragment.A03);
        }
    }

    public void AXt(C34151jm r2, Integer num, int i2) {
        AnonymousClass3H7 r0 = this.A00;
        if (r0 != null) {
            r0.AXt(r2, num, i2);
        }
    }
}
