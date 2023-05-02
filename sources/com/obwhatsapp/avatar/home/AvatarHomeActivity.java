package com.obwhatsapp.avatar.home;

import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass1ML;
import X.AnonymousClass2Rf;
import X.AnonymousClass2SR;
import X.AnonymousClass5DG;
import X.C005402i;
import X.C1051058f;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15220qW;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C17090uW;
import X.C17250um;
import X.C18260wP;
import X.C18450wi;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C434920f;
import X.C447725m;
import X.C49132Rg;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.IDxSCallbackShape45S0100000_2_I0;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.bottomsheet.LockableBottomSheetBehavior;
import com.obwhatsapp.components.FloatingActionButton;
import com.obwhatsapp.components.MainChildCoordinatorLayout;

public final class AvatarHomeActivity extends C14530pL {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public FrameLayout A04;
    public LinearLayout A05;
    public LinearLayout A06;
    public LinearLayout A07;
    public CircularProgressBar A08;
    public C17090uW A09;
    public WaButton A0A;
    public WaImageView A0B;
    public WaTextView A0C;
    public WaTextView A0D;
    public WaTextView A0E;
    public WaTextView A0F;
    public LockableBottomSheetBehavior A0G;
    public FloatingActionButton A0H;
    public MainChildCoordinatorLayout A0I;
    public AnonymousClass1ML A0J;
    public boolean A0K;
    public final C15220qW A0L;

    public AvatarHomeActivity() {
        this(0);
        this.A0L = new C1051058f(new AnonymousClass5DG(this));
    }

    public AvatarHomeActivity(int i2) {
        this.A0K = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 16));
    }

    public boolean A1c() {
        if (!A38()) {
            return super.A1c();
        }
        return false;
    }

    public void A1q() {
        if (!this.A0K) {
            this.A0K = true;
            C49132Rg r1 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r2 = r1.A1s;
            this.A05 = (C16320sq) r2.ARB.get();
            this.A0C = (C14710pd) r2.A05.get();
            this.A05 = (C14870pt) r2.AB3.get();
            this.A03 = (C16300so) r2.A5p.get();
            this.A04 = (C16180sb) r2.A8b.get();
            this.A0B = (C17250um) r2.A7e.get();
            this.A06 = (C15900s5) r2.ALm.get();
            this.A08 = (AnonymousClass01V) r2.AOi.get();
            this.A0D = (C19950zG) r2.AQV.get();
            this.A09 = (C15860rz) r2.AQh.get();
            this.A07 = (C18260wP) r2.A4p.get();
            this.A0A = (C16290sm) r2.AQk.get();
            this.A05 = (C16440t3) r2.AP2.get();
            this.A0B = (C23061Ai) r2.AC0.get();
            this.A01 = (C16040sK) r2.ADr.get();
            this.A04 = (C16190sc) r2.A8R.get();
            this.A08 = r1.A0K();
            this.A06 = (C14730pf) r2.ANy.get();
            this.A00 = (C19980zJ) r2.A0P.get();
            this.A02 = (C23071Aj) r2.AQb.get();
            this.A03 = (AnonymousClass15P) r2.A0b.get();
            this.A0A = (C19490yW) r2.ALQ.get();
            this.A09 = (C15960sC) r2.AKz.get();
            this.A07 = C16150sX.A0d(r2);
            this.A09 = (C17090uW) r2.ADM.get();
            this.A0J = r1.A0c();
        }
    }

    public final void A35() {
        WaTextView waTextView = this.A0D;
        if (waTextView == null) {
            C18450wi.A0O("browseStickersTextView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        waTextView.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 15));
        WaTextView waTextView2 = this.A0D;
        if (waTextView2 == null) {
            C18450wi.A0O("browseStickersTextView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        waTextView2.setClickable(true);
        WaTextView waTextView3 = this.A0E;
        if (waTextView3 == null) {
            C18450wi.A0O("createProfilePhotoTextView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        waTextView3.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 17));
        WaTextView waTextView4 = this.A0E;
        if (waTextView4 == null) {
            C18450wi.A0O("createProfilePhotoTextView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        waTextView4.setClickable(true);
        WaTextView waTextView5 = this.A0F;
        if (waTextView5 == null) {
            C18450wi.A0O("deleteAvatarTextView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        waTextView5.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 12));
        WaTextView waTextView6 = this.A0F;
        if (waTextView6 == null) {
            C18450wi.A0O("deleteAvatarTextView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        waTextView6.setClickable(true);
        LinearLayout linearLayout = this.A07;
        if (linearLayout == null) {
            C18450wi.A0O("containerPrivacy");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        linearLayout.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 11));
        LinearLayout linearLayout2 = this.A07;
        if (linearLayout2 == null) {
            C18450wi.A0O("containerPrivacy");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            linearLayout2.setClickable(true);
        }
    }

    public final void A36() {
        C005402i x2 = x();
        if (x2 != null) {
            x2.A06();
        }
        boolean z2 = !C434920f.A09(this);
        MainChildCoordinatorLayout mainChildCoordinatorLayout = this.A0I;
        if (mainChildCoordinatorLayout == null) {
            C18450wi.A0O("coordinatorLayout");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            mainChildCoordinatorLayout.postDelayed(new RunnableRunnableShape0S0110000_I0(this, 2, z2), 250);
        }
    }

    public final void A37(boolean z2) {
        MainChildCoordinatorLayout mainChildCoordinatorLayout = this.A0I;
        if (mainChildCoordinatorLayout == null) {
            C18450wi.A0O("coordinatorLayout");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            mainChildCoordinatorLayout.post(new RunnableRunnableShape0S0110000_I0(this, 3, z2));
        }
    }

    public final boolean A38() {
        LockableBottomSheetBehavior lockableBottomSheetBehavior = this.A0G;
        Integer valueOf = lockableBottomSheetBehavior == null ? null : Integer.valueOf(lockableBottomSheetBehavior.A0B);
        if (valueOf == null) {
            return false;
        }
        int intValue = valueOf.intValue();
        if (intValue != 5 && intValue != 3) {
            return false;
        }
        if (lockableBottomSheetBehavior != null) {
            lockableBottomSheetBehavior.A0M(4);
        }
        return true;
    }

    public void onBackPressed() {
        if (!A38()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        A1X(9);
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0033);
        View A052 = AnonymousClass00T.A05(this, R.id.coordinator);
        C18450wi.A0B(A052);
        this.A0I = (MainChildCoordinatorLayout) A052;
        View A053 = AnonymousClass00T.A05(this, R.id.avatar_home_sheet);
        C18450wi.A0B(A053);
        this.A05 = (LinearLayout) A053;
        View A054 = AnonymousClass00T.A05(this, R.id.avatar_new_user_container);
        C18450wi.A0B(A054);
        this.A06 = (LinearLayout) A054;
        View A055 = AnonymousClass00T.A05(this, R.id.avatar_set_container);
        C18450wi.A0B(A055);
        this.A04 = (FrameLayout) A055;
        View A056 = AnonymousClass00T.A05(this, R.id.avatar_privacy);
        C18450wi.A0B(A056);
        this.A07 = (LinearLayout) A056;
        View A057 = AnonymousClass00T.A05(this, R.id.avatar_bottom_sheet_padding);
        C18450wi.A0B(A057);
        this.A03 = A057;
        View A058 = AnonymousClass00T.A05(this, R.id.avatar_placeholder);
        C18450wi.A0B(A058);
        this.A01 = A058;
        if (getResources().getConfiguration().orientation != 2) {
            LinearLayout linearLayout = this.A05;
            if (linearLayout == null) {
                C18450wi.A0O("containerAvatarSheet");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            BottomSheetBehavior A002 = BottomSheetBehavior.A00(linearLayout);
            if (A002 != null) {
                LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) A002;
                this.A0G = lockableBottomSheetBehavior;
                lockableBottomSheetBehavior.A0E = new IDxSCallbackShape45S0100000_2_I0(this, 0);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.obwhatsapp.bottomsheet.LockableBottomSheetBehavior<android.widget.LinearLayout?>");
            }
        }
        View A059 = AnonymousClass00T.A05(this, R.id.avatar_set_image);
        C18450wi.A0B(A059);
        WaImageView waImageView = (WaImageView) A059;
        waImageView.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 16));
        this.A0B = waImageView;
        View A0510 = AnonymousClass00T.A05(this, R.id.avatar_set_progress);
        C18450wi.A0B(A0510);
        this.A08 = (CircularProgressBar) A0510;
        View A0511 = AnonymousClass00T.A05(this, R.id.avatar_browse_stickers);
        C18450wi.A0B(A0511);
        this.A0D = (WaTextView) A0511;
        View A0512 = AnonymousClass00T.A05(this, R.id.avatar_create_profile_photo);
        C18450wi.A0B(A0512);
        this.A0E = (WaTextView) A0512;
        View A0513 = AnonymousClass00T.A05(this, R.id.avatar_delete);
        C18450wi.A0B(A0513);
        this.A0F = (WaTextView) A0513;
        View A0514 = AnonymousClass00T.A05(this, R.id.avatar_privacy_divider);
        C18450wi.A0B(A0514);
        this.A02 = A0514;
        View A0515 = AnonymousClass00T.A05(this, R.id.avatar_create_avatar_button);
        C18450wi.A0B(A0515);
        WaButton waButton = (WaButton) A0515;
        waButton.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 14));
        this.A0A = waButton;
        View A0516 = AnonymousClass00T.A05(this, R.id.avatar_home_fab);
        C18450wi.A0B(A0516);
        FloatingActionButton floatingActionButton = (FloatingActionButton) A0516;
        floatingActionButton.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 13));
        floatingActionButton.setImageDrawable(new C447725m(AnonymousClass2SR.A02(this, R.drawable.ic_action_edit, R.color.color0659), this.A01));
        this.A0H = floatingActionButton;
        View A0517 = AnonymousClass00T.A05(this, R.id.avatar_home_preview_error);
        C18450wi.A0B(A0517);
        this.A00 = A0517;
        View A0518 = AnonymousClass00T.A05(this, R.id.avatar_try_again);
        C18450wi.A0B(A0518);
        WaTextView waTextView = (WaTextView) A0518;
        waTextView.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 10));
        this.A0C = waTextView;
        setTitle(R.string.str1c06);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0B(R.string.str1c06);
            x2.A0N(true);
        }
        C15220qW r3 = this.A0L;
        ((AvatarHomeViewModel) r3.getValue()).A00.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 0));
        ((AvatarHomeViewModel) r3.getValue()).A07.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 5));
        View view = this.A01;
        if (view == null) {
            C18450wi.A0O("newUserAvatarImage");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        view.setContentDescription(getString(R.string.str1be6));
        WaImageView waImageView2 = this.A0B;
        if (waImageView2 == null) {
            C18450wi.A0O("avatarSetImageView");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            waImageView2.setContentDescription(getString(R.string.str1bed));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C18450wi.A0H(menuItem, 0);
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (A38()) {
            return true;
        }
        finish();
        return true;
    }
}
