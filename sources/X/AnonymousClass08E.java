package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: X.08E  reason: invalid class name */
public final class AnonymousClass08E {
    public static final Object A00 = new Object();
    public static final ThreadLocal A01 = new ThreadLocal();
    public static final WeakHashMap A02 = new WeakHashMap(0);

    public static ColorStateList A00(Context context, int i2) {
        WeakHashMap weakHashMap;
        ColorStateList colorStateList;
        AnonymousClass08F r2;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i2);
        }
        Object obj = A00;
        synchronized (obj) {
            weakHashMap = A02;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (r2 = (AnonymousClass08F) sparseArray.get(i2)) == null)) {
                if (r2.A01.equals(context.getResources().getConfiguration())) {
                    colorStateList = r2.A00;
                } else {
                    sparseArray.remove(i2);
                }
            }
            colorStateList = null;
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        Resources resources = context.getResources();
        ThreadLocal threadLocal = A01;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z2 = true;
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            z2 = false;
        }
        ColorStateList colorStateList2 = null;
        if (!z2) {
            Resources resources2 = context.getResources();
            try {
                colorStateList2 = AnonymousClass08G.A01(context.getTheme(), resources2, resources2.getXml(i2));
            } catch (Exception e2) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList2 == null) {
            return AnonymousClass00T.A03(context, i2);
        }
        synchronized (obj) {
            SparseArray sparseArray2 = (SparseArray) weakHashMap.get(context);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(context, sparseArray2);
            }
            sparseArray2.append(i2, new AnonymousClass08F(colorStateList2, context.getResources().getConfiguration()));
        }
        return colorStateList2;
    }

    public static Drawable A01(Context context, int i2) {
        return AnonymousClass06L.A02().A05(context, i2);
    }
}
