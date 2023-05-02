package X;

import android.content.Intent;
import android.os.SystemClock;
import com.obwhatsapp.contact.picker.PhoneContactsSelector;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.371  reason: invalid class name */
public class AnonymousClass371 extends C16690tT {
    public final AnonymousClass1G1 A00;
    public final C17150uc A01;
    public final C16000sG A02;
    public final C16980tz A03;
    public final AnonymousClass013 A04;
    public final C15830rv A05;
    public final WeakReference A06;
    public final List A07;

    public AnonymousClass371(AnonymousClass1G1 r2, C17150uc r3, C16000sG r4, PhoneContactsSelector phoneContactsSelector, C16980tz r6, AnonymousClass013 r7, C15830rv r8, List list) {
        this.A03 = r6;
        this.A02 = r4;
        this.A04 = r7;
        this.A00 = r2;
        this.A01 = r3;
        this.A06 = C13690nt.A0h(phoneContactsSelector);
        this.A05 = r8;
        this.A07 = list;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0u = AnonymousClass000.A0u();
        StringBuilder A0r = AnonymousClass000.A0r("phonecontactsselector/onsubmit/convertcontactstask ");
        List<C55902kd> list = this.A07;
        C13700nu.A0b(A0r, list);
        C28921Zf r3 = new C28921Zf(AnonymousClass000.A0h(" selected contacts", A0r));
        for (C55902kd r9 : list) {
            String str = r9.A02;
            if (str == null) {
                long j2 = r9.A04;
                SystemClock.uptimeMillis();
                C16980tz r10 = this.A03;
                str = PhoneContactsSelector.A02(this.A00, this.A01, this.A02, r9, r10, this.A04);
                r9.A02 = str;
                SystemClock.uptimeMillis();
                if (str == null) {
                    Log.w(C13680ns.A0j(AnonymousClass000.A0r("phonecontactsselector/onsubmit/convertcontactstask/could not generate vcard for contact with id "), j2));
                }
            }
            A0u.add(str);
        }
        r3.A01();
        return A0u;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        C14550pN r3 = (C14550pN) this.A06.get();
        if (r3 != null) {
            Intent intent = r3.getIntent();
            r3.Ag3(C14750ph.A0F(r3, C38621r6.A08(C38621r6.A0E(intent.getBundleExtra("quoted_message"))), this.A05, C16050sL.A05(intent.getStringExtra("quoted_group_jid")), arrayList, intent.getBooleanExtra("has_number_from_url", false)), 8);
            r3.Ac1();
        }
    }
}
