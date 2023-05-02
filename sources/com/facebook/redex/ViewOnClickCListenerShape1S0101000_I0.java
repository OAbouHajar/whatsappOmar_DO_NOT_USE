package com.facebook.redex;

import android.view.View;
import com.obwhatsapp.backup.google.RestoreFromBackupActivity;

public class ViewOnClickCListenerShape1S0101000_I0 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public ViewOnClickCListenerShape1S0101000_I0(RestoreFromBackupActivity restoreFromBackupActivity) {
        this.A02 = 1;
        this.A01 = restoreFromBackupActivity;
        this.A00 = 15;
    }

    public ViewOnClickCListenerShape1S0101000_I0(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0233, code lost:
        if (r4 == 1) goto L_0x0235;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A02
            switch(r0) {
                case 0: goto L_0x0245;
                case 1: goto L_0x01bd;
                case 2: goto L_0x01b1;
                case 3: goto L_0x0192;
                case 4: goto L_0x0181;
                case 5: goto L_0x0152;
                case 6: goto L_0x0140;
                case 7: goto L_0x00e8;
                case 8: goto L_0x00da;
                case 9: goto L_0x00ce;
                case 10: goto L_0x00b1;
                case 11: goto L_0x01f6;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r8 = r12.A01
            com.obwhatsapp.support.DescribeProblemActivity r8 = (com.obwhatsapp.support.DescribeProblemActivity) r8
            int r9 = r12.A00
            r0 = 2
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI
            java.lang.String r0 = "android.intent.action.PICK"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            java.lang.String r0 = "image/*"
            android.content.Intent r1 = r1.setType(r0)
            X.2jY r0 = new X.2jY
            r0.<init>(r1)
            r10.add(r0)
            android.net.Uri[] r0 = r8.A0P
            r0 = r0[r9]
            if (r0 == 0) goto L_0x004b
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r8.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.support.Remove"
            r2.setClassName(r1, r0)
            r0 = 2131892137(0x7f1217a9, float:1.9419014E38)
            java.lang.String r1 = r8.getString(r0)
            X.2jY r0 = new X.2jY
            r0.<init>(r2, r1)
            r10.add(r0)
        L_0x004b:
            r7 = 0
            int r6 = r10.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r6)
            r0 = 0
            java.lang.Object r0 = r10.get(r0)
            X.2jY r0 = (X.C55402jY) r0
            android.content.Intent r0 = r0.A01
            X.AnonymousClass1yL.A08(r0)
            r5.add(r0)
            r4 = 1
        L_0x0065:
            if (r4 >= r6) goto L_0x00a7
            java.lang.Object r11 = r10.get(r4)
            X.2jY r11 = (X.C55402jY) r11
            java.lang.String r3 = r11.A02
            if (r3 != 0) goto L_0x007c
            android.content.Intent r11 = r11.A01
        L_0x0073:
            X.AnonymousClass1yL.A08(r11)
            r5.add(r11)
            int r4 = r4 + 1
            goto L_0x0065
        L_0x007c:
            android.content.Intent r2 = r11.A01
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            android.content.ComponentName r1 = r2.resolveActivity(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Intent r1 = r0.setComponent(r1)
            android.net.Uri r0 = r2.getData()
            android.content.Intent r0 = r1.setData(r0)
            android.content.Intent r2 = r0.putExtras(r2)
            java.lang.String r1 = r8.getPackageName()
            int r0 = r11.A00
            android.content.pm.LabeledIntent r11 = new android.content.pm.LabeledIntent
            r11.<init>(r2, r1, r3, r0)
            goto L_0x0073
        L_0x00a7:
            android.content.Intent r1 = X.AnonymousClass1yL.A01(r7, r7, r5)
            r0 = r9 | 16
            r8.startActivityForResult(r1, r0)
            return
        L_0x00b1:
            java.lang.Object r0 = r12.A01
            X.2jZ r0 = (X.C55412jZ) r0
            int r6 = r12.A00
            com.obwhatsapp.quickcontact.QuickContactActivity r1 = r0.A04
            X.0sH r0 = r1.A0R
            X.0rv r0 = r0.A0E
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r0)
            if (r2 == 0) goto L_0x0244
            X.1VN r1 = r1.A0b
            r3 = 0
            r7 = 1
            java.lang.String r5 = "quick_contact_card"
            r4 = r3
            r1.A00(r2, r3, r4, r5, r6, r7)
            return
        L_0x00ce:
            java.lang.Object r0 = r12.A01
            X.29y r0 = (X.C456629y) r0
            int r1 = r12.A00
            X.29o r0 = r0.A0D
            r0.AYq(r1)
            return
        L_0x00da:
            java.lang.Object r2 = r12.A01
            com.obwhatsapp.inappbugreporting.InAppBugReportingActivity r2 = (com.obwhatsapp.inappbugreporting.InAppBugReportingActivity) r2
            int r1 = r12.A00
            r0 = 4
            r2.A35(r0)
            r2.A36(r1)
            return
        L_0x00e8:
            java.lang.Object r3 = r12.A01
            X.2ja r3 = (X.C55422ja) r3
            int r2 = r12.A00
            if (r2 == 0) goto L_0x0139
            r1 = 1
            if (r2 == r1) goto L_0x0133
            r0 = 2
            if (r2 == r0) goto L_0x00fa
            r3.AHp()
            return
        L_0x00fa:
            X.2jc r4 = r3.A05
            X.0sH r1 = r4.A00
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            X.AnonymousClass00B.A06(r0)
            X.0sL r3 = X.C16050sL.A03(r0)
            X.AnonymousClass00B.A06(r3)
            X.0pS r2 = r4.A03
            r1 = 2131891163(0x7f1213db, float:1.9417038E38)
            r0 = 0
            r2.Afr(r0, r1)
            X.0sq r1 = r4.A0D
            X.00k r6 = r4.A02
            X.119 r8 = r4.A09
            X.0uk r7 = r4.A05
            java.util.Set r9 = java.util.Collections.singleton(r3)
            X.2jd r5 = new X.2jd
            r5.<init>(r4, r3)
            X.2je r4 = new X.2je
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.Ack(r4, r0)
            return
        L_0x0133:
            X.2jc r0 = r3.A05
            r0.A04(r1)
            return
        L_0x0139:
            X.2jc r1 = r3.A05
            r0 = 1
            r1.A05(r0)
            return
        L_0x0140:
            java.lang.Object r0 = r12.A01
            X.2ja r0 = (X.C55422ja) r0
            int r1 = r12.A00
            X.2jc r0 = r0.A05
            if (r1 == 0) goto L_0x014e
            r0.A03()
            return
        L_0x014e:
            r0.A02()
            return
        L_0x0152:
            java.lang.Object r3 = r12.A01
            X.1yj r3 = (X.C42821yj) r3
            int r2 = r12.A00
            X.01Y r1 = r3.A1Q
            X.0rv r0 = r3.A33
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x0170
            X.1yV r1 = r3.A22
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 603(0x25b, float:8.45E-43)
            X.AnonymousClass29T.A01(r1, r0)
            return
        L_0x0170:
            X.1M4 r1 = r3.A3x
            r0 = 4
            r1.A00(r0)
            r3.A0S(r2)
            X.2jf r1 = r3.A1i
            java.lang.String r0 = "payment_composer_icon"
            r1.A09(r2, r0)
            return
        L_0x0181:
            java.lang.Object r0 = r12.A01
            X.2Rm r0 = (X.C49182Rm) r0
            int r2 = r12.A00
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = r0.A03
            X.02C r1 = r0.A0F()
            r0 = 2
            com.obwhatsapp.ephemeral.ChangeEphemeralSettingsDialog.A01(r1, r2, r0)
            return
        L_0x0192:
            java.lang.Object r2 = r12.A01
            com.obwhatsapp.chatinfo.ContactInfoActivity r2 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r2
            int r8 = r12.A00
            X.2jg r1 = r2.A13
            if (r1 == 0) goto L_0x01a0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A04 = r0
        L_0x01a0:
            X.0zl r6 = r2.A11
            X.01Y r3 = r2.A0Q
            X.0uP r4 = r2.A0e
            X.2a9 r5 = r2.A0l
            com.whatsapp.jid.UserJid r7 = r2.A3N()
            r9 = 1
            X.AnonymousClass2BX.A00(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x01b1:
            java.lang.Object r1 = r12.A01
            com.obwhatsapp.calling.callgrid.view.MenuBottomSheet r1 = (com.obwhatsapp.calling.callgrid.view.MenuBottomSheet) r1
            int r0 = r12.A00
            r1.A00 = r0
            r1.A1D()
            return
        L_0x01bd:
            java.lang.Object r4 = r12.A01
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r4 = (com.obwhatsapp.backup.google.RestoreFromBackupActivity) r4
            r1 = 15
            X.0pf r0 = r4.A06
            long r5 = r0.A01()
            java.util.Locale r3 = java.util.Locale.ENGLISH
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0 = 0
            r2[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error/%d free space:%d"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0244
            X.12U r1 = r4.A0H
            r0 = 10
            r1.A05(r0)
            r4.A3I()
            return
        L_0x01f6:
            java.lang.Object r2 = r12.A01
            com.obwhatsapp.storage.StorageUsageGallerySortBottomSheet r2 = (com.obwhatsapp.storage.StorageUsageGallerySortBottomSheet) r2
            int r4 = r12.A00
            r2.A1C()
            X.2jh r13 = (X.C55492jh) r13
            com.obwhatsapp.WaImageView r0 = r13.A00
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0244
            X.2jh r0 = r2.A02
            r1 = 0
            r0.setChecked(r1)
            X.2jh r0 = r2.A03
            r0.setChecked(r1)
            X.2jh r0 = r2.A04
            r0.setChecked(r1)
            r3 = 1
            r13.setChecked(r3)
            X.2h3 r0 = r2.A00
            if (r0 == 0) goto L_0x0244
            com.obwhatsapp.storage.StorageUsageGalleryActivity r0 = r0.A00
            com.obwhatsapp.storage.StorageUsageMediaGalleryFragment r2 = r0.A0d
            if (r2 == 0) goto L_0x0244
            int r0 = r2.A02
            if (r0 == r4) goto L_0x0244
            r2.A02 = r4
            com.obwhatsapp.scroller.RecyclerFastScroller r1 = r2.A0M
            if (r4 == 0) goto L_0x0235
            r0 = 8
            if (r4 != r3) goto L_0x0236
        L_0x0235:
            r0 = 0
        L_0x0236:
            r1.setVisibility(r0)
            r1 = 0
            r2.A00 = r1
            X.01X r0 = r2.A06
            r0.A01()
            r2.A1I(r1)
        L_0x0244:
            return
        L_0x0245:
            java.lang.Object r0 = r12.A01
            com.obwhatsapp.PagerSlidingTabStrip r0 = (com.obwhatsapp.PagerSlidingTabStrip) r0
            int r1 = r12.A00
            androidx.viewpager.widget.ViewPager r0 = r0.A0N
            r0.setCurrentItem(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.ViewOnClickCListenerShape1S0101000_I0.onClick(android.view.View):void");
    }
}
