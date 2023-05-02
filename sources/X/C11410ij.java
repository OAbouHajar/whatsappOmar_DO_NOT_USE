package X;

import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: X.0ij  reason: invalid class name and case insensitive filesystem */
public final class C11410ij extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11410ij(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    /* renamed from: A00 */
    public final Boolean AIT() {
        AnonymousClass0X4 r4 = AnonymousClass0X4.A00;
        Class<?> loadClass = this.$classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
        boolean z2 = false;
        Method method = loadClass.getMethod("getBounds", new Class[0]);
        Method method2 = loadClass.getMethod("getType", new Class[0]);
        Method method3 = loadClass.getMethod("getState", new Class[0]);
        C18450wi.A0B(method);
        if (r4.A08(method, C87744Yj.A00(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
            C18450wi.A0B(method2);
            Class cls = Integer.TYPE;
            if (r4.A08(method2, C87744Yj.A00(cls)) && Modifier.isPublic(method2.getModifiers())) {
                C18450wi.A0B(method3);
                if (r4.A08(method3, C87744Yj.A00(cls)) && Modifier.isPublic(method3.getModifiers())) {
                    z2 = true;
                }
            }
        }
        return Boolean.valueOf(z2);
    }
}
