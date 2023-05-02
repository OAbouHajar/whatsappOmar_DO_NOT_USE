package X;

/* renamed from: X.2zR  reason: invalid class name and case insensitive filesystem */
public class C59932zR extends C52242dN {
    public final /* synthetic */ C447225g A00;

    public C59932zR(C447225g r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (r11.equals(r3.callWaitingInfo.A04) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(java.lang.String r16) {
        /*
            r15 = this;
            X.AnonymousClass00B.A01()
            X.25g r8 = r15.A00
            android.os.Handler r0 = r8.A0L
            r4 = 28
            r0.removeMessages(r4)
            java.lang.String r0 = "voip/service/selfManagedConnectionListener/onShowIncomingCallUi "
            r11 = r16
            java.lang.String r0 = X.C13680ns.A0h(r0, r11)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r3 == 0) goto L_0x0029
            X.1fV r0 = r3.callWaitingInfo
            java.lang.String r0 = r0.A04
            boolean r0 = r11.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            boolean r0 = com.whatsapp.voipcalling.Voip.A08(r3)
            if (r0 == 0) goto L_0x006f
            boolean r0 = r3.callEnding
            if (r0 != 0) goto L_0x006f
            java.lang.String r0 = r3.callId
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x003e
            if (r2 == 0) goto L_0x006f
        L_0x003e:
            long r0 = r8.A0D
            r6 = 0
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0070
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r8.A0u = r0
        L_0x0051:
            if (r2 != 0) goto L_0x0064
            com.whatsapp.jid.UserJid r10 = r3.getPeerJid()
            X.AnonymousClass00B.A06(r10)
            boolean r13 = r3.videoEnabled
            boolean r14 = r3.isGroupCall
            com.whatsapp.jid.GroupJid r9 = r3.groupJid
            r12 = 0
            r8.A0e(r9, r10, r11, r12, r13, r14)
        L_0x0064:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x006c
            r0 = 1
            r8.A0m(r3, r0, r2)
        L_0x006c:
            r0 = 1
            r8.A1E = r0
        L_0x006f:
            return
        L_0x0070:
            java.lang.String r0 = "selfManagedConnectionNewCallTs is not set"
            X.AnonymousClass00B.A08(r0)
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59932zR.A01(java.lang.String):void");
    }
}
