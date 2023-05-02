package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11770jJ;

public final class PaneTemplate implements C11770jJ {
    public final ActionStrip mActionStrip = null;
    public final Action mHeaderAction = null;
    public final Pane mPane = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaneTemplate)) {
            return false;
        }
        PaneTemplate paneTemplate = (PaneTemplate) obj;
        return AnonymousClass09S.A00(this.mTitle, paneTemplate.mTitle) && AnonymousClass09S.A00(this.mPane, paneTemplate.mPane) && AnonymousClass09S.A00(this.mHeaderAction, paneTemplate.mHeaderAction) && AnonymousClass09S.A00(this.mActionStrip, paneTemplate.mActionStrip);
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.mTitle;
        objArr[1] = this.mPane;
        objArr[2] = this.mHeaderAction;
        return AnonymousClass000.A0F(this.mActionStrip, objArr, 3);
    }

    public String toString() {
        return "PaneTemplate";
    }
}
