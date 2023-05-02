package X;

import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.group.GroupAdminPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2r5  reason: invalid class name */
public class AnonymousClass2r5 extends AnonymousClass01X {
    public ArrayList A00;
    public List A01 = AnonymousClass000.A0u();
    public final /* synthetic */ GroupAdminPickerActivity A02;

    public AnonymousClass2r5(GroupAdminPickerActivity groupAdminPickerActivity) {
        this.A02 = groupAdminPickerActivity;
    }

    public int A0C() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r8, int i2) {
        C57662rY r82 = (C57662rY) r8;
        C16010sH r4 = (C16010sH) this.A01.get(i2);
        r82.A01.setVisibility(8);
        r82.A04.A0D(r4, this.A00);
        GroupAdminPickerActivity groupAdminPickerActivity = this.A02;
        groupAdminPickerActivity.A0B.A06(r82.A00, r4);
        if (!groupAdminPickerActivity.A0A.A0S(r4, -1) || r4.A0W == null) {
            r82.A02.setVisibility(8);
        } else {
            TextEmojiLabel textEmojiLabel = r82.A02;
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.A0I(this.A00, groupAdminPickerActivity.A0A.A0F(r4));
        }
        String str = r4.A0T;
        TextEmojiLabel textEmojiLabel2 = r82.A03;
        if (str != null) {
            textEmojiLabel2.setVisibility(0);
            textEmojiLabel2.A0I((List) null, r4.A0T);
        } else {
            textEmojiLabel2.setVisibility(8);
        }
        r82.A0H.setTag(C16010sH.A03(r4));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        GroupAdminPickerActivity groupAdminPickerActivity = this.A02;
        return new C57662rY(C13680ns.A0H(groupAdminPickerActivity.getLayoutInflater(), viewGroup, R.layout.layout02d1), groupAdminPickerActivity);
    }
}
