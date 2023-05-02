package X;

import android.content.ContentResolver;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.36i  reason: invalid class name and case insensitive filesystem */
public final class C608436i extends C16690tT {
    public final AnonymousClass1A9 A00;
    public final WeakReference A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C608436i(C001300o r2, C49322Sk r3, AnonymousClass1A9 r4) {
        super(r2, true);
        C18450wi.A0H(r4, 3);
        this.A00 = r4;
        this.A01 = C13690nt.A0h(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String type;
        Uri[] uriArr = (Uri[]) objArr;
        C18450wi.A0H(uriArr, 0);
        if (uriArr.length != 1) {
            Log.e("LoadMediaFileAsyncTask/doInBackground expected exactly 1 uri");
            return new C25401Jq((Object) null, (Object) null);
        }
        try {
            Uri uri = uriArr[0];
            if (uri == null) {
                return new C25401Jq((Object) null, (Object) null);
            }
            AnonymousClass1A9 r0 = this.A00;
            File A0Z = r0.A0Z(uri);
            C18450wi.A0B(A0Z);
            ContentResolver A0C = r0.A03.A0C();
            if (A0C == null) {
                Log.w("media-file-utils/get-media-mime cr=null");
            } else {
                type = A0C.getType(uri);
                if (type != null) {
                    C18450wi.A0B(type);
                    return new C25401Jq(A0Z, type);
                }
            }
            type = C17970vw.A0J(C17970vw.A0I(uri));
            C18450wi.A0B(type);
            return new C25401Jq(A0Z, type);
        } catch (IOException e2) {
            Log.e("LoadMediaFileAsyncTask/doInBackground failed to get file from uri", e2);
            return new C25401Jq((Object) null, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C25401Jq r4 = (C25401Jq) obj;
        C18450wi.A0H(r4, 0);
        C49322Sk r2 = (C49322Sk) this.A01.get();
        if (r2 != null) {
            r2.ATN((File) r4.first, (String) r4.second);
        }
    }
}
