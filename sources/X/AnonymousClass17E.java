package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape0S0201000_I0;

/* renamed from: X.17E  reason: invalid class name */
public class AnonymousClass17E {
    public final Handler A00;
    public final Handler A01;
    public final Handler A02;
    public final AnonymousClass17Z A03;
    public final C19150xq A04;
    public final AnonymousClass17Y A05;

    public AnonymousClass17E(AnonymousClass17Z r8, C15810rt r9, AnonymousClass11A r10, C19150xq r11, AnonymousClass11G r12, AnonymousClass17Y r13) {
        this.A03 = r8;
        this.A04 = r11;
        this.A05 = r13;
        this.A00 = new C41361vf(Looper.getMainLooper(), r8, this, r11);
        this.A02 = new C41371vg(Looper.getMainLooper(), r10, this, r11);
        Looper mainLooper = Looper.getMainLooper();
        this.A01 = new C41381vh(mainLooper, r8, r9, this, r11, r12);
    }

    public void A00(C16740tZ r4, int i2) {
        this.A02.post(new RunnableRunnableShape0S0201000_I0((Object) this, i2, (Object) r4, 22));
    }

    public void A01(C16740tZ r4, int i2) {
        this.A04.A08(r4, i2);
        AnonymousClass17Z r2 = this.A03;
        C15830rv r1 = r4.A11.A00;
        AnonymousClass00B.A06(r1);
        r2.A03(r1, false);
        AnonymousClass1Vt r12 = r4.A0L;
        if (r12 != null) {
            this.A05.A04(r12);
        }
    }
}
