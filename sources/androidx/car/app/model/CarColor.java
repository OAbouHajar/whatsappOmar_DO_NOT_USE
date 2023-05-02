package androidx.car.app.model;

import X.AnonymousClass000;

public final class CarColor {
    public static final CarColor A00 = new CarColor(1);
    public final int mColor = 0;
    public final int mColorDark = 0;
    public final int mType = 1;

    public CarColor() {
    }

    public CarColor(int i2) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarColor)) {
            return false;
        }
        CarColor carColor = (CarColor) obj;
        return this.mColor == carColor.mColor && this.mColorDark == carColor.mColorDark && this.mType == carColor.mType;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        AnonymousClass000.A1K(objArr, this.mType);
        AnonymousClass000.A1L(objArr, this.mColor);
        return AnonymousClass000.A0F(Integer.valueOf(this.mColorDark), objArr, 2);
    }

    public String toString() {
        String str;
        StringBuilder A0r = AnonymousClass000.A0r("[type: ");
        switch (this.mType) {
            case 0:
                str = "CUSTOM";
                break;
            case 1:
                str = "DEFAULT";
                break;
            case 2:
                str = "PRIMARY";
                break;
            case 3:
                str = "SECONDARY";
                break;
            case 4:
                str = "RED";
                break;
            case 5:
                str = "GREEN";
                break;
            case 6:
                str = "BLUE";
                break;
            case 7:
                str = "YELLOW";
                break;
            default:
                str = "<unknown>";
                break;
        }
        A0r.append(str);
        A0r.append(", color: ");
        A0r.append(this.mColor);
        A0r.append(", dark: ");
        A0r.append(this.mColorDark);
        return AnonymousClass000.A0h("]", A0r);
    }
}
