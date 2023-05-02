package com.facebook.redex;

import X.AnonymousClass1RS;
import X.C23321Bn;
import X.C29651ay;
import java.util.concurrent.atomic.AtomicBoolean;

public class RunnableRunnableShape0S0400000_I0 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RunnableRunnableShape0S0400000_I0(AnonymousClass1RS r2, C23321Bn r3) {
        this((C29651ay) null, r2, r3);
        this.A04 = 16;
    }

    public RunnableRunnableShape0S0400000_I0(C29651ay r2, AnonymousClass1RS r3, C23321Bn r4) {
        this.A04 = 16;
        this.A01 = new AtomicBoolean();
        this.A02 = r4;
        this.A03 = r3;
        this.A00 = r2;
    }

    public RunnableRunnableShape0S0400000_I0(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A04 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:1204:0x20e8  */
    /* JADX WARNING: Removed duplicated region for block: B:1207:0x20ee  */
    /* JADX WARNING: Removed duplicated region for block: B:1210:0x2119  */
    /* JADX WARNING: Removed duplicated region for block: B:1279:0x2346  */
    /* JADX WARNING: Removed duplicated region for block: B:1367:0x260f A[Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1369:0x261e A[Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04ef A[Catch:{ Exception -> 0x066b }, LOOP:3: B:166:0x04e9->B:168:0x04ef, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0547 A[Catch:{ Exception -> 0x066b }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x054a A[Catch:{ Exception -> 0x066b }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0597  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0865  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:1427:0x27bb=Splitter:B:1427:0x27bb, B:1405:0x277e=Splitter:B:1405:0x277e} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:44:0x0118=Splitter:B:44:0x0118, B:38:0x00e9=Splitter:B:38:0x00e9} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:984:0x1989=Splitter:B:984:0x1989, B:977:0x197e=Splitter:B:977:0x197e} */
    public void run() {
        /*
            r62 = this;
            r2 = 0
            r21 = 0
            r0 = r62
            int r1 = r0.A04
            switch(r1) {
                case 0: goto L_0x009a;
                case 1: goto L_0x16bd;
                case 2: goto L_0x00f2;
                case 3: goto L_0x16da;
                case 4: goto L_0x16f2;
                case 5: goto L_0x170a;
                case 6: goto L_0x1722;
                case 7: goto L_0x1755;
                case 8: goto L_0x012f;
                case 9: goto L_0x018f;
                case 10: goto L_0x1774;
                case 11: goto L_0x178a;
                case 12: goto L_0x17ba;
                case 13: goto L_0x17fb;
                case 14: goto L_0x1a3a;
                case 15: goto L_0x1a6f;
                case 16: goto L_0x0322;
                case 17: goto L_0x229d;
                case 18: goto L_0x06b2;
                case 19: goto L_0x23dd;
                case 20: goto L_0x246e;
                case 21: goto L_0x2494;
                case 22: goto L_0x24f2;
                case 23: goto L_0x2565;
                case 24: goto L_0x2575;
                case 25: goto L_0x06e7;
                case 26: goto L_0x25ae;
                case 27: goto L_0x0748;
                case 28: goto L_0x25c4;
                case 29: goto L_0x2689;
                case 30: goto L_0x09d7;
                case 31: goto L_0x26ba;
                case 32: goto L_0x0a03;
                case 33: goto L_0x146c;
                case 34: goto L_0x26ce;
                case 35: goto L_0x14fb;
                case 36: goto L_0x1668;
                case 37: goto L_0x26e8;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Object r8 = r0.A00
            X.1az r8 = (X.C29661az) r8
            java.lang.Object r3 = r0.A01
            java.lang.Object r1 = r0.A02
            X.1b0 r1 = (X.C29671b0) r1
            java.lang.Object r0 = r0.A03
            X.1b0 r0 = (X.C29671b0) r0
            X.0q4 r4 = X.AnonymousClass1K6.A02(r3)
            java.util.Map r3 = java.util.Collections.emptyMap()
            X.0q1 r1 = r1.A9V()
            X.0q1 r0 = r0.A9V()
            r7 = 0
            if (r1 != 0) goto L_0x0094
            r6 = r7
        L_0x002c:
            if (r0 == 0) goto L_0x0033
            X.1b1 r7 = new X.1b1
            r7.<init>((X.C14960q4) r4, (X.C14930q1) r0)
        L_0x0033:
            X.0q7 r5 = r4.A00
            if (r5 != 0) goto L_0x003f
            java.lang.String r1 = "BloksAsyncAction"
            java.lang.String r0 = "Async action executed with a null Context"
        L_0x003b:
            X.C29691b2.A00(r1, r0)
        L_0x003e:
            return
        L_0x003f:
            X.0q4 r4 = X.C29701b3.A00(r8, r5, r3)
            X.0q1 r3 = r8.A01
            if (r3 == 0) goto L_0x0079
            X.0q2 r0 = new X.0q2
            r0.<init>()
            r0.A02(r5, r2)
            java.util.List r1 = r0.A00
            X.0q3 r0 = new X.0q3
            r0.<init>(r1)
            java.lang.Object r0 = X.C14980q6.A00(r4, r0, r3)
            if (r6 == 0) goto L_0x003e
            X.0q2 r1 = new X.0q2
            r1.<init>()
            r1.A02(r0, r2)
            r0 = 1
            r1.A02(r5, r0)
            java.util.List r0 = r1.A00
            X.0q3 r2 = new X.0q3
            r2.<init>(r0)
            X.0q1 r1 = r6.A01
            X.0q4 r0 = r6.A00
        L_0x0073:
            if (r0 == 0) goto L_0x008f
            X.C14980q6.A00(r0, r2, r1)
            return
        L_0x0079:
            if (r7 == 0) goto L_0x003e
            X.0q2 r0 = new X.0q2
            r0.<init>()
            r0.A02(r5, r2)
            java.util.List r0 = r0.A00
            X.0q3 r2 = new X.0q3
            r2.<init>(r0)
            X.0q1 r1 = r7.A01
            X.0q4 r0 = r7.A00
            goto L_0x0073
        L_0x008f:
            java.lang.String r1 = "BloksCallback"
            java.lang.String r0 = "An attempt to invoke an invalid callback"
            goto L_0x003b
        L_0x0094:
            X.1b1 r6 = new X.1b1
            r6.<init>((X.C14960q4) r4, (X.C14930q1) r1)
            goto L_0x002c
        L_0x009a:
            java.lang.Object r4 = r0.A00
            X.0qX r4 = (X.C15230qX) r4
            java.lang.Object r5 = r0.A01
            X.1b4 r5 = (X.C29711b4) r5
            java.lang.Object r6 = r0.A03
            X.0qe r6 = (X.C15300qe) r6
            java.lang.Object r3 = r0.A02
            java.io.File r3 = (java.io.File) r3
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003e }
            r2.<init>()     // Catch:{ JSONException -> 0x003e }
            X.0qa r0 = r6.A01     // Catch:{ JSONException -> 0x003e }
            if (r0 == 0) goto L_0x00bd
            org.json.JSONObject r1 = r0.Agp()     // Catch:{ JSONException -> 0x003e }
            java.lang.String r0 = "size_config"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x003e }
        L_0x00bd:
            X.0qd r0 = r6.A02     // Catch:{ JSONException -> 0x003e }
            if (r0 == 0) goto L_0x00cb
            org.json.JSONObject r1 = r0.Agp()     // Catch:{ JSONException -> 0x003e }
            java.lang.String r0 = "staleness_config"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x003e }
        L_0x00cb:
            java.lang.String r1 = r6.A03     // Catch:{ JSONException -> 0x003e }
            java.lang.String r0 = "eviction_type"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x003e }
            java.lang.String r1 = r6.A00     // Catch:{ JSONException -> 0x003e }
            if (r1 == 0) goto L_0x00db
            java.lang.String r0 = "cache_name"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x003e }
        L_0x00db:
            java.lang.String r1 = "feature_name"
            java.lang.String r0 = r5.A00     // Catch:{ JSONException -> 0x003e }
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x003e }
            X.0qZ r1 = r4.A02     // Catch:{ JSONException -> 0x003e }
            java.lang.String r0 = r3.getCanonicalPath()     // Catch:{ IOException -> 0x00e9 }
            goto L_0x00ed
        L_0x00e9:
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ JSONException -> 0x003e }
        L_0x00ed:
            r1.A03(r0, r2)     // Catch:{ JSONException -> 0x003e }
            goto L_0x27bc
        L_0x00f2:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Object r7 = r0.A02
            java.io.File r7 = (java.io.File) r7
            r7.setLastModified(r3)
            java.lang.Object r6 = r0.A00
            X.0qo r6 = (X.C15400qo) r6
            java.lang.Object r1 = r0.A01
            X.1b4 r1 = (X.C29711b4) r1
            java.lang.String r5 = r1.A00
            java.lang.Object r2 = r0.A03
            X.0qd r2 = (X.C15290qd) r2
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            X.0qp r0 = new X.0qp
            r0.<init>(r2, r5, r3)
            java.lang.String r4 = r7.getCanonicalPath()     // Catch:{ IOException -> 0x0118 }
            goto L_0x011c
        L_0x0118:
            java.lang.String r4 = r7.getAbsolutePath()     // Catch:{ JSONException -> 0x003e }
        L_0x011c:
            org.json.JSONObject r3 = r0.Agp()     // Catch:{ JSONException -> 0x003e }
            java.lang.String r2 = "usage_timestamp_s"
            long r0 = r0.A00     // Catch:{ JSONException -> 0x003e }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x003e }
            X.0qZ r0 = r6.A00     // Catch:{ JSONException -> 0x003e }
            r0.A03(r4, r3)     // Catch:{ JSONException -> 0x003e }
            goto L_0x27bd
        L_0x012f:
            java.lang.Object r5 = r0.A00
            X.1b5 r5 = (X.C29721b5) r5
            java.lang.Object r1 = r0.A01
            X.1b8 r1 = (X.C29751b8) r1
            java.lang.Object r3 = r0.A02
            byte[] r3 = (byte[]) r3
            java.lang.Object r13 = r0.A03
            X.1b9 r13 = (X.C29761b9) r13
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r8 = r1.A00
            r0 = 73
            long r0 = (long) r0
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r2, r0, r8)
            byte[] r0 = (byte[]) r0
            r7 = 16
            byte[] r12 = java.util.Arrays.copyOfRange(r0, r2, r7)
            java.lang.String r9 = "EncBackupManager/retrieveBackupKey/parseLoginPayload/exception."
            X.1bB r0 = X.C29771bB.A03     // Catch:{ 1bD -> 0x2821 }
            X.1Wm r1 = X.C28541Wm.A0E(r0, r3)     // Catch:{ 1bD -> 0x2821 }
            X.1bB r1 = (X.C29771bB) r1     // Catch:{ 1bD -> 0x2821 }
            X.1Ww r0 = r1.A01     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x282d }
            byte[] r11 = r0.A04()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x282d }
            X.1Ww r0 = r1.A02     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x282d }
            byte[] r0 = r0.A04()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x282d }
            java.lang.String r10 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r10)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x282d }
            java.lang.String r6 = "AES"
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x282d }
            r3.<init>(r12, r6)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x282d }
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x282d }
            r1.<init>(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x282d }
            r0 = 2
            r4.init(r0, r3, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x282d }
            byte[] r1 = r4.doFinal(r11)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x282d }
            X.1bC r0 = X.C29781bC.A03     // Catch:{ 1bD -> 0x2815 }
            X.1Wm r3 = X.C28541Wm.A0E(r0, r1)     // Catch:{ 1bD -> 0x2815 }
            X.1bC r3 = (X.C29781bC) r3     // Catch:{ 1bD -> 0x2815 }
            if (r3 == 0) goto L_0x003e
            goto L_0x27be
        L_0x018f:
            java.lang.Object r6 = r0.A00
            X.1bE r6 = (X.C29801bE) r6
            java.lang.Object r5 = r0.A01
            byte[] r5 = (byte[]) r5
            java.lang.Object r4 = r0.A02
            byte[] r4 = (byte[]) r4
            java.lang.Object r7 = r0.A03
            byte[] r7 = (byte[]) r7
            java.lang.Object r3 = r6.A0C
            monitor-enter(r3)
            byte[] r8 = r6.A05     // Catch:{ all -> 0x284e }
            X.1bF r9 = r6.A01     // Catch:{ all -> 0x284e }
            monitor-exit(r3)     // Catch:{ all -> 0x284e }
            r1 = 1
            r0 = 0
            if (r8 == 0) goto L_0x01ac
            r0 = 1
        L_0x01ac:
            X.AnonymousClass00B.A0G(r0)
            if (r9 != 0) goto L_0x01b2
            r1 = 0
        L_0x01b2:
            X.AnonymousClass00B.A0G(r1)
            X.1bG r10 = r6.A08
            r0 = 100000(0x186a0, float:1.4013E-40)
            long r0 = (long) r0
            com.facebook.simplejni.NativeHolder r11 = r9.A00
            r9 = 2
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIOO(r9, r0, r11, r4)
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1
            X.1bH r0 = new X.1bH
            r0.<init>(r1)
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r9 = r0.A00
            r0 = 83
            long r0 = (long) r0
            r11 = 1
            long r0 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r11, r0, r9)
            int r11 = (int) r0
            if (r11 == 0) goto L_0x01e0
            r1 = 4
        L_0x01da:
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r10.A00
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel.A01(r0, r1)
            return
        L_0x01e0:
            com.whatsapp.wamsys.JniBridge.getInstance()
            r0 = 84
            long r0 = (long) r0
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r2, r0, r9)
            byte[] r1 = (byte[]) r1
            r0 = 16
            r16 = 0
            byte[] r14 = java.util.Arrays.copyOfRange(r1, r2, r0)
            com.whatsapp.wamsys.JniBridge.getInstance()
            r0 = 85
            long r0 = (long) r0
            java.lang.Object r11 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r2, r0, r9)
            byte[] r11 = (byte[]) r11
            X.0sd r0 = r6.A07     // Catch:{ IOException -> 0x0315 }
            X.0sk r1 = r0.A01     // Catch:{ IOException -> 0x0315 }
            byte[] r15 = r1.A03()     // Catch:{ IOException -> 0x0315 }
            if (r15 != 0) goto L_0x0213
            r0 = 32
            byte[] r15 = X.C004101u.A0E(r0)     // Catch:{ IOException -> 0x0315 }
            r1.A02(r15)     // Catch:{ IOException -> 0x0315 }
        L_0x0213:
            r0 = 12
            byte[] r13 = X.C004101u.A0E(r0)
            int r9 = r15.length     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0308 }
            r1 = 32
            r0 = 0
            if (r9 != r1) goto L_0x0220
            r0 = 1
        L_0x0220:
            X.AnonymousClass00B.A0F(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0308 }
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r12 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0308 }
            java.lang.String r0 = "AES"
            javax.crypto.spec.SecretKeySpec r9 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0308 }
            r9.<init>(r14, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0308 }
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0308 }
            r1.<init>(r13)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0308 }
            r0 = 1
            r12.init(r0, r9, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0308 }
            byte[] r9 = r12.doFinal(r15)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0308 }
            int r1 = r9.length     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0308 }
            r0 = 48
            if (r1 != r0) goto L_0x0244
            r16 = 1
        L_0x0244:
            X.AnonymousClass00B.A0F(r16)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0308 }
            X.1bC r0 = X.C29781bC.A03     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Wr r12 = r0.A0U()     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Ww r9 = X.C28631Ww.A01(r9, r2, r1)     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r12.A03()     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Wm r1 = r12.A00     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1bC r1 = (X.C29781bC) r1     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            int r0 = r1.A00     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r0 = r0 | 1
            r1.A00 = r0     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r1.A01 = r9     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            int r0 = r13.length     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Ww r9 = X.C28631Ww.A01(r13, r2, r0)     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r12.A03()     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Wm r1 = r12.A00     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1bC r1 = (X.C29781bC) r1     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            int r0 = r1.A00     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r0 = r0 | 2
            r1.A00 = r0     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r1.A02 = r9     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Wm r0 = r12.A02()     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            byte[] r1 = r0.A02()     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r9.<init>()     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r9.write(r5)     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r9.write(r4)     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r9.write(r7)     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1bJ r0 = X.C29841bJ.A05     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Wr r4 = r0.A0U()     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            int r0 = r1.length     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Ww r5 = X.C28631Ww.A01(r1, r2, r0)     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r4.A03()     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Wm r1 = r4.A00     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1bJ r1 = (X.C29841bJ) r1     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            int r0 = r1.A00     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r0 = r0 | 1
            r1.A00 = r0     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r1.A01 = r5     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            int r0 = r11.length     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Ww r5 = X.C28631Ww.A01(r11, r2, r0)     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r4.A03()     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Wm r1 = r4.A00     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1bJ r1 = (X.C29841bJ) r1     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            int r0 = r1.A00     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r0 = r0 | 2
            r1.A00 = r0     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r1.A03 = r5     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            int r0 = r7.length     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Ww r5 = X.C28631Ww.A01(r7, r2, r0)     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r4.A03()     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Wm r1 = r4.A00     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1bJ r1 = (X.C29841bJ) r1     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            int r0 = r1.A00     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r0 = r0 | 4
            r1.A00 = r0     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r1.A02 = r5     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            byte[] r1 = r9.toByteArray()     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0301, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r0.update(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0301, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            byte[] r1 = r0.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0301, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            int r0 = r1.length     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Ww r2 = X.C28631Ww.A01(r1, r2, r0)     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r4.A03()     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Wm r1 = r4.A00     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1bJ r1 = (X.C29841bJ) r1     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            int r0 = r1.A00     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r0 = r0 | 8
            r1.A00 = r0     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r1.A04 = r2     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            X.1Wm r0 = r4.A02()     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            byte[] r0 = r0.A02()     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            byte[] r0 = X.C16940tv.A04(r0, r8)     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            if (r0 == 0) goto L_0x003e
            goto L_0x2840
        L_0x0301:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
            throw r0     // Catch:{ IOException -> 0x0319, InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x030c }
        L_0x0308:
            r1 = move-exception
            java.lang.String r0 = "EncBackupManager/createEncRegPayload/aesEncrypt/exception."
            goto L_0x030f
        L_0x030c:
            r1 = move-exception
            java.lang.String r0 = "EncBackupManager/createEncRegPayload/rsaEncrypt/exception."
        L_0x030f:
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 5
            goto L_0x01da
        L_0x0315:
            r1 = move-exception
            java.lang.String r0 = "EncBackupManager/createEncRegPayload/getAndSaveRootKey/exception."
            goto L_0x031c
        L_0x0319:
            r1 = move-exception
            java.lang.String r0 = "EncBackupManager/createEncRegPayload/createTranscript/exception."
        L_0x031c:
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 6
            goto L_0x01da
        L_0x0322:
            java.lang.Object r1 = r0.A03
            r23 = r1
            r1 = r23
            X.1RS r1 = (X.AnonymousClass1RS) r1
            r23 = r1
        L_0x032c:
            X.1bK r1 = r23.A00()
            if (r1 == 0) goto L_0x069e
            java.lang.Object r3 = r0.A01
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            boolean r3 = r3.get()
            if (r3 != 0) goto L_0x069e
            java.lang.Object r7 = r0.A02
            X.1Bn r7 = (X.C23321Bn) r7
            long r3 = r1.A05
            r41 = 0
            r22 = 0
            int r5 = (r3 > r41 ? 1 : (r3 == r41 ? 0 : -1))
            if (r5 < 0) goto L_0x0427
            X.19M r5 = r7.A0M
            X.1bL r3 = r5.A02(r3)
            X.1bM r3 = (X.C29871bM) r3
            if (r3 == 0) goto L_0x0675
            X.0t6 r8 = r7.A0A
            long r9 = r3.A08
            long r11 = r3.A06
            long r13 = r3.A0I
            android.database.Cursor r10 = r8.A09(r9, r11, r13)
            if (r10 == 0) goto L_0x0675
            X.0ur r5 = r7.A0T     // Catch:{ all -> 0x2851 }
            r4 = r22
            java.util.Map r9 = r5.A04(r10, r4)     // Catch:{ all -> 0x2851 }
            int r11 = r10.getCount()     // Catch:{ all -> 0x2851 }
            X.1bP r4 = X.C29901bP.A0D     // Catch:{ all -> 0x2851 }
            X.1Wr r6 = r4.A0U()     // Catch:{ all -> 0x2851 }
            X.1bQ r6 = (X.C29911bQ) r6     // Catch:{ all -> 0x2851 }
            int r4 = r3.A03     // Catch:{ all -> 0x2851 }
            X.1bR r4 = X.C23321Bn.A00(r4)     // Catch:{ all -> 0x2851 }
            r6.A07(r4)     // Catch:{ all -> 0x2851 }
            int r4 = r3.A00     // Catch:{ all -> 0x2851 }
            r6.A05(r4)     // Catch:{ all -> 0x2851 }
            int r8 = r3.A01     // Catch:{ all -> 0x2851 }
            r6.A03()     // Catch:{ all -> 0x2851 }
            X.1Wm r5 = r6.A00     // Catch:{ all -> 0x2851 }
            X.1bP r5 = (X.C29901bP) r5     // Catch:{ all -> 0x2851 }
            int r4 = r5.A01     // Catch:{ all -> 0x2851 }
            r4 = r4 | 4
            r5.A01 = r4     // Catch:{ all -> 0x2851 }
            r5.A03 = r8     // Catch:{ all -> 0x2851 }
            java.util.Set r4 = r9.entrySet()     // Catch:{ all -> 0x2851 }
            java.util.Iterator r14 = r4.iterator()     // Catch:{ all -> 0x2851 }
        L_0x039d:
            boolean r4 = r14.hasNext()     // Catch:{ all -> 0x2851 }
            if (r4 == 0) goto L_0x03cf
            java.lang.Object r4 = r14.next()     // Catch:{ all -> 0x2851 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x2851 }
            java.lang.Object r13 = r4.getValue()     // Catch:{ all -> 0x2851 }
            X.1bS r13 = (X.C29931bS) r13     // Catch:{ all -> 0x2851 }
            java.lang.Object r12 = r4.getKey()     // Catch:{ all -> 0x2851 }
            X.0rv r12 = (X.C15830rv) r12     // Catch:{ all -> 0x2851 }
            long r8 = r3.A08     // Catch:{ all -> 0x2851 }
            long r4 = r3.A09     // Catch:{ all -> 0x2851 }
            r15 = r7
            r16 = r12
            r17 = r13
            r18 = r8
            r20 = r4
            r15.A03(r16, r17, r18, r20)     // Catch:{ all -> 0x2851 }
            X.1Wm r4 = r13.A02()     // Catch:{ all -> 0x2851 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ all -> 0x2851 }
            r6.A06(r4)     // Catch:{ all -> 0x2851 }
            goto L_0x039d
        L_0x03cf:
            java.lang.String r8 = r3.A0G     // Catch:{ all -> 0x2851 }
            if (r8 == 0) goto L_0x03dd
            java.lang.String r4 = r3.A0F     // Catch:{ all -> 0x2851 }
            if (r4 == 0) goto L_0x03dd
            X.1WM r5 = new X.1WM     // Catch:{ all -> 0x2851 }
            r5.<init>(r8, r4)     // Catch:{ all -> 0x2851 }
            goto L_0x03de
        L_0x03dd:
            r5 = 0
        L_0x03de:
            com.whatsapp.jid.DeviceJid r4 = r3.A00     // Catch:{ Exception -> 0x041f }
            r20 = r4
            X.AnonymousClass00B.A06(r20)     // Catch:{ Exception -> 0x041f }
            int r4 = r3.A00     // Catch:{ Exception -> 0x041f }
            r19 = r4
            int r4 = r3.A03     // Catch:{ Exception -> 0x041f }
            r18 = r4
            int r4 = r3.A01     // Catch:{ Exception -> 0x041f }
            r17 = r4
            int r4 = r3.A02     // Catch:{ Exception -> 0x041f }
            int r32 = r4 + 1
            long r14 = r3.A08     // Catch:{ Exception -> 0x041f }
            long r12 = r3.A06     // Catch:{ Exception -> 0x041f }
            long r8 = r3.A09     // Catch:{ Exception -> 0x041f }
            X.1Vw r3 = r3.A11     // Catch:{ Exception -> 0x041f }
            java.lang.String r3 = r3.A01     // Catch:{ Exception -> 0x041f }
            r16 = r3
            long r3 = (long) r11     // Catch:{ Exception -> 0x041f }
            r24 = r7
            r25 = r5
            r26 = r20
            r27 = r6
            r28 = r16
            r29 = r19
            r30 = r18
            r31 = r17
            r33 = r14
            r35 = r12
            r37 = r8
            r39 = r3
            r24.A01(r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r37, r39, r41)     // Catch:{ Exception -> 0x041f }
            goto L_0x0672
        L_0x041f:
            r4 = move-exception
            java.lang.String r3 = "history-sync-send-methods/resend-msg-history-chunk failed"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x2851 }
            goto L_0x0672
        L_0x0427:
            int r3 = r1.A00
            int r21 = r3 + 1
            long r10 = r1.A04
            r54 = r10
            java.util.Map r16 = java.util.Collections.emptyMap()
            long r14 = r1.A09     // Catch:{ Exception -> 0x066b }
            int r3 = (r14 > r41 ? 1 : (r14 == r41 ? 0 : -1))
            if (r3 <= 0) goto L_0x0441
            long r3 = r1.A07     // Catch:{ Exception -> 0x066b }
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 < 0) goto L_0x0441
            r5 = 0
            goto L_0x049b
        L_0x0441:
            X.0t6 r6 = r7.A0A     // Catch:{ OutOfMemoryError -> 0x064a }
            long r3 = r1.A0A     // Catch:{ OutOfMemoryError -> 0x064a }
            X.0t3 r5 = r7.A07     // Catch:{ OutOfMemoryError -> 0x064a }
            long r29 = r5.A00()     // Catch:{ OutOfMemoryError -> 0x064a }
            r24 = r6
            r25 = r3
            r27 = r10
            android.database.Cursor r4 = r24.A09(r25, r27, r29)     // Catch:{ OutOfMemoryError -> 0x064a }
            if (r4 == 0) goto L_0x0675
            X.0ur r5 = r7.A0T     // Catch:{ all -> 0x0645 }
            r3 = r22
            java.util.Map r16 = r5.A04(r4, r3)     // Catch:{ all -> 0x0645 }
            int r5 = r4.getCount()     // Catch:{ all -> 0x0645 }
            boolean r3 = r4.moveToLast()     // Catch:{ all -> 0x0645 }
            if (r3 == 0) goto L_0x0498
            java.lang.String r3 = "_id"
            int r3 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0645 }
            long r10 = r4.getLong(r3)     // Catch:{ all -> 0x0645 }
            java.lang.String r3 = "message_type"
            int r8 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0645 }
        L_0x0479:
            boolean r3 = r4.isNull(r8)     // Catch:{ all -> 0x0645 }
            if (r3 != 0) goto L_0x0492
            int r6 = r4.getInt(r8)     // Catch:{ all -> 0x0645 }
            r3 = 7
            if (r6 == r3) goto L_0x0492
            java.lang.String r3 = "timestamp"
            int r3 = r4.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0645 }
            long r41 = r4.getLong(r3)     // Catch:{ all -> 0x0645 }
            goto L_0x0498
        L_0x0492:
            boolean r3 = r4.moveToPrevious()     // Catch:{ all -> 0x0645 }
            if (r3 != 0) goto L_0x0479
        L_0x0498:
            r4.close()     // Catch:{ OutOfMemoryError -> 0x064a }
        L_0x049b:
            long r8 = r1.A08     // Catch:{ Exception -> 0x066b }
            long r3 = (long) r5     // Catch:{ Exception -> 0x066b }
            r19 = r3
            long r8 = r8 + r3
            if (r5 == 0) goto L_0x051a
            long r3 = r1.A0A     // Catch:{ Exception -> 0x066b }
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x051a
            r18 = 0
            X.0uq r5 = r7.A0D     // Catch:{ Exception -> 0x066b }
            int r3 = r5.A00(r3, r10)     // Catch:{ Exception -> 0x066b }
            double r5 = (double) r8     // Catch:{ Exception -> 0x066b }
            long r3 = (long) r3     // Catch:{ Exception -> 0x066b }
            long r3 = r3 + r8
            double r12 = (double) r3     // Catch:{ Exception -> 0x066b }
            double r5 = r5 / r12
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 * r3
            int r12 = (int) r5     // Catch:{ Exception -> 0x066b }
        L_0x04ba:
            X.1bP r3 = X.C29901bP.A0D     // Catch:{ Exception -> 0x066b }
            X.1Wr r5 = r3.A0U()     // Catch:{ Exception -> 0x066b }
            X.1bQ r5 = (X.C29911bQ) r5     // Catch:{ Exception -> 0x066b }
            int r3 = r1.A02     // Catch:{ Exception -> 0x066b }
            r49 = r3
            X.1bR r3 = X.C23321Bn.A00(r49)     // Catch:{ Exception -> 0x066b }
            r5.A07(r3)     // Catch:{ Exception -> 0x066b }
            r3 = r21
            r5.A05(r3)     // Catch:{ Exception -> 0x066b }
            r5.A03()     // Catch:{ Exception -> 0x066b }
            X.1Wm r4 = r5.A00     // Catch:{ Exception -> 0x066b }
            X.1bP r4 = (X.C29901bP) r4     // Catch:{ Exception -> 0x066b }
            int r3 = r4.A01     // Catch:{ Exception -> 0x066b }
            r3 = r3 | 4
            r4.A01 = r3     // Catch:{ Exception -> 0x066b }
            r4.A03 = r12     // Catch:{ Exception -> 0x066b }
            java.util.Set r3 = r16.entrySet()     // Catch:{ Exception -> 0x066b }
            java.util.Iterator r16 = r3.iterator()     // Catch:{ Exception -> 0x066b }
        L_0x04e9:
            boolean r3 = r16.hasNext()     // Catch:{ Exception -> 0x066b }
            if (r3 == 0) goto L_0x051f
            java.lang.Object r3 = r16.next()     // Catch:{ Exception -> 0x066b }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Exception -> 0x066b }
            java.lang.Object r13 = r3.getValue()     // Catch:{ Exception -> 0x066b }
            X.1bS r13 = (X.C29931bS) r13     // Catch:{ Exception -> 0x066b }
            java.lang.Object r6 = r3.getKey()     // Catch:{ Exception -> 0x066b }
            X.0rv r6 = (X.C15830rv) r6     // Catch:{ Exception -> 0x066b }
            long r3 = r1.A0B     // Catch:{ Exception -> 0x066b }
            r24 = r7
            r25 = r6
            r26 = r13
            r27 = r10
            r29 = r3
            r24.A03(r25, r26, r27, r29)     // Catch:{ Exception -> 0x066b }
            X.1Wm r3 = r13.A02()     // Catch:{ Exception -> 0x066b }
            X.1bT r3 = (X.C29941bT) r3     // Catch:{ Exception -> 0x066b }
            r5.A06(r3)     // Catch:{ Exception -> 0x066b }
            goto L_0x04e9
        L_0x051a:
            r18 = 1
            r12 = 100
            goto L_0x04ba
        L_0x051f:
            X.1WM r3 = r1.A0C     // Catch:{ Exception -> 0x066b }
            r26 = r3
            com.whatsapp.jid.DeviceJid r13 = r1.A0D     // Catch:{ Exception -> 0x066b }
            long r3 = r1.A0B     // Catch:{ Exception -> 0x066b }
            r24 = r3
            r51 = 0
            r43 = r7
            r44 = r26
            r45 = r13
            r46 = r5
            r47 = r22
            r48 = r21
            r50 = r12
            r52 = r10
            r56 = r3
            r58 = r19
            r60 = r41
            long r16 = r43.A01(r44, r45, r46, r47, r48, r49, r50, r51, r52, r54, r56, r58, r60)     // Catch:{ Exception -> 0x066b }
            if (r18 == 0) goto L_0x054a
            r5 = r22
            goto L_0x0579
        L_0x054a:
            long r3 = r1.A06     // Catch:{ Exception -> 0x066b }
            r18 = r3
            long r6 = r1.A0A     // Catch:{ Exception -> 0x066b }
            long r3 = r1.A07     // Catch:{ Exception -> 0x066b }
            long r3 = r3 + r16
            long r42 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x066b }
            r29 = 1
            r44 = -1
            X.1bK r5 = new X.1bK     // Catch:{ Exception -> 0x066b }
            r30 = r18
            r32 = r10
            r34 = r6
            r36 = r24
            r38 = r8
            r40 = r3
            r46 = r14
            r24 = r5
            r25 = r26
            r26 = r13
            r27 = r49
            r28 = r21
            r24.<init>(r25, r26, r27, r28, r29, r30, r32, r34, r36, r38, r40, r42, r44, r46)     // Catch:{ Exception -> 0x066b }
        L_0x0579:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x066b }
            r4.<init>()     // Catch:{ Exception -> 0x066b }
            java.lang.String r3 = "history-sync-send-methods/send-msg-history-chunk/progress = "
            r4.append(r3)     // Catch:{ Exception -> 0x066b }
            r4.append(r12)     // Catch:{ Exception -> 0x066b }
            java.lang.String r3 = ", last id = "
            r4.append(r3)     // Catch:{ Exception -> 0x066b }
            r4.append(r10)     // Catch:{ Exception -> 0x066b }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x066b }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x066b }
            if (r5 == 0) goto L_0x0675
            X.AnonymousClass00B.A00()
            r1 = r23
            X.19K r1 = r1.A02
            X.0tf r6 = r1.A02()
            X.0tg r9 = r6.A02     // Catch:{ all -> 0x2856 }
            java.lang.String r8 = "UPDATE msg_history_sync SET device_id=?, sync_type=?, last_processed_msg_row_id=?, oldest_msg_row_id=?, sent_msgs_count=?, chunk_order=?, sent_bytes=?, last_chunk_timestamp=?, status=?, peer_msg_row_id=?, oldest_message_to_sync_row_id=?, session_id=?, md_reg_attempt_id=?, size_limit_bytes=? WHERE _id=?"
            r1 = 15
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x2856 }
            com.whatsapp.jid.DeviceJid r7 = r5.A0D     // Catch:{ all -> 0x2856 }
            java.lang.String r3 = r7.getRawString()     // Catch:{ all -> 0x2856 }
            r1[r2] = r3     // Catch:{ all -> 0x2856 }
            r4 = 1
            int r3 = r5.A02     // Catch:{ all -> 0x2856 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x2856 }
            r1[r4] = r3     // Catch:{ all -> 0x2856 }
            r10 = 2
            long r3 = r5.A04     // Catch:{ all -> 0x2856 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x2856 }
            r1[r10] = r3     // Catch:{ all -> 0x2856 }
            r10 = 3
            long r3 = r5.A0A     // Catch:{ all -> 0x2856 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x2856 }
            r1[r10] = r3     // Catch:{ all -> 0x2856 }
            r10 = 4
            long r3 = r5.A08     // Catch:{ all -> 0x2856 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x2856 }
            r1[r10] = r3     // Catch:{ all -> 0x2856 }
            r4 = 5
            int r3 = r5.A00     // Catch:{ all -> 0x2856 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x2856 }
            r1[r4] = r3     // Catch:{ all -> 0x2856 }
            r10 = 6
            long r3 = r5.A07     // Catch:{ all -> 0x2856 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x2856 }
            r1[r10] = r3     // Catch:{ all -> 0x2856 }
            r10 = 7
            long r3 = r5.A03     // Catch:{ all -> 0x2856 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x2856 }
            r1[r10] = r3     // Catch:{ all -> 0x2856 }
            r4 = 8
            int r3 = r5.A01     // Catch:{ all -> 0x2856 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x2856 }
            r1[r4] = r3     // Catch:{ all -> 0x2856 }
            r10 = 9
            long r3 = r5.A05     // Catch:{ all -> 0x2856 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x2856 }
            r1[r10] = r3     // Catch:{ all -> 0x2856 }
            r10 = 10
            long r3 = r5.A0B     // Catch:{ all -> 0x2856 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x2856 }
            r1[r10] = r3     // Catch:{ all -> 0x2856 }
            r11 = 11
            X.1WM r10 = r5.A0C     // Catch:{ all -> 0x2856 }
            r4 = 0
            if (r10 == 0) goto L_0x061a
            java.lang.String r3 = r10.A01     // Catch:{ all -> 0x2856 }
            r22 = r3
        L_0x061a:
            r1[r11] = r22     // Catch:{ all -> 0x2856 }
            r3 = 12
            if (r10 == 0) goto L_0x0622
            java.lang.String r4 = r10.A00     // Catch:{ all -> 0x2856 }
        L_0x0622:
            r1[r3] = r4     // Catch:{ all -> 0x2856 }
            r10 = 13
            long r3 = r5.A09     // Catch:{ all -> 0x2856 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x2856 }
            r1[r10] = r3     // Catch:{ all -> 0x2856 }
            r10 = 14
            long r3 = r5.A06     // Catch:{ all -> 0x2856 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x2856 }
            r1[r10] = r3     // Catch:{ all -> 0x2856 }
            r9.A0C(r8, r1)     // Catch:{ all -> 0x2856 }
            r6.close()
            r1 = r23
            r1.A03(r7)
            goto L_0x032c
        L_0x0645:
            r3 = move-exception
            r4.close()     // Catch:{ all -> 0x0649 }
        L_0x0649:
            throw r3     // Catch:{ OutOfMemoryError -> 0x064a }
        L_0x064a:
            java.lang.String r3 = "history-sync-send-methods/send-msg-history-chunk failed OOM"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ Exception -> 0x066b }
            X.0so r6 = r7.A00     // Catch:{ Exception -> 0x066b }
            java.lang.String r5 = "historySyncSendMethod/outOfMemory"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x066b }
            r4.<init>()     // Catch:{ Exception -> 0x066b }
            java.lang.String r3 = "type="
            r4.append(r3)     // Catch:{ Exception -> 0x066b }
            int r3 = r1.A02     // Catch:{ Exception -> 0x066b }
            r4.append(r3)     // Catch:{ Exception -> 0x066b }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x066b }
            r6.AcB(r5, r3, r2)     // Catch:{ Exception -> 0x066b }
            goto L_0x0675
        L_0x066b:
            r4 = move-exception
            java.lang.String r3 = "history-sync-send-methods/send-msg-history-chunk failed"
            com.whatsapp.util.Log.e(r3, r4)
            goto L_0x0675
        L_0x0672:
            r10.close()
        L_0x0675:
            long r4 = r1.A06
            com.whatsapp.jid.DeviceJid r9 = r1.A0D
            X.AnonymousClass00B.A00()
            r1 = r23
            X.19K r1 = r1.A02
            X.0tf r8 = r1.A02()
            X.0tg r7 = r8.A02     // Catch:{ all -> 0x285b }
            java.lang.String r6 = "DELETE FROM msg_history_sync WHERE _id=?"
            r1 = 1
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x285b }
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x285b }
            r3[r2] = r1     // Catch:{ all -> 0x285b }
            r7.A0C(r6, r3)     // Catch:{ all -> 0x285b }
            r8.close()
            r1 = r23
            r1.A03(r9)
            goto L_0x032c
        L_0x069e:
            java.lang.Object r1 = r0.A00
            X.1ay r1 = (X.C29651ay) r1
            if (r1 == 0) goto L_0x003e
            java.lang.Object r0 = r0.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            boolean r2 = r0.get()
            com.obwhatsapp.companiondevice.sync.HistorySyncWorker r1 = r1.A00
            monitor-enter(r1)
            r0 = 1
            goto L_0x2860
        L_0x06b2:
            java.lang.Object r7 = r0.A00
            X.1bZ r7 = (X.C29991bZ) r7
            java.lang.Object r6 = r0.A01
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r0.A03
            X.1YG r5 = (X.AnonymousClass1YG) r5
            java.util.Iterator r4 = r1.iterator()
        L_0x06c6:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r4.next()
            X.0tZ r1 = (X.C16740tZ) r1
            X.1ba r0 = r7.A01     // Catch:{ Exception -> 0x06c6 }
            X.1bb r3 = r0.A02(r6, r5, r1)     // Catch:{ Exception -> 0x06c6 }
            r0 = 1
            r3.A1h = r0     // Catch:{ Exception -> 0x06c6 }
            java.util.concurrent.ConcurrentMap r2 = r7.A03     // Catch:{ Exception -> 0x06c6 }
            long r0 = r1.A13     // Catch:{ Exception -> 0x06c6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x06c6 }
            r2.put(r0, r3)     // Catch:{ Exception -> 0x06c6 }
            goto L_0x06c6
        L_0x06e7:
            java.lang.Object r4 = r0.A00
            X.0ul r4 = (X.C17240ul) r4
            java.lang.Object r8 = r0.A01
            X.0sL r8 = (X.C16050sL) r8
            java.lang.Object r3 = r0.A02
            java.util.AbstractCollection r3 = (java.util.AbstractCollection) r3
            java.lang.Object r5 = r0.A03
            X.0vs r5 = (X.C17930vs) r5
            X.18P r2 = r4.A0V
            X.0t3 r0 = r4.A0L
            long r6 = r0.A00()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r0
            java.util.List r0 = r2.A00(r8, r6)
            java.util.Iterator r6 = r0.iterator()
        L_0x070a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r2 = r6.next()
            X.1bh r2 = (X.C30071bh) r2
            X.1Vw r0 = r2.A11
            X.0rv r0 = r0.A00
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r0)
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x073b
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x070a
            java.lang.Object r0 = r5.get(r1)
            X.AnonymousClass00B.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x070a
        L_0x073b:
            r0 = 1
            r2.A07 = r0
            r0 = 0
            r2.A01 = r0
            X.0t6 r0 = r4.A0T
            r0.A0a(r2)
            goto L_0x070a
        L_0x0748:
            java.lang.Object r1 = r0.A00
            X.0tq r1 = (X.C16900tq) r1
            java.lang.Object r4 = r0.A01
            X.11E r4 = (X.AnonymousClass11E) r4
            java.lang.Object r6 = r0.A02
            X.0pe r6 = (X.C14720pe) r6
            java.lang.Object r9 = r0.A03
            X.1Gd r9 = (X.C24491Gd) r9
            r1.A04()
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x003e
            X.1bj[] r0 = new X.C30091bj[r2]
            X.1bk r8 = new X.1bk
            r8.<init>(r0)
            r5 = 1
            java.lang.String r0 = "DatabaseMigrationManager/processAllRollbacks"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            X.11D r0 = r4.A0B
            X.0vs r0 = r0.A00()
            X.0v0 r0 = r0.values()
            X.1Ub r3 = r0.iterator()
        L_0x077f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x07aa
            java.lang.Object r1 = r3.next()
            X.1bl r1 = (X.C30111bl) r1
            boolean r0 = r1.A0K()
            if (r0 != 0) goto L_0x0797
            boolean r0 = r1.A0L()
            if (r0 == 0) goto L_0x07a3
        L_0x0797:
            int r0 = r1.A03()
            if (r0 != r5) goto L_0x07a3
        L_0x079d:
            java.lang.String r0 = r1.A0C
            r7.add(r0)
            goto L_0x077f
        L_0x07a3:
            boolean r0 = r1.A0O()
            if (r0 == 0) goto L_0x077f
            goto L_0x079d
        L_0x07aa:
            r4.A04(r8, r7, r5, r5)
            r1 = 425(0x1a9, float:5.96E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r6.A0E(r0, r1)
            if (r0 == 0) goto L_0x07ba
            r4.A02(r5)
        L_0x07ba:
            X.0tq r0 = r9.A06
            r0.A04()
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x07ce
            java.lang.String r0 = "AsyncMigrations/shouldRunAsyncMigrations, message store is not ready, skip async migrations."
        L_0x07c5:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "AsyncMigrations/finalizeMigrationsAppAsyncInit, migrations shouldn't be run on async init."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x07ce:
            X.0rz r10 = r9.A05
            int r1 = r10.A04()
            r0 = 512(0x200, float:7.175E-43)
            if (r1 == r0) goto L_0x0817
            long r3 = java.lang.System.currentTimeMillis()
            X.11I r12 = r9.A07
            r0 = 0
            java.lang.String r11 = "async_init_migration_start_time"
            long r6 = r12.A01(r11, r0)
            long r0 = r3 - r6
            long r0 = java.lang.Math.abs(r0)
            r7 = 7200000(0x6ddd00, double:3.5572727E-317)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0814
            java.lang.String r2 = "AsyncMigrations/shouldRunAsyncMigrations, skip because of time from last run is equal to "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r4.append(r0)
            java.lang.String r0 = " seconds, should be more then "
            r4.append(r0)
            r0 = 7200(0x1c20, double:3.5573E-320)
            r4.append(r0)
            java.lang.String r0 = " seconds."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto L_0x07c5
        L_0x0814:
            r12.A05(r11, r3)
        L_0x0817:
            X.11D r6 = r9.A0A
            java.lang.String r1 = "call_log"
            X.0vs r0 = r6.A00()
            java.lang.Object r0 = r0.get(r1)
            X.1bl r0 = (X.C30111bl) r0
            if (r0 == 0) goto L_0x0842
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x0842
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r7.add(r1)
            X.11E r4 = r9.A08
            r3 = 7
            X.1bj[] r1 = new X.C30091bj[r2]
            X.1bk r0 = new X.1bk
            r0.<init>(r1)
            r4.A04(r0, r7, r3, r5)
        L_0x0842:
            X.0s5 r8 = r9.A02
            X.0s8 r0 = X.C15910s6.A0E
            boolean r0 = r8.A05(r0)
            if (r0 != 0) goto L_0x086b
            java.lang.String r0 = "AsyncMigrations/runMDMigrations, shouldMigrateMd is set to false."
        L_0x084e:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0851:
            X.1Gc r0 = r9.A09
            r0.A00(r2)
            X.0s8 r0 = X.C15910s6.A0D
            boolean r3 = r8.A05(r0)
            int r1 = r10.A04()
            r0 = 512(0x200, float:7.175E-43)
            r12 = 0
            if (r1 != r0) goto L_0x0866
            r12 = 1
        L_0x0866:
            if (r3 != 0) goto L_0x0953
            if (r12 != 0) goto L_0x0953
            return
        L_0x086b:
            X.0sK r0 = r9.A01
            r0.A0B()
            X.1ZT r0 = r0.A05
            if (r0 != 0) goto L_0x0877
            java.lang.String r0 = "AsyncMigrations/runMDMigrations, phone user Jid is null."
            goto L_0x084e
        L_0x0877:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.lang.String r4 = "migration_jid_store"
            X.0vs r0 = r6.A00()
            java.lang.Object r1 = r0.get(r4)
            X.1bl r1 = (X.C30111bl) r1
            if (r1 == 0) goto L_0x08a2
            boolean r0 = r1.A0L()
            if (r0 != 0) goto L_0x08a2
            X.0so r3 = r9.A00
            int r0 = r1.A04()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "jid-store-migration-pending"
            r3.AcB(r0, r1, r2)
            r7.add(r4)
        L_0x08a2:
            java.lang.String r4 = "migration_chat_store"
            X.0vs r0 = r6.A00()
            java.lang.Object r1 = r0.get(r4)
            X.1bl r1 = (X.C30111bl) r1
            if (r1 == 0) goto L_0x08c8
            boolean r0 = r1.A0L()
            if (r0 != 0) goto L_0x08c8
            X.0so r3 = r9.A00
            int r0 = r1.A04()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "chat-store-migration-pending"
            r3.AcB(r0, r1, r2)
            r7.add(r4)
        L_0x08c8:
            java.lang.String r4 = "blank_me_jid"
            X.0vs r0 = r6.A00()
            java.lang.Object r1 = r0.get(r4)
            X.1bl r1 = (X.C30111bl) r1
            if (r1 == 0) goto L_0x08ee
            boolean r0 = r1.A0L()
            if (r0 != 0) goto L_0x08ee
            X.0so r3 = r9.A00
            int r0 = r1.A04()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "md-blank-me-jid-migration-pending"
            r3.AcB(r0, r1, r2)
            r7.add(r4)
        L_0x08ee:
            java.lang.String r4 = "participant_user"
            X.0vs r0 = r6.A00()
            java.lang.Object r1 = r0.get(r4)
            X.1bl r1 = (X.C30111bl) r1
            if (r1 == 0) goto L_0x0914
            boolean r0 = r1.A0L()
            if (r0 != 0) goto L_0x0914
            X.0so r3 = r9.A00
            int r0 = r1.A04()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "md-participant-user-migration-pending"
            r3.AcB(r0, r1, r2)
            r7.add(r4)
        L_0x0914:
            java.lang.String r4 = "broadcast_me_jid"
            X.0vs r0 = r6.A00()
            java.lang.Object r1 = r0.get(r4)
            X.1bl r1 = (X.C30111bl) r1
            if (r1 == 0) goto L_0x093a
            boolean r0 = r1.A0L()
            if (r0 != 0) goto L_0x093a
            X.0so r3 = r9.A00
            int r0 = r1.A04()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "md-broadcast-me-jid-migration-pending"
            r3.AcB(r0, r1, r2)
            r7.add(r4)
        L_0x093a:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0944
            java.lang.String r0 = "AsyncMigrations/runMDMigrations, all migrations are marked as migrated."
            goto L_0x084e
        L_0x0944:
            X.11E r4 = r9.A08
            r3 = 7
            X.1bj[] r1 = new X.C30091bj[r2]
            X.1bk r0 = new X.1bk
            r0.<init>(r1)
            r4.A04(r0, r7, r3, r5)
            goto L_0x0851
        L_0x0953:
            X.1bm r8 = new X.1bm
            r8.<init>()
            java.lang.String r0 = "OnAsyncInitMigrationRunner/ftsMigration"
            X.1Zf r1 = new X.1Zf
            r1.<init>((java.lang.String) r0)
            java.lang.String r3 = "message_fts"
            X.0vs r0 = r6.A00()
            java.lang.Object r11 = r0.get(r3)
            X.1bl r11 = (X.C30111bl) r11
            if (r11 == 0) goto L_0x099a
            boolean r0 = r11.A0L()
            if (r0 != 0) goto L_0x099a
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r7.add(r3)
            X.1bj[] r6 = new X.C30091bj[r5]
            X.12s r4 = r9.A03
            X.0t3 r3 = r9.A04
            X.1bn r0 = new X.1bn
            r0.<init>(r4, r3)
            r6[r2] = r0
            X.1bk r4 = new X.1bk
            r4.<init>(r6)
            X.11E r3 = r9.A08
            r0 = 7
            boolean r0 = r3.A04(r4, r7, r0, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A00 = r0
        L_0x099a:
            if (r12 == 0) goto L_0x003e
            if (r11 == 0) goto L_0x003e
            X.1CW r7 = r9.A0C
            java.lang.String r6 = "fts_migration_elapsed_time_in_ms"
            r3 = 0
            java.lang.String r0 = r7.A02(r6)
            long r4 = X.C29501aj.A01(r0, r3)
            boolean r0 = r11.A0L()
            if (r0 == 0) goto L_0x09cd
            r10.A0e(r2)
            long r2 = r1.A01()
            long r2 = r2 + r4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r8.A01 = r0
            X.0t9 r0 = r9.A0B
            r0.A06(r8)
            r0 = 0
        L_0x09c9:
            r7.A05(r6, r0)
            return
        L_0x09cd:
            long r0 = r1.A01()
            long r4 = r4 + r0
            java.lang.String r0 = java.lang.String.valueOf(r4)
            goto L_0x09c9
        L_0x09d7:
            java.lang.Object r5 = r0.A00
            X.1bo r5 = (X.C30141bo) r5
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r1 = r0.A02
            X.1Md r1 = (X.C26051Md) r1
            java.lang.Object r3 = r0.A03
            android.view.View r3 = (android.view.View) r3
            X.1bp r0 = r5.A0A
            if (r0 != 0) goto L_0x003e
            X.1bp r0 = new X.1bp
            r0.<init>(r4, r1, r5)
            r5.A0A = r0
            androidx.recyclerview.widget.RecyclerView r1 = r5.A0Q
            r1.setAdapter(r0)
            r3.getContext()
            com.whatsapp.filter.SmoothScrollLinearLayoutManager r0 = new com.whatsapp.filter.SmoothScrollLinearLayoutManager
            r0.<init>(r2)
            r1.setLayoutManager(r0)
            return
        L_0x0a03:
            java.lang.Object r1 = r0.A00
            r20 = r1
            r1 = r20
            X.1Sk r1 = (X.C27601Sk) r1
            r20 = r1
            java.lang.Object r4 = r0.A01
            com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
            java.lang.Object r1 = r0.A02
            X.1br r1 = (X.C30161br) r1
            java.lang.Object r0 = r0.A03
            r34 = r0
            if (r4 != 0) goto L_0x0a21
            r19 = 0
        L_0x0a1d:
            r0 = 1
            if (r19 == 0) goto L_0x0a2d
            goto L_0x0a2a
        L_0x0a21:
            r0 = r20
            X.0xT r0 = r0.A0N
            java.util.concurrent.locks.Lock r19 = r0.A04(r4)
            goto L_0x0a1d
        L_0x0a2a:
            r19.lock()     // Catch:{ all -> 0x287e }
        L_0x0a2d:
            if (r4 == 0) goto L_0x0a8e
            r3 = r20
            X.0z2 r5 = r3.A0e     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.UserJid r3 = r4.getUserJid()     // Catch:{ all -> 0x287e }
            java.util.Set r3 = r5.A0D(r3)     // Catch:{ all -> 0x287e }
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x287e }
            if (r3 != 0) goto L_0x0a8e
            r3 = r20
            X.0sK r5 = r3.A03     // Catch:{ all -> 0x287e }
            boolean r3 = r5.A0J(r4)     // Catch:{ all -> 0x287e }
            if (r3 == 0) goto L_0x0a82
            boolean r3 = r5.A0G()     // Catch:{ all -> 0x287e }
            if (r3 != 0) goto L_0x0a7c
            r3 = r20
            X.0yO r3 = r3.A0c     // Catch:{ all -> 0x287e }
            boolean r3 = r3.A0E(r4)     // Catch:{ all -> 0x287e }
            if (r3 != 0) goto L_0x0a7c
            java.lang.String r3 = "MessagingXmppHandler/onMessageForMe/unknown self device, jid="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x287e }
            r2.<init>(r3)     // Catch:{ all -> 0x287e }
            r2.append(r4)     // Catch:{ all -> 0x287e }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x287e }
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x287e }
            r2 = r20
            X.0sq r7 = r2.A1B     // Catch:{ all -> 0x287e }
            r6 = 6
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r3 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8     // Catch:{ all -> 0x287e }
            r3.<init>(r2, r6, r4)     // Catch:{ all -> 0x287e }
            r7.Acl(r3)     // Catch:{ all -> 0x287e }
            r2 = 7
            goto L_0x13fe
        L_0x0a7c:
            boolean r3 = r5.A0G()     // Catch:{ all -> 0x287e }
            if (r3 == 0) goto L_0x0a8e
        L_0x0a82:
            byte r3 = r4.device     // Catch:{ all -> 0x287e }
            if (r3 == 0) goto L_0x0a8e
            X.1d1 r3 = r1.A09     // Catch:{ all -> 0x287e }
            if (r3 == 0) goto L_0x142a
            int r3 = r3.A00     // Catch:{ all -> 0x287e }
            if (r3 != r0) goto L_0x142a
        L_0x0a8e:
            r3 = r20
            X.137 r6 = r3.A0d     // Catch:{ all -> 0x287e }
            byte[] r5 = r1.A0g     // Catch:{ all -> 0x287e }
            X.1d1 r3 = r1.A09     // Catch:{ all -> 0x287e }
            boolean r3 = r6.A0B(r4, r3, r5, r0)     // Catch:{ all -> 0x287e }
            if (r3 == 0) goto L_0x13b2
            r3 = r20
            X.1Sf r3 = r3.A16     // Catch:{ all -> 0x287e }
            X.11o r6 = r3.A0S     // Catch:{ all -> 0x287e }
            long r4 = r1.A06     // Catch:{ all -> 0x287e }
            X.1d2 r4 = r6.A00(r2, r4)     // Catch:{ all -> 0x287e }
            X.1d3 r4 = (X.C30841d3) r4     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x0ab0
            r5 = 3
            r4.A00(r5)     // Catch:{ all -> 0x287e }
        L_0x0ab0:
            java.lang.String r5 = "decryptmessagerunnable/axolotl received a message; message.key="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x287e }
            r6.<init>(r5)     // Catch:{ all -> 0x287e }
            X.1Vw r5 = r1.A0C     // Catch:{ all -> 0x287e }
            if (r5 != 0) goto L_0x0abd
            X.1Vw r5 = r1.A0m     // Catch:{ all -> 0x287e }
        L_0x0abd:
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x287e }
            r6.append(r5)     // Catch:{ all -> 0x287e }
            java.lang.String r5 = "; message.retryCount="
            r6.append(r5)     // Catch:{ all -> 0x287e }
            int r5 = r1.A00()     // Catch:{ all -> 0x287e }
            r6.append(r5)     // Catch:{ all -> 0x287e }
            java.lang.String r11 = "; message.remote_resource="
            r6.append(r11)     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.Jid r5 = r1.A08     // Catch:{ all -> 0x287e }
            X.0rv r5 = X.C16030sJ.A00(r5)     // Catch:{ all -> 0x287e }
            r6.append(r5)     // Catch:{ all -> 0x287e }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x287e }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ all -> 0x287e }
            byte[] r5 = r1.A0h     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x0ba4
            int r10 = X.C28641Wx.A00(r5)     // Catch:{ all -> 0x287e }
            X.11s r12 = r3.A0A     // Catch:{ all -> 0x287e }
            X.1d4 r5 = r12.A07     // Catch:{ all -> 0x287e }
            int r9 = r5.A01()     // Catch:{ all -> 0x287e }
            java.lang.String r5 = "decryptmessagerunnable/received a registration id with message; message.key="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x287e }
            r6.<init>(r5)     // Catch:{ all -> 0x287e }
            X.1Vw r5 = r1.A0C     // Catch:{ all -> 0x287e }
            if (r5 != 0) goto L_0x0b02
            X.1Vw r5 = r1.A0m     // Catch:{ all -> 0x287e }
        L_0x0b02:
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x287e }
            r6.append(r5)     // Catch:{ all -> 0x287e }
            r6.append(r11)     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.Jid r5 = r1.A08     // Catch:{ all -> 0x287e }
            X.0rv r5 = X.C16030sJ.A00(r5)     // Catch:{ all -> 0x287e }
            r6.append(r5)     // Catch:{ all -> 0x287e }
            java.lang.String r8 = "; serverRegistrationId="
            r6.append(r8)     // Catch:{ all -> 0x287e }
            r6.append(r10)     // Catch:{ all -> 0x287e }
            java.lang.String r7 = "; localRegistrationId="
            r6.append(r7)     // Catch:{ all -> 0x287e }
            r6.append(r9)     // Catch:{ all -> 0x287e }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x287e }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ all -> 0x287e }
            if (r10 == r9) goto L_0x0ba4
            java.lang.String r5 = "decryptmessagerunnable/registration id received with message did not match local; message.key="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x287e }
            r6.<init>(r5)     // Catch:{ all -> 0x287e }
            X.1Vw r5 = r1.A0C     // Catch:{ all -> 0x287e }
            if (r5 != 0) goto L_0x0b3b
            X.1Vw r5 = r1.A0m     // Catch:{ all -> 0x287e }
        L_0x0b3b:
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x287e }
            r6.append(r5)     // Catch:{ all -> 0x287e }
            r6.append(r11)     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.Jid r5 = r1.A08     // Catch:{ all -> 0x287e }
            X.0rv r5 = X.C16030sJ.A00(r5)     // Catch:{ all -> 0x287e }
            r6.append(r5)     // Catch:{ all -> 0x287e }
            r6.append(r8)     // Catch:{ all -> 0x287e }
            r6.append(r10)     // Catch:{ all -> 0x287e }
            r6.append(r7)     // Catch:{ all -> 0x287e }
            r6.append(r9)     // Catch:{ all -> 0x287e }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x287e }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ all -> 0x287e }
            X.12z r6 = r3.A04     // Catch:{ all -> 0x287e }
            monitor-enter(r6)     // Catch:{ all -> 0x287e }
            boolean r5 = r6.A02     // Catch:{ all -> 0x2878 }
            monitor-exit(r6)     // Catch:{ all -> 0x287e }
            if (r5 != 0) goto L_0x0b6a
            goto L_0x0b9e
        L_0x0b6a:
            java.lang.String r5 = "decryptmessagerunnable/pre keys already sent on this connection; not sending at this time; message.key="
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x287e }
            r6.<init>(r5)     // Catch:{ all -> 0x287e }
            X.1Vw r5 = r1.A0C     // Catch:{ all -> 0x287e }
            if (r5 != 0) goto L_0x0b77
            X.1Vw r5 = r1.A0m     // Catch:{ all -> 0x287e }
        L_0x0b77:
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x287e }
            r6.append(r5)     // Catch:{ all -> 0x287e }
            r6.append(r11)     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.Jid r5 = r1.A08     // Catch:{ all -> 0x287e }
            X.0rv r5 = X.C16030sJ.A00(r5)     // Catch:{ all -> 0x287e }
            r6.append(r5)     // Catch:{ all -> 0x287e }
            r6.append(r8)     // Catch:{ all -> 0x287e }
            r6.append(r10)     // Catch:{ all -> 0x287e }
            r6.append(r7)     // Catch:{ all -> 0x287e }
            r6.append(r9)     // Catch:{ all -> 0x287e }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x287e }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ all -> 0x287e }
            goto L_0x0ba4
        L_0x0b9e:
            r12.A0Q()     // Catch:{ all -> 0x287e }
            r6.A03()     // Catch:{ all -> 0x287e }
        L_0x0ba4:
            com.whatsapp.jid.Jid r5 = r1.A0k     // Catch:{ all -> 0x287e }
            r33 = r5
            X.0rv r5 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            boolean r5 = X.C16030sJ.A0L(r5)     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x0c9a
            X.0ul r7 = r3.A0L     // Catch:{ all -> 0x287e }
            X.0rv r5 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            X.0sL r8 = X.C16050sL.A03(r5)     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.Jid r11 = r1.A08     // Catch:{ all -> 0x287e }
            X.0rv r5 = X.C16030sJ.A00(r11)     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.UserJid r10 = com.whatsapp.jid.UserJid.of(r5)     // Catch:{ all -> 0x287e }
            if (r8 == 0) goto L_0x0c9a
            if (r10 == 0) goto L_0x0c9a
            int r5 = r1.A01     // Catch:{ all -> 0x287e }
            r6 = 7
            if (r5 == r6) goto L_0x0c9a
            X.0rv r5 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            X.0sL r9 = X.C16050sL.A03(r5)     // Catch:{ all -> 0x287e }
            X.0rv r5 = X.C16030sJ.A00(r11)     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.UserJid r5 = com.whatsapp.jid.UserJid.of(r5)     // Catch:{ all -> 0x287e }
            boolean r5 = X.C16030sJ.A0M(r5)     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x0bf6
            if (r9 == 0) goto L_0x0bf6
            X.0sG r5 = r7.A0E     // Catch:{ all -> 0x287e }
            X.0sH r5 = r5.A09(r9)     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x0bf4
            boolean r5 = r5.A0b     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x0bf4
            goto L_0x0bf6
        L_0x0bf4:
            r9 = 1
            goto L_0x0bf7
        L_0x0bf6:
            r9 = 0
        L_0x0bf7:
            r5 = 0
            r15 = 0
            if (r9 == 0) goto L_0x0c38
            java.lang.String r2 = "decryptmessagerunnable/Dropping incoming message since it's from a lid participant in a non-incognito CAG; message.key="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x287e }
            r3.<init>(r2)     // Catch:{ all -> 0x287e }
            X.1Vw r2 = r1.A0C     // Catch:{ all -> 0x287e }
            if (r2 != 0) goto L_0x0c08
            X.1Vw r2 = r1.A0m     // Catch:{ all -> 0x287e }
        L_0x0c08:
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x287e }
            r3.append(r2)     // Catch:{ all -> 0x287e }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x287e }
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x287e }
            X.17f r3 = r7.A0r     // Catch:{ all -> 0x287e }
            java.lang.String r2 = "lid-in-non-incognito-cag"
            r3.A08(r1, r2, r5)     // Catch:{ all -> 0x287e }
            X.0rv r2 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            X.0sL r5 = X.C16050sL.A03(r2)     // Catch:{ all -> 0x287e }
            X.AnonymousClass00B.A06(r5)     // Catch:{ all -> 0x287e }
            X.0vd r4 = r7.A0l     // Catch:{ all -> 0x287e }
            java.lang.String r3 = "subgroup_conflict_recovery"
            r2 = 3
            r4.A0A(r5, r3, r2)     // Catch:{ all -> 0x287e }
            X.0w1 r2 = r7.A09     // Catch:{ all -> 0x287e }
            r2.A0K(r1, r6)     // Catch:{ all -> 0x287e }
            goto L_0x1452
        L_0x0c38:
            int r9 = r1.A01     // Catch:{ all -> 0x287e }
            r6 = 8
            r14 = 0
            if (r9 != r6) goto L_0x0c40
            r14 = 1
        L_0x0c40:
            X.0sO r12 = r7.A0a     // Catch:{ all -> 0x287e }
            boolean r6 = r12.A09(r8)     // Catch:{ all -> 0x287e }
            r13 = r6 ^ 1
            if (r13 == 0) goto L_0x0c63
            if (r14 != 0) goto L_0x0c9a
            X.0sG r6 = r7.A0E     // Catch:{ all -> 0x287e }
            X.0sH r6 = r6.A0A(r8)     // Catch:{ all -> 0x287e }
            boolean r6 = r6.A0a     // Catch:{ all -> 0x287e }
            if (r6 != 0) goto L_0x0c63
            X.0sK r6 = r7.A08     // Catch:{ all -> 0x287e }
            r6.A0B()     // Catch:{ all -> 0x287e }
            X.1ZT r6 = r6.A05     // Catch:{ all -> 0x287e }
            X.AnonymousClass00B.A06(r6)     // Catch:{ all -> 0x287e }
            r7.A0S(r8, r6)     // Catch:{ all -> 0x287e }
        L_0x0c63:
            X.0us r11 = r12.A07     // Catch:{ all -> 0x287e }
            X.1cE r6 = r11.A04(r8)     // Catch:{ all -> 0x287e }
            X.1ck r6 = r6.A05(r10)     // Catch:{ all -> 0x287e }
            r9 = 0
            if (r6 != 0) goto L_0x0c74
            r9 = 1
            r7.A0S(r8, r10)     // Catch:{ all -> 0x287e }
        L_0x0c74:
            if (r14 == 0) goto L_0x0c8f
            boolean r6 = r12.A0F(r8, r10)     // Catch:{ all -> 0x287e }
            r15 = r6 ^ 1
            if (r15 == 0) goto L_0x0c8f
            X.1cE r6 = r11.A04(r8)     // Catch:{ all -> 0x287e }
            X.1ck r6 = r6.A05(r10)     // Catch:{ all -> 0x287e }
            r6.A01 = r0     // Catch:{ all -> 0x287e }
            java.util.List r6 = java.util.Collections.singletonList(r6)     // Catch:{ all -> 0x287e }
            r7.A0L(r8, r5, r6)     // Catch:{ all -> 0x287e }
        L_0x0c8f:
            if (r13 != 0) goto L_0x0c95
            if (r9 != 0) goto L_0x0c95
            if (r15 == 0) goto L_0x0c9a
        L_0x0c95:
            X.0vd r6 = r7.A0l     // Catch:{ all -> 0x287e }
            r6.A0A(r8, r5, r0)     // Catch:{ all -> 0x287e }
        L_0x0c9a:
            int r5 = r1.A00()     // Catch:{ all -> 0x287e }
            if (r5 < r0) goto L_0x0ce4
            r6 = 16
            int r5 = r1.A03     // Catch:{ all -> 0x287e }
            r5 = r5 & 16
            if (r5 != r6) goto L_0x0ce4
            X.0t6 r5 = r3.A0E     // Catch:{ all -> 0x287e }
            X.1Vw r6 = r1.A0C     // Catch:{ all -> 0x287e }
            if (r6 != 0) goto L_0x0cb0
            X.1Vw r6 = r1.A0m     // Catch:{ all -> 0x287e }
        L_0x0cb0:
            X.0th r5 = r5.A0K     // Catch:{ all -> 0x287e }
            X.0tZ r5 = r5.A03(r6)     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x0cbe
            byte r6 = r5.A10     // Catch:{ all -> 0x287e }
            r5 = 11
            if (r6 == r5) goto L_0x0ce4
        L_0x0cbe:
            java.lang.String r2 = "decryptmessagerunnable/Dropping bypassed retry message due to missing placeholder; message.key="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x287e }
            r4.<init>(r2)     // Catch:{ all -> 0x287e }
            X.1Vw r2 = r1.A0C     // Catch:{ all -> 0x287e }
            if (r2 != 0) goto L_0x0ccb
            X.1Vw r2 = r1.A0m     // Catch:{ all -> 0x287e }
        L_0x0ccb:
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x287e }
            r4.append(r2)     // Catch:{ all -> 0x287e }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x287e }
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x287e }
            X.17f r4 = r3.A0Q     // Catch:{ all -> 0x287e }
            java.lang.String r3 = "bypassed-dropped"
            java.lang.String r2 = "404"
            r4.A08(r1, r3, r2)     // Catch:{ all -> 0x287e }
            goto L_0x1452
        L_0x0ce4:
            X.1d5 r6 = new X.1d5     // Catch:{ all -> 0x287e }
            r6.<init>()     // Catch:{ all -> 0x287e }
            int r5 = r1.A00()     // Catch:{ all -> 0x287e }
            long r7 = (long) r5     // Catch:{ all -> 0x287e }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x287e }
            r6.A0C = r5     // Catch:{ all -> 0x287e }
            java.lang.Integer r7 = r1.A0H     // Catch:{ all -> 0x287e }
            r5 = 0
            if (r7 == 0) goto L_0x0cfa
            r5 = 1
        L_0x0cfa:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x287e }
            r6.A02 = r5     // Catch:{ all -> 0x287e }
            int r5 = r1.A01     // Catch:{ all -> 0x287e }
            java.lang.Integer r5 = X.C18020w1.A08(r5)     // Catch:{ all -> 0x287e }
            r6.A09 = r5     // Catch:{ all -> 0x287e }
            X.0rv r5 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            boolean r5 = X.C16030sJ.A0L(r5)     // Catch:{ all -> 0x287e }
            r8 = 2
            r9 = 3
            if (r5 == 0) goto L_0x0d55
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x287e }
            r6.A04 = r5     // Catch:{ all -> 0x287e }
        L_0x0d1a:
            X.0rv r7 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            X.0rt r5 = r3.A0C     // Catch:{ all -> 0x287e }
            java.lang.Integer r5 = X.C30871d6.A00(r5, r7)     // Catch:{ all -> 0x287e }
            r6.A0A = r5     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.Jid r5 = r1.A01()     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.DeviceJid r7 = com.whatsapp.jid.DeviceJid.of(r5)     // Catch:{ all -> 0x287e }
            X.0sK r5 = r3.A02     // Catch:{ all -> 0x287e }
            r32 = r5
            boolean r5 = r5.A0J(r7)     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x0d44
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x287e }
        L_0x0d3c:
            r6.A06 = r5     // Catch:{ all -> 0x287e }
            int r9 = r1.A01     // Catch:{ all -> 0x287e }
            r7 = 1
            if (r9 == r0) goto L_0x0d8a
            goto L_0x0d80
        L_0x0d44:
            if (r7 == 0) goto L_0x0d50
            byte r5 = r7.device     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x0d50
            r5 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x287e }
            goto L_0x0d3c
        L_0x0d50:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x287e }
            goto L_0x0d3c
        L_0x0d55:
            X.0rv r5 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            boolean r5 = X.C16030sJ.A0Q(r5)     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x0d66
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x287e }
            r6.A04 = r5     // Catch:{ all -> 0x287e }
            goto L_0x0d1a
        L_0x0d66:
            com.whatsapp.jid.Jid r5 = r1.A08     // Catch:{ all -> 0x287e }
            X.0rv r5 = X.C16030sJ.A00(r5)     // Catch:{ all -> 0x287e }
            boolean r5 = X.C16030sJ.A0G(r5)     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x0d79
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x287e }
            r6.A04 = r5     // Catch:{ all -> 0x287e }
            goto L_0x0d1a
        L_0x0d79:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x287e }
            r6.A04 = r5     // Catch:{ all -> 0x287e }
            goto L_0x0d1a
        L_0x0d80:
            r5 = 7
            r7 = 2
            if (r9 == r5) goto L_0x0d8a
            r5 = 8
            r7 = 3
            if (r9 == r5) goto L_0x0d8a
            r7 = 0
        L_0x0d8a:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x287e }
            r6.A07 = r5     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.Jid r5 = r1.A01()     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.DeviceJid r5 = com.whatsapp.jid.DeviceJid.of(r5)     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x1452
            X.1Yb r7 = X.C28851Ya.A02(r5)     // Catch:{ all -> 0x287e }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x287e }
            r6.A00 = r5     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x0da6
            r4.A02 = r0     // Catch:{ all -> 0x287e }
        L_0x0da6:
            X.11s r15 = r3.A0A     // Catch:{ all -> 0x287e }
            X.1T9 r5 = r3.A0O     // Catch:{ all -> 0x287e }
            r25 = 0
            X.1d1 r9 = r1.A09     // Catch:{ all -> 0x287e }
            X.1d1 r10 = r1.A0A     // Catch:{ all -> 0x287e }
            r26 = 0
            if (r10 != 0) goto L_0x0db6
            r26 = 1
        L_0x0db6:
            r27 = 0
            if (r9 == 0) goto L_0x0dc0
            int r10 = r9.A00     // Catch:{ all -> 0x287e }
            java.lang.Integer r25 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x287e }
        L_0x0dc0:
            r21 = r5
            r22 = r7
            r23 = r6
            r24 = r1
            X.1d7 r11 = r21.A00(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x287e }
            if (r9 == 0) goto L_0x0dde
            int r10 = r9.A00     // Catch:{ all -> 0x287e }
            if (r10 != 0) goto L_0x0de5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x287e }
            r6.A03 = r8     // Catch:{ all -> 0x287e }
            byte[] r8 = r9.A02     // Catch:{ all -> 0x287e }
            X.1d8 r27 = r15.A05(r11, r7, r8)     // Catch:{ all -> 0x287e }
        L_0x0dde:
            X.1d1 r8 = r1.A0A     // Catch:{ all -> 0x287e }
            r31 = 0
            if (r8 == 0) goto L_0x0e56
            goto L_0x0e54
        L_0x0de5:
            if (r10 != r0) goto L_0x0df4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x287e }
            r6.A03 = r8     // Catch:{ all -> 0x287e }
            byte[] r8 = r9.A02     // Catch:{ all -> 0x287e }
            X.1d8 r27 = r15.A06(r11, r7, r8)     // Catch:{ all -> 0x287e }
            goto L_0x0dde
        L_0x0df4:
            if (r10 != r8) goto L_0x0e24
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x287e }
            r6.A03 = r8     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.Jid r8 = r1.A08     // Catch:{ all -> 0x287e }
            X.0rv r13 = X.C16030sJ.A00(r8)     // Catch:{ all -> 0x287e }
            X.0rv r8 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            java.lang.String r10 = X.C16030sJ.A03(r8)     // Catch:{ all -> 0x287e }
            java.lang.String r12 = X.C16030sJ.A03(r13)     // Catch:{ all -> 0x287e }
            boolean r8 = X.C16030sJ.A0G(r13)     // Catch:{ all -> 0x287e }
            if (r8 != 0) goto L_0x0e18
            X.AnonymousClass00B.A06(r10)     // Catch:{ all -> 0x287e }
            r12 = r10
        L_0x0e18:
            X.1dH r10 = new X.1dH     // Catch:{ all -> 0x287e }
            r10.<init>(r7, r12)     // Catch:{ all -> 0x287e }
            byte[] r8 = r9.A02     // Catch:{ all -> 0x287e }
            X.1d8 r27 = r15.A07(r11, r10, r8)     // Catch:{ all -> 0x287e }
            goto L_0x0dde
        L_0x0e24:
            java.lang.String r8 = "decryptmessagerunnable/axolotl unrecognized ciphertext type; message.key="
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x287e }
            r9.<init>(r8)     // Catch:{ all -> 0x287e }
            X.1Vw r8 = r1.A0C     // Catch:{ all -> 0x287e }
            if (r8 != 0) goto L_0x0e31
            X.1Vw r8 = r1.A0m     // Catch:{ all -> 0x287e }
        L_0x0e31:
            r9.append(r8)     // Catch:{ all -> 0x287e }
            java.lang.String r8 = " type="
            r9.append(r8)     // Catch:{ all -> 0x287e }
            r9.append(r10)     // Catch:{ all -> 0x287e }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x287e }
            com.whatsapp.util.Log.w((java.lang.String) r8)     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x0e47
            r4.A02 = r2     // Catch:{ all -> 0x287e }
        L_0x0e47:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x287e }
            r6.A00 = r8     // Catch:{ all -> 0x287e }
            r8 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x287e }
            r6.A05 = r8     // Catch:{ all -> 0x287e }
            goto L_0x0dde
        L_0x0e54:
            r31 = 1
        L_0x0e56:
            r26 = r3
            r28 = r6
            r29 = r4
            r30 = r1
            int r8 = r26.A00(r27, r28, r29, r30, r31)     // Catch:{ all -> 0x287e }
            if (r8 != 0) goto L_0x0f03
            r25 = 0
            X.1d1 r9 = r1.A0A     // Catch:{ all -> 0x287e }
            r27 = 0
            if (r9 == 0) goto L_0x0e72
            int r8 = r9.A00     // Catch:{ all -> 0x287e }
            java.lang.Integer r25 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x287e }
        L_0x0e72:
            r26 = 1
            X.1d7 r10 = r21.A00(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x287e }
            if (r9 == 0) goto L_0x0e8a
            int r8 = r9.A00     // Catch:{ all -> 0x287e }
            if (r8 != 0) goto L_0x0e93
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x287e }
            r6.A03 = r5     // Catch:{ all -> 0x287e }
            byte[] r5 = r9.A02     // Catch:{ all -> 0x287e }
            X.1d8 r27 = r15.A05(r10, r7, r5)     // Catch:{ all -> 0x287e }
        L_0x0e8a:
            r31 = 0
            r26 = r3
            int r8 = r26.A00(r27, r28, r29, r30, r31)     // Catch:{ all -> 0x287e }
            goto L_0x0f03
        L_0x0e93:
            if (r8 != r0) goto L_0x0ea2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x287e }
            r6.A03 = r5     // Catch:{ all -> 0x287e }
            byte[] r5 = r9.A02     // Catch:{ all -> 0x287e }
            X.1d8 r27 = r15.A06(r10, r7, r5)     // Catch:{ all -> 0x287e }
            goto L_0x0e8a
        L_0x0ea2:
            r5 = 2
            if (r8 != r5) goto L_0x0ed3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x287e }
            r6.A03 = r5     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.Jid r5 = r1.A08     // Catch:{ all -> 0x287e }
            X.0rv r12 = X.C16030sJ.A00(r5)     // Catch:{ all -> 0x287e }
            X.0rv r5 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            java.lang.String r8 = X.C16030sJ.A03(r5)     // Catch:{ all -> 0x287e }
            java.lang.String r11 = X.C16030sJ.A03(r12)     // Catch:{ all -> 0x287e }
            boolean r5 = X.C16030sJ.A0G(r12)     // Catch:{ all -> 0x287e }
            if (r5 != 0) goto L_0x0ec7
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x287e }
            r11 = r8
        L_0x0ec7:
            X.1dH r8 = new X.1dH     // Catch:{ all -> 0x287e }
            r8.<init>(r7, r11)     // Catch:{ all -> 0x287e }
            byte[] r5 = r9.A02     // Catch:{ all -> 0x287e }
            X.1d8 r27 = r15.A07(r10, r8, r5)     // Catch:{ all -> 0x287e }
            goto L_0x0e8a
        L_0x0ed3:
            java.lang.String r5 = "decryptmessagerunnable/axolotl unrecognized ciphertext type; message.key="
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x287e }
            r7.<init>(r5)     // Catch:{ all -> 0x287e }
            X.1Vw r5 = r1.A0C     // Catch:{ all -> 0x287e }
            if (r5 != 0) goto L_0x0ee0
            X.1Vw r5 = r1.A0m     // Catch:{ all -> 0x287e }
        L_0x0ee0:
            r7.append(r5)     // Catch:{ all -> 0x287e }
            java.lang.String r5 = " type="
            r7.append(r5)     // Catch:{ all -> 0x287e }
            r7.append(r8)     // Catch:{ all -> 0x287e }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x287e }
            com.whatsapp.util.Log.w((java.lang.String) r5)     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x0ef6
            r4.A02 = r2     // Catch:{ all -> 0x287e }
        L_0x0ef6:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x287e }
            r6.A00 = r5     // Catch:{ all -> 0x287e }
            r5 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x287e }
            r6.A05 = r5     // Catch:{ all -> 0x287e }
            goto L_0x0e8a
        L_0x0f03:
            r5 = 2
            if (r8 == r5) goto L_0x1452
            X.0w2 r5 = r3.A0J     // Catch:{ all -> 0x287e }
            int r5 = X.C18020w1.A03(r5, r1)     // Catch:{ all -> 0x287e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x287e }
            r6.A08 = r7     // Catch:{ all -> 0x287e }
            X.0w1 r9 = r3.A03     // Catch:{ all -> 0x287e }
            X.0rv r5 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            boolean r5 = r9.A0N(r5, r7)     // Catch:{ all -> 0x287e }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x287e }
            r6.A01 = r5     // Catch:{ all -> 0x287e }
            java.lang.Boolean r5 = r6.A00     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x0f2f
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x0f2f
            if (r4 == 0) goto L_0x0f3c
            goto L_0x0f3a
        L_0x0f2f:
            X.0t9 r5 = r3.A0K     // Catch:{ all -> 0x287e }
            X.00F r4 = new X.00F     // Catch:{ all -> 0x287e }
            r4.<init>(r0, r0)     // Catch:{ all -> 0x287e }
            r5.A0B(r6, r4, r0)     // Catch:{ all -> 0x287e }
            goto L_0x0f41
        L_0x0f3a:
            r4.A02 = r0     // Catch:{ all -> 0x287e }
        L_0x0f3c:
            X.0t9 r4 = r3.A0K     // Catch:{ all -> 0x287e }
            r4.A06(r6)     // Catch:{ all -> 0x287e }
        L_0x0f41:
            X.0tZ r5 = r1.A0B     // Catch:{ all -> 0x287e }
            boolean r4 = r5 instanceof X.C30901d9     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x0f6d
            X.1d9 r5 = (X.C30901d9) r5     // Catch:{ all -> 0x287e }
            X.0tm r4 = r5.A0F()     // Catch:{ all -> 0x287e }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x287e }
            boolean r4 = r4.A04()     // Catch:{ all -> 0x287e }
            if (r4 != 0) goto L_0x0f6d
            java.lang.String r4 = "decryptmessagerunnable/downloadLocationThumbnail"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x287e }
            r5.A02 = r0     // Catch:{ all -> 0x287e }
            com.whatsapp.util.IDxATaskShape25S0200000_1_I0 r8 = new com.whatsapp.util.IDxATaskShape25S0200000_1_I0     // Catch:{ all -> 0x287e }
            r8.<init>(r3, r0, r5)     // Catch:{ all -> 0x287e }
            android.os.Handler r7 = r3.A00     // Catch:{ all -> 0x287e }
            r5 = 4
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r4 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8     // Catch:{ all -> 0x287e }
            r4.<init>(r3, r5, r8)     // Catch:{ all -> 0x287e }
            r7.post(r4)     // Catch:{ all -> 0x287e }
        L_0x0f6d:
            X.0sO r5 = r3.A0G     // Catch:{ all -> 0x287e }
            X.1Vw r4 = r1.A0C     // Catch:{ all -> 0x287e }
            if (r4 != 0) goto L_0x0f75
            X.1Vw r4 = r1.A0m     // Catch:{ all -> 0x287e }
        L_0x0f75:
            X.0rv r4 = r4.A00     // Catch:{ all -> 0x287e }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x287e }
            java.util.Set r5 = r5.A02(r4)     // Catch:{ all -> 0x287e }
            X.0so r4 = r3.A01     // Catch:{ all -> 0x287e }
            java.util.Set r4 = X.C16030sJ.A0A(r4, r5)     // Catch:{ all -> 0x287e }
            int r14 = r4.size()     // Catch:{ all -> 0x287e }
            int r21 = r5.size()     // Catch:{ all -> 0x287e }
            X.0tZ r11 = r1.A0B     // Catch:{ all -> 0x287e }
            X.0t3 r4 = r9.A04     // Catch:{ all -> 0x287e }
            long r12 = r4.A00()     // Catch:{ all -> 0x287e }
            X.1dA r10 = new X.1dA     // Catch:{ all -> 0x287e }
            r10.<init>()     // Catch:{ all -> 0x287e }
            java.lang.Long r4 = r1.A0L     // Catch:{ all -> 0x287e }
            long r7 = r4.longValue()     // Catch:{ all -> 0x287e }
            long r4 = r1.A0j     // Catch:{ all -> 0x287e }
            r17 = r4
            long r4 = r7 - r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x287e }
            r10.A0H = r4     // Catch:{ all -> 0x287e }
            long r12 = r12 - r7
            java.lang.Long r4 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x287e }
            r10.A0I = r4     // Catch:{ all -> 0x287e }
            java.lang.Long r4 = r1.A0K     // Catch:{ all -> 0x287e }
            r10.A0J = r4     // Catch:{ all -> 0x287e }
            X.0w2 r13 = r9.A09     // Catch:{ all -> 0x287e }
            int r4 = X.C18020w1.A03(r13, r1)     // Catch:{ all -> 0x287e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x287e }
            r10.A0B = r4     // Catch:{ all -> 0x287e }
            boolean r4 = r1.A0c     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x0fc8
            r5 = 3
            goto L_0x0fe0
        L_0x0fc8:
            X.0rv r4 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            boolean r4 = X.C16030sJ.A0L(r4)     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x0fd4
            r5 = 2
            goto L_0x0fe0
        L_0x0fd4:
            X.0rv r4 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            boolean r4 = X.C16030sJ.A0Q(r4)     // Catch:{ all -> 0x287e }
            r5 = 1
            if (r4 == 0) goto L_0x0fe0
            r5 = 4
        L_0x0fe0:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x287e }
            r10.A0C = r4     // Catch:{ all -> 0x287e }
            r16 = 1
            if (r5 == r0) goto L_0x0fed
            r4 = 3
            if (r5 != r4) goto L_0x0ffd
        L_0x0fed:
            X.0sK r5 = r9.A02     // Catch:{ all -> 0x287e }
            X.1Vw r4 = r1.A0C     // Catch:{ all -> 0x287e }
            if (r4 != 0) goto L_0x0ff5
            X.1Vw r4 = r1.A0m     // Catch:{ all -> 0x287e }
        L_0x0ff5:
            java.lang.Boolean r4 = X.C18020w1.A07(r5, r4)     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x0ffd
            r10.A04 = r4     // Catch:{ all -> 0x287e }
        L_0x0ffd:
            if (r11 == 0) goto L_0x100c
            X.1Vw r4 = r11.A11     // Catch:{ all -> 0x287e }
            X.0rv r5 = r4.A00     // Catch:{ all -> 0x287e }
            java.lang.Integer r4 = r10.A0B     // Catch:{ all -> 0x287e }
            boolean r5 = r9.A0N(r5, r4)     // Catch:{ all -> 0x287e }
            r4 = 1
            if (r5 != 0) goto L_0x100d
        L_0x100c:
            r4 = 0
        L_0x100d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x287e }
            r10.A02 = r4     // Catch:{ all -> 0x287e }
            X.0rt r4 = r9.A06     // Catch:{ all -> 0x287e }
            r25 = r4
            if (r11 != 0) goto L_0x101b
            r4 = 0
            goto L_0x1025
        L_0x101b:
            X.1Vw r4 = r11.A11     // Catch:{ all -> 0x287e }
            X.0rv r5 = r4.A00     // Catch:{ all -> 0x287e }
            r4 = r25
            java.lang.Integer r4 = X.C30871d6.A00(r4, r5)     // Catch:{ all -> 0x287e }
        L_0x1025:
            r10.A0E = r4     // Catch:{ all -> 0x287e }
            X.0pd r12 = r9.A0B     // Catch:{ all -> 0x287e }
            r4 = 536(0x218, float:7.51E-43)
            X.0tM r8 = X.C16620tM.A02     // Catch:{ all -> 0x287e }
            boolean r4 = r12.A0E(r8, r4)     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x1087
            if (r11 == 0) goto L_0x1087
            X.1Vw r4 = r11.A11     // Catch:{ all -> 0x287e }
            X.0rv r7 = r4.A00     // Catch:{ all -> 0x287e }
            X.0wx r4 = r9.A0A     // Catch:{ all -> 0x287e }
            r24 = r4
            java.lang.Integer r4 = r24.A04()     // Catch:{ all -> 0x287e }
            int r4 = r4.intValue()     // Catch:{ all -> 0x287e }
            long r4 = (long) r4     // Catch:{ all -> 0x287e }
            r22 = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x287e }
            r10.A0L = r4     // Catch:{ all -> 0x287e }
            boolean r4 = r7 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x1064
            r4 = r7
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ all -> 0x287e }
            r5 = r24
            int r4 = r5.A00(r4)     // Catch:{ all -> 0x287e }
            long r4 = (long) r4     // Catch:{ all -> 0x287e }
            r22 = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x287e }
            r10.A0M = r4     // Catch:{ all -> 0x287e }
        L_0x1064:
            r4 = r25
            X.0rx r4 = r4.A06(r7)     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x107e
            X.1WV r4 = r4.A0X     // Catch:{ all -> 0x287e }
            int r5 = r4.disappearingMessagesInitiator     // Catch:{ all -> 0x287e }
            r4 = 2
            if (r5 != 0) goto L_0x1075
            r4 = 1
            goto L_0x1078
        L_0x1075:
            if (r5 != r4) goto L_0x1078
            r4 = 3
        L_0x1078:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x287e }
            r10.A09 = r4     // Catch:{ all -> 0x287e }
        L_0x107e:
            int r4 = r11.A04     // Catch:{ all -> 0x287e }
            long r4 = (long) r4     // Catch:{ all -> 0x287e }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x287e }
            r10.A0G = r4     // Catch:{ all -> 0x287e }
        L_0x1087:
            java.lang.Integer r4 = r1.A0H     // Catch:{ all -> 0x287e }
            r5 = 0
            if (r4 == 0) goto L_0x108d
            r5 = 1
        L_0x108d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x287e }
            r10.A06 = r4     // Catch:{ all -> 0x287e }
            if (r11 == 0) goto L_0x109e
            byte r4 = r11.A10     // Catch:{ all -> 0x287e }
            boolean r5 = X.C30921dB.A00(r4)     // Catch:{ all -> 0x287e }
            r4 = 1
            if (r5 != 0) goto L_0x109f
        L_0x109e:
            r4 = 0
        L_0x109f:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x287e }
            r10.A03 = r4     // Catch:{ all -> 0x287e }
            if (r14 <= 0) goto L_0x10b5
            r4 = 32
            if (r14 > r4) goto L_0x10ae
            r4 = 32
            goto L_0x10af
        L_0x10ae:
            long r4 = (long) r14     // Catch:{ all -> 0x287e }
        L_0x10af:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x287e }
            r10.A0K = r4     // Catch:{ all -> 0x287e }
        L_0x10b5:
            if (r11 == 0) goto L_0x10b8
            goto L_0x10bb
        L_0x10b8:
            r16 = 0
            goto L_0x10c0
        L_0x10bb:
            int r5 = r11.A05     // Catch:{ all -> 0x287e }
            r4 = 2
            if (r5 < r4) goto L_0x10b8
        L_0x10c0:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r16)     // Catch:{ all -> 0x287e }
            r10.A01 = r4     // Catch:{ all -> 0x287e }
            if (r21 <= 0) goto L_0x10e2
            r5 = 32
            r4 = r21
            if (r4 > r5) goto L_0x10d1
            r4 = 32
            goto L_0x10d2
        L_0x10d1:
            long r4 = (long) r4     // Catch:{ all -> 0x287e }
        L_0x10d2:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x287e }
            r10.A0F = r4     // Catch:{ all -> 0x287e }
            int r4 = X.C18020w1.A00(r21)     // Catch:{ all -> 0x287e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x287e }
            r10.A08 = r4     // Catch:{ all -> 0x287e }
        L_0x10e2:
            if (r11 == 0) goto L_0x10eb
            X.0tZ r5 = r11.A0D()     // Catch:{ all -> 0x287e }
            r4 = 1
            if (r5 != 0) goto L_0x10ec
        L_0x10eb:
            r4 = 0
        L_0x10ec:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x287e }
            r10.A00 = r4     // Catch:{ all -> 0x287e }
            if (r11 == 0) goto L_0x10f5
            goto L_0x10f7
        L_0x10f5:
            r5 = 0
            goto L_0x10fb
        L_0x10f7:
            X.1Vw r4 = r11.A11     // Catch:{ all -> 0x287e }
            X.0rv r5 = r4.A00     // Catch:{ all -> 0x287e }
        L_0x10fb:
            r4 = 441(0x1b9, float:6.18E-43)
            boolean r4 = r12.A0E(r8, r4)     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x1115
            boolean r4 = X.C16030sJ.A0L(r5)     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x1115
            X.0sf r4 = r9.A0G     // Catch:{ all -> 0x287e }
            boolean r4 = r4.A0Q(r5)     // Catch:{ all -> 0x287e }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x287e }
            r10.A07 = r4     // Catch:{ all -> 0x287e }
        L_0x1115:
            int r5 = r1.A01     // Catch:{ all -> 0x287e }
            java.lang.Integer r4 = X.C18020w1.A08(r5)     // Catch:{ all -> 0x287e }
            r10.A0D = r4     // Catch:{ all -> 0x287e }
            X.1d1 r4 = r1.A0A     // Catch:{ all -> 0x287e }
            if (r4 != 0) goto L_0x1142
            X.1d1 r4 = r1.A09     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x1142
            X.0rv r4 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            boolean r4 = X.C16030sJ.A0L(r4)     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x1142
            java.lang.String r7 = r1.A0b     // Catch:{ all -> 0x287e }
            java.lang.String r4 = "text"
            boolean r4 = r4.equals(r7)     // Catch:{ all -> 0x287e }
            if (r4 == 0) goto L_0x1142
            int r4 = r1.A00     // Catch:{ all -> 0x287e }
            if (r4 != r0) goto L_0x1142
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x287e }
            r10.A05 = r4     // Catch:{ all -> 0x287e }
        L_0x1142:
            r7 = 1
            if (r5 == r0) goto L_0x114f
            r4 = 7
            r7 = 2
            if (r5 == r4) goto L_0x114f
            r4 = 8
            r7 = 3
            if (r5 == r4) goto L_0x114f
            r7 = 0
        L_0x114f:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x287e }
            r10.A0A = r4     // Catch:{ all -> 0x287e }
            X.0t9 r4 = r9.A0C     // Catch:{ all -> 0x287e }
            r4.A06(r10)     // Catch:{ all -> 0x287e }
            X.0tZ r11 = r1.A0B     // Catch:{ all -> 0x287e }
            r5 = 2430(0x97e, float:3.405E-42)
            boolean r5 = r12.A0E(r8, r5)     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x119f
            boolean r5 = r11 instanceof X.C30581cc     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x119f
            r10 = r11
            X.1cc r10 = (X.C30581cc) r10     // Catch:{ all -> 0x287e }
            java.lang.String r5 = r10.A0I()     // Catch:{ all -> 0x287e }
            java.lang.String r5 = X.C30931dC.A01(r5)     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x119f
            X.1dD r7 = new X.1dD     // Catch:{ all -> 0x287e }
            r7.<init>()     // Catch:{ all -> 0x287e }
            int r5 = X.C18020w1.A06(r11)     // Catch:{ all -> 0x287e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x287e }
            r7.A02 = r5     // Catch:{ all -> 0x287e }
            java.lang.Integer r5 = X.C18020w1.A0B(r10)     // Catch:{ all -> 0x287e }
            r7.A01 = r5     // Catch:{ all -> 0x287e }
            java.lang.Integer r5 = X.C18020w1.A0A(r10)     // Catch:{ all -> 0x287e }
            r7.A03 = r5     // Catch:{ all -> 0x287e }
            X.1cv r5 = r10.A0U     // Catch:{ all -> 0x287e }
            r10 = 0
            if (r5 == 0) goto L_0x1196
            r10 = 1
        L_0x1196:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x287e }
            r7.A00 = r5     // Catch:{ all -> 0x287e }
            r4.A06(r7)     // Catch:{ all -> 0x287e }
        L_0x119f:
            r5 = 1859(0x743, float:2.605E-42)
            boolean r5 = r12.A0E(r8, r5)     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x1260
            if (r11 == 0) goto L_0x1260
            X.0tZ r7 = r11.A0D()     // Catch:{ all -> 0x287e }
            if (r7 == 0) goto L_0x1260
            X.1Vw r5 = r7.A11     // Catch:{ all -> 0x287e }
            X.0rv r5 = r5.A00     // Catch:{ all -> 0x287e }
            boolean r5 = X.C16030sJ.A0Q(r5)     // Catch:{ all -> 0x287e }
            if (r5 == 0) goto L_0x1260
            X.1dE r5 = new X.1dE     // Catch:{ all -> 0x287e }
            r5.<init>()     // Catch:{ all -> 0x287e }
            int r7 = X.C18020w1.A02(r13, r7)     // Catch:{ all -> 0x287e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x287e }
            r5.A00 = r7     // Catch:{ all -> 0x287e }
            X.0sK r7 = r9.A02     // Catch:{ all -> 0x287e }
            r7.A0B()     // Catch:{ all -> 0x287e }
            X.1ZT r7 = r7.A05     // Catch:{ all -> 0x287e }
            X.AnonymousClass00B.A06(r7)     // Catch:{ all -> 0x287e }
            java.lang.String r7 = r7.getRawString()     // Catch:{ all -> 0x287e }
            r5.A02 = r7     // Catch:{ all -> 0x287e }
            int r13 = X.C18020w1.A02(r13, r11)     // Catch:{ all -> 0x287e }
            r10 = 14
            r7 = 11
            if (r13 == r7) goto L_0x1252
            r14 = 16
            r16 = 7
            if (r13 == r14) goto L_0x1257
            r14 = 18
            if (r13 == r14) goto L_0x124f
            r14 = 23
            if (r13 == r14) goto L_0x124f
            r14 = 29
            if (r13 == r14) goto L_0x124f
            r14 = 13
            if (r13 == r14) goto L_0x124a
            if (r13 == r10) goto L_0x1247
            r7 = 31
            if (r13 == r7) goto L_0x1244
            r7 = 32
            if (r13 == r7) goto L_0x1252
            r7 = 2
            switch(r13) {
                case 1: goto L_0x1215;
                case 2: goto L_0x1244;
                case 3: goto L_0x1252;
                case 4: goto L_0x1209;
                case 5: goto L_0x120c;
                case 6: goto L_0x1247;
                case 7: goto L_0x120f;
                case 8: goto L_0x1212;
                case 9: goto L_0x124a;
                default: goto L_0x1206;
            }     // Catch:{ all -> 0x287e }
        L_0x1206:
            r16 = 1
            goto L_0x1257
        L_0x1209:
            r16 = 6
            goto L_0x1257
        L_0x120c:
            r16 = 4
            goto L_0x1257
        L_0x120f:
            r16 = 10
            goto L_0x1257
        L_0x1212:
            r16 = 5
            goto L_0x1257
        L_0x1215:
            java.lang.String r11 = r11.A0I()     // Catch:{ all -> 0x287e }
            if (r11 == 0) goto L_0x124a
            int r10 = X.C31011dK.A00(r11)     // Catch:{ all -> 0x287e }
            if (r10 != r0) goto L_0x124a
            int r10 = java.lang.Character.codePointAt(r11, r2)     // Catch:{ all -> 0x287e }
            java.util.HashSet r2 = X.C31021dL.A00     // Catch:{ all -> 0x287e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x287e }
            boolean r2 = r2.contains(r10)     // Catch:{ all -> 0x287e }
            if (r2 == 0) goto L_0x124a
            r2 = 1852(0x73c, float:2.595E-42)
            java.lang.String r2 = r12.A06(r8, r2)     // Catch:{ all -> 0x287e }
            java.util.List r2 = X.C31021dL.A00(r2)     // Catch:{ all -> 0x287e }
            boolean r2 = r2.contains(r10)     // Catch:{ all -> 0x287e }
            if (r2 == 0) goto L_0x124a
            r16 = 15
            goto L_0x1257
        L_0x1244:
            r16 = 3
            goto L_0x1257
        L_0x1247:
            r16 = 8
            goto L_0x1257
        L_0x124a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x287e }
            goto L_0x125b
        L_0x124f:
            r16 = 9
            goto L_0x1257
        L_0x1252:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x287e }
            goto L_0x125b
        L_0x1257:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x287e }
        L_0x125b:
            r5.A01 = r2     // Catch:{ all -> 0x287e }
            r4.A06(r5)     // Catch:{ all -> 0x287e }
        L_0x1260:
            X.18K r8 = r9.A0J     // Catch:{ all -> 0x287e }
            X.0rv r7 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            X.AnonymousClass00B.A06(r7)     // Catch:{ all -> 0x287e }
            X.1WA r5 = r8.A06     // Catch:{ all -> 0x287e }
            r4 = 16
            com.facebook.redex.RunnableRunnableShape11S0200000_I0_9 r2 = new com.facebook.redex.RunnableRunnableShape11S0200000_I0_9     // Catch:{ all -> 0x287e }
            r2.<init>(r8, r4, r7)     // Catch:{ all -> 0x287e }
            r5.execute(r2)     // Catch:{ all -> 0x287e }
            X.0ua r10 = r3.A05     // Catch:{ all -> 0x287e }
            X.0tZ r4 = r1.A0B     // Catch:{ all -> 0x287e }
            X.0rv r2 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            boolean r2 = X.C16030sJ.A0Q(r2)     // Catch:{ all -> 0x287e }
            r8 = 1
            if (r2 == 0) goto L_0x1286
            r7 = 3
            goto L_0x128e
        L_0x1286:
            if (r4 == 0) goto L_0x128d
            byte r2 = r4.A10     // Catch:{ all -> 0x287e }
            r7 = 1
            if (r2 == 0) goto L_0x128e
        L_0x128d:
            r7 = 2
        L_0x128e:
            X.1Vt r2 = r1.A07     // Catch:{ all -> 0x287e }
            if (r2 != 0) goto L_0x1293
            r8 = 0
        L_0x1293:
            r4 = r17
            r10.A05(r4, r7, r8)     // Catch:{ all -> 0x287e }
            java.lang.Boolean r2 = r6.A00     // Catch:{ all -> 0x287e }
            if (r2 == 0) goto L_0x12c1
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x287e }
            if (r2 != 0) goto L_0x12c1
            java.lang.Integer r2 = r6.A05     // Catch:{ all -> 0x287e }
            if (r2 == 0) goto L_0x12b3
            int r4 = r2.intValue()     // Catch:{ all -> 0x287e }
        L_0x12aa:
            X.1d1 r2 = r1.A0A     // Catch:{ all -> 0x287e }
            if (r2 != 0) goto L_0x12b8
            X.1d1 r2 = r1.A09     // Catch:{ all -> 0x287e }
            if (r2 != 0) goto L_0x12b8
            goto L_0x12b6
        L_0x12b3:
            r4 = 34
            goto L_0x12aa
        L_0x12b6:
            r2 = 0
            goto L_0x12ba
        L_0x12b8:
            int r2 = r2.A00     // Catch:{ all -> 0x287e }
        L_0x12ba:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x287e }
            r9.A0L(r1, r2, r4)     // Catch:{ all -> 0x287e }
        L_0x12c1:
            X.0rv r2 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            boolean r2 = X.C16030sJ.A0Q(r2)     // Catch:{ all -> 0x287e }
            if (r2 != 0) goto L_0x12f2
            X.159 r2 = r3.A08     // Catch:{ all -> 0x287e }
            X.0rv r6 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            X.AnonymousClass00B.A06(r6)     // Catch:{ all -> 0x287e }
            X.1Vw r5 = r1.A0C     // Catch:{ all -> 0x287e }
            if (r5 != 0) goto L_0x12da
            X.1Vw r5 = r1.A0m     // Catch:{ all -> 0x287e }
        L_0x12da:
            java.lang.Iterable r2 = r2.A01()     // Catch:{ all -> 0x287e }
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x287e }
        L_0x12e2:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x287e }
            if (r2 == 0) goto L_0x12fd
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x287e }
            X.1dF r2 = (X.C30961dF) r2     // Catch:{ all -> 0x287e }
            r2.A00(r6, r5)     // Catch:{ all -> 0x287e }
            goto L_0x12e2
        L_0x12f2:
            X.0sq r5 = r3.A0V     // Catch:{ all -> 0x287e }
            r4 = 2
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r2 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8     // Catch:{ all -> 0x287e }
            r2.<init>(r3, r4, r1)     // Catch:{ all -> 0x287e }
            r5.Acl(r2)     // Catch:{ all -> 0x287e }
        L_0x12fd:
            X.14t r4 = r3.A0D     // Catch:{ all -> 0x287e }
            X.0rv r2 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            X.0sH r5 = r4.A01(r2)     // Catch:{ all -> 0x287e }
            boolean r2 = r5.A0i     // Catch:{ all -> 0x287e }
            if (r2 != 0) goto L_0x1317
            r5.A0i = r0     // Catch:{ all -> 0x287e }
            X.0sq r4 = r3.A0V     // Catch:{ all -> 0x287e }
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r2 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8     // Catch:{ all -> 0x287e }
            r2.<init>(r3, r0, r5)     // Catch:{ all -> 0x287e }
            r4.Acl(r2)     // Catch:{ all -> 0x287e }
        L_0x1317:
            boolean r2 = r1.A0f     // Catch:{ all -> 0x287e }
            if (r2 == 0) goto L_0x1452
            java.lang.String r2 = "decryptmessagerunnable/sendRetry"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x287e }
            int r2 = r1.A00()     // Catch:{ all -> 0x287e }
            r5 = 0
            if (r2 <= 0) goto L_0x1385
            byte[] r31 = r15.A0h()     // Catch:{ all -> 0x287e }
            X.1dG r29 = r15.A0I()     // Catch:{ all -> 0x287e }
            X.1dG r30 = r15.A0J()     // Catch:{ all -> 0x287e }
            boolean r2 = r32.A0G()     // Catch:{ all -> 0x287e }
            if (r2 == 0) goto L_0x1382
            X.11R r2 = r3.A09     // Catch:{ all -> 0x287e }
            byte[] r32 = r2.A03()     // Catch:{ all -> 0x287e }
        L_0x133f:
            X.0rv r2 = X.C16030sJ.A00(r33)     // Catch:{ all -> 0x287e }
            boolean r2 = X.C16030sJ.A0Q(r2)     // Catch:{ all -> 0x287e }
            if (r2 == 0) goto L_0x138e
            int r4 = r1.A01     // Catch:{ all -> 0x287e }
            r2 = 7
            if (r4 != r2) goto L_0x138e
            java.lang.Integer r2 = r1.A0H     // Catch:{ all -> 0x287e }
            if (r2 == 0) goto L_0x136a
            X.1Sn r7 = r3.A0F     // Catch:{ all -> 0x287e }
            X.126 r6 = r7.A02     // Catch:{ all -> 0x287e }
            r4 = 29
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r2 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4     // Catch:{ all -> 0x287e }
            r2.<init>(r7, r4, r1)     // Catch:{ all -> 0x287e }
            r6.A01(r2, r4)     // Catch:{ all -> 0x287e }
            X.17f r3 = r3.A0Q     // Catch:{ all -> 0x287e }
            java.lang.String r2 = "status-revoke-delay"
        L_0x1365:
            r3.A08(r1, r2, r5)     // Catch:{ all -> 0x287e }
            goto L_0x1452
        L_0x136a:
            X.11G r4 = r3.A0I     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.Jid r2 = r1.A08     // Catch:{ all -> 0x287e }
            X.0rv r2 = X.C16030sJ.A00(r2)     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r2)     // Catch:{ all -> 0x287e }
            X.1dI r2 = r4.A06(r2)     // Catch:{ all -> 0x287e }
            if (r2 != 0) goto L_0x138e
            X.17f r3 = r3.A0Q     // Catch:{ all -> 0x287e }
            java.lang.String r2 = "status-revoke-drop"
            goto L_0x1365
        L_0x1382:
            r32 = r5
            goto L_0x133f
        L_0x1385:
            r31 = r5
            r29 = r5
            r30 = r5
            r32 = r5
            goto L_0x133f
        L_0x138e:
            X.0zt r7 = r3.A0P     // Catch:{ all -> 0x287e }
            X.0xb r6 = r3.A06     // Catch:{ all -> 0x287e }
            X.12z r5 = r3.A04     // Catch:{ all -> 0x287e }
            X.126 r4 = r3.A0B     // Catch:{ all -> 0x287e }
            X.1Sd r2 = r3.A0N     // Catch:{ all -> 0x287e }
            r33 = 0
            X.1dJ r21 = new X.1dJ     // Catch:{ all -> 0x287e }
            r22 = r5
            r23 = r6
            r24 = r15
            r25 = r4
            r26 = r2
            r27 = r7
            r28 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x287e }
            r21.A00()     // Catch:{ all -> 0x287e }
            goto L_0x1452
        L_0x13b2:
            r3 = r20
            X.0sK r5 = r3.A03     // Catch:{ all -> 0x287e }
            boolean r3 = r5.A0J(r4)     // Catch:{ all -> 0x287e }
            if (r3 != 0) goto L_0x13e9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x287e }
            r5.<init>()     // Catch:{ all -> 0x287e }
            java.lang.String r3 = "MessagingXmppHandler/onMessageForMe/invalid adv sender="
            r5.append(r3)     // Catch:{ all -> 0x287e }
            r5.append(r4)     // Catch:{ all -> 0x287e }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x287e }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x287e }
            r3 = r20
            X.16U r6 = r3.A0H     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.UserJid[] r5 = new com.whatsapp.jid.UserJid[r0]     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.UserJid r3 = r4.getUserJid()     // Catch:{ all -> 0x287e }
            r5[r2] = r3     // Catch:{ all -> 0x287e }
            r2 = 3
            r6.A01(r5, r2)     // Catch:{ all -> 0x287e }
            r2 = 5
            r1.A04 = r2     // Catch:{ all -> 0x287e }
            r2 = r20
            r2.A07(r1)     // Catch:{ all -> 0x287e }
            goto L_0x1452
        L_0x13e9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x287e }
            r3.<init>()     // Catch:{ all -> 0x287e }
            java.lang.String r2 = "MessagingXmppHandler/onMessageForMe/invalid self device identity, jid="
            r3.append(r2)     // Catch:{ all -> 0x287e }
            r3.append(r4)     // Catch:{ all -> 0x287e }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x287e }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x287e }
            r2 = 6
        L_0x13fe:
            r1.A04 = r2     // Catch:{ all -> 0x287e }
            boolean r2 = r5.A0J(r4)     // Catch:{ all -> 0x287e }
            if (r2 == 0) goto L_0x1418
            java.lang.String r3 = r1.A0R     // Catch:{ all -> 0x287e }
            java.lang.String r2 = "peer"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x287e }
            if (r2 == 0) goto L_0x1418
        L_0x1410:
            r2 = r20
            X.17f r2 = r2.A0x     // Catch:{ all -> 0x287e }
            r2.A07(r1)     // Catch:{ all -> 0x287e }
            goto L_0x1452
        L_0x1418:
            int r3 = r1.A01     // Catch:{ all -> 0x287e }
            r2 = 8
            if (r3 == r2) goto L_0x1410
            r2 = 7
            if (r3 == r2) goto L_0x1410
            r2 = r20
            X.1Sd r3 = r2.A0q     // Catch:{ all -> 0x287e }
            r2 = 0
            r3.A00(r2, r1)     // Catch:{ all -> 0x287e }
            goto L_0x1452
        L_0x142a:
            java.lang.String r5 = "MessagingXmppHandler/onMessageForMe/unknown device message without prekey, jid="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x287e }
            r3.<init>(r5)     // Catch:{ all -> 0x287e }
            r3.append(r4)     // Catch:{ all -> 0x287e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x287e }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x287e }
            r3 = 8
            r1.A04 = r3     // Catch:{ all -> 0x287e }
            r3 = r20
            r3.A07(r1)     // Catch:{ all -> 0x287e }
            X.16U r5 = r3.A0H     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.UserJid[] r3 = new com.whatsapp.jid.UserJid[r0]     // Catch:{ all -> 0x287e }
            com.whatsapp.jid.UserJid r1 = r4.getUserJid()     // Catch:{ all -> 0x287e }
            r3[r2] = r1     // Catch:{ all -> 0x287e }
            r1 = 3
            r5.A01(r3, r1)     // Catch:{ all -> 0x287e }
        L_0x1452:
            r1 = r20
            java.util.Set r2 = r1.A1C
            monitor-enter(r2)
            r1 = r34
            r2.remove(r1)     // Catch:{ all -> 0x287b }
            r1 = r20
            int r1 = r1.A00     // Catch:{ all -> 0x287b }
            int r1 = r1 - r0
            r0 = r20
            r0.A00 = r1     // Catch:{ all -> 0x287b }
            monitor-exit(r2)     // Catch:{ all -> 0x287b }
            if (r19 == 0) goto L_0x003e
            r19.unlock()
            return
        L_0x146c:
            java.util.concurrent.atomic.AtomicInteger r1 = X.C226118p.A09
            int r3 = r1.getAndIncrement()
            r4 = 0
        L_0x1473:
            java.lang.Object r2 = r0.A00
            java.util.concurrent.ArrayBlockingQueue r2 = (java.util.concurrent.ArrayBlockingQueue) r2
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x14ed
            int r9 = r4 + 1
            r1 = 15
            if (r4 >= r1) goto L_0x14ed
            java.lang.Object r4 = r2.poll()
            X.1bs r4 = (X.C30171bs) r4
            if (r4 == 0) goto L_0x003e
            java.lang.Object r1 = r0.A03
            X.01D r1 = (X.AnonymousClass01D) r1
            java.lang.Object r7 = r1.get()
            X.0yX r7 = (X.C19500yX) r7
            r6 = 916783105(0x36a50001, float:4.9173836E-6)
            r7.ALF(r6, r3)
            X.1bt r8 = r4.A01
            java.lang.String r2 = r8.ADD()
            java.lang.String r1 = "listener"
            r7.AKp(r1, r2, r6, r3)
            int r5 = r4.A00
            java.lang.String r1 = "event_type"
            r7.AKn(r1, r6, r3, r5)
            X.1bu r4 = r4.A02
            int r2 = r4.A00
            java.lang.String r1 = "marker_id"
            r7.AKn(r1, r6, r3, r2)
            r1 = 1
            if (r5 == r1) goto L_0x14ba
            goto L_0x14be
        L_0x14ba:
            r8.AXS(r4)     // Catch:{ Exception -> 0x14c6 }
            goto L_0x14c1
        L_0x14be:
            r8.AQM(r4)     // Catch:{ Exception -> 0x14c6 }
        L_0x14c1:
            r1 = 2
            r7.AKy(r6, r3, r1)     // Catch:{ Exception -> 0x14c6 }
            goto L_0x14d6
        L_0x14c6:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()     // Catch:{ all -> 0x2897 }
            if (r2 == 0) goto L_0x14d2
            java.lang.String r1 = "fail_reason"
            r7.AKp(r1, r2, r6, r3)     // Catch:{ all -> 0x2897 }
        L_0x14d2:
            r1 = 3
            r7.AKy(r6, r3, r1)     // Catch:{ all -> 0x2897 }
        L_0x14d6:
            int r1 = r4.A01
            java.lang.Object r2 = r0.A01
            java.util.AbstractMap r2 = (java.util.AbstractMap) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r2.get(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            if (r1 == 0) goto L_0x14eb
            r1.decrementAndGet()
        L_0x14eb:
            r4 = r9
            goto L_0x1473
        L_0x14ed:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x003e
            java.lang.Object r0 = r0.A02
            X.0v3 r0 = (X.C17420v3) r0
            r0.AhB()
            return
        L_0x14fb:
            java.lang.Object r9 = r0.A00
            X.10L r9 = (X.AnonymousClass10L) r9
            java.lang.Object r8 = r0.A01
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r4 = r0.A02
            java.io.File r4 = (java.io.File) r4
            java.lang.Object r11 = r0.A03
            java.util.AbstractCollection r11 = (java.util.AbstractCollection) r11
            java.util.Iterator r3 = r11.iterator()
        L_0x150f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1528
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r0 = new java.io.File
            r0.<init>(r4, r1)
            java.lang.String r0 = r0.getAbsolutePath()
            com.facebook.superpack.AssetDecompressor.sync_file_to_disk(r0)
            goto L_0x150f
        L_0x1528:
            java.lang.String r10 = ".superpack_version"
            java.io.File r3 = new java.io.File
            r3.<init>(r4, r10)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x1546 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x1546 }
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x1541 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x1541 }
            r1.write(r0)     // Catch:{ all -> 0x1541 }
            r1.close()     // Catch:{ IOException -> 0x1546 }
            goto L_0x154c
        L_0x1541:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x1545 }
        L_0x1545:
            throw r0     // Catch:{ IOException -> 0x1546 }
        L_0x1546:
            r1 = move-exception
            java.lang.String r0 = "Could not write decompressed asset metadata"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x154c:
            java.lang.String r0 = r3.getAbsolutePath()
            com.facebook.superpack.AssetDecompressor.sync_file_to_disk(r0)
            java.io.File[] r7 = r4.listFiles()
            int r6 = r7.length
            r5 = 0
            r4 = 0
        L_0x155a:
            if (r4 >= r6) goto L_0x1574
            r3 = r7[r4]
            java.lang.String r1 = r3.getName()
            boolean r0 = r11.contains(r1)
            if (r0 != 0) goto L_0x1571
            boolean r0 = r1.equals(r10)
            if (r0 != 0) goto L_0x1571
            r3.delete()
        L_0x1571:
            int r4 = r4 + 1
            goto L_0x155a
        L_0x1574:
            java.util.concurrent.atomic.AtomicBoolean r1 = r9.A07
            r0 = 1
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 == 0) goto L_0x003e
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.io.File r1 = r8.getFilesDir()
            java.lang.String r0 = "decompressed"
            java.io.File r6 = new java.io.File
            r6.<init>(r1, r0)
            java.io.File[] r7 = r6.listFiles()
            int r4 = r7.length
            r11 = 0
        L_0x1593:
            if (r5 >= r4) goto L_0x15c6
            r2 = r7[r5]
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L_0x15ad
            java.lang.String r1 = r2.getName()
            boolean r0 = r9.A02(r8, r1)
            if (r0 != 0) goto L_0x15aa
            r3.add(r1)
        L_0x15aa:
            int r5 = r5 + 1
            goto L_0x1593
        L_0x15ad:
            r2.delete()
            java.lang.String r0 = "Unknown file in decompressed assets directory: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x15aa
        L_0x15c6:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x003e
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.Integer[] r10 = X.AnonymousClass10L.A08
            int r7 = r10.length
        L_0x15d4:
            if (r11 >= r7) goto L_0x160d
            r0 = r10[r11]
            int r5 = r0.intValue()
            java.util.Iterator r12 = r3.iterator()
        L_0x15e0:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x160a
            java.lang.Object r2 = r12.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "assets/compressed/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r9.A00(r5)
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r4.put(r0, r2)
            goto L_0x15e0
        L_0x160a:
            int r11 = r11 + 1
            goto L_0x15d4
        L_0x160d:
            java.lang.String r0 = r8.getPackageCodePath()     // Catch:{ IOException -> 0x163f }
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x163f }
            r2.<init>(r0)     // Catch:{ IOException -> 0x163f }
            java.util.Enumeration r1 = r2.entries()     // Catch:{ all -> 0x163a }
        L_0x161a:
            boolean r0 = r1.hasMoreElements()     // Catch:{ all -> 0x163a }
            if (r0 == 0) goto L_0x1636
            java.lang.Object r0 = r1.nextElement()     // Catch:{ all -> 0x163a }
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0     // Catch:{ all -> 0x163a }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x163a }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x163a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x163a }
            if (r0 == 0) goto L_0x161a
            r3.remove(r0)     // Catch:{ all -> 0x163a }
            goto L_0x161a
        L_0x1636:
            r2.close()     // Catch:{ IOException -> 0x163f }
            goto L_0x163f
        L_0x163a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x163e }
        L_0x163e:
            throw r0     // Catch:{ IOException -> 0x163f }
        L_0x163f:
            java.util.Iterator r5 = r3.iterator()
        L_0x1643:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r4 = new java.io.File
            r4.<init>(r6, r0)
            java.io.File[] r3 = r4.listFiles()
            int r2 = r3.length
            r1 = 0
        L_0x165a:
            if (r1 >= r2) goto L_0x1664
            r0 = r3[r1]
            r0.delete()
            int r1 = r1 + 1
            goto L_0x165a
        L_0x1664:
            r4.delete()
            goto L_0x1643
        L_0x1668:
            java.lang.Object r1 = r0.A03
            X.1bw r1 = (X.C30201bw) r1
            X.1ZK r6 = r1.A00
            X.1bx r1 = r6.A0N
            if (r1 == 0) goto L_0x003e
            int r5 = r1.A02()
            X.1bx r1 = r6.A0N
            int r2 = r1.A03()
            X.1bx r1 = r6.A0N
            boolean r4 = r1.A0D()
            java.lang.Object r3 = r0.A00
            X.1by r3 = (X.C30221by) r3
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r3.A5q(r1)
            if (r4 == 0) goto L_0x16a2
            java.lang.Object r3 = r0.A02
            android.os.Handler r3 = (android.os.Handler) r3
            r1 = 16
            r3.postDelayed(r0, r1)
        L_0x1696:
            java.lang.Object r1 = r0.A01
            X.1by r1 = (X.C30221by) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.A5q(r0)
            return
        L_0x16a2:
            if (r5 != r2) goto L_0x1696
            X.1bx r1 = r6.A0N
            r1.A09()
            X.1bx r1 = r6.A0N
            if (r1 == 0) goto L_0x16b7
            r1.A05()     // Catch:{ IOException | IllegalStateException -> 0x16b1 }
            goto L_0x16b7
        L_0x16b1:
            r2 = move-exception
            java.lang.String r1 = "VoiceNoteDraftSeekRunnable/ error preparing audio player for voice note preview "
            com.whatsapp.util.Log.e(r1, r2)
        L_0x16b7:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r3.A5q(r1)
            goto L_0x1696
        L_0x16bd:
            java.lang.Object r4 = r0.A00
            X.0qf r4 = (X.C15310qf) r4
            java.lang.Object r3 = r0.A02
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r1 = r0.A01
            X.1b4 r1 = (X.C29711b4) r1
            java.lang.String r1 = r1.A00
            java.lang.Object r0 = r0.A03
            X.0qb r0 = (X.C15270qb) r0
            X.0qg r2 = new X.0qg
            r2.<init>(r0, r1)
            r0 = -1
            r4.A00(r2, r3, r0)
            return
        L_0x16da:
            java.lang.Object r5 = r0.A00
            X.1bz r5 = (X.C30231bz) r5
            java.lang.Object r4 = r0.A01
            X.1c0 r4 = (X.C30241c0) r4
            java.lang.Object r3 = r0.A02
            X.1c1 r3 = (X.C30251c1) r3
            java.lang.Object r2 = r0.A03
            X.1c2 r2 = (X.C30261c2) r2
            int r1 = r5.A00
            X.1c3 r0 = r5.A01
            r4.ASl(r3, r2, r0, r1)
            return
        L_0x16f2:
            java.lang.Object r5 = r0.A00
            X.1bz r5 = (X.C30231bz) r5
            java.lang.Object r4 = r0.A01
            X.1c0 r4 = (X.C30241c0) r4
            java.lang.Object r3 = r0.A02
            X.1c1 r3 = (X.C30251c1) r3
            java.lang.Object r2 = r0.A03
            X.1c2 r2 = (X.C30261c2) r2
            int r1 = r5.A00
            X.1c3 r0 = r5.A01
            r4.ASu(r3, r2, r0, r1)
            return
        L_0x170a:
            java.lang.Object r5 = r0.A00
            X.1bz r5 = (X.C30231bz) r5
            java.lang.Object r4 = r0.A01
            X.1c0 r4 = (X.C30241c0) r4
            java.lang.Object r3 = r0.A02
            X.1c1 r3 = (X.C30251c1) r3
            java.lang.Object r2 = r0.A03
            X.1c2 r2 = (X.C30261c2) r2
            int r1 = r5.A00
            X.1c3 r0 = r5.A01
            r4.ASk(r3, r2, r0, r1)
            return
        L_0x1722:
            java.lang.Object r5 = r0.A00
            X.0w1 r5 = (X.C18020w1) r5
            java.lang.Object r4 = r0.A01
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r3 = r0.A02
            X.0rv r3 = (X.C15830rv) r3
            java.lang.Object r2 = r0.A03
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.1c5 r1 = new X.1c5
            r1.<init>()
            r1.A00 = r4
            X.0sO r0 = r5.A07
            java.util.Set r0 = r0.A02(r3)
            int r0 = r0.size()
            int r0 = X.C18020w1.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            r1.A02 = r2
            X.0t9 r0 = r5.A0C
            r0.A06(r1)
            return
        L_0x1755:
            java.lang.Object r5 = r0.A00
            X.1c6 r5 = (X.C30301c6) r5
            java.lang.Object r1 = r0.A01
            com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r1 = (com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r1
            java.lang.Object r4 = r0.A02
            X.0sH r4 = (X.C16010sH) r4
            java.lang.Object r3 = r0.A03
            byte[] r3 = (byte[]) r3
            r0 = 3
            X.C18450wi.A0H(r3, r0)
            X.121 r2 = r1.A0B
            r1 = 1
            r0 = 0
            boolean r0 = r2.A0B(r4, r0, r3, r1)
            r5.element = r0
            return
        L_0x1774:
            java.lang.Object r3 = r0.A01
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            java.lang.Object r1 = r0.A02
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            java.lang.Object r0 = r0.A03
            java.io.BufferedInputStream r0 = (java.io.BufferedInputStream) r0
            r3.set(r2)
            r1.disconnect()
            X.C30311c8.A04(r0)
            return
        L_0x178a:
            java.lang.Object r5 = r0.A00
            X.01Y r5 = (X.AnonymousClass01Y) r5
            java.lang.Object r4 = r0.A01
            X.1ZJ r4 = (X.AnonymousClass1ZJ) r4
            java.lang.Object r3 = r0.A02
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r2 = r0.A03
            X.1ZI r2 = (X.AnonymousClass1ZI) r2
            r0 = 300(0x12c, double:1.48E-321)
            android.os.SystemClock.sleep(r0)
            java.util.List r0 = r4.A01
            if (r0 != 0) goto L_0x17b5
            boolean r1 = r4.A09
            X.0sH r0 = r4.A03
            boolean r0 = r5.A0U(r0, r1)
            if (r0 == 0) goto L_0x17b5
            com.whatsapp.jid.UserJid r0 = r4.A04
            java.util.List r0 = r5.A07(r0)
            r4.A01 = r0
        L_0x17b5:
            r0 = 1
            r5.A0F(r3, r2, r4, r0)
            return
        L_0x17ba:
            java.lang.Object r4 = r0.A00
            com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r4 = (com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r4
            java.lang.Object r2 = r0.A01
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.Object r1 = r0.A02
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r5 = r0.A03
            double r7 = r2.doubleValue()
            double r9 = r1.doubleValue()
            android.content.Context r1 = r4.getApplicationContext()
            X.013 r0 = r4.A0B
            android.content.Context r0 = r0.A00
            java.util.Locale r0 = X.AnonymousClass013.A00(r0)
            android.location.Geocoder r6 = new android.location.Geocoder
            r6.<init>(r1, r0)
            r11 = 1
            java.util.List r3 = r6.getFromLocation(r7, r9, r11)     // Catch:{ Exception -> 0x17e7 }
            goto L_0x17ee
        L_0x17e7:
            r1 = move-exception
            java.lang.String r0 = "DirectorySetLocationMapActivity/geoLocateAddress"
            com.whatsapp.util.Log.w(r0, r1)
            r3 = 0
        L_0x17ee:
            X.0pt r2 = r4.A05
            r1 = 22
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0
            r0.<init>(r4, r3, r5, r1)
            r2.A0K(r0)
            return
        L_0x17fb:
            java.lang.Object r8 = r0.A00
            X.1OK r8 = (X.AnonymousClass1OK) r8
            java.lang.Object r11 = r0.A01
            java.io.File r11 = (java.io.File) r11
            java.lang.Object r10 = r0.A02
            com.whatsapp.fieldstats.events.WamCall r10 = (com.whatsapp.fieldstats.events.WamCall) r10
            java.lang.Object r9 = r0.A03
            X.1cB r9 = (X.C30331cB) r9
            boolean r0 = r11.exists()
            if (r0 == 0) goto L_0x1a34
            boolean r0 = r11.isDirectory()
            if (r0 == 0) goto L_0x1a34
            boolean r0 = r11.exists()
            if (r0 == 0) goto L_0x18fe
            boolean r0 = r11.isDirectory()
            if (r0 == 0) goto L_0x18fe
            java.io.File[] r7 = r11.listFiles()
            if (r7 == 0) goto L_0x1908
            r1 = 5
            com.facebook.redex.IDxComparatorShape184S0100000_2_I1 r0 = new com.facebook.redex.IDxComparatorShape184S0100000_2_I1
            r0.<init>(r8, r1)
            java.util.Arrays.sort(r7, r0)
            int r6 = r7.length
            r5 = 0
        L_0x1834:
            java.lang.String r3 = "app/VoipTimeSeriesLogger: injectAdditionalDataToLogs could not inject into time series file"
            r1 = 1
            if (r5 >= r6) goto L_0x1858
            r0 = r7[r5]
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x1851 }
            r4.<init>(r0, r1)     // Catch:{ IOException -> 0x1851 }
            java.lang.String r1 = "user_rating"
            java.lang.Long r0 = r10.userRating     // Catch:{ all -> 0x184c }
            X.AnonymousClass1OK.A01(r4, r0, r1)     // Catch:{ all -> 0x184c }
            r4.close()     // Catch:{ IOException -> 0x1851 }
            goto L_0x1855
        L_0x184c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x1850 }
        L_0x1850:
            throw r0     // Catch:{ IOException -> 0x1851 }
        L_0x1851:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x1855:
            int r5 = r5 + 1
            goto L_0x1834
        L_0x1858:
            int r6 = r6 - r1
            r0 = r7[r6]
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x1904 }
            r4.<init>(r0, r1)     // Catch:{ IOException -> 0x1904 }
            java.lang.String r1 = "call_t"
            java.lang.Long r0 = r10.callT     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A01(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "freeze_t"
            java.lang.Long r0 = r10.videoRenderFreezeT     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A01(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "freeze_8x"
            java.lang.Long r0 = r10.videoRenderFreeze8xT     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A01(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "num_freezes"
            java.lang.Long r0 = r10.videoRenderNumFreezes     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A01(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "jb_lost"
            java.lang.Double r0 = r10.jbLost     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A00(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "jb_empties"
            java.lang.Double r0 = r10.jbEmpties     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A00(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "jb_gets"
            java.lang.Double r0 = r10.jbGets     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A00(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "rtt"
            java.lang.Long r0 = r10.callAvgRtt     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A01(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "jb_delay"
            java.lang.Double r0 = r10.jbAvgDelay     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A00(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "max_participants"
            java.lang.Long r0 = r10.maxConnectedParticipants     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A01(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "num_participants"
            java.lang.Long r0 = r10.numConnectedParticipants     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A01(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "vid_rx_bps"
            java.lang.Double r0 = r10.videoRxBitrate     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A00(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "freeze_high_bwe_t"
            java.lang.Long r0 = r10.renderFreezeHighPeerBweT     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A01(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "high_bwe_t"
            java.lang.Long r0 = r10.highPeerBweT     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A01(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "freeze_mid_bwe_t"
            java.lang.Long r0 = r10.renderFreezeLowToHighPeerBweT     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A01(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "mid_bwe_t"
            java.lang.Long r0 = r10.lowToHighPeerBweT     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A01(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "freeze_low_bwe_t"
            java.lang.Long r0 = r10.renderFreezeLowPeerBweT     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A01(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "low_bwe_t"
            java.lang.Long r0 = r10.lowPeerBweT     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A01(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "jb_lostempty_pct_low_bwe"
            java.lang.Double r0 = r10.jbLostEmptyLowPeerBwePerSec     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A00(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "jb_lostempty_pct_mid_bwe"
            java.lang.Double r0 = r10.jbLostEmptyLowToHighPeerBwePerSec     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A00(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            java.lang.String r1 = "jb_lostempty_pct_high_bwe"
            java.lang.Double r0 = r10.jbLostEmptyHighPeerBwePerSec     // Catch:{ all -> 0x18f9 }
            X.AnonymousClass1OK.A00(r4, r0, r1)     // Catch:{ all -> 0x18f9 }
            r4.close()     // Catch:{ IOException -> 0x1904 }
            goto L_0x1908
        L_0x18f9:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x18fd }
        L_0x18fd:
            throw r0     // Catch:{ IOException -> 0x1904 }
        L_0x18fe:
            java.lang.String r0 = "app/VoipTimeSeriesLogger: injectAdditionalDataToLogs received bad directory path, skipping injection."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x1908
        L_0x1904:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)
        L_0x1908:
            X.0tz r0 = r8.A03
            android.content.Context r0 = r0.A00
            java.io.File r3 = X.C30341cC.A08(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r11.getName()
            r1.append(r0)
            java.lang.String r0 = ".zip"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r7 = new java.io.File
            r7.<init>(r3, r0)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x198f }
            r5.<init>(r7)     // Catch:{ IOException -> 0x198f }
            java.util.zip.ZipOutputStream r6 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x198a }
            r6.<init>(r5)     // Catch:{ all -> 0x198a }
            java.io.File[] r12 = r11.listFiles()     // Catch:{ all -> 0x1985 }
            if (r12 == 0) goto L_0x197e
            int r4 = r12.length     // Catch:{ all -> 0x1985 }
            r3 = 0
        L_0x193c:
            if (r3 >= r4) goto L_0x197e
            r1 = r12[r3]     // Catch:{ all -> 0x1985 }
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch:{ all -> 0x1985 }
            r14.<init>(r1)     // Catch:{ all -> 0x1985 }
            java.lang.String r13 = r1.getName()     // Catch:{ all -> 0x1985 }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x1985 }
            r0.<init>(r13)     // Catch:{ all -> 0x1985 }
            r6.putNextEntry(r0)     // Catch:{ all -> 0x1985 }
            X.AnonymousClass1XI.A0H(r14, r6)     // Catch:{ all -> 0x1985 }
            r6.closeEntry()     // Catch:{ all -> 0x1985 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x1985 }
            r13.<init>()     // Catch:{ all -> 0x1985 }
            java.lang.String r0 = "app/VoipTimeSeriesLogger: compressed file "
            r13.append(r0)     // Catch:{ all -> 0x1985 }
            java.lang.String r0 = r1.getName()     // Catch:{ all -> 0x1985 }
            r13.append(r0)     // Catch:{ all -> 0x1985 }
            java.lang.String r0 = " with init size "
            r13.append(r0)     // Catch:{ all -> 0x1985 }
            long r0 = r1.length()     // Catch:{ all -> 0x1985 }
            r13.append(r0)     // Catch:{ all -> 0x1985 }
            java.lang.String r0 = r13.toString()     // Catch:{ all -> 0x1985 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1985 }
            int r3 = r3 + 1
            goto L_0x193c
        L_0x197e:
            r6.close()     // Catch:{ all -> 0x198a }
            r5.close()     // Catch:{ IOException -> 0x198f }
            goto L_0x1999
        L_0x1985:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x1989 }
        L_0x1989:
            throw r0     // Catch:{ all -> 0x198a }
        L_0x198a:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x198e }
        L_0x198e:
            throw r0     // Catch:{ IOException -> 0x198f }
        L_0x198f:
            r1 = move-exception
            java.lang.String r0 = "app/VoipTimeSeriesLogger: could not create compressed time series file"
            com.whatsapp.util.Log.w(r0, r1)
            r7.delete()
            goto L_0x19cb
        L_0x1999:
            r0 = 0
            long r5 = X.AnonymousClass1XI.A00(r0, r11)
            long r14 = r7.length()
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)
            long r0 = r5 - r14
            double r3 = (double) r0
            double r3 = r3 * r12
            double r0 = (double) r5
            double r3 = r3 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r9.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r9.A02 = r0
            long r4 = r7.length()
            int r0 = r8.A00
            long r0 = (long) r0
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x19f1
            boolean r0 = r8.A03(r10, r7)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A00 = r0
        L_0x19cb:
            boolean r0 = X.AnonymousClass1XI.A0O(r11)
            if (r0 != 0) goto L_0x19eb
            java.lang.String r0 = "app/VoipTimeSeriesLogger: time series data directory "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r11.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = " could not be deleted"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x19eb:
            X.0t9 r0 = r8.A04
            r0.A06(r9)
            return
        L_0x19f1:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.A00 = r0
            java.lang.String r0 = "app/VoipTimeSeriesLogger: aborting upload because file "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = r7.getName()
            r3.append(r0)
            java.lang.String r0 = " has size "
            r3.append(r0)
            long r0 = r7.length()
            r3.append(r0)
            java.lang.String r0 = " which exceeds the threshold "
            r3.append(r0)
            int r0 = r8.A00
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0so r3 = r8.A01
            long r0 = r7.length()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "voip-time-series-upload-aborted"
            r3.AcB(r0, r1, r2)
            r7.delete()
            goto L_0x19cb
        L_0x1a34:
            java.lang.String r0 = "app/VoipTimeSeriesLogger: uploadTimeSeries received bad directory path, skipping upload."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x1a3a:
            java.lang.Object r1 = r0.A00
            X.11W r1 = (X.AnonymousClass11W) r1
            java.lang.Object r5 = r0.A01
            X.1WD r5 = (X.AnonymousClass1WD) r5
            java.lang.Object r4 = r0.A02
            X.1WD r4 = (X.AnonymousClass1WD) r4
            java.lang.Object r3 = r0.A03
            X.1WD r3 = (X.AnonymousClass1WD) r3
            java.lang.String r0 = "CompanionBootstrapManager/startCriticalBootstrap timed out"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11R r0 = r1.A07
            android.content.SharedPreferences r1 = r0.A00()
            java.lang.String r0 = "companion_syncd_critical_bootstrap_state"
            int r1 = r1.getInt(r0, r2)
            r0 = 2
            if (r1 < r0) goto L_0x1a6c
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x1a60:
            r5.A02(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.A02(r0)
            r3.A02(r0)
            return
        L_0x1a6c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x1a60
        L_0x1a6f:
            java.lang.Object r14 = r0.A00
            X.1CY r14 = (X.AnonymousClass1CY) r14
            java.lang.Object r1 = r0.A01
            r20 = r1
            r1 = r20
            X.1WN r1 = (X.AnonymousClass1WN) r1
            r20 = r1
            java.lang.Object r1 = r0.A02
            r18 = r1
            r1 = r18
            X.1WM r1 = (X.AnonymousClass1WM) r1
            r18 = r1
            java.lang.Object r1 = r0.A03
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = "history-sync-manager/startMessageHistorySync for "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r0 = r20
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r20
            com.whatsapp.jid.DeviceJid r0 = r0.A06
            r41 = r0
            r0 = r20
            boolean r0 = r0.A09
            r22 = r0
            r19 = 2
            if (r0 == 0) goto L_0x1ab0
            r19 = 3
        L_0x1ab0:
            X.19E r4 = r14.A03
            if (r18 == 0) goto L_0x1aba
            r3 = 2
            r0 = r18
            r4.A09(r0, r3)
        L_0x1aba:
            X.1Bn r0 = r14.A0G
            X.1bP r3 = X.C29901bP.A0D     // Catch:{ Exception -> 0x1fa0 }
            X.1Wr r10 = r3.A0U()     // Catch:{ Exception -> 0x1fa0 }
            X.1bQ r10 = (X.C29911bQ) r10     // Catch:{ Exception -> 0x1fa0 }
            X.1bR r3 = X.C29921bR.A02     // Catch:{ Exception -> 0x1fa0 }
            r10.A07(r3)     // Catch:{ Exception -> 0x1fa0 }
            X.12G r3 = r0.A06     // Catch:{ Exception -> 0x1fa0 }
            java.util.Map r24 = r3.A05()     // Catch:{ Exception -> 0x1fa0 }
            java.util.Map r23 = r3.A04()     // Catch:{ Exception -> 0x1fa0 }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ Exception -> 0x1fa0 }
            r4.<init>()     // Catch:{ Exception -> 0x1fa0 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ Exception -> 0x1fa0 }
        L_0x1adc:
            boolean r3 = r5.hasNext()     // Catch:{ Exception -> 0x1fa0 }
            if (r3 == 0) goto L_0x1af0
            java.lang.Object r3 = r5.next()     // Catch:{ Exception -> 0x1fa0 }
            X.1WX r3 = (X.AnonymousClass1WX) r3     // Catch:{ Exception -> 0x1fa0 }
            X.1WQ r3 = r3.A00     // Catch:{ Exception -> 0x1fa0 }
            X.0rv r3 = r3.A06     // Catch:{ Exception -> 0x1fa0 }
            r4.add(r3)     // Catch:{ Exception -> 0x1fa0 }
            goto L_0x1adc
        L_0x1af0:
            java.util.HashMap r15 = new java.util.HashMap     // Catch:{ Exception -> 0x1fa0 }
            r15.<init>()     // Catch:{ Exception -> 0x1fa0 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x1fa0 }
            r6.<init>()     // Catch:{ Exception -> 0x1fa0 }
            java.util.Iterator r8 = r4.iterator()     // Catch:{ Exception -> 0x1fa0 }
        L_0x1afe:
            boolean r3 = r8.hasNext()     // Catch:{ Exception -> 0x1fa0 }
            r5 = 0
            if (r3 == 0) goto L_0x1b29
            java.lang.Object r7 = r8.next()     // Catch:{ Exception -> 0x1fa0 }
            com.whatsapp.jid.Jid r7 = (com.whatsapp.jid.Jid) r7     // Catch:{ Exception -> 0x1fa0 }
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.of(r7)     // Catch:{ Exception -> 0x1fa0 }
            if (r4 == 0) goto L_0x1b25
            X.0sK r3 = r0.A01     // Catch:{ Exception -> 0x1fa0 }
            boolean r3 = r3.A0I(r4)     // Catch:{ Exception -> 0x1fa0 }
            if (r3 != 0) goto L_0x1b25
            com.whatsapp.jid.DeviceJid r3 = r4.getPrimaryDevice()     // Catch:{ Exception -> 0x1fa0 }
            X.1Yb r3 = X.C28851Ya.A02(r3)     // Catch:{ Exception -> 0x1fa0 }
            r6.put(r3, r7)     // Catch:{ Exception -> 0x1fa0 }
            goto L_0x1afe
        L_0x1b25:
            r15.put(r7, r5)     // Catch:{ Exception -> 0x1fa0 }
            goto L_0x1afe
        L_0x1b29:
            X.11s r4 = r0.A08     // Catch:{ Exception -> 0x1fa0 }
            java.util.Set r3 = r6.keySet()     // Catch:{ Exception -> 0x1fa0 }
            java.util.Map r3 = r4.A0M(r3)     // Catch:{ Exception -> 0x1fa0 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ Exception -> 0x1fa0 }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ Exception -> 0x1fa0 }
        L_0x1b3b:
            boolean r3 = r7.hasNext()     // Catch:{ Exception -> 0x1fa0 }
            if (r3 == 0) goto L_0x1b64
            java.lang.Object r3 = r7.next()     // Catch:{ Exception -> 0x1fa0 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Exception -> 0x1fa0 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ Exception -> 0x1fa0 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x1fa0 }
            X.1WL r3 = (X.AnonymousClass1WL) r3     // Catch:{ Exception -> 0x1fa0 }
            java.lang.Object r4 = r6.get(r4)     // Catch:{ Exception -> 0x1fa0 }
            X.AnonymousClass00B.A06(r4)     // Catch:{ Exception -> 0x1fa0 }
            if (r3 != 0) goto L_0x1b5c
            r3 = r5
            goto L_0x1b60
        L_0x1b5c:
            X.1cD r3 = r3.A00     // Catch:{ Exception -> 0x1fa0 }
            byte[] r3 = r3.A01     // Catch:{ Exception -> 0x1fa0 }
        L_0x1b60:
            r15.put(r4, r3)     // Catch:{ Exception -> 0x1fa0 }
            goto L_0x1b3b
        L_0x1b64:
            java.util.Iterator r25 = r1.iterator()     // Catch:{ Exception -> 0x1fa0 }
            r16 = 0
            r37 = 0
        L_0x1b6c:
            boolean r1 = r25.hasNext()     // Catch:{ Exception -> 0x1fa0 }
            if (r1 == 0) goto L_0x1f82
            java.lang.Object r8 = r25.next()     // Catch:{ Exception -> 0x1fa0 }
            X.1WX r8 = (X.AnonymousClass1WX) r8     // Catch:{ Exception -> 0x1fa0 }
            X.1WQ r9 = r8.A00     // Catch:{ Exception -> 0x1fa0 }
            X.0rv r7 = r9.A06     // Catch:{ Exception -> 0x1fa0 }
            int r1 = r9.A00     // Catch:{ Exception -> 0x1fa0 }
            if (r1 <= 0) goto L_0x1b87
            X.0pd r3 = r0.A0N     // Catch:{ Exception -> 0x1fa0 }
            r1 = 624(0x270, float:8.74E-43)
            r3.A0C(r1)     // Catch:{ Exception -> 0x1fa0 }
        L_0x1b87:
            X.1bT r1 = X.C29941bT.A0j     // Catch:{ Exception -> 0x1fa0 }
            X.1Wr r1 = r1.A0U()     // Catch:{ Exception -> 0x1fa0 }
            X.1bS r1 = (X.C29931bS) r1     // Catch:{ Exception -> 0x1fa0 }
            X.AnonymousClass00B.A06(r7)     // Catch:{ Exception -> 0x1fa0 }
            java.lang.String r5 = r7.getRawString()     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 1
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0P = r5     // Catch:{ Exception -> 0x1fa0 }
            long r5 = r9.A04     // Catch:{ Exception -> 0x1fa0 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r3
            r3 = 0
            long r3 = java.lang.Math.max(r5, r3)     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r6 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r6 = (X.C29941bT) r6     // Catch:{ Exception -> 0x1fa0 }
            int r5 = r6.A01     // Catch:{ Exception -> 0x1fa0 }
            r5 = r5 | 1024(0x400, float:1.435E-42)
            r6.A01 = r5     // Catch:{ Exception -> 0x1fa0 }
            r6.A09 = r3     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r9.A00     // Catch:{ Exception -> 0x1fa0 }
            int r5 = java.lang.Math.max(r3, r2)     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 16
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A07 = r5     // Catch:{ Exception -> 0x1fa0 }
            boolean r5 = r9.A0G     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 32
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0e = r5     // Catch:{ Exception -> 0x1fa0 }
            boolean r5 = r9.A0F     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0c = r5     // Catch:{ Exception -> 0x1fa0 }
            int r5 = r9.A00     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r6 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 | r6
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A08 = r5     // Catch:{ Exception -> 0x1fa0 }
            java.lang.Object r4 = r15.get(r7)     // Catch:{ Exception -> 0x1fa0 }
            byte[] r4 = (byte[]) r4     // Catch:{ Exception -> 0x1fa0 }
            if (r4 == 0) goto L_0x1c25
            int r3 = r4.length     // Catch:{ Exception -> 0x1fa0 }
            X.1Ww r5 = X.C28631Ww.A01(r4, r2, r3)     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r6 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 | r6
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0G = r5     // Catch:{ Exception -> 0x1fa0 }
        L_0x1c25:
            int r5 = r9.A01     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 128(0x80, float:1.794E-43)
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A04 = r5     // Catch:{ Exception -> 0x1fa0 }
            long r3 = r9.A02     // Catch:{ Exception -> 0x1fa0 }
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x1c4b
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r6 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r6 = (X.C29941bT) r6     // Catch:{ Exception -> 0x1fa0 }
            int r5 = r6.A01     // Catch:{ Exception -> 0x1fa0 }
            r5 = r5 | 256(0x100, float:3.59E-43)
            r6.A01 = r5     // Catch:{ Exception -> 0x1fa0 }
            r6.A0B = r3     // Catch:{ Exception -> 0x1fa0 }
        L_0x1c4b:
            com.whatsapp.jid.UserJid r3 = r9.A07     // Catch:{ Exception -> 0x1fa0 }
            if (r3 == 0) goto L_0x1c62
            java.lang.String r5 = r3.getRawString()     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 2
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0S = r5     // Catch:{ Exception -> 0x1fa0 }
        L_0x1c62:
            com.whatsapp.jid.UserJid r3 = r9.A08     // Catch:{ Exception -> 0x1fa0 }
            if (r3 == 0) goto L_0x1c79
            java.lang.String r5 = r3.getRawString()     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 4
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0T = r5     // Catch:{ Exception -> 0x1fa0 }
        L_0x1c79:
            boolean r3 = X.C16030sJ.A0L(r7)     // Catch:{ Exception -> 0x1fa0 }
            if (r3 == 0) goto L_0x1da7
            java.lang.String r3 = r9.A0B     // Catch:{ Exception -> 0x1fa0 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x1fa0 }
            if (r3 != 0) goto L_0x1c98
            java.lang.String r5 = r9.A0B     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 2048(0x800, float:2.87E-42)
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0R = r5     // Catch:{ Exception -> 0x1fa0 }
        L_0x1c98:
            com.whatsapp.jid.GroupJid r5 = com.whatsapp.jid.GroupJid.of(r7)     // Catch:{ Exception -> 0x1fa0 }
            if (r5 == 0) goto L_0x1da7
            boolean r3 = r9.A0G     // Catch:{ Exception -> 0x1fa0 }
            if (r3 != 0) goto L_0x1cbd
            X.0sO r3 = r0.A0B     // Catch:{ Exception -> 0x1fa0 }
            X.0us r3 = r3.A07     // Catch:{ Exception -> 0x1fa0 }
            X.1cE r3 = r3.A04(r5)     // Catch:{ Exception -> 0x1fa0 }
            java.lang.String r6 = r3.A0B()     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0U = r6     // Catch:{ Exception -> 0x1fa0 }
        L_0x1cbd:
            X.0sG r11 = r0.A05     // Catch:{ Exception -> 0x1fa0 }
            X.0sH r6 = r11.A0A(r5)     // Catch:{ Exception -> 0x1fa0 }
            boolean r9 = r6.A0c     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r12 = 67108864(0x4000000, float:1.5046328E-36)
            r3 = r3 | r12
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0h = r9     // Catch:{ Exception -> 0x1fa0 }
            X.0sO r3 = r0.A0B     // Catch:{ Exception -> 0x1fa0 }
            boolean r3 = r3.A09(r5)     // Catch:{ Exception -> 0x1fa0 }
            if (r3 != 0) goto L_0x1da7
            X.1cF r4 = r6.A0H     // Catch:{ Exception -> 0x1fa0 }
            if (r4 == 0) goto L_0x1cfb
            java.lang.String r3 = r4.A02     // Catch:{ Exception -> 0x1fa0 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x1fa0 }
            if (r3 != 0) goto L_0x1cfb
            java.lang.String r9 = r4.A02     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r12 = 1073741824(0x40000000, float:2.0)
            r3 = r3 | r12
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0N = r9     // Catch:{ Exception -> 0x1fa0 }
        L_0x1cfb:
            com.whatsapp.jid.UserJid r3 = r11.A0D(r5)     // Catch:{ Exception -> 0x1fa0 }
            if (r3 == 0) goto L_0x1d15
            java.lang.String r9 = r3.getRawString()     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r3 | r11
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0M = r9     // Catch:{ Exception -> 0x1fa0 }
        L_0x1d15:
            java.lang.String r3 = r6.A0R     // Catch:{ Exception -> 0x1fa0 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x1fa0 }
            if (r3 != 0) goto L_0x1d35
            java.lang.String r9 = r6.A0R     // Catch:{ Exception -> 0x1fa0 }
            r3 = -9223372036854775808
            long r3 = X.C29501aj.A01(r9, r3)     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r11 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r11 = (X.C29941bT) r11     // Catch:{ Exception -> 0x1fa0 }
            int r9 = r11.A01     // Catch:{ Exception -> 0x1fa0 }
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            r9 = r9 | r12
            r11.A01 = r9     // Catch:{ Exception -> 0x1fa0 }
            r11.A0A = r3     // Catch:{ Exception -> 0x1fa0 }
        L_0x1d35:
            X.0rt r3 = r0.A09     // Catch:{ Exception -> 0x1fa0 }
            int r13 = r3.A02(r5)     // Catch:{ Exception -> 0x1fa0 }
            r12 = 0
            r11 = 1
            r9 = 0
            if (r13 != r11) goto L_0x1d41
            r9 = 1
        L_0x1d41:
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A02     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 1
            r4.A02 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0a = r9     // Catch:{ Exception -> 0x1fa0 }
            X.0ur r3 = r0.A0T     // Catch:{ Exception -> 0x1fa0 }
            r3.A05(r5, r1)     // Catch:{ Exception -> 0x1fa0 }
            r3 = 3
            r4 = 0
            if (r13 != r3) goto L_0x1d5a
            r4 = 1
        L_0x1d5a:
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r9 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r9 = (X.C29941bT) r9     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r9.A02     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 2
            r9.A02 = r3     // Catch:{ Exception -> 0x1fa0 }
            r9.A0Z = r4     // Catch:{ Exception -> 0x1fa0 }
            X.0sL r4 = X.C16050sL.A03(r5)     // Catch:{ Exception -> 0x1fa0 }
            if (r4 == 0) goto L_0x1d8a
            X.15k r3 = r0.A0H     // Catch:{ Exception -> 0x1fa0 }
            X.0sL r3 = r3.A00(r4)     // Catch:{ Exception -> 0x1fa0 }
            if (r3 == 0) goto L_0x1d8a
            java.lang.String r5 = r3.getRawString()     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A02     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 4
            r4.A02 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0V = r5     // Catch:{ Exception -> 0x1fa0 }
        L_0x1d8a:
            X.15l r3 = r0.A0R     // Catch:{ Exception -> 0x1fa0 }
            boolean r3 = r3.A00(r6)     // Catch:{ Exception -> 0x1fa0 }
            if (r3 != 0) goto L_0x1d96
            int r3 = r6.A02     // Catch:{ Exception -> 0x1fa0 }
            if (r3 != r11) goto L_0x1d97
        L_0x1d96:
            r12 = 1
        L_0x1d97:
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r5 = 134217728(0x8000000, float:3.85186E-34)
            r3 = r3 | r5
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0i = r12     // Catch:{ Exception -> 0x1fa0 }
        L_0x1da7:
            boolean r3 = r7 instanceof com.whatsapp.jid.UserJid     // Catch:{ Exception -> 0x1fa0 }
            if (r3 == 0) goto L_0x1eda
            boolean r3 = X.C16030sJ.A0O(r7)     // Catch:{ Exception -> 0x1fa0 }
            if (r3 == 0) goto L_0x1e3c
            r4 = r7
            X.1ZT r4 = (X.AnonymousClass1ZT) r4     // Catch:{ Exception -> 0x1fa0 }
            X.0vJ r3 = r0.A0I     // Catch:{ Exception -> 0x1fa0 }
            X.1ZX r3 = r3.A00(r4)     // Catch:{ Exception -> 0x1fa0 }
            if (r3 == 0) goto L_0x1dcf
            java.lang.String r5 = r3.getRawString()     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A02     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 128(0x80, float:1.794E-43)
            r4.A02 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0Q = r5     // Catch:{ Exception -> 0x1fa0 }
        L_0x1dcf:
            X.0rt r3 = r0.A09     // Catch:{ Exception -> 0x1fa0 }
            X.0rx r5 = r3.A06(r7)     // Catch:{ Exception -> 0x1fa0 }
            if (r5 == 0) goto L_0x1eda
            r3 = r24
            java.lang.Object r9 = r3.get(r7)     // Catch:{ Exception -> 0x1fa0 }
            X.1cG r9 = (X.C30381cG) r9     // Catch:{ Exception -> 0x1fa0 }
            if (r9 == 0) goto L_0x1e0e
            byte[] r4 = r9.A01     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.length     // Catch:{ Exception -> 0x1fa0 }
            X.1Ww r6 = X.C28631Ww.A01(r4, r2, r3)     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r11 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 | r11
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0H = r6     // Catch:{ Exception -> 0x1fa0 }
            java.lang.Long r3 = r9.A00     // Catch:{ Exception -> 0x1fa0 }
            long r3 = r3.longValue()     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r9 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r9 = (X.C29941bT) r9     // Catch:{ Exception -> 0x1fa0 }
            int r6 = r9.A01     // Catch:{ Exception -> 0x1fa0 }
            r11 = 524288(0x80000, float:7.34684E-40)
            r6 = r6 | r11
            r9.A01 = r6     // Catch:{ Exception -> 0x1fa0 }
            r9.A0F = r3     // Catch:{ Exception -> 0x1fa0 }
        L_0x1e0e:
            r3 = r23
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x1fa0 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ Exception -> 0x1fa0 }
            if (r3 == 0) goto L_0x1e2c
            long r3 = r3.longValue()     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r7 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r7 = (X.C29941bT) r7     // Catch:{ Exception -> 0x1fa0 }
            int r6 = r7.A01     // Catch:{ Exception -> 0x1fa0 }
            r9 = 33554432(0x2000000, float:9.403955E-38)
            r6 = r6 | r9
            r7.A01 = r6     // Catch:{ Exception -> 0x1fa0 }
            r7.A0E = r3     // Catch:{ Exception -> 0x1fa0 }
        L_0x1e2c:
            X.1cH r3 = X.C30391cH.A02     // Catch:{ Exception -> 0x1fa0 }
            X.1Wr r4 = r3.A0U()     // Catch:{ Exception -> 0x1fa0 }
            X.1cI r4 = (X.C30401cI) r4     // Catch:{ Exception -> 0x1fa0 }
            X.1WV r3 = r5.A0X     // Catch:{ Exception -> 0x1fa0 }
            int r5 = r3.disappearingMessagesInitiator     // Catch:{ Exception -> 0x1fa0 }
            r3 = 1
            if (r5 == r3) goto L_0x1ead
            goto L_0x1ea7
        L_0x1e3c:
            boolean r3 = X.C16030sJ.A0M(r7)     // Catch:{ Exception -> 0x1fa0 }
            if (r3 == 0) goto L_0x1dcf
            r9 = r7
            X.1ZX r9 = (X.AnonymousClass1ZX) r9     // Catch:{ Exception -> 0x1fa0 }
            X.0vK r3 = r0.A0K     // Catch:{ Exception -> 0x1fa0 }
            java.lang.String r5 = r3.A00(r9)     // Catch:{ Exception -> 0x1fa0 }
            if (r5 == 0) goto L_0x1e5c
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A02     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 8
            r4.A02 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0O = r5     // Catch:{ Exception -> 0x1fa0 }
        L_0x1e5c:
            X.0vJ r3 = r0.A0I     // Catch:{ Exception -> 0x1fa0 }
            X.1ZT r3 = r3.A01(r9)     // Catch:{ Exception -> 0x1fa0 }
            if (r3 == 0) goto L_0x1e77
            java.lang.String r5 = r3.getRawString()     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A02     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 16
            r4.A02 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0W = r5     // Catch:{ Exception -> 0x1fa0 }
        L_0x1e77:
            X.15H r6 = r0.A0J     // Catch:{ Exception -> 0x1fa0 }
            java.lang.Boolean r3 = r6.A01(r9)     // Catch:{ Exception -> 0x1fa0 }
            if (r3 == 0) goto L_0x1e92
            boolean r5 = r3.booleanValue()     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A02     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 32
            r4.A02 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0f = r5     // Catch:{ Exception -> 0x1fa0 }
        L_0x1e92:
            boolean r5 = r6.A0A(r9)     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A02     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 64
            r4.A02 = r3     // Catch:{ Exception -> 0x1fa0 }
            r4.A0d = r5     // Catch:{ Exception -> 0x1fa0 }
            goto L_0x1dcf
        L_0x1ea7:
            r3 = 2
            if (r5 == r3) goto L_0x1eb0
            X.1cJ r6 = X.C30411cJ.A01     // Catch:{ Exception -> 0x1fa0 }
            goto L_0x1eb2
        L_0x1ead:
            X.1cJ r6 = X.C30411cJ.A02     // Catch:{ Exception -> 0x1fa0 }
            goto L_0x1eb2
        L_0x1eb0:
            X.1cJ r6 = X.C30411cJ.A03     // Catch:{ Exception -> 0x1fa0 }
        L_0x1eb2:
            r4.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r5 = r4.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1cH r5 = (X.C30391cH) r5     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r5.A00     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 1
            r5.A00 = r3     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r6.value     // Catch:{ Exception -> 0x1fa0 }
            r5.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r3 = r4.A02()     // Catch:{ Exception -> 0x1fa0 }
            X.1cH r3 = (X.C30391cH) r3     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            r4.A0K = r3     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r5 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r5
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
        L_0x1eda:
            java.util.List r5 = r8.A01     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r5.size()     // Catch:{ Exception -> 0x1fa0 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x1fa0 }
            long r37 = r37 + r3
            boolean r3 = r5.isEmpty()     // Catch:{ Exception -> 0x1fa0 }
            if (r3 != 0) goto L_0x1f40
            java.util.Iterator r6 = r5.iterator()     // Catch:{ Exception -> 0x1fa0 }
        L_0x1eed:
            boolean r3 = r6.hasNext()     // Catch:{ Exception -> 0x1fa0 }
            if (r3 == 0) goto L_0x1f06
            java.lang.Object r4 = r6.next()     // Catch:{ Exception -> 0x1fa0 }
            X.0tZ r4 = (X.C16740tZ) r4     // Catch:{ Exception -> 0x1fa0 }
            X.0ur r3 = r0.A0T     // Catch:{ Exception -> 0x1eff }
            r3.A06(r1, r4)     // Catch:{ Exception -> 0x1eff }
            goto L_0x1eed
        L_0x1eff:
            r4 = move-exception
            java.lang.String r3 = "history-sync-send-methods/send-initial-bootstrap addMessage exception"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ Exception -> 0x1fa0 }
            goto L_0x1eed
        L_0x1f06:
            java.lang.String r3 = "history-sync-send-methods/setEndOfHistoryStatusForInitialSync"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x1fa0 }
            if (r22 != 0) goto L_0x1f40
            java.lang.Object r3 = r5.get(r2)     // Catch:{ Exception -> 0x1fa0 }
            X.0tZ r3 = (X.C16740tZ) r3     // Catch:{ Exception -> 0x1fa0 }
            long r5 = r3.A0I     // Catch:{ Exception -> 0x1fa0 }
            X.0t3 r3 = r0.A07     // Catch:{ Exception -> 0x1fa0 }
            long r11 = r3.A00()     // Catch:{ Exception -> 0x1fa0 }
            X.0s5 r4 = r0.A02     // Catch:{ Exception -> 0x1fa0 }
            X.0tC r3 = X.C15910s6.A1Q     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A02(r3)     // Catch:{ Exception -> 0x1fa0 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x1fa0 }
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 * r7
            long r11 = r11 - r3
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x1f40
            X.1cK r5 = X.C30421cK.A02     // Catch:{ Exception -> 0x1fa0 }
            r1.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r4 = r1.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r4 = (X.C29941bT) r4     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r4.A01     // Catch:{ Exception -> 0x1fa0 }
            r3 = r3 | 512(0x200, float:7.175E-43)
            r4.A01 = r3     // Catch:{ Exception -> 0x1fa0 }
            int r3 = r5.value     // Catch:{ Exception -> 0x1fa0 }
            r4.A03 = r3     // Catch:{ Exception -> 0x1fa0 }
        L_0x1f40:
            X.1Wm r1 = r1.A02()     // Catch:{ Exception -> 0x1fa0 }
            X.1bT r1 = (X.C29941bT) r1     // Catch:{ Exception -> 0x1fa0 }
            r10.A06(r1)     // Catch:{ Exception -> 0x1fa0 }
            X.0w3 r7 = r0.A0P     // Catch:{ Exception -> 0x1fa0 }
            java.util.Random r6 = r0.A0W     // Catch:{ Exception -> 0x1fa0 }
            long r3 = r7.A02(r6)     // Catch:{ Exception -> 0x1fa0 }
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 % r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r8
            int r5 = (int) r3     // Catch:{ Exception -> 0x1fa0 }
            r10.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r3 = r10.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bP r3 = (X.C29901bP) r3     // Catch:{ Exception -> 0x1fa0 }
            int r1 = r3.A01     // Catch:{ Exception -> 0x1fa0 }
            r1 = r1 | 32
            r3.A01 = r1     // Catch:{ Exception -> 0x1fa0 }
            r3.A05 = r5     // Catch:{ Exception -> 0x1fa0 }
            byte[] r3 = r7.A05(r6)     // Catch:{ Exception -> 0x1fa0 }
            int r1 = r3.length     // Catch:{ Exception -> 0x1fa0 }
            X.1Ww r4 = X.C28631Ww.A01(r3, r2, r1)     // Catch:{ Exception -> 0x1fa0 }
            r10.A03()     // Catch:{ Exception -> 0x1fa0 }
            X.1Wm r3 = r10.A00     // Catch:{ Exception -> 0x1fa0 }
            X.1bP r3 = (X.C29901bP) r3     // Catch:{ Exception -> 0x1fa0 }
            int r1 = r3.A01     // Catch:{ Exception -> 0x1fa0 }
            r1 = r1 | 16
            r3.A01 = r1     // Catch:{ Exception -> 0x1fa0 }
            r3.A06 = r4     // Catch:{ Exception -> 0x1fa0 }
            goto L_0x1b6c
        L_0x1f82:
            r29 = 100
            r31 = -1
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r33 = -1
            r35 = -1
            r39 = 0
            r22 = r0
            r23 = r18
            r24 = r41
            r25 = r10
            r22.A01(r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35, r37, r39)     // Catch:{ Exception -> 0x1fa0 }
            goto L_0x1fae
        L_0x1fa0:
            r5 = move-exception
            X.0so r4 = r0.A00
            r3 = 0
            java.lang.String r1 = "history-sync-send-methods/send-initial-bootstrap/exception"
            r4.A03(r1, r3, r5)
            java.lang.String r1 = "history-sync-send-methods/send-initial-bootstrap: recent msgs error"
            com.whatsapp.util.Log.e(r1, r5)
        L_0x1fae:
            X.128 r3 = r0.A0F     // Catch:{ Exception -> 0x206b }
            r1 = 0
            java.util.List r8 = r3.A01(r1)     // Catch:{ Exception -> 0x206b }
            java.util.Collections.reverse(r8)     // Catch:{ Exception -> 0x206b }
            X.1bP r1 = X.C29901bP.A0D     // Catch:{ Exception -> 0x206b }
            X.1Wr r1 = r1.A0U()     // Catch:{ Exception -> 0x206b }
            X.1bQ r1 = (X.C29911bQ) r1     // Catch:{ Exception -> 0x206b }
            X.1bR r3 = X.C29921bR.A03     // Catch:{ Exception -> 0x206b }
            r1.A07(r3)     // Catch:{ Exception -> 0x206b }
            X.0pd r5 = r0.A0N     // Catch:{ Exception -> 0x206b }
            r4 = 1182(0x49e, float:1.656E-42)
            X.0tM r3 = X.C16620tM.A02     // Catch:{ Exception -> 0x206b }
            int r7 = r5.A03(r3, r4)     // Catch:{ Exception -> 0x206b }
            r6 = 0
            java.util.Iterator r9 = r8.iterator()     // Catch:{ Exception -> 0x206b }
        L_0x1fd4:
            boolean r3 = r9.hasNext()     // Catch:{ Exception -> 0x206b }
            if (r3 == 0) goto L_0x2040
            java.lang.Object r4 = r9.next()     // Catch:{ Exception -> 0x206b }
            X.0tZ r4 = (X.C16740tZ) r4     // Catch:{ Exception -> 0x206b }
            X.0ur r3 = r0.A0T     // Catch:{ Exception -> 0x206b }
            X.1cL r8 = r3.A03(r4)     // Catch:{ Exception -> 0x206b }
            if (r8 == 0) goto L_0x1fd4
            X.1Vw r3 = r4.A11     // Catch:{ Exception -> 0x206b }
            boolean r3 = r3.A02     // Catch:{ Exception -> 0x206b }
            if (r3 != 0) goto L_0x2009
            X.11G r3 = r0.A0G     // Catch:{ Exception -> 0x206b }
            boolean r3 = r3.A0J(r4)     // Catch:{ Exception -> 0x206b }
            if (r3 != 0) goto L_0x2009
            r8.A03()     // Catch:{ Exception -> 0x206b }
            X.1Wm r5 = r8.A00     // Catch:{ Exception -> 0x206b }
            X.1cM r5 = (X.C30441cM) r5     // Catch:{ Exception -> 0x206b }
            r4 = 1
            int r3 = r5.A01     // Catch:{ Exception -> 0x206b }
            r3 = r3 | 64
            r5.A01 = r3     // Catch:{ Exception -> 0x206b }
            r5.A0f = r4     // Catch:{ Exception -> 0x206b }
            r8.A02()     // Catch:{ Exception -> 0x206b }
        L_0x2009:
            int r6 = r6 + 1
            r1.A03()     // Catch:{ Exception -> 0x206b }
            X.1Wm r5 = r1.A00     // Catch:{ Exception -> 0x206b }
            X.1bP r5 = (X.C29901bP) r5     // Catch:{ Exception -> 0x206b }
            X.1XE r4 = r5.A0B     // Catch:{ Exception -> 0x206b }
            r3 = r4
            X.1XF r3 = (X.AnonymousClass1XF) r3     // Catch:{ Exception -> 0x206b }
            boolean r3 = r3.A00     // Catch:{ Exception -> 0x206b }
            if (r3 != 0) goto L_0x2021
            X.1XE r4 = X.C28541Wm.A0G(r4)     // Catch:{ Exception -> 0x206b }
            r5.A0B = r4     // Catch:{ Exception -> 0x206b }
        L_0x2021:
            X.1Wm r3 = r8.A02()     // Catch:{ Exception -> 0x206b }
            r4.add(r3)     // Catch:{ Exception -> 0x206b }
            if (r7 <= 0) goto L_0x1fd4
            if (r6 < r7) goto L_0x1fd4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x206b }
            r4.<init>()     // Catch:{ Exception -> 0x206b }
            java.lang.String r3 = "history-sync-send-methods/sendStatusV3Messages reach max status msg, count="
            r4.append(r3)     // Catch:{ Exception -> 0x206b }
            r4.append(r6)     // Catch:{ Exception -> 0x206b }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x206b }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ Exception -> 0x206b }
        L_0x2040:
            r28 = 1
            r29 = 100
            r31 = -1
            r26 = 0
            X.1Wm r3 = r1.A00     // Catch:{ Exception -> 0x206b }
            X.1bP r3 = (X.C29901bP) r3     // Catch:{ Exception -> 0x206b }
            X.1XE r3 = r3.A0B     // Catch:{ Exception -> 0x206b }
            int r3 = r3.size()     // Catch:{ Exception -> 0x206b }
            long r3 = (long) r3     // Catch:{ Exception -> 0x206b }
            r39 = 0
            r27 = 0
            r30 = 0
            r33 = -1
            r35 = -1
            r22 = r0
            r23 = r18
            r24 = r41
            r25 = r1
            r37 = r3
            r22.A01(r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35, r37, r39)     // Catch:{ Exception -> 0x206b }
            goto L_0x2071
        L_0x206b:
            r3 = move-exception
            java.lang.String r1 = "history-sync-send-methods/send-status-v3: error"
            com.whatsapp.util.Log.e(r1, r3)
        L_0x2071:
            r4 = 0
            r3 = r18
            r1 = r41
            r0.A02(r3, r1, r4, r2)
            X.0pd r4 = r14.A0D
            r1 = 1829(0x725, float:2.563E-42)
            X.0tM r3 = X.C16620tM.A02
            int r4 = r4.A03(r3, r1)
            r1 = 3
            if (r4 < r1) goto L_0x2088
            r21 = 1
        L_0x2088:
            X.192 r1 = r14.A08
            X.0pd r4 = r1.A02
            r1 = 1613(0x64d, float:2.26E-42)
            boolean r1 = r4.A0E(r3, r1)
            if (r1 == 0) goto L_0x209d
            r1 = 1598(0x63e, float:2.239E-42)
            boolean r1 = r4.A0E(r3, r1)
            if (r1 == 0) goto L_0x209d
            r2 = 1
        L_0x209d:
            r25 = 0
            X.0sK r1 = r0.A01
            boolean r1 = r1.A0G()
            if (r1 != 0) goto L_0x20ab
            if (r21 != 0) goto L_0x2148
            if (r2 != 0) goto L_0x2148
        L_0x20ab:
            r0 = r20
            X.1cN r7 = r0.A05
            r41.toString()
            r10 = 0
            r6 = 3
            r5 = 1
            r1 = 0
            r0 = r19
            if (r0 != r6) goto L_0x20bb
            r1 = 1
        L_0x20bb:
            long r28 = r14.A00(r7, r0, r1)
            X.1Nt r4 = r14.A01
            if (r0 != r6) goto L_0x20c4
            r10 = 1
        L_0x20c4:
            r8 = 2
            r11 = 1000000(0xf4240, double:4.940656E-318)
            r0 = -1
            r2 = r19
            if (r2 == r8) goto L_0x2125
            if (r7 == 0) goto L_0x211c
            java.lang.Integer r0 = r7.A01
            if (r0 == 0) goto L_0x211c
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x211c
        L_0x20da:
            long r0 = (long) r0
        L_0x20db:
            long r0 = r0 * r11
        L_0x20dc:
            X.0uq r2 = r14.A09
            long r24 = r2.A01()
            r8 = 1
            int r2 = (r24 > r8 ? 1 : (r24 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x20ea
            long r24 = r24 + r8
        L_0x20ea:
            r2 = r19
            if (r2 != r6) goto L_0x2119
            r2 = 2
            long r26 = r14.A00(r7, r2, r5)
            X.0pd r3 = r4.A01
            r2 = 2645(0xa55, float:3.706E-42)
            r3.A02(r2)
            r30 = -1
            r23 = 2
            r20 = r14
            r21 = r18
            r22 = r41
            r20.A01(r21, r22, r23, r24, r26, r28, r30)
        L_0x2107:
            r10 = r28
            r2 = r14
            r3 = r18
            r4 = r41
            r5 = r19
            r6 = r26
            r8 = r28
            r12 = r0
            r2.A01(r3, r4, r5, r6, r8, r10, r12)
            return
        L_0x2119:
            r26 = r24
            goto L_0x2107
        L_0x211c:
            X.0s5 r1 = r4.A00
            X.0tC r0 = X.C15910s6.A1O
            int r0 = r1.A02(r0)
            goto L_0x20da
        L_0x2125:
            X.0pd r8 = r4.A01
            r2 = 2645(0xa55, float:3.706E-42)
            int r9 = r8.A03(r3, r2)
            if (r10 != 0) goto L_0x20dc
            if (r7 == 0) goto L_0x20dc
            java.lang.Integer r10 = r7.A02
            if (r10 == 0) goto L_0x20dc
            r2 = -1
            if (r9 == r2) goto L_0x20dc
            int r2 = r10.intValue()
            if (r2 <= r9) goto L_0x20dc
            r2 = 2706(0xa92, float:3.792E-42)
            int r2 = r8.A03(r3, r2)
            if (r2 <= 0) goto L_0x20dc
            long r0 = (long) r2
            goto L_0x20db
        L_0x2148:
            X.1bP r1 = X.C29901bP.A0D     // Catch:{ Exception -> 0x2295 }
            X.1Wr r1 = r1.A0U()     // Catch:{ Exception -> 0x2295 }
            X.1bQ r1 = (X.C29911bQ) r1     // Catch:{ Exception -> 0x2295 }
            X.1bR r4 = X.C29921bR.A04     // Catch:{ Exception -> 0x2295 }
            r1.A07(r4)     // Catch:{ Exception -> 0x2295 }
            if (r21 == 0) goto L_0x215a
            r0.A04(r1)     // Catch:{ Exception -> 0x2295 }
        L_0x215a:
            if (r2 == 0) goto L_0x2276
            X.192 r6 = r0.A0C     // Catch:{ Exception -> 0x2295 }
            X.0t3 r2 = r0.A07     // Catch:{ Exception -> 0x2295 }
            long r8 = r2.A00()     // Catch:{ Exception -> 0x2295 }
            r4 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r8 = r8 - r4
            r5 = 1000(0x3e8, float:1.401E-42)
            r2 = 2
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ Exception -> 0x2295 }
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x2295 }
            r2 = 0
            r7[r2] = r4     // Catch:{ Exception -> 0x2295 }
            java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x2295 }
            r2 = 1
            r7[r2] = r4     // Catch:{ Exception -> 0x2295 }
            X.0tq r2 = r6.A01     // Catch:{ Exception -> 0x2295 }
            X.0tf r5 = r2.get()     // Catch:{ Exception -> 0x2295 }
            X.0tg r4 = r5.A02     // Catch:{ all -> 0x2271 }
            java.lang.String r2 = "SELECT group_jid_row_id, user_jid_row_id, is_leave, timestamp FROM group_past_participant_user WHERE timestamp >= ? ORDER BY timestamp DESC LIMIT ?"
            android.database.Cursor r4 = r4.A08(r2, r7)     // Catch:{ all -> 0x2271 }
            java.util.List r2 = X.AnonymousClass192.A00(r4)     // Catch:{ all -> 0x226a }
            if (r4 == 0) goto L_0x2194
            r4.close()     // Catch:{ all -> 0x2271 }
        L_0x2194:
            r5.close()     // Catch:{ Exception -> 0x2295 }
            java.util.Map r2 = r6.A01(r2)     // Catch:{ Exception -> 0x2295 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ Exception -> 0x2295 }
            java.util.Iterator r13 = r2.iterator()     // Catch:{ Exception -> 0x2295 }
        L_0x21a3:
            boolean r2 = r13.hasNext()     // Catch:{ Exception -> 0x2295 }
            if (r2 == 0) goto L_0x2276
            java.lang.Object r6 = r13.next()     // Catch:{ Exception -> 0x2295 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ Exception -> 0x2295 }
            X.1cO r2 = X.C30461cO.A03     // Catch:{ Exception -> 0x2295 }
            X.1Wr r7 = r2.A0U()     // Catch:{ Exception -> 0x2295 }
            java.lang.Object r2 = r6.getKey()     // Catch:{ Exception -> 0x2295 }
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2     // Catch:{ Exception -> 0x2295 }
            java.lang.String r5 = r2.getRawString()     // Catch:{ Exception -> 0x2295 }
            r7.A03()     // Catch:{ Exception -> 0x2295 }
            X.1Wm r4 = r7.A00     // Catch:{ Exception -> 0x2295 }
            X.1cO r4 = (X.C30461cO) r4     // Catch:{ Exception -> 0x2295 }
            int r2 = r4.A00     // Catch:{ Exception -> 0x2295 }
            r2 = r2 | 1
            r4.A00 = r2     // Catch:{ Exception -> 0x2295 }
            r4.A02 = r5     // Catch:{ Exception -> 0x2295 }
            java.lang.Object r2 = r6.getValue()     // Catch:{ Exception -> 0x2295 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ Exception -> 0x2295 }
            java.util.Iterator r12 = r2.iterator()     // Catch:{ Exception -> 0x2295 }
        L_0x21d8:
            boolean r2 = r12.hasNext()     // Catch:{ Exception -> 0x2295 }
            if (r2 == 0) goto L_0x224b
            java.lang.Object r9 = r12.next()     // Catch:{ Exception -> 0x2295 }
            X.1cP r9 = (X.C30471cP) r9     // Catch:{ Exception -> 0x2295 }
            X.1cQ r2 = X.C30481cQ.A04     // Catch:{ Exception -> 0x2295 }
            X.1Wr r6 = r2.A0U()     // Catch:{ Exception -> 0x2295 }
            com.whatsapp.jid.UserJid r2 = r9.A02     // Catch:{ Exception -> 0x2295 }
            java.lang.String r5 = r2.getRawString()     // Catch:{ Exception -> 0x2295 }
            r6.A03()     // Catch:{ Exception -> 0x2295 }
            X.1Wm r4 = r6.A00     // Catch:{ Exception -> 0x2295 }
            X.1cQ r4 = (X.C30481cQ) r4     // Catch:{ Exception -> 0x2295 }
            int r2 = r4.A00     // Catch:{ Exception -> 0x2295 }
            r2 = r2 | 1
            r4.A00 = r2     // Catch:{ Exception -> 0x2295 }
            r4.A03 = r5     // Catch:{ Exception -> 0x2295 }
            long r4 = r9.A00     // Catch:{ Exception -> 0x2295 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r10
            r6.A03()     // Catch:{ Exception -> 0x2295 }
            X.1Wm r8 = r6.A00     // Catch:{ Exception -> 0x2295 }
            X.1cQ r8 = (X.C30481cQ) r8     // Catch:{ Exception -> 0x2295 }
            int r2 = r8.A00     // Catch:{ Exception -> 0x2295 }
            r2 = r2 | 4
            r8.A00 = r2     // Catch:{ Exception -> 0x2295 }
            r8.A02 = r4     // Catch:{ Exception -> 0x2295 }
            boolean r2 = r9.A03     // Catch:{ Exception -> 0x2295 }
            if (r2 == 0) goto L_0x2248
            X.1cR r5 = X.C30491cR.A01     // Catch:{ Exception -> 0x2295 }
        L_0x2219:
            r6.A03()     // Catch:{ Exception -> 0x2295 }
            X.1Wm r4 = r6.A00     // Catch:{ Exception -> 0x2295 }
            X.1cQ r4 = (X.C30481cQ) r4     // Catch:{ Exception -> 0x2295 }
            int r2 = r4.A00     // Catch:{ Exception -> 0x2295 }
            r2 = r2 | 2
            r4.A00 = r2     // Catch:{ Exception -> 0x2295 }
            int r2 = r5.value     // Catch:{ Exception -> 0x2295 }
            r4.A01 = r2     // Catch:{ Exception -> 0x2295 }
            X.1Wm r6 = r6.A02()     // Catch:{ Exception -> 0x2295 }
            r7.A03()     // Catch:{ Exception -> 0x2295 }
            X.1Wm r5 = r7.A00     // Catch:{ Exception -> 0x2295 }
            X.1cO r5 = (X.C30461cO) r5     // Catch:{ Exception -> 0x2295 }
            X.1XE r4 = r5.A01     // Catch:{ Exception -> 0x2295 }
            r2 = r4
            X.1XF r2 = (X.AnonymousClass1XF) r2     // Catch:{ Exception -> 0x2295 }
            boolean r2 = r2.A00     // Catch:{ Exception -> 0x2295 }
            if (r2 != 0) goto L_0x2244
            X.1XE r4 = X.C28541Wm.A0G(r4)     // Catch:{ Exception -> 0x2295 }
            r5.A01 = r4     // Catch:{ Exception -> 0x2295 }
        L_0x2244:
            r4.add(r6)     // Catch:{ Exception -> 0x2295 }
            goto L_0x21d8
        L_0x2248:
            X.1cR r5 = X.C30491cR.A02     // Catch:{ Exception -> 0x2295 }
            goto L_0x2219
        L_0x224b:
            X.1Wm r6 = r7.A02()     // Catch:{ Exception -> 0x2295 }
            r1.A03()     // Catch:{ Exception -> 0x2295 }
            X.1Wm r5 = r1.A00     // Catch:{ Exception -> 0x2295 }
            X.1bP r5 = (X.C29901bP) r5     // Catch:{ Exception -> 0x2295 }
            X.1XE r4 = r5.A08     // Catch:{ Exception -> 0x2295 }
            r2 = r4
            X.1XF r2 = (X.AnonymousClass1XF) r2     // Catch:{ Exception -> 0x2295 }
            boolean r2 = r2.A00     // Catch:{ Exception -> 0x2295 }
            if (r2 != 0) goto L_0x2265
            X.1XE r4 = X.C28541Wm.A0G(r4)     // Catch:{ Exception -> 0x2295 }
            r5.A08 = r4     // Catch:{ Exception -> 0x2295 }
        L_0x2265:
            r4.add(r6)     // Catch:{ Exception -> 0x2295 }
            goto L_0x21a3
        L_0x226a:
            r0 = move-exception
            if (r4 == 0) goto L_0x2270
            r4.close()     // Catch:{ all -> 0x2270 }
        L_0x2270:
            throw r0     // Catch:{ all -> 0x2271 }
        L_0x2271:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x2275 }
        L_0x2275:
            throw r0     // Catch:{ Exception -> 0x2295 }
        L_0x2276:
            r26 = 0
            r27 = 5
            r28 = 100
            r30 = -1
            r36 = 0
            r29 = 0
            r32 = -1
            r34 = -1
            r38 = 0
            r21 = r0
            r22 = r18
            r23 = r41
            r24 = r1
            r21.A01(r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r34, r36, r38)     // Catch:{ Exception -> 0x2295 }
            goto L_0x20ab
        L_0x2295:
            r1 = move-exception
            java.lang.String r0 = "history-sync-send-methods/sendNonBlockingDataMessages: error"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x20ab
        L_0x229d:
            java.lang.Object r9 = r0.A01
            r2 = r9
            X.1cS r2 = (X.C30501cS) r2
            X.0sH r11 = r2.A0G
            android.view.View r7 = r2.A01
            android.widget.TextView r14 = r2.A08
            X.1cU r6 = r2.A0B
            android.widget.TextView r8 = r2.A09
            android.view.View r1 = r2.A02
            r15 = r1
            java.lang.Object r1 = r0.A00
            X.1Kx r1 = (X.C25731Kx) r1
            java.lang.String r1 = r1.A02(r11)
            android.util.Pair r2 = r2.A0A()
            java.lang.Object r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            X.1cT r9 = (X.C30511cT) r9
            boolean r5 = r9.A09()
            r12 = 800(0x320, double:3.953E-321)
            r3 = 0
            r4 = 0
            if (r5 == 0) goto L_0x23c7
            android.text.TextPaint r5 = r14.getPaint()
            java.lang.String r4 = "•"
            float r4 = r5.measureText(r4)
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r10 = (int) r4
            int r4 = r14.getPaddingLeft()
            int r10 = r10 + r4
            int r4 = r14.getPaddingRight()
            int r10 = r10 + r4
            com.obwhatsapp.TextEmojiLabel r4 = r6.A02
            android.text.TextPaint r5 = r4.getPaint()
            java.lang.String r4 = r11.A0B()
            float r4 = r5.measureText(r4)
            double r4 = (double) r4
            double r5 = java.lang.Math.ceil(r4)
            int r4 = (int) r5
            X.00k r9 = r9.A0K
            android.content.res.Resources r6 = r9.getResources()
            r5 = 2131231956(0x7f0804d4, float:1.8080008E38)
            android.graphics.drawable.Drawable r5 = r6.getDrawable(r5)
            int r5 = r5.getIntrinsicWidth()
            int r4 = r4 + r5
            android.content.res.Resources r6 = r9.getResources()
            r5 = 2131167239(0x7f070807, float:1.7948746E38)
            int r5 = r6.getDimensionPixelSize(r5)
            int r4 = r4 + r5
            int r4 = r4 + r10
            float r6 = (float) r4
            float r3 = r3 + r6
            if (r1 == 0) goto L_0x23c4
            android.text.TextPaint r5 = r8.getPaint()
            float r9 = r5.measureText(r2)
            int r5 = r15.getWidth()
            float r5 = (float) r5
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x23c4
            android.text.TextPaint r5 = r8.getPaint()
            float r5 = r5.measureText(r1)
            float r9 = r9 - r5
            float r3 = r3 + r9
        L_0x2338:
            r16 = 0
            java.lang.Object r5 = r0.A03
            X.013 r5 = (X.AnonymousClass013) r5
            boolean r5 = r5.A0T()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x2347
            float r6 = -r3
        L_0x2347:
            android.view.animation.TranslateAnimation r5 = new android.view.animation.TranslateAnimation
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r14 = r5
            r18 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r5.setDuration(r12)
            r9 = 5
            com.obwhatsapp.IDxLAdapterShape12S0200000_2_I1 r6 = new com.obwhatsapp.IDxLAdapterShape12S0200000_2_I1
            r6.<init>(r7, r9, r0)
            r5.setAnimationListener(r6)
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            r6.width = r4
            r7.setLayoutParams(r6)
            r7.startAnimation(r5)
        L_0x2370:
            r16 = 0
            java.lang.Object r5 = r0.A03
            X.013 r5 = (X.AnonymousClass013) r5
            boolean r6 = r5.A0T()
            r6 = r6 ^ 1
            float r3 = -r3
            if (r6 != 0) goto L_0x2380
            float r3 = (float) r4
        L_0x2380:
            android.view.animation.TranslateAnimation r4 = new android.view.animation.TranslateAnimation
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r14 = r4
            r18 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r3 = 1
            r4.setFillAfter(r3)
            r4.setDuration(r12)
            X.1ca r3 = new X.1ca
            r3.<init>(r8, r0, r1)
            r4.setAnimationListener(r3)
            boolean r0 = r5.A0T()
            if (r0 == 0) goto L_0x23a9
            r8.setText(r1)
        L_0x23a9:
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            android.text.TextPaint r0 = r8.getPaint()
            float r0 = r0.measureText(r2)
            double r0 = (double) r0
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            r3.width = r0
            r8.setLayoutParams(r3)
            r8.startAnimation(r4)
            return
        L_0x23c4:
            r1 = r2
            goto L_0x2338
        L_0x23c7:
            if (r1 != 0) goto L_0x23cb
            r1 = r2
            goto L_0x2370
        L_0x23cb:
            android.text.TextPaint r3 = r8.getPaint()
            float r3 = r3.measureText(r2)
            android.text.TextPaint r5 = r8.getPaint()
            float r5 = r5.measureText(r1)
            float r3 = r3 - r5
            goto L_0x2370
        L_0x23dd:
            java.lang.Object r3 = r0.A00
            X.17V r3 = (X.AnonymousClass17V) r3
            java.lang.Object r5 = r0.A01
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r4 = r0.A02
            X.1cb r4 = (X.C30571cb) r4
            int r6 = r5.intValue()
            r1 = 2
            r0 = 1
            if (r6 != r0) goto L_0x23ff
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x23f5:
            X.17U r0 = r3.A08
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r0.A01(r4, r6, r1)
            goto L_0x2404
        L_0x23ff:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L_0x23f5
        L_0x2404:
            java.util.ArrayList r1 = r3.A03()     // Catch:{ JSONException -> 0x2413 }
            X.1Vw r0 = r4.A11     // Catch:{ JSONException -> 0x2413 }
            java.lang.String r0 = r0.A01     // Catch:{ JSONException -> 0x2413 }
            boolean r0 = r1.contains(r0)     // Catch:{ JSONException -> 0x2413 }
            if (r0 == 0) goto L_0x2413
            return
        L_0x2413:
            java.util.ArrayList r7 = r3.A03()     // Catch:{ JSONException -> 0x2449 }
            X.1Vw r0 = r4.A11     // Catch:{ JSONException -> 0x2449 }
            java.lang.String r0 = r0.A01     // Catch:{ JSONException -> 0x2449 }
            r7.add(r2, r0)     // Catch:{ JSONException -> 0x2449 }
            r1 = 5
            int r0 = r7.size()     // Catch:{ JSONException -> 0x2449 }
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ JSONException -> 0x2449 }
            java.util.List r1 = r7.subList(r2, r0)     // Catch:{ JSONException -> 0x2449 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x2449 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x2449 }
            java.lang.String r2 = r0.toString()     // Catch:{ JSONException -> 0x2449 }
            X.0u3 r1 = r3.A05     // Catch:{ JSONException -> 0x2449 }
            java.lang.String r0 = "otp.logging.dedup"
            android.content.SharedPreferences r0 = r1.A00(r0)     // Catch:{ JSONException -> 0x2449 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ JSONException -> 0x2449 }
            java.lang.String r0 = "otp.logging.dedup.messageIds"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)     // Catch:{ JSONException -> 0x2449 }
            r0.apply()     // Catch:{ JSONException -> 0x2449 }
        L_0x2449:
            X.1ce r2 = new X.1ce
            r2.<init>()
            r2.A00 = r5
            r2.A01 = r6
            X.1cf r0 = r4.A00
            java.lang.String r0 = r0.A04
            r2.A03 = r0
            com.whatsapp.jid.UserJid r0 = r4.A0C()
            java.lang.String r0 = r0.user
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A02 = r0
            X.0t9 r0 = r3.A04
            r0.A06(r2)
            return
        L_0x246e:
            java.lang.Object r5 = r0.A00
            X.1cg r5 = (X.C30621cg) r5
            java.lang.Object r6 = r0.A01
            java.lang.Object r7 = r0.A02
            java.lang.Object r8 = r0.A03
            X.1ch r3 = r5.A04
            android.content.Context r2 = r5.A00
            r0 = 2131887542(0x7f1205b6, float:1.9409694E38)
            java.lang.String r1 = r2.getString(r0)
            r0 = 2131892358(0x7f121886, float:1.9419462E38)
            java.lang.String r0 = r2.getString(r0)
            r9 = 0
            com.facebook.redex.ViewOnClickCListenerShape2S0400000_I0 r4 = new com.facebook.redex.ViewOnClickCListenerShape2S0400000_I0
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A4N(r1, r0, r4)
            return
        L_0x2494:
            java.lang.Object r9 = r0.A00
            X.18P r9 = (X.AnonymousClass18P) r9
            java.lang.Object r8 = r0.A01
            java.util.Map r8 = (java.util.Map) r8
            java.lang.Object r7 = r0.A02
            X.0sL r7 = (X.C16050sL) r7
            java.lang.Object r6 = r0.A03
            X.1ci r6 = (X.C30641ci) r6
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r12 = r0.iterator()
        L_0x24ac:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x24ec
            java.lang.Object r1 = r12.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r0 = r8.get(r1)
            X.AnonymousClass00B.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            X.185 r0 = r9.A03
            long r1 = r0.A01(r7, r1)
            r10 = -1
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x24ac
            X.0th r0 = r9.A01
            X.0tZ r3 = r0.A00(r1)
            X.1bh r3 = (X.C30071bh) r3
            if (r3 == 0) goto L_0x24ac
            long r1 = r3.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x24ac
            r0 = 1
            r3.A07 = r0
            r3.A01 = r4
            X.0t6 r0 = r9.A02
            r0.A0a(r3)
            goto L_0x24ac
        L_0x24ec:
            X.124 r0 = r9.A04
            r0.A02(r6)
            return
        L_0x24f2:
            java.lang.Object r4 = r0.A00
            X.0us r4 = (X.C17310us) r4
            java.lang.Object r3 = r0.A01
            X.0sN r3 = (X.C16060sN) r3
            java.lang.Object r7 = r0.A02
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = r0.A03
            java.util.List r5 = (java.util.List) r5
            java.lang.String r0 = "participant-user-store/updateGroupParticipants/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " participants:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " removeParticipants:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0tq r0 = r4.A09
            X.0tf r6 = r0.A02()
            X.1cj r2 = r6.A00()     // Catch:{ all -> 0x2856 }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x255f }
        L_0x2531:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x255f }
            if (r0 == 0) goto L_0x2541
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x255f }
            X.1ZT r0 = (X.AnonymousClass1ZT) r0     // Catch:{ all -> 0x255f }
            r4.A0G(r3, r0)     // Catch:{ all -> 0x255f }
            goto L_0x2531
        L_0x2541:
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x255f }
        L_0x2545:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x255f }
            if (r0 == 0) goto L_0x2555
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x255f }
            X.1ck r0 = (X.C30661ck) r0     // Catch:{ all -> 0x255f }
            r4.A08(r0, r3)     // Catch:{ all -> 0x255f }
            goto L_0x2545
        L_0x2555:
            r2.A00()     // Catch:{ all -> 0x255f }
            r2.close()     // Catch:{ all -> 0x2856 }
            r6.close()
            return
        L_0x255f:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x27bb }
            goto L_0x27bb
        L_0x2565:
            java.lang.Object r1 = r0.A01
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r0.A02
            X.1cl r0 = (X.C30671cl) r0
            X.1cm r0 = r0.A07
            java.lang.String r0 = r0.A03
            r1.get(r0)
            return
        L_0x2575:
            java.lang.Object r7 = r0.A00
            X.0yO r7 = (X.C19410yO) r7
            java.lang.Object r1 = r0.A01
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            java.lang.Object r6 = r0.A02
            X.1WL r6 = (X.AnonymousClass1WL) r6
            java.lang.Object r5 = r0.A03
            X.1cn r5 = (X.C30691cn) r5
            X.1Yb r4 = X.C28851Ya.A02(r1)
            X.11s r3 = r7.A0F
            com.whatsapp.jid.DeviceJid r1 = X.C28851Ya.A03(r4)
            X.0sK r0 = r3.A03
            boolean r0 = r0.A0J(r1)
            X.AnonymousClass00B.A0F(r0)
            r3.A0S(r6, r4)
            r7.A03 = r2
            X.0yO r4 = r5.A01
            X.1WF r3 = r5.A00
            X.1WA r2 = r4.A0M
            r1 = 13
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r0.<init>(r4, r1, r3)
            r2.execute(r0)
            return
        L_0x25ae:
            java.lang.Object r4 = r0.A00
            X.0ul r4 = (X.C17240ul) r4
            java.lang.Object r3 = r0.A01
            X.0sN r3 = (X.C16060sN) r3
            java.lang.Object r2 = r0.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r0.A03
            java.lang.Long r1 = (java.lang.Long) r1
            X.0sO r0 = r4.A0a
            r0.A06(r3, r1, r2)
            return
        L_0x25c4:
            java.lang.Object r4 = r0.A00
            X.12c r4 = (X.C209212c) r4
            java.lang.Object r5 = r0.A01
            X.1co r5 = (X.C30701co) r5
            java.lang.Object r3 = r0.A02
            X.0tY r3 = (X.C16730tY) r3
            java.lang.Object r2 = r0.A03
            X.1co r2 = (X.C30701co) r2
            java.lang.String r6 = "mediadownloadmanager/queueDownload dependency express path download "
            boolean r0 = r5.A0t     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            if (r0 == 0) goto L_0x2632
            X.1cs r8 = r5.A0c     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            boolean r0 = r8 instanceof X.C30751ct     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            if (r0 == 0) goto L_0x2632
            X.1ct r8 = (X.C30751ct) r8     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            boolean r0 = r8.A02     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            if (r0 == 0) goto L_0x2622
            java.lang.String r0 = "ExpressPathMediaDownloadStat/onPairedDownloadSubscribe get called more than once"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
        L_0x25eb:
            java.lang.Long r0 = r8.A0H     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            if (r0 == 0) goto L_0x25fa
            long r0 = r8.A01     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            r9 = -1
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x25fa
            r8.A04()     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
        L_0x25fa:
            long r0 = r8.A00     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            r9 = -1
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x2604
            monitor-enter(r8)     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            monitor-exit(r8)     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
        L_0x2604:
            long r0 = r3.A01     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            X.14n r8 = r4.A0R     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            r7 = 1
            java.lang.Float r8 = r8.A01(r7)     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            if (r8 == 0) goto L_0x261e
            float r7 = (float) r0     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            float r0 = r8.floatValue()     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            float r7 = r7 / r0
            long r0 = (long) r7     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
        L_0x2616:
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            java.util.concurrent.FutureTask r7 = r5.A02     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            r7.get(r0, r8)     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            goto L_0x2683
        L_0x261e:
            r7 = 300(0x12c, double:1.48E-321)
            long r0 = r0 / r7
            goto L_0x2616
        L_0x2622:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            r8.A01 = r0     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            long r0 = r8.A03()     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            r8.A00 = r0     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            r0 = 1
            r8.A02 = r0     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            goto L_0x25eb
        L_0x2632:
            java.lang.String r0 = "MediaDownload/onPairedRegularMediaDownloadSubscribe This should only be called in express path download"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException | ExecutionException -> 0x266c, TimeoutException -> 0x2650, CancellationException -> 0x2638 }
            goto L_0x2604
        L_0x2638:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r5)
            java.lang.String r0 = " got cancellation exception, probably user manually cancel download"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x2650:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r5)
            java.lang.String r0 = " got timeout exception, skip it and start regular download"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 1
            r5.A64(r0)
            goto L_0x2683
        L_0x266c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r5)
            java.lang.String r0 = " got execution/interrupt exception, skip it and start regular download"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x2683:
            X.14k r0 = r4.A0Y
            r0.A01(r2, r3)
            return
        L_0x2689:
            java.lang.Object r5 = r0.A00
            X.1Ae r5 = (X.C23021Ae) r5
            java.lang.Object r4 = r0.A01
            X.0tZ r4 = (X.C16740tZ) r4
            java.lang.Object r3 = r0.A02
            X.1cu r3 = (X.C30761cu) r3
            java.lang.Object r2 = r0.A03
            X.1cv r2 = (X.C30771cv) r2
            X.0tm r1 = r4.A0F()
            byte[] r0 = r3.A0G()
            r1.A02(r0)
            r0 = 1
            r2.A08 = r0
            X.0t6 r1 = r5.A0B
            r0 = -1
            r1.A0e(r4, r0)
            X.0pt r2 = r5.A03
            r1 = 25
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r0.<init>(r5, r1, r4)
            r2.A0K(r0)
            return
        L_0x26ba:
            java.lang.Object r3 = r0.A00
            X.1Tv r3 = (X.C27971Tv) r3
            java.lang.Object r2 = r0.A01
            X.1ci r2 = (X.C30641ci) r2
            java.lang.Object r1 = r0.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            java.lang.Object r0 = r0.A03
            android.os.Bundle r0 = (android.os.Bundle) r0
            X.C27971Tv.A00(r0, r1, r3, r2)
            return
        L_0x26ce:
            java.lang.Object r3 = r0.A00
            X.1Cq r3 = (X.C23611Cq) r3
            java.lang.Object r2 = r0.A01
            X.1cw r2 = (X.C30781cw) r2
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.A03
            android.content.Context r0 = (android.content.Context) r0
            X.1cx r1 = r2.AG3(r0, r1)
            X.1cy r0 = r3.A04
            r0.A09(r1)
            return
        L_0x26e8:
            java.lang.Object r9 = r0.A00
            X.1ZK r9 = (X.AnonymousClass1ZK) r9
            java.lang.Object r8 = r0.A01
            java.io.File r8 = (java.io.File) r8
            java.lang.Object r7 = r0.A02
            java.io.File r7 = (java.io.File) r7
            java.lang.Object r10 = r0.A03
            X.1MV r5 = r9.A18
            com.obwhatsapp.audioRecording.AudioRecordFactory r15 = r9.A0s
            com.obwhatsapp.audioRecording.OpusRecorderFactory r12 = r9.A0t
            X.1ZL r11 = r9.A1G
            X.0sb r1 = r5.A00
            java.lang.String r0 = X.C17970vw.A0H()
            java.io.File r13 = r1.A0N(r0)
            long r0 = X.C17970vw.A04(r8)
            X.0t3 r6 = r5.A07
            X.0pd r4 = r5.A0A
            X.1Lu r3 = r5.A0D
            X.12W r5 = r5.A05
            java.lang.String r20 = r13.getAbsolutePath()
            X.1cz r14 = new X.1cz
            r16 = r12
            r17 = r6
            r18 = r4
            r19 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20)
            java.lang.String r6 = r8.getName()
            if (r6 != 0) goto L_0x274e
            r3 = 0
        L_0x272d:
            r11 = 0
            r12 = 2
            int r6 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x2793
            r14.A01 = r3
            com.whatsapp.util.OpusRecorder r6 = r14.A06
            r6.setInitialVariablesForResume(r3, r0)
            java.io.File r0 = r14.A08
            boolean r0 = X.AnonymousClass1XI.A0L(r5, r8, r0)
            if (r0 == 0) goto L_0x2793
            if (r7 == 0) goto L_0x2792
            java.io.File r3 = r14.A09
            boolean r0 = X.AnonymousClass1XI.A0L(r5, r7, r3)
            if (r0 == 0) goto L_0x2792
            goto L_0x2785
        L_0x274e:
            X.1Lx r4 = r3.A00
            java.lang.String r3 = "@"
            java.lang.String[] r3 = r6.split(r3)
            r12 = r3[r2]
            X.0tc r3 = r4.A00
            X.0tf r6 = r3.get()
            X.0tg r11 = r6.A02     // Catch:{ all -> 0x2856 }
            java.lang.String r4 = "SELECT chat_jid, page_number FROM draft_voice_note_metadata WHERE chat_jid=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x2856 }
            r3[r2] = r12     // Catch:{ all -> 0x2856 }
            android.database.Cursor r11 = r11.A08(r4, r3)     // Catch:{ all -> 0x2856 }
            boolean r3 = r11.moveToNext()     // Catch:{ all -> 0x27b5 }
            if (r3 == 0) goto L_0x277c
            java.lang.String r3 = "page_number"
            int r3 = r11.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x27b5 }
            long r3 = r11.getLong(r3)     // Catch:{ all -> 0x27b5 }
            goto L_0x277e
        L_0x277c:
            r3 = 0
        L_0x277e:
            r11.close()     // Catch:{ all -> 0x2856 }
            r6.close()
            goto L_0x272d
        L_0x2785:
            r1 = 1
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x278e }
            r0.<init>(r3, r1)     // Catch:{ FileNotFoundException -> 0x278e }
            r14.A02 = r0     // Catch:{ FileNotFoundException -> 0x278e }
            goto L_0x2792
        L_0x278e:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x2792:
            r11 = r14
        L_0x2793:
            r3 = 0
            if (r11 == 0) goto L_0x27a8
            com.whatsapp.util.OpusRecorder r0 = r11.A06     // Catch:{ Exception -> 0x279c }
            r0.prepare()     // Catch:{ Exception -> 0x279c }
            goto L_0x27a2
        L_0x279c:
            r0 = 0
            X.AnonymousClass1MV.A00(r11, r0, r2)
            goto L_0x27a8
        L_0x27a2:
            r3 = r11
            java.io.File r0 = r11.A08
            r9.A0J(r0)
        L_0x27a8:
            X.0pt r2 = r9.A0q
            r1 = 25
            com.facebook.redex.RunnableRunnableShape2S0300000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape2S0300000_I0_2
            r0.<init>(r9, r3, r10, r1)
            r2.A0K(r0)
            return
        L_0x27b5:
            r0 = move-exception
            if (r11 == 0) goto L_0x27bb
            r11.close()     // Catch:{ all -> 0x27bb }
        L_0x27bb:
            throw r0     // Catch:{ all -> 0x2856 }
        L_0x27bc:
            return
        L_0x27bd:
            return
        L_0x27be:
            com.whatsapp.wamsys.JniBridge.getInstance()
            r0 = 74
            long r0 = (long) r0
            java.lang.Object r0 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r2, r0, r8)
            byte[] r0 = (byte[]) r0
            byte[] r1 = java.util.Arrays.copyOfRange(r0, r2, r7)
            X.1Ww r0 = r3.A01     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            byte[] r4 = r0.A04()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            X.1Ww r0 = r3.A02     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            byte[] r0 = r0.A04()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r10)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            r2.<init>(r1, r6)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            r1.<init>(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            r0 = 2
            r3.init(r0, r2, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            byte[] r12 = r3.doFinal(r4)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            X.0sd r11 = r5.A09     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            java.lang.String r14 = r5.A0D     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            X.0sq r0 = r11.A07     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            com.facebook.redex.RunnableRunnableShape0S1310000_I0 r10 = new com.facebook.redex.RunnableRunnableShape0S1310000_I0     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            r15 = 0
            r16 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            r0.Acl(r10)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x2802 }
            return
        L_0x2802:
            r1 = move-exception
            java.lang.String r0 = "EncBackupManager/retrieveBackupKey/aesDecrypt/exception."
            com.whatsapp.util.Log.e(r0, r1)
            r15 = 5
            r16 = 4
            r17 = -1
            java.lang.String r14 = "Failed to decrypt backup key"
            r18 = -1
            r13.AQc(r14, r15, r16, r17, r18)
            return
        L_0x2815:
            r0 = move-exception
            com.whatsapp.util.Log.e(r9, r0)
            r15 = 7
            r16 = 4
            r17 = -1
            java.lang.String r14 = "Failed to parse aes_k_nonce_k"
            goto L_0x283a
        L_0x2821:
            r0 = move-exception
            com.whatsapp.util.Log.e(r9, r0)
            r15 = 7
            r16 = 4
            r17 = -1
            java.lang.String r14 = "Failed to parse login payload"
            goto L_0x283a
        L_0x282d:
            r1 = move-exception
            java.lang.String r0 = "EncBackupManager/retrieveBackupKey/aesDecrypt/exception."
            com.whatsapp.util.Log.e(r0, r1)
            r15 = 5
            r16 = 4
            r17 = -1
            java.lang.String r14 = "Failed to decrypt aes_k_nonce_k"
        L_0x283a:
            r18 = -1
            r13.AQc(r14, r15, r16, r17, r18)
            return
        L_0x2840:
            monitor-enter(r3)
            r6.A04 = r0     // Catch:{ all -> 0x284b }
            r0 = 2
            r6.A00 = r0     // Catch:{ all -> 0x284b }
            monitor-exit(r3)     // Catch:{ all -> 0x284b }
            r6.A01()
            return
        L_0x284b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x284b }
            throw r0
        L_0x284e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x284e }
            throw r0
        L_0x2851:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x285f }
            throw r0
        L_0x2856:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x285f }
            throw r0
        L_0x285b:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x285f }
        L_0x285f:
            throw r0
        L_0x2860:
            r1.A03 = r0     // Catch:{ all -> 0x2875 }
            monitor-exit(r1)     // Catch:{ all -> 0x2875 }
            X.1bV r1 = r1.A04
            if (r2 == 0) goto L_0x2870
            X.02P r0 = new X.02P
            r0.<init>()
        L_0x286c:
            r1.A04(r0)
            return
        L_0x2870:
            X.02Q r0 = X.AnonymousClass02Q.A00()
            goto L_0x286c
        L_0x2875:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x2875 }
            throw r0
        L_0x2878:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x287e }
            throw r1     // Catch:{ all -> 0x287e }
        L_0x287b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x287b }
            throw r0
        L_0x287e:
            r3 = move-exception
            r1 = r20
            java.util.Set r2 = r1.A1C
            monitor-enter(r2)
            r1 = r34
            r2.remove(r1)     // Catch:{ all -> 0x2894 }
            r1 = r20
            int r1 = r1.A00     // Catch:{ all -> 0x2894 }
            int r1 = r1 - r0
            r0 = r20
            r0.A00 = r1     // Catch:{ all -> 0x2894 }
            monitor-exit(r2)     // Catch:{ all -> 0x2894 }
            goto L_0x28ae
        L_0x2894:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x2894 }
            throw r3
        L_0x2897:
            r3 = move-exception
            int r2 = r4.A01
            java.lang.Object r1 = r0.A01
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            if (r0 == 0) goto L_0x28b3
            r0.decrementAndGet()
            throw r3
        L_0x28ae:
            if (r19 == 0) goto L_0x28b3
            r19.unlock()
        L_0x28b3:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0400000_I0.run():void");
    }
}
