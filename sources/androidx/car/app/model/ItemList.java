package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11730jF;
import X.C11740jG;
import java.util.Collections;
import java.util.List;

public final class ItemList {
    public final List mItems = Collections.emptyList();
    public final CarText mNoItemsMessage = null;
    public final C11730jF mOnItemVisibilityChangedDelegate = null;
    public final C11740jG mOnSelectedDelegate = null;
    public final int mSelectedIndex = 0;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemList)) {
            return false;
        }
        ItemList itemList = (ItemList) obj;
        return this.mSelectedIndex == itemList.mSelectedIndex && AnonymousClass09S.A00(this.mItems, itemList.mItems) && AnonymousClass09S.A01(Boolean.valueOf(AnonymousClass000.A1W(this.mOnSelectedDelegate)), AnonymousClass000.A1W(itemList.mOnSelectedDelegate)) && AnonymousClass09S.A01(Boolean.valueOf(AnonymousClass000.A1W(this.mOnItemVisibilityChangedDelegate)), AnonymousClass000.A1W(itemList.mOnItemVisibilityChangedDelegate)) && AnonymousClass09S.A00(this.mNoItemsMessage, itemList.mNoItemsMessage);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        boolean z2 = false;
        objArr[0] = Integer.valueOf(this.mSelectedIndex);
        objArr[1] = this.mItems;
        objArr[2] = Boolean.valueOf(AnonymousClass000.A1W(this.mOnSelectedDelegate));
        if (this.mOnItemVisibilityChangedDelegate == null) {
            z2 = true;
        }
        objArr[3] = Boolean.valueOf(z2);
        return AnonymousClass000.A0F(this.mNoItemsMessage, objArr, 4);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ items: ");
        List list = this.mItems;
        A0r.append(list != null ? list.toString() : null);
        A0r.append(", selected: ");
        A0r.append(this.mSelectedIndex);
        return AnonymousClass000.A0h("]", A0r);
    }
}
