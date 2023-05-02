package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass124;
import X.C15830rv;
import X.C16150sX;
import X.C16300so;
import X.C16440t3;
import X.C16460t6;
import X.C19000xb;
import X.C19280yB;
import X.C222617g;
import X.C28791Xq;
import X.C33211iD;
import android.content.Context;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.Locale;
import org.whispersystems.jobqueue.Job;

public final class RehydrateHsmJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient Context A00;
    public transient C16300so A01;
    public transient C19000xb A02;
    public transient C19280yB A03;
    public transient C16440t3 A04;
    public transient C16460t6 A05;
    public transient AnonymousClass124 A06;
    public transient C33211iD A07;
    public transient C222617g A08;
    public final Long existingMessageRowId;
    public final int expiration;
    public final long expireTimeMs;
    public final String id;
    public final String jid;
    public final Locale[] locales;
    public final String participant;
    public final long timestamp;
    public final int verifiedLevel;
    public final Long verifiedSender;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RehydrateHsmJob(X.AnonymousClass013 r8, X.C15830rv r9, X.C15830rv r10, X.C33211iD r11, X.C222617g r12, java.lang.Long r13, java.lang.Long r14, java.lang.String r15, int r16, int r17, long r18, long r20) {
        /*
            r7 = this;
            r5 = r9
            boolean r0 = X.C16030sJ.A0L(r9)
            if (r0 != 0) goto L_0x000d
            boolean r0 = X.C16030sJ.A0G(r9)
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            r5 = r10
        L_0x000e:
            X.29b r6 = r11.A0M
            if (r6 != 0) goto L_0x0014
            X.29b r6 = X.C455029b.A0A
        L_0x0014:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.String r3 = X.C16030sJ.A03(r5)
            boolean r0 = r11.A0e()
            if (r0 == 0) goto L_0x00fa
            int r0 = r6.A00
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L_0x00c9
            java.lang.String r0 = r6.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c9
            java.lang.String r1 = r6.A08
            java.lang.String r0 = r6.A07
            java.util.Locale r2 = new java.util.Locale
            r2.<init>(r1, r0)
        L_0x003b:
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r4.add(r0)
            X.AnonymousClass00B.A06(r5)
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r5)
            if (r13 == 0) goto L_0x0056
            if (r1 == 0) goto L_0x0056
            com.obwhatsapp.jobqueue.requirement.VNameCertificateRequirement r0 = new com.obwhatsapp.jobqueue.requirement.VNameCertificateRequirement
            r0.<init>(r1)
            r4.add(r0)
        L_0x0056:
            java.util.Locale[] r5 = X.C19280yB.A01(r8, r2)
            java.lang.String r2 = r6.A09
            java.lang.String r1 = r6.A06
            com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement r0 = new com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement
            r0.<init>(r2, r1, r5)
            r4.add(r0)
            r1 = 1
            r5 = 0
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r3, r4, r1)
            r7.<init>(r0)
            r7.A08 = r12
            X.AnonymousClass00B.A06(r11)
            r7.A07 = r11
            X.AnonymousClass00B.A06(r15)
            r7.id = r15
            java.lang.String r0 = r9.getRawString()
            r7.jid = r0
            java.lang.String r0 = X.C16030sJ.A03(r10)
            r7.participant = r0
            r3 = r18
            r7.timestamp = r3
            r1 = r20
            r7.expireTimeMs = r1
            r7.verifiedSender = r13
            r0 = r16
            r7.verifiedLevel = r0
            r7.existingMessageRowId = r14
            r0 = r17
            r7.expiration = r0
            boolean r0 = r11.A0e()
            if (r0 == 0) goto L_0x00f2
            int r0 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ea
            int r0 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d2
            r3 = 0
            org.whispersystems.jobqueue.JobParameters r0 = r7.parameters
            java.util.List r0 = r0.requirements
            java.util.Iterator r2 = r0.iterator()
        L_0x00b4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r1 = r2.next()
            org.whispersystems.jobqueue.requirements.Requirement r1 = (org.whispersystems.jobqueue.requirements.Requirement) r1
            boolean r0 = r1 instanceof com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement
            if (r0 == 0) goto L_0x00b4
            com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement r1 = (com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement) r1
            java.util.Locale[] r3 = r1.locales
            goto L_0x00b4
        L_0x00c9:
            r2 = 0
            goto L_0x003b
        L_0x00cc:
            X.AnonymousClass00B.A0J(r3)
            r7.locales = r3
            return
        L_0x00d2:
            java.lang.String r0 = "expireTimeMs must be non-negative"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00ea:
            java.lang.String r1 = "message must contain a valid timestamp"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            java.lang.String r1 = "message must contain an HSM"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00fa:
            java.lang.String r1 = "message must contain an HSM"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.RehydrateHsmJob.<init>(X.013, X.0rv, X.0rv, X.1iD, X.17g, java.lang.Long, java.lang.Long, java.lang.String, int, int, long, long):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A07 = C33211iD.A0U((byte[]) objectInputStream.readObject());
        } catch (OptionalDataException unused) {
            StringBuilder sb = new StringBuilder("RehydrateHsmJob/readObject/error: missing message bytes ");
            sb.append(A04());
            Log.e(sb.toString());
        }
        if (this.A07 == null) {
            StringBuilder sb2 = new StringBuilder("RehydrateHsmJob/readObject/error: message is null");
            sb2.append(A04());
            Log.e(sb2.toString());
        }
        C33211iD r0 = this.A07;
        if (r0 != null && !r0.A0e()) {
            StringBuilder sb3 = new StringBuilder("message must contain an HSM");
            sb3.append(A04());
            throw new InvalidObjectException(sb3.toString());
        } else if (this.id == null) {
            StringBuilder sb4 = new StringBuilder("id must not be null");
            sb4.append(A04());
            throw new InvalidObjectException(sb4.toString());
        } else if (this.jid == null) {
            StringBuilder sb5 = new StringBuilder("jid must not be null");
            sb5.append(A04());
            throw new InvalidObjectException(sb5.toString());
        } else if (this.timestamp <= 0) {
            StringBuilder sb6 = new StringBuilder("timestamp must be valid");
            sb6.append(A04());
            throw new InvalidObjectException(sb6.toString());
        } else if (this.expireTimeMs > 0) {
            Locale[] localeArr = this.locales;
            if (localeArr == null || localeArr.length == 0) {
                StringBuilder sb7 = new StringBuilder("locales[] must not be empty");
                sb7.append(A04());
                throw new InvalidObjectException(sb7.toString());
            }
        } else {
            StringBuilder sb8 = new StringBuilder("expireTimeMs must be non-negative");
            sb8.append(A04());
            throw new InvalidObjectException(sb8.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A07.A02());
    }

    public boolean A03() {
        return this.A04.A00() >= this.expireTimeMs || super.A03();
    }

    public final String A04() {
        C15830rv A022 = C15830rv.A02(this.jid);
        StringBuilder sb = new StringBuilder("; id=");
        sb.append(this.id);
        sb.append("; jid=");
        sb.append(A022);
        sb.append("; participant=");
        sb.append(this.participant);
        sb.append("; persistentId=");
        sb.append(this.A01);
        return sb.toString();
    }

    public final void A05(Integer num) {
        this.A06.A01(C15830rv.A02(this.jid), C15830rv.A02(this.participant), num, this.id, (String) null, (String) null);
    }

    public void Adl(Context context) {
        this.A00 = context.getApplicationContext();
        AnonymousClass01F r1 = (AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class);
        this.A04 = r1.Agj();
        this.A01 = r1.A6q();
        C16150sX r12 = (C16150sX) r1;
        this.A06 = (AnonymousClass124) r12.ALe.get();
        this.A02 = (C19000xb) r12.AQX.get();
        this.A08 = (C222617g) r12.A8a.get();
        this.A05 = (C16460t6) r12.A5k.get();
        this.A03 = (C19280yB) r12.ADD.get();
    }
}
