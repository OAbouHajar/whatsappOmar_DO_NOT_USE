package X;

import android.os.Bundle;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.obwhatsapp.mentions.MentionableEntry;
import com.whatsapp.util.Log;

/* renamed from: X.4lv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C95064lv implements InputConnectionCompat.OnCommitContentListener {
    public final /* synthetic */ MentionableEntry A00;

    public /* synthetic */ C95064lv(MentionableEntry mentionableEntry) {
        this.A00 = mentionableEntry;
    }

    public final boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i2, Bundle bundle) {
        C108865Pu r0 = this.A00.A0D;
        if (r0 != null) {
            return r0.onCommitContent(inputContentInfoCompat, i2, bundle);
        }
        Log.e("mentionable/entry/no on commit content listener");
        return false;
    }
}
