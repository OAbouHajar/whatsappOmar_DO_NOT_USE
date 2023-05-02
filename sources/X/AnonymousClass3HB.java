package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3HB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3HB implements C54312hC {
    public final /* synthetic */ C35691mL A00;
    public final /* synthetic */ C448125q A01;
    public final /* synthetic */ UserJid A02;

    public /* synthetic */ AnonymousClass3HB(C35691mL r1, C448125q r2, UserJid userJid) {
        this.A01 = r2;
        this.A02 = userJid;
        this.A00 = r1;
    }

    public final void AOh(View view, C54302hB r13) {
        String A012;
        long A002;
        C448125q r3 = this.A01;
        UserJid userJid = this.A02;
        C35691mL r10 = this.A00;
        if (view.getTag(R.id.loaded_image_url) != null) {
            int i2 = r3.A02;
            int i3 = 21;
            if (i2 == 0) {
                i3 = 18;
            }
            r3.A08.A02(r3.A09, i3);
            Context context = r3.A03;
            AnonymousClass1P1 r32 = r3.A06;
            String str = r10.A04;
            synchronized (r32) {
                A012 = i2 == 0 ? AnonymousClass1P1.A01(userJid, str, r32.A00) : AnonymousClass1P1.A01(userJid, str, r32.A01);
            }
            String A0h = C13680ns.A0h("thumb-transition-", str);
            synchronized (r32) {
                A002 = i2 == 0 ? AnonymousClass1P1.A00(userJid, str, r32.A00) : AnonymousClass1P1.A00(userJid, str, r32.A01);
            }
            Intent A09 = C13680ns.A09();
            A09.setClassName(context.getPackageName(), "com.obwhatsapp.biz.linkedaccounts.LinkedAccountMediaView");
            A09.putExtra("extra_image", r10);
            A09.putExtra("extra_caption", A012);
            A09.putExtra("extra_timestamp", A002);
            A09.putExtra("extra_business_jid", userJid);
            A09.putExtra("extra_account_type", i2);
            C455529g.A08(context, A09, view, new C54602hp(context), A0h);
        }
    }
}
