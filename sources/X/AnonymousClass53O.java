package X;

import android.util.Log;

/* renamed from: X.53O  reason: invalid class name */
public final /* synthetic */ class AnonymousClass53O implements C109025Qk {
    public final /* synthetic */ String A00;

    public /* synthetic */ AnonymousClass53O(String str) {
        this.A00 = str;
    }

    public final void AQO(Object obj, Object obj2, Object obj3, boolean z2) {
        String str = this.A00;
        String str2 = (String) obj;
        if (z2) {
            StringBuilder A0r = AnonymousClass000.A0r("Bloks: CacheShards evicted ");
            A0r.append(str);
            A0r.append(" :: ");
            Log.d("Whatsapp", AnonymousClass000.A0h(str2, A0r));
        }
    }
}
