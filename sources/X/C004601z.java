package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.facebook.redex.IDxVPropertyShape2S0000000_I0;
import com.obwhatsapp.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.01z  reason: invalid class name and case insensitive filesystem */
public class C004601z {
    public static ThreadLocal A00;
    public static Field A01;
    public static Method A02;
    public static Method A03;
    public static WeakHashMap A04;
    public static WeakHashMap A05;
    public static boolean A06;
    public static boolean A07;
    public static final AnonymousClass016 A08 = new C013506n();
    public static final C013606o A09 = new C013606o();
    public static final AtomicInteger A0A = new AtomicInteger(1);

    public static float A00(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnonymousClass0XO.A00(view);
        }
        return 0.0f;
    }

    public static float A01(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnonymousClass0XO.A01(view);
        }
        return 0.0f;
    }

    public static float A02(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnonymousClass0XO.A02(view);
        }
        return 0.0f;
    }

    public static int A03() {
        AtomicInteger atomicInteger;
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT >= 17) {
            return C013706p.A00();
        }
        do {
            atomicInteger = A0A;
            i2 = atomicInteger.get();
            i3 = i2 + 1;
            if (i3 > 16777215) {
                i3 = 1;
            }
        } while (!atomicInteger.compareAndSet(i2, i3));
        return i2;
    }

    public static int A04(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return AnonymousClass099.A00(view);
        }
        return 0;
    }

    public static int A05(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C05610Sg.A00(view);
        }
        return 0;
    }

    public static int A06(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C013706p.A01(view);
        }
        return 0;
    }

    public static int A07(View view) {
        return Build.VERSION.SDK_INT >= 17 ? C013706p.A02(view) : view.getPaddingRight();
    }

    public static int A08(View view) {
        return Build.VERSION.SDK_INT >= 17 ? C013706p.A03(view) : view.getPaddingLeft();
    }

    public static ColorStateList A09(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnonymousClass0XO.A03(view);
        }
        if (view instanceof AnonymousClass015) {
            return ((AnonymousClass015) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static PorterDuff.Mode A0A(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnonymousClass0XO.A04(view);
        }
        if (view instanceof AnonymousClass015) {
            return ((AnonymousClass015) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static Rect A0B(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return C05590Se.A00(view);
        }
        return null;
    }

    public static Display A0C(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C013706p.A04(view);
        }
        if (A0t(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static View.AccessibilityDelegate A0D(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C05620Sh.A00(view);
        }
        if (A06) {
            return null;
        }
        if (A01 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                A01 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                A06 = true;
                return null;
            }
        }
        Object obj = A01.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static View A0E(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) AnonymousClass0X7.A01(view, i2);
        }
        View findViewById = view.findViewById(i2);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static AnonymousClass05M A0F(View view) {
        View.AccessibilityDelegate A0D = A0D(view);
        if (A0D == null) {
            return null;
        }
        return A0D instanceof AnonymousClass088 ? ((AnonymousClass088) A0D).A00 : new AnonymousClass05M(A0D);
    }

    public static C06130Uj A0G(View view, C06130Uj r4) {
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sb = new StringBuilder("performReceiveContent: ");
            sb.append(r4);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
            Log.d("ViewCompat", sb.toString());
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C05640Sj.A00(view, r4);
        }
        C12390kJ r0 = (C12390kJ) view.getTag(R.id.tag_on_receive_content_listener);
        if (r0 != null && (r4 = r0.AVk(view, r4)) == null) {
            return null;
        }
        return (view instanceof AnonymousClass016 ? (AnonymousClass016) view : A08).AVl(r4);
    }

    public static AnonymousClass0SH A0H(View view) {
        WeakHashMap weakHashMap = A05;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            A05 = weakHashMap;
        }
        AnonymousClass0SH r1 = (AnonymousClass0SH) weakHashMap.get(view);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass0SH r12 = new AnonymousClass0SH(view);
        A05.put(view, r12);
        return r12;
    }

    public static AnonymousClass030 A0I(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return C05600Sf.A00(view);
        }
        if (i2 >= 21) {
            return AnonymousClass0XO.A05(view);
        }
        return null;
    }

    public static AnonymousClass030 A0J(View view, AnonymousClass030 r3) {
        WindowInsets A072;
        if (Build.VERSION.SDK_INT >= 21 && (A072 = r3.A07()) != null) {
            WindowInsets A002 = AnonymousClass0VR.A00(view, A072);
            if (!A002.equals(A072)) {
                return AnonymousClass030.A01(view, A002);
            }
        }
        return r3;
    }

    public static AnonymousClass030 A0K(View view, AnonymousClass030 r3) {
        WindowInsets A072;
        if (Build.VERSION.SDK_INT >= 21 && (A072 = r3.A07()) != null) {
            WindowInsets A012 = AnonymousClass0VR.A01(view, A072);
            if (!A012.equals(A072)) {
                return AnonymousClass030.A01(view, A012);
            }
        }
        return r3;
    }

    public static String A0L(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnonymousClass0XO.A06(view);
        }
        WeakHashMap weakHashMap = A04;
        if (weakHashMap == null) {
            return null;
        }
        return (String) weakHashMap.get(view);
    }

    public static void A0M() {
        Class<View> cls = View.class;
        try {
            A03 = cls.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            A02 = cls.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e2) {
            Log.e("ViewCompat", "Couldn't find method", e2);
        }
        A07 = true;
    }

    public static void A0N(Context context, TypedArray typedArray, AttributeSet attributeSet, View view, int[] iArr, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C05620Sh.A01(context, typedArray, attributeSet, view, iArr, i2, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (X.AnonymousClass0XO.A04(r3) != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0O(android.content.res.ColorStateList r2, android.view.View r3) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0032
            X.AnonymousClass0XO.A07(r2, r3)
            if (r1 != r0) goto L_0x0031
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            android.content.res.ColorStateList r0 = X.AnonymousClass0XO.A03(r3)
            if (r0 != 0) goto L_0x001c
            android.graphics.PorterDuff$Mode r1 = X.AnonymousClass0XO.A04(r3)
            r0 = 0
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            if (r2 == 0) goto L_0x0031
            if (r0 == 0) goto L_0x0031
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L_0x002e
            int[] r0 = r3.getDrawableState()
            r2.setState(r0)
        L_0x002e:
            r3.setBackground(r2)
        L_0x0031:
            return
        L_0x0032:
            boolean r0 = r3 instanceof X.AnonymousClass015
            if (r0 == 0) goto L_0x0031
            X.015 r3 = (X.AnonymousClass015) r3
            r3.setSupportBackgroundTintList(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C004601z.A0O(android.content.res.ColorStateList, android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (X.AnonymousClass0XO.A04(r3) != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0P(android.graphics.PorterDuff.Mode r2, android.view.View r3) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0032
            X.AnonymousClass0XO.A08(r2, r3)
            if (r1 != r0) goto L_0x0031
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            android.content.res.ColorStateList r0 = X.AnonymousClass0XO.A03(r3)
            if (r0 != 0) goto L_0x001c
            android.graphics.PorterDuff$Mode r1 = X.AnonymousClass0XO.A04(r3)
            r0 = 0
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            if (r2 == 0) goto L_0x0031
            if (r0 == 0) goto L_0x0031
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L_0x002e
            int[] r0 = r3.getDrawableState()
            r2.setState(r0)
        L_0x002e:
            r3.setBackground(r2)
        L_0x0031:
            return
        L_0x0032:
            boolean r0 = r3 instanceof X.AnonymousClass015
            if (r0 == 0) goto L_0x0031
            X.015 r3 = (X.AnonymousClass015) r3
            r3.setSupportBackgroundTintMode(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C004601z.A0P(android.graphics.PorterDuff$Mode, android.view.View):void");
    }

    public static void A0Q(Rect rect, View view, AnonymousClass030 r4) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass0XO.A09(rect, view, r4);
        }
    }

    public static void A0R(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass0VS.A01(view);
            return;
        }
        if (!A07) {
            A0M();
        }
        Method method = A02;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception e2) {
                Log.d("ViewCompat", "Error calling dispatchFinishTemporaryDetach", e2);
            }
        } else {
            view.onFinishTemporaryDetach();
        }
    }

    public static void A0S(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass0VS.A02(view);
            return;
        }
        if (!A07) {
            A0M();
        }
        Method method = A03;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception e2) {
                Log.d("ViewCompat", "Error calling dispatchStartTemporaryDetach", e2);
            }
        } else {
            view.onStartTemporaryDetach();
        }
    }

    public static void A0T(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            AnonymousClass0VR.A02(view);
        } else {
            view.requestFitSystemWindows();
        }
    }

    public static void A0U(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            C05610Sg.A01(view, 8);
        }
    }

    public static void A0V(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass0XO.A0A(view);
        } else if (view instanceof AnonymousClass02T) {
            ((AnonymousClass02T) view).stopNestedScroll();
        }
    }

    public static void A0W(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void A0X(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass0XO.A0B(view, f2);
        }
    }

    public static void A0Y(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass0XO.A0C(view, f2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r5.getWindowVisibility() != 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0Z(android.view.View r5, int r6) {
        /*
            android.content.Context r1 = r5.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r3 = r1.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r3 = (android.view.accessibility.AccessibilityManager) r3
            boolean r0 = r3.isEnabled()
            if (r0 == 0) goto L_0x005e
            r4 = 1
            com.facebook.redex.IDxVPropertyShape2S0000000_I0 r0 = new com.facebook.redex.IDxVPropertyShape2S0000000_I0
            r0.<init>(r4)
            java.lang.Object r0 = r0.A01(r5)
            if (r0 == 0) goto L_0x002b
            boolean r0 = r5.isShown()
            if (r0 == 0) goto L_0x002b
            int r0 = r5.getWindowVisibility()
            r2 = 1
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            int r1 = A04(r5)
            r0 = 32
            if (r1 != 0) goto L_0x0092
            if (r2 != 0) goto L_0x0092
            if (r6 != r0) goto L_0x005f
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain()
            r5.onInitializeAccessibilityEvent(r2)
            r2.setEventType(r0)
            X.AnonymousClass099.A03(r2, r6)
            r2.setSource(r5)
            r5.onPopulateAccessibilityEvent(r2)
            java.util.List r1 = r2.getText()
            com.facebook.redex.IDxVPropertyShape2S0000000_I0 r0 = new com.facebook.redex.IDxVPropertyShape2S0000000_I0
            r0.<init>(r4)
            java.lang.Object r0 = r0.A01(r5)
            r1.add(r0)
            r3.sendAccessibilityEvent(r2)
        L_0x005e:
            return
        L_0x005f:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L_0x005e
            android.view.ViewParent r0 = r5.getParent()
            X.AnonymousClass099.A02(r5, r5, r0, r6)     // Catch:{ AbstractMethodError -> 0x006d }
            goto L_0x0091
        L_0x006d:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.view.ViewParent r0 = r5.getParent()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " does not fully implement ViewParent"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ViewCompat"
            android.util.Log.e(r0, r1, r2)
            return
        L_0x0091:
            return
        L_0x0092:
            android.view.accessibility.AccessibilityEvent r3 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r2 != 0) goto L_0x009a
            r0 = 2048(0x800, float:2.87E-42)
        L_0x009a:
            r3.setEventType(r0)
            X.AnonymousClass099.A03(r3, r6)
            if (r2 == 0) goto L_0x00d1
            java.util.List r1 = r3.getText()
            com.facebook.redex.IDxVPropertyShape2S0000000_I0 r0 = new com.facebook.redex.IDxVPropertyShape2S0000000_I0
            r0.<init>(r4)
            java.lang.Object r0 = r0.A01(r5)
            r1.add(r0)
            int r0 = r5.getImportantForAccessibility()
            if (r0 != 0) goto L_0x00bb
            r5.setImportantForAccessibility(r4)
        L_0x00bb:
            android.view.ViewParent r2 = r5.getParent()
        L_0x00bf:
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L_0x00d1
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            int r1 = r0.getImportantForAccessibility()
            r0 = 4
            if (r1 != r0) goto L_0x00d5
            r0 = 2
            r5.setImportantForAccessibility(r0)
        L_0x00d1:
            r5.sendAccessibilityEventUnchecked(r3)
            return
        L_0x00d5:
            android.view.ViewParent r2 = r2.getParent()
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C004601z.A0Z(android.view.View, int):void");
    }

    public static void A0a(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
        } else if (i3 >= 21) {
            ThreadLocal threadLocal = A00;
            if (threadLocal == null) {
                threadLocal = new ThreadLocal();
                A00 = threadLocal;
            }
            Rect rect = (Rect) threadLocal.get();
            if (rect == null) {
                rect = new Rect();
                A00.set(rect);
            }
            rect.setEmpty();
            boolean z2 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                rect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z2 = !rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            view.offsetLeftAndRight(i2);
            if (view.getVisibility() == 0) {
                A0W(view);
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof View) {
                    A0W((View) parent2);
                }
            }
            if (z2 && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(rect);
            }
        } else {
            view.offsetLeftAndRight(i2);
            if (view.getVisibility() == 0) {
                A0W(view);
                ViewParent parent3 = view.getParent();
                if (parent3 instanceof View) {
                    A0W((View) parent3);
                }
            }
        }
    }

    public static void A0b(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
        } else if (i3 >= 21) {
            ThreadLocal threadLocal = A00;
            if (threadLocal == null) {
                threadLocal = new ThreadLocal();
                A00 = threadLocal;
            }
            Rect rect = (Rect) threadLocal.get();
            if (rect == null) {
                rect = new Rect();
                A00.set(rect);
            }
            rect.setEmpty();
            boolean z2 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                rect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z2 = !rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            view.offsetTopAndBottom(i2);
            if (view.getVisibility() == 0) {
                A0W(view);
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof View) {
                    A0W((View) parent2);
                }
            }
            if (z2 && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(rect);
            }
        } else {
            view.offsetTopAndBottom(i2);
            if (view.getVisibility() == 0) {
                A0W(view);
                ViewParent parent3 = view.getParent();
                if (parent3 instanceof View) {
                    A0W((View) parent3);
                }
            }
        }
    }

    public static void A0c(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            AnonymousClass099.A01(view, i2);
        }
    }

    public static void A0d(View view, int i2) {
        if (Build.VERSION.SDK_INT < 19 && i2 == 4) {
            i2 = 2;
        }
        view.setImportantForAccessibility(i2);
    }

    public static void A0e(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            C013706p.A05(view, i2);
        }
    }

    public static void A0f(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 17) {
            C013706p.A06(view, i2);
        }
    }

    public static void A0g(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            C05600Sf.A01(view, i2, 3);
        }
    }

    public static void A0h(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            C013706p.A07(view, i2, i3, i4, i5);
        } else {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    public static void A0i(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            C05590Se.A01(view, rect);
        }
    }

    public static void A0j(View view, AnonymousClass05M r2) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (r2 == null) {
            if (A0D(view) instanceof AnonymousClass088) {
                r2 = new AnonymousClass05M();
            } else {
                accessibilityDelegate = null;
                view.setAccessibilityDelegate(accessibilityDelegate);
            }
        }
        accessibilityDelegate = r2.A00;
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void A0k(View view, C016507v r3) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass0XO.A0E(view, r3);
        }
    }

    public static void A0l(View view, AnonymousClass0UM r3) {
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass0VS.A00((PointerIcon) r3.A01(), view);
        }
    }

    public static void A0m(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            new IDxVPropertyShape2S0000000_I0(2).A02(view, charSequence);
        }
    }

    public static void A0n(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass0XO.A0F(view, str);
            return;
        }
        WeakHashMap weakHashMap = A04;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            A04 = weakHashMap;
        }
        weakHashMap.put(view, str);
    }

    public static void A0o(View view, boolean z2) {
        new IDxVPropertyShape2S0000000_I0(3).A02(view, Boolean.valueOf(z2));
    }

    public static void A0p(View view, boolean z2) {
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass0XO.A0G(view, z2);
        } else if (view instanceof AnonymousClass02T) {
            ((AnonymousClass02T) view).setNestedScrollingEnabled(z2);
        }
    }

    public static boolean A0q(KeyEvent keyEvent, View view) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        AnonymousClass0UW r6 = (AnonymousClass0UW) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (r6 == null) {
            r6 = new AnonymousClass0UW();
            view.setTag(R.id.tag_unhandled_key_event_manager, r6);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = r6.A02;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = AnonymousClass0UW.A03;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (r6.A02 == null) {
                        r6.A02 = new WeakHashMap();
                    }
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = (View) ((WeakReference) arrayList.get(size)).get();
                        if (view2 == null) {
                            arrayList.remove(size);
                        } else {
                            r6.A02.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                r6.A02.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View A002 = r6.A00(keyEvent, view);
        if (keyEvent.getAction() != 0) {
            return A002 != null;
        }
        int keyCode = keyEvent.getKeyCode();
        if (A002 == null) {
            return false;
        }
        if (KeyEvent.isModifierKey(keyCode)) {
            return true;
        }
        SparseArray sparseArray = r6.A00;
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            r6.A00 = sparseArray;
        }
        sparseArray.put(keyCode, new WeakReference(A002));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r0 == null) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0r(android.view.KeyEvent r4, android.view.View r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L_0x0023
            r0 = 2131366570(0x7f0a12aa, float:1.8353037E38)
            java.lang.Object r1 = r5.getTag(r0)
            X.0UW r1 = (X.AnonymousClass0UW) r1
            if (r1 != 0) goto L_0x0019
            X.0UW r1 = new X.0UW
            r1.<init>()
            r5.setTag(r0, r1)
        L_0x0019:
            java.lang.ref.WeakReference r0 = r1.A01
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r0.get()
            if (r0 != r4) goto L_0x0025
        L_0x0023:
            r0 = 0
            return r0
        L_0x0025:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r1.A01 = r0
            android.util.SparseArray r3 = r1.A00
            if (r3 != 0) goto L_0x0037
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r1.A00 = r3
        L_0x0037:
            int r0 = r4.getAction()
            r2 = 1
            if (r0 != r2) goto L_0x0053
            int r0 = r4.getKeyCode()
            int r1 = r3.indexOfKey(r0)
            if (r1 < 0) goto L_0x0053
            java.lang.Object r0 = r3.valueAt(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            r3.removeAt(r1)
            if (r0 != 0) goto L_0x005f
        L_0x0053:
            int r0 = r4.getKeyCode()
            java.lang.Object r0 = r3.get(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0023
        L_0x005f:
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x008a
            boolean r0 = A0t(r1)
            if (r0 == 0) goto L_0x008a
            r0 = 2131366571(0x7f0a12ab, float:1.835304E38)
            java.lang.Object r1 = r1.getTag(r0)
            java.util.AbstractList r1 = (java.util.AbstractList) r1
            if (r1 == 0) goto L_0x008a
            int r0 = r1.size()
            int r0 = r0 - r2
            if (r0 < 0) goto L_0x008a
            r1.get(r0)
            java.lang.String r1 = "onUnhandledKeyEvent"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x008a:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C004601z.A0r(android.view.KeyEvent, android.view.View):boolean");
    }

    public static boolean A0s(View view) {
        Boolean bool = (Boolean) new IDxVPropertyShape2S0000000_I0(3).A01(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean A0t(View view) {
        return Build.VERSION.SDK_INT >= 19 ? AnonymousClass099.A04(view) : view.getWindowToken() != null;
    }

    public static boolean A0u(View view) {
        return Build.VERSION.SDK_INT >= 19 ? AnonymousClass099.A05(view) : view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean A0v(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnonymousClass0XO.A0H(view);
        }
        if (view instanceof AnonymousClass02T) {
            return ((AnonymousClass02T) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean A0w(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C013706p.A08(view);
        }
        return false;
    }

    public static boolean A0x(View view) {
        Boolean bool = (Boolean) new IDxVPropertyShape2S0000000_I0(0).A01(view);
        return bool != null && bool.booleanValue();
    }

    public static String[] A0y(View view) {
        return Build.VERSION.SDK_INT >= 31 ? C05640Sj.A01(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }
}
