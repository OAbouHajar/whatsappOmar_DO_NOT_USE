package com.facebook.redex;

import X.AnonymousClass15I;
import X.AnonymousClass1RU;
import X.AnonymousClass1TS;
import X.AnonymousClass20T;
import X.C15830rv;
import X.C16050sL;
import X.C16740tZ;
import X.C16760tb;
import X.C16840tj;
import X.C26061Me;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class RunnableRunnableShape0S0201000_I0 implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public RunnableRunnableShape0S0201000_I0(C16740tZ r2, AnonymousClass1RU r3) {
        this.A03 = 32;
        this.A01 = r3;
        this.A02 = r2;
        this.A00 = 56;
    }

    public RunnableRunnableShape0S0201000_I0(C16760tb r2, C16050sL r3) {
        this.A03 = 6;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = 1;
    }

    public RunnableRunnableShape0S0201000_I0(C16760tb r2, C16740tZ r3, int i2) {
        this.A03 = 23;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = i2;
    }

    public RunnableRunnableShape0S0201000_I0(C16840tj r2, AnonymousClass1TS r3, int i2) {
        this.A03 = i2;
        this.A01 = r3;
        this.A02 = r2;
        this.A00 = 4;
    }

    public RunnableRunnableShape0S0201000_I0(AnonymousClass15I r2, C15830rv r3, int i2, int i3) {
        this.A03 = i3;
        switch (i3) {
            case 12:
            case 13:
                this.A01 = r2;
                this.A02 = r3;
                this.A00 = i2;
                return;
            default:
                this.A01 = r2;
                this.A02 = r3;
                this.A00 = 3;
                return;
        }
    }

    public RunnableRunnableShape0S0201000_I0(C26061Me r2, AnonymousClass20T r3, int i2) {
        this.A03 = 25;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = i2;
    }

    public RunnableRunnableShape0S0201000_I0(View view, BottomSheetBehavior bottomSheetBehavior, int i2, int i3) {
        this.A03 = i3;
        this.A01 = bottomSheetBehavior;
        if (1 - i3 != 0) {
            this.A02 = view;
            this.A00 = i2;
            return;
        }
        this.A02 = view;
        this.A00 = i2;
    }

    public RunnableRunnableShape0S0201000_I0(LinearLayout linearLayout, Runnable runnable) {
        this.A03 = 35;
        this.A01 = linearLayout;
        this.A00 = -1;
        this.A02 = runnable;
    }

    public RunnableRunnableShape0S0201000_I0(Object obj, int i2, Object obj2, int i3) {
        this.A03 = i3;
        this.A01 = obj;
        this.A00 = i2;
        this.A02 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x06cd, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x06d0, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:268:0x07e7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:381:0x0c03 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r27 = this;
            r3 = r27
            int r0 = r3.A03
            switch(r0) {
                case 0: goto L_0x002f;
                case 1: goto L_0x048d;
                case 2: goto L_0x049b;
                case 3: goto L_0x04b7;
                case 4: goto L_0x0049;
                case 5: goto L_0x0064;
                case 6: goto L_0x0139;
                case 7: goto L_0x04c5;
                case 8: goto L_0x04e8;
                case 9: goto L_0x0501;
                case 10: goto L_0x0511;
                case 11: goto L_0x051f;
                case 12: goto L_0x053d;
                case 13: goto L_0x0628;
                case 14: goto L_0x064e;
                case 15: goto L_0x06d1;
                case 16: goto L_0x0156;
                case 17: goto L_0x070d;
                case 18: goto L_0x016e;
                case 19: goto L_0x01cb;
                case 20: goto L_0x071b;
                case 21: goto L_0x072b;
                case 22: goto L_0x07ee;
                case 23: goto L_0x07fc;
                case 24: goto L_0x080b;
                case 25: goto L_0x0827;
                case 26: goto L_0x01e9;
                case 27: goto L_0x0226;
                case 28: goto L_0x083f;
                case 29: goto L_0x024f;
                case 30: goto L_0x084d;
                case 31: goto L_0x02e9;
                case 32: goto L_0x086b;
                case 33: goto L_0x087f;
                case 34: goto L_0x0907;
                case 35: goto L_0x0972;
                case 36: goto L_0x0987;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r3.A01
            X.0yy r1 = (X.C19770yy) r1
            java.lang.Object r6 = r3.A02
            android.content.Context r6 = (android.content.Context) r6
            int r5 = r3.A00
            X.0pt r0 = r1.A00
            X.0pS r0 = r0.A00
            if (r0 != 0) goto L_0x045f
            java.lang.String r0 = "banmanager/startPermanentBanFlow/showLoginFailureNotificationIfNeeded"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yx r4 = r1.A06
            X.0tz r0 = r4.A0M
            android.content.Context r3 = r0.A00
            X.0sq r2 = r4.A0q
            r1 = 16
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
        L_0x002e:
            return
        L_0x002f:
            java.lang.Object r0 = r3.A01
            com.google.android.gms.internal.gtm.zzfn r0 = (com.google.android.gms.internal.gtm.zzfn) r0
            int r2 = r3.A00
            java.lang.Object r1 = r3.A02
            com.google.android.gms.internal.gtm.zzbr r1 = (com.google.android.gms.internal.gtm.zzbr) r1
            android.content.Context r0 = r0.zzc
            com.google.android.gms.internal.gtm.zzfm r0 = (com.google.android.gms.internal.gtm.zzfm) r0
            boolean r0 = r0.callServiceStopSelfResult(r2)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "Local AnalyticsService processed last dispatch request"
            r1.zzO(r0)
            return
        L_0x0049:
            java.lang.Object r0 = r3.A01
            X.0yD r0 = (X.C19300yD) r0
            java.lang.Object r3 = r3.A02
            X.0tZ r3 = (X.C16740tZ) r3
            X.186 r2 = r0.A0N
            long r0 = r3.A13
            X.1uG r1 = r2.A00(r0)
            if (r1 == 0) goto L_0x002e
            java.lang.String r0 = r1.A01
            r3.A0i = r0
            X.1ta r0 = r1.A00
            r3.A0V = r0
            return
        L_0x0064:
            java.lang.Object r7 = r3.A01
            X.0yD r7 = (X.C19300yD) r7
            java.lang.Object r4 = r3.A02
            X.0tZ r4 = (X.C16740tZ) r4
            X.0pd r0 = r7.A0R
            r3 = 508(0x1fc, float:7.12E-43)
            X.0tM r1 = X.C16620tM.A02
            boolean r0 = r0.A0E(r1, r3)
            if (r0 == 0) goto L_0x00a4
            X.1HI r2 = r7.A0E
            X.0pd r0 = r2.A03
            boolean r0 = r0.A0E(r1, r3)
            if (r0 == 0) goto L_0x00a4
            X.1Vw r1 = r4.A11
            X.0rv r0 = r1.A00
            com.whatsapp.jid.UserJid r6 = com.whatsapp.jid.UserJid.of(r0)
            if (r6 == 0) goto L_0x00a4
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = r4.A0k
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = r4.A0j
            if (r0 == 0) goto L_0x00a4
        L_0x0098:
            int r1 = r4.A0C
            r0 = 4
            if (r1 == r0) goto L_0x00ef
            r0 = 5
            if (r1 == r0) goto L_0x00d3
            r0 = 13
            if (r1 == r0) goto L_0x00d3
        L_0x00a4:
            X.1HN r3 = r7.A0X
            X.1Vw r1 = r4.A11
            X.0rv r0 = r1.A00
            com.whatsapp.jid.UserJid r2 = com.whatsapp.jid.UserJid.of(r0)
            if (r2 == 0) goto L_0x002e
            boolean r1 = r1.A02
            int r0 = r4.A0C
            boolean r0 = X.C42881yp.A01(r0)
            if (r1 == 0) goto L_0x002e
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r4.A0e
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r4.A0f
            if (r0 == 0) goto L_0x002e
            X.1Hn r0 = r3.A05
            r0.A01(r2)
            X.1GG r0 = r3.A02
            X.1Hs r0 = r0.A01()
            r0.A00(r2)
            return
        L_0x00d3:
            X.0z3 r0 = r2.A02
            X.1vU r0 = r0.A01
            X.0u3 r1 = r0.A00
            java.lang.String r0 = "entry_point_conversions_for_sending"
            android.content.SharedPreferences r0 = r1.A00(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = r6.getRawString()
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            goto L_0x00a4
        L_0x00ef:
            X.157 r0 = r2.A00
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r8 = r0.iterator()
        L_0x00f9:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r8.next()
            X.2D1 r0 = (X.AnonymousClass2D1) r0
            X.15I r5 = r0.A00
            X.0sK r0 = r5.A01
            boolean r0 = r0.A0I(r6)
            if (r0 != 0) goto L_0x00f9
            X.0z3 r0 = r5.A09
            X.1vU r0 = r0.A01
            X.0u3 r1 = r0.A00
            java.lang.String r0 = "entry_point_conversions_for_sending"
            android.content.SharedPreferences r2 = r1.A00(r0)
            java.lang.String r1 = r6.getRawString()
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)
            if (r0 == 0) goto L_0x00f9
            X.1vV r3 = X.C41251vU.A00(r0)
            if (r3 == 0) goto L_0x00f9
            X.1WA r2 = r5.A0Z
            r1 = 37
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0
            r0.<init>(r5, r6, r3, r1)
            r2.execute(r0)
            goto L_0x00f9
        L_0x0139:
            java.lang.Object r5 = r3.A01
            X.0tb r5 = (X.C16760tb) r5
            java.lang.Object r4 = r3.A02
            X.0sL r4 = (X.C16050sL) r4
            r3 = 1
            X.0uk r0 = r5.A0H
            X.0sL r2 = r0.A02(r4)
            if (r2 == 0) goto L_0x002e
            X.1FI r1 = r5.A0u
            X.0rt r0 = r5.A0b
            int r0 = r0.A02(r4)
            r1.A00(r2, r0, r3)
            return
        L_0x0156:
            java.lang.Object r0 = r3.A01
            X.0xG r0 = (X.C18790xG) r0
            int r2 = r3.A00
            java.lang.Object r1 = r3.A02
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            X.0xF r0 = r0.A01
            java.util.HashMap r0 = r0.A00
            int r0 = r0.size()
            if (r0 != r2) goto L_0x002e
            r1.run()
            return
        L_0x016e:
            java.lang.Object r2 = r3.A01
            X.0t6 r2 = (X.C16460t6) r2
            java.lang.Object r6 = r3.A02
            X.0tZ r6 = (X.C16740tZ) r6
            int r4 = r3.A00
            X.1Vw r3 = r6.A11
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x01a9
            boolean r0 = r6.A1D
            if (r0 != 0) goto L_0x01a9
            long r18 = android.os.SystemClock.uptimeMillis()
            X.0w1 r5 = r2.A06
            r9 = 0
            int r15 = r6.A0A
            r7 = 0
            long r0 = r6.A18
            long r16 = r18 - r0
            long r0 = r6.A1G
            long r18 = r18 - r0
            r8 = 4
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r20 = r18
            r5.A0J(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r22, r23, r24, r25, r26)
        L_0x01a9:
            boolean r0 = r2.A0w(r6, r4)
            if (r0 == 0) goto L_0x002e
            X.11A r0 = r2.A0R
            X.0rv r2 = r3.A00
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x01bb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r1.next()
            X.1ig r0 = (X.C33501ig) r0
            r0.A02(r2)
            goto L_0x01bb
        L_0x01cb:
            java.lang.Object r1 = r3.A01
            X.0t6 r1 = (X.C16460t6) r1
            java.lang.Object r4 = r3.A02
            X.0tZ r4 = (X.C16740tZ) r4
            int r3 = r3.A00
            boolean r0 = r1.A0y(r4, r3)
            if (r0 == 0) goto L_0x002e
            X.17E r0 = r1.A0e
            android.os.Handler r2 = r0.A02
            r1 = 2
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r2, r1, r3, r0, r4)
            r0.sendToTarget()
            return
        L_0x01e9:
            java.lang.Object r4 = r3.A01
            X.0t9 r4 = (X.C16490t9) r4
            java.lang.Object r0 = r3.A02
            X.0t7 r0 = (X.C16470t7) r0
            int r6 = r3.A00
            java.lang.Object r5 = r0.clone()
            X.0t7 r5 = (X.C16470t7) r5
            boolean r0 = r4.A0I()
            if (r0 == 0) goto L_0x002e
            boolean r0 = r4.A0Q
            r8 = 1
            if (r0 == 0) goto L_0x09ad
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x0995
            X.0rz r0 = r4.A0D
            X.01D r0 = r0.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "private_stats_id"
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)
            X.1CI r1 = r4.A0G
            java.util.ArrayList r0 = X.C810346o.A00()
            r1.A06(r2, r0)
            r4.A0O = r8
            goto L_0x0995
        L_0x0226:
            java.lang.Object r4 = r3.A01
            X.0t9 r4 = (X.C16490t9) r4
            java.lang.Object r1 = r3.A02
            X.0t7 r1 = (X.C16470t7) r1
            int r3 = r3.A00
            int r2 = r1.channel
            r0 = 1
            java.lang.Object r1 = r1.clone()
            X.0t7 r1 = (X.C16470t7) r1
            if (r2 != r0) goto L_0x0ab1
            boolean r0 = r4.A0J()
            if (r0 == 0) goto L_0x002e
            X.1a8 r0 = r4.A05
            r0.A03(r1, r3)
            X.1a8 r0 = r4.A05
            r0.A01()
            r4.A03()
            return
        L_0x024f:
            java.lang.Object r0 = r3.A01
            X.13E r0 = (X.AnonymousClass13E) r0
            int r4 = r3.A00
            java.lang.Object r2 = r3.A02
            java.util.List r2 = (java.util.List) r2
            X.13D r0 = r0.A00
            java.util.concurrent.ConcurrentHashMap r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r1.get(r0)
            X.1DL r5 = (X.AnonymousClass1DL) r5
            if (r5 == 0) goto L_0x002e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r10 = r2.iterator()
        L_0x0272:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02d4
            java.lang.Object r1 = r10.next()
            X.2Dw r1 = (X.C46352Dw) r1
            int r9 = r1.A00
            if (r9 == 0) goto L_0x02ac
            r0 = 7
            if (r9 == r0) goto L_0x02ac
            X.1DK r8 = r5.A00
            int r7 = r1.A01
            java.util.concurrent.ConcurrentHashMap r1 = r8.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object r6 = r1.get(r0)
            X.4Nr r6 = (X.C85244Nr) r6
            if (r6 == 0) goto L_0x0ab6
            r6.A00 = r9
            r0 = 30
            r2 = 1000(0x3e8, double:4.94E-321)
            if (r9 != r0) goto L_0x02a8
            X.0t3 r0 = r8.A01
            long r0 = r0.A00()
            long r0 = r0 / r2
            r6.A02 = r0
        L_0x02a8:
            r8.A01(r6, r7)
            goto L_0x0272
        L_0x02ac:
            int r3 = r1.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r4.add(r0)
            X.1DK r2 = r5.A00
            r12 = 0
            r15 = 0
            r0 = 100000000(0x5f5e100, float:2.3122341E-35)
            int r14 = r3 / r0
            X.0t3 r0 = r2.A01
            long r16 = r0.A00()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 / r0
            r18 = -1
            X.4Nr r11 = new X.4Nr
            r13 = r12
            r11.<init>(r12, r13, r14, r15, r16, r18)
            r2.A01(r11, r3)
            goto L_0x0272
        L_0x02d4:
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x002e
            X.1DJ r6 = r5.A01
            r9 = 2
            int r0 = r4.size()
            if (r0 > 0) goto L_0x0abe
            java.lang.String r0 = "DisclosureCmsDownloader/fetchDisclosures no disclosure ids to create uri"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x02e9:
            java.lang.Object r1 = r3.A01
            X.1RU r1 = (X.AnonymousClass1RU) r1
            java.lang.Object r5 = r3.A02
            X.0tZ r5 = (X.C16740tZ) r5
            int r0 = r3.A00
            byte r6 = (byte) r0
            r0 = 56
            if (r6 == r0) goto L_0x02fc
            r0 = 68
            if (r6 != r0) goto L_0x002e
        L_0x02fc:
            X.15G r4 = r1.A04
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r0 = 56
            if (r6 != r0) goto L_0x0419
            X.1Q1 r12 = r4.A0F
            X.23T r0 = r5.A0W
            if (r0 == 0) goto L_0x0433
            java.util.Collection r13 = r0.A02()
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.Iterator r2 = r13.iterator()
        L_0x031a:
            boolean r0 = r2.hasNext()
            r9 = 17
            if (r0 == 0) goto L_0x033c
            java.lang.Object r1 = r2.next()
            X.0tZ r1 = (X.C16740tZ) r1
            X.1Vw r0 = r1.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x031a
            int r0 = r1.A0C
            if (r0 == r9) goto L_0x031a
            long r0 = r1.A13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.add(r0)
            goto L_0x031a
        L_0x033c:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x03f8
            int r0 = r7.size()
            java.lang.String[] r2 = new java.lang.String[r0]
            java.util.Iterator r11 = r7.iterator()
            r10 = 0
        L_0x034d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0367
            java.lang.Object r0 = r11.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r7 = r0.longValue()
            int r1 = r10 + 1
            java.lang.String r0 = java.lang.Long.toString(r7)
            r2[r10] = r0
            r10 = r1
            goto L_0x034d
        L_0x0367:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            X.0tq r0 = r12.A04
            X.0tf r10 = r0.get()
            r0 = 975(0x3cf, float:1.366E-42)
            X.1jh r11 = new X.1jh     // Catch:{ all -> 0x0c04 }
            r11.<init>(r2, r0)     // Catch:{ all -> 0x0c04 }
        L_0x0379:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0c04 }
            if (r0 == 0) goto L_0x03d5
            java.lang.Object r2 = r11.next()     // Catch:{ all -> 0x0c04 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x0c04 }
            int r12 = r2.length     // Catch:{ all -> 0x0c04 }
            java.lang.String r0 = "SELECT _id FROM message_add_on WHERE "
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c04 }
            r7.<init>(r0)     // Catch:{ all -> 0x0c04 }
            java.lang.String r0 = "status = "
            r7.append(r0)     // Catch:{ all -> 0x0c04 }
            r7.append(r9)     // Catch:{ all -> 0x0c04 }
            java.lang.String r1 = " AND "
            r7.append(r1)     // Catch:{ all -> 0x0c04 }
            java.lang.String r0 = "from_me = 0"
            r7.append(r0)     // Catch:{ all -> 0x0c04 }
            r7.append(r1)     // Catch:{ all -> 0x0c04 }
            java.lang.String r0 = "_id IN "
            r7.append(r0)     // Catch:{ all -> 0x0c04 }
            java.lang.String r0 = X.C34111ji.A00(r12)     // Catch:{ all -> 0x0c04 }
            r7.append(r0)     // Catch:{ all -> 0x0c04 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x0c04 }
            X.0tg r0 = r10.A02     // Catch:{ all -> 0x0c04 }
            android.database.Cursor r7 = r0.A08(r1, r2)     // Catch:{ all -> 0x0c04 }
            java.lang.String r0 = "_id"
            int r2 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0bfd }
        L_0x03bf:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0bfd }
            if (r0 == 0) goto L_0x03d1
            long r0 = r7.getLong(r2)     // Catch:{ all -> 0x0bfd }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0bfd }
            r8.add(r0)     // Catch:{ all -> 0x0bfd }
            goto L_0x03bf
        L_0x03d1:
            r7.close()     // Catch:{ all -> 0x0c04 }
            goto L_0x0379
        L_0x03d5:
            r10.close()
            java.util.Iterator r7 = r13.iterator()
        L_0x03dc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x03f8
            java.lang.Object r2 = r7.next()
            X.0tZ r2 = (X.C16740tZ) r2
            long r0 = r2.A13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x03dc
            r2.A0W(r9)
            goto L_0x03dc
        L_0x03f8:
            java.util.Iterator r2 = r13.iterator()
        L_0x03fc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0433
            java.lang.Object r1 = r2.next()
            X.0tZ r1 = (X.C16740tZ) r1
            X.1Vw r0 = r1.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x03fc
            int r0 = r1.A0C
            if (r0 == r9) goto L_0x03fc
            r3.add(r1)
            r1.A0W(r9)
            goto L_0x03fc
        L_0x0419:
            r0 = 68
            if (r6 != r0) goto L_0x0433
            X.1s4 r2 = r5.A1A
            if (r2 == 0) goto L_0x0433
            X.1Vw r0 = r2.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0433
            int r1 = r2.A0C
            r0 = 17
            if (r1 == r0) goto L_0x0433
            r3.add(r2)
            r2.A0W(r0)
        L_0x0433:
            long r1 = r4.A02(r3)
            X.1Vw r0 = r5.A11
            X.0rv r5 = r0.A00
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x002e
            if (r5 == 0) goto L_0x002e
            java.util.List r3 = X.AnonymousClass15G.A0M
            java.lang.Byte r0 = java.lang.Byte.valueOf(r6)
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0452
            X.0ts r0 = r4.A05
            r0.A0G(r5, r1)
        L_0x0452:
            X.2Bs r0 = r4.A0L
            if (r0 == 0) goto L_0x002e
            X.2Bs r0 = r4.A0L
            X.0pj r1 = r0.A00
            r0 = 0
            r1.A0A(r5, r0)
            return
        L_0x045f:
            java.lang.String r0 = "banmanager/startPermanentBanFlow/launching-banappeals"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = 0
            r3 = 3
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.userban.ui.BanAppealActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "appeal_request_token"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "ban_violation_type"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "launch_source"
            r2.putExtra(r0, r3)
            r0 = 268468224(0x10008000, float:2.5342157E-29)
            r2.setFlags(r0)
            r6.startActivity(r2)
            return
        L_0x048d:
            java.lang.Object r2 = r3.A01
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            java.lang.Object r1 = r3.A02
            android.view.View r1 = (android.view.View) r1
            int r0 = r3.A00
            r2.A0N(r1, r0)
            return
        L_0x049b:
            java.lang.Object r1 = r3.A01
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            X.0VE r0 = r1.A0D
            if (r0 == 0) goto L_0x04b1
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x04b1
            java.lang.Object r0 = r3.A02
            android.view.View r0 = (android.view.View) r0
            r0.postOnAnimation(r3)
            return
        L_0x04b1:
            int r0 = r3.A00
            r1.A0K(r0)
            return
        L_0x04b7:
            java.lang.Object r2 = r3.A01
            X.0pt r2 = (X.C14870pt) r2
            java.lang.Object r1 = r3.A02
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r0 = r3.A00
            r2.A0H(r1, r0)
            return
        L_0x04c5:
            java.lang.Object r0 = r3.A01
            X.0tb r0 = (X.C16760tb) r0
            int r2 = r3.A00
            java.lang.Object r5 = r3.A02
            X.0tZ r5 = (X.C16740tZ) r5
            X.14r r4 = r0.A18
            r1 = 3
            r0 = 4
            if (r2 != r0) goto L_0x04e3
            r3 = 3
        L_0x04d6:
            byte r2 = r5.A10
            int r1 = r5.A08
            r0 = 0
            int r0 = X.C42141xI.A00(r2, r1, r0)
            r4.A02(r3, r0)
            return
        L_0x04e3:
            r3 = 1
            if (r2 != r1) goto L_0x04d6
            r3 = 2
            goto L_0x04d6
        L_0x04e8:
            java.lang.Object r4 = r3.A01
            X.0pN r4 = (X.C14550pN) r4
            java.lang.Object r0 = r3.A02
            X.2RG r0 = (X.AnonymousClass2RG) r0
            int r2 = r3.A00
            android.content.Intent r1 = r0.mIntent
            if (r1 != 0) goto L_0x04fb
            r0 = 0
        L_0x04f7:
            r4.Ag3(r0, r2)
            return
        L_0x04fb:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            goto L_0x04f7
        L_0x0501:
            java.lang.Object r0 = r3.A01
            X.2jJ r0 = (X.C55312jJ) r0
            int r2 = r3.A00
            java.lang.Object r1 = r3.A02
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r0 = r0.A01
            com.obwhatsapp.backup.google.RestoreFromBackupActivity.A0A(r1, r0, r2)
            return
        L_0x0511:
            java.lang.Object r2 = r3.A01
            X.25g r2 = (X.C447225g) r2
            int r1 = r3.A00
            java.lang.Object r0 = r3.A02
            java.util.List r0 = (java.util.List) r0
            X.C447225g.A04(r2, r0, r1)
            return
        L_0x051f:
            java.lang.Object r0 = r3.A01
            X.16U r0 = (X.AnonymousClass16U) r0
            java.lang.Object r1 = r3.A02
            java.util.List r1 = (java.util.List) r1
            int r3 = r3.A00
            X.0xb r2 = r0.A00
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1
            com.obwhatsapp.jobqueue.job.SyncDevicesJob r0 = new com.obwhatsapp.jobqueue.job.SyncDevicesJob
            r0.<init>(r1, r3)
            r2.A00(r0)
            return
        L_0x053d:
            java.lang.Object r1 = r3.A01
            X.15I r1 = (X.AnonymousClass15I) r1
            java.lang.Object r0 = r3.A02
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            int r15 = r3.A00
            r1.A06()
            android.content.SharedPreferences r13 = r1.A05()
            java.lang.String r12 = r0.getRawString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r11 = "_notification"
            r0.append(r11)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "null,null,null,null,null,null,null,null,null"
            java.lang.String r0 = r13.getString(r1, r0)
            java.lang.String r10 = ","
            java.lang.String[] r1 = r0.split(r10)
            r0 = 0
            java.lang.Long r14 = X.AnonymousClass2D6.A04(r1, r0)
            r0 = 1
            java.lang.Long r9 = X.AnonymousClass2D6.A04(r1, r0)
            r0 = 2
            java.lang.Long r8 = X.AnonymousClass2D6.A04(r1, r0)
            r0 = 3
            java.lang.Long r7 = X.AnonymousClass2D6.A04(r1, r0)
            r0 = 4
            java.lang.Long r6 = X.AnonymousClass2D6.A04(r1, r0)
            r0 = 5
            java.lang.Long r5 = X.AnonymousClass2D6.A04(r1, r0)
            r0 = 6
            java.lang.Long r4 = X.AnonymousClass2D6.A04(r1, r0)
            r0 = 7
            java.lang.Long r3 = X.AnonymousClass2D6.A04(r1, r0)
            r2 = 8
            java.lang.Long r16 = X.AnonymousClass2D6.A04(r1, r2)
            r0 = 1
            switch(r15) {
                case 0: goto L_0x05e9;
                case 1: goto L_0x05f2;
                case 2: goto L_0x05fb;
                case 3: goto L_0x0604;
                case 4: goto L_0x060d;
                case 5: goto L_0x0616;
                case 6: goto L_0x061f;
                default: goto L_0x05a2;
            }
        L_0x05a2:
            long r0 = X.AnonymousClass2D6.A00(r3, r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
        L_0x05aa:
            android.content.SharedPreferences$Editor r1 = r13.edit()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r0 = 9
            java.lang.Long[] r12 = new java.lang.Long[r0]
            r0 = 0
            r12[r0] = r14
            r0 = 1
            r12[r0] = r9
            r0 = 2
            r12[r0] = r8
            r0 = 3
            r12[r0] = r7
            r0 = 4
            r12[r0] = r6
            r0 = 5
            r12[r0] = r5
            r0 = 6
            r12[r0] = r4
            r0 = 7
            r12[r0] = r3
            r12[r2] = r16
            java.util.List r0 = java.util.Arrays.asList(r12)
            java.lang.String r0 = android.text.TextUtils.join(r10, r0)
            android.content.SharedPreferences$Editor r0 = r1.putString(r11, r0)
            goto L_0x06cd
        L_0x05e9:
            long r0 = X.AnonymousClass2D6.A00(r14, r0)
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            goto L_0x05aa
        L_0x05f2:
            long r0 = X.AnonymousClass2D6.A00(r9, r0)
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            goto L_0x05aa
        L_0x05fb:
            long r0 = X.AnonymousClass2D6.A00(r8, r0)
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            goto L_0x05aa
        L_0x0604:
            long r0 = X.AnonymousClass2D6.A00(r7, r0)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            goto L_0x05aa
        L_0x060d:
            long r0 = X.AnonymousClass2D6.A00(r6, r0)
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            goto L_0x05aa
        L_0x0616:
            long r0 = X.AnonymousClass2D6.A00(r5, r0)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            goto L_0x05aa
        L_0x061f:
            long r0 = X.AnonymousClass2D6.A00(r4, r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            goto L_0x05aa
        L_0x0628:
            java.lang.Object r1 = r3.A01
            X.15I r1 = (X.AnonymousClass15I) r1
            java.lang.Object r0 = r3.A02
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            int r3 = r3.A00
            r1.A06()
            android.content.SharedPreferences r2 = r1.A05()
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "0,0,0,0,0,0,0,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"
            java.lang.String r0 = r2.getString(r1, r0)
            X.2D4 r0 = X.AnonymousClass2D4.A00(r0)
            r0.A01(r3)
            X.AnonymousClass15I.A00(r2, r0, r1)
            return
        L_0x064e:
            java.lang.Object r0 = r3.A01
            X.15I r0 = (X.AnonymousClass15I) r0
            java.lang.Object r10 = r3.A02
            com.whatsapp.jid.Jid r10 = (com.whatsapp.jid.Jid) r10
            r0.A06()
            android.content.SharedPreferences r3 = r0.A05()
            java.lang.String r1 = r10.getRawString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r9 = "_businessTools"
            r0.append(r9)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "null,null,null,null"
            java.lang.String r0 = r3.getString(r1, r0)
            java.lang.String r5 = ","
            java.lang.String[] r1 = r0.split(r5)
            r0 = 0
            java.lang.Long r11 = X.AnonymousClass2D6.A04(r1, r0)
            r0 = 1
            java.lang.Long r8 = X.AnonymousClass2D6.A04(r1, r0)
            r0 = 2
            java.lang.Long r7 = X.AnonymousClass2D6.A04(r1, r0)
            r6 = 3
            java.lang.Long r2 = X.AnonymousClass2D6.A04(r1, r6)
            r0 = 1
            long r0 = (long) r0
            long r0 = X.AnonymousClass2D6.A00(r2, r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r1 = r10.getRawString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r9)
            java.lang.String r2 = r0.toString()
            r0 = 4
            java.lang.Long[] r1 = new java.lang.Long[r0]
            r0 = 0
            r1[r0] = r11
            r0 = 1
            r1[r0] = r8
            r0 = 2
            r1[r0] = r7
            r1[r6] = r4
            java.util.List r0 = java.util.Arrays.asList(r1)
            java.lang.String r0 = android.text.TextUtils.join(r5, r0)
            android.content.SharedPreferences$Editor r0 = r3.putString(r2, r0)
        L_0x06cd:
            r0.apply()
            return
        L_0x06d1:
            java.lang.Object r6 = r3.A01
            X.2JC r6 = (X.AnonymousClass2JC) r6
            java.lang.Object r0 = r3.A02
            java.util.Set r0 = (java.util.Set) r0
            int r5 = r3.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x06df:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x06f9
            java.lang.Object r3 = r4.next()
            X.0rv r3 = (X.C15830rv) r3
            com.obwhatsapp.conversationslist.ConversationsFragment r0 = r6.A0L
            X.1cg r2 = r0.A17
            X.0t3 r0 = r0.A1G
            long r0 = r0.A00()
            r2.A01(r3, r0)
            goto L_0x06df
        L_0x06f9:
            com.obwhatsapp.conversationslist.ConversationsFragment r0 = r6.A0L
            X.0pt r2 = r0.A0O
            android.content.res.Resources r1 = r0.A03()
            r0 = 2131755287(0x7f100117, float:1.914145E38)
            java.lang.String r1 = r1.getQuantityString(r0, r5)
            r0 = 0
            r2.A0I(r1, r0)
            return
        L_0x070d:
            java.lang.Object r2 = r3.A01
            X.0t6 r2 = (X.C16460t6) r2
            java.lang.Object r1 = r3.A02
            java.util.Collection r1 = (java.util.Collection) r1
            int r0 = r3.A00
            r2.A0n(r1, r0)
            return
        L_0x071b:
            java.lang.Object r0 = r3.A01
            X.0t6 r0 = (X.C16460t6) r0
            java.lang.Object r2 = r3.A02
            X.0tZ r2 = (X.C16740tZ) r2
            int r1 = r3.A00
            X.0xq r0 = r0.A0r
            r0.A07(r2, r1)
            return
        L_0x072b:
            java.lang.Object r0 = r3.A01
            X.0t6 r0 = (X.C16460t6) r0
            java.lang.Object r6 = r3.A02
            X.0tZ r6 = (X.C16740tZ) r6
            int r7 = r3.A00
            X.171 r8 = r0.A1B
            X.0tq r0 = r8.A00
            X.0tf r5 = r0.A02()
            X.1cj r11 = r5.A00()     // Catch:{ all -> 0x07e8 }
            r0.A04()     // Catch:{ all -> 0x07e3 }
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x07e3 }
            boolean r0 = r0.A0D(r5)     // Catch:{ all -> 0x07e3 }
            if (r0 == 0) goto L_0x0783
            X.1Vw r9 = r6.A11     // Catch:{ all -> 0x07e3 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x07e3 }
            r4.<init>()     // Catch:{ all -> 0x07e3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x07e3 }
            java.lang.String r0 = "send_count"
            r4.put(r0, r1)     // Catch:{ all -> 0x07e3 }
            X.0rv r0 = r9.A00     // Catch:{ all -> 0x07e3 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x07e3 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x07e3 }
            X.0tg r3 = r5.A02     // Catch:{ all -> 0x07e3 }
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x07e3 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x07e3 }
            boolean r0 = r9.A02     // Catch:{ all -> 0x07e3 }
            if (r0 == 0) goto L_0x07d0
            java.lang.String r1 = "1"
        L_0x0774:
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x07e3 }
            r1 = 2
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x07e3 }
            r2[r1] = r0     // Catch:{ all -> 0x07e3 }
            java.lang.String r1 = "messages"
            java.lang.String r0 = "key_remote_jid = ? AND key_from_me = ? AND key_id = ?"
            r3.A00(r1, r4, r0, r2)     // Catch:{ all -> 0x07e3 }
        L_0x0783:
            long r3 = r6.A13     // Catch:{ all -> 0x07e3 }
            X.11I r10 = r8.A01     // Catch:{ all -> 0x07e3 }
            java.lang.String r2 = "send_count_ready"
            r0 = 0
            long r8 = r10.A01(r2, r0)     // Catch:{ all -> 0x07e3 }
            r1 = 1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x07a2
            r1 = 0
            java.lang.String r0 = "migration_message_send_count_index"
            long r1 = r10.A01(r0, r1)     // Catch:{ all -> 0x07e3 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x07d9
        L_0x07a2:
            X.AnonymousClass171.A00(r6)     // Catch:{ all -> 0x07e3 }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x07e3 }
            r3.<init>()     // Catch:{ all -> 0x07e3 }
            java.lang.String r2 = "message_row_id"
            long r0 = r6.A13     // Catch:{ all -> 0x07e3 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x07e3 }
            r3.put(r2, r0)     // Catch:{ all -> 0x07e3 }
            java.lang.String r1 = "send_count"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x07e3 }
            r3.put(r1, r0)     // Catch:{ all -> 0x07e3 }
            X.0tg r2 = r5.A02     // Catch:{ all -> 0x07e3 }
            java.lang.String r1 = "message_send_count"
            r0 = 5
            long r3 = r2.A06(r3, r1, r0)     // Catch:{ all -> 0x07e3 }
            long r1 = r6.A13     // Catch:{ all -> 0x07e3 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x07d4
            goto L_0x07d3
        L_0x07d0:
            java.lang.String r1 = "0"
            goto L_0x0774
        L_0x07d3:
            r1 = 1
        L_0x07d4:
            java.lang.String r0 = "SendCountMessageStore/insertOrUpdateSendCount/inserted row should have same row_id"
            X.AnonymousClass00B.A0D(r0, r1)     // Catch:{ all -> 0x07e3 }
        L_0x07d9:
            r11.A00()     // Catch:{ all -> 0x07e3 }
            r11.close()     // Catch:{ all -> 0x07e8 }
            r5.close()
            return
        L_0x07e3:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x07e7 }
        L_0x07e7:
            throw r0     // Catch:{ all -> 0x07e8 }
        L_0x07e8:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0c09 }
            goto L_0x0c09
        L_0x07ee:
            java.lang.Object r2 = r3.A01
            X.17E r2 = (X.AnonymousClass17E) r2
            java.lang.Object r1 = r3.A02
            X.0tZ r1 = (X.C16740tZ) r1
            int r0 = r3.A00
            r2.A01(r1, r0)
            return
        L_0x07fc:
            java.lang.Object r4 = r3.A01
            X.0tb r4 = (X.C16760tb) r4
            java.lang.Object r2 = r3.A02
            X.0tZ r2 = (X.C16740tZ) r2
            int r1 = r3.A00
            r0 = 0
            r4.A0P(r2, r1, r0, r0)
            return
        L_0x080b:
            java.lang.Object r0 = r3.A01
            X.0vP r0 = (X.C17640vP) r0
            java.lang.Object r4 = r3.A02
            com.whatsapp.jid.DeviceJid r4 = (com.whatsapp.jid.DeviceJid) r4
            int r3 = r3.A00
            X.01D r0 = r0.A03
            java.lang.Object r2 = r0.get()
            X.137 r2 = (X.AnonymousClass137) r2
            r1 = 406(0x196, float:5.69E-43)
            r0 = 0
            if (r3 != r1) goto L_0x0823
            r0 = 1
        L_0x0823:
            r2.A08(r4, r0)
            return
        L_0x0827:
            java.lang.Object r8 = r3.A01
            X.1Me r8 = (X.C26061Me) r8
            java.lang.Object r7 = r3.A02
            X.20T r7 = (X.AnonymousClass20T) r7
            int r6 = r3.A00
            r5 = 0
            r3 = 987(0x3db, double:4.876E-321)
            r1 = 1
            X.1kQ r0 = new X.1kQ
            r0.<init>(r1, r3)
            r8.A0A(r7, r0, r5, r6)
            return
        L_0x083f:
            java.lang.Object r2 = r3.A01
            X.0xq r2 = (X.C19150xq) r2
            java.lang.Object r1 = r3.A02
            X.0tZ r1 = (X.C16740tZ) r1
            int r0 = r3.A00
            r2.A08(r1, r0)
            return
        L_0x084d:
            java.lang.Object r0 = r3.A01
            X.12B r0 = (X.AnonymousClass12B) r0
            java.lang.Object r1 = r3.A02
            java.util.Set r1 = (java.util.Set) r1
            int r3 = r3.A00
            X.0xb r2 = r0.A04
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1
            com.obwhatsapp.jobqueue.job.SyncProfilePictureJob r0 = new com.obwhatsapp.jobqueue.job.SyncProfilePictureJob
            r0.<init>(r1, r3)
            r2.A00(r0)
            return
        L_0x086b:
            java.lang.Object r0 = r3.A01
            X.1RU r0 = (X.AnonymousClass1RU) r0
            java.lang.Object r1 = r3.A02
            X.0tZ r1 = (X.C16740tZ) r1
            r2 = 0
            r3 = 56
            r0.A01(r1, r3)
            r4 = 1
            r5 = 0
            r0.A03(r1, r2, r3, r4, r5)
            return
        L_0x087f:
            java.lang.Object r6 = r3.A01
            X.1TS r6 = (X.AnonymousClass1TS) r6
            java.lang.Object r2 = r3.A02
            X.0tj r2 = (X.C16840tj) r2
            r1 = 4
            r0 = r2
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r0 = r0.A11
            X.0rv r3 = r0.A00
            X.22S r5 = new X.22S
            r5.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.A01 = r0
            boolean r0 = r2 instanceof X.C39151s0
            if (r0 == 0) goto L_0x08c3
            r1 = 8
        L_0x08a0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.A02 = r0
            X.0uP r1 = r6.A00
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r3)
            X.1Vq r0 = r1.A00(r0)
            int r0 = X.AnonymousClass2RK.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A00 = r0
            X.0zR r0 = r6.A04
            java.lang.String r0 = r0.A00(r3)
            r5.A03 = r0
            goto L_0x08d0
        L_0x08c3:
            boolean r0 = r2 instanceof X.C39111rw
            if (r0 == 0) goto L_0x08c9
            r1 = 2
            goto L_0x08a0
        L_0x08c9:
            boolean r0 = r2 instanceof X.C39141rz
            r1 = 1
            if (r0 == 0) goto L_0x08a0
            r1 = 3
            goto L_0x08a0
        L_0x08d0:
            java.lang.String r4 = r6.A00(r2)     // Catch:{ JSONException -> 0x0903 }
            r3 = 0
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0903 }
            r2.<init>()     // Catch:{ JSONException -> 0x0903 }
            java.lang.String r1 = "cta"
            java.lang.String r0 = "order_details"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0903 }
            X.175 r0 = r6.A06     // Catch:{ JSONException -> 0x0903 }
            boolean r1 = r0.A0D()     // Catch:{ JSONException -> 0x0903 }
            java.lang.String r0 = "wa_pay_registered"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0903 }
            java.lang.String r0 = "p2m_type"
            r2.put(r0, r4)     // Catch:{ JSONException -> 0x0903 }
            java.lang.String r0 = "is_cta_available"
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x0903 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x0903 }
            r5.A04 = r0     // Catch:{ JSONException -> 0x0903 }
            X.0t9 r0 = r6.A03     // Catch:{ JSONException -> 0x0903 }
            r0.A04(r5)     // Catch:{ JSONException -> 0x0903 }
            return
        L_0x0903:
            java.lang.String r0 = "OrderDetailsMessageLogging/logReceiveOrderDetails failed to construct message class attributes"
            goto L_0x0ad8
        L_0x0907:
            java.lang.Object r5 = r3.A01
            X.1TS r5 = (X.AnonymousClass1TS) r5
            java.lang.Object r3 = r3.A02
            X.0tj r3 = (X.C16840tj) r3
            r1 = 4
            r0 = r3
            X.0tZ r0 = (X.C16740tZ) r0
            X.1Vw r0 = r0.A11
            X.0rv r2 = r0.A00
            X.22S r4 = new X.22S
            r4.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4.A01 = r0
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A02 = r0
            X.0uP r1 = r5.A00
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r2)
            X.1Vq r0 = r1.A00(r0)
            int r0 = X.AnonymousClass2RK.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A00 = r0
            X.0zR r0 = r5.A04
            java.lang.String r0 = r0.A00(r2)
            r4.A03 = r0
            java.lang.String r3 = r5.A00(r3)     // Catch:{ JSONException -> 0x0ad6 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0ad6 }
            r2.<init>()     // Catch:{ JSONException -> 0x0ad6 }
            java.lang.String r1 = "cta"
            java.lang.String r0 = "order_status"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x0ad6 }
            X.175 r0 = r5.A06     // Catch:{ JSONException -> 0x0ad6 }
            boolean r1 = r0.A0D()     // Catch:{ JSONException -> 0x0ad6 }
            java.lang.String r0 = "wa_pay_registered"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x0ad6 }
            java.lang.String r0 = "p2m_type"
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x0ad6 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x0ad6 }
            r4.A04 = r0     // Catch:{ JSONException -> 0x0ad6 }
            X.0t9 r0 = r5.A03     // Catch:{ JSONException -> 0x0ad6 }
            r0.A04(r4)     // Catch:{ JSONException -> 0x0ad6 }
            return
        L_0x0972:
            java.lang.Object r4 = r3.A01
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r2 = r3.A02
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1)
            r4.setLayoutParams(r0)
            r2.run()
            return
        L_0x0987:
            java.lang.Object r2 = r3.A01
            X.2UU r2 = (X.AnonymousClass2UU) r2
            java.lang.Object r1 = r3.A02
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r3.A00
            r2.A00(r1, r0)
            return
        L_0x0995:
            X.18r r3 = r4.A0H     // Catch:{ IllegalArgumentException -> 0x09a7 }
            X.1CI r1 = r4.A0G     // Catch:{ IllegalArgumentException -> 0x09a7 }
            int r0 = r5.psIdKey     // Catch:{ IllegalArgumentException -> 0x09a7 }
            java.lang.String r2 = r1.A02(r0)     // Catch:{ IllegalArgumentException -> 0x09a7 }
            r1 = 6005(0x1775, float:8.415E-42)
            r0 = 2
            r3.A02(r2, r1, r0)     // Catch:{ IllegalArgumentException -> 0x09a7 }
            goto L_0x0aa3
        L_0x09a7:
            java.lang.String r0 = "invalid ps-id key"
            r4.A0D(r0)
            return
        L_0x09ad:
            boolean r0 = r4.A0P
            r7 = 113760892(0x6c7da7c, float:7.5176514E-35)
            if (r0 != 0) goto L_0x0a99
            X.1CI r2 = r4.A0G     // Catch:{ IllegalArgumentException -> 0x0a5f }
            java.lang.String r3 = r2.A02(r7)     // Catch:{ IllegalArgumentException -> 0x0a5f }
            X.0rz r0 = r4.A0D     // Catch:{ IllegalArgumentException -> 0x0a5f }
            java.lang.String r1 = "private_stats_id"
            if (r3 == 0) goto L_0x0a55
            android.content.SharedPreferences$Editor r0 = r0.A0K()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r3)     // Catch:{ IllegalArgumentException -> 0x0a5f }
        L_0x09c8:
            r0.apply()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            java.util.HashMap r0 = r2.A03     // Catch:{ IllegalArgumentException -> 0x0a5f }
            if (r0 == 0) goto L_0x09e2
            android.content.SharedPreferences$Editor r0 = r2.A00()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            android.content.SharedPreferences$Editor r0 = r0.clear()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            r0.apply()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            java.util.HashMap r0 = r2.A03     // Catch:{ IllegalArgumentException -> 0x0a5f }
            r0.clear()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            r0 = 0
            r2.A03 = r0     // Catch:{ IllegalArgumentException -> 0x0a5f }
        L_0x09e2:
            android.content.SharedPreferences r0 = r2.A01()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            android.content.SharedPreferences$Editor r0 = r0.clear()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            r0.apply()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            X.1a9 r2 = r4.A02     // Catch:{ IllegalArgumentException -> 0x0a5f }
            java.lang.String r9 = "wamdit3.wam"
            int r1 = r2.A03     // Catch:{ IllegalArgumentException -> 0x0a5f }
            r0 = 2
            if (r1 != r0) goto L_0x0a5f
            java.io.File r0 = r2.A07     // Catch:{ IllegalArgumentException -> 0x0a5f }
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            char r0 = java.io.File.separatorChar     // Catch:{ IllegalArgumentException -> 0x0a5f }
            int r0 = r1.lastIndexOf(r0)     // Catch:{ IllegalArgumentException -> 0x0a5f }
            int r0 = r0 + 1
            r3 = 0
            java.lang.String r2 = r1.substring(r3, r0)     // Catch:{ IllegalArgumentException -> 0x0a5f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0a5f }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            r0.append(r2)     // Catch:{ IllegalArgumentException -> 0x0a5f }
            r0.append(r9)     // Catch:{ IllegalArgumentException -> 0x0a5f }
            java.lang.String r0 = r0.toString()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            java.io.File r1 = new java.io.File     // Catch:{ IllegalArgumentException -> 0x0a5f }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0a5f }
            boolean r0 = r1.exists()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            if (r0 == 0) goto L_0x0a2b
            r1.delete()     // Catch:{ IllegalArgumentException -> 0x0a5f }
        L_0x0a2b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0a5f }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            r1.append(r2)     // Catch:{ IllegalArgumentException -> 0x0a5f }
            java.lang.String r0 = "wampsid"
            r1.append(r0)     // Catch:{ IllegalArgumentException -> 0x0a5f }
            r1.append(r3)     // Catch:{ IllegalArgumentException -> 0x0a5f }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            java.io.File r1 = new java.io.File     // Catch:{ IllegalArgumentException -> 0x0a5f }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0a5f }
            boolean r0 = r1.exists()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            if (r0 == 0) goto L_0x0a4e
            r1.delete()     // Catch:{ IllegalArgumentException -> 0x0a5f }
        L_0x0a4e:
            int r3 = r3 + 1
            r0 = 8
            if (r3 >= r0) goto L_0x0a5f
            goto L_0x0a2b
        L_0x0a55:
            android.content.SharedPreferences$Editor r0 = r0.A0K()     // Catch:{ IllegalArgumentException -> 0x0a5f }
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)     // Catch:{ IllegalArgumentException -> 0x0a5f }
            goto L_0x09c8
        L_0x0a5f:
            X.18r r3 = r4.A0H
            X.0rz r9 = r4.A0D
            X.01D r0 = r9.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "private_stats_id"
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)
            if (r2 != 0) goto L_0x0a91
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r2 = r0.toString()
            android.content.SharedPreferences$Editor r0 = r9.A0K()
            if (r2 == 0) goto L_0x0a9e
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
        L_0x0a86:
            r0.apply()
            X.3q3 r0 = new X.3q3
            r0.<init>()
            r4.A06(r0)
        L_0x0a91:
            r1 = 6005(0x1775, float:8.415E-42)
            r0 = 2
            r3.A02(r2, r1, r0)
            r4.A0P = r8
        L_0x0a99:
            int r0 = r5.psIdKey
            if (r0 == r7) goto L_0x0aa3
            return
        L_0x0a9e:
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            goto L_0x0a86
        L_0x0aa3:
            X.1a8 r0 = r4.A04
            r0.A03(r5, r6)
            X.1a8 r0 = r4.A04
            r0.A01()
            r4.A02()
            return
        L_0x0ab1:
            r0 = 0
            r4.A09(r1, r3, r0)
            return
        L_0x0ab6:
            java.lang.String r1 = "Invalid disclosureId"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0abe:
            X.0sK r0 = r6.A00
            r0.A0B()
            com.obwhatsapp.Me r5 = r0.A00
            if (r5 != 0) goto L_0x0adc
            java.lang.String r1 = "DisclosureCmsDownloader/fetchDisclosures could not create uri for disclosure ids "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            goto L_0x0ad8
        L_0x0ad6:
            java.lang.String r0 = "OrderDetailsMessageLogging/logReceiveOrderDetailsUpdate failed to construct message class attributes"
        L_0x0ad8:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0adc:
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "https"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "whatsapp.com"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "user-notice"
            android.net.Uri$Builder r1 = r1.appendPath(r0)
            java.lang.String r0 = "v2"
            android.net.Uri$Builder r2 = r1.appendPath(r0)
            java.lang.String r1 = X.AnonymousClass1DJ.A00(r4)
            java.lang.String r0 = "ids"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            X.013 r3 = r6.A02
            java.lang.String r1 = r3.A06()
            java.lang.String r0 = "lg"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            java.lang.String r1 = r3.A05()
            java.lang.String r0 = "lc"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            java.lang.String r0 = r5.cc
            java.lang.String r1 = X.C18160wF.A00(r0)
            java.lang.String r0 = "cc"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            java.lang.String r1 = "android"
            java.lang.String r0 = "platform"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r0, r1)
            X.0tz r0 = r6.A01
            android.content.Context r0 = r0.A00
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.densityDpi
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 > r0) goto L_0x0b72
            java.lang.String r1 = "hdpi"
        L_0x0b44:
            java.lang.String r0 = "img-size"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r0, r1)
            android.net.Uri r11 = r0.build()
            r11.toString()
            X.03g r7 = new X.03g
            r7.<init>()
            int r10 = r4.size()
            int[] r8 = new int[r10]
            r1 = 0
        L_0x0b5d:
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x0b76
            java.lang.Object r0 = r4.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r8[r1] = r0
            int r1 = r1 + 1
            goto L_0x0b5d
        L_0x0b72:
            java.lang.String r1 = "xxhdpi"
            goto L_0x0b44
        L_0x0b76:
            java.lang.String r5 = "disclosure_ids"
            java.util.Map r3 = r7.A00
            java.lang.Integer[] r2 = new java.lang.Integer[r10]
            r1 = 0
        L_0x0b7d:
            if (r1 >= r10) goto L_0x0b8a
            r0 = r8[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0b7d
        L_0x0b8a:
            r3.put(r5, r2)
            java.lang.String r0 = "handler"
            r7.A01(r0, r9)
            java.lang.String r1 = r11.toString()
            java.lang.String r0 = "url"
            r3.put(r0, r1)
            X.03h r7 = r7.A00()
            X.040 r1 = new X.040
            r1.<init>()
            X.041 r0 = X.AnonymousClass041.CONNECTED
            r1.A01(r0)
            X.042 r2 = r1.A00()
            java.lang.Class<com.obwhatsapp.privacy.protocol.http.DisclosureContentWorker> r0 = com.obwhatsapp.privacy.protocol.http.DisclosureContentWorker.class
            X.03e r5 = new X.03e
            r5.<init>(r0)
            java.lang.String r1 = "tag.whatsapp.privacy.disclosure.content.fetch"
            java.util.Set r0 = r5.A03
            r0.add(r1)
            X.03i r0 = r5.A00
            r0.A0A = r2
            X.04P r3 = X.AnonymousClass04P.EXPONENTIAL
            r1 = 1
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            r5.A03(r3, r0, r1)
            X.03i r0 = r5.A00
            r0.A0B = r7
            X.03k r3 = r5.A00()
            X.043 r3 = (X.AnonymousClass043) r3
            java.lang.String r0 = "tag.whatsapp.privacy.disclosure.content.fetch."
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = X.AnonymousClass1DJ.A00(r4)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            X.12P r0 = r6.A03
            java.lang.Object r1 = r0.get()
            X.022 r1 = (X.AnonymousClass022) r1
            X.03z r0 = X.AnonymousClass03z.REPLACE
            X.04Q r0 = r1.A02(r0, r3, r2)
            X.04Q r0 = r0.A02(r3)
            r0.A03()
            return
        L_0x0bfd:
            r0 = move-exception
            if (r7 == 0) goto L_0x0c03
            r7.close()     // Catch:{ all -> 0x0c03 }
        L_0x0c03:
            throw r0     // Catch:{ all -> 0x0c04 }
        L_0x0c04:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0c09 }
            throw r0
        L_0x0c09:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0201000_I0.run():void");
    }
}
