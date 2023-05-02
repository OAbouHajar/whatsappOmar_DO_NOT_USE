package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.1H7  reason: invalid class name */
public class AnonymousClass1H7 implements C19170xs {
    public AnonymousClass292 A00;
    public final AnonymousClass10X A01;
    public final C16760tb A02;
    public final C18260wP A03;
    public final C16440t3 A04;
    public final C15860rz A05;
    public final C16460t6 A06;
    public final C16900tq A07;
    public final AnonymousClass119 A08;
    public final AnonymousClass15G A09;
    public final AnonymousClass1QT A0A;
    public final AnonymousClass0y3 A0B;
    public final C27611Sl A0C;
    public final C16320sq A0D;

    public AnonymousClass1H7(AnonymousClass10X r1, C16760tb r2, C18260wP r3, C16440t3 r4, C15860rz r5, C16460t6 r6, C16900tq r7, AnonymousClass119 r8, AnonymousClass15G r9, AnonymousClass1QT r10, AnonymousClass0y3 r11, C27611Sl r12, C16320sq r13) {
        this.A04 = r4;
        this.A01 = r1;
        this.A0D = r13;
        this.A02 = r2;
        this.A0A = r10;
        this.A06 = r6;
        this.A0B = r11;
        this.A08 = r8;
        this.A05 = r5;
        this.A09 = r9;
        this.A07 = r7;
        this.A03 = r3;
        this.A0C = r12;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(X.C16740tZ r12) {
        /*
            r11 = this;
            int r2 = r12.A0C
            r1 = 20
            r10 = 0
            if (r2 == r1) goto L_0x0014
            r0 = 7
            if (r2 != r0) goto L_0x0015
            X.1Vw r0 = r12.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 == 0) goto L_0x0015
        L_0x0014:
            return r10
        L_0x0015:
            byte r5 = r12.A10
            java.lang.String r4 = " "
            java.lang.String r7 = "app/unsent/skip "
            r6 = 1
            if (r5 == r6) goto L_0x00b6
            r0 = 2
            if (r5 == r0) goto L_0x00b6
            r0 = 3
            if (r5 == r0) goto L_0x00b6
            r0 = 5
            if (r5 == r0) goto L_0x008e
            r0 = 13
            if (r5 == r0) goto L_0x00b6
            r0 = 16
            if (r5 == r0) goto L_0x008e
            if (r5 == r1) goto L_0x00b6
            r0 = 42
            if (r5 == r0) goto L_0x00b6
            r0 = 43
            if (r5 == r0) goto L_0x00b6
            switch(r5) {
                case 7: goto L_0x0086;
                case 8: goto L_0x00a7;
                case 9: goto L_0x00b6;
                case 10: goto L_0x00a7;
                default: goto L_0x003c;
            }
        L_0x003c:
            boolean r0 = r12 instanceof X.C16730tY
            if (r0 == 0) goto L_0x00d9
            X.1QT r8 = r11.A0A
            r9 = r12
            X.0tY r9 = (X.C16730tY) r9
            boolean r0 = r8.A0A(r9)
            if (r0 != 0) goto L_0x0064
            byte r1 = r9.A10
            int r0 = r9.A08
            X.1XK r0 = X.C31831f6.A01(r1, r0)
            boolean r0 = X.C31831f6.A03(r0)
            if (r0 == 0) goto L_0x00d9
            long r2 = r9.A01
            int r0 = r9.A00
            long r0 = (long) r0
            boolean r0 = r8.A07(r2, r0)
            if (r0 == 0) goto L_0x00d9
        L_0x0064:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            X.1Vw r0 = r12.A11
            java.lang.String r0 = r0.A01
            r1.append(r0)
            r1.append(r4)
            r1.append(r5)
            java.lang.String r0 = " need transcode"
        L_0x007b:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r10
        L_0x0086:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/unsent/skip/system "
            goto L_0x00ae
        L_0x008e:
            r3 = r12
            X.1d9 r3 = (X.C30901d9) r3
            double r0 = r3.A01
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x003c
            double r0 = r3.A00
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x003c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/unsent/skip/location "
            goto L_0x00ae
        L_0x00a7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/unsent/skip/call "
        L_0x00ae:
            r1.append(r0)
            X.1Vw r0 = r12.A11
            java.lang.String r0 = r0.A01
            goto L_0x007b
        L_0x00b6:
            r0 = r12
            X.0tY r0 = (X.C16730tY) r0
            X.0ta r0 = r0.A02
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.A0L
            if (r0 != 0) goto L_0x003c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            X.1Vw r0 = r12.A11
            java.lang.String r0 = r0.A01
            r1.append(r0)
            r1.append(r4)
            r1.append(r5)
            java.lang.String r0 = " autoretry disabled"
            goto L_0x007b
        L_0x00d9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1H7.A00(X.0tZ):boolean");
    }

    public void AS4() {
        C16900tq r0 = this.A07;
        r0.A04();
        if (r0.A01) {
            Iterator it = this.A08.A01().iterator();
            while (it.hasNext()) {
                C16740tZ r9 = (C16740tZ) it.next();
                long A002 = this.A04.A00();
                long j2 = r9.A0I;
                if (10800000 + j2 < A002 && j2 + 86400000 >= A002 && A00(r9)) {
                    C15860rz r6 = this.A05;
                    if (((SharedPreferences) r6.A01.get()).getLong("last_unsent_notification_time", 0) + 86400000 < A002) {
                        Log.i("Posting notification about unsent messages");
                        r6.A0K().putLong("last_unsent_notification_time", A002).apply();
                        C27611Sl r5 = this.A0C;
                        Context context = r5.A00.A00;
                        String string = context.getString(R.string.str0d66);
                        String string2 = context.getString(R.string.str0d65);
                        PendingIntent A003 = C42341xd.A00(context, 1, C14750ph.A02(context), 0);
                        C007503l A004 = C218415q.A00(context);
                        A004.A0J = "failure_notifications@1";
                        A004.A0B(string);
                        A004.A05(System.currentTimeMillis());
                        A004.A02(3);
                        A004.A0D(true);
                        A004.A0A(string);
                        A004.A09(string2);
                        A004.A09 = A003;
                        A004.A07.icon = yo.getNIcon(R.drawable.notifybar);
                        r5.A01.A02(6, A004.A01());
                        r5.A02 = true;
                        return;
                    }
                    return;
                }
            }
        }
    }
}
