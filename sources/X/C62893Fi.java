package X;

import com.facebook.redex.RunnableRunnableShape1S1101000_I1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3Fi  reason: invalid class name and case insensitive filesystem */
public class C62893Fi implements C16710tV {
    public final String A00;
    public final /* synthetic */ C18150wE A01;

    public C62893Fi(C18150wE r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public void AQR(int i2) {
        C57262qa r4 = this.A01.A02;
        if (r4 != null) {
            r4.A06.A0K(new RunnableRunnableShape1S1101000_I1(r4, this.A00, i2, 0));
        }
    }

    public /* bridge */ /* synthetic */ void AYB(Object obj) {
        ArrayList A0u;
        AnonymousClass026 r7;
        C85444Ol r12 = (C85444Ol) obj;
        C57262qa r6 = this.A01.A02;
        if (r6 != null) {
            List<AnonymousClass1US> list = r12.A06;
            String str = this.A00;
            LinkedList linkedList = r6.A0D;
            synchronized (linkedList) {
                if (linkedList.contains(str)) {
                    while (!str.equals(linkedList.peek())) {
                        linkedList.poll();
                    }
                    linkedList.poll();
                    if (list.isEmpty()) {
                        r7 = r6.A04;
                        A0u = AnonymousClass3Bv.newArrayList((Object[]) new C86344Sg[]{new C71813l5((C108645Ou) null, str, 1)});
                    } else {
                        A0u = AnonymousClass000.A0u();
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            AnonymousClass1US r3 = (AnonymousClass1US) list.get(i2);
                            A0u.add(new C71773l1(new C100774wB(r6, r3, i2), r3));
                        }
                        A0u.add(new C71783l2(C87594Xo.A00(r6.A00, 12.0f)));
                        A0u.add(new C71733kx());
                        A0u.add(new C71753kz());
                        r7 = r6.A04;
                    }
                    r7.A09(A0u);
                    C25501Ka r5 = r6.A07;
                    long size = (long) list.size();
                    int i3 = 0;
                    for (AnonymousClass1US r0 : list) {
                        if (r0.A06 == 2) {
                            i3++;
                        }
                    }
                    r5.A00(0, size, (long) i3);
                }
            }
        }
    }
}
