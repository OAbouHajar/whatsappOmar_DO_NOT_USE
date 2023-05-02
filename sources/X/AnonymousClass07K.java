package X;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.07K  reason: invalid class name */
public final class AnonymousClass07K extends C003401n {
    public static final AnonymousClass04o A06 = new AnonymousClass07L();
    public boolean A00 = false;
    public boolean A01 = false;
    public final HashMap A02 = new HashMap();
    public final HashMap A03 = new HashMap();
    public final HashMap A04 = new HashMap();
    public final boolean A05;

    public AnonymousClass07K(boolean z2) {
        this.A05 = z2;
    }

    public void A04() {
        if (AnonymousClass02C.A02(3)) {
            StringBuilder sb = new StringBuilder("onCleared called for ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        this.A00 = true;
    }

    public void A05(AnonymousClass01A r5) {
        String obj;
        if (this.A01) {
            if (AnonymousClass02C.A02(2)) {
                obj = "Ignoring removeRetainedFragment as the state is already saved";
            } else {
                return;
            }
        } else if (this.A03.remove(r5.A0T) != null && AnonymousClass02C.A02(2)) {
            StringBuilder sb = new StringBuilder("Updating retained Fragments: Removed ");
            sb.append(r5);
            obj = sb.toString();
        } else {
            return;
        }
        Log.v("FragmentManager", obj);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass07K.class != obj.getClass()) {
                return false;
            }
            AnonymousClass07K r5 = (AnonymousClass07K) obj;
            if (!this.A03.equals(r5.A03) || !this.A02.equals(r5.A02) || !this.A04.equals(r5.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.A03.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A04.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.A03.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.A02.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.A04.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
