package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass2Qx;
import X.AnonymousClass3Ak;
import X.AnonymousClass4V1;
import X.C13680ns;
import X.C16040sK;
import X.C19430yQ;
import X.C28551Wn;
import X.C28851Ya;
import X.C28871Za;
import X.C30821d1;
import X.C30981dH;
import X.C34941l7;
import X.C36381nS;
import X.C809546g;
import com.obwhatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import com.obwhatsapp.jobqueue.job.SendFinalLiveLocationRetryJob;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;

public class IDxCallableShape45S0200000_2_I0 implements Callable {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCallableShape45S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final Object call() {
        switch (this.A02) {
            case 0:
                AnonymousClass2Qx r3 = (AnonymousClass2Qx) this.A00;
                StringBuilder A0r = AnonymousClass000.A0r("voip/CoreVideoPort/ releasing surface texture holder for ");
                A0r.append(r3.A0B);
                C13680ns.A1V(A0r);
                ((AnonymousClass4V1) this.A01).A00();
                AnonymousClass00B.A03(r3.A07);
                r3.A01 = null;
                return C13680ns.A0X();
            case 1:
                return ((AnonymousClass3Ak) this.A00).A02((DeviceJid) this.A01);
            case 2:
                SendFinalLiveLocationNotificationJob sendFinalLiveLocationNotificationJob = (SendFinalLiveLocationNotificationJob) this.A00;
                C16040sK r0 = sendFinalLiveLocationNotificationJob.A00;
                r0.A0B();
                C28871Za r02 = r0.A04;
                AnonymousClass00B.A06(r02);
                return new C30821d1(sendFinalLiveLocationNotificationJob.A01.A0A(new C30981dH(C28851Ya.A02(r02), C34941l7.A00.getRawString()), ((C28551Wn) this.A01).A02()).A02, 2, 3);
            case 3:
                SendFinalLiveLocationRetryJob sendFinalLiveLocationRetryJob = (SendFinalLiveLocationRetryJob) this.A00;
                C36381nS A09 = sendFinalLiveLocationRetryJob.A02.A09(C28851Ya.A02(DeviceJid.getNullable(sendFinalLiveLocationRetryJob.rawDeviceJid)), ((C28551Wn) this.A01).A02());
                return new C30821d1(A09.A02, 2, C809546g.A00(A09.A00));
            case 4:
                C19430yQ r4 = (C19430yQ) this.A00;
                C16040sK r03 = r4.A09;
                r03.A0B();
                C28871Za r04 = r03.A04;
                AnonymousClass00B.A06(r04);
                return new C30821d1(r4.A0I.A0A(new C30981dH(C28851Ya.A02(r04), C34941l7.A00.getRawString()), ((C28551Wn) this.A01).A02()).A02, 2, 3);
            case 5:
                return Integer.valueOf(((VoipPhysicalCamera) this.A00).setVideoPortOnCameraThread((VideoPort) this.A01));
            case 6:
                return ((VoipPhysicalCamera) this.A00).lambda$registerVirtualCamera$6((VoipCamera) this.A01);
            default:
                return ((VoipPhysicalCamera) this.A00).lambda$unregisterVirtualCamera$7((VoipCamera) this.A01);
        }
    }
}
