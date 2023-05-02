package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass13B;
import X.C16150sX;
import X.C17190ug;
import X.C28791Xq;
import android.content.Context;
import android.text.TextUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class SendMediaErrorReceiptJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass13B A00;
    public transient C17190ug A01;
    public final String category;
    public final boolean mediaFromMe;
    public final byte[] mediaKey;
    public final String messageId;
    public final String myPrimaryJid;
    public final String remoteJidRawJid;
    public final String remoteResourceRawJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendMediaErrorReceiptJob(X.C15830rv r5, X.C16740tZ r6, java.lang.String r7, byte[] r8) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r2 = "media-error-receipt"
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r4.<init>(r0)
            X.1Vw r1 = r6.A11
            X.0rv r0 = r1.A00
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.getRawString()
            r4.remoteJidRawJid = r0
            X.0rv r0 = r6.A0B()
            java.lang.String r0 = X.C16030sJ.A03(r0)
            r4.remoteResourceRawJid = r0
            java.lang.String r0 = X.C16030sJ.A03(r5)
            r4.myPrimaryJid = r0
            java.lang.String r0 = r1.A01
            r4.messageId = r0
            r4.mediaKey = r8
            r4.category = r7
            boolean r0 = r1.A02
            r4.mediaFromMe = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendMediaErrorReceiptJob.<init>(X.0rv, X.0tZ, java.lang.String, byte[]):void");
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
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class));
        this.A01 = (C17190ug) r1.AEu.get();
        this.A00 = (AnonymousClass13B) r1.AL8.get();
    }
}
