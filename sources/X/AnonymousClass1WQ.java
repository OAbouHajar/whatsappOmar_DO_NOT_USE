package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1WQ  reason: invalid class name */
public class AnonymousClass1WQ extends AnonymousClass1WR {
    public int A00;

    public AnonymousClass1WQ(C16300so r2) {
        super(r2, (C16740tZ) null);
    }

    public static Jid A00(C16300so r3, Jid jid, Class cls, String str) {
        if (jid == null || cls.isInstance(jid)) {
            return jid;
        }
        StringBuilder sb = new StringBuilder("web-query/failed to cast ");
        sb.append(jid.getClass().getName());
        sb.append(" to ");
        sb.append(cls.getName());
        sb.append("(");
        sb.append(jid);
        sb.append(")@");
        sb.append(str);
        String obj = sb.toString();
        Log.e(obj);
        StringBuilder sb2 = new StringBuilder("web-query/downcast-failure/");
        sb2.append(str);
        r3.AcB(sb2.toString(), obj, false);
        return null;
    }

    public static void A01(C16060sN r1, UserJid userJid, C33241iG r3, C30431cL r4) {
        if (r1 != null) {
            r3.A07(r1.getRawString());
        } else {
            r3.A03();
            C33231iF r12 = (C33231iF) r3.A00;
            r12.A00 &= -2;
            r12.A03 = C33231iF.A05.A03;
        }
        if (userJid != null) {
            r4.A09(userJid.getRawString());
        } else {
            r4.A05();
        }
    }

    public static void A02(C30431cL r2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null) {
                r2.A08(str);
            }
        }
    }
}
