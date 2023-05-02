package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.group.GroupAdminPickerActivity;

/* renamed from: X.2rY  reason: invalid class name and case insensitive filesystem */
public class C57662rY extends C005602k {
    public final ImageView A00;
    public final TextView A01;
    public final TextEmojiLabel A02;
    public final TextEmojiLabel A03;
    public final C30521cU A04;
    public final /* synthetic */ GroupAdminPickerActivity A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57662rY(View view, GroupAdminPickerActivity groupAdminPickerActivity) {
        super(view);
        this.A05 = groupAdminPickerActivity;
        C30521cU r3 = new C30521cU(view, groupAdminPickerActivity.A0A, groupAdminPickerActivity.A0D, groupAdminPickerActivity.A0M, (int) R.id.name);
        this.A04 = r3;
        TextEmojiLabel A0R = C13680ns.A0R(view, R.id.status);
        this.A03 = A0R;
        ImageView A0K = C13680ns.A0K(view, R.id.avatar);
        this.A00 = A0K;
        this.A01 = C13680ns.A0M(view, R.id.owner);
        this.A02 = C13680ns.A0R(view, R.id.secondary_name_view);
        C004601z.A0d(A0K, 2);
        C30521cU.A00(view.getContext(), r3, R.color.color0507);
        C13680ns.A0v(view.getContext(), A0R, R.color.color0505);
        view.setBackgroundResource(R.drawable.selector_orange_gradient);
        view.setOnClickListener(groupAdminPickerActivity.A0T);
    }
}
