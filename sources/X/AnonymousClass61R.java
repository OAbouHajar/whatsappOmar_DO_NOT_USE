package X;

import com.obwhatsapp.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.61R  reason: invalid class name */
public class AnonymousClass61R implements C47252If {
    public final /* synthetic */ C111325fm A00;

    public AnonymousClass61R(C111325fm r1) {
        this.A00 = r1;
    }

    public void AMZ(C35361lo r10, File file) {
        C111325fm r7 = this.A00;
        List list = r7.A0K;
        synchronized (list) {
            ArrayList A0n = C13680ns.A0n(list);
            Iterator it = A0n.iterator();
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C35361lo r8 = ((C118275uQ) it.next()).A03;
                if (r8 != null) {
                    String str = r8.A0F;
                    String str2 = r10.A0F;
                    if (str.equals(str2)) {
                        C118275uQ r1 = new C118275uQ(r8);
                        if (file != null) {
                            r1.A00 = true;
                        } else {
                            r1.A00 = false;
                            r1.A01 = true;
                        }
                        C35361lo r0 = r7.A08;
                        if (r0 != null && str2.equals(r0.A0F)) {
                            z2 = true;
                        }
                        r1.A02 = z2;
                        A0n.set(i2, r1);
                        r7.A09.A0E(A0n);
                        list.set(i2, r1);
                    }
                }
                i2++;
            }
        }
    }

    public void AQQ() {
        this.A00.A01.postDelayed(new C1210964e(this), 2000);
    }

    public /* bridge */ /* synthetic */ void ATm(Object obj) {
        boolean z2;
        List<C35361lo> list = (List) obj;
        C111325fm r5 = this.A00;
        r5.A05.setVisibility(0);
        List list2 = r5.A0K;
        synchronized (list2) {
            r5.A09.A01 = r5.A08;
            list2.clear();
            C118275uQ r1 = new C118275uQ((C35361lo) null);
            r1.A00 = true;
            r1.A02 = AnonymousClass000.A1W(r5.A08);
            list2.add(r1);
            for (C35361lo r3 : list) {
                C118275uQ r2 = new C118275uQ(r3);
                C35361lo r0 = r5.A08;
                if (r0 != null) {
                    boolean equals = r0.A0F.equals(r3.A0F);
                    z2 = true;
                    if (equals) {
                        r2.A02 = z2;
                        list2.add(r2);
                    }
                }
                z2 = false;
                r2.A02 = z2;
                list2.add(r2);
            }
            r5.A09.A0E(list2);
        }
        r5.A06.setVisibility(8);
        r5.A03.setText(R.string.str14c5);
    }

    public void AYu() {
        this.A00.A01.postDelayed(new C1210864d(this), 2000);
    }
}
