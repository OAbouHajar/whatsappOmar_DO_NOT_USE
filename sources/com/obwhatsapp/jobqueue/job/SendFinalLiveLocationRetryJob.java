package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass16P;
import X.AnonymousClass1HD;
import X.AnonymousClass1P7;
import X.C16040sK;
import X.C16150sX;
import X.C208211s;
import X.C27471Rw;
import X.C28791Xq;
import android.content.Context;
import android.text.TextUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class SendFinalLiveLocationRetryJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C16040sK A00;
    public transient AnonymousClass1HD A01;
    public transient C208211s A02;
    public transient AnonymousClass16P A03;
    public transient AnonymousClass1P7 A04;
    public transient C27471Rw A05;
    public final String contextRawJid;
    public final double latitude;
    public final double longitude;
    public final String msgId;
    public final String rawDeviceJid;
    public final int retryCount;
    public final int timeOffset;
    public final long timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendFinalLiveLocationRetryJob(com.whatsapp.jid.DeviceJid r5, X.C28381Vw r6, X.C39721sx r7, byte[] r8, int r9, int r10) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            if (r8 == 0) goto L_0x0012
            int r0 = r8.length
            if (r0 != 0) goto L_0x0012
            java.lang.String r1 = "cannot use empty old alice base key"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0012:
            com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r5)
            r3.add(r0)
            if (r8 == 0) goto L_0x0024
            com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r0 = new com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            r0.<init>(r5, r8)
            r3.add(r0)
        L_0x0024:
            java.lang.String r1 = "final-live-location-"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r2 = r0.toString()
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r4.<init>(r0)
            r0 = 0
            if (r10 <= 0) goto L_0x0047
            r0 = 1
        L_0x0047:
            X.AnonymousClass00B.A0G(r0)
            java.lang.String r0 = r5.getRawString()
            r4.rawDeviceJid = r0
            X.0rv r1 = r6.A00
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = X.C16030sJ.A03(r1)
        L_0x005c:
            r4.contextRawJid = r0
            java.lang.String r0 = r6.A01
            r4.msgId = r0
            double r0 = r7.A00
            r4.latitude = r0
            double r0 = r7.A01
            r4.longitude = r0
            long r0 = r7.A05
            r4.timestamp = r0
            r4.timeOffset = r9
            r4.retryCount = r10
            return
        L_0x0073:
            r0 = 0
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendFinalLiveLocationRetryJob.<init>(com.whatsapp.jid.DeviceJid, X.1Vw, X.1sx, byte[], int, int):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawDeviceJid)) {
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
        sb.append(this.rawDeviceJid);
        sb.append("; msgId=");
        sb.append(this.msgId);
        sb.append("; location.timestamp=");
        sb.append(this.timestamp);
        return sb.toString();
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class));
        this.A00 = (C16040sK) r1.ADr.get();
        this.A04 = (AnonymousClass1P7) r1.ADc.get();
        this.A03 = (AnonymousClass16P) r1.AMY.get();
        this.A02 = (C208211s) r1.AMX.get();
        this.A05 = (C27471Rw) r1.ADd.get();
        this.A01 = (AnonymousClass1HD) r1.AJ0.get();
    }
}
