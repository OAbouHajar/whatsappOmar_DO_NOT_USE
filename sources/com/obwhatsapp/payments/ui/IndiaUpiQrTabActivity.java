package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass175;
import X.AnonymousClass1A9;
import X.AnonymousClass5QC;
import X.AnonymousClass5x9;
import X.AnonymousClass5xN;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.AnonymousClass62U;
import X.C004601z;
import X.C005402i;
import X.C110545eP;
import X.C111085fJ;
import X.C111515gN;
import X.C114535nv;
import X.C1201560n;
import X.C13680ns;
import X.C13700nu;
import X.C16260sj;
import X.C434920f;
import X.C54932iV;
import X.C83824Ie;
import X.C86434Sr;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.obwhatsapp.PagerSlidingTabStrip;
import com.obwhatsapp.R;
import com.obwhatsapp.qrcode.WaQrScannerView;

public final class IndiaUpiQrTabActivity extends C111515gN {
    public static String A0G;
    public ViewPager A00;
    public PagerSlidingTabStrip A01;
    public C16260sj A02;
    public C1201560n A03;
    public AnonymousClass60V A04;
    public AnonymousClass175 A05;
    public AnonymousClass61W A06;
    public IndiaUpiMyQrFragment A07;
    public C110545eP A08;
    public IndiaUpiScanQrCodeFragment A09;
    public AnonymousClass5x9 A0A;
    public AnonymousClass5xN A0B;
    public C86434Sr A0C;
    public AnonymousClass1A9 A0D;
    public boolean A0E = false;
    public final AnonymousClass5QC A0F = new AnonymousClass62U(this);

    public void A1R(AnonymousClass01A r2) {
        super.A1R(r2);
        if (r2 instanceof IndiaUpiMyQrFragment) {
            this.A07 = (IndiaUpiMyQrFragment) r2;
        } else if (r2 instanceof IndiaUpiScanQrCodeFragment) {
            this.A09 = (IndiaUpiScanQrCodeFragment) r2;
        }
    }

    public void A35() {
        int A032 = this.A02.A03("android.permission.CAMERA");
        IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = this.A09;
        WaQrScannerView waQrScannerView = indiaUpiScanQrCodeFragment.A09;
        if (A032 != 0) {
            waQrScannerView.setVisibility(8);
            indiaUpiScanQrCodeFragment.A00.setVisibility(8);
            indiaUpiScanQrCodeFragment.A01.setVisibility(0);
            C54932iV r5 = new C54932iV(this);
            r5.A01 = R.drawable.permission_cam;
            int[] iArr = {R.string.str1cf7};
            r5.A06 = R.string.str11a5;
            r5.A0I = iArr;
            int[] iArr2 = {R.string.str1cf7};
            r5.A09 = R.string.str11a6;
            r5.A0G = iArr2;
            r5.A0K = new String[]{"android.permission.CAMERA"};
            r5.A0D = true;
            Ag3(r5.A00(), 1);
            return;
        }
        waQrScannerView.setVisibility(0);
        indiaUpiScanQrCodeFragment.A00.setVisibility(0);
        indiaUpiScanQrCodeFragment.A01.setVisibility(8);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            if (i3 != 0) {
                IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = this.A09;
                indiaUpiScanQrCodeFragment.A09.setVisibility(0);
                indiaUpiScanQrCodeFragment.A00.setVisibility(0);
                indiaUpiScanQrCodeFragment.A01.setVisibility(8);
            } else if (this.A08.A00.length == 2) {
                this.A00.A0F(this.A01.A0T() ^ true ? 1 : 0, true);
            } else {
                finish();
            }
        } else if (i2 == 202) {
            if (i3 == -1) {
                IndiaUpiMyQrFragment indiaUpiMyQrFragment = this.A07;
                indiaUpiMyQrFragment.A0E.A07(C13680ns.A0f(indiaUpiMyQrFragment.A0D.A0F), 0);
            }
        } else if (i2 == 203 && i3 == -1 && intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                Afq(R.string.str13db);
                C13700nu.A0W(new C114535nv(data, this, this.A0D, this.A09.A09.getWidth(), this.A09.A09.getHeight()), this.A05);
                return;
            }
            this.A05.A09(R.string.str0848, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        C110545eP r1;
        C434920f.A04(this, R.color.color04f1);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView((int) R.layout.layout0349);
        this.A0C = new C86434Sr();
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0B(R.string.str0d0a);
            x2.A0N(true);
        }
        A0G = getIntent().getStringExtra("extra_account_holder_name");
        C005402i x3 = x();
        AnonymousClass00B.A06(x3);
        x3.A0N(true);
        this.A00 = (ViewPager) findViewById(R.id.payment_qr_pager);
        this.A01 = (PagerSlidingTabStrip) findViewById(R.id.payment_qr_tab_strip);
        if (this.A05.A0C()) {
            this.A01.setVisibility(0);
            if (x2 != null) {
                x2.A0B(R.string.str132a);
            }
            r1 = new C110545eP(AGM(), this, 2);
        } else {
            this.A01.setVisibility(8);
            r1 = new C110545eP(AGM(), this, 1);
        }
        this.A08 = r1;
        this.A00.setAdapter(r1);
        this.A00.A0G(new C111085fJ(this));
        C004601z.A0f(this.A01, 0);
        this.A01.setViewPager(this.A00);
        this.A00.A0F(0, false);
        C110545eP r3 = this.A08;
        int i2 = 0;
        while (true) {
            C83824Ie[] r12 = r3.A00;
            if (i2 < r12.length) {
                C83824Ie r0 = r12[i2];
                r0.A00.setSelected(AnonymousClass000.A1R(i2, 0));
                i2++;
            } else {
                AnonymousClass60V r32 = this.A04;
                this.A03 = new C1201560n(this.A06, this.A0C, r32, this.A06, this.A0B);
                return;
            }
        }
    }

    public void onStart() {
        super.onStart();
        this.A0C.A01(getWindow(), this.A08);
    }

    public void onStop() {
        this.A0C.A00(getWindow());
        super.onStop();
    }
}
