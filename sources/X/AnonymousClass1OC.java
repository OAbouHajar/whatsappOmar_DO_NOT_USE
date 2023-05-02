package X;

import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1OC  reason: invalid class name */
public class AnonymousClass1OC implements C23541Cj {
    public final AnonymousClass1OB A00;

    public AnonymousClass1OC(AnonymousClass1OB r1) {
        this.A00 = r1;
    }

    public void APJ() {
        AnonymousClass1OB r6 = this.A00;
        List<C35641mG> A002 = r6.A00();
        ArrayList arrayList = new ArrayList();
        for (C35641mG r7 : A002) {
            if (((double) (((int) (System.currentTimeMillis() - r7.A00)) / 86400000)) > 90.0d) {
                arrayList.add(r7);
            }
        }
        A002.removeAll(arrayList);
        r6.A05.Acl(new RunnableRunnableShape3S0200000_I0_1(r6, 32, A002));
    }

    public /* synthetic */ void APK() {
    }
}
