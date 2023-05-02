package X;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import org.apache.commons.io.IOUtils;

/* renamed from: X.0bB  reason: invalid class name and case insensitive filesystem */
public final class C07350bB implements C12390kJ {
    public C06130Uj AVk(View view, C06130Uj r13) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", AnonymousClass000.A0g("onReceive: ", r13));
        }
        C13280ll r2 = r13.A00;
        if (r2.AGA() == 2) {
            return r13;
        }
        ClipData AAe = r2.AAe();
        int ACL = r2.ACL();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i2 = 0; i2 < AAe.getItemCount(); i2++) {
            ClipData.Item itemAt = AAe.getItemAt(i2);
            if ((ACL & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (!z2) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z2 = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), IOUtils.LINE_SEPARATOR_UNIX);
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                }
            }
        }
        return null;
    }
}
