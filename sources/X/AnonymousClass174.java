package X;

import android.text.TextUtils;
import com.obwhatsapp.Me;

/* renamed from: X.174  reason: invalid class name */
public class AnonymousClass174 {
    public C30681cm A00;
    public boolean A01;
    public final C16040sK A02;
    public final C18490wm A03;
    public final C224918d A04;
    public final AnonymousClass1Vo A05 = AnonymousClass1Vo.A00("PaymentsCountryManager", "infra", "COMMON");

    public AnonymousClass174(C16040sK r4, C18490wm r5, C224918d r6) {
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
    }

    public synchronized C28411Vz A00() {
        C30681cm r0;
        if (!this.A01) {
            A02();
        }
        r0 = this.A00;
        return r0 != null ? r0.A02 : null;
    }

    public synchronized C30681cm A01() {
        if (!this.A01) {
            A02();
        }
        return this.A00;
    }

    public final synchronized void A02() {
        String str;
        String str2;
        AnonymousClass1Vo r3 = this.A05;
        r3.A03((String) null, "tryInitFromMock: no mockedCountry");
        C16040sK r1 = this.A02;
        r1.A0B();
        Me me = r1.A00;
        if (me != null) {
            str = me.number;
            str2 = me.cc;
        } else {
            str = null;
            str2 = null;
        }
        r1.A0B();
        if (r1.A05 == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("phoneNumber:");
            sb.append(str);
            sb.append(" countryCode:");
            sb.append(str2);
            r3.A06(sb.toString());
        } else {
            C30681cm A012 = C30681cm.A01(str2);
            if (A012 == C30681cm.A0F) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("not enabled with unsupported country code: ");
                sb2.append(str2);
                r3.A03((String) null, sb2.toString());
                this.A00 = null;
            } else {
                this.A00 = A012;
                StringBuilder sb3 = new StringBuilder("init enabled for country: ");
                sb3.append(A012.A03);
                sb3.append(" and default currency: ");
                sb3.append(((C35491m1) A012.A02).A04);
                r3.A06(sb3.toString());
            }
            this.A01 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        if (r1 == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A03() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A01     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x0008
            r2.A02()     // Catch:{ all -> 0x0014 }
        L_0x0008:
            X.1cm r0 = r2.A00     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0011
            boolean r1 = r0.A06     // Catch:{ all -> 0x0014 }
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            monitor-exit(r2)
            return r0
        L_0x0014:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass174.A03():boolean");
    }
}
