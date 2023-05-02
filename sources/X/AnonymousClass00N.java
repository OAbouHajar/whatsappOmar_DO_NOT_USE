package X;

import com.facebook.redex.IDxMCollectionsShape20S0100000_I0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.00N  reason: invalid class name */
public class AnonymousClass00N<K, V> extends AnonymousClass00O<K, V> implements Map<K, V> {
    public AnonymousClass05D A00;

    public AnonymousClass00N() {
    }

    public AnonymousClass00N(int i2) {
        super(i2);
    }

    public AnonymousClass00N(AnonymousClass00O r1) {
        A08(r1);
    }

    public Set entrySet() {
        AnonymousClass05D r1 = this.A00;
        if (r1 == null) {
            r1 = new IDxMCollectionsShape20S0100000_I0(this, 0);
            this.A00 = r1;
        }
        C10760he r0 = r1.A00;
        if (r0 != null) {
            return r0;
        }
        C10760he r02 = new C10760he(r1);
        r1.A00 = r02;
        return r02;
    }

    public Set keySet() {
        AnonymousClass05D r1 = this.A00;
        if (r1 == null) {
            r1 = new IDxMCollectionsShape20S0100000_I0(this, 0);
            this.A00 = r1;
        }
        AnonymousClass05E r0 = r1.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass05E r02 = new AnonymousClass05E(r1);
        r1.A01 = r02;
        return r02;
    }

    public void putAll(Map map) {
        A07(this.A00 + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection values() {
        AnonymousClass05D r1 = this.A00;
        if (r1 == null) {
            r1 = new IDxMCollectionsShape20S0100000_I0(this, 0);
            this.A00 = r1;
        }
        C10680hW r0 = r1.A02;
        if (r0 != null) {
            return r0;
        }
        C10680hW r02 = new C10680hW(r1);
        r1.A02 = r02;
        return r02;
    }
}
