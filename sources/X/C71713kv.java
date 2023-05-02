package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.3kv  reason: invalid class name and case insensitive filesystem */
public final class C71713kv extends C65023So {
    public final C19980zJ A00;
    public final C14870pt A01;
    public final TextEmojiLabel A02;
    public final AnonymousClass01V A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71713kv(View view, C19980zJ r3, C14870pt r4, AnonymousClass01V r5) {
        super(view);
        C18450wi.A0H(r4, 1);
        AnonymousClass3K2.A1I(r5, r3);
        this.A01 = r4;
        this.A03 = r5;
        this.A00 = r3;
        this.A02 = (TextEmojiLabel) C18450wi.A00(view, R.id.privacy_description);
    }
}
