package e;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.obwhatsapp.yo.d0;
import com.obwhatsapp.yo.f1;
import com.obwhatsapp.youbasha.task.YTranslate;
import com.squareup.picasso.Cache;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import okhttp3.Authenticator;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.CookieJar;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.io.FileSystem;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* compiled from: XFMFile */
public final class j implements Cache, Picasso.RequestTransformer, Callback, Authenticator, CookieJar, Dns, PushObserver, FileSystem {
    public final Sink appendingSink(File file) {
        try {
            return Okio.appendingSink(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return Okio.appendingSink(file);
        }
    }

    public final Request authenticate(Route route, Response response) {
        return null;
    }

    public final void clear() {
    }

    public final void clearKeyUri(String str) {
    }

    public final void delete(File file) {
        if (!file.delete() && file.exists()) {
            throw new IOException("failed to delete " + file);
        }
    }

    public final void deleteContents(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i2 = 0;
            while (i2 < length) {
                File file2 = listFiles[i2];
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                if (file2.delete()) {
                    i2++;
                } else {
                    throw new IOException("failed to delete " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    public final boolean exists(File file) {
        return file.exists();
    }

    public final Bitmap get(String str) {
        return null;
    }

    public final List loadForRequest(HttpUrl httpUrl) {
        return Collections.emptyList();
    }

    public final List lookup(String str) {
        if (str != null) {
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e2) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                unknownHostException.initCause(e2);
                throw unknownHostException;
            }
        } else {
            throw new UnknownHostException("hostname == null");
        }
    }

    public final int maxSize() {
        return 0;
    }

    public final boolean onData(int i2, BufferedSource bufferedSource, int i3, boolean z2) {
        bufferedSource.skip((long) i3);
        return true;
    }

    public final void onFailure(Call call, IOException iOException) {
        ((Activity) YTranslate.f1100a.get()).runOnUiThread(new d0(7));
    }

    public final boolean onHeaders(int i2, List list, boolean z2) {
        return true;
    }

    public final boolean onRequest(int i2, List list) {
        return true;
    }

    public final void onReset(int i2, ErrorCode errorCode) {
    }

    public final void onResponse(Call call, Response response) {
        if (response.isSuccessful()) {
            String string = response.body().string();
            if (string == null || string.isEmpty()) {
                throw null;
            }
            JsonElement parseString = JsonParser.parseString(string);
            if (parseString.isJsonObject() && !parseString.isJsonNull()) {
                ((Activity) YTranslate.f1100a.get()).runOnUiThread(new f1(1, parseString.getAsJsonObject().get("text").getAsString()));
            }
        }
    }

    public final void rename(File file, File file2) {
        delete(file2);
        if (!file.renameTo(file2)) {
            throw new IOException("failed to rename " + file + " to " + file2);
        }
    }

    public final void saveFromResponse(HttpUrl httpUrl, List list) {
    }

    public final void set(String str, Bitmap bitmap) {
    }

    public final Sink sink(File file) {
        try {
            return Okio.sink(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return Okio.sink(file);
        }
    }

    public final int size() {
        return 0;
    }

    public final long size(File file) {
        return file.length();
    }

    public final Source source(File file) {
        return Okio.source(file);
    }

    public final com.squareup.picasso.Request transformRequest(com.squareup.picasso.Request request) {
        return request;
    }
}
