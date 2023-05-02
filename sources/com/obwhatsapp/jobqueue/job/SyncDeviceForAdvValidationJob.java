package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C15860rz;
import X.C16030sJ;
import X.C16150sX;
import X.C16600tK;
import X.C19230xz;
import X.C19810z2;
import X.C28791Xq;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.LinkedList;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public class SyncDeviceForAdvValidationJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C16600tK A00;
    public transient C19230xz A01;
    public transient C15860rz A02;
    public transient C19810z2 A03;
    public final String[] jids;

    public SyncDeviceForAdvValidationJob(UserJid[] userJidArr) {
        super(new JobParameters("SyncDeviceForAdvValidationJob", new LinkedList(), false));
        this.jids = C16030sJ.A0T(Arrays.asList(userJidArr));
    }

    public void Adl(Context context) {
        AnonymousClass01F r2 = (AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class);
        C16150sX r1 = (C16150sX) r2;
        this.A00 = (C16600tK) r1.ARd.get();
        this.A03 = (C19810z2) r1.APZ.get();
        this.A01 = (C19230xz) r1.A5B.get();
        this.A02 = r2.Ai3();
    }
}
