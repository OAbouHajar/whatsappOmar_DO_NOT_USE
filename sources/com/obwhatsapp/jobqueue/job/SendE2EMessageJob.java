package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass137;
import X.AnonymousClass15G;
import X.AnonymousClass15H;
import X.AnonymousClass16P;
import X.AnonymousClass16V;
import X.AnonymousClass1A4;
import X.AnonymousClass1HD;
import X.AnonymousClass1HK;
import X.AnonymousClass1S7;
import X.AnonymousClass2EC;
import X.AnonymousClass3B8;
import X.C14710pd;
import X.C14870pt;
import X.C15960sC;
import X.C16030sJ;
import X.C16040sK;
import X.C16070sO;
import X.C16150sX;
import X.C16300so;
import X.C16440t3;
import X.C16460t6;
import X.C16740tZ;
import X.C17030uP;
import X.C17190ug;
import X.C17580vJ;
import X.C18020w1;
import X.C18030w2;
import X.C18290wS;
import X.C19150xq;
import X.C19430yQ;
import X.C19450yS;
import X.C208211s;
import X.C221816y;
import X.C222617g;
import X.C222717h;
import X.C24551Gj;
import X.C27731Sx;
import X.C28791Xq;
import X.C33211iD;
import X.C48792Pd;
import X.C84444Ko;
import X.C86404So;
import android.content.Context;
import android.os.SystemClock;
import com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement;
import com.obwhatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement;
import com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement;
import com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class SendE2EMessageJob extends Job implements C28791Xq {
    public static final ConcurrentHashMap A0m = new ConcurrentHashMap();
    public static final long serialVersionUID = 1;
    public transient int A00;
    public transient int A01;
    public transient long A02;
    public transient long A03;
    public transient long A04;
    public transient long A05;
    public transient C16300so A06;
    public transient C14870pt A07;
    public transient C16040sK A08;
    public transient C18020w1 A09;
    public transient AnonymousClass1HD A0A;
    public transient C17030uP A0B;
    public transient C16440t3 A0C;
    public transient C208211s A0D;
    public transient AnonymousClass16P A0E;
    public transient C16460t6 A0F;
    public transient C16070sO A0G;
    public transient C221816y A0H;
    public transient C19150xq A0I;
    public transient AnonymousClass1HK A0J;
    public transient AnonymousClass16V A0K;
    public transient C17580vJ A0L;
    public transient AnonymousClass15H A0M;
    public transient AnonymousClass15G A0N;
    public transient AnonymousClass137 A0O;
    public transient C27731Sx A0P;
    public transient C14710pd A0Q;
    public transient DeviceJid A0R;
    public transient C86404So A0S;
    public transient AnonymousClass3B8 A0T;
    public transient C48792Pd A0U;
    public transient C84444Ko A0V;
    public transient C19430yQ A0W;
    public transient C24551Gj A0X;
    public transient C222717h A0Y;
    public transient C17190ug A0Z;
    public transient C18290wS A0a;
    public transient C33211iD A0b;
    public transient C16740tZ A0c;
    public transient C222617g A0d;
    public transient C15960sC A0e;
    public transient AnonymousClass1S7 A0f;
    public transient AnonymousClass1A4 A0g;
    public transient C19450yS A0h;
    public transient boolean A0i;
    public transient boolean A0j;
    public transient boolean A0k;
    public transient boolean A0l;
    public final HashMap broadcastParticipantEphemeralSettings;
    public boolean duplicate;
    public final int editVersion;
    public final HashMap encryptionRetryCounts;
    public final byte[] ephemeralSharedSecret;
    public final long expireTimeMs;
    public final boolean forceSenderKeyDistribution;
    public final String groupParticipantHash;
    public String groupParticipantHashToSend;
    public final String id;
    public final boolean includeSenderKeysInMessage;
    public final String jid;
    public final Integer liveLocationDuration;
    public final long messageSendStartTime;
    public final int messageType;
    public final boolean multiDeviceFanOut;
    public final long originalTimestamp;
    public final int originationFlags;
    public final String participant;
    public final String recipientRawJid;
    public final int retryCount;
    public final HashSet targetDeviceRawJids;
    public final boolean useLidForEncryption;
    public final boolean useOneOneEncryptionOnPHashMismatch;
    public final AnonymousClass2EC webAttribute;

    /* JADX WARNING: type inference failed for: r24v0, types: [com.whatsapp.jid.Jid] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r23 != null) goto L_0x0031;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x017b  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendE2EMessageJob(com.whatsapp.jid.DeviceJid r23, com.whatsapp.jid.Jid r24, com.whatsapp.jid.UserJid r25, X.C33211iD r26, X.AnonymousClass2EC r27, X.C19450yS r28, java.lang.Integer r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.util.Map r33, java.util.Set r34, byte[] r35, byte[] r36, int r37, int r38, int r39, int r40, long r41, long r43, long r45, long r47, boolean r49, boolean r50, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55) {
        /*
            r22 = this;
            r1 = r25
            r4 = r24
            r6 = r4
            if (r25 != 0) goto L_0x0012
            boolean r0 = r4 instanceof com.whatsapp.jid.DeviceJid
            r1 = r4
            if (r0 == 0) goto L_0x0012
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            com.whatsapp.jid.UserJid r1 = r1.getUserJid()
        L_0x0012:
            X.4Ud r7 = new X.4Ud
            r7.<init>()
            java.lang.String r0 = r1.getRawString()
            r7.A00 = r0
            r0 = 1
            r7.A02 = r0
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r7.A01(r0)
            boolean r11 = r4 instanceof X.C16060sN
            r5 = r23
            if (r11 == 0) goto L_0x0031
            r14 = 1
            if (r23 == 0) goto L_0x0032
        L_0x0031:
            r14 = 0
        L_0x0032:
            r12 = r35
            if (r35 == 0) goto L_0x0041
            int r0 = r12.length
            if (r0 != 0) goto L_0x0041
            java.lang.String r1 = "cannot use empty old alice base key"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0041:
            r2 = r34
            r10 = r31
            r9 = r30
            r1 = r37
            r0 = r52
            r8 = r50
            r3 = r40
            r13 = r53
            if (r14 == 0) goto L_0x0141
            if (r35 != 0) goto L_0x01a4
            if (r50 == 0) goto L_0x019c
            r6 = 8
            r12 = 0
            if (r3 == r6) goto L_0x005d
            r12 = 1
        L_0x005d:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r12)
            if (r11 == 0) goto L_0x013e
            r15 = r4
            X.0sN r15 = (X.C16060sN) r15
        L_0x0066:
            com.obwhatsapp.jobqueue.requirement.AxolotlMultiDeviceSenderKeyRequirement r14 = new com.obwhatsapp.jobqueue.requirement.AxolotlMultiDeviceSenderKeyRequirement
            r21 = r13
            r20 = r1
            r19 = r2
            r18 = r10
            r17 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
        L_0x0075:
            r7.A01(r14)
        L_0x0078:
            r6 = r29
            if (r29 == 0) goto L_0x0084
            com.obwhatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement r11 = new com.obwhatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement
            r11.<init>()
            r7.A01(r11)
        L_0x0084:
            if (r55 == 0) goto L_0x008e
            com.obwhatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement r11 = new com.obwhatsapp.jobqueue.requirement.OfflineProcessingCompletedRequirement
            r11.<init>()
            r7.A01(r11)
        L_0x008e:
            org.whispersystems.jobqueue.JobParameters r11 = r7.A00()
            r7 = r22
            r7.<init>(r11)
            r11 = 0
            r7.A00 = r11
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r7.encryptionRetryCounts = r11
            r11 = r26
            X.AnonymousClass00B.A06(r11)
            r7.A0b = r11
            X.AnonymousClass00B.A05(r9)
            r7.id = r9
            java.lang.String r9 = r4.getRawString()
            r7.jid = r9
            com.whatsapp.jid.DeviceJid r9 = com.whatsapp.jid.DeviceJid.of(r4)
            r7.A0R = r9
            java.lang.String r9 = X.C16030sJ.A03(r5)
            r7.participant = r9
            java.lang.String r9 = X.C16030sJ.A03(r25)
            r7.recipientRawJid = r9
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            X.C16030sJ.A0E(r2, r9)
            r7.targetDeviceRawJids = r9
            r7.messageType = r1
            r1 = r38
            r7.retryCount = r1
            r1 = r49
            r7.A0l = r1
            r1 = r41
            r7.A05 = r1
            r7.groupParticipantHash = r10
            r1 = r32
            r7.groupParticipantHashToSend = r1
            r1 = r27
            r7.webAttribute = r1
            r7.includeSenderKeysInMessage = r8
            r1 = r43
            r7.expireTimeMs = r1
            r1 = r45
            r7.messageSendStartTime = r1
            r1 = r47
            r7.originalTimestamp = r1
            r1 = r39
            r7.originationFlags = r1
            r7.editVersion = r3
            r7.liveLocationDuration = r6
            r1 = r51
            r7.useOneOneEncryptionOnPHashMismatch = r1
            r7.multiDeviceFanOut = r0
            r7.useLidForEncryption = r13
            r0 = r36
            r7.ephemeralSharedSecret = r0
            r0 = r28
            r7.A0h = r0
            if (r33 == 0) goto L_0x017b
            java.util.Set r0 = r33.entrySet()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            if (r0 == 0) goto L_0x017c
            java.util.Iterator r3 = r0.iterator()
        L_0x011e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x017c
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getKey()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 == 0) goto L_0x011e
            java.lang.String r1 = r0.getRawString()
            java.lang.Object r0 = r2.getValue()
            r6.put(r1, r0)
            goto L_0x011e
        L_0x013e:
            r15 = 0
            goto L_0x0066
        L_0x0141:
            if (r52 == 0) goto L_0x015d
            r11 = 8
            r12 = 0
            if (r3 == r11) goto L_0x0149
            r12 = 1
        L_0x0149:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r12)
            X.0rv r6 = (X.C15830rv) r6
            com.obwhatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement r14 = new com.obwhatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement
            r17 = r9
            r18 = r2
            r19 = r1
            r15 = r6
            r14.<init>(r15, r16, r17, r18, r19)
            goto L_0x0075
        L_0x015d:
            if (r23 == 0) goto L_0x0160
            r6 = r5
        L_0x0160:
            com.whatsapp.jid.DeviceJid r11 = com.whatsapp.jid.DeviceJid.of(r6)
            X.AnonymousClass00B.A06(r11)
            com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement r6 = new com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r6.<init>(r11)
            r7.A01(r6)
            if (r35 == 0) goto L_0x0078
            com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r6 = new com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            r6.<init>(r11, r12)
            r7.A01(r6)
            goto L_0x0078
        L_0x017b:
            r6 = 0
        L_0x017c:
            r7.broadcastParticipantEphemeralSettings = r6
            r0 = r54
            r7.forceSenderKeyDistribution = r0
            java.lang.String r0 = "sende2emessagejob/e2e message send job created"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7.A05(r5, r4)
            return
        L_0x019c:
            java.lang.String r1 = "cannot use group encryption without including sender key in message"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01a4:
            java.lang.String r1 = "cannot use group encryption and old alice base key simultaneously"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendE2EMessageJob.<init>(com.whatsapp.jid.DeviceJid, com.whatsapp.jid.Jid, com.whatsapp.jid.UserJid, X.1iD, X.2EC, X.0yS, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.util.Set, byte[], byte[], int, int, int, int, long, long, long, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A0b = C33211iD.A0U((byte[]) objectInputStream.readObject());
        } catch (OptionalDataException unused) {
            StringBuilder sb = new StringBuilder("sende2emessagejob/e2e missing message bytes ");
            sb.append(A04());
            Log.e(sb.toString());
        }
        if (this.A0b == null) {
            StringBuilder sb2 = new StringBuilder("message must not be null");
            sb2.append(A04());
            throw new InvalidObjectException(sb2.toString());
        } else if (this.id != null) {
            Jid nullable = Jid.getNullable(this.jid);
            if (nullable != null) {
                this.A0R = DeviceJid.getNullable(this.jid);
                DeviceJid nullable2 = DeviceJid.getNullable(this.participant);
                if (this.groupParticipantHashToSend == null) {
                    this.groupParticipantHashToSend = this.groupParticipantHash;
                }
                this.A0i = true;
                this.A05 = SystemClock.uptimeMillis();
                A05(nullable2, nullable);
                StringBuilder sb3 = new StringBuilder("sende2emessagejob/readObject done: ");
                sb3.append(A04());
                Log.i(sb3.toString());
                return;
            }
            StringBuilder sb4 = new StringBuilder("jid must not be null");
            sb4.append(A04());
            throw new InvalidObjectException(sb4.toString());
        } else {
            StringBuilder sb5 = new StringBuilder("id must not be null");
            sb5.append(A04());
            throw new InvalidObjectException(sb5.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A0b.A02());
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0307, code lost:
        if ((!r2.equals(r0.groupParticipantHash)) != false) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0337, code lost:
        if (r15 == null) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x055f, code lost:
        if (r7.A0J(r3) == false) goto L_0x0561;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x08bd, code lost:
        if ((r4 & 131072) == 131072) goto L_0x08bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x08d3, code lost:
        if ((r4 & 128) != 128) goto L_0x08d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x08e7, code lost:
        if ((r1.A00 & 64) == 64) goto L_0x08e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02be, code lost:
        if (r25 != null) goto L_0x02c0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:654:0x0e82 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:659:0x0e87 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:664:0x0e8c */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0723  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x072b  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0763  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x078b  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x079e  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x07be  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0891  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x08a8  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x08b9  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x09b9  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x09c9  */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x09e5  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0a24  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a2b  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0af9  */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x0c1c  */
    /* JADX WARNING: Removed duplicated region for block: B:564:0x0c20  */
    /* JADX WARNING: Removed duplicated region for block: B:565:0x0c24  */
    /* JADX WARNING: Removed duplicated region for block: B:567:0x0c32  */
    /* JADX WARNING: Removed duplicated region for block: B:573:0x0c55  */
    /* JADX WARNING: Removed duplicated region for block: B:583:0x0ca7  */
    /* JADX WARNING: Removed duplicated region for block: B:586:0x0cc5  */
    /* JADX WARNING: Removed duplicated region for block: B:588:0x0cd2  */
    /* JADX WARNING: Removed duplicated region for block: B:629:0x0df5  */
    /* JADX WARNING: Removed duplicated region for block: B:694:0x09d6 A[EDGE_INSN: B:694:0x09d6->B:435:0x09d6 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r105 = this;
            long r16 = android.os.SystemClock.uptimeMillis()
            r0 = r105
            long r4 = r0.A05
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0012
            r1 = r16
            r0.A05 = r1
        L_0x0012:
            java.lang.String r30 = r0.A04()
            boolean r1 = r0.duplicate
            if (r1 == 0) goto L_0x0032
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sende2emessagejob/e2e messasge job is duplicate skipping"
        L_0x0022:
            r1.append(r0)
            r0 = r30
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x002e:
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0031:
            return
        L_0x0032:
            java.lang.String r1 = r0.jid
            com.whatsapp.jid.Jid r26 = com.whatsapp.jid.Jid.get(r1)
            X.0rv r20 = X.C16030sJ.A00(r26)
            X.AnonymousClass00B.A06(r20)
            java.lang.String r1 = r0.participant
            com.whatsapp.jid.DeviceJid r25 = com.whatsapp.jid.DeviceJid.getNullable(r1)
            java.lang.String r1 = r0.recipientRawJid
            com.whatsapp.jid.UserJid r24 = com.whatsapp.jid.UserJid.getNullable(r1)
            java.lang.String r1 = r0.participant
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0071
            com.whatsapp.jid.DeviceJid r1 = r0.A0R
            r34 = r1
        L_0x0057:
            r4 = 1
            if (r24 == 0) goto L_0x0074
            com.whatsapp.jid.DeviceJid r1 = r0.A0R
            X.AnonymousClass00B.A06(r1)
            com.whatsapp.jid.UserJid r2 = r1.getUserJid()
            X.0sK r1 = r0.A08
            boolean r1 = r1.A0I(r2)
            if (r1 != 0) goto L_0x0087
            java.lang.String r0 = "cannot send e2e message with recipient other than own devices"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0071:
            r34 = r25
            goto L_0x0057
        L_0x0074:
            int r2 = r0.editVersion
            r1 = 8
            if (r2 != r1) goto L_0x007b
            r4 = 0
        L_0x007b:
            java.lang.String r3 = r0.id
            X.1Vw r23 = new X.1Vw
            r2 = r20
            r1 = r23
            r1.<init>(r2, r3, r4)
            goto L_0x0092
        L_0x0087:
            java.lang.String r3 = r0.id
            X.1Vw r23 = new X.1Vw
            r2 = r23
            r1 = r24
            r2.<init>(r1, r3, r4)
        L_0x0092:
            X.16V r5 = r0.A0K
            X.16y r4 = r0.A0H
            java.util.HashSet r3 = r0.targetDeviceRawJids
            int r2 = r0.messageType
            X.2Pd r1 = new X.2Pd
            r6 = r1
            r7 = r4
            r8 = r5
            r9 = r23
            r10 = r3
            r11 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            r0.A0U = r1
            X.1iD r1 = r0.A0b
            boolean r1 = X.AnonymousClass23W.A02(r1)
            if (r1 == 0) goto L_0x0e4f
            X.15G r2 = r0.A0N
            X.1qx r3 = r2.A04(r9)
        L_0x00b6:
            if (r3 != 0) goto L_0x00cd
            int r2 = r0.messageType
            r1 = 58
            if (r2 == r1) goto L_0x0e46
            r1 = 69
            if (r2 == r1) goto L_0x0e3d
            r1 = 77
            if (r2 != r1) goto L_0x00cd
            long r1 = r0.messageSendStartTime
            X.1s8 r3 = new X.1s8
            r3.<init>(r9, r1)
        L_0x00cd:
            r0.A0c = r3
            if (r3 == 0) goto L_0x0e17
            byte r2 = r3.A10
            r1 = 73
            if (r2 != r1) goto L_0x0e17
        L_0x00d7:
            r35 = 0
        L_0x00d9:
            X.1iD r1 = r0.A0b
            int r2 = r1.A00
            r1 = 1024(0x400, float:1.435E-42)
            r2 = r2 & r1
            if (r2 == r1) goto L_0x00fe
            X.0tZ r1 = r0.A0c
            if (r1 != 0) goto L_0x00fe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sende2emessagejob/e2e message was deleted from message store"
        L_0x00ee:
            r1.append(r0)
        L_0x00f1:
            r0 = r30
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00fe:
            X.0t3 r1 = r0.A0C
            long r4 = r1.A00()
            long r1 = r0.expireTimeMs
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 < 0) goto L_0x0150
            java.lang.String r1 = "sende2emessagejob/e2e message send job expired"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r1 = r30
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0tZ r1 = r0.A0c
            if (r1 == 0) goto L_0x0031
            boolean r15 = r0.A08()
            X.0w1 r3 = r0.A09
            X.0tZ r4 = r0.A0c
            int r7 = r4.A0A
            X.2Pd r1 = r0.A0U
            java.util.Collection r1 = r1.A00()
            int r8 = r1.size()
            X.0t3 r1 = r0.A0C
            long r11 = r1.A00()
            X.0tZ r1 = r0.A0c
            long r1 = r1.A0I
            long r11 = r11 - r1
            r13 = r15 ^ 1
            boolean r0 = r0.A0l
            r5 = 5
            r6 = 1
            r9 = 0
            r10 = 0
            r14 = 0
            r16 = r0
            r3.A0I(r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16)
            return
        L_0x0150:
            X.0tZ r3 = r0.A0c
            if (r3 == 0) goto L_0x0169
            X.0t3 r1 = r0.A0C
            long r1 = r1.A00()
            boolean r1 = X.C38621r6.A0v(r3, r1)
            if (r1 == 0) goto L_0x0169
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sende2emessagejob/e2e message is ephemerally expired"
            goto L_0x00ee
        L_0x0169:
            java.lang.String r1 = "sende2emessagejob/running e2e message send job"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r1 = r30
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            int r2 = r0.retryCount
            r1 = 4
            if (r2 <= r1) goto L_0x018c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sende2emessagejob/aborting e2e message send job due to high retry count"
            goto L_0x0022
        L_0x018c:
            X.2Pd r1 = r0.A0U
            java.util.Collection r29 = r1.A00()
            boolean r1 = r0.A07()
            if (r1 == 0) goto L_0x01a8
            boolean r1 = r29.isEmpty()
            if (r1 == 0) goto L_0x01a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sende2emessagejob/aborting e2e message send job due to empty target devices"
            goto L_0x0022
        L_0x01a8:
            X.0sK r2 = r0.A08
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r20)
            if (r1 == 0) goto L_0x01ca
            com.whatsapp.jid.UserJid r1 = r1.getUserJid()
            boolean r1 = r2.A0I(r1)
            if (r1 == 0) goto L_0x01ca
            boolean r1 = r29.isEmpty()
            if (r1 == 0) goto L_0x01ca
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sende2emessagejob/aborting e2e message send job due to empty deviceEncryptedMessages for self-thread"
            goto L_0x0022
        L_0x01ca:
            boolean r1 = r0.A0j
            if (r1 == 0) goto L_0x01e7
            X.0w1 r2 = r0.A09
            java.lang.String r1 = r0.id
            int r4 = r1.hashCode()
            r3 = 8
            boolean r1 = r2.A0M
            if (r1 == 0) goto L_0x01e7
            X.18E r2 = r2.A0E
            boolean r1 = r2.A07(r4)
            if (r1 == 0) goto L_0x01e7
            r2.A02(r4, r3)
        L_0x01e7:
            X.0w1 r2 = r0.A09
            java.lang.String r1 = r0.id
            int r5 = r1.hashCode()
            X.0tZ r1 = r0.A0c
            if (r1 == 0) goto L_0x06f8
            byte r4 = r1.A10
        L_0x01f5:
            r3 = 7
            boolean r1 = r2.A0M
            if (r1 == 0) goto L_0x0200
            X.18E r2 = r2.A0E
            r1 = -1
            r2.A05(r5, r3, r1, r4)
        L_0x0200:
            X.1kL r2 = new X.1kL
            r2.<init>()
            r1 = r26
            r2.A01 = r1
            java.lang.String r1 = "message"
            r2.A05 = r1
            java.lang.String r1 = r9.A01
            r33 = r1
            r2.A07 = r1
            r1 = r25
            r2.A02 = r1
            r1 = r24
            r2.A03 = r1
            int r1 = r0.editVersion
            if (r1 == 0) goto L_0x06f5
            java.lang.String r1 = java.lang.Integer.toString(r1)
        L_0x0223:
            r2.A06 = r1
            X.1ci r28 = r2.A00()
            X.0pd r1 = r0.A0Q
            r32 = r1
            X.0so r1 = r0.A06
            r31 = r1
            X.0sK r1 = r0.A08
            r27 = r1
            X.0w1 r1 = r0.A09
            r22 = r1
            X.16P r1 = r0.A0E
            r21 = r1
            X.3B8 r1 = r0.A0T
            r19 = r1
            X.11s r1 = r0.A0D
            r18 = r1
            X.137 r15 = r0.A0O
            X.1Sx r14 = r0.A0P
            X.0sO r13 = r0.A0G
            X.2Pd r12 = r0.A0U
            java.lang.String r10 = r0.jid
            java.lang.String r9 = r0.recipientRawJid
            X.0tZ r8 = r0.A0c
            X.1iD r7 = r0.A0b
            byte[] r6 = r0.ephemeralSharedSecret
            java.util.HashMap r5 = r0.broadcastParticipantEphemeralSettings
            X.4So r4 = r0.A0S
            int r3 = r0.retryCount
            int r2 = r0.editVersion
            boolean r1 = r0.useLidForEncryption
            X.3Ak r11 = new X.3Ak
            r36 = r11
            r37 = r31
            r38 = r27
            r39 = r22
            r40 = r18
            r41 = r21
            r42 = r13
            r43 = r15
            r44 = r14
            r45 = r32
            r46 = r4
            r47 = r19
            r48 = r12
            r49 = r7
            r50 = r8
            r51 = r23
            r52 = r10
            r53 = r9
            r54 = r30
            r55 = r5
            r56 = r6
            r57 = r3
            r58 = r2
            r59 = r1
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59)
            X.4Ko r1 = r0.A0V
            if (r1 == 0) goto L_0x02ae
            java.lang.String r1 = "sende2emessagejob/reusing encrypted payloads from previous run for job:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r1 = r30
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x02ae:
            X.4Ko r1 = r0.A0V
            if (r1 == 0) goto L_0x0677
            java.util.Map r1 = r1.A02
            r19 = r1
        L_0x02b6:
            r1 = r20
            boolean r2 = r1 instanceof X.C16060sN
            if (r2 == 0) goto L_0x02c0
            r18 = 1
            if (r25 == 0) goto L_0x02c2
        L_0x02c0:
            r18 = 0
        L_0x02c2:
            boolean r1 = r0.useOneOneEncryptionOnPHashMismatch
            if (r1 == 0) goto L_0x0673
            if (r2 == 0) goto L_0x0673
            java.lang.String r1 = r0.participant
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0673
            boolean r1 = r0.A07()
            if (r1 != 0) goto L_0x0309
            java.lang.String r1 = r0.groupParticipantHash
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0673
            r3 = r20
            X.0sN r3 = (X.C16060sN) r3
            java.lang.String r2 = r0.groupParticipantHash
            X.AnonymousClass00B.A06(r2)
            java.lang.String r1 = "2"
            boolean r2 = r2.startsWith(r1)
            X.0sO r1 = r0.A0G
            if (r2 == 0) goto L_0x0667
            boolean r2 = r0.useLidForEncryption
            X.0us r1 = r1.A07
            X.1cE r1 = r1.A04(r3)
            if (r2 == 0) goto L_0x0661
            java.lang.String r2 = r1.A09()
        L_0x02ff:
            java.lang.String r1 = r0.groupParticipantHash
            boolean r1 = r2.equals(r1)
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0673
        L_0x0309:
            r82 = 1
        L_0x030b:
            X.4Ko r1 = r0.A0V
            if (r1 == 0) goto L_0x0391
            X.4Kn r3 = r1.A00
        L_0x0311:
            java.util.Map r1 = r3.A02
            r22 = r1
            if (r18 == 0) goto L_0x038e
            boolean r1 = r0.includeSenderKeysInMessage
            if (r1 == 0) goto L_0x038e
            if (r22 == 0) goto L_0x038e
            int r68 = r22.size()
            r1 = 2
            r0.A00 = r1
        L_0x0324:
            r1 = 1
            if (r82 == 0) goto L_0x0329
            r0.A00 = r1
        L_0x0329:
            boolean r1 = r19.isEmpty()
            if (r1 == 0) goto L_0x06fc
            if (r82 != 0) goto L_0x06fc
            X.4Ko r1 = r0.A0V
            if (r1 == 0) goto L_0x033e
            X.1d1 r15 = r1.A01
        L_0x0337:
            if (r15 != 0) goto L_0x06fd
        L_0x0339:
            java.lang.String r0 = "sende2emessagejob/not sending message since companion's identity has changed"
            goto L_0x002e
        L_0x033e:
            if (r18 == 0) goto L_0x0369
            boolean r1 = r11.A0N
            if (r1 == 0) goto L_0x0353
            X.1nS r2 = r11.A01()
        L_0x0348:
            if (r2 == 0) goto L_0x0339
            int r1 = r2.A01
            if (r1 != 0) goto L_0x0e59
            X.1d1 r15 = X.AnonymousClass3Ak.A00(r2)
            goto L_0x0337
        L_0x0353:
            X.16P r4 = r11.A06
            r2 = 14
            com.facebook.redex.IDxCallableShape148S0100000_2_I0 r1 = new com.facebook.redex.IDxCallableShape148S0100000_2_I0
            r1.<init>(r11, r2)
            java.util.concurrent.ThreadPoolExecutor r2 = r4.A00
            java.util.concurrent.Future r1 = r2.submit(r1)
            java.lang.Object r2 = r1.get()
            X.1nS r2 = (X.C36381nS) r2
            goto L_0x0348
        L_0x0369:
            X.AnonymousClass00B.A06(r34)
            boolean r1 = r11.A0N
            if (r1 == 0) goto L_0x0377
            r1 = r34
            X.1nS r2 = r11.A02(r1)
            goto L_0x0348
        L_0x0377:
            X.16P r5 = r11.A06
            r4 = 1
            com.facebook.redex.IDxCallableShape45S0200000_2_I0 r2 = new com.facebook.redex.IDxCallableShape45S0200000_2_I0
            r1 = r34
            r2.<init>(r11, r4, r1)
            java.util.concurrent.ThreadPoolExecutor r1 = r5.A00
            java.util.concurrent.Future r1 = r1.submit(r2)
            java.lang.Object r2 = r1.get()
            X.1nS r2 = (X.C36381nS) r2
            goto L_0x0348
        L_0x038e:
            r68 = 0
            goto L_0x0324
        L_0x0391:
            boolean r2 = r0.includeSenderKeysInMessage
            com.whatsapp.jid.Jid r13 = r11.A0B
            boolean r1 = r13 instanceof X.C16060sN
            if (r1 == 0) goto L_0x03cd
            X.0sN r13 = (X.C16060sN) r13
        L_0x039b:
            if (r82 == 0) goto L_0x04b0
            java.lang.String r2 = r11.A0I
            X.AnonymousClass00B.A06(r13)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            if (r13 != 0) goto L_0x03c6
            r1 = 0
        L_0x03aa:
            r6 = 0
            if (r1 != 0) goto L_0x03cf
            java.lang.String r3 = "sende2emessagejob/unable to retrieve participants for one time message"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.4Kn r3 = new X.4Kn
            r3.<init>(r6, r7, r6)
            goto L_0x0311
        L_0x03c6:
            X.2Pd r1 = r11.A0E
            java.util.Collection r1 = r1.A00()
            goto L_0x03aa
        L_0x03cd:
            r13 = 0
            goto L_0x039b
        L_0x03cf:
            boolean r2 = X.C16030sJ.A0H(r13)
            if (r2 == 0) goto L_0x03e9
            byte[] r2 = r11.A0O
            if (r2 == 0) goto L_0x03e9
            java.util.Map r2 = r11.A0L
            if (r2 == 0) goto L_0x03e9
            boolean r2 = r13 instanceof X.C34841kx
            if (r2 == 0) goto L_0x03f1
            X.1kx r13 = (X.C34841kx) r13
        L_0x03e3:
            X.AnonymousClass00B.A06(r13)
            r11.A09(r13, r1, r7)
        L_0x03e9:
            java.lang.String r2 = "E2eMessageEncryptor/getParticipantsDataForForceOneOneEncryption"
            X.1Zf r12 = new X.1Zf
            r12.<init>((java.lang.String) r2)
            goto L_0x03f3
        L_0x03f1:
            r13 = 0
            goto L_0x03e3
        L_0x03f3:
            r12.A03()     // Catch:{ all -> 0x0ebf }
            X.0so r3 = r11.A02     // Catch:{ all -> 0x0ebf }
            int r2 = r1.size()     // Catch:{ all -> 0x0ebf }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x0ebf }
            r4.<init>(r2)     // Catch:{ all -> 0x0ebf }
            X.C16030sJ.A0C(r3, r1, r4)     // Catch:{ all -> 0x0ebf }
            X.137 r3 = r11.A08     // Catch:{ all -> 0x0ebf }
            boolean r2 = r11.A0M     // Catch:{ all -> 0x0ebf }
            java.util.Map r9 = r3.A07(r4, r2)     // Catch:{ all -> 0x0ebf }
            java.util.TreeMap r8 = new java.util.TreeMap     // Catch:{ all -> 0x0ebf }
            r8.<init>()     // Catch:{ all -> 0x0ebf }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x0ebf }
        L_0x0415:
            boolean r1 = r13.hasNext()     // Catch:{ all -> 0x0ebf }
            if (r1 == 0) goto L_0x0472
            java.lang.Object r5 = r13.next()     // Catch:{ all -> 0x0ebf }
            com.whatsapp.jid.DeviceJid r5 = (com.whatsapp.jid.DeviceJid) r5     // Catch:{ all -> 0x0ebf }
            X.0sK r1 = r11.A03     // Catch:{ all -> 0x0ebf }
            boolean r1 = r1.A0K(r5)     // Catch:{ all -> 0x0ebf }
            if (r1 != 0) goto L_0x0415
            X.3B8 r4 = r11.A0D     // Catch:{ all -> 0x0ebf }
            X.1Vw r3 = r11.A0H     // Catch:{ all -> 0x0ebf }
            X.1iD r2 = r11.A0F     // Catch:{ all -> 0x0ebf }
            java.lang.String r1 = r11.A0J     // Catch:{ all -> 0x0ebf }
            boolean r10 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0ebf }
            if (r10 == 0) goto L_0x0439
            java.lang.String r1 = r11.A0K     // Catch:{ all -> 0x0ebf }
        L_0x0439:
            X.1iD r4 = r4.A02(r5, r2, r3, r1)     // Catch:{ all -> 0x0ebf }
            com.whatsapp.jid.UserJid r1 = r5.getUserJid()     // Catch:{ all -> 0x0ebf }
            java.lang.Object r2 = r9.get(r1)     // Catch:{ all -> 0x0ebf }
            X.27R r2 = (X.AnonymousClass27R) r2     // Catch:{ all -> 0x0ebf }
            if (r2 == 0) goto L_0x045d
            X.1iD r1 = X.C33211iD.A0o     // Catch:{ all -> 0x0ebf }
            X.1Wr r1 = r1.A0U()     // Catch:{ all -> 0x0ebf }
            r1.A04(r4)     // Catch:{ all -> 0x0ebf }
            X.1iE r1 = (X.C33221iE) r1     // Catch:{ all -> 0x0ebf }
            X.C41061vA.A0B(r2, r1)     // Catch:{ all -> 0x0ebf }
            X.1Wm r4 = r1.A02()     // Catch:{ all -> 0x0ebf }
            X.1iD r4 = (X.C33211iD) r4     // Catch:{ all -> 0x0ebf }
        L_0x045d:
            X.0pd r3 = r11.A0A     // Catch:{ all -> 0x0ebf }
            r2 = 1723(0x6bb, float:2.414E-42)
            X.0tM r1 = X.C16620tM.A02     // Catch:{ all -> 0x0ebf }
            int r2 = r3.A03(r1, r2)     // Catch:{ all -> 0x0ebf }
            r1 = -1
            if (r2 == r1) goto L_0x046e
            X.1iD r4 = X.AnonymousClass3B8.A00(r4, r2)     // Catch:{ all -> 0x0ebf }
        L_0x046e:
            r8.put(r5, r4)     // Catch:{ all -> 0x0ebf }
            goto L_0x0415
        L_0x0472:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ebf }
            r2.<init>()     // Catch:{ all -> 0x0ebf }
            java.lang.String r1 = "e2e messages created: "
            r2.append(r1)     // Catch:{ all -> 0x0ebf }
            int r1 = r8.size()     // Catch:{ all -> 0x0ebf }
            r2.append(r1)     // Catch:{ all -> 0x0ebf }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0ebf }
            r12.A02(r1)     // Catch:{ all -> 0x0ebf }
            java.util.Map r2 = r11.A08(r8)     // Catch:{ all -> 0x0ebf }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ebf }
            r3.<init>()     // Catch:{ all -> 0x0ebf }
            java.lang.String r1 = "messages encrypted: "
            r3.append(r1)     // Catch:{ all -> 0x0ebf }
            int r1 = r2.size()     // Catch:{ all -> 0x0ebf }
            r3.append(r1)     // Catch:{ all -> 0x0ebf }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0ebf }
            r12.A02(r1)     // Catch:{ all -> 0x0ebf }
            r12.A01()
            X.4Kn r3 = new X.4Kn
            r3.<init>(r6, r7, r2)
            goto L_0x0311
        L_0x04b0:
            if (r18 == 0) goto L_0x0654
            if (r2 == 0) goto L_0x0654
            X.AnonymousClass00B.A06(r13)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            if (r13 != 0) goto L_0x04dd
            r9 = 0
        L_0x04bf:
            r8 = 0
            if (r9 != 0) goto L_0x04e4
            java.lang.String r1 = "sende2emessagejob/unable to retrieve participants in group at time of message"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r11.A0I
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.4Kn r3 = new X.4Kn
            r3.<init>(r8, r10, r8)
            goto L_0x0311
        L_0x04dd:
            X.2Pd r1 = r11.A0E
            java.util.Collection r9 = r1.A00()
            goto L_0x04bf
        L_0x04e4:
            boolean r32 = X.C16030sJ.A0H(r13)
            if (r32 == 0) goto L_0x04ff
            byte[] r1 = r11.A0O
            if (r1 == 0) goto L_0x04ff
            java.util.Map r1 = r11.A0L
            if (r1 == 0) goto L_0x04ff
            boolean r1 = r13 instanceof X.C34841kx
            if (r1 == 0) goto L_0x0525
            r1 = r13
            X.1kx r1 = (X.C34841kx) r1
        L_0x04f9:
            X.AnonymousClass00B.A06(r1)
            r11.A09(r1, r9, r10)
        L_0x04ff:
            X.0sO r1 = r11.A07
            X.0us r1 = r1.A07
            X.1cE r1 = r1.A04(r13)
            X.0sK r7 = r11.A03
            boolean r3 = r11.A0M
            java.util.Set r6 = r1.A0F(r7, r3)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x0518
            r6.retainAll(r9)
        L_0x0518:
            java.util.TreeMap r15 = new java.util.TreeMap
            r15.<init>()
            java.lang.String r1 = "E2eMessageEncryptor/getParticipantsData"
            X.1Zf r12 = new X.1Zf
            r12.<init>((java.lang.String) r1)
            goto L_0x0527
        L_0x0525:
            r1 = 0
            goto L_0x04f9
        L_0x0527:
            r12.A03()     // Catch:{ all -> 0x0ebf }
            X.0so r4 = r11.A02     // Catch:{ all -> 0x0ebf }
            int r1 = r6.size()     // Catch:{ all -> 0x0ebf }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0ebf }
            r2.<init>(r1)     // Catch:{ all -> 0x0ebf }
            X.C16030sJ.A0C(r4, r6, r2)     // Catch:{ all -> 0x0ebf }
            X.137 r1 = r11.A08     // Catch:{ all -> 0x0ebf }
            java.util.Map r14 = r1.A07(r2, r3)     // Catch:{ all -> 0x0ebf }
            java.util.Iterator r31 = r9.iterator()     // Catch:{ all -> 0x0ebf }
            r1 = r8
            r5 = r8
            r27 = r8
        L_0x0546:
            r4 = r8
            boolean r2 = r31.hasNext()     // Catch:{ all -> 0x0ebf }
            if (r2 == 0) goto L_0x05cc
            java.lang.Object r3 = r31.next()     // Catch:{ all -> 0x0ebf }
            com.whatsapp.jid.DeviceJid r3 = (com.whatsapp.jid.DeviceJid) r3     // Catch:{ all -> 0x0ebf }
            boolean r22 = r6.contains(r3)     // Catch:{ all -> 0x0ebf }
            if (r32 == 0) goto L_0x0561
            boolean r2 = r7.A0J(r3)     // Catch:{ all -> 0x0ebf }
            r21 = 1
            if (r2 != 0) goto L_0x0563
        L_0x0561:
            r21 = 0
        L_0x0563:
            if (r22 == 0) goto L_0x05b2
            if (r1 != 0) goto L_0x0589
            boolean r1 = r11.A0N     // Catch:{ all -> 0x0ebf }
            if (r1 == 0) goto L_0x0570
            X.1n0 r1 = r11.A04()     // Catch:{ all -> 0x0ebf }
            goto L_0x0589
        L_0x0570:
            X.16P r1 = r11.A06     // Catch:{ all -> 0x0ebf }
            r22 = r1
            r1 = 13
            com.facebook.redex.IDxCallableShape148S0100000_2_I0 r2 = new com.facebook.redex.IDxCallableShape148S0100000_2_I0     // Catch:{ all -> 0x0ebf }
            r2.<init>(r11, r1)     // Catch:{ all -> 0x0ebf }
            r1 = r22
            java.util.concurrent.ThreadPoolExecutor r1 = r1.A00     // Catch:{ all -> 0x0ebf }
            java.util.concurrent.Future r1 = r1.submit(r2)     // Catch:{ all -> 0x0ebf }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0ebf }
            X.1n0 r1 = (X.C36101n0) r1     // Catch:{ all -> 0x0ebf }
        L_0x0589:
            if (r21 == 0) goto L_0x05a2
            if (r5 != 0) goto L_0x0591
            java.lang.String r5 = r11.A06(r9)     // Catch:{ all -> 0x0ebf }
        L_0x0591:
            if (r8 != 0) goto L_0x05c4
            com.whatsapp.jid.UserJid r2 = r3.getUserJid()     // Catch:{ all -> 0x0ebf }
            java.lang.Object r2 = r14.get(r2)     // Catch:{ all -> 0x0ebf }
            X.27R r2 = (X.AnonymousClass27R) r2     // Catch:{ all -> 0x0ebf }
            X.1iD r4 = r11.A05(r1, r2, r5)     // Catch:{ all -> 0x0ebf }
            goto L_0x05c4
        L_0x05a2:
            com.whatsapp.jid.UserJid r2 = r3.getUserJid()     // Catch:{ all -> 0x0ebf }
            java.lang.Object r2 = r14.get(r2)     // Catch:{ all -> 0x0ebf }
            X.27R r2 = (X.AnonymousClass27R) r2     // Catch:{ all -> 0x0ebf }
            r4 = 0
            X.1iD r4 = r11.A05(r1, r2, r4)     // Catch:{ all -> 0x0ebf }
            goto L_0x05c5
        L_0x05b2:
            if (r21 == 0) goto L_0x0546
            if (r5 != 0) goto L_0x05ba
            java.lang.String r5 = r11.A06(r9)     // Catch:{ all -> 0x0ebf }
        L_0x05ba:
            if (r27 != 0) goto L_0x05c1
            r2 = 0
            X.1iD r27 = X.AnonymousClass3B8.A01(r2, r2, r5)     // Catch:{ all -> 0x0ebf }
        L_0x05c1:
            r4 = r27
            goto L_0x05c5
        L_0x05c4:
            r8 = r4
        L_0x05c5:
            if (r4 == 0) goto L_0x0546
            r15.put(r3, r4)     // Catch:{ all -> 0x0ebf }
            goto L_0x0546
        L_0x05cc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ebf }
            r2.<init>()     // Catch:{ all -> 0x0ebf }
            java.lang.String r1 = "e2e messages created: "
            r2.append(r1)     // Catch:{ all -> 0x0ebf }
            int r1 = r15.size()     // Catch:{ all -> 0x0ebf }
            r2.append(r1)     // Catch:{ all -> 0x0ebf }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0ebf }
            r12.A02(r1)     // Catch:{ all -> 0x0ebf }
            boolean r1 = r15.isEmpty()     // Catch:{ all -> 0x0ebf }
            if (r1 != 0) goto L_0x05f9
            java.util.Map r2 = r11.A08(r15)     // Catch:{ all -> 0x0ebf }
        L_0x05ee:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0ebf }
            r3.<init>()     // Catch:{ all -> 0x0ebf }
            java.lang.String r1 = "messages encrypted: "
            r3.append(r1)     // Catch:{ all -> 0x0ebf }
            goto L_0x05fb
        L_0x05f9:
            r2 = 0
            goto L_0x05ee
        L_0x05fb:
            if (r2 == 0) goto L_0x05fe
            goto L_0x0600
        L_0x05fe:
            r1 = 0
            goto L_0x0604
        L_0x0600:
            int r1 = r2.size()     // Catch:{ all -> 0x0ebf }
        L_0x0604:
            r3.append(r1)     // Catch:{ all -> 0x0ebf }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0ebf }
            r12.A02(r1)     // Catch:{ all -> 0x0ebf }
            r12.A01()
            boolean r1 = X.C16030sJ.A0G(r13)
            if (r1 == 0) goto L_0x0646
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            java.util.Iterator r5 = r9.iterator()
        L_0x0620:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x0648
            java.lang.Object r3 = r5.next()
            com.whatsapp.jid.DeviceJid r3 = (com.whatsapp.jid.DeviceJid) r3
            if (r2 == 0) goto L_0x0634
            boolean r4 = r2.containsKey(r3)
            if (r4 != 0) goto L_0x0620
        L_0x0634:
            com.whatsapp.jid.UserJid r3 = r3.getUserJid()
            boolean r4 = r7.A0I(r3)
            if (r4 != 0) goto L_0x0620
            com.whatsapp.jid.DeviceJid r3 = r3.getPrimaryDevice()
            r1.add(r3)
            goto L_0x0620
        L_0x0646:
            r4 = 0
            goto L_0x064d
        L_0x0648:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
        L_0x064d:
            X.4Kn r3 = new X.4Kn
            r3.<init>(r4, r10, r2)
            goto L_0x0311
        L_0x0654:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1 = 0
            X.4Kn r3 = new X.4Kn
            r3.<init>(r1, r2, r1)
            goto L_0x0311
        L_0x0661:
            java.lang.String r2 = r1.A0A()
            goto L_0x02ff
        L_0x0667:
            X.0us r1 = r1.A07
            X.1cE r1 = r1.A04(r3)
            java.lang.String r2 = r1.A0B()
            goto L_0x02ff
        L_0x0673:
            r82 = 0
            goto L_0x030b
        L_0x0677:
            boolean r1 = r0.multiDeviceFanOut
            if (r1 == 0) goto L_0x06c2
            r1 = r26
            boolean r1 = r1 instanceof X.C16060sN
            if (r1 != 0) goto L_0x06c2
            X.0sK r2 = r0.A08
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r20)
            if (r1 == 0) goto L_0x06b5
            com.whatsapp.jid.UserJid r1 = r1.getUserJid()
            boolean r1 = r2.A0I(r1)
            if (r1 == 0) goto L_0x06b5
            r1 = r29
            java.util.Map r19 = r11.A07(r1)
            boolean r1 = r19.isEmpty()
            if (r1 == 0) goto L_0x02b6
            X.0sK r1 = r0.A08
            r1.A0B()
            X.1Za r1 = r1.A04
            X.AnonymousClass00B.A06(r1)
            X.4So r0 = r0.A0S
            int r0 = r0.A00(r1)
            com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException r3 = new com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException
            r3.<init>(r1, r0)
            throw r3
        L_0x06b5:
            int r1 = r29.size()
            r3 = 1
            if (r1 > r3) goto L_0x06c8
            boolean r1 = r0.A07()
            if (r1 != 0) goto L_0x06c8
        L_0x06c2:
            java.util.Map r19 = java.util.Collections.emptyMap()
            goto L_0x02b6
        L_0x06c8:
            r1 = r29
            java.util.Map r19 = r11.A07(r1)
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r20)
            X.AnonymousClass00B.A06(r2)
            boolean r1 = r0.A07()
            if (r1 != 0) goto L_0x02b6
            int r1 = r29.size()
            if (r1 <= r3) goto L_0x02b6
            r1 = r19
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L_0x02b6
            X.4So r0 = r0.A0S
            int r0 = r0.A00(r2)
            com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException r3 = new com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException
            r3.<init>(r2, r0)
            throw r3
        L_0x06f5:
            r1 = 0
            goto L_0x0223
        L_0x06f8:
            int r4 = r0.messageType
            goto L_0x01f5
        L_0x06fc:
            r15 = 0
        L_0x06fd:
            java.lang.Integer r1 = r0.liveLocationDuration
            r44 = 0
            if (r1 == 0) goto L_0x0727
            X.0t6 r1 = r0.A0F
            X.0th r1 = r1.A0K
            r2 = r23
            X.0tZ r6 = r1.A03(r2)
            X.1rV r6 = (X.C38841rV) r6
            if (r6 == 0) goto L_0x0727
            X.0t3 r1 = r0.A0C
            long r1 = r1.A00()
            long r4 = r6.A0I
            int r6 = r6.A00
            long r1 = r1 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r4
            int r4 = (int) r1
            int r6 = r6 - r4
            if (r6 <= 0) goto L_0x0727
            java.lang.Integer r44 = java.lang.Integer.valueOf(r6)
        L_0x0727:
            int r1 = r0.retryCount
            if (r1 != 0) goto L_0x0c36
            X.1iD r1 = r0.A0b
            int r4 = r1.A00
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r4 & r2
            if (r1 == r2) goto L_0x074b
            r1 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r1
            if (r4 == r1) goto L_0x074b
            X.0tZ r2 = r0.A0c
            if (r2 == 0) goto L_0x0c36
            int r1 = r2.A04
            if (r1 <= 0) goto L_0x0c36
            java.lang.String r1 = r2.A0n
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0c36
        L_0x074b:
            X.0wS r1 = r0.A0a
            r1.A06()
            X.16r r4 = r1.A08
            r2 = 0
            r1 = r33
            X.1Vt r32 = r4.A0M(r1, r2)
        L_0x0759:
            boolean r1 = X.C16030sJ.A0L(r20)
            if (r1 == 0) goto L_0x0c32
            X.0tZ r1 = r0.A0c
            if (r1 == 0) goto L_0x0c32
            int r1 = r1.A04
            java.lang.Integer r45 = java.lang.Integer.valueOf(r1)
        L_0x0769:
            X.0uP r2 = r0.A0B
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r26)
            X.1Vq r1 = r2.A00(r1)
            if (r1 == 0) goto L_0x0c2e
            boolean r2 = r1.A01()
            if (r2 == 0) goto L_0x0c2e
            int r6 = r1.A01
            if (r6 <= 0) goto L_0x0c2e
            int r5 = r1.A00
            if (r5 <= 0) goto L_0x0c2e
            long r1 = r1.A04
            r7 = 0
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0c2e
            X.1ta r21 = new X.1ta
            r4 = r21
            r4.<init>((int) r6, (long) r1, (int) r5)
        L_0x0792:
            X.0tZ r2 = r0.A0c
            if (r2 == 0) goto L_0x0c24
            boolean r1 = r2 instanceof X.C38541qx
            if (r1 != 0) goto L_0x0c24
            boolean r1 = r2 instanceof X.C39131ry
            if (r1 != 0) goto L_0x0c24
            X.0t6 r1 = r0.A0F
            int r65 = r1.A07(r2)
            X.0t6 r7 = r0.A0F
            X.0tZ r6 = r0.A0c
            int r5 = r65 + 1
            r6.A1H = r5
            X.126 r4 = r7.A0H
            r2 = 21
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0
            r1.<init>((java.lang.Object) r7, (int) r5, (java.lang.Object) r6, (int) r2)
            r2 = 24
            r4.A01(r1, r2)
        L_0x07ba:
            X.0tZ r1 = r0.A0c
            if (r1 == 0) goto L_0x0c20
            int r1 = r1.A0A
            r27 = r1
            X.0t3 r1 = r0.A0C
            long r94 = android.os.SystemClock.uptimeMillis()
            long r96 = r1.A00()
            long r1 = r0.A03
            r5 = 0
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0811
            X.0w1 r14 = r0.A09
            X.0tZ r13 = r0.A0c
            r64 = 8
            int r12 = r0.retryCount
            boolean r11 = r0.A0l
            boolean r10 = r0.A0j
            int r9 = r0.A01
            boolean r8 = r0.A0i
            boolean r81 = r0.A08()
            r69 = 0
            long r4 = r0.A03
            long r1 = r0.A04
            long r4 = r4 - r1
            long r1 = r0.A02
            long r6 = r0.messageSendStartTime
            long r1 = r1 - r6
            r70 = 0
            r76 = r4
            r61 = r14
            r62 = r13
            r63 = r29
            r66 = r12
            r67 = r9
            r71 = r27
            r72 = r4
            r74 = r1
            r78 = r11
            r79 = r10
            r80 = r8
            r61.A0J(r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r74, r76, r78, r79, r80, r81, r82)
        L_0x0811:
            X.0w1 r11 = r0.A09
            X.0tZ r10 = r0.A0c
            r4 = 7
            int r9 = r0.retryCount
            boolean r8 = r0.A0l
            boolean r7 = r0.A0j
            int r6 = r0.A01
            boolean r5 = r0.A0i
            boolean r103 = r0.A08()
            r91 = 0
            long r94 = r94 - r16
            long r1 = r0.messageSendStartTime
            long r96 = r96 - r1
            long r98 = android.os.SystemClock.uptimeMillis()
            long r98 = r98 - r16
            r86 = 7
            r92 = 0
            r83 = r11
            r84 = r10
            r85 = r29
            r88 = r9
            r89 = r6
            r93 = r27
            r100 = r8
            r101 = r7
            r102 = r5
            r87 = r65
            r90 = r68
            r104 = r82
            r83.A0J(r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r96, r98, r100, r101, r102, r103, r104)
            X.0w1 r5 = r0.A09
            java.lang.String r1 = r0.id
            int r2 = r1.hashCode()
            boolean r1 = r5.A0M
            if (r1 == 0) goto L_0x0868
            X.18E r1 = r5.A0E
            boolean r5 = r1.A07(r2)
            if (r5 == 0) goto L_0x0868
            r1.A02(r2, r4)
        L_0x0868:
            boolean r1 = r0.A0l
            if (r1 == 0) goto L_0x0877
            X.17h r1 = r0.A0Y
            X.0tZ r2 = r0.A0c
            X.1Vw r2 = r2.A11
            java.util.Set r1 = r1.A02
            r1.add(r2)
        L_0x0877:
            X.0tZ r1 = r0.A0c
            r7 = 6
            r17 = 0
            r4 = r0
            r5 = r1
            r6 = r29
            r8 = r65
            r9 = r27
            r10 = r68
            r11 = r82
            r4.A06(r5, r6, r7, r8, r9, r10, r11)
            X.0tZ r2 = r0.A0c
            boolean r1 = r2 instanceof X.C39071rs
            if (r1 == 0) goto L_0x0c1c
            X.1rs r2 = (X.C39071rs) r2
            java.util.List r53 = r2.AGD()
        L_0x0897:
            X.3B8 r2 = r0.A0T
            X.0pd r4 = r0.A0Q
            X.1iD r1 = r0.A0b
            X.1iD r6 = X.C41061vA.A03(r4, r1)
            int r4 = r6.A00
            r5 = 4
            r1 = r4 & 4
            if (r1 != r5) goto L_0x0af9
            java.lang.String r48 = "image"
        L_0x08aa:
            X.1iD r5 = r0.A0b
            boolean r8 = X.C41061vA.A0G(r5)
            int r4 = r5.A00
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r4 & r2
            if (r1 == r2) goto L_0x08bf
            r1 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r1
            r7 = 0
            if (r4 != r1) goto L_0x08c0
        L_0x08bf:
            r7 = 1
        L_0x08c0:
            int r4 = r5.A01
            r2 = 64
            r1 = r4 & 64
            if (r1 == r2) goto L_0x08d5
            r6 = 32768(0x8000, float:4.5918E-41)
            r1 = r4 & r6
            if (r1 == r6) goto L_0x08d5
            r1 = 128(0x80, float:1.794E-43)
            r4 = r4 & r1
            r6 = 0
            if (r4 != r1) goto L_0x08d6
        L_0x08d5:
            r6 = 1
        L_0x08d6:
            boolean r1 = r5.A0c()
            if (r1 == 0) goto L_0x08e9
            X.24l r1 = r5.A0C
            if (r1 != 0) goto L_0x08e2
            X.24l r1 = X.C445324l.A0L
        L_0x08e2:
            int r1 = r1.A00
            r1 = r1 & 64
            r4 = 1
            if (r1 != r2) goto L_0x08ea
        L_0x08e9:
            r4 = 0
        L_0x08ea:
            int r2 = r0.originationFlags
            int r1 = r0.retryCount
            if (r7 == 0) goto L_0x08f2
            if (r1 > 0) goto L_0x0af5
        L_0x08f2:
            if (r32 != 0) goto L_0x0af5
            r1 = r2 & 8192(0x2000, float:1.14794E-41)
            if (r1 != 0) goto L_0x0af5
            if (r8 == 0) goto L_0x0ade
            java.lang.String r47 = "reaction"
        L_0x08fc:
            X.0tZ r2 = r0.A0c
            boolean r1 = r2 instanceof X.C16840tj
            if (r1 == 0) goto L_0x0930
            X.0tj r2 = (X.C16840tj) r2
            X.1xE r2 = X.C42091xD.A01(r2)
            if (r2 == 0) goto L_0x0930
            boolean r1 = r2 instanceof X.AnonymousClass33v
            if (r1 == 0) goto L_0x0a39
            r1 = 1
            X.1lL[] r2 = new X.C35081lL[r1]
            java.lang.String r5 = "type"
            java.lang.String r4 = "product_list"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r5, (java.lang.String) r4)
            r4 = 0
            r2[r4] = r1
            java.lang.String r1 = "list"
            X.1Vv r5 = new X.1Vv
            r5.<init>(r1, r2)
            java.lang.String r4 = "biz"
            X.1Vv r2 = new X.1Vv
            r1 = r17
            r2.<init>((X.C28371Vv) r5, (java.lang.String) r4, (X.C35081lL[]) r1)
        L_0x092e:
            r17 = r2
        L_0x0930:
            X.0ug r10 = r0.A0Z
            long r13 = r0.originalTimestamp
            int r1 = r0.retryCount
            r57 = r1
            java.lang.String r1 = r0.groupParticipantHashToSend
            r46 = r1
            r9 = 0
            X.2EC r1 = r0.webAttribute
            r39 = r1
            java.util.Map r1 = r3.A01
            r54 = r1
            java.util.List r1 = r3.A00
            r52 = r1
            int r12 = r0.originationFlags
            int r11 = r0.editVersion
            boolean r62 = r0.A07()
            X.0tZ r2 = r0.A0c
            boolean r1 = r2 instanceof X.C39201s5
            if (r1 != 0) goto L_0x0a35
            boolean r1 = r2 instanceof X.C39101rv
            if (r1 != 0) goto L_0x0a35
            boolean r1 = r2 instanceof X.C39181s3
            if (r1 != 0) goto L_0x0a35
            boolean r1 = r2 instanceof X.C39191s4
            if (r1 != 0) goto L_0x0a35
            boolean r1 = r2 instanceof X.C39121rx
            if (r1 != 0) goto L_0x0a35
            r63 = 0
        L_0x0969:
            boolean r1 = r2 instanceof X.C39041rp
            if (r1 == 0) goto L_0x0a32
            r1 = r2
            X.1rp r1 = (X.C39041rp) r1
            X.1xH r1 = X.C42121xG.A00(r1)
            boolean r4 = r1 instanceof X.AnonymousClass33w
            if (r4 == 0) goto L_0x0a32
            X.3Gm r1 = (X.C63193Gm) r1
            X.1lN r1 = r1.A00
            X.1lM r1 = r1.A00
            if (r1 == 0) goto L_0x0a32
            java.lang.String r8 = r1.A00
        L_0x0982:
            boolean r1 = X.C30921dB.A04(r2)
            if (r1 == 0) goto L_0x0a30
            X.1Vw r1 = r2.A11
            X.0rv r1 = r1.A00
            boolean r1 = r1 instanceof com.whatsapp.jid.UserJid
            if (r1 == 0) goto L_0x0a30
            X.0pd r5 = r0.A0Q
            X.0tM r4 = X.C16620tM.A01
            r1 = 2200(0x898, float:3.083E-42)
            boolean r1 = r5.A0E(r4, r1)
            if (r1 == 0) goto L_0x0a30
            X.2Pd r1 = r0.A0U
            java.util.Collection r4 = r1.A00()
            X.0so r1 = r0.A06
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.C16030sJ.A0C(r1, r4, r7)
            X.1Gj r6 = r0.A0X
            X.1cc r2 = (X.C30581cc) r2
            X.0sK r1 = r6.A00
            r1.A0B()
            X.1ZT r1 = r1.A05
            if (r1 != 0) goto L_0x0a2b
            r5 = 0
        L_0x09ba:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r16 = r7.iterator()
        L_0x09c3:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x09d6
            java.lang.Object r1 = r16.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            byte[] r7 = r6.A02(r1, r2)
            if (r7 != 0) goto L_0x0a27
            r4 = 0
        L_0x09d6:
            if (r5 == 0) goto L_0x0a30
            if (r4 == 0) goto L_0x0a30
            X.2cR r2 = new X.2cR
            r2.<init>(r4, r5)
        L_0x09df:
            X.0tZ r1 = r0.A0c
            boolean r4 = r1 instanceof X.C38641rB
            if (r4 == 0) goto L_0x0a24
            X.1rB r1 = (X.C38641rB) r1
            boolean r64 = r1.A1B()
        L_0x09eb:
            r4 = 1
            r1 = 0
            X.2cQ r5 = new X.2cQ
            r50 = r9
            r31 = r5
            r33 = r25
            r34 = r26
            r36 = r24
            r37 = r2
            r38 = r15
            r40 = r23
            r41 = r21
            r42 = r17
            r43 = r28
            r49 = r9
            r51 = r8
            r55 = r22
            r56 = r19
            r58 = r12
            r59 = r11
            r60 = r13
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r62, r63, r64)
            r2 = 8
            android.os.Message r1 = android.os.Message.obtain(r9, r1, r2, r1, r5)
            r2 = r28
            java.util.concurrent.Future r1 = r10.A04(r1, r2)
            goto L_0x0c3a
        L_0x0a24:
            r64 = 0
            goto L_0x09eb
        L_0x0a27:
            r4.put(r1, r7)
            goto L_0x09c3
        L_0x0a2b:
            byte[] r5 = r6.A02(r1, r2)
            goto L_0x09ba
        L_0x0a30:
            r2 = 0
            goto L_0x09df
        L_0x0a32:
            r8 = 0
            goto L_0x0982
        L_0x0a35:
            r63 = 1
            goto L_0x0969
        L_0x0a39:
            boolean r1 = r2 instanceof X.C42161xK
            if (r1 == 0) goto L_0x0a64
            X.0tn r7 = r2.A00
            r2 = 1
            java.lang.String r1 = "biz"
            r5 = 0
            java.lang.String r6 = r7.A00()
            java.lang.String r4 = "review_order"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x0a7a
            X.1lL[] r4 = new X.C35081lL[r2]
            java.lang.String r7 = "native_flow_name"
            java.lang.String r6 = "order_status"
            X.1lL r2 = new X.1lL
            r2.<init>((java.lang.String) r7, (java.lang.String) r6)
            r4[r5] = r2
        L_0x0a5d:
            X.1Vv r2 = new X.1Vv
            r2.<init>(r1, r4)
            goto L_0x092e
        L_0x0a64:
            boolean r1 = r2 instanceof X.C42461xp
            if (r1 == 0) goto L_0x0adb
            r1 = 1
            X.1lL[] r4 = new X.C35081lL[r1]
            java.lang.String r5 = "native_flow_name"
            java.lang.String r2 = "order_details"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r5, (java.lang.String) r2)
            r2 = 0
            r4[r2] = r1
            java.lang.String r1 = "biz"
            goto L_0x0a5d
        L_0x0a7a:
            X.221 r4 = X.AnonymousClass221.A03
            int r10 = r4.A01
            X.1lW r4 = r7.A03
            if (r4 == 0) goto L_0x0ad8
            java.util.List r4 = r4.A00
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x0ad8
            java.lang.Object r4 = r4.get(r5)
            X.1lV r4 = (X.C35181lV) r4
            X.1lK r4 = r4.A01
            java.lang.String r7 = r4.A00
        L_0x0a94:
            X.1gQ r8 = new X.1gQ
            r8.<init>((java.lang.String) r1)
            java.lang.String r1 = "interactive"
            X.1gQ r4 = new X.1gQ
            r4.<init>((java.lang.String) r1)
            java.lang.String r9 = "type"
            java.lang.String r6 = "native_flow"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r9, (java.lang.String) r6)
            r4.A02(r1)
            java.lang.String r9 = "v"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r9, (int) r10)
            r4.A02(r1)
            X.1lL[] r2 = new X.C35081lL[r2]
            java.lang.String r9 = "name"
            X.1lL r1 = new X.1lL
            r1.<init>((java.lang.String) r9, (java.lang.String) r7)
            r2[r5] = r1
            X.1Vv r1 = new X.1Vv
            r1.<init>(r6, r2)
            r4.A03(r1)
            X.1Vv r1 = r4.A01()
            r8.A03(r1)
            X.1Vv r2 = r8.A01()
            goto L_0x092e
        L_0x0ad8:
            java.lang.String r7 = ""
            goto L_0x0a94
        L_0x0adb:
            r2 = 0
            goto L_0x092e
        L_0x0ade:
            if (r6 == 0) goto L_0x0ae4
            java.lang.String r47 = "poll"
            goto L_0x08fc
        L_0x0ae4:
            if (r4 == 0) goto L_0x0aea
            java.lang.String r47 = "medianotify"
            goto L_0x08fc
        L_0x0aea:
            if (r48 == 0) goto L_0x0af0
            java.lang.String r47 = "media"
            goto L_0x08fc
        L_0x0af0:
            java.lang.String r47 = "text"
            goto L_0x08fc
        L_0x0af5:
            java.lang.String r47 = "pay"
            goto L_0x08fc
        L_0x0af9:
            r5 = 8
            r1 = r4 & 8
            if (r1 != r5) goto L_0x0b04
            java.lang.String r48 = "vcard"
            goto L_0x08aa
        L_0x0b04:
            r5 = 4096(0x1000, float:5.74E-42)
            r1 = r4 & r5
            if (r1 != r5) goto L_0x0b0e
            java.lang.String r48 = "contact_array"
            goto L_0x08aa
        L_0x0b0e:
            r5 = 16
            r1 = r4 & 16
            if (r1 != r5) goto L_0x0b18
            java.lang.String r48 = "location"
            goto L_0x08aa
        L_0x0b18:
            r5 = 65536(0x10000, float:9.18355E-41)
            r1 = r4 & r5
            if (r1 != r5) goto L_0x0b22
            java.lang.String r48 = "livelocation"
            goto L_0x08aa
        L_0x0b22:
            r5 = 32
            r1 = r4 & 32
            if (r1 != r5) goto L_0x0b6a
            X.2ep r1 = r6.A0E
            r5 = r1
            if (r1 != 0) goto L_0x0b2f
            X.2ep r1 = X.C53012ep.A0P
        L_0x0b2f:
            int r1 = r1.A01
            r4 = 2
            r1 = r1 & 2
            if (r1 != r4) goto L_0x0c18
            if (r5 != 0) goto L_0x0b3a
            X.2ep r5 = X.C53012ep.A0P
        L_0x0b3a:
            java.lang.String r1 = r5.A0K
            X.0w2 r4 = r2.A03
            java.lang.String r2 = X.C30931dC.A01(r1)
            boolean r2 = r4.A0D(r2)
            if (r2 == 0) goto L_0x0b4c
            java.lang.String r48 = "cataloglink"
            goto L_0x08aa
        L_0x0b4c:
            java.lang.String r2 = X.C30931dC.A01(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x0b65
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1 = 5
            int r2 = r4.A08(r2)
            if (r1 != r2) goto L_0x0b65
            java.lang.String r48 = "productlink"
            goto L_0x08aa
        L_0x0b65:
            java.lang.String r48 = "url"
            goto L_0x08aa
        L_0x0b6a:
            boolean r1 = r6.A0c()
            if (r1 == 0) goto L_0x0b74
            java.lang.String r48 = "document"
            goto L_0x08aa
        L_0x0b74:
            r2 = 128(0x80, float:1.794E-43)
            r1 = r4 & r2
            if (r1 != r2) goto L_0x0b8c
            X.24m r1 = r6.A02
            if (r1 != 0) goto L_0x0b80
            X.24m r1 = X.C445424m.A0F
        L_0x0b80:
            boolean r1 = r1.A0E
            if (r1 == 0) goto L_0x0b88
            java.lang.String r48 = "ptt"
            goto L_0x08aa
        L_0x0b88:
            java.lang.String r48 = "audio"
            goto L_0x08aa
        L_0x0b8c:
            r2 = 256(0x100, float:3.59E-43)
            r1 = r4 & r2
            if (r1 != r2) goto L_0x0ba5
            X.24n r1 = r6.A0l
            if (r1 != 0) goto L_0x0b98
            X.24n r1 = X.C445524n.A0O
        L_0x0b98:
            boolean r1 = r1.A0M
            if (r1 == 0) goto L_0x0ba0
            java.lang.String r48 = "gif"
            goto L_0x08aa
        L_0x0ba0:
            java.lang.String r48 = "video"
            goto L_0x08aa
        L_0x0ba5:
            r2 = 2048(0x800, float:2.87E-42)
            r1 = r4 & r2
            if (r1 == r2) goto L_0x0c18
            r2 = 2097152(0x200000, float:2.938736E-39)
            r1 = r4 & r2
            if (r1 != r2) goto L_0x0bb6
            java.lang.String r48 = "sticker"
            goto L_0x08aa
        L_0x0bb6:
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r4 & r2
            if (r1 != r2) goto L_0x0bdd
            X.2uE r1 = r6.A0a
            r4 = r1
            if (r1 != 0) goto L_0x0bc3
            X.2uE r1 = X.AnonymousClass2uE.A07
        L_0x0bc3:
            int r1 = r1.A00
            r2 = 1
            r1 = r1 & 1
            if (r1 != r2) goto L_0x0bce
            java.lang.String r48 = "product"
            goto L_0x08aa
        L_0x0bce:
            if (r4 != 0) goto L_0x0bd2
            X.2uE r4 = X.AnonymousClass2uE.A07
        L_0x0bd2:
            int r1 = r4.A00
            r2 = 4
            r1 = r1 & 4
            if (r1 != r2) goto L_0x0c18
            java.lang.String r48 = "catalog"
            goto L_0x08aa
        L_0x0bdd:
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r4 & r2
            if (r1 != r2) goto L_0x0be7
            java.lang.String r48 = "order"
            goto L_0x08aa
        L_0x0be7:
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r4 & r2
            if (r1 != r2) goto L_0x0bf1
            java.lang.String r48 = "list"
            goto L_0x08aa
        L_0x0bf1:
            r1 = 1073741824(0x40000000, float:2.0)
            r4 = r4 & r1
            if (r4 != r1) goto L_0x0bfa
            java.lang.String r48 = "list_response"
            goto L_0x08aa
        L_0x0bfa:
            int r4 = r6.A01
            r2 = 2
            r1 = r4 & 2
            if (r1 != r2) goto L_0x0c05
            java.lang.String r48 = "buttons_response"
            goto L_0x08aa
        L_0x0c05:
            r1 = r4 & 32
            if (r1 != r5) goto L_0x0c18
            X.2u4 r1 = r6.A0P
            if (r1 != 0) goto L_0x0c0f
            X.2u4 r1 = X.C58762u4.A05
        L_0x0c0f:
            int r2 = r1.A01
            r1 = 2
            if (r2 != r1) goto L_0x0c18
            java.lang.String r48 = "native_flow_response"
            goto L_0x08aa
        L_0x0c18:
            r48 = r17
            goto L_0x08aa
        L_0x0c1c:
            r53 = r17
            goto L_0x0897
        L_0x0c20:
            r27 = 0
            goto L_0x0877
        L_0x0c24:
            java.lang.String r1 = "sende2emessagejob/onRun/FMessage is null and cannot save to count store."
            com.whatsapp.util.Log.e((java.lang.String) r1)
            r65 = 0
            goto L_0x07ba
        L_0x0c2e:
            r21 = 0
            goto L_0x0792
        L_0x0c32:
            r45 = 0
            goto L_0x0769
        L_0x0c36:
            r32 = 0
            goto L_0x0759
        L_0x0c3a:
            r1.get()     // Catch:{ Exception -> 0x0e92 }
            X.0tZ r1 = r0.A0c
            r8 = 3
            r5 = r0
            r6 = r1
            r7 = r29
            r9 = r65
            r10 = r27
            r11 = r68
            r12 = r82
            r5.A06(r6, r7, r8, r9, r10, r11, r12)
            boolean r1 = r0.A08()
            if (r1 == 0) goto L_0x0c84
            X.0w1 r5 = r0.A09
            X.0tZ r3 = r0.A0c
            java.util.HashSet r1 = r0.targetDeviceRawJids
            int r36 = r1.size()
            X.0t3 r1 = r0.A0C
            long r39 = r1.A00()
            long r1 = r0.messageSendStartTime
            long r39 = r39 - r1
            boolean r1 = r0.A0l
            r33 = 1
            r34 = 1
            r37 = 0
            r38 = 0
            r41 = 0
            r42 = 0
            r43 = 1
            r31 = r5
            r32 = r3
            r35 = r10
            r44 = r1
            r31.A0I(r32, r33, r34, r35, r36, r37, r38, r39, r41, r42, r43, r44)
        L_0x0c84:
            if (r82 == 0) goto L_0x0c8a
            boolean r1 = r0.forceSenderKeyDistribution
            if (r1 == 0) goto L_0x0dfb
        L_0x0c8a:
            if (r18 == 0) goto L_0x0dfb
            if (r22 == 0) goto L_0x0dfb
            boolean r1 = r22.isEmpty()
            if (r1 != 0) goto L_0x0dfb
            java.util.Set r2 = r22.keySet()
            r2.retainAll(r7)
            r1 = r20
            X.0sN r1 = (X.C16060sN) r1
            r20 = r1
            boolean r3 = r0.useLidForEncryption
            X.0sK r1 = r0.A08
            if (r3 == 0) goto L_0x0cd2
            X.1ZY r1 = r1.A02()
        L_0x0cab:
            X.AnonymousClass00B.A06(r1)
            X.11s r6 = r0.A0D
            java.lang.String r5 = r20.getRawString()
            X.1Yb r1 = X.C28851Ya.A02(r1)
            X.1dH r3 = new X.1dH
            r3.<init>(r1, r5)
            X.1fD r1 = r6.A0A
            X.1fE r1 = r1.A01(r3)
            if (r1 == 0) goto L_0x0df5
            boolean r5 = r0.useLidForEncryption
            X.0sO r3 = r0.A0G
            X.0tq r1 = r3.A06
            X.0tf r10 = r1.A02()
            if (r5 == 0) goto L_0x0d60
            goto L_0x0cd8
        L_0x0cd2:
            r1.A0B()
            X.1Za r1 = r1.A04
            goto L_0x0cab
        L_0x0cd8:
            X.1cj r9 = r10.A00()     // Catch:{ all -> 0x0e8d }
            X.0us r6 = r3.A07     // Catch:{ all -> 0x0e88 }
            java.lang.String r3 = "participant-user-store/markParticipantsAsHavingAddOnSenderKey/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e88 }
            r1.<init>(r3)     // Catch:{ all -> 0x0e88 }
            r1.append(r2)     // Catch:{ all -> 0x0e88 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0e88 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0e88 }
            X.0tq r1 = r6.A09     // Catch:{ all -> 0x0e88 }
            X.0tf r8 = r1.A02()     // Catch:{ all -> 0x0e88 }
            X.1cj r7 = r8.A00()     // Catch:{ all -> 0x0e83 }
            X.193 r5 = r6.A0A     // Catch:{ all -> 0x0e7e }
            java.lang.String r1 = "participant-device-store/markDevicesAsHavingAddOnSenderKey: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e7e }
            r3.<init>(r1)     // Catch:{ all -> 0x0e7e }
            r1 = r20
            r3.append(r1)     // Catch:{ all -> 0x0e7e }
            java.lang.String r1 = " "
            r3.append(r1)     // Catch:{ all -> 0x0e7e }
            r3.append(r2)     // Catch:{ all -> 0x0e7e }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0e7e }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0e7e }
            java.lang.String r3 = "UPDATE group_participant_device SET sent_add_on_sender_key = ? WHERE device_jid_row_id = ? AND group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?)"
            r1 = r20
            r5.A03(r1, r3, r2)     // Catch:{ all -> 0x0e7e }
            X.1cE r1 = r6.A04(r1)     // Catch:{ all -> 0x0e7e }
            java.util.Map r1 = r1.A03     // Catch:{ all -> 0x0e7e }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0e7e }
            X.0uz r1 = X.C17380uz.copyOf((java.util.Collection) r1)     // Catch:{ all -> 0x0e7e }
            X.1Ub r6 = r1.iterator()     // Catch:{ all -> 0x0e7e }
        L_0x0d2f:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x0e7e }
            if (r1 == 0) goto L_0x0de2
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x0e7e }
            X.1ck r1 = (X.C30661ck) r1     // Catch:{ all -> 0x0e7e }
            java.util.concurrent.ConcurrentHashMap r1 = r1.A04     // Catch:{ all -> 0x0e7e }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0e7e }
            X.0uz r1 = X.C17380uz.copyOf((java.util.Collection) r1)     // Catch:{ all -> 0x0e7e }
            X.1Ub r5 = r1.iterator()     // Catch:{ all -> 0x0e7e }
        L_0x0d49:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x0e7e }
            if (r1 == 0) goto L_0x0d2f
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x0e7e }
            X.1sh r3 = (X.C39571sh) r3     // Catch:{ all -> 0x0e7e }
            com.whatsapp.jid.DeviceJid r1 = r3.A02     // Catch:{ all -> 0x0e7e }
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0e7e }
            if (r1 == 0) goto L_0x0d49
            r3.A00 = r4     // Catch:{ all -> 0x0e7e }
            goto L_0x0d49
        L_0x0d60:
            X.1cj r9 = r10.A00()     // Catch:{ all -> 0x0e8d }
            X.0us r6 = r3.A07     // Catch:{ all -> 0x0e88 }
            java.lang.String r3 = "participant-user-store/markParticipantsAsHavingSenderKey/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e88 }
            r1.<init>(r3)     // Catch:{ all -> 0x0e88 }
            r1.append(r2)     // Catch:{ all -> 0x0e88 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0e88 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0e88 }
            X.0tq r1 = r6.A09     // Catch:{ all -> 0x0e88 }
            X.0tf r8 = r1.A02()     // Catch:{ all -> 0x0e88 }
            X.1cj r7 = r8.A00()     // Catch:{ all -> 0x0e83 }
            X.193 r5 = r6.A0A     // Catch:{ all -> 0x0e7e }
            java.lang.String r1 = "participant-device-store/markDevicesAsHavingSenderKey: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0e7e }
            r3.<init>(r1)     // Catch:{ all -> 0x0e7e }
            r1 = r20
            r3.append(r1)     // Catch:{ all -> 0x0e7e }
            java.lang.String r1 = " "
            r3.append(r1)     // Catch:{ all -> 0x0e7e }
            r3.append(r2)     // Catch:{ all -> 0x0e7e }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0e7e }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0e7e }
            java.lang.String r3 = "UPDATE group_participant_device SET sent_sender_key = ? WHERE device_jid_row_id = ? AND group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?)"
            r1 = r20
            r5.A03(r1, r3, r2)     // Catch:{ all -> 0x0e7e }
            X.1cE r1 = r6.A04(r1)     // Catch:{ all -> 0x0e7e }
            X.0uz r1 = r1.A04()     // Catch:{ all -> 0x0e7e }
            X.1Ub r6 = r1.iterator()     // Catch:{ all -> 0x0e7e }
        L_0x0db1:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x0e7e }
            if (r1 == 0) goto L_0x0de2
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x0e7e }
            X.1ck r1 = (X.C30661ck) r1     // Catch:{ all -> 0x0e7e }
            java.util.concurrent.ConcurrentHashMap r1 = r1.A04     // Catch:{ all -> 0x0e7e }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0e7e }
            X.0uz r1 = X.C17380uz.copyOf((java.util.Collection) r1)     // Catch:{ all -> 0x0e7e }
            X.1Ub r5 = r1.iterator()     // Catch:{ all -> 0x0e7e }
        L_0x0dcb:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x0e7e }
            if (r1 == 0) goto L_0x0db1
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x0e7e }
            X.1sh r3 = (X.C39571sh) r3     // Catch:{ all -> 0x0e7e }
            com.whatsapp.jid.DeviceJid r1 = r3.A02     // Catch:{ all -> 0x0e7e }
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0e7e }
            if (r1 == 0) goto L_0x0dcb
            r3.A01 = r4     // Catch:{ all -> 0x0e7e }
            goto L_0x0dcb
        L_0x0de2:
            r7.A00()     // Catch:{ all -> 0x0e7e }
            r7.close()     // Catch:{ all -> 0x0e83 }
            r8.close()     // Catch:{ all -> 0x0e88 }
            r9.A00()     // Catch:{ all -> 0x0e88 }
            r9.close()     // Catch:{ all -> 0x0e8d }
            r10.close()
            goto L_0x0dfb
        L_0x0df5:
            java.lang.String r1 = "sende2emessagejob/onRun/senderKey doesn't exist after receiving the ack"
            com.whatsapp.util.Log.w((java.lang.String) r1)
        L_0x0dfb:
            java.util.concurrent.ConcurrentHashMap r5 = A0m
            java.lang.String r4 = r0.jid
            java.lang.String r3 = r0.id
            int r2 = r0.editVersion
            java.lang.String r1 = r0.participant
            X.2Q1 r0 = new X.2Q1
            r0.<init>(r4, r3, r1, r2)
            r5.remove(r0)
            java.lang.String r0 = "sende2emessagejob/e2e message send job finished"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            goto L_0x00f1
        L_0x0e17:
            boolean r1 = r9.A02
            if (r1 == 0) goto L_0x00d7
            r1 = r26
            boolean r1 = r1 instanceof X.AnonymousClass1ZX
            if (r1 == 0) goto L_0x00d7
            X.15H r1 = r0.A0M
            r2 = r26
            X.1ZX r2 = (X.AnonymousClass1ZX) r2
            java.lang.Boolean r1 = r1.A01(r2)
            if (r1 == 0) goto L_0x0e35
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0e35
            goto L_0x00d7
        L_0x0e35:
            X.0vJ r1 = r0.A0L
            X.1ZT r35 = r1.A01(r2)
            goto L_0x00d9
        L_0x0e3d:
            long r1 = r0.messageSendStartTime
            X.1s5 r3 = new X.1s5
            r3.<init>(r9, r1)
            goto L_0x00cd
        L_0x0e46:
            long r1 = r0.messageSendStartTime
            X.1rx r3 = new X.1rx
            r3.<init>(r9, r1)
            goto L_0x00cd
        L_0x0e4f:
            X.0t6 r1 = r0.A0F
            X.0th r2 = r1.A0K
            X.0tZ r3 = r2.A03(r9)
            goto L_0x00b6
        L_0x0e59:
            boolean r2 = r0.useLidForEncryption
            X.0sK r1 = r0.A08
            if (r2 == 0) goto L_0x0e78
            X.1ZY r1 = r1.A02()
        L_0x0e63:
            if (r18 == 0) goto L_0x0e67
            r34 = r1
        L_0x0e67:
            X.4So r1 = r0.A0S
            X.AnonymousClass00B.A06(r34)
            r0 = r34
            int r1 = r1.A00(r0)
            com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException r3 = new com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException
            r3.<init>(r0, r1)
            throw r3
        L_0x0e78:
            r1.A0B()
            X.1Za r1 = r1.A04
            goto L_0x0e63
        L_0x0e7e:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0e82 }
        L_0x0e82:
            throw r0     // Catch:{ all -> 0x0e83 }
        L_0x0e83:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0e87 }
        L_0x0e87:
            throw r0     // Catch:{ all -> 0x0e88 }
        L_0x0e88:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0e8c }
        L_0x0e8c:
            throw r0     // Catch:{ all -> 0x0e8d }
        L_0x0e8d:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0e91 }
        L_0x0e91:
            throw r0
        L_0x0e92:
            r5 = move-exception
            r0.A0l = r4
            X.0pd r4 = r0.A0Q
            r2 = 2472(0x9a8, float:3.464E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r1 = r4.A0E(r1, r2)
            if (r1 == 0) goto L_0x0ebe
            java.lang.String r1 = "sende2emessagejob/storing encrypted payload for:"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r1 = r30
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.4Ko r2 = new X.4Ko
            r1 = r19
            r2.<init>(r3, r15, r1)
            r0.A0V = r2
        L_0x0ebe:
            throw r5
        L_0x0ebf:
            r3 = move-exception
            r12.A01()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendE2EMessageJob.A01():void");
    }

    public boolean A03() {
        boolean z2 = false;
        if (this.A0C.A00() >= this.expireTimeMs) {
            z2 = true;
        }
        if (!z2) {
            for (Requirement requirement : this.parameters.requirements) {
                if ((this.A0V == null || (!(requirement instanceof AxolotlSessionRequirement) && !(requirement instanceof AxolotlDifferentAliceBaseKeyRequirement) && !(requirement instanceof AxolotlMultiDeviceSessionRequirement))) && !requirement.AJT()) {
                    if (!(requirement instanceof ChatConnectionRequirement)) {
                        return false;
                    }
                    this.A0l = true;
                    return false;
                } else if (!this.A0i && !this.A0k) {
                    if ((requirement instanceof AxolotlSessionRequirement) || (requirement instanceof AxolotlDifferentAliceBaseKeyRequirement) || (requirement instanceof AxolotlMultiDeviceSessionRequirement)) {
                        this.A0k = true;
                        C16440t3 r2 = this.A0C;
                        this.A03 = SystemClock.uptimeMillis();
                        this.A02 = r2.A00();
                    }
                }
            }
        }
        return true;
    }

    public final String A04() {
        String A042 = C16030sJ.A04(this.jid);
        String A043 = C16030sJ.A04(this.participant);
        StringBuilder sb = new StringBuilder("; id=");
        sb.append(this.id);
        sb.append("; jid=");
        sb.append(A042);
        sb.append("; participant=");
        sb.append(A043);
        sb.append("; retryCount=");
        sb.append(this.retryCount);
        sb.append("; targetDevices=");
        HashSet hashSet = this.targetDeviceRawJids;
        sb.append(hashSet == null ? "null" : C16030sJ.A05((String[]) hashSet.toArray(new String[0])));
        sb.append("; groupParticipantHash=");
        sb.append(this.groupParticipantHash);
        sb.append("; groupParticipantHashToSend=");
        sb.append(this.groupParticipantHashToSend);
        sb.append("; webAttribute=");
        sb.append(this.webAttribute);
        sb.append("; includeSenderKeysInMessage=");
        sb.append(this.includeSenderKeysInMessage);
        sb.append("; useOneOneEncryptionOnPHashMismatch=");
        sb.append(this.useOneOneEncryptionOnPHashMismatch);
        sb.append("; forceSenderKeyDistribution=");
        sb.append(this.forceSenderKeyDistribution);
        sb.append("; persistentId=");
        sb.append(this.A01);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r8 != null) goto L_0x0007;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(com.whatsapp.jid.DeviceJid r8, com.whatsapp.jid.Jid r9) {
        /*
            r7 = this;
            boolean r5 = r9 instanceof X.C16060sN
            if (r5 == 0) goto L_0x0007
            r2 = 1
            if (r8 == 0) goto L_0x0025
        L_0x0007:
            r2 = 0
            if (r8 == 0) goto L_0x0025
            r6 = 0
            if (r5 != 0) goto L_0x0026
            java.lang.String r0 = "participant cannot be set if the primary jid is not a group or broadcast list"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0025:
            r6 = 1
        L_0x0026:
            int r0 = r7.retryCount
            if (r0 < 0) goto L_0x0214
            java.lang.String r0 = r7.groupParticipantHash
            if (r0 == 0) goto L_0x0034
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01fc
        L_0x0034:
            java.lang.String r0 = r7.groupParticipantHashToSend
            if (r0 == 0) goto L_0x003e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01fc
        L_0x003e:
            java.lang.String r1 = r7.groupParticipantHashToSend
            if (r1 == 0) goto L_0x0076
            if (r5 == 0) goto L_0x005e
            if (r8 == 0) goto L_0x0076
            java.lang.String r0 = "groupParticipantHash cannot be set if participant is set"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x005e:
            java.lang.String r0 = "groupParticipantHash cannot be set if the primary jid is not a group or broadcast list"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0076:
            boolean r0 = r7.includeSenderKeysInMessage
            if (r0 == 0) goto L_0x0094
            if (r5 != 0) goto L_0x0094
            java.lang.String r0 = "includeSenderKeysInMessage cannot be set if the primary jid is not a group or broadcast list"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0094:
            if (r2 == 0) goto L_0x00ba
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r7.A07()
            if (r0 != 0) goto L_0x00ba
            java.lang.String r0 = "cannot send e2e message to a group without a participant hash"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00ba:
            long r3 = r7.expireTimeMs
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00da
            java.lang.String r0 = "expireTimeMs must be non-negative"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00da:
            if (r5 != 0) goto L_0x00fa
            com.whatsapp.jid.DeviceJid r0 = r7.A0R     // Catch:{ IllegalArgumentException -> 0x00e2 }
            X.C28851Ya.A02(r0)     // Catch:{ IllegalArgumentException -> 0x00e2 }
            goto L_0x00fa
        L_0x00e2:
            java.lang.String r0 = "jid is not a valid axolotl address"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00fa:
            if (r6 != 0) goto L_0x0118
            X.C28851Ya.A02(r8)     // Catch:{ IllegalArgumentException -> 0x0100 }
            goto L_0x0118
        L_0x0100:
            java.lang.String r0 = "participant is not a valid axolotl address"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0118:
            boolean r0 = X.C16030sJ.A0H(r9)
            byte[] r1 = r7.ephemeralSharedSecret
            if (r0 != 0) goto L_0x0156
            if (r1 != 0) goto L_0x013e
            java.util.HashMap r0 = r7.broadcastParticipantEphemeralSettings
            if (r0 == 0) goto L_0x015c
            java.lang.String r0 = "broadcastParticipantEphemeralSettings should only be set for a broadcast list jid"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x013e:
            java.lang.String r0 = "ephemeralSharedSecret should only be set for a broadcast list jid"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0156:
            java.util.HashMap r0 = r7.broadcastParticipantEphemeralSettings
            if (r1 != 0) goto L_0x017a
            if (r0 != 0) goto L_0x01e4
        L_0x015c:
            boolean r0 = r7.forceSenderKeyDistribution
            if (r0 == 0) goto L_0x019f
            if (r5 != 0) goto L_0x0181
            java.lang.String r0 = "forced sender key distribution can only be used with target devices "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x017a:
            if (r0 != 0) goto L_0x015c
            int r0 = r7.retryCount
            if (r0 == 0) goto L_0x01e4
            goto L_0x015c
        L_0x0181:
            boolean r0 = r7.A07()
            if (r0 != 0) goto L_0x019f
            java.lang.String r0 = "forced sender key distribution can only be used with target devices "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x019f:
            boolean r0 = r7.forceSenderKeyDistribution
            if (r0 == 0) goto L_0x01c4
            X.1iD r0 = r7.A0b
            int r0 = r0.A00
            r1 = 2
            r0 = r0 & 2
            if (r0 == r1) goto L_0x01c4
            java.lang.String r0 = "missing sender key distribution message "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01c4:
            java.lang.String r4 = r7.jid
            java.lang.String r3 = r7.id
            int r1 = r7.editVersion
            java.lang.String r0 = r7.participant
            X.2Q1 r2 = new X.2Q1
            r2.<init>(r4, r3, r0, r1)
            java.util.concurrent.ConcurrentHashMap r1 = A0m
            monitor-enter(r1)
            boolean r0 = r1.containsKey(r2)     // Catch:{ all -> 0x01e1 }
            r7.duplicate = r0     // Catch:{ all -> 0x01e1 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x01e1 }
            r1.put(r2, r0)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r1)     // Catch:{ all -> 0x01e1 }
            return
        L_0x01e1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01e1 }
            throw r0
        L_0x01e4:
            java.lang.String r0 = "both or neither ephemeral parameter should be set for a broadcast list jid"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01fc:
            java.lang.String r0 = "groupParticipantHash cannot be set to an empty string"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0214:
            java.lang.String r0 = "retryCount cannot be negative"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r7.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendE2EMessageJob.A05(com.whatsapp.jid.DeviceJid, com.whatsapp.jid.Jid):void");
    }

    public void A06(C16740tZ r28, Collection collection, int i2, int i3, int i4, int i5, boolean z2) {
        C16740tZ r6 = r28;
        if (r28 != null) {
            if (this.messageSendStartTime != 0 && this.A05 != 0) {
                C16440t3 r0 = this.A0C;
                long uptimeMillis = SystemClock.uptimeMillis();
                long A002 = r0.A00() - this.messageSendStartTime;
                int i6 = i2;
                long j2 = uptimeMillis - (i6 == 6 ? this.A05 : r6.A18);
                Collection collection2 = collection;
                int i7 = i3;
                int i8 = i5;
                this.A09.A0J(r6, collection2, i6, i7, this.retryCount, this.A01, i8, 0, 0, i4, j2, A002, A002, this.A0l, this.A0j, this.A0i, A08(), z2);
            }
        }
    }

    public final boolean A07() {
        HashSet hashSet = this.targetDeviceRawJids;
        return hashSet != null && !hashSet.isEmpty();
    }

    public final boolean A08() {
        int i2 = this.messageType;
        return (i2 == 58 || i2 == 69 || i2 == 77 || !A07()) ? false : true;
    }

    public void Adl(Context context) {
        AnonymousClass01F r2 = (AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class);
        this.A0C = r2.Agj();
        this.A0Q = r2.A1G();
        C16150sX r1 = (C16150sX) r2;
        this.A07 = (C14870pt) r1.AB3.get();
        this.A06 = r2.A6q();
        this.A08 = (C16040sK) r1.ADr.get();
        this.A0Z = (C17190ug) r1.AEu.get();
        this.A09 = (C18020w1) r1.AF7.get();
        this.A0E = (AnonymousClass16P) r1.AMY.get();
        this.A0d = (C222617g) r1.A8a.get();
        this.A0a = (C18290wS) r1.AIB.get();
        this.A0F = (C16460t6) r1.A5k.get();
        this.A0Y = (C222717h) r1.AC3.get();
        this.A0L = (C17580vJ) r1.AQW.get();
        this.A0I = (C19150xq) r1.AFC.get();
        this.A0D = (C208211s) r1.AMX.get();
        this.A0J = (AnonymousClass1HK) r1.AFO.get();
        this.A0N = (AnonymousClass15G) r1.AEe.get();
        this.A0B = (C17030uP) r1.APp.get();
        this.A0O = (AnonymousClass137) r1.A6f.get();
        this.A0K = (AnonymousClass16V) r1.AKi.get();
        this.A0f = (AnonymousClass1S7) r1.AMf.get();
        this.A0A = (AnonymousClass1HD) r1.AJ0.get();
        this.A0M = (AnonymousClass15H) r1.AQZ.get();
        this.A0W = (C19430yQ) r1.ADa.get();
        this.A0X = (C24551Gj) r1.A5l.get();
        this.A0P = (C27731Sx) r1.A7t.get();
        this.A0G = (C16070sO) r1.ABY.get();
        this.A0e = (C15960sC) r1.AKz.get();
        this.A0H = (C221816y) r1.AEw.get();
        this.A0g = (AnonymousClass1A4) r1.AGA.get();
        this.A0T = new AnonymousClass3B8(this.A08, this.A0K, this.A0O, (C18030w2) r1.A6W.get());
        this.A0S = new C86404So(this.encryptionRetryCounts);
    }
}
