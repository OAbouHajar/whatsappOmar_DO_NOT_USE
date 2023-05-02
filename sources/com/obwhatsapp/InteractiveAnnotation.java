package com.obwhatsapp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InteractiveAnnotation implements Serializable {
    public static final long serialVersionUID = -3211751283609597L;
    public SerializablePoint[] polygonVertices;
    public SerializableLocation serializableLocation;

    public InteractiveAnnotation(SerializableLocation serializableLocation2, SerializablePoint[] serializablePointArr) {
        this.polygonVertices = serializablePointArr;
        this.serializableLocation = serializableLocation2;
    }

    public InteractiveAnnotation(String str, SerializablePoint[] serializablePointArr, double d2, double d3) {
        this.polygonVertices = serializablePointArr;
        this.serializableLocation = new SerializableLocation(str, d2, d3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.polygonVertices = (SerializablePoint[]) objectInputStream.readObject();
        this.serializableLocation = (SerializableLocation) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.polygonVertices);
        objectOutputStream.writeObject(this.serializableLocation);
    }
}
