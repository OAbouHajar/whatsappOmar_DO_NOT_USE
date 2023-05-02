package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.4q3  reason: invalid class name and case insensitive filesystem */
public final class C97474q3 implements C109535Sn {
    public final List A00;
    public final List A01;

    public C97474q3(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }

    public List ABD(long j2) {
        int i2;
        List list = this.A00;
        Long valueOf = Long.valueOf(j2);
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || ((Comparable) list.get(binarySearch)).compareTo(valueOf) != 0) {
                    i2 = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (((Comparable) list.get(binarySearch)).compareTo(valueOf) != 0);
            i2 = binarySearch + 1;
        }
        return i2 == -1 ? Collections.emptyList() : (List) this.A01.get(i2);
    }

    public long AC3(int i2) {
        boolean z2 = true;
        C90524eJ.A03(C13700nu.A0f(i2));
        List list = this.A00;
        if (i2 >= list.size()) {
            z2 = false;
        }
        C90524eJ.A03(z2);
        return C13690nt.A0A(list, i2);
    }

    public int AC4() {
        return this.A00.size();
    }

    public int ADu(long j2) {
        List list = this.A00;
        Long valueOf = Long.valueOf(j2);
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (((Comparable) list.get(binarySearch)).compareTo(valueOf) != 0);
        }
        if (binarySearch >= list.size()) {
            return -1;
        }
        return binarySearch;
    }
}
