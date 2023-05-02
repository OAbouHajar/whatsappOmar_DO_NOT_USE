package com.obwhatsapp.avatar.profilephoto;

import X.AnonymousClass00T;
import X.AnonymousClass027;
import X.AnonymousClass1ML;
import X.AnonymousClass2SR;
import X.AnonymousClass3In;
import X.AnonymousClass5DH;
import X.AnonymousClass5DI;
import X.AnonymousClass5DJ;
import X.C005402i;
import X.C005502j;
import X.C1051058f;
import X.C13680ns;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C15220qW;
import X.C16150sX;
import X.C18450wi;
import X.C434920f;
import X.C447725m;
import X.C49132Rg;
import X.C63463Im;
import X.C64503Qo;
import X.C70803hl;
import X.C70833ho;
import X.C89304bw;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxLListenerShape60S0200000_2_I1;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.obwhatsapp.BidiToolbar;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.whatsapp.util.Log;

public final class AvatarProfilePhotoActivity extends C14530pL {
    public MenuItem A00;
    public View A01;
    public View A02;
    public View A03;
    public ProgressBar A04;
    public ShimmerFrameLayout A05;
    public BidiToolbar A06;
    public WaButton A07;
    public AvatarProfilePhotoImageView A08;
    public AnonymousClass1ML A09;
    public boolean A0A;
    public final C64503Qo A0B;
    public final C64503Qo A0C;
    public final C15220qW A0D;
    public final C15220qW A0E;
    public final C15220qW A0F;

    public AvatarProfilePhotoActivity() {
        this(0);
        this.A0F = new C1051058f(new AnonymousClass5DJ(this));
        this.A0C = new C64503Qo(new AnonymousClass3In(this));
        this.A0B = new C64503Qo(new C63463Im(this));
        this.A0D = new C1051058f(new AnonymousClass5DH(this));
        this.A0E = new C1051058f(new AnonymousClass5DI(this));
    }

    public AvatarProfilePhotoActivity(int i2) {
        this.A0A = false;
        C13680ns.A1G(this, 14);
    }

    public void A1q() {
        if (!this.A0A) {
            this.A0A = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A09 = A1T.A0c();
        }
    }

    public void onCreate(Bundle bundle) {
        View view;
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0034);
        BidiToolbar bidiToolbar = (BidiToolbar) AnonymousClass00T.A05(this, R.id.toolbar);
        Aem(bidiToolbar);
        bidiToolbar.setNavigationIcon((Drawable) new C447725m(AnonymousClass2SR.A02(this, R.drawable.ic_back, R.color.color04ef), this.A01));
        bidiToolbar.setTitle((int) R.string.str1c02);
        this.A06 = bidiToolbar;
        C434920f.A03(this, R.color.color045b);
        C434920f.A08(getWindow(), !C434920f.A09(this));
        WaButton waButton = (WaButton) AnonymousClass00T.A05(this, R.id.avatar_profile_photo_options);
        C13680ns.A1A(waButton, this, 24);
        this.A07 = waButton;
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0J(getString(R.string.str1c02));
        }
        C64503Qo r2 = this.A0C;
        RecyclerView recyclerView = (RecyclerView) AnonymousClass00T.A05(this, R.id.avatar_pose_recycler);
        recyclerView.setAdapter(r2);
        recyclerView.setItemAnimator((C005502j) null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new AvatarProfilePhotoActivity$setupRecyclerView$1$1());
        C64503Qo r22 = this.A0B;
        RecyclerView recyclerView2 = (RecyclerView) AnonymousClass00T.A05(this, R.id.avatar_color_recycler);
        recyclerView2.setAdapter(r22);
        recyclerView2.setItemAnimator((C005502j) null);
        recyclerView2.getContext();
        recyclerView2.setLayoutManager(new AvatarProfilePhotoActivity$setupRecyclerView$1$1());
        this.A08 = (AvatarProfilePhotoImageView) AnonymousClass00T.A05(this, R.id.avatar_pose);
        this.A02 = AnonymousClass00T.A05(this, R.id.pose_layout);
        this.A04 = (ProgressBar) AnonymousClass00T.A05(this, R.id.profile_image_progress);
        this.A05 = (ShimmerFrameLayout) AnonymousClass00T.A05(this, R.id.pose_shimmer);
        this.A03 = AnonymousClass00T.A05(this, R.id.poses_title);
        this.A01 = AnonymousClass00T.A05(this, R.id.background_color_title);
        AvatarProfilePhotoImageView avatarProfilePhotoImageView = this.A08;
        if (avatarProfilePhotoImageView != null) {
            C13680ns.A0t(this, avatarProfilePhotoImageView, R.string.str1bfe);
        }
        View view2 = this.A03;
        if (view2 != null) {
            C13680ns.A0t(this, view2, R.string.str1bfd);
        }
        View view3 = this.A01;
        if (view3 != null) {
            C13680ns.A0t(this, view3, R.string.str1bf3);
        }
        WaButton waButton2 = this.A07;
        if (waButton2 != null) {
            C13680ns.A0t(this, waButton2, R.string.str1bfb);
        }
        BidiToolbar bidiToolbar2 = this.A06;
        if (bidiToolbar2 != null) {
            bidiToolbar2.setNavigationContentDescription((CharSequence) getString(R.string.str1baf));
        }
        C15220qW r1 = this.A0F;
        C13680ns.A1M(this, ((AvatarProfilePhotoViewModel) r1.getValue()).A00, 0);
        C13680ns.A1L(this, ((AvatarProfilePhotoViewModel) r1.getValue()).A0C, 2);
        if (C13700nu.A03(this).orientation == 2 && (view = this.A02) != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape60S0200000_2_I1(view, 0, this));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (menu != null) {
            getMenuInflater().inflate(R.menu.menu0000, menu);
            MenuItem findItem = menu.findItem(R.id.menu_avatar_profile_photo_save);
            this.A00 = findItem;
            if (findItem != null) {
                findItem.setIcon((Drawable) this.A0D.getValue());
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C18450wi.A0H(menuItem, 0);
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_avatar_profile_photo_save) {
            AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = (AvatarProfilePhotoViewModel) this.A0F.getValue();
            Log.i("AvatarProfilePhotoViewModel/onSavePhotoClicked()");
            AnonymousClass027 r1 = avatarProfilePhotoViewModel.A00;
            C89304bw r0 = (C89304bw) r1.A01();
            C70833ho r4 = null;
            C70803hl r3 = r0 == null ? null : r0.A01;
            C89304bw r02 = (C89304bw) r1.A01();
            if (r02 != null) {
                r4 = r02.A00;
            }
            if (r3 == null || r4 == null) {
                Log.i("AvatarProfilePhotoViewModel/onSavePhotoClicked(null value)");
            } else {
                Object A012 = r1.A01();
                C18450wi.A0F(A012);
                C18450wi.A0B(A012);
                C89304bw r03 = (C89304bw) A012;
                r1.A0B(new C89304bw(r03.A00, r03.A01, r03.A03, r03.A02, true, r03.A05, r03.A04));
                avatarProfilePhotoViewModel.A0D.Aco(new RunnableRunnableShape0S0300000_I0(avatarProfilePhotoViewModel, r3, r4, 13));
            }
        } else if (itemId == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
