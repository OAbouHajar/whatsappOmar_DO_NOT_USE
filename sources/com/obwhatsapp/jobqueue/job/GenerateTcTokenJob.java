package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass12G;
import X.AnonymousClass1HG;
import X.C16150sX;
import X.C17190ug;
import X.C28791Xq;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class GenerateTcTokenJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass12G A00;
    public transient UserJid A01;
    public transient C17190ug A02;
    public transient AnonymousClass1HG A03;
    public transient boolean A04 = false;
    public final Long timestamp;
    public final String toJid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GenerateTcTokenJob(com.whatsapp.jid.UserJid r6, java.lang.Long r7) {
        /*
            r5 = this;
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.String r0 = "generate-tc-token-"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r6.getRawString()
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r4.add(r0)
            r2 = 1
            r1 = 0
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r4, r2)
            r5.<init>(r0)
            r5.A04 = r1
            java.lang.String r0 = r6.getRawString()
            r5.toJid = r0
            r5.timestamp = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.GenerateTcTokenJob.<init>(com.whatsapp.jid.UserJid, java.lang.Long):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.A04 = true;
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class));
        this.A02 = (C17190ug) r1.AEu.get();
        this.A00 = (AnonymousClass12G) r1.APG.get();
        this.A03 = (AnonymousClass1HG) r1.AJK.get();
        UserJid nullable = UserJid.getNullable(this.toJid);
        this.A01 = nullable;
        if (this.A04 && nullable != null) {
            this.A03.A02(nullable);
        }
    }
}
