package com.facebook.redex;

import android.view.View;

public class ViewOnClickCListenerShape13S0100000_I0_6 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape13S0100000_I0_6(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c1, code lost:
        r3.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0.AOf();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x01f6;
                case 1: goto L_0x04cc;
                case 2: goto L_0x04ab;
                case 3: goto L_0x0488;
                case 4: goto L_0x0196;
                case 5: goto L_0x0475;
                case 6: goto L_0x0462;
                case 7: goto L_0x0421;
                case 8: goto L_0x040d;
                case 9: goto L_0x03f0;
                case 10: goto L_0x03d6;
                case 11: goto L_0x03cd;
                case 12: goto L_0x03bd;
                case 13: goto L_0x03cd;
                case 14: goto L_0x03b2;
                case 15: goto L_0x03aa;
                case 16: goto L_0x03a2;
                case 17: goto L_0x039a;
                case 18: goto L_0x0392;
                case 19: goto L_0x0266;
                case 20: goto L_0x016c;
                case 21: goto L_0x038a;
                case 22: goto L_0x037a;
                case 23: goto L_0x0372;
                case 24: goto L_0x0369;
                case 25: goto L_0x0361;
                case 26: goto L_0x0337;
                case 27: goto L_0x02f3;
                case 28: goto L_0x012b;
                case 29: goto L_0x00fd;
                case 30: goto L_0x0014;
                case 31: goto L_0x02e7;
                case 32: goto L_0x02d3;
                case 33: goto L_0x02c5;
                case 34: goto L_0x02b0;
                case 35: goto L_0x029f;
                case 36: goto L_0x0291;
                case 37: goto L_0x0287;
                case 38: goto L_0x0005;
                case 39: goto L_0x0005;
                case 40: goto L_0x0005;
                case 41: goto L_0x0005;
                case 42: goto L_0x0005;
                case 43: goto L_0x000d;
                case 44: goto L_0x0279;
                case 45: goto L_0x0279;
                case 46: goto L_0x0279;
                case 47: goto L_0x0279;
                case 48: goto L_0x0266;
                case 49: goto L_0x025e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A00
            X.2h0 r0 = (X.C54222h0) r0
        L_0x0009:
            r0.AOf()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r7.A00
            X.25v r0 = (X.C448425v) r0
            X.2h0 r0 = r0.A0C
            goto L_0x0009
        L_0x0014:
            java.lang.Object r2 = r7.A00
            com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView r2 = (com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView) r2
            com.obwhatsapp.WaImageButton r1 = r2.A05
            X.01D r0 = r2.A0F
            java.lang.Object r0 = r0.get()
            X.01V r0 = (X.AnonymousClass01V) r0
            X.C41631wI.A01(r1, r0)
            X.1w1 r4 = r2.A0D
            if (r4 == 0) goto L_0x000c
            X.1w0 r4 = (X.C41481w0) r4
            X.027 r0 = r4.A08
            java.lang.Object r1 = r0.A01()
            if (r1 == 0) goto L_0x051d
            X.2U6 r1 = (X.AnonymousClass2U6) r1
            boolean r0 = r1 instanceof X.AnonymousClass2U7
            if (r0 == 0) goto L_0x005e
            X.2U7 r1 = (X.AnonymousClass2U7) r1
            X.1w0 r0 = r1.A00
            r0.A01()
        L_0x0040:
            X.1L1 r0 = r4.A0F
            X.1Su r2 = r0.A0D
            X.0vx r0 = r2.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x000c
            X.2Jb r1 = r2.A01()
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            X.0t9 r0 = r2.A02
            r0.A05(r1)
            return
        L_0x005e:
            boolean r0 = r1 instanceof X.AnonymousClass2U9
            if (r0 == 0) goto L_0x008e
            X.2U9 r1 = (X.AnonymousClass2U9) r1
            X.1w0 r2 = r1.A00
            X.1bx r1 = r2.A02
            if (r1 == 0) goto L_0x0071
            int r0 = r2.A00()
            r1.A0A(r0)
        L_0x0071:
            X.1bx r0 = r2.A02
            if (r0 == 0) goto L_0x0078
            r0.A07()
        L_0x0078:
            X.1Az r1 = r2.A0I
            r0 = 2131890860(0x7f1212ac, float:1.9416424E38)
            r1.A02(r0)
            r1.A01()
            X.027 r1 = r2.A08
            X.2U7 r0 = new X.2U7
            r0.<init>(r2)
        L_0x008a:
            r1.A0B(r0)
            goto L_0x0040
        L_0x008e:
            boolean r0 = r1 instanceof X.AnonymousClass2U5
            if (r0 == 0) goto L_0x0040
            X.2U5 r1 = (X.AnonymousClass2U5) r1
            X.1w0 r6 = r1.A00
            X.0tz r3 = r6.A0D     // Catch:{ IOException -> 0x00c1 }
            java.io.File r2 = r6.A0J     // Catch:{ IOException -> 0x00c1 }
            r1 = 3
            X.0pd r0 = r6.A0E     // Catch:{ IOException -> 0x00c1 }
            X.1bx r1 = X.C30211bx.A00(r3, r0, r2, r1)     // Catch:{ IOException -> 0x00c1 }
            r1.A05()     // Catch:{ IllegalStateException -> 0x00b3, IOException -> 0x00a5 }
            goto L_0x00c6
        L_0x00a5:
            r5 = move-exception
            X.0so r3 = r6.A0B     // Catch:{ IOException -> 0x00c1 }
            java.lang.String r2 = r5.toString()     // Catch:{ IOException -> 0x00c1 }
            java.lang.String r1 = "VoiceRecordingPreviewController/failed to prepare audio player"
            r0 = 1
            r3.AcB(r1, r2, r0)     // Catch:{ IOException -> 0x00c1 }
            throw r5     // Catch:{ IOException -> 0x00c1 }
        L_0x00b3:
            r5 = move-exception
            X.0so r3 = r6.A0B     // Catch:{ IOException -> 0x00c1 }
            java.lang.String r2 = r5.toString()     // Catch:{ IOException -> 0x00c1 }
            java.lang.String r1 = "VoiceRecordingPreviewController/failed to prepare audio player"
            r0 = 1
            r3.AcB(r1, r2, r0)     // Catch:{ IOException -> 0x00c1 }
            throw r5     // Catch:{ IOException -> 0x00c1 }
        L_0x00c1:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r1 = 0
        L_0x00c6:
            r6.A02 = r1
            r3 = 0
            if (r1 == 0) goto L_0x00f3
            int r0 = r6.A00()     // Catch:{ IOException -> 0x00ef }
            r1.A0A(r0)     // Catch:{ IOException -> 0x00ef }
            r1.A08()     // Catch:{ IOException -> 0x00ef }
            X.1Az r2 = r6.A0I     // Catch:{ IOException -> 0x00ef }
            r0 = 2131890860(0x7f1212ac, float:1.9416424E38)
            r2.A02(r0)     // Catch:{ IOException -> 0x00ef }
            android.os.Handler r1 = r6.A04     // Catch:{ IOException -> 0x00ef }
            java.lang.Runnable r0 = r6.A03     // Catch:{ IOException -> 0x00ef }
            r1.post(r0)     // Catch:{ IOException -> 0x00ef }
            r2.A01()
            X.027 r1 = r6.A08
            X.2U7 r0 = new X.2U7
            r0.<init>(r6)
            goto L_0x008a
        L_0x00ef:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x00f3:
            X.0pt r1 = r6.A0C
            r0 = 2131888421(0x7f120925, float:1.9411477E38)
            r1.A09(r0, r3)
            goto L_0x0040
        L_0x00fd:
            java.lang.Object r3 = r7.A00
            com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView r3 = (com.obwhatsapp.textstatuscomposer.voice.VoiceRecordingView) r3
            com.obwhatsapp.WaImageButton r2 = r3.A05
            X.01D r0 = r3.A0F
            java.lang.Object r1 = r0.get()
            X.01V r1 = (X.AnonymousClass01V) r1
            boolean r0 = X.C15450qv.A09()
            if (r0 == 0) goto L_0x0127
            r0 = 17
            r2.performHapticFeedback(r0)
        L_0x0116:
            X.1w1 r1 = r3.A0D
            if (r1 == 0) goto L_0x000c
            X.1w0 r1 = (X.C41481w0) r1
            X.1w4 r0 = r1.A00
            if (r0 == 0) goto L_0x0123
            r0.A00()
        L_0x0123:
            r1.A02()
            return
        L_0x0127:
            X.C41631wI.A02(r1)
            goto L_0x0116
        L_0x012b:
            java.lang.Object r0 = r7.A00
            com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r0 = (com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r0
            X.1wC r0 = r0.A0E
            if (r0 == 0) goto L_0x000c
            X.1wB r0 = (X.C41571wB) r0
            X.1wA r2 = r0.A07
            if (r2 == 0) goto L_0x000c
            X.1wD r0 = r0.A06
            X.1wE r1 = r0.A00
            X.1wE r0 = X.C41601wE.SEND_TEXT
            if (r1 != r0) goto L_0x015f
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r2 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r2
            r2.A3A()
            X.027 r0 = r2.A0r
            java.lang.Object r0 = r0.A01()
            X.1m6 r0 = (X.C35541m6) r0
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0525
            X.01D r0 = r2.A0g
            r0.get()
            java.lang.String r1 = "maybeShowCrosspostNuxAndExecute"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x015f:
            X.1wE r0 = X.C41601wE.SEND_VOICE
            if (r1 != r0) goto L_0x000c
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r2 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r2
            r2.A3A()
            r2.A3B()
            return
        L_0x016c:
            java.lang.Object r3 = r7.A00
            com.obwhatsapp.storage.StorageUsageGalleryActivity r3 = (com.obwhatsapp.storage.StorageUsageGalleryActivity) r3
            com.obwhatsapp.storage.StorageUsageMediaGalleryFragment r0 = r3.A0d
            if (r0 == 0) goto L_0x000c
            int r2 = r0.A02
            X.0s5 r1 = r3.A06
            X.0s8 r0 = X.C15910s6.A0J
            boolean r0 = r1.A05(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0194
            int r0 = r3.A01
            if (r0 != r1) goto L_0x0194
        L_0x0185:
            com.obwhatsapp.storage.StorageUsageGallerySortBottomSheet r1 = com.obwhatsapp.storage.StorageUsageGallerySortBottomSheet.A01(r2, r1)
            X.2h3 r0 = new X.2h3
            r0.<init>(r3)
            r1.A00 = r0
            r3.Afc(r1)
            return
        L_0x0194:
            r1 = 0
            goto L_0x0185
        L_0x0196:
            java.lang.Object r5 = r7.A00
            com.obwhatsapp.settings.SettingsUserProxyActivity r5 = (com.obwhatsapp.settings.SettingsUserProxyActivity) r5
            com.obwhatsapp.settings.SettingsUserProxyViewModel r0 = r5.A06
            X.1S6 r0 = r0.A0F
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x000c
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r5)
            r1 = 2131559646(0x7f0d04de, float:1.8744642E38)
            r0 = 0
            android.view.View r1 = r2.inflate(r1, r0)
            r0 = 2131365578(0x7f0a0eca, float:1.8351025E38)
            android.view.View r4 = X.C004601z.A0E(r1, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.obwhatsapp.settings.SettingsUserProxyViewModel r0 = r5.A06
            X.027 r0 = r0.A04
            java.lang.Object r0 = r0.A01()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setText(r0)
            X.1fu r3 = new X.1fu
            r3.<init>(r5)
            r0 = 2131890982(0x7f121326, float:1.9416671E38)
            r3.A02(r0)
            r3.setView(r1)
            r2 = 2131891330(0x7f121482, float:1.9417377E38)
            r1 = 31
            com.facebook.redex.IDxCListenerShape29S0200000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape29S0200000_2_I1
            r0.<init>(r4, r1, r5)
            r3.setPositiveButton(r2, r0)
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            r1 = 23
            com.facebook.redex.IDxCListenerShape23S0000000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape23S0000000_2_I1
            r0.<init>(r1)
            r3.setNegativeButton(r2, r0)
            X.02l r0 = r3.create()
            r0.show()
            return
        L_0x01f6:
            java.lang.Object r5 = r7.A00
            com.obwhatsapp.settings.SettingsPrivacy r5 = (com.obwhatsapp.settings.SettingsPrivacy) r5
            r0 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.A3C(r1, r0)
            X.0wP r0 = r5.A07
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0218
            X.0pt r1 = r5.A05
            r0 = 2131887220(0x7f120474, float:1.940904E38)
            r1.A09(r0, r2)
            return
        L_0x0218:
            androidx.appcompat.widget.SwitchCompat r0 = r5.A0L
            boolean r0 = r0.isChecked()
            r4 = r0 ^ 1
            java.lang.String r3 = "read_receipts_enabled"
            java.lang.String r2 = X.AnonymousClass271.A02(r3)
            boolean r0 = r3.equals(r3)
            java.lang.String r1 = "all"
            if (r0 != 0) goto L_0x0259
            java.lang.String r0 = "privacy_calladd"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x023a
            if (r4 == 0) goto L_0x023a
            java.lang.String r1 = "known"
        L_0x023a:
            r5.A3G(r2, r1)
            r5.A3H(r4)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000c
            X.0sq r2 = r5.A05
            r1 = 30
            com.facebook.redex.RunnableRunnableShape14S0100000_I0_13 r0 = new com.facebook.redex.RunnableRunnableShape14S0100000_I0_13
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.Acl(r0)
            return
        L_0x0259:
            if (r4 != 0) goto L_0x023a
            java.lang.String r1 = "none"
            goto L_0x023a
        L_0x025e:
            java.lang.Object r0 = r7.A00
            X.2hA r0 = (X.C54292hA) r0
            r0.AOW()
            return
        L_0x0266:
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r1.isSelected()
            if (r0 == 0) goto L_0x0274
            r0 = 0
            r1.setSelected(r0)
        L_0x0274:
            r0 = 1
            r1.setSelected(r0)
            return
        L_0x0279:
            java.lang.Object r1 = r7.A00
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
        L_0x0287:
            java.lang.Object r1 = r7.A00
            X.2hB r1 = (X.C54302hB) r1
            X.2hC r0 = r1.A01
            r0.AOh(r8, r1)
            return
        L_0x0291:
            java.lang.Object r1 = r7.A00
            com.obwhatsapp.text.ReadMoreTextView r1 = (com.obwhatsapp.text.ReadMoreTextView) r1
            boolean r0 = r1.A0K()
            r0 = r0 ^ 1
            r1.setExpanded(r0)
            return
        L_0x029f:
            java.lang.Object r3 = r7.A00
            android.content.Context r3 = (android.content.Context) r3
            r2 = 1
            int[] r1 = new int[r2]
            r0 = 0
            r1[r0] = r2
            java.lang.String r0 = "DONE"
            android.content.Intent r0 = X.C14750ph.A0l(r3, r0, r1)
            goto L_0x02c1
        L_0x02b0:
            java.lang.Object r3 = r7.A00
            android.content.Context r3 = (android.content.Context) r3
            r0 = 1
            int[] r2 = new int[r0]
            r1 = 0
            r0 = 2
            r2[r1] = r0
            java.lang.String r0 = "DONE"
            android.content.Intent r0 = X.C14750ph.A0l(r3, r0, r2)
        L_0x02c1:
            r3.startActivity(r0)
            return
        L_0x02c5:
            java.lang.Object r2 = r7.A00
            X.0pN r2 = (X.C14550pN) r2
            com.obwhatsapp.twofactor.SettingsTwoFactorAuthActivity$ConfirmDisableDialog r1 = new com.obwhatsapp.twofactor.SettingsTwoFactorAuthActivity$ConfirmDisableDialog
            r1.<init>()
            r0 = 0
            r2.Afb(r1, r0)
            return
        L_0x02d3:
            java.lang.Object r2 = r7.A00
            android.content.Context r2 = (android.content.Context) r2
            r0 = 2
            int[] r1 = new int[r0]
            r1 = {1, 2} // fill-array
            java.lang.String r0 = "DONE"
            android.content.Intent r0 = X.C14750ph.A0l(r2, r0, r1)
            r2.startActivity(r0)
            return
        L_0x02e7:
            java.lang.Object r0 = r7.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.00l r0 = r0.A0C()
            r0.finish()
            return
        L_0x02f3:
            java.lang.Object r5 = r7.A00
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r5 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r5
            int r2 = r5.A02
            int[] r6 = X.C47622Js.A02
            r1 = 0
        L_0x02fc:
            int r4 = r6.length
            if (r1 >= r4) goto L_0x0306
            r0 = r6[r1]
            if (r2 == r0) goto L_0x0307
            int r1 = r1 + 1
            goto L_0x02fc
        L_0x0306:
            r1 = -1
        L_0x0307:
            int r0 = r1 + 1
            int r0 = r0 % r4
            r0 = r6[r0]
            r5.A02 = r0
            android.graphics.Typeface r1 = X.C47622Js.A03(r5, r0)
            android.widget.TextView r0 = r5.A0C
            r0.setTypeface(r1)
            com.obwhatsapp.status.playback.widget.StatusEditText r0 = r5.A0a
            r0.setTypeface(r1)
            int[] r3 = com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity.A0x
            int r2 = r5.A02
            r1 = 0
        L_0x0321:
            if (r1 >= r4) goto L_0x032a
            r0 = r6[r1]
            if (r2 == r0) goto L_0x032b
            int r1 = r1 + 1
            goto L_0x0321
        L_0x032a:
            r1 = -1
        L_0x032b:
            r0 = r3[r1]
            java.lang.String r1 = r5.getString(r0)
            X.01V r0 = r5.A08
            X.AnonymousClass2JP.A00(r5, r0, r1)
            return
        L_0x0337:
            java.lang.Object r5 = r7.A00
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r5 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r5
            r5.A38()
            int[] r4 = com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity.A0w
            int r3 = r5.A00
            int[] r2 = X.C47622Js.A01
            r1 = 0
        L_0x0345:
            int r0 = r2.length
            if (r1 >= r0) goto L_0x034f
            r0 = r2[r1]
            if (r3 == r0) goto L_0x0350
            int r1 = r1 + 1
            goto L_0x0345
        L_0x034f:
            r1 = -1
        L_0x0350:
            r0 = r4[r1]
            java.lang.String r1 = r5.getString(r0)
            X.01V r0 = r5.A08
            X.AnonymousClass2JP.A00(r5, r0, r1)
            X.1L1 r0 = r5.A0Z
            r0.A04()
            return
        L_0x0361:
            java.lang.Object r0 = r7.A00
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            r0.A35()
            return
        L_0x0369:
            java.lang.Object r1 = r7.A00
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r1 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r1
            r0 = 0
            r1.A3I(r0)
            return
        L_0x0372:
            java.lang.Object r0 = r7.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x037a:
            java.lang.Object r0 = r7.A00
            com.obwhatsapp.support.DescribeProblemActivity r0 = (com.obwhatsapp.support.DescribeProblemActivity) r0
            androidx.appcompat.widget.AppCompatCheckBox r1 = r0.A03
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
        L_0x038a:
            java.lang.Object r0 = r7.A00
            com.obwhatsapp.storage.StorageUsageGalleryActivity r0 = (com.obwhatsapp.storage.StorageUsageGalleryActivity) r0
            r0.onBackPressed()
            return
        L_0x0392:
            java.lang.Object r0 = r7.A00
            com.obwhatsapp.storage.StorageUsageActivity r0 = (com.obwhatsapp.storage.StorageUsageActivity) r0
            r0.onBackPressed()
            return
        L_0x039a:
            java.lang.Object r0 = r7.A00
            com.obwhatsapp.storage.StorageUsageActivity r0 = (com.obwhatsapp.storage.StorageUsageActivity) r0
            r0.onSearchRequested()
            return
        L_0x03a2:
            java.lang.Object r0 = r7.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x03aa:
            java.lang.Object r0 = r7.A00
            X.2jq r0 = (X.C55552jq) r0
            r0.A0E()
            return
        L_0x03b2:
            java.lang.Object r0 = r7.A00
            X.1wh r0 = (X.C41811wh) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.A00
            r0 = 4
            r1.A0M(r0)
            return
        L_0x03bd:
            java.lang.Object r0 = r7.A00
            com.obwhatsapp.status.playback.MessageReplyActivity r0 = (com.obwhatsapp.status.playback.MessageReplyActivity) r0
            X.2jf r2 = r0.A0R
            boolean r1 = r0.A18
            r0 = 2
            if (r1 == 0) goto L_0x03c9
            r0 = 5
        L_0x03c9:
            r2.A08(r0)
            return
        L_0x03cd:
            java.lang.Object r1 = r7.A00
            com.obwhatsapp.status.playback.MessageReplyActivity r1 = (com.obwhatsapp.status.playback.MessageReplyActivity) r1
            r0 = 0
            r1.A3C(r0)
            return
        L_0x03d6:
            java.lang.Object r3 = r7.A00
            X.01A r3 = (X.AnonymousClass01A) r3
            android.content.Context r0 = r3.A0u()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.status.audienceselector.StatusPrivacyActivity"
            r2.setClassName(r1, r0)
            r3.A0r(r2)
            return
        L_0x03f0:
            java.lang.Object r3 = r7.A00
            com.obwhatsapp.status.StatusesFragment r3 = (com.obwhatsapp.status.StatusesFragment) r3
            X.0rz r0 = r3.A0Q
            r2 = 0
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "show_statuses_education"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            android.view.View r1 = r3.A03
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x040d:
            java.lang.Object r0 = r7.A00
            com.obwhatsapp.status.StatusesFragment r0 = (com.obwhatsapp.status.StatusesFragment) r0
            X.1BJ r2 = r0.A0A
            X.00l r1 = r0.A0C()
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01(r1, r0)
            return
        L_0x0421:
            java.lang.Object r4 = r7.A00
            com.obwhatsapp.shareinvitelink.ShareInviteLinkActivity r4 = (com.obwhatsapp.shareinvitelink.ShareInviteLinkActivity) r4
            X.0sL r3 = r4.A09
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.qrcode.GroupLinkQrActivity"
            android.content.Intent r2 = r2.setClassName(r1, r0)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "jid"
            r2.putExtra(r0, r1)
            r4.startActivity(r2)
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.3qy r2 = new X.3qy
            r2.<init>()
            r2.A00 = r0
            X.0sL r1 = r4.A09
            X.0ul r0 = r4.A08
            int r0 = X.C40511uF.A03(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            X.0t9 r0 = r4.A07
            r0.A06(r2)
            return
        L_0x0462:
            java.lang.Object r2 = r7.A00
            com.obwhatsapp.shareinvitelink.ShareInviteLinkActivity r2 = (com.obwhatsapp.shareinvitelink.ShareInviteLinkActivity) r2
            X.0sL r1 = r2.A09
            X.AnonymousClass00B.A06(r1)
            r0 = 0
            com.obwhatsapp.RevokeLinkConfirmationDialogFragment r1 = com.obwhatsapp.RevokeLinkConfirmationDialogFragment.A01(r1, r0)
            r0 = 0
            r2.Afb(r1, r0)
            return
        L_0x0475:
            java.lang.Object r0 = r7.A00
            X.2kG r0 = (X.C55742kG) r0
            X.2kH r0 = r0.A01
            com.obwhatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity r0 = r0.A00
            X.2kG r3 = r0.A06
            java.util.List r2 = r0.A07
            X.01Q r1 = r0.A02
            r0 = 2
            r3.A0E(r1, r2, r0)
            return
        L_0x0488:
            java.lang.Object r4 = r7.A00
            com.obwhatsapp.settings.SettingsPrivacy r4 = (com.obwhatsapp.settings.SettingsPrivacy) r4
            r0 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r3 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r4.A3C(r1, r0)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.status.audienceselector.StatusPrivacyActivity"
            r2.setClassName(r1, r0)
            r4.startActivityForResult(r2, r3)
            return
        L_0x04ab:
            java.lang.Object r2 = r7.A00
            com.obwhatsapp.settings.SettingsPrivacy r2 = (com.obwhatsapp.settings.SettingsPrivacy) r2
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A3C(r1, r0)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r0 = "com.obwhatsapp.profile.AboutStatusPrivacyActivity"
            android.content.Intent r1 = r1.setClassName(r2, r0)
            r0 = 5
            r2.startActivityForResult(r1, r0)
            return
        L_0x04cc:
            java.lang.Object r6 = r7.A00
            com.obwhatsapp.settings.SettingsPrivacy r6 = (com.obwhatsapp.settings.SettingsPrivacy) r6
            r0 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r5 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r6.A3C(r1, r0)
            X.0wP r0 = r6.A07
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x04ef
            X.0pt r1 = r6.A05
            r0 = 2131887220(0x7f120474, float:1.940904E38)
            r1.A09(r0, r5)
            return
        L_0x04ef:
            androidx.appcompat.widget.SwitchCompat r0 = r6.A0M
            boolean r0 = r0.isChecked()
            r4 = r0 ^ 1
            java.lang.String r3 = "privacy_calladd"
            java.lang.String r2 = X.AnonymousClass271.A02(r3)
            java.lang.String r0 = "read_receipts_enabled"
            boolean r0 = r3.equals(r0)
            java.lang.String r1 = "all"
            if (r0 != 0) goto L_0x0518
            boolean r0 = r3.equals(r3)
            if (r0 == 0) goto L_0x0511
            if (r4 == 0) goto L_0x0511
            java.lang.String r1 = "known"
        L_0x0511:
            r6.A3G(r2, r1)
            r6.A3I(r4, r5)
            return
        L_0x0518:
            if (r4 != 0) goto L_0x0511
            java.lang.String r1 = "none"
            goto L_0x0511
        L_0x051d:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0525:
            r2.A39()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6.onClick(android.view.View):void");
    }
}
