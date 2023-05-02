package X;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.0EV  reason: invalid class name */
public class AnonymousClass0EV extends AnonymousClass0VF {
    public static Class A04;
    public static Field A05;
    public static Field A06;
    public static Method A07;
    public static boolean A08;
    public C06510Wk A00;
    public C06510Wk A01 = null;
    public AnonymousClass030 A02;
    public final WindowInsets A03;

    public AnonymousClass0EV(AnonymousClass030 r2, WindowInsets windowInsets) {
        super(r2);
        this.A03 = windowInsets;
    }

    private C06510Wk A01(int i2, boolean z2) {
        C06510Wk A002;
        C06510Wk r1;
        C06510Wk r5 = C06510Wk.A04;
        C06510Wk r4 = r5;
        int i3 = 1;
        do {
            if ((i2 & i3) != 0) {
                if (i3 != 1) {
                    C06510Wk r12 = null;
                    if (i3 != 2) {
                        if (i3 == 8) {
                            C06510Wk A0A = A0A();
                            AnonymousClass030 r0 = this.A02;
                            C06510Wk A012 = r0 != null ? r0.A00.A01() : r4;
                            int i4 = A0A.A00;
                            int i5 = A012.A00;
                            if (i4 > i5 || ((r1 = this.A00) != null && !r1.equals(r4) && (i4 = r1.A00) > i5)) {
                                A002 = C06510Wk.A00(0, 0, 0, i4);
                            }
                        } else if (i3 == 16) {
                            A002 = A02();
                        } else if (i3 == 32) {
                            A002 = A00();
                        } else if (i3 == 64) {
                            A002 = A03();
                        } else if (i3 == 128) {
                            AnonymousClass030 r02 = this.A02;
                            AnonymousClass0V6 A042 = r02 != null ? r02.A00.A04() : A04();
                            if (A042 != null) {
                                A002 = C06510Wk.A00(A042.A02(), A042.A04(), A042.A03(), A042.A01());
                            }
                        }
                        A002 = r4;
                    } else if (z2) {
                        AnonymousClass030 r03 = this.A02;
                        C06510Wk A013 = r03 != null ? r03.A00.A01() : r4;
                        C06510Wk A014 = A01();
                        A002 = C06510Wk.A00(Math.max(A013.A01, A014.A01), 0, Math.max(A013.A02, A014.A02), Math.max(A013.A00, A014.A00));
                    } else {
                        C06510Wk A0A2 = A0A();
                        AnonymousClass030 r04 = this.A02;
                        if (r04 != null) {
                            r12 = r04.A00.A01();
                        }
                        int i6 = A0A2.A00;
                        if (r12 != null) {
                            i6 = Math.min(i6, r12.A00);
                        }
                        A002 = C06510Wk.A00(A0A2.A01, 0, A0A2.A02, i6);
                    }
                } else if (z2) {
                    AnonymousClass030 r05 = this.A02;
                    A002 = C06510Wk.A00(0, Math.max((r05 != null ? r05.A00.A01() : r4).A03, A0A().A03), 0, 0);
                } else {
                    A002 = C06510Wk.A00(0, A0A().A03, 0, 0);
                }
                r5 = C06510Wk.A00(Math.max(r5.A01, A002.A01), Math.max(r5.A03, A002.A03), Math.max(r5.A02, A002.A02), Math.max(r5.A00, A002.A00));
            }
            i3 <<= 1;
        } while (i3 <= 256);
        return r5;
    }

    public final C06510Wk A0A() {
        C06510Wk r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        WindowInsets windowInsets = this.A03;
        C06510Wk A002 = C06510Wk.A00(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.A01 = A002;
        return A002;
    }

    public C06510Wk A0B(int i2) {
        return A01(7, false);
    }

    public C06510Wk A0C(int i2) {
        return A01(i2, true);
    }

    public AnonymousClass030 A0D(int i2, int i3, int i4, int i5) {
        C05900Tl r1 = new C05900Tl(AnonymousClass030.A02(this.A03));
        C06510Wk A002 = AnonymousClass030.A00(A0A(), i2, i3, i4, i5);
        C05360Qq r12 = r1.A00;
        r12.A02(A002);
        r12.A01(AnonymousClass030.A00(A01(), i2, i3, i4, i5));
        return r12.A00();
    }

    public void A0E(View view) {
        C06510Wk r0;
        if (Build.VERSION.SDK_INT < 30) {
            if (!A08) {
                try {
                    A07 = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                    Class<?> cls = Class.forName("android.view.View$AttachInfo");
                    A04 = cls;
                    A06 = cls.getDeclaredField("mVisibleInsets");
                    A05 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                    A06.setAccessible(true);
                    A05.setAccessible(true);
                } catch (ReflectiveOperationException e2) {
                    Log.e("WindowInsetsCompat", AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("Failed to get visible insets. (Reflection error). ")), e2);
                }
                A08 = true;
            }
            Method method = A07;
            if (!(method == null || A04 == null || A06 == null)) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    } else {
                        Rect rect = (Rect) A06.get(A05.get(invoke));
                        if (rect != null) {
                            r0 = C06510Wk.A00(rect.left, rect.top, rect.right, rect.bottom);
                            if (r0 == null) {
                            }
                            this.A00 = r0;
                            return;
                        }
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.e("WindowInsetsCompat", AnonymousClass000.A0h(e3.getMessage(), AnonymousClass000.A0r("Failed to get visible insets. (Reflection error). ")), e3);
                }
            }
            r0 = C06510Wk.A04;
            this.A00 = r0;
            return;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    public void A0F(AnonymousClass030 r1) {
        this.A02 = r1;
    }

    public boolean A0G() {
        return this.A03.isRound();
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return AnonymousClass09S.A00(this.A00, ((AnonymousClass0EV) obj).A00);
    }
}
