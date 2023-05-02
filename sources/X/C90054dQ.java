package X;

/* renamed from: X.4dQ  reason: invalid class name and case insensitive filesystem */
public class C90054dQ {
    public C90054dQ A00;
    public byte[] A01;
    public final String A02;

    public C90054dQ(String str) {
        this.A02 = str;
    }

    public static int A00(AnonymousClass4XW r2, int i2, int i3) {
        int i4;
        if ((i2 & 4096) == 0 || r2.A03 >= 49) {
            i4 = 0;
        } else {
            r2.A02("Synthetic");
            i4 = 6;
        }
        if (i3 != 0) {
            r2.A02("Signature");
            i4 += 8;
        }
        if ((i2 & 131072) == 0) {
            return i4;
        }
        r2.A02("Deprecated");
        return i4 + 6;
    }

    public static void A01(C89454cD r3, AnonymousClass4XW r4, int i2, int i3) {
        if ((i2 & 4096) != 0 && r4.A03 < 49) {
            AnonymousClass4XW.A01("Synthetic", r3, r4);
            r3.A05(0);
        }
        if (i3 != 0) {
            AnonymousClass4XW.A01("Signature", r3, r4);
            r3.A05(2);
            r3.A06(i3);
        }
        if ((i2 & 131072) != 0) {
            AnonymousClass4XW.A01("Deprecated", r3, r4);
            r3.A05(0);
        }
    }

    public final int A02(AnonymousClass4XW r4) {
        int i2 = 0;
        for (C90054dQ r1 = this; r1 != null; r1 = r1.A00) {
            r4.A02(r1.A02);
            i2 += r1.A01.length + 6;
        }
        return i2;
    }

    public final void A03(C89454cD r5, AnonymousClass4XW r6) {
        for (C90054dQ r3 = this; r3 != null; r3 = r3.A00) {
            byte[] bArr = r3.A01;
            int length = bArr.length;
            AnonymousClass4XW.A01(r3.A02, r5, r6);
            r5.A05(length);
            r5.A0C(bArr, 0, length);
        }
    }
}
