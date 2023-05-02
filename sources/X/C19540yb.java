package X;

import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.obwhatsapp.data.device.IDxDObserverShape76S0100000_1_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0yb  reason: invalid class name and case insensitive filesystem */
public class C19540yb implements C19550yc {
    public Runnable A00;
    public final C16040sK A01;
    public final C15900s5 A02;
    public final C23521Ch A03;
    public final AnonymousClass19E A04;
    public final AnonymousClass139 A05;
    public final C16440t3 A06;
    public final AnonymousClass1WC A07 = new IDxDObserverShape76S0100000_1_I0(this, 1);
    public final C19410yO A08;
    public final C14710pd A09;
    public final C17190ug A0A;
    public final C16320sq A0B;

    public C19540yb(C16040sK r3, C15900s5 r4, C23521Ch r5, AnonymousClass19E r6, AnonymousClass139 r7, C16440t3 r8, C19410yO r9, C14710pd r10, C17190ug r11, C16320sq r12) {
        this.A06 = r8;
        this.A09 = r10;
        this.A01 = r3;
        this.A0B = r12;
        this.A02 = r4;
        this.A0A = r11;
        this.A04 = r6;
        this.A08 = r9;
        this.A05 = r7;
        this.A03 = r5;
    }

    public void A00() {
        C16040sK r4 = this.A01;
        AnonymousClass00B.A0D("Companion device should not call SyncdDeleteAllDataHandler.handleDirtyState", !r4.A0G());
        synchronized (this) {
            Runnable runnable = this.A00;
            if (runnable != null) {
                this.A0B.Ac3(runnable);
                this.A00 = null;
                Log.i("SyncdDeleteAllDataHandler/resetSchedule removed scheduled sync");
            }
        }
        if (A04()) {
            C17190ug r5 = this.A0A;
            C16600tK r1 = r5.A02;
            if (r1.A05 && r1.A08()) {
                AnonymousClass139 r3 = this.A05;
                r3.A05(r3.A01().getInt("syncd_dirty", -1) + 1);
                C19410yO r2 = this.A08;
                if (!r2.A07().isEmpty()) {
                    Log.i("SyncdDeleteAllDataApiHandler/handleDirtyState: logoutAllCompanionDevices");
                    r2.A0C("syncd_failure", false);
                    return;
                }
                Log.i("SyncdDeleteAllDataApiHandler/handleDirtyState: sendDeleteAllDataIq");
                r4.A0B();
                if (r4.A04 != null) {
                    String A022 = r5.A02();
                    StringBuilder sb = new StringBuilder("SyncdDeleteAllDataApiHandler/sendIqWithCallback ");
                    sb.append(A022);
                    Log.i(sb.toString());
                    C32461gQ r32 = new C32461gQ("iq");
                    r32.A02(new C35081lL((Jid) C34791ks.A00, "to"));
                    r32.A02(new C35081lL("xmlns", "w:sync:app:state"));
                    r32.A02(new C35081lL("type", "set"));
                    r32.A02(new C35081lL("id", A022));
                    r32.A03(new C32461gQ("delete_all_data").A01());
                    r5.A0G(this, r32.A01(), A022, 250, 32000);
                }
            }
        }
    }

    public synchronized void A01() {
        boolean A042 = A04();
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdDeleteAllDataHandler/schedule isSyncdDirtyAndShouldRetry = ");
        sb.append(A042);
        Log.i(sb.toString());
        if (A042) {
            this.A00 = this.A0B.Ad4(new RunnableRunnableShape6S0100000_I0_5(this, 16), "SyncdDeleteAllHandler/schedule", 1000);
        } else {
            this.A0B.Acl(new RunnableRunnableShape6S0100000_I0_5(this.A03, 18));
        }
    }

    public void A02(int i2) {
        AnonymousClass00B.A0D("Companion device should not call SyncdDeleteAllDataHandler.markSyncdDirty", !this.A01.A0G());
        Log.i("SyncdDeleteAllDataApiHandler/markSyncdDirty");
        AnonymousClass139 r1 = this.A05;
        r1.A03(i2);
        r1.A01().edit().putLong("syncd_last_fatal_error_time", this.A06.A00()).apply();
    }

    public boolean A03() {
        return this.A05.A01().getInt("syncd_dirty", -1) != -1;
    }

    public boolean A04() {
        int i2 = this.A05.A01().getInt("syncd_dirty", -1);
        return i2 != -1 && i2 < 4;
    }

    public final boolean A05() {
        long j2 = this.A05.A01().getLong("syncd_last_companion_dereg_time", 0);
        boolean z2 = false;
        if (j2 != 0) {
            if (j2 + TimeUnit.MINUTES.toMillis((long) this.A02.A02(C15910s6.A1V)) >= this.A06.A00()) {
                z2 = true;
            }
            StringBuilder sb = new StringBuilder("SyncdDeleteAllDataApiHandler/isInKeepAliveMode: isInKeepAliveMode = ");
            sb.append(z2);
            Log.i(sb.toString());
        }
        return z2;
    }

    public void APb(String str) {
        StringBuilder sb = new StringBuilder("SyncdDeleteAllDataApiHandler/onDeliveryFailure ");
        sb.append(str);
        Log.e(sb.toString());
        A01();
    }

    public void AQe(C28371Vv r4, String str) {
        Pair A012 = C34451kH.A01(r4);
        StringBuilder sb = new StringBuilder("SyncdDeleteAllDataApiHandler/onError ");
        sb.append(A012);
        Log.e(sb.toString());
        A01();
    }

    public void AYG(C28371Vv r4, String str) {
        StringBuilder sb = new StringBuilder("SyncdDeleteAllDataApiHandler/onSuccess ");
        sb.append(str);
        sb.append(" response: ");
        sb.append(r4);
        Log.i(sb.toString());
        this.A0B.Acl(new RunnableRunnableShape6S0100000_I0_5(this, 17));
    }
}
