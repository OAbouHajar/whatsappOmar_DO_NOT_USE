package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.1vh  reason: invalid class name and case insensitive filesystem */
public class C41381vh extends Handler {
    public final /* synthetic */ AnonymousClass17Z A00;
    public final /* synthetic */ C15810rt A01;
    public final /* synthetic */ AnonymousClass17E A02;
    public final /* synthetic */ C19150xq A03;
    public final /* synthetic */ AnonymousClass11G A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41381vh(Looper looper, AnonymousClass17Z r2, C15810rt r3, AnonymousClass17E r4, C19150xq r5, AnonymousClass11G r6) {
        super(looper);
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r3;
    }

    public void handleMessage(Message message) {
        C15830rv r2;
        AnonymousClass17Z r1;
        int i2 = message.what;
        if (i2 == 1) {
            r1 = this.A00;
            r2 = C15830rv.A02((String) message.obj);
            AnonymousClass00B.A06(r2);
        } else if (i2 == 2) {
            r2 = C15830rv.A02((String) message.obj);
            AnonymousClass00B.A06(r2);
            this.A03.A05(r2);
            r1 = this.A00;
        } else if (i2 == 8) {
            AnonymousClass11G r0 = this.A04;
            r0.A0B();
            r0.A08.clear();
            C19150xq r3 = this.A03;
            r3.A05(C34771kq.A00);
            for (C15830rv r12 : this.A01.A0B()) {
                r3.A05(r12);
                this.A00.A03(r12, true);
            }
            return;
        } else if (i2 == 9) {
            AnonymousClass11G r02 = this.A04;
            r02.A0B();
            r02.A08.clear();
            C19150xq r6 = this.A03;
            r6.A05(C34771kq.A00);
            C15810rt r5 = this.A01;
            for (C15830rv r22 : r5.A0B()) {
                if (!C16030sJ.A0N(r22)) {
                    synchronized (r5) {
                        if (r22 != null) {
                            r5.A0C().remove(r22);
                        }
                    }
                    AnonymousClass17Z r13 = this.A00;
                    r13.A05.A0B(r22);
                    AnonymousClass11A r03 = r13.A07;
                    r03.A04();
                    r03.A07(r22);
                } else {
                    this.A00.A03(r22, true);
                }
                r6.A05(r22);
            }
            return;
        } else {
            return;
        }
        r1.A03(r2, false);
    }
}
