package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.18V  reason: invalid class name */
public final class AnonymousClass18V implements C19400yN {
    public final C19000xb A00;
    public final C16000sG A01;
    public final C15860rz A02;
    public final C16070sO A03;
    public final C14710pd A04;

    public AnonymousClass18V(C19000xb r2, C16000sG r3, C15860rz r4, C16070sO r5, C14710pd r6) {
        C18450wi.A0H(r6, 1);
        C18450wi.A0H(r4, 2);
        C18450wi.A0H(r3, 3);
        C18450wi.A0H(r5, 4);
        C18450wi.A0H(r2, 5);
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A00 = r2;
    }

    public final void A00(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            GroupJid groupJid = (GroupJid) it.next();
            C16010sH A09 = this.A01.A09(groupJid);
            if (A09 != null && A09.A0k && this.A03.A0A(groupJid)) {
                C18450wi.A0H(groupJid, 0);
                String rawString = groupJid.getRawString();
                C18450wi.A0B(rawString);
                this.A00.A00(new AnonymousClass2BT(rawString));
            }
        }
    }

    public String AGT() {
        return new AnonymousClass2BO(AnonymousClass18V.class).toString();
    }

    public void AMc() {
        C14710pd r5 = this.A04;
        C16620tM r4 = C16620tM.A02;
        if (r5.A0E(r4, 1728)) {
            C15860rz r3 = this.A02;
            int i2 = ((SharedPreferences) r3.A01.get()).getInt("group_join_request_startup_sync_count", 0);
            if (i2 >= r5.A03(r4, 2868)) {
                Log.i("GroupMembershipApprovalRequestsManager/ starting jobs to reSync pending membership approval requests for all eligible groups.");
                r3.A0K().putInt("group_join_request_startup_sync_count", i2 + 1).apply();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList A0E = this.A01.A0E();
                ArrayList<C16010sH> arrayList = new ArrayList<>();
                Iterator it = A0E.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        arrayList.add(next);
                    }
                }
                for (C16010sH A08 : arrayList) {
                    Jid A082 = A08.A08(C16050sL.class);
                    if (A082 != null) {
                        linkedHashSet.add(A082);
                    }
                }
                A00(linkedHashSet);
            }
        }
    }
}
