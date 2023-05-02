package X;

import android.app.Application;
import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.obwhatsapp.biz.IDxPObserverShape57S0100000_2_I0;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2XA  reason: invalid class name */
public class AnonymousClass2XA extends AnonymousClass02H {
    public final AnonymousClass027 A00 = new AnonymousClass027();
    public final C17150uc A01;
    public final C439822h A02;
    public final AnonymousClass13V A03;
    public final C17030uP A04;
    public final UserJid A05;
    public final C16320sq A06;

    public AnonymousClass2XA(Application application, C17150uc r4, AnonymousClass13V r5, C17030uP r6, UserJid userJid, C16320sq r8) {
        super(application);
        IDxPObserverShape57S0100000_2_I0 iDxPObserverShape57S0100000_2_I0 = new IDxPObserverShape57S0100000_2_I0(this, 0);
        this.A02 = iDxPObserverShape57S0100000_2_I0;
        this.A06 = r8;
        this.A04 = r6;
        this.A01 = r4;
        this.A03 = r5;
        this.A05 = userJid;
        r5.A02(iDxPObserverShape57S0100000_2_I0);
    }

    public static Set A01(List list, List list2) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((C50102Xy) it.next()).A01.A0D);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            hashSet.add(((C50102Xy) it2.next()).A01.A0D);
        }
        return hashSet;
    }

    public void A04() {
        this.A03.A03(this.A02);
    }

    public String A05(AnonymousClass013 r6, List list) {
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = (int) (((long) i2) + ((C50102Xy) it.next()).A00);
        }
        if (i2 == 0) {
            return "";
        }
        if (i2 <= 999) {
            return r6.A0K().format((long) i2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r6.A0K().format(999));
        sb.append("+");
        return sb.toString();
    }

    public void A06() {
        this.A06.Acl(new RunnableRunnableShape3S0100000_I0_2(this, 46));
    }
}
