package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass1HD;
import X.AnonymousClass1W4;
import X.C16150sX;
import X.C16300so;
import X.C17190ug;
import X.C17270uo;
import X.C28791Xq;
import X.C49042Qm;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.jobqueue.Job;

public final class GetVNameCertificateJob extends Job implements C28791Xq {
    public static final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1HD A00;
    public transient C49042Qm A01;
    public final String jid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GetVNameCertificateJob(com.whatsapp.jid.UserJid r5) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r2 = r5.getRawString()
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r5)
            X.AnonymousClass00B.A06(r1)
            com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r1)
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r4.<init>(r0)
            java.lang.String r0 = r5.getRawString()
            X.AnonymousClass00B.A05(r0)
            r4.jid = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.GetVNameCertificateJob.<init>(com.whatsapp.jid.UserJid):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (!TextUtils.isEmpty(this.jid)) {
            try {
                UserJid.get(this.jid);
                A02.put(this.jid, Boolean.TRUE);
            } catch (AnonymousClass1W4 unused) {
                StringBuilder sb = new StringBuilder("jid must be an individual jid; jid=");
                sb.append(this.jid);
                throw new InvalidObjectException(sb.toString());
            }
        } else {
            throw new InvalidObjectException("jid must not be empty");
        }
    }

    public final String A04() {
        StringBuilder sb = new StringBuilder("; jid=");
        sb.append(UserJid.getNullable(this.jid));
        sb.append("; persistentId=");
        sb.append(this.A01);
        return sb.toString();
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class));
        this.A01 = new C49042Qm((C16300so) r1.A5p.get(), (C17190ug) r1.AEu.get(), C17270uo.A00(r1.ARB), C17270uo.A00(r1.A37), C17270uo.A00(r1.APp), C17270uo.A00(r1.AMf), C17270uo.A00(r1.AMn), C17270uo.A00(r1.AMl));
        this.A00 = (AnonymousClass1HD) r1.AJ0.get();
    }
}
