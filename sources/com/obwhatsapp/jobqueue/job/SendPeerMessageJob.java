package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass00B;
import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass16P;
import X.AnonymousClass16S;
import X.AnonymousClass19M;
import X.AnonymousClass19R;
import X.AnonymousClass1GC;
import X.AnonymousClass1HD;
import X.AnonymousClass1Vt;
import X.AnonymousClass1WV;
import X.AnonymousClass1ZT;
import X.AnonymousClass1ZX;
import X.AnonymousClass1ZY;
import X.AnonymousClass21Q;
import X.C14710pd;
import X.C16040sK;
import X.C16150sX;
import X.C16800tf;
import X.C16980tz;
import X.C17190ug;
import X.C17380uz;
import X.C17580vJ;
import X.C18970xY;
import X.C19810z2;
import X.C208211s;
import X.C28371Vv;
import X.C28381Vw;
import X.C28791Xq;
import X.C29861bL;
import X.C30641ci;
import X.C30821d1;
import X.C33211iD;
import X.C33221iE;
import X.C37281ou;
import X.C37571pN;
import X.C37601pQ;
import X.C39071rs;
import X.C40111ta;
import X.C51872cQ;
import X.C51882cR;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.facebook.redex.IDxCallableShape28S0300000_2_I0;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.whispersystems.jobqueue.Job;

public class SendPeerMessageJob extends Job implements C28791Xq {
    public static final DeviceJid[] A0D = new DeviceJid[0];
    public static final long serialVersionUID = 1;
    public transient C16040sK A00;
    public transient AnonymousClass1HD A01;
    public transient AnonymousClass19R A02;
    public transient C208211s A03;
    public transient AnonymousClass16P A04;
    public transient C17580vJ A05;
    public transient C19810z2 A06;
    public transient AnonymousClass19M A07;
    public transient C14710pd A08;
    public transient C17190ug A09;
    public transient AnonymousClass16S A0A;
    public transient AnonymousClass1GC A0B;
    public final transient byte[] A0C;
    public final long peerMessageRowId;
    public final int retryCount;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendPeerMessageJob(com.whatsapp.jid.DeviceJid r5, X.C29861bL r6, byte[] r7, int r8) {
        /*
            r4 = this;
            byte r2 = r6.A10
            r0 = 35
            if (r2 == r0) goto L_0x0088
            r0 = 47
            if (r2 == r0) goto L_0x0084
            r0 = 50
            if (r2 == r0) goto L_0x0080
            r0 = 38
            if (r2 == r0) goto L_0x007c
            r0 = 39
            if (r2 == r0) goto L_0x0078
            r0 = 70
            if (r2 == r0) goto L_0x0075
            r0 = 71
            if (r2 == r0) goto L_0x0072
            r0 = 75
            if (r2 == r0) goto L_0x006f
            r0 = 76
            if (r2 != r0) goto L_0x008b
            java.lang.String r0 = "peer_data_sticker_request_response"
        L_0x0028:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "-"
            r2.append(r0)
            long r0 = r6.A13
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r3.add(r0)
            com.obwhatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.AxolotlPeerDeviceSessionRequirement
            r0.<init>(r5)
            r3.add(r0)
            if (r7 == 0) goto L_0x005d
            com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement r0 = new com.obwhatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement
            r0.<init>(r5, r7)
            r3.add(r0)
        L_0x005d:
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r2, r3, r1)
            r4.<init>(r0)
            long r0 = r6.A13
            r4.peerMessageRowId = r0
            r4.A0C = r7
            r4.retryCount = r8
            return
        L_0x006f:
            java.lang.String r0 = "peer_data_link_preview_request_response"
            goto L_0x0028
        L_0x0072:
            java.lang.String r0 = "peer_data_request_unknown_response"
            goto L_0x0028
        L_0x0075:
            java.lang.String r0 = "peer_data_operation_request"
            goto L_0x0028
        L_0x0078:
            java.lang.String r0 = "syncd-key-request"
            goto L_0x0028
        L_0x007c:
            java.lang.String r0 = "syncd-key-share"
            goto L_0x0028
        L_0x0080:
            java.lang.String r0 = "syncd-fatal-exception-notification"
            goto L_0x0028
        L_0x0084:
            java.lang.String r0 = "sync-security-settings"
            goto L_0x0028
        L_0x0088:
            java.lang.String r0 = "device-history-sync-notification"
            goto L_0x0028
        L_0x008b:
            java.lang.String r1 = "Cannot send message of type "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.SendPeerMessageJob.<init>(com.whatsapp.jid.DeviceJid, X.1bL, byte[], int):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    public void A01() {
        C30821d1 r3;
        String str;
        boolean A0G = this.A00.A0G();
        if (this.A0A.A01.A1d() || A0G) {
            C16040sK r0 = this.A00;
            r0.A0B();
            if (r0.A05 == null) {
                str = "SendPeerMessageJob/onRun/no my user id (unregistered?).";
            } else {
                C29861bL A022 = this.A07.A02(this.peerMessageRowId);
                if (A022 == null) {
                    StringBuilder sb = new StringBuilder("SendPeerMessageJob/onRun/no message found (");
                    sb.append(this.peerMessageRowId);
                    sb.append(").");
                    str = sb.toString();
                } else {
                    DeviceJid deviceJid = A022.A00;
                    StringBuilder sb2 = new StringBuilder("SendPeerMessageJob/onRun/start send");
                    sb2.append(A04());
                    sb2.append("; type=");
                    byte b2 = A022.A10;
                    sb2.append(b2);
                    sb2.append("; recipient=");
                    sb2.append(deviceJid);
                    sb2.append("; id=");
                    C28381Vw r7 = A022.A11;
                    String str2 = r7.A01;
                    sb2.append(str2);
                    Log.i(sb2.toString());
                    if (!A0G) {
                        C17380uz A062 = this.A06.A06();
                        if (deviceJid == null || A062.isEmpty()) {
                            str = "SendPeerMessageJob/onRun/no target device or no companion device exists.";
                        } else if (!A062.contains(deviceJid)) {
                            str = "SendPeerMessageJob/onRun/target device is not in db.";
                        }
                    }
                    HashMap hashMap = new HashMap();
                    C33221iE r8 = (C33221iE) C33211iD.A0o.A0U();
                    AnonymousClass1ZT r19 = null;
                    this.A0B.A01(A022, new AnonymousClass21Q(this.A00, (C16980tz) null, this.A08, r8, (AnonymousClass1WV) null, (JniBridge) null, (byte[]) null, false, false, false));
                    try {
                        r3 = (C30821d1) this.A04.A00.submit(new IDxCallableShape28S0300000_2_I0(this, deviceJid, r8.A02().A02(), 2)).get();
                    } catch (Exception unused) {
                        StringBuilder sb3 = new StringBuilder("SendPeerMessageJob/getEncryptedMessage/fail to get the preKey, jid=");
                        sb3.append(deviceJid.getRawString());
                        Log.e(sb3.toString());
                        r3 = null;
                    }
                    List AGD = A022 instanceof C39071rs ? ((C39071rs) A022).AGD() : null;
                    String str3 = (A022.A0L == null || this.retryCount <= 0) ? "text" : "pay";
                    if (b2 != 73 && r7.A02 && (deviceJid instanceof AnonymousClass1ZY)) {
                        r19 = this.A05.A01((AnonymousClass1ZX) deviceJid.getUserJid());
                    }
                    C30641ci r46 = new C30641ci(deviceJid, (Jid) null, (UserJid) null, "message", str2, (String) null, (String) null, (String) null, hashMap.isEmpty() ? null : new ArrayList(hashMap.values()), 0);
                    C17190ug r82 = this.A09;
                    int i2 = this.retryCount;
                    String str4 = A022.A0m;
                    r82.A04(Message.obtain((Handler) null, 0, 8, 0, new C51872cQ((AnonymousClass1Vt) null, (DeviceJid) null, deviceJid, r19, (UserJid) null, (C51882cR) null, r3, A022.A0O, r7, (C40111ta) null, (C28371Vv) null, r46, (Integer) null, Integer.valueOf(A022.A04), str4, str3, (String) null, "peer", ((A022 instanceof C37571pN) || (A022 instanceof C37601pQ)) ? "high" : null, (String) null, (List) null, AGD, Collections.emptyMap(), (Map) null, Collections.emptyMap(), i2, A022.A07(), A022.A01, 0, false, false, false)), r46).get();
                    A022.A01 = true;
                    AnonymousClass19M r4 = this.A07;
                    long j2 = A022.A13;
                    AnonymousClass00B.A00();
                    C16800tf A023 = r4.A00.A02();
                    try {
                        C37281ou A0A2 = A023.A02.A0A("UPDATE peer_messages SET acked = 1 WHERE _id = ?");
                        A0A2.A01(1, j2);
                        if (((long) A0A2.A00.executeUpdateDelete()) == 0) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("peer-messages-store/markAckReceived/cannot set ack received for message: ");
                            sb4.append(j2);
                            Log.e(sb4.toString());
                        }
                        A023.close();
                        for (C18970xY AQq : this.A02.A01()) {
                            AQq.AQq(A022);
                        }
                        StringBuilder sb5 = new StringBuilder("SendPeerMessageJob/onRun/end send");
                        sb5.append(A04());
                        sb5.append("; id=");
                        sb5.append(str2);
                        Log.i(sb5.toString());
                        return;
                    } catch (Throwable unused2) {
                    }
                }
            }
            Log.e(str);
            return;
        }
        Log.w("SendPeerMessageJob/onRun/wap4 disable.");
        return;
        throw th;
    }

    public final String A04() {
        StringBuilder sb = new StringBuilder("; peer_msg_row_id=");
        sb.append(this.peerMessageRowId);
        return sb.toString();
    }

    public void Adl(Context context) {
        AnonymousClass01F r1 = (AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class);
        this.A08 = r1.A1G();
        C16150sX r12 = (C16150sX) r1;
        this.A00 = (C16040sK) r12.ADr.get();
        this.A09 = (C17190ug) r12.AEu.get();
        this.A04 = (AnonymousClass16P) r12.AMY.get();
        this.A05 = (C17580vJ) r12.AQW.get();
        this.A07 = (AnonymousClass19M) r12.AIU.get();
        this.A03 = (C208211s) r12.AMX.get();
        this.A06 = (C19810z2) r12.APZ.get();
        this.A0A = (AnonymousClass16S) r12.AFt.get();
        this.A01 = (AnonymousClass1HD) r12.AJ0.get();
        this.A0B = (AnonymousClass1GC) r12.A8f.get();
        this.A02 = (AnonymousClass19R) r12.AIP.get();
    }
}
