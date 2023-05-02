package X;

/* renamed from: X.1Zv  reason: invalid class name and case insensitive filesystem */
public final class C29041Zv {
    public static int closedTableSize(int i2, double d2) {
        int max = Math.max(i2, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d2 * ((double) highestOneBit)))) {
            return highestOneBit;
        }
        int i3 = highestOneBit << 1;
        if (i3 <= 0) {
            return 1073741824;
        }
        return i3;
    }

    public static int smear(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * -862048943), 15)) * 461845907);
    }

    public static int smearedHash(Object obj) {
        return smear(obj == null ? 0 : obj.hashCode());
    }
}
