package X;

import java.util.concurrent.Callable;

/* renamed from: X.670  reason: invalid class name */
public class AnonymousClass670 implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass5zC A01;

    public AnonymousClass670(AnonymousClass5zC r1, long j2) {
        this.A01 = r1;
        this.A00 = j2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        AnonymousClass5zC r5 = this.A01;
        long j2 = this.A00;
        if (r5.A0e) {
            r5.A08();
            r5.A07.A02(C119235wl.A0K, Long.valueOf(j2));
            return r5.A07;
        }
        throw AnonymousClass000.A0V("Not recording video.");
    }
}
