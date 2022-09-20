package com.java.training.d01.generics;

import com.java.training.model.Product;

public interface Converter<Input, Output extends Product> {

    Output convertFromInput(Input input);

    Input convertFromOutput(Output output);
}
