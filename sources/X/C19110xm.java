package X;

import java.util.Map;

/* renamed from: X.0xm  reason: invalid class name and case insensitive filesystem */
public class C19110xm {
    public final Map A00;

    public C19110xm(Map map) {
        this.A00 = map;
    }

    public C17810vg A00(Class cls) {
        AnonymousClass01D r0 = (AnonymousClass01D) this.A00.get(cls);
        if (r0 != null) {
            return (C17810vg) r0.get();
        }
        StringBuilder sb = new StringBuilder("No bridge with type ");
        sb.append(cls);
        sb.append(" was registered.");
        throw new IllegalStateException(sb.toString());
    }
}
