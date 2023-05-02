package X;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: X.0Ti  reason: invalid class name and case insensitive filesystem */
public class C05870Ti {
    public static Field A00;
    public static Field A01;
    public static Field A02;
    public static boolean A03 = true;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            A02 = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            A01 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            A00 = declaredField3;
            declaredField3.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.w("WindowInsetsCompat", AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("Failed to get visible insets from AttachInfo ")), e2);
        }
    }

    public static AnonymousClass030 A00(View view) {
        if (A03 && view.isAttachedToWindow()) {
            try {
                Object obj = A02.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) A01.get(obj);
                    Rect rect2 = (Rect) A00.get(obj);
                    if (!(rect == null || rect2 == null)) {
                        C05900Tl r4 = new C05900Tl();
                        C06510Wk A002 = C06510Wk.A00(rect.left, rect.top, rect.right, rect.bottom);
                        C05360Qq r42 = r4.A00;
                        r42.A01(A002);
                        r42.A02(C06510Wk.A00(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        AnonymousClass030 A003 = r42.A00();
                        AnonymousClass0VF r1 = A003.A00;
                        r1.A0F(A003);
                        r1.A0E(view.getRootView());
                        return A003;
                    }
                }
            } catch (IllegalAccessException e2) {
                Log.w("WindowInsetsCompat", AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("Failed to get insets from AttachInfo. ")), e2);
            }
        }
        return null;
    }
}
