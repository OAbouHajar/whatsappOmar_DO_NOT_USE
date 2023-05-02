package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass4VC;
import X.C108365Nr;

public class IDxEventShape164S0100000_2_I0 implements C108365Nr {
    public Object A00;
    public final int A01;

    public IDxEventShape164S0100000_2_I0(AnonymousClass4VC r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public final void AIX(Object obj) {
        String str;
        switch (this.A01) {
            case 0:
                str = "onSurfaceSizeChanged";
                break;
            case 1:
                str = "onPlayerReleased";
                break;
            case 2:
                str = "onSeekStarted";
                break;
            default:
                str = "onVolumeChanged";
                break;
        }
        throw AnonymousClass000.A0W(str);
    }
}
