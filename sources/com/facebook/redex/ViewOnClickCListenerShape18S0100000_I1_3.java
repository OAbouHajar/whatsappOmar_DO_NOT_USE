package com.facebook.redex;

import android.view.View;

public class ViewOnClickCListenerShape18S0100000_I1_3 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape18S0100000_I1_3(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0308, code lost:
        r3.A04.A00.A00("ephemeral", (java.lang.Object) null);
        r3.A1D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0315, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x046f, code lost:
        r1.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0471, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0503, code lost:
        X.AnonymousClass00B.A06(r2);
        r1.Agy(r3);
        r0 = r4.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x050b, code lost:
        r0.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x050e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0601, code lost:
        if (r0 == false) goto L_0x0603;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A01
            switch(r0) {
                case 0: goto L_0x027d;
                case 1: goto L_0x0298;
                case 2: goto L_0x02a6;
                case 3: goto L_0x02ba;
                case 4: goto L_0x02a6;
                case 5: goto L_0x02ee;
                case 6: goto L_0x0304;
                case 7: goto L_0x0316;
                case 8: goto L_0x031e;
                case 9: goto L_0x0326;
                case 10: goto L_0x033f;
                case 11: goto L_0x036d;
                case 12: goto L_0x036d;
                case 13: goto L_0x0005;
                case 14: goto L_0x0386;
                case 15: goto L_0x0005;
                case 16: goto L_0x001a;
                case 17: goto L_0x003e;
                case 18: goto L_0x0089;
                case 19: goto L_0x03af;
                case 20: goto L_0x03c3;
                case 21: goto L_0x00c5;
                case 22: goto L_0x00e8;
                case 23: goto L_0x03cb;
                case 24: goto L_0x03d3;
                case 25: goto L_0x03db;
                case 26: goto L_0x03e4;
                case 27: goto L_0x0111;
                case 28: goto L_0x012d;
                case 29: goto L_0x03ec;
                case 30: goto L_0x03fa;
                case 31: goto L_0x0430;
                case 32: goto L_0x043b;
                case 33: goto L_0x0443;
                case 34: goto L_0x044b;
                case 35: goto L_0x0451;
                case 36: goto L_0x0464;
                case 37: goto L_0x046a;
                case 38: goto L_0x0472;
                case 39: goto L_0x047a;
                case 40: goto L_0x014f;
                case 41: goto L_0x016b;
                case 42: goto L_0x01aa;
                case 43: goto L_0x01e6;
                case 44: goto L_0x04b2;
                case 45: goto L_0x04bc;
                case 46: goto L_0x0202;
                case 47: goto L_0x0246;
                case 48: goto L_0x025a;
                case 49: goto L_0x04c4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r13.A00
            com.obwhatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet r3 = (com.obwhatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet) r3
            X.0rz r0 = r3.A02
            android.content.SharedPreferences$Editor r2 = r0.A0K()
            java.lang.String r1 = "view_once_nux_secondary"
            r0 = 1
            X.C13680ns.A0z(r2, r1, r0)
            r3.A1D()
        L_0x0019:
            return
        L_0x001a:
            java.lang.Object r0 = r13.A00
            X.3Sl r0 = (X.C64993Sl) r0
            X.1rA r7 = r0.A00
            if (r7 == 0) goto L_0x0019
            com.obwhatsapp.gallery.DocumentsGalleryFragment r2 = r0.A0B
            X.00l r4 = r2.A0C()
            X.AnonymousClass00B.A06(r4)
            r1 = r4
            X.1YG r1 = (X.AnonymousClass1YG) r1
            boolean r0 = r1.AHi()
            if (r0 == 0) goto L_0x04ce
            X.AnonymousClass00B.A06(r4)
            r1.Agy(r7)
            X.3R5 r0 = r2.A0A
            goto L_0x050b
        L_0x003e:
            java.lang.Object r5 = r13.A00
            X.2re r5 = (X.C57722re) r5
            X.0tZ r3 = r5.A01
            if (r3 == 0) goto L_0x0019
            com.obwhatsapp.gallery.LinksGalleryFragment r4 = r5.A0A
            X.00l r2 = r4.A0C()
            X.AnonymousClass00B.A06(r2)
            r1 = r2
            X.1YG r1 = (X.AnonymousClass1YG) r1
            boolean r0 = r1.AHi()
            if (r0 != 0) goto L_0x0503
            X.0ph r2 = X.C14750ph.A0q()
            android.content.Context r1 = r4.A0u()
            X.0tZ r0 = r5.A01
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            android.content.Intent r3 = r2.A0x(r1, r0)
            X.0tZ r0 = r5.A01
            long r1 = r0.A13
            java.lang.String r0 = "row_id"
            r3.putExtra(r0, r1)
            X.0tZ r0 = r5.A01
            long r1 = r0.A14
            java.lang.String r0 = "sort_id"
            r3.putExtra(r0, r1)
            X.0tZ r0 = r5.A01
            X.1Vw r0 = r0.A11
            X.AnonymousClass1yL.A00(r3, r0)
            X.C54472hZ.A00(r3, r4)
            return
        L_0x0089:
            java.lang.Object r5 = r13.A00
            X.2re r5 = (X.C57722re) r5
            X.0tZ r3 = r5.A01
            if (r3 == 0) goto L_0x0019
            com.obwhatsapp.gallery.LinksGalleryFragment r4 = r5.A0A
            X.00l r2 = r4.A0C()
            X.AnonymousClass00B.A06(r2)
            r1 = r2
            X.1YG r1 = (X.AnonymousClass1YG) r1
            boolean r0 = r1.AHi()
            if (r0 != 0) goto L_0x0503
            java.lang.String r0 = r5.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0019
            java.util.Set r3 = r5.A03
            if (r3 == 0) goto L_0x04e0
            X.00l r2 = r4.A0C()
            X.0pN r2 = (X.C14550pN) r2
            java.lang.String r1 = r5.A02
            X.0tZ r0 = r5.A01
            X.1Vw r0 = r0.A11
            java.lang.String r0 = r0.A01
            com.obwhatsapp.SuspiciousLinkWarningDialogFragment r0 = com.obwhatsapp.SuspiciousLinkWarningDialogFragment.A01(r1, r0, r3)
            r2.Afc(r0)
            return
        L_0x00c5:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.WaEditText r1 = (com.obwhatsapp.WaEditText) r1
            r1.requestFocus()
            r0 = 0
            r1.A04(r0)
            int r0 = r1.getSelectionStart()
            if (r0 <= 0) goto L_0x00dc
            int r0 = r1.getSelectionEnd()
            if (r0 > 0) goto L_0x0019
        L_0x00dc:
            android.text.Editable r0 = r1.getText()
            int r0 = r0.length()
            r1.setSelection(r0)
            return
        L_0x00e8:
            java.lang.Object r2 = r13.A00
            X.2pb r2 = (X.C56992pb) r2
            X.3qE r1 = new X.3qE
            r1.<init>()
            java.lang.Integer r0 = X.C13690nt.A0U()
            r1.A00 = r0
            X.0t9 r0 = r2.getWamRuntime()
            r0.A04(r1)
            r2.A00()
            X.5Mk r1 = r2.A02
            if (r1 == 0) goto L_0x0019
            X.4z8 r1 = (X.C102554z8) r1
            com.obwhatsapp.inappbugreporting.InAppBugReportingActivity r0 = r1.A01
            android.net.Uri[] r2 = r0.A0H
            int r1 = r1.A00
            r0 = 0
            r2[r1] = r0
            return
        L_0x0111:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.instrumentation.ui.ConfirmFragment r0 = (com.obwhatsapp.instrumentation.ui.ConfirmFragment) r0
            X.5Ml r5 = r0.A01
            if (r5 == 0) goto L_0x0019
            com.obwhatsapp.instrumentation.ui.InstrumentationAuthActivity r5 = (com.obwhatsapp.instrumentation.ui.InstrumentationAuthActivity) r5
            java.lang.String r0 = r5.A0C
            android.content.Intent r4 = X.C13680ns.A09()
            java.lang.String r3 = r5.getCallingPackage()
            X.AnonymousClass00B.A06(r3)
            X.10T r7 = r5.A09
            monitor-enter(r7)
            goto L_0x050f
        L_0x012d:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.instrumentation.ui.PermissionsFragment r0 = (com.obwhatsapp.instrumentation.ui.PermissionsFragment) r0
            X.5Mm r3 = r0.A02
            if (r3 == 0) goto L_0x0019
            com.obwhatsapp.instrumentation.ui.InstrumentationAuthActivity r3 = (com.obwhatsapp.instrumentation.ui.InstrumentationAuthActivity) r3
            X.0s5 r1 = r3.A06
            X.0s8 r0 = X.C15910s6.A0V
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x0615
            com.obwhatsapp.deviceauth.BiometricAuthPlugin r0 = r3.A03
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0615
            com.obwhatsapp.deviceauth.BiometricAuthPlugin r0 = r3.A03
            r0.A02()
            return
        L_0x014f:
            java.lang.Object r2 = r13.A00
            com.obwhatsapp.location.LocationPicker r2 = (com.obwhatsapp.location.LocationPicker) r2
            X.29S r0 = r2.A0N
            android.view.View r1 = r0.A0B
            r0 = 0
            r1.setVisibility(r0)
            X.29S r0 = r2.A0N
            com.obwhatsapp.location.PlaceInfo r0 = r0.A0g
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r0.A0D
            if (r0 == 0) goto L_0x0019
            X.0IS r0 = (X.AnonymousClass0IS) r0
            r0.A0E()
            return
        L_0x016b:
            java.lang.Object r4 = r13.A00
            com.obwhatsapp.location.LocationPicker r4 = (com.obwhatsapp.location.LocationPicker) r4
            X.29S r1 = r4.A0N
            boolean r0 = r1.A0v
            if (r0 == 0) goto L_0x0629
            android.location.Location r0 = r1.A06
            if (r0 == 0) goto L_0x0019
            android.widget.ImageView r1 = r1.A0T
            r0 = 2131231000(0x7f080118, float:1.8078069E38)
            r1.setImageResource(r0)
            X.074 r7 = r4.A03
            if (r7 == 0) goto L_0x01a4
            X.29S r0 = r4.A0N
            android.location.Location r0 = r0.A06
            double r5 = r0.getLatitude()
            X.29S r0 = r4.A0N
            android.location.Location r0 = r0.A06
            double r2 = r0.getLongitude()
            X.020 r1 = new X.020
            r1.<init>(r5, r2)
            X.076 r0 = new X.076
            r0.<init>()
            r0.A06 = r1
            r7.A08(r0)
        L_0x01a4:
            X.29S r1 = r4.A0N
            r0 = 1
            r1.A0u = r0
            return
        L_0x01aa:
            java.lang.Object r3 = r13.A00
            com.obwhatsapp.location.LocationPicker2 r3 = (com.obwhatsapp.location.LocationPicker2) r3
            X.29S r1 = r3.A0T
            boolean r0 = r1.A0v
            if (r0 == 0) goto L_0x0653
            android.location.Location r0 = r1.A06
            if (r0 == 0) goto L_0x0019
            android.widget.ImageView r1 = r1.A0T
            r0 = 2131231000(0x7f080118, float:1.8078069E38)
            r1.setImageResource(r0)
            X.2NT r6 = r3.A02
            if (r6 == 0) goto L_0x01e0
            X.29S r0 = r3.A0T
            android.location.Location r0 = r0.A06
            double r4 = r0.getLatitude()
            X.29S r0 = r3.A0T
            android.location.Location r0 = r0.A06
            double r1 = r0.getLongitude()
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            r0.<init>(r4, r1)
            X.2R9 r0 = X.AnonymousClass2R8.A01(r0)
            r6.A09(r0)
        L_0x01e0:
            X.29S r1 = r3.A0T
            r0 = 1
            r1.A0u = r0
            return
        L_0x01e6:
            java.lang.Object r2 = r13.A00
            com.obwhatsapp.location.LocationPicker2 r2 = (com.obwhatsapp.location.LocationPicker2) r2
            X.29S r0 = r2.A0T
            android.view.View r1 = r0.A0B
            r0 = 0
            r1.setVisibility(r0)
            X.29S r0 = r2.A0T
            com.obwhatsapp.location.PlaceInfo r0 = r0.A0g
            if (r0 == 0) goto L_0x0019
            java.lang.Object r0 = r0.A0D
            if (r0 == 0) goto L_0x0019
            X.1gN r0 = (X.C32451gN) r0
            r0.A03()
            return
        L_0x0202:
            java.lang.Object r7 = r13.A00
            X.3SL r7 = (X.AnonymousClass3SL) r7
            X.2V1 r0 = r7.A00
            if (r0 == 0) goto L_0x0019
            X.2VF r5 = r7.A02
            X.2Ur r8 = r5.A05
            X.0sq r6 = r8.A0a
            X.1Mt r0 = r8.A0F
            X.3yd r2 = new X.3yd
            r2.<init>(r0, r5)
            r4 = 1
            X.2V1[] r1 = new X.AnonymousClass2V1[r4]
            X.2V1 r0 = r7.A00
            r3 = 0
            r1[r3] = r0
            r6.Ack(r2, r1)
            X.29t r0 = r8.A0I
            X.2Ra r0 = (X.AnonymousClass2Ra) r0
            r0.A02()
            X.2V1 r2 = r7.A00
            boolean r0 = r2.AcK()
            if (r0 == 0) goto L_0x067d
            X.013 r1 = r8.A0B
            android.content.Context r0 = r14.getContext()
            X.3yp r2 = new X.3yp
            r2.<init>(r0, r1, r5)
            X.2V1[] r1 = new X.AnonymousClass2V1[r4]
            X.2V1 r0 = r7.A00
            r1[r3] = r0
            r6.Acn(r2, r1)
            return
        L_0x0246:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.mediacomposer.doodle.textentry.NewTextEntryView r0 = (com.obwhatsapp.mediacomposer.doodle.textentry.NewTextEntryView) r0
            X.4zb r1 = r0.A01
            if (r1 == 0) goto L_0x0019
            java.lang.Object r0 = r14.getTag()
            int r0 = X.AnonymousClass000.A0D(r0)
            r1.A00(r0)
            return
        L_0x025a:
            java.lang.Object r1 = r13.A00
            X.4zb r1 = (X.C102834zb) r1
            X.4MW r0 = r1.A04
            int r0 = r0.A02
            int r0 = r0 + 1
            int r0 = r0 % 4
            r1.A00(r0)
            X.2k1 r2 = r1.A03
            boolean r0 = r2 instanceof com.obwhatsapp.mediacomposer.doodle.textentry.TextEntryView
            if (r0 == 0) goto L_0x0019
            com.obwhatsapp.mediacomposer.doodle.textentry.TextEntryView r2 = (com.obwhatsapp.mediacomposer.doodle.textentry.TextEntryView) r2
            com.obwhatsapp.WaTextView r1 = r2.A02
            com.obwhatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r2.A05
            android.graphics.Typeface r0 = r0.getTypeface()
            r1.setTypeface(r0)
            return
        L_0x027d:
            java.lang.Object r2 = r13.A00
            X.2pY r2 = (X.C56972pY) r2
            int[][] r1 = r2.A04
            java.lang.Object r0 = r14.getTag()
            int r0 = X.AnonymousClass000.A0D(r0)
            r1 = r1[r0]
            X.5Pb r0 = r2.A03
            if (r0 == 0) goto L_0x0294
            r0.AXI(r1)
        L_0x0294:
            r2.dismiss()
            return
        L_0x0298:
            java.lang.Object r0 = r13.A00
            X.2rf r0 = (X.C57732rf) r0
            X.5Pc r2 = r0.A05
            X.1pj r1 = r0.A01
            int r0 = r0.A00
            r2.AQJ(r1, r0)
            return
        L_0x02a6:
            java.lang.Object r3 = r13.A00
            com.obwhatsapp.ephemeral.EphemeralDmKicBottomSheetDialog r3 = (com.obwhatsapp.ephemeral.EphemeralDmKicBottomSheetDialog) r3
            X.0rz r0 = r3.A0E
            r2 = 1
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "ephemeral_kic_nux"
            X.C13680ns.A0z(r1, r0, r2)
            r3.A1D()
            return
        L_0x02ba:
            java.lang.Object r4 = r13.A00
            com.obwhatsapp.ephemeral.EphemeralDmKicBottomSheetDialog r4 = (com.obwhatsapp.ephemeral.EphemeralDmKicBottomSheetDialog) r4
            X.0w6 r5 = r4.A0G
            X.0rv r3 = r4.A0J
            X.0rs r2 = r4.A0C
            java.lang.Integer r1 = X.C13680ns.A0a()
            int r0 = r4.A00
            r5.A01(r2, r3, r1, r0)
            X.0uj r1 = r4.A0M
            java.lang.String r0 = "about-disappearing-messages"
            android.content.Intent r2 = X.C17220uj.A00(r1, r0)
            X.0zJ r1 = r4.A01
            android.content.Context r0 = r14.getContext()
            r1.A06(r0, r2)
            X.0rz r0 = r4.A0E
            r2 = 1
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "ephemeral_kic_nux"
            X.C13680ns.A0z(r1, r0, r2)
            r4.A1D()
            return
        L_0x02ee:
            java.lang.Object r3 = r13.A00
            com.obwhatsapp.ephemeral.EphemeralNUXDialog r3 = (com.obwhatsapp.ephemeral.EphemeralNUXDialog) r3
            X.0uj r1 = r3.A05
            java.lang.String r0 = "about-disappearing-messages"
            android.content.Intent r2 = X.C17220uj.A00(r1, r0)
            X.0zJ r1 = r3.A02
            android.content.Context r0 = r14.getContext()
            r1.A06(r0, r2)
            goto L_0x0308
        L_0x0304:
            java.lang.Object r3 = r13.A00
            com.obwhatsapp.ephemeral.EphemeralNUXDialog r3 = (com.obwhatsapp.ephemeral.EphemeralNUXDialog) r3
        L_0x0308:
            X.0vf r0 = r3.A04
            java.lang.String r2 = "ephemeral"
            X.0ve r1 = r0.A00
            r0 = 0
            r1.A00(r2, r0)
            r3.A1D()
            return
        L_0x0316:
            java.lang.Object r0 = r13.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x031e:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.ephemeral.ViewOnceNUXDialog r0 = (com.obwhatsapp.ephemeral.ViewOnceNUXDialog) r0
            r0.A1N()
            return
        L_0x0326:
            java.lang.Object r3 = r13.A00
            com.obwhatsapp.ephemeral.ViewOnceNUXDialog r3 = (com.obwhatsapp.ephemeral.ViewOnceNUXDialog) r3
            X.0uj r1 = r3.A05
            java.lang.String r0 = "about-view-once"
            android.content.Intent r2 = X.C17220uj.A00(r1, r0)
            X.0zJ r1 = r3.A02
            android.content.Context r0 = r14.getContext()
            r1.A06(r0, r2)
            r3.A1N()
            return
        L_0x033f:
            java.lang.Object r3 = r13.A00
            com.obwhatsapp.ephemeral.ViewOnceNuxBottomSheet r3 = (com.obwhatsapp.ephemeral.ViewOnceNuxBottomSheet) r3
            X.0uj r1 = r3.A07
            java.lang.String r0 = "about-view-once"
            android.content.Intent r2 = X.C17220uj.A00(r1, r0)
            X.0zJ r1 = r3.A01
            android.content.Context r0 = r14.getContext()
            r1.A06(r0, r2)
            X.0vf r1 = r3.A06
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x036a
            java.lang.String r2 = "ephemeral_view_once"
        L_0x035c:
            X.0ve r1 = r1.A00
            r0 = 0
            r1.A00(r2, r0)
            r3.A1D()
            r0 = 1
            r3.A1N(r0)
            return
        L_0x036a:
            java.lang.String r2 = "ephemeral_view_once_receiver"
            goto L_0x035c
        L_0x036d:
            java.lang.Object r3 = r13.A00
            com.obwhatsapp.ephemeral.ViewOnceNuxBottomSheet r3 = (com.obwhatsapp.ephemeral.ViewOnceNuxBottomSheet) r3
            X.0vf r1 = r3.A06
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0383
            java.lang.String r2 = "ephemeral_view_once"
        L_0x0379:
            X.0ve r1 = r1.A00
            r0 = 0
            r1.A00(r2, r0)
            r3.A1D()
            return
        L_0x0383:
            java.lang.String r2 = "ephemeral_view_once_receiver"
            goto L_0x0379
        L_0x0386:
            java.lang.Object r3 = r13.A00
            com.obwhatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet r3 = (com.obwhatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet) r3
            X.0uj r1 = r3.A05
            java.lang.String r0 = "about-view-once"
            android.content.Intent r2 = X.C17220uj.A00(r1, r0)
            X.0zJ r1 = r3.A01
            android.content.Context r0 = r14.getContext()
            r1.A06(r0, r2)
            X.0rz r0 = r3.A02
            android.content.SharedPreferences$Editor r2 = r0.A0K()
            java.lang.String r1 = "view_once_nux_secondary"
            r0 = 1
            X.C13680ns.A0z(r2, r1, r0)
            r3.A1D()
            r3.A1N(r0)
            return
        L_0x03af:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.greenalert.GreenAlertActivity r0 = (com.obwhatsapp.greenalert.GreenAlertActivity) r0
            com.obwhatsapp.WaViewPager r1 = r0.A06
            java.lang.Integer r0 = X.C13680ns.A0Y()
            android.view.View r0 = r1.findViewWithTag(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            X.C812347j.A00(r0)
            return
        L_0x03c3:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.greenalert.GreenAlertActivity r0 = (com.obwhatsapp.greenalert.GreenAlertActivity) r0
            r0.A35()
            return
        L_0x03cb:
            java.lang.Object r0 = r13.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.C13690nt.A0q(r0)
            return
        L_0x03d3:
            java.lang.Object r0 = r13.A00
            X.0pN r0 = (X.C14550pN) r0
            r0.onBackPressed()
            return
        L_0x03db:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.inappsupport.ui.SupportTopicsActivity r1 = (com.obwhatsapp.inappsupport.ui.SupportTopicsActivity) r1
            r0 = 0
            r1.A35(r0)
            return
        L_0x03e4:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.inappsupport.ui.SupportTopicsActivity r0 = (com.obwhatsapp.inappsupport.ui.SupportTopicsActivity) r0
            r0.onBackPressed()
            return
        L_0x03ec:
            java.lang.Object r1 = r13.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "android.settings.INTERNAL_STORAGE_SETTINGS"
            android.content.Intent r0 = X.C13700nu.A02(r0)
            r1.startActivity(r0)
            return
        L_0x03fa:
            java.lang.Object r4 = r13.A00
            com.obwhatsapp.insufficientstoragespace.InsufficientStorageSpaceActivity r4 = (com.obwhatsapp.insufficientstoragespace.InsufficientStorageSpaceActivity) r4
            X.0rz r1 = r4.A09
            java.lang.String r0 = "insufficient_storage_prompt_timestamp"
            r1.A0x(r0)
            X.3rI r3 = new X.3rI
            r3.<init>()
            long r0 = r4.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r3.A02 = r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.A00 = r0
            java.lang.Integer r0 = X.C13680ns.A0Z()
            r3.A01 = r0
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r1 = X.AnonymousClass000.A1a(r1)
            java.lang.String r0 = "insufficient-storage-activity/skipped space-required: %,d"
            X.C13700nu.A0Z(r0, r2, r1)
            X.0t9 r0 = r4.A02
            r0.A05(r3)
            r4.finish()
            return
        L_0x0430:
            java.lang.Object r1 = r13.A00
            X.2r8 r1 = (X.C57412r8) r1
            r0 = 1
            r1.A01 = r0
            r1.A01()
            return
        L_0x043b:
            java.lang.Object r0 = r13.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x0443:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.lastseen.TrustedContactsPresencePrivacyActivity r1 = (com.obwhatsapp.lastseen.TrustedContactsPresencePrivacyActivity) r1
            r0 = 0
            r1.A01 = r0
            return
        L_0x044b:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.lastseen.TrustedContactsPresencePrivacyActivity r1 = (com.obwhatsapp.lastseen.TrustedContactsPresencePrivacyActivity) r1
            r0 = 0
            goto L_0x046f
        L_0x0451:
            java.lang.Object r2 = r13.A00
            X.00m r2 = (X.C001100m) r2
            android.content.Intent r1 = X.C13680ns.A09()
            java.lang.String r0 = "com.obwhatsapp.lastseen.LastSeenBlockListPickerActivity"
            android.content.Intent r1 = r1.setClassName(r2, r0)
            r0 = 1
            r2.startActivityForResult(r1, r0)
            return
        L_0x0464:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.lastseen.TrustedContactsPresencePrivacyActivity r1 = (com.obwhatsapp.lastseen.TrustedContactsPresencePrivacyActivity) r1
            r0 = 1
            goto L_0x046f
        L_0x046a:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.lastseen.TrustedContactsPresencePrivacyActivity r1 = (com.obwhatsapp.lastseen.TrustedContactsPresencePrivacyActivity) r1
            r0 = 2
        L_0x046f:
            r1.A00 = r0
            return
        L_0x0472:
            java.lang.Object r1 = r13.A00
            com.obwhatsapp.lastseen.TrustedContactsPresencePrivacyActivity r1 = (com.obwhatsapp.lastseen.TrustedContactsPresencePrivacyActivity) r1
            r0 = 4
            r1.A01 = r0
            return
        L_0x047a:
            java.lang.Object r0 = r13.A00
            X.3uV r0 = (X.C76673uV) r0
            X.291 r3 = r0.A00
            boolean r0 = r3.A0r
            if (r0 != 0) goto L_0x04a8
            android.app.Activity r2 = r3.A0E
            X.2iV r1 = new X.2iV
            r1.<init>(r2)
            r0 = 2131232302(0x7f08062e, float:1.808071E38)
            r1.A01 = r0
            java.lang.String[] r0 = X.AnonymousClass1GE.A07
            r1.A0K = r0
            r0 = 2131890639(0x7f1211cf, float:1.9415975E38)
            r1.A09 = r0
            r0 = 2131890640(0x7f1211d0, float:1.9415978E38)
            r1.A06 = r0
            android.content.Intent r1 = r1.A00()
            r0 = 34
            r2.startActivityForResult(r1, r0)
            return
        L_0x04a8:
            X.1P7 r2 = r3.A1L
            android.app.Activity r1 = r3.A0E
            X.0rv r0 = r3.A0c
            r2.A06(r1, r0)
            return
        L_0x04b2:
            java.lang.Object r0 = r13.A00
            com.obwhatsapp.mediacomposer.ImageComposerFragment r0 = (com.obwhatsapp.mediacomposer.ImageComposerFragment) r0
            X.1bo r0 = r0.A07
            r0.A09()
            return
        L_0x04bc:
            java.lang.Object r0 = r13.A00
            X.29G r0 = (X.AnonymousClass29G) r0
            r0.AZg()
            return
        L_0x04c4:
            java.lang.Object r0 = r13.A00
            X.4PB r0 = (X.AnonymousClass4PB) r0
            X.5Q0 r0 = r0.A0D
            r0.Ah3()
            return
        L_0x04ce:
            X.1PD r8 = r2.A06
            X.0pt r5 = r2.A02
            X.0so r3 = r2.A01
            X.0sq r9 = r2.A0E
            X.0tA r6 = r2.A05
            X.0pN r4 = (X.C14550pN) r4
            X.0zJ r2 = r2.A00
            X.C18820xJ.A06(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x04e0:
            java.lang.String r0 = r5.A02
            android.content.Intent r2 = X.C13680ns.A0A(r0)
            android.content.Context r0 = r4.A0u()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.android.browser.application_id"
            r2.putExtra(r0, r1)
            r1 = 1
            java.lang.String r0 = "create_new_tab"
            r2.putExtra(r0, r1)
            X.0zJ r1 = r4.A00
            android.content.Context r0 = r4.A0u()
            r1.A06(r0, r2)
            return
        L_0x0503:
            X.AnonymousClass00B.A06(r2)
            r1.Agy(r3)
            X.3R5 r0 = r4.A0A
        L_0x050b:
            r0.A01()
            return
        L_0x050f:
            boolean r0 = r7.A01(r3, r0)     // Catch:{ all -> 0x0612 }
            if (r0 != 0) goto L_0x0517
            goto L_0x0597
        L_0x0517:
            X.0sD r12 = r7.A00     // Catch:{ all -> 0x0612 }
            java.lang.String r0 = "request/token"
            java.lang.String r2 = X.C15970sD.A00(r3, r0)     // Catch:{ all -> 0x0612 }
            java.lang.String r0 = "request/token_ts"
            java.lang.String r1 = X.C15970sD.A00(r3, r0)     // Catch:{ all -> 0x0612 }
            android.content.SharedPreferences r0 = r12.A01()     // Catch:{ all -> 0x0612 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0612 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)     // Catch:{ all -> 0x0612 }
            X.C13690nt.A0v(r0, r1)     // Catch:{ all -> 0x0612 }
            java.lang.String r0 = "auth/encryption_key"
            java.lang.String r1 = X.C15970sD.A00(r3, r0)     // Catch:{ all -> 0x0612 }
            android.content.SharedPreferences r0 = r12.A01()     // Catch:{ all -> 0x0612 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0612 }
            X.C13690nt.A0v(r0, r1)     // Catch:{ all -> 0x0612 }
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch:{ all -> 0x0612 }
            r2.<init>()     // Catch:{ all -> 0x0612 }
            r0 = 16
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0612 }
            r2.nextBytes(r1)     // Catch:{ all -> 0x0612 }
            r0 = 11
            java.lang.String r6 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x0612 }
            java.lang.String r0 = "auth/token"
            java.lang.String r11 = X.C15970sD.A00(r3, r0)     // Catch:{ all -> 0x0612 }
            java.lang.String r0 = "auth/token_ts"
            java.lang.String r10 = X.C15970sD.A00(r3, r0)     // Catch:{ all -> 0x0612 }
            java.lang.String r0 = "metadata/last_active_time"
            java.lang.String r9 = X.C15970sD.A00(r3, r0)     // Catch:{ all -> 0x0612 }
            X.0t3 r0 = r12.A01     // Catch:{ all -> 0x0612 }
            long r0 = r0.A00()     // Catch:{ all -> 0x0612 }
            java.lang.String r2 = "metadata/last_call_ranking_time"
            java.lang.String r8 = X.C15970sD.A00(r3, r2)     // Catch:{ all -> 0x0612 }
            java.lang.String r2 = "metadata/last_message_ranking_time"
            java.lang.String r3 = X.C15970sD.A00(r3, r2)     // Catch:{ all -> 0x0612 }
            android.content.SharedPreferences r2 = r12.A01()     // Catch:{ all -> 0x0612 }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x0612 }
            android.content.SharedPreferences$Editor r2 = r2.putString(r11, r6)     // Catch:{ all -> 0x0612 }
            android.content.SharedPreferences$Editor r2 = r2.putLong(r10, r0)     // Catch:{ all -> 0x0612 }
            android.content.SharedPreferences$Editor r0 = r2.putLong(r9, r0)     // Catch:{ all -> 0x0612 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r8)     // Catch:{ all -> 0x0612 }
            X.C13690nt.A0v(r0, r3)     // Catch:{ all -> 0x0612 }
            goto L_0x0598
        L_0x0597:
            r6 = 0
        L_0x0598:
            monitor-exit(r7)
            X.0tz r0 = r5.A02
            android.content.Context r0 = r0.A00
            android.content.Context r8 = r0.getApplicationContext()
            java.lang.Class<com.obwhatsapp.instrumentation.notification.DelayedNotificationReceiver> r9 = com.obwhatsapp.instrumentation.notification.DelayedNotificationReceiver.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r8, r9)
            r7 = 0
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            android.app.PendingIntent r0 = X.C42341xd.A01(r8, r7, r1, r0)
            if (r0 != 0) goto L_0x05e2
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            double r2 = r0.nextDouble()
            r0 = 4712059816451768320(0x4164997000000000, double:1.08E7)
            double r2 = r2 * r0
            long r0 = (long) r2
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            long r0 = r0 + r2
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 + r0
            X.01V r0 = r5.A08
            android.app.AlarmManager r0 = r0.A04()
            if (r0 == 0) goto L_0x05eb
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r8, r9)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r1 = X.C42341xd.A01(r8, r7, r1, r0)
            X.12r r0 = r5.A01
            r0.A01(r1, r7, r2)
        L_0x05e2:
            if (r6 != 0) goto L_0x05f1
            r1 = 4
            java.lang.String r0 = "Request is not authorized!"
            r5.A36(r1, r0)
            return
        L_0x05eb:
            java.lang.String r0 = "InstrumentationAuthActivity/scheduleDelayedNotification AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x05e2
        L_0x05f1:
            X.0sK r0 = r5.A01
            r0.A0B()
            X.1Zb r1 = r0.A01
            if (r1 == 0) goto L_0x0603
            X.0sI r0 = r5.A07
            boolean r0 = r0.A00(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0604
        L_0x0603:
            r1 = 0
        L_0x0604:
            java.lang.String r0 = "authorization_token"
            r4.putExtra(r0, r6)
            java.lang.String r0 = "is_test_user"
            r4.putExtra(r0, r1)
            X.C13680ns.A0r(r5, r4)
            return
        L_0x0612:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0615:
            X.050 r2 = X.C13680ns.A0O(r3)
            r1 = 2131363776(0x7f0a07c0, float:1.834737E38)
            com.obwhatsapp.instrumentation.ui.ConfirmFragment r0 = r3.A05
            r2.A0A(r0, r1)
            r0 = 0
            r2.A0I(r0)
            r2.A01()
            return
        L_0x0629:
            com.obwhatsapp.location.PlaceInfo r0 = r1.A0g
            if (r0 == 0) goto L_0x0640
            java.lang.Object r1 = r0.A0D
            if (r1 == 0) goto L_0x0638
            X.0IS r1 = (X.AnonymousClass0IS) r1
            X.0Nk r0 = r4.A05
            r1.A0I(r0)
        L_0x0638:
            X.29S r1 = r4.A0N
            r0 = 0
            r1.A0g = r0
            r1.A0B()
        L_0x0640:
            X.29S r1 = r4.A0N
            boolean r0 = r1.A0p
            android.view.View r1 = r1.A0E
            int r0 = X.C13680ns.A02(r0)
            r1.setVisibility(r0)
            X.2jx r0 = r4.A0M
            r0.A0L()
            return
        L_0x0653:
            com.obwhatsapp.location.PlaceInfo r0 = r1.A0g
            if (r0 == 0) goto L_0x066a
            java.lang.Object r1 = r0.A0D
            if (r1 == 0) goto L_0x0662
            X.1gN r1 = (X.C32451gN) r1
            X.4C4 r0 = r3.A04
            r1.A05(r0)
        L_0x0662:
            X.29S r1 = r3.A0T
            r0 = 0
            r1.A0g = r0
            r1.A0B()
        L_0x066a:
            X.29S r1 = r3.A0T
            boolean r0 = r1.A0p
            android.view.View r1 = r1.A0E
            int r0 = X.C13680ns.A02(r0)
            r1.setVisibility(r0)
            X.2jz r0 = r3.A0S
            r0.A09()
            return
        L_0x067d:
            android.content.Context r1 = r14.getContext()
            X.013 r0 = r8.A0B
            X.29l r0 = r2.A7b(r1, r0, r3)
            r5.A0J(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.ViewOnClickCListenerShape18S0100000_I1_3.onClick(android.view.View):void");
    }
}
