package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.List;

/* renamed from: X.5ds  reason: invalid class name and case insensitive filesystem */
public class C110315ds extends ArrayAdapter {
    public List A00;
    public final LayoutInflater A01;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110315ds(Context context, PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity, List list) {
        super(context, R.layout.layout02d1, list);
        this.A02 = paymentGroupParticipantPickerActivity;
        this.A01 = LayoutInflater.from(context);
        this.A00 = C13680ns.A0n(list);
    }

    public int getCount() {
        List list = this.A00;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A00.get(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x010d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r15, android.view.View r16, android.view.ViewGroup r17) {
        /*
            r14 = this;
            r9 = r16
            r2 = 0
            r5 = 0
            if (r16 != 0) goto L_0x016e
            android.view.LayoutInflater r1 = r14.A01
            r0 = 2131559121(0x7f0d02d1, float:1.8743577E38)
            r3 = r17
            android.view.View r9 = r1.inflate(r0, r3, r5)
            X.5sv r0 = new X.5sv
            r0.<init>()
            r13 = 2131364789(0x7f0a0bb5, float:1.8349425E38)
            com.obwhatsapp.payments.ui.PaymentGroupParticipantPickerActivity r1 = r14.A02
            X.0sP r10 = r1.A05
            X.1Lc r12 = r1.A0I
            X.013 r11 = r1.A01
            X.1cU r8 = new X.1cU
            r8.<init>((android.view.View) r9, (X.C16080sP) r10, (X.AnonymousClass013) r11, (X.C25781Lc) r12, (int) r13)
            r0.A03 = r8
            r1 = 2131362105(0x7f0a0139, float:1.8343981E38)
            android.widget.ImageView r1 = X.C13680ns.A0K(r9, r1)
            r0.A00 = r1
            r1 = 2131365583(0x7f0a0ecf, float:1.8351035E38)
            android.view.View r1 = r9.findViewById(r1)
            com.obwhatsapp.TextEmojiLabel r1 = (com.obwhatsapp.TextEmojiLabel) r1
            r0.A02 = r1
            r1 = 2131366341(0x7f0a11c5, float:1.8352573E38)
            android.widget.TextView r1 = X.C13680ns.A0M(r9, r1)
            r0.A01 = r1
            r9.setTag(r0)
        L_0x0048:
            X.1cU r1 = r0.A03
            r1.A0E(r2)
            X.1cU r3 = r0.A03
            android.content.Context r2 = r14.getContext()
            r1 = 2131100935(0x7f060507, float:1.7814265E38)
            int r1 = X.AnonymousClass00T.A00(r2, r1)
            r3.A06(r1)
            X.1cU r1 = r0.A03
            r2 = 1065353216(0x3f800000, float:1.0)
            com.obwhatsapp.TextEmojiLabel r1 = r1.A02
            r1.setAlpha(r2)
            com.obwhatsapp.TextEmojiLabel r1 = r0.A02
            r2 = 8
            r1.setVisibility(r2)
            android.widget.TextView r1 = r0.A01
            r1.setVisibility(r2)
            android.widget.TextView r2 = r0.A01
            r1 = 2131889953(0x7f120f21, float:1.9414584E38)
            r2.setText(r1)
            java.util.List r1 = r14.A00
            java.lang.Object r3 = r1.get(r15)
            X.5ru r3 = (X.C116765ru) r3
            X.AnonymousClass00B.A06(r3)
            X.0sH r7 = r3.A00
            r0.A04 = r3
            X.1cU r1 = r0.A03
            r1.A0A(r7)
            android.widget.ImageView r6 = r0.A00
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0o()
            android.content.Context r1 = r14.getContext()
            X.2hp r2 = new X.2hp
            r2.<init>(r1)
            r1 = 2131893713(0x7f121dd1, float:1.942221E38)
            java.lang.String r1 = r2.A00(r1)
            r4.append(r1)
            X.0rv r1 = r7.A07()
            java.lang.String r1 = X.C16030sJ.A03(r1)
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r4)
            X.C004601z.A0n(r6, r1)
            com.obwhatsapp.payments.ui.PaymentGroupParticipantPickerActivity r6 = r14.A02
            X.2Ao r2 = r6.A06
            android.widget.ImageView r1 = r0.A00
            r2.A06(r1, r7)
            android.widget.ImageView r4 = r0.A00
            r2 = 1
            com.facebook.redex.IDxCListenerShape27S0300000_3_I1 r1 = new com.facebook.redex.IDxCListenerShape27S0300000_3_I1
            r1.<init>(r7, r0, r14, r2)
            r4.setOnClickListener(r1)
            X.0w8 r2 = r6.A0C
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r7.A08(r4)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            int r1 = r2.A00(r1)
            r8 = 2
            if (r1 == r8) goto L_0x010e
            X.1cU r1 = r0.A03
            r2 = 1056964608(0x3f000000, float:0.5)
            com.obwhatsapp.TextEmojiLabel r1 = r1.A02
            r1.setAlpha(r2)
            android.widget.TextView r1 = r0.A01
            r1.setVisibility(r5)
            X.1ko r1 = r7.A0D
            if (r1 == 0) goto L_0x00fd
            java.lang.String r1 = r1.A01
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00fd
            android.widget.TextView r2 = r0.A01
            r1 = 2131887431(0x7f120547, float:1.9409469E38)
        L_0x00fa:
            r2.setText(r1)
        L_0x00fd:
            java.lang.String r1 = r7.A0W
            if (r1 == 0) goto L_0x010d
            X.1ko r1 = r7.A0D
            if (r1 == 0) goto L_0x0176
            java.lang.String r1 = r1.A01
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0176
        L_0x010d:
            return r9
        L_0x010e:
            X.01Y r2 = r6.A02
            com.whatsapp.jid.Jid r1 = r7.A08(r4)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r1 = r2.A0V(r1)
            if (r1 == 0) goto L_0x0130
            X.1cU r1 = r0.A03
            r2 = 1056964608(0x3f000000, float:0.5)
            com.obwhatsapp.TextEmojiLabel r1 = r1.A02
            r1.setAlpha(r2)
            android.widget.TextView r1 = r0.A01
            r1.setVisibility(r5)
            android.widget.TextView r2 = r0.A01
            r1 = 2131892353(0x7f121881, float:1.9419452E38)
            goto L_0x00fa
        L_0x0130:
            X.0pd r2 = r6.A0C
            r1 = 733(0x2dd, float:1.027E-42)
            boolean r1 = r2.A0C(r1)
            if (r1 != 0) goto L_0x0144
            X.0pd r2 = r6.A0C
            r1 = 544(0x220, float:7.62E-43)
            boolean r1 = r2.A0C(r1)
            if (r1 == 0) goto L_0x00fd
        L_0x0144:
            X.1m3 r2 = r3.A01
            X.0wS r1 = r6.A0D
            X.19r r1 = r1.A03()
            X.2Ir r1 = r1.AEf()
            if (r1 == 0) goto L_0x00fd
            if (r2 == 0) goto L_0x00fd
            X.1t8 r1 = r2.A06()
            long r3 = r1.A00
            r1 = 12
            long r3 = r3 >> r1
            r1 = 15
            long r3 = r3 & r1
            int r1 = (int) r3
            if (r1 != r8) goto L_0x00fd
            android.widget.TextView r1 = r0.A01
            r1.setVisibility(r5)
            android.widget.TextView r2 = r0.A01
            r1 = 2131890284(0x7f12106c, float:1.9415255E38)
            goto L_0x00fa
        L_0x016e:
            java.lang.Object r0 = r9.getTag()
            X.5sv r0 = (X.C117395sv) r0
            goto L_0x0048
        L_0x0176:
            com.obwhatsapp.TextEmojiLabel r1 = r0.A02
            r1.setVisibility(r5)
            com.obwhatsapp.TextEmojiLabel r1 = r0.A02
            X.0sP r0 = r6.A05
            java.lang.String r0 = r0.A0F(r7)
            r1.A0G(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110315ds.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
