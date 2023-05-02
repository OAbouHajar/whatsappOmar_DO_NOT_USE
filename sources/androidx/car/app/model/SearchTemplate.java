package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11750jH;
import X.C11770jJ;

public final class SearchTemplate implements C11770jJ {
    public final ActionStrip mActionStrip = null;
    public final Action mHeaderAction = null;
    public final String mInitialSearchText = null;
    public final boolean mIsLoading = false;
    public final ItemList mItemList = null;
    public final C11750jH mSearchCallbackDelegate = null;
    public final String mSearchHint = null;
    public final boolean mShowKeyboardByDefault = true;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTemplate)) {
            return false;
        }
        SearchTemplate searchTemplate = (SearchTemplate) obj;
        return this.mIsLoading == searchTemplate.mIsLoading && AnonymousClass09S.A00(this.mInitialSearchText, searchTemplate.mInitialSearchText) && AnonymousClass09S.A00(this.mSearchHint, searchTemplate.mSearchHint) && AnonymousClass09S.A00(this.mItemList, searchTemplate.mItemList) && AnonymousClass09S.A00(this.mHeaderAction, searchTemplate.mHeaderAction) && AnonymousClass09S.A00(this.mActionStrip, searchTemplate.mActionStrip) && this.mShowKeyboardByDefault == searchTemplate.mShowKeyboardByDefault;
    }

    public int hashCode() {
        Object[] objArr = new Object[7];
        objArr[0] = this.mInitialSearchText;
        objArr[1] = Boolean.valueOf(this.mIsLoading);
        objArr[2] = this.mSearchHint;
        objArr[3] = this.mItemList;
        objArr[4] = Boolean.valueOf(this.mShowKeyboardByDefault);
        objArr[5] = this.mHeaderAction;
        return AnonymousClass000.A0F(this.mActionStrip, objArr, 6);
    }

    public String toString() {
        return "SearchTemplate";
    }
}
