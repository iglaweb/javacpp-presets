// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Allocator;
import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


        // Describes a tensor that is an input to an op, directly or indirectly via a tuple
        @Namespace("ngraph::descriptor") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Input extends Pointer {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public Input(Pointer p) { super(p); }
        
            /** @param node The node that owns this input
             *  @param index The position of this this tensor in all input tensors
             *  @param output The output that supplies a value for this input */
            public Input(Node node, @Cast("size_t") long index, @ByRef Output output) { super((Pointer)null); allocate(node, index, output); }
            private native void allocate(Node node, @Cast("size_t") long index, @ByRef Output output);
            /** \brief Create an Input that is not connected to an output
             *  @param node The node that owns this input
             *  @param index The position of this this tensor in all input tensors */
            public Input(Node node, @Cast("size_t") long index) { super((Pointer)null); allocate(node, index); }
            private native void allocate(Node node, @Cast("size_t") long index);

            /** @return the node that this is an input of */
            public native @SharedPtr @ByVal Node get_node();

            /** @return the raw pointer to the node that this is an input of */
            public native Node get_raw_pointer_node();
            /** @return the position within all supplied tensors of this input */
            public native @Cast("size_t") long get_index();
            /** @return the connected output */
            /** @return the connected output */
            public native @ByRef Output get_output();
            /** @return true if an output is connected to the input. */
            public native @Cast("bool") boolean has_output();
            /** @return the tensor of the connected output */

            /** @return the tensor of the connected output */
            public native @ByRef DescriptorTensor get_tensor();

            /** \brief Replace the current output that supplies a value for this input with output i
             *         of node */
            public native void replace_output(@SharedPtr @ByVal Node node, @Cast("size_t") long i);
            /** \brief Replace the current output that supplies a value for this input with output */
            public native void replace_output(@ByRef Output output);
            /** \brief Remove the output from this input. The node will not be valid until another
             *         output is supplied. */
            
            ///
            public native void remove_output();

            /** @return true if the value of this input is relevant to the output shapes of the
             *          corresponding node. (Usually this is false.)
             * 
             *  See Node::set_input_is_relevant_to_shape for more details. */
            
            ///
            public native @Cast("bool") boolean get_is_relevant_to_shape();
            /** @return true if the value of this input is relevant to the output value of the
             *          corresponding node. (Usually this is true.)
             * 
             *  See Node::set_input_is_relevant_to_value for more details. */
            public native @Cast("bool") boolean get_is_relevant_to_value();
            /** @return the shape of the connected output */
            public native @Const @ByRef Shape get_shape();

            /** @return the partial shape of the connected output */
            public native @Const @ByRef PartialShape get_partial_shape();

            /** @return the element type of the connected output */
            public native @Const @ByRef Type get_element_type();
        }
