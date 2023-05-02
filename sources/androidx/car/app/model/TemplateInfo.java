package androidx.car.app.model;

import X.AnonymousClass000;
import X.AnonymousClass09S;

public final class TemplateInfo {
    public final Class mTemplateClass = null;
    public final String mTemplateId = null;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateInfo)) {
            return false;
        }
        TemplateInfo templateInfo = (TemplateInfo) obj;
        return AnonymousClass09S.A00(this.mTemplateClass, templateInfo.mTemplateClass) && AnonymousClass09S.A00(this.mTemplateId, templateInfo.mTemplateId);
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.mTemplateClass;
        return AnonymousClass000.A0F(this.mTemplateId, objArr, 1);
    }
}
