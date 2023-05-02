package X;

import java.util.Map;

/* renamed from: X.4Ro  reason: invalid class name */
public final class AnonymousClass4Ro {
    public final /* synthetic */ AnonymousClass1IC A00;
    public final /* synthetic */ AnonymousClass1VZ A01;
    public final /* synthetic */ C77633w6 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;

    public AnonymousClass4Ro(AnonymousClass1IC r1, AnonymousClass1VZ r2, C77633w6 r3, String str, Map map) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
        this.A04 = map;
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass1VZ r4 = this.A01;
        AnonymousClass4TZ r3 = r4.A02;
        if (r3 == null) {
            throw C18450wi.A03("fcsLoadingEventManager");
        }
        r3.A01((Map) null, "onLoadingCompletion", r4.A05);
        C77633w6 r32 = this.A02;
        Map map = this.A04;
        r4.A05(r32, map);
        r4.A03(this.A00, r32, map, false);
    }
}
