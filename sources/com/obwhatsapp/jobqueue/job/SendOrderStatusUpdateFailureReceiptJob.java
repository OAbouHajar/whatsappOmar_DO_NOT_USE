package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C15830rv;
import X.C16150sX;
import X.C17190ug;
import X.C28791Xq;
import X.C30641ci;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import org.whispersystems.jobqueue.Job;

public final class SendOrderStatusUpdateFailureReceiptJob extends Job implements C28791Xq {
    public transient C17190ug A00;
    public final String jid;
    public final String messageKeyId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendOrderStatusUpdateFailureReceiptJob(X.C15830rv r5, java.lang.String r6) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r0 = "order-status-update-failure-"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.getRawString()
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r4.<init>(r0)
            java.lang.String r0 = r5.getRawString()
            r4.jid = r0
            r4.messageKeyId = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob.<init>(X.0rv, java.lang.String):void");
    }

    public void A01() {
        C15830rv A02 = C15830rv.A02(this.jid);
        HashMap hashMap = new HashMap();
        C30641ci r5 = new C30641ci(A02, (Jid) null, (UserJid) null, "receipt", this.messageKeyId, "error", (String) null, (String) null, hashMap.isEmpty() ? null : new ArrayList(hashMap.values()), 0);
        C17190ug r4 = this.A00;
        String str = this.messageKeyId;
        Message obtain = Message.obtain((Handler) null, 0, 295, 0, A02);
        obtain.getData().putString("messageKeyId", str);
        r4.A04(obtain, r5).get();
    }

    public void Adl(Context context) {
        this.A00 = (C17190ug) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class))).AEu.get();
    }
}
