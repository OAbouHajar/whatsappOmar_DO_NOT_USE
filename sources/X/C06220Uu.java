package X;

import android.graphics.Bitmap;
import java.util.Vector;

/* renamed from: X.0Uu  reason: invalid class name and case insensitive filesystem */
public class C06220Uu {
    public static final Vector A02 = new Vector();
    public int A00;
    public final Object[] A01;

    public C06220Uu(int i2) {
        this.A01 = new Object[i2];
        A02.add(this);
    }

    public synchronized Object A00() {
        int i2 = this.A00;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.A01;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.A00 = i3;
        return obj;
    }

    public synchronized void A01() {
        Object[] objArr = this.A01;
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null && (obj instanceof Bitmap)) {
                ((Bitmap) obj).recycle();
            }
            objArr[i2] = null;
        }
        this.A00 = 0;
    }

    public synchronized void A02(Object obj) {
        int i2 = 0;
        while (true) {
            int i3 = this.A00;
            if (i2 < i3) {
                if (this.A01[i2] == obj) {
                    break;
                }
                i2++;
            } else {
                Object[] objArr = this.A01;
                if (i3 < objArr.length) {
                    objArr[i3] = obj;
                    this.A00 = i3 + 1;
                }
            }
        }
    }
}
