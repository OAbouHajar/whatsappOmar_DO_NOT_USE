package com.facebook.redex;

import X.AnonymousClass27A;

public class RunnableRunnableShape0S0101000_I0 implements Runnable {
    public int A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape0S0101000_I0(AnonymousClass27A r2, int i2, int i3) {
        this.A02 = i3;
        if (23 - i3 != 0) {
            this.A01 = r2;
            this.A00 = 401;
            return;
        }
        this.A01 = r2;
        this.A00 = i2;
    }

    public RunnableRunnableShape0S0101000_I0(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0364, code lost:
        r2 = (X.C16730tY) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0412, code lost:
        r0.A0D(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0415, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0558, code lost:
        r2.A03(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x055b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01fc, code lost:
        r3.A02 = r9;
        r2.A02.A09(r3);
        r11 = r2.A08;
        r10 = r11.A05;
        r13 = r10.A02();
        X.C18450wi.A0B(r13);
        r12 = new X.C28371Vv(new X.C28371Vv(new X.C28371Vv(new X.C28371Vv("participant", new X.C35081lL[]{new X.C35081lL((com.whatsapp.jid.Jid) r3.A06, "jid")}), r9.value, (X.C35081lL[]) null), "membership_requests_action", (X.C35081lL[]) null), "iq", new X.C35081lL[]{new X.C35081lL("xmlns", "w:g2"), new X.C35081lL("id", r13), new X.C35081lL("type", "set"), new X.C35081lL((com.whatsapp.jid.Jid) r3.A05, "to")});
        r11.A07.put(r13, java.lang.Integer.valueOf(r5));
        r11.A08.put(r13, r3);
        r10.A0G(r11, r12, r13, 351, 2000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0283, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x0387 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x0390 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:237:0x0637 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:118:0x0387=Splitter:B:118:0x0387, B:113:0x037f=Splitter:B:113:0x037f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:125:0x0390=Splitter:B:125:0x0390, B:120:0x0388=Splitter:B:120:0x0388} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r3 = r17
            int r0 = r3.A02
            switch(r0) {
                case 0: goto L_0x03de;
                case 1: goto L_0x03e8;
                case 2: goto L_0x03f3;
                case 3: goto L_0x0401;
                case 4: goto L_0x040a;
                case 5: goto L_0x007e;
                case 6: goto L_0x0416;
                case 7: goto L_0x0420;
                case 8: goto L_0x00b6;
                case 9: goto L_0x045c;
                case 10: goto L_0x0155;
                case 11: goto L_0x0174;
                case 12: goto L_0x04cd;
                case 13: goto L_0x04dd;
                case 14: goto L_0x050a;
                case 15: goto L_0x0184;
                case 16: goto L_0x01c3;
                case 17: goto L_0x01e0;
                case 18: goto L_0x051e;
                case 19: goto L_0x053d;
                case 20: goto L_0x0284;
                case 21: goto L_0x0549;
                case 22: goto L_0x0551;
                case 23: goto L_0x055c;
                case 24: goto L_0x0568;
                case 25: goto L_0x02ba;
                case 26: goto L_0x0584;
                case 27: goto L_0x05a5;
                case 28: goto L_0x05ed;
                case 29: goto L_0x05fc;
                case 30: goto L_0x0606;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r3.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r4 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r4
            int r1 = r3.A00
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0D
            X.02k r2 = r0.A0D(r1)
            if (r2 == 0) goto L_0x007d
            android.content.Context r0 = r4.A0u()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165446(0x7f070106, float:1.794511E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            android.view.View r6 = r2.A0H
            int r2 = r6.getWidth()
            int r0 = r6.getHeight()
            int r0 = r0 + r1
            r5 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r5, r5, r2, r0)
            androidx.core.widget.NestedScrollView r0 = r4.A0C
            r0.requestChildRectangleOnScreen(r6, r1, r5)
            int r1 = r4.A05
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r6.setBackground(r0)
            android.graphics.drawable.Drawable r3 = r6.getBackground()
            r0 = 1
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r0]
            r0 = 2
            int[] r1 = new int[r0]
            r1 = {255, 0} // fill-array
            java.lang.String r0 = "alpha"
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofInt(r0, r1)
            r2[r5] = r0
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r3, r2)
            android.graphics.drawable.Drawable r0 = r6.getBackground()
            r2.setTarget(r0)
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.setDuration(r0)
            r2.start()
            X.2Tr r1 = r4.A0H
            if (r1 == 0) goto L_0x007d
            boolean r0 = r1.A08()
            if (r0 != 0) goto L_0x007d
            r0 = 3
            r1.A02(r0)
            r0 = 1
            r1.A07 = r0
        L_0x007d:
            return
        L_0x007e:
            java.lang.Object r0 = r3.A01
            X.25o r0 = (X.C447925o) r0
            int r2 = r3.A00
            X.25q r4 = r0.A01
            X.25r r0 = r0.A04
            com.whatsapp.jid.UserJid r3 = r0.A03
            java.lang.String r1 = "LinkedAccountCardViewPresenter onFailure "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            com.obwhatsapp.biz.linkedaccounts.LinkedAccountsMediaCard r2 = r4.A07
            com.whatsapp.jid.UserJid r0 = r2.A06
            boolean r0 = X.C34901l3.A00(r0, r3)
            if (r0 == 0) goto L_0x007d
            r0 = 19
            com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0 r1 = new com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0
            r1.<init>(r4, r0)
            android.widget.LinearLayout r0 = r2.A00
            r0.removeAllViews()
            r0 = 3
            r2.A07(r1, r0)
            return
        L_0x00b6:
            java.lang.Object r5 = r3.A01
            X.25g r5 = (X.C447225g) r5
            int r2 = r3.A00
            com.whatsapp.voipcalling.CallInfo r4 = X.C30341cC.A06()
            if (r4 == 0) goto L_0x007d
            java.lang.String r0 = "voip/service/signal_thread/end_call/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r5.A2p
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8 = 0
            r3 = 1
            if (r2 != r3) goto L_0x0612
            java.lang.Integer r0 = r5.A0o
            if (r0 == 0) goto L_0x0619
            long r6 = r0.longValue()
            r1 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0619
            boolean r0 = r4.isCaller
            if (r0 == 0) goto L_0x0619
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0619
            long r1 = r4.callDuration
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0619
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r0 = r5.A09
            long r6 = r6 - r0
            r1 = 8000(0x1f40, double:3.9525E-320)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0619
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r5.A0r = r0
            android.content.Context r6 = r5.A1X
            r4 = 2131892859(0x7f121a7b, float:1.9420478E38)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            com.whatsapp.jid.UserJid r1 = com.whatsapp.voipcalling.Voip.getPeerJid()
            if (r1 != 0) goto L_0x0148
            java.lang.String r0 = "voip/getPeerDisplayNameShort/peer_jid_is_null call must have been finished"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 0
        L_0x011f:
            r2[r8] = r0
            java.lang.String r2 = r6.getString(r4, r2)
            X.0tH r0 = r5.A1Z
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r8 = 0
            r11 = r8
            r10 = r8
            android.content.Intent r1 = X.C14750ph.A0b(r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = "com.obwhatsapp.intent.action.SHOW_END_CALL_CONFIRMATION"
            r1.setAction(r0)
            java.lang.String r0 = "confirmationString"
            r1.putExtra(r0, r2)
            r6.startActivity(r1)
            return
        L_0x0148:
            X.0sG r0 = r5.A27
            X.0sH r1 = r0.A0A(r1)
            X.0sP r0 = r5.A28
            java.lang.String r0 = r0.A0C(r1)
            goto L_0x011f
        L_0x0155:
            java.lang.Object r0 = r3.A01
            X.0yg r0 = (X.C19590yg) r0
            int r2 = r3.A00
            X.0pt r0 = r0.A00
            X.0pS r1 = r0.A00
            if (r1 == 0) goto L_0x007d
            boolean r0 = r1.AIm()
            if (r0 != 0) goto L_0x007d
            boolean r0 = r1 instanceof X.C14550pN
            if (r0 == 0) goto L_0x007d
            com.obwhatsapp.DisplayExceptionDialogFactory$CompanionModeIncorrectAccessFragment r0 = new com.obwhatsapp.DisplayExceptionDialogFactory$CompanionModeIncorrectAccessFragment
            r0.<init>(r2)
            r1.Afc(r0)
            return
        L_0x0174:
            java.lang.Object r2 = r3.A01
            X.2UO r2 = (X.AnonymousClass2UO) r2
            int r1 = r3.A00
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x007d
            X.2UP r0 = r2.A06
            r0.A00(r1)
            return
        L_0x0184:
            java.lang.Object r0 = r3.A01
            X.2O7 r0 = (X.AnonymousClass2O7) r0
            int r1 = r3.A00
            X.2O8 r9 = r0.A00
            r0 = 400(0x190, float:5.6E-43)
            r8 = 0
            if (r1 == r0) goto L_0x0628
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0628
            r0 = 404(0x194, float:5.66E-43)
            if (r1 == r0) goto L_0x0628
            r0 = 406(0x196, float:5.69E-43)
            if (r1 != r0) goto L_0x007d
            X.0s5 r1 = r9.A03
            X.0tC r0 = X.C15910s6.A20
            int r7 = r1.A02(r0)
            X.0pt r6 = r9.A02
            X.013 r5 = r9.A07
            r4 = 2131755350(0x7f100156, float:1.9141577E38)
            long r2 = (long) r7
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1[r8] = r0
            java.lang.String r0 = r5.A0J(r1, r4, r2)
            r6.A0H(r0, r8)
            X.124 r0 = r9.A0D
            r0.A06(r8)
            return
        L_0x01c3:
            java.lang.Object r2 = r3.A01
            X.2O4 r2 = (X.AnonymousClass2O4) r2
            int r5 = r3.A00
            X.027 r0 = r2.A00
            java.lang.Object r1 = r0.A01()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x007d
            int r0 = r5 + -1
            java.lang.Object r3 = r1.get(r0)
            X.2BN r3 = (X.AnonymousClass2BN) r3
            if (r3 == 0) goto L_0x007d
            X.2X8 r9 = X.AnonymousClass2X8.REJECT
            goto L_0x01fc
        L_0x01e0:
            java.lang.Object r2 = r3.A01
            X.2O4 r2 = (X.AnonymousClass2O4) r2
            int r5 = r3.A00
            X.027 r0 = r2.A00
            java.lang.Object r1 = r0.A01()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x007d
            int r0 = r5 + -1
            java.lang.Object r3 = r1.get(r0)
            X.2BN r3 = (X.AnonymousClass2BN) r3
            if (r3 == 0) goto L_0x007d
            X.2X8 r9 = X.AnonymousClass2X8.APPROVE
        L_0x01fc:
            r3.A02 = r9
            X.027 r0 = r2.A02
            r0.A09(r3)
            X.3Gb r11 = r2.A08
            X.0ug r10 = r11.A05
            java.lang.String r13 = r10.A02()
            X.C18450wi.A0B(r13)
            r7 = 1
            X.1lL[] r6 = new X.C35081lL[r7]
            com.whatsapp.jid.UserJid r2 = r3.A06
            java.lang.String r1 = "jid"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r1)
            r8 = 0
            r6[r8] = r0
            java.lang.String r0 = "participant"
            X.1Vv r4 = new X.1Vv
            r4.<init>(r0, r6)
            java.lang.String r0 = r9.value
            r2 = 0
            X.1Vv r1 = new X.1Vv
            r1.<init>((X.C28371Vv) r4, (java.lang.String) r0, (X.C35081lL[]) r2)
            java.lang.String r0 = "membership_requests_action"
            X.1Vv r6 = new X.1Vv
            r6.<init>((X.C28371Vv) r1, (java.lang.String) r0, (X.C35081lL[]) r2)
            r0 = 4
            X.1lL[] r4 = new X.C35081lL[r0]
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "w:g2"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r4[r8] = r0
            java.lang.String r1 = "id"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r13)
            r4[r7] = r0
            java.lang.String r2 = "type"
            java.lang.String r0 = "set"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 2
            r4[r0] = r1
            X.0sL r2 = r3.A05
            java.lang.String r0 = "to"
            X.1lL r1 = new X.1lL
            r1.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r0)
            r0 = 3
            r4[r0] = r1
            java.lang.String r0 = "iq"
            X.1Vv r12 = new X.1Vv
            r12.<init>((X.C28371Vv) r6, (java.lang.String) r0, (X.C35081lL[]) r4)
            java.util.HashMap r1 = r11.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.put(r13, r0)
            java.util.HashMap r0 = r11.A08
            r0.put(r13, r3)
            r14 = 351(0x15f, float:4.92E-43)
            r15 = 2000(0x7d0, double:9.88E-321)
            r10.A0G(r11, r12, r13, r14, r15)
            return
        L_0x0284:
            java.lang.Object r5 = r3.A01
            X.109 r5 = (X.AnonymousClass109) r5
            int r4 = r3.A00
            X.0w8 r1 = r5.A05
            r0 = 0
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x007d
            X.0tz r0 = r5.A00
            android.content.Context r1 = r0.A00
            r0 = 2131889723(0x7f120e3b, float:1.9414118E38)
            java.lang.String r3 = r1.getString(r0)
            r0 = 37
            r2 = 0
            if (r4 != r0) goto L_0x02b0
            r0 = 2131889731(0x7f120e43, float:1.9414134E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "DOC_VERIF_SUCCESS"
        L_0x02ac:
            r5.A03(r3, r1, r0, r2)
            return
        L_0x02b0:
            r0 = 2131889730(0x7f120e42, float:1.9414132E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "DOC_VERIF_FAILURE"
            goto L_0x02ac
        L_0x02ba:
            java.lang.Object r5 = r3.A01
            X.1Sk r5 = (X.C27601Sk) r5
            int r8 = r3.A00
            X.1HP r7 = r5.A0o
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.A08
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0315
            X.18B r0 = r7.A03
            r9 = 100
            X.0tq r0 = r0.A01
            X.0tf r6 = r0.get()
            X.0tg r4 = r6.A02     // Catch:{ all -> 0x0638 }
            java.lang.String r3 = "SELECT message_row_id FROM mms_thumbnail_metadata WHERE transferred = 0 AND direct_path IS NOT NULL AND enc_thumb_hash IS NOT NULL AND media_key IS NOT NULL AND enc_thumb_hash IS NOT NULL AND media_key IS NOT NULL  ORDER BY message_row_id DESC  LIMIT ? "
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x0638 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0638 }
            r2[r1] = r0     // Catch:{ all -> 0x0638 }
            android.database.Cursor r4 = r4.A08(r3, r2)     // Catch:{ all -> 0x0638 }
            java.util.LinkedList r3 = new java.util.LinkedList     // Catch:{ all -> 0x0631 }
            r3.<init>()     // Catch:{ all -> 0x0631 }
            java.lang.String r0 = "message_row_id"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0631 }
        L_0x02f2:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0631 }
            if (r0 == 0) goto L_0x0304
            long r0 = r4.getLong(r2)     // Catch:{ all -> 0x0631 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0631 }
            r3.add(r0)     // Catch:{ all -> 0x0631 }
            goto L_0x02f2
        L_0x0304:
            r4.close()     // Catch:{ all -> 0x0638 }
            r6.close()
            r3.size()
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r7.A00(r3, r0)
        L_0x0315:
            if (r8 == 0) goto L_0x007d
            X.0t8 r7 = r5.A0V
            X.0t3 r0 = r5.A0I
            long r0 = r0.A00()
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 - r2
            r9 = 32
            r11 = 0
            X.1Zf r3 = new X.1Zf
            r3.<init>((boolean) r11)
            java.lang.String r2 = "msgstore/getRetryAutodownloadMessages"
            r3.A04(r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.15B r2 = r7.A0C
            long r12 = r2.A04(r0)
            r4 = 1
            X.0tq r0 = r7.A0B     // Catch:{ IllegalStateException -> 0x0391, SQLiteDatabaseCorruptException -> 0x0398, SQLiteDiskIOException -> 0x063d }
            X.0tf r8 = r0.get()     // Catch:{ IllegalStateException -> 0x0391, SQLiteDatabaseCorruptException -> 0x0398, SQLiteDiskIOException -> 0x063d }
            X.0tg r10 = r8.A02     // Catch:{ all -> 0x038c }
            java.lang.String r2 = X.C42951yy.A0B     // Catch:{ all -> 0x038c }
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ all -> 0x038c }
            java.lang.String r0 = java.lang.Long.toString(r12)     // Catch:{ all -> 0x038c }
            r1[r11] = r0     // Catch:{ all -> 0x038c }
            android.database.Cursor r10 = r10.A08(r2, r1)     // Catch:{ all -> 0x038c }
            if (r10 == 0) goto L_0x0388
        L_0x0354:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0383 }
            if (r0 == 0) goto L_0x037f
            X.0th r0 = r7.A04     // Catch:{ all -> 0x0383 }
            X.0tZ r2 = r0.A01(r10)     // Catch:{ all -> 0x0383 }
            boolean r0 = r2 instanceof X.C16730tY     // Catch:{ all -> 0x0383 }
            if (r0 == 0) goto L_0x0379
            X.0tY r2 = (X.C16730tY) r2     // Catch:{ all -> 0x0383 }
            X.0ta r1 = r2.A02     // Catch:{ all -> 0x0383 }
            if (r1 == 0) goto L_0x0379
            boolean r0 = r1.A0P     // Catch:{ all -> 0x0383 }
            if (r0 != 0) goto L_0x0379
            boolean r0 = r1.A0Z     // Catch:{ all -> 0x0383 }
            if (r0 != 0) goto L_0x0379
            boolean r0 = r1.A0L     // Catch:{ all -> 0x0383 }
            if (r0 == 0) goto L_0x0379
            r6.add(r2)     // Catch:{ all -> 0x0383 }
        L_0x0379:
            int r0 = r6.size()     // Catch:{ all -> 0x0383 }
            if (r0 < r9) goto L_0x0354
        L_0x037f:
            r10.close()     // Catch:{ all -> 0x038c }
            goto L_0x0388
        L_0x0383:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0387 }
        L_0x0387:
            throw r0     // Catch:{ all -> 0x038c }
        L_0x0388:
            r8.close()     // Catch:{ IllegalStateException -> 0x0391, SQLiteDatabaseCorruptException -> 0x0398, SQLiteDiskIOException -> 0x063d }
            goto L_0x03a1
        L_0x038c:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0390 }
        L_0x0390:
            throw r0     // Catch:{ IllegalStateException -> 0x0391, SQLiteDatabaseCorruptException -> 0x0398, SQLiteDiskIOException -> 0x063d }
        L_0x0391:
            r1 = move-exception
            java.lang.String r0 = "msgstore/getRetryAutodownloadMessages/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x03a1
        L_0x0398:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r7.A0A
            r0.A02()
        L_0x03a1:
            java.lang.String r0 = "msgstore/getRetryAutodownloadMessages "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            int r0 = r6.size()
            r2.append(r0)
            java.lang.String r0 = " | time spent:"
            r2.append(r0)
            long r0 = r3.A01()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wP r0 = r5.A0G
            int r3 = r0.A04(r4)
            java.util.Iterator r2 = r6.iterator()
        L_0x03cc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r1 = r2.next()
            X.0tY r1 = (X.C16730tY) r1
            X.0xv r0 = r5.A0m
            r0.A01(r1, r3, r4)
            goto L_0x03cc
        L_0x03de:
            java.lang.Object r1 = r3.A01
            X.0rl r1 = (X.C15730rl) r1
            int r0 = r3.A00
            r1.A05(r0)
            return
        L_0x03e8:
            java.lang.Object r2 = r3.A01
            X.0pt r2 = (X.C14870pt) r2
            int r1 = r3.A00
            r0 = 1
            r2.A07(r1, r0)
            return
        L_0x03f3:
            java.lang.Object r0 = r3.A01
            X.2cA r0 = (X.C51722cA) r0
            int r1 = r3.A00
            com.obwhatsapp.HomeActivity r0 = r0.A01
            X.0uk r0 = r0.A0l
            r0.A04(r1)
            return
        L_0x0401:
            java.lang.Object r0 = r3.A01
            X.2YL r0 = (X.AnonymousClass2YL) r0
            int r1 = r3.A00
            X.0yo r0 = r0.A0E
            goto L_0x0412
        L_0x040a:
            java.lang.Object r0 = r3.A01
            com.obwhatsapp.backup.google.SettingsGoogleDrive r0 = (com.obwhatsapp.backup.google.SettingsGoogleDrive) r0
            int r1 = r3.A00
            X.0yo r0 = r0.A0V
        L_0x0412:
            r0.A0D(r1)
            return
        L_0x0416:
            java.lang.Object r1 = r3.A01
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            int r0 = r3.A00
            r1.A1J(r0)
            return
        L_0x0420:
            java.lang.Object r4 = r3.A01
            X.2Tr r4 = (X.AnonymousClass2Tr) r4
            int r3 = r3.A00
            r2 = 5
            if (r3 != r2) goto L_0x0430
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r4.A0F
            boolean r0 = r0.A0J
            if (r0 != 0) goto L_0x0430
            return
        L_0x0430:
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0445
            r4.A02 = r3
            X.2iQ r1 = r4.A05
            android.view.View r0 = r4.A0C
            r1.A02(r0, r3)
            r0 = 0
            if (r3 == r2) goto L_0x0441
            r0 = 1
        L_0x0441:
            r4.A07(r0)
            return
        L_0x0445:
            java.lang.String r1 = "CallControlBottomSheetBehaviorController setBottomSheetState "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r4.A0F
            r0.A0M(r3)
            return
        L_0x045c:
            java.lang.Object r2 = r3.A01
            X.2V2 r2 = (X.AnonymousClass2V2) r2
            int r5 = r3.A00
            java.lang.String r1 = "cameraui/error "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1aI r4 = r2.A00
            X.0vQ r2 = r4.A0g
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x048c
            X.0pt r2 = r4.A0d
            r1 = 2131888189(0x7f12083d, float:1.9411006E38)
            r0 = 1
            r2.A09(r1, r0)
        L_0x0486:
            X.2cZ r0 = r4.A0z
            r0.ANy()
            return
        L_0x048c:
            r0 = 2
            if (r5 == r0) goto L_0x0486
            X.1At r0 = r4.A0h
            X.0sj r1 = r0.A02
            java.lang.String r0 = "android.permission.CAMERA"
            int r1 = r1.A03(r0)
            r0 = 0
            if (r1 != 0) goto L_0x049d
            r0 = 1
        L_0x049d:
            r3 = 1
            if (r0 == 0) goto L_0x04ae
            java.lang.String r0 = "cameraui/no-camera-permission"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0pt r2 = r4.A0d
            r1 = 2131887019(0x7f1203ab, float:1.9408633E38)
        L_0x04aa:
            r2.A09(r1, r3)
            goto L_0x0486
        L_0x04ae:
            boolean r0 = r2.A00()
            if (r0 == 0) goto L_0x04ba
            X.0pt r2 = r4.A0d
            r1 = 2131888231(0x7f120867, float:1.9411091E38)
            goto L_0x04aa
        L_0x04ba:
            r0 = 3
            X.0pt r2 = r4.A0d
            if (r5 != r0) goto L_0x04c3
            r1 = 2131890839(0x7f121297, float:1.9416381E38)
            goto L_0x04aa
        L_0x04c3:
            r0 = 4
            r1 = 2131887018(0x7f1203aa, float:1.9408631E38)
            if (r5 != r0) goto L_0x04aa
            r1 = 2131892668(0x7f1219bc, float:1.942009E38)
            goto L_0x04aa
        L_0x04cd:
            java.lang.Object r0 = r3.A01
            X.0t9 r0 = (X.C16490t9) r0
            int r4 = r3.A00
            X.0xp r3 = r0.A07
            X.1a9 r2 = r0.A02
            r1 = 0
            r0 = 1
            r3.AdN(r2, r4, r1, r0)
            return
        L_0x04dd:
            java.lang.Object r5 = r3.A01
            com.obwhatsapp.group.GroupChatInfoActivity r5 = (com.obwhatsapp.group.GroupChatInfoActivity) r5
            int r2 = r3.A00
            X.0sL r0 = r5.A1N
            if (r0 != 0) goto L_0x04f3
            X.0uk r1 = r5.A0X
            X.0sL r0 = r5.A3M()
            X.0sL r0 = r1.A02(r0)
            r5.A1N = r0
        L_0x04f3:
            X.0pt r1 = r5.A05
            X.05f r4 = X.C011005f.RESUMED
            r0 = 14
            com.facebook.redex.RunnableRunnableShape0S0101000_I0 r3 = new com.facebook.redex.RunnableRunnableShape0S0101000_I0
            r3.<init>((java.lang.Object) r5, (int) r2, (int) r0)
            android.os.Handler r2 = r1.A02
            r1 = 2
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0
            r0.<init>(r5, r4, r3, r1)
            r2.post(r0)
            return
        L_0x050a:
            java.lang.Object r0 = r3.A01
            com.obwhatsapp.group.GroupChatInfoActivity r0 = (com.obwhatsapp.group.GroupChatInfoActivity) r0
            int r5 = r3.A00
            com.obwhatsapp.group.view.custom.GroupDetailsCard r1 = r0.A1H
            boolean r6 = r0.A1l
            X.0sH r2 = r0.A0w
            com.obwhatsapp.group.GroupCallButtonController r3 = r0.A15
            X.0sL r4 = r0.A1N
            r1.A04(r2, r3, r4, r5, r6)
            return
        L_0x051e:
            java.lang.Object r0 = r3.A01
            X.2Ny r0 = (X.C48572Ny) r0
            int r3 = r3.A00
            X.2Nz r2 = r0.A01
            java.lang.String r1 = "ChatSupportTicketManager/contactSupport/onError, errorCode="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1YD r0 = r2.A00
            r0.AOM(r3)
            return
        L_0x053d:
            java.lang.Object r0 = r3.A01
            com.obwhatsapp.migration.android.integration.service.GoogleMigrateService r0 = (com.obwhatsapp.migration.android.integration.service.GoogleMigrateService) r0
            int r1 = r3.A00
            X.1NO r0 = r0.A02
            r0.A0F(r1)
            return
        L_0x0549:
            java.lang.Object r2 = r3.A01
            X.1DN r2 = (X.AnonymousClass1DN) r2
            int r1 = r3.A00
            r0 = 3
            goto L_0x0558
        L_0x0551:
            java.lang.Object r2 = r3.A01
            X.1DN r2 = (X.AnonymousClass1DN) r2
            int r1 = r3.A00
            r0 = 4
        L_0x0558:
            r2.A03(r1, r0)
            return
        L_0x055c:
            java.lang.Object r2 = r3.A01
            X.27A r2 = (X.AnonymousClass27A) r2
            int r1 = r3.A00
            X.0rv r0 = r2.A0I
            r2.A03(r0, r1)
            return
        L_0x0568:
            java.lang.Object r3 = r3.A01
            X.27A r3 = (X.AnonymousClass27A) r3
            X.0rv r2 = r3.A0I
            r3.A02(r2)
            X.121 r0 = r3.A0K
            r1 = 401(0x191, float:5.62E-43)
            X.12B r0 = r0.A0L
            r0.A00(r2, r1)
            X.0pt r2 = r3.A07
            r1 = 2131888342(0x7f1208d6, float:1.9411317E38)
            r0 = 0
            r2.A09(r1, r0)
            return
        L_0x0584:
            java.lang.Object r4 = r3.A01
            com.obwhatsapp.registration.report.BanReportViewModel r4 = (com.obwhatsapp.registration.report.BanReportViewModel) r4
            int r3 = r3.A00
            r0 = 5
            if (r3 <= r0) goto L_0x0598
            X.027 r1 = r4.A02
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B(r0)
            return
        L_0x0598:
            X.0sq r2 = r4.A08
            r1 = 27
            com.facebook.redex.RunnableRunnableShape0S0101000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0101000_I0
            r0.<init>((java.lang.Object) r4, (int) r3, (int) r1)
            r2.Acl(r0)
            return
        L_0x05a5:
            java.lang.Object r1 = r3.A01
            com.obwhatsapp.registration.report.BanReportViewModel r1 = (com.obwhatsapp.registration.report.BanReportViewModel) r1
            int r2 = r3.A00
            X.4Cu r0 = r1.A03
            java.lang.String r10 = r1.A00
            X.2FC r4 = r0.A00
            X.0sX r3 = r4.A02
            X.01J r0 = r3.AN9
            java.lang.Object r5 = r0.get()
            X.0ua r5 = (X.C17130ua) r5
            X.01J r0 = r3.AQh
            java.lang.Object r6 = r0.get()
            X.0rz r6 = (X.C15860rz) r6
            X.01J r0 = r3.AQV
            X.01D r9 = X.C17270uo.A00(r0)
            X.01J r0 = r3.APW
            java.lang.Object r8 = r0.get()
            X.0vR r8 = (X.C17660vR) r8
            X.01J r0 = r3.A05
            java.lang.Object r7 = r0.get()
            X.0pd r7 = (X.C14710pd) r7
            X.2FD r0 = r4.A03
            X.01J r11 = r0.A15
            X.01J r12 = r0.A0A
            X.3xG r4 = new X.3xG
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            X.4yo r0 = new X.4yo
            r0.<init>(r1, r2)
            r4.Aah(r0)
            return
        L_0x05ed:
            java.lang.Object r2 = r3.A01
            com.obwhatsapp.search.views.TokenizedSearchInput r2 = (com.obwhatsapp.search.views.TokenizedSearchInput) r2
            int r1 = r3.A00
            com.obwhatsapp.WaImageButton r0 = r2.A0S
            r0.setVisibility(r1)
            r2.A0B()
            return
        L_0x05fc:
            java.lang.Object r1 = r3.A01
            com.obwhatsapp.text.AutoSizeTextView r1 = (com.obwhatsapp.text.AutoSizeTextView) r1
            int r0 = r3.A00
            com.facebook.redex.RunnableRunnableShape0S0101000_I0.super.setTextSize(0, (float) r0)
            return
        L_0x0606:
            java.lang.Object r0 = r3.A01
            X.1ZK r0 = (X.AnonymousClass1ZK) r0
            int r1 = r3.A00
            X.00l r0 = r0.A0j
            X.AnonymousClass29T.A01(r0, r1)
            return
        L_0x0612:
            r0 = 2
            if (r2 != r0) goto L_0x0619
            java.lang.Integer r0 = r5.A0r
            r5.A0p = r0
        L_0x0619:
            int r1 = r4.callLinkState
            if (r1 == r3) goto L_0x0624
            r0 = 2
            if (r1 == r0) goto L_0x0624
            r0 = 3
            if (r1 == r0) goto L_0x0624
            r8 = 1
        L_0x0624:
            com.whatsapp.voipcalling.Voip.endCall(r8)
            return
        L_0x0628:
            X.0pt r1 = r9.A02
            r0 = 2131888787(0x7f120a93, float:1.941222E38)
            r1.A09(r0, r8)
            return
        L_0x0631:
            r0 = move-exception
            if (r4 == 0) goto L_0x0637
            r4.close()     // Catch:{ all -> 0x0637 }
        L_0x0637:
            throw r0     // Catch:{ all -> 0x0638 }
        L_0x0638:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x063c }
        L_0x063c:
            throw r0
        L_0x063d:
            r1 = move-exception
            X.0y0 r0 = r7.A09
            r0.A00(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0101000_I0.run():void");
    }
}
