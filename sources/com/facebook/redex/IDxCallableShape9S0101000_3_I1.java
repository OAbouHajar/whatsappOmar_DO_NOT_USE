package com.facebook.redex;

import X.AnonymousClass5vQ;
import X.AnonymousClass5wI;
import X.AnonymousClass5xH;
import X.AnonymousClass5yJ;
import X.AnonymousClass5zC;
import X.AnonymousClass5zQ;
import X.AnonymousClass67L;
import X.C116955sD;
import X.C116965sE;
import android.hardware.Camera;
import java.util.concurrent.Callable;

public class IDxCallableShape9S0101000_3_I1 implements Callable {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxCallableShape9S0101000_3_I1(AnonymousClass5zC r1, int i2, int i3) {
        this.A02 = i3;
        this.A01 = r1;
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        int i2;
        int i3;
        switch (this.A02) {
            case 0:
                AnonymousClass5xH.A00();
                Camera open = Camera.open(this.A00);
                AnonymousClass5xH.A00();
                return open;
            case 1:
                AnonymousClass5zC r1 = (AnonymousClass5zC) this.A01;
                if (!r1.isConnected() || !r1.A0f) {
                    i2 = 0;
                } else {
                    AnonymousClass5yJ r0 = r1.A0O;
                    i2 = this.A00;
                    r0.A00(i2);
                }
                return Integer.valueOf(i2);
            default:
                AnonymousClass5zC r4 = (AnonymousClass5zC) this.A01;
                if (r4.isConnected()) {
                    r4.A01 = this.A00;
                    if (r4.A0Z == null) {
                        r4.A0Y.setDisplayOrientation(r4.A04(r4.A01));
                    } else {
                        r4.A0Y.setDisplayOrientation(r4.A04(AnonymousClass5zQ.A0C ? 0 : r4.A01));
                        AnonymousClass5zQ r3 = r4.A0Z;
                        int i4 = r4.A01;
                        if (i4 == 1) {
                            i3 = 90;
                        } else if (i4 != 2) {
                            i3 = 270;
                            if (i4 != 3) {
                                i3 = 0;
                            }
                        } else {
                            i3 = 180;
                        }
                        r3.A02(i3);
                    }
                    AnonymousClass5wI A05 = r4.A05();
                    AnonymousClass5vQ r02 = (AnonymousClass5vQ) A05.A05(AnonymousClass5wI.A0m);
                    r4.A0A(r02.A02, r02.A01);
                    return new C116965sE(new C116955sD(r4.AAT(), A05, r4.A00));
                }
                throw new AnonymousClass67L("Can not update preview display rotation");
        }
    }
}
