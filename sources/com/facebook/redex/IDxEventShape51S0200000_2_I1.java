package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass4TI;
import X.AnonymousClass5TQ;
import X.C108365Nr;
import X.C90184df;

public class IDxEventShape51S0200000_2_I1 implements C108365Nr {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxEventShape51S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void AIX(Object obj) {
        String str;
        switch (this.A02) {
            case 0:
                ((AnonymousClass5TQ) obj).AZ8(((C90184df) this.A00).A08, (AnonymousClass4TI) this.A01);
                return;
            case 1:
                str = "onRenderedFirstFrame";
                break;
            case 2:
                str = "onPlayerError";
                break;
            case 3:
                str = "onMediaItemTransition";
                break;
            case 4:
                str = "onPlaybackParametersChanged";
                break;
            case 5:
                str = "onAudioAttributesChanged";
                break;
            case 6:
                str = "onVideoDisabled";
                break;
            case 7:
                str = "onAudioEnabled";
                break;
            case 8:
                str = "onAudioDisabled";
                break;
            case 9:
                str = "onVideoEnabled";
                break;
            case 10:
                str = "onMetadata";
                break;
            case 11:
                str = "onDownstreamFormatChanged";
                break;
            case 12:
                str = "onAudioSinkError";
                break;
            default:
                str = "onStaticMetadataChanged";
                break;
        }
        throw AnonymousClass000.A0W(str);
    }
}
