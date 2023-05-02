package X;

import com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5nq  reason: invalid class name and case insensitive filesystem */
public class C114485nq extends C16690tT {
    public final String A00;
    public final ArrayList A01;
    public final List A02;
    public final /* synthetic */ IndiaUpiBankPickerActivity A03;

    public C114485nq(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity, String str, ArrayList arrayList, List list) {
        this.A03 = indiaUpiBankPickerActivity;
        this.A01 = arrayList != null ? C13680ns.A0n(arrayList) : null;
        this.A00 = str;
        this.A02 = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r18) {
        /*
            r17 = this;
            java.util.ArrayList r12 = X.AnonymousClass000.A0u()
            r11 = r17
            java.util.ArrayList r10 = r11.A01
            if (r10 == 0) goto L_0x0010
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x001a
        L_0x0010:
            com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity r0 = r11.A03
            java.util.List r0 = r0.A0H
            if (r0 == 0) goto L_0x001a
            r12.addAll(r0)
        L_0x0019:
            return r12
        L_0x001a:
            java.util.List r0 = r11.A02
            if (r0 == 0) goto L_0x0019
            java.util.Iterator r16 = r0.iterator()
        L_0x0022:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0019
            java.lang.Object r9 = r16.next()
            X.1tG r9 = (X.C39911tG) r9
            java.lang.String r2 = r9.A0A()
            com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity r3 = r11.A03
            X.013 r1 = r3.A01
            r0 = 1
            boolean r0 = X.C40661uU.A03(r1, r2, r10, r0)
            if (r0 != 0) goto L_0x00ae
            java.lang.String r1 = r9.A0A()
            java.lang.String r2 = r11.A00
            X.013 r3 = r3.A01
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r8 = 0
            if (r0 != 0) goto L_0x00b1
            java.util.regex.Pattern r0 = X.C40661uU.A02
            java.util.regex.Matcher r1 = r0.matcher(r1)
            java.lang.String r0 = " "
            java.lang.String r7 = r1.replaceAll(r0)
            java.util.regex.Pattern r0 = X.C42471xq.A00
            java.util.regex.Matcher r0 = r0.matcher(r7)
            boolean r0 = r0.find()
            r15 = r0 ^ 1
            if (r15 == 0) goto L_0x006a
            java.lang.String r7 = X.AnonymousClass1ZW.A09(r7)
        L_0x006a:
            java.text.BreakIterator r6 = X.C40661uU.A01(r3)
            r6.setText(r7)
            int r14 = r6.first()
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00ab
            java.lang.String r0 = X.AnonymousClass1ZW.A09(r2)
        L_0x007f:
            char[] r5 = r0.toCharArray()
            int r4 = r5.length
            r3 = 0
        L_0x0085:
            if (r3 >= r4) goto L_0x00ae
            char r2 = r5[r3]
        L_0x0089:
            int r13 = r6.next()
            r1 = r14
            r14 = r13
            r0 = -1
            if (r13 == r0) goto L_0x00b1
            java.lang.String r1 = r7.substring(r1, r13)
            if (r15 != 0) goto L_0x009c
            java.lang.String r1 = X.AnonymousClass1ZW.A09(r1)
        L_0x009c:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0089
            char r0 = r1.charAt(r8)
            if (r2 != r0) goto L_0x0089
            int r3 = r3 + 1
            goto L_0x0085
        L_0x00ab:
            java.lang.String r0 = ""
            goto L_0x007f
        L_0x00ae:
            r12.add(r9)
        L_0x00b1:
            X.0tU r0 = r11.A02
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x0022
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114485nq.A08(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r1 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r8) {
        /*
            r7 = this;
            java.util.List r8 = (java.util.List) r8
            com.obwhatsapp.payments.ui.IndiaUpiBankPickerActivity r5 = r7.A03
            r0 = 0
            r5.A0C = r0
            android.view.View r2 = r5.A00
            java.util.ArrayList r0 = r7.A01
            r6 = 8
            r4 = 0
            if (r0 == 0) goto L_0x0018
            boolean r1 = r0.isEmpty()
            r0 = 8
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            r2.setVisibility(r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0055
            android.widget.TextView r3 = r5.A02
            r2 = 2131891368(0x7f1214a8, float:1.9417454E38)
            java.lang.Object[] r1 = X.C13680ns.A1b()
            java.lang.String r0 = r5.A0E
            java.lang.String r0 = X.C13680ns.A0d(r5, r0, r1, r4, r2)
            r3.setText(r0)
            android.widget.TextView r0 = r5.A02
            r0.setVisibility(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A03
            r0.setVisibility(r6)
        L_0x003e:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r5.A05
            r0.setVisibility(r6)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r5.A04
            r0.setVisibility(r6)
            X.5ew r0 = r5.A0B
            r0.A00 = r8
            r0.A01()
            androidx.recyclerview.widget.RecyclerView r0 = r5.A03
            r0.A0a(r4)
            return
        L_0x0055:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A03
            r0.setVisibility(r4)
            android.widget.TextView r0 = r5.A02
            r0.setVisibility(r6)
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114485nq.A0A(java.lang.Object):void");
    }
}
