package androidx.car.app.model;

import X.AnonymousClass000;
import X.C11700jC;

public final class Toggle {
    public final boolean mIsChecked = false;
    public final C11700jC mOnCheckedChangeDelegate = null;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Toggle) && this.mIsChecked == ((Toggle) obj).mIsChecked;
        }
        return true;
    }

    public int hashCode() {
        return Boolean.valueOf(this.mIsChecked).hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ isChecked: ");
        A0r.append(this.mIsChecked);
        return AnonymousClass000.A0h("]", A0r);
    }
}
