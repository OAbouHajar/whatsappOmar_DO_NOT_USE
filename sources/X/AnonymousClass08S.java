package X;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: X.08S  reason: invalid class name */
public final class AnonymousClass08S {
    public TextClassifier A00;
    public TextView A01;

    public AnonymousClass08S(TextView textView) {
        this.A01 = textView;
    }

    public TextClassifier A00() {
        TextClassifier textClassifier = this.A00;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.A01.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public void A01(TextClassifier textClassifier) {
        this.A00 = textClassifier;
    }
}
