package X;

import java.util.Vector;

/* renamed from: X.0Id  reason: invalid class name and case insensitive filesystem */
public class C03340Id extends C10670hV {
    public void run() {
        Vector vector = C06220Uu.A02;
        synchronized (vector) {
            int size = vector.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C06220Uu) vector.get(i2)).A01();
            }
        }
    }
}
