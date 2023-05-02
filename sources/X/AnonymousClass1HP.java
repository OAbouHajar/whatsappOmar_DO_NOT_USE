package X;

import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.whatsapp.util.Log;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1HP  reason: invalid class name */
public class AnonymousClass1HP {
    public final C16440t3 A00;
    public final C15860rz A01;
    public final C16820th A02;
    public final AnonymousClass18B A03;
    public final C14710pd A04;
    public final C18210wK A05;
    public final C23021Ae A06;
    public final C16320sq A07;
    public final AtomicBoolean A08 = new AtomicBoolean(false);

    public AnonymousClass1HP(C16440t3 r3, C15860rz r4, C16820th r5, AnonymousClass18B r6, C14710pd r7, C18210wK r8, C23021Ae r9, C16320sq r10) {
        this.A00 = r3;
        this.A04 = r7;
        this.A07 = r10;
        this.A05 = r8;
        this.A02 = r5;
        this.A01 = r4;
        this.A06 = r9;
        this.A03 = r6;
    }

    public final void A00(LinkedList linkedList, Random random) {
        int size;
        C31781f1 A022;
        StringBuilder sb = new StringBuilder("ThumbnailAutoDownload/enqueueThumbnailAutodownloadsToRetry num remaining:");
        sb.append(linkedList.size());
        Log.i(sb.toString());
        int i2 = 0;
        while (!linkedList.isEmpty()) {
            C23021Ae r6 = this.A06;
            synchronized (r6) {
                size = r6.A01.size();
            }
            if (i2 >= 20 || size - i2 > 5) {
                linkedList.size();
                this.A07.Ad4(new RunnableRunnableShape1S0300000_I0_1(this, linkedList, random, 24), "ThumbnailAutoDownload/enqueue", (long) (random.nextInt(5000) + 5000));
                return;
            }
            C16740tZ A002 = this.A02.A00(((Number) linkedList.pop()).longValue());
            if (A002 != null && !A002.A11.A02 && A01(A002)) {
                if (A002 instanceof C16730tY) {
                    C16750ta r0 = ((C16730tY) A002).A02;
                    AnonymousClass00B.A06(r0);
                    String str = r0.A0I;
                    if (!(str == null || (A022 = this.A05.A0J.A02(str, 3)) == null)) {
                        long A003 = this.A00.A00();
                        long j2 = A022.A06;
                        long j3 = A003 - j2;
                        if (j3 < 86400000 && j3 < (j2 - A022.A0C) * 2) {
                        }
                    }
                }
                r6.A06(A002, 1);
                i2++;
            }
        }
        this.A08.set(false);
    }

    public final boolean A01(C16740tZ r5) {
        if (r5.A0U == null) {
            return false;
        }
        C14710pd r2 = this.A04;
        return (r2.A0E(C16620tM.A02, 250) && (r5 instanceof C38631rA)) || AnonymousClass20D.A00(this.A00, this.A01, r2, r5) || (r5 instanceof C30581cc);
    }
}
