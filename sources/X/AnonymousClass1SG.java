package X;

import android.os.Message;

/* renamed from: X.1SG  reason: invalid class name */
public class AnonymousClass1SG implements C19420yP {
    public C18380wb A00;
    public final C19090xk A01;

    public AnonymousClass1SG(C18380wb r1, C19090xk r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public int[] ACW() {
        return new int[]{150, 192, 193, 197};
    }

    public boolean AHS(Message message, int i2) {
        if (!(i2 == 150 || i2 == 197)) {
            if (i2 != 192) {
                if (i2 != 193) {
                    return false;
                }
            } else if ("terminate".equals(((C51742cC) message.obj).A01.tag)) {
                this.A01.A0s.A01();
            }
        }
        this.A00.A00(new C204710g(Message.obtain(message), "receive_message"));
        return true;
    }
}
