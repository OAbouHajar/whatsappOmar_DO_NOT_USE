package X;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.IDxDListenerShape58S0200000_2_I1;

/* renamed from: X.4mg  reason: invalid class name and case insensitive filesystem */
public class C95464mg implements C015507l {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass3BH A01;
    public final /* synthetic */ AnonymousClass013 A02;
    public final /* synthetic */ C17020u3 A03;

    public C95464mg(Context context, AnonymousClass3BH r2, AnonymousClass013 r3, C17020u3 r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = context;
        this.A03 = r4;
    }

    public void AUN(int i2) {
    }

    public void AUO(int i2, float f2, int i3) {
    }

    public void AUP(int i2) {
        AnonymousClass3BH r2 = this.A01;
        ViewPager viewPager = r2.A0K;
        View findViewWithTag = viewPager.findViewWithTag(Integer.valueOf(r2.A00));
        if (findViewWithTag != null) {
            ((AbsListView) findViewWithTag).setOnScrollListener((AbsListView.OnScrollListener) null);
        }
        if (C13680ns.A1Z(this.A02)) {
            r2.A00 = i2;
        } else {
            int length = (r2.A0R.length - 1) - i2;
            i2 = length;
            r2.A00 = length;
        }
        r2.A00(i2);
        View findViewWithTag2 = viewPager.findViewWithTag(Integer.valueOf(r2.A00));
        if (findViewWithTag2 != null) {
            ((AbsListView) findViewWithTag2).setOnScrollListener(r2.A0I);
            findViewWithTag2.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape58S0200000_2_I1(findViewWithTag2, 1, this));
        }
    }
}
