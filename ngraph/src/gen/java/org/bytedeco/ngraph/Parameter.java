// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

        /** \brief A function parameter.
         * 
         *  Parameters are nodes that represent the arguments that will be passed to user-defined
         *  functions. Function creation requires a sequence of parameters. Basic graph operations
         *  do not need parameters attached to a function. */
        @Namespace("ngraph::op") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Parameter extends Op {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public Parameter(Pointer p) { super(p); }
            /** Native array allocator. Access with {@link Pointer#position(long)}. */
            public Parameter(long size) { super((Pointer)null); allocateArray(size); }
            private native void allocateArray(long size);
            @Override public Parameter position(long position) {
                return (Parameter)super.position(position);
            }
        
            @MemberGetter public static native @StdString BytePointer type_name();
            public native @StdString BytePointer description();
            /** \brief Constructions a tensor-typed parameter node. */
            
            ///
            public Parameter() { super((Pointer)null); allocate(); }
            private native void allocate();
            /** \brief Constructions a tensor-typed parameter node.
             * 
             *  @param element_type The element type of the parameter.
             *  @param pshape The partial shape of the parameter.
             *  @param cacheable True if the parameter is not expected to be frequently updated. */
            public Parameter(@Const @ByRef Type element_type,
                                  @Const @ByRef PartialShape pshape,
                                  @Cast("const bool") boolean cacheable/*=false*/) { super((Pointer)null); allocate(element_type, pshape, cacheable); }
            private native void allocate(@Const @ByRef Type element_type,
                                  @Const @ByRef PartialShape pshape,
                                  @Cast("const bool") boolean cacheable/*=false*/);
            public Parameter(@Const @ByRef Type element_type,
                                  @Const @ByRef PartialShape pshape) { super((Pointer)null); allocate(element_type, pshape); }
            private native void allocate(@Const @ByRef Type element_type,
                                  @Const @ByRef PartialShape pshape);

            public native void validate_and_infer_types();

            public native @Cast("bool") boolean get_cacheable();
            public native @SharedPtr @ByVal Node copy_with_new_args(@Const @ByRef NodeVector new_args);

            public native @Cast("bool") boolean is_relevant_to_shapes();
            public native void set_is_relevant_to_shapes(@Cast("bool") boolean is_relevant);
            public native @ByRef PartialShape get_partial_shape();
            public native void set_partial_shape(@Const @ByRef PartialShape partial_shape);

            public native @Const @ByRef Type get_element_type();
            public native void set_element_type(@Const @ByRef Type element_type);
        }
