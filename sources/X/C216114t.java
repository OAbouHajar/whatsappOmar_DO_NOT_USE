package X;

import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.14t  reason: invalid class name and case insensitive filesystem */
public class C216114t {
    public List A00;
    public Map A01;
    public final C16000sG A02;
    public final C16080sP A03;
    public final C15800rs A04;
    public final C17780vd A05;
    public final C16320sq A06;
    public final Object A07 = new Object();

    public C216114t(C16000sG r2, C16080sP r3, C15800rs r4, C17780vd r5, C16320sq r6) {
        this.A06 = r6;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
    }

    public static boolean A00(C15830rv r2, List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C40921uu) it.next()).A90(r2)) {
                return false;
            }
        }
        return true;
    }

    public C16010sH A01(C15830rv r5) {
        C16010sH A0A = this.A02.A0A(r5);
        this.A06.Acl(new RunnableRunnableShape1S0300000_I0_1(this, A0A, r5, 3));
        return A0A;
    }

    public List A02() {
        List list;
        synchronized (this.A07) {
            if (this.A00 == null) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.A00 = copyOnWriteArrayList;
                this.A02.A0Y(copyOnWriteArrayList);
            }
            list = this.A00;
        }
        return list;
    }

    public List A03(int i2) {
        List A052 = this.A04.A05();
        ArrayList arrayList = new ArrayList(Math.min(A052.size(), i2));
        for (int i3 = 0; i3 < A052.size() && arrayList.size() < i2; i3++) {
            A052.get(i3);
            C16010sH A012 = A01((C15830rv) A052.get(i3));
            if (!TextUtils.isEmpty(A012.A09())) {
                arrayList.add(A012);
            }
        }
        return arrayList;
    }

    public Map A04() {
        Map map;
        C15830rv r1;
        synchronized (this.A07) {
            if (this.A01 == null) {
                List<C16010sH> A022 = A02();
                this.A01 = new HashMap(A022.size(), 1.0f);
                for (C16010sH r7 : A022) {
                    Class<C15830rv> cls = C15830rv.class;
                    C16010sH r0 = (C16010sH) this.A01.get(r7.A08(cls));
                    if ((r0 == null || r0.A05() > r7.A05()) && (r1 = (C15830rv) r7.A08(cls)) != null) {
                        this.A01.put(r1, r7);
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (C15830rv r2 : this.A04.A05()) {
                    if (this.A01.get(r2) == null) {
                        C16010sH A012 = A01(r2);
                        arrayList.add(A012);
                        this.A01.put(r2, A012);
                    }
                }
                List list = this.A00;
                AnonymousClass00B.A06(list);
                list.addAll(arrayList);
            }
            map = this.A01;
        }
        return map;
    }
}
