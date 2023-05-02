package X;

import java.util.List;
import java.util.UUID;

/* renamed from: X.66D  reason: invalid class name */
public class AnonymousClass66D implements Runnable {
    public final /* synthetic */ AnonymousClass5zD A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ UUID A02;

    public AnonymousClass66D(AnonymousClass5zD r1, List list, UUID uuid) {
        this.A00 = r1;
        this.A01 = list;
        this.A02 = uuid;
    }

    public void run() {
        List list = this.A01;
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass000.A0W("onError");
        }
        AnonymousClass5zD r2 = this.A00;
        r2.A0c.A02(this.A02);
        r2.A81((C118595uw) null);
    }
}
