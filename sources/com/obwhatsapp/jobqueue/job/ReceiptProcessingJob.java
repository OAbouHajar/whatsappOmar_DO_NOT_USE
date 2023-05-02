package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C16030sJ;
import X.C16150sX;
import X.C27601Sk;
import X.C28381Vw;
import X.C28791Xq;
import X.C40111ta;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import java.util.LinkedList;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public final class ReceiptProcessingJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C27601Sk A00;
    public final boolean[] keyFromMe;
    public final String[] keyId;
    public final String[] keyRemoteChatJidRawString;
    public final String participantDeviceJidRawString;
    public final C40111ta receiptPrivacyMode;
    public final String remoteJidRawString;
    public final int status;
    public final long timestamp;

    public ReceiptProcessingJob(DeviceJid deviceJid, Jid jid, C40111ta r10, C28381Vw[] r11, int i2, long j2) {
        super(new JobParameters("ReceiptProcessingGroup", new LinkedList(), true));
        int length = r11.length;
        String[] strArr = new String[length];
        this.keyId = strArr;
        boolean[] zArr = new boolean[length];
        this.keyFromMe = zArr;
        String[] strArr2 = new String[length];
        this.keyRemoteChatJidRawString = strArr2;
        for (int i3 = 0; i3 < length; i3++) {
            strArr[i3] = r11[i3].A01;
            C28381Vw r1 = r11[i3];
            zArr[i3] = r1.A02;
            strArr2[i3] = C16030sJ.A03(r1.A00);
        }
        this.remoteJidRawString = jid.getRawString();
        this.participantDeviceJidRawString = C16030sJ.A03(deviceJid);
        this.status = i2;
        this.timestamp = j2;
        this.receiptPrivacyMode = r10;
    }

    public final String A04() {
        StringBuilder sb = new StringBuilder("; remoteJid=");
        sb.append(Jid.getNullable(this.remoteJidRawString));
        sb.append("; number of keys=");
        sb.append(this.keyId.length);
        sb.append("; receiptPrivacyMode=");
        sb.append(this.receiptPrivacyMode);
        return sb.toString();
    }

    public void Adl(Context context) {
        this.A00 = (C27601Sk) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class))).AFf.get();
    }
}
