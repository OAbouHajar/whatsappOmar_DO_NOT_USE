package X;

import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.0ve  reason: invalid class name and case insensitive filesystem */
public final class C17790ve {
    public final C217715j A00;
    public final C16320sq A01;
    public final Map A02;

    public C17790ve(C217715j r8, C15860rz r9, C16320sq r10) {
        C18450wi.A0H(r10, 1);
        C18450wi.A0H(r8, 2);
        C18450wi.A0H(r9, 3);
        this.A01 = r10;
        this.A00 = r8;
        this.A02 = C25411Jr.A06(new C25401Jq("community_home", new AnonymousClass28g(r9)), new C25401Jq("community", new C453828h(r9)), new C25401Jq("ephemeral", new AnonymousClass28i(r9)), new C25401Jq("ephemeral_view_once", new AnonymousClass28j(r9)), new C25401Jq("ephemeral_view_once_receiver", new C453928k(r9)));
        C217715j r0 = this.A00;
        r0.A05.add(new C454028l(this));
        this.A00.A00 = new AnonymousClass28d(this);
    }

    public final void A00(String str, Object obj) {
        Object obj2 = this.A02.get(str);
        if (!(obj2 instanceof C453728e) || obj2 == null) {
            StringBuilder sb = new StringBuilder("Support for the nux key ");
            sb.append(str);
            sb.append(" has not been added yet.");
            Log.e(sb.toString());
            return;
        }
        this.A01.Acl(new RunnableRunnableShape1S0300000_I0_1(obj2, obj, this, 31));
    }
}
