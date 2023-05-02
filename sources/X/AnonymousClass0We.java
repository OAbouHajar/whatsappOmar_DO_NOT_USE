package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0We  reason: invalid class name */
public class AnonymousClass0We {
    public static boolean A00 = true;
    public static Method A01;
    public static boolean A02;

    public static int A00(ViewGroup viewGroup, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i2);
        }
        if (!A02) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class[] clsArr = new Class[2];
                Class cls2 = Integer.TYPE;
                clsArr[0] = cls2;
                Method A0t = AnonymousClass000.A0t(cls, cls2, "getChildDrawingOrder", clsArr, 1);
                A01 = A0t;
                A0t.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            A02 = true;
        }
        Method method = A01;
        if (method != null) {
            try {
                Object[] objArr = new Object[2];
                AnonymousClass000.A1M(objArr, viewGroup.getChildCount(), 0);
                AnonymousClass000.A1M(objArr, i2, 1);
                return AnonymousClass000.A0D(method.invoke(viewGroup, objArr));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i2;
    }

    public static C13080lR A01(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C07850cZ(viewGroup);
        }
        ViewGroup viewGroup2 = viewGroup;
        while (viewGroup2 != null) {
            while (viewGroup2.getId() != 16908290) {
                if (viewGroup2.getParent() instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) viewGroup2.getParent();
                }
            }
            int childCount = viewGroup2.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup2.getChildAt(i2);
                if (childAt instanceof AnonymousClass0Br) {
                    return ((AnonymousClass0Br) childAt).A02;
                }
            }
            return new C07840cY(viewGroup2.getContext(), viewGroup, viewGroup2);
        }
        return null;
    }

    public static void A02(ViewGroup viewGroup, boolean z2) {
        if (A00) {
            try {
                viewGroup.suppressLayout(z2);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b9, code lost:
        if (r3 == false) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.view.ViewGroup r8, boolean r9) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x000a
            r8.suppressLayout(r9)
        L_0x0009:
            return
        L_0x000a:
            r0 = 18
            if (r1 < r0) goto L_0x0012
            A02(r8, r9)
            return
        L_0x0012:
            android.animation.LayoutTransition r0 = X.C04040Kw.A00
            r5 = 1
            r3 = 0
            r4 = 0
            if (r0 != 0) goto L_0x003a
            X.09y r1 = new X.09y
            r1.<init>()
            X.C04040Kw.A00 = r1
            r0 = 2
            r1.setAnimator(r0, r4)
            android.animation.LayoutTransition r0 = X.C04040Kw.A00
            r0.setAnimator(r3, r4)
            android.animation.LayoutTransition r0 = X.C04040Kw.A00
            r0.setAnimator(r5, r4)
            android.animation.LayoutTransition r1 = X.C04040Kw.A00
            r0 = 3
            r1.setAnimator(r0, r4)
            android.animation.LayoutTransition r1 = X.C04040Kw.A00
            r0 = 4
            r1.setAnimator(r0, r4)
        L_0x003a:
            if (r9 == 0) goto L_0x0085
            android.animation.LayoutTransition r7 = r8.getLayoutTransition()
            if (r7 == 0) goto L_0x0082
            boolean r0 = r7.isRunning()
            if (r0 == 0) goto L_0x0078
            boolean r0 = X.C04040Kw.A03
            java.lang.String r6 = "Failed to access cancel method by reflection"
            java.lang.String r4 = "ViewGroupUtilsApi14"
            if (r0 != 0) goto L_0x0065
            java.lang.Class<android.animation.LayoutTransition> r2 = android.animation.LayoutTransition.class
            java.lang.String r1 = "cancel"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0060 }
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0060 }
            X.C04040Kw.A02 = r0     // Catch:{ NoSuchMethodException -> 0x0060 }
            r0.setAccessible(r5)     // Catch:{ NoSuchMethodException -> 0x0060 }
            goto L_0x0063
        L_0x0060:
            android.util.Log.i(r4, r6)
        L_0x0063:
            X.C04040Kw.A03 = r5
        L_0x0065:
            java.lang.reflect.Method r1 = X.C04040Kw.A02
            if (r1 == 0) goto L_0x0078
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x006f, InvocationTargetException -> 0x0073 }
            r1.invoke(r7, r0)     // Catch:{ IllegalAccessException -> 0x006f, InvocationTargetException -> 0x0073 }
            goto L_0x0078
        L_0x006f:
            android.util.Log.i(r4, r6)
            goto L_0x0078
        L_0x0073:
            java.lang.String r0 = "Failed to invoke cancel method by reflection"
            android.util.Log.i(r4, r0)
        L_0x0078:
            android.animation.LayoutTransition r0 = X.C04040Kw.A00
            if (r7 == r0) goto L_0x0082
            r0 = 2131366762(0x7f0a136a, float:1.8353427E38)
            r8.setTag(r0, r7)
        L_0x0082:
            android.animation.LayoutTransition r0 = X.C04040Kw.A00
            goto L_0x00cc
        L_0x0085:
            r8.setLayoutTransition(r4)
            boolean r0 = X.C04040Kw.A04
            java.lang.String r2 = "ViewGroupUtilsApi14"
            if (r0 != 0) goto L_0x00a3
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            java.lang.String r0 = "mLayoutSuppressed"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x009c }
            X.C04040Kw.A01 = r0     // Catch:{ NoSuchFieldException -> 0x009c }
            r0.setAccessible(r5)     // Catch:{ NoSuchFieldException -> 0x009c }
            goto L_0x00a1
        L_0x009c:
            java.lang.String r0 = "Failed to access mLayoutSuppressed field by reflection"
            android.util.Log.i(r2, r0)
        L_0x00a1:
            X.C04040Kw.A04 = r5
        L_0x00a3:
            java.lang.reflect.Field r0 = X.C04040Kw.A01
            if (r0 == 0) goto L_0x00be
            boolean r1 = r0.getBoolean(r8)     // Catch:{ IllegalAccessException -> 0x00b4 }
            if (r1 == 0) goto L_0x00be
            java.lang.reflect.Field r0 = X.C04040Kw.A01     // Catch:{ IllegalAccessException -> 0x00b3 }
            r0.setBoolean(r8, r3)     // Catch:{ IllegalAccessException -> 0x00b3 }
            goto L_0x00bb
        L_0x00b3:
            r3 = r1
        L_0x00b4:
            java.lang.String r0 = "Failed to get mLayoutSuppressed field by reflection"
            android.util.Log.i(r2, r0)
            if (r3 == 0) goto L_0x00be
        L_0x00bb:
            r8.requestLayout()
        L_0x00be:
            r1 = 2131366762(0x7f0a136a, float:1.8353427E38)
            java.lang.Object r0 = r8.getTag(r1)
            android.animation.LayoutTransition r0 = (android.animation.LayoutTransition) r0
            if (r0 == 0) goto L_0x0009
            r8.setTag(r1, r4)
        L_0x00cc:
            r8.setLayoutTransition(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0We.A03(android.view.ViewGroup, boolean):void");
    }
}
