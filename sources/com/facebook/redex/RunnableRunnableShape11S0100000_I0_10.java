package com.facebook.redex;

import com.obwhatsapp.notification.PopupNotification;

public class RunnableRunnableShape11S0100000_I0_10 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape11S0100000_I0_10(PopupNotification popupNotification, int i2) {
        this.A01 = i2;
        if (44 - i2 != 0) {
            this.A00 = popupNotification;
        } else {
            this.A00 = popupNotification;
        }
    }

    public RunnableRunnableShape11S0100000_I0_10(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02b0, code lost:
        if (r2.A07 != false) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02c0, code lost:
        r2.postDelayed(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x056d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        r4.A01.A00(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0574, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0662, code lost:
        if (((android.content.SharedPreferences) r9.get()).getInt("account_sync_blocklist_num_retries", 0) > 0) goto L_0x0664;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x08f8, code lost:
        r1.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x08fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0947, code lost:
        r3.A35(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x094a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x097a, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x097d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x09ab, code lost:
        r2.A09(r1, 1);
        r3.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x09b2, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:238:0x0560 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:243:0x0565 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:257:0x057b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:262:0x0580 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:398:0x08b2 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:262:0x0580=Splitter:B:262:0x0580, B:247:0x0569=Splitter:B:247:0x0569} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r39 = this;
            r3 = r39
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x02c4;
                case 1: goto L_0x02dc;
                case 2: goto L_0x0017;
                case 3: goto L_0x0025;
                case 4: goto L_0x003b;
                case 5: goto L_0x02e4;
                case 6: goto L_0x004b;
                case 7: goto L_0x005d;
                case 8: goto L_0x0073;
                case 9: goto L_0x02ec;
                case 10: goto L_0x02f4;
                case 11: goto L_0x02fc;
                case 12: goto L_0x031f;
                case 13: goto L_0x0327;
                case 14: goto L_0x05a5;
                case 15: goto L_0x00a0;
                case 16: goto L_0x05b5;
                case 17: goto L_0x0670;
                case 18: goto L_0x0118;
                case 19: goto L_0x0681;
                case 20: goto L_0x08d8;
                case 21: goto L_0x013c;
                case 22: goto L_0x08e5;
                case 23: goto L_0x08ed;
                case 24: goto L_0x08f3;
                case 25: goto L_0x08fc;
                case 26: goto L_0x0007;
                case 27: goto L_0x0007;
                case 28: goto L_0x01b9;
                case 29: goto L_0x0904;
                case 30: goto L_0x090e;
                case 31: goto L_0x0918;
                case 32: goto L_0x0920;
                case 33: goto L_0x092f;
                case 34: goto L_0x094b;
                case 35: goto L_0x0953;
                case 36: goto L_0x01e4;
                case 37: goto L_0x0961;
                case 38: goto L_0x096b;
                case 39: goto L_0x0988;
                case 40: goto L_0x0998;
                case 41: goto L_0x09a2;
                case 42: goto L_0x09b3;
                case 43: goto L_0x09c6;
                case 44: goto L_0x020d;
                case 45: goto L_0x0221;
                case 46: goto L_0x028f;
                case 47: goto L_0x02a5;
                case 48: goto L_0x09d8;
                case 49: goto L_0x09e0;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r3.A00
            X.1SV r1 = (X.AnonymousClass1SV) r1
            X.12z r0 = r1.A00
            r0.A00()
            X.0rz r1 = r1.A02
            r0 = 0
            r1.A1S(r0)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r0 = r3.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.00l r0 = r0.A0C()
            if (r0 == 0) goto L_0x0016
            r0.invalidateOptionsMenu()
            return
        L_0x0025:
            java.lang.Object r1 = r3.A00
            com.obwhatsapp.mediaview.MediaViewFragment r1 = (com.obwhatsapp.mediaview.MediaViewFragment) r1
            X.00l r0 = r1.A0C()
            if (r0 == 0) goto L_0x0016
            r0.invalidateOptionsMenu()
            X.10C r0 = r1.A0c
            X.1dR r1 = r0.A00
            r0 = 2
            r1.A0C(r0)
            return
        L_0x003b:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.mediaview.MediaViewFragment r0 = (com.obwhatsapp.mediaview.MediaViewFragment) r0
            X.29C r1 = r0.A1c
            if (r1 == 0) goto L_0x0016
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x0016
            r1.A08()
            return
        L_0x004b:
            java.lang.Object r2 = r3.A00
            com.obwhatsapp.mediaview.PhotoView r2 = (com.obwhatsapp.mediaview.PhotoView) r2
            android.view.View$OnClickListener r0 = r2.A0M
            if (r0 == 0) goto L_0x0016
            android.graphics.PointF r0 = r2.A0E
            float r1 = r0.x
            float r0 = r0.y
            r2.A04(r1, r0)
            return
        L_0x005d:
            java.lang.Object r2 = r3.A00
            X.0y1 r2 = (X.AnonymousClass0y1) r2
        L_0x0061:
            java.lang.ref.ReferenceQueue r0 = r2.A04
            java.lang.ref.Reference r0 = r0.poll()
            X.29e r0 = (X.C455329e) r0
            if (r0 == 0) goto L_0x0016
            java.util.concurrent.ConcurrentHashMap r1 = r2.A05
            java.lang.String r0 = r0.A01
            r1.remove(r0)
            goto L_0x0061
        L_0x0073:
            java.lang.Object r5 = r3.A00
            X.0y1 r5 = (X.AnonymousClass0y1) r5
            boolean r0 = r5.A07
            if (r0 != 0) goto L_0x0016
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            r0 = 100
            android.os.SystemClock.sleep(r0)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.runFinalization()
        L_0x008e:
            java.lang.ref.ReferenceQueue r0 = r5.A04
            java.lang.ref.Reference r0 = r0.poll()
            X.29e r0 = (X.C455329e) r0
            if (r0 == 0) goto L_0x09e8
            java.util.concurrent.ConcurrentHashMap r1 = r5.A05
            java.lang.String r0 = r0.A01
            r1.remove(r0)
            goto L_0x008e
        L_0x00a0:
            java.lang.Object r7 = r3.A00
            X.0yR r7 = (X.C19440yR) r7
            X.0sK r0 = r7.A05
            r0.A0B()
            X.1ZT r0 = r0.A05
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.user
            java.lang.String r6 = X.AnonymousClass293.A00(r0)
            X.0pd r2 = r7.A0T
            r1 = 693(0x2b5, float:9.71E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x00eb
            X.0rz r0 = r7.A0M
            X.01D r0 = r0.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "pref_deprecate_rc"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x0016
            X.124 r2 = r7.A0d
            byte[] r3 = X.C004101u.A0D()
            r1 = 0
        L_0x00da:
            X.0tK r0 = r2.A01
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0016
            X.0ug r2 = r2.A02
            android.os.Message r1 = X.AnonymousClass294.A02(r6, r3, r1)
            r0 = 0
            r2.A09(r1, r0)
            return
        L_0x00eb:
            X.0tz r0 = r7.A0K
            android.content.Context r5 = r0.A00
            java.io.File r2 = r5.getFilesDir()
            java.lang.String r0 = "rc2"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0110
            long r3 = r1.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0110
            byte[] r0 = X.C004101u.A0G(r5, r6)
            if (r0 != 0) goto L_0x0016
        L_0x0110:
            X.124 r2 = r7.A0d
            byte[] r3 = X.C004101u.A0D()
            r1 = 1
            goto L_0x00da
        L_0x0118:
            java.lang.Object r1 = r3.A00
            X.0yR r1 = (X.C19440yR) r1
            X.0tq r0 = r1.A0P
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0016
            X.1H7 r3 = r1.A09
            X.292 r1 = r3.A00
            if (r1 == 0) goto L_0x012c
            r0 = 1
            r1.A06(r0)
        L_0x012c:
            X.292 r2 = new X.292
            r2.<init>(r3)
            r3.A00 = r2
            X.0sq r1 = r3.A0D
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.Ack(r2, r0)
            return
        L_0x013c:
            java.lang.Object r0 = r3.A00
            X.0yR r0 = (X.C19440yR) r0
            X.0yp r4 = r0.A0D
            boolean r0 = r4.A03()
            if (r0 == 0) goto L_0x0016
            X.0t3 r0 = r4.A03
            long r12 = r0.A00()
            X.0rz r0 = r4.A04
            X.01D r9 = r0.A01
            java.lang.Object r2 = r9.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "adv_key_index_list_require_update"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 != 0) goto L_0x01b1
            java.lang.Object r3 = r9.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r2 = "adv_key_index_list_last_failure_time"
            r0 = 0
            long r10 = r3.getLong(r2, r0)
            java.lang.Object r2 = r9.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "adv_key_index_list_update_retry_count"
            r0 = 0
            int r3 = r2.getInt(r1, r0)
            long[] r1 = X.C19680yp.A09
            int r0 = r1.length
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            if (r3 > r0) goto L_0x01b5
            if (r3 <= 0) goto L_0x01b5
            int r0 = r3 + -1
            r5 = r1[r0]
        L_0x018a:
            long r1 = r12 - r10
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0016
            if (r3 > 0) goto L_0x01b1
            java.lang.Object r3 = r9.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r2 = "adv_key_index_list_last_update_time"
            r0 = 0
            long r0 = r3.getLong(r2, r0)
            long r12 = r12 - r0
            X.0pd r2 = r4.A07
            r1 = 477(0x1dd, float:6.68E-43)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            long r1 = (long) r0
            long r1 = r1 * r7
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0016
        L_0x01b1:
            r4.A00()
            return
        L_0x01b5:
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x018a
        L_0x01b9:
            java.lang.Object r8 = r3.A00
            X.1CV r8 = (X.AnonymousClass1CV) r8
            java.util.Map r7 = r8.A02
            int r0 = r7.size()
            if (r0 == 0) goto L_0x0016
            java.util.Collection r0 = r7.values()
            java.util.Iterator r6 = r0.iterator()
            r4 = 0
        L_0x01cf:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0a60
            java.lang.Object r0 = r6.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r0 = 1
            long r2 = r2 - r0
            long r4 = r4 + r2
            goto L_0x01cf
        L_0x01e4:
            java.lang.Object r3 = r3.A00
            X.0pL r3 = (X.C14530pL) r3
            X.0pd r2 = r3.A0C
            r1 = 1374(0x55e, float:1.925E-42)
            X.0tM r0 = X.C16620tM.A02
            int r0 = r2.A03(r0, r1)
            long r5 = (long) r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 * r0
            X.0pf r0 = r3.A06
            long r7 = r0.A02()
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0016
            X.0pt r0 = r3.A05
            r4 = 0
            com.facebook.redex.RunnableRunnableShape0S0100200_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0100200_I0
            r2.<init>(r3, r4, r5, r7)
            r0.A0K(r2)
            return
        L_0x020d:
            java.lang.Object r1 = r3.A00
            com.obwhatsapp.notification.PopupNotification r1 = (com.obwhatsapp.notification.PopupNotification) r1
            android.os.PowerManager$WakeLock r0 = r1.A05
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isHeld()
            if (r0 == 0) goto L_0x0016
            android.os.PowerManager$WakeLock r0 = r1.A05
            r0.release()
            return
        L_0x0221:
            java.lang.Object r2 = r3.A00
            com.obwhatsapp.notification.PopupNotification r2 = (com.obwhatsapp.notification.PopupNotification) r2
            android.hardware.SensorEventListener r1 = r2.A03
            if (r1 == 0) goto L_0x022e
            android.hardware.SensorManager r0 = r2.A04
            r0.unregisterListener(r1)
        L_0x022e:
            r0 = 0
            r2.A03 = r0
            android.hardware.Sensor r0 = r2.A02
            if (r0 == 0) goto L_0x0289
            java.lang.String r0 = "popupnotification/proximity:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            float r0 = r2.A00
            r1.append(r0)
            java.lang.String r0 = " max:"
            r1.append(r0)
            android.hardware.Sensor r0 = r2.A02
            float r0 = r0.getMaximumRange()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            float r1 = r2.A00
            r0 = 1084227584(0x40a00000, float:5.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0268
            android.hardware.Sensor r0 = r2.A02
            float r0 = r0.getMaximumRange()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0016
        L_0x0268:
            java.lang.String r0 = "popupnotification/wakeup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.PowerManager$WakeLock r0 = r2.A05
            if (r0 == 0) goto L_0x027c
            boolean r0 = r0.isHeld()
            if (r0 != 0) goto L_0x027c
            android.os.PowerManager$WakeLock r0 = r2.A05
            r0.acquire()
        L_0x027c:
            android.os.Handler r3 = r2.A1S
            java.lang.Runnable r2 = r2.A1Z
            r3.removeCallbacks(r2)
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.postDelayed(r2, r0)
            return
        L_0x0289:
            java.lang.String r0 = "popupnotification/no proximity sensor"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0268
        L_0x028f:
            java.lang.Object r2 = r3.A00
            X.1W7 r2 = (X.AnonymousClass1W7) r2
            com.obwhatsapp.numberkeyboard.NumberEntryKeyboard r1 = r2.A02
            java.util.Map r0 = r1.A0D
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0016
            r1.invalidate()
            android.os.Handler r2 = r2.A00
            r0 = 16
            goto L_0x02c0
        L_0x02a5:
            java.lang.Object r2 = r3.A00
            X.1VR r2 = (X.AnonymousClass1VR) r2
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x02b2
            boolean r1 = r2.A07
            r0 = 1
            if (r1 == 0) goto L_0x02b3
        L_0x02b2:
            r0 = 0
        L_0x02b3:
            r2.A07 = r0
            r2.invalidate()
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0016
            android.os.Handler r2 = r2.A03
            r0 = 500(0x1f4, double:2.47E-321)
        L_0x02c0:
            r2.postDelayed(r3, r0)
            return
        L_0x02c4:
            java.lang.Object r0 = r3.A00
            X.29h r0 = (X.C455629h) r0
            X.1bp r4 = r0.A00
            r3 = 0
            r4.A00 = r3
            r2 = 0
        L_0x02ce:
            boolean[] r1 = r4.A02
            int r0 = r1.length
            if (r2 >= r0) goto L_0x02d8
            r1[r2] = r3
            int r2 = r2 + 1
            goto L_0x02ce
        L_0x02d8:
            r4.A01()
            return
        L_0x02dc:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.mediaview.MediaViewBaseFragment r0 = (com.obwhatsapp.mediaview.MediaViewBaseFragment) r0
            r0.A1G()
            return
        L_0x02e4:
            java.lang.Object r0 = r3.A00
            android.view.View r0 = (android.view.View) r0
            X.C004601z.A0i(r0, (android.graphics.Rect) null)
            return
        L_0x02ec:
            java.lang.Object r0 = r3.A00
            X.1HJ r0 = (X.AnonymousClass1HJ) r0
            r0.A05()
            return
        L_0x02f4:
            java.lang.Object r0 = r3.A00
            X.1HJ r0 = (X.AnonymousClass1HJ) r0
            r0.A02()
            return
        L_0x02fc:
            java.lang.Object r2 = r3.A00
            X.1HJ r2 = (X.AnonymousClass1HJ) r2
            java.lang.String r0 = "xmpp/client-ping/ping-response"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Handler r0 = r2.A09
            X.AnonymousClass00B.A02(r0)
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0314
            java.lang.String r0 = "xmpp/client-ping/ping-response; ping already timed out, ping response is ignored"
            goto L_0x097a
        L_0x0314:
            r0 = 0
            r2.A0G = r0
            r2.A01()
            r2.A06()
            return
        L_0x031f:
            java.lang.Object r0 = r3.A00
            X.1GP r0 = (X.AnonymousClass1GP) r0
            r0.A04()
            return
        L_0x0327:
            java.lang.Object r5 = r3.A00
            X.1H3 r5 = (X.AnonymousClass1H3) r5
            X.1H1 r4 = r5.A0B
            X.0t3 r0 = r5.A06
            r17 = r0
            X.0pd r0 = r5.A0F
            r25 = r0
            X.0so r0 = r5.A00
            r33 = r0
            X.0sK r0 = r5.A01
            r32 = r0
            X.0tz r0 = r5.A07
            r18 = r0
            X.0t9 r0 = r5.A0G
            r26 = r0
            X.0xb r0 = r5.A02
            r31 = r0
            X.0sG r15 = r5.A04
            X.013 r14 = r5.A08
            X.17g r13 = r5.A0J
            X.0wS r12 = r5.A0H
            X.0t6 r11 = r5.A0A
            X.1GF r10 = r5.A0I
            X.15G r9 = r5.A0D
            X.0tq r8 = r5.A0C
            X.1H2 r7 = r5.A0K
            X.0wH r6 = r5.A05
            X.0uc r2 = r5.A03
            X.173 r1 = r5.A0E
            X.1GG r0 = r5.A09
            X.29Z r3 = new X.29Z
            r16 = r6
            r19 = r14
            r20 = r0
            r21 = r11
            r22 = r8
            r23 = r9
            r24 = r1
            r27 = r12
            r28 = r10
            r29 = r13
            r30 = r7
            r10 = r3
            r11 = r33
            r12 = r32
            r13 = r31
            r14 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2 = 0
            X.0tq r0 = r4.A02     // Catch:{ SQLiteException -> 0x0581 }
            X.0tf r13 = r0.get()     // Catch:{ SQLiteException -> 0x0581 }
            r0.A04()     // Catch:{ all -> 0x057c }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x057c }
            X.0tg r1 = r13.A02     // Catch:{ all -> 0x057c }
            boolean r0 = r0.A0E(r1)     // Catch:{ all -> 0x057c }
            if (r0 == 0) goto L_0x03a4
            java.lang.String r0 = X.AnonymousClass1WW.A0D     // Catch:{ all -> 0x057c }
        L_0x039c:
            r12 = 0
            android.database.Cursor r1 = r1.A08(r0, r12)     // Catch:{ all -> 0x057c }
            if (r1 != 0) goto L_0x03ae
            goto L_0x03a7
        L_0x03a4:
            java.lang.String r0 = X.AnonymousClass1WW.A0E     // Catch:{ all -> 0x057c }
            goto L_0x039c
        L_0x03a7:
            java.lang.String r0 = "futuremsgstore/future/db/cursor is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0575 }
            goto L_0x0569
        L_0x03ae:
            boolean r0 = r1.moveToNext()     // Catch:{ SQLiteDiskIOException -> 0x056d }
            if (r0 == 0) goto L_0x0566
            X.0th r0 = r4.A00     // Catch:{ SQLiteDiskIOException -> 0x056d }
            X.0tZ r11 = r0.A01(r1)     // Catch:{ SQLiteDiskIOException -> 0x056d }
            boolean r0 = r11 instanceof X.C38791rQ     // Catch:{ SQLiteDiskIOException -> 0x056d }
            if (r0 == 0) goto L_0x03d8
            X.0sK r0 = r3.A01     // Catch:{ SQLiteDiskIOException -> 0x056d }
            r38 = r0
            boolean r0 = r38.A0G()     // Catch:{ SQLiteDiskIOException -> 0x056d }
            if (r0 != 0) goto L_0x03d8
            r8 = r11
            X.1rQ r8 = (X.C38791rQ) r8     // Catch:{ SQLiteDiskIOException -> 0x056d }
            byte[] r7 = r8.A11()     // Catch:{ SQLiteDiskIOException -> 0x056d }
            int r6 = r8.A01     // Catch:{ SQLiteDiskIOException -> 0x056d }
            if (r7 == 0) goto L_0x03d8
            if (r6 == 0) goto L_0x03db
            r0 = 2
            if (r6 == r0) goto L_0x03db
        L_0x03d8:
            int r2 = r2 + 1
            goto L_0x03ae
        L_0x03db:
            X.1iD r0 = X.C33211iD.A0U(r7)     // Catch:{ 1bD -> 0x0554 }
            X.1iD r0 = X.C454929a.A00(r0)     // Catch:{ 1bD -> 0x0554 }
            X.0pd r10 = r3.A0E     // Catch:{ SQLiteDiskIOException -> 0x056d }
            X.0wH r9 = r3.A05     // Catch:{ SQLiteDiskIOException -> 0x056d }
            boolean r6 = X.C41061vA.A0E(r9, r10, r0)     // Catch:{ SQLiteDiskIOException -> 0x056d }
            if (r6 != 0) goto L_0x03d8
            java.util.List r14 = X.C41061vA.A09(r0)     // Catch:{ SQLiteDiskIOException -> 0x056d }
            X.0so r7 = r3.A00     // Catch:{ SQLiteDiskIOException -> 0x056d }
            boolean r6 = X.C41061vA.A0D(r7, r10, r0, r14)     // Catch:{ SQLiteDiskIOException -> 0x056d }
            if (r6 != 0) goto L_0x040b
            java.lang.String r6 = "future-proof-message-handler/futureproof/invalidmessage:messageTypes="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SQLiteDiskIOException -> 0x056d }
            r0.<init>(r6)     // Catch:{ SQLiteDiskIOException -> 0x056d }
            r0.append(r14)     // Catch:{ SQLiteDiskIOException -> 0x056d }
            java.lang.String r0 = r0.toString()     // Catch:{ SQLiteDiskIOException -> 0x056d }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ SQLiteDiskIOException -> 0x056d }
            goto L_0x03d8
        L_0x040b:
            boolean r6 = r0.A0e()     // Catch:{ SQLiteDiskIOException -> 0x056d }
            if (r6 == 0) goto L_0x047a
            X.0t3 r6 = r3.A06     // Catch:{ SQLiteDiskIOException -> 0x056d }
            long r16 = r6.A00()     // Catch:{ SQLiteDiskIOException -> 0x056d }
            X.1Vw r9 = r8.A11     // Catch:{ Exception -> 0x054c }
            java.lang.String r7 = r9.toString()     // Catch:{ Exception -> 0x054c }
            boolean r6 = r0.A0e()     // Catch:{ Exception -> 0x054c }
            if (r6 == 0) goto L_0x046f
            X.29b r6 = r0.A0M     // Catch:{ Exception -> 0x054c }
            if (r6 != 0) goto L_0x0429
            X.29b r6 = X.C455029b.A0A     // Catch:{ Exception -> 0x054c }
        L_0x0429:
            X.C41061vA.A0C(r6, r7)     // Catch:{ Exception -> 0x054c }
            X.013 r6 = r3.A08     // Catch:{ Exception -> 0x054c }
            r30 = r6
            X.17g r15 = r3.A0I     // Catch:{ Exception -> 0x054c }
            java.lang.String r14 = r9.A01     // Catch:{ Exception -> 0x054c }
            X.0rv r11 = r9.A00     // Catch:{ Exception -> 0x054c }
            X.AnonymousClass00B.A06(r11)     // Catch:{ Exception -> 0x054c }
            X.0rv r18 = r8.A0B()     // Catch:{ Exception -> 0x054c }
            long r9 = r8.A0I     // Catch:{ Exception -> 0x054c }
            r28 = 86400000(0x5265c00, double:4.2687272E-316)
            long r28 = r28 + r16
            r6 = 0
            java.lang.Long r21 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x054c }
            r24 = 0
            long r6 = r8.A13     // Catch:{ Exception -> 0x054c }
            java.lang.Long r22 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x054c }
            int r7 = r8.A04     // Catch:{ Exception -> 0x054c }
            com.obwhatsapp.jobqueue.job.RehydrateHsmJob r6 = new com.obwhatsapp.jobqueue.job.RehydrateHsmJob     // Catch:{ Exception -> 0x054c }
            r19 = r0
            r20 = r15
            r23 = r14
            r25 = r7
            r26 = r9
            r16 = r30
            r17 = r11
            r15 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)     // Catch:{ Exception -> 0x054c }
            X.0xb r0 = r3.A02     // Catch:{ SQLiteDiskIOException -> 0x056d }
            r0.A00(r6)     // Catch:{ SQLiteDiskIOException -> 0x056d }
            goto L_0x03d8
        L_0x046f:
            r0 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x054c }
            X.23S r0 = new X.23S     // Catch:{ Exception -> 0x054c }
            r0.<init>(r6)     // Catch:{ Exception -> 0x054c }
            throw r0     // Catch:{ Exception -> 0x054c }
        L_0x047a:
            X.0tz r6 = r3.A07     // Catch:{ 23S -> 0x0548 }
            r19 = r6
            X.0sG r6 = r3.A04     // Catch:{ 23S -> 0x0548 }
            r37 = r6
            X.013 r6 = r3.A08     // Catch:{ 23S -> 0x0548 }
            r20 = r6
            X.1GF r6 = r3.A0H     // Catch:{ 23S -> 0x0548 }
            r26 = r6
            X.0uc r6 = r3.A03     // Catch:{ 23S -> 0x0548 }
            r36 = r6
            X.17g r6 = r3.A0I     // Catch:{ 23S -> 0x0548 }
            r30 = r6
            X.0wS r6 = r3.A0G     // Catch:{ 23S -> 0x0548 }
            r25 = r6
            X.173 r6 = r3.A0D     // Catch:{ 23S -> 0x0548 }
            r17 = r6
            X.1GG r6 = r3.A09     // Catch:{ 23S -> 0x0548 }
            r16 = r6
            X.1Vw r14 = r8.A11     // Catch:{ 23S -> 0x0548 }
            X.1Vw r6 = new X.1Vw     // Catch:{ 23S -> 0x0548 }
            r6.<init>(r14)     // Catch:{ 23S -> 0x0548 }
            long r14 = r8.A0I     // Catch:{ 23S -> 0x0548 }
            r8 = 0
            r33 = 1
            X.21S r27 = X.C41061vA.A01(r10, r0)     // Catch:{ 23S -> 0x0548 }
            r34 = 0
            r35 = 0
            r18 = r9
            r21 = r16
            r22 = r17
            r23 = r10
            r24 = r12
            r28 = r0
            r29 = r6
            r31 = r14
            r14 = r7
            r15 = r38
            r16 = r36
            r17 = r37
            X.0tZ r10 = X.C41061vA.A05(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35)     // Catch:{ 23S -> 0x0548 }
            boolean r0 = r10 instanceof X.C38971ri     // Catch:{ SQLiteDiskIOException -> 0x056d }
            if (r0 == 0) goto L_0x04dc
            X.0t6 r6 = r3.A0A     // Catch:{ SQLiteDiskIOException -> 0x056d }
            java.util.List r0 = java.util.Collections.singletonList(r11)     // Catch:{ SQLiteDiskIOException -> 0x056d }
            r6.A0m(r0, r8)     // Catch:{ SQLiteDiskIOException -> 0x056d }
            goto L_0x03d8
        L_0x04dc:
            byte[] r6 = r11.A1F     // Catch:{ SQLiteDiskIOException -> 0x056d }
            r0 = 0
            if (r6 == 0) goto L_0x04e2
            r0 = 1
        L_0x04e2:
            r7 = 12
            if (r0 == 0) goto L_0x04e9
            r10.A1F = r6     // Catch:{ SQLiteDiskIOException -> 0x056d }
            goto L_0x04f6
        L_0x04e9:
            boolean r0 = X.AnonymousClass1H2.A01(r11)     // Catch:{ SQLiteDiskIOException -> 0x056d }
            if (r0 == 0) goto L_0x04f6
            X.0t9 r6 = r3.A0F     // Catch:{ SQLiteDiskIOException -> 0x056d }
            java.lang.String r0 = "future-proof-message-handler/process"
            X.AnonymousClass1H2.A00(r6, r0, r7)     // Catch:{ SQLiteDiskIOException -> 0x056d }
        L_0x04f6:
            X.1H2 r0 = r3.A0J     // Catch:{ 23S -> 0x04fc }
            r0.A03(r10, r7)     // Catch:{ 23S -> 0x04fc }
            goto L_0x0502
        L_0x04fc:
            r6 = move-exception
            java.lang.String r0 = "future-proof-message-handler/futureproof/invalidMessageSecret:"
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ SQLiteDiskIOException -> 0x056d }
        L_0x0502:
            r10.A0d(r11)     // Catch:{ SQLiteDiskIOException -> 0x056d }
            boolean r0 = r10 instanceof X.C38541qx     // Catch:{ SQLiteDiskIOException -> 0x056d }
            if (r0 == 0) goto L_0x0540
            X.0tq r0 = r3.A0B     // Catch:{ SQLiteDiskIOException -> 0x056d }
            X.0tf r9 = r0.A02()     // Catch:{ SQLiteDiskIOException -> 0x056d }
            X.1cj r7 = r9.A00()     // Catch:{ all -> 0x0561 }
            r0 = 17
            r10.A0W(r0)     // Catch:{ all -> 0x055c }
            X.15G r0 = r3.A0C     // Catch:{ all -> 0x055c }
            X.1qx r10 = (X.C38541qx) r10     // Catch:{ all -> 0x055c }
            int r6 = r0.A01(r10, r8)     // Catch:{ all -> 0x055c }
            boolean r0 = X.AnonymousClass23W.A01(r6)     // Catch:{ all -> 0x055c }
            if (r0 != 0) goto L_0x052c
            r0 = 5
            if (r6 == r0) goto L_0x052c
            r0 = 7
            if (r6 != r0) goto L_0x0535
        L_0x052c:
            X.0t6 r6 = r3.A0A     // Catch:{ all -> 0x055c }
            java.util.List r0 = java.util.Collections.singletonList(r11)     // Catch:{ all -> 0x055c }
            r6.A0m(r0, r8)     // Catch:{ all -> 0x055c }
        L_0x0535:
            r7.A00()     // Catch:{ all -> 0x055c }
            r7.close()     // Catch:{ all -> 0x0561 }
            r9.close()     // Catch:{ SQLiteDiskIOException -> 0x056d }
            goto L_0x03d8
        L_0x0540:
            X.0t6 r6 = r3.A0A     // Catch:{ SQLiteDiskIOException -> 0x056d }
            r0 = 6
            r6.A0e(r10, r0)     // Catch:{ SQLiteDiskIOException -> 0x056d }
            goto L_0x03d8
        L_0x0548:
            r6 = move-exception
            java.lang.String r0 = "future-proof-message-handler/futureproof/badMessage:"
            goto L_0x054f
        L_0x054c:
            r6 = move-exception
            java.lang.String r0 = "future-proof-message-handler/futureproof/badHsm:"
        L_0x054f:
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ SQLiteDiskIOException -> 0x056d }
            goto L_0x03d8
        L_0x0554:
            r6 = move-exception
            java.lang.String r0 = "future-proof-message-handler/futureproof/invalidproto/"
            com.whatsapp.util.Log.w(r0, r6)     // Catch:{ SQLiteDiskIOException -> 0x056d }
            goto L_0x03d8
        L_0x055c:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0560 }
        L_0x0560:
            throw r0     // Catch:{ all -> 0x0561 }
        L_0x0561:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0565 }
        L_0x0565:
            throw r0     // Catch:{ SQLiteDiskIOException -> 0x056d }
        L_0x0566:
            r1.close()     // Catch:{ all -> 0x057c }
        L_0x0569:
            r13.close()     // Catch:{ SQLiteException -> 0x0581 }
            goto L_0x0587
        L_0x056d:
            r6 = move-exception
            X.0y0 r3 = r4.A01     // Catch:{ all -> 0x0575 }
            r0 = 1
            r3.A00(r0)     // Catch:{ all -> 0x0575 }
            throw r6     // Catch:{ all -> 0x0575 }
        L_0x0575:
            r0 = move-exception
            if (r1 == 0) goto L_0x057b
            r1.close()     // Catch:{ all -> 0x057b }
        L_0x057b:
            throw r0     // Catch:{ all -> 0x057c }
        L_0x057c:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0580 }
        L_0x0580:
            throw r0     // Catch:{ SQLiteException -> 0x0581 }
        L_0x0581:
            r1 = move-exception
            java.lang.String r0 = "futuremsgstore/future/db/unavailable"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0587:
            java.lang.String r1 = "futuremsgstore/future/size:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.01D r0 = r5.A0M
            java.lang.Object r1 = r0.get()
            X.0rz r1 = (X.C15860rz) r1
            r0 = 0
            r1.A1H(r0)
            return
        L_0x05a5:
            java.lang.Object r0 = r3.A00
            X.135 r0 = (X.AnonymousClass135) r0
            r3 = 0
            X.0sq r2 = r0.A0B
            java.lang.Runnable r1 = r0.A0C
            java.lang.String r0 = "ToSGatingRepository/requestRefresh"
            r2.Ad4(r1, r0, r3)
            return
        L_0x05b5:
            java.lang.Object r9 = r3.A00
            X.0yR r9 = (X.C19440yR) r9
            X.0tq r0 = r9.A0P
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0606
            X.0tz r0 = r9.A0K
            android.content.Context r0 = r0.A00
            boolean r0 = X.C40691uX.A0E(r0)
            if (r0 == 0) goto L_0x0606
            X.0sK r0 = r9.A05
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0606
            r0 = 16
            byte[] r5 = X.C004101u.A0E(r0)
            byte[] r4 = X.C40691uX.A0G(r5)
            if (r4 == 0) goto L_0x0606
            X.0so r3 = r9.A02
            X.C40691uX.A0C(r3, r4)
            int r2 = r5.length
            if (r2 == r0) goto L_0x05f9
            java.lang.String r1 = ""
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1 = 1
            java.lang.String r0 = "crypto-iq-incorrect-account-salt-size"
            r3.AcB(r0, r2, r1)
        L_0x05f9:
            X.0xH r2 = r9.A0B
            r1 = 1
            r0 = 0
            r2.A01(r0, r4, r5, r1)
            java.util.Arrays.toString(r5)
            java.util.Arrays.toString(r4)
        L_0x0606:
            X.134 r8 = r9.A0m
            X.29X r7 = new X.29X
            r7.<init>()
            r6 = 1
            r7.A00 = r6
            X.0rz r2 = r9.A0M
            X.01D r9 = r2.A01
            java.lang.Object r1 = r9.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "account_sync_status_num_retries"
            r5 = 0
            int r1 = r1.getInt(r0, r5)
            r0 = 0
            if (r1 <= 0) goto L_0x0625
            r0 = 1
        L_0x0625:
            r7.A05 = r0
            java.lang.Object r1 = r9.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "account_sync_picture_num_retries"
            int r1 = r1.getInt(r0, r5)
            r0 = 0
            if (r1 <= 0) goto L_0x0637
            r0 = 1
        L_0x0637:
            r7.A03 = r0
            java.lang.Object r1 = r9.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "account_sync_privacy_num_retries"
            int r1 = r1.getInt(r0, r5)
            r0 = 0
            if (r1 <= 0) goto L_0x0649
            r0 = 1
        L_0x0649:
            r7.A04 = r0
            long r3 = r2.A0G()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0664
            java.lang.Object r1 = r9.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "account_sync_blocklist_num_retries"
            int r1 = r1.getInt(r0, r5)
            r0 = 0
            if (r1 <= 0) goto L_0x0665
        L_0x0664:
            r0 = 1
        L_0x0665:
            r7.A01 = r0
            X.29Y r0 = new X.29Y
            r0.<init>(r7)
            r8.A00(r0, r5, r6, r6)
            return
        L_0x0670:
            java.lang.Object r0 = r3.A00
            X.0yR r0 = (X.C19440yR) r0
            X.0t6 r1 = r0.A0O
            r0 = 0
            r1.A0Q(r0, r0)
            r1.A0K()
            r1.A0L()
            return
        L_0x0681:
            java.lang.Object r3 = r3.A00
            X.0yR r3 = (X.C19440yR) r3
            X.0tq r0 = r3.A0P
            r0.A04()
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x08c4
            X.16r r2 = r3.A0Q
            X.1HB r1 = r3.A0l
            X.0tq r6 = r2.A04
            r6.A04()
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x06e2
            X.1Vo r1 = r2.A09
            java.lang.String r0 = "processFutureTransactions: msg store not ready"
            r1.A05(r0)
        L_0x06a2:
            X.0rz r6 = r3.A0M
            X.01D r0 = r6.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r5 = "verification_level_consolidation_notification"
            r0 = 0
            boolean r0 = r1.getBoolean(r5, r0)
            if (r0 != 0) goto L_0x08c4
            X.0rs r0 = r3.A0G
            java.util.ArrayList r0 = r0.A04()
            java.util.Iterator r4 = r0.iterator()
        L_0x06c0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x08b8
            java.lang.Object r2 = r4.next()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.0uP r0 = r3.A0F
            X.1Vq r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x06c0
            X.0t6 r1 = r3.A0O
            X.1Vr r0 = X.C28341Vr.A00(r0)
            X.1Vs r0 = r0.A01()
            r1.A0R(r2, r0)
            goto L_0x06c0
        L_0x06e2:
            java.lang.String r17 = "( type=? )"
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]
            r0 = 5
            java.lang.String r4 = java.lang.Integer.toString(r0)
            r0 = 0
            r5[r0] = r4
            java.lang.String r20 = "init_timestamp DESC"
            r2.A0i()
            X.0tf r13 = r6.get()
            X.0tg r14 = r13.A02     // Catch:{ all -> 0x08b3 }
            java.lang.String r15 = r2.A0P()     // Catch:{ all -> 0x08b3 }
            boolean r4 = r2.A0i()     // Catch:{ all -> 0x08b3 }
            if (r4 == 0) goto L_0x0714
            java.lang.String[] r16 = X.C221116r.A0B     // Catch:{ all -> 0x08b3 }
        L_0x0706:
            r9 = 0
            r21 = r9
            r19 = r9
            r18 = r5
            android.database.Cursor r11 = r14.A09(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x08b3 }
            if (r11 == 0) goto L_0x08a9
            goto L_0x0717
        L_0x0714:
            java.lang.String[] r16 = X.C221116r.A0A     // Catch:{ all -> 0x08b3 }
            goto L_0x0706
        L_0x0717:
            r8 = 0
        L_0x0718:
            boolean r4 = r11.moveToNext()     // Catch:{ all -> 0x08ae }
            if (r4 == 0) goto L_0x0888
            X.1Vt r10 = r2.A0I(r11)     // Catch:{ 1W4 -> 0x087e }
            boolean r4 = r10.A0G()     // Catch:{ 1W4 -> 0x087e }
            r29 = 0
            if (r4 == 0) goto L_0x087a
            byte[] r6 = r10.A0R     // Catch:{ 1W4 -> 0x087e }
            if (r6 == 0) goto L_0x087a
            X.1Vu r5 = r1.A07     // Catch:{ 1W9 | IOException -> 0x0865 }
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ 1W9 | IOException -> 0x0865 }
            r4.<init>(r6)     // Catch:{ 1W9 | IOException -> 0x0865 }
            X.1Vv r7 = r5.A04(r4)     // Catch:{ 1W9 | IOException -> 0x0865 }
            if (r7 == 0) goto L_0x087a
            java.lang.String r5 = r7.A00     // Catch:{ 1W4 -> 0x087e }
            java.lang.String r4 = "pay"
            boolean r4 = r5.equals(r4)     // Catch:{ 1W4 -> 0x087e }
            if (r4 == 0) goto L_0x080f
            X.0rv r12 = r10.A0C     // Catch:{ 1W4 -> 0x087e }
            boolean r5 = r10.A0Q     // Catch:{ 1W4 -> 0x087e }
            java.lang.String r4 = r10.A0L     // Catch:{ 1W4 -> 0x087e }
            X.1Vw r6 = new X.1Vw     // Catch:{ 1W4 -> 0x087e }
            r6.<init>(r12, r4, r5)     // Catch:{ 1W4 -> 0x087e }
            X.0rv r4 = r6.A00     // Catch:{ 1W4 -> 0x087e }
            if (r4 == 0) goto L_0x087a
            java.lang.String r4 = r6.A01     // Catch:{ 1W4 -> 0x087e }
            if (r4 == 0) goto L_0x087a
            X.0t6 r10 = r1.A01     // Catch:{ 1W4 -> 0x087e }
            X.0th r4 = r10.A0K     // Catch:{ 1W4 -> 0x087e }
            X.0tZ r4 = r4.A03(r6)     // Catch:{ 1W4 -> 0x087e }
            if (r4 == 0) goto L_0x087a
            java.lang.String r5 = "type"
            java.lang.String r12 = r7.A0N(r5, r9)     // Catch:{ 1W4 -> 0x087e }
            X.0rv r17 = r4.A0B()     // Catch:{ 1W4 -> 0x087e }
            if (r12 == 0) goto L_0x0802
            java.lang.String r5 = "request"
            boolean r5 = r12.equals(r5)     // Catch:{ 1W4 -> 0x087e }
            if (r5 == 0) goto L_0x0802
            X.1Vt r14 = r4.A0L     // Catch:{ 1W4 -> 0x087e }
            if (r14 == 0) goto L_0x087a
            X.1Vw r5 = r4.A11     // Catch:{ 1W4 -> 0x087e }
            X.0rv r5 = r5.A00     // Catch:{ 1W4 -> 0x087e }
            r32 = r5
            boolean r5 = X.C16030sJ.A0L(r32)     // Catch:{ 1W4 -> 0x087e }
            if (r5 == 0) goto L_0x0791
            X.0sK r12 = r1.A00     // Catch:{ 1W4 -> 0x087e }
            com.whatsapp.jid.UserJid r5 = r14.A0E     // Catch:{ 1W4 -> 0x087e }
            boolean r5 = r12.A0I(r5)     // Catch:{ 1W4 -> 0x087e }
            if (r5 == 0) goto L_0x087a
        L_0x0791:
            X.1Vt r5 = r4.A0L     // Catch:{ 1W4 -> 0x087e }
            java.lang.String r14 = r5.A0G     // Catch:{ 1W4 -> 0x087e }
            java.lang.String r12 = r5.A0I     // Catch:{ 1W4 -> 0x087e }
            X.0wS r5 = r1.A06     // Catch:{ 1W4 -> 0x087e }
            X.1Vx r5 = r5.A02(r14)     // Catch:{ 1W4 -> 0x087e }
            if (r5 == 0) goto L_0x07ff
            X.19r r16 = r5.AEp(r12)     // Catch:{ 1W4 -> 0x087e }
        L_0x07a3:
            X.AnonymousClass00B.A06(r16)     // Catch:{ 1W4 -> 0x087e }
            X.1Vt r5 = r4.A0L     // Catch:{ 1W4 -> 0x087e }
            com.whatsapp.jid.UserJid r12 = r5.A0E     // Catch:{ 1W4 -> 0x087e }
            r20 = r12
            com.whatsapp.jid.UserJid r12 = r5.A0D     // Catch:{ 1W4 -> 0x087e }
            r21 = r12
            java.lang.String r12 = r5.A0I     // Catch:{ 1W4 -> 0x087e }
            r18 = r12
            X.1Vy r12 = r5.A08     // Catch:{ 1W4 -> 0x087e }
            r19 = r12
            X.1Vz r12 = r5.A07     // Catch:{ 1W4 -> 0x087e }
            long r14 = r4.A0I     // Catch:{ 1W4 -> 0x087e }
            java.lang.String r5 = r5.A0G     // Catch:{ 1W4 -> 0x087e }
            int r28 = r16.AG1()     // Catch:{ 1W4 -> 0x087e }
            int r27 = X.AnonymousClass1W0.A00(r5)     // Catch:{ 1W4 -> 0x087e }
            r25 = 20
            r26 = 12
            r22 = r18
            r23 = r9
            r24 = r5
            r30 = r14
            r18 = r12
            X.1Vt r12 = X.AnonymousClass1W1.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ 1W4 -> 0x087e }
            X.1Vt r5 = r4.A0L     // Catch:{ 1W4 -> 0x087e }
            int r5 = r5.A02     // Catch:{ 1W4 -> 0x087e }
            if (r5 == 0) goto L_0x07e0
            r12.A02 = r5     // Catch:{ 1W4 -> 0x087e }
        L_0x07e0:
            com.whatsapp.jid.UserJid r15 = com.whatsapp.jid.UserJid.of(r32)     // Catch:{ 1W4 -> 0x087e }
            com.whatsapp.jid.UserJid r16 = com.whatsapp.jid.UserJid.of(r17)     // Catch:{ 1W4 -> 0x087e }
            long r4 = r4.A0I     // Catch:{ 1W4 -> 0x087e }
            r14 = r1
            r17 = r7
            r18 = r4
            X.1Vt r5 = r14.A00(r15, r16, r17, r18)     // Catch:{ 1W4 -> 0x087e }
            java.lang.String r4 = r5.A0K     // Catch:{ 1W4 -> 0x087e }
            r12.A0K = r4     // Catch:{ 1W4 -> 0x087e }
            X.1W2 r4 = r5.A0A     // Catch:{ 1W4 -> 0x087e }
            r12.A0A = r4     // Catch:{ 1W4 -> 0x087e }
        L_0x07fb:
            r10.A0O(r12, r6)     // Catch:{ 1W4 -> 0x087e }
            goto L_0x0878
        L_0x07ff:
            r16 = 0
            goto L_0x07a3
        L_0x0802:
            com.whatsapp.jid.UserJid r12 = com.whatsapp.jid.UserJid.of(r17)     // Catch:{ 1W4 -> 0x087e }
            long r4 = r4.A0I     // Catch:{ 1W4 -> 0x087e }
            X.1Vt r12 = r1.A01(r12, r7, r4)     // Catch:{ 1W4 -> 0x087e }
            if (r12 == 0) goto L_0x087a
            goto L_0x07fb
        L_0x080f:
            java.lang.String r4 = "transaction"
            boolean r4 = r5.equals(r4)     // Catch:{ 1W4 -> 0x087e }
            if (r4 == 0) goto L_0x087a
            X.1Vt r6 = r1.A02(r9, r7)     // Catch:{ 1W4 -> 0x087e }
            if (r6 == 0) goto L_0x087a
            X.0rv r4 = r6.A0C     // Catch:{ 1W4 -> 0x087e }
            if (r4 != 0) goto L_0x0855
            java.lang.String r4 = r6.A0L     // Catch:{ 1W4 -> 0x087e }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 1W4 -> 0x087e }
            if (r4 != 0) goto L_0x0855
            X.0rv r12 = r6.A0C     // Catch:{ 1W4 -> 0x087e }
            boolean r5 = r6.A0Q     // Catch:{ 1W4 -> 0x087e }
            java.lang.String r4 = r6.A0L     // Catch:{ 1W4 -> 0x087e }
            X.1Vw r7 = new X.1Vw     // Catch:{ 1W4 -> 0x087e }
            r7.<init>(r12, r4, r5)     // Catch:{ 1W4 -> 0x087e }
            X.0t6 r5 = r1.A01     // Catch:{ 1W4 -> 0x087e }
            X.0th r4 = r5.A0K     // Catch:{ 1W4 -> 0x087e }
            X.0tZ r12 = r4.A03(r7)     // Catch:{ 1W4 -> 0x087e }
            if (r12 == 0) goto L_0x0855
            X.1Vt r4 = r12.A0L     // Catch:{ 1W4 -> 0x087e }
            if (r4 == 0) goto L_0x0851
            java.lang.String r4 = r4.A0M     // Catch:{ 1W4 -> 0x087e }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 1W4 -> 0x087e }
            if (r4 != 0) goto L_0x0851
            X.1Vt r4 = r12.A0L     // Catch:{ 1W4 -> 0x087e }
            java.lang.String r4 = r4.A0M     // Catch:{ 1W4 -> 0x087e }
            r6.A0M = r4     // Catch:{ 1W4 -> 0x087e }
        L_0x0851:
            r5.A0O(r6, r7)     // Catch:{ 1W4 -> 0x087e }
            goto L_0x0878
        L_0x0855:
            X.0wS r4 = r1.A06     // Catch:{ 1W4 -> 0x087e }
            r4.A06()     // Catch:{ 1W4 -> 0x087e }
            X.16r r5 = r4.A08     // Catch:{ 1W4 -> 0x087e }
            java.lang.String r4 = r6.A0L     // Catch:{ 1W4 -> 0x087e }
            boolean r4 = r5.A0l(r6, r10, r4)     // Catch:{ 1W4 -> 0x087e }
            if (r4 == 0) goto L_0x087a
            goto L_0x0878
        L_0x0865:
            r6 = move-exception
            java.lang.String r5 = "PAY: PaymentsProtoParser deserializeProtocolNode: "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ 1W4 -> 0x087e }
            r4.<init>(r5)     // Catch:{ 1W4 -> 0x087e }
            r4.append(r6)     // Catch:{ 1W4 -> 0x087e }
            java.lang.String r4 = r4.toString()     // Catch:{ 1W4 -> 0x087e }
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ 1W4 -> 0x087e }
            goto L_0x087a
        L_0x0878:
            int r0 = r0 + 1
        L_0x087a:
            int r8 = r8 + 1
            goto L_0x0718
        L_0x087e:
            r6 = move-exception
            X.1Vo r5 = r2.A09     // Catch:{ all -> 0x08ae }
            java.lang.String r4 = "processFutureTransactions/InvalidJidException - Skipped future transaction with invalid JID"
            r5.A0A(r4, r6)     // Catch:{ all -> 0x08ae }
            goto L_0x0718
        L_0x0888:
            X.1Vo r4 = r2.A09     // Catch:{ all -> 0x08ae }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x08ae }
            r2.<init>()     // Catch:{ all -> 0x08ae }
            java.lang.String r1 = "processFutureTransactions processed: "
            r2.append(r1)     // Catch:{ all -> 0x08ae }
            r2.append(r0)     // Catch:{ all -> 0x08ae }
            java.lang.String r0 = " / "
            r2.append(r0)     // Catch:{ all -> 0x08ae }
            r2.append(r8)     // Catch:{ all -> 0x08ae }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x08ae }
            r4.A03(r9, r0)     // Catch:{ all -> 0x08ae }
            r11.close()     // Catch:{ all -> 0x08b3 }
        L_0x08a9:
            r13.close()
            goto L_0x06a2
        L_0x08ae:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x08b2 }
        L_0x08b2:
            throw r0     // Catch:{ all -> 0x08b3 }
        L_0x08b3:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x08b7 }
        L_0x08b7:
            throw r0
        L_0x08b8:
            r1 = 1
            android.content.SharedPreferences$Editor r0 = r6.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r5, r1)
            r0.apply()
        L_0x08c4:
            X.0sm r0 = r3.A0N
            r2 = 0
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "run_on_connect_tasks_for_version_change"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            return
        L_0x08d8:
            java.lang.Object r0 = r3.A00
            X.0yR r0 = (X.C19440yR) r0
            X.0r5 r3 = r0.A0E
            r2 = 0
            r1 = 0
            r0 = 1
            r3.A00(r1, r2, r0)
            return
        L_0x08e5:
            java.lang.Object r0 = r3.A00
            X.1Vn r0 = (X.C28321Vn) r0
            X.C28321Vn.A00(r0)
            return
        L_0x08ed:
            java.lang.Object r1 = r3.A00
            X.1Vl r1 = (X.AnonymousClass1Vl) r1
            r0 = 0
            goto L_0x08f8
        L_0x08f3:
            java.lang.Object r1 = r3.A00
            X.1Vl r1 = (X.AnonymousClass1Vl) r1
            r0 = 1
        L_0x08f8:
            r1.A00(r0)
            return
        L_0x08fc:
            java.lang.Object r0 = r3.A00
            X.0xU r0 = (X.C18930xU) r0
            r0.A0O()
            return
        L_0x0904:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.migration.android.integration.service.GoogleMigrateService r0 = (com.obwhatsapp.migration.android.integration.service.GoogleMigrateService) r0
            X.1NO r0 = r0.A02
            r0.A0A()
            return
        L_0x090e:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.migration.android.integration.service.GoogleMigrateService r0 = (com.obwhatsapp.migration.android.integration.service.GoogleMigrateService) r0
            X.1NO r0 = r0.A02
            r0.A07()
            return
        L_0x0918:
            java.lang.Object r0 = r3.A00
            X.0sr r0 = (X.C16330sr) r0
            r0.A04()
            return
        L_0x0920:
            java.lang.Object r3 = r3.A00
            com.obwhatsapp.migration.export.ui.ExportMigrationActivity r3 = (com.obwhatsapp.migration.export.ui.ExportMigrationActivity) r3
            X.1Vg r2 = r3.A0I
            java.lang.String r1 = r3.A0J
            r0 = 9
            r2.A02(r1, r0)
            r0 = 0
            goto L_0x0947
        L_0x092f:
            java.lang.Object r3 = r3.A00
            com.obwhatsapp.migration.export.ui.ExportMigrationActivity r3 = (com.obwhatsapp.migration.export.ui.ExportMigrationActivity) r3
            X.1Vg r2 = r3.A0I
            java.lang.String r1 = r3.A0J
            r0 = 14
            r2.A00(r1, r0)
            X.1Vg r2 = r3.A0I
            java.lang.String r1 = r3.A0J
            r0 = 22
            r2.A02(r1, r0)
            r0 = 101(0x65, float:1.42E-43)
        L_0x0947:
            r3.A35(r0)
            return
        L_0x094b:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.migration.export.ui.ExportMigrationActivity r0 = (com.obwhatsapp.migration.export.ui.ExportMigrationActivity) r0
            com.facebook.redex.RunnableRunnableShape11S0100000_I0_10.super.onBackPressed()
            return
        L_0x0953:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.migration.export.ui.ExportMigrationActivity r0 = (com.obwhatsapp.migration.export.ui.ExportMigrationActivity) r0
            X.1Vg r2 = r0.A0I
            java.lang.String r1 = r0.A0J
            r0 = 9
            r2.A00(r1, r0)
            return
        L_0x0961:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.migration.export.ui.ExportMigrationDataExportedActivity r0 = (com.obwhatsapp.migration.export.ui.ExportMigrationDataExportedActivity) r0
            X.0sr r0 = r0.A00
            r0.A03()
            return
        L_0x096b:
            java.lang.Object r1 = r3.A00
            X.2S9 r1 = (X.AnonymousClass2S9) r1
            java.lang.String r0 = "fpm/DonorWifiDirectManager/Restarting WiFi Direct since we haven't discovered a peer yet"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x097e
            java.lang.String r0 = "fpm/DonorWifiDirectManager/retryServiceDiscovery skipped, since service is already discovered"
        L_0x097a:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x097e:
            r1.A06()
            r0 = 0
            r1.A03 = r0
            r1.A05()
            return
        L_0x0988:
            java.lang.Object r3 = r3.A00
            X.1DI r3 = (X.AnonymousClass1DI) r3
            X.18R r2 = r3.A07
            r1 = 2
            com.obwhatsapp.group.IDxPObserverShape82S0100000_2_I1 r0 = new com.obwhatsapp.group.IDxPObserverShape82S0100000_2_I1
            r0.<init>(r3, r1)
            r2.A02(r0)
            return
        L_0x0998:
            java.lang.Object r3 = r3.A00
            com.obwhatsapp.notification.AndroidWear r3 = (com.obwhatsapp.notification.AndroidWear) r3
            X.0pt r2 = r3.A00
            r1 = 2131887011(0x7f1203a3, float:1.9408617E38)
            goto L_0x09ab
        L_0x09a2:
            java.lang.Object r3 = r3.A00
            com.obwhatsapp.notification.AndroidWear r3 = (com.obwhatsapp.notification.AndroidWear) r3
            X.0pt r2 = r3.A00
            r1 = 2131892091(0x7f12177b, float:1.941892E38)
        L_0x09ab:
            r0 = 1
            r2.A09(r1, r0)
            r3.A03()
            return
        L_0x09b3:
            java.lang.Object r3 = r3.A00
            com.obwhatsapp.notification.DirectReplyService r3 = (com.obwhatsapp.notification.DirectReplyService) r3
            X.0pt r2 = r3.A00
            r1 = 2131887011(0x7f1203a3, float:1.9408617E38)
            r0 = 1
            r2.A09(r1, r0)
            X.0pj r0 = r3.A07
            r0.A08()
            return
        L_0x09c6:
            java.lang.Object r1 = r3.A00
            X.0yF r1 = (X.C19320yF) r1
            monitor-enter(r1)
            boolean r0 = r1.A02     // Catch:{ all -> 0x09d5 }
            if (r0 != 0) goto L_0x09d3
            r0 = 0
            r1.A00(r0)     // Catch:{ all -> 0x09d5 }
        L_0x09d3:
            monitor-exit(r1)
            return
        L_0x09d5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x09d8:
            java.lang.Object r0 = r3.A00
            X.107 r0 = (X.AnonymousClass107) r0
            r0.A01()
            return
        L_0x09e0:
            java.lang.Object r0 = r3.A00
            X.109 r0 = (X.AnonymousClass109) r0
            r0.A00()
            return
        L_0x09e8:
            long r12 = android.os.SystemClock.elapsedRealtime()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.concurrent.ConcurrentHashMap r10 = r5.A05
            java.util.Set r0 = r10.entrySet()
            java.util.Iterator r11 = r0.iterator()
        L_0x09fb:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0a2f
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r8 = r0.getValue()
            X.29e r8 = (X.C455329e) r8
            java.lang.Object r7 = r8.get()
            java.lang.ref.WeakReference r0 = r8.A02
            java.lang.Object r6 = r0.get()
            long r0 = r8.A00
            long r3 = r12 - r0
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x09fb
            if (r7 == 0) goto L_0x09fb
            if (r6 != 0) goto L_0x09fb
            java.lang.String r0 = r8.A01
            r9.add(r7)
            r10.remove(r0)
            goto L_0x09fb
        L_0x0a2f:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0a5c
            java.util.Iterator r4 = r9.iterator()
        L_0x0a39:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0a5c
            java.lang.Object r1 = r4.next()
            X.00F r0 = r5.A01
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0a39
            X.0so r3 = r5.A00
            java.lang.Class r0 = r1.getClass()
            java.lang.String r2 = r0.getName()
            r1 = 0
            java.lang.String r0 = "leak-detected-v3"
            r3.AcB(r0, r2, r1)
            goto L_0x0a39
        L_0x0a5c:
            r0 = 0
            r5.A06 = r0
            return
        L_0x0a60:
            X.19E r2 = r8.A01
            X.1W6 r1 = new X.1W6
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r1.A00 = r0
            X.0t9 r0 = r2.A06
            r0.A06(r1)
            r7.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape11S0100000_I0_10.run():void");
    }
}
