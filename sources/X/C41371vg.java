package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Iterator;

/* renamed from: X.1vg  reason: invalid class name and case insensitive filesystem */
public class C41371vg extends Handler {
    public final /* synthetic */ AnonymousClass11A A00;
    public final /* synthetic */ AnonymousClass17E A01;
    public final /* synthetic */ C19150xq A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41371vg(Looper looper, AnonymousClass11A r2, AnonymousClass17E r3, C19150xq r4) {
        super(looper);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        C16740tZ r6;
        int i2 = message.what;
        Object obj = message.obj;
        if (i2 == 11) {
            r6 = (C16740tZ) ((Pair) obj).second;
        } else {
            C16740tZ r7 = (C16740tZ) obj;
            r6 = null;
            if (i2 != 2) {
                switch (i2) {
                    case 10:
                        C19150xq r62 = this.A02;
                        for (C18940xV A012 : r62.A01()) {
                            r62.A00++;
                            A012.A01(r7);
                        }
                        return;
                    case 11:
                        break;
                    case 12:
                        AnonymousClass11A r1 = this.A00;
                        C15830rv r0 = r7.A11.A00;
                        AnonymousClass00B.A06(r0);
                        AnonymousClass00B.A06(r0);
                        Iterator it = r1.A01().iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                        return;
                    case 13:
                        AnonymousClass11A r12 = this.A00;
                        C15830rv r02 = r7.A11.A00;
                        AnonymousClass00B.A06(r02);
                        AnonymousClass00B.A06(r02);
                        Iterator it2 = r12.A01().iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                        return;
                    case 14:
                        C19150xq r5 = this.A02;
                        Iterator it3 = r5.A01().iterator();
                        while (it3.hasNext()) {
                            it3.next();
                            r5.A00++;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                this.A01.A01(r7, message.arg1);
                return;
            }
        }
        C19150xq r72 = this.A02;
        if (r6 != null) {
            for (C18940xV r4 : r72.A01()) {
                r72.A00++;
                if (r4 instanceof C19300yD) {
                    ((C19300yD) r4).A0p.A02(r6, 3);
                }
            }
        }
    }
}
