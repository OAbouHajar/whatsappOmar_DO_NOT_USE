package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C15830rv;
import X.C16150sX;
import X.C17190ug;
import X.C19790z0;
import X.C24541Gi;
import X.C28791Xq;
import android.content.Context;
import android.text.TextUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public class SendPlayedReceiptJobV2 extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C24541Gi A00;
    public transient C17190ug A01;
    public transient C19790z0 A02;
    public final String[] messageIds;
    public final Long[] messageRowIds;
    public final String participantRawJid;
    public final boolean playedSelfFromPeer;
    public final String toRawJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPlayedReceiptJobV2(X.C38561qz r6, boolean r7) {
        /*
            r5 = this;
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.String r0 = "played-receipt-v2-"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.0rv r3 = r6.A01
            java.lang.String r0 = r3.getRawString()
            X.AnonymousClass00B.A06(r0)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r4.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r4, r1)
            r5.<init>(r0)
            java.lang.String r0 = r3.getRawString()
            X.AnonymousClass00B.A06(r0)
            r5.toRawJid = r0
            X.0rv r0 = r6.A00
            if (r0 != 0) goto L_0x004e
            r0 = 0
        L_0x003b:
            r5.participantRawJid = r0
            java.lang.Long[] r0 = r6.A02
            X.AnonymousClass00B.A0J(r0)
            r5.messageRowIds = r0
            java.lang.String[] r0 = r6.A03
            X.AnonymousClass00B.A0J(r0)
            r5.messageIds = r0
            r5.playedSelfFromPeer = r7
            return
        L_0x004e:
            java.lang.String r0 = r0.getRawString()
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendPlayedReceiptJobV2.<init>(X.1qz, boolean):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (!TextUtils.isEmpty(this.toRawJid)) {
            String[] strArr = this.messageIds;
            if (strArr == null || strArr.length == 0) {
                throw new InvalidObjectException("messageIds must not be empty");
            }
            return;
        }
        throw new InvalidObjectException("toJid must not be empty");
    }

    public final String A04() {
        C15830rv A022 = C15830rv.A02(this.toRawJid);
        C15830rv A023 = C15830rv.A02(this.participantRawJid);
        StringBuilder sb = new StringBuilder("; jid=");
        sb.append(A022);
        sb.append("; participant=");
        sb.append(A023);
        sb.append("; id=");
        String[] strArr = this.messageIds;
        sb.append(strArr[0]);
        sb.append("; count=");
        sb.append(strArr.length);
        return sb.toString();
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class));
        this.A01 = (C17190ug) r1.AEu.get();
        this.A02 = (C19790z0) r1.AKg.get();
        this.A00 = (C24541Gi) r1.AIp.get();
    }
}
