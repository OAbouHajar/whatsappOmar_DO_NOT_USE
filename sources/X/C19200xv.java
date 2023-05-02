package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import java.util.ArrayList;

/* renamed from: X.0xv  reason: invalid class name and case insensitive filesystem */
public class C19200xv {
    public boolean A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final C17650vQ A02;
    public final C18260wP A03;
    public final C16440t3 A04;
    public final C14710pd A05;
    public final C216214u A06;
    public final C209212c A07;
    public final AnonymousClass1T3 A08;
    public final C16320sq A09;
    public final AnonymousClass15A A0A;
    public final Runnable A0B;
    public final ArrayList A0C = new ArrayList();

    public C19200xv(C17650vQ r3, C18260wP r4, C16440t3 r5, C14710pd r6, C216214u r7, C209212c r8, AnonymousClass1T3 r9, C16320sq r10, AnonymousClass15A r11) {
        this.A04 = r5;
        this.A05 = r6;
        this.A09 = r10;
        this.A0A = r11;
        this.A02 = r3;
        this.A06 = r7;
        this.A07 = r8;
        this.A08 = r9;
        this.A03 = r4;
        this.A0B = new RunnableRunnableShape10S0100000_I0_9((Object) this, 32);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d4, code lost:
        if (r2 != false) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C38331qc r23, X.C16730tY r24, int r25, boolean r26) {
        /*
            r22 = this;
            java.lang.String r0 = "mediaautodownload/queue "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r7 = r24
            java.lang.String r0 = r7.A08
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "mediaautodownload/getPriorityValue"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9 = r22
            X.0t3 r0 = r9.A04
            long r18 = r0.A00()
            X.0pd r2 = r9.A05
            r1 = 60
            X.0tM r0 = X.C16620tM.A02
            int r1 = r2.A03(r0, r1)
            X.1Vw r0 = r7.A11
            X.0rv r11 = r0.A00
            if (r11 == 0) goto L_0x004b
            if (r1 == 0) goto L_0x004b
            java.lang.String r0 = "mediaautodownload/getPriorityValue/getHeuristicDownloadPriority"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1T3 r10 = r9.A08
            boolean r0 = X.C16030sJ.A0Q(r11)
            r16 = 345600000(0x14997000, double:1.70749087E-315)
            r8 = 1
            if (r0 == 0) goto L_0x006a
            byte r0 = r7.A10
            if (r0 != r8) goto L_0x00d7
            long r18 = r18 - r16
        L_0x004b:
            X.0vQ r0 = r9.A02
            boolean r0 = r0.A00()
            r15 = r23
            r17 = r25
            r20 = r26
            if (r0 == 0) goto L_0x00ee
            java.lang.String r0 = "mediaautodownload/queue waiting to download because call is active"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2IB r0 = new X.2IB
            r14 = r0
            r16 = r7
            r14.<init>(r15, r16, r17, r18, r20)
            java.util.ArrayList r1 = r9.A0C
            monitor-enter(r1)
            goto L_0x00e6
        L_0x006a:
            boolean r0 = r7.A0u
            r6 = 20
            r5 = 42
            if (r0 == 0) goto L_0x0086
            byte r0 = r7.A10
            if (r0 != r5) goto L_0x007c
            r0 = 40000(0x9c40, double:1.97626E-319)
        L_0x0079:
            long r18 = r18 + r0
            goto L_0x004b
        L_0x007c:
            if (r0 != r6) goto L_0x0081
            r0 = 30000(0x7530, double:1.4822E-319)
            goto L_0x0079
        L_0x0081:
            if (r0 != r8) goto L_0x0086
            r0 = 20000(0x4e20, double:9.8813E-320)
            goto L_0x0079
        L_0x0086:
            X.0rz r0 = r10.A00
            X.01D r0 = r0.A01
            java.lang.Object r3 = r0.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r2 = "last_read_conversation_time"
            r0 = 0
            long r14 = r3.getLong(r2, r0)
            X.0rt r0 = r10.A01
            java.util.concurrent.ConcurrentHashMap r0 = r0.A0C()
            java.lang.Object r0 = r0.get(r11)
            X.0rx r0 = (X.C15840rx) r0
            if (r0 != 0) goto L_0x00d1
            r3 = 0
        L_0x00a8:
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            long r1 = r3 + r12
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            r2 = 0
            if (r0 >= 0) goto L_0x00b3
            r2 = 1
        L_0x00b3:
            X.0sf r0 = r10.A02
            boolean r1 = r0.A0Q(r11)
            byte r0 = r7.A10
            r10 = 172800000(0xa4cb800, double:8.53745436E-316)
            if (r0 == r6) goto L_0x00c6
            if (r0 == r5) goto L_0x00c6
            if (r0 != r8) goto L_0x00ce
            long r18 = r18 - r10
        L_0x00c6:
            if (r1 == 0) goto L_0x00d4
            if (r2 == 0) goto L_0x00de
            r10 = 259200000(0xf731400, double:1.280618154E-315)
            goto L_0x00da
        L_0x00ce:
            long r18 = r18 - r16
            goto L_0x00c6
        L_0x00d1:
            long r3 = r0.A0W
            goto L_0x00a8
        L_0x00d4:
            if (r2 == 0) goto L_0x00e0
            goto L_0x00da
        L_0x00d7:
            r10 = 518400000(0x1ee62800, double:2.56123631E-315)
        L_0x00da:
            long r18 = r18 - r10
            goto L_0x004b
        L_0x00de:
            long r18 = r18 - r12
        L_0x00e0:
            long r18 = r18 - r14
            long r18 = r18 + r3
            goto L_0x004b
        L_0x00e6:
            r1.add(r0)     // Catch:{ all -> 0x00eb }
            monitor-exit(r1)     // Catch:{ all -> 0x00eb }
            return
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00eb }
            throw r0
        L_0x00ee:
            X.12c r0 = r9.A07
            r21 = 1
            r14 = r0
            r16 = r7
            r14.A08(r15, r16, r17, r18, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19200xv.A00(X.1qc, X.0tY, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r6 >= (r0 == 0 ? 0 : (long) java.lang.Math.ceil((double) (5.0f * (((float) r2) / ((float) r0)))))) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b4, code lost:
        if (X.C31831f6.A04(X.C31831f6.A01(r15.A10, r15.A08)) == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0137, code lost:
        if ((r4.A04.A00() - ((android.content.SharedPreferences) r6.get()).getLong("status_tab_last_opened_time", 0)) > 1209600000) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x015d, code lost:
        if (r0.A0D != null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0163, code lost:
        if (r6.A0D != null) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C16730tY r15, int r16, boolean r17) {
        /*
            r14 = this;
            X.0pd r1 = r14.A05
            r0 = 1838(0x72e, float:2.576E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r0 = r1.A0E(r2, r0)
            if (r0 != 0) goto L_0x0071
            X.14u r4 = r14.A06
            X.1Vw r5 = r15.A11
            boolean r9 = r5.A02
            r3 = 1
            if (r9 == 0) goto L_0x00bb
            boolean r0 = r15.A1D
            if (r0 == 0) goto L_0x00bb
        L_0x0019:
            r12 = 1
        L_0x001a:
            r9 = 0
            r8 = 1
            if (r12 == 0) goto L_0x0054
            if (r17 == 0) goto L_0x0099
            boolean r0 = r15 instanceof X.C38711rI
            if (r0 == 0) goto L_0x0099
            X.0rv r0 = r5.A00
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x0099
            X.0ta r1 = r15.A02
            X.AnonymousClass00B.A06(r1)
            X.0wK r0 = r4.A0D
            java.lang.String r1 = r1.A0I
            if (r1 == 0) goto L_0x0099
            X.1OJ r0 = r0.A0J
            X.1f1 r0 = r0.A02(r1, r8)
            if (r0 == 0) goto L_0x0099
            long r6 = r0.A0A
            long r2 = r15.A01
            int r0 = r15.A00
            long r0 = (long) r0
            r11 = 1084227584(0x40a00000, float:5.0)
            r12 = 0
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x008e
            r2 = 0
        L_0x0050:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0099
        L_0x0054:
            X.0ta r0 = r15.A02
            X.AnonymousClass00B.A06(r0)
            int r0 = r0.A07
            if (r0 == r8) goto L_0x0071
            X.0rv r0 = r5.A00
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x007c
            boolean r0 = r4.A05(r15)
        L_0x0069:
            if (r0 == 0) goto L_0x0071
            if (r17 == 0) goto L_0x0072
            boolean r0 = r15 instanceof X.C38681rF
            if (r0 == 0) goto L_0x0072
        L_0x0071:
            return
        L_0x0072:
            r0 = r16
            boolean r0 = r4.A06(r15, r0)
            if (r0 == 0) goto L_0x0071
            r0 = 2
            goto L_0x00b7
        L_0x007c:
            boolean r0 = r15 instanceof X.C38711rI
            if (r0 != 0) goto L_0x0089
            boolean r0 = r15 instanceof X.C38681rF
            if (r0 != 0) goto L_0x0089
            boolean r0 = r15 instanceof X.C38641rB
            if (r0 != 0) goto L_0x0089
            return
        L_0x0089:
            boolean r0 = r4.A04(r15)
            goto L_0x0069
        L_0x008e:
            float r10 = (float) r2
            float r2 = (float) r0
            float r10 = r10 / r2
            float r11 = r11 * r10
            double r0 = (double) r11
            double r0 = java.lang.Math.ceil(r0)
            long r2 = (long) r0
            goto L_0x0050
        L_0x0099:
            boolean r0 = r4.A03(r15)
            if (r0 == 0) goto L_0x0054
            X.0rv r0 = r5.A00
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x00b6
            byte r1 = r15.A10
            int r0 = r15.A08
            X.1XK r0 = X.C31831f6.A01(r1, r0)
            boolean r1 = X.C31831f6.A04(r0)
            r0 = 3
            if (r1 != 0) goto L_0x00b7
        L_0x00b6:
            r0 = 1
        L_0x00b7:
            r14.A00(r9, r15, r0, r8)
            return
        L_0x00bb:
            X.0ta r0 = r15.A02
            X.AnonymousClass00B.A06(r0)
            int r0 = r0.A07
            if (r0 == r3) goto L_0x0188
            X.0rv r0 = r5.A00
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x0167
            X.0rv r8 = r15.A0B()
            X.11G r1 = r4.A0A
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r8)
            X.1dI r7 = r1.A06(r0)
            r12 = 0
            if (r7 != 0) goto L_0x00f4
            java.lang.String r1 = "no status for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            if (r8 != 0) goto L_0x00e8
            java.lang.String r8 = " me"
        L_0x00e8:
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x001a
        L_0x00f4:
            boolean r0 = r1.A0I(r15)
            if (r0 != 0) goto L_0x001a
            boolean r0 = X.C16030sJ.A0P(r8)
            if (r0 != 0) goto L_0x0019
            X.0pd r1 = r4.A0B
            r0 = 138(0x8a, float:1.93E-43)
            boolean r0 = r1.A0E(r2, r0)
            if (r0 == 0) goto L_0x013b
            X.0rz r0 = r4.A05
            X.01D r6 = r0.A01
            java.lang.Object r2 = r6.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r3 = "status_tab_last_opened_time"
            r0 = 0
            long r10 = r2.getLong(r3, r0)
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x013b
            X.0t3 r2 = r4.A04
            long r10 = r2.A00()
            java.lang.Object r2 = r6.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            long r0 = r2.getLong(r3, r0)
            long r10 = r10 - r0
            r1 = 1209600000(0x48190800, double:5.97621805E-315)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x013b
            goto L_0x001a
        L_0x013b:
            X.0sG r10 = r4.A03
            X.0sH r6 = r10.A0A(r8)
            monitor-enter(r7)
            long r2 = r15.A14     // Catch:{ all -> 0x0191 }
            long r0 = r7.A02     // Catch:{ all -> 0x0191 }
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r0 = 0
            if (r11 > 0) goto L_0x014c
            r0 = 1
        L_0x014c:
            monitor-exit(r7)
            if (r0 == 0) goto L_0x001a
            boolean r0 = r6.A0m
            if (r0 != 0) goto L_0x001a
            if (r9 != 0) goto L_0x0161
            X.0sH r0 = r10.A08(r8)
            if (r0 == 0) goto L_0x001a
            X.1ko r0 = r0.A0D
            if (r0 != 0) goto L_0x0161
            goto L_0x001a
        L_0x0161:
            X.1ko r0 = r6.A0D
            if (r0 == 0) goto L_0x001a
            goto L_0x0019
        L_0x0167:
            byte r1 = r15.A10
            r0 = 2
            if (r1 != r0) goto L_0x0172
            int r0 = r15.A08
            if (r0 != r3) goto L_0x0178
            goto L_0x0019
        L_0x0172:
            r0 = 20
            if (r1 != r0) goto L_0x0178
            goto L_0x0019
        L_0x0178:
            int r1 = r15.A05
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 < r0) goto L_0x018b
            X.0s5 r1 = r4.A01
            X.0s8 r0 = X.C15910s6.A0T
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x018b
        L_0x0188:
            r12 = 0
            goto L_0x001a
        L_0x018b:
            boolean r12 = r4.A04(r15)
            goto L_0x001a
        L_0x0191:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19200xv.A01(X.0tY, int, boolean):void");
    }
}
