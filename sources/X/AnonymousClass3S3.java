package X;

import android.view.View;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.3S3  reason: invalid class name */
public final class AnonymousClass3S3 extends C005602k {
    public final TextEmojiLabel A00;
    public final /* synthetic */ AnonymousClass2X7 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3S3(View view, C19980zJ r7, AnonymousClass2X7 r8, C17110uY r9) {
        super(view);
        this.A01 = r8;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3K4.A0L(view, R.id.disclaimer_text_view);
        this.A00 = textEmojiLabel;
        C30531cW.A02(textEmojiLabel);
        textEmojiLabel.setText(r9.A07(new RunnableRunnableShape3S0300000_I1(r7, textEmojiLabel, r8, 28), textEmojiLabel.getContext().getString(R.string.str0a3b), "", R.color.start));
    }
}
