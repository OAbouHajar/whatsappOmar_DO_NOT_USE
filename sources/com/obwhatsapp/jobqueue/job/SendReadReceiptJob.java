package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C15830rv;
import X.C16150sX;
import X.C16440t3;
import X.C17190ug;
import X.C19790z0;
import X.C207811o;
import X.C28791Xq;
import android.content.Context;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import org.whispersystems.jobqueue.Job;

public final class SendReadReceiptJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C16440t3 A00;
    public transient C17190ug A01;
    public transient C19790z0 A02;
    public transient C207811o A03;
    public final String jid;
    public final long loggableStanzaId;
    public final String[] messageIds;
    public final long originalMessageTimestamp;
    public final String participant;
    public final String remoteSender;
    public final boolean shouldForceReadSelfReceipt;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendReadReceiptJob(X.C15830rv r6, X.C15830rv r7, com.whatsapp.jid.DeviceJid r8, java.lang.String[] r9, long r10, long r12, boolean r14) {
        /*
            r5 = this;
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r3 = 0
            java.lang.String r0 = "read-receipt-"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r6.getRawString()
            r1.append(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.String r0 = X.C16030sJ.A03(r7)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r4.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r4, r1)
            r5.<init>(r0)
            java.lang.String r0 = r6.getRawString()
            X.AnonymousClass00B.A06(r0)
            r5.jid = r0
            r0 = 0
            if (r7 == 0) goto L_0x0045
            java.lang.String r3 = r7.getRawString()
        L_0x0045:
            r5.participant = r3
            if (r8 == 0) goto L_0x004d
            java.lang.String r0 = r8.getRawString()
        L_0x004d:
            r5.remoteSender = r0
            X.AnonymousClass00B.A0J(r9)
            r5.messageIds = r9
            r5.originalMessageTimestamp = r10
            r5.shouldForceReadSelfReceipt = r14
            r5.loggableStanzaId = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendReadReceiptJob.<init>(X.0rv, X.0rv, com.whatsapp.jid.DeviceJid, java.lang.String[], long, long, boolean):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (Jid.getNullable(this.jid) != null) {
            String[] strArr = this.messageIds;
            if (strArr == null || strArr.length == 0) {
                throw new InvalidObjectException("messageIds must not be empty");
            }
        } else if (!yo.BlueTi(this)) {
            throw new InvalidObjectException("jid must not be empty");
        }
    }

    public final String A04() {
        C15830rv A022 = C15830rv.A02(this.jid);
        C15830rv A023 = C15830rv.A02(this.participant);
        DeviceJid nullable = DeviceJid.getNullable(this.remoteSender);
        StringBuilder sb = new StringBuilder("; jid=");
        sb.append(A022);
        sb.append("; participant=");
        sb.append(A023);
        sb.append("; remoteSender=");
        sb.append(nullable);
        sb.append("; shouldForceReadSelfReceipt=");
        sb.append(this.shouldForceReadSelfReceipt);
        sb.append("; ids:");
        sb.append(Arrays.deepToString(this.messageIds));
        return sb.toString();
    }

    public void Adl(Context context) {
        AnonymousClass01F r1 = (AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class);
        this.A00 = r1.Agj();
        C16150sX r12 = (C16150sX) r1;
        this.A01 = (C17190ug) r12.AEu.get();
        this.A02 = (C19790z0) r12.AKg.get();
        this.A03 = (C207811o) r12.ADe.get();
    }
}
