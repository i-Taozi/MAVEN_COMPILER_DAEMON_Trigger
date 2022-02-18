// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** A convex polygon. It is assumed that the interior of the polygon is to
 *  the left of each edge.
 *  Polygons have a maximum number of vertices equal to b2_maxPolygonVertices.
 *  In most cases you should not need many vertices for a convex polygon. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2PolygonShape extends b2Shape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2PolygonShape(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2PolygonShape(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public b2PolygonShape position(long position) {
        return (b2PolygonShape)super.position(position);
    }
    @Override public b2PolygonShape getPointer(long i) {
        return new b2PolygonShape((Pointer)this).offsetAddress(i);
    }

	public b2PolygonShape() { super((Pointer)null); allocate(); }
	private native void allocate();

	/** Implement b2Shape. */
	public native b2Shape Clone(b2BlockAllocator allocator);

	/** @see b2Shape::GetChildCount */
	public native @Cast("int32") int GetChildCount();

	/** Create a convex hull from the given array of local points.
	 *  The count must be in the range [3, b2_maxPolygonVertices].
	 *  \warning the points may be re-ordered, even if they form a convex polygon
	 *  \warning collinear points are handled but not removed. Collinear points
	 *  may lead to poor stacking behavior. */
	public native void Set(@Const b2Vec2 points, @Cast("int32") int count);

	/** Build vertices to represent an axis-aligned box centered on the local origin.
	 *  @param hx the half-width.
	 *  @param hy the half-height. */
	public native void SetAsBox(@Cast("float32") float hx, @Cast("float32") float hy);

	/** Build vertices to represent an oriented box.
	 *  @param hx the half-width.
	 *  @param hy the half-height.
	 *  @param center the center of the box in local coordinates.
	 *  @param angle the rotation of the box in local coordinates. */
	public native void SetAsBox(@Cast("float32") float hx, @Cast("float32") float hy, @Const @ByRef b2Vec2 center, @Cast("float32") float angle);

	/** @see b2Shape::TestPoint */
	public native @Cast("bool") boolean TestPoint(@Const @ByRef b2Transform transform, @Const @ByRef b2Vec2 p);

	// @see b2Shape::ComputeDistance
	public native void ComputeDistance(@Const @ByRef b2Transform xf, @Const @ByRef b2Vec2 p, @Cast("float32*") FloatPointer distance, b2Vec2 normal, @Cast("int32") int childIndex);
	public native void ComputeDistance(@Const @ByRef b2Transform xf, @Const @ByRef b2Vec2 p, @Cast("float32*") FloatBuffer distance, b2Vec2 normal, @Cast("int32") int childIndex);
	public native void ComputeDistance(@Const @ByRef b2Transform xf, @Const @ByRef b2Vec2 p, @Cast("float32*") float[] distance, b2Vec2 normal, @Cast("int32") int childIndex);

	/** Implement b2Shape. */
	public native @Cast("bool") boolean RayCast(b2RayCastOutput output, @Const @ByRef b2RayCastInput input,
						@Const @ByRef b2Transform transform, @Cast("int32") int childIndex);

	/** @see b2Shape::ComputeAABB */
	public native void ComputeAABB(b2AABB aabb, @Const @ByRef b2Transform transform, @Cast("int32") int childIndex);

	/** @see b2Shape::ComputeMass */
	public native void ComputeMass(b2MassData massData, @Cast("float32") float density);

	/** Get the vertex count. */
	public native @Cast("int32") int GetVertexCount();

	/** Get a vertex by index. */
	public native @Const @ByRef b2Vec2 GetVertex(@Cast("int32") int index);

	/** Validate convexity. This is a very time consuming operation.
	 *  @return true if valid */
	public native @Cast("bool") boolean Validate();
	/** Set centroid with direct floats. */
	public native void SetCentroid(@Cast("float32") float x, @Cast("float32") float y);

	/** SetAsBox with direct floats for center.
	 *  @see b2Shape::SetAsBox */
	public native void SetAsBox(@Cast("float32") float hx,
									@Cast("float32") float hy,
									@Cast("float32") float centerX,
									@Cast("float32") float centerY,
									@Cast("float32") float angle);
// #endif // LIQUIDFUN_EXTERNAL_LANGUAGE_API

	public native @ByRef b2Vec2 m_centroid(); public native b2PolygonShape m_centroid(b2Vec2 setter);
	public native @ByRef b2Vec2 m_vertices(int i); public native b2PolygonShape m_vertices(int i, b2Vec2 setter);
	@MemberGetter public native b2Vec2 m_vertices();
	public native @ByRef b2Vec2 m_normals(int i); public native b2PolygonShape m_normals(int i, b2Vec2 setter);
	@MemberGetter public native b2Vec2 m_normals();
	public native @Cast("int32") int m_count(); public native b2PolygonShape m_count(int setter);
}
