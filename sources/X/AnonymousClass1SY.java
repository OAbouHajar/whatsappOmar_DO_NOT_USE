package X;

import android.os.Message;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;

/* renamed from: X.1SY  reason: invalid class name */
public class AnonymousClass1SY implements C19420yP {
    public final AnonymousClass1SX A00;
    public final AnonymousClass124 A01;
    public final C207811o A02;
    public final C16320sq A03;

    public AnonymousClass1SY(AnonymousClass1SX r1, AnonymousClass124 r2, C207811o r3, C16320sq r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public int[] ACW() {
        return new int[]{221};
    }

    public boolean AHS(Message message, int i2) {
        if (i2 != 221) {
            return false;
        }
        Object obj = message.obj;
        AnonymousClass00B.A06(obj);
        C30641ci r4 = (C30641ci) obj;
        C30831d2 A002 = this.A02.A00(1, r4.A00);
        if (A002 != null) {
            A002.A00(3);
        }
        this.A03.Acl(new RunnableRunnableShape9S0200000_I0_7(this, 4, r4));
        return true;
    }
}
