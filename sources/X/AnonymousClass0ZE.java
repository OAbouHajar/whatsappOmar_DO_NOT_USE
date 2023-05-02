package X;

import java.util.ArrayDeque;

/* renamed from: X.0ZE  reason: invalid class name */
public class AnonymousClass0ZE implements AnonymousClass07J {
    public final AnonymousClass068 A00;
    public final /* synthetic */ AnonymousClass05Q A01;

    public AnonymousClass0ZE(AnonymousClass068 r1, AnonymousClass05Q r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void cancel() {
        ArrayDeque arrayDeque = this.A01.A01;
        AnonymousClass068 r0 = this.A00;
        arrayDeque.remove(r0);
        r0.A00.remove(this);
    }
}
