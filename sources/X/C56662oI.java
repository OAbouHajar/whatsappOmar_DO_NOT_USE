package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.2oI  reason: invalid class name and case insensitive filesystem */
public class C56662oI extends ArrayAdapter {
    public Context A00;
    public AnonymousClass013 A01;
    public List A02;
    public final boolean A03;

    public C56662oI(Context context, AnonymousClass013 r3, List list, boolean z2) {
        super(context, R.layout.layout037a);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = list;
        this.A03 = z2;
    }

    public int getCount() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A02.get(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008c, code lost:
        r0 = X.AnonymousClass1WH.A09(r8).getDisplayLanguage(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0094, code lost:
        r0 = X.AnonymousClass3BW.A00(r0);
        r2.setText(r0);
        r3.setContentDescription(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fd, code lost:
        r0 = r6.getString(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
            r10 = this;
            android.content.Context r6 = r10.A00
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r6)
            r1 = 2131559290(0x7f0d037a, float:1.874392E38)
            r0 = 0
            android.view.View r5 = r2.inflate(r1, r0)
            int r0 = X.C004601z.A03()
            r5.setId(r0)
            r0 = 2131364254(0x7f0a099e, float:1.834834E38)
            android.view.View r4 = X.C004601z.A0E(r5, r0)
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            r0 = 2131364255(0x7f0a099f, float:1.8348342E38)
            android.widget.TextView r3 = X.C13680ns.A0L(r5, r0)
            java.util.List r1 = r10.A02
            java.lang.Object r0 = r1.get(r11)
            X.4I4 r0 = (X.AnonymousClass4I4) r0
            java.lang.String r0 = r0.A00
            r3.setText(r0)
            r0 = 2131364256(0x7f0a09a0, float:1.8348344E38)
            android.widget.TextView r2 = X.C13680ns.A0L(r5, r0)
            boolean r0 = r10.A03
            r0 = r0 ^ 1
            if (r11 != r0) goto L_0x004f
            r0 = 2131889170(0x7f120c12, float:1.9412996E38)
            X.C13690nt.A0s(r6, r2, r0)
        L_0x0045:
            if (r11 != 0) goto L_0x004a
            r4.toggle()
        L_0x004a:
            r0 = 2
            X.C004601z.A0d(r2, r0)
            return r5
        L_0x004f:
            java.lang.Object r0 = r1.get(r11)
            X.4I4 r0 = (X.AnonymousClass4I4) r0
            java.lang.String r8 = r0.A01
            java.util.Locale r1 = X.AnonymousClass1WH.A09(r8)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r7 = r1.getDisplayLanguage(r0)
            int r1 = r7.length()
            int r0 = r8.length()
            if (r1 > r0) goto L_0x0102
            boolean r0 = r8.startsWith(r7)
            if (r0 == 0) goto L_0x0102
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r7 = r0.locale
        L_0x007d:
            java.util.Locale r9 = X.AnonymousClass1WH.A09(r8)
            java.lang.String r1 = r9.getLanguage()
            int r0 = r1.hashCode()
            switch(r0) {
                case 3116: goto L_0x00e6;
                case 3588: goto L_0x00cb;
                case 3886: goto L_0x009f;
                default: goto L_0x008c;
            }
        L_0x008c:
            java.util.Locale r0 = X.AnonymousClass1WH.A09(r8)
            java.lang.String r0 = r0.getDisplayLanguage(r7)
        L_0x0094:
            java.lang.String r0 = X.AnonymousClass3BW.A00(r0)
            r2.setText(r0)
            r3.setContentDescription(r0)
            goto L_0x0045
        L_0x009f:
            java.lang.String r0 = "zh"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008c
            java.lang.String r1 = r9.getCountry()
            java.lang.String r0 = "HK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b8
            r1 = 2131889167(0x7f120c0f, float:1.941299E38)
            goto L_0x00fd
        L_0x00b8:
            java.lang.String r1 = X.AnonymousClass1WH.A02(r9)
            java.lang.String r0 = "Hans"
            boolean r0 = r0.equals(r1)
            r1 = 2131889168(0x7f120c10, float:1.9412992E38)
            if (r0 == 0) goto L_0x00fd
            r1 = 2131889166(0x7f120c0e, float:1.9412988E38)
            goto L_0x00fd
        L_0x00cb:
            java.lang.String r0 = "pt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008c
            X.01i r1 = X.C33171i9.A00
            java.lang.String r0 = r9.getCountry()
            boolean r0 = r1.contains(r0)
            r1 = 2131889164(0x7f120c0c, float:1.9412984E38)
            if (r0 == 0) goto L_0x00fd
            r1 = 2131889165(0x7f120c0d, float:1.9412986E38)
            goto L_0x00fd
        L_0x00e6:
            java.lang.String r0 = "am"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008c
            java.lang.String r1 = r7.getLanguage()
            java.lang.String r0 = "om"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008c
            r1 = 2131893200(0x7f121bd0, float:1.942117E38)
        L_0x00fd:
            java.lang.String r0 = r6.getString(r1)
            goto L_0x0094
        L_0x0102:
            java.util.Locale r7 = java.util.Locale.getDefault()
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56662oI.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 1;
    }
}
