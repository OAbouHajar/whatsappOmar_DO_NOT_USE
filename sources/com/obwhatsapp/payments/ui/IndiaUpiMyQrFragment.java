package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass00X;
import X.AnonymousClass013;
import X.AnonymousClass026;
import X.AnonymousClass04o;
import X.AnonymousClass07M;
import X.AnonymousClass09N;
import X.AnonymousClass174;
import X.AnonymousClass1PG;
import X.AnonymousClass1TV;
import X.AnonymousClass2Ao;
import X.AnonymousClass5z0;
import X.AnonymousClass60V;
import X.C000900k;
import X.C001000l;
import X.C001300o;
import X.C001500q;
import X.C004601z;
import X.C005402i;
import X.C006602z;
import X.C011105i;
import X.C110105dW;
import X.C110115dX;
import X.C110665ec;
import X.C116865s4;
import X.C117765tW;
import X.C119395xh;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14870pt;
import X.C15860rz;
import X.C15910s6;
import X.C16040sK;
import X.C17160ud;
import X.C17200uh;
import X.C18310wU;
import X.C228919r;
import X.C24561Gk;
import X.C26071Mf;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxIFactoryShape5S0200000_3_I1;
import com.facebook.redex.IDxObserverShape118S0100000_3_I1;
import com.obwhatsapp.CopyableTextView;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;

public class IndiaUpiMyQrFragment extends Hilt_IndiaUpiMyQrFragment {
    public View A00;
    public ImageView A01;
    public ImageView A02;
    public TextView A03;
    public C14870pt A04;
    public C16040sK A05;
    public C17160ud A06;
    public AnonymousClass2Ao A07;
    public C17200uh A08;
    public C15860rz A09;
    public AnonymousClass013 A0A;
    public AnonymousClass174 A0B;
    public C117765tW A0C;
    public IndiaUpiDisplaySecureQrCodeView A0D;
    public C110665ec A0E;
    public AnonymousClass1PG A0F;
    public final C011105i A0G = A07(new AnonymousClass5z0(this), new AnonymousClass07M());

    public static IndiaUpiMyQrFragment A01(String str) {
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putString("extra_account_holder_name", str);
        A0D2.putInt("action_bar_title_res_id", 0);
        A0D2.putBoolean("bottom_icon_visible", true);
        IndiaUpiMyQrFragment indiaUpiMyQrFragment = new IndiaUpiMyQrFragment();
        indiaUpiMyQrFragment.A0T(A0D2);
        return indiaUpiMyQrFragment;
    }

    public void A0q() {
        C005402i x2;
        super.A0q();
        Bundle bundle = this.A05;
        C001000l A0D2 = A0D();
        if ((A0D2 instanceof C14530pL) && bundle != null && bundle.getInt("action_bar_title_res_id", 0) != 0 && (x2 = ((C000900k) A0D2).x()) != null) {
            C110105dW.A0u(x2, bundle.getInt("action_bar_title_res_id"));
        }
    }

    public void A0x(int i2, int i3, Intent intent) {
        if (i2 == 1006) {
            IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = this.A0D;
            int i4 = 8;
            if (indiaUpiDisplaySecureQrCodeView.A06.getVisibility() == 8) {
                indiaUpiDisplaySecureQrCodeView.A05.setVisibility(0);
            } else {
                indiaUpiDisplaySecureQrCodeView.A02.setVisibility(0);
            }
            boolean A052 = indiaUpiDisplaySecureQrCodeView.A0B.A05(C15910s6.A0n);
            TextView textView = indiaUpiDisplaySecureQrCodeView.A08;
            if (A052 && indiaUpiDisplaySecureQrCodeView.A04.getVisibility() != 0) {
                i4 = 0;
            }
            textView.setVisibility(i4);
            return;
        }
        super.A0x(i2, i3, intent);
    }

    public void A0z(Menu menu, MenuInflater menuInflater) {
        menu.add(0, R.id.menuitem_share_qr, 0, R.string.str15f0).setIcon(AnonymousClass00X.A04(A02().getTheme(), A03(), R.drawable.ic_action_share)).setShowAsAction(1);
        if (Build.VERSION.SDK_INT >= 19) {
            menu.add(0, R.id.menuitem_print, 0, R.string.str12f6);
        }
    }

    public boolean A10(MenuItem menuItem) {
        int i2;
        if (menuItem.getItemId() == R.id.menuitem_share_qr) {
            if (AnonymousClass00T.A01(A02(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 30) {
                    i2 = R.string.str0f87;
                } else {
                    i2 = R.string.str0f8a;
                    if (i3 < 33) {
                        i2 = R.string.str0f89;
                    }
                }
                this.A0G.A00((AnonymousClass09N) null, RequestPermissionActivity.A02(A02(), R.string.str0f88, i2, 0, 0, true, false));
            } else {
                this.A0E.A07(C13680ns.A0f(this.A0D.A0F), 0);
                return true;
            }
        } else if (menuItem.getItemId() != R.id.menuitem_print) {
            return false;
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                A1A();
                return true;
            }
        }
        return true;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0300);
    }

    public void A13() {
        super.A13();
        this.A07.A00();
        this.A00 = null;
        this.A02 = null;
        this.A03 = null;
        this.A0D = null;
        this.A01 = null;
    }

    public void A18(Bundle bundle, View view) {
        String str;
        boolean z2;
        String[] A0U;
        String[] A0U2;
        C119395xh A002;
        String trim;
        this.A07 = this.A08.A04(view.getContext(), "india-upi-my-qr-fragment");
        this.A00 = C004601z.A0E(view, R.id.qrcode_view);
        this.A02 = C13680ns.A0J(view, R.id.contact_photo);
        this.A03 = C13680ns.A0L(view, R.id.scan_to_pay_info);
        this.A0D = (IndiaUpiDisplaySecureQrCodeView) C004601z.A0E(view, R.id.display_qr_code_view);
        this.A01 = C13680ns.A0J(view, R.id.bottom_icon);
        Bundle bundle2 = this.A05;
        C119395xh r9 = null;
        if (bundle2 != null) {
            str = bundle2.getString("extra_account_holder_name");
            z2 = bundle2.getBoolean("bottom_icon_visible", true);
        } else {
            str = null;
            z2 = true;
        }
        this.A01.setVisibility(C13680ns.A02(z2 ? 1 : 0));
        C110665ec r8 = (C110665ec) new C006602z((AnonymousClass04o) new IDxIFactoryShape5S0200000_3_I1(this, 5, this.A0C), (C001500q) this).A01(C110665ec.class);
        this.A0E = r8;
        IDxObserverShape118S0100000_3_I1 A072 = C110115dX.A07(this, 28);
        IDxObserverShape118S0100000_3_I1 A073 = C110115dX.A07(this, 27);
        AnonymousClass026 r2 = r8.A02;
        C001300o r0 = r8.A00;
        r2.A0A(r0, A072);
        AnonymousClass026 r5 = r8.A01;
        r5.A0A(r0, A073);
        AnonymousClass60V r3 = r8.A0C;
        synchronized (r3) {
            A0U = r3.A0U("signedQrCode", "signedQrCodeTs");
        }
        if (TextUtils.isEmpty(A0U[0])) {
            String A003 = AnonymousClass60V.A00(r3);
            if (TextUtils.isEmpty(A003)) {
                r2.A0B(new C116865s4(-1, -1));
            } else {
                if (TextUtils.isEmpty(str)) {
                    trim = r8.A0A.A00.getString("push_name", "");
                    C18310wU r22 = r8.A0E;
                    C228919r A042 = r8.A0G.A04("UPI");
                    AnonymousClass00B.A06(A042);
                    r22.A09((AnonymousClass1TV) null, A042, 1);
                } else {
                    trim = str.trim();
                }
                C119395xh A052 = r8.A05();
                A052.A09 = trim;
                A052.A0O = A003;
                A052.A04 = "01";
                r5.A0B(A052);
            }
        } else {
            String str2 = A0U[0];
            if (!(str2 == null || (A002 = C119395xh.A00(Uri.parse(str2), "SCANNED_QR_CODE")) == null)) {
                A002.A08 = str2;
                r9 = A002;
            }
            r5.A0B(r9);
        }
        this.A0D.setup(this.A0E);
        A1B(true);
        CopyableTextView copyableTextView = (CopyableTextView) C004601z.A0E(view, R.id.user_wa_vpa);
        String str3 = this.A0E.A05().A0O;
        copyableTextView.A02 = str3;
        copyableTextView.setText(C13690nt.A0c(this, str3, new Object[1], 0, R.string.str1b1e));
        C13680ns.A0L(view, R.id.user_account_name).setText(this.A0E.A05().A09);
        TextView A0L = C13680ns.A0L(view, R.id.user_wa_phone);
        String A062 = this.A05.A06();
        AnonymousClass00B.A06(A062);
        A0L.setText(C24561Gk.A00(C26071Mf.A00(), A062));
        this.A03.setText(C13690nt.A0c(this, this.A0E.A05().A09, new Object[1], 0, R.string.str148f));
        C110665ec r82 = this.A0E;
        AnonymousClass60V r1 = r82.A0C;
        synchronized (r1) {
            A0U2 = r1.A0U("signedQrCode", "signedQrCodeTs");
        }
        if (!r82.A05.A05(C15910s6.A0n) || (!TextUtils.isEmpty(A0U2[0]) && !TextUtils.isEmpty(A0U2[1]) && r82.A07.A00() - Long.parseLong(A0U2[1]) <= 259200000)) {
            C110665ec.A01(r82, 0, -1);
        } else {
            r82.A06(-1);
        }
        A0a(true);
    }

    public void A1A() {
        if (this.A0D.A09 != null && A0C() != null && this.A00 != null) {
            A1B(false);
            this.A00.setDrawingCacheEnabled(true);
            this.A00.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            View view = this.A00;
            view.layout(0, 0, view.getMeasuredWidth(), this.A00.getMeasuredHeight());
            this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            this.A00.buildDrawingCache(true);
            AnonymousClass1PG.A00(A0D(), Bitmap.createBitmap(this.A00.getDrawingCache()), this.A0E.A05().A09);
            this.A00.setDrawingCacheEnabled(false);
            A1B(true);
        }
    }

    public final void A1B(boolean z2) {
        C16040sK r0 = this.A05;
        r0.A0B();
        if (r0.A01 == null) {
            return;
        }
        if (z2) {
            AnonymousClass2Ao r2 = this.A07;
            C16040sK r02 = this.A05;
            r02.A0B();
            r2.A06(this.A02, r02.A01);
        } else if (this.A09.A0C() != 0) {
            C17160ud r22 = this.A06;
            ImageView imageView = this.A02;
            C16040sK r03 = this.A05;
            r03.A0B();
            r22.A06(imageView, r03.A01);
        }
    }
}
