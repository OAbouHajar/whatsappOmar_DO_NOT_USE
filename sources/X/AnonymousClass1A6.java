package X;

import java.util.Set;

/* renamed from: X.1A6  reason: invalid class name */
public class AnonymousClass1A6 {
    public final C19080xj A00;
    public final C18380wb A01;
    public final C16440t3 A02;
    public final C15860rz A03;
    public final C14710pd A04;
    public final C16490t9 A05;
    public final C229219u A06;
    public final C229419w A07;
    public final C229319v A08;
    public final C229519x A09;
    public final C229619y A0A;
    public final Set A0B;
    public final Set A0C;

    public AnonymousClass1A6(C19080xj r1, C18380wb r2, C16440t3 r3, C15860rz r4, C14710pd r5, C16490t9 r6, C229219u r7, C229419w r8, C229319v r9, C229519x r10, C229619y r11, Set set, Set set2) {
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r1;
        this.A06 = r7;
        this.A08 = r9;
        this.A07 = r8;
        this.A09 = r10;
        this.A01 = r2;
        this.A03 = r4;
        this.A0C = set;
        this.A0A = r11;
        this.A0B = set2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0106 A[Catch:{ NumberFormatException -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0114 A[Catch:{ NumberFormatException -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01ba A[Catch:{ NumberFormatException -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01dd A[Catch:{ NumberFormatException -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01ef A[Catch:{ NumberFormatException -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01f0 A[Catch:{ NumberFormatException -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02b3 A[Catch:{ NumberFormatException -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02ca A[Catch:{ NumberFormatException -> 0x023d }, LOOP:1: B:79:0x02c4->B:81:0x02ca, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02e4 A[Catch:{ NumberFormatException -> 0x023d }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0303 A[Catch:{ NumberFormatException -> 0x023d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A00(java.lang.Integer r28, java.lang.Integer r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, boolean r41) {
        /*
            r27 = this;
            r4 = r27
            monitor-enter(r4)
            X.0t3 r0 = r4.A02     // Catch:{ all -> 0x0330 }
            long r21 = r0.A00()     // Catch:{ all -> 0x0330 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0330 }
            r1.<init>()     // Catch:{ all -> 0x0330 }
            r11 = r40
            if (r40 == 0) goto L_0x0013
            goto L_0x0016
        L_0x0013:
            java.lang.String r0 = "GCM"
            goto L_0x0018
        L_0x0016:
            java.lang.String r0 = "FBNS"
        L_0x0018:
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = " push received; id="
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            r9 = r30
            r1.append(r9)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "; ip="
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            r26 = r31
            r0 = r26
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "; sessionId = "
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            r25 = r32
            r0 = r25
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "; mmsOverride="
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            r8 = r33
            r1.append(r8)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "; fbips="
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            r7 = r34
            r1.append(r7)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "; notifyOnFailure="
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            r5 = r41
            r1.append(r5)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "; routingInfo="
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            r24 = r35
            r0 = r24
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "; pushTs="
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            r13 = r38
            r1.append(r13)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "; pushTransport="
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            r1.append(r11)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "; originalPriority="
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            r15 = r28
            r1.append(r15)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "; deliveredPriority="
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            r14 = r29
            r1.append(r14)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "; pushNonce is empty="
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            r6 = r39
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0330 }
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0330 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0330 }
            r0 = -1
            long r2 = X.C29501aj.A01(r13, r0)     // Catch:{ all -> 0x0330 }
            r10 = 1
            if (r11 != r10) goto L_0x00b9
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x032e
            X.19w r10 = r4.A07     // Catch:{ all -> 0x0330 }
            boolean r10 = r10.A01()     // Catch:{ all -> 0x0330 }
            if (r10 != 0) goto L_0x00b9
            goto L_0x032e
        L_0x00b9:
            r23 = r36
            boolean r10 = android.text.TextUtils.isEmpty(r23)     // Catch:{ all -> 0x0330 }
            if (r10 != 0) goto L_0x0107
            r20 = r37
            boolean r10 = android.text.TextUtils.isEmpty(r20)     // Catch:{ all -> 0x0330 }
            if (r10 != 0) goto L_0x0107
            r16 = -1
            X.3rx r12 = new X.3rx     // Catch:{ all -> 0x0330 }
            r12.<init>()     // Catch:{ all -> 0x0330 }
            long r18 = X.C29501aj.A01(r13, r0)     // Catch:{ all -> 0x0330 }
            int r10 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x00f3
            r10 = r23
            r12.A04 = r10     // Catch:{ all -> 0x0330 }
            r10 = r20
            r12.A03 = r10     // Catch:{ all -> 0x0330 }
            java.lang.Long r10 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0330 }
            r12.A02 = r10     // Catch:{ all -> 0x0330 }
            java.lang.Long r10 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0330 }
            r12.A01 = r10     // Catch:{ all -> 0x0330 }
            r12.A00 = r14     // Catch:{ all -> 0x0330 }
            X.0t9 r10 = r4.A05     // Catch:{ all -> 0x0330 }
            r10.A06(r12)     // Catch:{ all -> 0x0330 }
        L_0x00f3:
            X.0xj r10 = r4.A00     // Catch:{ all -> 0x0330 }
            java.util.concurrent.atomic.AtomicInteger r10 = r10.A03     // Catch:{ all -> 0x0330 }
            r10.getAndIncrement()     // Catch:{ all -> 0x0330 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0330 }
            boolean r12 = android.text.TextUtils.isEmpty(r25)     // Catch:{ all -> 0x0330 }
            r20 = 0
            if (r12 != 0) goto L_0x010c
            goto L_0x010a
        L_0x0107:
            r16 = -1
            goto L_0x00f3
        L_0x010a:
            r20 = 1
        L_0x010c:
            long r18 = X.C29501aj.A01(r13, r0)     // Catch:{ all -> 0x0330 }
            int r12 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r12 == 0) goto L_0x0167
            X.3sS r1 = new X.3sS     // Catch:{ all -> 0x0330 }
            r1.<init>()     // Catch:{ all -> 0x0330 }
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x0330 }
            r1.A07 = r0     // Catch:{ all -> 0x0330 }
            r1.A04 = r15     // Catch:{ all -> 0x0330 }
            r1.A03 = r14     // Catch:{ all -> 0x0330 }
            long r21 = r21 - r18
            java.lang.Long r0 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0330 }
            r1.A06 = r0     // Catch:{ all -> 0x0330 }
            r1.A05 = r10     // Catch:{ all -> 0x0330 }
            X.0rz r0 = r4.A03     // Catch:{ all -> 0x0330 }
            X.01D r10 = r0.A01     // Catch:{ all -> 0x0330 }
            java.lang.Object r12 = r10.get()     // Catch:{ all -> 0x0330 }
            android.content.SharedPreferences r12 = (android.content.SharedPreferences) r12     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "c2dm_reg_id"
            boolean r0 = r12.contains(r0)     // Catch:{ all -> 0x0330 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0330 }
            r1.A01 = r0     // Catch:{ all -> 0x0330 }
            java.lang.Object r12 = r10.get()     // Catch:{ all -> 0x0330 }
            android.content.SharedPreferences r12 = (android.content.SharedPreferences) r12     // Catch:{ all -> 0x0330 }
            java.lang.String r10 = "fbns_token"
            r0 = 0
            java.lang.String r0 = r12.getString(r10, r0)     // Catch:{ all -> 0x0330 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0330 }
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0330 }
            r1.A00 = r0     // Catch:{ all -> 0x0330 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r20)     // Catch:{ all -> 0x0330 }
            r1.A02 = r0     // Catch:{ all -> 0x0330 }
            X.0t9 r0 = r4.A05     // Catch:{ all -> 0x0330 }
            r0.A06(r1)     // Catch:{ all -> 0x0330 }
        L_0x0167:
            X.0rz r10 = r4.A03     // Catch:{ all -> 0x0330 }
            r1 = -1
            X.01D r0 = r10.A01     // Catch:{ all -> 0x0330 }
            r20 = r0
            java.lang.Object r0 = r20.get()     // Catch:{ all -> 0x0330 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x0330 }
            java.lang.String r14 = "push:recent_push_transport"
            int r13 = r0.getInt(r14, r1)     // Catch:{ all -> 0x0330 }
            r0 = 0
            java.lang.Object r15 = r20.get()     // Catch:{ all -> 0x0330 }
            android.content.SharedPreferences r15 = (android.content.SharedPreferences) r15     // Catch:{ all -> 0x0330 }
            java.lang.String r12 = "push:recent_push_ts"
            long r18 = r15.getLong(r12, r0)     // Catch:{ all -> 0x0330 }
            int r15 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r15 == 0) goto L_0x018e
            goto L_0x0324
        L_0x018e:
            java.lang.Object r0 = r20.get()     // Catch:{ all -> 0x0330 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x0330 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0330 }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r14, r11)     // Catch:{ all -> 0x0330 }
            r0.apply()     // Catch:{ all -> 0x0330 }
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x01b8
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b8
            java.lang.Object r0 = r20.get()     // Catch:{ all -> 0x0330 }
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0     // Catch:{ all -> 0x0330 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0330 }
            android.content.SharedPreferences$Editor r0 = r0.putLong(r12, r2)     // Catch:{ all -> 0x0330 }
            r0.apply()     // Catch:{ all -> 0x0330 }
        L_0x01b8:
            if (r40 != 0) goto L_0x01d3
            r11 = 0
            android.content.SharedPreferences$Editor r1 = r10.A0K()     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "logins_with_messages"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r11)     // Catch:{ all -> 0x0330 }
            r0.apply()     // Catch:{ all -> 0x0330 }
            X.19v r11 = r4.A08     // Catch:{ all -> 0x0330 }
            r0 = 1
            r11.A01 = r0     // Catch:{ all -> 0x0330 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0330 }
            r11.A00 = r0     // Catch:{ all -> 0x0330 }
        L_0x01d3:
            java.lang.String r0 = "CLEAR"
            boolean r0 = r0.equalsIgnoreCase(r8)     // Catch:{ all -> 0x0330 }
            r18 = 0
            if (r0 == 0) goto L_0x01f0
            android.content.SharedPreferences$Editor r1 = r10.A0K()     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "mms_authority_override"
            r1.remove(r0)     // Catch:{ all -> 0x0330 }
            r1.apply()     // Catch:{ all -> 0x0330 }
        L_0x01e9:
            boolean r0 = android.text.TextUtils.isEmpty(r24)     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x02b1
            goto L_0x0268
        L_0x01f0:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x01e9
            java.lang.String r0 = "\\|"
            r1 = 3
            java.lang.String[] r12 = r8.split(r0, r1)     // Catch:{ all -> 0x0330 }
            int r0 = r12.length     // Catch:{ all -> 0x0330 }
            if (r0 != r1) goto L_0x0253
            r0 = 1
            r0 = r12[r0]     // Catch:{ NumberFormatException -> 0x023d }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x023d }
            r11 = 2
            r11 = r12[r11]     // Catch:{ NumberFormatException -> 0x023d }
            long r13 = java.lang.Long.parseLong(r11)     // Catch:{ NumberFormatException -> 0x023d }
            long r0 = r0 + r13
            r13 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r13
            r11 = 0
            r14 = r12[r11]     // Catch:{ NumberFormatException -> 0x023d }
            android.content.SharedPreferences$Editor r13 = r10.A0K()     // Catch:{ NumberFormatException -> 0x023d }
            java.lang.String r12 = "mms_authority_override"
            if (r14 == 0) goto L_0x0239
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x023d }
            r11.<init>()     // Catch:{ NumberFormatException -> 0x023d }
            r11.append(r14)     // Catch:{ NumberFormatException -> 0x023d }
            java.lang.String r10 = "|"
            r11.append(r10)     // Catch:{ NumberFormatException -> 0x023d }
            r11.append(r0)     // Catch:{ NumberFormatException -> 0x023d }
            java.lang.String r0 = r11.toString()     // Catch:{ NumberFormatException -> 0x023d }
            r13.putString(r12, r0)     // Catch:{ NumberFormatException -> 0x023d }
        L_0x0235:
            r13.apply()     // Catch:{ NumberFormatException -> 0x023d }
            goto L_0x01e9
        L_0x0239:
            r13.remove(r12)     // Catch:{ NumberFormatException -> 0x023d }
            goto L_0x0235
        L_0x023d:
            r10 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0330 }
            r1.<init>()     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "c2dm/mms_override/invalid_numbers:"
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            r1.append(r8)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0330 }
            com.whatsapp.util.Log.w(r0, r10)     // Catch:{ all -> 0x0330 }
            goto L_0x01e9
        L_0x0253:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0330 }
            r1.<init>()     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "c2dm/mms_override/invalid_override:"
            r1.append(r0)     // Catch:{ all -> 0x0330 }
            r1.append(r8)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0330 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0330 }
            goto L_0x01e9
        L_0x0268:
            X.19x r12 = r4.A09     // Catch:{ IOException -> 0x02ab, IllegalArgumentException -> 0x02a4 }
            char[] r11 = r24.toCharArray()     // Catch:{ IOException -> 0x02ab, IllegalArgumentException -> 0x02a4 }
            int r10 = r11.length     // Catch:{ IOException -> 0x02ab, IllegalArgumentException -> 0x02a4 }
            r0 = r10 & 1
            if (r0 != 0) goto L_0x029c
            int r0 = r10 >> 1
            byte[] r8 = new byte[r0]     // Catch:{ IOException -> 0x02ab, IllegalArgumentException -> 0x02a4 }
            r1 = 0
            r15 = 0
        L_0x0279:
            if (r1 >= r10) goto L_0x0298
            char r0 = r11[r1]     // Catch:{ IOException -> 0x02ab, IllegalArgumentException -> 0x02a4 }
            r14 = 16
            int r0 = java.lang.Character.digit(r0, r14)     // Catch:{ IOException -> 0x02ab, IllegalArgumentException -> 0x02a4 }
            int r13 = r0 << 4
            int r1 = r1 + 1
            char r0 = r11[r1]     // Catch:{ IOException -> 0x02ab, IllegalArgumentException -> 0x02a4 }
            int r0 = java.lang.Character.digit(r0, r14)     // Catch:{ IOException -> 0x02ab, IllegalArgumentException -> 0x02a4 }
            r13 = r13 | r0
            int r1 = r1 + 1
            r0 = r13 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0     // Catch:{ IOException -> 0x02ab, IllegalArgumentException -> 0x02a4 }
            r8[r15] = r0     // Catch:{ IOException -> 0x02ab, IllegalArgumentException -> 0x02a4 }
            int r15 = r15 + 1
            goto L_0x0279
        L_0x0298:
            r12.A00(r8)     // Catch:{ IOException -> 0x02ab, IllegalArgumentException -> 0x02a4 }
            goto L_0x02b1
        L_0x029c:
            java.lang.String r1 = "Odd number of characters."
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x02ab, IllegalArgumentException -> 0x02a4 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x02ab, IllegalArgumentException -> 0x02a4 }
            throw r0     // Catch:{ IOException -> 0x02ab, IllegalArgumentException -> 0x02a4 }
        L_0x02a4:
            r1 = move-exception
            java.lang.String r0 = "GcmListenerService/handleGcmPush/routingInfo/failed to save edgeRoutingRoutingInfo, routing info is too big"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0330 }
            goto L_0x02b1
        L_0x02ab:
            r1 = move-exception
            java.lang.String r0 = "GcmListenerService/handleGcmPush/routingInfo/failed to parse edgeRoutingRoutingInfo"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0330 }
        L_0x02b1:
            if (r34 == 0) goto L_0x02be
            X.19u r1 = r4.A06     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r7.split(r0)     // Catch:{ all -> 0x0330 }
            r1.A01(r0)     // Catch:{ all -> 0x0330 }
        L_0x02be:
            java.util.Set r0 = r4.A0B     // Catch:{ all -> 0x0330 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0330 }
        L_0x02c4:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x02d8
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x0330 }
            X.1A5 r7 = (X.AnonymousClass1A5) r7     // Catch:{ all -> 0x0330 }
            r1 = r26
            r0 = r25
            r7.A00(r1, r0, r5)     // Catch:{ all -> 0x0330 }
            goto L_0x02c4
        L_0x02d8:
            java.util.Set r0 = r4.A0C     // Catch:{ all -> 0x0330 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0330 }
        L_0x02de:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x02ff
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x0330 }
            X.1A0 r1 = (X.AnonymousClass1A0) r1     // Catch:{ all -> 0x0330 }
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x02fc
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0330 }
        L_0x02f2:
            boolean r0 = r1.AfF(r0, r9)     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x02de
            r1.AHM(r9)     // Catch:{ all -> 0x0330 }
            goto L_0x02de
        L_0x02fc:
            r0 = r18
            goto L_0x02f2
        L_0x02ff:
            boolean r0 = X.C804844a.A00     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x0310
            X.0wb r2 = r4.A01     // Catch:{ all -> 0x0330 }
            java.lang.String r1 = "start_foreground_service_from_push"
            X.10g r0 = new X.10g     // Catch:{ all -> 0x0330 }
            r0.<init>(r1)     // Catch:{ all -> 0x0330 }
            r2.A00(r0)     // Catch:{ all -> 0x0330 }
        L_0x0310:
            if (r39 == 0) goto L_0x032e
            X.0pd r2 = r4.A04     // Catch:{ all -> 0x0330 }
            r1 = 1465(0x5b9, float:2.053E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x0330 }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x032e
            X.19y r0 = r4.A0A     // Catch:{ all -> 0x0330 }
            r0.A00(r6)     // Catch:{ all -> 0x0330 }
            goto L_0x032e
        L_0x0324:
            int r15 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x018e
            int r0 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x018e
            if (r13 == r11) goto L_0x018e
        L_0x032e:
            monitor-exit(r4)
            return
        L_0x0330:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1A6.A00(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean):void");
    }
}
