package com.facebook.redex;

import X.AnonymousClass0QU;
import X.AnonymousClass29T;
import X.AnonymousClass5OI;
import X.C108365Nr;
import X.C108375Ns;
import X.C108955Qd;
import X.C63933Mc;
import X.C79193zM;
import X.C84234Jt;
import X.C86294Sb;
import X.C87304Wf;
import X.C89414c8;
import X.C97684qO;
import android.os.Handler;
import android.os.Message;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callgrid.viewmodel.OrientationViewModel;
import com.obwhatsapp.profile.SetAboutInfo;
import java.util.Iterator;

public class IDxCallbackShape188S0100000_2_I1 implements Handler.Callback {
    public Object A00;
    public final int A01;

    public IDxCallbackShape188S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean handleMessage(Message message) {
        switch (this.A01) {
            case 0:
                C87304Wf r3 = (C87304Wf) this.A00;
                int i2 = message.what;
                if (i2 == 0) {
                    Iterator it = r3.A07.iterator();
                    while (it.hasNext()) {
                        AnonymousClass0QU r5 = (AnonymousClass0QU) it.next();
                        AnonymousClass5OI r4 = r3.A04;
                        C108375Ns r2 = r3.A03;
                        if (!r5.A02 && r5.A01) {
                            C86294Sb r1 = r5.A00;
                            r5.A00 = (C86294Sb) r4.get();
                            r5.A01 = false;
                            r2.AIY(r1, r5.A03);
                        }
                        if (((C97684qO) r3.A02).A00.hasMessages(0)) {
                            return true;
                        }
                    }
                    return true;
                } else if (i2 != 1) {
                    return true;
                } else {
                    r3.A02((C108365Nr) message.obj, message.arg1);
                    r3.A00();
                    r3.A01();
                    return true;
                }
            case 1:
                if (message.what != 0) {
                    return false;
                }
                C89414c8 r32 = (C89414c8) this.A00;
                C84234Jt r22 = (C84234Jt) message.obj;
                synchronized (r32.A03) {
                    if (r32.A00 == r22 || r32.A01 == r22) {
                        r32.A06(r22, 2);
                    }
                }
                return true;
            case 2:
                C63933Mc r23 = (C63933Mc) this.A00;
                if (message.what != 1) {
                    return true;
                }
                OrientationViewModel.A02(r23.A02, r23.A00);
                return true;
            case 3:
                SetAboutInfo setAboutInfo = (SetAboutInfo) this.A00;
                if (message.what == 1) {
                    setAboutInfo.A01.A02((String) message.obj, (String) null);
                } else {
                    setAboutInfo.A05.A09(R.string.str0b7a, 0);
                }
                AnonymousClass29T.A00(setAboutInfo, 2);
                return true;
            default:
                C79193zM r12 = (C79193zM) this.A00;
                r12.A02.A02();
                C108955Qd r0 = r12.A01;
                if (r0 == null) {
                    return true;
                }
                r0.AOy(r12);
                return true;
        }
    }
}
