package androidx.car.app.navigation.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;

public final class Destination {
    public final CarText mAddress = null;
    public final CarIcon mImage = null;
    public final CarText mName = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Destination)) {
            return false;
        }
        Destination destination = (Destination) obj;
        return AnonymousClass09S.A00(this.mName, destination.mName) && AnonymousClass09S.A00(this.mAddress, destination.mAddress) && AnonymousClass09S.A00(this.mImage, destination.mImage);
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.mName;
        objArr[1] = this.mAddress;
        return AnonymousClass000.A0F(this.mImage, objArr, 2);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[name: ");
        A0r.append(CarText.A00(this.mName));
        A0r.append(", address: ");
        A0r.append(CarText.A00(this.mAddress));
        A0r.append(", image: ");
        A0r.append(this.mImage);
        return AnonymousClass000.A0h("]", A0r);
    }
}
