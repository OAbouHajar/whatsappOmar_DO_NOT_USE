package X;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: X.1pk  reason: invalid class name and case insensitive filesystem */
public class C37791pk implements C37801pl {
    public final Boolean A00;
    public final HttpURLConnection A01;

    public C37791pk(Boolean bool, HttpURLConnection httpURLConnection) {
        this.A01 = httpURLConnection;
        this.A00 = bool;
    }

    public int A6O() {
        return this.A01.getResponseCode();
    }

    public InputStream A9j(C17130ua r3, Integer num, Integer num2) {
        return new C38271qW(r3, this.A01.getErrorStream(), num, num2);
    }

    public InputStream A9k(C17130ua r3, Integer num, Integer num2) {
        return new C38271qW(r3, this.A01.getInputStream(), num, num2);
    }

    public String AAv() {
        return this.A01.getContentEncoding();
    }

    public URL AGi() {
        return this.A01.getURL();
    }

    public String AHk(String str) {
        return this.A01.getHeaderField(str);
    }

    public void close() {
        this.A01.disconnect();
    }

    public long getContentLength() {
        return (long) this.A01.getContentLength();
    }
}
