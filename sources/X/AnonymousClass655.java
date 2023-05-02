package X;

import java.util.List;

/* renamed from: X.655  reason: invalid class name */
public class AnonymousClass655 implements Runnable {
    public final /* synthetic */ AnonymousClass5yI A00;
    public final /* synthetic */ C117165sY[] A01;

    public AnonymousClass655(AnonymousClass5yI r1, C117165sY[] r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void run() {
        List list = this.A00.A00.A0Q.A00;
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass000.A0W("onFaceDetection");
        }
    }
}
