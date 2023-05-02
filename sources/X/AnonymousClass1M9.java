package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.1M9  reason: invalid class name */
public final class AnonymousClass1M9 {
    public boolean A00;
    public final C15860rz A01;

    public AnonymousClass1M9(C15860rz r2) {
        C18450wi.A0H(r2, 1);
        this.A01 = r2;
    }

    public final void A00() {
        boolean z2 = ((SharedPreferences) this.A01.A01.get()).getBoolean("sticker_contextual_suggestion_eligibility", false);
        this.A00 = z2;
        String format = String.format("StickerContextualSuggestionGatingUtils/initializeIsContextualSuggestionEnabled contextualSuggestionEnabled: %s", Arrays.copyOf(new Object[]{Boolean.valueOf(z2)}, 1));
        C18450wi.A0B(format);
        Log.i(format);
    }
}
