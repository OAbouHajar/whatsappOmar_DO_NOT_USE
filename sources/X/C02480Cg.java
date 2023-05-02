package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxLAdapterShape24S0100000_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;

/* renamed from: X.0Cg  reason: invalid class name and case insensitive filesystem */
public class C02480Cg extends C005402i implements C11570iz {
    public static final Interpolator A0R = new AccelerateInterpolator();
    public static final Interpolator A0S = new DecelerateInterpolator();
    public int A00 = 0;
    public Activity A01;
    public Context A02;
    public Context A03;
    public View A04;
    public AnonymousClass0Cr A05;
    public C009804r A06;
    public AnonymousClass05J A07;
    public AnonymousClass0QX A08;
    public ActionBarContainer A09;
    public ActionBarContextView A0A;
    public ActionBarOverlayLayout A0B;
    public AnonymousClass09G A0C;
    public ArrayList A0D = AnonymousClass000.A0u();
    public ArrayList A0E = AnonymousClass000.A0u();
    public boolean A0F = true;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L = true;
    public boolean A0M;
    public boolean A0N;
    public final C13190lc A0O = new IDxLAdapterShape24S0100000_I1(this, 2);
    public final C13190lc A0P = new IDxLAdapterShape24S0100000_I1(this, 3);
    public final C11870jT A0Q = new C07380bE(this);

    public C02480Cg(Activity activity, boolean z2) {
        this.A01 = activity;
        View decorView = activity.getWindow().getDecorView();
        A0Y(decorView);
        if (!z2) {
            this.A04 = decorView.findViewById(16908290);
        }
    }

    public C02480Cg(Dialog dialog) {
        A0Y(dialog.getWindow().getDecorView());
    }

    public float A00() {
        return C004601z.A00(this.A09);
    }

    public int A01() {
        return ((AnonymousClass09F) this.A0C).A01;
    }

    public Context A02() {
        Context context = this.A03;
        if (context == null) {
            TypedValue typedValue = new TypedValue();
            this.A02.getTheme().resolveAttribute(R.attr.attr000e, typedValue, true);
            int i2 = typedValue.resourceId;
            context = i2 != 0 ? new ContextThemeWrapper(this.A02, i2) : this.A02;
            this.A03 = context;
        }
        return context;
    }

    public View A03() {
        return ((AnonymousClass09F) this.A0C).A06;
    }

    public AnonymousClass05J A04(C009804r r4) {
        AnonymousClass0Cr r0 = this.A05;
        if (r0 != null) {
            r0.A05();
        }
        this.A0B.setHideOnContentScrollEnabled(false);
        this.A0A.A03();
        AnonymousClass0Cr r2 = new AnonymousClass0Cr(this.A0A.getContext(), this, r4);
        C016607w r1 = r2.A03;
        r1.A08();
        try {
            if (!r2.A00.APA(r1, r2)) {
                return null;
            }
            this.A05 = r2;
            r2.A06();
            this.A0A.A05(r2);
            A0Z(true);
            this.A0A.sendAccessibilityEvent(32);
            return r2;
        } finally {
            r1.A07();
        }
    }

    public void A06() {
        if (!this.A0H) {
            this.A0H = true;
            A0a(false);
        }
    }

    public void A07() {
        if (this.A0H) {
            this.A0H = false;
            A0a(false);
        }
    }

    public void A08(float f2) {
        C004601z.A0X(this.A09, f2);
    }

    public void A09(int i2) {
        AnonymousClass09F r2 = (AnonymousClass09F) this.A0C;
        r2.AeA(AnonymousClass06L.A01(r2.A09.getContext(), R.drawable.ic_pip_close));
    }

    public void A0A(int i2) {
        A0I(this.A02.getString(i2));
    }

    public void A0B(int i2) {
        A0J(this.A02.getString(i2));
    }

    public void A0C(Configuration configuration) {
        new AnonymousClass0Q7(this.A02).A00.getResources().getBoolean(R.bool.compat_button_inset_horizontal_material);
        this.A09.setTabContainer((AnonymousClass0CI) null);
        ((AnonymousClass09F) this.A0C).A09.setCollapsible(false);
        this.A0B.A0G = false;
    }

    public void A0D(Drawable drawable) {
        this.A09.setPrimaryBackground(drawable);
    }

    public void A0E(Drawable drawable) {
        this.A0C.AeA(drawable);
    }

    public void A0F(Drawable drawable) {
        AnonymousClass09F r0 = (AnonymousClass09F) this.A0C;
        r0.A04 = null;
        r0.A00();
    }

    public void A0G(View view) {
        this.A0C.Adp(view);
    }

    public void A0H(View view, AnonymousClass05K r3) {
        view.setLayoutParams(r3);
        this.A0C.Adp(view);
    }

    public void A0I(CharSequence charSequence) {
        this.A0C.Ael(charSequence);
    }

    public void A0J(CharSequence charSequence) {
        this.A0C.Aer(charSequence);
    }

    public void A0K(CharSequence charSequence) {
        this.A0C.setWindowTitle(charSequence);
    }

    public void A0L(boolean z2) {
        if (z2 != this.A0K) {
            this.A0K = z2;
            ArrayList arrayList = this.A0D;
            if (0 < arrayList.size()) {
                arrayList.get(0);
                throw AnonymousClass000.A0W("onMenuVisibilityChanged");
            }
        }
    }

    public void A0M(boolean z2) {
        if (!this.A0G) {
            A0N(z2);
        }
    }

    public void A0N(boolean z2) {
        int i2 = 0;
        if (z2) {
            i2 = 4;
        }
        AnonymousClass09G r3 = this.A0C;
        int i3 = ((AnonymousClass09F) r3).A01;
        this.A0G = true;
        r3.Adr((i2 & 4) | (-5 & i3));
    }

    public void A0O(boolean z2) {
        AnonymousClass09G r3 = this.A0C;
        r3.Adr(16 | (-17 & ((AnonymousClass09F) r3).A01));
    }

    public void A0P(boolean z2) {
        AnonymousClass09G r3 = this.A0C;
        r3.Adr(0 | (-3 & ((AnonymousClass09F) r3).A01));
    }

    public void A0Q(boolean z2) {
        int i2 = 0;
        if (z2) {
            i2 = 8;
        }
        AnonymousClass09G r3 = this.A0C;
        r3.Adr((i2 & 8) | (-9 & ((AnonymousClass09F) r3).A01));
    }

    public void A0R(boolean z2) {
        AnonymousClass0QX r0;
        this.A0M = z2;
        if (!z2 && (r0 = this.A08) != null) {
            r0.A00();
        }
    }

    public boolean A0V() {
        AnonymousClass0ZS r0;
        C07290av r02;
        AnonymousClass09G r03 = this.A0C;
        if (r03 == null || (r0 = ((AnonymousClass09F) r03).A09.A0Q) == null || (r02 = r0.A01) == null) {
            return false;
        }
        r02.collapseActionView();
        return true;
    }

    public boolean A0W(int i2, KeyEvent keyEvent) {
        AnonymousClass0Cr r0 = this.A05;
        if (r0 == null) {
            return false;
        }
        C016607w r2 = r0.A03;
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z2 = false;
        }
        r2.setQwertyMode(z2);
        return r2.performShortcut(i2, keyEvent, 0);
    }

    public final void A0Y(View view) {
        String str;
        StringBuilder sb;
        String str2;
        AnonymousClass09G wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.A0B = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof AnonymousClass09G) {
            wrapper = (AnonymousClass09G) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            sb = AnonymousClass000.A0r("Can't make a decor toolbar out of ");
            str2 = findViewById != null ? AnonymousClass000.A0c(findViewById) : "null";
            str = AnonymousClass000.A0h(str2, sb);
            throw AnonymousClass000.A0V(str);
        }
        this.A0C = wrapper;
        this.A0A = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.A09 = actionBarContainer;
        AnonymousClass09G r1 = this.A0C;
        if (r1 == null || this.A0A == null || actionBarContainer == null) {
            sb = AnonymousClass000.A0p(this);
            str2 = " can only be used with a compatible window decor layout";
            str = AnonymousClass000.A0h(str2, sb);
            throw AnonymousClass000.A0V(str);
        }
        Context context = ((AnonymousClass09F) r1).A09.getContext();
        this.A02 = context;
        if ((((AnonymousClass09F) this.A0C).A01 & 4) != 0) {
            this.A0G = true;
        }
        context.getApplicationInfo();
        context.getResources().getBoolean(R.bool.compat_button_inset_horizontal_material);
        this.A09.setTabContainer((AnonymousClass0CI) null);
        ((AnonymousClass09F) this.A0C).A09.setCollapsible(false);
        this.A0B.A0G = false;
        TypedArray obtainStyledAttributes = this.A02.obtainStyledAttributes((AttributeSet) null, AnonymousClass05L.A00, R.attr.attr0009, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.A0B;
            if (actionBarOverlayLayout2.A0J) {
                this.A0J = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                str = "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll";
                throw AnonymousClass000.A0V(str);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            A08((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Z(boolean r9) {
        /*
            r8 = this;
            boolean r0 = r8.A0N
            if (r9 == 0) goto L_0x00cc
            if (r0 != 0) goto L_0x000d
            r0 = 1
            r8.A0N = r0
            r0 = 0
        L_0x000a:
            r8.A0a(r0)
        L_0x000d:
            androidx.appcompat.widget.ActionBarContainer r0 = r8.A09
            boolean r0 = X.C004601z.A0u(r0)
            r4 = 8
            r3 = 0
            if (r0 == 0) goto L_0x00d3
            X.09G r7 = r8.A0C
            if (r9 == 0) goto L_0x0090
            r4 = 4
            r0 = 100
            X.09F r7 = (X.AnonymousClass09F) r7
            androidx.appcompat.widget.Toolbar r2 = r7.A09
            X.0SH r6 = X.C004601z.A0H(r2)
            r5 = 0
            r6.A03(r5)
            r6.A08(r0)
            com.facebook.redex.IDxLAdapterShape0S0111000_I1 r0 = new com.facebook.redex.IDxLAdapterShape0S0111000_I1
            r0.<init>(r7, r4)
            r6.A0A(r0)
            androidx.appcompat.widget.ActionBarContextView r4 = r8.A0A
            r0 = 200(0xc8, double:9.9E-322)
            X.0SH r2 = r4.A0C
            if (r2 == 0) goto L_0x0041
            r2.A01()
        L_0x0041:
            int r2 = r4.getVisibility()
            if (r2 == 0) goto L_0x004a
            r4.setAlpha(r5)
        L_0x004a:
            X.0SH r5 = X.C004601z.A0H(r4)
            r2 = 1065353216(0x3f800000, float:1.0)
            r5.A03(r2)
            r5.A08(r0)
            X.0bD r1 = r4.A0J
            androidx.appcompat.widget.ActionBarContextView r0 = r1.A02
            r0.A0C = r5
            r1.A00 = r3
            r5.A0A(r1)
        L_0x0061:
            X.0QX r4 = new X.0QX
            r4.<init>()
            java.util.ArrayList r3 = r4.A05
            r3.add(r6)
            android.view.View r0 = X.AnonymousClass0SH.A00(r6)
            if (r0 == 0) goto L_0x008d
            android.view.ViewPropertyAnimator r0 = r0.animate()
            long r1 = r0.getDuration()
        L_0x0079:
            android.view.View r0 = X.AnonymousClass0SH.A00(r5)
            if (r0 == 0) goto L_0x0086
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.setStartDelay(r1)
        L_0x0086:
            r3.add(r5)
            r4.A01()
            return
        L_0x008d:
            r1 = 0
            goto L_0x0079
        L_0x0090:
            r1 = 200(0xc8, double:9.9E-322)
            X.09F r7 = (X.AnonymousClass09F) r7
            androidx.appcompat.widget.Toolbar r0 = r7.A09
            X.0SH r5 = X.C004601z.A0H(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.A03(r0)
            r5.A08(r1)
            com.facebook.redex.IDxLAdapterShape0S0111000_I1 r0 = new com.facebook.redex.IDxLAdapterShape0S0111000_I1
            r0.<init>(r7, r3)
            r5.A0A(r0)
            androidx.appcompat.widget.ActionBarContextView r3 = r8.A0A
            r1 = 100
            X.0SH r0 = r3.A0C
            if (r0 == 0) goto L_0x00b5
            r0.A01()
        L_0x00b5:
            r0 = 0
            X.0SH r6 = X.C004601z.A0H(r3)
            r6.A03(r0)
            r6.A08(r1)
            X.0bD r1 = r3.A0J
            androidx.appcompat.widget.ActionBarContextView r0 = r1.A02
            r0.A0C = r6
            r1.A00 = r4
            r6.A0A(r1)
            goto L_0x0061
        L_0x00cc:
            if (r0 == 0) goto L_0x000d
            r0 = 0
            r8.A0N = r0
            goto L_0x000a
        L_0x00d3:
            X.09G r0 = r8.A0C
            if (r9 == 0) goto L_0x00e5
            r1 = 4
            X.09F r0 = (X.AnonymousClass09F) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A0A
            r0.setVisibility(r3)
            return
        L_0x00e5:
            X.09F r0 = (X.AnonymousClass09F) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            r0.setVisibility(r3)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.A0A
            r0.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02480Cg.A0Z(boolean):void");
    }

    public final void A0a(boolean z2) {
        View view;
        View view2;
        View view3;
        boolean z3 = this.A0N || (!this.A0H && !this.A0I);
        boolean z4 = this.A0L;
        if (z3) {
            if (!z4) {
                this.A0L = true;
                AnonymousClass0QX r0 = this.A08;
                if (r0 != null) {
                    r0.A00();
                }
                this.A09.setVisibility(0);
                if (this.A00 != 0 || (!this.A0M && !z2)) {
                    this.A09.setAlpha(1.0f);
                    this.A09.setTranslationY(0.0f);
                    if (this.A0F && (view2 = this.A04) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.A0P.AMS((View) null);
                } else {
                    this.A09.setTranslationY(0.0f);
                    float f2 = (float) (-this.A09.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.A09.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.A09.setTranslationY(f2);
                    AnonymousClass0QX r3 = new AnonymousClass0QX();
                    AnonymousClass0SH A0H2 = C004601z.A0H(this.A09);
                    A0H2.A07(0.0f);
                    A0H2.A0B(this.A0Q);
                    if (!r3.A03) {
                        r3.A05.add(A0H2);
                    }
                    if (this.A0F && (view3 = this.A04) != null) {
                        view3.setTranslationY(f2);
                        AnonymousClass0SH A0H3 = C004601z.A0H(view3);
                        A0H3.A07(0.0f);
                        if (!r3.A03) {
                            r3.A05.add(A0H3);
                        }
                    }
                    Interpolator interpolator = A0S;
                    boolean z5 = r3.A03;
                    if (!z5) {
                        r3.A01 = interpolator;
                        r3.A00 = 250;
                    }
                    C13190lc r02 = this.A0P;
                    if (!z5) {
                        r3.A02 = r02;
                    }
                    this.A08 = r3;
                    r3.A01();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.A0B;
                if (actionBarOverlayLayout != null) {
                    C004601z.A0T(actionBarOverlayLayout);
                }
            }
        } else if (z4) {
            this.A0L = false;
            AnonymousClass0QX r03 = this.A08;
            if (r03 != null) {
                r03.A00();
            }
            if (this.A00 != 0 || (!this.A0M && !z2)) {
                this.A0O.AMS((View) null);
                return;
            }
            this.A09.setAlpha(1.0f);
            this.A09.setTransitioning(true);
            AnonymousClass0QX r32 = new AnonymousClass0QX();
            float f3 = (float) (-this.A09.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.A09.getLocationInWindow(iArr2);
                f3 -= (float) iArr2[1];
            }
            AnonymousClass0SH A0H4 = C004601z.A0H(this.A09);
            A0H4.A07(f3);
            A0H4.A0B(this.A0Q);
            if (!r32.A03) {
                r32.A05.add(A0H4);
            }
            if (this.A0F && (view = this.A04) != null) {
                AnonymousClass0SH A0H5 = C004601z.A0H(view);
                A0H5.A07(f3);
                if (!r32.A03) {
                    r32.A05.add(A0H5);
                }
            }
            Interpolator interpolator2 = A0R;
            boolean z6 = r32.A03;
            if (!z6) {
                r32.A01 = interpolator2;
                r32.A00 = 250;
            }
            C13190lc r04 = this.A0O;
            if (!z6) {
                r32.A02 = r04;
            }
            this.A08 = r32;
            r32.A01();
        }
    }
}
