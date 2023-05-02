package X;

/* renamed from: X.0fH  reason: invalid class name and case insensitive filesystem */
public class C09300fH implements Runnable {
    public final /* synthetic */ AnonymousClass0ZW A00;

    public C09300fH(AnonymousClass0ZW r1) {
        this.A00 = r1;
    }

    public void run() {
        AnonymousClass0CV r1 = this.A00.A0B;
        if (r1 != null) {
            r1.A0B = true;
            r1.requestLayout();
        }
    }
}
