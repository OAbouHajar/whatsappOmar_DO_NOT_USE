package X;

import com.facebook.profilo.core.TriggerRegistry;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.1gx  reason: invalid class name and case insensitive filesystem */
public class C32681gx {
    public static final int A02 = TriggerRegistry.A00.A02("OBWhatsApp");
    public final ArrayList A00;
    public final boolean A01;

    public C32681gx() {
        boolean z2 = false;
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{"stack_trace", "qpl", "system_counters", "high_freq_main_thread_counters"}));
        this.A00 = arrayList;
        if (!"x86_64".equals(AnonymousClass1U8.A02())) {
            arrayList.add("atrace");
        }
        z2 = Math.random() < 0.5d ? true : z2;
        this.A01 = z2;
        if (z2) {
            arrayList.add("wall_time_stack_trace");
        }
    }
}
