package X;

import java.util.List;

/* renamed from: X.63U  reason: invalid class name */
public class AnonymousClass63U implements Runnable {
    public final /* synthetic */ AnonymousClass5xW A00;

    public AnonymousClass63U(AnonymousClass5xW r1) {
        this.A00 = r1;
    }

    public void run() {
        List list = this.A00.A0L.A00;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C117815tb) list.get(i2)).A00();
        }
    }
}
