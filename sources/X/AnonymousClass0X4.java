package X;

import android.os.Build;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;

/* renamed from: X.0X4  reason: invalid class name */
public final class AnonymousClass0X4 {
    public static final AnonymousClass0X4 A00 = new AnonymousClass0X4();
    public static final C15220qW A01 = C32521gW.A00(new C11370if());

    public static final WindowLayoutComponent A00() {
        return (WindowLayoutComponent) A01.getValue();
    }

    public static final /* synthetic */ boolean A01(AnonymousClass0X4 r3, ClassLoader classLoader) {
        return Build.VERSION.SDK_INT >= 24 && r3.A07(classLoader) && r3.A05(classLoader) && r3.A06(classLoader) && r3.A04(classLoader);
    }

    public static final boolean A03(AnonymousClass1DU r2) {
        try {
            return ((Boolean) r2.AIT()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    public final boolean A04(ClassLoader classLoader) {
        return A03(new C11410ij(classLoader));
    }

    public final boolean A05(ClassLoader classLoader) {
        return A03(new C11420ik(classLoader));
    }

    public final boolean A06(ClassLoader classLoader) {
        return A03(new C11430il(classLoader));
    }

    public final boolean A07(ClassLoader classLoader) {
        return A03(new C11440im(classLoader));
    }

    public final boolean A08(Method method, AnonymousClass2BR r4) {
        return method.getReturnType().equals(C04360Mg.A00(r4));
    }
}
