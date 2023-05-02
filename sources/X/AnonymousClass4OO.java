package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.util.SparseIntArray;

/* renamed from: X.4OO  reason: invalid class name */
public class AnonymousClass4OO {
    public final C12190jz A00;
    public final C88144a1 A01;
    public final C88144a1 A02;
    public final C88144a1 A03;
    public final C88144a1 A04;
    public final AnonymousClass5Kx A05;
    public final AnonymousClass5Kx A06;
    public final AnonymousClass5Kx A07;

    public AnonymousClass4OO() {
        C08800eM r0;
        int i2;
        AnonymousClass4YG.A00();
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        this.A01 = new C88144a1(AnonymousClass4YE.A00, 0, min > 16777216 ? (min >> 2) * 3 : min >> 1, -1);
        this.A05 = C95734nA.A00();
        int i3 = AnonymousClass48c.A00;
        int i4 = i3 * 4194304;
        int i5 = 131072;
        SparseIntArray sparseIntArray = new SparseIntArray();
        do {
            sparseIntArray.put(i5, i3);
            i5 <<= 1;
        } while (i5 <= 4194304);
        this.A02 = new C88144a1(sparseIntArray, 4194304, i4, i3);
        synchronized (C08800eM.class) {
            r0 = C08800eM.A00;
            if (r0 == null) {
                r0 = new C08800eM();
                C08800eM.A00 = r0;
            }
        }
        this.A00 = r0;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1024, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START, 2);
        sparseIntArray2.put(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END, 2);
        sparseIntArray2.put(AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START, 2);
        int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min2 < 16777216) {
            i2 = 3145728;
        } else {
            i2 = 12582912;
            if (min2 < 33554432) {
                i2 = 6291456;
            }
        }
        int min3 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        this.A03 = new C88144a1(sparseIntArray2, i2, min3 < 16777216 ? min3 >> 1 : (min3 >> 2) * 3, -1);
        this.A06 = C95734nA.A00();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.A04 = new C88144a1(sparseIntArray3, 81920, AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START, -1);
        this.A07 = C95734nA.A00();
        AnonymousClass4YG.A00();
    }
}
