package com.obwhatsapp.qrcode;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass01V;
import X.AnonymousClass09P;
import X.AnonymousClass2Qt;
import X.AnonymousClass2V3;
import X.AnonymousClass5TD;
import X.C101174wq;
import X.C109465Sf;
import X.C14710pd;
import X.C16150sX;
import X.C16620tM;
import X.C17020u3;
import X.C42971z5;
import X.C49062Qp;
import X.C52652eD;
import X.C52662eE;
import X.C54772iD;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.redex.IDxGListenerShape16S0100000_2_I1;
import com.facebook.redex.IDxTListenerShape63S0200000_2_I1;
import com.whatsapp.util.Log;
import java.util.Map;

public class QrScannerViewV2 extends FrameLayout implements AnonymousClass5TD, AnonymousClass006 {
    public AnonymousClass2V3 A00;
    public AnonymousClass2Qt A01;
    public AnonymousClass01V A02;
    public C14710pd A03;
    public C17020u3 A04;
    public C109465Sf A05;
    public C52662eE A06;
    public boolean A07;
    public final Handler A08;

    public QrScannerViewV2(Context context) {
        super(context);
        A00();
        this.A08 = AnonymousClass000.A0L();
        this.A00 = new C101174wq(this);
        A01();
    }

    public QrScannerViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        this.A08 = AnonymousClass000.A0L();
        this.A00 = new C101174wq(this);
        A01();
    }

    public QrScannerViewV2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
        this.A08 = AnonymousClass000.A0L();
        this.A00 = new C101174wq(this);
        A01();
    }

    public QrScannerViewV2(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        A00();
    }

    private void setupTapToFocus(View view) {
        view.setOnTouchListener(new IDxTListenerShape63S0200000_2_I1(new AnonymousClass09P(getContext(), new IDxGListenerShape16S0100000_2_I1(this, 0)), 3, this));
    }

    public void A00() {
        if (!this.A07) {
            this.A07 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A03 = C16150sX.A0k(A002);
            this.A02 = C16150sX.A0T(A002);
            this.A04 = C16150sX.A14(A002);
        }
    }

    public final void A01() {
        AnonymousClass2Qt r1;
        Context context = getContext();
        if (this.A03.A0E(C16620tM.A02, 125)) {
            r1 = C54772iD.A00(context, C42971z5.A02(this.A02, this.A04));
            if (r1 != null) {
                Log.i("QrScannerViewV2/LiteCameraView");
                this.A01 = r1;
                r1.setQrScanningEnabled(true);
                AnonymousClass2Qt r12 = this.A01;
                r12.setCameraCallback(this.A00);
                View view = (View) r12;
                setupTapToFocus(view);
                addView(view);
            }
        }
        Log.i("QrScannerViewV2/CameraView");
        r1 = new C49062Qp(context);
        this.A01 = r1;
        r1.setQrScanningEnabled(true);
        AnonymousClass2Qt r122 = this.A01;
        r122.setCameraCallback(this.A00);
        View view2 = (View) r122;
        setupTapToFocus(view2);
        addView(view2);
    }

    public boolean AJl() {
        return this.A01.AJl();
    }

    public void AcJ() {
    }

    public void AcX() {
    }

    public boolean Aga() {
        return this.A01.Aga();
    }

    public void Agz() {
        this.A01.Agz();
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A06;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        AnonymousClass2Qt r0 = this.A01;
        if (i2 == 0) {
            r0.Acc();
            this.A01.A6D();
            return;
        }
        r0.pause();
    }

    public void setQrDecodeHints(Map map) {
        this.A01.setQrDecodeHints(map);
    }

    public void setQrScannerCallback(C109465Sf r1) {
        this.A05 = r1;
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        ((View) this.A01).setVisibility(i2);
    }
}
