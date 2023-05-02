package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11710jD;

public final class GridItem {
    public final CarIcon mImage = null;
    public final int mImageType = 2;
    public final boolean mIsLoading = false;
    public final C11710jD mOnClickDelegate = null;
    public final CarText mText = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridItem)) {
            return false;
        }
        GridItem gridItem = (GridItem) obj;
        return this.mIsLoading == gridItem.mIsLoading && AnonymousClass09S.A00(this.mTitle, gridItem.mTitle) && AnonymousClass09S.A00(this.mText, gridItem.mText) && AnonymousClass09S.A00(this.mImage, gridItem.mImage) && AnonymousClass09S.A01(Boolean.valueOf(AnonymousClass000.A1W(this.mOnClickDelegate)), AnonymousClass000.A1W(gridItem.mOnClickDelegate)) && this.mImageType == gridItem.mImageType;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        boolean z2 = false;
        objArr[0] = Boolean.valueOf(this.mIsLoading);
        objArr[1] = this.mTitle;
        objArr[2] = this.mImage;
        objArr[3] = Integer.valueOf(this.mImageType);
        if (this.mOnClickDelegate == null) {
            z2 = true;
        }
        return AnonymousClass000.A0F(Boolean.valueOf(z2), objArr, 4);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[title: ");
        A0r.append(CarText.A00(this.mTitle));
        A0r.append(", text: ");
        A0r.append(CarText.A00(this.mText));
        A0r.append(", image: ");
        A0r.append(this.mImage);
        A0r.append(", isLoading: ");
        A0r.append(this.mIsLoading);
        return AnonymousClass000.A0h("]", A0r);
    }
}
