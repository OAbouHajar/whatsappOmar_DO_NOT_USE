package X;

import android.widget.Filter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2oW  reason: invalid class name and case insensitive filesystem */
public class C56792oW extends Filter {
    public final /* synthetic */ C55502ji A00;

    public C56792oW(C55502ji r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x005b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r12) {
        /*
            r11 = this;
            android.widget.Filter$FilterResults r8 = new android.widget.Filter$FilterResults
            r8.<init>()
            r7 = 0
            if (r12 == 0) goto L_0x00b6
            int r0 = r12.length()
            if (r0 != 0) goto L_0x001b
            X.2ji r0 = r11.A00
            java.util.List r0 = r0.A06
            r8.values = r0
            int r0 = r0.size()
        L_0x0018:
            r8.count = r0
            return r8
        L_0x001b:
            java.lang.String r0 = r12.toString()
            java.lang.String r3 = " "
            boolean r0 = r0.startsWith(r3)
            if (r0 != 0) goto L_0x00b6
            int r2 = r12.length()
            java.lang.String r1 = r12.toString()
            java.lang.String r0 = ""
            java.lang.String r0 = r1.replaceAll(r3, r0)
            int r0 = r0.length()
            int r2 = r2 - r0
            r6 = 1
            if (r2 > r6) goto L_0x00b6
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r12.toString()
            java.lang.String r4 = r0.toLowerCase()
            java.lang.String r0 = r12.toString()
            X.2ji r9 = r11.A00
            X.013 r3 = r9.A0F
            java.util.ArrayList r2 = X.C40661uU.A02(r3, r0)
            java.util.List r0 = r9.A06
            java.util.Iterator r10 = r0.iterator()
        L_0x005b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00ae
            X.0sH r1 = X.C13680ns.A0U(r10)
            boolean r0 = r1.A0K()
            if (r0 == 0) goto L_0x007b
            X.0sP r0 = r9.A0D
            java.lang.String r0 = r0.A0I(r1, r7)
        L_0x0071:
            boolean r0 = X.C40661uU.A03(r3, r0, r2, r6)
        L_0x0075:
            if (r0 == 0) goto L_0x005b
        L_0x0077:
            r5.add(r1)
            goto L_0x005b
        L_0x007b:
            java.lang.String r0 = r1.A09()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = r1.A09()
            goto L_0x0071
        L_0x008a:
            java.lang.String r0 = r1.A0W
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = r1.A0W
            boolean r0 = X.C40661uU.A03(r3, r0, r2, r6)
            if (r0 == 0) goto L_0x009b
            goto L_0x0077
        L_0x009b:
            com.whatsapp.jid.Jid r0 = X.C16010sH.A03(r1)
            X.0rv r0 = (X.C15830rv) r0
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = X.C24561Gk.A03(r0)
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.contains(r4)
            goto L_0x0075
        L_0x00ae:
            r8.values = r5
            int r0 = r5.size()
            goto L_0x0018
        L_0x00b6:
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r8.values = r0
            r8.count = r7
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56792oW.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        int i2;
        Set set;
        Object obj = filterResults.values;
        if (obj instanceof List) {
            C55502ji r4 = this.A00;
            List list = (List) obj;
            r4.A07 = list;
            AnonymousClass576 r0 = r4.A04;
            if (r0 != null) {
                Collections.sort(list, r0);
            }
            List list2 = r4.A07;
            AnonymousClass576 r02 = r4.A04;
            if (r02 != null && (set = r02.A00) != null) {
                Iterator it = list2.iterator();
                i2 = -1;
                while (true) {
                    if (it.hasNext()) {
                        if (!set.contains(C16010sH.A03(C13680ns.A0U(it)))) {
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
            i2 = -1;
            r4.A01 = i2;
            r4.A05 = charSequence != null ? charSequence.toString().toLowerCase() : "";
            r4.A01();
        }
    }
}
