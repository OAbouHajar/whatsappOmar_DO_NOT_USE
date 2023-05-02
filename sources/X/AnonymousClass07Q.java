package X;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: X.07Q  reason: invalid class name */
public final class AnonymousClass07Q {
    public static Field A00;
    public static boolean A01;

    public static void A00(LayoutInflater.Factory2 factory2, LayoutInflater layoutInflater) {
        if (!A01) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                A00 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                StringBuilder sb = new StringBuilder("forceSetFactory2 Could not find field 'mFactory2' on class ");
                sb.append(LayoutInflater.class.getName());
                sb.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", sb.toString(), e2);
            }
            A01 = true;
        }
        Field field = A00;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e3) {
                StringBuilder sb2 = new StringBuilder("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                sb2.append(layoutInflater);
                sb2.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", sb2.toString(), e3);
            }
        }
    }

    public static void A01(LayoutInflater.Factory2 factory2, LayoutInflater layoutInflater) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                A00((LayoutInflater.Factory2) factory, layoutInflater);
            } else {
                A00(factory2, layoutInflater);
            }
        }
    }
}
