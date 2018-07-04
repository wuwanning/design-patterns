package cn.mikufans.create.builder;

public abstract class Builder {

	protected abstract void buildPartA();
    protected abstract void buildPartB();
    protected abstract void buildPartC();

    protected abstract Product getResult();
}
