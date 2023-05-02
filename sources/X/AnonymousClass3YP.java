package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

/* renamed from: X.3YP  reason: invalid class name */
public class AnonymousClass3YP extends AnonymousClass3YQ {
    public static final Parcelable.Creator CREATOR = new C92524hh();
    public final int A00;
    public final Parcel A01;
    public final C65983Xi A02;
    public final String A03;

    public AnonymousClass3YP(Parcel parcel, C65983Xi r3, int i2) {
        this.A00 = i2;
        C13710nw.A01(parcel);
        this.A01 = parcel;
        this.A02 = r3;
        this.A03 = r3 == null ? null : r3.A01;
    }

    public static BigDecimal A00(Parcel parcel, int i2) {
        int A022 = C32281fy.A02(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (A022 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + A022);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r2.A02.containsKey(r5) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass3Y5 r4, java.lang.Object r5, java.lang.StringBuilder r6) {
        /*
            X.5Ln r2 = r4.A00
            if (r2 == 0) goto L_0x001e
            X.3YI r2 = (X.AnonymousClass3YI) r2
            java.lang.Number r5 = (java.lang.Number) r5
            android.util.SparseArray r1 = r2.A01
            int r0 = r5.intValue()
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L_0x0043
            java.util.HashMap r0 = r2.A02
            java.lang.String r5 = "gms_unknown"
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x0043
        L_0x001e:
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x004b
            java.util.AbstractList r5 = (java.util.AbstractList) r5
            java.lang.String r0 = "["
            r6.append(r0)
            int r3 = r5.size()
            r2 = 0
        L_0x002e:
            if (r2 >= r3) goto L_0x0045
            if (r2 == 0) goto L_0x0037
            java.lang.String r0 = ","
            r6.append(r0)
        L_0x0037:
            int r1 = r4.A02
            java.lang.Object r0 = r5.get(r2)
            A02(r0, r6, r1)
            int r2 = r2 + 1
            goto L_0x002e
        L_0x0043:
            r5 = r1
            goto L_0x001e
        L_0x0045:
            java.lang.String r0 = "]"
            r6.append(r0)
            return
        L_0x004b:
            int r0 = r4.A02
            A02(r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YP.A01(X.3Y5, java.lang.Object, java.lang.StringBuilder):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r2 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r0 = android.util.Base64.encodeToString(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r3.append(r0);
        r3.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        throw X.AnonymousClass000.A0T(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(java.lang.Object r2, java.lang.StringBuilder r3, int r4) {
        /*
            java.lang.String r1 = "\""
            switch(r4) {
                case 0: goto L_0x004e;
                case 1: goto L_0x004e;
                case 2: goto L_0x004e;
                case 3: goto L_0x004e;
                case 4: goto L_0x004e;
                case 5: goto L_0x004e;
                case 6: goto L_0x004e;
                case 7: goto L_0x0039;
                case 8: goto L_0x002a;
                case 9: goto L_0x0022;
                case 10: goto L_0x0019;
                case 11: goto L_0x0016;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 26
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Unknown type = "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r4)
        L_0x0011:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0016:
            java.lang.String r0 = "Method does not accept concrete type."
            goto L_0x0011
        L_0x0019:
            X.C13710nw.A01(r2)
            java.util.HashMap r2 = (java.util.HashMap) r2
            X.AnonymousClass45D.A00(r3, r2)
            return
        L_0x0022:
            r3.append(r1)
            byte[] r2 = (byte[]) r2
            r0 = 10
            goto L_0x0030
        L_0x002a:
            r3.append(r1)
            byte[] r2 = (byte[]) r2
            r0 = 0
        L_0x0030:
            if (r2 != 0) goto L_0x0034
            r0 = 0
            goto L_0x0047
        L_0x0034:
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r0)
            goto L_0x0047
        L_0x0039:
            r3.append(r1)
            X.C13710nw.A01(r2)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = X.C87834Yv.A00(r0)
        L_0x0047:
            r3.append(r0)
            r3.append(r1)
            return
        L_0x004e:
            r3.append(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YP.A02(java.lang.Object, java.lang.StringBuilder, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x034b, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(android.os.Parcel r18, java.lang.StringBuilder r19, java.util.Map r20) {
        /*
            r17 = this;
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>()
            java.util.Iterator r2 = X.AnonymousClass000.A0y(r20)
        L_0x0009:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001f
            java.util.Map$Entry r1 = X.AnonymousClass000.A0z(r2)
            java.lang.Object r0 = r1.getValue()
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            int r0 = r0.A04
            r6.put(r0, r1)
            goto L_0x0009
        L_0x001f:
            r0 = 123(0x7b, float:1.72E-43)
            r4 = r19
            r4.append(r0)
            r2 = r18
            int r3 = X.C32281fy.A00(r2)
            r5 = 0
            r8 = 0
        L_0x002e:
            int r0 = r2.dataPosition()
            if (r0 >= r3) goto L_0x0415
            int r1 = r2.readInt()
            char r0 = (char) r1
            java.lang.Object r7 = r6.get(r0)
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            if (r7 == 0) goto L_0x002e
            java.lang.String r11 = ","
            if (r8 == 0) goto L_0x0048
            r4.append(r11)
        L_0x0048:
            java.lang.Object r0 = r7.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r9 = r7.getValue()
            X.3Y5 r9 = (X.AnonymousClass3Y5) r9
            java.lang.String r7 = "\""
            r4.append(r7)
            r4.append(r0)
            java.lang.String r0 = "\":"
            r4.append(r0)
            X.5Ln r0 = r9.A00
            if (r0 == 0) goto L_0x011b
            int r7 = r9.A03
            switch(r7) {
                case 0: goto L_0x007b;
                case 1: goto L_0x00de;
                case 2: goto L_0x0088;
                case 3: goto L_0x00fc;
                case 4: goto L_0x0109;
                case 5: goto L_0x03fc;
                case 6: goto L_0x0095;
                case 7: goto L_0x00a2;
                case 8: goto L_0x00ab;
                case 9: goto L_0x00ab;
                case 10: goto L_0x00b4;
                case 11: goto L_0x0406;
                default: goto L_0x006a;
            }
        L_0x006a:
            r0 = 36
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Unknown field out type = "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r7)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x007b:
            int r0 = X.C32281fy.A01(r2, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            A01(r9, r0, r4)
            goto L_0x0403
        L_0x0088:
            long r0 = X.C32281fy.A03(r2, r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            A01(r9, r0, r4)
            goto L_0x0403
        L_0x0095:
            boolean r0 = X.C32281fy.A0F(r2, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            A01(r9, r0, r4)
            goto L_0x0403
        L_0x00a2:
            java.lang.String r0 = X.C32281fy.A08(r2, r1)
            A01(r9, r0, r4)
            goto L_0x0403
        L_0x00ab:
            byte[] r0 = X.C32281fy.A0G(r2, r1)
            A01(r9, r0, r4)
            goto L_0x0403
        L_0x00b4:
            android.os.Bundle r10 = X.C32281fy.A04(r2, r1)
            java.util.HashMap r8 = X.AnonymousClass000.A0x()
            java.util.Set r0 = r10.keySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x00c4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00d9
            java.lang.String r1 = X.AnonymousClass000.A0m(r7)
            java.lang.String r0 = r10.getString(r1)
            X.C13710nw.A01(r0)
            r8.put(r1, r0)
            goto L_0x00c4
        L_0x00d9:
            A01(r9, r8, r4)
            goto L_0x0403
        L_0x00de:
            int r7 = X.C32281fy.A02(r2, r1)
            int r1 = r2.dataPosition()
            if (r7 != 0) goto L_0x00ee
            r1 = 0
        L_0x00e9:
            A01(r9, r1, r4)
            goto L_0x0403
        L_0x00ee:
            byte[] r0 = r2.createByteArray()
            int r1 = r1 + r7
            r2.setDataPosition(r1)
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r0)
            goto L_0x00e9
        L_0x00fc:
            float r0 = X.AnonymousClass3K2.A01(r2, r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            A01(r9, r0, r4)
            goto L_0x0403
        L_0x0109:
            r0 = 8
            X.C32281fy.A0E(r2, r1, r0)
            double r0 = r2.readDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            A01(r9, r0, r4)
            goto L_0x0403
        L_0x011b:
            boolean r0 = r9.A0A
            r8 = r17
            if (r0 == 0) goto L_0x02ec
            java.lang.String r0 = "["
            r4.append(r0)
            int r0 = r9.A03
            switch(r0) {
                case 0: goto L_0x0132;
                case 1: goto L_0x0166;
                case 2: goto L_0x019e;
                case 3: goto L_0x01c7;
                case 4: goto L_0x01f0;
                case 5: goto L_0x0219;
                case 6: goto L_0x025a;
                case 7: goto L_0x014b;
                case 8: goto L_0x040d;
                case 9: goto L_0x040d;
                case 10: goto L_0x040d;
                case 11: goto L_0x0283;
                default: goto L_0x012b;
            }
        L_0x012b:
            java.lang.String r0 = "Unknown field type out."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0132:
            int[] r8 = X.C32281fy.A0H(r2, r1)
            int r7 = r8.length
            r1 = 0
        L_0x0138:
            if (r1 >= r7) goto L_0x02e5
            if (r1 == 0) goto L_0x013f
            r4.append(r11)
        L_0x013f:
            r0 = r8[r1]
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x0138
        L_0x014b:
            java.lang.String[] r9 = X.C32281fy.A0J(r2, r1)
            int r8 = r9.length
            r1 = 0
        L_0x0151:
            if (r1 >= r8) goto L_0x02e5
            if (r1 == 0) goto L_0x0158
            r4.append(r11)
        L_0x0158:
            r4.append(r7)
            r0 = r9[r1]
            r4.append(r0)
            r4.append(r7)
            int r1 = r1 + 1
            goto L_0x0151
        L_0x0166:
            int r12 = X.C32281fy.A02(r2, r1)
            int r10 = r2.dataPosition()
            if (r12 != 0) goto L_0x0182
            r9 = 0
        L_0x0171:
            int r7 = r9.length
            r1 = 0
        L_0x0173:
            if (r1 >= r7) goto L_0x02e5
            if (r1 == 0) goto L_0x017a
            r4.append(r11)
        L_0x017a:
            r0 = r9[r1]
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x0173
        L_0x0182:
            int r8 = r2.readInt()
            java.math.BigInteger[] r9 = new java.math.BigInteger[r8]
            r7 = 0
        L_0x0189:
            if (r7 >= r8) goto L_0x0199
            byte[] r1 = r2.createByteArray()
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            r9[r7] = r0
            int r7 = r7 + 1
            goto L_0x0189
        L_0x0199:
            int r10 = r10 + r12
            r2.setDataPosition(r10)
            goto L_0x0171
        L_0x019e:
            int r1 = X.C32281fy.A02(r2, r1)
            int r0 = r2.dataPosition()
            if (r1 != 0) goto L_0x01be
            r9 = 0
        L_0x01a9:
            int r8 = r9.length
            r7 = 0
        L_0x01ab:
            if (r7 >= r8) goto L_0x02e5
            if (r7 == 0) goto L_0x01b2
            r4.append(r11)
        L_0x01b2:
            r0 = r9[r7]
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4.append(r0)
            int r7 = r7 + 1
            goto L_0x01ab
        L_0x01be:
            long[] r9 = r2.createLongArray()
            int r0 = r0 + r1
            r2.setDataPosition(r0)
            goto L_0x01a9
        L_0x01c7:
            int r1 = X.C32281fy.A02(r2, r1)
            int r0 = r2.dataPosition()
            if (r1 != 0) goto L_0x01e7
            r8 = 0
        L_0x01d2:
            int r7 = r8.length
            r1 = 0
        L_0x01d4:
            if (r1 >= r7) goto L_0x02e5
            if (r1 == 0) goto L_0x01db
            r4.append(r11)
        L_0x01db:
            r0 = r8[r1]
            java.lang.String r0 = java.lang.Float.toString(r0)
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x01d4
        L_0x01e7:
            float[] r8 = r2.createFloatArray()
            int r0 = r0 + r1
            r2.setDataPosition(r0)
            goto L_0x01d2
        L_0x01f0:
            int r1 = X.C32281fy.A02(r2, r1)
            int r0 = r2.dataPosition()
            if (r1 != 0) goto L_0x0210
            r9 = 0
        L_0x01fb:
            int r8 = r9.length
            r7 = 0
        L_0x01fd:
            if (r7 >= r8) goto L_0x02e5
            if (r7 == 0) goto L_0x0204
            r4.append(r11)
        L_0x0204:
            r0 = r9[r7]
            java.lang.String r0 = java.lang.Double.toString(r0)
            r4.append(r0)
            int r7 = r7 + 1
            goto L_0x01fd
        L_0x0210:
            double[] r9 = r2.createDoubleArray()
            int r0 = r0 + r1
            r2.setDataPosition(r0)
            goto L_0x01fb
        L_0x0219:
            int r13 = X.C32281fy.A02(r2, r1)
            int r12 = r2.dataPosition()
            if (r13 != 0) goto L_0x0235
            r10 = 0
        L_0x0224:
            int r7 = r10.length
            r1 = 0
        L_0x0226:
            if (r1 >= r7) goto L_0x02e5
            if (r1 == 0) goto L_0x022d
            r4.append(r11)
        L_0x022d:
            r0 = r10[r1]
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x0226
        L_0x0235:
            int r9 = r2.readInt()
            java.math.BigDecimal[] r10 = new java.math.BigDecimal[r9]
            r8 = 0
        L_0x023c:
            if (r8 >= r9) goto L_0x0255
            byte[] r0 = r2.createByteArray()
            int r7 = r2.readInt()
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r0)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1, r7)
            r10[r8] = r0
            int r8 = r8 + 1
            goto L_0x023c
        L_0x0255:
            int r12 = r12 + r13
            r2.setDataPosition(r12)
            goto L_0x0224
        L_0x025a:
            int r1 = X.C32281fy.A02(r2, r1)
            int r0 = r2.dataPosition()
            if (r1 != 0) goto L_0x027a
            r8 = 0
        L_0x0265:
            int r7 = r8.length
            r1 = 0
        L_0x0267:
            if (r1 >= r7) goto L_0x02e5
            if (r1 == 0) goto L_0x026e
            r4.append(r11)
        L_0x026e:
            boolean r0 = r8[r1]
            java.lang.String r0 = java.lang.Boolean.toString(r0)
            r4.append(r0)
            int r1 = r1 + 1
            goto L_0x0267
        L_0x027a:
            boolean[] r8 = r2.createBooleanArray()
            int r0 = r0 + r1
            r2.setDataPosition(r0)
            goto L_0x0265
        L_0x0283:
            int r16 = X.C32281fy.A02(r2, r1)
            int r15 = r2.dataPosition()
            r14 = 0
            if (r16 == 0) goto L_0x02ba
            int r13 = r2.readInt()
            android.os.Parcel[] r12 = new android.os.Parcel[r13]
            r10 = 0
        L_0x0295:
            if (r10 >= r13) goto L_0x02b4
            int r7 = r2.readInt()
            if (r7 == 0) goto L_0x02b1
            int r1 = r2.dataPosition()
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r0.appendFrom(r2, r1, r7)
            r12[r10] = r0
            int r1 = r1 + r7
            r2.setDataPosition(r1)
        L_0x02ae:
            int r10 = r10 + 1
            goto L_0x0295
        L_0x02b1:
            r12[r10] = r14
            goto L_0x02ae
        L_0x02b4:
            int r15 = r15 + r16
            r2.setDataPosition(r15)
            r14 = r12
        L_0x02ba:
            int r10 = r14.length
            r7 = 0
        L_0x02bc:
            if (r7 >= r10) goto L_0x02e5
            if (r7 <= 0) goto L_0x02c3
            r4.append(r11)
        L_0x02c3:
            r0 = r14[r7]
            r0.setDataPosition(r5)
            java.lang.String r1 = r9.A08
            X.C13710nw.A01(r1)
            X.3Xi r0 = r9.A01
            X.C13710nw.A01(r0)
            java.util.HashMap r0 = r0.A02
            java.lang.Object r1 = r0.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            X.C13710nw.A01(r1)
            r0 = r14[r7]
            r8.A07(r0, r4, r1)
            int r7 = r7 + 1
            goto L_0x02bc
        L_0x02e5:
            java.lang.String r0 = "]"
            r4.append(r0)
            goto L_0x0403
        L_0x02ec:
            int r0 = r9.A03
            switch(r0) {
                case 0: goto L_0x02f8;
                case 1: goto L_0x038f;
                case 2: goto L_0x0301;
                case 3: goto L_0x03ac;
                case 4: goto L_0x03b4;
                case 5: goto L_0x03c1;
                case 6: goto L_0x030a;
                case 7: goto L_0x0313;
                case 8: goto L_0x0326;
                case 9: goto L_0x0334;
                case 10: goto L_0x034d;
                case 11: goto L_0x03c9;
                default: goto L_0x02f1;
            }
        L_0x02f1:
            java.lang.String r0 = "Unknown field type out"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x02f8:
            int r0 = X.C32281fy.A01(r2, r1)
            r4.append(r0)
            goto L_0x0403
        L_0x0301:
            long r0 = X.C32281fy.A03(r2, r1)
            r4.append(r0)
            goto L_0x0403
        L_0x030a:
            boolean r0 = X.C32281fy.A0F(r2, r1)
            r4.append(r0)
            goto L_0x0403
        L_0x0313:
            java.lang.String r0 = X.C32281fy.A08(r2, r1)
            r4.append(r7)
            java.lang.String r0 = X.C87834Yv.A00(r0)
            r4.append(r0)
            r4.append(r7)
            goto L_0x0403
        L_0x0326:
            byte[] r0 = X.C32281fy.A0G(r2, r1)
            r4.append(r7)
            if (r0 == 0) goto L_0x034b
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r5)
            goto L_0x0343
        L_0x0334:
            byte[] r1 = X.C32281fy.A0G(r2, r1)
            r4.append(r7)
            if (r1 == 0) goto L_0x034b
            r0 = 10
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
        L_0x0343:
            r4.append(r0)
            r4.append(r7)
            goto L_0x0403
        L_0x034b:
            r0 = 0
            goto L_0x0343
        L_0x034d:
            android.os.Bundle r10 = X.C32281fy.A04(r2, r1)
            java.util.Set r1 = r10.keySet()
            java.lang.String r0 = "{"
            r4.append(r0)
            java.util.Iterator r9 = r1.iterator()
            r8 = 1
        L_0x035f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0389
            java.lang.String r1 = X.AnonymousClass000.A0m(r9)
            if (r8 != 0) goto L_0x036e
            r4.append(r11)
        L_0x036e:
            r4.append(r7)
            r4.append(r1)
            java.lang.String r0 = "\":\""
            r4.append(r0)
            java.lang.String r0 = r10.getString(r1)
            java.lang.String r0 = X.C87834Yv.A00(r0)
            r4.append(r0)
            r4.append(r7)
            r8 = 0
            goto L_0x035f
        L_0x0389:
            java.lang.String r0 = "}"
            r4.append(r0)
            goto L_0x0403
        L_0x038f:
            int r7 = X.C32281fy.A02(r2, r1)
            int r1 = r2.dataPosition()
            if (r7 != 0) goto L_0x039e
            r1 = 0
        L_0x039a:
            r4.append(r1)
            goto L_0x0403
        L_0x039e:
            byte[] r0 = r2.createByteArray()
            int r1 = r1 + r7
            r2.setDataPosition(r1)
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r0)
            goto L_0x039a
        L_0x03ac:
            float r0 = X.AnonymousClass3K2.A01(r2, r1)
            r4.append(r0)
            goto L_0x0403
        L_0x03b4:
            r0 = 8
            X.C32281fy.A0E(r2, r1, r0)
            double r0 = r2.readDouble()
            r4.append(r0)
            goto L_0x0403
        L_0x03c1:
            java.math.BigDecimal r0 = A00(r2, r1)
            r4.append(r0)
            goto L_0x0403
        L_0x03c9:
            int r1 = X.C32281fy.A02(r2, r1)
            int r0 = r2.dataPosition()
            if (r1 != 0) goto L_0x03f0
            r7 = 0
        L_0x03d4:
            r7.setDataPosition(r5)
            java.lang.String r1 = r9.A08
            X.C13710nw.A01(r1)
            X.3Xi r0 = r9.A01
            X.C13710nw.A01(r0)
            java.util.HashMap r0 = r0.A02
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            X.C13710nw.A01(r0)
            r8.A07(r7, r4, r0)
            goto L_0x0403
        L_0x03f0:
            android.os.Parcel r7 = android.os.Parcel.obtain()
            r7.appendFrom(r2, r0, r1)
            int r0 = r0 + r1
            r2.setDataPosition(r0)
            goto L_0x03d4
        L_0x03fc:
            java.math.BigDecimal r0 = A00(r2, r1)
            A01(r9, r0, r4)
        L_0x0403:
            r8 = 1
            goto L_0x002e
        L_0x0406:
            java.lang.String r0 = "Method does not accept concrete type."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x040d:
            java.lang.String r1 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0415:
            int r0 = r2.dataPosition()
            if (r0 != r3) goto L_0x0421
            r0 = 125(0x7d, float:1.75E-43)
            r4.append(r0)
            return
        L_0x0421:
            r0 = 37
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Overread allowed size end="
            java.lang.String r1 = X.C13680ns.A0i(r0, r1, r3)
            X.5Aa r0 = new X.5Aa
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YP.A07(android.os.Parcel, java.lang.StringBuilder, java.util.Map):void");
    }

    public final String toString() {
        C65983Xi r4 = this.A02;
        C13710nw.A02(r4, "Cannot convert to JSON on client side.");
        Parcel parcel = this.A01;
        parcel.setDataPosition(0);
        StringBuilder A0g = C13690nt.A0g(100);
        String str = this.A03;
        C13710nw.A01(str);
        Map map = (Map) r4.A02.get(str);
        C13710nw.A01(map);
        A07(parcel, A0g, map);
        return A0g.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        Parcel parcel2 = this.A01;
        if (parcel2 != null) {
            int A012 = C32251fv.A01(parcel, 2);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            C32251fv.A05(parcel, A012);
        }
        C32251fv.A09(parcel, this.A02, 3, i2, false);
        C32251fv.A05(parcel, A002);
    }
}
