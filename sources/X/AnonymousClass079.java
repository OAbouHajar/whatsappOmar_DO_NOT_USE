package X;

import android.database.Observable;

/* renamed from: X.079  reason: invalid class name */
public class AnonymousClass079 extends Observable {
    public void A00() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AnonymousClass078) this.mObservers.get(size)).A00();
            } else {
                return;
            }
        }
    }

    public void A01(int i2, int i3) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((AnonymousClass078) this.mObservers.get(size)).A04(i2, i3, 1);
        }
    }

    public void A02(int i2, int i3) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AnonymousClass078) this.mObservers.get(size)).A02(i2, i3);
            } else {
                return;
            }
        }
    }

    public void A03(int i2, int i3) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AnonymousClass078) this.mObservers.get(size)).A03(i2, i3);
            } else {
                return;
            }
        }
    }

    public void A04(Object obj, int i2, int i3) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AnonymousClass078) this.mObservers.get(size)).A05(obj, i2, i3);
            } else {
                return;
            }
        }
    }

    public boolean A05() {
        return !this.mObservers.isEmpty();
    }
}
