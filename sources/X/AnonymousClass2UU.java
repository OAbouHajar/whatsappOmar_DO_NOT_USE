package X;

import android.os.Handler;
import android.os.Looper;
import java.util.Random;

/* renamed from: X.2UU  reason: invalid class name */
public class AnonymousClass2UU {
    public int A00 = 0;
    public long A01;
    public Runnable A02;
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final C14710pd A04;
    public final C16490t9 A05;
    public final Random A06 = new Random();

    public AnonymousClass2UU(C14710pd r3, C16490t9 r4) {
        this.A05 = r4;
        this.A04 = r3;
    }

    public void A00(Integer num, int i2) {
        if (this.A04.A0E(C16620tM.A02, 1608)) {
            C52582e2 r2 = new C52582e2();
            r2.A00 = num;
            r2.A01 = 0;
            r2.A02 = Long.valueOf(this.A01);
            int i3 = 17;
            if (i2 != 97) {
                i3 = 16;
                if (i2 != 100) {
                    i3 = 13;
                    if (i2 != 103) {
                        i3 = 12;
                        if (i2 != 105) {
                            i3 = 14;
                            if (i2 != 108) {
                                i3 = 2;
                                if (i2 != 117) {
                                    if (i2 == 118) {
                                        i3 = 15;
                                    }
                                    this.A05.A05(r2);
                                }
                            }
                        }
                    }
                }
            }
            r2.A01 = Integer.valueOf(i3);
            this.A05.A05(r2);
        }
    }
}
