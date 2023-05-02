package com.facebook.redex;

import android.view.View;

public class ViewOnClickCListenerShape3S0200000_I0 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickCListenerShape3S0200000_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
        X.AnonymousClass29T.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04d8, code lost:
        r1.A0B(11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04e1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x059c, code lost:
        r3.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x059f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x062a, code lost:
        r3.A04.A03 = r0.getText().toString();
        r3.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0639, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x068c, code lost:
        if (r5.A07.A00(r5.A03.A0A(r5.A08)) != false) goto L_0x068e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x07a5, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x07a8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x07d8, code lost:
        r2.putExtra(r1, r0);
        r4.A03.A1u(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x07e0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x096d, code lost:
        r1 = new android.content.Intent(r0);
        r1.setClass(r3, com.obwhatsapp.migration.export.service.MessagesExporterService.class);
        r1.putExtra("IS_FIRST_PARTY", false);
        X.C446524y.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0980, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0b09, code lost:
        r3.A0B(new X.C49812Vy(r2, 300));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0b13, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        r2.run();
     */
    /* JADX WARNING: Removed duplicated region for block: B:376:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A02
            r3 = r16
            switch(r0) {
                case 0: goto L_0x08ec;
                case 1: goto L_0x05a0;
                case 2: goto L_0x054a;
                case 3: goto L_0x051f;
                case 4: goto L_0x04e2;
                case 5: goto L_0x08d7;
                case 6: goto L_0x04ad;
                case 7: goto L_0x0018;
                case 8: goto L_0x0485;
                case 9: goto L_0x046e;
                case 10: goto L_0x087e;
                case 11: goto L_0x0429;
                case 12: goto L_0x0835;
                case 13: goto L_0x07ef;
                case 14: goto L_0x07e1;
                case 15: goto L_0x07c8;
                case 16: goto L_0x07ba;
                case 17: goto L_0x07ba;
                case 18: goto L_0x07a9;
                case 19: goto L_0x078b;
                case 20: goto L_0x0751;
                case 21: goto L_0x0417;
                case 22: goto L_0x03ce;
                case 23: goto L_0x0745;
                case 24: goto L_0x06f7;
                case 25: goto L_0x06d2;
                case 26: goto L_0x0397;
                case 27: goto L_0x036b;
                case 28: goto L_0x0340;
                case 29: goto L_0x06c6;
                case 30: goto L_0x0328;
                case 31: goto L_0x0697;
                case 32: goto L_0x0661;
                case 33: goto L_0x063a;
                case 34: goto L_0x0620;
                case 35: goto L_0x060e;
                case 36: goto L_0x05fa;
                case 37: goto L_0x0285;
                case 38: goto L_0x01a6;
                case 39: goto L_0x08fc;
                case 40: goto L_0x0174;
                case 41: goto L_0x05e1;
                case 42: goto L_0x012a;
                case 43: goto L_0x0064;
                case 44: goto L_0x05bb;
                case 45: goto L_0x0054;
                case 46: goto L_0x0049;
                case 47: goto L_0x003e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r15.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 128(0x80, float:1.794E-43)
            X.AnonymousClass29T.A00(r1, r0)
        L_0x0014:
            r2.run()
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            java.lang.Object r4 = r15.A01
            X.2rx r4 = (X.C57822rx) r4
            X.269 r3 = r0.A0M
            if (r3 != 0) goto L_0x0032
            java.lang.String r0 = "viewModel"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0032:
            X.2rx r0 = r3.A08
            boolean r0 = X.C18450wi.A0R(r4, r0)
            if (r0 == 0) goto L_0x089b
            X.1cy r1 = r3.A0f
            goto L_0x04d8
        L_0x003e:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r15.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x005e
        L_0x0049:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r15.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x005e
        L_0x0054:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r2 = r15.A01
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 126(0x7e, float:1.77E-43)
        L_0x005e:
            X.AnonymousClass29T.A00(r1, r0)
            if (r2 == 0) goto L_0x0017
            goto L_0x0014
        L_0x0064:
            java.lang.Object r5 = r15.A00
            X.1VX r5 = (X.AnonymousClass1VX) r5
            java.lang.Object r0 = r15.A01
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r6 = r0.iterator()
        L_0x0075:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x009d
            java.lang.Object r1 = r6.next()
            X.1VX r1 = (X.AnonymousClass1VX) r1
            android.widget.CheckBox r0 = r1.A04
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x0075
            X.1sn r0 = r1.A00
            if (r0 == 0) goto L_0x0075
            long r3 = r0.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0075
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r8.add(r0)
            goto L_0x0075
        L_0x009d:
            X.1s2 r4 = r5.A01
            if (r4 == 0) goto L_0x0017
            X.1N9 r6 = r5.A0H
            java.util.List r0 = r4.A04
            if (r0 == 0) goto L_0x0128
            java.util.Iterator r2 = r0.iterator()
        L_0x00ab:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0128
            java.lang.Object r1 = r2.next()
            X.0tZ r1 = (X.C16740tZ) r1
            X.1Vw r0 = r1.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r1 instanceof X.C39181s3
            if (r0 == 0) goto L_0x00ab
            r7 = 1
        L_0x00c2:
            boolean r0 = r8.isEmpty()
            X.3sB r2 = new X.3sB
            r2.<init>()
            X.1Vw r1 = r4.A11
            X.0rv r3 = r1.A00
            if (r0 == 0) goto L_0x0119
            r6.A01(r2, r3)
            X.AnonymousClass1N9.A00(r2, r4)
            r0 = 5
        L_0x00d8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A03 = r0
            X.0t9 r0 = r6.A01
            r0.A06(r2)
            X.0tb r2 = r5.A09
            X.0pd r0 = r2.A0y
            boolean r0 = X.C34311k3.A01(r0)
            if (r0 == 0) goto L_0x0017
            com.whatsapp.jid.UserJid r0 = r4.A0C()
            X.23X r7 = new X.23X
            r7.<init>(r0, r1)
            long r11 = r4.A13
            X.17g r1 = r2.A1N
            X.AnonymousClass00B.A06(r3)
            X.0t3 r0 = r2.A0Q
            long r9 = r0.A00()
            long r13 = r0.A00()
            X.18b r1 = r1.A05
            r0 = 1
            X.1Vw r6 = r1.A02(r3, r0)
            X.1s3 r5 = new X.1s3
            r5.<init>((X.C28381Vw) r6, (X.AnonymousClass23X) r7, (java.util.List) r8, (long) r9, (long) r11, (long) r13)
            X.1Sj r0 = r2.A0t
            r0.A00(r5)
            return
        L_0x0119:
            r6.A01(r2, r3)
            if (r7 == 0) goto L_0x0123
            X.AnonymousClass1N9.A00(r2, r4)
            r0 = 7
            goto L_0x00d8
        L_0x0123:
            X.AnonymousClass1N9.A00(r2, r4)
            r0 = 6
            goto L_0x00d8
        L_0x0128:
            r7 = 0
            goto L_0x00c2
        L_0x012a:
            java.lang.Object r6 = r15.A00
            X.0yi r6 = (X.C19610yi) r6
            X.1rH r2 = r6.A01()
            if (r2 == 0) goto L_0x0017
            X.1Vw r0 = r2.A11
            X.0rv r5 = r0.A00
            if (r5 == 0) goto L_0x0017
            java.lang.Object r1 = r15.A01
            X.01D r1 = (X.AnonymousClass01D) r1
            java.lang.Object r0 = r1.get()
            X.1B9 r0 = (X.AnonymousClass1B9) r0
            r0.A00 = r2
            java.lang.Object r0 = r1.get()
            X.1B9 r0 = (X.AnonymousClass1B9) r0
            r0.A02(r5)
            android.content.Context r4 = r3.getContext()
            X.0ph r0 = new X.0ph
            r0.<init>()
            long r2 = r2.A13
            android.content.Intent r1 = r0.A0y(r4, r5)
            java.lang.String r0 = "row_id"
            r1.putExtra(r0, r2)
            r4.startActivity(r1)
            X.2DT r1 = r6.A00()
            if (r1 == 0) goto L_0x0017
            int r0 = r1.A05
            int r0 = r0 + 1
            r1.A05 = r0
            return
        L_0x0174:
            java.lang.Object r4 = r15.A00
            com.obwhatsapp.migration.export.ui.ExportMigrationActivity r4 = (com.obwhatsapp.migration.export.ui.ExportMigrationActivity) r4
            java.lang.Object r0 = r15.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r3 = 1
            if (r3 != r1) goto L_0x0191
            X.0tz r0 = r4.A0C
            android.content.Context r3 = r0.A00
            java.lang.String r0 = "xpm-export-service-cancelExport()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "ACTION_CANCEL_EXPORT"
            goto L_0x096d
        L_0x0191:
            r0 = 4
            if (r0 != r1) goto L_0x0017
            r0 = 35
            com.facebook.redex.RunnableRunnableShape11S0100000_I0_10 r2 = new com.facebook.redex.RunnableRunnableShape11S0100000_I0_10
            r2.<init>((java.lang.Object) r4, (int) r0)
            r1 = 33
            com.facebook.redex.RunnableRunnableShape11S0100000_I0_10 r0 = new com.facebook.redex.RunnableRunnableShape11S0100000_I0_10
            r0.<init>((java.lang.Object) r4, (int) r1)
            r4.A38(r2, r0, r3)
            return
        L_0x01a6:
            java.lang.Object r0 = r15.A00
            X.2ji r0 = (X.C55502ji) r0
            java.lang.Object r11 = r15.A01
            X.0sH r11 = (X.C16010sH) r11
            X.2Cu r3 = r0.A0G
            com.obwhatsapp.mentions.MentionableEntry r3 = (com.obwhatsapp.mentions.MentionableEntry) r3
            android.text.Editable r5 = r3.getText()
            r4 = 1
            boolean r0 = r3.A0G
            if (r0 == r4) goto L_0x01d9
            int r0 = r3.getInputType()
            r3.A02 = r0
            r3.A0G = r4
            r0 = 147457(0x24001, float:2.06631E-40)
            r3.setInputType(r0)
            int r2 = r3.getSelectionStart()
            int r1 = r3.getSelectionEnd()
            r0 = -1
            if (r2 == r0) goto L_0x01d9
            if (r1 == r0) goto L_0x01d9
            r3.setSelection(r2, r1)
        L_0x01d9:
            X.0zK r0 = r3.A0E
            X.AnonymousClass00B.A06(r0)
            java.lang.String r10 = r0.A01(r11)
            r7 = 0
            int r1 = r3.A06(r5, r7)
            int r0 = r3.getSelectionStart()
            int r1 = java.lang.Math.min(r1, r0)
            if (r1 >= 0) goto L_0x01f5
            int r1 = r3.getSelectionStart()
        L_0x01f5:
            int r9 = r1 + 1
            java.lang.String r12 = "@"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            r0.append(r10)
            java.lang.String r13 = r0.toString()
            X.3MM r0 = r3.A0C
            r3.A0C(r0)
            r8 = 0
            r3.A0C = r8
            int r6 = r3.getSelectionEnd()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            java.lang.String r0 = " "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r5.replace(r1, r6, r0)
            int r0 = r3.A00
            X.3MM r6 = new X.3MM
            r6.<init>(r0, r4)
            r4 = 33
            r5.setSpan(r6, r1, r9, r4)
            int r2 = r3.A01
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r11.A08(r0)
            X.AnonymousClass00B.A06(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r12)
            java.lang.String r0 = r0.user
            X.AnonymousClass00B.A06(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.3MN r1 = new X.3MN
            r1.<init>(r6, r0, r2)
            int r0 = r10.length()
            int r0 = r0 + r9
            r5.setSpan(r1, r9, r0, r4)
            r3.setSelection(r7)
            int r0 = r5.getSpanEnd(r1)
            int r0 = r0 + 1
            r3.setSelection(r0)
            r3.A0E(r8)
            boolean r0 = r3.A0G
            if (r0 == r7) goto L_0x0017
            r3.A0G = r7
            int r0 = r3.A02
            r3.setInputType(r0)
            int r2 = r3.getSelectionStart()
            int r1 = r3.getSelectionEnd()
            r0 = -1
            if (r2 == r0) goto L_0x0017
            if (r1 == r0) goto L_0x0017
            r3.setSelection(r2, r1)
            return
        L_0x0285:
            java.lang.String r0 = "mediaview/audioclick "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.Object r6 = r15.A00
            android.widget.ProgressBar r6 = (android.widget.ProgressBar) r6
            int r0 = r6.getProgress()
            r1.append(r0)
            java.lang.String r0 = " | "
            r1.append(r0)
            int r0 = r6.getMax()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.Object r2 = r15.A01
            com.obwhatsapp.mediaview.MediaViewFragment r2 = (com.obwhatsapp.mediaview.MediaViewFragment) r2
            int r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1bx r0 = r2.A1W
            if (r0 == 0) goto L_0x0017
            int r0 = r2.A01
            r5 = 2
            r4 = 1
            r3 = 0
            if (r0 != r5) goto L_0x02e2
            int r0 = r6.getProgress()
            if (r0 <= 0) goto L_0x02e2
            int r1 = r6.getProgress()
            int r0 = r6.getMax()
            if (r1 >= r0) goto L_0x02e2
            X.1Az r1 = r2.A1X
            r0 = 2131890860(0x7f1212ac, float:1.9416424E38)
            r1.A02(r0)
            X.0yi r0 = r2.A0b
            r0.A04()
            goto L_0x0a0e
        L_0x02e2:
            int r0 = r2.A01
            if (r0 != r5) goto L_0x0303
            X.1bx r0 = r2.A1W
            int r1 = r0.A02()
            X.1bx r0 = r2.A1W
            int r0 = r0.A03()
            if (r1 < r0) goto L_0x0a1e
            int r1 = r6.getProgress()
            int r0 = r6.getMax()
            if (r1 != r0) goto L_0x0a1e
            r6.setProgress(r3)
            goto L_0x0a14
        L_0x0303:
            if (r0 != r4) goto L_0x0309
            r2.A1V()
            return
        L_0x0309:
            int r0 = r2.A03
            X.0tY r0 = r2.A1U(r0)
            X.AnonymousClass00B.A06(r0)
            r2.A1a(r0)
            X.1bx r0 = r2.A1W
            if (r0 == 0) goto L_0x0017
            X.1Az r1 = r2.A1X
            r0 = 2131890860(0x7f1212ac, float:1.9416424E38)
            r1.A02(r0)
            X.0yi r0 = r2.A0b
            r0.A04()
            goto L_0x0a48
        L_0x0328:
            java.lang.Object r5 = r15.A00
            X.2O2 r5 = (X.AnonymousClass2O2) r5
            java.lang.Object r4 = r15.A01
            X.4I0 r4 = (X.AnonymousClass4I0) r4
            X.2AH r1 = r5.A0C
            X.05J r0 = r1.A00
            if (r0 == 0) goto L_0x0a79
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0017
            X.0rx r0 = r4.A00
            r1.A0G(r0, r5)
            return
        L_0x0340:
            java.lang.Object r3 = r15.A00
            com.obwhatsapp.group.GroupAdminPickerActivity r3 = (com.obwhatsapp.group.GroupAdminPickerActivity) r3
            java.lang.Object r1 = r15.A01
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.view.View r0 = r3.A03
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0017
            float r2 = r1.y
            android.view.View r0 = r3.A02
            float r1 = r0.getY()
            android.view.View r0 = r3.A02
            int r0 = r0.getPaddingTop()
            float r0 = (float) r0
            float r1 = r1 + r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r3.A06
            r0 = 4
            r1.A0M(r0)
            return
        L_0x036b:
            java.lang.Object r5 = r15.A00
            X.2JC r5 = (X.AnonymousClass2JC) r5
            java.lang.Object r0 = r15.A01
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x0377:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0017
            java.lang.Object r3 = r4.next()
            X.0rv r3 = (X.C15830rv) r3
            boolean r0 = X.C16030sJ.A0R(r3)
            if (r0 != 0) goto L_0x0377
            com.obwhatsapp.conversationslist.ConversationsFragment r0 = r5.A0L
            X.0xS r2 = r0.A1L
            r1 = 1
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A04(r3, r0, r1)
            goto L_0x0377
        L_0x0397:
            java.lang.Object r3 = r15.A00
            X.2TM r3 = (X.AnonymousClass2TM) r3
            java.lang.Object r4 = r15.A01
            android.content.Context r4 = (android.content.Context) r4
            X.0pd r2 = r3.A0M
            r1 = 1948(0x79c, float:2.73E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0017
            com.obwhatsapp.WaTextView r0 = r3.A08
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0017
            X.0tZ r3 = r3.getFMessage()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.polls.PollResultsActivity"
            r2.setClassName(r1, r0)
            X.1Vw r0 = r3.A11
            X.AnonymousClass1yL.A00(r2, r0)
            r4.startActivity(r2)
            return
        L_0x03ce:
            java.lang.Object r4 = r15.A00
            X.1cT r4 = (X.C30511cT) r4
            java.lang.Object r5 = r15.A01
            android.app.Activity r5 = (android.app.Activity) r5
            r1 = 2131366765(0x7f0a136d, float:1.8353433E38)
            X.00k r0 = r4.A0K
            android.view.View r2 = r0.findViewById(r1)
            X.2hp r1 = r4.A0O
            r0 = 2131893719(0x7f121dd7, float:1.9422222E38)
            java.lang.String r0 = r1.A00(r0)
            android.os.Bundle r3 = X.C455529g.A05(r5, r2, r0)
            X.0sH r1 = r4.A0G
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r2 = r1.A08(r0)
            X.AnonymousClass00B.A06(r2)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            android.content.Intent r0 = X.C14750ph.A0Z(r5, r2, r1, r0)
            r5.startActivity(r0, r3)
            X.0zS r3 = r4.A0Z
            if (r3 == 0) goto L_0x0017
            X.0rv r0 = r4.A0h
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r0)
            r1 = 0
            r0 = 11
            r3.A01(r2, r1, r0)
            return
        L_0x0417:
            java.lang.Object r2 = r15.A00
            X.28C r2 = (X.AnonymousClass28C) r2
            java.lang.Object r1 = r15.A01
            X.0sH r1 = (X.C16010sH) r1
            boolean r0 = r1.A0g
            if (r0 == 0) goto L_0x0017
            X.1V8 r0 = r2.A00
            r0.A3W(r1)
            return
        L_0x0429:
            java.lang.Object r2 = r15.A00
            X.2V5 r2 = (X.AnonymousClass2V5) r2
            java.lang.Object r3 = r15.A01
            X.1aI r3 = (X.C29251aI) r3
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x0a9e
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x0a9e
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1067450368(0x3fa00000, float:1.25)
            r9 = 1
            r10 = 1056964608(0x3f000000, float:0.5)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 1067450368(0x3fa00000, float:1.25)
            r11 = 1
            r12 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r4 = new android.view.animation.ScaleAnimation
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 220(0xdc, double:1.087E-321)
            r4.setDuration(r0)
            android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator
            r0.<init>()
            r4.setInterpolator(r0)
            com.obwhatsapp.IDxLAdapterShape12S0200000_2_I1 r0 = new com.obwhatsapp.IDxLAdapterShape12S0200000_2_I1
            r0.<init>(r3, r9, r2)
            r4.setAnimationListener(r0)
            com.obwhatsapp.WaImageView r0 = r2.A0I
            r0.startAnimation(r4)
            com.obwhatsapp.CircularProgressBar r0 = r2.A06
            if (r0 == 0) goto L_0x0017
            r0.startAnimation(r4)
            return
        L_0x046e:
            java.lang.Object r0 = r15.A00
            X.26F r0 = (X.AnonymousClass26F) r0
            java.lang.Object r1 = r15.A01
            X.1px r1 = (X.C37921px) r1
            X.4Q9 r0 = r0.A02
            if (r0 == 0) goto L_0x0017
            com.obwhatsapp.calling.callgrid.view.CallGrid r0 = r0.A00
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r0.A05
            X.AnonymousClass00B.A06(r0)
            r0.A0F(r1)
            return
        L_0x0485:
            java.lang.Object r4 = r15.A00
            com.obwhatsapp.calling.callgrid.view.FocusViewContainer r4 = (com.obwhatsapp.calling.callgrid.view.FocusViewContainer) r4
            java.lang.Object r0 = r15.A01
            X.4M0 r0 = (X.AnonymousClass4M0) r0
            com.obwhatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r1 = r4.A06
            int r0 = r0.A02
            com.whatsapp.jid.UserJid r3 = r1.A02
            if (r3 == 0) goto L_0x04a3
            X.1cy r2 = r1.A0C
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r3, r1)
            r2.A0B(r0)
        L_0x04a3:
            X.26E r0 = r4.A05
            if (r0 == 0) goto L_0x0017
            android.view.View r0 = r0.A0H
            r0.performClick()
            return
        L_0x04ad:
            java.lang.Object r0 = r15.A00
            com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            java.lang.Object r5 = r15.A01
            X.2ry r5 = (X.C57832ry) r5
            X.269 r6 = r0.A0M
            if (r6 != 0) goto L_0x04c7
            java.lang.String r0 = "viewModel"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x04c7:
            X.4je r3 = r5.A04
            int r1 = r3.A00
            r0 = 2
            if (r1 != r0) goto L_0x0017
            X.2ry r0 = r6.A07
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0aa2
            X.1cy r1 = r6.A0f
        L_0x04d8:
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B(r0)
            return
        L_0x04e2:
            java.lang.Object r5 = r15.A00
            X.0pL r5 = (X.C14530pL) r5
            java.lang.Object r2 = r15.A01
            X.2YJ r2 = (X.AnonymousClass2YJ) r2
            X.0pf r0 = r5.A06
            long r3 = r0.A01()
            java.lang.String r0 = "settings-gdrive/display-media-restore-error/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = " freeSpace:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            X.0sq r2 = r5.A05
            r1 = 28
            com.facebook.redex.RunnableRunnableShape3S0100000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape3S0100000_I0_2
            r0.<init>(r5, r1)
            r2.Acl(r0)
            return
        L_0x051f:
            java.lang.Object r3 = r15.A00
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r15.A01
            X.3h1 r2 = (X.C70493h1) r2
            java.lang.String r0 = "sharelinkactivity/sendlink/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r2.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = r2.A00
            android.content.Intent r0 = X.C14750ph.A0c(r3, r0)
            goto L_0x059c
        L_0x054a:
            java.lang.Object r3 = r15.A00
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r4 = r15.A01
            X.3h2 r4 = (X.C70503h2) r4
            java.lang.String r0 = "sharelinkactivity/sharelink/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r4.A02
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "android.intent.extra.TEXT"
            r2.putExtra(r0, r1)
            java.lang.String r0 = r4.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x058b
            java.lang.String r1 = r4.A01
            java.lang.String r0 = "android.intent.extra.SUBJECT"
            r2.putExtra(r0, r1)
        L_0x058b:
            java.lang.String r0 = "text/plain"
            r2.setType(r0)
            r0 = 524288(0x80000, float:7.34684E-40)
            r2.addFlags(r0)
            java.lang.String r0 = r4.A00
            android.content.Intent r0 = android.content.Intent.createChooser(r2, r0)
        L_0x059c:
            r3.startActivity(r0)
            return
        L_0x05a0:
            java.lang.Object r4 = r15.A00
            X.0pN r4 = (X.C14550pN) r4
            java.lang.Object r3 = r15.A01
            X.3h0 r3 = (X.C70483h0) r3
            X.01V r0 = r4.A08
            android.content.ClipboardManager r1 = r0.A0B()
            r2 = 0
            if (r1 == 0) goto L_0x0b2d
            java.lang.String r0 = r3.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0017
            goto L_0x0b14
        L_0x05bb:
            java.lang.Object r3 = r15.A00
            X.2WW r3 = (X.AnonymousClass2WW) r3
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r3.A07 = r0
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x05d4
            com.obwhatsapp.qrcode.WaQrScannerView r0 = r3.A05
            r0.AcJ()
        L_0x05d4:
            com.obwhatsapp.qrcode.WaQrScannerView r2 = r3.A05
            r1 = 48
            com.facebook.redex.RunnableRunnableShape12S0100000_I0_11 r0 = new com.facebook.redex.RunnableRunnableShape12S0100000_I0_11
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.post(r0)
            return
        L_0x05e1:
            java.lang.Object r2 = r15.A00
            X.0yi r2 = (X.C19610yi) r2
            X.2DT r1 = r2.A00()
            if (r1 == 0) goto L_0x05ee
            r0 = 1
            r1.A0W = r0
        L_0x05ee:
            java.lang.Object r1 = r15.A01
            X.01D r1 = (X.AnonymousClass01D) r1
            android.view.View r0 = r3.getRootView()
            X.AnonymousClass2DE.A04(r0, r2, r1)
            return
        L_0x05fa:
            java.lang.Object r2 = r15.A00
            com.obwhatsapp.mediaview.MediaViewBaseFragment r2 = (com.obwhatsapp.mediaview.MediaViewBaseFragment) r2
            java.lang.Object r0 = r15.A01
            com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0 r0 = (com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0) r0
            r3.setOnClickListener(r0)
            boolean r0 = r2.A0G
            r1 = r0 ^ 1
            r0 = 1
            r2.A1P(r1, r0)
            return
        L_0x060e:
            java.lang.Object r2 = r15.A00
            X.2k1 r2 = (X.C55602k1) r2
            java.lang.Object r3 = r15.A01
            X.4zb r3 = (X.C102834zb) r3
            com.obwhatsapp.mediacomposer.doodle.ColorPickerComponent r1 = r2.A04
            boolean r0 = r2.A06
            r1.A05(r0)
            com.obwhatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r2.A05
            goto L_0x062a
        L_0x0620:
            java.lang.Object r0 = r15.A00
            X.2k1 r0 = (X.C55602k1) r0
            java.lang.Object r3 = r15.A01
            X.4zb r3 = (X.C102834zb) r3
            com.obwhatsapp.mediacomposer.doodle.textentry.DoodleEditText r0 = r0.A05
        L_0x062a:
            android.text.Editable r0 = r0.getText()
            java.lang.String r1 = r0.toString()
            X.4MW r0 = r3.A04
            r0.A03 = r1
            r3.dismiss()
            return
        L_0x063a:
            java.lang.Object r0 = r15.A00
            X.2OT r0 = (X.AnonymousClass2OT) r0
            java.lang.Object r5 = r15.A01
            android.content.Context r5 = (android.content.Context) r5
            X.0zJ r4 = r0.A00
            X.0sL r3 = r0.A08
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity"
            r2.setClassName(r1, r0)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "parent_group_jid"
            r2.putExtra(r0, r1)
            r4.A06(r5, r2)
            return
        L_0x0661:
            java.lang.Object r5 = r15.A00
            X.2OT r5 = (X.AnonymousClass2OT) r5
            java.lang.Object r0 = r15.A01
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r4 = X.C19980zJ.A00(r0)
            X.0pN r4 = (X.C14550pN) r4
            X.0sL r3 = r5.A08
            X.0pd r2 = r5.A06
            r1 = 2818(0xb02, float:3.949E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x068e
            X.0sG r1 = r5.A03
            X.0sL r0 = r5.A08
            X.0sH r1 = r1.A0A(r0)
            X.15l r0 = r5.A07
            boolean r0 = r0.A00(r1)
            r1 = 1
            if (r0 == 0) goto L_0x068f
        L_0x068e:
            r1 = 0
        L_0x068f:
            com.obwhatsapp.community.CommunitySpamReportDialogFragment r0 = com.obwhatsapp.community.CommunitySpamReportDialogFragment.A01(r3, r1)
            r4.Afc(r0)
            return
        L_0x0697:
            java.lang.Object r1 = r15.A00
            X.2OT r1 = (X.AnonymousClass2OT) r1
            java.lang.Object r0 = r15.A01
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r3 = X.C19980zJ.A00(r0)
            X.0pN r3 = (X.C14550pN) r3
            X.0sL r0 = r1.A08
            java.util.List r0 = java.util.Collections.singletonList(r0)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.util.ArrayList r1 = X.C16030sJ.A06(r0)
            java.lang.String r0 = "selectedParentJids"
            r2.putStringArrayList(r0, r1)
            com.obwhatsapp.community.CommunityDeleteDialogFragment r0 = new com.obwhatsapp.community.CommunityDeleteDialogFragment
            r0.<init>()
            r0.A0T(r2)
            r3.Afc(r0)
            return
        L_0x06c6:
            java.lang.Object r1 = r15.A00
            com.obwhatsapp.group.GroupChatInfoActivity r1 = (com.obwhatsapp.group.GroupChatInfoActivity) r1
            java.lang.Object r0 = r15.A01
            X.2hp r0 = (X.C54602hp) r0
            com.obwhatsapp.group.GroupChatInfoActivity.A02(r0, r1)
            return
        L_0x06d2:
            java.lang.Object r4 = r15.A00
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r1 = r15.A01
            X.0sH r1 = (X.C16010sH) r1
            r2 = 0
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r1.A08(r0)
            X.0rv r0 = (X.C15830rv) r0
            X.3AW r1 = new X.3AW
            r1.<init>((android.view.View) r3, (X.C15830rv) r0, (java.lang.Integer) r2)
            r0 = 1
            r1.A00 = r0
            android.content.Context r0 = r4.getContext()
            android.app.Activity r0 = X.AnonymousClass22N.A00(r0)
            r1.A02(r0)
            return
        L_0x06f7:
            java.lang.Object r5 = r15.A00
            X.2Qc r5 = (X.C48962Qc) r5
            java.lang.Object r4 = r15.A01
            android.app.Activity r4 = (android.app.Activity) r4
            X.0sH r0 = r5.A0G
            X.0rv r2 = r0.A0E
            r1 = 1
            r0 = 0
            android.content.Intent r3 = X.C14750ph.A0W(r4, r2, r1, r0, r0)
            X.0uk r2 = r5.A0B
            X.0sL r1 = r5.A0O
            int r0 = r5.A00
            boolean r0 = r2.A0E(r1, r0)
            if (r0 == 0) goto L_0x073b
            X.1j5 r0 = r5.A07
            android.view.View r0 = r0.A02()
            com.obwhatsapp.community.SubgroupPileView r0 = (com.obwhatsapp.community.SubgroupPileView) r0
            com.obwhatsapp.components.button.ThumbnailButton r2 = r0.A01
        L_0x071f:
            X.2hp r1 = r5.A0O
            r0 = 2131893719(0x7f121dd7, float:1.9422222E38)
            java.lang.String r0 = r1.A00(r0)
            android.os.Bundle r1 = X.C455529g.A05(r4, r2, r0)
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getSimpleName()
            X.AnonymousClass22U.A00(r3, r0)
            r4.startActivity(r3, r1)
            return
        L_0x073b:
            r1 = 2131366765(0x7f0a136d, float:1.8353433E38)
            X.00k r0 = r5.A0K
            android.view.View r2 = r0.findViewById(r1)
            goto L_0x071f
        L_0x0745:
            java.lang.Object r1 = r15.A00
            X.2AK r1 = (X.AnonymousClass2AK) r1
            java.lang.Object r0 = r15.A01
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            r1.AUD(r0)
            return
        L_0x0751:
            java.lang.Object r4 = r15.A00
            com.obwhatsapp.contact.picker.ContactPickerFragment r4 = (com.obwhatsapp.contact.picker.ContactPickerFragment) r4
            java.lang.Object r3 = r15.A01
            android.content.Intent r3 = (android.content.Intent) r3
            X.1Ka r2 = r4.A0b
            java.util.Random r0 = r2.A02
            if (r0 != 0) goto L_0x0766
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2.A02 = r0
        L_0x0766:
            long r0 = r0.nextLong()
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            r2.A01 = r0
            X.3ss r1 = new X.3ss
            r1.<init>()
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            r2.A01(r1)
            X.0zJ r1 = r4.A0L
            android.content.Context r0 = r4.A02()
            r1.A06(r0, r3)
            X.4uj r0 = r4.A0x
            goto L_0x07a5
        L_0x078b:
            java.lang.Object r3 = r15.A00
            com.obwhatsapp.contact.picker.ContactPickerFragment r3 = (com.obwhatsapp.contact.picker.ContactPickerFragment) r3
            java.lang.Object r2 = r15.A01
            android.content.Intent r2 = (android.content.Intent) r2
            X.0zJ r1 = r3.A0L
            android.content.Context r0 = r3.A02()
            r1.A06(r0, r2)
            X.0ui r2 = r3.A0d
            r1 = 1
            r0 = 4
            r2.A02(r1, r0)
            X.4uj r0 = r3.A0x
        L_0x07a5:
            r0.A00()
            return
        L_0x07a9:
            java.lang.Object r4 = r15.A00
            X.2Rm r4 = (X.C49182Rm) r4
            java.lang.Object r3 = r15.A01
            X.0sH r3 = (X.C16010sH) r3
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = "call_type"
            r0 = 2
            goto L_0x07d8
        L_0x07ba:
            java.lang.Object r0 = r15.A00
            X.2Rm r0 = (X.C49182Rm) r0
            java.lang.Object r1 = r15.A01
            X.0sH r1 = (X.C16010sH) r1
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = r0.A03
            r0.A1d(r1)
            return
        L_0x07c8:
            java.lang.Object r4 = r15.A00
            X.2Rm r4 = (X.C49182Rm) r4
            java.lang.Object r3 = r15.A01
            X.0sH r3 = (X.C16010sH) r3
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = "call_type"
            r0 = 1
        L_0x07d8:
            r2.putExtra(r1, r0)
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = r4.A03
            r0.A1u(r2, r3)
            return
        L_0x07e1:
            java.lang.Object r0 = r15.A00
            X.2Rm r0 = (X.C49182Rm) r0
            java.lang.Object r1 = r15.A01
            X.4xB r1 = (X.C101354xB) r1
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = r0.A03
            r0.A1a(r1)
            return
        L_0x07ef:
            java.lang.Object r4 = r15.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r4 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r4
            java.lang.Object r2 = r15.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.2jg r1 = r4.A13
            if (r1 == 0) goto L_0x07ff
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A00 = r0
        L_0x07ff:
            com.obwhatsapp.status.viewmodels.StatusesViewModel r0 = r4.A1M
            if (r0 == 0) goto L_0x082e
            X.2XQ r3 = r0.A05(r2)
        L_0x0807:
            boolean r0 = r4.A3g()
            if (r0 == 0) goto L_0x0819
            X.0pd r2 = r4.A0C
            r1 = 638(0x27e, float:8.94E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 != 0) goto L_0x081d
        L_0x0819:
            boolean r0 = r4.A1V
            if (r0 == 0) goto L_0x0831
        L_0x081d:
            if (r3 == 0) goto L_0x0831
            boolean r0 = r3.A00()
            if (r0 == 0) goto L_0x0831
            com.obwhatsapp.chatinfo.ViewPhotoOrStatusDialogFragment r0 = new com.obwhatsapp.chatinfo.ViewPhotoOrStatusDialogFragment
            r0.<init>()
            r4.Afc(r0)
            return
        L_0x082e:
            X.2XQ r3 = r4.A1L
            goto L_0x0807
        L_0x0831:
            r4.A3R()
            return
        L_0x0835:
            java.lang.Object r4 = r15.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r4 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r4
            java.lang.Object r2 = r15.A01
            X.2kQ r2 = (X.C55802kQ) r2
            r0 = 2
            r4.A3a(r0)
            X.0sH r3 = r2.A00
            if (r3 == 0) goto L_0x084d
            X.10c r2 = r4.A0U
            r1 = 6
            r0 = 0
            r2.A01(r4, r3, r1, r0)
            return
        L_0x084d:
            java.lang.String r0 = "tel:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.net.Uri r2 = android.net.Uri.parse(r0)
            java.lang.String r1 = "android.intent.action.DIAL"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r2)
            r4.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x086d }
            goto L_0x087d
        L_0x086d:
            r1 = move-exception
            java.lang.String r0 = "contact_info/dial dialer app not found"
            com.whatsapp.util.Log.w(r0, r1)
            X.0pt r2 = r4.A05
            r1 = 2131892695(0x7f1219d7, float:1.9420146E38)
            r0 = 0
            r2.A09(r1, r0)
            return
        L_0x087d:
            return
        L_0x087e:
            java.lang.Object r2 = r15.A00
            com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner r2 = (com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner) r2
            java.lang.Object r0 = r15.A01
            X.2Tv r0 = (X.C49572Tv) r0
            java.util.List r1 = r0.A07
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0897
            com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = r2.A04
            if (r0 == 0) goto L_0x0897
            X.1cy r0 = r0.A07
            r0.A0B(r1)
        L_0x0897:
            r2.A01()
            return
        L_0x089b:
            X.2rx r2 = r3.A08
            if (r2 == 0) goto L_0x08ab
            X.4je r1 = r2.A0C
            r0 = 0
            r1.A01 = r0
            r0 = 0
            r2.A07(r0)
            r2.A02()
        L_0x08ab:
            X.1US r0 = r4.A0D
            X.C18450wi.A0B(r0)
            r3.A0G(r0)
            X.4je r1 = r4.A0C
            r0 = 1
            r1.A01 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.A07(r0)
            r4.A02()
            r3.A08 = r4
            X.0YG r0 = r3.A02
            if (r0 != 0) goto L_0x08d4
            r1 = 1098383360(0x41780000, float:15.5)
        L_0x08c8:
            X.1cy r3 = r3.A0e
            X.020 r0 = r4.A01()
            X.076 r2 = X.AnonymousClass0T2.A01(r0, r1)
            goto L_0x0b09
        L_0x08d4:
            float r1 = r0.A02
            goto L_0x08c8
        L_0x08d7:
            java.lang.Object r0 = r15.A00
            X.2Xz r0 = (X.AnonymousClass2Xz) r0
            java.lang.Object r2 = r15.A01
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            X.2X0 r1 = r0.A0u
            X.1ZX r2 = (X.AnonymousClass1ZX) r2
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A00(r2, r0)
            return
        L_0x08ec:
            java.lang.Object r0 = r15.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r3)
            java.lang.Object r1 = r15.A00
            X.0rI r1 = (X.C15540rI) r1
            r0 = 1
            r1.A04(r0)
            return
        L_0x08fc:
            java.lang.Object r11 = r15.A00
            com.obwhatsapp.migration.export.ui.ExportMigrationActivity r11 = (com.obwhatsapp.migration.export.ui.ExportMigrationActivity) r11
            java.lang.Object r0 = r15.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r10 = 2
            if (r10 != r1) goto L_0x0919
            java.lang.String r0 = "ExportMigrationActivity/activateContentProviderAndFinishActivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 100
            r11.setResult(r0)
        L_0x0915:
            r11.finish()
            return
        L_0x0919:
            r0 = 4
            if (r0 != r1) goto L_0x094f
            X.1Vg r2 = r11.A0I
            java.lang.String r1 = r11.A0J
            r0 = 13
            r2.A00(r1, r0)
            java.lang.String r0 = "ExportMigrationActivity/upgradeApp/user-accepted-update; playStoreEnabled: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.0xQ r0 = r11.A00
            boolean r0 = r0.A01()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0xQ r0 = r11.A00
            android.net.Uri r2 = r0.A00()
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            X.0zJ r0 = r11.A00
            r0.A06(r11, r1)
            goto L_0x0915
        L_0x094f:
            X.0rz r0 = r11.A09
            boolean r0 = X.AnonymousClass2GK.A0H(r0)
            if (r0 != 0) goto L_0x0981
            X.0yo r0 = r11.A09
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0e
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0981
            X.0tz r0 = r11.A0C
            android.content.Context r3 = r0.A00
            java.lang.String r0 = "xpm-export-service-startExport()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "ACTION_START_EXPORT"
        L_0x096d:
            r2 = 0
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            java.lang.Class<com.obwhatsapp.migration.export.service.MessagesExporterService> r0 = com.obwhatsapp.migration.export.service.MessagesExporterService.class
            r1.setClass(r3, r0)
            java.lang.String r0 = "IS_FIRST_PARTY"
            r1.putExtra(r0, r2)
            X.C446524y.A00(r3, r1)
            return
        L_0x0981:
            X.1Vg r2 = r11.A0I
            java.lang.String r1 = r11.A0J
            r0 = 18
            r2.A00(r1, r0)
            X.12N r0 = r11.A0A
            java.util.concurrent.atomic.AtomicLong r0 = r0.A04
            long r0 = r0.get()
            X.12N r2 = r11.A0A
            java.util.concurrent.atomic.AtomicLong r2 = r2.A05
            long r5 = r2.get()
            r7 = -1
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0a0c
            r2 = 100
            long r2 = r2 * r0
            long r2 = r2 / r5
            int r4 = (int) r2
        L_0x09a6:
            java.lang.String r3 = "ExportMigrationActivity/waitingForRestoreToComplete "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r2)
            r2 = 2131893535(0x7f121d1f, float:1.942185E38)
            java.lang.String r9 = r11.getString(r2)
            r8 = 1
            if (r4 != r7) goto L_0x09e1
            r0 = 2131893533(0x7f121d1d, float:1.9421845E38)
            java.lang.String r0 = r11.getString(r0)
        L_0x09c8:
            X.1fu r2 = new X.1fu
            r2.<init>(r11)
            r2.setTitle(r9)
            r2.A06(r0)
            r2.A07(r8)
            r1 = 2131889799(0x7f120e87, float:1.9414272E38)
            r0 = 0
            r2.setPositiveButton(r1, r0)
            r2.A00()
            return
        L_0x09e1:
            X.013 r2 = r11.A01
            java.lang.String r3 = X.AnonymousClass2GQ.A03(r2, r0)
            r7 = 2131893534(0x7f121d1e, float:1.9421847E38)
            r2 = 3
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r2 = 0
            r4[r2] = r3
            X.013 r2 = r11.A01
            java.lang.String r2 = X.AnonymousClass2GQ.A03(r2, r5)
            r4[r8] = r2
            X.013 r2 = r11.A01
            java.text.NumberFormat r12 = r2.A0L()
            double r2 = (double) r0
            double r0 = (double) r5
            double r2 = r2 / r0
            java.lang.String r0 = r12.format(r2)
            r4[r10] = r0
            java.lang.String r0 = r11.getString(r7, r4)
            goto L_0x09c8
        L_0x0a0c:
            r4 = -1
            goto L_0x09a6
        L_0x0a0e:
            X.1bx r0 = r2.A1W     // Catch:{ IOException -> 0x0a35 }
            r0.A08()     // Catch:{ IOException -> 0x0a35 }
            goto L_0x0a5b
        L_0x0a14:
            X.1bx r0 = r2.A1W     // Catch:{ IOException | IllegalStateException -> 0x0a1a }
            r0.A0A(r3)     // Catch:{ IOException | IllegalStateException -> 0x0a1a }
            goto L_0x0a1e
        L_0x0a1a:
            r1 = move-exception
            java.lang.String r0 = "mediaview/failed to start from beginning reset pause"
            goto L_0x0a38
        L_0x0a1e:
            X.1Az r1 = r2.A1X
            r0 = 2131890860(0x7f1212ac, float:1.9416424E38)
            r1.A02(r0)
            X.0yi r0 = r2.A0b
            r0.A04()
            X.1bx r0 = r2.A1W     // Catch:{ IOException -> 0x0a31 }
            r0.A08()     // Catch:{ IOException -> 0x0a31 }
            goto L_0x0a56
        L_0x0a31:
            r1 = move-exception
            java.lang.String r0 = "mediaview/failed to start from beginning no reset pause"
            goto L_0x0a38
        L_0x0a35:
            r1 = move-exception
            java.lang.String r0 = "mediaview/failed to start from mid pause"
        L_0x0a38:
            com.whatsapp.util.Log.e(r0, r1)
            X.00l r1 = r2.A0D()
            X.0pN r1 = (X.C14550pN) r1
            r0 = 2131888421(0x7f120925, float:1.9411477E38)
            r1.Afg(r0)
            return
        L_0x0a48:
            X.1bx r0 = r2.A1W     // Catch:{ IOException -> 0x0a66 }
            r0.A08()     // Catch:{ IOException -> 0x0a66 }
            r2.A1W()
            android.os.Handler r0 = r2.A06
            r0.sendEmptyMessage(r3)
            goto L_0x0a63
        L_0x0a56:
            android.os.Handler r0 = r2.A06
            r0.removeMessages(r3)
        L_0x0a5b:
            android.os.Handler r0 = r2.A06
            r0.sendEmptyMessage(r3)
            r2.A1W()
        L_0x0a63:
            r2.A01 = r4
            return
        L_0x0a66:
            r1 = move-exception
            java.lang.String r0 = "mediaview/failed to start from unknown"
            com.whatsapp.util.Log.e(r0, r1)
            X.00l r1 = r2.A0D()
            X.0pN r1 = (X.C14550pN) r1
            r0 = 2131888421(0x7f120925, float:1.9411477E38)
            r1.Afg(r0)
            return
        L_0x0a79:
            X.0sq r2 = r5.A0D
            r1 = 36
            com.facebook.redex.RunnableRunnableShape9S0100000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape9S0100000_I0_8
            r0.<init>(r5, r1)
            r2.Acl(r0)
            X.1L3 r3 = r5.A07
            X.00k r2 = r5.A01
            X.0rx r0 = r4.A00
            X.0rv r0 = r0.A05()
            com.whatsapp.jid.GroupJid r1 = com.whatsapp.jid.GroupJid.of(r0)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = X.AnonymousClass00T.A05(r2, r0)
            r3.A01(r0, r2, r1)
            return
        L_0x0a9e:
            r3.A08()
            return
        L_0x0aa2:
            X.2ry r1 = r6.A07
            r7 = 0
            if (r1 == 0) goto L_0x0ab2
            r0 = 0
            r1.A07(r0)
            r1.A0E()
            X.4je r0 = r1.A04
            r0.A01 = r7
        L_0x0ab2:
            X.1US r0 = r3.A03
            if (r0 == 0) goto L_0x0ab9
            r6.A0G(r0)
        L_0x0ab9:
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.A07(r0)
            r6.A07 = r5
            X.2nT r2 = r5.A03
            java.lang.String r0 = ""
            r2.A09 = r0
            r2.A0A = r7
            X.074 r0 = r5.A09
            android.content.Context r1 = r0.A0P
            X.C18450wi.A0H(r1, r7)
            r0 = 1123024896(0x42f00000, float:120.0)
            int r0 = X.C87594Xo.A00(r1, r0)
            r2.A04 = r0
            r2.A03()
            r5.A02()
            r0 = 1
            r3.A01 = r0
            X.0ui r4 = r6.A0U
            java.lang.Integer r3 = r6.A0A
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            X.1a7 r1 = new X.1a7
            r1.<init>()
            r0 = 77
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B = r0
            r1.A06 = r3
            r1.A08 = r2
            r4.A06(r1)
            X.1cy r3 = r6.A0e
            X.020 r0 = r5.A01()
            X.076 r2 = new X.076
            r2.<init>()
            r2.A06 = r0
        L_0x0b09:
            r1 = 300(0x12c, float:4.2E-43)
            X.2Vy r0 = new X.2Vy
            r0.<init>(r2, r1)
            r3.A0B(r0)
            return
        L_0x0b14:
            java.lang.String r0 = r3.A00     // Catch:{ NullPointerException | SecurityException -> 0x0b26 }
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r0)     // Catch:{ NullPointerException | SecurityException -> 0x0b26 }
            r1.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0b26 }
            X.0pt r1 = r4.A05     // Catch:{ NullPointerException | SecurityException -> 0x0b26 }
            r0 = 2131889180(0x7f120c1c, float:1.9413016E38)
            r1.A09(r0, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0b26 }
            return
        L_0x0b26:
            r1 = move-exception
            java.lang.String r0 = "sharelinkactivity/copylink/npe"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0b2d:
            X.0pt r1 = r4.A05
            r0 = 2131892695(0x7f1219d7, float:1.9420146E38)
            r1.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0.onClick(android.view.View):void");
    }
}
