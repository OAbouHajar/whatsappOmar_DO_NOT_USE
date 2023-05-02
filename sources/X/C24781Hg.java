package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.1Hg  reason: invalid class name and case insensitive filesystem */
public class C24781Hg {
    public final C24771Hf A00;
    public final Set A01 = new HashSet();

    public C24781Hg(C16980tz r4, C24771Hf r5) {
        AnonymousClass01I.A00(r4.A00, AnonymousClass01F.class);
        HashSet hashSet = new HashSet();
        hashSet.add("migration_jid_store");
        hashSet.add("migration_chat_store");
        hashSet.add("call_log");
        hashSet.add("blank_me_jid");
        hashSet.add("participant_user");
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        C16340ss.A01(unmodifiableSet);
        C17380uz copyOf = C17380uz.copyOf((Collection) unmodifiableSet);
        this.A00 = r5;
        Iterator it = copyOf.iterator();
        while (it.hasNext()) {
            this.A01.add(it.next());
        }
    }
}
