package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.IDxCListenerShape111S0200000_2_I0;
import com.facebook.redex.IDxSListenerShape34S0100000_2_I0;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.04t  reason: invalid class name and case insensitive filesystem */
public abstract class C009904t {
    public int A00;
    public LayoutInflater A01;
    public AnonymousClass071 A02;
    public C59212v3 A03;
    public C109455Se A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final AnonymousClass071 A08 = new IDxSListenerShape34S0100000_2_I0(this, 11);
    public final AnonymousClass071 A09 = new IDxSListenerShape34S0100000_2_I0(this, 12);
    public final ViewPager A0A;
    public final AnonymousClass013 A0B;

    public C009904t(Context context, ViewGroup viewGroup, AnonymousClass071 r6, AnonymousClass013 r7, int i2) {
        this.A07 = context;
        this.A0B = r7;
        this.A01 = LayoutInflater.from(context);
        ViewPager viewPager = (ViewPager) viewGroup.findViewById(i2);
        this.A0A = viewPager;
        this.A02 = r6;
        this.A05 = AnonymousClass00T.A00(context, R.color.color01f5);
        this.A06 = AnonymousClass00T.A00(context, R.color.color05b1);
        viewPager.A0G(new IDxCListenerShape111S0200000_2_I0(r7, 1, this));
    }

    public int A00() {
        ViewPager viewPager;
        int A012;
        AnonymousClass013 r7 = this.A0B;
        if (!r7.A0T()) {
            viewPager = this.A0A;
            A012 = viewPager.getCurrentItem();
        } else {
            viewPager = this.A0A;
            A012 = (this.A03.A01() - 1) - viewPager.getCurrentItem();
        }
        if (A012 < 0) {
            Log.i(String.format(Locale.US, "ContentPicker/getCurrentPageIndex < 0, isLtr: %s, pagerAdapter.getCount(): %d, viewPager.getCurrentItem(): %d", new Object[]{Boolean.valueOf(!r7.A0T()), Integer.valueOf(this.A03.A01()), Integer.valueOf(viewPager.getCurrentItem())}));
        }
        return A012;
    }

    public void A01(int i2, boolean z2) {
        boolean z3 = true;
        int A012 = this.A0B.A0T() ^ true ? i2 : (this.A03.A01() - 1) - i2;
        if (A012 < 0) {
            Log.i(String.format(Locale.US, "ContentPicker/selectPageByIndex/absoluteIndex < 0, pagerAdapter.getCount(): %d, index: %d", new Object[]{Integer.valueOf(this.A03.A01()), Integer.valueOf(i2)}));
        }
        C59212v3 r1 = this.A03;
        if (r1 != null && i2 >= 0 && i2 < r1.A01() && this.A00 != A012) {
            ViewPager viewPager = this.A0A;
            if (!z2) {
                z3 = false;
            }
            viewPager.A0F(A012, z3);
        }
    }

    public void A02(C59212v3 r3) {
        this.A03 = r3;
        r3.A0L(this.A08);
        this.A03.A0L(this.A09);
        this.A0A.setAdapter(this.A03);
    }

    public void A03(int i2) {
    }
}
