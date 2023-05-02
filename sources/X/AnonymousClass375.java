package X;

import android.provider.ContactsContract;
import android.util.SparseArray;
import com.obwhatsapp.R;
import com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.375  reason: invalid class name */
public class AnonymousClass375 extends C16690tT {
    public final AnonymousClass1G1 A00;
    public final C16760tb A01;
    public final C16440t3 A02;
    public final AnonymousClass013 A03;
    public final C16460t6 A04;
    public final C15830rv A05;
    public final C16050sL A06;
    public final C28381Vw A07;
    public final WeakReference A08;
    public final ArrayList A09;
    public final ArrayList A0A;
    public final boolean A0B;

    public AnonymousClass375(AnonymousClass1G1 r2, C16760tb r3, C16440t3 r4, AnonymousClass013 r5, C16460t6 r6, C15830rv r7, C16050sL r8, C28381Vw r9, ViewSharedContactArrayActivity viewSharedContactArrayActivity, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
        super(viewSharedContactArrayActivity, true);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = r2;
        this.A08 = C13690nt.A0h(viewSharedContactArrayActivity);
        this.A05 = r7;
        this.A09 = arrayList;
        this.A0A = arrayList2;
        this.A0B = z2;
        this.A07 = r9;
        this.A06 = r8;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList arrayList;
        StringBuilder A0o;
        String str;
        ArrayList A0u = AnonymousClass000.A0u();
        int i2 = 0;
        while (true) {
            arrayList = this.A09;
            if (i2 >= arrayList.size()) {
                break;
            }
            C39701sv r6 = (C39701sv) arrayList.get(i2);
            SparseArray sparseArray = (SparseArray) this.A0A.get(i2);
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                AnonymousClass4J2 r8 = (AnonymousClass4J2) sparseArray.get(i3);
                if (!r8.A01) {
                    Log.i(C13680ns.A0c(i3, "unchecked:"));
                    if (r8.A00 instanceof C87294We) {
                        C87294We r82 = (C87294We) r8.A00;
                        List list = (List) r6.A07.get(r82.A01);
                        if (list != null) {
                            list.remove(r82);
                            if (list.isEmpty()) {
                                r6.A07.remove(r82.A01);
                            }
                        }
                    } else {
                        Object obj = r8.A00;
                        if (obj instanceof C85294Nw) {
                            C85294Nw r1 = (C85294Nw) obj;
                            r6.A02.remove(r1);
                            Class<ContactsContract.CommonDataKinds.StructuredPostal> cls = r1.A01;
                            if (cls == ContactsContract.CommonDataKinds.Email.class) {
                                A0o = AnonymousClass000.A0o();
                                str = "email";
                            } else if (cls == ContactsContract.CommonDataKinds.StructuredPostal.class) {
                                A0o = AnonymousClass000.A0o();
                                str = "postal";
                            }
                        } else if (obj instanceof C39711sw) {
                            r6.A05.remove(r8.A00);
                            A0o = AnonymousClass000.A0o();
                            str = "phone:";
                        } else if (r8.A00 instanceof AnonymousClass4JL) {
                            r6.A06.remove(r8.A00);
                            A0o = AnonymousClass000.A0o();
                            str = "website:";
                        }
                        A0o.append(str);
                        A0o.append(r8.A00);
                        C13680ns.A1V(A0o);
                    }
                }
            }
            try {
                A0u.add(new AnonymousClass25O(this.A00, this.A03).A00(r6));
                i2++;
            } catch (AnonymousClass25G e2) {
                Log.e((Throwable) e2);
                return Boolean.FALSE;
            }
        }
        C28381Vw r12 = this.A07;
        C16740tZ r83 = null;
        if (r12 != null) {
            r83 = C16460t6.A00(this.A04, r12);
        } else {
            C16050sL r2 = this.A06;
            if (r2 != null) {
                r83 = C222617g.A00(r2, (String) null, (String) null, this.A02.A00());
            }
        }
        if (arrayList.size() > 1) {
            C16760tb r22 = this.A01;
            C15830rv r0 = this.A05;
            r22.A0T(r83, Collections.singletonList(r0), A0u, this.A0B);
        } else {
            C16760tb r7 = this.A01;
            C15830rv r13 = this.A05;
            r7.A0S(r83, ((C39701sv) arrayList.get(0)).A02(), (String) A0u.get(0), Collections.singletonList(r13), this.A0B);
        }
        return Boolean.TRUE;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Boolean bool = (Boolean) obj;
        C14550pN r1 = (C14550pN) this.A08.get();
        if (r1 != null) {
            r1.Ac1();
            if (bool.booleanValue()) {
                C13690nt.A0q(r1);
            } else {
                r1.Afg(R.string.str0d9e);
            }
        }
    }
}
