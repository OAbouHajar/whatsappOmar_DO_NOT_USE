package X;

import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.WaViewPager;

/* renamed from: X.3TG  reason: invalid class name */
public class AnonymousClass3TG extends AnonymousClass012 {
    public final AnonymousClass012 A00;
    public final AnonymousClass013 A01;

    public AnonymousClass3TG(AnonymousClass012 r2, AnonymousClass013 r3) {
        this.A01 = r3;
        this.A00 = r2;
        r2.A07(new AnonymousClass3Ku(this));
    }

    public float A00(int i2) {
        AnonymousClass012 r2 = this.A00;
        return r2.A00(WaViewPager.A00(this.A01, i2, r2.A01()));
    }

    public int A01() {
        return this.A00.A01();
    }

    public int A02(Object obj) {
        AnonymousClass012 r3 = this.A00;
        int A02 = r3.A02(obj);
        return (A02 == -2 || A02 == -1) ? A02 : WaViewPager.A00(this.A01, A02, r3.A01());
    }

    public CharSequence A04(int i2) {
        AnonymousClass012 r2 = this.A00;
        return r2.A04(WaViewPager.A00(this.A01, i2, r2.A01()));
    }

    public Object A05(ViewGroup viewGroup, int i2) {
        AnonymousClass012 r2 = this.A00;
        return r2.A05(viewGroup, WaViewPager.A00(this.A01, i2, r2.A01()));
    }

    public void A0A(ViewGroup viewGroup) {
        this.A00.A0A(viewGroup);
    }

    public void A0C(ViewGroup viewGroup, Object obj, int i2) {
        AnonymousClass012 r2 = this.A00;
        r2.A0C(viewGroup, obj, WaViewPager.A00(this.A01, i2, r2.A01()));
    }

    public void A0D(ViewGroup viewGroup, Object obj, int i2) {
        AnonymousClass012 r2 = this.A00;
        int A012 = r2.A01();
        if (i2 == A012) {
            A012++;
        }
        r2.A0D(viewGroup, obj, WaViewPager.A00(this.A01, i2, A012));
    }

    public boolean A0E(View view, Object obj) {
        return this.A00.A0E(view, obj);
    }
}
