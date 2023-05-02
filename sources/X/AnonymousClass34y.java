package X;

import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape20S0100000_I1_3;
import com.obwhatsapp.R;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.34y  reason: invalid class name */
public class AnonymousClass34y extends C41841wk implements AnonymousClass5S9 {
    public float A00 = 0.0f;
    public C56482nj A01 = null;
    public boolean A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A06 = false;
    public boolean A07 = false;
    public final AnonymousClass1P6 A08;
    public final C38701rH A09;
    public final AnonymousClass3OC A0A;
    public final AnonymousClass1PA A0B;
    public final C1035651w A0C;
    public final C23231Az A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass34y(C17100uX r12, AnonymousClass1P6 r13, C14870pt r14, AnonymousClass2Ao r15, AnonymousClass01V r16, AnonymousClass013 r17, AnonymousClass1P8 r18, C16740tZ r19, AnonymousClass4Ta r20, AnonymousClass1PA r21, C23231Az r22) {
        super(r12, r14, r16, r17, r18, r20);
        C16740tZ r3 = r19;
        AnonymousClass00B.A06(r3);
        C38701rH r32 = (C38701rH) r3;
        this.A09 = r32;
        AnonymousClass3OC r2 = new AnonymousClass3OC(A01());
        r2.setMessage(r32, r15);
        this.A0A = r2;
        this.A0B = r21;
        this.A08 = r13;
        this.A0D = r22;
        this.A0C = new C1035651w(r32, r2.A01);
        r2.setId(R.id.status_playback_voice);
    }

    public long A08() {
        return TimeUnit.SECONDS.toMillis((long) this.A09.A00);
    }

    public void A09() {
        C16750ta r0;
        File file;
        this.A07 = false;
        this.A06 = false;
        this.A00 = 0.0f;
        this.A03 = false;
        AnonymousClass1PA r3 = this.A0B;
        List list = r3.A04;
        if (list == null) {
            list = AnonymousClass000.A0u();
            r3.A04 = list;
        }
        list.add(this);
        if (!(this.A01 != null || (r0 = this.A09.A02) == null || (file = r0.A0F) == null)) {
            C16150sX r02 = this.A08.A00.A01;
            C16980tz A0V = C16150sX.A0V(r02);
            C14710pd A0k = C16150sX.A0k(r02);
            C16300so A002 = C16150sX.A00(r02);
            C16440t3 A0U = C16150sX.A0U(r02);
            new AnonymousClass47X();
            C56482nj r4 = new C56482nj(A002, A0U, A0V, A0k, this, file);
            this.A01 = r4;
            if (r4.A02 == null) {
                r4.start();
                Handler handler = new Handler(r4.getLooper());
                r4.A02 = handler;
                handler.post(new RunnableRunnableShape20S0100000_I1_3(r4, 11));
                r4.A02.post(new RunnableRunnableShape20S0100000_I1_3(r4, 9));
            }
        }
        if (!this.A02 && this.A05.A00.A05) {
            this.A02 = true;
            r3.A03(this);
        }
        this.A0D.A02(R.string.str1834);
    }

    public void A0A() {
        C56482nj r3 = this.A01;
        if (r3 != null) {
            Handler handler = r3.A02;
            if (handler != null) {
                handler.post(new RunnableRunnableShape20S0100000_I1_3(r3, 12));
            }
            this.A01 = null;
        }
        AnonymousClass1PA r1 = this.A0B;
        r1.A02(this);
        this.A02 = false;
        List list = r1.A04;
        if (list != null) {
            list.remove(this);
        }
        this.A07 = true;
    }

    public final void A0B(boolean z2) {
        C56482nj r3;
        C56482nj r32;
        Handler handler;
        int i2;
        Handler handler2;
        if (this.A03 && (r3 = this.A01) != null) {
            if (z2) {
                C23231Az r6 = this.A0D;
                if (System.currentTimeMillis() - r6.A00 > 2000) {
                    r6.A00 = System.currentTimeMillis();
                    r6.A02.A09(R.string.str1834, 0);
                }
                r32 = this.A01;
                handler = r32.A02;
                if (handler != null) {
                    i2 = 7;
                }
            } else {
                if (this.A05 && (handler2 = r3.A02) != null) {
                    handler2.post(new RunnableRunnableShape20S0100000_I1_3(r3, 13));
                }
                r32 = this.A01;
                handler = r32.A02;
                if (handler != null) {
                    i2 = 5;
                }
            }
            handler.post(new RunnableRunnableShape20S0100000_I1_3(r32, i2));
        }
        this.A05 = z2;
    }

    public void AMp(boolean z2) {
        A0B(false);
    }

    public void AMt(int i2, int i3, int i4) {
    }
}
