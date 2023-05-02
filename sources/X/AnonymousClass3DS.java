package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3DS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DS implements AnonymousClass025 {
    public final /* synthetic */ C64403Pa A00;

    public /* synthetic */ AnonymousClass3DS(C64403Pa r1) {
        this.A00 = r1;
    }

    public final Object apply(Object obj) {
        String str;
        String str2;
        C64403Pa r4 = this.A00;
        AnonymousClass1XY r15 = (AnonymousClass1XY) obj;
        Collection collection = (Collection) r15.A01;
        AnonymousClass024 r5 = r15.A00;
        try {
            r5.A02();
            ArrayList A0u = AnonymousClass000.A0u();
            C16980tz r6 = r4.A06;
            C16000sG r1 = r4.A05;
            AnonymousClass013 r2 = r4.A07;
            C39681st r0 = new C39681st(r1, r6, r2);
            ArrayList A0u2 = AnonymousClass000.A0u();
            Iterator A0y = AnonymousClass000.A0y(r0.A00.A0I(new HashSet(collection)));
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                if (!(A0z.getKey() instanceof UserJid)) {
                    str2 = "ContactStruct/constructContactsFromUserJid chat JID not an instance of user JID";
                } else if (A0z.getValue() == null) {
                    str2 = "ContactStruct/constructContactsFromUserJid null WaContact";
                } else {
                    UserJid userJid = (UserJid) A0z.getKey();
                    C39701sv r8 = new C39701sv();
                    r8.A08.A01 = ((C16010sH) A0z.getValue()).A09();
                    r8.A03(userJid, C24561Gk.A04(userJid), (String) null, 2, true);
                    A0u2.add(r8);
                }
                Log.w(str2);
            }
            Iterator it = A0u2.iterator();
            while (it.hasNext()) {
                C39701sv r62 = (C39701sv) it.next();
                r5.A02();
                try {
                    str = new AnonymousClass25O(r4.A04, r2).A00(r62);
                } catch (AnonymousClass25G e2) {
                    Log.e("ContactsAttachmentSelectorViewModel/ Could not create VCard", new AnonymousClass25H(e2));
                    str = null;
                }
                if (str != null) {
                    A0u.add(str);
                }
            }
            return A0u;
        } catch (AnonymousClass057 unused) {
            return AnonymousClass000.A0u();
        }
    }
}
