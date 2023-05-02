package com.facebook.redex;

import com.obwhatsapp.status.StatusesFragment;

public class RunnableRunnableShape14S0100000_I0_13 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape14S0100000_I0_13(StatusesFragment statusesFragment, int i2) {
        this.A01 = i2;
        switch (i2) {
            case 43:
            case 44:
                this.A00 = statusesFragment;
                return;
            default:
                this.A00 = statusesFragment;
                return;
        }
    }

    public RunnableRunnableShape14S0100000_I0_13(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:324|325) */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03ce, code lost:
        r2.A09(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x062e, code lost:
        if (r1 == 0) goto L_0x0630;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0651, code lost:
        r3.A00("user_initiated", true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0659, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("DownloadableWallpaperStorage/store : rename failed, from ");
        r1.append(r6.toString());
        r1.append(" to ");
        r1.append(r2.toString());
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x0292 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:140:0x029b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:324:0x07ff */
    /* JADX WARNING: Missing exception handler attribute for start block: B:331:0x082b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:346:0x0854 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:409:0x09b0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:419:0x09bc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x01dd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x01e6 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:326:0x0823=Splitter:B:326:0x0823, B:331:0x082b=Splitter:B:331:0x082b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r1 = r23
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x001d;
                case 1: goto L_0x03f3;
                case 2: goto L_0x0439;
                case 3: goto L_0x047f;
                case 4: goto L_0x0497;
                case 5: goto L_0x04af;
                case 6: goto L_0x050e;
                case 7: goto L_0x0011;
                case 8: goto L_0x0516;
                case 9: goto L_0x051e;
                case 10: goto L_0x0045;
                case 11: goto L_0x0526;
                case 12: goto L_0x007e;
                case 13: goto L_0x053e;
                case 14: goto L_0x009f;
                case 15: goto L_0x0546;
                case 16: goto L_0x00ac;
                case 17: goto L_0x0557;
                case 18: goto L_0x055f;
                case 19: goto L_0x0567;
                case 20: goto L_0x0106;
                case 21: goto L_0x0130;
                case 22: goto L_0x0578;
                case 23: goto L_0x05ab;
                case 24: goto L_0x05ba;
                case 25: goto L_0x05c2;
                case 26: goto L_0x05ca;
                case 27: goto L_0x060c;
                case 28: goto L_0x0637;
                case 29: goto L_0x064b;
                case 30: goto L_0x0172;
                case 31: goto L_0x065a;
                case 32: goto L_0x0662;
                case 33: goto L_0x03ab;
                case 34: goto L_0x0684;
                case 35: goto L_0x0684;
                case 36: goto L_0x06dd;
                case 37: goto L_0x0007;
                case 38: goto L_0x0007;
                case 39: goto L_0x0745;
                case 40: goto L_0x03d2;
                case 41: goto L_0x0752;
                case 42: goto L_0x0868;
                case 43: goto L_0x0882;
                case 44: goto L_0x0895;
                case 45: goto L_0x089d;
                case 46: goto L_0x08aa;
                case 47: goto L_0x08b2;
                case 48: goto L_0x08da;
                case 49: goto L_0x08e2;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.settings.SettingsUserProxyViewModel r1 = (com.obwhatsapp.settings.SettingsUserProxyViewModel) r1
            X.0tK r0 = r1.A08
            r0.A03(r1)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r1.A00
            X.0pN r0 = (X.C14550pN) r0
            X.0pt r2 = r0.A05
            r1 = 2131888450(0x7f120942, float:1.9411536E38)
            r0 = 0
            goto L_0x03ce
        L_0x001d:
            java.lang.Object r2 = r1.A00
            X.2Et r2 = (X.C46532Et) r2
            X.0rz r0 = r2.A05
            int r1 = r0.A0B()
            r0 = 4
            r2.A08(r1, r0)
            r2.A07(r0)
            java.lang.String r0 = "DirectTransferBackgroundTaskViewModel/removeAllListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Handler r1 = r2.A00
            java.lang.Runnable r0 = r2.A0C
            r1.removeCallbacks(r0)
            X.2Eu r0 = r2.A09
            X.2Ew r1 = r0.A00
            if (r1 == 0) goto L_0x0010
            r0 = 1
            r1.A06(r0)
            return
        L_0x0045:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.scroller.RecyclerFastScroller r2 = (com.obwhatsapp.scroller.RecyclerFastScroller) r2
            android.view.View r0 = r2.A03
            boolean r0 = r0.isPressed()
            if (r0 != 0) goto L_0x0010
            android.view.View r0 = r2.A03
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0010
            r4 = 1
            r5 = 0
            boolean r0 = r2.A0C
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0063
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0063:
            r6 = 1
            r8 = 1
            r9 = 0
            r10 = 1
            r11 = 0
            android.view.animation.TranslateAnimation r3 = new android.view.animation.TranslateAnimation
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 200(0xc8, double:9.9E-322)
            r3.setDuration(r0)
            android.view.View r0 = r2.A03
            r0.startAnimation(r3)
            android.view.View r1 = r2.A03
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x007e:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.search.SearchFragment r0 = (com.obwhatsapp.search.SearchFragment) r0
            com.obwhatsapp.search.SearchViewModel r2 = r0.A1L
            if (r2 == 0) goto L_0x0010
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.027 r0 = r2.A0H
            java.lang.Object r0 = r0.A01()
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0010
            X.027 r0 = r2.A0H
            r0.A09(r1)
            return
        L_0x009f:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.search.SearchFragment r0 = (com.obwhatsapp.search.SearchFragment) r0
            com.obwhatsapp.search.SearchViewModel r1 = r0.A1L
            if (r1 == 0) goto L_0x0010
            r0 = 5
            r1.A0Q(r0)
            return
        L_0x00ac:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.search.SearchViewModel r4 = (com.obwhatsapp.search.SearchViewModel) r4
            X.2UX r9 = r4.A0A()
            java.lang.Runnable r0 = r4.A0b
            if (r1 != r0) goto L_0x0010
            long r7 = r4.A00
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00de
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r7
            java.lang.String r1 = "SearchViewModel/firstResult: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0w4 r1 = r4.A1B
            r0 = 5
            r1.A00(r0, r2)
            r4.A00 = r5
        L_0x00de:
            X.026 r0 = r4.A0E
            r0.A09(r9)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0j
            r3 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r3, r2)
            if (r0 == 0) goto L_0x00f6
            X.1cy r1 = r4.A0V
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A09(r0)
        L_0x00f6:
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A1E
            boolean r0 = r0.compareAndSet(r3, r2)
            if (r0 == 0) goto L_0x0010
            X.1cy r1 = r4.A0Y
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09(r0)
            return
        L_0x0106:
            java.lang.Object r3 = r1.A00
            X.2Rh r3 = (X.C49142Rh) r3
            com.obwhatsapp.search.views.itemviews.AudioPlayerView r2 = r3.A09
            java.lang.Object r0 = r2.getTag()
            if (r0 == 0) goto L_0x0010
            X.1rH r0 = r3.A09
            X.1Vw r1 = r0.A11
            java.lang.Object r0 = r2.getTag()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0010
            X.1rH r0 = r3.A09
            X.1yC r0 = r0.A00
            if (r0 == 0) goto L_0x0010
            java.util.List r0 = r0.A00()
            if (r0 == 0) goto L_0x0010
            r2.A03(r0)
            return
        L_0x0130:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.search.views.itemviews.MessageGifVideoPlayer r2 = (com.obwhatsapp.search.views.itemviews.MessageGifVideoPlayer) r2
            X.1rR r4 = r2.A05
            if (r4 == 0) goto L_0x0010
            X.1lj r3 = new X.1lj
            r3.<init>()
            X.0ta r1 = r4.A02
            if (r1 == 0) goto L_0x0163
            java.io.File r0 = r1.A0F
            if (r0 == 0) goto L_0x0167
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0167
            java.io.File r0 = r1.A0F
            java.lang.String r0 = r0.getAbsolutePath()
        L_0x0151:
            r3.A03 = r0
        L_0x0153:
            java.lang.String r0 = r4.A05
            r3.A04 = r0
            int r0 = r1.A08
            r3.A02 = r0
            int r0 = r1.A06
            r3.A01 = r0
            int r0 = r1.A05
            r3.A00 = r0
        L_0x0163:
            r2.A04 = r3
            goto L_0x08ef
        L_0x0167:
            java.lang.String r0 = r4.A14()
            if (r0 == 0) goto L_0x0153
            java.lang.String r0 = r4.A14()
            goto L_0x0151
        L_0x0172:
            java.lang.Object r6 = r1.A00
            com.obwhatsapp.settings.SettingsPrivacy r6 = (com.obwhatsapp.settings.SettingsPrivacy) r6
            X.19A r8 = r6.A0T
            r10 = 0
            X.1Zf r5 = new X.1Zf
            r5.<init>((boolean) r10)
            java.lang.String r0 = "msgstore/unsendreadreceipts"
            r5.A04(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.0ts r2 = r8.A02
            boolean r0 = r2.A0H()
            if (r0 == 0) goto L_0x0193
            java.lang.String r4 = X.AnonymousClass49T.A00
            goto L_0x0195
        L_0x0193:
            java.lang.String r4 = X.AnonymousClass1WW.A0L
        L_0x0195:
            X.0tq r0 = r8.A07     // Catch:{ IllegalStateException -> 0x01f1, SQLiteDatabaseCorruptException -> 0x01e7, SQLiteFullException -> 0x0935 }
            X.0tf r9 = r0.get()     // Catch:{ IllegalStateException -> 0x01f1, SQLiteDatabaseCorruptException -> 0x01e7, SQLiteFullException -> 0x0935 }
            X.0tg r1 = r9.A02     // Catch:{ all -> 0x01e2 }
            r0 = 0
            android.database.Cursor r13 = r1.A08(r4, r0)     // Catch:{ all -> 0x01e2 }
            if (r13 == 0) goto L_0x01de
        L_0x01a4:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x01d5
            X.0rv r1 = r2.A06(r13)     // Catch:{ all -> 0x01d9 }
            if (r1 != 0) goto L_0x01b6
            java.lang.String r0 = "msgstore/unsendreadreceipts/jid is null!"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x01d9 }
            goto L_0x01a4
        L_0x01b6:
            X.0z0 r0 = r8.A09     // Catch:{ all -> 0x01d9 }
            boolean r0 = r0.A01(r1)     // Catch:{ all -> 0x01d9 }
            if (r0 == 0) goto L_0x01a4
            X.0th r0 = r8.A01     // Catch:{ all -> 0x01d9 }
            X.0tZ r7 = r0.A02(r13, r1, r10)     // Catch:{ all -> 0x01d9 }
            if (r7 == 0) goto L_0x01a4
            long r0 = r7.A0I     // Catch:{ all -> 0x01d9 }
            r11 = 1415214000000(0x1498153e780, double:6.992086189136E-312)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x01a4
            r3.add(r7)     // Catch:{ all -> 0x01d9 }
            goto L_0x01a4
        L_0x01d5:
            r13.close()     // Catch:{ all -> 0x01e2 }
            goto L_0x01de
        L_0x01d9:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x01dd }
        L_0x01dd:
            throw r0     // Catch:{ all -> 0x01e2 }
        L_0x01de:
            r9.close()     // Catch:{ IllegalStateException -> 0x01f1, SQLiteDatabaseCorruptException -> 0x01e7, SQLiteFullException -> 0x0935 }
            goto L_0x01f7
        L_0x01e2:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x01e6 }
        L_0x01e6:
            throw r0     // Catch:{ IllegalStateException -> 0x01f1, SQLiteDatabaseCorruptException -> 0x01e7, SQLiteFullException -> 0x0935 }
        L_0x01e7:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r8.A06
            r0.A02()
            goto L_0x01f7
        L_0x01f1:
            r1 = move-exception
            java.lang.String r0 = "msgstore/unsendreadreceipts/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
        L_0x01f7:
            java.lang.String r0 = "msgstore/unsendreadreceipts "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            int r0 = r3.size()
            r4.append(r0)
            java.lang.String r7 = " | time spent:"
            r4.append(r7)
            long r0 = r5.A01()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Zf r5 = new X.1Zf
            r5.<init>((boolean) r10)
            java.lang.String r0 = "msgstore/unsentstatusreadreceipts"
            r5.A04(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0 = 1
            java.lang.String[] r9 = new java.lang.String[r0]
            X.1kq r12 = X.C34771kq.A00
            long r0 = r2.A02(r12)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2 = 0
            r9[r10] = r0
            X.11G r0 = r8.A08
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x0242
            java.lang.String r1 = X.AnonymousClass49X.A00
            goto L_0x024f
        L_0x0242:
            X.17G r0 = r8.A04
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x024d
            java.lang.String r1 = X.AnonymousClass4Ag.A00
            goto L_0x024f
        L_0x024d:
            java.lang.String r1 = X.AnonymousClass4Ag.A01
        L_0x024f:
            X.0tq r0 = r8.A07     // Catch:{ IllegalStateException -> 0x02a6, SQLiteDatabaseCorruptException -> 0x029c, SQLiteFullException -> 0x093c }
            X.0tf r10 = r0.get()     // Catch:{ IllegalStateException -> 0x02a6, SQLiteDatabaseCorruptException -> 0x029c, SQLiteFullException -> 0x093c }
            X.0tg r0 = r10.A02     // Catch:{ all -> 0x0297 }
            android.database.Cursor r11 = r0.A08(r1, r9)     // Catch:{ all -> 0x0297 }
            if (r11 == 0) goto L_0x0293
        L_0x025d:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x028e }
            if (r0 == 0) goto L_0x028a
            X.0th r0 = r8.A01     // Catch:{ all -> 0x028e }
            X.0tZ r9 = r0.A02(r11, r12, r2)     // Catch:{ all -> 0x028e }
            if (r9 == 0) goto L_0x025d
            long r0 = r9.A0I     // Catch:{ all -> 0x028e }
            r14 = 1415214000000(0x1498153e780, double:6.992086189136E-312)
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x025d
            boolean r0 = r9 instanceof X.AnonymousClass1WU     // Catch:{ all -> 0x028e }
            if (r0 != 0) goto L_0x025d
            X.0z0 r1 = r8.A09     // Catch:{ all -> 0x028e }
            X.0rv r0 = r9.A0B()     // Catch:{ all -> 0x028e }
            boolean r0 = r1.A01(r0)     // Catch:{ all -> 0x028e }
            if (r0 == 0) goto L_0x025d
            r4.add(r9)     // Catch:{ all -> 0x028e }
            goto L_0x025d
        L_0x028a:
            r11.close()     // Catch:{ all -> 0x0297 }
            goto L_0x0293
        L_0x028e:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0292 }
        L_0x0292:
            throw r0     // Catch:{ all -> 0x0297 }
        L_0x0293:
            r10.close()     // Catch:{ IllegalStateException -> 0x02a6, SQLiteDatabaseCorruptException -> 0x029c, SQLiteFullException -> 0x093c }
            goto L_0x02ac
        L_0x0297:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x029b }
        L_0x029b:
            throw r0     // Catch:{ IllegalStateException -> 0x02a6, SQLiteDatabaseCorruptException -> 0x029c, SQLiteFullException -> 0x093c }
        L_0x029c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r8.A06
            r0.A02()
            goto L_0x02ac
        L_0x02a6:
            r1 = move-exception
            java.lang.String r0 = "msgstore/unsentstatusreadreceipts/IllegalStateException "
            com.whatsapp.util.Log.i(r0, r1)
        L_0x02ac:
            java.lang.String r0 = "msgstore/unsentstatusreadreceipts "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            int r0 = r4.size()
            r2.append(r0)
            r2.append(r7)
            long r0 = r5.A01()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3.addAll(r4)
            X.17f r0 = r6.A0a
            r0.A09(r3)
            X.15s r0 = r6.A0Z
            X.0pd r2 = r0.A00
            r1 = 361(0x169, float:5.06E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0010
            X.1Gi r12 = r6.A0R
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            X.0tq r0 = r12.A01
            X.0tf r10 = r0.get()
            X.0tg r2 = r10.A02     // Catch:{ all -> 0x09bd }
            java.lang.String r1 = "SELECT * FROM played_self_receipt ORDER BY message_row_id DESC  LIMIT 4096"
            r0 = 0
            android.database.Cursor r9 = r2.A08(r1, r0)     // Catch:{ all -> 0x09bd }
            java.lang.String r1 = "message_row_id"
            int r8 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x09b6 }
            java.lang.String r1 = "to_jid_row_id"
            int r7 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x09b6 }
            java.lang.String r1 = "participant_jid_row_id"
            int r5 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x09b6 }
            java.lang.String r1 = "message_id"
            int r4 = r9.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x09b6 }
        L_0x0310:
            boolean r1 = r9.moveToNext()     // Catch:{ all -> 0x09b6 }
            if (r1 == 0) goto L_0x0354
            X.14v r13 = r12.A00     // Catch:{ all -> 0x09b6 }
            java.lang.Class<X.0rv> r3 = X.C15830rv.class
            long r1 = r9.getLong(r7)     // Catch:{ all -> 0x09b6 }
            com.whatsapp.jid.Jid r2 = r13.A07(r3, r1)     // Catch:{ all -> 0x09b6 }
            X.0rv r2 = (X.C15830rv) r2     // Catch:{ all -> 0x09b6 }
            boolean r1 = r9.isNull(r5)     // Catch:{ all -> 0x09b6 }
            if (r1 != 0) goto L_0x0334
            long r0 = r9.getLong(r5)     // Catch:{ all -> 0x09b6 }
            com.whatsapp.jid.Jid r0 = r13.A07(r3, r0)     // Catch:{ all -> 0x09b6 }
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ all -> 0x09b6 }
        L_0x0334:
            long r16 = r9.getLong(r8)     // Catch:{ all -> 0x09b6 }
            java.lang.String r15 = r9.getString(r4)     // Catch:{ all -> 0x09b6 }
            r14 = 1
            java.lang.Long[] r13 = new java.lang.Long[r14]     // Catch:{ all -> 0x09b6 }
            java.lang.Long r3 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x09b6 }
            r1 = 0
            r13[r1] = r3     // Catch:{ all -> 0x09b6 }
            java.lang.String[] r3 = new java.lang.String[r14]     // Catch:{ all -> 0x09b6 }
            r3[r1] = r15     // Catch:{ all -> 0x09b6 }
            X.1qz r1 = new X.1qz     // Catch:{ all -> 0x09b6 }
            r1.<init>(r2, r0, r13, r3)     // Catch:{ all -> 0x09b6 }
            r11.add(r1)     // Catch:{ all -> 0x09b6 }
            r0 = 0
            goto L_0x0310
        L_0x0354:
            r9.close()     // Catch:{ all -> 0x09bd }
            r10.close()
            java.util.Set r7 = X.C218615s.A01(r11)
            X.124 r5 = r6.A0b
            java.util.Set r0 = X.C218615s.A01(r7)
            java.util.Iterator r4 = r0.iterator()
        L_0x0368:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0380
            java.lang.Object r3 = r4.next()
            X.1qz r3 = (X.C38561qz) r3
            X.0xb r2 = r5.A00
            r1 = 0
            com.obwhatsapp.jobqueue.job.SendPlayedReceiptJobV2 r0 = new com.obwhatsapp.jobqueue.job.SendPlayedReceiptJobV2
            r0.<init>(r3, r1)
            r2.A00(r0)
            goto L_0x0368
        L_0x0380:
            X.1Gi r6 = r6.A0R
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0010
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Iterator r3 = r7.iterator()
        L_0x0391:
            boolean r0 = r3.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x0943
            java.lang.Object r0 = r3.next()
            X.1qz r0 = (X.C38561qz) r0
            java.lang.Long[] r2 = r0.A02
            int r1 = r2.length
        L_0x03a1:
            if (r5 >= r1) goto L_0x0391
            r0 = r2[r5]
            r4.add(r0)
            int r5 = r5 + 1
            goto L_0x03a1
        L_0x03ab:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.settings.SettingsPrivacy r4 = (com.obwhatsapp.settings.SettingsPrivacy) r4
            X.138 r3 = r4.A0N
            java.util.HashMap r1 = r3.A05
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0010
            r1.clear()
            X.0pt r2 = r3.A01
            r1 = 13
            com.facebook.redex.RunnableRunnableShape2S0100000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape2S0100000_I0_1
            r0.<init>(r3, r1)
            r2.A0K(r0)
            X.0pt r2 = r4.A05
            r1 = 2131888333(0x7f1208cd, float:1.9411298E38)
            r0 = 1
        L_0x03ce:
            r2.A09(r1, r0)
            return
        L_0x03d2:
            java.lang.Object r2 = r1.A00
            X.1v1 r2 = (X.C40991v1) r2
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0010
            X.0ub r1 = r2.A07
            X.1ie r0 = r2.A06
            r1.A02(r0)
            X.11A r1 = r2.A0H
            X.1ig r0 = r2.A0G
            r1.A02(r0)
            X.18R r1 = r2.A0J
            X.1VD r0 = r2.A0I
            r1.A02(r0)
            r0 = 1
            r2.A03 = r0
            return
        L_0x03f3:
            java.lang.Object r7 = r1.A00
            X.1Tk r7 = (X.C27861Tk) r7
            java.lang.Iterable r0 = r7.A01()
            java.util.Iterator r6 = r0.iterator()
        L_0x03ff:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x042f
            java.lang.Object r0 = r6.next()
            X.2FI r0 = (X.AnonymousClass2FI) r0
            int r5 = r7.A00
            int r4 = r7.A01
            X.2Et r3 = r0.A00
            X.027 r2 = r3.A04
            r0 = 2
            int[] r1 = new int[r0]
            r0 = 0
            r1[r0] = r5
            r0 = 1
            r1[r0] = r4
            r2.A09(r1)
            java.lang.String r0 = "DirectTransferBackgroundTaskViewModel/removeAllListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Handler r1 = r3.A00
            java.lang.Runnable r0 = r3.A0C
            r1.removeCallbacks(r0)
            r3.A06()
            goto L_0x03ff
        L_0x042f:
            X.0pt r3 = r7.A03
            java.lang.Runnable r2 = r7.A02
            r0 = 500(0x1f4, double:2.47E-321)
            r3.A0L(r2, r0)
            return
        L_0x0439:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.registration.report.BanReportViewModel r1 = (com.obwhatsapp.registration.report.BanReportViewModel) r1
            X.2FB r0 = r1.A05
            java.lang.String r9 = r1.A00
            X.2FC r3 = r0.A00
            X.0sX r2 = r3.A02
            X.01J r0 = r2.AN9
            java.lang.Object r4 = r0.get()
            X.0ua r4 = (X.C17130ua) r4
            X.01J r0 = r2.AQh
            java.lang.Object r5 = r0.get()
            X.0rz r5 = (X.C15860rz) r5
            X.01J r0 = r2.AQV
            X.01D r8 = X.C17270uo.A00(r0)
            X.01J r0 = r2.APW
            java.lang.Object r7 = r0.get()
            X.0vR r7 = (X.C17660vR) r7
            X.01J r0 = r2.A05
            java.lang.Object r6 = r0.get()
            X.0pd r6 = (X.C14710pd) r6
            X.2FD r0 = r3.A03
            X.01J r10 = r0.A0c
            X.01J r11 = r0.A0A
            X.2FF r3 = new X.2FF
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.2FH r0 = new X.2FH
            r0.<init>(r1)
            r3.Aah(r0)
            return
        L_0x047f:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.registration.report.BanReportViewModel r4 = (com.obwhatsapp.registration.report.BanReportViewModel) r4
            X.13S r3 = r4.A07
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r2 = r0.toString()
            r1 = 0
            com.facebook.redex.IDxECallbackShape458S0100000_2_I1 r0 = new com.facebook.redex.IDxECallbackShape458S0100000_2_I1
            r0.<init>(r4, r1)
            r3.A04(r0, r2)
            return
        L_0x0497:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.report.BusinessActivityReportViewModel r4 = (com.obwhatsapp.report.BusinessActivityReportViewModel) r4
            X.13S r3 = r4.A05
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r2 = r0.toString()
            r1 = 1
            com.facebook.redex.IDxECallbackShape458S0100000_2_I1 r0 = new com.facebook.redex.IDxECallbackShape458S0100000_2_I1
            r0.<init>(r4, r1)
            r3.A04(r0, r2)
            return
        L_0x04af:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.report.BusinessActivityReportViewModel r0 = (com.obwhatsapp.report.BusinessActivityReportViewModel) r0
            X.13S r1 = r0.A05
            X.4QR r2 = new X.4QR
            r2.<init>(r0)
            monitor-enter(r1)
            java.lang.String r0 = "BusinessActivityReportManager/download-report"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x050b }
            X.1lI r0 = r1.A00     // Catch:{ all -> 0x050b }
            if (r0 == 0) goto L_0x04fe
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x050b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x050b }
            if (r0 != 0) goto L_0x04fe
            X.0wM r5 = r1.A04     // Catch:{ all -> 0x050b }
            X.1XK r7 = X.AnonymousClass1XK.A08     // Catch:{ all -> 0x050b }
            X.1lI r0 = r1.A00     // Catch:{ all -> 0x050b }
            java.lang.String r10 = r0.A06     // Catch:{ all -> 0x050b }
            java.lang.String r11 = r0.A05     // Catch:{ all -> 0x050b }
            java.lang.String r12 = r0.A04     // Catch:{ all -> 0x050b }
            java.lang.String r13 = r0.A08     // Catch:{ all -> 0x050b }
            java.lang.String r14 = r0.A03     // Catch:{ all -> 0x050b }
            r8 = 0
            java.lang.String r3 = r0.A07     // Catch:{ all -> 0x050b }
            r0 = 2
            byte[] r16 = android.util.Base64.decode(r3, r0)     // Catch:{ all -> 0x050b }
            X.1lI r0 = r1.A00     // Catch:{ all -> 0x050b }
            long r3 = r0.A02     // Catch:{ all -> 0x050b }
            r17 = 2
            r0 = 1
            r19 = 10
            com.facebook.redex.IDxDListenerShape88S0200000_2_I1 r6 = new com.facebook.redex.IDxDListenerShape88S0200000_2_I1     // Catch:{ all -> 0x050b }
            r6.<init>(r1, r0, r2)     // Catch:{ all -> 0x050b }
            r20 = 0
            r15 = r8
            r18 = 1
            r9 = r8
            r21 = r3
            r5.A06(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x050b }
            goto L_0x0509
        L_0x04fe:
            java.lang.String r0 = "BusinessActivityReportManager/download-report no valid report info"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x050b }
            r2.A00()     // Catch:{ all -> 0x050b }
            r1.A02()     // Catch:{ all -> 0x050b }
        L_0x0509:
            monitor-exit(r1)
            return
        L_0x050b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x050e:
            java.lang.Object r0 = r1.A00
            X.12x r0 = (X.C211312x) r0
            r0.A04()
            return
        L_0x0516:
            java.lang.Object r0 = r1.A00
            X.0xf r0 = (X.C19040xf) r0
            r0.A0D()
            return
        L_0x051e:
            java.lang.Object r0 = r1.A00
            X.0xf r0 = (X.C19040xf) r0
            r0.A08()
            return
        L_0x0526:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.search.IteratingPlayer r2 = (com.obwhatsapp.search.IteratingPlayer) r2
            r2.A02()
            int r0 = r2.A00
            int r1 = r0 + 1
            int r0 = r2.A02
            if (r1 <= r0) goto L_0x0537
            int r1 = r2.A01
        L_0x0537:
            r2.A03(r1)
            r2.A00()
            return
        L_0x053e:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.search.SearchFragment r0 = (com.obwhatsapp.search.SearchFragment) r0
            com.obwhatsapp.search.SearchFragment.A03(r0)
            return
        L_0x0546:
            java.lang.Object r2 = r1.A00
            X.2B6 r2 = (X.AnonymousClass2B6) r2
            X.17F r1 = r2.A0H
            X.1xi r0 = r2.A0I
            r1.A0M(r0)
            X.1xi r0 = r2.A0J
            r1.A0M(r0)
            return
        L_0x0557:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.search.views.TokenizedSearchInput r0 = (com.obwhatsapp.search.views.TokenizedSearchInput) r0
            r0.A0A()
            return
        L_0x055f:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.search.views.TokenizedSearchInput r0 = (com.obwhatsapp.search.views.TokenizedSearchInput) r0
            com.obwhatsapp.search.views.TokenizedSearchInput.A05(r0)
            return
        L_0x0567:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.search.views.TokenizedSearchInput r3 = (com.obwhatsapp.search.views.TokenizedSearchInput) r3
            com.obwhatsapp.text.FinalBackspaceAwareEntry r2 = r3.A0U
            r1 = 18
            com.facebook.redex.RunnableRunnableShape14S0100000_I0_13 r0 = new com.facebook.redex.RunnableRunnableShape14S0100000_I0_13
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.post(r0)
            return
        L_0x0578:
            java.lang.Object r4 = r1.A00
            X.116 r4 = (X.AnonymousClass116) r4
            monitor-enter(r4)
            java.util.Set r0 = r4.A02     // Catch:{ all -> 0x05a8 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x05a8 }
        L_0x0583:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x05a8 }
            if (r0 == 0) goto L_0x05a6
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x05a8 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x05a8 }
            java.util.Map r1 = r4.A01     // Catch:{ all -> 0x05a8 }
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x05a8 }
            X.1Vi r0 = (X.C28291Vi) r0     // Catch:{ all -> 0x05a8 }
            if (r0 == 0) goto L_0x0583
            boolean r0 = r0.A02()     // Catch:{ all -> 0x05a8 }
            if (r0 == 0) goto L_0x05a2
            r1.remove(r2)     // Catch:{ all -> 0x05a8 }
        L_0x05a2:
            r3.remove()     // Catch:{ all -> 0x05a8 }
            goto L_0x0583
        L_0x05a6:
            monitor-exit(r4)     // Catch:{ all -> 0x05a8 }
            return
        L_0x05a8:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x05a8 }
            throw r0
        L_0x05ab:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.service.RestoreChatConnectionWorker r0 = (com.obwhatsapp.service.RestoreChatConnectionWorker) r0
            X.0H9 r1 = r0.A01
            X.02P r0 = new X.02P
            r0.<init>()
            r1.A09(r0)
            return
        L_0x05ba:
            java.lang.Object r0 = r1.A00
            X.2SS r0 = (X.AnonymousClass2SS) r0
            X.AnonymousClass2SS.A00(r0)
            return
        L_0x05c2:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.settings.SettingsAccount r0 = (com.obwhatsapp.settings.SettingsAccount) r0
            X.0r5 r3 = r0.A00
            goto L_0x0651
        L_0x05ca:
            java.lang.Object r2 = r1.A00
            X.0sb r2 = (X.C16180sb) r2
            X.1jH r0 = r2.A05()
            java.io.File r0 = r0.A01
            r2.A0R(r0)
            X.1jH r0 = r2.A05()
            java.io.File r0 = r0.A00
            r2.A0R(r0)
            X.1jH r0 = r2.A05()
            java.io.File r0 = r0.A0N
            r2.A0R(r0)
            X.1jH r0 = r2.A05()
            java.io.File r0 = r0.A05
            r2.A0R(r0)
            X.1jH r0 = r2.A05()
            java.io.File r0 = r0.A02
            r1 = 0
            X.C16180sb.A04(r0, r1)
            r2.A0R(r0)
            X.1jH r0 = r2.A05()
            java.io.File r0 = r0.A0A
            X.C16180sb.A04(r0, r1)
            r2.A0R(r0)
            return
        L_0x060c:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.settings.SettingsChatHistoryFragment r1 = (com.obwhatsapp.settings.SettingsChatHistoryFragment) r1
            X.2KO r0 = r1.A00
            if (r0 == 0) goto L_0x0617
            r0.Ac1()
        L_0x0617:
            java.lang.String r0 = "msgstore_archive_all_chats"
            androidx.preference.Preference r3 = r1.A92(r0)
            X.0rs r0 = r1.A05
            int r2 = r0.A02()
            X.0rs r0 = r1.A05
            int r1 = r0.A01()
            if (r2 > 0) goto L_0x0630
            r0 = 2131892328(0x7f121868, float:1.9419401E38)
            if (r1 != 0) goto L_0x0633
        L_0x0630:
            r0 = 2131893212(0x7f121bdc, float:1.9421194E38)
        L_0x0633:
            r3.A0A(r0)
            return
        L_0x0637:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.settings.SettingsChatViewModel r0 = (com.obwhatsapp.settings.SettingsChatViewModel) r0
            X.027 r2 = r0.A00
            X.0si r0 = r0.A01
            long r0 = r0.A07()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A09(r0)
            return
        L_0x064b:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.settings.SettingsCompanionLogoutDialog r0 = (com.obwhatsapp.settings.SettingsCompanionLogoutDialog) r0
            X.0r5 r3 = r0.A01
        L_0x0651:
            r2 = 1
            java.lang.String r1 = "user_initiated"
            r0 = 0
            r3.A00(r1, r2, r0)
            return
        L_0x065a:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.settings.SettingsPrivacy r0 = (com.obwhatsapp.settings.SettingsPrivacy) r0
            r0.A38()
            return
        L_0x0662:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.settings.SettingsPrivacy r3 = (com.obwhatsapp.settings.SettingsPrivacy) r3
            r0 = 1
            r3.A0s = r0
            java.util.Set r1 = r3.A0r
            X.01Y r0 = r3.A0O
            java.util.Set r0 = r0.A09()
            r1.addAll(r0)
            r0 = 0
            r3.A0s = r0
            X.0pt r2 = r3.A05
            r1 = 31
            com.facebook.redex.RunnableRunnableShape14S0100000_I0_13 r0 = new com.facebook.redex.RunnableRunnableShape14S0100000_I0_13
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0K(r0)
            return
        L_0x0684:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.settings.SettingsUserProxyActivity r0 = (com.obwhatsapp.settings.SettingsUserProxyActivity) r0
            com.obwhatsapp.settings.SettingsUserProxyViewModel r5 = r0.A06
            r0 = 1
            r5.A02 = r0
            X.0pt r2 = r5.A07
            r1 = 38
            com.facebook.redex.RunnableRunnableShape14S0100000_I0_13 r0 = new com.facebook.redex.RunnableRunnableShape14S0100000_I0_13
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.A0K(r0)
            r2 = 0
            r5.A01 = r2
            X.0rz r4 = r5.A0B
            android.content.SharedPreferences$Editor r1 = r4.A0K()
            java.lang.String r0 = "proxy_ip_address"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
            X.027 r0 = r5.A04
            r0.A09(r2)
            X.1S6 r1 = r5.A0F
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.A01(r0)
            X.4Qu r1 = r5.A0E
            r0 = 0
            r1.A00(r0)
            r5.A05()
            r3 = 0
            r5.A06(r0, r0)
            java.lang.Integer r0 = r5.A00
            int r2 = r0.intValue()
            android.content.SharedPreferences$Editor r1 = r4.A0K()
            java.lang.String r0 = "proxy_connection_status"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r2)
            r0.apply()
            r5.A03 = r3
            return
        L_0x06dd:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.settings.SettingsUserProxyActivity r0 = (com.obwhatsapp.settings.SettingsUserProxyActivity) r0
            com.obwhatsapp.settings.SettingsUserProxyViewModel r4 = r0.A06
            monitor-enter(r4)
            X.1S6 r0 = r4.A0F     // Catch:{ all -> 0x0742 }
            java.util.List r1 = r0.A00()     // Catch:{ all -> 0x0742 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0742 }
            if (r0 != 0) goto L_0x071d
            r0 = 0
            java.lang.Object r2 = r1.get(r0)     // Catch:{ all -> 0x0742 }
            X.1mS r2 = (X.C35761mS) r2     // Catch:{ all -> 0x0742 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0742 }
            r1.<init>()     // Catch:{ all -> 0x0742 }
            java.net.InetAddress r0 = r2.A03     // Catch:{ all -> 0x0742 }
            java.lang.String r0 = r0.getHostAddress()     // Catch:{ all -> 0x0742 }
            r1.append(r0)     // Catch:{ all -> 0x0742 }
            java.lang.String r0 = ":"
            r1.append(r0)     // Catch:{ all -> 0x0742 }
            java.lang.Short r0 = r2.A02     // Catch:{ all -> 0x0742 }
            r1.append(r0)     // Catch:{ all -> 0x0742 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0742 }
            r4.A01 = r0     // Catch:{ all -> 0x0742 }
        L_0x0715:
            X.027 r1 = r4.A04     // Catch:{ all -> 0x0742 }
            java.lang.String r0 = r4.A01     // Catch:{ all -> 0x0742 }
            r1.A09(r0)     // Catch:{ all -> 0x0742 }
            goto L_0x0740
        L_0x071d:
            X.0rz r0 = r4.A0B     // Catch:{ all -> 0x0742 }
            X.01D r3 = r0.A01     // Catch:{ all -> 0x0742 }
            java.lang.Object r0 = r3.get()     // Catch:{ all -> 0x0742 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x0742 }
            java.lang.String r2 = "proxy_ip_address"
            r1 = 0
            java.lang.String r0 = r0.getString(r2, r1)     // Catch:{ all -> 0x0742 }
            if (r0 == 0) goto L_0x0715
            java.lang.Object r0 = r3.get()     // Catch:{ all -> 0x0742 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x0742 }
            java.lang.String r0 = r0.getString(r2, r1)     // Catch:{ all -> 0x0742 }
            r4.A01 = r0     // Catch:{ all -> 0x0742 }
            r4.A07(r0)     // Catch:{ all -> 0x0742 }
            goto L_0x0715
        L_0x0740:
            monitor-exit(r4)
            return
        L_0x0742:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0745:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.settings.SettingsUserProxyViewModel r1 = (com.obwhatsapp.settings.SettingsUserProxyViewModel) r1
            X.0tK r0 = r1.A08
            r0.A03(r1)
            r0.A02(r1)
            return
        L_0x0752:
            java.lang.Object r4 = r1.A00
            X.1Ga r4 = (X.C24461Ga) r4
            X.1GY r7 = r4.A02
            X.4Il r3 = r7.A00()
            if (r3 == 0) goto L_0x076a
            X.027 r2 = r4.A00
            r1 = 2
            X.4Im r0 = new X.4Im
            r0.<init>(r3, r1)
            r2.A09(r0)
            return
        L_0x076a:
            X.0wP r0 = r4.A01
            boolean r0 = r0.A0A()
            X.027 r3 = r4.A00
            if (r0 != 0) goto L_0x077f
            r2 = 3
            r1 = 0
            X.4Im r0 = new X.4Im
            r0.<init>(r1, r2)
            r3.A09(r0)
            return
        L_0x077f:
            r2 = 1
            r1 = 0
            X.4Im r0 = new X.4Im
            r0.<init>(r1, r2)
            r3.A09(r0)
            X.1GZ r5 = r4.A03     // Catch:{ IOException -> 0x0855 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ IOException -> 0x0855 }
            r4.<init>()     // Catch:{ IOException -> 0x0855 }
            java.lang.String r1 = "category"
            java.lang.String r0 = "wallpaper"
            r4.put(r1, r0)     // Catch:{ IOException -> 0x0855 }
            X.0pd r1 = r5.A01     // Catch:{ IOException -> 0x0855 }
            X.13o r0 = r5.A03     // Catch:{ IOException -> 0x0855 }
            r2 = 0
            java.lang.String r1 = X.AnonymousClass20U.A01(r1, r0, r4)     // Catch:{ IOException -> 0x0855 }
            X.0zG r0 = r5.A02     // Catch:{ IOException -> 0x0855 }
            X.1pl r4 = r5.A00(r0, r1)     // Catch:{ IOException -> 0x0855 }
            if (r4 != 0) goto L_0x07b4
            r1 = 4
            X.4Im r0 = new X.4Im     // Catch:{ all -> 0x084e }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x084e }
            r3.A09(r0)     // Catch:{ all -> 0x084e }
            goto L_0x085f
        L_0x07b4:
            r8 = 0
            X.0ua r2 = r7.A00     // Catch:{ IOException -> 0x082c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x082c }
            r0 = 17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x082c }
            java.io.InputStream r0 = r4.A9k(r2, r1, r0)     // Catch:{ IOException -> 0x082c }
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x082c }
            r5.<init>(r0)     // Catch:{ IOException -> 0x082c }
            r0 = 1
            java.io.File r6 = r7.A02(r0)     // Catch:{ all -> 0x0827 }
            boolean r0 = X.AnonymousClass1XI.A0P(r6)     // Catch:{ all -> 0x0827 }
            if (r0 != 0) goto L_0x07db
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Could not prepare temporary cache subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0827 }
            goto L_0x0823
        L_0x07db:
            X.323 r0 = new X.323     // Catch:{ all -> 0x0827 }
            r0.<init>(r6)     // Catch:{ all -> 0x0827 }
            boolean r0 = r0.A00(r5)     // Catch:{ all -> 0x0827 }
            if (r0 == 0) goto L_0x0823
            java.io.File r2 = r7.A02(r8)     // Catch:{ all -> 0x0827 }
            boolean r0 = X.AnonymousClass1XI.A0P(r2)     // Catch:{ all -> 0x0827 }
            if (r0 != 0) goto L_0x07f6
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Could not prepare wallpaper subdirectory"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0827 }
            goto L_0x0823
        L_0x07f6:
            X.0tB r0 = r7.A02     // Catch:{ IOException -> 0x07ff }
            X.AnonymousClass1XI.A0C(r0, r6, r2)     // Catch:{ IOException -> 0x07ff }
            r5.close()     // Catch:{ IOException -> 0x082c }
            goto L_0x083a
        L_0x07ff:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0827 }
            r1.<init>()     // Catch:{ all -> 0x0827 }
            java.lang.String r0 = "DownloadableWallpaperStorage/store : rename failed, from "
            r1.append(r0)     // Catch:{ all -> 0x0827 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0827 }
            r1.append(r0)     // Catch:{ all -> 0x0827 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ all -> 0x0827 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0827 }
            r1.append(r0)     // Catch:{ all -> 0x0827 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0827 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0827 }
        L_0x0823:
            r5.close()     // Catch:{ IOException -> 0x082c }
            goto L_0x0832
        L_0x0827:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x082b }
        L_0x082b:
            throw r0     // Catch:{ IOException -> 0x082c }
        L_0x082c:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperStorage/store/Failed!"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x084e }
        L_0x0832:
            r1 = 5
            r0 = 0
            X.4Im r2 = new X.4Im     // Catch:{ all -> 0x084e }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x084e }
            goto L_0x0847
        L_0x083a:
            X.4Il r1 = r7.A00()     // Catch:{ all -> 0x084e }
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x084e }
            r0 = 2
            X.4Im r2 = new X.4Im     // Catch:{ all -> 0x084e }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x084e }
        L_0x0847:
            r3.A09(r2)     // Catch:{ all -> 0x084e }
            r4.close()     // Catch:{ IOException -> 0x0855 }
            goto L_0x085f
        L_0x084e:
            r0 = move-exception
            if (r4 == 0) goto L_0x0854
            r4.close()     // Catch:{ all -> 0x0854 }
        L_0x0854:
            throw r0     // Catch:{ IOException -> 0x0855 }
        L_0x0855:
            r2 = 4
            r1 = 0
            X.4Im r0 = new X.4Im     // Catch:{ all -> 0x0863 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0863 }
            r3.A09(r0)     // Catch:{ all -> 0x0863 }
        L_0x085f:
            android.net.TrafficStats.clearThreadStatsTag()
            return
        L_0x0863:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0868:
            java.lang.Object r2 = r1.A00
            X.1AB r2 = (X.AnonymousClass1AB) r2
            X.027 r1 = r2.A00
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A09(r0)
            r2.A0F()
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A09(r0)
            return
        L_0x0882:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.status.StatusesFragment r1 = (com.obwhatsapp.status.StatusesFragment) r1
            X.2Ay r0 = r1.A0u
            java.util.List r0 = r0.A02
            r1.A1M(r0)
            X.2Ay r0 = r1.A0u
            java.util.List r0 = r0.A01
            r1.A1M(r0)
            return
        L_0x0895:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.status.StatusesFragment r1 = (com.obwhatsapp.status.StatusesFragment) r1
            r0 = 0
            r1.A0e = r0
            return
        L_0x089d:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.status.StatusesFragment r1 = (com.obwhatsapp.status.StatusesFragment) r1
            X.2Ab r0 = r1.A0i
            r0.notifyDataSetChanged()
            r1.A1J()
            return
        L_0x08aa:
            java.lang.Object r0 = r1.A00
            java.util.Map r0 = (java.util.Map) r0
            r0.clear()
            return
        L_0x08b2:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.status.playback.MessageReplyActivity r2 = (com.obwhatsapp.status.playback.MessageReplyActivity) r2
            X.0rv r0 = r2.A0j
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.of(r0)
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = "status"
            java.lang.String r6 = "whatsapp"
            X.1vW r3 = new X.1vW
            r3.<init>(r4, r5, r6, r7, r9)
            X.1vV r1 = new X.1vV
            r1.<init>(r3)
            X.0z3 r0 = r2.A0X
            r0.A00(r1)
            return
        L_0x08da:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.status.playback.MyStatusesActivity r1 = (com.obwhatsapp.status.playback.MyStatusesActivity) r1
            r0 = 0
            r1.A0b = r0
            return
        L_0x08e2:
            java.lang.Object r1 = r1.A00
            com.obwhatsapp.status.playback.MyStatusesActivity r1 = (com.obwhatsapp.status.playback.MyStatusesActivity) r1
            X.2B4 r0 = r1.A0k
            r0.notifyDataSetChanged()
            r1.A37()
            return
        L_0x08ef:
            android.media.MediaPlayer r0 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            if (r0 != 0) goto L_0x091b
            android.media.MediaPlayer r0 = new android.media.MediaPlayer     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            r0.<init>()     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            r2.A02 = r0     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
        L_0x08fa:
            android.media.MediaPlayer r1 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            r0 = 1
            r1.setLooping(r0)     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            android.media.MediaPlayer r1 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            java.lang.String r0 = r3.A03     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            r1.setDataSource(r0)     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            android.media.MediaPlayer r1 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            android.media.MediaPlayer$OnPreparedListener r0 = r2.A01     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            r1.setOnPreparedListener(r0)     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            android.media.MediaPlayer r1 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            android.media.MediaPlayer$OnErrorListener r0 = r2.A00     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            r1.setOnErrorListener(r0)     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            android.media.MediaPlayer r0 = r2.A02     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            r0.prepareAsync()     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            goto L_0x091f
        L_0x091b:
            r0.reset()     // Catch:{ IOException | IllegalStateException | NullPointerException -> 0x0920 }
            goto L_0x08fa
        L_0x091f:
            return
        L_0x0920:
            r2 = move-exception
            java.lang.String r0 = "MessageGifVideoPlayer/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "prepareMediaPlayer failed to prepare mediaplayer"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return
        L_0x0935:
            r1 = move-exception
            X.0y0 r0 = r8.A05
            r0.A00(r10)
            throw r1
        L_0x093c:
            r1 = move-exception
            X.0y0 r0 = r8.A05
            r0.A00(r2)
            throw r1
        L_0x0943:
            int r0 = r4.size()
            java.lang.String[] r8 = new java.lang.String[r0]
            java.util.Iterator r4 = r4.iterator()
        L_0x094d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0967
            java.lang.Object r0 = r4.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            int r1 = r5 + 1
            java.lang.String r0 = java.lang.Long.toString(r2)
            r8[r5] = r0
            r5 = r1
            goto L_0x094d
        L_0x0967:
            X.0tq r0 = r6.A01
            X.0tf r7 = r0.A02()
            X.1cj r6 = r7.A00()     // Catch:{ all -> 0x09b1 }
            r0 = 975(0x3cf, float:1.366E-42)
            X.1jh r5 = new X.1jh     // Catch:{ all -> 0x09ac }
            r5.<init>(r8, r0)     // Catch:{ all -> 0x09ac }
        L_0x0978:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x09ac }
            if (r0 == 0) goto L_0x09a2
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x09ac }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ all -> 0x09ac }
            X.0tg r3 = r7.A02     // Catch:{ all -> 0x09ac }
            java.lang.String r2 = "played_self_receipt"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x09ac }
            r1.<init>()     // Catch:{ all -> 0x09ac }
            java.lang.String r0 = "message_row_id IN "
            r1.append(r0)     // Catch:{ all -> 0x09ac }
            int r0 = r4.length     // Catch:{ all -> 0x09ac }
            java.lang.String r0 = X.C34111ji.A00(r0)     // Catch:{ all -> 0x09ac }
            r1.append(r0)     // Catch:{ all -> 0x09ac }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x09ac }
            r3.A01(r2, r0, r4)     // Catch:{ all -> 0x09ac }
            goto L_0x0978
        L_0x09a2:
            r6.A00()     // Catch:{ all -> 0x09ac }
            r6.close()     // Catch:{ all -> 0x09b1 }
            r7.close()
            return
        L_0x09ac:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x09b0 }
        L_0x09b0:
            throw r0     // Catch:{ all -> 0x09b1 }
        L_0x09b1:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x09c1 }
            throw r0
        L_0x09b6:
            r0 = move-exception
            if (r9 == 0) goto L_0x09bc
            r9.close()     // Catch:{ all -> 0x09bc }
        L_0x09bc:
            throw r0     // Catch:{ all -> 0x09bd }
        L_0x09bd:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x09c1 }
        L_0x09c1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape14S0100000_I0_13.run():void");
    }
}
