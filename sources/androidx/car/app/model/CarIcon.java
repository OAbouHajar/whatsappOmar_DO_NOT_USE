package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.core.graphics.drawable.IconCompat;

public final class CarIcon {
    public static final CarIcon A00;
    public static final CarIcon A01;
    public static final CarIcon A02;
    public static final CarIcon A03;
    public static final CarIcon A04;
    public final IconCompat mIcon;
    public final CarColor mTint;
    public final int mType;

    static {
        CarColor carColor = CarColor.A00;
        A01 = new CarIcon(carColor, 5);
        A02 = new CarIcon(carColor, 3);
        A00 = new CarIcon(carColor, 4);
        A03 = new CarIcon(carColor, 6);
        A04 = new CarIcon(carColor, 7);
    }

    public CarIcon() {
        this.mType = 1;
        this.mIcon = null;
        this.mTint = null;
    }

    public CarIcon(CarColor carColor, int i2) {
        this.mType = i2;
        this.mIcon = null;
        this.mTint = carColor;
    }

    public boolean equals(Object obj) {
        int A05;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarIcon)) {
            return false;
        }
        CarIcon carIcon = (CarIcon) obj;
        if (this.mType == carIcon.mType && AnonymousClass09S.A00(this.mTint, carIcon.mTint)) {
            IconCompat iconCompat = carIcon.mIcon;
            IconCompat iconCompat2 = this.mIcon;
            if (iconCompat2 == null) {
                if (iconCompat == null) {
                    return true;
                }
            } else if (iconCompat != null && (A05 = iconCompat2.A05()) == iconCompat.A05()) {
                if (A05 == 2) {
                    return AnonymousClass09S.A00(this.mIcon.A0D(), iconCompat.A0D()) && this.mIcon.A04() == iconCompat.A04();
                }
                if (A05 != 4 || AnonymousClass09S.A00(this.mIcon.A0A(), iconCompat.A0A())) {
                    return true;
                }
            }
        }
    }

    public int hashCode() {
        Object A0A;
        Object[] objArr = new Object[3];
        AnonymousClass000.A1K(objArr, this.mType);
        objArr[1] = this.mTint;
        IconCompat iconCompat = this.mIcon;
        if (iconCompat == null) {
            A0A = null;
        } else {
            int A05 = iconCompat.A05();
            if (A05 == 2) {
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append(this.mIcon.A0D());
                A0A = AnonymousClass000.A0l(A0o, this.mIcon.A04());
            } else {
                A0A = A05 == 4 ? this.mIcon.A0A() : Integer.valueOf(A05);
            }
        }
        return AnonymousClass000.A0F(A0A, objArr, 2);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[type: ");
        int i2 = this.mType;
        A0r.append(i2 != 1 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 6 ? i2 != 7 ? "<unknown>" : "PAN" : "ERROR" : "APP" : "ALERT" : "BACK" : "CUSTOM");
        A0r.append(", tint: ");
        A0r.append(this.mTint);
        return AnonymousClass000.A0h("]", A0r);
    }
}
