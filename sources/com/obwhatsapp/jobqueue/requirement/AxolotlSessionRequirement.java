package com.obwhatsapp.jobqueue.requirement;

import X.AnonymousClass01F;
import X.AnonymousClass01I;
import X.AnonymousClass1W4;
import X.C16150sX;
import X.C208211s;
import X.C28791Xq;
import X.C28851Ya;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class AxolotlSessionRequirement implements Requirement, C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C208211s A00;
    public transient DeviceJid A01;
    public final String jid;

    public AxolotlSessionRequirement(DeviceJid deviceJid) {
        this.A01 = deviceJid;
        this.jid = deviceJid.getRawString();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A01 = DeviceJid.get(this.jid);
        } catch (AnonymousClass1W4 unused) {
            StringBuilder sb = new StringBuilder("jid must be a valid user jid; jid=");
            sb.append(this.jid);
            throw new InvalidObjectException(sb.toString());
        }
    }

    public boolean AJT() {
        return this.A00.A0d(C28851Ya.A02(this.A01));
    }

    public void Adl(Context context) {
        this.A00 = (C208211s) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class))).AMX.get();
    }
}
