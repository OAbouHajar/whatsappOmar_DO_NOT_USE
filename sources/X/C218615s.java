package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.15s  reason: invalid class name and case insensitive filesystem */
public class C218615s {
    public final C14710pd A00;

    public C218615s(C14710pd r1) {
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Long[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Set A00(java.util.HashMap r8) {
        /*
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.Set r0 = r8.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x000d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r1 = r8.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            X.1qy r0 = (X.C38551qy) r0
            X.0rv r6 = r0.A00
            java.lang.Object r0 = r1.getKey()
            X.1qy r0 = (X.C38551qy) r0
            X.0rv r5 = r0.A01
            java.lang.Object r4 = r1.getValue()
            java.util.List r4 = (java.util.List) r4
            int r0 = r4.size()
            java.lang.Long[] r3 = new java.lang.Long[r0]
            int r0 = r4.size()
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
        L_0x003c:
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x0059
            java.lang.Object r0 = r4.get(r1)
            X.1np r0 = (X.C36611np) r0
            java.lang.Object r0 = r0.A00
            r3[r1] = r0
            java.lang.Object r0 = r4.get(r1)
            X.1np r0 = (X.C36611np) r0
            java.lang.Object r0 = r0.A01
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x003c
        L_0x0059:
            X.1qz r0 = new X.1qz
            r0.<init>(r6, r5, r3, r2)
            r7.add(r0)
            goto L_0x000d
        L_0x0062:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218615s.A00(java.util.HashMap):java.util.Set");
    }

    public static Set A01(Set set) {
        HashMap hashMap = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C38561qz r6 = (C38561qz) it.next();
            int i2 = 0;
            C38551qy r4 = new C38551qy(r6.A01, r6.A00, false);
            ArrayList arrayList = new ArrayList();
            while (true) {
                Long[] lArr = r6.A02;
                if (i2 >= lArr.length) {
                    break;
                }
                arrayList.add(new C36611np(lArr[i2], r6.A03[i2]));
                i2++;
            }
            if (hashMap.containsKey(r4)) {
                ((List) hashMap.get(r4)).addAll(arrayList);
            } else {
                hashMap.put(r4, arrayList);
            }
        }
        return A00(hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r1 = r3.A0C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.C16740tZ r3) {
        /*
            X.1Vw r0 = r3.A11
            boolean r0 = r0.A02
            r2 = 1
            if (r0 != 0) goto L_0x001e
            int r0 = r3.A08
            if (r0 == r2) goto L_0x0013
            byte r0 = r3.A10
            boolean r0 = X.C30921dB.A00(r0)
            if (r0 == 0) goto L_0x001e
        L_0x0013:
            int r1 = r3.A0C
            r0 = 9
            if (r1 == r0) goto L_0x001e
            r0 = 10
            if (r1 == r0) goto L_0x001e
            return r2
        L_0x001e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218615s.A02(X.0tZ):boolean");
    }
}
