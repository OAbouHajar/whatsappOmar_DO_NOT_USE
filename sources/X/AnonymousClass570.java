package X;

import com.whatsapp.jid.Jid;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.570  reason: invalid class name */
public class AnonymousClass570 implements Comparator {
    public final AnonymousClass01D A00;

    public AnonymousClass570(AnonymousClass013 r4) {
        this.A00 = new AnonymousClass01T((Object) null, new AnonymousClass58Z(this, r4));
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C15840rx r5 = (C15840rx) obj;
        C15840rx r6 = (C15840rx) obj2;
        int i2 = 0;
        if (r5 != null) {
            if (r6 != null) {
                String A06 = r5.A06();
                String A062 = r6.A06();
                if (A06 == null) {
                    return A062 == null ? 0 : -1;
                }
                if (A062 != null) {
                    i2 = ((Collator) this.A00.get()).compare(A06, A062);
                    if (i2 == 0) {
                        return r5.A05().compareTo((Jid) r6.A05());
                    }
                }
            }
            return 1;
        } else if (r6 == null) {
            return i2;
        } else {
            return -1;
        }
        return i2;
    }
}
