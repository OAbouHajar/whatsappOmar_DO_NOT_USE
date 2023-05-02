package X;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: X.0H4  reason: invalid class name */
public class AnonymousClass0H4 extends C009004c {
    public final /* synthetic */ AnonymousClass022 A00;
    public final /* synthetic */ UUID A01;

    public AnonymousClass0H4(AnonymousClass022 r1, UUID uuid) {
        this.A00 = r1;
        this.A01 = uuid;
    }

    /* JADX INFO: finally extract failed */
    public void A00() {
        AnonymousClass022 r3 = this.A00;
        WorkDatabase workDatabase = r3.A04;
        workDatabase.A0A();
        try {
            A01(r3, this.A01.toString());
            workDatabase.A0C();
            workDatabase.A0B();
            C06310Vf.A01(r3.A02, workDatabase, r3.A07);
        } catch (Throwable th) {
            workDatabase.A0B();
            throw th;
        }
    }
}
