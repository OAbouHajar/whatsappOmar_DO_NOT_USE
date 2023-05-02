package com.facebook.redex;

import android.content.DialogInterface;

public class IDxCListenerShape128S0100000_2_I1 implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape128S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f9, code lost:
        r3.A1D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x022b, code lost:
        r4.A1D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x022e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0239, code lost:
        r1.A1D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x023c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03fc, code lost:
        r13.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03ff, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05cb, code lost:
        r1 = ((com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel) r1.A00).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05d1, code lost:
        r1.A09(java.lang.Boolean.TRUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05d6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05d7, code lost:
        r1 = ((com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel) r1.A00).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05de, code lost:
        r1 = (com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel) r1.A00;
        r1.A07();
        r1.A08(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05e9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05ea, code lost:
        r1 = (com.obwhatsapp.migration.transfer.ui.DeviceTransferActivity) r1.A00;
        r1.A0D.A00((X.AnonymousClass09N) null, new android.content.Intent(r1, com.obwhatsapp.migration.transfer.ui.DeviceTransferQrScannerActivity.class));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e9, code lost:
        r1.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ec, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r13, int r14) {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x006a;
                case 1: goto L_0x023d;
                case 2: goto L_0x0078;
                case 3: goto L_0x08aa;
                case 4: goto L_0x0078;
                case 5: goto L_0x0093;
                case 6: goto L_0x0245;
                case 7: goto L_0x024d;
                case 8: goto L_0x00a8;
                case 9: goto L_0x0014;
                case 10: goto L_0x0255;
                case 11: goto L_0x025e;
                case 12: goto L_0x0267;
                case 13: goto L_0x027c;
                case 14: goto L_0x02be;
                case 15: goto L_0x02c6;
                case 16: goto L_0x02c6;
                case 17: goto L_0x02ce;
                case 18: goto L_0x0309;
                case 19: goto L_0x0320;
                case 20: goto L_0x0328;
                case 21: goto L_0x0335;
                case 22: goto L_0x033d;
                case 23: goto L_0x08aa;
                case 24: goto L_0x0021;
                case 25: goto L_0x0344;
                case 26: goto L_0x034e;
                case 27: goto L_0x035a;
                case 28: goto L_0x00b6;
                case 29: goto L_0x037b;
                case 30: goto L_0x00df;
                case 31: goto L_0x03ba;
                case 32: goto L_0x0874;
                case 33: goto L_0x03d3;
                case 34: goto L_0x03db;
                case 35: goto L_0x040c;
                case 36: goto L_0x041a;
                case 37: goto L_0x0874;
                case 38: goto L_0x0874;
                case 39: goto L_0x06f6;
                case 40: goto L_0x0424;
                case 41: goto L_0x00ed;
                case 42: goto L_0x043a;
                case 43: goto L_0x044b;
                case 44: goto L_0x0456;
                case 45: goto L_0x046e;
                case 46: goto L_0x0874;
                case 47: goto L_0x0486;
                case 48: goto L_0x048e;
                case 49: goto L_0x04ac;
                case 50: goto L_0x04d0;
                case 51: goto L_0x04df;
                case 52: goto L_0x0503;
                case 53: goto L_0x0519;
                case 54: goto L_0x0528;
                case 55: goto L_0x0530;
                case 56: goto L_0x0528;
                case 57: goto L_0x0547;
                case 58: goto L_0x0874;
                case 59: goto L_0x0553;
                case 60: goto L_0x00fe;
                case 61: goto L_0x0005;
                case 62: goto L_0x0005;
                case 63: goto L_0x0116;
                case 64: goto L_0x0005;
                case 65: goto L_0x0122;
                case 66: goto L_0x055b;
                case 67: goto L_0x06f6;
                case 68: goto L_0x0563;
                case 69: goto L_0x0583;
                case 70: goto L_0x0594;
                case 71: goto L_0x05be;
                case 72: goto L_0x0623;
                case 73: goto L_0x06f6;
                case 74: goto L_0x062b;
                case 75: goto L_0x0633;
                case 76: goto L_0x063b;
                case 77: goto L_0x0643;
                case 78: goto L_0x06f6;
                case 79: goto L_0x064b;
                case 80: goto L_0x0668;
                case 81: goto L_0x06a8;
                case 82: goto L_0x0874;
                case 83: goto L_0x08aa;
                case 84: goto L_0x0043;
                case 85: goto L_0x08aa;
                case 86: goto L_0x0043;
                case 87: goto L_0x06c5;
                case 88: goto L_0x06db;
                case 89: goto L_0x06f6;
                case 90: goto L_0x06fc;
                case 91: goto L_0x0718;
                case 92: goto L_0x0735;
                case 93: goto L_0x0740;
                case 94: goto L_0x078d;
                case 95: goto L_0x07ad;
                case 96: goto L_0x0134;
                case 97: goto L_0x0140;
                case 98: goto L_0x07c5;
                case 99: goto L_0x0165;
                case 100: goto L_0x07dc;
                case 101: goto L_0x07eb;
                case 102: goto L_0x0874;
                case 103: goto L_0x0874;
                case 104: goto L_0x07fc;
                case 105: goto L_0x005d;
                case 106: goto L_0x0806;
                case 107: goto L_0x081f;
                case 108: goto L_0x0176;
                case 109: goto L_0x0186;
                case 110: goto L_0x0827;
                case 111: goto L_0x0874;
                case 112: goto L_0x087a;
                case 113: goto L_0x08aa;
                case 114: goto L_0x01c3;
                case 115: goto L_0x022f;
                case 116: goto L_0x0884;
                case 117: goto L_0x08aa;
                case 118: goto L_0x08aa;
                case 119: goto L_0x08aa;
                case 120: goto L_0x08aa;
                case 121: goto L_0x01fd;
                case 122: goto L_0x022f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A00
            X.2OT r0 = (X.AnonymousClass2OT) r0
            X.2AS r0 = r0.A0J
            if (r0 == 0) goto L_0x0013
            X.1cy r1 = r0.A0t
            r0 = 0
            X.C13680ns.A1P(r1, r0)
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.status.playback.fragment.OpenLinkDialogFragment r1 = (com.obwhatsapp.status.playback.fragment.OpenLinkDialogFragment) r1
            X.1wj r0 = r1.A04
            if (r0 == 0) goto L_0x00e9
            r0.APi()
            goto L_0x00e9
        L_0x0021:
            java.lang.Object r3 = r12.A00
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            com.obwhatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment r2 = new com.obwhatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment
            r2.<init>()
            boolean r0 = r3.A0c()
            if (r0 == 0) goto L_0x01f9
            X.02C r0 = r3.A0G()
            X.050 r1 = new X.050
            r1.<init>(r0)
            java.lang.String r0 = "ProductReportReasonDialogFragment"
            r1.A0C(r2, r0)
            r1.A01()
            goto L_0x01f9
        L_0x0043:
            java.lang.Object r4 = r12.A00
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            X.00l r3 = r4.A0C()
            if (r3 == 0) goto L_0x022b
            android.content.Intent r2 = X.C13680ns.A09()
            r1 = 1
            java.lang.String r0 = "is_reset"
            r2.putExtra(r0, r1)
            r0 = -1
            r3.setResult(r0, r2)
            goto L_0x022b
        L_0x005d:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.status.playback.fragment.OpenLinkDialogFragment r1 = (com.obwhatsapp.status.playback.fragment.OpenLinkDialogFragment) r1
            X.1wj r0 = r1.A04
            if (r0 == 0) goto L_0x0239
            r0.APi()
            goto L_0x0239
        L_0x006a:
            java.lang.Object r0 = r12.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.00l r0 = r0.A0C()
            if (r0 == 0) goto L_0x0013
            r0.finish()
            return
        L_0x0078:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.BaseMessageDialogFragment r2 = (com.obwhatsapp.BaseMessageDialogFragment) r2
            X.00l r1 = r2.A0C()
            boolean r0 = r1 instanceof X.AnonymousClass2O1
            if (r0 == 0) goto L_0x0013
            X.2O1 r1 = (X.AnonymousClass2O1) r1
            if (r1 == 0) goto L_0x0013
            int r0 = r2.A1N()
            X.C18450wi.A0C(r13)
            r1.APh(r13, r0, r14)
            return
        L_0x0093:
            java.lang.Object r1 = r12.A00
            X.01A r1 = (X.AnonymousClass01A) r1
            java.lang.String r0 = "invitelink/revoke/confirmation/ok"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00l r0 = r1.A0C()
            X.2Bk r0 = (X.C45862Bk) r0
            if (r0 == 0) goto L_0x0013
            r0.Ace()
            return
        L_0x00a8:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.SingleSelectionDialogFragment r1 = (com.obwhatsapp.SingleSelectionDialogFragment) r1
            r1.A02 = r14
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0013
            r1.A1O()
            return
        L_0x00b6:
            java.lang.Object r4 = r12.A00
            com.obwhatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment r4 = (com.obwhatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment) r4
            r1 = 2131890954(0x7f12130a, float:1.9416614E38)
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            com.obwhatsapp.dialogs.ProgressDialogFragment r3 = com.obwhatsapp.dialogs.ProgressDialogFragment.A01(r1, r0)
            boolean r0 = r4.A0c()
            if (r0 == 0) goto L_0x0013
            X.02C r1 = r4.A0G()
            r0 = 0
            r3.A1G(r1, r0)
            X.0sq r2 = r4.A04
            r1 = 13
            com.facebook.redex.RunnableRunnableShape13S0200000_I1_1 r0 = new com.facebook.redex.RunnableRunnableShape13S0200000_I1_1
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
            return
        L_0x00df:
            java.lang.Object r1 = r12.A00
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A0c()
            if (r0 == 0) goto L_0x0013
        L_0x00e9:
            r1.A1C()
            return
        L_0x00ed:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.conversation.CapturePictureOrVideoDialogFragment r0 = (com.obwhatsapp.conversation.CapturePictureOrVideoDialogFragment) r0
            X.1yZ r1 = r0.A00
            if (r1 == 0) goto L_0x0013
            if (r14 == 0) goto L_0x08ae
            r0 = 1
            if (r14 != r0) goto L_0x0013
            r1.AVt()
            return
        L_0x00fe:
            java.lang.Object r0 = r12.A00
            X.3z8 r0 = (X.C79063z8) r0
            java.lang.ref.WeakReference r0 = r0.A09
            java.lang.Object r1 = r0.get()
            com.obwhatsapp.group.GroupChatInfoActivity r1 = (com.obwhatsapp.group.GroupChatInfoActivity) r1
            if (r1 == 0) goto L_0x0013
            X.0sL r0 = r1.A1N
            android.content.Intent r0 = X.C14750ph.A0O(r1, r0)
            r1.startActivity(r0)
            return
        L_0x0116:
            java.lang.Object r0 = r12.A00
            X.2OT r0 = (X.AnonymousClass2OT) r0
            X.2AS r0 = r0.A0J
            if (r0 == 0) goto L_0x0013
            r0.A05()
            return
        L_0x0122:
            java.lang.Object r0 = r12.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.00l r1 = r0.A0C()
            boolean r0 = r1 instanceof X.C108815Pp
            if (r0 == 0) goto L_0x0013
            X.5Pp r1 = (X.C108815Pp) r1
            r1.A6g()
            return
        L_0x0134:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.report.DeleteReportConfirmationDialogFragment r0 = (com.obwhatsapp.report.DeleteReportConfirmationDialogFragment) r0
            X.5QE r0 = r0.A00
            if (r0 == 0) goto L_0x0013
            r0.A7p()
            return
        L_0x0140:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.report.ShareReportConfirmationDialogFragment r0 = (com.obwhatsapp.report.ShareReportConfirmationDialogFragment) r0
            X.5QF r1 = r0.A00
            if (r1 == 0) goto L_0x0013
            com.facebook.redex.IDxRCallbackShape459S0100000_2_I1 r1 = (com.facebook.redex.IDxRCallbackShape459S0100000_2_I1) r1
            int r0 = r1.A01
            if (r0 == 0) goto L_0x08b2
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.report.ReportActivity r0 = (com.obwhatsapp.report.ReportActivity) r0
            com.obwhatsapp.report.BusinessActivityReportViewModel r3 = r0.A0L
            java.lang.String r0 = "BusinessActivityReportViewModel/export-report"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sq r2 = r3.A0E
            r1 = 4
            com.facebook.redex.RunnableRunnableShape14S0100000_I0_13 r0 = new com.facebook.redex.RunnableRunnableShape14S0100000_I0_13
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Acl(r0)
            return
        L_0x0165:
            java.lang.Object r0 = r12.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.00l r1 = r0.A0C()
            com.obwhatsapp.settings.SettingsNetworkUsage r1 = (com.obwhatsapp.settings.SettingsNetworkUsage) r1
            if (r1 == 0) goto L_0x0013
            r0 = 1
            r1.A36(r0)
            return
        L_0x0176:
            java.lang.Object r2 = r12.A00
            com.whatsapp.stickers.info.StickerInfoDialogFragment r2 = (com.whatsapp.stickers.info.StickerInfoDialogFragment) r2
            X.4On r1 = r2.A0I
            if (r1 == 0) goto L_0x0013
            X.1jm r0 = r2.A0E
            if (r0 == 0) goto L_0x0013
            r2.A1N(r0, r1)
            return
        L_0x0186:
            java.lang.Object r5 = r12.A00
            com.whatsapp.stickers.info.StickerInfoDialogFragment r5 = (com.whatsapp.stickers.info.StickerInfoDialogFragment) r5
            X.4On r0 = r5.A0I
            if (r0 == 0) goto L_0x0013
            X.1jm r0 = r5.A0E
            if (r0 == 0) goto L_0x0013
            X.0sK r0 = r5.A0A
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x08d3
            X.0pd r1 = r5.A04
            r0 = 1396(0x574, float:1.956E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x08d3
            X.4On r1 = r5.A0I
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x08d3
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x08c5
            X.00l r0 = r5.A0C()
            boolean r0 = r0 instanceof X.AnonymousClass1yP
            if (r0 == 0) goto L_0x091e
            X.13a r1 = r5.A0D
            r0 = 6
            r1.A01(r0)
            X.1Sp r1 = r5.A0J
            r0 = 0
            r1.A04(r0)
            return
        L_0x01c3:
            java.lang.Object r3 = r12.A00
            com.whatsapp.voipcalling.VoipActivityV2$E2EEInfoDialogFragment r3 = (com.whatsapp.voipcalling.VoipActivityV2.E2EEInfoDialogFragment) r3
            X.0pd r1 = r3.A04
            r0 = 1071(0x42f, float:1.501E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x01d9
            X.1BL r2 = r3.A03
            int r1 = r3.A00
            r0 = 2
            r2.A00(r1, r0)
        L_0x01d9:
            X.0uj r1 = r3.A04
            java.lang.String r0 = "28030015"
            android.net.Uri r0 = r1.A03(r0)
            android.content.Intent r2 = X.C13690nt.A0B(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)
            X.0zJ r1 = r3.A01
            android.content.Context r0 = r3.A0u()
            r1.A06(r0, r2)
            boolean r0 = r3.A0c()
            if (r0 == 0) goto L_0x0013
        L_0x01f9:
            r3.A1D()
            return
        L_0x01fd:
            java.lang.Object r4 = r12.A00
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            X.00l r3 = r4.A0D()
            com.whatsapp.voipcalling.VoipActivityV2 r3 = (com.whatsapp.voipcalling.VoipActivityV2) r3
            com.whatsapp.voipcalling.CallInfo r0 = r3.A3B()
            if (r0 == 0) goto L_0x0013
            X.1fU r2 = r0.self
            r0 = 0
            r3.A05 = r0
            android.os.Handler r1 = r3.A0F
            r0 = 3
            r1.removeMessages(r0)
            com.whatsapp.voipcalling.Voip.switchCamera()
            X.39w r0 = r3.A18
            r3.A3k(r2, r0)
            com.obwhatsapp.calling.avatar.CallAvatarViewModel r0 = r3.A0o
            r0.A05()
            boolean r0 = r4.A0c()
            if (r0 == 0) goto L_0x0013
        L_0x022b:
            r4.A1D()
            return
        L_0x022f:
            java.lang.Object r1 = r12.A00
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A0c()
            if (r0 == 0) goto L_0x0013
        L_0x0239:
            r1.A1D()
            return
        L_0x023d:
            java.lang.Object r0 = r12.A00
            X.5RM r0 = (X.AnonymousClass5RM) r0
            r0.AVz()
            return
        L_0x0245:
            java.lang.Object r0 = r12.A00
            X.5OZ r0 = (X.AnonymousClass5OZ) r0
            r0.AVz()
            return
        L_0x024d:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.SingleSelectionDialogFragment r0 = (com.obwhatsapp.SingleSelectionDialogFragment) r0
            r0.A1O()
            return
        L_0x0255:
            java.lang.Object r1 = r12.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
            X.AnonymousClass29T.A00(r1, r0)
            return
        L_0x025e:
            java.lang.Object r1 = r12.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 3
            X.AnonymousClass29T.A00(r1, r0)
            return
        L_0x0267:
            java.lang.Object r1 = r12.A00
            X.01A r1 = (X.AnonymousClass01A) r1
            java.lang.String r0 = "delete-account-feedback/changenumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00l r0 = r1.A0C()
            android.content.Intent r0 = X.C14750ph.A00(r0)
            r1.A0r(r0)
            return
        L_0x027c:
            java.lang.Object r2 = r12.A00
            X.4Ot r2 = (X.C85514Ot) r2
            X.0t9 r11 = r2.A05
            X.0w2 r10 = r2.A04
            X.0w3 r9 = r2.A06
            java.util.Set r8 = r2.A09
            X.1L9 r7 = r2.A07
            X.0tb r1 = r2.A03
            X.29B r6 = r2.A02
            X.5RM r5 = r2.A01
            boolean r0 = r2.A0A
            java.lang.Integer r4 = r2.A08
            int r3 = r2.A00
            r2 = 1
            X.AnonymousClass3BP.A02(r10, r11, r9, r8, r2)
            r1.A0W(r8, r0)
            r1 = 4
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x02b0
            int r0 = r7.A00
            if (r0 != r1) goto L_0x02b0
            r0 = 5
            r7.A00 = r0
            r0 = 2
            if (r3 < r2) goto L_0x02ad
            r0 = 4
        L_0x02ad:
            r7.A00(r0)
        L_0x02b0:
            r6.APW()
            if (r4 == 0) goto L_0x03fc
            int r0 = r4.intValue()
            r5.AXE(r0)
            goto L_0x03fc
        L_0x02be:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.audiopicker.AudioPickerActivity r0 = (com.obwhatsapp.audiopicker.AudioPickerActivity) r0
            com.obwhatsapp.audiopicker.AudioPickerActivity.A02(r0)
            return
        L_0x02c6:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r0 = (com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r0
            r0.A1N()
            return
        L_0x02ce:
            java.lang.Object r5 = r12.A00
            com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r5 = (com.obwhatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r5
            r0 = 4
            r5.A00 = r0
            X.0ps r2 = r5.A06
            android.content.SharedPreferences r1 = r2.A00()
            java.lang.String r6 = "two_factor_auth_nag_interval"
            r0 = 0
            int r1 = r1.getInt(r6, r0)
            r0 = 2
            int r4 = java.lang.Math.max(r1, r0)
            android.content.SharedPreferences r0 = r2.A00()
            android.content.SharedPreferences$Editor r3 = r0.edit()
            X.0t3 r0 = r2.A05
            long r1 = r0.A00()
            java.lang.String r0 = "two_factor_auth_nag_time"
            android.content.SharedPreferences$Editor r0 = r3.putLong(r0, r1)
            android.content.SharedPreferences$Editor r2 = r0.putInt(r6, r4)
            java.lang.String r1 = "two_factor_auth_last_code_correctness"
            r0 = 1
            X.C13680ns.A0z(r2, r1, r0)
            r5.A1O()
            return
        L_0x0309:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoActivity r0 = (com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoActivity) r0
            r13.dismiss()
            X.0qW r0 = r0.A0F
            java.lang.Object r0 = r0.getValue()
            com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel r0 = (com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel) r0
            X.1cy r1 = r0.A0C
            X.41F r0 = X.AnonymousClass41F.CLOSE_SCREEN
            r1.A0B(r0)
            return
        L_0x0320:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = (com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel) r0
            r0.A06()
            return
        L_0x0328:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.backup.encryptedbackup.PasswordInputFragment r0 = (com.obwhatsapp.backup.encryptedbackup.PasswordInputFragment) r0
            com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r0.A07
            r1 = 0
            X.027 r0 = r0.A07
            X.C13680ns.A1O(r0, r1)
            return
        L_0x0335:
            java.lang.Object r0 = r12.A00
            X.2Sv r0 = (X.AnonymousClass2Sv) r0
            r0.AOW()
            return
        L_0x033d:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment r0 = (com.obwhatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment) r0
            r0.A00 = r14
            return
        L_0x0344:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.blocklist.UnblockDialogFragment r0 = (com.obwhatsapp.blocklist.UnblockDialogFragment) r0
            X.5Oq r0 = r0.A00
            r0.AhA()
            return
        L_0x034e:
            java.lang.Object r0 = r12.A00
            com.facebook.redex.IDxGListenerShape420S0100000_2_I0 r0 = (com.facebook.redex.IDxGListenerShape420S0100000_2_I0) r0
            java.lang.Object r0 = r0.A00
            com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r0 = (com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r0
            r0.A3D()
            return
        L_0x035a:
            java.lang.Object r4 = r12.A00
            com.obwhatsapp.calling.callhistory.CallsHistoryFragment$ClearCallLogDialogFragment r4 = (com.obwhatsapp.calling.callhistory.CallsHistoryFragment.ClearCallLogDialogFragment) r4
            r1 = 2131890954(0x7f12130a, float:1.9416614E38)
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            com.obwhatsapp.dialogs.ProgressDialogFragment r3 = com.obwhatsapp.dialogs.ProgressDialogFragment.A01(r1, r0)
            X.02C r1 = r4.A0H
            r0 = 0
            r3.A1G(r1, r0)
            X.0sq r2 = r4.A03
            r1 = 11
            com.facebook.redex.RunnableRunnableShape13S0200000_I1_1 r0 = new com.facebook.redex.RunnableRunnableShape13S0200000_I1_1
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
            return
        L_0x037b:
            java.lang.Object r4 = r12.A00
            com.obwhatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment r4 = (com.obwhatsapp.calling.spam.CallSpamActivity.ReportSpamOrBlockDialogFragment) r4
            X.0wP r0 = r4.A05
            boolean r0 = r0.A0A()
            r2 = 0
            if (r0 != 0) goto L_0x03a3
            java.lang.String r0 = "callspamactivity/spam/report/no-network-cannot-block-report"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.00l r0 = r4.A0D()
            boolean r0 = X.C18260wP.A02(r0)
            r1 = 2131889659(0x7f120dfb, float:1.9413988E38)
            if (r0 == 0) goto L_0x039d
            r1 = 2131889660(0x7f120dfc, float:1.941399E38)
        L_0x039d:
            X.0pt r0 = r4.A02
            r0.A09(r1, r2)
            return
        L_0x03a3:
            X.0pt r1 = r4.A02
            r0 = 0
            r1.A0E(r0)
            X.00l r3 = r4.A0D()
            X.0sq r2 = r4.A0E
            r1 = 17
            com.facebook.redex.RunnableRunnableShape13S0200000_I1_1 r0 = new com.facebook.redex.RunnableRunnableShape13S0200000_I1_1
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
            return
        L_0x03ba:
            java.lang.Object r1 = r12.A00
            X.01A r1 = (X.AnonymousClass01A) r1
            java.lang.String r0 = "voip/AppSettingsWarningDialogFragment/settings"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00l r0 = r1.A0C()
            if (r0 != 0) goto L_0x03cf
            java.lang.String r0 = "voip/AppSettingsWarningDialogFragment/settings activity is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x03cf:
            X.AnonymousClass1yL.A05(r0)
            return
        L_0x03d3:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.community.CommunityAdminDialogFragment r0 = (com.obwhatsapp.community.CommunityAdminDialogFragment) r0
            X.C82644Dp.A00(r0)
            goto L_0x03fc
        L_0x03db:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.community.CommunityAdminDialogFragment r0 = (com.obwhatsapp.community.CommunityAdminDialogFragment) r0
            X.4Dp r1 = r0.A01
            int r3 = r0.A00
            com.whatsapp.jid.UserJid r2 = r0.A02
            r0 = 2
            if (r3 == r0) goto L_0x0400
            r0 = 1
            if (r3 == r0) goto L_0x0400
            r0 = 4
            if (r3 == r0) goto L_0x03f1
            r0 = 3
            if (r3 != r0) goto L_0x03fc
        L_0x03f1:
            X.4Rt r0 = r1.A00
            X.39X r1 = r0.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A01(r2, r0)
        L_0x03fc:
            r13.dismiss()
            return
        L_0x0400:
            X.4Rt r0 = r1.A00
            X.39X r1 = r0.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A00(r2, r0)
            goto L_0x03fc
        L_0x040c:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.community.CommunityHomeActivity r1 = (com.obwhatsapp.community.CommunityHomeActivity) r1
            X.0sL r0 = r1.A0s
            android.content.Intent r0 = X.C14750ph.A0O(r1, r0)
            r1.startActivity(r0)
            return
        L_0x041a:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.community.ConfirmLinkExistingGroupsDialog r0 = (com.obwhatsapp.community.ConfirmLinkExistingGroupsDialog) r0
            X.5PE r0 = r0.A00
            r0.AP1()
            return
        L_0x0424:
            java.lang.Object r0 = r12.A00
            X.0rz r0 = (X.C15860rz) r0
            r2 = 1
            android.content.SharedPreferences r0 = X.C13680ns.A0B(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "forward_with_captions_nux_shown"
            X.C13680ns.A0z(r1, r0, r2)
            r13.dismiss()
            return
        L_0x043a:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.conversation.ChatMediaVisibilityDialog r2 = (com.obwhatsapp.conversation.ChatMediaVisibilityDialog) r2
            r1 = 2
            r0 = 1
            if (r14 == r0) goto L_0x0445
            if (r14 == r1) goto L_0x0448
            r1 = 0
        L_0x0445:
            r2.A01 = r1
            return
        L_0x0448:
            r2.A01 = r0
            return
        L_0x044b:
            java.lang.Object r0 = r12.A00
            X.4v1 r0 = (X.C100054v1) r0
            android.app.Activity r1 = r0.A02
            r0 = 1
            X.AnonymousClass29T.A00(r1, r0)
            return
        L_0x0456:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment r2 = (com.obwhatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment) r2
            r0 = 1
            X.3rZ r1 = r2.A05
            if (r1 == 0) goto L_0x046a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.0t9 r0 = r2.A04
            r0.A06(r1)
        L_0x046a:
            r2.A1C()
            return
        L_0x046e:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r2 = (com.obwhatsapp.conversation.conversationrow.EncryptionChangeDialogFragment) r2
            r0 = 1
            X.3rZ r1 = r2.A0A
            if (r1 == 0) goto L_0x0482
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
            X.0t9 r0 = r2.A09
            r0.A06(r1)
        L_0x0482:
            r2.A1D()
            return
        L_0x0486:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment r0 = (com.obwhatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment) r0
            com.obwhatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment.A02(r0, r14)
            return
        L_0x048e:
            java.lang.Object r4 = r12.A00
            com.obwhatsapp.conversation.dialog.UpdateAppDialogFragment r4 = (com.obwhatsapp.conversation.dialog.UpdateAppDialogFragment) r4
            X.0zJ r3 = r4.A00
            android.content.Context r2 = r4.A0u()
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = X.C13700nu.A02(r0)
            X.0xQ r0 = r4.A01
            android.net.Uri r0 = r0.A00()
            android.content.Intent r0 = r1.setData(r0)
            r3.A06(r2, r0)
            return
        L_0x04ac:
            java.lang.Object r4 = r12.A00
            com.obwhatsapp.conversationslist.SmsDefaultAppWarning r4 = (com.obwhatsapp.conversationslist.SmsDefaultAppWarning) r4
            r0 = 1
            X.AnonymousClass29T.A00(r4, r0)
            X.1BJ r3 = r4.A00
            android.content.Intent r0 = r4.getIntent()
            android.net.Uri r2 = r0.getData()
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "sms_body"
            java.lang.String r1 = r1.getStringExtra(r0)
            r0 = 0
            r3.A00(r4, r2, r0, r1)
            r4.finish()
            return
        L_0x04d0:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.conversationslist.SmsDefaultAppWarning r1 = (com.obwhatsapp.conversationslist.SmsDefaultAppWarning) r1
            r0 = 1
            X.AnonymousClass29T.A00(r1, r0)
            r1.A35()
            r1.finish()
            return
        L_0x04df:
            java.lang.Object r4 = r12.A00
            com.obwhatsapp.conversationslist.SmsDefaultAppWarning r4 = (com.obwhatsapp.conversationslist.SmsDefaultAppWarning) r4
            r0 = 0
            X.AnonymousClass29T.A00(r4, r0)
            X.1BJ r3 = r4.A00
            android.content.Intent r0 = r4.getIntent()
            android.net.Uri r2 = r0.getData()
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "sms_body"
            java.lang.String r1 = r1.getStringExtra(r0)
            r0 = 0
            r3.A00(r4, r2, r0, r1)
            r4.finish()
            return
        L_0x0503:
            java.lang.Object r2 = r12.A00
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.String r0 = "smsdefaultappwarning/reset"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.pm.PackageManager r1 = r2.getPackageManager()
            java.lang.String r0 = "com.obwhatsapp"
            r1.clearPackagePreferredActivities(r0)
            r2.finish()
            return
        L_0x0519:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.conversationslist.SmsDefaultAppWarning r1 = (com.obwhatsapp.conversationslist.SmsDefaultAppWarning) r1
            r0 = 0
            X.AnonymousClass29T.A00(r1, r0)
            r1.A35()
            r1.finish()
            return
        L_0x0528:
            java.lang.Object r0 = r12.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass3K4.A0j(r0)
            return
        L_0x0530:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.deeplink.DeepLinkActivity r2 = (com.obwhatsapp.deeplink.DeepLinkActivity) r2
            X.0xQ r0 = r2.A03
            android.net.Uri r0 = r0.A00()
            android.content.Intent r1 = X.C13690nt.A0B(r0)
            X.0zJ r0 = r2.A00
            r0.A06(r2, r1)
            X.AnonymousClass3K4.A0j(r2)
            return
        L_0x0547:
            java.lang.Object r1 = r12.A00
            android.content.Context r1 = (android.content.Context) r1
            android.content.Intent r0 = X.C14750ph.A04(r1)
            r1.startActivity(r0)
            return
        L_0x0553:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.group.GroupChatInfoActivity$DescriptionConflictDialogFragment r0 = (com.obwhatsapp.group.GroupChatInfoActivity.DescriptionConflictDialogFragment) r0
            com.obwhatsapp.group.GroupChatInfoActivity.DescriptionConflictDialogFragment.A02(r0)
            return
        L_0x055b:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.mediaview.MediaViewBaseFragment r0 = (com.obwhatsapp.mediaview.MediaViewBaseFragment) r0
            r0.A1F()
            return
        L_0x0563:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.migration.export.ui.ExportMigrationActivity r3 = (com.obwhatsapp.migration.export.ui.ExportMigrationActivity) r3
            X.1Vg r2 = r3.A0I
            java.lang.String r1 = r3.A0J
            r0 = 6
            r2.A00(r1, r0)
            X.0t9 r0 = r3.A0D
            r1 = 8
            java.lang.String r0 = X.AnonymousClass4Y3.A00(r0, r1)
            android.content.Intent r2 = X.C14750ph.A0g(r3, r0, r1)
            X.0zJ r1 = r3.A00
            r0 = 5000(0x1388, float:7.006E-42)
            r1.A09(r3, r2, r0)
            return
        L_0x0583:
            java.lang.Object r1 = r12.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "ExportMigrationActivity/cancelMigrationAndReturn/unknown/resultCode: 0"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r1.setResult(r0)
            r1.finish()
            return
        L_0x0594:
            java.lang.Object r0 = r12.A00
            X.4Np r0 = (X.C85224Np) r0
            X.5Pz r1 = r0.A04
            com.facebook.redex.IDxActionShape258S0100000_2_I1 r1 = (com.facebook.redex.IDxActionShape258S0100000_2_I1) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x05ea;
                case 1: goto L_0x05b0;
                case 2: goto L_0x05a2;
                case 3: goto L_0x05de;
                case 4: goto L_0x05a1;
                case 5: goto L_0x05a1;
                case 6: goto L_0x05d7;
                default: goto L_0x05a1;
            }
        L_0x05a1:
            goto L_0x05cb
        L_0x05a2:
            java.lang.Object r1 = r1.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "android.settings.WIFI_SETTINGS"
            android.content.Intent r0 = X.C13700nu.A02(r0)     // Catch:{ ActivityNotFoundException -> 0x060a }
            r1.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x060a }
            return
        L_0x05b0:
            java.lang.Object r1 = r1.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r0 = X.C13700nu.A02(r0)     // Catch:{ ActivityNotFoundException -> 0x061c }
            r1.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x061c }
            return
        L_0x05be:
            java.lang.Object r0 = r12.A00
            X.4Np r0 = (X.C85224Np) r0
            X.5Pz r1 = r0.A05
            com.facebook.redex.IDxActionShape258S0100000_2_I1 r1 = (com.facebook.redex.IDxActionShape258S0100000_2_I1) r1
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x05ea;
                case 1: goto L_0x060e;
                case 2: goto L_0x05fc;
                case 3: goto L_0x05de;
                case 4: goto L_0x05cb;
                case 5: goto L_0x05cb;
                case 6: goto L_0x05d7;
                default: goto L_0x05cb;
            }
        L_0x05cb:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel r0 = (com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel) r0
            X.027 r1 = r0.A02
        L_0x05d1:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09(r0)
            return
        L_0x05d7:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel r0 = (com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel) r0
            X.027 r1 = r0.A03
            goto L_0x05d1
        L_0x05de:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel r1 = (com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel) r1
            r1.A07()
            r0 = 0
            r1.A08(r0)
            return
        L_0x05ea:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.migration.transfer.ui.DeviceTransferActivity r1 = (com.obwhatsapp.migration.transfer.ui.DeviceTransferActivity) r1
            java.lang.Class<com.obwhatsapp.migration.transfer.ui.DeviceTransferQrScannerActivity> r0 = com.obwhatsapp.migration.transfer.ui.DeviceTransferQrScannerActivity.class
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r1, r0)
            X.05i r1 = r1.A0D
            r0 = 0
            r1.A00(r0, r2)
            return
        L_0x05fc:
            java.lang.Object r1 = r1.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "android.settings.WIFI_SETTINGS"
            android.content.Intent r0 = X.C13700nu.A02(r0)     // Catch:{ ActivityNotFoundException -> 0x060a }
            r1.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x060a }
            return
        L_0x060a:
            r1 = move-exception
            java.lang.String r0 = "fpm/DeviceTransferActivity/No wifi settings"
            goto L_0x061f
        L_0x060e:
            java.lang.Object r1 = r1.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r0 = X.C13700nu.A02(r0)     // Catch:{ ActivityNotFoundException -> 0x061c }
            r1.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x061c }
            return
        L_0x061c:
            r1 = move-exception
            java.lang.String r0 = "fpm/DeviceTransferActivity/No location settings"
        L_0x061f:
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x0623:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.migration.transfer.ui.DeviceTransferActivity r0 = (com.obwhatsapp.migration.transfer.ui.DeviceTransferActivity) r0
            r0.finish()
            return
        L_0x062b:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity r0 = (com.obwhatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity) r0
            com.obwhatsapp.payments.phoenix.flowconfigurationservice.activities.IndiaUpiFcsPinHandlerActivity.A02(r0)
            return
        L_0x0633:
            r0 = 1
            X.C18450wi.A0H(r13, r0)
            r13.dismiss()
            return
        L_0x063b:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.P2mLitePaymentSettingsFragment r0 = (com.obwhatsapp.payments.ui.P2mLitePaymentSettingsFragment) r0
            com.obwhatsapp.payments.ui.P2mLitePaymentSettingsFragment.A03(r0)
            return
        L_0x0643:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.payments.ui.P2mLitePaymentSettingsFragment r0 = (com.obwhatsapp.payments.ui.P2mLitePaymentSettingsFragment) r0
            com.obwhatsapp.payments.ui.P2mLitePaymentSettingsFragment.A02(r13, r0)
            return
        L_0x064b:
            java.lang.Object r5 = r12.A00
            com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity r5 = (com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity) r5
            X.61W r4 = r5.A35()
            java.lang.Integer r3 = X.C13680ns.A0Y()
            java.lang.Integer r2 = X.C13680ns.A0a()
            java.lang.String r1 = X.AnonymousClass3K3.A0k(r5)
            java.lang.String r0 = "error"
            r4.AKS(r3, r2, r0, r1)
            r5.finish()
            return
        L_0x0668:
            java.lang.Object r6 = r12.A00
            com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity r6 = (com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity) r6
            r5 = 1
            r6.A04 = r5
            android.widget.TextView r2 = r6.A00
            if (r2 == 0) goto L_0x069e
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131889335(0x7f120cb7, float:1.941333E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText(r0)
            X.61W r4 = r6.A35()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r2 = X.C13690nt.A0U()
            java.lang.String r1 = X.AnonymousClass3K3.A0k(r6)
            java.lang.String r0 = "alias_switch_confirm_dialog"
            r4.AKS(r3, r2, r0, r1)
            com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkViewModel r0 = r6.A03
            if (r0 == 0) goto L_0x06a1
            r0.A05(r5)
            return
        L_0x069e:
            java.lang.String r0 = "titleTextView"
            goto L_0x06a3
        L_0x06a1:
            java.lang.String r0 = "indiaUpiMapperLinkViewModel"
        L_0x06a3:
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        L_0x06a8:
            java.lang.Object r5 = r12.A00
            com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity r5 = (com.obwhatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity) r5
            X.61W r4 = r5.A35()
            java.lang.Integer r3 = X.C13680ns.A0Y()
            java.lang.Integer r2 = X.C13680ns.A0a()
            java.lang.String r1 = X.AnonymousClass3K3.A0k(r5)
            java.lang.String r0 = "alias_switch_confirm_dialog"
            r4.AKS(r3, r2, r0, r1)
            r5.finish()
            return
        L_0x06c5:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.profile.SetAboutInfo r1 = (com.obwhatsapp.profile.SetAboutInfo) r1
            r0 = 3
            X.AnonymousClass29T.A00(r1, r0)
            java.util.ArrayList r0 = com.obwhatsapp.profile.SetAboutInfo.A09
            r0.clear()
            r1.A35()
            X.3Nm r0 = r1.A04
            r0.notifyDataSetChanged()
            return
        L_0x06db:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.qrcode.DevicePairQrScannerActivity r2 = (com.obwhatsapp.qrcode.DevicePairQrScannerActivity) r2
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = X.C13700nu.A02(r0)
            X.0xQ r0 = r2.A01
            android.net.Uri r0 = r0.A00()
            android.content.Intent r0 = r1.setData(r0)
            r2.startActivity(r0)
            r2.finish()
            return
        L_0x06f6:
            java.lang.Object r0 = r12.A00
            X.AnonymousClass3K4.A0y(r0)
            return
        L_0x06fc:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.registration.SelectPhoneNumberDialog r2 = (com.obwhatsapp.registration.SelectPhoneNumberDialog) r2
            java.lang.String r0 = "select-phone-number-dialog/no-phone-number-selected"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2F6 r0 = r2.A01
            if (r0 == 0) goto L_0x0714
            X.2F3 r0 = (X.AnonymousClass2F3) r0
            X.1Ai r1 = r0.A0B
            X.4OJ r0 = r0.A0E
            android.widget.EditText r0 = r0.A03
            r1.A02(r0)
        L_0x0714:
            r2.A1C()
            return
        L_0x0718:
            java.lang.Object r3 = r12.A00
            android.content.Context r3 = (android.content.Context) r3
            X.1fu r2 = X.C32241fu.A00(r3)
            r0 = 2131892304(0x7f121850, float:1.9419353E38)
            r2.A01(r0)
            r1 = 2131892298(0x7f12184a, float:1.941934E38)
            r0 = 92
            X.C13680ns.A1H(r2, r3, r0, r1)
            X.C13690nt.A1E(r2)
            r2.A00()
            return
        L_0x0735:
            java.lang.Object r3 = r12.A00
            com.obwhatsapp.registration.VerifyTwoFactorAuth r3 = (com.obwhatsapp.registration.VerifyTwoFactorAuth) r3
            r2 = 2
            r1 = 0
            r0 = 0
            r3.A36(r2, r1, r0)
            return
        L_0x0740:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment r0 = (com.obwhatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment) r0
            X.4Ey r0 = r0.A00
            com.obwhatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity r5 = r0.A00
            X.0wP r0 = r5.A07
            boolean r0 = r0.A0A()
            r4 = 1
            if (r0 != 0) goto L_0x0771
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity/checksystemstatus/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = 2131891058(0x7f121372, float:1.9416825E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r1 = 0
            r0 = 2131887419(0x7f12053b, float:1.9409445E38)
            java.lang.String r0 = r5.getString(r0)
            r2[r1] = r0
            X.2T3 r0 = com.obwhatsapp.LegacyMessageDialogFragment.A01(r2, r3)
            androidx.fragment.app.DialogFragment r0 = r0.A00()
            X.C13680ns.A1J(r0, r5)
            return
        L_0x0771:
            r0 = 2131889306(0x7f120c9a, float:1.9413272E38)
            r5.Afq(r0)
            com.facebook.redex.IDxRCallbackShape457S0100000_2_I1 r0 = new com.facebook.redex.IDxRCallbackShape457S0100000_2_I1
            r0.<init>(r5, r4)
            X.0ug r2 = r5.A06
            java.lang.ref.WeakReference r0 = X.C13690nt.A0h(r0)
            X.51M r1 = new X.51M
            r1.<init>(r2, r0)
            java.lang.String r0 = r5.A09
            r1.A00(r0, r4)
            return
        L_0x078d:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity r1 = (com.obwhatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity) r1
            r13.dismiss()
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity/launchConfirmationDialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4Ey r0 = new X.4Ey
            r0.<init>(r1)
            com.obwhatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment r2 = new com.obwhatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment
            r2.<init>(r0)
            X.02C r1 = r1.AGM()
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity"
            r2.A1G(r1, r0)
            return
        L_0x07ad:
            java.lang.Object r3 = r12.A00
            android.content.Context r3 = (android.content.Context) r3
            r13.dismiss()
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.backup.google.SettingsGoogleDrive"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x07c5:
            java.lang.Object r3 = r12.A00
            X.0pN r3 = (X.C14550pN) r3
            X.0sq r2 = r3.A05
            r1 = 25
            com.facebook.redex.RunnableRunnableShape14S0100000_I0_13 r0 = new com.facebook.redex.RunnableRunnableShape14S0100000_I0_13
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Aco(r0)
            r0 = 2131889307(0x7f120c9b, float:1.9413274E38)
            r3.Afq(r0)
            return
        L_0x07dc:
            java.lang.Object r2 = r12.A00
            com.obwhatsapp.settings.SettingsNotifications r2 = (com.obwhatsapp.settings.SettingsNotifications) r2
            X.0sq r1 = r2.A05
            X.35v r0 = new X.35v
            r0.<init>(r2)
            X.C13680ns.A1U(r0, r1)
            return
        L_0x07eb:
            java.lang.Object r3 = r12.A00
            X.0pP r3 = (X.C14570pP) r3
            X.0sq r2 = r3.A05
            r1 = 34
            com.facebook.redex.RunnableRunnableShape14S0100000_I0_13 r0 = new com.facebook.redex.RunnableRunnableShape14S0100000_I0_13
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Acl(r0)
            return
        L_0x07fc:
            java.lang.Object r1 = r12.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 13
            X.AnonymousClass29T.A00(r1, r0)
            return
        L_0x0806:
            java.lang.Object r0 = r12.A00
            com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment r0 = (com.whatsapp.stickers.RemoveStickerFromFavoritesDialogFragment) r0
            X.1CX r4 = r0.A01
            X.1jm r0 = r0.A00
            java.util.Set r3 = java.util.Collections.singleton(r0)
            X.0sq r2 = r4.A0Y
            r1 = 44
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
            return
        L_0x081f:
            java.lang.Object r0 = r12.A00
            com.whatsapp.stickers.StarStickerFromPickerDialogFragment r0 = (com.whatsapp.stickers.StarStickerFromPickerDialogFragment) r0
            com.whatsapp.stickers.StarStickerFromPickerDialogFragment.A03(r0)
            return
        L_0x0827:
            java.lang.Object r3 = r12.A00
            X.01A r3 = (X.AnonymousClass01A) r3
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x086a
            java.lang.String r2 = "com.samsung.android.lool"
            android.content.Context r0 = r3.A0u()     // Catch:{ NameNotFoundException -> 0x086a }
            if (r0 == 0) goto L_0x086a
            android.content.Context r0 = r3.A0u()     // Catch:{ NameNotFoundException -> 0x086a }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x086a }
            if (r0 == 0) goto L_0x086a
            android.content.Context r0 = r3.A0u()     // Catch:{ NameNotFoundException -> 0x086a }
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x086a }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x086a }
            if (r0 == 0) goto L_0x086a
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r0 = X.C13700nu.A02(r0)     // Catch:{ ActivityNotFoundException -> 0x0865 }
            android.content.Intent r0 = r0.setPackage(r2)     // Catch:{ ActivityNotFoundException -> 0x0865 }
            r3.A0r(r0)     // Catch:{ ActivityNotFoundException -> 0x0865 }
            return
        L_0x0865:
            java.lang.String r0 = "Sticker/ThirdPartyPackPage/cannot launch com.samsung.android.lool"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x086a:
            java.lang.String r0 = "android.intent.action.POWER_USAGE_SUMMARY"
            android.content.Intent r0 = X.C13700nu.A02(r0)     // Catch:{ ActivityNotFoundException -> 0x090b }
            r3.A0r(r0)     // Catch:{ ActivityNotFoundException -> 0x090b }
            return
        L_0x0874:
            java.lang.Object r0 = r12.A00
            X.AnonymousClass3K4.A0z(r0)
            return
        L_0x087a:
            java.lang.Object r0 = r12.A00
            X.3H5 r0 = (X.AnonymousClass3H5) r0
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r0 = r0.A00
            r0.finish()
            return
        L_0x0884:
            java.lang.Object r3 = r12.A00
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            android.content.Context r0 = r3.A0u()
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.voipcalling.VoipActivityV2"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "com.obwhatsapp.intent.action.END_CALL_AFTER_CONFIRMATION"
            r2.setAction(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)
            r3.A0r(r2)
            r3.A1D()
            return
        L_0x08aa:
            X.AnonymousClass3K4.A0o(r12)
            return
        L_0x08ae:
            r1.AYl()
            return
        L_0x08b2:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.report.ReportActivity r4 = (com.obwhatsapp.report.ReportActivity) r4
            X.0sq r3 = r4.A05
            X.0t3 r2 = r4.A05
            X.0sb r1 = r4.A04
            X.36p r0 = new X.36p
            r0.<init>(r4, r1, r2, r4)
            X.C13680ns.A1U(r0, r3)
            return
        L_0x08c5:
            X.1ML r2 = r5.A0C
            X.00l r0 = r5.A0D()
            java.lang.ref.WeakReference r1 = X.C13690nt.A0h(r0)
            r2.A03(r1)
            return
        L_0x08d3:
            X.4On r2 = r5.A0I
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x08eb
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x08eb
            X.00l r0 = r5.A0C()
            boolean r0 = r0 instanceof X.AnonymousClass1yP
            if (r0 == 0) goto L_0x091b
            X.1Sp r0 = r5.A0J
            r0.A05(r1)
            return
        L_0x08eb:
            java.lang.String r0 = r2.A03
            if (r0 == 0) goto L_0x0911
            X.0zJ r4 = r5.A09     // Catch:{ ActivityNotFoundException -> 0x0908 }
            android.content.Context r3 = r5.A0u()     // Catch:{ ActivityNotFoundException -> 0x0908 }
            java.lang.String r2 = "android.intent.action.VIEW"
            X.4On r0 = r5.A0I     // Catch:{ ActivityNotFoundException -> 0x0908 }
            java.lang.String r0 = r0.A03     // Catch:{ ActivityNotFoundException -> 0x0908 }
            android.net.Uri r1 = android.net.Uri.parse(r0)     // Catch:{ ActivityNotFoundException -> 0x0908 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0908 }
            r0.<init>(r2, r1)     // Catch:{ ActivityNotFoundException -> 0x0908 }
            r4.A06(r3, r0)     // Catch:{ ActivityNotFoundException -> 0x0908 }
            return
        L_0x0908:
            java.lang.String r0 = "StickerInfoDialogFragment/onClickListener failed to open playstore link"
            goto L_0x090d
        L_0x090b:
            java.lang.String r0 = "Sticker/ThirdPartyPackPage/cannot launch power usage"
        L_0x090d:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0911:
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x091b
            X.1jm r0 = r5.A0E
            r5.A1N(r0, r2)
            return
        L_0x091b:
            java.lang.String r2 = r2.A00
            goto L_0x0920
        L_0x091e:
            java.lang.String r2 = "meta-avatar"
        L_0x0920:
            android.content.Context r1 = r5.A0u()
            java.lang.String r0 = "info_dialog"
            android.content.Intent r0 = X.C14750ph.A0i(r1, r2, r0)
            r5.A0r(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape128S0100000_2_I1.onClick(android.content.DialogInterface, int):void");
    }
}
