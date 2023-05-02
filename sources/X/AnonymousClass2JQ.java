package X;

import android.os.ConditionVariable;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2JQ  reason: invalid class name */
public class AnonymousClass2JQ implements C29541an {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C23251Bb A01;
    public final /* synthetic */ StringBuffer A02;

    public AnonymousClass2JQ(ConditionVariable conditionVariable, C23251Bb r2, StringBuffer stringBuffer) {
        this.A01 = r2;
        this.A02 = stringBuffer;
        this.A00 = conditionVariable;
    }

    public /* synthetic */ void AP3(String str) {
    }

    public void APP(long j2) {
    }

    public void AQb(String str) {
        StringBuilder sb = new StringBuilder("debug-builder/uploadLogsInternal Error received: ");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void AWH(String str, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            it.next();
        }
        List list = (List) map.get("X-Uploaded-File-Id");
        if (list != null && !list.isEmpty()) {
            this.A02.append((String) list.get(0));
        }
        this.A00.open();
    }
}
