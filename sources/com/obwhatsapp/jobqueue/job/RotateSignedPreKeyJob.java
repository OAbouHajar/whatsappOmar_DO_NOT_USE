package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass16P;
import X.C16150sX;
import X.C17190ug;
import X.C18920xT;
import X.C208211s;
import X.C211512z;
import X.C28641Wx;
import X.C28791Xq;
import android.content.Context;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.Job;

public final class RotateSignedPreKeyJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C211512z A00;
    public transient C208211s A01;
    public transient AnonymousClass16P A02;
    public transient C18920xT A03;
    public transient C17190ug A04;
    public final byte[] data;
    public final byte[] id;
    public final byte[] signature;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RotateSignedPreKeyJob(byte[] r5, byte[] r6, byte[] r7) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r2 = "RotateSignedPreKeyJob"
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r4.<init>(r0)
            X.AnonymousClass00B.A0I(r5)
            r4.id = r5
            X.AnonymousClass00B.A0I(r6)
            r4.data = r6
            X.AnonymousClass00B.A0I(r7)
            r4.signature = r7
            int r2 = r5.length
            r0 = 3
            if (r2 != r0) goto L_0x005e
            int r2 = r6.length
            r0 = 32
            if (r2 != r0) goto L_0x004a
            int r2 = r7.length
            r0 = 64
            if (r2 != r0) goto L_0x0036
            return
        L_0x0036:
            java.lang.String r1 = "invalid signed pre-key signature length: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x004a:
            java.lang.String r1 = "invalid signed pre-key length: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x005e:
            java.lang.String r1 = "invalid signed pre-key id length: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob.<init>(byte[], byte[], byte[]):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        byte[] bArr = this.id;
        if (bArr != null) {
            byte[] bArr2 = this.data;
            if (bArr2 != null) {
                byte[] bArr3 = this.signature;
                if (bArr3 != null) {
                    int length = bArr.length;
                    if (length == 3) {
                        int length2 = bArr2.length;
                        if (length2 == 32) {
                            int length3 = bArr3.length;
                            if (length3 != 64) {
                                StringBuilder sb = new StringBuilder("invalid signed pre-key signature length: ");
                                sb.append(length3);
                                throw new InvalidObjectException(sb.toString());
                            }
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder("invalid signed pre-key length: ");
                        sb2.append(length2);
                        throw new InvalidObjectException(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder("invalid signed pre-key id length: ");
                    sb3.append(length);
                    throw new InvalidObjectException(sb3.toString());
                }
                throw new InvalidObjectException("signature cannot be null");
            }
            throw new InvalidObjectException("data cannot be null");
        }
        throw new InvalidObjectException("id cannot be null");
    }

    public String A04() {
        StringBuilder sb = new StringBuilder("; signedPreKeyId=");
        sb.append(C28641Wx.A01(this.id));
        sb.append("; persistentId=");
        sb.append(this.A01);
        return sb.toString();
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class));
        this.A03 = (C18920xT) r1.AMZ.get();
        this.A04 = (C17190ug) r1.AEu.get();
        this.A02 = (AnonymousClass16P) r1.AMY.get();
        this.A00 = (C211512z) r1.AG1.get();
        this.A01 = (C208211s) r1.AMX.get();
    }
}
