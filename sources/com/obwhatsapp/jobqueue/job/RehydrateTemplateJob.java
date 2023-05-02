package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass124;
import X.AnonymousClass1ZW;
import X.C15830rv;
import X.C15900s5;
import X.C16150sX;
import X.C16300so;
import X.C16440t3;
import X.C16460t6;
import X.C16490t9;
import X.C17130ua;
import X.C19000xb;
import X.C19280yB;
import X.C19950zG;
import X.C222617g;
import X.C28791Xq;
import X.C33211iD;
import X.C74953rN;
import android.content.Context;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.Locale;
import org.whispersystems.jobqueue.Job;

public final class RehydrateTemplateJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient Context A00;
    public transient C16300so A01;
    public transient C15900s5 A02;
    public transient C17130ua A03;
    public transient C19000xb A04;
    public transient C19280yB A05;
    public transient C16440t3 A06;
    public transient C16460t6 A07;
    public transient C16490t9 A08;
    public transient C19950zG A09;
    public transient AnonymousClass124 A0A;
    public transient C33211iD A0B;
    public final transient C222617g A0C;
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
    public RehydrateTemplateJob(X.AnonymousClass013 r9, X.C15830rv r10, X.C15830rv r11, X.C33211iD r12, X.C222617g r13, java.lang.Long r14, java.lang.String r15, int r16, int r17, long r18, long r20) {
        /*
            r8 = this;
            r5 = r10
            boolean r0 = X.C16030sJ.A0L(r10)
            if (r0 != 0) goto L_0x000d
            boolean r0 = X.C16030sJ.A0G(r10)
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            r5 = r11
        L_0x000e:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.String r2 = X.C16030sJ.A03(r5)
            boolean r0 = r12.A0f()
            if (r0 == 0) goto L_0x0155
            X.2uY r4 = r12.A0k
            if (r4 != 0) goto L_0x0023
            X.2uY r4 = X.C59022uY.A06
        L_0x0023:
            int r1 = r4.A01
            r0 = 1
            if (r1 == r0) goto L_0x0038
            int r0 = r4.A00
            r1 = 16
            r0 = r0 & 16
            if (r0 == r1) goto L_0x0038
            java.lang.String r1 = "message must contain an FourRowTemplate"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0038:
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            X.AnonymousClass00B.A06(r5)
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r5)
            if (r14 == 0) goto L_0x0053
            if (r1 == 0) goto L_0x0053
            com.obwhatsapp.jobqueue.requirement.VNameCertificateRequirement r0 = new com.obwhatsapp.jobqueue.requirement.VNameCertificateRequirement
            r0.<init>(r1)
            r3.add(r0)
        L_0x0053:
            int r1 = r4.A01
            r0 = 1
            if (r1 != r0) goto L_0x00b9
            X.2uX r6 = r4.A0c()
            X.29b r7 = r6.A03
            if (r7 != 0) goto L_0x0062
            X.29b r7 = X.C455029b.A0A
        L_0x0062:
            int r0 = r7.A00
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L_0x0124
            java.lang.String r0 = r7.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0124
            java.lang.String r4 = r7.A08
            java.lang.String r1 = r7.A07
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r4, r1)
        L_0x007a:
            java.util.Locale[] r5 = X.C19280yB.A01(r9, r0)
            java.lang.String r4 = r7.A09
            java.lang.String r1 = r7.A06
            com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement r0 = new com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement
            r0.<init>(r4, r1, r5)
            r3.add(r0)
            int r1 = r6.A01
            r0 = 2
            if (r1 != r0) goto L_0x009f
            java.lang.Object r0 = r6.A05
            X.29b r0 = (X.C455029b) r0
            java.lang.String r4 = r0.A09
            java.lang.String r1 = r0.A06
            com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement r0 = new com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement
            r0.<init>(r4, r1, r5)
            r3.add(r0)
        L_0x009f:
            int r0 = r6.A00
            r1 = 64
            r0 = r0 & 64
            if (r0 != r1) goto L_0x00b9
            X.29b r0 = r6.A04
            if (r0 != 0) goto L_0x00ad
            X.29b r0 = X.C455029b.A0A
        L_0x00ad:
            java.lang.String r4 = r0.A09
            java.lang.String r1 = r0.A06
            com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement r0 = new com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement
            r0.<init>(r4, r1, r5)
            r3.add(r0)
        L_0x00b9:
            r5 = 1
            r6 = 0
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r5)
            r8.<init>(r0)
            r8.A0C = r13
            X.AnonymousClass00B.A06(r12)
            r8.A0B = r12
            X.AnonymousClass00B.A06(r15)
            r8.id = r15
            java.lang.String r0 = r10.getRawString()
            r8.jid = r0
            java.lang.String r0 = X.C16030sJ.A03(r11)
            r8.participant = r0
            r3 = r18
            r8.timestamp = r3
            r1 = r20
            r8.expireTimeMs = r1
            r8.verifiedSender = r14
            r0 = r16
            r8.verifiedLevel = r0
            r0 = r17
            r8.expiration = r0
            boolean r0 = r12.A0f()
            if (r0 == 0) goto L_0x014d
            int r0 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0145
            int r0 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x012d
            r3 = 0
            X.2uY r0 = r12.A0k
            if (r0 != 0) goto L_0x0103
            X.2uY r0 = X.C59022uY.A06
        L_0x0103:
            int r0 = r0.A01
            if (r0 != r5) goto L_0x012a
            org.whispersystems.jobqueue.JobParameters r0 = r8.parameters
            java.util.List r0 = r0.requirements
            java.util.Iterator r2 = r0.iterator()
        L_0x010f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0127
            java.lang.Object r1 = r2.next()
            org.whispersystems.jobqueue.requirements.Requirement r1 = (org.whispersystems.jobqueue.requirements.Requirement) r1
            boolean r0 = r1 instanceof com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement
            if (r0 == 0) goto L_0x010f
            com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement r1 = (com.obwhatsapp.jobqueue.requirement.HsmMessagePackRequirement) r1
            java.util.Locale[] r3 = r1.locales
            goto L_0x010f
        L_0x0124:
            r0 = 0
            goto L_0x007a
        L_0x0127:
            X.AnonymousClass00B.A0J(r3)
        L_0x012a:
            r8.locales = r3
            return
        L_0x012d:
            java.lang.String r0 = "expireTimeMs must be non-negative"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r8.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0145:
            java.lang.String r1 = "message must contain a valid timestamp"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x014d:
            java.lang.String r1 = "message must contain an Template"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0155:
            java.lang.String r1 = "message must contain an Template"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.RehydrateTemplateJob.<init>(X.013, X.0rv, X.0rv, X.1iD, X.17g, java.lang.Long, java.lang.String, int, int, long, long):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A0B = C33211iD.A0U((byte[]) objectInputStream.readObject());
        } catch (OptionalDataException unused) {
            StringBuilder sb = new StringBuilder("RehydrateTemplateJob/readObject/error hsm missing message bytes, loggableParam=");
            sb.append(A04());
            Log.e(sb.toString());
        }
        if (this.A0B == null) {
            StringBuilder sb2 = new StringBuilder("RehydrateTemplateJob/readObject/error message is null, loggableParam=");
            sb2.append(A04());
            Log.e(sb2.toString());
        }
        if (this.id == null) {
            StringBuilder sb3 = new StringBuilder("id must not be null");
            sb3.append(A04());
            throw new InvalidObjectException(sb3.toString());
        } else if (this.jid == null) {
            StringBuilder sb4 = new StringBuilder("jid must not be null");
            sb4.append(A04());
            throw new InvalidObjectException(sb4.toString());
        } else if (this.timestamp <= 0) {
            StringBuilder sb5 = new StringBuilder("timestamp must be valid");
            sb5.append(A04());
            throw new InvalidObjectException(sb5.toString());
        } else if (this.expireTimeMs <= 0) {
            StringBuilder sb6 = new StringBuilder("expireTimeMs must be non-negative");
            sb6.append(A04());
            throw new InvalidObjectException(sb6.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A0B.A02());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("RehydrateTemplateJob/onRun/error title format mismatch, param=");
        r2.append(A04());
        com.whatsapp.util.Log.e(r2.toString());
        A06(1011, "title", (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x031d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x031e, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x031f, code lost:
        r4 = "title";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03e3, code lost:
        if (r5 == 0) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0409, code lost:
        if (r1 != false) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x043a, code lost:
        r1 = r5.equals(r1);
        r5 = r4 & 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0443, code lost:
        r1 = r5.equals(r1);
        r5 = r4 & 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x044f, code lost:
        r1 = r5.equals(r1);
        r5 = r4 & 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0470, code lost:
        if (r1 != false) goto L_0x03e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0104, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017a, code lost:
        r10 = X.C800642k.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018d, code lost:
        if (r11 == r10) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r10 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0195, code lost:
        if (r1.A01 != 2) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0197, code lost:
        r2 = (X.C455029b) r1.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019b, code lost:
        r16 = X.AnonymousClass2R3.A01(r10, r8, r14, r2, A04(), false, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b1, code lost:
        r2 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0281 A[Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02b0 A[Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r43 = this;
            java.lang.String r0 = "RehydrateTemplateJob/onRun/info starting template rehydrate job, loggableParam="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r0 = r43
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1iD r1 = r0.A0B
            r3 = 0
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = "RehydrateTemplateJob/onRun/error template missing message, loggableParam="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.0so r4 = r0.A01
            r2 = 1
            java.lang.String r1 = "rehydratetemplatejob/run/message missing"
            r4.AcB(r1, r3, r2)
        L_0x0039:
            r0.A06(r3, r3, r3)
            return
        L_0x003d:
            X.0t3 r1 = r0.A06
            long r6 = r1.A00()
            long r4 = r0.expireTimeMs
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x005f
            java.lang.String r1 = "RehydrateTemplateJob/onRun/info template rehydrate job expired, loggableParam="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            goto L_0x0039
        L_0x005f:
            X.1iD r1 = r0.A0B
            X.2uY r1 = r1.A0k
            r23 = r1
            if (r1 != 0) goto L_0x0069
            X.2uY r23 = X.C59022uY.A06
        L_0x0069:
            java.lang.String r4 = "content"
            java.lang.String r9 = "button"
            java.lang.String r22 = "title"
            X.2uX r1 = r23.A0c()
            X.29b r6 = r1.A03
            if (r6 != 0) goto L_0x007a
            X.29b r6 = X.C455029b.A0A
        L_0x007a:
            java.lang.String r2 = r0.A04()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0568 }
            X.AnonymousClass2R3.A04(r6, r2)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0568 }
            X.0yB r8 = r0.A05     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0561 }
            java.util.Locale[] r7 = r0.locales     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0561 }
            java.lang.String r5 = r6.A09     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0561 }
            java.lang.String r2 = r0.A04()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0561 }
            X.2Cg r14 = X.AnonymousClass2R3.A00(r8, r5, r2, r7)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0561 }
            java.lang.String r8 = r6.A06
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto L_0x00c9
            X.1XE r2 = r14.A02
            java.util.Iterator r11 = r2.iterator()
        L_0x00a2:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x00c9
            java.lang.Object r7 = r11.next()
            X.2IQ r7 = (X.AnonymousClass2IQ) r7
            int r5 = r7.A01
            r2 = 1
            if (r5 == r2) goto L_0x00b6
            r2 = 6
            if (r5 != r2) goto L_0x00a2
        L_0x00b6:
            int r2 = r7.A00
            r5 = 4
            r2 = r2 & 4
            if (r2 != r5) goto L_0x00a2
            java.lang.String r2 = r7.A05
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x00a2
            r10.add(r7)
            goto L_0x00a2
        L_0x00c9:
            java.util.HashMap r21 = new java.util.HashMap
            r21.<init>()
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            X.1XE r2 = r1.A02
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x00f8
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
            X.1XE r2 = r1.A02
            java.util.Iterator r8 = r2.iterator()
        L_0x00e6:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00f9
            java.lang.Object r5 = r8.next()
            X.2u0 r5 = (X.AnonymousClass2u0) r5
            int r2 = r5.A02
            r7.put(r2, r5)
            goto L_0x00e6
        L_0x00f8:
            r7 = 0
        L_0x00f9:
            java.util.Iterator r19 = r10.iterator()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x053a }
            r18 = 0
            r17 = 0
            r16 = 0
            r5 = 0
        L_0x0104:
            boolean r8 = r19.hasNext()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            r2 = 2
            r10 = 1
            r15 = 1001(0x3e9, float:1.403E-42)
            if (r8 == 0) goto L_0x036d
            java.lang.Object r8 = r19.next()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            X.2IQ r8 = (X.AnonymousClass2IQ) r8     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            int r13 = r8.A01     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            if (r13 != r10) goto L_0x01f5
            X.2IR r11 = r8.A0d()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            int r11 = r11.A00     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            r12 = 8
            r11 = r11 & 8
            if (r11 != r12) goto L_0x01f5
            X.2IR r11 = r8.A0d()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            int r11 = r11.A05     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            if (r11 == 0) goto L_0x013c
            if (r11 == r10) goto L_0x0139
            if (r11 == r2) goto L_0x0136
            r10 = 3
            if (r11 == r10) goto L_0x013f
            X.42a r10 = X.C799642a.A04     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            goto L_0x0141
        L_0x0136:
            X.42a r10 = X.C799642a.A03     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            goto L_0x0141
        L_0x0139:
            X.42a r10 = X.C799642a.A02     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            goto L_0x0141
        L_0x013c:
            X.42a r10 = X.C799642a.A04     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            goto L_0x0141
        L_0x013f:
            X.42a r10 = X.C799642a.A01     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
        L_0x0141:
            int r10 = r10.ordinal()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            switch(r10) {
                case 0: goto L_0x0161;
                case 1: goto L_0x01dd;
                case 2: goto L_0x01b3;
                default: goto L_0x0148;
            }     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
        L_0x0148:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            r8.<init>()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            java.lang.String r2 = "RehydrateTemplateJob/onRun/error unknown type of text element, params="
            r8.append(r2)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            java.lang.String r2 = r0.A04()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            r8.append(r2)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            java.lang.String r2 = r8.toString()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            goto L_0x0104
        L_0x0161:
            X.2IR r10 = r8.A0d()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            int r10 = r10.A03     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            X.433 r10 = X.AnonymousClass433.A00(r10)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            if (r10 != 0) goto L_0x016f
            X.433 r10 = X.AnonymousClass433.A04     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
        L_0x016f:
            X.42k r11 = r1.A0c()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            int r10 = r10.ordinal()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            switch(r10) {
                case 0: goto L_0x017d;
                case 1: goto L_0x018b;
                case 2: goto L_0x0185;
                case 3: goto L_0x0188;
                case 4: goto L_0x0182;
                default: goto L_0x017a;
            }     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
        L_0x017a:
            X.42k r10 = X.C800642k.A05     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            goto L_0x018d
        L_0x017d:
            X.42k r10 = X.C800642k.A02     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            if (r11 == r10) goto L_0x0191
            goto L_0x017a
        L_0x0182:
            X.42k r10 = X.C800642k.A04     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            goto L_0x018d
        L_0x0185:
            X.42k r10 = X.C800642k.A01     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            goto L_0x018d
        L_0x0188:
            X.42k r10 = X.C800642k.A06     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            goto L_0x018d
        L_0x018b:
            X.42k r10 = X.C800642k.A03     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
        L_0x018d:
            if (r11 == r10) goto L_0x0191
            goto L_0x02fa
        L_0x0191:
            android.content.Context r10 = r0.A00     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x031e }
            int r11 = r1.A01     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x031e }
            if (r11 != r2) goto L_0x01b1
            java.lang.Object r2 = r1.A05     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x031e }
            X.29b r2 = (X.C455029b) r2     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x031e }
        L_0x019b:
            java.lang.String r28 = r0.A04()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x031e }
            r29 = 0
            r30 = 1
            r24 = r10
            r25 = r8
            r26 = r14
            r27 = r2
            java.lang.String r16 = X.AnonymousClass2R3.A01(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x031e }
            goto L_0x0104
        L_0x01b1:
            r2 = 0
            goto L_0x019b
        L_0x01b3:
            java.lang.String r12 = "footer"
            android.content.Context r10 = r0.A00     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0323 }
            int r2 = r1.A00     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0323 }
            r11 = 64
            r2 = r2 & 64
            if (r2 != r11) goto L_0x01db
            X.29b r2 = r1.A04     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0323 }
            if (r2 != 0) goto L_0x01c5
            X.29b r2 = X.C455029b.A0A     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0323 }
        L_0x01c5:
            java.lang.String r28 = r0.A04()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0323 }
            r29 = 0
            r30 = 1
            r24 = r10
            r25 = r8
            r26 = r14
            r27 = r2
            java.lang.String r17 = X.AnonymousClass2R3.A01(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0323 }
            goto L_0x0104
        L_0x01db:
            r2 = 0
            goto L_0x01c5
        L_0x01dd:
            android.content.Context r2 = r0.A00     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x053e }
            java.lang.String r28 = r0.A04()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x053e }
            r29 = 0
            r30 = 1
            r24 = r2
            r25 = r8
            r26 = r14
            r27 = r6
            java.lang.String r18 = X.AnonymousClass2R3.A01(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x053e }
            goto L_0x0104
        L_0x01f5:
            r2 = 6
            if (r13 != r2) goto L_0x034d
            X.2te r2 = r8.A0c()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            int r2 = r2.A00     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            r11 = 8
            r2 = r2 & 8
            if (r2 != r11) goto L_0x034d
            X.2te r2 = r8.A0c()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            int r2 = r2.A02     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            if (r7 == 0) goto L_0x022f
            X.2te r2 = r8.A0c()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            int r2 = r2.A02     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            java.lang.Object r12 = r7.get(r2)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            X.2u0 r12 = (X.AnonymousClass2u0) r12     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
        L_0x021c:
            X.2te r2 = r8.A0c()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            int r11 = r2.A01     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            r2 = 1
            if (r11 == r10) goto L_0x0232
            X.2te r2 = r8.A0c()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            int r11 = r2.A01     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            r2 = 2
            if (r11 == r2) goto L_0x0232
            goto L_0x0231
        L_0x022f:
            r12 = 0
            goto L_0x021c
        L_0x0231:
            r2 = 3
        L_0x0232:
            if (r12 == 0) goto L_0x0241
            int r13 = r12.A01     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            r11 = 1
            if (r13 == r10) goto L_0x023d
            r11 = 2
            if (r13 == r11) goto L_0x023d
            r11 = 3
        L_0x023d:
            if (r2 == r11) goto L_0x0241
            goto L_0x0327
        L_0x0241:
            android.content.Context r15 = r0.A00     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            if (r12 == 0) goto L_0x0266
            int r13 = r12.A01     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            if (r13 != r10) goto L_0x0250
            java.lang.Object r11 = r12.A03     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            X.2ta r11 = (X.C58492ta) r11     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            X.29b r11 = r11.A01     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            goto L_0x0263
        L_0x0250:
            r11 = 2
            if (r13 != r11) goto L_0x025a
            java.lang.Object r11 = r12.A03     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            X.2tb r11 = (X.C58502tb) r11     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            X.29b r11 = r11.A01     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            goto L_0x0263
        L_0x025a:
            r11 = 3
            if (r13 != r11) goto L_0x0266
            java.lang.Object r11 = r12.A03     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            X.2tZ r11 = (X.C58482tZ) r11     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            X.29b r11 = r11.A01     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
        L_0x0263:
            if (r11 != 0) goto L_0x026a
            goto L_0x0268
        L_0x0266:
            r11 = 0
            goto L_0x026a
        L_0x0268:
            X.29b r11 = X.C455029b.A0A     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
        L_0x026a:
            java.lang.String r28 = r0.A04()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            r13 = 1
            r29 = 1
            r30 = 1
            r24 = r15
            r25 = r8
            r26 = r14
            r27 = r11
            java.lang.String r11 = X.AnonymousClass2R3.A01(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            if (r2 == r10) goto L_0x02b0
            android.content.Context r13 = r0.A00     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            if (r12 == 0) goto L_0x029d
            int r15 = r12.A01     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            r10 = 2
            if (r15 != r10) goto L_0x0291
            java.lang.Object r10 = r12.A03     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            X.2tb r10 = (X.C58502tb) r10     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            X.29b r10 = r10.A02     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            goto L_0x029a
        L_0x0291:
            r10 = 3
            if (r15 != r10) goto L_0x029d
            java.lang.Object r10 = r12.A03     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            X.2tZ r10 = (X.C58482tZ) r10     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            X.29b r10 = r10.A02     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
        L_0x029a:
            if (r10 != 0) goto L_0x02a1
            goto L_0x029f
        L_0x029d:
            r10 = 0
            goto L_0x02a1
        L_0x029f:
            X.29b r10 = X.C455029b.A0A     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
        L_0x02a1:
            java.lang.String r28 = r0.A04()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            r29 = 0
            r24 = r13
            r27 = r10
            java.lang.String r10 = X.AnonymousClass2R3.A01(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            goto L_0x02c0
        L_0x02b0:
            if (r12 == 0) goto L_0x02b3
            goto L_0x02b6
        L_0x02b3:
            java.lang.String r10 = ""
            goto L_0x02c0
        L_0x02b6:
            int r10 = r12.A01     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            if (r10 != r13) goto L_0x02b3
            java.lang.Object r10 = r12.A03     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            X.2ta r10 = (X.C58492ta) r10     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            java.lang.String r10 = r10.A02     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
        L_0x02c0:
            r15 = 4
            X.2te r12 = r8.A0c()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            int r13 = r12.A02     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            r12 = 20
            java.lang.String r25 = r0.A05(r11, r12, r15, r13)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            X.2te r11 = r8.A0c()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            int r12 = r11.A02     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            r29 = 0
            X.1sy r11 = new X.1sy     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            r30 = 0
            r24 = r11
            r26 = r10
            r27 = r2
            r28 = r12
            r24.<init>(r25, r26, r27, r28, r29, r30)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            X.2te r2 = r8.A0c()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            int r2 = r2.A02     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            r2 = r21
            r2.put(r11, r8)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            r2 = r20
            r2.add(r11)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            goto L_0x0104
        L_0x02fa:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            r2.<init>()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            java.lang.String r1 = "RehydrateTemplateJob/onRun/error title format mismatch, param="
            r2.append(r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            java.lang.String r1 = r0.A04()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            r2.append(r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            java.lang.String r1 = r2.toString()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            r1 = 1011(0x3f3, float:1.417E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            r1 = r22
            r0.A06(r2, r1, r3)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            return
        L_0x031e:
            r3 = move-exception
            r4 = r22
            goto L_0x053f
        L_0x0323:
            r3 = move-exception
            r4 = r12
            goto L_0x053f
        L_0x0327:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            r2.<init>()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            java.lang.String r1 = "RehydrateTemplateJob/onRun/error different type of buttons, params="
            r2.append(r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            java.lang.String r1 = r0.A04()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            r2.append(r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            java.lang.String r1 = r2.toString()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            r0.A06(r1, r9, r5)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0349 }
            return
        L_0x0349:
            r3 = move-exception
            r4 = r9
            goto L_0x053f
        L_0x034d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            r2.<init>()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            java.lang.String r1 = "RehydrateTemplateJob/onRun/error unknown translation package without element, params="
            r2.append(r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            java.lang.String r1 = r0.A04()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            r2.append(r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            java.lang.String r1 = r2.toString()     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            r0.A06(r1, r3, r3)     // Catch:{ HSMRehydrationUtil$SendStructUnavailableException -> 0x0537 }
            return
        L_0x036d:
            X.42k r6 = r1.A0c()
            X.42k r5 = X.C800642k.A02
            if (r6 != r5) goto L_0x039a
            boolean r5 = android.text.TextUtils.isEmpty(r16)
            if (r5 == 0) goto L_0x039a
            java.lang.String r1 = "RehydrateTemplateJob/onRun/error title is empty, param="
        L_0x037d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0390:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r1 = r22
            r0.A06(r2, r1, r3)
            return
        L_0x039a:
            boolean r5 = android.text.TextUtils.isEmpty(r18)
            if (r5 == 0) goto L_0x03bd
            java.lang.String r1 = "RehydrateTemplateJob/onRun/error content is empty, param="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0.A06(r1, r4, r3)
            return
        L_0x03bd:
            X.42k r5 = r1.A0c()
            X.42k r4 = X.C800642k.A01
            r15 = 1007(0x3ef, float:1.411E-42)
            if (r5 != r4) goto L_0x03e5
            int r4 = r1.A01
            if (r4 != r10) goto L_0x0474
            java.lang.Object r1 = r1.A05
            X.24l r1 = (X.C445324l) r1
        L_0x03cf:
            java.lang.String r5 = r1.A0G
            X.0s5 r4 = r0.A02
            X.0tC r1 = X.C15910s6.A22
            int r4 = r4.A02(r1)
            int r1 = r5.hashCode()
            switch(r1) {
                case -1719571662: goto L_0x0468;
                case -1487394660: goto L_0x045f;
                case -1248334925: goto L_0x0456;
                case -1073633483: goto L_0x044d;
                case -1071817359: goto L_0x044a;
                case -1050893613: goto L_0x0441;
                case -366307023: goto L_0x0438;
                case 817335912: goto L_0x042e;
                case 904647503: goto L_0x042b;
                case 1331848029: goto L_0x0421;
                case 1643664935: goto L_0x0418;
                case 1993842850: goto L_0x0415;
                default: goto L_0x03e0;
            }
        L_0x03e0:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 & r4
        L_0x03e3:
            if (r5 == 0) goto L_0x0390
        L_0x03e5:
            com.facebook.redex.IDxComparatorShape183S0100000_2_I0 r4 = new com.facebook.redex.IDxComparatorShape183S0100000_2_I0
            r1 = r21
            r4.<init>(r1, r2)
            r1 = r20
            java.util.Collections.sort(r1, r4)
            java.util.Iterator r7 = r20.iterator()
            r6 = 0
        L_0x03f6:
            r5 = 0
        L_0x03f7:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0478
            java.lang.Object r1 = r7.next()
            X.1sy r1 = (X.C39731sy) r1
            int r4 = r1.A03
            if (r4 == r10) goto L_0x040b
            r1 = r6
            r6 = 0
            if (r1 == 0) goto L_0x040c
        L_0x040b:
            r6 = 1
        L_0x040c:
            r1 = 3
            if (r4 == r1) goto L_0x0413
            if (r4 == r2) goto L_0x0413
            if (r5 == 0) goto L_0x03f6
        L_0x0413:
            r5 = 1
            goto L_0x03f7
        L_0x0415:
            java.lang.String r1 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
            goto L_0x043a
        L_0x0418:
            java.lang.String r1 = "application/vnd.oasis.opendocument.spreadsheet"
            boolean r1 = r5.equals(r1)
            r5 = r4 & 64
            goto L_0x0470
        L_0x0421:
            java.lang.String r1 = "video/mp4"
            boolean r1 = r5.equals(r1)
            r5 = r4 & 256(0x100, float:3.59E-43)
            goto L_0x0470
        L_0x042b:
            java.lang.String r1 = "application/msword"
            goto L_0x0443
        L_0x042e:
            java.lang.String r1 = "text/plain"
            boolean r1 = r5.equals(r1)
            r5 = r4 & 16
            goto L_0x0470
        L_0x0438:
            java.lang.String r1 = "application/vnd.ms-excel"
        L_0x043a:
            boolean r1 = r5.equals(r1)
            r5 = r4 & 4
            goto L_0x0470
        L_0x0441:
            java.lang.String r1 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
        L_0x0443:
            boolean r1 = r5.equals(r1)
            r5 = r4 & 2
            goto L_0x0470
        L_0x044a:
            java.lang.String r1 = "application/vnd.ms-powerpoint"
            goto L_0x044f
        L_0x044d:
            java.lang.String r1 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
        L_0x044f:
            boolean r1 = r5.equals(r1)
            r5 = r4 & 8
            goto L_0x0470
        L_0x0456:
            java.lang.String r1 = "application/pdf"
            boolean r1 = r5.equals(r1)
            r5 = r4 & 1
            goto L_0x0470
        L_0x045f:
            java.lang.String r1 = "image/jpeg"
            boolean r1 = r5.equals(r1)
            r5 = r4 & 128(0x80, float:1.794E-43)
            goto L_0x0470
        L_0x0468:
            java.lang.String r1 = "application/vnd.oasis.opendocument.text"
            boolean r1 = r5.equals(r1)
            r5 = r4 & 32
        L_0x0470:
            if (r1 != 0) goto L_0x03e3
            goto L_0x03e0
        L_0x0474:
            X.24l r1 = X.C445324l.A0L
            goto L_0x03cf
        L_0x0478:
            if (r6 == 0) goto L_0x049b
            if (r5 == 0) goto L_0x049b
            java.lang.String r1 = "RehydrateTemplateJob/onRun/error mixed button type, param="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            r1 = 1013(0x3f5, float:1.42E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.A06(r1, r9, r3)
            return
        L_0x049b:
            java.lang.String r5 = r14.A05
            java.lang.String r4 = r14.A04
            java.util.Locale r1 = new java.util.Locale
            r1.<init>(r5, r4)
            r4 = r23
            X.2uZ r4 = r4.A03
            if (r4 != 0) goto L_0x04ac
            X.2uZ r4 = X.C59032uZ.A07
        L_0x04ac:
            java.lang.String r12 = r4.A06
            X.17g r11 = r0.A0C
            r7 = 60
            r6 = 0
            r4 = r16
            java.lang.String r30 = r0.A05(r4, r7, r10, r6)
            r5 = 160(0xa0, float:2.24E-43)
            r4 = r18
            java.lang.String r31 = r0.A05(r4, r5, r2, r6)
            r5 = 3
            r4 = r17
            java.lang.String r32 = r0.A05(r4, r7, r5, r6)
            java.lang.String r9 = r0.id
            java.lang.String r4 = r0.jid
            X.0rv r24 = X.C15830rv.A02(r4)
            long r4 = r0.timestamp
            java.lang.String r6 = r0.participant
            com.whatsapp.jid.UserJid r25 = com.whatsapp.jid.UserJid.getNullable(r6)
            java.lang.Long r8 = r0.verifiedSender
            int r7 = r0.verifiedLevel
            r41 = 0
            int r6 = r0.expiration
            r35 = r3
            r42 = 0
            r26 = r23
            r27 = r11
            r28 = r8
            r29 = r3
            r33 = r9
            r34 = r12
            r36 = r20
            r37 = r7
            r38 = r6
            r39 = r4
            X.0tZ r5 = X.C439021z.A02(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41, r42)
            boolean r4 = r5 instanceof X.C30901d9
            if (r4 == 0) goto L_0x051f
            r6 = r5
            X.1d9 r6 = (X.C30901d9) r6
            X.0zG r8 = r0.A09
            X.0ua r7 = r0.A03
            double r9 = r6.A00
            double r11 = r6.A01
            r13 = 15
            byte[] r4 = X.AnonymousClass2K4.A03(r7, r8, r9, r11, r13)
            r6.A02 = r2
            if (r4 == 0) goto L_0x051f
            X.0tm r2 = r6.A0F()
            X.AnonymousClass00B.A06(r2)
            r2.A02(r4)
        L_0x051f:
            if (r5 == 0) goto L_0x0533
            X.AnonymousClass00B.A06(r5)
            X.0t6 r2 = r0.A07
            r2.A0u(r5)
            X.0yB r0 = r0.A05
            java.lang.String r2 = r14.A06
            X.11i r0 = r0.A01
            r0.A01(r2, r1)
            return
        L_0x0533:
            java.lang.String r1 = "RehydrateTemplateJob/onRun/error message is null, param="
            goto L_0x037d
        L_0x0537:
            r3 = move-exception
            r4 = 0
            goto L_0x053f
        L_0x053a:
            r3 = move-exception
            r4 = 0
            r5 = 0
            goto L_0x053f
        L_0x053e:
            r3 = move-exception
        L_0x053f:
            java.lang.String r1 = "RehydrateTemplateJob/onRun/error unable to create message with hsm"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            java.lang.Integer r2 = r3.errorCode
            boolean r1 = r9.equals(r4)
            if (r1 != 0) goto L_0x055d
            r5 = 0
        L_0x055d:
            r0.A06(r2, r4, r5)
            return
        L_0x0561:
            r1 = move-exception
            java.lang.Integer r1 = r1.errorCode
            r0.A06(r1, r3, r3)
            return
        L_0x0568:
            r1 = move-exception
            java.lang.Integer r1 = r1.errorCode
            r0.A06(r1, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.RehydrateTemplateJob.A01():void");
    }

    public boolean A03() {
        return this.A06.A00() >= this.expireTimeMs || super.A03();
    }

    public final String A04() {
        StringBuilder sb = new StringBuilder("; id=");
        sb.append(this.id);
        sb.append("; jid=");
        sb.append(this.jid);
        sb.append("; participant=");
        sb.append(this.participant);
        sb.append("; persistentId=");
        sb.append(this.A01);
        return sb.toString();
    }

    public final String A05(String str, int i2, int i3, int i4) {
        String A052 = AnonymousClass1ZW.A05(i2, str);
        if (str != null && !str.equals(A052)) {
            C74953rN r2 = new C74953rN();
            r2.A02 = Long.valueOf((long) str.length());
            r2.A00 = Integer.valueOf(i3);
            if (i3 == 4) {
                r2.A01 = Long.valueOf((long) i4);
            }
            this.A08.A05(r2);
        }
        return A052;
    }

    public final void A06(Integer num, String str, String str2) {
        this.A0A.A01(C15830rv.A02(this.jid), C15830rv.A02(this.participant), num, this.id, str, str2);
    }

    public void Adl(Context context) {
        AnonymousClass01F r2 = (AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class);
        this.A00 = context.getApplicationContext();
        this.A06 = r2.Agj();
        this.A01 = r2.A6q();
        C16150sX r1 = (C16150sX) r2;
        this.A03 = (C17130ua) r1.AN9.get();
        this.A08 = r2.Ai6();
        this.A0A = (AnonymousClass124) r1.ALe.get();
        this.A02 = (C15900s5) r1.ALm.get();
        this.A04 = (C19000xb) r1.AQX.get();
        this.A07 = (C16460t6) r1.A5k.get();
        this.A05 = (C19280yB) r1.ADD.get();
        this.A09 = (C19950zG) r1.AQV.get();
    }
}
