package X;

import com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.obwhatsapp.mentions.MentionableEntry;

/* renamed from: X.4xD  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C101374xD implements AnonymousClass5PF {
    public final /* synthetic */ SharedTextPreviewDialogFragment A00;

    public /* synthetic */ C101374xD(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        this.A00 = sharedTextPreviewDialogFragment;
    }

    public final void AQN() {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = this.A00;
        int selectionStart = sharedTextPreviewDialogFragment.A0D.getSelectionStart();
        if (selectionStart == sharedTextPreviewDialogFragment.A0D.getSelectionEnd() && sharedTextPreviewDialogFragment.A0P) {
            MentionableEntry mentionableEntry = sharedTextPreviewDialogFragment.A0D;
            int offsetForPosition = mentionableEntry.getOffsetForPosition(mentionableEntry.getX() + ((float) sharedTextPreviewDialogFragment.A0D.getWidth()), (float) sharedTextPreviewDialogFragment.A07.getScrollY());
            int A09 = AnonymousClass000.A09(sharedTextPreviewDialogFragment.A0D.getLayout().getLineTop(0), sharedTextPreviewDialogFragment.A0D.getLayout().getLineBottom(0));
            MentionableEntry mentionableEntry2 = sharedTextPreviewDialogFragment.A0D;
            int offsetForPosition2 = mentionableEntry2.getOffsetForPosition(mentionableEntry2.getX() + ((float) sharedTextPreviewDialogFragment.A0D.getWidth()), (float) ((sharedTextPreviewDialogFragment.A07.getScrollY() + sharedTextPreviewDialogFragment.A07.getHeight()) - A09));
            if (selectionStart < offsetForPosition) {
                sharedTextPreviewDialogFragment.A0D.setSelection(offsetForPosition);
            } else if (selectionStart > offsetForPosition2) {
                sharedTextPreviewDialogFragment.A0D.setSelection(offsetForPosition2);
            }
        } else if (!sharedTextPreviewDialogFragment.A0P) {
            sharedTextPreviewDialogFragment.A0P = true;
        }
        sharedTextPreviewDialogFragment.A1O();
    }
}
