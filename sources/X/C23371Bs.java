package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.SecureRandom;

/* renamed from: X.1Bs  reason: invalid class name and case insensitive filesystem */
public class C23371Bs {
    public final C16040sK A00;
    public final C16440t3 A01;
    public final C18810xI A02;
    public final C16360su A03;
    public final C16370sv A04;
    public final AnonymousClass12P A05;
    public final SecureRandom A06;

    public C23371Bs(C16040sK r1, C16440t3 r2, C18810xI r3, C16360su r4, C16370sv r5, AnonymousClass12P r6, SecureRandom secureRandom) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A05 = r6;
        this.A06 = secureRandom;
        this.A02 = r3;
        this.A04 = r5;
    }

    public void A00() {
        C16360su r1 = this.A03;
        C37881pt A012 = r1.A01();
        Log.i("ExportEncryptionManager/copyPrefetchedKeyToActiveKey");
        if (A012 != null) {
            ((SharedPreferences) r1.A02.get()).edit().putString("/export/enc/active/owner", A012.A01.getRawString()).putString("/export/enc/active/version", A012.A05).putString("/export/enc/active/account_hash", A012.A02).putString("/export/enc/active/server_salt", A012.A04).putLong("/export/enc/active/last_fetch_time", A012.A00).putString("/export/enc/active/seed", A012.A03).apply();
            Log.i("ExportEncryptionManager/copiedPrefetchedKeyToActiveKey");
            return;
        }
        throw new C76983v2(101, "Active encryption key info is missing.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        r1 = new X.AnonymousClass040();
        r1.A01(X.AnonymousClass041.CONNECTED);
        r2 = r1.A00();
        r1 = new X.C006903e(com.obwhatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker.class);
        r1.A00.A0A = r2;
        ((X.AnonymousClass022) r4.A05.get()).A06(X.AnonymousClass03z.KEEP, (X.AnonymousClass043) r1.A00(), "export-key-prefetch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0088, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r4 = this;
            java.lang.String r2 = "ExportEncryptionManager/maybeScheduleGenerateEncryptionKey(); "
            X.0sK r1 = r4.A00
            boolean r0 = r1.A0G()
            if (r0 == 0) goto L_0x0020
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r0 = "skip scheduling, user in companion mode"
        L_0x0015:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0020:
            r1.A0B()
            X.1ZT r1 = r1.A05
            if (r1 != 0) goto L_0x0033
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r0 = "skip scheduling, no user logged in"
            goto L_0x0015
        L_0x0033:
            monitor-enter(r4)
            X.0su r0 = r4.A03     // Catch:{ all -> 0x0089 }
            X.1pt r0 = r0.A01()     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0059
            boolean r0 = r4.A04(r1, r0)     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0059
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            r1.<init>()     // Catch:{ all -> 0x0089 }
            r1.append(r2)     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "skip scheduling, encryption key is already prefetched recently"
            r1.append(r0)     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0089 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0089 }
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            return
        L_0x0059:
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            X.040 r1 = new X.040
            r1.<init>()
            X.041 r0 = X.AnonymousClass041.CONNECTED
            r1.A01(r0)
            X.042 r2 = r1.A00()
            java.lang.Class<com.obwhatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker> r0 = com.obwhatsapp.migration.export.encryption.ExportEncryptionManager$KeyPrefetchWorker.class
            X.03e r1 = new X.03e
            r1.<init>(r0)
            X.03i r0 = r1.A00
            r0.A0A = r2
            X.03k r3 = r1.A00()
            X.043 r3 = (X.AnonymousClass043) r3
            X.12P r0 = r4.A05
            java.lang.Object r2 = r0.get()
            X.022 r2 = (X.AnonymousClass022) r2
            java.lang.String r1 = "export-key-prefetch"
            X.03z r0 = X.AnonymousClass03z.KEEP
            r2.A06(r0, r3, r1)
            return
        L_0x0089:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0089 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23371Bs.A01():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        r5 = new byte[32];
        r3.A06.nextBytes(r5);
        r0 = android.util.Base64.encodeToString(r5, 2);
        r11 = r3.A02;
        r13 = r11.A00;
        r13.A0B();
        r14 = r13.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0087, code lost:
        if (r14 == null) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0089, code lost:
        r6 = android.util.Base64.decode(r0, 2);
        r9 = new java.util.concurrent.CountDownLatch(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a5, code lost:
        if (r11.A02.A01(new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5(r9, 33), r6, new byte[16], 2) == false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C18810xI.A00(r22, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b6, code lost:
        if (r9.getCount() > 0) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b8, code lost:
        r13.A0B();
        r0 = r13.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
        if (r0 == null) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c3, code lost:
        if (r0.equals(r14) == false) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c5, code lost:
        r5 = new java.util.ArrayList();
        r10 = new java.util.HashMap(r11.A04.A00).entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00df, code lost:
        if (r10.hasNext() == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e1, code lost:
        r0 = (java.util.Map.Entry) r10.next();
        r7 = (X.C40681uW) r0.getKey();
        r9 = (X.C40671uV) r0.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f9, code lost:
        if (java.util.Arrays.equals(r9.A01, r6) == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fb, code lost:
        r15 = r7.A00;
        r7 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ff, code lost:
        if (r7 != null) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0101, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0102, code lost:
        r7 = r9.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0104, code lost:
        if (r15 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0106, code lost:
        if (r8 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0108, code lost:
        if (r7 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010a, code lost:
        r5.add(new X.C37881pt(r14, r15, android.util.Base64.encodeToString(r6, 2), android.util.Base64.encodeToString(r8, 2), android.util.Base64.encodeToString(r7, 2), java.lang.System.currentTimeMillis()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0124, code lost:
        r8 = java.util.Arrays.copyOf(r7, r7.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012a, code lost:
        java.util.Collections.sort(r5, new com.facebook.redex.IDxComparatorShape19S0000000_2_I0(29));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0138, code lost:
        if (r5.isEmpty() != false) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013a, code lost:
        r6 = (X.C37881pt) r5.get(0);
        r2.A0B();
        r2 = r2.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0146, code lost:
        if (r2 != null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0148, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("ExportEncryptionManager/maybeGenerateEncryptionKey(); ");
        r0 = "user logged out while waiting for encryption key";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0156, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r0 = r1.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015b, code lost:
        if (r0 == null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0161, code lost:
        if (A04(r2, r0) == false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0163, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("ExportEncryptionManager/maybeGenerateEncryptionKey(); ");
        r1.append("concurrent conflict, encryption key was prefetched recently");
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0177, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017a, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("ExportEncryptionManager/maybeGenerateEncryptionKey(); ");
        r2.append("prefetched key for current user:  user=");
        r10 = r6.A01;
        r2.append(r10.getRawString());
        r2.append(" version=");
        r9 = r6.A05;
        r2.append(r9);
        r2.append(", account_hash=");
        r8 = r6.A02;
        r2.append(r8);
        r2.append(", server_salt=");
        r7 = r6.A04;
        r2.append(r7);
        r2.append(", last_fetched_time=");
        r4 = r6.A00;
        r2.append(r4);
        com.whatsapp.util.Log.i(r2.toString());
        ((android.content.SharedPreferences) r1.A02.get()).edit().putString("/export/enc/prefetched/owner", r10.getRawString()).putString("/export/enc/prefetched/version", r9).putString("/export/enc/prefetched/account_hash", r8).putString("/export/enc/prefetched/server_salt", r7).putLong("/export/enc/prefetched/last_fetch_time", r4).putString("/export/enc/prefetched/seed", r6.A03).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01fa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0207, code lost:
        throw new X.C76983v2(101, "Failed to create a key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x020f, code lost:
        throw new X.AnonymousClass40S(301, "User changed while waiting for encryption key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0217, code lost:
        throw new X.AnonymousClass40S(301, "User was logged out while waiting for encryption key.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x021f, code lost:
        throw new X.C76983v2(103, "Failed to create a key, timed out.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0220, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0228, code lost:
        throw new X.C76983v2("Failed to create a key, interrupted.", (java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0232, code lost:
        throw new X.C76983v2(102, "Not connected to server, cannot create keys.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x023a, code lost:
        throw new X.AnonymousClass40S(301, "Cannot create encryption key when user is not logged in.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.os.CancellationSignal r22) {
        /*
            r21 = this;
            java.lang.String r4 = "ExportEncryptionManager/maybeGenerateEncryptionKey(); "
            r3 = r21
            X.0sK r2 = r3.A00
            r2.A0B()
            X.1ZT r5 = r2.A05
            if (r5 != 0) goto L_0x0023
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = "skipped key prefetching, no user is logged in"
        L_0x0018:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0023:
            java.lang.System.currentTimeMillis()
            monitor-enter(r3)
            X.0su r1 = r3.A03     // Catch:{ all -> 0x023b }
            X.1pt r0 = r1.A01()     // Catch:{ all -> 0x023b }
            if (r0 == 0) goto L_0x006d
            boolean r0 = r3.A04(r5, r0)     // Catch:{ all -> 0x023b }
            if (r0 == 0) goto L_0x004d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x023b }
            r1.<init>()     // Catch:{ all -> 0x023b }
            r1.append(r4)     // Catch:{ all -> 0x023b }
            java.lang.String r0 = "skipped key prefetching, key is already prefetched recently"
            r1.append(r0)     // Catch:{ all -> 0x023b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x023b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x023b }
            monitor-exit(r3)     // Catch:{ all -> 0x023b }
            goto L_0x0155
        L_0x004d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x023b }
            r5.<init>()     // Catch:{ all -> 0x023b }
            r5.append(r4)     // Catch:{ all -> 0x023b }
            java.lang.String r0 = "reset prefetched key, a different user is now logged in or key is older"
            r5.append(r0)     // Catch:{ all -> 0x023b }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x023b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x023b }
            r1.A04()     // Catch:{ all -> 0x023b }
            X.0xI r0 = r3.A02     // Catch:{ all -> 0x023b }
            X.0xF r0 = r0.A04     // Catch:{ all -> 0x023b }
            java.util.HashMap r0 = r0.A00     // Catch:{ all -> 0x023b }
            r0.clear()     // Catch:{ all -> 0x023b }
        L_0x006d:
            monitor-exit(r3)     // Catch:{ all -> 0x023b }
            r0 = 32
            byte[] r5 = new byte[r0]
            java.security.SecureRandom r0 = r3.A06
            r0.nextBytes(r5)
            r0 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r5, r0)
            X.0xI r11 = r3.A02
            X.0sK r13 = r11.A00
            r13.A0B()
            X.1ZT r14 = r13.A05
            r5 = 301(0x12d, float:4.22E-43)
            if (r14 == 0) goto L_0x0233
            r12 = 2
            byte[] r6 = android.util.Base64.decode(r0, r12)
            r0 = 16
            byte[] r10 = new byte[r0]
            r0 = 1
            java.util.concurrent.CountDownLatch r9 = new java.util.concurrent.CountDownLatch
            r9.<init>(r0)
            X.0xH r8 = r11.A02
            r7 = 33
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5
            r0.<init>(r9, r7)
            boolean r0 = r8.A01(r0, r6, r10, r12)
            if (r0 == 0) goto L_0x0229
            r12 = 103(0x67, float:1.44E-43)
            r0 = r22
            X.C18810xI.A00(r0, r9)     // Catch:{ InterruptedException -> 0x0220 }
            long r9 = r9.getCount()
            r7 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0218
            r13.A0B()
            X.1ZT r0 = r13.A05
            if (r0 == 0) goto L_0x0210
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x0208
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.0xF r0 = r11.A04
            java.util.HashMap r7 = r0.A00
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r7)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r10 = r0.iterator()
        L_0x00db:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x012a
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r7 = r0.getKey()
            X.1uW r7 = (X.C40681uW) r7
            java.lang.Object r9 = r0.getValue()
            X.1uV r9 = (X.C40671uV) r9
            byte[] r0 = r9.A01
            boolean r0 = java.util.Arrays.equals(r0, r6)
            if (r0 == 0) goto L_0x00db
            java.lang.String r15 = r7.A00
            byte[] r7 = r7.A01
            if (r7 != 0) goto L_0x0124
            r8 = 0
        L_0x0102:
            byte[] r7 = r9.A02
            if (r15 == 0) goto L_0x00db
            if (r8 == 0) goto L_0x00db
            if (r7 == 0) goto L_0x00db
            r0 = 2
            java.lang.String r16 = android.util.Base64.encodeToString(r6, r0)
            java.lang.String r17 = android.util.Base64.encodeToString(r8, r0)
            java.lang.String r18 = android.util.Base64.encodeToString(r7, r0)
            long r19 = java.lang.System.currentTimeMillis()
            X.1pt r13 = new X.1pt
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r5.add(r13)
            goto L_0x00db
        L_0x0124:
            int r0 = r7.length
            byte[] r8 = java.util.Arrays.copyOf(r7, r0)
            goto L_0x0102
        L_0x012a:
            r6 = 29
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0
            r0.<init>(r6)
            java.util.Collections.sort(r5, r0)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x01fe
            r0 = 0
            java.lang.Object r6 = r5.get(r0)
            X.1pt r6 = (X.C37881pt) r6
            r2.A0B()
            X.1ZT r2 = r2.A05
            if (r2 != 0) goto L_0x0156
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = "user logged out while waiting for encryption key"
            goto L_0x0018
        L_0x0155:
            return
        L_0x0156:
            monitor-enter(r3)
            X.1pt r0 = r1.A01()     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x017a
            boolean r0 = r3.A04(r2, r0)     // Catch:{ all -> 0x01fb }
            if (r0 == 0) goto L_0x017a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fb }
            r1.<init>()     // Catch:{ all -> 0x01fb }
            r1.append(r4)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "concurrent conflict, encryption key was prefetched recently"
            r1.append(r0)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01fb }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01fb }
        L_0x0177:
            monitor-exit(r3)     // Catch:{ all -> 0x01fb }
            goto L_0x01fa
        L_0x017a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fb }
            r2.<init>()     // Catch:{ all -> 0x01fb }
            r2.append(r4)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "prefetched key for current user:  user="
            r2.append(r0)     // Catch:{ all -> 0x01fb }
            com.whatsapp.jid.UserJid r10 = r6.A01     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x01fb }
            r2.append(r0)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = " version="
            r2.append(r0)     // Catch:{ all -> 0x01fb }
            java.lang.String r9 = r6.A05     // Catch:{ all -> 0x01fb }
            r2.append(r9)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = ", account_hash="
            r2.append(r0)     // Catch:{ all -> 0x01fb }
            java.lang.String r8 = r6.A02     // Catch:{ all -> 0x01fb }
            r2.append(r8)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = ", server_salt="
            r2.append(r0)     // Catch:{ all -> 0x01fb }
            java.lang.String r7 = r6.A04     // Catch:{ all -> 0x01fb }
            r2.append(r7)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = ", last_fetched_time="
            r2.append(r0)     // Catch:{ all -> 0x01fb }
            long r4 = r6.A00     // Catch:{ all -> 0x01fb }
            r2.append(r4)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01fb }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01fb }
            X.01D r0 = r1.A02     // Catch:{ all -> 0x01fb }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01fb }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x01fb }
            android.content.SharedPreferences$Editor r2 = r0.edit()     // Catch:{ all -> 0x01fb }
            java.lang.String r1 = r10.getRawString()     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "/export/enc/prefetched/owner"
            android.content.SharedPreferences$Editor r1 = r2.putString(r0, r1)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "/export/enc/prefetched/version"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r9)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "/export/enc/prefetched/account_hash"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r8)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "/export/enc/prefetched/server_salt"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r7)     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "/export/enc/prefetched/last_fetch_time"
            android.content.SharedPreferences$Editor r2 = r1.putLong(r0, r4)     // Catch:{ all -> 0x01fb }
            java.lang.String r1 = r6.A03     // Catch:{ all -> 0x01fb }
            java.lang.String r0 = "/export/enc/prefetched/seed"
            android.content.SharedPreferences$Editor r0 = r2.putString(r0, r1)     // Catch:{ all -> 0x01fb }
            r0.apply()     // Catch:{ all -> 0x01fb }
            goto L_0x0177
        L_0x01fa:
            return
        L_0x01fb:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01fb }
            throw r0
        L_0x01fe:
            r2 = 101(0x65, float:1.42E-43)
            java.lang.String r1 = "Failed to create a key."
            X.3v2 r0 = new X.3v2
            r0.<init>((int) r2, (java.lang.String) r1)
            throw r0
        L_0x0208:
            java.lang.String r1 = "User changed while waiting for encryption key."
            X.40S r0 = new X.40S
            r0.<init>(r5, r1)
            throw r0
        L_0x0210:
            java.lang.String r1 = "User was logged out while waiting for encryption key."
            X.40S r0 = new X.40S
            r0.<init>(r5, r1)
            throw r0
        L_0x0218:
            java.lang.String r1 = "Failed to create a key, timed out."
            X.3v2 r0 = new X.3v2
            r0.<init>((int) r12, (java.lang.String) r1)
            throw r0
        L_0x0220:
            r2 = move-exception
            java.lang.String r1 = "Failed to create a key, interrupted."
            X.3v2 r0 = new X.3v2
            r0.<init>((java.lang.String) r1, (java.lang.Throwable) r2)
            throw r0
        L_0x0229:
            r2 = 102(0x66, float:1.43E-43)
            java.lang.String r1 = "Not connected to server, cannot create keys."
            X.3v2 r0 = new X.3v2
            r0.<init>((int) r2, (java.lang.String) r1)
            throw r0
        L_0x0233:
            java.lang.String r1 = "Cannot create encryption key when user is not logged in."
            X.40S r0 = new X.40S
            r0.<init>(r5, r1)
            throw r0
        L_0x023b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x023b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23371Bs.A02(android.os.CancellationSignal):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x01d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x01dc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x01e5 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:56:0x01e5=Splitter:B:56:0x01e5, B:50:0x01dd=Splitter:B:50:0x01dd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.os.CancellationSignal r12, java.util.zip.ZipOutputStream r13, boolean r14) {
        /*
            r11 = this;
            X.0su r0 = r11.A03
            X.1pt r6 = r0.A00()
            if (r6 == 0) goto L_0x01e8
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata(); generating metadata with:"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sK r1 = r11.A00
            r1.A0B()
            com.obwhatsapp.Me r0 = r1.A00
            r3 = 0
            if (r0 == 0) goto L_0x00e9
            java.lang.String r2 = r0.jabber_id
        L_0x0019:
            com.obwhatsapp.Me r0 = r1.A01()
            if (r0 == 0) goto L_0x0021
            java.lang.String r3 = r0.jabber_id
        L_0x0021:
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();    current user:"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "ExportEncryptionManager/generateEncFileMetadata();       current user: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "ExportEncryptionManager/generateEncFileMetadata();       old user: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();    key info:"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();       user         = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            com.whatsapp.jid.UserJid r5 = r6.A01
            java.lang.String r0 = r5.getRawString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "ExportEncryptionManager/generateEncFileMetadata();       version      = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r7 = r6.A05
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "ExportEncryptionManager/generateEncFileMetadata();       account_hash = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r3 = r6.A02
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "ExportEncryptionManager/generateEncFileMetadata();       server_salt  = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r2 = r6.A04
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();       last_fetched = "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            long r0 = r6.A00
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r6 = r0.toString()
            java.lang.String r4 = X.C88724az.A00(r5)
            java.lang.String r0 = "ExportEncryptionManager/generateEncFileMetadata();   data info: "
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "ExportEncryptionManager/generateEncFileMetadata();       data_id      = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "ExportEncryptionManager/generateEncFileMetadata();       source_id    = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            goto L_0x00ec
        L_0x00e9:
            r2 = r3
            goto L_0x0019
        L_0x00ec:
            X.54K r5 = new X.54K     // Catch:{ OperationCanceledException -> 0x01e6 }
            r5.<init>(r0, r13)     // Catch:{ OperationCanceledException -> 0x01e6 }
            X.4RG r0 = new X.4RG     // Catch:{ all -> 0x01e1 }
            r0.<init>(r7, r3, r2)     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = "AES-GCM-v1"
            X.4az r2 = new X.4az     // Catch:{ all -> 0x01e1 }
            r2.<init>(r0, r3, r6, r4)     // Catch:{ all -> 0x01e1 }
            android.util.JsonWriter r6 = r5.A01     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "data_id"
            r6.name(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x01e1 }
            r6.value(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = r2.A03     // Catch:{ all -> 0x01e1 }
            if (r1 == 0) goto L_0x0116
            java.lang.String r0 = "source_id"
            r6.name(r0)     // Catch:{ all -> 0x01e1 }
            r6.value(r1)     // Catch:{ all -> 0x01e1 }
        L_0x0116:
            java.lang.String r0 = "scheme"
            r6.name(r0)     // Catch:{ all -> 0x01e1 }
            r6.value(r3)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "key_id"
            r6.name(r0)     // Catch:{ all -> 0x01e1 }
            r6.beginObject()     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "version"
            r6.name(r0)     // Catch:{ all -> 0x01e1 }
            X.4RG r2 = r2.A00     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x01e1 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x01e1 }
            long r0 = (long) r0     // Catch:{ all -> 0x01e1 }
            r6.value(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "account_hash"
            r6.name(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x01e1 }
            r6.value(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "server_salt"
            r6.name(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x01e1 }
            r6.value(r0)     // Catch:{ all -> 0x01e1 }
            r6.endObject()     // Catch:{ all -> 0x01e1 }
            if (r14 == 0) goto L_0x01dd
            java.lang.String r0 = "files"
            r6.name(r0)     // Catch:{ all -> 0x01e1 }
            r6.beginArray()     // Catch:{ all -> 0x01e1 }
            r7 = 0
        L_0x015c:
            r12.throwIfCanceled()     // Catch:{ all -> 0x01d8 }
            X.0sv r0 = r11.A04     // Catch:{ all -> 0x01d8 }
            X.0zW r0 = r0.A01     // Catch:{ all -> 0x01d8 }
            r10 = 1000(0x3e8, float:1.401E-42)
            X.0zX r0 = r0.A00     // Catch:{ all -> 0x01d8 }
            X.0tf r3 = r0.A00()     // Catch:{ all -> 0x01d8 }
            X.0tg r9 = r3.A02     // Catch:{ all -> 0x01d3 }
            java.lang.String r8 = "SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f ORDER BY   f.required DESC , f._id ASC  LIMIT ?, ?"
            r0 = 2
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x01d3 }
            r2 = 0
            long r0 = (long) r7     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x01d3 }
            r4[r2] = r0     // Catch:{ all -> 0x01d3 }
            r2 = 1
            long r0 = (long) r10     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x01d3 }
            r4[r2] = r0     // Catch:{ all -> 0x01d3 }
            android.database.Cursor r1 = r9.A08(r8, r4)     // Catch:{ all -> 0x01d3 }
            X.4y7 r0 = X.C101924y7.A00     // Catch:{ all -> 0x01d3 }
            X.57f r4 = new X.57f     // Catch:{ all -> 0x01d3 }
            r4.<init>(r1, r0)     // Catch:{ all -> 0x01d3 }
            r3.close()     // Catch:{ all -> 0x01d8 }
            r3 = 0
        L_0x0191:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x01c3
            r12.throwIfCanceled()     // Catch:{ all -> 0x01ce }
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x01ce }
            X.4No r1 = (X.C85214No) r1     // Catch:{ all -> 0x01ce }
            java.lang.String r2 = r1.A03     // Catch:{ all -> 0x01ce }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x01ce }
            if (r0 != 0) goto L_0x01c0
            java.lang.String r1 = r1.A04     // Catch:{ all -> 0x01ce }
            r6.beginObject()     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = "path"
            r6.name(r0)     // Catch:{ all -> 0x01ce }
            r6.value(r1)     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = "iv"
            r6.name(r0)     // Catch:{ all -> 0x01ce }
            r6.value(r2)     // Catch:{ all -> 0x01ce }
            r6.endObject()     // Catch:{ all -> 0x01ce }
        L_0x01c0:
            int r3 = r3 + 1
            goto L_0x0191
        L_0x01c3:
            r4.close()     // Catch:{ all -> 0x01d8 }
            int r7 = r7 + 1000
            if (r3 > 0) goto L_0x015c
            r6.endArray()     // Catch:{ all -> 0x01e1 }
            goto L_0x01dd
        L_0x01ce:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x01d7 }
            goto L_0x01d7
        L_0x01d3:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x01d7 }
        L_0x01d7:
            throw r0     // Catch:{ all -> 0x01d8 }
        L_0x01d8:
            r0 = move-exception
            r6.endArray()     // Catch:{ all -> 0x01dc }
        L_0x01dc:
            throw r0     // Catch:{ all -> 0x01e1 }
        L_0x01dd:
            r5.close()     // Catch:{ OperationCanceledException -> 0x01e6 }
            return
        L_0x01e1:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x01e5 }
        L_0x01e5:
            throw r0     // Catch:{ OperationCanceledException -> 0x01e6 }
        L_0x01e6:
            r0 = move-exception
            throw r0
        L_0x01e8:
            r2 = 101(0x65, float:1.42E-43)
            java.lang.String r1 = "Active encryption key info is missing."
            X.3v2 r0 = new X.3v2
            r0.<init>((int) r2, (java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23371Bs.A03(android.os.CancellationSignal, java.util.zip.ZipOutputStream, boolean):void");
    }

    public boolean A04(UserJid userJid, C37881pt r10) {
        long abs = Math.abs(System.currentTimeMillis() - r10.A00);
        boolean z2 = false;
        if (userJid.equals(r10.A01)) {
            z2 = true;
        }
        boolean z3 = false;
        if (abs < 604800000) {
            z3 = true;
        }
        return z2 && z3;
    }
}
