package X;

import androidx.window.extensions.WindowExtensionsProvider;

/* renamed from: X.0if  reason: invalid class name and case insensitive filesystem */
public final class C11370if extends AnonymousClass1DR implements AnonymousClass1DU {
    public C11370if() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        ClassLoader classLoader = AnonymousClass0X4.class.getClassLoader();
        if (classLoader == null || !AnonymousClass0X4.A01(AnonymousClass0X4.A00, classLoader)) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
