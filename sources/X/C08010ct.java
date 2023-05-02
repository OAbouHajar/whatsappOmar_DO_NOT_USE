package X;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: X.0ct  reason: invalid class name and case insensitive filesystem */
public class C08010ct implements C12570kc {
    public final C12080jo A00;
    public final C13360lu A01;
    public final AnonymousClass04d A02;

    static {
        C06530Wm.A01("WMFgUpdater");
    }

    public C08010ct(WorkDatabase workDatabase, C12080jo r3, AnonymousClass04d r4) {
        this.A00 = r3;
        this.A02 = r4;
        this.A01 = workDatabase.A0J();
    }

    public C29981bY Ady(Context context, AnonymousClass0RE r9, UUID uuid) {
        AnonymousClass0H9 A002 = AnonymousClass0H9.A00();
        this.A02.A8p(new C10470hB(context, r9, this, A002, uuid));
        return A002;
    }
}
