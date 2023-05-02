package X;

import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.37B  reason: invalid class name */
public class AnonymousClass37B extends C16690tT {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass01V A03;
    public final C16980tz A04;
    public final C15860rz A05;
    public final AnonymousClass10J A06;
    public final AnonymousClass1NE A07;
    public final AnonymousClass1KP A08;
    public final C47042Hg A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final WeakReference A0G;
    public final boolean A0H;
    public final boolean A0I;

    public AnonymousClass37B(AnonymousClass01V r2, C16980tz r3, C15860rz r4, AnonymousClass10J r5, AnonymousClass1NE r6, AnonymousClass1KP r7, C47042Hg r8, AnonymousClass2FP r9, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, int i4, boolean z2, boolean z3) {
        this.A0H = z2;
        this.A0C = str;
        this.A0E = str2;
        this.A0D = str3;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A0F = str4;
        this.A0B = str5;
        this.A04 = r3;
        this.A09 = r8;
        this.A0I = z3;
        this.A0A = str6;
        this.A03 = r2;
        this.A06 = r5;
        this.A0G = C13690nt.A0h(r9);
        this.A08 = r7;
        this.A05 = r4;
        this.A07 = r6;
        if (str3.equals("sms")) {
            AnonymousClass00B.A05(str5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ea, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.C13700nu.A0c(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0117, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        X.C13700nu.A0c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0123, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.C13700nu.A0c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0128, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        com.whatsapp.util.Log.e("AutoconfManagerConsumerImpl/acquireClientStartMessage", r4);
        r11.A01.AcB("AutoconfManagerConsumerImpl/acquireClientStartMessage/error", r4.getMessage(), true);
        r4 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0128 A[ExcHandler: 43L | RemoteException | IllegalArgumentException | SecurityException (r4v7 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:21:0x00c6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r42) {
        /*
            r41 = this;
            java.lang.String r15 = "RequestCodeTask/doInBackground/"
            r9 = r41
            X.0tz r0 = r9.A04
            android.content.Context r0 = r0.A00
            java.lang.String r2 = r9.A0E
            java.lang.String r21 = X.AnonymousClass3A8.A00(r0, r2)
            java.lang.String r0 = "requestcode/"
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r0)
            java.lang.String r1 = r9.A0D
            r3.append(r1)
            java.lang.String r0 = "/bkgnd useStandaloneVerification: "
            r3.append(r0)
            boolean r5 = r9.A0I
            r3.append(r5)
            X.C13680ns.A1V(r3)
            X.0rz r13 = r9.A05
            android.content.SharedPreferences r4 = X.C13680ns.A0B(r13)
            java.lang.String r3 = "com.obwhatsapp.registration.RegisterPhone.mistyped_state"
            r0 = 0
            java.lang.String r33 = r4.getString(r3, r0)
            X.01V r3 = r9.A03
            android.telephony.TelephonyManager r4 = r3.A0N()
            if (r4 == 0) goto L_0x0052
            java.lang.String r3 = r4.getNetworkOperator()
        L_0x003f:
            X.2Hf r30 = X.C47032Hf.A00(r3)
            if (r4 == 0) goto L_0x0050
            java.lang.String r3 = r4.getSimOperator()
        L_0x0049:
            X.2Hf r31 = X.C47032Hf.A00(r3)
            if (r5 == 0) goto L_0x00a0
            goto L_0x0054
        L_0x0050:
            r3 = r0
            goto L_0x0049
        L_0x0052:
            r3 = r0
            goto L_0x003f
        L_0x0054:
            java.lang.String r4 = r9.A0A     // Catch:{ Exception -> 0x01ea }
            X.AnonymousClass00B.A06(r4)     // Catch:{ Exception -> 0x01ea }
            X.1KP r5 = r9.A08     // Catch:{ Exception -> 0x01ea }
            java.lang.String r3 = r9.A0C     // Catch:{ Exception -> 0x01ea }
            java.lang.String r32 = X.AnonymousClass2JN.A00     // Catch:{ Exception -> 0x01ea }
            java.lang.String r6 = r9.A0B     // Catch:{ Exception -> 0x01ea }
            X.2Hg r7 = r9.A09     // Catch:{ Exception -> 0x01ea }
            r5.A08()     // Catch:{ Exception -> 0x01ea }
            byte[] r26 = r5.A0C(r3, r2)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r8 = "requestCodeForStandaloneVerification"
            byte[] r27 = r5.A0B(r8)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r8 = "http/registration/wamsys/requestCodeStandalone"
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ Exception -> 0x01ea }
            r28 = r5
            r29 = r7
            r34 = r6
            java.util.Map r25 = r28.A07(r29, r30, r31, r32, r33, r34)     // Catch:{ Exception -> 0x01ea }
            X.1SU r6 = r5.A0L     // Catch:{ Exception -> 0x01ea }
            java.util.List r24 = r5.A04()     // Catch:{ Exception -> 0x01ea }
            X.1S0 r5 = r5.A00     // Catch:{ Exception -> 0x01ea }
            X.3zj r16 = new X.3zj     // Catch:{ Exception -> 0x01ea }
            r20 = r2
            r22 = r1
            r23 = r4
            r17 = r5
            r18 = r6
            r19 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x01ea }
            java.lang.Object r5 = X.C31591ei.A00(r16)     // Catch:{ Exception -> 0x01ea }
            X.1lJ r5 = (X.C35061lJ) r5     // Catch:{ Exception -> 0x01ea }
            goto L_0x01ba
        L_0x00a0:
            java.lang.String r3 = "autoconf"
            boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x01ea }
            if (r3 == 0) goto L_0x0153
            X.1NE r11 = r9.A07     // Catch:{ Exception -> 0x01ea }
            X.AnonymousClass00B.A06(r11)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r4 = r9.A0F     // Catch:{ Exception -> 0x01ea }
            r5 = 0
            if (r4 != 0) goto L_0x00b9
            java.lang.String r3 = "AutoconfManagerConsumerImpl/acquireClientStartMessage/null serverStartMessage"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ Exception -> 0x01ea }
            goto L_0x0141
        L_0x00b9:
            X.4Mt r3 = r11.A00     // Catch:{ Exception -> 0x01ea }
            if (r3 != 0) goto L_0x00c0
            r11.A00()     // Catch:{ Exception -> 0x01ea }
        L_0x00c0:
            r3 = 8
            byte[] r7 = android.util.Base64.decode(r4, r3)     // Catch:{ Exception -> 0x01ea }
            X.4Mt r10 = r11.A00     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            X.AnonymousClass00B.A06(r10)     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            X.4Pq r6 = new X.4Pq     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            r6.<init>()     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            android.os.Bundle r4 = r6.A00     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            java.lang.String r3 = "requestMessage"
            r4.putByteArray(r3, r7)     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            r6.A00()     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            X.4Bo r3 = new X.4Bo     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            r3.<init>(r4)     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            r4.<init>()     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            X.39t r8 = r10.A03     // Catch:{ Exception -> 0x011c, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            r8.A06(r3)     // Catch:{ Exception -> 0x00ea, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            goto L_0x00ee
        L_0x00ea:
            r4 = move-exception
            X.C13700nu.A0c(r4)     // Catch:{ Exception -> 0x011c, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
        L_0x00ee:
            android.net.Uri r12 = X.C87824Ys.A00     // Catch:{ Exception -> 0x011c, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            X.38e r7 = r10.A01     // Catch:{ Exception -> 0x011c, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            android.content.ContentResolver r6 = r10.A00     // Catch:{ Exception -> 0x011c, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            java.lang.String r4 = "start"
            android.os.Bundle r3 = r3.A00     // Catch:{ Exception -> 0x011c, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            android.os.Bundle r3 = X.C90514eI.A00(r3)     // Catch:{ Exception -> 0x011c, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            android.os.Bundle r6 = X.AnonymousClass4Xb.A00(r6, r12, r3, r7, r4)     // Catch:{ Exception -> 0x011c, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            X.38T r3 = r10.A02     // Catch:{ Exception -> 0x011c, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            X.AnonymousClass4Xb.A01(r6, r3, r4)     // Catch:{ Exception -> 0x011c, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            if (r6 != 0) goto L_0x010a
            r4 = 0
            goto L_0x0113
        L_0x010a:
            android.os.Bundle r3 = X.C90514eI.A00(r6)     // Catch:{ Exception -> 0x011c, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            X.4Pr r4 = new X.4Pr     // Catch:{ Exception -> 0x011c, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x011c, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
        L_0x0113:
            r8.A07(r4)     // Catch:{ Exception -> 0x0117, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            goto L_0x013b
        L_0x0117:
            r3 = move-exception
            X.C13700nu.A0c(r3)     // Catch:{ Exception -> 0x011c, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            goto L_0x013b
        L_0x011c:
            r4 = move-exception
            X.39t r3 = r10.A03     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            r3.A0B(r4)     // Catch:{ Exception -> 0x0123, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128, 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
            goto L_0x0127
        L_0x0123:
            r3 = move-exception
            X.C13700nu.A0c(r3)     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
        L_0x0127:
            throw r4     // Catch:{ 43L | RemoteException | IllegalArgumentException | SecurityException -> 0x0128 }
        L_0x0128:
            r4 = move-exception
            java.lang.String r3 = "AutoconfManagerConsumerImpl/acquireClientStartMessage"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ Exception -> 0x01ea }
            X.0so r7 = r11.A01     // Catch:{ Exception -> 0x01ea }
            java.lang.String r6 = r4.getMessage()     // Catch:{ Exception -> 0x01ea }
            r4 = 1
            java.lang.String r3 = "AutoconfManagerConsumerImpl/acquireClientStartMessage/error"
            r7.AcB(r3, r6, r4)     // Catch:{ Exception -> 0x01ea }
            r4 = r0
        L_0x013b:
            if (r4 == 0) goto L_0x0141
            byte[] r5 = r4.A00()     // Catch:{ Exception -> 0x01ea }
        L_0x0141:
            if (r5 == 0) goto L_0x0146
            int r3 = r5.length     // Catch:{ Exception -> 0x01ea }
            if (r3 != 0) goto L_0x0154
        L_0x0146:
            java.lang.String r2 = "RequestCodeTask/doInBackground/no valid clientStartMessage, skip sending autoconf code request"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x01ea }
            X.427 r2 = X.AnonymousClass427.ERROR_UNSPECIFIED     // Catch:{ Exception -> 0x01ea }
            X.01Q r3 = new X.01Q     // Catch:{ Exception -> 0x01ea }
            r3.<init>(r2, r0)     // Catch:{ Exception -> 0x01ea }
            return r3
        L_0x0153:
            r5 = r0
        L_0x0154:
            X.1KP r4 = r9.A08     // Catch:{ Exception -> 0x01ea }
            java.lang.String r3 = r9.A0C     // Catch:{ Exception -> 0x01ea }
            java.lang.String r14 = r9.A0A     // Catch:{ Exception -> 0x01ea }
            int r12 = r9.A01     // Catch:{ Exception -> 0x01ea }
            int r11 = r9.A02     // Catch:{ Exception -> 0x01ea }
            int r10 = r9.A00     // Catch:{ Exception -> 0x01ea }
            java.lang.String r38 = X.AnonymousClass2JN.A00     // Catch:{ Exception -> 0x01ea }
            java.lang.String r6 = r9.A0B     // Catch:{ Exception -> 0x01ea }
            X.2Hg r7 = r9.A09     // Catch:{ Exception -> 0x01ea }
            r4.A08()     // Catch:{ Exception -> 0x01ea }
            byte[] r27 = r4.A0C(r3, r2)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r8 = "requestCode"
            byte[] r28 = r4.A0B(r8)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r8 = "http/registration/wamsys/requestcode"
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ Exception -> 0x01ea }
            r34 = r4
            r35 = r7
            r36 = r30
            r37 = r31
            r39 = r33
            r40 = r6
            java.util.Map r7 = r34.A07(r35, r36, r37, r38, r39, r40)     // Catch:{ Exception -> 0x01ea }
            r4.A0A(r7)     // Catch:{ Exception -> 0x01ea }
            X.1SU r6 = r4.A0L     // Catch:{ Exception -> 0x01ea }
            java.lang.String r8 = "code_entrypoint"
            java.lang.String r24 = r4.A03(r3, r8)     // Catch:{ Exception -> 0x01ea }
            java.util.List r25 = r4.A04()     // Catch:{ Exception -> 0x01ea }
            X.1S0 r4 = r4.A00     // Catch:{ Exception -> 0x01ea }
            X.3zk r16 = new X.3zk     // Catch:{ Exception -> 0x01ea }
            r20 = r2
            r22 = r1
            r23 = r14
            r26 = r7
            r29 = r5
            r30 = r12
            r31 = r11
            r32 = r10
            r17 = r4
            r18 = r6
            r19 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ Exception -> 0x01ea }
            java.lang.Object r5 = X.C31591ei.A00(r16)     // Catch:{ Exception -> 0x01ea }
            X.1lJ r5 = (X.C35061lJ) r5     // Catch:{ Exception -> 0x01ea }
        L_0x01ba:
            if (r5 != 0) goto L_0x01c9
            java.lang.String r2 = "RequestCodeTask/doInBackground/null requestCodeResult"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x01ea }
            X.427 r2 = X.AnonymousClass427.ERROR_UNSPECIFIED     // Catch:{ Exception -> 0x01ea }
            X.01Q r3 = new X.01Q     // Catch:{ Exception -> 0x01ea }
            r3.<init>(r2, r0)     // Catch:{ Exception -> 0x01ea }
            return r3
        L_0x01c9:
            int r2 = r5.A00     // Catch:{ Exception -> 0x01ea }
            r13.A0d(r2)     // Catch:{ Exception -> 0x01ea }
            X.427 r4 = r5.A06     // Catch:{ Exception -> 0x01ea }
            X.427 r2 = X.AnonymousClass427.YES_WITH_CODE     // Catch:{ Exception -> 0x01ea }
            if (r4 != r2) goto L_0x01e4
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0q(r15)     // Catch:{ Exception -> 0x01ea }
            r3.append(r1)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r2 = "/status/error/yes-with-code"
            java.lang.String r2 = X.AnonymousClass000.A0h(r2, r3)     // Catch:{ Exception -> 0x01ea }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x01ea }
        L_0x01e4:
            X.01Q r3 = new X.01Q     // Catch:{ Exception -> 0x01ea }
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x01ea }
            return r3
        L_0x01ea:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r15)
            r2.append(r1)
            java.lang.String r1 = "/error "
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)
            com.whatsapp.util.Log.e(r1, r3)
            X.427 r1 = X.AnonymousClass427.ERROR_UNSPECIFIED
            X.01Q r3 = new X.01Q
            r3.<init>(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37B.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass01Q r6 = (AnonymousClass01Q) obj;
        AnonymousClass2FP r4 = (AnonymousClass2FP) this.A0G.get();
        if (r4 == null) {
            StringBuilder A0r = AnonymousClass000.A0r("requestcode/");
            A0r.append(this.A0D);
            Log.e(AnonymousClass000.A0h("/error/callback null", A0r));
            return;
        }
        String str = this.A0D;
        if (!str.equals("sms") || !this.A0H) {
            r4.AHn(str, this.A0H);
            Object obj2 = r6.A00;
            AnonymousClass00B.A06(obj2);
            r4.AOn((C35061lJ) r6.A01, (AnonymousClass427) obj2, str);
            return;
        }
        new Handler().postDelayed(new RunnableRunnableShape3S0300000_I1(this, r4, r6, 40), (long) (this.A06.A01(C16620tM.A02, 2638) * 1000.0f));
    }
}
