package com.facebook.redex;

public class RunnableRunnableShape1S0500000_I1 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public RunnableRunnableShape1S0500000_I1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.A05 = i2;
        this.A04 = obj;
        this.A00 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
        this.A03 = obj5;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x034c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r2 = r22
            int r0 = r2.A05
            switch(r0) {
                case 0: goto L_0x006b;
                case 1: goto L_0x009b;
                case 2: goto L_0x00c5;
                case 3: goto L_0x01bc;
                case 4: goto L_0x0118;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r2.A00
            X.0vu r3 = (X.C17950vu) r3
            java.lang.Object r8 = r2.A01
            java.lang.Object r9 = r2.A02
            X.1Vv r9 = (X.C28371Vv) r9
            java.lang.Object r10 = r2.A03
            X.4Fd r10 = (X.C83044Fd) r10
            java.lang.Object r4 = r2.A04
            X.5S1 r4 = (X.AnonymousClass5S1) r4
            r7 = 0
            int r2 = r8.hashCode()
            java.lang.String r1 = "iqResponse"
            X.0vp r0 = r3.A08
            X.1dR r6 = r0.A02
            r6.A03(r2, r1)
            X.0so r5 = r3.A03
            java.lang.String r0 = "iq"
            X.C28371Vv.A06(r9, r0)
            X.1Vv r2 = r10.A00
            r0 = 5
            com.facebook.redex.IDxNFunctionShape43S0200000_2_I1 r1 = new com.facebook.redex.IDxNFunctionShape43S0200000_2_I1
            r1.<init>(r5, r2, r0)
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.Object r2 = X.C32271fx.A03(r9, r1, r0)
            X.4UO r2 = (X.AnonymousClass4UO) r2
            X.C18450wi.A0B(r2)
            int r1 = r8.hashCode()
            r0 = 467(0x1d3, float:6.54E-43)
            r6.A05(r1, r0)
            X.4V2 r0 = r2.A01
            X.4Tl r0 = r0.A03
            if (r0 == 0) goto L_0x01b6
            X.4Ti r0 = r0.A01
            java.util.List r0 = r0.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0058:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r0 = r1.next()
            X.4UN r0 = (X.AnonymousClass4UN) r0
            X.C18450wi.A09(r0)
            X.C17950vu.A02(r3, r0)
            goto L_0x0058
        L_0x006b:
            java.lang.Object r3 = r2.A04
            android.view.View r3 = (android.view.View) r3
            r1 = 2131365726(0x7f0a0f5e, float:1.8351325E38)
            r0 = 0
            r3.setTag(r1, r0)
            java.lang.Object r5 = r2.A00
            X.1dg r5 = (X.C31201dg) r5
            java.lang.Object r1 = r2.A02
            X.1dg r1 = (X.C31201dg) r1
            r0 = 35
            X.0q1 r4 = r1.A0H(r0)
            X.0q2 r3 = new X.0q2
            r3.<init>()
            r0 = 0
            r3.A02(r5, r0)
            java.lang.Object r1 = r2.A01
            X.0q7 r1 = (X.C14990q7) r1
            r0 = 1
            r3.A02(r1, r0)
            X.C14940q2.A00(r1, r5, r3, r4)
            java.lang.Object r0 = r2.A03
            goto L_0x00bd
        L_0x009b:
            java.lang.Object r3 = r2.A02
            X.4Go r3 = (X.C83414Go) r3
            r0 = 0
            r3.A00 = r0
            boolean r1 = r3.A01
            r0 = 1
            if (r1 != 0) goto L_0x00b2
            r3.A01 = r0
            java.lang.Object r1 = r2.A03
            X.1dg r1 = (X.C31201dg) r1
            r0 = 35
            X.C31201dg.A05(r2, r1, r0)
        L_0x00b2:
            java.lang.Object r1 = r2.A03
            X.1dg r1 = (X.C31201dg) r1
            r0 = 36
            X.C31201dg.A05(r2, r1, r0)
            java.lang.Object r0 = r2.A04
        L_0x00bd:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x01bb
            r0.run()
            return
        L_0x00c5:
            java.lang.Object r1 = r2.A00
            X.0tz r1 = (X.C16980tz) r1
            java.lang.Object r0 = r2.A01
            X.013 r0 = (X.AnonymousClass013) r0
            java.lang.Object r4 = r2.A02
            android.location.Location r4 = (android.location.Location) r4
            java.lang.Object r3 = r2.A03
            X.0pt r3 = (X.C14870pt) r3
            java.lang.Object r2 = r2.A04
            android.content.Context r6 = r1.A00
            java.util.Locale r0 = X.C13690nt.A0m(r0)
            android.location.Geocoder r7 = new android.location.Geocoder
            r7.<init>(r6, r0)
            r5 = 0
            double r8 = r4.getLatitude()     // Catch:{ Exception -> 0x00f3 }
            double r10 = r4.getLongitude()     // Catch:{ Exception -> 0x00f3 }
            r12 = 1
            java.util.List r1 = r7.getFromLocation(r8, r10, r12)     // Catch:{ Exception -> 0x00f3 }
            if (r1 == 0) goto L_0x010e
            goto L_0x00fa
        L_0x00f3:
            r1 = move-exception
            java.lang.String r0 = "LocationUpdateListener/geocodeAddress Exception while trying to fetch address"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x010e
        L_0x00fa:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x010e
            java.lang.Object r1 = X.C13690nt.A0Z(r1)
            android.location.Address r1 = (android.location.Address) r1
            float r0 = r4.getAccuracy()
            java.lang.String r5 = X.AnonymousClass463.A00(r6, r1, r0)
        L_0x010e:
            r1 = 5
            com.facebook.redex.RunnableRunnableShape1S1200000_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S1200000_I1
            r0.<init>(r2, r5, r4, r1)
            r3.A0K(r0)
            return
        L_0x0118:
            java.lang.Object r8 = r2.A00
            X.0vu r8 = (X.C17950vu) r8
            java.lang.Object r5 = r2.A01
            X.4W4 r5 = (X.AnonymousClass4W4) r5
            java.lang.Object r9 = r2.A02
            X.1Vv r9 = (X.C28371Vv) r9
            java.lang.Object r11 = r2.A03
            X.4Fb r11 = (X.C83024Fb) r11
            java.lang.Object r6 = r2.A04
            X.5S1 r6 = (X.AnonymousClass5S1) r6
            r10 = 0
            int r1 = r5.hashCode()
            java.lang.String r0 = "iqResponse"
            X.0vp r4 = r8.A08
            X.1dR r3 = r4.A02
            r3.A03(r1, r0)
            java.util.Map r0 = r5.A02
            if (r0 == 0) goto L_0x0153
            java.lang.String r2 = "action"
            java.lang.Object r1 = r0.get(r2)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0153
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0153
            int r0 = r5.hashCode()
            r4.A02(r0, r2, r1)
        L_0x0153:
            X.0so r7 = r8.A03
            java.lang.String r0 = "iq"
            X.C28371Vv.A06(r9, r0)
            X.1Vv r2 = r11.A00
            r0 = 2
            com.facebook.redex.IDxNFunctionShape43S0200000_2_I1 r1 = new com.facebook.redex.IDxNFunctionShape43S0200000_2_I1
            r1.<init>(r7, r2, r0)
            java.lang.String[] r0 = new java.lang.String[r10]
            java.lang.Object r7 = X.C32271fx.A03(r9, r1, r0)
            X.4UO r7 = (X.AnonymousClass4UO) r7
            X.C18450wi.A0B(r7)
            X.4V2 r2 = r7.A01
            X.4Tl r0 = r2.A03
            if (r0 == 0) goto L_0x018e
            X.4Ti r0 = r0.A01
            java.util.List r0 = r0.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x017b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x018e
            java.lang.Object r0 = r1.next()
            X.4UN r0 = (X.AnonymousClass4UN) r0
            X.C18450wi.A09(r0)
            X.C17950vu.A02(r8, r0)
            goto L_0x017b
        L_0x018e:
            X.4Tk r0 = r2.A02
            if (r0 == 0) goto L_0x01a7
            int r2 = r5.hashCode()
            X.4Tg r0 = r0.A01
            java.util.List r0 = r0.A01
            int r0 = r0.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "num_screens_to_prefetch"
            r4.A02(r2, r0, r1)
        L_0x01a7:
            int r1 = r5.hashCode()
            r0 = 467(0x1d3, float:6.54E-43)
            r3.A05(r1, r0)
            if (r6 == 0) goto L_0x01bb
            r6.AQz(r7)
            return
        L_0x01b6:
            if (r4 == 0) goto L_0x01bb
            r4.AQz(r2)
        L_0x01bb:
            return
        L_0x01bc:
            java.lang.String r0 = "SessionVerifier/verify/begin"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0381 }
            java.lang.Object r0 = r2.A04     // Catch:{ all -> 0x0381 }
            r20 = r0
            r0 = r20
            X.0rz r0 = (X.C15860rz) r0     // Catch:{ all -> 0x0381 }
            r20 = r0
            java.lang.String r3 = "session_verification_status"
            X.01D r0 = r0.A01     // Catch:{ all -> 0x0381 }
            r21 = r0
            android.content.SharedPreferences r0 = X.C13680ns.A0C(r21)     // Catch:{ all -> 0x0381 }
            r4 = 0
            int r6 = r0.getInt(r3, r4)     // Catch:{ all -> 0x0381 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0381 }
            java.lang.String r0 = "SessionVerifier/verify/status="
            r1.append(r0)     // Catch:{ all -> 0x0381 }
            r1.append(r6)     // Catch:{ all -> 0x0381 }
            X.C13680ns.A1V(r1)     // Catch:{ all -> 0x0381 }
            r5 = 1
            if (r6 == r5) goto L_0x0379
            java.lang.String r1 = "SessionVerifier/verify"
            X.1Zf r19 = new X.1Zf     // Catch:{ all -> 0x0381 }
            r0 = r19
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0381 }
            r19.A03()     // Catch:{ all -> 0x0381 }
        L_0x01f9:
            java.lang.String r1 = "SessionVerifier/verify/processBatch"
            X.1Zf r18 = new X.1Zf     // Catch:{ Exception -> 0x0352 }
            r0 = r18
            r0.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x0352 }
            r18.A03()     // Catch:{ Exception -> 0x0352 }
            r9 = 100
            java.lang.String r6 = "last_read_session_row_id"
            android.content.SharedPreferences r0 = X.C13680ns.A0C(r21)     // Catch:{ all -> 0x034d }
            int r16 = r0.getInt(r6, r4)     // Catch:{ all -> 0x034d }
            java.lang.Object r0 = r2.A02     // Catch:{ all -> 0x034d }
            r17 = r0
            r0 = r17
            X.11s r0 = (X.C208211s) r0     // Catch:{ all -> 0x034d }
            r17 = r0
            java.util.ArrayList r8 = X.C13690nt.A0i(r9)     // Catch:{ all -> 0x034d }
            X.1ex r0 = r0.A0B     // Catch:{ all -> 0x034d }
            X.AnonymousClass00B.A0F(r5)     // Catch:{ all -> 0x034d }
            X.01d r0 = r0.A01     // Catch:{ all -> 0x034d }
            X.0tg r7 = r0.AHC()     // Catch:{ all -> 0x034d }
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x034d }
            java.lang.String r0 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x034d }
            r1[r4] = r0     // Catch:{ all -> 0x034d }
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x034d }
            r1[r5] = r0     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "SELECT _id, record, recipient_id, recipient_type, device_id FROM sessions WHERE _id > ?  ORDER BY _id ASC  LIMIT ? "
            android.database.Cursor r13 = r7.A08(r0, r1)     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "_id"
            int r14 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = "record"
            int r12 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = "recipient_id"
            int r11 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = "device_id"
            int r10 = r13.getColumnIndex(r0)     // Catch:{ all -> 0x0346 }
        L_0x0257:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x028d
            int r15 = r13.getInt(r14)     // Catch:{ all -> 0x0346 }
            byte[] r9 = r13.getBlob(r12)     // Catch:{ all -> 0x0346 }
            long r0 = r13.getLong(r11)     // Catch:{ all -> 0x0346 }
            java.lang.String r7 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0346 }
            int r0 = r13.getInt(r10)     // Catch:{ all -> 0x0346 }
            X.1Yb r1 = new X.1Yb     // Catch:{ all -> 0x0346 }
            r1.<init>(r4, r7, r0)     // Catch:{ all -> 0x0346 }
            X.1ev r0 = new X.1ev     // Catch:{ IOException -> 0x0287 }
            r0.<init>(r9)     // Catch:{ IOException -> 0x0287 }
            X.C208211s.A02(r0)     // Catch:{ IOException -> 0x0287 }
            X.4KX r7 = new X.4KX     // Catch:{ IOException -> 0x0287 }
            r7.<init>(r0, r1, r15)     // Catch:{ IOException -> 0x0287 }
            r8.add(r7)     // Catch:{ IOException -> 0x0287 }
            goto L_0x0257
        L_0x0287:
            r0 = r17
            r0.A0E(r1)     // Catch:{ all -> 0x0346 }
            goto L_0x0257
        L_0x028d:
            r13.close()     // Catch:{ all -> 0x034d }
            int r0 = r8.size()     // Catch:{ all -> 0x034d }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x034d }
            r7.<init>(r0)     // Catch:{ all -> 0x034d }
            java.util.Iterator r1 = r8.iterator()     // Catch:{ all -> 0x034d }
        L_0x029d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x02af
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x034d }
            X.4KX r0 = (X.AnonymousClass4KX) r0     // Catch:{ all -> 0x034d }
            X.1Yb r0 = r0.A02     // Catch:{ all -> 0x034d }
            r7.add(r0)     // Catch:{ all -> 0x034d }
            goto L_0x029d
        L_0x02af:
            r0 = r17
            java.util.Map r1 = r0.A0M(r7)     // Catch:{ all -> 0x034d }
            java.util.HashSet r10 = X.C13680ns.A0o()     // Catch:{ all -> 0x034d }
            java.util.Iterator r12 = r8.iterator()     // Catch:{ all -> 0x034d }
        L_0x02bd:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x034d }
            if (r0 == 0) goto L_0x02fe
            java.lang.Object r9 = r12.next()     // Catch:{ all -> 0x034d }
            X.4KX r9 = (X.AnonymousClass4KX) r9     // Catch:{ all -> 0x034d }
            X.1ev r0 = r9.A01     // Catch:{ all -> 0x034d }
            X.1ms r0 = r0.A01     // Catch:{ all -> 0x034d }
            X.1mt r0 = r0.A00     // Catch:{ all -> 0x034d }
            X.1Ww r0 = r0.A07     // Catch:{ all -> 0x034d }
            byte[] r11 = r0.A04()     // Catch:{ all -> 0x034d }
            X.1Yb r7 = r9.A02     // Catch:{ all -> 0x034d }
            java.lang.Object r0 = r1.get(r7)     // Catch:{ all -> 0x034d }
            X.1WL r0 = (X.AnonymousClass1WL) r0     // Catch:{ all -> 0x034d }
            if (r0 != 0) goto L_0x02e1
            r0 = 0
            goto L_0x02e7
        L_0x02e1:
            X.1cD r0 = r0.A00     // Catch:{ all -> 0x034d }
            byte[] r0 = r0.A00()     // Catch:{ all -> 0x034d }
        L_0x02e7:
            boolean r0 = java.util.Arrays.equals(r11, r0)     // Catch:{ all -> 0x034d }
            if (r0 != 0) goto L_0x02f9
            r10.add(r9)     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "SessionVerifier/verifyInSmallBatch/bad session: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r7)     // Catch:{ all -> 0x034d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x034d }
        L_0x02f9:
            int r0 = r9.A00     // Catch:{ all -> 0x034d }
            r16 = r0
            goto L_0x02bd
        L_0x02fe:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x034d }
            r9 = 0
            if (r0 != 0) goto L_0x032b
            java.lang.Object r7 = r2.A03     // Catch:{ all -> 0x034d }
            X.16P r7 = (X.AnonymousClass16P) r7     // Catch:{ all -> 0x034d }
            r0 = 12
            com.facebook.redex.RunnableRunnableShape14S0200000_I1_2 r1 = new com.facebook.redex.RunnableRunnableShape14S0200000_I1_2     // Catch:{ all -> 0x034d }
            r1.<init>(r2, r0, r10)     // Catch:{ all -> 0x034d }
            java.util.concurrent.ThreadPoolExecutor r0 = r7.A00     // Catch:{ all -> 0x034d }
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch:{ all -> 0x034d }
            r0.get()     // Catch:{ all -> 0x034d }
            java.lang.Object r7 = r2.A01     // Catch:{ all -> 0x034d }
            X.0so r7 = (X.C16300so) r7     // Catch:{ all -> 0x034d }
            int r0 = r10.size()     // Catch:{ all -> 0x034d }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x034d }
            java.lang.String r0 = "session-verifier-delete-sessions"
            r7.AcB(r0, r1, r4)     // Catch:{ all -> 0x034d }
        L_0x032b:
            r1 = r20
            r0 = r16
            X.C13680ns.A1S(r1, r6, r0)     // Catch:{ all -> 0x034d }
            int r1 = r8.size()     // Catch:{ all -> 0x034d }
            r0 = 100
            if (r1 != r0) goto L_0x033b
            r9 = 1
        L_0x033b:
            r18.A01()     // Catch:{ Exception -> 0x0352 }
            if (r9 != 0) goto L_0x01f9
            r0 = r20
            X.C13680ns.A1S(r0, r3, r5)     // Catch:{ Exception -> 0x0352 }
            goto L_0x0366
        L_0x0346:
            r0 = move-exception
            if (r13 == 0) goto L_0x034c
            r13.close()     // Catch:{ all -> 0x034c }
        L_0x034c:
            throw r0     // Catch:{ all -> 0x034d }
        L_0x034d:
            r0 = move-exception
            r18.A01()     // Catch:{ Exception -> 0x0352 }
            throw r0     // Catch:{ Exception -> 0x0352 }
        L_0x0352:
            r5 = move-exception
            java.lang.String r0 = "SessionVerifier/verify/error"
            com.whatsapp.util.Log.e(r0, r5)     // Catch:{ all -> 0x0381 }
            java.lang.Object r3 = r2.A01     // Catch:{ all -> 0x0381 }
            X.0so r3 = (X.C16300so) r3     // Catch:{ all -> 0x0381 }
            java.lang.String r1 = "session-verifier-failed"
            java.lang.String r0 = r5.getMessage()     // Catch:{ all -> 0x0381 }
            r3.AcB(r1, r0, r4)     // Catch:{ all -> 0x0381 }
        L_0x0366:
            r19.A01()     // Catch:{ all -> 0x0381 }
            java.lang.Object r3 = r2.A01     // Catch:{ all -> 0x0381 }
            X.0so r3 = (X.C16300so) r3     // Catch:{ all -> 0x0381 }
            java.lang.String r1 = "session-verifier-finish"
            r0 = 0
            r3.AcB(r1, r0, r4)     // Catch:{ all -> 0x0381 }
            java.lang.String r0 = "SessionVerifier/verify/end"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0381 }
        L_0x0379:
            java.lang.Object r0 = r2.A00
            android.os.ConditionVariable r0 = (android.os.ConditionVariable) r0
            r0.open()
            return
        L_0x0381:
            r1 = move-exception
            java.lang.Object r0 = r2.A00
            android.os.ConditionVariable r0 = (android.os.ConditionVariable) r0
            r0.open()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape1S0500000_I1.run():void");
    }
}
