package top.oply.opuslib;

import java.io.Serializable;

/* compiled from: XFMFile */
public class Utils$AudioTime implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public int f138a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f139b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f140c = 0;

    public Utils$AudioTime() {
    }

    public Utils$AudioTime(long j2) {
        setTimeInSecond(j2);
    }

    public void add(int i2) {
        int i3 = this.f140c + i2;
        this.f140c = i3;
        if (i3 >= 60) {
            this.f140c = i3 % 60;
            int i4 = this.f139b + 1;
            this.f139b = i4;
            if (i4 >= 60) {
                this.f139b = i4 % 60;
                this.f138a++;
            }
        }
    }

    public String getTime() {
        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf(this.f138a), Integer.valueOf(this.f139b), Integer.valueOf(this.f140c)});
    }

    public void setTimeInSecond(long j2) {
        this.f140c = (int) (j2 % 60);
        long j3 = j2 / 60;
        this.f139b = (int) (j3 % 60);
        this.f138a = (int) (j3 / 60);
    }
}
