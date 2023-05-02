package X;

import android.app.Activity;
import com.obwhatsapp.Conversation;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.1Qq  reason: invalid class name and case insensitive filesystem */
public abstract class C27151Qq extends C27161Qr {
    public final C20190ze A00;

    public C27151Qq(C20190ze r1) {
        this.A00 = r1;
    }

    public void A05(Activity activity, C35071lK r9, String str, String str2, long j2) {
        String A09;
        String str3 = r9.A01;
        if (str3 != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            AnonymousClass1yP A01 = AnonymousClass22O.A01(activity);
            if (A01 != null) {
                Conversation conversation = (Conversation) A01;
                C16010sH r0 = conversation.A00.A2l;
                if (r0 != null) {
                    String A0B = r0.A0B();
                    C16010sH r02 = conversation.A00.A2l;
                    if (A0B != null) {
                        A09 = r02.A0B();
                    } else if (r02.A09() != null) {
                        A09 = conversation.A00.A2l.A09();
                    }
                    hashMap2.put("business_name", A09);
                }
            }
            hashMap.put("business_info", hashMap2);
            ArrayList arrayList = new ArrayList();
            arrayList.add("address_message_validate");
            arrayList.add("configure_top_bar");
            arrayList.add("extension_message_response");
            arrayList.add("fetch_catalog");
            arrayList.add("show_error");
            arrayList.add("data_exchange");
            hashMap.put("supported_actions", arrayList);
            hashMap.put(A00(), C438921y.A01(str3));
            HashMap hashMap3 = new HashMap();
            hashMap3.put("commerce", hashMap);
            this.A00.Aax(AnonymousClass225.DATA, hashMap3);
        }
    }
}
