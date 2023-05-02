package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.text.Collator;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.26p  reason: invalid class name and case insensitive filesystem */
public class C450026p implements Comparator {
    public final C16080sP A00;
    public final Collator A01;
    public final Map A02 = new HashMap();

    public C450026p(C16080sP r3, AnonymousClass013 r4) {
        this.A00 = r3;
        Collator instance = Collator.getInstance(AnonymousClass013.A00(r4.A00));
        this.A01 = instance;
        instance.setDecomposition(1);
    }

    /* renamed from: A00 */
    public int compare(C16010sH r7, C16010sH r8) {
        String A012 = A01(r7);
        String A013 = A01(r8);
        if (A012 == null && A013 == null) {
            return 0;
        }
        if (A012 != null) {
            if (A013 != null) {
                int compare = this.A01.compare(A012, A013);
                if (compare != 0) {
                    return compare;
                }
                C15830rv r1 = r7.A0E;
                if (r1 == null && r8.A0E == null) {
                    return 0;
                }
                if (r1 != null) {
                    C15830rv r0 = r8.A0E;
                    if (r0 != null) {
                        return r1.compareTo((Jid) r0);
                    }
                }
            }
            return -1;
        }
        return 1;
    }

    public String A01(C16010sH r5) {
        if (r5 == null) {
            return null;
        }
        String str = r5.A0S;
        if (str != null && str.length() > 0) {
            return str;
        }
        if (r5.A0E == null) {
            return null;
        }
        Map map = this.A02;
        Class<UserJid> cls = UserJid.class;
        String str2 = (String) map.get(r5.A08(cls));
        if (str2 != null) {
            return str2;
        }
        String A08 = this.A00.A08(r5);
        map.put(r5.A08(cls), A08);
        return A08;
    }
}
