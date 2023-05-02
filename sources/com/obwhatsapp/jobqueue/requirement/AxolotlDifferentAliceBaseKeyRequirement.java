package com.obwhatsapp.jobqueue.requirement;

import X.AnonymousClass00B;
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
import java.util.Arrays;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class AxolotlDifferentAliceBaseKeyRequirement implements Requirement, C28791Xq {
    public static final long serialVersionUID = 1;
    public transient C208211s A00;
    public transient DeviceJid A01;
    public final String jid;
    public final byte[] oldAliceBaseKey;

    public AxolotlDifferentAliceBaseKeyRequirement(DeviceJid deviceJid, byte[] bArr) {
        this.A01 = deviceJid;
        this.jid = deviceJid.getRawString();
        AnonymousClass00B.A0I(bArr);
        this.oldAliceBaseKey = bArr;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A01 = DeviceJid.get(this.jid);
            byte[] bArr = this.oldAliceBaseKey;
            if (bArr == null || bArr.length == 0) {
                throw new InvalidObjectException("oldAliceBaseKey must not be empty");
            }
        } catch (AnonymousClass1W4 unused) {
            StringBuilder sb = new StringBuilder("jid must be a valid user jid; jid=");
            sb.append(this.jid);
            throw new InvalidObjectException(sb.toString());
        }
    }

    public boolean AJT() {
        return !Arrays.equals(this.oldAliceBaseKey, this.A00.A0D(C28851Ya.A02(this.A01)).A01.A00.A05.A04());
    }

    public void Adl(Context context) {
        this.A00 = (C208211s) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class))).AMX.get();
    }
}
