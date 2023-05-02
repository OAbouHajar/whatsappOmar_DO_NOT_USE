package X;

import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import java.lang.ref.WeakReference;

/* renamed from: X.3yk  reason: invalid class name and case insensitive filesystem */
public class C78823yk extends C16690tT {
    public final C16080sP A00;
    public final C16010sH A01;
    public final WeakReference A02;

    public C78823yk(TextEmojiLabel textEmojiLabel, C16080sP r3, C16010sH r4) {
        this.A02 = C13690nt.A0h(textEmojiLabel);
        this.A01 = r4;
        this.A00 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C16080sP r3 = this.A00;
        Jid A08 = this.A01.A08(C16060sN.class);
        AnonymousClass00B.A06(A08);
        return r3.A0K((C16060sN) A08, -1, true);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        String str = (String) obj;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) this.A02.get();
        if (textEmojiLabel != null && textEmojiLabel.getTag().equals(this.A01.A07())) {
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.A0G(str);
        }
    }
}
