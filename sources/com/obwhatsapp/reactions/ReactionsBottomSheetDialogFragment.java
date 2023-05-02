package com.obwhatsapp.reactions;

import X.AnonymousClass013;
import X.AnonymousClass04o;
import X.AnonymousClass152;
import X.AnonymousClass1FI;
import X.AnonymousClass1WA;
import X.AnonymousClass23T;
import X.AnonymousClass2FZ;
import X.AnonymousClass2OJ;
import X.AnonymousClass2Wv;
import X.C001500q;
import X.C004601z;
import X.C006602z;
import X.C14870pt;
import X.C15810rt;
import X.C15830rv;
import X.C16000sG;
import X.C16030sJ;
import X.C16040sK;
import X.C16050sL;
import X.C16080sP;
import X.C16320sq;
import X.C16760tb;
import X.C16820th;
import X.C17160ud;
import X.C17230uk;
import X.C19980zJ;
import X.C25791Ld;
import X.C47812Kr;
import X.C47822Ks;
import X.C49612Uh;
import X.C55782kM;
import X.C59202v2;
import X.C95324mS;
import X.C95454mf;
import X.C98974tH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxObserverShape24S0300000_2_I0;
import com.facebook.redex.IDxObserverShape34S0200000_1_I0;
import com.facebook.redex.IDxObserverShape36S0200000_2_I0;
import com.facebook.redex.IDxPTransformerShape46S0000000_2_I0;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTabLayout;
import com.obwhatsapp.WaViewPager;
import java.util.List;

public class ReactionsBottomSheetDialogFragment extends Hilt_ReactionsBottomSheetDialogFragment {
    public AnonymousClass2FZ A00 = new C98974tH(this);
    public C19980zJ A01;
    public C14870pt A02;
    public C16040sK A03;
    public C16760tb A04;
    public WaTabLayout A05;
    public WaViewPager A06;
    public C17230uk A07;
    public C17160ud A08;
    public C16000sG A09;
    public C16080sP A0A;
    public AnonymousClass152 A0B;
    public C49612Uh A0C;
    public AnonymousClass013 A0D;
    public C16820th A0E;
    public C15810rt A0F;
    public AnonymousClass1FI A0G;
    public C15830rv A0H;
    public AnonymousClass23T A0I;
    public C59202v2 A0J;
    public C25791Ld A0K;
    public AnonymousClass1WA A0L;
    public C16320sq A0M;
    public boolean A0N;

    public static /* synthetic */ void A01(C47812Kr r2, ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment) {
        reactionsBottomSheetDialogFragment.A06.A0Q(r2.A00 >= reactionsBottomSheetDialogFragment.A0J.A01() ? 0 : reactionsBottomSheetDialogFragment.A06.A0P(r2.A00));
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.layout04ec, viewGroup, true);
    }

    public void A18(Bundle bundle, View view) {
        C16050sL A032;
        Window window = A1A().getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.3f;
            window.setAttributes(attributes);
        }
        C15810rt r3 = this.A0F;
        C55782kM r13 = (C55782kM) new C006602z((AnonymousClass04o) new C95324mS(this.A04, this.A0E, r3, this.A0H, this.A0I, this.A0K, this.A0N), (C001500q) this).A01(C55782kM.class);
        View view2 = view;
        this.A05 = (WaTabLayout) C004601z.A0E(view2, R.id.reactions_bottom_sheet_tab_layout);
        this.A06 = (WaViewPager) C004601z.A0E(view2, R.id.reactions_bottom_sheet_view_pager);
        AnonymousClass1WA r14 = new AnonymousClass1WA(this.A0M, false);
        this.A0L = r14;
        C14870pt r6 = this.A02;
        C16040sK r7 = this.A03;
        C17160ud r8 = this.A08;
        C16000sG r9 = this.A09;
        C16080sP r10 = this.A0A;
        AnonymousClass013 r12 = this.A0D;
        C59202v2 r32 = new C59202v2(A02(), A0H(), r6, r7, r8, r9, r10, this.A0B, r12, r13, r14);
        this.A0J = r32;
        this.A06.setAdapter(r32);
        this.A06.A0H(new IDxPTransformerShape46S0000000_2_I0(1), false);
        this.A06.A0G(new C95454mf(this.A05));
        this.A05.post(new RunnableRunnableShape13S0100000_I0_12((Object) this, 10));
        AnonymousClass2OJ r62 = r13.A05;
        r62.A0A(A0H(), new IDxObserverShape34S0200000_1_I0(r13, 4, this));
        LayoutInflater from = LayoutInflater.from(A0u());
        r13.A03.A02.A0A(A0H(), new IDxObserverShape36S0200000_2_I0(from, 8, this));
        for (AnonymousClass2Wv r4 : (List) r62.A01()) {
            r4.A02.A0A(A0H(), new IDxObserverShape24S0300000_2_I0(from, this, r4, 3));
        }
        r62.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 219));
        r13.A06.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 218));
        r13.A07.A0A(A0H(), new IDxObserverShape115S0100000_2_I0((Object) this, 217));
        C15830rv r1 = this.A0H;
        if (C16030sJ.A0L(r1) && (A032 = C16050sL.A03(r1)) != null && this.A0F.A02(A032) == 3) {
            this.A0M.Acl(new RunnableRunnableShape10S0200000_I0_8(this, 11, A032));
        }
    }

    public void A1M(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = A03().getDimensionPixelSize(R.dimen.dimen067f);
        view.setLayoutParams(layoutParams);
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(view);
        A002.A0L(layoutParams.height);
        A002.A0M(3);
    }

    public final void A1N(View view, int i2) {
        C47812Kr A0J2 = this.A05.A0J(i2);
        if (A0J2 == null) {
            C47812Kr A032 = this.A05.A03();
            A032.A01 = view;
            C47822Ks r0 = A032.A02;
            if (r0 != null) {
                r0.A00();
            }
            WaTabLayout waTabLayout = this.A05;
            waTabLayout.A0F(A032, waTabLayout.A0I(i2, true), waTabLayout.A0c.isEmpty());
            return;
        }
        A0J2.A01 = null;
        C47822Ks r02 = A0J2.A02;
        if (r02 != null) {
            r02.A00();
        }
        A0J2.A01 = view;
        C47822Ks r03 = A0J2.A02;
        if (r03 != null) {
            r03.A00();
        }
    }
}
