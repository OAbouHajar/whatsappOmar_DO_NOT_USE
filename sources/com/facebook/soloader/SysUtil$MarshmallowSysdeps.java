package com.facebook.soloader;

import X.C796340p;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class SysUtil$MarshmallowSysdeps {
    public static boolean A00(Context context, int i2) {
        boolean z2;
        if (i2 == 2) {
            ZipFile zipFile = new ZipFile(new File(context.getApplicationInfo().sourceDir));
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (true) {
                    z2 = false;
                    if (!entries.hasMoreElements()) {
                        break;
                    }
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    if (zipEntry != null && zipEntry.getName().endsWith(".so") && zipEntry.getName().contains("/lib")) {
                        if (zipEntry.getMethod() == 0) {
                            z2 = true;
                        }
                    }
                }
                zipFile.close();
            } catch (Throwable unused) {
            }
        } else if (context == null) {
            return false;
        } else {
            z2 = true;
            if ((context.getApplicationInfo().flags & 268435456) != 0) {
                return false;
            }
        }
        return z2;
        throw th;
    }

    public static String[] getSupportedAbis() {
        C796340p r0;
        String[] strArr = Build.SUPPORTED_ABIS;
        TreeSet treeSet = new TreeSet();
        if (Process.is64Bit()) {
            treeSet.add(C796340p.AARCH64.toString());
            r0 = C796340p.X86_64;
        } else {
            treeSet.add(C796340p.ARM.toString());
            r0 = C796340p.X86;
        }
        treeSet.add(r0.toString());
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (treeSet.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean is64Bit() {
        return Process.is64Bit();
    }
}
