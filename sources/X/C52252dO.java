package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2dO  reason: invalid class name and case insensitive filesystem */
public class C52252dO extends Handler {
    public C447225g A00;
    public AnonymousClass1ZG A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ C18380wb A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52252dO(Looper looper, C18380wb r2) {
        super(looper);
        this.A04 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x029d, code lost:
        if (r0 != null) goto L_0x029f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02a4, code lost:
        if (r0.intValue() == 0) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02a6, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02a7, code lost:
        X.AnonymousClass00B.A0B("Bug in loading call lobby entry point", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02ac, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r97) {
        /*
            r96 = this;
            r4 = r97
            int r7 = r4.what
            r3 = 1
            r2 = r96
            if (r7 == r3) goto L_0x02e1
            r0 = 2
            r6 = 0
            r1 = 3
            if (r7 == r0) goto L_0x02c4
            r5 = 0
            if (r7 == r1) goto L_0x02b4
            r0 = 4
            if (r7 == r0) goto L_0x0042
            r0 = 5
            if (r7 != r0) goto L_0x0021
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "voice-service-wrapper/handler WHAT_SERVICE_ON_UNBIND is called while isBound is false"
        L_0x001e:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0021:
            return
        L_0x0022:
            java.lang.Object r0 = r4.obj
            X.1ZG r3 = r2.A01
            if (r0 == r3) goto L_0x02cf
            java.lang.String r0 = "voice-service-wrapper/handler WHAT_SERVICE_ON_UNBIND is called with mismatch voiceServiceBinderComponent, actual "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = ", given "
            r1.append(r0)
            java.lang.Object r0 = r4.obj
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x001e
        L_0x0042:
            java.lang.String r0 = "voice-service-wrapper/handler WHAT_SERVICE_ON_BIND"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.25g r0 = r2.A00
            if (r0 != 0) goto L_0x01ad
            X.0wb r1 = r2.A04
            X.0tz r0 = r1.A0e
            android.content.Context r0 = r0.A00
            r95 = r0
            X.0t3 r0 = r1.A0d
            r47 = r0
            X.0pd r0 = r1.A0u
            r63 = r0
            X.0pt r0 = r1.A04
            r94 = r0
            com.whatsapp.voipcalling.JNIUtils r0 = r1.A1E
            r82 = r0
            X.0so r0 = r1.A02
            r93 = r0
            X.0sK r0 = r1.A06
            r92 = r0
            X.0sq r0 = r1.A1C
            r80 = r0
            X.0sb r0 = r1.A03
            r91 = r0
            X.0ua r0 = r1.A09
            r90 = r0
            X.1Bz r0 = r1.A0E
            r21 = r0
            X.0t9 r0 = r1.A0v
            r64 = r0
            X.124 r0 = r1.A10
            r69 = r0
            X.0xT r0 = r1.A0l
            r54 = r0
            X.14s r0 = r1.A1A
            r78 = r0
            X.0xa r0 = r1.A16
            r75 = r0
            X.198 r0 = r1.A0G
            r23 = r0
            X.15A r0 = r1.A1D
            r81 = r0
            X.0xc r0 = r1.A0B
            r89 = r0
            X.0vQ r0 = r1.A0T
            r37 = r0
            X.1An r0 = r1.A0K
            r27 = r0
            X.0xj r0 = r1.A0C
            r19 = r0
            X.0sG r0 = r1.A0W
            r40 = r0
            X.16P r0 = r1.A0k
            r53 = r0
            X.01V r0 = r1.A0c
            r46 = r0
            X.0sP r0 = r1.A0X
            r41 = r0
            X.013 r0 = r1.A0i
            r51 = r0
            X.1SI r0 = r1.A0L
            r28 = r0
            X.19v r0 = r1.A15
            r74 = r0
            X.125 r0 = r1.A13
            r72 = r0
            X.0ul r0 = r1.A0w
            r65 = r0
            X.12z r0 = r1.A07
            r88 = r0
            X.0tK r0 = r1.A0A
            r87 = r0
            X.1SJ r0 = r1.A0H
            r24 = r0
            X.1D0 r0 = r1.A0p
            r58 = r0
            X.15I r0 = r1.A0Z
            r43 = r0
            X.0sf r0 = r1.A19
            r77 = r0
            X.16U r0 = r1.A0Y
            r42 = r0
            X.19T r0 = r1.A05
            r86 = r0
            X.15q r0 = r1.A12
            r71 = r0
            X.11s r0 = r1.A0j
            r52 = r0
            X.0z2 r0 = r1.A0t
            r62 = r0
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r1.A1F
            r83 = r0
            X.0y8 r0 = r1.A0m
            r55 = r0
            X.11o r0 = r1.A11
            r70 = r0
            X.0sj r0 = r1.A0g
            r49 = r0
            X.0rz r0 = r1.A0h
            r50 = r0
            X.12s r0 = r1.A0D
            r20 = r0
            X.137 r0 = r1.A0s
            r61 = r0
            X.195 r0 = r1.A0q
            r59 = r0
            X.1OK r0 = r1.A0Q
            r34 = r0
            X.0w0 r0 = r1.A0N
            r31 = r0
            X.1HD r0 = r1.A08
            r85 = r0
            X.1OL r0 = r1.A0F
            r22 = r0
            X.0yL r0 = r1.A0f
            r48 = r0
            X.1Hn r0 = r1.A0z
            r68 = r0
            X.0vU r0 = r1.A0x
            r66 = r0
            X.1B1 r0 = r1.A1B
            r79 = r0
            X.1SK r0 = r1.A0J
            r26 = r0
            X.1GG r0 = r1.A0o
            r57 = r0
            X.0yU r0 = r1.A0y
            r67 = r0
            X.0yW r0 = r1.A17
            r76 = r0
            X.1SL r0 = r1.A0a
            r44 = r0
            X.1Ao r0 = r1.A0R
            r35 = r0
            X.0ry r0 = r1.A0P
            r18 = r0
            X.0tH r0 = r1.A01
            r17 = r0
            X.0wP r0 = r1.A0V
            r16 = r0
            X.19B r15 = r1.A0r
            X.0yg r14 = r1.A0U
            X.1SM r13 = r1.A0I
            X.1SN r12 = r1.A0S
            X.1SO r11 = r1.A0O
            X.14x r10 = r1.A0M
            X.11R r9 = r1.A0b
            X.1HG r8 = r1.A14
            X.1HU r7 = r1.A0n
            X.01D r6 = r1.A1G
            X.25g r0 = new X.25g
            r25 = r13
            r29 = r1
            r30 = r10
            r32 = r11
            r33 = r18
            r36 = r12
            r38 = r14
            r39 = r16
            r45 = r9
            r56 = r7
            r60 = r15
            r73 = r8
            r84 = r6
            r6 = r0
            r7 = r95
            r8 = r17
            r9 = r93
            r10 = r91
            r11 = r94
            r12 = r86
            r13 = r92
            r14 = r88
            r15 = r85
            r16 = r90
            r17 = r87
            r18 = r89
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84)
            r2.A00 = r0
            r0.A0G()
        L_0x01ad:
            r2.A02 = r3
            java.lang.Object r6 = r4.obj
            X.1ZG r6 = (X.AnonymousClass1ZG) r6
            r2.A01 = r6
            X.25g r1 = r2.A00
            com.whatsapp.voipcalling.VoipActivityV2 r6 = (com.whatsapp.voipcalling.VoipActivityV2) r6
            java.lang.String r0 = "voip/VoipActivityV2/onServiceConnected"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6.A12 = r1
            r1.A0c(r6)
            X.25g r0 = r6.A12
            r3 = 0
            r0.A1P = r3
            com.whatsapp.voipcalling.CallInfo r2 = r6.A3B()
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r6.A0t
            if (r0 == 0) goto L_0x01de
            X.25g r1 = r6.A12
            X.26b r0 = r0.A0D
            r1.A0T = r0
            if (r0 == 0) goto L_0x01de
            r0.A07(r5)
            r0.A03 = r1
        L_0x01de:
            if (r2 == 0) goto L_0x020f
            X.1An r4 = r6.A10
            java.lang.String r1 = r2.callId
            java.lang.String r0 = "voice_service_connected"
            r4.A02(r1, r0)
            X.1An r4 = r6.A10
            java.lang.String r0 = r2.callId
            r1 = 2
            r4.A03(r0, r1)
            boolean r0 = r6.A3z()
            if (r0 != 0) goto L_0x020f
            boolean r0 = r6.A20
            if (r0 == 0) goto L_0x020f
            X.1fU r0 = r2.self
            int r0 = r0.A05
            if (r0 != r1) goto L_0x020f
            X.25g r0 = r6.A12
            java.util.concurrent.ScheduledExecutorService r4 = r0.A14
            r1 = 7
            com.facebook.redex.RunnableRunnableShape0S0000000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0000000_I0
            r0.<init>(r1)
            r4.execute(r0)
        L_0x020f:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            r6.callStateChanged(r0, r2)
            X.25g r4 = r6.A12
            java.lang.String r0 = "voip/restoreProximitySensor"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r4.A19
            if (r0 == 0) goto L_0x022e
            r4.A19 = r3
            android.os.Handler r0 = r4.A0L
            r1 = 14
            r0.removeMessages(r1)
            android.os.Handler r0 = r4.A0L
            r0.sendEmptyMessage(r1)
        L_0x022e:
            X.25g r1 = r6.A12
            boolean r0 = r1.A1A
            if (r0 == 0) goto L_0x02b0
            r1.A0Q()
        L_0x0237:
            boolean r0 = r6.A1j
            if (r0 == 0) goto L_0x02ad
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x02ad
            if (r2 == 0) goto L_0x0021
            com.whatsapp.voipcalling.CallState r0 = r2.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r0)
            if (r0 == 0) goto L_0x025a
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "call_ui_action"
            int r0 = r1.getIntExtra(r0, r3)
            r6.A3e(r0)
            r6.A1j = r3
        L_0x025a:
            com.whatsapp.voipcalling.CallState r7 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r7 == r0) goto L_0x0268
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r7 == r0) goto L_0x0268
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r7 != r0) goto L_0x0021
        L_0x0268:
            boolean r0 = r2.isCaller
            if (r0 != 0) goto L_0x0021
            boolean r0 = r2.isGroupCall
            if (r0 == 0) goto L_0x0021
            X.25g r5 = r6.A12
            long r3 = r5.A0B
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0280
            long r0 = java.lang.System.currentTimeMillis()
            r5.A0B = r0
        L_0x0280:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r7 == r0) goto L_0x0021
            android.content.Intent r2 = r6.getIntent()
            java.lang.String r1 = "lobbyEntryPoint"
            r0 = -1
            int r2 = r2.getIntExtra(r1, r0)
            if (r2 == r0) goto L_0x0021
            X.25g r1 = r6.A12
            java.lang.Integer r0 = r1.A0q
            if (r0 != 0) goto L_0x029f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A0q = r0
            if (r0 == 0) goto L_0x02a6
        L_0x029f:
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != 0) goto L_0x02a7
        L_0x02a6:
            r1 = 0
        L_0x02a7:
            java.lang.String r0 = "Bug in loading call lobby entry point"
            X.AnonymousClass00B.A0B(r0, r1)
            return
        L_0x02ad:
            if (r2 == 0) goto L_0x0021
            goto L_0x025a
        L_0x02b0:
            r1.A0P()
            goto L_0x0237
        L_0x02b4:
            java.lang.String r0 = "voice-service-wrapper/handler WHAT_SERVICE_ON_DESTROY"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.25g r0 = r2.A00
            if (r0 == 0) goto L_0x0021
            r0.A0H()
            r2.A00 = r5
            return
        L_0x02c4:
            java.lang.String r0 = "voice-service-wrapper/handler WHAT_STOP_SERVICE"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A03 = r6
            boolean r0 = r2.A02
            goto L_0x02db
        L_0x02cf:
            java.lang.String r0 = "voice-service-wrapper/handler WHAT_SERVICE_ON_UNBIND"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A01 = r5
            r2.A02 = r6
            boolean r0 = r2.A03
        L_0x02db:
            if (r0 != 0) goto L_0x0021
            r2.sendEmptyMessage(r1)
            return
        L_0x02e1:
            X.25g r0 = r2.A00
            if (r0 != 0) goto L_0x0446
            X.0wb r1 = r2.A04
            X.0tz r0 = r1.A0e
            android.content.Context r0 = r0.A00
            r94 = r0
            X.0t3 r0 = r1.A0d
            r46 = r0
            X.0pd r0 = r1.A0u
            r62 = r0
            X.0pt r0 = r1.A04
            r93 = r0
            com.whatsapp.voipcalling.JNIUtils r0 = r1.A1E
            r81 = r0
            X.0so r0 = r1.A02
            r92 = r0
            X.0sK r0 = r1.A06
            r91 = r0
            X.0sq r0 = r1.A1C
            r79 = r0
            X.0sb r0 = r1.A03
            r90 = r0
            X.0ua r0 = r1.A09
            r89 = r0
            X.1Bz r0 = r1.A0E
            r20 = r0
            X.0t9 r0 = r1.A0v
            r63 = r0
            X.124 r0 = r1.A10
            r68 = r0
            X.0xT r0 = r1.A0l
            r53 = r0
            X.14s r0 = r1.A1A
            r77 = r0
            X.0xa r0 = r1.A16
            r74 = r0
            X.198 r0 = r1.A0G
            r22 = r0
            X.15A r0 = r1.A1D
            r80 = r0
            X.0xc r0 = r1.A0B
            r88 = r0
            X.0vQ r0 = r1.A0T
            r36 = r0
            X.1An r0 = r1.A0K
            r26 = r0
            X.0xj r0 = r1.A0C
            r18 = r0
            X.0sG r0 = r1.A0W
            r39 = r0
            X.16P r0 = r1.A0k
            r52 = r0
            X.01V r0 = r1.A0c
            r45 = r0
            X.0sP r0 = r1.A0X
            r40 = r0
            X.013 r0 = r1.A0i
            r50 = r0
            X.1SI r0 = r1.A0L
            r27 = r0
            X.19v r0 = r1.A15
            r73 = r0
            X.125 r0 = r1.A13
            r71 = r0
            X.0ul r0 = r1.A0w
            r64 = r0
            X.12z r0 = r1.A07
            r87 = r0
            X.0tK r0 = r1.A0A
            r86 = r0
            X.1SJ r0 = r1.A0H
            r23 = r0
            X.1D0 r0 = r1.A0p
            r57 = r0
            X.15I r0 = r1.A0Z
            r42 = r0
            X.0sf r0 = r1.A19
            r76 = r0
            X.16U r0 = r1.A0Y
            r41 = r0
            X.19T r0 = r1.A05
            r85 = r0
            X.15q r0 = r1.A12
            r70 = r0
            X.11s r0 = r1.A0j
            r51 = r0
            X.0z2 r0 = r1.A0t
            r61 = r0
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r1.A1F
            r82 = r0
            X.0y8 r0 = r1.A0m
            r54 = r0
            X.11o r0 = r1.A11
            r69 = r0
            X.0sj r0 = r1.A0g
            r48 = r0
            X.0rz r0 = r1.A0h
            r49 = r0
            X.12s r0 = r1.A0D
            r19 = r0
            X.137 r0 = r1.A0s
            r60 = r0
            X.195 r0 = r1.A0q
            r58 = r0
            X.1OK r0 = r1.A0Q
            r33 = r0
            X.0w0 r0 = r1.A0N
            r30 = r0
            X.1HD r0 = r1.A08
            r84 = r0
            X.1OL r0 = r1.A0F
            r21 = r0
            X.0yL r0 = r1.A0f
            r47 = r0
            X.1Hn r0 = r1.A0z
            r67 = r0
            X.0vU r0 = r1.A0x
            r65 = r0
            X.1B1 r0 = r1.A1B
            r78 = r0
            X.1SK r0 = r1.A0J
            r25 = r0
            X.1GG r0 = r1.A0o
            r56 = r0
            X.0yU r0 = r1.A0y
            r66 = r0
            X.0yW r0 = r1.A17
            r75 = r0
            X.1SL r0 = r1.A0a
            r43 = r0
            X.1Ao r0 = r1.A0R
            r34 = r0
            X.0ry r0 = r1.A0P
            r17 = r0
            X.0tH r0 = r1.A01
            r16 = r0
            X.0wP r15 = r1.A0V
            X.19B r14 = r1.A0r
            X.0yg r13 = r1.A0U
            X.1SM r12 = r1.A0I
            X.1SN r11 = r1.A0S
            X.1SO r10 = r1.A0O
            X.14x r9 = r1.A0M
            X.11R r8 = r1.A0b
            X.1HG r7 = r1.A14
            X.1HU r6 = r1.A0n
            X.01D r5 = r1.A1G
            X.25g r0 = new X.25g
            r24 = r12
            r28 = r1
            r29 = r9
            r31 = r10
            r32 = r17
            r35 = r11
            r37 = r13
            r38 = r15
            r44 = r8
            r55 = r6
            r59 = r14
            r72 = r7
            r83 = r5
            r5 = r0
            r6 = r94
            r7 = r16
            r8 = r92
            r9 = r90
            r10 = r93
            r11 = r85
            r12 = r91
            r13 = r87
            r14 = r84
            r15 = r89
            r16 = r86
            r17 = r88
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83)
            r2.A00 = r0
            r0.A0G()
            r2.A03 = r3
        L_0x0446:
            java.lang.Object r1 = r4.obj
            X.AnonymousClass00B.A06(r1)
            X.10g r1 = (X.C204710g) r1
            X.25g r0 = r2.A00
            X.AnonymousClass00B.A06(r0)
            r0.A0a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52252dO.handleMessage(android.os.Message):void");
    }
}
