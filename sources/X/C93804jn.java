package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.obwhatsapp.mentions.MentionableEntry;

/* renamed from: X.4jn  reason: invalid class name and case insensitive filesystem */
public class C93804jn implements TextWatcher {
    public int A00;
    public boolean A01;
    public AnonymousClass3MN[] A02;
    public final /* synthetic */ MentionableEntry A03;

    public C93804jn(MentionableEntry mentionableEntry) {
        this.A03 = mentionableEntry;
    }

    public void afterTextChanged(Editable editable) {
        if (this.A00 > 0) {
            MentionableEntry mentionableEntry = this.A03;
            AnonymousClass3MN[] r7 = this.A02;
            int i2 = 0;
            if (!this.A01) {
                AnonymousClass3MN[] r3 = (AnonymousClass3MN[]) mentionableEntry.getEditableText().getSpans(mentionableEntry.getSelectionStart(), mentionableEntry.getSelectionEnd(), AnonymousClass3MN.class);
                mentionableEntry.A0C(mentionableEntry.A0C);
                mentionableEntry.A0C = null;
                int length = r3.length;
                while (i2 < length) {
                    AnonymousClass3MN r1 = r3[i2];
                    mentionableEntry.A0C(r1.A00);
                    mentionableEntry.A0C(r1);
                    i2++;
                }
            } else {
                int length2 = r7.length;
                while (i2 < length2) {
                    AnonymousClass3MN r32 = r7[i2];
                    int spanStart = editable.getSpanStart(r32.A00);
                    int spanEnd = editable.getSpanEnd(r32);
                    if (!(spanStart == -1 || spanEnd == -1)) {
                        mentionableEntry.A0C(r32.A00);
                        mentionableEntry.A0C(r32);
                        editable.delete(spanStart, spanEnd);
                    }
                    i2++;
                }
            }
        }
        this.A03.A09(editable);
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        MentionableEntry mentionableEntry = this.A03;
        int selectionEnd = mentionableEntry.getSelectionEnd();
        this.A02 = (AnonymousClass3MN[]) mentionableEntry.getEditableText().getSpans(selectionEnd, selectionEnd, AnonymousClass3MN.class);
        this.A01 = AnonymousClass000.A1R(mentionableEntry.getSelectionStart(), mentionableEntry.getSelectionEnd());
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.A00 = i3;
    }
}
