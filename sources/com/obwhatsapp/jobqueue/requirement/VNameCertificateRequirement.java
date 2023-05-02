package com.obwhatsapp.jobqueue.requirement;

import X.AnonymousClass00B;
import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass1W4;
import X.C16150sX;
import X.C17030uP;
import X.C28791Xq;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class VNameCertificateRequirement implements Requirement, C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C17030uP A00;
    public transient UserJid A01;
    public final String jid;

    public VNameCertificateRequirement(UserJid userJid) {
        AnonymousClass00B.A06(userJid);
        this.A01 = userJid;
        String rawString = userJid.getRawString();
        AnonymousClass00B.A05(rawString);
        this.jid = rawString;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.jid)) {
            StringBuilder sb = new StringBuilder("jid must not be empty");
            StringBuilder sb2 = new StringBuilder("; jid=");
            sb2.append(A00());
            sb.append(sb2.toString());
            throw new InvalidObjectException(sb.toString());
        }
    }

    public UserJid A00() {
        UserJid userJid = this.A01;
        if (userJid != null) {
            return userJid;
        }
        try {
            UserJid userJid2 = UserJid.get(this.jid);
            this.A01 = userJid2;
            return userJid2;
        } catch (AnonymousClass1W4 unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = (java.lang.Number) r6.A00.A0A.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AJT() {
        /*
            r6 = this;
            com.whatsapp.jid.UserJid r1 = r6.A00()
            r3 = 0
            if (r1 == 0) goto L_0x0045
            X.0uP r0 = r6.A00
            java.util.Map r0 = r0.A0A
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0045
            long r1 = r0.longValue()
        L_0x0018:
            r5 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x002d
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x002d
        L_0x0029:
            r6.A00()
        L_0x002c:
            return r5
        L_0x002d:
            java.lang.String r1 = r6.jid
            java.util.concurrent.ConcurrentHashMap r0 = com.obwhatsapp.jobqueue.job.GetVNameCertificateJob.A02
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0029
            X.0uP r1 = r6.A00
            com.whatsapp.jid.UserJid r0 = r6.A00()
            X.1Vq r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x002c
            r5 = 0
            return r5
        L_0x0045:
            r1 = 0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.requirement.VNameCertificateRequirement.AJT():boolean");
    }

    public void Adl(Context context) {
        this.A00 = (C17030uP) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class))).APp.get();
    }
}
