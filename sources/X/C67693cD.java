package X;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.3cD  reason: invalid class name and case insensitive filesystem */
public abstract class C67693cD extends C67723cH implements AnonymousClass5Ue {
    public static final long serialVersionUID = 6588350623831699109L;

    public C67693cD(Map map) {
        super(map);
    }

    public Collection unmodifiableCollectionSubclass(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    public Collection wrapCollection(Object obj, Collection collection) {
        return wrapList(obj, (List) collection, (C105845Bk) null);
    }
}
