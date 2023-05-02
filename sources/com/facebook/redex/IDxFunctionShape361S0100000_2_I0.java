package com.facebook.redex;

import X.AnonymousClass1XI;
import X.C108455Ob;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class IDxFunctionShape361S0100000_2_I0 implements C108455Ob {
    public Object A00;
    public final int A01;

    public IDxFunctionShape361S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final Object apply(Object obj) {
        switch (this.A01) {
            case 0:
                File file = (File) this.A00;
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    File A05 = AnonymousClass1XI.A05(file.getCanonicalPath(), str);
                    File parentFile = A05.getParentFile();
                    if (parentFile != null && !parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    return A05;
                } catch (IOException e2) {
                    Log.e("backup-export-storage/restore-with-uri/restore-multi-file-backup/failed/", e2);
                    return null;
                }
            case 1:
                File file2 = (File) this.A00;
                String str2 = (String) obj;
                if (TextUtils.isEmpty(str2)) {
                    return null;
                }
                try {
                    return AnonymousClass1XI.A05(file2.getCanonicalPath(), str2);
                } catch (IOException unused) {
                    return null;
                }
            default:
                File file3 = (File) ((Map) this.A00).get(obj);
                if (file3 == null) {
                    return null;
                }
                File parentFile2 = file3.getParentFile();
                if (parentFile2 == null || parentFile2.exists()) {
                    return file3;
                }
                parentFile2.mkdirs();
                return file3;
        }
    }
}
