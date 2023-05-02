package X;

import android.content.Context;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.1Xp  reason: invalid class name and case insensitive filesystem */
public class C28781Xp extends Job implements C28791Xq {
    public transient C14860ps A00;
    public transient AnonymousClass1H4 A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28781Xp() {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2 = 0
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r4.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28781Xp.<init>():void");
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class));
        AnonymousClass01J r2 = r1.API;
        this.A01 = new AnonymousClass1H4((C14870pt) r1.AB3.get(), (C17190ug) r1.AEu.get(), C17270uo.A00(r2));
        this.A00 = (C14860ps) r2.get();
    }
}
