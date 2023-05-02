package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import java.util.Collections;
import java.util.List;

public final class Pane {
    public final List mActionList = Collections.emptyList();
    public final CarIcon mImage = null;
    public final boolean mIsLoading = false;
    public final List mRows = Collections.emptyList();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pane)) {
            return false;
        }
        Pane pane = (Pane) obj;
        return this.mIsLoading == pane.mIsLoading && AnonymousClass09S.A00(this.mActionList, pane.mActionList) && AnonymousClass09S.A00(this.mRows, pane.mRows) && AnonymousClass09S.A00(this.mImage, pane.mImage);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mRows;
        objArr[1] = this.mActionList;
        objArr[2] = Boolean.valueOf(this.mIsLoading);
        return AnonymousClass000.A0F(this.mImage, objArr, 3);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[ rows: ");
        List list = this.mRows;
        A0r.append(list != null ? list.toString() : null);
        A0r.append(", action list: ");
        A0r.append(this.mActionList);
        return AnonymousClass000.A0h("]", A0r);
    }
}
