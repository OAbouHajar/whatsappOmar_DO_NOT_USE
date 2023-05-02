package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Arrays;

/* renamed from: X.1WN  reason: invalid class name */
public class AnonymousClass1WN {
    public long A00;
    public long A01;
    public String A02;
    public final int A03;
    public final long A04;
    public final C30451cN A05;
    public final DeviceJid A06;
    public final C37421p8 A07;
    public final String A08;
    public final boolean A09;

    public AnonymousClass1WN(C30451cN r2, DeviceJid deviceJid, C37421p8 r4, String str, String str2, int i2, long j2, long j3, long j4, boolean z2) {
        AnonymousClass00B.A06(deviceJid);
        this.A06 = deviceJid;
        this.A07 = r4;
        this.A08 = (str == null || str.isEmpty()) ? null : str;
        this.A00 = j2;
        this.A04 = j3;
        this.A01 = j4;
        this.A03 = i2;
        this.A09 = z2;
        this.A02 = str2;
        this.A05 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return r4.getString(r2, new java.lang.Object[]{r5.A08});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return r4.getString(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.Context r4, X.AnonymousClass1WN r5) {
        /*
            X.1p8 r0 = r5.A07
            int r1 = r0.ordinal()
            r3 = 0
            r0 = 1
            switch(r1) {
                case 1: goto L_0x0027;
                case 2: goto L_0x002b;
                case 3: goto L_0x0033;
                case 4: goto L_0x0037;
                case 5: goto L_0x002f;
                case 6: goto L_0x003b;
                case 7: goto L_0x000b;
                case 8: goto L_0x000b;
                case 9: goto L_0x003f;
                case 10: goto L_0x0017;
                case 11: goto L_0x001b;
                case 12: goto L_0x001f;
                case 13: goto L_0x0023;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.String r0 = r5.A08
            if (r0 != 0) goto L_0x0016
            r0 = 2131889219(0x7f120c43, float:1.9413095E38)
        L_0x0012:
            java.lang.String r0 = r4.getString(r0)
        L_0x0016:
            return r0
        L_0x0017:
            r0 = 2131889215(0x7f120c3f, float:1.9413087E38)
            goto L_0x0012
        L_0x001b:
            r0 = 2131889208(0x7f120c38, float:1.9413073E38)
            goto L_0x0012
        L_0x001f:
            r0 = 2131889210(0x7f120c3a, float:1.9413077E38)
            goto L_0x0012
        L_0x0023:
            r0 = 2131889217(0x7f120c41, float:1.9413091E38)
            goto L_0x0012
        L_0x0027:
            r2 = 2131889211(0x7f120c3b, float:1.941308E38)
            goto L_0x0042
        L_0x002b:
            r2 = 2131889213(0x7f120c3d, float:1.9413083E38)
            goto L_0x0042
        L_0x002f:
            r2 = 2131889218(0x7f120c42, float:1.9413093E38)
            goto L_0x0042
        L_0x0033:
            r2 = 2131889214(0x7f120c3e, float:1.9413085E38)
            goto L_0x0042
        L_0x0037:
            r2 = 2131889216(0x7f120c40, float:1.941309E38)
            goto L_0x0042
        L_0x003b:
            r2 = 2131889212(0x7f120c3c, float:1.9413081E38)
            goto L_0x0042
        L_0x003f:
            r2 = 2131889209(0x7f120c39, float:1.9413075E38)
        L_0x0042:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r5.A08
            r1[r3] = r0
            java.lang.String r0 = r4.getString(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WN.A00(android.content.Context, X.1WN):java.lang.String");
    }

    public boolean A01() {
        return this.A01 > 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        AnonymousClass1WN r7 = (AnonymousClass1WN) obj;
        return this.A06.equals(r7.A06) && this.A07.equals(r7.A07) && AnonymousClass1ZW.A0F(this.A08, r7.A08) && this.A04 == r7.A04 && this.A03 == r7.A03 && this.A09 == r7.A09;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, this.A07, this.A08, Long.valueOf(this.A04), Integer.valueOf(this.A03), Boolean.valueOf(this.A09)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Device jid: ");
        sb.append(this.A06);
        sb.append(", Platform type: ");
        sb.append(this.A07.toString());
        sb.append(", Device OS: ");
        sb.append(this.A08);
        sb.append(", Last active: ");
        sb.append(this.A00);
        sb.append(", Login time: ");
        sb.append(this.A04);
        sb.append(", Logout time: ");
        sb.append(this.A01);
        sb.append(", ADV Key Index: ");
        sb.append(this.A03);
        sb.append(", full sync required: ");
        sb.append(this.A09);
        sb.append(", Place Name: ");
        sb.append(this.A02);
        sb.append(", History sync config info: ");
        sb.append(this.A05);
        return sb.toString();
    }
}
