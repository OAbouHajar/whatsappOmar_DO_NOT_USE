package com.obwhatsapp.settings.chat.wallpaper;

import X.AnonymousClass00T;
import X.AnonymousClass3D8;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C15830rv;
import X.C16030sJ;
import X.C16150sX;
import X.C49132Rg;
import X.C606134l;
import X.C78233xY;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.CheckBox;
import com.facebook.redex.IDxCListenerShape220S0100000_2_I1;
import com.facebook.redex.IDxLAdapterShape4S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.collections.MarginCorrectedViewPager;

public class SolidColorWallpaperPreview extends C78233xY {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public CheckBox A08;
    public MarginCorrectedViewPager A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int[] A0D;
    public int[] A0E;

    public SolidColorWallpaperPreview() {
        this(0);
        this.A0C = false;
        this.A0A = false;
    }

    public SolidColorWallpaperPreview(int i2) {
        this.A0B = false;
        C13680ns.A1G(this, 126);
    }

    public void A1q() {
        if (!this.A0B) {
            this.A0B = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A01 = C16150sX.A0M(r1);
            this.A02 = C16150sX.A0Q(r1);
        }
    }

    public void A37(C15830rv r4) {
        Intent A092 = C13680ns.A09();
        A092.putExtra("wallpaper_color_file", this.A0E[this.A09.getCurrentItem()]);
        A092.putExtra("wallpaper_doodle_overlay", this.A08.isChecked());
        C16030sJ.A0B(A092, r4);
        setResult(-1, A092);
        finish();
    }

    public final void A38(int i2) {
        int i3 = getResources().getIntArray(R.array.array001c)[i2];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.A0D;
            if (i5 >= iArr.length) {
                break;
            } else if (iArr[i5] == i3) {
                i4 = i5;
                break;
            } else {
                i5++;
            }
        }
        this.A09.setCurrentItem(i4);
    }

    public final void A39(int i2) {
        int i3;
        int i4;
        if (this.A0A) {
            this.A0C = true;
            this.A09.setScrollEnabled(false);
            DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
            if (i2 != getIntent().getIntExtra("scw_preview_color", -1)) {
                this.A02 = 0;
                this.A03 = 0;
                i3 = this.A09.getWidth() >> 1;
                i4 = this.A09.getWidth() >> 1;
            } else {
                i3 = 0;
                i4 = 0;
            }
            this.A09.setPivotX((float) i3);
            this.A09.setPivotY((float) i4);
            this.A05.setBackgroundColor(0);
            this.A09.animate().setDuration(250).alpha(0.0f).scaleX(this.A00).scaleY(this.A01).translationX((float) this.A02).translationY((float) this.A03).setInterpolator(decelerateInterpolator).setListener(new IDxLAdapterShape4S0100000_2_I1(this, 10));
            this.A04.animate().setDuration(250).alpha(0.0f).setInterpolator(decelerateInterpolator);
            this.A06.animate().setDuration(250).alpha(0.0f).setInterpolator(decelerateInterpolator);
            return;
        }
        finish();
    }

    public void finish() {
        super.finish();
        if (this.A0A && this.A0C) {
            overridePendingTransition(0, 0);
        }
    }

    public void onBackPressed() {
        setResult(0, (Intent) null);
        A39(this.A09.getCurrentItem());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05 = AnonymousClass00T.A05(this, R.id.wallpaper_preview_container);
        this.A04 = AnonymousClass00T.A05(this, R.id.appbar);
        this.A07 = AnonymousClass00T.A05(this, R.id.transition_view);
        int[] intArray = getResources().getIntArray(R.array.array001c);
        int length = intArray.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = i2;
        }
        Pair A0I = C13690nt.A0I(intArray, iArr);
        this.A0D = (int[]) A0I.first;
        this.A0E = (int[]) A0I.second;
        MarginCorrectedViewPager marginCorrectedViewPager = (MarginCorrectedViewPager) AnonymousClass00T.A05(this, R.id.wallpaper_preview);
        this.A09 = marginCorrectedViewPager;
        marginCorrectedViewPager.setSaveEnabled(false);
        CheckBox checkBox = (CheckBox) AnonymousClass00T.A05(this, R.id.color_wallpaper_add_doodles);
        this.A08 = checkBox;
        checkBox.setVisibility(0);
        this.A08.setText(R.string.str1b6b);
        C606134l r4 = new C606134l(this, this);
        r4.A00 = this.A08.isChecked();
        this.A08.setOnCheckedChangeListener(new IDxCListenerShape220S0100000_2_I1(r4, 5));
        this.A09.setAdapter(r4);
        this.A09.setPageMargin((int) (C13680ns.A01(this) * 15.0f));
        View A052 = AnonymousClass00T.A05(this, R.id.control_holder);
        this.A06 = A052;
        A052.setBackground(C13690nt.A0C(this, R.drawable.wallpaper_color_confirmation_background));
        C13680ns.A19(AnonymousClass00T.A05(this, R.id.cancel_button), this, 25);
        A38(getIntent().getIntExtra("scw_preview_color", 0));
        this.A0C = false;
        boolean booleanExtra = getIntent().getBooleanExtra("wallpaper_preview_intent_extra_animate", false);
        this.A0A = booleanExtra;
        if (booleanExtra) {
            overridePendingTransition(0, 0);
            Intent intent = getIntent();
            this.A0C = true;
            this.A09.setScrollEnabled(false);
            this.A07.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass3D8(this, intent.getIntExtra("wallpaper_preview_intent_extra_x", 0), intent.getIntExtra("wallpaper_preview_intent_extra_y", 0), intent.getIntExtra("wallpaper_preview_intent_extra_width", 0), intent.getIntExtra("wallpaper_preview_intent_extra_height", 0)));
            return;
        }
        this.A05.setBackgroundColor(getResources().getColor(R.color.color090b));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0, (Intent) null);
        A39(this.A09.getCurrentItem());
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        A38(bundle.getInt("selected_index"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_index", this.A0E[this.A09.getCurrentItem()]);
    }
}
