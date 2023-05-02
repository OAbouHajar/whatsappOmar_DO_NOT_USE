package X;

import com.whatsapp.jid.GroupJid;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* renamed from: X.586  reason: invalid class name */
public final /* synthetic */ class AnonymousClass586 implements Callable {
    public final /* synthetic */ C204410d A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ HashSet A02;

    public /* synthetic */ AnonymousClass586(C204410d r1, String str, HashSet hashSet) {
        this.A00 = r1;
        this.A02 = hashSet;
        this.A01 = str;
    }

    public final Object call() {
        C204410d r1 = this.A00;
        HashSet hashSet = this.A02;
        return Integer.valueOf(r1.A03.A02(r1.A05.A00, (GroupJid) null, this.A01, C13680ns.A0n(hashSet), 26, false));
    }
}
