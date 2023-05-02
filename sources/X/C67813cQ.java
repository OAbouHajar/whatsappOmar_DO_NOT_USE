package X;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3cQ  reason: invalid class name and case insensitive filesystem */
public abstract class C67813cQ extends C67823cR implements Serializable {
    public static final long serialVersionUID = 0;
    public final transient C17930vs map;
    public final transient int size;

    public C67813cQ(C17930vs r1, int i2) {
        this.map = r1;
        this.size = i2;
    }

    public C17930vs asMap() {
        return this.map;
    }

    @Deprecated
    public final void clear() {
        throw C13680ns.A0m();
    }

    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    public Map createAsMap() {
        throw AnonymousClass3K4.A0T("should never be called");
    }

    public Set createKeySet() {
        throw AnonymousClass3K4.A0T("unreachable");
    }

    public C17390v0 createValues() {
        return new C67773cM(this);
    }

    public C17380uz keySet() {
        return this.map.keySet();
    }

    @Deprecated
    public final boolean put(Object obj, Object obj2) {
        throw C13680ns.A0m();
    }

    public int size() {
        return this.size;
    }

    public C28031Ub valueIterator() {
        return new C68153cy(this);
    }

    public C17390v0 values() {
        return (C17390v0) super.values();
    }
}
