package X;

import android.app.ProgressDialog;
import android.util.SparseArray;
import com.obwhatsapp.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.22A  reason: invalid class name */
public class AnonymousClass22A {
    public final SparseArray A00;
    public final AnonymousClass4CE A01 = new AnonymousClass4CE(new AnonymousClass44o());
    public final AnonymousClass4HC A02;
    public final AnonymousClass1JV A03;
    public final AnonymousClass1MR A04;
    public final String A05;
    public final WeakReference A06;
    public final WeakReference A07;
    public final WeakReference A08;
    public final Map A09;

    public AnonymousClass22A(C000900k r3, AnonymousClass02C r4, AnonymousClass1JV r5, AnonymousClass1MR r6, String str, Map map, boolean z2) {
        this.A05 = str;
        this.A06 = new WeakReference(r3);
        this.A07 = new WeakReference(r4);
        this.A08 = new WeakReference(new ProgressDialog(r3));
        this.A09 = map;
        this.A04 = r6;
        this.A02 = new AnonymousClass4HC(this, z2);
        this.A03 = r5;
        this.A00 = new SparseArray();
    }

    public SparseArray A00() {
        C99284tm r1;
        SparseArray sparseArray = new SparseArray();
        HashMap hashMap = new HashMap();
        String str = this.A05;
        if (str != null) {
            AnonymousClass1JV r5 = this.A03;
            synchronized (r5) {
                String str2 = r5.A01;
                boolean z2 = false;
                if (str2 != null && !str2.equals(str)) {
                    z2 = true;
                }
                r1 = r5.A00;
                if (r1 == null || z2) {
                    r5.A01 = str;
                    r1 = new C99284tm(new AnonymousClass4TM());
                    r5.A00 = r1;
                }
            }
            hashMap.put("gs", r1);
        }
        hashMap.put("ls", new C99274tl());
        Map map = this.A09;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                hashMap.put(entry.getKey(), ((C17370uy) entry.getValue()).A9U());
            }
        }
        sparseArray.put(R.id.bk_context_key_data_modules, hashMap);
        sparseArray.put(R.id.bloks_host_activity, this.A06.get());
        sparseArray.put(R.id.bloks_host_progress_dialog, this.A08.get());
        sparseArray.put(R.id.bloks_host_fragment_manager, this.A07.get());
        sparseArray.put(R.id.bloks_data_module_namespace_manager, this.A04);
        return sparseArray;
    }

    public AnonymousClass4CE A01() {
        return this.A01;
    }
}
