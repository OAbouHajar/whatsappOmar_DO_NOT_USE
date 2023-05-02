package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;

/* renamed from: X.1Au  reason: invalid class name and case insensitive filesystem */
public class C23181Au {
    public AnonymousClass283 A00;
    public final C16300so A01;
    public final AnonymousClass16O A02;
    public final C18260wP A03;
    public final C16000sG A04;
    public final AnonymousClass167 A05;
    public final AnonymousClass12D A06;
    public final C16440t3 A07;
    public final C17580vJ A08;
    public final AnonymousClass137 A09;
    public final C14710pd A0A;
    public final C17190ug A0B;
    public final ConcurrentHashMap A0C = new ConcurrentHashMap();
    public final ConcurrentHashMap A0D = new ConcurrentHashMap();
    public final ConcurrentHashMap A0E = new ConcurrentHashMap();

    public C23181Au(C16300so r2, AnonymousClass16O r3, C18260wP r4, C16000sG r5, AnonymousClass167 r6, AnonymousClass12D r7, C16440t3 r8, C17580vJ r9, AnonymousClass137 r10, C14710pd r11, C17190ug r12) {
        this.A07 = r8;
        this.A0A = r11;
        this.A01 = r2;
        this.A0B = r12;
        this.A04 = r5;
        this.A08 = r9;
        this.A02 = r3;
        this.A09 = r10;
        this.A05 = r6;
        this.A03 = r4;
        this.A06 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r14 == X.C34861kz.A01) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A00(X.C34861kz r14, java.lang.String r15) {
        /*
            r13 = this;
            long r11 = android.os.SystemClock.elapsedRealtime()
            X.1kz r0 = X.C34861kz.A0D
            r5 = 0
            r7 = 1
            if (r14 == r0) goto L_0x000f
            X.1kz r1 = X.C34861kz.A01
            r0 = 0
            if (r14 != r1) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            X.AnonymousClass00B.A0G(r0)
            X.0wP r0 = r13.A03
            boolean r0 = r0.A0A()
            r4 = 0
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber: network_unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.284 r0 = X.AnonymousClass284.A04
        L_0x0023:
            android.util.Pair r4 = android.util.Pair.create(r0, r4)
            return r4
        L_0x0028:
            java.util.concurrent.ConcurrentHashMap r3 = r13.A0D
            java.lang.Object r0 = r3.putIfAbsent(r15, r15)
            if (r0 == 0) goto L_0x0033
            X.284 r0 = X.AnonymousClass284.A08
            goto L_0x0023
        L_0x0033:
            java.lang.String r0 = "sync_sid_query"
            java.lang.String r2 = X.AnonymousClass288.A00(r0)
            X.283 r8 = r13.A02()     // Catch:{ all -> 0x014d }
            X.16O r0 = r13.A02     // Catch:{ all -> 0x014d }
            int r9 = r0.A00()     // Catch:{ all -> 0x014d }
            X.0pd r6 = r13.A0A     // Catch:{ all -> 0x014d }
            r1 = 1892(0x764, float:2.651E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x014d }
            boolean r0 = r6.A0E(r0, r1)     // Catch:{ all -> 0x014d }
            X.2dq r6 = X.C52462dq.A00(r14, r4, r15, r9, r0)     // Catch:{ all -> 0x014d }
            r0 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.Future r8 = r8.A04(r6, r2, r0)     // Catch:{ all -> 0x014d }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x0139, ExecutionException -> 0x012c, InterruptedException -> 0x0110 }
            r8.get(r0, r6)     // Catch:{ TimeoutException -> 0x0139, ExecutionException -> 0x012c, InterruptedException -> 0x0110 }
            java.util.concurrent.ConcurrentHashMap r1 = r13.A0E     // Catch:{ all -> 0x014d }
            java.lang.Object r6 = r1.get(r2)     // Catch:{ all -> 0x014d }
            X.27c r6 = (X.C451127c) r6     // Catch:{ all -> 0x014d }
            if (r6 != 0) goto L_0x008f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x014d }
            r5.<init>()     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber: empty sync result for "
            r5.append(r0)     // Catch:{ all -> 0x014d }
            r5.append(r15)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = " (syncId is "
            r5.append(r0)     // Catch:{ all -> 0x014d }
            r5.append(r2)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x014d }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x014d }
            X.284 r0 = X.AnonymousClass284.A03     // Catch:{ all -> 0x014d }
            android.util.Pair r4 = android.util.Pair.create(r0, r4)     // Catch:{ all -> 0x014d }
            goto L_0x0109
        L_0x008f:
            X.27a[] r8 = r6.A01     // Catch:{ all -> 0x014d }
            int r0 = r8.length     // Catch:{ all -> 0x014d }
            if (r0 != 0) goto L_0x00dc
            X.27e r0 = r6.A00     // Catch:{ all -> 0x014d }
            X.27g r0 = r0.A01     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00c1
            java.lang.Integer r0 = r0.A00     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00c1
            int r5 = r0.intValue()     // Catch:{ all -> 0x014d }
            r0 = 429(0x1ad, float:6.01E-43)
            if (r5 != r0) goto L_0x00c1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x014d }
            r5.<init>()     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber: rate-limit-error "
            r5.append(r0)     // Catch:{ all -> 0x014d }
            r5.append(r15)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x014d }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x014d }
            X.284 r0 = X.AnonymousClass284.A05     // Catch:{ all -> 0x014d }
            android.util.Pair r4 = android.util.Pair.create(r0, r4)     // Catch:{ all -> 0x014d }
            goto L_0x0109
        L_0x00c1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x014d }
            r5.<init>()     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber: no users for "
            r5.append(r0)     // Catch:{ all -> 0x014d }
            r5.append(r15)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x014d }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x014d }
            X.284 r0 = X.AnonymousClass284.A03     // Catch:{ all -> 0x014d }
            android.util.Pair r4 = android.util.Pair.create(r0, r4)     // Catch:{ all -> 0x014d }
            goto L_0x0109
        L_0x00dc:
            r8 = r8[r5]     // Catch:{ all -> 0x014d }
            int r0 = r8.A04     // Catch:{ all -> 0x014d }
            if (r0 != r7) goto L_0x00f4
            X.0sG r4 = r13.A04     // Catch:{ all -> 0x014d }
            com.whatsapp.jid.UserJid r0 = r8.A0C     // Catch:{ all -> 0x014d }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x014d }
            X.0sH r10 = r4.A0A(r0)     // Catch:{ all -> 0x014d }
            X.167 r7 = r13.A05     // Catch:{ all -> 0x014d }
            X.27e r9 = r6.A00     // Catch:{ all -> 0x014d }
            r7.A01(r8, r9, r10, r11)     // Catch:{ all -> 0x014d }
        L_0x00f4:
            java.util.List r0 = r8.A0G     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x0103
            int r0 = r0.size()     // Catch:{ all -> 0x014d }
            if (r0 <= 0) goto L_0x0103
            java.util.List r0 = r8.A0G     // Catch:{ all -> 0x014d }
            r0.get(r5)     // Catch:{ all -> 0x014d }
        L_0x0103:
            X.284 r0 = X.AnonymousClass284.A06     // Catch:{ all -> 0x014d }
            android.util.Pair r4 = android.util.Pair.create(r0, r8)     // Catch:{ all -> 0x014d }
        L_0x0109:
            r3.remove(r15)
            r1.remove(r2)
            return r4
        L_0x0110:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x014d }
            r1.<init>()     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "ContactQuerySync/querySyncPhoneNumber: exception during Query Sync "
            r1.append(r0)     // Catch:{ all -> 0x014d }
            r1.append(r15)     // Catch:{ all -> 0x014d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x014d }
            com.whatsapp.util.Log.e(r0, r5)     // Catch:{ all -> 0x014d }
            X.284 r0 = X.AnonymousClass284.A02     // Catch:{ all -> 0x014d }
            android.util.Pair r4 = android.util.Pair.create(r0, r4)     // Catch:{ all -> 0x014d }
            goto L_0x0144
        L_0x012c:
            r1 = move-exception
            java.lang.String r0 = "querySyncPhoneNumber"
            r13.A03(r0, r1)     // Catch:{ all -> 0x014d }
            X.284 r0 = X.AnonymousClass284.A03     // Catch:{ all -> 0x014d }
            android.util.Pair r4 = android.util.Pair.create(r0, r4)     // Catch:{ all -> 0x014d }
            goto L_0x0144
        L_0x0139:
            java.lang.String r0 = "ContactQuerySyncManager/querySyncPhoneNumber/timeout"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x014d }
            X.284 r0 = X.AnonymousClass284.A03     // Catch:{ all -> 0x014d }
            android.util.Pair r4 = android.util.Pair.create(r0, r4)     // Catch:{ all -> 0x014d }
        L_0x0144:
            r3.remove(r15)
            java.util.concurrent.ConcurrentHashMap r0 = r13.A0E
            r0.remove(r2)
            return r4
        L_0x014d:
            r1 = move-exception
            r3.remove(r15)
            java.util.concurrent.ConcurrentHashMap r0 = r13.A0E
            r0.remove(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23181Au.A00(X.1kz, java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r14 == X.C34861kz.A01) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass284 A01(X.C34861kz r14, com.whatsapp.jid.UserJid r15) {
        /*
            r13 = this;
            long r11 = android.os.SystemClock.elapsedRealtime()
            X.1kz r0 = X.C34861kz.A0D
            r9 = 0
            r4 = 1
            if (r14 == r0) goto L_0x000f
            X.1kz r1 = X.C34861kz.A01
            r0 = 0
            if (r14 != r1) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            X.AnonymousClass00B.A0G(r0)
            X.0wP r0 = r13.A03
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "ContactQuerySyncManager/querySyncJid: network_unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.284 r1 = X.AnonymousClass284.A04
            return r1
        L_0x0023:
            java.util.concurrent.ConcurrentHashMap r3 = r13.A0C
            java.lang.Object r0 = r3.putIfAbsent(r15, r15)
            if (r0 == 0) goto L_0x002e
            X.284 r1 = X.AnonymousClass284.A08
            return r1
        L_0x002e:
            java.lang.String r0 = "sync_sid_query"
            java.lang.String r2 = X.AnonymousClass288.A00(r0)
            X.283 r6 = r13.A02()     // Catch:{ Exception -> 0x00fe }
            r8 = 0
            X.16O r0 = r13.A02     // Catch:{ Exception -> 0x00fe }
            int r7 = r0.A00()     // Catch:{ Exception -> 0x00fe }
            X.0pd r5 = r13.A0A     // Catch:{ Exception -> 0x00fe }
            r1 = 1892(0x764, float:2.651E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ Exception -> 0x00fe }
            boolean r0 = r5.A0E(r0, r1)     // Catch:{ Exception -> 0x00fe }
            X.2dq r5 = X.C52462dq.A00(r14, r15, r8, r7, r0)     // Catch:{ Exception -> 0x00fe }
            r0 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.Future r6 = r6.A04(r5, r2, r0)     // Catch:{ Exception -> 0x00fe }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x00f6, ExecutionException -> 0x00ed }
            r6.get(r0, r5)     // Catch:{ TimeoutException -> 0x00f6, ExecutionException -> 0x00ed }
            java.util.concurrent.ConcurrentHashMap r5 = r13.A0E     // Catch:{ Exception -> 0x00fe }
            java.lang.Object r6 = r5.get(r2)     // Catch:{ Exception -> 0x00fe }
            X.27c r6 = (X.C451127c) r6     // Catch:{ Exception -> 0x00fe }
            if (r6 != 0) goto L_0x0087
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fe }
            r1.<init>()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r0 = "ContactQuerySyncManager/querySyncJid: empty sync result for "
            r1.append(r0)     // Catch:{ Exception -> 0x00fe }
            r1.append(r15)     // Catch:{ Exception -> 0x00fe }
            java.lang.String r0 = " (syncId is "
            r1.append(r0)     // Catch:{ Exception -> 0x00fe }
            r1.append(r2)     // Catch:{ Exception -> 0x00fe }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ Exception -> 0x00fe }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00fe }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x00fe }
            X.284 r1 = X.AnonymousClass284.A03     // Catch:{ Exception -> 0x00fe }
            goto L_0x00e6
        L_0x0087:
            X.27a[] r1 = r6.A01     // Catch:{ Exception -> 0x00fe }
            int r0 = r1.length     // Catch:{ Exception -> 0x00fe }
            if (r0 != 0) goto L_0x00cc
            X.27e r0 = r6.A00     // Catch:{ Exception -> 0x00fe }
            X.27g r0 = r0.A01     // Catch:{ Exception -> 0x00fe }
            if (r0 == 0) goto L_0x00b5
            java.lang.Integer r0 = r0.A00     // Catch:{ Exception -> 0x00fe }
            if (r0 == 0) goto L_0x00b5
            int r1 = r0.intValue()     // Catch:{ Exception -> 0x00fe }
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 != r0) goto L_0x00b5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fe }
            r1.<init>()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r0 = "ContactQuerySyncManager/querySyncJid: rate-limit-error "
            r1.append(r0)     // Catch:{ Exception -> 0x00fe }
            r1.append(r15)     // Catch:{ Exception -> 0x00fe }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00fe }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x00fe }
            X.284 r1 = X.AnonymousClass284.A05     // Catch:{ Exception -> 0x00fe }
            goto L_0x00e6
        L_0x00b5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fe }
            r1.<init>()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r0 = "ContactQuerySyncManager/querySyncJid: no users for "
            r1.append(r0)     // Catch:{ Exception -> 0x00fe }
            r1.append(r15)     // Catch:{ Exception -> 0x00fe }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00fe }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x00fe }
            X.284 r1 = X.AnonymousClass284.A03     // Catch:{ Exception -> 0x00fe }
            goto L_0x00e6
        L_0x00cc:
            r8 = r1[r9]     // Catch:{ Exception -> 0x00fe }
            int r0 = r8.A04     // Catch:{ Exception -> 0x00fe }
            if (r0 != r4) goto L_0x00e4
            X.0sG r1 = r13.A04     // Catch:{ Exception -> 0x00fe }
            com.whatsapp.jid.UserJid r0 = r8.A0C     // Catch:{ Exception -> 0x00fe }
            X.AnonymousClass00B.A06(r0)     // Catch:{ Exception -> 0x00fe }
            X.0sH r10 = r1.A0A(r0)     // Catch:{ Exception -> 0x00fe }
            X.167 r7 = r13.A05     // Catch:{ Exception -> 0x00fe }
            X.27e r9 = r6.A00     // Catch:{ Exception -> 0x00fe }
            r7.A01(r8, r9, r10, r11)     // Catch:{ Exception -> 0x00fe }
        L_0x00e4:
            X.284 r1 = X.AnonymousClass284.A06     // Catch:{ Exception -> 0x00fe }
        L_0x00e6:
            r3.remove(r15)
            r5.remove(r2)
            return r1
        L_0x00ed:
            r1 = move-exception
            java.lang.String r0 = "querySyncJid"
            r13.A03(r0, r1)     // Catch:{ Exception -> 0x00fe }
            X.284 r1 = X.AnonymousClass284.A03     // Catch:{ Exception -> 0x00fe }
            goto L_0x0111
        L_0x00f6:
            java.lang.String r0 = "ContactQuerySyncManager/querySyncJid/timeout"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x00fe }
            X.284 r1 = X.AnonymousClass284.A03     // Catch:{ Exception -> 0x00fe }
            goto L_0x0111
        L_0x00fe:
            r6 = move-exception
            java.lang.String r0 = "ContactQuerySync/querySyncJid/exception thrown"
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x011a }
            X.0so r5 = r13.A01     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "ContactQuerySync/querySyncJid"
            java.lang.String r0 = r6.getMessage()     // Catch:{ all -> 0x011a }
            r5.AcB(r1, r0, r4)     // Catch:{ all -> 0x011a }
            X.284 r1 = X.AnonymousClass284.A02     // Catch:{ all -> 0x011a }
        L_0x0111:
            r3.remove(r15)
            java.util.concurrent.ConcurrentHashMap r0 = r13.A0E
            r0.remove(r2)
            return r1
        L_0x011a:
            r1 = move-exception
            r3.remove(r15)
            java.util.concurrent.ConcurrentHashMap r0 = r13.A0E
            r0.remove(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23181Au.A01(X.1kz, com.whatsapp.jid.UserJid):X.284");
    }

    public final synchronized AnonymousClass283 A02() {
        AnonymousClass283 r0;
        r0 = this.A00;
        if (r0 == null) {
            C14710pd r4 = this.A0A;
            C16300so r1 = this.A01;
            C17190ug r5 = this.A0B;
            r0 = new AnonymousClass283(r1, new C52432dn(this), this.A08, r4, r5);
            this.A00 = r0;
        }
        return r0;
    }

    public final void A03(String str, ExecutionException executionException) {
        if ((executionException.getCause() instanceof RuntimeException) || ((executionException.getCause() instanceof Error) && !(executionException.getCause() instanceof AssertionError) && !(executionException.getCause() instanceof OutOfMemoryError))) {
            C16300so r3 = this.A01;
            StringBuilder sb = new StringBuilder("ContactQuerySync/");
            sb.append(str);
            r3.AcB(sb.toString(), executionException.getMessage(), true);
        }
    }
}
