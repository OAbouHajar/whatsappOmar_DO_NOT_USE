package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape21S0300000_2_I0;
import com.facebook.redex.IDxCListenerShape381S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape11S0200000_I0_9;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.R;

/* renamed from: X.1Kw  reason: invalid class name and case insensitive filesystem */
public class C25721Kw {
    public final C14870pt A00;
    public final C15900s5 A01;
    public final C15860rz A02;
    public final AnonymousClass10G A03;
    public final C19410yO A04;
    public final C17250um A05;
    public final C14710pd A06;
    public final AnonymousClass16S A07;
    public final C16320sq A08;

    public C25721Kw(C14870pt r1, C15900s5 r2, C15860rz r3, AnonymousClass10G r4, C19410yO r5, C17250um r6, C14710pd r7, AnonymousClass16S r8, C16320sq r9) {
        this.A06 = r7;
        this.A00 = r1;
        this.A08 = r9;
        this.A05 = r6;
        this.A01 = r2;
        this.A07 = r8;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
    }

    public static final String A00(Context context, int i2) {
        if (i2 == -1) {
            return context.getString(R.string.str068a);
        }
        return context.getResources().getQuantityString(R.plurals.plurals0033, i2, new Object[]{Integer.valueOf(i2)});
    }

    public C005302h A01(Context context, AnonymousClass5SB r11, String str, int i2) {
        Context context2 = context;
        AnonymousClass5SB r5 = r11;
        if (A09()) {
            return A05(context2, new IDxCListenerShape381S0100000_2_I0(r11, 1), 1, i2, 0, false);
        }
        return A04(context, r5, str, 1, false);
    }

    public C005302h A02(Context context, AnonymousClass5SB r11, String str, int i2) {
        Context context2 = context;
        AnonymousClass5SB r5 = r11;
        if (A09()) {
            return A05(context2, new IDxCListenerShape381S0100000_2_I0(r11, 1), 1, i2, 2, false);
        }
        return A04(context, r5, str, 1, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0039, code lost:
        if (r10 != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C005302h A03(android.content.Context r12, X.AnonymousClass5SB r13, java.lang.String r14, int r15, int r16, boolean r17) {
        /*
            r11 = this;
            r4 = 2131886996(0x7f120394, float:1.9408587E38)
            r8 = r11
            X.0rz r0 = r11.A02
            X.01D r0 = r0.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "pref_media_delete_per_conversation"
            r0 = 0
            boolean r10 = r2.getBoolean(r1, r0)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r12)
            r1 = 2131558931(0x7f0d0213, float:1.8743192E38)
            r0 = 0
            android.view.View r3 = r2.inflate(r1, r0)
            r0 = 2131363130(0x7f0a053a, float:1.834606E38)
            android.view.View r6 = r3.findViewById(r0)
            android.widget.CheckBox r6 = (android.widget.CheckBox) r6
            r0 = r16
            java.lang.String r0 = A00(r12, r0)
            r6.setText(r0)
            r5 = 1
            r9 = r17
            if (r17 == 0) goto L_0x003b
            r0 = 0
            if (r10 == 0) goto L_0x003c
        L_0x003b:
            r0 = 1
        L_0x003c:
            r6.setChecked(r0)
            X.1fu r2 = new X.1fu
            r2.<init>(r12)
            android.content.Context r1 = r12.getApplicationContext()
            X.0um r0 = r11.A05
            java.lang.CharSequence r0 = X.AnonymousClass2Sy.A05(r1, r0, r14)
            r2.A06(r0)
            r2.A07(r5)
            r1 = 138(0x8a, float:1.93E-43)
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r7 = r13
            r0.<init>(r13, r1)
            r2.setNegativeButton(r4, r0)
            X.4fr r5 = new X.4fr
            r5.<init>(r6, r7, r8, r9, r10)
            r2.setPositiveButton(r15, r5)
            r2.setView(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25721Kw.A03(android.content.Context, X.5SB, java.lang.String, int, int, boolean):X.02h");
    }

    public final C005302h A04(Context context, AnonymousClass5SB r9, String str, int i2, boolean z2) {
        return A03(context, r9, str, R.string.str1c4c, i2, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e3, code lost:
        if (r7 > 1) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0121, code lost:
        if (r7 > 1) goto L_0x0123;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C005302h A05(android.content.Context r17, X.AnonymousClass5SC r18, int r19, int r20, int r21, boolean r22) {
        /*
            r16 = this;
            r5 = r17
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r5)
            r1 = 2131558951(0x7f0d0227, float:1.8743232E38)
            r0 = 0
            android.view.View r6 = r2.inflate(r1, r0)
            r0 = 2131363132(0x7f0a053c, float:1.8346064E38)
            android.view.View r3 = X.C004601z.A0E(r6, r0)
            r0 = 2131363141(0x7f0a0545, float:1.8346082E38)
            android.view.View r2 = X.C004601z.A0E(r6, r0)
            r0 = 2131363130(0x7f0a053a, float:1.834606E38)
            android.view.View r10 = X.C004601z.A0E(r6, r0)
            android.widget.CheckBox r10 = (android.widget.CheckBox) r10
            r0 = 2131363131(0x7f0a053b, float:1.8346062E38)
            android.view.View r4 = X.C004601z.A0E(r6, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2131362755(0x7f0a03c3, float:1.83453E38)
            android.view.View r9 = X.C004601z.A0E(r6, r0)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r13 = r16
            X.0s5 r1 = r13.A01
            X.0s8 r0 = X.C15910s6.A0X
            boolean r1 = r1.A05(r0)
            r0 = 2131887761(0x7f120691, float:1.9410138E38)
            if (r1 == 0) goto L_0x0049
            r0 = 2131887760(0x7f120690, float:1.9410136E38)
        L_0x0049:
            r9.setText(r0)
            r1 = 8
            r9.setVisibility(r1)
            X.0rz r0 = r13.A02
            X.01D r0 = r0.A01
            java.lang.Object r8 = r0.get()
            android.content.SharedPreferences r8 = (android.content.SharedPreferences) r8
            java.lang.String r7 = "pref_media_delete_per_conversation"
            r0 = 0
            boolean r15 = r8.getBoolean(r7, r0)
            r0 = 2131363140(0x7f0a0544, float:1.834608E38)
            android.view.View r11 = X.C004601z.A0E(r6, r0)
            android.widget.CheckBox r11 = (android.widget.CheckBox) r11
            r7 = 1
            r14 = r21
            if (r21 == 0) goto L_0x0075
            r0 = 1
            r7 = 0
            if (r14 == r0) goto L_0x0075
            r7 = r15
        L_0x0075:
            r10.setChecked(r7)
            r7 = r19
            java.lang.String r0 = A00(r5, r7)
            r4.setText(r0)
            r4 = 0
            if (r22 == 0) goto L_0x0085
            r1 = 0
        L_0x0085:
            r2.setVisibility(r1)
            X.16S r0 = r13.A07
            X.0rz r0 = r0.A01
            boolean r0 = r0.A1d()
            if (r0 == 0) goto L_0x009f
            X.0sq r8 = r13.A08
            r0 = 4
            com.whatsapp.util.IDxATaskShape26S0200000_2_I0 r1 = new com.whatsapp.util.IDxATaskShape26S0200000_2_I0
            r1.<init>(r9, r0, r13)
            java.lang.Void[] r0 = new java.lang.Void[r4]
            r8.Ack(r1, r0)
        L_0x009f:
            r1 = 45
            com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6 r0 = new com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6
            r0.<init>(r10, r1)
            r3.setOnClickListener(r0)
            r1 = 46
            com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6 r0 = new com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6
            r0.<init>(r11, r1)
            r2.setOnClickListener(r0)
            r2 = -1
            r1 = 1
            r8 = r20
            if (r20 == 0) goto L_0x013f
            if (r8 == r1) goto L_0x0133
            r0 = 2
            if (r8 == r0) goto L_0x0127
            r0 = 2131887214(0x7f12046e, float:1.9409029E38)
            if (r7 != r2) goto L_0x00c6
            r0 = 2131887205(0x7f120465, float:1.940901E38)
        L_0x00c6:
            java.lang.String r0 = r5.getString(r0)
        L_0x00ca:
            X.1fu r2 = new X.1fu
            r2.<init>(r5)
            r2.setTitle(r0)
            r2.setView(r6)
            r3 = -1
            r1 = 1
            if (r20 == 0) goto L_0x011c
            if (r8 == r1) goto L_0x0110
            r0 = 2
            if (r8 == r0) goto L_0x0104
            if (r7 == r3) goto L_0x00e5
            r0 = 2131887212(0x7f12046c, float:1.9409025E38)
            if (r7 <= r1) goto L_0x00e8
        L_0x00e5:
            r0 = 2131887211(0x7f12046b, float:1.9409023E38)
        L_0x00e8:
            java.lang.String r0 = r5.getString(r0)
            X.4fv r9 = new X.4fv
            r12 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r2.A09(r9, r0)
            r3 = 2131886996(0x7f120394, float:1.9408587E38)
            r1 = 140(0x8c, float:1.96E-43)
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r12, r1)
            r2.setNegativeButton(r3, r0)
            return r2
        L_0x0104:
            if (r7 == r1) goto L_0x0107
            r1 = 0
        L_0x0107:
            java.lang.String r0 = "Use DELETE_GROUP_CHAT only for single group deletion"
            X.AnonymousClass00B.A0B(r0, r1)
            r0 = 2131887775(0x7f12069f, float:1.9410167E38)
            goto L_0x00e8
        L_0x0110:
            if (r7 == r1) goto L_0x0113
            r1 = 0
        L_0x0113:
            java.lang.String r0 = "Use DELETE_BROADCAST_LIST only for single broadcast deletion"
            X.AnonymousClass00B.A0B(r0, r1)
            r0 = 2131887756(0x7f12068c, float:1.9410128E38)
            goto L_0x00e8
        L_0x011c:
            if (r7 == r3) goto L_0x0123
            r0 = 2131887798(0x7f1206b6, float:1.9410213E38)
            if (r7 <= r1) goto L_0x00e8
        L_0x0123:
            r0 = 2131887788(0x7f1206ac, float:1.9410193E38)
            goto L_0x00e8
        L_0x0127:
            if (r7 != r1) goto L_0x012a
            r4 = 1
        L_0x012a:
            java.lang.String r0 = "Use DELETE_SINGLE_GROUP_CHAT only for single broadcast deletion"
            X.AnonymousClass00B.A0D(r0, r4)
            r0 = 2131887778(0x7f1206a2, float:1.9410173E38)
            goto L_0x00c6
        L_0x0133:
            if (r7 != r1) goto L_0x0136
            r4 = 1
        L_0x0136:
            java.lang.String r0 = "Use DELETE_SINGLE_BROADCAST_LIST only for single broadcast deletion"
            X.AnonymousClass00B.A0D(r0, r4)
            r0 = 2131887757(0x7f12068d, float:1.941013E38)
            goto L_0x00c6
        L_0x013f:
            if (r7 != r2) goto L_0x0145
            r0 = 2131887750(0x7f120686, float:1.9410116E38)
            goto L_0x00c6
        L_0x0145:
            android.content.res.Resources r3 = r5.getResources()
            r2 = 2131755052(0x7f10002c, float:1.9140972E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1[r4] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r7, r1)
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25721Kw.A05(android.content.Context, X.5SC, int, int, int, boolean):X.02h");
    }

    public final C005302h A06(Context context, AnonymousClass5SC r10, String str, int i2, boolean z2) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout0227, (ViewGroup) null);
        inflate.findViewById(R.id.delete_media_container);
        CompoundButton compoundButton = (CompoundButton) inflate.findViewById(R.id.delete_media_checkbox);
        View findViewById = inflate.findViewById(R.id.delete_starred_checkbox);
        compoundButton.setChecked(z2);
        ((TextView) inflate.findViewById(R.id.delete_media_checkbox_text)).setText(A00(context, i2));
        inflate.findViewById(R.id.delete_media_container).setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(compoundButton, 44));
        inflate.findViewById(R.id.delete_starred_container).setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(findViewById, 47));
        C32241fu r4 = new C32241fu(context);
        r4.setView(inflate);
        r4.setPositiveButton(R.string.str0462, new IDxCListenerShape21S0300000_2_I0(compoundButton, findViewById, r10, 3));
        r4.setNegativeButton(R.string.str0394, new IDxCListenerShape127S0100000_2_I0(r10, 139));
        if (!TextUtils.isEmpty((CharSequence) null)) {
            r4.setTitle((CharSequence) null);
        } else {
            r4.A02(R.string.str0463);
        }
        if (!TextUtils.isEmpty(str)) {
            ((TextView) inflate.findViewById(R.id.clear_messages_dialog_message)).setText(str);
        }
        return r4;
    }

    public AnonymousClass1WD A07(C001000l r6) {
        AnonymousClass1WD r4 = new AnonymousClass1WD();
        if (((SharedPreferences) this.A02.A01.get()).getBoolean("delete_chat_clear_chat_nux_accepted", false) || !this.A07.A01.A1d()) {
            r4.A02(Boolean.FALSE);
            return r4;
        }
        this.A08.Ack(new AnonymousClass367(r6, r4, this), new Void[0]);
        return r4;
    }

    public void A08(C15830rv r5, AnonymousClass1XZ r6) {
        C79103zC r2 = new C79103zC(this.A03, r5, r6);
        this.A08.Ack(r2, new Void[0]);
        this.A00.A0L(new RunnableRunnableShape11S0200000_I0_9(r2, 17, r6), 500);
    }

    public final boolean A09() {
        return this.A06.A0E(C16620tM.A02, 498) || this.A07.A01.A1d();
    }
}
