package com.obwhatsapp.qrcode;

import X.AnonymousClass006;
import X.AnonymousClass5TD;
import X.C109465Sf;
import X.C14710pd;
import X.C16150sX;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;

public class WaQrScannerView extends FrameLayout implements AnonymousClass5TD, AnonymousClass006 {
    public C14710pd A00;
    public AnonymousClass5TD A01;
    public C52662eE A02;
    public boolean A03;

    public WaQrScannerView(Context context) {
        super(context);
        A00();
        A01();
    }

    public WaQrScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A00();
        A01();
    }

    public WaQrScannerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        A01();
    }

    public void A00() {
        if (!this.A03) {
            this.A03 = true;
            this.A00 = C16150sX.A0k(C52652eD.A00(generatedComponent()));
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.obwhatsapp.qrcode.QrScannerViewV2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r3 = this;
            X.0pd r2 = r3.A00
            r1 = 349(0x15d, float:4.89E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            android.content.Context r1 = r3.getContext()
            if (r0 == 0) goto L_0x001b
            com.obwhatsapp.qrcode.QrScannerViewV2 r0 = new com.obwhatsapp.qrcode.QrScannerViewV2
            r0.<init>(r1)
        L_0x0015:
            r3.addView(r0)
            r3.A01 = r0
            return
        L_0x001b:
            X.2np r0 = new X.2np
            r0.<init>(r1)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.qrcode.WaQrScannerView.A01():void");
    }

    public boolean AJl() {
        return this.A01.AJl();
    }

    public void AcJ() {
        this.A01.AcJ();
    }

    public void AcX() {
        this.A01.AcX();
    }

    public boolean Aga() {
        return this.A01.Aga();
    }

    public void Agz() {
        this.A01.Agz();
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setQrDecodeHints(Map map) {
        this.A01.setQrDecodeHints(map);
    }

    public void setQrScannerCallback(C109465Sf r2) {
        this.A01.setQrScannerCallback(r2);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        ((View) this.A01).setVisibility(i2);
    }
}
