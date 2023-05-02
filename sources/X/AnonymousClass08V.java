package X;

import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

/* renamed from: X.08V  reason: invalid class name */
public class AnonymousClass08V {
    public int A00;
    public int A01;
    public TextDirectionHeuristic A02;
    public final TextPaint A03;

    public AnonymousClass08V(TextPaint textPaint) {
        TextDirectionHeuristic textDirectionHeuristic;
        this.A03 = textPaint;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            this.A00 = 1;
            this.A01 = 1;
        } else {
            this.A01 = 0;
            this.A00 = 0;
            if (i2 < 18) {
                textDirectionHeuristic = null;
                this.A02 = textDirectionHeuristic;
            }
        }
        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        this.A02 = textDirectionHeuristic;
    }

    public AnonymousClass08U A00() {
        return new AnonymousClass08U(this.A02, this.A03, this.A00, this.A01);
    }

    public void A01(int i2) {
        this.A00 = i2;
    }

    public void A02(int i2) {
        this.A01 = i2;
    }

    public void A03(TextDirectionHeuristic textDirectionHeuristic) {
        this.A02 = textDirectionHeuristic;
    }
}
