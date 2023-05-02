package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C15830rv;
import X.C16150sX;
import X.C19430yQ;
import X.C27471Rw;
import X.C28791Xq;
import android.content.Context;
import android.text.TextUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public class SendDisableLiveLocationJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C19430yQ A00;
    public transient C27471Rw A01;
    public final String rawJid;
    public final long sequenceNumber;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendDisableLiveLocationJob(X.C15830rv r5, long r6) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r2 = r5.getRawString()
            r1 = 1
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r4.<init>(r0)
            X.AnonymousClass00B.A0F(r1)
            java.lang.String r0 = r5.getRawString()
            r4.rawJid = r0
            r4.sequenceNumber = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendDisableLiveLocationJob.<init>(X.0rv, long):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawJid)) {
            throw new InvalidObjectException("jid must not be empty");
        }
    }

    public final String A04() {
        C15830rv A02 = C15830rv.A02(this.rawJid);
        StringBuilder sb = new StringBuilder("; jid=");
        sb.append(A02);
        sb.append("; persistentId=");
        sb.append(this.A01);
        return sb.toString();
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class));
        this.A01 = (C27471Rw) r1.ADd.get();
        this.A00 = (C19430yQ) r1.ADa.get();
    }
}
