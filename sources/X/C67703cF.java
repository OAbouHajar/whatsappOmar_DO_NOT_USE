package X;

import java.util.Map;

/* renamed from: X.3cF  reason: invalid class name and case insensitive filesystem */
public final class C67703cF extends C1049557o {
    public final Object key;
    public int lastKnownIndex;
    public final /* synthetic */ C105935Bu this$0;

    public C67703cF(C105935Bu r2, int i2) {
        this.this$0 = r2;
        this.key = r2.key(i2);
        this.lastKnownIndex = i2;
    }

    private void updateLastKnownIndex() {
        int i2 = this.lastKnownIndex;
        if (i2 == -1 || i2 >= this.this$0.size() || !AnonymousClass45Q.A00(this.key, this.this$0.key(this.lastKnownIndex))) {
            this.lastKnownIndex = this.this$0.indexOf(this.key);
        }
    }

    public Object getKey() {
        return this.key;
    }

    public Object getValue() {
        Map delegateOrNull = this.this$0.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.get(this.key);
        }
        updateLastKnownIndex();
        int i2 = this.lastKnownIndex;
        return i2 == -1 ? AnonymousClass45R.unsafeNull() : this.this$0.value(i2);
    }

    public Object setValue(Object obj) {
        Map delegateOrNull = this.this$0.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.put(this.key, obj);
        }
        updateLastKnownIndex();
        int i2 = this.lastKnownIndex;
        if (i2 == -1) {
            this.this$0.put(this.key, obj);
            return AnonymousClass45R.unsafeNull();
        }
        C105935Bu r0 = this.this$0;
        Object access$600 = r0.value(i2);
        r0.setValue(i2, obj);
        return access$600;
    }
}
