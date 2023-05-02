package X;

/* renamed from: X.0we  reason: invalid class name and case insensitive filesystem */
public abstract class C18410we {
    public static int expandedCapacity(int i2, int i3) {
        int i4 = i2 + (i2 >> 1) + 1;
        if (i4 >= i3) {
            return i4;
        }
        int highestOneBit = Integer.highestOneBit(i3 - 1) << 1;
        if (highestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return highestOneBit;
    }

    public abstract C18410we add(Object obj);

    public C18410we addAll(Iterable iterable) {
        for (Object add : iterable) {
            add(add);
        }
        return this;
    }
}
