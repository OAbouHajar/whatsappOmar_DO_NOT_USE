package X;

import android.graphics.Bitmap;
import com.facebook.redex.RunnableRunnableShape13S0200000_I1_1;

/* renamed from: X.3F0  reason: invalid class name */
public class AnonymousClass3F0 implements C108535Oj {
    public C85154Ni A00;
    public final C16180sb A01;
    public final AnonymousClass1A9 A02;
    public final C16320sq A03;

    public AnonymousClass3F0(C16180sb r1, AnonymousClass1A9 r2, C16320sq r3) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0029 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass01Q A00(android.graphics.Bitmap r4, X.C16180sb r5) {
        /*
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r1.append(r0)
            java.lang.String r0 = ".jpeg"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.io.File r3 = r5.A0N(r0)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x002a }
            r2.<init>(r3)     // Catch:{ Exception -> 0x002a }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0025 }
            r0 = 80
            r4.compress(r1, r0, r2)     // Catch:{ all -> 0x0025 }
            r2.close()     // Catch:{ Exception -> 0x002a }
            goto L_0x0036
        L_0x0025:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0029 }
        L_0x0029:
            throw r0     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            r1 = move-exception
            java.lang.String r0 = "product-details/send-product/save-to-storage/failed: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            goto L_0x0037
        L_0x0036:
            r0 = 1
        L_0x0037:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.01Q r0 = new X.01Q
            r0.<init>(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3F0.A00(android.graphics.Bitmap, X.0sb):X.01Q");
    }

    public void ASw(Bitmap bitmap, C62723Er r5, boolean z2) {
        this.A03.Acl(new RunnableRunnableShape13S0200000_I1_1(this, 0, bitmap));
    }
}
