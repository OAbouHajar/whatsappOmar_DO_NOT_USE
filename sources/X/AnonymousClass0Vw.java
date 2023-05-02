package X;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.0Vw  reason: invalid class name */
public final class AnonymousClass0Vw {
    public static Field A00;
    public static Method A01;
    public static boolean A02;
    public static boolean A03;

    public static void A00(View view, PopupWindow popupWindow, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 19) {
            C04290Ly.A00(view, popupWindow, i2, i3, i4);
            return;
        }
        if ((C05570Sc.A00(i4, C004601z.A06(view)) & 7) == 5) {
            i2 -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i2, i3);
    }

    public static void A01(PopupWindow popupWindow, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            C05710Sr.A00(popupWindow, i2);
            return;
        }
        if (!A03) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method A0t = AnonymousClass000.A0t(cls, Integer.TYPE, "setWindowLayoutType", new Class[1], 0);
                A01 = A0t;
                A0t.setAccessible(true);
            } catch (Exception unused) {
            }
            A03 = true;
        }
        Method method = A01;
        if (method != null) {
            try {
                Object[] objArr = new Object[1];
                AnonymousClass000.A1M(objArr, i2, 0);
                method.invoke(popupWindow, objArr);
            } catch (Exception unused2) {
            }
        }
    }

    public static void A02(PopupWindow popupWindow, boolean z2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            C05710Sr.A01(popupWindow, z2);
        } else if (i2 >= 21) {
            if (!A02) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    A00 = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
                }
                A02 = true;
            }
            Field field = A00;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z2));
                } catch (IllegalAccessException e3) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
                }
            }
        }
    }
}
