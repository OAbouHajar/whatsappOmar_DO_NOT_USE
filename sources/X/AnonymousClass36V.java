package X;

import com.whatsapp.util.Log;

/* renamed from: X.36V  reason: invalid class name */
public class AnonymousClass36V extends C16690tT {
    public final C15860rz A00;
    public final AnonymousClass1NE A01;
    public final AnonymousClass1KP A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06 = true;

    public AnonymousClass36V(C15860rz r2, AnonymousClass1NE r3, AnonymousClass1KP r4, String str, String str2, String str3) {
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.C13700nu.A0c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.C13700nu.A0c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.C13700nu.A0c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        com.whatsapp.util.Log.e("AutoconfManagerConsumerImpl/acquireVerifier", r1);
        r2.A01.AcB("AutoconfManagerConsumerImpl/acquireVerifier/error", r1.getMessage(), true);
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d4 A[ExcHandler: 43L | RemoteException | IllegalArgumentException | SecurityException (r1v5 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:16:0x008c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r16) {
        /*
            r15 = this;
            X.1KP r3 = r15.A02     // Catch:{ Exception -> 0x0123 }
            boolean r4 = r15.A06     // Catch:{ Exception -> 0x0123 }
            java.lang.String r10 = r15.A04     // Catch:{ Exception -> 0x0123 }
            java.lang.String r11 = r15.A05     // Catch:{ Exception -> 0x0123 }
            java.lang.String r12 = r15.A03     // Catch:{ Exception -> 0x0123 }
            X.1NE r2 = r15.A01     // Catch:{ Exception -> 0x0123 }
            byte[] r14 = r2.A01()     // Catch:{ Exception -> 0x0123 }
            r1 = 0
            if (r14 != 0) goto L_0x0019
            java.lang.String r0 = "RegistrationHttpManager/makeAutoconfRequest/null clientCapabilities"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0123 }
            goto L_0x004f
        L_0x0019:
            r3.A08()     // Catch:{ Exception -> 0x0123 }
            java.lang.String r0 = "http/registration/wamsys/autoconf-request"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0123 }
            java.util.HashMap r13 = X.AnonymousClass000.A0x()     // Catch:{ Exception -> 0x0123 }
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0123 }
            byte[] r1 = r0.getBytes()     // Catch:{ Exception -> 0x0123 }
            java.lang.String r0 = "consent_shown"
            r13.put(r0, r1)     // Catch:{ Exception -> 0x0123 }
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0123 }
            byte[] r1 = r0.getBytes()     // Catch:{ Exception -> 0x0123 }
            java.lang.String r0 = "create_verifier"
            r13.put(r0, r1)     // Catch:{ Exception -> 0x0123 }
            X.1SU r9 = r3.A0L     // Catch:{ Exception -> 0x0123 }
            X.1S0 r8 = r3.A00     // Catch:{ Exception -> 0x0123 }
            X.3zh r7 = new X.3zh     // Catch:{ Exception -> 0x0123 }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0123 }
            java.lang.Object r0 = X.C31591ei.A00(r7)     // Catch:{ Exception -> 0x0123 }
            X.4Ew r0 = (X.C82974Ew) r0     // Catch:{ Exception -> 0x0123 }
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "AutoconfTask/doInBackground/null autoconfResult"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0123 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0123 }
            return r0
        L_0x005a:
            java.lang.String r1 = r0.A00     // Catch:{ Exception -> 0x0123 }
            r12 = 0
            if (r1 != 0) goto L_0x0066
            java.lang.String r0 = "AutoconfManagerConsumerImpl/acquireVerifier/null registerStartMessage"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0123 }
            goto L_0x00ed
        L_0x0066:
            X.4Mt r0 = r2.A00     // Catch:{ Exception -> 0x0123 }
            if (r0 != 0) goto L_0x006d
            r2.A00()     // Catch:{ Exception -> 0x0123 }
        L_0x006d:
            r0 = 8
            byte[] r5 = android.util.Base64.decode(r1, r0)     // Catch:{ Exception -> 0x0123 }
            X.4Po r4 = new X.4Po     // Catch:{ Exception -> 0x0123 }
            r4.<init>()     // Catch:{ Exception -> 0x0123 }
            android.os.Bundle r1 = r4.A00     // Catch:{ Exception -> 0x0123 }
            java.lang.String r0 = "requestMessage"
            r1.putByteArray(r0, r5)     // Catch:{ Exception -> 0x0123 }
            r4.A00()     // Catch:{ Exception -> 0x0123 }
            X.4Bn r9 = new X.4Bn     // Catch:{ Exception -> 0x0123 }
            r9.<init>(r1)     // Catch:{ Exception -> 0x0123 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x0123 }
            r0.<init>()     // Catch:{ Exception -> 0x0123 }
            X.4Mt r5 = r2.A00     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            X.AnonymousClass00B.A06(r5)     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            X.39t r6 = r5.A03     // Catch:{ Exception -> 0x00c8, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            r6.A04(r9)     // Catch:{ Exception -> 0x0097, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            goto L_0x009b
        L_0x0097:
            r0 = move-exception
            X.C13700nu.A0c(r0)     // Catch:{ Exception -> 0x00c8, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
        L_0x009b:
            android.net.Uri r8 = X.C87824Ys.A00     // Catch:{ Exception -> 0x00c8, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            X.38e r7 = r5.A01     // Catch:{ Exception -> 0x00c8, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            android.content.ContentResolver r1 = r5.A00     // Catch:{ Exception -> 0x00c8, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            java.lang.String r4 = "register"
            android.os.Bundle r0 = r9.A00     // Catch:{ Exception -> 0x00c8, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            android.os.Bundle r0 = X.C90514eI.A00(r0)     // Catch:{ Exception -> 0x00c8, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            android.os.Bundle r1 = X.AnonymousClass4Xb.A00(r1, r8, r0, r7, r4)     // Catch:{ Exception -> 0x00c8, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            X.38T r0 = r5.A02     // Catch:{ Exception -> 0x00c8, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            X.AnonymousClass4Xb.A01(r1, r0, r4)     // Catch:{ Exception -> 0x00c8, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            if (r1 != 0) goto L_0x00b6
            r1 = 0
            goto L_0x00bf
        L_0x00b6:
            android.os.Bundle r0 = X.C90514eI.A00(r1)     // Catch:{ Exception -> 0x00c8, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            X.4Pp r1 = new X.4Pp     // Catch:{ Exception -> 0x00c8, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00c8, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
        L_0x00bf:
            r6.A05(r1)     // Catch:{ Exception -> 0x00c3, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            goto L_0x00e7
        L_0x00c3:
            r0 = move-exception
            X.C13700nu.A0c(r0)     // Catch:{ Exception -> 0x00c8, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            goto L_0x00e7
        L_0x00c8:
            r1 = move-exception
            X.39t r0 = r5.A03     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            r0.A0A(r1)     // Catch:{ Exception -> 0x00cf, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
            goto L_0x00d3
        L_0x00cf:
            r0 = move-exception
            X.C13700nu.A0c(r0)     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
        L_0x00d3:
            throw r1     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x00d4 }
        L_0x00d4:
            r1 = move-exception
            java.lang.String r0 = "AutoconfManagerConsumerImpl/acquireVerifier"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0123 }
            X.0so r4 = r2.A01     // Catch:{ Exception -> 0x0123 }
            java.lang.String r2 = r1.getMessage()     // Catch:{ Exception -> 0x0123 }
            r1 = 1
            java.lang.String r0 = "AutoconfManagerConsumerImpl/acquireVerifier/error"
            r4.AcB(r0, r2, r1)     // Catch:{ Exception -> 0x0123 }
            r1 = r12
        L_0x00e7:
            if (r1 == 0) goto L_0x00ed
            byte[] r12 = r1.A00()     // Catch:{ Exception -> 0x0123 }
        L_0x00ed:
            if (r12 != 0) goto L_0x00f5
            java.lang.String r0 = "RegistrationHttpManager/makeAutoconfVerifierRequest/null verifier"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0123 }
            goto L_0x010d
        L_0x00f5:
            r3.A08()     // Catch:{ Exception -> 0x0123 }
            java.lang.String r0 = "http/registration/wamsys/autoconf-verifier-request"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0123 }
            X.1SU r9 = r3.A0L     // Catch:{ Exception -> 0x0123 }
            X.1S0 r8 = r3.A00     // Catch:{ Exception -> 0x0123 }
            X.3zg r7 = new X.3zg     // Catch:{ Exception -> 0x0123 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0123 }
            java.lang.Object r0 = X.C31591ei.A00(r7)     // Catch:{ Exception -> 0x0123 }
            X.4Ex r0 = (X.C82984Ex) r0     // Catch:{ Exception -> 0x0123 }
            goto L_0x010e
        L_0x010d:
            r0 = 0
        L_0x010e:
            if (r0 != 0) goto L_0x0118
            java.lang.String r0 = "AutoconfTask/doInBackground/null autoconfVerifierResult"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0123 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0123 }
            return r0
        L_0x0118:
            int r0 = r0.A00     // Catch:{ Exception -> 0x0123 }
            boolean r0 = X.C13690nt.A1R(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0123 }
            return r0
        L_0x0123:
            r1 = move-exception
            java.lang.String r0 = "AutoconfTask/entrypoint call error: "
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36V.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        StringBuilder A0r = AnonymousClass000.A0r("AutoconfTask/onPostExecute/autoconf verifier creation ");
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Log.i(AnonymousClass000.A0h(booleanValue ? "succeeded" : "failed", A0r));
        this.A00.A0q(booleanValue ? "autoconf_verifier_creation_successful" : "autoconf_verifier_creation_failed");
    }
}
