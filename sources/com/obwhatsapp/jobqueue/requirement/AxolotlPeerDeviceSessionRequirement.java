package com.obwhatsapp.jobqueue.requirement;

import X.AnonymousClass00B;
import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.C16150sX;
import X.C19810z2;
import X.C208211s;
import X.C28791Xq;
import X.C28851Ya;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import org.whispersystems.jobqueue.requirements.Requirement;

public class AxolotlPeerDeviceSessionRequirement implements Requirement, C28791Xq {
    public transient C208211s A00;
    public transient C19810z2 A01;
    public final String targetJidRawString;

    public AxolotlPeerDeviceSessionRequirement(DeviceJid deviceJid) {
        this.targetJidRawString = deviceJid.getRawString();
    }

    public boolean AJT() {
        DeviceJid nullable = DeviceJid.getNullable(this.targetJidRawString);
        AnonymousClass00B.A06(nullable);
        if (this.A01.A06().contains(nullable)) {
            return this.A00.A0d(C28851Ya.A02(nullable));
        }
        StringBuilder sb = new StringBuilder("AxolotlDeviceSessionRequirement/isPresent/warning: the specific device is not in db, handle the error in the job. jid=");
        sb.append(this.targetJidRawString);
        Log.w(sb.toString());
        return true;
    }

    public void Adl(Context context) {
        C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class));
        this.A01 = (C19810z2) r1.APZ.get();
        this.A00 = (C208211s) r1.AMX.get();
    }
}
