package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1O8  reason: invalid class name */
public class AnonymousClass1O8 {
    public final AnonymousClass1SQ A00;
    public final C216314v A01;
    public final C16900tq A02;

    public AnonymousClass1O8(AnonymousClass1SQ r1, C216314v r2, C16900tq r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void A00(C16810tg r6, int i2) {
        try {
            r6.A01("conversion_tuples", "jid_row_id=?", new String[]{String.valueOf(i2)});
            UserJid of = UserJid.of(this.A01.A03((long) i2));
            if (of != null) {
                for (C33511ih r0 : this.A00.A01()) {
                    C19700yr r02 = r0.A00;
                    r02.A02.A00("click_to_whatsapp_ads_log_trackers").edit().remove(of.getRawString()).apply();
                }
            }
        } catch (Exception e2) {
            Log.e("conversionTupleMessageStore/deleteConversionTuple error accessing db", e2);
        }
    }
}
