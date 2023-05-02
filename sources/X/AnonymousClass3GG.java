package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3GG  reason: invalid class name */
public class AnonymousClass3GG implements C109385Rx {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass1Vt A01;
    public final /* synthetic */ AnonymousClass2SE A02;
    public final /* synthetic */ C228019i A03;
    public final /* synthetic */ C16740tZ A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public AnonymousClass3GG(Context context, AnonymousClass1Vt r2, AnonymousClass2SE r3, C228019i r4, C16740tZ r5, String str, boolean z2) {
        this.A03 = r4;
        this.A00 = context;
        this.A05 = str;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A06 = z2;
    }

    public void AQs() {
        this.A03.A00(this.A00, this.A01);
    }

    public void onSuccess() {
        Intent intent;
        C28411Vz A002;
        String A032;
        C228919r AEp;
        C228019i r4 = this.A03;
        Context context = this.A00;
        String str = this.A05;
        AnonymousClass1Vt r8 = this.A01;
        C16740tZ r5 = this.A04;
        AnonymousClass2SE r1 = this.A02;
        if (this.A06) {
            UserJid of = r5 == null ? null : UserJid.of(r5.A0B());
            RunnableRunnableShape9S0200000_I0_7 runnableRunnableShape9S0200000_I0_7 = new RunnableRunnableShape9S0200000_I0_7(r4, 17, r1);
            if (r8.A0C != null) {
                C14870pt r12 = r4.A00;
                if (r12.A0O()) {
                    r12.A08(0, R.string.str13db);
                    C13700nu.A0W(new C607736b(r4.A01, r4.A03, r4.A05, r8, of, r4.A0A, r4.A0B, r4.A0C, runnableRunnableShape9S0200000_I0_7, 15), r4.A0D);
                    return;
                }
                return;
            }
            C28391Vx A022 = r4.A0B.A02(r8.A0G);
            if (A022 != null && (AEp = A022.AEp(r8.A0I)) != null) {
                r4.A00.A08(0, R.string.str13db);
                AnonymousClass2H6 AES = AEp.AES();
                AnonymousClass00B.A06(AES);
                AES.Abf(C19980zJ.A00(context), r8, new AnonymousClass503(r8, r4, runnableRunnableShape9S0200000_I0_7));
                return;
            }
            return;
        }
        C227919h r52 = r4.A08;
        if (!(!r4.A07.A0D()) || r52.A05.A0B()) {
            intent = new Intent(context, r52.A07.A03().AFu());
        } else {
            intent = new Intent(context, r52.A07.A03().A9g());
            intent.putExtra("extra_setup_mode", 1);
        }
        intent.putExtra("extra_referral_screen", str);
        if (r8.A0C != null) {
            intent.putExtra("extra_request_message_key", r8.A0L);
            intent.putExtra("extra_conversation_message_type", 3);
            String str2 = r8.A0K;
            if (str2 != null) {
                intent.putExtra("extra_request_id", str2);
            }
            C15830rv r2 = r8.A0C;
            String str3 = "extra_jid";
            if (C16030sJ.A0L(r2)) {
                intent.putExtra(str3, r2.getRawString());
                A032 = C16030sJ.A03(r8.A0D);
                str3 = "extra_receiver_jid";
            } else {
                A032 = C16030sJ.A03(r8.A0D);
            }
            intent.putExtra(str3, A032);
        }
        if (!TextUtils.isEmpty(r8.A0K)) {
            intent.putExtra("extra_transaction_id", r8.A0K);
        }
        intent.putExtra("extra_transaction_type", r8.A03);
        AnonymousClass1W2 r0 = r8.A0A;
        if (r0 != null) {
            intent.putExtra("extra_payment_handle", new C35301lh(new C53852gP(), String.class, r0.A0I(), "paymentHandle"));
            intent.putExtra("extra_incoming_pay_request_id", r8.A0A.A0H());
        }
        C28401Vy r02 = r8.A08;
        if (!(r02 == null || TextUtils.isEmpty(r02.toString()) || (A002 = r52.A06.A00()) == null)) {
            intent.putExtra("extra_payment_preset_amount", A002.A9F(r52.A03, r8.A08));
        }
        ((C14550pN) C19980zJ.A00(context)).A2X(intent, false);
    }
}
