package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape177S0100000_2_I0 implements View.OnLongClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape177S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r1 > 0) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r1 > 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0144;
                case 1: goto L_0x013c;
                case 2: goto L_0x012c;
                case 3: goto L_0x00fb;
                case 4: goto L_0x00b9;
                case 5: goto L_0x0085;
                case 6: goto L_0x007a;
                case 7: goto L_0x0033;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r6 = r7.A00
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r6 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r6
            int r2 = r6.A00
            int[] r5 = X.C47622Js.A01
            r1 = 0
        L_0x000e:
            int r4 = r5.length
            if (r1 >= r4) goto L_0x0031
            r0 = r5[r1]
            if (r2 != r0) goto L_0x002e
            if (r1 <= 0) goto L_0x0031
        L_0x0017:
            int r0 = r1 + -1
            r0 = r5[r0]
            r6.A00 = r0
            r6.A3E()
            int[] r3 = com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity.A0w
            int r2 = r6.A00
            r1 = 0
        L_0x0025:
            if (r1 >= r4) goto L_0x0152
            r0 = r5[r1]
            if (r2 == r0) goto L_0x0153
            int r1 = r1 + 1
            goto L_0x0025
        L_0x002e:
            int r1 = r1 + 1
            goto L_0x000e
        L_0x0031:
            r1 = r4
            goto L_0x0017
        L_0x0033:
            java.lang.Object r5 = r7.A00
            com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity r5 = (com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity) r5
            int r2 = r5.A02
            int[] r6 = X.C47622Js.A02
            r1 = 0
        L_0x003c:
            int r4 = r6.length
            if (r1 >= r4) goto L_0x006a
            r0 = r6[r1]
            if (r2 != r0) goto L_0x0067
            if (r1 <= 0) goto L_0x006a
        L_0x0045:
            int r0 = r1 + -1
            r0 = r6[r0]
            r5.A02 = r0
            android.graphics.Typeface r1 = X.C47622Js.A03(r5, r0)
            android.widget.TextView r0 = r5.A0C
            r0.setTypeface(r1)
            com.obwhatsapp.status.playback.widget.StatusEditText r0 = r5.A0a
            r0.setTypeface(r1)
            int[] r3 = com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity.A0x
            int r2 = r5.A02
            r1 = 0
        L_0x005e:
            if (r1 >= r4) goto L_0x006c
            r0 = r6[r1]
            if (r2 == r0) goto L_0x006d
            int r1 = r1 + 1
            goto L_0x005e
        L_0x0067:
            int r1 = r1 + 1
            goto L_0x003c
        L_0x006a:
            r1 = r4
            goto L_0x0045
        L_0x006c:
            r1 = -1
        L_0x006d:
            r0 = r3[r1]
            java.lang.String r1 = r5.getString(r0)
            X.01V r0 = r5.A08
            X.AnonymousClass2JP.A00(r5, r0, r1)
            goto L_0x0163
        L_0x007a:
            java.lang.Object r1 = r7.A00
            X.2jq r1 = (X.C55552jq) r1
            int r0 = r1.A01
            boolean r0 = r1.A0J(r0)
            return r0
        L_0x0085:
            java.lang.Object r2 = r7.A00
            com.obwhatsapp.settings.SettingsUserProxyActivity r2 = (com.obwhatsapp.settings.SettingsUserProxyActivity) r2
            com.obwhatsapp.settings.SettingsUserProxyViewModel r0 = r2.A06
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0095
            r0 = 0
            return r0
        L_0x0095:
            X.1fu r3 = X.C32241fu.A00(r2)
            r0 = 2131890978(0x7f121322, float:1.9416663E38)
            r3.A02(r0)
            r1 = 2131887780(0x7f1206a4, float:1.9410177E38)
            r0 = 101(0x65, float:1.42E-43)
            X.C13680ns.A1H(r3, r2, r0, r1)
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            r1 = 22
            com.facebook.redex.IDxCListenerShape23S0000000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape23S0000000_2_I1
            r0.<init>(r1)
            r3.setNegativeButton(r2, r0)
            X.C13690nt.A1G(r3)
            goto L_0x0163
        L_0x00b9:
            java.lang.Object r3 = r7.A00
            X.2Rc r3 = (X.C49112Rc) r3
            X.2Ra r2 = r3.A05
            if (r2 == 0) goto L_0x0163
            X.4XG r0 = r3.A04
            if (r0 == 0) goto L_0x0163
            com.obwhatsapp.mediacomposer.doodle.DoodleView r1 = r2.A0H
            X.29k r0 = r1.A0J
            r0.A02()
            X.29m r0 = r1.A0G
            r0.A01()
            r0.A02()
            X.2Rb r0 = r2.A0J
            r1 = 0
            r0.A02 = r1
            com.obwhatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r2.A0E
            r0.A05(r1)
            X.4XG r0 = r2.A03
            r0.A00()
            X.2Rc r0 = r2.A0Q
            r0.A08(r1)
            com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r3.A0H
            android.view.View r1 = r0.A01
            r0 = 4
            r1.setVisibility(r0)
            X.4XG r0 = r3.A04
            r0.A04()
            X.2Ra r0 = r3.A05
            r0.A04()
            goto L_0x0163
        L_0x00fb:
            java.lang.Object r0 = r7.A00
            X.2gD r0 = (X.C53742gD) r0
            X.39Y r3 = r0.A0G
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0163
            X.4ET r0 = r3.A08
            com.obwhatsapp.mediacomposer.doodle.DoodleView r0 = r0.A00
            r0.invalidate()
            X.4Qt r2 = r3.A0B
            X.29k r1 = r2.A01
            X.393 r0 = r1.A03
            java.util.LinkedList r0 = r0.A00
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0127
            r1.A02()
            X.29m r0 = r2.A00
            r0.A01()
            r0.A02()
        L_0x0127:
            r0 = 1
            r3.A02(r0)
            goto L_0x0163
        L_0x012c:
            java.lang.Object r2 = r7.A00
            X.1yj r2 = (X.C42821yj) r2
            X.1M4 r0 = r2.A3x
            r1 = 2
            r0.A00(r1)
            X.2jf r0 = r2.A1i
            r0.A08(r1)
            goto L_0x0163
        L_0x013c:
            java.lang.Object r0 = r7.A00
            X.1bb r0 = (X.C30011bb) r0
            r0.A0s()
            goto L_0x0163
        L_0x0144:
            java.lang.Object r1 = r7.A00
            X.1aI r1 = (X.C29251aI) r1
            boolean r0 = r1.A0X()
            if (r0 != 0) goto L_0x0163
            r1.A0D()
            goto L_0x0163
        L_0x0152:
            r1 = -1
        L_0x0153:
            r0 = r3[r1]
            java.lang.String r1 = r6.getString(r0)
            X.01V r0 = r6.A08
            X.AnonymousClass2JP.A00(r6, r0, r1)
            X.1L1 r0 = r6.A0Z
            r0.A04()
        L_0x0163:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape177S0100000_2_I0.onLongClick(android.view.View):boolean");
    }
}
