package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.obwhatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.2qz  reason: invalid class name and case insensitive filesystem */
public final class C57362qz extends AnonymousClass01X {
    public final /* synthetic */ PhoneContactsSelector A00;

    public C57362qz(PhoneContactsSelector phoneContactsSelector) {
        this.A00 = phoneContactsSelector;
    }

    public int A0C() {
        return this.A00.A0b.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r6, int i2) {
        AnonymousClass3SH r62 = (AnonymousClass3SH) r6;
        PhoneContactsSelector phoneContactsSelector = this.A00;
        C55902kd r3 = (C55902kd) phoneContactsSelector.A0b.get(i2);
        String str = r3.A05;
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView = r62.A01;
        if (!isEmpty) {
            textView.setText(str);
        } else {
            textView.setText(r3.A06);
        }
        ThumbnailButton thumbnailButton = r62.A02;
        phoneContactsSelector.A0C.A05(thumbnailButton, R.drawable.avatar_contact);
        phoneContactsSelector.A0F.A01(thumbnailButton, r3);
        C13680ns.A1B(r62.A00, this, r3, 40);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new AnonymousClass3SH(C13680ns.A0H(this.A00.getLayoutInflater(), viewGroup, R.layout.layout053c));
    }
}
