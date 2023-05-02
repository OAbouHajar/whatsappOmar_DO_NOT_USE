package X;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* renamed from: X.0EQ  reason: invalid class name */
public class AnonymousClass0EQ extends C05360Qq {
    public static Constructor A02;
    public static Field A03;
    public static boolean A04;
    public static boolean A05;
    public WindowInsets A00;
    public C06510Wk A01;

    public AnonymousClass0EQ() {
        super(new AnonymousClass030());
        WindowInsets windowInsets;
        if (!A05) {
            try {
                A03 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            A05 = true;
        }
        Field field = A03;
        if (field != null) {
            try {
                WindowInsets windowInsets2 = (WindowInsets) field.get((Object) null);
                if (windowInsets2 != null) {
                    windowInsets = new WindowInsets(windowInsets2);
                    this.A00 = windowInsets;
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!A04) {
            try {
                A02 = WindowInsets.class.getConstructor(new Class[]{Rect.class});
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            A04 = true;
        }
        Constructor constructor = A02;
        if (constructor != null) {
            try {
                windowInsets = (WindowInsets) constructor.newInstance(new Object[]{AnonymousClass000.A0J()});
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
            this.A00 = windowInsets;
        }
        windowInsets = null;
        this.A00 = windowInsets;
    }

    public AnonymousClass0EQ(AnonymousClass030 r2) {
        super(r2);
        this.A00 = r2.A07();
    }

    public AnonymousClass030 A00() {
        AnonymousClass030 A022 = AnonymousClass030.A02(this.A00);
        A022.A00.A08(this.A01);
        return A022;
    }

    public void A01(C06510Wk r1) {
        this.A01 = r1;
    }

    public void A02(C06510Wk r6) {
        WindowInsets windowInsets = this.A00;
        if (windowInsets != null) {
            this.A00 = windowInsets.replaceSystemWindowInsets(r6.A01, r6.A03, r6.A02, r6.A00);
        }
    }
}
