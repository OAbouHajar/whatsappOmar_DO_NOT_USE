package X;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: X.0Wb  reason: invalid class name and case insensitive filesystem */
public class C06470Wb {
    public static Method A00;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            Class<View> cls = View.class;
            try {
                Class[] clsArr = new Class[2];
                Class<Rect> cls2 = Rect.class;
                clsArr[0] = cls2;
                Method A0t = AnonymousClass000.A0t(cls, cls2, "computeFitSystemWindows", clsArr, 1);
                A00 = A0t;
                if (!A0t.isAccessible()) {
                    A00.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    public static void A00(Rect rect, Rect rect2, View view) {
        Method method = A00;
        if (method != null) {
            try {
                Object[] objArr = new Object[2];
                AnonymousClass000.A1E(rect, rect2, objArr);
                method.invoke(view, objArr);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
    }
}
