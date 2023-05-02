package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass11G;
import X.C16150sX;
import X.C16300so;
import X.C17190ug;
import X.C28791Xq;
import X.C48932Py;
import android.content.Context;
import com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement;
import java.util.LinkedList;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

public final class GetStatusPrivacyJob extends Job implements C28791Xq {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass11G A00;
    public transient C48932Py A01;

    public GetStatusPrivacyJob(JobParameters jobParameters) {
        super(jobParameters);
    }

    public static GetStatusPrivacyJob A00() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new ChatConnectionRequirement());
        return new GetStatusPrivacyJob(new JobParameters("GetStatusPrivacyJob", linkedList, true));
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class));
        this.A00 = (AnonymousClass11G) r1.ANN.get();
        this.A01 = new C48932Py((C16300so) r1.A5p.get(), (C17190ug) r1.AEu.get());
    }
}
