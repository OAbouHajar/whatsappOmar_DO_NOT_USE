package com.facebook.redex;

import X.AnonymousClass4UI;
import X.AnonymousClass5SY;
import X.C18450wi;
import X.C214113z;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

public class RunnableRunnableShape1S0600000_I1 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public RunnableRunnableShape1S0600000_I1(AnonymousClass5SY r2, AnonymousClass4UI r3, C214113z r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A06 = 4;
        C18450wi.A0J(r4, x509Certificate);
        C18450wi.A0H(r2, 5);
        C18450wi.A0H(r3, 6);
        this.A05 = r4;
        this.A01 = x509Certificate;
        this.A04 = publicKey;
        this.A03 = num;
        this.A00 = r2;
        this.A02 = r3;
    }

    public RunnableRunnableShape1S0600000_I1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2) {
        this.A06 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        com.whatsapp.util.Log.w("EncBackupManager/decrypt media failed", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03fc, code lost:
        if (r7 != null) goto L_0x03fe;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x03a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:142:0x03ad */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03b3 A[ExcHandler: InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r0v58 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:120:0x036e] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r25 = this;
            r2 = r25
            int r0 = r2.A06
            switch(r0) {
                case 0: goto L_0x0023;
                case 1: goto L_0x01d9;
                case 2: goto L_0x025f;
                case 3: goto L_0x046f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A05
            X.13z r0 = (X.C214113z) r0
            java.lang.Object r5 = r2.A01
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5
            java.lang.Object r4 = r2.A04
            java.security.PublicKey r4 = (java.security.PublicKey) r4
            java.lang.Object r3 = r2.A03
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r1 = r2.A00
            X.5SY r1 = (X.AnonymousClass5SY) r1
            java.lang.Object r2 = r2.A02
            X.4UI r2 = (X.AnonymousClass4UI) r2
            r0.AaU(r1, r2, r3, r4, r5)
        L_0x0022:
            return
        L_0x0023:
            java.lang.Object r0 = r2.A00
            r24 = r0
            r0 = r24
            X.39o r0 = (X.C616039o) r0
            r24 = r0
            java.lang.Object r12 = r2.A01
            java.util.concurrent.atomic.AtomicReference r12 = (java.util.concurrent.atomic.AtomicReference) r12
            java.lang.Object r9 = r2.A02
            java.lang.Object r1 = r2.A03
            X.39m r1 = (X.C615839m) r1
            java.lang.Object r5 = r2.A04
            java.util.concurrent.atomic.AtomicBoolean r5 = (java.util.concurrent.atomic.AtomicBoolean) r5
            java.lang.Object r14 = r2.A05
            java.util.concurrent.CountDownLatch r14 = (java.util.concurrent.CountDownLatch) r14
            java.lang.String r23 = "gdrive/backup/backup-file failed on "
            r4 = 1
            r3 = 0
            java.lang.Object r0 = r12.get()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            if (r0 != 0) goto L_0x01c1
            java.lang.String r8 = "% bytes"
            java.lang.String r22 = "gdrive/backup/upload/failure-percentage/"
            java.lang.String r21 = "gdrive/backup/upload/failed-bytes/"
            r7 = 2
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            java.io.File r0 = r1.A01()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r11 = 0
            r2[r3] = r0     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            java.lang.String r0 = r1.A06     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r2[r4] = r0     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            java.lang.String r0 = "gdrive-service/upload-file filePath:%s, fileUploadPath:%s"
            java.lang.String.format(r0, r2)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r0 = r24
            java.util.concurrent.atomic.AtomicLong r2 = r0.A0e     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            long r17 = r2.get()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r19 = 0
            int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x008e
            r0 = r24
            java.util.concurrent.atomic.AtomicLong r0 = r0.A0f     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            double r17 = X.C13680ns.A00(r0, r2)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x008e
            java.lang.String r0 = "gdrive/backup/upload-file/too-many-failures"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r0 = r24
            X.2GT r1 = r0.A0X     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r0 = 38
            X.AnonymousClass2GT.A00(r1, r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            goto L_0x019b
        L_0x008e:
            r0 = r24
            X.2GJ r10 = r0.A0J     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            boolean r0 = r10.A05()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            if (r0 == 0) goto L_0x019b
            r0 = r24
            X.0yo r6 = r0.A0F     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            int r0 = r6.A00     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            if (r0 != r7) goto L_0x00aa
            r0 = r24
            X.2GT r13 = r0.A0X     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r19)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r13.A0K = r0     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
        L_0x00aa:
            com.obwhatsapp.backup.google.IDxDTask6Shape3S0300000_2_I1 r13 = new com.obwhatsapp.backup.google.IDxDTask6Shape3S0300000_2_I1     // Catch:{ all -> 0x0166 }
            r0 = r24
            r13.<init>(r9, r0, r1, r3)     // Catch:{ all -> 0x0166 }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "gdrive-service/upload "
            r9.append(r0)     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "<file>"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r9)     // Catch:{ all -> 0x0166 }
            java.lang.Object r9 = X.AnonymousClass2GS.A00(r13, r10, r0)     // Catch:{ all -> 0x0166 }
            X.3Ad r9 = (X.C61743Ad) r9     // Catch:{ all -> 0x0166 }
            if (r9 != 0) goto L_0x00fa
            r0 = r24
            java.util.concurrent.atomic.AtomicLong r13 = r0.A0f     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            long r0 = r1.A00()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r13.addAndGet(r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r0 = r24
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0c     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r0.incrementAndGet()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0q(r21)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            long r0 = r13.get()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r15.append(r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            X.C13680ns.A1V(r15)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            java.lang.StringBuilder r15 = X.AnonymousClass000.A0q(r22)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            double r0 = X.C13680ns.A00(r13, r2)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r15.append(r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r8, r15)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
        L_0x00fa:
            boolean r0 = r10.A05()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            if (r0 == 0) goto L_0x019b
            if (r9 == 0) goto L_0x019b
            java.lang.String r0 = "gdrive/backup/upload/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r0 = r24
            java.util.Map r8 = r0.A0b     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            X.4WW r1 = r9.A02     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            if (r1 == 0) goto L_0x014b
            java.lang.String r0 = r1.A04     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
        L_0x0111:
            r8.put(r0, r9)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r0 = r24
            java.util.concurrent.atomic.AtomicLong r8 = r0.A0g     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            if (r1 == 0) goto L_0x0148
            long r0 = r1.A00     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
        L_0x011c:
            r8.addAndGet(r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r0 = r24
            X.0rz r9 = r0.A0S     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            long r0 = r8.get()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            android.content.SharedPreferences$Editor r10 = r9.A0K()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            java.lang.String r9 = "gdrive_already_uploaded_bytes"
            X.C13680ns.A0x(r10, r9, r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A0c     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            boolean r0 = r0.get()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            if (r0 == 0) goto L_0x014e
            r0 = r24
            X.12M r9 = r0.A0G     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            long r0 = r8.get()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            long r6 = r2.get()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r9.A07(r0, r6)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            goto L_0x019a
        L_0x0148:
            long r0 = r9.A00     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            goto L_0x011c
        L_0x014b:
            java.lang.String r0 = r9.A06     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            goto L_0x0111
        L_0x014e:
            java.util.Locale r9 = java.util.Locale.ENGLISH     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            long r0 = r8.get()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            X.C13690nt.A1Q(r6, r3, r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            long r0 = r2.get()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            X.C13690nt.A1Q(r6, r4, r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            java.lang.String r0 = "gdrive-service/upload/success gdrive file map is null, notify backup progress suppressed: %d/%d"
            X.C13700nu.A0Z(r0, r9, r6)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            goto L_0x019a
        L_0x0166:
            r9 = move-exception
            r0 = r24
            java.util.concurrent.atomic.AtomicLong r7 = r0.A0f     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            long r0 = r1.A00()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r7.addAndGet(r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r0 = r24
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0c     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r0.incrementAndGet()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0q(r21)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            long r0 = r7.get()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r6.append(r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            X.C13680ns.A1V(r6)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0q(r22)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            double r0 = X.C13680ns.A00(r7, r2)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            r6.append(r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r8, r6)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
            throw r9     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x01b8, FileNotFoundException -> 0x01a4 }
        L_0x019a:
            r11 = 1
        L_0x019b:
            r5.compareAndSet(r4, r11)
            r14.countDown()
            if (r11 != 0) goto L_0x0022
            goto L_0x01c7
        L_0x01a4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0493 }
            java.lang.String r0 = "gdrive/backup/upload/file-not-found "
            r1.append(r0)     // Catch:{ all -> 0x0493 }
            java.lang.String r0 = "<file>"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0493 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0493 }
            goto L_0x01c1
        L_0x01b8:
            r1 = move-exception
            java.lang.String r0 = "gdrive/backup/backup-file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0493 }
            r12.set(r1)     // Catch:{ all -> 0x0493 }
        L_0x01c1:
            r5.compareAndSet(r4, r3)
            r14.countDown()
        L_0x01c7:
            r0 = r24
            X.0yo r0 = r0.A0F
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0c
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r23)
            goto L_0x04db
        L_0x01d9:
            java.lang.Object r9 = r2.A00
            X.390 r9 = (X.AnonymousClass390) r9
            java.lang.Object r8 = r2.A01
            java.util.concurrent.atomic.AtomicReference r8 = (java.util.concurrent.atomic.AtomicReference) r8
            java.lang.Object r7 = r2.A02
            java.lang.Object r1 = r2.A03
            X.39m r1 = (X.C615839m) r1
            java.lang.Object r6 = r2.A04
            java.util.concurrent.atomic.AtomicBoolean r6 = (java.util.concurrent.atomic.AtomicBoolean) r6
            java.lang.Object r5 = r2.A05
            java.util.concurrent.CountDownLatch r5 = (java.util.concurrent.CountDownLatch) r5
            java.lang.String r12 = "gdrive/encrypted-re-upload/backup-file failed on "
            r4 = 1
            r3 = 0
            java.lang.Object r0 = r8.get()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            if (r0 != 0) goto L_0x04d1
            java.lang.Object[] r2 = X.C13690nt.A1Z()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            java.io.File r0 = r1.A01()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            r11 = 0
            r2[r3] = r0     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            java.lang.String r0 = r1.A06     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            r2[r4] = r0     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            java.lang.String r0 = "gdrive/encrypted-re-upload//upload filePath:%s, fileUploadPath:%s"
            java.lang.String.format(r0, r2)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            X.2GJ r10 = r9.A05     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            boolean r0 = r10.A05()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            if (r0 == 0) goto L_0x0255
            com.obwhatsapp.backup.google.IDxDTask6Shape3S0300000_2_I1 r2 = new com.obwhatsapp.backup.google.IDxDTask6Shape3S0300000_2_I1     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            r2.<init>(r7, r9, r1, r4)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            java.lang.String r0 = "gdrive/encrypted-re-upload//upload "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            java.lang.String r0 = "<file>"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            java.lang.Object r7 = X.AnonymousClass2GS.A00(r2, r10, r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            X.3Ad r7 = (X.C61743Ad) r7     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            boolean r0 = r10.A05()     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            if (r0 == 0) goto L_0x0255
            if (r7 == 0) goto L_0x0255
            java.lang.String r0 = "gdrive/encrypted-re-upload/upload/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            java.util.Map r2 = r9.A0J     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            X.4WW r1 = r7.A02     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            if (r1 == 0) goto L_0x0251
            java.lang.String r0 = r1.A04     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
        L_0x0241:
            r2.put(r0, r7)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            java.util.concurrent.atomic.AtomicLong r2 = r9.A0Q     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            if (r1 == 0) goto L_0x024e
            long r0 = r1.A00     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
        L_0x024a:
            r2.addAndGet(r0)     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            goto L_0x0254
        L_0x024e:
            long r0 = r7.A00     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            goto L_0x024a
        L_0x0251:
            java.lang.String r0 = r7.A06     // Catch:{ 3iM | 3iO | 3iQ | 3iS | 3iZ | 3ia -> 0x04c8, FileNotFoundException -> 0x04b4 }
            goto L_0x0241
        L_0x0254:
            r11 = 1
        L_0x0255:
            r6.compareAndSet(r4, r11)
            r5.countDown()
            if (r11 != 0) goto L_0x0022
            goto L_0x04d7
        L_0x025f:
            java.lang.Object r5 = r2.A00
            X.38R r5 = (X.AnonymousClass38R) r5
            java.lang.Object r8 = r2.A01
            X.3Ad r8 = (X.C61743Ad) r8
            java.lang.Object r10 = r2.A02
            java.util.concurrent.atomic.AtomicReference r10 = (java.util.concurrent.atomic.AtomicReference) r10
            java.lang.Object r9 = r2.A03
            java.util.AbstractCollection r9 = (java.util.AbstractCollection) r9
            java.lang.Object r1 = r2.A04
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            java.lang.Object r3 = r2.A05
            java.util.concurrent.CountDownLatch r3 = (java.util.concurrent.CountDownLatch) r3
            X.0so r13 = r5.A01     // Catch:{ all -> 0x04fe }
            X.0sc r12 = r5.A09     // Catch:{ all -> 0x04fe }
            java.lang.String r2 = r8.A06     // Catch:{ all -> 0x04fe }
            android.content.Context r6 = r5.A00     // Catch:{ all -> 0x04fe }
            java.lang.String r0 = X.AnonymousClass2GK.A06(r6, r13, r12, r2)     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x0297
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x04fe }
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/null-local-path relative path:"
            r1.append(r0)     // Catch:{ all -> 0x04fe }
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ all -> 0x04fe }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04fe }
            goto L_0x04fa
        L_0x0297:
            java.io.File r7 = X.C13700nu.A0D(r0)     // Catch:{ all -> 0x04fe }
            X.2GJ r4 = r5.A07     // Catch:{ all -> 0x04fe }
            boolean r0 = r4.A05()     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x04fa
            java.lang.Object r0 = r10.get()     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x02b0
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/another-thread-failed/aborting-restore"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04fe }
            goto L_0x04fa
        L_0x02b0:
            java.util.concurrent.atomic.AtomicLong r11 = r5.A0L     // Catch:{ 3ib -> 0x0410, 3iO | 3iQ | 3iS | 3iU | 3iZ | 3ia -> 0x040e }
            X.4v8 r14 = new X.4v8     // Catch:{ 3ib -> 0x0410, 3iO | 3iQ | 3iS | 3iU | 3iZ | 3ia -> 0x040e }
            r14.<init>(r11)     // Catch:{ 3ib -> 0x0410, 3iO | 3iQ | 3iS | 3iU | 3iZ | 3ia -> 0x040e }
            X.2GM r0 = r5.A08     // Catch:{ 3ib -> 0x0410, 3iO | 3iQ | 3iS | 3iU | 3iZ | 3ia -> 0x040e }
            boolean r0 = X.C62173By.A05(r14, r4, r0, r8, r7)     // Catch:{ 3ib -> 0x0410, 3iO | 3iQ | 3iS | 3iU | 3iZ | 3ia -> 0x040e }
            if (r0 == 0) goto L_0x0430
            X.4WW r9 = r8.A02     // Catch:{ all -> 0x04fe }
            if (r9 == 0) goto L_0x031d
            long r0 = r9.A00     // Catch:{ all -> 0x04fe }
        L_0x02c5:
            r11.addAndGet(r0)     // Catch:{ all -> 0x04fe }
            X.0rz r8 = r5.A0B     // Catch:{ all -> 0x04fe }
            long r0 = r11.get()     // Catch:{ all -> 0x04fe }
            android.content.SharedPreferences$Editor r10 = r8.A0K()     // Catch:{ all -> 0x04fe }
            java.lang.String r8 = "gdrive_already_downloaded_bytes"
            X.C13680ns.A0x(r10, r8, r0)     // Catch:{ all -> 0x04fe }
            java.lang.String r8 = ".mcrypt1"
            boolean r0 = r2.endsWith(r8)     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x03b9
            X.0sd r11 = r5.A03     // Catch:{ all -> 0x04fe }
            X.0rz r0 = r11.A03     // Catch:{ all -> 0x04fe }
            boolean r0 = r0.A1f()     // Catch:{ all -> 0x04fe }
            r14 = 0
            if (r0 != 0) goto L_0x02f1
            java.lang.String r0 = "restore>MediaRestoreAction/decrypt-media/failed encryption disabled"
        L_0x02ec:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04fe }
            goto L_0x03b7
        L_0x02f1:
            java.lang.String r1 = r7.getName()     // Catch:{ all -> 0x04fe }
            boolean r0 = r1.endsWith(r8)     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x0309
            java.lang.String r0 = "restore>MediaRestoreAction/decrypt-media/failed no extension "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x04fe }
            r0.append(r1)     // Catch:{ all -> 0x04fe }
        L_0x0304:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04fe }
            goto L_0x02ec
        L_0x0309:
            if (r9 == 0) goto L_0x030d
            java.lang.String r2 = r9.A04     // Catch:{ all -> 0x04fe }
        L_0x030d:
            java.lang.String r0 = X.AnonymousClass2GK.A06(r6, r13, r12, r2)     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x0320
            java.lang.String r0 = "restore>MediaRestoreAction/decrypt-media/failed to get path for "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x04fe }
            r0.append(r2)     // Catch:{ all -> 0x04fe }
            goto L_0x0304
        L_0x031d:
            long r0 = r8.A00     // Catch:{ all -> 0x04fe }
            goto L_0x02c5
        L_0x0320:
            java.io.File r9 = X.C13700nu.A0D(r0)     // Catch:{ all -> 0x04fe }
            java.io.File r2 = r9.getParentFile()     // Catch:{ all -> 0x04fe }
            if (r2 == 0) goto L_0x0336
            boolean r0 = r2.exists()     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x033f
            boolean r0 = r2.mkdirs()     // Catch:{ all -> 0x04fe }
            if (r0 != 0) goto L_0x033f
        L_0x0336:
            java.lang.String r0 = "restore>MediaRestoreAction/decrypt-media/failed to create parent "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r2)     // Catch:{ all -> 0x04fe }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x04fe }
        L_0x033f:
            r10 = 0
            int r0 = r1.length()     // Catch:{ all -> 0x04fe }
            int r0 = r0 + -8
            java.lang.String r0 = r1.substring(r10, r0)     // Catch:{ all -> 0x04fe }
            byte[] r2 = X.AnonymousClass1ZW.A0G(r0)     // Catch:{ all -> 0x04fe }
            java.lang.String r8 = "EncBackupManager/decrypt media failed"
            X.0sk r0 = r11.A01     // Catch:{ all -> 0x04fe }
            byte[] r1 = r0.A03()     // Catch:{ all -> 0x04fe }
            if (r1 == 0) goto L_0x03b7
            r0 = 48
            byte[] r2 = X.C40771uf.A00(r1, r2, r0)     // Catch:{ all -> 0x04fe }
            r1 = 32
            byte[] r13 = new byte[r1]     // Catch:{ all -> 0x04fe }
            java.lang.System.arraycopy(r2, r10, r13, r10, r1)     // Catch:{ all -> 0x04fe }
            r0 = 16
            byte[] r12 = new byte[r0]     // Catch:{ all -> 0x04fe }
            java.lang.System.arraycopy(r2, r1, r12, r10, r0)     // Catch:{ all -> 0x04fe }
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r10 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3 }
            r2 = 2
            java.lang.String r0 = "AES"
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3 }
            r1.<init>(r13, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3 }
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3 }
            r0.<init>(r12)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3 }
            r10.init(r2, r1, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x03ae, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x03ae, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3 }
            javax.crypto.CipherInputStream r2 = new javax.crypto.CipherInputStream     // Catch:{ IOException -> 0x03ae, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3 }
            r2.<init>(r0, r10)     // Catch:{ IOException -> 0x03ae, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3 }
            X.12W r0 = r11.A02     // Catch:{ all -> 0x03a9 }
            X.1XH r0 = r0.A00()     // Catch:{ all -> 0x03a9 }
            X.1uh r1 = new X.1uh     // Catch:{ all -> 0x03a9 }
            r1.<init>(r0, r9)     // Catch:{ all -> 0x03a9 }
            X.AnonymousClass1XI.A0H(r2, r1)     // Catch:{ all -> 0x03a4 }
            r1.close()     // Catch:{ all -> 0x03a9 }
            r2.close()     // Catch:{ IOException -> 0x03ae, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3 }
            r7.delete()     // Catch:{ all -> 0x04fe }
            goto L_0x03b8
        L_0x03a4:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x03a8 }
        L_0x03a8:
            throw r0     // Catch:{ all -> 0x03a9 }
        L_0x03a9:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x03ad }
        L_0x03ad:
            throw r0     // Catch:{ IOException -> 0x03ae, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3 }
        L_0x03ae:
            r0 = move-exception
            com.whatsapp.util.Log.w(r8, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x03b3 }
            goto L_0x03b7
        L_0x03b3:
            r0 = move-exception
            com.whatsapp.util.Log.w(r8, r0)     // Catch:{ all -> 0x04fe }
        L_0x03b7:
            r9 = r14
        L_0x03b8:
            r7 = r9
        L_0x03b9:
            X.0pd r2 = r5.A0D     // Catch:{ all -> 0x04fe }
            r1 = 1856(0x740, float:2.601E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x04fe }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x03fc
            if (r7 == 0) goto L_0x043a
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0J     // Catch:{ all -> 0x04fe }
            int r0 = r0.getAndDecrement()     // Catch:{ all -> 0x04fe }
            if (r0 <= 0) goto L_0x03fe
            X.0t8 r2 = r5.A0C     // Catch:{ all -> 0x04fe }
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x04fe }
            java.lang.String r1 = X.C37981q3.A00(r7)     // Catch:{ IOException -> 0x03de }
            r0 = 0
            java.util.Collection r0 = r2.A0C(r0, r7, r1)     // Catch:{ all -> 0x04fe }
            goto L_0x03e8
        L_0x03de:
            r1 = move-exception
            java.lang.String r0 = "mediamessagestore/getMediaMessagesForFile/could not get file hash;"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04fe }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x04fe }
        L_0x03e8:
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x04fe }
        L_0x03ec:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x04fe }
            if (r0 == 0) goto L_0x03fe
            X.0tZ r1 = X.C13680ns.A0V(r2)     // Catch:{ all -> 0x04fe }
            X.0xO r0 = r5.A0G     // Catch:{ all -> 0x04fe }
            r0.A01(r1)     // Catch:{ all -> 0x04fe }
            goto L_0x03ec
        L_0x03fc:
            if (r7 == 0) goto L_0x043a
        L_0x03fe:
            X.0sb r0 = r5.A02     // Catch:{ IOException -> 0x043a }
            boolean r0 = r0.A0W(r7)     // Catch:{ IOException -> 0x043a }
            if (r0 == 0) goto L_0x043a
            android.net.Uri r0 = android.net.Uri.fromFile(r7)     // Catch:{ all -> 0x04fe }
            X.C17970vw.A0K(r6, r0)     // Catch:{ all -> 0x04fe }
            goto L_0x043a
        L_0x040e:
            r1 = move-exception
            goto L_0x0428
        L_0x0410:
            r2 = move-exception
            int r1 = r1.incrementAndGet()     // Catch:{ all -> 0x04fe }
            r0 = 20
            if (r1 <= r0) goto L_0x0422
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/missing file"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x04fe }
            r10.set(r2)     // Catch:{ all -> 0x04fe }
            goto L_0x0430
        L_0x0422:
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/missing file (non-critical)"
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x04fe }
            goto L_0x0430
        L_0x0428:
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04fe }
            r10.set(r1)     // Catch:{ all -> 0x04fe }
        L_0x0430:
            r9.add(r8)     // Catch:{ all -> 0x04fe }
            java.util.concurrent.atomic.AtomicLong r2 = r5.A0K     // Catch:{ all -> 0x04fe }
            long r0 = r8.A00     // Catch:{ all -> 0x04fe }
            r2.addAndGet(r0)     // Catch:{ all -> 0x04fe }
        L_0x043a:
            r3.countDown()
            boolean r0 = r4.A05()
            if (r0 == 0) goto L_0x0022
            java.util.concurrent.atomic.AtomicLong r6 = r5.A0M
            long r3 = r6.get()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            X.12M r1 = r5.A06
            java.util.concurrent.atomic.AtomicLong r0 = r5.A0L
            long r4 = r0.get()
            long r2 = r6.get()
            java.util.Iterator r1 = X.C16590tJ.A00(r1)
        L_0x045f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r1.next()
            X.12R r0 = (X.AnonymousClass12R) r0
            r0.ATZ(r4, r2)
            goto L_0x045f
        L_0x046f:
            java.lang.Object r0 = r2.A04
            X.37Z r0 = (X.AnonymousClass37Z) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0022
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r2.A05
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r0 = r0.getTag()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = r2.A00
            X.5PH r1 = (X.AnonymousClass5PH) r1
            java.lang.Object r0 = r2.A02
            android.text.Spannable r0 = (android.text.Spannable) r0
            r1.Ac7(r0)
            return
        L_0x0493:
            r2 = move-exception
            r5.compareAndSet(r4, r3)
            r14.countDown()
            r0 = r24
            X.0yo r0 = r0.A0F
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0c
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x04b3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r23)
            java.lang.String r0 = "<file>"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x04b3:
            throw r2
        L_0x04b4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x04e5 }
            java.lang.String r0 = "gdrive/encrypted-re-upload/backup-file/file-not-found "
            r1.append(r0)     // Catch:{ all -> 0x04e5 }
            java.lang.String r0 = "<file>"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x04e5 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x04e5 }
            goto L_0x04d1
        L_0x04c8:
            r1 = move-exception
            java.lang.String r0 = "gdrive/encrypted-re-upload/backup-file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04e5 }
            r8.set(r1)     // Catch:{ all -> 0x04e5 }
        L_0x04d1:
            r6.compareAndSet(r4, r3)
            r5.countDown()
        L_0x04d7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r12)
        L_0x04db:
            java.lang.String r0 = "<file>"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x04e5:
            r2 = move-exception
            r6.compareAndSet(r4, r3)
            r5.countDown()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r12)
            java.lang.String r0 = "<file>"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            throw r2
        L_0x04fa:
            r3.countDown()
            return
        L_0x04fe:
            r0 = move-exception
            r3.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape1S0600000_I1.run():void");
    }
}
