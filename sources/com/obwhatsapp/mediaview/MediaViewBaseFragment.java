package com.obwhatsapp.mediaview;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass030;
import X.AnonymousClass0Bo;
import X.AnonymousClass0VE;
import X.AnonymousClass0VF;
import X.AnonymousClass1KX;
import X.AnonymousClass29A;
import X.AnonymousClass29C;
import X.AnonymousClass2B7;
import X.AnonymousClass2PR;
import X.AnonymousClass33A;
import X.AnonymousClass5T0;
import X.C000900k;
import X.C001000l;
import X.C004601z;
import X.C005402i;
import X.C06510Wk;
import X.C102194yY;
import X.C14550pN;
import X.C14630pV;
import X.C14750ph;
import X.C16730tY;
import X.C18450wi;
import X.C19980zJ;
import X.C455429f;
import X.C455529g;
import X.C54602hp;
import X.C54662hw;
import X.C70453gi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.redex.IDxIListenerShape217S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0310000_I0;
import com.facebook.redex.ViewOnClickCListenerShape11S0100000_I0_4;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.base.WaFragment;
import com.obwhatsapp.biz.catalog.CatalogMediaViewFragment;
import com.obwhatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment;
import com.obwhatsapp.gesture.VerticalSwipeDismissBehavior;
import com.obwhatsapp.videoplayback.ExoPlaybackControlView;
import com.whatsapp.util.Log;

public abstract class MediaViewBaseFragment extends WaFragment implements AnonymousClass29A {
    public static final boolean A0H;
    public Rect A00;
    public Bundle A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public TextView A05;
    public Toolbar A06;
    public TextEmojiLabel A07;
    public C70453gi A08;
    public C54662hw A09;
    public AnonymousClass29A A0A;
    public C455529g A0B;
    public OutOfMemoryError A0C;
    public Runnable A0D;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = true;

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z2 = true;
        }
        A0H = z2;
    }

    public static void A07(Activity activity) {
        if (C455529g.A00) {
            Window window = activity.getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
        }
    }

    public static void A08(Activity activity, boolean z2) {
        int i2 = 1280;
        if (!z2) {
            i2 = 1285;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            i2 |= 2048;
        }
        if (A0H) {
            i2 |= 512;
            if (!z2) {
                i2 |= 2;
            }
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(i2);
    }

    public static /* synthetic */ boolean A09(MediaViewBaseFragment mediaViewBaseFragment) {
        PhotoView A1A = mediaViewBaseFragment.A1A(mediaViewBaseFragment.A1D(mediaViewBaseFragment.A09.getCurrentItem()));
        return A1A != null && A1A.A0B();
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        try {
            return layoutInflater.inflate(R.layout.layout03ce, viewGroup, false);
        } catch (OutOfMemoryError e2) {
            this.A0C = e2;
            return null;
        }
    }

    public void A12() {
        if (this.A09 != null) {
            for (int i2 = 0; i2 < this.A09.getChildCount(); i2++) {
                View childAt = this.A09.getChildAt(i2);
                if (childAt instanceof FrameLayout) {
                    int i3 = 0;
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        if (i3 >= viewGroup.getChildCount()) {
                            break;
                        }
                        View childAt2 = viewGroup.getChildAt(i3);
                        if (childAt2 instanceof PhotoView) {
                            ((PhotoView) childAt2).A02();
                        }
                        i3++;
                    }
                }
            }
        }
        super.A12();
    }

    public void A13() {
        this.A04.removeView(this.A09);
        this.A04 = null;
        this.A06 = null;
        this.A07 = null;
        this.A05 = null;
        this.A02 = null;
        this.A03 = null;
        super.A13();
    }

    public void A14() {
        super.A14();
        if (!this.A0F) {
            if (!RequestPermissionActivity.A0X(A02(), this instanceof MediaViewFragment ? ((MediaViewFragment) this).A0j : this instanceof LinkedAccountMediaViewFragment ? ((LinkedAccountMediaViewFragment) this).A07 : ((CatalogMediaViewFragment) this).A06)) {
                this.A0F = true;
                A1F();
            }
        }
        A1P(true, true);
    }

    public void A15() {
        super.A15();
        A1P(true, true);
    }

    public void A16(Context context) {
        super.A16(context);
        C19980zJ.A05(A0D().getWindow());
    }

    public void A17(Bundle bundle) {
        this.A0B = C455529g.A00 ? new C455429f(new C54602hp(A0D()), this) : new AnonymousClass33A(this);
        if (!this.A0F) {
            if (!RequestPermissionActivity.A0X(A02(), this instanceof MediaViewFragment ? ((MediaViewFragment) this).A0j : this instanceof LinkedAccountMediaViewFragment ? ((LinkedAccountMediaViewFragment) this).A07 : ((CatalogMediaViewFragment) this).A06)) {
                this.A0F = true;
                A1F();
            }
        }
        super.A17(bundle);
        this.A09 = new C54662hw(A02(), this);
        Bundle bundle2 = this.A05;
        if (bundle2 == null) {
            A1F();
        } else {
            this.A01 = bundle2.getBundle("animation_bundle");
        }
    }

    public void A18(Bundle bundle, View view) {
        boolean z2 = A0H;
        View decorView = A0D().getWindow().getDecorView();
        if (z2) {
            decorView.setSystemUiVisibility(1792);
            View view2 = ((C14550pN) A0D()).A00;
            AnonymousClass00B.A04(view2);
            C004601z.A0k(view2, new IDxIListenerShape217S0100000_2_I0(this, 3));
        } else {
            decorView.setSystemUiVisibility(1280);
        }
        Toolbar toolbar = (Toolbar) C004601z.A0E(A06(), R.id.toolbar);
        this.A06 = toolbar;
        toolbar.A07();
        ((C000900k) A0D()).Aem(this.A06);
        this.A06.setBackground(new ColorDrawable(AnonymousClass00T.A00(A02(), R.color.color0546)));
        C005402i AGK = ((C000900k) A0D()).AGK();
        AGK.A0Q(false);
        AGK.A0N(true);
        this.A06.setNavigationOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 9));
        View inflate = LayoutInflater.from(((C000900k) A0D()).AGK().A02()).inflate(R.layout.layout03cf, (ViewGroup) null, false);
        View A0E2 = C004601z.A0E(inflate, R.id.title_holder);
        A0E2.setClickable(true);
        A0E2.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_4(this, 10));
        this.A07 = (TextEmojiLabel) C004601z.A0E(A0E2, R.id.contact_name);
        this.A05 = (TextView) C004601z.A0E(A0E2, R.id.date_time);
        this.A02 = C004601z.A0E(inflate, R.id.progress_bar);
        AGK.A0O(true);
        AGK.A0G(inflate);
        this.A03 = C004601z.A0E(view, R.id.title_protection);
        ViewGroup viewGroup = (ViewGroup) C004601z.A0E(view, R.id.pager_container);
        this.A04 = viewGroup;
        viewGroup.addView(this.A09);
        View findViewById = view.findViewById(R.id.background);
        findViewById.setBackground(new ColorDrawable(-16777216));
        AnonymousClass1 r1 = new VerticalSwipeDismissBehavior(A02()) {
            public void A0A(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i2, int i3, int i4) {
                if (!this.A1Q()) {
                    super.A0A(view, view2, coordinatorLayout, iArr, i2, i3, i4);
                }
            }

            public boolean A0B(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
                if (motionEvent.getPointerCount() <= 1) {
                    MediaViewBaseFragment mediaViewBaseFragment = this;
                    if (!MediaViewBaseFragment.A09(mediaViewBaseFragment) && !mediaViewBaseFragment.A1Q()) {
                        return super.A0B(motionEvent, view, coordinatorLayout);
                    }
                }
                AnonymousClass0VE r0 = this.A04;
                if (r0 == null) {
                    return false;
                }
                r0.A02();
                return false;
            }
        };
        r1.A01 = 0.5f;
        r1.A0A = true;
        r1.A05 = new C102194yY(findViewById, this);
        ((AnonymousClass0Bo) this.A04.getLayoutParams()).A01(r1);
        onConfigurationChanged(A03().getConfiguration());
    }

    public PhotoView A19(ViewGroup viewGroup) {
        PhotoView A19;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof PhotoView) {
                return (PhotoView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (A19 = A19((ViewGroup) childAt)) != null) {
                return A19;
            }
        }
        return null;
    }

    public PhotoView A1A(Object obj) {
        if (obj != null) {
            View findViewWithTag = this.A09.findViewWithTag(obj);
            if (findViewWithTag instanceof ViewGroup) {
                return A19((ViewGroup) findViewWithTag);
            }
        }
        return null;
    }

    public Object A1B() {
        if (!(this instanceof MediaViewFragment)) {
            return this instanceof LinkedAccountMediaViewFragment ? ((LinkedAccountMediaViewFragment) this).A03.A04 : ((CatalogMediaViewFragment) this).A09;
        }
        C16730tY r0 = ((MediaViewFragment) this).A1M;
        if (r0 == null) {
            return null;
        }
        return r0.A11;
    }

    public Object A1C() {
        if (this instanceof MediaViewFragment) {
            return ((MediaViewFragment) this).A1L;
        }
        if (this instanceof LinkedAccountMediaViewFragment) {
            return ((LinkedAccountMediaViewFragment) this).A03.A04;
        }
        CatalogMediaViewFragment catalogMediaViewFragment = (CatalogMediaViewFragment) this;
        return AnonymousClass1KX.A00(catalogMediaViewFragment.A00, catalogMediaViewFragment.A02.A0D);
    }

    public Object A1D(int i2) {
        if (!(this instanceof MediaViewFragment)) {
            return this instanceof LinkedAccountMediaViewFragment ? ((LinkedAccountMediaViewFragment) this).A03.A04 : AnonymousClass1KX.A00(i2, ((CatalogMediaViewFragment) this).A02.A0D);
        }
        C16730tY A1U = ((MediaViewFragment) this).A1U(i2);
        if (A1U != null) {
            return A1U.A11;
        }
        return null;
    }

    public void A1E() {
        C14630pV r0 = (C14630pV) A0C();
        if (r0 != null) {
            r0.APw();
        }
        Bundle bundle = this.A01;
        if (bundle != null) {
            this.A0E = true;
            this.A0B.A0B(bundle);
            return;
        }
        A1F();
    }

    public void A1F() {
        C001000l A0C2 = A0C();
        if (A0C2 != null && !A0C2.isFinishing()) {
            if (A0D() instanceof C14630pV) {
                ((C14630pV) A0D()).ATb();
                return;
            }
            StringBuilder sb = new StringBuilder("mediaview/finish called from non-host activity: ");
            sb.append(A0D().getLocalClassName());
            Log.e(sb.toString());
            A0D().finish();
        }
    }

    public void A1G() {
        C70453gi r0;
        if (A0C() != null && (r0 = this.A08) != null) {
            r0.A06();
        }
    }

    public void A1H() {
        if (this instanceof MediaViewFragment) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
            RunnableRunnableShape0S0310000_I0 runnableRunnableShape0S0310000_I0 = mediaViewFragment.A0C;
            if (runnableRunnableShape0S0310000_I0 != null) {
                runnableRunnableShape0S0310000_I0.A03 = true;
                ((Thread) runnableRunnableShape0S0310000_I0.A02).interrupt();
                mediaViewFragment.A0C = null;
            }
            AnonymousClass2B7 r0 = mediaViewFragment.A1C;
            if (r0 != null) {
                r0.AgL();
            }
            mediaViewFragment.A1E();
            return;
        }
        A1E();
    }

    public void A1I() {
        if (this instanceof MediaViewFragment) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
            if (mediaViewFragment.A13 == null || (mediaViewFragment.A1j && mediaViewFragment.A1M != null)) {
                mediaViewFragment.A1H();
                return;
            }
            mediaViewFragment.A1M = null;
            mediaViewFragment.A0r(C14750ph.A0G(mediaViewFragment.A02(), mediaViewFragment.A13));
            mediaViewFragment.A1F();
        }
    }

    public void A1J(int i2) {
        AnonymousClass2PR r0;
        if (this instanceof MediaViewFragment) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
            AnonymousClass29C r1 = mediaViewFragment.A1c;
            if (i2 == 1) {
                if (r1 != null) {
                    r1.A07();
                    ExoPlaybackControlView exoPlaybackControlView = mediaViewFragment.A1c.A0C;
                    if (exoPlaybackControlView != null && !exoPlaybackControlView.A07()) {
                        exoPlaybackControlView.A01();
                        exoPlaybackControlView.A06(3000);
                    }
                }
                mediaViewFragment.A1V();
            } else if (r1 != null && r1.A0C == null && (r0 = r1.A08) != null) {
                r0.AeK(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        if (r3 != null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1K(int r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof com.obwhatsapp.mediaview.MediaViewFragment
            if (r0 == 0) goto L_0x00c5
            r4 = r6
            com.obwhatsapp.mediaview.MediaViewFragment r4 = (com.obwhatsapp.mediaview.MediaViewFragment) r4
            X.0tY r3 = r4.A1U(r7)
            X.0pt r0 = r4.A0I
            java.lang.Runnable r5 = r4.A1u
            r0.A0J(r5)
            X.29C r0 = r4.A1c
            if (r0 == 0) goto L_0x0054
            X.0tY r0 = r4.A1O
            if (r0 == 0) goto L_0x0054
            if (r3 == 0) goto L_0x0022
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0056
        L_0x0022:
            X.29C r0 = r4.A1c
            r0.A07()
            java.util.HashMap r2 = r4.A1v
            X.0tY r0 = r4.A1O
            X.1Vw r1 = r0.A11
            X.29C r0 = r4.A1c
            int r0 = r0.A03()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r0)
            X.29C r0 = r4.A1c
            r0.A09()
            X.29C r0 = r4.A1c
            r0.A01()
            X.29C r1 = r4.A1c
            r0 = 4
            r1.A04 = r0
            X.12c r2 = r4.A1A
            X.0tY r1 = r4.A1O
            r0 = 0
            r2.A0B(r1, r0, r0)
            r0 = 0
            r4.A1c = r0
        L_0x0054:
            if (r3 == 0) goto L_0x00c6
        L_0x0056:
            byte r1 = r3.A10
            r0 = 2
            if (r1 != r0) goto L_0x00c6
            X.0tY r0 = r4.A1O
            if (r0 == 0) goto L_0x0069
            X.1Vw r1 = r0.A11
            X.1Vw r0 = r3.A11
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x006c
        L_0x0069:
            r4.A1a(r3)
        L_0x006c:
            int r0 = r4.A03
            if (r0 == r7) goto L_0x008c
            X.0tY r0 = r4.A1O
            if (r0 == 0) goto L_0x008c
            if (r3 == 0) goto L_0x008c
            X.1Vw r0 = r3.A11
            com.obwhatsapp.mediaview.PhotoView r2 = r4.A1A(r0)
            if (r2 == 0) goto L_0x008c
            android.graphics.Matrix r1 = r2.A0B
            android.graphics.Matrix r0 = r2.A0C
            r1.set(r0)
            float r0 = r2.A06
            r2.A00 = r0
            r2.setImageMatrix(r1)
        L_0x008c:
            X.0tY r0 = r4.A1O
            if (r0 == 0) goto L_0x0099
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0099
            r0 = 1
            r4.A1k = r0
        L_0x0099:
            r4.A1O = r3
            r4.A03 = r7
            r4.A1Z(r7)
            boolean r0 = A0H
            if (r0 == 0) goto L_0x00c5
            X.00l r0 = r4.A0D()
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            int r0 = r0.getSystemUiVisibility()
            r1 = r0 & -3
            X.00l r0 = r4.A0D()
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.setSystemUiVisibility(r1)
        L_0x00c5:
            return
        L_0x00c6:
            boolean r0 = r4.A1i
            if (r0 == 0) goto L_0x0121
            if (r3 == 0) goto L_0x0140
            byte r1 = r3.A10
            boolean r0 = X.AnonymousClass20C.A00(r1)
            if (r0 == 0) goto L_0x0102
            java.util.Map r0 = r4.A1x
            X.1Vw r2 = r3.A11
            java.lang.Object r1 = r0.get(r2)
            X.29C r1 = (X.AnonymousClass29C) r1
            r4.A1c = r1
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x006c
            if (r1 == 0) goto L_0x006c
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x006c
            r1.A0G()
            java.util.HashMap r0 = r4.A1v
            java.lang.Object r0 = r0.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x006c
            X.29C r1 = r4.A1c
            int r0 = r0.intValue()
            r1.A0A(r0)
            goto L_0x006c
        L_0x0102:
            boolean r0 = X.C38621r6.A0M(r1)
            if (r0 == 0) goto L_0x0140
            java.util.Map r1 = r4.A1x
            X.1Vw r0 = r3.A11
            java.lang.Object r0 = r1.get(r0)
            X.29C r0 = (X.AnonymousClass29C) r0
            r4.A1c = r0
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x006c
            X.0pt r2 = r4.A0I
            r0 = 150(0x96, double:7.4E-322)
            r2.A0L(r5, r0)
            goto L_0x006c
        L_0x0121:
            if (r3 == 0) goto L_0x0140
            byte r0 = r3.A10
            boolean r0 = X.C38621r6.A0M(r0)
            if (r0 == 0) goto L_0x0140
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x006c
            java.util.Map r1 = r4.A1w
            X.1Vw r0 = r3.A11
            java.lang.Object r0 = r1.get(r0)
            X.29D r0 = (X.AnonymousClass29D) r0
            if (r0 == 0) goto L_0x006c
            r0.A08()
            goto L_0x006c
        L_0x0140:
            r4.A1Y()
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mediaview.MediaViewBaseFragment.A1K(int):void");
    }

    public final void A1L(View view) {
        if (this.A00 != null) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.footerView);
            if (viewGroup != null || (viewGroup = (ViewGroup) view.findViewById(R.id.footer)) != null) {
                View findViewById = viewGroup.findViewById(R.id.caption);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                int i2 = A03().getConfiguration().orientation;
                if (findViewById != null) {
                    View findViewById2 = view.findViewById(R.id.exo_player_navbar_padding_view);
                    if (findViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                        if (i2 == 1) {
                            layoutParams2.height = this.A00.bottom;
                        } else if (i2 == 2) {
                            layoutParams2.height = 0;
                        }
                        findViewById2.setLayoutParams(layoutParams2);
                    }
                    if (i2 == 1) {
                        layoutParams.bottomMargin = this.A00.bottom;
                    } else if (i2 == 2) {
                        layoutParams.bottomMargin = 0;
                    }
                } else {
                    viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), 0);
                    View findViewWithTag = viewGroup.findViewWithTag("navigation_protection");
                    if (i2 == 1) {
                        View view2 = findViewWithTag == null ? new View(A02()) : findViewWithTag;
                        view2.setBackgroundColor(AnonymousClass00T.A00(A02(), R.color.color0547));
                        view2.setTag("navigation_protection");
                        view2.setLayoutParams(new LinearLayout.LayoutParams(-1, this.A00.bottom));
                        if (findViewWithTag == null) {
                            viewGroup.addView(view2);
                        }
                    } else if (findViewWithTag != null) {
                        viewGroup.removeViewInLayout(findViewWithTag);
                    }
                    View findViewById3 = viewGroup.findViewById(R.id.footer_padding_bottom);
                    if (findViewById3 != null) {
                        findViewById3.setVisibility(8);
                    }
                }
                Rect rect = this.A00;
                layoutParams.leftMargin = rect.left;
                layoutParams.rightMargin = rect.right;
                layoutParams.topMargin = rect.top;
                viewGroup.setLayoutParams(layoutParams);
            }
        }
    }

    public final void A1M(AnonymousClass030 r6) {
        Rect rect = new Rect();
        this.A00 = rect;
        rect.set(r6.A04(), r6.A06(), r6.A05(), r6.A03());
        AnonymousClass0VF r1 = r6.A00;
        C18450wi.A0B(r1.A0C(7));
        C06510Wk A0C2 = r1.A0C(128);
        C18450wi.A0B(A0C2);
        C18450wi.A0B(C06510Wk.A00(0, A0C2.A03, 0, 0));
        if (this.A09 != null) {
            for (int i2 = 0; i2 < this.A09.getChildCount(); i2++) {
                A1L(this.A09.getChildAt(i2));
            }
        }
    }

    public void A1N(AnonymousClass5T0 r3) {
        C70453gi r1 = new C70453gi(r3, this);
        this.A08 = r1;
        this.A09.setAdapter(r1);
        this.A09.A0F(0, false);
    }

    public void A1O(boolean z2, int i2) {
        AlphaAnimation alphaAnimation;
        int childCount = this.A09.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View findViewById = this.A09.getChildAt(i3).findViewById(R.id.footer);
            int visibility = findViewById.getVisibility();
            if (z2) {
                if (visibility != 0) {
                    alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    findViewById.setVisibility(0);
                }
            } else if (visibility != 4) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                findViewById.setVisibility(4);
            }
            if (i2 > 0) {
                alphaAnimation.setDuration((long) i2);
                findViewById.startAnimation(alphaAnimation);
            }
        }
    }

    public void A1P(boolean z2, boolean z3) {
        AlphaAnimation alphaAnimation;
        C001000l A0C2;
        if (!this.A0E && this.A0G != z2) {
            this.A0G = z2;
            A1O(z2, 400);
            int i2 = 4;
            if (this.A0G) {
                i2 = 0;
            }
            if (!z2) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            }
            alphaAnimation.setDuration(250);
            if (this.A03.getVisibility() != i2) {
                this.A03.setVisibility(i2);
                this.A03.startAnimation(alphaAnimation);
            }
            if (this.A06.getVisibility() != i2) {
                this.A06.setVisibility(i2);
                this.A06.startAnimation(alphaAnimation);
            }
            if (z3 && (A0C2 = A0C()) != null) {
                A08(A0C2, this.A0G);
            }
        }
    }

    public boolean A1Q() {
        if (this instanceof MediaViewFragment) {
            return ((MediaViewFragment) this).A1g;
        }
        if (this instanceof LinkedAccountMediaViewFragment) {
            return ((LinkedAccountMediaViewFragment) this).A0B;
        }
        return false;
    }

    public boolean A1R() {
        C001000l A0C2 = A0C();
        return (A0C2 instanceof C14630pV) && ((C14630pV) A0C2).AfS();
    }

    public void AZA(boolean z2) {
        Runnable runnable = this.A0D;
        if (runnable != null && z2) {
            runnable.run();
        }
        this.A0E = false;
        AnonymousClass29A r0 = this.A0A;
        if (r0 != null) {
            r0.AZA(z2);
            this.A0A = null;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        Context A022;
        int i2;
        super.onConfigurationChanged(configuration);
        if (A0H) {
            Window window = A0D().getWindow();
            int A002 = AnonymousClass00T.A00(A02(), R.color.color0548);
            int i3 = configuration.orientation;
            if (i3 == 2) {
                A022 = A02();
                i2 = R.color.color0547;
            } else {
                if (i3 == 1) {
                    A022 = A02();
                    i2 = R.color.color0792;
                }
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setNavigationBarColor(AnonymousClass00T.A00(A022, i2));
            window.addFlags(Integer.MIN_VALUE);
        }
    }
}
