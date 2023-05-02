package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.businessproductlist.view.adapter.BusinessProductListAdapter;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2XU  reason: invalid class name */
public abstract class AnonymousClass2XU extends C32161fk {
    public final C14870pt A00;
    public final C17170ue A01;
    public final C16000sG A02;
    public final C17030uP A03;
    public final C16080sP A04;
    public final AnonymousClass013 A05;

    public AnonymousClass2XU(C19980zJ r8, C14870pt r9, C16040sK r10, C17170ue r11, AnonymousClass1KA r12, C50262Yq r13, C16000sG r14, C17030uP r15, C16080sP r16, AnonymousClass013 r17, UserJid userJid) {
        super(r8, r10, r12, r13, userJid);
        this.A00 = r9;
        this.A02 = r14;
        this.A04 = r16;
        this.A05 = r17;
        this.A03 = r15;
        this.A01 = r11;
    }

    public C65123Sy A0F(ViewGroup viewGroup, int i2) {
        if (i2 != 2) {
            return super.A0F(viewGroup, i2);
        }
        UserJid userJid = this.A05;
        C16040sK r4 = this.A02;
        C19980zJ r3 = this.A01;
        C16000sG r5 = this.A02;
        C16080sP r7 = this.A04;
        return new C59672yj(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00be, viewGroup, false), r3, r4, r5, this.A03, r7, userJid);
    }

    public void A0J() {
        List list = this.A00;
        list.add(new C71523kZ());
        A03(list.size() - 1);
    }

    public void A0K(int i2) {
        int size;
        int i3;
        List list = this.A00;
        if (list.size() > 0 && (list.get(list.size() - 1) instanceof C71523kZ) && list.size() - 1 != -1) {
            C71523kZ r2 = (C71523kZ) list.get(size);
            if (i2 == -1) {
                i3 = 4;
            } else {
                StringBuilder sb = new StringBuilder("biz-collection-product-list-adapter/error: ");
                sb.append(i2);
                Log.w(sb.toString());
                i3 = 2;
            }
            r2.A00 = i3;
            A02(size);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r2 = r7.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L(X.AnonymousClass2GE r7, java.util.List r8) {
        /*
            r6 = this;
            java.util.List r5 = r6.A00
            r5.clear()
            if (r7 == 0) goto L_0x0011
            X.2gM r2 = r7.A00
            int r1 = r2.A00
            r0 = 1
            if (r1 == r0) goto L_0x0040
            r0 = 2
            if (r1 == r0) goto L_0x0040
        L_0x0011:
            if (r8 == 0) goto L_0x004b
            java.util.Iterator r4 = r8.iterator()
        L_0x0017:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r3 = r4.next()
            X.1mM r3 = (X.C35701mM) r3
            boolean r0 = r6 instanceof com.obwhatsapp.businessproductlist.view.adapter.BusinessProductListAdapter
            if (r0 == 0) goto L_0x002b
            r0 = 0
            X.C18450wi.A0H(r3, r0)
        L_0x002b:
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r3.A0D
            long r1 = r6.A0E(r0)
            X.2Xv r0 = new X.2Xv
            r0.<init>(r3, r1)
            r5.add(r0)
            goto L_0x0017
        L_0x0040:
            java.lang.String r1 = r7.A03
            X.3kb r0 = new X.3kb
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x0011
        L_0x004b:
            r6.A0J()
            r6.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2XU.A0L(X.2GE, java.util.List):void");
    }

    public void A0M(C35701mM r5) {
        boolean z2 = this instanceof BusinessProductListAdapter;
        if (r5.A01()) {
            int i2 = 0;
            while (true) {
                List list = this.A00;
                if (i2 < list.size()) {
                    C50082Xw r2 = (C50082Xw) list.get(i2);
                    if (r2 instanceof C50072Xv) {
                        C50072Xv r22 = (C50072Xv) r2;
                        String str = r22.A01.A0D;
                        String str2 = r5.A0D;
                        if (str.equals(str2)) {
                            r22.A01 = r5;
                            r22.A00 = A0E(str2);
                            A02(i2);
                            return;
                        }
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public void A0N(Boolean bool) {
        int size;
        if (bool == null || !bool.booleanValue()) {
            A0G();
        } else {
            A0H();
        }
        List list = this.A00;
        if (list.size() > 0 && (list.get(list.size() - 1) instanceof C71523kZ) && list.size() - 1 != -1) {
            ((C71523kZ) list.get(size)).A00 = 5;
        }
    }

    public void A0O(Boolean bool) {
        if (!bool.equals(this.A00)) {
            this.A00 = bool;
            A01();
        }
    }

    public void A0P(Set set) {
        List list = this.A00;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof C50072Xv) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (set.contains(((C50072Xv) next2).A01.A0D)) {
                arrayList2.add(next2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C50072Xv r5 = (C50072Xv) it2.next();
            long A0E = A0E(r5.A01.A0D);
            if (A0E != r5.A00) {
                r5.A00 = A0E;
                A02(list.indexOf(r5));
            }
        }
    }
}
