package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: X.4eI  reason: invalid class name and case insensitive filesystem */
public class C90514eI {
    public static Bundle A00(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            return bundle.deepCopy();
        }
        Parcel obtain = Parcel.obtain();
        try {
            int dataPosition = obtain.dataPosition();
            obtain.writeBundle(bundle);
            obtain.setDataPosition(dataPosition);
            return obtain.readBundle(C90514eI.class.getClassLoader());
        } finally {
            obtain.recycle();
        }
    }

    public static void A01(Bundle bundle, Class cls, String str) {
        A02(cls, bundle.get(str), str);
    }

    public static void A02(Class cls, Object obj, String str) {
        Class<?> cls2;
        if (obj != null && (cls2 = obj.getClass()) != cls) {
            StringBuilder A0r = AnonymousClass000.A0r("Expecting: ");
            A0r.append(cls);
            A0r.append(" under key ");
            A0r.append(str);
            A0r.append(" but was: ");
            throw AnonymousClass000.A0T(AnonymousClass000.A0f(cls2, A0r));
        }
    }

    public static void A03(String str, Bundle bundle) {
        Class<byte[]> cls = byte[].class;
        Object obj = bundle.get(str);
        if (obj != null) {
            A02(cls, obj, str);
            return;
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(str, AnonymousClass000.A0r("Missing required key: ")));
    }
}
