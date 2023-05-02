package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.4T9  reason: invalid class name */
public final class AnonymousClass4T9 {
    public volatile AtomicReferenceArray array;

    public AnonymousClass4T9(int i2) {
        this.array = new AtomicReferenceArray(i2);
    }

    public final Object A00(int i2) {
        AtomicReferenceArray atomicReferenceArray = this.array;
        if (i2 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i2);
        }
        return null;
    }

    public final void A01(int i2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i2 < length) {
            atomicReferenceArray.set(i2, obj);
            return;
        }
        int i3 = i2 + 1;
        int i4 = length << 1;
        if (i3 < i4) {
            i3 = i4;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(i3);
        for (int i5 = 0; i5 < length; i5++) {
            atomicReferenceArray2.set(i5, atomicReferenceArray.get(i5));
        }
        atomicReferenceArray2.set(i2, obj);
        this.array = atomicReferenceArray2;
    }
}
