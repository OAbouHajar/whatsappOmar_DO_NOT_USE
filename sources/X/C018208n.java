package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.08n  reason: invalid class name and case insensitive filesystem */
public final class C018208n {
    public static Method A00;
    public static Method A01;
    public static boolean A02;
    public static boolean A03;

    public static int A00(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return AnonymousClass0Wo.A00(drawable);
        }
        return 0;
    }

    public static int A01(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return C05550Sa.A00(drawable);
        }
        if (i2 >= 17) {
            if (!A02) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    A00 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
                }
                A02 = true;
            }
            Method method = A00;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e3) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
                    A00 = null;
                }
            }
        }
        return 0;
    }

    public static ColorFilter A02(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnonymousClass0XI.A00(drawable);
        }
        return null;
    }

    public static Drawable A03(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            boolean z2 = drawable instanceof AnonymousClass07X;
            if (i2 >= 21) {
                if (!z2) {
                    return new AnonymousClass0EF(drawable);
                }
            } else if (!z2) {
                return new C019108x(drawable);
            }
        }
        return drawable;
    }

    public static void A04(ColorStateList colorStateList, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass0XI.A01(colorStateList, drawable);
        } else if (drawable instanceof AnonymousClass07X) {
            ((AnonymousClass07X) drawable).setTintList(colorStateList);
        }
    }

    public static void A05(Resources.Theme theme, Resources resources, Drawable drawable, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass0XI.A02(theme, resources, drawable, attributeSet, xmlPullParser);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    public static void A06(Resources.Theme theme, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass0XI.A03(theme, drawable);
        }
    }

    public static void A07(PorterDuff.Mode mode, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass0XI.A04(mode, drawable);
        } else if (drawable instanceof AnonymousClass07X) {
            ((AnonymousClass07X) drawable).setTintMode(mode);
        }
    }

    public static void A08(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable drawable2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23 || i2 < 21) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            drawable2 = AnonymousClass0Wo.A02((InsetDrawable) drawable);
        } else if (drawable instanceof C019208y) {
            drawable2 = ((C019108x) ((C019208y) drawable)).A02;
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                Drawable A012 = AnonymousClass0Wo.A01(drawableContainerState, i3);
                if (A012 != null) {
                    A08(A012);
                }
            }
            return;
        } else {
            return;
        }
        A08(drawable2);
    }

    public static void A09(Drawable drawable, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass0XI.A05(drawable, f2, f3);
        }
    }

    public static void A0A(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass0XI.A06(drawable, i2);
        } else if (drawable instanceof AnonymousClass07X) {
            ((AnonymousClass07X) drawable).setTint(i2);
        }
    }

    public static void A0B(Drawable drawable, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass0XI.A07(drawable, i2, i3, i4, i5);
        }
    }

    public static void A0C(Drawable drawable, boolean z2) {
        if (Build.VERSION.SDK_INT >= 19) {
            AnonymousClass0Wo.A03(drawable, z2);
        }
    }

    public static boolean A0D(int i2, Drawable drawable) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            return C05550Sa.A01(i2, drawable);
        }
        if (i3 >= 17) {
            if (!A03) {
                Class<Drawable> cls = Drawable.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    A01 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
                }
                A03 = true;
            }
            Method method = A01;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i2)});
                    return true;
                } catch (Exception e3) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                    A01 = null;
                }
            }
        }
        return false;
    }

    public static boolean A0E(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnonymousClass0XI.A08(drawable);
        }
        return false;
    }

    public static boolean A0F(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return AnonymousClass0Wo.A04(drawable);
        }
        return false;
    }
}
