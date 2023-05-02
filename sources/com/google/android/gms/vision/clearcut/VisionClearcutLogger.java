package com.google.android.gms.vision.clearcut;

import X.C88354aM;
import android.content.Context;

public class VisionClearcutLogger {
    public final C88354aM zza;
    public boolean zzb = true;

    public VisionClearcutLogger(Context context) {
        this.zza = new C88354aM(context);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:156|157|(4:160|161|162|158)|260|168|(1:170)(2:174|(3:176|177|178))|171) */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        r10 = java.util.ServiceLoader.load(r10, r9).iterator();
        r9 = X.AnonymousClass000.A0u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x031d, code lost:
        if (r10.hasNext() != false) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0328, code lost:
        throw X.AnonymousClass000.A0W("zza");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x034d, code lost:
        if (r9.size() == 1) goto L_0x034f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x034f, code lost:
        r10 = (X.C90444e9) r9.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0355, code lost:
        X.C90444e9.A03 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0359, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x035e, code lost:
        if (r9.size() != 0) goto L_0x0360;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:?, code lost:
        r10 = (X.C90444e9) r3.getMethod("combine", new java.lang.Class[]{java.util.Collection.class}).invoke((java.lang.Object) null, new java.lang.Object[]{r9});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0209, code lost:
        if (r1 != false) goto L_0x020b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x030d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(int r21, X.C67233bD r22) {
        /*
            r20 = this;
            r4 = r22
            int r5 = r4.zzc     // Catch:{ IOException -> 0x0460 }
            r0 = -1
            if (r5 != r0) goto L_0x0011
            X.5TK r0 = X.AnonymousClass3K4.A0Q(r4)     // Catch:{ IOException -> 0x0460 }
            int r5 = r0.Aj1(r4)     // Catch:{ IOException -> 0x0460 }
            r4.zzc = r5     // Catch:{ IOException -> 0x0460 }
        L_0x0011:
            byte[] r2 = new byte[r5]     // Catch:{ IOException -> 0x0460 }
            X.1gX r3 = new X.1gX     // Catch:{ IOException -> 0x0460 }
            r3.<init>(r2, r5)     // Catch:{ IOException -> 0x0460 }
            X.4as r7 = X.C88654as.A02     // Catch:{ IOException -> 0x0460 }
            java.lang.Class r0 = r4.getClass()     // Catch:{ IOException -> 0x0460 }
            X.5TK r1 = r7.A00(r0)     // Catch:{ IOException -> 0x0460 }
            X.4sd r0 = r3.A01     // Catch:{ IOException -> 0x0460 }
            if (r0 != 0) goto L_0x002b
            X.4sd r0 = new X.4sd     // Catch:{ IOException -> 0x0460 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0460 }
        L_0x002b:
            r1.Aix(r0, r4)     // Catch:{ IOException -> 0x0460 }
            int r1 = r3.A02     // Catch:{ IOException -> 0x0460 }
            int r0 = r3.A00     // Catch:{ IOException -> 0x0460 }
            int r1 = r1 - r0
            if (r1 != 0) goto L_0x0459
            r1 = 1
            r4 = 0
            r6 = r21
            if (r21 < 0) goto L_0x0441
            r0 = 3
            if (r6 > r0) goto L_0x0441
            r3 = r20
            boolean r0 = r3.zzb     // Catch:{ Exception -> 0x03e6 }
            if (r0 == 0) goto L_0x0291
            X.4aM r0 = r3.zza     // Catch:{ Exception -> 0x03e6 }
            X.4Lb r5 = new X.4Lb     // Catch:{ Exception -> 0x03e6 }
            r5.<init>(r0, r2)     // Catch:{ Exception -> 0x03e6 }
            X.3Zc r8 = r5.A02     // Catch:{ Exception -> 0x03e6 }
            r8.A00 = r6     // Catch:{ Exception -> 0x03e6 }
            boolean r0 = r5.A01     // Catch:{ Exception -> 0x03e6 }
            if (r0 != 0) goto L_0x028a
            r5.A01 = r1     // Catch:{ Exception -> 0x03e6 }
            X.4aM r7 = r5.A03     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r3 = r7.A06     // Catch:{ Exception -> 0x03e6 }
            int r2 = r7.A01     // Catch:{ Exception -> 0x03e6 }
            r6 = 0
            X.43D r1 = r5.A00     // Catch:{ Exception -> 0x03e6 }
            X.3Y4 r0 = new X.3Y4     // Catch:{ Exception -> 0x03e6 }
            r0.<init>(r1, r3, r2)     // Catch:{ Exception -> 0x03e6 }
            r9 = 1
            X.3Y3 r5 = new X.3Y3     // Catch:{ Exception -> 0x03e6 }
            r5.<init>(r8, r0)     // Catch:{ Exception -> 0x03e6 }
            X.5Le r2 = r7.A03     // Catch:{ Exception -> 0x03e6 }
            X.4qc r2 = (X.C97814qc) r2     // Catch:{ Exception -> 0x03e6 }
            X.3Y4 r0 = r5.A00     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r3 = r0.A04     // Catch:{ Exception -> 0x03e6 }
            int r1 = r0.A02     // Catch:{ Exception -> 0x03e6 }
            X.3Zc r0 = r5.A08     // Catch:{ Exception -> 0x03e6 }
            if (r0 == 0) goto L_0x0084
            int r10 = r0.A00     // Catch:{ Exception -> 0x03e6 }
        L_0x0079:
            X.4eV r0 = X.C97814qc.A03     // Catch:{ Exception -> 0x03e6 }
            java.lang.Object r0 = r0.A03()     // Catch:{ Exception -> 0x03e6 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ Exception -> 0x03e6 }
            goto L_0x0086
        L_0x0084:
            r10 = 0
            goto L_0x0079
        L_0x0086:
            if (r0 != 0) goto L_0x008c
            if (r3 == 0) goto L_0x026b
            goto L_0x011c
        L_0x008c:
            if (r3 == 0) goto L_0x0095
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x03e6 }
            if (r0 != 0) goto L_0x0095
            goto L_0x009b
        L_0x0095:
            if (r1 < 0) goto L_0x0184
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x03e6 }
        L_0x009b:
            android.content.Context r8 = r2.A00     // Catch:{ Exception -> 0x03e6 }
            if (r8 != 0) goto L_0x00f5
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x03e6 }
        L_0x00a3:
            java.util.Iterator r19 = r0.iterator()     // Catch:{ Exception -> 0x03e6 }
        L_0x00a7:
            boolean r0 = r19.hasNext()     // Catch:{ Exception -> 0x03e6 }
            if (r0 == 0) goto L_0x0184
            java.lang.Object r11 = r19.next()     // Catch:{ Exception -> 0x03e6 }
            X.3ZQ r11 = (X.AnonymousClass3ZQ) r11     // Catch:{ Exception -> 0x03e6 }
            int r0 = r11.zzbb     // Catch:{ Exception -> 0x03e6 }
            r0 = r0 & 1
            if (r0 != r9) goto L_0x00bf
            int r0 = r11.zzya     // Catch:{ Exception -> 0x03e6 }
            if (r0 == 0) goto L_0x00bf
            if (r0 != r10) goto L_0x00a7
        L_0x00bf:
            java.lang.String r2 = r11.zzbis     // Catch:{ Exception -> 0x03e6 }
            long r0 = X.C97814qc.A01(r8)     // Catch:{ Exception -> 0x03e6 }
            long r17 = X.C97814qc.A02(r2, r0)     // Catch:{ Exception -> 0x03e6 }
            long r2 = r11.zzbit     // Catch:{ Exception -> 0x03e6 }
            long r0 = r11.zzbiu     // Catch:{ Exception -> 0x03e6 }
            r12 = 0
            int r11 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x00a7
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x00a7
            int r11 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x00de
            long r17 = r17 % r0
            goto L_0x00f0
        L_0x00de:
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r13 = r15 % r0
            r11 = 1
            long r13 = r13 + r11
            long r17 = r17 & r15
            long r17 = r17 % r0
            long r13 = r13 + r17
            long r17 = r13 % r0
        L_0x00f0:
            int r0 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x027a
            goto L_0x00a7
        L_0x00f5:
            java.util.concurrent.ConcurrentHashMap r12 = X.C97814qc.A08     // Catch:{ Exception -> 0x03e6 }
            java.lang.Object r11 = r12.get(r3)     // Catch:{ Exception -> 0x03e6 }
            X.4eV r11 = (X.C90644eV) r11     // Catch:{ Exception -> 0x03e6 }
            if (r11 != 0) goto L_0x0113
            X.4Jn r2 = X.C97814qc.A04     // Catch:{ Exception -> 0x03e6 }
            X.3ZN r1 = X.AnonymousClass3ZN.zzbir     // Catch:{ Exception -> 0x03e6 }
            X.5Lr r0 = X.C98184rE.A00     // Catch:{ Exception -> 0x03e6 }
            X.3Z0 r11 = new X.3Z0     // Catch:{ Exception -> 0x03e6 }
            r11.<init>(r0, r2, r1, r3)     // Catch:{ Exception -> 0x03e6 }
            java.lang.Object r0 = r12.putIfAbsent(r3, r11)     // Catch:{ Exception -> 0x03e6 }
            X.4eV r0 = (X.C90644eV) r0     // Catch:{ Exception -> 0x03e6 }
            if (r0 == 0) goto L_0x0113
            r11 = r0
        L_0x0113:
            java.lang.Object r0 = r11.A03()     // Catch:{ Exception -> 0x03e6 }
            X.3ZN r0 = (X.AnonymousClass3ZN) r0     // Catch:{ Exception -> 0x03e6 }
            X.5Ur r0 = r0.zzbiq     // Catch:{ Exception -> 0x03e6 }
            goto L_0x00a3
        L_0x011c:
            boolean r0 = r3.isEmpty()     // Catch:{ Exception -> 0x03e6 }
            if (r0 != 0) goto L_0x026b
        L_0x0122:
            android.content.Context r10 = r2.A00     // Catch:{ Exception -> 0x03e6 }
            if (r10 == 0) goto L_0x0184
            java.lang.Boolean r0 = X.C97814qc.A01     // Catch:{ Exception -> 0x03e6 }
            if (r0 != 0) goto L_0x0140
            X.0rR r0 = X.C15560rQ.A00(r10)     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r1 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            android.content.Context r0 = r0.A00     // Catch:{ Exception -> 0x03e6 }
            int r0 = r0.checkCallingOrSelfPermission(r1)     // Catch:{ Exception -> 0x03e6 }
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x03e6 }
            X.C97814qc.A01 = r0     // Catch:{ Exception -> 0x03e6 }
        L_0x0140:
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x03e6 }
            if (r0 == 0) goto L_0x0184
            java.util.HashMap r2 = X.C97814qc.A07     // Catch:{ Exception -> 0x03e6 }
            java.lang.Object r1 = r2.get(r3)     // Catch:{ Exception -> 0x03e6 }
            X.4eV r1 = (X.C90644eV) r1     // Catch:{ Exception -> 0x03e6 }
            if (r1 != 0) goto L_0x015a
            X.4Jn r0 = X.C97814qc.A05     // Catch:{ Exception -> 0x03e6 }
            X.3Yz r1 = new X.3Yz     // Catch:{ Exception -> 0x03e6 }
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x03e6 }
            r2.put(r3, r1)     // Catch:{ Exception -> 0x03e6 }
        L_0x015a:
            java.lang.Object r11 = r1.A03()     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x03e6 }
            if (r11 == 0) goto L_0x0184
            r0 = 44
            int r0 = r11.indexOf(r0)     // Catch:{ Exception -> 0x03e6 }
            r2 = 0
            if (r0 < 0) goto L_0x0267
            java.lang.String r13 = r11.substring(r4, r0)     // Catch:{ Exception -> 0x03e6 }
            int r2 = r0 + 1
        L_0x0171:
            r0 = 47
            int r1 = r11.indexOf(r0, r2)     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r8 = "LogSamplerImpl"
            if (r1 > 0) goto L_0x0195
            java.lang.String r0 = "Failed to parse the rule: "
            java.lang.String r0 = X.C13680ns.A0g(r11, r0)     // Catch:{ Exception -> 0x03e6 }
        L_0x0181:
            android.util.Log.e(r8, r0)     // Catch:{ Exception -> 0x03e6 }
        L_0x0184:
            X.5Lf r2 = r7.A04     // Catch:{ Exception -> 0x03e6 }
            X.3WV r2 = (X.AnonymousClass3WV) r2     // Catch:{ Exception -> 0x03e6 }
            X.21f r0 = r2.A05     // Catch:{ Exception -> 0x03e6 }
            X.3WZ r1 = new X.3WZ     // Catch:{ Exception -> 0x03e6 }
            r1.<init>(r5, r0)     // Catch:{ Exception -> 0x03e6 }
            r0 = 2
            r2.A02(r1, r0)     // Catch:{ Exception -> 0x03e6 }
            goto L_0x0273
        L_0x0195:
            java.lang.String r0 = r11.substring(r2, r1)     // Catch:{ NumberFormatException -> 0x025b }
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x025b }
            int r0 = r1 + 1
            java.lang.String r0 = r11.substring(r0)     // Catch:{ NumberFormatException -> 0x025b }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x025b }
            r14 = 0
            int r11 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r11 < 0) goto L_0x0242
            int r11 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r11 < 0) goto L_0x0242
            X.3ZQ r11 = X.AnonymousClass3ZQ.zzbiv     // Catch:{ Exception -> 0x03e6 }
            r8 = 5
            java.lang.Object r11 = r11.A07(r8)     // Catch:{ Exception -> 0x03e6 }
            X.3ZM r11 = (X.AnonymousClass3ZM) r11     // Catch:{ Exception -> 0x03e6 }
            X.3ZL r11 = (X.AnonymousClass3ZL) r11     // Catch:{ Exception -> 0x03e6 }
            r11.A00()     // Catch:{ Exception -> 0x03e6 }
            X.3Z1 r12 = r11.A00     // Catch:{ Exception -> 0x03e6 }
            X.3ZQ r12 = (X.AnonymousClass3ZQ) r12     // Catch:{ Exception -> 0x03e6 }
            int r8 = r12.zzbb     // Catch:{ Exception -> 0x03e6 }
            r8 = r8 | 2
            r12.zzbb = r8     // Catch:{ Exception -> 0x03e6 }
            r12.zzbis = r13     // Catch:{ Exception -> 0x03e6 }
            r11.A00()     // Catch:{ Exception -> 0x03e6 }
            X.3Z1 r12 = r11.A00     // Catch:{ Exception -> 0x03e6 }
            X.3ZQ r12 = (X.AnonymousClass3ZQ) r12     // Catch:{ Exception -> 0x03e6 }
            int r8 = r12.zzbb     // Catch:{ Exception -> 0x03e6 }
            r8 = r8 | 4
            r12.zzbb = r8     // Catch:{ Exception -> 0x03e6 }
            r12.zzbit = r2     // Catch:{ Exception -> 0x03e6 }
            r11.A00()     // Catch:{ Exception -> 0x03e6 }
            X.3Z1 r3 = r11.A00     // Catch:{ Exception -> 0x03e6 }
            X.3ZQ r3 = (X.AnonymousClass3ZQ) r3     // Catch:{ Exception -> 0x03e6 }
            int r2 = r3.zzbb     // Catch:{ Exception -> 0x03e6 }
            r2 = r2 | 8
            r3.zzbb = r2     // Catch:{ Exception -> 0x03e6 }
            r3.zzbiu = r0     // Catch:{ Exception -> 0x03e6 }
            X.5UZ r8 = r11.AjB()     // Catch:{ Exception -> 0x03e6 }
            X.3Z1 r8 = (X.AnonymousClass3Z1) r8     // Catch:{ Exception -> 0x03e6 }
            java.lang.Object r0 = r8.A07(r9)     // Catch:{ Exception -> 0x03e6 }
            java.lang.Byte r0 = (java.lang.Byte) r0     // Catch:{ Exception -> 0x03e6 }
            byte r0 = r0.byteValue()     // Catch:{ Exception -> 0x03e6 }
            if (r0 == r9) goto L_0x020b
            if (r0 == 0) goto L_0x0274
            X.1gd r0 = X.AnonymousClass3K3.A0Y(r8)     // Catch:{ Exception -> 0x03e6 }
            boolean r1 = r0.AjP(r8)     // Catch:{ Exception -> 0x03e6 }
            r0 = 2
            r8.A07(r0)     // Catch:{ Exception -> 0x03e6 }
            if (r1 == 0) goto L_0x0274
        L_0x020b:
            X.3ZQ r8 = (X.AnonymousClass3ZQ) r8     // Catch:{ Exception -> 0x03e6 }
            if (r8 == 0) goto L_0x0184
            java.lang.String r2 = r8.zzbis     // Catch:{ Exception -> 0x03e6 }
            long r0 = X.C97814qc.A01(r10)     // Catch:{ Exception -> 0x03e6 }
            long r14 = X.C97814qc.A02(r2, r0)     // Catch:{ Exception -> 0x03e6 }
            long r2 = r8.zzbit     // Catch:{ Exception -> 0x03e6 }
            long r0 = r8.zzbiu     // Catch:{ Exception -> 0x03e6 }
            r9 = 0
            int r8 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x0184
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0184
            int r8 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x022d
            long r14 = r14 % r0
            goto L_0x023c
        L_0x022d:
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r10 = r12 % r0
            r8 = 1
            long r10 = r10 + r8
            long r14 = r14 & r12
            long r14 = r14 % r0
            long r10 = r10 + r14
            long r14 = r10 % r0
        L_0x023c:
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x027a
            goto L_0x0184
        L_0x0242:
            r6 = 72
            java.lang.StringBuilder r9 = X.C13690nt.A0g(r6)     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r6 = "negative values not supported: "
            r9.append(r6)     // Catch:{ Exception -> 0x03e6 }
            r9.append(r2)     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r2 = "/"
            r9.append(r2)     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r0 = X.C13680ns.A0j(r9, r0)     // Catch:{ Exception -> 0x03e6 }
            goto L_0x0181
        L_0x025b:
            r1 = move-exception
            java.lang.String r0 = "parseLong() failed while parsing: "
            java.lang.String r0 = X.C13680ns.A0g(r11, r0)     // Catch:{ Exception -> 0x03e6 }
            android.util.Log.e(r8, r0, r1)     // Catch:{ Exception -> 0x03e6 }
            goto L_0x0184
        L_0x0267:
            java.lang.String r13 = ""
            goto L_0x0171
        L_0x026b:
            if (r1 < 0) goto L_0x0184
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x03e6 }
            goto L_0x0122
        L_0x0273:
            return
        L_0x0274:
            X.5Ag r0 = new X.5Ag     // Catch:{ Exception -> 0x03e6 }
            r0.<init>()     // Catch:{ Exception -> 0x03e6 }
            throw r0     // Catch:{ Exception -> 0x03e6 }
        L_0x027a:
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.A09     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r0 = "Result must not be null"
            X.C13710nw.A02(r1, r0)     // Catch:{ Exception -> 0x03e6 }
            X.3Wa r0 = new X.3Wa     // Catch:{ Exception -> 0x03e6 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x03e6 }
            r0.setResult(r1)     // Catch:{ Exception -> 0x03e6 }
            return
        L_0x028a:
            java.lang.String r0 = "do not reuse LogEventBuilder"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ Exception -> 0x03e6 }
            throw r0     // Catch:{ Exception -> 0x03e6 }
        L_0x0291:
            X.3bD r0 = X.C67233bD.zzi     // Catch:{ Exception -> 0x03e6 }
            X.3b3 r0 = X.C67293bJ.A00(r0)     // Catch:{ Exception -> 0x03e6 }
            X.3b2 r0 = (X.C67123b2) r0     // Catch:{ Exception -> 0x03e6 }
            java.lang.Class<X.4e9> r3 = X.C90444e9.class
            X.4e9 r10 = X.C90444e9.A03     // Catch:{ Exception -> 0x03dd }
            if (r10 != 0) goto L_0x038f
            monitor-enter(r3)     // Catch:{ Exception -> 0x03dd }
            X.4e9 r10 = X.C90444e9.A03     // Catch:{ all -> 0x038c }
            if (r10 != 0) goto L_0x0357
            java.lang.Class<X.4YQ> r10 = X.AnonymousClass4YQ.class
            java.lang.ClassLoader r9 = r10.getClassLoader()     // Catch:{ all -> 0x038c }
            boolean r6 = r3.equals(r3)     // Catch:{ all -> 0x038c }
            if (r6 == 0) goto L_0x02b3
            java.lang.String r6 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader"
            goto L_0x02db
        L_0x02b3:
            java.lang.Package r8 = r3.getPackage()     // Catch:{ all -> 0x038c }
            java.lang.Package r6 = r10.getPackage()     // Catch:{ all -> 0x038c }
            boolean r6 = r8.equals(r6)     // Catch:{ all -> 0x038c }
            if (r6 == 0) goto L_0x0340
            java.lang.Object[] r8 = X.C13690nt.A1Z()     // Catch:{ all -> 0x038c }
            java.lang.Package r6 = r3.getPackage()     // Catch:{ all -> 0x038c }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x038c }
            r8[r4] = r6     // Catch:{ all -> 0x038c }
            java.lang.String r6 = r3.getSimpleName()     // Catch:{ all -> 0x038c }
            r8[r1] = r6     // Catch:{ all -> 0x038c }
            java.lang.String r6 = "%s.BlazeGenerated%sLoader"
            java.lang.String r6 = java.lang.String.format(r6, r8)     // Catch:{ all -> 0x038c }
        L_0x02db:
            java.lang.Class r8 = java.lang.Class.forName(r6, r1, r9)     // Catch:{ ClassNotFoundException -> 0x030d }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x02ff, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02f1, InvocationTargetException -> 0x0306 }
            java.lang.reflect.Constructor r8 = r8.getConstructor(r6)     // Catch:{ NoSuchMethodException -> 0x02ff, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02f1, InvocationTargetException -> 0x0306 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x02ff, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02f1, InvocationTargetException -> 0x0306 }
            r8.newInstance(r6)     // Catch:{ NoSuchMethodException -> 0x02ff, InstantiationException -> 0x02f8, IllegalAccessException -> 0x02f1, InvocationTargetException -> 0x0306 }
            java.lang.String r6 = "zza"
            java.lang.NullPointerException r6 = X.AnonymousClass000.A0W(r6)     // Catch:{ ClassNotFoundException -> 0x030d }
            throw r6     // Catch:{ ClassNotFoundException -> 0x030d }
        L_0x02f1:
            r6 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x030d }
            r8.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x030d }
            goto L_0x030c
        L_0x02f8:
            r6 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x030d }
            r8.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x030d }
            goto L_0x030c
        L_0x02ff:
            r6 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x030d }
            r8.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x030d }
            goto L_0x030c
        L_0x0306:
            r6 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x030d }
            r8.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x030d }
        L_0x030c:
            throw r8     // Catch:{ ClassNotFoundException -> 0x030d }
        L_0x030d:
            java.util.ServiceLoader r6 = java.util.ServiceLoader.load(r10, r9)     // Catch:{ all -> 0x038c }
            java.util.Iterator r10 = r6.iterator()     // Catch:{ all -> 0x038c }
            java.util.ArrayList r9 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x038c }
        L_0x0319:
            boolean r6 = r10.hasNext()     // Catch:{ all -> 0x038c }
            if (r6 == 0) goto L_0x0349
            r10.next()     // Catch:{ ServiceConfigurationError -> 0x0329 }
            java.lang.String r6 = "zza"
            java.lang.NullPointerException r6 = X.AnonymousClass000.A0W(r6)     // Catch:{ ServiceConfigurationError -> 0x0329 }
            throw r6     // Catch:{ ServiceConfigurationError -> 0x0329 }
        L_0x0329:
            r16 = move-exception
            java.util.logging.Logger r11 = X.AnonymousClass4YQ.A00     // Catch:{ all -> 0x038c }
            java.util.logging.Level r12 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x038c }
            java.lang.String r8 = "Unable to load "
            java.lang.String r6 = r3.getSimpleName()     // Catch:{ all -> 0x038c }
            java.lang.String r15 = X.C13680ns.A0g(r6, r8)     // Catch:{ all -> 0x038c }
            java.lang.String r13 = "com.google.protobuf.GeneratedExtensionRegistryLoader"
            java.lang.String r14 = "load"
            r11.logp(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x038c }
            goto L_0x0319
        L_0x0340:
            java.lang.String r0 = r3.getName()     // Catch:{ all -> 0x038c }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)     // Catch:{ all -> 0x038c }
            throw r0     // Catch:{ all -> 0x038c }
        L_0x0349:
            int r6 = r9.size()     // Catch:{ all -> 0x038c }
            if (r6 != r1) goto L_0x0359
            java.lang.Object r10 = r9.get(r4)     // Catch:{ all -> 0x038c }
            X.4e9 r10 = (X.C90444e9) r10     // Catch:{ all -> 0x038c }
        L_0x0355:
            X.C90444e9.A03 = r10     // Catch:{ all -> 0x038c }
        L_0x0357:
            monitor-exit(r3)     // Catch:{ all -> 0x038c }
            goto L_0x038f
        L_0x0359:
            int r6 = r9.size()     // Catch:{ all -> 0x038c }
            r10 = 0
            if (r6 == 0) goto L_0x0355
            java.lang.String r11 = "combine"
            java.lang.Class[] r8 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0385, IllegalAccessException -> 0x037e, InvocationTargetException -> 0x0377 }
            java.lang.Class<java.util.Collection> r6 = java.util.Collection.class
            r8[r4] = r6     // Catch:{ NoSuchMethodException -> 0x0385, IllegalAccessException -> 0x037e, InvocationTargetException -> 0x0377 }
            java.lang.reflect.Method r8 = r3.getMethod(r11, r8)     // Catch:{ NoSuchMethodException -> 0x0385, IllegalAccessException -> 0x037e, InvocationTargetException -> 0x0377 }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x0385, IllegalAccessException -> 0x037e, InvocationTargetException -> 0x0377 }
            r6[r4] = r9     // Catch:{ NoSuchMethodException -> 0x0385, IllegalAccessException -> 0x037e, InvocationTargetException -> 0x0377 }
            java.lang.Object r10 = r8.invoke(r10, r6)     // Catch:{ NoSuchMethodException -> 0x0385, IllegalAccessException -> 0x037e, InvocationTargetException -> 0x0377 }
            X.4e9 r10 = (X.C90444e9) r10     // Catch:{ NoSuchMethodException -> 0x0385, IllegalAccessException -> 0x037e, InvocationTargetException -> 0x0377 }
            goto L_0x0355
        L_0x0377:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x038c }
            r0.<init>(r1)     // Catch:{ all -> 0x038c }
            throw r0     // Catch:{ all -> 0x038c }
        L_0x037e:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x038c }
            r0.<init>(r1)     // Catch:{ all -> 0x038c }
            throw r0     // Catch:{ all -> 0x038c }
        L_0x0385:
            r1 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x038c }
            r0.<init>(r1)     // Catch:{ all -> 0x038c }
            throw r0     // Catch:{ all -> 0x038c }
        L_0x038c:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x038c }
            goto L_0x03d2
        L_0x038f:
            boolean r3 = r0.A01     // Catch:{ Exception -> 0x03dd }
            if (r3 == 0) goto L_0x0398
            r0.A02()     // Catch:{ Exception -> 0x03dd }
            r0.A01 = r4     // Catch:{ Exception -> 0x03dd }
        L_0x0398:
            X.3bJ r3 = r0.A00     // Catch:{ 40H -> 0x03d3, IndexOutOfBoundsException -> 0x03d5, IOException -> 0x03ca }
            java.lang.Class r3 = r3.getClass()     // Catch:{ 40H -> 0x03d3, IndexOutOfBoundsException -> 0x03d5, IOException -> 0x03ca }
            X.5TK r6 = r7.A00(r3)     // Catch:{ 40H -> 0x03d3, IndexOutOfBoundsException -> 0x03d5, IOException -> 0x03ca }
            X.3bJ r8 = r0.A00     // Catch:{ 40H -> 0x03d3, IndexOutOfBoundsException -> 0x03d5, IOException -> 0x03ca }
            X.4a4 r7 = new X.4a4     // Catch:{ 40H -> 0x03d3, IndexOutOfBoundsException -> 0x03d5, IOException -> 0x03ca }
            r7.<init>(r10)     // Catch:{ 40H -> 0x03d3, IndexOutOfBoundsException -> 0x03d5, IOException -> 0x03ca }
            r10 = 0
            r11 = r5
            r9 = r2
            r6.Aiy(r7, r8, r9, r10, r11)     // Catch:{ 40H -> 0x03d3, IndexOutOfBoundsException -> 0x03d5, IOException -> 0x03ca }
            java.lang.String r3 = "Would have logged:\n%s"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x03dd }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x03dd }
            r2[r4] = r0     // Catch:{ Exception -> 0x03dd }
            java.lang.String r1 = "Vision"
            r0 = 6
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ Exception -> 0x03dd }
            if (r0 == 0) goto L_0x0458
            java.lang.String r0 = java.lang.String.format(r3, r2)     // Catch:{ Exception -> 0x03dd }
            android.util.Log.e(r1, r0)     // Catch:{ Exception -> 0x03dd }
            return
        L_0x03ca:
            r1 = move-exception
            java.lang.String r0 = "Reading from byte array should not throw IOException."
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x03dd }
            r2.<init>(r0, r1)     // Catch:{ Exception -> 0x03dd }
        L_0x03d2:
            throw r2     // Catch:{ Exception -> 0x03dd }
        L_0x03d3:
            r1 = move-exception
            goto L_0x03dc
        L_0x03d5:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.40H r1 = new X.40H     // Catch:{ Exception -> 0x03dd }
            r1.<init>(r0)     // Catch:{ Exception -> 0x03dd }
        L_0x03dc:
            throw r1     // Catch:{ Exception -> 0x03dd }
        L_0x03dd:
            r2 = move-exception
            java.lang.String r1 = "Parsing error"
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x03e6 }
            X.AnonymousClass45N.A00(r1, r2, r0)     // Catch:{ Exception -> 0x03e6 }
            return
        L_0x03e6:
            r6 = move-exception
            X.4PM r1 = X.C815848y.A00
            boolean r0 = r1 instanceof X.C66853ab
            if (r0 != 0) goto L_0x0436
            boolean r0 = r1 instanceof X.C66863ac
            if (r0 == 0) goto L_0x0436
            X.3ac r1 = (X.C66863ac) r1
            r6.printStackTrace()
            X.4GX r3 = r1.A00
            java.lang.ref.ReferenceQueue r2 = r3.A00
        L_0x03fa:
            java.lang.ref.Reference r1 = r2.poll()
            if (r1 == 0) goto L_0x0406
            java.util.concurrent.ConcurrentHashMap r0 = r3.A01
            r0.remove(r1)
            goto L_0x03fa
        L_0x0406:
            X.5BE r1 = new X.5BE
            r1.<init>(r6)
            java.util.concurrent.ConcurrentHashMap r0 = r3.A01
            java.lang.Object r5 = r0.get(r1)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0439
            monitor-enter(r5)
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x0433 }
        L_0x041a:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0433 }
            if (r0 == 0) goto L_0x0431
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0433 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0433 }
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ all -> 0x0433 }
            java.lang.String r0 = "Suppressed: "
            r1.print(r0)     // Catch:{ all -> 0x0433 }
            r2.printStackTrace()     // Catch:{ all -> 0x0433 }
            goto L_0x041a
        L_0x0431:
            monitor-exit(r5)     // Catch:{ all -> 0x0433 }
            goto L_0x0439
        L_0x0433:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0433 }
            throw r0
        L_0x0436:
            r6.printStackTrace()
        L_0x0439:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "Failed to log"
            X.AnonymousClass45N.A00(r0, r6, r1)
            return
        L_0x0441:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            X.AnonymousClass000.A1M(r3, r6, r4)
            java.lang.String r2 = "Illegal event code: %d"
            java.lang.String r1 = "Vision"
            r0 = 4
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x0458
            java.lang.String r0 = java.lang.String.format(r2, r3)
            android.util.Log.i(r1, r0)
        L_0x0458:
            return
        L_0x0459:
            java.lang.String r0 = "Did not write as much data as expected."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ IOException -> 0x0460 }
            throw r0     // Catch:{ IOException -> 0x0460 }
        L_0x0460:
            r2 = move-exception
            java.lang.String r0 = "byte array"
            java.lang.StringBuilder r1 = X.AnonymousClass3K2.A0o(r4, r0)
            java.lang.String r0 = " threw an IOException (should never happen)."
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.clearcut.VisionClearcutLogger.zza(int, X.3bD):void");
    }
}
