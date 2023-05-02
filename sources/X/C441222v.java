package X;

import org.json.JSONArray;

/* renamed from: X.22v  reason: invalid class name and case insensitive filesystem */
public final class C441222v extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ JSONArray $this_iterator;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C441222v(JSONArray jSONArray) {
        super(1);
        this.$this_iterator = jSONArray;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        return this.$this_iterator.get(((Number) obj).intValue());
    }
}
