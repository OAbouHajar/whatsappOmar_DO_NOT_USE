package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1gQ  reason: invalid class name and case insensitive filesystem */
public class C32461gQ {
    public String A00;
    public byte[] A01;
    public final List A02;
    public final List A03;

    public C32461gQ(C28371Vv r3) {
        this(r3.A00);
        C28371Vv[] r0 = r3.A03;
        if (r0 != null) {
            this.A03.addAll(Arrays.asList(r0));
        }
        C35081lL[] A0Q = r3.A0Q();
        if (A0Q != null) {
            this.A02.addAll(Arrays.asList(A0Q));
        }
        this.A01 = r3.A01;
    }

    public C32461gQ(String str) {
        this.A03 = new ArrayList();
        this.A02 = new ArrayList();
        this.A00 = str;
    }

    public static void A00(C32461gQ r1, String str, String str2) {
        r1.A02(new C35081lL(str, str2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        r2 = (X.C28371Vv[]) r1.toArray(new X.C28371Vv[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C28371Vv A01() {
        /*
            r4 = this;
            java.util.List r1 = r4.A02
            boolean r0 = r1.isEmpty()
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x0012
            X.1lL[] r0 = new X.C35081lL[r2]
            java.lang.Object[] r3 = r1.toArray(r0)
            X.1lL[] r3 = (X.C35081lL[]) r3
        L_0x0012:
            java.util.List r1 = r4.A03
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x002c
            X.1Vv[] r0 = new X.C28371Vv[r2]
            java.lang.Object[] r2 = r1.toArray(r0)
            X.1Vv[] r2 = (X.C28371Vv[]) r2
            if (r2 == 0) goto L_0x002c
            java.lang.String r0 = r4.A00
            X.1Vv r1 = new X.1Vv
            r1.<init>((java.lang.String) r0, (X.C35081lL[]) r3, (X.C28371Vv[]) r2)
            return r1
        L_0x002c:
            java.lang.String r2 = r4.A00
            byte[] r0 = r4.A01
            X.1Vv r1 = new X.1Vv
            r1.<init>((java.lang.String) r2, (byte[]) r0, (X.C35081lL[]) r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32461gQ.A01():X.1Vv");
    }

    public void A02(C35081lL r2) {
        this.A02.add(r2);
    }

    public void A03(C28371Vv r2) {
        this.A03.add(r2);
    }

    public final void A04(C28371Vv r5) {
        String str = this.A00;
        if ("smax:any".equals(str)) {
            str = r5.A00;
            this.A00 = str;
        }
        String str2 = r5.A00;
        if (!str.equals(str2) && !"smax:any".equals(str2)) {
            AnonymousClass00B.A08(String.format("Error merging <%s/> with <%s/>: conflicting tags", new Object[]{str, str2}));
        }
    }

    public void A05(C28371Vv r12, List list) {
        int length;
        A04(r12);
        C35081lL[] A0Q = r12.A0Q();
        if (A0Q != null) {
            for (C35081lL r7 : A0Q) {
                String str = r7.A02;
                List list2 = this.A02;
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        list2.add(r7);
                        break;
                    }
                    C35081lL r1 = (C35081lL) it.next();
                    if (r1.A02.equals(str)) {
                        if (!r7.equals(r1)) {
                            AnonymousClass00B.A08(String.format("Error merging attribute '%s' in <%s/>: conflicting values", new Object[]{r7.A02, this.A00}));
                        }
                    }
                }
            }
        }
        C28371Vv[] r2 = r12.A03;
        if (!(r2 == null || (length = r2.length) == 0)) {
            int i2 = 0;
            if (this.A01 != null) {
                AnonymousClass00B.A08(String.format("Error merging children into <%s/>: element already has data", new Object[]{this.A00}));
            }
            List<C28371Vv> list3 = this.A03;
            if (!list3.isEmpty()) {
                C94974lm r13 = C94974lm.A00;
                Map A012 = C43041zF.A01(r13, list3);
                Map A013 = C43041zF.A01(r13, Arrays.asList(r2));
                A0B(list, A012, A013);
                ArrayList arrayList = new ArrayList();
                for (C28371Vv r9 : list3) {
                    String str2 = r9.A00;
                    if (A013.containsKey(str2)) {
                        if (!list.contains(Arrays.asList(new String[]{str2}))) {
                            C32461gQ r14 = new C32461gQ(r9);
                            r14.A05((C28371Vv) ((List) A013.get(str2)).remove(0), r9.A0P(list));
                            r9 = r14.A01();
                        }
                    }
                    arrayList.add(r9);
                }
                for (Map.Entry entry : A013.entrySet()) {
                    if (!A012.containsKey(entry.getKey()) && !list.contains(entry.getKey())) {
                        arrayList.addAll((Collection) entry.getValue());
                    }
                }
                list3.clear();
                list3.addAll(arrayList);
            } else {
                do {
                    C28371Vv r15 = r2[i2];
                    if (!list.contains(r15.A00)) {
                        list3.add(r15);
                    }
                    i2++;
                } while (i2 < length);
            }
        }
        byte[] bArr = r12.A01;
        if (bArr != null) {
            if (!this.A03.isEmpty()) {
                AnonymousClass00B.A08(String.format("Error merging data into <%s/>: element already has children", new Object[]{this.A00}));
            }
            byte[] bArr2 = this.A01;
            if (bArr2 != null && !Arrays.equals(bArr2, bArr)) {
                AnonymousClass00B.A08(String.format("Error merging data into <%s/>: conflicting values", new Object[]{this.A00}));
            }
            this.A01 = bArr;
        }
    }

    public void A06(C28371Vv r11, List list) {
        C32461gQ r2;
        A04(r11);
        C28371Vv[] r3 = r11.A03;
        if (r3 != null && r3.length != 0) {
            if (this.A01 != null) {
                AnonymousClass00B.A08(String.format("Error merging children into <%s/>: element already has data", new Object[]{this.A00}));
            }
            List<C28371Vv> list2 = this.A03;
            C94974lm r22 = C94974lm.A00;
            Map A012 = C43041zF.A01(r22, list2);
            Map A013 = C43041zF.A01(r22, Arrays.asList(r3));
            A0B(list, A012, A013);
            ArrayList arrayList = new ArrayList();
            for (C28371Vv r8 : list2) {
                String str = r8.A00;
                if (A013.containsKey(str)) {
                    boolean contains = list.contains(Arrays.asList(new String[]{str}));
                    List list3 = (List) A013.get(str);
                    if (contains) {
                        List emptyList = Collections.emptyList();
                        r2 = new C32461gQ(r8);
                        r2.A05((C28371Vv) list3.get(0), r8.A0P(emptyList));
                    } else {
                        r2 = new C32461gQ(r8);
                        r2.A06((C28371Vv) list3.remove(0), r8.A0P(list));
                    }
                    r8 = r2.A01();
                }
                arrayList.add(r8);
            }
            list2.clear();
            list2.addAll(arrayList);
        }
    }

    public void A07(C28371Vv r6, List list, List list2) {
        if (list.size() == 0) {
            A06(r6, list2);
            return;
        }
        int i2 = 0;
        Object remove = list.remove(0);
        ArrayList arrayList = new ArrayList();
        while (true) {
            List list3 = this.A03;
            if (i2 < list3.size()) {
                C28371Vv r1 = (C28371Vv) list3.get(i2);
                if (r1.A00.equals(remove)) {
                    C32461gQ r0 = new C32461gQ(r1);
                    r0.A07(r6, list, list2);
                    r1 = r0.A01();
                }
                arrayList.add(r1);
                i2++;
            } else {
                return;
            }
        }
    }

    public void A08(String str) {
        this.A01 = str == null ? null : str.getBytes();
    }

    public void A09(String str, String str2, List list) {
        if (str != null) {
            A0A(str, str2, list);
        }
    }

    public void A0A(String str, String str2, List list) {
        if (!list.contains(str)) {
            AnonymousClass00B.A08(String.format("String was expected to be one of '%s'.", new Object[]{TextUtils.join(", ", list)}));
        }
        A02(new C35081lL(str2, str));
    }

    public final void A0B(List list, Map map, Map map2) {
        for (Map.Entry entry : map.entrySet()) {
            if (map2.containsKey(entry.getKey()) && ((List) entry.getValue()).size() != ((List) map2.get(entry.getKey())).size()) {
                if (!list.contains(Arrays.asList(new String[]{entry.getKey()}))) {
                    AnonymousClass00B.A08(String.format("Error merging children into <%s/>: conflicting child count for <%s/>", new Object[]{this.A00, entry.getKey()}));
                }
            }
        }
    }
}
