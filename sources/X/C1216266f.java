package X;

import java.util.List;
import java.util.UUID;

/* renamed from: X.66f  reason: invalid class name and case insensitive filesystem */
public class C1216266f implements Runnable {
    public final /* synthetic */ AnonymousClass5zC A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ UUID A02;
    public final /* synthetic */ boolean A03;

    public C1216266f(AnonymousClass5zC r1, List list, UUID uuid, boolean z2) {
        this.A00 = r1;
        this.A01 = list;
        this.A03 = z2;
        this.A02 = uuid;
    }

    public void run() {
        List list = this.A01;
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass000.A0W("onError");
        } else if (this.A03) {
            AnonymousClass5zC r2 = this.A00;
            r2.A0S.A02(this.A02);
            r2.A81((C118595uw) null);
        }
    }
}
