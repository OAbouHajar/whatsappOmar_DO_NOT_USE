package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass11R;
import X.AnonymousClass16P;
import X.C16040sK;
import X.C16150sX;
import X.C18920xT;
import X.C20340zt;
import X.C208211s;
import X.C28791Xq;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class SendRetryReceiptJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C16040sK A00;
    public transient AnonymousClass11R A01;
    public transient C208211s A02;
    public transient AnonymousClass16P A03;
    public transient C18920xT A04;
    public transient C20340zt A05;
    public final String category;
    public final String id;
    public final String jid;
    public final int localRegistrationId;
    public final long loggableStanzaId;
    public final String participant;
    public final String recipientJid;
    public final int retryCount;
    public final long timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendRetryReceiptJob(X.C30161br r6, int r7) {
        /*
            r5 = this;
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.String r0 = "retry-receipt-"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            com.whatsapp.jid.Jid r3 = r6.A0k
            X.0rv r0 = X.C16030sJ.A00(r3)
            java.lang.String r0 = X.C16030sJ.A03(r0)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r4.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r4, r1)
            r5.<init>(r0)
            X.AnonymousClass00B.A06(r3)
            java.lang.String r0 = r3.getRawString()
            r5.jid = r0
            java.lang.String r0 = r6.A0o
            X.AnonymousClass00B.A06(r0)
            r5.id = r0
            com.whatsapp.jid.Jid r0 = r6.A08
            java.lang.String r0 = X.C16030sJ.A03(r0)
            r5.participant = r0
            com.whatsapp.jid.UserJid r0 = r6.A0l
            java.lang.String r0 = X.C16030sJ.A03(r0)
            r5.recipientJid = r0
            long r0 = r6.A0j
            r5.timestamp = r0
            int r0 = r6.A00()
            r5.retryCount = r0
            r5.localRegistrationId = r7
            long r0 = r6.A06
            r5.loggableStanzaId = r0
            java.lang.String r0 = r6.A0R
            r5.category = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendRetryReceiptJob.<init>(X.1br, int):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (Jid.getNullable(this.jid) == null) {
            throw new InvalidObjectException("jid must not be empty");
        } else if (TextUtils.isEmpty(this.id)) {
            throw new InvalidObjectException("id must not be empty");
        }
    }

    public String A04() {
        Jid nullable = Jid.getNullable(this.jid);
        Jid nullable2 = Jid.getNullable(this.participant);
        StringBuilder sb = new StringBuilder("; jid=");
        sb.append(nullable);
        sb.append("; id=");
        sb.append(this.id);
        sb.append("; participant=");
        sb.append(nullable2);
        sb.append("; retryCount=");
        sb.append(this.retryCount);
        return sb.toString();
    }

    public void Adl(Context context) {
        AnonymousClass01F r2 = (AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class);
        C16150sX r1 = (C16150sX) r2;
        this.A00 = (C16040sK) r1.ADr.get();
        this.A04 = (C18920xT) r1.AMZ.get();
        this.A03 = (AnonymousClass16P) r1.AMY.get();
        this.A02 = (C208211s) r1.AMX.get();
        this.A05 = r2.A1L();
        this.A01 = (AnonymousClass11R) r1.A4a.get();
    }
}
