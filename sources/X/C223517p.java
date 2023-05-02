package X;

/* renamed from: X.17p  reason: invalid class name and case insensitive filesystem */
public class C223517p {
    public final C216314v A00;
    public final C16900tq A01;

    public C223517p(C216314v r1, C16900tq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A00(X.C38771rO r19) {
        /*
            r18 = this;
            r6 = r19
            long r1 = r6.A13
            r16 = -1
            int r0 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0153
            r5 = 0
            r4 = r18
            X.0tq r3 = r4.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x014c, Error | RuntimeException -> 0x0147 }
            X.0tf r2 = r3.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x014c, Error | RuntimeException -> 0x0147 }
            java.util.List r0 = r6.A13()     // Catch:{ all -> 0x0142 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x0142 }
        L_0x001b:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x013e
            java.lang.Object r7 = r15.next()     // Catch:{ all -> 0x0142 }
            X.1po r7 = (X.C37831po) r7     // Catch:{ all -> 0x0142 }
            boolean r0 = r7.A0D()     // Catch:{ all -> 0x0142 }
            if (r0 == 0) goto L_0x001b
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0142 }
            r8.<init>()     // Catch:{ all -> 0x0142 }
            long r9 = r7.A02()     // Catch:{ all -> 0x0142 }
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0047
            java.lang.String r9 = "_id"
            long r0 = r7.A02()     // Catch:{ all -> 0x0142 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0142 }
            r8.put(r9, r0)     // Catch:{ all -> 0x0142 }
        L_0x0047:
            java.lang.String r9 = "message_row_id"
            long r0 = r6.A13     // Catch:{ all -> 0x0142 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0142 }
            r8.put(r9, r0)     // Catch:{ all -> 0x0142 }
            java.lang.String r9 = "timestamp"
            long r0 = r7.A0A     // Catch:{ all -> 0x0142 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0142 }
            r8.put(r9, r0)     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = "video_call"
            boolean r0 = r7.A0I     // Catch:{ all -> 0x0142 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0142 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0142 }
            java.lang.String r9 = "group_jid_row_id"
            com.whatsapp.jid.GroupJid r1 = r7.A04     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x012d
            X.14v r0 = r4.A00     // Catch:{ all -> 0x0142 }
            long r0 = r0.A01(r1)     // Catch:{ all -> 0x0142 }
        L_0x0076:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0142 }
            r8.put(r9, r0)     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = "is_joinable_group_call"
            boolean r0 = r7.A0H     // Catch:{ all -> 0x0142 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0142 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0142 }
            java.lang.String r1 = "is_dnd_mode_on"
            boolean r0 = r7.A09     // Catch:{ all -> 0x0142 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0142 }
            r8.put(r1, r0)     // Catch:{ all -> 0x0142 }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x0142 }
            java.lang.String r0 = "missed_call_logs"
            long r0 = r1.A04(r8, r0)     // Catch:{ all -> 0x0142 }
            r7.A06(r0)     // Catch:{ all -> 0x0142 }
            r7.A05()     // Catch:{ all -> 0x0142 }
            long r8 = r7.A02()     // Catch:{ all -> 0x0142 }
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0131
            X.0tf r8 = r3.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0125, Error | RuntimeException -> 0x0139 }
            java.util.List r0 = r7.A04()     // Catch:{ all -> 0x0120 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0120 }
        L_0x00b5:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x0119
            java.lang.Object r13 = r14.next()     // Catch:{ all -> 0x0120 }
            r9 = r13
            X.1r1 r9 = (X.C38581r1) r9     // Catch:{ all -> 0x0120 }
            boolean r0 = r9.A01()     // Catch:{ all -> 0x0120 }
            if (r0 == 0) goto L_0x00b5
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0120 }
            r10.<init>()     // Catch:{ all -> 0x0120 }
            java.lang.String r11 = "call_logs_row_id"
            long r0 = r7.A02()     // Catch:{ all -> 0x0120 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0120 }
            r10.put(r11, r0)     // Catch:{ all -> 0x0120 }
            long r11 = r9.A00()     // Catch:{ all -> 0x0120 }
            int r0 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x00ef
            java.lang.String r11 = "_id"
            long r0 = r9.A00()     // Catch:{ all -> 0x0120 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0120 }
            r10.put(r11, r0)     // Catch:{ all -> 0x0120 }
        L_0x00ef:
            java.lang.String r1 = "jid"
            com.whatsapp.jid.UserJid r0 = r9.A02     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x0120 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = "call_result"
            int r0 = r9.A00     // Catch:{ all -> 0x0120 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0120 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0120 }
            X.0tg r1 = r8.A02     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = "missed_call_log_participant"
            long r0 = r1.A04(r10, r0)     // Catch:{ all -> 0x0120 }
            monitor-enter(r13)     // Catch:{ all -> 0x0120 }
            r9.A01 = r0     // Catch:{ all -> 0x0116 }
            monitor-exit(r13)     // Catch:{ all -> 0x0120 }
            monitor-enter(r13)     // Catch:{ all -> 0x0120 }
            r9.A03 = r5     // Catch:{ all -> 0x0116 }
            monitor-exit(r13)     // Catch:{ all -> 0x0120 }
            goto L_0x00b5
        L_0x0116:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0120 }
            throw r0     // Catch:{ all -> 0x0120 }
        L_0x0119:
            monitor-enter(r7)     // Catch:{ all -> 0x0120 }
            monitor-exit(r7)     // Catch:{ all -> 0x0120 }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0125, Error | RuntimeException -> 0x0139 }
            goto L_0x001b
        L_0x0120:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0124 }
        L_0x0124:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0125, Error | RuntimeException -> 0x0139 }
        L_0x0125:
            r1 = move-exception
            java.lang.String r0 = "MissedCallLogStore/insertOfUpdateCallLogParticipants"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0142 }
            goto L_0x001b
        L_0x012d:
            r0 = 0
            goto L_0x0076
        L_0x0131:
            java.lang.String r0 = "CallLog row_id is not set"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0142 }
            r1.<init>(r0)     // Catch:{ all -> 0x0142 }
            goto L_0x013d
        L_0x0139:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0142 }
        L_0x013d:
            throw r1     // Catch:{ all -> 0x0142 }
        L_0x013e:
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x014c, Error | RuntimeException -> 0x0147 }
            return
        L_0x0142:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0146 }
        L_0x0146:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x014c, Error | RuntimeException -> 0x0147 }
        L_0x0147:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x014c:
            r1 = move-exception
            java.lang.String r0 = "MissedCallLogStore/insertOfUpdateCallLogs"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0153:
            java.lang.String r1 = "message.row_id is not set"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C223517p.A00(X.1rO):void");
    }
}
