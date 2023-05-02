package X;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.obwhatsapp.mentions.MentionableEntry;

/* renamed from: X.2ui  reason: invalid class name and case insensitive filesystem */
public class C59122ui extends C30551cZ {
    public final /* synthetic */ SharedTextPreviewDialogFragment A00;

    public C59122ui(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        this.A00 = sharedTextPreviewDialogFragment;
    }

    public void onAnimationEnd(Animation animation) {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = this.A00;
        sharedTextPreviewDialogFragment.A1N();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) sharedTextPreviewDialogFragment.A02.getHeight(), 0.0f);
        translateAnimation.setDuration(150);
        sharedTextPreviewDialogFragment.A02.setVisibility(0);
        sharedTextPreviewDialogFragment.A01.setVisibility(0);
        int selectionStart = sharedTextPreviewDialogFragment.A0D.getSelectionStart();
        int selectionEnd = sharedTextPreviewDialogFragment.A0D.getSelectionEnd();
        MentionableEntry mentionableEntry = sharedTextPreviewDialogFragment.A0D;
        mentionableEntry.setText(mentionableEntry.getStringText());
        sharedTextPreviewDialogFragment.A0D.setSelection(selectionStart, selectionEnd);
        sharedTextPreviewDialogFragment.A0P = false;
        sharedTextPreviewDialogFragment.A0F.startAnimation(translateAnimation);
    }
}
