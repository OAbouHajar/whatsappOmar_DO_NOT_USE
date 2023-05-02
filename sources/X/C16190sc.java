package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.UserManager;
import com.facebook.redex.IDxProviderShape156S0100000_2_I0;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0sc  reason: invalid class name and case insensitive filesystem */
public class C16190sc {
    public final C16980tz A00;
    public final C16260sj A01;
    public final C15860rz A02;
    public final AnonymousClass01D A03 = new AnonymousClass01T((Object) null, new IDxProviderShape156S0100000_2_I0(this, 19));

    public C16190sc(C16980tz r4, C16260sj r5, C15860rz r6) {
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = r5;
    }

    public static /* synthetic */ File A00(C16190sc r8) {
        String str;
        File file = new File(Environment.getExternalStorageDirectory(), "OBWhatsApp");
        if (A01()) {
            String string = ((SharedPreferences) r8.A02.A01.get()).getString("external_storage_type", (String) null);
            StringBuilder sb = new StringBuilder("externaldir/saved storage is ");
            sb.append(string);
            Log.i(sb.toString());
            File A05 = r8.A05();
            if (A05 == null) {
                Log.w("externaldir/scoped dir is supported, but isn't provided by the system");
                return file;
            }
            if (!"scoped".equals(string)) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30 && !C33781j9.A00()) {
                    str = "externaldir/switching to scoped since os disabled legacy storage";
                } else if (r8.A01.A0B() && !file.exists()) {
                    str = "externaldir/no legacy root so switching to scoped";
                } else if (i2 >= 30 && string == null) {
                    str = "externaldir/it is a new installation so switching to scoped";
                }
                Log.w(str);
                r8.A09("scoped");
            }
            return A05;
        }
        r8.A09("legacy");
        return file;
    }

    public static boolean A01() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            return !UserManager.supportsMultipleUsers() || Build.VERSION.PREVIEW_SDK_INT > 0 || i2 >= 30;
        }
        return false;
    }

    public File A02() {
        return new File((File) this.A03.get(), "Backups");
    }

    public File A03() {
        return new File((File) this.A03.get(), "Databases");
    }

    public File A04() {
        return new File((File) this.A03.get(), "Media");
    }

    public File A05() {
        File[] externalMediaDirs;
        File file;
        if (!A01() || (externalMediaDirs = this.A00.A00.getExternalMediaDirs()) == null || externalMediaDirs.length <= 0 || (file = externalMediaDirs[0]) == null) {
            return null;
        }
        return new File(file, "OBWhatsApp");
    }

    public File A06(File file) {
        String substring;
        if (file == null) {
            return null;
        }
        if (!file.isAbsolute()) {
            substring = file.getPath();
        } else {
            int indexOf = file.getAbsolutePath().indexOf("Media/OBWhatsApp ");
            if (A0B(file) || indexOf <= 0) {
                return file;
            }
            substring = file.getAbsolutePath().substring(indexOf);
        }
        return A07(substring);
    }

    public File A07(String str) {
        return new File((File) this.A03.get(), str);
    }

    public String A08(File file) {
        if (!file.isAbsolute()) {
            return file.getPath();
        }
        String absolutePath = file.getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        sb.append(((File) this.A03.get()).getAbsolutePath());
        sb.append("/");
        return absolutePath.replace(sb.toString(), "");
    }

    public void A09(String str) {
        this.A02.A0K().putString("external_storage_type", str).commit();
    }

    public boolean A0A() {
        return "scoped".equals(((SharedPreferences) this.A02.A01.get()).getString("external_storage_type", (String) null));
    }

    public boolean A0B(File file) {
        return file.getAbsolutePath().startsWith(((File) this.A03.get()).getAbsolutePath());
    }
}
