package X;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: X.0ik  reason: invalid class name and case insensitive filesystem */
public final class C11420ik extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11420ik(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    /* renamed from: A00 */
    public final Boolean AIT() {
        boolean z2 = false;
        Method method = this.$classLoader.loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", new Class[0]);
        Class<?> loadClass = this.$classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        C18450wi.A0B(method);
        if (Modifier.isPublic(method.getModifiers())) {
            C18450wi.A0B(loadClass);
            if (method.getReturnType().equals(loadClass)) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
