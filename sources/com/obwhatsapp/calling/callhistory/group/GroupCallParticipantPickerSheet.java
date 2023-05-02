package com.obwhatsapp.calling.callhistory.group;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass06y;
import X.AnonymousClass0Bo;
import X.AnonymousClass267;
import X.AnonymousClass2JP;
import X.AnonymousClass2SR;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16030sJ;
import X.C16150sX;
import X.C204310c;
import X.C34331k5;
import X.C447725m;
import X.C49132Rg;
import X.C67463be;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.widget.SearchView;
import com.facebook.redex.IDxIDrawableShape12S0100000_2_I1;
import com.facebook.redex.IDxLListenerShape145S0100000_2_I1;
import com.facebook.redex.IDxTListenerShape168S0100000_2_I1;
import com.facebook.redex.IDxTListenerShape171S0100000_2_I1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class GroupCallParticipantPickerSheet extends GroupCallParticipantPicker {
    public float A00;
    public float A01;
    public ColorDrawable A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewTreeObserver.OnGlobalLayoutListener A06;
    public SearchView A07;
    public BottomSheetBehavior A08;
    public boolean A09;
    public boolean A0A;

    public GroupCallParticipantPickerSheet() {
        this(0);
        this.A06 = new IDxLListenerShape145S0100000_2_I1(this, 2);
    }

    public GroupCallParticipantPickerSheet(int i2) {
        this.A09 = false;
        C13680ns.A1G(this, 31);
    }

    public void A1q() {
        if (!this.A09) {
            this.A09 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0g(r1, C14530pL.A0D(r1, this), this);
            this.A00 = (C204310c) r1.A3O.get();
        }
    }

    public final void A3g() {
        this.A07.A0F("");
        AnonymousClass0Bo r1 = (AnonymousClass0Bo) this.A03.getLayoutParams();
        r1.A01(this.A08);
        r1.height = (int) this.A00;
        this.A03.setLayoutParams(r1);
        this.A05.setVisibility(0);
        this.A04.setVisibility(8);
    }

    public final void A3h() {
        int size;
        Point point = new Point();
        C13680ns.A0s(this, point);
        Rect A0J = AnonymousClass000.A0J();
        C13690nt.A0J(this).getWindowVisibleDisplayFrame(A0J);
        float f2 = (float) (point.y - A0J.top);
        this.A01 = f2;
        this.A00 = (float) ((int) (f2 * 0.75f));
        if (!AnonymousClass2JP.A06(this.A08.A0P())) {
            int i2 = (int) (this.A01 * 0.55f);
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0419) + getResources().getDimensionPixelSize(R.dimen.dimen0454);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dimen0203);
            int i3 = i2 + ((dimensionPixelSize2 >> 1) - ((i2 - dimensionPixelSize) % dimensionPixelSize2));
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("jids");
            if (stringArrayListExtra != null && (size = stringArrayListExtra.size()) > 0) {
                i3 = Math.min(i3, dimensionPixelSize + getResources().getDimensionPixelSize(R.dimen.dimen06dd) + (dimensionPixelSize2 * size));
            }
            this.A08.A0L(i3);
        }
    }

    public final void A3i() {
        AnonymousClass0Bo r1 = (AnonymousClass0Bo) this.A03.getLayoutParams();
        r1.A01((AnonymousClass06y) null);
        r1.height = -1;
        this.A03.setLayoutParams(r1);
        this.A07.setIconified(false);
        this.A05.setVisibility(8);
        this.A04.setVisibility(0);
    }

    public void onBackPressed() {
        if (this.A04.getVisibility() == 0) {
            A3g();
        } else {
            this.A08.A0M(5);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A3h();
        if (this.A04.getVisibility() != 0) {
            ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(this.A03);
            A0O.height = (int) this.A00;
            this.A03.setLayoutParams(A0O);
        }
        this.A0A = true;
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A06);
        this.A03.requestLayout();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(R.id.action_bar).setVisibility(8);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
        }
        View findViewById = findViewById(R.id.bottom_sheet);
        this.A03 = findViewById;
        this.A08 = BottomSheetBehavior.A00(findViewById);
        this.A03.getViewTreeObserver().addOnGlobalLayoutListener(this.A06);
        BottomSheetBehavior bottomSheetBehavior = this.A08;
        bottomSheetBehavior.A0J = true;
        bottomSheetBehavior.A0M(5);
        A3h();
        ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(this.A03);
        A0O.height = (int) this.A00;
        this.A03.setLayoutParams(A0O);
        ListView ADA = ADA();
        if (i2 >= 21) {
            ADA.setNestedScrollingEnabled(true);
        }
        View findViewById2 = findViewById(R.id.background);
        C004601z.A0d(findViewById2, 2);
        PointF pointF = new PointF();
        C13680ns.A1B(findViewById2, this, pointF, 25);
        findViewById2.setOnTouchListener(new IDxTListenerShape168S0100000_2_I1(pointF, 2));
        ColorDrawable colorDrawable = new ColorDrawable();
        this.A02 = colorDrawable;
        findViewById2.setBackground(colorDrawable);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration((long) getResources().getInteger(17694720));
        findViewById2.startAnimation(alphaAnimation);
        this.A08.A0E = new C67463be(this);
        this.A05 = findViewById(R.id.title_holder);
        View findViewById3 = findViewById(R.id.search_holder_sheet);
        this.A04 = findViewById3;
        AnonymousClass267.A00(findViewById3);
        this.A04.setVisibility(8);
        SearchView searchView = (SearchView) this.A04.findViewById(R.id.search_view);
        this.A07 = searchView;
        searchView.setIconifiedByDefault(false);
        this.A07.setQueryHint(getString(R.string.str0a44));
        C13680ns.A0K(this.A07, R.id.search_mag_icon).setImageDrawable(new IDxIDrawableShape12S0100000_2_I1(AnonymousClass00T.A04(this, R.drawable.ic_back), this, 0));
        this.A07.A0B = new IDxTListenerShape171S0100000_2_I1(this, 1);
        ImageView A0K = C13680ns.A0K(this.A04, R.id.search_back);
        A0K.setImageDrawable(new C447725m(AnonymousClass2SR.A06(getResources().getDrawable(R.drawable.ic_back), getResources().getColor(R.color.color04ef)), this.A0S));
        C34331k5.A01(A0K, this, 32);
        C13680ns.A18(findViewById(R.id.search_btn), this, 39);
        C13680ns.A0N(this, R.id.sheet_title).setText(getResources().getQuantityString(R.plurals.plurals00a5, C16030sJ.A07(getIntent(), UserJid.class).size()));
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("search")) {
            A3i();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("search", AnonymousClass000.A1P(this.A04.getVisibility()));
    }
}
