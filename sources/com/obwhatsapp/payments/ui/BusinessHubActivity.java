package com.obwhatsapp.payments.ui;

import X.AnonymousClass00T;
import X.AnonymousClass028;
import X.AnonymousClass1DV;
import X.AnonymousClass1N4;
import X.AnonymousClass2EA;
import X.AnonymousClass2SR;
import X.AnonymousClass5EU;
import X.AnonymousClass5xI;
import X.C005402i;
import X.C111455gD;
import X.C13680ns;
import X.C13690nt;
import X.C14750ph;
import X.C15220qW;
import X.C18290wS;
import X.C18450wi;
import X.C30671cl;
import X.C39901tF;
import X.C39931tI;
import X.C49402Ta;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.facebook.redex.IDxObserverShape116S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.viewmodel.BusinessHubViewModel;

public final class BusinessHubActivity extends C111455gD {
    public ViewGroup A00;
    public ViewGroup A01;
    public ImageView A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public C18290wS A0A;
    public AnonymousClass1N4 A0B;
    public final C15220qW A0C = new AnonymousClass1DV(new AnonymousClass5EU(this));

    public static /* synthetic */ void A02(C49402Ta r5, BusinessHubActivity businessHubActivity) {
        C30671cl r0;
        C39901tF r1;
        C39931tI r12;
        int i2 = 110;
        if (!TextUtils.isEmpty(r5.A01())) {
            i2 = 109;
        }
        C15220qW r13 = businessHubActivity.A0C;
        ((BusinessHubViewModel) r13.getValue()).A05(i2);
        r13.getValue();
        String A012 = r5.A01();
        if (A012 != null || ((r0 = r5.A00) != null && (r1 = r0.A08) != null && (r1 instanceof C39931tI) && (r12 = (C39931tI) r1) != null && (A012 = r12.A0A) != null)) {
            businessHubActivity.startActivity(C14750ph.A0k(businessHubActivity, A012, (String) null, false, false));
        }
    }

    public static /* synthetic */ void A03(C49402Ta r4, BusinessHubActivity businessHubActivity) {
        BusinessHubViewModel businessHubViewModel = (BusinessHubViewModel) businessHubActivity.A0C.getValue();
        if (C18450wi.A0R(r4.A00(), "EXTERNALLY_DISABLED")) {
            businessHubViewModel.A08.Acl(new RunnableRunnableShape9S0200000_I0_7(r4, 26, businessHubViewModel));
            return;
        }
        ((AnonymousClass028) businessHubViewModel.A0A.getValue()).A0B(AnonymousClass5xI.A00((Object) null));
        businessHubViewModel.A08.Acl(new RunnableRunnableShape12S0100000_I0_11((Object) businessHubViewModel, 7));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0232, code lost:
        r0 = "removeAccountRow";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r6 = r9.getString(r1);
        X.C18450wi.A0E(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        if (r6.equals(r9.getString(com.obwhatsapp.R.string.str0d26)) != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r1 = r6.equals(r9.getString(com.obwhatsapp.R.string.str0d25));
        r0 = com.obwhatsapp.R.color.color0660;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        if (r1 == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        r0 = com.obwhatsapp.R.color.color0696;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r7 = new android.text.SpannableString(r6);
        r7.setSpan(X.C13690nt.A0G(r9, r0), 0, r6.length(), 33);
        r0 = r9.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bb, code lost:
        if (r0 == null) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
        r6 = android.widget.TextView.BufferType.SPANNABLE;
        r0.setText(r7, r6);
        r4.getValue();
        r1 = r8.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cd, code lost:
        switch(r1.hashCode()) {
            case -2130746961: goto L_0x01b4;
            case 35394935: goto L_0x01be;
            case 479965251: goto L_0x01c8;
            case 1925346054: goto L_0x01d2;
            default: goto L_0x00d0;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d0, code lost:
        r1 = com.obwhatsapp.R.string.str0d27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d3, code lost:
        r1 = r9.getString(r1);
        X.C18450wi.A0E(r1);
        r7 = new android.text.SpannableString(r1);
        r7.setSpan(X.C13690nt.A0G(r9, com.obwhatsapp.R.color.color06c5), 0, r1.length(), 33);
        r0 = r9.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f1, code lost:
        if (r0 == null) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f3, code lost:
        r0.setText(r7, r6);
        r0 = r9.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f8, code lost:
        if (r0 == null) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fa, code lost:
        r0.setVisibility(0);
        r5 = r9.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ff, code lost:
        if (r5 == null) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0101, code lost:
        r4.getValue();
        r0 = android.text.TextUtils.isEmpty(r8.A01());
        r4 = com.obwhatsapp.R.string.str09cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0110, code lost:
        if (r0 != false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0112, code lost:
        r4 = com.obwhatsapp.R.string.str09cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0115, code lost:
        r0 = X.C13680ns.A0d(r9, r8.A02(), new java.lang.Object[1], 0, r4);
        X.C18450wi.A0B(r0);
        r5.setText(r0);
        r1 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0127, code lost:
        if (r1 == null) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0129, code lost:
        r1.setOnClickListener(new com.facebook.redex.IDxCListenerShape32S0200000_2_I1(r9, 0, r8));
        r1 = r2.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0134, code lost:
        if (r1 == null) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0136, code lost:
        r4 = android.graphics.BitmapFactory.decodeByteArray(r1, 0, r1.length);
        r3 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013d, code lost:
        if (r3 == null) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013f, code lost:
        r1 = r3.getWidth();
        r0 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0145, code lost:
        if (r0 == null) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0147, code lost:
        r3.setImageBitmap(android.graphics.Bitmap.createScaledBitmap(r4, r1, r0.getHeight(), false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0152, code lost:
        r3 = r9.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0154, code lost:
        if (r3 == null) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0156, code lost:
        r0 = r2.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0158, code lost:
        if (r0 == null) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015a, code lost:
        r1 = ((X.C39931tI) r0).A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015e, code lost:
        if (r1 == null) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0164, code lost:
        if (r1.isEmpty() != false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0166, code lost:
        r1 = ((X.C30671cl) r1.get(0)).A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0170, code lost:
        if ((r1 instanceof X.C39911tG) == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0172, code lost:
        r1 = (X.C39911tG) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017a, code lost:
        if (X.C39841t9.A03(r1.A01) != false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017c, code lost:
        r0 = (java.lang.String) r1.A01.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0182, code lost:
        r3.setText(r0);
        r1 = r9.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0187, code lost:
        if (r1 == null) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0189, code lost:
        r1.setVisibility(8);
        r2 = r8.A02();
        X.C18450wi.A0B(r2);
        r1 = r9.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0197, code lost:
        if (r1 == null) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0199, code lost:
        X.C13690nt.A0s(r9, r1, com.obwhatsapp.R.string.str13e4);
        r1 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a1, code lost:
        if (r1 == null) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a3, code lost:
        r1.setOnClickListener(new X.C93994k9(r8, r9, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ac, code lost:
        r0 = r9.getString(com.obwhatsapp.R.string.str188a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b4, code lost:
        r0 = r1.equals("INITED");
        r1 = com.obwhatsapp.R.string.str0d29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01be, code lost:
        r0 = r1.equals("PENDING");
        r1 = com.obwhatsapp.R.string.str0d2b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c8, code lost:
        r0 = r1.equals("EXTERNALLY_DISABLED");
        r1 = com.obwhatsapp.R.string.str19da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d2, code lost:
        r0 = r1.equals("ACTIVE");
        r1 = com.obwhatsapp.R.string.str0d24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01db, code lost:
        if (r0 != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01fe, code lost:
        r0 = r1.equals(r0);
        r1 = com.obwhatsapp.R.string.str0d25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x020f, code lost:
        if (r0 != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0213, code lost:
        r0 = "removeAccount";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0216, code lost:
        r0 = "payoutMethodAccountStatus";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0219, code lost:
        r0 = "payoutMethodAccountName";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x021c, code lost:
        r0 = "payoutMethodAccountIcon";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021f, code lost:
        r0 = "viewDashboardRow";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0223, code lost:
        r0 = "paymentPartnerDashboard";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0226, code lost:
        r0 = "paymentPartnerAccountStatusInfo";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0229, code lost:
        r0 = "paymentPartnerAccountStatus";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A09(X.C49402Ta r8, com.obwhatsapp.payments.ui.BusinessHubActivity r9) {
        /*
            if (r8 == 0) goto L_0x0239
            X.1cl r2 = r8.A00
            if (r2 == 0) goto L_0x0239
            X.02i r1 = r9.x()
            if (r1 == 0) goto L_0x0013
            java.lang.String r0 = r8.A02()
            r1.A0J(r0)
        L_0x0013:
            r3 = 0
            android.content.Intent r0 = r9.getIntent()
            r5 = 0
            if (r0 == 0) goto L_0x0028
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r0 = "referral_screen"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 == 0) goto L_0x0028
            r5 = r0
        L_0x0028:
            X.2St[] r1 = new X.AnonymousClass2St[r3]
            r0 = 0
            X.2St r3 = new X.2St
            r3.<init>(r0, r1)
            java.lang.String r1 = r8.A00()
            java.lang.String r0 = "account_status"
            r3.A01(r0, r1)
            java.lang.String r1 = r8.A02()
            java.lang.String r0 = "account_psp_name"
            r3.A01(r0, r1)
            X.0qW r4 = r9.A0C
            java.lang.Object r0 = r4.getValue()
            com.obwhatsapp.payments.ui.viewmodel.BusinessHubViewModel r0 = (com.obwhatsapp.payments.ui.viewmodel.BusinessHubViewModel) r0
            X.69a r1 = r0.A06
            java.lang.String r0 = "business_hub"
            X.AnonymousClass5xP.A02(r3, r1, r0, r5)
            r3 = 0
            X.1tF r1 = r2.A08
            if (r1 == 0) goto L_0x006f
            boolean r0 = r1 instanceof X.C39931tI
            if (r0 == 0) goto L_0x006f
            X.1tI r1 = (X.C39931tI) r1
            if (r1 == 0) goto L_0x006f
            java.lang.String r5 = r1.A07
            if (r5 == 0) goto L_0x006f
            X.1N4 r0 = r9.A0B
            if (r0 == 0) goto L_0x022f
            android.widget.ImageView r1 = r9.A02
            if (r1 == 0) goto L_0x022c
            X.1qk r0 = r0.A04
            r0.A01(r1, r5)
        L_0x006f:
            r4.getValue()
            java.lang.String r1 = r8.A00()
            int r0 = r1.hashCode()
            switch(r0) {
                case -2130746961: goto L_0x01df;
                case -1810585926: goto L_0x01e9;
                case -1714866505: goto L_0x01ec;
                case 35394935: goto L_0x01ef;
                case 479965251: goto L_0x01f9;
                case 1339011704: goto L_0x01fc;
                case 1925346054: goto L_0x0206;
                default: goto L_0x007d;
            }
        L_0x007d:
            r1 = 2131889446(0x7f120d26, float:1.9413556E38)
        L_0x0080:
            java.lang.String r6 = r9.getString(r1)
            X.C18450wi.A0E(r6)
            r0 = 2131889446(0x7f120d26, float:1.9413556E38)
            java.lang.String r0 = r9.getString(r0)
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x00a4
            r0 = 2131889445(0x7f120d25, float:1.9413554E38)
            java.lang.String r0 = r9.getString(r0)
            boolean r1 = r6.equals(r0)
            r0 = 2131101280(0x7f060660, float:1.7814965E38)
            if (r1 == 0) goto L_0x00a7
        L_0x00a4:
            r0 = 2131101334(0x7f060696, float:1.7815075E38)
        L_0x00a7:
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r6)
            android.text.style.ForegroundColorSpan r5 = X.C13690nt.A0G(r9, r0)
            int r1 = r6.length()
            r0 = 33
            r7.setSpan(r5, r3, r1, r0)
            android.widget.TextView r0 = r9.A04
            if (r0 == 0) goto L_0x0229
            android.widget.TextView$BufferType r6 = android.widget.TextView.BufferType.SPANNABLE
            r0.setText(r7, r6)
            r4.getValue()
            java.lang.String r1 = r8.A00()
            int r0 = r1.hashCode()
            switch(r0) {
                case -2130746961: goto L_0x01b4;
                case 35394935: goto L_0x01be;
                case 479965251: goto L_0x01c8;
                case 1925346054: goto L_0x01d2;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            r1 = 2131889447(0x7f120d27, float:1.9413558E38)
        L_0x00d3:
            java.lang.String r1 = r9.getString(r1)
            X.C18450wi.A0E(r1)
            android.text.SpannableString r7 = new android.text.SpannableString
            r7.<init>(r1)
            r0 = 2131101381(0x7f0606c5, float:1.781517E38)
            android.text.style.ForegroundColorSpan r5 = X.C13690nt.A0G(r9, r0)
            int r1 = r1.length()
            r0 = 33
            r7.setSpan(r5, r3, r1, r0)
            android.widget.TextView r0 = r9.A05
            if (r0 == 0) goto L_0x0226
            r0.setText(r7, r6)
            android.widget.TextView r0 = r9.A05
            if (r0 == 0) goto L_0x0226
            r0.setVisibility(r3)
            android.widget.TextView r5 = r9.A06
            if (r5 == 0) goto L_0x0223
            r4.getValue()
            r1 = 1
            java.lang.String r0 = r8.A01()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r4 = 2131888588(0x7f1209cc, float:1.9411816E38)
            if (r0 != 0) goto L_0x0115
            r4 = 2131888587(0x7f1209cb, float:1.9411814E38)
        L_0x0115:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r8.A02()
            java.lang.String r0 = X.C13680ns.A0d(r9, r0, r1, r3, r4)
            X.C18450wi.A0B(r0)
            r5.setText(r0)
            android.view.ViewGroup r1 = r9.A01
            if (r1 == 0) goto L_0x021f
            r5 = 0
            com.facebook.redex.IDxCListenerShape32S0200000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape32S0200000_2_I1
            r0.<init>(r9, r3, r8)
            r1.setOnClickListener(r0)
            byte[] r1 = r2.A0D
            if (r1 == 0) goto L_0x0152
            int r0 = r1.length
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeByteArray(r1, r3, r0)
            android.widget.ImageView r3 = r9.A03
            if (r3 == 0) goto L_0x021c
            int r1 = r3.getWidth()
            android.widget.ImageView r0 = r9.A03
            if (r0 == 0) goto L_0x021c
            int r0 = r0.getHeight()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r4, r1, r0, r5)
            r3.setImageBitmap(r0)
        L_0x0152:
            android.widget.TextView r3 = r9.A07
            if (r3 == 0) goto L_0x0219
            X.1tF r0 = r2.A08
            if (r0 == 0) goto L_0x01ac
            X.1tI r0 = (X.C39931tI) r0
            java.util.List r1 = r0.A0C
            if (r1 == 0) goto L_0x01ac
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01ac
            java.lang.Object r0 = r1.get(r5)
            X.1cl r0 = (X.C30671cl) r0
            X.1tF r1 = r0.A08
            boolean r0 = r1 instanceof X.C39911tG
            if (r0 == 0) goto L_0x01ac
            X.1tG r1 = (X.C39911tG) r1
            X.1lh r0 = r1.A01
            boolean r0 = X.C39841t9.A03(r0)
            if (r0 != 0) goto L_0x01ac
            X.1lh r0 = r1.A01
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
        L_0x0182:
            r3.setText(r0)
            android.widget.TextView r1 = r9.A08
            if (r1 == 0) goto L_0x0216
            r0 = 8
            r1.setVisibility(r0)
            java.lang.String r2 = r8.A02()
            X.C18450wi.A0B(r2)
            android.widget.TextView r1 = r9.A09
            if (r1 == 0) goto L_0x0213
            r0 = 2131891172(0x7f1213e4, float:1.9417057E38)
            X.C13690nt.A0s(r9, r1, r0)
            android.view.ViewGroup r1 = r9.A00
            if (r1 == 0) goto L_0x0232
            X.4k9 r0 = new X.4k9
            r0.<init>(r8, r9, r2)
            r1.setOnClickListener(r0)
            return
        L_0x01ac:
            r0 = 2131892362(0x7f12188a, float:1.941947E38)
            java.lang.String r0 = r9.getString(r0)
            goto L_0x0182
        L_0x01b4:
            java.lang.String r0 = "INITED"
            boolean r0 = r1.equals(r0)
            r1 = 2131889449(0x7f120d29, float:1.9413562E38)
            goto L_0x01db
        L_0x01be:
            java.lang.String r0 = "PENDING"
            boolean r0 = r1.equals(r0)
            r1 = 2131889451(0x7f120d2b, float:1.9413566E38)
            goto L_0x01db
        L_0x01c8:
            java.lang.String r0 = "EXTERNALLY_DISABLED"
            boolean r0 = r1.equals(r0)
            r1 = 2131892698(0x7f1219da, float:1.9420152E38)
            goto L_0x01db
        L_0x01d2:
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r1.equals(r0)
            r1 = 2131889444(0x7f120d24, float:1.9413552E38)
        L_0x01db:
            if (r0 != 0) goto L_0x00d3
            goto L_0x00d0
        L_0x01df:
            java.lang.String r0 = "INITED"
            boolean r0 = r1.equals(r0)
            r1 = 2131889448(0x7f120d28, float:1.941356E38)
            goto L_0x020f
        L_0x01e9:
            java.lang.String r0 = "INTEGRITY_BLOCKED"
            goto L_0x01fe
        L_0x01ec:
            java.lang.String r0 = "SOFT_BLOCKED"
            goto L_0x01fe
        L_0x01ef:
            java.lang.String r0 = "PENDING"
            boolean r0 = r1.equals(r0)
            r1 = 2131889450(0x7f120d2a, float:1.9413564E38)
            goto L_0x020f
        L_0x01f9:
            java.lang.String r0 = "EXTERNALLY_DISABLED"
            goto L_0x01fe
        L_0x01fc:
            java.lang.String r0 = "HARD_BLOCKED"
        L_0x01fe:
            boolean r0 = r1.equals(r0)
            r1 = 2131889445(0x7f120d25, float:1.9413554E38)
            goto L_0x020f
        L_0x0206:
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r1.equals(r0)
            r1 = 2131889443(0x7f120d23, float:1.941355E38)
        L_0x020f:
            if (r0 != 0) goto L_0x0080
            goto L_0x007d
        L_0x0213:
            java.lang.String r0 = "removeAccount"
            goto L_0x0234
        L_0x0216:
            java.lang.String r0 = "payoutMethodAccountStatus"
            goto L_0x0234
        L_0x0219:
            java.lang.String r0 = "payoutMethodAccountName"
            goto L_0x0234
        L_0x021c:
            java.lang.String r0 = "payoutMethodAccountIcon"
            goto L_0x0234
        L_0x021f:
            java.lang.String r0 = "viewDashboardRow"
            goto L_0x0234
        L_0x0223:
            java.lang.String r0 = "paymentPartnerDashboard"
            goto L_0x0234
        L_0x0226:
            java.lang.String r0 = "paymentPartnerAccountStatusInfo"
            goto L_0x0234
        L_0x0229:
            java.lang.String r0 = "paymentPartnerAccountStatus"
            goto L_0x0234
        L_0x022c:
            java.lang.String r0 = "paymentPartnerAccountIcon"
            goto L_0x0234
        L_0x022f:
            java.lang.String r0 = "paymentMerchantImageLoader"
            goto L_0x0234
        L_0x0232:
            java.lang.String r0 = "removeAccountRow"
        L_0x0234:
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        L_0x0239:
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.BusinessHubActivity.A09(X.2Ta, com.obwhatsapp.payments.ui.BusinessHubActivity):void");
    }

    public static /* synthetic */ void A0A(C49402Ta r8, BusinessHubActivity businessHubActivity, String str) {
        String A0d;
        C15220qW r2 = businessHubActivity.A0C;
        ((BusinessHubViewModel) r2.getValue()).A05(AnonymousClass2EA.A03);
        String A0d2 = C13680ns.A0d(businessHubActivity, str, new Object[1], 0, R.string.str13f2);
        C18450wi.A0B(A0d2);
        if (C18450wi.A0R(r8.A00(), "EXTERNALLY_DISABLED")) {
            A0d = businessHubActivity.getString(R.string.str13fb);
        } else {
            boolean A0R = C18450wi.A0R(r8.A00(), "INITED");
            int i2 = R.string.str13f1;
            if (A0R) {
                i2 = R.string.str13f3;
            }
            A0d = C13680ns.A0d(businessHubActivity, str, new Object[1], 0, i2);
        }
        C18450wi.A0E(A0d);
        int ABm = ((BusinessHubViewModel) r2.getValue()).A05.A03().ABm();
        String string = businessHubActivity.getString(R.string.str13e4);
        IDxCListenerShape29S0200000_2_I1 iDxCListenerShape29S0200000_2_I1 = new IDxCListenerShape29S0200000_2_I1(r8, 27, businessHubActivity);
        String string2 = businessHubActivity.getString(R.string.str0394);
        AlertDialog.Builder builder = new AlertDialog.Builder(businessHubActivity, ABm);
        builder.setMessage(A0d);
        builder.setTitle(A0d2);
        if (string != null) {
            builder.setPositiveButton(string, iDxCListenerShape29S0200000_2_I1);
        }
        if (string2 != null) {
            builder.setNegativeButton(string2, (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }

    public static /* synthetic */ void A0T(BusinessHubActivity businessHubActivity) {
        ((BusinessHubViewModel) businessHubActivity.A0C.getValue()).A05(107);
        C18290wS r0 = businessHubActivity.A0A;
        if (r0 != null) {
            Intent ABs = r0.A03().ABs(businessHubActivity, "business", (String) null);
            if (ABs != null) {
                businessHubActivity.startActivity(ABs);
                return;
            }
            return;
        }
        throw C18450wi.A03("paymentsManager");
    }

    public static /* synthetic */ void A0p(BusinessHubActivity businessHubActivity, AnonymousClass5xI r6) {
        String str;
        int ABm = ((BusinessHubViewModel) businessHubActivity.A0C.getValue()).A05.A03().ABm();
        if (r6 != null) {
            int i2 = r6.A00;
            if (i2 == 0) {
                businessHubActivity.Ac1();
                businessHubActivity.finish();
            } else if (i2 != 1) {
                businessHubActivity.Afq(R.string.str13db);
            } else {
                businessHubActivity.Ac1();
                Throwable th = r6.A02;
                if (th == null || (str = th.getMessage()) == null) {
                    str = C18450wi.A04(businessHubActivity, R.string.str1031);
                }
                String string = businessHubActivity.getString(R.string.str0e87);
                AlertDialog.Builder builder = new AlertDialog.Builder(businessHubActivity, ABm);
                builder.setMessage(str);
                if (string != null) {
                    builder.setPositiveButton(string, (DialogInterface.OnClickListener) null);
                }
                builder.create().show();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout00b5);
        Aem((Toolbar) findViewById(R.id.pay_service_toolbar));
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0J((CharSequence) null);
            x2.A0N(true);
            int A002 = AnonymousClass00T.A00(this, R.color.color0226);
            Drawable A042 = AnonymousClass00T.A04(this, R.drawable.ic_close);
            if (A042 != null) {
                x2.A0E(AnonymousClass2SR.A06(A042, A002));
            }
        }
        View findViewById = findViewById(R.id.payment_partner_container);
        ImageView imageView = (ImageView) C18450wi.A00(findViewById, R.id.payment_business_icon);
        C18450wi.A0H(imageView, 0);
        this.A02 = imageView;
        TextView textView = (TextView) C18450wi.A00(findViewById, R.id.business_account_name);
        C18450wi.A0H(textView, 0);
        this.A04 = textView;
        TextView textView2 = (TextView) C18450wi.A00(findViewById, R.id.business_account_status);
        C18450wi.A0H(textView2, 0);
        this.A05 = textView2;
        ViewGroup viewGroup = (ViewGroup) C18450wi.A00(findViewById, R.id.view_dashboard_row);
        C18450wi.A0H(viewGroup, 0);
        this.A01 = viewGroup;
        TextView textView3 = (TextView) C18450wi.A00(findViewById, R.id.payment_partner_dashboard);
        C18450wi.A0H(textView3, 0);
        this.A06 = textView3;
        View findViewById2 = findViewById(R.id.payout_method_container);
        ImageView imageView2 = (ImageView) C18450wi.A00(findViewById2, R.id.payout_bank_icon);
        C18450wi.A0H(imageView2, 0);
        this.A03 = imageView2;
        TextView textView4 = (TextView) C18450wi.A00(findViewById2, R.id.payout_bank_name);
        C18450wi.A0H(textView4, 0);
        this.A07 = textView4;
        TextView textView5 = (TextView) C18450wi.A00(findViewById2, R.id.payout_bank_status);
        C18450wi.A0H(textView5, 0);
        this.A08 = textView5;
        C18450wi.A00(findViewById2, R.id.warning_container).setVisibility(8);
        View A003 = C18450wi.A00(findViewById(R.id.partner_support_container), R.id.request_dyi_report_action);
        C13680ns.A0N(this, R.id.request_payment_account_info_text).setText(R.string.str073f);
        C13690nt.A19(A003, this, 3);
        int A004 = AnonymousClass00T.A00(this, R.color.color04d2);
        AnonymousClass2SR.A08((ImageView) findViewById(R.id.request_payment_account_info_icon), A004);
        ViewGroup viewGroup2 = (ViewGroup) C18450wi.A01(this, R.id.delete_payments_account_action);
        C18450wi.A0H(viewGroup2, 0);
        this.A00 = viewGroup2;
        AnonymousClass2SR.A08(C13680ns.A0K(viewGroup2, R.id.delete_payments_account_icon), A004);
        ViewGroup viewGroup3 = this.A00;
        if (viewGroup3 != null) {
            TextView textView6 = (TextView) C18450wi.A00(viewGroup3, R.id.delete_payments_account_label);
            C18450wi.A0H(textView6, 0);
            this.A09 = textView6;
            IDxObserverShape116S0100000_2_I1 iDxObserverShape116S0100000_2_I1 = new IDxObserverShape116S0100000_2_I1(this, 104);
            C15220qW r3 = this.A0C;
            ((AnonymousClass028) ((BusinessHubViewModel) r3.getValue()).A09.getValue()).A0A(this, iDxObserverShape116S0100000_2_I1);
            C13680ns.A1L(this, (AnonymousClass028) ((BusinessHubViewModel) r3.getValue()).A0A.getValue(), 105);
            ((BusinessHubViewModel) r3.getValue()).A06(true);
            return;
        }
        throw C18450wi.A03("removeAccountRow");
    }
}
