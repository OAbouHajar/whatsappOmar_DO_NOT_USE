package com.facebook.redex;

public class RunnableRunnableShape0S0700000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    public RunnableRunnableShape0S0700000_I0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i2) {
        this.A07 = i2;
        this.A00 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A04 = obj4;
        this.A06 = obj5;
        this.A03 = obj6;
        this.A05 = obj7;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00ce */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            r3 = r21
            int r0 = r3.A07
            switch(r0) {
                case 0: goto L_0x003d;
                case 1: goto L_0x00fa;
                case 2: goto L_0x0135;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r3.A00
            X.1Ld r5 = (X.C25791Ld) r5
            java.lang.Object r0 = r3.A01
            X.0tm r0 = (X.C16870tm) r0
            java.lang.Object r4 = r3.A02
            X.25W r4 = (X.AnonymousClass25W) r4
            java.lang.Object r7 = r3.A03
            java.lang.Object r8 = r3.A04
            java.lang.Object r9 = r3.A05
            java.lang.Object r11 = r3.A06
            byte[] r0 = r0.A07()
            if (r0 == 0) goto L_0x0032
            int r0 = r0.length
            if (r0 <= 0) goto L_0x0032
            android.graphics.Bitmap r10 = r4.A00()
        L_0x0028:
            r12 = 5
            com.facebook.redex.RunnableRunnableShape0S0500000_I0 r6 = new com.facebook.redex.RunnableRunnableShape0S0500000_I0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.util.List r1 = r5.A06
            monitor-enter(r1)
            goto L_0x0034
        L_0x0032:
            r10 = 0
            goto L_0x0028
        L_0x0034:
            r1.add(r6)     // Catch:{ all -> 0x003a }
            monitor-exit(r1)     // Catch:{ all -> 0x003a }
            goto L_0x0236
        L_0x003a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003a }
            throw r0
        L_0x003d:
            java.lang.String r5 = " (from syncer thread)"
            java.lang.String r6 = "releasing dso store lock for "
            java.lang.String r7 = "rw"
            java.lang.String r4 = "fb-UnpackingSoSource"
            java.lang.String r0 = "starting syncer worker"
            android.util.Log.v(r4, r0)     // Catch:{ all -> 0x00cf }
            java.lang.Object r0 = r3.A02     // Catch:{ all -> 0x00cf }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x00cf }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x00cf }
            r2.<init>(r0, r7)     // Catch:{ all -> 0x00cf }
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x00ca }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x00ca }
            r2.write(r0)     // Catch:{ all -> 0x00ca }
            long r0 = r2.getFilePointer()     // Catch:{ all -> 0x00ca }
            r2.setLength(r0)     // Catch:{ all -> 0x00ca }
            r2.close()     // Catch:{ all -> 0x00cf }
            java.lang.Object r0 = r3.A00     // Catch:{ all -> 0x00cf }
            X.1dk r0 = (X.C31221dk) r0     // Catch:{ all -> 0x00cf }
            java.io.File r8 = r0.A01     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "dso_manifest"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00cf }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x00cf }
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ all -> 0x00cf }
            r9.<init>(r0, r7)     // Catch:{ all -> 0x00cf }
            java.lang.Object r1 = r3.A04     // Catch:{ all -> 0x00c5 }
            X.1eJ r1 = (X.C31511eJ) r1     // Catch:{ all -> 0x00c5 }
            r0 = 1
            r9.writeByte(r0)     // Catch:{ all -> 0x00c5 }
            X.1eL[] r7 = r1.A00     // Catch:{ all -> 0x00c5 }
            int r2 = r7.length     // Catch:{ all -> 0x00c5 }
            r9.writeInt(r2)     // Catch:{ all -> 0x00c5 }
            r1 = 0
        L_0x0087:
            if (r1 >= r2) goto L_0x009a
            r0 = r7[r1]     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x00c5 }
            r9.writeUTF(r0)     // Catch:{ all -> 0x00c5 }
            r0 = r7[r1]     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x00c5 }
            r9.writeUTF(r0)     // Catch:{ all -> 0x00c5 }
            int r1 = r1 + 1
            goto L_0x0087
        L_0x009a:
            r9.close()     // Catch:{ all -> 0x00cf }
            X.C31331dy.A01(r8)     // Catch:{ all -> 0x00cf }
            java.lang.Object r1 = r3.A06     // Catch:{ all -> 0x00cf }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x00cf }
            r0 = 1
            X.C31221dk.A00(r1, r0)     // Catch:{ all -> 0x00cf }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00f3 }
            r0.<init>()     // Catch:{ IOException -> 0x00f3 }
            r0.append(r6)     // Catch:{ IOException -> 0x00f3 }
            r0.append(r8)     // Catch:{ IOException -> 0x00f3 }
            r0.append(r5)     // Catch:{ IOException -> 0x00f3 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x00f3 }
            android.util.Log.v(r4, r0)     // Catch:{ IOException -> 0x00f3 }
            java.lang.Object r0 = r3.A03     // Catch:{ IOException -> 0x00f3 }
            X.1eF r0 = (X.C31471eF) r0     // Catch:{ IOException -> 0x00f3 }
            r0.close()     // Catch:{ IOException -> 0x00f3 }
            return
        L_0x00c5:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00ce }
            goto L_0x00ce
        L_0x00ca:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00f3 }
            r1.<init>()     // Catch:{ IOException -> 0x00f3 }
            r1.append(r6)     // Catch:{ IOException -> 0x00f3 }
            java.lang.Object r0 = r3.A00     // Catch:{ IOException -> 0x00f3 }
            X.1dc r0 = (X.C31161dc) r0     // Catch:{ IOException -> 0x00f3 }
            java.io.File r0 = r0.A01     // Catch:{ IOException -> 0x00f3 }
            r1.append(r0)     // Catch:{ IOException -> 0x00f3 }
            r1.append(r5)     // Catch:{ IOException -> 0x00f3 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x00f3 }
            android.util.Log.v(r4, r0)     // Catch:{ IOException -> 0x00f3 }
            java.lang.Object r0 = r3.A03     // Catch:{ IOException -> 0x00f3 }
            X.1eF r0 = (X.C31471eF) r0     // Catch:{ IOException -> 0x00f3 }
            r0.close()     // Catch:{ IOException -> 0x00f3 }
            throw r2     // Catch:{ IOException -> 0x00f3 }
        L_0x00f3:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00fa:
            java.lang.Object r8 = r3.A00
            com.obwhatsapp.community.CommunityTabViewModel r8 = (com.obwhatsapp.community.CommunityTabViewModel) r8
            java.lang.Object r7 = r3.A01
            X.0tJ r7 = (X.C16590tJ) r7
            java.lang.Object r6 = r3.A02
            X.0tJ r6 = (X.C16590tJ) r6
            java.lang.Object r5 = r3.A03
            X.0tJ r5 = (X.C16590tJ) r5
            java.lang.Object r4 = r3.A04
            X.0tJ r4 = (X.C16590tJ) r4
            java.lang.Object r2 = r3.A05
            X.0tJ r2 = (X.C16590tJ) r2
            java.lang.Object r1 = r3.A06
            X.0tJ r1 = (X.C16590tJ) r1
            X.1dF r0 = r8.A04
            r7.A02(r0)
            X.1ig r0 = r8.A07
            r6.A02(r0)
            X.2Bm r0 = r8.A0F
            r5.A02(r0)
            X.1VD r0 = r8.A0D
            r4.A02(r0)
            X.0xV r0 = r8.A0A
            r2.A02(r0)
            X.1ie r0 = r8.A02
            r1.A02(r0)
            return
        L_0x0135:
            java.lang.Object r12 = r3.A00
            X.0ul r12 = (X.C17240ul) r12
            java.lang.Object r0 = r3.A01
            X.0tq r0 = (X.C16900tq) r0
            java.lang.Object r1 = r3.A02
            X.0uk r1 = (X.C17230uk) r1
            java.lang.Object r2 = r3.A03
            X.0rz r2 = (X.C15860rz) r2
            java.lang.Object r9 = r3.A04
            X.18T r9 = (X.AnonymousClass18T) r9
            java.lang.Object r10 = r3.A05
            X.0so r10 = (X.C16300so) r10
            java.lang.Object r14 = r3.A06
            X.0ug r14 = (X.C17190ug) r14
            r0.A04()
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0245
            java.util.HashSet r20 = new java.util.HashSet
            r20.<init>()
            X.28n r0 = r1.A03
            X.15m r1 = r0.A01
            java.lang.String r0 = "CommunityChatStore/getCommunityChats"
            X.1Zf r7 = new X.1Zf
            r7.<init>((java.lang.String) r0)
            X.0ts r5 = r1.A00
            r0 = 3
            java.util.List r1 = r5.A07(r0)
            int r0 = r1.size()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r8 = r1.iterator()
        L_0x017c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01a8
            java.lang.Object r0 = r8.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            X.0rv r3 = r5.A05(r0)
            if (r3 != 0) goto L_0x01a4
            java.lang.String r4 = "CommunityChatStore/failed to find chatJid by row id: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x017c
        L_0x01a4:
            r6.add(r3)
            goto L_0x017c
        L_0x01a8:
            r7.A01()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            X.01D r0 = r2.A01
            java.lang.Object r3 = r0.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r1 = "pnh_cag_jid_sucessfully_upgraded"
            r0 = 0
            java.lang.String r1 = r3.getString(r1, r0)
            if (r1 == 0) goto L_0x01d9
            java.lang.String r0 = ","
            java.lang.String[] r4 = r1.split(r0)
            int r3 = r4.length
            r1 = 0
        L_0x01c9:
            if (r1 >= r3) goto L_0x01d9
            r0 = r4[r1]
            X.0sL r0 = X.C16050sL.A05(r0)
            if (r0 == 0) goto L_0x01d6
            r5.add(r0)
        L_0x01d6:
            int r1 = r1 + 1
            goto L_0x01c9
        L_0x01d9:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r6.iterator()
        L_0x01e2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01fe
            java.lang.Object r1 = r3.next()
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            boolean r0 = X.C16030sJ.A0N(r1)
            if (r0 == 0) goto L_0x01e2
            boolean r0 = r5.contains(r1)
            if (r0 != 0) goto L_0x01e2
            r4.add(r1)
            goto L_0x01e2
        L_0x01fe:
            boolean r0 = r4.isEmpty()
            r3 = r0 ^ 1
            android.content.SharedPreferences$Editor r1 = r2.A0K()
            java.lang.String r0 = "pnh_cag_upgrade_incomplete"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r3)
            r0.apply()
            java.util.Iterator r1 = r4.iterator()
        L_0x0215:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0245
            java.lang.Object r13 = r1.next()
            X.0sL r13 = (X.C16050sL) r13
            X.2Bn r11 = new X.2Bn
            r15 = r11
            r16 = r2
            r17 = r12
            r18 = r13
            r19 = r4
            r15.<init>(r16, r17, r18, r19, r20)
            r12.A01 = r11
            r15 = 3
            r9.A00(r10, r11, r12, r13, r14, r15)
            goto L_0x0215
        L_0x0236:
            android.os.Handler r2 = r5.A01
            r1 = 8
            com.facebook.redex.RunnableRunnableShape16S0100000_I0_15 r0 = new com.facebook.redex.RunnableRunnableShape16S0100000_I0_15
            r0.<init>(r5, r1)
            r2.post(r0)
            r4.A01()
        L_0x0245:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0700000_I0.run():void");
    }
}
