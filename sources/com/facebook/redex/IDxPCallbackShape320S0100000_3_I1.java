package com.facebook.redex;

import X.AnonymousClass5vQ;
import X.AnonymousClass5vW;
import X.AnonymousClass688;
import X.C118895va;
import X.C119125wa;
import android.hardware.Camera;
import java.util.List;

public class IDxPCallbackShape320S0100000_3_I1 implements Camera.PreviewCallback {
    public Object A00;
    public final int A01;

    public IDxPCallbackShape320S0100000_3_I1(AnonymousClass5vW r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        if (this.A01 != 0) {
            if (bArr != null) {
                C119125wa.A00().A01();
                C118895va r4 = new C118895va();
                AnonymousClass5vW r3 = (AnonymousClass5vW) this.A00;
                int i2 = r3.A00;
                AnonymousClass5vQ r0 = r3.A01;
                r4.A00(i2, bArr, r0.A02, r0.A01);
                List list = r3.A05.A00;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((AnonymousClass688) list.get(i3)).AVF(r4);
                }
                camera.addCallbackBuffer(bArr);
            }
        } else if (bArr != null) {
            C119125wa.A00().A01();
            C118895va r42 = new C118895va();
            AnonymousClass5vW r32 = (AnonymousClass5vW) this.A00;
            int i4 = r32.A00;
            AnonymousClass5vQ r02 = r32.A01;
            r42.A00(i4, bArr, r02.A02, r02.A01);
            List list2 = r32.A05.A00;
            int size2 = list2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((AnonymousClass688) list2.get(i5)).AVF(r42);
            }
        }
    }
}
