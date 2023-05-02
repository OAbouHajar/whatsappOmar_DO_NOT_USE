package com.facebook.redex;

import X.AnonymousClass000;
import X.C108365Nr;

public class IDxEventShape26S0300000_2_I1 implements C108365Nr {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxEventShape26S0300000_2_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void AIX(Object obj) {
        String str;
        switch (this.A03) {
            case 0:
                str = "onVideoInputFormatChanged";
                break;
            case 1:
                str = "onAudioInputFormatChanged";
                break;
            case 2:
                str = "onLoadCompleted";
                break;
            case 3:
                str = "onLoadCanceled";
                break;
            case 4:
                str = "onLoadStarted";
                break;
            default:
                str = "onTracksChanged";
                break;
        }
        throw AnonymousClass000.A0W(str);
    }
}
