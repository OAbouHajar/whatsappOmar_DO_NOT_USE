package X;

import com.obwhatsapp.R;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.37T  reason: invalid class name */
public abstract class AnonymousClass37T extends C16690tT {
    public final C16040sK A00;
    public final C16000sG A01;
    public final C17030uP A02;
    public final C16080sP A03;
    public final AnonymousClass013 A04;
    public final String A05;
    public final WeakReference A06;
    public final ArrayList A07;
    public final HashSet A08;
    public final List A09;
    public final List A0A;
    public final Set A0B;

    public AnonymousClass37T(C16040sK r2, C16000sG r3, C17030uP r4, C16080sP r5, ContactPickerFragment contactPickerFragment, AnonymousClass013 r7, String str, HashSet hashSet, List list, List list2, List list3, Set set) {
        this.A06 = C13690nt.A0h(contactPickerFragment);
        this.A09 = list2;
        this.A0A = list3;
        this.A07 = list != null ? C13680ns.A0n(list) : null;
        this.A05 = str;
        this.A08 = hashSet;
        this.A0B = set;
        this.A00 = r2;
        this.A04 = r7;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }

    public static void A04(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AnonymousClass4xA(C13680ns.A0U(it)));
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C83584Hg r3 = (C83584Hg) obj;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A06.get();
        if (contactPickerFragment != null && contactPickerFragment.A0c()) {
            contactPickerFragment.A0u = null;
            contactPickerFragment.A1b(r3);
        }
    }

    public int A0B() {
        return R.string.str056d;
    }

    public String A0C(ContactPickerFragment contactPickerFragment) {
        int i2;
        int i3;
        Object[] A1b;
        int i4;
        String str;
        if (this instanceof C60042zr) {
            C60042zr r4 = (C60042zr) this;
            if (r4.A07 != null) {
                i3 = R.string.str14a8;
                A1b = C13680ns.A1b();
                i4 = 0;
                str = r4.A05;
            } else {
                boolean z2 = r4.A0P;
                i2 = R.string.str0565;
                if (z2) {
                    i2 = R.string.str0566;
                }
                return contactPickerFragment.A0J(i2);
            }
        } else if (this.A07 != null) {
            i3 = R.string.str14a8;
            A1b = C13680ns.A1b();
            i4 = 0;
            str = this.A05;
        } else {
            i2 = R.string.str0565;
            return contactPickerFragment.A0J(i2);
        }
        return C13690nt.A0c(contactPickerFragment, str, A1b, i4, i3);
    }

    public void A0D(ArrayList arrayList, List list, int i2, boolean z2) {
        AnonymousClass01A r1 = (AnonymousClass01A) this.A06.get();
        if (r1 != null && r1.A0c() && !list.isEmpty()) {
            if (!z2) {
                C60042zr.A03(r1, arrayList, i2);
            }
            C16040sK r0 = this.A00;
            r0.A0B();
            C28881Zb r12 = r0.A01;
            if (r12 != null && A0H() && !list.isEmpty() && list.remove(r12)) {
                list.add(0, r12);
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16010sH A0U = C13680ns.A0U(it);
            if (yo.showHiddenInForward() || !yo.H3T((Jid) A0U.A0E)) {
                arrayList.add(new AnonymousClass4xA(A0U));
            }
        }
    }

    public void A0E(ArrayList arrayList, List list, List list2, List list3) {
        AnonymousClass01A r1 = (AnonymousClass01A) this.A06.get();
        if (r1 != null && r1.A0c()) {
            if ((!list.isEmpty() || !list2.isEmpty()) && !list3.isEmpty()) {
                C60042zr.A03(r1, arrayList, A0B());
                if (A0H()) {
                    C16040sK r0 = this.A00;
                    r0.A0B();
                    C28881Zb r12 = r0.A01;
                    if (r12 != null && !list.contains(r12) && !list2.contains(r12)) {
                        arrayList.add(new AnonymousClass4xA(r12));
                    }
                }
            }
        }
    }

    public void A0F(List list, Set set, Set set2, boolean z2) {
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            C16010sH A0U = C13680ns.A0U(it);
            Jid A082 = A0U.A08(C15830rv.class);
            if (A082 != null && !set.contains(A082) && !set2.contains(A082) && C16080sP.A01(this.A03, A0U, this.A07) && C16030sJ.A0F(A0U.A0E)) {
                set.add(A082);
                if (A0J(A0U, z2)) {
                    list.add(A0U);
                } else {
                    set2.add(A082);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0G() {
        /*
            r4 = this;
            java.util.HashSet r1 = r4.A08
            boolean r0 = r1.isEmpty()
            r3 = 1
            if (r0 != 0) goto L_0x0025
            java.util.Iterator r2 = r1.iterator()
        L_0x000d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r2.next()
            int r1 = X.AnonymousClass000.A0D(r0)
            r0 = 42
            if (r1 == r0) goto L_0x0023
            r0 = 43
            if (r1 != r0) goto L_0x000d
        L_0x0023:
            r0 = 0
            return r0
        L_0x0025:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37T.A0G():boolean");
    }

    public boolean A0H() {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A06.get();
        if (contactPickerFragment != null && (contactPickerFragment.A2l || contactPickerFragment.A2i || contactPickerFragment.A2q)) {
            C14710pd r2 = contactPickerFragment.A1d;
            C16620tM r1 = C16620tM.A02;
            return r2.A0E(r1, 1967) && r2.A0E(r1, 2630);
        }
    }

    public boolean A0I(C16010sH r5) {
        C60042zr r1 = (C60042zr) this;
        if (!r1.A0F) {
            return true;
        }
        if (!r1.A0O && !r1.A0Q && !r1.A0K) {
            return true;
        }
        UserJid userJid = (UserJid) C16010sH.A03(r5);
        return C32431gL.A01(r1.A07, userJid) || !new C32441gM(r1.A02, userJid).A02();
    }

    public boolean A0J(C16010sH r3, boolean z2) {
        UserJid userJid = r3.A0J() ? r3.A0F : (UserJid) C16010sH.A03(r3);
        return (z2 || userJid == null || !this.A02.A02(userJid)) && A0I(r3);
    }
}
