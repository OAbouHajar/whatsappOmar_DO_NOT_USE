package com.facebook.redex;

import X.C108365Nr;

public class IDxEventShape165S0100000_2_I1 implements C108365Nr {
    public Object A00;
    public final int A01;

    public IDxEventShape165S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        if (r2.A01 != 0) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AIX(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0045;
                case 1: goto L_0x0053;
                case 2: goto L_0x005f;
                case 3: goto L_0x006b;
                case 4: goto L_0x0077;
                case 5: goto L_0x0052;
                case 6: goto L_0x0083;
                case 7: goto L_0x009c;
                case 8: goto L_0x00a8;
                case 9: goto L_0x00b4;
                case 10: goto L_0x000c;
                case 11: goto L_0x000f;
                case 12: goto L_0x0012;
                case 13: goto L_0x0015;
                case 14: goto L_0x0018;
                case 15: goto L_0x001b;
                case 16: goto L_0x001e;
                case 17: goto L_0x0021;
                case 18: goto L_0x0024;
                case 19: goto L_0x0027;
                case 20: goto L_0x002a;
                case 21: goto L_0x002d;
                case 22: goto L_0x0030;
                case 23: goto L_0x0033;
                case 24: goto L_0x0036;
                case 25: goto L_0x0039;
                case 26: goto L_0x003c;
                case 27: goto L_0x003f;
                case 28: goto L_0x0042;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = "onPlaybackSuppressionReasonChanged"
        L_0x0007:
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x000c:
            java.lang.String r0 = "onTimelineChanged"
            goto L_0x0007
        L_0x000f:
            java.lang.String r0 = "onPlaybackStateChanged"
            goto L_0x0007
        L_0x0012:
            java.lang.String r0 = "onPositionDiscontinuity"
            goto L_0x0007
        L_0x0015:
            java.lang.String r0 = "onVideoSizeChanged"
            goto L_0x0007
        L_0x0018:
            java.lang.String r0 = "onDroppedVideoFrames"
            goto L_0x0007
        L_0x001b:
            java.lang.String r0 = "onBandwidthEstimate"
            goto L_0x0007
        L_0x001e:
            java.lang.String r0 = "onAudioUnderrun"
            goto L_0x0007
        L_0x0021:
            java.lang.String r0 = "onAudioPositionAdvancing"
            goto L_0x0007
        L_0x0024:
            java.lang.String r0 = "onVideoFrameProcessingOffset"
            goto L_0x0007
        L_0x0027:
            java.lang.String r0 = "onAudioDecoderReleased"
            goto L_0x0007
        L_0x002a:
            java.lang.String r0 = "onVideoDecoderReleased"
            goto L_0x0007
        L_0x002d:
            java.lang.String r0 = "onVideoDecoderInitialized"
            goto L_0x0007
        L_0x0030:
            java.lang.String r0 = "onAudioDecoderInitialized"
            goto L_0x0007
        L_0x0033:
            java.lang.String r0 = "onIsLoadingChanged"
            goto L_0x0007
        L_0x0036:
            java.lang.String r0 = "onSkipSilenceEnabledChanged"
            goto L_0x0007
        L_0x0039:
            java.lang.String r0 = "onIsPlayingChanged"
            goto L_0x0007
        L_0x003c:
            java.lang.String r0 = "onPlayerStateChanged"
            goto L_0x0007
        L_0x003f:
            java.lang.String r0 = "onPlayWhenReadyChanged"
            goto L_0x0007
        L_0x0042:
            java.lang.String r0 = "onSeekProcessed"
            goto L_0x0007
        L_0x0045:
            java.lang.Object r0 = r3.A00
            X.4df r0 = (X.C90184df) r0
            X.5TQ r4 = (X.AnonymousClass5TQ) r4
            boolean r1 = r0.A0D
            int r0 = r0.A00
            r4.AUt(r1, r0)
        L_0x0052:
            return
        L_0x0053:
            java.lang.Object r0 = r3.A00
            X.4df r0 = (X.C90184df) r0
            X.5TQ r4 = (X.AnonymousClass5TQ) r4
            int r0 = r0.A01
            r4.AUr(r0)
            return
        L_0x005f:
            java.lang.Object r0 = r3.A00
            X.4df r0 = (X.C90184df) r0
            X.5TQ r4 = (X.AnonymousClass5TQ) r4
            boolean r0 = r0.A0E
            r4.AQo(r0)
            return
        L_0x006b:
            java.lang.Object r0 = r3.A00
            X.4df r0 = (X.C90184df) r0
            X.5TQ r4 = (X.AnonymousClass5TQ) r4
            X.4bm r0 = r0.A04
            r4.AUo(r0)
            return
        L_0x0077:
            java.lang.Object r0 = r3.A00
            X.4df r0 = (X.C90184df) r0
            X.5TQ r4 = (X.AnonymousClass5TQ) r4
            boolean r0 = r0.A0B
            r4.ASO(r0)
            return
        L_0x0083:
            java.lang.Object r2 = r3.A00
            X.4df r2 = (X.C90184df) r2
            X.5TQ r4 = (X.AnonymousClass5TQ) r4
            int r1 = r2.A00
            r0 = 3
            if (r1 != r0) goto L_0x0097
            boolean r0 = r2.A0D
            if (r0 == 0) goto L_0x0097
            int r1 = r2.A01
            r0 = 1
            if (r1 == 0) goto L_0x0098
        L_0x0097:
            r0 = 0
        L_0x0098:
            r4.ASP(r0)
            return
        L_0x009c:
            java.lang.Object r0 = r3.A00
            X.4df r0 = (X.C90184df) r0
            X.5TQ r4 = (X.AnonymousClass5TQ) r4
            java.util.List r0 = r0.A0A
            r4.AXd(r0)
            return
        L_0x00a8:
            java.lang.Object r0 = r3.A00
            X.4df r0 = (X.C90184df) r0
            X.5TQ r4 = (X.AnonymousClass5TQ) r4
            int r0 = r0.A00
            r4.AUq(r0)
            return
        L_0x00b4:
            java.lang.Object r0 = r3.A00
            X.4df r0 = (X.C90184df) r0
            X.5TQ r4 = (X.AnonymousClass5TQ) r4
            X.43y r0 = r0.A03
            r4.AUs(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxEventShape165S0100000_2_I1.AIX(java.lang.Object):void");
    }
}
