package X;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callhistory.group.GroupCallLogActivity;

/* renamed from: X.3SV  reason: invalid class name */
public class AnonymousClass3SV extends C005602k {
    public ImageButton A00;
    public ImageButton A01;
    public ImageView A02;
    public TextView A03;
    public C30521cU A04;
    public final /* synthetic */ GroupCallLogActivity A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3SV(View view, GroupCallLogActivity groupCallLogActivity) {
        super(view);
        this.A05 = groupCallLogActivity;
        this.A02 = C13680ns.A0K(view, R.id.contact_photo);
        this.A04 = new C30521cU(view, groupCallLogActivity.A08, groupCallLogActivity.A01, groupCallLogActivity.A0D, (int) R.id.contact_name);
        this.A01 = (ImageButton) view.findViewById(R.id.call_btn);
        this.A00 = (ImageButton) view.findViewById(R.id.video_call_btn);
        this.A03 = C13680ns.A0M(view, R.id.participant_call_log_result);
    }
}
