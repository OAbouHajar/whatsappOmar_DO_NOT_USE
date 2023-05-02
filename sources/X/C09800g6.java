package X;

import java.util.ArrayList;

/* renamed from: X.0g6  reason: invalid class name and case insensitive filesystem */
public class C09800g6 implements Runnable {
    public final /* synthetic */ C02790Ey A00;
    public final /* synthetic */ ArrayList A01;

    public C09800g6(C02790Ey r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                AnonymousClass000.A0N(arrayList, size).setVisibility(4);
            } else {
                return;
            }
        }
    }
}
