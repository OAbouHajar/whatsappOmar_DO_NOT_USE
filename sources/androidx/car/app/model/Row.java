package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11710jD;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Row {
    public final CarIcon mImage = null;
    public final boolean mIsBrowsable = false;
    public final Metadata mMetadata = Metadata.A00;
    public final C11710jD mOnClickDelegate = null;
    public final int mRowImageType = 1;
    public final List mTexts = Collections.emptyList();
    public final CarText mTitle = null;
    public final Toggle mToggle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Row)) {
            return false;
        }
        Row row = (Row) obj;
        return AnonymousClass09S.A00(this.mTitle, row.mTitle) && AnonymousClass09S.A00(this.mTexts, row.mTexts) && AnonymousClass09S.A00(this.mImage, row.mImage) && AnonymousClass09S.A00(this.mToggle, row.mToggle) && AnonymousClass09S.A01(Boolean.valueOf(AnonymousClass000.A1W(this.mOnClickDelegate)), AnonymousClass000.A1W(row.mOnClickDelegate)) && AnonymousClass09S.A00(this.mMetadata, row.mMetadata) && this.mIsBrowsable == row.mIsBrowsable && this.mRowImageType == row.mRowImageType;
    }

    public int hashCode() {
        Object[] objArr = new Object[8];
        boolean z2 = false;
        objArr[0] = this.mTitle;
        objArr[1] = this.mTexts;
        objArr[2] = this.mImage;
        objArr[3] = this.mToggle;
        if (this.mOnClickDelegate == null) {
            z2 = true;
        }
        objArr[4] = Boolean.valueOf(z2);
        objArr[5] = this.mMetadata;
        objArr[6] = Boolean.valueOf(this.mIsBrowsable);
        AnonymousClass000.A1M(objArr, this.mRowImageType, 7);
        return Arrays.hashCode(objArr);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[title: ");
        A0r.append(CarText.A00(this.mTitle));
        A0r.append(", text count: ");
        List list = this.mTexts;
        A0r.append(list != null ? list.size() : 0);
        A0r.append(", image: ");
        A0r.append(this.mImage);
        A0r.append(", isBrowsable: ");
        A0r.append(this.mIsBrowsable);
        return AnonymousClass000.A0h("]", A0r);
    }
}
