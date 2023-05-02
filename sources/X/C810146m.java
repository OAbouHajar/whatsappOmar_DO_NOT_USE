package X;

import android.app.Activity;
import android.content.res.Resources;
import com.obwhatsapp.R;
import java.util.Collection;

/* renamed from: X.46m  reason: invalid class name and case insensitive filesystem */
public class C810146m {
    public static /* synthetic */ void A00(Activity activity, C14870pt r7, C16760tb r8, Collection collection) {
        r8.A0V(collection, false, false);
        if (collection.size() == 1) {
            r7.A0A(R.string.str0d34, 0);
            return;
        }
        Resources resources = activity.getResources();
        int size = collection.size();
        Object[] objArr = new Object[1];
        AnonymousClass000.A1M(objArr, collection.size(), 0);
        r7.A0I(resources.getQuantityString(R.plurals.plurals00d1, size, objArr), 0);
    }
}
