package androidx.car.app.hardware.info;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.car.app.hardware.common.CarValue;

public final class Model {
    public final CarValue mManufacturer;
    public final CarValue mName;
    public final CarValue mYear = CarValue.A03;

    public Model() {
        CarValue carValue = CarValue.A05;
        this.mName = carValue;
        this.mManufacturer = carValue;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Model)) {
            return false;
        }
        Model model = (Model) obj;
        return AnonymousClass09S.A00(this.mName, model.mName) && AnonymousClass09S.A00(this.mYear, model.mYear) && AnonymousClass09S.A00(this.mManufacturer, model.mManufacturer);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.mName;
        objArr[1] = this.mYear;
        return AnonymousClass000.A0F(this.mManufacturer, objArr, 2);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ name: ");
        A0r.append(this.mName);
        A0r.append(", year: ");
        A0r.append(this.mYear);
        A0r.append(", manufacturer: ");
        A0r.append(this.mManufacturer);
        return AnonymousClass000.A0h("]", A0r);
    }
}
