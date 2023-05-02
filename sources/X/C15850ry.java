package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0ry  reason: invalid class name and case insensitive filesystem */
public class C15850ry {
    public Set A00;
    public final C14870pt A01;
    public final C15860rz A02;
    public final AnonymousClass11A A03;
    public final AnonymousClass195 A04;
    public final AnonymousClass1WA A05;

    public C15850ry(C14870pt r3, C15860rz r4, AnonymousClass11A r5, AnonymousClass195 r6, C16320sq r7) {
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = new AnonymousClass1WA(r7, false);
    }

    public final void A00() {
        synchronized (this) {
            if (this.A00 == null) {
                long j2 = ((SharedPreferences) this.A02.A01.get()).getLong("first_unseen_joinable_call", 0);
                HashSet hashSet = j2 > 0 ? new HashSet(this.A04.A05()) : new HashSet();
                this.A00 = hashSet;
                StringBuilder sb = new StringBuilder();
                sb.append("UnseenJoinableCallsBadge/init count:");
                sb.append(hashSet.size());
                sb.append(" timestamp:");
                sb.append(j2);
                Log.i(sb.toString());
            }
        }
    }
}
