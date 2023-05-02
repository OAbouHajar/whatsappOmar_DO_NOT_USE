package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.29e  reason: invalid class name and case insensitive filesystem */
public class C455329e extends WeakReference {
    public final long A00;
    public final String A01;
    public final WeakReference A02 = new WeakReference(new Object());

    public C455329e(Object obj, String str, ReferenceQueue referenceQueue, long j2) {
        super(obj, referenceQueue);
        this.A01 = str;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("KeyedWeakReference{key='");
        sb.append(this.A01);
        sb.append('\'');
        sb.append(", timestamp=");
        sb.append(this.A00);
        sb.append(", canary=");
        sb.append(this.A02);
        sb.append(", confirmMarker=");
        sb.append((Object) null);
        sb.append('}');
        return sb.toString();
    }
}
