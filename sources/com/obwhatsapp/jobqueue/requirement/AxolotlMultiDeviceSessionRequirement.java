package com.obwhatsapp.jobqueue.requirement;

import X.AnonymousClass00B;
import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass16V;
import X.C15830rv;
import X.C16030sJ;
import X.C16040sK;
import X.C16060sN;
import X.C16070sO;
import X.C16150sX;
import X.C208211s;
import X.C221816y;
import X.C28381Vw;
import X.C28791Xq;
import X.C28851Ya;
import X.C30361cE;
import X.C48792Pd;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.whispersystems.jobqueue.requirements.Requirement;

public class AxolotlMultiDeviceSessionRequirement implements Requirement, C28791Xq {
    public transient int A00;
    public transient C208211s A01;
    public transient C221816y A02;
    public transient AnonymousClass16V A03;
    public transient C15830rv A04;
    public transient C48792Pd A05;
    public transient Object A06 = new Object();
    public transient List A07;
    public transient boolean A08;
    public volatile transient int A09;
    @Deprecated
    public boolean forceSenderKeyDistribution;
    public Boolean messageFromMe;
    public final String messageKeyId;
    public int messageType;
    public final String remoteRawJid;
    public final HashSet targetDeviceRawJids;

    public AxolotlMultiDeviceSessionRequirement(C15830rv r3, Boolean bool, String str, Set set, int i2) {
        this.messageKeyId = str;
        this.messageFromMe = Boolean.valueOf(bool.booleanValue());
        this.A04 = r3;
        this.remoteRawJid = r3.getRawString();
        HashSet hashSet = new HashSet();
        C16030sJ.A0E(set, hashSet);
        this.targetDeviceRawJids = hashSet;
        this.messageType = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r1 != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readObject(java.io.ObjectInputStream r3) {
        /*
            r2 = this;
            r3.defaultReadObject()
            java.lang.String r0 = r2.remoteRawJid     // Catch:{ 1W4 -> 0x002d }
            X.0rv r0 = X.C15830rv.A01(r0)     // Catch:{ 1W4 -> 0x002d }
            r2.A04 = r0     // Catch:{ 1W4 -> 0x002d }
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.A06 = r0
            java.lang.Boolean r0 = r2.messageFromMe
            if (r0 == 0) goto L_0x001d
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.messageFromMe = r0
            boolean r0 = r2.forceSenderKeyDistribution
            if (r0 == 0) goto L_0x002c
            r0 = 58
            r2.messageType = r0
        L_0x002c:
            return
        L_0x002d:
            java.lang.String r0 = "invalid jid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r2.remoteRawJid
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.io.InvalidObjectException r0 = new java.io.InvalidObjectException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement.readObject(java.io.ObjectInputStream):void");
    }

    public final List A00() {
        Collection<DeviceJid> A002;
        List list;
        String A0B;
        synchronized (this.A06) {
            if (this instanceof AxolotlMultiDeviceSenderKeyRequirement) {
                AxolotlMultiDeviceSenderKeyRequirement axolotlMultiDeviceSenderKeyRequirement = (AxolotlMultiDeviceSenderKeyRequirement) this;
                HashSet hashSet = axolotlMultiDeviceSenderKeyRequirement.A05.A04;
                if (hashSet == null || hashSet.isEmpty()) {
                    AnonymousClass16V r5 = axolotlMultiDeviceSenderKeyRequirement.A02;
                    C15830rv r3 = axolotlMultiDeviceSenderKeyRequirement.A04;
                    Boolean bool = axolotlMultiDeviceSenderKeyRequirement.messageFromMe;
                    AnonymousClass00B.A06(bool);
                    A002 = r5.A00(new C28381Vw(r3, axolotlMultiDeviceSenderKeyRequirement.messageKeyId, bool.booleanValue()));
                    C15830rv r32 = axolotlMultiDeviceSenderKeyRequirement.A04;
                    C16060sN r33 = r32 instanceof C16060sN ? (C16060sN) r32 : null;
                    AnonymousClass00B.A06(r33);
                    String str = axolotlMultiDeviceSenderKeyRequirement.groupParticipantHash;
                    AnonymousClass00B.A06(str);
                    boolean startsWith = str.startsWith("2");
                    C16070sO r0 = axolotlMultiDeviceSenderKeyRequirement.A01;
                    if (startsWith) {
                        boolean z2 = axolotlMultiDeviceSenderKeyRequirement.useLidForEncryption;
                        C30361cE A042 = r0.A07.A04(r33);
                        A0B = z2 ? A042.A09() : A042.A0A();
                    } else {
                        A0B = r0.A07.A04(r33).A0B();
                    }
                    if (!(!A0B.equals(axolotlMultiDeviceSenderKeyRequirement.groupParticipantHash))) {
                        Set A0F = axolotlMultiDeviceSenderKeyRequirement.A01.A07.A04(r33).A0F(axolotlMultiDeviceSenderKeyRequirement.A00, axolotlMultiDeviceSenderKeyRequirement.useLidForEncryption);
                        A0F.retainAll(A002);
                        if (C16030sJ.A0H(r33)) {
                            HashSet hashSet2 = new HashSet();
                            for (DeviceJid deviceJid : A002) {
                                if (axolotlMultiDeviceSenderKeyRequirement.A00.A0J(deviceJid)) {
                                    hashSet2.add(deviceJid);
                                }
                            }
                            A0F.addAll(hashSet2);
                        }
                        A002 = A0F;
                    }
                } else {
                    A002 = axolotlMultiDeviceSenderKeyRequirement.A05.A00();
                }
            } else {
                A002 = this.A05.A00();
            }
            if (!this.A08 || this.A00 != A002.size()) {
                if (!A002.isEmpty()) {
                    ArrayList arrayList = new ArrayList(A002.size());
                    for (DeviceJid A022 : A002) {
                        arrayList.add(C28851Ya.A02(A022));
                    }
                    this.A07 = new ArrayList();
                    int size = arrayList.size() / 100;
                    int size2 = arrayList.size() % 100;
                    int i2 = 0;
                    while (i2 < size) {
                        int i3 = i2 * 100;
                        i2++;
                        this.A07.add(arrayList.subList(i3, 100 * i2));
                    }
                    if (size2 > 0) {
                        this.A07.add(arrayList.subList(arrayList.size() - size2, arrayList.size()));
                    }
                } else {
                    this.A07 = null;
                }
                this.A08 = true;
                this.A00 = A002.size();
                this.A09 = 0;
            }
            list = this.A07;
        }
        return list;
    }

    public void A01() {
        AnonymousClass16V r4 = this.A03;
        C221816y r3 = this.A02;
        HashSet hashSet = this.targetDeviceRawJids;
        C15830rv r2 = this.A04;
        Boolean bool = this.messageFromMe;
        AnonymousClass00B.A06(bool);
        this.A05 = new C48792Pd(r3, r4, new C28381Vw(r2, this.messageKeyId, bool.booleanValue()), hashSet, this.messageType);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
        if (r8 != r2) goto L_0x00b6;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00d6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AJT() {
        /*
            r20 = this;
            r4 = r20
            java.util.List r3 = r4.A00()
            r18 = 1
            if (r3 == 0) goto L_0x00da
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00da
            int r0 = r4.A09
            r19 = r0
        L_0x0014:
            X.11s r9 = r4.A01
            int r0 = r4.A09
            java.lang.Object r2 = r3.get(r0)
            java.util.List r2 = (java.util.List) r2
            java.util.HashSet r17 = new java.util.HashSet
            r17.<init>()
            X.19U r10 = r9.A0F
            monitor-enter(r10)
            java.util.Set r0 = r10.A01(r2)     // Catch:{ all -> 0x00d7 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x00d7 }
            r0 = 0
            if (r1 == 0) goto L_0x00ab
            java.util.Set r12 = r10.A02(r2)     // Catch:{ all -> 0x00d7 }
            int r8 = r12.size()     // Catch:{ all -> 0x00d7 }
            r0 = 1
            if (r8 == 0) goto L_0x00ab
            X.1ex r0 = r9.A0B     // Catch:{ all -> 0x00d7 }
            android.database.Cursor r11 = r0.A00(r12)     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = "record"
            int r16 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "recipient_id"
            int r7 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "recipient_type"
            int r6 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "device_id"
            int r5 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x00d0 }
            r2 = 0
        L_0x005b:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x0090
            r0 = r16
            byte[] r14 = r11.getBlob(r0)     // Catch:{ all -> 0x00d0 }
            long r0 = r11.getLong(r7)     // Catch:{ all -> 0x00d0 }
            java.lang.String r15 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            int r13 = r11.getInt(r6)     // Catch:{ all -> 0x00d0 }
            int r0 = r11.getInt(r5)     // Catch:{ all -> 0x00d0 }
            X.1Yb r1 = new X.1Yb     // Catch:{ all -> 0x00d0 }
            r1.<init>(r13, r15, r0)     // Catch:{ all -> 0x00d0 }
            X.1ev r0 = new X.1ev     // Catch:{ IOException -> 0x008a }
            r0.<init>(r14)     // Catch:{ IOException -> 0x008a }
            X.C208211s.A02(r0)     // Catch:{ IOException -> 0x008a }
            r10.A03(r0, r1)     // Catch:{ IOException -> 0x008a }
            int r2 = r2 + 1
            goto L_0x005b
        L_0x008a:
            r0 = r17
            r0.add(r1)     // Catch:{ all -> 0x00d0 }
            goto L_0x005b
        L_0x0090:
            r11.close()     // Catch:{ all -> 0x00d7 }
            r10.A04(r12)     // Catch:{ all -> 0x00d7 }
            monitor-exit(r10)     // Catch:{ all -> 0x00d7 }
            java.util.Iterator r1 = r17.iterator()
        L_0x009b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ad
            java.lang.Object r0 = r1.next()
            X.1Yb r0 = (X.C28861Yb) r0
            r9.A0E(r0)
            goto L_0x009b
        L_0x00ab:
            monitor-exit(r10)     // Catch:{ all -> 0x00d7 }
            goto L_0x00b7
        L_0x00ad:
            int r0 = r17.size()
            if (r0 != 0) goto L_0x00b6
            r0 = 1
            if (r8 == r2) goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            r2 = 0
            if (r0 != 0) goto L_0x00bb
            return r2
        L_0x00bb:
            int r0 = r4.A09
            int r1 = r0 + 1
            r4.A09 = r1
            int r0 = r3.size()
            if (r1 != r0) goto L_0x00c9
            r4.A09 = r2
        L_0x00c9:
            int r1 = r4.A09
            r0 = r19
            if (r1 != r0) goto L_0x0014
            return r18
        L_0x00d0:
            r0 = move-exception
            if (r11 == 0) goto L_0x00d6
            r11.close()     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            throw r0     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00d7 }
            throw r0
        L_0x00da:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement.AJT():boolean");
    }

    public void Adl(Context context) {
        if (this instanceof AxolotlMultiDeviceSenderKeyRequirement) {
            AxolotlMultiDeviceSenderKeyRequirement axolotlMultiDeviceSenderKeyRequirement = (AxolotlMultiDeviceSenderKeyRequirement) this;
            C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class));
            axolotlMultiDeviceSenderKeyRequirement.A00 = (C16040sK) r1.ADr.get();
            axolotlMultiDeviceSenderKeyRequirement.A01 = (C208211s) r1.AMX.get();
            axolotlMultiDeviceSenderKeyRequirement.A02 = (AnonymousClass16V) r1.AKi.get();
            axolotlMultiDeviceSenderKeyRequirement.A01 = (C16070sO) r1.ABY.get();
            axolotlMultiDeviceSenderKeyRequirement.A02 = (C221816y) r1.AEw.get();
            axolotlMultiDeviceSenderKeyRequirement.A01();
            return;
        }
        C16150sX r12 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class));
        this.A01 = (C208211s) r12.AMX.get();
        this.A03 = (AnonymousClass16V) r12.AKi.get();
        this.A02 = (C221816y) r12.AEw.get();
        A01();
    }
}
