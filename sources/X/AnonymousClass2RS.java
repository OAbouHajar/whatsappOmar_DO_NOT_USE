package X;

import android.os.Bundle;
import com.whatsapp.jid.Jid;

/* renamed from: X.2RS  reason: invalid class name */
public final class AnonymousClass2RS {
    public static Jid A00(Bundle bundle, String str) {
        return Jid.getNullable(bundle.getString(str));
    }

    public static void A01(Bundle bundle, Jid jid, String str) {
        if (!bundle.containsKey(str)) {
            bundle.putString(str, C16030sJ.A03(jid));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" already used");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00de, code lost:
        r1 = com.whatsapp.voipcalling.Voip.nativeHandleIncomingSignalingXmppAck(r4.A01, r3, r4.A00, r4.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0133, code lost:
        switch(r0) {
            case 0: goto L_0x016c;
            case 1: goto L_0x0157;
            case 2: goto L_0x0154;
            case 3: goto L_0x0151;
            default: goto L_0x0136;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0136, code lost:
        r5 = r10.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0138, code lost:
        if (r5 == null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013e, code lost:
        if (r5.A00 != 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0148, code lost:
        if (r4.A02.equals(r5.A02) == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014a, code lost:
        r5.A00 = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0151, code lost:
        r5 = r10.A0Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0154, code lost:
        r5 = r10.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0157, code lost:
        r5 = r10.A0V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0159, code lost:
        if (r5 == null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0163, code lost:
        if (r4.A02.equals(r5.A02) == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0169, code lost:
        if (r5.A00 != 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016c, code lost:
        r5 = r10.A0W;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.os.Message r9, X.C447225g r10) {
        /*
            int r5 = r9.arg1
            r4 = 197(0xc5, float:2.76E-43)
            r3 = 193(0xc1, float:2.7E-43)
            r1 = 192(0xc0, float:2.69E-43)
            if (r5 == r1) goto L_0x01e2
            if (r5 == r3) goto L_0x00d1
            if (r5 == r4) goto L_0x016f
            java.lang.Object r2 = r9.obj
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.Class<X.1ci> r0 = X.C30641ci.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r2.setClassLoader(r0)
            r0 = 15
            if (r5 == r0) goto L_0x01c2
            r0 = 150(0x96, float:2.1E-43)
            if (r5 == r0) goto L_0x002f
            if (r5 == r4) goto L_0x016f
            if (r5 == r1) goto L_0x01e2
            if (r5 == r3) goto L_0x00d1
            java.lang.String r0 = "decodeCallMessage/unknown_message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x002e:
            return
        L_0x002f:
            java.lang.String r0 = "stanzaKey"
            android.os.Parcelable r1 = r2.getParcelable(r0)
            X.1ci r1 = (X.C30641ci) r1
            java.lang.String r0 = "callId"
            java.lang.String r7 = r2.getString(r0)
            java.lang.String r0 = "registrationId"
            byte[] r5 = r2.getByteArray(r0)
            java.lang.String r0 = "retry"
            byte r4 = r2.getByte(r0)
            com.whatsapp.jid.Jid r0 = r1.A01
            com.whatsapp.jid.DeviceJid r3 = com.whatsapp.jid.DeviceJid.of(r0)
            X.AnonymousClass00B.A06(r3)
            java.lang.String r6 = r1.A08
            java.lang.String r0 = "voip/receive_message/call-rekey-receipt from "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = ", call id "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", type "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", retry "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.jid.UserJid r9 = r3.getUserJid()
            com.whatsapp.voipcalling.CallInfo r8 = com.whatsapp.voipcalling.Voip.getCallInfo()
            boolean r0 = com.whatsapp.voipcalling.Voip.A08(r8)
            if (r0 == 0) goto L_0x01ca
            java.lang.String r0 = r8.callId
            boolean r0 = android.text.TextUtils.equals(r7, r0)
            r2 = 1
            if (r0 == 0) goto L_0x01ca
            r1 = 1
            java.util.Map r0 = r8.participants
            java.lang.Object r0 = r0.get(r9)
            X.1fU r0 = (X.C32001fU) r0
            if (r0 == 0) goto L_0x01ca
            int r0 = r0.A01
            if (r0 != r2) goto L_0x01ca
            java.lang.String r0 = "enc_rekey_retry"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x01af
            if (r4 > 0) goto L_0x00b1
            r1 = 0
        L_0x00b1:
            java.lang.String r0 = "retryCount should always be greater than 0 in enc rekey response"
            X.AnonymousClass00B.A0B(r0, r1)
            java.util.Map r1 = r10.A2l
            java.lang.Byte r0 = java.lang.Byte.valueOf(r4)
            r1.put(r3, r0)
            X.39S r1 = r10.A1y
            java.lang.String r0 = "call_rekey"
            boolean r0 = r1.A01(r3, r0, r5, r4)
            if (r0 != 0) goto L_0x002e
            r1 = 30
            r0 = 0
            r10.A0W(r1, r0)
            return
        L_0x00d1:
            java.lang.Object r4 = r9.obj
            X.4NT r4 = (X.AnonymousClass4NT) r4
            java.lang.String r3 = r4.A03
            int r0 = r3.hashCode()
            switch(r0) {
                case -1624583601: goto L_0x0128;
                case -1423461112: goto L_0x011e;
                case 103144406: goto L_0x0114;
                case 105650780: goto L_0x010a;
                case 1184155715: goto L_0x0100;
                case 1945493729: goto L_0x00ea;
                default: goto L_0x00de;
            }
        L_0x00de:
            com.whatsapp.jid.Jid r2 = r4.A01
            int r1 = r4.A00
            com.whatsapp.protocol.VoipStanzaChildNode[] r0 = r4.A04
            int r1 = com.whatsapp.voipcalling.Voip.nativeHandleIncomingSignalingXmppAck(r2, r3, r1, r0)
            goto L_0x01a5
        L_0x00ea:
            java.lang.String r0 = "link_create"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00de
            java.lang.String r1 = r4.A02
            java.lang.String r0 = X.C447225g.A2v
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00de
            java.lang.String r0 = "onCallIncomingAck: no matched request found, link_create_ack dropped"
            goto L_0x01de
        L_0x0100:
            java.lang.String r0 = "link_query"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00de
            r0 = 4
            goto L_0x0131
        L_0x010a:
            java.lang.String r0 = "offer"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00de
            r0 = 3
            goto L_0x0131
        L_0x0114:
            java.lang.String r0 = "lobby"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00de
            r0 = 2
            goto L_0x0131
        L_0x011e:
            java.lang.String r0 = "accept"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00de
            r0 = 1
            goto L_0x0131
        L_0x0128:
            java.lang.String r0 = "link_join"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00de
            r0 = 0
        L_0x0131:
            r6 = 0
            switch(r0) {
                case 0: goto L_0x016c;
                case 1: goto L_0x0157;
                case 2: goto L_0x0154;
                case 3: goto L_0x0151;
                default: goto L_0x0136;
            }
        L_0x0136:
            X.4KJ r5 = r10.A0X
        L_0x0138:
            if (r5 == 0) goto L_0x00de
            long r1 = r5.A00
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00de
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00de
        L_0x014a:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.A00 = r0
            goto L_0x00de
        L_0x0151:
            X.4KJ r5 = r10.A0Z
            goto L_0x0159
        L_0x0154:
            X.4KJ r5 = r10.A0Y
            goto L_0x0159
        L_0x0157:
            X.4KJ r5 = r10.A0V
        L_0x0159:
            if (r5 == 0) goto L_0x00de
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00de
            long r1 = r5.A00
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00de
            goto L_0x014a
        L_0x016c:
            X.4KJ r5 = r10.A0W
            goto L_0x0138
        L_0x016f:
            java.lang.Object r6 = r9.obj
            X.4Ic r6 = (X.C83804Ic) r6
            com.whatsapp.protocol.VoipStanzaChildNode r5 = r6.A01
            java.lang.String r1 = r5.tag
            java.lang.String r0 = "enc_rekey"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x019f
            com.whatsapp.jid.DeviceJid r3 = r6.A00
            com.whatsapp.jid.UserJid r2 = r3.getUserJid()
            r1 = 1
            java.lang.String r0 = "call_rekey"
            X.1Vw r4 = new X.1Vw
            r4.<init>(r2, r0, r1)
            X.1Yb r3 = X.C28851Ya.A02(r3)
            X.16P r2 = r10.A2J
            r0 = 23
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0
            r1.<init>(r10, r3, r4, r0)
            java.util.concurrent.ThreadPoolExecutor r0 = r2.A00
            r0.execute(r1)
        L_0x019f:
            com.whatsapp.jid.DeviceJid r0 = r6.A00
            int r1 = com.whatsapp.voipcalling.Voip.nativeHandleIncomingSignalingXmppReceipt(r0, r5)
        L_0x01a5:
            r0 = 70004(0x11174, float:9.8096E-41)
            if (r1 != r0) goto L_0x002e
            r0 = 0
            r10.A0v(r0)
            return
        L_0x01af:
            java.lang.String r1 = "unknown rekey receipt type "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A08(r0)
            return
        L_0x01c2:
            android.os.Handler r1 = r10.A0L
            r0 = 29
            r1.sendEmptyMessage(r0)
            return
        L_0x01ca:
            java.lang.String r0 = "voip/receive_message/call-rekey-receipt call "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = " ended, ignoring"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x01de:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x01e2:
            java.lang.Object r0 = r9.obj
            X.3x7 r0 = (X.C78093x7) r0
            r10.A0i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2RS.A02(android.os.Message, X.25g):void");
    }
}
