package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ap  reason: invalid class name and case insensitive filesystem */
public class C61843Ap {
    public static void A00(Context context, Intent intent, UserJid userJid, Integer num, Integer num2, String str, int i2, boolean z2) {
        Activity A01 = AnonymousClass22N.A01(context, C000900k.class);
        if (A01 != null) {
            intent.putExtra("product", str);
            intent.putExtra("disable_report", z2);
            intent.putExtra("jid", userJid.getRawString());
            if (num2 != null) {
                intent.putExtra("thumb_height", num2);
            }
            if (num != null) {
                intent.putExtra("thumb_width", num);
            }
            intent.putExtra("view_product_origin", i2);
            A01.startActivityForResult(intent, 0, !C61913Ax.A00 ? null : AnonymousClass09N.A02(A01, new AnonymousClass01Q[0]).A03());
        }
    }

    public static void A01(Context context, View view, C18640x1 r17, C38891ra r18, C25791Ld r19, int i2, boolean z2, boolean z3, boolean z4) {
        C38891ra r7 = r18;
        String str = r7.A06;
        UserJid userJid = r7.A01;
        AnonymousClass00B.A06(userJid);
        C18640x1 r6 = r17;
        C35701mM A05 = r6.A05((UserJid) null, str);
        Context context2 = context;
        int i3 = i2;
        boolean z5 = z3;
        boolean z6 = z4;
        if (A05 == null) {
            View view2 = view;
            C25791Ld r8 = r19;
            AnonymousClass3HG r3 = new AnonymousClass3HG(context2, view2, r6, r7, r8, i3, z5, z6);
            if (z2) {
                r8.A08(view2, r7, r3);
            } else {
                r8.A07(view2, r7, r3);
            }
        } else {
            A00(context, z4 ? C13680ns.A09().setClassName(context.getPackageName(), "com.obwhatsapp.biz.product.view.activity.ProductDetailActivity") : C14750ph.A0o(context, false), userJid, (Integer) null, (Integer) null, A05.A0D, i3, z5);
        }
    }
}
