package X;

import android.os.Message;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape0S1300000_I0;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.1SW  reason: invalid class name */
public class AnonymousClass1SW implements C19420yP {
    public final AnonymousClass1CY A00;
    public final C207811o A01;

    public AnonymousClass1SW(AnonymousClass1CY r1, C207811o r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public int[] ACW() {
        return new int[]{212};
    }

    public boolean AHS(Message message, int i2) {
        if (i2 != 212) {
            return false;
        }
        Object obj = message.obj;
        AnonymousClass00B.A06(obj);
        C30641ci r6 = (C30641ci) obj;
        C30831d2 A002 = this.A01.A00(1, r6.A00);
        if (A002 != null) {
            A002.A00(3);
        }
        AnonymousClass1CY r4 = this.A00;
        DeviceJid of = DeviceJid.of(r6.A01);
        String str = r6.A07;
        if (of == null || TextUtils.isEmpty(str)) {
            return true;
        }
        r4.A0I.Acl(new RunnableRunnableShape0S1300000_I0(5, str, r4, of, r6));
        return true;
    }
}
