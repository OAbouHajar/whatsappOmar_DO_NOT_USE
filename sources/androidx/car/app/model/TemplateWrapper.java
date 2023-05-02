package androidx.car.app.model;

import X.AnonymousClass000;
import X.C11770jJ;
import java.util.List;

public final class TemplateWrapper {
    public String mId = "";
    public C11770jJ mTemplate = null;
    public List mTemplateInfoForScreenStack = AnonymousClass000.A0u();

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("[template: ");
        A0r.append(this.mTemplate);
        A0r.append(", ID: ");
        A0r.append(this.mId);
        return AnonymousClass000.A0h("]", A0r);
    }
}
