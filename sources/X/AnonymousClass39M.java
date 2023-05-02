package X;

import java.util.List;

/* renamed from: X.39M  reason: invalid class name */
public class AnonymousClass39M {
    public Boolean A00;
    public boolean A01 = false;
    public final AnonymousClass1MC A02;
    public final C15810rt A03;
    public final C16070sO A04;
    public final AnonymousClass15B A05;
    public final AnonymousClass10G A06;
    public final C14710pd A07;
    public final C47712Kc A08;
    public final C16220sf A09;
    public final List A0A = AnonymousClass000.A0u();

    public AnonymousClass39M(AnonymousClass1MC r3, C15810rt r4, C16070sO r5, AnonymousClass15B r6, AnonymousClass10G r7, C14710pd r8, C47712Kc r9, C16220sf r10) {
        this.A07 = r8;
        this.A03 = r4;
        this.A05 = r6;
        this.A09 = r10;
        this.A06 = r7;
        this.A08 = r9;
        this.A04 = r5;
        this.A02 = r3;
        AnonymousClass2T8 r1 = r9.A00;
        if (r1 != null) {
            r1.A00(new AnonymousClass514(this, r9));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C16010sH r11) {
        /*
            r10 = this;
            boolean r0 = r10.A01()
            if (r0 == 0) goto L_0x00d7
            X.2Kc r0 = r10.A08
            X.51S r2 = new X.51S
            r2.<init>(r10, r11)
            X.1dR r5 = r0.A01
            X.17S r1 = r5.A07
            X.1dS r0 = r5.A06
            int r0 = r0.A05
            r1.AKu(r2, r0)
            X.0rv r7 = X.C16010sH.A02(r11)
            if (r7 == 0) goto L_0x00d1
            X.0sf r0 = r10.A09
            java.util.Map r1 = r0.A0X
            java.lang.String r0 = r7.getRawString()
            java.lang.Object r0 = r1.get(r0)
            X.1WS r0 = (X.AnonymousClass1WS) r0
            if (r0 == 0) goto L_0x0036
            boolean r2 = r0.A0G
            java.lang.String r1 = "is_pinned_chat"
            r0 = 0
            r5.A0B(r1, r2, r0)
        L_0x0036:
            X.1MC r3 = r10.A02
            monitor-enter(r3)
            java.util.Set r2 = r3.A00     // Catch:{ all -> 0x00ce }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x0047
            r2.add(r7)     // Catch:{ all -> 0x00ce }
            monitor-exit(r3)
            r6 = 2
            goto L_0x0061
        L_0x0047:
            r1 = 100
            int r0 = r2.size()     // Catch:{ all -> 0x00ce }
            r6 = 3
            if (r1 != r0) goto L_0x0057
            boolean r0 = r2.contains(r7)     // Catch:{ all -> 0x00ce }
            if (r0 != 0) goto L_0x0060
            goto L_0x005f
        L_0x0057:
            boolean r0 = r2.add(r7)     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x0060
            r6 = 1
            goto L_0x0060
        L_0x005f:
            r6 = 4
        L_0x0060:
            monitor-exit(r3)
        L_0x0061:
            java.lang.String r4 = "is_first_chat_open_after_start"
            java.lang.String r3 = "is_first_chat_open"
            r1 = 1
            r2 = 0
            if (r6 == r1) goto L_0x00ca
            r0 = 2
            if (r6 == r0) goto L_0x00c3
            r0 = 3
            if (r6 != r0) goto L_0x0075
            r5.A0B(r3, r2, r2)
        L_0x0072:
            r5.A0B(r4, r2, r2)
        L_0x0075:
            X.0rt r1 = r10.A03
            int r0 = r1.A00(r7)
            if (r0 <= 0) goto L_0x007e
            r2 = 1
        L_0x007e:
            java.lang.String r0 = "has_unread_messages"
            r6 = 0
            r5.A0B(r0, r2, r6)
            long r1 = r1.A05(r7)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00d7
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00d7
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r7.toMinutes(r3)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00aa
            java.lang.String r1 = "less_1_minute"
        L_0x00a3:
            java.lang.String r0 = "time_of_last_message"
            r5.A0A(r0, r1, r6)
            return
        L_0x00aa:
            long r1 = r7.toHours(r3)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00b5
            java.lang.String r1 = "less_1_hour"
            goto L_0x00a3
        L_0x00b5:
            long r1 = r7.toDays(r3)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00c0
            java.lang.String r1 = "less_1_day"
            goto L_0x00a3
        L_0x00c0:
            java.lang.String r1 = "more_1_day"
            goto L_0x00a3
        L_0x00c3:
            r5.A0B(r3, r1, r2)
            r5.A0B(r4, r1, r2)
            goto L_0x0075
        L_0x00ca:
            r5.A0B(r3, r1, r2)
            goto L_0x0072
        L_0x00ce:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39M.A00(X.0sH):void");
    }

    public final boolean A01() {
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(!this.A07.A0E(C16620tM.A02, 2768));
            this.A00 = bool;
        }
        C31091dS r1 = this.A08.A01.A06;
        return r1.A03 && r1.A05 > 0 && bool.booleanValue();
    }
}
