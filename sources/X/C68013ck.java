package X;

/* renamed from: X.3ck  reason: invalid class name and case insensitive filesystem */
public class C68013ck extends C87494Wz {
    public final Object key;
    public int lastKnownIndex;
    public final /* synthetic */ C90894f1 this$0;

    public C68013ck(C90894f1 r2, int i2) {
        this.this$0 = r2;
        this.key = r2.keys[i2];
        this.lastKnownIndex = i2;
    }

    public int getCount() {
        updateLastKnownIndex();
        int i2 = this.lastKnownIndex;
        if (i2 == -1) {
            return 0;
        }
        return this.this$0.values[i2];
    }

    public Object getElement() {
        return this.key;
    }

    public void updateLastKnownIndex() {
        int i2 = this.lastKnownIndex;
        if (i2 != -1) {
            C90894f1 r2 = this.this$0;
            if (i2 < r2.size() && AnonymousClass45Q.A00(this.key, r2.keys[i2])) {
                return;
            }
        }
        this.lastKnownIndex = this.this$0.indexOf(this.key);
    }
}
