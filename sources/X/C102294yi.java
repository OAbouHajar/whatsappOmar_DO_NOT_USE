package X;

import com.whatsapp.jid.Jid;
import java.util.ListIterator;

/* renamed from: X.4yi  reason: invalid class name and case insensitive filesystem */
public class C102294yi implements C16710tV {
    public final AnonymousClass26B A00;
    public final Jid A01;
    public final /* synthetic */ AnonymousClass2Z2 A02;

    public C102294yi(AnonymousClass26B r1, AnonymousClass2Z2 r2, Jid jid) {
        this.A02 = r2;
        this.A00 = r1;
        this.A01 = jid;
    }

    public void AQR(int i2) {
        C109215Rd r0 = this.A02.A09;
        if (r0 != null) {
            r0.ANp(i2);
        }
    }

    public /* bridge */ /* synthetic */ void AYB(Object obj) {
        C87314Wg r5 = (C87314Wg) obj;
        AnonymousClass2Z2 r3 = this.A02;
        if (r3.A09 != null) {
            Jid jid = this.A01;
            if (jid != null) {
                String rawString = jid.getRawString();
                ListIterator listIterator = r5.A07.listIterator();
                while (listIterator.hasNext()) {
                    if (((AnonymousClass1US) listIterator.next()).A0B.equals(rawString)) {
                        listIterator.remove();
                    }
                }
            }
            C61853Aq.A02(this.A00, r5.A07);
            r3.A09.ANq(r5);
        }
    }
}
