package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.calling.controls.viewmodel.ParticipantsListViewModel;

/* renamed from: X.26g  reason: invalid class name and case insensitive filesystem */
public class C449226g extends AnonymousClass26H {
    public final TextEmojiLabel A00;
    public final WaTextView A01;
    public final C16000sG A02;
    public final C16080sP A03;
    public final C17240ul A04;
    public final C216014s A05;

    public C449226g(View view, ParticipantsListViewModel participantsListViewModel, C16000sG r4, C16080sP r5, C17240ul r6, C216014s r7) {
        super(view, participantsListViewModel);
        this.A00 = (TextEmojiLabel) C004601z.A0E(view, R.id.group_name);
        this.A01 = (WaTextView) C004601z.A0E(view, R.id.participant_count);
        this.A05 = r7;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
    }
}
