package X;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;

/* renamed from: X.07j  reason: invalid class name and case insensitive filesystem */
public class C015307j {
    public static Class A00;
    public static final Rect A01 = new Rect();
    public static final int[] A02 = {16842912};
    public static final int[] A03 = new int[0];

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                A00 = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    public static PorterDuff.Mode A00(PorterDuff.Mode mode, int i2) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static Rect A01(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        Class cls = A00;
        if (cls != null) {
            try {
                if (drawable instanceof C019208y) {
                    drawable = ((C019108x) ((C019208y) drawable)).A02;
                }
                Object invoke = drawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawable, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : cls.getFields()) {
                        String name = field.getName();
                        char c2 = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c2 == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c2 == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c2 == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return A01;
    }

    public static void A02(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            drawable.setState((state == null || state.length == 0) ? A02 : A03);
            drawable.setState(state);
        }
    }

    public static boolean A03(Drawable drawable) {
        Drawable drawable2;
        if (Build.VERSION.SDK_INT >= 17 || !(drawable instanceof LayerDrawable)) {
            if (drawable instanceof DrawableContainer) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                    return true;
                }
                Drawable[] children = ((DrawableContainer.DrawableContainerState) constantState).getChildren();
                int length = children.length;
                int i2 = 0;
                while (i2 < length) {
                    if (A03(children[i2])) {
                        i2++;
                    }
                }
                return true;
            }
            if (drawable instanceof C019208y) {
                drawable2 = ((C019108x) ((C019208y) drawable)).A02;
            } else if (drawable instanceof C018408p) {
                drawable2 = ((C018408p) drawable).A00;
            } else if (!(drawable instanceof ScaleDrawable)) {
                return true;
            } else {
                drawable2 = ((ScaleDrawable) drawable).getDrawable();
            }
            return A03(drawable2);
        }
        return false;
    }
}
