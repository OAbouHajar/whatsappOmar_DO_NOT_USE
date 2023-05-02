package X;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.09i  reason: invalid class name and case insensitive filesystem */
public class C020009i {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public AnonymousClass0Fv A04;
    public C07610cB A05;
    public Object[] A06;
    public Object[] A07;
    public final Class A08;

    public C020009i(C07610cB r2, Class cls) {
        this.A08 = cls;
        this.A06 = (Object[]) Array.newInstance(cls, 10);
        this.A05 = r2;
    }

    public final int A00(Object[] objArr) {
        int length = objArr.length;
        int i2 = 0;
        if (length != 0) {
            Arrays.sort(objArr, this.A05);
            i2 = 1;
            int i3 = 0;
            for (int i4 = 1; i4 < length; i4++) {
                Object obj = objArr[i4];
                if (this.A05.compare(objArr[i3], obj) == 0) {
                    int i5 = i3;
                    while (true) {
                        if (i5 >= i2) {
                            break;
                        } else if (!this.A05.A02(objArr[i5], obj)) {
                            i5++;
                        } else if (i5 != -1) {
                            objArr[i5] = obj;
                        }
                    }
                    if (i2 != i4) {
                        objArr[i2] = obj;
                    }
                    i2++;
                } else {
                    if (i2 != i4) {
                        objArr[i2] = obj;
                    }
                    i3 = i2;
                    i2++;
                }
            }
        }
        return i2;
    }

    public Object A01(int i2) {
        int i3;
        int i4 = this.A03;
        if (i2 >= i4 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Asked to get item at ");
            sb.append(i2);
            sb.append(" but size is ");
            sb.append(i4);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        Object[] objArr = this.A07;
        if (objArr == null || i2 < (i3 = this.A00)) {
            objArr = this.A06;
        } else {
            i2 = (i2 - i3) + this.A02;
        }
        return objArr[i2];
    }

    public void A02() {
        A03();
        C07610cB r1 = this.A05;
        if (r1 instanceof AnonymousClass0Fv) {
            ((AnonymousClass0Fv) r1).A00.A00();
        }
        C07610cB r12 = this.A05;
        AnonymousClass0Fv r0 = this.A04;
        if (r12 == r0) {
            this.A05 = r0.A01;
        }
    }

    public final void A03() {
        if (this.A07 != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public void A04(Collection collection) {
        Class cls = this.A08;
        Object[] array = collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        A03();
        C07610cB r1 = this.A05;
        boolean z2 = r1 instanceof AnonymousClass0Fv;
        boolean z3 = !z2;
        if (z3) {
            A03();
            if (!z2) {
                AnonymousClass0Fv r0 = this.A04;
                if (r0 == null) {
                    r0 = new AnonymousClass0Fv(r1);
                    this.A04 = r0;
                }
                this.A05 = r0;
            }
        }
        this.A02 = 0;
        this.A01 = this.A03;
        this.A07 = this.A06;
        this.A00 = 0;
        int A002 = A00(array);
        this.A06 = (Object[]) Array.newInstance(cls, A002);
        while (true) {
            int i2 = this.A00;
            if (i2 >= A002 && this.A02 >= this.A01) {
                break;
            }
            int i3 = this.A02;
            int i4 = this.A01;
            if (i3 >= i4) {
                int i5 = A002 - i2;
                System.arraycopy(array, i2, this.A06, i2, i5);
                this.A00 += i5;
                this.A03 += i5;
                this.A05.ASG(i2, i5);
                break;
            } else if (i2 >= A002) {
                int i6 = i4 - i3;
                this.A03 -= i6;
                this.A05.AW0(i2, i6);
                break;
            } else {
                Object obj = this.A07[i3];
                Object obj2 = array[i2];
                int compare = this.A05.compare(obj, obj2);
                if (compare < 0) {
                    this.A03--;
                    this.A02++;
                    this.A05.AW0(this.A00, 1);
                } else {
                    if (compare <= 0) {
                        if (!this.A05.A02(obj, obj2)) {
                            this.A03--;
                            this.A02++;
                            this.A05.AW0(this.A00, 1);
                        } else {
                            Object[] objArr = this.A06;
                            int i7 = this.A00;
                            objArr[i7] = obj2;
                            this.A02++;
                            this.A00 = i7 + 1;
                            if (!this.A05.A01(obj, obj2)) {
                                C07610cB r2 = this.A05;
                                r2.AOI(r2.A00(obj, obj2), this.A00 - 1, 1);
                            }
                        }
                    }
                    Object[] objArr2 = this.A06;
                    int i8 = this.A00;
                    objArr2[i8] = obj2;
                    int i9 = i8 + 1;
                    this.A00 = i9;
                    this.A03++;
                    this.A05.ASG(i9 - 1, 1);
                }
            }
        }
        this.A07 = null;
        if (z3) {
            A02();
        }
    }
}
