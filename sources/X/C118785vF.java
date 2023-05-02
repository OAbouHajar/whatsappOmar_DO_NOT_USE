package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5vF  reason: invalid class name and case insensitive filesystem */
public class C118785vF {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final AtomicInteger A04;
    public final /* synthetic */ AnonymousClass5zA A05;

    public C118785vF(AnonymousClass5zA r5, long j2) {
        this.A05 = r5;
        if (j2 < 0) {
            r5.A05(AnonymousClass000.A0h("bloks_query", AnonymousClass000.A0r("Negative Cache Recency Threshold Entered For Query: ")));
        }
        r5.A0A.add("bloks_query");
        r5.AKk(AnonymousClass000.A0h("bloks_query", AnonymousClass000.A0r("recency_threshold_for_")), j2);
        this.A04 = new AtomicInteger(0);
        this.A03 = j2;
    }

    public static C03780Jv A00(C118785vF r1) {
        return C03780Jv.values()[r1.A04.get()];
    }

    public void A01() {
        AnonymousClass5zA r2;
        String str;
        C03780Jv A002 = A00(this);
        String str2 = "CACHE";
        if (A002 == C03780Jv.QUERY_SUCCESSFULLY_COMPLETED) {
            if (!this.A02 || this.A01) {
                r2 = this.A05;
                str = AnonymousClass000.A0h("bloks_query", AnonymousClass000.A0q("ttrc_source_for_"));
                str2 = "NETWORK";
                r2.AKl(str, str2);
            }
        } else if (A002 != C03780Jv.CACHE_DONE_NETWORK_PENDING || this.A00) {
            if (A002 != C03780Jv.QUERY_NOT_NEEDED) {
                this.A05.A05(AnonymousClass000.A0g("Unexpected call to addSourceAnnotation in state ", A002));
                return;
            }
            return;
        }
        r2 = this.A05;
        str = AnonymousClass000.A0h("bloks_query", AnonymousClass000.A0q("ttrc_source_for_"));
        r2.AKl(str, str2);
    }

    public final boolean A02(C03780Jv r6) {
        int ordinal = r6.ordinal();
        int i2 = C115695qA.A00[ordinal];
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 3) {
                return this.A04.compareAndSet(0, ordinal);
            }
            if (i2 == 4 || i2 == 5) {
                AtomicInteger atomicInteger = this.A04;
                return atomicInteger.compareAndSet(0, ordinal) || atomicInteger.compareAndSet(2, ordinal) || atomicInteger.compareAndSet(1, ordinal);
            }
        }
        return false;
    }
}
