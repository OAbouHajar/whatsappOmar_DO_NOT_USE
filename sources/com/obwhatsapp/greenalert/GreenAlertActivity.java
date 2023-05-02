package com.obwhatsapp.greenalert;

import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass135;
import X.AnonymousClass13G;
import X.AnonymousClass2E5;
import X.AnonymousClass3TJ;
import X.C004601z;
import X.C12410kM;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14870pt;
import X.C16150sX;
import X.C17120uZ;
import X.C17220uj;
import X.C18160wF;
import X.C19220xx;
import X.C19980zJ;
import X.C23071Aj;
import X.C49132Rg;
import X.C57792ro;
import X.C95074lw;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxLListenerShape145S0100000_2_I1;
import com.facebook.redex.IDxLListenerShape60S0200000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape3S0110000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.WaTabLayout;
import com.obwhatsapp.WaViewPager;
import com.obwhatsapp.components.Button;

public class GreenAlertActivity extends C14530pL {
    public static final int[] A0I = {R.string.str0a1b, R.string.str0a18};
    public static final int[] A0J = {R.string.str0a13, R.string.str0a16};
    public static final int[] A0K = {R.string.str0a10, R.string.str0a14};
    public static final int[] A0L = {R.string.str0a11, R.string.str0a15};
    public static final int[] A0M = {R.string.str0a12, R.string.str0a12};
    public static final int[] A0N = {R.string.str0a1a, R.string.str0a17};
    public static final int[] A0O = {R.string.str0a1d, R.string.str0a19};
    public View A00;
    public View A01;
    public WaImageButton A02;
    public WaImageButton A03;
    public WaImageButton A04;
    public WaTabLayout A05;
    public WaViewPager A06;
    public Button A07;
    public C17120uZ A08;
    public AnonymousClass013 A09;
    public C57792ro A0A;
    public AnonymousClass13G A0B;
    public C19220xx A0C;
    public C17220uj A0D;
    public AnonymousClass135 A0E;
    public C18160wF A0F;
    public boolean A0G;
    public final C12410kM A0H;

    public GreenAlertActivity() {
        this(0);
        this.A0H = new C95074lw(this);
    }

    public GreenAlertActivity(int i2) {
        this.A0G = false;
        C13680ns.A1G(this, 69);
    }

    public void A1q() {
        if (!this.A0G) {
            this.A0G = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A0F = (C18160wF) r1.A5o.get();
            this.A0D = C16150sX.A18(r1);
            this.A09 = C16150sX.A0Z(r1);
            this.A0B = (AnonymousClass13G) r1.APh.get();
            this.A0C = (C19220xx) r1.APi.get();
            this.A0E = (AnonymousClass135) r1.AP7.get();
            this.A08 = C16150sX.A0W(r1);
        }
    }

    public final void A35() {
        int currentLogicalItem = this.A06.getCurrentLogicalItem();
        if (AnonymousClass2E5.A02(this.A0C)) {
            AnonymousClass13G r2 = this.A0B;
            int i2 = 12;
            if (currentLogicalItem == 1) {
                i2 = 4;
            }
            r2.A01(Integer.valueOf(i2));
            finish();
            return;
        }
        C19980zJ.A03(this);
    }

    public final void A36() {
        WaViewPager waViewPager = this.A06;
        View findViewWithTag = waViewPager.findViewWithTag(Integer.valueOf(waViewPager.getCurrentLogicalItem()));
        if (findViewWithTag != null) {
            findViewWithTag.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape60S0200000_2_I1(this, 3, findViewWithTag));
        }
    }

    public final void A37(int i2) {
        WaImageButton waImageButton = this.A02;
        int i3 = 0;
        if (i2 == 0) {
            i3 = 8;
        }
        waImageButton.setVisibility(i3);
        Button button = this.A07;
        int i4 = R.string.str0a0e;
        if (i2 == 1) {
            i4 = R.string.str0a0c;
        }
        button.setText(i4);
    }

    public final void A38(int i2) {
        WaImageButton waImageButton;
        View findViewWithTag = this.A06.findViewWithTag(Integer.valueOf(i2));
        if (findViewWithTag != null) {
            int i3 = 0;
            if (i2 != 1 || !this.A06.findViewWithTag(1).canScrollVertically(1)) {
                this.A07.setVisibility(0);
                waImageButton = this.A04;
                i3 = 8;
            } else {
                this.A07.setVisibility(4);
                waImageButton = this.A04;
            }
            waImageButton.setVisibility(i3);
            float dimension = getResources().getDimension(R.dimen.dimen040e);
            View view = this.A01;
            float f2 = 0.0f;
            if (findViewWithTag.getScrollY() <= 0) {
                dimension = 0.0f;
            }
            C004601z.A0X(view, dimension);
            float dimension2 = getResources().getDimension(R.dimen.dimen040d);
            boolean canScrollVertically = findViewWithTag.canScrollVertically(1);
            View view2 = this.A00;
            if (canScrollVertically) {
                f2 = dimension2;
            }
            C004601z.A0X(view2, f2);
        }
    }

    public void onBackPressed() {
        int max = Math.max(-1, this.A06.getCurrentLogicalItem() - 1);
        if (max < 0) {
            A35();
            return;
        }
        this.A06.setCurrentLogicalItem(max);
        A37(max);
        A38(max);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A36();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout004b);
        this.A02 = (WaImageButton) AnonymousClass00T.A05(this, R.id.green_alert_back_button);
        this.A03 = (WaImageButton) AnonymousClass00T.A05(this, R.id.green_alert_dismiss_button);
        this.A07 = (Button) AnonymousClass00T.A05(this, R.id.green_alert_continue_button);
        this.A04 = (WaImageButton) AnonymousClass00T.A05(this, R.id.green_alert_scroll_tos_button);
        this.A05 = (WaTabLayout) AnonymousClass00T.A05(this, R.id.green_alert_tab_layout);
        this.A01 = AnonymousClass00T.A05(this, R.id.green_alert_sticky_top_panel);
        this.A00 = AnonymousClass00T.A05(this, R.id.green_alert_sticky_bottom_panel);
        this.A06 = (WaViewPager) AnonymousClass00T.A05(this, R.id.green_alert_viewpager);
        boolean A022 = AnonymousClass2E5.A02(this.A0C);
        C14870pt r7 = this.A05;
        C18160wF r13 = this.A0F;
        C19980zJ r6 = this.A00;
        C23071Aj r8 = this.A02;
        C17220uj r12 = this.A0D;
        AnonymousClass01V r9 = this.A08;
        AnonymousClass013 r11 = this.A09;
        C57792ro r4 = new C57792ro(this.A0H, r6, r7, r8, r9, this.A08, r11, r12, r13);
        this.A0A = r4;
        this.A06.setAdapter(r4);
        this.A06.A0G(new AnonymousClass3TJ(this));
        this.A06.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape145S0100000_2_I1(this, 7));
        this.A05.setupWithViewPager(this.A06);
        this.A05.setupTabsForAccessibility(this.A07);
        this.A05.setTabsClickable(false);
        this.A02.setOnClickListener(new ViewOnClickCListenerShape3S0110000_I1(this, 2, A022));
        C13680ns.A16(this.A03, this, 20);
        this.A07.setOnClickListener(new ViewOnClickCListenerShape3S0110000_I1(this, 3, A022));
        C13680ns.A16(this.A04, this, 19);
        int intExtra = getIntent().getIntExtra("page", 0);
        this.A06.setCurrentLogicalItem(intExtra);
        A37(intExtra);
        A38(intExtra);
        this.A0B.A01(11);
    }

    public void onResume() {
        super.onResume();
        boolean A022 = AnonymousClass2E5.A02(this.A0C);
        WaImageButton waImageButton = this.A03;
        int i2 = 0;
        if (!A022) {
            i2 = 8;
        }
        waImageButton.setVisibility(i2);
    }
}
