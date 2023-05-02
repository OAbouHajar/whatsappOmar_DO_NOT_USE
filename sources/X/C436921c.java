package X;

import android.location.LocationListener;
import java.lang.ref.WeakReference;

/* renamed from: X.21c  reason: invalid class name and case insensitive filesystem */
public class C436921c implements C437021d {
    public final float A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final WeakReference A04;

    public C436921c(LocationListener locationListener, float f2, int i2, long j2, long j3) {
        this.A04 = new WeakReference(locationListener);
        this.A03 = j2;
        this.A02 = j3;
        this.A00 = f2;
        this.A01 = i2;
    }
}
