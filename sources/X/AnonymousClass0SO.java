package X;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.0SO  reason: invalid class name */
public final class AnonymousClass0SO {
    public static boolean A00(Activity activity, DragEvent dragEvent, View view) {
        activity.requestDragAndDropPermissions(dragEvent);
        C004601z.A0G(view, new AnonymousClass0NR(dragEvent.getClipData(), 3).A00.A5h());
        return true;
    }

    /* JADX INFO: finally extract failed */
    public static boolean A01(Activity activity, DragEvent dragEvent, TextView textView) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            C004601z.A0G(textView, new AnonymousClass0NR(dragEvent.getClipData(), 3).A00.A5h());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }
}
