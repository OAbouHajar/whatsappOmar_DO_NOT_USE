package X;

import android.util.SparseArray;
import java.util.Set;

/* renamed from: X.21O  reason: invalid class name */
public final /* synthetic */ class AnonymousClass21O implements AnonymousClass01J {
    public final /* synthetic */ AnonymousClass1GC A00;
    public final /* synthetic */ AnonymousClass01D A01;

    public /* synthetic */ AnonymousClass21O(AnonymousClass1GC r1, AnonymousClass01D r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final Object get() {
        SparseArray sparseArray = new SparseArray(79);
        for (AnonymousClass1Q5 r5 : (Set) this.A01.get()) {
            int[] ACW = r5.ACW();
            int length = ACW.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    int i3 = ACW[i2];
                    if (sparseArray.get(i3) == null) {
                        sparseArray.put(i3, r5);
                        i2++;
                    } else {
                        StringBuilder sb = new StringBuilder("Already have registered serializer message type:");
                        sb.append(i3);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return sparseArray;
    }
}
