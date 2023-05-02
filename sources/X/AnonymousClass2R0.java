package X;

/* renamed from: X.2R0  reason: invalid class name */
public final class AnonymousClass2R0 implements C19550yc {
    public final /* synthetic */ C16300so A00;
    public final /* synthetic */ AnonymousClass18U A01;
    public final /* synthetic */ C34421kE A02;

    public AnonymousClass2R0(C16300so r1, AnonymousClass18U r2, C34421kE r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void APb(String str) {
        C18450wi.A0H(str, 0);
        this.A02.A01(new C802543d(str));
    }

    public void AQe(C28371Vv r3, String str) {
        C18450wi.A0H(str, 0);
        C18450wi.A0H(r3, 1);
        this.A02.A01(new C48802Pe(r3, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00db, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.C41191vO.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00df, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.C41191vO.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f7, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AYG(X.C28371Vv r14, java.lang.String r15) {
        /*
            r13 = this;
            r0 = 1
            X.C18450wi.A0H(r14, r0)
            java.lang.Class<X.0sL> r1 = X.C16050sL.class
            X.0so r4 = r13.A00
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r8 = r14.A0G(r4, r1, r0)
            X.0sL r8 = (X.C16050sL) r8
            java.lang.String r0 = "membership_approval_requests"
            X.1Vv r1 = r14.A0K(r0)
            java.lang.String r0 = "membership_approval_request"
            java.util.List r1 = r1.A0O(r0)
            X.C18450wi.A0B(r1)
            r0 = 10
            int r0 = X.AnonymousClass1J9.A0M(r1, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x002e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r5 = r6.next()
            X.1Vv r5 = (X.C28371Vv) r5
            java.lang.String r0 = "request_method"
            java.lang.String r1 = r5.A0M(r0)
            java.lang.String r10 = "invite_link"
            boolean r0 = r10.equals(r1)
            if (r0 != 0) goto L_0x005c
            java.lang.String r10 = "linked_group_join"
            boolean r0 = r10.equals(r1)
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "GetAllGroupMembershipApprovalRequestsApiHandler/onSuccess/incorrect membership_approval_request.requestMethod="
            java.lang.String r1 = X.C18450wi.A06(r0, r1)
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x005c:
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r9 = r5.A0G(r4, r1, r0)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            r0 = 0
            java.lang.String r2 = "request_time"
            long r11 = r5.A0D(r2, r0)
            X.2BN r7 = new X.2BN
            r7.<init>(r8, r9, r10, r11)
            r3.add(r7)
            goto L_0x002e
        L_0x0077:
            X.18U r10 = r13.A01
            r10.A02(r8)
            r9 = 0
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00fc
            X.11X r0 = r10.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f8 }
            X.0tf r7 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f8 }
            r11 = 0
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x00f1 }
            if (r0 != 0) goto L_0x00e0
            java.lang.Object r0 = r3.get(r9)     // Catch:{ all -> 0x00f1 }
            X.2BN r0 = (X.AnonymousClass2BN) r0     // Catch:{ all -> 0x00f1 }
            X.0sL r8 = r0.A05     // Catch:{ all -> 0x00f1 }
            X.1cj r6 = r7.A00()     // Catch:{ all -> 0x00f1 }
            java.util.Iterator r12 = r3.iterator()     // Catch:{ all -> 0x00d9 }
        L_0x00a0:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00d9 }
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r5 = r12.next()     // Catch:{ all -> 0x00d9 }
            X.2BN r5 = (X.AnonymousClass2BN) r5     // Catch:{ all -> 0x00d9 }
            X.0sL r4 = r5.A05     // Catch:{ all -> 0x00d9 }
            boolean r2 = X.C18450wi.A0R(r8, r4)     // Catch:{ all -> 0x00d9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d9 }
            r1.<init>()     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = "Not all requests given to bulkInsertGroupMembershipApprovalRequests belong to the same group. Mismatched GroupJid1 : "
            r1.append(r0)     // Catch:{ all -> 0x00d9 }
            r1.append(r8)     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = ",  GroupJid2: "
            r1.append(r0)     // Catch:{ all -> 0x00d9 }
            r1.append(r4)     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d9 }
            X.AnonymousClass00B.A0B(r0, r2)     // Catch:{ all -> 0x00d9 }
            X.AnonymousClass18U.A00(r5, r7)     // Catch:{ all -> 0x00d9 }
            goto L_0x00a0
        L_0x00d2:
            r6.A00()     // Catch:{ all -> 0x00d9 }
            r6.close()     // Catch:{ all -> 0x00f1 }
            goto L_0x00e0
        L_0x00d9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00db }
        L_0x00db:
            r0 = move-exception
            X.C41191vO.A00(r6, r1)     // Catch:{ all -> 0x00f1 }
            throw r0     // Catch:{ all -> 0x00f1 }
        L_0x00e0:
            X.C41191vO.A00(r7, r11)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f8 }
            X.18N r1 = r10.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f8 }
            java.lang.Object r0 = r3.get(r9)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f8 }
            X.2BN r0 = (X.AnonymousClass2BN) r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f8 }
            X.0sL r0 = r0.A05     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f8 }
            r1.A04(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f8 }
            goto L_0x00fc
        L_0x00f1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r0 = move-exception
            X.C41191vO.A00(r7, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f8 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00f8 }
        L_0x00f8:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x00fc:
            X.1kE r1 = r13.A02
            r0 = 0
            r1.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2R0.AYG(X.1Vv, java.lang.String):void");
    }
}
