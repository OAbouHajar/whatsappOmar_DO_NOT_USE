package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1xt  reason: invalid class name and case insensitive filesystem */
public class C42491xt {
    public final Pair A00;
    public final C17930vs A01;
    public final C17930vs A02;
    public final UserJid A03;

    public C42491xt(Pair pair, UserJid userJid, HashMap hashMap, HashMap hashMap2) {
        this.A03 = userJid;
        this.A00 = pair;
        this.A01 = C17930vs.copyOf((Map) hashMap);
        this.A02 = C17930vs.copyOf((Map) hashMap2);
    }
}
