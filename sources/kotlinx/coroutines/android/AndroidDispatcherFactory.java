package kotlinx.coroutines.android;

import X.AnonymousClass000;
import X.AnonymousClass5GI;
import X.C06420Vs;
import X.C107055Gf;
import android.os.Looper;
import java.util.List;

public final class AndroidDispatcherFactory {
    public AnonymousClass5GI createDispatcher(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C107055Gf(C06420Vs.A00(mainLooper), false);
        }
        throw AnonymousClass000.A0V("The main looper is not available");
    }

    public int getLoadPriority() {
        return 1073741823;
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
