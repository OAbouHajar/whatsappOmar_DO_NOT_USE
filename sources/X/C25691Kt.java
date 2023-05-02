package X;

import android.content.ContentValues;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import com.mod2.fblibs.FacebookFacade;
import java.util.ArrayList;

/* renamed from: X.1Kt  reason: invalid class name and case insensitive filesystem */
public final class C25691Kt {
    public final C16040sK A00;
    public final C15810rt A01;
    public final C14710pd A02;

    public C25691Kt(C16040sK r1, C15810rt r2, C14710pd r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public Intent A00(C16010sH r5, C15830rv r6, boolean z2) {
        String A09;
        boolean z3;
        String A04 = C24561Gk.A04(r6);
        if (r5 == null || !r5.A0H()) {
            A09 = (!this.A02.A0E(C16620tM.A02, 945) || r5 == null) ? this.A01.A09(r6) : r5.A0W;
            z3 = false;
        } else {
            A09 = r5.A0B();
            z3 = true;
        }
        return A01(A04, A09, z2, z3);
    }

    public final Intent A01(String str, String str2, boolean z2, boolean z3) {
        Intent intent;
        AnonymousClass00B.A0G(!this.A00.A0G());
        if (z2) {
            intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        } else {
            intent = new Intent("android.intent.action.INSERT_OR_EDIT");
            intent.setType("vnd.android.cursor.item/contact");
        }
        if (!TextUtils.isEmpty(str2)) {
            if (z3) {
                ArrayList arrayList = new ArrayList();
                ContentValues contentValues = new ContentValues();
                contentValues.put("mimetype", "vnd.android.cursor.item/name");
                contentValues.put("data2", str2);
                arrayList.add(contentValues);
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("mimetype", "vnd.android.cursor.item/organization");
                contentValues2.put("data1", str2);
                arrayList.add(contentValues2);
                intent.putParcelableArrayListExtra("data", arrayList);
            } else {
                intent.putExtra(FacebookFacade.RequestParameter.NAME, str2);
            }
        }
        intent.putExtra("phone", str);
        intent.putExtra("phone_type", 2);
        intent.setFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        return intent;
    }
}
