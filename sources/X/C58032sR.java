package X;

import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* renamed from: X.2sR  reason: invalid class name and case insensitive filesystem */
public final class C58032sR extends C31371e2 {
    public final Object A00;

    public C58032sR(Object obj) {
        this.A00 = obj;
    }

    public static Object A01(IObjectWrapper iObjectWrapper) {
        String str;
        if (iObjectWrapper instanceof C58032sR) {
            return ((C58032sR) iObjectWrapper).A00;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field field = null;
        int i2 = 0;
        for (Field field2 : asBinder.getClass().getDeclaredFields()) {
            if (!field2.isSynthetic()) {
                i2++;
                field = field2;
            }
        }
        if (i2 == 1) {
            C13710nw.A01(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                } catch (IllegalAccessException e3) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
                }
            } else {
                str = "IObjectWrapper declared field not private!";
            }
        } else {
            str = C13680ns.A0i("Unexpected number of IObjectWrapper declared fields: ", C13690nt.A0g(64), r5);
        }
        throw AnonymousClass000.A0T(str);
    }
}
