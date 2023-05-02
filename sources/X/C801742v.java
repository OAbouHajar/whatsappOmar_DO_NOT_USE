package X;

/* renamed from: X.42v  reason: invalid class name and case insensitive filesystem */
public enum C801742v {
    TERMINATOR(0, 0),
    NUMERIC(1, 1),
    ALPHANUMERIC(2, 2),
    STRUCTURED_APPEND(3, 3),
    BYTE(4, 4),
    ECI(5, 7),
    KANJI(6, 8),
    FNC1_FIRST_POSITION(7, 5),
    FNC1_SECOND_POSITION(8, 9),
    HANZI(9, 13);
    
    public final int bits;
    public final int[] characterCountBitsForVersions;

    /* access modifiers changed from: public */
    C801742v(int i2, int i3) {
        this.characterCountBitsForVersions = r2;
        this.bits = i3;
    }

    public int A00(C90474eC r4) {
        char c2;
        int i2 = r4.A01;
        if (i2 <= 9) {
            c2 = 0;
        } else {
            c2 = 2;
            if (i2 <= 26) {
                c2 = 1;
            }
        }
        return this.characterCountBitsForVersions[c2];
    }
}
