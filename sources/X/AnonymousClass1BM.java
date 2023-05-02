package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1BM  reason: invalid class name */
public class AnonymousClass1BM {
    public static final C31701et A06 = new C31701et(13);
    public static final C31701et A07 = new C31701et(0);
    public static final C31701et A08 = new C31701et(21);
    public C16730tY A00;
    public Integer A01;
    public final C14710pd A02;
    public final C209212c A03;
    public final ArrayList A04 = new ArrayList();
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();

    public AnonymousClass1BM(C14710pd r2, C209212c r3) {
        this.A02 = r2;
        this.A03 = r3;
    }

    public final void A00(C16730tY r3, int i2) {
        Integer num;
        StringBuilder sb = new StringBuilder("statusdownload/queue-status-download ");
        sb.append(r3.A11.A01);
        sb.append(" ");
        sb.append(r3.A0B());
        sb.append(", mode = ");
        sb.append(i2);
        Log.i(sb.toString());
        if (!r3.equals(this.A00) || ((num = this.A01) != null && i2 < num.intValue())) {
            this.A00 = r3;
            this.A01 = Integer.valueOf(i2);
            this.A03.A07(new C102664zK(r3, this), r3, i2);
        }
    }
}
