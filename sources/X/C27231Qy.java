package X;

import android.app.Activity;
import android.content.Intent;
import com.obwhatsapp.Conversation;
import java.util.Map;

/* renamed from: X.1Qy  reason: invalid class name and case insensitive filesystem */
public class C27231Qy extends C27151Qq {
    public final AnonymousClass013 A00;
    public final C18440wh A01;

    public C27231Qy(C20190ze r1, AnonymousClass013 r2, C18440wh r3) {
        super(r1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void A05(Activity activity, C35071lK r23, String str, String str2, long j2) {
        String str3;
        long j3;
        C35001lD r11;
        Activity activity2 = activity;
        String str4 = str;
        long j4 = j2;
        super.A05(activity2, r23, str4, str2, j4);
        Activity A002 = AnonymousClass22N.A00(activity2);
        AnonymousClass22D r4 = (AnonymousClass22D) ((Map) this.A01.A01.getValue()).get("address_message");
        if (r4 == null) {
            str3 = "com.bloks.www.whatsapp.commerce.address_message";
        } else if (r4.A03) {
            str3 = r4.A01;
        } else {
            return;
        }
        if (A002 != null) {
            AnonymousClass013 r13 = this.A00;
            String str5 = str3;
            if (r4 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(r4.A01);
                sb.append(r4.A02);
                str5 = sb.toString();
                j3 = r4.A00 * 1000;
                if (j3 == 0) {
                    r11 = null;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str5);
                sb2.append(":");
                sb2.append(r13.A07());
                r11 = new C35001lD(sb2.toString(), j3, true);
            } else {
                j3 = 3600000;
                StringBuilder sb22 = new StringBuilder();
                sb22.append(str5);
                sb22.append(":");
                sb22.append(r13.A07());
                r11 = new C35001lD(sb22.toString(), j3, true);
            }
            Intent intent = new Intent();
            intent.setClassName(A002.getPackageName(), "com.obwhatsapp.wabloks.ui.WaBloksActivity");
            intent.putExtra("screen_name", str3);
            intent.putExtra("screen_params", (String) null);
            intent.putExtra("screen_cache_config", r11);
            intent.putExtra("chat_id", C16030sJ.A03(((Conversation) ((AnonymousClass1yP) A002)).A00.A2l.A08(C15830rv.class)));
            intent.putExtra("message_id", str4);
            intent.putExtra("action_name", "address_message");
            intent.putExtra("message_row_id", j4);
            activity2.startActivity(intent);
        }
    }
}
