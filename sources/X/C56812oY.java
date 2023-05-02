package X;

import android.text.TextUtils;
import android.widget.Filter;
import com.obwhatsapp.R;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2oY  reason: invalid class name and case insensitive filesystem */
public class C56812oY extends Filter {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ AnonymousClass2JD A02;

    public C56812oY(AnonymousClass2JD r1) {
        this.A02 = r1;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList A0u;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        this.A00 = true;
        this.A01 = true;
        C28921Zf r4 = new C28921Zf("conversations/filter/performFiltering");
        if (TextUtils.isEmpty(charSequence)) {
            A0u = this.A02.A08.A1D();
        } else {
            A0u = AnonymousClass000.A0u();
            AnonymousClass2JD r10 = this.A02;
            ArrayList A022 = C40661uU.A02(r10.A06, (String) charSequence);
            HashSet A0o = C13680ns.A0o();
            ArrayList A0u2 = AnonymousClass000.A0u();
            if (!A022.isEmpty()) {
                ArrayList A0n = C13680ns.A0n(A0u2);
                ConversationsFragment conversationsFragment = r10.A08;
                A0u2.add(new C56042kr(conversationsFragment.A0r, conversationsFragment.A1N, A022));
                C42391xi r0 = conversationsFragment.A2f;
                r0.A0A = A0n;
                r0.A04(charSequence);
                r0.A05(A022);
            }
            ConversationsFragment conversationsFragment2 = r10.A08;
            C42391xi r8 = conversationsFragment2.A2f;
            AnonymousClass2c9 r1 = r10.A00;
            List list = r1.A02;
            if (list == null) {
                list = AnonymousClass000.A0u();
                r1.A02 = list;
            }
            r8.A0D = list;
            r8.A00 = 0;
            r8.A01 = 100;
            r4.A00();
            List list2 = (List) conversationsFragment2.A1Q.A05((AnonymousClass024) null, r8, (Integer) null).second;
            r4.A00();
            Iterator it = conversationsFragment2.A0z.A05().iterator();
            while (it.hasNext()) {
                C15830rv A0B = C13700nu.A0B(it);
                if (!yo.H3T(A0B) && C216114t.A00(A0B, A0u2)) {
                    A0o.add(A0B);
                    if (this.A01) {
                        A0u.add(new C101644xe(conversationsFragment2.A0J(R.string.str14ac)));
                        this.A01 = false;
                    }
                    A0u.add(new AnonymousClass2Wo(A0B));
                }
            }
            r4.A00();
            Iterator it2 = conversationsFragment2.A1N.A02().iterator();
            while (it2.hasNext()) {
                C16010sH A0U = C13680ns.A0U(it2);
                if (A0U.A0D != null) {
                    Class<C15830rv> cls = C15830rv.class;
                    if (!A0o.contains(A0U.A08(cls))) {
                        Jid A08 = A0U.A08(cls);
                        AnonymousClass00B.A06(A08);
                        C15830rv r02 = (C15830rv) A08;
                        if (!yo.H3T(r02) && C216114t.A00(r02, A0u2)) {
                            if (this.A00) {
                                A0u.add(new C101644xe(conversationsFragment2.A0J(R.string.str14ad)));
                                this.A00 = false;
                            }
                            A0u.add(new C49912Wq(A0U));
                        }
                    }
                }
            }
            r4.A00();
            ArrayList A0u3 = AnonymousClass000.A0u();
            ArrayList A0u4 = AnonymousClass000.A0u();
            AnonymousClass00B.A06(list2);
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                C16740tZ A0V = C13680ns.A0V(it3);
                if (!yo.H3T(A0V)) {
                    AnonymousClass00B.A06(A0V.A11.A00);
                    if (A0V.A0x) {
                        A0u3.add(A0V);
                    } else {
                        A0u4.add(A0V);
                    }
                }
            }
            if (A0u3.size() > 0) {
                A0u.add(new C101644xe(conversationsFragment2.A0J(R.string.str14b0)));
            }
            Iterator it4 = A0u3.iterator();
            while (it4.hasNext()) {
                C16740tZ A0V2 = C13680ns.A0V(it4);
                if (!yo.H3T(A0V2)) {
                    A0u.add(new C56142l2(A0V2));
                }
            }
            if (A0u4.size() > 0) {
                A0u.add(new C101644xe(conversationsFragment2.A0J(R.string.str14af)));
            }
            Iterator it5 = A0u4.iterator();
            while (it5.hasNext()) {
                C16740tZ A0V3 = C13680ns.A0V(it5);
                if (!yo.H3T(A0V3)) {
                    A0u.add(new C56142l2(A0V3));
                }
            }
        }
        filterResults.values = A0u;
        filterResults.count = A0u.size();
        r4.A01();
        return filterResults;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r6.A00 <= 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (r6.A1J.A05() < 3) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void publishResults(java.lang.CharSequence r13, android.widget.Filter.FilterResults r14) {
        /*
            r12 = this;
            X.2JD r7 = r12.A02
            com.obwhatsapp.conversationslist.ConversationsFragment r6 = r7.A08
            android.view.View r2 = r6.A0A
            if (r2 == 0) goto L_0x00a1
            int r0 = r14.count
            r5 = 0
            r4 = 8
            if (r0 != 0) goto L_0x010a
            X.2c9 r0 = r7.A00
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x00eb
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x00eb
            r0 = 2131365972(0x7f0a1054, float:1.8351824E38)
            X.C13690nt.A13(r2, r0, r4)
            r6.A1M()
        L_0x0026:
            java.lang.Object r0 = r14.values
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r6.A2P = r0
            if (r0 != 0) goto L_0x0034
            java.util.ArrayList r0 = r6.A1D()
            r6.A2P = r0
        L_0x0034:
            X.2c9 r0 = r7.A00
            java.lang.String r13 = (java.lang.String) r13
            r0.A01 = r13
            X.013 r0 = r7.A06
            java.util.ArrayList r0 = X.C40661uU.A02(r0, r13)
            r7.A02 = r0
            X.2c9 r0 = r7.A00
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r11 = 1
            if (r0 == 0) goto L_0x00e8
            X.2c9 r0 = r7.A00
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x00e8
            r2 = 1
            int r0 = r6.A00
            r10 = 1
            if (r0 > 0) goto L_0x00a2
        L_0x005b:
            r10 = 0
            if (r2 == 0) goto L_0x00a2
            boolean r0 = r6.A2V
            if (r0 != 0) goto L_0x00a2
            X.0rz r0 = r6.A1J
            int r1 = r0.A05()
            r0 = 3
            if (r1 >= r0) goto L_0x00a2
        L_0x006b:
            android.widget.TextView r1 = r6.A0B
            int r0 = X.C13690nt.A07(r10)
            r1.setVisibility(r0)
            android.widget.TextView r0 = r6.A0E
            if (r11 == 0) goto L_0x0079
            r4 = 0
        L_0x0079:
            r0.setVisibility(r4)
            r7.notifyDataSetChanged()
            android.widget.ListView r0 = r6.A09
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x008c
            android.widget.ListView r0 = r6.A09
            r0.setSelection(r5)
        L_0x008c:
            long r7 = r6.A02
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a1
            X.0w4 r5 = r6.A2G
            r2 = 5
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r7
            r5.A00(r2, r0)
            r6.A02 = r3
        L_0x00a1:
            return
        L_0x00a2:
            r11 = 0
            if (r2 != 0) goto L_0x006b
            java.util.ArrayList r0 = r6.A2P
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x006b
            X.2c9 r9 = r7.A00
            android.view.View r2 = r6.A0A
            if (r2 != 0) goto L_0x00b9
            java.lang.String r0 = "conversations/view/null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x006b
        L_0x00b9:
            android.view.ViewGroup r0 = r6.A07
            r0.setVisibility(r4)
            r8 = 1
            java.lang.String r0 = r9.A01
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 2131365972(0x7f0a1054, float:1.8351824E38)
            if (r1 != 0) goto L_0x00dd
            android.widget.TextView r3 = X.C13680ns.A0M(r2, r0)
            r2 = 2131891368(0x7f1214a8, float:1.9417454E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = r9.A01
            java.lang.String r0 = X.C13690nt.A0c(r6, r0, r1, r5, r2)
            r3.setText(r0)
            goto L_0x006b
        L_0x00dd:
            android.widget.TextView r1 = X.C13680ns.A0M(r2, r0)
            r0 = 2131891367(0x7f1214a7, float:1.9417452E38)
            r1.setText(r0)
            goto L_0x006b
        L_0x00e8:
            r2 = 0
            goto L_0x005b
        L_0x00eb:
            r0 = 2131365972(0x7f0a1054, float:1.8351824E38)
            android.view.View r1 = r2.findViewById(r0)
            r1.setVisibility(r5)
            android.widget.ListView r0 = r6.A09
            r0.setEmptyView(r1)
            r0 = 2131362990(0x7f0a04ae, float:1.8345776E38)
            X.C13690nt.A13(r2, r0, r4)
            r0 = 2131362992(0x7f0a04b0, float:1.834578E38)
            X.C13690nt.A13(r2, r0, r4)
            r0 = 2131362991(0x7f0a04af, float:1.8345778E38)
            goto L_0x010d
        L_0x010a:
            r0 = 2131365972(0x7f0a1054, float:1.8351824E38)
        L_0x010d:
            X.C13690nt.A13(r2, r0, r4)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56812oY.publishResults(java.lang.CharSequence, android.widget.Filter$FilterResults):void");
    }
}
