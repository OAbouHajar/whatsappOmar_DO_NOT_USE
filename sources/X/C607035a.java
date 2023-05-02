package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.35a  reason: invalid class name and case insensitive filesystem */
public class C607035a extends C34331k5 {
    public final /* synthetic */ ContactPickerFragment A00;

    public C607035a(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    public void A06(View view) {
        AnonymousClass01D r0;
        ContactPickerFragment contactPickerFragment = this.A00;
        if (!contactPickerFragment.A0D().getIntent().hasExtra("sch")) {
            if (contactPickerFragment.A1t() && contactPickerFragment.A1u.A00() && (contactPickerFragment.A2i || contactPickerFragment.A2o)) {
                int i2 = 3;
                if (contactPickerFragment.A2o) {
                    i2 = 10;
                }
                Integer valueOf = Integer.valueOf(i2);
                contactPickerFragment.A1v.A0B((Byte) null, valueOf, AnonymousClass1L1.A02(valueOf.intValue()));
            }
            if (contactPickerFragment.A1t() && contactPickerFragment.A1U.A03 && (r0 = contactPickerFragment.A27) != null) {
                r0.get();
            }
            Context A02 = contactPickerFragment.A02();
            C15860rz r4 = contactPickerFragment.A1G;
            AnonymousClass38N r02 = contactPickerFragment.A11;
            if (r02 != null && AnonymousClass000.A1X(r02.A0B.A01()) && !C13680ns.A0B(r4).getBoolean("forward_with_captions_nux_shown", false)) {
                C32241fu A002 = C32241fu.A00(A02);
                A002.A01(R.string.str0913);
                C13680ns.A1H(A002, r4, 40, R.string.str0e87);
                A002.A00();
                Log.i("contactpicker/forward with captions nux shown");
                return;
            } else if (contactPickerFragment.A2q) {
                contactPickerFragment.A1e((C16010sH) null);
                return;
            } else if (!contactPickerFragment.A2i && !contactPickerFragment.A2o) {
                return;
            }
        }
        Intent A09 = C13680ns.A09();
        Map map = contactPickerFragment.A2w;
        A09.putStringArrayListExtra("jids", C16030sJ.A06(map.keySet()));
        A09.putExtra("file_path", contactPickerFragment.A1C().getString("file_path"));
        A09.putExtra("all_contacts_count", contactPickerFragment.A2M.size());
        if (contactPickerFragment.A2i) {
            contactPickerFragment.A20.A00(false, map.size());
        }
        C28381Vw A03 = AnonymousClass1yL.A03(contactPickerFragment.A1C(), "");
        if (A03 != null) {
            AnonymousClass1yL.A00(A09, A03);
        }
        AnonymousClass38N r03 = contactPickerFragment.A11;
        if (r03 != null) {
            A09.putExtra("include_captions", AnonymousClass000.A1X(r03.A0B.A01()));
        }
        contactPickerFragment.A1t.A01(A09, contactPickerFragment.A1U);
        contactPickerFragment.A0x.A01(A09);
        contactPickerFragment.A0x.A00();
    }
}
