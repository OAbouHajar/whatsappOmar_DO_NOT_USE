package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C16150sX;
import X.C16300so;
import X.C17190ug;
import X.C28791Xq;
import X.C48932Py;
import android.content.Context;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.whispersystems.jobqueue.Job;

public final class SendStatusPrivacyListJob extends Job implements C28791Xq {
    public static volatile long A01 = 0;
    public static final long serialVersionUID = 1;
    public transient C48932Py A00;
    public final Collection jids;
    public final int statusDistribution;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendStatusPrivacyListJob(java.util.Collection r5, int r6) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r2 = "SendStatusPrivacyListJob"
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r4.<init>(r0)
            r4.statusDistribution = r6
            if (r5 != 0) goto L_0x0020
            r0 = 0
        L_0x001d:
            r4.jids = r0
            return
        L_0x0020:
            java.util.ArrayList r0 = X.C16030sJ.A06(r5)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob.<init>(java.util.Collection, int):void");
    }

    public final String A04() {
        String arrays;
        Jid nullable;
        StringBuilder sb = new StringBuilder("; statusDistribution=");
        sb.append(this.statusDistribution);
        sb.append("; jids=");
        Collection<String> collection = this.jids;
        if (collection == null) {
            arrays = "null";
        } else {
            ArrayList arrayList = new ArrayList(collection.size());
            for (String str : collection) {
                if (!(str == null || (nullable = Jid.getNullable(str)) == null)) {
                    arrayList.add(nullable);
                }
            }
            arrays = Arrays.toString(arrayList.toArray());
        }
        sb.append(arrays);
        sb.append("; persistentId=");
        sb.append(this.A01);
        return sb.toString();
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class));
        this.A00 = new C48932Py((C16300so) r1.A5p.get(), (C17190ug) r1.AEu.get());
    }
}
