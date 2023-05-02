package X;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.0hh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C10790hh implements Callable {
    public final /* synthetic */ C08080d0 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ ArrayList A02;

    public /* synthetic */ C10790hh(C08080d0 r1, String str, ArrayList arrayList) {
        this.A00 = r1;
        this.A02 = arrayList;
        this.A01 = str;
    }

    public final Object call() {
        C08080d0 r0 = this.A00;
        ArrayList arrayList = this.A02;
        String str = this.A01;
        WorkDatabase workDatabase = r0.A03;
        arrayList.addAll(workDatabase.A0K().AGU(str));
        return workDatabase.A0J().AH8(str);
    }
}
