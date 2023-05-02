package X;

import com.whatsapp.util.Log;
import java.util.Timer;

/* renamed from: X.1ul  reason: invalid class name and case insensitive filesystem */
public abstract class C40831ul {
    public static Timer A02 = new Timer();
    public boolean A00;
    public final AnonymousClass5CS A01;

    public C40831ul() {
        AnonymousClass5CS r1 = new AnonymousClass5CS(this);
        this.A01 = r1;
        A02.schedule(r1, 20000);
    }

    public void A00() {
        int i2;
        if (this instanceof C47682Jy) {
            C47682Jy r3 = (C47682Jy) this;
            StringBuilder sb = new StringBuilder("groupmgr/group_request/timeout/type:");
            sb.append(r3.A00);
            Log.i(sb.toString());
            r3.A00 = true;
            r3.A02.A08(r3.A01, false);
            return;
        }
        C40821uk r32 = (C40821uk) this;
        StringBuilder sb2 = new StringBuilder("groupmgr/group_request/timeout/type:");
        int i3 = r32.A00;
        sb2.append(i3);
        Log.i(sb2.toString());
        r32.A00 = true;
        if (i3 != 30) {
            if (i3 == 91) {
                i2 = 1005;
            } else if (i3 != 92) {
                switch (i3) {
                    case 15:
                        i2 = 1002;
                        break;
                    case 16:
                        i2 = 1001;
                        break;
                    case 17:
                        i2 = 1007;
                        break;
                }
            } else {
                i2 = 1006;
            }
            C17240ul.A01(i2, r32.A01);
        } else {
            i2 = 1003;
            C17240ul.A01(i2, r32.A01);
        }
        r32.A02.A08(r32.A01, false);
        r32.A01((Integer) null);
    }
}
