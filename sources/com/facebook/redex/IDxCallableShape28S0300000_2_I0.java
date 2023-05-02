package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass39S;
import X.C208211s;
import X.C28551Wn;
import X.C28851Ya;
import X.C28861Yb;
import X.C30821d1;
import X.C36381nS;
import X.C809546g;
import com.obwhatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.obwhatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import java.util.concurrent.Callable;

public class IDxCallableShape28S0300000_2_I0 implements Callable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCallableShape28S0300000_2_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final Object call() {
        C36381nS A09;
        switch (this.A03) {
            case 0:
                DeviceJid deviceJid = (DeviceJid) this.A01;
                C208211s r2 = ((AnonymousClass39S) this.A00).A08;
                AnonymousClass00B.A0B("no session with deviceJid", r2.A0d(C28851Ya.A02(deviceJid)));
                A09 = r2.A09(C28851Ya.A02(deviceJid), ((C28551Wn) this.A02).A02());
                break;
            case 1:
                A09 = ((SendLiveLocationKeyJob) this.A00).A02.A09(C28851Ya.A02(DeviceJid.of((Jid) this.A01)), ((C28551Wn) this.A02).A02());
                break;
            default:
                C28861Yb A022 = C28851Ya.A02((DeviceJid) this.A01);
                A09 = ((SendPeerMessageJob) this.A00).A03.A09(A022, (byte[]) this.A02);
                break;
        }
        return new C30821d1(A09.A02, 2, C809546g.A00(A09.A00));
    }
}
