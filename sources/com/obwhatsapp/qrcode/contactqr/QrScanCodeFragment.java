package com.obwhatsapp.qrcode.contactqr;

import X.AnonymousClass013;
import X.AnonymousClass2JP;
import X.C13680ns;
import X.C13700nu;
import X.C14870pt;
import X.C15860rz;
import X.C17650vQ;
import X.C453428a;
import X.C63233Gq;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.obwhatsapp.R;
import com.obwhatsapp.qrcode.QrEducationDialogFragment;
import com.obwhatsapp.qrcode.QrScannerOverlay;
import com.obwhatsapp.qrcode.WaQrScannerView;

public class QrScanCodeFragment extends Hilt_QrScanCodeFragment {
    public View A00;
    public ImageView A01;
    public C14870pt A02;
    public C17650vQ A03;
    public C15860rz A04;
    public AnonymousClass013 A05;
    public QrScannerOverlay A06;
    public WaQrScannerView A07;
    public String A08;
    public boolean A09 = false;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Runnable A0D = new RunnableRunnableShape19S0100000_I1_2(this, 27);
    public final Runnable A0E = new RunnableRunnableShape19S0100000_I1_2(this, 28);

    public void A0w() {
        super.A0w();
        this.A02.A0J(this.A0D);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout014b);
        this.A07 = (WaQrScannerView) A0H.findViewById(R.id.qr_scanner_view);
        this.A06 = (QrScannerOverlay) A0H.findViewById(R.id.overlay);
        this.A00 = A0H.findViewById(R.id.qr_scan_from_gallery);
        this.A01 = C13680ns.A0K(A0H, R.id.qr_scan_flash);
        this.A0A = C13680ns.A0B(this.A04).getBoolean("contact_qr_education", true);
        C13680ns.A15(this.A01, this, 21);
        C13680ns.A15(this.A00, this, 22);
        WaQrScannerView waQrScannerView = this.A07;
        waQrScannerView.setQrScannerCallback(new C63233Gq(this));
        C13700nu.A0R(waQrScannerView, this, R.string.str1c3d);
        AnonymousClass2JP.A03(this.A07, R.string.str0011);
        C13680ns.A15(this.A07, this, 20);
        A1E();
        return A0H;
    }

    public void A12() {
        this.A02.A0J(this.A0D);
        super.A12();
    }

    public void A14() {
        super.A14();
        if (this.A0C && !this.A0B && !this.A0A) {
            this.A02.A0L(this.A0D, 15000);
        }
    }

    public void A1B() {
        if (this.A0A) {
            this.A0A = false;
            C13680ns.A0z(this.A04.A0K(), "contact_qr_education", false);
            this.A02.A0L(this.A0D, 15000);
        }
        this.A09 = false;
        this.A07.AcJ();
    }

    public void A1C() {
        this.A02.A0J(this.A0E);
        this.A0C = true;
        A1E();
        C14870pt r0 = this.A02;
        Runnable runnable = this.A0D;
        r0.A0J(runnable);
        if (this.A0A) {
            if (A0e()) {
                C453428a.A01(new QrEducationDialogFragment(), A0F());
                this.A09 = true;
            }
        } else if (!this.A0B) {
            this.A02.A0L(runnable, 15000);
        }
    }

    public final void A1D() {
        boolean Aga = this.A07.A01.Aga();
        ImageView imageView = this.A01;
        if (Aga) {
            imageView.setVisibility(0);
            boolean AJl = this.A07.A01.AJl();
            ImageView imageView2 = this.A01;
            int i2 = R.drawable.flash_off;
            if (AJl) {
                i2 = R.drawable.flash_on;
            }
            imageView2.setImageResource(i2);
            ImageView imageView3 = this.A01;
            int i3 = R.string.str0903;
            if (!AJl) {
                i3 = R.string.str0905;
            }
            C13700nu.A0R(imageView3, this, i3);
            return;
        }
        imageView.setVisibility(8);
    }

    public final void A1E() {
        WaQrScannerView waQrScannerView = this.A07;
        if (waQrScannerView != null) {
            int i2 = 0;
            waQrScannerView.setVisibility(C13680ns.A02(this.A0C ? 1 : 0));
            QrScannerOverlay qrScannerOverlay = this.A06;
            if (!this.A0C) {
                i2 = 8;
            }
            qrScannerOverlay.setVisibility(i2);
        }
    }
}
