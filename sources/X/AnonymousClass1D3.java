package X;

import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.1D3  reason: invalid class name */
public class AnonymousClass1D3 implements C23691Cz {
    public final C18930xU A00;
    public final C19360yJ A01;
    public final AnonymousClass1D1 A02;
    public final C217515h A03;

    public AnonymousClass1D3(C18930xU r1, C19360yJ r2, AnonymousClass1D1 r3, C217515h r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void AMa() {
        AnonymousClass19H r1;
        Log.i("SyncdAsyncAppUpdatedObserver/onAsyncAppUpdated");
        C18930xU r3 = this.A00;
        if (r3.A0X()) {
            this.A01.A00();
            C217515h r5 = this.A03;
            synchronized (r5) {
                for (AnonymousClass1WJ r12 : r5.A03.A07(new C101914y6(), "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 ORDER BY _id ASC", (String[]) null)) {
                    C20380zx A002 = r5.A00(r12);
                    if (A002 != null) {
                        A002.A03(r12);
                    }
                }
            }
            r3.A0K();
            AnonymousClass1D1 r13 = this.A02;
            C18930xU r2 = r13.A01;
            if (r2.A0X() && !r13.A00.A0G() && (r1 = (AnonymousClass19H) r13.A02.A02("primary_version")) != null) {
                r2.A0S(Collections.singleton(r1.A0A("current")));
            }
            r3.A0N();
        }
    }

    public /* synthetic */ void AMb() {
    }
}
