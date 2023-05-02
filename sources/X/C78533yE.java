package X;

import android.text.Editable;
import com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment;

/* renamed from: X.3yE  reason: invalid class name and case insensitive filesystem */
public class C78533yE extends C41651wK {
    public boolean A00;
    public final /* synthetic */ SharedTextPreviewDialogFragment A01;

    public C78533yE(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        this.A01 = sharedTextPreviewDialogFragment;
    }

    public void afterTextChanged(Editable editable) {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = this.A01;
        C001000l A0C = sharedTextPreviewDialogFragment.A0C();
        C17250um r6 = sharedTextPreviewDialogFragment.A0B;
        C45922Bq.A06(A0C, sharedTextPreviewDialogFragment.A0D.getPaint(), editable, sharedTextPreviewDialogFragment.A0C, r6, sharedTextPreviewDialogFragment.A0E);
        sharedTextPreviewDialogFragment.A1Q(editable, this.A00);
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        int codePointCount;
        boolean z2 = false;
        if (i4 > i3 && ((codePointCount = Character.codePointCount(charSequence, i2, i4 + i2)) > 1 || (codePointCount == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i2))))) {
            z2 = true;
        }
        this.A00 = z2;
    }
}
