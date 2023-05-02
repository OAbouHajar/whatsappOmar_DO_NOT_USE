package X;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.0X2  reason: invalid class name */
public class AnonymousClass0X2 {
    public static int A00 = Integer.MAX_VALUE;
    public static final int A01 = Math.max((int) (((float) Runtime.getRuntime().availableProcessors()) * 1.5f), 3);
    public static final Handler A02 = AnonymousClass000.A0L();
    public static volatile AnonymousClass0OG A03;

    public static AnonymousClass0OG A00() {
        if (A03 == null) {
            synchronized (AnonymousClass0X2.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass0OG(A01);
                }
            }
        }
        return A03;
    }

    public static void A01(C10670hV r3) {
        int i2 = A00;
        A00 = i2 - 1;
        r3.A00 = ((long) i2) << 32;
        r3.A02 = null;
        r3.A01 = 0;
        A00().A00.add(r3);
    }

    public static void A02(String str) {
        BlockingQueue<C10670hV> blockingQueue = A00().A00;
        for (C10670hV r1 : blockingQueue) {
            if (str.equals(r1.A02)) {
                blockingQueue.remove(r1);
                r1.A00();
            }
        }
    }
}
