package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.4sU  reason: invalid class name and case insensitive filesystem */
public abstract class C98484sU implements C109905Uc {
    public int zza = 0;

    public static void A08(Iterable iterable, List list) {
        String str;
        if (iterable instanceof C110005Uq) {
            List AjH = ((C110005Uq) iterable).AjH();
            C110005Uq r6 = (C110005Uq) list;
            int size = list.size();
            for (Object next : AjH) {
                if (next == null) {
                    StringBuilder A0g = C13690nt.A0g(37);
                    A0g.append("Element at index ");
                    A0g.append(r6.size() - size);
                    str = AnonymousClass000.A0h(" is null.", A0g);
                    int size2 = r6.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        }
                        r6.remove(size2);
                    }
                } else if (next instanceof AnonymousClass557) {
                    r6.Aip((AnonymousClass557) next);
                } else {
                    r6.add(next);
                }
            }
            return;
        } else if (iterable instanceof AnonymousClass5M5) {
            list.addAll((Collection) iterable);
            return;
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    StringBuilder A0g2 = C13690nt.A0g(37);
                    A0g2.append("Element at index ");
                    A0g2.append(list.size() - size3);
                    str = AnonymousClass000.A0h(" is null.", A0g2);
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        }
                        list.remove(size4);
                    }
                } else {
                    list.add(next2);
                }
            }
            return;
        }
        throw AnonymousClass000.A0W(str);
    }
}
