package X;

import com.facebook.redex.IDxHCallbackShape412S0100000_2_I0;
import com.facebook.redex.IDxRCallbackShape48S0200000_1_I0;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.whatsapp.util.Log;

/* renamed from: X.1b6  reason: invalid class name and case insensitive filesystem */
public abstract class C29731b6 implements C29741b7 {
    public final C40761ue A00;
    public final C16320sq A01;

    public C29731b6(C40761ue r1, C16320sq r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static void A00(IDxRCallbackShape48S0200000_1_I0 iDxRCallbackShape48S0200000_1_I0, String str) {
        Log.e(str);
        ((C29731b6) iDxRCallbackShape48S0200000_1_I0.A01).AQf(3, "delivery failure", -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01a7, code lost:
        if (r6 == null) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a9, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01aa, code lost:
        X.AnonymousClass00B.A0G(r1);
        r4 = r13.A0A;
        r9 = r4.A00;
        r12 = r9.A02();
        r0 = new java.lang.StringBuilder("EncryptedBackupProtocolHelper/finishLoginOnSuccess id=");
        r0.append(r12);
        com.whatsapp.util.Log.i(r0.toString());
        r9.A0A(new com.facebook.redex.IDxRCallbackShape48S0200000_1_I0(r13, 7, r4), new X.C28371Vv("iq", new X.C35081lL[]{new X.C35081lL("id", r12), new X.C35081lL("xmlns", "vesta"), new X.C35081lL("type", "get"), new X.C35081lL("to", "s.whatsapp.net")}, new X.C28371Vv[]{new X.C28371Vv("l3", r6, (X.C35081lL[]) null), X.C16940tv.A01()}), r12, android.support.v4.view.MotionEventCompat.ACTION_MASK, 32000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0221, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x022a, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x022b, code lost:
        if (r9 == null) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x022d, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x022e, code lost:
        X.AnonymousClass00B.A0G(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0231, code lost:
        if (r6 == null) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0233, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0234, code lost:
        X.AnonymousClass00B.A0G(r1);
        r5 = r13.A0A;
        r11 = r5.A00;
        r4 = r11.A02();
        r0 = new java.lang.StringBuilder("EncryptedBackupProtocolHelper/sendBeginLoginIq id=");
        r0.append(r4);
        com.whatsapp.util.Log.i(r0.toString());
        r11.A0A(new com.facebook.redex.IDxRCallbackShape11S0300000_1_I0(r13, r5, r6, 2), new X.C28371Vv("iq", new X.C35081lL[]{new X.C35081lL("id", r4), new X.C35081lL("xmlns", "vesta"), new X.C35081lL("type", "get"), new X.C35081lL("to", "s.whatsapp.net")}, new X.C28371Vv[]{new X.C28371Vv("l1", r9, (X.C35081lL[]) null), X.C16940tv.A01()}), r4, android.support.v4.view.MotionEventCompat.ACTION_MASK, 32000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02ad, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r18 = this;
            r13 = r18
            boolean r0 = r13 instanceof X.C29801bE
            if (r0 == 0) goto L_0x0191
            X.1bE r13 = (X.C29801bE) r13
            java.lang.Object r2 = r13.A0C
            monitor-enter(r2)
            int r0 = r13.A00     // Catch:{ all -> 0x018e }
            monitor-exit(r2)     // Catch:{ all -> 0x018e }
            if (r0 == 0) goto L_0x0092
            r1 = 0
            r8 = 1
            if (r0 == r8) goto L_0x00fc
            byte[] r6 = r13.A04
            if (r6 == 0) goto L_0x0019
            r1 = 1
        L_0x0019:
            X.AnonymousClass00B.A0G(r1)
            X.18X r4 = r13.A0A
            X.0ug r9 = r4.A00
            java.lang.String r12 = r9.A02()
            java.lang.String r1 = "EncryptedBackupProtocolHelper/sendFinishRegIq id="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 4
            X.1lL[] r5 = new X.C35081lL[r0]
            java.lang.String r1 = "id"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r12)
            r7 = 0
            r5[r7] = r0
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "vesta"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r5[r8] = r0
            java.lang.String r2 = "type"
            java.lang.String r1 = "set"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r3 = 2
            r5[r3] = r0
            java.lang.String r2 = "to"
            java.lang.String r0 = "s.whatsapp.net"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 3
            r5[r0] = r1
            X.1Vv[] r3 = new X.C28371Vv[r3]
            java.lang.String r2 = "reg_payload"
            r1 = 0
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r2, (byte[]) r6, (X.C35081lL[]) r1)
            r3[r7] = r0
            X.1Vv r0 = X.C16940tv.A01()
            r3[r8] = r0
            java.lang.String r0 = "iq"
            X.1Vv r11 = new X.1Vv
            r11.<init>((java.lang.String) r0, (X.C35081lL[]) r5, (X.C28371Vv[]) r3)
            r0 = 5
        L_0x0085:
            com.facebook.redex.IDxRCallbackShape48S0200000_1_I0 r10 = new com.facebook.redex.IDxRCallbackShape48S0200000_1_I0
            r10.<init>(r13, r0, r4)
            r13 = 255(0xff, float:3.57E-43)
            r14 = 32000(0x7d00, double:1.581E-319)
            r9.A0A(r10, r11, r12, r13, r14)
            return
        L_0x0092:
            X.18X r4 = r13.A0A
            X.0ug r9 = r4.A00
            java.lang.String r12 = r9.A02()
            java.lang.String r1 = "EncryptedBackupProtocolHelper/sendInitRegIq id="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 4
            X.1lL[] r5 = new X.C35081lL[r0]
            java.lang.String r1 = "id"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r12)
            r7 = 0
            r5[r7] = r0
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "vesta"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r6 = 1
            r5[r6] = r0
            java.lang.String r2 = "type"
            java.lang.String r1 = "get"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r3 = 2
            r5[r3] = r0
            java.lang.String r2 = "to"
            java.lang.String r0 = "s.whatsapp.net"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 3
            r5[r0] = r1
            X.1Vv[] r3 = new X.C28371Vv[r3]
            java.lang.String r2 = "init_reg"
            r1 = 0
            X.1Vv r0 = new X.1Vv
            r0.<init>(r2, r1)
            r3[r7] = r0
            X.1Vv r0 = X.C16940tv.A01()
            r3[r6] = r0
            java.lang.String r0 = "iq"
            X.1Vv r11 = new X.1Vv
            r11.<init>((java.lang.String) r0, (X.C35081lL[]) r5, (X.C28371Vv[]) r3)
            r0 = 4
            goto L_0x0085
        L_0x00fc:
            monitor-enter(r2)
            byte[] r15 = r13.A06     // Catch:{ all -> 0x018b }
            byte[] r6 = r13.A03     // Catch:{ all -> 0x018b }
            monitor-exit(r2)     // Catch:{ all -> 0x018b }
            r0 = 0
            if (r15 == 0) goto L_0x0106
            r0 = 1
        L_0x0106:
            X.AnonymousClass00B.A0G(r0)
            if (r6 == 0) goto L_0x010c
            r1 = 1
        L_0x010c:
            X.AnonymousClass00B.A0G(r1)
            X.18X r14 = r13.A0A
            X.0ug r4 = r14.A00
            java.lang.String r3 = r4.A02()
            java.lang.String r1 = "EncryptedBackupProtocolHelper/sendBeginRegIq id="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 4
            X.1lL[] r7 = new X.C35081lL[r0]
            java.lang.String r1 = "id"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r3)
            r9 = 0
            r7[r9] = r0
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "vesta"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r7[r8] = r0
            java.lang.String r2 = "type"
            java.lang.String r1 = "set"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r5 = 2
            r7[r5] = r0
            java.lang.String r2 = "to"
            java.lang.String r0 = "s.whatsapp.net"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 3
            r7[r0] = r1
            X.1Vv[] r5 = new X.C28371Vv[r5]
            java.lang.String r2 = "r1"
            r1 = 0
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r2, (byte[]) r15, (X.C35081lL[]) r1)
            r5[r9] = r0
            X.1Vv r0 = X.C16940tv.A01()
            r5[r8] = r0
            java.lang.String r1 = "iq"
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r1, (X.C35081lL[]) r7, (X.C28371Vv[]) r5)
            r17 = 2
            com.facebook.redex.IDxRCallbackShape5S0400000_1_I0 r12 = new com.facebook.redex.IDxRCallbackShape5S0400000_1_I0
            r16 = r6
            r12.<init>(r13, r14, r15, r16, r17)
            r8 = 255(0xff, float:3.57E-43)
            r9 = 32000(0x7d00, double:1.581E-319)
            r5 = r12
            r6 = r0
            r7 = r3
            r4.A0A(r5, r6, r7, r8, r9)
            return
        L_0x018b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x018b }
            throw r0
        L_0x018e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x018e }
            throw r0
        L_0x0191:
            boolean r0 = r13 instanceof X.C29721b5
            if (r0 == 0) goto L_0x032a
            X.1b5 r13 = (X.C29721b5) r13
            java.lang.Object r2 = r13.A0C
            monitor-enter(r2)
            int r0 = r13.A00     // Catch:{ all -> 0x0327 }
            monitor-exit(r2)     // Catch:{ all -> 0x0327 }
            if (r0 == 0) goto L_0x02b1
            r1 = 0
            r8 = 1
            monitor-enter(r2)
            if (r0 == r8) goto L_0x0225
            byte[] r6 = r13.A07     // Catch:{ all -> 0x0222 }
            monitor-exit(r2)     // Catch:{ all -> 0x0222 }
            if (r6 == 0) goto L_0x01aa
            r1 = 1
        L_0x01aa:
            X.AnonymousClass00B.A0G(r1)
            X.18X r4 = r13.A0A
            X.0ug r9 = r4.A00
            java.lang.String r12 = r9.A02()
            java.lang.String r1 = "EncryptedBackupProtocolHelper/finishLoginOnSuccess id="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 4
            X.1lL[] r5 = new X.C35081lL[r0]
            java.lang.String r1 = "id"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r12)
            r7 = 0
            r5[r7] = r0
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "vesta"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r5[r8] = r0
            java.lang.String r2 = "type"
            java.lang.String r1 = "get"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r3 = 2
            r5[r3] = r0
            java.lang.String r2 = "to"
            java.lang.String r0 = "s.whatsapp.net"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 3
            r5[r0] = r1
            X.1Vv[] r3 = new X.C28371Vv[r3]
            java.lang.String r2 = "l3"
            r1 = 0
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r2, (byte[]) r6, (X.C35081lL[]) r1)
            r3[r7] = r0
            X.1Vv r0 = X.C16940tv.A01()
            r3[r8] = r0
            java.lang.String r0 = "iq"
            X.1Vv r11 = new X.1Vv
            r11.<init>((java.lang.String) r0, (X.C35081lL[]) r5, (X.C28371Vv[]) r3)
            r0 = 7
            com.facebook.redex.IDxRCallbackShape48S0200000_1_I0 r10 = new com.facebook.redex.IDxRCallbackShape48S0200000_1_I0
            r10.<init>(r13, r0, r4)
            r13 = 255(0xff, float:3.57E-43)
            r14 = 32000(0x7d00, double:1.581E-319)
            r9.A0A(r10, r11, r12, r13, r14)
            return
        L_0x0222:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0222 }
            throw r0
        L_0x0225:
            byte[] r9 = r13.A06     // Catch:{ all -> 0x02ae }
            byte[] r6 = r13.A05     // Catch:{ all -> 0x02ae }
            monitor-exit(r2)     // Catch:{ all -> 0x02ae }
            r0 = 0
            if (r9 == 0) goto L_0x022e
            r0 = 1
        L_0x022e:
            X.AnonymousClass00B.A0G(r0)
            if (r6 == 0) goto L_0x0234
            r1 = 1
        L_0x0234:
            X.AnonymousClass00B.A0G(r1)
            X.18X r5 = r13.A0A
            X.0ug r11 = r5.A00
            java.lang.String r4 = r11.A02()
            java.lang.String r1 = "EncryptedBackupProtocolHelper/sendBeginLoginIq id="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 4
            X.1lL[] r7 = new X.C35081lL[r0]
            java.lang.String r1 = "id"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r4)
            r10 = 0
            r7[r10] = r0
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "vesta"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r7[r8] = r0
            java.lang.String r2 = "type"
            java.lang.String r1 = "get"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r3 = 2
            r7[r3] = r0
            java.lang.String r2 = "to"
            java.lang.String r0 = "s.whatsapp.net"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 3
            r7[r0] = r1
            X.1Vv[] r3 = new X.C28371Vv[r3]
            java.lang.String r2 = "l1"
            r1 = 0
            X.1Vv r0 = new X.1Vv
            r0.<init>((java.lang.String) r2, (byte[]) r9, (X.C35081lL[]) r1)
            r3[r10] = r0
            X.1Vv r0 = X.C16940tv.A01()
            r3[r8] = r0
            java.lang.String r0 = "iq"
            X.1Vv r1 = new X.1Vv
            r1.<init>((java.lang.String) r0, (X.C35081lL[]) r7, (X.C28371Vv[]) r3)
            r0 = 2
            com.facebook.redex.IDxRCallbackShape11S0300000_1_I0 r12 = new com.facebook.redex.IDxRCallbackShape11S0300000_1_I0
            r12.<init>(r13, r5, r6, r0)
            r15 = 255(0xff, float:3.57E-43)
            r16 = 32000(0x7d00, double:1.581E-319)
            r13 = r1
            r14 = r4
            r11.A0A(r12, r13, r14, r15, r16)
            return
        L_0x02ae:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02ae }
            throw r0
        L_0x02b1:
            X.18X r4 = r13.A0A
            X.0ug r8 = r4.A00
            java.lang.String r11 = r8.A02()
            java.lang.String r1 = "EncryptedBackupProtocolHelper/sendInitLoginIq id="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 4
            X.1lL[] r5 = new X.C35081lL[r0]
            java.lang.String r1 = "id"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r11)
            r7 = 0
            r5[r7] = r0
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "vesta"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r6 = 1
            r5[r6] = r0
            java.lang.String r2 = "type"
            java.lang.String r1 = "get"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r3 = 2
            r5[r3] = r0
            java.lang.String r2 = "to"
            java.lang.String r0 = "s.whatsapp.net"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 3
            r5[r0] = r1
            X.1Vv[] r3 = new X.C28371Vv[r3]
            java.lang.String r2 = "init_login"
            r1 = 0
            X.1Vv r0 = new X.1Vv
            r0.<init>(r2, r1)
            r3[r7] = r0
            X.1Vv r0 = X.C16940tv.A01()
            r3[r6] = r0
            java.lang.String r0 = "iq"
            X.1Vv r10 = new X.1Vv
            r10.<init>((java.lang.String) r0, (X.C35081lL[]) r5, (X.C28371Vv[]) r3)
            r0 = 6
            com.facebook.redex.IDxRCallbackShape48S0200000_1_I0 r9 = new com.facebook.redex.IDxRCallbackShape48S0200000_1_I0
            r9.<init>(r13, r0, r4)
            r12 = 255(0xff, float:3.57E-43)
            r13 = 32000(0x7d00, double:1.581E-319)
            r8.A0A(r9, r10, r11, r12, r13)
            return
        L_0x0327:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0327 }
            throw r0
        L_0x032a:
            X.2Qy r13 = (X.AnonymousClass2Qy) r13
            X.18X r4 = r13.A01
            X.0ug r8 = r4.A00
            java.lang.String r11 = r8.A02()
            java.lang.String r1 = "EncryptedBackupProtocolHelper/sendDeleteAccountIq id="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 4
            X.1lL[] r5 = new X.C35081lL[r0]
            java.lang.String r1 = "id"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r11)
            r7 = 0
            r5[r7] = r0
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "vesta"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r6 = 1
            r5[r6] = r0
            java.lang.String r2 = "type"
            java.lang.String r1 = "set"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r3 = 2
            r5[r3] = r0
            java.lang.String r2 = "to"
            java.lang.String r0 = "s.whatsapp.net"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 3
            r5[r0] = r1
            X.1Vv[] r3 = new X.C28371Vv[r3]
            java.lang.String r2 = "delete"
            r1 = 0
            X.1Vv r0 = new X.1Vv
            r0.<init>(r2, r1)
            r3[r7] = r0
            X.1Vv r0 = X.C16940tv.A01()
            r3[r6] = r0
            java.lang.String r0 = "iq"
            X.1Vv r10 = new X.1Vv
            r10.<init>((java.lang.String) r0, (X.C35081lL[]) r5, (X.C28371Vv[]) r3)
            r0 = 6
            com.facebook.redex.IDxRCallbackShape49S0200000_2_I0 r9 = new com.facebook.redex.IDxRCallbackShape49S0200000_2_I0
            r9.<init>(r13, r0, r4)
            r12 = 255(0xff, float:3.57E-43)
            r13 = 32000(0x7d00, double:1.581E-319)
            r8.A0A(r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29731b6.A01():void");
    }

    public void AQf(int i2, String str, int i3) {
        C29741b7 r2;
        if (this instanceof AnonymousClass2Qy) {
            AnonymousClass2Qy r22 = (AnonymousClass2Qy) this;
            Long A002 = r22.A00.A00();
            if ((i2 == 500 || i2 == 3) && A002 != null) {
                r22.A01.Ad4(new RunnableRunnableShape2S0100000_I0_1(r22, 49), "DeleteAccountHandler/onError", A002.longValue());
            } else {
                r22.A00.AQf(i2, str, i3);
            }
        } else {
            Long A003 = this.A00.A00();
            if ((i2 == 500 || i2 == 3) && A003 != null) {
                this.A01.Ad4(new RunnableRunnableShape3S0100000_I0_2(this, 0), "HsmCommandHandler/onError", A003.longValue());
                return;
            }
            if (this instanceof C29801bE) {
                C29801bE r3 = (C29801bE) this;
                synchronized (r3.A0C) {
                    r2 = r3.A02;
                    if (r2 == null) {
                        r2 = new IDxHCallbackShape412S0100000_2_I0(r3, 1);
                        r3.A02 = r2;
                    }
                }
            } else if (this instanceof C29721b5) {
                C29721b5 r32 = (C29721b5) this;
                synchronized (r32.A0C) {
                    C29741b7 r23 = r32.A04;
                    if (r23 == null) {
                        r23 = new IDxHCallbackShape412S0100000_2_I0(r32, 0);
                        r32.A04 = r23;
                    }
                }
            } else {
                r2 = ((AnonymousClass2Qy) this).A00;
            }
            r2.AQf(i2, str, i3);
        }
    }
}
