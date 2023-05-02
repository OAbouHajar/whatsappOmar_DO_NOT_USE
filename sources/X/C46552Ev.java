package X;

import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.2Ev  reason: invalid class name and case insensitive filesystem */
public abstract class C46552Ev {
    public final AnonymousClass027 A00 = new AnonymousClass027();
    public final C16250si A01;
    public final C19090xk A02;
    public final AnonymousClass0y3 A03;
    public final AnonymousClass11L A04;
    public final C19760yx A05;
    public final C16320sq A06;

    public C46552Ev(C16250si r2, C19090xk r3, AnonymousClass0y3 r4, AnonymousClass11L r5, C19760yx r6, C16320sq r7) {
        this.A06 = r7;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
    }

    public void A00() {
        if (this instanceof C46542Eu) {
            C46542Eu r1 = (C46542Eu) this;
            Log.i("PrepareDirectTransferMsgStoreHelper/createAndRunPrepareMessageStoreTask");
            C46562Ew r2 = new C46562Ew(r1);
            r1.A00 = r2;
            r1.A06.Ack(r2, new Object[0]);
            return;
        }
        AnonymousClass2RY r6 = (AnonymousClass2RY) this;
        if (r6.A00) {
            RunnableRunnableShape2S0100000_I0_1 runnableRunnableShape2S0100000_I0_1 = new RunnableRunnableShape2S0100000_I0_1(r6, 18);
            RunnableRunnableShape2S0100000_I0_1 runnableRunnableShape2S0100000_I0_12 = new RunnableRunnableShape2S0100000_I0_1(r6, 19);
            C18790xG r7 = r6.A09;
            RunnableRunnableShape0S0300000_I0 runnableRunnableShape0S0300000_I0 = new RunnableRunnableShape0S0300000_I0(r7, runnableRunnableShape2S0100000_I0_12, runnableRunnableShape2S0100000_I0_1, 49);
            File A0D = r6.A01.A0D();
            ArrayList arrayList = new ArrayList();
            for (Object singletonList : C40691uX.A08(C16960tx.A01(), C16960tx.A00())) {
                arrayList.addAll(C40691uX.A07(A0D, Collections.singletonList(singletonList)));
            }
            if (r7.A00(runnableRunnableShape0S0300000_I0, arrayList) != 0) {
                r6.A04.sendEmptyMessageDelayed(1, 32000);
                return;
            }
        }
        r6.A06.Ack(new C51372bW(r6, r6.A0F, r6.A00, r6.A0E), new Object[0]);
    }
}
