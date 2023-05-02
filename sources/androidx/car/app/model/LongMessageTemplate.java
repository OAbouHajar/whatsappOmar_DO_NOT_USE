package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;
import X.C11770jJ;
import java.util.Collections;
import java.util.List;

public final class LongMessageTemplate implements C11770jJ {
    public final List mActionList = Collections.emptyList();
    public final ActionStrip mActionStrip = null;
    public final Action mHeaderAction = null;
    public final CarText mMessage = null;
    public final CarText mTitle = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongMessageTemplate)) {
            return false;
        }
        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
        return AnonymousClass09S.A00(this.mTitle, longMessageTemplate.mTitle) && AnonymousClass09S.A00(this.mMessage, longMessageTemplate.mMessage) && AnonymousClass09S.A00(this.mHeaderAction, longMessageTemplate.mHeaderAction) && AnonymousClass09S.A00(this.mActionList, longMessageTemplate.mActionList) && AnonymousClass09S.A00(this.mActionStrip, longMessageTemplate.mActionStrip);
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.mTitle;
        objArr[1] = this.mMessage;
        objArr[2] = this.mHeaderAction;
        objArr[3] = this.mActionList;
        return AnonymousClass000.A0F(this.mActionStrip, objArr, 4);
    }

    public String toString() {
        return "LongMessageTemplate";
    }
}
