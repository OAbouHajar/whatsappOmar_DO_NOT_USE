package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.obwhatsapp.R;
import com.obwhatsapp.phonematching.CountryPicker;
import java.util.List;

/* renamed from: X.2oF  reason: invalid class name and case insensitive filesystem */
public final class C56632oF extends ArrayAdapter {
    public final String A00;
    public final String A01;
    public final /* synthetic */ CountryPicker A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56632oF(Context context, CountryPicker countryPicker, String str, String str2, List list) {
        super(context, R.layout.layout01fa, list);
        this.A02 = countryPicker;
        this.A00 = str;
        this.A01 = str2;
    }

    public int getCount() {
        return Math.max(1, super.getCount());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            int r0 = super.getCount()
            r2 = 1
            if (r0 != 0) goto L_0x0032
            if (r9 == 0) goto L_0x0012
            r0 = 2131366779(0x7f0a137b, float:1.8353461E38)
            android.view.View r0 = r9.findViewById(r0)
            if (r0 != 0) goto L_0x0031
        L_0x0012:
            android.content.Context r0 = r7.getContext()
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            r9.<init>(r0)
            com.obwhatsapp.phonematching.CountryPicker r0 = r7.A02
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131559412(0x7f0d03f4, float:1.8744167E38)
            r1.inflate(r0, r9, r2)
            r0 = 2131363435(0x7f0a066b, float:1.8346679E38)
            android.view.View r0 = r9.findViewById(r0)
            r0.setClickable(r2)
        L_0x0031:
            return r9
        L_0x0032:
            java.lang.Object r6 = r7.getItem(r8)
            X.AnonymousClass00B.A06(r6)
            X.4Rp r6 = (X.AnonymousClass4Rp) r6
            if (r9 == 0) goto L_0x0046
            r0 = 2131363015(0x7f0a04c7, float:1.8345827E38)
            android.view.View r0 = r9.findViewById(r0)
            if (r0 != 0) goto L_0x005b
        L_0x0046:
            android.content.Context r0 = r7.getContext()
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            r9.<init>(r0)
            com.obwhatsapp.phonematching.CountryPicker r0 = r7.A02
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131558906(0x7f0d01fa, float:1.8743141E38)
            r1.inflate(r0, r9, r2)
        L_0x005b:
            r0 = 2131363016(0x7f0a04c8, float:1.8345829E38)
            com.obwhatsapp.TextEmojiLabel r1 = X.C13680ns.A0Q(r9, r0)
            java.lang.String r0 = r6.A02
            r4 = 0
            r1.A0I(r4, r0)
            r0 = 2
            X.C004601z.A0d(r1, r0)
            r0 = 2131363015(0x7f0a04c7, float:1.8345827E38)
            android.widget.TextView r3 = X.C13680ns.A0L(r9, r0)
            java.lang.String r5 = r6.A01
            r3.setText(r5)
            r0 = 2131363018(0x7f0a04ca, float:1.8345833E38)
            android.widget.TextView r1 = X.C13680ns.A0M(r9, r0)
            java.lang.String r0 = r6.A04
            if (r0 == 0) goto L_0x00ce
            r1.setText(r0)
            r0 = 0
            r1.setVisibility(r0)
        L_0x008a:
            X.AnonymousClass1UP.A06(r3)
            r0 = 2131363014(0x7f0a04c6, float:1.8345825E38)
            android.widget.TextView r2 = X.C13680ns.A0L(r9, r0)
            java.lang.String r0 = "+"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r6.A00
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r2.setText(r0)
            r0 = 2131363020(0x7f0a04cc, float:1.8345837E38)
            android.widget.ImageView r2 = X.C13680ns.A0K(r9, r0)
            java.lang.String r1 = r6.A03
            java.lang.String r0 = r7.A00
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = r7.A01
            boolean r0 = android.text.TextUtils.equals(r5, r0)
            if (r0 != 0) goto L_0x00d7
            android.content.Context r0 = r7.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131100935(0x7f060507, float:1.7814265E38)
            X.C13690nt.A0w(r1, r3, r0)
            r2.setImageDrawable(r4)
            return r9
        L_0x00ce:
            r0 = 8
            r1.setVisibility(r0)
            r1.setText(r4)
            goto L_0x008a
        L_0x00d7:
            android.content.Context r1 = r7.getContext()
            r0 = 2131101391(0x7f0606cf, float:1.781519E38)
            X.C13680ns.A0v(r1, r3, r0)
            r0 = 2131231121(0x7f080191, float:1.8078314E38)
            r2.setImageResource(r0)
            android.content.Context r1 = r7.getContext()
            r0 = 2131100876(0x7f0604cc, float:1.7814146E38)
            X.AnonymousClass2SR.A07(r1, r2, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56632oF.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
