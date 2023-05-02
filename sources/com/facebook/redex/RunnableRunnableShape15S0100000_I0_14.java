package com.facebook.redex;

import X.C41441vn;
import java.lang.ref.WeakReference;

public class RunnableRunnableShape15S0100000_I0_14 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape15S0100000_I0_14(C41441vn r2) {
        this.A01 = 14;
        this.A00 = new WeakReference(r2);
    }

    public RunnableRunnableShape15S0100000_I0_14(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04c9, code lost:
        r4.postDelayed(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04cc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04f2, code lost:
        r1.fullScroll(130);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04f7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0540, code lost:
        r2.A09(r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0544, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x019d, code lost:
        r4.A37(new com.facebook.redex.RunnableRunnableShape11S0200000_I0_9(r4, r1, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r18 = this;
            r5 = r18
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0728;
                case 1: goto L_0x0705;
                case 2: goto L_0x06fd;
                case 3: goto L_0x0256;
                case 4: goto L_0x06f3;
                case 5: goto L_0x06dc;
                case 6: goto L_0x06d4;
                case 7: goto L_0x06cc;
                case 8: goto L_0x06b3;
                case 9: goto L_0x0226;
                case 10: goto L_0x01ef;
                case 11: goto L_0x06ab;
                case 12: goto L_0x01d3;
                case 13: goto L_0x06a3;
                case 14: goto L_0x01c3;
                case 15: goto L_0x01a6;
                case 16: goto L_0x05de;
                case 17: goto L_0x05b1;
                case 18: goto L_0x0180;
                case 19: goto L_0x0162;
                case 20: goto L_0x05a6;
                case 21: goto L_0x059c;
                case 22: goto L_0x0592;
                case 23: goto L_0x0568;
                case 24: goto L_0x055d;
                case 25: goto L_0x054f;
                case 26: goto L_0x00d1;
                case 27: goto L_0x0545;
                case 28: goto L_0x0537;
                case 29: goto L_0x052d;
                case 30: goto L_0x0506;
                case 31: goto L_0x04f8;
                case 32: goto L_0x00b1;
                case 33: goto L_0x04ea;
                case 34: goto L_0x04e1;
                case 35: goto L_0x04d0;
                case 36: goto L_0x004a;
                case 37: goto L_0x049c;
                case 38: goto L_0x0480;
                case 39: goto L_0x0457;
                case 40: goto L_0x0435;
                case 41: goto L_0x0036;
                case 42: goto L_0x0402;
                case 43: goto L_0x0015;
                case 44: goto L_0x02ad;
                case 45: goto L_0x0294;
                case 46: goto L_0x028c;
                case 47: goto L_0x026f;
                case 48: goto L_0x0267;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r5.A00
            X.0pN r1 = (X.C14550pN) r1
            r1.Ac1()
            r0 = 2131892306(0x7f121852, float:1.9419357E38)
            r1.Afg(r0)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r0 = r5.A00
            X.0tJ r0 = (X.C16590tJ) r0
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r2 = r0.iterator()
        L_0x0021:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r2.next()
            X.1vy r0 = (X.C41471vy) r0
            com.obwhatsapp.tosgating.viewmodel.ToSGatingViewModel r0 = r0.A00
            X.027 r1 = r0.A01
            r0 = 0
            r1.A0B(r0)
            goto L_0x0021
        L_0x0036:
            java.lang.Object r3 = r5.A00
            X.1w2 r3 = (X.C41501w2) r3
            X.1cz r0 = r3.A04
            if (r0 != 0) goto L_0x0014
            X.0sb r1 = r3.A07
            java.lang.String r0 = X.C17970vw.A0H()
            java.io.File r0 = r1.A0N(r0)
            goto L_0x0730
        L_0x004a:
            java.lang.Object r0 = r5.A00
            X.1w2 r0 = (X.C41501w2) r0
            java.lang.ref.WeakReference r0 = r0.A0C
            java.lang.Object r5 = r0.get()
            X.1w4 r5 = (X.C41521w4) r5
            if (r5 == 0) goto L_0x0014
            X.0pS r1 = r5.A0F
            r0 = 2131888226(0x7f120862, float:1.9411081E38)
            r1.Afg(r0)
            X.1w6 r0 = r5.A06
            if (r0 == 0) goto L_0x00a8
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            X.1wB r2 = r0.A0b
            if (r2 == 0) goto L_0x00a8
            X.1wD r0 = r2.A06
            X.1wE r1 = r0.A00
            X.1wE r0 = X.C41601wE.RECORDING
            if (r1 != r0) goto L_0x00a8
            X.1wF r0 = new X.1wF
            r0.<init>(r2)
            r2.A06 = r0
            r0 = 0
            r2.A0A = r0
            X.1wG r4 = r2.A0L
            r3 = r4
            com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r3 = (com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r3
            android.widget.ImageButton r2 = r3.A04
            X.01V r1 = r3.A0B
            boolean r0 = X.C15450qv.A09()
            if (r0 == 0) goto L_0x00ad
            r0 = 17
            r2.performHapticFeedback(r0)
        L_0x0090:
            r3.A01()
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r1 = 15
            com.facebook.redex.IDxLAdapterShape4S0100000_2_I1 r0 = new com.facebook.redex.IDxLAdapterShape4S0100000_2_I1
            r0.<init>(r3, r1)
            r2.addListener(r0)
            r2.start()
            r4.AHo()
        L_0x00a8:
            r0 = 1
            r5.A04(r0)
            return
        L_0x00ad:
            X.C41631wI.A02(r1)
            goto L_0x0090
        L_0x00b1:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            X.1wN r3 = r0.A0L
            X.1ZR r1 = r3.A01
            boolean r0 = r1 instanceof X.C41691wO
            if (r0 == 0) goto L_0x0014
            X.1wO r1 = (X.C41691wO) r1
            com.whatsapp.jid.UserJid r2 = r1.A00
            X.0uc r0 = r3.A0I
            java.lang.String r1 = r0.A01(r2)
            if (r1 == 0) goto L_0x00cd
            X.1ZR r0 = r3.A01
            r0.A0H = r1
        L_0x00cd:
            r3.A09(r2)
            return
        L_0x00d1:
            java.lang.Object r2 = r5.A00
            X.1Ng r2 = (X.C26321Ng) r2
            X.0sq r3 = r2.A05
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            X.024 r3 = X.C41711wS.A00(r3, r0)
            X.1wT r8 = r2.A03     // Catch:{ 057 -> 0x079b }
            X.1CW r5 = r8.A01     // Catch:{ 057 -> 0x079b }
            java.lang.String r4 = "STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME"
            java.lang.Long r0 = r5.A01(r4)     // Catch:{ 057 -> 0x079b }
            boolean r0 = r2.A00(r0)     // Catch:{ 057 -> 0x079b }
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = "storage-usage-prefetcher/prefetch media size"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 057 -> 0x079b }
            X.0sb r0 = r2.A00     // Catch:{ 057 -> 0x079b }
            X.1jH r0 = r0.A05()     // Catch:{ 057 -> 0x079b }
            java.io.File r1 = r0.A0A     // Catch:{ 057 -> 0x079b }
            r0 = 0
            X.C16180sb.A04(r1, r0)     // Catch:{ 057 -> 0x079b }
            long r6 = X.AnonymousClass1XI.A00(r3, r1)     // Catch:{ 057 -> 0x079b }
            java.lang.String r1 = "STORAGE_USAGE_MEDIA_SIZE"
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ 057 -> 0x079b }
            r5.A05(r1, r0)     // Catch:{ 057 -> 0x079b }
            r8.A01(r4)     // Catch:{ 057 -> 0x079b }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch media size/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 057 -> 0x079b }
        L_0x0116:
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_CACHE_TIME"
            java.lang.Long r0 = r5.A01(r0)     // Catch:{ 057 -> 0x079b }
            boolean r0 = r2.A00(r0)     // Catch:{ 057 -> 0x079b }
            r4 = 10
            if (r0 == 0) goto L_0x0136
            java.lang.String r0 = "storage-usage-prefetcher/prefetch large files"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 057 -> 0x079b }
            X.1wU r1 = r2.A04     // Catch:{ 057 -> 0x079b }
            r0 = 2
            r1.A00(r3, r4, r0)     // Catch:{ 057 -> 0x079b }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch large files/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 057 -> 0x079b }
        L_0x0136:
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME"
            java.lang.Long r0 = r5.A01(r0)     // Catch:{ 057 -> 0x079b }
            boolean r0 = r2.A00(r0)     // Catch:{ 057 -> 0x079b }
            if (r0 == 0) goto L_0x0154
            java.lang.String r0 = "storage-usage-prefetcher/prefetch forwarded files"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 057 -> 0x079b }
            X.1wU r1 = r2.A04     // Catch:{ 057 -> 0x079b }
            r0 = 1
            r1.A00(r3, r4, r0)     // Catch:{ 057 -> 0x079b }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch forwarded files/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 057 -> 0x079b }
        L_0x0154:
            java.lang.String r0 = "STORAGE_USAGE_CHAT_LIST_CACHE_TIME"
            java.lang.Long r0 = r5.A01(r0)     // Catch:{ 057 -> 0x079b }
            boolean r0 = r2.A00(r0)     // Catch:{ 057 -> 0x079b }
            if (r0 == 0) goto L_0x0014
            goto L_0x077c
        L_0x0162:
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.storage.StorageUsageActivity r4 = (com.obwhatsapp.storage.StorageUsageActivity) r4
            X.1wU r0 = r4.A0I
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = "storage-usage-activity/fetch large files"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1wU r3 = r4.A0I
            int r2 = r4.A00
            r1 = 2
            X.024 r0 = new X.024
            r0.<init>()
            X.1YK r2 = r3.A00(r0, r2, r1)
            r1 = 4
            goto L_0x019d
        L_0x0180:
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.storage.StorageUsageActivity r4 = (com.obwhatsapp.storage.StorageUsageActivity) r4
            X.1wU r0 = r4.A0I
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = "storage-usage-activity/fetch forwarded files"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1wU r3 = r4.A0I
            int r2 = r4.A00
            r1 = 1
            X.024 r0 = new X.024
            r0.<init>()
            X.1YK r2 = r3.A00(r0, r2, r1)
            r1 = 3
        L_0x019d:
            com.facebook.redex.RunnableRunnableShape11S0200000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape11S0200000_I0_9
            r0.<init>(r4, r1, r2)
            r4.A37(r0)
            return
        L_0x01a6:
            java.lang.Object r0 = r5.A00
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x01ae:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            X.AnonymousClass1XI.A0N(r0)
            goto L_0x01ae
        L_0x01c3:
            java.lang.Object r0 = r5.A00
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r0 = r0.get()
            X.1vn r0 = (X.C41441vn) r0
            if (r0 == 0) goto L_0x0014
            r0.A00()
            return
        L_0x01d3:
            java.lang.Object r0 = r5.A00
            X.0tJ r0 = (X.C16590tJ) r0
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x01df:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1we r0 = (X.C41781we) r0
            r0.A00()
            goto L_0x01df
        L_0x01ef:
            java.lang.Object r0 = r5.A00
            X.0tJ r0 = (X.C16590tJ) r0
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r2 = r0.iterator()
        L_0x01fb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r2.next()
            X.1we r1 = (X.C41781we) r1
            boolean r0 = r1 instanceof com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0
            if (r0 == 0) goto L_0x01fb
            com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0 r1 = (com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0) r1
            int r0 = r1.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x01fb
            java.lang.Object r1 = r1.A00
            X.1wf r1 = (X.C41791wf) r1
            X.1wg r0 = r1.A03
            if (r0 == 0) goto L_0x021e
            r0.AVr()
        L_0x021e:
            X.1Mo r0 = r1.A01
            if (r0 == 0) goto L_0x01fb
            r0.A05()
            goto L_0x01fb
        L_0x0226:
            java.lang.Object r0 = r5.A00
            X.0tJ r0 = (X.C16590tJ) r0
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r2 = r0.iterator()
        L_0x0232:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r2.next()
            X.1we r1 = (X.C41781we) r1
            boolean r0 = r1 instanceof com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0
            if (r0 == 0) goto L_0x0232
            com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0 r1 = (com.whatsapp.stickers.IDxSObserverShape99S0100000_1_I0) r1
            int r0 = r1.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0232
            java.lang.Object r0 = r1.A00
            X.1wf r0 = (X.C41791wf) r0
            X.1wg r0 = r0.A03
            if (r0 == 0) goto L_0x0232
            r0.AVr()
            goto L_0x0232
        L_0x0256:
            java.lang.Object r1 = r5.A00
            X.2Ac r1 = (X.AnonymousClass2Ac) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0014
            X.2Ad r0 = r1.A0J
            r0.A01()
            r1.A00()
            return
        L_0x0267:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.twofactor.TwoFactorAuthActivity r0 = (com.obwhatsapp.twofactor.TwoFactorAuthActivity) r0
            r0.AZH()
            return
        L_0x026f:
            java.lang.Object r4 = r5.A00
            com.obwhatsapp.twofactor.SettingsTwoFactorAuthActivity r4 = (com.obwhatsapp.twofactor.SettingsTwoFactorAuthActivity) r4
            X.0ps r0 = r4.A08
            java.lang.String r0 = r0.A01()
            boolean r0 = r0.isEmpty()
            r3 = r0 ^ 1
            X.0pt r2 = r4.A05
            r1 = 29
            com.facebook.redex.RunnableRunnableShape0S0110000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0110000_I0
            r0.<init>(r4, r1, r3)
            r2.A0K(r0)
            return
        L_0x028c:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.twofactor.SettingsTwoFactorAuthActivity r0 = (com.obwhatsapp.twofactor.SettingsTwoFactorAuthActivity) r0
            r0.AZH()
            return
        L_0x0294:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.twofactor.SetEmailFragment r3 = (com.obwhatsapp.twofactor.SetEmailFragment) r3
            com.obwhatsapp.twofactor.TwoFactorAuthActivity r2 = r3.A06
            com.obwhatsapp.twofactor.SetEmailFragment$ConfirmSkipEmailDialog r1 = new com.obwhatsapp.twofactor.SetEmailFragment$ConfirmSkipEmailDialog
            r1.<init>()
            r0 = -1
            r1.A0W(r3, r0)
            java.lang.Class<com.obwhatsapp.twofactor.SetEmailFragment$ConfirmSkipEmailDialog> r0 = com.obwhatsapp.twofactor.SetEmailFragment.ConfirmSkipEmailDialog.class
            java.lang.String r0 = r0.getName()
            r2.Afb(r1, r0)
            return
        L_0x02ad:
            java.lang.Object r7 = r5.A00
            X.135 r7 = (X.AnonymousClass135) r7
            X.0pd r4 = r7.A05
            r0 = 908(0x38c, float:1.272E-42)
            X.0tM r3 = X.C16620tM.A02
            int r6 = r4.A03(r3, r0)
            X.18I r10 = r7.A08
            android.content.SharedPreferences r2 = r10.A00()
            java.lang.String r1 = "tos_fetch_iteration"
            r0 = 0
            int r0 = r2.getInt(r1, r0)
            r5 = 0
            if (r6 <= r0) goto L_0x02cd
            r5 = 1
        L_0x02cd:
            r0 = 877(0x36d, float:1.229E-42)
            boolean r0 = r4.A0E(r3, r0)
            if (r0 != 0) goto L_0x02e6
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x02da:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0360
            X.1ue r0 = r7.A09
            r0.A01()
            return
        L_0x02e6:
            if (r5 == 0) goto L_0x02eb
            java.util.List r4 = r7.A0D
            goto L_0x02da
        L_0x02eb:
            long r16 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r3 = r10.A00()
            java.lang.String r2 = "request_refresh_rate_seconds"
            r0 = 864000000(0x337f9800, double:4.26872718E-315)
            long r14 = r3.getLong(r2, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r0 = r7.A0D
            java.util.Iterator r13 = r0.iterator()
        L_0x0307:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02da
            java.lang.Object r9 = r13.next()
            java.lang.String r9 = (java.lang.String) r9
            android.content.SharedPreferences r3 = r10.A00()
            java.lang.String r1 = "tos_last_refresh_timestamp_"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r2 = r0.toString()
            r0 = -1
            long r11 = r3.getLong(r2, r0)
            r8 = 1
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0359
            long r1 = r16 - r11
            r11 = 0
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0307
            X.0sK r0 = r7.A02
            boolean r3 = r0.A0G()
            android.content.SharedPreferences r2 = r10.A00()
            java.lang.String r1 = "tos_acceptance_state_"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            int r0 = r2.getInt(r0, r11)
            if (r3 == 0) goto L_0x035d
            if (r0 == r8) goto L_0x0307
        L_0x0359:
            r4.add(r9)
            goto L_0x0307
        L_0x035d:
            if (r0 != 0) goto L_0x0307
            goto L_0x0359
        L_0x0360:
            X.0ug r2 = r7.A06
            X.0wP r1 = r7.A03
            X.1vw r0 = new X.1vw
            r0.<init>(r7, r4, r6, r5)
            X.1vx r9 = new X.1vx
            r9.<init>(r1, r2, r0, r4)
            X.0wP r0 = r9.A00
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x037d
            X.1vw r1 = r9.A02
            r0 = -1
            r1.A00(r0)
            return
        L_0x037d:
            X.0ug r8 = r9.A01
            java.lang.String r11 = r8.A02()
            r12 = 282(0x11a, float:3.95E-43)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r0 = r9.A03
            java.util.Iterator r5 = r0.iterator()
        L_0x0390:
            boolean r0 = r5.hasNext()
            java.lang.String r6 = "id"
            r3 = 1
            r7 = 0
            if (r0 == 0) goto L_0x03b4
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            X.1lL[] r2 = new X.C35081lL[r3]
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r6, (java.lang.String) r1)
            r2[r7] = r0
            java.lang.String r1 = "notice"
            X.1Vv r0 = new X.1Vv
            r0.<init>(r1, r2)
            r4.add(r0)
            goto L_0x0390
        L_0x03b4:
            r2 = 0
            X.1Vv[] r0 = new X.C28371Vv[r7]
            java.lang.Object[] r1 = r4.toArray(r0)
            X.1Vv[] r1 = (X.C28371Vv[]) r1
            java.lang.String r0 = "request"
            X.1Vv r5 = new X.1Vv
            r5.<init>((java.lang.String) r0, (X.C35081lL[]) r2, (X.C28371Vv[]) r1)
            r0 = 4
            X.1lL[] r4 = new X.C35081lL[r0]
            X.1ks r2 = X.C34791ks.A00
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r1)
            r4[r7] = r0
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r6, (java.lang.String) r11)
            r4[r3] = r0
            r3 = 2
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "tos"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r4[r3] = r0
            r3 = 3
            java.lang.String r2 = "type"
            java.lang.String r1 = "get"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r4[r3] = r0
            java.lang.String r0 = "iq"
            X.1Vv r10 = new X.1Vv
            r10.<init>((X.C28371Vv) r5, (java.lang.String) r0, (X.C35081lL[]) r4)
            r13 = 32000(0x7d00, double:1.581E-319)
            r8.A0B(r9, r10, r11, r12, r13)
            return
        L_0x0402:
            java.lang.Object r4 = r5.A00
            X.1w0 r4 = (X.C41481w0) r4
            X.1bx r0 = r4.A02
            r3 = 0
            if (r0 != 0) goto L_0x0430
            r2 = 0
        L_0x040c:
            X.1bx r0 = r4.A02
            if (r0 == 0) goto L_0x0414
            int r3 = r0.A02()
        L_0x0414:
            if (r2 <= 0) goto L_0x0428
            X.027 r1 = r4.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A0B(r0)
            X.027 r1 = r4.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A0B(r0)
        L_0x0428:
            android.os.Handler r2 = r4.A04
            r0 = 16
            r2.postDelayed(r5, r0)
            return
        L_0x0430:
            int r2 = r0.A03()
            goto L_0x040c
        L_0x0435:
            java.lang.Object r5 = r5.A00
            X.1w2 r5 = (X.C41501w2) r5
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r5.A02
            long r3 = r3 - r0
            android.os.Handler r2 = r5.A06
            r1 = 4
            com.facebook.redex.RunnableRunnableShape0S0100100_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0100100_I0
            r0.<init>(r5, r3, r1)
            r2.post(r0)
            android.os.Handler r4 = r5.A03
            r0 = 40
            com.facebook.redex.RunnableRunnableShape15S0100000_I0_14 r3 = new com.facebook.redex.RunnableRunnableShape15S0100000_I0_14
            r3.<init>(r5, r0)
            r0 = 150(0x96, double:7.4E-322)
            goto L_0x04c9
        L_0x0457:
            java.lang.Object r2 = r5.A00
            X.1w2 r2 = (X.C41501w2) r2
            X.1cz r0 = r2.A04
            if (r0 == 0) goto L_0x0474
            float r1 = r0.A00()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0474
            float r0 = r2.A00
            float r0 = r0 + r1
            r2.A00 = r0
            int r0 = r2.A01
            int r0 = r0 + 1
            r2.A01 = r0
        L_0x0474:
            android.os.Handler r4 = r2.A03
            r0 = 39
            com.facebook.redex.RunnableRunnableShape15S0100000_I0_14 r3 = new com.facebook.redex.RunnableRunnableShape15S0100000_I0_14
            r3.<init>(r2, r0)
            r0 = 16
            goto L_0x04c9
        L_0x0480:
            java.lang.Object r5 = r5.A00
            X.1w2 r5 = (X.C41501w2) r5
            X.1cz r0 = r5.A04
            r4 = 0
            if (r0 == 0) goto L_0x049a
            java.io.File r3 = r0.A09
            java.io.File r4 = r0.A08
        L_0x048d:
            android.os.Handler r2 = r5.A06
            r1 = 19
            com.facebook.redex.RunnableRunnableShape2S0300000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape2S0300000_I0_2
            r0.<init>(r5, r4, r3, r1)
            r2.post(r0)
            return
        L_0x049a:
            r3 = r4
            goto L_0x048d
        L_0x049c:
            java.lang.Object r5 = r5.A00
            X.1w2 r5 = (X.C41501w2) r5
            int r0 = r5.A01
            if (r0 <= 0) goto L_0x04cd
            float r2 = r5.A00
            float r0 = (float) r0
            float r2 = r2 / r0
        L_0x04a8:
            r0 = 0
            r5.A00 = r0
            r0 = 0
            r5.A01 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x04be
            android.os.Handler r1 = r5.A06
            X.1wl r0 = new X.1wl
            r0.<init>(r5, r2)
            r1.post(r0)
        L_0x04be:
            android.os.Handler r4 = r5.A03
            r0 = 37
            com.facebook.redex.RunnableRunnableShape15S0100000_I0_14 r3 = new com.facebook.redex.RunnableRunnableShape15S0100000_I0_14
            r3.<init>(r5, r0)
            long r0 = r5.A05
        L_0x04c9:
            r4.postDelayed(r3, r0)
            return
        L_0x04cd:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x04a8
        L_0x04d0:
            java.lang.Object r1 = r5.A00
            java.io.File r1 = (java.io.File) r1
            boolean r0 = X.AnonymousClass01E.A01()
            r0 = r0 ^ 1
            X.AnonymousClass00B.A0F(r0)
            X.AnonymousClass1XI.A0N(r1)
            return
        L_0x04e1:
            java.lang.Object r0 = r5.A00
            X.1wJ r0 = (X.C41641wJ) r0
            X.1wL r0 = r0.A00
            android.widget.ScrollView r1 = r0.A07
            goto L_0x04f2
        L_0x04ea:
            java.lang.Object r0 = r5.A00
            X.1wM r0 = (X.C41671wM) r0
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r0 = r0.A01
            android.widget.ScrollView r1 = r0.A0B
        L_0x04f2:
            r0 = 130(0x82, float:1.82E-43)
            r1.fullScroll(r0)
            return
        L_0x04f8:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            X.0wL r2 = r0.A0V
            X.1wN r1 = r0.A0L
            X.1ZR r0 = r1.A01
            r2.A05(r0, r1)
            return
        L_0x0506:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r3 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r3
            android.view.View r1 = r3.A07
            if (r1 == 0) goto L_0x0525
            r0 = 8
            r1.setVisibility(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 320(0x140, double:1.58E-321)
            r2.setDuration(r0)
            android.view.View r0 = r3.A07
            r0.startAnimation(r2)
        L_0x0525:
            X.0pt r1 = r3.A05
            java.lang.Runnable r0 = r3.A0u
            r1.A0J(r0)
            return
        L_0x052d:
            java.lang.Object r0 = r5.A00
            X.1Y6 r0 = (X.AnonymousClass1Y6) r0
            X.0pt r2 = r0.A00
            r1 = 2131891209(0x7f121409, float:1.9417132E38)
            goto L_0x0540
        L_0x0537:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.support.ReportSpamDialogFragment r0 = (com.obwhatsapp.support.ReportSpamDialogFragment) r0
            X.0pt r2 = r0.A01
            r1 = 2131887504(0x7f120590, float:1.9409617E38)
        L_0x0540:
            r0 = 1
            r2.A09(r1, r0)
            return
        L_0x0545:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.support.ReportSpamDialogFragment r0 = (com.obwhatsapp.support.ReportSpamDialogFragment) r0
            X.1wR r0 = r0.A0D
            r0.AW8()
            return
        L_0x054f:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.storage.StorageUsageMediaPreviewView r3 = (com.obwhatsapp.storage.StorageUsageMediaPreviewView) r3
            java.util.List r2 = r3.A04
            int r1 = r3.A00
            java.lang.String r0 = r3.A03
            r3.setPreviewMediaItems(r2, r1, r0)
            return
        L_0x055d:
            java.lang.Object r1 = r5.A00
            X.0pN r1 = (X.C14550pN) r1
            r0 = 2131887782(0x7f1206a6, float:1.941018E38)
            r1.Afq(r0)
            return
        L_0x0568:
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.storage.StorageUsageGalleryActivity r3 = (com.obwhatsapp.storage.StorageUsageGalleryActivity) r3
            r1 = 2131889292(0x7f120c8c, float:1.9413243E38)
            r0 = 0
            com.obwhatsapp.dialogs.ProgressDialogFragment r1 = com.obwhatsapp.dialogs.ProgressDialogFragment.A01(r0, r1)
            r3.A0S = r1
            r0 = 1
            r1.A1H(r0)
            com.obwhatsapp.dialogs.ProgressDialogFragment r2 = r3.A0S
            r1 = 4
            com.facebook.redex.IDxKListenerShape224S0100000_2_I1 r0 = new com.facebook.redex.IDxKListenerShape224S0100000_2_I1
            r0.<init>(r3, r1)
            r2.A00 = r0
            X.02C r1 = r3.AGM()
            java.lang.Class<com.obwhatsapp.dialogs.ProgressDialogFragment> r0 = com.obwhatsapp.dialogs.ProgressDialogFragment.class
            java.lang.String r0 = r0.getName()
            r2.A1G(r1, r0)
            return
        L_0x0592:
            java.lang.Object r0 = r5.A00
            X.1wY r0 = (X.C41741wY) r0
            com.obwhatsapp.storage.StorageUsageDeleteCompleteDialogFragment r0 = r0.A00
            r0.A1D()
            return
        L_0x059c:
            java.lang.Object r2 = r5.A00
            X.1YJ r2 = (X.AnonymousClass1YJ) r2
            r1 = 2
            r0 = 1
            r2.A0I(r1, r0)
            return
        L_0x05a6:
            java.lang.Object r0 = r5.A00
            X.1wb r0 = (X.C41751wb) r0
            com.obwhatsapp.storage.StorageUsageActivity r1 = r0.A00
            r0 = 3
            r1.A36(r0)
            return
        L_0x05b1:
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.storage.StorageUsageActivity r2 = (com.obwhatsapp.storage.StorageUsageActivity) r2
            java.lang.String r0 = "storage-usage-activity/fetch media size"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sb r1 = r2.A04
            X.1wT r0 = r2.A0H
            long r4 = X.C14740pg.A00(r1, r0)
            X.0pf r0 = r2.A06
            long r6 = r0.A01()
            X.0pf r0 = r2.A06
            long r8 = r0.A03()
            X.1YI r3 = new X.1YI
            r3.<init>(r4, r6, r8)
            r1 = 5
            com.facebook.redex.RunnableRunnableShape11S0200000_I0_9 r0 = new com.facebook.redex.RunnableRunnableShape11S0200000_I0_9
            r0.<init>(r2, r1, r3)
            r2.A37(r0)
            return
        L_0x05de:
            java.lang.Object r5 = r5.A00
            com.obwhatsapp.storage.StorageUsageActivity r5 = (com.obwhatsapp.storage.StorageUsageActivity) r5
            X.0sq r2 = r5.A05
            r1 = 17
            com.facebook.redex.RunnableRunnableShape15S0100000_I0_14 r0 = new com.facebook.redex.RunnableRunnableShape15S0100000_I0_14
            r0.<init>(r5, r1)
            r2.Acl(r0)
            X.0sq r2 = r5.A05
            r1 = 18
            com.facebook.redex.RunnableRunnableShape15S0100000_I0_14 r0 = new com.facebook.redex.RunnableRunnableShape15S0100000_I0_14
            r0.<init>(r5, r1)
            r2.Acl(r0)
            X.0sq r2 = r5.A05
            r1 = 19
            com.facebook.redex.RunnableRunnableShape15S0100000_I0_14 r0 = new com.facebook.redex.RunnableRunnableShape15S0100000_I0_14
            r0.<init>(r5, r1)
            r2.Acl(r0)
            java.lang.String r0 = "storage-usage-activity/fetch cache"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1wT r4 = r5.A0H
            java.lang.String r3 = "STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME"
            boolean r0 = r4.A02(r3)
            if (r0 != 0) goto L_0x0621
            X.1CW r2 = r4.A01
            r1 = 0
            r2.A05(r3, r1)
            java.lang.String r0 = "STORAGE_USAGE_MEDIA_SIZE"
            r2.A05(r0, r1)
        L_0x0621:
            java.lang.String r3 = "STORAGE_USAGE_LARGE_FILES_CACHE_TIME"
            boolean r0 = r4.A02(r3)
            if (r0 != 0) goto L_0x063e
            X.1CW r2 = r4.A01
            r1 = 0
            r2.A05(r3, r1)
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_MEDIA_SIZE"
            r2.A05(r0, r1)
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_COUNT"
            r2.A05(r0, r1)
            java.lang.String r0 = "STORAGE_USAGE_LARGE_FILES_ROW_IDS"
            r2.A05(r0, r1)
        L_0x063e:
            java.lang.String r3 = "STORAGE_USAGE_FORWARDED_FILES_CACHE_TIME"
            boolean r0 = r4.A02(r3)
            if (r0 != 0) goto L_0x065b
            X.1CW r2 = r4.A01
            r1 = 0
            r2.A05(r3, r1)
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_MEDIA_SIZE"
            r2.A05(r0, r1)
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_COUNT"
            r2.A05(r0, r1)
            java.lang.String r0 = "STORAGE_USAGE_FORWARDED_FILES_ROW_IDS"
            r2.A05(r0, r1)
        L_0x065b:
            X.1wT r0 = r5.A0H
            X.1wd r9 = r0.A00()
            java.lang.Long r0 = r9.A04
            if (r0 != 0) goto L_0x068c
            r6 = 0
        L_0x0666:
            java.util.List r4 = r9.A06
            java.lang.Integer r3 = r9.A01
            java.lang.Long r2 = r9.A03
            X.1Ld r1 = r5.A0J
            X.0t6 r0 = r5.A08
            X.1YK r7 = X.C14740pg.A03(r0, r1, r3, r2, r4)
            java.util.List r4 = r9.A05
            java.lang.Integer r3 = r9.A00
            java.lang.Long r2 = r9.A02
            X.1Ld r1 = r5.A0J
            X.0t6 r0 = r5.A08
            X.1YK r8 = X.C14740pg.A03(r0, r1, r3, r2, r4)
            r10 = 4
            com.facebook.redex.RunnableRunnableShape0S0500000_I0 r4 = new com.facebook.redex.RunnableRunnableShape0S0500000_I0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r5.A37(r4)
            return
        L_0x068c:
            long r11 = r0.longValue()
            X.0pf r0 = r5.A06
            long r13 = r0.A01()
            X.0pf r0 = r5.A06
            long r15 = r0.A03()
            X.1YI r6 = new X.1YI
            r10 = r6
            r10.<init>(r11, r13, r15)
            goto L_0x0666
        L_0x06a3:
            java.lang.Object r0 = r5.A00
            X.0zU r0 = (X.C20090zU) r0
            r0.A00()
            return
        L_0x06ab:
            java.lang.Object r0 = r5.A00
            X.1qU r0 = (X.C38251qU) r0
            r0.AXq()
            return
        L_0x06b3:
            java.lang.Object r2 = r5.A00
            X.11e r2 = (X.C206811e) r2
            r2.A05()
            monitor-enter(r2)
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x06c9 }
            r0.clear()     // Catch:{ all -> 0x06c9 }
            X.11c r1 = r2.A00     // Catch:{ all -> 0x06c9 }
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x06c9 }
            r1.AaZ(r0)     // Catch:{ all -> 0x06c9 }
            monitor-exit(r2)     // Catch:{ all -> 0x06c9 }
            return
        L_0x06c9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x06c9 }
            throw r0
        L_0x06cc:
            java.lang.Object r0 = r5.A00
            X.11e r0 = (X.C206811e) r0
            r0.A05()
            return
        L_0x06d4:
            java.lang.Object r0 = r5.A00
            X.1PA r0 = (X.AnonymousClass1PA) r0
            r0.A01()
            return
        L_0x06dc:
            java.lang.Object r1 = r5.A00
            X.1wh r1 = (X.C41811wh) r1
            r0 = 0
            r1.A04 = r0
            X.1wk r0 = r1.A09()
            r0.A05()
            X.1Zf r0 = r1.A0V
            r0.A01()
            r1.A0G()
            return
        L_0x06f3:
            java.lang.Object r2 = r5.A00
            X.1wh r2 = (X.C41811wh) r2
            r1 = 0
            r0 = 1
            r2.A0M(r1, r0)
            return
        L_0x06fd:
            java.lang.Object r1 = r5.A00
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r1 = (com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment) r1
            r0 = 0
            r1.A0X = r0
            return
        L_0x0705:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = (com.obwhatsapp.status.playback.fragment.StatusPlaybackBaseFragment) r0
            X.2B0 r3 = r0.A03
            java.lang.String r0 = "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()"
            X.AnonymousClass00B.A07(r3, r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 125(0x7d, double:6.2E-322)
            r2.setDuration(r0)
            com.obwhatsapp.status.playback.widget.AudioVolumeView r1 = r3.A0D
            r1.startAnimation(r2)
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0728:
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.status.playback.StatusReplyActivity r0 = (com.obwhatsapp.status.playback.StatusReplyActivity) r0
            r0.A3E()
            return
        L_0x0730:
            X.0t3 r7 = r3.A0A     // Catch:{ Exception -> 0x0767 }
            X.0pd r8 = r3.A0B     // Catch:{ Exception -> 0x0767 }
            com.obwhatsapp.audioRecording.AudioRecordFactory r5 = r3.A08     // Catch:{ Exception -> 0x0767 }
            com.obwhatsapp.audioRecording.OpusRecorderFactory r6 = r3.A09     // Catch:{ Exception -> 0x0767 }
            java.lang.String r10 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x0767 }
            X.1w3 r9 = new X.1w3     // Catch:{ Exception -> 0x0767 }
            r9.<init>(r3)     // Catch:{ Exception -> 0x0767 }
            X.1cz r4 = new X.1cz     // Catch:{ Exception -> 0x0767 }
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0767 }
            r3.A04 = r4     // Catch:{ Exception -> 0x0767 }
            com.whatsapp.util.OpusRecorder r0 = r4.A06     // Catch:{ Exception -> 0x0767 }
            r0.prepare()     // Catch:{ Exception -> 0x0767 }
            X.1cz r1 = r3.A04     // Catch:{ Exception -> 0x0767 }
            com.whatsapp.util.OpusRecorder r0 = r1.A06     // Catch:{ Exception -> 0x0767 }
            r0.start()     // Catch:{ Exception -> 0x0767 }
            android.media.AudioRecord r2 = r1.A04     // Catch:{ Exception -> 0x0767 }
            int r1 = r2.getState()     // Catch:{ Exception -> 0x0767 }
            r0 = 1
            if (r1 != r0) goto L_0x0760
            r2.startRecording()     // Catch:{ Exception -> 0x0767 }
        L_0x0760:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0767 }
            r3.A02 = r0     // Catch:{ Exception -> 0x0767 }
            return
        L_0x0767:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 1
            r3.A01(r0)
            android.os.Handler r2 = r3.A06
            r1 = 36
            com.facebook.redex.RunnableRunnableShape15S0100000_I0_14 r0 = new com.facebook.redex.RunnableRunnableShape15S0100000_I0_14
            r0.<init>(r3, r1)
            r2.post(r0)
            return
        L_0x077c:
            java.lang.String r0 = "storage-usage-prefetcher/prefetch chat list"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x0794 }
            X.1Hm r2 = r2.A02     // Catch:{ RuntimeException -> 0x0794 }
            r1 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ RuntimeException -> 0x0794 }
            r0.<init>(r1)     // Catch:{ RuntimeException -> 0x0794 }
            r2.A02(r3, r0)     // Catch:{ RuntimeException -> 0x0794 }
            java.lang.String r0 = "storage-usage-prefetcher/prefetch chat list/completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x0794 }
            return
        L_0x0794:
            r1 = move-exception
            java.lang.String r0 = "StorageUsagePrefetcher/maybePrefetchStorageUsageData/loading-chat-list"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 057 -> 0x079b }
            return
        L_0x079b:
            java.lang.String r0 = "storage-usage-prefetcherprefetch prefetch cancelled"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape15S0100000_I0_14.run():void");
    }
}
