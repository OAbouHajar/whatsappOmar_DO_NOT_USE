package X;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: X.4RV  reason: invalid class name */
public class AnonymousClass4RV {
    public final C109755Tl A00;
    public final C88534af A01;
    public final Collection A02;
    public final Set A03;

    public AnonymousClass4RV(C109755Tl r2, C88534af r3, Collection collection, EnumSet enumSet) {
        C90264dr.A03(r3, "mappingProvider can not be null");
        C90264dr.A03(enumSet, "setOptions can not be null");
        C90264dr.A03(collection, "evaluationListeners can not be null");
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = Collections.unmodifiableSet(enumSet);
        this.A02 = Collections.unmodifiableCollection(collection);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4RV r5 = (AnonymousClass4RV) obj;
            if (!(this.A00.getClass() == r5.A00.getClass() && this.A01.getClass() == r5.A01.getClass() && AnonymousClass09S.A00(this.A03, r5.A03))) {
                return false;
            }
        }
        return true;
    }
}
