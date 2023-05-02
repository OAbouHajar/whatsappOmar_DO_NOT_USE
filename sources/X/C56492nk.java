package X;

import android.telephony.PhoneStateListener;

/* renamed from: X.2nk  reason: invalid class name and case insensitive filesystem */
public class C56492nk extends PhoneStateListener {
    public boolean A00 = false;
    public final /* synthetic */ C447225g A01;

    public C56492nk(C447225g r2) {
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r1.isSpeakerphoneOn() == false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCallStateChanged(int r7, java.lang.String r8) {
        /*
            r6 = this;
            X.25g r4 = r6.A01
            X.01V r0 = r4.A2C
            android.media.AudioManager r1 = r0.A0G()
            java.lang.String r0 = "voip/phoneStateListener/onCallStateChanged state: "
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r0)
            if (r7 == 0) goto L_0x00a8
            r0 = 1
            if (r7 == r0) goto L_0x00a4
            r0 = 2
            if (r7 == r0) goto L_0x00a0
            java.lang.String r0 = "UNKNOWN_TELEPHONY_CALL_STATE"
        L_0x0019:
            r3.append(r0)
            java.lang.String r0 = " using speaker: "
            r3.append(r0)
            r5 = 1
            r2 = 0
            if (r1 == 0) goto L_0x002c
            boolean r1 = r1.isSpeakerphoneOn()
            r0 = 1
            if (r1 != 0) goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r3.append(r0)
            X.C13680ns.A1V(r3)
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            boolean r0 = r4.A12(r0)
            if (r0 == 0) goto L_0x004c
            android.telephony.TelephonyManager r1 = r4.A1Y
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = "PhoneStateListener is only used when Telecom Framework is not enabled"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            android.telephony.PhoneStateListener r0 = r4.A0Q
            r1.listen(r0, r2)
        L_0x004b:
            return
        L_0x004c:
            int r2 = r4.A04
            r4.A04 = r7
            r0 = 2
            if (r7 == r0) goto L_0x0059
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x006e
            if (r7 != r5) goto L_0x006e
        L_0x0059:
            boolean r0 = r6.A00
            if (r5 != r0) goto L_0x0070
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            if (r1 == 0) goto L_0x004b
            if (r7 == 0) goto L_0x0089
            X.26Z r0 = r4.A1k
            r0.A05(r1)
            r0.A01()
            return
        L_0x006e:
            r5 = 0
            goto L_0x0059
        L_0x0070:
            r6.A00 = r5
            android.os.Handler r0 = r4.A0L
            r1 = 6
            android.os.Message r3 = r0.obtainMessage(r1, r7, r5)
            android.os.Handler r0 = r4.A0L
            r0.removeMessages(r1)
            android.os.Handler r2 = r4.A0L
            if (r5 == 0) goto L_0x0086
            r2.sendMessage(r3)
            return
        L_0x0086:
            r0 = 1000(0x3e8, double:4.94E-321)
            goto L_0x009c
        L_0x0089:
            if (r2 == 0) goto L_0x004b
            android.os.Handler r0 = r4.A0L
            r1 = 38
            android.os.Message r3 = r0.obtainMessage(r1)
            android.os.Handler r0 = r4.A0L
            r0.removeMessages(r1)
            android.os.Handler r2 = r4.A0L
            r0 = 2000(0x7d0, double:9.88E-321)
        L_0x009c:
            r2.sendMessageDelayed(r3, r0)
            return
        L_0x00a0:
            java.lang.String r0 = "CALL_STATE_OFFHOOK"
            goto L_0x0019
        L_0x00a4:
            java.lang.String r0 = "CALL_STATE_RINGING"
            goto L_0x0019
        L_0x00a8:
            java.lang.String r0 = "CALL_STATE_IDLE"
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56492nk.onCallStateChanged(int, java.lang.String):void");
    }
}
