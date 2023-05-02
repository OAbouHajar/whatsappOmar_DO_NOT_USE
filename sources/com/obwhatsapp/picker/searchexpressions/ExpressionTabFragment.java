package com.obwhatsapp.picker.searchexpressions;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00X;
import X.AnonymousClass012;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass027;
import X.AnonymousClass028;
import X.AnonymousClass02C;
import X.AnonymousClass1MF;
import X.AnonymousClass1MK;
import X.AnonymousClass3H7;
import X.AnonymousClass3PN;
import X.AnonymousClass4Om;
import X.AnonymousClass5QT;
import X.C001300o;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C34151jm;
import X.C436420x;
import X.C47812Kr;
import X.C47822Ks;
import X.C57482rF;
import X.C57622rT;
import X.C77713wN;
import X.C77723wO;
import X.C82884En;
import X.C94384kp;
import X.C95454mf;
import X.C98984tI;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxSListenerShape35S0100000_2_I1;
import com.google.android.material.tabs.TabLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.collections.MarginCorrectedViewPager;
import com.obwhatsapp.components.Button;
import com.obwhatsapp.picker.searchexpressions.avatars.AvatarExpressionTabFragment;
import com.obwhatsapp.picker.searchexpressions.stickers.StickerExpressionTabFragment;
import java.util.List;

public abstract class ExpressionTabFragment extends Hilt_ExpressionTabFragment implements AnonymousClass5QT {
    public int A00;
    public ViewTreeObserver.OnGlobalLayoutListener A01;
    public ScrollView A02;
    public RecyclerView A03;
    public TabLayout A04;
    public WaImageView A05;
    public MarginCorrectedViewPager A06;
    public Button A07;
    public C14710pd A08;
    public C94384kp A09;
    public AnonymousClass3PN A0A;
    public ExpressionSearchViewModel A0B;
    public C57482rF A0C;

    public void A0w() {
        C57482rF r0 = this.A0C;
        if (r0 != null) {
            r0.A04 = false;
            r0.A01();
        }
        super.A0w();
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass028 r4;
        C001300o A0H;
        int i2;
        AnonymousClass027 r42;
        C001300o A0H2;
        int i3;
        int i4;
        C57482rF r3;
        Context A022 = A02();
        ViewGroup viewGroup2 = viewGroup;
        View A0H3 = C13680ns.A0H(layoutInflater, viewGroup2, R.layout.layout0587);
        this.A03 = (RecyclerView) C004601z.A0E(A0H3, R.id.stickers_tab_search_results);
        this.A02 = (ScrollView) C004601z.A0E(A0H3, R.id.stickers_tab_search_no_results);
        this.A04 = (TabLayout) C004601z.A0E(A0H3, R.id.sticker_category_tabs_layout);
        this.A06 = (MarginCorrectedViewPager) C004601z.A0E(A0H3, R.id.sticker_category_tab_viewpager);
        this.A05 = C13690nt.A0R(A0H3, R.id.no_results_image);
        this.A07 = (Button) C004601z.A0E(A0H3, R.id.get_more_stickers_btn);
        this.A00 = A022.getResources().getDimensionPixelSize(R.dimen.dimen0338);
        ExpressionsSearchDialogFragment A1A = A1A();
        this.A0B = A1A().A08;
        AnonymousClass3H7 r6 = A1A().A00;
        AnonymousClass00B.A06(r6);
        C13680ns.A15(this.A07, r6, 4);
        if (this.A0C == null) {
            List list = r6.A05;
            if (list == null) {
                r6.A08.A01();
            } else {
                A1A.A1P(list);
            }
            boolean z2 = this instanceof StickerExpressionTabFragment;
            ExpressionSearchViewModel expressionSearchViewModel = this.A0B;
            C57482rF r62 = new C57482rF(A022, r6.A00(), this, C13680ns.A0Y(), (List) (z2 ? expressionSearchViewModel.A02 : expressionSearchViewModel.A01).A01());
            this.A0C = r62;
            this.A03.setAdapter(r62);
        }
        RecyclerView recyclerView = this.A03;
        if (!(recyclerView == null || (r3 = this.A0C) == null)) {
            AnonymousClass4Om r8 = new AnonymousClass4Om(A022, viewGroup2, recyclerView, r3);
            IDxSListenerShape35S0100000_2_I1 iDxSListenerShape35S0100000_2_I1 = new IDxSListenerShape35S0100000_2_I1(this, 6);
            C57622rT r5 = new C57622rT(A03(), r8.A08, this.A08);
            this.A01 = r8.A07;
            RecyclerView recyclerView2 = this.A03;
            this.A09 = recyclerView2 != null ? new C94384kp(recyclerView2, r5) : null;
            recyclerView2.A0o(r5);
            this.A03.A0o(iDxSListenerShape35S0100000_2_I1);
            this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A01);
            this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A09);
        }
        boolean z3 = this instanceof StickerExpressionTabFragment;
        if (z3) {
            Button button = this.A07;
            if (button != null) {
                button.setVisibility(0);
            }
            WaImageView waImageView = this.A05;
            if (waImageView != null) {
                waImageView.setImageDrawable(AnonymousClass00X.A04((Resources.Theme) null, A03(), R.drawable.sticker_sad_cuppy));
            }
        } else {
            AvatarExpressionTabFragment avatarExpressionTabFragment = (AvatarExpressionTabFragment) this;
            C13680ns.A13(avatarExpressionTabFragment.A07);
            C34151jm A002 = AnonymousClass1MK.A00(C13680ns.A0X(), "4419714551482730", avatarExpressionTabFragment.A0B.A06());
            WaImageView waImageView2 = avatarExpressionTabFragment.A05;
            if (waImageView2 != null) {
                if (A002 == null) {
                    waImageView2.setImageDrawable((Drawable) null);
                } else {
                    AnonymousClass1MF r82 = avatarExpressionTabFragment.A00;
                    int i5 = avatarExpressionTabFragment.A00;
                    r82.A04(waImageView2, A002, (C436420x) null, 0, i5, i5, true, true);
                    avatarExpressionTabFragment.A05.setTag(R.id.no_results_image, A002.A05);
                }
            }
        }
        TabLayout tabLayout = this.A04;
        if (tabLayout != null) {
            C13680ns.A1K(this, tabLayout);
            C13680ns.A0u(A0u(), this.A04, R.color.color01ed);
            if (z3) {
                A1B(R.string.str16c5, 0);
                A1B(R.string.str16cb, 1);
                A1B(R.string.str16c9, 2);
                A1B(R.string.str16ca, 3);
                A1B(R.string.str16cc, 4);
                A1B(R.string.str16c6, 5);
                i4 = R.string.str16c7;
            } else {
                A1B(R.string.str013d, 0);
                A1B(R.string.str16ca, 1);
                A1B(R.string.str0142, 2);
                A1B(R.string.str0144, 3);
                A1B(R.string.str013e, 4);
                A1B(R.string.str0143, 5);
                i4 = R.string.str0141;
            }
            A1B(i4, 6);
            this.A04.setTabMode(0);
        }
        A0F();
        AnonymousClass02C A0F = A0F();
        AnonymousClass3PN r43 = z3 ? new C77713wN(A0F) : new C77723wO(A0F);
        this.A0A = r43;
        MarginCorrectedViewPager marginCorrectedViewPager = this.A06;
        if (marginCorrectedViewPager != null) {
            marginCorrectedViewPager.setAdapter(r43);
            this.A06.setOffscreenPageLimit(this.A0A.A01());
            this.A06.A0G(new C95454mf(this.A04));
        }
        this.A04.A0D(new C98984tI(this, A1A));
        ExpressionSearchViewModel expressionSearchViewModel2 = this.A0B;
        if (z3) {
            r4 = expressionSearchViewModel2.A02;
            A0H = A0H();
            i2 = 29;
        } else {
            r4 = expressionSearchViewModel2.A01;
            A0H = A0H();
            i2 = 28;
        }
        C13690nt.A1J(A0H, r4, this, i2);
        C13680ns.A1N(A0H(), this.A0B.A0A, this, 111);
        ExpressionSearchViewModel expressionSearchViewModel3 = this.A0B;
        if (z3) {
            r42 = expressionSearchViewModel3.A0C;
            A0H2 = A0H();
            i3 = 116;
        } else {
            r42 = expressionSearchViewModel3.A08;
            A0H2 = A0H();
            i3 = 113;
        }
        C13680ns.A1N(A0H2, r42, this, i3);
        return A0H3;
    }

    public void A13() {
        RecyclerView recyclerView = this.A03;
        AnonymousClass00B.A04(recyclerView);
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this.A01);
            this.A03.getViewTreeObserver().removeOnGlobalLayoutListener(this.A09);
            List list = this.A03.A0b;
            if (list != null) {
                list.clear();
            }
            this.A03 = null;
        }
        this.A02 = null;
        this.A04 = null;
        this.A06 = null;
        this.A05 = null;
        this.A07 = null;
        A1A().A08.A0A.A04(A0H());
        A1A().A08.A0C.A04(A0H());
        A1A().A08.A08.A04(A0H());
        (this instanceof StickerExpressionTabFragment ? A1A().A08.A02 : this.A0B.A01).A04(A0H());
        super.A13();
    }

    public void A14() {
        super.A14();
        C57482rF r0 = this.A0C;
        if (r0 != null) {
            r0.A04 = true;
            r0.A01();
        }
    }

    public final ExpressionsSearchDialogFragment A1A() {
        AnonymousClass01A r1 = this.A0D;
        if (r1 instanceof ExpressionsSearchDialogFragment) {
            return (ExpressionsSearchDialogFragment) r1;
        }
        throw AnonymousClass000.A0a("Parent fragment is not of type ExpressionsSearchDialogFragment");
    }

    public void A1B(int i2, int i3) {
        TabLayout tabLayout = this.A04;
        if (tabLayout != null) {
            C47812Kr A032 = tabLayout.A03();
            A032.A02(i2);
            A032.A06 = Integer.valueOf(i3);
            A032.A04 = C13690nt.A0c(this, A0J(i2), C13680ns.A1b(), 0, R.string.str16c8);
            C47822Ks r0 = A032.A02;
            if (r0 != null) {
                r0.A00();
            }
            this.A04.A0E(A032);
        }
    }

    public void A1C(C82884En r6) {
        ScrollView scrollView = this.A02;
        AnonymousClass00B.A04(scrollView);
        AnonymousClass00B.A04(this.A03);
        int i2 = r6.A00;
        int i3 = 0;
        if (i2 == 0) {
            boolean z2 = this instanceof StickerExpressionTabFragment;
            ExpressionSearchViewModel expressionSearchViewModel = this.A0B;
            List A082 = z2 ? expressionSearchViewModel.A08(0) : expressionSearchViewModel.A07(0);
            ScrollView scrollView2 = this.A02;
            if (!A082.isEmpty()) {
                i3 = 8;
            }
            scrollView2.setVisibility(i3);
        } else if (i2 != 1) {
            scrollView.setVisibility(0);
        } else {
            scrollView.setVisibility(8);
            this.A03.setVisibility(0);
            return;
        }
        this.A03.setVisibility(8);
    }

    public void A1D(boolean z2) {
        ExpressionCategoryTabFragment expressionCategoryTabFragment;
        C57482rF r0;
        MarginCorrectedViewPager marginCorrectedViewPager = this.A06;
        if (marginCorrectedViewPager != null) {
            AnonymousClass012 adapter = marginCorrectedViewPager.getAdapter();
            if ((adapter instanceof AnonymousClass3PN) && (expressionCategoryTabFragment = ((AnonymousClass3PN) adapter).A00) != null && (r0 = expressionCategoryTabFragment.A04) != null) {
                r0.A04 = z2;
                RecyclerView recyclerView = expressionCategoryTabFragment.A01;
                if (recyclerView != null) {
                    recyclerView.setAdapter((AnonymousClass01X) null);
                    expressionCategoryTabFragment.A01.setAdapter(expressionCategoryTabFragment.A04);
                }
            }
        }
    }

    public void AXt(C34151jm r2, Integer num, int i2) {
        A1A().AXt(r2, num, i2);
    }
}
