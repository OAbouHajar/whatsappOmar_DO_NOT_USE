package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;
import java.util.HashMap;

/* renamed from: X.2Fe  reason: invalid class name and case insensitive filesystem */
public class C46622Fe extends Handler {
    public final HashMap A00 = new HashMap();
    public final /* synthetic */ AnonymousClass1H8 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46622Fe(Looper looper, AnonymousClass1H8 r3) {
        super(looper);
        this.A01 = r3;
    }

    public final void A00(C15830rv r4, boolean z2) {
        if (!hasMessages(0, r4) && !hasMessages(3, r4)) {
            if (!hasMessages(2, r4)) {
                AnonymousClass1H8 r1 = this.A01;
                if (r1.A01.A05 && (z2 || hasMessages(5, r4))) {
                    AnonymousClass1H8.A00(r1, r4);
                }
            }
            removeMessages(4, r4);
            removeMessages(5, r4);
        }
    }

    public void handleMessage(Message message) {
        Message message2;
        long j2;
        int i2 = message.what;
        if (i2 == 0) {
            C15830rv r8 = (C15830rv) message.obj;
            int i3 = message.arg2;
            AnonymousClass1H8 r9 = this.A01;
            boolean A0E = r9.A02.A0E(C16620tM.A02, 2757);
            if (!hasMessages(1, r8) && !hasMessages(4, r8)) {
                removeMessages(0, r8);
                if (hasMessages(2, r8) || hasMessages(5, r8)) {
                    HashMap hashMap = this.A00;
                    Number number = (Number) hashMap.get(r8);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (number != null && currentTimeMillis - number.longValue() > 10000 && r9.A01.A05) {
                        AnonymousClass1H8.A01(r9, r8, i3);
                        hashMap.put(r8, Long.valueOf(currentTimeMillis));
                    }
                    removeMessages(2, r8);
                    message2 = obtainMessage(2, 0, 0, r8);
                    j2 = 2500;
                } else {
                    if (r9.A01.A05) {
                        AnonymousClass1H8.A01(r9, r8, i3);
                        this.A00.put(r8, Long.valueOf(System.currentTimeMillis()));
                    }
                    removeMessages(2, r8);
                    message2 = obtainMessage(2, 0, 0, r8);
                    j2 = 2500;
                }
                if (A0E) {
                    C27671Sr r3 = r9.A03;
                    if (C16030sJ.A0L(r8)) {
                        r3.A06.Acl(new RunnableRunnableShape8S0200000_I0_6(r3, 41, r8));
                    }
                } else {
                    r9.A04.A00(r8);
                }
                removeMessages(2, r8);
                message2 = obtainMessage(2, 0, 0, r8);
                j2 = 2500;
            } else {
                return;
            }
        } else if (i2 == 1 || i2 == 2) {
            C15830rv r2 = (C15830rv) message.obj;
            if (!hasMessages(0, r2) && !hasMessages(3, r2)) {
                if (!hasMessages(5, r2)) {
                    AnonymousClass1H8 r1 = this.A01;
                    if (r1.A01.A05) {
                        AnonymousClass1H8.A00(r1, r2);
                    }
                }
                removeMessages(1, r2);
                removeMessages(2, r2);
                return;
            }
            return;
        } else if (i2 == 3) {
            C15830rv r32 = (C15830rv) message.obj;
            int i4 = message.arg2;
            if (!hasMessages(1, r32) && !hasMessages(4, r32)) {
                if (!hasMessages(2, r32)) {
                    AnonymousClass1H8 r12 = this.A01;
                    if (r12.A01.A05) {
                        AnonymousClass1H8.A01(r12, r32, i4);
                    }
                }
                message2 = obtainMessage(5, 0, 0, r32);
                j2 = AnonymousClass1NO.A0L;
            } else {
                return;
            }
        } else if (i2 == 4) {
            A00((C15830rv) message.obj, false);
            return;
        } else if (i2 == 5) {
            A00((C15830rv) message.obj, true);
            return;
        } else {
            return;
        }
        sendMessageDelayed(message2, j2);
    }
}
