package X;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* renamed from: X.4v2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100064v2 implements C108455Ob {
    public final /* synthetic */ File A00;
    public final /* synthetic */ File A01;

    public /* synthetic */ C100064v2(File file, File file2) {
        this.A00 = file;
        this.A01 = file2;
    }

    public final Object apply(Object obj) {
        File file = this.A00;
        File file2 = this.A01;
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            if (file.getName().equals(str)) {
                return file;
            }
            try {
                return AnonymousClass1XI.A05(file2.getCanonicalPath(), str);
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
