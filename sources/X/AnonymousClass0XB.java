package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: X.0XB  reason: invalid class name */
public final class AnonymousClass0XB {
    public static Method A00;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                A00 = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    public static float A00(Context context, ViewConfiguration viewConfiguration) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = A00) != null) {
            try {
                return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(AnonymousClass000.A0M(context));
        }
        return 0.0f;
    }

    public static float A01(Context context, ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 26 ? C05650Sk.A00(viewConfiguration) : A00(context, viewConfiguration);
    }

    public static float A02(Context context, ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 26 ? C05650Sk.A01(viewConfiguration) : A00(context, viewConfiguration);
    }

    public static int A03(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? C05660Sl.A00(viewConfiguration) : viewConfiguration.getScaledTouchSlop() >> 1;
    }

    public static boolean A04(Context context, ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C05660Sl.A01(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
