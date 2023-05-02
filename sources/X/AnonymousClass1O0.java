package X;

/* renamed from: X.1O0  reason: invalid class name */
public class AnonymousClass1O0 implements C23541Cj {
    public final AnonymousClass156 A00;
    public final AnonymousClass12G A01;
    public final C17030uP A02;

    public AnonymousClass1O0(AnonymousClass156 r1, AnonymousClass12G r2, C17030uP r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0080 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void APJ() {
        /*
            r12 = this;
            X.0uP r0 = r12.A02
            X.AnonymousClass00B.A00()
            java.lang.Object r5 = r0.A09
            monitor-enter(r5)
            X.18c r2 = r0.A05     // Catch:{ all -> 0x00ed }
            X.0s5 r1 = r0.A02     // Catch:{ all -> 0x00ed }
            X.0tC r0 = X.C15910s6.A26     // Catch:{ all -> 0x00ed }
            int r10 = r1.A02(r0)     // Catch:{ all -> 0x00ed }
            X.11X r0 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0041 }
            X.0tf r8 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0041 }
            java.lang.String r9 = "wa_vnames"
            java.lang.String r7 = "identity_unconfirmed_since > ? AND identity_unconfirmed_since < ?"
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x003c }
            r1 = 0
            java.lang.String r0 = "0"
            r6[r1] = r0     // Catch:{ all -> 0x003c }
            r4 = 1
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003c }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            long r0 = (long) r10     // Catch:{ all -> 0x003c }
            long r2 = r2 - r0
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x003c }
            r6[r4] = r0     // Catch:{ all -> 0x003c }
            X.AnonymousClass15L.A02(r8, r9, r7, r6)     // Catch:{ all -> 0x003c }
            r8.close()     // Catch:{ IllegalArgumentException -> 0x0041 }
            goto L_0x0047
        L_0x003c:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0041 }
        L_0x0041:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to delete stale vnames"
            X.AnonymousClass00B.A09(r0, r1)     // Catch:{ all -> 0x00ed }
        L_0x0047:
            monitor-exit(r5)     // Catch:{ all -> 0x00ed }
            X.156 r0 = r12.A00
            X.2DZ r1 = r0.A00
            r0 = 1
            X.1Zf r9 = new X.1Zf
            r9.<init>((boolean) r0)
            r9.A03()
            r8 = 0
            X.11X r0 = r1.A00     // Catch:{ IllegalArgumentException -> 0x0081 }
            X.0tf r7 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0081 }
            java.lang.String r6 = "wa_last_entry_point"
            java.lang.String r5 = "entry_point_time <= ?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x007c }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007c }
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r2 = r2 - r0
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x007c }
            r4[r8] = r0     // Catch:{ all -> 0x007c }
            X.AnonymousClass15L.A02(r7, r6, r5, r4)     // Catch:{ all -> 0x007c }
            r7.close()     // Catch:{ IllegalArgumentException -> 0x0081 }
            r9.A00()
            goto L_0x0087
        L_0x007c:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0080 }
        L_0x0080:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0081 }
        L_0x0081:
            r1 = move-exception
            java.lang.String r0 = "deleteOldChatEntryPointLogs/unable to delete old chat entry points "
            X.AnonymousClass00B.A09(r0, r1)
        L_0x0087:
            X.12G r5 = r12.A01
            X.0pd r4 = r5.A03
            r0 = 865(0x361, float:1.212E-42)
            X.0tM r1 = X.C16620tM.A02
            int r0 = r4.A03(r1, r0)
            long r2 = (long) r0
            r0 = 909(0x38d, float:1.274E-42)
            int r0 = r4.A03(r1, r0)
            long r0 = (long) r0
            long r10 = r5.A02(r2, r0)
            long r8 = r5.A01()
            X.23f r0 = r5.A01
            X.11X r7 = r0.A00
            X.0tf r6 = r7.A02()
            java.lang.String r3 = "wa_trusted_contacts"
            java.lang.String r2 = "incoming_tc_token_timestamp< ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00e8 }
            r4 = 0
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x00e8 }
            r1[r4] = r0     // Catch:{ all -> 0x00e8 }
            X.AnonymousClass15L.A02(r6, r3, r2, r1)     // Catch:{ all -> 0x00e8 }
            r6.close()
            X.0tf r6 = r7.A02()
            java.lang.String r3 = "wa_trusted_contacts_send"
            java.lang.String r2 = "sent_tc_token_timestamp< ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x00e8 }
            r1[r4] = r0     // Catch:{ all -> 0x00e8 }
            long r3 = X.AnonymousClass15L.A02(r6, r3, r2, r1)     // Catch:{ all -> 0x00e8 }
            r6.close()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e7
            java.util.Map r0 = r5.A06()
            r0.clear()
        L_0x00e7:
            return
        L_0x00e8:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            throw r0
        L_0x00ed:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ed }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1O0.APJ():void");
    }

    public /* synthetic */ void APK() {
    }
}
