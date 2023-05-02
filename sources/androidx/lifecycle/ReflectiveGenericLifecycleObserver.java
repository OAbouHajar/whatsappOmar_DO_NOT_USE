package androidx.lifecycle;

import X.AnonymousClass05T;
import X.AnonymousClass0W6;
import X.C001300o;
import X.C011405n;
import X.C05990Tu;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

@Deprecated
public class ReflectiveGenericLifecycleObserver implements AnonymousClass05T {
    public final C05990Tu A00;
    public final Object A01;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.A01 = obj;
        AnonymousClass0W6 r2 = AnonymousClass0W6.A02;
        Class<?> cls = obj.getClass();
        C05990Tu r0 = (C05990Tu) r2.A00.get(cls);
        this.A00 = r0 == null ? r2.A01(cls, (Method[]) null) : r0;
    }

    public void AXa(C011405n r4, C001300o r5) {
        C05990Tu r0 = this.A00;
        Object obj = this.A01;
        Map map = r0.A00;
        C05990Tu.A00(r4, r5, obj, (List) map.get(r4));
        C05990Tu.A00(r4, r5, obj, (List) map.get(C011405n.ON_ANY));
    }
}
