package com.inetum.java.mentoring;

public abstract class AbstractProductConverter<Input, Output> {

    public abstract Output convertInput(Input input);

    public abstract Input convertOutput(Output output);
}
