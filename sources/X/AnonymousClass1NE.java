package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.util.HashSet;

/* renamed from: X.1NE  reason: invalid class name */
public class AnonymousClass1NE {
    public C85014Mt A00;
    public C16300so A01;
    public byte[] A02 = null;
    public final C16980tz A03;
    public final C15860rz A04;

    public AnonymousClass1NE(C16980tz r2, C15860rz r3) {
        this.A03 = r2;
        this.A04 = r3;
    }

    public final void A00() {
        Context context = this.A03.A00;
        PackageManager packageManager = context.getPackageManager();
        ContentResolver contentResolver = context.getContentResolver();
        AnonymousClass47L r12 = new AnonymousClass47L();
        AnonymousClass38T r10 = new AnonymousClass38T(r12);
        HashSet hashSet = new HashSet();
        C67843cT builder = C67863cV.builder();
        for (Signature put : AnonymousClass4At.A02) {
            builder.put(C814448g.A00, put);
        }
        this.A00 = new C85014Mt(contentResolver, new C612538e(packageManager, builder.build(), C17380uz.of()), r10, new C616539t(r12, hashSet), r12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.whatsapp.util.Log.e("AutoconfManagerConsumerImpl/preload/feo2/soft_error", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0080, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r6.A03.A09(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        com.whatsapp.util.Log.e("AutoconfManagerConsumerImpl/preload/feo2/soft_error", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0091, code lost:
        if ((r2 instanceof android.os.RemoteException) != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0093, code lost:
        r1 = r9.A04;
        r0 = "error_remote_exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0097, code lost:
        r1.A0p(r0);
        com.whatsapp.util.Log.e("AutoconfManagerConsumerImpl/acquireClientCapabilities", r2);
        r9.A01.AcB("AutoconfManagerConsumerImpl/acquireClientCapabilities/error", r2.getMessage(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00af, code lost:
        if ((r2 instanceof X.AnonymousClass43L) != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b1, code lost:
        r1 = r9.A04;
        r0 = "error_wrapped_provider_exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b6, code lost:
        r0 = r2 instanceof java.lang.IllegalArgumentException;
        r1 = r9.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ba, code lost:
        if (r0 != false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bc, code lost:
        r0 = "error_illegal_argument_exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bf, code lost:
        r0 = "error_security_exception";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e A[ExcHandler: 43L | RemoteException | IllegalArgumentException | SecurityException (r2v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:8:0x0015] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A01() {
        /*
            r9 = this;
            byte[] r0 = r9.A02
            if (r0 == 0) goto L_0x000e
            X.0rz r1 = r9.A04
            java.lang.String r0 = "client_capabilities_cached"
            r1.A0p(r0)
        L_0x000b:
            byte[] r0 = r9.A02
            return r0
        L_0x000e:
            X.4Mt r0 = r9.A00
            if (r0 != 0) goto L_0x0015
            r9.A00()
        L_0x0015:
            X.4Mt r6 = r9.A00     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            X.AnonymousClass00B.A06(r6)     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            X.4Pm r0 = new X.4Pm     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            r0.<init>()     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            r0.A00()     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            android.os.Bundle r0 = r0.A00     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            X.4Bm r8 = new X.4Bm     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            r8.<init>(r0)     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            r0.<init>()     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            r5 = 0
            X.39t r7 = r6.A03     // Catch:{ Exception -> 0x0080, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            r7.A02(r8)     // Catch:{ Exception -> 0x0035, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            goto L_0x003b
        L_0x0035:
            r1 = move-exception
            java.lang.String r0 = "AutoconfManagerConsumerImpl/preload/feo2/soft_error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0080, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
        L_0x003b:
            android.net.Uri r4 = X.C87824Ys.A00     // Catch:{ Exception -> 0x0080, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            X.38e r3 = r6.A01     // Catch:{ Exception -> 0x0080, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            android.content.ContentResolver r1 = r6.A00     // Catch:{ Exception -> 0x0080, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            java.lang.String r2 = "query"
            android.os.Bundle r0 = r8.A00     // Catch:{ Exception -> 0x0080, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            android.os.Bundle r0 = X.C90514eI.A00(r0)     // Catch:{ Exception -> 0x0080, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            android.os.Bundle r1 = X.AnonymousClass4Xb.A00(r1, r4, r0, r3, r2)     // Catch:{ Exception -> 0x0080, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            X.38T r0 = r6.A02     // Catch:{ Exception -> 0x0080, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            X.AnonymousClass4Xb.A01(r1, r0, r2)     // Catch:{ Exception -> 0x0080, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            if (r1 != 0) goto L_0x0056
            r2 = 0
            goto L_0x005f
        L_0x0056:
            android.os.Bundle r0 = X.C90514eI.A00(r1)     // Catch:{ Exception -> 0x0080, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            X.4Pn r2 = new X.4Pn     // Catch:{ Exception -> 0x0080, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0080, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
        L_0x005f:
            r7.A03(r2)     // Catch:{ Exception -> 0x0063, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            goto L_0x0069
        L_0x0063:
            r1 = move-exception
            java.lang.String r0 = "AutoconfManagerConsumerImpl/preload/feo2/soft_error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0080, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
        L_0x0069:
            if (r2 == 0) goto L_0x006f
            byte[] r5 = r2.A00()     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
        L_0x006f:
            r9.A02 = r5     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            X.0rz r1 = r9.A04     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            if (r5 != 0) goto L_0x007c
            java.lang.String r0 = "success_null_client_capabilities"
        L_0x0078:
            r1.A0p(r0)     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            goto L_0x000b
        L_0x007c:
            java.lang.String r0 = "success_get_client_capabilities"
            goto L_0x0078
        L_0x0080:
            r2 = move-exception
            X.39t r0 = r6.A03     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            r0.A09(r2)     // Catch:{ Exception -> 0x0087, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
            goto L_0x008d
        L_0x0087:
            r1 = move-exception
            java.lang.String r0 = "AutoconfManagerConsumerImpl/preload/feo2/soft_error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
        L_0x008d:
            throw r2     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x008e }
        L_0x008e:
            r2 = move-exception
            boolean r0 = r2 instanceof android.os.RemoteException
            if (r0 == 0) goto L_0x00ad
            X.0rz r1 = r9.A04
            java.lang.String r0 = "error_remote_exception"
        L_0x0097:
            r1.A0p(r0)
            java.lang.String r0 = "AutoconfManagerConsumerImpl/acquireClientCapabilities"
            com.whatsapp.util.Log.e(r0, r2)
            X.0so r3 = r9.A01
            java.lang.String r2 = r2.getMessage()
            r1 = 1
            java.lang.String r0 = "AutoconfManagerConsumerImpl/acquireClientCapabilities/error"
            r3.AcB(r0, r2, r1)
            goto L_0x000b
        L_0x00ad:
            boolean r0 = r2 instanceof X.AnonymousClass43L
            if (r0 == 0) goto L_0x00b6
            X.0rz r1 = r9.A04
            java.lang.String r0 = "error_wrapped_provider_exception"
            goto L_0x0097
        L_0x00b6:
            boolean r0 = r2 instanceof java.lang.IllegalArgumentException
            X.0rz r1 = r9.A04
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = "error_illegal_argument_exception"
            goto L_0x0097
        L_0x00bf:
            java.lang.String r0 = "error_security_exception"
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NE.A01():byte[]");
    }
}
