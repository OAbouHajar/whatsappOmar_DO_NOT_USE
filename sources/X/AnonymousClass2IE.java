package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.2IE  reason: invalid class name */
public final class AnonymousClass2IE extends C16690tT {
    public final Context A00;
    public final C16600tK A01;

    public AnonymousClass2IE(Context context, C16600tK r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0028, code lost:
        if (r2 == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r4) {
        /*
            r3 = this;
            X.0tK r0 = r3.A01     // Catch:{ InterruptedException -> 0x0030 }
            boolean r0 = r0.A05     // Catch:{ InterruptedException -> 0x0030 }
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "awaiting captive wifi status"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0030 }
            java.util.concurrent.CountDownLatch r0 = X.C19090xk.A11     // Catch:{ InterruptedException -> 0x0030 }
            r0.await()     // Catch:{ InterruptedException -> 0x0030 }
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C19090xk.A13     // Catch:{ InterruptedException -> 0x0030 }
            boolean r2 = r0.get()     // Catch:{ InterruptedException -> 0x0030 }
            java.lang.String r1 = "captive wifi status is "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0030 }
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x0030 }
            r0.append(r2)     // Catch:{ InterruptedException -> 0x0030 }
            java.lang.String r0 = r0.toString()     // Catch:{ InterruptedException -> 0x0030 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0030 }
            r0 = 1
            if (r2 != 0) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ InterruptedException -> 0x0030 }
            return r0
        L_0x0030:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IE.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Context context = this.A00;
            Intent intent = new Intent();
            intent.setClassName(context.getPackageName(), "com.obwhatsapp.messaging.CaptivePortalActivity");
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
    }
}
