package com.obwhatsapp.calling.views;

import X.AnonymousClass00B;
import X.AnonymousClass1ZC;
import X.C15860rz;
import X.C16000sG;
import X.C16080sP;
import X.C16260sj;
import X.C19490yW;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;

public class PermissionDialogFragment extends Hilt_PermissionDialogFragment {
    public int A00;
    public Dialog A01;
    public Button A02;
    public TextView A03;
    public AnonymousClass1ZC A04;
    public C16000sG A05;
    public C16080sP A06;
    public C16260sj A07;
    public C15860rz A08;
    public C19490yW A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public String[] A0D;

    public static PermissionDialogFragment A01(UserJid userJid, int i2, boolean z2, boolean z3, boolean z4) {
        PermissionDialogFragment permissionDialogFragment = new PermissionDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("jid", userJid.getRawString());
        bundle.putBoolean("microphone", z2);
        bundle.putBoolean("camera", z3);
        bundle.putBoolean("phone", z4);
        bundle.putInt("request_code", i2);
        permissionDialogFragment.A0T(bundle);
        return permissionDialogFragment;
    }

    public void A0j(int i2, String[] strArr, int[] iArr) {
        boolean z2 = false;
        if (i2 != 100) {
            AnonymousClass00B.A0B("Unknown request code", false);
            return;
        }
        StringBuilder sb = new StringBuilder("PermissionDialogFragment/onRequestPermissionsResult permissions: ");
        sb.append(Arrays.toString(strArr));
        sb.append(", grantResults: ");
        sb.append(Arrays.toString(iArr));
        Log.i(sb.toString());
        int length = iArr.length;
        boolean z3 = false;
        if (length > 0) {
            z3 = true;
            int i3 = 0;
            while (true) {
                if (iArr[i3] == 0) {
                    i3++;
                    if (i3 >= length) {
                        break;
                    }
                } else {
                    break;
                }
            }
            z2 = z3;
        } else {
            z2 = z3;
        }
        AnonymousClass1ZC r1 = this.A04;
        if (r1 != null) {
            int i4 = this.A00;
            if (z2) {
                r1.AUj(strArr, i4);
            } else {
                r1.AUi(i4);
            }
        }
    }

    public void A0k() {
        super.A0k();
        this.A04 = null;
    }

    public void A0q() {
        super.A0q();
        Window window = this.A01.getWindow();
        AnonymousClass00B.A06(window);
        window.setLayout(A03().getDisplayMetrics().widthPixels, A03().getDisplayMetrics().heightPixels);
    }

    public void A12() {
        super.A12();
        Dialog dialog = this.A01;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void A14() {
        super.A14();
        if (this.A0A) {
            String[] strArr = this.A0D;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (this.A07.A03(strArr[i2]) != 0) {
                        break;
                    }
                    i2++;
                } else {
                    this.A01.dismiss();
                    if (this.A04 != null) {
                        new Handler().post(new RunnableRunnableShape5S0100000_I0_4((Object) this, 12));
                    }
                }
            }
            this.A0A = false;
        }
    }

    public void A16(Context context) {
        super.A16(context);
        this.A04 = (AnonymousClass1ZC) context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01f2, code lost:
        if (r8 != false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        if (r5 != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0209, code lost:
        if (r0 == false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x020b, code lost:
        r2 = com.obwhatsapp.R.string.str11a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0217, code lost:
        if (r10.A0C != false) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x021a, code lost:
        r2 = com.obwhatsapp.R.string.str11a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A17(android.os.Bundle r11) {
        /*
            r10 = this;
            super.A17(r11)
            X.00l r7 = r10.A0D()
            android.os.Bundle r6 = r10.A04()
            java.lang.String r0 = "microphone"
            boolean r0 = r6.getBoolean(r0)
            r10.A0C = r0
            java.lang.String r0 = "camera"
            boolean r0 = r6.getBoolean(r0)
            r10.A0B = r0
            java.lang.String r0 = "phone"
            boolean r5 = r6.getBoolean(r0)
            java.lang.String r0 = "request_code"
            int r0 = r6.getInt(r0)
            r10.A00 = r0
            boolean r0 = r10.A0C
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0036
            boolean r0 = r10.A0B
            if (r0 != 0) goto L_0x0036
            r1 = 0
            if (r5 == 0) goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            java.lang.String r0 = "either microphone or camera or phone permission should be needed"
            X.AnonymousClass00B.A0B(r0, r1)
            boolean r9 = r10.A0B
            java.lang.String r8 = "android.permission.CAMERA"
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            if (r9 == 0) goto L_0x0274
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x0274
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            r0[r4] = r8
            r0[r3] = r2
            r10.A0D = r0
        L_0x0051:
            X.00l r1 = r10.A0D()
            android.app.Dialog r0 = new android.app.Dialog
            r0.<init>(r1)
            r10.A01 = r0
            r0.requestWindowFeature(r3)
            android.app.Dialog r0 = r10.A01
            android.view.Window r1 = r0.getWindow()
            X.AnonymousClass00B.A06(r1)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r4)
            r1.setBackgroundDrawable(r0)
            android.app.Dialog r0 = r10.A01
            r0.setCancelable(r4)
            android.app.Dialog r0 = r10.A01
            r0.setCanceledOnTouchOutside(r4)
            android.app.Dialog r1 = r10.A01
            r0 = 2131559565(0x7f0d048d, float:1.8744478E38)
            r1.setContentView(r0)
            boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x0230
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x0230
            android.app.Dialog r0 = r10.A01
            r2 = 2131365283(0x7f0a0da3, float:1.8350427E38)
            android.view.View r1 = r0.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131232303(0x7f08062f, float:1.8080711E38)
            r1.setImageResource(r0)
            android.app.Dialog r0 = r10.A01
            android.view.View r0 = r0.findViewById(r2)
            r0.setVisibility(r4)
            android.app.Dialog r1 = r10.A01
            r0 = 2131365284(0x7f0a0da4, float:1.8350429E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131232304(0x7f080630, float:1.8080713E38)
            r1.setImageResource(r0)
            android.app.Dialog r0 = r10.A01
            r2 = 2131365285(0x7f0a0da5, float:1.835043E38)
            android.view.View r1 = r0.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131232298(0x7f08062a, float:1.8080701E38)
            r1.setImageResource(r0)
            android.app.Dialog r0 = r10.A01
            android.view.View r0 = r0.findViewById(r2)
            r0.setVisibility(r4)
        L_0x00cf:
            android.app.Dialog r1 = r10.A01
            r0 = 2131362567(0x7f0a0307, float:1.8344918E38)
            android.view.View r2 = r1.findViewById(r0)
            r1 = 33
            com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0 r0 = new com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0
            r0.<init>(r10, r1)
            r2.setOnClickListener(r0)
            java.lang.String r0 = "jid"
            java.lang.String r0 = r6.getString(r0)
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.getNullable(r0)
            android.app.Dialog r1 = r10.A01
            r0 = 2131366502(0x7f0a1266, float:1.83529E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r10.A02 = r0
            android.app.Dialog r1 = r10.A01
            r0 = 2131365286(0x7f0a0da6, float:1.8350433E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.A03 = r0
            X.0yW r0 = r10.A09
            boolean r8 = r0.A00
            java.lang.String[] r0 = r10.A0D
            boolean r7 = com.obwhatsapp.RequestPermissionActivity.A0W(r7, r0)
            X.0rz r1 = r10.A08
            java.lang.String[] r0 = r10.A0D
            boolean r6 = com.obwhatsapp.RequestPermissionActivity.A0Z(r1, r0)
            if (r7 != 0) goto L_0x011d
            if (r6 != 0) goto L_0x011d
            r4 = 1
        L_0x011d:
            java.lang.String r0 = "PermissionDialogFragment/permissions needMicPermission="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            boolean r0 = r10.A0C
            r1.append(r0)
            java.lang.String r0 = ", needCameraPermission="
            r1.append(r0)
            boolean r0 = r10.A0B
            r1.append(r0)
            java.lang.String r0 = ", needPhonePermission="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", isScreenLocked="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", showRational="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", isFistTimeRequest="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", permanentDenial="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 == 0) goto L_0x0222
            X.0sP r1 = r10.A06
            X.0sG r0 = r10.A05
            X.0sH r0 = r0.A0A(r2)
            java.lang.String r6 = r1.A08(r0)
        L_0x0170:
            r5 = 0
            if (r4 == 0) goto L_0x01c0
            boolean r1 = r10.A0B
            boolean r0 = r10.A0C
            if (r8 == 0) goto L_0x01a8
            if (r1 == 0) goto L_0x01b7
            r2 = 2131890592(0x7f1211a0, float:1.941588E38)
            if (r0 == 0) goto L_0x0183
            r2 = 2131890659(0x7f1211e3, float:1.9416016E38)
        L_0x0183:
            android.widget.TextView r1 = r10.A03
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r5] = r6
            java.lang.String r0 = r10.A0K(r2, r0)
            r1.setText(r0)
            android.widget.Button r1 = r10.A02
            r0 = 2131890673(0x7f1211f1, float:1.9416044E38)
            r1.setText(r0)
        L_0x0198:
            android.widget.Button r1 = r10.A02
            com.whatsapp.util.ViewOnClickCListenerShape0S0110000_I0 r0 = new com.whatsapp.util.ViewOnClickCListenerShape0S0110000_I0
            r0.<init>(r10, r3, r4)
            r1.setOnClickListener(r0)
            android.app.Dialog r0 = r10.A01
            r0.show()
            return
        L_0x01a8:
            if (r1 == 0) goto L_0x01b3
            r2 = 2131890591(0x7f12119f, float:1.9415878E38)
            if (r0 == 0) goto L_0x0183
            r2 = 2131890658(0x7f1211e2, float:1.9416014E38)
            goto L_0x0183
        L_0x01b3:
            r2 = 2131890651(0x7f1211db, float:1.9416E38)
            goto L_0x01ba
        L_0x01b7:
            r2 = 2131890652(0x7f1211dc, float:1.9416002E38)
        L_0x01ba:
            if (r0 != 0) goto L_0x0183
            r2 = 2131890665(0x7f1211e9, float:1.9416028E38)
            goto L_0x0183
        L_0x01c0:
            int r2 = r10.A00
            if (r2 == 0) goto L_0x01fe
            if (r2 == r3) goto L_0x01f5
            r0 = 2
            if (r2 == r0) goto L_0x01f2
            r0 = 3
            if (r2 == r0) goto L_0x01ee
            java.lang.String r1 = "UNKNOWN REQUEST CODE "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A08(r0)
        L_0x01dd:
            r2 = 2131890661(0x7f1211e5, float:1.941602E38)
        L_0x01e0:
            android.widget.TextView r1 = r10.A03
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r5] = r6
            java.lang.String r0 = r10.A0K(r2, r0)
            r1.setText(r0)
            goto L_0x0198
        L_0x01ee:
            r2 = 2131890666(0x7f1211ea, float:1.941603E38)
            goto L_0x01e0
        L_0x01f2:
            if (r8 == 0) goto L_0x021a
            goto L_0x020b
        L_0x01f5:
            r2 = 2131890596(0x7f1211a4, float:1.9415888E38)
            if (r8 == 0) goto L_0x01e0
            r2 = 2131890595(0x7f1211a3, float:1.9415886E38)
            goto L_0x01e0
        L_0x01fe:
            boolean r0 = r10.A0B
            if (r8 == 0) goto L_0x0213
            if (r0 == 0) goto L_0x020f
            boolean r0 = r10.A0C
            r2 = 2131890660(0x7f1211e4, float:1.9416018E38)
            if (r0 != 0) goto L_0x01e0
        L_0x020b:
            r2 = 2131890593(0x7f1211a1, float:1.9415882E38)
            goto L_0x01e0
        L_0x020f:
            r2 = 2131890653(0x7f1211dd, float:1.9416004E38)
            goto L_0x01e0
        L_0x0213:
            if (r0 == 0) goto L_0x021e
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x021a
            goto L_0x01dd
        L_0x021a:
            r2 = 2131890594(0x7f1211a2, float:1.9415884E38)
            goto L_0x01e0
        L_0x021e:
            r2 = 2131890654(0x7f1211de, float:1.9416006E38)
            goto L_0x01e0
        L_0x0222:
            java.lang.String r0 = "PermissionDialogFragment/permissions/jid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131892362(0x7f12188a, float:1.941947E38)
            java.lang.String r6 = r10.A0J(r0)
            goto L_0x0170
        L_0x0230:
            android.app.Dialog r1 = r10.A01
            r0 = 2131365284(0x7f0a0da4, float:1.8350429E38)
            android.view.View r8 = r1.findViewById(r0)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            android.content.res.Resources r2 = r10.A03()
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x0269
            r1 = 2131232303(0x7f08062f, float:1.8080711E38)
        L_0x0246:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r1)
            r8.setImageDrawable(r0)
            android.app.Dialog r1 = r10.A01
            r0 = 2131365283(0x7f0a0da3, float:1.8350427E38)
            android.view.View r0 = r1.findViewById(r0)
            r2 = 8
            r0.setVisibility(r2)
            android.app.Dialog r1 = r10.A01
            r0 = 2131365285(0x7f0a0da5, float:1.835043E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setVisibility(r2)
            goto L_0x00cf
        L_0x0269:
            boolean r0 = r10.A0B
            r1 = 2131232297(0x7f080629, float:1.80807E38)
            if (r0 == 0) goto L_0x0246
            r1 = 2131232298(0x7f08062a, float:1.8080701E38)
            goto L_0x0246
        L_0x0274:
            java.lang.String[] r1 = new java.lang.String[r3]
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x0281
            r8 = r2
        L_0x027b:
            r1[r4] = r8
            r10.A0D = r1
            goto L_0x0051
        L_0x0281:
            if (r9 != 0) goto L_0x027b
            java.lang.String r8 = "android.permission.READ_PHONE_STATE"
            goto L_0x027b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.views.PermissionDialogFragment.A17(android.os.Bundle):void");
    }
}
