package X;

import android.os.Bundle;
import com.obwhatsapp.backup.google.PromptDialogFragment;

/* renamed from: X.2kX  reason: invalid class name and case insensitive filesystem */
public class C55862kX {
    public final Bundle A00;

    public C55862kX(int i2) {
        Bundle bundle = new Bundle();
        this.A00 = bundle;
        bundle.putInt("dialog_id", i2);
    }

    public PromptDialogFragment A00() {
        PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
        promptDialogFragment.A0T(this.A00);
        return promptDialogFragment;
    }

    public void A01() {
        this.A00.putBoolean("is_message_clickable", true);
    }

    public void A02(CharSequence charSequence) {
        this.A00.putCharSequence("message", charSequence);
    }

    public void A03(String str) {
        this.A00.putString("negative_button", str);
    }

    public void A04(String str) {
        this.A00.putString("neutral_button", str);
    }

    public void A05(String str) {
        this.A00.putString("positive_button", str);
    }

    public void A06(String str) {
        this.A00.putString("title", str);
    }

    public void A07(boolean z2) {
        this.A00.putBoolean("cancelable", z2);
    }
}
