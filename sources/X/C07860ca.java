package X;

import android.os.IBinder;

/* renamed from: X.0ca  reason: invalid class name and case insensitive filesystem */
public class C07860ca implements C12000jg {
    public final IBinder A00;

    public C07860ca(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C07860ca) && ((C07860ca) obj).A00.equals(this.A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
