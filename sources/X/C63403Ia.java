package X;

import com.obwhatsapp.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.3Ia  reason: invalid class name and case insensitive filesystem */
public class C63403Ia implements Callable {
    public final /* synthetic */ C14990q7 A00;
    public final /* synthetic */ AnonymousClass4CF A01;
    public final /* synthetic */ C95844nN A02;
    public final /* synthetic */ AnonymousClass4TL A03;
    public final /* synthetic */ Map A04;

    public C63403Ia(C14990q7 r1, AnonymousClass4CF r2, C95844nN r3, AnonymousClass4TL r4, Map map) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = map;
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        C14990q7 r6 = this.A00;
        AnonymousClass4TL r5 = this.A03;
        Map map = this.A04;
        AnonymousClass4CF r0 = this.A01;
        AnonymousClass4O3 r7 = r0 != null ? r0.A00 : null;
        C99324tq r10 = C99324tq.A00;
        AnonymousClass4K0 A012 = C90154da.A01(r6.A02.A01);
        r6.A02(R.id.bk_context_key_performance_logger);
        AnonymousClass4B7.A00.getAndIncrement();
        C89644cb.A01("Bloks Bind");
        C88964bN r4 = r5.A00;
        HashMap hashMap = new HashMap(r4.A03);
        hashMap.putAll(map);
        AnonymousClass4O3 A002 = C617039z.A00(AnonymousClass4YH.A00, r6, r7, new C88964bN(r4.A02, r4.A01, hashMap, r4.A00), r5.A01, r10, A012);
        AnonymousClass4BI.A00.incrementAndGet();
        C89644cb.A00();
        return C13690nt.A0I(A002.A01, new AnonymousClass4CF(A002));
    }
}
