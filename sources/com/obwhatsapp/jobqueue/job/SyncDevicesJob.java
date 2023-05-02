package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C16030sJ;
import X.C16150sX;
import X.C19230xz;
import X.C220816o;
import X.C28791Xq;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

public class SyncDevicesJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C19230xz A00;
    public transient C220816o A01;
    public final String[] jids;
    public final int syncType;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncDevicesJob(com.whatsapp.jid.UserJid[] r5, int r6) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r2 = "SyncDevicesJob"
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            com.obwhatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement r0 = new com.obwhatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r4.<init>(r0)
            X.AnonymousClass00B.A0J(r5)
            int r3 = r5.length
            r2 = 0
        L_0x0025:
            if (r2 >= r3) goto L_0x0031
            r1 = r5[r2]
            java.lang.String r0 = "an element of jids was empty."
            X.AnonymousClass00B.A07(r1, r0)
            int r2 = r2 + 1
            goto L_0x0025
        L_0x0031:
            java.util.List r0 = java.util.Arrays.asList(r5)
            java.lang.String[] r0 = X.C16030sJ.A0T(r0)
            r4.jids = r0
            r4.syncType = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SyncDevicesJob.<init>(com.whatsapp.jid.UserJid[], int):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.jids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw new InvalidObjectException("jids must not be empty");
        }
        int i2 = 0;
        while (UserJid.getNullable(strArr[i2]) != null) {
            i2++;
            if (i2 >= length) {
                return;
            }
        }
        throw new InvalidObjectException("an jid is not a UserJid");
    }

    public final String A04() {
        StringBuilder sb = new StringBuilder("; jids=");
        sb.append(C16030sJ.A05(this.jids));
        return sb.toString();
    }

    public void Adl(Context context) {
        int length;
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class));
        this.A00 = (C19230xz) r1.A5B.get();
        this.A01 = (C220816o) r1.A6p.get();
        String[] strArr = this.jids;
        if (strArr != null && (length = strArr.length) > 0) {
            HashSet hashSet = new HashSet();
            int i2 = 0;
            do {
                UserJid nullable = UserJid.getNullable(strArr[i2]);
                if (nullable != null) {
                    hashSet.add(nullable);
                }
                i2++;
            } while (i2 < length);
            C220816o r7 = this.A01;
            Set set = r7.A03;
            synchronized (set) {
                set.addAll(hashSet);
                long A002 = r7.A00.A00();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    r7.A01.put((UserJid) it.next(), Long.valueOf(A002));
                }
            }
        }
    }
}
