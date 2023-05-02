package X;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;

/* renamed from: X.0W1  reason: invalid class name */
public final class AnonymousClass0W1 {
    public static final Integer A00() {
        String str;
        try {
            return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
        } catch (NoClassDefFoundError unused) {
            str = "Embedding extension version not found";
            Log.d("EmbeddingCompat", str);
            return null;
        } catch (UnsupportedOperationException unused2) {
            str = "Stub Extension";
            Log.d("EmbeddingCompat", str);
            return null;
        }
    }

    public static final boolean A01() {
        String str;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
        } catch (NoClassDefFoundError unused) {
            str = "Embedding extension version not found";
            Log.d("EmbeddingCompat", str);
            return false;
        } catch (UnsupportedOperationException unused2) {
            str = "Stub Extension";
            Log.d("EmbeddingCompat", str);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.window.extensions.embedding.ActivityEmbeddingComponent A02() {
        /*
            r1 = this;
            boolean r0 = A01()
            if (r0 == 0) goto L_0x0010
            androidx.window.extensions.WindowExtensions r0 = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions()
            androidx.window.extensions.embedding.ActivityEmbeddingComponent r0 = r0.getActivityEmbeddingComponent()
            if (r0 != 0) goto L_0x0015
        L_0x0010:
            X.0ch r0 = new X.0ch
            r0.<init>()
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0W1.A02():androidx.window.extensions.embedding.ActivityEmbeddingComponent");
    }
}
