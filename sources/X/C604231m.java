package X;

import com.obwhatsapp.group.NewGroup;
import com.whatsapp.util.Log;

/* renamed from: X.31m  reason: invalid class name and case insensitive filesystem */
public class C604231m extends C33501ig {
    public final /* synthetic */ NewGroup A00;

    public C604231m(NewGroup newGroup) {
        this.A00 = newGroup;
    }

    public void A00() {
        Log.i("newgroup/onConversationsListChanged");
        NewGroup newGroup = this.A00;
        C16050sL r2 = (C16050sL) newGroup.A0c.get();
        if (r2 != null) {
            newGroup.A05.A0K(new AnonymousClass55V(newGroup, r2));
        }
    }

    public void A02(C15830rv r3) {
        Log.i("newgroup/onConversationAdded");
        NewGroup newGroup = this.A00;
        AnonymousClass01Q r0 = newGroup.A05;
        if (r0 != null && r0.A00.equals(r3)) {
            Log.i("newgroup/onConversationAdded/processing runAfterTempConversationAddedToDb");
            ((Runnable) newGroup.A05.A01).run();
            newGroup.A05 = null;
        }
    }

    public void A03(C15830rv r4) {
        Log.i(AnonymousClass000.A0g("newgroup/onConversationChanged/", r4));
        NewGroup newGroup = this.A00;
        Object obj = newGroup.A0c.get();
        if (obj != null && obj.equals(r4)) {
            C14870pt.A03(newGroup.A05, this, obj, 24);
        }
    }
}
