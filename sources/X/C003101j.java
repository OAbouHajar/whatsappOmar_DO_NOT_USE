package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: X.01j  reason: invalid class name and case insensitive filesystem */
public class C003101j extends AnonymousClass1J5 {
    public static final int A00(Iterable iterable, Object obj) {
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i2 = 0;
        for (Object next : iterable) {
            if (i2 < 0) {
                AnonymousClass1JA.A0T();
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else if (C18450wi.A0R(obj, next)) {
                return i2;
            } else {
                i2++;
            }
        }
        return -1;
    }

    public static final Object A01(Iterable iterable) {
        C18450wi.A0H(iterable, 0);
        if (iterable instanceof List) {
            return A03((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Object A02(Iterable iterable) {
        C18450wi.A0H(iterable, 0);
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(0);
            }
        } else {
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                return it.next();
            }
        }
        return null;
    }

    public static final Object A03(List list) {
        C18450wi.A0H(list, 0);
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object A04(List list) {
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object A05(List list) {
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static final Object A06(List list, int i2) {
        C18450wi.A0H(list, 0);
        if (i2 < 0 || i2 > list.size() - 1) {
            return null;
        }
        return list.get(i2);
    }

    public static final String A07(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Iterable iterable, int i2) {
        C18450wi.A0H(charSequence2, 2);
        C18450wi.A0H(charSequence3, 3);
        C18450wi.A0H(charSequence4, 5);
        StringBuilder sb = new StringBuilder();
        A0G(sb, charSequence, charSequence2, charSequence3, charSequence4, iterable, i2);
        String obj = sb.toString();
        C18450wi.A0B(obj);
        return obj;
    }

    public static /* synthetic */ String A08(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Iterable iterable, int i2) {
        CharSequence charSequence4 = charSequence2;
        CharSequence charSequence5 = charSequence;
        String str = null;
        if ((i2 & 1) != 0) {
            charSequence5 = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence4 = charSequence6;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        int i3 = 0;
        if ((i2 & 8) != 0) {
            i3 = -1;
        }
        if ((i2 & 16) != 0) {
            str = "...";
        }
        return A07(charSequence5, charSequence4, charSequence6, str, iterable, i3);
    }

    public static final List A09(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return A0A(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            if (array != null) {
                if (array.length > 1) {
                    Arrays.sort(array);
                }
                return AnonymousClass080.A00(array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        List A0B = A0B(iterable);
        C003301l.A0K(A0B);
        return A0B;
    }

    public static final List A0A(Iterable iterable) {
        C18450wi.A0H(iterable, 0);
        if (!(iterable instanceof Collection)) {
            return AnonymousClass1JA.A0Q(A0B(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AnonymousClass1JA.A0P();
        }
        if (size != 1) {
            return A0E(collection);
        }
        return AnonymousClass1JB.A0V(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final List A0B(Iterable iterable) {
        if (iterable instanceof Collection) {
            return A0E((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        A0H(iterable, arrayList);
        return arrayList;
    }

    public static final List A0C(Iterable iterable, int i2) {
        C18450wi.A0H(iterable, 0);
        int i3 = 0;
        if ((iterable instanceof Collection) && i2 >= ((Collection) iterable).size()) {
            return A0A(iterable);
        }
        ArrayList arrayList = new ArrayList(i2);
        for (Object add : iterable) {
            arrayList.add(add);
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return AnonymousClass1JA.A0Q(arrayList);
    }

    public static final List A0D(Iterable iterable, Comparator comparator) {
        C18450wi.A0H(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return A0A(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array != null) {
                if (array.length > 1) {
                    Arrays.sort(array, comparator);
                }
                return AnonymousClass080.A00(array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        List A0B = A0B(iterable);
        C003301l.A0L(A0B, comparator);
        return A0B;
    }

    public static final List A0E(Collection collection) {
        C18450wi.A0H(collection, 0);
        return new ArrayList(collection);
    }

    public static final Set A0F(Iterable iterable) {
        C18450wi.A0H(iterable, 0);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return AnonymousClass1F9.A00();
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(C25421Js.A07(collection.size()));
                A0H(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return AnonymousClass1FA.A05(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        A0H(iterable, linkedHashSet2);
        return AnonymousClass1F9.A01(linkedHashSet2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r1 <= r10) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r4.append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r10 >= 0) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0G(java.lang.Appendable r4, java.lang.CharSequence r5, java.lang.CharSequence r6, java.lang.CharSequence r7, java.lang.CharSequence r8, java.lang.Iterable r9, int r10) {
        /*
            r3 = 1
            r0 = 3
            X.C18450wi.A0H(r6, r0)
            r0 = 4
            X.C18450wi.A0H(r7, r0)
            r0 = 6
            X.C18450wi.A0H(r8, r0)
            r4.append(r6)
            java.util.Iterator r2 = r9.iterator()
            r1 = 0
        L_0x0015:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r2.next()
            int r1 = r1 + 1
            if (r1 <= r3) goto L_0x0026
            r4.append(r5)
        L_0x0026:
            if (r10 < 0) goto L_0x002a
            if (r1 > r10) goto L_0x0030
        L_0x002a:
            X.AnonymousClass233.A0S(r4, r0)
            goto L_0x0015
        L_0x002e:
            if (r10 < 0) goto L_0x0035
        L_0x0030:
            if (r1 <= r10) goto L_0x0035
            r4.append(r8)
        L_0x0035:
            r4.append(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C003101j.A0G(java.lang.Appendable, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, java.lang.Iterable, int):void");
    }

    public static final void A0H(Iterable iterable, Collection collection) {
        for (Object add : iterable) {
            collection.add(add);
        }
    }

    public static final boolean A0I(Iterable iterable, Object obj) {
        C18450wi.A0H(iterable, 0);
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : A00(iterable, obj) >= 0;
    }
}
