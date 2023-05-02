package X;

import com.obwhatsapp.R;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.Jid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.5hD  reason: invalid class name and case insensitive filesystem */
public class C111695hD extends AnonymousClass37T {
    public final C221116r A00;

    public C111695hD(C16040sK r15, C16000sG r16, C17030uP r17, C16080sP r18, ContactPickerFragment contactPickerFragment, AnonymousClass013 r20, C221116r r21, String str, HashSet hashSet, List list, List list2, List list3, Set set) {
        super(r15, r16, r17, r18, contactPickerFragment, r20, str, hashSet, list, list2, list3, set);
        this.A00 = r21;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ContactPickerFragment contactPickerFragment;
        ArrayList A0u = AnonymousClass000.A0u();
        ArrayList A0u2 = AnonymousClass000.A0u();
        ArrayList A0u3 = AnonymousClass000.A0u();
        HashSet A0o = C13680ns.A0o();
        ArrayList A0u4 = AnonymousClass000.A0u();
        HashSet A0o2 = C13680ns.A0o();
        boolean A0G = A0G();
        A0F(A0u2, A0o, A0o2, A0G);
        C16700tU r6 = this.A02;
        if (!r6.isCancelled()) {
            for (C16010sH r1 : this.A09) {
                Jid A08 = r1.A08(C15830rv.class);
                if (!A0o.contains(A08) && r1.A0D != null && !r1.A0J() && this.A03.A0T(r1, this.A07, true) && !this.A0B.contains(A08) && !C16030sJ.A0P(A08) && !C16030sJ.A0Q(A08) && A0J(r1, A0G)) {
                    A0u3.add(r1);
                    C34751ko r0 = r1.A0D;
                    A0u4.add(Long.valueOf(r0 == null ? 0 : r0.A00));
                }
            }
            if (!r6.isCancelled()) {
                Collections.sort(A0u3, new C450026p(this.A03, this.A04));
                A0D(A0u, A0u2, R.string.str0f4c, false);
                if (!r6.isCancelled()) {
                    WeakReference weakReference = this.A06;
                    AnonymousClass01A r02 = (AnonymousClass01A) weakReference.get();
                    if (r02 != null && r02.A0c()) {
                        A0E(A0u, A0u2, AnonymousClass000.A0u(), A0u3);
                    }
                    AnonymousClass37T.A04(A0u, A0u3);
                    if (!r6.isCancelled()) {
                        ArrayList arrayList = this.A07;
                        A07(new C83584Hg(A0u, arrayList));
                        if (A0u.isEmpty() && (contactPickerFragment = (ContactPickerFragment) weakReference.get()) != null && contactPickerFragment.A0c()) {
                            A0u.add(new AnonymousClass2XI(A0C(contactPickerFragment)));
                        }
                        return new C83584Hg(A0u, arrayList);
                    }
                }
            }
        }
        return new C83584Hg(A0u, this.A07);
    }

    public int A0B() {
        return R.string.str0f4b;
    }

    public boolean A0I(C16010sH r2) {
        return true;
    }
}
