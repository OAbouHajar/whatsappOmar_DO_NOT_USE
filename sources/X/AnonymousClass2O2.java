package X;

import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.SelectionCheckView;

/* renamed from: X.2O2  reason: invalid class name */
public class AnonymousClass2O2 extends C005602k {
    public final ImageView A00;
    public final C000900k A01;
    public final C16300so A02;
    public final TextEmojiLabel A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final C17230uk A06;
    public final AnonymousClass1L3 A07;
    public final SelectionCheckView A08;
    public final C16000sG A09;
    public final AnonymousClass2Ao A0A;
    public final C15860rz A0B;
    public final AnonymousClass2AH A0C;
    public final C16320sq A0D;

    public AnonymousClass2O2(View view, C000900k r5, C16300so r6, C17230uk r7, AnonymousClass1L3 r8, C16000sG r9, AnonymousClass2Ao r10, C15860rz r11, AnonymousClass2AH r12, C16320sq r13) {
        super(view);
        this.A01 = r5;
        this.A02 = r6;
        this.A0D = r13;
        this.A09 = r9;
        this.A0C = r12;
        this.A0A = r10;
        this.A07 = r8;
        this.A0B = r11;
        this.A06 = r7;
        View view2 = this.A0H;
        this.A00 = (ImageView) C004601z.A0E(view2, R.id.community_icon);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C004601z.A0E(view2, R.id.community_subject);
        this.A03 = textEmojiLabel;
        this.A04 = (WaTextView) C004601z.A0E(view2, R.id.community_new);
        this.A05 = (WaTextView) C004601z.A0E(view2, R.id.community_suspended_subtitle);
        this.A08 = (SelectionCheckView) C004601z.A0E(view, R.id.community_selection_check);
        AnonymousClass1UP.A06(textEmojiLabel);
    }
}
