package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C16030sJ;
import X.C16150sX;
import X.C16490t9;
import X.C17190ug;
import X.C28791Xq;
import X.C74933rL;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.whispersystems.jobqueue.Job;

public final class BulkGetPreKeyJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C16490t9 A00;
    public transient C17190ug A01;
    public final int context;
    public final String[] identityChangedJids;
    public final String[] jids;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BulkGetPreKeyJob(com.whatsapp.jid.DeviceJid[] r7, com.whatsapp.jid.DeviceJid[] r8, int r9) {
        /*
            r6 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2 = 0
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r6.<init>(r0)
            java.util.List r0 = java.util.Arrays.asList(r7)
            java.lang.String[] r0 = X.C16030sJ.A0T(r0)
            X.AnonymousClass00B.A0J(r0)
            r6.jids = r0
            if (r8 != 0) goto L_0x0045
            r0 = 0
        L_0x0027:
            r6.identityChangedJids = r0
            r6.context = r9
            int r5 = r7.length
            r4 = 0
            r2 = 0
        L_0x002e:
            java.lang.String r3 = "jid must be an individual jid; jid="
            if (r2 >= r5) goto L_0x006b
            r1 = r7[r2]
            if (r1 == 0) goto L_0x0063
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 != 0) goto L_0x004e
            boolean r0 = X.C16030sJ.A0G(r1)
            if (r0 != 0) goto L_0x004e
            int r2 = r2 + 1
            goto L_0x002e
        L_0x0045:
            java.util.List r0 = java.util.Arrays.asList(r8)
            java.lang.String[] r0 = X.C16030sJ.A0T(r0)
            goto L_0x0027
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0063:
            java.lang.String r1 = "an element of jids was empty"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x006b:
            if (r8 == 0) goto L_0x00a0
            int r2 = r8.length
        L_0x006e:
            if (r4 >= r2) goto L_0x00a0
            r1 = r8[r4]
            if (r1 == 0) goto L_0x0098
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 != 0) goto L_0x0083
            boolean r0 = X.C16030sJ.A0G(r1)
            if (r0 != 0) goto L_0x0083
            int r4 = r4 + 1
            goto L_0x006e
        L_0x0083:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0098:
            java.lang.String r1 = "an element of identityChangedJids was empty"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.BulkGetPreKeyJob.<init>(com.whatsapp.jid.DeviceJid[], com.whatsapp.jid.DeviceJid[], int):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.jids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw new InvalidObjectException("jids must not be empty");
        }
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            DeviceJid nullable = DeviceJid.getNullable(strArr[i3]);
            if (nullable == null) {
                throw new InvalidObjectException("an element of jids was empty");
            } else if (C16030sJ.A0L(nullable) || C16030sJ.A0G(nullable)) {
                StringBuilder sb = new StringBuilder();
                sb.append("jid must be an individual jid; jid=");
                sb.append(nullable);
                throw new InvalidObjectException(sb.toString());
            } else {
                i3++;
            }
        }
        String[] strArr2 = this.identityChangedJids;
        if (strArr2 != null) {
            int length2 = strArr2.length;
            while (i2 < length2) {
                DeviceJid nullable2 = DeviceJid.getNullable(strArr2[i2]);
                if (nullable2 == null) {
                    throw new InvalidObjectException("an element of identityChangedJids was empty");
                } else if (C16030sJ.A0L(nullable2) || C16030sJ.A0G(nullable2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("jid must be an individual jid; jid=");
                    sb2.append(nullable2);
                    throw new InvalidObjectException(sb2.toString());
                } else {
                    i2++;
                }
            }
        }
    }

    public void A01() {
        StringBuilder sb = new StringBuilder("starting bulk get pre key job");
        sb.append(A04());
        Log.i(sb.toString());
        String A02 = this.A01.A02();
        Class<DeviceJid> cls = DeviceJid.class;
        List A08 = C16030sJ.A08(cls, Arrays.asList(this.jids));
        String[] strArr = this.identityChangedJids;
        List A082 = strArr != null ? C16030sJ.A08(cls, Arrays.asList(strArr)) : new ArrayList();
        if (this.context != 0) {
            C74933rL r2 = new C74933rL();
            r2.A00 = Boolean.valueOf(!A082.isEmpty());
            r2.A02 = Long.valueOf((long) A08.size());
            r2.A01 = Integer.valueOf(this.context);
            this.A00.A06(r2);
        }
        C17190ug r5 = this.A01;
        Message obtain = Message.obtain((Handler) null, 0, 87, 0);
        obtain.getData().putString("id", A02);
        obtain.getData().putParcelableArray("jids", (Jid[]) A08.toArray(new DeviceJid[0]));
        obtain.getData().putParcelableArray("identityJids", (Jid[]) A082.toArray(new DeviceJid[0]));
        r5.A05(obtain, A02).get();
    }

    public final String A04() {
        StringBuilder sb = new StringBuilder("; jids=");
        sb.append(C16030sJ.A05(this.jids));
        sb.append("; context=");
        sb.append(this.context);
        return sb.toString();
    }

    public void Adl(Context context2) {
        AnonymousClass01F r1 = (AnonymousClass01F) AnonymousClass01I.A00(context2.getApplicationContext(), AnonymousClass01F.class);
        this.A00 = r1.Ai6();
        this.A01 = (C17190ug) ((C16150sX) r1).AEu.get();
    }
}
