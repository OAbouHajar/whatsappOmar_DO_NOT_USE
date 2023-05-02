package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass16P;
import X.AnonymousClass1GE;
import X.C16040sK;
import X.C16150sX;
import X.C19430yQ;
import X.C208211s;
import X.C27471Rw;
import X.C28791Xq;
import android.content.Context;
import android.text.TextUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class SendFinalLiveLocationNotificationJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C16040sK A00;
    public transient C208211s A01;
    public transient AnonymousClass16P A02;
    public transient AnonymousClass1GE A03;
    public transient C19430yQ A04;
    public transient C27471Rw A05;
    public final double latitude;
    public final double longitude;
    public final String msgId;
    public final String rawJid;
    public final int timeOffset;
    public final long timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendFinalLiveLocationNotificationJob(X.C28381Vw r6, X.C39721sx r7, int r8) {
        /*
            r5 = this;
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.String r0 = "final-live-location-"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.0rv r3 = r6.A00
            java.lang.String r0 = X.C16030sJ.A03(r3)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r4.add(r0)
            com.obwhatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement r0 = new com.obwhatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement
            r0.<init>()
            r4.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r4, r1)
            r5.<init>(r0)
            boolean r0 = r6.A02
            X.AnonymousClass00B.A0G(r0)
            X.AnonymousClass00B.A06(r3)
            java.lang.String r0 = r3.getRawString()
            r5.rawJid = r0
            java.lang.String r0 = r6.A01
            r5.msgId = r0
            double r0 = r7.A00
            r5.latitude = r0
            double r0 = r7.A01
            r5.longitude = r0
            long r0 = r7.A05
            r5.timestamp = r0
            r5.timeOffset = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob.<init>(X.1Vw, X.1sx, int):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawJid)) {
            StringBuilder sb = new StringBuilder("jid must not be empty");
            sb.append(A04());
            throw new InvalidObjectException(sb.toString());
        } else if (TextUtils.isEmpty(this.msgId)) {
            StringBuilder sb2 = new StringBuilder("msgId must not be empty");
            sb2.append(A04());
            throw new InvalidObjectException(sb2.toString());
        } else if (this.timestamp == 0) {
            StringBuilder sb3 = new StringBuilder("location timestamp must not be 0");
            sb3.append(A04());
            throw new InvalidObjectException(sb3.toString());
        }
    }

    public final String A04() {
        StringBuilder sb = new StringBuilder("; persistentId=");
        sb.append(this.A01);
        sb.append("; jid=");
        sb.append(this.rawJid);
        sb.append("; msgId=");
        sb.append(this.msgId);
        sb.append("; location.timestamp=");
        sb.append(this.timestamp);
        return sb.toString();
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class));
        this.A00 = (C16040sK) r1.ADr.get();
        this.A02 = (AnonymousClass16P) r1.AMY.get();
        this.A03 = (AnonymousClass1GE) r1.A1e.get();
        this.A01 = (C208211s) r1.AMX.get();
        this.A05 = (C27471Rw) r1.ADd.get();
        this.A04 = (C19430yQ) r1.ADa.get();
    }
}
