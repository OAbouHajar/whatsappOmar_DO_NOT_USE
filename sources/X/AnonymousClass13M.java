package X;

/* renamed from: X.13M  reason: invalid class name */
public class AnonymousClass13M implements C19420yP {
    public final AnonymousClass13E A00;
    public final C19220xx A01;

    public AnonymousClass13M(AnonymousClass13E r1, C19220xx r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public int[] ACW() {
        return new int[]{216};
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x021a A[LOOP:3: B:65:0x0214->B:67:0x021a, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AHS(android.os.Message r22, int r23) {
        /*
            r21 = this;
            r1 = 216(0xd8, float:3.03E-43)
            r0 = 0
            r2 = r23
            if (r2 != r1) goto L_0x023c
            r0 = r22
            java.lang.Object r0 = r0.obj
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x023b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x001d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r2 = r3.next()
            X.2Dw r2 = (X.C46352Dw) r2
            int r1 = r2.A01
            r0 = 100000000(0x5f5e100, float:2.3122341E-35)
            int r1 = r1 / r0
            if (r1 <= 0) goto L_0x0035
            r5.add(r2)
            goto L_0x001d
        L_0x0035:
            r6.add(r2)
            goto L_0x001d
        L_0x0039:
            r4 = r21
            X.0xx r3 = r4.A01
            java.lang.String r0 = "UserNoticeManager/onUserNoticeListReceived/serverUserNoticeList size: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r6.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.13F r2 = r3.A05
            java.util.TreeMap r8 = r2.A02()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r14 = r6.iterator()
        L_0x0061:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r10 = r14.next()
            X.2Dw r10 = (X.C46352Dw) r10
            int r0 = r10.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r11 = r8.get(r0)
            X.2Dw r11 = (X.C46352Dw) r11
            if (r11 != 0) goto L_0x0084
            java.lang.String r0 = "UserNoticeManager/getUpdatedUserNoticeList/new notice"
        L_0x007d:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7.add(r10)
            goto L_0x0061
        L_0x0084:
            int r9 = r11.A00
            int r13 = r10.A00
            java.lang.String r12 = " sever stage: "
            if (r9 >= r13) goto L_0x00a1
            java.lang.String r1 = "UserNoticeManager/getUpdatedUserNoticeList/client stage is stale. client stage: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            r0.append(r12)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            goto L_0x007d
        L_0x00a1:
            int r6 = r11.A02
            int r10 = r10.A02
            if (r6 >= r10) goto L_0x00d5
            java.lang.String r0 = "UserNoticeManager/getUpdatedUserNoticeList/new version available. client version: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = " sever version: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r6 = r11.A01
            long r0 = r11.A03
            X.2Dw r15 = new X.2Dw
            r17 = r9
            r18 = r10
            r19 = r0
            r16 = r6
            r15.<init>(r16, r17, r18, r19)
            r7.add(r15)
            goto L_0x0061
        L_0x00d5:
            java.lang.String r1 = "UserNoticeManager/getUpdatedUserNoticeList/server stage is same or stale. client stage: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            r0.append(r12)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7.add(r11)
            goto L_0x0061
        L_0x00f1:
            java.lang.String r0 = "UserNoticeManager/onUserNoticeListReceived/updatedUserNoticeList size: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r7.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.A04(r7)
            X.2Dw r10 = r2.A01()
            java.util.TreeMap r1 = r2.A02()
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x015b
            java.lang.String r0 = "UserNoticeManager/getUpdatedCurrentUserNotice/notice map empty"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x011c:
            r3.A03()
            r3.A05()
        L_0x0122:
            X.13E r6 = r4.A00
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r3 = r5.iterator()
        L_0x012d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x020c
            java.lang.Object r2 = r3.next()
            X.2Dw r2 = (X.C46352Dw) r2
            int r1 = r2.A01
            r0 = 100000000(0x5f5e100, float:2.3122341E-35)
            int r1 = r1 / r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r4.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0157
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r2)
            r4.put(r1, r0)
            goto L_0x012d
        L_0x0157:
            r0.add(r2)
            goto L_0x012d
        L_0x015b:
            java.lang.String r0 = "UserNoticeManager/getUpdatedCurrentUserNotice/found metadata"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Map$Entry r0 = r1.firstEntry()
            X.AnonymousClass00B.A06(r0)
            java.lang.Object r6 = r0.getValue()
            X.2Dw r6 = (X.C46352Dw) r6
            if (r6 == 0) goto L_0x011c
            r2.A03(r6)
            if (r10 == 0) goto L_0x01aa
            int r8 = r10.A01
            int r9 = r6.A01
            if (r8 != r9) goto L_0x0180
            int r1 = r10.A02
            int r0 = r6.A02
            if (r1 >= r0) goto L_0x01aa
        L_0x0180:
            java.lang.String r0 = "UserNoticeManager/deleteUserNoticeContentIfNecessary/notice mismatch: "
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r2 = 1
            r0 = 0
            if (r8 == r9) goto L_0x018c
            r0 = 1
        L_0x018c:
            r7.append(r0)
            java.lang.String r0 = " old version: "
            r7.append(r0)
            int r1 = r10.A02
            int r0 = r6.A02
            if (r1 < r0) goto L_0x019b
            r2 = 0
        L_0x019b:
            r7.append(r2)
            java.lang.String r0 = r7.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.13I r0 = r3.A04
            r0.A04(r8)
        L_0x01aa:
            X.13I r7 = r3.A04
            int r9 = r6.A02
            int r8 = r6.A01
            int r2 = r6.A00
            java.lang.String r0 = "UserNoticeContentManager/fetchUserNoticeContentIfNecessary/notice id "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r0 = " version: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " stage: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 5
            if (r2 != r0) goto L_0x01e4
            java.lang.String r0 = "UserNoticeContentManager/fetchUserNoticeContentIfNecessary/end stage, skip fetch"
        L_0x01d8:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x01db:
            X.1jo r0 = r7.A03(r6)
            r3.A07(r0, r6)
            goto L_0x0122
        L_0x01e4:
            X.0pd r1 = r7.A05
            boolean r0 = X.AnonymousClass2E5.A00(r1, r8)
            if (r0 == 0) goto L_0x01ef
            java.lang.String r0 = "UserNoticeContentManager/fetchUserNoticeContentIfNecessary/green alert disabled"
            goto L_0x01d8
        L_0x01ef:
            boolean r0 = X.AnonymousClass2E5.A01(r1, r6)
            if (r0 != 0) goto L_0x01db
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = "content.json"
            r2[r1] = r0
            boolean r0 = r7.A09(r2, r8)
            if (r0 != 0) goto L_0x01db
            java.lang.String r0 = "UserNoticeContentManager/fetchUserNoticeContentIfNecessary/content does not exist, fetch"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7.A05(r8)
            goto L_0x01db
        L_0x020c:
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x0214:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x023b
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Object r2 = r1.getValue()
            r0 = 29
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0
            r1.<init>((java.lang.Object) r6, (int) r3, (java.lang.Object) r2, (int) r0)
            X.1WA r0 = r6.A01
            r0.execute(r1)
            goto L_0x0214
        L_0x023b:
            r0 = 1
        L_0x023c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass13M.AHS(android.os.Message, int):boolean");
    }
}
