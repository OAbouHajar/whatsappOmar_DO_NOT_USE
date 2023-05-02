package com.facebook.redex;

import android.os.Handler;

public class IDxCallbackShape186S0100000_1_I0 implements Handler.Callback {
    public Object A00;
    public final int A01;

    public IDxCallbackShape186S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0197, code lost:
        if (r2 == com.whatsapp.voipcalling.CallState.CONNECTED_LONELY) goto L_0x0199;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r18) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A01
            r5 = r18
            switch(r0) {
                case 0: goto L_0x00e7;
                case 1: goto L_0x0180;
                case 2: goto L_0x02c1;
                case 3: goto L_0x033b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r3 = r1.A00
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            int r1 = r5.what
            r2 = 1
            r0 = 9
            if (r1 != r0) goto L_0x0019
            r3.finish()
        L_0x0017:
            r0 = 1
            return r0
        L_0x0019:
            com.whatsapp.voipcalling.CallInfo r4 = r3.A3B()
            if (r4 == 0) goto L_0x0017
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0017
            int r0 = r5.what
            switch(r0) {
                case 1: goto L_0x002b;
                case 2: goto L_0x002f;
                case 3: goto L_0x003a;
                case 4: goto L_0x002a;
                case 5: goto L_0x002a;
                case 6: goto L_0x006c;
                case 7: goto L_0x0088;
                case 8: goto L_0x009a;
                case 9: goto L_0x002a;
                case 10: goto L_0x00a3;
                case 11: goto L_0x00a8;
                case 12: goto L_0x00e0;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0017
        L_0x002b:
            r3.A3P()
            goto L_0x0017
        L_0x002f:
            androidx.fragment.app.DialogFragment r0 = r3.A0f
            if (r0 == 0) goto L_0x0017
            r0.A1D()
            r0 = 0
            r3.A0f = r0
            goto L_0x0017
        L_0x003a:
            boolean r0 = r3.A22
            r1 = 5000(0x1388, double:2.4703E-320)
            r5 = 3
            if (r0 != 0) goto L_0x005d
            boolean r0 = r3.A23
            if (r0 == 0) goto L_0x0017
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r4 = r3.A1d
            if (r4 == 0) goto L_0x0068
            boolean r0 = r4.A1S()
            if (r0 != 0) goto L_0x005d
            boolean r0 = r4.A1T()
            if (r0 != 0) goto L_0x005d
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r3.A1d
            boolean r0 = r0.A1U()
            if (r0 == 0) goto L_0x0068
        L_0x005d:
            android.os.Handler r0 = r3.A0F
            r0.removeMessages(r5)
            android.os.Handler r0 = r3.A0F
            r0.sendEmptyMessageDelayed(r5, r1)
            goto L_0x0017
        L_0x0068:
            r3.A3N()
            goto L_0x0017
        L_0x006c:
            boolean r0 = r4.videoEnabled
            if (r0 == 0) goto L_0x0017
            X.0pd r2 = r3.A0C
            r1 = 2222(0x8ae, float:3.114E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0080
            boolean r0 = r3.A20
            if (r0 != 0) goto L_0x0017
        L_0x0080:
            X.1fU r1 = r4.self
            X.39w r0 = r3.A18
            r3.A3k(r1, r0)
            goto L_0x0017
        L_0x0088:
            androidx.fragment.app.DialogFragment r1 = r3.A0e
            if (r1 == 0) goto L_0x0017
            boolean r0 = r1.A0c()
            if (r0 == 0) goto L_0x0017
            r1.A1D()
            r0 = 0
            r3.A0e = r0
            goto L_0x0017
        L_0x009a:
            androidx.fragment.app.DialogFragment r0 = r3.A0e
            if (r0 == 0) goto L_0x0017
            X.C13680ns.A1J(r0, r3)
            goto L_0x0017
        L_0x00a3:
            r3.Ahj(r4)
            goto L_0x0017
        L_0x00a8:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0017
            boolean r0 = r4.callEnding
            if (r0 != 0) goto L_0x0017
            X.25g r0 = r3.A12
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "voip/VoipActivityV2/commonHandler STOP_CAMERA"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1fU r1 = r4.self
            X.1fU r0 = r4.getDefaultPeerInfo()
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x00c8
            goto L_0x0017
        L_0x00c8:
            int r0 = r1.A05
            if (r0 != r2) goto L_0x0017
            r3.A25 = r2
            X.25g r0 = r3.A12
            r0.A0L()
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r3.A1d
            if (r0 == 0) goto L_0x0017
            com.obwhatsapp.calling.views.VoipCallFooter r0 = r0.A0P
            if (r0 == 0) goto L_0x0017
            r0.setToggleVideoButtonSelected(r2)
            goto L_0x0017
        L_0x00e0:
            X.1fU r0 = r4.self
            r3.AcY(r0)
            goto L_0x0017
        L_0x00e7:
            java.lang.Object r3 = r1.A00
            X.26b r3 = (X.C448926b) r3
            int r0 = r5.what
            r4 = 1
            if (r0 == r4) goto L_0x0132
            r1 = 2
            if (r0 == r1) goto L_0x0110
            r2 = 4
            r1 = 3
            if (r0 == r1) goto L_0x00fb
            if (r0 == r2) goto L_0x00fb
            goto L_0x0017
        L_0x00fb:
            android.os.Handler r0 = r3.A02
            r0.removeMessages(r1)
            r0.removeMessages(r2)
            r0 = 0
            com.whatsapp.voipcalling.CallInfo r1 = r3.A05(r0)
            if (r1 == 0) goto L_0x0017
            r0 = 0
            r3.A08(r1, r0)
            goto L_0x0017
        L_0x0110:
            android.os.Handler r0 = r3.A02
            r0.removeMessages(r1)
            r0 = 0
            com.whatsapp.voipcalling.CallInfo r0 = r3.A05(r0)
            if (r0 == 0) goto L_0x0017
            com.whatsapp.voipcalling.VideoPort r4 = r3.A05
            if (r4 == 0) goto L_0x0017
            r2 = 0
            com.whatsapp.voipcalling.camera.VoipCameraManager r1 = r3.A0D
            X.2cX r0 = r3.A09
            r1.removeCameraErrorListener(r0)
            r3.A09(r2)
            r3.A05 = r2
            r3.A09(r4)
            goto L_0x0017
        L_0x0132:
            r0 = 0
            com.whatsapp.voipcalling.CallInfo r2 = r3.A05(r0)
            if (r2 == 0) goto L_0x0017
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0147
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x0147
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0017
        L_0x0147:
            boolean r0 = r2.callEnding
            if (r0 != 0) goto L_0x0017
            X.1fU r1 = r2.self
            X.1fU r0 = r2.getDefaultPeerInfo()
            if (r0 == 0) goto L_0x0159
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x0159
            goto L_0x0017
        L_0x0159:
            int r0 = r1.A05
            if (r0 != r4) goto L_0x0017
            X.25g r0 = r3.A03
            if (r0 == 0) goto L_0x0164
            r0.A0L()
        L_0x0164:
            java.util.List r0 = r3.A0E
            java.util.Iterator r2 = r0.iterator()
        L_0x016a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r2.next()
            X.4DY r0 = (X.AnonymousClass4DY) r0
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r0.A00
            X.1cy r1 = r0.A0X
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0B(r0)
            goto L_0x016a
        L_0x0180:
            java.lang.Object r9 = r1.A00
            X.25g r9 = (X.C447225g) r9
            X.AnonymousClass00B.A01()
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r6 = 0
            if (r3 == 0) goto L_0x02b2
            com.whatsapp.voipcalling.CallState r2 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 == r0) goto L_0x0199
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            r0 = 0
            if (r2 != r1) goto L_0x019a
        L_0x0199:
            r0 = 1
        L_0x019a:
            long r4 = r3.callDuration
            if (r0 == 0) goto L_0x01bc
            X.15A r1 = r9.A2d
            boolean r7 = r3.videoEnabled
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            boolean r2 = X.AnonymousClass000.A1Y(r2, r0)
            java.util.Iterator r1 = X.C16590tJ.A00(r1)
        L_0x01ac:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r0 = r1.next()
            X.0y9 r0 = (X.C19270y9) r0
            r0.A01(r4, r7, r2)
            goto L_0x01ac
        L_0x01bc:
            boolean r0 = r9.A11(r3)
            if (r0 == 0) goto L_0x01c8
            int r1 = r9.A05
            int r0 = r9.A1W
            if (r1 >= r0) goto L_0x01d1
        L_0x01c8:
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x01d1
            r9.A0O()
        L_0x01d1:
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 == r0) goto L_0x01e0
            boolean r0 = r3.isPeerRequestingUpgrade()
            if (r0 != 0) goto L_0x01e0
            r9.A0K()
        L_0x01e0:
            X.1ZF r2 = r9.A0a
            if (r2 == 0) goto L_0x01fe
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            X.AnonymousClass00B.A01()
            java.lang.String r1 = r2.A1g
            if (r1 == 0) goto L_0x01fb
            X.1fV r0 = r3.callWaitingInfo
            java.lang.String r0 = r0.A04
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01fb
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.CallInfo.convertCallWaitingInfoToCallInfo(r3)
        L_0x01fb:
            r2.A3o(r3)
        L_0x01fe:
            X.26b r0 = r9.A0T
            if (r0 == 0) goto L_0x0222
            java.util.Iterator r2 = X.C16590tJ.A00(r0)
        L_0x0206:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0222
            java.lang.Object r1 = r2.next()
            X.2Tu r1 = (X.C49562Tu) r1
            boolean r0 = r1 instanceof com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel
            if (r0 == 0) goto L_0x0206
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = (com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel) r1
            X.027 r1 = r1.A05
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r1.A0B(r0)
            goto L_0x0206
        L_0x0222:
            X.4RX r10 = r9.A1w
            long r7 = java.lang.System.currentTimeMillis()
            long r0 = r10.A02
            long r2 = r7 - r0
            r15 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            boolean r14 = X.AnonymousClass000.A1Q(r0)
            r12 = 0
            if (r14 == 0) goto L_0x0251
            double r2 = r10.A00()
            r10.A00 = r2
            long r0 = r10.A02
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 == 0) goto L_0x024d
            double r0 = r10.A01
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 == 0) goto L_0x024f
        L_0x024d:
            r10.A01 = r2
        L_0x024f:
            r10.A02 = r7
        L_0x0251:
            double r0 = r10.A01
            boolean r2 = java.lang.Double.isNaN(r0)
            if (r2 != 0) goto L_0x02b8
            double r2 = r10.A00
            boolean r7 = java.lang.Double.isNaN(r2)
            if (r7 != 0) goto L_0x02b8
            long r4 = r4 / r15
            double r0 = r0 - r2
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x0269
            r4 = 1
        L_0x0269:
            double r2 = (double) r4
            double r0 = r0 / r2
            if (r14 == 0) goto L_0x02b8
            X.12s r2 = r10.A03
            X.2Cv r2 = r2.A00
            boolean r5 = r2.A01()
            java.lang.String r2 = "voipcalling/BatteryStateDelegate/isDeviceCharging is device charging returned: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r2)
            r2.append(r5)
            X.C13680ns.A1V(r2)
            int r2 = (int) r0
            float r7 = (float) r2
            double r3 = r10.A00
            int r2 = (int) r3
            float r2 = (float) r2
            int r4 = com.whatsapp.voipcalling.Voip.setBatteryState(r7, r2, r5)
            java.lang.String r2 = "voipcalling/BatteryStateDelegate/updateBattery setting battery state for vid_rc_battery: "
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0r(r2)
            r3.append(r0)
            java.lang.String r2 = " "
            r3.append(r2)
            double r0 = r10.A00
            r3.append(r0)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r0 = " got result: "
            r3.append(r0)
            r3.append(r4)
            X.C13680ns.A1V(r3)
            goto L_0x02b8
        L_0x02b2:
            java.lang.String r0 = "voip/periodicalUpdateHandler we are not in an active call"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x02b8:
            android.os.Handler r2 = r9.A0M
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.sendEmptyMessageDelayed(r6, r0)
            goto L_0x0017
        L_0x02c1:
            java.lang.Object r4 = r1.A00
            X.1Ph r4 = (X.C26811Ph) r4
            int r1 = r5.what
            r5 = 1
            if (r1 == r5) goto L_0x02ef
            r0 = 2
            if (r1 != r0) goto L_0x0017
            X.0sK r3 = r4.A03
            r3.A0B()
            X.1ZT r2 = r3.A05
            java.util.Map r1 = r4.A08
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0017
            r3.A0B()
            X.1ZT r0 = r3.A05
            r4.A03(r0)
            java.lang.Object r0 = r1.get(r2)
            X.2Qx r0 = (X.AnonymousClass2Qx) r0
            r4.A01(r0)
            goto L_0x0017
        L_0x02ef:
            java.lang.String r0 = "voip/VideoPortManager/Camera evicted"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r4 = r4.A02
            if (r4 == 0) goto L_0x0017
            X.26b r3 = r4.A0D
            X.3AY r2 = r3.A04()
            com.whatsapp.voipcalling.CallState r1 = r2.A06
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x030d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x030d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x0017
        L_0x030d:
            boolean r0 = r2.A09
            if (r0 != 0) goto L_0x0017
            X.0vs r1 = r2.A01
            com.whatsapp.jid.UserJid r0 = r2.A05
            java.lang.Object r0 = r1.get(r0)
            X.1fU r0 = (X.C32001fU) r0
            if (r0 == 0) goto L_0x0323
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x0323
            goto L_0x0017
        L_0x0323:
            X.1fU r0 = r2.A02
            if (r0 == 0) goto L_0x0017
            int r0 = r0.A05
            if (r0 != r5) goto L_0x0017
            X.25g r0 = r3.A03
            if (r0 == 0) goto L_0x0332
            r0.A0L()
        L_0x0332:
            X.1cy r1 = r4.A0X
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0B(r0)
            goto L_0x0017
        L_0x033b:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.mediaview.MediaViewFragment r4 = (com.obwhatsapp.mediaview.MediaViewFragment) r4
            X.1bx r0 = r4.A1W
            r5 = 1
            if (r0 == 0) goto L_0x0017
            int r0 = r4.A01
            if (r0 != r5) goto L_0x037b
            com.obwhatsapp.voicerecorder.VoiceNoteSeekBar r0 = r4.A1d
            int r0 = r0.getMax()
            if (r0 <= 0) goto L_0x039b
            X.1bx r0 = r4.A1W
            int r1 = r0.A02()
            com.obwhatsapp.voicerecorder.VoiceNoteSeekBar r0 = r4.A1d
            int r0 = r0.getMax()
            int r6 = java.lang.Math.min(r1, r0)
            int r0 = r4.A00
            int r1 = r0 / 1000
            int r0 = r6 / 1000
            if (r1 == r0) goto L_0x0376
            android.widget.TextView r3 = r4.A09
            X.013 r2 = r4.A0l
            long r0 = (long) r0
            java.lang.String r0 = X.C28961Zl.A04(r2, r0)
            r3.setText(r0)
            r4.A00 = r6
        L_0x0376:
            com.obwhatsapp.voicerecorder.VoiceNoteSeekBar r0 = r4.A1d
            r0.setProgress(r6)
        L_0x037b:
            X.00l r0 = r4.A0D()
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x03a8
            int r0 = r4.A01
            if (r0 != r5) goto L_0x03a8
            X.1bx r0 = r4.A1W
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x03a8
            android.os.Handler r3 = r4.A06
            r2 = 0
            r0 = 50
            r3.sendEmptyMessageDelayed(r2, r0)
            goto L_0x0017
        L_0x039b:
            X.00l r1 = r4.A0D()
            X.0pN r1 = (X.C14550pN) r1
            r0 = 2131888237(0x7f12086d, float:1.9411104E38)
            r1.Afg(r0)
            goto L_0x037b
        L_0x03a8:
            int r1 = r4.A01
            r0 = 2
            if (r1 == r0) goto L_0x0017
            java.lang.String r0 = "mediaview/audio/set to stop status"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.obwhatsapp.voicerecorder.VoiceNoteSeekBar r1 = r4.A1d
            int r0 = r1.getMax()
            r1.setProgress(r0)
            android.widget.TextView r3 = r4.A09
            X.013 r2 = r4.A0l
            X.1bx r0 = r4.A1W
            int r0 = r0.A03()
            int r0 = r0 / 1000
            long r0 = (long) r0
            java.lang.String r0 = X.C28961Zl.A04(r2, r0)
            r3.setText(r0)
            r4.A1V()
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCallbackShape186S0100000_1_I0.handleMessage(android.os.Message):boolean");
    }
}
