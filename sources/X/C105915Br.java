package X;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.5Br  reason: invalid class name and case insensitive filesystem */
public class C105915Br extends AbstractList<Integer> implements RandomAccess, Serializable {
    public static final long serialVersionUID = 0;
    public final int[] array;
    public final int end;
    public final int start;

    public C105915Br(int[] iArr, int i2, int i3) {
        this.array = iArr;
        this.start = i2;
        this.end = i3;
    }

    public boolean contains(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.array;
            int A0D = AnonymousClass000.A0D(obj);
            int i2 = this.start;
            int i3 = this.end;
            while (true) {
                if (i2 >= i3) {
                    break;
                } else if (iArr[i2] == A0D) {
                    return i2 != -1;
                } else {
                    i2++;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C105915Br)) {
                return super.equals(obj);
            }
            C105915Br r8 = (C105915Br) obj;
            int size = size();
            if (r8.size() == size) {
                int i2 = 0;
                while (i2 < size) {
                    if (this.array[this.start + i2] == r8.array[r8.start + i2]) {
                        i2++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public /* bridge */ /* synthetic */ Object get(int i2) {
        C29031Zu.A01(i2, size());
        return Integer.valueOf(this.array[this.start + i2]);
    }

    public int hashCode() {
        int i2 = 1;
        for (int i3 = this.start; i3 < this.end; i3++) {
            i2 = (i2 * 31) + this.array[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.array;
            int A0D = AnonymousClass000.A0D(obj);
            int i2 = this.start;
            int i3 = this.end;
            int i4 = i2;
            while (true) {
                if (i4 >= i3) {
                    break;
                } else if (iArr[i4] == A0D) {
                    int i5 = i4 - i2;
                    if (i4 < 0) {
                        return -1;
                    }
                    return i5;
                } else {
                    i4++;
                }
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return false;
    }

    public int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.array;
            int A0D = AnonymousClass000.A0D(obj);
            int i2 = this.start;
            int i3 = this.end;
            while (true) {
                i3--;
                if (i3 < i2) {
                    break;
                } else if (iArr[i3] == A0D) {
                    int i4 = i3 - i2;
                    if (i3 < 0) {
                        return -1;
                    }
                    return i4;
                }
            }
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        C29031Zu.A01(i2, size());
        int[] iArr = this.array;
        int i3 = this.start + i2;
        int i4 = iArr[i3];
        iArr[i3] = ((Number) obj).intValue();
        return Integer.valueOf(i4);
    }

    public int size() {
        return this.end - this.start;
    }

    public List subList(int i2, int i3) {
        C29031Zu.A03(i2, i3, size());
        if (i2 == i3) {
            return Collections.emptyList();
        }
        int[] iArr = this.array;
        int i4 = this.start;
        return new C105915Br(iArr, i2 + i4, i4 + i3);
    }

    public String toString() {
        StringBuilder A0g = C13690nt.A0g(size() * 5);
        A0g.append('[');
        int[] iArr = this.array;
        int i2 = this.start;
        while (true) {
            A0g.append(iArr[i2]);
            i2++;
            if (i2 >= this.end) {
                return AnonymousClass3K2.A0m(A0g);
            }
            A0g.append(", ");
        }
    }
}
