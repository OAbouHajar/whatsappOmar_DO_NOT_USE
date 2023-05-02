package X;

import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;

/* renamed from: X.1TU  reason: invalid class name */
public class AnonymousClass1TU implements AnonymousClass1TV {
    public int A00;
    public int A01;
    public final C16440t3 A02;
    public final C221116r A03;
    public final AnonymousClass175 A04;
    public final C18300wT A05;
    public final C18090w8 A06;
    public final C18290wS A07;
    public final AnonymousClass1Vo A08 = AnonymousClass1Vo.A00("PaymentUnfinishedTransactionsSyncer", "network", "COMMON");
    public final C16320sq A09;

    public AnonymousClass1TU(C16440t3 r4, C221116r r5, AnonymousClass175 r6, C18300wT r7, C18090w8 r8, C18290wS r9, C16320sq r10) {
        this.A02 = r4;
        this.A09 = r10;
        this.A07 = r9;
        this.A05 = r7;
        this.A04 = r6;
        this.A06 = r8;
        this.A03 = r5;
    }

    public synchronized void A00(AnonymousClass2HL r4) {
        if (!this.A06.A0C(0) || !this.A04.A0E()) {
            this.A08.A06("skipped as account setup is incomplete.");
        } else {
            this.A09.Acl(new RunnableRunnableShape9S0200000_I0_7(this, 18, r4));
        }
    }

    public void AWC(AnonymousClass2HJ r4) {
        AnonymousClass1Vo r2 = this.A08;
        StringBuilder sb = new StringBuilder("onRequestError: ");
        sb.append(r4);
        r2.A05(sb.toString());
        C1222969a ACC = this.A07.A03().ACC();
        if (ACC != null) {
            ACC.AKK(r4, 10);
        }
    }

    public void AWI(AnonymousClass2HJ r4) {
        AnonymousClass1Vo r2 = this.A08;
        StringBuilder sb = new StringBuilder("onResponseError: ");
        sb.append(r4);
        r2.A05(sb.toString());
        C1222969a ACC = this.A07.A03().ACC();
        if (ACC != null) {
            ACC.AKK(r4, 10);
        }
    }

    public void AWJ(AnonymousClass2HK r6) {
        C1222969a ACC = this.A07.A03().ACC();
        if (ACC != null) {
            ACC.AKK((AnonymousClass2HJ) null, 10);
        }
        if (r6.A02) {
            int i2 = this.A00 + 1;
            this.A00 = i2;
            AnonymousClass1Vo r4 = this.A08;
            StringBuilder sb = new StringBuilder("finished syncing ");
            sb.append(i2);
            sb.append(" transactions; total to sync: ");
            sb.append(this.A01);
            r4.A06(sb.toString());
            if (this.A01 == this.A00) {
                long A002 = this.A02.A00();
                this.A05.A01().edit().putLong("payments_pending_transactions_last_sync_time", A002).apply();
                StringBuilder sb2 = new StringBuilder("updatePendingTransactionsLastSyncTimeMilli to: ");
                sb2.append(A002);
                r4.A06(sb2.toString());
            }
        }
    }
}
