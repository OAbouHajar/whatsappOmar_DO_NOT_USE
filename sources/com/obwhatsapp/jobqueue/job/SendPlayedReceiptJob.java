package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C16150sX;
import X.C17190ug;
import X.C28791Xq;
import android.content.Context;
import android.text.TextUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

@Deprecated
public final class SendPlayedReceiptJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C17190ug A00;
    public final String messageId;
    public final String remoteJidRawJid;
    public final String remoteResourceRawJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPlayedReceiptJob(X.C16740tZ r7) {
        /*
            r6 = this;
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.lang.String r0 = "played-receipt-"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r4 = r7.A11
            X.0rv r3 = r4.A00
            X.AnonymousClass00B.A06(r3)
            java.lang.String r0 = r3.getRawString()
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r5.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r5, r1)
            r6.<init>(r0)
            java.lang.String r0 = r3.getRawString()
            r6.remoteJidRawJid = r0
            X.0rv r0 = r7.A0B()
            java.lang.String r0 = X.C16030sJ.A03(r0)
            r6.remoteResourceRawJid = r0
            java.lang.String r0 = r4.A01
            r6.messageId = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendPlayedReceiptJob.<init>(X.0tZ):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.remoteJidRawJid)) {
            throw new InvalidObjectException("remoteJid must not be empty");
        } else if (TextUtils.isEmpty(this.messageId)) {
            throw new InvalidObjectException("messageId must not be empty");
        }
    }

    public void Adl(Context context) {
        this.A00 = (C17190ug) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class))).AEu.get();
    }
}
