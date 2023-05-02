package X;

import java.util.List;

/* renamed from: X.658  reason: invalid class name */
public class AnonymousClass658 implements Runnable {
    public final /* synthetic */ C118215uK A00;
    public final /* synthetic */ List A01;

    public AnonymousClass658(C118215uK r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public void run() {
        List list = this.A01;
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass000.A0W("onPreviewStopped");
        }
    }
}
