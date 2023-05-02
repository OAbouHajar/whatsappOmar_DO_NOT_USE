package com.facebook.redex;

public class RunnableRunnableShape0S1301000_I0 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    public RunnableRunnableShape0S1301000_I0(Object obj, Object obj2, Object obj3, String str, int i2, int i3) {
        this.A05 = i3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = str;
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0133, code lost:
        if (r9.size() != 0) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01bf, code lost:
        if (android.text.TextUtils.isEmpty(r0.A01) != false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ed, code lost:
        if (r0 != null) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f4, code lost:
        if (r0.intValue() == 0) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01f6, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f7, code lost:
        X.AnonymousClass00B.A0B("Bug in loading call lobby entry point", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01fc, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r5 = r23
            int r0 = r5.A05
            switch(r0) {
                case 0: goto L_0x00d8;
                case 1: goto L_0x001b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r5.A01
            X.1Me r4 = (X.C26061Me) r4
            java.lang.Object r3 = r5.A02
            X.20T r3 = (X.AnonymousClass20T) r3
            int r2 = r5.A00
            java.lang.String r1 = r5.A04
            java.lang.Object r0 = r5.A03
            X.1kQ r0 = (X.C34531kQ) r0
            r4.A0A(r3, r0, r1, r2)
            return
        L_0x001b:
            java.lang.Object r6 = r5.A01
            X.0zS r6 = (X.C20070zS) r6
            java.lang.Object r2 = r5.A02
            X.0rv r2 = (X.C15830rv) r2
            java.lang.Object r4 = r5.A03
            X.4bp r4 = (X.C89244bp) r4
            int r3 = r5.A00
            java.lang.String r1 = r5.A04
            X.0sG r0 = r6.A00
            X.0sH r2 = r0.A0A(r2)
            X.3s4 r5 = new X.3s4
            r5.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r5.A01 = r0
            r5.A05 = r1
            java.lang.String r1 = r2.A0P
            if (r1 == 0) goto L_0x00d0
            java.lang.String r0 = "smb:"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00d0
        L_0x004b:
            java.lang.String r0 = r4.A00
            r5.A03 = r0
            X.0zR r1 = r6.A05
            X.0rv r0 = r2.A0E
            java.lang.String r0 = r1.A00(r0)
            r5.A04 = r0
            boolean r0 = r4.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A00 = r0
        L_0x0061:
            X.0zQ r0 = r6.A02
            X.0rz r7 = r0.A01
            java.lang.String r8 = "pref_ctwa_customer_logging_counter_timestamp"
            long r2 = r7.A0J(r8)
            X.0t3 r9 = r0.A00
            long r0 = r9.A00()
            long r0 = r0 - r2
            float r2 = (float) r0
            r0 = 1285868416(0x4ca4cb80, float:8.64E7)
            float r2 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0093
            long r0 = r9.A00()
            r7.A14(r8, r0)
            r0 = 0
            android.content.SharedPreferences$Editor r3 = r7.A0K()
            java.lang.String r2 = "pref_ctwa_customer_logging_counter"
            android.content.SharedPreferences$Editor r0 = r3.putLong(r2, r0)
            r0.apply()
        L_0x0093:
            X.01D r3 = r7.A01
            java.lang.Object r2 = r3.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r4 = "pref_ctwa_customer_logging_counter"
            r0 = 0
            long r0 = r2.getLong(r4, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A02 = r0
            java.lang.Object r2 = r3.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            r0 = 0
            long r2 = r2.getLong(r4, r0)
            long r0 = r9.A00()
            r7.A14(r8, r0)
            r0 = 1
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r0 = r7.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r4, r2)
            r0.apply()
            X.0t9 r0 = r6.A04
            r0.A06(r5)
            return
        L_0x00d0:
            boolean r0 = r2.A0I()
            if (r0 == 0) goto L_0x0061
            goto L_0x004b
        L_0x00d8:
            java.lang.Object r7 = r5.A01
            X.25g r7 = (X.C447225g) r7
            java.lang.Object r9 = r5.A02
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r6 = r5.A03
            X.1po r6 = (X.C37831po) r6
            java.lang.String r14 = r5.A04
            int r8 = r5.A00
            int r0 = r9.size()
            r2 = 64
            r5 = 0
            r4 = 1
            r1 = 0
            if (r0 >= r2) goto L_0x00f4
            r1 = 1
        L_0x00f4:
            java.lang.String r0 = "voip/actionStartFromCallLog call log should not exceed max call size"
            X.AnonymousClass00B.A0B(r0, r1)
            int r0 = r9.size()
            int r0 = r0 + 1
            int r3 = java.lang.Math.min(r0, r2)
            com.whatsapp.voipcalling.CallParticipantJid[] r10 = new com.whatsapp.voipcalling.CallParticipantJid[r3]
            X.0sK r0 = r7.A1d
            r0.A0B()
            X.1ZT r2 = r0.A05
            if (r2 != 0) goto L_0x0116
            java.lang.String r0 = "voip/actionStartFromCallLog meJid is not set"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0116:
            com.whatsapp.jid.DeviceJid[] r1 = new com.whatsapp.jid.DeviceJid[r4]
            r0.A0B()
            X.1Za r0 = r0.A04
            r1[r5] = r0
            r11 = 0
            com.whatsapp.voipcalling.CallParticipantJid r0 = new com.whatsapp.voipcalling.CallParticipantJid
            r0.<init>(r2, r1, r11)
            r10[r5] = r0
            X.1r2 r0 = r6.A0G
            java.lang.String r2 = "voip/actionStartFromCallLog"
            if (r0 == 0) goto L_0x0135
            int r0 = r9.size()
            r13 = 1
            if (r0 == 0) goto L_0x0142
        L_0x0135:
            r13 = 2
            X.1Ao r1 = r7.A22
            X.1lE r0 = r6.A0C
            com.whatsapp.jid.UserJid r0 = r0.A01
            com.whatsapp.voipcalling.CallParticipantJid r0 = r1.A00(r0, r2)
            r10[r4] = r0
        L_0x0142:
            java.util.Iterator r12 = r9.iterator()
        L_0x0146:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x016c
            java.lang.Object r0 = r12.next()
            X.1r1 r0 = (X.C38581r1) r0
            com.whatsapp.jid.UserJid r9 = r0.A02
            X.1lE r0 = r6.A0C
            com.whatsapp.jid.UserJid r0 = r0.A01
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0146
            int r1 = r13 + 1
            X.1Ao r0 = r7.A22
            com.whatsapp.voipcalling.CallParticipantJid r0 = r0.A00(r9, r2)
            r10[r13] = r0
            if (r1 == r3) goto L_0x016c
            r13 = r1
            goto L_0x0146
        L_0x016c:
            X.0ua r2 = r7.A1e
            X.1lE r1 = r6.A0C
            boolean r0 = r1.A03
            r2.A06(r0)
            boolean r0 = r6.A0I
            if (r0 == 0) goto L_0x0189
            r7.A0V()
            com.whatsapp.voipcalling.camera.VoipCameraManager r3 = r7.A2f
            X.1OL r0 = r7.A1j
            java.lang.String r2 = r0.A02()
            X.1Bz r0 = r7.A1i
            r3.setRequestedCamera2SupportLevel(r2, r0)
        L_0x0189:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r7.A0n = r0
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r7.A0t = r0
            r7.A18 = r5
            com.whatsapp.jid.DeviceJid r9 = r6.A0B
            if (r9 != 0) goto L_0x019e
            r4 = 0
        L_0x019e:
            java.lang.String r0 = "voip/actionStartFromCallLog call log call creator is null"
            X.AnonymousClass00B.A0B(r0, r4)
            r4 = 70004(0x11174, float:9.8096E-41)
            if (r9 == 0) goto L_0x01fd
            com.whatsapp.jid.UserJid r15 = r1.A01
            X.0sG r0 = r7.A27
            X.0sH r0 = r0.A08(r15)
            if (r0 == 0) goto L_0x01c1
            X.1ko r0 = r0.A0D
            if (r0 == 0) goto L_0x01c1
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r17 = 0
            if (r0 == 0) goto L_0x01c3
        L_0x01c1:
            r17 = 1
        L_0x01c3:
            boolean r3 = r6.A0I
            com.whatsapp.jid.GroupJid r2 = r6.A04
            int r1 = r1.A00
            X.1r2 r0 = r6.A0G
            if (r0 == 0) goto L_0x01d1
            X.1r2 r0 = r6.A0G
            java.lang.String r11 = r0.A02
        L_0x01d1:
            r18 = r10
            r19 = r3
            r20 = r2
            r21 = r1
            r22 = r11
            r16 = r9
            int r0 = com.whatsapp.voipcalling.Voip.joinOngoingCall(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            if (r0 == r4) goto L_0x01fd
            java.lang.Integer r0 = r7.A0q
            if (r0 != 0) goto L_0x01ef
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r7.A0q = r0
            if (r0 == 0) goto L_0x01f6
        L_0x01ef:
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != 0) goto L_0x01f7
        L_0x01f6:
            r1 = 0
        L_0x01f7:
            java.lang.String r0 = "Bug in loading call lobby entry point"
            X.AnonymousClass00B.A0B(r0, r1)
            return
        L_0x01fd:
            java.lang.String r0 = "voip/actionStartFromCallLog join ongoing call failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r7.A0q(r6, r5)
            X.1D0 r0 = r7.A2L
            r0.A08(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S1301000_I0.run():void");
    }
}
