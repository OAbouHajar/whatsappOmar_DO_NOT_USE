package X;

/* renamed from: X.1hR  reason: invalid class name and case insensitive filesystem */
public class C32891hR {
    public AnonymousClass4LM A00;
    public AnonymousClass4JO A01;
    public boolean A02;
    public boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = (int[]) r0.get("trace_config.duration_condition");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32891hR(X.C32841hK r8) {
        /*
            r7 = this;
            r7.<init>()
            r5 = 1
            X.1hN r6 = r8.A08     // Catch:{ IllegalArgumentException -> 0x0060 }
            java.lang.String r1 = "trace_config.duration_condition"
            java.util.TreeMap r0 = r6.A01     // Catch:{ IllegalArgumentException -> 0x0060 }
            if (r0 == 0) goto L_0x003c
            java.lang.Object r1 = r0.get(r1)     // Catch:{ IllegalArgumentException -> 0x0060 }
            int[] r1 = (int[]) r1     // Catch:{ IllegalArgumentException -> 0x0060 }
            if (r1 == 0) goto L_0x003c
            int r0 = r1.length     // Catch:{ IllegalArgumentException -> 0x0060 }
            if (r0 <= 0) goto L_0x003c
            X.4JO r0 = new X.4JO     // Catch:{ IllegalArgumentException -> 0x0060 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0060 }
        L_0x001d:
            r7.A01 = r0     // Catch:{ IllegalArgumentException -> 0x0060 }
            java.lang.String r1 = "trace_config.string_list_condition"
            java.util.TreeMap r0 = r6.A03     // Catch:{ IllegalArgumentException -> 0x0060 }
            r4 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r0.get(r1)     // Catch:{ IllegalArgumentException -> 0x0060 }
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1     // Catch:{ IllegalArgumentException -> 0x0060 }
            if (r1 == 0) goto L_0x003e
            int r0 = r1.size()     // Catch:{ IllegalArgumentException -> 0x0060 }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ IllegalArgumentException -> 0x0060 }
            java.lang.Object[] r4 = r1.toArray(r0)     // Catch:{ IllegalArgumentException -> 0x0060 }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ IllegalArgumentException -> 0x0060 }
            goto L_0x003e
        L_0x003c:
            r0 = 0
            goto L_0x001d
        L_0x003e:
            r3 = 0
            if (r4 == 0) goto L_0x005d
            int r0 = r4.length     // Catch:{ IllegalArgumentException -> 0x0060 }
            if (r0 <= 0) goto L_0x005d
            r2 = 0
            r1 = r4[r2]     // Catch:{ IllegalArgumentException -> 0x0060 }
            java.lang.String r0 = "annotation"
            boolean r0 = r1.equals(r0)     // Catch:{ IllegalArgumentException -> 0x0060 }
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "trace_config.fallback_sampling_rate_for_string_list_condition"
            int r0 = r6.A00(r0, r2)     // Catch:{ IllegalArgumentException -> 0x0060 }
            if (r0 == r5) goto L_0x005d
            X.4LM r3 = new X.4LM     // Catch:{ IllegalArgumentException -> 0x0060 }
            r3.<init>(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0060 }
        L_0x005d:
            r7.A00 = r3     // Catch:{ IllegalArgumentException -> 0x0060 }
            goto L_0x0062
        L_0x0060:
            r7.A02 = r5
        L_0x0062:
            X.4JO r0 = r7.A01
            if (r0 != 0) goto L_0x006a
            X.4LM r0 = r7.A00
            if (r0 == 0) goto L_0x006c
        L_0x006a:
            r7.A03 = r5
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32891hR.<init>(X.1hK):void");
    }
}
