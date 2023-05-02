package X;

/* renamed from: X.1SC  reason: invalid class name */
public class AnonymousClass1SC {
    public final C16040sK A00;
    public final C18260wP A01;
    public final C23411Bw A02;
    public final AnonymousClass01V A03;
    public final C16980tz A04;
    public final C15860rz A05;
    public final AnonymousClass013 A06;
    public final C14710pd A07;
    public final AnonymousClass1SA A08;
    public final AnonymousClass1HL A09;
    public final AnonymousClass16S A0A;
    public final AnonymousClass1SB A0B;
    public final C17020u3 A0C;

    public AnonymousClass1SC(C16040sK r1, C18260wP r2, C23411Bw r3, AnonymousClass01V r4, C16980tz r5, C15860rz r6, AnonymousClass013 r7, C14710pd r8, AnonymousClass1SA r9, AnonymousClass1HL r10, AnonymousClass16S r11, AnonymousClass1SB r12, C17020u3 r13) {
        this.A04 = r5;
        this.A07 = r8;
        this.A00 = r1;
        this.A08 = r9;
        this.A0B = r12;
        this.A03 = r4;
        this.A06 = r7;
        this.A0A = r11;
        this.A09 = r10;
        this.A05 = r6;
        this.A02 = r3;
        this.A0C = r13;
        this.A01 = r2;
    }

    public final int[] A00() {
        String[] split = "2.23.1.76".split("\\.", 4);
        int length = split.length;
        if (length >= 3) {
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                try {
                    iArr[i2] = Integer.parseInt(split[i2]);
                    i2++;
                } catch (NumberFormatException e2) {
                    StringBuilder sb = new StringBuilder("non numeric portion of version name; VERSION_NAME=");
                    sb.append("2.23.1.76");
                    AssertionError assertionError = new AssertionError(sb.toString());
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            }
            return iArr;
        }
        StringBuilder sb2 = new StringBuilder("expected at least three parts in version name; VERSION_NAME=");
        sb2.append("2.23.1.76");
        throw new AssertionError(sb2.toString());
    }
}
