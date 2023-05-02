package X;

import android.app.Activity;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;

/* renamed from: X.0il  reason: invalid class name and case insensitive filesystem */
public final class C11430il extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11430il(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    /* renamed from: A00 */
    public final Boolean AIT() {
        Class<?> loadClass = this.$classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        boolean z2 = false;
        Class<Consumer> cls = Consumer.class;
        Method method = loadClass.getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, cls});
        Method method2 = loadClass.getMethod("removeWindowLayoutInfoListener", new Class[]{cls});
        C18450wi.A0B(method);
        if (Modifier.isPublic(method.getModifiers())) {
            C18450wi.A0B(method2);
            if (Modifier.isPublic(method2.getModifiers())) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
