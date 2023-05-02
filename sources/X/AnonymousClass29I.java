package X;

import android.app.Activity;
import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;
import com.obwhatsapp.gifsearch.GifSearchContainer;

/* renamed from: X.29I  reason: invalid class name */
public class AnonymousClass29I {
    public C26181Mq A00;
    public final AnonymousClass2JH A01;
    public final EmojiSearchContainer A02;

    public AnonymousClass29I(Activity activity, AnonymousClass013 r11, AnonymousClass2JH r12, C206711d r13, C17250um r14, EmojiSearchContainer emojiSearchContainer, C17020u3 r16) {
        this.A02 = emojiSearchContainer;
        emojiSearchContainer.setVisibility(8);
        AnonymousClass2JH r3 = r12;
        this.A01 = r12;
        Activity activity2 = activity;
        AnonymousClass013 r2 = r11;
        C206711d r4 = r13;
        C17250um r5 = r14;
        r12.A0B = new C614338w(activity2, r2, r3, r4, r5, emojiSearchContainer, this, r16);
    }

    public void A00(boolean z2) {
        if (this instanceof C47562Jm) {
            C47562Jm r2 = (C47562Jm) this;
            GifSearchContainer gifSearchContainer = r2.A02;
            if (gifSearchContainer.getVisibility() == 0) {
                gifSearchContainer.setVisibility(8);
                C25861Lk r1 = gifSearchContainer.A0F;
                if (r1 != null) {
                    C810446p.A00(gifSearchContainer.A0B, r1);
                }
                gifSearchContainer.A0F = null;
            } else {
                EmojiSearchContainer emojiSearchContainer = r2.A02;
                if (emojiSearchContainer.getVisibility() == 0) {
                    emojiSearchContainer.setVisibility(8);
                    emojiSearchContainer.A04.A03();
                    emojiSearchContainer.A09 = null;
                }
            }
            r2.A01.A0C = null;
            if (z2) {
                C810446p.A00(r2.A01, r2.A03);
                return;
            }
            return;
        }
        EmojiSearchContainer emojiSearchContainer2 = this.A02;
        if (emojiSearchContainer2.getVisibility() == 0) {
            emojiSearchContainer2.setVisibility(8);
            emojiSearchContainer2.A04.A03();
            emojiSearchContainer2.A09 = null;
        }
        this.A01.A0C = null;
    }

    public boolean A01() {
        EmojiSearchContainer emojiSearchContainer;
        if (this instanceof C47562Jm) {
            C47562Jm r1 = (C47562Jm) this;
            if (r1.A02.getVisibility() != 0) {
                emojiSearchContainer = r1.A02;
            }
        }
        emojiSearchContainer = this.A02;
        return emojiSearchContainer.getVisibility() == 0;
    }

    public boolean A02() {
        if (!A01()) {
            return false;
        }
        A00(true);
        this.A02.post(new RunnableRunnableShape9S0100000_I0_8(this, 3));
        return true;
    }
}
