package X;

import android.os.Bundle;
import java.util.List;
import java.util.Locale;

/* renamed from: X.5n6  reason: invalid class name and case insensitive filesystem */
public class C114085n6 extends C114175nF {
    public static final C28411Vz A0K = C35481m0.A05;
    public final C16440t3 A00;
    public final AnonymousClass60V A01;
    public final C18310wU A02;
    public final AnonymousClass5xN A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;

    public C114085n6(Bundle bundle, C16300so r5, C14870pt r6, C16040sK r7, C15900s5 r8, C17150uc r9, AnonymousClass1ME r10, AnonymousClass01Y r11, C16000sG r12, AnonymousClass01V r13, C16440t3 r14, C16980tz r15, AnonymousClass013 r16, C16460t6 r17, C17630vO r18, C221116r r19, AnonymousClass173 r20, AnonymousClass160 r21, C14710pd r22, C17190ug r23, C1204661t r24, AnonymousClass60O r25, C119365wy r26, AnonymousClass60V r27, AnonymousClass107 r28, AnonymousClass175 r29, C18340wX r30, C18300wT r31, AnonymousClass17Y r32, C18310wU r33, C18090w8 r34, C18290wS r35, AnonymousClass1MA r36, C1222969a r37, AnonymousClass1MB r38, AnonymousClass1GO r39, C1200960h r40, C112715ix r41, AnonymousClass5wT r42, AnonymousClass5xN r43, C18280wR r44, C218315p r45, AnonymousClass1HB r46, C16320sq r47) {
        super(bundle, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47);
        this.A00 = r14;
        this.A03 = r43;
        this.A02 = r33;
        this.A01 = r27;
        this.A0D = bundle.getString("extra_new_mandate_transaction_ref");
        this.A09 = bundle.getString("extra_new_mandate_payee_name");
        this.A0A = bundle.getString("extra_new_mandate_preset_amount");
        this.A08 = bundle.getString("extra_new_mandate_merchant_code");
        bundle.getString("extra_new_mandate_initiation_mode");
        this.A0B = bundle.getString("extra_new_mandate_purpose_code");
        this.A0J = bundle.getString("extra_new_mandate_vpa");
        bundle.getString("extra_new_mandate_sign");
        String string = bundle.getString("extra_new_mandate_amount_rule");
        this.A04 = string == null ? null : string.toUpperCase(Locale.US);
        bundle.getString("extra_new_mandate_note");
        this.A07 = bundle.getString("extra_new_mandate_mandate_name");
        this.A0I = bundle.getString("extra_new_mandate_validity_start");
        this.A0H = bundle.getString("extra_new_mandate_validity_end");
        String string2 = bundle.getString("extra_new_mandate_frequency");
        this.A06 = string2 == null ? null : string2.toUpperCase(Locale.US);
        this.A0C = bundle.getString("extra_new_mandate_recurrence_day");
        String string3 = bundle.getString("extra_new_mandate_recurrence_rule");
        this.A0D = string3 == null ? null : string3.toUpperCase(Locale.US);
        this.A0E = bundle.getString("extra_new_mandate_rev");
        this.A0F = bundle.getString("extra_new_mandate_share");
        bundle.getString("extra_new_mandate_block");
        this.A0G = bundle.getString("extra_new_mandate_unique_mandate_number");
        this.A05 = bundle.getString("extra_update_mandate_transaction_id");
    }

    public void A0I(List list) {
        AnonymousClass5xB r4;
        C117415sx r1 = this.A07;
        AnonymousClass00B.A06(r1);
        AnonymousClass1Vt r9 = r1.A01;
        C111855hW A0K2 = C110115dX.A0K(r9);
        boolean A1V = AnonymousClass000.A1V(this.A0G);
        C30671cl r8 = r1.A00;
        AnonymousClass5xC r0 = A0K2.A0B;
        List list2 = list;
        if (r0 != null && (r4 = r0.A0C) != null && "UNKNOWN".equals(r4.A08) && "INIT".equals(r4.A09) && A1V) {
            long A032 = this.A03.A03(this.A0H, false);
            AnonymousClass5xC r42 = A0K2.A0B;
            boolean A1P = AnonymousClass000.A1P((A032 > r42.A01 ? 1 : (A032 == r42.A01 ? 0 : -1)));
            boolean equals = C39841t9.A00(this.A0A, "moneyStringValue").equals(r42.A09);
            if (A1P && equals) {
                C110755em.A01(this, new C114125nA(114));
                A0X(r9, A0K2, list);
                A0b(r9, list);
                A0Y(r9, A0K2, list);
                A0d(list);
                A0Z(r9, A0K2, list);
                A0K(list);
                C110755em.A02(list);
                A0W(r8, r9, A0K2, list2, A1V);
                C110755em.A02(list);
                A0O(list);
                C110755em.A02(list);
            }
        }
        A0a(r9, A0K2, list, true);
        A0X(r9, A0K2, list);
        A0b(r9, list);
        A0Y(r9, A0K2, list);
        A0d(list);
        A0Z(r9, A0K2, list);
        A0K(list);
        C110755em.A02(list);
        A0W(r8, r9, A0K2, list2, A1V);
        C110755em.A02(list);
        A0O(list);
        C110755em.A02(list);
    }
}
