package X;

import java.util.List;

/* renamed from: X.657  reason: invalid class name */
public class AnonymousClass657 implements Runnable {
    public final /* synthetic */ C118215uK A00;
    public final /* synthetic */ List A01;

    public AnonymousClass657(C118215uK r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public void run() {
        List list = this.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C117815tb) list.get(i2)).A00();
        }
    }
}
