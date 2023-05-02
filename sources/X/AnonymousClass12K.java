package X;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.12K  reason: invalid class name */
public class AnonymousClass12K implements C18950xW, C18000vz {
    public boolean A00;
    public boolean A01;
    public final C14870pt A02;
    public final C16600tK A03;
    public final C18260wP A04;
    public final AnonymousClass175 A05;
    public final AnonymousClass17P A06;
    public final C18300wT A07;
    public final AnonymousClass1TU A08;
    public final AnonymousClass1MA A09;
    public final AnonymousClass1Vo A0A = AnonymousClass1Vo.A00("PaymentsConnectivityManager", "network", "COMMON");

    public AnonymousClass12K(C14870pt r4, C16600tK r5, C18260wP r6, AnonymousClass175 r7, AnonymousClass17P r8, C18300wT r9, AnonymousClass1TU r10, AnonymousClass1MA r11) {
        this.A02 = r4;
        this.A03 = r5;
        this.A07 = r9;
        this.A05 = r7;
        this.A06 = r8;
        this.A09 = r11;
        this.A04 = r6;
        this.A08 = r10;
    }

    public final void A00() {
        Map map;
        Set keySet;
        AnonymousClass1TV r2;
        AnonymousClass17P r6 = this.A06;
        synchronized (r6) {
            map = r6.A00;
            keySet = map.keySet();
        }
        for (Object next : keySet) {
            synchronized (r6) {
                r2 = (AnonymousClass1TV) map.get(next);
            }
            AnonymousClass2HJ r1 = new AnonymousClass2HJ(7);
            synchronized (r6) {
                r6.A02.remove(next);
            }
            r2.AWI(r1);
        }
        r6.A00();
        this.A01 = false;
    }

    public synchronized void AP4(AnonymousClass1UX r5) {
        AnonymousClass1Vo r3 = this.A0A;
        StringBuilder sb = new StringBuilder();
        sb.append("Connectivity connected: ");
        boolean z2 = r5.A01;
        sb.append(z2);
        r3.A06(sb.toString());
        if (this.A00 && !z2) {
            A00();
        }
    }

    public synchronized void ARy() {
        AnonymousClass175 r0;
        this.A0A.A06("ChatConnectivity connected");
        if (this.A00 && (r0 = this.A05) != null && r0.A0E()) {
            C18300wT r1 = this.A07;
            if (r1.A01.A00() - r1.A01().getLong("payments_pending_transactions_last_sync_time", 0) > TimeUnit.DAYS.toMillis(1)) {
                this.A08.A00(new AnonymousClass505(this));
            }
        }
    }

    public /* synthetic */ void ARz() {
    }

    public synchronized void AS0() {
        this.A0A.A06("ChatConnectivity disconnected");
        if (this.A00) {
            A00();
        }
    }

    public /* synthetic */ void AS1() {
    }
}
