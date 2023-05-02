package net.minidev.json.writer;

import X.AnonymousClass4RL;
import X.AnonymousClass5HE;

public class IDxAMapperShape60S0000000_2_I1 extends AnonymousClass5HE {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxAMapperShape60S0000000_2_I1(int i2) {
        super((AnonymousClass4RL) null);
        this.A00 = i2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [boolean[], short[], byte[], char[]], vars: [r4v1 ?, r4v0 ?, r4v2 ?, r4v3 ?, r4v4 ?, r4v5 ?, r4v6 ?, r4v7 ?, r4v8 ?, r4v9 ?, r4v10 ?, r4v11 ?, r4v12 ?, r4v13 ?, r4v14 ?, r4v15 ?, r4v16 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public /* bridge */ /* synthetic */ java.lang.Object A03(java.lang.Object r7) {
        /*
            r6 = this;
            int r1 = r6.A00
            java.util.List r7 = (java.util.List) r7
            int r0 = r7.size()
            switch(r1) {
                case 0: goto L_0x020d;
                case 1: goto L_0x01f2;
                case 2: goto L_0x01ce;
                case 3: goto L_0x01b3;
                case 4: goto L_0x018f;
                case 5: goto L_0x0174;
                case 6: goto L_0x0131;
                case 7: goto L_0x0116;
                case 8: goto L_0x00f2;
                case 9: goto L_0x00d5;
                case 10: goto L_0x00af;
                case 11: goto L_0x0092;
                case 12: goto L_0x006c;
                case 13: goto L_0x004c;
                case 14: goto L_0x0027;
                default: goto L_0x000b;
            }
        L_0x000b:
            long[] r4 = new long[r0]
            java.util.Iterator r5 = r7.iterator()
            r3 = 0
        L_0x0012:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r0 = r5.next()
            int r2 = r3 + 1
            int r0 = X.AnonymousClass000.A0D(r0)
            long r0 = (long) r0
            r4[r3] = r0
            r3 = r2
            goto L_0x0012
        L_0x0027:
            java.lang.Character[] r4 = new java.lang.Character[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
            r1 = 0
        L_0x002f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r0 = r3.next()
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = r0.toString()
            char r0 = r0.charAt(r2)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r4[r1] = r0
            int r1 = r1 + 1
            goto L_0x002f
        L_0x004c:
            char[] r4 = new char[r0]
            java.util.Iterator r5 = r7.iterator()
            r3 = 0
            r2 = 0
        L_0x0054:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r0 = r5.next()
            int r1 = r2 + 1
            java.lang.String r0 = r0.toString()
            char r0 = r0.charAt(r3)
            r4[r2] = r0
            r2 = r1
            goto L_0x0054
        L_0x006c:
            java.lang.Byte[] r4 = new java.lang.Byte[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x0073:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x0073
            boolean r0 = r1 instanceof java.lang.Byte
            if (r0 != 0) goto L_0x008d
            java.lang.Number r1 = (java.lang.Number) r1
            byte r0 = r1.byteValue()
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)
        L_0x008d:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x0073
        L_0x0092:
            byte[] r4 = new byte[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x0099:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            java.lang.Number r0 = (java.lang.Number) r0
            byte r0 = r0.byteValue()
            r4[r2] = r0
            r2 = r1
            goto L_0x0099
        L_0x00af:
            java.lang.Short[] r4 = new java.lang.Short[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x00b6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x00b6
            boolean r0 = r1 instanceof java.lang.Short
            if (r0 != 0) goto L_0x00d0
            java.lang.Number r1 = (java.lang.Number) r1
            short r0 = r1.shortValue()
            java.lang.Short r1 = java.lang.Short.valueOf(r0)
        L_0x00d0:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x00b6
        L_0x00d5:
            short[] r4 = new short[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x00dc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            java.lang.Number r0 = (java.lang.Number) r0
            short r0 = r0.shortValue()
            r4[r2] = r0
            r2 = r1
            goto L_0x00dc
        L_0x00f2:
            java.lang.Integer[] r4 = new java.lang.Integer[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x00f9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x00f9
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0111
            int r0 = X.AnonymousClass000.A0D(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0111:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x00f9
        L_0x0116:
            int[] r4 = new int[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x011d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            int r0 = X.AnonymousClass000.A0D(r0)
            r4[r2] = r0
            r2 = r1
            goto L_0x011d
        L_0x0131:
            java.lang.Boolean[] r4 = new java.lang.Boolean[r0]
            java.util.Iterator r3 = r7.iterator()
            r1 = 0
        L_0x0138:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r2 = r3.next()
            if (r2 == 0) goto L_0x0138
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x014d
            r4[r1] = r2
        L_0x014a:
            int r1 = r1 + 1
            goto L_0x0138
        L_0x014d:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L_0x0160
            int r0 = X.AnonymousClass000.A0D(r2)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4[r1] = r0
            goto L_0x014a
        L_0x0160:
            java.lang.String r0 = "can not convert "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            java.lang.String r0 = " toBoolean"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        L_0x0174:
            boolean[] r4 = new boolean[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x017b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r4[r2] = r0
            r2 = r1
            goto L_0x017b
        L_0x018f:
            java.lang.Double[] r4 = new java.lang.Double[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x0196:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x0196
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 != 0) goto L_0x01ae
            double r0 = X.AnonymousClass3K3.A01(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x01ae:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x0196
        L_0x01b3:
            double[] r4 = new double[r0]
            java.util.Iterator r5 = r7.iterator()
            r3 = 0
        L_0x01ba:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r0 = r5.next()
            int r2 = r3 + 1
            double r0 = X.AnonymousClass3K3.A01(r0)
            r4[r3] = r0
            r3 = r2
            goto L_0x01ba
        L_0x01ce:
            java.lang.Float[] r4 = new java.lang.Float[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x01d5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x01d5
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 != 0) goto L_0x01ed
            float r0 = X.AnonymousClass000.A04(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L_0x01ed:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x01d5
        L_0x01f2:
            float[] r4 = new float[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x01f9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r0 = r3.next()
            int r1 = r2 + 1
            float r0 = X.AnonymousClass000.A04(r0)
            r4[r2] = r0
            r2 = r1
            goto L_0x01f9
        L_0x020d:
            java.lang.Long[] r4 = new java.lang.Long[r0]
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x0214:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0231
            java.lang.Object r1 = r3.next()
            if (r1 == 0) goto L_0x0214
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 != 0) goto L_0x022c
            long r0 = X.C13700nu.A01(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x022c:
            r4[r2] = r1
            int r2 = r2 + 1
            goto L_0x0214
        L_0x0231:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.minidev.json.writer.IDxAMapperShape60S0000000_2_I1.A03(java.lang.Object):java.lang.Object");
    }
}
