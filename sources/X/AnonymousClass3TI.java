package X;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;

/* renamed from: X.3TI  reason: invalid class name */
public class AnonymousClass3TI extends AnonymousClass012 {
    public final AnonymousClass012 A00;

    public AnonymousClass3TI(AnonymousClass012 r1) {
        this.A00 = r1;
    }

    public float A00(int i2) {
        return this.A00.A00(i2);
    }

    public int A01() {
        AnonymousClass012 r0 = this.A00;
        int A01 = r0.A01();
        int A012 = r0.A01();
        return A01 < 214748364 ? A012 * 10 : A012;
    }

    public int A02(Object obj) {
        return this.A00.A02(obj);
    }

    public Parcelable A03() {
        return this.A00.A03();
    }

    public CharSequence A04(int i2) {
        AnonymousClass012 r1 = this.A00;
        if (r1.A01() > 0) {
            return r1.A04(i2 % r1.A01());
        }
        Log.i("infinitepageadapter/getpagetitle/count is zero");
        return null;
    }

    public Object A05(ViewGroup viewGroup, int i2) {
        AnonymousClass012 r1 = this.A00;
        if (r1.A01() > 0) {
            return r1.A05(viewGroup, i2 % r1.A01());
        }
        Log.i("infinitepageadapter/instantiateitem/count is zero");
        return null;
    }

    public void A06() {
        this.A00.A06();
    }

    public void A07(DataSetObserver dataSetObserver) {
        this.A00.A07(dataSetObserver);
    }

    public void A08(DataSetObserver dataSetObserver) {
        this.A00.A08(dataSetObserver);
    }

    public void A09(Parcelable parcelable, ClassLoader classLoader) {
        this.A00.A09(parcelable, classLoader);
    }

    public void A0A(ViewGroup viewGroup) {
        this.A00.A0A(viewGroup);
    }

    public void A0B(ViewGroup viewGroup) {
        this.A00.A0B(viewGroup);
    }

    public void A0C(ViewGroup viewGroup, Object obj, int i2) {
        this.A00.A0C(viewGroup, obj, i2);
    }

    public void A0D(ViewGroup viewGroup, Object obj, int i2) {
        AnonymousClass012 r1 = this.A00;
        if (r1.A01() <= 0) {
            Log.i("infinitepageadapter/destroyitem/count is zero");
        } else {
            r1.A0D(viewGroup, obj, i2 % r1.A01());
        }
    }

    public boolean A0E(View view, Object obj) {
        return this.A00.A0E(view, obj);
    }
}
