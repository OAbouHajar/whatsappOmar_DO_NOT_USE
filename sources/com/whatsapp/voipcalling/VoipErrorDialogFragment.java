package com.whatsapp.voipcalling;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.C15830rv;
import X.C15900s5;
import X.C16000sG;
import X.C16080sP;
import X.C40631uR;
import X.C52302dW;
import android.os.Bundle;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VoipErrorDialogFragment extends Hilt_VoipErrorDialogFragment {
    public int A00;
    public int A01;
    public C15900s5 A02;
    public C52302dW A03;
    public C16000sG A04;
    public C16080sP A05;
    public ArrayList A06 = new ArrayList();

    public static VoipErrorDialogFragment A01(Bundle bundle, C52302dW r3, int i2) {
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.putInt("error", i2);
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        voipErrorDialogFragment.A0T(bundle2);
        voipErrorDialogFragment.A03 = r3;
        return voipErrorDialogFragment;
    }

    public static VoipErrorDialogFragment A02(C52302dW r2, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("error", i2);
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        voipErrorDialogFragment.A0T(bundle);
        voipErrorDialogFragment.A03 = r2;
        return voipErrorDialogFragment;
    }

    public static VoipErrorDialogFragment A03(List list, int i2, boolean z2) {
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        Bundle bundle = new Bundle();
        int i3 = 1;
        if (z2) {
            i3 = 2;
        }
        bundle.putInt("error", i3);
        bundle.putParcelableArrayList("user_jids", new ArrayList(list));
        bundle.putInt("call_size", i2);
        voipErrorDialogFragment.A0T(bundle);
        voipErrorDialogFragment.A03 = new C52302dW();
        return voipErrorDialogFragment;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        Bundle bundle2 = this.A05;
        if (bundle2 != null) {
            this.A01 = bundle2.getInt("error");
            this.A06 = bundle2.getParcelableArrayList("user_jids");
            this.A00 = bundle2.getInt("call_size");
        }
        if (this.A06 == null) {
            this.A06 = new ArrayList();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1B(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.A1O()
            java.lang.String r1 = r5.A1N()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r0 = 0
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            X.AnonymousClass00B.A0F(r0)
            X.00l r0 = r5.A0D()
            X.1fu r4 = new X.1fu
            r4.<init>(r0)
            java.lang.String r0 = r5.A1O()
            r4.setTitle(r0)
            java.lang.String r0 = r5.A1N()
            r4.A06(r0)
            r4.A07(r2)
            int r0 = r5.A01
            switch(r0) {
                case 1: goto L_0x003f;
                case 2: goto L_0x003f;
                case 3: goto L_0x003f;
                case 4: goto L_0x003f;
                case 5: goto L_0x008a;
                case 6: goto L_0x003f;
                case 7: goto L_0x003f;
                case 8: goto L_0x003f;
                case 9: goto L_0x003f;
                case 10: goto L_0x003f;
                case 11: goto L_0x003f;
                case 12: goto L_0x003f;
                case 13: goto L_0x003f;
                case 14: goto L_0x003f;
                case 15: goto L_0x003f;
                case 16: goto L_0x003f;
                case 17: goto L_0x003f;
                case 18: goto L_0x003f;
                case 19: goto L_0x0084;
                case 20: goto L_0x0084;
                case 21: goto L_0x003f;
                case 22: goto L_0x003f;
                case 23: goto L_0x003f;
                case 24: goto L_0x003f;
                case 25: goto L_0x003f;
                case 26: goto L_0x003f;
                default: goto L_0x003a;
            }
        L_0x003a:
            java.lang.String r0 = "Unknown error"
            X.AnonymousClass00B.A0B(r0, r3)
        L_0x003f:
            int r0 = r5.A01
            switch(r0) {
                case 1: goto L_0x0076;
                case 2: goto L_0x0076;
                case 3: goto L_0x0076;
                case 4: goto L_0x0076;
                case 5: goto L_0x0070;
                case 6: goto L_0x0076;
                case 7: goto L_0x0076;
                case 8: goto L_0x0076;
                case 9: goto L_0x0076;
                case 10: goto L_0x0076;
                case 11: goto L_0x006a;
                case 12: goto L_0x0076;
                case 13: goto L_0x0076;
                case 14: goto L_0x0076;
                case 15: goto L_0x0076;
                case 16: goto L_0x0076;
                case 17: goto L_0x0076;
                case 18: goto L_0x0076;
                case 19: goto L_0x0070;
                case 20: goto L_0x0070;
                case 21: goto L_0x006a;
                case 22: goto L_0x006a;
                case 23: goto L_0x006a;
                case 24: goto L_0x006a;
                case 25: goto L_0x0076;
                case 26: goto L_0x006a;
                default: goto L_0x0044;
            }
        L_0x0044:
            java.lang.String r0 = "Unknown error"
            X.AnonymousClass00B.A0B(r0, r3)
        L_0x0049:
            android.os.Bundle r1 = r5.A05
            if (r1 == 0) goto L_0x0060
            java.lang.String r0 = "finish"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x0060
            r3 = 1
            r0 = 2
            com.facebook.redex.IDxKListenerShape223S0100000_2_I0 r1 = new com.facebook.redex.IDxKListenerShape223S0100000_2_I0
            r1.<init>(r5, r0)
            X.0PG r0 = r4.A01
            r0.A08 = r1
        L_0x0060:
            X.02l r1 = r4.create()
            r0 = r3 ^ 1
            r1.setCanceledOnTouchOutside(r0)
            return r1
        L_0x006a:
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 146(0x92, float:2.05E-43)
            goto L_0x007b
        L_0x0070:
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            r1 = 143(0x8f, float:2.0E-43)
            goto L_0x007b
        L_0x0076:
            r2 = 2131889799(0x7f120e87, float:1.9414272E38)
            r1 = 145(0x91, float:2.03E-43)
        L_0x007b:
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r5, r1)
            r4.setNegativeButton(r2, r0)
            goto L_0x0049
        L_0x0084:
            r2 = 2131886945(0x7f120361, float:1.9408483E38)
            r1 = 144(0x90, float:2.02E-43)
            goto L_0x008f
        L_0x008a:
            r2 = 2131892894(0x7f121a9e, float:1.942055E38)
            r1 = 142(0x8e, float:1.99E-43)
        L_0x008f:
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r5, r1)
            r4.setPositiveButton(r2, r0)
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipErrorDialogFragment.A1B(android.os.Bundle):android.app.Dialog");
    }

    public final String A1N() {
        int i2;
        switch (this.A01) {
            case 1:
                AnonymousClass013 r5 = this.A02;
                int i3 = this.A00;
                long j2 = (long) i3;
                return r5.A0J(new Object[]{Integer.valueOf(i3)}, R.plurals.plurals018a, j2);
            case 2:
                ArrayList arrayList = this.A06;
                int size = arrayList.size();
                AnonymousClass013 r52 = this.A02;
                if (size == 1) {
                    long j3 = (long) this.A00;
                    return r52.A0J(new Object[]{A1P(arrayList), Integer.valueOf(this.A00)}, R.plurals.plurals018c, j3);
                }
                int i4 = this.A00;
                long j4 = (long) i4;
                return r52.A0J(new Object[]{Integer.valueOf(i4)}, R.plurals.plurals018b, j4);
            case 3:
                i2 = R.string.str1acc;
                break;
            case 4:
                return A0K(R.string.str1ac5, 64);
            case 5:
                i2 = R.string.str1aa6;
                break;
            case 6:
                i2 = R.string.str1aab;
                break;
            case 7:
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                i2 = R.string.str1aaa;
                break;
            case 8:
                i2 = R.string.str1aa4;
                break;
            case 9:
                i2 = R.string.str1aa8;
                break;
            case 10:
                i2 = R.string.str0c54;
                break;
            case 11:
                i2 = R.string.str0c50;
                break;
            case 12:
                i2 = R.string.str0c51;
                break;
            case 13:
                i2 = R.string.str0c5a;
                break;
            case 14:
                i2 = R.string.str0c59;
                break;
            case 15:
                i2 = R.string.str0c52;
                break;
            case 16:
                i2 = R.string.str0c5b;
                break;
            case 17:
                i2 = R.string.str171b;
                break;
            case 18:
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                return A0K(R.string.str1a98, A1P(this.A06));
            case 19:
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                i2 = R.string.str0347;
                break;
            case 20:
                i2 = R.string.str0450;
                break;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                i2 = R.string.str0ba2;
                break;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                i2 = R.string.str12ab;
                break;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                i2 = R.string.str1861;
                break;
            default:
                AnonymousClass00B.A0B("Unknown error", false);
                return "";
        }
        return A0J(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        return A0J(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        return "";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A1O() {
        /*
            r9 = this;
            int r0 = r9.A01
            java.lang.String r1 = ""
            r7 = 0
            switch(r0) {
                case 1: goto L_0x000e;
                case 2: goto L_0x0057;
                case 3: goto L_0x005b;
                case 4: goto L_0x005f;
                case 5: goto L_0x0063;
                case 6: goto L_0x0063;
                case 7: goto L_0x0063;
                case 8: goto L_0x0067;
                case 9: goto L_0x006b;
                case 10: goto L_0x006f;
                case 11: goto L_0x006f;
                case 12: goto L_0x0067;
                case 13: goto L_0x006f;
                case 14: goto L_0x006f;
                case 15: goto L_0x006f;
                case 16: goto L_0x006f;
                case 17: goto L_0x006f;
                case 18: goto L_0x000d;
                case 19: goto L_0x0073;
                case 20: goto L_0x005b;
                case 21: goto L_0x0077;
                case 22: goto L_0x000d;
                case 23: goto L_0x007b;
                case 24: goto L_0x0063;
                case 25: goto L_0x000d;
                case 26: goto L_0x000d;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.String r0 = "Unknown error"
            X.AnonymousClass00B.A0B(r0, r7)
        L_0x000d:
            return r1
        L_0x000e:
            java.util.ArrayList r8 = r9.A06
            int r1 = r8.size()
            r0 = 3
            r6 = 1
            X.013 r5 = r9.A02
            if (r1 > r0) goto L_0x002f
            r4 = 2131755401(0x7f100189, float:1.914168E38)
            int r0 = r8.size()
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r9.A1P(r8)
            r1[r7] = r0
            java.lang.String r0 = r5.A0J(r1, r4, r2)
            return r0
        L_0x002f:
            r4 = 2131755400(0x7f100188, float:1.9141678E38)
            int r0 = r8.size()
            int r0 = r0 - r6
            long r1 = (long) r0
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.util.List r0 = r8.subList(r7, r6)
            java.lang.String r0 = r9.A1P(r0)
            r3[r7] = r0
            java.util.ArrayList r0 = r9.A06
            int r0 = r0.size()
            int r0 = r0 - r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r6] = r0
            java.lang.String r0 = r5.A0J(r3, r4, r1)
            return r0
        L_0x0057:
            r0 = 2131892887(0x7f121a97, float:1.9420535E38)
            goto L_0x007e
        L_0x005b:
            r0 = 2131892941(0x7f121acd, float:1.9420644E38)
            goto L_0x007e
        L_0x005f:
            r0 = 2131892934(0x7f121ac6, float:1.942063E38)
            goto L_0x007e
        L_0x0063:
            r0 = 2131892908(0x7f121aac, float:1.9420578E38)
            goto L_0x007e
        L_0x0067:
            r0 = 2131892901(0x7f121aa5, float:1.9420563E38)
            goto L_0x007e
        L_0x006b:
            r0 = 2131892905(0x7f121aa9, float:1.9420571E38)
            goto L_0x007e
        L_0x006f:
            r0 = 2131892860(0x7f121a7c, float:1.942048E38)
            goto L_0x007e
        L_0x0073:
            r0 = 2131886920(0x7f120348, float:1.9408432E38)
            goto L_0x007e
        L_0x0077:
            r0 = 2131886958(0x7f12036e, float:1.940851E38)
            goto L_0x007e
        L_0x007b:
            r0 = 2131892321(0x7f121861, float:1.9419387E38)
        L_0x007e:
            java.lang.String r0 = r9.A0J(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipErrorDialogFragment.A1O():java.lang.String");
    }

    public final String A1P(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.A05.A0C(this.A04.A0A((C15830rv) it.next())));
        }
        if (arrayList.size() <= 3) {
            return C40631uR.A00(this.A05.A07, arrayList, true);
        }
        int size = arrayList.size() - 1;
        return this.A02.A0J(new Object[]{arrayList.get(0), Integer.valueOf(size)}, R.plurals.plurals00b8, (long) size);
    }
}
