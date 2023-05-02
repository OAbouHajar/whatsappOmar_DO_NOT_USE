package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.0S8  reason: invalid class name */
public class AnonymousClass0S8 {
    public List A00;
    public int[] A01;

    public AnonymousClass0YE A00(int i2) {
        AnonymousClass0YE r1;
        List list = this.A00;
        if (list != null) {
            int size = list.size();
            do {
                size--;
                if (size >= 0) {
                    r1 = (AnonymousClass0YE) this.A00.get(size);
                }
            } while (r1.A01 != i2);
            return r1;
        }
        return null;
    }

    public void A01(int i2) {
        int[] iArr = this.A01;
        if (iArr == null) {
            int[] iArr2 = new int[(Math.max(i2, 10) + 1)];
            this.A01 = iArr2;
            Arrays.fill(iArr2, -1);
            return;
        }
        int length = iArr.length;
        if (i2 >= length) {
            while (length <= i2) {
                length <<= 1;
            }
            int[] iArr3 = new int[length];
            this.A01 = iArr3;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr3, 0, length2);
            int[] iArr4 = this.A01;
            Arrays.fill(iArr4, length2, iArr4.length, -1);
        }
    }

    public void A02(int i2) {
        List list = this.A00;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (((AnonymousClass0YE) this.A00.get(size)).A01 >= i2) {
                    this.A00.remove(size);
                }
            }
        }
        A03(i2);
    }

    public void A03(int i2) {
        int[] iArr;
        int length;
        int[] iArr2 = this.A01;
        if (iArr2 != null && i2 < iArr2.length) {
            if (this.A00 != null) {
                AnonymousClass0YE A002 = A00(i2);
                if (A002 != null) {
                    this.A00.remove(A002);
                }
                int size = this.A00.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (((AnonymousClass0YE) this.A00.get(i3)).A01 < i2) {
                        i3++;
                    } else if (i3 != -1) {
                        this.A00.remove(i3);
                        int i4 = ((AnonymousClass0YE) this.A00.get(i3)).A01;
                        if (i4 != -1) {
                            iArr = this.A01;
                            length = i4 + 1;
                        }
                    }
                }
            }
            iArr = this.A01;
            length = iArr.length;
            Arrays.fill(iArr, i2, length, -1);
        }
    }

    public void A04(int i2, int i3) {
        int[] iArr = this.A01;
        if (iArr != null && i2 < iArr.length) {
            int i4 = i2 + i3;
            A01(i4);
            int[] iArr2 = this.A01;
            System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
            Arrays.fill(this.A01, i2, i4, -1);
            List list = this.A00;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        AnonymousClass0YE r1 = (AnonymousClass0YE) this.A00.get(size);
                        int i5 = r1.A01;
                        if (i5 >= i2) {
                            r1.A01 = i5 + i3;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void A05(int i2, int i3) {
        int[] iArr = this.A01;
        if (iArr != null && i2 < iArr.length) {
            int i4 = i2 + i3;
            A01(i4);
            int[] iArr2 = this.A01;
            System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
            int[] iArr3 = this.A01;
            int length = iArr3.length;
            Arrays.fill(iArr3, length - i3, length, -1);
            List list = this.A00;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        AnonymousClass0YE r1 = (AnonymousClass0YE) this.A00.get(size);
                        int i5 = r1.A01;
                        if (i5 >= i2) {
                            if (i5 < i4) {
                                this.A00.remove(size);
                            } else {
                                r1.A01 = i5 - i3;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
