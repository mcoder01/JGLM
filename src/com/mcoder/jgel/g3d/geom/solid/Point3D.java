package com.mcoder.jgel.g3d.geom.solid;

import com.mcoder.jgel.scene.Screen;
import com.mcoder.jgel.math.Vector;

public class Point3D extends Vector {
    public Point3D(double x, double y, double z) {
        super(x, y, z);
    }

    public Point3D() {
        super();
    }

    public Point3D(Vector v) {
        this(v.getX(), v.getY(), v.getZ());
    }

    public Vector project() {
        double fov = Screen.getInstance().getHeight();
        double x = this.x/Math.abs(z)*fov+Screen.getInstance().getWidth()/2.0;
        double y = -this.y/Math.abs(z)*fov+Screen.getInstance().getHeight()/2.0;
        return new Vector(x, y, z);
    }

    @Override
    public Point3D copy() {
        return new Point3D(x, y, z);
    }
}