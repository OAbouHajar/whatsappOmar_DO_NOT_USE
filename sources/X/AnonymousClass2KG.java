package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.obwhatsapp.R;

/* renamed from: X.2KG  reason: invalid class name */
public abstract class AnonymousClass2KG {
    public Context A00;
    public C18290wS A01;
    public final AnonymousClass1Vo A02 = AnonymousClass1Vo.A00("PaymentMethodNotificationUtil", "notification", "COMMON");

    public AnonymousClass2KG(Context context, C18290wS r5) {
        this.A00 = context;
        this.A01 = r5;
    }

    public PendingIntent A00(Context context, C30671cl r8, String str) {
        Intent intent;
        C228919r A03 = this.A01.A03();
        if (r8 != null) {
            intent = new Intent(context, A03.A9e());
            intent.addFlags(335544320);
            intent.putExtra("extra_bank_account", r8);
        } else {
            Class AEt = A03.AEt();
            AnonymousClass1Vo r2 = this.A02;
            StringBuilder sb = new StringBuilder("getPendingIntent for ");
            sb.append(str);
            r2.A06(sb.toString());
            intent = new Intent(context, AEt);
            intent.addFlags(335544320);
        }
        return C42341xd.A00(context, 0, intent, 0);
    }

    public abstract String A01(C30671cl r1, C28371Vv r2);

    public String A02(C30671cl r3, String str) {
        return this.A00.getString(R.string.str19cd);
    }

    public String A03(C30671cl r4, String str) {
        return this.A00.getResources().getQuantityString(R.plurals.plurals00ee, 1);
    }
}
