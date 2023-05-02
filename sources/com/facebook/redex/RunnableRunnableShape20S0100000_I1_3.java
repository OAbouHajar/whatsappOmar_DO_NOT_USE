package com.facebook.redex;

public class RunnableRunnableShape20S0100000_I1_3 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape20S0100000_I1_3(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r1.A0B(java.lang.Boolean.TRUE);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x01ae;
                case 1: goto L_0x01ba;
                case 2: goto L_0x02f9;
                case 3: goto L_0x0011;
                case 4: goto L_0x0301;
                case 5: goto L_0x0317;
                case 6: goto L_0x0062;
                case 7: goto L_0x0325;
                case 8: goto L_0x0081;
                case 9: goto L_0x008d;
                case 10: goto L_0x00bc;
                case 11: goto L_0x00ce;
                case 12: goto L_0x033e;
                case 13: goto L_0x0136;
                case 14: goto L_0x0167;
                case 15: goto L_0x018c;
                case 16: goto L_0x0358;
                case 17: goto L_0x0363;
                case 18: goto L_0x036b;
                case 19: goto L_0x0378;
                case 20: goto L_0x01a6;
                case 21: goto L_0x0005;
                case 22: goto L_0x0005;
                case 23: goto L_0x0386;
                case 24: goto L_0x03e7;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaExtensionsMetaDataViewModel r0 = (com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaExtensionsMetaDataViewModel) r0
            X.027 r1 = r0.A00
        L_0x000b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0B(r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r6 = r12.A00
            com.obwhatsapp.status.StatusExpirationLifecycleOwner r6 = (com.obwhatsapp.status.StatusExpirationLifecycleOwner) r6
            X.11G r2 = r6.A02
            X.0t3 r0 = r2.A00
            long r7 = r0.A00()
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = r7 - r0
            X.11I r3 = r2.A03
            java.lang.String r0 = "earliest_status_time"
            r1 = 0
            long r4 = r3.A01(r0, r1)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0010
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
            long r4 = r4 - r7
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0047
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0010
            X.0pt r3 = r6.A00
            java.lang.Runnable r2 = r6.A04
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 + r0
            r3.A0L(r2, r4)
            return
        L_0x0047:
            X.128 r3 = r6.A01
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.A0I
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0010
            X.126 r2 = r3.A04
            r0 = 40
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r1 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7
            r1.<init>(r3, r0)
            r0 = 41
            r2.A01(r1, r0)
            return
        L_0x0062:
            java.lang.Object r0 = r12.A00
            X.2nj r0 = (X.C56482nj) r0
            java.lang.ref.WeakReference r0 = r0.A0D
            java.lang.Object r1 = r0.get()
            X.34y r1 = (X.AnonymousClass34y) r1
            if (r1 == 0) goto L_0x0010
            X.1PA r0 = r1.A0B
            r0.A02(r1)
            r2 = 0
            r1.A02 = r2
            X.0pt r1 = r1.A01
            r0 = 2131888421(0x7f120925, float:1.9411477E38)
            r1.A09(r0, r2)
            return
        L_0x0081:
            java.lang.Object r5 = r12.A00
            X.2nj r5 = (X.C56482nj) r5
            r0 = 0
            r5.A05 = r0
            r5.A02()
            goto L_0x0154
        L_0x008d:
            java.lang.Object r5 = r12.A00
            X.2nj r5 = (X.C56482nj) r5
            X.1bx r0 = r5.A03
            if (r0 == 0) goto L_0x0010
            int r4 = r0.A03()
            int r3 = r5.A00()
            if (r4 <= 0) goto L_0x00aa
            android.os.Handler r2 = r5.A07
            r1 = 1
            com.facebook.redex.RunnableRunnableShape0S0102000_I1 r0 = new com.facebook.redex.RunnableRunnableShape0S0102000_I1
            r0.<init>(r5, r4, r3, r1)
            r2.post(r0)
        L_0x00aa:
            android.os.Handler r3 = r5.A02
            if (r3 == 0) goto L_0x0010
            r0 = 9
            com.facebook.redex.RunnableRunnableShape20S0100000_I1_3 r2 = new com.facebook.redex.RunnableRunnableShape20S0100000_I1_3
            r2.<init>(r5, r0)
            int r0 = r5.A06
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            return
        L_0x00bc:
            java.lang.Object r1 = r12.A00
            X.2nj r1 = (X.C56482nj) r1
            r0 = 1
            r1.A05 = r0
            r1.A02()
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0010
            r1.A01()
            return
        L_0x00ce:
            java.lang.Object r4 = r12.A00
            X.2nj r4 = (X.C56482nj) r4
            r0 = -16
            android.os.Process.setThreadPriority(r0)     // Catch:{ Exception -> 0x00d8 }
            goto L_0x00dc
        L_0x00d8:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x00dc:
            X.1bx r0 = r4.A03
            if (r0 != 0) goto L_0x0103
            X.0tz r3 = r4.A0A     // Catch:{ IOException -> 0x00ff }
            java.io.File r2 = r4.A0C     // Catch:{ IOException -> 0x00ff }
            r1 = 3
            X.0pd r0 = r4.A0B     // Catch:{ IOException -> 0x00ff }
            X.1bx r0 = X.C30211bx.A00(r3, r0, r2, r1)     // Catch:{ IOException -> 0x00ff }
            r4.A03 = r0     // Catch:{ IOException -> 0x00ff }
            r0.A05()     // Catch:{ IOException | IllegalStateException -> 0x00f1 }
            goto L_0x0103
        L_0x00f1:
            r5 = move-exception
            X.0so r3 = r4.A08     // Catch:{ IOException -> 0x00ff }
            java.lang.String r2 = "StatusPlaybackVoice/failed to prepare audio player"
            java.lang.String r1 = r5.toString()     // Catch:{ IOException -> 0x00ff }
            r0 = 1
            r3.AcB(r2, r1, r0)     // Catch:{ IOException -> 0x00ff }
            throw r5     // Catch:{ IOException -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0103:
            X.1bx r0 = r4.A03
            r3 = 0
            if (r0 == 0) goto L_0x0112
            r0.A08()     // Catch:{ IOException -> 0x010c }
            goto L_0x0111
        L_0x010c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            goto L_0x0112
        L_0x0111:
            r3 = 1
        L_0x0112:
            android.os.Handler r2 = r4.A07
            r1 = 9
            com.facebook.redex.RunnableRunnableShape1S0110000_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S0110000_I1
            r0.<init>(r4, r1, r3)
            r2.post(r0)
            if (r3 != 0) goto L_0x0010
            X.1bx r0 = r4.A03
            if (r0 == 0) goto L_0x012f
            r0.A09()
            X.1bx r0 = r4.A03
            r0.A06()
            r0 = 0
            r4.A03 = r0
        L_0x012f:
            r4.quit()
            r4.interrupt()
            return
        L_0x0136:
            java.lang.Object r5 = r12.A00
            X.2nj r5 = (X.C56482nj) r5
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0141
            r5.A01()
        L_0x0141:
            r0 = 0
            r5.A00 = r0
            X.1bx r1 = r5.A03
            if (r1 == 0) goto L_0x0154
            int r0 = r5.A00()     // Catch:{ IOException -> 0x0150 }
            r1.A0A(r0)     // Catch:{ IOException -> 0x0150 }
            goto L_0x0154
        L_0x0150:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0154:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0010
            long r3 = r5.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0010
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.A01 = r0
            return
        L_0x0167:
            java.lang.Object r0 = r12.A00
            X.4Ta r0 = (X.AnonymousClass4Ta) r0
            X.1wh r1 = r0.A00
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0010
            r0 = 0
            r1.A05 = r0
            X.4L6 r3 = r1.A0R
            java.lang.String r0 = "playbackFragment/onPlaybackFinished "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            com.obwhatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = r3.A01
            r1.append(r0)
            X.C13680ns.A1V(r1)
            r2 = 4
            r1 = 6
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r0 = r3.A02
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment.A03(r0, r2, r1)
            return
        L_0x018c:
            java.lang.Object r3 = r12.A00
            com.whatsapp.stickers.store.StickerStoreActivity r3 = (com.whatsapp.stickers.store.StickerStoreActivity) r3
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r1 = r3.A07
            X.3PO r0 = r3.A05
            if (r0 == 0) goto L_0x0010
            java.util.List r0 = r0.A00
            int r2 = r0.indexOf(r1)
            r0 = -1
            if (r2 == r0) goto L_0x0010
            androidx.viewpager.widget.ViewPager r1 = r3.A01
            r0 = 1
            r1.A0F(r2, r0)
            return
        L_0x01a6:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaExtensionsMetaDataViewModel r0 = (com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaExtensionsMetaDataViewModel) r0
            X.027 r1 = r0.A01
            goto L_0x000b
        L_0x01ae:
            java.lang.Object r0 = r12.A00
            com.facebook.redex.IDxSObserverShape275S0100000_2_I0 r0 = (com.facebook.redex.IDxSObserverShape275S0100000_2_I0) r0
            java.lang.Object r0 = r0.A00
            com.obwhatsapp.settings.SettingsPrivacy r0 = (com.obwhatsapp.settings.SettingsPrivacy) r0
            r0.A39()
            return
        L_0x01ba:
            java.lang.Object r9 = r12.A00
            com.obwhatsapp.shops.ShopsProductPreviewFragment r9 = (com.obwhatsapp.shops.ShopsProductPreviewFragment) r9
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.A01
            int r2 = r0.getWidth()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.A01
            int r1 = r0.getHeight()
            android.content.Context r3 = r9.A02()
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = X.C87594Xo.A00(r3, r0)
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            r7 = 2
            int r0 = r0 << 1
            int r2 = r2 - r0
            r6 = 3
            int r2 = r2 / r6
            int r1 = r1 - r0
            int r5 = java.lang.Math.min(r2, r1)
            r4 = 0
            r2 = 0
        L_0x01e6:
            android.view.View r1 = new android.view.View
            r1.<init>(r3)
            r0 = 2131232387(0x7f080683, float:1.8080882E38)
            r1.setBackgroundResource(r0)
            int r0 = X.C004601z.A03()
            r1.setId(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.A01
            r0.addView(r1)
            r8.add(r1)
            int r2 = r2 + 1
            if (r2 >= r6) goto L_0x0205
            goto L_0x01e6
        L_0x0205:
            android.view.View r0 = X.AnonymousClass000.A0N(r8, r4)
            int r11 = r0.getId()
            X.0Wj r3 = new X.0Wj
            r3.<init>()
            X.053 r0 = r3.A03(r11)
            X.0Uh r0 = r0.A02
            r0.A0c = r5
            X.053 r0 = r3.A03(r11)
            X.0Uh r0 = r0.A02
            r0.A0a = r5
            r2 = 2131365345(0x7f0a0de1, float:1.8350553E38)
            java.util.HashMap r10 = r3.A00
            java.lang.Integer r0 = X.C13680ns.A0b(r10, r11)
            java.lang.Object r0 = r10.get(r0)
            X.053 r0 = (X.AnonymousClass053) r0
            r1 = -1
            X.0Uh r0 = r0.A02
            r0.A0m = r2
            r0.A0l = r1
            r0.A08 = r1
            java.lang.Integer r0 = X.C13680ns.A0b(r10, r11)
            java.lang.Object r0 = r10.get(r0)
            X.053 r0 = (X.AnonymousClass053) r0
            X.0Uh r0 = r0.A02
            r0.A0A = r2
            r0.A0B = r1
            r0.A08 = r1
            if (r4 != 0) goto L_0x0295
            java.lang.Integer r0 = X.C13680ns.A0b(r10, r11)
            java.lang.Object r0 = r10.get(r0)
            X.053 r0 = (X.AnonymousClass053) r0
            X.0Uh r0 = r0.A02
            r0.A0j = r2
            r0.A0i = r1
            r0 = 1
            android.view.View r0 = X.AnonymousClass000.A0N(r8, r0)
            int r2 = r0.getId()
            java.lang.Integer r0 = X.C13680ns.A0b(r10, r11)
            java.lang.Object r0 = r10.get(r0)
            X.053 r0 = (X.AnonymousClass053) r0
            X.0Uh r0 = r0.A02
            r0.A0I = r2
            r0.A0H = r1
            r1 = 1
            X.053 r0 = r3.A03(r11)
            X.0Uh r0 = r0.A02
            r0.A0U = r1
        L_0x0280:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r9.A01
            r3.A05(r1)
            r0 = 0
            r1.A0B = r0
            r1.requestLayout()
            int r4 = r4 + 1
            if (r4 < r6) goto L_0x0205
            com.facebook.shimmer.ShimmerFrameLayout r0 = r9.A02
            r0.A01()
            return
        L_0x0295:
            if (r4 != r7) goto L_0x02c4
            r0 = 1
            android.view.View r0 = X.AnonymousClass000.A0N(r8, r0)
            int r2 = r0.getId()
            java.lang.Integer r0 = X.C13680ns.A0b(r10, r11)
            java.lang.Object r0 = r10.get(r0)
            X.053 r0 = (X.AnonymousClass053) r0
            X.0Uh r0 = r0.A02
            r0.A0i = r2
            r0.A0j = r1
            r2 = 2131365345(0x7f0a0de1, float:1.8350553E38)
            java.lang.Integer r0 = X.C13680ns.A0b(r10, r11)
            java.lang.Object r0 = r10.get(r0)
            X.053 r0 = (X.AnonymousClass053) r0
            X.0Uh r0 = r0.A02
            r0.A0H = r2
            r0.A0I = r1
            goto L_0x0280
        L_0x02c4:
            int r0 = r4 + -1
            android.view.View r0 = X.AnonymousClass000.A0N(r8, r0)
            int r2 = r0.getId()
            java.lang.Integer r0 = X.C13680ns.A0b(r10, r11)
            java.lang.Object r0 = r10.get(r0)
            X.053 r0 = (X.AnonymousClass053) r0
            X.0Uh r0 = r0.A02
            r0.A0i = r2
            r0.A0j = r1
            int r0 = r4 + 1
            android.view.View r0 = X.AnonymousClass000.A0N(r8, r0)
            int r2 = r0.getId()
            java.lang.Integer r0 = X.C13680ns.A0b(r10, r11)
            java.lang.Object r0 = r10.get(r0)
            X.053 r0 = (X.AnonymousClass053) r0
            X.0Uh r0 = r0.A02
            r0.A0I = r2
            r0.A0H = r1
            goto L_0x0280
        L_0x02f9:
            java.lang.Object r0 = r12.A00
            com.obwhatsapp.status.StatusExpirationLifecycleOwner r0 = (com.obwhatsapp.status.StatusExpirationLifecycleOwner) r0
            r0.A00()
            return
        L_0x0301:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.status.audienceselector.StatusPrivacyActivity r1 = (com.obwhatsapp.status.audienceselector.StatusPrivacyActivity) r1
            X.11G r0 = r1.A05
            r3 = 0
            r2 = 0
            r0.A0F(r2, r3)
            X.0xb r1 = r1.A04
            com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob r0 = new com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob
            r0.<init>(r2, r3)
            r1.A00(r0)
            return
        L_0x0317:
            java.lang.Object r1 = r12.A00
            X.2nj r1 = (X.C56482nj) r1
            r1.A01()
            r0 = 0
            r1.A04 = r0
            r1.A02()
            return
        L_0x0325:
            java.lang.Object r5 = r12.A00
            X.2nj r5 = (X.C56482nj) r5
            long r3 = r5.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0337
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.A01 = r0
        L_0x0337:
            r0 = 1
            r5.A04 = r0
            r5.A02()
            return
        L_0x033e:
            java.lang.Object r1 = r12.A00
            X.2nj r1 = (X.C56482nj) r1
            X.1bx r0 = r1.A03
            if (r0 == 0) goto L_0x0351
            r0.A09()
            X.1bx r0 = r1.A03
            r0.A06()
            r0 = 0
            r1.A03 = r0
        L_0x0351:
            r1.quit()
            r1.interrupt()
            return
        L_0x0358:
            java.lang.Object r0 = r12.A00
            com.whatsapp.stickers.store.StickerStoreActivity r0 = (com.whatsapp.stickers.store.StickerStoreActivity) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.A02
            r0 = 3
            r1.A0M(r0)
            return
        L_0x0363:
            java.lang.Object r0 = r12.A00
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r0 = (com.whatsapp.stickers.store.StickerStoreMyTabFragment) r0
            r0.A1M()
            return
        L_0x036b:
            java.lang.Object r0 = r12.A00
            com.facebook.redex.RunnableRunnableShape11S0200000_I0_9 r0 = (com.facebook.redex.RunnableRunnableShape11S0200000_I0_9) r0
            java.lang.Object r1 = r0.A01
            com.obwhatsapp.storage.StorageUsageActivity r1 = (com.obwhatsapp.storage.StorageUsageActivity) r1
            r0 = 3
            r1.A36(r0)
            return
        L_0x0378:
            java.lang.Object r2 = r12.A00
            X.3DO r2 = (X.AnonymousClass3DO) r2
            android.widget.TextView r1 = r2.A02
            r0 = 1
            r1.setSelected(r0)
            r0 = 0
            r2.A00 = r0
            return
        L_0x0386:
            java.lang.Object r1 = r12.A00
            com.obwhatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r1 = (com.obwhatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r1
            X.4JB r4 = r1.A03
            if (r4 == 0) goto L_0x03e4
            X.4jA r3 = r1.A04
            if (r3 != 0) goto L_0x0399
            java.lang.String r0 = "fb4aUserEntityForNativeAuth"
        L_0x0394:
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        L_0x0399:
            X.4Fo r0 = new X.4Fo
            r0.<init>(r1)
            X.4Fn r1 = r4.A00
            if (r1 == 0) goto L_0x03e1
            X.1lh r7 = r3.A00
            X.4LD r2 = new X.4LD
            r2.<init>(r4, r3, r0)
            r0 = 1
            X.C18450wi.A0H(r7, r0)
            X.2Zd r0 = r1.A00
            X.2Yk r3 = r0.A00
            X.0sX r1 = r3.A03
            X.0pd r6 = X.C16150sX.A0k(r1)
            X.0ua r4 = X.C16150sX.A05(r1)
            X.0rz r5 = X.C16150sX.A0Y(r1)
            X.01J r0 = r1.AQV
            X.01D r9 = X.C17270uo.A00(r0)
            X.2Rg r0 = r3.A01
            X.01J r10 = r0.A1b
            X.01J r11 = r0.A1c
            X.01J r0 = r1.AAi
            java.lang.Object r8 = r0.get()
            X.168 r8 = (X.AnonymousClass168) r8
            X.3ts r3 = new X.3ts
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.3Fm r0 = new X.3Fm
            r0.<init>(r2)
            r3.Aah(r0)
            return
        L_0x03e1:
            java.lang.String r0 = "nativeAuthTokenExchangeHelper"
            goto L_0x0394
        L_0x03e4:
            java.lang.String r0 = "accountLinkingLoginManager"
            goto L_0x0394
        L_0x03e7:
            java.lang.Object r1 = r12.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            r1.setResult(r0)
            r1.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape20S0100000_I1_3.run():void");
    }
}
