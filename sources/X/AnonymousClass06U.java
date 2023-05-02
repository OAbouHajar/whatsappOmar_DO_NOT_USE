package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: X.06U  reason: invalid class name */
public final class AnonymousClass06U {
    public static Field A00;
    public static boolean A01;

    public static Drawable A00(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C04250Lu.A00(compoundButton);
        }
        if (!A01) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                A00 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e2);
            }
            A01 = true;
        }
        Field field = A00;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e3) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e3);
                A00 = null;
            }
        }
        return null;
    }

    public static void A01(ColorStateList colorStateList, CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            C05690Sp.A00(colorStateList, compoundButton);
        } else if (compoundButton instanceof AnonymousClass02B) {
            ((AnonymousClass02B) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    public static void A02(PorterDuff.Mode mode, CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            C05690Sp.A01(mode, compoundButton);
        } else if (compoundButton instanceof AnonymousClass02B) {
            ((AnonymousClass02B) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
