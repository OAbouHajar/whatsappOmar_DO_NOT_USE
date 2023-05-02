package com.obwhatsapp.payments.ui;

import X.AnonymousClass01V;
import X.AnonymousClass1N7;
import X.C004601z;
import X.C110105dW;
import X.C13680ns;
import X.C14870pt;
import X.C16260sj;
import X.C17650vQ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.IDxSCallbackShape308S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.qrcode.WaQrScannerView;

public class IndiaUpiScanQrCodeFragment extends Hilt_IndiaUpiScanQrCodeFragment {
    public View A00;
    public View A01;
    public ImageView A02;
    public ImageView A03;
    public C14870pt A04;
    public C17650vQ A05;
    public AnonymousClass01V A06;
    public C16260sj A07;
    public AnonymousClass1N7 A08;
    public WaQrScannerView A09;
    public String A0A;

    public void A0w() {
        super.A0w();
        if (this.A09.getVisibility() == 0) {
            this.A09.setVisibility(4);
        }
        this.A08.A01(4);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout04df);
    }

    public void A14() {
        super.A14();
        if (this.A09.getVisibility() == 4) {
            this.A09.setVisibility(0);
        }
    }

    public void A18(Bundle bundle, View view) {
        C004601z.A0E(view, R.id.education).setVisibility(8);
        this.A00 = C004601z.A0E(view, R.id.overlay);
        this.A09 = (WaQrScannerView) C004601z.A0E(view, R.id.qr_scanner_view);
        this.A01 = C004601z.A0E(view, R.id.shade);
        this.A09.setQrScannerCallback(new IDxSCallbackShape308S0100000_3_I1(this, 1));
        ImageView A0J = C13680ns.A0J(view, R.id.qr_scan_from_gallery);
        this.A03 = A0J;
        A0J.setVisibility(0);
        C110105dW.A0r(this.A03, this, 80);
        ImageView A0J2 = C13680ns.A0J(view, R.id.qr_scan_flash);
        this.A02 = A0J2;
        C110105dW.A0r(A0J2, this, 79);
        this.A09.setVisibility(8);
        this.A00.setVisibility(8);
        this.A01.setVisibility(0);
    }

    public final void A1A() {
        boolean Aga = this.A09.Aga();
        ImageView imageView = this.A02;
        if (Aga) {
            imageView.setVisibility(0);
            boolean AJl = this.A09.AJl();
            ImageView imageView2 = this.A02;
            int i2 = R.drawable.flash_off;
            if (AJl) {
                i2 = R.drawable.flash_on;
            }
            imageView2.setImageResource(i2);
            ImageView imageView3 = this.A02;
            int i3 = R.string.str0903;
            if (!AJl) {
                i3 = R.string.str0905;
            }
            imageView3.setContentDescription(A0J(i3));
            return;
        }
        imageView.setVisibility(8);
    }
}
