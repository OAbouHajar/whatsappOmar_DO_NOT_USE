package X;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: X.0im  reason: invalid class name and case insensitive filesystem */
public final class C11440im extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11440im(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    /* renamed from: A00 */
    public final Boolean AIT() {
        boolean z2 = false;
        Method declaredMethod = this.$classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", new Class[0]);
        Class<?> loadClass = this.$classLoader.loadClass("androidx.window.extensions.WindowExtensions");
        C18450wi.A0B(declaredMethod);
        C18450wi.A0B(loadClass);
        if (declaredMethod.getReturnType().equals(loadClass) && Modifier.isPublic(declaredMethod.getModifiers())) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
