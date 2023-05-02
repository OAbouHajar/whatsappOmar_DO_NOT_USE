package X;

import android.content.Context;

/* renamed from: X.1Xk  reason: invalid class name and case insensitive filesystem */
public class C28731Xk {
    public static final String A04 = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY, %s TEXT NOT NULL, %s INTEGER DEFAULT 0);", new Object[]{"queue", "_id", "item", "encrypted"});
    public final Context A00;
    public final C48542Nt A01;
    public final C28771Xo A02;
    public final C28761Xn A03;

    public C28731Xk(Context context, C48542Nt r5, C28771Xo r6) {
        StringBuilder sb = new StringBuilder("_jobqueue-");
        sb.append("OBWhatsAppJobManager");
        this.A03 = new C28761Xn(context, sb.toString());
        this.A00 = context;
        this.A01 = r5;
        this.A02 = r6;
    }
}
