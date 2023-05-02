package com.facebook.redex;

public class RunnableRunnableShape6S0200000_I0_4 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape6S0200000_I0_4(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:160|161|168|169|170|171) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
        r0 = new java.lang.StringBuilder("getKeyForEncryptedBackupWithFuture/received/received/error ");
        r0.append(r2);
        com.whatsapp.util.Log.w(r0.toString());
        r0 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ae, code lost:
        r3.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b2, code lost:
        r0 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x066b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x066c, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x069f, code lost:
        r1.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x06a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x06ed, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06ee, code lost:
        com.whatsapp.util.Log.e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x06f1, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x06f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x06f3, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r0 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x074b, code lost:
        r1.A0A(r2, (java.util.Map) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x074f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0109, code lost:
        r2.post(new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4(r4, r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0111, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x02bc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x043a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:170:0x043f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:214:0x0503 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x01eb */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x06ed A[ExcHandler: Error | RuntimeException (r1v5 'e' java.lang.Throwable A[CUSTOM_DECLARE])] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:80:0x01e0=Splitter:B:80:0x01e0, B:90:0x01eb=Splitter:B:90:0x01eb} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r3 = r16
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x0735;
                case 1: goto L_0x0029;
                case 2: goto L_0x003a;
                case 3: goto L_0x0044;
                case 4: goto L_0x0070;
                case 5: goto L_0x00b5;
                case 6: goto L_0x00cc;
                case 7: goto L_0x00d8;
                case 8: goto L_0x00e4;
                case 9: goto L_0x0007;
                case 10: goto L_0x00f1;
                case 11: goto L_0x00fd;
                case 12: goto L_0x0007;
                case 13: goto L_0x0007;
                case 14: goto L_0x0112;
                case 15: goto L_0x0175;
                case 16: goto L_0x018b;
                case 17: goto L_0x01f4;
                case 18: goto L_0x0202;
                case 19: goto L_0x0210;
                case 20: goto L_0x0238;
                case 21: goto L_0x0248;
                case 22: goto L_0x0254;
                case 23: goto L_0x0262;
                case 24: goto L_0x0456;
                case 25: goto L_0x0509;
                case 26: goto L_0x0740;
                case 27: goto L_0x0538;
                case 28: goto L_0x0538;
                case 29: goto L_0x0549;
                case 30: goto L_0x0559;
                case 31: goto L_0x0570;
                case 32: goto L_0x0589;
                case 33: goto L_0x059c;
                case 34: goto L_0x05ad;
                case 35: goto L_0x05be;
                case 36: goto L_0x05ce;
                case 37: goto L_0x05f8;
                case 38: goto L_0x0609;
                case 39: goto L_0x062f;
                case 40: goto L_0x0641;
                case 41: goto L_0x0673;
                case 42: goto L_0x0682;
                case 43: goto L_0x0691;
                case 44: goto L_0x06a3;
                case 45: goto L_0x06b1;
                case 46: goto L_0x06c6;
                case 47: goto L_0x06fc;
                case 48: goto L_0x070c;
                case 49: goto L_0x0741;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A00
            X.1D0 r0 = (X.AnonymousClass1D0) r0
            java.lang.Object r2 = r3.A01
            X.1po r2 = (X.C37831po) r2
            X.1SP r0 = r0.A0L
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0019:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0740
            java.lang.Object r0 = r1.next()
            X.5Sk r0 = (X.C109505Sk) r0
            r0.ANu(r2)
            goto L_0x0019
        L_0x0029:
            java.lang.Object r1 = r3.A00
            X.0y8 r1 = (X.C19260y8) r1
            java.lang.Object r0 = r3.A01
            X.1po r0 = (X.C37831po) r0
            X.1lE r0 = r0.A0C
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0740
            X.1GG r0 = r1.A00
            goto L_0x0040
        L_0x003a:
            java.lang.Object r0 = r3.A00
            X.0y8 r0 = (X.C19260y8) r0
            X.1GG r0 = r0.A00
        L_0x0040:
            r0.A00()
            return
        L_0x0044:
            java.lang.Object r0 = r3.A00
            X.0xG r0 = (X.C18790xG) r0
            java.lang.Object r3 = r3.A01
            X.1kE r3 = (X.C34421kE) r3
            X.0xF r0 = r0.A01
            java.util.HashMap r1 = r0.A00
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x005d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r0 = r1.next()
            X.1uV r0 = (X.C40671uV) r0
            int r2 = r0.A00
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 < r0) goto L_0x005d
            goto L_0x009b
        L_0x0070:
            java.lang.Object r0 = r3.A00
            X.0xG r0 = (X.C18790xG) r0
            java.lang.Object r3 = r3.A01
            X.1kE r3 = (X.C34421kE) r3
            X.0xF r0 = r0.A01
            java.util.HashMap r1 = r0.A00
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0089:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r0 = r1.next()
            X.1uV r0 = (X.C40671uV) r0
            int r2 = r0.A00
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 < r0) goto L_0x0089
        L_0x009b:
            java.lang.String r1 = "getKeyForEncryptedBackupWithFuture/received/received/error "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L_0x00ae:
            r3.A02(r0)
            return
        L_0x00b2:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x00ae
        L_0x00b5:
            java.lang.Object r0 = r3.A00
            X.0xG r0 = (X.C18790xG) r0
            java.lang.Object r2 = r3.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            X.0xF r0 = r0.A01
            java.util.HashMap r0 = r0.A00
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L_0x0740
            r2.run()
            return
        L_0x00cc:
            java.lang.Object r1 = r3.A00
            X.1D0 r1 = (X.AnonymousClass1D0) r1
            java.lang.Object r0 = r3.A01
            X.1lE r0 = (X.C35011lE) r0
            r1.A07(r0)
            return
        L_0x00d8:
            java.lang.Object r1 = r3.A00
            X.1D0 r1 = (X.AnonymousClass1D0) r1
            java.lang.Object r0 = r3.A01
            X.1po r0 = (X.C37831po) r0
            r1.A0A(r0)
            return
        L_0x00e4:
            java.lang.Object r4 = r3.A00
            X.1D0 r4 = (X.AnonymousClass1D0) r4
            java.lang.Object r3 = r3.A01
            X.17E r0 = r4.A0B
            android.os.Handler r2 = r0.A02
            r1 = 12
            goto L_0x0109
        L_0x00f1:
            java.lang.Object r1 = r3.A00
            X.1D0 r1 = (X.AnonymousClass1D0) r1
            java.lang.Object r0 = r3.A01
            X.1po r0 = (X.C37831po) r0
            r1.A0B(r0)
            return
        L_0x00fd:
            java.lang.Object r4 = r3.A00
            X.1D0 r4 = (X.AnonymousClass1D0) r4
            java.lang.Object r3 = r3.A01
            X.17E r0 = r4.A0B
            android.os.Handler r2 = r0.A02
            r1 = 9
        L_0x0109:
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r0.<init>(r4, r1, r3)
            r2.post(r0)
            return
        L_0x0112:
            java.lang.Object r6 = r3.A00
            X.1D0 r6 = (X.AnonymousClass1D0) r6
            java.lang.Object r5 = r3.A01
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r6.A0M
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r3.writeLock()
            r0.lock()
            java.util.Iterator r7 = r5.iterator()     // Catch:{ all -> 0x016c }
        L_0x012c:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x0157
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x016c }
            X.1po r2 = (X.C37831po) r2     // Catch:{ all -> 0x016c }
            boolean r0 = r2.A0E     // Catch:{ all -> 0x016c }
            if (r0 != 0) goto L_0x014b
            X.1r3 r0 = r2.A05     // Catch:{ all -> 0x016c }
            boolean r0 = r0 instanceof X.C38761rN     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x0151
            X.199 r1 = r6.A07     // Catch:{ all -> 0x016c }
            X.1po r0 = X.AnonymousClass1D0.A00(r2)     // Catch:{ all -> 0x016c }
            r1.A04(r0)     // Catch:{ all -> 0x016c }
        L_0x014b:
            X.2ED r0 = r6.A00     // Catch:{ all -> 0x016c }
            r0.A01(r2)     // Catch:{ all -> 0x016c }
            goto L_0x012c
        L_0x0151:
            X.199 r0 = r6.A07     // Catch:{ all -> 0x016c }
            r0.A04(r2)     // Catch:{ all -> 0x016c }
            goto L_0x014b
        L_0x0157:
            X.17E r0 = r6.A0B     // Catch:{ all -> 0x016c }
            android.os.Handler r2 = r0.A01     // Catch:{ all -> 0x016c }
            r1 = 1
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1     // Catch:{ all -> 0x016c }
            r0.<init>(r6, r4, r5, r1)     // Catch:{ all -> 0x016c }
            r2.post(r0)     // Catch:{ all -> 0x016c }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r3.writeLock()
            r0.unlock()
            return
        L_0x016c:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r3.writeLock()
            r0.unlock()
            throw r1
        L_0x0175:
            java.lang.Object r2 = r3.A00
            X.1Rr r2 = (X.C27421Rr) r2
            java.lang.Object r1 = r3.A01
            X.0rx r1 = (X.C15840rx) r1
            X.0ts r0 = r2.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x0183, Error | RuntimeException -> 0x06ed }
            r0.A09(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0183, Error | RuntimeException -> 0x06ed }
            return
        L_0x0183:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r2.A04
            goto L_0x06f8
        L_0x018b:
            java.lang.Object r0 = r3.A00
            X.0xS r0 = (X.C18910xS) r0
            java.lang.Object r7 = r3.A01
            X.0rx r7 = (X.C15840rx) r7
            X.0ts r5 = r0.A09
            java.lang.String r1 = "msgstore/reset-show-group-description "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            X.0rv r6 = r7.A0i
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tq r0 = r5.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ec, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
            X.0tf r4 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ec, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
            monitor-enter(r7)     // Catch:{ all -> 0x01e7 }
            r0 = 2
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x01e4 }
            r3.<init>(r0)     // Catch:{ all -> 0x01e4 }
            java.lang.String r2 = "show_group_description"
            boolean r1 = r7.A0h     // Catch:{ all -> 0x01e4 }
            r0 = 0
            if (r1 == 0) goto L_0x01be
            r0 = 1
        L_0x01be:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e4 }
            r3.put(r2, r0)     // Catch:{ all -> 0x01e4 }
            monitor-exit(r7)     // Catch:{ all -> 0x01e7 }
            int r0 = r5.A00(r3, r6)     // Catch:{ all -> 0x01e7 }
            if (r0 != 0) goto L_0x01e0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e7 }
            r1.<init>()     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = "msgstore/reset-show-group-description/did not update "
            r1.append(r0)     // Catch:{ all -> 0x01e7 }
            r1.append(r6)     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01e7 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01e7 }
        L_0x01e0:
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ec, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
            return
        L_0x01e4:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01e7 }
            throw r0     // Catch:{ all -> 0x01e7 }
        L_0x01e7:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x01eb }
        L_0x01eb:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x01ec, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
        L_0x01ec:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r5.A03
            goto L_0x06f8
        L_0x01f4:
            java.lang.Object r0 = r3.A00
            X.0xS r0 = (X.C18910xS) r0
            java.lang.Object r1 = r3.A01
            X.0rx r1 = (X.C15840rx) r1
            X.0ts r0 = r0.A09
            r0.A0D(r1)
            return
        L_0x0202:
            java.lang.Object r0 = r3.A00
            X.0xS r0 = (X.C18910xS) r0
            java.lang.Object r1 = r3.A01
            X.0rv r1 = (X.C15830rv) r1
            X.17Z r0 = r0.A03
            r0.A01(r1)
            return
        L_0x0210:
            java.lang.Object r0 = r3.A00
            X.0xS r0 = (X.C18910xS) r0
            java.lang.Object r2 = r3.A01
            X.0rv r2 = (X.C15830rv) r2
            X.17Z r1 = r0.A03
            r0 = 0
            r1.A03(r2, r0)
            X.127 r0 = r1.A02
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0228:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0740
            java.lang.Object r0 = r1.next()
            X.1ug r0 = (X.C40781ug) r0
            r0.A00(r2)
            goto L_0x0228
        L_0x0238:
            java.lang.Object r0 = r3.A00
            X.0xS r0 = (X.C18910xS) r0
            java.lang.Object r3 = r3.A01
            X.0rv r3 = (X.C15830rv) r3
            X.17Z r2 = r0.A03
            r1 = 0
            r0 = 0
            r2.A02(r3, r1, r0)
            return
        L_0x0248:
            java.lang.Object r0 = r3.A00
            X.0t6 r0 = (X.C16460t6) r0
            java.lang.Object r2 = r3.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.0xq r1 = r0.A0r
            goto L_0x074b
        L_0x0254:
            java.lang.Object r0 = r3.A00
            X.0t6 r0 = (X.C16460t6) r0
            java.lang.Object r1 = r3.A01
            X.0rv r1 = (X.C15830rv) r1
            X.0xq r0 = r0.A0r
            r0.A04(r1)
            return
        L_0x0262:
            java.lang.Object r9 = r3.A00
            X.0t6 r9 = (X.C16460t6) r9
            java.lang.Object r7 = r3.A01
            X.0tZ r7 = (X.C16740tZ) r7
            X.17q r6 = r9.A16
            X.0tZ r8 = r7.A0D()
            r14 = 0
            if (r8 == 0) goto L_0x0740
            r5 = 1
            X.0tq r0 = r6.A0C     // Catch:{ IOException -> 0x0440 }
            X.0tf r4 = r0.A02()     // Catch:{ IOException -> 0x0440 }
            X.1cj r13 = r4.A00()     // Catch:{ all -> 0x043b }
            r0.A04()     // Catch:{ all -> 0x0436 }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x0436 }
            boolean r0 = r0.A0D(r4)     // Catch:{ all -> 0x0436 }
            if (r0 == 0) goto L_0x0402
            long r0 = r7.A0F     // Catch:{ all -> 0x0436 }
            r10 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x02c0
            X.0tg r10 = r4.A02     // Catch:{ all -> 0x0436 }
            java.lang.String r3 = "SELECT quoted_row_id FROM messages WHERE _id = ?"
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ all -> 0x0436 }
            long r0 = r7.A13     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0436 }
            r2[r14] = r0     // Catch:{ all -> 0x0436 }
            android.database.Cursor r2 = r10.A08(r3, r2)     // Catch:{ all -> 0x0436 }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x02b6 }
            if (r0 == 0) goto L_0x02bd
            java.lang.String r0 = "quoted_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x02b6 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x02b6 }
            r7.A0F = r0     // Catch:{ all -> 0x02b6 }
            goto L_0x02bd
        L_0x02b6:
            r0 = move-exception
            if (r2 == 0) goto L_0x02bc
            r2.close()     // Catch:{ all -> 0x02bc }
        L_0x02bc:
            throw r0     // Catch:{ all -> 0x0436 }
        L_0x02bd:
            r2.close()     // Catch:{ all -> 0x0436 }
        L_0x02c0:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0436 }
            r2.<init>()     // Catch:{ all -> 0x0436 }
            X.0sc r3 = r6.A01     // Catch:{ all -> 0x0436 }
            int r0 = r8.A0C     // Catch:{ all -> 0x0436 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "status"
            r2.put(r0, r1)     // Catch:{ all -> 0x0436 }
            boolean r1 = r8.A0t     // Catch:{ all -> 0x0436 }
            r0 = 0
            if (r1 == 0) goto L_0x02d9
            r0 = 2
        L_0x02d9:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "needs_push"
            r2.put(r0, r1)     // Catch:{ all -> 0x0436 }
            X.C38611r4.A02(r2, r8)     // Catch:{ all -> 0x0436 }
            java.lang.String r1 = r8.A0O()     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "media_url"
            X.C38611r4.A04(r2, r0, r1)     // Catch:{ all -> 0x0436 }
            java.lang.String r1 = r8.A0M()     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "media_mime_type"
            X.C38611r4.A04(r2, r0, r1)     // Catch:{ all -> 0x0436 }
            byte r0 = r8.A10     // Catch:{ all -> 0x0436 }
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "media_wa_type"
            r2.put(r0, r1)     // Catch:{ all -> 0x0436 }
            long r0 = r8.A09()     // Catch:{ all -> 0x0436 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "media_size"
            r2.put(r0, r1)     // Catch:{ all -> 0x0436 }
            java.lang.String r1 = r8.A0N()     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "media_name"
            X.C38611r4.A04(r2, r0, r1)     // Catch:{ all -> 0x0436 }
            java.lang.String r1 = r8.A0J()     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "media_caption"
            X.C38611r4.A04(r2, r0, r1)     // Catch:{ all -> 0x0436 }
            java.lang.String r1 = r8.A0L()     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "media_hash"
            X.C38611r4.A04(r2, r0, r1)     // Catch:{ all -> 0x0436 }
            int r0 = r8.A04()     // Catch:{ all -> 0x0436 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "media_duration"
            r2.put(r0, r1)     // Catch:{ all -> 0x0436 }
            int r0 = r8.A08     // Catch:{ all -> 0x0436 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "origin"
            r2.put(r0, r1)     // Catch:{ all -> 0x0436 }
            boolean r10 = r8 instanceof X.C30901d9     // Catch:{ all -> 0x0436 }
            if (r10 == 0) goto L_0x0355
            r0 = r8
            X.1d9 r0 = (X.C30901d9) r0     // Catch:{ all -> 0x0436 }
            double r0 = r0.A00     // Catch:{ all -> 0x0436 }
        L_0x034b:
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "latitude"
            r2.put(r0, r1)     // Catch:{ all -> 0x0436 }
            goto L_0x0358
        L_0x0355:
            r0 = 0
            goto L_0x034b
        L_0x0358:
            if (r10 == 0) goto L_0x035b
            goto L_0x035e
        L_0x035b:
            r0 = 0
            goto L_0x0363
        L_0x035e:
            r0 = r8
            X.1d9 r0 = (X.C30901d9) r0     // Catch:{ all -> 0x0436 }
            double r0 = r0.A01     // Catch:{ all -> 0x0436 }
        L_0x0363:
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "longitude"
            r2.put(r0, r1)     // Catch:{ all -> 0x0436 }
            java.lang.Object r0 = r8.A0H()     // Catch:{ all -> 0x0436 }
            java.lang.Object r0 = X.C38611r4.A00(r3, r0)     // Catch:{ all -> 0x0436 }
            X.C38611r4.A03(r2, r0)     // Catch:{ all -> 0x0436 }
            long r0 = r8.A0G     // Catch:{ all -> 0x0436 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "received_timestamp"
            r2.put(r0, r1)     // Catch:{ all -> 0x0436 }
            java.util.List r0 = r8.A0q     // Catch:{ all -> 0x0436 }
            java.lang.String r1 = X.C39501sa.A00(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "mentioned_jids"
            X.C38611r4.A04(r2, r0, r1)     // Catch:{ all -> 0x0436 }
            int r0 = r8.A01     // Catch:{ all -> 0x0436 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "edit_version"
            r2.put(r0, r1)     // Catch:{ all -> 0x0436 }
            java.lang.String r1 = r8.A0K()     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "media_enc_hash"
            X.C38611r4.A04(r2, r0, r1)     // Catch:{ all -> 0x0436 }
            java.lang.String r1 = r8.A0n     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "payment_transaction_id"
            X.C38611r4.A04(r2, r0, r1)     // Catch:{ all -> 0x0436 }
            int r0 = r8.A07()     // Catch:{ all -> 0x0436 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "forwarded"
            r2.put(r0, r1)     // Catch:{ all -> 0x0436 }
            int r0 = r8.A05()     // Catch:{ all -> 0x0436 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "preview_type"
            r2.put(r0, r1)     // Catch:{ all -> 0x0436 }
            long r0 = r8.A0A()     // Catch:{ all -> 0x0436 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "lookup_tables"
            r2.put(r0, r1)     // Catch:{ all -> 0x0436 }
            boolean r0 = r8 instanceof X.C38791rQ     // Catch:{ all -> 0x0436 }
            if (r0 == 0) goto L_0x042a
            r0 = r8
            X.1rQ r0 = (X.C38791rQ) r0     // Catch:{ all -> 0x0436 }
            int r0 = r0.A00     // Catch:{ all -> 0x0436 }
        L_0x03d8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "future_message_type"
            r2.put(r0, r1)     // Catch:{ all -> 0x0436 }
            int r0 = r8.A07     // Catch:{ all -> 0x0436 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = "message_add_on_flags"
            r2.put(r0, r1)     // Catch:{ all -> 0x0436 }
            X.0tg r12 = r4.A02     // Catch:{ all -> 0x0436 }
            java.lang.String r11 = "messages_quotes"
            java.lang.String r10 = "_id = ?"
            java.lang.String[] r3 = new java.lang.String[r5]     // Catch:{ all -> 0x0436 }
            long r0 = r7.A0F     // Catch:{ all -> 0x0436 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0436 }
            r3[r14] = r0     // Catch:{ all -> 0x0436 }
            r12.A00(r11, r2, r10, r3)     // Catch:{ all -> 0x0436 }
            r6.A03(r7)     // Catch:{ all -> 0x0436 }
        L_0x0402:
            boolean r0 = r6.A06()     // Catch:{ all -> 0x0436 }
            if (r0 != 0) goto L_0x041e
            long r0 = r8.A13     // Catch:{ all -> 0x0436 }
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 <= 0) goto L_0x0421
            long r0 = r8.A13     // Catch:{ all -> 0x0436 }
            X.11I r10 = r6.A0H     // Catch:{ all -> 0x0436 }
            java.lang.String r8 = "migration_message_quoted_index"
            long r10 = r10.A01(r8, r2)     // Catch:{ all -> 0x0436 }
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x0421
        L_0x041e:
            r6.A05(r7, r5)     // Catch:{ all -> 0x0436 }
        L_0x0421:
            r13.A00()     // Catch:{ all -> 0x0436 }
            X.17H r0 = r6.A0B     // Catch:{ all -> 0x0436 }
            r0.A02(r7)     // Catch:{ all -> 0x0436 }
            goto L_0x042c
        L_0x042a:
            r0 = 0
            goto L_0x03d8
        L_0x042c:
            r13.close()     // Catch:{ all -> 0x0433 }
            r4.close()     // Catch:{ IOException -> 0x0442 }
            goto L_0x0449
        L_0x0433:
            r0 = move-exception
            r14 = 1
            goto L_0x043c
        L_0x0436:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x043a }
        L_0x043a:
            throw r0     // Catch:{ all -> 0x043b }
        L_0x043b:
            r0 = move-exception
        L_0x043c:
            r4.close()     // Catch:{ all -> 0x043f }
        L_0x043f:
            throw r0     // Catch:{ IOException -> 0x0440 }
        L_0x0440:
            r0 = move-exception
            goto L_0x0444
        L_0x0442:
            r0 = move-exception
            r14 = 1
        L_0x0444:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            if (r14 == 0) goto L_0x0740
        L_0x0449:
            X.17E r0 = r9.A0e
            android.os.Handler r3 = r0.A02
            r2 = 2
            r1 = -1
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r3, r2, r1, r0, r7)
            goto L_0x0534
        L_0x0456:
            java.lang.Object r0 = r3.A00
            X.0t6 r0 = (X.C16460t6) r0
            java.lang.Object r12 = r3.A01
            X.0tZ r12 = (X.C16740tZ) r12
            X.1HK r10 = r0.A00
            X.126 r0 = r10.A04
            android.os.Handler r0 = r0.A01
            X.AnonymousClass00B.A02(r0)
            X.1Vw r4 = r12.A11
            X.0tq r0 = r10.A0A
            X.0tf r9 = r0.A02()
            X.1cj r8 = r9.A00()     // Catch:{ all -> 0x0504 }
            X.14w r3 = r10.A0B     // Catch:{ all -> 0x04ff }
            java.util.List r0 = r3.A00(r4)     // Catch:{ all -> 0x04ff }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x04ff }
            r6 = 0
        L_0x047e:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x04ff }
            if (r0 == 0) goto L_0x04e9
            java.lang.Object r5 = r7.next()     // Catch:{ all -> 0x04ff }
            X.2Bz r5 = (X.C46012Bz) r5     // Catch:{ all -> 0x04ff }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04ff }
            r1.<init>()     // Catch:{ all -> 0x04ff }
            java.lang.String r0 = "msgstore/applyingorphanedreceipt/receipt="
            r1.append(r0)     // Catch:{ all -> 0x04ff }
            r1.append(r5)     // Catch:{ all -> 0x04ff }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04ff }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04ff }
            com.whatsapp.jid.UserJid r1 = r5.A03     // Catch:{ all -> 0x04ff }
            if (r1 == 0) goto L_0x04b5
            X.0rv r0 = r4.A00     // Catch:{ all -> 0x04ff }
            boolean r0 = X.C16030sJ.A0L(r0)     // Catch:{ all -> 0x04ff }
            if (r0 == 0) goto L_0x04b5
            X.0rv r0 = r12.A0B()     // Catch:{ all -> 0x04ff }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x04ff }
            if (r0 != 0) goto L_0x04b5
            goto L_0x047e
        L_0x04b5:
            int r13 = r5.A00     // Catch:{ all -> 0x04ff }
            r0 = 17
            r2 = 1
            if (r13 != r0) goto L_0x04d7
            X.0z0 r0 = r10.A0G     // Catch:{ all -> 0x04ff }
            boolean r0 = r0.A02(r12)     // Catch:{ all -> 0x04ff }
            if (r0 == 0) goto L_0x04c9
            X.17f r0 = r10.A0H     // Catch:{ all -> 0x04ff }
            r0.A04(r12)     // Catch:{ all -> 0x04ff }
        L_0x04c9:
            com.whatsapp.jid.DeviceJid r11 = r5.A02     // Catch:{ all -> 0x04ff }
            long r14 = r5.A01     // Catch:{ all -> 0x04ff }
            r10.A04(r11, r12, r13, r14)     // Catch:{ all -> 0x04ff }
            boolean r0 = X.AnonymousClass1HK.A00(r4, r13)     // Catch:{ all -> 0x04ff }
            if (r0 == 0) goto L_0x047e
            goto L_0x04e7
        L_0x04d7:
            r0 = 18
            if (r13 != r0) goto L_0x04c9
            X.124 r1 = r10.A0I     // Catch:{ all -> 0x04ff }
            java.util.Set r0 = java.util.Collections.singleton(r12)     // Catch:{ all -> 0x04ff }
            r1.A05(r0, r2)     // Catch:{ all -> 0x04ff }
            r13 = 8
            goto L_0x04c9
        L_0x04e7:
            r6 = 1
            goto L_0x047e
        L_0x04e9:
            r3.A01(r4)     // Catch:{ all -> 0x04ff }
            r8.A00()     // Catch:{ all -> 0x04ff }
            r8.close()     // Catch:{ all -> 0x0504 }
            r9.close()
            if (r6 == 0) goto L_0x0740
            java.util.List r0 = java.util.Collections.singletonList(r4)
            r10.A02(r0)
            return
        L_0x04ff:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0503 }
        L_0x0503:
            throw r0     // Catch:{ all -> 0x0504 }
        L_0x0504:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0508 }
        L_0x0508:
            throw r0
        L_0x0509:
            java.lang.Object r4 = r3.A00
            X.0t6 r4 = (X.C16460t6) r4
            java.lang.Object r3 = r3.A01
            X.0tZ r3 = (X.C16740tZ) r3
            X.1Vw r0 = r3.A11
            X.0rv r2 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r2)
            if (r0 == 0) goto L_0x0526
            X.0sO r1 = r4.A0d
            r0 = r2
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x052a
        L_0x0526:
            r0 = 0
            r4.A0s(r2, r0)
        L_0x052a:
            X.17E r0 = r4.A0e
            android.os.Handler r1 = r0.A02
            r0 = 13
            android.os.Message r0 = android.os.Message.obtain(r1, r0, r3)
        L_0x0534:
            r0.sendToTarget()
            return
        L_0x0538:
            java.lang.Object r1 = r3.A00
            X.1Sn r1 = (X.C27631Sn) r1
            java.lang.Object r0 = r3.A01
            X.0xq r2 = r1.A0J
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 0
            r2.A0A(r1, r0)
            return
        L_0x0549:
            java.lang.Object r1 = r3.A00
            X.1Sn r1 = (X.C27631Sn) r1
            java.lang.Object r0 = r3.A01
            X.1br r0 = (X.C30161br) r0
            X.2EB r0 = X.AnonymousClass2EB.A00(r0)
            r1.A01(r0)
            return
        L_0x0559:
            java.lang.Object r4 = r3.A00
            X.1Sn r4 = (X.C27631Sn) r4
            java.lang.Object r2 = r3.A01
            X.0tZ r2 = (X.C16740tZ) r2
            X.0xq r1 = r4.A0J
            X.1Vw r0 = r2.A11
            X.0rv r0 = r0.A00
            r1.A04(r0)
            X.17H r0 = r4.A0G
            r0.A02(r2)
            return
        L_0x0570:
            java.lang.Object r4 = r3.A00
            X.182 r4 = (X.AnonymousClass182) r4
            java.lang.Object r0 = r3.A01
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            if (r0 == 0) goto L_0x0740
            java.lang.String r3 = r0.getRawString()
            r1 = 0
            r0 = 0
            r4.A03(r0, r3, r1)
            return
        L_0x0589:
            java.lang.Object r4 = r3.A00
            X.11K r4 = (X.AnonymousClass11K) r4
            java.lang.Object r0 = r3.A01
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            X.2Fn r1 = r4.A07
            r0 = 0
            r4.A01(r1, r2, r0)
            return
        L_0x059c:
            java.lang.Object r0 = r3.A00
            X.191 r0 = (X.AnonymousClass191) r0
            java.lang.Object r1 = r3.A01
            java.util.Map r0 = r0.A02
            monitor-enter(r0)
            r0.remove(r1)     // Catch:{ all -> 0x05aa }
            monitor-exit(r0)     // Catch:{ all -> 0x05aa }
            return
        L_0x05aa:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x05aa }
            throw r1
        L_0x05ad:
            java.lang.Object r0 = r3.A00
            X.191 r0 = (X.AnonymousClass191) r0
            java.lang.Object r1 = r3.A01
            java.util.Map r0 = r0.A02
            monitor-enter(r0)
            r0.remove(r1)     // Catch:{ all -> 0x05bb }
            monitor-exit(r0)     // Catch:{ all -> 0x05bb }
            return
        L_0x05bb:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x05bb }
            throw r1
        L_0x05be:
            java.lang.Object r1 = r3.A00
            X.0sO r1 = (X.C16070sO) r1
            java.lang.Object r0 = r3.A01
            X.18R r1 = r1.A0B
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r1.A04(r0)
            return
        L_0x05ce:
            java.lang.Object r4 = r3.A00
            X.19X r4 = (X.AnonymousClass19X) r4
            java.lang.Object r0 = r3.A01
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x05de:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0740
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.Map r2 = r4.A01
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L_0x05de
        L_0x05f8:
            java.lang.Object r0 = r3.A00
            X.12t r0 = (X.C210912t) r0
            java.lang.Object r2 = r3.A01
            X.0tT r2 = (X.C16690tT) r2
            X.0sq r1 = r0.A0N
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.Ack(r2, r0)
            return
        L_0x0609:
            java.lang.Object r5 = r3.A00
            X.17A r5 = (X.AnonymousClass17A) r5
            java.lang.Object r0 = r3.A01
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x0615:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0740
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            long r2 = java.lang.Long.parseLong(r0)
            X.03L r1 = r5.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A03(r0)
            goto L_0x0615
        L_0x062f:
            java.lang.Object r0 = r3.A00
            X.1HK r0 = (X.AnonymousClass1HK) r0
            java.lang.Object r1 = r3.A01
            X.0tZ r1 = (X.C16740tZ) r1
            X.1HF r0 = r0.A0D
            X.1Vw r1 = r1.A11
            X.03L r0 = r0.A00
            r0.A03(r1)
            return
        L_0x0641:
            java.lang.Object r6 = r3.A00
            X.15f r6 = (X.C217315f) r6
            java.lang.Object r5 = r3.A01
            X.0rx r5 = (X.C15840rx) r5
            X.0ts r4 = r6.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x066b, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
            monitor-enter(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x066b, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
            r0 = 2
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0668 }
            r3.<init>(r0)     // Catch:{ all -> 0x0668 }
            java.lang.String r2 = "has_new_community_admin_dialog_been_acknowledged"
            boolean r1 = r5.A0f     // Catch:{ all -> 0x0668 }
            r0 = 0
            if (r1 == 0) goto L_0x065a
            r0 = 1
        L_0x065a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0668 }
            r3.put(r2, r0)     // Catch:{ all -> 0x0668 }
            monitor-exit(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x066b, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
            X.0rv r0 = r5.A0i     // Catch:{ SQLiteDatabaseCorruptException -> 0x066b, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
            r4.A00(r3, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x066b, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
            return
        L_0x0668:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x066b, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x066b, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
        L_0x066b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r6.A02
            goto L_0x06f8
        L_0x0673:
            java.lang.Object r0 = r3.A00
            X.1xv r0 = (X.C42511xv) r0
            java.lang.Object r1 = r3.A01
            X.1WD r1 = (X.AnonymousClass1WD) r1
            X.160 r0 = r0.A01
            java.util.List r0 = r0.A0B()
            goto L_0x069f
        L_0x0682:
            java.lang.Object r0 = r3.A00
            X.1xv r0 = (X.C42511xv) r0
            java.lang.Object r1 = r3.A01
            X.1WD r1 = (X.AnonymousClass1WD) r1
            X.160 r0 = r0.A01
            java.util.List r0 = r0.A09()
            goto L_0x069f
        L_0x0691:
            java.lang.Object r0 = r3.A00
            X.1xv r0 = (X.C42511xv) r0
            java.lang.Object r1 = r3.A01
            X.1WD r1 = (X.AnonymousClass1WD) r1
            X.160 r0 = r0.A01
            java.util.List r0 = r0.A0A()
        L_0x069f:
            r1.A02(r0)
            return
        L_0x06a3:
            java.lang.Object r0 = r3.A00
            X.17i r0 = (X.C222817i) r0
            java.lang.Object r1 = r3.A01
            X.0rv r1 = (X.C15830rv) r1
            X.17H r0 = r0.A02
            r0.A01(r1)
            return
        L_0x06b1:
            java.lang.Object r2 = r3.A00
            X.1HF r2 = (X.AnonymousClass1HF) r2
            java.lang.Object r0 = r3.A01
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r1 = r0.A11
            X.03L r0 = r2.A00
            r0.A03(r1)
            java.util.Set r0 = r2.A08
            r0.add(r1)
            return
        L_0x06c6:
            java.lang.Object r5 = r3.A00
            X.17b r5 = (X.C222117b) r5
            java.lang.Object r4 = r3.A01
            X.0rx r4 = (X.C15840rx) r4
            X.0ts r3 = r5.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x06f2, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
            monitor-enter(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x06f2, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
            r0 = 2
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x06ea }
            r2.<init>(r0)     // Catch:{ all -> 0x06ea }
            java.lang.String r1 = "spam_detection"
            int r0 = r4.A03     // Catch:{ all -> 0x06ea }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x06ea }
            r2.put(r1, r0)     // Catch:{ all -> 0x06ea }
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x06f2, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
            X.0rv r0 = r4.A0i     // Catch:{ SQLiteDatabaseCorruptException -> 0x06f2, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
            r3.A00(r2, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x06f2, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
            return
        L_0x06ea:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x06f2, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x06f2, Error | RuntimeException -> 0x06ed, Error | RuntimeException -> 0x06ed }
        L_0x06ed:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
            throw r1
        L_0x06f2:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r5.A03
        L_0x06f8:
            r0.A02()
            return
        L_0x06fc:
            java.lang.Object r0 = r3.A00
            X.10G r0 = (X.AnonymousClass10G) r0
            java.lang.Object r3 = r3.A01
            X.0rv r3 = (X.C15830rv) r3
            X.0xq r2 = r0.A0A
            r1 = 0
            r0 = 0
            r2.A06(r3, r1, r0)
            return
        L_0x070c:
            java.lang.Object r0 = r3.A00
            X.128 r0 = (X.AnonymousClass128) r0
            java.lang.Object r7 = r3.A01
            X.0tZ r7 = (X.C16740tZ) r7
            X.0xq r6 = r0.A0B
            java.lang.Iterable r0 = r6.A01()
            java.util.Iterator r5 = r0.iterator()
        L_0x071e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0740
            java.lang.Object r4 = r5.next()
            X.0xV r4 = (X.C18940xV) r4
            long r2 = r6.A00
            r0 = 1
            long r2 = r2 + r0
            r6.A00 = r2
            r4.A02(r7)
            goto L_0x071e
        L_0x0735:
            java.lang.Object r1 = r3.A00
            com.obwhatsapp.crop.CropImageView r1 = (com.obwhatsapp.crop.CropImageView) r1
            java.lang.Object r0 = r3.A01
            X.2QO r0 = (X.AnonymousClass2QO) r0
            r1.A05(r0)
        L_0x0740:
            return
        L_0x0741:
            java.lang.Object r0 = r3.A00
            X.128 r0 = (X.AnonymousClass128) r0
            java.lang.Object r2 = r3.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.0xq r1 = r0.A0B
        L_0x074b:
            r0 = 0
            r1.A0A(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape6S0200000_I0_4.run():void");
    }
}
