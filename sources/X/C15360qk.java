package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.0qk  reason: invalid class name and case insensitive filesystem */
public class C15360qk {
    public static C15360qk A03;
    public String A00;
    public final Context A01;
    public final File A02;

    public C15360qk(Context context) {
        this.A01 = context.getApplicationContext();
        this.A02 = A00(context);
    }

    public static File A00(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && !TextUtils.isEmpty(applicationInfo.dataDir)) {
            return new File(applicationInfo.dataDir);
        }
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getParentFile();
        }
        throw new IllegalStateException("Path Factory initialised without a valid path");
    }

    public File A01(Pair pair) {
        File file;
        switch (((Number) pair.first).intValue()) {
            case -1:
                throw new IllegalStateException("Invalid source path");
            case 0:
            case 1:
                file = this.A02;
                break;
            case 2:
                file = this.A01.getFilesDir();
                break;
            case 3:
                file = this.A01.getCacheDir();
                break;
            case 4:
                file = this.A01.getExternalFilesDir((String) null);
                break;
            case 5:
                file = this.A01.getExternalCacheDir();
                break;
            default:
                throw new IllegalArgumentException("Cask path factory cannot handle this location");
        }
        if (file == null) {
            String str = this.A00;
            if (str == null) {
                str = UUID.randomUUID().toString();
            }
            this.A00 = str;
            File file2 = this.A02;
            StringBuilder sb = new StringBuilder("cache/tmp_invalid_path/");
            sb.append(str);
            file = new File(file2, sb.toString());
        }
        int intValue = ((Number) pair.first).intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                File file3 = this.A02;
                StringBuilder sb2 = new StringBuilder("app_");
                sb2.append((String) pair.second);
                return new File(file3, sb2.toString());
            } else if (!(intValue == 2 || intValue == 3 || intValue == 4 || intValue == 5)) {
                StringBuilder sb3 = new StringBuilder("Cask path factory cannot handle this location = ");
                sb3.append((String) pair.second);
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        return new File(file, (String) pair.second);
    }

    public Set A02(int i2) {
        int i3;
        String str;
        int length;
        Map map;
        switch (i2) {
            case 100:
            case 104:
            case 110:
                i3 = 2;
                break;
            case 102:
                i3 = 1;
                break;
            case 111:
                i3 = 5;
                break;
            default:
                i3 = 3;
                break;
        }
        Integer valueOf = Integer.valueOf(i3);
        switch (i2) {
            case 100:
                str = "cask_testing__config_basic_files";
                break;
            case 101:
                str = "cask_testing__config_basic_caches";
                break;
            case 102:
                str = "cask_testing__config_basic_root";
                break;
            case 103:
                str = "cask_testing__config_version_cache";
                break;
            case 104:
                str = "cask_testing__config_version_files_with_default";
                break;
            case 105:
                str = "wa_stash_example";
                break;
            case 106:
                str = "wa_effect_asset_disk_cache";
                break;
            case 107:
                str = "wa_face_tracking_asset_disk_cache";
                break;
            case AnonymousClass2EA.A03 /*108*/:
                str = "wa_multi_model_asset_disk_cache";
                break;
            case 109:
                str = "wa_scripting_asset_disk_cache";
                break;
            case 110:
                str = "wa_cask_ard_temp_store";
                break;
            default:
                str = "gif/gif_preview_cache";
                break;
        }
        File A012 = A01(new Pair(valueOf, str));
        if (!A012.isDirectory()) {
            map = Collections.emptyMap();
        } else {
            String str2 = (i2 == 103 || i2 == 104) ? "__version__" : null;
            if (TextUtils.isEmpty(str2)) {
                map = Collections.singletonMap(A012, (Object) null);
            } else {
                String[] split = str2.split("/");
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap.put(A012, (Object) null);
                for (String equals : split) {
                    boolean equals2 = equals.equals((Object) null);
                    for (Map.Entry entry : hashMap.entrySet()) {
                        File[] listFiles = ((File) entry.getKey()).listFiles();
                        if (listFiles != null && (length = listFiles.length) != 0) {
                            int i4 = 0;
                            do {
                                File file = listFiles[i4];
                                if (file.isDirectory()) {
                                    hashMap2.put(file, equals2 ? file.getName() : entry.getValue());
                                }
                                i4++;
                            } while (i4 < length);
                        }
                    }
                    hashMap.clear();
                    hashMap.putAll(hashMap2);
                    hashMap2.clear();
                }
                map = hashMap;
            }
        }
        return map.keySet();
    }
}
