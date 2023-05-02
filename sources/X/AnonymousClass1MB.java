package X;

import android.text.TextUtils;
import com.obwhatsapp.payments.IDxRCallbackShape7S0300000_1_I0;
import com.whatsapp.jid.Jid;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1MB  reason: invalid class name */
public class AnonymousClass1MB {
    public HashSet A00 = new HashSet();
    public HashSet A01 = new HashSet();
    public List A02 = new ArrayList();
    public final C14870pt A03;
    public final C16040sK A04;
    public final C18290wS A05;
    public final AnonymousClass1MA A06;

    public AnonymousClass1MB(C14870pt r2, C16040sK r3, C18290wS r4, AnonymousClass1MA r5) {
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r5;
    }

    public static /* synthetic */ void A00(AnonymousClass5Q6 r1, AnonymousClass1MB r2, String str) {
        r2.A00.add(str);
        r2.A01.remove(str);
        if (r1 != null) {
            r1.APN(str);
        }
        List<Reference> list = r2.A02;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((Reference) list.get(size)).get() == null) {
                list.remove(size);
            }
        }
        for (Reference reference : list) {
            AnonymousClass5Q6 r0 = (AnonymousClass5Q6) reference.get();
            if (r0 != null) {
                r0.APN(str);
            }
        }
    }

    public void A01(AnonymousClass5Q6 r4) {
        List list = this.A02;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                Object obj = ((Reference) list.get(size)).get();
                if (obj == null || obj == r4) {
                    list.remove(size);
                }
            } else {
                return;
            }
        }
    }

    public final void A02(AnonymousClass5Q6 r6, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            HashSet hashSet = this.A01;
            if (!hashSet.contains(str) && !this.A00.contains(str)) {
                hashSet.add(str);
                this.A06.A02(new AnonymousClass502(r6, this, str), str, true);
            }
        }
    }

    public final void A03(C28381Vw r17, String str) {
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            C28381Vw r8 = r17;
            if (r17 != null) {
                C15830rv r4 = r8.A00;
                if (C16030sJ.A0L(r4)) {
                    HashSet hashSet = this.A01;
                    if (!hashSet.contains(str2) && !this.A00.contains(str2)) {
                        hashSet.add(str2);
                        AnonymousClass1MA r7 = this.A06;
                        AnonymousClass501 r6 = new AnonymousClass501(this, str2);
                        C28371Vv r12 = new C28371Vv("account", new C35081lL[]{new C35081lL("action", "get-missing-group-transaction-details"), new C35081lL("id", str2), new C35081lL((Jid) r4, "group")});
                        r7.A08.A0H(new IDxRCallbackShape7S0300000_1_I0(r7.A02.A00, r7.A05, r7.A00, r6, r7, r8, 1), r12, "get", 0);
                    }
                }
            }
        }
    }

    public void A04(List list) {
        AnonymousClass1W2 r0;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1Vt r2 = (AnonymousClass1Vt) it.next();
            if ((r2.A03 == 1000 && !TextUtils.isEmpty(r2.A0K)) || ((r0 = r2.A0A) != null && r0.A0Y())) {
                arrayList.add(r2.A0K);
            }
        }
        if (!arrayList.isEmpty()) {
            A02((AnonymousClass5Q6) null, arrayList);
        }
    }
}
