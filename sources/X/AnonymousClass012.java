package X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.012  reason: invalid class name */
public abstract class AnonymousClass012 {
    public DataSetObserver A00;
    public final DataSetObservable A01 = new DataSetObservable();

    public float A00(int i2) {
        return 1.0f;
    }

    public abstract int A01();

    public int A02(Object obj) {
        return -1;
    }

    public Parcelable A03() {
        return null;
    }

    public CharSequence A04(int i2) {
        return null;
    }

    public abstract Object A05(ViewGroup viewGroup, int i2);

    public void A06() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.A00;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.A01.notifyChanged();
    }

    public void A07(DataSetObserver dataSetObserver) {
        this.A01.registerObserver(dataSetObserver);
    }

    public void A08(DataSetObserver dataSetObserver) {
        this.A01.unregisterObserver(dataSetObserver);
    }

    public void A09(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void A0A(ViewGroup viewGroup) {
    }

    public void A0B(ViewGroup viewGroup) {
    }

    public void A0C(ViewGroup viewGroup, Object obj, int i2) {
    }

    public abstract void A0D(ViewGroup viewGroup, Object obj, int i2);

    public abstract boolean A0E(View view, Object obj);
}
