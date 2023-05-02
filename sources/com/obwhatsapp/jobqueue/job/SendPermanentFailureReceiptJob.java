package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C15830rv;
import X.C16150sX;
import X.C17190ug;
import X.C28791Xq;
import X.C30641ci;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.whispersystems.jobqueue.Job;

public final class SendPermanentFailureReceiptJob extends Job implements C28791Xq {
    public transient C17190ug A00;
    public final String jid;
    public final String messageKeyId;
    public final String participant;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPermanentFailureReceiptJob(X.C15830rv r5, X.C15830rv r6, java.lang.String r7) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r0 = "permanent-failure-"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r5.getRawString()
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r4.<init>(r0)
            java.lang.String r0 = r5.getRawString()
            r4.jid = r0
            java.lang.String r0 = X.C16030sJ.A03(r6)
            r4.participant = r0
            r4.messageKeyId = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendPermanentFailureReceiptJob.<init>(X.0rv, X.0rv, java.lang.String):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.jid)) {
            throw new InvalidObjectException("jid must not be empty");
        } else if (TextUtils.isEmpty(this.messageKeyId)) {
            throw new InvalidObjectException("messageId must not be empty");
        }
    }

    public void A01() {
        C15830rv A02 = C15830rv.A02(this.jid);
        C15830rv A022 = C15830rv.A02(this.participant);
        HashMap hashMap = new HashMap();
        C30641ci r5 = new C30641ci(A02, A022, (UserJid) null, "receipt", this.messageKeyId, "error", (String) null, (String) null, hashMap.isEmpty() ? null : new ArrayList(hashMap.values()), 0);
        C17190ug r4 = this.A00;
        String str = this.messageKeyId;
        Message obtain = Message.obtain((Handler) null, 0, 163, 0, A02);
        obtain.getData().putString("messageKeyId", str);
        obtain.getData().putParcelable("remoteResource", A022);
        r4.A04(obtain, r5).get();
    }

    public void Adl(Context context) {
        this.A00 = (C17190ug) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class))).AEu.get();
    }
}
