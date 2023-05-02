package com.facebook.redex;

import X.C15830rv;
import X.C16460t6;
import X.C16740tZ;
import X.C16840tj;
import X.C16880tn;
import X.C18450wi;
import X.C28381Vw;
import X.C35181lV;
import X.C35191lW;
import X.C62743Et;
import X.C62753Eu;
import java.util.Iterator;
import java.util.List;

public class RunnableRunnableShape0S3100000_I1 implements Runnable {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;

    public RunnableRunnableShape0S3100000_I1(Object obj, String str, String str2, String str3, int i2) {
        this.A04 = i2;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = obj;
        this.A03 = str3;
    }

    public final void run() {
        C16460t6 r5;
        C16740tZ A002;
        C35181lV r3;
        C16840tj r0;
        C16880tn AAt;
        boolean z2;
        C35191lW r02;
        Object next;
        C16840tj r03;
        C16880tn AAt2;
        C35191lW r04;
        int i2 = this.A04;
        String str = this.A01;
        String str2 = this.A02;
        Object obj = this.A00;
        if (i2 != 0) {
            String str3 = this.A03;
            C28381Vw r05 = new C28381Vw(C15830rv.A02(str), str2, false);
            r5 = ((C62753Eu) obj).A05;
            A002 = C16460t6.A00(r5, r05);
            r3 = null;
            if ((A002 instanceof C16840tj) && (r03 = (C16840tj) A002) != null && (AAt2 = r03.AAt()) != null) {
                z2 = true;
                if (AAt2.A00 == 5 && (r04 = AAt2.A03) != null) {
                    List list = r04.A00;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            next = it.next();
                            if (C18450wi.A0R(((C35181lV) next).A01.A00, str3)) {
                                break;
                            }
                        }
                    }
                    r5.A0a(A002);
                }
                return;
            }
            return;
        }
        String str4 = this.A03;
        C28381Vw r06 = new C28381Vw(C15830rv.A02(str), str2, false);
        r5 = ((C62743Et) obj).A04;
        A002 = C16460t6.A00(r5, r06);
        r3 = null;
        if ((A002 instanceof C16840tj) && (r0 = (C16840tj) A002) != null && (AAt = r0.AAt()) != null) {
            z2 = true;
            if (AAt.A00 == 5 && (r02 = AAt.A03) != null) {
                List list2 = r02.A00;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        next = it2.next();
                        if (C18450wi.A0R(((C35181lV) next).A01.A00, str4)) {
                            break;
                        }
                    }
                }
                r5.A0a(A002);
            }
            return;
        }
        return;
        r3 = next;
        C35181lV r32 = r3;
        if (r32 != null) {
            r32.A00 = z2;
        }
        r5.A0a(A002);
    }
}
