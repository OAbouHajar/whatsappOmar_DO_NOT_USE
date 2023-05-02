package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2eZ  reason: invalid class name and case insensitive filesystem */
public class C52862eZ implements C52852eY {
    public final C17170ue A00;
    public final AnonymousClass1KA A01;
    public final C16460t6 A02;

    public C52862eZ(C17170ue r1, AnonymousClass1KA r2, C16460t6 r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void AaR(Context context, C16740tZ r12, C16880tn r13, int i2) {
        C35171lU r5 = r13.A04;
        if (r5 != null && r13.A00 == 2) {
            C17170ue r3 = this.A00;
            r3.A02(10);
            C35201lX r0 = r13.A02;
            String str = r0 != null ? r0.A01 : null;
            Intent intent = new Intent();
            intent.setClassName(context.getPackageName(), "com.obwhatsapp.biz.catalog.view.activity.ProductListActivity");
            intent.putExtra("message_content", r5);
            intent.putExtra("message_title", str);
            context.startActivity(intent);
            UserJid userJid = r5.A00;
            String str2 = r5.A01.A01;
            AnonymousClass1KA r2 = this.A01;
            r2.A0M.add(new C100344vU(r2, new AnonymousClass4KQ(this, r12, r13), str2));
            if (!r2.A08(new AnonymousClass26S(userJid, 0, (Integer) null, str2, r3.A00, false))) {
                StringBuilder sb = new StringBuilder("ProductHeaderIntegrityChecker/AsyncCallback/Failed to get product status, reason - ");
                sb.append("Failed to send product request");
                Log.e(sb.toString());
            }
        }
    }
}
