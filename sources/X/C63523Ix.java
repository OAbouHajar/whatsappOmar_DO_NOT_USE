package X;

/* renamed from: X.3Ix  reason: invalid class name and case insensitive filesystem */
public class C63523Ix extends AnonymousClass5HE {
    public C63523Ix() {
        super((AnonymousClass4RL) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (r0 == null) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A03(java.lang.Object r9) {
        /*
            r8 = this;
            r2 = 0
            if (r9 == 0) goto L_0x0014
            boolean r0 = r9 instanceof java.util.Date
            if (r0 != 0) goto L_0x01b9
            boolean r0 = r9 instanceof java.lang.Number
            if (r0 == 0) goto L_0x0015
            long r0 = X.C13700nu.A01(r9)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
        L_0x0014:
            return r2
        L_0x0015:
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L_0x01a1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r1 = "p.m."
            java.lang.String r0 = "pm"
            java.lang.String r3 = r9.replace(r1, r0)
            java.lang.String r1 = "a.m."
            java.lang.String r0 = "am"
            java.lang.String r1 = r3.replace(r1, r0)
            java.lang.String r0 = " -/:,.+年月日曜時分秒"
            java.util.StringTokenizer r4 = new java.util.StringTokenizer
            r4.<init>(r1, r0)
            boolean r0 = r4.hasMoreTokens()
            if (r0 == 0) goto L_0x0014
            java.lang.String r5 = r4.nextToken()
            int r0 = r5.length()
            r6 = 4
            r7 = 0
            if (r0 != r6) goto L_0x00bc
            char r0 = r5.charAt(r7)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x00bc
            java.util.GregorianCalendar r3 = X.C62113Br.A03()
            int r1 = java.lang.Integer.parseInt(r5)
            r0 = 1
            r3.set(r0, r1)
            boolean r0 = r4.hasMoreTokens()
            if (r0 == 0) goto L_0x0187
            java.lang.String r0 = r4.nextToken()
            java.lang.Integer r0 = X.C62113Br.A00(r0)
            int r0 = r0.intValue()
            r6 = 2
            r3.set(r6, r0)
            boolean r0 = r4.hasMoreTokens()
            if (r0 == 0) goto L_0x0187
            java.lang.String r5 = r4.nextToken()
            char r0 = r5.charAt(r7)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0187
            int r0 = r5.length()
            r2 = 5
            if (r0 != r2) goto L_0x00b4
            char r1 = r5.charAt(r6)
            r0 = 84
            if (r1 != r0) goto L_0x00b4
            java.lang.String r0 = r5.substring(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            r3.set(r2, r0)
            r0 = 3
            java.lang.String r0 = r5.substring(r0)
            if (r0 != 0) goto L_0x00af
        L_0x00a5:
            boolean r0 = r4.hasMoreTokens()
            if (r0 == 0) goto L_0x0187
            java.lang.String r0 = r4.nextToken()
        L_0x00af:
            java.util.Date r9 = X.C62113Br.A02(r0, r3, r4)
            return r9
        L_0x00b4:
            int r0 = java.lang.Integer.parseInt(r5)
            r3.set(r2, r0)
            goto L_0x00a5
        L_0x00bc:
            java.util.TreeMap r0 = X.C62113Br.A01
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x00ce
            boolean r0 = r4.hasMoreTokens()
            if (r0 == 0) goto L_0x0014
            java.lang.String r5 = r4.nextToken()
        L_0x00ce:
            java.util.TreeMap r1 = X.C62113Br.A02
            boolean r0 = r1.containsKey(r5)
            if (r0 == 0) goto L_0x014b
            java.util.GregorianCalendar r3 = X.C62113Br.A03()
            java.lang.Object r0 = r1.get(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x018c
            int r0 = r0.intValue()
            r5 = 2
            r3.set(r5, r0)
            boolean r0 = r4.hasMoreTokens()
            if (r0 == 0) goto L_0x01a0
            java.lang.String r0 = r4.nextToken()
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 5
            r3.set(r0, r1)
            boolean r0 = r4.hasMoreTokens()
            if (r0 == 0) goto L_0x01a0
            java.lang.String r1 = r4.nextToken()
            char r0 = r1.charAt(r7)
            boolean r0 = java.lang.Character.isLetter(r0)
            if (r0 == 0) goto L_0x011a
            boolean r0 = r4.hasMoreTokens()
            if (r0 == 0) goto L_0x01a0
            java.lang.String r1 = r4.nextToken()
        L_0x011a:
            int r0 = r1.length()
            if (r0 != r6) goto L_0x0144
            r2 = 1
            int r1 = java.lang.Integer.parseInt(r1)
        L_0x0125:
            r0 = 100
            if (r1 >= r0) goto L_0x012f
            r0 = 30
            if (r1 <= r0) goto L_0x0141
            int r1 = r1 + 2000
        L_0x012f:
            r3.set(r2, r1)
        L_0x0132:
            boolean r0 = r4.hasMoreTokens()
            if (r0 == 0) goto L_0x0187
            java.lang.String r0 = r4.nextToken()
            java.util.Date r9 = X.C62113Br.A02(r0, r3, r4)
            return r9
        L_0x0141:
            int r1 = r1 + 1900
            goto L_0x012f
        L_0x0144:
            if (r0 != r5) goto L_0x0132
            java.util.Date r9 = X.C62113Br.A02(r1, r3, r4)
            return r9
        L_0x014b:
            char r0 = r5.charAt(r7)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L_0x0014
            java.util.GregorianCalendar r3 = X.C62113Br.A03()
            int r1 = java.lang.Integer.parseInt(r5)
            r0 = 5
            r3.set(r0, r1)
            boolean r0 = r4.hasMoreTokens()
            if (r0 == 0) goto L_0x01a0
            java.lang.String r0 = r4.nextToken()
            r1 = 2
            java.lang.Integer r0 = X.C62113Br.A00(r0)
            int r0 = r0.intValue()
            r3.set(r1, r0)
            boolean r0 = r4.hasMoreTokens()
            if (r0 == 0) goto L_0x01a0
            java.lang.String r0 = r4.nextToken()
            r2 = 1
            int r1 = java.lang.Integer.parseInt(r0)
            goto L_0x0125
        L_0x0187:
            java.util.Date r9 = r3.getTime()
            return r9
        L_0x018c:
            java.lang.String r0 = "can not parse "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r5)
            java.lang.String r0 = " as month"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x01a0:
            return r2
        L_0x01a1:
            java.lang.String r0 = "Primitive: Can not convert "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0d(r9)
            r1.append(r0)
            java.lang.String r0 = " to int"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        L_0x01b9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63523Ix.A03(java.lang.Object):java.lang.Object");
    }
}
