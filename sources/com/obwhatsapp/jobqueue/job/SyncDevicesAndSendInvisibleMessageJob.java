package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C16150sX;
import X.C16440t3;
import X.C16460t6;
import X.C19230xz;
import X.C220816o;
import X.C222617g;
import X.C28381Vw;
import X.C28791Xq;
import android.content.Context;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

public class SyncDevicesAndSendInvisibleMessageJob extends Job implements C28791Xq {
    public transient C19230xz A00;
    public transient C220816o A01;
    public transient C16440t3 A02;
    public transient C16460t6 A03;
    public transient C28381Vw A04;
    public transient C222617g A05;
    public transient Set A06 = new HashSet();
    public final String messageId;
    public final String rawGroupJid;
    public final String[] rawUserJids;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncDevicesAndSendInvisibleMessageJob(X.C39121rx r6, com.whatsapp.jid.UserJid[] r7) {
        /*
            r5 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2 = 0
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            com.obwhatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement r0 = new com.obwhatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r5.<init>(r0)
            X.AnonymousClass00B.A0J(r7)
            X.1Vw r3 = r6.A11
            X.0rv r2 = r3.A00
            boolean r1 = r2 instanceof com.whatsapp.jid.GroupJid
            java.lang.String r0 = "Invalid message"
            X.AnonymousClass00B.A0C(r0, r1)
            r5.A04 = r3
            X.AnonymousClass00B.A06(r2)
            java.lang.String r0 = r2.getRawString()
            r5.rawGroupJid = r0
            java.lang.String r0 = r3.A01
            r5.messageId = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5.A06 = r0
            int r4 = r7.length
            r3 = 0
        L_0x0045:
            if (r3 >= r4) goto L_0x0056
            r2 = r7[r3]
            java.util.Set r1 = r5.A06
            java.lang.String r0 = "invalid jid"
            X.AnonymousClass00B.A07(r2, r0)
            r1.add(r2)
            int r3 = r3 + 1
            goto L_0x0045
        L_0x0056:
            java.util.List r0 = java.util.Arrays.asList(r7)
            java.lang.String[] r0 = X.C16030sJ.A0T(r0)
            r5.rawUserJids = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SyncDevicesAndSendInvisibleMessageJob.<init>(X.1rx, com.whatsapp.jid.UserJid[]):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.rawUserJids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw new InvalidObjectException("rawJids must not be empty");
        }
        this.A06 = new HashSet();
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            UserJid nullable = UserJid.getNullable(str);
            if (nullable != null) {
                this.A06.add(nullable);
                i2++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid jid:");
                sb.append(str);
                throw new InvalidObjectException(sb.toString());
            }
        }
        GroupJid nullable2 = GroupJid.getNullable(this.rawGroupJid);
        if (nullable2 != null) {
            this.A04 = new C28381Vw(nullable2, this.messageId, true);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("invalid jid:");
        sb2.append(this.rawGroupJid);
        throw new InvalidObjectException(sb2.toString());
    }

    public final String A04() {
        StringBuilder sb = new StringBuilder("; key=");
        sb.append(this.A04);
        sb.append("; rawJids=");
        sb.append(this.A06);
        return sb.toString();
    }

    public void Adl(Context context) {
        AnonymousClass01F r1 = (AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class);
        this.A02 = r1.Agj();
        C16150sX r12 = (C16150sX) r1;
        this.A05 = (C222617g) r12.A8a.get();
        this.A03 = (C16460t6) r12.A5k.get();
        this.A00 = (C19230xz) r12.A5B.get();
        C220816o r13 = (C220816o) r12.A6p.get();
        this.A01 = r13;
        r13.A01(this.A04);
    }
}
