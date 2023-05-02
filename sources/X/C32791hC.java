package X;

import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1hC  reason: invalid class name and case insensitive filesystem */
public class C32791hC implements C32801hD {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public boolean A60(C32841hK r3, File file) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            if (!((C32801hD) it.next()).A60(r3, file)) {
                return false;
            }
        }
        return true;
    }

    public void AVR(C32841hK r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C32801hD) it.next()).AVR(r3);
        }
    }

    public void AVS(C32841hK r3, int i2) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C32801hD) it.next()).AVS(r3, i2);
        }
    }

    public void AYz(C32841hK r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C32801hD) it.next()).AYz(r3);
        }
    }

    public void AZ0(int i2, int i3, int i4, int i5) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C32801hD) it.next()).AZ0(i2, i3, i4, i5);
        }
    }

    public void AZ1(C32841hK r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C32801hD) it.next()).AZ1(r3);
        }
    }

    public void AZ2(C32841hK r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C32801hD) it.next()).AZ2(r3);
        }
    }

    public void AZ3(C32841hK r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C32801hD) it.next()).AZ3(r3);
        }
    }

    public void AZ4(C32841hK r3, int i2) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C32761h8) it.next()).AZ4(r3, i2);
        }
    }

    public void AZ5(C32841hK r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C32761h8) it.next()).AZ5(r3);
        }
    }

    public void AZ6(C32841hK r3, Throwable th) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C32761h8) it.next()).AZ6(r3, th);
        }
    }

    public void AZ7(C32841hK r3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C32761h8) it.next()).AZ7(r3);
        }
    }
}
