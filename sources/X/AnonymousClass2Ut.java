package X;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape240S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape243S0100000_2_I0;
import com.facebook.redex.IDxLAdapterShape3S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape436S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape0S0102000_2_I0;
import com.facebook.redex.IDxUListenerShape0S0204000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3;
import com.obwhatsapp.ClearableEditText;
import com.obwhatsapp.R;

/* renamed from: X.2Ut  reason: invalid class name */
public class AnonymousClass2Ut {
    public ValueAnimator A00;
    public ValueAnimator A01;
    public final Activity A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ImageView A07;
    public final TextView A08;
    public final TextView A09;
    public final ClearableEditText A0A;
    public final AnonymousClass013 A0B;
    public final AnonymousClass2X3 A0C;
    public final AnonymousClass1PJ A0D;
    public final C23061Ai A0E;
    public final AnonymousClass2OJ A0F;

    public AnonymousClass2Ut(Activity activity, View view, C001300o r9, C001500q r10, AnonymousClass013 r11, AnonymousClass1PJ r12, C23061Ai r13, AnonymousClass2OJ r14) {
        this.A0E = r13;
        this.A0B = r11;
        this.A0D = r12;
        this.A03 = view;
        this.A02 = activity;
        this.A0F = r14;
        this.A0C = (AnonymousClass2X3) new C006602z((AnonymousClass04o) new C95164mC(), r10).A01(AnonymousClass2X3.class);
        this.A09 = (TextView) C004601z.A0E(view, R.id.sticker_tab_button);
        this.A08 = (TextView) C004601z.A0E(view, R.id.emoji_tab_button);
        this.A06 = C004601z.A0E(view, R.id.tab_buttons_container);
        this.A05 = C004601z.A0E(view, R.id.search_container);
        this.A0A = (ClearableEditText) C004601z.A0E(view, R.id.search_entry);
        this.A07 = (ImageView) C004601z.A0E(view, R.id.search_icon);
        this.A04 = C004601z.A0E(view, R.id.search_button);
        View view2 = this.A06;
        view2.setVisibility(0);
        TextView textView = this.A09;
        textView.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 47));
        TextView textView2 = this.A08;
        textView2.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 46));
        if (r11.A0T()) {
            textView.setBackgroundResource(R.drawable.shape_picker_right_tab_background);
            textView2.setBackgroundResource(R.drawable.shape_picker_left_tab_background);
        }
        view2.addOnLayoutChangeListener(new IDxCListenerShape243S0100000_2_I0(this, 1));
        ClearableEditText clearableEditText = this.A0A;
        clearableEditText.setHint(this.A03.getContext().getString(R.string.str1d7c));
        clearableEditText.getBackground().setAlpha(clearableEditText.hasFocus() ? 230 : 204);
        clearableEditText.setOnFocusChangeListener(new IDxCListenerShape240S0100000_2_I0(this, 1));
        clearableEditText.addTextChangedListener(new C78523yD(clearableEditText, this.A05, this.A0C));
        clearableEditText.A01 = new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 49);
        clearableEditText.setVisibility(4);
        clearableEditText.setAlwaysShowClearIcon(true);
        View view3 = this.A04;
        view3.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0_3((Object) this, 48));
        view3.setVisibility(0);
        this.A07.setVisibility(0);
        A00(0, false);
        AnonymousClass1PJ r2 = this.A0D;
        r2.A00 = new IDxSListenerShape436S0100000_2_I0(this, 1);
        this.A0C.A01.A0B(Boolean.valueOf(r2.A02));
        r2.A01();
        this.A0F.A0A(r9, new IDxObserverShape115S0100000_2_I0((Object) this, 199));
        AnonymousClass2X3 r3 = this.A0C;
        r3.A03.A0A(r9, new IDxObserverShape115S0100000_2_I0((Object) this, 200));
        r3.A01.A0A(r9, new IDxObserverShape115S0100000_2_I0((Object) this, 202));
        r3.A00.A0A(r9, new IDxObserverShape115S0100000_2_I0((Object) this, 201));
    }

    public final void A00(long j2, boolean z2) {
        IDxLAdapterShape3S0100000_2_I0 iDxLAdapterShape3S0100000_2_I0;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        long j3 = j2;
        if (z2) {
            int width = this.A0A.getWidth();
            View view = this.A03;
            int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(R.dimen.dimen0729);
            iDxLAdapterShape3S0100000_2_I0 = new IDxLAdapterShape3S0100000_2_I0(this, 20);
            A01(iDxLAdapterShape3S0100000_2_I0, width, dimensionPixelSize3, j3);
            if (!((Boolean) this.A0F.A01()).booleanValue()) {
                dimensionPixelSize2 = view.getResources().getDimensionPixelSize(R.dimen.dimen06ac);
                dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.dimen06ab);
            } else {
                return;
            }
        } else {
            View view2 = this.A03;
            int dimensionPixelSize4 = view2.getResources().getDimensionPixelSize(R.dimen.dimen0728);
            int dimensionPixelSize5 = view2.getResources().getDimensionPixelSize(R.dimen.dimen0717);
            iDxLAdapterShape3S0100000_2_I0 = new IDxLAdapterShape3S0100000_2_I0(this, 21);
            A01(iDxLAdapterShape3S0100000_2_I0, dimensionPixelSize4, dimensionPixelSize5, j3);
            if (!((Boolean) this.A0F.A01()).booleanValue()) {
                dimensionPixelSize = view2.getResources().getDimensionPixelSize(R.dimen.dimen06ac);
                dimensionPixelSize2 = view2.getResources().getDimensionPixelSize(R.dimen.dimen06ab);
            } else {
                return;
            }
        }
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.A00 = ofFloat;
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        } else {
            valueAnimator.removeAllUpdateListeners();
            this.A00.removeAllListeners();
        }
        this.A00.setDuration(j2);
        this.A00.addUpdateListener(new IDxUListenerShape0S0102000_2_I0(this.A05.getLayoutParams(), dimensionPixelSize, dimensionPixelSize2, 1));
        this.A00.addListener(iDxLAdapterShape3S0100000_2_I0);
        this.A00.start();
    }

    public final void A01(AnimatorListenerAdapter animatorListenerAdapter, int i2, int i3, long j2) {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.A01 = ofFloat;
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        } else {
            valueAnimator.removeAllUpdateListeners();
            this.A01.removeAllListeners();
        }
        this.A01.setDuration(j2);
        View view = this.A04;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.setVisibility(0);
        this.A01.addUpdateListener(new IDxUListenerShape0S0204000_2_I0(layoutParams, this, i2, view.getWidth(), i3, view.getHeight()));
        this.A01.addListener(animatorListenerAdapter);
        this.A01.start();
    }
}
