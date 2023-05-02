package X;

import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0v2  reason: invalid class name and case insensitive filesystem */
public class C17410v2 implements C17420v3 {
    public final C16490t9 A00;
    public final AtomicInteger A01 = new AtomicInteger();

    public C17410v2(C16490t9 r2) {
        this.A00 = r2;
    }

    public final void A00(String str, Object[] objArr, int i2) {
        if (this.A01.getAndIncrement() < 5) {
            C29631aw r1 = new C29631aw();
            r1.A00 = Integer.valueOf(i2);
            if (str != null) {
                r1.A01 = String.format(Locale.US, str, objArr);
            }
            this.A00.A06(r1);
        }
    }

    public void A4u(int i2, String str) {
        A00("markerId:%d, annotationKey:%s", new Object[]{Integer.valueOf(i2), str}, 13);
    }

    public void A4v(int i2, String str) {
        A00("markerId:%d, key:%s", new Object[]{Integer.valueOf(i2), str}, 23);
    }

    public void A4w(int i2, String str, int i3) {
        A00("markerId:%d, annotationKey:%s", new Object[]{Integer.valueOf(i2), str}, 1);
    }

    public void A5I() {
        A00((String) null, new Object[0], 17);
    }

    public void A8c(String str) {
        A00("errorString:%s", new Object[]{str}, 16);
    }

    public void A8d(String str) {
        A00("errorString:%s", new Object[]{str}, 11);
    }

    public void A8e(String str) {
        A00("errorString:%s", new Object[]{str}, 15);
    }

    public void A8f(String str) {
        if (str != null && str.length() > 200) {
            str = str.substring(0, 200);
        }
        A00("errorString:%s", new Object[]{str}, 10);
    }

    public void A8g(String str) {
        A00("errorString:%s", new Object[]{str}, 8);
    }

    public void A8m(int i2) {
        A00("markerId:%d", new Object[]{Integer.valueOf(i2)}, 22);
    }

    public void AHs(String str, double d2, int i2) {
        A00("markerId:%d, annotationKey:%s, value:%s", new Object[]{Integer.valueOf(i2), str, Double.toString(d2)}, 7);
    }

    public void AK1(int i2, String str) {
        A00("markerId:%d, errorString:%s", new Object[]{Integer.valueOf(i2), str}, 6);
    }

    public void ALO() {
        A00((String) null, new Object[0], 9);
    }

    public void ALQ(int i2) {
        A00("markerId:%d", new Object[]{Integer.valueOf(i2)}, 3);
    }

    public void ALR(int i2) {
        A00("markerId:%d", new Object[]{Integer.valueOf(i2)}, 2);
    }

    public void ALp(int i2) {
        A00("markerId:%d", new Object[]{Integer.valueOf(i2)}, 20);
    }

    public void Aaa(int i2, String str) {
        A00("markerId:%d, data:%s", new Object[]{Integer.valueOf(i2), str}, 14);
    }

    public void Aab(int i2, String str) {
        A00("markerId:%d, pointName:%s", new Object[]{Integer.valueOf(i2), str}, 12);
    }

    public void Aac(int i2, String str) {
        A00("markerId:%d, pointName:%s", new Object[]{Integer.valueOf(i2), str}, 5);
    }

    public void AcD(String str) {
        A00("msg: %s", new Object[]{str}, 24);
    }

    public void Ah0(Collection collection) {
        Object[] objArr = new Object[1];
        String str = "null";
        if (collection != null) {
            str = collection.toString();
        }
        objArr[0] = str;
        A00("allOpenMarkerIds:%s", objArr, 4);
    }

    public void AhB() {
        A00((String) null, new Object[0], 18);
    }
}
