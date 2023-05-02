package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3Fr  reason: invalid class name and case insensitive filesystem */
public class C62983Fr implements C109415Sa {
    public final /* synthetic */ AnonymousClass3AE A00;

    public C62983Fr(AnonymousClass3AE r1) {
        this.A00 = r1;
    }

    public void AQR(int i2) {
        AnonymousClass3AE r1 = this.A00;
        AnonymousClass3AE.A00(r1, r1.A0H.decrementAndGet());
    }

    public void ASg(Set set) {
        ArrayList A0u = AnonymousClass000.A0u();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (-1 == AnonymousClass000.A0D(pair.second)) {
                Object obj = pair.first;
                AnonymousClass00B.A06(obj);
                A0u.add(obj);
            }
        }
        Iterator it2 = A0u.iterator();
        while (it2.hasNext()) {
            this.A00.A0G.remove(it2.next());
        }
        AnonymousClass3AE r1 = this.A00;
        AnonymousClass3AE.A00(r1, r1.A0H.decrementAndGet());
    }

    public void AYu() {
        AnonymousClass3AE r1 = this.A00;
        AnonymousClass3AE.A00(r1, r1.A0H.decrementAndGet());
    }
}
