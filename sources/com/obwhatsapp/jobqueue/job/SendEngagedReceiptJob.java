package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C16150sX;
import X.C16440t3;
import X.C17190ug;
import X.C18450wi;
import X.C207811o;
import X.C28791Xq;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public final class SendEngagedReceiptJob extends Job implements C28791Xq {
    public transient C16440t3 A00;
    public transient C17190ug A01;
    public transient C207811o A02;
    public final String jidStr;
    public final long loggableStanzaId;
    public final String messageId;
    public final long originalMessageTimestamp;
    public final String source = "quick-reply";
    public final String value;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendEngagedReceiptJob(java.lang.String r6, java.lang.String r7, java.lang.String r8, long r9, long r11) {
        /*
            r5 = this;
            java.lang.String r4 = "quick-reply"
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r0 = "engaged-receipt-"
            java.lang.String r2 = X.C18450wi.A06(r0, r6)
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r5.<init>(r0)
            r5.jidStr = r6
            r5.messageId = r7
            r5.originalMessageTimestamp = r9
            r5.loggableStanzaId = r11
            r5.source = r4
            r5.value = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendEngagedReceiptJob.<init>(java.lang.String, java.lang.String, java.lang.String, long, long):void");
    }

    public final String A04() {
        StringBuilder sb = new StringBuilder("SendEngagedReceiptJob(jidStr='");
        sb.append(this.jidStr);
        sb.append("', messageId='");
        sb.append(this.messageId);
        sb.append("', originalMessageTimestamp=");
        sb.append(this.originalMessageTimestamp);
        sb.append(", loggableStanzaId=");
        sb.append(this.loggableStanzaId);
        sb.append(", source='");
        sb.append(this.source);
        sb.append("', value='");
        sb.append(this.value);
        sb.append("')");
        return sb.toString();
    }

    public void Adl(Context context) {
        C18450wi.A0H(context, 0);
        Context applicationContext = context.getApplicationContext();
        C18450wi.A0B(applicationContext);
        AnonymousClass01F r1 = (AnonymousClass01F) AnonymousClass01I.A00(applicationContext, AnonymousClass01F.class);
        this.A00 = r1.Agj();
        C16150sX r12 = (C16150sX) r1;
        this.A01 = (C17190ug) r12.AEu.get();
        this.A02 = (C207811o) r12.ADe.get();
    }
}
