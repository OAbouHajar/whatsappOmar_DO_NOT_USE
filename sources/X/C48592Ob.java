package X;

import android.text.TextUtils;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape7S0200000_I0_5;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;

/* renamed from: X.2Ob  reason: invalid class name and case insensitive filesystem */
public class C48592Ob extends C41651wK {
    public Runnable A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ EmojiSearchContainer A02;

    public C48592Ob(View view, EmojiSearchContainer emojiSearchContainer) {
        this.A02 = emojiSearchContainer;
        this.A01 = view;
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A02.A04.removeCallbacks(runnable);
        }
        RunnableRunnableShape7S0200000_I0_5 runnableRunnableShape7S0200000_I0_5 = new RunnableRunnableShape7S0200000_I0_5(this, 20, charSequence);
        this.A00 = runnableRunnableShape7S0200000_I0_5;
        this.A02.A04.postDelayed(runnableRunnableShape7S0200000_I0_5, 500);
        View view = this.A01;
        int i5 = 0;
        if (TextUtils.isEmpty(charSequence)) {
            i5 = 4;
        }
        view.setVisibility(i5);
    }
}
