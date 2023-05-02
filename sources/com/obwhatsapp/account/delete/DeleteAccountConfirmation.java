package com.obwhatsapp.account.delete;

import X.AnonymousClass01D;
import X.AnonymousClass01J;
import X.AnonymousClass124;
import X.AnonymousClass14L;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14750ph;
import X.C15860rz;
import X.C15900s5;
import X.C16150sX;
import X.C16180sb;
import X.C17270uo;
import X.C18090w8;
import X.C18260wP;
import X.C19010xc;
import X.C19480yV;
import X.C19670yo;
import X.C19950zG;
import X.C32241fu;
import X.C49132Rg;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import com.facebook.redex.IDxDListenerShape191S0100000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class DeleteAccountConfirmation extends C14530pL {
    public int A00;
    public Handler A01;
    public View A02;
    public ScrollView A03;
    public C19480yV A04;
    public C19010xc A05;
    public C19670yo A06;
    public AnonymousClass14L A07;
    public AnonymousClass124 A08;
    public C18090w8 A09;
    public AnonymousClass01D A0A;
    public boolean A0B;

    public DeleteAccountConfirmation() {
        this(0);
    }

    public DeleteAccountConfirmation(int i2) {
        this.A0B = false;
        C13680ns.A1G(this, 6);
    }

    public void A1q() {
        if (!this.A0B) {
            this.A0B = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r2 = A1T.A1s;
            this.A05 = C16150sX.A1B(r2);
            this.A0C = C16150sX.A0k(r2);
            this.A05 = C16150sX.A02(r2);
            this.A03 = C16150sX.A00(r2);
            this.A04 = (C16180sb) r2.A8b.get();
            this.A0B = C16150sX.A0i(r2);
            this.A06 = (C15900s5) r2.ALm.get();
            this.A08 = C16150sX.A0T(r2);
            this.A0D = (C19950zG) r2.AQV.get();
            AnonymousClass01J r1 = r2.AQh;
            this.A09 = (C15860rz) r1.get();
            this.A07 = (C18260wP) r2.A4p.get();
            C14530pL.A0b(A1T, r2, this, C14550pN.A0v(r2));
            this.A08 = (AnonymousClass124) r2.ALe.get();
            this.A05 = (C19010xc) r2.A6Y.get();
            this.A07 = (AnonymousClass14L) r2.A8Y.get();
            this.A0A = C17270uo.A00(r1);
            this.A09 = C16150sX.A10(r2);
            this.A06 = (C19670yo) r2.AB4.get();
        }
    }

    public final void A35() {
        this.A02.setElevation(this.A03.canScrollVertically(1) ? (float) this.A00 : 0.0f);
    }

    public final void A36() {
        this.A03.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape191S0100000_2_I1(this, 0));
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            A36();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            X.0sC r1 = r7.A09
            X.3Lu r0 = new X.3Lu
            r0.<init>(r7, r1)
            r7.A01 = r0
            X.4uz r0 = new X.4uz
            r0.<init>(r7)
            r7.A04 = r0
            r0 = 2131891516(0x7f12153c, float:1.9417754E38)
            r7.setTitle(r0)
            X.02i r0 = r7.x()
            r6 = 1
            if (r0 == 0) goto L_0x0023
            r0.A0N(r6)
        L_0x0023:
            r0 = 2131558929(0x7f0d0211, float:1.8743188E38)
            r7.setContentView((int) r0)
            r0 = 2131365901(0x7f0a100d, float:1.835168E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r7.A03 = r0
            r0 = 2131362312(0x7f0a0208, float:1.8344401E38)
            android.view.View r0 = r7.findViewById(r0)
            r7.A02 = r0
            r0 = 2131363124(0x7f0a0534, float:1.8346048E38)
            android.view.View r1 = r7.findViewById(r0)
            r0 = 11
            X.C13680ns.A1A(r1, r7, r0)
            r0 = 2131363117(0x7f0a052d, float:1.8346034E38)
            android.widget.TextView r5 = X.C13680ns.A0N(r7, r0)
            r0 = 2131891519(0x7f12153f, float:1.941776E38)
            java.lang.String r4 = r7.getString(r0)
            android.content.res.Resources r0 = r7.getResources()
            r3 = 2131166963(0x7f0706f3, float:1.7948186E38)
            int r0 = r0.getDimensionPixelSize(r3)
            r7.A00 = r0
            X.0yo r0 = r7.A06
            boolean r0 = r0.A0A()
            r2 = 0
            if (r0 == 0) goto L_0x00b4
            X.0rz r0 = r7.A09
            java.lang.String r0 = r0.A0M()
            if (r0 == 0) goto L_0x00b4
            X.0w8 r0 = r7.A09
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x00b4
            r1 = 2131891521(0x7f121541, float:1.9417764E38)
        L_0x0080:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r4 = X.C13680ns.A0d(r7, r4, r0, r2, r1)
        L_0x0086:
            r5.setText(r4)
            X.0xc r0 = r7.A05
            X.0yV r1 = r7.A04
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A0x
            r0.add(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x00b3
            android.content.res.Resources r0 = r7.getResources()
            int r0 = r0.getDimensionPixelSize(r3)
            r7.A00 = r0
            android.widget.ScrollView r0 = r7.A03
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            com.facebook.redex.IDxCListenerShape237S0100000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape237S0100000_2_I1
            r0.<init>(r7, r2)
            r1.addOnScrollChangedListener(r0)
            r7.A36()
        L_0x00b3:
            return
        L_0x00b4:
            X.0yo r0 = r7.A06
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x00c8
            X.0rz r0 = r7.A09
            java.lang.String r0 = r0.A0M()
            if (r0 == 0) goto L_0x00c8
            r1 = 2131891520(0x7f121540, float:1.9417762E38)
            goto L_0x0080
        L_0x00c8:
            X.0w8 r0 = r7.A09
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0086
            r1 = 2131891522(0x7f121542, float:1.9417766E38)
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.account.delete.DeleteAccountConfirmation.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i2) {
        C32241fu r3;
        int i3;
        int i4;
        if (i2 != 1) {
            if (i2 == 2) {
                r3 = C32241fu.A00(this);
                r3.A06(C13680ns.A0d(this, getString(R.string.str053b), new Object[1], 0, R.string.str1372));
                i3 = R.string.str0e87;
                i4 = 10;
            } else if (i2 != 3) {
                return super.onCreateDialog(i2);
            } else {
                r3 = C32241fu.A00(this);
                r3.A01(R.string.str066d);
                i3 = R.string.str0e87;
                i4 = 11;
            }
            C13680ns.A1H(r3, this, i4, i3);
            return r3.create();
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(getString(R.string.str1c4d));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public void onDestroy() {
        super.onDestroy();
        C19010xc r0 = this.A05;
        r0.A0x.remove(this.A04);
        this.A01.removeMessages(0);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        int A002 = this.A09.A00();
        if (!this.A09.A01() && A002 != 6) {
            Log.e(C13680ns.A0c(A002, "deleteaccountconfirm/wrong-state bounce to main "));
            startActivity(C14750ph.A04(this));
            finish();
        }
    }
}
