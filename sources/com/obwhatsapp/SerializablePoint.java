package com.obwhatsapp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializablePoint implements Serializable {
    public static final long serialVersionUID = -3211751283609599L;

    /* renamed from: x  reason: collision with root package name */
    public double f147x;

    /* renamed from: y  reason: collision with root package name */
    public double f148y;

    public SerializablePoint(double d2, double d3) {
        this.f147x = d2;
        this.f148y = d3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.f147x = objectInputStream.readDouble();
        this.f148y = objectInputStream.readDouble();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeDouble(this.f147x);
        objectOutputStream.writeDouble(this.f148y);
    }
}
