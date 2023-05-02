package com.facebook.redex;

public class RunnableRunnableShape9S0200000_I0_7 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape9S0200000_I0_7(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bc, code lost:
        if (r9.A0E(r3, 2077) == false) goto L_0x00be;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x0293 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:128:0x0298 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r5 = r19
            int r0 = r5.A02
            switch(r0) {
                case 0: goto L_0x0a58;
                case 1: goto L_0x0a58;
                case 2: goto L_0x0a49;
                case 3: goto L_0x05fb;
                case 4: goto L_0x09e4;
                case 5: goto L_0x05a9;
                case 6: goto L_0x09c8;
                case 7: goto L_0x09a5;
                case 8: goto L_0x0aab;
                case 9: goto L_0x0a96;
                case 10: goto L_0x0592;
                case 11: goto L_0x04f5;
                case 12: goto L_0x03ea;
                case 13: goto L_0x0948;
                case 14: goto L_0x093c;
                case 15: goto L_0x0930;
                case 16: goto L_0x0924;
                case 17: goto L_0x0913;
                case 18: goto L_0x038c;
                case 19: goto L_0x0905;
                case 20: goto L_0x08f6;
                case 21: goto L_0x036c;
                case 22: goto L_0x08ea;
                case 23: goto L_0x033d;
                case 24: goto L_0x08dc;
                case 25: goto L_0x08c7;
                case 26: goto L_0x02f9;
                case 27: goto L_0x07d7;
                case 28: goto L_0x07cb;
                case 29: goto L_0x07b9;
                case 30: goto L_0x0190;
                case 31: goto L_0x0170;
                case 32: goto L_0x012a;
                case 33: goto L_0x07a0;
                case 34: goto L_0x0762;
                case 35: goto L_0x0752;
                case 36: goto L_0x0730;
                case 37: goto L_0x0724;
                case 38: goto L_0x06ea;
                case 39: goto L_0x06dc;
                case 40: goto L_0x06bf;
                case 41: goto L_0x06a9;
                case 42: goto L_0x0660;
                case 43: goto L_0x00f4;
                case 44: goto L_0x0651;
                case 45: goto L_0x0007;
                case 46: goto L_0x0007;
                case 47: goto L_0x062a;
                case 48: goto L_0x0016;
                case 49: goto L_0x0616;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A00
            X.1TW r0 = (X.AnonymousClass1TW) r0
            java.lang.Object r2 = r5.A01
            java.util.Collection r2 = (java.util.Collection) r2
            X.0xq r1 = r0.A0C
            r0 = 0
            r1.A0A(r2, r0)
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r2 = r5.A00
            X.11k r2 = (X.C207411k) r2
            java.lang.Object r6 = r5.A01
            byte[] r6 = (byte[]) r6
            X.11j r7 = r2.A00
            boolean r0 = r7.A03()
            if (r0 == 0) goto L_0x0015
            X.0pd r9 = r7.A02
            r0 = 1935(0x78f, float:2.712E-42)
            X.0tM r3 = X.C16620tM.A02
            boolean r0 = r9.A0E(r3, r0)
            if (r0 == 0) goto L_0x0015
            X.0rz r5 = r7.A01
            X.01D r0 = r5.A01
            java.lang.Object r8 = r0.get()
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.lang.String r4 = "ka_stanza_sent_ts"
            r0 = 0
            long r12 = r8.getLong(r4, r0)
            r0 = 2067(0x813, float:2.896E-42)
            int r0 = r9.A03(r3, r0)
            long r0 = (long) r0
            long r12 = r12 + r0
            long r10 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0015
            X.0zu r1 = r2.A02
            java.lang.String r0 = "att-stanza-custom"
            r8 = 0
            X.1U7 r12 = r1.A00(r8, r0)
            boolean r0 = r7.A03()
            if (r0 == 0) goto L_0x0a86
            r7.A02(r6)
            r6 = 1
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r0)     // Catch:{ Exception -> 0x0a66 }
            r1.load(r8)     // Catch:{ Exception -> 0x0a66 }
            r0 = 2074(0x81a, float:2.906E-42)
            java.lang.String r0 = r9.A06(r3, r0)     // Catch:{ Exception -> 0x0a66 }
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = "my_personal_mini_pony"
        L_0x007d:
            java.security.cert.Certificate[] r11 = r1.getCertificateChain(r0)     // Catch:{ Exception -> 0x0a66 }
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0a66 }
            r10.<init>()     // Catch:{ Exception -> 0x0a66 }
            if (r11 == 0) goto L_0x0098
            int r1 = r11.length     // Catch:{ Exception -> 0x0a66 }
            int r1 = r1 - r6
        L_0x008a:
            if (r1 < 0) goto L_0x0098
            r0 = r11[r1]     // Catch:{ Exception -> 0x0a66 }
            byte[] r0 = r0.getEncoded()     // Catch:{ Exception -> 0x0a66 }
            r10.write(r0)     // Catch:{ Exception -> 0x0a66 }
            int r1 = r1 + -1
            goto L_0x008a
        L_0x0098:
            r10.size()     // Catch:{ Exception -> 0x0a66 }
            byte[] r6 = r10.toByteArray()     // Catch:{ Exception -> 0x0a66 }
            if (r6 == 0) goto L_0x0a86
            java.lang.String r0 = "keystore_attestation"
            X.1Vv r1 = new X.1Vv
            r1.<init>((java.lang.String) r0, (byte[]) r6, (X.C35081lL[]) r8)
            java.lang.String r0 = "ib"
            X.1Vv r6 = new X.1Vv
            r6.<init>((X.C28371Vv) r1, (java.lang.String) r0, (X.C35081lL[]) r8)
            boolean r0 = r7.A03()
            if (r0 == 0) goto L_0x00be
            r0 = 2077(0x81d, float:2.91E-42)
            boolean r1 = r9.A0E(r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x00bf
        L_0x00be:
            r0 = 0
        L_0x00bf:
            r3 = 6
            X.0ug r2 = r2.A01
            if (r0 == 0) goto L_0x00f0
            X.0tK r0 = r2.A02
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x00d4
            r0 = 343(0x157, float:4.8E-43)
            r1 = 0
            android.os.Message r0 = android.os.Message.obtain(r8, r1, r0, r3, r6)
            r2.A09(r0, r1)
        L_0x00d4:
            r12.A00()
            boolean r0 = r7.A03()
            if (r0 == 0) goto L_0x0015
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            android.content.SharedPreferences$Editor r0 = r5.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r4, r2)
            r0.apply()
            return
        L_0x00f0:
            r2.A0D(r6, r3)
            goto L_0x00d4
        L_0x00f4:
            java.lang.Object r4 = r5.A00
            X.1Tu r4 = (X.C27961Tu) r4
            java.lang.Object r3 = r5.A01
            X.1ci r3 = (X.C30641ci) r3
            java.lang.String r0 = "appending additional prekeys"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0xT r0 = r4.A05
            java.util.concurrent.locks.Lock r2 = r0.A01()
            if (r2 == 0) goto L_0x010c
            r2.lock()     // Catch:{ all -> 0x0a8c }
        L_0x010c:
            X.11s r1 = r4.A03     // Catch:{ all -> 0x0a8c }
            boolean r0 = r1.A0c()     // Catch:{ all -> 0x0a8c }
            if (r0 != 0) goto L_0x011c
            java.lang.String r0 = "no unsent prekeys; generating some new ones"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a8c }
            r1.A0P()     // Catch:{ all -> 0x0a8c }
        L_0x011c:
            X.12z r0 = r4.A00     // Catch:{ all -> 0x0a8c }
            r0.A03()     // Catch:{ all -> 0x0a8c }
            r4.A03(r3)     // Catch:{ all -> 0x0a8c }
            if (r2 == 0) goto L_0x0015
            r2.unlock()
            return
        L_0x012a:
            java.lang.Object r6 = r5.A00
            X.2TZ r6 = (X.AnonymousClass2TZ) r6
            java.lang.Object r0 = r5.A01
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r0 = r0.A11
            X.0rv r4 = r0.A00
            if (r4 == 0) goto L_0x0015
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass1ZT.A00
            boolean r0 = r4.equals(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0142
            r3 = 1
        L_0x0142:
            X.0pd r0 = r6.A00
            boolean r2 = X.C40571uL.A00(r0, r4)
            X.15W r0 = r6.A02
            boolean r1 = r0.A01(r4)
            X.0zl r0 = r6.A01
            boolean r0 = X.C32431gL.A00(r0, r4)
            if (r3 != 0) goto L_0x0015
            if (r2 != 0) goto L_0x0015
            if (r1 != 0) goto L_0x0015
            if (r0 != 0) goto L_0x0015
            int r3 = r4.getType()
            r0 = 3
            r2 = 0
            r1 = 1
            if (r3 != r0) goto L_0x016c
            r1 = 2
        L_0x0166:
            X.1BL r0 = r6.A03
            r0.A00(r1, r2)
            return
        L_0x016c:
            if (r3 == r1) goto L_0x0166
            r1 = 0
            goto L_0x0166
        L_0x0170:
            java.lang.Object r0 = r5.A00
            X.12H r0 = (X.AnonymousClass12H) r0
            java.lang.Object r2 = r5.A01
            X.0rv r2 = (X.C15830rv) r2
            X.125 r1 = r0.A03
            java.util.HashMap r0 = r1.A06
            java.lang.Object r0 = r0.get(r2)
            X.2Cl r0 = (X.AnonymousClass2Cl) r0
            if (r0 == 0) goto L_0x0015
            int r0 = r0.A01
            if (r0 == 0) goto L_0x0015
            r0 = 0
            r1.A07(r2, r0)
            r1.A05(r2)
            return
        L_0x0190:
            java.lang.Object r6 = r5.A00
            X.0vL r6 = (X.C17600vL) r6
            java.lang.Object r0 = r5.A01
            java.util.Map r0 = (java.util.Map) r0
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r4 = r0.iterator()
        L_0x01aa:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r3 = r4.next()
            X.2Bb r3 = (X.AnonymousClass2Bb) r3
            X.1ZX r2 = r3.A00
            if (r2 != 0) goto L_0x01bc
            com.whatsapp.jid.UserJid r2 = r3.A01
        L_0x01bc:
            boolean r0 = r2 instanceof X.AnonymousClass1ZX
            if (r0 == 0) goto L_0x01aa
            java.lang.String r1 = r3.A02
            boolean r0 = X.AnonymousClass1ZW.A0E(r1)
            if (r0 != 0) goto L_0x01cb
            r7.put(r2, r1)
        L_0x01cb:
            com.whatsapp.jid.UserJid r1 = r3.A01
            boolean r0 = r1 instanceof X.AnonymousClass1ZT
            if (r0 == 0) goto L_0x01aa
            r8.put(r2, r1)
            goto L_0x01aa
        L_0x01d5:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            X.0vK r0 = r6.A02
            java.util.List r0 = r0.A01(r7)
            r5.addAll(r0)
            X.0vJ r4 = r6.A01
            monitor-enter(r4)
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0a93 }
            r7.<init>()     // Catch:{ all -> 0x0a93 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0a93 }
            r11.<init>()     // Catch:{ all -> 0x0a93 }
            java.util.Set r0 = r8.entrySet()     // Catch:{ all -> 0x0a93 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0a93 }
        L_0x01f8:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0a93 }
            if (r0 == 0) goto L_0x024f
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x0a93 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0a93 }
            java.lang.Object r8 = r0.getKey()     // Catch:{ all -> 0x0a93 }
            X.1ZX r8 = (X.AnonymousClass1ZX) r8     // Catch:{ all -> 0x0a93 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0a93 }
            X.1ZT r1 = (X.AnonymousClass1ZT) r1     // Catch:{ all -> 0x0a93 }
            X.14v r0 = r4.A01     // Catch:{ all -> 0x0a93 }
            long r12 = r0.A01(r8)     // Catch:{ all -> 0x0a93 }
            long r9 = r0.A01(r1)     // Catch:{ all -> 0x0a93 }
            r1 = 0
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x01f8
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x01f8
            int r0 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x01f8
            java.util.Map r0 = r4.A02     // Catch:{ all -> 0x0a93 }
            java.lang.Long r3 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0a93 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0a93 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0a93 }
            if (r0 == 0) goto L_0x023f
            long r1 = r0.longValue()     // Catch:{ all -> 0x0a93 }
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x023f
            goto L_0x01f8
        L_0x023f:
            java.lang.Long r1 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0a93 }
            X.01Q r0 = new X.01Q     // Catch:{ all -> 0x0a93 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0a93 }
            r11.add(r0)     // Catch:{ all -> 0x0a93 }
            r7.add(r8)     // Catch:{ all -> 0x0a93 }
            goto L_0x01f8
        L_0x024f:
            X.1Cu r1 = r4.A00     // Catch:{ all -> 0x0a93 }
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x0a93 }
            if (r0 != 0) goto L_0x02a5
            X.0tq r0 = r1.A00     // Catch:{ SQLException -> 0x0299 }
            X.0tf r9 = r0.A02()     // Catch:{ SQLException -> 0x0299 }
            X.1cj r10 = r9.A00()     // Catch:{ all -> 0x0294 }
            java.util.Iterator r8 = r11.iterator()     // Catch:{ all -> 0x028f }
        L_0x0265:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x028f }
            if (r0 == 0) goto L_0x0285
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x028f }
            X.01Q r1 = (X.AnonymousClass01Q) r1     // Catch:{ all -> 0x028f }
            java.lang.Object r0 = r1.A00     // Catch:{ all -> 0x028f }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x028f }
            long r2 = r0.longValue()     // Catch:{ all -> 0x028f }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x028f }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x028f }
            long r0 = r0.longValue()     // Catch:{ all -> 0x028f }
            X.C23641Cu.A00(r9, r2, r0)     // Catch:{ all -> 0x028f }
            goto L_0x0265
        L_0x0285:
            r10.A00()     // Catch:{ all -> 0x028f }
            r10.close()     // Catch:{ all -> 0x0294 }
            r9.close()     // Catch:{ SQLException -> 0x0299 }
            goto L_0x02a5
        L_0x028f:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0293 }
        L_0x0293:
            throw r0     // Catch:{ all -> 0x0294 }
        L_0x0294:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0298 }
        L_0x0298:
            throw r0     // Catch:{ SQLException -> 0x0299 }
        L_0x0299:
            r1 = move-exception
            java.lang.String r0 = "JidMapStore/upsertLidToJidMapping"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0a93 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0a93 }
            r7.<init>()     // Catch:{ all -> 0x0a93 }
            goto L_0x02cf
        L_0x02a5:
            java.util.Iterator r8 = r11.iterator()     // Catch:{ all -> 0x0a93 }
        L_0x02a9:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0a93 }
            if (r0 == 0) goto L_0x02cf
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x0a93 }
            X.01Q r1 = (X.AnonymousClass01Q) r1     // Catch:{ all -> 0x0a93 }
            java.lang.Object r0 = r1.A00     // Catch:{ all -> 0x0a93 }
            X.C18450wi.A0A(r0)     // Catch:{ all -> 0x0a93 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x0a93 }
            long r2 = r0.longValue()     // Catch:{ all -> 0x0a93 }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x0a93 }
            X.C18450wi.A0A(r0)     // Catch:{ all -> 0x0a93 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x0a93 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0a93 }
            r4.A02(r2, r0)     // Catch:{ all -> 0x0a93 }
            goto L_0x02a9
        L_0x02cf:
            monitor-exit(r4)
            r5.addAll(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x02d7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r4 = r5.next()
            X.0rv r4 = (X.C15830rv) r4
            X.0sG r3 = r6.A00
            X.0sH r0 = r3.A0A(r4)
            r3.A0O(r0, r4)
            android.os.Handler r2 = r3.A00
            r1 = 30
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r3, r1, r4)
            r2.post(r0)
            goto L_0x02d7
        L_0x02f9:
            java.lang.Object r0 = r5.A00
            X.2Ta r0 = (X.C49402Ta) r0
            java.lang.Object r3 = r5.A01
            com.obwhatsapp.payments.ui.viewmodel.BusinessHubViewModel r3 = (com.obwhatsapp.payments.ui.viewmodel.BusinessHubViewModel) r3
            X.1cl r0 = r0.A00
            if (r0 == 0) goto L_0x0015
            X.1TR r1 = r3.A07
            java.lang.String r0 = r0.A0A
            if (r0 == 0) goto L_0x033b
            X.0wS r0 = r1.A03
            r0.A06()
            java.lang.String r0 = "PAY: removeMerchantPaymentMethod for nonSmbApp!"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x0316:
            r2 = 0
            if (r0 == 0) goto L_0x032e
            X.17O r0 = r3.A02
            r0.A05()
            X.0qW r0 = r3.A0A
            java.lang.Object r1 = r0.getValue()
            X.028 r1 = (X.AnonymousClass028) r1
            X.5xI r0 = X.AnonymousClass5xI.A01(r2)
        L_0x032a:
            r1.A09(r0)
            return
        L_0x032e:
            X.0qW r0 = r3.A0A
            java.lang.Object r1 = r0.getValue()
            X.028 r1 = (X.AnonymousClass028) r1
            X.5xI r0 = X.AnonymousClass5xI.A02(r2, r2)
            goto L_0x032a
        L_0x033b:
            r0 = 1
            goto L_0x0316
        L_0x033d:
            java.lang.Object r3 = r5.A00
            X.12h r3 = (X.C209712h) r3
            java.lang.Object r2 = r5.A01
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x0358
            X.0rz r1 = r3.A02
            r0 = 0
            r1.A1R(r0)
            java.lang.String r0 = "payment_backgrounds_batch_last_fetch_timestamp"
            r1.A0x(r0)
            X.12g r0 = r3.A0A
            r0.A06(r2)
            return
        L_0x0358:
            X.12g r0 = r3.A0A
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0362:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0015
            r1.next()
            goto L_0x0362
        L_0x036c:
            java.lang.Object r3 = r5.A00
            X.2HI r3 = (X.AnonymousClass2HI) r3
            java.lang.Object r0 = r5.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x0378:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r1 = r2.next()
            X.1Vt r1 = (X.AnonymousClass1Vt) r1
            X.1MA r0 = r3.A01
            X.17Y r0 = r0.A07
            r0.A04(r1)
            goto L_0x0378
        L_0x038c:
            java.lang.Object r4 = r5.A00
            X.1TU r4 = (X.AnonymousClass1TU) r4
            java.lang.Object r5 = r5.A01
            X.2HL r5 = (X.AnonymousClass2HL) r5
            X.16r r1 = r4.A03
            r0 = -1
            java.util.List r6 = r1.A0T(r0)
            int r3 = r6.size()
            r4.A01 = r3
            int r0 = r4.A00
            if (r0 <= 0) goto L_0x0015
            X.1Vo r2 = r4.A08
            java.lang.String r0 = "starting sync for: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " transactions"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.A06(r0)
            java.util.Iterator r3 = r6.iterator()
        L_0x03c2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0015
            java.lang.Object r2 = r3.next()
            X.1Vt r2 = (X.AnonymousClass1Vt) r2
            java.lang.String r1 = r2.A0K
            r0 = 0
            if (r1 == 0) goto L_0x03d4
            r0 = 1
        L_0x03d4:
            X.AnonymousClass00B.A0G(r0)
            X.0wS r0 = r4.A07
            X.19r r0 = r0.A03()
            X.69a r0 = r0.ACC()
            if (r0 == 0) goto L_0x03e6
            r0.AgB()
        L_0x03e6:
            r5.Agc(r2)
            goto L_0x03c2
        L_0x03ea:
            java.lang.Object r2 = r5.A00
            X.0pj r2 = (X.C14770pj) r2
            java.lang.Object r10 = r5.A01
            X.1rv r10 = (X.C39101rv) r10
            X.1Vw r0 = r10.A11
            X.0rv r5 = r0.A00
            if (r5 == 0) goto L_0x0015
            X.0sf r1 = r2.A0S
            java.lang.String r0 = r5.getRawString()
            X.1WS r0 = r1.A07(r0)
            X.1WS r0 = r0.A02()
            boolean r0 = r0.A0F
            if (r0 != 0) goto L_0x0015
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Map r6 = r2.A0U
            java.lang.Object r9 = r6.get(r5)
            java.util.List r9 = (java.util.List) r9
            r4 = 1
            if (r9 != 0) goto L_0x0422
            java.util.List r0 = r2.A06(r5, r4)
            r6.put(r5, r0)
            return
        L_0x0422:
            java.util.Iterator r7 = r9.iterator()
        L_0x0426:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x04c4
            java.lang.Object r8 = r7.next()
            X.1ps r8 = (X.C37871ps) r8
            boolean r0 = r8 instanceof X.C45982Bw
            if (r0 == 0) goto L_0x04bf
            X.2Bw r8 = (X.C45982Bw) r8
            X.0tZ r0 = r8.A00
            X.1qx r0 = (X.C38541qx) r0
            X.1Vw r1 = r0.A12()
            X.AnonymousClass00B.A06(r1)
            X.1Vw r0 = r10.A12()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0426
            java.lang.String r0 = r10.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0426
            X.14v r12 = r2.A0I
            java.lang.String r0 = r10.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0471
            java.lang.String r0 = "this method should not be called for reaction revokes"
            X.AnonymousClass00B.A08(r0)
        L_0x0465:
            X.2By r0 = new X.2By
            r0.<init>(r4)
            java.util.Collections.sort(r9, r0)
            r6.put(r5, r9)
            return
        L_0x0471:
            X.23a r0 = r8.A00
            java.util.Set r7 = r0.A03
            X.0rv r0 = r10.A0B()
            boolean r11 = r5 instanceof X.C16060sN
            if (r11 == 0) goto L_0x04bd
            if (r0 == 0) goto L_0x04bd
            long r2 = r12.A01(r0)
            X.23a r0 = r8.A00
            java.util.Set r1 = r0.A03
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            boolean r1 = r1.contains(r0)
        L_0x048f:
            r8.A00 = r10
            X.23a r0 = r8.A00
            int r2 = r0.A00
            if (r1 != 0) goto L_0x04ac
            int r2 = r2 + 1
            X.0rv r0 = r10.A0B()
            if (r11 == 0) goto L_0x04ac
            if (r0 == 0) goto L_0x04ac
            long r0 = r12.A01(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.add(r0)
        L_0x04ac:
            X.23a r0 = r8.A00
            X.0tZ r1 = r0.A01
            X.23a r0 = new X.23a
            r0.<init>(r1, r10, r2)
            r8.A00 = r0
            java.util.Set r0 = r0.A03
            r0.addAll(r7)
            goto L_0x0465
        L_0x04bd:
            r1 = 1
            goto L_0x048f
        L_0x04bf:
            r3.add(r8)
            goto L_0x0426
        L_0x04c4:
            X.15G r0 = r2.A0K
            java.util.List r0 = r0.A07(r5)
            java.util.Iterator r1 = r0.iterator()
        L_0x04ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04e2
            java.lang.Object r0 = r1.next()
            X.23a r0 = (X.C441623a) r0
            X.1ps r0 = r2.A04(r0)
            r3.add(r0)
            goto L_0x04ce
        L_0x04e2:
            X.2By r0 = new X.2By
            r0.<init>(r4)
            java.util.Collections.sort(r3, r0)
            r6.put(r5, r3)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0015
            goto L_0x0aa8
        L_0x04f5:
            java.lang.Object r6 = r5.A00
            X.0pj r6 = (X.C14770pj) r6
            java.lang.Object r1 = r5.A01
            X.1s4 r1 = (X.C39191s4) r1
            X.1Vw r0 = r1.A11
            X.0rv r4 = r0.A00
            if (r4 == 0) goto L_0x0015
            int r0 = r1.A00
            r3 = 1
            if (r0 > r3) goto L_0x052c
            int r0 = r1.A01
            if (r0 == 0) goto L_0x052c
            X.15r r5 = r6.A0Q
            X.0pd r2 = r5.A01
            r1 = 1352(0x548, float:1.895E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x052c
            X.15S r1 = r5.A00
            java.lang.String r0 = "kic_notifications"
            r1.A00(r0)
            boolean r0 = X.C16030sJ.A0L(r4)
            if (r0 == 0) goto L_0x052c
            java.lang.String r0 = "kic_group_notifications"
            r1.A00(r0)
        L_0x052c:
            java.util.Map r7 = r6.A0U
            java.lang.Object r0 = r7.get(r4)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x053e
            java.util.List r0 = r6.A06(r4, r3)
            r7.put(r4, r0)
            return
        L_0x053e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0547:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0559
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C45962Bu
            if (r0 != 0) goto L_0x0547
            r5.add(r1)
            goto L_0x0547
        L_0x0559:
            X.15G r0 = r6.A0K
            java.util.List r0 = r0.A06(r4)
            java.util.Iterator r1 = r0.iterator()
        L_0x0563:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0577
            java.lang.Object r0 = r1.next()
            X.23Z r0 = (X.AnonymousClass23Z) r0
            X.1ps r0 = r6.A03(r0)
            r5.add(r0)
            goto L_0x0563
        L_0x0577:
            X.2By r0 = new X.2By
            r0.<init>(r3)
            java.util.Collections.sort(r5, r0)
            r7.put(r4, r5)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0015
            X.0yL r1 = r6.A0D
            java.lang.String r0 = X.C19380yL.A00(r4)
            r1.A03(r3, r0)
            return
        L_0x0592:
            java.lang.Object r1 = r5.A00
            X.0pj r1 = (X.C14770pj) r1
            java.lang.Object r0 = r5.A01
            X.0tZ r0 = (X.C16740tZ) r0
            if (r0 == 0) goto L_0x0015
            java.util.Map r1 = r1.A0U
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            X.AnonymousClass00B.A06(r0)
            r1.remove(r0)
            return
        L_0x05a9:
            java.lang.Object r7 = r5.A00
            com.obwhatsapp.migration.android.integration.service.GoogleMigrateService r7 = (com.obwhatsapp.migration.android.integration.service.GoogleMigrateService) r7
            java.lang.Object r6 = r5.A01
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            X.01V r0 = r7.A01
            android.os.PowerManager r2 = r0.A0I()
            java.lang.String r1 = "GoogleMigrateService/"
            if (r2 != 0) goto L_0x05c6
            java.lang.String r0 = "OsUtil/acquireWakeLock()/pm=null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r5 = 0
        L_0x05c1:
            java.lang.String r4 = "GoogleMigrateService/onStartCommand/wakelock released"
            if (r5 == 0) goto L_0x05d7
            goto L_0x05cc
        L_0x05c6:
            r0 = 1
            android.os.PowerManager$WakeLock r5 = X.C43421zy.A00(r2, r1, r0)
            goto L_0x05c1
        L_0x05cc:
            java.lang.String r0 = "GoogleMigrateService/onStartCommand/wakelock acquired"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x05db }
            r0 = 14400000(0xdbba00, double:7.1145453E-317)
            r5.acquire(r0)     // Catch:{ Exception -> 0x05db }
        L_0x05d7:
            r6.run()     // Catch:{ Exception -> 0x05db }
            goto L_0x05ec
        L_0x05db:
            r3 = move-exception
            X.0so r2 = r7.A00     // Catch:{ all -> 0x0abe }
            java.lang.String r1 = "xpm-gms-async"
            java.lang.Class r0 = r6.getClass()     // Catch:{ all -> 0x0abe }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0abe }
            r2.A03(r1, r0, r3)     // Catch:{ all -> 0x0abe }
        L_0x05ec:
            if (r5 == 0) goto L_0x0015
            boolean r0 = r5.isHeld()
            if (r0 == 0) goto L_0x0015
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r5.release()
            return
        L_0x05fb:
            java.lang.Object r0 = r5.A00
            X.0y3 r0 = (X.AnonymousClass0y3) r0
            java.lang.Object r3 = r5.A01
            X.2Fi r3 = (X.C46662Fi) r3
            X.17h r2 = r0.A0H
            X.0tZ r0 = r3.A05
            X.1Vw r1 = r0.A11
            com.whatsapp.jid.DeviceJid r0 = r3.A03
            r2.A00(r0, r1)
            java.lang.Runnable r0 = r3.A07
            if (r0 == 0) goto L_0x0015
            r0.run()
            return
        L_0x0616:
            java.lang.Object r4 = r5.A00
            X.13A r4 = (X.AnonymousClass13A) r4
            java.lang.Object r3 = r5.A01
            X.133 r0 = r4.A0G
            X.1WA r2 = r0.A00
            r1 = 0
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r0.<init>(r4, r1, r3)
            r2.execute(r0)
            return
        L_0x062a:
            java.lang.Object r0 = r5.A00
            X.2Tc r0 = (X.C49422Tc) r0
            java.lang.Object r1 = r5.A01
            java.util.Collection r1 = (java.util.Collection) r1
            X.0ul r4 = r0.A01
            X.0sL r3 = r0.A02
            java.lang.String r0 = "groupChatManger/onSubGroupsChanged"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0uk r0 = r4.A0B
            X.28n r0 = r0.A03
            X.15k r0 = r0.A04
            r0.A03(r3, r1)
            X.0pt r2 = r4.A07
            r1 = 30
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r0.<init>(r4, r1, r3)
            r2.A0K(r0)
            return
        L_0x0651:
            java.lang.Object r0 = r5.A00
            X.1TX r0 = (X.AnonymousClass1TX) r0
            java.lang.Object r2 = r5.A01
            X.0tZ r2 = (X.C16740tZ) r2
            X.0xq r1 = r0.A02
            r0 = -1
            r1.A08(r2, r0)
            return
        L_0x0660:
            java.lang.Object r7 = r5.A00
            X.1Sa r7 = (X.C27511Sa) r7
            java.lang.Object r6 = r5.A01
            X.2Td r6 = (X.C49432Td) r6
            X.0xU r5 = r7.A00
            boolean r0 = r5.A0X()
            if (r0 == 0) goto L_0x069e
            java.util.Set r0 = X.AnonymousClass1WJ.A08
            java.util.Iterator r4 = r0.iterator()
        L_0x0676:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x068a
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            X.11P r2 = r5.A0e
            r0 = 0
            r2.A04(r3, r0)
            goto L_0x0676
        L_0x068a:
            X.11P r0 = r5.A0e
            java.util.Map r3 = r0.A01()
            X.11Q r2 = r5.A0C
            r1 = 0
            com.facebook.redex.IDxObserverShape92S0200000_2_I1 r0 = new com.facebook.redex.IDxObserverShape92S0200000_2_I1
            r0.<init>(r3, r1, r5)
            r2.A02(r0)
            r5.A0O()
        L_0x069e:
            X.124 r2 = r7.A03
            java.lang.Long r1 = r6.A00
            java.lang.String r0 = "syncd_app_state"
            r2.A04(r0, r1)
            return
        L_0x06a9:
            java.lang.Object r0 = r5.A00
            X.2Te r0 = (X.C49442Te) r0
            java.lang.Object r2 = r5.A01
            X.0sH r2 = (X.C16010sH) r2
            X.0ub r1 = r0.A03
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r2.A08(r0)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            r1.A07(r0)
            return
        L_0x06bf:
            java.lang.Object r4 = r5.A00
            X.2Te r4 = (X.C49442Te) r4
            java.lang.Object r3 = r5.A01
            X.0xU r2 = r4.A01
            java.util.Set r1 = java.util.Collections.singleton(r3)
            r0 = 0
            r2.A0T(r1, r0)
            X.0pt r2 = r4.A00
            r1 = 41
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r0.<init>(r4, r1, r3)
            r2.A0K(r0)
            return
        L_0x06dc:
            java.lang.Object r0 = r5.A00
            X.12F r0 = (X.AnonymousClass12F) r0
            java.lang.Object r1 = r5.A01
            X.0rv r1 = (X.C15830rv) r1
            X.127 r0 = r0.A06
            r0.A04(r1)
            return
        L_0x06ea:
            java.lang.Object r0 = r5.A00
            X.12F r0 = (X.AnonymousClass12F) r0
            java.lang.Object r7 = r5.A01
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            X.128 r6 = r0.A0G
            java.util.List r5 = r6.A01(r7)
            java.util.Iterator r4 = r5.iterator()
        L_0x06fc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0710
            java.lang.Object r3 = r4.next()
            X.0tZ r3 = (X.C16740tZ) r3
            X.0t6 r2 = r6.A06
            r1 = 1
            r0 = 0
            r2.A0g(r3, r1, r0)
            goto L_0x06fc
        L_0x0710:
            X.11G r0 = r6.A0G
            r0.A03(r7)
            X.17E r0 = r6.A07
            android.os.Handler r2 = r0.A01
            r1 = 49
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4
            r0.<init>(r6, r1, r5)
            r2.post(r0)
            return
        L_0x0724:
            java.lang.Object r1 = r5.A00
            X.2HV r1 = (X.AnonymousClass2HV) r1
            java.lang.Object r0 = r5.A01
            java.lang.Exception r0 = (java.lang.Exception) r0
            r1.AQu(r0)
            return
        L_0x0730:
            java.lang.Object r2 = r5.A00
            X.1Qn r2 = (X.C27121Qn) r2
            java.lang.Object r1 = r5.A01
            X.2HV r1 = (X.AnonymousClass2HV) r1
            X.01J r0 = r2.A02
            java.lang.Object r0 = r0.get()
            X.13d r0 = (X.C211913d) r0
            r0.A04()
            X.01J r0 = r2.A04
            java.lang.Object r0 = r0.get()
            X.0uu r0 = (X.C17330uu) r0
            r0.A01()
            r1.onSuccess()
            return
        L_0x0752:
            java.lang.Object r2 = r5.A00
            X.2HV r2 = (X.AnonymousClass2HV) r2
            java.lang.Object r1 = r5.A01
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0 = 0
            X.C18450wi.A0H(r2, r0)
            r2.AQu(r1)
            return
        L_0x0762:
            java.lang.Object r3 = r5.A00
            X.1Qn r3 = (X.C27121Qn) r3
            java.lang.Object r2 = r5.A01
            X.2HV r2 = (X.AnonymousClass2HV) r2
            r0 = 1
            X.C18450wi.A0H(r2, r0)
            X.01J r0 = r3.A04
            java.lang.Object r1 = r0.get()
            X.0uu r1 = (X.C17330uu) r1
            X.2Tf r4 = new X.2Tf
            r4.<init>(r3, r2)
            X.28T r0 = r1.A00()
            if (r0 == 0) goto L_0x078c
            java.lang.String r1 = "Avatar user does exist"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            r4.AQu(r0)
            return
        L_0x078c:
            X.01D r0 = r1.A02
            java.lang.Object r3 = r0.get()
            X.14L r3 = (X.AnonymousClass14L) r3
            X.144 r2 = X.AnonymousClass146.A00
            r1 = 1
            com.facebook.redex.IDxECallbackShape326S0100000_2_I1 r0 = new com.facebook.redex.IDxECallbackShape326S0100000_2_I1
            r0.<init>(r4, r1)
            r3.A02(r0, r2)
            return
        L_0x07a0:
            java.lang.Object r3 = r5.A00
            X.1Qn r3 = (X.C27121Qn) r3
            java.lang.Object r2 = r5.A01
            X.2HV r2 = (X.AnonymousClass2HV) r2
            X.01J r0 = r3.A04
            java.lang.Object r1 = r0.get()
            X.0uu r1 = (X.C17330uu) r1
            X.2Tg r0 = new X.2Tg
            r0.<init>(r3, r2)
            r1.A03(r0)
            return
        L_0x07b9:
            java.lang.Object r2 = r5.A00
            X.1DN r2 = (X.AnonymousClass1DN) r2
            java.lang.Object r0 = r5.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 9
            r2.A03(r1, r0)
            return
        L_0x07cb:
            java.lang.Object r1 = r5.A00
            X.1WA r1 = (X.AnonymousClass1WA) r1
            java.lang.Object r0 = r5.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.execute(r0)
            return
        L_0x07d7:
            java.lang.Object r6 = r5.A00
            com.obwhatsapp.polls.PollResultsViewModel r6 = (com.obwhatsapp.polls.PollResultsViewModel) r6
            java.lang.Object r0 = r5.A01
            X.1s2 r0 = (X.C39171s2) r0
            r6.A02 = r0
            java.util.List r0 = r0.A05
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L_0x07e8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x07f8
            java.lang.Object r0 = r2.next()
            X.1sn r0 = (X.C39631sn) r0
            int r0 = r0.A00
            int r1 = r1 + r0
            goto L_0x07e8
        L_0x07f8:
            r6.A00 = r1
            X.1s2 r0 = r6.A02
            if (r0 == 0) goto L_0x08b7
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L_0x08b7
            java.util.Map r5 = r6.A0E
            r5.clear()
            X.1s2 r0 = r6.A02
            java.util.List r0 = r0.A04
            java.util.Iterator r11 = r0.iterator()
        L_0x080f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x08b7
            java.lang.Object r4 = r11.next()
            X.1qx r4 = (X.C38541qx) r4
            boolean r0 = r4 instanceof X.C39181s3
            if (r0 == 0) goto L_0x080f
            r13 = r4
            X.1s3 r13 = (X.C39181s3) r13
            java.util.List r0 = r13.A05
            java.util.Iterator r10 = r0.iterator()
        L_0x0828:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x080f
            java.lang.Object r0 = r10.next()
            java.lang.Object r3 = r5.get(r0)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x0842
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.put(r0, r3)
        L_0x0842:
            X.0tz r1 = r6.A07
            X.0sG r7 = r6.A05
            X.0sP r9 = r6.A06
            X.1Vw r0 = r4.A11
            boolean r2 = r0.A02
            java.lang.String r8 = ""
            if (r2 == 0) goto L_0x0887
            r0 = 2131893160(0x7f121ba8, float:1.9421089E38)
            java.lang.String r7 = r1.A02(r0)
        L_0x0857:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r7, r8)
        L_0x085c:
            java.lang.Object r14 = r0.first
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r0.second
            java.lang.String r15 = (java.lang.String) r15
            long r0 = r4.A0I
            X.2Th r12 = new X.2Th
            r18 = r2
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r18)
            r1 = 0
            if (r2 != 0) goto L_0x0883
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0883
            java.lang.Object r0 = r3.get(r1)
            X.2Th r0 = (X.C49472Th) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0883
            r1 = 1
        L_0x0883:
            r3.add(r1, r12)
            goto L_0x0828
        L_0x0887:
            X.0rv r1 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 == 0) goto L_0x0893
            X.0rv r1 = r4.A0B()
        L_0x0893:
            if (r1 != 0) goto L_0x089b
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r8, r8)
            goto L_0x085c
        L_0x089b:
            X.0sH r1 = r7.A0A(r1)
            r0 = 0
            X.0sQ r0 = r9.A07(r1, r0)
            java.lang.String r7 = r0.A01
            if (r7 == 0) goto L_0x08ae
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0857
        L_0x08ae:
            java.lang.String r7 = r9.A08(r1)
            java.lang.String r8 = r9.A0F(r1)
            goto L_0x0857
        L_0x08b7:
            long r3 = r6.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x08c3
            r6.A05()
            return
        L_0x08c3:
            r6.A06(r3)
            return
        L_0x08c7:
            java.lang.Object r3 = r5.A00
            X.39C r3 = (X.AnonymousClass39C) r3
            java.lang.Object r2 = r5.A01
            java.lang.String r1 = "client"
            X.1Jq r0 = new X.1Jq
            r0.<init>(r1, r2)
            java.util.Map r0 = X.C25421Js.A09(r0)
            r3.A01(r0)
            return
        L_0x08dc:
            java.lang.Object r0 = r5.A00
            X.2Tj r0 = (X.C49492Tj) r0
            java.lang.Object r1 = r5.A01
            X.2If r1 = (X.C47252If) r1
            X.12h r0 = r0.A01
            r0.A04(r1)
            return
        L_0x08ea:
            java.lang.Object r1 = r5.A00
            X.12h r1 = (X.C209712h) r1
            java.lang.Object r0 = r5.A01
            X.2If r0 = (X.C47252If) r0
            r1.A04(r0)
            return
        L_0x08f6:
            java.lang.Object r0 = r5.A00
            X.13O r0 = (X.AnonymousClass13O) r0
            java.lang.Object r2 = r5.A01
            X.1Vv r2 = (X.C28371Vv) r2
            X.1Tw r1 = r0.A09
            r0 = 0
            r1.A04(r0, r2)
            return
        L_0x0905:
            java.lang.Object r0 = r5.A00
            X.13O r0 = (X.AnonymousClass13O) r0
            java.lang.Object r1 = r5.A01
            X.1Vt r1 = (X.AnonymousClass1Vt) r1
            X.17Y r0 = r0.A0C
            r0.A04(r1)
            return
        L_0x0913:
            java.lang.Object r1 = r5.A00
            X.19i r1 = (X.C228019i) r1
            java.lang.Object r0 = r5.A01
            X.2SE r0 = (X.AnonymousClass2SE) r0
            r0.AUd()
            X.0pt r0 = r1.A00
            r0.A05()
            return
        L_0x0924:
            java.lang.Object r1 = r5.A00
            X.2HA r1 = (X.AnonymousClass2HA) r1
            java.lang.Object r0 = r5.A01
            X.1Vv r0 = (X.C28371Vv) r0
            r1.A05(r0)
            return
        L_0x0930:
            java.lang.Object r1 = r5.A00
            X.2HA r1 = (X.AnonymousClass2HA) r1
            java.lang.Object r0 = r5.A01
            X.2HJ r0 = (X.AnonymousClass2HJ) r0
            r1.A03(r0)
            return
        L_0x093c:
            java.lang.Object r1 = r5.A00
            X.2HA r1 = (X.AnonymousClass2HA) r1
            java.lang.Object r0 = r5.A01
            X.2HJ r0 = (X.AnonymousClass2HJ) r0
            r1.A04(r0)
            return
        L_0x0948:
            java.lang.Object r6 = r5.A00
            X.107 r6 = (X.AnonymousClass107) r6
            java.lang.Object r0 = r5.A01
            X.1Vt r0 = (X.AnonymousClass1Vt) r0
            java.lang.String r3 = r0.A0K
            monitor-enter(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x09a2 }
            if (r0 == 0) goto L_0x0961
            X.1Vo r1 = r6.A08     // Catch:{ all -> 0x09a2 }
            java.lang.String r0 = "addUnreadMessagelessPaymentTransaction empty transaction id"
            r1.A05(r0)     // Catch:{ all -> 0x09a2 }
            goto L_0x099d
        L_0x0961:
            X.11I r5 = r6.A05     // Catch:{ all -> 0x09a2 }
            java.lang.String r4 = "unread_messageless_transaction_ids"
            java.lang.String r0 = r5.A02(r4)     // Catch:{ all -> 0x09a2 }
            if (r0 != 0) goto L_0x096e
            java.lang.String r0 = ""
        L_0x096e:
            java.lang.String r2 = ";"
            java.lang.String[] r0 = android.text.TextUtils.split(r0, r2)     // Catch:{ all -> 0x09a2 }
            java.util.List r1 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x09a2 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x09a2 }
            r0.<init>(r1)     // Catch:{ all -> 0x09a2 }
            r0.add(r3)     // Catch:{ all -> 0x09a2 }
            java.lang.String r3 = android.text.TextUtils.join(r2, r0)     // Catch:{ all -> 0x09a2 }
            X.1Vo r2 = r6.A08     // Catch:{ all -> 0x09a2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x09a2 }
            r1.<init>()     // Catch:{ all -> 0x09a2 }
            java.lang.String r0 = "addUnreadMessagelessPaymentTransaction/unreadTransactions:"
            r1.append(r0)     // Catch:{ all -> 0x09a2 }
            r1.append(r3)     // Catch:{ all -> 0x09a2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x09a2 }
            r2.A06(r0)     // Catch:{ all -> 0x09a2 }
            r5.A06(r4, r3)     // Catch:{ all -> 0x09a2 }
        L_0x099d:
            monitor-exit(r6)
            r6.A01()
            return
        L_0x09a2:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x09a5:
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.notification.AndroidWear r2 = (com.obwhatsapp.notification.AndroidWear) r2
            java.lang.Object r1 = r5.A01
            X.0sH r1 = (X.C16010sH) r1
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r4 = r1.A08(r0)
            X.0rv r4 = (X.C15830rv) r4
            X.15I r1 = r2.A04
            r0 = 7
            r1.A09(r4, r0)
            X.10Y r3 = r2.A03
            r5 = 1
            r6 = 1
            r7 = 1
            r8 = 1
            r3.A01(r4, r5, r6, r7, r8)
            r2.A03()
            return
        L_0x09c8:
            java.lang.Object r3 = r5.A00
            android.content.Context r3 = (android.content.Context) r3
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.corruptinstallation.CorruptInstallationActivity"
            r2.setClassName(r1, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r2.setFlags(r0)
            r3.startActivity(r0)
            return
        L_0x09e4:
            java.lang.Object r6 = r5.A00
            X.1SY r6 = (X.AnonymousClass1SY) r6
            java.lang.Object r4 = r5.A01
            X.1ci r4 = (X.C30641ci) r4
            X.1SX r7 = r6.A00
            com.whatsapp.jid.Jid r0 = r4.A01
            com.whatsapp.jid.DeviceJid r5 = com.whatsapp.jid.DeviceJid.of(r0)
            X.AnonymousClass00B.A06(r5)
            java.lang.String r2 = r4.A07
            X.AnonymousClass00B.A06(r2)
            java.lang.String r0 = "PeerMessageReceiptHandler/handleDeliveryReceipt/peerDevice: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = "; msgId: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19M r3 = r7.A01
            X.1bL r2 = r3.A03(r5, r2)
            if (r2 != 0) goto L_0x0a28
            java.lang.String r0 = "PeerMessageReceiptHandler/handleDeliveryReceipt/no such message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0a22:
            X.124 r0 = r6.A01
            r0.A02(r4)
            return
        L_0x0a28:
            boolean r0 = r2 instanceof X.C29871bM
            if (r0 == 0) goto L_0x0a38
            java.lang.String r0 = "PeerMessageReceiptHandler/handleDeliveryReceipt/skipping history sync notification message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.19E r1 = r7.A00
            r0 = -1
            r1.A0E(r2, r0)
            goto L_0x0a22
        L_0x0a38:
            long r0 = r2.A13
            X.AnonymousClass00B.A00()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r3.A06(r0)
            goto L_0x0a22
        L_0x0a49:
            java.lang.Object r0 = r5.A00
            X.1dJ r0 = (X.C31001dJ) r0
            java.lang.Object r2 = r5.A01
            X.1br r2 = (X.C30161br) r2
            X.1Sd r1 = r0.A04
            r0 = 0
            r1.A00(r0, r2)
            return
        L_0x0a58:
            java.lang.Object r0 = r5.A00
            X.1SV r0 = (X.AnonymousClass1SV) r0
            java.lang.Object r1 = r5.A01
            java.util.List r1 = (java.util.List) r1
            X.1Gg r0 = r0.A06
            r0.A01(r1)
            return
        L_0x0a66:
            r3 = move-exception
            java.lang.String r0 = "blacknoise/exception on certificate chain retrieval"
            com.whatsapp.util.Log.e(r0, r3)
            X.01K r2 = r7.A04
            java.lang.String r0 = "unable to retrieve certificate chain: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "attestation-nocertchain"
            r2.AcB(r0, r1, r6)
        L_0x0a86:
            java.lang.String r0 = "blacknoise: got null attestation chain in custom stanza"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0a8c:
            r0 = move-exception
            if (r2 == 0) goto L_0x0a92
            r2.unlock()
        L_0x0a92:
            throw r0
        L_0x0a93:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0a96:
            java.lang.Object r2 = r5.A00
            X.0pj r2 = (X.C14770pj) r2
            java.lang.Object r5 = r5.A01
            X.0rv r5 = (X.C15830rv) r5
            java.util.Map r1 = r2.A0U
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.put(r5, r0)
        L_0x0aa8:
            X.0yL r2 = r2.A0D
            goto L_0x0ab5
        L_0x0aab:
            java.lang.Object r0 = r5.A00
            X.0pj r0 = (X.C14770pj) r0
            java.lang.Object r5 = r5.A01
            X.0rv r5 = (X.C15830rv) r5
            X.0yL r2 = r0.A0D
        L_0x0ab5:
            java.lang.String r1 = X.C19380yL.A00(r5)
            r0 = 1
            r2.A03(r0, r1)
            return
        L_0x0abe:
            r1 = move-exception
            if (r5 == 0) goto L_0x0acd
            boolean r0 = r5.isHeld()
            if (r0 == 0) goto L_0x0acd
            com.whatsapp.util.Log.i((java.lang.String) r4)
            r5.release()
        L_0x0acd:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape9S0200000_I0_7.run():void");
    }
}
