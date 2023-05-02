package X;

/* renamed from: X.5z8  reason: invalid class name */
public class AnonymousClass5z8 implements AnonymousClass01m {
    public final C12850l4 A00;
    public final C16440t3 A01;
    public final C118005tu A02;
    public final C117585tE A03;
    public final C116375rH A04 = new C116375rH();

    public AnonymousClass5z8(C16440t3 r2, C118005tu r3, C117585tE r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = new AnonymousClass5z9(r2);
        this.A02 = r3;
    }

    public C12850l4 AGR() {
        return this.A00;
    }

    public C13410lz AgC(String str, int i2, int i3, long j2) {
        int i4;
        C16440t3 r9 = this.A01;
        long nanoTime = System.nanoTime();
        C118005tu r8 = this.A02;
        int i5 = i3;
        int intValue = Integer.valueOf(i5).intValue();
        int i6 = 0;
        for (int i7 = 0; i7 < 32; i7++) {
            i6 |= ((intValue >> i7) & 1) << (31 - i7);
        }
        int i8 = i2;
        int i9 = i2 ^ i6;
        String str2 = str;
        if (str == null) {
            i4 = r8.A00.A00(i8).A01;
        } else {
            C118935ve r6 = r8.A00;
            r6.A01();
            C116905s8 r2 = (C116905s8) r6.A04.get(str2);
            if (r2 == null) {
                r2 = new C116905s8(-1, 812974081);
                r6.A04.put(str2, r2);
            }
            i4 = r2.A01;
        }
        C117585tE r10 = this.A03;
        C116375rH r11 = this.A04;
        AnonymousClass5zA r82 = new AnonymousClass5zA(r9, r10, r11, str2, i4, i9, (((long) i5) & 4294967295L) | ((((long) i8) << 32) & -4294967296L), nanoTime);
        r82.AKm("using_backup_start_time", false);
        r82.AKm("using_capped_backup_start_time", false);
        C117585tE r0 = r82.A05;
        if (r0.A03.AJD(r82.A01, r82.A00)) {
            r11.A00.put(Long.valueOf(r82.A03), r82);
        }
        return r82;
    }
}
