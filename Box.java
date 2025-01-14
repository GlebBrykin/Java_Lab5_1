public class Box<T>
{
    private T field;
    public Box()
    {
        this.field = null;
    }
    public void box(T value)
    {
        this.field = value;
    }
    public T unbox()
    {
        return this.field;
    }
    public boolean isEmpty()
    {
        return this.field == null;
    }
}
