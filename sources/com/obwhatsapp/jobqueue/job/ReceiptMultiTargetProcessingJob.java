package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass00B;
import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C15830rv;
import X.C16030sJ;
import X.C16150sX;
import X.C27601Sk;
import X.C28381Vw;
import X.C28791Xq;
import X.C40111ta;
import android.content.Context;
import android.util.Pair;
import com.whatsapp.jid.Jid;
import java.util.LinkedList;
import java.util.List;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public final class ReceiptMultiTargetProcessingJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C27601Sk A00;
    public final boolean keyFromMe;
    public final String keyId;
    public final String keyRemoteChatJidRawString;
    public final String[] participantDeviceJidRawString;
    public final C40111ta receiptPrivacyMode;
    public final String remoteJidString;
    public final int status;
    public final long[] timestamp;

    public ReceiptMultiTargetProcessingJob(Jid jid, C28381Vw r8, C40111ta r9, List list, int i2) {
        super(new JobParameters("ReceiptProcessingGroup", new LinkedList(), true));
        int size = list.size();
        this.keyId = r8.A01;
        this.keyFromMe = r8.A02;
        C15830rv r0 = r8.A00;
        AnonymousClass00B.A06(r0);
        this.keyRemoteChatJidRawString = r0.getRawString();
        this.remoteJidString = jid.getRawString();
        this.status = i2;
        this.participantDeviceJidRawString = new String[size];
        this.timestamp = new long[size];
        this.receiptPrivacyMode = r9;
        for (int i3 = 0; i3 < size; i3++) {
            Pair pair = (Pair) list.get(i3);
            this.participantDeviceJidRawString[i3] = C16030sJ.A03((Jid) pair.first);
            long[] jArr = this.timestamp;
            Object obj = pair.second;
            AnonymousClass00B.A06(obj);
            jArr[i3] = ((Number) obj).longValue();
        }
    }

    public final String A04() {
        StringBuilder sb = new StringBuilder("; keyRemoteJid=");
        sb.append(Jid.getNullable(this.keyRemoteChatJidRawString));
        sb.append("; remoteJid=");
        sb.append(Jid.getNullable(this.remoteJidString));
        sb.append("; number of participants=");
        sb.append(this.participantDeviceJidRawString.length);
        sb.append("; recepitPrivacyMode=");
        sb.append(this.receiptPrivacyMode);
        return sb.toString();
    }

    public void Adl(Context context) {
        this.A00 = (C27601Sk) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context.getApplicationContext(), AnonymousClass01F.class))).AFf.get();
    }
}
