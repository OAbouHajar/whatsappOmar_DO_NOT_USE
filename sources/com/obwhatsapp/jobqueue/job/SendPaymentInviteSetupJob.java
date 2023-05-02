package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C16150sX;
import X.C17190ug;
import X.C18310wU;
import X.C28791Xq;
import android.content.Context;
import android.text.TextUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public class SendPaymentInviteSetupJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C17190ug A00;
    public transient C18310wU A01;
    public final boolean inviteUsed;
    public final String jidRawStr;
    public final int paymentService;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPaymentInviteSetupJob(com.whatsapp.jid.UserJid r5, int r6, boolean r7) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r2 = "SendPaymentInviteSetupJob"
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r4.<init>(r0)
            java.lang.String r0 = r5.getRawString()
            r4.jidRawStr = r0
            r4.paymentService = r6
            r4.inviteUsed = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendPaymentInviteSetupJob.<init>(com.whatsapp.jid.UserJid, int, boolean):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.jidRawStr)) {
            throw new InvalidObjectException("jid must not be empty");
        } else if (this.paymentService == 0) {
            throw new InvalidObjectException("payment service must not be unknown");
        }
    }

    public final String A04() {
        StringBuilder sb = new StringBuilder("; jid=");
        sb.append(this.jidRawStr);
        sb.append("; service: ");
        sb.append(this.paymentService);
        sb.append("; inviteUsed: ");
        sb.append(this.inviteUsed);
        sb.append("; persistentId=");
        sb.append(this.A01);
        return sb.toString();
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class));
        this.A00 = (C17190ug) r1.AEu.get();
        this.A01 = (C18310wU) r1.AHz.get();
    }
}
