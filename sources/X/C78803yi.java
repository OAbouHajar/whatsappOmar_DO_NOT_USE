package X;

import com.whatsapp.jid.GroupJid;
import java.lang.ref.WeakReference;

/* renamed from: X.3yi  reason: invalid class name and case insensitive filesystem */
public class C78803yi extends C16690tT {
    public final AnonymousClass195 A00;
    public final GroupJid A01;
    public final WeakReference A02;

    public C78803yi(AnonymousClass5P9 r2, AnonymousClass195 r3, GroupJid groupJid) {
        this.A00 = r3;
        this.A02 = C13690nt.A0h(r2);
        this.A01 = groupJid;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A00.A03(this.A01);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C38571r0 r2 = (C38571r0) obj;
        AnonymousClass5P9 r0 = (AnonymousClass5P9) this.A02.get();
        if (r0 != null) {
            r0.ASU(r2);
        }
    }
}
