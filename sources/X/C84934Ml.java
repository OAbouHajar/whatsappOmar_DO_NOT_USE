package X;

import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.4Ml  reason: invalid class name and case insensitive filesystem */
public class C84934Ml {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final AnonymousClass013 A03;

    public C84934Ml(View view, AnonymousClass013 r4) {
        this.A03 = r4;
        C13680ns.A0J(view, R.id.voice_cancel_animation).setImageResource(R.drawable.recording_mic_red);
        C13680ns.A0J(view, R.id.voice_cancel_trashcan_lid).setImageResource(R.drawable.rec_bucket_lid);
        C13680ns.A0J(view, R.id.voice_cancel_trashcan_body).setImageResource(R.drawable.rec_bucket_body);
        this.A00 = C13680ns.A0L(view, R.id.voice_note_info);
        this.A01 = C13680ns.A0L(view, R.id.voice_note_info_v2);
        this.A02 = C13680ns.A0L(view, R.id.voice_note_tip);
    }
}
