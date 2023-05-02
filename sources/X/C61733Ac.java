package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.3Ac  reason: invalid class name and case insensitive filesystem */
public class C61733Ac {
    public static List A02;
    public final List A00 = AnonymousClass000.A0u();
    public final List A01 = AnonymousClass000.A0u();

    static {
        Integer[] numArr = new Integer[5];
        AnonymousClass000.A1K(numArr, 128105);
        AnonymousClass000.A1L(numArr, 128104);
        numArr[2] = 129489;
        numArr[3] = 129777;
        numArr[4] = 129778;
        A02 = Arrays.asList(numArr);
    }

    public C61733Ac(int[] iArr) {
        ArrayList arrayList = null;
        char c2 = 0;
        int i2 = 0;
        for (int i3 : iArr) {
            if (A02.contains(Integer.valueOf(i3))) {
                if (arrayList != null) {
                    this.A00.add(arrayList);
                }
                i2++;
                this.A01.add(C13680ns.A0F(Integer.valueOf(i3), -1));
                arrayList = AnonymousClass000.A0u();
                c2 = 1;
            } else {
                int[] iArr2 = C62153Bw.A05;
                int length = iArr2.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    } else if (iArr2[i4] != i3) {
                        i4++;
                    } else if (c2 == 1) {
                        List list = this.A01;
                        int i5 = i2 - 1;
                        list.set(i5, C13680ns.A0F(C13690nt.A0a(list, i5), i3));
                        c2 = 2;
                    }
                }
                if (i3 == 8205) {
                    AnonymousClass00B.A06(arrayList);
                    C13690nt.A1O(arrayList, i3);
                    c2 = 3;
                } else if (c2 == 3) {
                    AnonymousClass00B.A06(arrayList);
                    C13690nt.A1O(arrayList, i3);
                }
            }
        }
    }

    public C61733Ac A00(int i2, int i3) {
        int i4 = i2 - 1;
        List list = this.A01;
        if (i4 >= list.size()) {
            StringBuilder A0r = AnonymousClass000.A0r("MultiSkinToneEmoji/createSkinTonedEmoji/error/person index ");
            A0r.append(i4);
            A0r.append(" is bigger than the total length of sequence ");
            Log.e(AnonymousClass000.A0l(A0r, list.size()));
            return this;
        }
        C61733Ac r2 = new C61733Ac(A02());
        List list2 = r2.A01;
        if (list2.size() > i4) {
            list2.set(i4, C13680ns.A0F(C13690nt.A0a(list2, i4), i3));
        }
        return r2;
    }

    public List A01() {
        List<Pair> list = this.A01;
        ArrayList A0w = AnonymousClass000.A0w(list);
        for (Pair pair : list) {
            int A0D = AnonymousClass000.A0D(pair.second);
            if (A0D > 0) {
                A0w.add(Integer.toString(A0D));
            }
        }
        return A0w;
    }

    public int[] A02() {
        ArrayList A0u = AnonymousClass000.A0u();
        int i2 = 0;
        while (true) {
            List list = this.A01;
            if (i2 >= list.size()) {
                return AnonymousClass45T.A00(A0u);
            }
            A0u.add(C13690nt.A0a(list, i2));
            if (!(list.size() <= i2 || list.get(i2) == null || AnonymousClass000.A0D(((Pair) list.get(i2)).second) == -1)) {
                A0u.add(((Pair) list.get(i2)).second);
            }
            List list2 = this.A00;
            if (list2.size() > i2 && list2.get(i2) != null) {
                A0u.addAll((Collection) list2.get(i2));
            }
            i2++;
        }
    }
}
