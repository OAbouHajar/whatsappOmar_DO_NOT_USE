package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0cq  reason: invalid class name and case insensitive filesystem */
public final class C08000cq implements C13440m2 {
    public static final C08000cq A00 = new C08000cq();

    public static final Point A00(Display display) {
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            AnonymousClass0MF.A00(point, display);
            return point;
        }
        try {
            Method A0t = AnonymousClass000.A0t(Display.class, Point.class, "getRealSize", new Class[1], 0);
            A0t.setAccessible(true);
            A0t.invoke(display, new Object[]{point});
            return point;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            Log.w("WindowMetricsCalculatorCompat", e2);
            return point;
        }
    }

    public final Rect A01(Activity activity) {
        int i2;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        C18450wi.A0B(defaultDisplay);
        Point A002 = A00(defaultDisplay);
        Rect A0J = AnonymousClass000.A0J();
        int i3 = A002.x;
        if (i3 == 0 || (i2 = A002.y) == 0) {
            defaultDisplay.getRectSize(A0J);
            return A0J;
        }
        A0J.right = i3;
        A0J.bottom = i2;
        return A0J;
    }

    public final Rect A02(Activity activity) {
        Rect A0J = AnonymousClass000.A0J();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(A0J);
        if (!AnonymousClass0MD.A00(activity)) {
            Point A002 = A00(defaultDisplay);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = A0J.bottom + dimensionPixelSize;
            if (i2 == A002.y) {
                A0J.bottom = i2;
            } else {
                int i3 = A0J.right + dimensionPixelSize;
                if (i3 == A002.x) {
                    A0J.right = i3;
                    return A0J;
                }
            }
        }
        return A0J;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0115 A[Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Rect A03(android.app.Activity r11) {
        /*
            r10 = this;
            r5 = 0
            android.graphics.Rect r2 = X.AnonymousClass000.A0J()
            android.content.res.Resources r0 = r11.getResources()
            android.content.res.Configuration r3 = r0.getConfiguration()
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            java.lang.String r0 = "windowConfiguration"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            java.lang.Object r6 = r1.get(r3)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            boolean r0 = X.AnonymousClass0MD.A00(r11)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            java.lang.String r4 = "null cannot be cast to non-null type android.graphics.Rect"
            if (r0 == 0) goto L_0x003f
            java.lang.Class r3 = r6.getClass()     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            java.lang.String r1 = "getBounds"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r1, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            java.lang.Object r0 = r1.invoke(r6, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            if (r0 == 0) goto L_0x005e
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            r2.set(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            goto L_0x0074
        L_0x003f:
            java.lang.Class r3 = r6.getClass()     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            java.lang.String r1 = "getAppBounds"
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r1, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            java.lang.Object r0 = r1.invoke(r6, r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            if (r0 == 0) goto L_0x0059
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            r2.set(r0)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            goto L_0x0074
        L_0x0059:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r4)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
            goto L_0x0062
        L_0x005e:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r4)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
        L_0x0062:
            throw r0     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0063 }
        L_0x0063:
            r1 = move-exception
            java.lang.String r0 = "WindowMetricsCalculatorCompat"
            android.util.Log.w(r0, r1)
            android.view.WindowManager r0 = r11.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getRectSize(r2)
        L_0x0074:
            android.view.WindowManager r0 = r11.getWindowManager()
            android.view.Display r9 = r0.getDefaultDisplay()
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            X.C18450wi.A0B(r9)
            X.AnonymousClass0MF.A00(r4, r9)
            boolean r0 = X.AnonymousClass0MD.A00(r11)
            if (r0 != 0) goto L_0x00aa
            android.content.res.Resources r6 = r11.getResources()
            java.lang.String r3 = "navigation_bar_height"
            java.lang.String r1 = "dimen"
            java.lang.String r0 = "android"
            int r0 = r6.getIdentifier(r3, r1, r0)
            if (r0 <= 0) goto L_0x00d2
            int r3 = r6.getDimensionPixelSize(r0)
        L_0x00a1:
            int r1 = r2.bottom
            int r1 = r1 + r3
            int r0 = r4.y
            if (r1 != r0) goto L_0x00c1
            r2.bottom = r1
        L_0x00aa:
            int r1 = r2.width()
            int r0 = r4.x
            if (r1 < r0) goto L_0x00ba
            int r1 = r2.height()
            int r0 = r4.y
            if (r1 >= r0) goto L_0x015d
        L_0x00ba:
            boolean r0 = X.AnonymousClass0MD.A00(r11)
            if (r0 != 0) goto L_0x015d
            goto L_0x00d4
        L_0x00c1:
            int r1 = r2.right
            int r1 = r1 + r3
            int r0 = r4.x
            if (r1 != r0) goto L_0x00cb
            r2.right = r1
            goto L_0x00aa
        L_0x00cb:
            int r0 = r2.left
            if (r0 != r3) goto L_0x00aa
            r2.left = r5
            goto L_0x00aa
        L_0x00d2:
            r3 = 0
            goto L_0x00a1
        L_0x00d4:
            java.lang.String r0 = "android.view.DisplayInfo"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            r8 = 1
            r1.setAccessible(r8)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            java.lang.Object r7 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            java.lang.Class r6 = r9.getClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            java.lang.String r1 = "getDisplayInfo"
            java.lang.Class[] r0 = new java.lang.Class[r8]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            java.lang.Class r3 = r7.getClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            java.lang.reflect.Method r1 = X.AnonymousClass000.A0t(r6, r3, r1, r0, r5)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            r1.setAccessible(r8)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            r0[r5] = r7     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            r1.invoke(r9, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            java.lang.String r0 = "displayCutout"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            r0.setAccessible(r8)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            java.lang.Object r3 = r0.get(r7)     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            boolean r0 = r3 instanceof android.view.DisplayCutout     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            if (r0 == 0) goto L_0x011e
            android.view.DisplayCutout r3 = (android.view.DisplayCutout) r3     // Catch:{ ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x0118 }
            goto L_0x011f
        L_0x0118:
            r1 = move-exception
            java.lang.String r0 = "WindowMetricsCalculatorCompat"
            android.util.Log.w(r0, r1)
        L_0x011e:
            r3 = 0
        L_0x011f:
            if (r3 == 0) goto L_0x015d
            int r1 = r2.left
            int r0 = X.AnonymousClass0WZ.A01(r3)
            if (r1 != r0) goto L_0x012b
            r2.left = r5
        L_0x012b:
            int r1 = r4.x
            int r0 = r2.right
            int r1 = r1 - r0
            int r0 = X.AnonymousClass0WZ.A02(r3)
            if (r1 != r0) goto L_0x013f
            int r1 = r2.right
            int r0 = X.AnonymousClass0WZ.A02(r3)
            int r1 = r1 + r0
            r2.right = r1
        L_0x013f:
            int r1 = r2.top
            int r0 = X.AnonymousClass0WZ.A03(r3)
            if (r1 != r0) goto L_0x0149
            r2.top = r5
        L_0x0149:
            int r1 = r4.y
            int r0 = r2.bottom
            int r1 = r1 - r0
            int r0 = X.AnonymousClass0WZ.A00(r3)
            if (r1 != r0) goto L_0x015d
            int r1 = r2.bottom
            int r0 = X.AnonymousClass0WZ.A00(r3)
            int r1 = r1 + r0
            r2.bottom = r1
        L_0x015d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08000cq.A03(android.app.Activity):android.graphics.Rect");
    }

    public final Rect A04(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            if (invoke != null) {
                return new Rect((Rect) invoke);
            }
            throw AnonymousClass000.A0W("null cannot be cast to non-null type android.graphics.Rect");
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
            Log.w("WindowMetricsCalculatorCompat", e2);
            return A03(activity);
        }
    }

    public C05380Qs A05(Activity activity) {
        int i2 = Build.VERSION.SDK_INT;
        return new C05380Qs(i2 >= 30 ? AnonymousClass0ME.A00(activity) : i2 >= 29 ? A04(activity) : i2 >= 28 ? A03(activity) : i2 >= 24 ? A02(activity) : A01(activity));
    }
}
