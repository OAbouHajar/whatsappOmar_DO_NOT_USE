package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;

public final class SectionedItemList {
    public final CarText mHeader = null;
    public final ItemList mItemList = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionedItemList)) {
            return false;
        }
        SectionedItemList sectionedItemList = (SectionedItemList) obj;
        return AnonymousClass09S.A00(this.mItemList, sectionedItemList.mItemList) && AnonymousClass09S.A00(this.mHeader, sectionedItemList.mHeader);
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.mItemList;
        return AnonymousClass000.A0F(this.mHeader, objArr, 1);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ items: ");
        A0r.append(this.mItemList);
        A0r.append(", has header: ");
        A0r.append(AnonymousClass000.A1V(this.mHeader));
        return AnonymousClass000.A0h("]", A0r);
    }
}
