package com.obwhatsapp.jobqueue.requirement;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C16150sX;
import X.C16600tK;
import X.C28791Xq;
import android.content.Context;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class ChatConnectionRequirement implements Requirement, C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C16600tK A00;

    public boolean AJT() {
        return this.A00.A08();
    }

    public void Adl(Context context) {
        this.A00 = (C16600tK) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class))).ARd.get();
    }
}
