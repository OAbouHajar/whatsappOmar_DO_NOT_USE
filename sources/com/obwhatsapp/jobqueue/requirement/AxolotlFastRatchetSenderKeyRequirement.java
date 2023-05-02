package com.obwhatsapp.jobqueue.requirement;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C16040sK;
import X.C16150sX;
import X.C19430yQ;
import X.C208211s;
import X.C28791Xq;
import X.C34941l7;
import android.content.Context;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class AxolotlFastRatchetSenderKeyRequirement implements Requirement, C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C16040sK A00;
    public transient C208211s A01;
    public transient C19430yQ A02;
    public String groupJid = C34941l7.A00.getRawString();

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        String rawString = C34941l7.A00.getRawString();
        String str = this.groupJid;
        if (!rawString.equals(str)) {
            StringBuilder sb = new StringBuilder("groupJid is not location Jid, only location Jid supported for now; groupJid=");
            sb.append(str);
            throw new InvalidObjectException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r1 <= 0) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AJT() {
        /*
            r6 = this;
            X.0yQ r0 = r6.A02
            boolean r0 = r0.A0a()
            r5 = 1
            if (r0 == 0) goto L_0x0067
            X.0yQ r0 = r6.A02
            java.util.List r0 = r0.A07()
            boolean r0 = r0.isEmpty()
            r4 = 0
            if (r0 != 0) goto L_0x001c
            X.0yQ r0 = r6.A02
            r0.A0b()
            return r4
        L_0x001c:
            X.0sK r0 = r6.A00
            r0.A0B()
            X.1Za r0 = r0.A04
            X.1Yb r1 = X.C28851Ya.A02(r0)
            X.1l7 r0 = X.C34941l7.A00
            java.lang.String r0 = r0.getRawString()
            X.1dH r3 = new X.1dH
            r3.<init>(r1, r0)
            X.11s r1 = r6.A01
            X.0xT r0 = r1.A0I
            java.util.concurrent.locks.Lock r2 = r0.A03(r3)
            if (r2 == 0) goto L_0x003f
            r2.lock()     // Catch:{ all -> 0x0060 }
        L_0x003f:
            X.1f9 r0 = r1.A06     // Catch:{ all -> 0x0060 }
            X.1fA r0 = r0.A00(r3)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x004d
            byte[] r0 = r0.A01     // Catch:{ all -> 0x0060 }
            int r1 = r0.length     // Catch:{ all -> 0x0060 }
            r0 = 1
            if (r1 > 0) goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r2 == 0) goto L_0x0053
            r2.unlock()
        L_0x0053:
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "AxolotlFastRatchetSenderKeyRequirement/empty sender key record; reset key"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yQ r0 = r6.A02
            r0.A0G()
            return r4
        L_0x0060:
            r0 = move-exception
            if (r2 == 0) goto L_0x0066
            r2.unlock()
        L_0x0066:
            throw r0
        L_0x0067:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement.AJT():boolean");
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class));
        this.A00 = (C16040sK) r1.ADr.get();
        this.A01 = (C208211s) r1.AMX.get();
        this.A02 = (C19430yQ) r1.ADa.get();
    }
}
