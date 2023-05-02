package X;

import android.os.ConditionVariable;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.2Hx  reason: invalid class name and case insensitive filesystem */
public class C47182Hx extends C16690tT {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ ConditionVariable A01;
    public final /* synthetic */ C19010xc A02;
    public final /* synthetic */ AnonymousClass12R A03;

    public C47182Hx(ConditionVariable conditionVariable, ConditionVariable conditionVariable2, C19010xc r3, AnonymousClass12R r4) {
        this.A02 = r3;
        this.A01 = conditionVariable;
        this.A00 = conditionVariable2;
        this.A03 = r4;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str;
        C19010xc r5 = this.A02;
        if (!r5.A06.A0A()) {
            return null;
        }
        Log.i("deleteacctconfirm/delete-account-cleanup waiting for googleDriveService object to be received.");
        long currentTimeMillis = System.currentTimeMillis();
        if (this.A01.block(60000)) {
            long currentTimeMillis2 = 60000 - (System.currentTimeMillis() - currentTimeMillis);
            Log.i("deleteacctconfirm/delete-account-cleanup waiting for Google Drive cleanup to finish.");
            if (currentTimeMillis2 <= 0 || !this.A00.block(currentTimeMillis2)) {
                str = "deleteacctconfirm/delete-account-cleanup Google Drive account deletion timed out.";
            } else {
                Log.i("deleteacctconfirm/delete-account-cleanup Google Drive deletion is finished.");
                r5.A08.A03(this.A03);
                return null;
            }
        } else {
            str = "deleteacctconfirm/delete-account-cleanup unable to get Google Drive service object.";
        }
        Log.e(str);
        try {
            r5.A08.A03(this.A03);
            return null;
        } catch (IllegalStateException e2) {
            Log.e("deleteacctconfirm/delete-account-cleanup", e2);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C19010xc r3 = this.A02;
        r3.A01.A09(R.string.str066c, 1);
        Iterator it = r3.A0x.iterator();
        while (it.hasNext()) {
            ((C19480yV) it.next()).ASz();
        }
        Log.i("deleteacctconfirm/deletion-complete");
    }
}
