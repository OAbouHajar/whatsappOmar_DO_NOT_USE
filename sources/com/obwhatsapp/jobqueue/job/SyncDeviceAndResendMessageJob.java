package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass0y3;
import X.AnonymousClass15G;
import X.AnonymousClass16U;
import X.AnonymousClass16V;
import X.AnonymousClass178;
import X.C14710pd;
import X.C15810rt;
import X.C15830rv;
import X.C16030sJ;
import X.C16040sK;
import X.C16150sX;
import X.C16300so;
import X.C16440t3;
import X.C16740tZ;
import X.C16820th;
import X.C18020w1;
import X.C19230xz;
import X.C220816o;
import X.C221816y;
import X.C24531Gh;
import X.C28381Vw;
import X.C28791Xq;
import android.content.Context;
import com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Set;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

public class SyncDeviceAndResendMessageJob extends Job implements C28791Xq {
    public transient int A00;
    public transient C16300so A01;
    public transient C16040sK A02;
    public transient C18020w1 A03;
    public transient C19230xz A04;
    public transient C220816o A05;
    public transient AnonymousClass16U A06;
    public transient C24531Gh A07;
    public transient C16440t3 A08;
    public transient C16820th A09;
    public transient C15810rt A0A;
    public transient C221816y A0B;
    public transient AnonymousClass16V A0C;
    public transient AnonymousClass15G A0D;
    public transient AnonymousClass178 A0E;
    public transient C14710pd A0F;
    public transient AnonymousClass0y3 A0G;
    public transient C28381Vw A0H;
    public transient Boolean A0I;
    public transient Set A0J = new HashSet();
    public transient boolean A0K;
    public final long expirationMs;
    public final String messageId;
    public final String messageRawChatJid;
    public final String[] rawUserJids;
    public final long startTimeMs;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncDeviceAndResendMessageJob(X.C28381Vw r6, com.whatsapp.jid.UserJid[] r7, long r8, long r10, boolean r12) {
        /*
            r5 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2 = 0
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            com.obwhatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement r0 = new com.obwhatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r5.<init>(r0)
            X.AnonymousClass00B.A0J(r7)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5.A0J = r0
            int r4 = r7.length
            r3 = 0
        L_0x002b:
            if (r3 >= r4) goto L_0x003c
            r2 = r7[r3]
            java.util.Set r1 = r5.A0J
            java.lang.String r0 = "invalid jid"
            X.AnonymousClass00B.A07(r2, r0)
            r1.add(r2)
            int r3 = r3 + 1
            goto L_0x002b
        L_0x003c:
            r5.A0H = r6
            java.util.List r0 = java.util.Arrays.asList(r7)
            java.lang.String[] r0 = X.C16030sJ.A0T(r0)
            r5.rawUserJids = r0
            java.lang.String r0 = r6.A01
            r5.messageId = r0
            X.0rv r0 = r6.A00
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.getRawString()
            r5.messageRawChatJid = r0
            r5.expirationMs = r10
            r5.startTimeMs = r8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r5.A0I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SyncDeviceAndResendMessageJob.<init>(X.1Vw, com.whatsapp.jid.UserJid[], long, long, boolean):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.rawUserJids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw new InvalidObjectException("rawJids must not be empty");
        }
        this.A0J = new HashSet();
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            UserJid nullable = UserJid.getNullable(str);
            if (nullable != null) {
                this.A0J.add(nullable);
                i2++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid jid:");
                sb.append(str);
                throw new InvalidObjectException(sb.toString());
            }
        }
        C15830rv A022 = C15830rv.A02(this.messageRawChatJid);
        if (A022 != null) {
            this.A0H = new C28381Vw(A022, this.messageId, true);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("invalid jid:");
        sb2.append(this.messageRawChatJid);
        throw new InvalidObjectException(sb2.toString());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x04c6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x04cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x03b0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x03b5 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0275 A[Catch:{ all -> 0x04cb, Exception -> 0x04f3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r31 = this;
            r18 = 0
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onRun/param="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r0 = r31
            java.lang.String r1 = r0.A04()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            long r4 = r0.expirationMs
            r6 = 0
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0064
            X.0t3 r1 = r0.A08
            long r4 = r1.A00()
            long r2 = r0.expirationMs
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0064
            java.lang.String r1 = "SyncDeviceAndResendMessageJob/onRun/skipping job due to expiration"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            r1 = 5
            r0.A05(r1)
            int r1 = r0.A00
            if (r1 <= 0) goto L_0x0063
            java.lang.String r1 = "SyncDeviceAndResendMessageJob/onRun/expiration due to waiting for requirements"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.0so r3 = r0.A01
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r1 = r0.A00
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.append(r1)
            java.lang.String r1 = "-"
            r2.append(r1)
            java.lang.Boolean r0 = r0.A0I
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "e2e-backfill-expired"
            r3.AcB(r0, r1, r6)
        L_0x0063:
            return
        L_0x0064:
            X.0pd r3 = r0.A0F     // Catch:{ Exception -> 0x04f3 }
            r2 = 2193(0x891, float:3.073E-42)
            X.0tM r1 = X.C16620tM.A02     // Catch:{ Exception -> 0x04f3 }
            boolean r1 = r3.A0E(r1, r2)     // Catch:{ Exception -> 0x04f3 }
            if (r1 == 0) goto L_0x0253
            X.1Vw r1 = r0.A0H     // Catch:{ Exception -> 0x04f3 }
            X.0rv r2 = r1.A00     // Catch:{ Exception -> 0x04f3 }
            boolean r1 = X.C16030sJ.A0M(r2)     // Catch:{ Exception -> 0x04f3 }
            if (r1 != 0) goto L_0x0253
            X.0rt r1 = r0.A0A     // Catch:{ Exception -> 0x04f3 }
            boolean r1 = r1.A0H(r2)     // Catch:{ Exception -> 0x04f3 }
            if (r1 != 0) goto L_0x0253
            java.util.Set r1 = r0.A0J     // Catch:{ Exception -> 0x04f3 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ Exception -> 0x04f3 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x04f3 }
            X.0sK r1 = r0.A02     // Catch:{ Exception -> 0x04f3 }
            r1.A0B()     // Catch:{ Exception -> 0x04f3 }
            X.1ZT r1 = r1.A05     // Catch:{ Exception -> 0x04f3 }
            r2.remove(r1)     // Catch:{ Exception -> 0x04f3 }
            boolean r1 = r2.isEmpty()     // Catch:{ Exception -> 0x04f3 }
            if (r1 == 0) goto L_0x00b7
            java.lang.String r1 = "SyncDeviceAndResendMessageJob/requestPrekeyForDevices only self device in the list. recipients size="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04f3 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x04f3 }
            java.util.Set r1 = r0.A0J     // Catch:{ Exception -> 0x04f3 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x04f3 }
            r2.append(r1)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ Exception -> 0x04f3 }
        L_0x00b0:
            r1 = 8
            r0.A05(r1)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04be
        L_0x00b7:
            X.1Gh r10 = r0.A07     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = ""
            X.AnonymousClass00B.A0A(r1, r2)     // Catch:{ Exception -> 0x04f3 }
            X.1kE r12 = new X.1kE     // Catch:{ Exception -> 0x04f3 }
            r12.<init>()     // Catch:{ Exception -> 0x04f3 }
            X.4Qn r9 = new X.4Qn     // Catch:{ Exception -> 0x04f3 }
            r9.<init>(r10, r12)     // Catch:{ Exception -> 0x04f3 }
            X.0so r8 = r10.A00     // Catch:{ Exception -> 0x04f3 }
            X.0ug r7 = r10.A04     // Catch:{ Exception -> 0x04f3 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x04f3 }
            r5.<init>()     // Catch:{ Exception -> 0x04f3 }
            java.util.Iterator r14 = r2.iterator()     // Catch:{ Exception -> 0x04f3 }
        L_0x00d5:
            boolean r1 = r14.hasNext()     // Catch:{ Exception -> 0x04f3 }
            if (r1 == 0) goto L_0x011a
            java.lang.Object r4 = r14.next()     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ Exception -> 0x04f3 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x04f3 }
            r3.<init>()     // Catch:{ Exception -> 0x04f3 }
            X.0z2 r1 = r10.A03     // Catch:{ Exception -> 0x04f3 }
            java.util.Set r1 = r1.A0D(r4)     // Catch:{ Exception -> 0x04f3 }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ Exception -> 0x04f3 }
        L_0x00f0:
            boolean r1 = r13.hasNext()     // Catch:{ Exception -> 0x04f3 }
            if (r1 == 0) goto L_0x0116
            java.lang.Object r2 = r13.next()     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2     // Catch:{ Exception -> 0x04f3 }
            X.1Yb r11 = X.C28851Ya.A02(r2)     // Catch:{ Exception -> 0x04f3 }
            X.11s r1 = r10.A01     // Catch:{ Exception -> 0x04f3 }
            X.1ev r1 = r1.A0D(r11)     // Catch:{ Exception -> 0x04f3 }
            X.1ms r1 = r1.A01     // Catch:{ Exception -> 0x04f3 }
            X.1mt r1 = r1.A00     // Catch:{ Exception -> 0x04f3 }
            int r1 = r1.A03     // Catch:{ Exception -> 0x04f3 }
            if (r1 <= 0) goto L_0x00f0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x04f3 }
            r3.put(r2, r1)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x00f0
        L_0x0116:
            r5.put(r4, r3)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x00d5
        L_0x011a:
            X.3GV r11 = new X.3GV     // Catch:{ Exception -> 0x04f3 }
            r11.<init>(r8, r9, r7, r5)     // Catch:{ Exception -> 0x04f3 }
            java.util.Map r3 = r11.A03     // Catch:{ Exception -> 0x04f3 }
            boolean r1 = r3.isEmpty()     // Catch:{ Exception -> 0x04f3 }
            r1 = r1 ^ 1
            X.AnonymousClass00B.A0F(r1)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = "FetchPrekeyForAllDevicesProtocolHelper/sendFetchPrekeyForAllDeviceRequest size="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04f3 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x04f3 }
            int r1 = r3.size()     // Catch:{ Exception -> 0x04f3 }
            r2.append(r1)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x04f3 }
            X.0ug r15 = r11.A02     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r10 = r15.A02()     // Catch:{ Exception -> 0x04f3 }
            r23 = 346(0x15a, float:4.85E-43)
            int r1 = r3.size()     // Catch:{ Exception -> 0x04f3 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x04f3 }
            r14.<init>(r1)     // Catch:{ Exception -> 0x04f3 }
            java.util.Set r1 = r3.entrySet()     // Catch:{ Exception -> 0x04f3 }
            java.util.Iterator r17 = r1.iterator()     // Catch:{ Exception -> 0x04f3 }
        L_0x0158:
            boolean r1 = r17.hasNext()     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r13 = "id"
            r9 = 1
            if (r1 == 0) goto L_0x01e3
            java.lang.Object r1 = r17.next()     // Catch:{ Exception -> 0x04f3 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object r8 = r1.getKey()     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.jid.Jid r8 = (com.whatsapp.jid.Jid) r8     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object r2 = r1.getValue()     // Catch:{ Exception -> 0x04f3 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ Exception -> 0x04f3 }
            int r1 = r2.size()     // Catch:{ Exception -> 0x04f3 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x04f3 }
            r7.<init>(r1)     // Catch:{ Exception -> 0x04f3 }
            java.util.Set r1 = r2.entrySet()     // Catch:{ Exception -> 0x04f3 }
            java.util.Iterator r16 = r1.iterator()     // Catch:{ Exception -> 0x04f3 }
        L_0x0184:
            boolean r1 = r16.hasNext()     // Catch:{ Exception -> 0x04f3 }
            if (r1 == 0) goto L_0x01c3
            java.lang.Object r5 = r16.next()     // Catch:{ Exception -> 0x04f3 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object r1 = r5.getValue()     // Catch:{ Exception -> 0x04f3 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x04f3 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x04f3 }
            byte[] r4 = X.C28641Wx.A02(r1)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r3 = "registration"
            X.1Vv r2 = new X.1Vv     // Catch:{ Exception -> 0x04f3 }
            r1 = r18
            r2.<init>((java.lang.String) r3, (byte[]) r4, (X.C35081lL[]) r1)     // Catch:{ Exception -> 0x04f3 }
            X.1lL[] r3 = new X.C35081lL[r9]     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object r1 = r5.getKey()     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ Exception -> 0x04f3 }
            byte r4 = r1.device     // Catch:{ Exception -> 0x04f3 }
            X.1lL r1 = new X.1lL     // Catch:{ Exception -> 0x04f3 }
            r1.<init>((java.lang.String) r13, (int) r4)     // Catch:{ Exception -> 0x04f3 }
            r3[r6] = r1     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r4 = "device"
            X.1Vv r1 = new X.1Vv     // Catch:{ Exception -> 0x04f3 }
            r1.<init>((X.C28371Vv) r2, (java.lang.String) r4, (X.C35081lL[]) r3)     // Catch:{ Exception -> 0x04f3 }
            r7.add(r1)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x0184
        L_0x01c3:
            X.1lL[] r4 = new X.C35081lL[r9]     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r2 = "jid"
            X.1lL r1 = new X.1lL     // Catch:{ Exception -> 0x04f3 }
            r1.<init>((com.whatsapp.jid.Jid) r8, (java.lang.String) r2)     // Catch:{ Exception -> 0x04f3 }
            r4[r6] = r1     // Catch:{ Exception -> 0x04f3 }
            X.1Vv[] r1 = new X.C28371Vv[r6]     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object[] r3 = r7.toArray(r1)     // Catch:{ Exception -> 0x04f3 }
            X.1Vv[] r3 = (X.C28371Vv[]) r3     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r2 = "user"
            X.1Vv r1 = new X.1Vv     // Catch:{ Exception -> 0x04f3 }
            r1.<init>((java.lang.String) r2, (X.C35081lL[]) r4, (X.C28371Vv[]) r3)     // Catch:{ Exception -> 0x04f3 }
            r14.add(r1)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x0158
        L_0x01e3:
            r1 = 4
            X.1lL[] r5 = new X.C35081lL[r1]     // Catch:{ Exception -> 0x04f3 }
            X.1lL r1 = new X.1lL     // Catch:{ Exception -> 0x04f3 }
            r1.<init>((java.lang.String) r13, (java.lang.String) r10)     // Catch:{ Exception -> 0x04f3 }
            r5[r6] = r1     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r3 = "xmlns"
            java.lang.String r2 = "encrypt"
            X.1lL r1 = new X.1lL     // Catch:{ Exception -> 0x04f3 }
            r1.<init>((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ Exception -> 0x04f3 }
            r5[r9] = r1     // Catch:{ Exception -> 0x04f3 }
            r4 = 2
            java.lang.String r3 = "type"
            java.lang.String r2 = "get"
            X.1lL r1 = new X.1lL     // Catch:{ Exception -> 0x04f3 }
            r1.<init>((java.lang.String) r3, (java.lang.String) r2)     // Catch:{ Exception -> 0x04f3 }
            r5[r4] = r1     // Catch:{ Exception -> 0x04f3 }
            r4 = 3
            X.1ks r3 = X.C34791ks.A00     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r2 = "to"
            X.1lL r1 = new X.1lL     // Catch:{ Exception -> 0x04f3 }
            r1.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r2)     // Catch:{ Exception -> 0x04f3 }
            r5[r4] = r1     // Catch:{ Exception -> 0x04f3 }
            X.1Vv[] r1 = new X.C28371Vv[r6]     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object[] r7 = r14.toArray(r1)     // Catch:{ Exception -> 0x04f3 }
            X.1Vv[] r7 = (X.C28371Vv[]) r7     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r2 = "key_fetch"
            X.1Vv r3 = new X.1Vv     // Catch:{ Exception -> 0x04f3 }
            r1 = r18
            r3.<init>((java.lang.String) r2, (X.C35081lL[]) r1, (X.C28371Vv[]) r7)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r2 = "iq"
            X.1Vv r1 = new X.1Vv     // Catch:{ Exception -> 0x04f3 }
            r1.<init>((X.C28371Vv) r3, (java.lang.String) r2, (X.C35081lL[]) r5)     // Catch:{ Exception -> 0x04f3 }
            r24 = 64000(0xfa00, double:3.162E-319)
            r19 = r15
            r20 = r11
            r21 = r1
            r22 = r10
            r19.A0A(r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object r1 = r12.get()     // Catch:{ Exception -> 0x04f3 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x04f3 }
            boolean r5 = r1.booleanValue()     // Catch:{ Exception -> 0x04f3 }
            X.16U r3 = r0.A06     // Catch:{ Exception -> 0x04f3 }
            java.util.Set r2 = r0.A0J     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r6]     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object[] r1 = r2.toArray(r1)     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1     // Catch:{ Exception -> 0x04f3 }
            r3.A01(r1, r4)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x0273
        L_0x0253:
            X.0xz r7 = r0.A04     // Catch:{ Exception -> 0x04f3 }
            java.util.Set r10 = r0.A0J     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = "jid list is empty"
            X.AnonymousClass00B.A0A(r1, r10)     // Catch:{ Exception -> 0x04f3 }
            X.1kz r9 = X.C34861kz.A0E     // Catch:{ Exception -> 0x04f3 }
            r10.size()     // Catch:{ Exception -> 0x04f3 }
            X.27w r8 = X.C453027w.A0D     // Catch:{ Exception -> 0x04f3 }
            r11 = 1
            r12 = 1
            X.1kE r1 = r7.A02(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x04f3 }
            X.284 r1 = (X.AnonymousClass284) r1     // Catch:{ Exception -> 0x04f3 }
            boolean r5 = r1.A00()     // Catch:{ Exception -> 0x04f3 }
        L_0x0273:
            if (r5 == 0) goto L_0x00b0
            X.1Vw r11 = r0.A0H     // Catch:{ Exception -> 0x04f3 }
            X.0th r1 = r0.A09     // Catch:{ Exception -> 0x04f3 }
            X.0tZ r8 = r1.A03(r11)     // Catch:{ Exception -> 0x04f3 }
            if (r8 != 0) goto L_0x029f
            X.15G r1 = r0.A0D     // Catch:{ Exception -> 0x04f3 }
            X.1qx r8 = r1.A05(r11)     // Catch:{ Exception -> 0x04f3 }
            if (r8 != 0) goto L_0x029f
            java.lang.String r1 = "SyncDeviceAndResendMessageJob/revokeMessage/message "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04f3 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x04f3 }
            r2.append(r11)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = " no longer exist"
            r2.append(r1)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04bf
        L_0x029f:
            java.lang.String r2 = "SyncDeviceAndResendMessageJob/message = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04f3 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x04f3 }
            r1.append(r8)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x04f3 }
            X.16V r1 = r0.A0C     // Catch:{ Exception -> 0x04f3 }
            java.util.Set r4 = r1.A00(r11)     // Catch:{ Exception -> 0x04f3 }
            X.16y r12 = r0.A0B     // Catch:{ Exception -> 0x04f3 }
            boolean r5 = r8 instanceof X.C38831rU     // Catch:{ Exception -> 0x04f3 }
            if (r5 == 0) goto L_0x02e3
            java.util.Set r7 = r12.A04(r8)     // Catch:{ Exception -> 0x04f3 }
        L_0x02c0:
            java.lang.String r2 = "SyncDeviceAndResendMessageJob/original list = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04f3 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x04f3 }
            r1.append(r4)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r2 = "SyncDeviceAndResendMessageJob/new list = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04f3 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x04f3 }
            r1.append(r7)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x0313
        L_0x02e3:
            X.1Vw r1 = r8.A11     // Catch:{ Exception -> 0x04f3 }
            boolean r7 = r1.A02     // Catch:{ Exception -> 0x04f3 }
            if (r7 == 0) goto L_0x02f6
            long r1 = r8.A0G     // Catch:{ Exception -> 0x04f3 }
            r9 = 0
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x02f6
            java.util.Set r7 = r12.A05(r8)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x02c0
        L_0x02f6:
            java.lang.String r1 = "MessageDeviceTargetManager/getDevicesToResendMessage/invalid message: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04f3 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x04f3 }
            r3.append(r7)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = " : "
            r3.append(r1)     // Catch:{ Exception -> 0x04f3 }
            long r1 = r8.A0G     // Catch:{ Exception -> 0x04f3 }
            r3.append(r1)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x04f3 }
            r7 = 0
            goto L_0x02c0
        L_0x0313:
            if (r7 == 0) goto L_0x0063
            r7.removeAll(r4)     // Catch:{ Exception -> 0x04f3 }
            boolean r1 = r7.isEmpty()     // Catch:{ Exception -> 0x04f3 }
            if (r1 != 0) goto L_0x0493
            X.178 r2 = r0.A0E     // Catch:{ Exception -> 0x04f3 }
            X.0so r1 = r0.A01     // Catch:{ Exception -> 0x04f3 }
            java.util.Set r1 = X.C16030sJ.A0A(r1, r7)     // Catch:{ Exception -> 0x04f3 }
            java.util.Map r10 = r2.A01(r1)     // Catch:{ Exception -> 0x04f3 }
            X.16V r2 = r0.A0C     // Catch:{ Exception -> 0x04f3 }
            X.0th r1 = r2.A00     // Catch:{ Exception -> 0x04f3 }
            X.0tZ r1 = r1.A03(r11)     // Catch:{ Exception -> 0x04f3 }
            if (r1 != 0) goto L_0x0355
            X.179 r9 = r2.A01     // Catch:{ Exception -> 0x04f3 }
        L_0x0336:
            boolean r1 = r9 instanceof X.AnonymousClass17B     // Catch:{ Exception -> 0x04f3 }
            if (r1 == 0) goto L_0x03b6
            X.17B r9 = (X.AnonymousClass17B) r9     // Catch:{ Exception -> 0x04f3 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Exception -> 0x04f3 }
            r4.<init>()     // Catch:{ Exception -> 0x04f3 }
            X.0th r1 = r9.A01     // Catch:{ Exception -> 0x04f3 }
            X.0tZ r2 = r1.A03(r11)     // Catch:{ Exception -> 0x04f3 }
            if (r2 == 0) goto L_0x043d
            r1 = 1
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ Exception -> 0x04f3 }
            long r1 = r2.A13     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x04f3 }
            r3[r6] = r1     // Catch:{ Exception -> 0x04f3 }
            goto L_0x0358
        L_0x0355:
            X.17B r9 = r2.A02     // Catch:{ Exception -> 0x04f3 }
            goto L_0x0336
        L_0x0358:
            X.0tq r1 = r9.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0434 }
            X.0tf r12 = r1.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0434 }
            X.0tg r2 = r12.A02     // Catch:{ all -> 0x03b1 }
            java.lang.String r1 = "SELECT receipt_device_jid_row_id, primary_device_version FROM receipt_device WHERE message_row_id = ?"
            android.database.Cursor r13 = r2.A08(r1, r3)     // Catch:{ all -> 0x03b1 }
            java.lang.String r1 = "primary_device_version"
            int r11 = r13.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x03aa }
            java.lang.String r1 = "receipt_device_jid_row_id"
            int r3 = r13.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x03aa }
        L_0x0372:
            boolean r1 = r13.moveToNext()     // Catch:{ all -> 0x03aa }
            if (r1 == 0) goto L_0x03a2
            long r1 = r13.getLong(r3)     // Catch:{ all -> 0x03aa }
            X.14v r15 = r9.A02     // Catch:{ all -> 0x03aa }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r14 = com.whatsapp.jid.DeviceJid.class
            com.whatsapp.jid.Jid r2 = r15.A07(r14, r1)     // Catch:{ all -> 0x03aa }
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2     // Catch:{ all -> 0x03aa }
            if (r2 == 0) goto L_0x0372
            byte r1 = r2.device     // Catch:{ all -> 0x03aa }
            if (r1 != 0) goto L_0x0372
            boolean r1 = r13.isNull(r11)     // Catch:{ all -> 0x03aa }
            if (r1 != 0) goto L_0x0372
            com.whatsapp.jid.UserJid r14 = r2.getUserJid()     // Catch:{ all -> 0x03aa }
            long r1 = r13.getLong(r11)     // Catch:{ all -> 0x03aa }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x03aa }
            r4.put(r14, r1)     // Catch:{ all -> 0x03aa }
            goto L_0x0372
        L_0x03a2:
            r13.close()     // Catch:{ all -> 0x03b1 }
            r12.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0434 }
            goto L_0x043d
        L_0x03aa:
            r1 = move-exception
            if (r13 == 0) goto L_0x03b0
            r13.close()     // Catch:{ all -> 0x03b0 }
        L_0x03b0:
            throw r1     // Catch:{ all -> 0x03b1 }
        L_0x03b1:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x03b5 }
        L_0x03b5:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0434 }
        L_0x03b6:
            X.179 r9 = (X.AnonymousClass179) r9     // Catch:{ Exception -> 0x04f3 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Exception -> 0x04f3 }
            r4.<init>()     // Catch:{ Exception -> 0x04f3 }
            X.0rv r2 = r11.A00     // Catch:{ Exception -> 0x04f3 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ Exception -> 0x04f3 }
            X.0ts r1 = r9.A00     // Catch:{ Exception -> 0x04f3 }
            long r12 = r1.A02(r2)     // Catch:{ Exception -> 0x04f3 }
            r1 = 3
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x04f3 }
            r3[r6] = r1     // Catch:{ Exception -> 0x04f3 }
            boolean r1 = r11.A02     // Catch:{ Exception -> 0x04f3 }
            if (r1 == 0) goto L_0x03e6
            java.lang.String r2 = "1"
        L_0x03d7:
            r1 = 1
            r3[r1] = r2     // Catch:{ Exception -> 0x04f3 }
            r2 = 2
            java.lang.String r1 = r11.A01     // Catch:{ Exception -> 0x04f3 }
            r3[r2] = r1     // Catch:{ Exception -> 0x04f3 }
            X.0tq r1 = r9.A04     // Catch:{ Exception -> 0x04f3 }
            X.0tf r12 = r1.get()     // Catch:{ Exception -> 0x04f3 }
            goto L_0x03e9
        L_0x03e6:
            java.lang.String r2 = "0"
            goto L_0x03d7
        L_0x03e9:
            X.0tg r2 = r12.A02     // Catch:{ all -> 0x04c7 }
            java.lang.String r1 = "SELECT receipt_device_jid_row_id, primary_device_version FROM message_add_on JOIN message_add_on_receipt_device ON message_add_on._id = message_add_on_receipt_device.message_add_on_row_id WHERE chat_row_id = ? AND from_me = ? AND key_id = ?"
            android.database.Cursor r13 = r2.A08(r1, r3)     // Catch:{ all -> 0x04c7 }
            java.lang.String r1 = "primary_device_version"
            int r11 = r13.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x04c0 }
            java.lang.String r1 = "receipt_device_jid_row_id"
            int r3 = r13.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x04c0 }
        L_0x03fd:
            boolean r1 = r13.moveToNext()     // Catch:{ all -> 0x04c0 }
            if (r1 == 0) goto L_0x042d
            long r1 = r13.getLong(r3)     // Catch:{ all -> 0x04c0 }
            X.14v r15 = r9.A02     // Catch:{ all -> 0x04c0 }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r14 = com.whatsapp.jid.DeviceJid.class
            com.whatsapp.jid.Jid r2 = r15.A07(r14, r1)     // Catch:{ all -> 0x04c0 }
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2     // Catch:{ all -> 0x04c0 }
            if (r2 == 0) goto L_0x03fd
            byte r1 = r2.device     // Catch:{ all -> 0x04c0 }
            if (r1 != 0) goto L_0x03fd
            boolean r1 = r13.isNull(r11)     // Catch:{ all -> 0x04c0 }
            if (r1 != 0) goto L_0x03fd
            com.whatsapp.jid.UserJid r14 = r2.getUserJid()     // Catch:{ all -> 0x04c0 }
            long r1 = r13.getLong(r11)     // Catch:{ all -> 0x04c0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x04c0 }
            r4.put(r14, r1)     // Catch:{ all -> 0x04c0 }
            goto L_0x03fd
        L_0x042d:
            r13.close()     // Catch:{ all -> 0x04c7 }
            r12.close()     // Catch:{ Exception -> 0x04f3 }
            goto L_0x043d
        L_0x0434:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ Exception -> 0x04f3 }
            X.0ym r1 = r9.A03     // Catch:{ Exception -> 0x04f3 }
            r1.A02()     // Catch:{ Exception -> 0x04f3 }
        L_0x043d:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ Exception -> 0x04f3 }
            r3.<init>()     // Catch:{ Exception -> 0x04f3 }
            java.util.Iterator r11 = r7.iterator()     // Catch:{ Exception -> 0x04f3 }
        L_0x0446:
            boolean r1 = r11.hasNext()     // Catch:{ Exception -> 0x04f3 }
            if (r1 == 0) goto L_0x0492
            java.lang.Object r9 = r11.next()     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.jid.DeviceJid r9 = (com.whatsapp.jid.DeviceJid) r9     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.jid.UserJid r7 = r9.getUserJid()     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object r2 = r10.get(r7)     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object r1 = r4.get(r7)     // Catch:{ Exception -> 0x04f3 }
            boolean r1 = X.C34901l3.A00(r2, r1)     // Catch:{ Exception -> 0x04f3 }
            if (r1 == 0) goto L_0x0468
            r3.add(r9)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x0446
        L_0x0468:
            java.lang.String r1 = "SyncDeviceAndResendMessageJob/filterInvalidDevices/dropping: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04f3 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x04f3 }
            r2.append(r9)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = " currentVersion: "
            r2.append(r1)     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object r1 = r10.get(r7)     // Catch:{ Exception -> 0x04f3 }
            r2.append(r1)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = " versionsAtTimeOfMessageSend: "
            r2.append(r1)     // Catch:{ Exception -> 0x04f3 }
            java.lang.Object r1 = r4.get(r7)     // Catch:{ Exception -> 0x04f3 }
            r2.append(r1)     // Catch:{ Exception -> 0x04f3 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x04f3 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ Exception -> 0x04f3 }
            goto L_0x0446
        L_0x0492:
            r7 = r3
        L_0x0493:
            boolean r1 = r7.isEmpty()     // Catch:{ Exception -> 0x04f3 }
            if (r1 != 0) goto L_0x0063
            X.16V r2 = r0.A0C     // Catch:{ Exception -> 0x04f3 }
            boolean r1 = r8 instanceof X.C38541qx     // Catch:{ Exception -> 0x04f3 }
            if (r1 == 0) goto L_0x04bb
            X.179 r1 = r2.A01     // Catch:{ Exception -> 0x04f3 }
        L_0x04a1:
            r7.size()     // Catch:{ Exception -> 0x04f3 }
            r1.A02(r8, r7, r6)     // Catch:{ Exception -> 0x04f3 }
            X.1kE r20 = new X.1kE     // Catch:{ Exception -> 0x04f3 }
            r20.<init>()     // Catch:{ Exception -> 0x04f3 }
            X.0y3 r9 = r0.A0G     // Catch:{ Exception -> 0x04f3 }
            long r3 = r0.expirationMs     // Catch:{ Exception -> 0x04f3 }
            long r1 = r0.startTimeMs     // Catch:{ Exception -> 0x04f3 }
            X.0t3 r10 = r9.A06     // Catch:{ Exception -> 0x04f3 }
            r23 = 0
            int r6 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r6 != 0) goto L_0x04d5
            goto L_0x04cc
        L_0x04bb:
            X.17B r1 = r2.A02     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04a1
        L_0x04be:
            return
        L_0x04bf:
            return
        L_0x04c0:
            r1 = move-exception
            if (r13 == 0) goto L_0x04c6
            r13.close()     // Catch:{ all -> 0x04c6 }
        L_0x04c6:
            throw r1     // Catch:{ all -> 0x04c7 }
        L_0x04c7:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x04cb }
        L_0x04cb:
            throw r1     // Catch:{ Exception -> 0x04f3 }
        L_0x04cc:
            if (r5 == 0) goto L_0x04d3
            long r1 = r10.A00()     // Catch:{ Exception -> 0x04f3 }
            goto L_0x04d5
        L_0x04d3:
            long r1 = r8.A0I     // Catch:{ Exception -> 0x04f3 }
        L_0x04d5:
            X.2Fi r5 = new X.2Fi     // Catch:{ Exception -> 0x04f3 }
            r17 = r18
            r29 = 0
            r30 = 0
            r19 = r8
            r21 = r17
            r22 = r7
            r25 = r3
            r27 = r1
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25, r27, r29, r30)     // Catch:{ Exception -> 0x04f3 }
            r9.A00(r5)     // Catch:{ Exception -> 0x04f3 }
            r20.get()     // Catch:{ Exception -> 0x04f3 }
            return
        L_0x04f3:
            r3 = move-exception
            java.lang.String r2 = "SyncDeviceAndResendMessageJob/onRun/error, param="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r0 = r0.A04()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SyncDeviceAndResendMessageJob.A01():void");
    }

    public boolean A03() {
        for (Requirement requirement : this.parameters.requirements) {
            if (!requirement.AJT()) {
                StringBuilder sb = new StringBuilder("SyncDeviceAndResendMessageJob/isRequirementsMet/req ");
                sb.append(requirement);
                sb.append(" not present: ");
                sb.append(A04());
                Log.e(sb.toString());
                if (requirement instanceof ChatConnectionRequirement) {
                    this.A00 = 1;
                    this.A0K = true;
                    return false;
                }
                this.A00 = 2;
                return false;
            }
        }
        return true;
    }

    public String A04() {
        StringBuilder sb = new StringBuilder("; key=");
        sb.append(this.A0H);
        sb.append("; timeoutMs=");
        sb.append(this.expirationMs);
        sb.append("; rawJids=");
        sb.append(this.A0J);
        sb.append("; offlineInProgressDuringMessageSend=");
        sb.append(this.A0I);
        return sb.toString();
    }

    public void A05(int i2) {
        C16740tZ A032 = this.A09.A03(this.A0H);
        if (A032 != null || (A032 = this.A0D.A04(this.A0H)) != null) {
            Set A002 = this.A0C.A00(this.A0H);
            this.A03.A0I(A032, i2, 1, C16030sJ.A0A(this.A01, A002).size(), A002.size(), 0, 0, this.A08.A00() - this.startTimeMs, false, false, true, this.A0K);
        }
    }

    public void Adl(Context context) {
        AnonymousClass01F r2 = (AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class);
        this.A08 = r2.Agj();
        C16150sX r1 = (C16150sX) r2;
        this.A0F = (C14710pd) r1.A05.get();
        this.A01 = r2.A6q();
        this.A02 = (C16040sK) r1.ADr.get();
        this.A0A = (C15810rt) r1.A43.get();
        this.A03 = (C18020w1) r1.AF7.get();
        this.A06 = (AnonymousClass16U) r1.A6q.get();
        this.A09 = (C16820th) r1.A3B.get();
        this.A04 = (C19230xz) r1.A5B.get();
        this.A0G = (AnonymousClass0y3) r1.ALd.get();
        this.A0D = (AnonymousClass15G) r1.AEe.get();
        this.A0C = (AnonymousClass16V) r1.AKi.get();
        this.A05 = (C220816o) r1.A6p.get();
        this.A0E = (AnonymousClass178) r1.AJ8.get();
        this.A0B = (C221816y) r1.AEw.get();
        this.A07 = (C24531Gh) r1.AAO.get();
        this.A05.A01(this.A0H);
    }
}
