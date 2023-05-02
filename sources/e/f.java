package e;

import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import com.obwhatsapp.youbasha.ui.activity.FMNewsActivity;
import com.squareup.picasso.Transformation;

/* compiled from: XFMFile */
public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1634a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1635b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1636c;

    public f(Transformation transformation, RuntimeException runtimeException) {
        this.f1634a = 0;
        this.f1635b = transformation;
        this.f1636c = runtimeException;
    }

    public /* synthetic */ f(Object obj, Object obj2, int i2) {
        this.f1634a = i2;
        this.f1636c = obj;
        this.f1635b = obj2;
    }

    public final void run() {
        int i2 = this.f1634a;
        Object obj = this.f1636c;
        Object obj2 = this.f1635b;
        switch (i2) {
            case 0:
                throw new RuntimeException("Transformation " + ((Transformation) obj2).key() + " crashed with exception.", (RuntimeException) obj);
            case 1:
                throw new AssertionError("Unknown handler message received: " + ((Message) obj2).what);
            case 2:
                throw new RuntimeException((Exception) obj2);
            case 3:
                throw new AssertionError("Unhandled stats message." + ((Message) obj2).what);
            default:
                FMNewsActivity fMNewsActivity = (FMNewsActivity) obj;
                ProgressBar progressBar = fMNewsActivity.f1247d;
                progressBar.setProgress(progressBar.getProgress() + 10);
                if (fMNewsActivity.f1247d.getProgress() >= fMNewsActivity.f1247d.getMax()) {
                    fMNewsActivity.finish();
                    return;
                } else {
                    ((Handler) obj2).postDelayed(this, 10);
                    return;
                }
        }
    }
}
