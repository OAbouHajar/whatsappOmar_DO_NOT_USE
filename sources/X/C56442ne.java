package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.2ne  reason: invalid class name and case insensitive filesystem */
public class C56442ne extends Handler {
    public final /* synthetic */ AnonymousClass2DT A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56442ne(Looper looper, AnonymousClass2DT r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        AnonymousClass2DT r7 = this.A00;
        C30211bx r0 = r7.A0P;
        if (r0 == null) {
            return;
        }
        if (r0.A0D()) {
            int A03 = r7.A03();
            r7.A04 = A03;
            C52032cr r02 = r7.A0K;
            if (r02 != null && r7.A0L(r02.AC8())) {
                r7.A0K.AVL(A03);
            }
            if (r7.A0Y) {
                AnonymousClass1B4 r8 = r7.A0l;
                if (r8.A0C.A00 == r7) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - r8.A00 >= 1000) {
                        r8.A01(r7);
                        r8.A00 = currentTimeMillis;
                    }
                }
            }
            AnonymousClass5PL r82 = r7.A0L;
            if (r82 != null && r7.A0I == null) {
                int i2 = r7.A07 + 1;
                r7.A07 = i2;
                byte[] bArr = AnonymousClass2DT.A0z;
                if (bArr == null) {
                    bArr = new byte[128];
                    AnonymousClass2DT.A0z = bArr;
                    int i3 = 0;
                    do {
                        double d2 = ((double) i3) * 3.141592653589793d;
                        double d3 = (double) 128;
                        bArr[i3] = (byte) ((int) ((Math.sin((32.0d * d2) / d3) * Math.abs(Math.sin((4.0d * d2) / d3)) * Math.abs(Math.sin((d2 * 1.0d) / d3)) * 64.0d) + 128.0d));
                        i3++;
                    } while (i3 < 128);
                }
                if (i2 % 4 == 0) {
                    for (int i4 = 0; i4 < bArr.length; i4++) {
                        bArr[i4] = (byte) (256 - bArr[i4]);
                    }
                }
                r82.AZm(bArr);
            }
            sendEmptyMessageDelayed(0, 50);
        } else if (!r7.A0U) {
            r7.A0I(true, false);
        }
    }
}
