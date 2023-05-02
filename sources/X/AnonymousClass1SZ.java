package X;

import android.os.Message;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;

/* renamed from: X.1SZ  reason: invalid class name */
public class AnonymousClass1SZ implements C19420yP {
    public final C17670vS A00;
    public final C16320sq A01;

    public AnonymousClass1SZ(C17670vS r1, C16320sq r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public int[] ACW() {
        return new int[]{101};
    }

    public boolean AHS(Message message, int i2) {
        if (i2 != 101) {
            return false;
        }
        this.A01.Acl(new RunnableRunnableShape0S1100000_I0(33, (String) message.obj, this));
        return true;
    }
}
