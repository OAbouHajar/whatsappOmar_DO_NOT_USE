package X;

import java.util.List;

/* renamed from: X.63V  reason: invalid class name */
public class AnonymousClass63V implements Runnable {
    public final /* synthetic */ AnonymousClass5xW A00;

    public AnonymousClass63V(AnonymousClass5xW r1) {
        this.A00 = r1;
    }

    public void run() {
        List list = this.A00.A0M.A00;
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass000.A0W("onPreviewStopped");
        }
    }
}
