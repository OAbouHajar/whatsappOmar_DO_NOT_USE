package r;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.Util;
import okio.BufferedSource;

/* compiled from: XFMFile */
public final class o extends Reader {

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSource f2448a;

    /* renamed from: b  reason: collision with root package name */
    public final Charset f2449b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2450c;

    /* renamed from: d  reason: collision with root package name */
    public InputStreamReader f2451d;

    public o(BufferedSource bufferedSource, Charset charset) {
        this.f2448a = bufferedSource;
        this.f2449b = charset;
    }

    public final void close() {
        this.f2450c = true;
        InputStreamReader inputStreamReader = this.f2451d;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.f2448a.close();
        }
    }

    public final int read(char[] cArr, int i2, int i3) {
        if (!this.f2450c) {
            InputStreamReader inputStreamReader = this.f2451d;
            if (inputStreamReader == null) {
                BufferedSource bufferedSource = this.f2448a;
                InputStreamReader inputStreamReader2 = new InputStreamReader(bufferedSource.inputStream(), Util.bomAwareCharset(bufferedSource, this.f2449b));
                this.f2451d = inputStreamReader2;
                inputStreamReader = inputStreamReader2;
            }
            return inputStreamReader.read(cArr, i2, i3);
        }
        throw new IOException("Stream closed");
    }
}
