package X;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: X.1e2  reason: invalid class name and case insensitive filesystem */
public abstract class C31371e2 extends C31381e3 implements IObjectWrapper {
    public C31371e2() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static IObjectWrapper A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof IObjectWrapper ? (IObjectWrapper) queryLocalInterface : new C66433Zi(iBinder);
    }
}
