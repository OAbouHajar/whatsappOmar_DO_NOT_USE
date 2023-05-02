package X;

import com.whatsapp.util.Log;

/* renamed from: X.1sQ  reason: invalid class name and case insensitive filesystem */
public final class C39401sQ extends AnonymousClass1WU {
    public int A00;

    public C39401sQ(C28381Vw r2, long j2) {
        super(r2, 60, j2);
    }

    public synchronized void A0k(String str) {
        try {
            this.A00 = Integer.valueOf(str).intValue();
        } catch (NumberFormatException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("FMessageSystemEphemeralSettingNotApplied/setData cannot convert data to int, data=");
            sb.append(str);
            Log.w(sb.toString(), e2);
            this.A00 = 0;
        }
        return;
    }
}
