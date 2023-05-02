package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass16P;
import X.AnonymousClass1HD;
import X.AnonymousClass3IX;
import X.C16030sJ;
import X.C16040sK;
import X.C16150sX;
import X.C17190ug;
import X.C19430yQ;
import X.C208211s;
import X.C27471Rw;
import X.C28371Vv;
import X.C28791Xq;
import X.C30641ci;
import X.C30821d1;
import X.C33211iD;
import X.C34941l7;
import X.C35081lL;
import X.C36651nt;
import X.C454228o;
import android.content.Context;
import android.util.Pair;
import com.facebook.redex.IDxCallableShape28S0300000_2_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.whispersystems.jobqueue.Job;

public final class SendLiveLocationKeyJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C16040sK A00;
    public transient AnonymousClass1HD A01;
    public transient C208211s A02;
    public transient AnonymousClass16P A03;
    public transient C19430yQ A04;
    public transient C27471Rw A05;
    public final ArrayList rawJids;
    public final Integer retryCount;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendLiveLocationKeyJob(com.whatsapp.jid.DeviceJid r5, byte[] r6, int r7) {
        /*
            r4 = this;
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            if (r6 == 0) goto L_0x0012
            int r0 = r6.length
            if (r0 != 0) goto L_0x0012
            java.lang.String r1 = "cannot use empty old alice base key"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0012:
            com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r5)
            r3.add(r0)
            if (r6 == 0) goto L_0x0024
            com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r0 = new com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            r0.<init>(r5, r6)
            r3.add(r0)
        L_0x0024:
            java.lang.String r2 = "SendLiveLocationKeyJob"
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r4.<init>(r0)
            if (r7 < 0) goto L_0x0052
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.rawJids = r1
            com.whatsapp.jid.UserJid r0 = r5.getUserJid()
            java.lang.String r0 = r0.getRawString()
            r1.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r4.retryCount = r0
            return
        L_0x0052:
            java.lang.String r0 = "retryCount cannot be negative"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r4.A04()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendLiveLocationKeyJob.<init>(com.whatsapp.jid.DeviceJid, byte[], int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendLiveLocationKeyJob(java.util.List r6) {
        /*
            r5 = this;
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r3 = 0
            java.util.Iterator r2 = r6.iterator()
        L_0x000a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r2.next()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 == 0) goto L_0x000a
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r0)
            X.AnonymousClass00B.A06(r1)
            com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r1)
            r4.add(r0)
            goto L_0x000a
        L_0x0028:
            java.lang.String r2 = "SendLiveLocationKeyJob"
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r4.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r4, r1)
            r5.<init>(r0)
            java.lang.String r0 = ""
            X.AnonymousClass00B.A0A(r0, r6)
            java.util.ArrayList r0 = X.C16030sJ.A06(r6)
            r5.rawJids = r0
            r5.retryCount = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendLiveLocationKeyJob.<init>(java.util.List):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        ArrayList arrayList = this.rawJids;
        if (arrayList == null || arrayList.isEmpty()) {
            StringBuilder sb = new StringBuilder("jids must not be empty");
            sb.append(A04());
            throw new InvalidObjectException(sb.toString());
        }
        Integer num = this.retryCount;
        if (num != null && num.intValue() < 0) {
            StringBuilder sb2 = new StringBuilder("retryCount cannot be negative");
            sb2.append(A04());
            throw new InvalidObjectException(sb2.toString());
        }
    }

    public void A01() {
        List<UserJid> list;
        Integer num = this.retryCount;
        int i2 = 0;
        C19430yQ r12 = this.A04;
        if (num != null) {
            UserJid nullable = UserJid.getNullable((String) this.rawJids.get(0));
            int intValue = this.retryCount.intValue();
            synchronized (r12.A0S) {
                if (!r12.A0d(nullable, intValue)) {
                    List emptyList = Collections.emptyList();
                    list = emptyList;
                } else {
                    List<UserJid> singletonList = Collections.singletonList(nullable);
                    StringBuilder sb = new StringBuilder("LocationSharingManager/markParticipantsAsNeedSenderKey; jids.size");
                    sb.append(singletonList.size());
                    Log.i(sb.toString());
                    ArrayList arrayList = new ArrayList();
                    r12.A0A();
                    for (UserJid userJid : singletonList) {
                        if (!r12.A09.A0I(userJid)) {
                            HashSet hashSet = r12.A0V;
                            if (hashSet.contains(userJid)) {
                                hashSet.remove(userJid);
                                arrayList.add(userJid);
                            }
                        }
                    }
                    r12.A0N.A08(arrayList, false);
                    r12.A0B.A00.A01(new C36651nt());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("LocationSharingManager/markSendingLocationKeyRetry/marking; remote_resource=");
                    sb2.append(nullable);
                    sb2.append("; retryCount=");
                    sb2.append(intValue);
                    Log.i(sb2.toString());
                    r12.A0Z.put(nullable, Pair.create(Long.valueOf(r12.A0G.A00()), Integer.valueOf(intValue)));
                    r12.A0b.put(nullable, 1);
                    List singletonList2 = Collections.singletonList(nullable);
                    list = singletonList2;
                }
            }
        } else {
            List<UserJid> A08 = C16030sJ.A08(UserJid.class, this.rawJids);
            synchronized (r12.A0S) {
                ArrayList arrayList2 = new ArrayList();
                List A07 = r12.A07();
                for (UserJid userJid2 : A08) {
                    Map map = r12.A0b;
                    Integer num2 = (Integer) map.get(userJid2);
                    if (A07.contains(userJid2) && (num2 == null || num2.intValue() != 1)) {
                        arrayList2.add(userJid2);
                        map.put(userJid2, 1);
                    }
                }
                list = arrayList2;
            }
        }
        if (list.isEmpty()) {
            StringBuilder sb3 = new StringBuilder("skip send live location key job; no one to send");
            sb3.append(A04());
            Log.i(sb3.toString());
            return;
        }
        StringBuilder sb4 = new StringBuilder("run send live location key job");
        sb4.append(A04());
        Log.i(sb4.toString());
        try {
            C34941l7 r4 = C34941l7.A00;
            C33211iD r10 = (C33211iD) this.A03.A00.submit(new AnonymousClass3IX(r4, this)).get();
            HashMap hashMap = new HashMap();
            for (UserJid userJid3 : list) {
                hashMap.put(userJid3, (C30821d1) this.A03.A00.submit(new IDxCallableShape28S0300000_2_I0(this, userJid3, r10, 1)).get());
            }
            C27471Rw r5 = this.A05;
            Integer num3 = this.retryCount;
            if (num3 != null) {
                i2 = num3.intValue();
            }
            C17190ug r6 = r5.A01;
            String A032 = r6.A03();
            HashMap hashMap2 = new HashMap();
            C30641ci r14 = new C30641ci(r4, (Jid) null, (UserJid) null, "notification", A032, "location", (String) null, (String) null, hashMap2.isEmpty() ? null : new ArrayList(hashMap2.values()), 0);
            C35081lL[] r102 = {new C35081lL("id", A032), new C35081lL((Jid) r4, "to"), new C35081lL("type", "location")};
            C28371Vv[] r42 = new C28371Vv[hashMap.size()];
            int i3 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                r42[i3] = new C28371Vv(C454228o.A00((C30821d1) entry.getValue(), i2), "to", new C35081lL[]{new C35081lL((Jid) entry.getKey(), "jid")});
                i3++;
            }
            r6.A06(new C28371Vv(new C28371Vv("participants", (C35081lL[]) null, r42), "notification", r102), r14, 123).get();
            StringBuilder sb5 = new StringBuilder("sent location key distribution notifications");
            sb5.append(A04());
            Log.i(sb5.toString());
            C19430yQ r7 = this.A04;
            StringBuilder sb6 = new StringBuilder("LocationSharingManager/markSentLocationKey; jids.size=");
            sb6.append(list.size());
            Log.i(sb6.toString());
            ArrayList arrayList3 = new ArrayList();
            synchronized (r7.A0S) {
                r7.A0A();
                for (UserJid userJid4 : list) {
                    if (!r7.A09.A0I(userJid4)) {
                        HashSet hashSet2 = r7.A0V;
                        if (!hashSet2.contains(userJid4)) {
                            Map map2 = r7.A0b;
                            Integer num4 = (Integer) map2.get(userJid4);
                            if (num4 != null && num4.intValue() == 1) {
                                hashSet2.add(userJid4);
                                arrayList3.add(userJid4);
                                map2.remove(userJid4);
                            }
                        }
                    }
                }
                r7.A0N.A08(arrayList3, true);
                if (r7.A0a()) {
                    r7.A0H();
                }
            }
            r7.A0B.A00.A01(new C36651nt());
        } catch (Exception e2) {
            C19430yQ r43 = this.A04;
            synchronized (r43.A0S) {
                for (UserJid remove : list) {
                    r43.A0b.remove(remove);
                }
                throw e2;
            }
        }
    }

    public final String A04() {
        StringBuilder sb = new StringBuilder("; persistentId=");
        sb.append(this.A01);
        sb.append("; jids.size()=");
        sb.append(this.rawJids.size());
        sb.append("; retryCount=");
        sb.append(this.retryCount);
        return sb.toString();
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class));
        this.A00 = (C16040sK) r1.ADr.get();
        this.A03 = (AnonymousClass16P) r1.AMY.get();
        this.A02 = (C208211s) r1.AMX.get();
        this.A05 = (C27471Rw) r1.ADd.get();
        this.A01 = (AnonymousClass1HD) r1.AJ0.get();
        this.A04 = (C19430yQ) r1.ADa.get();
    }
}
