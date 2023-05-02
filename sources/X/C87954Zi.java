package X;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.4Zi  reason: invalid class name and case insensitive filesystem */
public final class C87954Zi {
    public static final Status A02 = new Status(8, "The connection to Google Play services was lost");
    public final AnonymousClass4C1 A00 = new AnonymousClass4C1(this);
    public final Set A01 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
}
