package X;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.0ey  reason: invalid class name and case insensitive filesystem */
public class C09140ey implements AutoCloseable {
    public String[] A00;
    public final ArrayDeque A01;

    public C09140ey(Object obj, String str, ArrayDeque arrayDeque) {
        this.A01 = arrayDeque;
        if (obj != null) {
            AnonymousClass0QH r4 = new AnonymousClass0QH(obj, str);
            arrayDeque.addFirst(r4);
            if (Log.isLoggable("CarApp.Bun", 2)) {
                StringBuilder A0o = AnonymousClass000.A0o();
                int min = Math.min(arrayDeque.size(), 11);
                String[] strArr = this.A00;
                if (strArr == null) {
                    strArr = new String[12];
                    this.A00 = strArr;
                }
                String str2 = strArr[min];
                if (str2 == null) {
                    char[] cArr = new char[min];
                    Arrays.fill(cArr, ' ');
                    str2 = new String(cArr);
                    str2 = min == 11 ? AnonymousClass000.A0h("...", AnonymousClass000.A0q(str2)) : str2;
                    this.A00[min] = str2;
                }
                A0o.append(str2);
                StringBuilder A0o2 = AnonymousClass000.A0o();
                A0o2.append(AnonymousClass0XL.A04(r4.A00.getClass()));
                A0o2.append(" ");
                Log.v("CarApp.Bun", AnonymousClass000.A0h(AnonymousClass000.A0h(r4.A01, A0o2), A0o));
            }
        }
    }

    public static C09140ey A00() {
        return new C09140ey((Object) null, "", new ArrayDeque());
    }

    public static C09140ey A01(C09140ey r1, Object obj, String str) {
        return new C09140ey(obj, str, r1.A01);
    }

    public static String A02(Bundle bundle) {
        String str = (String) AnonymousClass000.A0Y(AnonymousClass0XL.A00, bundle.getInt("tag_class_type"));
        return str == null ? "unknown" : str;
    }

    public String A03() {
        StringBuilder A0o = AnonymousClass000.A0o();
        ArrayDeque arrayDeque = this.A01;
        int min = Math.min(arrayDeque.size(), 8);
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            int i2 = min - 1;
            if (min <= 0) {
                break;
            }
            AnonymousClass0QH r2 = (AnonymousClass0QH) descendingIterator.next();
            StringBuilder A0r = AnonymousClass000.A0r("[");
            A0r.append(r2.A01);
            A0r.append(", ");
            A0r.append(AnonymousClass0XL.A04(r2.A00.getClass()));
            A0o.append(AnonymousClass000.A0h("]", A0r));
            min = i2;
        }
        if (descendingIterator.hasNext()) {
            A0o.append("[...]");
        }
        return A0o.toString();
    }

    public boolean A04(Object obj) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            if (((AnonymousClass0QH) it.next()).A00 == obj) {
                return true;
            }
        }
        return false;
    }

    public void close() {
        this.A01.removeFirst();
    }
}
