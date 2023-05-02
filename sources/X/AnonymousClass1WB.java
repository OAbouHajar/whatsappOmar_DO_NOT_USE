package X;

import com.whatsapp.util.RunnableTRunnableShape1S0200000_I0;

/* renamed from: X.1WB  reason: invalid class name */
public class AnonymousClass1WB extends AnonymousClass1WC {
    public final /* synthetic */ C18930xU A00;

    public AnonymousClass1WB(C18930xU r1) {
        this.A00 = r1;
    }

    public void A00(C17380uz r3) {
        C18930xU r1 = this.A00;
        if (!r1.A07.A0G()) {
            r1.A0n.Acl(new RunnableTRunnableShape1S0200000_I0(r3, this));
        }
    }

    public void A03(AnonymousClass1WF r12) {
        C18930xU r8 = this.A00;
        if (r8.A0c.A07().size() == 1 && !r8.A07.A0G()) {
            AnonymousClass19E r9 = r8.A0N;
            long A002 = r9.A02.A00();
            AnonymousClass139 r10 = r9.A01;
            r10.A01().edit().putLong("syncd_first_companion_reg_logging_time", A002).apply();
            long j2 = r10.A01().getLong("syncd_last_companion_dereg_logging_time", 0);
            if (j2 != 0) {
                r10.A01().edit().remove("syncd_last_companion_dereg_logging_time").apply();
                C74403qU r1 = new C74403qU();
                r1.A00 = Long.valueOf(A002 - j2);
                r9.A06.A06(r1);
            }
            r8.A0K();
            r8.A0N();
        }
    }
}
