package X;

import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.2PE  reason: invalid class name */
public class AnonymousClass2PE {
    public final /* synthetic */ VoipActivityV2 A00;

    public AnonymousClass2PE(VoipActivityV2 voipActivityV2) {
        this.A00 = voipActivityV2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r4.A44(r8) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(boolean r10) {
        /*
            r9 = this;
            com.whatsapp.voipcalling.VoipActivityV2 r4 = r9.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r4.A1d
            if (r0 == 0) goto L_0x0064
            com.whatsapp.voipcalling.CallInfo r8 = r4.A3B()
            boolean r0 = r4.A20
            r5 = 0
            if (r0 == 0) goto L_0x001b
            boolean r0 = r4.A1m
            if (r0 == 0) goto L_0x001b
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r10 == 0) goto L_0x0018
            r0 = 0
        L_0x0018:
            r4.A3d(r0)
        L_0x001b:
            r3 = 1
            if (r10 == 0) goto L_0x006a
            r2 = 0
            if (r8 == 0) goto L_0x0028
            boolean r0 = r4.A44(r8)
            r1 = 0
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            android.view.View r0 = r4.A0R
            if (r1 == 0) goto L_0x002f
            r2 = 8
        L_0x002f:
            r0.setVisibility(r2)
            android.view.View r1 = r4.A0L
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r4.A1d
            boolean r0 = r0.A1S()
            if (r0 != 0) goto L_0x0044
            if (r8 == 0) goto L_0x0065
            boolean r0 = r8.isSelfRequestingUpgrade()
            if (r0 == 0) goto L_0x0065
        L_0x0044:
            r0 = 4
        L_0x0045:
            X.C004601z.A0d(r1, r0)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r4.A1d
            boolean r0 = r0.A1S()
            if (r0 == 0) goto L_0x0057
            com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner r0 = r4.A0s
            if (r0 == 0) goto L_0x0057
            r0.A01()
        L_0x0057:
            com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment r0 = r4.A15
            if (r0 == 0) goto L_0x0067
            boolean r0 = r0.A0c()
            if (r0 == 0) goto L_0x0067
            r4.A3N()
        L_0x0064:
            return
        L_0x0065:
            r0 = 1
            goto L_0x0045
        L_0x0067:
            r4.A3S()
        L_0x006a:
            boolean r0 = r4.A23
            if (r0 == r10) goto L_0x00d4
            java.lang.String r1 = "voip/VoipActivityV2/onSheetVisibilityChanged "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A23 = r10
            if (r8 == 0) goto L_0x00d4
            boolean r0 = r8.videoEnabled
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "can be called only for video call"
            X.AnonymousClass00B.A0B(r0, r3)
            java.util.Map r0 = r4.A1h
            java.util.Collection r0 = r0.values()
            java.util.Iterator r7 = r0.iterator()
        L_0x0097:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r6 = r7.next()
            X.39w r6 = (X.C616839w) r6
            com.whatsapp.jid.UserJid r0 = r6.A04
            X.1fU r2 = r8.getInfoByJid(r0)
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r1 = r6.A00
            if (r1 == 0) goto L_0x0097
            boolean r0 = r1.A08()
            if (r0 == 0) goto L_0x0097
            int r1 = r1.A03
            r0 = 2
            if (r1 == r0) goto L_0x0097
            r0 = 3
            if (r1 == r0) goto L_0x0097
            r6.A09(r2, r8)
            goto L_0x0097
        L_0x00bf:
            if (r10 != 0) goto L_0x00d4
            com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment r2 = r4.A15
            if (r2 == 0) goto L_0x00d4
            boolean r0 = r2.A0c()
            if (r0 != 0) goto L_0x00d4
            X.02C r1 = r4.AGM()
            java.lang.String r0 = "maximized_video"
            r2.A1G(r1, r0)
        L_0x00d4:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r4.A1d
            boolean r0 = r0.A1U()
            if (r0 != 0) goto L_0x0064
            boolean r0 = r4.A20
            if (r0 == 0) goto L_0x00ec
            X.4SA r0 = r4.A0r
            if (r10 != 0) goto L_0x00e6
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x00e6:
            r0.A01 = r5
            r0.A00()
            return
        L_0x00ec:
            com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView r0 = r4.A16
            if (r0 == 0) goto L_0x0064
            int r0 = r0.A03
            if (r0 != r3) goto L_0x0064
            r4.A3a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PE.A00(boolean):void");
    }
}
