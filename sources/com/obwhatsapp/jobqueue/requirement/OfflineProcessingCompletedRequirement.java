package com.obwhatsapp.jobqueue.requirement;

import X.AnonymousClass01F;
import X.C13700nu;
import X.C14710pd;
import X.C16150sX;
import X.C16600tK;
import X.C28791Xq;
import android.content.Context;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class OfflineProcessingCompletedRequirement implements Requirement, C28791Xq {
    public transient C16600tK A00;
    public transient C14710pd A01;

    public boolean AJT() {
        return !this.A01.A0C(560) || !this.A00.A06();
    }

    public void Adl(Context context) {
        AnonymousClass01F A0A = C13700nu.A0A(context);
        this.A00 = (C16600tK) ((C16150sX) A0A).ARd.get();
        this.A01 = A0A.A1G();
    }
}
